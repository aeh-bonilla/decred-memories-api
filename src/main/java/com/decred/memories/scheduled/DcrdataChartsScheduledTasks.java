package com.decred.memories.scheduled;

import java.util.List;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import com.decred.memories.payload.response.DecredMemoriesPriceResponse;
import com.decred.memories.repository.EventRepository;
import com.decred.memories.repository.TicketPriceRepository;
import com.decred.memories.service.DcrdataChartService;
import com.decred.memories.util.IdGenerator;
import com.decred.memories.vo.TicketPrice;
import com.decred.memories.vo.Event;

public class DcrdataChartsScheduledTasks {

	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private DcrdataChartService dcrdataChartService;
	
	@Autowired
	private TicketPriceRepository ticketPriceRepository;
	
	public void updateTicketPrices() {
		
		List<DecredMemoriesPriceResponse> ticketPriceResponseList = this.dcrdataChartService.getTicketPrices();
		
		if(ticketPriceResponseList!=null && 
				!ticketPriceResponseList.isEmpty()) {
			
			for(DecredMemoriesPriceResponse ticketPriceResponse : ticketPriceResponseList) {
			
				List<TicketPrice> ticketPriceList = this.ticketPriceRepository.findByPriceDateInSeconds(ticketPriceResponse.getTimeInSeconds());
				
				if(ticketPriceList == null ||
						ticketPriceList.isEmpty()) {
				
				   Date ticketPriceDate = new Date(ticketPriceResponse.getTimeInSeconds() * 1000);
				   Event event = this.eventRepository.findByEventDate(ticketPriceDate);	
				   
				   if(event != null) {
					   
					   TicketPrice ticketPrice = new TicketPrice();  
					   
					   ticketPrice.setEvent(event);
					   ticketPrice.setId(IdGenerator.nextId());
					   ticketPrice.setTickets(ticketPriceResponse.getBuyedTickets());
					   ticketPrice.setPrice(ticketPriceResponse.getTicketPrice());
					   ticketPrice.setPriceDateInSeconds(ticketPriceResponse.getTimeInSeconds() );
					   ticketPrice.setCreatedDate(new Date());
					   ticketPrice.setActive(1);
					   
					   this.ticketPriceRepository.save(ticketPrice);
				   }
				}
			}
			
		}
	}
}
