package deob;

@ObfuscatedName("ci")
public class class57 extends class234 {

	@ObfuscatedName("ci.af")
	public final class80 field815;

	@ObfuscatedName("ci.aw")
	public final int field807;

	@ObfuscatedName("ci.at")
	public final int field808;

	@ObfuscatedName("ci.ac")
	public final int field809;

	@ObfuscatedName("ci.ap")
	public final int field810;

	@ObfuscatedName("ci.aq")
	public final int field811;

	@ObfuscatedName("ci.ao")
	public final int field812;

	@ObfuscatedName("ci.as")
	public final class470 field819;

	@ObfuscatedName("ci.al")
	public final class470 field814;

	@ObfuscatedName("ci.au")
	public int field813;

	public class57(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class234 arg9) {
		this.field815 = arg0;
		this.field807 = arg1;
		this.field808 = arg2;
		this.field809 = arg3;
		this.field810 = arg4;
		this.field811 = arg5;
		this.field812 = arg6;
		this.field819 = new class470();
		this.field814 = new class470();
		if (arg7 != -1) {
			this.field819.method8908(arg7);
			this.field814.method8908(arg7);
			class216 var11 = this.field819.method8916();
			this.field813 = client.field413 - 1;
			if (arg8 && var11.field2494 != -1) {
				this.field819.method8915();
			}
			if (arg9 instanceof class57) {
				class57 var12 = (class57) arg9;
				if (var12.field819.method8931() == arg7) {
					if (var11.field2490 == 0) {
						this.field819.method8899(var12.field819);
						this.field813 = var12.field813;
					}
					this.field814.method8899(var12.field814);
				} else if (var12.field819.method8912()) {
					this.field814.method8899(var12.field819);
				} else {
					this.field814.method8899(var12.field814);
				}
			}
		}
	}

	@ObfuscatedName("ci.at(I)Ljn;")
	public final class242 method1847() {
		class213 var1 = class213.method8013(this.field807);
		if (var1.field2356 != null) {
			var1 = var1.method4310();
		}
		if (var1 == null) {
			return null;
		}
		int var2;
		int var3;
		if (this.field809 == 1 || this.field809 == 3) {
			var2 = var1.field2331;
			var3 = var1.field2330;
		} else {
			var2 = var1.field2330;
			var3 = var1.field2331;
		}
		int var4 = (var2 >> 1) + this.field811;
		int var5 = (var2 + 1 >> 1) + this.field811;
		int var6 = (var3 >> 1) + this.field812;
		int var7 = (var3 + 1 >> 1) + this.field812;
		int[][] var8 = this.field815.field1174[this.field810];
		int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
		int var10 = (this.field811 << 7) + (var2 << 6);
		int var11 = (this.field812 << 7) + (var3 << 6);
		int var12 = client.field413 - this.field813;
		this.field813 = client.field413;
		client.field400.method10043(this.field815, var10, var11, false);
		int var13 = class468.method3602(this.field819, var12, client.field400);
		client.field400.method10041();
		if ((var13 & 0x1) != 0 && (var13 & 0x8) != 0) {
			this.field819.method8947();
		}
		if (!this.field819.method8902(30)) {
			return var1.method4308(this.field808, this.field809, var8, var10, var9, var11, this.field819.method8916(), this.field819.method8900());
		}
		if (this.field814.method8901()) {
			int var14 = class468.method3602(this.field814, var12, null);
			if ((var14 & 0x1) != 0 && (var14 & 0x8) != 0) {
				this.field814.method8947();
			}
			if (!this.field814.method8902(30)) {
				return var1.method4308(this.field808, this.field809, var8, var10, var9, var11, this.field814.method8916(), this.field814.method8900());
			}
		}
		return null;
	}
}
