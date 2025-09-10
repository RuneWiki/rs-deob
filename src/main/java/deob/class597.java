package deob;

import java.util.Comparator;

@ObfuscatedName("wh")
public class class597 implements Comparator {

	@ObfuscatedName("wh.af")
	public final boolean field5980;

	public class597(boolean arg0) {
		this.field5980 = arg0;
	}

	@ObfuscatedName("wh.af(Ltl;Ltl;I)I")
	public int method10653(class500 arg0, class500 arg1) {
		return this.field5980 ? arg0.method9213(arg1) : arg1.method9213(arg0);
	}

	public int compare(Object arg0, Object arg1) {
		return this.method10653((class500) arg0, (class500) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
