package train;

public interface sortingPolicy {
	public void queueToWaitingRoom();
	public void queueToTicketbox();
	public void queueToPlatform();
	public void queueToOnBoard();
	public void queueToFinalList();
	public void updateCostomerInfo();
}
