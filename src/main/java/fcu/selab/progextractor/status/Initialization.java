package fcu.selab.progextractor.status;

import fcu.selab.progextractor.data.FeedBack;
import java.util.ArrayList;

public class Initialization implements Status {
  @Override
  public String extractFailureMsg(String consoleText) {
    return "Instructor Commit";
  }

  @Override
  public ArrayList<FeedBack> formatExamineMsg(String consoleText) {
    ArrayList<FeedBack> feedbacklist = new ArrayList<>();
    feedbacklist.add(new FeedBack(StatusEnum.INITIALIZATION, consoleText));
    return feedbacklist;
  }
}
