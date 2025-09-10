package deob;

@ObfuscatedName("hi")
public class class188 extends class541 {

	@ObfuscatedName("hi.ap")
	public static class321 field2041 = new class321(64);

	@ObfuscatedName("hi.aq")
	public static class321 field2042 = new class321(64);

	@ObfuscatedName("hi.ao")
	public int field2043;

	@ObfuscatedName("hi.as")
	public int field2044 = 255;

	@ObfuscatedName("hi.al")
	public int field2045 = 255;

	@ObfuscatedName("hi.au")
	public int field2046 = -1;

	@ObfuscatedName("hi.ai")
	public int field2047 = 1;

	@ObfuscatedName("hi.aa")
	public int field2050 = 70;

	@ObfuscatedName("hi.am")
	public int field2049 = -1;

	@ObfuscatedName("hi.an")
	public int field2038 = -1;

	@ObfuscatedName("hi.ar")
	public int field2051 = 30;

	@ObfuscatedName("hi.ae")
	public int field2052 = 0;

	@ObfuscatedName("et.af(Lpx;Lpx;I)V")
	public static void method3436(class413 arg0, class413 arg1) {
		Statics.field2039 = arg0;
		Statics.field2040 = arg1;
	}

	@ObfuscatedName("gt.aw(II)Lhi;")
	public static class188 method3856(int arg0) {
		class188 var1 = (class188) field2041.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field2039.method7692(33, arg0);
		class188 var3 = new class188();
		var3.field2043 = arg0;
		if (var2 != null) {
			var3.method3955(new class591(var2));
		}
		field2041.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("rf.at(B)V")
	public static void method8267() {
		field2041.method6456();
		field2042.method6456();
	}

	@ObfuscatedName("hi.ac(Lwb;I)V")
	public void method3955(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method3956(arg0, var2);
		}
	}

	@ObfuscatedName("hi.ap(Lwb;II)V")
	public void method3956(class591 arg0, int arg1) {
		if (arg1 == 1) {
			arg0.method10341();
		} else if (arg1 == 2) {
			this.field2044 = arg0.method10339();
		} else if (arg1 == 3) {
			this.field2045 = arg0.method10339();
		} else if (arg1 == 4) {
			this.field2046 = 0;
		} else if (arg1 == 5) {
			this.field2050 = arg0.method10341();
		} else if (arg1 == 6) {
			arg0.method10339();
		} else if (arg1 == 7) {
			this.field2049 = arg0.method10365();
		} else if (arg1 == 8) {
			this.field2038 = arg0.method10365();
		} else if (arg1 == 11) {
			this.field2046 = arg0.method10341();
		} else if (arg1 == 14) {
			this.field2051 = arg0.method10339();
		} else if (arg1 == 15) {
			this.field2052 = arg0.method10339();
		}
	}

	@ObfuscatedName("hi.aq(I)Lxt;")
	public class606 method3957() {
		if (this.field2049 < 0) {
			return null;
		}
		class606 var1 = (class606) field2042.method6463((long) this.field2049);
		if (var1 != null) {
			return var1;
		}
		class606 var2 = class607.method3059(Statics.field2040, this.field2049, 0);
		if (var2 != null) {
			field2042.method6454(var2, (long) this.field2049);
		}
		return var2;
	}

	@ObfuscatedName("hi.ao(I)Lxt;")
	public class606 method3958() {
		if (this.field2038 < 0) {
			return null;
		}
		class606 var1 = (class606) field2042.method6463((long) this.field2038);
		if (var1 != null) {
			return var1;
		}
		class606 var2 = class607.method3059(Statics.field2040, this.field2038, 0);
		if (var2 != null) {
			field2042.method6454(var2, (long) this.field2038);
		}
		return var2;
	}
}
