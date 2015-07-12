package utils;

public enum Qorakeys {

	DEFAULT("defaultkey", KeyVariation.DEFAULTKEY), WEBSITE("website",KeyVariation.DEFAULTKEY), BLOGWHITELIST("blogwhitelist", KeyVariation.LISTKEY), BLOGBLACKLIST(
			"blogblacklist",KeyVariation.LISTKEY), BLOGDESCRIPTION("blogdescription",KeyVariation.DEFAULTKEY), BLOGTITLE("blogtitle",KeyVariation.DEFAULTKEY), BLOGENABLE(
					"blogenable", KeyVariation.EXISTSKEY), PROFILEENABLE("profileenable", KeyVariation.EXISTSKEY), PROFILEAVATAR("profileavatar", KeyVariation.DEFAULTKEY), PROFILEFOLLOW(
							"profilefollow", KeyVariation.LISTKEY), PROFILEMAINGRAPHIC("profilemaingraphic",KeyVariation.DEFAULTKEY), PROFILELIKE("profilelike",KeyVariation.LISTKEY);
	private final String keyname;
	private KeyVariation variation;

	private Qorakeys(String keyname, KeyVariation variation) {
		this.keyname = keyname;
		this.variation = variation;
	}

	public String getKeyname() {
		return keyname;
	}

	public String toString() {
		return keyname;
	}

	public KeyVariation getVariation() {
		return variation;
	}
	
	

}
