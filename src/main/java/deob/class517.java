package deob;

@ObfuscatedName("tz")
public class class517 implements class431 {

	@ObfuscatedName("tz.af")
	public static final class517 field5484 = new class517(0, 0, 0, 0, 0, 0);

	@ObfuscatedName("tz.aw")
	public static final class517 field5486 = new class517(1, 1, 507, 507, 507, 507);

	@ObfuscatedName("tz.at")
	public static final class517 field5476 = new class517(2, 2, 338, 338, 338, 507);

	@ObfuscatedName("tz.ac")
	public static final class517 field5477 = new class517(3, 3, 499, 499, 499, 507);

	@ObfuscatedName("tz.ap")
	public final int field5480;

	@ObfuscatedName("tz.aq")
	public final int field5481;

	@ObfuscatedName("tz.ao")
	public final int field5482;

	@ObfuscatedName("tz.as")
	public final int field5483;

	@ObfuscatedName("tz.al")
	public final int field5478;

	@ObfuscatedName("tz.au")
	public final int field5485;

	@ObfuscatedName("nw.at(I)[Ltz;")
	public static class517[] method6796() {
		return new class517[] { field5484, field5486, field5476, field5477 };
	}

	public class517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.field5480 = arg0;
		this.field5485 = arg1;
		this.field5481 = arg2;
		this.field5482 = arg3;
		this.field5483 = arg4;
		this.field5478 = arg5;
	}

	@ObfuscatedName("tz.af(I)I")
	public int method34() {
		return this.field5485;
	}

	@ObfuscatedName("tz.ac(IZZZI)Z")
	public boolean method9518(int arg0, boolean arg1, boolean arg2, boolean arg3) {
		byte var5 = 0;
		int var6 = var5 | (arg2 ? 1 : 0);
		int var7 = var6 | (arg1 ? 8 : 32);
		int var8 = var7 | (arg3 ? 128 : 0);
		return (arg0 & var8) != 0;
	}

	@ObfuscatedName("tz.ap(IZZZB)Z")
	public boolean method9503(int arg0, boolean arg1, boolean arg2, boolean arg3) {
		byte var5 = 0;
		int var6 = var5 | (arg2 ? 2 : 0);
		int var7 = var6 | (arg1 ? 16 : 64);
		int var8 = var7 | (arg3 ? 256 : 0);
		return (arg0 & var8) != 0;
	}

	@ObfuscatedName("tz.aq(ZZZI)Z")
	public boolean method9504(boolean arg0, boolean arg1, boolean arg2) {
		return this.method9518(this.field5481, arg0, arg1, arg2);
	}

	@ObfuscatedName("tz.ao(ZZZI)Z")
	public boolean method9505(boolean arg0, boolean arg1, boolean arg2) {
		return this.method9518(this.field5482, arg0, arg1, arg2);
	}

	@ObfuscatedName("tz.as(ZZZI)Z")
	public boolean method9506(boolean arg0, boolean arg1, boolean arg2) {
		return this.method9518(this.field5483, arg0, arg1, arg2);
	}

	@ObfuscatedName("tz.al(ZZZI)Z")
	public boolean method9507(boolean arg0, boolean arg1, boolean arg2) {
		return this.method9518(this.field5478, arg0, arg1, arg2);
	}

	@ObfuscatedName("tz.au(ZZZB)Z")
	public boolean method9511(boolean arg0, boolean arg1, boolean arg2) {
		return this.method9503(this.field5481, arg0, arg1, arg2);
	}

	@ObfuscatedName("tz.ai(ZZZI)Z")
	public boolean method9508(boolean arg0, boolean arg1, boolean arg2) {
		return this.method9503(this.field5482, arg0, arg1, arg2);
	}

	@ObfuscatedName("tz.aa(ZZZB)Z")
	public boolean method9509(boolean arg0, boolean arg1, boolean arg2) {
		return this.method9503(this.field5483, arg0, arg1, arg2);
	}
}
