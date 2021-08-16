package intetics.project.demo.rest;

import intetics.project.demo.service.TravellerService;
import intetics.project.demo.model.Traveller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/travellers/")
public class TravellerRestController {

    @Autowired
    private TravellerService travellerService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Traveller> getTraveller(@PathVariable("id") Long customerId) {
        if (customerId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Traveller traveller = this.travellerService.getById(customerId);

        if (traveller == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(traveller, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Traveller> saveTraveller(@RequestBody @Valid Traveller traveller) {
        HttpHeaders headers = new HttpHeaders();

        if (traveller == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.travellerService.save(traveller);
        return new ResponseEntity<>(traveller, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Traveller> updateTraveller(@RequestBody @Valid Traveller traveller, UriComponentsBuilder builder) {
        HttpHeaders headers = new HttpHeaders();

        if (traveller == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.travellerService.save(traveller);

        return new ResponseEntity<>(traveller, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Traveller> deleteTraveller(@PathVariable("id") Long id) {
        Traveller traveller = this.travellerService.getById(id);

        if (traveller == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.travellerService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Traveller>> getAllTravellers() {
        List<Traveller> travellers = this.travellerService.getAll();

        if (travellers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(travellers, HttpStatus.OK);
    }
}
