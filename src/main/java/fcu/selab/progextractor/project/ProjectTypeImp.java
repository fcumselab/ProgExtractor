package fcu.selab.progextractor.project;

import fcu.selab.progextractor.status.Status;
import fcu.selab.progextractor.status.StatusFactory;
import fcu.selab.progextractor.status.StatusFactorySelector;

public abstract class ProjectTypeImp implements ProjectType {

  @Override
  public Status getStatus(String statusType) {
    return getStatusFactory().getStatus(statusType);
  }

  @Override
  public StatusFactory getStatusFactory() {
    return StatusFactorySelector.getStatusFactory(getProjectType());
  }
}
