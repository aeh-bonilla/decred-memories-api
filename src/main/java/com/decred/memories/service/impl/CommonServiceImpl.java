package com.decred.memories.service.impl;

import java.util.Date;
import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.decred.memories.util.IdGenerator;
import com.decred.memories.vo.Event;
import com.decred.memories.repository.EventRepository;
import com.decred.memories.service.CommonService;
import java.util.Calendar;

@Service
public class CommonServiceImpl implements CommonService {
	
	
	@Autowired
	private EventRepository eventRepository;

	public Integer initializeDecredMemoriesEvents(Date startDate, Date endDate) {
	
		int k = 0;
		Integer totalEvents = null;
		boolean isEndDate = false;
		
		Calendar c = Calendar.getInstance();
		c.setTime(startDate);
				
		while(!isEndDate) {
			
			Date currentDate = new Date(c.getTimeInMillis());  
			
			if(currentDate.compareTo(endDate) <= 0) {
			
		      Event event = new Event();
				
		      event.setId(IdGenerator.nextId());
			  event.setEventDate(currentDate);			
			  event.setCreatedDate(new Date());
			  event.setActive(1);
				
			  this.eventRepository.save(event);
				
			}else {
			  isEndDate= true;
			}		
			
			c.add(Calendar.DATE, 1);
			
			k++;
		}
		
		return k;
	}
}
