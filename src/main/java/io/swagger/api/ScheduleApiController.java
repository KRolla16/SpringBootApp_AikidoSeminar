package io.swagger.api;

import io.swagger.model.Enroll;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T21:58:31.998Z")

@Controller
public class ScheduleApiController implements ScheduleApi {

    private static final Logger log = LoggerFactory.getLogger(ScheduleApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ScheduleApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteEnroll(@Min(1L)@ApiParam(value = "Activity ID to be removed",required=true) @PathVariable("enrollId") Long enrollId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Enroll> enrollToTraining(@ApiParam(value = "enroll in the available event" ,required=true )  @Valid @RequestBody Enroll body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Enroll>(objectMapper.readValue("<Enroll>  <id>123456789</id>  <eventId>123456789</eventId>  <numberOfSeats>123</numberOfSeats>  <status>aeiou</status>  <complete>true</complete></Enroll>", Enroll.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Enroll>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Enroll>(objectMapper.readValue("{  \"eventId\" : 6,  \"numberOfSeats\" : 1,  \"id\" : 0,  \"complete\" : false,  \"status\" : \"enrolled\"}", Enroll.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Enroll>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Enroll>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Enroll> getEnrollById(@Min(1L) @Max(10L) @ApiParam(value = "ID of classes that needs to be fetched",required=true) @PathVariable("enrollId") Long enrollId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Enroll>(objectMapper.readValue("<Enroll>  <id>123456789</id>  <eventId>123456789</eventId>  <numberOfSeats>123</numberOfSeats>  <status>aeiou</status>  <complete>true</complete></Enroll>", Enroll.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Enroll>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Enroll>(objectMapper.readValue("{  \"eventId\" : 6,  \"numberOfSeats\" : 1,  \"id\" : 0,  \"complete\" : false,  \"status\" : \"enrolled\"}", Enroll.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Enroll>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Enroll>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Map<String, Integer>> getEvent() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Map<String, Integer>>(objectMapper.readValue("{  \"key\" : 0}", Map.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Map<String, Integer>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Map<String, Integer>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
