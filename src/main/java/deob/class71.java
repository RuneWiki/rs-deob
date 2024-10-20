package deob;

import java.util.Calendar;

@ObfuscatedName("bj")
public class class71 {

    @ObfuscatedName("bj.e")
    public static int[] field1055 = new int[5];

    @ObfuscatedName("bj.a")
    public static int[][] field1060 = new int[5][5000];

    @ObfuscatedName("bj.c")
    public static int[] field1052 = new int[1000];

    @ObfuscatedName("bj.r")
    public static String[] field1053 = new String[1000];

    @ObfuscatedName("bj.d")
    public static int field1054 = 0;

    @ObfuscatedName("bj.z")
    public static class52[] field1047 = new class52[50];

    @ObfuscatedName("bj.g")
    public static Calendar field1056 = Calendar.getInstance();

    @ObfuscatedName("bj.j")
    public static final String[] field1057 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bj.u")
    public static boolean field1058 = false;

    @ObfuscatedName("bj.t")
    public static boolean field1059 = false;

    @ObfuscatedName("bj.n")
    public static int field1049 = 0;

    @ObfuscatedName("bj.k")
    public static final double field1061 = Math.log(2.0D);

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kp.f(Lbs;B)V")
    public static void method5372(class58 arg0) {
        method2143(arg0, 500000);
    }

