package pl.epoint.dockerlab.yacht;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kamil Murawski
 */
@RestController
@RequestMapping("/yacht")
public class YachtController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Yacht> getYachts() {

        Yacht y = new Yacht();
        y.setLength(10);
        y.setName("Duch");
        y.setMaxCrew(7);
        return new ResponseEntity<Yacht>(y, HttpStatus.OK);
    }
}
