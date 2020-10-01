package com.orthofx.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
        @Id
	    private String id;
	    private String ename;
	    private String jobdes;
	    
	    public Customer() {
			
		}
		
		public Customer(String id, String ename, String jobdes) {
			super();
			this.id = id;
			this.ename = ename;
			this.jobdes = jobdes;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public String getJobdes() {
			return jobdes;
		}

		public void setJobdes(String jobdes) {
			this.jobdes = jobdes;
		}
		
      
}
