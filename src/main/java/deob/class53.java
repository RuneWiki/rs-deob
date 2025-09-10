package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@ObfuscatedName("cw")
public class class53 {

	@ObfuscatedName("cw.bn")
	public static int field732;

	@ObfuscatedName("cw.bh")
	public static int field734;

	@ObfuscatedName("cw.bk")
	public static String field731;

	@ObfuscatedName("cw.bp")
	public static int field754;

	@ObfuscatedName("cw.br")
	public static int field736;

	@ObfuscatedName("cw.bf")
	public static String field737;

	@ObfuscatedName("cw.bw")
	public static String field727;

	@ObfuscatedName("cw.cw")
	public static int field739;

	@ObfuscatedName("cw.cz")
	public static String[] field740;

	@ObfuscatedName("cw.ci")
	public static boolean field744;

	@ObfuscatedName("cw.ca")
	public static int field742;

	@ObfuscatedName("cw.cd")
	public static int field759;

	@ObfuscatedName("cw.co")
	public static String field766;

	@ObfuscatedName("cw.ck")
	public static String field745;

	@ObfuscatedName("cw.ct")
	public static String field746;

	@ObfuscatedName("cw.ch")
	public static String field747;

	@ObfuscatedName("cw.cs")
	public static String field748;

	@ObfuscatedName("cw.ds")
	public static boolean field728;

	@ObfuscatedName("cw.dt")
	public static boolean field750;

	@ObfuscatedName("cw.da")
	public static int field751;

	@ObfuscatedName("cw.dc")
	public static String field752;

	@ObfuscatedName("cw.dp")
	public static String field738;

	@ObfuscatedName("cw.dw")
	public static boolean field741;

	@ObfuscatedName("cw.dg")
	public static int field749;

	@ObfuscatedName("cw.dl")
	public static int field756;

	@ObfuscatedName("cw.dv")
	public static int field757;

	@ObfuscatedName("cw.dk")
	public static long field758;

	@ObfuscatedName("cw.dn")
	public static long field735;

	@ObfuscatedName("cw.df")
	public static String[] field760;

	@ObfuscatedName("cw.dx")
	public static String[] field761;

	@ObfuscatedName("cw.di")
	public static String[] field762;

	static {
		new DecimalFormat("##0.00");
		new class143();
		field732 = 0;
		field734 = 10;
		field731 = "";
		field754 = -1;
		field736 = 1;
		field737 = "";
		field727 = "";
		field739 = 0;
		field740 = new String[8];
		field744 = true;
		field742 = field732 + 202;
		field759 = 0;
		field766 = "";
		field745 = "";
		field746 = "";
		field747 = "";
		field748 = "";
		field728 = false;
		field750 = false;
		field751 = 0;
		field752 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		field738 = "1234567890";
		field741 = false;
		field749 = -1;
		field756 = 0;
		field757 = 0;
		field758 = -1L;
		field735 = -1L;
		field760 = new String[] { "title.jpg" };
		field761 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
		field762 = new String[] { "logo_speedrunning", "logo_ugc_world" };
	}

	public class53() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("iv.af(Lpx;I)I")
	public static int method4713(class413 arg0) {
		int var1 = field761.length + field760.length;
		String[] var2 = field762;
		for (int var3 = 0; var3 < var2.length; var3++) {
			String var4 = var2[var3];
			if (arg0.method7715(var4) != -1) {
				var1++;
			}
		}
		return var1;
	}

	@ObfuscatedName("hm.aw(Lpx;Lpx;Lud;ZII)V")
	public static void method4016(class413 arg0, class413 arg1, class524 arg2, boolean arg3, int arg4) {
		if (!Statics.field10) {
			if (arg4 == 0) {
				method6798(arg3);
			} else {
				method2628(arg4);
			}
			class602.method10678();
			byte[] var5 = arg0.method7723("title.jpg", "");
			Statics.field773 = class31.method3863(var5);
			Statics.field4895 = Statics.field773.method10807();
			method3422(arg1, client.field386);
			Statics.field5308 = class607.method2059(arg1, "titlebox", "");
			Statics.field2176 = class607.method2059(arg1, "titlebutton", "");
			Statics.field626 = class607.method2059(arg1, "titlebutton_large", "");
			Statics.field2258 = class607.method2059(arg1, "play_now_text", "");
			class607.method2059(arg1, "titlebutton_wide42,1", "");
			Statics.field5150 = class607.method3781(arg1, "runes", "");
			Statics.field274 = class607.method3781(arg1, "title_mute", "");
			Statics.field3341 = class607.method2059(arg1, "options_radio_buttons,0", "");
			Statics.field4417 = class607.method2059(arg1, "options_radio_buttons,4", "");
			Statics.field2174 = class607.method2059(arg1, "options_radio_buttons,2", "");
			Statics.field1965 = class607.method2059(arg1, "options_radio_buttons,6", "");
			Statics.field175 = Statics.field3341.field6008;
			Statics.field5578 = Statics.field3341.field6011;
			Statics.field1804 = new class78(Statics.field5150, arg2.field5536);
			if (arg3) {
				field737 = "";
				field727 = "";
				field740 = new String[8];
				field739 = 0;
			}
			Statics.field258 = 0;
			Statics.field5241 = "";
			field744 = true;
			field741 = false;
			if (Statics.field240.method2510()) {
				class340.method5500(0, 0);
			} else {
				class340.method5500(0, 0);
				ArrayList var6 = new ArrayList();
				var6.add(new class352(Statics.field4043, "scape main", "", 255, false));
				class340.method5668(var6, 0, 0, 0, 100, false);
			}
			class340.method3684();
			class414 var7 = Statics.field3419;
			var7.method7786(false);
			Statics.field10 = true;
			field732 = (Statics.field208 - 765) / 2;
			field742 = field732 + 202;
			Statics.field3398 = field742 + 180;
			Statics.field773.method10817(field732, 0);
			Statics.field4895.method10817(field732 + 382, 0);
			Statics.field1687.method10780(field732 + 382 - Statics.field1687.field6008 / 2, 18);
		} else if (arg4 == 4) {
			method2628(4);
		}
	}

	@ObfuscatedName("hk.at(ZZI)Lxc;")
	public static class605 method3986(boolean arg0, boolean arg1) {
		return arg0 ? (arg1 ? Statics.field1965 : Statics.field2174) : (arg1 ? Statics.field4417 : Statics.field3341);
	}

	@ObfuscatedName("ex.ac(Lpx;IB)V")
	public static void method3422(class413 arg0, int arg1) {
		if ((arg1 & class583.field5882.method34()) != 0) {
			Statics.field1687 = class607.method2059(arg0, "logo_deadman_mode", "");
		} else if ((arg1 & class583.field5879.method34()) != 0) {
			Statics.field1687 = class607.method2059(arg0, "logo_seasonal_mode", "");
		} else if ((arg1 & class583.field5857.method34()) != 0) {
			Statics.field1687 = class607.method2059(arg0, "logo_speedrunning", "");
		} else if ((arg1 & class583.field5853.method34()) == 0) {
			Statics.field1687 = class607.method2059(arg0, "logo", "");
		} else {
			Statics.field1687 = class607.method2059(arg0, "logo_ugc_world", "");
		}
	}

