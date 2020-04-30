package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.model.Exam;
import io.swagger.model.ModelApiResponse;
import io.swagger.service.ExamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T21:58:31.998Z")

@Controller
public class ExamApiController implements ExamApi {

    private ExamService examService;

    private static final Logger log = LoggerFactory.getLogger(ExamApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ExamApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Exam> addExam(@ApiParam(value = "Exams to be added to the seminar." ,required=true )  @Valid @RequestBody Exam body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {

            return ResponseEntity.ok(examService.addExam(body));
        }
        return new ResponseEntity<Exam>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Exam> deleteExam(@ApiParam(value = "Exam id to delete",required=true) @PathVariable("ExamId") Long examId, @ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return ResponseEntity.ok(examService.deleteById(examId));
        }
        return new ResponseEntity<Exam>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Exam>> findeventsByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Exam>>(objectMapper.readValue("<Exam>  <id>123456789</id>  <name>Exam 1</name>  <description>The first added exam session by a Examinator added, which will take place on ... at the hour ...</description>  <photoUrls>    <photoUrls>aeiou</photoUrls>  </photoUrls>  <tags>  </tags>  <status>aeiou</status>  <date>15.03.2020  15:00</date>  <room>Room 111</room>  <examinator>Kamila Rolla</examinator></Exam>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Exam>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Exam>>(objectMapper.readValue("[ {  \"date\" : \"15.03.2020  15:00\",  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"examinator\" : \"Kamila Rolla\",  \"name\" : \"Exam 1\",  \"description\" : \"The first added exam session by a Examinator added, which will take place on ... at the hour ...\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"room\" : \"Room 111\",  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"}, {  \"date\" : \"15.03.2020  15:00\",  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"examinator\" : \"Kamila Rolla\",  \"name\" : \"Exam 1\",  \"description\" : \"The first added exam session by a Examinator added, which will take place on ... at the hour ...\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"room\" : \"Room 111\",  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Exam>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Exam>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Exam>> findeventsByTags(@NotNull @ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) List<String> tags) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Exam>>(objectMapper.readValue("<Exam>  <id>123456789</id>  <name>Exam 1</name>  <description>The first added exam session by a Examinator added, which will take place on ... at the hour ...</description>  <photoUrls>    <photoUrls>aeiou</photoUrls>  </photoUrls>  <tags>  </tags>  <status>aeiou</status>  <date>15.03.2020  15:00</date>  <room>Room 111</room>  <examinator>Kamila Rolla</examinator></Exam>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Exam>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Exam>>(objectMapper.readValue("[ {  \"date\" : \"15.03.2020  15:00\",  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"examinator\" : \"Kamila Rolla\",  \"name\" : \"Exam 1\",  \"description\" : \"The first added exam session by a Examinator added, which will take place on ... at the hour ...\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"room\" : \"Room 111\",  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"}, {  \"date\" : \"15.03.2020  15:00\",  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"examinator\" : \"Kamila Rolla\",  \"name\" : \"Exam 1\",  \"description\" : \"The first added exam session by a Examinator added, which will take place on ... at the hour ...\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"room\" : \"Room 111\",  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Exam>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Exam>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Exam> getExamById(@ApiParam(value = "ID of Exam to return",required=true) @PathVariable("ExamId") Long examId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {

            Exam ex = examService.findById(examId);

            if (ex != null)
                return ResponseEntity.ok(ex);
            else

                return ResponseEntity.notFound().header("Reason", "MMM").build();
        }
        if (accept != null && accept.contains("application/json")) {

            Exam ex = examService.findById(examId);
            if (ex != null)
                return ResponseEntity.ok(ex);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);


        }

        return new ResponseEntity<Exam>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Exam> updateExam(@ApiParam(value = "exams that needs to be added to the Seminar" ,required=true )  @Valid @RequestBody Exam body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {

            return ResponseEntity.ok(examService.updateEvent(body));
        }

        if (accept != null && accept.contains("application/json")) {

            return ResponseEntity.ok(examService.updateEvent(body));
        }

        return new ResponseEntity<Exam>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateExamWithForm(@ApiParam(value = "ID of Exam that needs to be updated",required=true) @PathVariable("ExamId") Long examId,@ApiParam(value = "Updated name of the Exam") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "Updated status of the Exam") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> uploadFile2(@ApiParam(value = "ID of Exam to update",required=true) @PathVariable("ExamId") Long examId,@ApiParam(value = "Additional data to pass to server") @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata,@ApiParam(value = "file to upload") @Valid @RequestPart(value="file", required=false) MultipartFile file) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : 0,  \"type\" : \"type\",  \"message\" : \"message\"}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
