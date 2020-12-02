package com.decred.memories.service;

import java.text.ParseException;
import java.util.List;
import decred.memories.payload.response.DecredMemoriesAgendaResponse;

public interface DcrdataAgendaService {
	
	List<DecredMemoriesAgendaResponse> getAgendaByDate(String date) throws ParseException;
}
