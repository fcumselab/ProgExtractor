package fcu.selab.progextractor.status;

import fcu.selab.progextractor.data.FeedBack;

import java.util.ArrayList;

public class WebCheckstyleFailure implements Status {

  @Override
  public String extractFailureMsg(String consoleText) {
    String checkstyleStart = "npm run htmlhint";
    String checkstyleEnd = "Archiving artifacts";

    String checkstyleInfo = consoleText.substring(
        consoleText.indexOf(checkstyleStart) + checkstyleStart.length() + 1,
        consoleText.lastIndexOf(checkstyleEnd) - 1);
    return checkstyleInfo.trim();
  }

  @Override
  public ArrayList<FeedBack> formatExamineMsg(String consoleText) {
    return null;
  }
}
