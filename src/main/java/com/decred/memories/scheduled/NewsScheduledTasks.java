package com.decred.memories.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;

import com.decred.memories.payload.response.NewsResponse;
import com.decred.memories.repository.EventRepository;
import com.decred.memories.repository.NewsRepository;
import com.decred.memories.service.impl.NewsServiceImpl;
import com.decred.memories.util.IdGenerator;
import com.decred.memories.vo.Event;
import com.decred.memories.vo.News;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NewsScheduledTasks {

	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private NewsServiceImpl newsServiceImpl;
	
	@Autowired
	private NewsRepository newsRepository;
	
	public void updateNews() {
		
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		ObjectMapper mapper = new ObjectMapper();
		
		Event event = this.eventRepository.findByEventDate(currentDate);
		
		NewsResponse newsResponse = this.newsServiceImpl.retrieveNewsByDatePeriod(sdf.format(currentDate), sdf.format(currentDate));
		
		if(newsResponse != null) {
			
			String content = null;
			News news = new News();
			
			news.setId(IdGenerator.nextId());
			news.setEvent(event);
			news.setCategoryId(1);
			news.setSourceId(1);
			news.setNewsDate(currentDate);
			
			try {
				content = mapper.writeValueAsString(newsResponse);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			news.setContent(content);
			news.setCreatedDate(new Date());
			news.setActive(1);
			
			this.newsRepository.save(news);
			
		}
	}
}
