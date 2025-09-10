package deob;

@ObfuscatedName("ji")
public abstract class class239 {

	@ObfuscatedName("ji.ar(Lit;Ljt;IIFFFFFFFFFFFFB)V")
	public void method5089(class231 arg0, class246 arg1, int arg2, int arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15) {
		float var17 = (float) class226.method4632() + arg4 * (float) class226.method4637() / arg12;
		float var18 = (float) class226.method4645() + arg8 * (float) class226.method4637() / arg12;
		float var19 = (float) class226.method4632() + arg5 * (float) class226.method4637() / arg13;
		float var20 = (float) class226.method4645() + arg9 * (float) class226.method4637() / arg13;
		float var21 = (float) class226.method4632() + arg6 * (float) class226.method4637() / arg14;
		float var22 = (float) class226.method4645() + arg10 * (float) class226.method4637() / arg14;
		float var23 = (float) class226.method4632() + arg7 * (float) class226.method4637() / arg15;
		float var24 = (float) class226.method4645() + arg11 * (float) class226.method4637() / arg15;
		float var25 = class241.method3597(arg12);
		float var26 = class241.method3597(arg13);
		float var27 = class241.method3597(arg14);
		float var28 = class241.method3597(arg15);
		class226.field2633.field3005 = 0;
		if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0.0F) {
			class226.field2633.field3003 = false;
			int var29 = class226.method4638();
			if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > (float) var29 || var23 > (float) var29 || var19 > (float) var29) {
				class226.field2633.field3003 = true;
			}
			if (class231.method4799(arg0.field2742, arg0.field2756, (int) var22, (int) var24, (int) var20, (int) var21, (int) var23, (int) var19)) {
				arg0.field2750 = arg2;
				arg0.field2776 = arg3;
				arg0.field2720 = class337.method6597(arg0.field2742, arg0.field2756, (int) var21, (int) var23, (int) var19, (int) var22, (int) var24, (int) var20, var27, var28, var26);
			}
			if (arg1.field2985 == -1) {
				if (arg1.field2989 != 12345678) {
					class226.method4644(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2989, arg1.field2988, arg1.field2991);
				}
			} else if (class231.field2698) {
				int var30 = class226.field2633.field3011.method5069(arg1.field2985);
				class226.method4644(var22, var24, var20, var21, var23, var19, var27, var28, var26, class231.method4798(var30, arg1.field2989), class231.method4798(var30, arg1.field2988), class231.method4798(var30, arg1.field2991));
			} else if (arg1.field2990) {
				class226.method4649(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2989, arg1.field2988, arg1.field2991, (int) arg4, (int) arg5, (int) arg7, (int) arg8, (int) arg9, (int) arg11, (int) arg12, (int) arg13, (int) arg15, arg1.field2985);
			} else {
				class226.method4649(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2989, arg1.field2988, arg1.field2991, (int) arg6, (int) arg7, (int) arg5, (int) arg10, (int) arg11, (int) arg9, (int) arg14, (int) arg15, (int) arg13, arg1.field2985);
			}
		}
		if ((var17 - var19) * (var24 - var20) - (var18 - var20) * (var23 - var19) <= 0.0F) {
			return;
		}
		class226.field2633.field3003 = false;
		int var31 = class226.method4638();
		if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > (float) var31 || var19 > (float) var31 || var23 > (float) var31) {
			class226.field2633.field3003 = true;
		}
		if (class231.method4799(arg0.field2742, arg0.field2756, (int) var18, (int) var20, (int) var24, (int) var17, (int) var19, (int) var23)) {
			arg0.field2750 = arg2;
			arg0.field2776 = arg3;
			arg0.field2720 = class337.method6597(arg0.field2742, arg0.field2756, (int) var17, (int) var19, (int) var23, (int) var18, (int) var20, (int) var24, var25, var26, var28);
		}
		if (arg1.field2985 == -1) {
			if (arg1.field2987 != 12345678) {
				class226.method4644(var18, var20, var24, var17, var19, var23, var25, var26, var28, arg1.field2987, arg1.field2991, arg1.field2988);
			}
		} else if (class231.field2698) {
			int var32 = class226.field2633.field3011.method5069(arg1.field2985);
			class226.method4644(var18, var20, var24, var17, var19, var23, var25, var26, var28, class231.method4798(var32, arg1.field2987), class231.method4798(var32, arg1.field2991), class231.method4798(var32, arg1.field2988));
		} else {
			class226.method4649(var18, var20, var24, var17, var19, var23, var25, var26, var28, arg1.field2987, arg1.field2991, arg1.field2988, (int) arg4, (int) arg5, (int) arg7, (int) arg8, (int) arg9, (int) arg11, (int) arg12, (int) arg13, (int) arg15, arg1.field2985);
		}
	}

	@ObfuscatedName("ji.ae(Lit;Ljp;III)V")
	public void method5088(class231 arg0, class240 arg1, int arg2, int arg3) {
		class226.field2633.field3005 = 0;
		int var5 = arg1.field2865.length;
		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = arg1.field2865[var6];
			int var8 = arg1.field2866[var6];
			int var9 = arg1.field2853[var6];
			float var10 = class240.field2851[var7];
			float var11 = class240.field2851[var8];
			float var12 = class240.field2851[var9];
			float var13 = class240.field2858[var7];
			float var14 = class240.field2858[var8];
			float var15 = class240.field2858[var9];
			float var16 = class240.field2867[var7];
			float var17 = class240.field2867[var8];
			float var18 = class240.field2867[var9];
			if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0.0F) {
				class226.field2633.field3003 = false;
				int var19 = class226.method4638();
				if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > (float) var19 || var11 > (float) var19 || var12 > (float) var19) {
					class226.field2633.field3003 = true;
				}
				if (class231.method4799(arg0.field2742, arg0.field2756, (int) var13, (int) var14, (int) var15, (int) var10, (int) var11, (int) var12)) {
					arg0.field2750 = arg2;
					arg0.field2776 = arg3;
					arg0.field2720 = class337.method6597(arg0.field2742, arg0.field2756, (int) var10, (int) var11, (int) var12, (int) var13, (int) var14, (int) var15, var16, var17, var18);
				}
				if (arg1.field2868 == null || arg1.field2868[var6] == -1) {
					if (arg1.field2862[var6] != 12345678) {
						class226.method4644(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2862[var6], arg1.field2863[var6], arg1.field2854[var6]);
					}
				} else if (class231.field2698) {
					int var20 = class226.field2633.field3011.method5069(arg1.field2868[var6]);
					class226.method4644(var13, var14, var15, var10, var11, var12, var16, var17, var18, class231.method4798(var20, arg1.field2862[var6]), class231.method4798(var20, arg1.field2863[var6]), class231.method4798(var20, arg1.field2854[var6]));
				} else if (arg1.field2860) {
					class226.method4649(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2862[var6], arg1.field2863[var6], arg1.field2854[var6], class240.field2856[0], class240.field2856[1], class240.field2856[3], class240.field2857[0], class240.field2857[1], class240.field2857[3], class240.field2855[0], class240.field2855[1], class240.field2855[3], arg1.field2868[var6]);
				} else {
					class226.method4649(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2862[var6], arg1.field2863[var6], arg1.field2854[var6], class240.field2856[var7], class240.field2856[var8], class240.field2856[var9], class240.field2857[var7], class240.field2857[var8], class240.field2857[var9], class240.field2855[var7], class240.field2855[var8], class240.field2855[var9], arg1.field2868[var6]);
				}
			}
		}
	}

	@ObfuscatedName("ji.aw(Lit;Ljt;IIIB)V")
	public abstract void method4711(class231 arg0, class246 arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("ji.at(Lit;Ljp;III)V")
	public abstract void method4714(class231 arg0, class240 arg1, int arg2, int arg3);

	@ObfuscatedName("ji.af(Liz;IIIIJ)V")
	public abstract void method4712(class234 arg0, int arg1, int arg2, int arg3, int arg4, long arg5);
}
