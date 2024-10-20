package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("bt")
public class class64 {

    @ObfuscatedName("bt.e")
    public static int[] field832 = new int[5];

    @ObfuscatedName("bt.g")
    public static int[][] field848 = new int[5][5000];

    @ObfuscatedName("bt.w")
    public static int[] field834 = new int[1000];

    @ObfuscatedName("bt.i")
    public static String[] field833 = new String[1000];

    @ObfuscatedName("bt.t")
    public static int field835 = 0;

    @ObfuscatedName("bt.z")
    public static class57[] field838 = new class57[50];

    @ObfuscatedName("bt.l")
    public static Calendar field840 = Calendar.getInstance();

    @ObfuscatedName("bt.a")
    public static final String[] field842 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bt.b")
    public static boolean field830 = false;

    @ObfuscatedName("bt.n")
    public static boolean field843 = false;

    @ObfuscatedName("bt.o")
    public static ArrayList field844 = new ArrayList();

    @ObfuscatedName("bt.m")
    public static int field851 = 0;

    @ObfuscatedName("bt.al")
    public static final double field846 = Math.log(2.0D);

    public class64() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hi.c(Lcw;B)V")
    public static void method4199(class81 arg0) {
        method2727(arg0, 500000, 475000);
    }

    @ObfuscatedName("ea.v(Lcw;III)V")
    public static void method2727(class81 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1056;
        class72 var5;
        if (class441.method3012(arg0.field1055)) {
            Statics.field119 = (class248) var3[0];
            class171 var4 = class171.method6889(Statics.field119.field2882);
            var5 = class72.method2863(arg0.field1055, var4.field1849, var4.field1850);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class72.method5510(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field4758 = 0;
        Statics.field836 = 0;
        int var7 = -1;
        int[] var8 = var5.field967;
        int[] var9 = var5.field969;
        byte var10 = -1;
        field835 = 0;
        field830 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field831 = new int[var5.field971];
            int var13 = 0;
            Statics.field4079 = new String[var5.field972];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1046;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1050;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1048 == null ? -1 : arg0.field1048.field3369;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1053;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1048 == null ? -1 : arg0.field1048.field3491;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1052 == null ? -1 : arg0.field1052.field3369;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1052 == null ? -1 : arg0.field1052.field3491;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1049;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1054;
                    }
                    Statics.field831[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1051;
                    }
                    Statics.field4079[var14++] = var17;
                }
            }
            field851 = arg0.field1057;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field969[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method6031(var61, var5, var48);
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
                    field834[++Statics.field4758 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field834[++Statics.field4758 - 1] = class288.field3326[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class288.field3326[var19] = field834[--Statics.field4758];
                    client.method5227(var19);
                } else if (var61 == 3) {
                    field833[++Statics.field836 - 1] = var5.field970[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field4758 -= 2;
                    if (field834[Statics.field4758] != field834[Statics.field4758 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field4758 -= 2;
                    if (field834[Statics.field4758] == field834[Statics.field4758 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field4758 -= 2;
                    if (field834[Statics.field4758] < field834[Statics.field4758 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field4758 -= 2;
                    if (field834[Statics.field4758] > field834[Statics.field4758 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field835 == 0) {
                        return;
                    }
                    class57 var21 = field838[--field835];
                    var5 = var21.field446;
                    var8 = var5.field967;
                    var9 = var5.field969;
                    var7 = var21.field450;
                    Statics.field831 = var21.field445;
                    Statics.field4079 = var21.field447;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field834[++Statics.field4758 - 1] = class288.method6395(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class288.method4715(var23, field834[--Statics.field4758]);
                } else if (var61 == 31) {
                    Statics.field4758 -= 2;
                    if (field834[Statics.field4758] <= field834[Statics.field4758 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field4758 -= 2;
                    if (field834[Statics.field4758] >= field834[Statics.field4758 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field834[++Statics.field4758 - 1] = Statics.field831[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field831[var9[var7]] = field834[--Statics.field4758];
                } else if (var61 == 35) {
                    field833[++Statics.field836 - 1] = Statics.field4079[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field4079[var9[var7]] = field833[--Statics.field836];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field836 -= var24;
                    String var25 = class343.method6087(field833, Statics.field836, var24);
                    field833[++Statics.field836 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field4758--;
                } else if (var61 == 39) {
                    Statics.field836--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class72 var27 = class72.method5510(var26);
                    int[] var28 = new int[var27.field971];
                    String[] var29 = new String[var27.field972];
                    for (int var30 = 0; var30 < var27.field973; var30++) {
                        var28[var30] = field834[Statics.field4758 - var27.field973 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field974; var31++) {
                        var29[var31] = field833[Statics.field836 - var27.field974 + var31];
                    }
                    Statics.field4758 -= var27.field973;
                    Statics.field836 -= var27.field974;
                    class57 var32 = new class57();
                    var32.field446 = var5;
                    var32.field450 = var7;
                    var32.field445 = Statics.field831;
                    var32.field447 = Statics.field4079;
                    field838[++field835 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field967;
                    var9 = var27.field969;
                    var7 = -1;
                    Statics.field831 = var28;
                    Statics.field4079 = var29;
                } else if (var61 == 42) {
                    field834[++Statics.field4758 - 1] = Statics.field3944.method2348(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field3944.method2313(var9[var7], field834[--Statics.field4758]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field834[--Statics.field4758];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field832[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field848[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field834[--Statics.field4758];
                    if (var39 < 0 || var39 >= field832[var38]) {
                        throw new RuntimeException();
                    }
                    field834[++Statics.field4758 - 1] = field848[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field4758 -= 2;
                    int var41 = field834[Statics.field4758];
                    if (var41 < 0 || var41 >= field832[var40]) {
                        throw new RuntimeException();
                    }
                    field848[var40][var41] = field834[Statics.field4758 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field3944.method2318(var9[var7]);
                    if (var42 == null) {
                        var42 = class308.field3624;
                    }
                    field833[++Statics.field836 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field3944.method2317(var9[var7], field833[--Statics.field836]);
                } else if (var61 == 49) {
                    String var43 = Statics.field3944.method2334(var9[var7]);
                    field833[++Statics.field836 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field3944.method2341(var9[var7], field833[--Statics.field836]);
                } else if (var61 == 60) {
                    class419 var44 = var5.field975[var9[var7]];
                    class409 var45 = (class409) var44.method6756((long) field834[--Statics.field4758]);
                    if (var45 != null) {
                        var7 += var45.field4461;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field2843.method2743(var9[var7]);
                    if (var46 == null) {
                        field834[++Statics.field4758 - 1] = -1;
                    } else {
                        field834[++Statics.field4758 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field4585.method6424(var9[var7]);
                    if (var47 == null) {
                        field834[++Statics.field4758 - 1] = -1;
                    } else {
                        field834[++Statics.field4758 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4462).append(" ");
            for (int var53 = field835 - 1; var53 >= 0; var53--) {
                var52.append("").append(field838[var53].field446.field4462).append(" ");
            }
            var52.append("").append(var10);
            class467.method4655(var52.toString(), var59);
        } finally {
            while (field844.size() > 0) {
                class94 var56 = (class94) field844.remove(0);
                client.method4049(var56.method2276(), var56.method2277(), var56.method2285(), var56.method2278(), "");
            }
            if (field830) {
                field830 = false;
                client.method4020();
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class467.method4655("Warning: Script " + var5.field968 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("nr.q(ILbi;ZB)I")
    public static int method6031(int arg0, class72 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method2986(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2076(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2354(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method3292(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method1908(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method4178(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method2681(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method8(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method4203(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method3492(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method571(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2076(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2354(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method3292(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method1908(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method4178(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method4579(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method1895(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method5935(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method4588(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method571(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method2557(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method949(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method2480(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method2707(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method2002(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method2964(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method1978(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method1093(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method4543(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method5505(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method2467(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method2503(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2611(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method3092(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method2613(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method259(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method6393(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3249(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method6156(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method150(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method3005(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method3009(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method4994(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method91(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method4541(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method4006(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method542(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method2465(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fz.f(ILbi;ZI)I")
    public static int method2986(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field4758 -= 3;
            int var3 = field834[Statics.field4758];
            int var4 = field834[Statics.field4758 + 1];
            int var5 = field834[Statics.field4758 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class294 var6 = class294.method2818(var3);
            if (var6.field3433 == null) {
                var6.field3433 = new class294[var5 + 1];
            }
            if (var6.field3433.length <= var5) {
                class294[] var7 = new class294[var5 + 1];
                for (int var8 = 0; var8 < var6.field3433.length; var8++) {
                    var7[var8] = var6.field3433[var8];
                }
                var6.field3433 = var7;
            }
            if (var5 > 0 && var6.field3433[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class294 var9 = new class294();
            var9.field3371 = var4;
            var9.field3423 = var9.field3369 = var6.field3369;
            var9.field3491 = var5;
            var9.field3485 = true;
            var6.field3433[var5] = var9;
            if (arg2) {
                Statics.field1552 = var9;
            } else {
                Statics.field471 = var9;
            }
            client.method1899(var6);
            return 1;
        } else if (arg0 == 101) {
            class294 var10 = arg2 ? Statics.field1552 : Statics.field471;
            class294 var11 = class294.method2818(var10.field3369);
            var11.field3433[var10.field3491] = null;
            client.method1899(var11);
            return 1;
        } else if (arg0 == 102) {
            class294 var12 = class294.method2818(field834[--Statics.field4758]);
            var12.field3433 = null;
            client.method1899(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field4758 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field4758 -= 2;
            int var13 = field834[Statics.field4758];
            int var14 = field834[Statics.field4758 + 1];
            class294 var15 = class294.method981(var13, var14);
            if (var15 == null || var14 == -1) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = 1;
                if (arg2) {
                    Statics.field1552 = var15;
                } else {
                    Statics.field471 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class294 var16 = class294.method2818(field834[--Statics.field4758]);
            if (var16 == null) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = 1;
                if (arg2) {
                    Statics.field1552 = var16;
                } else {
                    Statics.field471 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field834[Statics.field4758 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field834[--Statics.field4758 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cg.j(ILbi;ZI)I")
    public static int method2076(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class294 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field834[--Statics.field4758];
            var4 = class294.method2818(var3);
        } else {
            var4 = arg2 ? Statics.field1552 : Statics.field471;
        }
        if (arg0 == 1000) {
            Statics.field4758 -= 4;
            var4.field3389 = field834[Statics.field4758];
            var4.field3516 = field834[Statics.field4758 + 1];
            var4.field3507 = field834[Statics.field4758 + 2];
            var4.field3375 = field834[Statics.field4758 + 3];
            client.method1899(var4);
            Statics.field4220.method1049(var4);
            if (var3 != -1 && var4.field3371 == 0) {
                client.method6223(Statics.field324[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field4758 -= 4;
            var4.field3395 = field834[Statics.field4758];
            var4.field3448 = field834[Statics.field4758 + 1];
            var4.field3376 = field834[Statics.field4758 + 2];
            var4.field3377 = field834[Statics.field4758 + 3];
            client.method1899(var4);
            Statics.field4220.method1049(var4);
            if (var3 != -1 && var4.field3371 == 0) {
                client.method6223(Statics.field324[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field834[--Statics.field4758] == 1;
            if (var4.field3446 != var5) {
                var4.field3446 = var5;
                client.method1899(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3519 = field834[--Statics.field4758] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3520 = field834[--Statics.field4758] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.e(ILbi;ZB)I")
    public static int method2354(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class294 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field834[--Statics.field4758];
            var4 = class294.method2818(var3);
        } else {
            var4 = arg2 ? Statics.field1552 : Statics.field471;
        }
        if (arg0 == 1100) {
            Statics.field4758 -= 2;
            var4.field3511 = field834[Statics.field4758];
            if (var4.field3511 > var4.field3392 - var4.field3384) {
                var4.field3511 = var4.field3392 - var4.field3384;
            }
            if (var4.field3511 < 0) {
                var4.field3511 = 0;
            }
            var4.field3391 = field834[Statics.field4758 + 1];
            if (var4.field3391 > var4.field3393 - var4.field3385) {
                var4.field3391 = var4.field3393 - var4.field3385;
            }
            if (var4.field3391 < 0) {
                var4.field3391 = 0;
            }
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field3442 = field834[--Statics.field4758];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3426 = field834[--Statics.field4758] == 1;
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3424 = field834[--Statics.field4758];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3441 = field834[--Statics.field4758];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3379 = field834[--Statics.field4758];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3394 = field834[--Statics.field4758];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3408 = field834[--Statics.field4758] == 1;
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3436 = 1;
            var4.field3414 = field834[--Statics.field4758];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field4758 -= 6;
            var4.field3419 = field834[Statics.field4758];
            var4.field3420 = field834[Statics.field4758 + 1];
            var4.field3421 = field834[Statics.field4758 + 2];
            var4.field3422 = field834[Statics.field4758 + 3];
            var4.field3512 = field834[Statics.field4758 + 4];
            var4.field3483 = field834[Statics.field4758 + 5];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field834[--Statics.field4758];
            if (var4.field3417 != var5) {
                var4.field3417 = var5;
                var4.field3390 = 0;
                var4.field3401 = 0;
                client.method1899(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3413 = field834[--Statics.field4758] == 1;
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field833[--Statics.field836];
            if (!var6.equals(var4.field3508)) {
                var4.field3508 = var6;
                client.method1899(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3504 = field834[--Statics.field4758];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field4758 -= 3;
            var4.field3434 = field834[Statics.field4758];
            var4.field3469 = field834[Statics.field4758 + 1];
            var4.field3437 = field834[Statics.field4758 + 2];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3487 = field834[--Statics.field4758] == 1;
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3409 = field834[--Statics.field4758];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3410 = field834[--Statics.field4758];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3411 = field834[--Statics.field4758] == 1;
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3398 = field834[--Statics.field4758] == 1;
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field4758 -= 2;
            var4.field3392 = field834[Statics.field4758];
            var4.field3393 = field834[Statics.field4758 + 1];
            client.method1899(var4);
            if (var3 != -1 && var4.field3371 == 0) {
                client.method6223(Statics.field324[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method5989(var4.field3369, var4.field3491);
            client.field661 = var4;
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3405 = field834[--Statics.field4758];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3500 = field834[--Statics.field4758];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3488 = field834[--Statics.field4758];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field834[--Statics.field4758];
            class454 var8 = (class454) class329.method2087(class454.method5223(), var7);
            if (var8 != null) {
                var4.field3399 = var8;
                client.method1899(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field834[--Statics.field4758] == 1;
            var4.field3403 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field834[--Statics.field4758] == 1;
            var4.field3388 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field4758 -= 2;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3406 = field833[--Statics.field836];
            client.method1899(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method5089(field833[--Statics.field836], Statics.field1622, client.method4200());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field4758 -= 2;
            var4.method5091(field834[Statics.field4758], field834[Statics.field4758 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method5092(field833[--Statics.field836], field834[--Statics.field4758]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gi.g(ILbi;ZS)I")
    public static int method3292(int arg0, class72 arg1, boolean arg2) {
        class294 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class294.method2818(field834[--Statics.field4758]);
        } else {
            var3 = arg2 ? Statics.field1552 : Statics.field471;
        }
        client.method1899(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field4758 -= 2;
            int var4 = field834[Statics.field4758];
            int var5 = field834[Statics.field4758 + 1];
            var3.field3505 = var4;
            var3.field3509 = var5;
            class188 var6 = class188.method3161(var4);
            var3.field3421 = var6.field2109;
            var3.field3422 = var6.field2110;
            var3.field3512 = var6.field2111;
            var3.field3419 = var6.field2112;
            var3.field3420 = var6.field2113;
            var3.field3483 = var6.field2108;
            if (arg0 == 1205) {
                var3.field3429 = 0;
            } else if (arg0 == 1212 | var6.field2114 == 1) {
                var3.field3429 = 1;
            } else {
                var3.field3429 = 2;
            }
            if (var3.field3425 > 0) {
                var3.field3483 = var3.field3483 * 32 / var3.field3425;
            } else if (var3.field3395 > 0) {
                var3.field3483 = var3.field3483 * 32 / var3.field3395;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3436 = 2;
            var3.field3414 = field834[--Statics.field4758];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3436 = 3;
            var3.field3414 = Statics.field1366.field1087.method5045();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.w(ILbi;ZS)I")
    public static int method1908(int arg0, class72 arg1, boolean arg2) {
        boolean var3 = true;
        class294 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class294.method2818(field834[--Statics.field4758]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field1552 : Statics.field471;
        }
        if (arg0 == 1300) {
            int var5 = field834[--Statics.field4758] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method5087(var5, field833[--Statics.field836]);
                return 1;
            } else {
                Statics.field836--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field4758 -= 2;
            int var6 = field834[Statics.field4758];
            int var7 = field834[Statics.field4758 + 1];
            var4.field3455 = class294.method981(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3428 = field834[--Statics.field4758] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3450 = field834[--Statics.field4758];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3457 = field834[--Statics.field4758];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3380 = field833[--Statics.field836];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3459 = field833[--Statics.field836];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3454 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3521 = field834[--Statics.field4758] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field4758 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field834[Statics.field4758 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field834[Statics.field4758 + var10];
                        var9[var10 / 2] = (byte) field834[Statics.field4758 + var10 + 1];
                    }
                }
            } else {
                Statics.field4758 -= 2;
                var8 = new byte[] { (byte) field834[Statics.field4758] };
                var9 = new byte[] { (byte) field834[Statics.field4758 + 1] };
            }
            int var11 = field834[--Statics.field4758] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method5694(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field4758 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field834[Statics.field4758] };
            byte[] var14 = new byte[] { (byte) field834[Statics.field4758 + 1] };
            method5694(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field4758 -= 3;
            int var15 = field834[Statics.field4758] - 1;
            int var16 = field834[Statics.field4758 + 1];
            int var17 = field834[Statics.field4758 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method5773(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field834[--Statics.field4758];
            int var20 = field834[--Statics.field4758];
            method5773(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field4758--;
            int var21 = field834[Statics.field4758] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method2832(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method2832(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mb.y(Lkb;I[B[BB)V")
    public static final void method5694(class294 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3449 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3449 = new byte[11][];
            arg0.field3407 = new byte[11][];
            arg0.field3451 = new int[11];
            arg0.field3452 = new int[11];
        }
        arg0.field3449[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3499 = false;
            for (int var4 = 0; var4 < arg0.field3449.length; var4++) {
                if (arg0.field3449[var4] != null) {
                    arg0.field3499 = true;
                    break;
                }
            }
        } else {
            arg0.field3499 = true;
        }
        arg0.field3407[arg1] = arg3;
    }

    @ObfuscatedName("me.i(Lkb;IIIS)V")
    public static final void method5773(class294 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3451 == null) {
            throw new RuntimeException();
        }
        arg0.field3451[arg1] = arg2;
        arg0.field3452[arg1] = arg3;
    }

    @ObfuscatedName("eu.s(Lkb;II)V")
    public static final void method2832(class294 arg0, int arg1) {
        if (arg0.field3449 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3518 == null) {
            arg0.field3518 = new int[arg0.field3449.length];
        }
        arg0.field3518[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("he.t(ILbi;ZI)I")
    public static int method4178(int arg0, class72 arg1, boolean arg2) {
        class294 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class294.method2818(field834[--Statics.field4758]);
        } else {
            var3 = arg2 ? Statics.field1552 : Statics.field471;
        }
        String var4 = field833[--Statics.field836];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field834[--Statics.field4758];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field834[--Statics.field4758];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field833[--Statics.field836];
            } else {
                var7[var8] = Integer.valueOf(field834[--Statics.field4758]);
            }
        }
        int var9 = field834[--Statics.field4758];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3462 = var7;
        } else if (arg0 == 1401) {
            var3.field3465 = var7;
        } else if (arg0 == 1402) {
            var3.field3464 = var7;
        } else if (arg0 == 1403) {
            var3.field3466 = var7;
        } else if (arg0 == 1404) {
            var3.field3468 = var7;
        } else if (arg0 == 1405) {
            var3.field3431 = var7;
        } else if (arg0 == 1406) {
            var3.field3489 = var7;
        } else if (arg0 == 1407) {
            var3.field3473 = var7;
            var3.field3474 = var5;
        } else if (arg0 == 1408) {
            var3.field3460 = var7;
        } else if (arg0 == 1409) {
            var3.field3480 = var7;
        } else if (arg0 == 1410) {
            var3.field3470 = var7;
        } else if (arg0 == 1411) {
            var3.field3463 = var7;
        } else if (arg0 == 1412) {
            var3.field3467 = var7;
        } else if (arg0 == 1414) {
            var3.field3475 = var7;
            var3.field3476 = var5;
        } else if (arg0 == 1415) {
            var3.field3412 = var7;
            var3.field3478 = var5;
        } else if (arg0 == 1416) {
            var3.field3492 = var7;
        } else if (arg0 == 1417) {
            var3.field3481 = var7;
        } else if (arg0 == 1418) {
            var3.field3482 = var7;
        } else if (arg0 == 1419) {
            var3.field3453 = var7;
        } else if (arg0 == 1420) {
            var3.field3486 = var7;
        } else if (arg0 == 1421) {
            var3.field3378 = var7;
        } else if (arg0 == 1422) {
            var3.field3490 = var7;
        } else if (arg0 == 1423) {
            var3.field3472 = var7;
        } else if (arg0 == 1424) {
            var3.field3430 = var7;
        } else if (arg0 == 1425) {
            var3.field3494 = var7;
        } else if (arg0 == 1426) {
            var3.field3495 = var7;
        } else if (arg0 == 1427) {
            var3.field3493 = var7;
        } else if (arg0 == 1428) {
            var3.field3366 = var7;
        } else if (arg0 == 1429) {
            var3.field3354 = var7;
        } else if (arg0 == 1430) {
            var3.field3517 = var7;
        } else if (arg0 == 1431) {
            var3.field3514 = var7;
        } else if (arg0 == 1434) {
            var3.field3496 = var7;
        } else {
            return 2;
        }
        var3.field3402 = true;
        return 1;
    }

    @ObfuscatedName("dk.z(ILbi;ZB)I")
    public static int method2681(int arg0, class72 arg1, boolean arg2) {
        class294 var3 = arg2 ? Statics.field1552 : Statics.field471;
        if (arg0 == 1500) {
            field834[++Statics.field4758 - 1] = var3.field3382;
            return 1;
        } else if (arg0 == 1501) {
            field834[++Statics.field4758 - 1] = var3.field3383;
            return 1;
        } else if (arg0 == 1502) {
            field834[++Statics.field4758 - 1] = var3.field3384;
            return 1;
        } else if (arg0 == 1503) {
            field834[++Statics.field4758 - 1] = var3.field3385;
            return 1;
        } else if (arg0 == 1504) {
            field834[++Statics.field4758 - 1] = var3.field3446 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field834[++Statics.field4758 - 1] = var3.field3423;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("v.r(ILbi;ZS)I")
    public static int method8(int arg0, class72 arg1, boolean arg2) {
        class294 var3 = arg2 ? Statics.field1552 : Statics.field471;
        if (arg0 == 1600) {
            field834[++Statics.field4758 - 1] = var3.field3511;
            return 1;
        } else if (arg0 == 1601) {
            field834[++Statics.field4758 - 1] = var3.field3391;
            return 1;
        } else if (arg0 == 1602) {
            field833[++Statics.field836 - 1] = var3.field3508;
            return 1;
        } else if (arg0 == 1603) {
            field834[++Statics.field4758 - 1] = var3.field3392;
            return 1;
        } else if (arg0 == 1604) {
            field834[++Statics.field4758 - 1] = var3.field3393;
            return 1;
        } else if (arg0 == 1605) {
            field834[++Statics.field4758 - 1] = var3.field3483;
            return 1;
        } else if (arg0 == 1606) {
            field834[++Statics.field4758 - 1] = var3.field3421;
            return 1;
        } else if (arg0 == 1607) {
            field834[++Statics.field4758 - 1] = var3.field3512;
            return 1;
        } else if (arg0 == 1608) {
            field834[++Statics.field4758 - 1] = var3.field3422;
            return 1;
        } else if (arg0 == 1609) {
            field834[++Statics.field4758 - 1] = var3.field3424;
            return 1;
        } else if (arg0 == 1610) {
            field834[++Statics.field4758 - 1] = var3.field3488;
            return 1;
        } else if (arg0 == 1611) {
            field834[++Statics.field4758 - 1] = var3.field3442;
            return 1;
        } else if (arg0 == 1612) {
            field834[++Statics.field4758 - 1] = var3.field3500;
            return 1;
        } else if (arg0 == 1613) {
            field834[++Statics.field4758 - 1] = var3.field3399.method33();
            return 1;
        } else if (arg0 == 1614) {
            field834[++Statics.field4758 - 1] = var3.field3388 ? 1 : 0;
            return 1;
        } else if (arg0 == 1615 || arg0 == 1616) {
            Statics.field4758++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hb.u(ILbi;ZI)I")
    public static int method4203(int arg0, class72 arg1, boolean arg2) {
        class294 var3 = arg2 ? Statics.field1552 : Statics.field471;
        if (arg0 == 1700) {
            field834[++Statics.field4758 - 1] = var3.field3505;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3505 == -1) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = var3.field3509;
            }
            return 1;
        } else if (arg0 == 1702) {
            field834[++Statics.field4758 - 1] = var3.field3491;
            return 1;
        } else if (arg0 == 1707) {
            field834[++Statics.field4758 - 1] = var3.method5150() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method358(var3);
        } else if (arg0 == 1709) {
            return method4540(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ao.k(Lkb;I)I")
    public static int method358(class294 arg0) {
        if (arg0.field3371 == 11) {
            String var1 = field833[--Statics.field836];
            field834[++Statics.field4758 - 1] = arg0.method5095(var1);
            return 1;
        } else {
            Statics.field836--;
            field834[++Statics.field4758 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("hc.h(Lkb;I)I")
    public static int method4540(class294 arg0) {
        if (arg0.field3371 == 11) {
            String var1 = field833[--Statics.field836];
            field833[++Statics.field836 - 1] = arg0.method5096(var1);
            return 1;
        } else {
            field833[Statics.field836 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("gp.x(ILbi;ZB)I")
    public static int method3492(int arg0, class72 arg1, boolean arg2) {
        class294 var3 = arg2 ? Statics.field1552 : Statics.field471;
        if (arg0 == 1800) {
            field834[++Statics.field4758 - 1] = class295.method4589(client.method2679(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field834[--Statics.field4758];
            int var5 = var4 - 1;
            if (var3.field3454 == null || var5 >= var3.field3454.length || var3.field3454[var5] == null) {
                field833[++Statics.field836 - 1] = "";
            } else {
                field833[++Statics.field836 - 1] = var3.field3454[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3380 == null) {
                field833[++Statics.field836 - 1] = "";
            } else {
                field833[++Statics.field836 - 1] = var3.field3380;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aj.l(ILbi;ZI)I")
    public static int method571(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field851 >= 10) {
                throw new RuntimeException();
            }
            class294 var10;
            if (arg0 >= 2000) {
                var10 = class294.method2818(field834[--Statics.field4758]);
            } else {
                var10 = arg2 ? Statics.field1552 : Statics.field471;
            }
            if (var10.field3493 == null) {
                return 0;
            }
            class81 var11 = new class81();
            var11.field1048 = var10;
            var11.field1056 = var10.field3493;
            var11.field1057 = field851 + 1;
            client.field698.method5530(var11);
            return 1;
        } else if (arg0 == 1928) {
            class294 var3 = arg2 ? Statics.field1552 : Statics.field471;
            int var4 = field834[--Statics.field4758];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class94 var5 = new class94(var4, var3.field3369, var3.field3491, var3.field3505);
            field844.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field4758 -= 3;
            int var6 = field834[Statics.field4758];
            int var7 = field834[Statics.field4758 + 1];
            int var8 = field834[Statics.field4758 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class94 var9 = new class94(var8, var6, var7, class294.method2818(var6).field3505);
            field844.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ix.a(ILbi;ZI)I")
    public static int method4579(int arg0, class72 arg1, boolean arg2) {
        class294 var3 = class294.method2818(field834[--Statics.field4758]);
        if (arg0 == 2500) {
            field834[++Statics.field4758 - 1] = var3.field3382;
            return 1;
        } else if (arg0 == 2501) {
            field834[++Statics.field4758 - 1] = var3.field3383;
            return 1;
        } else if (arg0 == 2502) {
            field834[++Statics.field4758 - 1] = var3.field3384;
            return 1;
        } else if (arg0 == 2503) {
            field834[++Statics.field4758 - 1] = var3.field3385;
            return 1;
        } else if (arg0 == 2504) {
            field834[++Statics.field4758 - 1] = var3.field3446 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field834[++Statics.field4758 - 1] = var3.field3423;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.p(ILbi;ZI)I")
    public static int method1895(int arg0, class72 arg1, boolean arg2) {
        class294 var3 = class294.method2818(field834[--Statics.field4758]);
        if (arg0 == 2600) {
            field834[++Statics.field4758 - 1] = var3.field3511;
            return 1;
        } else if (arg0 == 2601) {
            field834[++Statics.field4758 - 1] = var3.field3391;
            return 1;
        } else if (arg0 == 2602) {
            field833[++Statics.field836 - 1] = var3.field3508;
            return 1;
        } else if (arg0 == 2603) {
            field834[++Statics.field4758 - 1] = var3.field3392;
            return 1;
        } else if (arg0 == 2604) {
            field834[++Statics.field4758 - 1] = var3.field3393;
            return 1;
        } else if (arg0 == 2605) {
            field834[++Statics.field4758 - 1] = var3.field3483;
            return 1;
        } else if (arg0 == 2606) {
            field834[++Statics.field4758 - 1] = var3.field3421;
            return 1;
        } else if (arg0 == 2607) {
            field834[++Statics.field4758 - 1] = var3.field3512;
            return 1;
        } else if (arg0 == 2608) {
            field834[++Statics.field4758 - 1] = var3.field3422;
            return 1;
        } else if (arg0 == 2609) {
            field834[++Statics.field4758 - 1] = var3.field3424;
            return 1;
        } else if (arg0 == 2610) {
            field834[++Statics.field4758 - 1] = var3.field3488;
            return 1;
        } else if (arg0 == 2611) {
            field834[++Statics.field4758 - 1] = var3.field3442;
            return 1;
        } else if (arg0 == 2612) {
            field834[++Statics.field4758 - 1] = var3.field3500;
            return 1;
        } else if (arg0 == 2613) {
            field834[++Statics.field4758 - 1] = var3.field3399.method33();
            return 1;
        } else if (arg0 == 2614) {
            field834[++Statics.field4758 - 1] = var3.field3388 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field4758++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mc.b(ILbi;ZI)I")
    public static int method5935(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class294 var3 = class294.method2818(field834[--Statics.field4758]);
            field834[++Statics.field4758 - 1] = var3.field3505;
            return 1;
        } else if (arg0 == 2701) {
            class294 var4 = class294.method2818(field834[--Statics.field4758]);
            if (var4.field3505 == -1) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = var4.field3509;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field834[--Statics.field4758];
            class80 var6 = (class80) client.field656.method6765((long) var5);
            if (var6 == null) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field834[++Statics.field4758 - 1] = client.field655;
            return 1;
        } else if (arg0 == 2707) {
            class294 var7 = class294.method2818(field834[--Statics.field4758]);
            field834[++Statics.field4758 - 1] = var7.method5150() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class294 var8 = class294.method2818(field834[--Statics.field4758]);
            return method358(var8);
        } else if (arg0 == 2709) {
            class294 var9 = class294.method2818(field834[--Statics.field4758]);
            return method4540(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ie.n(ILbi;ZB)I")
    public static int method4588(int arg0, class72 arg1, boolean arg2) {
        class294 var3 = class294.method2818(field834[--Statics.field4758]);
        if (arg0 == 2800) {
            field834[++Statics.field4758 - 1] = class295.method4589(client.method2679(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field834[--Statics.field4758];
            int var5 = var4 - 1;
            if (var3.field3454 == null || var5 >= var3.field3454.length || var3.field3454[var5] == null) {
                field833[++Statics.field836 - 1] = "";
            } else {
                field833[++Statics.field836 - 1] = var3.field3454[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3380 == null) {
                field833[++Statics.field836 - 1] = "";
            } else {
                field833[++Statics.field836 - 1] = var3.field3380;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dc.o(ILbi;ZI)I")
    public static int method2557(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field833[--Statics.field836];
            class99.method5035(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field4758 -= 2;
            client.method1789(Statics.field1366, field834[Statics.field4758], field834[Statics.field4758 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field843) {
                field830 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field833[--Statics.field836];
            int var5 = 0;
            if (class343.method2524(var4)) {
                var5 = class343.method4010(var4);
            }
            class264 var6 = class264.method3158(class262.field2947, client.field541.field1344);
            var6.field3031.method7087(var5);
            client.field541.method2378(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field833[--Statics.field836];
            class264 var8 = class264.method3158(class262.field2929, client.field541.field1344);
            var8.field3031.method7031(var7.length() + 1);
            var8.field3031.method7037(var7);
            client.field541.method2378(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field833[--Statics.field836];
            class264 var10 = class264.method3158(class262.field2986, client.field541.field1344);
            var10.field3031.method7031(var9.length() + 1);
            var10.field3031.method7037(var9);
            client.field541.method2378(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field834[--Statics.field4758];
            String var12 = field833[--Statics.field836];
            client.method5019(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field4758 -= 3;
            int var13 = field834[Statics.field4758];
            int var14 = field834[Statics.field4758 + 1];
            int var15 = field834[Statics.field4758 + 2];
            class294 var16 = class294.method2818(var15);
            client.method2998(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field4758 -= 2;
            int var17 = field834[Statics.field4758];
            int var18 = field834[Statics.field4758 + 1];
            class294 var19 = arg2 ? Statics.field1552 : Statics.field471;
            client.method2998(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1528 = field834[--Statics.field4758] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field834[++Statics.field4758 - 1] = Statics.field109.method2137() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field109.method2231(field834[--Statics.field4758] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field833[--Statics.field836];
            boolean var21 = field834[--Statics.field4758] == 1;
            class30.method4702(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field834[--Statics.field4758];
            class264 var23 = class264.method3158(class262.field2928, client.field541.field1344);
            var23.field3031.method7244(var22);
            client.field541.method2378(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field834[--Statics.field4758];
            Statics.field836 -= 2;
            String var25 = field833[Statics.field836];
            String var26 = field833[Statics.field836 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class264 var27 = class264.method3158(class262.field2952, client.field541.field1344);
                var27.field3031.method7244(1 + class443.method2008(var25) + class443.method2008(var26));
                var27.field3031.method7037(var26);
                var27.field3031.method7076(var24);
                var27.field3031.method7037(var25);
                client.field541.method2378(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field659 = field834[--Statics.field4758] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field751 = field834[--Statics.field4758] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field614 = field834[--Statics.field4758] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field834[--Statics.field4758] == 1) {
                client.field671 |= 0x1;
            } else {
                client.field671 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field834[--Statics.field4758] == 1) {
                client.field671 |= 0x2;
            } else {
                client.field671 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field834[--Statics.field4758] == 1) {
                client.field671 |= 0x4;
            } else {
                client.field671 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field834[--Statics.field4758] == 1) {
                client.field671 |= 0x8;
            } else {
                client.field671 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field671 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field599 = field834[--Statics.field4758] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field597 = field834[--Statics.field4758] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method67(field834[--Statics.field4758] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field834[++Statics.field4758 - 1] = client.method3166() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field4758 -= 2;
            client.field574 = field834[Statics.field4758];
            client.field575 = field834[Statics.field4758 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field4758 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 3132) {
            field834[++Statics.field4758 - 1] = Statics.field976;
            field834[++Statics.field4758 - 1] = Statics.field1028;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field4758 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field657 = 3;
            client.field658 = field834[--Statics.field4758];
            return 1;
        } else if (arg0 == 3137) {
            client.field657 = 2;
            client.field658 = field834[--Statics.field4758];
            return 1;
        } else if (arg0 == 3138) {
            client.field657 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field657 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field657 = 3;
            client.field658 = arg2 ? Statics.field1552.field3369 : Statics.field471.field3369;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field834[--Statics.field4758] == 1;
            Statics.field109.method2138(var28);
            return 1;
        } else if (arg0 == 3142) {
            field834[++Statics.field4758 - 1] = Statics.field109.method2139() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field834[--Statics.field4758] == 1;
            client.field529 = var29;
            if (!var29) {
                Statics.field109.method2152("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field834[++Statics.field4758 - 1] = client.field529 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field834[--Statics.field4758] == 1;
            Statics.field109.method2140(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field834[++Statics.field4758 - 1] = Statics.field109.method2209() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field834[++Statics.field4758 - 1] = class69.field904;
            return 1;
        } else if (arg0 == 3154) {
            field834[++Statics.field4758 - 1] = client.method2591();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field4758 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field4758--;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field4758--;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field836--;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field4758--;
            field833[++Statics.field836 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field4758--;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field4758 -= 2;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field4758 -= 2;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field4758 -= 2;
            field833[++Statics.field836 - 1] = "";
            field833[++Statics.field836 - 1] = "";
            field833[++Statics.field836 - 1] = "";
            field833[++Statics.field836 - 1] = "";
            field833[++Statics.field836 - 1] = "";
            field833[++Statics.field836 - 1] = "";
            field833[++Statics.field836 - 1] = "";
            field833[++Statics.field836 - 1] = "";
            field833[++Statics.field836 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field4758--;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 3175) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 3181) {
            client.method4653(field834[--Statics.field4758]);
            return 1;
        } else if (arg0 == 3182) {
            field834[++Statics.field4758 - 1] = client.method3588();
            return 1;
        } else if (arg0 == 3183 || arg0 == 3184) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 3187) {
            Statics.field836 -= 2;
            return 1;
        } else if (arg0 == 3188) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("be.m(ILbi;ZI)I")
    public static int method949(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field4758 -= 3;
            client.method711(field834[Statics.field4758], field834[Statics.field4758 + 1], field834[Statics.field4758 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method175(field834[--Statics.field4758]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field4758 -= 2;
            Statics.method692(field834[Statics.field4758], field834[Statics.field4758 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class84 var15 = class84.field1075;
            class83 var16 = class83.field1070;
            int var17 = field834[--Statics.field4758];
            if (arg0 == 3212) {
                int var18 = field834[--Statics.field4758];
                var15 = (class84) class329.method2087(class84.method3011(), var18);
                if (var15 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var18));
                }
            }
            if (arg0 == 3213) {
                int var19 = field834[--Statics.field4758];
                var16 = (class83) class329.method2087(class83.method4514(), var19);
                if (var16 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var19));
                }
            }
            if (arg0 == 3209) {
                int var20 = field834[--Statics.field4758];
                var15 = (class84) class329.method2087(class84.method3011(), var20);
                if (var15 == null) {
                    var16 = (class83) class329.method2087(class83.method4514(), var20);
                    if (var16 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var20));
                    }
                }
            } else if (arg0 == 3181) {
                var15 = class84.field1080;
            } else if (arg0 == 3203) {
                var16 = class83.field1068;
            } else if (arg0 == 3205) {
                var16 = class83.field1069;
            } else if (arg0 == 3207) {
                var16 = class83.field1074;
            }
            if (class83.field1070 == var16) {
                switch(var15.field1081) {
                    case 1:
                        Statics.field109.method2138(var17 == 1);
                        break;
                    case 2:
                        Statics.field109.method2140(var17 == 1);
                        break;
                    case 3:
                        Statics.field109.method2142(var17 == 1);
                        break;
                    case 4:
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        Statics.field109.method2222(var17);
                        break;
                    case 5:
                        client.method4653(var17);
                        break;
                    default:
                        String var21 = String.format("Unkown device option: %s.", var15.toString());
                        throw new RuntimeException(var21);
                }
            } else {
                switch(var16.field1066) {
                    case 1:
                        Statics.field109.method2231(var17 == 1);
                        break;
                    case 2:
                        int var27 = Math.min(Math.max(var17, 0), 100);
                        int var28 = Math.round((float) (var27 * 255) / 100.0F);
                        client.method4711(var28);
                        break;
                    case 3:
                        int var25 = Math.min(Math.max(var17, 0), 100);
                        int var26 = Math.round((float) (var25 * 127) / 100.0F);
                        client.method4213(var26);
                        break;
                    case 4:
                        int var23 = Math.min(Math.max(var17, 0), 100);
                        int var24 = Math.round((float) (var23 * 127) / 100.0F);
                        client.method4654(var24);
                        break;
                    default:
                        String var22 = String.format("Unkown game option: %s.", var16.toString());
                        throw new RuntimeException(var22);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class84 var3 = class84.field1075;
            class83 var4 = class83.field1070;
            boolean var5 = false;
            if (arg0 == 3214) {
                int var6 = field834[--Statics.field4758];
                var3 = (class84) class329.method2087(class84.method3011(), var6);
                if (var3 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var6));
                }
            }
            if (arg0 == 3215) {
                int var7 = field834[--Statics.field4758];
                var4 = (class83) class329.method2087(class83.method4514(), var7);
                if (var4 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                }
            }
            if (arg0 == 3210) {
                int var8 = field834[--Statics.field4758];
                var3 = (class84) class329.method2087(class84.method3011(), var8);
                if (var3 == null) {
                    var4 = (class83) class329.method2087(class83.method4514(), var8);
                    if (var4 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var8));
                    }
                }
            } else if (arg0 == 3182) {
                var3 = class84.field1080;
            } else if (arg0 == 3204) {
                var4 = class83.field1068;
            } else if (arg0 == 3206) {
                var4 = class83.field1069;
            } else if (arg0 == 3208) {
                var4 = class83.field1074;
            }
            int var10;
            if (class83.field1070 == var4) {
                switch(var3.field1081) {
                    case 1:
                        var10 = Statics.field109.method2139() ? 1 : 0;
                        break;
                    case 2:
                        var10 = Statics.field109.method2209() ? 1 : 0;
                        break;
                    case 3:
                        var10 = Statics.field109.method2144() ? 1 : 0;
                        break;
                    case 4:
                        var10 = Statics.field109.method2135();
                        break;
                    case 5:
                        var10 = client.method3588();
                        break;
                    default:
                        String var9 = String.format("Unkown device option: %s.", var3.toString());
                        throw new RuntimeException(var9);
                }
            } else {
                switch(var4.field1066) {
                    case 1:
                        var10 = Statics.field109.method2137() ? 1 : 0;
                        break;
                    case 2:
                        int var14 = Statics.field109.method2150();
                        var10 = Math.round((float) (var14 * 100) / 255.0F);
                        break;
                    case 3:
                        int var13 = Statics.field109.method2133();
                        var10 = Math.round((float) (var13 * 100) / 127.0F);
                        break;
                    case 4:
                        int var12 = Statics.field109.method2154();
                        var10 = Math.round((float) (var12 * 100) / 127.0F);
                        break;
                    default:
                        String var11 = String.format("Unkown game option: %s.", var4.toString());
                        throw new RuntimeException(var11);
                }
            }
            field834[++Statics.field4758 - 1] = var10;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dy.d(ILbi;ZB)I")
    public static int method2480(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field834[++Statics.field4758 - 1] = client.field552;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field4758 -= 2;
            int var3 = field834[Statics.field4758];
            int var4 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = class78.method2869(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field4758 -= 2;
            int var5 = field834[Statics.field4758];
            int var6 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = class78.method5288(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field4758 -= 2;
            int var7 = field834[Statics.field4758];
            int var8 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = class78.method6294(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = Statics.method4979(var9).field1821;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = client.field568[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = client.field628[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = client.field514[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1356;
            int var14 = (Statics.field1366.field1137 >> 7) + Statics.field168;
            int var15 = (Statics.field1366.field1131 >> 7) + Statics.field2674;
            field834[++Statics.field4758 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field834[++Statics.field4758 - 1] = client.field480 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field4758 -= 2;
            int var19 = field834[Statics.field4758] + 32768;
            int var20 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = class78.method2869(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field4758 -= 2;
            int var21 = field834[Statics.field4758] + 32768;
            int var22 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = class78.method5288(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field4758 -= 2;
            int var23 = field834[Statics.field4758] + 32768;
            int var24 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = class78.method6294(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field664 >= 2) {
                field834[++Statics.field4758 - 1] = client.field664;
            } else {
                field834[++Statics.field4758 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field834[++Statics.field4758 - 1] = client.field673;
            return 1;
        } else if (arg0 == 3318) {
            field834[++Statics.field4758 - 1] = client.field697;
            return 1;
        } else if (arg0 == 3321) {
            field834[++Statics.field4758 - 1] = client.field641;
            return 1;
        } else if (arg0 == 3322) {
            field834[++Statics.field4758 - 1] = client.field615;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field714) {
                field834[++Statics.field4758 - 1] = 1;
            } else {
                field834[++Statics.field4758 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field834[++Statics.field4758 - 1] = client.field478;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field4758 -= 4;
            int var25 = field834[Statics.field4758];
            int var26 = field834[Statics.field4758 + 1];
            int var27 = field834[Statics.field4758 + 2];
            int var28 = field834[Statics.field4758 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field834[++Statics.field4758 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field834[++Statics.field4758 - 1] = client.field606;
            return 1;
        } else if (arg0 == 3327) {
            field834[++Statics.field4758 - 1] = client.field648;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ej.ad(ILbi;ZB)I")
    public static int method2707(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field4758 -= 2;
            int var3 = field834[Statics.field4758];
            int var4 = field834[Statics.field4758 + 1];
            class176 var5 = class176.method2453(var3);
            if (var5.field1897 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1894; var6++) {
                if (var5.field1901[var6] == var4) {
                    field833[++Statics.field836 - 1] = var5.field1903[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field833[++Statics.field836 - 1] = var5.field1898;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field4758 -= 4;
            int var7 = field834[Statics.field4758];
            int var8 = field834[Statics.field4758 + 1];
            int var9 = field834[Statics.field4758 + 2];
            int var10 = field834[Statics.field4758 + 3];
            class176 var11 = class176.method2453(var9);
            if (var11.field1896 != var7 || var11.field1897 != var8) {
                if (var8 == 115) {
                    field833[++Statics.field836 - 1] = class308.field3624;
                } else {
                    field834[++Statics.field4758 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1894; var12++) {
                if (var11.field1901[var12] == var10) {
                    if (var8 == 115) {
                        field833[++Statics.field836 - 1] = var11.field1903[var12];
                    } else {
                        field834[++Statics.field4758 - 1] = var11.field1902[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field833[++Statics.field836 - 1] = var11.field1898;
                } else {
                    field834[++Statics.field4758 - 1] = var11.field1905;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field834[--Statics.field4758];
            class176 var14 = class176.method2453(var13);
            field834[++Statics.field4758 - 1] = var14.method3147();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cq.ak(ILbi;ZI)I")
    public static int method2002(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = Statics.method737(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = class24.method4192(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = Statics.method726(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fz.al(ILbi;ZB)I")
    public static int method2964(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1116.field803 == 0) {
                field834[++Statics.field4758 - 1] = -2;
            } else if (Statics.field1116.field803 == 1) {
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = Statics.field1116.field801.method6096();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field834[--Statics.field4758];
            if (Statics.field1116.method1545() && var3 >= 0 && var3 < Statics.field1116.field801.method6096()) {
                class368 var4 = (class368) Statics.field1116.field801.method6125(var3);
                field833[++Statics.field836 - 1] = var4.method6076();
                field833[++Statics.field836 - 1] = var4.method6077();
            } else {
                field833[++Statics.field836 - 1] = "";
                field833[++Statics.field836 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field834[--Statics.field4758];
            if (Statics.field1116.method1545() && var5 >= 0 && var5 < Statics.field1116.field801.method6096()) {
                field834[++Statics.field4758 - 1] = ((class375) Statics.field1116.field801.method6125(var5)).field4325;
            } else {
                field834[++Statics.field4758 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field834[--Statics.field4758];
            if (Statics.field1116.method1545() && var6 >= 0 && var6 < Statics.field1116.field801.method6096()) {
                field834[++Statics.field4758 - 1] = ((class375) Statics.field1116.field801.method6125(var6)).field4324;
            } else {
                field834[++Statics.field4758 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field833[--Statics.field836];
            int var8 = field834[--Statics.field4758];
            class62.method304(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field833[--Statics.field836];
            Statics.field1116.method1552(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field833[--Statics.field836];
            Statics.field1116.method1556(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field833[--Statics.field836];
            Statics.field1116.method1554(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field833[--Statics.field836];
            Statics.field1116.method1557(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field833[--Statics.field836];
            String var14 = client.method2273(var13);
            field834[++Statics.field4758 - 1] = Statics.field1116.method1572(new class464(var14, Statics.field1888), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field3294 == null) {
                field833[++Statics.field836 - 1] = "";
            } else {
                field833[++Statics.field836 - 1] = Statics.field3294.field4294;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field3294 == null) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = Statics.field3294.method6096();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field834[--Statics.field4758];
            if (Statics.field3294 == null || var15 >= Statics.field3294.method6096()) {
                field833[++Statics.field836 - 1] = "";
            } else {
                field833[++Statics.field836 - 1] = Statics.field3294.method6125(var15).method6075().method7617();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field834[--Statics.field4758];
            if (Statics.field3294 == null || var16 >= Statics.field3294.method6096()) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = ((class375) Statics.field3294.method6125(var16)).method6180();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field834[--Statics.field4758];
            if (Statics.field3294 == null || var17 >= Statics.field3294.method6096()) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = ((class375) Statics.field3294.method6125(var17)).field4324;
            }
            return 1;
        } else if (arg0 == 3616) {
            field834[++Statics.field4758 - 1] = Statics.field3294 == null ? 0 : Statics.field3294.field4296;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field833[--Statics.field836];
            client.method1974(var18);
            return 1;
        } else if (arg0 == 3618) {
            field834[++Statics.field4758 - 1] = Statics.field3294 == null ? 0 : Statics.field3294.field4297;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field833[--Statics.field836];
            client.method2310(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method2454();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1116.method1545()) {
                field834[++Statics.field4758 - 1] = Statics.field1116.field802.method6096();
            } else {
                field834[++Statics.field4758 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field834[--Statics.field4758];
            if (Statics.field1116.method1545() && var20 >= 0 && var20 < Statics.field1116.field802.method6096()) {
                class374 var21 = (class374) Statics.field1116.field802.method6125(var20);
                field833[++Statics.field836 - 1] = var21.method6076();
                field833[++Statics.field836 - 1] = var21.method6077();
            } else {
                field833[++Statics.field836 - 1] = "";
                field833[++Statics.field836 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field833[--Statics.field836];
            String var23 = client.method2273(var22);
            field834[++Statics.field4758 - 1] = Statics.field1116.method1551(new class464(var23, Statics.field1888)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field834[--Statics.field4758];
            if (Statics.field3294 == null || var24 >= Statics.field3294.method6096() || !Statics.field3294.method6125(var24).method6075().equals(Statics.field1366.field1114)) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field3294 == null || Statics.field3294.field4293 == null) {
                field833[++Statics.field836 - 1] = "";
            } else {
                field833[++Statics.field836 - 1] = Statics.field3294.field4293;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field834[--Statics.field4758];
            if (Statics.field3294 == null || var25 >= Statics.field3294.method6096() || !((class370) Statics.field3294.method6125(var25)).method6047()) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field834[--Statics.field4758];
            if (Statics.field3294 == null || var26 >= Statics.field3294.method6096() || !((class370) Statics.field3294.method6125(var26)).method6050()) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1116.field801.method6114();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field834[--Statics.field4758] == 1;
            Statics.field1116.field801.method6115(new class448(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field834[--Statics.field4758] == 1;
            Statics.field1116.field801.method6115(new class449(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field834[--Statics.field4758] == 1;
            Statics.field1116.field801.method6115(new class108(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field834[--Statics.field4758] == 1;
            Statics.field1116.field801.method6115(new class104(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field834[--Statics.field4758] == 1;
            Statics.field1116.field801.method6115(new class107(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field834[--Statics.field4758] == 1;
            Statics.field1116.field801.method6115(new class112(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field834[--Statics.field4758] == 1;
            Statics.field1116.field801.method6115(new class106(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field834[--Statics.field4758] == 1;
            Statics.field1116.field801.method6115(new class105(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field834[--Statics.field4758] == 1;
            Statics.field1116.field801.method6115(new class109(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field834[--Statics.field4758] == 1;
            Statics.field1116.field801.method6115(new class110(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1116.field801.method6157();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1116.field802.method6114();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field834[--Statics.field4758] == 1;
            Statics.field1116.field802.method6115(new class448(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field834[--Statics.field4758] == 1;
            Statics.field1116.field802.method6115(new class449(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1116.field802.method6157();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field3294 != null) {
                Statics.field3294.method6114();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field834[--Statics.field4758] == 1;
            if (Statics.field3294 != null) {
                Statics.field3294.method6115(new class448(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field834[--Statics.field4758] == 1;
            if (Statics.field3294 != null) {
                Statics.field3294.method6115(new class449(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field834[--Statics.field4758] == 1;
            if (Statics.field3294 != null) {
                Statics.field3294.method6115(new class108(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field834[--Statics.field4758] == 1;
            if (Statics.field3294 != null) {
                Statics.field3294.method6115(new class104(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field834[--Statics.field4758] == 1;
            if (Statics.field3294 != null) {
                Statics.field3294.method6115(new class107(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field834[--Statics.field4758] == 1;
            if (Statics.field3294 != null) {
                Statics.field3294.method6115(new class112(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field834[--Statics.field4758] == 1;
            if (Statics.field3294 != null) {
                Statics.field3294.method6115(new class106(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field834[--Statics.field4758] == 1;
            if (Statics.field3294 != null) {
                Statics.field3294.method6115(new class105(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field834[--Statics.field4758] == 1;
            if (Statics.field3294 != null) {
                Statics.field3294.method6115(new class109(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field834[--Statics.field4758] == 1;
            if (Statics.field3294 != null) {
                Statics.field3294.method6115(new class110(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field3294 != null) {
                Statics.field3294.method6157();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field834[--Statics.field4758] == 1;
            Statics.field1116.field801.method6115(new class111(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field834[--Statics.field4758] == 1;
            if (Statics.field3294 != null) {
                Statics.field3294.method6115(new class111(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bj.ao(ILbi;ZI)I")
    public static int method1978(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field4758--;
            Statics.field836--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field4758++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.ab(ILbi;ZB)I")
    public static int method1093(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field1260 == null) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = 1;
                Statics.field2843 = Statics.field1260;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field834[--Statics.field4758];
            if (client.field724[var3] == null) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = 1;
                Statics.field2843 = client.field724[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field833[++Statics.field836 - 1] = Statics.field2843.field1630;
            return 1;
        } else if (arg0 == 3803) {
            field834[++Statics.field4758 - 1] = Statics.field2843.field1632 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field834[++Statics.field4758 - 1] = Statics.field2843.field1638;
            return 1;
        } else if (arg0 == 3805) {
            field834[++Statics.field4758 - 1] = Statics.field2843.field1634;
            return 1;
        } else if (arg0 == 3806) {
            field834[++Statics.field4758 - 1] = Statics.field2843.field1635;
            return 1;
        } else if (arg0 == 3807) {
            field834[++Statics.field4758 - 1] = Statics.field2843.field1646;
            return 1;
        } else if (arg0 == 3809) {
            field834[++Statics.field4758 - 1] = Statics.field2843.field1637;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field834[--Statics.field4758];
            field833[++Statics.field836 - 1] = Statics.field2843.field1648[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = Statics.field2843.field1633[var5];
            return 1;
        } else if (arg0 == 3812) {
            field834[++Statics.field4758 - 1] = Statics.field2843.field1640;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field834[--Statics.field4758];
            field833[++Statics.field836 - 1] = Statics.field2843.field1636[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field4758 -= 3;
            int var7 = field834[Statics.field4758];
            int var8 = field834[Statics.field4758 + 1];
            int var9 = field834[Statics.field4758 + 2];
            field834[++Statics.field4758 - 1] = Statics.field2843.method2761(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field834[++Statics.field4758 - 1] = Statics.field2843.field1639;
            return 1;
        } else if (arg0 == 3816) {
            field834[++Statics.field4758 - 1] = Statics.field2843.field1645;
            return 1;
        } else if (arg0 == 3817) {
            field834[++Statics.field4758 - 1] = Statics.field2843.method2780(field833[--Statics.field836]);
            return 1;
        } else if (arg0 == 3818) {
            field834[Statics.field4758 - 1] = Statics.field2843.method2744()[field834[Statics.field4758 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field4758 -= 2;
            int var10 = field834[Statics.field4758];
            int var11 = field834[Statics.field4758 + 1];
            client.method4724(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = Statics.field2843.field1650[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field4758 -= 3;
                int var13 = field834[Statics.field4758];
                boolean var14 = field834[Statics.field4758 + 1] == 1;
                int var15 = field834[Statics.field4758 + 2];
                client.method4194(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field834[--Statics.field4758];
                field834[++Statics.field4758 - 1] = Statics.field2843.field1643[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field1710 == null) {
                    field834[++Statics.field4758 - 1] = 0;
                } else {
                    field834[++Statics.field4758 - 1] = 1;
                    Statics.field1387 = Statics.field1710;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field834[--Statics.field4758];
                if (client.field725[var17] == null) {
                    field834[++Statics.field4758 - 1] = 0;
                } else {
                    field834[++Statics.field4758 - 1] = 1;
                    Statics.field1387 = client.field725[var17];
                    Statics.field839 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field833[++Statics.field836 - 1] = Statics.field1387.field1695;
                return 1;
            } else if (arg0 == 3853) {
                field834[++Statics.field4758 - 1] = Statics.field1387.field1697;
                return 1;
            } else if (arg0 == 3854) {
                field834[++Statics.field4758 - 1] = Statics.field1387.field1696;
                return 1;
            } else if (arg0 == 3855) {
                field834[++Statics.field4758 - 1] = Statics.field1387.method2850();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field834[--Statics.field4758];
                field833[++Statics.field836 - 1] = ((class131) Statics.field1387.field1692.get(var18)).field1580.method7617();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field834[--Statics.field4758];
                field834[++Statics.field4758 - 1] = ((class131) Statics.field1387.field1692.get(var19)).field1582;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field834[--Statics.field4758];
                field834[++Statics.field4758 - 1] = ((class131) Statics.field1387.field1692.get(var20)).field1579;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field834[--Statics.field4758];
                client.method1016(Statics.field839, var21);
                return 1;
            } else if (arg0 == 3860) {
                field834[++Statics.field4758 - 1] = Statics.field1387.method2839(field833[--Statics.field836]);
                return 1;
            } else if (arg0 == 3861) {
                field834[Statics.field4758 - 1] = Statics.field1387.method2835()[field834[Statics.field4758 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field834[++Statics.field4758 - 1] = Statics.field4585 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("hv.ap(ILbi;ZI)I")
    public static int method4543(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = client.field723[var3].method5463();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = client.field723[var4].field4067;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = client.field723[var5].field4069;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = client.field723[var6].field4070;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = client.field723[var7].field4068;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = client.field723[var8].field4072;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field834[--Statics.field4758];
            int var10 = client.field723[var9].method5447();
            field834[++Statics.field4758 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field834[--Statics.field4758];
            int var12 = client.field723[var11].method5447();
            field834[++Statics.field4758 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field834[--Statics.field4758];
            int var14 = client.field723[var13].method5447();
            field834[++Statics.field4758 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field834[--Statics.field4758];
            int var16 = client.field723[var15].method5447();
            field834[++Statics.field4758 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field834[--Statics.field4758] == 1;
            if (Statics.field1667 != null) {
                Statics.field1667.method5402(class317.field4041, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field834[--Statics.field4758] == 1;
            if (Statics.field1667 != null) {
                Statics.field1667.method5402(class317.field4040, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field4758 -= 2;
            boolean var19 = field834[Statics.field4758] == 1;
            boolean var20 = field834[Statics.field4758 + 1] == 1;
            if (Statics.field1667 != null) {
                client.field767.field469 = var20;
                Statics.field1667.method5402(client.field767, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field834[--Statics.field4758] == 1;
            if (Statics.field1667 != null) {
                Statics.field1667.method5402(class317.field4039, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field834[--Statics.field4758] == 1;
            if (Statics.field1667 != null) {
                Statics.field1667.method5402(class317.field4038, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field834[++Statics.field4758 - 1] = Statics.field1667 == null ? 0 : Statics.field1667.field4044.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field834[--Statics.field4758];
            class323 var24 = (class323) Statics.field1667.field4044.get(var23);
            field834[++Statics.field4758 - 1] = var24.field4062;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field834[--Statics.field4758];
            class323 var26 = (class323) Statics.field1667.field4044.get(var25);
            field833[++Statics.field836 - 1] = var26.method5441();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field834[--Statics.field4758];
            class323 var28 = (class323) Statics.field1667.field4044.get(var27);
            field833[++Statics.field836 - 1] = var28.method5442();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field834[--Statics.field4758];
            class323 var30 = (class323) Statics.field1667.field4044.get(var29);
            long var31 = class269.method2567() - Statics.field3178 - var30.field4061;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field833[++Statics.field836 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field834[--Statics.field4758];
            class323 var38 = (class323) Statics.field1667.field4044.get(var37);
            field834[++Statics.field4758 - 1] = var38.field4066.field4070;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field834[--Statics.field4758];
            class323 var40 = (class323) Statics.field1667.field4044.get(var39);
            field834[++Statics.field4758 - 1] = var40.field4066.field4069;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field834[--Statics.field4758];
            class323 var42 = (class323) Statics.field1667.field4044.get(var41);
            field834[++Statics.field4758 - 1] = var42.field4066.field4067;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lb.ac(ILbi;ZI)I")
    public static int method5505(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field4758 -= 2;
            int var3 = field834[Statics.field4758];
            int var4 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field4758 -= 2;
            int var5 = field834[Statics.field4758];
            int var6 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field4758 -= 2;
            int var7 = field834[Statics.field4758];
            int var8 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field4758 -= 2;
            int var9 = field834[Statics.field4758];
            int var10 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field4758 -= 5;
            int var13 = field834[Statics.field4758];
            int var14 = field834[Statics.field4758 + 1];
            int var15 = field834[Statics.field4758 + 2];
            int var16 = field834[Statics.field4758 + 3];
            int var17 = field834[Statics.field4758 + 4];
            field834[++Statics.field4758 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field4758 -= 2;
            int var18 = field834[Statics.field4758];
            int var19 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field4758 -= 2;
            int var20 = field834[Statics.field4758];
            int var21 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field4758 -= 2;
            int var22 = field834[Statics.field4758];
            int var23 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field4758 -= 2;
            int var24 = field834[Statics.field4758];
            int var25 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field4758 -= 2;
            int var26 = field834[Statics.field4758];
            int var27 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field4758 -= 2;
            int var28 = field834[Statics.field4758];
            int var29 = field834[Statics.field4758 + 1];
            if (var28 == 0) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field4758 -= 2;
            int var30 = field834[Statics.field4758];
            int var31 = field834[Statics.field4758 + 1];
            if (var30 == 0) {
                field834[++Statics.field4758 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field834[++Statics.field4758 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field834[++Statics.field4758 - 1] = var30;
                    break;
                case 2:
                    field834[++Statics.field4758 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field834[++Statics.field4758 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field834[++Statics.field4758 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field834[++Statics.field4758 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field4758 -= 2;
            int var32 = field834[Statics.field4758];
            int var33 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field4758 -= 2;
            int var34 = field834[Statics.field4758];
            int var35 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field4758 -= 3;
            long var36 = (long) field834[Statics.field4758];
            long var38 = (long) field834[Statics.field4758 + 1];
            long var40 = (long) field834[Statics.field4758 + 2];
            field834[++Statics.field4758 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class271.method4738(field834[--Statics.field4758]);
            field834[++Statics.field4758 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field4758 -= 2;
            int var43 = field834[Statics.field4758];
            int var44 = field834[Statics.field4758 + 1];
            field834[++Statics.field4758 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field4758 -= 3;
            int var45 = field834[Statics.field4758];
            int var46 = field834[Statics.field4758 + 1];
            int var47 = field834[Statics.field4758 + 2];
            field834[++Statics.field4758 - 1] = class271.method227(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field4758 -= 3;
            int var48 = field834[Statics.field4758];
            int var49 = field834[Statics.field4758 + 1];
            int var50 = field834[Statics.field4758 + 2];
            field834[++Statics.field4758 - 1] = class271.method2732(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field4758 -= 3;
            int var51 = field834[Statics.field4758];
            int var52 = field834[Statics.field4758 + 1];
            int var53 = field834[Statics.field4758 + 2];
            int var54 = 31 - var53;
            field834[++Statics.field4758 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field4758 -= 4;
            int var55 = field834[Statics.field4758];
            int var56 = field834[Statics.field4758 + 1];
            int var57 = field834[Statics.field4758 + 2];
            int var58 = field834[Statics.field4758 + 3];
            int var59 = class271.method2732(var55, var57, var58);
            int var60 = class271.method3055(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field834[++Statics.field4758 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field834[Statics.field4758 - 1] = class402.method6062(field834[Statics.field4758 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field834[Statics.field4758 - 1] = class402.method2909(field834[Statics.field4758 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field4758 -= 2;
            int var61 = field834[Statics.field4758];
            int var62 = field834[Statics.field4758 + 1];
            int var63 = class402.method2730(var61, var62);
            field834[++Statics.field4758 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field834[Statics.field4758 - 1] = Math.abs(field834[Statics.field4758 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dr.ae(ILbi;ZB)I")
    public static int method2467(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field833[--Statics.field836];
            int var4 = field834[--Statics.field4758];
            field833[++Statics.field836 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field836 -= 2;
            String var5 = field833[Statics.field836];
            String var6 = field833[Statics.field836 + 1];
            field833[++Statics.field836 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field833[--Statics.field836];
            int var8 = field834[--Statics.field4758];
            field833[++Statics.field836 - 1] = var7 + class343.method3689(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field833[--Statics.field836];
            field833[++Statics.field836 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field834[--Statics.field4758];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field840.setTime(new Date(var11));
            int var13 = field840.get(5);
            int var14 = field840.get(2);
            int var15 = field840.get(1);
            field833[++Statics.field836 - 1] = var13 + "-" + field842[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field836 -= 2;
            String var16 = field833[Statics.field836];
            String var17 = field833[Statics.field836 + 1];
            if (Statics.field1366.field1087 != null && Statics.field1366.field1087.field3336) {
                field833[++Statics.field836 - 1] = var17;
            } else {
                field833[++Statics.field836 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field834[--Statics.field4758];
            field833[++Statics.field836 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field836 -= 2;
            field834[++Statics.field4758 - 1] = class343.method3688(class344.method4538(field833[Statics.field836], field833[Statics.field836 + 1], Statics.field1604));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field833[--Statics.field836];
            Statics.field4758 -= 2;
            int var20 = field834[Statics.field4758];
            int var21 = field834[Statics.field4758 + 1];
            byte[] var22 = Statics.field3299.method5305(var21, 0);
            class349 var23 = new class349(var22);
            field834[++Statics.field4758 - 1] = var23.method5832(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field833[--Statics.field836];
            Statics.field4758 -= 2;
            int var25 = field834[Statics.field4758];
            int var26 = field834[Statics.field4758 + 1];
            byte[] var27 = Statics.field3299.method5305(var26, 0);
            class349 var28 = new class349(var27);
            field834[++Statics.field4758 - 1] = var28.method5828(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field836 -= 2;
            String var29 = field833[Statics.field836];
            String var30 = field833[Statics.field836 + 1];
            if (field834[--Statics.field4758] == 1) {
                field833[++Statics.field836 - 1] = var29;
            } else {
                field833[++Statics.field836 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field833[--Statics.field836];
            field833[++Statics.field836 - 1] = class350.method5804(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field833[--Statics.field836];
            int var33 = field834[--Statics.field4758];
            field833[++Statics.field836 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = class343.method5224((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = class343.method3496((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = class343.method5211((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = class343.method2024((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field833[--Statics.field836];
            if (var38 == null) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field833[--Statics.field836];
            Statics.field4758 -= 2;
            int var40 = field834[Statics.field4758];
            int var41 = field834[Statics.field4758 + 1];
            field833[++Statics.field836 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field833[--Statics.field836];
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
            field833[++Statics.field836 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field833[--Statics.field836];
            int var48 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field836 -= 2;
            String var49 = field833[Statics.field836];
            String var50 = field833[Statics.field836 + 1];
            int var51 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field833[--Statics.field836];
            field833[++Statics.field836 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dg.aj(ILbi;ZI)I")
    public static int method2503(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field834[--Statics.field4758];
            field833[++Statics.field836 - 1] = class188.method3161(var3).field2103;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field4758 -= 2;
            int var4 = field834[Statics.field4758];
            int var5 = field834[Statics.field4758 + 1];
            class188 var6 = class188.method3161(var4);
            if (var5 < 1 || var5 > 5 || var6.field2125[var5 - 1] == null) {
                field833[++Statics.field836 - 1] = "";
            } else {
                field833[++Statics.field836 - 1] = var6.field2125[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field4758 -= 2;
            int var7 = field834[Statics.field4758];
            int var8 = field834[Statics.field4758 + 1];
            class188 var9 = class188.method3161(var7);
            if (var8 < 1 || var8 > 5 || var9.field2118[var8 - 1] == null) {
                field833[++Statics.field836 - 1] = "";
            } else {
                field833[++Statics.field836 - 1] = var9.field2118[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = class188.method3161(var10).field2124;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = class188.method3161(var11).field2114 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field834[--Statics.field4758];
            class188 var13 = class188.method3161(var12);
            if (var13.field2135 == -1 && var13.field2134 >= 0) {
                field834[++Statics.field4758 - 1] = var13.field2134;
            } else {
                field834[++Statics.field4758 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field834[--Statics.field4758];
            class188 var15 = class188.method3161(var14);
            if (var15.field2135 >= 0 && var15.field2134 >= 0) {
                field834[++Statics.field4758 - 1] = var15.field2134;
            } else {
                field834[++Statics.field4758 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = class188.method3161(var16).field2139 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field834[--Statics.field4758];
            class188 var18 = class188.method3161(var17);
            if (var18.field2147 == -1 && var18.field2146 >= 0) {
                field834[++Statics.field4758 - 1] = var18.field2146;
            } else {
                field834[++Statics.field4758 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field834[--Statics.field4758];
            class188 var20 = class188.method3161(var19);
            if (var20.field2147 >= 0 && var20.field2146 >= 0) {
                field834[++Statics.field4758 - 1] = var20.field2146;
            } else {
                field834[++Statics.field4758 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field833[--Statics.field836];
            int var22 = field834[--Statics.field4758];
            client.method303(var21, var22 == 1);
            field834[++Statics.field4758 - 1] = Statics.field1208;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field51 == null || Statics.field4333 >= Statics.field1208) {
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = Statics.field51[++Statics.field4333 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field4333 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field834[--Statics.field4758];
            int var24 = class188.method3161(var23).method3397();
            if (var24 == -1) {
                field834[++Statics.field4758 - 1] = var24;
            } else {
                field834[++Statics.field4758 - 1] = var24 + 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dq.am(ILbi;ZB)I")
    public static int method2611(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field834[++Statics.field4758 - 1] = client.field715;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field4758 -= 3;
            client.field715 = field834[Statics.field4758];
            Statics.field4137 = class460.method6178(field834[Statics.field4758 + 1]);
            if (Statics.field4137 == null) {
                Statics.field4137 = class460.field4818;
            }
            client.field716 = field834[Statics.field4758 + 2];
            class264 var3 = class264.method3158(class262.field2917, client.field541.field1344);
            var3.field3031.method7031(client.field715);
            var3.field3031.method7031(Statics.field4137.field4821);
            var3.field3031.method7031(client.field716);
            client.field541.method2378(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field833[--Statics.field836];
            Statics.field4758 -= 2;
            int var5 = field834[Statics.field4758];
            int var6 = field834[Statics.field4758 + 1];
            class264 var7 = class264.method3158(class262.field2950, client.field541.field1344);
            var7.field3031.method7031(class443.method2008(var4) + 2);
            var7.field3031.method7037(var4);
            var7.field3031.method7031(var5 - 1);
            var7.field3031.method7031(var6);
            client.field541.method2378(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field4758 -= 2;
            int var8 = field834[Statics.field4758];
            int var9 = field834[Statics.field4758 + 1];
            class58 var10 = class99.method232(var8, var9);
            if (var10 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
                field833[++Statics.field836 - 1] = "";
                field833[++Statics.field836 - 1] = "";
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = var10.field455;
                field834[++Statics.field4758 - 1] = var10.field453;
                field833[++Statics.field836 - 1] = var10.field463 == null ? "" : var10.field463;
                field833[++Statics.field836 - 1] = var10.field459 == null ? "" : var10.field459;
                field833[++Statics.field836 - 1] = var10.field452 == null ? "" : var10.field452;
                field834[++Statics.field4758 - 1] = var10.method987() ? 1 : (var10.method990() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field834[--Statics.field4758];
            class58 var12 = class99.method2452(var11);
            if (var12 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
                field833[++Statics.field836 - 1] = "";
                field833[++Statics.field836 - 1] = "";
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = var12.field460;
                field834[++Statics.field4758 - 1] = var12.field453;
                field833[++Statics.field836 - 1] = var12.field463 == null ? "" : var12.field463;
                field833[++Statics.field836 - 1] = var12.field459 == null ? "" : var12.field459;
                field833[++Statics.field836 - 1] = var12.field452 == null ? "" : var12.field452;
                field834[++Statics.field4758 - 1] = var12.method987() ? 1 : (var12.method990() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field4137 == null) {
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = Statics.field4137.field4821;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field833[--Statics.field836];
            int var14 = field834[--Statics.field4758];
            class264 var15 = class465.method5070(var14, var13, Statics.field1604, -1);
            client.field541.method2378(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field836 -= 2;
            String var16 = field833[Statics.field836];
            String var17 = field833[Statics.field836 + 1];
            class264 var18 = class264.method3158(class262.field2933, client.field541.field1344);
            var18.field3031.method7244(0);
            int var19 = var18.field3031.field4700;
            var18.field3031.method7037(var16);
            class282.method693(var18.field3031, var17);
            var18.field3031.method7043(var18.field3031.field4700 - var19);
            client.field541.method2378(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field833[--Statics.field836];
            Statics.field4758 -= 2;
            int var21 = field834[Statics.field4758];
            int var22 = field834[Statics.field4758 + 1];
            class264 var23 = class465.method5070(var21, var20, Statics.field1604, var22);
            client.field541.method2378(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field1366 == null || Statics.field1366.field1114 == null) {
                var24 = "";
            } else {
                var24 = Statics.field1366.field1114.method7617();
            }
            field833[++Statics.field836 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field834[++Statics.field4758 - 1] = client.field716;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = class99.method2698(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = class99.method4984(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = class99.method300(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field833[--Statics.field836];
            client.method2569(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field717 = field833[--Statics.field836].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field833[++Statics.field836 - 1] = client.field717;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field833[--Statics.field836];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5024) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 5025) {
            Statics.field4758++;
            return 1;
        } else if (arg0 == 5030) {
            Statics.field4758 -= 2;
            int var30 = field834[Statics.field4758];
            int var31 = field834[Statics.field4758 + 1];
            class58 var32 = class99.method232(var30, var31);
            if (var32 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
                field833[++Statics.field836 - 1] = "";
                field833[++Statics.field836 - 1] = "";
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = var32.field455;
                field834[++Statics.field4758 - 1] = var32.field453;
                field833[++Statics.field836 - 1] = var32.field463 == null ? "" : var32.field463;
                field833[++Statics.field836 - 1] = var32.field459 == null ? "" : var32.field459;
                field833[++Statics.field836 - 1] = var32.field452 == null ? "" : var32.field452;
                field834[++Statics.field4758 - 1] = var32.method987() ? 1 : (var32.method990() ? 2 : 0);
                field833[++Statics.field836 - 1] = "";
                field834[++Statics.field4758 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field834[--Statics.field4758];
            class58 var34 = class99.method2452(var33);
            if (var34 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
                field833[++Statics.field836 - 1] = "";
                field833[++Statics.field836 - 1] = "";
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = var34.field460;
                field834[++Statics.field4758 - 1] = var34.field453;
                field833[++Statics.field836 - 1] = var34.field463 == null ? "" : var34.field463;
                field833[++Statics.field836 - 1] = var34.field459 == null ? "" : var34.field459;
                field833[++Statics.field836 - 1] = var34.field452 == null ? "" : var34.field452;
                field834[++Statics.field4758 - 1] = var34.method987() ? 1 : (var34.method990() ? 2 : 0);
                field833[++Statics.field836 - 1] = "";
                field834[++Statics.field4758 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fg.an(ILbi;ZB)I")
    public static int method3092(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field834[++Statics.field4758 - 1] = client.method68();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field834[--Statics.field4758];
            if (var3 == 1 || var3 == 2) {
                client.method4223(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field834[++Statics.field4758 - 1] = Statics.field109.method2160();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field834[--Statics.field4758];
            if (var4 == 1 || var4 == 2) {
                Statics.field109.method2172(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 5311) {
            Statics.field4758 -= 2;
            return 1;
        } else if (arg0 == 5312) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field836 -= 2;
            Statics.field4758--;
            return 1;
        } else if (arg0 == 5351) {
            Statics.field836--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dq.af(ILbi;ZB)I")
    public static int method2613(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field4758 -= 2;
            int var3 = field834[Statics.field4758];
            int var4 = field834[Statics.field4758 + 1];
            if (!client.field760) {
                client.field563 = var3;
                client.field564 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field834[++Statics.field4758 - 1] = client.field563;
            return 1;
        } else if (arg0 == 5506) {
            field834[++Statics.field4758 - 1] = client.field564;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field834[--Statics.field4758];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field570 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field834[++Statics.field4758 - 1] = client.field570;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("b.ax(ILbi;ZI)I")
    public static int method259(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field542 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field836 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field834[++Statics.field4758 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.ar(II)I")
    public static int method250(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("gh.at(IB)I")
    public static int method4016(int arg0) {
        return (int) ((Math.log((double) arg0) / field846 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("ny.ag(ILbi;ZI)I")
    public static int method6393(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field4758 -= 2;
            client.field749 = (short) method250(field834[Statics.field4758]);
            if (client.field749 <= 0) {
                client.field749 = 256;
            }
            client.field750 = (short) method250(field834[Statics.field4758 + 1]);
            if (client.field750 <= 0) {
                client.field750 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field4758 -= 2;
            client.field553 = (short) field834[Statics.field4758];
            if (client.field553 <= 0) {
                client.field553 = 256;
            }
            client.field603 = (short) field834[Statics.field4758 + 1];
            if (client.field603 <= 0) {
                client.field603 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field4758 -= 4;
            client.field753 = (short) field834[Statics.field4758];
            if (client.field753 <= 0) {
                client.field753 = 1;
            }
            client.field754 = (short) field834[Statics.field4758 + 1];
            if (client.field754 <= 0) {
                client.field754 = 32767;
            } else if (client.field754 < client.field753) {
                client.field754 = client.field753;
            }
            client.field755 = (short) field834[Statics.field4758 + 2];
            if (client.field755 <= 0) {
                client.field755 = 1;
            }
            client.field756 = (short) field834[Statics.field4758 + 3];
            if (client.field756 <= 0) {
                client.field756 = 32767;
            } else if (client.field756 < client.field755) {
                client.field756 = client.field755;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field667 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = -1;
            } else {
                client.method3814(0, 0, client.field667.field3384, client.field667.field3385, false);
                field834[++Statics.field4758 - 1] = client.field759;
                field834[++Statics.field4758 - 1] = client.field506;
            }
            return 1;
        } else if (arg0 == 6204) {
            field834[++Statics.field4758 - 1] = client.field553;
            field834[++Statics.field4758 - 1] = client.field603;
            return 1;
        } else if (arg0 == 6205) {
            field834[++Statics.field4758 - 1] = method4016(client.field749);
            field834[++Statics.field4758 - 1] = method4016(client.field750);
            return 1;
        } else if (arg0 == 6220) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field834[++Statics.field4758 - 1] = Statics.field976;
            return 1;
        } else if (arg0 == 6223) {
            field834[++Statics.field4758 - 1] = Statics.field1028;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gf.aq(ILbi;ZB)I")
    public static int method3249(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field834[++Statics.field4758 - 1] = Statics.method2731() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class61 var3 = class61.method2867();
            if (var3 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
                field834[++Statics.field4758 - 1] = 0;
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
            } else {
                field834[++Statics.field4758 - 1] = var3.field786;
                field834[++Statics.field4758 - 1] = var3.field790;
                field833[++Statics.field836 - 1] = var3.field793;
                field834[++Statics.field4758 - 1] = var3.field794;
                field834[++Statics.field4758 - 1] = var3.field796;
                field833[++Statics.field836 - 1] = var3.field792;
            }
            return 1;
        } else if (arg0 == 6502) {
            class61 var4 = class61.method1778();
            if (var4 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
                field834[++Statics.field4758 - 1] = 0;
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
            } else {
                field834[++Statics.field4758 - 1] = var4.field786;
                field834[++Statics.field4758 - 1] = var4.field790;
                field833[++Statics.field836 - 1] = var4.field793;
                field834[++Statics.field4758 - 1] = var4.field794;
                field834[++Statics.field4758 - 1] = var4.field796;
                field833[++Statics.field836 - 1] = var4.field792;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field834[--Statics.field4758];
            class61 var6 = null;
            for (int var7 = 0; var7 < class61.field785; var7++) {
                if (Statics.field4280[var7].field786 == var5) {
                    var6 = Statics.field4280[var7];
                    break;
                }
            }
            if (var6 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
                field834[++Statics.field4758 - 1] = 0;
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
            } else {
                field834[++Statics.field4758 - 1] = var6.field786;
                field834[++Statics.field4758 - 1] = var6.field790;
                field833[++Statics.field836 - 1] = var6.field793;
                field834[++Statics.field4758 - 1] = var6.field794;
                field834[++Statics.field4758 - 1] = var6.field796;
                field833[++Statics.field836 - 1] = var6.field792;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field4758 -= 4;
            int var8 = field834[Statics.field4758];
            boolean var9 = field834[Statics.field4758 + 1] == 1;
            int var10 = field834[Statics.field4758 + 2];
            boolean var11 = field834[Statics.field4758 + 3] == 1;
            class61.method2736(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field834[--Statics.field4758];
            if (var12 >= 0 && var12 < class61.field785) {
                class61 var13 = Statics.field4280[var12];
                field834[++Statics.field4758 - 1] = var13.field786;
                field834[++Statics.field4758 - 1] = var13.field790;
                field833[++Statics.field836 - 1] = var13.field793;
                field834[++Statics.field4758 - 1] = var13.field794;
                field834[++Statics.field4758 - 1] = var13.field796;
                field833[++Statics.field836 - 1] = var13.field792;
            } else {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
                field834[++Statics.field4758 - 1] = 0;
                field834[++Statics.field4758 - 1] = 0;
                field833[++Statics.field836 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field640 = field834[--Statics.field4758] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field4758 -= 2;
            int var14 = field834[Statics.field4758];
            int var15 = field834[Statics.field4758 + 1];
            class184 var16 = class184.method3143(var15);
            if (var16.method3262()) {
                field833[++Statics.field836 - 1] = class178.method2492(var14).method3175(var15, var16.field2009);
            } else {
                field834[++Statics.field4758 - 1] = class178.method2492(var14).method3181(var15, var16.field2007);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field4758 -= 2;
            int var17 = field834[Statics.field4758];
            int var18 = field834[Statics.field4758 + 1];
            class184 var19 = class184.method3143(var18);
            if (var19.method3262()) {
                field833[++Statics.field836 - 1] = class187.method3000(var17).method3341(var18, var19.field2009);
            } else {
                field834[++Statics.field4758 - 1] = class187.method3000(var17).method3340(var18, var19.field2007);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field4758 -= 2;
            int var20 = field834[Statics.field4758];
            int var21 = field834[Statics.field4758 + 1];
            class184 var22 = class184.method3143(var21);
            if (var22.method3262()) {
                field833[++Statics.field836 - 1] = class188.method3161(var20).method3400(var21, var22.field2009);
            } else {
                field834[++Statics.field4758 - 1] = class188.method3161(var20).method3413(var21, var22.field2007);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field4758 -= 2;
            int var23 = field834[Statics.field4758];
            int var24 = field834[Statics.field4758 + 1];
            class184 var25 = class184.method3143(var24);
            if (var25.method3262()) {
                field833[++Statics.field836 - 1] = class185.method4241(var23).method3270(var24, var25.field2009);
            } else {
                field834[++Statics.field4758 - 1] = class185.method4241(var23).method3269(var24, var25.field2007);
            }
            return 1;
        } else if (arg0 == 6518) {
            field834[++Statics.field4758 - 1] = client.field578 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field834[++Statics.field4758 - 1] = client.field766;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field836--;
            Statics.field4758--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field836--;
            Statics.field4758--;
            return 1;
        } else if (arg0 == 6524) {
            field834[++Statics.field4758 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field834[++Statics.field4758 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field834[++Statics.field4758 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field834[++Statics.field4758 - 1] = client.field485;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nq.ah(ILbi;ZI)I")
    public static int method6156(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1356;
            int var4 = (Statics.field1366.field1137 >> 7) + Statics.field168;
            int var5 = (Statics.field1366.field1131 >> 7) + Statics.field2674;
            client.method5431().method6542(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field834[--Statics.field4758];
            String var7 = "";
            class225 var8 = client.method5431().method6587(var6);
            if (var8 != null) {
                var7 = var8.method4296();
            }
            field833[++Statics.field836 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field834[--Statics.field4758];
            client.method5431().method6543(var9);
            return 1;
        } else if (arg0 == 6603) {
            field834[++Statics.field4758 - 1] = client.method5431().method6557();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field834[--Statics.field4758];
            client.method5431().method6554(var10);
            return 1;
        } else if (arg0 == 6605) {
            field834[++Statics.field4758 - 1] = client.method5431().method6559() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class289 var11 = new class289(field834[--Statics.field4758]);
            client.method5431().method6571(var11.field3328, var11.field3330);
            return 1;
        } else if (arg0 == 6607) {
            class289 var12 = new class289(field834[--Statics.field4758]);
            client.method5431().method6695(var12.field3328, var12.field3330);
            return 1;
        } else if (arg0 == 6608) {
            class289 var13 = new class289(field834[--Statics.field4758]);
            client.method5431().method6534(var13.field3329, var13.field3328, var13.field3330);
            return 1;
        } else if (arg0 == 6609) {
            class289 var14 = new class289(field834[--Statics.field4758]);
            client.method5431().method6564(var14.field3329, var14.field3328, var14.field3330);
            return 1;
        } else if (arg0 == 6610) {
            field834[++Statics.field4758 - 1] = client.method5431().method6694();
            field834[++Statics.field4758 - 1] = client.method5431().method6570();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field834[--Statics.field4758];
            class225 var16 = client.method5431().method6587(var15);
            if (var16 == null) {
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = var16.method4281().method5002();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field834[--Statics.field4758];
            class225 var18 = client.method5431().method6587(var17);
            if (var18 == null) {
                field834[++Statics.field4758 - 1] = 0;
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = (var18.method4292() - var18.method4283() + 1) * 64;
                field834[++Statics.field4758 - 1] = (var18.method4288() - var18.method4287() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field834[--Statics.field4758];
            class225 var20 = client.method5431().method6587(var19);
            if (var20 == null) {
                field834[++Statics.field4758 - 1] = 0;
                field834[++Statics.field4758 - 1] = 0;
                field834[++Statics.field4758 - 1] = 0;
                field834[++Statics.field4758 - 1] = 0;
            } else {
                field834[++Statics.field4758 - 1] = var20.method4283() * 64;
                field834[++Statics.field4758 - 1] = var20.method4287() * 64;
                field834[++Statics.field4758 - 1] = var20.method4292() * 64 + 64 - 1;
                field834[++Statics.field4758 - 1] = var20.method4288() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field834[--Statics.field4758];
            class225 var22 = client.method5431().method6587(var21);
            if (var22 == null) {
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = var22.method4284();
            }
            return 1;
        } else if (arg0 == 6615) {
            class289 var23 = client.method5431().method6562();
            if (var23 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = var23.field3328;
                field834[++Statics.field4758 - 1] = var23.field3330;
            }
            return 1;
        } else if (arg0 == 6616) {
            field834[++Statics.field4758 - 1] = client.method5431().method6544();
            return 1;
        } else if (arg0 == 6617) {
            class289 var24 = new class289(field834[--Statics.field4758]);
            class225 var25 = client.method5431().method6545();
            if (var25 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4276(var24.field3329, var24.field3328, var24.field3330);
            if (var26 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = var26[0];
                field834[++Statics.field4758 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class289 var27 = new class289(field834[--Statics.field4758]);
            class225 var28 = client.method5431().method6545();
            if (var28 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = -1;
                return 1;
            }
            class289 var29 = var28.method4277(var27.field3328, var27.field3330);
            if (var29 == null) {
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = var29.method5002();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field4758 -= 2;
            int var30 = field834[Statics.field4758];
            class289 var31 = new class289(field834[Statics.field4758 + 1]);
            method4725(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field4758 -= 2;
            int var32 = field834[Statics.field4758];
            class289 var33 = new class289(field834[Statics.field4758 + 1]);
            method4725(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field4758 -= 2;
            int var34 = field834[Statics.field4758];
            class289 var35 = new class289(field834[Statics.field4758 + 1]);
            class225 var36 = client.method5431().method6587(var34);
            if (var36 == null) {
                field834[++Statics.field4758 - 1] = 0;
                return 1;
            } else {
                field834[++Statics.field4758 - 1] = var36.method4274(var35.field3329, var35.field3328, var35.field3330) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field834[++Statics.field4758 - 1] = client.method5431().method6568();
            field834[++Statics.field4758 - 1] = client.method5431().method6569();
            return 1;
        } else if (arg0 == 6623) {
            class289 var37 = new class289(field834[--Statics.field4758]);
            class225 var38 = client.method5431().method6541(var37.field3329, var37.field3328, var37.field3330);
            if (var38 == null) {
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = var38.method4279();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method5431().method6703(field834[--Statics.field4758]);
            return 1;
        } else if (arg0 == 6625) {
            client.method5431().method6609();
            return 1;
        } else if (arg0 == 6626) {
            client.method5431().method6572(field834[--Statics.field4758]);
            return 1;
        } else if (arg0 == 6627) {
            client.method5431().method6573();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field834[--Statics.field4758] == 1;
            client.method5431().method6574(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field834[--Statics.field4758];
            client.method5431().method6639(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field834[--Statics.field4758];
            client.method5431().method6625(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method5431().method6576();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field834[--Statics.field4758] == 1;
            client.method5431().method6577(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field4758 -= 2;
            int var43 = field834[Statics.field4758];
            boolean var44 = field834[Statics.field4758 + 1] == 1;
            client.method5431().method6578(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field4758 -= 2;
            int var45 = field834[Statics.field4758];
            boolean var46 = field834[Statics.field4758 + 1] == 1;
            client.method5431().method6579(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field834[++Statics.field4758 - 1] = client.method5431().method6580() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = client.method5431().method6581(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field834[--Statics.field4758];
            field834[++Statics.field4758 - 1] = client.method5431().method6530(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field4758 -= 2;
            int var49 = field834[Statics.field4758];
            class289 var50 = new class289(field834[Statics.field4758 + 1]);
            class289 var51 = client.method5431().method6585(var49, var50);
            if (var51 == null) {
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = var51.method5002();
            }
            return 1;
        } else if (arg0 == 6639) {
            class243 var52 = client.method5431().method6540();
            if (var52 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = var52.method4228();
                field834[++Statics.field4758 - 1] = var52.field2861.method5002();
            }
            return 1;
        } else if (arg0 == 6640) {
            class243 var53 = client.method5431().method6670();
            if (var53 == null) {
                field834[++Statics.field4758 - 1] = -1;
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = var53.method4228();
                field834[++Statics.field4758 - 1] = var53.field2861.method5002();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field834[--Statics.field4758];
            class171 var55 = class171.method6889(var54);
            if (var55.field1830 == null) {
                field833[++Statics.field836 - 1] = "";
            } else {
                field833[++Statics.field836 - 1] = var55.field1830;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field834[--Statics.field4758];
            class171 var57 = class171.method6889(var56);
            field834[++Statics.field4758 - 1] = var57.field1848;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field834[--Statics.field4758];
            class171 var59 = class171.method6889(var58);
            if (var59 == null) {
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = var59.field1850;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field834[--Statics.field4758];
            class171 var61 = class171.method6889(var60);
            if (var61 == null) {
                field834[++Statics.field4758 - 1] = -1;
            } else {
                field834[++Statics.field4758 - 1] = var61.field1832;
            }
            return 1;
        } else if (arg0 == 6697) {
            field834[++Statics.field4758 - 1] = Statics.field119.field2882;
            return 1;
        } else if (arg0 == 6698) {
            field834[++Statics.field4758 - 1] = Statics.field119.field2881.method5002();
            return 1;
        } else if (arg0 == 6699) {
            field834[++Statics.field4758 - 1] = Statics.field119.field2880.method5002();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("u.ai(ILbi;ZI)I")
    public static int method150(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6700 || arg0 == 6702 || arg0 == 6704 || arg0 == 6706 || arg0 == 6708) {
            Statics.field4758 -= 2;
            Statics.field836--;
            return 1;
        } else if (arg0 == 6701 || arg0 == 6703 || arg0 == 6705 || arg0 == 6707 || arg0 == 6709) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 6750) {
            field833[++Statics.field836 - 1] = "";
            return 1;
        } else if (arg0 == 6751 || arg0 == 6752 || arg0 == 6753) {
            field834[++Statics.field4758 - 1] = -1;
            return 1;
        } else if (arg0 == 6754) {
            int var3 = field834[--Statics.field4758];
            class178 var4 = class178.method2492(var3);
            field833[++Statics.field836 - 1] = var4 == null ? "" : var4.field1915;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fl.az(ILbi;ZI)I")
    public static int method3005(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6800) {
            field833[++Statics.field836 - 1] = "";
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            field834[++Statics.field4758 - 1] = -1;
            return 1;
        } else if (arg0 == 6850) {
            field833[++Statics.field836 - 1] = "";
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            field834[++Statics.field4758 - 1] = -1;
            return 1;
        } else if (arg0 == 6853) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ff.av(ILbi;ZI)I")
    public static int method3009(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6900) {
            field833[++Statics.field836 - 1] = "";
            return 1;
        } else if (arg0 == 6950) {
            field834[++Statics.field4758 - 1] = -1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kp.aw(ILbi;ZI)I")
    public static int method4994(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field4758 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field4758 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field4758 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field4758 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field836--;
            Statics.field4758--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field4758 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field4758--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("t.au(ILbi;ZB)I")
    public static int method91(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field4758++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field836 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field4758++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field4758++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field4758++;
            return 1;
        } else if (arg0 == 7108) {
            field834[++Statics.field4758 - 1] = client.method229() ? 1 : 0;
            return 1;
        } else if (arg0 == 7110) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 7120) {
            Statics.field4758--;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 7121) {
            Statics.field4758 -= 2;
            field834[++Statics.field4758 - 1] = -1;
            return 1;
        } else if (arg0 == 7122) {
            Statics.field4758 -= 2;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hv.ay(ILbi;ZI)I")
    public static int method4541(int arg0, class72 arg1, boolean arg2) {
        if (arg0 >= 7200 && arg0 < 7204) {
            Statics.field4758 -= 5;
            field834[++Statics.field4758 - 1] = -1;
            return 1;
        } else if (arg0 == 7204) {
            Statics.field4758 -= 6;
            field834[++Statics.field4758 - 1] = -1;
            return 1;
        } else if (arg0 >= 7205 && arg0 < 7209) {
            field834[Statics.field4758 - 1] = -1;
            return 1;
        } else if (arg0 == 7209) {
            Statics.field4758 -= 2;
            field834[++Statics.field4758 - 1] = -1;
            return 1;
        } else if (arg0 >= 7210 && arg0 < 7214) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 7214) {
            Statics.field4758 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gj.as(ILbi;ZI)I")
    public static int method4006(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7400) {
            Statics.field4758--;
            Statics.field836--;
            return 1;
        } else if (arg0 == 7401) {
            Statics.field4758--;
            Statics.field836--;
            return 1;
        } else if (arg0 == 7402) {
            Statics.field4758 -= 2;
            Statics.field836--;
            return 1;
        } else if (arg0 == 7403) {
            Statics.field4758 -= 2;
            Statics.field836--;
            return 1;
        } else if (arg0 == 7404) {
            Statics.field4758--;
            Statics.field836--;
            return 1;
        } else if (arg0 == 7405) {
            Statics.field4758 -= 2;
            return 1;
        } else if (arg0 == 7406) {
            Statics.field4758--;
            field833[++Statics.field836 - 1] = "";
            return 1;
        } else if (arg0 == 7407) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 7408) {
            Statics.field4758 -= 2;
            Statics.field836--;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 7409) {
            Statics.field4758--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.be(ILbi;ZI)I")
    public static int method542(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field834[--Statics.field4758];
            Object var45 = method2733(var44);
            int var46 = field834[--Statics.field4758];
            class437 var47 = client.method2676(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class439.method2822(var46);
            Statics.field1374 = var47.method6933(var45, var48);
            if (Statics.field1374 == null) {
                client.field589 = -1;
                Statics.field313 = null;
                if (arg0 == 7500) {
                    field834[++Statics.field4758 - 1] = 0;
                }
            } else {
                client.field589 = class439.method4986(var46);
                Statics.field313 = Statics.field1374.iterator();
                if (arg0 == 7500) {
                    field834[++Statics.field4758 - 1] = Statics.field1374.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field313 != null && Statics.field313.hasNext()) {
                field834[++Statics.field4758 - 1] = (Integer) Statics.field313.next();
            } else {
                field834[++Statics.field4758 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field4758 -= 3;
            int var3 = field834[Statics.field4758];
            int var4 = field834[Statics.field4758 + 1];
            int var5 = field834[Statics.field4758 + 2];
            int var6 = class439.method4986(var4);
            int var7 = class439.method2091(var4);
            int var8 = class439.method2822(var4);
            class438 var9 = class438.method6043(var3);
            class436 var10 = class436.method2501(var6);
            int[] var11 = var10.field4669[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method6939(var7);
            if (var14 == null && var10.field4670 != null) {
                var14 = var10.field4670[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class433 var17 = class431.method4951(var16);
                    if (class433.field4658 == var17) {
                        field833[++Statics.field836 - 1] = "";
                    } else {
                        field834[++Statics.field4758 - 1] = class431.method1980(var16);
                    }
                }
                return 1;
            }
            int var18 = var14.length / var11.length;
            if (var5 < 0 || var5 >= var18) {
                throw new RuntimeException();
            }
            for (int var19 = var12; var19 < var13; var19++) {
                int var20 = var11.length * var5 + var19;
                class433 var21 = class431.method4951(var11[var19]);
                if (class433.field4658 == var21) {
                    field833[++Statics.field836 - 1] = (String) var14[var20];
                } else {
                    field834[++Statics.field4758 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field4758 -= 2;
            int var22 = field834[Statics.field4758];
            int var23 = field834[Statics.field4758 + 1];
            int var24 = 0;
            int var25 = class439.method4986(var23);
            int var26 = class439.method2091(var23);
            class438 var27 = class438.method6043(var22);
            class436 var28 = class436.method2501(var25);
            int[] var29 = var28.field4669[var26];
            Object[] var30 = var27.method6939(var26);
            if (var30 == null && var28.field4670 != null) {
                var30 = var28.field4670[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field834[++Statics.field4758 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7509) {
            Statics.field4758--;
            int var41 = field834[Statics.field4758];
            class437 var42 = client.method4575(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field1374 = var42.method6933(0, 0);
            int var43 = 0;
            if (Statics.field1374 != null) {
                client.field589 = var41;
                Statics.field313 = Statics.field1374.iterator();
                var43 = Statics.field1374.size();
            }
            if (arg0 == 7504) {
                field834[++Statics.field4758 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field834[--Statics.field4758];
            class438 var32 = class438.method6043(var31);
            field834[++Statics.field4758 - 1] = var32.field4679;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field834[--Statics.field4758];
            int var34 = -1;
            if (Statics.field1374 != null && var33 >= 0 && var33 < Statics.field1374.size()) {
                var34 = (Integer) Statics.field1374.get(var33);
            }
            field834[++Statics.field4758 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7510) {
            int var35 = field834[--Statics.field4758];
            Object var36 = method2733(var35);
            int var37 = field834[--Statics.field4758];
            class437 var38 = client.method2676(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class439.method4986(var37) != client.field589) {
                throw new RuntimeException();
            } else if (Statics.field1374 == null && Statics.field1374.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class439.method2822(var37);
                List var40 = var38.method6933(var36, var39);
                Statics.field1374 = new LinkedList(Statics.field1374);
                if (var40 == null) {
                    Statics.field1374.clear();
                } else {
                    Statics.field1374.retainAll(var40);
                }
                Statics.field313 = Statics.field1374.iterator();
                if (arg0 == 7507) {
                    field834[++Statics.field4758 - 1] = Statics.field1374.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dr.bz(ILbi;ZB)I")
    public static int method2465(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7600) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 7601) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 7602) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 7603) {
            Statics.field4758--;
            field833[++Statics.field836 - 1] = "";
            return 1;
        } else if (arg0 == 7604) {
            Statics.field836--;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 7605) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 7606) {
            Statics.field4758 -= 2;
            field834[++Statics.field4758 - 1] = 0;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 7607) {
            return 1;
        } else if (arg0 == 7608) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 7609) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 7610) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 7611) {
            Statics.field4758--;
            return 1;
        } else if (arg0 == 7612) {
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else if (arg0 == 7613) {
            Statics.field4758--;
            field833[++Statics.field836 - 1] = "";
            return 1;
        } else if (arg0 == 7614) {
            return 1;
        } else if (arg0 == 7615) {
            Statics.field836--;
            return 1;
        } else if (arg0 == 7616) {
            Statics.field836--;
            Statics.field4758 -= 2;
            return 1;
        } else if (arg0 == 7617) {
            Statics.field836--;
            field834[++Statics.field4758 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hq.bp(IB)V")
    public static void method4222(int arg0) {
        if (arg0 == -1 || !class294.method4251(arg0)) {
            return;
        }
        class294[] var1 = Statics.field324[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class294 var3 = var1[var2];
            if (var3.field3461 != null) {
                class81 var4 = new class81();
                var4.field1048 = var3;
                var4.field1056 = var3.field3461;
                method2727(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("jn.bf(ILkd;ZI)V")
    public static void method4725(int arg0, class289 arg1, boolean arg2) {
        class225 var3 = client.method5431().method6587(arg0);
        int var4 = Statics.field1366.field1107;
        int var5 = (Statics.field1366.field1137 >> 7) + Statics.field168;
        int var6 = (Statics.field1366.field1131 >> 7) + Statics.field2674;
        class289 var7 = new class289(var4, var5, var6);
        client.method5431().method6642(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("eo.br(II)Ljava/lang/Object;")
    public static Object method2733(int arg0) {
        return Statics.method3041((class433) class329.method2087(class433.method6888(), arg0));
    }
}
