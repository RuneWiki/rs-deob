package deob;

@ObfuscatedName("jy")
public class class249 extends class229 {

	public class249(class248 arg0) {
		super(arg0);
	}

	@ObfuscatedName("jy.bv(FF)I")
	public static final int method5376(float arg0, float arg1) {
		return Float.floatToRawIntBits(arg0 - arg1) >> 31;
	}

	@ObfuscatedName("jy.bj([I[FIIFI)V")
	public final void method5348(int[] arg0, float[] arg1, int arg2, int arg3, float arg4, int arg5) {
		int var7 = this.field2669.field3017 & arg5;
		int var8 = this.field2669.field3020 & arg5;
		arg0[arg2] = var7 & arg3 | ~var7 & arg0[arg2];
		int var9 = var8 & Float.floatToRawIntBits(arg4);
		int var10 = ~var8 & Float.floatToRawIntBits(arg1[arg2]);
		arg1[arg2] = Float.intBitsToFloat(var9 | var10);
	}

	@ObfuscatedName("jy.bm([I[F[IIIIF)V")
	public final void method5349(int[] arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, float arg6) {
		int var8 = arg2[(arg5 >>> 25) + (arg5 & 0x3F80)];
		int var9 = ((var8 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((var8 & 0xFF00) * arg4 & 0xFF0000) >> 8;
		this.method5348(arg0, arg1, arg3, var9, arg6, method5376(arg1[arg3], arg6));
	}

	@ObfuscatedName("jy.bf([I[F[IIIIIF)V")
	public final void method5350(int[] arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, float arg7) {
		int var9 = arg2[(arg6 >>> 25) + (arg6 & 0x3F80)];
		int var10 = ((var9 & 0xFF00FF) * arg5 & 0xFF00FF00 | (var9 & 0xFF00) * arg5 & 0xFF0000) >> 8;
		int var11 = arg0[arg3];
		int var12 = (((var11 & 0xFF00FF) * arg4 & 0xFF00FF00 | (var11 & 0xFF00) * arg4 & 0xFF0000) >> 8) + var10;
		int var13 = this.field2669.field3017 & method5376(arg1[arg3], arg7);
		arg0[arg3] = (~var13 & var11) + (var13 & var12);
	}

	@ObfuscatedName("jy.bw([I[F[IIIIF)V")
	public final void method5360(int[] arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, float arg6) {
		int var8 = arg2[(arg5 >>> 25) + (arg5 & 0x3F80)];
		if (var8 != 0) {
			int var9 = ((var8 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((var8 & 0xFF00) * arg4 & 0xFF0000) >> 8;
			this.method5348(arg0, arg1, arg3, var9, arg6, method5376(arg1[arg3], arg6));
		}
	}

	@ObfuscatedName("jy.bc([I[F[IIIIIF)V")
	public final void method5387(int[] arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, float arg7) {
		int var9 = arg2[(arg6 >>> 25) + (arg6 & 0x3F80)];
		if (var9 == 0) {
			return;
		}
		int var10 = ((var9 & 0xFF00FF) * arg5 & 0xFF00FF00 | (var9 & 0xFF00) * arg5 & 0xFF0000) >> 8;
		int var11 = arg0[arg3];
		int var12 = (((var11 & 0xFF00FF) * arg4 & 0xFF00FF00 | (var11 & 0xFF00) * arg4 & 0xFF0000) >> 8) + var10;
		int var13 = this.field2669.field3017 & method5376(arg1[arg3], arg7);
		arg0[arg3] = (~var13 & var11) + (var13 & var12);
	}

	@ObfuscatedName("jy.cw([I[FIIF)V")
	public final void method5353(int[] arg0, float[] arg1, int arg2, int arg3, float arg4) {
		this.method5348(arg0, arg1, arg2, arg3, arg4, method5376(arg1[arg2], arg4));
	}

	@ObfuscatedName("jy.cz([I[FIIF)V")
	public final void method5352(int[] arg0, float[] arg1, int arg2, int arg3, float arg4) {
		this.method5348(arg0, arg1, arg2, this.field2668[arg3], arg4, method5376(arg1[arg2], arg4));
	}

	@ObfuscatedName("jy.cf([I[FIIIF)V")
	public final void method5354(int[] arg0, float[] arg1, int arg2, int arg3, int arg4, float arg5) {
		int var7 = arg0[arg2];
		int var8 = ((var7 & 0xFF00) * arg4 >> 8 & 0xFF00) + ((var7 & 0xFF00FF) * arg4 >> 8 & 0xFF00FF) + arg3;
		int var9 = this.field2669.field3017 & method5376(arg1[arg2], arg5);
		arg0[arg2] = (~var9 & var7) + (var9 & var8);
	}

	@ObfuscatedName("jy.cg([I[FIIIIF)V")
	public final void method5347(int[] arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, float arg6) {
		int var8 = this.field2668[arg3];
		int var9 = ((var8 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((var8 & 0xFF00) * arg5 >> 8 & 0xFF00);
		int var10 = arg0[arg2];
		int var11 = ((var10 & 0xFF00) * arg4 >> 8 & 0xFF00) + ((var10 & 0xFF00FF) * arg4 >> 8 & 0xFF00FF) + var9;
		int var12 = this.field2669.field3017 & method5376(arg1[arg2], arg6);
		arg0[arg2] = (~var12 & var10) + (var12 & var11);
	}

	@ObfuscatedName("jy.aq()Z")
	public boolean method4752() {
		return true;
	}

	@ObfuscatedName("jy.ci(FFFFF)F")
	public float method5355(float arg0, float arg1, float arg2, float arg3, float arg4) {
		float var6 = arg2 - arg0 * arg3 + arg3;
		if (arg1 < 0.0F) {
			var6 -= (float) arg1 * arg4;
		}
		return var6 - (arg1 - (float) (arg1 + 0.5F)) * arg4;
	}

	@ObfuscatedName("jy.au(FFFFFFFFFIII)V")
	public void method4755(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
		float var13 = (float) (arg3 + 0.5F);
		float var14 = (float) (arg4 + 0.5F);
		float var15 = (float) (arg5 + 0.5F);
		float var16 = (float) (arg0 + 0.5F);
		float var17 = (float) (arg1 + 0.5F);
		float var18 = (float) (arg2 + 0.5F);
		float var19 = var14 - var13;
		float var20 = var17 - var16;
		float var21 = var15 - var13;
		float var22 = var18 - var16;
		float var23 = var19 * var22 - var20 * var21;
		if (var23 == 0.0F) {
			return;
		}
		float var24 = (float) arg9;
		float var25 = (float) arg10;
		float var26 = (float) arg11;
		float var27 = var25 - var24;
		float var28 = var26 - var24;
		float var29 = (var22 * var27 - var20 * var28) / var23;
		float var30 = (var19 * var28 - var21 * var27) / var23;
		float var31 = arg4 - arg3;
		float var32 = arg1 - arg0;
		float var33 = arg5 - arg3;
		float var34 = arg2 - arg0;
		float var35 = var31 * var34 - var32 * var33;
		if (var35 == 0.0F) {
			return;
		}
		float var36 = arg7 - arg6;
		float var37 = arg8 - arg6;
		float var38 = (var34 * var36 - var32 * var37) / var35;
		float var39 = (var31 * var37 - var33 * var36) / var35;
		float var40;
		if (var17 == var18) {
			var40 = 0.0F;
		} else {
			var40 = (var15 - var14) / (var18 - var17);
		}
		float var41;
		if (var16 == var17) {
			var41 = 0.0F;
		} else {
			var41 = var19 / var20;
		}
		float var42;
		if (var16 == var18) {
			var42 = 0.0F;
		} else {
			var42 = var21 / var22;
		}
		int[] var43 = this.field2669.field3016;
		int var44 = this.field2669.field3010;
		if (var16 <= var17 && var16 <= var18) {
			if (!(var16 >= (float) var44)) {
				if (var17 > (float) var44) {
					var17 = var44;
				}
				if (var18 > (float) var44) {
					var18 = var44;
				}
				float var45 = var24 - var13 * var29 + var29;
				float var46 = this.method5355(arg3, arg0, arg6, var38, var39);
				if (var17 < var18) {
					float var47 = var13;
					if (var16 < 0.0F) {
						var47 = var13 - var16 * var42;
						var13 -= var16 * var41;
						var45 -= var16 * var30;
						var16 = 0.0F;
					}
					if (var17 < 0.0F) {
						var14 -= var17 * var40;
						var17 = 0.0F;
					}
					if (var16 != var17 && var42 < var41 || var16 == var17 && var42 > var40) {
						float var48 = (float) (var16 + 0.5F);
						float var49 = (float) (var17 + 0.5F);
						float var50 = (float) (var18 + 0.5F) - var49;
						float var51 = var49 - var48;
						int var52 = var43[(int) var48];
						while (--var51 >= 0.0F) {
							this.method5363(Statics.field5989, var52, 0, 0, (int) var47, (int) var13, var45, var29, var46, var38);
							var47 += var42;
							var13 += var41;
							var45 += var30;
							var52 += Statics.field5990;
							var46 += var39;
						}
						while (--var50 >= 0.0F) {
							this.method5363(Statics.field5989, var52, 0, 0, (int) var47, (int) var14, var45, var29, var46, var38);
							var47 += var42;
							var14 += var40;
							var45 += var30;
							var52 += Statics.field5990;
							var46 += var39;
						}
					} else {
						float var53 = (float) (var16 + 0.5F);
						float var54 = (float) (var17 + 0.5F);
						float var55 = (float) (var18 + 0.5F) - var54;
						float var56 = var54 - var53;
						int var57 = var43[(int) var53];
						while (--var56 >= 0.0F) {
							this.method5363(Statics.field5989, var57, 0, 0, (int) var13, (int) var47, var45, var29, var46, var38);
							var47 += var42;
							var13 += var41;
							var45 += var30;
							var57 += Statics.field5990;
							var46 += var39;
						}
						while (--var55 >= 0.0F) {
							this.method5363(Statics.field5989, var57, 0, 0, (int) var14, (int) var47, var45, var29, var46, var38);
							var47 += var42;
							var14 += var40;
							var45 += var30;
							var57 += Statics.field5990;
							var46 += var39;
						}
					}
				} else {
					float var58 = var13;
					if (var16 < 0.0F) {
						var58 = var13 - var16 * var42;
						var13 -= var16 * var41;
						var45 -= var16 * var30;
						var16 = 0.0F;
					}
					if (var18 < 0.0F) {
						var15 -= var18 * var40;
						var18 = 0.0F;
					}
					if ((var16 == var18 || !(var42 < var41)) && (var16 != var18 || !(var40 > var41))) {
						float var64 = (float) (var16 + 0.5F);
						float var65 = (float) (var18 + 0.5F);
						float var66 = (float) (var17 + 0.5F) - var65;
						float var67 = var65 - var64;
						int var68 = var43[(int) var64];
						while (--var67 >= 0.0F) {
							this.method5363(Statics.field5989, var68, 0, 0, (int) var13, (int) var58, var45, var29, var46, var38);
							var58 += var42;
							var13 += var41;
							var45 += var30;
							var68 += Statics.field5990;
							var46 += var39;
						}
						while (--var66 >= 0.0F) {
							this.method5363(Statics.field5989, var68, 0, 0, (int) var13, (int) var15, var45, var29, var46, var38);
							var15 += var40;
							var13 += var41;
							var45 += var30;
							var68 += Statics.field5990;
							var46 += var39;
						}
					} else {
						float var59 = (float) (var16 + 0.5F);
						float var60 = (float) (var18 + 0.5F);
						float var61 = (float) (var17 + 0.5F) - var60;
						float var62 = var60 - var59;
						int var63 = var43[(int) var59];
						while (--var62 >= 0.0F) {
							this.method5363(Statics.field5989, var63, 0, 0, (int) var58, (int) var13, var45, var29, var46, var38);
							var58 += var42;
							var13 += var41;
							var45 += var30;
							var63 += Statics.field5990;
							var46 += var39;
						}
						while (--var61 >= 0.0F) {
							this.method5363(Statics.field5989, var63, 0, 0, (int) var15, (int) var13, var45, var29, var46, var38);
							var15 += var40;
							var13 += var41;
							var45 += var30;
							var63 += Statics.field5990;
							var46 += var39;
						}
					}
				}
			}
		} else if (var17 <= var18) {
			if (!(var17 >= (float) var44)) {
				if (var18 > (float) var44) {
					var18 = var44;
				}
				if (var16 > (float) var44) {
					var16 = var44;
				}
				float var69 = var25 - var14 * var29 + var29;
				float var70 = this.method5355(arg4, arg1, arg7, var38, var39);
				if (var18 < var16) {
					float var71 = var14;
					if (var17 < 0.0F) {
						var71 = var14 - var17 * var41;
						var14 -= var17 * var40;
						var69 -= var17 * var30;
						var17 = 0.0F;
					}
					if (var18 < 0.0F) {
						var15 -= var18 * var42;
						var18 = 0.0F;
					}
					if (var17 != var18 && var41 < var40 || var17 == var18 && var41 > var42) {
						float var72 = (float) (var17 + 0.5F);
						float var73 = (float) (var18 + 0.5F);
						float var74 = (float) (var16 + 0.5F) - var73;
						float var75 = var73 - var72;
						int var76 = var43[(int) var72];
						while (--var75 >= 0.0F) {
							this.method5363(Statics.field5989, var76, 0, 0, (int) var71, (int) var14, var69, var29, var70, var38);
							var71 += var41;
							var14 += var40;
							var69 += var30;
							var76 += Statics.field5990;
							var70 += var39;
						}
						while (--var74 >= 0.0F) {
							this.method5363(Statics.field5989, var76, 0, 0, (int) var71, (int) var15, var69, var29, var70, var38);
							var71 += var41;
							var15 += var42;
							var69 += var30;
							var76 += Statics.field5990;
							var70 += var39;
						}
					} else {
						float var77 = (float) (var17 + 0.5F);
						float var78 = (float) (var18 + 0.5F);
						float var79 = (float) (var16 + 0.5F) - var78;
						float var80 = var78 - var77;
						int var81 = var43[(int) var77];
						while (--var80 >= 0.0F) {
							this.method5363(Statics.field5989, var81, 0, 0, (int) var14, (int) var71, var69, var29, var70, var38);
							var71 += var41;
							var14 += var40;
							var69 += var30;
							var81 += Statics.field5990;
							var70 += var39;
						}
						while (--var79 >= 0.0F) {
							this.method5363(Statics.field5989, var81, 0, 0, (int) var15, (int) var71, var69, var29, var70, var38);
							var71 += var41;
							var15 += var42;
							var69 += var30;
							var81 += Statics.field5990;
							var70 += var39;
						}
					}
				} else {
					float var82 = var14;
					if (var17 < 0.0F) {
						var82 = var14 - var17 * var41;
						var14 -= var17 * var40;
						var69 -= var17 * var30;
						var17 = 0.0F;
					}
					if (var16 < 0.0F) {
						var13 -= var16 * var42;
						var16 = 0.0F;
					}
					float var83 = (float) (var17 + 0.5F);
					float var84 = (float) (var16 + 0.5F);
					float var85 = (float) (var18 + 0.5F) - var84;
					float var86 = var84 - var83;
					int var87 = var43[(int) var83];
					if (var41 < var40) {
						while (--var86 >= 0.0F) {
							this.method5363(Statics.field5989, var87, 0, 0, (int) var82, (int) var14, var69, var29, var70, var38);
							var82 += var41;
							var14 += var40;
							var69 += var30;
							var87 += Statics.field5990;
							var70 += var39;
						}
						while (--var85 >= 0.0F) {
							this.method5363(Statics.field5989, var87, 0, 0, (int) var13, (int) var14, var69, var29, var70, var38);
							var13 += var42;
							var14 += var40;
							var69 += var30;
							var87 += Statics.field5990;
							var70 += var39;
						}
					} else {
						while (--var86 >= 0.0F) {
							this.method5363(Statics.field5989, var87, 0, 0, (int) var14, (int) var82, var69, var29, var70, var38);
							var82 += var41;
							var14 += var40;
							var69 += var30;
							var87 += Statics.field5990;
							var70 += var39;
						}
						while (--var85 >= 0.0F) {
							this.method5363(Statics.field5989, var87, 0, 0, (int) var14, (int) var13, var69, var29, var70, var38);
							var13 += var42;
							var14 += var40;
							var69 += var30;
							var87 += Statics.field5990;
							var70 += var39;
						}
					}
				}
			}
		} else if (!(var18 >= (float) var44)) {
			if (var16 > (float) var44) {
				var16 = var44;
			}
			if (var17 > (float) var44) {
				var17 = var44;
			}
			float var88 = var26 - var15 * var29 + var29;
			float var89 = this.method5355(arg5, arg2, arg8, var38, var39);
			if (var16 < var17) {
				float var90 = var15;
				if (var18 < 0.0F) {
					var90 = var15 - var18 * var40;
					var15 -= var18 * var42;
					var88 -= var18 * var30;
					var18 = 0.0F;
				}
				if (var16 < 0.0F) {
					var13 -= var16 * var41;
					var16 = 0.0F;
				}
				float var91 = (float) (var18 + 0.5F);
				float var92 = (float) (var16 + 0.5F);
				float var93 = (float) (var17 + 0.5F) - var92;
				float var94 = var92 - var91;
				int var95 = var43[(int) var91];
				if (var40 < var42) {
					while (--var94 >= 0.0F) {
						this.method5363(Statics.field5989, var95, 0, 0, (int) var90, (int) var15, var88, var29, var89, var38);
						var90 += var40;
						var15 += var42;
						var88 += var30;
						var95 += Statics.field5990;
						var89 += var39;
					}
					while (--var93 >= 0.0F) {
						this.method5363(Statics.field5989, var95, 0, 0, (int) var90, (int) var13, var88, var29, var89, var38);
						var90 += var40;
						var13 += var41;
						var88 += var30;
						var95 += Statics.field5990;
						var89 += var39;
					}
				} else {
					while (--var94 >= 0.0F) {
						this.method5363(Statics.field5989, var95, 0, 0, (int) var15, (int) var90, var88, var29, var89, var38);
						var90 += var40;
						var15 += var42;
						var88 += var30;
						var95 += Statics.field5990;
						var89 += var39;
					}
					while (--var93 >= 0.0F) {
						this.method5363(Statics.field5989, var95, 0, 0, (int) var13, (int) var90, var88, var29, var89, var38);
						var90 += var40;
						var13 += var41;
						var88 += var30;
						var95 += Statics.field5990;
						var89 += var39;
					}
				}
			} else {
				float var96 = var15;
				if (var18 < 0.0F) {
					var96 = var15 - var18 * var40;
					var15 -= var18 * var42;
					var88 -= var18 * var30;
					var18 = 0.0F;
				}
				if (var17 < 0.0F) {
					var14 -= var17 * var41;
					var17 = 0.0F;
				}
				float var97 = (float) (var18 + 0.5F);
				float var98 = (float) (var17 + 0.5F);
				float var99 = (float) (var16 + 0.5F) - var98;
				float var100 = var98 - var97;
				int var101 = var43[(int) var97];
				if (var40 < var42) {
					while (--var100 >= 0.0F) {
						this.method5363(Statics.field5989, var101, 0, 0, (int) var96, (int) var15, var88, var29, var89, var38);
						var96 += var40;
						var15 += var42;
						var88 += var30;
						var101 += Statics.field5990;
						var89 += var39;
					}
					while (--var99 >= 0.0F) {
						this.method5363(Statics.field5989, var101, 0, 0, (int) var14, (int) var15, var88, var29, var89, var38);
						var14 += var41;
						var15 += var42;
						var88 += var30;
						var101 += Statics.field5990;
						var89 += var39;
					}
				} else {
					while (--var100 >= 0.0F) {
						this.method5363(Statics.field5989, var101, 0, 0, (int) var15, (int) var96, var88, var29, var89, var38);
						var96 += var40;
						var15 += var42;
						var88 += var30;
						var101 += Statics.field5990;
						var89 += var39;
					}
					while (--var99 >= 0.0F) {
						this.method5363(Statics.field5989, var101, 0, 0, (int) var15, (int) var14, var88, var29, var89, var38);
						var14 += var41;
						var15 += var42;
						var88 += var30;
						var101 += Statics.field5990;
						var89 += var39;
					}
				}
			}
		}
	}

	@ObfuscatedName("jy.cp([IIIIIIFFFF)V")
	public final void method5363(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, float arg9) {
		if (this.field2669.field3003) {
			if (arg5 > this.field2669.field2998) {
				arg5 = this.field2669.field2998;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		int var11 = arg4 - 1 + arg1;
		float var12 = (float) arg4 * arg7 + arg6;
		float var13 = (float) arg4 * arg9 + arg8;
		if (!this.field2669.field3000) {
			int var36 = arg5 - arg4;
			if (this.field2669.field3005 == 0) {
				do {
					var11++;
					this.method5352(arg0, Statics.field5988, var11, (int) var12 & 0xFFFF, var13);
					var13 += arg9;
					var12 += arg7;
					var36--;
				} while (var36 > 0);
			} else {
				int var37 = this.field2669.field3005;
				int var38 = 256 - this.field2669.field3005;
				do {
					var11++;
					this.method5347(arg0, Statics.field5988, var11, (int) var12 & 0xFFFF, var37, var38, var13);
					var13 += arg9;
					var12 += arg7;
					var36--;
				} while (var36 > 0);
			}
			return;
		}
		int var14 = arg5 - arg4 >> 2;
		float var15 = arg7 * 4.0F;
		if (this.field2669.field3005 == 0) {
			if (var14 > 0) {
				do {
					int var16 = (int) var12 & 0xFFFF;
					int var17 = this.field2668[var16];
					var12 += var15;
					var11++;
					this.method5353(arg0, Statics.field5988, var11, var17, var13);
					float var18 = arg9 + var13;
					var11++;
					this.method5353(arg0, Statics.field5988, var11, var17, var18);
					float var19 = arg9 + var18;
					var11++;
					this.method5353(arg0, Statics.field5988, var11, var17, var19);
					float var20 = arg9 + var19;
					var11++;
					this.method5353(arg0, Statics.field5988, var11, var17, var20);
					var13 = arg9 + var20;
					var14--;
				} while (var14 > 0);
			}
			int var21 = arg5 - arg4 & 0x3;
			if (var21 > 0) {
				int var22 = (int) var12 & 0xFFFF;
				int var23 = this.field2668[var22];
				do {
					var11++;
					this.method5353(arg0, Statics.field5988, var11, var23, var13);
					var13 += arg9;
					var21--;
				} while (var21 > 0);
			}
			return;
		}
		int var24 = this.field2669.field3005;
		int var25 = 256 - this.field2669.field3005;
		if (var14 > 0) {
			do {
				int var26 = (int) var12 & 0xFFFF;
				int var27 = this.field2668[var26];
				var12 += var15;
				int var28 = ((var27 & 0xFF00FF) * var25 >> 8 & 0xFF00FF) + ((var27 & 0xFF00) * var25 >> 8 & 0xFF00);
				var11++;
				this.method5354(arg0, Statics.field5988, var11, var28, var24, var13);
				float var29 = arg9 + var13;
				var11++;
				this.method5354(arg0, Statics.field5988, var11, var28, var24, var29);
				float var30 = arg9 + var29;
				var11++;
				this.method5354(arg0, Statics.field5988, var11, var28, var24, var30);
				float var31 = arg9 + var30;
				var11++;
				this.method5354(arg0, Statics.field5988, var11, var28, var24, var31);
				var13 = arg9 + var31;
				var14--;
			} while (var14 > 0);
		}
		int var32 = arg5 - arg4 & 0x3;
		if (var32 <= 0) {
			return;
		}
		int var33 = (int) var12 & 0xFFFF;
		int var34 = this.field2668[var33];
		int var35 = ((var34 & 0xFF00FF) * var25 >> 8 & 0xFF00FF) + ((var34 & 0xFF00) * var25 >> 8 & 0xFF00);
		do {
			var11++;
			this.method5354(arg0, Statics.field5988, var11, var35, var24, var13);
			var13 += arg9;
			var32--;
		} while (var32 > 0);
	}

	@ObfuscatedName("jy.ai(FFFFFFFFFI)V")
	public void method4756(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9) {
		float var11 = (float) (arg3 + 0.5F);
		float var12 = (float) (arg4 + 0.5F);
		float var13 = (float) (arg5 + 0.5F);
		float var14 = (float) (arg0 + 0.5F);
		float var15 = (float) (arg1 + 0.5F);
		float var16 = (float) (arg2 + 0.5F);
		float var17 = var12 - var11;
		float var18 = var15 - var14;
		float var19 = var13 - var11;
		float var20 = var16 - var14;
		float var21 = arg4 - arg3;
		float var22 = arg1 - arg0;
		float var23 = arg5 - arg3;
		float var24 = arg2 - arg0;
		float var25 = var21 * var24 - var22 * var23;
		if (var25 == 0.0F) {
			return;
		}
		float var26 = arg7 - arg6;
		float var27 = arg8 - arg6;
		float var28 = (var24 * var26 - var22 * var27) / var25;
		float var29 = (var21 * var27 - var23 * var26) / var25;
		float var30;
		if (var15 == var16) {
			var30 = 0.0F;
		} else {
			var30 = (var13 - var12) / (var16 - var15);
		}
		float var31;
		if (var14 == var15) {
			var31 = 0.0F;
		} else {
			var31 = var17 / var18;
		}
		float var32;
		if (var14 == var16) {
			var32 = 0.0F;
		} else {
			var32 = var19 / var20;
		}
		int[] var33 = this.field2669.field3016;
		int var34 = this.field2669.field3010;
		if (var14 <= var15 && var14 <= var16) {
			if (!(var14 >= (float) var34)) {
				if (var15 > (float) var34) {
					var15 = var34;
				}
				if (var16 > (float) var34) {
					var16 = var34;
				}
				float var35 = this.method5355(arg3, arg0, arg6, var28, var29);
				if (var15 < var16) {
					float var36 = var11;
					if (var14 < 0.0F) {
						var36 = var11 - var14 * var32;
						var11 -= var14 * var31;
						var14 = 0.0F;
					}
					if (var15 < 0.0F) {
						var12 -= var15 * var30;
						var15 = 0.0F;
					}
					if (var14 != var15 && var32 < var31 || var14 == var15 && var32 > var30) {
						float var37 = (float) (var14 + 0.5F);
						float var38 = (float) (var15 + 0.5F);
						float var39 = (float) (var16 + 0.5F) - var38;
						float var40 = var38 - var37;
						int var41 = var33[(int) var37];
						while (--var40 >= 0.0F) {
							this.method5358(Statics.field5989, var41, arg9, 0, (int) var36, (int) var11, var35, var28);
							var36 += var32;
							var11 += var31;
							var41 += Statics.field5990;
							var35 += var29;
						}
						while (--var39 >= 0.0F) {
							this.method5358(Statics.field5989, var41, arg9, 0, (int) var36, (int) var12, var35, var28);
							var36 += var32;
							var12 += var30;
							var41 += Statics.field5990;
							var35 += var29;
						}
					} else {
						float var42 = (float) (var14 + 0.5F);
						float var43 = (float) (var15 + 0.5F);
						float var44 = (float) (var16 + 0.5F) - var43;
						float var45 = var43 - var42;
						int var46 = var33[(int) var42];
						while (--var45 >= 0.0F) {
							this.method5358(Statics.field5989, var46, arg9, 0, (int) var11, (int) var36, var35, var28);
							var36 += var32;
							var11 += var31;
							var46 += Statics.field5990;
							var35 += var29;
						}
						while (--var44 >= 0.0F) {
							this.method5358(Statics.field5989, var46, arg9, 0, (int) var12, (int) var36, var35, var28);
							var36 += var32;
							var12 += var30;
							var46 += Statics.field5990;
							var35 += var29;
						}
					}
				} else {
					float var47 = var11;
					if (var14 < 0.0F) {
						var47 = var11 - var14 * var32;
						var11 -= var14 * var31;
						var14 = 0.0F;
					}
					if (var16 < 0.0F) {
						var13 -= var16 * var30;
						var16 = 0.0F;
					}
					if ((var14 == var16 || !(var32 < var31)) && (var14 != var16 || !(var30 > var31))) {
						float var53 = (float) (var14 + 0.5F);
						float var54 = (float) (var16 + 0.5F);
						float var55 = (float) (var15 + 0.5F) - var54;
						float var56 = var54 - var53;
						int var57 = var33[(int) var53];
						while (--var56 >= 0.0F) {
							this.method5358(Statics.field5989, var57, arg9, 0, (int) var11, (int) var47, var35, var28);
							var47 += var32;
							var11 += var31;
							var57 += Statics.field5990;
							var35 += var29;
						}
						while (--var55 >= 0.0F) {
							this.method5358(Statics.field5989, var57, arg9, 0, (int) var11, (int) var13, var35, var28);
							var13 += var30;
							var11 += var31;
							var57 += Statics.field5990;
							var35 += var29;
						}
					} else {
						float var48 = (float) (var14 + 0.5F);
						float var49 = (float) (var16 + 0.5F);
						float var50 = (float) (var15 + 0.5F) - var49;
						float var51 = var49 - var48;
						int var52 = var33[(int) var48];
						while (--var51 >= 0.0F) {
							this.method5358(Statics.field5989, var52, arg9, 0, (int) var47, (int) var11, var35, var28);
							var47 += var32;
							var11 += var31;
							var52 += Statics.field5990;
							var35 += var29;
						}
						while (--var50 >= 0.0F) {
							this.method5358(Statics.field5989, var52, arg9, 0, (int) var13, (int) var11, var35, var28);
							var13 += var30;
							var11 += var31;
							var52 += Statics.field5990;
							var35 += var29;
						}
					}
				}
			}
		} else if (var15 <= var16) {
			if (!(var15 >= (float) var34)) {
				if (var16 > (float) var34) {
					var16 = var34;
				}
				if (var14 > (float) var34) {
					var14 = var34;
				}
				float var58 = this.method5355(arg4, arg1, arg7, var28, var29);
				if (var16 < var14) {
					float var59 = var12;
					if (var15 < 0.0F) {
						var59 = var12 - var15 * var31;
						var12 -= var15 * var30;
						var15 = 0.0F;
					}
					if (var16 < 0.0F) {
						var13 -= var16 * var32;
						var16 = 0.0F;
					}
					if (var15 != var16 && var31 < var30 || var15 == var16 && var31 > var32) {
						float var60 = (float) (var15 + 0.5F);
						float var61 = (float) (var16 + 0.5F);
						float var62 = (float) (var14 + 0.5F) - var61;
						float var63 = var61 - var60;
						int var64 = var33[(int) var60];
						while (--var63 >= 0.0F) {
							this.method5358(Statics.field5989, var64, arg9, 0, (int) var59, (int) var12, var58, var28);
							var59 += var31;
							var12 += var30;
							var64 += Statics.field5990;
							var58 += var29;
						}
						while (--var62 >= 0.0F) {
							this.method5358(Statics.field5989, var64, arg9, 0, (int) var59, (int) var13, var58, var28);
							var59 += var31;
							var13 += var32;
							var64 += Statics.field5990;
							var58 += var29;
						}
					} else {
						float var65 = (float) (var15 + 0.5F);
						float var66 = (float) (var16 + 0.5F);
						float var67 = (float) (var14 + 0.5F) - var66;
						float var68 = var66 - var65;
						int var69 = var33[(int) var65];
						while (--var68 >= 0.0F) {
							this.method5358(Statics.field5989, var69, arg9, 0, (int) var12, (int) var59, var58, var28);
							var59 += var31;
							var12 += var30;
							var69 += Statics.field5990;
							var58 += var29;
						}
						while (--var67 >= 0.0F) {
							this.method5358(Statics.field5989, var69, arg9, 0, (int) var13, (int) var59, var58, var28);
							var59 += var31;
							var13 += var32;
							var69 += Statics.field5990;
							var58 += var29;
						}
					}
				} else {
					float var70 = var12;
					if (var15 < 0.0F) {
						var70 = var12 - var15 * var31;
						var12 -= var15 * var30;
						var15 = 0.0F;
					}
					if (var14 < 0.0F) {
						var11 -= var14 * var32;
						var14 = 0.0F;
					}
					float var71 = (float) (var15 + 0.5F);
					float var72 = (float) (var14 + 0.5F);
					float var73 = (float) (var16 + 0.5F) - var72;
					float var74 = var72 - var71;
					int var75 = var33[(int) var71];
					if (var31 < var30) {
						while (--var74 >= 0.0F) {
							this.method5358(Statics.field5989, var75, arg9, 0, (int) var70, (int) var12, var58, var28);
							var70 += var31;
							var12 += var30;
							var75 += Statics.field5990;
							var58 += var29;
						}
						while (--var73 >= 0.0F) {
							this.method5358(Statics.field5989, var75, arg9, 0, (int) var11, (int) var12, var58, var28);
							var11 += var32;
							var12 += var30;
							var75 += Statics.field5990;
							var58 += var29;
						}
					} else {
						while (--var74 >= 0.0F) {
							this.method5358(Statics.field5989, var75, arg9, 0, (int) var12, (int) var70, var58, var28);
							var70 += var31;
							var12 += var30;
							var75 += Statics.field5990;
							var58 += var29;
						}
						while (--var73 >= 0.0F) {
							this.method5358(Statics.field5989, var75, arg9, 0, (int) var12, (int) var11, var58, var28);
							var11 += var32;
							var12 += var30;
							var75 += Statics.field5990;
							var58 += var29;
						}
					}
				}
			}
		} else if (!(var16 >= (float) var34)) {
			if (var14 > (float) var34) {
				var14 = var34;
			}
			if (var15 > (float) var34) {
				var15 = var34;
			}
			float var76 = this.method5355(arg5, arg2, arg8, var28, var29);
			if (var14 < var15) {
				float var77 = var13;
				if (var16 < 0.0F) {
					var77 = var13 - var16 * var30;
					var13 -= var16 * var32;
					var16 = 0.0F;
				}
				if (var14 < 0.0F) {
					var11 -= var14 * var31;
					var14 = 0.0F;
				}
				float var78 = (float) (var16 + 0.5F);
				float var79 = (float) (var14 + 0.5F);
				float var80 = (float) (var15 + 0.5F) - var79;
				float var81 = var79 - var78;
				int var82 = var33[(int) var78];
				if (var30 < var32) {
					while (--var81 >= 0.0F) {
						this.method5358(Statics.field5989, var82, arg9, 0, (int) var77, (int) var13, var76, var28);
						var77 += var30;
						var13 += var32;
						var82 += Statics.field5990;
						var76 += var29;
					}
					while (--var80 >= 0.0F) {
						this.method5358(Statics.field5989, var82, arg9, 0, (int) var77, (int) var11, var76, var28);
						var77 += var30;
						var11 += var31;
						var82 += Statics.field5990;
						var76 += var29;
					}
				} else {
					while (--var81 >= 0.0F) {
						this.method5358(Statics.field5989, var82, arg9, 0, (int) var13, (int) var77, var76, var28);
						var77 += var30;
						var13 += var32;
						var82 += Statics.field5990;
						var76 += var29;
					}
					while (--var80 >= 0.0F) {
						this.method5358(Statics.field5989, var82, arg9, 0, (int) var11, (int) var77, var76, var28);
						var77 += var30;
						var11 += var31;
						var82 += Statics.field5990;
						var76 += var29;
					}
				}
			} else {
				float var83 = var13;
				if (var16 < 0.0F) {
					var83 = var13 - var16 * var30;
					var13 -= var16 * var32;
					var16 = 0.0F;
				}
				if (var15 < 0.0F) {
					var12 -= var15 * var31;
					var15 = 0.0F;
				}
				float var84 = (float) (var16 + 0.5F);
				float var85 = (float) (var15 + 0.5F);
				float var86 = (float) (var14 + 0.5F) - var85;
				float var87 = var85 - var84;
				int var88 = var33[(int) var84];
				if (var30 < var32) {
					while (--var87 >= 0.0F) {
						this.method5358(Statics.field5989, var88, arg9, 0, (int) var83, (int) var13, var76, var28);
						var83 += var30;
						var13 += var32;
						var88 += Statics.field5990;
						var76 += var29;
					}
					while (--var86 >= 0.0F) {
						this.method5358(Statics.field5989, var88, arg9, 0, (int) var12, (int) var13, var76, var28);
						var12 += var31;
						var13 += var32;
						var88 += Statics.field5990;
						var76 += var29;
					}
				} else {
					while (--var87 >= 0.0F) {
						this.method5358(Statics.field5989, var88, arg9, 0, (int) var13, (int) var83, var76, var28);
						var83 += var30;
						var13 += var32;
						var88 += Statics.field5990;
						var76 += var29;
					}
					while (--var86 >= 0.0F) {
						this.method5358(Statics.field5989, var88, arg9, 0, (int) var13, (int) var12, var76, var28);
						var12 += var31;
						var13 += var32;
						var88 += Statics.field5990;
						var76 += var29;
					}
				}
			}
		}
	}

	@ObfuscatedName("jy.cm([IIIIIIFF)V")
	public final void method5358(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7) {
		if (this.field2669.field3003) {
			if (arg5 > this.field2669.field2998) {
				arg5 = this.field2669.field2998;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		int var9 = arg4 - 1 + arg1;
		int var10 = arg5 - arg4 >> 2;
		float var11 = (float) arg4 * arg7 + arg6;
		if (this.field2669.field3005 == 0) {
			while (true) {
				var10--;
				if (var10 < 0) {
					int var15 = arg5 - arg4 & 0x3;
					while (true) {
						var15--;
						if (var15 < 0) {
							return;
						}
						var9++;
						this.method5353(arg0, Statics.field5988, var9, arg2, var11);
						var11 += arg7;
					}
				}
				var9++;
				this.method5353(arg0, Statics.field5988, var9, arg2, var11);
				float var12 = arg7 + var11;
				var9++;
				this.method5353(arg0, Statics.field5988, var9, arg2, var12);
				float var13 = arg7 + var12;
				var9++;
				this.method5353(arg0, Statics.field5988, var9, arg2, var13);
				float var14 = arg7 + var13;
				var9++;
				this.method5353(arg0, Statics.field5988, var9, arg2, var14);
				var11 = arg7 + var14;
			}
		} else if (this.field2669.field3005 != 254) {
			int var20 = this.field2669.field3005;
			int var21 = 256 - this.field2669.field3005;
			int var22 = ((arg2 & 0xFF00FF) * var21 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * var21 >> 8 & 0xFF00);
			while (true) {
				var10--;
				if (var10 < 0) {
					int var26 = arg5 - arg4 & 0x3;
					while (true) {
						var26--;
						if (var26 < 0) {
							return;
						}
						var9++;
						this.method5354(arg0, Statics.field5988, var9, var22, var20, var11);
						var11 += arg7;
					}
				}
				var9++;
				this.method5354(arg0, Statics.field5988, var9, var22, var20, var11);
				float var23 = arg7 + var11;
				var9++;
				this.method5354(arg0, Statics.field5988, var9, var22, var20, var23);
				float var24 = arg7 + var23;
				var9++;
				this.method5354(arg0, Statics.field5988, var9, var22, var20, var24);
				float var25 = arg7 + var24;
				var9++;
				this.method5354(arg0, Statics.field5988, var9, var22, var20, var25);
				var11 = arg7 + var25;
			}
		} else if (arg4 != 0 && arg5 <= this.field2669.field2998 - 1) {
			while (true) {
				var10--;
				if (var10 < 0) {
					int var19 = arg5 - arg4 & 0x3;
					while (true) {
						var19--;
						if (var19 < 0) {
							return;
						}
						var9++;
						this.method5354(arg0, Statics.field5988, var9 - 1, arg0[var9], 0, var11);
						var11 += arg7;
					}
				}
				var9++;
				this.method5354(arg0, Statics.field5988, var9 - 1, arg0[var9], 0, var11);
				float var16 = arg7 + var11;
				var9++;
				this.method5354(arg0, Statics.field5988, var9 - 1, arg0[var9], 0, var16);
				float var17 = arg7 + var16;
				var9++;
				this.method5354(arg0, Statics.field5988, var9 - 1, arg0[var9], 0, var17);
				float var18 = arg7 + var17;
				var9++;
				this.method5354(arg0, Statics.field5988, var9 - 1, arg0[var9], 0, var18);
				var11 = arg7 + var18;
			}
		}
	}

	@ObfuscatedName("jy.aa(FFFFFFFFFIIIIIIIIIIIII)V")
	public void method4787(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
		int[] var23 = this.field2669.field3011.method5082(arg21);
		if (var23 == null) {
			int var24 = this.field2669.field3011.method5069(arg21);
			this.method4755(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, method4786(var24, arg9), method4786(var24, arg10), method4786(var24, arg11));
			return;
		}
		this.field2660 = this.field2669.field3011.method5070(arg21);
		float var25 = (float) (arg3 + 0.5F);
		float var26 = (float) (arg4 + 0.5F);
		float var27 = (float) (arg5 + 0.5F);
		float var28 = (float) (arg0 + 0.5F);
		float var29 = (float) (arg1 + 0.5F);
		float var30 = (float) (arg2 + 0.5F);
		float var31 = var26 - var25;
		float var32 = var29 - var28;
		float var33 = var27 - var25;
		float var34 = var30 - var28;
		float var35 = var31 * var34 - var32 * var33;
		if (var35 == 0.0F) {
			return;
		}
		float var36 = (float) (arg10 - arg9);
		float var37 = (float) (arg11 - arg9);
		int var38 = (int) ((var34 * var36 - var32 * var37) * 512.0F / var35);
		int var39 = (int) ((var31 * var37 - var33 * var36) * 512.0F / var35);
		float var40 = arg4 - arg3;
		float var41 = arg1 - arg0;
		float var42 = arg5 - arg3;
		float var43 = arg2 - arg0;
		float var44 = var40 * var43 - var41 * var42;
		if (var44 == 0.0F) {
			return;
		}
		float var45 = arg7 - arg6;
		float var46 = arg8 - arg6;
		float var47 = (var43 * var45 - var41 * var46) / var44;
		float var48 = (var40 * var46 - var42 * var45) / var44;
		float var49;
		if (var29 == var30) {
			var49 = 0.0F;
		} else {
			var49 = (var27 - var26) / (var30 - var29);
		}
		float var50;
		if (var28 == var29) {
			var50 = 0.0F;
		} else {
			var50 = var31 / var32;
		}
		float var51;
		if (var28 == var30) {
			var51 = 0.0F;
		} else {
			var51 = var33 / var34;
		}
		int var52 = this.field2669.field3006;
		int var53 = arg12 - arg13;
		int var54 = arg15 - arg16;
		int var55 = arg18 - arg19;
		int var56 = arg14 - arg12;
		int var57 = arg17 - arg15;
		int var58 = arg20 - arg18;
		int var59 = arg15 * var56 - arg12 * var57 << 14;
		int var60 = (int) (((long) (arg18 * var57 - arg15 * var58) << 3 << 14) / (long) var52);
		int var61 = (int) (((long) (arg12 * var58 - arg18 * var56) << 14) / (long) var52);
		int var62 = arg15 * var53 - arg12 * var54 << 14;
		int var63 = (int) (((long) (arg18 * var54 - arg15 * var55) << 3 << 14) / (long) var52);
		int var64 = (int) (((long) (arg12 * var55 - arg18 * var53) << 14) / (long) var52);
		int var65 = var54 * var56 - var53 * var57 << 14;
		int var66 = (int) (((long) (var55 * var57 - var54 * var58) << 3 << 14) / (long) var52);
		int var67 = (int) (((long) (var53 * var58 - var55 * var56) << 14) / (long) var52);
		int[] var68 = this.field2669.field3016;
		int var69 = this.field2669.field3010;
		if (var28 <= var29 && var28 <= var30) {
			if (!(var28 >= (float) var69)) {
				if (var29 > (float) var69) {
					var29 = var69;
				}
				if (var30 > (float) var69) {
					var30 = var69;
				}
				int var70 = (arg9 << 9) - (int) var25 * var38 + var38;
				float var71 = this.method5355(arg3, arg0, arg6, var47, var48);
				if (var29 < var30) {
					float var72 = var25;
					if (var28 < 0.0F) {
						var72 = var25 - var28 * var51;
						var25 -= var28 * var50;
						var70 -= (int) var28 * var39;
						var28 = 0.0F;
					}
					if (var29 < 0.0F) {
						var26 -= var29 * var49;
						var29 = 0.0F;
					}
					int var73 = (int) var28 - this.field2669.field3009;
					int var74 = var61 * var73 + var59;
					int var75 = var64 * var73 + var62;
					int var76 = var67 * var73 + var65;
					if ((var28 == var29 || !(var51 < var50)) && (var28 != var29 || !(var51 > var49))) {
						float var82 = (float) (var28 + 0.5F);
						float var83 = (float) (var29 + 0.5F);
						float var84 = (float) (var30 + 0.5F) - var83;
						float var85 = var83 - var82;
						int var86 = var68[(int) var82];
						while (--var85 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var86, (int) var25, (int) var72, var70, var38, var71, var47, var74, var75, var76, var60, var63, var66);
							var72 += var51;
							var25 += var50;
							var70 += var39;
							var86 += Statics.field5990;
							var74 += var61;
							var75 += var64;
							var76 += var67;
							var71 += var48;
						}
						while (--var84 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var86, (int) var26, (int) var72, var70, var38, var71, var47, var74, var75, var76, var60, var63, var66);
							var72 += var51;
							var26 += var49;
							var70 += var39;
							var86 += Statics.field5990;
							var74 += var61;
							var75 += var64;
							var76 += var67;
							var71 += var48;
						}
					} else {
						float var77 = (float) (var28 + 0.5F);
						float var78 = (float) (var29 + 0.5F);
						float var79 = (float) (var30 + 0.5F) - var78;
						float var80 = var78 - var77;
						int var81 = var68[(int) var77];
						while (--var80 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var81, (int) var72, (int) var25, var70, var38, var71, var47, var74, var75, var76, var60, var63, var66);
							var72 += var51;
							var25 += var50;
							var70 += var39;
							var81 += Statics.field5990;
							var74 += var61;
							var75 += var64;
							var76 += var67;
							var71 += var48;
						}
						while (--var79 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var81, (int) var72, (int) var26, var70, var38, var71, var47, var74, var75, var76, var60, var63, var66);
							var72 += var51;
							var26 += var49;
							var70 += var39;
							var81 += Statics.field5990;
							var74 += var61;
							var75 += var64;
							var76 += var67;
							var71 += var48;
						}
					}
				} else {
					float var87 = var25;
					if (var28 < 0.0F) {
						var87 = var25 - var28 * var51;
						var25 -= var28 * var50;
						var70 = (int) ((float) var70 - (float) var39 * var28);
						var28 = 0.0F;
					}
					if (var30 < 0.0F) {
						var27 -= var30 * var49;
						var30 = 0.0F;
					}
					int var88 = (int) var28 - this.field2669.field3009;
					int var89 = var61 * var88 + var59;
					int var90 = var64 * var88 + var62;
					int var91 = var67 * var88 + var65;
					if ((var28 == var30 || !(var51 < var50)) && (var28 != var30 || !(var49 > var50))) {
						float var97 = (float) (var28 + 0.5F);
						float var98 = (float) (var30 + 0.5F);
						float var99 = (float) (var29 + 0.5F) - var98;
						float var100 = var98 - var97;
						int var101 = var68[(int) var97];
						while (--var100 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var101, (int) var25, (int) var87, var70, var38, var71, var47, var89, var90, var91, var60, var63, var66);
							var87 += var51;
							var25 += var50;
							var70 += var39;
							var101 += Statics.field5990;
							var89 += var61;
							var90 += var64;
							var91 += var67;
							var71 += var48;
						}
						while (--var99 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var101, (int) var25, (int) var27, var70, var38, var71, var47, var89, var90, var91, var60, var63, var66);
							var27 += var49;
							var25 += var50;
							var70 += var39;
							var101 += Statics.field5990;
							var89 += var61;
							var90 += var64;
							var91 += var67;
							var71 += var48;
						}
					} else {
						float var92 = (float) (var28 + 0.5F);
						float var93 = (float) (var30 + 0.5F);
						float var94 = (float) (var29 + 0.5F) - var93;
						float var95 = var93 - var92;
						int var96 = var68[(int) var92];
						while (--var95 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var96, (int) var87, (int) var25, var70, var38, var71, var47, var89, var90, var91, var60, var63, var66);
							var87 += var51;
							var25 += var50;
							var70 += var39;
							var96 += Statics.field5990;
							var89 += var61;
							var90 += var64;
							var91 += var67;
							var71 += var48;
						}
						while (--var94 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var96, (int) var27, (int) var25, var70, var38, var71, var47, var89, var90, var91, var60, var63, var66);
							var27 += var49;
							var25 += var50;
							var70 += var39;
							var96 += Statics.field5990;
							var89 += var61;
							var90 += var64;
							var91 += var67;
							var71 += var48;
						}
					}
				}
			}
		} else if (var29 <= var30) {
			if (!(var29 >= (float) var69)) {
				if (var30 > (float) var69) {
					var30 = var69;
				}
				if (var28 > (float) var69) {
					var28 = var69;
				}
				int var102 = (arg10 << 9) - (int) var26 * var38 + var38;
				float var103 = this.method5355(arg4, arg1, arg7, var47, var48);
				if (var30 < var28) {
					float var104 = var26;
					if (var29 < 0.0F) {
						var104 = var26 - var29 * var50;
						var26 -= var29 * var49;
						var102 -= (int) var29 * var39;
						var29 = 0.0F;
					}
					if (var30 < 0.0F) {
						var27 -= var30 * var51;
						var30 = 0.0F;
					}
					int var105 = (int) var29 - this.field2669.field3009;
					int var106 = var61 * var105 + var59;
					int var107 = var64 * var105 + var62;
					int var108 = var67 * var105 + var65;
					if (var29 != var30 && var50 < var49 || var29 == var30 && var50 > var51) {
						float var109 = (float) (var29 + 0.5F);
						float var110 = (float) (var30 + 0.5F);
						float var111 = (float) (var28 + 0.5F) - var110;
						float var112 = var110 - var109;
						int var113 = var68[(int) var109];
						while (--var112 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var113, (int) var104, (int) var26, var102, var38, var103, var47, var106, var107, var108, var60, var63, var66);
							var104 += var50;
							var26 += var49;
							var102 += var39;
							var113 += Statics.field5990;
							var106 += var61;
							var107 += var64;
							var108 += var67;
							var103 += var48;
						}
						while (--var111 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var113, (int) var104, (int) var27, var102, var38, var103, var47, var106, var107, var108, var60, var63, var66);
							var104 += var50;
							var27 += var51;
							var102 += var39;
							var113 += Statics.field5990;
							var106 += var61;
							var107 += var64;
							var108 += var67;
							var103 += var48;
						}
					} else {
						float var114 = (float) (var29 + 0.5F);
						float var115 = (float) (var30 + 0.5F);
						float var116 = (float) (var28 + 0.5F) - var115;
						float var117 = var115 - var114;
						int var118 = var68[(int) var114];
						while (--var117 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var118, (int) var26, (int) var104, var102, var38, var103, var47, var106, var107, var108, var60, var63, var66);
							var104 += var50;
							var26 += var49;
							var102 += var39;
							var118 += Statics.field5990;
							var106 += var61;
							var107 += var64;
							var108 += var67;
							var103 += var48;
						}
						while (--var116 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var118, (int) var27, (int) var104, var102, var38, var103, var47, var106, var107, var108, var60, var63, var66);
							var104 += var50;
							var27 += var51;
							var102 += var39;
							var118 += Statics.field5990;
							var106 += var61;
							var107 += var64;
							var108 += var67;
							var103 += var48;
						}
					}
				} else {
					float var119 = var26;
					if (var29 < 0.0F) {
						var119 = var26 - var29 * var50;
						var26 -= var29 * var49;
						var102 -= (int) var29 * var39;
						var29 = 0.0F;
					}
					if (var28 < 0.0F) {
						var25 -= var28 * var51;
						var28 = 0.0F;
					}
					int var120 = (int) var29 - this.field2669.field3009;
					int var121 = var61 * var120 + var59;
					int var122 = var64 * var120 + var62;
					int var123 = var67 * var120 + var65;
					float var124 = (float) (var29 + 0.5F);
					float var125 = (float) (var28 + 0.5F);
					float var126 = (float) (var30 + 0.5F) - var125;
					float var127 = var125 - var124;
					int var128 = var68[(int) var124];
					if (var50 < var49) {
						while (--var127 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var128, (int) var119, (int) var26, var102, var38, var103, var47, var121, var122, var123, var60, var63, var66);
							var119 += var50;
							var26 += var49;
							var102 += var39;
							var128 += Statics.field5990;
							var121 += var61;
							var122 += var64;
							var123 += var67;
							var103 += var48;
						}
						while (--var126 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var128, (int) var25, (int) var26, var102, var38, var103, var47, var121, var122, var123, var60, var63, var66);
							var25 += var51;
							var26 += var49;
							var102 += var39;
							var128 += Statics.field5990;
							var121 += var61;
							var122 += var64;
							var123 += var67;
							var103 += var48;
						}
					} else {
						while (--var127 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var128, (int) var26, (int) var119, var102, var38, var103, var47, var121, var122, var123, var60, var63, var66);
							var119 += var50;
							var26 += var49;
							var102 += var39;
							var128 += Statics.field5990;
							var121 += var61;
							var122 += var64;
							var123 += var67;
							var103 += var48;
						}
						while (--var126 >= 0.0F) {
							this.method5359(Statics.field5989, var23, 0, 0, var128, (int) var26, (int) var25, var102, var38, var103, var47, var121, var122, var123, var60, var63, var66);
							var25 += var51;
							var26 += var49;
							var102 += var39;
							var128 += Statics.field5990;
							var121 += var61;
							var122 += var64;
							var123 += var67;
							var103 += var48;
						}
					}
				}
			}
		} else if (!(var30 >= (float) var69)) {
			if (var28 > (float) var69) {
				var28 = var69;
			}
			if (var29 > (float) var69) {
				var29 = var69;
			}
			int var129 = (arg11 << 9) - (int) var27 * var38 + var38;
			float var130 = this.method5355(arg5, arg2, arg8, var47, var48);
			if (var28 < var29) {
				float var131 = var27;
				if (var30 < 0.0F) {
					var131 = var27 - var30 * var49;
					var27 -= var30 * var51;
					var129 -= (int) var30 * var39;
					var30 = 0.0F;
				}
				if (var28 < 0.0F) {
					var25 -= var28 * var50;
					var28 = 0.0F;
				}
				int var132 = (int) var30 - this.field2669.field3009;
				int var133 = var61 * var132 + var59;
				int var134 = var64 * var132 + var62;
				int var135 = var67 * var132 + var65;
				float var136 = (float) (var30 + 0.5F);
				float var137 = (float) (var28 + 0.5F);
				float var138 = (float) (var29 + 0.5F) - var137;
				float var139 = var137 - var136;
				int var140 = var68[(int) var136];
				if (var49 < var51) {
					while (--var139 >= 0.0F) {
						this.method5359(Statics.field5989, var23, 0, 0, var140, (int) var131, (int) var27, var129, var38, var130, var47, var133, var134, var135, var60, var63, var66);
						var131 += var49;
						var27 += var51;
						var129 += var39;
						var140 += Statics.field5990;
						var133 += var61;
						var134 += var64;
						var135 += var67;
						var130 += var48;
					}
					while (--var138 >= 0.0F) {
						this.method5359(Statics.field5989, var23, 0, 0, var140, (int) var131, (int) var25, var129, var38, var130, var47, var133, var134, var135, var60, var63, var66);
						var131 += var49;
						var25 += var50;
						var129 += var39;
						var140 += Statics.field5990;
						var133 += var61;
						var134 += var64;
						var135 += var67;
						var130 += var48;
					}
				} else {
					while (--var139 >= 0.0F) {
						this.method5359(Statics.field5989, var23, 0, 0, var140, (int) var27, (int) var131, var129, var38, var130, var47, var133, var134, var135, var60, var63, var66);
						var131 += var49;
						var27 += var51;
						var129 += var39;
						var140 += Statics.field5990;
						var133 += var61;
						var134 += var64;
						var135 += var67;
						var130 += var48;
					}
					while (--var138 >= 0.0F) {
						this.method5359(Statics.field5989, var23, 0, 0, var140, (int) var25, (int) var131, var129, var38, var130, var47, var133, var134, var135, var60, var63, var66);
						var131 += var49;
						var25 += var50;
						var129 += var39;
						var140 += Statics.field5990;
						var133 += var61;
						var134 += var64;
						var135 += var67;
						var130 += var48;
					}
				}
			} else {
				float var141 = var27;
				if (var30 < 0.0F) {
					var141 = var27 - var30 * var49;
					var27 -= var30 * var51;
					var129 -= (int) var30 * var39;
					var30 = 0.0F;
				}
				if (var29 < 0.0F) {
					var26 -= var29 * var50;
					var29 = 0.0F;
				}
				int var142 = (int) var30 - this.field2669.field3009;
				int var143 = var61 * var142 + var59;
				int var144 = var64 * var142 + var62;
				int var145 = var67 * var142 + var65;
				float var146 = (float) (var30 + 0.5F);
				float var147 = (float) (var29 + 0.5F);
				float var148 = (float) (var28 + 0.5F) - var147;
				float var149 = var147 - var146;
				int var150 = var68[(int) var146];
				if (var49 < var51) {
					while (--var149 >= 0.0F) {
						this.method5359(Statics.field5989, var23, 0, 0, var150, (int) var141, (int) var27, var129, var38, var130, var47, var143, var144, var145, var60, var63, var66);
						var141 += var49;
						var27 += var51;
						var129 += var39;
						var150 += Statics.field5990;
						var143 += var61;
						var144 += var64;
						var145 += var67;
						var130 += var48;
					}
					while (--var148 >= 0.0F) {
						this.method5359(Statics.field5989, var23, 0, 0, var150, (int) var26, (int) var27, var129, var38, var130, var47, var143, var144, var145, var60, var63, var66);
						var26 += var50;
						var27 += var51;
						var129 += var39;
						var150 += Statics.field5990;
						var143 += var61;
						var144 += var64;
						var145 += var67;
						var130 += var48;
					}
				} else {
					while (--var149 >= 0.0F) {
						this.method5359(Statics.field5989, var23, 0, 0, var150, (int) var27, (int) var141, var129, var38, var130, var47, var143, var144, var145, var60, var63, var66);
						var141 += var49;
						var27 += var51;
						var129 += var39;
						var150 += Statics.field5990;
						var143 += var61;
						var144 += var64;
						var145 += var67;
						var130 += var48;
					}
					while (--var148 >= 0.0F) {
						this.method5359(Statics.field5989, var23, 0, 0, var150, (int) var27, (int) var26, var129, var38, var130, var47, var143, var144, var145, var60, var63, var66);
						var26 += var50;
						var27 += var51;
						var129 += var39;
						var150 += Statics.field5990;
						var143 += var61;
						var144 += var64;
						var145 += var67;
						var130 += var48;
					}
				}
			}
		}
	}

	@ObfuscatedName("jy.cc([I[IIIIIIIIFFIIIIII)V")
	public final void method5359(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, float arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
		if (this.field2669.field3003) {
			if (arg6 > this.field2669.field2998) {
				arg6 = this.field2669.field2998;
			}
			if (arg5 < 0) {
				arg5 = 0;
			}
		}
		if (arg5 >= arg6) {
			return;
		}
		int var18 = arg4 + arg5;
		int var19 = arg5 * arg8 + arg7;
		float var20 = (float) arg5 * arg10 + arg9;
		int var21 = arg6 - arg5;
		int var22 = arg5 - this.field2669.field3004;
		int var23 = (arg14 >> 3) * var22 + arg11;
		int var24 = (arg15 >> 3) * var22 + arg12;
		int var25 = (arg16 >> 3) * var22 + arg13;
		int var26 = var25 >> 14;
		int var27;
		int var28;
		if (var26 == 0) {
			var27 = 0;
			var28 = 0;
		} else {
			var27 = var23 / var26;
			var28 = var24 / var26;
			if (var27 < 0) {
				var27 = 0;
			} else if (var27 > 16256) {
				var27 = 16256;
			}
		}
		int var29 = arg14 + var23;
		int var30 = arg15 + var24;
		int var31 = arg16 + var25;
		int var32 = var31 >> 14;
		int var33;
		int var34;
		if (var32 == 0) {
			var33 = 0;
			var34 = 0;
		} else {
			var33 = var29 / var32;
			var34 = var30 / var32;
			if (var33 < 0) {
				var33 = 0;
			} else if (var33 > 16256) {
				var33 = 16256;
			}
		}
		int var35 = (var27 << 18) + var28;
		int var36 = (var33 - var27 >> 3 << 18) + (var34 - var28 >> 3);
		int var37 = var21 >> 3;
		int var38 = arg8 << 3;
		int var39 = var19 >> 8;
		int var10000;
		if (this.field2660) {
			if (this.field2669.field3005 == 0) {
				while (var37-- > 0) {
					this.method5349(arg0, Statics.field5988, arg1, var18, var39, var35, var20);
					var18++;
					int var40 = var35 + var36;
					float var41 = arg10 + var20;
					this.method5349(arg0, Statics.field5988, arg1, var18, var39, var40, var41);
					var18++;
					int var42 = var36 + var40;
					float var43 = arg10 + var41;
					this.method5349(arg0, Statics.field5988, arg1, var18, var39, var42, var43);
					var18++;
					int var44 = var36 + var42;
					float var45 = arg10 + var43;
					this.method5349(arg0, Statics.field5988, arg1, var18, var39, var44, var45);
					var18++;
					int var46 = var36 + var44;
					float var47 = arg10 + var45;
					this.method5349(arg0, Statics.field5988, arg1, var18, var39, var46, var47);
					var18++;
					int var48 = var36 + var46;
					float var49 = arg10 + var47;
					this.method5349(arg0, Statics.field5988, arg1, var18, var39, var48, var49);
					var18++;
					int var50 = var36 + var48;
					float var51 = arg10 + var49;
					this.method5349(arg0, Statics.field5988, arg1, var18, var39, var50, var51);
					var18++;
					int var52 = var36 + var50;
					float var53 = arg10 + var51;
					this.method5349(arg0, Statics.field5988, arg1, var18, var39, var52, var53);
					var18++;
					var10000 = var36 + var52;
					var20 = arg10 + var53;
					int var55 = var33;
					int var56 = var34;
					var29 += arg14;
					var30 += arg15;
					var31 += arg16;
					int var57 = var31 >> 14;
					if (var57 == 0) {
						var33 = 0;
						var34 = 0;
					} else {
						var33 = var29 / var57;
						var34 = var30 / var57;
						if (var33 < 0) {
							var33 = 0;
						} else if (var33 > 16256) {
							var33 = 16256;
						}
					}
					var35 = (var55 << 18) + var56;
					var36 = (var33 - var55 >> 3 << 18) + (var34 - var56 >> 3);
					var19 += var38;
					var39 = var19 >> 8;
				}
				int var58 = arg6 - arg5 & 0x7;
				while (var58-- > 0) {
					this.method5349(arg0, Statics.field5988, arg1, var18, var39, var35, var20);
					var18++;
					var35 += var36;
					var20 += arg10;
				}
			} else {
				int var59 = this.field2669.field3005;
				int var60 = 256 - this.field2669.field3005;
				int var61 = var39 * var60 >> 8;
				while (var37-- > 0) {
					this.method5350(arg0, Statics.field5988, arg1, var18, var59, var61, var35, var20);
					var18++;
					int var62 = var35 + var36;
					float var63 = arg10 + var20;
					this.method5350(arg0, Statics.field5988, arg1, var18, var59, var61, var62, var63);
					var18++;
					int var64 = var36 + var62;
					float var65 = arg10 + var63;
					this.method5350(arg0, Statics.field5988, arg1, var18, var59, var61, var64, var65);
					var18++;
					int var66 = var36 + var64;
					float var67 = arg10 + var65;
					this.method5350(arg0, Statics.field5988, arg1, var18, var59, var61, var66, var67);
					var18++;
					int var68 = var36 + var66;
					float var69 = arg10 + var67;
					this.method5350(arg0, Statics.field5988, arg1, var18, var59, var61, var68, var69);
					var18++;
					int var70 = var36 + var68;
					float var71 = arg10 + var69;
					this.method5350(arg0, Statics.field5988, arg1, var18, var59, var61, var70, var71);
					var18++;
					int var72 = var36 + var70;
					float var73 = arg10 + var71;
					this.method5350(arg0, Statics.field5988, arg1, var18, var59, var61, var72, var73);
					var18++;
					int var74 = var36 + var72;
					float var75 = arg10 + var73;
					this.method5350(arg0, Statics.field5988, arg1, var18, var59, var61, var74, var75);
					var18++;
					var10000 = var36 + var74;
					var20 = arg10 + var75;
					int var77 = var33;
					int var78 = var34;
					var29 += arg14;
					var30 += arg15;
					var31 += arg16;
					int var79 = var31 >> 14;
					if (var79 == 0) {
						var33 = 0;
						var34 = 0;
					} else {
						var33 = var29 / var79;
						var34 = var30 / var79;
						if (var33 < 0) {
							var33 = 0;
						} else if (var33 > 16256) {
							var33 = 16256;
						}
					}
					var35 = (var77 << 18) + var78;
					var36 = (var33 - var77 >> 3 << 18) + (var34 - var78 >> 3);
					var19 += var38;
					int var80 = var19 >> 8;
				}
				int var81 = arg6 - arg5 & 0x7;
				while (var81-- > 0) {
					this.method5350(arg0, Statics.field5988, arg1, var18, var59, var61, var35, var20);
					var18++;
					var35 += var36;
					var20 += arg10;
				}
			}
		} else if (this.field2669.field3005 == 0) {
			while (var37-- > 0) {
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var35, var20);
				var18++;
				int var82 = var35 + var36;
				float var83 = arg10 + var20;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var82, var83);
				var18++;
				int var84 = var36 + var82;
				float var85 = arg10 + var83;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var84, var85);
				var18++;
				int var86 = var36 + var84;
				float var87 = arg10 + var85;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var86, var87);
				var18++;
				int var88 = var36 + var86;
				float var89 = arg10 + var87;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var88, var89);
				var18++;
				int var90 = var36 + var88;
				float var91 = arg10 + var89;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var90, var91);
				var18++;
				int var92 = var36 + var90;
				float var93 = arg10 + var91;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var92, var93);
				var18++;
				int var94 = var36 + var92;
				float var95 = arg10 + var93;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var94, var95);
				var18++;
				var10000 = var36 + var94;
				var20 = arg10 + var95;
				int var97 = var33;
				int var98 = var34;
				var29 += arg14;
				var30 += arg15;
				var31 += arg16;
				int var99 = var31 >> 14;
				if (var99 == 0) {
					var33 = 0;
					var34 = 0;
				} else {
					var33 = var29 / var99;
					var34 = var30 / var99;
					if (var33 < 0) {
						var33 = 0;
					} else if (var33 > 16256) {
						var33 = 16256;
					}
				}
				var35 = (var97 << 18) + var98;
				var36 = (var33 - var97 >> 3 << 18) + (var34 - var98 >> 3);
				var19 += var38;
				var39 = var19 >> 8;
			}
			int var100 = arg6 - arg5 & 0x7;
			while (var100-- > 0) {
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var35, var20);
				var18++;
				var35 += var36;
				var20 += arg10;
			}
		} else {
			int var101 = this.field2669.field3005;
			int var102 = 256 - this.field2669.field3005;
			int var103 = var39 * var102 >> 8;
			while (var37-- > 0) {
				this.method5387(arg0, Statics.field5988, arg1, var18, var101, var103, var35, var20);
				var18++;
				int var104 = var35 + var36;
				float var105 = arg10 + var20;
				this.method5387(arg0, Statics.field5988, arg1, var18, var101, var103, var104, var105);
				var18++;
				int var106 = var36 + var104;
				float var107 = arg10 + var105;
				this.method5387(arg0, Statics.field5988, arg1, var18, var101, var103, var106, var107);
				var18++;
				int var108 = var36 + var106;
				float var109 = arg10 + var107;
				this.method5387(arg0, Statics.field5988, arg1, var18, var101, var103, var108, var109);
				var18++;
				int var110 = var36 + var108;
				float var111 = arg10 + var109;
				this.method5387(arg0, Statics.field5988, arg1, var18, var101, var103, var110, var111);
				var18++;
				int var112 = var36 + var110;
				float var113 = arg10 + var111;
				this.method5387(arg0, Statics.field5988, arg1, var18, var101, var103, var112, var113);
				var18++;
				int var114 = var36 + var112;
				float var115 = arg10 + var113;
				this.method5387(arg0, Statics.field5988, arg1, var18, var101, var103, var114, var115);
				var18++;
				int var116 = var36 + var114;
				float var117 = arg10 + var115;
				this.method5387(arg0, Statics.field5988, arg1, var18, var101, var103, var116, var117);
				var18++;
				var10000 = var36 + var116;
				var20 = arg10 + var117;
				int var119 = var33;
				int var120 = var34;
				var29 += arg14;
				var30 += arg15;
				var31 += arg16;
				int var121 = var31 >> 14;
				if (var121 == 0) {
					var33 = 0;
					var34 = 0;
				} else {
					var33 = var29 / var121;
					var34 = var30 / var121;
					if (var33 < 0) {
						var33 = 0;
					} else if (var33 > 16256) {
						var33 = 16256;
					}
				}
				var35 = (var119 << 18) + var120;
				var36 = (var33 - var119 >> 3 << 18) + (var34 - var120 >> 3);
				var19 += var38;
				int var122 = var19 >> 8;
			}
			int var123 = arg6 - arg5 & 0x7;
			while (var123-- > 0) {
				this.method5387(arg0, Statics.field5988, arg1, var18, var101, var103, var35, var20);
				var18++;
				var35 += var36;
				var20 += arg10;
			}
		}
	}

	@ObfuscatedName("jy.am(FFFFFFFFFIIIIIIIIIIIII)V")
	public void method4746(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
		int[] var23 = this.field2669.field3011.method5082(arg21);
		if (var23 == null) {
			int var24 = this.field2669.field3011.method5069(arg21);
			this.method4755(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, method4786(var24, arg9), method4786(var24, arg10), method4786(var24, arg11));
			return;
		}
		this.field2660 = this.field2669.field3011.method5070(arg21);
		float var25 = (float) (arg3 + 0.5F);
		float var26 = (float) (arg4 + 0.5F);
		float var27 = (float) (arg5 + 0.5F);
		float var28 = (float) (arg0 + 0.5F);
		float var29 = (float) (arg1 + 0.5F);
		float var30 = (float) (arg2 + 0.5F);
		float var31 = var26 - var25;
		float var32 = var29 - var28;
		float var33 = var27 - var25;
		float var34 = var30 - var28;
		float var35 = var31 * var34 - var32 * var33;
		if (var35 == 0.0F) {
			return;
		}
		float var36 = (float) (arg10 - arg9);
		float var37 = (float) (arg11 - arg9);
		int var38 = (int) ((var34 * var36 - var32 * var37) * 512.0F / var35);
		int var39 = (int) ((var31 * var37 - var33 * var36) * 512.0F / var35);
		float var40 = arg4 - arg3;
		float var41 = arg1 - arg0;
		float var42 = arg5 - arg3;
		float var43 = arg2 - arg0;
		float var44 = var40 * var43 - var41 * var42;
		if (var44 == 0.0F) {
			return;
		}
		float var45 = arg7 - arg6;
		float var46 = arg8 - arg6;
		float var47 = (var43 * var45 - var41 * var46) / var44;
		float var48 = (var40 * var46 - var42 * var45) / var44;
		float var49;
		if (var29 == var30) {
			var49 = 0.0F;
		} else {
			var49 = (var27 - var26) / (var30 - var29);
		}
		float var50;
		if (var28 == var29) {
			var50 = 0.0F;
		} else {
			var50 = var31 / var32;
		}
		float var51;
		if (var28 == var30) {
			var51 = 0.0F;
		} else {
			var51 = var33 / var34;
		}
		int var52 = this.field2669.field3006;
		int var53 = arg12 - arg13;
		int var54 = arg15 - arg16;
		int var55 = arg18 - arg19;
		int var56 = arg14 - arg12;
		int var57 = arg17 - arg15;
		int var58 = arg20 - arg18;
		int var59 = arg15 * var56 - arg12 * var57 << 14;
		int var60 = (int) (((long) (arg18 * var57 - arg15 * var58) << 14) / (long) var52);
		int var61 = (int) (((long) (arg12 * var58 - arg18 * var56) << 14) / (long) var52);
		int var62 = arg15 * var53 - arg12 * var54 << 14;
		int var63 = (int) (((long) (arg18 * var54 - arg15 * var55) << 14) / (long) var52);
		int var64 = (int) (((long) (arg12 * var55 - arg18 * var53) << 14) / (long) var52);
		int var65 = var54 * var56 - var53 * var57 << 14;
		int var66 = (int) (((long) (var55 * var57 - var54 * var58) << 14) / (long) var52);
		int var67 = (int) (((long) (var53 * var58 - var55 * var56) << 14) / (long) var52);
		int[] var68 = this.field2669.field3016;
		int var69 = this.field2669.field3010;
		if (var28 <= var29 && var28 <= var30) {
			if (!(var28 >= (float) var69)) {
				if (var29 > (float) var69) {
					var29 = var69;
				}
				if (var30 > (float) var69) {
					var30 = var69;
				}
				int var70 = (arg9 << 9) - (int) var25 * var38 + var38;
				float var71 = this.method5355(arg3, arg0, arg6, var47, var48);
				if (var29 < var30) {
					float var72 = var25;
					if (var28 < 0.0F) {
						var72 = var25 - var28 * var51;
						var25 -= var28 * var50;
						var70 -= (int) var28 * var39;
						var28 = 0.0F;
					}
					if (var29 < 0.0F) {
						var26 -= var29 * var49;
						var29 = 0.0F;
					}
					int var73 = (int) var28 - this.field2669.field3009;
					int var74 = var61 * var73 + var59;
					int var75 = var64 * var73 + var62;
					int var76 = var67 * var73 + var65;
					if ((var28 == var29 || !(var51 < var50)) && (var28 != var29 || !(var51 > var49))) {
						float var82 = (float) (var28 + 0.5F);
						float var83 = (float) (var29 + 0.5F);
						float var84 = (float) (var30 + 0.5F) - var83;
						float var85 = var83 - var82;
						int var86 = var68[(int) var82];
						while (--var85 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var86, (int) var25, (int) var72, var70, var38, var71, var47, var74, var75, var76, var60, var63, var66);
							var72 += var51;
							var25 += var50;
							var70 += var39;
							var86 += Statics.field5990;
							var74 += var61;
							var75 += var64;
							var76 += var67;
							var71 += var48;
						}
						while (--var84 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var86, (int) var26, (int) var72, var70, var38, var71, var47, var74, var75, var76, var60, var63, var66);
							var72 += var51;
							var26 += var49;
							var70 += var39;
							var86 += Statics.field5990;
							var74 += var61;
							var75 += var64;
							var76 += var67;
							var71 += var48;
						}
					} else {
						float var77 = (float) (var28 + 0.5F);
						float var78 = (float) (var29 + 0.5F);
						float var79 = (float) (var30 + 0.5F) - var78;
						float var80 = var78 - var77;
						int var81 = var68[(int) var77];
						while (--var80 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var81, (int) var72, (int) var25, var70, var38, var71, var47, var74, var75, var76, var60, var63, var66);
							var72 += var51;
							var25 += var50;
							var70 += var39;
							var81 += Statics.field5990;
							var74 += var61;
							var75 += var64;
							var76 += var67;
							var71 += var48;
						}
						while (--var79 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var81, (int) var72, (int) var26, var70, var38, var71, var47, var74, var75, var76, var60, var63, var66);
							var72 += var51;
							var26 += var49;
							var70 += var39;
							var81 += Statics.field5990;
							var74 += var61;
							var75 += var64;
							var76 += var67;
							var71 += var48;
						}
					}
				} else {
					float var87 = var25;
					if (var28 < 0.0F) {
						var87 = var25 - var28 * var51;
						var25 -= var28 * var50;
						var70 -= (int) var28 * var39;
						var28 = 0.0F;
					}
					if (var30 < 0.0F) {
						var27 -= var30 * var49;
						var30 = 0.0F;
					}
					int var88 = (int) var28 - this.field2669.field3009;
					int var89 = var61 * var88 + var59;
					int var90 = var64 * var88 + var62;
					int var91 = var67 * var88 + var65;
					if ((var28 == var30 || !(var51 < var50)) && (var28 != var30 || !(var49 > var50))) {
						float var97 = (float) (var28 + 0.5F);
						float var98 = (float) (var30 + 0.5F);
						float var99 = (float) (var29 + 0.5F) - var98;
						float var100 = var98 - var97;
						int var101 = var68[(int) var97];
						while (--var100 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var101, (int) var25, (int) var87, var70, var38, var71, var47, var89, var90, var91, var60, var63, var66);
							var87 += var51;
							var25 += var50;
							var70 += var39;
							var101 += Statics.field5990;
							var89 += var61;
							var90 += var64;
							var91 += var67;
							var71 += var48;
						}
						while (--var99 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var101, (int) var25, (int) var27, var70, var38, var71, var47, var89, var90, var91, var60, var63, var66);
							var27 += var49;
							var25 += var50;
							var70 += var39;
							var101 += Statics.field5990;
							var89 += var61;
							var90 += var64;
							var91 += var67;
							var71 += var48;
						}
					} else {
						float var92 = (float) (var28 + 0.5F);
						float var93 = (float) (var30 + 0.5F);
						float var94 = (float) (var29 + 0.5F) - var93;
						float var95 = var93 - var92;
						int var96 = var68[(int) var92];
						while (--var95 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var96, (int) var87, (int) var25, var70, var38, var71, var47, var89, var90, var91, var60, var63, var66);
							var87 += var51;
							var25 += var50;
							var70 += var39;
							var96 += Statics.field5990;
							var89 += var61;
							var90 += var64;
							var91 += var67;
							var71 += var48;
						}
						while (--var94 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var96, (int) var27, (int) var25, var70, var38, var71, var47, var89, var90, var91, var60, var63, var66);
							var27 += var49;
							var25 += var50;
							var70 += var39;
							var96 += Statics.field5990;
							var89 += var61;
							var90 += var64;
							var91 += var67;
							var71 += var48;
						}
					}
				}
			}
		} else if (var29 <= var30) {
			if (!(var29 >= (float) var69)) {
				if (var30 > (float) var69) {
					var30 = var69;
				}
				if (var28 > (float) var69) {
					var28 = var69;
				}
				int var102 = (arg10 << 9) - (int) var26 * var38 + var38;
				float var103 = this.method5355(arg4, arg1, arg7, var47, var48);
				if (var30 < var28) {
					float var104 = var26;
					if (var29 < 0.0F) {
						var104 = var26 - var29 * var50;
						var26 -= var29 * var49;
						var102 -= (int) var29 * var39;
						var29 = 0.0F;
					}
					if (var30 < 0.0F) {
						var27 -= var30 * var51;
						var30 = 0.0F;
					}
					int var105 = (int) var29 - this.field2669.field3009;
					int var106 = var61 * var105 + var59;
					int var107 = var64 * var105 + var62;
					int var108 = var67 * var105 + var65;
					if (var29 != var30 && var50 < var49 || var29 == var30 && var50 > var51) {
						float var109 = (float) (var29 + 0.5F);
						float var110 = (float) (var30 + 0.5F);
						float var111 = (float) (var28 + 0.5F) - var110;
						float var112 = var110 - var109;
						int var113 = var68[(int) var109];
						while (--var112 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var113, (int) var104, (int) var26, var102, var38, var103, var47, var106, var107, var108, var60, var63, var66);
							var104 += var50;
							var26 += var49;
							var102 += var39;
							var113 += Statics.field5990;
							var106 += var61;
							var107 += var64;
							var108 += var67;
							var103 += var48;
						}
						while (--var111 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var113, (int) var104, (int) var27, var102, var38, var103, var47, var106, var107, var108, var60, var63, var66);
							var104 += var50;
							var27 += var51;
							var102 += var39;
							var113 += Statics.field5990;
							var106 += var61;
							var107 += var64;
							var108 += var67;
							var103 += var48;
						}
					} else {
						float var114 = (float) (var29 + 0.5F);
						float var115 = (float) (var30 + 0.5F);
						float var116 = (float) (var28 + 0.5F) - var115;
						float var117 = var115 - var114;
						int var118 = var68[(int) var114];
						while (--var117 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var118, (int) var26, (int) var104, var102, var38, var103, var47, var106, var107, var108, var60, var63, var66);
							var104 += var50;
							var26 += var49;
							var102 += var39;
							var118 += Statics.field5990;
							var106 += var61;
							var107 += var64;
							var108 += var67;
							var103 += var48;
						}
						while (--var116 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var118, (int) var27, (int) var104, var102, var38, var103, var47, var106, var107, var108, var60, var63, var66);
							var104 += var50;
							var27 += var51;
							var102 += var39;
							var118 += Statics.field5990;
							var106 += var61;
							var107 += var64;
							var108 += var67;
							var103 += var48;
						}
					}
				} else {
					float var119 = var26;
					float var120 = var26;
					if (var29 < 0.0F) {
						var120 = var26 - var29 * var50;
						var119 = var26 - var29 * var49;
						var102 -= (int) var29 * var39;
						var29 = 0.0F;
					}
					if (var28 < 0.0F) {
						var25 -= var28 * var51;
						var28 = 0.0F;
					}
					int var121 = (int) var29 - this.field2669.field3009;
					int var122 = var61 * var121 + var59;
					int var123 = var64 * var121 + var62;
					int var124 = var67 * var121 + var65;
					float var125 = (float) (var29 + 0.5F);
					float var126 = (float) (var28 + 0.5F);
					float var127 = (float) (var30 + 0.5F) - var126;
					float var128 = var126 - var125;
					int var129 = var68[(int) var125];
					if (var50 < var49) {
						while (--var128 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var129, (int) var120, (int) var119, var102, var38, var103, var47, var122, var123, var124, var60, var63, var66);
							var120 += var50;
							var119 += var49;
							var102 += var39;
							var129 += Statics.field5990;
							var122 += var61;
							var123 += var64;
							var124 += var67;
							var103 += var48;
						}
						while (--var127 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var129, (int) var25, (int) var119, var102, var38, var103, var47, var122, var123, var124, var60, var63, var66);
							var25 += var51;
							var119 += var49;
							var102 += var39;
							var129 += Statics.field5990;
							var122 += var61;
							var123 += var64;
							var124 += var67;
							var103 += var48;
						}
					} else {
						while (--var128 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var129, (int) var119, (int) var120, var102, var38, var103, var47, var122, var123, var124, var60, var63, var66);
							var120 += var50;
							var119 += var49;
							var102 += var39;
							var129 += Statics.field5990;
							var122 += var61;
							var123 += var64;
							var124 += var67;
							var103 += var48;
						}
						while (--var127 >= 0.0F) {
							this.method5365(Statics.field5989, var23, 0, 0, var129, (int) var119, (int) var25, var102, var38, var103, var47, var122, var123, var124, var60, var63, var66);
							var25 += var51;
							var119 += var49;
							var102 += var39;
							var129 += Statics.field5990;
							var122 += var61;
							var123 += var64;
							var124 += var67;
							var103 += var48;
						}
					}
				}
			}
		} else if (!(var30 >= (float) var69)) {
			if (var28 > (float) var69) {
				var28 = var69;
			}
			if (var29 > (float) var69) {
				var29 = var69;
			}
			int var130 = (arg11 << 9) - (int) var27 * var38 + var38;
			float var131 = this.method5355(arg5, arg2, arg8, var47, var48);
			if (var28 < var29) {
				float var132 = var27;
				if (var30 < 0.0F) {
					var132 = var27 - var30 * var49;
					var27 -= var30 * var51;
					var130 -= (int) var30 * var39;
					var30 = 0.0F;
				}
				if (var28 < 0.0F) {
					var25 -= var28 * var50;
					var28 = 0.0F;
				}
				int var133 = (int) var30 - this.field2669.field3009;
				int var134 = var61 * var133 + var59;
				int var135 = var64 * var133 + var62;
				int var136 = var67 * var133 + var65;
				float var137 = (float) (var30 + 0.5F);
				float var138 = (float) (var28 + 0.5F);
				float var139 = (float) (var29 + 0.5F) - var138;
				float var140 = var138 - var137;
				int var141 = var68[(int) var137];
				if (var49 < var51) {
					while (--var140 >= 0.0F) {
						this.method5365(Statics.field5989, var23, 0, 0, var141, (int) var132, (int) var27, var130, var38, var131, var47, var134, var135, var136, var60, var63, var66);
						var132 += var49;
						var27 += var51;
						var130 += var39;
						var141 += Statics.field5990;
						var134 += var61;
						var135 += var64;
						var136 += var67;
						var131 += var48;
					}
					while (--var139 >= 0.0F) {
						this.method5365(Statics.field5989, var23, 0, 0, var141, (int) var132, (int) var25, var130, var38, var131, var47, var134, var135, var136, var60, var63, var66);
						var132 += var49;
						var25 += var50;
						var130 += var39;
						var141 += Statics.field5990;
						var134 += var61;
						var135 += var64;
						var136 += var67;
						var131 += var48;
					}
				} else {
					while (--var140 >= 0.0F) {
						this.method5365(Statics.field5989, var23, 0, 0, var141, (int) var27, (int) var132, var130, var38, var131, var47, var134, var135, var136, var60, var63, var66);
						var132 += var49;
						var27 += var51;
						var130 += var39;
						var141 += Statics.field5990;
						var134 += var61;
						var135 += var64;
						var136 += var67;
						var131 += var48;
					}
					while (--var139 >= 0.0F) {
						this.method5365(Statics.field5989, var23, 0, 0, var141, (int) var25, (int) var132, var130, var38, var131, var47, var134, var135, var136, var60, var63, var66);
						var132 += var49;
						var25 += var50;
						var130 += var39;
						var141 += Statics.field5990;
						var134 += var61;
						var135 += var64;
						var136 += var67;
						var131 += var48;
					}
				}
			} else {
				float var142 = var27;
				float var143 = var27;
				if (var30 < 0.0F) {
					var143 = var27 - var30 * var49;
					var142 = var27 - var30 * var51;
					var130 -= (int) var30 * var39;
					var30 = 0.0F;
				}
				if (var29 < 0.0F) {
					var26 -= var29 * var50;
					var29 = 0.0F;
				}
				int var144 = (int) var30 - this.field2669.field3009;
				int var145 = var61 * var144 + var59;
				int var146 = var64 * var144 + var62;
				int var147 = var67 * var144 + var65;
				float var148 = (float) (var30 + 0.5F);
				float var149 = (float) (var29 + 0.5F);
				float var150 = (float) (var28 + 0.5F) - var149;
				float var151 = var149 - var148;
				int var152 = var68[(int) var148];
				if (var49 < var51) {
					while (--var151 >= 0.0F) {
						this.method5365(Statics.field5989, var23, 0, 0, var152, (int) var143, (int) var142, var130, var38, var131, var47, var145, var146, var147, var60, var63, var66);
						var143 += var49;
						var142 += var51;
						var130 += var39;
						var152 += Statics.field5990;
						var145 += var61;
						var146 += var64;
						var147 += var67;
						var131 += var48;
					}
					while (--var150 >= 0.0F) {
						this.method5365(Statics.field5989, var23, 0, 0, var152, (int) var26, (int) var142, var130, var38, var131, var47, var145, var146, var147, var60, var63, var66);
						var26 += var50;
						var142 += var51;
						var130 += var39;
						var152 += Statics.field5990;
						var145 += var61;
						var146 += var64;
						var147 += var67;
						var131 += var48;
					}
				} else {
					while (--var151 >= 0.0F) {
						this.method5365(Statics.field5989, var23, 0, 0, var152, (int) var142, (int) var143, var130, var38, var131, var47, var145, var146, var147, var60, var63, var66);
						var143 += var49;
						var142 += var51;
						var130 += var39;
						var152 += Statics.field5990;
						var145 += var61;
						var146 += var64;
						var147 += var67;
						var131 += var48;
					}
					while (--var150 >= 0.0F) {
						this.method5365(Statics.field5989, var23, 0, 0, var152, (int) var142, (int) var26, var130, var38, var131, var47, var145, var146, var147, var60, var63, var66);
						var26 += var50;
						var142 += var51;
						var130 += var39;
						var152 += Statics.field5990;
						var145 += var61;
						var146 += var64;
						var147 += var67;
						var131 += var48;
					}
				}
			}
		}
	}

	@ObfuscatedName("jy.cj([I[IIIIIIIIFFIIIIII)V")
	public final void method5365(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, float arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
		if (this.field2669.field3003) {
			if (arg6 > this.field2669.field2998) {
				arg6 = this.field2669.field2998;
			}
			if (arg5 < 0) {
				arg5 = 0;
			}
		}
		if (arg5 >= arg6) {
			return;
		}
		int var18 = arg4 + arg5;
		int var19 = arg5 * arg8 + arg7;
		float var20 = (float) arg5 * arg10 + arg9;
		int var21 = arg6 - arg5;
		int var22 = arg5 - this.field2669.field3004;
		int var23 = arg14 * var22 + arg11;
		int var24 = arg15 * var22 + arg12;
		int var25 = arg16 * var22 + arg13;
		int var26 = var25 >> 14;
		int var27;
		int var28;
		if (var26 == 0) {
			var27 = 0;
			var28 = 0;
		} else {
			var27 = var23 / var26;
			var28 = var24 / var26;
		}
		int var29 = arg14 * var21 + var23;
		int var30 = arg15 * var21 + var24;
		int var31 = arg16 * var21 + var25;
		int var32 = var31 >> 14;
		int var33;
		int var34;
		if (var32 == 0) {
			var33 = 0;
			var34 = 0;
		} else {
			var33 = var29 / var32;
			var34 = var30 / var32;
		}
		int var35 = (var27 << 18) + var28;
		int var36 = ((var33 - var27) / var21 << 18) + (var34 - var28) / var21;
		int var37 = var21 >> 3;
		int var38 = arg8 << 3;
		int var39 = var19 >> 8;
		if (!this.field2660) {
			while (var37-- > 0) {
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var35, var20);
				var18++;
				int var55 = var35 + var36;
				float var56 = arg10 + var20;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var55, var56);
				var18++;
				int var57 = var36 + var55;
				float var58 = arg10 + var56;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var57, var58);
				var18++;
				int var59 = var36 + var57;
				float var60 = arg10 + var58;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var59, var60);
				var18++;
				int var61 = var36 + var59;
				float var62 = arg10 + var60;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var61, var62);
				var18++;
				int var63 = var36 + var61;
				float var64 = arg10 + var62;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var63, var64);
				var18++;
				int var65 = var36 + var63;
				float var66 = arg10 + var64;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var65, var66);
				var18++;
				int var67 = var36 + var65;
				float var68 = arg10 + var66;
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var67, var68);
				var18++;
				var35 = var36 + var67;
				var20 = arg10 + var68;
				var19 += var38;
				var39 = var19 >> 8;
			}
			int var69 = arg6 - arg5 & 0x7;
			while (var69-- > 0) {
				this.method5360(arg0, Statics.field5988, arg1, var18, var39, var35, var20);
				var18++;
				var35 += var36;
				var20 += arg10;
			}
			return;
		}
		while (var37-- > 0) {
			this.method5349(arg0, Statics.field5988, arg1, var18, var39, var35, var20);
			var18++;
			int var40 = var35 + var36;
			float var41 = arg10 + var20;
			this.method5349(arg0, Statics.field5988, arg1, var18, var39, var40, var41);
			var18++;
			int var42 = var36 + var40;
			float var43 = arg10 + var41;
			this.method5349(arg0, Statics.field5988, arg1, var18, var39, var42, var43);
			var18++;
			int var44 = var36 + var42;
			float var45 = arg10 + var43;
			this.method5349(arg0, Statics.field5988, arg1, var18, var39, var44, var45);
			var18++;
			int var46 = var36 + var44;
			float var47 = arg10 + var45;
			this.method5349(arg0, Statics.field5988, arg1, var18, var39, var46, var47);
			var18++;
			int var48 = var36 + var46;
			float var49 = arg10 + var47;
			this.method5349(arg0, Statics.field5988, arg1, var18, var39, var48, var49);
			var18++;
			int var50 = var36 + var48;
			float var51 = arg10 + var49;
			this.method5349(arg0, Statics.field5988, arg1, var18, var39, var50, var51);
			var18++;
			int var52 = var36 + var50;
			float var53 = arg10 + var51;
			this.method5349(arg0, Statics.field5988, arg1, var18, var39, var52, var53);
			var18++;
			var35 = var36 + var52;
			var20 = arg10 + var53;
			var19 += var38;
			var39 = var19 >> 8;
		}
		int var54 = arg6 - arg5 & 0x7;
		while (var54-- > 0) {
			this.method5349(arg0, Statics.field5988, arg1, var18, var39, var35, var20);
			var18++;
			var35 += var36;
			var20 += arg10;
		}
	}
}
