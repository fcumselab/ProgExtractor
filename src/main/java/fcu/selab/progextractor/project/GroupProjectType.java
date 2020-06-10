package fcu.selab.progextractor.project;

import fcu.selab.progextractor.status.StatusEnum;

public abstract class GroupProjectType extends ProjectTypeImp {

  @Override
  public StatusEnum checkStatusType(String console) {
    ProjectTypeImp assignmentType = AssignmentFactory
        .getAssignmentType(getProjectType().getTypeName());
    return assignmentType.checkStatusType(console);
  }
}
