package deob;

import java.util.Iterator;

@ObfuscatedName("vo")
public class class569 extends class527 implements class317 {

	@ObfuscatedName("vo.aw")
	public final class319 field5810 = new class319(64);

	@ObfuscatedName("vo.at")
	public final class413 field5809;

	@ObfuscatedName("vo.ac")
	public final int field5808;

	public class569(class388 arg0, int arg1, class433 arg2, class413 arg3) {
		super(arg0, arg2, arg3 == null ? 0 : arg3.method7702(arg1));
		this.field5809 = arg3;
		this.field5808 = arg1;
	}

	@ObfuscatedName("vo.af(II)Luo;")
	public class529 method9667(int arg0) {
		class319 var2 = this.field5810;
		synchronized (this.field5810) {
			class528 var3 = (class528) this.field5810.method6423((long) arg0);
			if (var3 == null) {
				var3 = this.method10137(arg0);
				this.field5810.method6425(var3, (long) arg0);
			}
			return var3;
		}
	}

	@ObfuscatedName("vo.ar(II)Lux;")
	public class528 method10137(int arg0) {
		byte[] var2 = this.field5809.method7692(this.field5808, arg0);
		class528 var3 = new class528(arg0);
		if (var2 != null) {
			var3.method9683(new class591(var2));
		}
		return var3;
	}

	@ObfuscatedName("vo.ae(I)V")
	public void method10140() {
		class319 var1 = this.field5810;
		synchronized (this.field5810) {
			this.field5810.method6432();
		}
	}

	public Iterator iterator() {
		return new class568(this);
	}
}
