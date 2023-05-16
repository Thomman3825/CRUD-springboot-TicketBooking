package Services;

import Schema.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import Dao.TicketDao;
@Component
public class TicketServiceImplementation implements TicketService{
    @Autowired
    private TicketDao ticketDao;
    @Override
    public String bookTicket(List<Ticket> tickets) {
        ticketDao.saveAll(tickets);
        return "Ticket Booked" + tickets.size();


    }

    @Override
    public List<Ticket> getTicket() {
        return (List<Ticket>) ticketDao.findAll();
    }

    @Override
    public Optional<Ticket> getTicketWithId(int ticket_id) {
        return ticketDao.findById(ticket_id);
    }


}
