package Klasser;

public class Skade {
        private long skadeId;
        private long bilId;
        private String beskrivelse;
        private double pris;

        private long stelnummer;

        public Skade(long skadeId, long bilId, String beskrivelse, double pris) {
            this.skadeId = skadeId;
            this.bilId = bilId;
            this.beskrivelse = beskrivelse;
            this.pris = pris;
        }

        // Getters og setters
        public long getSkadeId() {
            return skadeId;
        }

        public void setSkadeId(long skadeId) {
            this.skadeId = skadeId;
        }

        public long getBilId() {
            return bilId;
        }

        public void setBilId(long bilId) {
            this.bilId = bilId;
        }

        public String getBeskrivelse() {
            return beskrivelse;
        }

        public void setBeskrivelse(String beskrivelse) {
            this.beskrivelse = beskrivelse;
        }

        public double getPris() {
            return pris;
        }

        public void setPris(double pris) {
            this.pris = pris;
        }

        @Override
        public String toString() {
            return "Klasser.Skade{" +
                    "skadeId=" + skadeId +
                    ", bilId=" + bilId +
                    ", beskrivelse='" + beskrivelse + '\'' +
                    ", pris=" + pris +
                    '}';
        }
    }



