/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Enroll;
import java.util.Map;
import java.util.Optional;

import io.swagger.annotations.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;

import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T21:58:31.998Z")

@Api(value = "Schedule", description = "the Schedule API")
@RequestMapping(value = "")
public interface ScheduleApi {
    Logger log = LoggerFactory.getLogger(ScheduleApi.class);
    
    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }
 
    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }
 
    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }
    @ApiOperation(value = "Delete enrollment by ID", nickname = "deleteEnroll", notes = "For valid response try integer IDs with positive integer value.         Negative or non-integer values will generate API errors", tags={ "Schedule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Classes not found") })
    @RequestMapping(value = "/Schedule/enroll/{enrollId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteEnroll(@Min(1L)@ApiParam(value = "Activity ID to be removed",required=true) @PathVariable("enrollId") Long enrollId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ScheduleApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Registration for the event", nickname = "enrollToTraining", notes = "", response = Enroll.class, tags={ "Schedule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Enroll.class),
        @ApiResponse(code = 400, message = "Invalid Enrollment") })
    @RequestMapping(value = "/Schedule/enroll",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Enroll> enrollToTraining(@ApiParam(value = "enroll in the available event" ,required=true )  @Valid @RequestBody Enroll body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/xml")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("<Enroll>  <id>123456789</id>  <eventId>123456789</eventId>  <numberOfSeats>123</numberOfSeats>  <status>aeiou</status>  <complete>true</complete></Enroll>", Enroll.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/xml", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"eventId\" : 6,  \"numberOfSeats\" : 1,  \"id\" : 0,  \"complete\" : false,  \"status\" : \"enrolled\"}", Enroll.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ScheduleApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Find the classes you are enrolled in", nickname = "getEnrollById", notes = "For valid response try integer IDs with value >= 1 and <= 10.         Other values will generated exceptions", response = Enroll.class, tags={ "Schedule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Enroll.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Classes not found") })
    @RequestMapping(value = "/Schedule/enroll/{enrollId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Enroll> getEnrollById(@Min(1L) @Max(10L) @ApiParam(value = "ID of classes that needs to be fetched",required=true) @PathVariable("enrollId") Long enrollId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/xml")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("<Enroll>  <id>123456789</id>  <eventId>123456789</eventId>  <numberOfSeats>123</numberOfSeats>  <status>aeiou</status>  <complete>true</complete></Enroll>", Enroll.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/xml", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"eventId\" : 6,  \"numberOfSeats\" : 1,  \"id\" : 0,  \"complete\" : false,  \"status\" : \"enrolled\"}", Enroll.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ScheduleApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Returns the events by status", nickname = "getEvent", notes = "Returns the events that are recorded in the schedule", response = Integer.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Schedule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Map.class, responseContainer = "Map") })
    @RequestMapping(value = "/Schedule/listofevents",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Map<String, Integer>> getEvent() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"key\" : 0}", Map.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ScheduleApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}