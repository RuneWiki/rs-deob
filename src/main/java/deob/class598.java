package deob;

import java.util.Comparator;

@ObfuscatedName("ww")
public class class598 implements Comparator {

	@ObfuscatedName("ww.af")
	public final boolean field5983;

	public class598(boolean arg0) {
		this.field5983 = arg0;
	}

	@ObfuscatedName("ww.af(Ltl;Ltl;I)I")
	public int method10659(class500 arg0, class500 arg1) {
		return this.field5983 ? arg0.method9244().method11025(arg1.method9244()) : arg1.method9244().method11025(arg0.method9244());
	}

	public int compare(Object arg0, Object arg1) {
		return this.method10659((class500) arg0, (class500) arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
