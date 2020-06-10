package fcu.selab.progextractor.project;

public class AssignmentFactory {

  /**
   * getAssignmentType
   *
   * @param projectType assignmentType
   */
  public static ProjectTypeImp getAssignmentType(String projectType) {
    ProjectTypeEnum projectTypeEnum = ProjectTypeEnum.getProjectTypeEnum(projectType);

    switch (projectTypeEnum) {
      case JAVAC:
        return new JavacAssignment();
      case MAVEN:
        return new MavenAssignment();
      case WEB:
        return new WebAssignment();
      case ANDROID:
        return new AndroidAssignment();
      default:
        return null;
    }
  }
}
