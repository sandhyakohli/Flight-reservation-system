
    public abstract class Ticket {
        private long PNR;
        private int seatNumber;
        protected double price;
        protected String status;

        Ticket(long PNR, int seatNumber){
            this.PNR=PNR;
            this.seatNumber=seatNumber;
        }


        public long getPNR() {
            return PNR;
        }

        public int getSeatNumber() {
            return seatNumber;
        }
    }


