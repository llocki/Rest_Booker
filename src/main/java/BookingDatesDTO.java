public class BookingDatesDTO {
    private String checkin;
    private String checkout;

    //-----------------------------------------------------------------------
    public BookingDatesDTO(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public BookingDatesDTO() {
    }

    //---------------------------------------------------------------------------
    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
}
