package deob;

import java.util.Iterator;

@ObfuscatedName("qf")
public class class425 implements Iterable {

	@ObfuscatedName("qf.af")
	public final class428 field5063;

	@ObfuscatedName("qf.aw")
	public int field5064;

	@ObfuscatedName("qf.at")
	public class540[] field5065;

	@ObfuscatedName("qf.ac")
	public class540 field5066;

	public class425(int arg0) {
		this.field5064 = arg0;
		this.field5065 = new class540[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class540 var3 = this.field5065[var2] = new class540();
			var3.field5592 = var3;
			var3.field5590 = var3;
		}
		this.field5063 = new class428(this);
	}

	@ObfuscatedName("qf.af(J)Lus;")
	public class540 method7917(long arg0) {
		class540 var3 = this.field5065[(int) (arg0 & (long) (this.field5064 - 1))];
		for (this.field5066 = var3.field5592; this.field5066 != var3; this.field5066 = this.field5066.field5592) {
			if (this.field5066.field5591 == arg0) {
				class540 var4 = this.field5066;
				this.field5066 = this.field5066.field5592;
				return var4;
			}
		}
		this.field5066 = null;
		return null;
	}

	@ObfuscatedName("qf.aw(Lus;J)V")
	public void method7908(class540 arg0, long arg1) {
		if (arg0.field5590 != null) {
			arg0.method9757();
		}
		class540 var4 = this.field5065[(int) (arg1 & (long) (this.field5064 - 1))];
		arg0.field5590 = var4.field5590;
		arg0.field5592 = var4;
		arg0.field5590.field5592 = arg0;
		arg0.field5592.field5590 = arg0;
		arg0.field5591 = arg1;
	}

	@ObfuscatedName("qf.at()V")
	public void method7910() {
		for (int var1 = 0; var1 < this.field5064; var1++) {
			class540 var2 = this.field5065[var1];
			while (true) {
				class540 var3 = var2.field5592;
				if (var2 == var3) {
					break;
				}
				var3.method9757();
			}
		}
		this.field5066 = null;
	}

	public Iterator iterator() {
		this.field5063.method7968();
		return this.field5063;
	}
}
