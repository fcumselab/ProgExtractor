package fcu.selab.progextractor.project;

import fcu.selab.progextractor.service.StatusService;
import fcu.selab.progextractor.status.StatusEnum;

public class AndroidAssignment extends ProjectTypeImp {

  @Override
  public ProjectTypeEnum getProjectType() {
    return ProjectTypeEnum.ANDROID;
  }

  @Override
  public StatusEnum checkStatusType(String console) {
    StatusEnum status = null;
    StatusService statusService = StatusService.getInstance();

    if (statusService.isAndroidCompileFailure(console)) {
      status = StatusEnum.COMPILE_FAILURE;
    } else if (statusService.isAndroidCheckstyleFailure(console)) {
      status = StatusEnum.CHECKSTYLE_FAILURE;
    } else if (statusService.isAndroidUnitTestFailure(console)) {
      status = StatusEnum.UNIT_TEST_FAILURE;
    } else if (statusService.isAndroidUiTestFailure(console)) {
      status = StatusEnum.UI_TEST_FAILURE;
    } else {
      status = StatusEnum.BUILD_SUCCESS;
    }
  return status;
  }
}
