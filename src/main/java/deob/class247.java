package deob;

@ObfuscatedName("ja")
public class class247 extends class229 {

	public class247(class248 arg0) {
		super(arg0);
	}

	@ObfuscatedName("ja.aq()Z")
	public boolean method4752() {
		return false;
	}

	@ObfuscatedName("ja.au(FFFFFFFFFIII)V")
	public void method4755(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
		int var13 = (int) arg3;
		int var14 = (int) arg4;
		int var15 = (int) arg5;
		int var16 = (int) arg0;
		int var17 = (int) arg1;
		int var18 = (int) arg2;
		int var19 = var14 - var13;
		int var20 = var17 - var16;
		int var21 = var15 - var13;
		int var22 = var18 - var16;
		int var23 = arg10 - arg9;
		int var24 = arg11 - arg9;
		int var25;
		if (var17 == var18) {
			var25 = 0;
		} else {
			var25 = (var15 - var14 << 14) / (var18 - var17);
		}
		int var26;
		if (var16 == var17) {
			var26 = 0;
		} else {
			var26 = (var19 << 14) / var20;
		}
		int var27;
		if (var16 == var18) {
			var27 = 0;
		} else {
			var27 = (var21 << 14) / var22;
		}
		int var28 = var19 * var22 - var20 * var21;
		if (var28 == 0) {
			return;
		}
		int var29 = (var22 * var23 - var20 * var24 << 8) / var28;
		int var30 = (var19 * var24 - var21 * var23 << 8) / var28;
		int[] var31 = this.field2669.field3016;
		int var32 = this.field2669.field3010;
		if (var16 <= var17 && var16 <= var18) {
			if (var16 < var32) {
				if (var17 > var32) {
					var17 = var32;
				}
				if (var18 > var32) {
					var18 = var32;
				}
				int var33 = (arg9 << 8) - var13 * var29 + var29;
				if (var17 < var18) {
					int var34;
					int var35 = var34 = var13 << 14;
					if (var16 < 0) {
						var35 -= var16 * var27;
						var34 -= var16 * var26;
						var33 -= var16 * var30;
						var16 = 0;
					}
					int var36 = var14 << 14;
					if (var17 < 0) {
						var36 -= var17 * var25;
						var17 = 0;
					}
					if ((var16 == var17 || var27 >= var26) && (var16 != var17 || var27 <= var25)) {
						int var40 = var18 - var17;
						int var41 = var17 - var16;
						int var42 = var31[var16];
						while (true) {
							var41--;
							if (var41 < 0) {
								while (true) {
									var40--;
									if (var40 < 0) {
										return;
									}
									this.method5322(Statics.field5989, var42, 0, 0, var36 >> 14, var35 >> 14, var33, var29);
									var35 += var27;
									var36 += var25;
									var33 += var30;
									var42 += Statics.field5990;
								}
							}
							this.method5322(Statics.field5989, var42, 0, 0, var34 >> 14, var35 >> 14, var33, var29);
							var35 += var27;
							var34 += var26;
							var33 += var30;
							var42 += Statics.field5990;
						}
					} else {
						int var37 = var18 - var17;
						int var38 = var17 - var16;
						int var39 = var31[var16];
						while (true) {
							var38--;
							if (var38 < 0) {
								while (true) {
									var37--;
									if (var37 < 0) {
										return;
									}
									this.method5322(Statics.field5989, var39, 0, 0, var35 >> 14, var36 >> 14, var33, var29);
									var35 += var27;
									var36 += var25;
									var33 += var30;
									var39 += Statics.field5990;
								}
							}
							this.method5322(Statics.field5989, var39, 0, 0, var35 >> 14, var34 >> 14, var33, var29);
							var35 += var27;
							var34 += var26;
							var33 += var30;
							var39 += Statics.field5990;
						}
					}
				} else {
					int var43;
					int var44 = var43 = var13 << 14;
					if (var16 < 0) {
						var44 -= var16 * var27;
						var43 -= var16 * var26;
						var33 -= var16 * var30;
						var16 = 0;
					}
					int var45 = var15 << 14;
					if (var18 < 0) {
						var45 -= var18 * var25;
						var18 = 0;
					}
					if (var16 != var18 && var27 < var26 || var16 == var18 && var25 > var26) {
						int var46 = var17 - var18;
						int var47 = var18 - var16;
						int var48 = var31[var16];
						while (true) {
							var47--;
							if (var47 < 0) {
								while (true) {
									var46--;
									if (var46 < 0) {
										return;
									}
									this.method5322(Statics.field5989, var48, 0, 0, var45 >> 14, var43 >> 14, var33, var29);
									var45 += var25;
									var43 += var26;
									var33 += var30;
									var48 += Statics.field5990;
								}
							}
							this.method5322(Statics.field5989, var48, 0, 0, var44 >> 14, var43 >> 14, var33, var29);
							var44 += var27;
							var43 += var26;
							var33 += var30;
							var48 += Statics.field5990;
						}
					} else {
						int var49 = var17 - var18;
						int var50 = var18 - var16;
						int var51 = var31[var16];
						while (true) {
							var50--;
							if (var50 < 0) {
								while (true) {
									var49--;
									if (var49 < 0) {
										return;
									}
									this.method5322(Statics.field5989, var51, 0, 0, var43 >> 14, var45 >> 14, var33, var29);
									var45 += var25;
									var43 += var26;
									var33 += var30;
									var51 += Statics.field5990;
								}
							}
							this.method5322(Statics.field5989, var51, 0, 0, var43 >> 14, var44 >> 14, var33, var29);
							var44 += var27;
							var43 += var26;
							var33 += var30;
							var51 += Statics.field5990;
						}
					}
				}
			}
		} else if (var17 <= var18) {
			if (var17 < var32) {
				if (var18 > var32) {
					var18 = var32;
				}
				if (var16 > var32) {
					var16 = var32;
				}
				int var52 = (arg10 << 8) - var14 * var29 + var29;
				if (var18 < var16) {
					int var53;
					int var54 = var53 = var14 << 14;
					if (var17 < 0) {
						var54 -= var17 * var26;
						var53 -= var17 * var25;
						var52 -= var17 * var30;
						var17 = 0;
					}
					int var55 = var15 << 14;
					if (var18 < 0) {
						var55 -= var18 * var27;
						var18 = 0;
					}
					if ((var17 == var18 || var26 >= var25) && (var17 != var18 || var26 <= var27)) {
						int var59 = var16 - var18;
						int var60 = var18 - var17;
						int var61 = var31[var17];
						while (true) {
							var60--;
							if (var60 < 0) {
								while (true) {
									var59--;
									if (var59 < 0) {
										return;
									}
									this.method5322(Statics.field5989, var61, 0, 0, var55 >> 14, var54 >> 14, var52, var29);
									var54 += var26;
									var55 += var27;
									var52 += var30;
									var61 += Statics.field5990;
								}
							}
							this.method5322(Statics.field5989, var61, 0, 0, var53 >> 14, var54 >> 14, var52, var29);
							var54 += var26;
							var53 += var25;
							var52 += var30;
							var61 += Statics.field5990;
						}
					} else {
						int var56 = var16 - var18;
						int var57 = var18 - var17;
						int var58 = var31[var17];
						while (true) {
							var57--;
							if (var57 < 0) {
								while (true) {
									var56--;
									if (var56 < 0) {
										return;
									}
									this.method5322(Statics.field5989, var58, 0, 0, var54 >> 14, var55 >> 14, var52, var29);
									var54 += var26;
									var55 += var27;
									var52 += var30;
									var58 += Statics.field5990;
								}
							}
							this.method5322(Statics.field5989, var58, 0, 0, var54 >> 14, var53 >> 14, var52, var29);
							var54 += var26;
							var53 += var25;
							var52 += var30;
							var58 += Statics.field5990;
						}
					}
				} else {
					int var62;
					int var63 = var62 = var14 << 14;
					if (var17 < 0) {
						var63 -= var17 * var26;
						var62 -= var17 * var25;
						var52 -= var17 * var30;
						var17 = 0;
					}
					int var64 = var13 << 14;
					if (var16 < 0) {
						var64 -= var16 * var27;
						var16 = 0;
					}
					if (var26 < var25) {
						int var65 = var18 - var16;
						int var66 = var16 - var17;
						int var67 = var31[var17];
						while (true) {
							var66--;
							if (var66 < 0) {
								while (true) {
									var65--;
									if (var65 < 0) {
										return;
									}
									this.method5322(Statics.field5989, var67, 0, 0, var64 >> 14, var62 >> 14, var52, var29);
									var64 += var27;
									var62 += var25;
									var52 += var30;
									var67 += Statics.field5990;
								}
							}
							this.method5322(Statics.field5989, var67, 0, 0, var63 >> 14, var62 >> 14, var52, var29);
							var63 += var26;
							var62 += var25;
							var52 += var30;
							var67 += Statics.field5990;
						}
					} else {
						int var68 = var18 - var16;
						int var69 = var16 - var17;
						int var70 = var31[var17];
						while (true) {
							var69--;
							if (var69 < 0) {
								while (true) {
									var68--;
									if (var68 < 0) {
										return;
									}
									this.method5322(Statics.field5989, var70, 0, 0, var62 >> 14, var64 >> 14, var52, var29);
									var64 += var27;
									var62 += var25;
									var52 += var30;
									var70 += Statics.field5990;
								}
							}
							this.method5322(Statics.field5989, var70, 0, 0, var62 >> 14, var63 >> 14, var52, var29);
							var63 += var26;
							var62 += var25;
							var52 += var30;
							var70 += Statics.field5990;
						}
					}
				}
			}
		} else if (var18 < var32) {
			if (var16 > var32) {
				var16 = var32;
			}
			if (var17 > var32) {
				var17 = var32;
			}
			int var71 = (arg11 << 8) - var15 * var29 + var29;
			if (var16 < var17) {
				int var72;
				int var73 = var72 = var15 << 14;
				if (var18 < 0) {
					var73 -= var18 * var25;
					var72 -= var18 * var27;
					var71 -= var18 * var30;
					var18 = 0;
				}
				int var74 = var13 << 14;
				if (var16 < 0) {
					var74 -= var16 * var26;
					var16 = 0;
				}
				if (var25 < var27) {
					int var75 = var17 - var16;
					int var76 = var16 - var18;
					int var77 = var31[var18];
					while (true) {
						var76--;
						if (var76 < 0) {
							while (true) {
								var75--;
								if (var75 < 0) {
									return;
								}
								this.method5322(Statics.field5989, var77, 0, 0, var73 >> 14, var74 >> 14, var71, var29);
								var73 += var25;
								var74 += var26;
								var71 += var30;
								var77 += Statics.field5990;
							}
						}
						this.method5322(Statics.field5989, var77, 0, 0, var73 >> 14, var72 >> 14, var71, var29);
						var73 += var25;
						var72 += var27;
						var71 += var30;
						var77 += Statics.field5990;
					}
				} else {
					int var78 = var17 - var16;
					int var79 = var16 - var18;
					int var80 = var31[var18];
					while (true) {
						var79--;
						if (var79 < 0) {
							while (true) {
								var78--;
								if (var78 < 0) {
									return;
								}
								this.method5322(Statics.field5989, var80, 0, 0, var74 >> 14, var73 >> 14, var71, var29);
								var73 += var25;
								var74 += var26;
								var71 += var30;
								var80 += Statics.field5990;
							}
						}
						this.method5322(Statics.field5989, var80, 0, 0, var72 >> 14, var73 >> 14, var71, var29);
						var73 += var25;
						var72 += var27;
						var71 += var30;
						var80 += Statics.field5990;
					}
				}
			} else {
				int var81;
				int var82 = var81 = var15 << 14;
				if (var18 < 0) {
					var82 -= var18 * var25;
					var81 -= var18 * var27;
					var71 -= var18 * var30;
					var18 = 0;
				}
				int var83 = var14 << 14;
				if (var17 < 0) {
					var83 -= var17 * var26;
					var17 = 0;
				}
				if (var25 < var27) {
					int var84 = var16 - var17;
					int var85 = var17 - var18;
					int var86 = var31[var18];
					while (true) {
						var85--;
						if (var85 < 0) {
							while (true) {
								var84--;
								if (var84 < 0) {
									return;
								}
								this.method5322(Statics.field5989, var86, 0, 0, var83 >> 14, var81 >> 14, var71, var29);
								var83 += var26;
								var81 += var27;
								var71 += var30;
								var86 += Statics.field5990;
							}
						}
						this.method5322(Statics.field5989, var86, 0, 0, var82 >> 14, var81 >> 14, var71, var29);
						var82 += var25;
						var81 += var27;
						var71 += var30;
						var86 += Statics.field5990;
					}
				} else {
					int var87 = var16 - var17;
					int var88 = var17 - var18;
					int var89 = var31[var18];
					while (true) {
						var88--;
						if (var88 < 0) {
							while (true) {
								var87--;
								if (var87 < 0) {
									return;
								}
								this.method5322(Statics.field5989, var89, 0, 0, var81 >> 14, var83 >> 14, var71, var29);
								var83 += var26;
								var81 += var27;
								var71 += var30;
								var89 += Statics.field5990;
							}
						}
						this.method5322(Statics.field5989, var89, 0, 0, var81 >> 14, var82 >> 14, var71, var29);
						var82 += var25;
						var81 += var27;
						var71 += var30;
						var89 += Statics.field5990;
					}
				}
			}
		}
	}

