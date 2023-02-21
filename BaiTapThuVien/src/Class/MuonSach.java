package Class;

public class MuonSach {
  private BanDoc bandoc;
  private SachChoMuon [] sachChoMuons;

  public MuonSach(BanDoc bandoc, SachChoMuon[] sachChoMuons) {
    this.bandoc = bandoc;
    this.sachChoMuons = sachChoMuons;
  }

  public BanDoc getBandoc() {
    return bandoc;
  }

  public void setBandoc(BanDoc bandoc) {
    this.bandoc = bandoc;
  }

  public SachChoMuon[] getSachChoMuons() {
    return sachChoMuons;
  }

  public void setSachChoMuons(SachChoMuon[] sachChoMuons) {
    this.sachChoMuons = sachChoMuons;
  }
}
