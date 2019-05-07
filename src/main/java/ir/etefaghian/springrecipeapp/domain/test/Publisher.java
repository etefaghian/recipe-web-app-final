package ir.etefaghian.springrecipeapp.domain.test;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Embeddable;

    @Data
    @Embeddable
    @Builder
   public  class Publisher
    {
        private String pName;
        private String pISBN;
        private String pother;

        public Publisher() {
            super();
        }

        public Publisher(String pName, String pISBN, String pother) {
            this.pName = pName;
            this.pISBN = pISBN;
            this.pother = pother;
        }
    }


