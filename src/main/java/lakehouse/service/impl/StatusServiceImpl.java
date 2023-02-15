package lakehouse.service.impl;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

import lakehouse.model.Status;
import lakehouse.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService {

	@Override
	public Status getStatus() {
		Status status = new Status();
		LocalDate date = LocalDate.now();
		
		// Is trash day?
		if (date.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
			status.setTrashDay(true);
		}
		
		// Is it a recycling week?
		if (Math.ceil(date.getDayOfYear() / 7) % 2 == 0) {
			status.setRecyclingWeek(true);
		}
		
		return status;
	}

}
