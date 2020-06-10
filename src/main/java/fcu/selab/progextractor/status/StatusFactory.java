package fcu.selab.progextractor.status;

public interface StatusFactory {
  /**
   * 
   * @param statusType is the status type
   * @return Status status
   */
  public Status getStatus(String statusType);
}
