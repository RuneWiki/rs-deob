package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("bv")
public class class47 {

	@ObfuscatedName("bv.ap")
	public static final String[] field669 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@ObfuscatedName("bv.al")
	public static final double field658 = Math.log(2.0D);

	@ObfuscatedName("bv.aa")
	public static int[] field660 = new int[1000];

	@ObfuscatedName("bv.an")
	public static Object[] field661 = new Object[1000];

	@ObfuscatedName("bv.ae")
	public static int field663 = 0;

	@ObfuscatedName("bv.ay")
	public static class39[] field664 = new class39[50];

	@ObfuscatedName("bv.ad")
	public static int field654 = 0;

	@ObfuscatedName("bv.ah")
	public static class369 field666 = new class369();

	@ObfuscatedName("bv.ab")
	public static Calendar field667 = Calendar.getInstance();

	@ObfuscatedName("bv.ak")
	public static boolean field668 = false;

	@ObfuscatedName("bv.aj")
	public static boolean field653 = false;

	@ObfuscatedName("bv.az")
	public static ArrayList field670 = new ArrayList();

	@ObfuscatedName("bv.bt")
	public static int field671 = 0;

	public class47() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("my.af(Lcq;B)V")
	public static void method6482(class66 arg0) {
		method3525(arg0, 500000, 475000);
	}

	@ObfuscatedName("fy.aw(Lcq;III)V")
	public static void method3525(class66 arg0, int arg1, int arg2) {
		Object[] var3 = arg0.field899;
		class56 var5;
		if (class585.method4229(arg0.field904)) {
			Statics.field2811 = (class313) var3[0];
			class185 var4 = class185.method4094(Statics.field2811.field3513);
			var5 = class56.method292(arg0.field904, var4.field1993, var4.field2005);
		} else {
			int var6 = (Integer) var3[0];
			var5 = class56.method6468(var6);
		}
		if (var5 != null) {
			method5402(arg0, var5, arg1, arg2);
		}
	}

	@ObfuscatedName("jq.at(Lcq;Lcg;IIB)V")
	public static void method5402(class66 arg0, class56 arg1, int arg2, int arg3) {
		Object[] var4 = arg0.field899;
		Statics.field1570 = 0;
		Statics.field659 = 0;
		int var5 = -1;
		int[] var6 = arg1.field797;
		int[] var7 = arg1.field802;
		byte var8 = -1;
		field663 = 0;
		field668 = false;
		boolean var9 = false;
		field654 = 0;
		try {
			Statics.field3278 = new int[arg1.field800];
			int var10 = 0;
			Statics.field672 = new Object[arg1.field798];
			int var11 = 0;
			for (int var12 = 1; var12 < var4.length; var12++) {
				if (var4[var12] instanceof Integer) {
					int var13 = (Integer) var4[var12];
					if (var13 == -2147483647) {
						var13 = arg0.field901;
					}
					if (var13 == -2147483646) {
						var13 = arg0.field896;
					}
					if (var13 == -2147483645) {
						var13 = arg0.field894 == null ? -1 : arg0.field894.field4145;
					}
					if (var13 == -2147483644) {
						var13 = arg0.field892;
					}
					if (var13 == -2147483643) {
						var13 = arg0.field894 == null ? -1 : arg0.field894.field4146;
					}
					if (var13 == -2147483642) {
						var13 = arg0.field897 == null ? -1 : arg0.field897.field4145;
					}
					if (var13 == -2147483641) {
						var13 = arg0.field897 == null ? -1 : arg0.field897.field4146;
					}
					if (var13 == -2147483640) {
						var13 = arg0.field893;
					}
					if (var13 == -2147483639) {
						var13 = arg0.field895;
					}
					if (var13 == -2147483638) {
						var13 = arg0.field898;
					}
					Statics.field3278[var10++] = var13;
				} else if (var4[var12] instanceof String) {
					String var14 = (String) var4[var12];
					if (var14.equals("event_opbase")) {
						var14 = arg0.field902;
					}
					Statics.field672[var11++] = var14;
				} else if (var4[var12] instanceof class520) {
					Statics.field672[var11++] = var4[var12];
				}
			}
			field671 = arg0.field903;
			while (true) {
				field654++;
				if (field654 > arg2) {
					throw new RuntimeException();
				}
				var5++;
				int var54 = var6[var5];
				if (var54 >= 100) {
					boolean var41 = arg1.field802[var5] == 1;
					int var42 = method4093(var54, arg1, var41);
					switch(var42) {
						case 0:
							return;
						case 1:
						default:
							break;
						case 2:
							throw new IllegalStateException();
					}
				} else if (var54 == 0) {
					field660[++Statics.field1570 - 1] = var7[var5];
				} else if (var54 == 1) {
					int var15 = var7[var5];
					field660[++Statics.field1570 - 1] = Statics.field4023[var15];
				} else if (var54 == 2) {
					int var16 = var7[var5];
					Statics.field4023[var16] = field660[--Statics.field1570];
					client.method7512(var16);
				} else if (var54 == 3) {
					field661[++Statics.field659 - 1] = arg1.field799[var5];
				} else if (var54 == 6) {
					var5 += var7[var5];
				} else if (var54 == 7) {
					Statics.field1570 -= 2;
					if (field660[Statics.field1570] != field660[Statics.field1570 + 1]) {
						var5 += var7[var5];
					}
				} else if (var54 == 8) {
					Statics.field1570 -= 2;
					if (field660[Statics.field1570] == field660[Statics.field1570 + 1]) {
						var5 += var7[var5];
					}
				} else if (var54 == 9) {
					Statics.field1570 -= 2;
					if (field660[Statics.field1570] < field660[Statics.field1570 + 1]) {
						var5 += var7[var5];
					}
				} else if (var54 == 10) {
					Statics.field1570 -= 2;
					if (field660[Statics.field1570] > field660[Statics.field1570 + 1]) {
						var5 += var7[var5];
					}
				} else if (var54 == 21) {
					if (field663 == 0) {
						return;
					}
					class39 var18 = field664[--field663];
					arg1 = var18.field260;
					var6 = arg1.field797;
					var7 = arg1.field802;
					var5 = var18.field256;
					Statics.field3278 = var18.field259;
					Statics.field672 = var18.field255;
				} else if (var54 == 25) {
					int var19 = var7[var5];
					field660[++Statics.field1570 - 1] = class356.method5877(var19);
				} else if (var54 == 27) {
					int var20 = var7[var5];
					class356.method4610(var20, field660[--Statics.field1570]);
				} else if (var54 == 31) {
					Statics.field1570 -= 2;
					if (field660[Statics.field1570] <= field660[Statics.field1570 + 1]) {
						var5 += var7[var5];
					}
				} else if (var54 == 32) {
					Statics.field1570 -= 2;
					if (field660[Statics.field1570] >= field660[Statics.field1570 + 1]) {
						var5 += var7[var5];
					}
				} else if (var54 == 33) {
					field660[++Statics.field1570 - 1] = Statics.field3278[var7[var5]];
				} else if (var54 == 34) {
					Statics.field3278[var7[var5]] = field660[--Statics.field1570];
				} else if (var54 == 35) {
					field661[++Statics.field659 - 1] = Statics.field672[var7[var5]];
				} else if (var54 == 36) {
					Statics.field672[var7[var5]] = field661[--Statics.field659];
				} else if (var54 == 37) {
					int var21 = var7[var5];
					Statics.field659 -= var21;
					String var22 = class446.method2759(field661, Statics.field659, var21);
					field661[++Statics.field659 - 1] = var22;
				} else if (var54 == 38) {
					Statics.field1570--;
				} else if (var54 == 39) {
					Statics.field659--;
				} else if (var54 == 40) {
					if (field663 == 50) {
						throw new RuntimeException();
					}
					int var23 = var7[var5];
					class56 var24 = class56.method6468(var23);
					int[] var25 = new int[var24.field800];
					Object[] var26 = new Object[var24.field798];
					if (var24.field803 >= 0) {
						System.arraycopy(field660, Statics.field1570 - var24.field803, var25, 0, var24.field803);
					}
					if (var24.field805 >= 0) {
						System.arraycopy(field661, Statics.field659 - var24.field805, var26, 0, var24.field805);
					}
					Statics.field1570 -= var24.field803;
					Statics.field659 -= var24.field805;
					class39 var27 = new class39();
					var27.field260 = arg1;
					var27.field256 = var5;
					var27.field259 = Statics.field3278;
					var27.field255 = Statics.field672;
					field664[++field663 - 1] = var27;
					arg1 = var24;
					var6 = var24.field797;
					var7 = var24.field802;
					var5 = -1;
					Statics.field3278 = var25;
					Statics.field672 = var26;
				} else if (var54 == 42) {
					field660[++Statics.field1570 - 1] = Statics.field5479.method2848(var7[var5]);
				} else if (var54 == 43) {
					Statics.field5479.method2813(var7[var5], field660[--Statics.field1570]);
				} else if (var54 == 44) {
					int var28 = var7[var5] >> 16;
					int var29 = var7[var5] & 0xFFFF;
					int var30 = field660[--Statics.field1570];
					if (var30 < 0 || var30 > 5000) {
						throw new RuntimeException();
					}
					if (var29 == 115) {
						Statics.field672[var28] = new class520(class575.field5825, "", var30, var30);
					} else if (var29 == 105 || var29 == 49) {
						Statics.field672[var28] = new class520(class575.field5821, 0, var30, var30);
					} else {
						Statics.field672[var28] = new class520(class575.field5821, -1, var30, var30);
					}
				} else if (var54 == 45) {
					class520 var31 = method7553(var7[var5], Statics.field672[var7[var5]]);
					int var32 = field660[--Statics.field1570];
					method9534(var31, var32);
					if (class575.field5821 == var31.field5505) {
						field660[++Statics.field1570 - 1] = var31.method9541()[var32];
					} else {
						field661[++Statics.field659 - 1] = var31.method9544()[var32];
					}
				} else if (var54 == 46) {
					class520 var33 = method7553(var7[var5], Statics.field672[var7[var5]]);
					if (!var33.field5502) {
						throw new RuntimeException();
					}
					if (class575.field5821 == var33.field5505) {
						Statics.field1570 -= 2;
						int var34 = field660[Statics.field1570];
						method9534(var33, var34);
						var33.method9541()[var34] = field660[Statics.field1570 + 1];
					} else {
						int var35 = field660[--Statics.field1570];
						method9534(var33, var35);
						var33.method9544()[var35] = field661[--Statics.field659];
					}
				} else if (var54 == 49) {
					String var36 = Statics.field5479.method2816(var7[var5]);
					field661[++Statics.field659 - 1] = var36;
				} else if (var54 == 50) {
					Statics.field5479.method2815(var7[var5], (String) field661[--Statics.field659]);
				} else if (var54 == 60) {
					class427 var37 = arg1.field795[var7[var5]];
					class544 var38 = (class544) var37.method7946((long) field660[--Statics.field1570]);
					if (var38 != null) {
						var5 += var38.field5598;
					}
				} else if (var54 == 63) {
					field661[++Statics.field659 - 1] = null;
				} else if (var54 == 74) {
					Integer var39 = Statics.field2806.method3743(var7[var5]);
					if (var39 == null) {
						field660[++Statics.field1570 - 1] = -1;
					} else {
						field660[++Statics.field1570 - 1] = var39;
					}
				} else if (var54 == 76) {
					Integer var40 = Statics.field3086.method9660(var7[var5]);
					if (var40 == null) {
						field660[++Statics.field1570 - 1] = -1;
					} else {
						field660[++Statics.field1570 - 1] = var40;
					}
				} else {
					throw new IllegalStateException();
				}
			}
		} catch (Exception var52) {
			var9 = true;
			StringBuilder var45 = new StringBuilder(30);
			var45.append("").append(arg1.field5601).append(" ");
			for (int var46 = field663 - 1; var46 >= 0; var46--) {
				var45.append("").append(field664[var46].field260.field5601).append(" ");
			}
			var45.append("").append(var8);
			class617.method9413(var45.toString(), var52);
		} finally {
			while (!field670.isEmpty()) {
				class84 var49 = (class84) field670.remove(0);
				client.method6373(var49.method2720(), var49.method2721(), var49.method2722(), var49.method2726(), "");
			}
			if (field668) {
				field668 = false;
				client.method99();
			}
			if (!var9 && arg3 > 0 && field654 >= arg3) {
				class617.method9413("Warning: Script " + arg1.field796 + " finished at op count " + field654 + " of max " + arg2, null);
			}
		}
	}

	@ObfuscatedName("os.ac(ILjava/lang/Object;I)Lti;")
	public static class520 method7553(int arg0, Object arg1) {
		class520 var2 = (class520) arg1;
		if (var2 == null) {
			throw new RuntimeException();
		}
		return var2;
	}

