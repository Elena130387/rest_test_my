package pojo;

import java.util.List;

public class UserResponseArray {
  private String meta;
  private DataUser[] data;

  public String getMeta() {
    return meta;
  }

  public void setMeta(String meta) {
    this.meta = meta;
  }

  public DataUser[] getData() {
    return data;
  }

  public void setData(DataUser[] data) {
    this.data = data;
  }
}
