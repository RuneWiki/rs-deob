package deob;

@ObfuscatedName("iv")
public class class227 extends class239 {

	@ObfuscatedName("iv.af")
	public int field2647;

	@ObfuscatedName("iv.aw")
	public int field2643;

	@ObfuscatedName("iv.at")
	public int field2644;

	@ObfuscatedName("iv.ac")
	public int field2646;

	@ObfuscatedName("iv.ap")
	public int field2648;

	@ObfuscatedName("iv.aq")
	public float field2652;

	@ObfuscatedName("iv.ao")
	public float field2649;

	@ObfuscatedName("iv.as")
	public float field2650;

	@ObfuscatedName("iv.al")
	public float field2651;

	@ObfuscatedName("iv.au")
	public int field2645;

	@ObfuscatedName("iv.ai")
	public int field2653;

	public class227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.field2647 = arg0;
		this.field2643 = arg1;
		this.field2644 = arg2;
		this.field2646 = arg3;
		this.field2648 = arg4;
		this.field2652 = class226.field2631[arg3];
		this.field2649 = class226.field2639[arg3];
		this.field2650 = class226.field2631[arg4];
		this.field2651 = class226.field2639[arg4];
		this.field2645 = arg5;
		this.field2653 = arg6;
	}

	@ObfuscatedName("iv.af(Liz;IIIIJ)V")
	public void method4712(class234 arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
		arg0.method4871(arg1, this.field2646, this.field2648, arg2, arg3, arg4, this.field2647, this.field2643, this.field2644, arg5, this.field2645, this.field2653, false);
	}

	@ObfuscatedName("iv.aw(Lit;Ljt;IIIB)V")
	public void method4711(class231 arg0, class246 arg1, int arg2, int arg3, int arg4) {
		float var6;
		float var7 = var6 = (arg3 << 7) - this.field2647;
		float var8;
		float var9 = var8 = (arg4 << 7) - this.field2644;
		float var10;
		float var11 = var10 = var7 + 128.0F;
		float var12;
		float var13 = var12 = var9 + 128.0F;
		float var14 = (float) (arg0.field2729[arg2][arg3][arg4] - this.field2643);
		float var15 = (float) (arg0.field2729[arg2][arg3 + 1][arg4] - this.field2643);
		float var16 = (float) (arg0.field2729[arg2][arg3 + 1][arg4 + 1] - this.field2643);
		float var17 = (float) (arg0.field2729[arg2][arg3][arg4 + 1] - this.field2643);
		float var18 = this.field2651 * var7 + this.field2650 * var9;
		float var19 = this.field2651 * var9 - this.field2650 * var7;
		float var21 = this.field2649 * var14 - this.field2652 * var19;
		float var22 = this.field2652 * var14 + this.field2649 * var19;
		if (var22 < 50.0F) {
			return;
		}
		float var24 = this.field2651 * var11 + this.field2650 * var8;
		float var25 = this.field2651 * var8 - this.field2650 * var11;
		float var27 = this.field2649 * var15 - this.field2652 * var25;
		float var28 = this.field2652 * var15 + this.field2649 * var25;
		if (var28 < 50.0F) {
			return;
		}
		float var30 = this.field2651 * var10 + this.field2650 * var13;
		float var31 = this.field2651 * var13 - this.field2650 * var10;
		float var33 = this.field2649 * var16 - this.field2652 * var31;
		float var34 = this.field2652 * var16 + this.field2649 * var31;
		if (var34 < 50.0F) {
			return;
		}
		float var36 = this.field2651 * var6 + this.field2650 * var12;
		float var37 = this.field2651 * var12 - this.field2650 * var6;
		float var39 = this.field2649 * var17 - this.field2652 * var37;
		float var40 = this.field2652 * var17 + this.field2649 * var37;
		if (!(var40 < 50.0F)) {
			this.method5089(arg0, arg1, arg3, arg4, var18, var24, var30, var36, var21, var27, var33, var39, var22, var28, var34, var40);
		}
	}

	@ObfuscatedName("iv.at(Lit;Ljp;III)V")
	public void method4714(class231 arg0, class240 arg1, int arg2, int arg3) {
		int var5 = arg1.field2859.length;
		for (int var6 = 0; var6 < var5; var6++) {
			float var7 = (float) (arg1.field2859[var6] - this.field2647);
			float var8 = (float) (arg1.field2869[var6] - this.field2643);
			float var9 = (float) (arg1.field2861[var6] - this.field2644);
			float var10 = this.field2651 * var7 + this.field2650 * var9;
			float var11 = this.field2651 * var9 - this.field2650 * var7;
			float var13 = this.field2649 * var8 - this.field2652 * var11;
			float var14 = this.field2652 * var8 + this.field2649 * var11;
			if (var14 < 50.0F) {
				return;
			}
			if (arg1.field2868 != null) {
				class240.field2856[var6] = (int) var10;
				class240.field2857[var6] = (int) var13;
				class240.field2855[var6] = (int) var14;
			}
			class240.field2851[var6] = (float) class226.method4632() + var10 * (float) class226.method4637() / var14;
			class240.field2858[var6] = (float) class226.method4645() + var13 * (float) class226.method4637() / var14;
			class240.field2867[var6] = class241.method3597(var14);
		}
		this.method5088(arg0, arg1, arg2, arg3);
	}
}
