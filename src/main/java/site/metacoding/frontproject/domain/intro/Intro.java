package site.metacoding.frontproject.domain.intro;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.frontproject.web.dto.request.intro.UpdateDto;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Intro {
	private Integer introId;
	private Integer companyId;
	private String introTitle;
	private String introBirth;
	private String introTask;
	private String introSal;
	private String introWellfare;
	private String introContent;
	private String introLocation;
	private String introImage;
	private Integer jobId;

	private Integer no;
	private String companyName;

	public void Update(UpdateDto updateDto) {
		this.companyId = updateDto.getCompanyId();
		this.introBirth = updateDto.getIntroBirth();
		this.introTask = updateDto.getIntroTask();
		this.introSal = updateDto.getIntroSal();
		this.introWellfare = updateDto.getIntroWellfare();
		this.introContent = updateDto.getIntroContent();
		this.introLocation = updateDto.getIntroImage();
		this.introImage = updateDto.getIntroImage();
		this.jobId = updateDto.getJobId();
	}

}
