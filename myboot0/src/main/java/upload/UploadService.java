package upload;

import java.util.List;

public interface UploadService {
	public void insertFiles(UploadVO vo);
	public List<UploadVO> myfilelist(String name);
}
