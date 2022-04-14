package playlist;

import java.time.LocalDate;
import java.util.Calendar;
/**
 * 
 * @author dell
 *
 */
public class Song {
	
	private String title;
	private int id;
	private LocalDate date;
	private int time;
	private String gender;
	private String cover; //Caratula
	private String description;
	
	/**
	 * 
	 * @param title
	 * @param id
	 * @param date
	 * @param time
	 * @param gender
	 * @param cover
	 * @param description
	 */
	public Song(String title, int id, LocalDate date, int time, String gender, String cover, String description) {
		super();
		this.title = title;
		this.id = id;
		this.date =date;
		this.time = time;
		this.gender = gender;
		this.cover = cover;
		this.description = description;
	}
	public String getTitle() {
		
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", id=" + id + ", date=" + date + ", time=" + time + ", gender=" + gender
				+ ", cover=" + cover + ", description=" + description + "]";
	}
	

}
