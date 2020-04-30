package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.model.Information;
import io.swagger.service.InformationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T21:58:31.998Z")

@Controller
public class InformationApiController implements InformationApi {

    private InformationService informationService;

    private static final Logger log = LoggerFactory.getLogger(InformationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InformationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Information> addInformation(@ApiParam(value = "informations to be added to the seminar." ,required=true )  @Valid @RequestBody Information body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {

            return ResponseEntity.ok(informationService.addInformation(body));
        }
        return new ResponseEntity<Information>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Information> deletePost(@ApiParam(value = "Post id to delete",required=true) @PathVariable("InformationId") Long informationId, @ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return ResponseEntity.ok(informationService.deleteById(informationId));
        }
        return new ResponseEntity<Information>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Information> getinformationById(@ApiParam(value = "ID of post to return",required=true) @PathVariable("InformationId") Long informationId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {

            Information i = informationService.findById(informationId);

            if (i != null)
                return ResponseEntity.ok(i);
            else

                return ResponseEntity.notFound().header("Reason", "MMM").build();
        }
        if (accept != null && accept.contains("application/json")) {

            Information i = informationService.findById(informationId);
            if (i != null)
                return ResponseEntity.ok(i);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Information>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Information> updateInfo(@ApiParam(value = "informations that needs to be added to the Seminar" ,required=true )  @Valid @RequestBody Information body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {

            return ResponseEntity.ok(informationService.updateInformation(body));
        }

        if (accept != null && accept.contains("application/json")) {

            return ResponseEntity.ok(informationService.updateInformation(body));
        }

        return new ResponseEntity<Information>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePosttWithForm(@ApiParam(value = "ID of post that needs to be updated",required=true) @PathVariable("InformationId") Long informationId,@ApiParam(value = "Updated name of the information") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "Updated status of the information") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
