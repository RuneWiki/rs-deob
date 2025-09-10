package deob;

@ObfuscatedName("ft")
public class class135 {

	@ObfuscatedName("ft.ac")
	public static final float field1621 = Math.ulp(1.0F);

	@ObfuscatedName("ft.ap")
	public static final float field1618 = field1621 * 2.0F;

	public class135() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("fv.af(Lff;FB)F")
	public static float method3455(class139 arg0, float arg1) {
		if (arg0 == null || arg0.method3556() == 0) {
			return 0.0F;
		} else if (arg1 < (float) arg0.field1674[0].field1613) {
			return class137.field1648 == arg0.field1660 ? arg0.field1674[0].field1607 : method2356(arg0, arg1, true);
		} else if (arg1 > (float) arg0.field1674[arg0.method3556() - 1].field1613) {
			return class137.field1648 == arg0.field1661 ? arg0.field1674[arg0.method3556() - 1].field1607 : method2356(arg0, arg1, false);
		} else if (arg0.field1677) {
			return arg0.field1674[0].field1607;
		} else {
			class134 var2 = arg0.method3536(arg1);
			boolean var3 = false;
			boolean var4 = false;
			if (var2 == null) {
				return 0.0F;
			}
			if (var2.field1614 == 0.0F && var2.field1609 == 0.0F) {
				var3 = true;
			} else if (var2.field1614 == Float.MAX_VALUE && var2.field1609 == Float.MAX_VALUE) {
				var4 = true;
			} else if (var2.field1610 == null) {
				var3 = true;
			} else if (arg0.field1659) {
				float var5 = (float) var2.field1613;
				float var6 = var2.field1607;
				float var7 = var2.field1614 * 0.33333334F + var5;
				float var8 = var2.field1609 * 0.33333334F + var6;
				float var9 = (float) var2.field1610.field1613;
				float var10 = var2.field1610.field1607;
				float var11 = var9 - var2.field1610.field1606 * 0.33333334F;
				float var12 = var10 - var2.field1610.field1604 * 0.33333334F;
				if (arg0.field1681) {
					float var15 = var8;
					float var16 = var12;
					if (arg0 != null) {
						float var17 = var9 - var5;
						if (var17 != 0.0F) {
							float var18 = var7 - var5;
							float var19 = var11 - var5;
							float[] var20 = new float[] { var18 / var17, var19 / var17 };
							arg0.field1663 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
							float var21 = var20[0];
							float var22 = var20[1];
							if (var20[0] < 0.0F) {
								var20[0] = 0.0F;
							}
							if (var20[1] > 1.0F) {
								var20[1] = 1.0F;
							}
							if (var20[0] > 1.0F || var20[1] < -1.0F) {
								var20[1] = 1.0F - var20[1];
								if (var20[0] < 0.0F) {
									var20[0] = 0.0F;
								}
								if (var20[1] < 0.0F) {
									var20[1] = 0.0F;
								}
								if (var20[0] > 1.0F || var20[1] > 1.0F) {
									float var23 = (var20[1] - 2.0F) * var20[1] + (var20[0] - 2.0F + var20[1]) * var20[0] + 1.0F;
									if (field1621 + var23 > 0.0F) {
										method3676(var20);
									}
								}
								var20[1] = 1.0F - var20[1];
							}
							if (var20[0] != var21) {
								float var24 = var20[0] * var17 + var5;
								if (var21 != 0.0F) {
									var15 = (var8 - var6) * var20[0] / var21 + var6;
								}
							}
							if (var20[1] != var22) {
								float var25 = var20[1] * var17 + var5;
								if (var22 != 1.0F) {
									var16 = var10 - (1.0F - var20[1]) * (var10 - var12) / (1.0F - var22);
								}
							}
							arg0.field1664 = var5;
							arg0.field1662 = var9;
							float var26 = var20[0];
							float var27 = var20[1];
							float var28 = var26 - 0.0F;
							float var29 = var27 - var26;
							float var30 = 1.0F - var27;
							float var31 = var29 - var28;
							arg0.field1669 = var30 - var29 - var31;
							arg0.field1668 = var31 + var31 + var31;
							arg0.field1658 = var28 + var28 + var28;
							arg0.field1665 = 0.0F;
							Statics.method76(var6, var15, var16, var10, arg0);
						}
					}
				} else if (arg0 != null) {
					arg0.field1664 = var5;
					float var32 = var9 - var5;
					float var33 = var10 - var6;
					float var34 = var7 - var5;
					float var35 = 0.0F;
					float var36 = 0.0F;
					if (var34 != 0.0F) {
						var35 = (var8 - var6) / var34;
					}
					float var37 = var9 - var11;
					if (var37 != 0.0F) {
						var36 = (var10 - var12) / var37;
					}
					float var38 = 1.0F / (var32 * var32);
					float var39 = var32 * var35;
					float var40 = var32 * var36;
					arg0.field1665 = (var39 + var40 - var33 - var33) * var38 / var32;
					arg0.field1658 = (var33 + var33 + var33 - var39 - var39 - var40) * var38;
					arg0.field1668 = var35;
					arg0.field1669 = var6;
				}
				arg0.field1659 = false;
			}
			if (var3) {
				return var2.field1607;
			} else if (var4) {
				return (float) var2.field1613 == arg1 || var2.field1610 == null ? var2.field1607 : var2.field1610.field1607;
			} else if (arg0.field1681) {
				return method277(arg0, arg1);
			} else {
				float var41;
				if (arg0 == null) {
					var41 = 0.0F;
				} else {
					float var42 = arg1 - arg0.field1664;
					var41 = ((arg0.field1665 * var42 + arg0.field1658) * var42 + arg0.field1668) * var42 + arg0.field1669;
				}
				return var41;
			}
		}
	}

