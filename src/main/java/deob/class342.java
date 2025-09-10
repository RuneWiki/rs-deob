package deob;

@ObfuscatedName("nr")
public class class342 {

	@ObfuscatedName("nr.aq")
	public static final byte[] field3939 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@ObfuscatedName("nr.ao")
	public class591 field3940 = new class591(null);

	@ObfuscatedName("nr.as")
	public int field3941;

	@ObfuscatedName("nr.al")
	public int[] field3947;

	@ObfuscatedName("nr.au")
	public int field3936;

	@ObfuscatedName("nr.ai")
	public int[] field3944;

	@ObfuscatedName("nr.aa")
	public int[] field3943;

	@ObfuscatedName("nr.am")
	public int[] field3946;

	@ObfuscatedName("nr.an")
	public long field3942;

	@ObfuscatedName("nr.af([B)V")
	public void method6706(byte[] arg0) {
		this.field3940.field5917 = arg0;
		this.field3940.field5920 = 10;
		int var2 = this.field3940.method10341();
		this.field3941 = this.field3940.method10341();
		this.field3936 = 500000;
		this.field3944 = new int[var2];
		int var3 = 0;
		while (var3 < var2) {
			int var4 = this.field3940.method10345();
			int var5 = this.field3940.method10345();
			if (var4 == 1297379947) {
				this.field3944[var3] = this.field3940.field5920;
				var3++;
			}
			this.field3940.field5920 += var5;
		}
		this.field3942 = 0L;
		this.field3943 = new int[var2];
		for (int var6 = 0; var6 < var2; var6++) {
			this.field3943[var6] = this.field3944[var6];
		}
		this.field3947 = new int[var2];
		this.field3946 = new int[var2];
	}

	@ObfuscatedName("nr.aw()V")
	public void method6684() {
		this.field3940.field5917 = null;
		this.field3944 = null;
		this.field3943 = null;
		this.field3947 = null;
		this.field3946 = null;
	}

	@ObfuscatedName("nr.at()Z")
	public boolean method6703() {
		return this.field3940.field5917 != null;
	}

	@ObfuscatedName("nr.ac()I")
	public int method6688() {
		return this.field3943.length;
	}

	@ObfuscatedName("nr.ap(I)V")
	public void method6682(int arg0) {
		this.field3940.field5920 = this.field3943[arg0];
	}

	@ObfuscatedName("nr.aq(I)V")
	public void method6714(int arg0) {
		this.field3943[arg0] = this.field3940.field5920;
	}

	@ObfuscatedName("nr.ao()V")
	public void method6697() {
		this.field3940.field5920 = -1;
	}

	@ObfuscatedName("nr.as(I)V")
	public void method6689(int arg0) {
		int var2 = this.field3940.method10360();
		this.field3947[arg0] += var2;
	}

	@ObfuscatedName("nr.al(I)I")
	public int method6690(int arg0) {
		return this.method6691(arg0);
	}

	@ObfuscatedName("nr.au(I)I")
	public int method6691(int arg0) {
		byte var2 = this.field3940.field5917[this.field3940.field5920];
		int var3;
		if (var2 < 0) {
			var3 = var2 & 0xFF;
			this.field3946[arg0] = var3;
			this.field3940.field5920++;
		} else {
			var3 = this.field3946[arg0];
		}
		if (var3 != 240 && var3 != 247) {
			return this.method6686(arg0, var3);
		}
		int var4 = this.field3940.method10360();
		if (var3 == 247 && var4 > 0) {
			int var5 = this.field3940.field5917[this.field3940.field5920] & 0xFF;
			if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
				this.field3940.field5920++;
				this.field3946[arg0] = var5;
				return this.method6686(arg0, var5);
			}
		}
		this.field3940.field5920 += var4;
		return 0;
	}

	@ObfuscatedName("nr.ai(II)I")
	public int method6686(int arg0, int arg1) {
		if (arg1 != 255) {
			byte var7 = field3939[arg1 - 128];
			int var8 = arg1;
			if (var7 >= 1) {
				var8 = arg1 | this.field3940.method10339() << 8;
			}
			if (var7 >= 2) {
				var8 |= this.field3940.method10339() << 16;
			}
			return var8;
		}
		int var3 = this.field3940.method10339();
		int var4 = this.field3940.method10360();
		if (var3 == 47) {
			this.field3940.field5920 += var4;
			return 1;
		} else if (var3 == 81) {
			int var5 = this.field3940.method10419();
			var4 -= 3;
			int var6 = this.field3947[arg0];
			this.field3942 += (long) (this.field3936 - var5) * (long) var6;
			this.field3936 = var5;
			this.field3940.field5920 += var4;
			return 2;
		} else {
			this.field3940.field5920 += var4;
			return 3;
		}
	}

	@ObfuscatedName("nr.aa(I)J")
	public long method6693(int arg0) {
		return (long) this.field3936 * (long) arg0 + this.field3942;
	}

	@ObfuscatedName("nr.am()I")
	public int method6683() {
		int var1 = this.field3943.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;
		for (int var4 = 0; var4 < var1; var4++) {
			if (this.field3943[var4] >= 0 && this.field3947[var4] < var3) {
				var2 = var4;
				var3 = this.field3947[var4];
			}
		}
		return var2;
	}

	@ObfuscatedName("nr.an()Z")
	public boolean method6695() {
		int var1 = this.field3943.length;
		for (int var2 = 0; var2 < var1; var2++) {
			if (this.field3943[var2] >= 0) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("nr.ar(J)V")
	public void method6696(long arg0) {
		this.field3942 = arg0;
		int var3 = this.field3943.length;
		for (int var4 = 0; var4 < var3; var4++) {
			this.field3947[var4] = 0;
			this.field3946[var4] = 0;
			this.field3940.field5920 = this.field3944[var4];
			this.method6689(var4);
			this.field3943[var4] = this.field3940.field5920;
		}
	}
}
