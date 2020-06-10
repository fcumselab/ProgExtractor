package fcu.selab.progextractor.status;

import fcu.selab.progextractor.data.FeedBack;
import java.util.ArrayList;

public class BuildSuccess implements Status {

  @Override
  public String extractFailureMsg(String consoleText) {
    return "Success";
  }

  @Override
  public ArrayList<FeedBack> formatExamineMsg(String consoleText) {
    ArrayList<FeedBack> feedbacklist = new ArrayList<>();
    feedbacklist.add(new FeedBack(StatusEnum.BUILD_SUCCESS, consoleText));
    return feedbacklist;
  }
}