	@ObfuscatedName("ja.bv([IIIIIIII)V")
	public final void method5322(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
		int var9 = arg1 + arg4;
		int var10 = arg4 * arg7 + arg6;
		if (!this.field2669.field3000) {
			int var32 = arg5 - arg4;
			if (this.field2669.field3005 == 0) {
				do {
					int var33 = (var10 & ~(var10 >> 31)) >> 8;
					arg0[var9++] = this.field2668[var33];
					var10 += arg7;
					var32--;
				} while (var32 > 0);
			} else {
				int var34 = this.field2669.field3005;
				int var35 = 256 - this.field2669.field3005;
				do {
					int var36 = (var10 & ~(var10 >> 31)) >> 8;
					int var37 = this.field2668[var36];
					var10 += arg7;
					int var38 = ((var37 & 0xFF00FF) * var35 >> 8 & 0xFF00FF) + ((var37 & 0xFF00) * var35 >> 8 & 0xFF00);
					int var39 = arg0[var9];
					arg0[var9++] = ((var39 & 0xFF00) * var34 >> 8 & 0xFF00) + ((var39 & 0xFF00FF) * var34 >> 8 & 0xFF00FF) + var38;
					var32--;
				} while (var32 > 0);
			}
			return;
		}
		int var11 = arg5 - arg4 >> 2;
		int var12 = arg7 << 2;
		if (this.field2669.field3005 == 0) {
			if (var11 > 0) {
				do {
					int var13 = (var10 & ~(var10 >> 31)) >> 8;
					int var14 = this.field2668[var13];
					var10 += var12;
					arg0[var9++] = var14;
					arg0[var9++] = var14;
					arg0[var9++] = var14;
					arg0[var9++] = var14;
					var11--;
				} while (var11 > 0);
			}
			int var15 = arg5 - arg4 & 0x3;
			if (var15 > 0) {
				int var16 = (var10 & ~(var10 >> 31)) >> 8;
				int var17 = this.field2668[var16];
				do {
					arg0[var9++] = var17;
					var15--;
				} while (var15 > 0);
			}
			return;
		}
		int var18 = this.field2669.field3005;
		int var19 = 256 - this.field2669.field3005;
		if (var11 > 0) {
			do {
				int var20 = (var10 & ~(var10 >> 31)) >> 8;
				int var21 = this.field2668[var20];
				var10 += var12;
				int var22 = ((var21 & 0xFF00FF) * var19 >> 8 & 0xFF00FF) + ((var21 & 0xFF00) * var19 >> 8 & 0xFF00);
				int var23 = arg0[var9];
				arg0[var9++] = ((var23 & 0xFF00) * var18 >> 8 & 0xFF00) + ((var23 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + var22;
				int var24 = arg0[var9];
				arg0[var9++] = ((var24 & 0xFF00) * var18 >> 8 & 0xFF00) + ((var24 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + var22;
				int var25 = arg0[var9];
				arg0[var9++] = ((var25 & 0xFF00) * var18 >> 8 & 0xFF00) + ((var25 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + var22;
				int var26 = arg0[var9];
				arg0[var9++] = ((var26 & 0xFF00) * var18 >> 8 & 0xFF00) + ((var26 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + var22;
				var11--;
			} while (var11 > 0);
		}
		int var27 = arg5 - arg4 & 0x3;
		if (var27 <= 0) {
			return;
		}
		int var28 = (var10 & ~(var10 >> 31)) >> 8;
		int var29 = this.field2668[var28];
		int var30 = ((var29 & 0xFF00FF) * var19 >> 8 & 0xFF00FF) + ((var29 & 0xFF00) * var19 >> 8 & 0xFF00);
		do {
			int var31 = arg0[var9];
			arg0[var9++] = ((var31 & 0xFF00) * var18 >> 8 & 0xFF00) + ((var31 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + var30;
			var27--;
		} while (var27 > 0);
	}

	@ObfuscatedName("ja.ai(FFFFFFFFFI)V")
	public void method4756(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9) {
		int var11 = (int) arg3;
		int var12 = (int) arg4;
		int var13 = (int) arg5;
		int var14 = (int) arg0;
		int var15 = (int) arg1;
		int var16 = (int) arg2;
		int var17 = 0;
		if (var14 != var15) {
			var17 = (var12 - var11 << 14) / (var15 - var14);
		}
		int var18 = 0;
		if (var15 != var16) {
			var18 = (var13 - var12 << 14) / (var16 - var15);
		}
		int var19 = 0;
		if (var14 != var16) {
			var19 = (var11 - var13 << 14) / (var14 - var16);
		}
		int[] var20 = this.field2669.field3016;
		int var21 = this.field2669.field3010;
		if (var14 <= var15 && var14 <= var16) {
			if (var14 < var21) {
				if (var15 > var21) {
					var15 = var21;
				}
				if (var16 > var21) {
					var16 = var21;
				}
				if (var15 < var16) {
					int var22;
					int var23 = var22 = var11 << 14;
					if (var14 < 0) {
						var23 -= var14 * var19;
						var22 -= var14 * var17;
						var14 = 0;
					}
					int var24 = var12 << 14;
					if (var15 < 0) {
						var24 -= var15 * var18;
						var15 = 0;
					}
					if (var14 != var15 && var19 < var17 || var14 == var15 && var19 > var18) {
						int var25 = var16 - var15;
						int var26 = var15 - var14;
						int var27 = var20[var14];
						while (true) {
							var26--;
							if (var26 < 0) {
								while (true) {
									var25--;
									if (var25 < 0) {
										return;
									}
									this.method5336(Statics.field5989, var27, arg9, 0, var23 >> 14, var24 >> 14);
									var23 += var19;
									var24 += var18;
									var27 += Statics.field5990;
								}
							}
							this.method5336(Statics.field5989, var27, arg9, 0, var23 >> 14, var22 >> 14);
							var23 += var19;
							var22 += var17;
							var27 += Statics.field5990;
						}
					} else {
						int var28 = var16 - var15;
						int var29 = var15 - var14;
						int var30 = var20[var14];
						while (true) {
							var29--;
							if (var29 < 0) {
								while (true) {
									var28--;
									if (var28 < 0) {
										return;
									}
									this.method5336(Statics.field5989, var30, arg9, 0, var24 >> 14, var23 >> 14);
									var23 += var19;
									var24 += var18;
									var30 += Statics.field5990;
								}
							}
							this.method5336(Statics.field5989, var30, arg9, 0, var22 >> 14, var23 >> 14);
							var23 += var19;
							var22 += var17;
							var30 += Statics.field5990;
						}
					}
				} else {
					int var31;
					int var32 = var31 = var11 << 14;
					if (var14 < 0) {
						var32 -= var14 * var19;
						var31 -= var14 * var17;
						var14 = 0;
					}
					int var33 = var13 << 14;
					if (var16 < 0) {
						var33 -= var16 * var18;
						var16 = 0;
					}
					if (var14 != var16 && var19 < var17 || var14 == var16 && var18 > var17) {
						int var34 = var15 - var16;
						int var35 = var16 - var14;
						int var36 = var20[var14];
						while (true) {
							var35--;
							if (var35 < 0) {
								while (true) {
									var34--;
									if (var34 < 0) {
										return;
									}
									this.method5336(Statics.field5989, var36, arg9, 0, var33 >> 14, var31 >> 14);
									var33 += var18;
									var31 += var17;
									var36 += Statics.field5990;
								}
							}
							this.method5336(Statics.field5989, var36, arg9, 0, var32 >> 14, var31 >> 14);
							var32 += var19;
							var31 += var17;
							var36 += Statics.field5990;
						}
					} else {
						int var37 = var15 - var16;
						int var38 = var16 - var14;
						int var39 = var20[var14];
						while (true) {
							var38--;
							if (var38 < 0) {
								while (true) {
									var37--;
									if (var37 < 0) {
										return;
									}
									this.method5336(Statics.field5989, var39, arg9, 0, var31 >> 14, var33 >> 14);
									var33 += var18;
									var31 += var17;
									var39 += Statics.field5990;
								}
							}
							this.method5336(Statics.field5989, var39, arg9, 0, var31 >> 14, var32 >> 14);
							var32 += var19;
							var31 += var17;
							var39 += Statics.field5990;
						}
					}
				}
			}
		} else if (var15 <= var16) {
			if (var15 < var21) {
				if (var16 > var21) {
					var16 = var21;
				}
				if (var14 > var21) {
					var14 = var21;
				}
				if (var16 < var14) {
					int var40;
					int var41 = var40 = var12 << 14;
					if (var15 < 0) {
						var41 -= var15 * var17;
						var40 -= var15 * var18;
						var15 = 0;
					}
					int var42 = var13 << 14;
					if (var16 < 0) {
						var42 -= var16 * var19;
						var16 = 0;
					}
					if (var15 != var16 && var17 < var18 || var15 == var16 && var17 > var19) {
						int var43 = var14 - var16;
						int var44 = var16 - var15;
						int var45 = var20[var15];
						while (true) {
							var44--;
							if (var44 < 0) {
								while (true) {
									var43--;
									if (var43 < 0) {
										return;
									}
									this.method5336(Statics.field5989, var45, arg9, 0, var41 >> 14, var42 >> 14);
									var41 += var17;
									var42 += var19;
									var45 += Statics.field5990;
								}
							}
							this.method5336(Statics.field5989, var45, arg9, 0, var41 >> 14, var40 >> 14);
							var41 += var17;
							var40 += var18;
							var45 += Statics.field5990;
						}
					} else {
						int var46 = var14 - var16;
						int var47 = var16 - var15;
						int var48 = var20[var15];
						while (true) {
							var47--;
							if (var47 < 0) {
								while (true) {
									var46--;
									if (var46 < 0) {
										return;
									}
									this.method5336(Statics.field5989, var48, arg9, 0, var42 >> 14, var41 >> 14);
									var41 += var17;
									var42 += var19;
									var48 += Statics.field5990;
								}
							}
							this.method5336(Statics.field5989, var48, arg9, 0, var40 >> 14, var41 >> 14);
							var41 += var17;
							var40 += var18;
							var48 += Statics.field5990;
						}
					}
				} else {
					int var49;
					int var50 = var49 = var12 << 14;
					if (var15 < 0) {
						var50 -= var15 * var17;
						var49 -= var15 * var18;
						var15 = 0;
					}
					int var51 = var11 << 14;
					if (var14 < 0) {
						var51 -= var14 * var19;
						var14 = 0;
					}
					if (var17 < var18) {
						int var52 = var16 - var14;
						int var53 = var14 - var15;
						int var54 = var20[var15];
						while (true) {
							var53--;
							if (var53 < 0) {
								while (true) {
									var52--;
									if (var52 < 0) {
										return;
									}
									this.method5336(Statics.field5989, var54, arg9, 0, var51 >> 14, var49 >> 14);
									var51 += var19;
									var49 += var18;
									var54 += Statics.field5990;
								}
							}
							this.method5336(Statics.field5989, var54, arg9, 0, var50 >> 14, var49 >> 14);
							var50 += var17;
							var49 += var18;
							var54 += Statics.field5990;
						}
					} else {
						int var55 = var16 - var14;
						int var56 = var14 - var15;
						int var57 = var20[var15];
						while (true) {
							var56--;
							if (var56 < 0) {
								while (true) {
									var55--;
									if (var55 < 0) {
										return;
									}
									this.method5336(Statics.field5989, var57, arg9, 0, var49 >> 14, var51 >> 14);
									var51 += var19;
									var49 += var18;
									var57 += Statics.field5990;
								}
							}
							this.method5336(Statics.field5989, var57, arg9, 0, var49 >> 14, var50 >> 14);
							var50 += var17;
							var49 += var18;
							var57 += Statics.field5990;
						}
					}
				}
			}
		} else if (var16 < var21) {
			if (var14 > var21) {
				var14 = var21;
			}
			if (var15 > var21) {
				var15 = var21;
			}
			if (var14 < var15) {
				int var58;
				int var59 = var58 = var13 << 14;
				if (var16 < 0) {
					var59 -= var16 * var18;
					var58 -= var16 * var19;
					var16 = 0;
				}
				int var60 = var11 << 14;
				if (var14 < 0) {
					var60 -= var14 * var17;
					var14 = 0;
				}
				if (var18 < var19) {
					int var61 = var15 - var14;
					int var62 = var14 - var16;
					int var63 = var20[var16];
					while (true) {
						var62--;
						if (var62 < 0) {
							while (true) {
								var61--;
								if (var61 < 0) {
									return;
								}
								this.method5336(Statics.field5989, var63, arg9, 0, var59 >> 14, var60 >> 14);
								var59 += var18;
								var60 += var17;
								var63 += Statics.field5990;
							}
						}
						this.method5336(Statics.field5989, var63, arg9, 0, var59 >> 14, var58 >> 14);
						var59 += var18;
						var58 += var19;
						var63 += Statics.field5990;
					}
				} else {
					int var64 = var15 - var14;
					int var65 = var14 - var16;
					int var66 = var20[var16];
					while (true) {
						var65--;
						if (var65 < 0) {
							while (true) {
								var64--;
								if (var64 < 0) {
									return;
								}
								this.method5336(Statics.field5989, var66, arg9, 0, var60 >> 14, var59 >> 14);
								var59 += var18;
								var60 += var17;
								var66 += Statics.field5990;
							}
						}
						this.method5336(Statics.field5989, var66, arg9, 0, var58 >> 14, var59 >> 14);
						var59 += var18;
						var58 += var19;
						var66 += Statics.field5990;
					}
				}
			} else {
				int var67;
				int var68 = var67 = var13 << 14;
				if (var16 < 0) {
					var68 -= var16 * var18;
					var67 -= var16 * var19;
					var16 = 0;
				}
				int var69 = var12 << 14;
				if (var15 < 0) {
					var69 -= var15 * var17;
					var15 = 0;
				}
				if (var18 < var19) {
					int var70 = var14 - var15;
					int var71 = var15 - var16;
					int var72 = var20[var16];
					while (true) {
						var71--;
						if (var71 < 0) {
							while (true) {
								var70--;
								if (var70 < 0) {
									return;
								}
								this.method5336(Statics.field5989, var72, arg9, 0, var69 >> 14, var67 >> 14);
								var69 += var17;
								var67 += var19;
								var72 += Statics.field5990;
							}
						}
						this.method5336(Statics.field5989, var72, arg9, 0, var68 >> 14, var67 >> 14);
						var68 += var18;
						var67 += var19;
						var72 += Statics.field5990;
					}
				} else {
					int var73 = var14 - var15;
					int var74 = var15 - var16;
					int var75 = var20[var16];
					while (true) {
						var74--;
						if (var74 < 0) {
							while (true) {
								var73--;
								if (var73 < 0) {
									return;
								}
								this.method5336(Statics.field5989, var75, arg9, 0, var67 >> 14, var69 >> 14);
								var69 += var17;
								var67 += var19;
								var75 += Statics.field5990;
							}
						}
						this.method5336(Statics.field5989, var75, arg9, 0, var67 >> 14, var68 >> 14);
						var68 += var18;
						var67 += var19;
						var75 += Statics.field5990;
					}
				}
			}
		}
	}

	@ObfuscatedName("ja.bj([IIIIII)V")
	public void method5336(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
		int var7 = arg1 + arg4;
		int var8 = arg5 - arg4 >> 2;
		if (this.field2669.field3005 == 0) {
			while (true) {
				var8--;
				if (var8 < 0) {
					int var9 = arg5 - arg4 & 0x3;
					while (true) {
						var9--;
						if (var9 < 0) {
							return;
						}
						arg0[var7++] = arg2;
					}
				}
				arg0[var7++] = arg2;
				arg0[var7++] = arg2;
				arg0[var7++] = arg2;
				arg0[var7++] = arg2;
			}
		} else if (this.field2669.field3005 == 254) {
			while (true) {
				var8--;
				if (var8 < 0) {
					int var10 = arg5 - arg4 & 0x3;
					while (true) {
						var10--;
						if (var10 < 0) {
							return;
						}
						arg0[var7++] = arg0[var7];
					}
				}
				arg0[var7++] = arg0[var7];
				arg0[var7++] = arg0[var7];
				arg0[var7++] = arg0[var7];
				arg0[var7++] = arg0[var7];
			}
		} else {
			int var11 = this.field2669.field3005;
			int var12 = 256 - this.field2669.field3005;
			int var13 = ((arg2 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * var12 >> 8 & 0xFF00);
			while (true) {
				var8--;
				if (var8 < 0) {
					int var18 = arg5 - arg4 & 0x3;
					while (true) {
						var18--;
						if (var18 < 0) {
							return;
						}
						int var19 = arg0[var7];
						arg0[var7++] = ((var19 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var19 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
					}
				}
				int var14 = arg0[var7];
				arg0[var7++] = ((var14 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var14 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
				int var15 = arg0[var7];
				arg0[var7++] = ((var15 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var15 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
				int var16 = arg0[var7];
				arg0[var7++] = ((var16 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var16 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
				int var17 = arg0[var7];
				arg0[var7++] = ((var17 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var17 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
			}
		}
	}

	@ObfuscatedName("ja.aa(FFFFFFFFFIIIIIIIIIIIII)V")
	public void method4787(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
		int[] var23 = this.field2669.field3011.method5082(arg21);
		if (var23 == null) {
			int var24 = this.field2669.field3011.method5069(arg21);
			this.method4755(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, method4786(var24, arg9), method4786(var24, arg10), method4786(var24, arg11));
			return;
		}
		this.field2660 = this.field2669.field3011.method5070(arg21);
		int var25 = (int) arg3;
		int var26 = (int) arg4;
		int var27 = (int) arg5;
		int var28 = (int) arg0;
		int var29 = (int) arg1;
		int var30 = (int) arg2;
		int var31 = var26 - var25;
		int var32 = var29 - var28;
		int var33 = var27 - var25;
		int var34 = var30 - var28;
		int var35 = arg10 - arg9;
		int var36 = arg11 - arg9;
		int var37 = 0;
		if (var28 != var29) {
			var37 = (var26 - var25 << 14) / (var29 - var28);
		}
		int var38 = 0;
		if (var29 != var30) {
			var38 = (var27 - var26 << 14) / (var30 - var29);
		}
		int var39 = 0;
		if (var28 != var30) {
			var39 = (var25 - var27 << 14) / (var28 - var30);
		}
		int var40 = var31 * var34 - var32 * var33;
		if (var40 == 0) {
			return;
		}
		int var41 = (var34 * var35 - var32 * var36 << 9) / var40;
		int var42 = (var31 * var36 - var33 * var35 << 9) / var40;
		int var43 = this.field2669.field3006;
		int var44 = arg12 - arg13;
		int var45 = arg15 - arg16;
		int var46 = arg18 - arg19;
		int var47 = arg14 - arg12;
		int var48 = arg17 - arg15;
		int var49 = arg20 - arg18;
		int var50 = arg15 * var47 - arg12 * var48 << 14;
		int var51 = (int) (((long) (arg18 * var48 - arg15 * var49) << 3 << 14) / (long) var43);
		int var52 = (int) (((long) (arg12 * var49 - arg18 * var47) << 14) / (long) var43);
		int var53 = arg15 * var44 - arg12 * var45 << 14;
		int var54 = (int) (((long) (arg18 * var45 - arg15 * var46) << 3 << 14) / (long) var43);
		int var55 = (int) (((long) (arg12 * var46 - arg18 * var44) << 14) / (long) var43);
		int var56 = var45 * var47 - var44 * var48 << 14;
		int var57 = (int) (((long) (var46 * var48 - var45 * var49) << 3 << 14) / (long) var43);
		int var58 = (int) (((long) (var44 * var49 - var46 * var47) << 14) / (long) var43);
		int[] var59 = this.field2669.field3016;
		int var60 = this.field2669.field3010;
		if (var28 <= var29 && var28 <= var30) {
			if (var28 < var60) {
				if (var29 > var60) {
					var29 = var60;
				}
				if (var30 > var60) {
					var30 = var60;
				}
				int var61 = (arg9 << 9) - var25 * var41 + var41;
				if (var29 < var30) {
					int var62;
					int var63 = var62 = var25 << 14;
					if (var28 < 0) {
						var63 -= var28 * var39;
						var62 -= var28 * var37;
						var61 -= var28 * var42;
						var28 = 0;
					}
					int var64 = var26 << 14;
					if (var29 < 0) {
						var64 -= var29 * var38;
						var29 = 0;
					}
					int var65 = var28 - this.field2669.field3009;
					int var66 = var52 * var65 + var50;
					int var67 = var55 * var65 + var53;
					int var68 = var58 * var65 + var56;
					if (var28 != var29 && var39 < var37 || var28 == var29 && var39 > var38) {
						int var69 = var30 - var29;
						int var70 = var29 - var28;
						int var71 = var59[var28];
						while (true) {
							var70--;
							if (var70 < 0) {
								while (true) {
									var69--;
									if (var69 < 0) {
										return;
									}
									this.method5324(Statics.field5989, var23, 0, 0, var71, var63 >> 14, var64 >> 14, var61, var41, var66, var67, var68, var51, var54, var57);
									var63 += var39;
									var64 += var38;
									var61 += var42;
									var71 += Statics.field5990;
									var66 += var52;
									var67 += var55;
									var68 += var58;
								}
							}
							this.method5324(Statics.field5989, var23, 0, 0, var71, var63 >> 14, var62 >> 14, var61, var41, var66, var67, var68, var51, var54, var57);
							var63 += var39;
							var62 += var37;
							var61 += var42;
							var71 += Statics.field5990;
							var66 += var52;
							var67 += var55;
							var68 += var58;
						}
					} else {
						int var72 = var30 - var29;
						int var73 = var29 - var28;
						int var74 = var59[var28];
						while (true) {
							var73--;
							if (var73 < 0) {
								while (true) {
									var72--;
									if (var72 < 0) {
										return;
									}
									this.method5324(Statics.field5989, var23, 0, 0, var74, var64 >> 14, var63 >> 14, var61, var41, var66, var67, var68, var51, var54, var57);
									var63 += var39;
									var64 += var38;
									var61 += var42;
									var74 += Statics.field5990;
									var66 += var52;
									var67 += var55;
									var68 += var58;
								}
							}
							this.method5324(Statics.field5989, var23, 0, 0, var74, var62 >> 14, var63 >> 14, var61, var41, var66, var67, var68, var51, var54, var57);
							var63 += var39;
							var62 += var37;
							var61 += var42;
							var74 += Statics.field5990;
							var66 += var52;
							var67 += var55;
							var68 += var58;
						}
					}
				} else {
					int var75;
					int var76 = var75 = var25 << 14;
					if (var28 < 0) {
						var76 -= var28 * var39;
						var75 -= var28 * var37;
						var61 -= var28 * var42;
						var28 = 0;
					}
					int var77 = var27 << 14;
					if (var30 < 0) {
						var77 -= var30 * var38;
						var30 = 0;
					}
					int var78 = var28 - this.field2669.field3009;
					int var79 = var52 * var78 + var50;
					int var80 = var55 * var78 + var53;
					int var81 = var58 * var78 + var56;
					if ((var28 == var30 || var39 >= var37) && (var28 != var30 || var38 <= var37)) {
						int var85 = var29 - var30;
						int var86 = var30 - var28;
						int var87 = var59[var28];
						while (true) {
							var86--;
							if (var86 < 0) {
								while (true) {
									var85--;
									if (var85 < 0) {
										return;
									}
									this.method5324(Statics.field5989, var23, 0, 0, var87, var75 >> 14, var77 >> 14, var61, var41, var79, var80, var81, var51, var54, var57);
									var77 += var38;
									var75 += var37;
									var61 += var42;
									var87 += Statics.field5990;
									var79 += var52;
									var80 += var55;
									var81 += var58;
								}
							}
							this.method5324(Statics.field5989, var23, 0, 0, var87, var75 >> 14, var76 >> 14, var61, var41, var79, var80, var81, var51, var54, var57);
							var76 += var39;
							var75 += var37;
							var61 += var42;
							var87 += Statics.field5990;
							var79 += var52;
							var80 += var55;
							var81 += var58;
						}
					} else {
						int var82 = var29 - var30;
						int var83 = var30 - var28;
						int var84 = var59[var28];
						while (true) {
							var83--;
							if (var83 < 0) {
								while (true) {
									var82--;
									if (var82 < 0) {
										return;
									}
									this.method5324(Statics.field5989, var23, 0, 0, var84, var77 >> 14, var75 >> 14, var61, var41, var79, var80, var81, var51, var54, var57);
									var77 += var38;
									var75 += var37;
									var61 += var42;
									var84 += Statics.field5990;
									var79 += var52;
									var80 += var55;
									var81 += var58;
								}
							}
							this.method5324(Statics.field5989, var23, 0, 0, var84, var76 >> 14, var75 >> 14, var61, var41, var79, var80, var81, var51, var54, var57);
							var76 += var39;
							var75 += var37;
							var61 += var42;
							var84 += Statics.field5990;
							var79 += var52;
							var80 += var55;
							var81 += var58;
						}
					}
				}
			}
		} else if (var29 <= var30) {
			if (var29 < var60) {
				if (var30 > var60) {
					var30 = var60;
				}
				if (var28 > var60) {
					var28 = var60;
				}
				int var88 = (arg10 << 9) - var26 * var41 + var41;
				if (var30 < var28) {
					int var89;
					int var90 = var89 = var26 << 14;
					if (var29 < 0) {
						var90 -= var29 * var37;
						var89 -= var29 * var38;
						var88 -= var29 * var42;
						var29 = 0;
					}
					int var91 = var27 << 14;
					if (var30 < 0) {
						var91 -= var30 * var39;
						var30 = 0;
					}
					int var92 = var29 - this.field2669.field3009;
					int var93 = var52 * var92 + var50;
					int var94 = var55 * var92 + var53;
					int var95 = var58 * var92 + var56;
					if (var29 != var30 && var37 < var38 || var29 == var30 && var37 > var39) {
						int var96 = var28 - var30;
						int var97 = var30 - var29;
						int var98 = var59[var29];
						while (true) {
							var97--;
							if (var97 < 0) {
								while (true) {
									var96--;
									if (var96 < 0) {
										return;
									}
									this.method5324(Statics.field5989, var23, 0, 0, var98, var90 >> 14, var91 >> 14, var88, var41, var93, var94, var95, var51, var54, var57);
									var90 += var37;
									var91 += var39;
									var88 += var42;
									var98 += Statics.field5990;
									var93 += var52;
									var94 += var55;
									var95 += var58;
								}
							}
							this.method5324(Statics.field5989, var23, 0, 0, var98, var90 >> 14, var89 >> 14, var88, var41, var93, var94, var95, var51, var54, var57);
							var90 += var37;
							var89 += var38;
							var88 += var42;
							var98 += Statics.field5990;
							var93 += var52;
							var94 += var55;
							var95 += var58;
						}
					} else {
						int var99 = var28 - var30;
						int var100 = var30 - var29;
						int var101 = var59[var29];
						while (true) {
							var100--;
							if (var100 < 0) {
								while (true) {
									var99--;
									if (var99 < 0) {
										return;
									}
									this.method5324(Statics.field5989, var23, 0, 0, var101, var91 >> 14, var90 >> 14, var88, var41, var93, var94, var95, var51, var54, var57);
									var90 += var37;
									var91 += var39;
									var88 += var42;
									var101 += Statics.field5990;
									var93 += var52;
									var94 += var55;
									var95 += var58;
								}
							}
							this.method5324(Statics.field5989, var23, 0, 0, var101, var89 >> 14, var90 >> 14, var88, var41, var93, var94, var95, var51, var54, var57);
							var90 += var37;
							var89 += var38;
							var88 += var42;
							var101 += Statics.field5990;
							var93 += var52;
							var94 += var55;
							var95 += var58;
						}
					}
				} else {
					int var102;
					int var103 = var102 = var26 << 14;
					if (var29 < 0) {
						var103 -= var29 * var37;
						var102 -= var29 * var38;
						var88 -= var29 * var42;
						var29 = 0;
					}
					int var104 = var25 << 14;
					if (var28 < 0) {
						var104 -= var28 * var39;
						var28 = 0;
					}
					int var105 = var29 - this.field2669.field3009;
					int var106 = var52 * var105 + var50;
					int var107 = var55 * var105 + var53;
					int var108 = var58 * var105 + var56;
					if (var37 < var38) {
						int var109 = var30 - var28;
						int var110 = var28 - var29;
						int var111 = var59[var29];
						while (true) {
							var110--;
							if (var110 < 0) {
								while (true) {
									var109--;
									if (var109 < 0) {
										return;
									}
									this.method5324(Statics.field5989, var23, 0, 0, var111, var104 >> 14, var102 >> 14, var88, var41, var106, var107, var108, var51, var54, var57);
									var104 += var39;
									var102 += var38;
									var88 += var42;
									var111 += Statics.field5990;
									var106 += var52;
									var107 += var55;
									var108 += var58;
								}
							}
							this.method5324(Statics.field5989, var23, 0, 0, var111, var103 >> 14, var102 >> 14, var88, var41, var106, var107, var108, var51, var54, var57);
							var103 += var37;
							var102 += var38;
							var88 += var42;
							var111 += Statics.field5990;
							var106 += var52;
							var107 += var55;
							var108 += var58;
						}
					} else {
						int var112 = var30 - var28;
						int var113 = var28 - var29;
						int var114 = var59[var29];
						while (true) {
							var113--;
							if (var113 < 0) {
								while (true) {
									var112--;
									if (var112 < 0) {
										return;
									}
									this.method5324(Statics.field5989, var23, 0, 0, var114, var102 >> 14, var104 >> 14, var88, var41, var106, var107, var108, var51, var54, var57);
									var104 += var39;
									var102 += var38;
									var88 += var42;
									var114 += Statics.field5990;
									var106 += var52;
									var107 += var55;
									var108 += var58;
								}
							}
							this.method5324(Statics.field5989, var23, 0, 0, var114, var102 >> 14, var103 >> 14, var88, var41, var106, var107, var108, var51, var54, var57);
							var103 += var37;
							var102 += var38;
							var88 += var42;
							var114 += Statics.field5990;
							var106 += var52;
							var107 += var55;
							var108 += var58;
						}
					}
				}
			}
		} else if (var30 < var60) {
			if (var28 > var60) {
				var28 = var60;
			}
			if (var29 > var60) {
				var29 = var60;
			}
			int var115 = (arg11 << 9) - var27 * var41 + var41;
			if (var28 < var29) {
				int var116;
				int var117 = var116 = var27 << 14;
				if (var30 < 0) {
					var117 -= var30 * var38;
					var116 -= var30 * var39;
					var115 -= var30 * var42;
					var30 = 0;
				}
				int var118 = var25 << 14;
				if (var28 < 0) {
					var118 -= var28 * var37;
					var28 = 0;
				}
				int var119 = var30 - this.field2669.field3009;
				int var120 = var52 * var119 + var50;
				int var121 = var55 * var119 + var53;
				int var122 = var58 * var119 + var56;
				if (var38 < var39) {
					int var123 = var29 - var28;
					int var124 = var28 - var30;
					int var125 = var59[var30];
					while (true) {
						var124--;
						if (var124 < 0) {
							while (true) {
								var123--;
								if (var123 < 0) {
									return;
								}
								this.method5324(Statics.field5989, var23, 0, 0, var125, var117 >> 14, var118 >> 14, var115, var41, var120, var121, var122, var51, var54, var57);
								var117 += var38;
								var118 += var37;
								var115 += var42;
								var125 += Statics.field5990;
								var120 += var52;
								var121 += var55;
								var122 += var58;
							}
						}
						this.method5324(Statics.field5989, var23, 0, 0, var125, var117 >> 14, var116 >> 14, var115, var41, var120, var121, var122, var51, var54, var57);
						var117 += var38;
						var116 += var39;
						var115 += var42;
						var125 += Statics.field5990;
						var120 += var52;
						var121 += var55;
						var122 += var58;
					}
				} else {
					int var126 = var29 - var28;
					int var127 = var28 - var30;
					int var128 = var59[var30];
					while (true) {
						var127--;
						if (var127 < 0) {
							while (true) {
								var126--;
								if (var126 < 0) {
									return;
								}
								this.method5324(Statics.field5989, var23, 0, 0, var128, var118 >> 14, var117 >> 14, var115, var41, var120, var121, var122, var51, var54, var57);
								var117 += var38;
								var118 += var37;
								var115 += var42;
								var128 += Statics.field5990;
								var120 += var52;
								var121 += var55;
								var122 += var58;
							}
						}
						this.method5324(Statics.field5989, var23, 0, 0, var128, var116 >> 14, var117 >> 14, var115, var41, var120, var121, var122, var51, var54, var57);
						var117 += var38;
						var116 += var39;
						var115 += var42;
						var128 += Statics.field5990;
						var120 += var52;
						var121 += var55;
						var122 += var58;
					}
				}
			} else {
				int var129;
				int var130 = var129 = var27 << 14;
				if (var30 < 0) {
					var130 -= var30 * var38;
					var129 -= var30 * var39;
					var115 -= var30 * var42;
					var30 = 0;
				}
				int var131 = var26 << 14;
				if (var29 < 0) {
					var131 -= var29 * var37;
					var29 = 0;
				}
				int var132 = var30 - this.field2669.field3009;
				int var133 = var52 * var132 + var50;
				int var134 = var55 * var132 + var53;
				int var135 = var58 * var132 + var56;
				if (var38 < var39) {
					int var136 = var28 - var29;
					int var137 = var29 - var30;
					int var138 = var59[var30];
					while (true) {
						var137--;
						if (var137 < 0) {
							while (true) {
								var136--;
								if (var136 < 0) {
									return;
								}
								this.method5324(Statics.field5989, var23, 0, 0, var138, var131 >> 14, var129 >> 14, var115, var41, var133, var134, var135, var51, var54, var57);
								var131 += var37;
								var129 += var39;
								var115 += var42;
								var138 += Statics.field5990;
								var133 += var52;
								var134 += var55;
								var135 += var58;
							}
						}
						this.method5324(Statics.field5989, var23, 0, 0, var138, var130 >> 14, var129 >> 14, var115, var41, var133, var134, var135, var51, var54, var57);
						var130 += var38;
						var129 += var39;
						var115 += var42;
						var138 += Statics.field5990;
						var133 += var52;
						var134 += var55;
						var135 += var58;
					}
				} else {
					int var139 = var28 - var29;
					int var140 = var29 - var30;
					int var141 = var59[var30];
					while (true) {
						var140--;
						if (var140 < 0) {
							while (true) {
								var139--;
								if (var139 < 0) {
									return;
								}
								this.method5324(Statics.field5989, var23, 0, 0, var141, var129 >> 14, var131 >> 14, var115, var41, var133, var134, var135, var51, var54, var57);
								var131 += var37;
								var129 += var39;
								var115 += var42;
								var141 += Statics.field5990;
								var133 += var52;
								var134 += var55;
								var135 += var58;
							}
						}
						this.method5324(Statics.field5989, var23, 0, 0, var141, var129 >> 14, var130 >> 14, var115, var41, var133, var134, var135, var51, var54, var57);
						var130 += var38;
						var129 += var39;
						var115 += var42;
						var141 += Statics.field5990;
						var133 += var52;
						var134 += var55;
						var135 += var58;
					}
				}
			}
		}
	}

	@ObfuscatedName("ja.bm([I[IIIIIIIIIIIIII)V")
	public void method5324(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
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
		int var16 = arg4 + arg5;
		int var17 = arg5 * arg8 + arg7;
		int var18 = arg6 - arg5;
		int var19 = arg5 - this.field2669.field3004;
		int var20 = (arg12 >> 3) * var19 + arg9;
		int var21 = (arg13 >> 3) * var19 + arg10;
		int var22 = (arg14 >> 3) * var19 + arg11;
		int var23 = var22 >> 14;
		int var24;
		int var25;
		if (var23 == 0) {
			var24 = 0;
			var25 = 0;
		} else {
			var24 = var20 / var23;
			var25 = var21 / var23;
			if (var24 < 0) {
				var24 = 0;
			} else if (var24 > 16256) {
				var24 = 16256;
			}
		}
		int var26 = arg12 + var20;
		int var27 = arg13 + var21;
		int var28 = arg14 + var22;
		int var29 = var28 >> 14;
		int var30;
		int var31;
		if (var29 == 0) {
			var30 = 0;
			var31 = 0;
		} else {
			var30 = var26 / var29;
			var31 = var27 / var29;
			if (var30 < 0) {
				var30 = 0;
			} else if (var30 > 16256) {
				var30 = 16256;
			}
		}
		int var32 = (var24 << 18) + var25;
		int var33 = (var30 - var24 >> 3 << 18) + (var31 - var25 >> 3);
		int var34 = var18 >> 3;
		int var35 = arg8 << 3;
		int var36 = var17 >> 8;
		int var10000;
		if (this.field2660) {
			if (this.field2669.field3005 == 0) {
				if (var34 > 0) {
					do {
						int var37 = arg1[(var32 >>> 25) + (var32 & 0x3F80)];
						arg0[var16++] = ((var37 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var37 & 0xFF00) * var36 & 0xFF0000) >> 8;
						int var38 = var32 + var33;
						int var39 = arg1[(var38 >>> 25) + (var38 & 0x3F80)];
						arg0[var16++] = ((var39 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var39 & 0xFF00) * var36 & 0xFF0000) >> 8;
						int var40 = var33 + var38;
						int var41 = arg1[(var40 >>> 25) + (var40 & 0x3F80)];
						arg0[var16++] = ((var41 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var41 & 0xFF00) * var36 & 0xFF0000) >> 8;
						int var42 = var33 + var40;
						int var43 = arg1[(var42 >>> 25) + (var42 & 0x3F80)];
						arg0[var16++] = ((var43 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var43 & 0xFF00) * var36 & 0xFF0000) >> 8;
						int var44 = var33 + var42;
						int var45 = arg1[(var44 >>> 25) + (var44 & 0x3F80)];
						arg0[var16++] = ((var45 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var45 & 0xFF00) * var36 & 0xFF0000) >> 8;
						int var46 = var33 + var44;
						int var47 = arg1[(var46 >>> 25) + (var46 & 0x3F80)];
						arg0[var16++] = ((var47 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var47 & 0xFF00) * var36 & 0xFF0000) >> 8;
						int var48 = var33 + var46;
						int var49 = arg1[(var48 >>> 25) + (var48 & 0x3F80)];
						arg0[var16++] = ((var49 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var49 & 0xFF00) * var36 & 0xFF0000) >> 8;
						int var50 = var33 + var48;
						int var51 = arg1[(var50 >>> 25) + (var50 & 0x3F80)];
						arg0[var16++] = ((var51 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var51 & 0xFF00) * var36 & 0xFF0000) >> 8;
						var10000 = var33 + var50;
						int var53 = var30;
						int var54 = var31;
						var26 += arg12;
						var27 += arg13;
						var28 += arg14;
						int var55 = var28 >> 14;
						if (var55 == 0) {
							var30 = 0;
							var31 = 0;
						} else {
							var30 = var26 / var55;
							var31 = var27 / var55;
							if (var30 < 0) {
								var30 = 0;
							} else if (var30 > 16256) {
								var30 = 16256;
							}
						}
						var32 = (var53 << 18) + var54;
						var33 = (var30 - var53 >> 3 << 18) + (var31 - var54 >> 3);
						var17 += var35;
						var36 = var17 >> 8;
						var34--;
					} while (var34 > 0);
				}
				int var56 = arg6 - arg5 & 0x7;
				if (var56 > 0) {
					do {
						int var57 = arg1[(var32 >>> 25) + (var32 & 0x3F80)];
						arg0[var16++] = ((var57 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var57 & 0xFF00) * var36 & 0xFF0000) >> 8;
						var32 += var33;
						var56--;
					} while (var56 > 0);
				}
			} else {
				int var58 = this.field2669.field3005;
				int var59 = 256 - this.field2669.field3005;
				int var60 = var36 * var59 >> 8;
				if (var34 > 0) {
					do {
						int var61 = arg1[(var32 >>> 25) + (var32 & 0x3F80)];
						int var62 = ((var61 & 0xFF00FF) * var60 & 0xFF00FF00 | (var61 & 0xFF00) * var60 & 0xFF0000) >> 8;
						int var63 = arg0[var16];
						arg0[var16++] = (((var63 & 0xFF00FF) * var58 & 0xFF00FF00 | (var63 & 0xFF00) * var58 & 0xFF0000) >> 8) + var62;
						int var64 = var32 + var33;
						int var65 = arg1[(var64 >>> 25) + (var64 & 0x3F80)];
						int var66 = ((var65 & 0xFF00FF) * var60 & 0xFF00FF00 | (var65 & 0xFF00) * var60 & 0xFF0000) >> 8;
						int var67 = arg0[var16];
						arg0[var16++] = (((var67 & 0xFF00FF) * var58 & 0xFF00FF00 | (var67 & 0xFF00) * var58 & 0xFF0000) >> 8) + var66;
						int var68 = var33 + var64;
						int var69 = arg1[(var68 >>> 25) + (var68 & 0x3F80)];
						int var70 = ((var69 & 0xFF00FF) * var60 & 0xFF00FF00 | (var69 & 0xFF00) * var60 & 0xFF0000) >> 8;
						int var71 = arg0[var16];
						arg0[var16++] = (((var71 & 0xFF00FF) * var58 & 0xFF00FF00 | (var71 & 0xFF00) * var58 & 0xFF0000) >> 8) + var70;
						int var72 = var33 + var68;
						int var73 = arg1[(var72 >>> 25) + (var72 & 0x3F80)];
						int var74 = ((var73 & 0xFF00FF) * var60 & 0xFF00FF00 | (var73 & 0xFF00) * var60 & 0xFF0000) >> 8;
						int var75 = arg0[var16];
						arg0[var16++] = (((var75 & 0xFF00FF) * var58 & 0xFF00FF00 | (var75 & 0xFF00) * var58 & 0xFF0000) >> 8) + var74;
						int var76 = var33 + var72;
						int var77 = arg1[(var76 >>> 25) + (var76 & 0x3F80)];
						int var78 = ((var77 & 0xFF00FF) * var60 & 0xFF00FF00 | (var77 & 0xFF00) * var60 & 0xFF0000) >> 8;
						int var79 = arg0[var16];
						arg0[var16++] = (((var79 & 0xFF00FF) * var58 & 0xFF00FF00 | (var79 & 0xFF00) * var58 & 0xFF0000) >> 8) + var78;
						int var80 = var33 + var76;
						int var81 = arg1[(var80 >>> 25) + (var80 & 0x3F80)];
						int var82 = ((var81 & 0xFF00FF) * var60 & 0xFF00FF00 | (var81 & 0xFF00) * var60 & 0xFF0000) >> 8;
						int var83 = arg0[var16];
						arg0[var16++] = (((var83 & 0xFF00FF) * var58 & 0xFF00FF00 | (var83 & 0xFF00) * var58 & 0xFF0000) >> 8) + var82;
						int var84 = var33 + var80;
						int var85 = arg1[(var84 >>> 25) + (var84 & 0x3F80)];
						int var86 = ((var85 & 0xFF00FF) * var60 & 0xFF00FF00 | (var85 & 0xFF00) * var60 & 0xFF0000) >> 8;
						int var87 = arg0[var16];
						arg0[var16++] = (((var87 & 0xFF00FF) * var58 & 0xFF00FF00 | (var87 & 0xFF00) * var58 & 0xFF0000) >> 8) + var86;
						int var88 = var33 + var84;
						int var89 = arg1[(var88 >>> 25) + (var88 & 0x3F80)];
						int var90 = ((var89 & 0xFF00FF) * var60 & 0xFF00FF00 | (var89 & 0xFF00) * var60 & 0xFF0000) >> 8;
						int var91 = arg0[var16];
						arg0[var16++] = (((var91 & 0xFF00FF) * var58 & 0xFF00FF00 | (var91 & 0xFF00) * var58 & 0xFF0000) >> 8) + var90;
						var10000 = var33 + var88;
						int var93 = var30;
						int var94 = var31;
						var26 += arg12;
						var27 += arg13;
						var28 += arg14;
						int var95 = var28 >> 14;
						if (var95 == 0) {
							var30 = 0;
							var31 = 0;
						} else {
							var30 = var26 / var95;
							var31 = var27 / var95;
							if (var30 < 0) {
								var30 = 0;
							} else if (var30 > 16256) {
								var30 = 16256;
							}
						}
						var32 = (var93 << 18) + var94;
						var33 = (var30 - var93 >> 3 << 18) + (var31 - var94 >> 3);
						var17 += var35;
						int var96 = var17 >> 8;
						var34--;
					} while (var34 > 0);
				}
				int var97 = arg6 - arg5 & 0x7;
				if (var97 > 0) {
					do {
						int var98 = arg1[(var32 >>> 25) + (var32 & 0x3F80)];
						int var99 = ((var98 & 0xFF00FF) * var60 & 0xFF00FF00 | (var98 & 0xFF00) * var60 & 0xFF0000) >> 8;
						int var100 = arg0[var16];
						arg0[var16++] = (((var100 & 0xFF00FF) * var58 & 0xFF00FF00 | (var100 & 0xFF00) * var58 & 0xFF0000) >> 8) + var99;
						var32 += var33;
						var97--;
					} while (var97 > 0);
				}
			}
		} else if (this.field2669.field3005 == 0) {
			if (var34 > 0) {
				do {
					int var101;
					if ((var101 = arg1[(var32 >>> 25) + (var32 & 0x3F80)]) != 0) {
						arg0[var16] = ((var101 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var101 & 0xFF00) * var36 & 0xFF0000) >> 8;
					}
					var16++;
					int var102 = var32 + var33;
					int var103;
					if ((var103 = arg1[(var102 >>> 25) + (var102 & 0x3F80)]) != 0) {
						arg0[var16] = ((var103 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var103 & 0xFF00) * var36 & 0xFF0000) >> 8;
					}
					var16++;
					int var104 = var33 + var102;
					int var105;
					if ((var105 = arg1[(var104 >>> 25) + (var104 & 0x3F80)]) != 0) {
						arg0[var16] = ((var105 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var105 & 0xFF00) * var36 & 0xFF0000) >> 8;
					}
					var16++;
					int var106 = var33 + var104;
					int var107;
					if ((var107 = arg1[(var106 >>> 25) + (var106 & 0x3F80)]) != 0) {
						arg0[var16] = ((var107 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var107 & 0xFF00) * var36 & 0xFF0000) >> 8;
					}
					var16++;
					int var108 = var33 + var106;
					int var109;
					if ((var109 = arg1[(var108 >>> 25) + (var108 & 0x3F80)]) != 0) {
						arg0[var16] = ((var109 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var109 & 0xFF00) * var36 & 0xFF0000) >> 8;
					}
					var16++;
					int var110 = var33 + var108;
					int var111;
					if ((var111 = arg1[(var110 >>> 25) + (var110 & 0x3F80)]) != 0) {
						arg0[var16] = ((var111 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var111 & 0xFF00) * var36 & 0xFF0000) >> 8;
					}
					var16++;
					int var112 = var33 + var110;
					int var113;
					if ((var113 = arg1[(var112 >>> 25) + (var112 & 0x3F80)]) != 0) {
						arg0[var16] = ((var113 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var113 & 0xFF00) * var36 & 0xFF0000) >> 8;
					}
					var16++;
					int var114 = var33 + var112;
					int var115;
					if ((var115 = arg1[(var114 >>> 25) + (var114 & 0x3F80)]) != 0) {
						arg0[var16] = ((var115 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var115 & 0xFF00) * var36 & 0xFF0000) >> 8;
					}
					var16++;
					var10000 = var33 + var114;
					int var117 = var30;
					int var118 = var31;
					var26 += arg12;
					var27 += arg13;
					var28 += arg14;
					int var119 = var28 >> 14;
					if (var119 == 0) {
						var30 = 0;
						var31 = 0;
					} else {
						var30 = var26 / var119;
						var31 = var27 / var119;
						if (var30 < 0) {
							var30 = 0;
						} else if (var30 > 16256) {
							var30 = 16256;
						}
					}
					var32 = (var117 << 18) + var118;
					var33 = (var30 - var117 >> 3 << 18) + (var31 - var118 >> 3);
					var17 += var35;
					var36 = var17 >> 8;
					var34--;
				} while (var34 > 0);
			}
			int var120 = arg6 - arg5 & 0x7;
			if (var120 > 0) {
				do {
					int var121;
					if ((var121 = arg1[(var32 >>> 25) + (var32 & 0x3F80)]) != 0) {
						arg0[var16] = ((var121 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var121 & 0xFF00) * var36 & 0xFF0000) >> 8;
					}
					var16++;
					var32 += var33;
					var120--;
				} while (var120 > 0);
			}
		} else {
			int var122 = this.field2669.field3005;
			int var123 = 256 - this.field2669.field3005;
			int var124 = var36 * var123 >> 8;
			if (var34 > 0) {
				do {
					int var125;
					if ((var125 = arg1[(var32 >>> 25) + (var32 & 0x3F80)]) != 0) {
						int var126 = ((var125 & 0xFF00FF) * var124 & 0xFF00FF00 | (var125 & 0xFF00) * var124 & 0xFF0000) >> 8;
						int var127 = arg0[var16];
						arg0[var16] = (((var127 & 0xFF00FF) * var122 & 0xFF00FF00 | (var127 & 0xFF00) * var122 & 0xFF0000) >> 8) + var126;
					}
					var16++;
					int var128 = var32 + var33;
					int var129;
					if ((var129 = arg1[(var128 >>> 25) + (var128 & 0x3F80)]) != 0) {
						int var130 = ((var129 & 0xFF00FF) * var124 & 0xFF00FF00 | (var129 & 0xFF00) * var124 & 0xFF0000) >> 8;
						int var131 = arg0[var16];
						arg0[var16] = (((var131 & 0xFF00FF) * var122 & 0xFF00FF00 | (var131 & 0xFF00) * var122 & 0xFF0000) >> 8) + var130;
					}
					var16++;
					int var132 = var33 + var128;
					int var133;
					if ((var133 = arg1[(var132 >>> 25) + (var132 & 0x3F80)]) != 0) {
						int var134 = ((var133 & 0xFF00FF) * var124 & 0xFF00FF00 | (var133 & 0xFF00) * var124 & 0xFF0000) >> 8;
						int var135 = arg0[var16];
						arg0[var16] = (((var135 & 0xFF00FF) * var122 & 0xFF00FF00 | (var135 & 0xFF00) * var122 & 0xFF0000) >> 8) + var134;
					}
					var16++;
					int var136 = var33 + var132;
					int var137;
					if ((var137 = arg1[(var136 >>> 25) + (var136 & 0x3F80)]) != 0) {
						int var138 = ((var137 & 0xFF00FF) * var124 & 0xFF00FF00 | (var137 & 0xFF00) * var124 & 0xFF0000) >> 8;
						int var139 = arg0[var16];
						arg0[var16] = (((var139 & 0xFF00FF) * var122 & 0xFF00FF00 | (var139 & 0xFF00) * var122 & 0xFF0000) >> 8) + var138;
					}
					var16++;
					int var140 = var33 + var136;
					int var141;
					if ((var141 = arg1[(var140 >>> 25) + (var140 & 0x3F80)]) != 0) {
						int var142 = ((var141 & 0xFF00FF) * var124 & 0xFF00FF00 | (var141 & 0xFF00) * var124 & 0xFF0000) >> 8;
						int var143 = arg0[var16];
						arg0[var16] = (((var143 & 0xFF00FF) * var122 & 0xFF00FF00 | (var143 & 0xFF00) * var122 & 0xFF0000) >> 8) + var142;
					}
					var16++;
					int var144 = var33 + var140;
					int var145;
					if ((var145 = arg1[(var144 >>> 25) + (var144 & 0x3F80)]) != 0) {
						int var146 = ((var145 & 0xFF00FF) * var124 & 0xFF00FF00 | (var145 & 0xFF00) * var124 & 0xFF0000) >> 8;
						int var147 = arg0[var16];
						arg0[var16] = (((var147 & 0xFF00FF) * var122 & 0xFF00FF00 | (var147 & 0xFF00) * var122 & 0xFF0000) >> 8) + var146;
					}
					var16++;
					int var148 = var33 + var144;
					int var149;
					if ((var149 = arg1[(var148 >>> 25) + (var148 & 0x3F80)]) != 0) {
						int var150 = ((var149 & 0xFF00FF) * var124 & 0xFF00FF00 | (var149 & 0xFF00) * var124 & 0xFF0000) >> 8;
						int var151 = arg0[var16];
						arg0[var16] = (((var151 & 0xFF00FF) * var122 & 0xFF00FF00 | (var151 & 0xFF00) * var122 & 0xFF0000) >> 8) + var150;
					}
					var16++;
					int var152 = var33 + var148;
					int var153;
					if ((var153 = arg1[(var152 >>> 25) + (var152 & 0x3F80)]) != 0) {
						int var154 = ((var153 & 0xFF00FF) * var124 & 0xFF00FF00 | (var153 & 0xFF00) * var124 & 0xFF0000) >> 8;
						int var155 = arg0[var16];
						arg0[var16] = (((var155 & 0xFF00FF) * var122 & 0xFF00FF00 | (var155 & 0xFF00) * var122 & 0xFF0000) >> 8) + var154;
					}
					var16++;
					var10000 = var33 + var152;
					int var157 = var30;
					int var158 = var31;
					var26 += arg12;
					var27 += arg13;
					var28 += arg14;
					int var159 = var28 >> 14;
					if (var159 == 0) {
						var30 = 0;
						var31 = 0;
					} else {
						var30 = var26 / var159;
						var31 = var27 / var159;
						if (var30 < 0) {
							var30 = 0;
						} else if (var30 > 16256) {
							var30 = 16256;
						}
					}
					var32 = (var157 << 18) + var158;
					var33 = (var30 - var157 >> 3 << 18) + (var31 - var158 >> 3);
					var17 += var35;
					int var160 = var17 >> 8;
					var34--;
				} while (var34 > 0);
			}
			int var161 = arg6 - arg5 & 0x7;
			if (var161 > 0) {
				do {
					int var162;
					if ((var162 = arg1[(var32 >>> 25) + (var32 & 0x3F80)]) != 0) {
						int var163 = ((var162 & 0xFF00FF) * var124 & 0xFF00FF00 | (var162 & 0xFF00) * var124 & 0xFF0000) >> 8;
						int var164 = arg0[var16];
						arg0[var16] = (((var164 & 0xFF00FF) * var122 & 0xFF00FF00 | (var164 & 0xFF00) * var122 & 0xFF0000) >> 8) + var163;
					}
					var16++;
					var32 += var33;
					var161--;
				} while (var161 > 0);
			}
		}
	}

	@ObfuscatedName("ja.am(FFFFFFFFFIIIIIIIIIIIII)V")
	public void method4746(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
		int[] var23 = this.field2669.field3011.method5082(arg21);
		if (var23 == null) {
			int var24 = this.field2669.field3011.method5069(arg21);
			this.method4755(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, method4786(var24, arg9), method4786(var24, arg10), method4786(var24, arg11));
			return;
		}
		this.field2660 = this.field2669.field3011.method5070(arg21);
		int var25 = (int) arg3;
		int var26 = (int) arg4;
		int var27 = (int) arg5;
		int var28 = (int) arg0;
		int var29 = (int) arg1;
		int var30 = (int) arg2;
		int var31 = var26 - var25;
		int var32 = var29 - var28;
		int var33 = var27 - var25;
		int var34 = var30 - var28;
		int var35 = arg10 - arg9;
		int var36 = arg11 - arg9;
		int var37 = 0;
		if (var28 != var29) {
			var37 = (var26 - var25 << 14) / (var29 - var28);
		}
		int var38 = 0;
		if (var29 != var30) {
			var38 = (var27 - var26 << 14) / (var30 - var29);
		}
		int var39 = 0;
		if (var28 != var30) {
			var39 = (var25 - var27 << 14) / (var28 - var30);
		}
		int var40 = var31 * var34 - var32 * var33;
		if (var40 == 0) {
			return;
		}
		int var41 = (var34 * var35 - var32 * var36 << 9) / var40;
		int var42 = (var31 * var36 - var33 * var35 << 9) / var40;
		int var43 = this.field2669.field3006;
		int var44 = arg12 - arg13;
		int var45 = arg15 - arg16;
		int var46 = arg18 - arg19;
		int var47 = arg14 - arg12;
		int var48 = arg17 - arg15;
		int var49 = arg20 - arg18;
		int var50 = arg15 * var47 - arg12 * var48 << 14;
		int var51 = (int) (((long) (arg18 * var48 - arg15 * var49) << 14) / (long) var43);
		int var52 = (int) (((long) (arg12 * var49 - arg18 * var47) << 14) / (long) var43);
		int var53 = arg15 * var44 - arg12 * var45 << 14;
		int var54 = (int) (((long) (arg18 * var45 - arg15 * var46) << 14) / (long) var43);
		int var55 = (int) (((long) (arg12 * var46 - arg18 * var44) << 14) / (long) var43);
		int var56 = var45 * var47 - var44 * var48 << 14;
		int var57 = (int) (((long) (var46 * var48 - var45 * var49) << 14) / (long) var43);
		int var58 = (int) (((long) (var44 * var49 - var46 * var47) << 14) / (long) var43);
		int[] var59 = this.field2669.field3016;
		int var60 = this.field2669.field3010;
		int var61 = this.field2669.field3009;
		if (var28 <= var29 && var28 <= var30) {
			if (var28 < var60) {
				if (var29 > var60) {
					var29 = var60;
				}
				if (var30 > var60) {
					var30 = var60;
				}
				int var62 = (arg9 << 9) - var25 * var41 + var41;
				if (var29 < var30) {
					int var63;
					int var64 = var63 = var25 << 14;
					if (var28 < 0) {
						var64 -= var28 * var39;
						var63 -= var28 * var37;
						var62 -= var28 * var42;
						var28 = 0;
					}
					int var65 = var26 << 14;
					if (var29 < 0) {
						var65 -= var29 * var38;
						var29 = 0;
					}
					int var66 = var28 - var61;
					int var67 = var52 * var66 + var50;
					int var68 = var55 * var66 + var53;
					int var69 = var58 * var66 + var56;
					if (var28 != var29 && var39 < var37 || var28 == var29 && var39 > var38) {
						int var70 = var30 - var29;
						int var71 = var29 - var28;
						int var72 = var59[var28];
						while (true) {
							var71--;
							if (var71 < 0) {
								while (true) {
									var70--;
									if (var70 < 0) {
										return;
									}
									this.method5326(Statics.field5989, var23, 0, 0, var72, var64 >> 14, var65 >> 14, var62, var41, var67, var68, var69, var51, var54, var57);
									var64 += var39;
									var65 += var38;
									var62 += var42;
									var72 += Statics.field5990;
									var67 += var52;
									var68 += var55;
									var69 += var58;
								}
							}
							this.method5326(Statics.field5989, var23, 0, 0, var72, var64 >> 14, var63 >> 14, var62, var41, var67, var68, var69, var51, var54, var57);
							var64 += var39;
							var63 += var37;
							var62 += var42;
							var72 += Statics.field5990;
							var67 += var52;
							var68 += var55;
							var69 += var58;
						}
					} else {
						int var73 = var30 - var29;
						int var74 = var29 - var28;
						int var75 = var59[var28];
						while (true) {
							var74--;
							if (var74 < 0) {
								while (true) {
									var73--;
									if (var73 < 0) {
										return;
									}
									this.method5326(Statics.field5989, var23, 0, 0, var75, var65 >> 14, var64 >> 14, var62, var41, var67, var68, var69, var51, var54, var57);
									var64 += var39;
									var65 += var38;
									var62 += var42;
									var75 += Statics.field5990;
									var67 += var52;
									var68 += var55;
									var69 += var58;
								}
							}
							this.method5326(Statics.field5989, var23, 0, 0, var75, var63 >> 14, var64 >> 14, var62, var41, var67, var68, var69, var51, var54, var57);
							var64 += var39;
							var63 += var37;
							var62 += var42;
							var75 += Statics.field5990;
							var67 += var52;
							var68 += var55;
							var69 += var58;
						}
					}
				} else {
					int var76;
					int var77 = var76 = var25 << 14;
					if (var28 < 0) {
						var77 -= var28 * var39;
						var76 -= var28 * var37;
						var62 -= var28 * var42;
						var28 = 0;
					}
					int var78 = var27 << 14;
					if (var30 < 0) {
						var78 -= var30 * var38;
						var30 = 0;
					}
					int var79 = var28 - var61;
					int var80 = var52 * var79 + var50;
					int var81 = var55 * var79 + var53;
					int var82 = var58 * var79 + var56;
					if ((var28 == var30 || var39 >= var37) && (var28 != var30 || var38 <= var37)) {
						int var86 = var29 - var30;
						int var87 = var30 - var28;
						int var88 = var59[var28];
						while (true) {
							var87--;
							if (var87 < 0) {
								while (true) {
									var86--;
									if (var86 < 0) {
										return;
									}
									this.method5326(Statics.field5989, var23, 0, 0, var88, var76 >> 14, var78 >> 14, var62, var41, var80, var81, var82, var51, var54, var57);
									var78 += var38;
									var76 += var37;
									var62 += var42;
									var88 += Statics.field5990;
									var80 += var52;
									var81 += var55;
									var82 += var58;
								}
							}
							this.method5326(Statics.field5989, var23, 0, 0, var88, var76 >> 14, var77 >> 14, var62, var41, var80, var81, var82, var51, var54, var57);
							var77 += var39;
							var76 += var37;
							var62 += var42;
							var88 += Statics.field5990;
							var80 += var52;
							var81 += var55;
							var82 += var58;
						}
					} else {
						int var83 = var29 - var30;
						int var84 = var30 - var28;
						int var85 = var59[var28];
						while (true) {
							var84--;
							if (var84 < 0) {
								while (true) {
									var83--;
									if (var83 < 0) {
										return;
									}
									this.method5326(Statics.field5989, var23, 0, 0, var85, var78 >> 14, var76 >> 14, var62, var41, var80, var81, var82, var51, var54, var57);
									var78 += var38;
									var76 += var37;
									var62 += var42;
									var85 += Statics.field5990;
									var80 += var52;
									var81 += var55;
									var82 += var58;
								}
							}
							this.method5326(Statics.field5989, var23, 0, 0, var85, var77 >> 14, var76 >> 14, var62, var41, var80, var81, var82, var51, var54, var57);
							var77 += var39;
							var76 += var37;
							var62 += var42;
							var85 += Statics.field5990;
							var80 += var52;
							var81 += var55;
							var82 += var58;
						}
					}
				}
			}
		} else if (var29 <= var30) {
			if (var29 < var60) {
				if (var30 > var60) {
					var30 = var60;
				}
				if (var28 > var60) {
					var28 = var60;
				}
				int var89 = (arg10 << 9) - var26 * var41 + var41;
				if (var30 < var28) {
					int var90;
					int var91 = var90 = var26 << 14;
					if (var29 < 0) {
						var91 -= var29 * var37;
						var90 -= var29 * var38;
						var89 -= var29 * var42;
						var29 = 0;
					}
					int var92 = var27 << 14;
					if (var30 < 0) {
						var92 -= var30 * var39;
						var30 = 0;
					}
					int var93 = var29 - var61;
					int var94 = var52 * var93 + var50;
					int var95 = var55 * var93 + var53;
					int var96 = var58 * var93 + var56;
					if (var29 != var30 && var37 < var38 || var29 == var30 && var37 > var39) {
						int var97 = var28 - var30;
						int var98 = var30 - var29;
						int var99 = var59[var29];
						while (true) {
							var98--;
							if (var98 < 0) {
								while (true) {
									var97--;
									if (var97 < 0) {
										return;
									}
									this.method5326(Statics.field5989, var23, 0, 0, var99, var91 >> 14, var92 >> 14, var89, var41, var94, var95, var96, var51, var54, var57);
									var91 += var37;
									var92 += var39;
									var89 += var42;
									var99 += Statics.field5990;
									var94 += var52;
									var95 += var55;
									var96 += var58;
								}
							}
							this.method5326(Statics.field5989, var23, 0, 0, var99, var91 >> 14, var90 >> 14, var89, var41, var94, var95, var96, var51, var54, var57);
							var91 += var37;
							var90 += var38;
							var89 += var42;
							var99 += Statics.field5990;
							var94 += var52;
							var95 += var55;
							var96 += var58;
						}
					} else {
						int var100 = var28 - var30;
						int var101 = var30 - var29;
						int var102 = var59[var29];
						while (true) {
							var101--;
							if (var101 < 0) {
								while (true) {
									var100--;
									if (var100 < 0) {
										return;
									}
									this.method5326(Statics.field5989, var23, 0, 0, var102, var92 >> 14, var91 >> 14, var89, var41, var94, var95, var96, var51, var54, var57);
									var91 += var37;
									var92 += var39;
									var89 += var42;
									var102 += Statics.field5990;
									var94 += var52;
									var95 += var55;
									var96 += var58;
								}
							}
							this.method5326(Statics.field5989, var23, 0, 0, var102, var90 >> 14, var91 >> 14, var89, var41, var94, var95, var96, var51, var54, var57);
							var91 += var37;
							var90 += var38;
							var89 += var42;
							var102 += Statics.field5990;
							var94 += var52;
							var95 += var55;
							var96 += var58;
						}
					}
				} else {
					int var103;
					int var104 = var103 = var26 << 14;
					if (var29 < 0) {
						var104 -= var29 * var37;
						var103 -= var29 * var38;
						var89 -= var29 * var42;
						var29 = 0;
					}
					int var105 = var25 << 14;
					if (var28 < 0) {
						var105 -= var28 * var39;
						var28 = 0;
					}
					int var106 = var29 - var61;
					int var107 = var52 * var106 + var50;
					int var108 = var55 * var106 + var53;
					int var109 = var58 * var106 + var56;
					if (var37 < var38) {
						int var110 = var30 - var28;
						int var111 = var28 - var29;
						int var112 = var59[var29];
						while (true) {
							var111--;
							if (var111 < 0) {
								while (true) {
									var110--;
									if (var110 < 0) {
										return;
									}
									this.method5326(Statics.field5989, var23, 0, 0, var112, var105 >> 14, var103 >> 14, var89, var41, var107, var108, var109, var51, var54, var57);
									var105 += var39;
									var103 += var38;
									var89 += var42;
									var112 += Statics.field5990;
									var107 += var52;
									var108 += var55;
									var109 += var58;
								}
							}
							this.method5326(Statics.field5989, var23, 0, 0, var112, var104 >> 14, var103 >> 14, var89, var41, var107, var108, var109, var51, var54, var57);
							var104 += var37;
							var103 += var38;
							var89 += var42;
							var112 += Statics.field5990;
							var107 += var52;
							var108 += var55;
							var109 += var58;
						}
					} else {
						int var113 = var30 - var28;
						int var114 = var28 - var29;
						int var115 = var59[var29];
						while (true) {
							var114--;
							if (var114 < 0) {
								while (true) {
									var113--;
									if (var113 < 0) {
										return;
									}
									this.method5326(Statics.field5989, var23, 0, 0, var115, var103 >> 14, var105 >> 14, var89, var41, var107, var108, var109, var51, var54, var57);
									var105 += var39;
									var103 += var38;
									var89 += var42;
									var115 += Statics.field5990;
									var107 += var52;
									var108 += var55;
									var109 += var58;
								}
							}
							this.method5326(Statics.field5989, var23, 0, 0, var115, var103 >> 14, var104 >> 14, var89, var41, var107, var108, var109, var51, var54, var57);
							var104 += var37;
							var103 += var38;
							var89 += var42;
							var115 += Statics.field5990;
							var107 += var52;
							var108 += var55;
							var109 += var58;
						}
					}
				}
			}
		} else if (var30 < var60) {
			if (var28 > var60) {
				var28 = var60;
			}
			if (var29 > var60) {
				var29 = var60;
			}
			int var116 = (arg11 << 9) - var27 * var41 + var41;
			if (var28 < var29) {
				int var117;
				int var118 = var117 = var27 << 14;
				if (var30 < 0) {
					var118 -= var30 * var38;
					var117 -= var30 * var39;
					var116 -= var30 * var42;
					var30 = 0;
				}
				int var119 = var25 << 14;
				if (var28 < 0) {
					var119 -= var28 * var37;
					var28 = 0;
				}
				int var120 = var30 - var61;
				int var121 = var52 * var120 + var50;
				int var122 = var55 * var120 + var53;
				int var123 = var58 * var120 + var56;
				if (var38 < var39) {
					int var124 = var29 - var28;
					int var125 = var28 - var30;
					int var126 = var59[var30];
					while (true) {
						var125--;
						if (var125 < 0) {
							while (true) {
								var124--;
								if (var124 < 0) {
									return;
								}
								this.method5326(Statics.field5989, var23, 0, 0, var126, var118 >> 14, var119 >> 14, var116, var41, var121, var122, var123, var51, var54, var57);
								var118 += var38;
								var119 += var37;
								var116 += var42;
								var126 += Statics.field5990;
								var121 += var52;
								var122 += var55;
								var123 += var58;
							}
						}
						this.method5326(Statics.field5989, var23, 0, 0, var126, var118 >> 14, var117 >> 14, var116, var41, var121, var122, var123, var51, var54, var57);
						var118 += var38;
						var117 += var39;
						var116 += var42;
						var126 += Statics.field5990;
						var121 += var52;
						var122 += var55;
						var123 += var58;
					}
				} else {
					int var127 = var29 - var28;
					int var128 = var28 - var30;
					int var129 = var59[var30];
					while (true) {
						var128--;
						if (var128 < 0) {
							while (true) {
								var127--;
								if (var127 < 0) {
									return;
								}
								this.method5326(Statics.field5989, var23, 0, 0, var129, var119 >> 14, var118 >> 14, var116, var41, var121, var122, var123, var51, var54, var57);
								var118 += var38;
								var119 += var37;
								var116 += var42;
								var129 += Statics.field5990;
								var121 += var52;
								var122 += var55;
								var123 += var58;
							}
						}
						this.method5326(Statics.field5989, var23, 0, 0, var129, var117 >> 14, var118 >> 14, var116, var41, var121, var122, var123, var51, var54, var57);
						var118 += var38;
						var117 += var39;
						var116 += var42;
						var129 += Statics.field5990;
						var121 += var52;
						var122 += var55;
						var123 += var58;
					}
				}
			} else {
				int var130;
				int var131 = var130 = var27 << 14;
				if (var30 < 0) {
					var131 -= var30 * var38;
					var130 -= var30 * var39;
					var116 -= var30 * var42;
					var30 = 0;
				}
				int var132 = var26 << 14;
				if (var29 < 0) {
					var132 -= var29 * var37;
					var29 = 0;
				}
				int var133 = var30 - var61;
				int var134 = var52 * var133 + var50;
				int var135 = var55 * var133 + var53;
				int var136 = var58 * var133 + var56;
				if (var38 < var39) {
					int var137 = var28 - var29;
					int var138 = var29 - var30;
					int var139 = var59[var30];
					while (true) {
						var138--;
						if (var138 < 0) {
							while (true) {
								var137--;
								if (var137 < 0) {
									return;
								}
								this.method5326(Statics.field5989, var23, 0, 0, var139, var132 >> 14, var130 >> 14, var116, var41, var134, var135, var136, var51, var54, var57);
								var132 += var37;
								var130 += var39;
								var116 += var42;
								var139 += Statics.field5990;
								var134 += var52;
								var135 += var55;
								var136 += var58;
							}
						}
						this.method5326(Statics.field5989, var23, 0, 0, var139, var131 >> 14, var130 >> 14, var116, var41, var134, var135, var136, var51, var54, var57);
						var131 += var38;
						var130 += var39;
						var116 += var42;
						var139 += Statics.field5990;
						var134 += var52;
						var135 += var55;
						var136 += var58;
					}
				} else {
					int var140 = var28 - var29;
					int var141 = var29 - var30;
					int var142 = var59[var30];
					while (true) {
						var141--;
						if (var141 < 0) {
							while (true) {
								var140--;
								if (var140 < 0) {
									return;
								}
								this.method5326(Statics.field5989, var23, 0, 0, var142, var130 >> 14, var132 >> 14, var116, var41, var134, var135, var136, var51, var54, var57);
								var132 += var37;
								var130 += var39;
								var116 += var42;
								var142 += Statics.field5990;
								var134 += var52;
								var135 += var55;
								var136 += var58;
							}
						}
						this.method5326(Statics.field5989, var23, 0, 0, var142, var130 >> 14, var131 >> 14, var116, var41, var134, var135, var136, var51, var54, var57);
						var131 += var38;
						var130 += var39;
						var116 += var42;
						var142 += Statics.field5990;
						var134 += var52;
						var135 += var55;
						var136 += var58;
					}
				}
			}
		}
	}

	@ObfuscatedName("ja.bf([I[IIIIIIIIIIIIII)V")
	public void method5326(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
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
		int var16 = arg4 + arg5;
		int var17 = arg5 * arg8 + arg7;
		int var18 = arg6 - arg5;
		int var19 = arg5 - this.field2669.field3004;
		int var20 = arg12 * var19 + arg9;
		int var21 = arg13 * var19 + arg10;
		int var22 = arg14 * var19 + arg11;
		int var23 = var22 >> 14;
		int var24;
		int var25;
		if (var23 == 0) {
			var24 = 0;
			var25 = 0;
		} else {
			var24 = var20 / var23;
			var25 = var21 / var23;
		}
		int var26 = arg12 * var18 + var20;
		int var27 = arg13 * var18 + var21;
		int var28 = arg14 * var18 + var22;
		int var29 = var28 >> 14;
		int var30;
		int var31;
		if (var29 == 0) {
			var30 = 0;
			var31 = 0;
		} else {
			var30 = var26 / var29;
			var31 = var27 / var29;
		}
		int var32 = (var24 << 18) + var25;
		int var33 = ((var30 - var24) / var18 << 18) + (var31 - var25) / var18;
		int var34 = var18 >> 3;
		int var35 = arg8 << 3;
		int var36 = var17 >> 8;
		if (this.field2660) {
			if (var34 > 0) {
				do {
					int var37 = arg1[(var32 >>> 25) + (var32 & 0x3F80)];
					arg0[var16++] = ((var37 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var37 & 0xFF00) * var36 & 0xFF0000) >> 8;
					int var38 = var32 + var33;
					int var39 = arg1[(var38 >>> 25) + (var38 & 0x3F80)];
					arg0[var16++] = ((var39 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var39 & 0xFF00) * var36 & 0xFF0000) >> 8;
					int var40 = var33 + var38;
					int var41 = arg1[(var40 >>> 25) + (var40 & 0x3F80)];
					arg0[var16++] = ((var41 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var41 & 0xFF00) * var36 & 0xFF0000) >> 8;
					int var42 = var33 + var40;
					int var43 = arg1[(var42 >>> 25) + (var42 & 0x3F80)];
					arg0[var16++] = ((var43 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var43 & 0xFF00) * var36 & 0xFF0000) >> 8;
					int var44 = var33 + var42;
					int var45 = arg1[(var44 >>> 25) + (var44 & 0x3F80)];
					arg0[var16++] = ((var45 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var45 & 0xFF00) * var36 & 0xFF0000) >> 8;
					int var46 = var33 + var44;
					int var47 = arg1[(var46 >>> 25) + (var46 & 0x3F80)];
					arg0[var16++] = ((var47 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var47 & 0xFF00) * var36 & 0xFF0000) >> 8;
					int var48 = var33 + var46;
					int var49 = arg1[(var48 >>> 25) + (var48 & 0x3F80)];
					arg0[var16++] = ((var49 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var49 & 0xFF00) * var36 & 0xFF0000) >> 8;
					int var50 = var33 + var48;
					int var51 = arg1[(var50 >>> 25) + (var50 & 0x3F80)];
					arg0[var16++] = ((var51 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var51 & 0xFF00) * var36 & 0xFF0000) >> 8;
					var32 = var33 + var50;
					var17 += var35;
					var36 = var17 >> 8;
					var34--;
				} while (var34 > 0);
			}
			int var52 = arg6 - arg5 & 0x7;
			if (var52 > 0) {
				do {
					int var53 = arg1[(var32 >>> 25) + (var32 & 0x3F80)];
					arg0[var16++] = ((var53 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var53 & 0xFF00) * var36 & 0xFF0000) >> 8;
					var32 += var33;
					var52--;
				} while (var52 > 0);
			}
			return;
		}
		if (var34 > 0) {
			do {
				int var54;
				if ((var54 = arg1[(var32 >>> 25) + (var32 & 0x3F80)]) != 0) {
					arg0[var16] = ((var54 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var54 & 0xFF00) * var36 & 0xFF0000) >> 8;
				}
				var16++;
				int var55 = var32 + var33;
				int var56;
				if ((var56 = arg1[(var55 >>> 25) + (var55 & 0x3F80)]) != 0) {
					arg0[var16] = ((var56 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var56 & 0xFF00) * var36 & 0xFF0000) >> 8;
				}
				var16++;
				int var57 = var33 + var55;
				int var58;
				if ((var58 = arg1[(var57 >>> 25) + (var57 & 0x3F80)]) != 0) {
					arg0[var16] = ((var58 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var58 & 0xFF00) * var36 & 0xFF0000) >> 8;
				}
				var16++;
				int var59 = var33 + var57;
				int var60;
				if ((var60 = arg1[(var59 >>> 25) + (var59 & 0x3F80)]) != 0) {
					arg0[var16] = ((var60 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var60 & 0xFF00) * var36 & 0xFF0000) >> 8;
				}
				var16++;
				int var61 = var33 + var59;
				int var62;
				if ((var62 = arg1[(var61 >>> 25) + (var61 & 0x3F80)]) != 0) {
					arg0[var16] = ((var62 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var62 & 0xFF00) * var36 & 0xFF0000) >> 8;
				}
				var16++;
				int var63 = var33 + var61;
				int var64;
				if ((var64 = arg1[(var63 >>> 25) + (var63 & 0x3F80)]) != 0) {
					arg0[var16] = ((var64 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var64 & 0xFF00) * var36 & 0xFF0000) >> 8;
				}
				var16++;
				int var65 = var33 + var63;
				int var66;
				if ((var66 = arg1[(var65 >>> 25) + (var65 & 0x3F80)]) != 0) {
					arg0[var16] = ((var66 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var66 & 0xFF00) * var36 & 0xFF0000) >> 8;
				}
				var16++;
				int var67 = var33 + var65;
				int var68;
				if ((var68 = arg1[(var67 >>> 25) + (var67 & 0x3F80)]) != 0) {
					arg0[var16] = ((var68 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var68 & 0xFF00) * var36 & 0xFF0000) >> 8;
				}
				var16++;
				var32 = var33 + var67;
				var17 += var35;
				var36 = var17 >> 8;
				var34--;
			} while (var34 > 0);
		}
		int var69 = arg6 - arg5 & 0x7;
		if (var69 <= 0) {
			return;
		}
		do {
			int var70;
			if ((var70 = arg1[(var32 >>> 25) + (var32 & 0x3F80)]) != 0) {
				arg0[var16] = ((var70 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var70 & 0xFF00) * var36 & 0xFF0000) >> 8;
			}
			var16++;
			var32 += var33;
			var69--;
		} while (var69 > 0);
	}
}
