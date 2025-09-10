package deob;

@ObfuscatedName("xx")
public class class611 {

	@ObfuscatedName("xx.af")
	public boolean field6054;

	@ObfuscatedName("xx.aw")
	public int field6053 = 0;

	@ObfuscatedName("xx.at")
	public int[] field6068;

	@ObfuscatedName("xx.ac")
	public int[] field6055;

	@ObfuscatedName("xx.ap")
	public int[] field6056;

	@ObfuscatedName("xx.aq")
	public int[] field6065;

	@ObfuscatedName("xx.ao")
	public int[] field6058;

	@ObfuscatedName("xx.as")
	public int[] field6061;

	@ObfuscatedName("xx.al")
	public String[] field6057;

	@ObfuscatedName("xx.au")
	public String[] field6063;

	@ObfuscatedName("xx.ai")
	public class611[] field6062;

	@ObfuscatedName("xx.aa")
	public boolean[] field6052;

	@ObfuscatedName("xx.am")
	public int field6064;

	@ObfuscatedName("xx.an")
	public int field6059;

	@ObfuscatedName("xx.ar")
	public int field6066;

	@ObfuscatedName("xx.ae")
	public int field6067;

	@ObfuscatedName("xx.ay")
	public int field6060;

	@ObfuscatedName("xx.ad")
	public int field6069;

	@ObfuscatedName("xx.ag")
	public long field6070;

	public class611(boolean arg0) {
		int var2 = arg0 ? 500 : 20;
		this.field6054 = arg0;
		this.field6068 = new int[var2];
		this.field6055 = new int[var2];
		this.field6056 = new int[var2];
		this.field6065 = new int[var2];
		this.field6058 = new int[var2];
		this.field6061 = new int[var2];
		this.field6057 = new String[var2];
		this.field6063 = new String[var2];
		this.field6062 = new class611[var2];
		this.field6052 = new boolean[var2];
	}

	@ObfuscatedName("xx.af(II)Ljava/lang/String;")
	public final String method10972(int arg0) {
		if (arg0 < 0) {
			return "";
		} else if (this.field6063[arg0].isEmpty()) {
			return this.field6057[arg0];
		} else {
			return this.field6057[arg0] + class394.field4637 + this.field6063[arg0];
		}
	}

	@ObfuscatedName("xx.aw(I)V")
	public void method10974() {
		this.field6066 = Statics.field3832.method8758(class394.field4648);
		for (int var1 = 0; var1 < this.field6053; var1++) {
			int var2 = Statics.field3832.method8758(this.method10972(var1));
			if (this.field6062[var1] != null) {
				var2 += 15;
			}
			if (var2 > this.field6066) {
				this.field6066 = var2;
			}
		}
		this.field6066 += 8;
		this.field6067 = this.field6053 * 529411151 + 427507460;
		if (this.field6054) {
			this.field6067 += -223700078;
		}
	}

	@ObfuscatedName("xx.at(III)V")
	public final void method10981(int arg0, int arg1) {
		this.method10974();
		this.field6064 = arg0 - this.field6066 / 2;
		if (this.field6066 + this.field6064 > Statics.field208) {
			this.field6064 = Statics.field208 - this.field6066;
		}
		if (this.field6064 < 0) {
			this.field6064 = 0;
		}
		this.field6059 = arg1;
		if (this.field6067 * 758988865 + this.field6059 > Statics.field4810) {
			this.field6059 = Statics.field4810 - this.field6067 * 758988865;
		}
		if (this.field6059 < 0) {
			this.field6059 = 0;
		}
		if (this.field6060 != -1 && this.field6062[this.field6060] != null) {
			this.field6062[this.field6060].method10982(this);
		}
	}

	@ObfuscatedName("xx.ac(Lxx;B)V")
	public final void method10982(class611 arg0) {
		this.method10974();
		this.field6064 = arg0.field6066 + arg0.field6064;
		if (this.field6066 + this.field6064 > Statics.field208) {
			this.field6064 = arg0.field6064 - this.field6066;
		}
		if (this.field6064 < 0) {
			this.field6064 = 0;
		}
		int var2 = arg0.field6059 + (arg0.field6053 * 15 - 15 - arg0.field6060 * 15);
		if (arg0.field6054) {
			var2 += 17;
		}
		int var3 = var2 + 19;
		this.field6059 = var2;
		if (this.field6067 * 758988865 + this.field6059 > Statics.field4810) {
			this.field6059 = var3 - this.field6067 * 758988865;
		}
		if (this.field6059 < 0) {
			this.field6059 = 0;
		}
	}

	@ObfuscatedName("xx.ap(III)I")
	public final int method10998(int arg0, int arg1) {
		for (int var3 = 0; var3 < this.field6053; var3++) {
			int var4 = (this.field6053 - 1 - var3) * 15 + this.field6059 + 14;
			if (this.field6054) {
				var4 += 17;
			}
			if (arg0 > this.field6064 && arg0 < this.field6066 + this.field6064 && arg1 > var4 - 13 && arg1 < var4 + 3) {
				return var3;
			}
		}
		return -1;
	}

