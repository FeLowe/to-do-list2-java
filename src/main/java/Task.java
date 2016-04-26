public class Task {

  private String mDescription;
  private Boolean mCompleted = false;
  private String mCreatedAt;
  private String mDayOfWeek;


  public Task(String description) {
    mDescription = description;
  }

  public String getDescription() {
    return mDescription;
  }

  public Boolean isCompleted(){
    return mCompleted;
  }

  public String getCreatedAt(){
    return mCreatedAt;
  }

  public String getDayOfWeek(){
    return mDayOfWeek;
  }


}