	@ObfuscatedName("km.ap(Lbl;Lrv;Lrv;B)V")
	public static void method5645(class35 arg0, class462 arg1, class462 arg2) {
		if (field741) {
			class275 var3 = client.field552;
			class275 var4 = var3;
			while (true) {
				if (!var4.method5691()) {
					if (class36.field223 != 1 && (Statics.field5059 || class36.field223 != 4)) {
						break;
					}
					int var5 = field732 + 280;
					if (class36.field222 >= var5 && class36.field222 <= var5 + 14 && class36.field225 >= 4 && class36.field225 <= 18) {
						class45.method4239(0, 0);
						break;
					}
					if (class36.field222 >= var5 + 15 && class36.field222 <= var5 + 80 && class36.field225 >= 4 && class36.field225 <= 18) {
						class45.method4239(0, 1);
						break;
					}
					int var6 = field732 + 390;
					if (class36.field222 >= var6 && class36.field222 <= var6 + 14 && class36.field225 >= 4 && class36.field225 <= 18) {
						class45.method4239(1, 0);
						break;
					}
					if (class36.field222 >= var6 + 15 && class36.field222 <= var6 + 80 && class36.field225 >= 4 && class36.field225 <= 18) {
						class45.method4239(1, 1);
						break;
					}
					int var7 = field732 + 500;
					if (class36.field222 >= var7 && class36.field222 <= var7 + 14 && class36.field225 >= 4 && class36.field225 <= 18) {
						class45.method4239(2, 0);
						break;
					}
					if (class36.field222 >= var7 + 15 && class36.field222 <= var7 + 80 && class36.field225 >= 4 && class36.field225 <= 18) {
						class45.method4239(2, 1);
						break;
					}
					int var8 = field732 + 610;
					if (class36.field222 >= var8 && class36.field222 <= var8 + 14 && class36.field225 >= 4 && class36.field225 <= 18) {
						class45.method4239(3, 0);
						break;
					}
					if (class36.field222 >= var8 + 15 && class36.field222 <= var8 + 80 && class36.field225 >= 4 && class36.field225 <= 18) {
						class45.method4239(3, 1);
						break;
					}
					if (class36.field222 >= field732 + 708 && class36.field225 >= 4 && class36.field222 <= field732 + 708 + 50 && class36.field225 <= 20) {
						method9654();
						break;
					}
					if (field749 == -1) {
						if (field756 > 0 && Statics.field3378 != null && class36.field222 >= 0 && class36.field222 <= Statics.field3378.field6008 && class36.field225 >= Statics.field4810 / 2 - 50 && class36.field225 <= Statics.field4810 / 2 + 50) {
							field756--;
						}
						if (field756 < field757 && Statics.field4958 != null && class36.field222 >= Statics.field208 - Statics.field4958.field6008 - 5 && class36.field222 <= Statics.field208 && class36.field225 >= Statics.field4810 / 2 - 50 && class36.field225 <= Statics.field4810 / 2 + 50) {
							field756++;
						}
					} else {
						class45 var9 = Statics.field625[field749];
						boolean var10 = Statics.method9398(client.field386, class583.field5866);
						boolean var11 = var9.method1441();
						Statics.field5442 = var11;
						var9.field639 = var11 ? "beta" : var9.field639;
						method4091(var9);
						method9654();
						if (var10 != var11) {
							client.method3816();
						}
					}
					break;
				}
				if (var4.field3213 == 13) {
					method9654();
					break;
				}
				if (var4.field3213 == 96) {
					if (field756 > 0 && Statics.field3378 != null) {
						field756--;
					}
				} else if (var4.field3213 == 97 && field756 < field757 && Statics.field4958 != null) {
					field756++;
				}
			}
			return;
		}
		if ((class36.field223 == 1 || !Statics.field5059 && class36.field223 == 4) && class36.field222 >= field732 + 765 - 50 && class36.field225 >= 453 && class36.field222 < field732 + 765 && class36.field225 < 503) {
			Statics.field240.method2511(!Statics.field240.method2510());
			if (Statics.field240.method2510()) {
				class340.method5500(0, 0);
			} else {
				class340.method5500(0, 0);
				ArrayList var12 = new ArrayList();
				var12.add(new class352(Statics.field4043, "scape main", "", 255, false));
				class340.method5668(var12, 0, 0, 0, 100, false);
			}
			class340.method3684();
		}
		if (client.field328 == 5) {
			return;
		}
		if (field758 == -1L) {
			field758 = class335.method3987() + 1000L;
		}
		long var13 = class335.method3987();
		if (client.method2888() && field735 == -1L) {
			field735 = var13;
			if (field735 > field758) {
				field758 = field735;
			}
		}
		if (client.field328 != 10 && client.field328 != 11) {
			return;
		}
		if (class433.field5101 == Statics.field2971) {
			if (class36.field223 == 1 || !Statics.field5059 && class36.field223 == 4) {
				int var15 = field732 + 5;
				short var16 = 463;
				byte var17 = 100;
				byte var18 = 35;
				if (class36.field222 >= var15 && class36.field222 <= var15 + var17 && class36.field225 >= var16 && class36.field225 <= var16 + var18) {
					if (class45.method2106()) {
						field741 = true;
						field756 = 0;
						field757 = 0;
					}
					return;
				}
			}
			if (Statics.field631 != null && class45.method2106()) {
				field741 = true;
				field756 = 0;
				field757 = 0;
			}
		}
		int var19 = class36.field223;
		int var20 = class36.field222;
		int var21 = class36.field225;
		if (var19 == 0) {
			var20 = class36.field232;
			var21 = class36.field221;
		}
		if (!Statics.field5059 && var19 == 4) {
			var19 = 1;
		}
		class275 var22 = client.field552;
		class275 var23 = var22;
		if (field759 == 0) {
			boolean var24 = false;
			while (var23.method5691()) {
				if (var23.field3213 == 84) {
					var24 = true;
				}
			}
			int var25 = Statics.field3398 - 80;
			short var26 = 291;
			if (var19 == 1 && var20 >= var25 - 75 && var20 <= var25 + 75 && var21 >= var26 - 20 && var21 <= var26 + 20) {
				class32.method325(client.method4455("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
			}
			int var27 = Statics.field3398 + 80;
			if (var19 == 1 && var20 >= var27 - 75 && var20 <= var27 + 75 && var21 >= var26 - 20 && var21 <= var26 + 20 || var24) {
				method737();
			}
		} else if (field759 == 1) {
			boolean var28 = Statics.field5520.method793() || Statics.field5520.method1384() || Statics.field5520.method794();
			while (var23.method5691()) {
				if (var23.field3213 == 84) {
					if (var28) {
						method2114(class394.field4569, class394.field4710, class394.field4711);
						client.field331 = class596.field5975;
						client.method6470(false);
						client.method3384(20);
					} else {
						method5594(false);
					}
					return;
				}
				if (var23.field3213 == 13) {
					method6798(true);
					return;
				}
			}
			int var29 = Statics.field3398 - 80;
			short var30 = 321;
			if (var19 == 1 && var20 >= var29 - 75 && var20 <= var29 + 75 && var21 >= var30 - 20 && var21 <= var30 + 20) {
				if (var28) {
					method2114(class394.field4569, class394.field4710, class394.field4711);
					client.field331 = class596.field5975;
					client.method6470(false);
					client.method3384(20);
				} else {
					method5594(false);
				}
				return;
			}
			int var31 = Statics.field3398 + 80;
			if (var19 == 1 && var20 >= var31 - 75 && var20 <= var31 + 75 && var21 >= var30 - 20 && var21 <= var30 + 20) {
				method6798(true);
				return;
			}
		} else if (field759 == 2) {
			short var32 = 201;
			int var126 = var32 + 52;
			if (var19 == 1 && var21 >= var126 - 12 && var21 < var126 + 2) {
				field751 = 0;
			}
			var126 += 15;
			if (var19 == 1 && var21 >= var126 - 12 && var21 < var126 + 2) {
				field751 = 1;
			}
			var126 += 15;
			short var33 = 361;
			if (Statics.field5448 != null) {
				int var34 = Statics.field5448.field5163 / 2;
				if (var19 == 1 && var20 >= Statics.field5448.field5161 - var34 && var20 <= Statics.field5448.field5161 + var34 && var21 >= var33 - 15 && var21 < var33) {
					switch(field736) {
						case 1:
							class32.method325(class394.field4674, true, false);
							return;
						case 2:
							class32.method325("https://support.runescape.com/hc/en-gb", true, false);
					}
				}
			}
			int var35 = Statics.field3398 - 80;
			short var36 = 321;
			if (var19 == 1 && var20 >= var35 - 75 && var20 <= var35 + 75 && var21 >= var36 - 20 && var21 <= var36 + 20) {
				method3524();
				return;
			}
			int var37 = field742 + 180 + 80;
			if (var19 == 1 && var20 >= var37 - 75 && var20 <= var37 + 75 && var21 >= var36 - 20 && var21 <= var36 + 20) {
				method2628(0);
				field737 = "";
				field727 = "";
				Statics.field258 = 0;
				Statics.field5241 = "";
				field744 = true;
			}
			int var38 = Statics.field3398 + -117;
			short var39 = 277;
			field728 = var20 >= var38 && var20 < Statics.field175 + var38 && var21 >= var39 && var21 < Statics.field5578 + var39;
			if (var19 == 1 && field728) {
				client.field332 = !client.field332;
				if (!client.field332 && Statics.field240.method2548() != null) {
					Statics.field240.method2539(null);
				}
			}
			int var40 = Statics.field3398 + 24;
			short var41 = 277;
			field750 = var20 >= var40 && var20 < Statics.field175 + var40 && var21 >= var41 && var21 < Statics.field5578 + var41;
			if (var19 == 1 && field750) {
				Statics.field240.method2509(!Statics.field240.method2508());
				if (!Statics.field240.method2508()) {
					field737 = "";
					Statics.field240.method2539(null);
					if (!client.field332 || field737 == null || field737.isEmpty()) {
						field751 = 0;
					} else {
						field751 = 1;
					}
				}
			}
			label1173: while (true) {
				Transferable var45;
				int var46;
				do {
					while (true) {
						label1137: do {
							while (true) {
								while (var23.method5691()) {
									if (var23.field3213 == 13) {
										method2628(0);
										field737 = "";
										field727 = "";
										Statics.field258 = 0;
										Statics.field5241 = "";
										field744 = true;
									} else {
										if (field751 != 0) {
											continue label1137;
										}
										method79(var23.field3216);
										if (var23.field3213 == 85 && !field737.isEmpty()) {
											field737 = field737.substring(0, field737.length() - 1);
										}
										if (var23.field3213 == 84 || var23.field3213 == 80) {
											field751 = 1;
										}
										char var42 = var23.field3216;
										boolean var43 = field752.indexOf(var42) != -1;
										if (var43 && field737.length() < 320) {
											field737 = field737 + var23.field3216;
										}
									}
								}
								return;
							}
						} while (field751 != 1);
						if (var23.field3213 == 85 && !field727.isEmpty()) {
							field727 = field727.substring(0, field727.length() - 1);
						} else if (var23.field3213 == 84 || var23.field3213 == 80) {
							field751 = 0;
							if (var23.field3213 == 84) {
								method3524();
								return;
							}
						}
						if ((var23.method5701(82) || var23.method5701(87)) && var23.field3213 == 67) {
							Clipboard var44 = Toolkit.getDefaultToolkit().getSystemClipboard();
							var45 = var44.getContents(Statics.field5520);
							var46 = 20 - field727.length();
							break;
						}
						if (class444.method6535(var23.field3216)) {
							char var54 = var23.field3216;
							boolean var55 = field752.indexOf(var54) != -1;
							if (var55 && field727.length() < 20) {
								field727 = field727 + var23.field3216;
							}
						}
					}
				} while (var46 <= 0);
				try {
					String var47 = (String) var45.getTransferData(DataFlavor.stringFlavor);
					int var48 = Math.min(var46, var47.length());
					int var49 = 0;
					while (true) {
						if (var49 >= var48) {
							field727 = field727 + var47.substring(0, var48);
							continue label1173;
						}
						if (!class444.method6535(var47.charAt(var49))) {
							break;
						}
						char var50 = var47.charAt(var49);
						boolean var51 = field752.indexOf(var50) != -1;
						if (!var51) {
							break;
						}
						var49++;
					}
					method2628(3);
					return;
				} catch (UnsupportedFlavorException var124) {
				} catch (IOException var125) {
				}
			}
		} else if (field759 == 3) {
			int var56 = field742 + 180;
			short var57 = 241;
			class450 var58 = arg1.method8762(25, class394.field4730.length() - 34, class394.field4730, var56, var57);
			if (var19 == 1 && var58.method8320(var20, var21)) {
				class32.method325(class394.field4655, true, false);
			}
			int var59 = field742 + 180;
			short var60 = 276;
			if (var19 == 1 && var20 >= var59 - 75 && var20 <= var59 + 75 && var21 >= var60 - 20 && var21 <= var60 + 20) {
				method6798(false);
			}
			int var61 = field742 + 180;
			short var62 = 326;
			if (var19 == 1 && var20 >= var61 - 75 && var20 <= var61 + 75 && var21 >= var62 - 20 && var21 <= var62 + 20) {
				class32.method325(class394.field4674, true, false);
				return;
			}
		} else if (field759 == 4) {
			int var63 = field742 + 180 - 80;
			short var64 = 321;
			if (var19 == 1 && var20 >= var63 - 75 && var20 <= var63 + 75 && var21 >= var64 - 20 && var21 <= var64 + 20) {
				method777();
				return;
			}
			if (var19 == 1 && var20 >= field742 + 180 - 9 && var20 <= field742 + 180 + 130 && var21 >= 263 && var21 <= 296) {
				field744 = !field744;
			}
			if (var19 == 1 && var20 >= field742 + 180 - 34 && var20 <= field742 + 180 + 34 && var21 >= 351 && var21 <= 363) {
				class32.method325(class394.field4674, true, false);
			}
			int var65 = field742 + 180 + 80;
			if (var19 == 1 && var20 >= var65 - 75 && var20 <= var65 + 75 && var21 >= var64 - 20 && var21 <= var64 + 20) {
				method2628(0);
				field737 = "";
				field727 = "";
				Statics.field258 = 0;
				Statics.field5241 = "";
			}
			while (var23.method5691()) {
				boolean var66 = false;
				for (int var67 = 0; var67 < field738.length(); var67++) {
					if (var23.field3216 == field738.charAt(var67)) {
						var66 = true;
						break;
					}
				}
				if (var23.field3213 == 13) {
					method2628(0);
					field737 = "";
					field727 = "";
					Statics.field258 = 0;
					Statics.field5241 = "";
				} else {
					if (var23.field3213 == 85 && !Statics.field5241.isEmpty()) {
						Statics.field5241 = Statics.field5241.substring(0, Statics.field5241.length() - 1);
					}
					if (var23.field3213 == 84) {
						method777();
						return;
					}
					if (var66 && Statics.field5241.length() < 6) {
						Statics.field5241 = Statics.field5241 + var23.field3216;
					}
				}
			}
		} else if (field759 == 5) {
			int var68 = field742 + 180 - 80;
			short var69 = 321;
			if (var19 == 1 && var20 >= var68 - 75 && var20 <= var68 + 75 && var21 >= var69 - 20 && var21 <= var69 + 20) {
				method2099();
				return;
			}
			int var70 = field742 + 180 + 80;
			if (var19 == 1 && var20 >= var70 - 75 && var20 <= var70 + 75 && var21 >= var69 - 20 && var21 <= var69 + 20) {
				method5594(true);
			}
			short var71 = 361;
			if (Statics.field5586 != null) {
				int var72 = Statics.field5586.field5163 / 2;
				if (var19 == 1 && var20 >= Statics.field5586.field5161 - var72 && var20 <= Statics.field5586.field5161 + var72 && var21 >= var71 - 15 && var21 < var71) {
					class32.method325(client.method4455("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
				}
			}
			while (var23.method5691()) {
				boolean var73 = false;
				for (int var74 = 0; var74 < field752.length(); var74++) {
					if (var23.field3216 == field752.charAt(var74)) {
						var73 = true;
						break;
					}
				}
				if (var23.field3213 == 13) {
					method5594(true);
				} else {
					if (var23.field3213 == 85 && !field737.isEmpty()) {
						field737 = field737.substring(0, field737.length() - 1);
					}
					if (var23.field3213 == 84) {
						method2099();
						return;
					}
					if (var73 && field737.length() < 320) {
						field737 = field737 + var23.field3216;
					}
				}
			}
		} else if (field759 == 6) {
			while (true) {
				do {
					if (!var23.method5691()) {
						short var75 = 321;
						if (var19 == 1 && var21 >= var75 - 20 && var21 <= var75 + 20) {
							method5594(true);
						}
						return;
					}
				} while (var23.field3213 != 84 && var23.field3213 != 13);
				method5594(true);
			}
		} else if (field759 == 7) {
			if (Statics.field5782 && !client.field592) {
				int var76 = Statics.field3398 - 150;
				int var77 = var76 + 240 + 25 + 40;
				short var78 = 231;
				int var79 = var78 + 40;
				if (var19 == 1 && var20 >= var76 && var20 <= var77 && var21 >= var78 && var21 <= var79) {
					field739 = method3881(var76, var20);
				}
				int var80 = field742 + 180 - 80;
				short var81 = 321;
				if (var19 == 1 && var20 >= var80 - 75 && var20 <= var80 + 75 && var21 >= var81 - 20 && var21 <= var81 + 20) {
					boolean var82 = method9700();
					if (var82) {
						client.method3384(50);
						return;
					}
				}
				int var83 = field742 + 180 + 80;
				if (var19 == 1 && var20 >= var83 - 75 && var20 <= var83 + 75 && var21 >= var81 - 20 && var21 <= var81 + 20) {
					field740 = new String[8];
					method5594(true);
				}
				while (var23.method5691()) {
					if (var23.field3213 == 101) {
						field740[field739] = null;
					}
					if (var23.field3213 == 85) {
						if (field740[field739] == null && field739 > 0) {
							field739--;
						}
						field740[field739] = null;
					}
					if (var23.field3216 >= '0' && var23.field3216 <= '9') {
						field740[field739] = "" + var23.field3216;
						if (field739 < 7) {
							field739++;
						}
					}
					if (var23.field3213 == 84) {
						boolean var84 = method9700();
						if (var84) {
							client.method3384(50);
						}
						return;
					}
				}
			} else {
				int var85 = field742 + 180 - 80;
				short var86 = 321;
				if (var19 == 1 && var20 >= var85 - 75 && var20 <= var85 + 75 && var21 >= var86 - 20 && var21 <= var86 + 20) {
					class32.method325(client.method4455("secure", true) + "m=dob/set_dob.ws", true, false);
					method2114(class394.field4740, class394.field4722, class394.field4742);
					method2628(6);
					return;
				}
				int var87 = field742 + 180 + 80;
				if (var19 == 1 && var20 >= var87 - 75 && var20 <= var87 + 75 && var21 >= var86 - 20 && var21 <= var86 + 20) {
					method5594(true);
				}
			}
		} else if (field759 == 8) {
			int var88 = field742 + 180 - 80;
			short var89 = 321;
			if (var19 == 1 && var20 >= var88 - 75 && var20 <= var88 + 75 && var21 >= var89 - 20 && var21 <= var89 + 20) {
				class32.method325("https://www.jagex.com/terms/privacy", true, false);
				method2114(class394.field4740, class394.field4722, class394.field4742);
				method2628(6);
				return;
			}
			int var90 = field742 + 180 + 80;
			if (var19 == 1 && var20 >= var90 - 75 && var20 <= var90 + 75 && var21 >= var89 - 20 && var21 <= var89 + 20) {
				method5594(true);
			}
		} else if (field759 == 9) {
			int var91 = field742 + 180;
			short var92 = 311;
			if (var22.field3213 == 84 || var22.field3213 == 13 || var19 == 1 && var20 >= var91 - 75 && var20 <= var91 + 75 && var21 >= var92 - 20 && var21 <= var92 + 20) {
				method6798(false);
			}
		} else if (field759 == 10) {
			int var93 = field742 + 180;
			short var94 = 209;
			if (var22.field3213 == 84 || var19 == 1 && var20 >= var93 - 109 && var20 <= var93 + 109 && var21 >= var94 && var21 <= var94 + 68) {
				if (method394()) {
					return;
				}
				method2114(class394.field4569, class394.field4710, class394.field4711);
				client.field331 = class596.field5975;
				client.method6470(false);
				client.method3384(20);
			}
		} else if (field759 == 12) {
			int var95 = Statics.field3398;
			short var96 = 233;
			class450 var97 = arg2.method8762(0, 30, class394.field4772, var95, var96);
			class450 var98 = arg2.method8762(32, 32, class394.field4772, var95, var96);
			class450 var99 = arg2.method8762(70, 34, class394.field4772, var95, var96);
			int var127 = var96 + 17;
			class450 var100 = arg2.method8762(0, 34, class394.field4773, var95, var127);
			if (var19 == 1) {
				if (var97.method8320(var20, var21)) {
					class32.method325("https://www.jagex.com/terms", true, false);
				} else if (var98.method8320(var20, var21)) {
					class32.method325("https://www.jagex.com/terms/privacy", true, false);
				} else if (var99.method8320(var20, var21) || var100.method8320(var20, var21)) {
					class32.method325("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
				}
			}
			int var101 = Statics.field3398 - 80;
			short var102 = 311;
			if (var19 == 1 && var20 >= var101 - 75 && var20 <= var101 + 75 && var21 >= var102 - 20 && var21 <= var102 + 20) {
				Statics.field240.method2578(client.field389);
				method6798(true);
			}
			int var103 = Statics.field3398 + 80;
			if (var19 == 1 && var20 >= var103 - 75 && var20 <= var103 + 75 && var21 >= var102 - 20 && var21 <= var102 + 20) {
				field759 = 13;
			}
		} else if (field759 == 13) {
			int var104 = Statics.field3398;
			short var105 = 321;
			if (var19 == 1 && var20 >= var104 - 75 && var20 <= var104 + 75 && var21 >= var105 - 20 && var21 <= var105 + 20) {
				method6798(true);
			}
		} else if (field759 == 14) {
			String var106 = "";
			switch(field754) {
				case 0:
					var106 = "https://secure.runescape.com/m=offence-appeal/account-history";
					break;
				case 1:
					var106 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
					break;
				case 2:
					var106 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
					break;
				default:
					method5594(false);
			}
			int var107 = field742 + 180;
			short var108 = 276;
			if (var19 == 1 && var20 >= var107 - 75 && var20 <= var107 + 75 && var21 >= var108 - 20 && var21 <= var108 + 20) {
				class32.method325(var106, true, false);
				method2114(class394.field4740, class394.field4722, class394.field4742);
				method2628(6);
				return;
			}
			int var109 = field742 + 180;
			short var110 = 326;
			if (var19 == 1 && var20 >= var109 - 75 && var20 <= var109 + 75 && var21 >= var110 - 20 && var21 <= var110 + 20) {
				method5594(false);
			}
		} else if (field759 == 24) {
			int var111 = field742 + 180;
			short var112 = 301;
			if (var19 == 1 && var20 >= var111 - 75 && var20 <= var111 + 75 && var21 >= var112 - 20 && var21 <= var112 + 20) {
				method6798(false);
			}
		} else if (field759 == 32) {
			int var113 = field742 + 180 - 80;
			short var114 = 321;
			if (var19 == 1 && var20 >= var113 - 75 && var20 <= var113 + 75 && var21 >= var114 - 20 && var21 <= var114 + 20) {
				class32.method325(client.method4455("secure", true) + "m=dob/set_dob.ws", true, false);
				method2114(class394.field4740, class394.field4722, class394.field4742);
				method2628(6);
				return;
			}
			int var115 = field742 + 180 + 80;
			if (var19 == 1 && var20 >= var115 - 75 && var20 <= var115 + 75 && var21 >= var114 - 20 && var21 <= var114 + 20) {
				method5594(true);
			}
		} else if (field759 == 33) {
			int var116 = field742 + 180;
			short var117 = 276;
			if (var19 == 1 && var20 >= var116 - 75 && var20 <= var116 + 75 && var21 >= var117 - 20 && var21 <= var117 + 20) {
				class32.method325(class394.field4655, true, false);
			}
			int var118 = field742 + 180;
			short var119 = 326;
			if (var19 == 1 && var20 >= var118 - 75 && var20 <= var118 + 75 && var21 >= var119 - 20 && var21 <= var119 + 20) {
				method5594(true);
			}
		} else if (field759 == 34) {
			int var120 = field742 + 180;
			short var121 = 276;
			if (var19 == 1 && var20 >= var120 - 75 && var20 <= var120 + 75 && var21 >= var121 - 20 && var21 <= var121 + 20) {
				if (class45.method2106()) {
					field741 = true;
					field756 = 0;
					field757 = 0;
				}
				return;
			}
			if (Statics.field631 != null && class45.method2106()) {
				field741 = true;
				field756 = 0;
				field757 = 0;
			}
			int var122 = field742 + 180;
			short var123 = 326;
			if (var19 == 1 && var20 >= var122 - 75 && var20 <= var122 + 75 && var21 >= var123 - 20 && var21 <= var123 + 20) {
				method5594(false);
			}
		}
	}

	@ObfuscatedName("be.aq(I)V")
	public static void method777() {
		Statics.field5241.trim();
		if (Statics.field5241.length() != 6) {
			method2114(class394.field4603, class394.field4519, class394.field4641);
			return;
		}
		Statics.field258 = Integer.parseInt(Statics.field5241);
		Statics.field5241 = "";
		client.method6470(true);
		method2114(class394.field4569, class394.field4710, class394.field4711);
		client.method3384(20);
	}

	@ObfuscatedName("fy.ao(B)V")
	public static void method3524() {
		field737 = field737.trim();
		if (field737.isEmpty()) {
			method2114(class394.field4781, class394.field4600, class394.field4601);
		} else if (field727.isEmpty()) {
			method2114(class394.field4602, class394.field4571, class394.field4604);
		} else {
			method2114(class394.field4569, class394.field4710, class394.field4711);
			client.method6470(false);
			client.method3384(20);
		}
	}

	@ObfuscatedName("az.as(B)Z")
	public static boolean method394() {
		if ((client.field386 & class583.field5864.method34()) != 0) {
			field766 = "";
			field745 = class394.field4705;
			field746 = class394.field4706;
			field747 = class394.field4707;
			method2628(1);
			return true;
		} else if ((client.field386 & class583.field5852.method34()) != 0) {
			if ((client.field386 & class583.field5860.method34()) == 0) {
				field745 = class394.field4658;
				field746 = class394.field4697;
				field747 = class394.field4698;
			} else {
				field745 = class394.field4702;
				field746 = class394.field4703;
				field747 = class394.field4509;
			}
			field766 = class394.field4695;
			method2628(1);
			return true;
		} else if ((client.field386 & class583.field5860.method34()) == 0) {
			return false;
		} else {
			field745 = class394.field4699;
			field746 = class394.field4700;
			field747 = class394.field4555;
			field766 = class394.field4695;
			method2628(1);
			return true;
		}
	}

	@ObfuscatedName("bq.al(B)V")
	public static void method737() {
		if (!method394()) {
			method5594(false);
		} else if (!client.field332 || field737 == null || field737.isEmpty()) {
			field751 = 0;
		} else {
			field751 = 1;
		}
	}

	@ObfuscatedName("uj.au(I)Z")
	public static boolean method9700() {
		Date var6;
		try {
			SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
			var0.setLenient(false);
			StringBuilder var1 = new StringBuilder();
			String[] var2 = field740;
			int var3 = 0;
			while (true) {
				Date var5;
				if (var3 < var2.length) {
					String var4 = var2[var3];
					if (var4 != null) {
						var1.append(var4);
						var3++;
						continue;
					}
					method1864("Date not valid.", "Please ensure all characters are populated.", "");
					var5 = null;
				} else {
					var1.append("12");
					var5 = var0.parse(var1.toString());
				}
				var6 = var5;
				break;
			}
		} catch (ParseException var10) {
			method1864("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}
		if (var6 == null) {
			return false;
		}
		boolean var8 = method4624(var6);
		boolean var9 = method3443(var6);
		if (!var9) {
			method1864("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}
		if (var8) {
			Statics.field5779 = (int) (var6.getTime() / 86400000L - 11745L);
		} else {
			Statics.field5779 = 8388607;
		}
		return true;
	}

	@ObfuscatedName("eh.ai(Ljava/util/Date;I)Z")
	public static boolean method3443(Date arg0) {
		Calendar var1 = Calendar.getInstance();
		var1.set(2, 0);
		var1.set(5, 1);
		var1.set(1, 1900);
		Date var2 = var1.getTime();
		return arg0.after(var2);
	}

	@ObfuscatedName("ii.aa(Ljava/util/Date;B)Z")
	public static boolean method4624(Date arg0) {
		Calendar var1 = Calendar.getInstance();
		var1.set(1, var1.get(1) - 13);
		var1.set(5, var1.get(5) + 1);
		var1.set(11, 0);
		var1.set(12, 0);
		var1.set(13, 0);
		var1.set(14, 0);
		Date var2 = var1.getTime();
		return arg0.before(var2);
	}

	@ObfuscatedName("bc.am(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method1864(String arg0, String arg1, String arg2) {
		method2628(7);
		method2114(arg0, arg1, arg2);
	}

	@ObfuscatedName("hj.an(IIB)I")
	public static int method3881(int arg0, int arg1) {
		for (int var2 = 0; var2 < 8; var2++) {
			if (arg1 <= arg0 + 30) {
				return var2;
			}
			int var3 = arg0 + 30;
			arg0 = var3 + (var2 == 1 || var2 == 3 ? 20 : 5);
		}
		return 0;
	}

	@ObfuscatedName("au.ar(CB)Z")
	public static boolean method79(char arg0) {
		for (int var1 = 0; var1 < field752.length(); var1++) {
			if (arg0 == field752.charAt(var1)) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("kd.ae(ZB)V")
	public static void method5594(boolean arg0) {
		if (Statics.field5520.method793() || Statics.field5520.method1384() || Statics.field5520.method794()) {
			method2628(10);
			return;
		}
		field745 = class394.field4692;
		field746 = class394.field4693;
		field747 = class394.field4758;
		method2628(2);
		if (arg0) {
			field727 = "";
		}
		if (field737 == null || field737.isEmpty()) {
			if (Statics.field240.method2548() == null) {
				client.field332 = false;
			} else {
				field737 = Statics.field240.method2548();
				client.field332 = true;
			}
		}
		if (!client.field332 || field737 == null || field737.isEmpty()) {
			field751 = 0;
		} else {
			field751 = 1;
		}
	}

	@ObfuscatedName("nw.ay(ZI)V")
	public static void method6798(boolean arg0) {
		byte var1 = 0;
		boolean var2 = Statics.field240.method2521() >= client.field389;
		if (!var2) {
			var1 = 12;
		} else if (Statics.field5520.method793() || Statics.field5520.method1384() || Statics.field5520.method794()) {
			var1 = 10;
		}
		method2628(var1);
		if (arg0) {
			field737 = "";
			field727 = "";
			Statics.field258 = 0;
			Statics.field5241 = "";
		}
		if (field737 == null || field737.isEmpty()) {
			if (Statics.field240.method2548() == null) {
				client.field332 = false;
			} else {
				field737 = Statics.field240.method2548();
				client.field332 = true;
			}
		}
		if (!client.field332 || field737 == null || field737.isEmpty()) {
			field751 = 0;
		} else {
			field751 = 1;
		}
	}

	@ObfuscatedName("cu.ad(I)V")
	public static void method2099() {
		field737 = field737.trim();
		if (field737.isEmpty()) {
			method2114(class394.field4714, class394.field4491, class394.field4645);
			return;
		}
		long var6;
		try {
			URL var0 = new URL(client.method4455("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			class591 var4 = new class591(new byte[1000]);
			while (true) {
				int var5 = var3.read(var4.field5917, var4.field5920, 1000 - var4.field5920);
				if (var5 == -1) {
					var4.field5920 = 0;
					long var8 = var4.method10346();
					var6 = var8;
					break;
				}
				var4.field5920 += var5;
				if (var4.field5920 >= 1000) {
					var6 = 0L;
					break;
				}
			}
		} catch (Exception var14) {
			var6 = 0L;
		}
		int var13;
		if (var6 == 0L) {
			var13 = 5;
		} else {
			var13 = class50.method6270(var6, field737);
		}
		switch(var13) {
			case 2:
				method2114(class394.field4746, class394.field4794, class394.field4748);
				method2628(6);
				break;
			case 3:
				method2114(class394.field4501, class394.field4750, class394.field4620);
				break;
			case 4:
				method2114(class394.field4752, class394.field4753, class394.field4754);
				break;
			case 5:
				method2114(class394.field4755, class394.field4756, class394.field4634);
				break;
			case 6:
				method2114(class394.field4696, class394.field4570, class394.field4760);
				break;
			case 7:
				method2114(class394.field4761, class394.field4762, class394.field4541);
		}
	}

	@ObfuscatedName("tj.ag(Lrv;Lrv;Lrv;I)V")
	public static void method9397(class462 arg0, class462 arg1, class462 arg2) {
		field732 = (Statics.field208 - 765) / 2;
		field742 = field732 + 202;
		Statics.field3398 = field742 + 180;
		if (field741) {
			if (Statics.field3381 == null) {
				Statics.field3381 = class607.method9230(Statics.field5388, "sl_back", "");
			}
			if (Statics.field284 == null) {
				Statics.field284 = class607.method3781(Statics.field5388, "sl_flags", "");
			}
			if (Statics.field1566 == null) {
				Statics.field1566 = class607.method3781(Statics.field5388, "sl_arrows", "");
			}
			if (Statics.field4809 == null) {
				Statics.field4809 = class607.method3781(Statics.field5388, "sl_stars", "");
			}
			if (Statics.field3378 == null) {
				Statics.field3378 = class607.method2059(Statics.field5388, "leftarrow", "");
			}
			if (Statics.field4958 == null) {
				Statics.field4958 = class607.method2059(Statics.field5388, "rightarrow", "");
			}
			class602.method10682(field732, 23, 765, 480, 0);
			class602.method10683(field732, 0, 125, 23, 12425273, 9135624);
			class602.method10683(field732 + 125, 0, 640, 23, 5197647, 2697513);
			arg0.method8842(class394.field4528, field732 + 62, 15, 0, -1);
			if (Statics.field4809 != null) {
				Statics.field4809[1].method10780(field732 + 140, 1);
				arg1.method8763(class394.field4779, field732 + 152, 10, 16777215, -1);
				Statics.field4809[0].method10780(field732 + 140, 12);
				arg1.method8763(class394.field4498, field732 + 152, 21, 16777215, -1);
			}
			if (Statics.field1566 != null) {
				int var3 = field732 + 280;
				if (class45.field630[0] == 0 && class45.field637[0] == 0) {
					Statics.field1566[2].method10780(var3, 4);
				} else {
					Statics.field1566[0].method10780(var3, 4);
				}
				if (class45.field630[0] == 0 && class45.field637[0] == 1) {
					Statics.field1566[3].method10780(var3 + 15, 4);
				} else {
					Statics.field1566[1].method10780(var3 + 15, 4);
				}
				arg0.method8763(class394.field4659, var3 + 32, 17, 16777215, -1);
				int var4 = field732 + 390;
				if (class45.field630[0] == 1 && class45.field637[0] == 0) {
					Statics.field1566[2].method10780(var4, 4);
				} else {
					Statics.field1566[0].method10780(var4, 4);
				}
				if (class45.field630[0] == 1 && class45.field637[0] == 1) {
					Statics.field1566[3].method10780(var4 + 15, 4);
				} else {
					Statics.field1566[1].method10780(var4 + 15, 4);
				}
				arg0.method8763(class394.field4596, var4 + 32, 17, 16777215, -1);
				int var5 = field732 + 500;
				if (class45.field630[0] == 2 && class45.field637[0] == 0) {
					Statics.field1566[2].method10780(var5, 4);
				} else {
					Statics.field1566[0].method10780(var5, 4);
				}
				if (class45.field630[0] == 2 && class45.field637[0] == 1) {
					Statics.field1566[3].method10780(var5 + 15, 4);
				} else {
					Statics.field1566[1].method10780(var5 + 15, 4);
				}
				arg0.method8763(class394.field4751, var5 + 32, 17, 16777215, -1);
				int var6 = field732 + 610;
				if (class45.field630[0] == 3 && class45.field637[0] == 0) {
					Statics.field1566[2].method10780(var6, 4);
				} else {
					Statics.field1566[0].method10780(var6, 4);
				}
				if (class45.field630[0] == 3 && class45.field637[0] == 1) {
					Statics.field1566[3].method10780(var6 + 15, 4);
				} else {
					Statics.field1566[1].method10780(var6 + 15, 4);
				}
				arg0.method8763(class394.field4479, var6 + 32, 17, 16777215, -1);
			}
			class602.method10682(field732 + 708, 4, 50, 16, 0);
			arg1.method8842(class394.field4784, field732 + 708 + 25, 16, 16777215, -1);
			field749 = -1;
			if (Statics.field3381 != null) {
				byte var7 = 88;
				byte var8 = 19;
				int var9 = 765 / (var7 + 1) - 1;
				int var10 = 480 / (var8 + 1);
				int var11;
				int var12;
				do {
					var11 = var10;
					var12 = var9;
					if ((var9 - 1) * var10 >= class45.field627) {
						var9--;
					}
					if ((var10 - 1) * var9 >= class45.field627) {
						var10--;
					}
					if ((var10 - 1) * var9 >= class45.field627) {
						var10--;
					}
				} while (var10 != var11 || var9 != var12);
				int var13 = (765 - var7 * var9) / (var9 + 1);
				if (var13 > 5) {
					var13 = 5;
				}
				int var14 = (480 - var8 * var10) / (var10 + 1);
				if (var14 > 5) {
					var14 = 5;
				}
				int var15 = (765 - var7 * var9 - (var9 - 1) * var13) / 2;
				int var16 = (480 - var8 * var10 - (var10 - 1) * var14) / 2;
				int var17 = (class45.field627 + var10 - 1) / var10;
				field757 = var17 - var9;
				if (Statics.field3378 != null && field756 > 0) {
					Statics.field3378.method10780(8, Statics.field4810 / 2 - Statics.field3378.field6011 / 2);
				}
				if (Statics.field4958 != null && field756 < field757) {
					Statics.field4958.method10780(Statics.field208 - Statics.field4958.field6008 - 8, Statics.field4810 / 2 - Statics.field4958.field6011 / 2);
				}
				int var18 = var16 + 23;
				int var19 = field732 + var15;
				int var20 = 0;
				boolean var21 = false;
				int var22 = field756;
				for (int var23 = var10 * var22; var23 < class45.field627 && var22 - field756 < var9; var23++) {
					class45 var24 = Statics.field625[var23];
					boolean var25 = true;
					String var26 = Integer.toString(var24.field629);
					if (var24.field629 == -1) {
						var26 = class394.field4786;
						var25 = false;
					} else if (var24.field629 > 1980) {
						var26 = class394.field4708;
						var25 = false;
					}
					class90 var27 = null;
					int var28 = 0;
					if (var24.method1446()) {
						var27 = var24.method1461() ? class90.field1265 : class90.field1264;
					} else if (var24.method1441()) {
						var27 = var24.method1461() ? class90.field1273 : class90.field1262;
					} else if (var24.method1445()) {
						var28 = 16711680;
						var27 = var24.method1461() ? class90.field1266 : class90.field1263;
					} else if (var24.method1447()) {
						var27 = var24.method1461() ? class90.field1258 : class90.field1267;
					} else if (var24.method1443()) {
						var27 = var24.method1461() ? class90.field1261 : class90.field1260;
					} else if (var24.method1468()) {
						var27 = var24.method1461() ? class90.field1269 : class90.field1268;
					} else if (var24.method1449()) {
						var27 = var24.method1461() ? class90.field1271 : class90.field1270;
					}
					if (var27 == null || var27.field1274 >= Statics.field3381.length) {
						var27 = var24.method1461() ? class90.field1259 : class90.field1272;
					}
					if (class36.field232 >= var19 && class36.field221 >= var18 && class36.field232 < var7 + var19 && class36.field221 < var8 + var18 && var25) {
						field749 = var23;
						Statics.field3381[var27.field1274].method10820(var19, var18, 128, 16777215);
						var21 = true;
					} else {
						Statics.field3381[var27.field1274].method10817(var19, var18);
					}
					if (Statics.field284 != null) {
						Statics.field284[(var24.method1461() ? 8 : 0) + var24.field636].method10780(var19 + 29, var18);
					}
					arg0.method8842(Integer.toString(var24.field641), var19 + 15, var8 / 2 + var18 + 5, var28, -1);
					arg1.method8842(var26, var19 + 60, var8 / 2 + var18 + 5, 268435455, -1);
					var18 += var8 + var14;
					var20++;
					if (var20 >= var10) {
						var18 = var16 + 23;
						var19 += var7 + var13;
						var20 = 0;
						var22++;
					}
				}
				if (var21) {
					int var29 = arg1.method8758(Statics.field625[field749].field623) + 6;
					int var30 = arg1.field5252 + 8;
					int var31 = class36.field221 + 25;
					if (var30 + var31 > 480) {
						var31 = class36.field221 - 25 - var30;
					}
					class602.method10682(class36.field232 - var29 / 2, var31, var29, var30, 16777120);
					class602.method10686(class36.field232 - var29 / 2, var31, var29, var30, 0);
					arg1.method8842(Statics.field625[field749].field623, class36.field232, arg1.field5252 + var31 + 4, 0, -1);
				}
			}
			return;
		}
		Statics.field773.method10817(field732, 0);
		Statics.field4895.method10817(field732 + 382, 0);
		Statics.field1687.method10780(field732 + 382 - Statics.field1687.field6008 / 2, 18);
		if (client.field328 == 0 || client.field328 == 5) {
			byte var32 = 20;
			arg0.method8842(class394.field4691, field742 + 180, 245 - var32, 16777215, -1);
			int var33 = 253 - var32;
			class602.method10686(field742 + 180 - 152, var33, 304, 34, 9179409);
			class602.method10686(field742 + 180 - 151, var33 + 1, 302, 32, 0);
			class602.method10682(field742 + 180 - 150, var33 + 2, field734 * 3, 30, 9179409);
			class602.method10682(field734 * 3 + (field742 + 180 - 150), var33 + 2, 300 - field734 * 3, 30, 0);
			arg0.method8842(field731, field742 + 180, 276 - var32, 16777215, -1);
		}
		if (client.field328 == 20) {
			Statics.field5308.method10780(field742 + 180 - Statics.field5308.field6008 / 2, 271 - Statics.field5308.field6011 / 2);
			short var34 = 201;
			arg0.method8842(field745, field742 + 180, var34, 16776960, 0);
			int var145 = var34 + 15;
			arg0.method8842(field746, field742 + 180, var145, 16776960, 0);
			int var146 = var145 + 15;
			arg0.method8842(field747, field742 + 180, var146, 16776960, 0);
			int var147 = var146 + 15;
			int var148 = var147 + 7;
			if (field759 != 4 && field759 != 10 && field759 != 1) {
				arg0.method8763(class394.field4718, field742 + 180 - 110, var148, 16777215, 0);
				short var35 = 200;
				String var36 = Statics.field240.method2508() ? Statics.method1956(field737) : field737;
				String var37;
				for (var37 = var36; arg0.method8758(var37) > var35; var37 = var37.substring(0, var37.length() - 1)) {
				}
				arg0.method8763(class466.method8836(var37), field742 + 180 - 70, var148, 16777215, 0);
				var145 = var148 + 15;
				String var38;
				for (var38 = Statics.method1956(field727); arg0.method8758(var38) > var35; var38 = var38.substring(1)) {
				}
				arg0.method8763(class394.field4719 + var38, field742 + 180 - 108, var145, 16777215, 0);
				var145 += 15;
			}
		}
		if (client.field328 == 10 || client.field328 == 11 || client.field328 == 50) {
			Statics.field5308.method10780(field742, 171);
			if (field759 == 0) {
				short var39 = 251;
				arg0.method8842(class394.field4721, field742 + 180, var39, 16776960, 0);
				int var149 = var39 + 30;
				int var40 = field742 + 180 - 80;
				short var41 = 291;
				Statics.field2176.method10780(var40 - 73, var41 - 20);
				arg0.method8767(class394.field4743, var40 - 73, var41 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				int var42 = field742 + 180 + 80;
				Statics.field2176.method10780(var42 - 73, var41 - 20);
				arg0.method8767(class394.field4725, var42 - 73, var41 - 20, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (field759 == 1) {
				arg0.method8842(field766, field742 + 180, 201, 16776960, 0);
				short var43 = 236;
				arg0.method8842(field745, field742 + 180, var43, 16777215, 0);
				int var150 = var43 + 15;
				arg0.method8842(field746, field742 + 180, var150, 16777215, 0);
				int var151 = var150 + 15;
				arg0.method8842(field747, field742 + 180, var151, 16777215, 0);
				int var152 = var151 + 15;
				int var44 = field742 + 180 - 80;
				short var45 = 321;
				Statics.field2176.method10780(var44 - 73, var45 - 20);
				arg0.method8842(class394.field4485, var44, var45 + 5, 16777215, 0);
				int var46 = field742 + 180 + 80;
				Statics.field2176.method10780(var46 - 73, var45 - 20);
				arg0.method8842(class394.field4784, var46, var45 + 5, 16777215, 0);
			} else if (field759 == 2) {
				short var47 = 201;
				arg0.method8842(field745, Statics.field3398, var47, 16776960, 0);
				int var153 = var47 + 15;
				arg0.method8842(field746, Statics.field3398, var153, 16776960, 0);
				int var154 = var153 + 15;
				arg0.method8842(field747, Statics.field3398, var154, 16776960, 0);
				int var155 = var154 + 15;
				int var156 = var155 + 7;
				arg0.method8763(class394.field4718, Statics.field3398 - 110, var156, 16777215, 0);
				short var48 = 200;
				String var49 = Statics.field240.method2508() ? Statics.method1956(field737) : field737;
				String var50;
				for (var50 = var49; arg0.method8758(var50) > var48; var50 = var50.substring(1)) {
				}
				arg0.method8763(class466.method8836(var50) + (field751 == 0 & client.field413 % 40 < 20 ? class83.method3480(16776960) + class83.field1198 : ""), Statics.field3398 - 70, var156, 16777215, 0);
				var153 = var156 + 15;
				String var51;
				for (var51 = Statics.method1956(field727); arg0.method8758(var51) > var48; var51 = var51.substring(1)) {
				}
				arg0.method8763(class394.field4719 + var51 + (field751 == 1 & client.field413 % 40 < 20 ? class83.method3480(16776960) + class83.field1198 : ""), Statics.field3398 - 108, var153, 16777215, 0);
				var153 += 15;
				short var52 = 277;
				int var53 = Statics.field3398 + -117;
				class605 var54 = method3986(client.field332, field728);
				var54.method10780(var53, var52);
				int var55 = var54.field6008 + 5 + var53;
				arg1.method8763(class394.field4564, var55, var52 + 13, 16776960, 0);
				int var56 = Statics.field3398 + 24;
				class605 var57 = method3986(Statics.field240.method2508(), field750);
				var57.method10780(var56, var52);
				int var58 = var57.field6008 + 5 + var56;
				arg1.method8763(class394.field4736, var58, var52 + 13, 16776960, 0);
				int var157 = var52 + 15;
				int var59 = Statics.field3398 - 80;
				short var60 = 321;
				Statics.field2176.method10780(var59 - 73, var60 - 20);
				arg0.method8842(class394.field4724, var59, var60 + 5, 16777215, 0);
				int var61 = Statics.field3398 + 80;
				Statics.field2176.method10780(var61 - 73, var60 - 20);
				arg0.method8842(class394.field4784, var61, var60 + 5, 16777215, 0);
				short var62 = 357;
				switch(field736) {
					case 2:
						Statics.field3297 = class394.field4563;
						break;
					default:
						Statics.field3297 = class394.field4737;
				}
				Statics.field5448 = new class450(Statics.field3398, var62, arg1.method8758(Statics.field3297), 11);
				Statics.field5586 = new class450(Statics.field3398, var62, arg1.method8758(class394.field4499), 11);
				arg1.method8842(Statics.field3297, Statics.field3398, var62, 16777215, 0);
			} else if (field759 == 3) {
				short var63 = 201;
				arg0.method8842(class394.field4489, field742 + 180, var63, 16776960, 0);
				int var158 = var63 + 20;
				arg1.method8842(class394.field4723, field742 + 180, var158, 16776960, 0);
				int var159 = var158 + 20;
				arg1.method8842(class394.field4730, field742 + 180, var159, 16776960, 0);
				int var160 = var159 + 15;
				int var64 = field742 + 180;
				short var65 = 276;
				Statics.field2176.method10780(var64 - 73, var65 - 20);
				arg2.method8842(class394.field4731, var64, var65 + 5, 16777215, 0);
				int var66 = field742 + 180;
				short var67 = 326;
				Statics.field2176.method10780(var66 - 73, var67 - 20);
				arg2.method8842(class394.field4732, var66, var67 + 5, 16777215, 0);
			} else if (field759 == 4) {
				arg0.method8842(class394.field4492, field742 + 180, 201, 16776960, 0);
				short var68 = 236;
				arg0.method8842(field745, field742 + 180, var68, 16777215, 0);
				int var161 = var68 + 15;
				arg0.method8842(field746, field742 + 180, var161, 16777215, 0);
				int var162 = var161 + 15;
				arg0.method8842(field747, field742 + 180, var162, 16777215, 0);
				int var163 = var162 + 15;
				arg0.method8763(class394.field4520 + Statics.method1956(Statics.field5241) + (client.field413 % 40 < 20 ? class83.method3480(16776960) + class83.field1198 : ""), field742 + 180 - 108, var163, 16777215, 0);
				int var164 = var163 - 8;
				arg0.method8763(class394.field4488, field742 + 180 - 9, var164, 16776960, 0);
				int var165 = var164 + 15;
				arg0.method8763(class394.field4582, field742 + 180 - 9, var165, 16776960, 0);
				int var69 = field742 + 180 - 9 + arg0.method8758(class394.field4582) + 15;
				int var70 = var165 - arg0.field5252;
				class605 var71;
				if (field744) {
					var71 = Statics.field2174;
				} else {
					var71 = Statics.field3341;
				}
				var71.method10780(var69, var70);
				var161 = var165 + 15;
				int var72 = field742 + 180 - 80;
				short var73 = 321;
				Statics.field2176.method10780(var72 - 73, var73 - 20);
				arg0.method8842(class394.field4485, var72, var73 + 5, 16777215, 0);
				int var74 = field742 + 180 + 80;
				Statics.field2176.method10780(var74 - 73, var73 - 20);
				arg0.method8842(class394.field4784, var74, var73 + 5, 16777215, 0);
				arg1.method8842(class394.field4737, field742 + 180, var73 + 36, 16777215, 0);
			} else if (field759 == 5) {
				arg0.method8842(class394.field4733, field742 + 180, 201, 16776960, 0);
				short var75 = 221;
				arg2.method8842(field745, field742 + 180, var75, 16776960, 0);
				int var166 = var75 + 15;
				arg2.method8842(field746, field742 + 180, var166, 16776960, 0);
				int var167 = var166 + 15;
				arg2.method8842(field747, field742 + 180, var167, 16776960, 0);
				int var168 = var167 + 15;
				int var169 = var168 + 14;
				arg0.method8763(class394.field4734, field742 + 180 - 145, var169, 16777215, 0);
				short var76 = 174;
				String var77 = Statics.field240.method2508() ? Statics.method1956(field737) : field737;
				String var78;
				for (var78 = var77; arg0.method8758(var78) > var76; var78 = var78.substring(1)) {
				}
				arg0.method8763(class466.method8836(var78) + (client.field413 % 40 < 20 ? class83.method3480(16776960) + class83.field1198 : ""), field742 + 180 - 34, var169, 16777215, 0);
				var166 = var169 + 15;
				int var79 = field742 + 180 - 80;
				short var80 = 321;
				Statics.field2176.method10780(var79 - 73, var80 - 20);
				arg0.method8842(class394.field4735, var79, var80 + 5, 16777215, 0);
				int var81 = field742 + 180 + 80;
				Statics.field2176.method10780(var81 - 73, var80 - 20);
				arg0.method8842(class394.field4744, var81, var80 + 5, 16777215, 0);
				short var82 = 356;
				arg1.method8842(class394.field4499, Statics.field3398, var82, 268435455, 0);
			} else if (field759 == 6) {
				short var83 = 201;
				arg0.method8842(field745, field742 + 180, var83, 16776960, 0);
				int var170 = var83 + 15;
				arg0.method8842(field746, field742 + 180, var170, 16776960, 0);
				int var171 = var170 + 15;
				arg0.method8842(field747, field742 + 180, var171, 16776960, 0);
				int var172 = var171 + 15;
				int var84 = field742 + 180;
				short var85 = 321;
				Statics.field2176.method10780(var84 - 73, var85 - 20);
				arg0.method8842(class394.field4744, var84, var85 + 5, 16777215, 0);
			} else if (field759 == 7) {
				if (Statics.field5782 && !client.field592) {
					short var86 = 201;
					arg0.method8842(field745, Statics.field3398, var86, 16776960, 0);
					int var173 = var86 + 15;
					arg0.method8842(field746, Statics.field3398, var173, 16776960, 0);
					int var174 = var173 + 15;
					arg0.method8842(field747, Statics.field3398, var174, 16776960, 0);
					int var87 = Statics.field3398 - 150;
					int var175 = var174 + 10;
					for (int var88 = 0; var88 < 8; var88++) {
						Statics.field2176.method10791(var87, var175, 30, 40);
						boolean var89 = field739 == var88 & client.field413 % 40 < 20;
						arg0.method8763((field740[var88] == null ? "" : field740[var88]) + (var89 ? class83.method3480(16776960) + class83.field1198 : ""), var87 + 10, var175 + 27, 16777215, 0);
						if (var88 == 1 || var88 == 3) {
							var87 += 50;
							arg0.method8763(class466.method8836("/"), var87 - 13, var175 + 27, 16777215, 0);
						} else {
							var87 += 35;
						}
					}
					int var90 = Statics.field3398 - 80;
					short var91 = 321;
					Statics.field2176.method10780(var90 - 73, var91 - 20);
					arg0.method8842("Submit", var90, var91 + 5, 16777215, 0);
					int var92 = Statics.field3398 + 80;
					Statics.field2176.method10780(var92 - 73, var91 - 20);
					arg0.method8842(class394.field4784, var92, var91 + 5, 16777215, 0);
				} else {
					short var93 = 216;
					arg0.method8842(class394.field4764, field742 + 180, var93, 16776960, 0);
					int var176 = var93 + 15;
					arg2.method8842(class394.field4765, field742 + 180, var176, 16776960, 0);
					int var177 = var176 + 15;
					arg2.method8842(class394.field4766, field742 + 180, var177, 16776960, 0);
					int var178 = var177 + 15;
					int var94 = field742 + 180 - 80;
					short var95 = 321;
					Statics.field2176.method10780(var94 - 73, var95 - 20);
					arg0.method8842(class394.field4767, var94, var95 + 5, 16777215, 0);
					int var96 = field742 + 180 + 80;
					Statics.field2176.method10780(var96 - 73, var95 - 20);
					arg0.method8842(class394.field4744, var96, var95 + 5, 16777215, 0);
				}
			} else if (field759 == 8) {
				short var97 = 216;
				arg0.method8842(class394.field4651, field742 + 180, var97, 16776960, 0);
				int var179 = var97 + 15;
				arg2.method8842(class394.field4621, field742 + 180, var179, 16776960, 0);
				int var180 = var179 + 15;
				arg2.method8842(class394.field4622, field742 + 180, var180, 16776960, 0);
				int var181 = var180 + 15;
				int var98 = field742 + 180 - 80;
				short var99 = 321;
				Statics.field2176.method10780(var98 - 73, var99 - 20);
				arg0.method8842(class394.field4623, var98, var99 + 5, 16777215, 0);
				int var100 = field742 + 180 + 80;
				Statics.field2176.method10780(var100 - 73, var99 - 20);
				arg0.method8842(class394.field4744, var100, var99 + 5, 16777215, 0);
			} else if (field759 == 9) {
				short var101 = 221;
				arg0.method8842(field745, field742 + 180, var101, 16776960, 0);
				int var182 = var101 + 25;
				arg0.method8842(field746, field742 + 180, var182, 16776960, 0);
				int var183 = var182 + 25;
				arg0.method8842(field747, field742 + 180, var183, 16776960, 0);
				int var102 = field742 + 180;
				short var103 = 311;
				Statics.field2176.method10780(var102 - 73, var103 - 20);
				arg0.method8842(class394.field4731, var102, var103 + 5, 16777215, 0);
			} else if (field759 == 10) {
				int var104 = field742 + 180;
				short var105 = 209;
				arg0.method8842(class394.field4721, field742 + 180, var105, 16776960, 0);
				int var184 = var105 + 20;
				Statics.field626.method10780(var104 - 109, var184);
				if (field748.isEmpty()) {
					Statics.field2258.method10780(var104 - 48, var184 + 18);
				} else {
					Statics.field2258.method10780(var104 - 48, var184 + 5);
					arg0.method8842(field748, var104, var184 + 68 - 15, 16776960, 0);
				}
			} else if (field759 == 12) {
				int var106 = Statics.field3398;
				short var107 = 216;
				arg2.method8842(class394.field4771, var106, var107, 16777215, 0);
				int var185 = var107 + 17;
				arg2.method8842(class394.field4772, var106, var185, 16777215, 0);
				int var186 = var185 + 17;
				arg2.method8842(class394.field4773, var106, var186, 16777215, 0);
				int var187 = var186 + 17;
				arg2.method8842(class394.field4626, var106, var187, 16777215, 0);
				int var108 = Statics.field3398 - 80;
				short var109 = 311;
				Statics.field2176.method10780(var108 - 73, var109 - 20);
				arg0.method8842(class394.field4777, var108, var109 + 5, 16777215, 0);
				int var110 = Statics.field3398 + 80;
				Statics.field2176.method10780(var110 - 73, var109 - 20);
				arg0.method8842(class394.field4778, var110, var109 + 5, 16777215, 0);
			} else if (field759 == 13) {
				short var111 = 231;
				arg2.method8842(class394.field4775, field742 + 180, var111, 16777215, 0);
				int var188 = var111 + 20;
				arg2.method8842(class394.field4580, field742 + 180, var188, 16777215, 0);
				int var112 = field742 + 180;
				short var113 = 311;
				Statics.field2176.method10780(var112 - 73, var113 - 20);
				arg0.method8842(class394.field4744, var112, var113 + 5, 16777215, 0);
			} else if (field759 == 14) {
				short var114 = 201;
				String var115 = "";
				String var116 = "";
				String var117 = "";
				switch(field754) {
					case 0:
						var115 = class394.field4533;
						var116 = class394.field4534;
						var117 = class394.field4535;
						break;
					case 1:
						var115 = class394.field4572;
						var116 = class394.field4573;
						var117 = class394.field4574;
						break;
					case 2:
						var115 = class394.field4745;
						var116 = class394.field4609;
						var117 = class394.field4610;
						break;
					default:
						method5594(false);
				}
				arg0.method8842(var115, field742 + 180, var114, 16776960, 0);
				int var189 = var114 + 20;
				arg0.method8842(var116, field742 + 180, var189, 16776960, 0);
				int var190 = var189 + 20;
				arg0.method8842(var117, field742 + 180, var190, 16776960, 0);
				int var118 = field742 + 180;
				short var119 = 276;
				Statics.field2176.method10780(var118 - 73, var119 - 20);
				if (field754 == 1) {
					arg0.method8842(class394.field4517, var118, var119 + 5, 16777215, 0);
				} else {
					arg0.method8842(class394.field4516, var118, var119 + 5, 16777215, 0);
				}
				int var120 = field742 + 180;
				short var121 = 326;
				Statics.field2176.method10780(var120 - 73, var121 - 20);
				arg0.method8842(class394.field4744, var120, var121 + 5, 16777215, 0);
			} else if (field759 == 24) {
				short var122 = 221;
				arg0.method8842(field745, field742 + 180, var122, 16777215, 0);
				int var191 = var122 + 15;
				arg0.method8842(field746, field742 + 180, var191, 16777215, 0);
				int var192 = var191 + 15;
				arg0.method8842(field747, field742 + 180, var192, 16777215, 0);
				int var193 = var192 + 15;
				int var123 = field742 + 180;
				short var124 = 301;
				Statics.field2176.method10780(var123 - 73, var124 - 20);
				arg0.method8842(class394.field4483, var123, var124 + 5, 16777215, 0);
			} else if (field759 == 32) {
				short var125 = 216;
				arg0.method8842(class394.field4764, field742 + 180, var125, 16776960, 0);
				int var194 = var125 + 15;
				arg2.method8842(class394.field4765, field742 + 180, var194, 16776960, 0);
				int var195 = var194 + 15;
				arg2.method8842(class394.field4766, field742 + 180, var195, 16776960, 0);
				int var196 = var195 + 15;
				int var126 = field742 + 180 - 80;
				short var127 = 321;
				Statics.field2176.method10780(var126 - 73, var127 - 20);
				arg0.method8842(class394.field4767, var126, var127 + 5, 16777215, 0);
				int var128 = field742 + 180 + 80;
				Statics.field2176.method10780(var128 - 73, var127 - 20);
				arg0.method8842(class394.field4744, var128, var127 + 5, 16777215, 0);
			} else if (field759 == 33) {
				short var129 = 201;
				arg0.method8842(field745, field742 + 180, var129, 16776960, 0);
				int var197 = var129 + 20;
				arg1.method8842(field746, field742 + 180, var197, 16776960, 0);
				int var198 = var197 + 20;
				arg1.method8842(field747, field742 + 180, var198, 16776960, 0);
				int var199 = var198 + 15;
				int var130 = field742 + 180;
				short var131 = 276;
				Statics.field2176.method10780(var130 - 73, var131 - 20);
				arg2.method8842(class394.field4685, var130, var131 + 5, 16777215, 0);
				int var132 = field742 + 180;
				short var133 = 326;
				Statics.field2176.method10780(var132 - 73, var133 - 20);
				arg2.method8842(class394.field4744, var132, var133 + 5, 16777215, 0);
			} else if (field759 == 34) {
				short var134 = 201;
				arg0.method8842(field745, field742 + 180, var134, 16776960, 0);
				int var200 = var134 + 20;
				arg1.method8842(field746, field742 + 180, var200, 16776960, 0);
				int var201 = var200 + 20;
				arg1.method8842(field747, field742 + 180, var201, 16776960, 0);
				int var135 = field742 + 180;
				short var136 = 276;
				Statics.field2176.method10780(var135 - 73, var136 - 20);
				String var137 = Statics.field631 == null ? class394.field4790 : class394.field4788;
				arg2.method8842(var137, var135, var136 + 5, 16777215, 0);
				int var138 = field742 + 180;
				short var139 = 326;
				Statics.field2176.method10780(var138 - 73, var139 - 20);
				arg2.method8842(class394.field4744, var138, var139 + 5, 16777215, 0);
			}
		}
		if (client.field328 >= 10) {
			int[] var140 = new int[4];
			class602.method10676(var140);
			class602.method10674(field732, 0, field732 + 765, Statics.field4810);
			Statics.field1804.method2469(field732 - 22, client.field413);
			Statics.field1804.method2469(field732 + 765 + 22 - 128, client.field413);
			class602.method10742(var140);
		}
		Statics.field274[Statics.field240.method2510() ? 1 : 0].method10780(field732 + 765 - 40, 463);
		if (client.field328 <= 5 || class433.field5101 != Statics.field2971) {
			return;
		}
		if (Statics.field3232 == null) {
			Statics.field3232 = class607.method2059(Statics.field5388, "sl_button", "");
			return;
		}
		int var141 = field732 + 5;
		short var142 = 463;
		byte var143 = 100;
		byte var144 = 35;
		Statics.field3232.method10780(var141, var142);
		arg0.method8842(class394.field4661 + " " + client.field326, var143 / 2 + var141, var144 / 2 + var142 - 2, 16777215, 0);
		if (Statics.field631 == null) {
			arg1.method8842(class394.field4789, var143 / 2 + var141, var144 / 2 + var142 + 12, 16777215, 0);
		} else {
			arg1.method8842(class394.field4788, var143 / 2 + var141, var144 / 2 + var142 + 12, 16777215, 0);
		}
	}

	@ObfuscatedName("cn.av(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method2114(String arg0, String arg1, String arg2) {
		field745 = arg0;
		field746 = arg1;
		field747 = arg2;
	}

	@ObfuscatedName("hx.ah(Lbp;B)V")
	public static void method4091(class45 arg0) {
		if (arg0.method1461() != client.field327) {
			client.field327 = arg0.method1461();
			boolean var1 = arg0.method1461();
			if (Statics.field3466 != var1) {
				class214.method3778();
				Statics.field3466 = var1;
			}
		}
		if (client.field386 != arg0.field633) {
			method3422(Statics.field5388, arg0.field633);
		}
		Statics.field237 = arg0.field635;
		client.field326 = arg0.field641;
		client.field386 = arg0.field633;
		Statics.field1998 = arg0.field639;
		Statics.field5090 = client.field355 == 0 ? 43594 : arg0.field641 + 40000;
		Statics.field5607 = client.field355 == 0 ? 443 : arg0.field641 + 50000;
		Statics.field1771 = Statics.field5090;
	}

	@ObfuscatedName("up.ab(B)V")
	public static void method9654() {
		if (field759 == 34) {
			method5594(false);
		}
		field741 = false;
		class602.method10682(0, 0, Statics.field5990, Statics.field5991, 0);
		Statics.field773.method10817(field732, 0);
		Statics.field4895.method10817(field732 + 382, 0);
		Statics.field1687.method10780(field732 + 382 - Statics.field1687.field6008 / 2, 18);
	}

	@ObfuscatedName("dd.ax(IS)V")
	public static void method2628(int arg0) {
		if (field759 != arg0) {
			field759 = arg0;
		}
	}

	@ObfuscatedName("vj.ak(Ljava/lang/String;I)V")
	public static void method9787(String arg0) {
		String var1;
		if (arg0 == null || arg0.isEmpty() || arg0.charAt(0) == '#') {
			var1 = "";
		} else {
			var1 = arg0;
		}
		field748 = var1;
	}

	@ObfuscatedName("qv.aj(ILjava/lang/String;I)V")
	public static void method7906(int arg0, String arg1) {
		field731 = arg1;
		field734 = arg0;
	}
}
