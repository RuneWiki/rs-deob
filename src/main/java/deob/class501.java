package deob;

import java.util.Comparator;

@ObfuscatedName("tw")
public abstract class class501 implements Comparator {

	@ObfuscatedName("tw.aw")
	public Comparator field5400;

	@ObfuscatedName("tw.as(Ljava/util/Comparator;I)V")
	public final void method9254(Comparator arg0) {
		if (this.field5400 == null) {
			this.field5400 = arg0;
		} else if (this.field5400 instanceof class501) {
			((class501) this.field5400).method9254(arg0);
		}
	}

	@ObfuscatedName("tw.al(Ltl;Ltl;I)I")
	public final int method9255(class500 arg0, class500 arg1) {
		return this.field5400 == null ? 0 : this.field5400.compare(arg0, arg1);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}
