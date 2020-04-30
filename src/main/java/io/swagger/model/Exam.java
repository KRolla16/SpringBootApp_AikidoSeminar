package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Exam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T21:58:31.998Z")

@Entity
@Table(name = "exams")
public class Exam   {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("id")
  private Long id = null;

  @Embedded
  @JsonProperty("category")
  private Category category = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;


  /**
   * Exam status
   */
  public enum StatusEnum {
    AVAILABLE("available"),

    NOT_AVAILABLE("not available");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("room")
  private String room = null;

  @JsonProperty("examinator")
  private String examinator = null;

  public Exam id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Exam category(Category category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Exam name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Exam 1", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Exam description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "The first added exam session by a Examinator added, which will take place on ... at the hour ...", required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }



  public Exam status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Exam status
   * @return status
  **/
  @ApiModelProperty(value = "Exam status")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Exam date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "15.03.2020  15:00", required = true, value = "")
  @NotNull

  @Valid

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Exam room(String room) {
    this.room = room;
    return this;
  }

  /**
   * Get room
   * @return room
  **/
  @ApiModelProperty(example = "Room 111", required = true, value = "")
  @NotNull


  public String getRoom() {
    return room;
  }

  public void setRoom(String room) {
    this.room = room;
  }

  public Exam examinator(String examinator) {
    this.examinator = examinator;
    return this;
  }

  /**
   * Get examinator
   * @return examinator
  **/
  @ApiModelProperty(example = "Kamila Rolla", required = true, value = "")
  @NotNull


  public String getExaminator() {
    return examinator;
  }

  public void setExaminator(String examinator) {
    this.examinator = examinator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exam exam = (Exam) o;
    return Objects.equals(this.id, exam.id) &&
        Objects.equals(this.category, exam.category) &&
        Objects.equals(this.name, exam.name) &&
        Objects.equals(this.description, exam.description) &&
        Objects.equals(this.status, exam.status) &&
        Objects.equals(this.date, exam.date) &&
        Objects.equals(this.room, exam.room) &&
        Objects.equals(this.examinator, exam.examinator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, name, description, status, date, room, examinator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exam {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    examinator: ").append(toIndentedString(examinator)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

