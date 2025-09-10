package deob;

@ObfuscatedName("ix")
public class class232 extends class239 {

	@ObfuscatedName("ix.af")
	public class455 field2792;

	@ObfuscatedName("ix.aw")
	public float[] field2791 = new float[3];

	@ObfuscatedName("ix.at")
	public long field2787 = 0L;

	public class232(class455 arg0) {
		this.field2792 = arg0;
	}

	@ObfuscatedName("ix.ai(J)V")
	public void method5045(long arg0) {
		this.field2787 = arg0;
	}

	@ObfuscatedName("ix.af(Liz;IIIIJ)V")
	public void method4712(class234 arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
		int var8 = class243.field2968;
		if (this.field2787 != 0L) {
			boolean var10 = arg5 != 0L;
			if (var10) {
				boolean var11 = (int) (arg5 >>> 19 & 0x1L) == 1;
				var10 = !var11;
			}
			boolean var14 = !var10;
			if (!var14) {
				long var15 = this.field2787;
				boolean var17 = var15 != 0L;
				if (var17) {
					boolean var18 = (int) (var15 >>> 19 & 0x1L) == 1;
					var17 = !var18;
				}
				var14 = var17;
			}
			if (var14) {
				long var21 = this.field2787;
				long var23 = var21 & 0xFFFFFFFFFFF7FFFFL;
				arg5 = var23;
			}
		}
		arg0.method5054(arg1, this.field2792, arg2, arg3, arg4, arg5);
		if (this.field2787 == 0L) {
			return;
		}
		int var26 = class243.field2968;
		if (var8 == var26) {
			return;
		}
		long var27 = this.field2787;
		boolean var29 = var27 != 0L;
		if (var29) {
			boolean var30 = (int) (var27 >>> 19 & 0x1L) == 1;
			var29 = !var30;
		}
		this.field2787 = class243.method3407(0, 0, 0, 5, !var29, 0, 0);
	}

	@ObfuscatedName("ix.aw(Lit;Ljt;IIIB)V")
	public void method4711(class231 arg0, class246 arg1, int arg2, int arg3, int arg4) {
		float var6;
		float var7 = var6 = arg3 << 7;
		float var8;
		float var9 = var8 = arg4 << 7;
		float var10;
		float var11 = var10 = var7 + 128.0F;
		float var12;
		float var13 = var12 = var9 + 128.0F;
		float var14 = (float) arg0.field2729[arg2][arg3][arg4];
		float var15 = (float) arg0.field2729[arg2][arg3 + 1][arg4];
		float var16 = (float) arg0.field2729[arg2][arg3 + 1][arg4 + 1];
		float var17 = (float) arg0.field2729[arg2][arg3][arg4 + 1];
		this.field2792.method8429(var7, var14, var9, this.field2791);
		float var18 = this.field2791[0];
		float var19 = this.field2791[1];
		float var20 = this.field2791[2];
		if (var20 < 50.0F) {
			return;
		}
		this.field2792.method8429(var11, var15, var8, this.field2791);
		float var21 = this.field2791[0];
		float var22 = this.field2791[1];
		float var23 = this.field2791[2];
		if (var23 < 50.0F) {
			return;
		}
		this.field2792.method8429(var10, var16, var13, this.field2791);
		float var24 = this.field2791[0];
		float var25 = this.field2791[1];
		float var26 = this.field2791[2];
		if (var26 < 50.0F) {
			return;
		}
		this.field2792.method8429(var6, var17, var12, this.field2791);
		float var27 = this.field2791[0];
		float var28 = this.field2791[1];
		float var29 = this.field2791[2];
		if (!(var29 < 50.0F)) {
			this.method5089(arg0, arg1, arg3, arg4, var18, var21, var24, var27, var19, var22, var25, var28, var20, var23, var26, var29);
		}
	}

	@ObfuscatedName("ix.at(Lit;Ljp;III)V")
	public void method4714(class231 arg0, class240 arg1, int arg2, int arg3) {
		int var5 = arg1.field2859.length;
		for (int var6 = 0; var6 < var5; var6++) {
			float var7 = (float) arg1.field2859[var6];
			float var8 = (float) arg1.field2869[var6];
			float var9 = (float) arg1.field2861[var6];
			this.field2792.method8429(var7, var8, var9, this.field2791);
			float var10 = this.field2791[0];
			float var11 = this.field2791[1];
			float var12 = this.field2791[2];
			if (var12 < 50.0F) {
				return;
			}
			if (arg1.field2868 != null) {
				class240.field2856[var6] = (int) var10;
				class240.field2857[var6] = (int) var11;
				class240.field2855[var6] = (int) var12;
			}
			class240.field2851[var6] = (float) class226.method4632() + var10 * (float) class226.method4637() / var12;
			class240.field2858[var6] = (float) class226.method4645() + var11 * (float) class226.method4637() / var12;
			class240.field2867[var6] = class241.method3597(var12);
		}
		this.method5088(arg0, arg1, arg2, arg3);
	}
}
