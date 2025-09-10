package deob;

@ObfuscatedName("hy")
public class class191 extends class541 {

	@ObfuscatedName("hy.aw")
	public static class321 field2067 = new class321(64);

	@ObfuscatedName("hy.at")
	public char field2068;

	@ObfuscatedName("hy.ac")
	public char field2069;

	@ObfuscatedName("hy.ap")
	public String field2070 = class394.field4507;

	@ObfuscatedName("hy.aq")
	public int field2072;

	@ObfuscatedName("hy.ao")
	public int field2076 = 0;

	@ObfuscatedName("hy.as")
	public int[] field2073;

	@ObfuscatedName("hy.al")
	public int[] field2074;

	@ObfuscatedName("hy.au")
	public String[] field2075;

	@ObfuscatedName("hy.ai")
	public class520 field2066;

	@ObfuscatedName("hy.aa")
	public class520 field2077;

	@ObfuscatedName("bu.af(Lpx;I)V")
	public static void method448(class413 arg0) {
		Statics.field2071 = arg0;
	}

	@ObfuscatedName("hg.aw(II)Lhy;")
	public static class191 method3914(int arg0) {
		class191 var1 = (class191) field2067.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field2071.method7692(8, arg0);
		class191 var3 = new class191();
		if (var2 != null) {
			var3.method4001(new class591(var2));
		}
		field2067.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("hy.at(Lwb;I)V")
	public void method4001(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method3991(arg0, var2);
		}
	}

	@ObfuscatedName("hy.ac(Lwb;II)V")
	public void method3991(class591 arg0, int arg1) {
		if (arg1 == 1) {
			this.field2068 = (char) arg0.method10339();
		} else if (arg1 == 2) {
			this.field2069 = (char) arg0.method10339();
		} else if (arg1 == 3) {
			this.field2070 = arg0.method10350();
		} else if (arg1 == 4) {
			this.field2072 = arg0.method10345();
		} else if (arg1 == 5) {
			this.field2076 = arg0.method10341();
			this.field2073 = new int[this.field2076];
			this.field2075 = new String[this.field2076];
			for (int var3 = 0; var3 < this.field2076; var3++) {
				this.field2073[var3] = arg0.method10345();
				this.field2075[var3] = arg0.method10350();
			}
		} else if (arg1 == 6) {
			this.field2076 = arg0.method10341();
			this.field2073 = new int[this.field2076];
			this.field2074 = new int[this.field2076];
			for (int var4 = 0; var4 < this.field2076; var4++) {
				this.field2073[var4] = arg0.method10345();
				this.field2074[var4] = arg0.method10345();
			}
		}
	}

	@ObfuscatedName("hy.ap(I)I")
	public int method3992() {
		return this.field2076;
	}

	@ObfuscatedName("hy.aq(I)Lti;")
	public class520 method3993() {
		if (this.field2066 == null) {
			int[] var1 = this.field2073;
			class520 var2 = new class520(class575.field5821, false);
			var2.field5506 = var1;
			var2.field5503 = var1.length;
			var2.field5504 = var1.length;
			this.field2066 = var2;
		}
		return this.field2066;
	}

	@ObfuscatedName("hy.ao(I)Lti;")
	public class520 method3990() {
		if (this.field2077 == null) {
			if (this.field2069 == 's') {
				this.field2077 = class520.method6337(this.field2075);
			} else {
				int[] var1 = this.field2074;
				class520 var2 = new class520(class575.field5821, false);
				var2.field5506 = var1;
				var2.field5503 = var1.length;
				var2.field5504 = var1.length;
				this.field2077 = var2;
			}
		}
		return this.field2077;
	}
}
