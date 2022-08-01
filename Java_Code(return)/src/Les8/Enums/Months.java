package Les8.Enums;

public enum Months {

	January(31, Seasons.Winter), February(28, Seasons.Winter), March(31, Seasons.Spring), April(30, Seasons.Spring),
	May(31, Seasons.Spring), June(30, Seasons.Summer), July(31, Seasons.Summer), August(31, Seasons.Summer),
	September(30, Seasons.Fall), October(31, Seasons.Fall), November(30, Seasons.Fall), December(31, Seasons.Winter);

	int days;
	Seasons seasons;

	Months(int days, Seasons seasons) {
		this.days = days;
		this.seasons = seasons;
	}

	public int getDays() {
		return days;
	}

	public Seasons getSeasons() {
		return seasons;
	}
}