    @ObfuscatedName("ct.l(Lbs;IB)V")
    public static void method2143(class58 arg0, int arg1) {
        Object[] var2 = arg0.field569;
        class87 var4;
        if (class300.method956(arg0.field572)) {
            Statics.field497 = (class37) var2[0];
            class258 var3 = class258.method3139(Statics.field497.field341);
            var4 = class87.method3169(arg0.field572, var3.field3320, var3.field3322);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class87.method506(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field292 = 0;
        Statics.field476 = 0;
        int var6 = -1;
        int[] var7 = var4.field1255;
        int[] var8 = var4.field1247;
        byte var9 = -1;
        field1054 = 0;
        field1058 = false;
        try {
            Statics.field1051 = new int[var4.field1249];
            int var10 = 0;
            Statics.field54 = new String[var4.field1258];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field568;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field565;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field563 == null ? -1 : arg0.field563.field2731;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field566;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field563 == null ? -1 : arg0.field563.field2730;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field571 == null ? -1 : arg0.field571.field2731;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field571 == null ? -1 : arg0.field571.field2730;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field564;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field575;
                    }
                    Statics.field1051[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field570;
                    }
                    Statics.field54[var11++] = var14;
                }
            }
            int var15 = 0;
            field1049 = arg0.field573;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var52 = var7[var6];
                if (var52 >= 100) {
                    boolean var42;
                    if (var4.field1247[var6] == 1) {
                        var42 = true;
                    } else {
                        var42 = false;
                    }
                    int var43 = method615(var52, var4, var42);
                    switch(var43) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var52 == 0) {
                    field1052[++Statics.field292 - 1] = var8[var6];
                } else if (var52 == 1) {
                    int var16 = var8[var6];
                    field1052[++Statics.field292 - 1] = class228.field2628[var16];
                } else if (var52 == 2) {
                    int var17 = var8[var6];
                    class228.field2628[var17] = field1052[--Statics.field292];
                    client.method290(var17);
                } else if (var52 == 3) {
                    field1053[++Statics.field476 - 1] = var4.field1248[var6];
                } else if (var52 == 6) {
                    var6 += var8[var6];
                } else if (var52 == 7) {
                    Statics.field292 -= 2;
                    if (field1052[Statics.field292] != field1052[Statics.field292 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var52 == 8) {
                    Statics.field292 -= 2;
                    if (field1052[Statics.field292] == field1052[Statics.field292 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var52 == 9) {
                    Statics.field292 -= 2;
                    if (field1052[Statics.field292] < field1052[Statics.field292 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var52 == 10) {
                    Statics.field292 -= 2;
                    if (field1052[Statics.field292] > field1052[Statics.field292 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var52 == 21) {
                    if (field1054 == 0) {
                        return;
                    }
                    class52 var18 = field1047[--field1054];
                    var4 = var18.field501;
                    var7 = var4.field1255;
                    var8 = var4.field1247;
                    var6 = var18.field499;
                    Statics.field1051 = var18.field500;
                    Statics.field54 = var18.field498;
                } else if (var52 == 25) {
                    int var19 = var8[var6];
                    field1052[++Statics.field292 - 1] = class228.method2155(var19);
                } else if (var52 == 27) {
                    int var20 = var8[var6];
                    Statics.method190(var20, field1052[--Statics.field292]);
                } else if (var52 == 31) {
                    Statics.field292 -= 2;
                    if (field1052[Statics.field292] <= field1052[Statics.field292 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var52 == 32) {
                    Statics.field292 -= 2;
                    if (field1052[Statics.field292] >= field1052[Statics.field292 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var52 == 33) {
                    field1052[++Statics.field292 - 1] = Statics.field1051[var8[var6]];
                } else if (var52 == 34) {
                    Statics.field1051[var8[var6]] = field1052[--Statics.field292];
                } else if (var52 == 35) {
                    field1053[++Statics.field476 - 1] = Statics.field54[var8[var6]];
                } else if (var52 == 36) {
                    Statics.field54[var8[var6]] = field1053[--Statics.field476];
                } else if (var52 == 37) {
                    int var21 = var8[var6];
                    Statics.field476 -= var21;
                    String var22 = class308.method2433(field1053, Statics.field476, var21);
                    field1053[++Statics.field476 - 1] = var22;
                } else if (var52 == 38) {
                    Statics.field292--;
                } else if (var52 == 39) {
                    Statics.field476--;
                } else if (var52 == 40) {
                    int var23 = var8[var6];
                    class87 var24 = class87.method506(var23);
                    int[] var25 = new int[var24.field1249];
                    String[] var26 = new String[var24.field1258];
                    for (int var27 = 0; var27 < var24.field1251; var27++) {
                        var25[var27] = field1052[Statics.field292 - var24.field1251 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1250; var28++) {
                        var26[var28] = field1053[Statics.field476 - var24.field1250 + var28];
                    }
                    Statics.field292 -= var24.field1251;
                    Statics.field476 -= var24.field1250;
                    class52 var29 = new class52();
                    var29.field501 = var4;
                    var29.field499 = var6;
                    var29.field500 = Statics.field1051;
                    var29.field498 = Statics.field54;
                    field1047[++field1054 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1255;
                    var8 = var24.field1247;
                    var6 = -1;
                    Statics.field1051 = var25;
                    Statics.field54 = var26;
                } else if (var52 == 42) {
                    field1052[++Statics.field292 - 1] = Statics.field594.method1864(var8[var6]);
                } else if (var52 == 43) {
                    Statics.field594.method1863(var8[var6], field1052[--Statics.field292]);
                } else if (var52 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1052[--Statics.field292];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1055[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1060[var30][var34] = var33;
                    }
                } else if (var52 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1052[--Statics.field292];
                    if (var36 < 0 || var36 >= field1055[var35]) {
                        throw new RuntimeException();
                    }
                    field1052[++Statics.field292 - 1] = field1060[var35][var36];
                } else if (var52 == 46) {
                    int var37 = var8[var6];
                    Statics.field292 -= 2;
                    int var38 = field1052[Statics.field292];
                    if (var38 < 0 || var38 >= field1055[var37]) {
                        throw new RuntimeException();
                    }
                    field1060[var37][var38] = field1052[Statics.field292 + 1];
                } else if (var52 == 47) {
                    String var39 = Statics.field594.method1889(var8[var6]);
                    if (var39 == null) {
                        var39 = class240.field2865;
                    }
                    field1053[++Statics.field476 - 1] = var39;
                } else if (var52 == 48) {
                    Statics.field594.method1865(var8[var6], field1053[--Statics.field476]);
                } else if (var52 == 60) {
                    class200 var40 = var4.field1253[var8[var6]];
                    class214 var41 = (class214) var40.method3706((long) field1052[--Statics.field292]);
                    if (var41 != null) {
                        var6 += var41.field2512;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var50) {
            StringBuilder var45 = new StringBuilder(30);
            var45.append("").append(var4.field2497).append(" ");
            for (int var46 = field1054 - 1; var46 >= 0; var46--) {
                var45.append("").append(field1047[var46].field501.field2497).append(" ");
            }
            var45.append("").append(var9);
            class155.method2919(var45.toString(), var50);
        } finally {
            if (field1058) {
                field1059 = true;
                client.method3133();
                field1059 = false;
                field1058 = false;
            }
        }
    }

    @ObfuscatedName("ad.w(ILcz;ZI)I")
    public static int method615(int arg0, class87 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method1564(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method3308(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method973(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method559(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method2721(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method1484(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method114(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method1734(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method1640(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method608(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method977(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method3308(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method973(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method559(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method2721(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method1484(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method992(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method3647(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method176(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return Statics.method3574(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method977(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method79(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2121(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method3595(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method4039(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method4484(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method1083(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method4844(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return Statics.method1000(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method1486(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method4285(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method991(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method2515(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method269(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method431(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method1524(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method5103(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bk.s(ILcz;ZI)I")
    public static int method1564(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field292 -= 3;
            int var3 = field1052[Statics.field292];
            int var4 = field1052[Statics.field292 + 1];
            int var5 = field1052[Statics.field292 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class233 var6 = class233.method1754(var3);
            if (var6.field2798 == null) {
                var6.field2798 = new class233[var5 + 1];
            }
            if (var6.field2798.length <= var5) {
                class233[] var7 = new class233[var5 + 1];
                for (int var8 = 0; var8 < var6.field2798.length; var8++) {
                    var7[var8] = var6.field2798[var8];
                }
                var6.field2798 = var7;
            }
            if (var5 > 0 && var6.field2798[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class233 var9 = new class233();
            var9.field2670 = var4;
            var9.field2687 = var9.field2731 = var6.field2731;
            var9.field2730 = var5;
            var9.field2667 = true;
            var6.field2798[var5] = var9;
            if (arg2) {
                Statics.field2106 = var9;
            } else {
                Statics.field3782 = var9;
            }
            client.method272(var6);
            return 1;
        } else if (arg0 == 101) {
            class233 var10 = arg2 ? Statics.field2106 : Statics.field3782;
            class233 var11 = class233.method1754(var10.field2731);
            var11.field2798[var10.field2730] = null;
            client.method272(var11);
            return 1;
        } else if (arg0 == 102) {
            class233 var12 = class233.method1754(field1052[--Statics.field292]);
            var12.field2798 = null;
            client.method272(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field292 -= 2;
            int var13 = field1052[Statics.field292];
            int var14 = field1052[Statics.field292 + 1];
            class233 var15 = class233.method434(var13, var14);
            if (var15 == null || var14 == -1) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = 1;
                if (arg2) {
                    Statics.field2106 = var15;
                } else {
                    Statics.field3782 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class233 var16 = class233.method1754(field1052[--Statics.field292]);
            if (var16 == null) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = 1;
                if (arg2) {
                    Statics.field2106 = var16;
                } else {
                    Statics.field3782 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fa.e(ILcz;ZI)I")
    public static int method3308(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1052[--Statics.field292];
            var4 = class233.method1754(var3);
        } else {
            var4 = arg2 ? Statics.field2106 : Statics.field3782;
        }
        if (arg0 == 1000) {
            Statics.field292 -= 4;
            var4.field2735 = field1052[Statics.field292];
            var4.field2678 = field1052[Statics.field292 + 1];
            var4.field2695 = field1052[Statics.field292 + 2];
            var4.field2669 = field1052[Statics.field292 + 3];
            client.method272(var4);
            Statics.field1133.method1443(var4);
            if (var3 != -1 && var4.field2670 == 0) {
                client.method1742(Statics.field2657[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field292 -= 4;
            var4.field2679 = field1052[Statics.field292];
            var4.field2680 = field1052[Statics.field292 + 1];
            var4.field2675 = field1052[Statics.field292 + 2];
            var4.field2802 = field1052[Statics.field292 + 3];
            client.method272(var4);
            Statics.field1133.method1443(var4);
            if (var3 != -1 && var4.field2670 == 0) {
                client.method1742(Statics.field2657[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1052[--Statics.field292] == 1;
            if (var4.field2693 != var5) {
                var4.field2693 = var5;
                client.method272(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2808 = field1052[--Statics.field292] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2809 = field1052[--Statics.field292] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bf.c(ILcz;ZI)I")
    public static int method973(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1052[--Statics.field292];
            var4 = class233.method1754(var3);
        } else {
            var4 = arg2 ? Statics.field2106 : Statics.field3782;
        }
        if (arg0 == 1100) {
            Statics.field292 -= 2;
            var4.field2689 = field1052[Statics.field292];
            if (var4.field2689 > var4.field2691 - var4.field2683) {
                var4.field2689 = var4.field2691 - var4.field2683;
            }
            if (var4.field2689 < 0) {
                var4.field2689 = 0;
            }
            var4.field2690 = field1052[Statics.field292 + 1];
            if (var4.field2690 > var4.field2692 - var4.field2684) {
                var4.field2690 = var4.field2692 - var4.field2684;
            }
            if (var4.field2690 < 0) {
                var4.field2690 = 0;
            }
            client.method272(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2743 = field1052[--Statics.field292];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2697 = field1052[--Statics.field292] == 1;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2762 = field1052[--Statics.field292];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2701 = field1052[--Statics.field292];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2703 = field1052[--Statics.field292];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2702 = field1052[--Statics.field292];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2747 = field1052[--Statics.field292] == 1;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2676 = 1;
            var4.field2712 = field1052[--Statics.field292];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field292 -= 6;
            var4.field2717 = field1052[Statics.field292];
            var4.field2718 = field1052[Statics.field292 + 1];
            var4.field2797 = field1052[Statics.field292 + 2];
            var4.field2720 = field1052[Statics.field292 + 3];
            var4.field2781 = field1052[Statics.field292 + 4];
            var4.field2722 = field1052[Statics.field292 + 5];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1052[--Statics.field292];
            if (var4.field2715 != var5) {
                var4.field2715 = var5;
                var4.field2796 = 0;
                var4.field2773 = 0;
                client.method272(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2725 = field1052[--Statics.field292] == 1;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1053[--Statics.field476];
            if (!var6.equals(var4.field2729)) {
                var4.field2729 = var6;
                client.method272(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2752 = field1052[--Statics.field292];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field292 -= 3;
            var4.field2711 = field1052[Statics.field292];
            var4.field2733 = field1052[Statics.field292 + 1];
            var4.field2707 = field1052[Statics.field292 + 2];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2734 = field1052[--Statics.field292] == 1;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2704 = field1052[--Statics.field292];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2708 = field1052[--Statics.field292];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2709 = field1052[--Statics.field292] == 1;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2710 = field1052[--Statics.field292] == 1;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field292 -= 2;
            var4.field2691 = field1052[Statics.field292];
            var4.field2692 = field1052[Statics.field292 + 1];
            client.method272(var4);
            if (var3 != -1 && var4.field2670 == 0) {
                client.method1742(Statics.field2657[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method903(var4.field2731, var4.field2730);
            client.field796 = var4;
            client.method272(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2750 = field1052[--Statics.field292];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2694 = field1052[--Statics.field292];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2668 = field1052[--Statics.field292];
            client.method272(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1052[--Statics.field292];
            class322 var8 = (class322) Statics.method1912(class322.method3144(), var7);
            if (var8 != null) {
                var4.field2698 = var8;
                client.method272(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1052[--Statics.field292] == 1;
            var4.field2728 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1052[--Statics.field292] == 1;
            var4.field2726 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.p(ILcz;ZI)I")
    public static int method559(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method1754(field1052[--Statics.field292]);
        } else {
            var3 = arg2 ? Statics.field2106 : Statics.field3782;
        }
        client.method272(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field292 -= 2;
            int var4 = field1052[Statics.field292];
            int var5 = field1052[Statics.field292 + 1];
            var3.field2786 = var4;
            var3.field2795 = var5;
            class272 var6 = class272.method92(var4);
            var3.field2797 = var6.field3536;
            var3.field2720 = var6.field3522;
            var3.field2781 = var6.field3516;
            var3.field2717 = var6.field3503;
            var3.field2718 = var6.field3515;
            var3.field2722 = var6.field3513;
            if (arg0 == 1205) {
                var3.field2727 = 0;
            } else if (arg0 == 1212 | var6.field3512 == 1) {
                var3.field2727 = 1;
            } else {
                var3.field2727 = 2;
            }
            if (var3.field2723 > 0) {
                var3.field2722 = var3.field2722 * 32 / var3.field2723;
            } else if (var3.field2679 > 0) {
                var3.field2722 = var3.field2722 * 32 / var3.field2679;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2676 = 2;
            var3.field2712 = field1052[--Statics.field292];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2676 = 3;
            var3.field2712 = Statics.field138.field596.method4169();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dk.r(ILcz;ZI)I")
    public static int method2721(int arg0, class87 arg1, boolean arg2) {
        boolean var3 = true;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class233.method1754(field1052[--Statics.field292]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field2106 : Statics.field3782;
        }
        if (arg0 == 1300) {
            int var5 = field1052[--Statics.field292] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4210(var5, field1053[--Statics.field476]);
                return 1;
            } else {
                Statics.field476--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field292 -= 2;
            int var6 = field1052[Statics.field292];
            int var7 = field1052[Statics.field292 + 1];
            var4.field2749 = class233.method434(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2756 = field1052[--Statics.field292] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2780 = field1052[--Statics.field292];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2751 = field1052[--Statics.field292];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2793 = field1053[--Statics.field476];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2757 = field1053[--Statics.field476];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2740 = null;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field292 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1052[Statics.field292 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1052[Statics.field292 + var10];
                        var9[var10 / 2] = (byte) field1052[Statics.field292 + var10 + 1];
                    }
                }
            } else {
                Statics.field292 -= 2;
                var8 = new byte[] { (byte) field1052[Statics.field292] };
                var9 = new byte[] { (byte) field1052[Statics.field292 + 1] };
            }
            int var11 = field1052[--Statics.field292] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            Statics.method976(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field292 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1052[Statics.field292] };
            byte[] var14 = new byte[] { (byte) field1052[Statics.field292 + 1] };
            Statics.method976(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field292 -= 3;
            int var15 = field1052[Statics.field292] - 1;
            int var16 = field1052[Statics.field292 + 1];
            int var17 = field1052[Statics.field292 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            Statics.method4939(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1052[--Statics.field292];
            int var20 = field1052[--Statics.field292];
            Statics.method4939(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field292--;
            int var21 = field1052[Statics.field292] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method2959(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method2959(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ec.z(Lhw;II)V")
    public static final void method2959(class233 arg0, int arg1) {
        if (arg0.field2653 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2681 == null) {
            arg0.field2681 = new int[arg0.field2653.length];
        }
        arg0.field2681[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("client.x(ILcz;ZI)I")
    public static int method1484(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method1754(field1052[--Statics.field292]);
        } else {
            var3 = arg2 ? Statics.field2106 : Statics.field3782;
        }
        String var4 = field1053[--Statics.field476];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1052[--Statics.field292];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1052[--Statics.field292];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1053[--Statics.field476];
            } else {
                var7[var8] = Integer.valueOf(field1052[--Statics.field292]);
            }
        }
        int var9 = field1052[--Statics.field292];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2753 = var7;
        } else if (arg0 == 1401) {
            var3.field2759 = var7;
        } else if (arg0 == 1402) {
            var3.field2666 = var7;
        } else if (arg0 == 1403) {
            var3.field2760 = var7;
        } else if (arg0 == 1404) {
            var3.field2758 = var7;
        } else if (arg0 == 1405) {
            var3.field2763 = var7;
        } else if (arg0 == 1406) {
            var3.field2766 = var7;
        } else if (arg0 == 1407) {
            var3.field2767 = var7;
            var3.field2768 = var5;
        } else if (arg0 == 1408) {
            var3.field2794 = var7;
        } else if (arg0 == 1409) {
            var3.field2774 = var7;
        } else if (arg0 == 1410) {
            var3.field2764 = var7;
        } else if (arg0 == 1411) {
            var3.field2778 = var7;
        } else if (arg0 == 1412) {
            var3.field2732 = var7;
        } else if (arg0 == 1414) {
            var3.field2769 = var7;
            var3.field2770 = var5;
        } else if (arg0 == 1415) {
            var3.field2771 = var7;
            var3.field2748 = var5;
        } else if (arg0 == 1416) {
            var3.field2790 = var7;
        } else if (arg0 == 1417) {
            var3.field2775 = var7;
        } else if (arg0 == 1418) {
            var3.field2776 = var7;
        } else if (arg0 == 1419) {
            var3.field2699 = var7;
        } else if (arg0 == 1420) {
            var3.field2713 = var7;
        } else if (arg0 == 1421) {
            var3.field2700 = var7;
        } else if (arg0 == 1422) {
            var3.field2761 = var7;
        } else if (arg0 == 1423) {
            var3.field2719 = var7;
        } else if (arg0 == 1424) {
            var3.field2782 = var7;
        } else if (arg0 == 1425) {
            var3.field2784 = var7;
        } else if (arg0 == 1426) {
            var3.field2785 = var7;
        } else if (arg0 == 1427) {
            var3.field2783 = var7;
        } else {
            return 2;
        }
        var3.field2754 = true;
        return 1;
    }

    @ObfuscatedName("x.v(ILcz;ZI)I")
    public static int method114(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field2106 : Statics.field3782;
        if (arg0 == 1500) {
            field1052[++Statics.field292 - 1] = var3.field2744;
            return 1;
        } else if (arg0 == 1501) {
            field1052[++Statics.field292 - 1] = var3.field2682;
            return 1;
        } else if (arg0 == 1502) {
            field1052[++Statics.field292 - 1] = var3.field2683;
            return 1;
        } else if (arg0 == 1503) {
            field1052[++Statics.field292 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 1504) {
            field1052[++Statics.field292 - 1] = var3.field2693 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1052[++Statics.field292 - 1] = var3.field2687;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bj.g(ILcz;ZI)I")
    public static int method1734(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field2106 : Statics.field3782;
        if (arg0 == 1600) {
            field1052[++Statics.field292 - 1] = var3.field2689;
            return 1;
        } else if (arg0 == 1601) {
            field1052[++Statics.field292 - 1] = var3.field2690;
            return 1;
        } else if (arg0 == 1602) {
            field1053[++Statics.field476 - 1] = var3.field2729;
            return 1;
        } else if (arg0 == 1603) {
            field1052[++Statics.field292 - 1] = var3.field2691;
            return 1;
        } else if (arg0 == 1604) {
            field1052[++Statics.field292 - 1] = var3.field2692;
            return 1;
        } else if (arg0 == 1605) {
            field1052[++Statics.field292 - 1] = var3.field2722;
            return 1;
        } else if (arg0 == 1606) {
            field1052[++Statics.field292 - 1] = var3.field2797;
            return 1;
        } else if (arg0 == 1607) {
            field1052[++Statics.field292 - 1] = var3.field2781;
            return 1;
        } else if (arg0 == 1608) {
            field1052[++Statics.field292 - 1] = var3.field2720;
            return 1;
        } else if (arg0 == 1609) {
            field1052[++Statics.field292 - 1] = var3.field2762;
            return 1;
        } else if (arg0 == 1610) {
            field1052[++Statics.field292 - 1] = var3.field2668;
            return 1;
        } else if (arg0 == 1611) {
            field1052[++Statics.field292 - 1] = var3.field2743;
            return 1;
        } else if (arg0 == 1612) {
            field1052[++Statics.field292 - 1] = var3.field2694;
            return 1;
        } else if (arg0 == 1613) {
            field1052[++Statics.field292 - 1] = var3.field2698.method148();
            return 1;
        } else if (arg0 == 1614) {
            field1052[++Statics.field292 - 1] = var3.field2726 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bb.u(ILcz;ZI)I")
    public static int method1640(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field2106 : Statics.field3782;
        if (arg0 == 1700) {
            field1052[++Statics.field292 - 1] = var3.field2786;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2786 == -1) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = var3.field2795;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1052[++Statics.field292 - 1] = var3.field2730;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("al.o(ILcz;ZB)I")
    public static int method608(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field2106 : Statics.field3782;
        if (arg0 == 1800) {
            field1052[++Statics.field292 - 1] = class234.method4384(client.method2995(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1052[--Statics.field292];
            int var5 = var4 - 1;
            if (var3.field2740 == null || var5 >= var3.field2740.length || var3.field2740[var5] == null) {
                field1053[++Statics.field476 - 1] = "";
            } else {
                field1053[++Statics.field476 - 1] = var3.field2740[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2793 == null) {
                field1053[++Statics.field476 - 1] = "";
            } else {
                field1053[++Statics.field476 - 1] = var3.field2793;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.i(ILcz;ZI)I")
    public static int method977(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method1754(field1052[--Statics.field292]);
        } else {
            var3 = arg2 ? Statics.field2106 : Statics.field3782;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1049 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2783 == null) {
            return 0;
        } else {
            class58 var4 = new class58();
            var4.field563 = var3;
            var4.field569 = var3.field2783;
            var4.field573 = field1049 + 1;
            client.field709.method3823(var4);
            return 1;
        }
    }

    @ObfuscatedName("bs.k(ILcz;ZI)I")
    public static int method992(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method1754(field1052[--Statics.field292]);
        if (arg0 == 2500) {
            field1052[++Statics.field292 - 1] = var3.field2744;
            return 1;
        } else if (arg0 == 2501) {
            field1052[++Statics.field292 - 1] = var3.field2682;
            return 1;
        } else if (arg0 == 2502) {
            field1052[++Statics.field292 - 1] = var3.field2683;
            return 1;
        } else if (arg0 == 2503) {
            field1052[++Statics.field292 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 2504) {
            field1052[++Statics.field292 - 1] = var3.field2693 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1052[++Statics.field292 - 1] = var3.field2687;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gj.q(ILcz;ZI)I")
    public static int method3647(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method1754(field1052[--Statics.field292]);
        if (arg0 == 2600) {
            field1052[++Statics.field292 - 1] = var3.field2689;
            return 1;
        } else if (arg0 == 2601) {
            field1052[++Statics.field292 - 1] = var3.field2690;
            return 1;
        } else if (arg0 == 2602) {
            field1053[++Statics.field476 - 1] = var3.field2729;
            return 1;
        } else if (arg0 == 2603) {
            field1052[++Statics.field292 - 1] = var3.field2691;
            return 1;
        } else if (arg0 == 2604) {
            field1052[++Statics.field292 - 1] = var3.field2692;
            return 1;
        } else if (arg0 == 2605) {
            field1052[++Statics.field292 - 1] = var3.field2722;
            return 1;
        } else if (arg0 == 2606) {
            field1052[++Statics.field292 - 1] = var3.field2797;
            return 1;
        } else if (arg0 == 2607) {
            field1052[++Statics.field292 - 1] = var3.field2781;
            return 1;
        } else if (arg0 == 2608) {
            field1052[++Statics.field292 - 1] = var3.field2720;
            return 1;
        } else if (arg0 == 2609) {
            field1052[++Statics.field292 - 1] = var3.field2762;
            return 1;
        } else if (arg0 == 2610) {
            field1052[++Statics.field292 - 1] = var3.field2668;
            return 1;
        } else if (arg0 == 2611) {
            field1052[++Statics.field292 - 1] = var3.field2743;
            return 1;
        } else if (arg0 == 2612) {
            field1052[++Statics.field292 - 1] = var3.field2694;
            return 1;
        } else if (arg0 == 2613) {
            field1052[++Statics.field292 - 1] = var3.field2698.method148();
            return 1;
        } else if (arg0 == 2614) {
            field1052[++Statics.field292 - 1] = var3.field2726 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("u.y(ILcz;ZS)I")
    public static int method176(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class233 var3 = class233.method1754(field1052[--Statics.field292]);
            field1052[++Statics.field292 - 1] = var3.field2786;
            return 1;
        } else if (arg0 == 2701) {
            class233 var4 = class233.method1754(field1052[--Statics.field292]);
            if (var4.field2786 == -1) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = var4.field2795;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1052[--Statics.field292];
            class57 var6 = (class57) client.field889.method3774((long) var5);
            if (var6 == null) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1052[++Statics.field292 - 1] = client.field790;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.ag(ILcz;ZI)I")
    public static int method79(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1053[--Statics.field476];
            class86.method3230(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field292 -= 2;
            client.method7(Statics.field138, field1052[Statics.field292], field1052[Statics.field292 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1059) {
                field1058 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1053[--Statics.field476];
            int var5 = 0;
            if (class308.method3921(var4)) {
                var5 = class308.method1769(var4);
            }
            class175 var6 = class175.method85(class172.field2225, client.field861.field1287);
            var6.field2335.method3422(var5);
            client.field861.method1944(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1053[--Statics.field476];
            class175 var8 = class175.method85(class172.field2303, client.field861.field1287);
            var8.field2335.method3376(var7.length() + 1);
            var8.field2335.method3446(var7);
            client.field861.method1944(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1053[--Statics.field476];
            class175 var10 = class175.method85(class172.field2240, client.field861.field1287);
            var10.field2335.method3376(var9.length() + 1);
            var10.field2335.method3446(var9);
            client.field861.method1944(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1052[--Statics.field292];
            String var12 = field1053[--Statics.field476];
            Statics.method1743(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field292 -= 3;
            int var13 = field1052[Statics.field292];
            int var14 = field1052[Statics.field292 + 1];
            int var15 = field1052[Statics.field292 + 2];
            class233 var16 = class233.method1754(var15);
            client.method2405(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field292 -= 2;
            int var17 = field1052[Statics.field292];
            int var18 = field1052[Statics.field292 + 1];
            class233 var19 = arg2 ? Statics.field2106 : Statics.field3782;
            client.method2405(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field43 = field1052[--Statics.field292] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1052[++Statics.field292 - 1] = Statics.field141.field1015 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field141.field1015 = field1052[--Statics.field292] == 1;
            class68.method614();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1053[--Statics.field476];
            boolean var21 = field1052[--Statics.field292] == 1;
            class46.method5698(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1052[--Statics.field292];
            class175 var23 = class175.method85(class172.field2250, client.field861.field1287);
            var23.field2335.method3330(var22);
            client.field861.method1944(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1052[--Statics.field292];
            Statics.field476 -= 2;
            String var25 = field1053[Statics.field476];
            String var26 = field1053[Statics.field476 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class175 var27 = class175.method85(class172.field2236, client.field861.field1287);
                var27.field2335.method3330(1 + class185.method3075(var25) + class185.method3075(var26));
                var27.field2335.method3446(var25);
                var27.field2335.method3376(var24);
                var27.field2335.method3446(var26);
                client.field861.method1944(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field776 = field1052[--Statics.field292] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field778 = field1052[--Statics.field292] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field749 = field1052[--Statics.field292] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1052[--Statics.field292] == 1) {
                client.field860 |= 0x1;
            } else {
                client.field860 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1052[--Statics.field292] == 1) {
                client.field860 |= 0x2;
            } else {
                client.field860 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1052[--Statics.field292] == 1) {
                client.field860 |= 0x4;
            } else {
                client.field860 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1052[--Statics.field292] == 1) {
                client.field860 |= 0x8;
            } else {
                client.field860 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field860 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field735 = field1052[--Statics.field292] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field745 = field1052[--Statics.field292] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method463(field1052[--Statics.field292] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1052[++Statics.field292 - 1] = client.method76() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field292 -= 2;
            client.field710 = field1052[Statics.field292];
            client.field711 = field1052[Statics.field292 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field292 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field292--;
            return 1;
        } else if (arg0 == 3132) {
            field1052[++Statics.field292 - 1] = Statics.field2652;
            field1052[++Statics.field292 - 1] = Statics.field253;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field292--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field292 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field813 = 3;
            client.field793 = field1052[--Statics.field292];
            return 1;
        } else if (arg0 == 3137) {
            client.field813 = 2;
            client.field793 = field1052[--Statics.field292];
            return 1;
        } else if (arg0 == 3138) {
            client.field813 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field813 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field813 = 3;
            client.field793 = arg2 ? Statics.field2106.field2731 : Statics.field3782.field2731;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1052[--Statics.field292] == 1;
            Statics.field141.field1022 = var28;
            class68.method614();
            return 1;
        } else if (arg0 == 3142) {
            field1052[++Statics.field292 - 1] = Statics.field141.field1022 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1052[--Statics.field292] == 1;
            client.field669 = var29;
            if (!var29) {
                Statics.field141.field1019 = "";
                class68.method614();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1052[++Statics.field292 - 1] = client.field669 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.af(ILcz;ZI)I")
    public static int method2121(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field292 -= 3;
            client.method52(field1052[Statics.field292], field1052[Statics.field292 + 1], field1052[Statics.field292 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method274(field1052[--Statics.field292]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field292 -= 2;
            client.method642(field1052[Statics.field292], field1052[Statics.field292 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gl.az(ILcz;ZI)I")
    public static int method3595(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1052[++Statics.field292 - 1] = client.field642;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field292 -= 2;
            int var3 = field1052[Statics.field292];
            int var4 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = class55.method4255(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field292 -= 2;
            int var5 = field1052[Statics.field292];
            int var6 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = class55.method757(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field292 -= 2;
            int var7 = field1052[Statics.field292];
            int var8 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = class55.method1485(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = class256.method4271(var9).field3292;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = client.field838[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = client.field763[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = client.field695[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1983;
            int var14 = (Statics.field138.field943 >> 7) + Statics.field321;
            int var15 = (Statics.field138.field925 >> 7) + Statics.field2611;
            field1052[++Statics.field292 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1052[++Statics.field292 - 1] = client.field633 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field292 -= 2;
            int var19 = field1052[Statics.field292] + 32768;
            int var20 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = class55.method4255(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field292 -= 2;
            int var21 = field1052[Statics.field292] + 32768;
            int var22 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = class55.method757(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field292 -= 2;
            int var23 = field1052[Statics.field292] + 32768;
            int var24 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = class55.method1485(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field740 >= 2) {
                field1052[++Statics.field292 - 1] = client.field740;
            } else {
                field1052[++Statics.field292 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1052[++Statics.field292 - 1] = client.field649;
            return 1;
        } else if (arg0 == 3318) {
            field1052[++Statics.field292 - 1] = client.field683;
            return 1;
        } else if (arg0 == 3321) {
            field1052[++Statics.field292 - 1] = client.field640;
            return 1;
        } else if (arg0 == 3322) {
            field1052[++Statics.field292 - 1] = client.field798;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field727) {
                field1052[++Statics.field292 - 1] = 1;
            } else {
                field1052[++Statics.field292 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1052[++Statics.field292 - 1] = client.field631;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field292 -= 4;
            int var25 = field1052[Statics.field292];
            int var26 = field1052[Statics.field292 + 1];
            int var27 = field1052[Statics.field292 + 2];
            int var28 = field1052[Statics.field292 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1052[++Statics.field292 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hz.at(ILcz;ZI)I")
    public static int method4039(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field292 -= 2;
            int var3 = field1052[Statics.field292];
            int var4 = field1052[Statics.field292 + 1];
            class269 var5 = class269.method3089(var3);
            if (var5.field3409 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3414; var6++) {
                if (var5.field3413[var6] == var4) {
                    field1053[++Statics.field476 - 1] = var5.field3415[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1053[++Statics.field476 - 1] = var5.field3410;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field292 -= 4;
            int var7 = field1052[Statics.field292];
            int var8 = field1052[Statics.field292 + 1];
            int var9 = field1052[Statics.field292 + 2];
            int var10 = field1052[Statics.field292 + 3];
            class269 var11 = class269.method3089(var9);
            if (var11.field3408 != var7 || var11.field3409 != var8) {
                if (var8 == 115) {
                    field1053[++Statics.field476 - 1] = class240.field2865;
                } else {
                    field1052[++Statics.field292 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3414; var12++) {
                if (var11.field3413[var12] == var10) {
                    if (var8 == 115) {
                        field1053[++Statics.field476 - 1] = var11.field3415[var12];
                    } else {
                        field1052[++Statics.field292 - 1] = var11.field3407[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1053[++Statics.field476 - 1] = var11.field3410;
                } else {
                    field1052[++Statics.field292 - 1] = var11.field3412;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1052[--Statics.field292];
            class269 var14 = class269.method3089(var13);
            field1052[++Statics.field292 - 1] = var14.method4665();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iy.ac(ILcz;ZI)I")
    public static int method4484(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1863.field1029 == 0) {
                field1052[++Statics.field292 - 1] = -2;
            } else if (Statics.field1863.field1029 == 1) {
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = Statics.field1863.field1023.method5049();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1052[--Statics.field292];
            if (Statics.field1863.method1566() && var3 >= 0 && var3 < Statics.field1863.field1023.method5049()) {
                class295 var4 = (class295) Statics.field1863.field1023.method5034(var3);
                field1053[++Statics.field476 - 1] = var4.method4992();
                field1053[++Statics.field476 - 1] = var4.method4991();
            } else {
                field1053[++Statics.field476 - 1] = "";
                field1053[++Statics.field476 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1052[--Statics.field292];
            if (Statics.field1863.method1566() && var5 >= 0 && var5 < Statics.field1863.field1023.method5049()) {
                field1052[++Statics.field292 - 1] = ((class290) Statics.field1863.field1023.method5034(var5)).field3703;
            } else {
                field1052[++Statics.field292 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1052[--Statics.field292];
            if (Statics.field1863.method1566() && var6 >= 0 && var6 < Statics.field1863.field1023.method5049()) {
                field1052[++Statics.field292 - 1] = ((class290) Statics.field1863.field1023.method5034(var6)).field3699;
            } else {
                field1052[++Statics.field292 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1053[--Statics.field476];
            int var8 = field1052[--Statics.field292];
            class69.method3029(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1053[--Statics.field476];
            Statics.field1863.method1590(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1053[--Statics.field476];
            Statics.field1863.method1577(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1053[--Statics.field476];
            Statics.field1863.method1603(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1053[--Statics.field476];
            Statics.field1863.method1578(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1053[--Statics.field476];
            String var14 = client.method3641(var13);
            field1052[++Statics.field292 - 1] = Statics.field1863.method1571(new class294(var14, Statics.field3846), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field2353 == null) {
                field1053[++Statics.field476 - 1] = "";
            } else {
                field1053[++Statics.field476 - 1] = Statics.field2353.field3722;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field2353 == null) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = Statics.field2353.method5049();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1052[--Statics.field292];
            if (Statics.field2353 == null || var15 >= Statics.field2353.method5049()) {
                field1053[++Statics.field476 - 1] = "";
            } else {
                field1053[++Statics.field476 - 1] = Statics.field2353.method5034(var15).method5002().method5130();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1052[--Statics.field292];
            if (Statics.field2353 == null || var16 >= Statics.field2353.method5049()) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = ((class290) Statics.field2353.method5034(var16)).method5107();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1052[--Statics.field292];
            if (Statics.field2353 == null || var17 >= Statics.field2353.method5049()) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = ((class290) Statics.field2353.method5034(var17)).field3699;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1052[++Statics.field292 - 1] = Statics.field2353 == null ? 0 : Statics.field2353.field3723;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1053[--Statics.field476];
            Statics.method609(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1052[++Statics.field292 - 1] = Statics.field2353 == null ? 0 : Statics.field2353.field3725;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1053[--Statics.field476];
            client.method2903(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method4967();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1863.method1566()) {
                field1052[++Statics.field292 - 1] = Statics.field1863.field1025.method5049();
            } else {
                field1052[++Statics.field292 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1052[--Statics.field292];
            if (Statics.field1863.method1566() && var20 >= 0 && var20 < Statics.field1863.field1025.method5049()) {
                class289 var21 = (class289) Statics.field1863.field1025.method5034(var20);
                field1053[++Statics.field476 - 1] = var21.method4992();
                field1053[++Statics.field476 - 1] = var21.method4991();
            } else {
                field1053[++Statics.field476 - 1] = "";
                field1053[++Statics.field476 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1053[--Statics.field476];
            String var23 = client.method3641(var22);
            field1052[++Statics.field292 - 1] = Statics.field1863.method1572(new class294(var23, Statics.field3846)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1052[--Statics.field292];
            if (Statics.field2353 == null || var24 >= Statics.field2353.method5049() || !Statics.field2353.method5034(var24).method5002().equals(Statics.field138.field597)) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field2353 == null || Statics.field2353.field3724 == null) {
                field1053[++Statics.field476 - 1] = "";
            } else {
                field1053[++Statics.field476 - 1] = Statics.field2353.field3724;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1052[--Statics.field292];
            if (Statics.field2353 == null || var25 >= Statics.field2353.method5049() || !((class284) Statics.field2353.method5034(var25)).method4970()) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1052[--Statics.field292];
            if (Statics.field2353 == null || var26 >= Statics.field2353.method5049() || !((class284) Statics.field2353.method5034(var26)).method4975()) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1863.field1023.method5081();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1023.method5056(new class314(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1023.method5056(new class315(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1023.method5056(new class146(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1023.method5056(new class140(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1023.method5056(new class145(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1023.method5056(new class148(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1023.method5056(new class144(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1023.method5056(new class142(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1023.method5056(new class141(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1023.method5056(new class143(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1863.field1023.method5047();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1863.field1025.method5081();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1025.method5056(new class314(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1025.method5056(new class315(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1863.field1025.method5047();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field2353 != null) {
                Statics.field2353.method5081();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1052[--Statics.field292] == 1;
            if (Statics.field2353 != null) {
                Statics.field2353.method5056(new class314(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1052[--Statics.field292] == 1;
            if (Statics.field2353 != null) {
                Statics.field2353.method5056(new class315(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1052[--Statics.field292] == 1;
            if (Statics.field2353 != null) {
                Statics.field2353.method5056(new class146(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1052[--Statics.field292] == 1;
            if (Statics.field2353 != null) {
                Statics.field2353.method5056(new class140(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1052[--Statics.field292] == 1;
            if (Statics.field2353 != null) {
                Statics.field2353.method5056(new class145(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1052[--Statics.field292] == 1;
            if (Statics.field2353 != null) {
                Statics.field2353.method5056(new class148(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1052[--Statics.field292] == 1;
            if (Statics.field2353 != null) {
                Statics.field2353.method5056(new class144(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1052[--Statics.field292] == 1;
            if (Statics.field2353 != null) {
                Statics.field2353.method5056(new class142(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1052[--Statics.field292] == 1;
            if (Statics.field2353 != null) {
                Statics.field2353.method5056(new class141(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1052[--Statics.field292] == 1;
            if (Statics.field2353 != null) {
                Statics.field2353.method5056(new class143(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field2353 != null) {
                Statics.field2353.method5047();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1052[--Statics.field292] == 1;
            Statics.field1863.field1023.method5056(new class147(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1052[--Statics.field292] == 1;
            if (Statics.field2353 != null) {
                Statics.field2353.method5056(new class147(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.am(ILcz;ZI)I")
    public static int method1083(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = client.field897[var3].method39();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = client.field897[var4].field30;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = client.field897[var5].field37;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = client.field897[var6].field32;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = client.field897[var7].field33;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = client.field897[var8].field34;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1052[--Statics.field292];
            int var10 = client.field897[var9].method38();
            field1052[++Statics.field292 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1052[--Statics.field292];
            int var12 = client.field897[var11].method38();
            field1052[++Statics.field292 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1052[--Statics.field292];
            int var14 = client.field897[var13].method38();
            field1052[++Statics.field292 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1052[--Statics.field292];
            int var16 = client.field897[var15].method38();
            field1052[++Statics.field292 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1052[--Statics.field292] == 1;
            if (Statics.field1764 != null) {
                Statics.field1764.method9(class2.field8, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1052[--Statics.field292] == 1;
            if (Statics.field1764 != null) {
                Statics.field1764.method9(class2.field11, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field292 -= 2;
            boolean var19 = field1052[Statics.field292] == 1;
            boolean var20 = field1052[Statics.field292 + 1] == 1;
            if (Statics.field1764 != null) {
                client.field834.field626 = var20;
                Statics.field1764.method9(client.field834, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1052[--Statics.field292] == 1;
            if (Statics.field1764 != null) {
                Statics.field1764.method9(class2.field6, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1052[--Statics.field292] == 1;
            if (Statics.field1764 != null) {
                Statics.field1764.method9(class2.field9, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1052[++Statics.field292 - 1] = Statics.field1764 == null ? 0 : Statics.field1764.field14.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1052[--Statics.field292];
            class3 var24 = (class3) Statics.field1764.field14.get(var23);
            field1052[++Statics.field292 - 1] = var24.field16;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1052[--Statics.field292];
            class3 var26 = (class3) Statics.field1764.field14.get(var25);
            field1053[++Statics.field476 - 1] = var26.method15();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1052[--Statics.field292];
            class3 var28 = (class3) Statics.field1764.field14.get(var27);
            field1053[++Statics.field476 - 1] = var28.method20();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1052[--Statics.field292];
            class3 var30 = (class3) Statics.field1764.field14.get(var29);
            long var31 = Statics.method1926() - Statics.field1226 - var30.field21;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1053[++Statics.field476 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1052[--Statics.field292];
            class3 var38 = (class3) Statics.field1764.field14.get(var37);
            field1052[++Statics.field292 - 1] = var38.field15.field32;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1052[--Statics.field292];
            class3 var40 = (class3) Statics.field1764.field14.get(var39);
            field1052[++Statics.field292 - 1] = var40.field15.field37;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1052[--Statics.field292];
            class3 var42 = (class3) Statics.field1764.field14.get(var41);
            field1052[++Statics.field292 - 1] = var42.field15.field30;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jp.aw(ILcz;ZB)I")
    public static int method4844(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field292 -= 2;
            int var3 = field1052[Statics.field292];
            int var4 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field292 -= 2;
            int var5 = field1052[Statics.field292];
            int var6 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field292 -= 2;
            int var7 = field1052[Statics.field292];
            int var8 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field292 -= 2;
            int var9 = field1052[Statics.field292];
            int var10 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field292 -= 5;
            int var13 = field1052[Statics.field292];
            int var14 = field1052[Statics.field292 + 1];
            int var15 = field1052[Statics.field292 + 2];
            int var16 = field1052[Statics.field292 + 3];
            int var17 = field1052[Statics.field292 + 4];
            field1052[++Statics.field292 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field292 -= 2;
            int var18 = field1052[Statics.field292];
            int var19 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field292 -= 2;
            int var20 = field1052[Statics.field292];
            int var21 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field292 -= 2;
            int var22 = field1052[Statics.field292];
            int var23 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field292 -= 2;
            int var24 = field1052[Statics.field292];
            int var25 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field292 -= 2;
            int var26 = field1052[Statics.field292];
            int var27 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field292 -= 2;
            int var28 = field1052[Statics.field292];
            int var29 = field1052[Statics.field292 + 1];
            if (var28 == 0) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field292 -= 2;
            int var30 = field1052[Statics.field292];
            int var31 = field1052[Statics.field292 + 1];
            if (var30 == 0) {
                field1052[++Statics.field292 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1052[++Statics.field292 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1052[++Statics.field292 - 1] = var30;
                    break;
                case 2:
                    field1052[++Statics.field292 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1052[++Statics.field292 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1052[++Statics.field292 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1052[++Statics.field292 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field292 -= 2;
            int var32 = field1052[Statics.field292];
            int var33 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field292 -= 2;
            int var34 = field1052[Statics.field292];
            int var35 = field1052[Statics.field292 + 1];
            field1052[++Statics.field292 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field292 -= 3;
            long var36 = (long) field1052[Statics.field292];
            long var38 = (long) field1052[Statics.field292 + 1];
            long var40 = (long) field1052[Statics.field292 + 2];
            field1052[++Statics.field292 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.as(ILcz;ZI)I")
    public static int method1486(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1052[--Statics.field292];
            field1053[++Statics.field476 - 1] = class272.method92(var3).field3523;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field292 -= 2;
            int var4 = field1052[Statics.field292];
            int var5 = field1052[Statics.field292 + 1];
            class272 var6 = class272.method92(var4);
            if (var5 < 1 || var5 > 5 || var6.field3546[var5 - 1] == null) {
                field1053[++Statics.field476 - 1] = "";
            } else {
                field1053[++Statics.field476 - 1] = var6.field3546[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field292 -= 2;
            int var7 = field1052[Statics.field292];
            int var8 = field1052[Statics.field292 + 1];
            class272 var9 = class272.method92(var7);
            if (var8 < 1 || var8 > 5 || var9.field3532[var8 - 1] == null) {
                field1053[++Statics.field476 - 1] = "";
            } else {
                field1053[++Statics.field476 - 1] = var9.field3532[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = class272.method92(var10).field3520;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = class272.method92(var11).field3512 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1052[--Statics.field292];
            class272 var13 = class272.method92(var12);
            if (var13.field3533 == -1 && var13.field3539 >= 0) {
                field1052[++Statics.field292 - 1] = var13.field3539;
            } else {
                field1052[++Statics.field292 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1052[--Statics.field292];
            class272 var15 = class272.method92(var14);
            if (var15.field3533 >= 0 && var15.field3539 >= 0) {
                field1052[++Statics.field292 - 1] = var15.field3539;
            } else {
                field1052[++Statics.field292 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = class272.method92(var16).field3521 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1052[--Statics.field292];
            class272 var18 = class272.method92(var17);
            if (var18.field3552 == -1 && var18.field3551 >= 0) {
                field1052[++Statics.field292 - 1] = var18.field3551;
            } else {
                field1052[++Statics.field292 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1052[--Statics.field292];
            class272 var20 = class272.method92(var19);
            if (var20.field3552 >= 0 && var20.field3551 >= 0) {
                field1052[++Statics.field292 - 1] = var20.field3551;
            } else {
                field1052[++Statics.field292 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1053[--Statics.field476];
            int var22 = field1052[--Statics.field292];
            Statics.method2528(var21, var22 == 1);
            field1052[++Statics.field292 - 1] = Statics.field3204;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field552 == null || Statics.field559 >= Statics.field3204) {
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = Statics.field552[++Statics.field559 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field559 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iw.al(ILcz;ZI)I")
    public static int method4285(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1052[++Statics.field292 - 1] = client.field846;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field292 -= 3;
            client.field846 = field1052[Statics.field292];
            Statics.field93 = class310.method4284(field1052[Statics.field292 + 1]);
            if (Statics.field93 == null) {
                Statics.field93 = class310.field3800;
            }
            client.field835 = field1052[Statics.field292 + 2];
            class175 var3 = class175.method85(class172.field2223, client.field861.field1287);
            var3.field2335.method3376(client.field846);
            var3.field2335.method3376(Statics.field93.field3802);
            var3.field2335.method3376(client.field835);
            client.field861.method1944(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1053[--Statics.field476];
            Statics.field292 -= 2;
            int var5 = field1052[Statics.field292];
            int var6 = field1052[Statics.field292 + 1];
            class175 var7 = class175.method85(class172.field2305, client.field861.field1287);
            var7.field2335.method3376(class185.method3075(var4) + 2);
            var7.field2335.method3446(var4);
            var7.field2335.method3376(var5 - 1);
            var7.field2335.method3376(var6);
            client.field861.method1944(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field292 -= 2;
            int var8 = field1052[Statics.field292];
            int var9 = field1052[Statics.field292 + 1];
            class60 var10 = class86.method430(var8, var9);
            if (var10 == null) {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = 0;
                field1053[++Statics.field476 - 1] = "";
                field1053[++Statics.field476 - 1] = "";
                field1053[++Statics.field476 - 1] = "";
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = var10.field591;
                field1052[++Statics.field292 - 1] = var10.field583;
                field1053[++Statics.field476 - 1] = var10.field588 == null ? "" : var10.field588;
                field1053[++Statics.field476 - 1] = var10.field584 == null ? "" : var10.field584;
                field1053[++Statics.field476 - 1] = var10.field586 == null ? "" : var10.field586;
                field1052[++Statics.field292 - 1] = var10.method1005() ? 1 : (var10.method1008() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1052[--Statics.field292];
            class60 var12 = class86.method1487(var11);
            if (var12 == null) {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = 0;
                field1053[++Statics.field476 - 1] = "";
                field1053[++Statics.field476 - 1] = "";
                field1053[++Statics.field476 - 1] = "";
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = var12.field585;
                field1052[++Statics.field292 - 1] = var12.field583;
                field1053[++Statics.field476 - 1] = var12.field588 == null ? "" : var12.field588;
                field1053[++Statics.field476 - 1] = var12.field584 == null ? "" : var12.field584;
                field1053[++Statics.field476 - 1] = var12.field586 == null ? "" : var12.field586;
                field1052[++Statics.field292 - 1] = var12.method1005() ? 1 : (var12.method1008() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field93 == null) {
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = Statics.field93.field3802;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1053[--Statics.field476];
            int var14 = field1052[--Statics.field292];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class240.field3037)) {
                var16 = 0;
                var13 = var13.substring(class240.field3037.length());
            } else if (var15.startsWith(class240.field3039)) {
                var16 = 1;
                var13 = var13.substring(class240.field3039.length());
            } else if (var15.startsWith(class240.field3041)) {
                var16 = 2;
                var13 = var13.substring(class240.field3041.length());
            } else if (var15.startsWith(class240.field3133)) {
                var16 = 3;
                var13 = var13.substring(class240.field3133.length());
            } else if (var15.startsWith(class240.field3045)) {
                var16 = 4;
                var13 = var13.substring(class240.field3045.length());
            } else if (var15.startsWith(class240.field3047)) {
                var16 = 5;
                var13 = var13.substring(class240.field3047.length());
            } else if (var15.startsWith(class240.field3049)) {
                var16 = 6;
                var13 = var13.substring(class240.field3049.length());
            } else if (var15.startsWith(class240.field3051)) {
                var16 = 7;
                var13 = var13.substring(class240.field3051.length());
            } else if (var15.startsWith(class240.field3053)) {
                var16 = 8;
                var13 = var13.substring(class240.field3053.length());
            } else if (var15.startsWith(class240.field2964)) {
                var16 = 9;
                var13 = var13.substring(class240.field2964.length());
            } else if (var15.startsWith(class240.field3057)) {
                var16 = 10;
                var13 = var13.substring(class240.field3057.length());
            } else if (var15.startsWith(class240.field3059)) {
                var16 = 11;
                var13 = var13.substring(class240.field3059.length());
            } else if (client.field635 != 0) {
                if (var15.startsWith(class240.field2916)) {
                    var16 = 0;
                    var13 = var13.substring(class240.field2916.length());
                } else if (var15.startsWith(class240.field2997)) {
                    var16 = 1;
                    var13 = var13.substring(class240.field2997.length());
                } else if (var15.startsWith(class240.field3042)) {
                    var16 = 2;
                    var13 = var13.substring(class240.field3042.length());
                } else if (var15.startsWith(class240.field3128)) {
                    var16 = 3;
                    var13 = var13.substring(class240.field3128.length());
                } else if (var15.startsWith(class240.field2920)) {
                    var16 = 4;
                    var13 = var13.substring(class240.field2920.length());
                } else if (var15.startsWith(class240.field3048)) {
                    var16 = 5;
                    var13 = var13.substring(class240.field3048.length());
                } else if (var15.startsWith(class240.field3050)) {
                    var16 = 6;
                    var13 = var13.substring(class240.field3050.length());
                } else if (var15.startsWith(class240.field2905)) {
                    var16 = 7;
                    var13 = var13.substring(class240.field2905.length());
                } else if (var15.startsWith(class240.field3054)) {
                    var16 = 8;
                    var13 = var13.substring(class240.field3054.length());
                } else if (var15.startsWith(class240.field3056)) {
                    var16 = 9;
                    var13 = var13.substring(class240.field3056.length());
                } else if (var15.startsWith(class240.field2868)) {
                    var16 = 10;
                    var13 = var13.substring(class240.field2868.length());
                } else if (var15.startsWith(class240.field3060)) {
                    var16 = 11;
                    var13 = var13.substring(class240.field3060.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class240.field3061)) {
                var18 = 1;
                var13 = var13.substring(class240.field3061.length());
            } else if (var17.startsWith(class240.field3033)) {
                var18 = 2;
                var13 = var13.substring(class240.field3033.length());
            } else if (var17.startsWith(class240.field3075)) {
                var18 = 3;
                var13 = var13.substring(class240.field3075.length());
            } else if (var17.startsWith(class240.field2928)) {
                var18 = 4;
                var13 = var13.substring(class240.field2928.length());
            } else if (var17.startsWith(class240.field3069)) {
                var18 = 5;
                var13 = var13.substring(class240.field3069.length());
            } else if (client.field635 != 0) {
                if (var17.startsWith(class240.field3108)) {
                    var18 = 1;
                    var13 = var13.substring(class240.field3108.length());
                } else if (var17.startsWith(class240.field2902)) {
                    var18 = 2;
                    var13 = var13.substring(class240.field2902.length());
                } else if (var17.startsWith(class240.field3109)) {
                    var18 = 3;
                    var13 = var13.substring(class240.field3109.length());
                } else if (var17.startsWith(class240.field3068)) {
                    var18 = 4;
                    var13 = var13.substring(class240.field3068.length());
                } else if (var17.startsWith(class240.field3070)) {
                    var18 = 5;
                    var13 = var13.substring(class240.field3070.length());
                }
            }
            class175 var19 = class175.method85(class172.field2266, client.field861.field1287);
            var19.field2335.method3376(0);
            int var20 = var19.field2335.field2414;
            var19.field2335.method3376(var14);
            var19.field2335.method3376(var16);
            var19.field2335.method3376(var18);
            class303.method4885(var19.field2335, var13);
            var19.field2335.method3342(var19.field2335.field2414 - var20);
            client.field861.method1944(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field476 -= 2;
            String var21 = field1053[Statics.field476];
            String var22 = field1053[Statics.field476 + 1];
            class175 var23 = class175.method85(class172.field2233, client.field861.field1287);
            var23.field2335.method3330(0);
            int var24 = var23.field2335.field2414;
            var23.field2335.method3446(var21);
            class303.method4885(var23.field2335, var22);
            var23.field2335.method3341(var23.field2335.field2414 - var24);
            client.field861.method1944(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field138 == null || Statics.field138.field597 == null) {
                var25 = "";
            } else {
                var25 = Statics.field138.field597.method5130();
            }
            field1053[++Statics.field476 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1052[++Statics.field292 - 1] = client.field835;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = class86.method1959(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = class86.method1740(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = class86.method1816(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1053[--Statics.field476];
            client.method3315(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field848 = field1053[--Statics.field476].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1053[++Statics.field476 - 1] = client.field848;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.ad(ILcz;ZI)I")
    public static int method991(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1052[++Statics.field292 - 1] = client.method106();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1052[--Statics.field292];
            if (var3 == 1 || var3 == 2) {
                client.method972(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1052[++Statics.field292 - 1] = Statics.field141.field1020;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1052[--Statics.field292];
            if (var4 == 1 || var4 == 2) {
                Statics.field141.field1020 = var4;
                class68.method614();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dw.ax(ILcz;ZI)I")
    public static int method2515(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field292 -= 2;
            int var3 = field1052[Statics.field292];
            int var4 = field1052[Statics.field292 + 1];
            if (!client.field874) {
                client.field699 = var3;
                client.field700 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1052[++Statics.field292 - 1] = client.field699;
            return 1;
        } else if (arg0 == 5506) {
            field1052[++Statics.field292 - 1] = client.field700;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1052[--Statics.field292];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field706 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1052[++Statics.field292 - 1] = client.field706;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("o.ao(ILcz;ZI)I")
    public static int method269(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field775 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ee.ap(II)I")
    public static int method2994(int arg0) {
        return (int) ((Math.log((double) arg0) / field1061 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("q.ar(ILcz;ZI)I")
    public static int method431(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field292 -= 2;
            client.field873 = (short) Statics.method939(field1052[Statics.field292]);
            if (client.field873 <= 0) {
                client.field873 = 256;
            }
            client.field882 = (short) Statics.method939(field1052[Statics.field292 + 1]);
            if (client.field882 <= 0) {
                client.field882 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field292 -= 2;
            client.field736 = (short) field1052[Statics.field292];
            if (client.field736 <= 0) {
                client.field736 = 256;
            }
            client.field883 = (short) field1052[Statics.field292 + 1];
            if (client.field883 <= 0) {
                client.field883 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field292 -= 4;
            client.field884 = (short) field1052[Statics.field292];
            if (client.field884 <= 0) {
                client.field884 = 1;
            }
            client.field885 = (short) field1052[Statics.field292 + 1];
            if (client.field885 <= 0) {
                client.field885 = 32767;
            } else if (client.field885 < client.field884) {
                client.field885 = client.field884;
            }
            client.field886 = (short) field1052[Statics.field292 + 2];
            if (client.field886 <= 0) {
                client.field886 = 1;
            }
            client.field818 = (short) field1052[Statics.field292 + 3];
            if (client.field818 <= 0) {
                client.field818 = 32767;
            } else if (client.field818 < client.field886) {
                client.field818 = client.field886;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field802 == null) {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = -1;
            } else {
                client.method2907(0, 0, client.field802.field2683, client.field802.field2684, false);
                field1052[++Statics.field292 - 1] = client.field890;
                field1052[++Statics.field292 - 1] = client.field836;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1052[++Statics.field292 - 1] = client.field736;
            field1052[++Statics.field292 - 1] = client.field883;
            return 1;
        } else if (arg0 == 6205) {
            field1052[++Statics.field292 - 1] = method2994(client.field873);
            field1052[++Statics.field292 - 1] = method2994(client.field882);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bu.ab(ILcz;ZB)I")
    public static int method1524(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1052[++Statics.field292 - 1] = class67.method607() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class67 var3 = class67.method975();
            if (var3 == null) {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = 0;
                field1053[++Statics.field476 - 1] = "";
                field1052[++Statics.field292 - 1] = 0;
                field1052[++Statics.field292 - 1] = 0;
                field1053[++Statics.field476 - 1] = "";
            } else {
                field1052[++Statics.field292 - 1] = var3.field1008;
                field1052[++Statics.field292 - 1] = var3.field1003;
                field1053[++Statics.field476 - 1] = var3.field1006;
                field1052[++Statics.field292 - 1] = var3.field1007;
                field1052[++Statics.field292 - 1] = var3.field1002;
                field1053[++Statics.field476 - 1] = var3.field1005;
            }
            return 1;
        } else if (arg0 == 6502) {
            class67 var4 = class67.method4936();
            if (var4 == null) {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = 0;
                field1053[++Statics.field476 - 1] = "";
                field1052[++Statics.field292 - 1] = 0;
                field1052[++Statics.field292 - 1] = 0;
                field1053[++Statics.field476 - 1] = "";
            } else {
                field1052[++Statics.field292 - 1] = var4.field1008;
                field1052[++Statics.field292 - 1] = var4.field1003;
                field1053[++Statics.field476 - 1] = var4.field1006;
                field1052[++Statics.field292 - 1] = var4.field1007;
                field1052[++Statics.field292 - 1] = var4.field1002;
                field1053[++Statics.field476 - 1] = var4.field1005;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1052[--Statics.field292];
            class67 var6 = null;
            for (int var7 = 0; var7 < class67.field994; var7++) {
                if (Statics.field997[var7].field1008 == var5) {
                    var6 = Statics.field997[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = 0;
                field1053[++Statics.field476 - 1] = "";
                field1052[++Statics.field292 - 1] = 0;
                field1052[++Statics.field292 - 1] = 0;
                field1053[++Statics.field476 - 1] = "";
            } else {
                field1052[++Statics.field292 - 1] = var6.field1008;
                field1052[++Statics.field292 - 1] = var6.field1003;
                field1053[++Statics.field476 - 1] = var6.field1006;
                field1052[++Statics.field292 - 1] = var6.field1007;
                field1052[++Statics.field292 - 1] = var6.field1002;
                field1053[++Statics.field476 - 1] = var6.field1005;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field292 -= 4;
            int var8 = field1052[Statics.field292];
            boolean var9 = field1052[Statics.field292 + 1] == 1;
            int var10 = field1052[Statics.field292 + 2];
            boolean var11 = field1052[Statics.field292 + 3] == 1;
            class67.method1924(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1052[--Statics.field292];
            if (var12 >= 0 && var12 < class67.field994) {
                class67 var13 = Statics.field997[var12];
                field1052[++Statics.field292 - 1] = var13.field1008;
                field1052[++Statics.field292 - 1] = var13.field1003;
                field1053[++Statics.field476 - 1] = var13.field1006;
                field1052[++Statics.field292 - 1] = var13.field1007;
                field1052[++Statics.field292 - 1] = var13.field1002;
                field1053[++Statics.field476 - 1] = var13.field1005;
            } else {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = 0;
                field1053[++Statics.field476 - 1] = "";
                field1052[++Statics.field292 - 1] = 0;
                field1052[++Statics.field292 - 1] = 0;
                field1053[++Statics.field476 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field864 = field1052[--Statics.field292] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field292 -= 2;
            int var14 = field1052[Statics.field292];
            int var15 = field1052[Statics.field292 + 1];
            class267 var16 = class267.method281(var15);
            if (var16.method4645()) {
                field1053[++Statics.field476 - 1] = class274.method187(var14).method4870(var15, var16.field3398);
            } else {
                field1052[++Statics.field292 - 1] = class274.method187(var14).method4863(var15, var16.field3397);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field292 -= 2;
            int var17 = field1052[Statics.field292];
            int var18 = field1052[Statics.field292 + 1];
            class267 var19 = class267.method281(var18);
            if (var19.method4645()) {
                field1053[++Statics.field476 - 1] = class271.method1776(var17).method4732(var18, var19.field3398);
            } else {
                field1052[++Statics.field292 - 1] = class271.method1776(var17).method4722(var18, var19.field3397);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field292 -= 2;
            int var20 = field1052[Statics.field292];
            int var21 = field1052[Statics.field292 + 1];
            class267 var22 = class267.method281(var21);
            if (var22.method4645()) {
                field1053[++Statics.field476 - 1] = class272.method92(var20).method4777(var21, var22.field3398);
            } else {
                field1052[++Statics.field292 - 1] = class272.method92(var20).method4776(var21, var22.field3397);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field292 -= 2;
            int var23 = field1052[Statics.field292];
            int var24 = field1052[Statics.field292 + 1];
            class267 var25 = class267.method281(var24);
            if (var25.method4645()) {
                field1053[++Statics.field476 - 1] = class268.method3234(var23).method4658(var24, var25.field3398);
            } else {
                field1052[++Statics.field292 - 1] = class268.method3234(var23).method4650(var24, var25.field3397);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1052[++Statics.field292 - 1] = client.field637 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1052[++Statics.field292 - 1] = client.field865 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field476--;
            Statics.field292--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field476--;
            Statics.field292--;
            return 1;
        } else if (arg0 == 6524) {
            field1052[++Statics.field292 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1052[++Statics.field292 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1052[++Statics.field292 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kl.aq(ILcz;ZI)I")
    public static int method5103(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1983;
            int var4 = (Statics.field138.field943 >> 7) + Statics.field321;
            int var5 = (Statics.field138.field925 >> 7) + Statics.field2611;
            client.method675().method5737(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1052[--Statics.field292];
            String var7 = "";
            class21 var8 = client.method675().method5869(var6);
            if (var8 != null) {
                var7 = var8.method203();
            }
            field1053[++Statics.field476 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1052[--Statics.field292];
            client.method675().method5741(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1052[++Statics.field292 - 1] = client.method675().method5752();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1052[--Statics.field292];
            client.method675().method5749(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1052[++Statics.field292 - 1] = client.method675().method5847() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class229 var11 = new class229(field1052[--Statics.field292]);
            client.method675().method5834(var11.field2634, var11.field2632);
            return 1;
        } else if (arg0 == 6607) {
            class229 var12 = new class229(field1052[--Statics.field292]);
            client.method675().method5861(var12.field2634, var12.field2632);
            return 1;
        } else if (arg0 == 6608) {
            class229 var13 = new class229(field1052[--Statics.field292]);
            client.method675().method5758(var13.field2633, var13.field2634, var13.field2632);
            return 1;
        } else if (arg0 == 6609) {
            class229 var14 = new class229(field1052[--Statics.field292]);
            client.method675().method5759(var14.field2633, var14.field2634, var14.field2632);
            return 1;
        } else if (arg0 == 6610) {
            field1052[++Statics.field292 - 1] = client.method675().method5760();
            field1052[++Statics.field292 - 1] = client.method675().method5761();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1052[--Statics.field292];
            class21 var16 = client.method675().method5869(var15);
            if (var16 == null) {
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = var16.method240().method4133();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1052[--Statics.field292];
            class21 var18 = client.method675().method5869(var17);
            if (var18 == null) {
                field1052[++Statics.field292 - 1] = 0;
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = (var18.method207() - var18.method206() + 1) * 64;
                field1052[++Statics.field292 - 1] = (var18.method209() - var18.method239() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1052[--Statics.field292];
            class21 var20 = client.method675().method5869(var19);
            if (var20 == null) {
                field1052[++Statics.field292 - 1] = 0;
                field1052[++Statics.field292 - 1] = 0;
                field1052[++Statics.field292 - 1] = 0;
                field1052[++Statics.field292 - 1] = 0;
            } else {
                field1052[++Statics.field292 - 1] = var20.method206() * 64;
                field1052[++Statics.field292 - 1] = var20.method239() * 64;
                field1052[++Statics.field292 - 1] = var20.method207() * 64 + 64 - 1;
                field1052[++Statics.field292 - 1] = var20.method209() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1052[--Statics.field292];
            class21 var22 = client.method675().method5869(var21);
            if (var22 == null) {
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = var22.method230();
            }
            return 1;
        } else if (arg0 == 6615) {
            class229 var23 = client.method675().method5762();
            if (var23 == null) {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = var23.field2634;
                field1052[++Statics.field292 - 1] = var23.field2632;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1052[++Statics.field292 - 1] = client.method675().method5739();
            return 1;
        } else if (arg0 == 6617) {
            class229 var24 = new class229(field1052[--Statics.field292]);
            class21 var25 = client.method675().method5740();
            if (var25 == null) {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method197(var24.field2633, var24.field2634, var24.field2632);
            if (var26 == null) {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = var26[0];
                field1052[++Statics.field292 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class229 var27 = new class229(field1052[--Statics.field292]);
            class21 var28 = client.method675().method5740();
            if (var28 == null) {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = -1;
                return 1;
            }
            class229 var29 = var28.method217(var27.field2634, var27.field2632);
            if (var29 == null) {
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = var29.method4133();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field292 -= 2;
            int var30 = field1052[Statics.field292];
            class229 var31 = new class229(field1052[Statics.field292 + 1]);
            method3105(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field292 -= 2;
            int var32 = field1052[Statics.field292];
            class229 var33 = new class229(field1052[Statics.field292 + 1]);
            method3105(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field292 -= 2;
            int var34 = field1052[Statics.field292];
            class229 var35 = new class229(field1052[Statics.field292 + 1]);
            class21 var36 = client.method675().method5869(var34);
            if (var36 == null) {
                field1052[++Statics.field292 - 1] = 0;
                return 1;
            } else {
                field1052[++Statics.field292 - 1] = var36.method195(var35.field2633, var35.field2634, var35.field2632) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1052[++Statics.field292 - 1] = client.method675().method5763();
            field1052[++Statics.field292 - 1] = client.method675().method5764();
            return 1;
        } else if (arg0 == 6623) {
            class229 var37 = new class229(field1052[--Statics.field292]);
            class21 var38 = client.method675().method5779(var37.field2633, var37.field2634, var37.field2632);
            if (var38 == null) {
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = var38.method231();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method675().method5765(field1052[--Statics.field292]);
            return 1;
        } else if (arg0 == 6625) {
            client.method675().method5766();
            return 1;
        } else if (arg0 == 6626) {
            client.method675().method5767(field1052[--Statics.field292]);
            return 1;
        } else if (arg0 == 6627) {
            client.method675().method5768();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1052[--Statics.field292] == 1;
            client.method675().method5769(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1052[--Statics.field292];
            client.method675().method5781(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1052[--Statics.field292];
            client.method675().method5771(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method675().method5753();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1052[--Statics.field292] == 1;
            client.method675().method5773(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field292 -= 2;
            int var43 = field1052[Statics.field292];
            boolean var44 = field1052[Statics.field292 + 1] == 1;
            client.method675().method5893(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field292 -= 2;
            int var45 = field1052[Statics.field292];
            boolean var46 = field1052[Statics.field292 + 1] == 1;
            client.method675().method5775(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1052[++Statics.field292 - 1] = client.method675().method5776() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = client.method675().method5736(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1052[--Statics.field292];
            field1052[++Statics.field292 - 1] = client.method675().method5778(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field292 -= 2;
            int var49 = field1052[Statics.field292];
            class229 var50 = new class229(field1052[Statics.field292 + 1]);
            class229 var51 = client.method675().method5772(var49, var50);
            if (var51 == null) {
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = var51.method4133();
            }
            return 1;
        } else if (arg0 == 6639) {
            class29 var52 = client.method675().method5783();
            if (var52 == null) {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = var52.field282;
                field1052[++Statics.field292 - 1] = var52.field283.method4133();
            }
            return 1;
        } else if (arg0 == 6640) {
            class29 var53 = client.method675().method5864();
            if (var53 == null) {
                field1052[++Statics.field292 - 1] = -1;
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = var53.field282;
                field1052[++Statics.field292 - 1] = var53.field283.method4133();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1052[--Statics.field292];
            class258 var55 = class258.method3139(var54);
            if (var55.field3306 == null) {
                field1053[++Statics.field476 - 1] = "";
            } else {
                field1053[++Statics.field476 - 1] = var55.field3306;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1052[--Statics.field292];
            class258 var57 = class258.method3139(var56);
            field1052[++Statics.field292 - 1] = var57.field3310;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1052[--Statics.field292];
            class258 var59 = class258.method3139(var58);
            if (var59 == null) {
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = var59.field3322;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1052[--Statics.field292];
            class258 var61 = class258.method3139(var60);
            if (var61 == null) {
                field1052[++Statics.field292 - 1] = -1;
            } else {
                field1052[++Statics.field292 - 1] = var61.field3302;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1052[++Statics.field292 - 1] = Statics.field497.field341;
            return 1;
        } else if (arg0 == 6698) {
            field1052[++Statics.field292 - 1] = Statics.field497.field342.method4133();
            return 1;
        } else if (arg0 == 6699) {
            field1052[++Statics.field292 - 1] = Statics.field497.field340.method4133();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gr.au(II)V")
    public static void method3326(int arg0) {
        if (arg0 == -1 || !class233.method1506(arg0)) {
            return;
        }
        class233[] var1 = Statics.field2657[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3.field2686 != null) {
                class58 var4 = new class58();
                var4.field563 = var3;
                var4.field569 = var3.field2686;
                method2143(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("fk.aj(ILhx;ZI)V")
    public static void method3105(int arg0, class229 arg1, boolean arg2) {
        class21 var3 = client.method675().method5869(arg0);
        int var4 = Statics.field138.field600;
        int var5 = (Statics.field138.field943 >> 7) + Statics.field321;
        int var6 = (Statics.field138.field925 >> 7) + Statics.field2611;
        class229 var7 = new class229(var4, var5, var6);
        client.method675().method5774(var3, var7, arg1, arg2);
    }
}
