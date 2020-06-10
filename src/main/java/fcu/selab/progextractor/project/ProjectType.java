package fcu.selab.progextractor.project;

import fcu.selab.progextractor.status.Status;
import fcu.selab.progextractor.status.StatusEnum;
import fcu.selab.progextractor.status.StatusFactory;

public interface ProjectType {
  public ProjectTypeEnum getProjectType();

  public StatusEnum checkStatusType(String console);

  public Status getStatus(String statusType);

  public StatusFactory getStatusFactory();
}
