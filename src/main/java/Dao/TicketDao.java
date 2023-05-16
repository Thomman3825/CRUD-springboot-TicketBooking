package Dao;

import org.springframework.data.repository.CrudRepository;
import Schema.Ticket;
public interface TicketDao extends CrudRepository<Ticket, Integer> {
}
