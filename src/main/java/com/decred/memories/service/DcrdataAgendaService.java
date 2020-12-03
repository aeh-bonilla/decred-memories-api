
package com.decred.memories.service;

import java.util.List;
import java.text.ParseException;
import com.decred.memories.payload.response.DecredMemoriesAgendaResponse;

public interface DcrdataAgendaService {
	
	List<DecredMemoriesAgendaResponse> getAgendaByDate() throws ParseException;
}