package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bh")
public class class77 {

    @ObfuscatedName("bh.z")
    public static int[] field1085 = new int[5];

    @ObfuscatedName("bh.p")
    public static int[][] field1100 = new int[5][5000];

    @ObfuscatedName("bh.h")
    public static int[] field1087 = new int[1000];

    @ObfuscatedName("bh.w")
    public static String[] field1086 = new String[1000];

    @ObfuscatedName("bh.k")
    public static int field1089 = 0;

    @ObfuscatedName("bh.x")
    public static class57[] field1098 = new class57[50];

    @ObfuscatedName("bh.n")
    public static Calendar field1092 = Calendar.getInstance();

    @ObfuscatedName("bh.r")
    public static final String[] field1093 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bh.a")
    public static boolean field1094 = false;

    @ObfuscatedName("bh.d")
    public static boolean field1088 = false;

    @ObfuscatedName("bh.s")
    public static int field1096 = 0;

    @ObfuscatedName("bh.q")
    public static final double field1083 = Math.log(2.0D);

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.u(Lby;I)V")
    public static void method371(class63 arg0) {
        method124(arg0, 500000);
    }

    @ObfuscatedName("x.f(Lby;II)V")
    public static void method124(class63 arg0, int arg1) {
        Object[] var2 = arg0.field568;
        class93 var4;
        if (class294.method3658(arg0.field579)) {
            Statics.field1273 = (class42) var2[0];
            class242 var3 = class242.method2014(Statics.field1273.field356);
            var4 = class93.method3403(arg0.field579, var3.field3221, var3.field3238);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class93.method500(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field55 = 0;
        Statics.field376 = 0;
        int var6 = -1;
        int[] var7 = var4.field1277;
        int[] var8 = var4.field1280;
        byte var9 = -1;
        field1089 = 0;
        field1094 = false;
        try {
            Statics.field1882 = new int[var4.field1276];
            int var10 = 0;
            Statics.field1040 = new String[var4.field1281];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field571;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field572;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field570 == null ? -1 : arg0.field570.field2578;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field573;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field570 == null ? -1 : arg0.field570.field2579;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field574 == null ? -1 : arg0.field574.field2578;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field574 == null ? -1 : arg0.field574.field2579;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field575;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field581;
                    }
                    Statics.field1882[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field577;
                    }
                    Statics.field1040[var11++] = var14;
                }
            }
            int var15 = 0;
            field1096 = arg0.field578;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1280[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method3997(var53, var4, var43);
                    switch(var44) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var53 == 0) {
                    field1087[++Statics.field55 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1087[++Statics.field55 - 1] = class213.field2531[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class213.field2531[var17] = field1087[--Statics.field55];
                    client.method4282(var17);
                } else if (var53 == 3) {
                    field1086[++Statics.field376 - 1] = var4.field1279[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field55 -= 2;
                    if (field1087[Statics.field55] != field1087[Statics.field55 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field55 -= 2;
                    if (field1087[Statics.field55] == field1087[Statics.field55 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field55 -= 2;
                    if (field1087[Statics.field55] < field1087[Statics.field55 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field55 -= 2;
                    if (field1087[Statics.field55] > field1087[Statics.field55 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1089 == 0) {
                        return;
                    }
                    class57 var18 = field1098[--field1089];
                    var4 = var18.field517;
                    var7 = var4.field1277;
                    var8 = var4.field1280;
                    var6 = var18.field524;
                    Statics.field1882 = var18.field515;
                    Statics.field1040 = var18.field516;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1087[++Statics.field55 - 1] = class213.method3238(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class213.method3228(var20, field1087[--Statics.field55]);
                } else if (var53 == 31) {
                    Statics.field55 -= 2;
                    if (field1087[Statics.field55] <= field1087[Statics.field55 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field55 -= 2;
                    if (field1087[Statics.field55] >= field1087[Statics.field55 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1087[++Statics.field55 - 1] = Statics.field1882[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field1882[var8[var6]] = field1087[--Statics.field55];
                } else if (var53 == 35) {
                    field1086[++Statics.field376 - 1] = Statics.field1040[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field1040[var8[var6]] = field1086[--Statics.field376];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field376 -= var21;
                    String var22 = class291.method4969(field1086, Statics.field376, var21);
                    field1086[++Statics.field376 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field55--;
                } else if (var53 == 39) {
                    Statics.field376--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class93 var24 = class93.method500(var23);
                    int[] var25 = new int[var24.field1276];
                    String[] var26 = new String[var24.field1281];
                    for (int var27 = 0; var27 < var24.field1282; var27++) {
                        var25[var27] = field1087[Statics.field55 - var24.field1282 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1283; var28++) {
                        var26[var28] = field1086[Statics.field376 - var24.field1283 + var28];
                    }
                    Statics.field55 -= var24.field1282;
                    Statics.field376 -= var24.field1283;
                    class57 var29 = new class57();
                    var29.field517 = var4;
                    var29.field524 = var6;
                    var29.field515 = Statics.field1882;
                    var29.field516 = Statics.field1040;
                    field1098[++field1089 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1277;
                    var8 = var24.field1280;
                    var6 = -1;
                    Statics.field1882 = var25;
                    Statics.field1040 = var26;
                } else if (var53 == 42) {
                    field1087[++Statics.field55 - 1] = Statics.field1167.method1975(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field1167.method1985(var8[var6], field1087[--Statics.field55]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1087[--Statics.field55];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1085[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1100[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1087[--Statics.field55];
                    if (var36 < 0 || var36 >= field1085[var35]) {
                        throw new RuntimeException();
                    }
                    field1087[++Statics.field55 - 1] = field1100[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field55 -= 2;
                    int var38 = field1087[Statics.field55];
                    if (var38 < 0 || var38 >= field1085[var37]) {
                        throw new RuntimeException();
                    }
                    field1100[var37][var38] = field1087[Statics.field55 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field1167.method1979(var8[var6]);
                    if (var39 == null) {
                        var39 = class225.field2777;
                    }
                    field1086[++Statics.field376 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field1167.method1976(var8[var6], field1086[--Statics.field376]);
                } else if (var53 == 49) {
                    String var40 = Statics.field1167.method1977(var8[var6]);
                    field1086[++Statics.field376 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field1167.method2020(var8[var6], field1086[--Statics.field376]);
                } else if (var53 == 60) {
                    class316 var41 = var4.field1284[var8[var6]];
                    class180 var42 = (class180) var41.method5521((long) field1087[--Statics.field55]);
                    if (var42 != null) {
                        var6 += var42.field2125;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2126).append(" ");
            for (int var47 = field1089 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1098[var47].field517.field2126).append(" ");
            }
            var46.append("").append(var9);
            class341.method3640(var46.toString(), var51);
        } finally {
            if (field1094) {
                field1088 = true;
                client.method1577();
                field1088 = false;
                field1094 = false;
            }
        }
    }

    @ObfuscatedName("im.b(ILci;ZI)I")
    public static int method3997(int arg0, class93 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method3333(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method801(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method1020(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method1815(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method3374(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method1998(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method722(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method2017(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method2334(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method2038(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method1594(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method801(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method1020(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method1815(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method3374(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method1998(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3383(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method525(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method4657(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method291(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method1594(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method4688(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2842(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method520(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method1901(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method175(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method2300(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method3040(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method332(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method46(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method3408(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method173(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method176(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method1991(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method177(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3034(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method58(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gm.g(ILci;ZI)I")
    public static int method3333(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field55 -= 3;
            int var3 = field1087[Statics.field55];
            int var4 = field1087[Statics.field55 + 1];
            int var5 = field1087[Statics.field55 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class218 var6 = class218.method3387(var3);
            if (var6.field2708 == null) {
                var6.field2708 = new class218[var5 + 1];
            }
            if (var6.field2708.length <= var5) {
                class218[] var7 = new class218[var5 + 1];
                for (int var8 = 0; var8 < var6.field2708.length; var8++) {
                    var7[var8] = var6.field2708[var8];
                }
                var6.field2708 = var7;
            }
            if (var5 > 0 && var6.field2708[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class218 var9 = new class218();
            var9.field2580 = var4;
            var9.field2597 = var9.field2578 = var6.field2578;
            var9.field2579 = var5;
            var9.field2659 = true;
            var6.field2708[var5] = var9;
            if (arg2) {
                Statics.field1091 = var9;
            } else {
                Statics.field2353 = var9;
            }
            client.method1052(var6);
            return 1;
        } else if (arg0 == 101) {
            class218 var10 = arg2 ? Statics.field1091 : Statics.field2353;
            class218 var11 = class218.method3387(var10.field2578);
            var11.field2708[var10.field2579] = null;
            client.method1052(var11);
            return 1;
        } else if (arg0 == 102) {
            class218 var12 = class218.method3387(field1087[--Statics.field55]);
            var12.field2708 = null;
            client.method1052(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field55 -= 2;
            int var13 = field1087[Statics.field55];
            int var14 = field1087[Statics.field55 + 1];
            class218 var15 = Statics.method3176(var13, var14);
            if (var15 == null || var14 == -1) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = 1;
                if (arg2) {
                    Statics.field1091 = var15;
                } else {
                    Statics.field2353 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class218 var16 = class218.method3387(field1087[--Statics.field55]);
            if (var16 == null) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = 1;
                if (arg2) {
                    Statics.field1091 = var16;
                } else {
                    Statics.field2353 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.z(ILci;ZB)I")
    public static int method801(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1087[--Statics.field55];
            var4 = class218.method3387(var3);
        } else {
            var4 = arg2 ? Statics.field1091 : Statics.field2353;
        }
        if (arg0 == 1000) {
            Statics.field55 -= 4;
            var4.field2619 = field1087[Statics.field55];
            var4.field2588 = field1087[Statics.field55 + 1];
            var4.field2583 = field1087[Statics.field55 + 2];
            var4.field2680 = field1087[Statics.field55 + 3];
            client.method1052(var4);
            Statics.field302.method1290(var4);
            if (var3 != -1 && var4.field2580 == 0) {
                Statics.method3201(Statics.field1608[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field55 -= 4;
            var4.field2589 = field1087[Statics.field55];
            var4.field2590 = field1087[Statics.field55 + 1];
            var4.field2585 = field1087[Statics.field55 + 2];
            var4.field2623 = field1087[Statics.field55 + 3];
            client.method1052(var4);
            Statics.field302.method1290(var4);
            if (var3 != -1 && var4.field2580 == 0) {
                Statics.method3201(Statics.field1608[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1087[--Statics.field55] == 1;
            if (var4.field2598 != var5) {
                var4.field2598 = var5;
                client.method1052(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2718 = field1087[--Statics.field55] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2719 = field1087[--Statics.field55] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.p(ILci;ZI)I")
    public static int method1020(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1087[--Statics.field55];
            var4 = class218.method3387(var3);
        } else {
            var4 = arg2 ? Statics.field1091 : Statics.field2353;
        }
        if (arg0 == 1100) {
            Statics.field55 -= 2;
            var4.field2711 = field1087[Statics.field55];
            if (var4.field2711 > var4.field2601 - var4.field2639) {
                var4.field2711 = var4.field2601 - var4.field2639;
            }
            if (var4.field2711 < 0) {
                var4.field2711 = 0;
            }
            var4.field2568 = field1087[Statics.field55 + 1];
            if (var4.field2568 > var4.field2688 - var4.field2594) {
                var4.field2568 = var4.field2688 - var4.field2594;
            }
            if (var4.field2568 < 0) {
                var4.field2568 = 0;
            }
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2664 = field1087[--Statics.field55];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2607 = field1087[--Statics.field55] == 1;
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2609 = field1087[--Statics.field55];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2691 = field1087[--Statics.field55];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2613 = field1087[--Statics.field55];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2600 = field1087[--Statics.field55];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2700 = field1087[--Statics.field55] == 1;
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2621 = 1;
            var4.field2622 = field1087[--Statics.field55];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field55 -= 6;
            var4.field2627 = field1087[Statics.field55];
            var4.field2628 = field1087[Statics.field55 + 1];
            var4.field2629 = field1087[Statics.field55 + 2];
            var4.field2596 = field1087[Statics.field55 + 3];
            var4.field2631 = field1087[Statics.field55 + 4];
            var4.field2704 = field1087[Statics.field55 + 5];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1087[--Statics.field55];
            if (var4.field2625 != var5) {
                var4.field2625 = var5;
                var4.field2706 = 0;
                var4.field2707 = 0;
                client.method1052(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2635 = field1087[--Statics.field55] == 1;
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1086[--Statics.field376];
            if (!var6.equals(var4.field2646)) {
                var4.field2646 = var6;
                client.method1052(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2638 = field1087[--Statics.field55];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field55 -= 3;
            var4.field2642 = field1087[Statics.field55];
            var4.field2643 = field1087[Statics.field55 + 1];
            var4.field2641 = field1087[Statics.field55 + 2];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2657 = field1087[--Statics.field55] == 1;
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2617 = field1087[--Statics.field55];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2618 = field1087[--Statics.field55];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2662 = field1087[--Statics.field55] == 1;
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2615 = field1087[--Statics.field55] == 1;
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field55 -= 2;
            var4.field2601 = field1087[Statics.field55];
            var4.field2688 = field1087[Statics.field55 + 1];
            client.method1052(var4);
            if (var3 != -1 && var4.field2580 == 0) {
                Statics.method3201(Statics.field1608[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method538(var4.field2578, var4.field2579);
            client.field779 = var4;
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2614 = field1087[--Statics.field55];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2604 = field1087[--Statics.field55];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2610 = field1087[--Statics.field55];
            client.method1052(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1087[--Statics.field55];
            class323 var8 = (class323) class196.method3304(class323.method1939(), var7);
            if (var8 != null) {
                var4.field2616 = var8;
                client.method1052(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1087[--Statics.field55] == 1;
            var4.field2710 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1087[--Statics.field55] == 1;
            var4.field2636 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.h(ILci;ZI)I")
    public static int method1815(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method3387(field1087[--Statics.field55]);
        } else {
            var3 = arg2 ? Statics.field1091 : Statics.field2353;
        }
        client.method1052(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field55 -= 2;
            int var4 = field1087[Statics.field55];
            int var5 = field1087[Statics.field55 + 1];
            var3.field2644 = var4;
            var3.field2714 = var5;
            class255 var6 = class255.method1847(var4);
            var3.field2629 = var6.field3412;
            var3.field2596 = var6.field3419;
            var3.field2631 = var6.field3420;
            var3.field2627 = var6.field3421;
            var3.field2628 = var6.field3422;
            var3.field2704 = var6.field3447;
            if (arg0 == 1205) {
                var3.field2637 = 0;
            } else if (arg0 == 1212 | var6.field3423 == 1) {
                var3.field2637 = 1;
            } else {
                var3.field2637 = 2;
            }
            if (var3.field2712 > 0) {
                var3.field2704 = var3.field2704 * 32 / var3.field2712;
            } else if (var3.field2589 > 0) {
                var3.field2704 = var3.field2704 * 32 / var3.field2589;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2621 = 2;
            var3.field2622 = field1087[--Statics.field55];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2621 = 3;
            var3.field2622 = Statics.field2558.field617.method3700();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gb.y(ILci;ZI)I")
    public static int method3374(int arg0, class93 arg1, boolean arg2) {
        boolean var3 = true;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class218.method3387(field1087[--Statics.field55]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field1091 : Statics.field2353;
        }
        if (arg0 == 1300) {
            int var5 = field1087[--Statics.field55] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3757(var5, field1086[--Statics.field376]);
                return 1;
            } else {
                Statics.field376--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field55 -= 2;
            int var6 = field1087[Statics.field55];
            int var7 = field1087[Statics.field55 + 1];
            var4.field2658 = Statics.method3176(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2626 = field1087[--Statics.field55] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2660 = field1087[--Statics.field55];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2661 = field1087[--Statics.field55];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2602 = field1086[--Statics.field376];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2663 = field1086[--Statics.field376];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2702 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2720 = field1087[--Statics.field55] == 1;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field55 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1087[Statics.field55 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1087[Statics.field55 + var10];
                        var9[var10 / 2] = (byte) field1087[Statics.field55 + var10 + 1];
                    }
                }
            } else {
                Statics.field55 -= 2;
                var8 = new byte[] { (byte) field1087[Statics.field55] };
                var9 = new byte[] { (byte) field1087[Statics.field55 + 1] };
            }
            int var11 = field1087[--Statics.field55] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method245(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field55 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1087[Statics.field55] };
            byte[] var14 = new byte[] { (byte) field1087[Statics.field55 + 1] };
            method245(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field55 -= 3;
            int var15 = field1087[Statics.field55] - 1;
            int var16 = field1087[Statics.field55 + 1];
            int var17 = field1087[Statics.field55 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method44(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1087[--Statics.field55];
            int var20 = field1087[--Statics.field55];
            method44(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field55--;
            int var21 = field1087[Statics.field55] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method3727(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method3727(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("t.w(Lhl;I[B[BB)V")
    public static final void method245(class218 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2593 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2593 = new byte[11][];
            arg0.field2654 = new byte[11][];
            arg0.field2655 = new int[11];
            arg0.field2656 = new int[11];
        }
        arg0.field2593[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2652 = false;
            for (int var4 = 0; var4 < arg0.field2593.length; var4++) {
                if (arg0.field2593[var4] != null) {
                    arg0.field2652 = true;
                    break;
                }
            }
        } else {
            arg0.field2652 = true;
        }
        arg0.field2654[arg1] = arg3;
    }

    @ObfuscatedName("z.i(Lhl;IIII)V")
    public static final void method44(class218 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2655 == null) {
            throw new RuntimeException();
        }
        arg0.field2655[arg1] = arg2;
        arg0.field2656[arg1] = arg3;
    }

    @ObfuscatedName("hc.k(Lhl;II)V")
    public static final void method3727(class218 arg0, int arg1) {
        if (arg0.field2593 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2696 == null) {
            arg0.field2696 = new int[arg0.field2593.length];
        }
        arg0.field2696[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("cj.x(ILci;ZI)I")
    public static int method1998(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method3387(field1087[--Statics.field55]);
        } else {
            var3 = arg2 ? Statics.field1091 : Statics.field2353;
        }
        String var4 = field1086[--Statics.field376];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1087[--Statics.field55];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1087[--Statics.field55];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1086[--Statics.field376];
            } else {
                var7[var8] = Integer.valueOf(field1087[--Statics.field55]);
            }
        }
        int var9 = field1087[--Statics.field55];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2640 = var7;
        } else if (arg0 == 1401) {
            var3.field2669 = var7;
        } else if (arg0 == 1402) {
            var3.field2668 = var7;
        } else if (arg0 == 1403) {
            var3.field2713 = var7;
        } else if (arg0 == 1404) {
            var3.field2672 = var7;
        } else if (arg0 == 1405) {
            var3.field2673 = var7;
        } else if (arg0 == 1406) {
            var3.field2676 = var7;
        } else if (arg0 == 1407) {
            var3.field2677 = var7;
            var3.field2678 = var5;
        } else if (arg0 == 1408) {
            var3.field2683 = var7;
        } else if (arg0 == 1409) {
            var3.field2684 = var7;
        } else if (arg0 == 1410) {
            var3.field2674 = var7;
        } else if (arg0 == 1411) {
            var3.field2667 = var7;
        } else if (arg0 == 1412) {
            var3.field2671 = var7;
        } else if (arg0 == 1414) {
            var3.field2679 = var7;
            var3.field2587 = var5;
        } else if (arg0 == 1415) {
            var3.field2681 = var7;
            var3.field2682 = var5;
        } else if (arg0 == 1416) {
            var3.field2620 = var7;
        } else if (arg0 == 1417) {
            var3.field2685 = var7;
        } else if (arg0 == 1418) {
            var3.field2686 = var7;
        } else if (arg0 == 1419) {
            var3.field2687 = var7;
        } else if (arg0 == 1420) {
            var3.field2692 = var7;
        } else if (arg0 == 1421) {
            var3.field2689 = var7;
        } else if (arg0 == 1422) {
            var3.field2715 = var7;
        } else if (arg0 == 1423) {
            var3.field2717 = var7;
        } else if (arg0 == 1424) {
            var3.field2665 = var7;
        } else if (arg0 == 1425) {
            var3.field2694 = var7;
        } else if (arg0 == 1426) {
            var3.field2690 = var7;
        } else if (arg0 == 1427) {
            var3.field2693 = var7;
        } else {
            return 2;
        }
        var3.field2567 = true;
        return 1;
    }

    @ObfuscatedName("ax.o(ILci;ZB)I")
    public static int method722(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1091 : Statics.field2353;
        if (arg0 == 1500) {
            field1087[++Statics.field55 - 1] = var3.field2591;
            return 1;
        } else if (arg0 == 1501) {
            field1087[++Statics.field55 - 1] = var3.field2592;
            return 1;
        } else if (arg0 == 1502) {
            field1087[++Statics.field55 - 1] = var3.field2639;
            return 1;
        } else if (arg0 == 1503) {
            field1087[++Statics.field55 - 1] = var3.field2594;
            return 1;
        } else if (arg0 == 1504) {
            field1087[++Statics.field55 - 1] = var3.field2598 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1087[++Statics.field55 - 1] = var3.field2597;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cj.e(ILci;ZB)I")
    public static int method2017(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1091 : Statics.field2353;
        if (arg0 == 1600) {
            field1087[++Statics.field55 - 1] = var3.field2711;
            return 1;
        } else if (arg0 == 1601) {
            field1087[++Statics.field55 - 1] = var3.field2568;
            return 1;
        } else if (arg0 == 1602) {
            field1086[++Statics.field376 - 1] = var3.field2646;
            return 1;
        } else if (arg0 == 1603) {
            field1087[++Statics.field55 - 1] = var3.field2601;
            return 1;
        } else if (arg0 == 1604) {
            field1087[++Statics.field55 - 1] = var3.field2688;
            return 1;
        } else if (arg0 == 1605) {
            field1087[++Statics.field55 - 1] = var3.field2704;
            return 1;
        } else if (arg0 == 1606) {
            field1087[++Statics.field55 - 1] = var3.field2629;
            return 1;
        } else if (arg0 == 1607) {
            field1087[++Statics.field55 - 1] = var3.field2631;
            return 1;
        } else if (arg0 == 1608) {
            field1087[++Statics.field55 - 1] = var3.field2596;
            return 1;
        } else if (arg0 == 1609) {
            field1087[++Statics.field55 - 1] = var3.field2609;
            return 1;
        } else if (arg0 == 1610) {
            field1087[++Statics.field55 - 1] = var3.field2610;
            return 1;
        } else if (arg0 == 1611) {
            field1087[++Statics.field55 - 1] = var3.field2664;
            return 1;
        } else if (arg0 == 1612) {
            field1087[++Statics.field55 - 1] = var3.field2604;
            return 1;
        } else if (arg0 == 1613) {
            field1087[++Statics.field55 - 1] = var3.field2616.method26();
            return 1;
        } else if (arg0 == 1614) {
            field1087[++Statics.field55 - 1] = var3.field2636 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dn.n(ILci;ZI)I")
    public static int method2334(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1091 : Statics.field2353;
        if (arg0 == 1700) {
            field1087[++Statics.field55 - 1] = var3.field2644;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2644 == -1) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = var3.field2714;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1087[++Statics.field55 - 1] = var3.field2579;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cq.c(ILci;ZI)I")
    public static int method2038(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1091 : Statics.field2353;
        if (arg0 == 1800) {
            field1087[++Statics.field55 - 1] = class219.method1480(client.method1899(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1087[--Statics.field55];
            int var5 = var4 - 1;
            if (var3.field2702 == null || var5 >= var3.field2702.length || var3.field2702[var5] == null) {
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1086[++Statics.field376 - 1] = var3.field2702[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2602 == null) {
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1086[++Statics.field376 - 1] = var3.field2602;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.s(ILci;ZB)I")
    public static int method1594(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method3387(field1087[--Statics.field55]);
        } else {
            var3 = arg2 ? Statics.field1091 : Statics.field2353;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1096 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2693 == null) {
            return 0;
        } else {
            class63 var4 = new class63();
            var4.field570 = var3;
            var4.field568 = var3.field2693;
            var4.field578 = field1096 + 1;
            client.field842.method4563(var4);
            return 1;
        }
    }

    @ObfuscatedName("gc.t(ILci;ZS)I")
    public static int method3383(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method3387(field1087[--Statics.field55]);
        if (arg0 == 2500) {
            field1087[++Statics.field55 - 1] = var3.field2591;
            return 1;
        } else if (arg0 == 2501) {
            field1087[++Statics.field55 - 1] = var3.field2592;
            return 1;
        } else if (arg0 == 2502) {
            field1087[++Statics.field55 - 1] = var3.field2639;
            return 1;
        } else if (arg0 == 2503) {
            field1087[++Statics.field55 - 1] = var3.field2594;
            return 1;
        } else if (arg0 == 2504) {
            field1087[++Statics.field55 - 1] = var3.field2598 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1087[++Statics.field55 - 1] = var3.field2597;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.m(ILci;ZI)I")
    public static int method525(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method3387(field1087[--Statics.field55]);
        if (arg0 == 2600) {
            field1087[++Statics.field55 - 1] = var3.field2711;
            return 1;
        } else if (arg0 == 2601) {
            field1087[++Statics.field55 - 1] = var3.field2568;
            return 1;
        } else if (arg0 == 2602) {
            field1086[++Statics.field376 - 1] = var3.field2646;
            return 1;
        } else if (arg0 == 2603) {
            field1087[++Statics.field55 - 1] = var3.field2601;
            return 1;
        } else if (arg0 == 2604) {
            field1087[++Statics.field55 - 1] = var3.field2688;
            return 1;
        } else if (arg0 == 2605) {
            field1087[++Statics.field55 - 1] = var3.field2704;
            return 1;
        } else if (arg0 == 2606) {
            field1087[++Statics.field55 - 1] = var3.field2629;
            return 1;
        } else if (arg0 == 2607) {
            field1087[++Statics.field55 - 1] = var3.field2631;
            return 1;
        } else if (arg0 == 2608) {
            field1087[++Statics.field55 - 1] = var3.field2596;
            return 1;
        } else if (arg0 == 2609) {
            field1087[++Statics.field55 - 1] = var3.field2609;
            return 1;
        } else if (arg0 == 2610) {
            field1087[++Statics.field55 - 1] = var3.field2610;
            return 1;
        } else if (arg0 == 2611) {
            field1087[++Statics.field55 - 1] = var3.field2664;
            return 1;
        } else if (arg0 == 2612) {
            field1087[++Statics.field55 - 1] = var3.field2604;
            return 1;
        } else if (arg0 == 2613) {
            field1087[++Statics.field55 - 1] = var3.field2616.method26();
            return 1;
        } else if (arg0 == 2614) {
            field1087[++Statics.field55 - 1] = var3.field2636 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jc.v(ILci;ZI)I")
    public static int method4657(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class218 var3 = class218.method3387(field1087[--Statics.field55]);
            field1087[++Statics.field55 - 1] = var3.field2644;
            return 1;
        } else if (arg0 == 2701) {
            class218 var4 = class218.method3387(field1087[--Statics.field55]);
            if (var4.field2644 == -1) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = var4.field2714;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1087[--Statics.field55];
            class62 var6 = (class62) client.field804.method5549((long) var5);
            if (var6 == null) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1087[++Statics.field55 - 1] = client.field725;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("j.q(ILci;ZB)I")
    public static int method291(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method3387(field1087[--Statics.field55]);
        if (arg0 == 2800) {
            field1087[++Statics.field55 - 1] = class219.method1480(client.method1899(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1087[--Statics.field55];
            int var5 = var4 - 1;
            if (var3.field2702 == null || var5 >= var3.field2702.length || var3.field2702[var5] == null) {
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1086[++Statics.field376 - 1] = var3.field2702[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2602 == null) {
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1086[++Statics.field376 - 1] = var3.field2602;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jl.l(ILci;ZI)I")
    public static int method4688(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1086[--Statics.field376];
            class92.method151(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field55 -= 2;
            client.method276(Statics.field2558, field1087[Statics.field55], field1087[Statics.field55 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1088) {
                field1094 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1086[--Statics.field376];
            int var5 = 0;
            if (class291.method1791(var4)) {
                var5 = class291.method2316(var4);
            }
            class188 var6 = class188.method3035(class184.field2231, client.field690.field1311);
            var6.field2347.method5231(var5);
            client.field690.method2071(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1086[--Statics.field376];
            class188 var8 = class188.method3035(class184.field2278, client.field690.field1311);
            var8.field2347.method5290(var7.length() + 1);
            var8.field2347.method5129(var7);
            client.field690.method2071(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1086[--Statics.field376];
            class188 var10 = class188.method3035(class184.field2257, client.field690.field1311);
            var10.field2347.method5290(var9.length() + 1);
            var10.field2347.method5129(var9);
            client.field690.method2071(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1087[--Statics.field55];
            String var12 = field1086[--Statics.field376];
            client.method3165(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field55 -= 3;
            int var13 = field1087[Statics.field55];
            int var14 = field1087[Statics.field55 + 1];
            int var15 = field1087[Statics.field55 + 2];
            class218 var16 = class218.method3387(var15);
            Statics.method3177(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field55 -= 2;
            int var17 = field1087[Statics.field55];
            int var18 = field1087[Statics.field55 + 1];
            class218 var19 = arg2 ? Statics.field1091 : Statics.field2353;
            Statics.method3177(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field2055 = field1087[--Statics.field55] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1087[++Statics.field55 - 1] = Statics.field1978.field1055 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1978.field1055 = field1087[--Statics.field55] == 1;
            class74.method650();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1086[--Statics.field376];
            boolean var21 = field1087[--Statics.field55] == 1;
            class52.method582(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1087[--Statics.field55];
            class188 var23 = class188.method3035(class184.field2259, client.field690.field1311);
            var23.field2347.method5123(var22);
            client.field690.method2071(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1087[--Statics.field55];
            Statics.field376 -= 2;
            String var25 = field1086[Statics.field376];
            String var26 = field1086[Statics.field376 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class188 var27 = class188.method3035(class184.field2291, client.field690.field1311);
                var27.field2347.method5123(1 + class300.method3313(var25) + class300.method3313(var26));
                var27.field2347.method5129(var26);
                var27.field2347.method5290(var24);
                var27.field2347.method5129(var25);
                client.field690.method2071(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field761 = field1087[--Statics.field55] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field710 = field1087[--Statics.field55] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field762 = field1087[--Statics.field55] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1087[--Statics.field55] == 1) {
                client.field763 |= 0x1;
            } else {
                client.field763 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1087[--Statics.field55] == 1) {
                client.field763 |= 0x2;
            } else {
                client.field763 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1087[--Statics.field55] == 1) {
                client.field763 |= 0x4;
            } else {
                client.field763 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1087[--Statics.field55] == 1) {
                client.field763 |= 0x8;
            } else {
                client.field763 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field763 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field748 = field1087[--Statics.field55] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field720 = field1087[--Statics.field55] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method4859(field1087[--Statics.field55] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1087[++Statics.field55 - 1] = client.method1057() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field55 -= 2;
            client.field723 = field1087[Statics.field55];
            client.field724 = field1087[Statics.field55 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field55 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field55--;
            return 1;
        } else if (arg0 == 3132) {
            field1087[++Statics.field55 - 1] = Statics.field1873;
            field1087[++Statics.field55 - 1] = Statics.field310;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field55--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field55 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field805 = 3;
            client.field806 = field1087[--Statics.field55];
            return 1;
        } else if (arg0 == 3137) {
            client.field805 = 2;
            client.field806 = field1087[--Statics.field55];
            return 1;
        } else if (arg0 == 3138) {
            client.field805 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field805 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field805 = 3;
            client.field806 = arg2 ? Statics.field1091.field2578 : Statics.field2353.field2578;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1087[--Statics.field55] == 1;
            Statics.field1978.field1051 = var28;
            class74.method650();
            return 1;
        } else if (arg0 == 3142) {
            field1087[++Statics.field55 - 1] = Statics.field1978.field1051 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1087[--Statics.field55] == 1;
            client.field682 = var29;
            if (!var29) {
                Statics.field1978.field1056 = "";
                class74.method650();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1087[++Statics.field55 - 1] = client.field682 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1087[--Statics.field55] == 1;
            if (Statics.field1978.field1048 == var30) {
                Statics.field1978.field1048 = !var30;
                class74.method650();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1087[++Statics.field55 - 1] = Statics.field1978.field1048 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1087[++Statics.field55 - 1] = class86.field1183;
            return 1;
        } else if (arg0 == 3154) {
            field1087[++Statics.field55 - 1] = client.method4104();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field376--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field55 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field55--;
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field55--;
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field376--;
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field55--;
            field1086[++Statics.field376 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field55--;
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field55 -= 2;
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field55 -= 2;
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field55 -= 2;
            field1086[++Statics.field376 - 1] = "";
            field1086[++Statics.field376 - 1] = "";
            field1086[++Statics.field376 - 1] = "";
            field1086[++Statics.field376 - 1] = "";
            field1086[++Statics.field376 - 1] = "";
            field1086[++Statics.field376 - 1] = "";
            field1086[++Statics.field376 - 1] = "";
            field1086[++Statics.field376 - 1] = "";
            field1086[++Statics.field376 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field55--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field55--;
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field55--;
            return 1;
        } else if (arg0 == 3175) {
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field376--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field376--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ec.j(ILci;ZI)I")
    public static int method2842(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field55 -= 3;
            client.method3229(field1087[Statics.field55], field1087[Statics.field55 + 1], field1087[Statics.field55 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method1902(field1087[--Statics.field55]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field55 -= 2;
            client.method959(field1087[Statics.field55], field1087[Statics.field55 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.ad(ILci;ZI)I")
    public static int method520(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1087[++Statics.field55 - 1] = client.field655;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field55 -= 2;
            int var3 = field1087[Statics.field55];
            int var4 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = class60.method1903(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field55 -= 2;
            int var5 = field1087[Statics.field55];
            int var6 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = class60.method4900(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field55 -= 2;
            int var7 = field1087[Statics.field55];
            int var8 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = class60.method2107(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = class240.method2513(var9).field3208;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = client.field775[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = client.field776[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = client.field877[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field2321;
            int var14 = (Statics.field2558.field992 >> 7) + Statics.field429;
            int var15 = (Statics.field2558.field936 >> 7) + Statics.field3244;
            field1087[++Statics.field55 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1087[++Statics.field55 - 1] = client.field859 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field55 -= 2;
            int var19 = field1087[Statics.field55] + 32768;
            int var20 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = class60.method1903(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field55 -= 2;
            int var21 = field1087[Statics.field55] + 32768;
            int var22 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = class60.method4900(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field55 -= 2;
            int var23 = field1087[Statics.field55] + 32768;
            int var24 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = class60.method2107(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field812 >= 2) {
                field1087[++Statics.field55 - 1] = client.field812;
            } else {
                field1087[++Statics.field55 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1087[++Statics.field55 - 1] = client.field662;
            return 1;
        } else if (arg0 == 3318) {
            field1087[++Statics.field55 - 1] = client.field645;
            return 1;
        } else if (arg0 == 3321) {
            field1087[++Statics.field55 - 1] = client.field810;
            return 1;
        } else if (arg0 == 3322) {
            field1087[++Statics.field55 - 1] = client.field811;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field814) {
                field1087[++Statics.field55 - 1] = 1;
            } else {
                field1087[++Statics.field55 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1087[++Statics.field55 - 1] = client.field796;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field55 -= 4;
            int var25 = field1087[Statics.field55];
            int var26 = field1087[Statics.field55 + 1];
            int var27 = field1087[Statics.field55 + 2];
            int var28 = field1087[Statics.field55 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1087[++Statics.field55 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.am(ILci;ZI)I")
    public static int method1901(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field55 -= 2;
            int var3 = field1087[Statics.field55];
            int var4 = field1087[Statics.field55 + 1];
            class252 var5 = class252.method3379(var3);
            if (var5.field3320 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3323; var6++) {
                if (var5.field3318[var6] == var4) {
                    field1086[++Statics.field376 - 1] = var5.field3326[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1086[++Statics.field376 - 1] = var5.field3321;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field55 -= 4;
            int var7 = field1087[Statics.field55];
            int var8 = field1087[Statics.field55 + 1];
            int var9 = field1087[Statics.field55 + 2];
            int var10 = field1087[Statics.field55 + 3];
            class252 var11 = class252.method3379(var9);
            if (var11.field3322 != var7 || var11.field3320 != var8) {
                if (var8 == 115) {
                    field1086[++Statics.field376 - 1] = class225.field2777;
                } else {
                    field1087[++Statics.field55 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3323; var12++) {
                if (var11.field3318[var12] == var10) {
                    if (var8 == 115) {
                        field1086[++Statics.field376 - 1] = var11.field3326[var12];
                    } else {
                        field1087[++Statics.field55 - 1] = var11.field3325[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1086[++Statics.field376 - 1] = var11.field3321;
                } else {
                    field1087[++Statics.field55 - 1] = var11.field3324;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1087[--Statics.field55];
            class252 var14 = class252.method3379(var13);
            field1087[++Statics.field55 - 1] = var14.method4238();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("c.ai(ILci;ZB)I")
    public static int method175(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1745.field1062 == 0) {
                field1087[++Statics.field55 - 1] = -2;
            } else if (Statics.field1745.field1062 == 1) {
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = Statics.field1745.field1058.method4747();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1087[--Statics.field55];
            if (Statics.field1745.method1690() && var3 >= 0 && var3 < Statics.field1745.field1058.method4747()) {
                class284 var4 = (class284) Statics.field1745.field1058.method4757(var3);
                field1086[++Statics.field376 - 1] = var4.method4706();
                field1086[++Statics.field376 - 1] = var4.method4707();
            } else {
                field1086[++Statics.field376 - 1] = "";
                field1086[++Statics.field376 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1087[--Statics.field55];
            if (Statics.field1745.method1690() && var5 >= 0 && var5 < Statics.field1745.field1058.method4747()) {
                field1087[++Statics.field55 - 1] = ((class279) Statics.field1745.field1058.method4757(var5)).field3614;
            } else {
                field1087[++Statics.field55 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1087[--Statics.field55];
            if (Statics.field1745.method1690() && var6 >= 0 && var6 < Statics.field1745.field1058.method4747()) {
                field1087[++Statics.field55 - 1] = ((class279) Statics.field1745.field1058.method4757(var6)).field3612;
            } else {
                field1087[++Statics.field55 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1086[--Statics.field376];
            int var8 = field1087[--Statics.field55];
            class75.method3742(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1086[--Statics.field376];
            Statics.field1745.method1725(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1086[--Statics.field376];
            Statics.field1745.method1720(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1086[--Statics.field376];
            Statics.field1745.method1694(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1086[--Statics.field376];
            Statics.field1745.method1697(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1086[--Statics.field376];
            String var14 = client.method2752(var13);
            field1087[++Statics.field55 - 1] = Statics.field1745.method1691(new class283(var14, Statics.field120), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field567 == null) {
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1086[++Statics.field376 - 1] = Statics.field567.field3636;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field567 == null) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = Statics.field567.method4747();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1087[--Statics.field55];
            if (Statics.field567 == null || var15 >= Statics.field567.method4747()) {
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1086[++Statics.field376 - 1] = Statics.field567.method4757(var15).method4716().method4837();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1087[--Statics.field55];
            if (Statics.field567 == null || var16 >= Statics.field567.method4747()) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = ((class279) Statics.field567.method4757(var16)).method4818();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1087[--Statics.field55];
            if (Statics.field567 == null || var17 >= Statics.field567.method4747()) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = ((class279) Statics.field567.method4757(var17)).field3612;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1087[++Statics.field55 - 1] = Statics.field567 == null ? 0 : Statics.field567.field3638;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1086[--Statics.field376];
            client.method3174(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1087[++Statics.field55 - 1] = Statics.field567 == null ? 0 : Statics.field567.field3633;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1086[--Statics.field376];
            client.method581(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method4968();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1745.method1690()) {
                field1087[++Statics.field55 - 1] = Statics.field1745.field1061.method4747();
            } else {
                field1087[++Statics.field55 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1087[--Statics.field55];
            if (Statics.field1745.method1690() && var20 >= 0 && var20 < Statics.field1745.field1061.method4747()) {
                class278 var21 = (class278) Statics.field1745.field1061.method4757(var20);
                field1086[++Statics.field376 - 1] = var21.method4706();
                field1086[++Statics.field376 - 1] = var21.method4707();
            } else {
                field1086[++Statics.field376 - 1] = "";
                field1086[++Statics.field376 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1086[--Statics.field376];
            String var23 = client.method2752(var22);
            field1087[++Statics.field55 - 1] = Statics.field1745.method1723(new class283(var23, Statics.field120)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1087[--Statics.field55];
            if (Statics.field567 == null || var24 >= Statics.field567.method4747() || !Statics.field567.method4757(var24).method4716().equals(Statics.field2558.field607)) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field567 == null || Statics.field567.field3639 == null) {
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1086[++Statics.field376 - 1] = Statics.field567.field3639;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1087[--Statics.field55];
            if (Statics.field567 == null || var25 >= Statics.field567.method4747() || !((class273) Statics.field567.method4757(var25)).method4691()) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1087[--Statics.field55];
            if (Statics.field567 == null || var26 >= Statics.field567.method4747() || !((class273) Statics.field567.method4757(var26)).method4694()) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1745.field1058.method4764();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1058.method4771(new class314(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1058.method4771(new class315(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1058.method4771(new class158(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1058.method4771(new class152(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1058.method4771(new class157(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1058.method4771(new class160(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1058.method4771(new class156(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1058.method4771(new class154(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1058.method4771(new class153(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1058.method4771(new class155(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1745.field1058.method4758();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1745.field1061.method4764();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1061.method4771(new class314(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1061.method4771(new class315(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1745.field1061.method4758();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field567 != null) {
                Statics.field567.method4764();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1087[--Statics.field55] == 1;
            if (Statics.field567 != null) {
                Statics.field567.method4771(new class314(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1087[--Statics.field55] == 1;
            if (Statics.field567 != null) {
                Statics.field567.method4771(new class315(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1087[--Statics.field55] == 1;
            if (Statics.field567 != null) {
                Statics.field567.method4771(new class158(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1087[--Statics.field55] == 1;
            if (Statics.field567 != null) {
                Statics.field567.method4771(new class152(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1087[--Statics.field55] == 1;
            if (Statics.field567 != null) {
                Statics.field567.method4771(new class157(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1087[--Statics.field55] == 1;
            if (Statics.field567 != null) {
                Statics.field567.method4771(new class160(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1087[--Statics.field55] == 1;
            if (Statics.field567 != null) {
                Statics.field567.method4771(new class156(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1087[--Statics.field55] == 1;
            if (Statics.field567 != null) {
                Statics.field567.method4771(new class154(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1087[--Statics.field55] == 1;
            if (Statics.field567 != null) {
                Statics.field567.method4771(new class153(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1087[--Statics.field55] == 1;
            if (Statics.field567 != null) {
                Statics.field567.method4771(new class155(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field567 != null) {
                Statics.field567.method4758();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1087[--Statics.field55] == 1;
            Statics.field1745.field1058.method4771(new class159(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1087[--Statics.field55] == 1;
            if (Statics.field567 != null) {
                Statics.field567.method4771(new class159(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dc.ag(ILci;ZI)I")
    public static int method2300(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = client.field910[var3].method88();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = client.field910[var4].field62;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = client.field910[var5].field63;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = client.field910[var6].field64;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = client.field910[var7].field61;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = client.field910[var8].field66;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1087[--Statics.field55];
            int var10 = client.field910[var9].method111();
            field1087[++Statics.field55 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1087[--Statics.field55];
            int var12 = client.field910[var11].method111();
            field1087[++Statics.field55 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1087[--Statics.field55];
            int var14 = client.field910[var13].method111();
            field1087[++Statics.field55 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1087[--Statics.field55];
            int var16 = client.field910[var15].method111();
            field1087[++Statics.field55 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1087[--Statics.field55] == 1;
            if (Statics.field1436 != null) {
                Statics.field1436.method60(class7.field36, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1087[--Statics.field55] == 1;
            if (Statics.field1436 != null) {
                Statics.field1436.method60(class7.field40, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field55 -= 2;
            boolean var19 = field1087[Statics.field55] == 1;
            boolean var20 = field1087[Statics.field55 + 1] == 1;
            if (Statics.field1436 != null) {
                client.field911.field641 = var20;
                Statics.field1436.method60(client.field911, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1087[--Statics.field55] == 1;
            if (Statics.field1436 != null) {
                Statics.field1436.method60(class7.field34, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1087[--Statics.field55] == 1;
            if (Statics.field1436 != null) {
                Statics.field1436.method60(class7.field35, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1087[++Statics.field55 - 1] = Statics.field1436 == null ? 0 : Statics.field1436.field42.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1087[--Statics.field55];
            class8 var24 = (class8) Statics.field1436.field42.get(var23);
            field1087[++Statics.field55 - 1] = var24.field50;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1087[--Statics.field55];
            class8 var26 = (class8) Statics.field1436.field42.get(var25);
            field1086[++Statics.field376 - 1] = var26.method65();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1087[--Statics.field55];
            class8 var28 = (class8) Statics.field1436.field42.get(var27);
            field1086[++Statics.field376 - 1] = var28.method64();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1087[--Statics.field55];
            class8 var30 = (class8) Statics.field1436.field42.get(var29);
            long var31 = class297.method3217() - Statics.field605 - var30.field45;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1086[++Statics.field376 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1087[--Statics.field55];
            class8 var38 = (class8) Statics.field1436.field42.get(var37);
            field1087[++Statics.field55 - 1] = var38.field47.field64;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1087[--Statics.field55];
            class8 var40 = (class8) Statics.field1436.field42.get(var39);
            field1087[++Statics.field55 - 1] = var40.field47.field63;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1087[--Statics.field55];
            class8 var42 = (class8) Statics.field1436.field42.get(var41);
            field1087[++Statics.field55 - 1] = var42.field47.field62;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eu.ao(ILci;ZB)I")
    public static int method3040(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field55 -= 2;
            int var3 = field1087[Statics.field55];
            int var4 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field55 -= 2;
            int var5 = field1087[Statics.field55];
            int var6 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field55 -= 2;
            int var7 = field1087[Statics.field55];
            int var8 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field55 -= 2;
            int var9 = field1087[Statics.field55];
            int var10 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field55 -= 5;
            int var13 = field1087[Statics.field55];
            int var14 = field1087[Statics.field55 + 1];
            int var15 = field1087[Statics.field55 + 2];
            int var16 = field1087[Statics.field55 + 3];
            int var17 = field1087[Statics.field55 + 4];
            field1087[++Statics.field55 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field55 -= 2;
            int var18 = field1087[Statics.field55];
            int var19 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field55 -= 2;
            int var20 = field1087[Statics.field55];
            int var21 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field55 -= 2;
            int var22 = field1087[Statics.field55];
            int var23 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field55 -= 2;
            int var24 = field1087[Statics.field55];
            int var25 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field55 -= 2;
            int var26 = field1087[Statics.field55];
            int var27 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field55 -= 2;
            int var28 = field1087[Statics.field55];
            int var29 = field1087[Statics.field55 + 1];
            if (var28 == 0) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field55 -= 2;
            int var30 = field1087[Statics.field55];
            int var31 = field1087[Statics.field55 + 1];
            if (var30 == 0) {
                field1087[++Statics.field55 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1087[++Statics.field55 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1087[++Statics.field55 - 1] = var30;
                    break;
                case 2:
                    field1087[++Statics.field55 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1087[++Statics.field55 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1087[++Statics.field55 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1087[++Statics.field55 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field55 -= 2;
            int var32 = field1087[Statics.field55];
            int var33 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field55 -= 2;
            int var34 = field1087[Statics.field55];
            int var35 = field1087[Statics.field55 + 1];
            field1087[++Statics.field55 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field55 -= 3;
            long var36 = (long) field1087[Statics.field55];
            long var38 = (long) field1087[Statics.field55 + 1];
            long var40 = (long) field1087[Statics.field55 + 2];
            field1087[++Statics.field55 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("af.aw(ILci;ZI)I")
    public static int method332(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1086[--Statics.field376];
            int var4 = field1087[--Statics.field55];
            field1086[++Statics.field376 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field376 -= 2;
            String var5 = field1086[Statics.field376];
            String var6 = field1086[Statics.field376 + 1];
            field1086[++Statics.field376 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1086[--Statics.field376];
            int var8 = field1087[--Statics.field55];
            field1086[++Statics.field376 - 1] = var7 + class291.method4183(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1086[--Statics.field376];
            field1086[++Statics.field376 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1087[--Statics.field55];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1092.setTime(new Date(var11));
            int var13 = field1092.get(5);
            int var14 = field1092.get(2);
            int var15 = field1092.get(1);
            field1086[++Statics.field376 - 1] = var13 + "-" + field1093[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field376 -= 2;
            String var16 = field1086[Statics.field376];
            String var17 = field1086[Statics.field376 + 1];
            if (Statics.field2558.field617 != null && Statics.field2558.field617.field2542) {
                field1086[++Statics.field376 - 1] = var17;
            } else {
                field1086[++Statics.field376 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1087[--Statics.field55];
            field1086[++Statics.field376 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field376 -= 2;
            field1087[++Statics.field55 - 1] = class291.method4853(class287.method3941(field1086[Statics.field376], field1086[Statics.field376 + 1], Statics.field3299));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1086[--Statics.field376];
            Statics.field55 -= 2;
            int var20 = field1087[Statics.field55];
            int var21 = field1087[Statics.field55 + 1];
            byte[] var22 = Statics.field3565.method3928(var21, 0);
            class295 var23 = new class295(var22);
            field1087[++Statics.field55 - 1] = var23.method4991(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1086[--Statics.field376];
            Statics.field55 -= 2;
            int var25 = field1087[Statics.field55];
            int var26 = field1087[Statics.field55 + 1];
            byte[] var27 = Statics.field3565.method3928(var26, 0);
            class295 var28 = new class295(var27);
            field1087[++Statics.field55 - 1] = var28.method4990(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field376 -= 2;
            String var29 = field1086[Statics.field376];
            String var30 = field1086[Statics.field376 + 1];
            if (field1087[--Statics.field55] == 1) {
                field1086[++Statics.field376 - 1] = var29;
            } else {
                field1086[++Statics.field376 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1086[--Statics.field376];
            field1086[++Statics.field376 - 1] = class296.method4992(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1086[--Statics.field376];
            int var33 = field1087[--Statics.field55];
            field1086[++Statics.field376 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = Statics.method2622((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = class291.method2015((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = class291.method4453((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = class291.method274((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1086[--Statics.field376];
            if (var38 == null) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1086[--Statics.field376];
            Statics.field55 -= 2;
            int var40 = field1087[Statics.field55];
            int var41 = field1087[Statics.field55 + 1];
            field1086[++Statics.field376 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1086[--Statics.field376];
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
            field1086[++Statics.field376 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1086[--Statics.field376];
            int var48 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field376 -= 2;
            String var49 = field1086[Statics.field376];
            String var50 = field1086[Statics.field376 + 1];
            int var51 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1086[--Statics.field376];
            field1086[++Statics.field376 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.ak(ILci;ZI)I")
    public static int method46(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1087[--Statics.field55];
            field1086[++Statics.field376 - 1] = class255.method1847(var3).field3450;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field55 -= 2;
            int var4 = field1087[Statics.field55];
            int var5 = field1087[Statics.field55 + 1];
            class255 var6 = class255.method1847(var4);
            if (var5 < 1 || var5 > 5 || var6.field3426[var5 - 1] == null) {
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1086[++Statics.field376 - 1] = var6.field3426[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field55 -= 2;
            int var7 = field1087[Statics.field55];
            int var8 = field1087[Statics.field55 + 1];
            class255 var9 = class255.method1847(var7);
            if (var8 < 1 || var8 > 5 || var9.field3427[var8 - 1] == null) {
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1086[++Statics.field376 - 1] = var9.field3427[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = class255.method1847(var10).field3416;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = class255.method1847(var11).field3423 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1087[--Statics.field55];
            class255 var13 = class255.method1847(var12);
            if (var13.field3444 == -1 && var13.field3429 >= 0) {
                field1087[++Statics.field55 - 1] = var13.field3429;
            } else {
                field1087[++Statics.field55 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1087[--Statics.field55];
            class255 var15 = class255.method1847(var14);
            if (var15.field3444 >= 0 && var15.field3429 >= 0) {
                field1087[++Statics.field55 - 1] = var15.field3429;
            } else {
                field1087[++Statics.field55 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = class255.method1847(var16).field3425 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1087[--Statics.field55];
            class255 var18 = class255.method1847(var17);
            if (var18.field3456 == -1 && var18.field3455 >= 0) {
                field1087[++Statics.field55 - 1] = var18.field3455;
            } else {
                field1087[++Statics.field55 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1087[--Statics.field55];
            class255 var20 = class255.method1847(var19);
            if (var20.field3456 >= 0 && var20.field3455 >= 0) {
                field1087[++Statics.field55 - 1] = var20.field3455;
            } else {
                field1087[++Statics.field55 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1086[--Statics.field376];
            int var22 = field1087[--Statics.field55];
            client.method1069(var21, var22 == 1);
            field1087[++Statics.field55 - 1] = Statics.field1980;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field2495 == null || Statics.field78 >= Statics.field1980) {
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = Statics.field2495[++Statics.field78 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field78 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gl.aa(ILci;ZI)I")
    public static int method3408(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1087[++Statics.field55 - 1] = client.field860;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field55 -= 3;
            client.field860 = field1087[Statics.field55];
            Statics.field2469 = class310.method4721(field1087[Statics.field55 + 1]);
            if (Statics.field2469 == null) {
                Statics.field2469 = class310.field3793;
            }
            client.field855 = field1087[Statics.field55 + 2];
            class188 var3 = class188.method3035(class184.field2271, client.field690.field1311);
            var3.field2347.method5290(client.field860);
            var3.field2347.method5290(Statics.field2469.field3796);
            var3.field2347.method5290(client.field855);
            client.field690.method2071(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1086[--Statics.field376];
            Statics.field55 -= 2;
            int var5 = field1087[Statics.field55];
            int var6 = field1087[Statics.field55 + 1];
            class188 var7 = class188.method3035(class184.field2313, client.field690.field1311);
            var7.field2347.method5290(class300.method3313(var4) + 2);
            var7.field2347.method5129(var4);
            var7.field2347.method5290(var5 - 1);
            var7.field2347.method5290(var6);
            client.field690.method2071(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field55 -= 2;
            int var8 = field1087[Statics.field55];
            int var9 = field1087[Statics.field55 + 1];
            class65 var10 = class92.method3427(var8, var9);
            if (var10 == null) {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = 0;
                field1086[++Statics.field376 - 1] = "";
                field1086[++Statics.field376 - 1] = "";
                field1086[++Statics.field376 - 1] = "";
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = var10.field596;
                field1087[++Statics.field55 - 1] = var10.field592;
                field1086[++Statics.field376 - 1] = var10.field603 == null ? "" : var10.field603;
                field1086[++Statics.field376 - 1] = var10.field594 == null ? "" : var10.field594;
                field1086[++Statics.field376 - 1] = var10.field600 == null ? "" : var10.field600;
                field1087[++Statics.field55 - 1] = var10.method1061() ? 1 : (var10.method1064() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1087[--Statics.field55];
            class65 var12 = class92.method4891(var11);
            if (var12 == null) {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = 0;
                field1086[++Statics.field376 - 1] = "";
                field1086[++Statics.field376 - 1] = "";
                field1086[++Statics.field376 - 1] = "";
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = var12.field595;
                field1087[++Statics.field55 - 1] = var12.field592;
                field1086[++Statics.field376 - 1] = var12.field603 == null ? "" : var12.field603;
                field1086[++Statics.field376 - 1] = var12.field594 == null ? "" : var12.field594;
                field1086[++Statics.field376 - 1] = var12.field600 == null ? "" : var12.field600;
                field1087[++Statics.field55 - 1] = var12.method1061() ? 1 : (var12.method1064() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2469 == null) {
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = Statics.field2469.field3796;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1086[--Statics.field376];
            int var14 = field1087[--Statics.field55];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class225.field2949)) {
                var16 = 0;
                var13 = var13.substring(class225.field2949.length());
            } else if (var15.startsWith(class225.field2939)) {
                var16 = 1;
                var13 = var13.substring(class225.field2939.length());
            } else if (var15.startsWith(class225.field2953)) {
                var16 = 2;
                var13 = var13.substring(class225.field2953.length());
            } else if (var15.startsWith(class225.field2955)) {
                var16 = 3;
                var13 = var13.substring(class225.field2955.length());
            } else if (var15.startsWith(class225.field2957)) {
                var16 = 4;
                var13 = var13.substring(class225.field2957.length());
            } else if (var15.startsWith(class225.field2959)) {
                var16 = 5;
                var13 = var13.substring(class225.field2959.length());
            } else if (var15.startsWith(class225.field2961)) {
                var16 = 6;
                var13 = var13.substring(class225.field2961.length());
            } else if (var15.startsWith(class225.field2963)) {
                var16 = 7;
                var13 = var13.substring(class225.field2963.length());
            } else if (var15.startsWith(class225.field2965)) {
                var16 = 8;
                var13 = var13.substring(class225.field2965.length());
            } else if (var15.startsWith(class225.field2890)) {
                var16 = 9;
                var13 = var13.substring(class225.field2890.length());
            } else if (var15.startsWith(class225.field2969)) {
                var16 = 10;
                var13 = var13.substring(class225.field2969.length());
            } else if (var15.startsWith(class225.field2971)) {
                var16 = 11;
                var13 = var13.substring(class225.field2971.length());
            } else if (Statics.field3299 != class191.field2360) {
                if (var15.startsWith(class225.field2864)) {
                    var16 = 0;
                    var13 = var13.substring(class225.field2864.length());
                } else if (var15.startsWith(class225.field2952)) {
                    var16 = 1;
                    var13 = var13.substring(class225.field2952.length());
                } else if (var15.startsWith(class225.field2954)) {
                    var16 = 2;
                    var13 = var13.substring(class225.field2954.length());
                } else if (var15.startsWith(class225.field2881)) {
                    var16 = 3;
                    var13 = var13.substring(class225.field2881.length());
                } else if (var15.startsWith(class225.field2859)) {
                    var16 = 4;
                    var13 = var13.substring(class225.field2859.length());
                } else if (var15.startsWith(class225.field2951)) {
                    var16 = 5;
                    var13 = var13.substring(class225.field2951.length());
                } else if (var15.startsWith(class225.field2962)) {
                    var16 = 6;
                    var13 = var13.substring(class225.field2962.length());
                } else if (var15.startsWith(class225.field2964)) {
                    var16 = 7;
                    var13 = var13.substring(class225.field2964.length());
                } else if (var15.startsWith(class225.field2966)) {
                    var16 = 8;
                    var13 = var13.substring(class225.field2966.length());
                } else if (var15.startsWith(class225.field2968)) {
                    var16 = 9;
                    var13 = var13.substring(class225.field2968.length());
                } else if (var15.startsWith(class225.field2970)) {
                    var16 = 10;
                    var13 = var13.substring(class225.field2970.length());
                } else if (var15.startsWith(class225.field2972)) {
                    var16 = 11;
                    var13 = var13.substring(class225.field2972.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class225.field2973)) {
                var18 = 1;
                var13 = var13.substring(class225.field2973.length());
            } else if (var17.startsWith(class225.field2814)) {
                var18 = 2;
                var13 = var13.substring(class225.field2814.length());
            } else if (var17.startsWith(class225.field2977)) {
                var18 = 3;
                var13 = var13.substring(class225.field2977.length());
            } else if (var17.startsWith(class225.field2979)) {
                var18 = 4;
                var13 = var13.substring(class225.field2979.length());
            } else if (var17.startsWith(class225.field2915)) {
                var18 = 5;
                var13 = var13.substring(class225.field2915.length());
            } else if (Statics.field3299 != class191.field2360) {
                if (var17.startsWith(class225.field2974)) {
                    var18 = 1;
                    var13 = var13.substring(class225.field2974.length());
                } else if (var17.startsWith(class225.field2838)) {
                    var18 = 2;
                    var13 = var13.substring(class225.field2838.length());
                } else if (var17.startsWith(class225.field2978)) {
                    var18 = 3;
                    var13 = var13.substring(class225.field2978.length());
                } else if (var17.startsWith(class225.field2992)) {
                    var18 = 4;
                    var13 = var13.substring(class225.field2992.length());
                } else if (var17.startsWith(class225.field2982)) {
                    var18 = 5;
                    var13 = var13.substring(class225.field2982.length());
                }
            }
            class188 var19 = class188.method3035(class184.field2306, client.field690.field1311);
            var19.field2347.method5290(0);
            int var20 = var19.field2347.field3707;
            var19.field2347.method5290(var14);
            var19.field2347.method5290(var16);
            var19.field2347.method5290(var18);
            class211.method4932(var19.field2347, var13);
            var19.field2347.method5303(var19.field2347.field3707 - var20);
            client.field690.method2071(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field376 -= 2;
            String var21 = field1086[Statics.field376];
            String var22 = field1086[Statics.field376 + 1];
            class188 var23 = class188.method3035(class184.field2230, client.field690.field1311);
            var23.field2347.method5123(0);
            int var24 = var23.field2347.field3707;
            var23.field2347.method5129(var21);
            class211.method4932(var23.field2347, var22);
            var23.field2347.method5134(var23.field2347.field3707 - var24);
            client.field690.method2071(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field2558 == null || Statics.field2558.field607 == null) {
                var25 = "";
            } else {
                var25 = Statics.field2558.field607.method4837();
            }
            field1086[++Statics.field376 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1087[++Statics.field55 - 1] = client.field855;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = class92.method3410(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = class92.method652(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = class92.method3271(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1086[--Statics.field376];
            client.method155(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field861 = field1086[--Statics.field376].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1086[++Statics.field376 - 1] = client.field861;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1086[--Statics.field376];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("r.ab(ILci;ZI)I")
    public static int method173(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1087[++Statics.field55 - 1] = client.method673();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1087[--Statics.field55];
            if (var3 == 1 || var3 == 2) {
                client.method961(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1087[++Statics.field55 - 1] = Statics.field1978.field1050;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1087[--Statics.field55];
            if (var4 == 1 || var4 == 2) {
                Statics.field1978.field1050 = var4;
                class74.method650();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field55--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("c.ar(ILci;ZI)I")
    public static int method176(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field55 -= 2;
            int var3 = field1087[Statics.field55];
            int var4 = field1087[Statics.field55 + 1];
            if (!client.field887) {
                client.field712 = var3;
                client.field713 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1087[++Statics.field55 - 1] = client.field712;
            return 1;
        } else if (arg0 == 5506) {
            field1087[++Statics.field55 - 1] = client.field713;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1087[--Statics.field55];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field758 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1087[++Statics.field55 - 1] = client.field758;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cj.av(ILci;ZB)I")
    public static int method1991(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field870 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.aq(IB)I")
    public static int method279(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("fr.ac(II)I")
    public static int method3236(int arg0) {
        return (int) ((Math.log((double) arg0) / field1083 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("c.az(ILci;ZB)I")
    public static int method177(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field55 -= 2;
            client.field881 = (short) method279(field1087[Statics.field55]);
            if (client.field881 <= 0) {
                client.field881 = 256;
            }
            client.field894 = (short) method279(field1087[Statics.field55 + 1]);
            if (client.field894 <= 0) {
                client.field894 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field55 -= 2;
            client.field895 = (short) field1087[Statics.field55];
            if (client.field895 <= 0) {
                client.field895 = 256;
            }
            client.field896 = (short) field1087[Statics.field55 + 1];
            if (client.field896 <= 0) {
                client.field896 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field55 -= 4;
            client.field897 = (short) field1087[Statics.field55];
            if (client.field897 <= 0) {
                client.field897 = 1;
            }
            client.field898 = (short) field1087[Statics.field55 + 1];
            if (client.field898 <= 0) {
                client.field898 = 32767;
            } else if (client.field898 < client.field897) {
                client.field898 = client.field897;
            }
            client.field786 = (short) field1087[Statics.field55 + 2];
            if (client.field786 <= 0) {
                client.field786 = 1;
            }
            client.field680 = (short) field1087[Statics.field55 + 3];
            if (client.field680 <= 0) {
                client.field680 = 32767;
            } else if (client.field680 < client.field786) {
                client.field680 = client.field786;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field825 == null) {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = -1;
            } else {
                client.method3235(0, 0, client.field825.field2639, client.field825.field2594, false);
                field1087[++Statics.field55 - 1] = client.field903;
                field1087[++Statics.field55 - 1] = client.field904;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1087[++Statics.field55 - 1] = client.field895;
            field1087[++Statics.field55 - 1] = client.field896;
            return 1;
        } else if (arg0 == 6205) {
            field1087[++Statics.field55 - 1] = method3236(client.field881);
            field1087[++Statics.field55 - 1] = method3236(client.field894);
            return 1;
        } else if (arg0 == 6220) {
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1087[++Statics.field55 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1087[++Statics.field55 - 1] = Statics.field1873;
            return 1;
        } else if (arg0 == 6223) {
            field1087[++Statics.field55 - 1] = Statics.field310;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("em.at(ILci;ZI)I")
    public static int method3034(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1087[++Statics.field55 - 1] = class72.method724() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class72 var3 = class72.method3730();
            if (var3 == null) {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = 0;
                field1086[++Statics.field376 - 1] = "";
                field1087[++Statics.field55 - 1] = 0;
                field1087[++Statics.field55 - 1] = 0;
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1087[++Statics.field55 - 1] = var3.field1011;
                field1087[++Statics.field55 - 1] = var3.field1005;
                field1086[++Statics.field376 - 1] = var3.field1016;
                field1087[++Statics.field55 - 1] = var3.field1008;
                field1087[++Statics.field55 - 1] = var3.field1013;
                field1086[++Statics.field376 - 1] = var3.field1014;
            }
            return 1;
        } else if (arg0 == 6502) {
            class72 var4 = class72.method12();
            if (var4 == null) {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = 0;
                field1086[++Statics.field376 - 1] = "";
                field1087[++Statics.field55 - 1] = 0;
                field1087[++Statics.field55 - 1] = 0;
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1087[++Statics.field55 - 1] = var4.field1011;
                field1087[++Statics.field55 - 1] = var4.field1005;
                field1086[++Statics.field376 - 1] = var4.field1016;
                field1087[++Statics.field55 - 1] = var4.field1008;
                field1087[++Statics.field55 - 1] = var4.field1013;
                field1086[++Statics.field376 - 1] = var4.field1014;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1087[--Statics.field55];
            class72 var6 = null;
            for (int var7 = 0; var7 < class72.field1017; var7++) {
                if (Statics.field2752[var7].field1011 == var5) {
                    var6 = Statics.field2752[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = 0;
                field1086[++Statics.field376 - 1] = "";
                field1087[++Statics.field55 - 1] = 0;
                field1087[++Statics.field55 - 1] = 0;
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1087[++Statics.field55 - 1] = var6.field1011;
                field1087[++Statics.field55 - 1] = var6.field1005;
                field1086[++Statics.field376 - 1] = var6.field1016;
                field1087[++Statics.field55 - 1] = var6.field1008;
                field1087[++Statics.field55 - 1] = var6.field1013;
                field1086[++Statics.field376 - 1] = var6.field1014;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field55 -= 4;
            int var8 = field1087[Statics.field55];
            boolean var9 = field1087[Statics.field55 + 1] == 1;
            int var10 = field1087[Statics.field55 + 2];
            boolean var11 = field1087[Statics.field55 + 3] == 1;
            class72.method661(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1087[--Statics.field55];
            if (var12 >= 0 && var12 < class72.field1017) {
                class72 var13 = Statics.field2752[var12];
                field1087[++Statics.field55 - 1] = var13.field1011;
                field1087[++Statics.field55 - 1] = var13.field1005;
                field1086[++Statics.field376 - 1] = var13.field1016;
                field1087[++Statics.field55 - 1] = var13.field1008;
                field1087[++Statics.field55 - 1] = var13.field1013;
                field1086[++Statics.field376 - 1] = var13.field1014;
            } else {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = 0;
                field1086[++Statics.field376 - 1] = "";
                field1087[++Statics.field55 - 1] = 0;
                field1087[++Statics.field55 - 1] = 0;
                field1086[++Statics.field376 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field788 = field1087[--Statics.field55] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field55 -= 2;
            int var14 = field1087[Statics.field55];
            int var15 = field1087[Statics.field55 + 1];
            class250 var16 = class250.method3538(var15);
            if (var16.method4191()) {
                field1086[++Statics.field376 - 1] = class257.method4083(var14).method4402(var15, var16.field3309);
            } else {
                field1087[++Statics.field55 - 1] = class257.method4083(var14).method4401(var15, var16.field3307);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field55 -= 2;
            int var17 = field1087[Statics.field55];
            int var18 = field1087[Statics.field55 + 1];
            class250 var19 = class250.method3538(var18);
            if (var19.method4191()) {
                field1086[++Statics.field376 - 1] = class254.method3048(var17).method4294(var18, var19.field3309);
            } else {
                field1087[++Statics.field55 - 1] = class254.method3048(var17).method4293(var18, var19.field3307);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field55 -= 2;
            int var20 = field1087[Statics.field55];
            int var21 = field1087[Statics.field55 + 1];
            class250 var22 = class250.method3538(var21);
            if (var22.method4191()) {
                field1086[++Statics.field376 - 1] = class255.method1847(var20).method4352(var21, var22.field3309);
            } else {
                field1087[++Statics.field55 - 1] = class255.method1847(var20).method4369(var21, var22.field3307);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field55 -= 2;
            int var23 = field1087[Statics.field55];
            int var24 = field1087[Statics.field55 + 1];
            class250 var25 = class250.method3538(var24);
            if (var25.method4191()) {
                field1086[++Statics.field376 - 1] = class251.method2106(var23).method4208(var24, var25.field3309);
            } else {
                field1087[++Statics.field55 - 1] = class251.method2106(var23).method4231(var24, var25.field3307);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1087[++Statics.field55 - 1] = client.field651 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1087[++Statics.field55 - 1] = client.field650 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field376--;
            Statics.field55--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field376--;
            Statics.field55--;
            return 1;
        } else if (arg0 == 6524) {
            field1087[++Statics.field55 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1087[++Statics.field55 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1087[++Statics.field55 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.ae(ILci;ZI)I")
    public static int method58(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field2321;
            int var4 = (Statics.field2558.field992 >> 7) + Statics.field429;
            int var5 = (Statics.field2558.field936 >> 7) + Statics.field3244;
            client.method3240().method5861(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1087[--Statics.field55];
            String var7 = "";
            class27 var8 = client.method3240().method5906(var6);
            if (var8 != null) {
                var7 = var8.method316();
            }
            field1086[++Statics.field376 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1087[--Statics.field55];
            client.method3240().method5867(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1087[++Statics.field55 - 1] = client.method3240().method5866();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1087[--Statics.field55];
            client.method3240().method5878(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1087[++Statics.field55 - 1] = client.method3240().method5883() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class214 var11 = new class214(field1087[--Statics.field55]);
            client.method3240().method5885(var11.field2536, var11.field2535);
            return 1;
        } else if (arg0 == 6607) {
            class214 var12 = new class214(field1087[--Statics.field55]);
            client.method3240().method5977(var12.field2536, var12.field2535);
            return 1;
        } else if (arg0 == 6608) {
            class214 var13 = new class214(field1087[--Statics.field55]);
            client.method3240().method5912(var13.field2540, var13.field2536, var13.field2535);
            return 1;
        } else if (arg0 == 6609) {
            class214 var14 = new class214(field1087[--Statics.field55]);
            client.method3240().method5888(var14.field2540, var14.field2536, var14.field2535);
            return 1;
        } else if (arg0 == 6610) {
            field1087[++Statics.field55 - 1] = client.method3240().method5889();
            field1087[++Statics.field55 - 1] = client.method3240().method5890();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1087[--Statics.field55];
            class27 var16 = client.method3240().method5906(var15);
            if (var16 == null) {
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = var16.method318().method3677();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1087[--Statics.field55];
            class27 var18 = client.method3240().method5906(var17);
            if (var18 == null) {
                field1087[++Statics.field55 - 1] = 0;
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = (var18.method307() - var18.method306() + 1) * 64;
                field1087[++Statics.field55 - 1] = (var18.method309() - var18.method308() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1087[--Statics.field55];
            class27 var20 = client.method3240().method5906(var19);
            if (var20 == null) {
                field1087[++Statics.field55 - 1] = 0;
                field1087[++Statics.field55 - 1] = 0;
                field1087[++Statics.field55 - 1] = 0;
                field1087[++Statics.field55 - 1] = 0;
            } else {
                field1087[++Statics.field55 - 1] = var20.method306() * 64;
                field1087[++Statics.field55 - 1] = var20.method308() * 64;
                field1087[++Statics.field55 - 1] = var20.method307() * 64 + 64 - 1;
                field1087[++Statics.field55 - 1] = var20.method309() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1087[--Statics.field55];
            class27 var22 = client.method3240().method5906(var21);
            if (var22 == null) {
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = var22.method305();
            }
            return 1;
        } else if (arg0 == 6615) {
            class214 var23 = client.method3240().method5954();
            if (var23 == null) {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = var23.field2536;
                field1087[++Statics.field55 - 1] = var23.field2535;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1087[++Statics.field55 - 1] = client.method3240().method5868();
            return 1;
        } else if (arg0 == 6617) {
            class214 var24 = new class214(field1087[--Statics.field55]);
            class27 var25 = client.method3240().method5972();
            if (var25 == null) {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method297(var24.field2540, var24.field2536, var24.field2535);
            if (var26 == null) {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = var26[0];
                field1087[++Statics.field55 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class214 var27 = new class214(field1087[--Statics.field55]);
            class27 var28 = client.method3240().method5972();
            if (var28 == null) {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = -1;
                return 1;
            }
            class214 var29 = var28.method298(var27.field2536, var27.field2535);
            if (var29 == null) {
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = var29.method3677();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field55 -= 2;
            int var30 = field1087[Statics.field55];
            class214 var31 = new class214(field1087[Statics.field55 + 1]);
            method720(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field55 -= 2;
            int var32 = field1087[Statics.field55];
            class214 var33 = new class214(field1087[Statics.field55 + 1]);
            method720(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field55 -= 2;
            int var34 = field1087[Statics.field55];
            class214 var35 = new class214(field1087[Statics.field55 + 1]);
            class27 var36 = client.method3240().method5906(var34);
            if (var36 == null) {
                field1087[++Statics.field55 - 1] = 0;
                return 1;
            } else {
                field1087[++Statics.field55 - 1] = var36.method295(var35.field2540, var35.field2536, var35.field2535) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1087[++Statics.field55 - 1] = client.method3240().method5892();
            field1087[++Statics.field55 - 1] = client.method3240().method5893();
            return 1;
        } else if (arg0 == 6623) {
            class214 var37 = new class214(field1087[--Statics.field55]);
            class27 var38 = client.method3240().method5865(var37.field2540, var37.field2536, var37.field2535);
            if (var38 == null) {
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = var38.method300();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method3240().method5894(field1087[--Statics.field55]);
            return 1;
        } else if (arg0 == 6625) {
            client.method3240().method5895();
            return 1;
        } else if (arg0 == 6626) {
            client.method3240().method5896(field1087[--Statics.field55]);
            return 1;
        } else if (arg0 == 6627) {
            client.method3240().method5897();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1087[--Statics.field55] == 1;
            client.method3240().method5898(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1087[--Statics.field55];
            client.method3240().method5900(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1087[--Statics.field55];
            client.method3240().method5981(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method3240().method5999();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1087[--Statics.field55] == 1;
            client.method3240().method5902(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field55 -= 2;
            int var43 = field1087[Statics.field55];
            boolean var44 = field1087[Statics.field55 + 1] == 1;
            client.method3240().method5903(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field55 -= 2;
            int var45 = field1087[Statics.field55];
            boolean var46 = field1087[Statics.field55 + 1] == 1;
            client.method3240().method5904(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1087[++Statics.field55 - 1] = client.method3240().method5905() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = client.method3240().method5886(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1087[--Statics.field55];
            field1087[++Statics.field55 - 1] = client.method3240().method5918(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field55 -= 2;
            int var49 = field1087[Statics.field55];
            class214 var50 = new class214(field1087[Statics.field55 + 1]);
            class214 var51 = client.method3240().method5910(var49, var50);
            if (var51 == null) {
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = var51.method3677();
            }
            return 1;
        } else if (arg0 == 6639) {
            class35 var52 = client.method3240().method5952();
            if (var52 == null) {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = var52.method191();
                field1087[++Statics.field55 - 1] = var52.field294.method3677();
            }
            return 1;
        } else if (arg0 == 6640) {
            class35 var53 = client.method3240().method5913();
            if (var53 == null) {
                field1087[++Statics.field55 - 1] = -1;
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = var53.method191();
                field1087[++Statics.field55 - 1] = var53.field294.method3677();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1087[--Statics.field55];
            class242 var55 = class242.method2014(var54);
            if (var55.field3224 == null) {
                field1086[++Statics.field376 - 1] = "";
            } else {
                field1086[++Statics.field376 - 1] = var55.field3224;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1087[--Statics.field55];
            class242 var57 = class242.method2014(var56);
            field1087[++Statics.field55 - 1] = var57.field3226;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1087[--Statics.field55];
            class242 var59 = class242.method2014(var58);
            if (var59 == null) {
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = var59.field3238;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1087[--Statics.field55];
            class242 var61 = class242.method2014(var60);
            if (var61 == null) {
                field1087[++Statics.field55 - 1] = -1;
            } else {
                field1087[++Statics.field55 - 1] = var61.field3233;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1087[++Statics.field55 - 1] = Statics.field1273.field356;
            return 1;
        } else if (arg0 == 6698) {
            field1087[++Statics.field55 - 1] = Statics.field1273.field357.method3677();
            return 1;
        } else if (arg0 == 6699) {
            field1087[++Statics.field55 - 1] = Statics.field1273.field358.method3677();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eb.aj(IB)V")
    public static void method3136(int arg0) {
        if (arg0 == -1 || !class218.method3170(arg0)) {
            return;
        }
        class218[] var1 = Statics.field1608[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3.field2698 != null) {
                class63 var4 = new class63();
                var4.field570 = var3;
                var4.field568 = var3.field2698;
                method124(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("ax.ap(ILhx;ZB)V")
    public static void method720(int arg0, class214 arg1, boolean arg2) {
        class27 var3 = client.method3240().method5906(arg0);
        int var4 = Statics.field2558.field627;
        int var5 = (Statics.field2558.field992 >> 7) + Statics.field429;
        int var6 = (Statics.field2558.field936 >> 7) + Statics.field3244;
        class214 var7 = new class214(var4, var5, var6);
        client.method3240().method5933(var3, var7, arg1, arg2);
    }
}
