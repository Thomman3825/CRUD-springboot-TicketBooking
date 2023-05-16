package Services;

import Schema.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {

String bookTicket(List<Ticket> Tickets);

List<Ticket>  getTicket();

Optional<Ticket> getTicketWithId(int ticket_id);
}
