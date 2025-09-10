package deob;

@ObfuscatedName("cv")
public class class70 extends class76 {

	@ObfuscatedName("cv.at")
	public class614 field935;

	@ObfuscatedName("cv.ac")
	public class366 field936;

	@ObfuscatedName("cv.ap")
	public int field952 = -1;

	@ObfuscatedName("cv.aq")
	public int field938 = -1;

	@ObfuscatedName("cv.ao")
	public String[] field939 = new String[3];

	@ObfuscatedName("cv.as")
	public int field940 = 0;

	@ObfuscatedName("cv.al")
	public int field941 = 0;

	@ObfuscatedName("cv.au")
	public int field942;

	@ObfuscatedName("cv.ai")
	public int field943 = 0;

	@ObfuscatedName("cv.aa")
	public int field944 = 0;

	@ObfuscatedName("cv.am")
	public int field945;

	@ObfuscatedName("cv.ar")
	public int field937;

	@ObfuscatedName("cv.ae")
	public int field946;

	@ObfuscatedName("cv.ay")
	public class242 field948;

	@ObfuscatedName("cv.ad")
	public int field949;

	@ObfuscatedName("cv.ag")
	public int field950;

	@ObfuscatedName("cv.av")
	public int field954;

	@ObfuscatedName("cv.ah")
	public int field947;

	@ObfuscatedName("cv.ab")
	public boolean field953 = false;

	@ObfuscatedName("cv.ax")
	public int field956 = 0;

	@ObfuscatedName("cv.ak")
	public boolean field955 = false;

	@ObfuscatedName("cv.aj")
	public int field934;

	@ObfuscatedName("cv.az")
	public class505 field957 = class505.field5416;

	@ObfuscatedName("cv.bt")
	public class505 field958 = class505.field5416;

	@ObfuscatedName("cv.bs")
	public class505 field959 = class505.field5416;

	@ObfuscatedName("cv.bu")
	public int field960 = 0;

	public class70(int arg0) {
		super(arg0);
		for (int var2 = 0; var2 < 3; var2++) {
			this.field939[var2] = "";
		}
	}

	@ObfuscatedName("cv.af(B)I")
	public int method2177() {
		return this.field934;
	}

	@ObfuscatedName("cv.aw(Lwb;I)V")
	public final void method2131(class591 arg0) {
		arg0.field5920 = 0;
		byte var2 = arg0.method10340();
		boolean var3 = true;
		this.field952 = arg0.method10340();
		this.field938 = arg0.method10340();
		int var4 = -1;
		this.field956 = 0;
		int[] var5 = new int[12];
		for (int var6 = 0; var6 < var5.length; var6++) {
			int var7 = arg0.method10339();
			if (var7 == 0) {
				var5[var6] = 0;
			} else {
				int var8 = arg0.method10339();
				int var9 = (var7 << 8) + var8;
				if (var6 == 0 && var9 == 65535) {
					var4 = arg0.method10341();
					break;
				}
				var5[var6] = var9;
				if (this.method2146(var5[var6])) {
					int var10 = this.method2142(var5[var6]).field2416;
					if (var10 != 0) {
						this.field956 = var10;
					}
				}
			}
		}
		int[] var11 = new int[12];
		for (int var12 = 0; var12 < var11.length; var12++) {
			int var13 = arg0.method10339();
			if (var13 == 0) {
				var11[var12] = 0;
			} else {
				int var14 = arg0.method10339();
				var11[var12] = (var13 << 8) + var14;
			}
		}
		int[] var15 = new int[5];
		for (int var16 = 0; var16 < var15.length; var16++) {
			int var17 = arg0.method10339();
			if (var17 < 0 || var17 >= Statics.field4075[var16].length) {
				var17 = 0;
			}
			var15[var16] = var17;
		}
		this.field1061 = arg0.method10341();
		if (this.field1061 == 65535) {
			this.field1061 = -1;
		}
		this.field1065 = arg0.method10341();
		if (this.field1065 == 65535) {
			this.field1065 = -1;
		}
		this.field1063 = this.field1065;
		this.field1064 = arg0.method10341();
		if (this.field1064 == 65535) {
			this.field1064 = -1;
		}
		this.field1089 = arg0.method10341();
		if (this.field1089 == 65535) {
			this.field1089 = -1;
		}
		this.field1097 = arg0.method10341();
		if (this.field1097 == 65535) {
			this.field1097 = -1;
		}
		this.field1067 = arg0.method10341();
		if (this.field1067 == 65535) {
			this.field1067 = -1;
		}
		this.field1068 = arg0.method10341();
		if (this.field1068 == 65535) {
			this.field1068 = -1;
		}
		this.field935 = new class614(arg0.method10350(), Statics.field1293);
		this.method2134();
		this.method2137();
		this.method2181();
		if (Statics.field1109 == this) {
			Statics.field6087 = this.field935.method11022();
		}
		this.field940 = arg0.method10339();
		this.field941 = arg0.method10341();
		this.field955 = arg0.method10339() == 1;
		if (client.field355 == 0 && client.field429 >= 2) {
			this.field955 = false;
		}
		class177[] var18 = null;
		boolean var19 = false;
		int var20 = arg0.method10341();
		boolean var21 = (var20 >> 15 & 0x1) == 1;
		if (var20 > 0 && var20 != 32768) {
			var18 = new class177[12];
			for (int var22 = 0; var22 < var18.length; var22++) {
				int var23 = var20 >> 12 - var22 & 0x1;
				if (var23 == 1) {
					var18[var22] = class177.method3678(var5[var22] - 2048, arg0);
				}
			}
		}
		for (int var24 = 0; var24 < 3; var24++) {
			this.field939[var24] = arg0.method10350();
		}
		byte var25 = arg0.method10340();
		if (this.field936 == null) {
			this.field936 = new class366();
		}
		this.field936.method6913(var11, var5, var18, var21, var15, var2, var4, var25);
		if (var4 == -1) {
			this.field1060 = 1;
		} else {
			this.field1060 = class196.method2096(var4).field2112;
		}
		this.field960 = (int) ((float) (this.field1060 * 128) * 0.4F);
	}

