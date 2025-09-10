package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ns")
public class class359 {

	@ObfuscatedName("ns.aw")
	public class413 field4030;

	@ObfuscatedName("ns.at")
	public class413 field4031;

	@ObfuscatedName("ns.ac")
	public class413 field4032;

	@ObfuscatedName("ns.ap")
	public class413 field4035;

	@ObfuscatedName("ns.aq")
	public class413 field4040;

	@ObfuscatedName("ns.ao")
	public class370[][] field4038;

	@ObfuscatedName("ns.as")
	public Map field4036 = new HashMap();

	@ObfuscatedName("ns.al")
	public class321 field4037 = new class321(200);

	@ObfuscatedName("ns.au")
	public class321 field4033 = new class321(50);

	@ObfuscatedName("ns.ai")
	public class321 field4039 = new class321(20);

	@ObfuscatedName("ns.aa")
	public class321 field4029 = new class321(8);

	@ObfuscatedName("ns.am")
	public class491 field4041 = new class491(10, class489.field5352);

	@ObfuscatedName("ns.an")
	public class491 field4042 = new class491(10, class489.field5352);

	public class359(class413 arg0, class413 arg1, class413 arg2, class413 arg3, class413 arg4) {
		int var6 = 0;
		if (arg0 != null) {
			this.field4030 = arg0;
			this.field4032 = arg1;
			this.field4035 = arg2;
			this.field4040 = arg3;
			this.field4031 = arg4;
			var6 = this.field4030.method7700();
		}
		this.field4038 = new class370[var6][];
		Statics.field4034 = new boolean[var6];
	}

	@ObfuscatedName("ns.af(II)Loi;")
	public class370 method6863(int arg0) {
		int var2 = arg0 >> 16;
		int var3 = arg0 & 0xFFFF;
		if (this.field4038[var2] == null || this.field4038[var2][var3] == null) {
			boolean var4 = this.method6865(var2);
			if (!var4) {
				return null;
			}
		}
		return this.field4038[var2][var3];
	}

	@ObfuscatedName("ns.aw(IIB)Loi;")
	public class370 method6864(int arg0, int arg1) {
		class370 var3 = this.method6863(arg0);
		if (arg1 == -1) {
			return var3;
		} else if (var3 == null || var3.field4287 == null || arg1 >= var3.field4287.length) {
			return null;
		} else {
			return var3.field4287[arg1];
		}
	}

	@ObfuscatedName("ns.at(IB)Z")
	public boolean method6865(int arg0) {
		if (Statics.field4034[arg0]) {
			return true;
		} else if (this.field4030.method7761(arg0)) {
			int var2 = this.field4030.method7702(arg0);
			if (var2 == 0) {
				Statics.field4034[arg0] = true;
				return true;
			}
			if (this.field4038[arg0] == null) {
				this.field4038[arg0] = new class370[var2];
			}
			for (int var3 = 0; var3 < var2; var3++) {
				if (this.field4038[arg0][var3] == null) {
					byte[] var4 = this.field4030.method7692(arg0, var3);
					if (var4 != null) {
						class370 var5 = new class370();
						this.field4038[arg0][var3] = var5;
						var5.field4145 = (arg0 << 16) + var3;
						if (var4[0] == -1) {
							var5.method7412(new class591(var4));
						} else {
							var5.method7423(new class591(var4));
						}
						if (this.field4031 != null) {
							byte[] var6 = this.field4031.method7692(arg0, var3);
							if (var6 != null && var6.length > 0) {
								var5.method7322(new class591(var6));
								this.field4036.put(var5.field4258, arg0);
							}
						}
					}
				}
			}
			for (int var7 = 0; var7 < var2; var7++) {
				class370 var8 = this.field4038[arg0][var7];
				if (var8 != null && var8.field4165 != -1) {
					class370 var9 = this.field4038[arg0][var8.field4165 & 0xFFFF];
					if (var7 > var9.field4215) {
						var9.field4215 = var7;
					}
					if (var7 < var9.field4249) {
						var9.field4249 = var7;
					}
				}
			}
			Statics.field4034[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ns.ac(IB)V")
	public void method6866(int arg0) {
		if (arg0 == -1 || !Statics.field4034[arg0]) {
			return;
		}
		this.field4030.method7705(arg0);
		if (this.field4038[arg0] == null) {
			return;
		}
		for (int var2 = 0; var2 < this.field4038[arg0].length; var2++) {
			if (this.field4038[arg0][var2] != null) {
				this.field4038[arg0][var2] = null;
			}
		}
		this.field4038[arg0] = null;
		Statics.field4034[arg0] = false;
	}

	@ObfuscatedName("ns.ap(I)V")
	public void method6867() {
		this.field4037.method6456();
		this.field4033.method6456();
		this.field4039.method6456();
		this.field4029.method6456();
	}
}
