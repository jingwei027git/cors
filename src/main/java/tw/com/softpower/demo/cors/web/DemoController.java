package tw.com.softpower.demo.cors.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tw.com.softpower.demo.cors.dto.Client;

@CrossOrigin(origins = "https://booking.attractionsuite.com", maxAge = 3600)
@RequestMapping("/client")
@RestController
public class DemoController {

    @GetMapping("/{id}")
    public ResponseEntity<Client> read(@PathVariable Long id) {
        final Client client = new Client();
        client.setName("eddie");
        client.setAge(39);

        return new ResponseEntity<>(client, HttpStatus.OK);
    }

}