	@ObfuscatedName("cv.ac(B)Z")
	public boolean method2133() {
		if (class505.field5416 == this.field957) {
			this.method2135();
		}
		return class505.field5417 == this.field957;
	}

	@ObfuscatedName("cv.ap(I)V")
	public void method2134() {
		this.field957 = class505.field5416;
	}

	@ObfuscatedName("cv.aq(I)V")
	public void method2135() {
		this.field957 = Statics.field280.method1509(this.field935) ? class505.field5417 : class505.field5419;
	}

	@ObfuscatedName("cv.ao(I)Z")
	public boolean method2136() {
		if (class505.field5416 == this.field958) {
			this.method2189();
		}
		return class505.field5417 == this.field958;
	}

	@ObfuscatedName("cv.as(I)V")
	public void method2137() {
		this.field958 = class505.field5416;
	}

	@ObfuscatedName("cv.al(I)V")
	public void method2189() {
		this.field958 = Statics.field91 != null && Statics.field91.method9265(this.field935) ? class505.field5417 : class505.field5419;
	}

	@ObfuscatedName("cv.ai(I)V")
	public void method2138() {
		for (int var1 = 0; var1 < 4; var1++) {
			if (client.field366[var1] != null && client.field366[var1].method3696(this.field935.method11022()) != -1 && var1 != 2) {
				this.field959 = class505.field5417;
				return;
			}
		}
		this.field959 = class505.field5419;
	}

	@ObfuscatedName("cv.aa(B)V")
	public void method2181() {
		this.field959 = class505.field5416;
	}

	@ObfuscatedName("cv.am(B)Z")
	public boolean method2130() {
		if (class505.field5416 == this.field959) {
			this.method2138();
		}
		return class505.field5417 == this.field959;
	}

