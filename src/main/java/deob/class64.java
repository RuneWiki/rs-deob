package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bu")
public class class64 {

    @ObfuscatedName("bu.w")
    public static int[] field807 = new int[5];

    @ObfuscatedName("bu.n")
    public static int[][] field814 = new int[5][5000];

    @ObfuscatedName("bu.r")
    public static int[] field809 = new int[1000];

    @ObfuscatedName("bu.v")
    public static String[] field810 = new String[1000];

    @ObfuscatedName("bu.h")
    public static int field804 = 0;

    @ObfuscatedName("bu.g")
    public static class57[] field812 = new class57[50];

    @ObfuscatedName("bu.l")
    public static Calendar field805 = Calendar.getInstance();

    @ObfuscatedName("bu.q")
    public static final String[] field821 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bu.z")
    public static boolean field819 = false;

    @ObfuscatedName("bu.i")
    public static boolean field817 = false;

    @ObfuscatedName("bu.y")
    public static ArrayList field818 = new ArrayList();

    @ObfuscatedName("bu.ah")
    public static int field816 = 0;

    @ObfuscatedName("bu.ax")
    public static final double field815 = Math.log(2.0D);

    public class64() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("js.c(Lcp;I)V")
    public static void method4965(class81 arg0) {
        method1044(arg0, 500000, 475000);
    }

