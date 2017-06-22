package railway.beans;

import java.util.Date;

public class Ticket {

	private String ticketID; // 火车票编号
	private String trianName; // 车次
	private String departure; // 出发地
	private String destination; // 目的地
	private Date time; // 出发时间
	private double price; // 票价
	private String stationCode; // 车站编码
	private int ticketType; // 票类型
	private int coach; // 车厢
	private String seatNumber; // 座位号

	public Ticket(String ticketID, String trianName, String departure, String destination, Date time, double price,
			String stationCode, int ticketType, int coach, String seatNumber) {
		super();
		this.ticketID = ticketID;
		this.trianName = trianName;
		this.departure = departure;
		this.destination = destination;
		this.time = time;
		this.price = price;
		this.stationCode = stationCode;
		this.ticketType = ticketType;
		this.coach = coach;
		this.seatNumber = seatNumber;
	}

	public String getTicketID() {
		return ticketID;
	}

	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}

	public String getTrianName() {
		return trianName;
	}

	public void setTrianName(String trianName) {
		this.trianName = trianName;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public int getTicketType() {
		return ticketType;
	}

	public void setTicketType(int ticketType) {
		this.ticketType = ticketType;
	}

	public int getCoach() {
		return coach;
	}

	public void setCoach(int coach) {
		this.coach = coach;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

}