	@ObfuscatedName("ag.aw(Lff;FI)F")
	public static float method277(class139 arg0, float arg1) {
		if (arg0 == null) {
			return 0.0F;
		}
		float var2;
		if (arg0.field1664 == arg1) {
			var2 = 0.0F;
		} else if (arg0.field1662 == arg1) {
			var2 = 1.0F;
		} else {
			var2 = (arg1 - arg0.field1664) / (arg0.field1662 - arg0.field1664);
		}
		float var3;
		if (arg0.field1663) {
			var3 = var2;
		} else {
			float[] var4 = new float[] { arg0.field1665 - var2, arg0.field1658, arg0.field1668, arg0.field1669 };
			float[] var5 = new float[5];
			int var6 = class457.method6537(var4, 3, 0.0F, true, 1.0F, true, var5);
			if (var6 == 1) {
				var3 = var5[0];
			} else {
				var3 = 0.0F;
			}
		}
		return ((arg0.field1673 * var3 + arg0.field1672) * var3 + arg0.field1671) * var3 + arg0.field1670;
	}

	@ObfuscatedName("co.at(Lff;FZI)F")
	public static float method2356(class139 arg0, float arg1, boolean arg2) {
		float var3 = 0.0F;
		if (arg0 == null || arg0.method3556() == 0) {
			return var3;
		}
		float var4 = (float) arg0.field1674[0].field1613;
		float var5 = (float) arg0.field1674[arg0.method3556() - 1].field1613;
		float var6 = var5 - var4;
		if (var6 == 0.0F) {
			return arg0.field1674[0].field1607;
		}
		float var7 = 0.0F;
		float var8;
		if (arg1 > var5) {
			var8 = (arg1 - var5) / var6;
		} else {
			var8 = (arg1 - var4) / var6;
		}
		float var9 = (float) var8;
		float var10 = Math.abs(var8 - var9);
		float var11 = var6 * var10;
		float var12 = Math.abs(var9 + 1.0F);
		float var13 = var12 / 2.0F;
		float var14 = (float) var13;
		float var15 = var13 - var14;
		if (arg2) {
			if (class137.field1645 == arg0.field1660) {
				if (var15 == 0.0F) {
					var11 = var5 - var11;
				} else {
					var11 += var4;
				}
			} else if (class137.field1643 == arg0.field1660 || class137.field1644 == arg0.field1660) {
				var11 = var5 - var11;
			} else if (class137.field1642 == arg0.field1660) {
				float var16 = var4 - arg1;
				float var17 = arg0.field1674[0].field1606;
				float var18 = arg0.field1674[0].field1604;
				float var19 = arg0.field1674[0].field1607;
				if (var17 != 0.0F) {
					var19 -= var16 * var18 / var17;
				}
				return var19;
			}
		} else if (class137.field1645 == arg0.field1661) {
			if (var15 == 0.0F) {
				var11 += var4;
			} else {
				var11 = var5 - var11;
			}
		} else if (class137.field1643 == arg0.field1661 || class137.field1644 == arg0.field1661) {
			var11 += var4;
		} else if (class137.field1642 == arg0.field1661) {
			float var20 = arg1 - var5;
			float var21 = arg0.field1674[arg0.method3556() - 1].field1614;
			float var22 = arg0.field1674[arg0.method3556() - 1].field1609;
			float var23 = arg0.field1674[arg0.method3556() - 1].field1607;
			if (var21 != 0.0F) {
				var23 += var20 * var22 / var21;
			}
			return var23;
		}
		float var24 = method3455(arg0, var11);
		if (arg2 && class137.field1644 == arg0.field1660) {
			float var25 = arg0.field1674[arg0.method3556() - 1].field1607 - arg0.field1674[0].field1607;
			var24 -= var12 * var25;
		} else if (!arg2 && class137.field1644 == arg0.field1661) {
			float var26 = arg0.field1674[arg0.method3556() - 1].field1607 - arg0.field1674[0].field1607;
			var24 += var12 * var26;
		}
		return var24;
	}

	@ObfuscatedName("gk.ac([FI)V")
	public static void method3676(float[] arg0) {
		if (arg0[0] + field1621 >= 1.3333334F) {
			arg0[0] = 1.3333334F - field1621;
			arg0[1] = 0.33333334F - field1621;
			return;
		}
		float var1 = arg0[0] - 2.0F;
		float var2 = arg0[0] - 1.0F;
		float var3 = (float) Math.sqrt((double) (var1 * var1 - var2 * 4.0F * var2));
		float var4 = (-var1 + var3) * 0.5F;
		if (arg0[1] + field1621 > var4) {
			arg0[1] = var4 - field1621;
		} else {
			float var5 = (-var1 - var3) * 0.5F;
			if (arg0[1] < field1621 + var5) {
				arg0[1] = field1621 + var5;
			}
		}
	}
}
