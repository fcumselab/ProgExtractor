package fcu.selab.progextractor.project;

public class MavenGroupProject extends GroupProjectType {

  @Override
  public ProjectTypeEnum getProjectType() {
    return ProjectTypeEnum.MAVEN;
  }
}
