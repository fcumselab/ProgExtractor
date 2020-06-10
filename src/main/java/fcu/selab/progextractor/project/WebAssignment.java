package fcu.selab.progextractor.project;

import fcu.selab.progextractor.service.StatusService;
import fcu.selab.progextractor.status.StatusEnum;

public class WebAssignment extends ProjectTypeImp {

  @Override
  public ProjectTypeEnum getProjectType() {
    return ProjectTypeEnum.WEB;
  }

  @Override
  public StatusEnum checkStatusType(String console) {
    StatusEnum status = null;
    StatusService statusService = StatusService.getInstance();

    if (statusService.isWebUnitTestFailure(console)) {
      status = StatusEnum.UNIT_TEST_FAILURE;
    } else if (statusService.isWebHtmlhintFailure(console)) {
      status = StatusEnum.WEB_HTMLHINT_FAILURE;
    } else if (statusService.isWebStylelintFailure(console)) {
      status = StatusEnum.WEB_STYLELINT_FAILURE;
    } else if (statusService.isWebEslintFailure(console)) {
      status = StatusEnum.WEB_ESLINT_FAILURE;
    } else {
      status = StatusEnum.BUILD_SUCCESS;
    }
    return status;
  }
}