	@ObfuscatedName("cv.at(I)Ljn;")
	public final class242 method1847() {
		if (this.field936 == null) {
			return null;
		}
		class470 var1 = this.method2400();
		class470 var2 = this.field953 ? null : this.method2380(var1);
		if (var1 == null && var2 == null) {
			var2 = this.field1094;
			if (this.field1094.method8902(30)) {
				return null;
			}
		}
		class216 var3 = var1 == null ? null : var1.method8916();
		class216 var4 = var2 == null ? null : var2.method8916();
		int var5 = var1 == null ? -1 : var1.method8900();
		int var6 = var2 == null ? -1 : var2.method8900();
		class242 var7 = this.field936.method6986(var3, var5, var4, var6);
		if (var7 == null) {
			return null;
		}
		var7.method5128();
		this.field1071 = var7.field2802;
		int var8 = var7.field2909;
		if (!this.field953) {
			var7 = this.method2392(var7);
		}
		if (!this.field953 && this.field948 != null) {
			if (client.field413 >= this.field944) {
				this.field948 = null;
			}
			if (client.field413 >= this.field943 && client.field413 < this.field944) {
				class242 var9 = this.field948;
				var9.method5143(this.field945 - this.field1056, this.field937 - this.field942, this.field946 - this.field1057);
				if (this.field1098 == 512) {
					var9.method5213();
					var9.method5213();
					var9.method5213();
				} else if (this.field1098 == 1024) {
					var9.method5213();
					var9.method5213();
				} else if (this.field1098 == 1536) {
					var9.method5213();
				}
				class242[] var10 = new class242[] { var7, var9 };
				var7 = new class242(var10, 2);
				if (this.field1098 == 512) {
					var9.method5213();
				} else if (this.field1098 == 1024) {
					var9.method5213();
					var9.method5213();
				} else if (this.field1098 == 1536) {
					var9.method5213();
					var9.method5213();
					var9.method5213();
				}
				var9.method5143(this.field1056 - this.field945, this.field942 - this.field937, this.field1057 - this.field946);
			}
		}
		var7.field2942 = true;
		if (this.field1077.method5314() && client.field413 >= this.field1052 && client.field413 < this.field1053) {
			var7.method5158(this.field1077, (short) var8);
		} else {
			var7.method5262();
		}
		return var7;
	}

	@ObfuscatedName("cv.ay(B)Lid;")
	public class225 method2157() {
		return class225.field2626;
	}

	@ObfuscatedName("cv.an(Ldr;IILko;S)V")
	public final void method2172(class80 arg0, int arg1, int arg2, class281 arg3) {
		if (this.field1075.method8901() && this.field1075.method8916().field2486 == 1) {
			this.method2426();
		}
		this.method2393();
		if (arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
			this.method2383(arg1, arg2);
		} else if (this.field1040[0] >= 0 && this.field1040[0] < 104 && this.field1108[0] >= 0 && this.field1108[0] < 104) {
			if (class281.field3283 == arg3) {
				class70 var5 = this;
				class281 var6 = class281.field3283;
				int var7 = this.field1040[0];
				int var8 = this.field1108[0];
				int var9 = this.field1060;
				class276 var10 = arg0.field1176[arg0.field1171];
				if (var7 >= var9 && var7 < var10.method5746() - var9 && var8 >= var9 && var8 < var10.method5727() - var9 && arg1 >= var9 && arg1 < var10.method5746() - var9 && arg2 >= var9 && arg2 < var10.method5727() - var9) {
					int var11 = client.field318.method5881(var7, var8, var9, client.method7634(arg1, arg2), var10, true, client.field606, client.field607);
					if (var11 >= 1) {
						for (int var12 = 0; var12 < var11 - 1; var12++) {
							var5.method2382(client.field606[var12], client.field607[var12], var6);
						}
					}
				}
			}
			this.method2382(arg1, arg2, arg3);
		} else {
			this.method2383(arg1, arg2);
		}
	}

	@ObfuscatedName("cv.ar(III)V")
	public void method2144(int arg0, int arg1) {
		this.field1040[0] = arg0;
		this.field1108[0] = arg1;
		this.field1101 = 0;
	}

	@ObfuscatedName("cv.ae(I)Z")
	public final boolean method2132() {
		return this.field936 != null;
	}

	@ObfuscatedName("cv.ad(II)Z")
	public boolean method2146(int arg0) {
		return arg0 >= 2048;
	}

	@ObfuscatedName("cv.ag(II)Lis;")
	public class214 method2142(int arg0) {
		return class214.method2737(arg0 - 2048);
	}

	@ObfuscatedName("cv.av(B)I")
	public int method2148() {
		return this.method2399() ? 0 : this.field960;
	}
}
