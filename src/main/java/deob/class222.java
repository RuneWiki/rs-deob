package deob;

@ObfuscatedName("ik")
public class class222 extends class545 {

	@ObfuscatedName("ik.aq")
	public int field2582;

	@ObfuscatedName("ik.ao")
	public int field2579;

	@ObfuscatedName("ik.as")
	public boolean field2584;

	@ObfuscatedName("ik.al")
	public int field2585;

	@ObfuscatedName("ik.au")
	public int field2586;

	@ObfuscatedName("ik.ai")
	public int[] field2587;

	@ObfuscatedName("ik.aa")
	public boolean field2588 = false;

	public class222(class591 arg0) {
		if (class586.field5891 <= 232) {
			this.field2579 = arg0.method10341();
			this.field2584 = arg0.method10339() == 1;
			arg0.method10339();
			this.field2582 = arg0.method10341();
			arg0.method10345();
			this.field2585 = arg0.method10339();
			this.field2586 = arg0.method10339();
		} else {
			this.field2582 = arg0.method10341();
			this.field2579 = arg0.method10341();
			this.field2584 = arg0.method10339() == 1;
			this.field2585 = arg0.method10339();
			this.field2586 = arg0.method10339();
		}
		this.field2587 = null;
	}

	@ObfuscatedName("ik.af(DILpx;)Z")
	public boolean method4621(double arg0, int arg1, class413 arg2) {
		if (arg2.method7754(this.field2582) == null) {
			return false;
		}
		int var5 = arg1 * arg1;
		this.field2587 = new int[var5];
		int var6 = this.field2582;
		class605 var7;
		if (class607.method9130(arg2, var6)) {
			var7 = class607.method8274();
		} else {
			var7 = null;
		}
		var7.method10778();
		int[] var9 = var7.field6007;
		for (int var10 = 0; var10 < var9.length; var10++) {
			var9[var10] = class226.method4691(var9[var10], arg0);
		}
		byte[] var11 = var7.field6013;
		if (var7.field6008 == arg1) {
			for (int var12 = 0; var12 < var5; var12++) {
				this.field2587[var12] = var9[var11[var12] & 0xFF];
			}
		} else if (var7.field6008 == 64 && arg1 == 128) {
			int var13 = 0;
			for (int var14 = 0; var14 < arg1; var14++) {
				for (int var15 = 0; var15 < arg1; var15++) {
					this.field2587[var13++] = var9[var11[(var14 >> 1 << 6) + (var15 >> 1)] & 0xFF];
				}
			}
		} else if (var7.field6008 == 128 && arg1 == 64) {
			int var16 = 0;
			for (int var17 = 0; var17 < arg1; var17++) {
				for (int var18 = 0; var18 < arg1; var18++) {
					this.field2587[var16++] = var9[var11[(var17 << 1 << 7) + (var18 << 1)] & 0xFF];
				}
			}
		} else {
			throw new RuntimeException();
		}
		return true;
	}

	@ObfuscatedName("ik.aw()V")
	public void method4614() {
		this.field2587 = null;
	}

	@ObfuscatedName("ik.at(I)V")
	public void method4613(int arg0) {
		if (this.field2587 == null || this.field2585 < 1 || this.field2585 > 4) {
			return;
		}
		if (Statics.field2581 == null || Statics.field2581.length < this.field2587.length) {
			Statics.field2581 = new int[this.field2587.length];
		}
		short var2;
		if (this.field2587.length == 4096) {
			var2 = 64;
		} else {
			var2 = 128;
		}
		int var3 = this.field2587.length;
		if (this.field2585 == 1 || this.field2585 == 2) {
			int var4 = arg0 * var2 * this.field2586;
			int var5 = var3 - 1;
			if (this.field2585 == 1) {
				var4 = -var4;
			}
			for (int var6 = 0; var6 < var3; var6++) {
				int var7 = var4 + var6 & var5;
				Statics.field2581[var6] = this.field2587[var7];
			}
		}
		if (this.field2585 == 3 || this.field2585 == 4) {
			int var8 = this.field2586 * arg0;
			int var9 = var2 - 1;
			if (this.field2585 == 3) {
				var8 = -var8;
			}
			for (int var10 = 0; var10 < var3; var10 += var2) {
				for (int var11 = 0; var11 < var2; var11++) {
					int var12 = var10 + var11;
					int var13 = (var8 + var11 & var9) + var10;
					Statics.field2581[var12] = this.field2587[var13];
				}
			}
		}
		int[] var14 = this.field2587;
		this.field2587 = Statics.field2581;
		Statics.field2581 = var14;
	}
}
