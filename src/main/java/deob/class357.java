package deob;

@ObfuscatedName("na")
public class class357 {

	@ObfuscatedName("na.af")
	public int field4028;

	@ObfuscatedName("na.aw")
	public int field4027;

	@ObfuscatedName("na.at")
	public int field4026;

	public class357() {
		this.field4028 = -1;
	}

	public class357(int arg0, int arg1, int arg2) {
		this.field4028 = arg0;
		this.field4027 = arg1;
		this.field4026 = arg2;
	}

	public class357(class357 arg0) {
		this.field4028 = arg0.field4028;
		this.field4027 = arg0.field4027;
		this.field4026 = arg0.field4026;
	}

	public class357(int arg0) {
		if (arg0 == -1) {
			this.field4028 = -1;
		} else {
			this.field4028 = arg0 >> 28 & 0x3;
			this.field4027 = arg0 >> 14 & 0x3FFF;
			this.field4026 = arg0 & 0x3FFF;
		}
	}

	@ObfuscatedName("na.af(IIII)I")
	public static int method6851(int arg0, int arg1, int arg2) {
		return arg0 << 28 | arg1 << 14 | arg2;
	}

	@ObfuscatedName("na.aw(II)I")
	public static int method6803(int arg0) {
		return arg0 >> 28;
	}

	@ObfuscatedName("na.ac(IB)I")
	public static int method6805(int arg0) {
		return arg0 & 0x3FFF;
	}

	@ObfuscatedName("na.ap(II)I")
	public static int method6802(int arg0) {
		return arg0 << 6;
	}

	@ObfuscatedName("na.aq(II)I")
	public static int method6807(int arg0) {
		return arg0 << 7;
	}

	@ObfuscatedName("na.ao(IIS)I")
	public static int method6808(int arg0, int arg1) {
		return (arg1 << 6) + arg0;
	}

	@ObfuscatedName("na.as(II)I")
	public static int method6806(int arg0) {
		return (arg0 << 7) + 64;
	}

	@ObfuscatedName("na.al(II)V")
	public void method6860(int arg0) {
		if (arg0 == -1) {
			this.field4028 = -1;
		} else {
			this.field4028 = arg0 >> 28 & 0x3;
			this.field4027 = arg0 >> 14 & 0x3FFF;
			this.field4026 = arg0 & 0x3FFF;
		}
	}

	@ObfuscatedName("na.au(I)I")
	public int method6811() {
		return this.method6852() ? method6851(this.field4028, this.field4027, this.field4026) : -1;
	}

	@ObfuscatedName("na.ai(I)I")
	public int method6816() {
		return method6851(this.field4028, this.field4027 >> 13, this.field4026 >> 13);
	}

	@ObfuscatedName("na.aa(IIIB)V")
	public void method6812(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0xFF;
		int var5 = arg0 & 0xFF;
		this.field4028 = arg0 >> 28;
		this.field4027 = (var4 << 13) + arg1;
		this.field4026 = (var5 << 13) + arg2;
	}

	@ObfuscatedName("na.am(I)Z")
	public boolean method6852() {
		return this.field4028 != -1;
	}

	public boolean equals(Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof class357) {
			return this.method6815((class357) arg0);
		} else {
			return false;
		}
	}

	@ObfuscatedName("na.an(Lna;I)Z")
	public boolean method6815(class357 arg0) {
		if (this.field4028 != arg0.field4028) {
			return false;
		} else if (this.field4027 == arg0.field4027) {
			return this.field4026 == arg0.field4026;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.method6811();
	}

	public String toString() {
		return this.method6817(",");
	}

	@ObfuscatedName("na.ar(Ljava/lang/String;B)Ljava/lang/String;")
	public String method6817(String arg0) {
		return this.field4028 + arg0 + (this.field4027 >> 6) + arg0 + (this.field4026 >> 6) + arg0 + (this.field4027 & 0x3F) + arg0 + (this.field4026 & 0x3F);
	}
}
