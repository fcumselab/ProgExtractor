package fcu.selab.progextractor.project;

import fcu.selab.progextractor.service.StatusService;
import fcu.selab.progextractor.status.StatusEnum;

public class JavacAssignment extends ProjectTypeImp {

  @Override
  public ProjectTypeEnum getProjectType() {
    return ProjectTypeEnum.JAVAC;
  }

  @Override
  public StatusEnum checkStatusType(String console) {
    StatusEnum status;
    StatusService statusService = StatusService.getInstance();

    if (statusService.isBuildSuccess(console)) {
      status = StatusEnum.BUILD_SUCCESS;
    } else {
      status = StatusEnum.COMPILE_FAILURE;
    }
    return status;
  }
}
