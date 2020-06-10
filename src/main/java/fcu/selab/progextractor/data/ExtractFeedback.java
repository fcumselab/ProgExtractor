package fcu.selab.progextractor.data;

import java.util.ArrayList;

import fcu.selab.progextractor.project.AssignmentFactory;
import fcu.selab.progextractor.project.ProjectTypeImp;

public class ExtractFeedback {
  String assignmentType;
  String status;
  String console;

  public ExtractFeedback(String assignmentType, String status, String console) {
    this.assignmentType = assignmentType;
    this.status = status;
    this.console = console;
  }

  public String getFeedback() {
    ProjectTypeImp assignmentType = getAssignmentType(this.assignmentType);
    String statusType = this.status;
    String message = assignmentType.getStatus(statusType).extractFailureMsg(this.console);
    ArrayList feedBacks = assignmentType.getStatus(statusType).formatExamineMsg(message);
    String feedBackMessage = assignmentType.getStatus(statusType).tojsonArray(feedBacks);

    return feedBackMessage;
  }

  private ProjectTypeImp getAssignmentType(String assignmentType) {
    return AssignmentFactory.getAssignmentType(assignmentType);
  }
}