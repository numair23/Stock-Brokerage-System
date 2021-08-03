package Model;

class Enums {

}
 enum ReturnStatus {
	  SUCCESS, FAIL, INSUFFICIENT_FUNDS, INSUFFICIENT_QUANTITY, NO_STOCK_POSITION
	}

	 enum OrderStatus {
	  OPEN, FILLED, PARTIALLY_FILLED, CANCELLED
	}

	 enum TimeEnforcementType {
	  GOOD_TILL_CANCELLED, FILL_OR_KILL, IMMEDIATE_OR_CANCEL, ON_THE_OPEN, ON_THE_CLOSE
	}

	 enum AccountStatus {
	  ACTIVE, CLOSED, CANCELED, BLACKLISTED, None
	}

	class Location {
	  private String streetAddress;
	  private String city;
	  private String state;
	  private String zipCode;
	  private String country;
	}

	  class Constants {
	  public static final int MONEY_TRANSFER_LIMIT = 100_000;
	}