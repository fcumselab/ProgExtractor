package fcu.selab.progextractor.status;

import fcu.selab.progextractor.project.ProjectTypeEnum;

public class StatusFactorySelector {
  /**
   * getStatusFactory
   * 
   * @param projectType project type
   */
  public static StatusFactory getStatusFactory(ProjectTypeEnum projectType) {
    switch (projectType) {
      case JAVAC: {
        return new JavacStatusFactory();
      }
      case MAVEN: {
        return new MavenStatusFactory();
      }
      case WEB: {
        return new WebStatusFactory();
      }
      case ANDROID: {
        return new AndroidStatusFactory();
      }
      default: {
        return null;
      }
    }
  }
}