    @ObfuscatedName("bg.b(Lcp;IIB)V")
    public static void method1044(class81 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1031;
        class72 var5;
        if (class415.method5768(arg0.field1028)) {
            Statics.field1697 = (class241) var3[0];
            class164 var4 = class164.method2044(Statics.field1697.field2778);
            var5 = class72.method3625(arg0.field1028, var4.field1753, var4.field1772);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class72.method6586(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field4593 = 0;
        Statics.field78 = 0;
        int var7 = -1;
        int[] var8 = var5.field937;
        int[] var9 = var5.field934;
        byte var10 = -1;
        field804 = 0;
        field819 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field318 = new int[var5.field936];
            int var13 = 0;
            Statics.field4108 = new String[var5.field940];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1029;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1021;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1017 == null ? -1 : arg0.field1017.field3226;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1022;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1017 == null ? -1 : arg0.field1017.field3227;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1023 == null ? -1 : arg0.field1023.field3226;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1023 == null ? -1 : arg0.field1023.field3227;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1024;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1033;
                    }
                    Statics.field318[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1027;
                    }
                    Statics.field4108[var14++] = var17;
                }
            }
            field816 = arg0.field1019;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field934[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method2437(var61, var5, var48);
                    switch(var49) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var61 == 0) {
                    field809[++Statics.field4593 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field809[++Statics.field4593 - 1] = class276.field3185[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class276.field3185[var19] = field809[--Statics.field4593];
                    client.method4944(var19);
                } else if (var61 == 3) {
                    field810[++Statics.field78 - 1] = var5.field939[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field4593 -= 2;
                    if (field809[Statics.field4593] != field809[Statics.field4593 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field4593 -= 2;
                    if (field809[Statics.field4593] == field809[Statics.field4593 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field4593 -= 2;
                    if (field809[Statics.field4593] < field809[Statics.field4593 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field4593 -= 2;
                    if (field809[Statics.field4593] > field809[Statics.field4593 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field804 == 0) {
                        return;
                    }
                    class57 var21 = field812[--field804];
                    var5 = var21.field448;
                    var8 = var5.field937;
                    var9 = var5.field934;
                    var7 = var21.field442;
                    Statics.field318 = var21.field444;
                    Statics.field4108 = var21.field445;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field809[++Statics.field4593 - 1] = class276.method4820(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class276.method3527(var23, field809[--Statics.field4593]);
                } else if (var61 == 31) {
                    Statics.field4593 -= 2;
                    if (field809[Statics.field4593] <= field809[Statics.field4593 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field4593 -= 2;
                    if (field809[Statics.field4593] >= field809[Statics.field4593 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field809[++Statics.field4593 - 1] = Statics.field318[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field318[var9[var7]] = field809[--Statics.field4593];
                } else if (var61 == 35) {
                    field810[++Statics.field78 - 1] = Statics.field4108[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field4108[var9[var7]] = field810[--Statics.field78];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field78 -= var24;
                    String var25 = class331.method2442(field810, Statics.field78, var24);
                    field810[++Statics.field78 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field4593--;
                } else if (var61 == 39) {
                    Statics.field78--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class72 var27 = class72.method6586(var26);
                    int[] var28 = new int[var27.field936];
                    String[] var29 = new String[var27.field940];
                    for (int var30 = 0; var30 < var27.field941; var30++) {
                        var28[var30] = field809[Statics.field4593 - var27.field941 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field942; var31++) {
                        var29[var31] = field810[Statics.field78 - var27.field942 + var31];
                    }
                    Statics.field4593 -= var27.field941;
                    Statics.field78 -= var27.field942;
                    class57 var32 = new class57();
                    var32.field448 = var5;
                    var32.field442 = var7;
                    var32.field444 = Statics.field318;
                    var32.field445 = Statics.field4108;
                    field812[++field804 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field937;
                    var9 = var27.field934;
                    var7 = -1;
                    Statics.field318 = var28;
                    Statics.field4108 = var29;
                } else if (var61 == 42) {
                    field809[++Statics.field4593 - 1] = Statics.field4057.method2263(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field4057.method2295(var9[var7], field809[--Statics.field4593]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field809[--Statics.field4593];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field807[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field814[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field809[--Statics.field4593];
                    if (var39 < 0 || var39 >= field807[var38]) {
                        throw new RuntimeException();
                    }
                    field809[++Statics.field4593 - 1] = field814[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field4593 -= 2;
                    int var41 = field809[Statics.field4593];
                    if (var41 < 0 || var41 >= field807[var40]) {
                        throw new RuntimeException();
                    }
                    field814[var40][var41] = field809[Statics.field4593 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field4057.method2267(var9[var7]);
                    if (var42 == null) {
                        var42 = class295.field3477;
                    }
                    field810[++Statics.field78 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field4057.method2266(var9[var7], field810[--Statics.field78]);
                } else if (var61 == 49) {
                    String var43 = Statics.field4057.method2269(var9[var7]);
                    field810[++Statics.field78 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field4057.method2264(var9[var7], field810[--Statics.field78]);
                } else if (var61 == 60) {
                    class396 var44 = var5.field943[var9[var7]];
                    class386 var45 = (class386) var44.method6429((long) field809[--Statics.field4593]);
                    if (var45 != null) {
                        var7 += var45.field4256;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field4085.method2663(var9[var7]);
                    if (var46 == null) {
                        field809[++Statics.field4593 - 1] = -1;
                    } else {
                        field809[++Statics.field4593 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field1343.method6109(var9[var7]);
                    if (var47 == null) {
                        field809[++Statics.field4593 - 1] = -1;
                    } else {
                        field809[++Statics.field4593 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4257).append(" ");
            for (int var53 = field804 - 1; var53 >= 0; var53--) {
                var52.append("").append(field812[var53].field448.field4257).append(" ");
            }
            var52.append("").append(var10);
            class443.method6513(var52.toString(), var59);
        } finally {
            while (field818.size() > 0) {
                class93 var56 = (class93) field818.remove(0);
                client.method800(var56.method2227(), var56.method2226(), var56.method2228(), var56.method2235(), "");
            }
            if (field819) {
                field819 = false;
                client.method25();
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class443.method6513("Warning: Script " + var5.field938 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("de.p(ILbn;ZI)I")
    public static int method2437(int arg0, class72 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method4818(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method4891(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2717(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method396(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method2586(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method4397(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method5049(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method5908(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method53(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method2759(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method4981(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method4891(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2717(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method396(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method2586(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method4397(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method17(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method2363(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method1918(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method117(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method4981(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method2025(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method3088(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method182(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method655(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method193(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method3331(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method2970(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method5614(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method435(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method5688(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method4971(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method5869(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2971(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method2627(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method2715(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method4352(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method397(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method1074(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method573(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method3999(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method1581(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method5262(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method24(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method4017(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method2023(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method2938(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jj.m(ILbn;ZI)I")
    public static int method4818(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field4593 -= 3;
            int var3 = field809[Statics.field4593];
            int var4 = field809[Statics.field4593 + 1];
            int var5 = field809[Statics.field4593 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class281 var6 = class281.method1956(var3);
            if (var6.field3280 == null) {
                var6.field3280 = new class281[var5 + 1];
            }
            if (var6.field3280.length <= var5) {
                class281[] var7 = new class281[var5 + 1];
                for (int var8 = 0; var8 < var6.field3280.length; var8++) {
                    var7[var8] = var6.field3280[var8];
                }
                var6.field3280 = var7;
            }
            if (var5 > 0 && var6.field3280[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class281 var9 = new class281();
            var9.field3260 = var4;
            var9.field3245 = var9.field3226 = var6.field3226;
            var9.field3227 = var5;
            var9.field3250 = true;
            var6.field3280[var5] = var9;
            if (arg2) {
                Statics.field2616 = var9;
            } else {
                Statics.field1276 = var9;
            }
            client.method2020(var6);
            return 1;
        } else if (arg0 == 101) {
            class281 var10 = arg2 ? Statics.field2616 : Statics.field1276;
            class281 var11 = class281.method1956(var10.field3226);
            var11.field3280[var10.field3227] = null;
            client.method2020(var11);
            return 1;
        } else if (arg0 == 102) {
            class281 var12 = class281.method1956(field809[--Statics.field4593]);
            var12.field3280 = null;
            client.method2020(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field4593 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field4593 -= 2;
            int var13 = field809[Statics.field4593];
            int var14 = field809[Statics.field4593 + 1];
            class281 var15 = class281.method2602(var13, var14);
            if (var15 == null || var14 == -1) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = 1;
                if (arg2) {
                    Statics.field2616 = var15;
                } else {
                    Statics.field1276 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class281 var16 = class281.method1956(field809[--Statics.field4593]);
            if (var16 == null) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = 1;
                if (arg2) {
                    Statics.field2616 = var16;
                } else {
                    Statics.field1276 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field809[Statics.field4593 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field809[--Statics.field4593 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jb.t(ILbn;ZB)I")
    public static int method4891(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class281 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field809[--Statics.field4593];
            var4 = class281.method1956(var3);
        } else {
            var4 = arg2 ? Statics.field2616 : Statics.field1276;
        }
        if (arg0 == 1000) {
            Statics.field4593 -= 4;
            var4.field3235 = field809[Statics.field4593];
            var4.field3323 = field809[Statics.field4593 + 1];
            var4.field3231 = field809[Statics.field4593 + 2];
            var4.field3232 = field809[Statics.field4593 + 3];
            client.method2020(var4);
            Statics.field3795.method1102(var4);
            if (var3 != -1 && var4.field3260 == 0) {
                client.method2519(Statics.field1043[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field4593 -= 4;
            var4.field3321 = field809[Statics.field4593];
            var4.field3265 = field809[Statics.field4593 + 1];
            var4.field3233 = field809[Statics.field4593 + 2];
            var4.field3216 = field809[Statics.field4593 + 3];
            client.method2020(var4);
            Statics.field3795.method1102(var4);
            if (var3 != -1 && var4.field3260 == 0) {
                client.method2519(Statics.field1043[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field809[--Statics.field4593] == 1;
            if (var4.field3246 != var5) {
                var4.field3246 = var5;
                client.method2020(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3228 = field809[--Statics.field4593] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3237 = field809[--Statics.field4593] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("en.s(ILbn;ZB)I")
    public static int method2717(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class281 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field809[--Statics.field4593];
            var4 = class281.method1956(var3);
        } else {
            var4 = arg2 ? Statics.field2616 : Statics.field1276;
        }
        if (arg0 == 1100) {
            Statics.field4593 -= 2;
            var4.field3247 = field809[Statics.field4593];
            if (var4.field3247 > var4.field3249 - var4.field3241) {
                var4.field3247 = var4.field3249 - var4.field3241;
            }
            if (var4.field3247 < 0) {
                var4.field3247 = 0;
            }
            var4.field3248 = field809[Statics.field4593 + 1];
            if (var4.field3248 > var4.field3239 - var4.field3242) {
                var4.field3248 = var4.field3239 - var4.field3242;
            }
            if (var4.field3248 < 0) {
                var4.field3248 = 0;
            }
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field3251 = field809[--Statics.field4593];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3325 = field809[--Statics.field4593] == 1;
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3257 = field809[--Statics.field4593];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3259 = field809[--Statics.field4593];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3319 = field809[--Statics.field4593];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3263 = field809[--Statics.field4593];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3264 = field809[--Statics.field4593] == 1;
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3322 = 1;
            var4.field3270 = field809[--Statics.field4593];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field4593 -= 6;
            var4.field3275 = field809[Statics.field4593];
            var4.field3290 = field809[Statics.field4593 + 1];
            var4.field3277 = field809[Statics.field4593 + 2];
            var4.field3278 = field809[Statics.field4593 + 3];
            var4.field3344 = field809[Statics.field4593 + 4];
            var4.field3362 = field809[Statics.field4593 + 5];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field809[--Statics.field4593];
            if (var4.field3273 != var5) {
                var4.field3273 = var5;
                var4.field3358 = 0;
                var4.field3359 = 0;
                client.method2020(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3283 = field809[--Statics.field4593] == 1;
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field810[--Statics.field78];
            if (!var6.equals(var4.field3287)) {
                var4.field3287 = var6;
                client.method2020(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3286 = field809[--Statics.field4593];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field4593 -= 3;
            var4.field3225 = field809[Statics.field4593];
            var4.field3291 = field809[Statics.field4593 + 1];
            var4.field3340 = field809[Statics.field4593 + 2];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3292 = field809[--Statics.field4593] == 1;
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3306 = field809[--Statics.field4593];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3266 = field809[--Statics.field4593];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3267 = field809[--Statics.field4593] == 1;
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3334 = field809[--Statics.field4593] == 1;
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field4593 -= 2;
            var4.field3249 = field809[Statics.field4593];
            var4.field3239 = field809[Statics.field4593 + 1];
            client.method2020(var4);
            if (var3 != -1 && var4.field3260 == 0) {
                client.method2519(Statics.field1043[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method4969(var4.field3226, var4.field3227);
            client.field643 = var4;
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3262 = field809[--Statics.field4593];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3347 = field809[--Statics.field4593];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3258 = field809[--Statics.field4593];
            client.method2020(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field809[--Statics.field4593];
            class430 var8 = (class430) class316.method2616(class430.method4525(), var7);
            if (var8 != null) {
                var4.field3256 = var8;
                client.method2020(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field809[--Statics.field4593] == 1;
            var4.field3360 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field809[--Statics.field4593] == 1;
            var4.field3289 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field4593 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("y.j(ILbn;ZB)I")
    public static int method396(int arg0, class72 arg1, boolean arg2) {
        class281 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class281.method1956(field809[--Statics.field4593]);
        } else {
            var3 = arg2 ? Statics.field2616 : Statics.field1276;
        }
        client.method2020(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field4593 -= 2;
            int var4 = field809[Statics.field4593];
            int var5 = field809[Statics.field4593 + 1];
            var3.field3269 = var4;
            var3.field3214 = var5;
            class181 var6 = class181.method2432(var4);
            var3.field3277 = var6.field2020;
            var3.field3278 = var6.field2021;
            var3.field3344 = var6.field2005;
            var3.field3275 = var6.field2060;
            var3.field3290 = var6.field2024;
            var3.field3362 = var6.field2019;
            if (arg0 == 1205) {
                var3.field3285 = 0;
            } else if (arg0 == 1212 | var6.field2018 == 1) {
                var3.field3285 = 1;
            } else {
                var3.field3285 = 2;
            }
            if (var3.field3281 > 0) {
                var3.field3362 = var3.field3362 * 32 / var3.field3281;
            } else if (var3.field3321 > 0) {
                var3.field3362 = var3.field3362 * 32 / var3.field3321;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3322 = 2;
            var3.field3270 = field809[--Statics.field4593];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3322 = 3;
            var3.field3270 = Statics.field4070.field1046.method4862();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("db.w(ILbn;ZI)I")
    public static int method2586(int arg0, class72 arg1, boolean arg2) {
        boolean var3 = true;
        class281 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class281.method1956(field809[--Statics.field4593]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field2616 : Statics.field1276;
        }
        if (arg0 == 1300) {
            int var5 = field809[--Statics.field4593] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4893(var5, field810[--Statics.field78]);
                return 1;
            } else {
                Statics.field78--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field4593 -= 2;
            int var6 = field809[Statics.field4593];
            int var7 = field809[Statics.field4593 + 1];
            var4.field3307 = class281.method2602(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3288 = field809[--Statics.field4593] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3308 = field809[--Statics.field4593];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3309 = field809[--Statics.field4593];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3305 = field810[--Statics.field78];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3252 = field810[--Statics.field78];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3282 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3372 = field809[--Statics.field4593] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field4593 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field809[Statics.field4593 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field809[Statics.field4593 + var10];
                        var9[var10 / 2] = (byte) field809[Statics.field4593 + var10 + 1];
                    }
                }
            } else {
                Statics.field4593 -= 2;
                var8 = new byte[] { (byte) field809[Statics.field4593] };
                var9 = new byte[] { (byte) field809[Statics.field4593 + 1] };
            }
            int var11 = field809[--Statics.field4593] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method1593(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field4593 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field809[Statics.field4593] };
            byte[] var14 = new byte[] { (byte) field809[Statics.field4593 + 1] };
            method1593(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field4593 -= 3;
            int var15 = field809[Statics.field4593] - 1;
            int var16 = field809[Statics.field4593 + 1];
            int var17 = field809[Statics.field4593 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method2410(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field809[--Statics.field4593];
            int var20 = field809[--Statics.field4593];
            method2410(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field4593--;
            int var21 = field809[Statics.field4593] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method230(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method230(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bw.n(Ljm;I[B[BI)V")
    public static final void method1593(class281 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3301 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3301 = new byte[11][];
            arg0.field3302 = new byte[11][];
            arg0.field3303 = new int[11];
            arg0.field3304 = new int[11];
        }
        arg0.field3301[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3300 = false;
            for (int var4 = 0; var4 < arg0.field3301.length; var4++) {
                if (arg0.field3301[var4] != null) {
                    arg0.field3300 = true;
                    break;
                }
            }
        } else {
            arg0.field3300 = true;
        }
        arg0.field3302[arg1] = arg3;
    }

    @ObfuscatedName("dr.r(Ljm;IIII)V")
    public static final void method2410(class281 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3303 == null) {
            throw new RuntimeException();
        }
        arg0.field3303[arg1] = arg2;
        arg0.field3304[arg1] = arg3;
    }

    @ObfuscatedName("a.o(Ljm;II)V")
    public static final void method230(class281 arg0, int arg1) {
        if (arg0.field3301 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3369 == null) {
            arg0.field3369 = new int[arg0.field3301.length];
        }
        arg0.field3369[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("hk.v(ILbn;ZI)I")
    public static int method4397(int arg0, class72 arg1, boolean arg2) {
        class281 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class281.method1956(field809[--Statics.field4593]);
        } else {
            var3 = arg2 ? Statics.field2616 : Statics.field1276;
        }
        String var4 = field810[--Statics.field78];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field809[--Statics.field4593];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field809[--Statics.field4593];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field810[--Statics.field78];
            } else {
                var7[var8] = Integer.valueOf(field809[--Statics.field4593]);
            }
        }
        int var9 = field809[--Statics.field4593];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3314 = var7;
        } else if (arg0 == 1401) {
            var3.field3317 = var7;
        } else if (arg0 == 1402) {
            var3.field3316 = var7;
        } else if (arg0 == 1403) {
            var3.field3318 = var7;
        } else if (arg0 == 1404) {
            var3.field3320 = var7;
        } else if (arg0 == 1405) {
            var3.field3253 = var7;
        } else if (arg0 == 1406) {
            var3.field3324 = var7;
        } else if (arg0 == 1407) {
            var3.field3276 = var7;
            var3.field3326 = var5;
        } else if (arg0 == 1408) {
            var3.field3331 = var7;
        } else if (arg0 == 1409) {
            var3.field3332 = var7;
        } else if (arg0 == 1410) {
            var3.field3284 = var7;
        } else if (arg0 == 1411) {
            var3.field3315 = var7;
        } else if (arg0 == 1412) {
            var3.field3297 = var7;
        } else if (arg0 == 1414) {
            var3.field3355 = var7;
            var3.field3371 = var5;
        } else if (arg0 == 1415) {
            var3.field3329 = var7;
            var3.field3312 = var5;
        } else if (arg0 == 1416) {
            var3.field3350 = var7;
        } else if (arg0 == 1417) {
            var3.field3333 = var7;
        } else if (arg0 == 1418) {
            var3.field3238 = var7;
        } else if (arg0 == 1419) {
            var3.field3335 = var7;
        } else if (arg0 == 1420) {
            var3.field3338 = var7;
        } else if (arg0 == 1421) {
            var3.field3339 = var7;
        } else if (arg0 == 1422) {
            var3.field3330 = var7;
        } else if (arg0 == 1423) {
            var3.field3343 = var7;
        } else if (arg0 == 1424) {
            var3.field3370 = var7;
        } else if (arg0 == 1425) {
            var3.field3346 = var7;
        } else if (arg0 == 1426) {
            var3.field3295 = var7;
        } else if (arg0 == 1427) {
            var3.field3345 = var7;
        } else if (arg0 == 1428) {
            var3.field3218 = var7;
        } else if (arg0 == 1429) {
            var3.field3341 = var7;
        } else if (arg0 == 1430) {
            var3.field3336 = var7;
        } else if (arg0 == 1431) {
            var3.field3337 = var7;
        } else {
            return 2;
        }
        var3.field3229 = true;
        return 1;
    }

    @ObfuscatedName("kx.d(ILbn;ZB)I")
    public static int method5049(int arg0, class72 arg1, boolean arg2) {
        class281 var3 = arg2 ? Statics.field2616 : Statics.field1276;
        if (arg0 == 1500) {
            field809[++Statics.field4593 - 1] = var3.field3327;
            return 1;
        } else if (arg0 == 1501) {
            field809[++Statics.field4593 - 1] = var3.field3240;
            return 1;
        } else if (arg0 == 1502) {
            field809[++Statics.field4593 - 1] = var3.field3241;
            return 1;
        } else if (arg0 == 1503) {
            field809[++Statics.field4593 - 1] = var3.field3242;
            return 1;
        } else if (arg0 == 1504) {
            field809[++Statics.field4593 - 1] = var3.field3246 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field809[++Statics.field4593 - 1] = var3.field3245;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mb.h(ILbn;ZI)I")
    public static int method5908(int arg0, class72 arg1, boolean arg2) {
        class281 var3 = arg2 ? Statics.field2616 : Statics.field1276;
        if (arg0 == 1600) {
            field809[++Statics.field4593 - 1] = var3.field3247;
            return 1;
        } else if (arg0 == 1601) {
            field809[++Statics.field4593 - 1] = var3.field3248;
            return 1;
        } else if (arg0 == 1602) {
            field810[++Statics.field78 - 1] = var3.field3287;
            return 1;
        } else if (arg0 == 1603) {
            field809[++Statics.field4593 - 1] = var3.field3249;
            return 1;
        } else if (arg0 == 1604) {
            field809[++Statics.field4593 - 1] = var3.field3239;
            return 1;
        } else if (arg0 == 1605) {
            field809[++Statics.field4593 - 1] = var3.field3362;
            return 1;
        } else if (arg0 == 1606) {
            field809[++Statics.field4593 - 1] = var3.field3277;
            return 1;
        } else if (arg0 == 1607) {
            field809[++Statics.field4593 - 1] = var3.field3344;
            return 1;
        } else if (arg0 == 1608) {
            field809[++Statics.field4593 - 1] = var3.field3278;
            return 1;
        } else if (arg0 == 1609) {
            field809[++Statics.field4593 - 1] = var3.field3257;
            return 1;
        } else if (arg0 == 1610) {
            field809[++Statics.field4593 - 1] = var3.field3258;
            return 1;
        } else if (arg0 == 1611) {
            field809[++Statics.field4593 - 1] = var3.field3251;
            return 1;
        } else if (arg0 == 1612) {
            field809[++Statics.field4593 - 1] = var3.field3347;
            return 1;
        } else if (arg0 == 1613) {
            field809[++Statics.field4593 - 1] = var3.field3256.method46();
            return 1;
        } else if (arg0 == 1614) {
            field809[++Statics.field4593 - 1] = var3.field3289 ? 1 : 0;
            return 1;
        } else if (arg0 == 1615 || arg0 == 1616) {
            Statics.field4593++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("j.g(ILbn;ZI)I")
    public static int method53(int arg0, class72 arg1, boolean arg2) {
        class281 var3 = arg2 ? Statics.field2616 : Statics.field1276;
        if (arg0 == 1700) {
            field809[++Statics.field4593 - 1] = var3.field3269;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3269 == -1) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = var3.field3214;
            }
            return 1;
        } else if (arg0 == 1702) {
            field809[++Statics.field4593 - 1] = var3.field3227;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ea.e(ILbn;ZI)I")
    public static int method2759(int arg0, class72 arg1, boolean arg2) {
        class281 var3 = arg2 ? Statics.field2616 : Statics.field1276;
        if (arg0 == 1800) {
            field809[++Statics.field4593 - 1] = class282.method6545(client.method5970(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field809[--Statics.field4593];
            int var5 = var4 - 1;
            if (var3.field3282 == null || var5 >= var3.field3282.length || var3.field3282[var5] == null) {
                field810[++Statics.field78 - 1] = "";
            } else {
                field810[++Statics.field78 - 1] = var3.field3282[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3305 == null) {
                field810[++Statics.field78 - 1] = "";
            } else {
                field810[++Statics.field78 - 1] = var3.field3305;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kl.a(ILbn;ZI)I")
    public static int method4981(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field816 >= 10) {
                throw new RuntimeException();
            }
            class281 var10;
            if (arg0 >= 2000) {
                var10 = class281.method1956(field809[--Statics.field4593]);
            } else {
                var10 = arg2 ? Statics.field2616 : Statics.field1276;
            }
            if (var10.field3345 == null) {
                return 0;
            }
            class81 var11 = new class81();
            var11.field1017 = var10;
            var11.field1031 = var10.field3345;
            var11.field1019 = field816 + 1;
            client.field632.method5296(var11);
            return 1;
        } else if (arg0 == 1928) {
            class281 var3 = arg2 ? Statics.field2616 : Statics.field1276;
            int var4 = field809[--Statics.field4593];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class93 var5 = new class93(var4, var3.field3226, var3.field3227, var3.field3269);
            field818.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field4593 -= 3;
            int var6 = field809[Statics.field4593];
            int var7 = field809[Statics.field4593 + 1];
            int var8 = field809[Statics.field4593 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class93 var9 = new class93(var8, var6, var7, class281.method1956(var6).field3269);
            field818.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("t.u(ILbn;ZI)I")
    public static int method17(int arg0, class72 arg1, boolean arg2) {
        class281 var3 = class281.method1956(field809[--Statics.field4593]);
        if (arg0 == 2500) {
            field809[++Statics.field4593 - 1] = var3.field3327;
            return 1;
        } else if (arg0 == 2501) {
            field809[++Statics.field4593 - 1] = var3.field3240;
            return 1;
        } else if (arg0 == 2502) {
            field809[++Statics.field4593 - 1] = var3.field3241;
            return 1;
        } else if (arg0 == 2503) {
            field809[++Statics.field4593 - 1] = var3.field3242;
            return 1;
        } else if (arg0 == 2504) {
            field809[++Statics.field4593 - 1] = var3.field3246 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field809[++Statics.field4593 - 1] = var3.field3245;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cq.k(ILbn;ZI)I")
    public static int method2363(int arg0, class72 arg1, boolean arg2) {
        class281 var3 = class281.method1956(field809[--Statics.field4593]);
        if (arg0 == 2600) {
            field809[++Statics.field4593 - 1] = var3.field3247;
            return 1;
        } else if (arg0 == 2601) {
            field809[++Statics.field4593 - 1] = var3.field3248;
            return 1;
        } else if (arg0 == 2602) {
            field810[++Statics.field78 - 1] = var3.field3287;
            return 1;
        } else if (arg0 == 2603) {
            field809[++Statics.field4593 - 1] = var3.field3249;
            return 1;
        } else if (arg0 == 2604) {
            field809[++Statics.field4593 - 1] = var3.field3239;
            return 1;
        } else if (arg0 == 2605) {
            field809[++Statics.field4593 - 1] = var3.field3362;
            return 1;
        } else if (arg0 == 2606) {
            field809[++Statics.field4593 - 1] = var3.field3277;
            return 1;
        } else if (arg0 == 2607) {
            field809[++Statics.field4593 - 1] = var3.field3344;
            return 1;
        } else if (arg0 == 2608) {
            field809[++Statics.field4593 - 1] = var3.field3278;
            return 1;
        } else if (arg0 == 2609) {
            field809[++Statics.field4593 - 1] = var3.field3257;
            return 1;
        } else if (arg0 == 2610) {
            field809[++Statics.field4593 - 1] = var3.field3258;
            return 1;
        } else if (arg0 == 2611) {
            field809[++Statics.field4593 - 1] = var3.field3251;
            return 1;
        } else if (arg0 == 2612) {
            field809[++Statics.field4593 - 1] = var3.field3347;
            return 1;
        } else if (arg0 == 2613) {
            field809[++Statics.field4593 - 1] = var3.field3256.method46();
            return 1;
        } else if (arg0 == 2614) {
            field809[++Statics.field4593 - 1] = var3.field3289 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field4593++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.f(ILbn;ZI)I")
    public static int method1918(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class281 var3 = class281.method1956(field809[--Statics.field4593]);
            field809[++Statics.field4593 - 1] = var3.field3269;
            return 1;
        } else if (arg0 == 2701) {
            class281 var4 = class281.method1956(field809[--Statics.field4593]);
            if (var4.field3269 == -1) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = var4.field3214;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field809[--Statics.field4593];
            class80 var6 = (class80) client.field638.method6446((long) var5);
            if (var6 == null) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field809[++Statics.field4593 - 1] = client.field637;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("v.l(ILbn;ZI)I")
    public static int method117(int arg0, class72 arg1, boolean arg2) {
        class281 var3 = class281.method1956(field809[--Statics.field4593]);
        if (arg0 == 2800) {
            field809[++Statics.field4593 - 1] = class282.method6545(client.method5970(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field809[--Statics.field4593];
            int var5 = var4 - 1;
            if (var3.field3282 == null || var5 >= var3.field3282.length || var3.field3282[var5] == null) {
                field810[++Statics.field78 - 1] = "";
            } else {
                field810[++Statics.field78 - 1] = var3.field3282[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3305 == null) {
                field810[++Statics.field78 - 1] = "";
            } else {
                field810[++Statics.field78 - 1] = var3.field3305;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bf.q(ILbn;ZI)I")
    public static int method2025(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field810[--Statics.field78];
            class98.method3622(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field4593 -= 2;
            client.method2601(Statics.field4070, field809[Statics.field4593], field809[Statics.field4593 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field817) {
                field819 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field810[--Statics.field78];
            int var5 = 0;
            if (class331.method2685(var4)) {
                var5 = class331.method2606(var4);
            }
            class255 var6 = Statics.method3174(class253.field2863, client.field690.field1286);
            var6.field2930.method6656(var5);
            client.field690.method2328(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field810[--Statics.field78];
            class255 var8 = Statics.method3174(class253.field2846, client.field690.field1286);
            var8.field2930.method6841(var7.length() + 1);
            var8.field2930.method6660(var7);
            client.field690.method2328(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field810[--Statics.field78];
            class255 var10 = Statics.method3174(class253.field2894, client.field690.field1286);
            var10.field2930.method6841(var9.length() + 1);
            var10.field2930.method6660(var9);
            client.field690.method2328(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field809[--Statics.field4593];
            String var12 = field810[--Statics.field78];
            client.method2631(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field4593 -= 3;
            int var13 = field809[Statics.field4593];
            int var14 = field809[Statics.field4593 + 1];
            int var15 = field809[Statics.field4593 + 2];
            class281 var16 = class281.method1956(var15);
            client.method437(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field4593 -= 2;
            int var17 = field809[Statics.field4593];
            int var18 = field809[Statics.field4593 + 1];
            class281 var19 = arg2 ? Statics.field2616 : Statics.field1276;
            client.method437(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1666 = field809[--Statics.field4593] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field809[++Statics.field4593 - 1] = Statics.field929.field1194 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field929.field1194 = field809[--Statics.field4593] == 1;
            class89.method2604();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field810[--Statics.field78];
            boolean var21 = field809[--Statics.field4593] == 1;
            class30.method4390(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field809[--Statics.field4593];
            class255 var23 = Statics.method3174(class253.field2809, client.field690.field1286);
            var23.field2930.method6654(var22);
            client.field690.method2328(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field809[--Statics.field4593];
            Statics.field78 -= 2;
            String var25 = field810[Statics.field78];
            String var26 = field810[Statics.field78 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class255 var27 = Statics.method3174(class253.field2842, client.field690.field1286);
                var27.field2930.method6654(1 + class419.method2537(var25) + class419.method2537(var26));
                var27.field2930.method6660(var25);
                var27.field2930.method6651(var24);
                var27.field2930.method6660(var26);
                client.field690.method2328(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field623 = field809[--Statics.field4593] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field575 = field809[--Statics.field4593] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field596 = field809[--Statics.field4593] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field809[--Statics.field4593] == 1) {
                client.field597 |= 0x1;
            } else {
                client.field597 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field809[--Statics.field4593] == 1) {
                client.field597 |= 0x2;
            } else {
                client.field597 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field809[--Statics.field4593] == 1) {
                client.field597 |= 0x4;
            } else {
                client.field597 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field809[--Statics.field4593] == 1) {
                client.field597 |= 0x8;
            } else {
                client.field597 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field597 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field582 = field809[--Statics.field4593] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field645 = field809[--Statics.field4593] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method120(field809[--Statics.field4593] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field809[++Statics.field4593 - 1] = client.method2012() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field4593 -= 2;
            client.field557 = field809[Statics.field4593];
            client.field535 = field809[Statics.field4593 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field4593 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 3132) {
            field809[++Statics.field4593 - 1] = Statics.field2137;
            field809[++Statics.field4593 - 1] = Statics.field2535;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field4593 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field639 = 3;
            client.field640 = field809[--Statics.field4593];
            return 1;
        } else if (arg0 == 3137) {
            client.field639 = 2;
            client.field640 = field809[--Statics.field4593];
            return 1;
        } else if (arg0 == 3138) {
            client.field639 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field639 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field639 = 3;
            client.field640 = arg2 ? Statics.field2616.field3226 : Statics.field1276.field3226;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field809[--Statics.field4593] == 1;
            Statics.field929.field1196 = var28;
            class89.method2604();
            return 1;
        } else if (arg0 == 3142) {
            field809[++Statics.field4593 - 1] = Statics.field929.field1196 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field809[--Statics.field4593] == 1;
            client.field513 = var29;
            if (!var29) {
                Statics.field929.field1197 = "";
                class89.method2604();
            }
            return 1;
        } else if (arg0 == 3144) {
            field809[++Statics.field4593 - 1] = client.field513 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field809[--Statics.field4593] == 1;
            if (Statics.field929.field1203 == var30) {
                Statics.field929.field1203 = !var30;
                class89.method2604();
            }
            return 1;
        } else if (arg0 == 3147) {
            field809[++Statics.field4593 - 1] = Statics.field929.field1203 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field809[++Statics.field4593 - 1] = class69.field868;
            return 1;
        } else if (arg0 == 3154) {
            field809[++Statics.field4593 - 1] = client.method7011();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field78--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field4593 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field4593--;
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field4593--;
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field78--;
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field4593--;
            field810[++Statics.field78 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field4593--;
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field4593 -= 2;
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field4593 -= 2;
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field4593 -= 2;
            field810[++Statics.field78 - 1] = "";
            field810[++Statics.field78 - 1] = "";
            field810[++Statics.field78 - 1] = "";
            field810[++Statics.field78 - 1] = "";
            field810[++Statics.field78 - 1] = "";
            field810[++Statics.field78 - 1] = "";
            field810[++Statics.field78 - 1] = "";
            field810[++Statics.field78 - 1] = "";
            field810[++Statics.field78 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field4593--;
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 3175) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field78--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field78--;
            return 1;
        } else if (arg0 == 3181) {
            int var31 = 100 - Math.min(Math.max(field809[--Statics.field4593], 0), 100);
            client.method2045((double) ((float) var31 / 200.0F + 0.5F));
            return 1;
        } else if (arg0 == 3182) {
            float var32 = ((float) Statics.field929.field1199 - 0.5F) * 200.0F;
            field809[++Statics.field4593 - 1] = 100 - Math.round(var32);
            return 1;
        } else if (arg0 == 3183 || arg0 == 3184) {
            Statics.field4593--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fr.x(ILbn;ZI)I")
    public static int method3088(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field4593 -= 3;
            client.method2173(field809[Statics.field4593], field809[Statics.field4593 + 1], field809[Statics.field4593 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method292(field809[--Statics.field4593]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field4593 -= 2;
            client.method5269(field809[Statics.field4593], field809[Statics.field4593 + 1]);
            return 1;
        } else if (arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            int var6 = 0;
            int var7 = field809[--Statics.field4593];
            if (arg0 == 3209) {
                var6 = field809[--Statics.field4593];
            } else if (arg0 == 3181) {
                var6 = 6;
            } else if (arg0 == 3203) {
                var6 = 7;
            } else if (arg0 == 3205) {
                var6 = 8;
            } else if (arg0 == 3207) {
                var6 = 9;
            }
            if (var6 == 6) {
                int var8 = 100 - Math.min(Math.max(var7, 0), 100);
                client.method2045((double) ((float) var8 / 200.0F + 0.5F));
            } else if (var6 == 7) {
                int var9 = Math.min(Math.max(var7, 0), 100);
                client.method2303(Math.round((float) var9 * 2.55F));
            } else if (var6 == 8) {
                int var10 = Math.min(Math.max(var7, 0), 100);
                client.method326(Math.round((float) var10 * 1.27F));
            } else if (var6 == 9) {
                int var11 = Math.min(Math.max(var7, 0), 100);
                client.method2260(Math.round((float) var11 * 1.27F));
            }
            return 1;
        } else if (arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            int var3 = 0;
            int var4 = 0;
            if (arg0 == 3210) {
                var3 = field809[--Statics.field4593];
            } else if (arg0 == 3182) {
                var3 = 6;
            } else if (arg0 == 3204) {
                var3 = 7;
            } else if (arg0 == 3206) {
                var3 = 8;
            } else if (arg0 == 3208) {
                var3 = 9;
            }
            if (var3 == 6) {
                float var5 = ((float) Statics.field929.field1199 - 0.5F) * 200.0F;
                var4 = 100 - Math.round(var5);
            } else if (var3 == 7) {
                var4 = Math.round((float) Statics.field929.field1200 / 2.55F);
            } else if (var3 == 8) {
                var4 = Math.round((float) Statics.field929.field1201 / 1.27F);
            } else if (var3 == 9) {
                var4 = Math.round((float) Statics.field929.field1202 / 1.27F);
            }
            field809[++Statics.field4593 - 1] = var4;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.z(ILbn;ZB)I")
    public static int method182(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field809[++Statics.field4593 - 1] = client.field481;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field4593 -= 2;
            int var3 = field809[Statics.field4593];
            int var4 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = class78.method181(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field4593 -= 2;
            int var5 = field809[Statics.field4593];
            int var6 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = class78.method657(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field4593 -= 2;
            int var7 = field809[Statics.field4593];
            int var8 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = class78.method2063(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class162.method2042(var9).field1740;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = client.field749[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = client.field610[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = client.field611[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field110;
            int var14 = (Statics.field4070.field1130 >> 7) + Statics.field1533;
            int var15 = (Statics.field4070.field1090 >> 7) + Statics.field1240;
            field809[++Statics.field4593 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field809[++Statics.field4593 - 1] = client.field601 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field4593 -= 2;
            int var19 = field809[Statics.field4593] + 32768;
            int var20 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = class78.method181(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field4593 -= 2;
            int var21 = field809[Statics.field4593] + 32768;
            int var22 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = class78.method657(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field4593 -= 2;
            int var23 = field809[Statics.field4593] + 32768;
            int var24 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = class78.method2063(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field547 >= 2) {
                field809[++Statics.field4593 - 1] = client.field547;
            } else {
                field809[++Statics.field4593 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field809[++Statics.field4593 - 1] = client.field489;
            return 1;
        } else if (arg0 == 3318) {
            field809[++Statics.field4593 - 1] = client.field469;
            return 1;
        } else if (arg0 == 3321) {
            field809[++Statics.field4593 - 1] = client.field644;
            return 1;
        } else if (arg0 == 3322) {
            field809[++Statics.field4593 - 1] = client.field722;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field648) {
                field809[++Statics.field4593 - 1] = 1;
            } else {
                field809[++Statics.field4593 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field809[++Statics.field4593 - 1] = client.field470;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field4593 -= 4;
            int var25 = field809[Statics.field4593];
            int var26 = field809[Statics.field4593 + 1];
            int var27 = field809[Statics.field4593 + 2];
            int var28 = field809[Statics.field4593 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field809[++Statics.field4593 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field809[++Statics.field4593 - 1] = client.field484;
            return 1;
        } else if (arg0 == 3327) {
            field809[++Statics.field4593 - 1] = client.field747;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("av.i(ILbn;ZI)I")
    public static int method655(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field4593 -= 2;
            int var3 = field809[Statics.field4593];
            int var4 = field809[Statics.field4593 + 1];
            class169 var5 = class169.method2550(var3);
            if (var5.field1821 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1815; var6++) {
                if (var5.field1818[var6] == var4) {
                    field810[++Statics.field78 - 1] = var5.field1824[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field810[++Statics.field78 - 1] = var5.field1820;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field4593 -= 4;
            int var7 = field809[Statics.field4593];
            int var8 = field809[Statics.field4593 + 1];
            int var9 = field809[Statics.field4593 + 2];
            int var10 = field809[Statics.field4593 + 3];
            class169 var11 = class169.method2550(var9);
            if (var11.field1817 != var7 || var11.field1821 != var8) {
                if (var8 == 115) {
                    field810[++Statics.field78 - 1] = class295.field3477;
                } else {
                    field809[++Statics.field4593 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1815; var12++) {
                if (var11.field1818[var12] == var10) {
                    if (var8 == 115) {
                        field810[++Statics.field78 - 1] = var11.field1824[var12];
                    } else {
                        field809[++Statics.field4593 - 1] = var11.field1823[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field810[++Statics.field78 - 1] = var11.field1820;
                } else {
                    field809[++Statics.field4593 - 1] = var11.field1819;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field809[--Statics.field4593];
            class169 var14 = class169.method2550(var13);
            field809[++Statics.field4593 - 1] = var14.method2975();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.y(ILbn;ZB)I")
    public static int method193(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class24.method390(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class24.method3115(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class24.method2540(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gn.ah(ILbn;ZI)I")
    public static int method3331(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field182.field779 == 0) {
                field809[++Statics.field4593 - 1] = -2;
            } else if (Statics.field182.field779 == 1) {
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = Statics.field182.field782.method5794();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field809[--Statics.field4593];
            if (Statics.field182.method1641() && var3 >= 0 && var3 < Statics.field182.field782.method5794()) {
                class346 var4 = (class346) Statics.field182.field782.method5804(var3);
                field810[++Statics.field78 - 1] = var4.method5774();
                field810[++Statics.field78 - 1] = var4.method5769();
            } else {
                field810[++Statics.field78 - 1] = "";
                field810[++Statics.field78 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field809[--Statics.field4593];
            if (Statics.field182.method1641() && var5 >= 0 && var5 < Statics.field182.field782.method5794()) {
                field809[++Statics.field4593 - 1] = ((class354) Statics.field182.field782.method5804(var5)).field4121;
            } else {
                field809[++Statics.field4593 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field809[--Statics.field4593];
            if (Statics.field182.method1641() && var6 >= 0 && var6 < Statics.field182.field782.method5794()) {
                field809[++Statics.field4593 - 1] = ((class354) Statics.field182.field782.method5804(var6)).field4119;
            } else {
                field809[++Statics.field4593 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field810[--Statics.field78];
            int var8 = field809[--Statics.field4593];
            class62.method2495(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field810[--Statics.field78];
            Statics.field182.method1648(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field810[--Statics.field78];
            Statics.field182.method1706(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field810[--Statics.field78];
            Statics.field182.method1678(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field810[--Statics.field78];
            Statics.field182.method1650(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field810[--Statics.field78];
            String var14 = client.method4384(var13);
            field809[++Statics.field4593 - 1] = Statics.field182.method1646(new class440(var14, Statics.field2283), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1252 == null) {
                field810[++Statics.field78 - 1] = "";
            } else {
                field810[++Statics.field78 - 1] = Statics.field1252.field4092;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1252 == null) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = Statics.field1252.method5794();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field809[--Statics.field4593];
            if (Statics.field1252 == null || var15 >= Statics.field1252.method5794()) {
                field810[++Statics.field78 - 1] = "";
            } else {
                field810[++Statics.field78 - 1] = Statics.field1252.method5804(var15).method5770().method7187();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field809[--Statics.field4593];
            if (Statics.field1252 == null || var16 >= Statics.field1252.method5794()) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = ((class354) Statics.field1252.method5804(var16)).method5861();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field809[--Statics.field4593];
            if (Statics.field1252 == null || var17 >= Statics.field1252.method5794()) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = ((class354) Statics.field1252.method5804(var17)).field4119;
            }
            return 1;
        } else if (arg0 == 3616) {
            field809[++Statics.field4593 - 1] = Statics.field1252 == null ? 0 : Statics.field1252.field4094;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field810[--Statics.field78];
            client.method6569(var18);
            return 1;
        } else if (arg0 == 3618) {
            field809[++Statics.field4593 - 1] = Statics.field1252 == null ? 0 : Statics.field1252.field4095;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field810[--Statics.field78];
            client.method2714(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method4048();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field182.method1641()) {
                field809[++Statics.field4593 - 1] = Statics.field182.field783.method5794();
            } else {
                field809[++Statics.field4593 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field809[--Statics.field4593];
            if (Statics.field182.method1641() && var20 >= 0 && var20 < Statics.field182.field783.method5794()) {
                class353 var21 = (class353) Statics.field182.field783.method5804(var20);
                field810[++Statics.field78 - 1] = var21.method5774();
                field810[++Statics.field78 - 1] = var21.method5769();
            } else {
                field810[++Statics.field78 - 1] = "";
                field810[++Statics.field78 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field810[--Statics.field78];
            String var23 = client.method4384(var22);
            field809[++Statics.field4593 - 1] = Statics.field182.method1647(new class440(var23, Statics.field2283)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field809[--Statics.field4593];
            if (Statics.field1252 == null || var24 >= Statics.field1252.method5794() || !Statics.field1252.method5804(var24).method5770().equals(Statics.field4070.field1071)) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1252 == null || Statics.field1252.field4093 == null) {
                field810[++Statics.field78 - 1] = "";
            } else {
                field810[++Statics.field78 - 1] = Statics.field1252.field4093;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field809[--Statics.field4593];
            if (Statics.field1252 == null || var25 >= Statics.field1252.method5794() || !((class349) Statics.field1252.method5804(var25)).method5756()) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field809[--Statics.field4593];
            if (Statics.field1252 == null || var26 >= Statics.field1252.method5794() || !((class349) Statics.field1252.method5804(var26)).method5748()) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field182.field782.method5813();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field809[--Statics.field4593] == 1;
            Statics.field182.field782.method5814(new class424(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field809[--Statics.field4593] == 1;
            Statics.field182.field782.method5814(new class425(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field809[--Statics.field4593] == 1;
            Statics.field182.field782.method5814(new class106(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field809[--Statics.field4593] == 1;
            Statics.field182.field782.method5814(new class102(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field809[--Statics.field4593] == 1;
            Statics.field182.field782.method5814(new class105(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field809[--Statics.field4593] == 1;
            Statics.field182.field782.method5814(new class110(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field809[--Statics.field4593] == 1;
            Statics.field182.field782.method5814(new class104(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field809[--Statics.field4593] == 1;
            Statics.field182.field782.method5814(new class103(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field809[--Statics.field4593] == 1;
            Statics.field182.field782.method5814(new class107(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field809[--Statics.field4593] == 1;
            Statics.field182.field782.method5814(new class108(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field182.field782.method5805();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field182.field783.method5813();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field809[--Statics.field4593] == 1;
            Statics.field182.field783.method5814(new class424(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field809[--Statics.field4593] == 1;
            Statics.field182.field783.method5814(new class425(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field182.field783.method5805();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1252 != null) {
                Statics.field1252.method5813();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field809[--Statics.field4593] == 1;
            if (Statics.field1252 != null) {
                Statics.field1252.method5814(new class424(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field809[--Statics.field4593] == 1;
            if (Statics.field1252 != null) {
                Statics.field1252.method5814(new class425(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field809[--Statics.field4593] == 1;
            if (Statics.field1252 != null) {
                Statics.field1252.method5814(new class106(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field809[--Statics.field4593] == 1;
            if (Statics.field1252 != null) {
                Statics.field1252.method5814(new class102(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field809[--Statics.field4593] == 1;
            if (Statics.field1252 != null) {
                Statics.field1252.method5814(new class105(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field809[--Statics.field4593] == 1;
            if (Statics.field1252 != null) {
                Statics.field1252.method5814(new class110(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field809[--Statics.field4593] == 1;
            if (Statics.field1252 != null) {
                Statics.field1252.method5814(new class104(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field809[--Statics.field4593] == 1;
            if (Statics.field1252 != null) {
                Statics.field1252.method5814(new class103(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field809[--Statics.field4593] == 1;
            if (Statics.field1252 != null) {
                Statics.field1252.method5814(new class107(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field809[--Statics.field4593] == 1;
            if (Statics.field1252 != null) {
                Statics.field1252.method5814(new class108(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1252 != null) {
                Statics.field1252.method5805();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field809[--Statics.field4593] == 1;
            Statics.field182.field782.method5814(new class109(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field809[--Statics.field4593] == 1;
            if (Statics.field1252 != null) {
                Statics.field1252.method5814(new class109(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fq.ao(ILbn;ZB)I")
    public static int method2970(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field4593--;
            Statics.field78--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field4593++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ld.ab(ILbn;ZS)I")
    public static int method5614(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field2667 == null) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = 1;
                Statics.field4085 = Statics.field2667;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field809[--Statics.field4593];
            if (client.field706[var3] == null) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = 1;
                Statics.field4085 = client.field706[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field810[++Statics.field78 - 1] = Statics.field4085.field1565;
            return 1;
        } else if (arg0 == 3803) {
            field809[++Statics.field4593 - 1] = Statics.field4085.field1567 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field809[++Statics.field4593 - 1] = Statics.field4085.field1568;
            return 1;
        } else if (arg0 == 3805) {
            field809[++Statics.field4593 - 1] = Statics.field4085.field1569;
            return 1;
        } else if (arg0 == 3806) {
            field809[++Statics.field4593 - 1] = Statics.field4085.field1570;
            return 1;
        } else if (arg0 == 3807) {
            field809[++Statics.field4593 - 1] = Statics.field4085.field1571;
            return 1;
        } else if (arg0 == 3809) {
            field809[++Statics.field4593 - 1] = Statics.field4085.field1584;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field809[--Statics.field4593];
            field810[++Statics.field78 - 1] = Statics.field4085.field1561[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = Statics.field4085.field1574[var5];
            return 1;
        } else if (arg0 == 3812) {
            field809[++Statics.field4593 - 1] = Statics.field4085.field1581;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field809[--Statics.field4593];
            field810[++Statics.field78 - 1] = Statics.field4085.field1582[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field4593 -= 3;
            int var7 = field809[Statics.field4593];
            int var8 = field809[Statics.field4593 + 1];
            int var9 = field809[Statics.field4593 + 2];
            field809[++Statics.field4593 - 1] = Statics.field4085.method2638(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field809[++Statics.field4593 - 1] = Statics.field4085.field1579;
            return 1;
        } else if (arg0 == 3816) {
            field809[++Statics.field4593 - 1] = Statics.field4085.field1580;
            return 1;
        } else if (arg0 == 3817) {
            field809[++Statics.field4593 - 1] = Statics.field4085.method2672(field810[--Statics.field78]);
            return 1;
        } else if (arg0 == 3818) {
            field809[Statics.field4593 - 1] = Statics.field4085.method2693()[field809[Statics.field4593 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field4593 -= 2;
            int var10 = field809[Statics.field4593];
            int var11 = field809[Statics.field4593 + 1];
            client.method2494(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = Statics.field4085.field1583[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field4593 -= 3;
                int var13 = field809[Statics.field4593];
                boolean var14 = field809[Statics.field4593 + 1] == 1;
                int var15 = field809[Statics.field4593 + 2];
                client.method45(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field809[--Statics.field4593];
                field809[++Statics.field4593 - 1] = Statics.field4085.field1578[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field1324 == null) {
                    field809[++Statics.field4593 - 1] = 0;
                } else {
                    field809[++Statics.field4593 - 1] = 1;
                    Statics.field1 = Statics.field1324;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field809[--Statics.field4593];
                if (client.field707[var17] == null) {
                    field809[++Statics.field4593 - 1] = 0;
                } else {
                    field809[++Statics.field4593 - 1] = 1;
                    Statics.field1 = client.field707[var17];
                    Statics.field813 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field810[++Statics.field78 - 1] = Statics.field1.field1642;
                return 1;
            } else if (arg0 == 3853) {
                field809[++Statics.field4593 - 1] = Statics.field1.field1644;
                return 1;
            } else if (arg0 == 3854) {
                field809[++Statics.field4593 - 1] = Statics.field1.field1637;
                return 1;
            } else if (arg0 == 3855) {
                field809[++Statics.field4593 - 1] = Statics.field1.method2736();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field809[--Statics.field4593];
                field810[++Statics.field78 - 1] = ((class129) Statics.field1.field1639.get(var18)).field1506.method7187();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field809[--Statics.field4593];
                field809[++Statics.field4593 - 1] = ((class129) Statics.field1.field1639.get(var19)).field1507;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field809[--Statics.field4593];
                field809[++Statics.field4593 - 1] = ((class129) Statics.field1.field1639.get(var20)).field1510;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field809[--Statics.field4593];
                client.method2628(Statics.field813, var21);
                return 1;
            } else if (arg0 == 3860) {
                field809[++Statics.field4593 - 1] = Statics.field1.method2737(field810[--Statics.field78]);
                return 1;
            } else if (arg0 == 3861) {
                field809[Statics.field4593 - 1] = Statics.field1.method2751()[field809[Statics.field4593 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field809[++Statics.field4593 - 1] = Statics.field1343 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("ab.an(ILbn;ZB)I")
    public static int method435(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = client.field748[var3].method5216();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = client.field748[var4].field3906;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = client.field748[var5].field3900;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = client.field748[var6].field3902;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = client.field748[var7].field3904;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = client.field748[var8].field3905;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field809[--Statics.field4593];
            int var10 = client.field748[var9].method5215();
            field809[++Statics.field4593 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field809[--Statics.field4593];
            int var12 = client.field748[var11].method5215();
            field809[++Statics.field4593 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field809[--Statics.field4593];
            int var14 = client.field748[var13].method5215();
            field809[++Statics.field4593 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field809[--Statics.field4593];
            int var16 = client.field748[var15].method5215();
            field809[++Statics.field4593 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field809[--Statics.field4593] == 1;
            if (Statics.field524 != null) {
                Statics.field524.method5164(class304.field3873, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field809[--Statics.field4593] == 1;
            if (Statics.field524 != null) {
                Statics.field524.method5164(class304.field3872, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field4593 -= 2;
            boolean var19 = field809[Statics.field4593] == 1;
            boolean var20 = field809[Statics.field4593 + 1] == 1;
            if (Statics.field524 != null) {
                client.field728.field464 = var20;
                Statics.field524.method5164(client.field728, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field809[--Statics.field4593] == 1;
            if (Statics.field524 != null) {
                Statics.field524.method5164(class304.field3874, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field809[--Statics.field4593] == 1;
            if (Statics.field524 != null) {
                Statics.field524.method5164(class304.field3870, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field809[++Statics.field4593 - 1] = Statics.field524 == null ? 0 : Statics.field524.field3871.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field809[--Statics.field4593];
            class310 var24 = (class310) Statics.field524.field3871.get(var23);
            field809[++Statics.field4593 - 1] = var24.field3898;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field809[--Statics.field4593];
            class310 var26 = (class310) Statics.field524.field3871.get(var25);
            field810[++Statics.field78 - 1] = var26.method5206();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field809[--Statics.field4593];
            class310 var28 = (class310) Statics.field524.field3871.get(var27);
            field810[++Statics.field78 - 1] = var28.method5205();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field809[--Statics.field4593];
            class310 var30 = (class310) Statics.field524.field3871.get(var29);
            long var31 = class416.method5860() - Statics.field2728 - var30.field3894;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field810[++Statics.field78 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field809[--Statics.field4593];
            class310 var38 = (class310) Statics.field524.field3871.get(var37);
            field809[++Statics.field4593 - 1] = var38.field3896.field3902;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field809[--Statics.field4593];
            class310 var40 = (class310) Statics.field524.field3871.get(var39);
            field809[++Statics.field4593 - 1] = var40.field3896.field3900;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field809[--Statics.field4593];
            class310 var42 = (class310) Statics.field524.field3871.get(var41);
            field809[++Statics.field4593 - 1] = var42.field3896.field3906;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mf.ax(ILbn;ZB)I")
    public static int method5688(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field4593 -= 2;
            int var3 = field809[Statics.field4593];
            int var4 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field4593 -= 2;
            int var5 = field809[Statics.field4593];
            int var6 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field4593 -= 2;
            int var7 = field809[Statics.field4593];
            int var8 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field4593 -= 2;
            int var9 = field809[Statics.field4593];
            int var10 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field4593 -= 5;
            int var13 = field809[Statics.field4593];
            int var14 = field809[Statics.field4593 + 1];
            int var15 = field809[Statics.field4593 + 2];
            int var16 = field809[Statics.field4593 + 3];
            int var17 = field809[Statics.field4593 + 4];
            field809[++Statics.field4593 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field4593 -= 2;
            int var18 = field809[Statics.field4593];
            int var19 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field4593 -= 2;
            int var20 = field809[Statics.field4593];
            int var21 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field4593 -= 2;
            int var22 = field809[Statics.field4593];
            int var23 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field4593 -= 2;
            int var24 = field809[Statics.field4593];
            int var25 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field4593 -= 2;
            int var26 = field809[Statics.field4593];
            int var27 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field4593 -= 2;
            int var28 = field809[Statics.field4593];
            int var29 = field809[Statics.field4593 + 1];
            if (var28 == 0) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field4593 -= 2;
            int var30 = field809[Statics.field4593];
            int var31 = field809[Statics.field4593 + 1];
            if (var30 == 0) {
                field809[++Statics.field4593 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field809[++Statics.field4593 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field809[++Statics.field4593 - 1] = var30;
                    break;
                case 2:
                    field809[++Statics.field4593 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field809[++Statics.field4593 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field809[++Statics.field4593 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field809[++Statics.field4593 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field4593 -= 2;
            int var32 = field809[Statics.field4593];
            int var33 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field4593 -= 2;
            int var34 = field809[Statics.field4593];
            int var35 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field4593 -= 3;
            long var36 = (long) field809[Statics.field4593];
            long var38 = (long) field809[Statics.field4593 + 1];
            long var40 = (long) field809[Statics.field4593 + 2];
            field809[++Statics.field4593 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class259.method5272(field809[--Statics.field4593]);
            field809[++Statics.field4593 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field4593 -= 2;
            int var43 = field809[Statics.field4593];
            int var44 = field809[Statics.field4593 + 1];
            field809[++Statics.field4593 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field4593 -= 3;
            int var45 = field809[Statics.field4593];
            int var46 = field809[Statics.field4593 + 1];
            int var47 = field809[Statics.field4593 + 2];
            field809[++Statics.field4593 - 1] = class259.method3327(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field4593 -= 3;
            int var48 = field809[Statics.field4593];
            int var49 = field809[Statics.field4593 + 1];
            int var50 = field809[Statics.field4593 + 2];
            field809[++Statics.field4593 - 1] = class259.method2589(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field4593 -= 3;
            int var51 = field809[Statics.field4593];
            int var52 = field809[Statics.field4593 + 1];
            int var53 = field809[Statics.field4593 + 2];
            int var54 = 31 - var53;
            field809[++Statics.field4593 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field4593 -= 4;
            int var55 = field809[Statics.field4593];
            int var56 = field809[Statics.field4593 + 1];
            int var57 = field809[Statics.field4593 + 2];
            int var58 = field809[Statics.field4593 + 3];
            int var59 = class259.method2589(var55, var57, var58);
            int var60 = class259.method4481(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field809[++Statics.field4593 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field809[Statics.field4593 - 1] = class379.method803(field809[Statics.field4593 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field809[Statics.field4593 - 1] = class379.method5179(field809[Statics.field4593 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field4593 -= 2;
            int var61 = field809[Statics.field4593];
            int var62 = field809[Statics.field4593 + 1];
            int var63 = Statics.method2596(var61, var62);
            field809[++Statics.field4593 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field809[Statics.field4593 - 1] = Math.abs(field809[Statics.field4593 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ko.am(ILbn;ZI)I")
    public static int method4971(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field810[--Statics.field78];
            int var4 = field809[--Statics.field4593];
            field810[++Statics.field78 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field78 -= 2;
            String var5 = field810[Statics.field78];
            String var6 = field810[Statics.field78 + 1];
            field810[++Statics.field78 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field810[--Statics.field78];
            int var8 = field809[--Statics.field4593];
            field810[++Statics.field78 - 1] = var7 + class331.method5657(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field810[--Statics.field78];
            field810[++Statics.field78 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field809[--Statics.field4593];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field805.setTime(new Date(var11));
            int var13 = field805.get(5);
            int var14 = field805.get(2);
            int var15 = field805.get(1);
            field810[++Statics.field78 - 1] = var13 + "-" + field821[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field78 -= 2;
            String var16 = field810[Statics.field78];
            String var17 = field810[Statics.field78 + 1];
            if (Statics.field4070.field1046 != null && Statics.field4070.field1046.field3196) {
                field810[++Statics.field78 - 1] = var17;
            } else {
                field810[++Statics.field78 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field809[--Statics.field4593];
            field810[++Statics.field78 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field78 -= 2;
            field809[++Statics.field4593 - 1] = class331.method3610(class332.method2728(field810[Statics.field78], field810[Statics.field78 + 1], Statics.field446));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field810[--Statics.field78];
            Statics.field4593 -= 2;
            int var20 = field809[Statics.field4593];
            int var21 = field809[Statics.field4593 + 1];
            byte[] var22 = Statics.field5.method5053(var21, 0);
            class327 var23 = new class327(var22);
            field809[++Statics.field4593 - 1] = var23.method5482(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field810[--Statics.field78];
            Statics.field4593 -= 2;
            int var25 = field809[Statics.field4593];
            int var26 = field809[Statics.field4593 + 1];
            byte[] var27 = Statics.field5.method5053(var26, 0);
            class327 var28 = new class327(var27);
            field809[++Statics.field4593 - 1] = var28.method5458(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field78 -= 2;
            String var29 = field810[Statics.field78];
            String var30 = field810[Statics.field78 + 1];
            if (field809[--Statics.field4593] == 1) {
                field810[++Statics.field78 - 1] = var29;
            } else {
                field810[++Statics.field78 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field810[--Statics.field78];
            field810[++Statics.field78 - 1] = class328.method5460(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field810[--Statics.field78];
            int var33 = field809[--Statics.field4593];
            field810[++Statics.field78 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class331.method4353((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class331.method4342((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class331.method2960((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class331.method4851((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field810[--Statics.field78];
            if (var38 == null) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field810[--Statics.field78];
            Statics.field4593 -= 2;
            int var40 = field809[Statics.field4593];
            int var41 = field809[Statics.field4593 + 1];
            field810[++Statics.field78 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field810[--Statics.field78];
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
            field810[++Statics.field78 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field810[--Statics.field78];
            int var48 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field78 -= 2;
            String var49 = field810[Statics.field78];
            String var50 = field810[Statics.field78 + 1];
            int var51 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field810[--Statics.field78];
            field810[++Statics.field78 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mu.az(ILbn;ZI)I")
    public static int method5869(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field809[--Statics.field4593];
            field810[++Statics.field78 - 1] = class181.method2432(var3).field2014;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field4593 -= 2;
            int var4 = field809[Statics.field4593];
            int var5 = field809[Statics.field4593 + 1];
            class181 var6 = class181.method2432(var4);
            if (var5 < 1 || var5 > 5 || var6.field2016[var5 - 1] == null) {
                field810[++Statics.field78 - 1] = "";
            } else {
                field810[++Statics.field78 - 1] = var6.field2016[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field4593 -= 2;
            int var7 = field809[Statics.field4593];
            int var8 = field809[Statics.field4593 + 1];
            class181 var9 = class181.method2432(var7);
            if (var8 < 1 || var8 > 5 || var9.field2050[var8 - 1] == null) {
                field810[++Statics.field78 - 1] = "";
            } else {
                field810[++Statics.field78 - 1] = var9.field2050[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class181.method2432(var10).field2026;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class181.method2432(var11).field2018 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field809[--Statics.field4593];
            class181 var13 = class181.method2432(var12);
            if (var13.field2046 == -1 && var13.field2045 >= 0) {
                field809[++Statics.field4593 - 1] = var13.field2045;
            } else {
                field809[++Statics.field4593 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field809[--Statics.field4593];
            class181 var15 = class181.method2432(var14);
            if (var15.field2046 >= 0 && var15.field2045 >= 0) {
                field809[++Statics.field4593 - 1] = var15.field2045;
            } else {
                field809[++Statics.field4593 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class181.method2432(var16).field2027 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field809[--Statics.field4593];
            class181 var18 = class181.method2432(var17);
            if (var18.field2028 == -1 && var18.field2057 >= 0) {
                field809[++Statics.field4593 - 1] = var18.field2057;
            } else {
                field809[++Statics.field4593 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field809[--Statics.field4593];
            class181 var20 = class181.method2432(var19);
            if (var20.field2028 >= 0 && var20.field2057 >= 0) {
                field809[++Statics.field4593 - 1] = var20.field2057;
            } else {
                field809[++Statics.field4593 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field810[--Statics.field78];
            int var22 = field809[--Statics.field4593];
            client.method3136(var21, var22 == 1);
            field809[++Statics.field4593 - 1] = Statics.field4165;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1381 == null || Statics.field4041 >= Statics.field4165) {
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = Statics.field1381[++Statics.field4041 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field4041 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field809[--Statics.field4593];
            int var24 = class181.method2432(var23).method3250();
            if (var24 == -1) {
                field809[++Statics.field4593 - 1] = var24;
            } else {
                field809[++Statics.field4593 - 1] = var24 + 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fq.au(ILbn;ZI)I")
    public static int method2971(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field809[++Statics.field4593 - 1] = client.field605;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field4593 -= 3;
            client.field605 = field809[Statics.field4593];
            Statics.field924 = class436.method4011(field809[Statics.field4593 + 1]);
            if (Statics.field924 == null) {
                Statics.field924 = class436.field4597;
            }
            client.field698 = field809[Statics.field4593 + 2];
            class255 var3 = Statics.method3174(class253.field2856, client.field690.field1286);
            var3.field2930.method6841(client.field605);
            var3.field2930.method6841(Statics.field924.field4598);
            var3.field2930.method6841(client.field698);
            client.field690.method2328(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field810[--Statics.field78];
            Statics.field4593 -= 2;
            int var5 = field809[Statics.field4593];
            int var6 = field809[Statics.field4593 + 1];
            class255 var7 = Statics.method3174(class253.field2852, client.field690.field1286);
            var7.field2930.method6841(class419.method2537(var4) + 2);
            var7.field2930.method6660(var4);
            var7.field2930.method6841(var5 - 1);
            var7.field2930.method6841(var6);
            client.field690.method2328(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field4593 -= 2;
            int var8 = field809[Statics.field4593];
            int var9 = field809[Statics.field4593 + 1];
            class58 var10 = class98.method3300(var8, var9);
            if (var10 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
                field810[++Statics.field78 - 1] = "";
                field810[++Statics.field78 - 1] = "";
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = var10.field451;
                field809[++Statics.field4593 - 1] = var10.field453;
                field810[++Statics.field78 - 1] = var10.field455 == null ? "" : var10.field455;
                field810[++Statics.field78 - 1] = var10.field450 == null ? "" : var10.field450;
                field810[++Statics.field78 - 1] = var10.field457 == null ? "" : var10.field457;
                field809[++Statics.field4593 - 1] = var10.method1057() ? 1 : (var10.method1052() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field809[--Statics.field4593];
            class58 var12 = class98.method2711(var11);
            if (var12 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
                field810[++Statics.field78 - 1] = "";
                field810[++Statics.field78 - 1] = "";
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = var12.field452;
                field809[++Statics.field4593 - 1] = var12.field453;
                field810[++Statics.field78 - 1] = var12.field455 == null ? "" : var12.field455;
                field810[++Statics.field78 - 1] = var12.field450 == null ? "" : var12.field450;
                field810[++Statics.field78 - 1] = var12.field457 == null ? "" : var12.field457;
                field809[++Statics.field4593 - 1] = var12.method1057() ? 1 : (var12.method1052() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field924 == null) {
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = Statics.field924.field4598;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field810[--Statics.field78];
            int var14 = field809[--Statics.field4593];
            class255 var15 = class441.method5884(var14, var13, Statics.field446, -1);
            client.field690.method2328(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field78 -= 2;
            String var16 = field810[Statics.field78];
            String var17 = field810[Statics.field78 + 1];
            class255 var18 = Statics.method3174(class253.field2850, client.field690.field1286);
            var18.field2930.method6654(0);
            int var19 = var18.field2930.field4475;
            var18.field2930.method6660(var16);
            class270.method6107(var18.field2930, var17);
            var18.field2930.method6666(var18.field2930.field4475 - var19);
            client.field690.method2328(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field810[--Statics.field78];
            Statics.field4593 -= 2;
            int var21 = field809[Statics.field4593];
            int var22 = field809[Statics.field4593 + 1];
            class255 var23 = class441.method5884(var21, var20, Statics.field446, var22);
            client.field690.method2328(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field4070 == null || Statics.field4070.field1071 == null) {
                var24 = "";
            } else {
                var24 = Statics.field4070.field1071.method7187();
            }
            field810[++Statics.field78 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field809[++Statics.field4593 - 1] = client.field698;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class98.method4890(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class98.method3994(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = class98.method2130(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field810[--Statics.field78];
            client.method3418(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field646 = field810[--Statics.field78].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field810[++Statics.field78 - 1] = client.field646;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field810[--Statics.field78];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5024) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 5025) {
            Statics.field4593++;
            return 1;
        } else if (arg0 == 5030) {
            Statics.field4593 -= 2;
            int var30 = field809[Statics.field4593];
            int var31 = field809[Statics.field4593 + 1];
            class58 var32 = class98.method3300(var30, var31);
            if (var32 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
                field810[++Statics.field78 - 1] = "";
                field810[++Statics.field78 - 1] = "";
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = var32.field451;
                field809[++Statics.field4593 - 1] = var32.field453;
                field810[++Statics.field78 - 1] = var32.field455 == null ? "" : var32.field455;
                field810[++Statics.field78 - 1] = var32.field450 == null ? "" : var32.field450;
                field810[++Statics.field78 - 1] = var32.field457 == null ? "" : var32.field457;
                field809[++Statics.field4593 - 1] = var32.method1057() ? 1 : (var32.method1052() ? 2 : 0);
                field810[++Statics.field78 - 1] = "";
                field809[++Statics.field4593 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field809[--Statics.field4593];
            class58 var34 = class98.method2711(var33);
            if (var34 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
                field810[++Statics.field78 - 1] = "";
                field810[++Statics.field78 - 1] = "";
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = var34.field452;
                field809[++Statics.field4593 - 1] = var34.field453;
                field810[++Statics.field78 - 1] = var34.field455 == null ? "" : var34.field455;
                field810[++Statics.field78 - 1] = var34.field450 == null ? "" : var34.field450;
                field810[++Statics.field78 - 1] = var34.field457 == null ? "" : var34.field457;
                field809[++Statics.field4593 - 1] = var34.method1057() ? 1 : (var34.method1052() ? 2 : 0);
                field810[++Statics.field78 - 1] = "";
                field809[++Statics.field4593 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ef.av(ILbn;ZB)I")
    public static int method2627(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field809[++Statics.field4593 - 1] = Statics.method2724();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field809[--Statics.field4593];
            if (var3 == 1 || var3 == 2) {
                client.method3829(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field809[++Statics.field4593 - 1] = Statics.field929.field1192;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field809[--Statics.field4593];
            if (var4 == 1 || var4 == 2) {
                Statics.field929.field1192 = var4;
                class89.method2604();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 5311) {
            Statics.field4593 -= 2;
            return 1;
        } else if (arg0 == 5312) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field78 -= 2;
            Statics.field4593--;
            return 1;
        } else if (arg0 == 5351) {
            Statics.field78--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.ap(ILbn;ZI)I")
    public static int method2715(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field4593 -= 2;
            int var3 = field809[Statics.field4593];
            int var4 = field809[Statics.field4593 + 1];
            if (!client.field724) {
                client.field477 = var3;
                client.field499 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field809[++Statics.field4593 - 1] = client.field477;
            return 1;
        } else if (arg0 == 5506) {
            field809[++Statics.field4593 - 1] = client.field499;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field809[--Statics.field4593];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field553 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field809[++Statics.field4593 - 1] = client.field553;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hv.ac(ILbn;ZS)I")
    public static int method4352(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field506 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field78 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field809[++Statics.field4593 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jf.aj(IB)I")
    public static int method4816(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("bc.af(IB)I")
    public static int method1875(int arg0) {
        return (int) ((Math.log((double) arg0) / field815 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("y.ar(ILbn;ZI)I")
    public static int method397(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field4593 -= 2;
            client.field691 = (short) method4816(field809[Statics.field4593]);
            if (client.field691 <= 0) {
                client.field691 = 256;
            }
            client.field708 = (short) method4816(field809[Statics.field4593 + 1]);
            if (client.field708 <= 0) {
                client.field708 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field4593 -= 2;
            client.field733 = (short) field809[Statics.field4593];
            if (client.field733 <= 0) {
                client.field733 = 256;
            }
            client.field734 = (short) field809[Statics.field4593 + 1];
            if (client.field734 <= 0) {
                client.field734 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field4593 -= 4;
            client.field620 = (short) field809[Statics.field4593];
            if (client.field620 <= 0) {
                client.field620 = 1;
            }
            client.field736 = (short) field809[Statics.field4593 + 1];
            if (client.field736 <= 0) {
                client.field736 = 32767;
            } else if (client.field736 < client.field620) {
                client.field736 = client.field620;
            }
            client.field737 = (short) field809[Statics.field4593 + 2];
            if (client.field737 <= 0) {
                client.field737 = 1;
            }
            client.field738 = (short) field809[Statics.field4593 + 3];
            if (client.field738 <= 0) {
                client.field738 = 32767;
            } else if (client.field738 < client.field737) {
                client.field738 = client.field737;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field649 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = -1;
            } else {
                client.method4389(0, 0, client.field649.field3241, client.field649.field3242, false);
                field809[++Statics.field4593 - 1] = client.field609;
                field809[++Statics.field4593 - 1] = client.field731;
            }
            return 1;
        } else if (arg0 == 6204) {
            field809[++Statics.field4593 - 1] = client.field733;
            field809[++Statics.field4593 - 1] = client.field734;
            return 1;
        } else if (arg0 == 6205) {
            field809[++Statics.field4593 - 1] = method1875(client.field691);
            field809[++Statics.field4593 - 1] = method1875(client.field708);
            return 1;
        } else if (arg0 == 6220) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field809[++Statics.field4593 - 1] = Statics.field2137;
            return 1;
        } else if (arg0 == 6223) {
            field809[++Statics.field4593 - 1] = Statics.field2535;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.ag(ILbn;ZB)I")
    public static int method1074(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field809[++Statics.field4593 - 1] = class61.method4858() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class61 var3 = class61.method4960();
            if (var3 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
                field809[++Statics.field4593 - 1] = 0;
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
            } else {
                field809[++Statics.field4593 - 1] = var3.field767;
                field809[++Statics.field4593 - 1] = var3.field775;
                field810[++Statics.field78 - 1] = var3.field771;
                field809[++Statics.field4593 - 1] = var3.field772;
                field809[++Statics.field4593 - 1] = var3.field762;
                field810[++Statics.field78 - 1] = var3.field770;
            }
            return 1;
        } else if (arg0 == 6502) {
            class61 var4 = class61.method395();
            if (var4 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
                field809[++Statics.field4593 - 1] = 0;
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
            } else {
                field809[++Statics.field4593 - 1] = var4.field767;
                field809[++Statics.field4593 - 1] = var4.field775;
                field810[++Statics.field78 - 1] = var4.field771;
                field809[++Statics.field4593 - 1] = var4.field772;
                field809[++Statics.field4593 - 1] = var4.field762;
                field810[++Statics.field78 - 1] = var4.field770;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field809[--Statics.field4593];
            class61 var6 = null;
            for (int var7 = 0; var7 < class61.field763; var7++) {
                if (Statics.field4019[var7].field767 == var5) {
                    var6 = Statics.field4019[var7];
                    break;
                }
            }
            if (var6 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
                field809[++Statics.field4593 - 1] = 0;
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
            } else {
                field809[++Statics.field4593 - 1] = var6.field767;
                field809[++Statics.field4593 - 1] = var6.field775;
                field810[++Statics.field78 - 1] = var6.field771;
                field809[++Statics.field4593 - 1] = var6.field772;
                field809[++Statics.field4593 - 1] = var6.field762;
                field810[++Statics.field78 - 1] = var6.field770;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field4593 -= 4;
            int var8 = field809[Statics.field4593];
            boolean var9 = field809[Statics.field4593 + 1] == 1;
            int var10 = field809[Statics.field4593 + 2];
            boolean var11 = field809[Statics.field4593 + 3] == 1;
            class61.method2549(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field809[--Statics.field4593];
            if (var12 >= 0 && var12 < class61.field763) {
                class61 var13 = Statics.field4019[var12];
                field809[++Statics.field4593 - 1] = var13.field767;
                field809[++Statics.field4593 - 1] = var13.field775;
                field810[++Statics.field78 - 1] = var13.field771;
                field809[++Statics.field4593 - 1] = var13.field772;
                field809[++Statics.field4593 - 1] = var13.field762;
                field810[++Statics.field78 - 1] = var13.field770;
            } else {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
                field809[++Statics.field4593 - 1] = 0;
                field809[++Statics.field4593 - 1] = 0;
                field810[++Statics.field78 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field622 = field809[--Statics.field4593] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field4593 -= 2;
            int var14 = field809[Statics.field4593];
            int var15 = field809[Statics.field4593 + 1];
            class177 var16 = class177.method3028(var15);
            if (var16.method3092()) {
                field810[++Statics.field78 - 1] = class171.method4029(var14).method3000(var15, var16.field1915);
            } else {
                field809[++Statics.field4593 - 1] = class171.method4029(var14).method2999(var15, var16.field1919);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field4593 -= 2;
            int var17 = field809[Statics.field4593];
            int var18 = field809[Statics.field4593 + 1];
            class177 var19 = class177.method3028(var18);
            if (var19.method3092()) {
                field810[++Statics.field78 - 1] = class180.method2760(var17).method3188(var18, var19.field1915);
            } else {
                field809[++Statics.field4593 - 1] = class180.method2760(var17).method3214(var18, var19.field1919);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field4593 -= 2;
            int var20 = field809[Statics.field4593];
            int var21 = field809[Statics.field4593 + 1];
            class177 var22 = class177.method3028(var21);
            if (var22.method3092()) {
                field810[++Statics.field78 - 1] = class181.method2432(var20).method3249(var21, var22.field1915);
            } else {
                field809[++Statics.field4593 - 1] = class181.method2432(var20).method3248(var21, var22.field1919);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field4593 -= 2;
            int var23 = field809[Statics.field4593];
            int var24 = field809[Statics.field4593 + 1];
            class177 var25 = class177.method3028(var24);
            if (var25.method3092()) {
                field810[++Statics.field78 - 1] = class178.method293(var23).method3111(var24, var25.field1915);
            } else {
                field809[++Statics.field4593 - 1] = class178.method293(var23).method3110(var24, var25.field1919);
            }
            return 1;
        } else if (arg0 == 6518) {
            field809[++Statics.field4593 - 1] = client.field534 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field809[++Statics.field4593 - 1] = client.field475 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field78--;
            Statics.field4593--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field78--;
            Statics.field4593--;
            return 1;
        } else if (arg0 == 6524) {
            field809[++Statics.field4593 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field809[++Statics.field4593 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field809[++Statics.field4593 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field809[++Statics.field4593 - 1] = client.field500;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.al(ILbn;ZB)I")
    public static int method573(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field110;
            int var4 = (Statics.field4070.field1130 >> 7) + Statics.field1533;
            int var5 = (Statics.field4070.field1090 >> 7) + Statics.field1240;
            client.method4388().method6215(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field809[--Statics.field4593];
            String var7 = "";
            class218 var8 = client.method4388().method6232(var6);
            if (var8 != null) {
                var7 = var8.method4109();
            }
            field810[++Statics.field78 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field809[--Statics.field4593];
            client.method4388().method6311(var9);
            return 1;
        } else if (arg0 == 6603) {
            field809[++Statics.field4593 - 1] = client.method4388().method6230();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field809[--Statics.field4593];
            client.method4388().method6227(var10);
            return 1;
        } else if (arg0 == 6605) {
            field809[++Statics.field4593 - 1] = client.method4388().method6327() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class277 var11 = new class277(field809[--Statics.field4593]);
            client.method4388().method6233(var11.field3188, var11.field3189);
            return 1;
        } else if (arg0 == 6607) {
            class277 var12 = new class277(field809[--Statics.field4593]);
            client.method4388().method6234(var12.field3188, var12.field3189);
            return 1;
        } else if (arg0 == 6608) {
            class277 var13 = new class277(field809[--Statics.field4593]);
            client.method4388().method6235(var13.field3193, var13.field3188, var13.field3189);
            return 1;
        } else if (arg0 == 6609) {
            class277 var14 = new class277(field809[--Statics.field4593]);
            client.method4388().method6236(var14.field3193, var14.field3188, var14.field3189);
            return 1;
        } else if (arg0 == 6610) {
            field809[++Statics.field4593 - 1] = client.method4388().method6237();
            field809[++Statics.field4593 - 1] = client.method4388().method6388();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field809[--Statics.field4593];
            class218 var16 = client.method4388().method6232(var15);
            if (var16 == null) {
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = var16.method4133().method4833();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field809[--Statics.field4593];
            class218 var18 = client.method4388().method6232(var17);
            if (var18 == null) {
                field809[++Statics.field4593 - 1] = 0;
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = (var18.method4092() - var18.method4091() + 1) * 64;
                field809[++Statics.field4593 - 1] = (var18.method4094() - var18.method4138() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field809[--Statics.field4593];
            class218 var20 = client.method4388().method6232(var19);
            if (var20 == null) {
                field809[++Statics.field4593 - 1] = 0;
                field809[++Statics.field4593 - 1] = 0;
                field809[++Statics.field4593 - 1] = 0;
                field809[++Statics.field4593 - 1] = 0;
            } else {
                field809[++Statics.field4593 - 1] = var20.method4091() * 64;
                field809[++Statics.field4593 - 1] = var20.method4138() * 64;
                field809[++Statics.field4593 - 1] = var20.method4092() * 64 + 64 - 1;
                field809[++Statics.field4593 - 1] = var20.method4094() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field809[--Statics.field4593];
            class218 var22 = client.method4388().method6232(var21);
            if (var22 == null) {
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = var22.method4127();
            }
            return 1;
        } else if (arg0 == 6615) {
            class277 var23 = client.method4388().method6209();
            if (var23 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = var23.field3188;
                field809[++Statics.field4593 - 1] = var23.field3189;
            }
            return 1;
        } else if (arg0 == 6616) {
            field809[++Statics.field4593 - 1] = client.method4388().method6217();
            return 1;
        } else if (arg0 == 6617) {
            class277 var24 = new class277(field809[--Statics.field4593]);
            class218 var25 = client.method4388().method6218();
            if (var25 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4086(var24.field3193, var24.field3188, var24.field3189);
            if (var26 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = var26[0];
                field809[++Statics.field4593 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class277 var27 = new class277(field809[--Statics.field4593]);
            class218 var28 = client.method4388().method6218();
            if (var28 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = -1;
                return 1;
            }
            class277 var29 = var28.method4085(var27.field3188, var27.field3189);
            if (var29 == null) {
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = var29.method4833();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field4593 -= 2;
            int var30 = field809[Statics.field4593];
            class277 var31 = new class277(field809[Statics.field4593 + 1]);
            method801(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field4593 -= 2;
            int var32 = field809[Statics.field4593];
            class277 var33 = new class277(field809[Statics.field4593 + 1]);
            method801(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field4593 -= 2;
            int var34 = field809[Statics.field4593];
            class277 var35 = new class277(field809[Statics.field4593 + 1]);
            class218 var36 = client.method4388().method6232(var34);
            if (var36 == null) {
                field809[++Statics.field4593 - 1] = 0;
                return 1;
            } else {
                field809[++Statics.field4593 - 1] = var36.method4104(var35.field3193, var35.field3188, var35.field3189) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field809[++Statics.field4593 - 1] = client.method4388().method6340();
            field809[++Statics.field4593 - 1] = client.method4388().method6241();
            return 1;
        } else if (arg0 == 6623) {
            class277 var37 = new class277(field809[--Statics.field4593]);
            class218 var38 = client.method4388().method6204(var37.field3193, var37.field3188, var37.field3189);
            if (var38 == null) {
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = var38.method4087();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method4388().method6242(field809[--Statics.field4593]);
            return 1;
        } else if (arg0 == 6625) {
            client.method4388().method6243();
            return 1;
        } else if (arg0 == 6626) {
            client.method4388().method6244(field809[--Statics.field4593]);
            return 1;
        } else if (arg0 == 6627) {
            client.method4388().method6208();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field809[--Statics.field4593] == 1;
            client.method4388().method6281(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field809[--Statics.field4593];
            client.method4388().method6394(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field809[--Statics.field4593];
            client.method4388().method6216(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method4388().method6248();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field809[--Statics.field4593] == 1;
            client.method4388().method6249(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field4593 -= 2;
            int var43 = field809[Statics.field4593];
            boolean var44 = field809[Statics.field4593 + 1] == 1;
            client.method4388().method6250(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field4593 -= 2;
            int var45 = field809[Statics.field4593];
            boolean var46 = field809[Statics.field4593 + 1] == 1;
            client.method4388().method6400(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field809[++Statics.field4593 - 1] = client.method4388().method6252() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = client.method4388().method6253(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field809[--Statics.field4593];
            field809[++Statics.field4593 - 1] = client.method4388().method6254(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field4593 -= 2;
            int var49 = field809[Statics.field4593];
            class277 var50 = new class277(field809[Statics.field4593 + 1]);
            class277 var51 = client.method4388().method6333(var49, var50);
            if (var51 == null) {
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = var51.method4833();
            }
            return 1;
        } else if (arg0 == 6639) {
            class236 var52 = client.method4388().method6280();
            if (var52 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = var52.method4040();
                field809[++Statics.field4593 - 1] = var52.field2760.method4833();
            }
            return 1;
        } else if (arg0 == 6640) {
            class236 var53 = client.method4388().method6260();
            if (var53 == null) {
                field809[++Statics.field4593 - 1] = -1;
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = var53.method4040();
                field809[++Statics.field4593 - 1] = var53.field2760.method4833();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field809[--Statics.field4593];
            class164 var55 = class164.method2044(var54);
            if (var55.field1756 == null) {
                field810[++Statics.field78 - 1] = "";
            } else {
                field810[++Statics.field78 - 1] = var55.field1756;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field809[--Statics.field4593];
            class164 var57 = class164.method2044(var56);
            field809[++Statics.field4593 - 1] = var57.field1761;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field809[--Statics.field4593];
            class164 var59 = class164.method2044(var58);
            if (var59 == null) {
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = var59.field1772;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field809[--Statics.field4593];
            class164 var61 = class164.method2044(var60);
            if (var61 == null) {
                field809[++Statics.field4593 - 1] = -1;
            } else {
                field809[++Statics.field4593 - 1] = var61.field1754;
            }
            return 1;
        } else if (arg0 == 6697) {
            field809[++Statics.field4593 - 1] = Statics.field1697.field2778;
            return 1;
        } else if (arg0 == 6698) {
            field809[++Statics.field4593 - 1] = Statics.field1697.field2779.method4833();
            return 1;
        } else if (arg0 == 6699) {
            field809[++Statics.field4593 - 1] = Statics.field1697.field2781.method4833();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hl.aa(ILbn;ZI)I")
    public static int method3999(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6700 || arg0 == 6702 || arg0 == 6704 || arg0 == 6706 || arg0 == 6708) {
            Statics.field4593 -= 2;
            Statics.field78--;
            return 1;
        } else if (arg0 == 6701 || arg0 == 6703 || arg0 == 6705 || arg0 == 6707 || arg0 == 6709) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 6750) {
            field810[++Statics.field78 - 1] = "";
            return 1;
        } else if (arg0 == 6751 || arg0 == 6752 || arg0 == 6753) {
            field809[++Statics.field4593 - 1] = -1;
            return 1;
        } else if (arg0 == 6754) {
            int var3 = field809[--Statics.field4593];
            class171 var4 = class171.method4029(var3);
            field810[++Statics.field78 - 1] = var4 == null ? "" : var4.field1845;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.as(ILbn;ZB)I")
    public static int method1581(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6800) {
            field810[++Statics.field78 - 1] = "";
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            field809[++Statics.field4593 - 1] = -1;
            return 1;
        } else if (arg0 == 6850) {
            field810[++Statics.field78 - 1] = "";
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            field809[++Statics.field4593 - 1] = -1;
            return 1;
        } else if (arg0 == 6853) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lw.at(ILbn;ZI)I")
    public static int method5262(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6900) {
            field810[++Statics.field78 - 1] = "";
            return 1;
        } else if (arg0 == 6950) {
            field809[++Statics.field4593 - 1] = -1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("t.ai(ILbn;ZI)I")
    public static int method24(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field4593 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field4593 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field4593 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field4593 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field78--;
            Statics.field4593--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field78--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field4593 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field4593--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hh.aq(ILbn;ZB)I")
    public static int method4017(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field4593++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field78 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field4593++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field4593++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field4593++;
            return 1;
        } else if (arg0 == 7108) {
            field809[++Statics.field4593 - 1] = client.method196() ? 1 : 0;
            return 1;
        } else if (arg0 == 7110) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 7120) {
            Statics.field4593--;
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 7121) {
            Statics.field4593 -= 2;
            field809[++Statics.field4593 - 1] = -1;
            return 1;
        } else if (arg0 == 7122) {
            Statics.field4593 -= 2;
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bf.aw(ILbn;ZI)I")
    public static int method2023(int arg0, class72 arg1, boolean arg2) {
        if (arg0 >= 7200 && arg0 < 7204) {
            Statics.field4593 -= 5;
            field809[++Statics.field4593 - 1] = -1;
            return 1;
        } else if (arg0 == 7204) {
            Statics.field4593 -= 6;
            field809[++Statics.field4593 - 1] = -1;
            return 1;
        } else if (arg0 >= 7205 && arg0 < 7209) {
            field809[Statics.field4593 - 1] = -1;
            return 1;
        } else if (arg0 == 7209) {
            Statics.field4593 -= 2;
            field809[++Statics.field4593 - 1] = -1;
            return 1;
        } else if (arg0 >= 7210 && arg0 < 7214) {
            Statics.field4593--;
            return 1;
        } else if (arg0 == 7214) {
            Statics.field4593 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fh.ay(ILbn;ZI)I")
    public static int method2938(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7400) {
            Statics.field4593--;
            Statics.field78--;
            return 1;
        } else if (arg0 == 7401) {
            Statics.field4593--;
            Statics.field78--;
            return 1;
        } else if (arg0 == 7402) {
            Statics.field4593 -= 2;
            Statics.field78--;
            return 1;
        } else if (arg0 == 7403) {
            Statics.field4593 -= 2;
            Statics.field78--;
            return 1;
        } else if (arg0 == 7404) {
            Statics.field4593--;
            Statics.field78--;
            return 1;
        } else if (arg0 == 7405) {
            Statics.field4593 -= 2;
            return 1;
        } else if (arg0 == 7406) {
            Statics.field4593--;
            field810[++Statics.field78 - 1] = "";
            return 1;
        } else if (arg0 == 7407) {
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 7408) {
            Statics.field4593 -= 2;
            Statics.field78--;
            field809[++Statics.field4593 - 1] = 0;
            return 1;
        } else if (arg0 == 7409) {
            Statics.field4593--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.ae(II)V")
    public static void method651(int arg0) {
        if (arg0 == -1 || !class281.method4482(arg0)) {
            return;
        }
        class281[] var1 = Statics.field1043[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class281 var3 = var1[var2];
            if (var3.field3313 != null) {
                class81 var4 = new class81();
                var4.field1017 = var3;
                var4.field1031 = var3.field3313;
                method1044(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("aa.ak(ILju;ZB)V")
    public static void method801(int arg0, class277 arg1, boolean arg2) {
        class218 var3 = client.method4388().method6232(arg0);
        int var4 = Statics.field4070.field1068;
        int var5 = (Statics.field4070.field1130 >> 7) + Statics.field1533;
        int var6 = (Statics.field4070.field1090 >> 7) + Statics.field1240;
        class277 var7 = new class277(var4, var5, var6);
        client.method4388().method6221(var3, var7, arg1, arg2);
    }
}
