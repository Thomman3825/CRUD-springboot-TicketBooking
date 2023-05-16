package Controllers;

import Schema.Ticket;
import Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;
    @PostMapping("/bookTicket")
    public String book(@RequestBody List<Ticket> tickets){
        return ticketService.bookTicket(tickets);
    }
    @GetMapping("/getTickets")
    public List<Ticket> getTickets(){
        return ticketService.getTicket();
    }

    @GetMapping("/getTicket")
    public Optional<Ticket> getTicketById(@RequestParam("ticket_id") Integer ticketId){
        return ticketService.getTicketWithId(ticketId);
    }
}
