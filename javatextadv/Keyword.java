/* Keyword aliases */

package javatextadv;

import java.util.ArrayList;

public class Keyword {

	private ArrayList<Keyword> aliases;

	public final String name;
	public final boolean isPrimary;

	public Keyword (String kwName) {
		name = kwName;
		isPrimary = false;
	}

	public Keyword (String kwName, boolean primacy) {
		name = kwName;
		isPrimary = primacy;
	}

	public Keyword (String kwName, boolean primacy, ArrayList<Keyword> kwAliases) {
		name = kwName;
		isPrimary = primacy;
		aliases = kwAliases;
	}

	public void addAlias (Keyword alias) {
		aliases.add(alias);
	}

	public boolean isAliasOf (Keyword kw) {
		return false;
	}

	public boolean containsAlias (String alias) {
		return false;
	}

}