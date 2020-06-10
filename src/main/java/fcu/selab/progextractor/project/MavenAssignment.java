package fcu.selab.progextractor.project;

import fcu.selab.progextractor.service.StatusService;
import fcu.selab.progextractor.status.StatusEnum;

public class MavenAssignment extends ProjectTypeImp {

  @Override
  public ProjectTypeEnum getProjectType() {
    return ProjectTypeEnum.MAVEN;
  }

  @Override
  public StatusEnum checkStatusType(String console) {
    StatusEnum status;
    StatusService statusService = StatusService.getInstance();

    if (statusService.isBuildSuccess(console)) {
      status = StatusEnum.BUILD_SUCCESS;
    } else if (statusService.isMavenUnitTestFailure(console)) {
      status = StatusEnum.UNIT_TEST_FAILURE;
    } else if (statusService.isMavenCheckstyleFailure(console)) {
      status = StatusEnum.CHECKSTYLE_FAILURE;
    } else {
      status = StatusEnum.COMPILE_FAILURE;
    }
    return status;
  }

}
