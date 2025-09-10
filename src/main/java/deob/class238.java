package deob;

@ObfuscatedName("jb")
public class class238 implements class252 {

	@ObfuscatedName("jb.af")
	public class222[] field2840;

	@ObfuscatedName("jb.aw")
	public class437 field2836 = new class437();

	@ObfuscatedName("jb.at")
	public int field2838;

	@ObfuscatedName("jb.ac")
	public int field2839 = 0;

	@ObfuscatedName("jb.ap")
	public double field2842 = 1.0D;

	@ObfuscatedName("jb.aq")
	public int field2841 = 128;

	@ObfuscatedName("jb.ao")
	public class413 field2837;

	public class238(class413 arg0, class413 arg1, int arg2, double arg3, int arg4) {
		this.field2837 = arg1;
		this.field2838 = arg2;
		this.field2839 = this.field2838;
		this.field2842 = arg3;
		this.field2841 = arg4;
		int[] var7 = arg0.method7708(0);
		if (var7 == null) {
			this.field2840 = new class222[0];
		} else {
			int var8 = var7.length;
			this.field2840 = new class222[arg0.method7702(0)];
			for (int var9 = 0; var9 < var8; var9++) {
				class591 var10 = new class591(arg0.method7692(0, var7[var9]));
				this.field2840[var7[var9]] = new class222(var10);
			}
		}
	}

	@ObfuscatedName("jb.af(I)I")
	public int method5066() {
		if (this.field2840.length == 0) {
			return 100;
		}
		int var1 = 0;
		int var2 = 0;
		class222[] var3 = this.field2840;
		for (int var4 = 0; var4 < var3.length; var4++) {
			class222 var5 = var3[var4];
			if (var5 != null && var5.field2582 != -1) {
				var1++;
				if (this.field2837.method7732(var5.field2582)) {
					var2++;
				}
			}
		}
		if (var1 == 0) {
			return 0;
		} else {
			return var2 * 100 / var1;
		}
	}

	@ObfuscatedName("jb.aw(D)V")
	public void method5067(double arg0) {
		this.field2842 = arg0;
		this.method5071();
	}

	@ObfuscatedName("jb.at(II)[I")
	public int[] method5082(int arg0) {
		class222 var2 = this.field2840[arg0];
		if (var2 != null) {
			if (var2.field2587 != null) {
				this.field2836.method8031(var2);
				var2.field2588 = true;
				return var2.field2587;
			}
			boolean var3 = var2.method4621(this.field2842, this.field2841, this.field2837);
			if (var3) {
				if (this.field2839 == 0) {
					class222 var4 = (class222) this.field2836.method8039();
					var4.method4614();
				} else {
					this.field2839--;
				}
				this.field2836.method8031(var2);
				var2.field2588 = true;
				return var2.field2587;
			}
		}
		return null;
	}

	@ObfuscatedName("jb.ac(IB)I")
	public int method5069(int arg0) {
		return this.field2840[arg0] == null ? 0 : this.field2840[arg0].field2579;
	}

	@ObfuscatedName("jb.ap(IS)Z")
	public boolean method5070(int arg0) {
		return this.field2840[arg0].field2584;
	}

	@ObfuscatedName("jb.aq(B)V")
	public void method5071() {
		for (int var1 = 0; var1 < this.field2840.length; var1++) {
			if (this.field2840[var1] != null) {
				this.field2840[var1].method4614();
			}
		}
		this.field2836 = new class437();
		this.field2839 = this.field2838;
	}

	@ObfuscatedName("jb.ao(II)V")
	public void method5086(int arg0) {
		for (int var2 = 0; var2 < this.field2840.length; var2++) {
			class222 var3 = this.field2840[var2];
			if (var3 != null && var3.field2585 != 0 && var3.field2588) {
				var3.method4613(arg0);
				var3.field2588 = false;
			}
		}
	}
}