	@ObfuscatedName("tv.ap(Lti;II)V")
	public static void method9534(class520 arg0, int arg1) {
		if (arg1 < 0 || arg1 >= arg0.method9545()) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("hx.aq(ILcg;ZB)I")
	public static int method4093(int arg0, class56 arg1, boolean arg2) {
		if (arg0 < 1000) {
			return method5647(arg0, arg1, arg2);
		} else if (arg0 < 1100) {
			return method3878(arg0, arg1, arg2);
		} else if (arg0 < 1200) {
			return method7685(arg0, arg1, arg2);
		} else if (arg0 < 1300) {
			return method6793(arg0, arg1, arg2);
		} else if (arg0 < 1400) {
			return method6324(arg0, arg1, arg2);
		} else if (arg0 < 1500) {
			return method6417(arg0, arg1, arg2);
		} else if (arg0 < 1600) {
			return method93(arg0, arg1, arg2);
		} else if (arg0 < 1700) {
			return method409(arg0, arg1, arg2);
		} else if (arg0 < 1800) {
			return method468(arg0, arg1, arg2);
		} else if (arg0 < 1900) {
			return method2483(arg0, arg1, arg2);
		} else if (arg0 < 2000) {
			return method2734(arg0, arg1, arg2);
		} else if (arg0 < 2100) {
			return method3878(arg0, arg1, arg2);
		} else if (arg0 < 2200) {
			return method7685(arg0, arg1, arg2);
		} else if (arg0 < 2300) {
			return method6793(arg0, arg1, arg2);
		} else if (arg0 < 2400) {
			return method6324(arg0, arg1, arg2);
		} else if (arg0 < 2500) {
			return method6417(arg0, arg1, arg2);
		} else if (arg0 < 2600) {
			return method499(arg0, arg1, arg2);
		} else if (arg0 < 2700) {
			return method1862(arg0, arg1, arg2);
		} else if (arg0 < 2800) {
			return method8976(arg0, arg1, arg2);
		} else if (arg0 < 2900) {
			return method1951(arg0, arg1, arg2);
		} else if (arg0 < 3000) {
			return method2734(arg0, arg1, arg2);
		} else if (arg0 < 3200) {
			return method10032(arg0, arg1, arg2);
		} else if (arg0 < 3300) {
			return method4090(arg0, arg1, arg2);
		} else if (arg0 < 3400) {
			return method3594(arg0, arg1, arg2);
		} else if (arg0 < 3500) {
			return method8992(arg0, arg1, arg2);
		} else if (arg0 < 3600) {
			return method784(arg0, arg1, arg2);
		} else if (arg0 < 3700) {
			return method4213(arg0, arg1, arg2);
		} else if (arg0 < 3800) {
			return method7643(arg0, arg1, arg2);
		} else if (arg0 < 3900) {
			return method9106(arg0, arg1, arg2);
		} else if (arg0 < 4000) {
			return method2803(arg0, arg1, arg2);
		} else if (arg0 < 4100) {
			return method761(arg0, arg1, arg2);
		} else if (arg0 < 4200) {
			return method2098(arg0, arg1, arg2);
		} else if (arg0 < 4300) {
			return method5720(arg0, arg1, arg2);
		} else if (arg0 < 5100) {
			return method3607(arg0, arg1, arg2);
		} else if (arg0 < 5400) {
			return method8979(arg0, arg1, arg2);
		} else if (arg0 < 5600) {
			return method5646(arg0, arg1, arg2);
		} else if (arg0 < 5700) {
			return method3325(arg0, arg1, arg2);
		} else if (arg0 < 6300) {
			return method5445(arg0, arg1, arg2);
		} else if (arg0 < 6600) {
			return method523(arg0, arg1, arg2);
		} else if (arg0 < 6700) {
			return method7585(arg0, arg1, arg2);
		} else if (arg0 < 6800) {
			return method3685(arg0, arg1, arg2);
		} else if (arg0 < 6900) {
			return method7488(arg0, arg1, arg2);
		} else if (arg0 < 7000) {
			return method681(arg0, arg1, arg2);
		} else if (arg0 < 7100) {
			return method6787(arg0, arg1, arg2);
		} else if (arg0 < 7200) {
			return Statics.method9665(arg0, arg1, arg2);
		} else if (arg0 < 7500) {
			return method5114(arg0, arg1, arg2);
		} else if (arg0 < 7600) {
			return method2119(arg0, arg1, arg2);
		} else if (arg0 < 7700) {
			return method7533(arg0, arg1, arg2);
		} else if (arg0 < 8000) {
			return method3243(arg0, arg1, arg2);
		} else if (arg0 < 8100) {
			return method3879(arg0, arg1, arg2);
		} else if (arg0 >= 13000 && arg0 < 14000) {
			return method7688(arg0, arg1, arg2);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("cc.ao(Loi;IZLcg;I)V")
	public static void method2048(class370 arg0, int arg1, boolean arg2, class56 arg3) {
		if (arg0.field4287 == null) {
			arg0.field4287 = new class370[arg1 + 1];
		}
		if (arg0.field4287.length <= arg1) {
			class370[] var4 = new class370[arg1 + 1];
			System.arraycopy(arg0.field4287, 0, var4, 0, arg0.field4287.length);
			arg0.field4287 = var4;
			return;
		}
		class370 var5 = arg0.field4287[arg1];
		if (var5 != null) {
			if (arg2) {
				throw new RuntimeException("");
			}
			method6273(var5, arg0);
		}
	}

	@ObfuscatedName("aw.as(Loi;IB)V")
	public static void method12(class370 arg0, int arg1) {
		if (arg0.field4148 != 0 || arg0.field4146 <= -1) {
			return;
		}
		if (arg1 > arg0.field4215) {
			arg0.field4215 = arg1;
		}
		if (arg1 < arg0.field4249) {
			arg0.field4249 = arg1;
		}
	}

	@ObfuscatedName("ks.al(ILcg;ZB)I")
	public static int method5647(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 100) {
			Statics.field1570 -= 4;
			int var3 = field660[Statics.field1570];
			int var4 = field660[Statics.field1570 + 1];
			int var5 = field660[Statics.field1570 + 2];
			boolean var6 = field660[Statics.field1570 + 3] != 0;
			class370 var7 = Statics.field1555.method6863(var3);
			if (var7.field4148 != 0) {
				throw new RuntimeException("");
			}
			method2048(var7, var5, var6, arg1);
			class370 var8 = new class370();
			var8.field4148 = var4;
			var8.field4165 = var8.field4145 = var7.field4145;
			var8.field4146 = var5;
			var8.field4144 = true;
			if (var4 == 12) {
				method3637(var8);
			}
			var7.field4287[var5] = var8;
			if (arg2) {
				Statics.field82 = var8;
			} else {
				Statics.field1715 = var8;
			}
			client.method2809(var7);
			return 1;
		} else if (arg0 == 101) {
			class370 var9 = arg2 ? Statics.field82 : Statics.field1715;
			class370 var10 = Statics.field1555.method6863(var9.field4145);
			method6273(var9, var10);
			client.method2809(var10);
			return 1;
		} else if (arg0 == 102) {
			Statics.field1570--;
			int var11 = field660[Statics.field1570];
			class370 var12 = Statics.field1555.method6863(var11);
			var12.field4287 = null;
			client.method2809(var12);
			return 1;
		} else if (arg0 == 105) {
			Statics.field1570 -= 3;
			int var13 = field660[Statics.field1570];
			int var14 = field660[Statics.field1570 + 1];
			int var15 = field660[Statics.field1570 + 2];
			class370 var16 = Statics.field1555.method6863(var13);
			class370 var17 = Statics.field1555.method6864(var13, var14);
			if (var16 == null) {
				throw new RuntimeException("");
			} else if (var14 < 0) {
				throw new RuntimeException("");
			} else if (var17 == null) {
				throw new RuntimeException("");
			} else if (var17.field4148 == 0) {
				throw new RuntimeException("");
			} else {
				method2048(var16, var15, true, arg1);
				if (var17.field4166 != -1) {
					class370 var18 = Statics.field1555.method6864(var13, var17.field4166);
					method12(var18, var15);
				}
				class370 var19 = new class370(var17);
				var19.field4146 = var15;
				if (var17.field4148 == 12) {
					method3637(var19);
				}
				var16.field4287[var15] = var19;
				if (arg2) {
					Statics.field82 = var19;
				} else {
					Statics.field1715 = var19;
				}
				client.method2809(var16);
				return 1;
			}
		} else if (arg0 == 106) {
			Statics.field1570 -= 2;
			int var20 = field660[Statics.field1570];
			int var21 = field660[Statics.field1570 + 1];
			class370 var22 = arg2 ? Statics.field82 : Statics.field1715;
			if (var22 == null) {
				throw new RuntimeException("");
			}
			class370 var23 = Statics.field1555.method6863(var22.field4165);
			if (var22.field4148 != 0) {
				throw new RuntimeException("");
			} else if (var23.field4148 == 0) {
				method2048(var23, var21, true, arg1);
				method12(var22, var21);
				class370 var24 = new class370();
				var24.field4148 = var20;
				var24.field4165 = var24.field4145 = var23.field4145;
				var24.field4166 = var22.field4146;
				var24.field4146 = var21;
				var24.field4144 = true;
				if (var20 == 12) {
					method3637(var24);
				}
				var23.field4287[var21] = var24;
				if (arg2) {
					Statics.field82 = var24;
				} else {
					Statics.field1715 = var24;
				}
				client.method2809(var23);
				return 1;
			} else {
				throw new RuntimeException();
			}
		} else if (arg0 == 107) {
			Statics.field1570 -= 2;
			int var25 = field660[Statics.field1570];
			int var26 = field660[Statics.field1570 + 1];
			class370 var27 = arg2 ? Statics.field82 : Statics.field1715;
			if (var27 == null) {
				throw new RuntimeException("");
			}
			class370 var28 = Statics.field1555.method6864(var27.field4165, var27.field4166);
			class370 var29 = Statics.field1555.method6863(var28.field4165);
			if (var28.field4148 != 0) {
				throw new RuntimeException("");
			} else if (var29.field4148 == 0) {
				method2048(var29, var26, true, arg1);
				method12(var28, var26);
				class370 var30 = new class370();
				var30.field4148 = var25;
				var30.field4165 = var30.field4145 = var29.field4145;
				var30.field4166 = var28.field4146;
				var30.field4146 = var26;
				var30.field4144 = true;
				if (var25 == 12) {
					method3637(var30);
				}
				var29.field4287[var26] = var30;
				if (arg2) {
					Statics.field82 = var30;
				} else {
					Statics.field1715 = var30;
				}
				client.method2809(var29);
				return 1;
			} else {
				throw new RuntimeException();
			}
		} else if (arg0 == 200) {
			Statics.field1570 -= 2;
			int var31 = field660[Statics.field1570];
			int var32 = field660[Statics.field1570 + 1];
			class370 var33 = var32 == -1 ? null : Statics.field1555.method6864(var31, var32);
			method6416(var33, arg2);
			return 1;
		} else if (arg0 == 201) {
			method6416(Statics.field1555.method6863(field660[--Statics.field1570]), arg2);
			return 1;
		} else if (arg0 == 204) {
			class370 var34 = arg2 ? Statics.field82 : Statics.field1715;
			class370 var35 = var34 == null ? null : Statics.field1555.method6864(var34.field4165, var34.field4166);
			method6416(var35, arg2);
			return 1;
		} else if (arg0 == 205) {
			class370 var36 = arg2 ? Statics.field82 : Statics.field1715;
			class370 var37 = var36 == null ? null : Statics.field1555.method6863(var36.field4165);
			method6416(var37, arg2);
			return 1;
		} else if (arg0 == 206) {
			class370 var38 = arg2 ? Statics.field82 : Statics.field1715;
			if (var38 == null) {
				field660[++Statics.field1570 - 1] = 0;
				return 1;
			} else if (var38.field4146 == -1) {
				field660[++Statics.field1570 - 1] = 0;
				return 1;
			} else {
				class370 var39 = Statics.field1555.method6863(var38.field4165);
				class370 var40 = null;
				for (int var41 = var38.field4146 + 1; var41 < var39.field4287.length; var41++) {
					class370 var42 = var39.field4287[var41];
					if (var42 != null && var38.field4166 == var42.field4166) {
						var40 = var42;
						break;
					}
				}
				method6416(var40, arg2);
				return 1;
			}
		} else if (arg0 == 207) {
			class370 var43 = arg2 ? Statics.field82 : Statics.field1715;
			if (var43 == null) {
				field660[++Statics.field1570 - 1] = 0;
				return 1;
			} else if (var43.field4146 == -1) {
				field660[++Statics.field1570 - 1] = 0;
				return 1;
			} else {
				class370 var44 = Statics.field1555.method6863(var43.field4165);
				class370 var45 = null;
				for (int var46 = var43.field4146 - 1; var46 >= 0; var46--) {
					class370 var47 = var44.field4287[var46];
					if (var47 != null && var43.field4166 == var47.field4166) {
						var45 = var47;
						break;
					}
				}
				method6416(var45, arg2);
				return 1;
			}
		} else if (arg0 == 208) {
			class370 var48 = arg2 ? Statics.field82 : Statics.field1715;
			if (var48 == null) {
				field660[++Statics.field1570 - 1] = 0;
				return 1;
			} else if (var48.field4148 == 0) {
				class370 var49 = Statics.field1555.method6863(var48.field4165);
				if (var49.field4287 == null) {
					field660[++Statics.field1570 - 1] = 0;
					return 1;
				}
				int var50 = 0;
				for (int var51 = 0; var51 < var49.field4287.length; var51++) {
					class370 var52 = var49.field4287[var51];
					if (var52 != null && var48.field4146 == var52.field4166) {
						var50++;
					}
				}
				field660[++Statics.field1570 - 1] = var50;
				return 1;
			} else {
				field660[++Statics.field1570 - 1] = 0;
				return 1;
			}
		} else if (arg0 == 209) {
			class370 var53 = arg2 ? Statics.field82 : Statics.field1715;
			field660[++Statics.field1570 - 1] = var53 == null ? -1 : var53.field4166;
			return 1;
		} else if (arg0 == 210) {
			int var54 = field660[--Statics.field1570];
			int var55 = field660[--Statics.field1570];
			Object var56 = method2049(var54);
			int var57 = field660[--Statics.field1570];
			Object var58 = method2049(var55);
			int var59 = field660[--Statics.field1570];
			class209 var60 = class209.method2995(var59);
			Object var61 = var60.method4223() ? var60.field2270 : var60.field2274;
			Object var62 = null;
			if (var57 >= 0) {
				class209 var63 = class209.method2995(var57);
				var62 = var63.method4223() ? var63.field2270 : var63.field2274;
			}
			class370 var64 = Statics.field1555.method6863(field660[--Statics.field1570]);
			class370 var65 = null;
			if (var64 != null && var64.field4287 != null) {
				for (int var66 = 0; var66 < var64.field4287.length; var66++) {
					class370 var67 = var64.field4287[var66];
					if (var67 != null && (var59 < 0 || var67.method7391(var59, var61).equals(var58)) && (var57 < 0 || var67.method7391(var57, var62).equals(var56))) {
						var65 = var67;
						break;
					}
				}
			}
			method6416(var65, arg2);
			return 1;
		} else if (arg0 == 211) {
			Statics.field1570 -= 3;
			int var68 = field660[Statics.field1570];
			class370 var69 = Statics.field1555.method6863(field660[Statics.field1570 + 1]);
			int var70 = field660[Statics.field1570 + 2];
			field666.method7304(var68, var69, var70);
			field660[++Statics.field1570 - 1] = field666.method7291();
			return 1;
		} else if (arg0 == 212) {
			int var71 = field660[--Statics.field1570];
			class370 var72 = arg2 ? Statics.field82 : Statics.field1715;
			if (var72.field4146 == -1) {
				field666.method7304(var71, var72, -1);
			} else {
				field666.method7304(var71, Statics.field1555.method6863(var72.field4165), var72.field4146);
			}
			field660[++Statics.field1570 - 1] = field666.method7291();
			return 1;
		} else if (arg0 == 213) {
			method6416(field666.method7293(), arg2);
			return 1;
		} else if (arg0 == 214) {
			field660[++Statics.field1570 - 1] = field666.method7306();
			return 1;
		} else if (arg0 == 215) {
			field661[++Statics.field659 - 1] = class520.method7905(field666.method7294());
			return 1;
		} else if (arg0 == 216) {
			int var73 = field660[--Statics.field1570];
			Object var74 = method2049(var73);
			int var75 = field660[--Statics.field1570];
			class209 var76 = class209.method2995(var75);
			Object var77 = var76.method4223() ? var76.field2270 : var76.field2274;
			field666.method7295(var75, var74, var77);
			field660[++Statics.field1570 - 1] = field666.method7291();
			return 1;
		} else if (arg0 == 217) {
			int var78 = field660[--Statics.field1570];
			class370 var79 = arg2 ? Statics.field82 : Statics.field1715;
			if (var79 == null) {
				throw new RuntimeException("");
			} else if (var79.field4148 == 0) {
				class370 var80 = Statics.field1555.method6863(var79.field4165);
				if (var80.field4148 != 0) {
					throw new RuntimeException();
				}
				class370 var81 = method5686(var78, var80, var79);
				method6416(var81, arg2);
				return 1;
			} else {
				throw new RuntimeException("");
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("kg.au(ILoi;Loi;I)Loi;")
	public static class370 method5686(int arg0, class370 arg1, class370 arg2) {
		int var3 = 0;
		class370 var4 = null;
		for (int var5 = arg2.field4146 + 1; var5 < arg1.field4287.length; var5++) {
			class370 var6 = arg1.field4287[var5];
			if (var6 != null && arg2.field4146 == var6.field4166) {
				var3++;
				if (var3 - 1 == arg0) {
					var4 = var6;
					break;
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("mc.ai(Loi;ZI)V")
	public static void method6416(class370 arg0, boolean arg1) {
		if (arg0 == null) {
			field660[++Statics.field1570 - 1] = 0;
			return;
		}
		field660[++Statics.field1570 - 1] = 1;
		if (arg1) {
			Statics.field82 = arg0;
		} else {
			Statics.field1715 = arg0;
		}
	}

	@ObfuscatedName("hd.aa(ILcg;ZI)I")
	public static int method3878(int arg0, class56 arg1, boolean arg2) {
		class370 var4;
		if (arg0 >= 2000) {
			arg0 -= 1000;
			int var3 = field660[--Statics.field1570];
			var4 = Statics.field1555.method6863(var3);
		} else {
			var4 = arg2 ? Statics.field82 : Statics.field1715;
		}
		if (arg0 == 1000) {
			Statics.field1570 -= 4;
			var4.field4210 = field660[Statics.field1570];
			var4.field4229 = field660[Statics.field1570 + 1];
			var4.field4151 = field660[Statics.field1570 + 2];
			var4.field4162 = field660[Statics.field1570 + 3];
			client.method2809(var4);
			Statics.field5520.method937(var4);
			if (var4.field4148 == 0) {
				class370[] var5 = var4.field4146 == -1 ? Statics.field1555.field4038[var4.field4145 >> 16] : Statics.field1555.method6863(var4.field4165).field4287;
				client.method332(var5, var4, false);
			}
			return 1;
		} else if (arg0 == 1001) {
			Statics.field1570 -= 4;
			var4.field4157 = field660[Statics.field1570];
			var4.field4158 = field660[Statics.field1570 + 1];
			var4.field4252 = field660[Statics.field1570 + 2];
			var4.field4222 = field660[Statics.field1570 + 3];
			client.method2809(var4);
			Statics.field5520.method937(var4);
			if (var4.field4148 == 0) {
				class370[] var6 = var4.field4146 == -1 ? Statics.field1555.field4038[var4.field4145 >> 16] : Statics.field1555.method6863(var4.field4165).field4287;
				client.method332(var6, var4, false);
			}
			return 1;
		} else if (arg0 == 1003) {
			boolean var7 = field660[--Statics.field1570] == 1;
			if (var4.field4167 != var7) {
				var4.field4167 = var7;
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1005) {
			var4.field4268 = field660[--Statics.field1570] == 1;
			return 1;
		} else if (arg0 == 1006) {
			var4.field4298 = field660[--Statics.field1570] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("pw.am(ILcg;ZI)I")
	public static int method7685(int arg0, class56 arg1, boolean arg2) {
		class370 var4;
		if (arg0 >= 2000) {
			arg0 -= 1000;
			int var3 = field660[--Statics.field1570];
			var4 = Statics.field1555.method6863(var3);
		} else {
			var4 = arg2 ? Statics.field82 : Statics.field1715;
		}
		if (arg0 == 1100) {
			Statics.field1570 -= 2;
			int var5 = field660[Statics.field1570];
			int var6 = field660[Statics.field1570 + 1];
			if (var4.field4148 == 12) {
				class367 var7 = var4.method7358();
				if (var7 != null && var7.method7246(var5, var6)) {
					client.method2809(var4);
				}
			} else {
				var4.field4261 = var5;
				if (var4.field4261 > var4.field4194 - var4.field4161) {
					var4.field4261 = var4.field4194 - var4.field4161;
				}
				if (var4.field4261 < 0) {
					var4.field4261 = 0;
				}
				var4.field4171 = var6;
				if (var4.field4171 > var4.field4173 - var4.field4150) {
					var4.field4171 = var4.field4173 - var4.field4150;
				}
				if (var4.field4171 < 0) {
					var4.field4171 = 0;
				}
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1101) {
			var4.field4174 = field660[--Statics.field1570];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1102) {
			var4.field4178 = field660[--Statics.field1570] == 1;
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1103) {
			var4.field4180 = field660[--Statics.field1570];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1104) {
			var4.field4182 = field660[--Statics.field1570];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1105) {
			var4.field4184 = field660[--Statics.field1570];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1106) {
			var4.field4202 = field660[--Statics.field1570];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1107) {
			var4.field4188 = field660[--Statics.field1570] == 1;
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1108) {
			var4.field4193 = 1;
			var4.field4278 = field660[--Statics.field1570];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1109) {
			Statics.field1570 -= 6;
			var4.field4227 = field660[Statics.field1570];
			var4.field4200 = field660[Statics.field1570 + 1];
			var4.field4201 = field660[Statics.field1570 + 2];
			var4.field4236 = field660[Statics.field1570 + 3];
			var4.field4203 = field660[Statics.field1570 + 4];
			var4.field4204 = field660[Statics.field1570 + 5];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1110) {
			int var8 = field660[--Statics.field1570];
			if (var4.field4197 != var8) {
				var4.field4197 = var8;
				var4.field4285 = 0;
				var4.field4136 = 0;
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1111) {
			var4.field4208 = field660[--Statics.field1570] == 1;
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1112) {
			String var9 = (String) field661[--Statics.field659];
			if (var4.field4148 == 12) {
				class367 var10 = var4.method7358();
				if (var10 != null && var10.method7045()) {
					var10.method6994(var9);
				} else {
					var4.field4212 = var9;
				}
				client.method2809(var4);
			} else if (!var9.equals(var4.field4212)) {
				var4.field4212 = var9;
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1113) {
			var4.field4211 = field660[--Statics.field1570];
			if (var4.field4148 == 12) {
				class367 var11 = var4.method7358();
				if (var11 != null) {
					var11.method7005();
				}
			}
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1114) {
			Statics.field1570 -= 3;
			if (var4.field4148 == 12) {
				class367 var12 = var4.method7358();
				if (var12 != null) {
					var12.method7252(field660[Statics.field1570], field660[Statics.field1570 + 1]);
					var12.method7003(field660[Statics.field1570 + 2]);
				}
			} else {
				var4.field4168 = field660[Statics.field1570];
				var4.field4216 = field660[Statics.field1570 + 1];
				var4.field4214 = field660[Statics.field1570 + 2];
			}
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1115) {
			var4.field4217 = field660[--Statics.field1570] == 1;
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1116) {
			var4.field4189 = field660[--Statics.field1570];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1117) {
			var4.field4135 = field660[--Statics.field1570];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1118) {
			var4.field4191 = field660[--Statics.field1570] == 1;
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1119) {
			var4.field4273 = field660[--Statics.field1570] == 1;
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1120) {
			Statics.field1570 -= 2;
			var4.field4194 = field660[Statics.field1570];
			var4.field4173 = field660[Statics.field1570 + 1];
			client.method2809(var4);
			if (var4.field4148 == 0) {
				class370[] var13 = var4.field4146 == -1 ? Statics.field1555.field4038[var4.field4145 >> 16] : Statics.field1555.method6863(var4.field4165).field4287;
				client.method332(var13, var4, false);
			}
			return 1;
		} else if (arg0 == 1121) {
			client.method3333(var4.field4145, var4.field4146);
			client.field565 = var4;
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1122) {
			var4.field4185 = field660[--Statics.field1570];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1123) {
			var4.field4175 = field660[--Statics.field1570];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1124) {
			var4.field4181 = field660[--Statics.field1570];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1125) {
			int var14 = field660[--Statics.field1570];
			class604 var15 = (class604) class432.method3817(class604.method7860(), var14);
			if (var15 != null) {
				var4.field4179 = var15;
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1126) {
			boolean var16 = field660[--Statics.field1570] == 1;
			var4.field4183 = var16;
			return 1;
		} else if (arg0 == 1127) {
			boolean var17 = field660[--Statics.field1570] == 1;
			var4.field4209 = var17;
			return 1;
		} else if (arg0 == 1129) {
			var4.field4186 = (String) field661[--Statics.field659];
			client.method2809(var4);
			return 1;
		} else if (arg0 == 1130) {
			var4.method7399((String) field661[--Statics.field659], "", Statics.field1508, client.method5916());
			return 1;
		} else if (arg0 == 1131) {
			Statics.field1570 -= 2;
			var4.method7344(field660[Statics.field1570], field660[Statics.field1570 + 1]);
			return 1;
		} else if (arg0 == 1132) {
			var4.method7443((String) field661[--Statics.field659], field660[--Statics.field1570]);
			return 1;
		} else if (arg0 == 1133) {
			Statics.field1570--;
			class361 var18 = var4.method7475();
			if (var18 != null) {
				var18.field4053 = field660[Statics.field1570];
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1134) {
			Statics.field1570--;
			class361 var19 = var4.method7475();
			if (var19 != null) {
				var19.field4054 = field660[Statics.field1570];
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1135) {
			Statics.field659--;
			class367 var20 = var4.method7358();
			if (var20 != null) {
				var4.field4213 = (String) field661[Statics.field659];
			}
			return 1;
		} else if (arg0 == 1136) {
			Statics.field1570--;
			class361 var21 = var4.method7475();
			if (var21 != null) {
				var21.field4056 = field660[Statics.field1570];
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1137) {
			Statics.field1570--;
			class367 var22 = var4.method7358();
			if (var22 != null && var22.method7219(field660[Statics.field1570])) {
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1138) {
			Statics.field1570--;
			class367 var23 = var4.method7358();
			if (var23 != null && var23.method6999(field660[Statics.field1570])) {
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1139) {
			Statics.field1570--;
			class367 var24 = var4.method7358();
			if (var24 != null && var24.method7000(field660[Statics.field1570])) {
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1140) {
			boolean var25 = field660[--Statics.field1570] == 1;
			client.field599.method5671();
			class367 var26 = var4.method7358();
			if (var26 != null && var26.method6992(var25)) {
				if (var25) {
					client.field599.method5678(var4);
				}
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1141) {
			boolean var27 = field660[--Statics.field1570] == 1;
			if (!var27 && client.field599.method5670() == var4) {
				client.field599.method5671();
				client.method2809(var4);
			}
			class367 var28 = var4.method7358();
			if (var28 != null) {
				var28.method6993(var27);
			}
			return 1;
		} else if (arg0 == 1142) {
			Statics.field1570 -= 2;
			class367 var29 = var4.method7358();
			if (var29 != null && var29.method6991(field660[Statics.field1570], field660[Statics.field1570 + 1])) {
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1143) {
			Statics.field1570--;
			class367 var30 = var4.method7358();
			if (var30 != null && var30.method6991(field660[Statics.field1570], field660[Statics.field1570])) {
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1144) {
			Statics.field1570--;
			class367 var31 = var4.method7358();
			if (var31 != null) {
				var31.method7054(field660[Statics.field1570]);
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1145) {
			Statics.field1570--;
			class367 var32 = var4.method7358();
			if (var32 != null) {
				var32.method7052(field660[Statics.field1570]);
			}
			return 1;
		} else if (arg0 == 1146) {
			Statics.field1570--;
			class367 var33 = var4.method7358();
			if (var33 != null) {
				var33.method7103(field660[Statics.field1570]);
			}
			return 1;
		} else if (arg0 == 1147) {
			Statics.field1570--;
			class367 var34 = var4.method7358();
			if (var34 != null) {
				var34.method7057(field660[Statics.field1570]);
				client.method2809(var4);
			}
			return 1;
		} else if (arg0 == 1148) {
			Statics.field1570 -= 2;
			class29 var35 = var4.method7360();
			if (var35 != null) {
				var35.method412(field660[Statics.field1570], field660[Statics.field1570 + 1]);
			}
			return 1;
		} else if (arg0 == 1149) {
			Statics.field1570 -= 2;
			class29 var36 = var4.method7360();
			if (var36 != null) {
				var36.method413((char) field660[Statics.field1570], field660[Statics.field1570 + 1]);
			}
			return 1;
		} else if (arg0 == 1150) {
			var4.method7444((String) field661[--Statics.field659], Statics.field1508);
			return 1;
		} else if (arg0 == 1151) {
			Statics.field659 -= 3;
			String var37 = (String) field661[Statics.field659];
			String var38 = (String) field661[Statics.field659 + 1];
			String var39 = (String) field661[Statics.field659 + 2];
			long var40 = client.method5916();
			long var42 = client.method5703();
			String var44 = client.method8007().method9788(client.method8007().field5616);
			if (var40 != -1L) {
				var37 = var37.replaceAll("%userid%", Long.toString(var40));
			}
			if (var42 != -1L) {
				var37 = var37.replaceAll("%userhash%", Long.toString(var42));
			}
			if (!var44.isEmpty()) {
				var37 = var37.replaceAll("%deviceid%", var44);
			}
			var4.method7319(var37, var38, var39, var44, Long.toString(var42), Statics.field1508);
			return 1;
		} else if (arg0 != 1152) {
			return 2;
		} else if (var4.field4148 == 11) {
			class257 var45 = var4.method7354();
			boolean var46 = var45 != null && var45.method5437() && class266.method5521().method5595(var45.method5441());
			field660[++Statics.field1570 - 1] = var46 ? 1 : 0;
			return 1;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nw.an(ILcg;ZI)I")
	public static int method6793(int arg0, class56 arg1, boolean arg2) {
		class370 var3;
		if (arg0 >= 2000) {
			arg0 -= 1000;
			var3 = Statics.field1555.method6863(field660[--Statics.field1570]);
		} else {
			var3 = arg2 ? Statics.field82 : Statics.field1715;
		}
		client.method2809(var3);
		if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
			Statics.field1570 -= 2;
			int var9 = field660[Statics.field1570];
			int var10 = field660[Statics.field1570 + 1];
			var3.field4283 = var9;
			var3.field4284 = var10;
			class214 var11 = class214.method2737(var9);
			var3.field4201 = var11.field2425;
			var3.field4236 = var11.field2394;
			var3.field4203 = var11.field2393;
			var3.field4227 = var11.field2379;
			var3.field4200 = var11.field2399;
			var3.field4204 = var11.field2431;
			if (arg0 == 1205) {
				var3.field4199 = 0;
			} else if (arg0 == 1212 | var11.field2398 == 1) {
				var3.field4199 = 1;
			} else {
				var3.field4199 = 2;
			}
			if (var3.field4153 > 0) {
				var3.field4204 = var3.field4204 * 32 / var3.field4153;
			} else if (var3.field4157 > 0) {
				var3.field4204 = var3.field4204 * 32 / var3.field4157;
			}
			return 1;
		} else if (arg0 == 1201) {
			var3.field4193 = 2;
			var3.field4278 = field660[--Statics.field1570];
			return 1;
		} else if (arg0 == 1202) {
			var3.field4193 = 3;
			var3.field4278 = Statics.field1109.field936.method6923();
			return 1;
		} else if (arg0 == 1207) {
			boolean var4 = field660[--Statics.field1570] == 1;
			var3.method7364(Statics.field1109.field936, var4);
			return 1;
		} else if (arg0 == 1208) {
			int var5 = field660[--Statics.field1570];
			if (var3.field4207 == null) {
				throw new RuntimeException("");
			}
			var3.field4207.method6928(var5);
			return 1;
		} else if (arg0 == 1209) {
			Statics.field1570 -= 2;
			int var6 = field660[Statics.field1570];
			int var7 = field660[Statics.field1570 + 1];
			if (var3.field4207 == null) {
				throw new RuntimeException("");
			}
			var3.field4207.method6920(var6, var7);
			return 1;
		} else if (arg0 == 1210) {
			int var8 = field660[--Statics.field1570];
			if (var3.field4207 == null) {
				throw new RuntimeException("");
			}
			var3.field4207.method6949(Statics.field1109.field936.field4085, var8);
			return 1;
		} else if (arg0 == 1214) {
			var3.field4193 = 8;
			var3.field4278 = field660[--Statics.field1570];
			return 1;
		} else if (arg0 == 1215) {
			var3.field4193 = 9;
			var3.field4278 = field660[--Statics.field1570];
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ls.ar(ILcg;ZI)I")
	public static int method6324(int arg0, class56 arg1, boolean arg2) {
		boolean var3 = true;
		class370 var4;
		if (arg0 >= 2000) {
			arg0 -= 1000;
			var4 = Statics.field1555.method6863(field660[--Statics.field1570]);
			var3 = false;
		} else {
			var4 = arg2 ? Statics.field82 : Statics.field1715;
		}
		if (arg0 == 1300) {
			int var5 = field660[--Statics.field1570] - 1;
			if (var5 >= 0 && var5 < 32) {
				var4.method7340(var5, (String) field661[--Statics.field659]);
				return 1;
			} else {
				Statics.field659--;
				return 1;
			}
		} else if (arg0 == 1301) {
			Statics.field1570 -= 2;
			int var6 = field660[Statics.field1570];
			int var7 = field660[Statics.field1570 + 1];
			var4.field4232 = Statics.field1555.method6864(var6, var7);
			return 1;
		} else if (arg0 == 1302) {
			var4.field4235 = field660[--Statics.field1570] == 1;
			return 1;
		} else if (arg0 == 1303) {
			var4.field4233 = field660[--Statics.field1570];
			return 1;
		} else if (arg0 == 1304) {
			var4.field4286 = field660[--Statics.field1570];
			return 1;
		} else if (arg0 == 1305) {
			var4.field4228 = (String) field661[--Statics.field659];
			return 1;
		} else if (arg0 == 1306) {
			var4.field4170 = (String) field661[--Statics.field659];
			return 1;
		} else if (arg0 == 1307) {
			var4.field4226 = null;
			var4.field4230 = null;
			return 1;
		} else if (arg0 == 1308) {
			var4.field4149 = field660[--Statics.field1570] == 1;
			return 1;
		} else if (arg0 == 1309) {
			Statics.field1570--;
			return 1;
		} else if (arg0 == 1310) {
			int var8 = field660[--Statics.field1570] - 1;
			if (var8 < 0 || var8 > 9 || var4.field4230 == null) {
				return 1;
			} else {
				var4.field4230[var8] = null;
				return 1;
			}
		} else if (arg0 == 1311) {
			int var9 = field660[--Statics.field1570] - 1;
			int var10 = field660[--Statics.field1570] - 1;
			if (var10 < 0 || var10 > 9 || var9 < 0) {
				throw new RuntimeException();
			}
			var4.method7334(var10, var9, (String) field661[--Statics.field659]);
			return 1;
		} else if (arg0 == 1312) {
			int var11 = field660[--Statics.field1570];
			if (var11 == -1) {
				var4.field4231 = 4;
			} else if (var11 >= 1 && var11 <= 32) {
				var4.field4231 = var11 - 1;
			}
			return 1;
		} else if (arg0 == 1350) {
			byte[] var12 = null;
			byte[] var13 = null;
			if (var3) {
				Statics.field1570 -= 10;
				int var14;
				for (var14 = 0; var14 < 10 && field660[Statics.field1570 + var14] >= 0; var14 += 2) {
				}
				if (var14 > 0) {
					var12 = new byte[var14 / 2];
					var13 = new byte[var14 / 2];
					for (var14 -= 2; var14 >= 0; var14 -= 2) {
						var12[var14 / 2] = (byte) field660[Statics.field1570 + var14];
						var13[var14 / 2] = (byte) field660[Statics.field1570 + var14 + 1];
					}
				}
			} else {
				Statics.field1570 -= 2;
				var12 = new byte[] { (byte) field660[Statics.field1570] };
				var13 = new byte[] { (byte) field660[Statics.field1570 + 1] };
			}
			int var15 = field660[--Statics.field1570] - 1;
			if (var15 < 0 || var15 > 9) {
				throw new RuntimeException();
			}
			method4018(var4, var15, var12, var13);
			return 1;
		} else if (arg0 == 1351) {
			Statics.field1570 -= 2;
			byte var16 = 10;
			byte[] var17 = new byte[] { (byte) field660[Statics.field1570] };
			byte[] var18 = new byte[] { (byte) field660[Statics.field1570 + 1] };
			method4018(var4, var16, var17, var18);
			return 1;
		} else if (arg0 == 1352) {
			Statics.field1570 -= 3;
			int var19 = field660[Statics.field1570] - 1;
			int var20 = field660[Statics.field1570 + 1];
			int var21 = field660[Statics.field1570 + 2];
			if (var19 < 0 || var19 > 9) {
				throw new RuntimeException();
			}
			method3668(var4, var19, var20, var21);
			return 1;
		} else if (arg0 == 1353) {
			byte var22 = 10;
			int var23 = field660[--Statics.field1570];
			int var24 = field660[--Statics.field1570];
			method3668(var4, var22, var23, var24);
			return 1;
		} else if (arg0 == 1354) {
			Statics.field1570--;
			int var25 = field660[Statics.field1570] - 1;
			if (var25 < 0 || var25 > 9) {
				throw new RuntimeException();
			}
			method9178(var4, var25);
			return 1;
		} else if (arg0 == 1355) {
			byte var26 = 10;
			method9178(var4, var26);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hm.ae(Loi;I[B[BI)V")
	public static final void method4018(class370 arg0, int arg1, byte[] arg2, byte[] arg3) {
		if (arg0.field4224 == null) {
			if (arg2 == null) {
				return;
			}
			arg0.field4224 = new byte[11][];
			arg0.field4225 = new byte[11][];
			arg0.field4221 = new int[11];
			arg0.field4234 = new int[11];
		}
		arg0.field4224[arg1] = arg2;
		if (arg2 == null) {
			arg0.field4223 = false;
			for (int var4 = 0; var4 < arg0.field4224.length; var4++) {
				if (arg0.field4224[var4] != null) {
					arg0.field4223 = true;
					break;
				}
			}
		} else {
			arg0.field4223 = true;
		}
		arg0.field4225[arg1] = arg3;
	}

	@ObfuscatedName("fz.ay(Loi;IIII)V")
	public static final void method3668(class370 arg0, int arg1, int arg2, int arg3) {
		if (arg0.field4221 == null) {
			throw new RuntimeException();
		}
		arg0.field4221[arg1] = arg2;
		arg0.field4234[arg1] = arg3;
	}

	@ObfuscatedName("sg.ad(Loi;IB)V")
	public static final void method9178(class370 arg0, int arg1) {
		if (arg0.field4224 == null) {
			throw new RuntimeException();
		}
		if (arg0.field4296 == null) {
			arg0.field4296 = new int[arg0.field4224.length];
		}
		arg0.field4296[arg1] = Integer.MAX_VALUE;
	}

	@ObfuscatedName("mc.ag(ILcg;ZI)I")
	public static int method6417(int arg0, class56 arg1, boolean arg2) {
		class370 var3;
		if (arg0 >= 2000) {
			arg0 -= 1000;
			var3 = Statics.field1555.method6863(field660[--Statics.field1570]);
		} else {
			var3 = arg2 ? Statics.field82 : Statics.field1715;
		}
		String var4 = (String) field661[--Statics.field659];
		int[] var5 = null;
		if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = field660[--Statics.field1570];
			if (var6 > 0) {
				var5 = new int[var6];
				while (var6-- > 0) {
					var5[var6] = field660[--Statics.field1570];
				}
			}
			var4 = var4.substring(0, var4.length() - 1);
		}
		Object[] var7 = new Object[var4.length() + 1];
		for (int var8 = var7.length - 1; var8 >= 1; var8--) {
			switch(var4.charAt(var8 - 1)) {
				case 'W':
				case 'X':
				case 's':
					var7[var8] = field661[--Statics.field659];
					break;
				default:
					var7[var8] = Integer.valueOf(field660[--Statics.field1570]);
			}
		}
		int var9 = field660[--Statics.field1570];
		if (var9 == -1) {
			var7 = null;
		} else {
			var7[0] = Integer.valueOf(var9);
		}
		if (arg0 == 1400) {
			var3.field4239 = var7;
		} else if (arg0 == 1401) {
			var3.field4242 = var7;
		} else if (arg0 == 1402) {
			var3.field4241 = var7;
		} else if (arg0 == 1403) {
			var3.field4243 = var7;
		} else if (arg0 == 1404) {
			var3.field4245 = var7;
		} else if (arg0 == 1405) {
			var3.field4292 = var7;
		} else if (arg0 == 1406) {
			var3.field4190 = var7;
		} else if (arg0 == 1407) {
			var3.field4218 = var7;
			var3.field4251 = var5;
		} else if (arg0 == 1408) {
			var3.field4256 = var7;
		} else if (arg0 == 1409) {
			var3.field4257 = var7;
		} else if (arg0 == 1410) {
			var3.field4289 = var7;
		} else if (arg0 == 1411) {
			var3.field4240 = var7;
		} else if (arg0 == 1412) {
			var3.field4244 = var7;
		} else if (arg0 == 1414) {
			var3.field4305 = var7;
			var3.field4253 = var5;
		} else if (arg0 == 1415) {
			var3.field4254 = var7;
			var3.field4255 = var5;
		} else if (arg0 == 1416) {
			var3.field4248 = var7;
		} else if (arg0 == 1417) {
			var3.field4259 = var7;
		} else if (arg0 == 1418) {
			var3.field4155 = var7;
		} else if (arg0 == 1419) {
			var3.field4152 = var7;
		} else if (arg0 == 1420) {
			var3.field4264 = var7;
		} else if (arg0 == 1421) {
			var3.field4265 = var7;
		} else if (arg0 == 1422) {
			var3.field4297 = var7;
		} else if (arg0 == 1423) {
			var3.field4269 = var7;
		} else if (arg0 == 1424) {
			var3.field4270 = var7;
		} else if (arg0 == 1425) {
			var3.field4272 = var7;
		} else if (arg0 == 1426) {
			var3.field4274 = var7;
		} else if (arg0 == 1427) {
			var3.field4271 = var7;
		} else if (arg0 == 1428) {
			var3.field4281 = var7;
		} else if (arg0 == 1429) {
			var3.field4267 = var7;
		} else if (arg0 == 1430) {
			var3.field4262 = var7;
		} else if (arg0 == 1431) {
			var3.field4160 = var7;
		} else if (arg0 == 1434) {
			var3.field4177 = var7;
		} else if (arg0 == 1435) {
			var3.field4303 = var7;
		} else if (arg0 >= 1436 && arg0 <= 1439) {
			class365 var10 = var3.method7361();
			if (var10 != null) {
				if (arg0 == 1436) {
					var10.field4069 = var7;
				} else if (arg0 == 1437) {
					var10.field4070 = var7;
				} else if (arg0 == 1438) {
					var10.field4071 = var7;
				} else if (arg0 == 1439) {
					var10.field4068 = var7;
				}
			}
		} else {
			return 2;
		}
		var3.field4237 = true;
		return 1;
	}

	@ObfuscatedName("ai.av(ILcg;ZI)I")
	public static int method93(int arg0, class56 arg1, boolean arg2) {
		class370 var3 = arg2 ? Statics.field82 : Statics.field1715;
		if (arg0 == 1500) {
			field660[++Statics.field1570 - 1] = var3.field4159;
			return 1;
		} else if (arg0 == 1501) {
			field660[++Statics.field1570 - 1] = var3.field4205;
			return 1;
		} else if (arg0 == 1502) {
			field660[++Statics.field1570 - 1] = var3.field4161;
			return 1;
		} else if (arg0 == 1503) {
			field660[++Statics.field1570 - 1] = var3.field4150;
			return 1;
		} else if (arg0 == 1504) {
			field660[++Statics.field1570 - 1] = var3.field4167 ? 1 : 0;
			return 1;
		} else if (arg0 == 1505) {
			field660[++Statics.field1570 - 1] = var3.field4165;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("bs.ah(ILcg;ZB)I")
	public static int method409(int arg0, class56 arg1, boolean arg2) {
		class370 var3 = arg2 ? Statics.field82 : Statics.field1715;
		if (arg0 == 1600) {
			field660[++Statics.field1570 - 1] = var3.field4261;
			return 1;
		} else if (arg0 == 1601) {
			field660[++Statics.field1570 - 1] = var3.field4171;
			return 1;
		} else if (arg0 == 1602) {
			if (var3.field4148 == 12) {
				class367 var4 = var3.method7358();
				if (var4 != null) {
					field661[++Statics.field659 - 1] = var4.method7037().method8673();
					return 1;
				}
			}
			field661[++Statics.field659 - 1] = var3.field4212;
			return 1;
		} else if (arg0 == 1603) {
			field660[++Statics.field1570 - 1] = var3.field4194;
			return 1;
		} else if (arg0 == 1604) {
			field660[++Statics.field1570 - 1] = var3.field4173;
			return 1;
		} else if (arg0 == 1605) {
			field660[++Statics.field1570 - 1] = var3.field4204;
			return 1;
		} else if (arg0 == 1606) {
			field660[++Statics.field1570 - 1] = var3.field4201;
			return 1;
		} else if (arg0 == 1607) {
			field660[++Statics.field1570 - 1] = var3.field4203;
			return 1;
		} else if (arg0 == 1608) {
			field660[++Statics.field1570 - 1] = var3.field4236;
			return 1;
		} else if (arg0 == 1609) {
			field660[++Statics.field1570 - 1] = var3.field4180;
			return 1;
		} else if (arg0 == 1610) {
			field660[++Statics.field1570 - 1] = var3.field4181;
			return 1;
		} else if (arg0 == 1611) {
			field660[++Statics.field1570 - 1] = var3.field4174;
			return 1;
		} else if (arg0 == 1612) {
			field660[++Statics.field1570 - 1] = var3.field4175;
			return 1;
		} else if (arg0 == 1613) {
			field660[++Statics.field1570 - 1] = var3.field4179.method34();
			return 1;
		} else if (arg0 == 1614) {
			field660[++Statics.field1570 - 1] = var3.field4209 ? 1 : 0;
			return 1;
		} else {
			if (arg0 == 1617) {
				class361 var5 = var3.method7475();
				field660[++Statics.field1570 - 1] = var5 == null ? 0 : var5.field4053;
			}
			if (arg0 == 1618) {
				class361 var6 = var3.method7475();
				field660[++Statics.field1570 - 1] = var6 == null ? 0 : var6.field4054;
				return 1;
			} else if (arg0 == 1619) {
				class367 var7 = var3.method7358();
				field661[++Statics.field659 - 1] = var7 == null ? "" : var7.method7038().method8673();
				return 1;
			} else if (arg0 == 1620) {
				class361 var8 = var3.method7475();
				field660[++Statics.field1570 - 1] = var8 == null ? 0 : var8.field4056;
				return 1;
			} else if (arg0 == 1621) {
				class367 var9 = var3.method7358();
				field660[++Statics.field1570 - 1] = var9 == null ? 0 : var9.method7164();
				return 1;
			} else if (arg0 == 1622) {
				class367 var10 = var3.method7358();
				field660[++Statics.field1570 - 1] = var10 == null ? 0 : var10.method7049();
				return 1;
			} else if (arg0 == 1623) {
				class367 var11 = var3.method7358();
				field660[++Statics.field1570 - 1] = var11 == null ? 0 : var11.method7050();
				return 1;
			} else if (arg0 == 1624) {
				class367 var12 = var3.method7358();
				field660[++Statics.field1570 - 1] = var12 != null && var12.method7226() ? 1 : 0;
				return 1;
			} else if (arg0 == 1625) {
				class367 var13 = var3.method7358();
				field660[++Statics.field1570 - 1] = var13 != null && var13.method7041() ? 1 : 0;
				return 1;
			} else if (arg0 == 1626) {
				class367 var14 = var3.method7358();
				field661[++Statics.field659 - 1] = var14 == null ? "" : var14.method7183().method8853();
				return 1;
			} else if (arg0 == 1627) {
				class367 var15 = var3.method7358();
				int var16 = var15 == null ? 0 : var15.method7244();
				int var17 = var15 == null ? 0 : var15.method7043();
				field660[++Statics.field1570 - 1] = Math.min(var16, var17);
				field660[++Statics.field1570 - 1] = Math.max(var16, var17);
				return 1;
			} else if (arg0 == 1628) {
				class367 var18 = var3.method7358();
				field660[++Statics.field1570 - 1] = var18 == null ? 0 : var18.method7043();
				return 1;
			} else if (arg0 == 1629) {
				class367 var19 = var3.method7358();
				field660[++Statics.field1570 - 1] = var19 == null ? 0 : var19.method7053();
				return 1;
			} else if (arg0 == 1630) {
				class367 var20 = var3.method7358();
				field660[++Statics.field1570 - 1] = var20 == null ? 0 : var20.method7170();
				return 1;
			} else if (arg0 == 1631) {
				class367 var21 = var3.method7358();
				field660[++Statics.field1570 - 1] = var21 == null ? 0 : var21.method7160();
				return 1;
			} else if (arg0 == 1632) {
				class367 var22 = var3.method7358();
				field660[++Statics.field1570 - 1] = var22 == null ? 0 : var22.method7076();
				return 1;
			} else if (arg0 == 1633) {
				class29 var23 = var3.method7360();
				field660[Statics.field1570 - 1] = var23 == null ? 0 : var23.method414(field660[Statics.field1570 - 1]);
				return 1;
			} else if (arg0 == 1634) {
				class29 var24 = var3.method7360();
				field660[Statics.field1570 - 1] = var24 == null ? 0 : var24.method415((char) field660[Statics.field1570 - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("bd.ab(ILcg;ZI)I")
	public static int method468(int arg0, class56 arg1, boolean arg2) {
		class370 var3 = arg2 ? Statics.field82 : Statics.field1715;
		if (arg0 == 1700) {
			field660[++Statics.field1570 - 1] = var3.field4283;
			return 1;
		} else if (arg0 == 1701) {
			if (var3.field4283 == -1) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = var3.field4284;
			}
			return 1;
		} else if (arg0 == 1702) {
			field660[++Statics.field1570 - 1] = var3.field4146;
			return 1;
		} else if (arg0 == 1703) {
			int var4 = field660[--Statics.field1570];
			class209 var5 = class209.method2995(var4);
			if (var5.method4223()) {
				field661[++Statics.field659 - 1] = var3.method7391(var4, var5.field2270);
			} else {
				field660[++Statics.field1570 - 1] = var3.method7338(var4, var5.field2274);
			}
			return 1;
		} else if (arg0 == 1704) {
			int var6 = field660[--Statics.field1570];
			Object var7 = method2049(var6);
			int var8 = field660[--Statics.field1570];
			var3.method7339(var8, var7);
			return 1;
		} else if (arg0 == 1707) {
			field660[++Statics.field1570 - 1] = var3.method7487() ? 1 : 0;
			return 1;
		} else if (arg0 == 1708) {
			return method6467(var3);
		} else if (arg0 == 1709) {
			return Statics.method3859(var3);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("mw.ax(Loi;I)I")
	public static int method6467(class370 arg0) {
		if (arg0.field4148 == 11) {
			String var1 = (String) field661[--Statics.field659];
			field660[++Statics.field1570 - 1] = arg0.method7348(var1);
			return 1;
		} else {
			Statics.field659--;
			field660[++Statics.field1570 - 1] = -1;
			return 1;
		}
	}

	@ObfuscatedName("cs.aj(ILcg;ZI)I")
	public static int method2483(int arg0, class56 arg1, boolean arg2) {
		class370 var3 = arg2 ? Statics.field82 : Statics.field1715;
		if (arg0 == 1800) {
			field660[++Statics.field1570 - 1] = Statics.method9749(client.method7519(var3));
			return 1;
		} else if (arg0 == 1801) {
			int var4 = field660[--Statics.field1570];
			int var5 = var4 - 1;
			if (var3.field4226 == null || var5 >= var3.field4226.length || var3.field4226[var5] == null) {
				field661[++Statics.field659 - 1] = "";
			} else {
				field661[++Statics.field659 - 1] = var3.field4226[var5];
			}
			return 1;
		} else if (arg0 == 1802) {
			if (var3.field4228 == null) {
				field661[++Statics.field659 - 1] = "";
			} else {
				field661[++Statics.field659 - 1] = var3.field4228;
			}
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("dc.az(ILcg;ZB)I")
	public static int method2734(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 1927 || arg0 == 2927) {
			if (field671 >= 10) {
				throw new RuntimeException();
			}
			class370 var18;
			if (arg0 >= 2000) {
				var18 = Statics.field1555.method6863(field660[--Statics.field1570]);
			} else {
				var18 = arg2 ? Statics.field82 : Statics.field1715;
			}
			if (var18.field4271 == null) {
				return 0;
			}
			class66 var19 = new class66();
			var19.field894 = var18;
			var19.field899 = var18.field4271;
			var19.field903 = field671 + 1;
			client.field435.method8033(var19);
			return 1;
		} else if (arg0 == 1928) {
			class370 var3 = arg2 ? Statics.field82 : Statics.field1715;
			int var4 = field660[--Statics.field1570];
			if (var4 < 1 || var4 > 10) {
				throw new RuntimeException();
			}
			class84 var5 = new class84(var4, var3.field4145, var3.field4146, var3.field4283);
			field670.add(var5);
			return 1;
		} else if (arg0 == 2928) {
			Statics.field1570 -= 3;
			int var6 = field660[Statics.field1570];
			int var7 = field660[Statics.field1570 + 1];
			int var8 = field660[Statics.field1570 + 2];
			if (var8 < 1 || var8 > 10) {
				throw new RuntimeException();
			}
			class370 var9 = Statics.field1555.method6864(var6, var7);
			if (var9 == null) {
				throw new RuntimeException();
			}
			class84 var10 = new class84(var8, var6, var7, var9.field4283);
			field670.add(var10);
			return 1;
		} else if (arg0 == 2929) {
			Object[] var11 = method6322();
			Statics.field1570 -= 3;
			int var12 = field660[Statics.field1570];
			int var13 = field660[Statics.field1570 + 1];
			int var14 = field660[Statics.field1570 + 2];
			boolean var15 = true;
			class370 var16 = Statics.field1555.method6864(var13, var14);
			if (var16 == null) {
				throw new RuntimeException();
			}
			int var17 = var16.field4283;
			client.method5048(var13, var14, var17, var12, var11);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("lr.bt(I)[Ljava/lang/Object;")
	public static Object[] method6322() {
		String var0 = (String) field661[--Statics.field659];
		Object[] var1 = new Object[var0.length()];
		for (int var2 = var0.length() - 1; var2 >= 0; var2--) {
			if (var0.charAt(var2) == 'i') {
				var1[var2] = field660[--Statics.field1570];
			} else {
				var1[var2] = field661[--Statics.field659];
			}
		}
		return var1;
	}

	@ObfuscatedName("bo.bs(ILcg;ZB)I")
	public static int method499(int arg0, class56 arg1, boolean arg2) {
		class370 var3 = Statics.field1555.method6863(field660[--Statics.field1570]);
		if (arg0 == 2500) {
			field660[++Statics.field1570 - 1] = var3.field4159;
			return 1;
		} else if (arg0 == 2501) {
			field660[++Statics.field1570 - 1] = var3.field4205;
			return 1;
		} else if (arg0 == 2502) {
			field660[++Statics.field1570 - 1] = var3.field4161;
			return 1;
		} else if (arg0 == 2503) {
			field660[++Statics.field1570 - 1] = var3.field4150;
			return 1;
		} else if (arg0 == 2504) {
			field660[++Statics.field1570 - 1] = var3.field4167 ? 1 : 0;
			return 1;
		} else if (arg0 == 2505) {
			field660[++Statics.field1570 - 1] = var3.field4165;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("bw.bu(ILcg;ZI)I")
	public static int method1862(int arg0, class56 arg1, boolean arg2) {
		class370 var3 = Statics.field1555.method6863(field660[--Statics.field1570]);
		if (arg0 == 2600) {
			field660[++Statics.field1570 - 1] = var3.field4261;
			return 1;
		} else if (arg0 == 2601) {
			field660[++Statics.field1570 - 1] = var3.field4171;
			return 1;
		} else if (arg0 == 2602) {
			field661[++Statics.field659 - 1] = var3.field4212;
			return 1;
		} else if (arg0 == 2603) {
			field660[++Statics.field1570 - 1] = var3.field4194;
			return 1;
		} else if (arg0 == 2604) {
			field660[++Statics.field1570 - 1] = var3.field4173;
			return 1;
		} else if (arg0 == 2605) {
			field660[++Statics.field1570 - 1] = var3.field4204;
			return 1;
		} else if (arg0 == 2606) {
			field660[++Statics.field1570 - 1] = var3.field4201;
			return 1;
		} else if (arg0 == 2607) {
			field660[++Statics.field1570 - 1] = var3.field4203;
			return 1;
		} else if (arg0 == 2608) {
			field660[++Statics.field1570 - 1] = var3.field4236;
			return 1;
		} else if (arg0 == 2609) {
			field660[++Statics.field1570 - 1] = var3.field4180;
			return 1;
		} else if (arg0 == 2610) {
			field660[++Statics.field1570 - 1] = var3.field4181;
			return 1;
		} else if (arg0 == 2611) {
			field660[++Statics.field1570 - 1] = var3.field4174;
			return 1;
		} else if (arg0 == 2612) {
			field660[++Statics.field1570 - 1] = var3.field4175;
			return 1;
		} else if (arg0 == 2613) {
			field660[++Statics.field1570 - 1] = var3.field4179.method34();
			return 1;
		} else if (arg0 == 2614) {
			field660[++Statics.field1570 - 1] = var3.field4209 ? 1 : 0;
			return 1;
		} else {
			if (arg0 == 2617) {
				class361 var4 = var3.method7475();
				field660[++Statics.field1570 - 1] = var4 == null ? 0 : var4.field4053;
			}
			if (arg0 == 2618) {
				class361 var5 = var3.method7475();
				field660[++Statics.field1570 - 1] = var5 == null ? 0 : var5.field4054;
				return 1;
			} else if (arg0 == 2619) {
				class367 var6 = var3.method7358();
				field661[++Statics.field659 - 1] = var6 == null ? "" : var6.method7038().method8673();
				return 1;
			} else if (arg0 == 2620) {
				class361 var7 = var3.method7475();
				field660[++Statics.field1570 - 1] = var7 == null ? 0 : var7.field4056;
				return 1;
			} else if (arg0 == 2621) {
				class367 var8 = var3.method7358();
				field660[++Statics.field1570 - 1] = var8 == null ? 0 : var8.method7164();
				return 1;
			} else if (arg0 == 2622) {
				class367 var9 = var3.method7358();
				field660[++Statics.field1570 - 1] = var9 == null ? 0 : var9.method7049();
				return 1;
			} else if (arg0 == 2623) {
				class367 var10 = var3.method7358();
				field660[++Statics.field1570 - 1] = var10 == null ? 0 : var10.method7050();
				return 1;
			} else if (arg0 == 2624) {
				class367 var11 = var3.method7358();
				field660[++Statics.field1570 - 1] = var11 != null && var11.method7226() ? 1 : 0;
				return 1;
			} else if (arg0 == 2625) {
				class367 var12 = var3.method7358();
				field660[++Statics.field1570 - 1] = var12 != null && var12.method7041() ? 1 : 0;
				return 1;
			} else if (arg0 == 2626) {
				class367 var13 = var3.method7358();
				field661[++Statics.field659 - 1] = var13 == null ? "" : var13.method7183().method8853();
				return 1;
			} else if (arg0 == 2627) {
				class367 var14 = var3.method7358();
				int var15 = var14 == null ? 0 : var14.method7244();
				int var16 = var14 == null ? 0 : var14.method7043();
				field660[++Statics.field1570 - 1] = Math.min(var15, var16);
				field660[++Statics.field1570 - 1] = Math.max(var15, var16);
				return 1;
			} else if (arg0 == 2628) {
				class367 var17 = var3.method7358();
				field660[++Statics.field1570 - 1] = var17 == null ? 0 : var17.method7043();
				return 1;
			} else if (arg0 == 2629) {
				class367 var18 = var3.method7358();
				field660[++Statics.field1570 - 1] = var18 == null ? 0 : var18.method7053();
				return 1;
			} else if (arg0 == 2630) {
				class367 var19 = var3.method7358();
				field660[++Statics.field1570 - 1] = var19 == null ? 0 : var19.method7170();
				return 1;
			} else if (arg0 == 2631) {
				class367 var20 = var3.method7358();
				field660[++Statics.field1570 - 1] = var20 == null ? 0 : var20.method7160();
				return 1;
			} else if (arg0 == 2632) {
				class367 var21 = var3.method7358();
				field660[++Statics.field1570 - 1] = var21 == null ? 0 : var21.method7076();
				return 1;
			} else if (arg0 == 2633) {
				class29 var22 = var3.method7360();
				field660[Statics.field1570 - 1] = var22 == null ? 0 : var22.method414(field660[Statics.field1570 - 1]);
				return 1;
			} else if (arg0 == 2634) {
				class29 var23 = var3.method7360();
				field660[Statics.field1570 - 1] = var23 == null ? 0 : var23.method415((char) field660[Statics.field1570 - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("sc.bi(ILcg;ZI)I")
	public static int method8976(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 2700) {
			class370 var3 = Statics.field1555.method6863(field660[--Statics.field1570]);
			field660[++Statics.field1570 - 1] = var3.field4283;
			return 1;
		} else if (arg0 == 2701) {
			class370 var4 = Statics.field1555.method6863(field660[--Statics.field1570]);
			if (var4.field4283 == -1) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = var4.field4284;
			}
			return 1;
		} else if (arg0 == 2702) {
			int var5 = field660[--Statics.field1570];
			class65 var6 = (class65) client.field423.method7973((long) var5);
			if (var6 == null) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = 1;
			}
			return 1;
		} else if (arg0 == 2703) {
			Statics.field1570 -= 3;
			int var7 = field660[Statics.field1570];
			class370 var8 = Statics.field1555.method6864(field660[Statics.field1570 + 1], field660[Statics.field1570 + 2]);
			class209 var9 = class209.method2995(var7);
			if (var9.method4223()) {
				field661[++Statics.field659 - 1] = var8.method7391(var7, var9.field2270);
			} else {
				field660[++Statics.field1570 - 1] = var8.method7338(var7, var9.field2274);
			}
			return 1;
		} else if (arg0 == 2704) {
			Statics.field1570 -= 3;
			class370 var10 = Statics.field1555.method6864(field660[Statics.field1570], field660[Statics.field1570 + 1]);
			int var11 = field660[Statics.field1570 + 2];
			Object var12 = method2049(var11);
			int var13 = field660[--Statics.field1570];
			var10.method7339(var13, var12);
			return 1;
		} else if (arg0 == 2706) {
			field660[++Statics.field1570 - 1] = client.field422;
			return 1;
		} else if (arg0 == 2707) {
			class370 var14 = Statics.field1555.method6863(field660[--Statics.field1570]);
			field660[++Statics.field1570 - 1] = var14.method7487() ? 1 : 0;
			return 1;
		} else if (arg0 == 2708) {
			class370 var15 = Statics.field1555.method6863(field660[--Statics.field1570]);
			return method6467(var15);
		} else if (arg0 == 2709) {
			class370 var16 = Statics.field1555.method6863(field660[--Statics.field1570]);
			return Statics.method3859(var16);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("cf.bd(ILcg;ZI)I")
	public static int method1951(int arg0, class56 arg1, boolean arg2) {
		class370 var3 = Statics.field1555.method6863(field660[--Statics.field1570]);
		if (arg0 == 2800) {
			field660[++Statics.field1570 - 1] = Statics.method9749(client.method7519(var3));
			return 1;
		} else if (arg0 == 2801) {
			int var4 = field660[--Statics.field1570];
			int var5 = var4 - 1;
			if (var3.field4226 == null || var5 >= var3.field4226.length || var3.field4226[var5] == null) {
				field661[++Statics.field659 - 1] = "";
			} else {
				field661[++Statics.field659 - 1] = var3.field4226[var5];
			}
			return 1;
		} else if (arg0 == 2802) {
			if (var3.field4228 == null) {
				field661[++Statics.field659 - 1] = "";
			} else {
				field661[++Statics.field659 - 1] = var3.field4228;
			}
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("vf.ba(ILcg;ZI)I")
	public static int method10032(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 3100) {
			String var3 = (String) field661[--Statics.field659];
			class92.method2825(0, "", var3);
			return 1;
		} else if (arg0 == 3101) {
			Statics.field1570 -= 2;
			client.method3768(Statics.field1109, field660[Statics.field1570], field660[Statics.field1570 + 1]);
			return 1;
		} else if (arg0 == 3103) {
			if (!field653) {
				field668 = true;
			}
			return 1;
		} else if (arg0 == 3104) {
			String var4 = (String) field661[--Statics.field659];
			int var5 = 0;
			if (class446.method1561(var4)) {
				var5 = class446.method4011(var4);
			}
			class330 var6 = class330.method3456(class328.field3628, client.field315.field1309);
			var6.field3665.method10547(var5);
			client.field315.method2874(var6);
			return 1;
		} else if (arg0 == 3105) {
			String var7 = (String) field661[--Statics.field659];
			class330 var8 = class330.method3456(class328.field3637, client.field315.field1309);
			var8.field3665.method10320(var7.length() + 1);
			var8.field3665.method10504(var7);
			client.field315.method2874(var8);
			return 1;
		} else if (arg0 == 3106) {
			String var9 = (String) field661[--Statics.field659];
			class330 var10 = class330.method3456(class328.field3587, client.field315.field1309);
			var10.field3665.method10320(var9.length() + 1);
			var10.field3665.method10504(var9);
			client.field315.method2874(var10);
			return 1;
		} else if (arg0 == 3107) {
			int var11 = field660[--Statics.field1570];
			String var12 = (String) field661[--Statics.field659];
			client.method6340(var11, var12);
			return 1;
		} else if (arg0 == 3108) {
			Statics.field1570 -= 3;
			int var13 = field660[Statics.field1570];
			int var14 = field660[Statics.field1570 + 1];
			int var15 = field660[Statics.field1570 + 2];
			class370 var16 = Statics.field1555.method6863(var15);
			client.method10274(var16, var13, var14);
			return 1;
		} else if (arg0 == 3109) {
			Statics.field1570 -= 2;
			int var17 = field660[Statics.field1570];
			int var18 = field660[Statics.field1570 + 1];
			class370 var19 = arg2 ? Statics.field82 : Statics.field1715;
			client.method10274(var19, var17, var18);
			return 1;
		} else if (arg0 == 3110) {
			Statics.field5059 = field660[--Statics.field1570] == 1;
			return 1;
		} else if (arg0 == 3111) {
			field660[++Statics.field1570 - 1] = Statics.field240.method2623() ? 1 : 0;
			return 1;
		} else if (arg0 == 3112) {
			Statics.field240.method2507(field660[--Statics.field1570] == 1);
			return 1;
		} else if (arg0 == 3113) {
			String var20 = (String) field661[--Statics.field659];
			boolean var21 = field660[--Statics.field1570] == 1;
			class32.method325(var20, var21, false);
			return 1;
		} else if (arg0 == 3115) {
			int var22 = field660[--Statics.field1570];
			class330 var23 = class330.method3456(class328.field3592, client.field315.field1309);
			var23.field3665.method10321(var22);
			client.field315.method2874(var23);
			return 1;
		} else if (arg0 == 3116) {
			int var24 = field660[--Statics.field1570];
			Statics.field659 -= 2;
			String var25 = (String) field661[Statics.field659];
			String var26 = (String) field661[Statics.field659 + 1];
			if (var25.length() > 500) {
				return 1;
			} else if (var26.length() > 500) {
				return 1;
			} else {
				class330 var27 = class330.method3456(class328.field3613, client.field315.field1309);
				var27.field3665.method10321(class591.method5971(var25) + 1 + class591.method5971(var26));
				var27.field3665.method10504(var26);
				var27.field3665.method10372(var24);
				var27.field3665.method10504(var25);
				client.field315.method2874(var27);
				return 1;
			}
		} else if (arg0 == 3117) {
			Statics.field1570--;
			return 1;
		} else if (arg0 == 3118) {
			client.field528 = field660[--Statics.field1570] == 1;
			return 1;
		} else if (arg0 == 3119) {
			client.field392 = field660[--Statics.field1570] == 1;
			return 1;
		} else if (arg0 == 3120) {
			if (field660[--Statics.field1570] == 1) {
				client.field351 |= 0x1;
			} else {
				client.field351 &= 0xFFFFFFFE;
			}
			return 1;
		} else if (arg0 == 3121) {
			if (field660[--Statics.field1570] == 1) {
				client.field351 |= 0x2;
			} else {
				client.field351 &= 0xFFFFFFFD;
			}
			return 1;
		} else if (arg0 == 3122) {
			if (field660[--Statics.field1570] == 1) {
				client.field351 |= 0x4;
			} else {
				client.field351 &= 0xFFFFFFFB;
			}
			return 1;
		} else if (arg0 == 3123) {
			if (field660[--Statics.field1570] == 1) {
				client.field351 |= 0x8;
			} else {
				client.field351 &= 0xFFFFFFF7;
			}
			return 1;
		} else if (arg0 == 3124) {
			client.field351 = 0;
			return 1;
		} else if (arg0 == 3125) {
			client.field500 = field660[--Statics.field1570] == 1;
			return 1;
		} else if (arg0 == 3126) {
			client.field343 = field660[--Statics.field1570] == 1;
			return 1;
		} else if (arg0 == 3127) {
			client.method4518(field660[--Statics.field1570] == 1);
			return 1;
		} else if (arg0 == 3128) {
			field660[++Statics.field1570 - 1] = client.method6331() ? 1 : 0;
			return 1;
		} else if (arg0 == 3129) {
			Statics.field1570 -= 2;
			client.field339 = field660[Statics.field1570];
			client.field340 = field660[Statics.field1570 + 1];
			return 1;
		} else if (arg0 == 3130) {
			Statics.field1570 -= 2;
			return 1;
		} else if (arg0 == 3131) {
			Statics.field1570--;
			return 1;
		} else if (arg0 == 3132) {
			field660[++Statics.field1570 - 1] = Statics.field208;
			field660[++Statics.field1570 - 1] = Statics.field4810;
			return 1;
		} else if (arg0 == 3133) {
			Statics.field1570--;
			return 1;
		} else if (arg0 == 3134) {
			return 1;
		} else if (arg0 == 3135) {
			Statics.field1570 -= 2;
			return 1;
		} else if (arg0 == 3136) {
			client.field325 = 3;
			client.field574 = field660[--Statics.field1570];
			return 1;
		} else if (arg0 == 3137) {
			client.field325 = 2;
			client.field574 = field660[--Statics.field1570];
			return 1;
		} else if (arg0 == 3138) {
			client.field325 = 0;
			return 1;
		} else if (arg0 == 3139) {
			client.field325 = 1;
			return 1;
		} else if (arg0 == 3140) {
			client.field325 = 3;
			client.field574 = arg2 ? Statics.field82.field4145 : Statics.field1715.field4145;
			return 1;
		} else if (arg0 == 3141) {
			boolean var28 = field660[--Statics.field1570] == 1;
			Statics.field240.method2509(var28);
			return 1;
		} else if (arg0 == 3142) {
			field660[++Statics.field1570 - 1] = Statics.field240.method2508() ? 1 : 0;
			return 1;
		} else if (arg0 == 3143) {
			boolean var29 = field660[--Statics.field1570] == 1;
			client.field332 = var29;
			if (!var29) {
				Statics.field240.method2539("");
			}
			return 1;
		} else if (arg0 == 3144) {
			field660[++Statics.field1570 - 1] = client.field332 ? 1 : 0;
			return 1;
		} else if (arg0 == 3145) {
			return 1;
		} else if (arg0 == 3146) {
			boolean var30 = field660[--Statics.field1570] == 1;
			Statics.field240.method2511(!var30);
			return 1;
		} else if (arg0 == 3147) {
			field660[++Statics.field1570 - 1] = Statics.field240.method2510() ? 0 : 1;
			return 1;
		} else if (arg0 == 3148) {
			return 1;
		} else if (arg0 == 3149) {
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3150) {
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3151) {
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3152) {
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3153) {
			field660[++Statics.field1570 - 1] = class53.field734;
			return 1;
		} else if (arg0 == 3154) {
			field660[++Statics.field1570 - 1] = client.method9742();
			return 1;
		} else if (arg0 == 3155) {
			Statics.field659--;
			return 1;
		} else if (arg0 == 3156) {
			return 1;
		} else if (arg0 == 3157) {
			Statics.field1570 -= 2;
			return 1;
		} else if (arg0 == 3158) {
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3159) {
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3160) {
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3161) {
			Statics.field1570--;
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3162) {
			Statics.field1570--;
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3163) {
			Statics.field659--;
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3164) {
			Statics.field1570--;
			field661[++Statics.field659 - 1] = "";
			return 1;
		} else if (arg0 == 3165) {
			Statics.field1570--;
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3166) {
			Statics.field1570 -= 2;
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3167) {
			Statics.field1570 -= 2;
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3168) {
			Statics.field1570 -= 2;
			field661[++Statics.field659 - 1] = "";
			field661[++Statics.field659 - 1] = "";
			field661[++Statics.field659 - 1] = "";
			field661[++Statics.field659 - 1] = "";
			field661[++Statics.field659 - 1] = "";
			field661[++Statics.field659 - 1] = "";
			field661[++Statics.field659 - 1] = "";
			field661[++Statics.field659 - 1] = "";
			field661[++Statics.field659 - 1] = "";
			return 1;
		} else if (arg0 == 3169) {
			return 1;
		} else if (arg0 == 3170) {
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3171) {
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3172) {
			Statics.field1570--;
			return 1;
		} else if (arg0 == 3173) {
			Statics.field1570--;
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3174) {
			Statics.field1570--;
			return 1;
		} else if (arg0 == 3175) {
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 3176) {
			return 1;
		} else if (arg0 == 3177) {
			return 1;
		} else if (arg0 == 3178) {
			Statics.field659--;
			return 1;
		} else if (arg0 == 3179) {
			return 1;
		} else if (arg0 == 3180) {
			Statics.field659--;
			return 1;
		} else if (arg0 == 3181) {
			client.method8260(field660[--Statics.field1570]);
			return 1;
		} else if (arg0 == 3182) {
			field660[++Statics.field1570 - 1] = client.method4008();
			return 1;
		} else if (arg0 == 3185) {
			int var31 = field660[--Statics.field1570];
			Statics.field240.method2506(var31);
			return 1;
		} else if (arg0 == 3186) {
			int var32 = Statics.field240.method2536();
			field660[++Statics.field1570 - 1] = var32;
			return 1;
		} else if (arg0 == 3189) {
			int var33 = field660[--Statics.field1570];
			client.method9417(var33);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hw.bb(ILcg;ZI)I")
	public static int method4090(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 3200) {
			Statics.field1570 -= 3;
			class59.method10185(field660[Statics.field1570], field660[Statics.field1570 + 1], field660[Statics.field1570 + 2]);
			return 1;
		} else if (arg0 == 3201) {
			Statics.field1570 -= 5;
			int var3 = field660[Statics.field1570];
			int var4 = field660[Statics.field1570 + 1];
			int var5 = field660[Statics.field1570 + 2];
			int var6 = field660[Statics.field1570 + 3];
			int var7 = field660[Statics.field1570 + 4];
			ArrayList var8 = new ArrayList();
			var8.add(var3);
			client.method10142(var8, var4, var5, var6, var7);
			return 1;
		} else if (arg0 == 3202) {
			Statics.field1570 -= 2;
			client.method3821(field660[Statics.field1570], field660[Statics.field1570 + 1]);
			return 1;
		} else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
			class69 var50 = class69.field928;
			class68 var51 = class68.field921;
			int var52 = field660[--Statics.field1570];
			if (arg0 == 3212) {
				int var53 = field660[--Statics.field1570];
				var50 = (class69) class432.method3817(class69.method37(), var53);
				if (var50 == null) {
					throw new RuntimeException(String.format("Unrecognized device option %d", var53));
				}
			}
			if (arg0 == 3213) {
				int var54 = field660[--Statics.field1570];
				var51 = (class68) class432.method3817(class68.method6768(), var54);
				if (var51 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", var54));
				}
			}
			if (arg0 == 3209) {
				int var55 = field660[--Statics.field1570];
				var50 = (class69) class432.method3817(class69.method37(), var55);
				if (var50 == null) {
					var51 = (class68) class432.method3817(class68.method6768(), var55);
					if (var51 == null) {
						throw new RuntimeException(String.format("Unrecognized client option %d", var55));
					}
				}
			} else if (arg0 == 3181) {
				var50 = class69.field929;
			} else if (arg0 == 3203) {
				var51 = class68.field917;
			} else if (arg0 == 3205) {
				var51 = class68.field923;
			} else if (arg0 == 3207) {
				var51 = class68.field915;
			}
			if (class68.field921 == var51) {
				switch(var50.field931) {
					case 1:
						Statics.field240.method2509(var52 == 1);
						break;
					case 2:
						Statics.field240.method2511(var52 == 1);
						break;
					case 3:
						Statics.field240.method2514(var52 == 1);
						break;
					case 4:
						if (var52 < 0) {
							var52 = 0;
						}
						Statics.field240.method2516(var52);
						break;
					case 5:
						client.method8260(var52);
						break;
					case 6:
						Statics.field240.method2619(var52 == 1);
						break;
					default:
						String var56 = String.format("Unkown device option: %s.", var50);
						throw new RuntimeException(var56);
				}
			} else {
				switch(var51.field920) {
					case 1:
						Statics.field240.method2507(var52 == 1);
						break;
					case 2:
						int var62 = Math.min(Math.max(var52, 0), 100);
						int var63 = Math.round((float) (var62 * 255) / 100.0F);
						client.method5115(var63);
						break;
					case 3:
						int var60 = Math.min(Math.max(var52, 0), 100);
						int var61 = Math.round((float) (var60 * 127) / 100.0F);
						client.method5664(var61);
						break;
					case 4:
						int var58 = Math.min(Math.max(var52, 0), 100);
						int var59 = Math.round((float) (var58 * 127) / 100.0F);
						client.method10040(var59);
						break;
					default:
						String var57 = String.format("Unkown game option: %s.", var51);
						throw new RuntimeException(var57);
				}
			}
			return 1;
		} else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
			class69 var38 = class69.field928;
			class68 var39 = class68.field921;
			boolean var40 = false;
			if (arg0 == 3214) {
				int var41 = field660[--Statics.field1570];
				var38 = (class69) class432.method3817(class69.method37(), var41);
				if (var38 == null) {
					throw new RuntimeException(String.format("Unrecognized device option %d", var41));
				}
			}
			if (arg0 == 3215) {
				int var42 = field660[--Statics.field1570];
				var39 = (class68) class432.method3817(class68.method6768(), var42);
				if (var39 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", var42));
				}
			}
			if (arg0 == 3210) {
				int var43 = field660[--Statics.field1570];
				var38 = (class69) class432.method3817(class69.method37(), var43);
				if (var38 == null) {
					var39 = (class68) class432.method3817(class68.method6768(), var43);
					if (var39 == null) {
						throw new RuntimeException(String.format("Unrecognized client option %d", var43));
					}
				}
			} else if (arg0 == 3182) {
				var38 = class69.field929;
			} else if (arg0 == 3204) {
				var39 = class68.field917;
			} else if (arg0 == 3206) {
				var39 = class68.field923;
			} else if (arg0 == 3208) {
				var39 = class68.field915;
			}
			int var45;
			if (class68.field921 == var39) {
				switch(var38.field931) {
					case 1:
						var45 = Statics.field240.method2508() ? 1 : 0;
						break;
					case 2:
						var45 = Statics.field240.method2510() ? 1 : 0;
						break;
					case 3:
						var45 = Statics.field240.method2513() ? 1 : 0;
						break;
					case 4:
						var45 = Statics.field240.method2567();
						break;
					case 5:
						var45 = client.method4008();
						break;
					case 6:
						var45 = Statics.field240.method2537() ? 1 : 0;
						break;
					default:
						String var44 = String.format("Unkown device option: %s.", var38);
						throw new RuntimeException(var44);
				}
			} else {
				switch(var39.field920) {
					case 1:
						var45 = Statics.field240.method2623() ? 1 : 0;
						break;
					case 2:
						int var49 = Statics.field240.method2519();
						var45 = Math.round((float) (var49 * 100) / 255.0F);
						break;
					case 3:
						int var48 = Statics.field240.method2569();
						var45 = Math.round((float) (var48 * 100) / 127.0F);
						break;
					case 4:
						int var47 = Statics.field240.method2624();
						var45 = Math.round((float) (var47 * 100) / 127.0F);
						break;
					default:
						String var46 = String.format("Unkown game option: %s.", var39);
						throw new RuntimeException(var46);
				}
			}
			field660[++Statics.field1570 - 1] = var45;
			return 1;
		} else if (arg0 == 3211) {
			return 1;
		} else if (arg0 == 3216) {
			int var9 = field660[--Statics.field1570];
			int var10 = 0;
			class69 var11 = (class69) class432.method3817(class69.method37(), var9);
			if (var11 != null) {
				var10 = class69.field928 == var11 ? 0 : 1;
			}
			field660[++Statics.field1570 - 1] = var10;
			return 1;
		} else if (arg0 == 3218) {
			int var12 = field660[--Statics.field1570];
			int var13 = 0;
			class68 var14 = (class68) class432.method3817(class68.method6768(), var12);
			if (var14 != null) {
				var13 = class68.field921 == var14 ? 0 : 1;
			}
			field660[++Statics.field1570 - 1] = var13;
			return 1;
		} else if (arg0 == 3217 || arg0 == 3219) {
			class69 var28 = class69.field928;
			class68 var29 = class68.field921;
			boolean var30 = true;
			boolean var31 = true;
			if (arg0 == 3217) {
				int var32 = field660[--Statics.field1570];
				var28 = (class69) class432.method3817(class69.method37(), var32);
				if (var28 == null) {
					throw new RuntimeException(String.format("Unrecognized device option %d", var32));
				}
			}
			if (arg0 == 3219) {
				int var33 = field660[--Statics.field1570];
				var29 = (class68) class432.method3817(class68.method6768(), var33);
				if (var29 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", var33));
				}
			}
			byte var35;
			int var36;
			if (class68.field921 == var29) {
				switch(var28.field931) {
					case 1:
					case 2:
					case 3:
						var35 = 0;
						var36 = 1;
						break;
					case 4:
						var35 = 0;
						var36 = Integer.MAX_VALUE;
						break;
					case 5:
						var35 = 0;
						var36 = 100;
						break;
					default:
						String var34 = String.format("Unkown device option: %s.", var28);
						throw new RuntimeException(var34);
				}
			} else {
				switch(var29.field920) {
					case 1:
						var35 = 0;
						var36 = 1;
						break;
					case 2:
					case 3:
					case 4:
						var35 = 0;
						var36 = 100;
						break;
					default:
						String var37 = String.format("Unkown game option: %s.", var29);
						throw new RuntimeException(var37);
				}
			}
			field660[++Statics.field1570 - 1] = var35;
			field660[++Statics.field1570 - 1] = var36;
			return 1;
		} else if (arg0 == 3220) {
			Statics.field1570 -= 2;
			int var15 = field660[Statics.field1570];
			int var16 = field660[Statics.field1570 + 1];
			class340.method5500(var15, var16);
			return 1;
		} else if (arg0 == 3221) {
			Statics.field1570 -= 6;
			int var17 = field660[Statics.field1570];
			int var18 = field660[Statics.field1570 + 1];
			int var19 = field660[Statics.field1570 + 2];
			int var20 = field660[Statics.field1570 + 3];
			int var21 = field660[Statics.field1570 + 4];
			int var22 = field660[Statics.field1570 + 5];
			ArrayList var23 = new ArrayList();
			var23.add(var17);
			var23.add(var18);
			client.method10142(var23, var19, var20, var21, var22);
			return 1;
		} else if (arg0 == 3222) {
			Statics.field1570 -= 4;
			int var24 = field660[Statics.field1570];
			int var25 = field660[Statics.field1570 + 1];
			int var26 = field660[Statics.field1570 + 2];
			int var27 = field660[Statics.field1570 + 3];
			class340.method3815(var24, var25, var26, var27);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fj.bo(ILcg;ZI)I")
	public static int method3594(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 3300) {
			field660[++Statics.field1570 - 1] = client.field413;
			return 1;
		} else if (arg0 == 3301) {
			Statics.field1570 -= 2;
			int var3 = field660[Statics.field1570];
			int var4 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = class63.method7518(var3, var4);
			return 1;
		} else if (arg0 == 3302) {
			Statics.field1570 -= 2;
			int var5 = field660[Statics.field1570];
			int var6 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = class63.method3519(var5, var6);
			return 1;
		} else if (arg0 == 3303) {
			Statics.field1570 -= 2;
			int var7 = field660[Statics.field1570];
			int var8 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = class63.method4089(var7, var8);
			return 1;
		} else if (arg0 == 3304) {
			int var9 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class178.method1954(var9).field1962;
			return 1;
		} else if (arg0 == 3305) {
			int var10 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field540[var10];
			return 1;
		} else if (arg0 == 3306) {
			int var11 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field403[var11];
			return 1;
		} else if (arg0 == 3307) {
			int var12 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field354[var12];
			return 1;
		} else if (arg0 == 3308) {
			int var13 = Statics.field3837.field1171;
			int var14 = (Statics.field1109.field1056 >> 7) + Statics.field3837.field1165;
			int var15 = (Statics.field1109.field1057 >> 7) + Statics.field3837.field1166;
			field660[++Statics.field1570 - 1] = class357.method6851(var13, var14, var15);
			return 1;
		} else if (arg0 == 3309) {
			int var16 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = Statics.method6814(var16);
			return 1;
		} else if (arg0 == 3310) {
			int var17 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class357.method6803(var17);
			return 1;
		} else if (arg0 == 3311) {
			int var18 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class357.method6805(var18);
			return 1;
		} else if (arg0 == 3312) {
			field660[++Statics.field1570 - 1] = client.field327 ? 1 : 0;
			return 1;
		} else if (arg0 == 3313) {
			Statics.field1570 -= 2;
			int var19 = field660[Statics.field1570] + 32768;
			int var20 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = class63.method7518(var19, var20);
			return 1;
		} else if (arg0 == 3314) {
			Statics.field1570 -= 2;
			int var21 = field660[Statics.field1570] + 32768;
			int var22 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = class63.method3519(var21, var22);
			return 1;
		} else if (arg0 == 3315) {
			Statics.field1570 -= 2;
			int var23 = field660[Statics.field1570] + 32768;
			int var24 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = class63.method4089(var23, var24);
			return 1;
		} else if (arg0 == 3316) {
			if (client.field429 >= 2) {
				field660[++Statics.field1570 - 1] = client.field429;
			} else {
				field660[++Statics.field1570 - 1] = 0;
			}
			return 1;
		} else if (arg0 == 3317) {
			field660[++Statics.field1570 - 1] = client.field374;
			return 1;
		} else if (arg0 == 3318) {
			field660[++Statics.field1570 - 1] = client.field326;
			return 1;
		} else if (arg0 == 3321) {
			field660[++Statics.field1570 - 1] = client.field593 / 100;
			return 1;
		} else if (arg0 == 3322) {
			field660[++Statics.field1570 - 1] = client.field491;
			return 1;
		} else if (arg0 == 3323) {
			if (client.field431) {
				field660[++Statics.field1570 - 1] = 1;
			} else {
				field660[++Statics.field1570 - 1] = 0;
			}
			return 1;
		} else if (arg0 == 3324) {
			field660[++Statics.field1570 - 1] = client.field386;
			return 1;
		} else if (arg0 == 3325) {
			Statics.field1570 -= 4;
			int var25 = field660[Statics.field1570];
			int var26 = field660[Statics.field1570 + 1];
			int var27 = field660[Statics.field1570 + 2];
			int var28 = field660[Statics.field1570 + 3];
			int var29 = class357.method6851(var27, var26, var28);
			field660[++Statics.field1570 - 1] = var25 + var29;
			return 1;
		} else if (arg0 == 3326) {
			field660[++Statics.field1570 - 1] = client.field387;
			return 1;
		} else if (arg0 == 3327) {
			field660[++Statics.field1570 - 1] = client.field397;
			return 1;
		} else if (arg0 == 3331) {
			field660[++Statics.field1570 - 1] = client.field593;
			return 1;
		} else if (arg0 == 3332) {
			int var30 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field616[var30];
			return 1;
		} else if (arg0 == 3333) {
			field661[++Statics.field659 - 1] = client.field346;
			return 1;
		} else if (arg0 == 3339) {
			int var31 = field660[--Statics.field1570];
			if (var31 == -1) {
				field661[++Statics.field659 - 1] = "";
			} else {
				class204 var32 = class204.method3677(var31);
				field661[++Statics.field659 - 1] = var32 == null ? "" : var32.field2234;
			}
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("sw.bl(ILcg;ZI)I")
	public static int method8992(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 3400) {
			Statics.field1570 -= 2;
			int var3 = field660[Statics.field1570];
			int var4 = field660[Statics.field1570 + 1];
			class191 var5 = class191.method3914(var3);
			if (var5.field2069 != 's') {
			}
			for (int var6 = 0; var6 < var5.field2076; var6++) {
				if (var5.field2073[var6] == var4) {
					field661[++Statics.field659 - 1] = var5.field2075[var6];
					var5 = null;
					break;
				}
			}
			if (var5 != null) {
				field661[++Statics.field659 - 1] = var5.field2070;
			}
			return 1;
		} else if (arg0 == 3408) {
			Statics.field1570 -= 4;
			int var7 = field660[Statics.field1570];
			int var8 = field660[Statics.field1570 + 1];
			int var9 = field660[Statics.field1570 + 2];
			int var10 = field660[Statics.field1570 + 3];
			class191 var11 = class191.method3914(var9);
			if (var11.field2068 != var7 || var11.field2069 != var8) {
				if (var8 == 115) {
					field661[++Statics.field659 - 1] = class394.field4507;
				} else {
					field660[++Statics.field1570 - 1] = 0;
				}
				return 1;
			}
			for (int var12 = 0; var12 < var11.field2076; var12++) {
				if (var11.field2073[var12] == var10) {
					if (var8 == 115) {
						field661[++Statics.field659 - 1] = var11.field2075[var12];
					} else {
						field660[++Statics.field1570 - 1] = var11.field2074[var12];
					}
					var11 = null;
					break;
				}
			}
			if (var11 != null) {
				if (var8 == 115) {
					field661[++Statics.field659 - 1] = var11.field2070;
				} else {
					field660[++Statics.field1570 - 1] = var11.field2072;
				}
			}
			return 1;
		} else if (arg0 == 3411) {
			int var13 = field660[--Statics.field1570];
			class191 var14 = class191.method3914(var13);
			field660[++Statics.field1570 - 1] = var14.method3992();
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("bh.by(ILcg;ZB)I")
	public static int method784(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 3500) {
			int var3 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field552.method5701(var3) ? 1 : 0;
			return 1;
		} else if (arg0 == 3501) {
			int var4 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field552.method5692(var4) ? 1 : 0;
			return 1;
		} else if (arg0 == 3502) {
			int var5 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field552.method5693(var5) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hb.bg(ILcg;ZI)I")
	public static int method4213(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 3600) {
			if (Statics.field280.field649 == 0) {
				field660[++Statics.field1570 - 1] = -2;
			} else if (Statics.field280.field649 == 1) {
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = Statics.field280.field643.method9263();
			}
			return 1;
		} else if (arg0 == 3601) {
			int var3 = field660[--Statics.field1570];
			if (Statics.field280.method1506() && var3 >= 0 && var3 < Statics.field280.field643.method9263()) {
				class497 var4 = (class497) Statics.field280.field643.method9273(var3);
				field661[++Statics.field659 - 1] = var4.method9241();
				field661[++Statics.field659 - 1] = var4.method9243();
			} else {
				field661[++Statics.field659 - 1] = "";
				field661[++Statics.field659 - 1] = "";
			}
			return 1;
		} else if (arg0 == 3602) {
			int var5 = field660[--Statics.field1570];
			if (Statics.field280.method1506() && var5 >= 0 && var5 < Statics.field280.field643.method9263()) {
				field660[++Statics.field1570 - 1] = ((class504) Statics.field280.field643.method9273(var5)).field5412;
			} else {
				field660[++Statics.field1570 - 1] = 0;
			}
			return 1;
		} else if (arg0 == 3603) {
			int var6 = field660[--Statics.field1570];
			if (Statics.field280.method1506() && var6 >= 0 && var6 < Statics.field280.field643.method9263()) {
				field660[++Statics.field1570 - 1] = ((class504) Statics.field280.field643.method9273(var6)).field5413;
			} else {
				field660[++Statics.field1570 - 1] = 0;
			}
			return 1;
		} else if (arg0 == 3604) {
			String var7 = (String) field661[--Statics.field659];
			int var8 = field660[--Statics.field1570];
			class46.method2629(var7, var8);
			return 1;
		} else if (arg0 == 3605) {
			String var9 = (String) field661[--Statics.field659];
			Statics.field280.method1513(var9);
			return 1;
		} else if (arg0 == 3606) {
			String var10 = (String) field661[--Statics.field659];
			Statics.field280.method1538(var10);
			return 1;
		} else if (arg0 == 3607) {
			String var11 = (String) field661[--Statics.field659];
			Statics.field280.method1508(var11);
			return 1;
		} else if (arg0 == 3608) {
			String var12 = (String) field661[--Statics.field659];
			boolean var13 = true;
			Statics.field280.method1518(var12, var13);
			return 1;
		} else if (arg0 == 3609) {
			String var14 = (String) field661[--Statics.field659];
			String var15 = client.method35(var14);
			field660[++Statics.field1570 - 1] = Statics.field280.method1511(new class614(var15, Statics.field1293), false) ? 1 : 0;
			return 1;
		} else if (arg0 == 3611) {
			if (Statics.field91 == null) {
				field661[++Statics.field659 - 1] = "";
			} else {
				field661[++Statics.field659 - 1] = Statics.field91.field5380;
			}
			return 1;
		} else if (arg0 == 3612) {
			if (Statics.field91 == null) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = Statics.field91.method9263();
			}
			return 1;
		} else if (arg0 == 3613) {
			int var16 = field660[--Statics.field1570];
			if (Statics.field91 == null || var16 >= Statics.field91.method9263()) {
				field661[++Statics.field659 - 1] = "";
			} else {
				field661[++Statics.field659 - 1] = Statics.field91.method9273(var16).method9244().method11022();
			}
			return 1;
		} else if (arg0 == 3614) {
			int var17 = field660[--Statics.field1570];
			if (Statics.field91 == null || var17 >= Statics.field91.method9263()) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = ((class504) Statics.field91.method9273(var17)).method9330();
			}
			return 1;
		} else if (arg0 == 3615) {
			int var18 = field660[--Statics.field1570];
			if (Statics.field91 == null || var18 >= Statics.field91.method9263()) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = ((class504) Statics.field91.method9273(var18)).field5413;
			}
			return 1;
		} else if (arg0 == 3616) {
			field660[++Statics.field1570 - 1] = Statics.field91 == null ? 0 : Statics.field91.field5381;
			return 1;
		} else if (arg0 == 3617) {
			String var19 = (String) field661[--Statics.field659];
			client.method3587(var19);
			return 1;
		} else if (arg0 == 3618) {
			field660[++Statics.field1570 - 1] = Statics.field91 == null ? 0 : Statics.field91.field5382;
			return 1;
		} else if (arg0 == 3619) {
			String var20 = (String) field661[--Statics.field659];
			client.method324(var20);
			return 1;
		} else if (arg0 == 3620) {
			client.method3865();
			return 1;
		} else if (arg0 == 3621) {
			if (Statics.field280.method1506()) {
				field660[++Statics.field1570 - 1] = Statics.field280.field646.method9263();
			} else {
				field660[++Statics.field1570 - 1] = -1;
			}
			return 1;
		} else if (arg0 == 3622) {
			int var21 = field660[--Statics.field1570];
			if (Statics.field280.method1506() && var21 >= 0 && var21 < Statics.field280.field646.method9263()) {
				class503 var22 = (class503) Statics.field280.field646.method9273(var21);
				field661[++Statics.field659 - 1] = var22.method9241();
				field661[++Statics.field659 - 1] = var22.method9243();
			} else {
				field661[++Statics.field659 - 1] = "";
				field661[++Statics.field659 - 1] = "";
			}
			return 1;
		} else if (arg0 == 3623) {
			String var23 = (String) field661[--Statics.field659];
			String var24 = client.method35(var23);
			field660[++Statics.field1570 - 1] = Statics.field280.method1512(new class614(var24, Statics.field1293)) ? 1 : 0;
			return 1;
		} else if (arg0 == 3624) {
			int var25 = field660[--Statics.field1570];
			if (Statics.field91 == null || var25 >= Statics.field91.method9263() || !Statics.field91.method9273(var25).method9244().equals(Statics.field1109.field935)) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = 1;
			}
			return 1;
		} else if (arg0 == 3625) {
			if (Statics.field91 == null || Statics.field91.field5377 == null) {
				field661[++Statics.field659 - 1] = "";
			} else {
				field661[++Statics.field659 - 1] = Statics.field91.field5377;
			}
			return 1;
		} else if (arg0 == 3626) {
			int var26 = field660[--Statics.field1570];
			if (Statics.field91 == null || var26 >= Statics.field91.method9263() || !((class499) Statics.field91.method9273(var26)).method9229()) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = 1;
			}
			return 1;
		} else if (arg0 == 3627) {
			int var27 = field660[--Statics.field1570];
			if (Statics.field91 == null || var27 >= Statics.field91.method9263() || !((class499) Statics.field91.method9273(var27)).method9227()) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = 1;
			}
			return 1;
		} else if (arg0 == 3628) {
			Statics.field280.field643.method9282();
			return 1;
		} else if (arg0 == 3629) {
			boolean var28 = field660[--Statics.field1570] == 1;
			Statics.field280.field643.method9283(new class597(var28));
			return 1;
		} else if (arg0 == 3630) {
			boolean var29 = field660[--Statics.field1570] == 1;
			Statics.field280.field643.method9283(new class598(var29));
			return 1;
		} else if (arg0 == 3631) {
			boolean var30 = field660[--Statics.field1570] == 1;
			Statics.field280.field643.method9283(new class127(var30));
			return 1;
		} else if (arg0 == 3632) {
			boolean var31 = field660[--Statics.field1570] == 1;
			Statics.field280.field643.method9283(new class123(var31));
			return 1;
		} else if (arg0 == 3633) {
			boolean var32 = field660[--Statics.field1570] == 1;
			Statics.field280.field643.method9283(new class126(var32));
			return 1;
		} else if (arg0 == 3634) {
			boolean var33 = field660[--Statics.field1570] == 1;
			Statics.field280.field643.method9283(new class131(var33));
			return 1;
		} else if (arg0 == 3635) {
			boolean var34 = field660[--Statics.field1570] == 1;
			Statics.field280.field643.method9283(new class125(var34));
			return 1;
		} else if (arg0 == 3636) {
			boolean var35 = field660[--Statics.field1570] == 1;
			Statics.field280.field643.method9283(new class124(var35));
			return 1;
		} else if (arg0 == 3637) {
			boolean var36 = field660[--Statics.field1570] == 1;
			Statics.field280.field643.method9283(new class128(var36));
			return 1;
		} else if (arg0 == 3638) {
			boolean var37 = field660[--Statics.field1570] == 1;
			Statics.field280.field643.method9283(new class129(var37));
			return 1;
		} else if (arg0 == 3639) {
			Statics.field280.field643.method9295();
			return 1;
		} else if (arg0 == 3640) {
			Statics.field280.field646.method9282();
			return 1;
		} else if (arg0 == 3641) {
			boolean var38 = field660[--Statics.field1570] == 1;
			Statics.field280.field646.method9283(new class597(var38));
			return 1;
		} else if (arg0 == 3642) {
			boolean var39 = field660[--Statics.field1570] == 1;
			Statics.field280.field646.method9283(new class598(var39));
			return 1;
		} else if (arg0 == 3643) {
			Statics.field280.field646.method9295();
			return 1;
		} else if (arg0 == 3644) {
			if (Statics.field91 != null) {
				Statics.field91.method9282();
			}
			return 1;
		} else if (arg0 == 3645) {
			boolean var40 = field660[--Statics.field1570] == 1;
			if (Statics.field91 != null) {
				Statics.field91.method9283(new class597(var40));
			}
			return 1;
		} else if (arg0 == 3646) {
			boolean var41 = field660[--Statics.field1570] == 1;
			if (Statics.field91 != null) {
				Statics.field91.method9283(new class598(var41));
			}
			return 1;
		} else if (arg0 == 3647) {
			boolean var42 = field660[--Statics.field1570] == 1;
			if (Statics.field91 != null) {
				Statics.field91.method9283(new class127(var42));
			}
			return 1;
		} else if (arg0 == 3648) {
			boolean var43 = field660[--Statics.field1570] == 1;
			if (Statics.field91 != null) {
				Statics.field91.method9283(new class123(var43));
			}
			return 1;
		} else if (arg0 == 3649) {
			boolean var44 = field660[--Statics.field1570] == 1;
			if (Statics.field91 != null) {
				Statics.field91.method9283(new class126(var44));
			}
			return 1;
		} else if (arg0 == 3650) {
			boolean var45 = field660[--Statics.field1570] == 1;
			if (Statics.field91 != null) {
				Statics.field91.method9283(new class131(var45));
			}
			return 1;
		} else if (arg0 == 3651) {
			boolean var46 = field660[--Statics.field1570] == 1;
			if (Statics.field91 != null) {
				Statics.field91.method9283(new class125(var46));
			}
			return 1;
		} else if (arg0 == 3652) {
			boolean var47 = field660[--Statics.field1570] == 1;
			if (Statics.field91 != null) {
				Statics.field91.method9283(new class124(var47));
			}
			return 1;
		} else if (arg0 == 3653) {
			boolean var48 = field660[--Statics.field1570] == 1;
			if (Statics.field91 != null) {
				Statics.field91.method9283(new class128(var48));
			}
			return 1;
		} else if (arg0 == 3654) {
			boolean var49 = field660[--Statics.field1570] == 1;
			if (Statics.field91 != null) {
				Statics.field91.method9283(new class129(var49));
			}
			return 1;
		} else if (arg0 == 3655) {
			if (Statics.field91 != null) {
				Statics.field91.method9295();
			}
			return 1;
		} else if (arg0 == 3656) {
			boolean var50 = field660[--Statics.field1570] == 1;
			Statics.field280.field643.method9283(new class130(var50));
			return 1;
		} else if (arg0 == 3657) {
			boolean var51 = field660[--Statics.field1570] == 1;
			if (Statics.field91 != null) {
				Statics.field91.method9283(new class130(var51));
			}
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("pl.bx(ILcg;ZI)I")
	public static int method7643(int arg0, class56 arg1, boolean arg2) {
		return 2;
	}

	@ObfuscatedName("sn.bq(ILcg;ZI)I")
	public static int method9106(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 3800) {
			if (Statics.field5334 == null) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = 1;
				Statics.field2806 = Statics.field5334;
			}
			return 1;
		} else if (arg0 == 3801) {
			int var3 = field660[--Statics.field1570];
			if (client.field366[var3] == null) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = 1;
				Statics.field2806 = client.field366[var3];
			}
			return 1;
		} else if (arg0 == 3802) {
			field661[++Statics.field659 - 1] = Statics.field2806.field1861;
			return 1;
		} else if (arg0 == 3803) {
			field660[++Statics.field1570 - 1] = Statics.field2806.field1848 ? 1 : 0;
			return 1;
		} else if (arg0 == 3804) {
			field660[++Statics.field1570 - 1] = Statics.field2806.field1851;
			return 1;
		} else if (arg0 == 3805) {
			field660[++Statics.field1570 - 1] = Statics.field2806.field1847;
			return 1;
		} else if (arg0 == 3806) {
			field660[++Statics.field1570 - 1] = Statics.field2806.field1853;
			return 1;
		} else if (arg0 == 3807) {
			field660[++Statics.field1570 - 1] = Statics.field2806.field1854;
			return 1;
		} else if (arg0 == 3809) {
			field660[++Statics.field1570 - 1] = Statics.field2806.field1855;
			return 1;
		} else if (arg0 == 3810) {
			int var4 = field660[--Statics.field1570];
			field661[++Statics.field659 - 1] = Statics.field2806.field1865[var4];
			return 1;
		} else if (arg0 == 3811) {
			int var5 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = Statics.field2806.field1857[var5];
			return 1;
		} else if (arg0 == 3812) {
			field660[++Statics.field1570 - 1] = Statics.field2806.field1863;
			return 1;
		} else if (arg0 == 3813) {
			int var6 = field660[--Statics.field1570];
			field661[++Statics.field659 - 1] = Statics.field2806.field1867[var6];
			return 1;
		} else if (arg0 == 3814) {
			Statics.field1570 -= 3;
			int var7 = field660[Statics.field1570];
			int var8 = field660[Statics.field1570 + 1];
			int var9 = field660[Statics.field1570 + 2];
			field660[++Statics.field1570 - 1] = Statics.field2806.method3718(var7, var8, var9);
			return 1;
		} else if (arg0 == 3815) {
			field660[++Statics.field1570 - 1] = Statics.field2806.field1866;
			return 1;
		} else if (arg0 == 3816) {
			field660[++Statics.field1570 - 1] = Statics.field2806.field1862;
			return 1;
		} else if (arg0 == 3817) {
			field660[++Statics.field1570 - 1] = Statics.field2806.method3696((String) field661[--Statics.field659]);
			return 1;
		} else if (arg0 == 3818) {
			field660[Statics.field1570 - 1] = Statics.field2806.method3695()[field660[Statics.field1570 - 1]];
			return 1;
		} else if (arg0 == 3819) {
			Statics.field1570 -= 2;
			int var10 = field660[Statics.field1570];
			int var11 = field660[Statics.field1570 + 1];
			client.method7558(var11, var10);
			return 1;
		} else if (arg0 == 3820) {
			int var12 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = Statics.field2806.field1859[var12];
			return 1;
		} else {
			if (arg0 == 3821) {
				Statics.field1570 -= 3;
				int var13 = field660[Statics.field1570];
				boolean var14 = field660[Statics.field1570 + 1] == 1;
				int var15 = field660[Statics.field1570 + 2];
				client.method9490(var15, var13, var14);
			}
			if (arg0 == 3822) {
				int var16 = field660[--Statics.field1570];
				field660[++Statics.field1570 - 1] = Statics.field2806.field1860[var16] ? 1 : 0;
				return 1;
			} else if (arg0 == 3850) {
				if (Statics.field1230 == null) {
					field660[++Statics.field1570 - 1] = 0;
				} else {
					field660[++Statics.field1570 - 1] = 1;
					Statics.field1835 = Statics.field1230;
				}
				return 1;
			} else if (arg0 == 3851) {
				int var17 = field660[--Statics.field1570];
				if (client.field583[var17] == null) {
					field660[++Statics.field1570 - 1] = 0;
				} else {
					field660[++Statics.field1570 - 1] = 1;
					Statics.field1835 = client.field583[var17];
					Statics.field1837 = var17;
				}
				return 1;
			} else if (arg0 == 3852) {
				field661[++Statics.field659 - 1] = Statics.field1835.field1920;
				return 1;
			} else if (arg0 == 3853) {
				field660[++Statics.field1570 - 1] = Statics.field1835.field1922;
				return 1;
			} else if (arg0 == 3854) {
				field660[++Statics.field1570 - 1] = Statics.field1835.field1918;
				return 1;
			} else if (arg0 == 3855) {
				field660[++Statics.field1570 - 1] = Statics.field1835.method3801();
				return 1;
			} else if (arg0 == 3856) {
				int var18 = field660[--Statics.field1570];
				field661[++Statics.field659 - 1] = ((class154) Statics.field1835.field1919.get(var18)).field1780.method11022();
				return 1;
			} else if (arg0 == 3857) {
				int var19 = field660[--Statics.field1570];
				field660[++Statics.field1570 - 1] = ((class154) Statics.field1835.field1919.get(var19)).field1783;
				return 1;
			} else if (arg0 == 3858) {
				int var20 = field660[--Statics.field1570];
				field660[++Statics.field1570 - 1] = ((class154) Statics.field1835.field1919.get(var20)).field1782;
				return 1;
			} else if (arg0 == 3859) {
				int var21 = field660[--Statics.field1570];
				client.method2847(Statics.field1837, var21);
				return 1;
			} else if (arg0 == 3860) {
				field660[++Statics.field1570 - 1] = Statics.field1835.method3795((String) field661[--Statics.field659]);
				return 1;
			} else if (arg0 == 3861) {
				field660[Statics.field1570 - 1] = Statics.field1835.method3796()[field660[Statics.field1570 - 1]];
				return 1;
			} else if (arg0 == 3890) {
				field660[++Statics.field1570 - 1] = Statics.field3086 == null ? 0 : 1;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("dh.bz(ILcg;ZI)I")
	public static int method2803(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 3903) {
			int var3 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field381[var3].method7866();
			return 1;
		} else if (arg0 == 3904) {
			int var4 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field381[var4].field5040;
			return 1;
		} else if (arg0 == 3905) {
			int var5 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field381[var5].field5041;
			return 1;
		} else if (arg0 == 3906) {
			int var6 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field381[var6].field5042;
			return 1;
		} else if (arg0 == 3907) {
			int var7 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field381[var7].field5043;
			return 1;
		} else if (arg0 == 3908) {
			int var8 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.field381[var8].field5039;
			return 1;
		} else if (arg0 == 3910) {
			int var9 = field660[--Statics.field1570];
			int var10 = client.field381[var9].method7864();
			field660[++Statics.field1570 - 1] = var10 == 0 ? 1 : 0;
			return 1;
		} else if (arg0 == 3911) {
			int var11 = field660[--Statics.field1570];
			int var12 = client.field381[var11].method7864();
			field660[++Statics.field1570 - 1] = var12 == 2 ? 1 : 0;
			return 1;
		} else if (arg0 == 3912) {
			int var13 = field660[--Statics.field1570];
			int var14 = client.field381[var13].method7864();
			field660[++Statics.field1570 - 1] = var14 == 5 ? 1 : 0;
			return 1;
		} else if (arg0 == 3913) {
			int var15 = field660[--Statics.field1570];
			int var16 = client.field381[var15].method7864();
			field660[++Statics.field1570 - 1] = var16 == 1 ? 1 : 0;
			return 1;
		} else if (arg0 == 3914) {
			boolean var17 = field660[--Statics.field1570] == 1;
			if (Statics.field5306 != null) {
				Statics.field5306.method7817(class415.field5014, var17);
			}
			return 1;
		} else if (arg0 == 3915) {
			boolean var18 = field660[--Statics.field1570] == 1;
			if (Statics.field5306 != null) {
				Statics.field5306.method7817(class415.field5013, var18);
			}
			return 1;
		} else if (arg0 == 3916) {
			Statics.field1570 -= 2;
			boolean var19 = field660[Statics.field1570] == 1;
			boolean var20 = field660[Statics.field1570 + 1] == 1;
			if (Statics.field5306 != null) {
				client.field382.field286 = var20;
				Statics.field5306.method7817(client.field382, var19);
			}
			return 1;
		} else if (arg0 == 3917) {
			boolean var21 = field660[--Statics.field1570] == 1;
			if (Statics.field5306 != null) {
				Statics.field5306.method7817(class415.field5012, var21);
			}
			return 1;
		} else if (arg0 == 3918) {
			boolean var22 = field660[--Statics.field1570] == 1;
			if (Statics.field5306 != null) {
				Statics.field5306.method7817(class415.field5016, var22);
			}
			return 1;
		} else if (arg0 == 3919) {
			field660[++Statics.field1570 - 1] = Statics.field5306 == null ? 0 : Statics.field5306.field5015.size();
			return 1;
		} else if (arg0 == 3920) {
			int var23 = field660[--Statics.field1570];
			class421 var24 = (class421) Statics.field5306.field5015.get(var23);
			field660[++Statics.field1570 - 1] = var24.field5034;
			return 1;
		} else if (arg0 == 3921) {
			int var25 = field660[--Statics.field1570];
			class421 var26 = (class421) Statics.field5306.field5015.get(var25);
			field661[++Statics.field659 - 1] = var26.method7852();
			return 1;
		} else if (arg0 == 3922) {
			int var27 = field660[--Statics.field1570];
			class421 var28 = (class421) Statics.field5306.field5015.get(var27);
			field661[++Statics.field659 - 1] = var28.method7851();
			return 1;
		} else if (arg0 == 3923) {
			int var29 = field660[--Statics.field1570];
			class421 var30 = (class421) Statics.field5306.field5015.get(var29);
			long var31 = class335.method3987() - Statics.field4312 - var30.field5038;
			int var33 = (int) (var31 / 3600000L);
			int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
			int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
			String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
			field661[++Statics.field659 - 1] = var36;
			return 1;
		} else if (arg0 == 3924) {
			int var37 = field660[--Statics.field1570];
			class421 var38 = (class421) Statics.field5306.field5015.get(var37);
			field660[++Statics.field1570 - 1] = var38.field5033.field5042;
			return 1;
		} else if (arg0 == 3925) {
			int var39 = field660[--Statics.field1570];
			class421 var40 = (class421) Statics.field5306.field5015.get(var39);
			field660[++Statics.field1570 - 1] = var40.field5033.field5041;
			return 1;
		} else if (arg0 == 3926) {
			int var41 = field660[--Statics.field1570];
			class421 var42 = (class421) Statics.field5306.field5015.get(var41);
			field660[++Statics.field1570 - 1] = var42.field5033.field5040;
			return 1;
		} else if (arg0 == 3939) {
			int var43 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class214.method2737(var43).field2419 ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("bz.bn(ILcg;ZI)I")
	public static int method761(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 4000) {
			Statics.field1570 -= 2;
			int var3 = field660[Statics.field1570];
			int var4 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var3 + var4;
			return 1;
		} else if (arg0 == 4001) {
			Statics.field1570 -= 2;
			int var5 = field660[Statics.field1570];
			int var6 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var5 - var6;
			return 1;
		} else if (arg0 == 4002) {
			Statics.field1570 -= 2;
			int var7 = field660[Statics.field1570];
			int var8 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var7 * var8;
			return 1;
		} else if (arg0 == 4003) {
			Statics.field1570 -= 2;
			int var9 = field660[Statics.field1570];
			int var10 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var9 / var10;
			return 1;
		} else if (arg0 == 4004) {
			int var11 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = (int) (Math.random() * (double) var11);
			return 1;
		} else if (arg0 == 4005) {
			int var12 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = (int) (Math.random() * (double) (var12 + 1));
			return 1;
		} else if (arg0 == 4006) {
			Statics.field1570 -= 5;
			int var13 = field660[Statics.field1570];
			int var14 = field660[Statics.field1570 + 1];
			int var15 = field660[Statics.field1570 + 2];
			int var16 = field660[Statics.field1570 + 3];
			int var17 = field660[Statics.field1570 + 4];
			field660[++Statics.field1570 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
			return 1;
		} else if (arg0 == 4007) {
			Statics.field1570 -= 2;
			int var18 = field660[Statics.field1570];
			int var19 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var18 * var19 / 100 + var18;
			return 1;
		} else if (arg0 == 4008) {
			Statics.field1570 -= 2;
			int var20 = field660[Statics.field1570];
			int var21 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var20 | 0x1 << var21;
			return 1;
		} else if (arg0 == 4009) {
			Statics.field1570 -= 2;
			int var22 = field660[Statics.field1570];
			int var23 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var22 & -1 - (0x1 << var23);
			return 1;
		} else if (arg0 == 4010) {
			Statics.field1570 -= 2;
			int var24 = field660[Statics.field1570];
			int var25 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
			return 1;
		} else if (arg0 == 4011) {
			Statics.field1570 -= 2;
			int var26 = field660[Statics.field1570];
			int var27 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var26 % var27;
			return 1;
		} else if (arg0 == 4012) {
			Statics.field1570 -= 2;
			int var28 = field660[Statics.field1570];
			int var29 = field660[Statics.field1570 + 1];
			if (var28 == 0) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = (int) Math.pow((double) var28, (double) var29);
			}
			return 1;
		} else if (arg0 == 4013) {
			Statics.field1570 -= 2;
			int var30 = field660[Statics.field1570];
			int var31 = field660[Statics.field1570 + 1];
			if (var30 == 0) {
				field660[++Statics.field1570 - 1] = 0;
				return 1;
			}
			switch(var31) {
				case 0:
					field660[++Statics.field1570 - 1] = Integer.MAX_VALUE;
					break;
				case 1:
					field660[++Statics.field1570 - 1] = var30;
					break;
				case 2:
					field660[++Statics.field1570 - 1] = (int) Math.sqrt((double) var30);
					break;
				case 3:
					field660[++Statics.field1570 - 1] = (int) Math.cbrt((double) var30);
					break;
				case 4:
					field660[++Statics.field1570 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
					break;
				default:
					field660[++Statics.field1570 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
			}
			return 1;
		} else if (arg0 == 4014) {
			Statics.field1570 -= 2;
			int var32 = field660[Statics.field1570];
			int var33 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var32 & var33;
			return 1;
		} else if (arg0 == 4015) {
			Statics.field1570 -= 2;
			int var34 = field660[Statics.field1570];
			int var35 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var34 | var35;
			return 1;
		} else if (arg0 == 4016) {
			Statics.field1570 -= 2;
			int var36 = field660[Statics.field1570];
			int var37 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var36 < var37 ? var36 : var37;
			return 1;
		} else if (arg0 == 4017) {
			Statics.field1570 -= 2;
			int var38 = field660[Statics.field1570];
			int var39 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var38 > var39 ? var38 : var39;
			return 1;
		} else if (arg0 == 4018) {
			Statics.field1570 -= 3;
			long var40 = (long) field660[Statics.field1570];
			long var42 = (long) field660[Statics.field1570 + 1];
			long var44 = (long) field660[Statics.field1570 + 2];
			field660[++Statics.field1570 - 1] = (int) (var40 * var44 / var42);
			return 1;
		} else if (arg0 == 4025) {
			int var46 = class337.method3773(field660[--Statics.field1570]);
			field660[++Statics.field1570 - 1] = var46;
			return 1;
		} else if (arg0 == 4026) {
			Statics.field1570 -= 2;
			int var47 = field660[Statics.field1570];
			int var48 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var47 ^ 0x1 << var48;
			return 1;
		} else if (arg0 == 4027) {
			Statics.field1570 -= 3;
			int var49 = field660[Statics.field1570];
			int var50 = field660[Statics.field1570 + 1];
			int var51 = field660[Statics.field1570 + 2];
			field660[++Statics.field1570 - 1] = class337.method6414(var49, var50, var51);
			return 1;
		} else if (arg0 == 4028) {
			Statics.field1570 -= 3;
			int var52 = field660[Statics.field1570];
			int var53 = field660[Statics.field1570 + 1];
			int var54 = field660[Statics.field1570 + 2];
			field660[++Statics.field1570 - 1] = class337.method6330(var52, var53, var54);
			return 1;
		} else if (arg0 == 4029) {
			Statics.field1570 -= 3;
			int var55 = field660[Statics.field1570];
			int var56 = field660[Statics.field1570 + 1];
			int var57 = field660[Statics.field1570 + 2];
			int var58 = 31 - var57;
			field660[++Statics.field1570 - 1] = var55 << var58 >>> var56 + var58;
			return 1;
		} else if (arg0 == 4030) {
			Statics.field1570 -= 4;
			int var59 = field660[Statics.field1570];
			int var60 = field660[Statics.field1570 + 1];
			int var61 = field660[Statics.field1570 + 2];
			int var62 = field660[Statics.field1570 + 3];
			int var63 = class337.method6330(var59, var61, var62);
			int var64 = class337.method1107(var62 - var61 + 1);
			if (var60 > var64) {
				var60 = var64;
			}
			field660[++Statics.field1570 - 1] = var63 | var60 << var61;
			return 1;
		} else if (arg0 == 4032) {
			field660[Statics.field1570 - 1] = class536.method327(field660[Statics.field1570 - 1]);
			return 1;
		} else if (arg0 == 4033) {
			field660[Statics.field1570 - 1] = class536.method69(field660[Statics.field1570 - 1]);
			return 1;
		} else if (arg0 == 4034) {
			Statics.field1570 -= 2;
			int var65 = field660[Statics.field1570];
			int var66 = field660[Statics.field1570 + 1];
			int var67 = class536.method6883(var65, var66);
			field660[++Statics.field1570 - 1] = var67;
			return 1;
		} else if (arg0 == 4035) {
			field660[Statics.field1570 - 1] = Math.abs(field660[Statics.field1570 - 1]);
			return 1;
		} else if (arg0 == 4036) {
			String var68 = (String) field661[--Statics.field659];
			int var69 = -1;
			if (class446.method1561(var68)) {
				var69 = class446.method4011(var68);
			}
			field660[++Statics.field1570 - 1] = var69;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("cu.be(ILcg;ZI)I")
	public static int method2098(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 4100) {
			String var3 = (String) field661[--Statics.field659];
			int var4 = field660[--Statics.field1570];
			field661[++Statics.field659 - 1] = var3 + var4;
			return 1;
		} else if (arg0 == 4101) {
			Statics.field659 -= 2;
			String var5 = (String) field661[Statics.field659];
			String var6 = (String) field661[Statics.field659 + 1];
			field661[++Statics.field659 - 1] = var5 + var6;
			return 1;
		} else if (arg0 == 4102) {
			String var7 = (String) field661[--Statics.field659];
			int var8 = field660[--Statics.field1570];
			field661[++Statics.field659 - 1] = var7 + class446.method5409(var8, true);
			return 1;
		} else if (arg0 == 4103) {
			String var9 = (String) field661[--Statics.field659];
			field661[++Statics.field659 - 1] = var9.toLowerCase();
			return 1;
		} else if (arg0 == 4104) {
			int var10 = field660[--Statics.field1570];
			long var11 = ((long) var10 + 11745L) * 86400000L;
			field667.setTime(new Date(var11));
			int var13 = field667.get(5);
			int var14 = field667.get(2);
			int var15 = field667.get(1);
			field661[++Statics.field659 - 1] = var13 + "-" + field669[var14] + "-" + var15;
			return 1;
		} else if (arg0 == 4105) {
			Statics.field659 -= 2;
			String var16 = (String) field661[Statics.field659];
			String var17 = (String) field661[Statics.field659 + 1];
			if (Statics.field1109.field936 == null || Statics.field1109.field936.field4085 == 0) {
				field661[++Statics.field659 - 1] = var16;
			} else {
				field661[++Statics.field659 - 1] = var17;
			}
			return 1;
		} else if (arg0 == 4106) {
			int var18 = field660[--Statics.field1570];
			field661[++Statics.field659 - 1] = Integer.toString(var18);
			return 1;
		} else if (arg0 == 4107) {
			Statics.field659 -= 2;
			field660[++Statics.field1570 - 1] = class446.method467(class447.method5961((String) field661[Statics.field659], (String) field661[Statics.field659 + 1], Statics.field2971));
			return 1;
		} else if (arg0 == 4108) {
			String var19 = (String) field661[--Statics.field659];
			Statics.field1570 -= 2;
			int var20 = field660[Statics.field1570];
			int var21 = field660[Statics.field1570 + 1];
			byte[] var22 = Statics.field1727.method7692(var21, 0);
			class462 var23 = new class462(var22);
			field660[++Statics.field1570 - 1] = var23.method8761(var19, var20);
			return 1;
		} else if (arg0 == 4109) {
			String var24 = (String) field661[--Statics.field659];
			Statics.field1570 -= 2;
			int var25 = field660[Statics.field1570];
			int var26 = field660[Statics.field1570 + 1];
			byte[] var27 = Statics.field1727.method7692(var26, 0);
			class462 var28 = new class462(var27);
			field660[++Statics.field1570 - 1] = var28.method8787(var24, var25);
			return 1;
		} else if (arg0 == 4110) {
			Statics.field659 -= 2;
			String var29 = (String) field661[Statics.field659];
			String var30 = (String) field661[Statics.field659 + 1];
			if (field660[--Statics.field1570] == 1) {
				field661[++Statics.field659 - 1] = var29;
			} else {
				field661[++Statics.field659 - 1] = var30;
			}
			return 1;
		} else if (arg0 == 4111) {
			String var31 = (String) field661[--Statics.field659];
			field661[++Statics.field659 - 1] = class466.method8836(var31);
			return 1;
		} else if (arg0 == 4112) {
			String var32 = (String) field661[--Statics.field659];
			int var33 = field660[--Statics.field1570];
			field661[++Statics.field659 - 1] = var32 + (char) var33;
			return 1;
		} else if (arg0 == 4113) {
			int var34 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class446.method6907((char) var34) ? 1 : 0;
			return 1;
		} else if (arg0 == 4114) {
			int var35 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class446.method5403((char) var35) ? 1 : 0;
			return 1;
		} else if (arg0 == 4115) {
			int var36 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class446.method5658((char) var36) ? 1 : 0;
			return 1;
		} else if (arg0 == 4116) {
			int var37 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class446.method7633((char) var37) ? 1 : 0;
			return 1;
		} else if (arg0 == 4117) {
			String var38 = (String) field661[--Statics.field659];
			if (var38 == null) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = var38.length();
			}
			return 1;
		} else if (arg0 == 4118) {
			String var39 = (String) field661[--Statics.field659];
			Statics.field1570 -= 2;
			int var40 = field660[Statics.field1570];
			int var41 = field660[Statics.field1570 + 1];
			field661[++Statics.field659 - 1] = var39.substring(var40, var41);
			return 1;
		} else if (arg0 == 4119) {
			String var42 = (String) field661[--Statics.field659];
			StringBuilder var43 = new StringBuilder(var42.length());
			boolean var44 = false;
			for (int var45 = 0; var45 < var42.length(); var45++) {
				char var46 = var42.charAt(var45);
				if (var46 == '<') {
					var44 = true;
				} else if (var46 == '>') {
					var44 = false;
				} else if (!var44) {
					var43.append(var46);
				}
			}
			field661[++Statics.field659 - 1] = var43.toString();
			return 1;
		} else if (arg0 == 4120) {
			String var47 = (String) field661[--Statics.field659];
			int var48 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = var47.indexOf(var48);
			return 1;
		} else if (arg0 == 4121) {
			Statics.field659 -= 2;
			String var49 = (String) field661[Statics.field659];
			String var50 = (String) field661[Statics.field659 + 1];
			int var51 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = var49.indexOf(var50, var51);
			return 1;
		} else if (arg0 == 4122) {
			String var52 = (String) field661[--Statics.field659];
			field661[++Statics.field659 - 1] = var52.toUpperCase();
			return 1;
		} else if (arg0 == 4123) {
			Statics.field659 -= 3;
			String var53 = (String) field661[Statics.field659];
			String var54 = (String) field661[Statics.field659 + 1];
			String var55 = (String) field661[Statics.field659 + 2];
			if (Statics.field1109.field936 == null) {
				field661[++Statics.field659 - 1] = var55;
				return 1;
			}
			switch(Statics.field1109.field936.field4084) {
				case 0:
					field661[++Statics.field659 - 1] = var53;
					break;
				case 1:
					field661[++Statics.field659 - 1] = var54;
					break;
				case 2:
				default:
					field661[++Statics.field659 - 1] = var55;
			}
			return 1;
		} else if (arg0 == 4124) {
			field660[++Statics.field1570 - 1] = Statics.field1109.field936 == null ? -1 : Statics.field1109.field936.field4084;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("kh.bh(ILcg;ZI)I")
	public static int method5720(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 4200) {
			int var3 = field660[--Statics.field1570];
			field661[++Statics.field659 - 1] = class214.method2737(var3).field2429;
			return 1;
		} else if (arg0 == 4201) {
			Statics.field1570 -= 2;
			int var4 = field660[Statics.field1570];
			int var5 = field660[Statics.field1570 + 1];
			class214 var6 = class214.method2737(var4);
			if (var5 < 1 || var5 > 5 || var6.field2404[var5 - 1] == null) {
				field661[++Statics.field659 - 1] = "";
			} else {
				field661[++Statics.field659 - 1] = var6.field2404[var5 - 1];
			}
			return 1;
		} else if (arg0 == 4202) {
			Statics.field1570 -= 2;
			int var7 = field660[Statics.field1570];
			int var8 = field660[Statics.field1570 + 1];
			class214 var9 = class214.method2737(var7);
			if (var8 < 1 || var8 > 5 || var9.field2397[var8 - 1] == null) {
				field661[++Statics.field659 - 1] = "";
			} else {
				field661[++Statics.field659 - 1] = var9.field2397[var8 - 1];
			}
			return 1;
		} else if (arg0 == 4222) {
			Statics.field1570 -= 3;
			int var10 = field660[Statics.field1570];
			int var11 = field660[Statics.field1570 + 1];
			int var12 = field660[Statics.field1570 + 2];
			class214 var13 = class214.method2737(var10);
			String var14 = null;
			if (var11 >= 1 && var11 <= 5 && var13.field2397[var11 - 1] != null && var13.field2421 != null && var13.field2421[var11 - 1] != null && var12 >= 1 && var12 <= var13.field2421[var11 - 1].length) {
				var14 = var13.field2421[var11 - 1][var12 - 1];
			}
			field661[++Statics.field659 - 1] = var14 == null ? "" : var14;
			return 1;
		} else if (arg0 == 4203) {
			int var15 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class214.method2737(var15).field2411;
			return 1;
		} else if (arg0 == 4204) {
			int var16 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class214.method2737(var16).field2398 == 1 ? 1 : 0;
			return 1;
		} else if (arg0 == 4205) {
			int var17 = field660[--Statics.field1570];
			class214 var18 = class214.method2737(var17);
			if (var18.field2410 == -1 && var18.field2409 >= 0) {
				field660[++Statics.field1570 - 1] = var18.field2409;
			} else {
				field660[++Statics.field1570 - 1] = var17;
			}
			return 1;
		} else if (arg0 == 4206) {
			int var19 = field660[--Statics.field1570];
			class214 var20 = class214.method2737(var19);
			if (var20.field2410 >= 0 && var20.field2409 >= 0) {
				field660[++Statics.field1570 - 1] = var20.field2409;
			} else {
				field660[++Statics.field1570 - 1] = var19;
			}
			return 1;
		} else if (arg0 == 4207) {
			int var21 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class214.method2737(var21).field2403 ? 1 : 0;
			return 1;
		} else if (arg0 == 4208) {
			int var22 = field660[--Statics.field1570];
			class214 var23 = class214.method2737(var22);
			if (var23.field2423 == -1 && var23.field2396 >= 0) {
				field660[++Statics.field1570 - 1] = var23.field2396;
			} else {
				field660[++Statics.field1570 - 1] = var22;
			}
			return 1;
		} else if (arg0 == 4209) {
			int var24 = field660[--Statics.field1570];
			class214 var25 = class214.method2737(var24);
			if (var25.field2423 >= 0 && var25.field2396 >= 0) {
				field660[++Statics.field1570 - 1] = var25.field2396;
			} else {
				field660[++Statics.field1570 - 1] = var24;
			}
			return 1;
		} else if (arg0 == 4210) {
			String var26 = (String) field661[--Statics.field659];
			int var27 = field660[--Statics.field1570];
			client.method7498(var26, var27 == 1);
			field660[++Statics.field1570 - 1] = Statics.field3022;
			return 1;
		} else if (arg0 == 4211) {
			if (Statics.field3276 == null || Statics.field80 >= Statics.field3022) {
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = Statics.field3276[++Statics.field80 - 1] & 0xFFFF;
			}
			return 1;
		} else if (arg0 == 4212) {
			Statics.field80 = 0;
			return 1;
		} else if (arg0 == 4213) {
			int var28 = field660[--Statics.field1570];
			int var29 = class214.method2737(var28).method4370();
			if (var29 == -1) {
				field660[++Statics.field1570 - 1] = var29;
			} else {
				field660[++Statics.field1570 - 1] = var29 + 1;
			}
			return 1;
		} else if (arg0 == 4214) {
			int var30 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class214.method2737(var30).field2438;
			return 1;
		} else if (arg0 == 4215) {
			int var31 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class214.method2737(var31).field2401;
			return 1;
		} else if (arg0 == 4216) {
			int var32 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class214.method2737(var32).field2402;
			return 1;
		} else if (arg0 == 4217) {
			int var33 = field660[--Statics.field1570];
			class214 var34 = class214.method2737(var33);
			field660[++Statics.field1570 - 1] = var34.field2417;
			return 1;
		} else if (arg0 == 4218) {
			int var35 = field660[--Statics.field1570];
			field661[++Statics.field659 - 1] = class214.method2737(var35).field2387;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fh.bk(ILcg;ZS)I")
	public static int method3607(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 5000) {
			field660[++Statics.field1570 - 1] = client.field445;
			return 1;
		} else if (arg0 == 5001) {
			Statics.field1570 -= 3;
			client.field445 = field660[Statics.field1570];
			Statics.field2014 = Statics.method6278(field660[Statics.field1570 + 1]);
			if (Statics.field2014 == null) {
				Statics.field2014 = class612.field6071;
			}
			client.field441 = field660[Statics.field1570 + 2];
			class330 var3 = class330.method3456(class328.field3585, client.field315.field1309);
			var3.field3665.method10320(client.field445);
			var3.field3665.method10320(Statics.field2014.field6074);
			var3.field3665.method10320(client.field441);
			client.field315.method2874(var3);
			return 1;
		} else if (arg0 == 5002) {
			String var4 = (String) field661[--Statics.field659];
			Statics.field1570 -= 2;
			int var5 = field660[Statics.field1570];
			int var6 = field660[Statics.field1570 + 1];
			class330 var7 = class330.method3456(class328.field3595, client.field315.field1309);
			var7.field3665.method10320(class591.method5971(var4) + 2);
			var7.field3665.method10504(var4);
			var7.field3665.method10320(var5 - 1);
			var7.field3665.method10320(var6);
			client.field315.method2874(var7);
			return 1;
		} else if (arg0 == 5003) {
			Statics.field1570 -= 2;
			int var8 = field660[Statics.field1570];
			int var9 = field660[Statics.field1570 + 1];
			class40 var10 = class92.method1844(var8, var9);
			if (var10 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
				field661[++Statics.field659 - 1] = "";
				field661[++Statics.field659 - 1] = "";
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = var10.field268;
				field660[++Statics.field1570 - 1] = var10.field262;
				field661[++Statics.field659 - 1] = var10.field265 == null ? "" : var10.field265;
				field661[++Statics.field659 - 1] = var10.field267 == null ? "" : var10.field267;
				field661[++Statics.field659 - 1] = var10.field272 == null ? "" : var10.field272;
				field660[++Statics.field1570 - 1] = var10.method744() ? 1 : var10.method739() ? 2 : 0;
			}
			return 1;
		} else if (arg0 == 5004) {
			int var11 = field660[--Statics.field1570];
			class40 var12 = class92.method4349(var11);
			if (var12 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
				field661[++Statics.field659 - 1] = "";
				field661[++Statics.field659 - 1] = "";
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = var12.field264;
				field660[++Statics.field1570 - 1] = var12.field262;
				field661[++Statics.field659 - 1] = var12.field265 == null ? "" : var12.field265;
				field661[++Statics.field659 - 1] = var12.field267 == null ? "" : var12.field267;
				field661[++Statics.field659 - 1] = var12.field272 == null ? "" : var12.field272;
				field660[++Statics.field1570 - 1] = var12.method744() ? 1 : var12.method739() ? 2 : 0;
			}
			return 1;
		} else if (arg0 == 5005) {
			if (Statics.field2014 == null) {
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = Statics.field2014.field6074;
			}
			return 1;
		} else if (arg0 == 5008) {
			String var13 = (String) field661[--Statics.field659];
			int var14 = field660[--Statics.field1570];
			class330 var15 = class615.method10204(var14, var13, Statics.field2971, -1);
			client.field315.method2874(var15);
			return 1;
		} else if (arg0 == 5009) {
			Statics.field659 -= 2;
			String var16 = (String) field661[Statics.field659];
			String var17 = (String) field661[Statics.field659 + 1];
			class330 var18 = class330.method3456(class328.field3606, client.field315.field1309);
			var18.field3665.method10321(0);
			int var19 = var18.field3665.field5920;
			var18.field3665.method10504(var16);
			class377.method6884(var18.field3665, var17);
			var18.field3665.method10333(var18.field3665.field5920 - var19);
			client.field315.method2874(var18);
			return 1;
		} else if (arg0 == 5010) {
			String var20 = (String) field661[--Statics.field659];
			Statics.field1570 -= 2;
			int var21 = field660[Statics.field1570];
			int var22 = field660[Statics.field1570 + 1];
			class330 var23 = class615.method10204(var21, var20, Statics.field2971, var22);
			client.field315.method2874(var23);
			return 1;
		} else if (arg0 == 5015) {
			String var24;
			if (Statics.field1109 == null || Statics.field1109.field935 == null) {
				var24 = "";
			} else {
				var24 = Statics.field1109.field935.method11022();
			}
			field661[++Statics.field659 - 1] = var24;
			return 1;
		} else if (arg0 == 5016) {
			field660[++Statics.field1570 - 1] = client.field441;
			return 1;
		} else if (arg0 == 5017) {
			int var25 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class92.method6413(var25);
			return 1;
		} else if (arg0 == 5018) {
			int var26 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class92.method3657(var26);
			return 1;
		} else if (arg0 == 5019) {
			int var27 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class92.method4609(var27);
			return 1;
		} else if (arg0 == 5020) {
			String var28 = (String) field661[--Statics.field659];
			client.method3667(var28);
			return 1;
		} else if (arg0 == 5021) {
			client.field442 = ((String) field661[--Statics.field659]).toLowerCase().trim();
			return 1;
		} else if (arg0 == 5022) {
			field661[++Statics.field659 - 1] = client.field442;
			return 1;
		} else if (arg0 == 5023) {
			String var29 = (String) field661[--Statics.field659];
			System.out.println(var29);
			return 1;
		} else if (arg0 == 5030) {
			Statics.field1570 -= 2;
			int var30 = field660[Statics.field1570];
			int var31 = field660[Statics.field1570 + 1];
			class40 var32 = class92.method1844(var30, var31);
			if (var32 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
				field661[++Statics.field659 - 1] = "";
				field661[++Statics.field659 - 1] = "";
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = var32.field268;
				field660[++Statics.field1570 - 1] = var32.field262;
				field661[++Statics.field659 - 1] = var32.field265 == null ? "" : var32.field265;
				field661[++Statics.field659 - 1] = var32.field267 == null ? "" : var32.field267;
				field661[++Statics.field659 - 1] = var32.field272 == null ? "" : var32.field272;
				field660[++Statics.field1570 - 1] = var32.method744() ? 1 : var32.method739() ? 2 : 0;
				field661[++Statics.field659 - 1] = "";
				field660[++Statics.field1570 - 1] = 0;
			}
			return 1;
		} else if (arg0 == 5031) {
			int var33 = field660[--Statics.field1570];
			class40 var34 = class92.method4349(var33);
			if (var34 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
				field661[++Statics.field659 - 1] = "";
				field661[++Statics.field659 - 1] = "";
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = var34.field264;
				field660[++Statics.field1570 - 1] = var34.field262;
				field661[++Statics.field659 - 1] = var34.field265 == null ? "" : var34.field265;
				field661[++Statics.field659 - 1] = var34.field267 == null ? "" : var34.field267;
				field661[++Statics.field659 - 1] = var34.field272 == null ? "" : var34.field272;
				field660[++Statics.field1570 - 1] = var34.method744() ? 1 : var34.method739() ? 2 : 0;
				field661[++Statics.field659 - 1] = "";
				field660[++Statics.field1570 - 1] = 0;
			}
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("sb.bp(ILcg;ZS)I")
	public static int method8979(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 5306) {
			field660[++Statics.field1570 - 1] = client.method724();
			return 1;
		} else if (arg0 == 5307) {
			int var3 = field660[--Statics.field1570];
			if (var3 == 1 || var3 == 2) {
				client.method4230(var3);
			}
			return 1;
		} else if (arg0 == 5308) {
			field660[++Statics.field1570 - 1] = Statics.field240.method2525();
			return 1;
		} else if (arg0 == 5309) {
			int var4 = field660[--Statics.field1570];
			if (var4 == 1 || var4 == 2) {
				Statics.field240.method2518(var4);
			}
			return 1;
		} else if (arg0 == 5310) {
			Statics.field1570--;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ks.br(ILcg;ZI)I")
	public static int method5646(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 5504) {
			Statics.field1570 -= 2;
			int var3 = field660[Statics.field1570];
			int var4 = field660[Statics.field1570 + 1];
			if (!client.field475) {
				client.field416 = var3;
				client.field425 = var4;
			}
			return 1;
		} else if (arg0 == 5505) {
			field660[++Statics.field1570 - 1] = client.field416;
			return 1;
		} else if (arg0 == 5506) {
			field660[++Statics.field1570 - 1] = client.field425;
			return 1;
		} else if (arg0 == 5530) {
			int var5 = field660[--Statics.field1570];
			if (var5 < 0) {
				var5 = 0;
			}
			client.field559 = var5;
			return 1;
		} else if (arg0 == 5531) {
			field660[++Statics.field1570 - 1] = client.field559;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ed.bv(ILcg;ZI)I")
	public static int method3325(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 5630) {
			client.field580 = 250;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ap.bj(II)I")
	public static int method13(int arg0) {
		return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("ro.bm(II)I")
	public static int method8550(int arg0) {
		return (int) ((Math.log((double) arg0) / field658 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("jo.bf(ILcg;ZB)I")
	public static int method5445(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 6200) {
			Statics.field1570 -= 2;
			client.field368 = (short) method13(field660[Statics.field1570]);
			if (client.field368 <= 0) {
				client.field368 = 256;
			}
			client.field369 = (short) method13(field660[Statics.field1570 + 1]);
			if (client.field369 <= 0) {
				client.field369 = 256;
			}
			return 1;
		} else if (arg0 == 6201) {
			Statics.field1570 -= 2;
			client.field370 = (short) field660[Statics.field1570];
			if (client.field370 <= 0) {
				client.field370 = 256;
			}
			client.field371 = (short) field660[Statics.field1570 + 1];
			if (client.field371 <= 0) {
				client.field371 = 320;
			}
			return 1;
		} else if (arg0 == 6202) {
			Statics.field1570 -= 4;
			client.field372 = (short) field660[Statics.field1570];
			if (client.field372 <= 0) {
				client.field372 = 1;
			}
			client.field365 = (short) field660[Statics.field1570 + 1];
			if (client.field365 <= 0) {
				client.field365 = 32767;
			} else if (client.field365 < client.field372) {
				client.field365 = client.field372;
			}
			client.field420 = (short) field660[Statics.field1570 + 2];
			if (client.field420 <= 0) {
				client.field420 = 1;
			}
			client.field383 = (short) field660[Statics.field1570 + 3];
			if (client.field383 <= 0) {
				client.field383 = 32767;
			} else if (client.field383 < client.field420) {
				client.field383 = client.field420;
			}
			return 1;
		} else if (arg0 == 6203) {
			if (client.field359 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = -1;
			} else {
				client.method6281(0, 0, client.field359.field4161, client.field359.field4150, false);
				field660[++Statics.field1570 - 1] = client.field314;
				field660[++Statics.field1570 - 1] = client.field379;
			}
			return 1;
		} else if (arg0 == 6204) {
			field660[++Statics.field1570 - 1] = client.field370;
			field660[++Statics.field1570 - 1] = client.field371;
			return 1;
		} else if (arg0 == 6205) {
			field660[++Statics.field1570 - 1] = method8550(client.field368);
			field660[++Statics.field1570 - 1] = method8550(client.field369);
			return 1;
		} else if (arg0 == 6220) {
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 6221) {
			field660[++Statics.field1570 - 1] = 0;
			return 1;
		} else if (arg0 == 6222) {
			field660[++Statics.field1570 - 1] = Statics.field208;
			return 1;
		} else if (arg0 == 6223) {
			field660[++Statics.field1570 - 1] = Statics.field4810;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("bl.bw(ILcg;ZI)I")
	public static int method523(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 6500) {
			field660[++Statics.field1570 - 1] = class45.method2106() ? 1 : 0;
			return 1;
		} else if (arg0 == 6501) {
			class45 var3 = class45.method9536();
			if (var3 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
				field660[++Statics.field1570 - 1] = 0;
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
			} else {
				field660[++Statics.field1570 - 1] = var3.field641;
				field660[++Statics.field1570 - 1] = var3.field633;
				field661[++Statics.field659 - 1] = var3.field623;
				field660[++Statics.field1570 - 1] = var3.field636;
				field660[++Statics.field1570 - 1] = var3.field629;
				field661[++Statics.field659 - 1] = var3.field635;
			}
			return 1;
		} else if (arg0 == 6502) {
			class45 var4 = class45.method410();
			if (var4 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
				field660[++Statics.field1570 - 1] = 0;
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
			} else {
				field660[++Statics.field1570 - 1] = var4.field641;
				field660[++Statics.field1570 - 1] = var4.field633;
				field661[++Statics.field659 - 1] = var4.field623;
				field660[++Statics.field1570 - 1] = var4.field636;
				field660[++Statics.field1570 - 1] = var4.field629;
				field661[++Statics.field659 - 1] = var4.field635;
			}
			return 1;
		} else if (arg0 == 6506) {
			int var5 = field660[--Statics.field1570];
			class45 var6 = null;
			for (int var7 = 0; var7 < class45.field627; var7++) {
				if (Statics.field625[var7].field641 == var5) {
					var6 = Statics.field625[var7];
					break;
				}
			}
			if (var6 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
				field660[++Statics.field1570 - 1] = 0;
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
			} else {
				field660[++Statics.field1570 - 1] = var6.field641;
				field660[++Statics.field1570 - 1] = var6.field633;
				field661[++Statics.field659 - 1] = var6.field623;
				field660[++Statics.field1570 - 1] = var6.field636;
				field660[++Statics.field1570 - 1] = var6.field629;
				field661[++Statics.field659 - 1] = var6.field635;
			}
			return 1;
		} else if (arg0 == 6507) {
			Statics.field1570 -= 4;
			int var8 = field660[Statics.field1570];
			boolean var9 = field660[Statics.field1570 + 1] == 1;
			int var10 = field660[Statics.field1570 + 2];
			boolean var11 = field660[Statics.field1570 + 3] == 1;
			class45.method3812(var8, var9, var10, var11);
			return 1;
		} else if (arg0 == 6511) {
			int var12 = field660[--Statics.field1570];
			if (var12 >= 0 && var12 < class45.field627) {
				class45 var13 = Statics.field625[var12];
				field660[++Statics.field1570 - 1] = var13.field641;
				field660[++Statics.field1570 - 1] = var13.field633;
				field661[++Statics.field659 - 1] = var13.field623;
				field660[++Statics.field1570 - 1] = var13.field636;
				field660[++Statics.field1570 - 1] = var13.field629;
				field661[++Statics.field659 - 1] = var13.field635;
			} else {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
				field660[++Statics.field1570 - 1] = 0;
				field660[++Statics.field1570 - 1] = 0;
				field661[++Statics.field659 - 1] = "";
			}
			return 1;
		} else if (arg0 == 6512) {
			client.field356 = field660[--Statics.field1570] == 1;
			return 1;
		} else if (arg0 == 6513) {
			Statics.field1570 -= 2;
			int var14 = field660[Statics.field1570];
			int var15 = field660[Statics.field1570 + 1];
			class209 var16 = class209.method2995(var15);
			if (var16.method4223()) {
				field661[++Statics.field659 - 1] = class196.method2096(var14).method4038(var15, var16.field2270);
			} else {
				field660[++Statics.field1570 - 1] = class196.method2096(var14).method4033(var15, var16.field2274);
			}
			return 1;
		} else if (arg0 == 6514) {
			Statics.field1570 -= 2;
			int var17 = field660[Statics.field1570];
			int var18 = field660[Statics.field1570 + 1];
			class209 var19 = class209.method2995(var18);
			if (var19.method4223()) {
				field661[++Statics.field659 - 1] = class213.method8013(var17).method4301(var18, var19.field2270);
			} else {
				field660[++Statics.field1570 - 1] = class213.method8013(var17).method4311(var18, var19.field2274);
			}
			return 1;
		} else if (arg0 == 6515) {
			Statics.field1570 -= 2;
			int var20 = field660[Statics.field1570];
			int var21 = field660[Statics.field1570 + 1];
			class209 var22 = class209.method2995(var21);
			if (var22.method4223()) {
				field661[++Statics.field659 - 1] = class214.method2737(var20).method4369(var21, var22.field2270);
			} else {
				field660[++Statics.field1570 - 1] = class214.method2737(var20).method4394(var21, var22.field2274);
			}
			return 1;
		} else if (arg0 == 6516) {
			Statics.field1570 -= 2;
			int var23 = field660[Statics.field1570];
			int var24 = field660[Statics.field1570 + 1];
			class209 var25 = class209.method2995(var24);
			if (var25.method4223()) {
				field661[++Statics.field659 - 1] = class210.method3679(var23).method4246(var24, var25.field2270);
			} else {
				field660[++Statics.field1570 - 1] = class210.method3679(var23).method4245(var24, var25.field2274);
			}
			return 1;
		} else if (arg0 == 6518) {
			field660[++Statics.field1570 - 1] = client.field592 ? 1 : 0;
			return 1;
		} else if (arg0 == 6519) {
			field660[++Statics.field1570 - 1] = client.field377;
			return 1;
		} else if (arg0 == 6520) {
			return 1;
		} else if (arg0 == 6521) {
			return 1;
		} else if (arg0 == 6522) {
			Statics.field659--;
			Statics.field1570--;
			return 1;
		} else if (arg0 == 6523) {
			Statics.field659--;
			Statics.field1570--;
			return 1;
		} else if (arg0 == 6524) {
			field660[++Statics.field1570 - 1] = -1;
			return 1;
		} else if (arg0 == 6525) {
			field660[++Statics.field1570 - 1] = 1;
			return 1;
		} else if (arg0 == 6526) {
			field660[++Statics.field1570 - 1] = 1;
			return 1;
		} else if (arg0 == 6527) {
			field660[++Statics.field1570 - 1] = client.field391;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("pz.bc(ILcg;ZS)I")
	public static int method7585(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 6600) {
			int var3 = Statics.field3837.field1171;
			int var4 = (Statics.field1109.field1056 >> 7) + Statics.field3837.field1165;
			int var5 = (Statics.field1109.field1057 >> 7) + Statics.field3837.field1166;
			client.method5050().method9832(var3, var4, var5, true);
			return 1;
		} else if (arg0 == 6601) {
			int var6 = field660[--Statics.field1570];
			String var7 = "";
			class290 var8 = client.method5050().method9851(var6);
			if (var8 != null) {
				var7 = var8.method5983();
			}
			field661[++Statics.field659 - 1] = var7;
			return 1;
		} else if (arg0 == 6602) {
			int var9 = field660[--Statics.field1570];
			client.method5050().method9833(var9);
			return 1;
		} else if (arg0 == 6603) {
			field660[++Statics.field1570 - 1] = client.method5050().method9934();
			return 1;
		} else if (arg0 == 6604) {
			int var10 = field660[--Statics.field1570];
			client.method5050().method9979(var10);
			return 1;
		} else if (arg0 == 6605) {
			field660[++Statics.field1570 - 1] = client.method5050().method9850() ? 1 : 0;
			return 1;
		} else if (arg0 == 6606) {
			class357 var11 = new class357(field660[--Statics.field1570]);
			client.method5050().method9852(var11.field4027, var11.field4026);
			return 1;
		} else if (arg0 == 6607) {
			class357 var12 = new class357(field660[--Statics.field1570]);
			client.method5050().method9980(var12.field4027, var12.field4026);
			return 1;
		} else if (arg0 == 6608) {
			class357 var13 = new class357(field660[--Statics.field1570]);
			client.method5050().method9939(var13.field4028, var13.field4027, var13.field4026);
			return 1;
		} else if (arg0 == 6609) {
			class357 var14 = new class357(field660[--Statics.field1570]);
			client.method5050().method9940(var14.field4028, var14.field4027, var14.field4026);
			return 1;
		} else if (arg0 == 6610) {
			field660[++Statics.field1570 - 1] = client.method5050().method9856();
			field660[++Statics.field1570 - 1] = client.method5050().method9905();
			return 1;
		} else if (arg0 == 6611) {
			int var15 = field660[--Statics.field1570];
			class290 var16 = client.method5050().method9851(var15);
			if (var16 == null) {
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = var16.method5993().method6811();
			}
			return 1;
		} else if (arg0 == 6612) {
			int var17 = field660[--Statics.field1570];
			class290 var18 = client.method5050().method9851(var17);
			if (var18 == null) {
				field660[++Statics.field1570 - 1] = 0;
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = (var18.method6008() - var18.method5986() + 1) * 64;
				field660[++Statics.field1570 - 1] = (var18.method5989() - var18.method5988() + 1) * 64;
			}
			return 1;
		} else if (arg0 == 6613) {
			int var19 = field660[--Statics.field1570];
			class290 var20 = client.method5050().method9851(var19);
			if (var20 == null) {
				field660[++Statics.field1570 - 1] = 0;
				field660[++Statics.field1570 - 1] = 0;
				field660[++Statics.field1570 - 1] = 0;
				field660[++Statics.field1570 - 1] = 0;
			} else {
				field660[++Statics.field1570 - 1] = var20.method5986() * 64;
				field660[++Statics.field1570 - 1] = var20.method5988() * 64;
				field660[++Statics.field1570 - 1] = var20.method6008() * 64 + 64 - 1;
				field660[++Statics.field1570 - 1] = var20.method5989() * 64 + 64 - 1;
			}
			return 1;
		} else if (arg0 == 6614) {
			int var21 = field660[--Statics.field1570];
			class290 var22 = client.method5050().method9851(var21);
			if (var22 == null) {
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = var22.method5985();
			}
			return 1;
		} else if (arg0 == 6615) {
			class357 var23 = client.method5050().method10005();
			if (var23 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = var23.field4027;
				field660[++Statics.field1570 - 1] = var23.field4026;
			}
			return 1;
		} else if (arg0 == 6616) {
			field660[++Statics.field1570 - 1] = client.method5050().method9834();
			return 1;
		} else if (arg0 == 6617) {
			class357 var24 = new class357(field660[--Statics.field1570]);
			class290 var25 = client.method5050().method9825();
			if (var25 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = -1;
				return 1;
			}
			int[] var26 = var25.method5977(var24.field4028, var24.field4027, var24.field4026);
			if (var26 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = var26[0];
				field660[++Statics.field1570 - 1] = var26[1];
			}
			return 1;
		} else if (arg0 == 6618) {
			class357 var27 = new class357(field660[--Statics.field1570]);
			class290 var28 = client.method5050().method9825();
			if (var28 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = -1;
				return 1;
			}
			class357 var29 = var28.method5978(var27.field4027, var27.field4026);
			if (var29 == null) {
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = var29.method6811();
			}
			return 1;
		} else if (arg0 == 6619) {
			Statics.field1570 -= 2;
			int var30 = field660[Statics.field1570];
			class357 var31 = new class357(field660[Statics.field1570 + 1]);
			method5593(var30, var31, false);
			return 1;
		} else if (arg0 == 6620) {
			Statics.field1570 -= 2;
			int var32 = field660[Statics.field1570];
			class357 var33 = new class357(field660[Statics.field1570 + 1]);
			method5593(var32, var33, true);
			return 1;
		} else if (arg0 == 6621) {
			Statics.field1570 -= 2;
			int var34 = field660[Statics.field1570];
			class357 var35 = new class357(field660[Statics.field1570 + 1]);
			class290 var36 = client.method5050().method9851(var34);
			if (var36 == null) {
				field660[++Statics.field1570 - 1] = 0;
				return 1;
			} else {
				field660[++Statics.field1570 - 1] = var36.method5975(var35.field4028, var35.field4027, var35.field4026) ? 1 : 0;
				return 1;
			}
		} else if (arg0 == 6622) {
			field660[++Statics.field1570 - 1] = client.method5050().method9858();
			field660[++Statics.field1570 - 1] = client.method5050().method9906();
			return 1;
		} else if (arg0 == 6623) {
			class357 var37 = new class357(field660[--Statics.field1570]);
			class290 var38 = client.method5050().method9831(var37.field4028, var37.field4027, var37.field4026);
			if (var38 == null) {
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = var38.method5991();
			}
			return 1;
		} else if (arg0 == 6624) {
			client.method5050().method9860(field660[--Statics.field1570]);
			return 1;
		} else if (arg0 == 6625) {
			client.method5050().method9919();
			return 1;
		} else if (arg0 == 6626) {
			client.method5050().method9862(field660[--Statics.field1570]);
			return 1;
		} else if (arg0 == 6627) {
			client.method5050().method9972();
			return 1;
		} else if (arg0 == 6628) {
			boolean var39 = field660[--Statics.field1570] == 1;
			client.method5050().method9864(var39);
			return 1;
		} else if (arg0 == 6629) {
			int var40 = field660[--Statics.field1570];
			client.method5050().method9865(var40);
			return 1;
		} else if (arg0 == 6630) {
			int var41 = field660[--Statics.field1570];
			client.method5050().method9867(var41);
			return 1;
		} else if (arg0 == 6631) {
			client.method5050().method10019();
			return 1;
		} else if (arg0 == 6632) {
			boolean var42 = field660[--Statics.field1570] == 1;
			client.method5050().method9997(var42);
			return 1;
		} else if (arg0 == 6633) {
			Statics.field1570 -= 2;
			int var43 = field660[Statics.field1570];
			boolean var44 = field660[Statics.field1570 + 1] == 1;
			client.method5050().method9868(var43, var44);
			return 1;
		} else if (arg0 == 6634) {
			Statics.field1570 -= 2;
			int var45 = field660[Statics.field1570];
			boolean var46 = field660[Statics.field1570 + 1] == 1;
			client.method5050().method9869(var45, var46);
			return 1;
		} else if (arg0 == 6635) {
			field660[++Statics.field1570 - 1] = client.method5050().method9870() ? 1 : 0;
			return 1;
		} else if (arg0 == 6636) {
			int var47 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.method5050().method9872(var47) ? 1 : 0;
			return 1;
		} else if (arg0 == 6637) {
			int var48 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = client.method5050().method9873(var48) ? 1 : 0;
			return 1;
		} else if (arg0 == 6638) {
			Statics.field1570 -= 2;
			int var49 = field660[Statics.field1570];
			class357 var50 = new class357(field660[Statics.field1570 + 1]);
			class357 var51 = client.method5050().method9876(var49, var50);
			if (var51 == null) {
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = var51.method6811();
			}
			return 1;
		} else if (arg0 == 6639) {
			class308 var52 = client.method5050().method9883();
			if (var52 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = var52.method5939();
				field660[++Statics.field1570 - 1] = var52.field3492.method6811();
			}
			return 1;
		} else if (arg0 == 6640) {
			class308 var53 = client.method5050().method9847();
			if (var53 == null) {
				field660[++Statics.field1570 - 1] = -1;
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = var53.method5939();
				field660[++Statics.field1570 - 1] = var53.field3492.method6811();
			}
			return 1;
		} else if (arg0 == 6693) {
			int var54 = field660[--Statics.field1570];
			class185 var55 = class185.method4094(var54);
			if (var55.field1996 == null) {
				field661[++Statics.field659 - 1] = "";
			} else {
				field661[++Statics.field659 - 1] = var55.field1996;
			}
			return 1;
		} else if (arg0 == 6694) {
			int var56 = field660[--Statics.field1570];
			class185 var57 = class185.method4094(var56);
			field660[++Statics.field1570 - 1] = var57.field2007;
			return 1;
		} else if (arg0 == 6695) {
			int var58 = field660[--Statics.field1570];
			class185 var59 = class185.method4094(var58);
			if (var59 == null) {
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = var59.field2005;
			}
			return 1;
		} else if (arg0 == 6696) {
			int var60 = field660[--Statics.field1570];
			class185 var61 = class185.method4094(var60);
			if (var61 == null) {
				field660[++Statics.field1570 - 1] = -1;
			} else {
				field660[++Statics.field1570 - 1] = var61.field1994;
			}
			return 1;
		} else if (arg0 == 6697) {
			field660[++Statics.field1570 - 1] = Statics.field2811.field3513;
			return 1;
		} else if (arg0 == 6698) {
			field660[++Statics.field1570 - 1] = Statics.field2811.field3511.method6811();
			return 1;
		} else if (arg0 == 6699) {
			field660[++Statics.field1570 - 1] = Statics.field2811.field3512.method6811();
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gj.cw(ILcg;ZI)I")
	public static int method3685(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 6754) {
			int var3 = field660[--Statics.field1570];
			class196 var4 = class196.method2096(var3);
			field661[++Statics.field659 - 1] = var4 == null ? "" : var4.field2111;
			return 1;
		} else if (arg0 == 6764) {
			Statics.field1570 -= 2;
			class196 var5 = class196.method2096(field660[Statics.field1570]);
			int var6 = field660[Statics.field1570 + 1];
			field660[++Statics.field1570 - 1] = var5.method4037(var6);
			field660[++Statics.field1570 - 1] = var5.method4039(var6);
			return 1;
		} else if (arg0 == 6765) {
			class196 var7 = class196.method2096(field660[--Statics.field1570]);
			field660[++Statics.field1570 - 1] = var7 == null ? 0 : var7.field2136;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("oi.cz(ILcg;ZB)I")
	public static int method7488(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 6809) {
			int var3 = field660[--Statics.field1570];
			class213 var4 = class213.method8013(var3);
			field661[++Statics.field659 - 1] = var4 == null ? "" : var4.field2338;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("bl.cf(ILcg;ZI)I")
	public static int method681(int arg0, class56 arg1, boolean arg2) {
		return 2;
	}

	@ObfuscatedName("nq.cg(ILcg;ZI)I")
	public static int method6787(int arg0, class56 arg1, boolean arg2) {
		return 2;
	}

	@ObfuscatedName("jc.cp(ILcg;ZB)I")
	public static int method5114(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 7463) {
			boolean var3 = field660[--Statics.field1570] == 1;
			client.method10165(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("cn.cm(ILcg;ZI)I")
	public static int method2119(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 7500) {
			int var3 = field660[--Statics.field1570];
			Object var4 = method2049(var3);
			int var5 = field660[--Statics.field1570];
			class579 var6 = client.method328(var5);
			if (var6 == null) {
				throw new RuntimeException();
			}
			int var7 = class581.method10058(var5);
			Statics.field3838 = var6.method10206(var4, var7);
			if (Statics.field3838 == null) {
				client.field317 = -1;
				Statics.field3065 = null;
				if (arg0 == 7500) {
					field660[++Statics.field1570 - 1] = 0;
				}
			} else {
				client.field317 = class581.method8551(var5);
				Statics.field3065 = Statics.field3838.iterator();
				if (arg0 == 7500) {
					field660[++Statics.field1570 - 1] = Statics.field3838.size();
				}
			}
			return 1;
		} else if (arg0 == 7501) {
			if (Statics.field3065 != null && Statics.field3065.hasNext()) {
				field660[++Statics.field1570 - 1] = (Integer) Statics.field3065.next();
			} else {
				field660[++Statics.field1570 - 1] = -1;
			}
			return 1;
		} else if (arg0 == 7502) {
			Statics.field1570 -= 3;
			int var8 = field660[Statics.field1570];
			int var9 = field660[Statics.field1570 + 1];
			int var10 = field660[Statics.field1570 + 2];
			int var11 = class581.method8551(var9);
			int var12 = class581.method9450(var9);
			int var13 = class581.method10058(var9);
			class580 var14 = class580.method8506(var8);
			class578 var15 = class578.method10172(var11);
			int[] var16 = var15.field5830[var12];
			int var17 = 0;
			int var18 = var16.length;
			if (var13 >= 0) {
				if (var13 >= var18) {
					throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var13 + ", Max: " + var18);
				}
				var17 = var13;
				var18 = var13 + 1;
			}
			Object[] var19 = var14.method10214(var12);
			if (var19 == null && var15.field5829 != null) {
				var19 = var15.field5829[var12];
			}
			if (var19 == null) {
				for (int var20 = var17; var20 < var18; var20++) {
					int var21 = var16[var20];
					class575 var22 = class573.method9167(var21);
					if (class575.field5825 == var22) {
						field661[++Statics.field659 - 1] = "";
					} else {
						field660[++Statics.field1570 - 1] = class573.method10023(var21);
					}
				}
				return 1;
			}
			int var23 = var19.length / var16.length;
			if (var10 < 0 || var10 >= var23) {
				throw new RuntimeException();
			}
			for (int var24 = var17; var24 < var18; var24++) {
				int var25 = var16.length * var10 + var24;
				class575 var26 = class573.method9167(var16[var24]);
				if (class575.field5825 == var26) {
					field661[++Statics.field659 - 1] = var19[var25];
				} else {
					field660[++Statics.field1570 - 1] = (Integer) var19[var25];
				}
			}
			return 1;
		} else if (arg0 == 7503) {
			Statics.field1570 -= 2;
			int var27 = field660[Statics.field1570];
			int var28 = field660[Statics.field1570 + 1];
			int var29 = 0;
			int var30 = class581.method8551(var28);
			int var31 = class581.method9450(var28);
			class580 var32 = class580.method8506(var27);
			class578 var33 = class578.method10172(var30);
			int[] var34 = var33.field5830[var31];
			Object[] var35 = var32.method10214(var31);
			if (var35 == null && var33.field5829 != null) {
				var35 = var33.field5829[var31];
			}
			if (var35 != null) {
				var29 = var35.length / var34.length;
			}
			field660[++Statics.field1570 - 1] = var29;
			return 1;
		} else if (arg0 == 7504) {
			Statics.field1570--;
			int var36 = field660[Statics.field1570];
			class579 var37 = client.method182(var36);
			if (var37 == null) {
				throw new RuntimeException();
			}
			Statics.field3838 = var37.method10206(0, 0);
			int var38 = 0;
			if (Statics.field3838 != null) {
				client.field317 = var36;
				Statics.field3065 = Statics.field3838.iterator();
				var38 = Statics.field3838.size();
			}
			if (arg0 == 7504) {
				field660[++Statics.field1570 - 1] = var38;
			}
			return 1;
		} else if (arg0 == 7505) {
			int var39 = field660[--Statics.field1570];
			class580 var40 = class580.method8506(var39);
			field660[++Statics.field1570 - 1] = var40.field5844;
			return 1;
		} else if (arg0 == 7506) {
			int var41 = field660[--Statics.field1570];
			int var42 = -1;
			if (Statics.field3838 != null && var41 >= 0 && var41 < Statics.field3838.size()) {
				var42 = (Integer) Statics.field3838.get(var41);
			}
			field660[++Statics.field1570 - 1] = var42;
			return 1;
		} else if (arg0 == 7507) {
			int var43 = field660[--Statics.field1570];
			Object var44 = method2049(var43);
			int var45 = field660[--Statics.field1570];
			class579 var46 = client.method328(var45);
			if (var46 == null) {
				throw new RuntimeException();
			} else if (class581.method8551(var45) != client.field317) {
				throw new RuntimeException();
			} else if (Statics.field3838 == null && Statics.field3838.isEmpty()) {
				throw new RuntimeException();
			} else {
				int var47 = class581.method10058(var45);
				List var48 = var46.method10206(var44, var47);
				Statics.field3838 = new LinkedList(Statics.field3838);
				if (var48 == null) {
					Statics.field3838.clear();
				} else {
					Statics.field3838.retainAll(var48);
				}
				Statics.field3065 = Statics.field3838.iterator();
				if (arg0 == 7507) {
					field660[++Statics.field1570 - 1] = Statics.field3838.size();
				}
				return 1;
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ob.cc(ILcg;ZB)I")
	public static int method7533(int arg0, class56 arg1, boolean arg2) {
		return 2;
	}

	@ObfuscatedName("ec.cj(ILcg;ZB)I")
	public static int method3243(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 7900) {
			int var3 = field660[--Statics.field1570];
			client.field385 = Math.max(var3, 0);
			return 1;
		} else if (arg0 == 7901) {
			field660[++Statics.field1570 - 1] = client.field385;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hj.ce(ILcg;ZI)I")
	public static int method3879(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 8000) {
			Statics.field659 -= 2;
			class520 var3 = method8977(field661[Statics.field659], null);
			class520 var4 = (class520) field661[Statics.field659 + 1];
			class521.method3400(var3, var4);
			return 1;
		} else if (arg0 == 8001) {
			Statics.field1570 -= 2;
			int var5 = field660[Statics.field1570];
			int var6 = field660[Statics.field1570 + 1];
			class520 var7 = method8977(field661[--Statics.field659], null);
			Statics.method9533(var7, var5, var6);
			return 1;
		} else if (arg0 == 8002) {
			class520 var8 = (class520) field661[--Statics.field659];
			field660[++Statics.field1570 - 1] = var8 == null ? 1 : 0;
			return 1;
		} else if (arg0 == 8003) {
			class520 var9 = (class520) field661[--Statics.field659];
			field660[++Statics.field1570 - 1] = var9 == null ? 0 : var9.method9545();
			return 1;
		} else if (arg0 == 8004) {
			Statics.field659 -= 2;
			class520 var10 = (class520) field661[Statics.field659];
			class520 var11 = (class520) field661[Statics.field659 + 1];
			field660[++Statics.field1570 - 1] = class521.method7555(var10, var11);
			return 1;
		} else if (arg0 == 8005) {
			Statics.field1570 -= 3;
			int var12 = field660[Statics.field1570];
			int var13 = field660[Statics.field1570 + 1];
			int var14 = field660[Statics.field1570 + 2];
			Object var15 = method2049(var14);
			class520 var16 = (class520) field661[--Statics.field659];
			field660[++Statics.field1570 - 1] = var16 == null ? -1 : Statics.method6357(var16, var15, var12, var13);
			return 1;
		} else if (arg0 == 8006) {
			Statics.field1570 -= 3;
			int var17 = field660[Statics.field1570];
			int var18 = field660[Statics.field1570 + 1];
			int var19 = field660[Statics.field1570 + 2];
			Object var20 = method2049(var19);
			class520 var21 = (class520) field661[--Statics.field659];
			field660[++Statics.field1570 - 1] = var21 == null ? -1 : class521.method736(var21, var20, var17, var18);
			return 1;
		} else if (arg0 == 8007) {
			Statics.field1570 -= 3;
			int var22 = field660[Statics.field1570];
			int var23 = field660[Statics.field1570 + 1];
			int var24 = field660[Statics.field1570 + 2];
			Object var25 = method2049(var24);
			class520 var26 = (class520) field661[--Statics.field659];
			field660[++Statics.field1570 - 1] = var26 == null ? 0 : Statics.method6533(var26, var25, var22, var23);
			return 1;
		} else if (arg0 == 8008) {
			class520 var27 = method8977(field661[--Statics.field659], null);
			int var28 = class521.method10025(var27);
			if (class575.field5821 == var27.field5505) {
				field660[++Statics.field1570 - 1] = var28 >= 0 ? var27.method9541()[var28] : -1;
			} else if (class575.field5825 == var27.field5505) {
				String var29 = (String) (var28 >= 0 ? var27.method9544()[var28] : null);
				field661[++Statics.field659 - 1] = var29 == null ? "" : var29;
			} else {
				throw new IllegalStateException();
			}
			return 1;
		} else if (arg0 == 8009) {
			class520 var30 = method8977(field661[--Statics.field659], null);
			int var31 = class521.method3681(var30);
			if (class575.field5821 == var30.field5505) {
				field660[++Statics.field1570 - 1] = var31 >= 0 ? var30.method9541()[var31] : -1;
			} else if (class575.field5825 == var30.field5505) {
				String var32 = (String) (var31 >= 0 ? var30.method9544()[var31] : null);
				field661[++Statics.field659 - 1] = var32 == null ? "" : var32;
			} else {
				throw new IllegalStateException();
			}
			return 1;
		} else if (arg0 == 8010) {
			Statics.field1570 -= 3;
			int var33 = field660[Statics.field1570];
			int var34 = field660[Statics.field1570 + 1];
			int var35 = field660[Statics.field1570 + 2];
			Object var36 = method2049(var35);
			class520 var37 = method8977(field661[--Statics.field659], null);
			class521.method6799(var37, var36, var33, var34);
			return 1;
		} else if (arg0 == 8011) {
			Statics.field1570 -= 3;
			int var38 = field660[Statics.field1570];
			int var39 = field660[Statics.field1570 + 1];
			int var40 = field660[Statics.field1570 + 2];
			class520 var41 = method8977(field661[--Statics.field659], null);
			class521.method5876(var41, var38, 1, var39, var40);
			return 1;
		} else if (arg0 == 8012) {
			class520 var42 = method8977(field661[--Statics.field659], null);
			class521.method3953(var42);
			return 1;
		} else if (arg0 == 8013) {
			int var43 = field660[--Statics.field1570];
			class520 var44 = method8977(field661[--Statics.field659], null);
			class521.method5683(var44, var43);
			return 1;
		} else if (arg0 == 8014) {
			Statics.field1570 -= 2;
			int var45 = field660[Statics.field1570];
			int var46 = field660[Statics.field1570 + 1];
			class520 var47 = method8977(field661[--Statics.field659], null);
			class521.method473(var47, var45, var46);
			return 1;
		} else if (arg0 == 8015) {
			Statics.field1570 -= 3;
			int var48 = field660[Statics.field1570];
			int var49 = field660[Statics.field1570 + 1];
			int var50 = field660[Statics.field1570 + 2];
			Statics.field659 -= 2;
			class520 var51 = method8977(field661[Statics.field659], null);
			class520 var52 = method8977(field661[Statics.field659 + 1], null);
			class521.method8273(var51, var52, var48, var49, var50);
			return 1;
		} else if (arg0 == 8016) {
			class520 var53 = method8977(field661[--Statics.field659], null);
			field660[++Statics.field1570 - 1] = (int) class521.method3683(var53);
			return 1;
		} else if (arg0 == 8017) {
			class520 var54 = method8977(field661[--Statics.field659], null);
			int var55 = field660[--Statics.field1570];
			field660[++Statics.field1570 - 1] = class521.method3030(var54, var55);
			return 1;
		} else if (arg0 == 8018) {
			Statics.field659 -= 2;
			String var56 = (String) field661[Statics.field659];
			String var57 = (String) field661[Statics.field659 + 1];
			field661[++Statics.field659 - 1] = Statics.method5665(var56, var57);
			return 1;
		} else if (arg0 == 8019) {
			Statics.field659 -= 2;
			class520 var58 = method8977(field661[Statics.field659], null);
			String var59 = (String) field661[Statics.field659 + 1];
			field661[++Statics.field659 - 1] = class521.method2357(var58, var59);
			return 1;
		} else if (arg0 == 8020) {
			Statics.field1570 -= 2;
			int var60 = field660[Statics.field1570];
			int var61 = field660[Statics.field1570 + 1];
			class191 var62 = class191.method3914(var61);
			if (var62.field2068 != var60) {
				throw new RuntimeException();
			}
			field661[++Statics.field659 - 1] = var62.method3993();
			return 1;
		} else if (arg0 == 8021) {
			Statics.field1570 -= 2;
			int var63 = field660[Statics.field1570];
			int var64 = field660[Statics.field1570 + 1];
			class191 var65 = class191.method3914(var64);
			if (var65.field2069 != var63) {
				throw new RuntimeException();
			}
			field661[++Statics.field659 - 1] = var65.method3990();
			return 1;
		} else if (arg0 == 8022) {
			Statics.field1570 -= 3;
			int var66 = field660[Statics.field1570];
			int var67 = field660[Statics.field1570 + 1];
			int var68 = field660[Statics.field1570 + 2];
			if (var68 < var67) {
				var68 = var67;
			}
			if (var67 < 0 || var67 > 5000 || var68 < 0 || var68 > 5000) {
				throw new RuntimeException();
			}
			if (var66 == 115) {
				field661[++Statics.field659 - 1] = new class520(class575.field5825, "", var67, var68);
			} else if (var66 == 105 || var66 == 49) {
				field661[++Statics.field659 - 1] = new class520(class575.field5821, 0, var67, var68);
			} else {
				field661[++Statics.field659 - 1] = new class520(class575.field5821, -1, var67, var68);
			}
			return 1;
		} else if (arg0 == 8023) {
			int var69 = field660[--Statics.field1570];
			class520 var70 = method8977(field661[--Statics.field659], null);
			if (var69 < 0 || var69 > 5000) {
				throw new RuntimeException();
			}
			var70.method9560(var69);
			return 1;
		} else if (arg0 == 8024) {
			int var71 = field660[--Statics.field1570];
			Object var72 = method2049(var71);
			class520 var73 = method8977(field661[--Statics.field659], null);
			Statics.method7586(var73, var73.method9545(), var72);
			return 1;
		} else if (arg0 == 8025) {
			Statics.field1570 -= 2;
			int var74 = field660[Statics.field1570];
			int var75 = field660[Statics.field1570 + 1];
			Object var76 = method2049(var75);
			class520 var77 = method8977(field661[--Statics.field659], null);
			Statics.method7586(var77, var74, var76);
			return 1;
		} else if (arg0 == 8026) {
			int var78 = field660[--Statics.field1570];
			class520 var79 = method8977(field661[--Statics.field659], null);
			Object var80 = class521.method92(var79, var78);
			method734(var79.field5505, var80);
			return 1;
		} else if (arg0 == 8027) {
			Statics.field659 -= 2;
			class520 var81 = method8977(field661[Statics.field659], null);
			class520 var82 = method8977(field661[Statics.field659 + 1], null);
			class521.method6332(var81, var82, var81.method9545());
			return 1;
		} else if (arg0 == 8028) {
			int var83 = field660[--Statics.field1570];
			Statics.field659 -= 2;
			class520 var84 = method8977(field661[Statics.field659], null);
			class520 var85 = method8977(field661[Statics.field659 + 1], null);
			class521.method6332(var84, var85, var83);
			return 1;
		} else if (arg0 == 8029) {
			Statics.field1570 -= 2;
			int var86 = field660[Statics.field1570];
			int var87 = field660[Statics.field1570 + 1];
			class520 var88 = method8977(field661[--Statics.field659], null);
			class521.method4040(var88, var86, var87);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("py.cr(ILcg;ZI)I")
	public static int method7688(int arg0, class56 arg1, boolean arg2) {
		if (arg0 == 13337) {
			field660[++Statics.field1570 - 1] = field654;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("qj.cb(IS)V")
	public static void method7990(int arg0) {
		if (arg0 == -1 || !Statics.field1555.method6865(arg0)) {
			return;
		}
		class370[] var1 = Statics.field1555.field4038[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			class370 var3 = var1[var2];
			if (var3.field4196 != null) {
				class66 var4 = new class66();
				var4.field894 = var3;
				var4.field899 = var3.field4196;
				method3525(var4, 5000000, 0);
			}
		}
	}

	@ObfuscatedName("kd.cu(ILna;ZB)V")
	public static void method5593(int arg0, class357 arg1, boolean arg2) {
		class290 var3 = client.method5050().method9851(arg0);
		int var4 = Statics.field1109.field934;
		int var5 = (Statics.field1109.field1056 >> 7) + Statics.field3837.field1165;
		int var6 = (Statics.field1109.field1057 >> 7) + Statics.field3837.field1166;
		class357 var7 = new class357(var4, var5, var6);
		client.method5050().method9983(var3, var7, arg1, arg2);
	}

	@ObfuscatedName("lh.cq(Lwv;B)Ljava/lang/Object;")
	public static Object method6275(class575 arg0) {
		if (arg0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		}
		switch(arg0.field5820) {
			case 0:
				return field660[--Statics.field1570];
			case 1:
				return field661[--Statics.field659];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
		}
	}

	@ObfuscatedName("cj.cn(IB)Ljava/lang/Object;")
	public static Object method2049(int arg0) {
		return arg0 == -1 ? null : method6275((class575) class432.method3817(class575.method10175(), arg0));
	}

	@ObfuscatedName("bx.cl(Lwv;Ljava/lang/Object;I)V")
	public static void method734(class575 arg0, Object arg1) {
		if (arg0 == null) {
			throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
		}
		switch(arg0.field5820) {
			case 0:
				field660[++Statics.field1570 - 1] = (Integer) arg1;
				break;
			case 1:
				field661[++Statics.field659 - 1] = arg1;
				break;
			default:
				throw new IllegalStateException("pushValueOfType() failure - unsupported type");
		}
	}

	@ObfuscatedName("fh.cx(Loi;I)V")
	public static void method3637(class370 arg0) {
		arg0.method7357();
		arg0.method7358().method7064(new class87(arg0));
		arg0.method7358().method7035(new class88(arg0));
	}

	@ObfuscatedName("lx.cv(Loi;Loi;I)V")
	public static void method6273(class370 arg0, class370 arg1) {
		if (arg0.field4148 == 0) {
			for (int var2 = arg0.field4249; var2 <= arg0.field4215; var2++) {
				class370 var3 = arg1.field4287[var2];
				if (var3 != null && arg0.field4146 == var3.field4166) {
					method6273(var3, arg1);
				}
			}
		}
		arg1.field4287[arg0.field4146] = null;
	}

	@ObfuscatedName("ss.ca(Ljava/lang/Object;Ljava/lang/String;I)Lti;")
	public static class520 method8977(Object arg0, String arg1) {
		if (arg0 == null) {
			throw new RuntimeException();
		}
		return (class520) arg0;
	}
}