	@ObfuscatedName("xx.aq(II)V")
	public final void method10976(int arg0) {
		if (arg0 >= 0) {
			client.method9046(this.field6068[arg0], this.field6055[arg0], this.field6056[arg0], this.field6065[arg0], this.field6058[arg0], this.field6061[arg0], this.field6057[arg0], this.field6063[arg0], class36.field222, class36.field225);
		}
	}

	@ObfuscatedName("xx.ao(III)Z")
	public final boolean method11013(int arg0, int arg1) {
		if (this.field6060 != -1 && this.field6062[this.field6060] != null && this.field6062[this.field6060].method11013(arg0, arg1)) {
			return true;
		} else if (arg0 >= this.field6064 - 10 && arg0 <= this.field6066 + this.field6064 + 10 && arg1 >= this.field6059 - 10 && arg1 <= this.field6067 * 758988865 + this.field6059 + 10) {
			int var3 = this.method10998(arg0, arg1);
			if (var3 != -1 && this.field6060 != var3) {
				if (this.field6069 != var3) {
					this.field6069 = var3;
					this.field6070 = class335.method3987();
					if (this.field6060 != -1) {
						this.field6070 += 300L;
					}
				}
				if (this.field6070 <= class335.method3987()) {
					this.field6069 = -1;
					this.method10979();
					if (this.field6062[var3] != null) {
						this.field6060 = var3;
						this.field6062[var3].method10982(this);
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("xx.as(III)Z")
	public final boolean method10978(int arg0, int arg1) {
		if (this.field6060 != -1 && this.field6062[this.field6060] != null && this.field6062[this.field6060].method10978(arg0, arg1)) {
			return true;
		}
		int var3 = this.method10998(arg0, arg1);
		if (var3 == -1) {
			return false;
		} else {
			this.method10976(var3);
			return true;
		}
	}

	@ObfuscatedName("xx.al(I)V")
	public final void method11001() {
		this.field6060 = -1;
		for (int var1 = 0; var1 < this.field6053; var1++) {
			if (this.field6062[var1] != null) {
				this.field6062[var1].method11001();
			}
		}
	}

	@ObfuscatedName("xx.au(I)V")
	public final void method10980() {
		client.method5794(this.field6064, this.field6059, this.field6066, this.field6067 * 758988865);
		this.method10979();
	}

	@ObfuscatedName("xx.ai(B)V")
	public final void method10979() {
		if (this.field6060 != -1) {
			if (this.field6062[this.field6060] != null) {
				this.field6062[this.field6060].method10980();
			}
			this.field6060 = -1;
		}
	}

	@ObfuscatedName("xx.aa(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)I")
	public final int method10992(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		if (this.field6053 >= this.field6057.length) {
			return -1;
		}
		this.field6057[this.field6053] = arg0;
		this.field6063[this.field6053] = arg1;
		this.field6056[this.field6053] = arg2;
		this.field6065[this.field6053] = arg3;
		this.field6068[this.field6053] = arg4;
		this.field6055[this.field6053] = arg5;
		this.field6058[this.field6053] = arg6;
		this.field6061[this.field6053] = arg8;
		this.field6052[this.field6053] = arg7;
		this.field6062[this.field6053] = null;
		return ++this.field6053 - 1;
	}

	@ObfuscatedName("xx.am(I)V")
	public final void method10990() {
		int var1 = this.field6064;
		int var2 = this.field6059;
		int var3 = 6116423;
		class602.method10682(var1, var2, this.field6066, this.field6067 * 758988865, var3);
		if (this.field6054) {
			class602.method10682(var1 + 1, var2 + 1, this.field6066 - 2, 16, 0);
			class602.method10686(var1 + 1, var2 + 18, this.field6066 - 2, this.field6067 * 758988865 - 19, 0);
			Statics.field3832.method8763(class394.field4648, var1 + 3, var2 + 14, var3, -1);
		} else {
			class602.method10686(var1 + 1, var2 + 1, this.field6066 - 2, this.field6067 * 758988865 - 2, 0);
		}
		int var4 = class36.field232;
		int var5 = class36.field221;
		for (int var6 = 0; var6 < this.field6053; var6++) {
			int var7 = (this.field6053 - 1 - var6) * 15 + var2 + 14;
			if (this.field6054) {
				var7 += 17;
			}
			int var8 = 16777215;
			if (var4 > var1 && var4 < this.field6066 + var1 && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}
			if (this.field6060 == var6 || this.field6069 == var6 && this.field6062[var6] != null) {
				class602.method10682(var1 + 2, var7 - 12, this.field6066 - 4, 15, 7496785);
			}
			Statics.field3832.method8763(this.method10972(var6), var1 + 3, var7, var8, 0);
			if (this.field6062[var6] != null) {
				Statics.field3832.method8777(62, this.field6066 + var1 - 10, var7, 16777215);
			}
		}
		client.method98(this.field6064, this.field6059, this.field6066, this.field6067 * 758988865);
		if (this.field6060 != -1 && this.field6062[this.field6060] != null) {
			this.field6062[this.field6060].method10990();
		}
	}
}
