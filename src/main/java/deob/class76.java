package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bx")
public class class76 {

    @ObfuscatedName("bx.h")
    public static int[] field1070 = new int[5];

    @ObfuscatedName("bx.f")
    public static int[][] field1072 = new int[5][5000];

    @ObfuscatedName("bx.p")
    public static int[] field1074 = new int[1000];

    @ObfuscatedName("bx.q")
    public static String[] field1076 = new String[1000];

    @ObfuscatedName("bx.n")
    public static int field1078 = 0;

    @ObfuscatedName("bx.e")
    public static class57[] field1084 = new class57[50];

    @ObfuscatedName("bx.l")
    public static Calendar field1077 = Calendar.getInstance();

    @ObfuscatedName("bx.o")
    public static final String[] field1071 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bx.y")
    public static boolean field1079 = false;

    @ObfuscatedName("bx.k")
    public static boolean field1080 = false;

    @ObfuscatedName("bx.v")
    public static int field1081 = 0;

    @ObfuscatedName("bx.c")
    public static final double field1082 = Math.log(2.0D);

    public class76() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gc.a(Lbr;I)V")
    public static void method3778(class63 arg0) {
        method657(arg0, 500000);
    }

    @ObfuscatedName("ar.s(Lbr;II)V")
    public static void method657(class63 arg0, int arg1) {
        Object[] var2 = arg0.field580;
        class92 var4;
        if (class304.method1586(arg0.field582)) {
            Statics.field377 = (class42) var2[0];
            class263 var3 = class263.method379(Statics.field377.field362);
            var4 = Statics.method75(arg0.field582, var3.field3325, var3.field3343);
        } else {
            int var5 = (Integer) var2[0];
            var4 = Statics.method1883(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field1073 = 0;
        Statics.field2439 = 0;
        int var6 = -1;
        int[] var7 = var4.field1271;
        int[] var8 = var4.field1269;
        byte var9 = -1;
        field1078 = 0;
        field1079 = false;
        try {
            Statics.field1069 = new int[var4.field1273];
            int var10 = 0;
            Statics.field103 = new String[var4.field1274];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field576;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field577;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field575 == null ? -1 : arg0.field575.field2690;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field581;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field575 == null ? -1 : arg0.field575.field2691;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field579 == null ? -1 : arg0.field579.field2690;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field579 == null ? -1 : arg0.field579.field2691;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field585;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field573;
                    }
                    Statics.field1069[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field578;
                    }
                    Statics.field103[var11++] = var14;
                }
            }
            int var15 = 0;
            field1081 = arg0.field583;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1269[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method61(var53, var4, var43);
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
                    field1074[++Statics.field1073 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1074[++Statics.field1073 - 1] = class234.field2648[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class234.field2648[var17] = field1074[--Statics.field1073];
                    client.method71(var17);
                } else if (var53 == 3) {
                    field1076[++Statics.field2439 - 1] = var4.field1278[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field1073 -= 2;
                    if (field1074[Statics.field1073] != field1074[Statics.field1073 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field1073 -= 2;
                    if (field1074[Statics.field1073] == field1074[Statics.field1073 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field1073 -= 2;
                    if (field1074[Statics.field1073] < field1074[Statics.field1073 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field1073 -= 2;
                    if (field1074[Statics.field1073] > field1074[Statics.field1073 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1078 == 0) {
                        return;
                    }
                    class57 var18 = field1084[--field1078];
                    var4 = var18.field525;
                    var7 = var4.field1271;
                    var8 = var4.field1269;
                    var6 = var18.field524;
                    Statics.field1069 = var18.field523;
                    Statics.field103 = var18.field526;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1074[++Statics.field1073 - 1] = class234.method1611(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class234.method3171(var20, field1074[--Statics.field1073]);
                } else if (var53 == 31) {
                    Statics.field1073 -= 2;
                    if (field1074[Statics.field1073] <= field1074[Statics.field1073 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field1073 -= 2;
                    if (field1074[Statics.field1073] >= field1074[Statics.field1073 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1074[++Statics.field1073 - 1] = Statics.field1069[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field1069[var8[var6]] = field1074[--Statics.field1073];
                } else if (var53 == 35) {
                    field1076[++Statics.field2439 - 1] = Statics.field103[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field103[var8[var6]] = field1076[--Statics.field2439];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field2439 -= var21;
                    String var22 = class312.method2780(field1076, Statics.field2439, var21);
                    field1076[++Statics.field2439 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field1073--;
                } else if (var53 == 39) {
                    Statics.field2439--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class92 var24 = Statics.method1883(var23);
                    int[] var25 = new int[var24.field1273];
                    String[] var26 = new String[var24.field1274];
                    for (int var27 = 0; var27 < var24.field1272; var27++) {
                        var25[var27] = field1074[Statics.field1073 - var24.field1272 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1276; var28++) {
                        var26[var28] = field1076[Statics.field2439 - var24.field1276 + var28];
                    }
                    Statics.field1073 -= var24.field1272;
                    Statics.field2439 -= var24.field1276;
                    class57 var29 = new class57();
                    var29.field525 = var4;
                    var29.field524 = var6;
                    var29.field523 = Statics.field1069;
                    var29.field526 = Statics.field103;
                    field1084[++field1078 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1271;
                    var8 = var24.field1269;
                    var6 = -1;
                    Statics.field1069 = var25;
                    Statics.field103 = var26;
                } else if (var53 == 42) {
                    field1074[++Statics.field1073 - 1] = Statics.field154.method2010(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field154.method2009(var8[var6], field1074[--Statics.field1073]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1074[--Statics.field1073];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1070[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1072[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1074[--Statics.field1073];
                    if (var36 < 0 || var36 >= field1070[var35]) {
                        throw new RuntimeException();
                    }
                    field1074[++Statics.field1073 - 1] = field1072[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field1073 -= 2;
                    int var38 = field1074[Statics.field1073];
                    if (var38 < 0 || var38 >= field1070[var37]) {
                        throw new RuntimeException();
                    }
                    field1072[var37][var38] = field1074[Statics.field1073 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field154.method2045(var8[var6]);
                    if (var39 == null) {
                        var39 = class246.field2885;
                    }
                    field1076[++Statics.field2439 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field154.method2013(var8[var6], field1076[--Statics.field2439]);
                } else if (var53 == 49) {
                    String var40 = Statics.field154.method2014(var8[var6]);
                    field1076[++Statics.field2439 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field154.method2011(var8[var6], field1076[--Statics.field2439]);
                } else if (var53 == 60) {
                    class205 var41 = var4.field1277[var8[var6]];
                    class219 var42 = (class219) var41.method3851((long) field1074[--Statics.field1073]);
                    if (var42 != null) {
                        var6 += var42.field2527;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2512).append(" ");
            for (int var47 = field1078 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1084[var47].field525.field2512).append(" ");
            }
            var46.append("").append(var9);
            class160.method2786(var46.toString(), var51);
        } finally {
            if (field1079) {
                field1080 = true;
                client.method3755();
                field1080 = false;
                field1079 = false;
            }
        }
    }

    @ObfuscatedName("f.g(ILcs;ZI)I")
    public static int method61(int arg0, class92 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method4180(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1602(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method1606(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method4557(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return Statics.method3081(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method1020(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method3358(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method1014(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method3723(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method1010(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method956(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1602(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method1606(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method4557(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return Statics.method3081(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method1020(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method2783(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method4742(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method1674(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method3783(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method956(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method1966(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method3065(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method4990(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method1915(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method4179(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return Statics.method524(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method5474(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method948(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method4781(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method658(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method3354(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method3316(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method366(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method1963(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3122(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method703(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hl.x(ILcs;ZI)I")
    public static int method4180(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1073 -= 3;
            int var3 = field1074[Statics.field1073];
            int var4 = field1074[Statics.field1073 + 1];
            int var5 = field1074[Statics.field1073 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class239 var6 = class239.method2052(var3);
            if (var6.field2686 == null) {
                var6.field2686 = new class239[var5 + 1];
            }
            if (var6.field2686.length <= var5) {
                class239[] var7 = new class239[var5 + 1];
                for (int var8 = 0; var8 < var6.field2686.length; var8++) {
                    var7[var8] = var6.field2686[var8];
                }
                var6.field2686 = var7;
            }
            if (var5 > 0 && var6.field2686[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class239 var9 = new class239();
            var9.field2692 = var4;
            var9.field2709 = var9.field2690 = var6.field2690;
            var9.field2691 = var5;
            var9.field2689 = true;
            var6.field2686[var5] = var9;
            if (arg2) {
                Statics.field1036 = var9;
            } else {
                Statics.field1120 = var9;
            }
            client.method508(var6);
            return 1;
        } else if (arg0 == 101) {
            class239 var10 = arg2 ? Statics.field1036 : Statics.field1120;
            class239 var11 = class239.method2052(var10.field2690);
            var11.field2686[var10.field2691] = null;
            client.method508(var11);
            return 1;
        } else if (arg0 == 102) {
            class239 var12 = class239.method2052(field1074[--Statics.field1073]);
            var12.field2686 = null;
            client.method508(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1073 -= 2;
            int var13 = field1074[Statics.field1073];
            int var14 = field1074[Statics.field1073 + 1];
            class239 var15 = class239.method130(var13, var14);
            if (var15 == null || var14 == -1) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = 1;
                if (arg2) {
                    Statics.field1036 = var15;
                } else {
                    Statics.field1120 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class239 var16 = class239.method2052(field1074[--Statics.field1073]);
            if (var16 == null) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = 1;
                if (arg2) {
                    Statics.field1036 = var16;
                } else {
                    Statics.field1120 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.h(ILcs;ZB)I")
    public static int method1602(int arg0, class92 arg1, boolean arg2) {
        int var3 = -1;
        class239 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1074[--Statics.field1073];
            var4 = class239.method2052(var3);
        } else {
            var4 = arg2 ? Statics.field1036 : Statics.field1120;
        }
        if (arg0 == 1000) {
            Statics.field1073 -= 4;
            var4.field2699 = field1074[Statics.field1073];
            var4.field2700 = field1074[Statics.field1073 + 1];
            var4.field2695 = field1074[Statics.field1073 + 2];
            var4.field2696 = field1074[Statics.field1073 + 3];
            client.method508(var4);
            Statics.field555.method1192(var4);
            if (var3 != -1 && var4.field2692 == 0) {
                client.method1013(Statics.field2681[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1073 -= 4;
            var4.field2716 = field1074[Statics.field1073];
            var4.field2758 = field1074[Statics.field1073 + 1];
            var4.field2697 = field1074[Statics.field1073 + 2];
            var4.field2698 = field1074[Statics.field1073 + 3];
            client.method508(var4);
            Statics.field555.method1192(var4);
            if (var3 != -1 && var4.field2692 == 0) {
                client.method1013(Statics.field2681[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1074[--Statics.field1073] == 1;
            if (var4.field2710 != var5) {
                var4.field2710 = var5;
                client.method508(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2830 = field1074[--Statics.field1073] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2831 = field1074[--Statics.field1073] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.f(ILcs;ZI)I")
    public static int method1606(int arg0, class92 arg1, boolean arg2) {
        int var3 = -1;
        class239 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1074[--Statics.field1073];
            var4 = class239.method2052(var3);
        } else {
            var4 = arg2 ? Statics.field1036 : Statics.field1120;
        }
        if (arg0 == 1100) {
            Statics.field1073 -= 2;
            var4.field2711 = field1074[Statics.field1073];
            if (var4.field2711 > var4.field2778 - var4.field2705) {
                var4.field2711 = var4.field2778 - var4.field2705;
            }
            if (var4.field2711 < 0) {
                var4.field2711 = 0;
            }
            var4.field2712 = field1074[Statics.field1073 + 1];
            if (var4.field2712 > var4.field2714 - var4.field2706) {
                var4.field2712 = var4.field2714 - var4.field2706;
            }
            if (var4.field2712 < 0) {
                var4.field2712 = 0;
            }
            client.method508(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2715 = field1074[--Statics.field1073];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2719 = field1074[--Statics.field1073] == 1;
            client.method508(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2807 = field1074[--Statics.field1073];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2824 = field1074[--Statics.field1073];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2725 = field1074[--Statics.field1073];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2762 = field1074[--Statics.field1073];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2728 = field1074[--Statics.field1073] == 1;
            client.method508(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2733 = 1;
            var4.field2734 = field1074[--Statics.field1073];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1073 -= 6;
            var4.field2750 = field1074[Statics.field1073];
            var4.field2740 = field1074[Statics.field1073 + 1];
            var4.field2813 = field1074[Statics.field1073 + 2];
            var4.field2742 = field1074[Statics.field1073 + 3];
            var4.field2743 = field1074[Statics.field1073 + 4];
            var4.field2701 = field1074[Statics.field1073 + 5];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1074[--Statics.field1073];
            if (var4.field2677 != var5) {
                var4.field2677 = var5;
                var4.field2818 = 0;
                var4.field2819 = 0;
                client.method508(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2745 = field1074[--Statics.field1073] == 1;
            client.method508(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1076[--Statics.field2439];
            if (!var6.equals(var4.field2751)) {
                var4.field2751 = var6;
                client.method508(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2760 = field1074[--Statics.field1073];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1073 -= 3;
            var4.field2754 = field1074[Statics.field1073];
            var4.field2765 = field1074[Statics.field1073 + 1];
            var4.field2747 = field1074[Statics.field1073 + 2];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2756 = field1074[--Statics.field1073] == 1;
            client.method508(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2738 = field1074[--Statics.field1073];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2730 = field1074[--Statics.field1073];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2707 = field1074[--Statics.field1073] == 1;
            client.method508(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2732 = field1074[--Statics.field1073] == 1;
            client.method508(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1073 -= 2;
            var4.field2778 = field1074[Statics.field1073];
            var4.field2714 = field1074[Statics.field1073 + 1];
            client.method508(var4);
            if (var3 != -1 && var4.field2692 == 0) {
                client.method1013(Statics.field2681[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3206(var4.field2690, var4.field2691);
            client.field794 = var4;
            client.method508(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2737 = field1074[--Statics.field1073];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2812 = field1074[--Statics.field1073];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2788 = field1074[--Statics.field1073];
            client.method508(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1074[--Statics.field1073];
            class326 var8 = (class326) Statics.method2007(class326.method5472(), var7);
            if (var8 != null) {
                var4.field2720 = var8;
                client.method508(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1074[--Statics.field1073] == 1;
            var4.field2731 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1074[--Statics.field1073] == 1;
            var4.field2748 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("io.p(ILcs;ZB)I")
    public static int method4557(int arg0, class92 arg1, boolean arg2) {
        class239 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class239.method2052(field1074[--Statics.field1073]);
        } else {
            var3 = arg2 ? Statics.field1036 : Statics.field1120;
        }
        client.method508(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1073 -= 2;
            int var4 = field1074[Statics.field1073];
            int var5 = field1074[Statics.field1073 + 1];
            var3.field2816 = var4;
            var3.field2806 = var5;
            class276 var6 = class276.method1049(var4);
            var3.field2813 = var6.field3521;
            var3.field2742 = var6.field3540;
            var3.field2743 = var6.field3516;
            var3.field2750 = var6.field3524;
            var3.field2740 = var6.field3525;
            var3.field2701 = var6.field3549;
            if (arg0 == 1205) {
                var3.field2772 = 0;
            } else if (arg0 == 1212 | var6.field3526 == 1) {
                var3.field2772 = 1;
            } else {
                var3.field2772 = 2;
            }
            if (var3.field2729 > 0) {
                var3.field2701 = var3.field2701 * 32 / var3.field2729;
            } else if (var3.field2716 > 0) {
                var3.field2701 = var3.field2701 * 32 / var3.field2716;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2733 = 2;
            var3.field2734 = field1074[--Statics.field1073];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2733 = 3;
            var3.field2734 = Statics.field187.field612.method4295();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.q(Lia;I[B[BB)V")
    public static final void method1880(class239 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2713 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2713 = new byte[11][];
            arg0.field2693 = new byte[11][];
            arg0.field2768 = new int[11];
            arg0.field2755 = new int[11];
        }
        arg0.field2713[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2764 = false;
            for (int var4 = 0; var4 < arg0.field2713.length; var4++) {
                if (arg0.field2713[var4] != null) {
                    arg0.field2764 = true;
                    break;
                }
            }
        } else {
            arg0.field2764 = true;
        }
        arg0.field2693[arg1] = arg3;
    }

    @ObfuscatedName("hk.b(Lia;IIIB)V")
    public static final void method4258(class239 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2768 == null) {
            throw new RuntimeException();
        }
        arg0.field2768[arg1] = arg2;
        arg0.field2755[arg1] = arg3;
    }

    @ObfuscatedName("be.n(Lia;II)V")
    public static final void method955(class239 arg0, int arg1) {
        if (arg0.field2713 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2829 == null) {
            arg0.field2829 = new int[arg0.field2713.length];
        }
        arg0.field2829[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("bi.e(ILcs;ZI)I")
    public static int method1020(int arg0, class92 arg1, boolean arg2) {
        class239 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class239.method2052(field1074[--Statics.field1073]);
        } else {
            var3 = arg2 ? Statics.field1036 : Statics.field1120;
        }
        String var4 = field1076[--Statics.field2439];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1074[--Statics.field1073];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1074[--Statics.field1073];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1076[--Statics.field2439];
            } else {
                var7[var8] = Integer.valueOf(field1074[--Statics.field1073]);
            }
        }
        int var9 = field1074[--Statics.field1073];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2782 = var7;
        } else if (arg0 == 1401) {
            var3.field2781 = var7;
        } else if (arg0 == 1402) {
            var3.field2780 = var7;
        } else if (arg0 == 1403) {
            var3.field2727 = var7;
        } else if (arg0 == 1404) {
            var3.field2784 = var7;
        } else if (arg0 == 1405) {
            var3.field2735 = var7;
        } else if (arg0 == 1406) {
            var3.field2817 = var7;
        } else if (arg0 == 1407) {
            var3.field2789 = var7;
            var3.field2790 = var5;
        } else if (arg0 == 1408) {
            var3.field2795 = var7;
        } else if (arg0 == 1409) {
            var3.field2796 = var7;
        } else if (arg0 == 1410) {
            var3.field2786 = var7;
        } else if (arg0 == 1411) {
            var3.field2722 = var7;
        } else if (arg0 == 1412) {
            var3.field2783 = var7;
        } else if (arg0 == 1414) {
            var3.field2791 = var7;
            var3.field2792 = var5;
        } else if (arg0 == 1415) {
            var3.field2793 = var7;
            var3.field2794 = var5;
        } else if (arg0 == 1416) {
            var3.field2787 = var7;
        } else if (arg0 == 1417) {
            var3.field2797 = var7;
        } else if (arg0 == 1418) {
            var3.field2798 = var7;
        } else if (arg0 == 1419) {
            var3.field2799 = var7;
        } else if (arg0 == 1420) {
            var3.field2800 = var7;
        } else if (arg0 == 1421) {
            var3.field2801 = var7;
        } else if (arg0 == 1422) {
            var3.field2802 = var7;
        } else if (arg0 == 1423) {
            var3.field2803 = var7;
        } else if (arg0 == 1424) {
            var3.field2804 = var7;
        } else if (arg0 == 1425) {
            var3.field2774 = var7;
        } else if (arg0 == 1426) {
            var3.field2726 = var7;
        } else if (arg0 == 1427) {
            var3.field2805 = var7;
        } else {
            return 2;
        }
        var3.field2776 = true;
        return 1;
    }

    @ObfuscatedName("fc.r(ILcs;ZI)I")
    public static int method3358(int arg0, class92 arg1, boolean arg2) {
        class239 var3 = arg2 ? Statics.field1036 : Statics.field1120;
        if (arg0 == 1500) {
            field1074[++Statics.field1073 - 1] = var3.field2749;
            return 1;
        } else if (arg0 == 1501) {
            field1074[++Statics.field1073 - 1] = var3.field2822;
            return 1;
        } else if (arg0 == 1502) {
            field1074[++Statics.field1073 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 1503) {
            field1074[++Statics.field1073 - 1] = var3.field2706;
            return 1;
        } else if (arg0 == 1504) {
            field1074[++Statics.field1073 - 1] = var3.field2710 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1074[++Statics.field1073 - 1] = var3.field2709;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.t(ILcs;ZB)I")
    public static int method1014(int arg0, class92 arg1, boolean arg2) {
        class239 var3 = arg2 ? Statics.field1036 : Statics.field1120;
        if (arg0 == 1600) {
            field1074[++Statics.field1073 - 1] = var3.field2711;
            return 1;
        } else if (arg0 == 1601) {
            field1074[++Statics.field1073 - 1] = var3.field2712;
            return 1;
        } else if (arg0 == 1602) {
            field1076[++Statics.field2439 - 1] = var3.field2751;
            return 1;
        } else if (arg0 == 1603) {
            field1074[++Statics.field1073 - 1] = var3.field2778;
            return 1;
        } else if (arg0 == 1604) {
            field1074[++Statics.field1073 - 1] = var3.field2714;
            return 1;
        } else if (arg0 == 1605) {
            field1074[++Statics.field1073 - 1] = var3.field2701;
            return 1;
        } else if (arg0 == 1606) {
            field1074[++Statics.field1073 - 1] = var3.field2813;
            return 1;
        } else if (arg0 == 1607) {
            field1074[++Statics.field1073 - 1] = var3.field2743;
            return 1;
        } else if (arg0 == 1608) {
            field1074[++Statics.field1073 - 1] = var3.field2742;
            return 1;
        } else if (arg0 == 1609) {
            field1074[++Statics.field1073 - 1] = var3.field2807;
            return 1;
        } else if (arg0 == 1610) {
            field1074[++Statics.field1073 - 1] = var3.field2788;
            return 1;
        } else if (arg0 == 1611) {
            field1074[++Statics.field1073 - 1] = var3.field2715;
            return 1;
        } else if (arg0 == 1612) {
            field1074[++Statics.field1073 - 1] = var3.field2812;
            return 1;
        } else if (arg0 == 1613) {
            field1074[++Statics.field1073 - 1] = var3.field2720.method32();
            return 1;
        } else if (arg0 == 1614) {
            field1074[++Statics.field1073 - 1] = var3.field2748 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gh.l(ILcs;ZB)I")
    public static int method3723(int arg0, class92 arg1, boolean arg2) {
        class239 var3 = arg2 ? Statics.field1036 : Statics.field1120;
        if (arg0 == 1700) {
            field1074[++Statics.field1073 - 1] = var3.field2816;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2816 == -1) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = var3.field2806;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1074[++Statics.field1073 - 1] = var3.field2691;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bd.o(ILcs;ZI)I")
    public static int method1010(int arg0, class92 arg1, boolean arg2) {
        class239 var3 = arg2 ? Statics.field1036 : Statics.field1120;
        if (arg0 == 1800) {
            field1074[++Statics.field1073 - 1] = class240.method2534(client.method62(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1074[--Statics.field1073];
            int var5 = var4 - 1;
            if (var3.field2770 == null || var5 >= var3.field2770.length || var3.field2770[var5] == null) {
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1076[++Statics.field2439 - 1] = var3.field2770[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2769 == null) {
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1076[++Statics.field2439 - 1] = var3.field2769;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("be.u(ILcs;ZB)I")
    public static int method956(int arg0, class92 arg1, boolean arg2) {
        class239 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class239.method2052(field1074[--Statics.field1073]);
        } else {
            var3 = arg2 ? Statics.field1036 : Statics.field1120;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1081 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2805 == null) {
            return 0;
        } else {
            class63 var4 = new class63();
            var4.field575 = var3;
            var4.field580 = var3.field2805;
            var4.field583 = field1081 + 1;
            client.field849.method3966(var4);
            return 1;
        }
    }

    @ObfuscatedName("di.y(ILcs;ZI)I")
    public static int method2783(int arg0, class92 arg1, boolean arg2) {
        class239 var3 = class239.method2052(field1074[--Statics.field1073]);
        if (arg0 == 2500) {
            field1074[++Statics.field1073 - 1] = var3.field2749;
            return 1;
        } else if (arg0 == 2501) {
            field1074[++Statics.field1073 - 1] = var3.field2822;
            return 1;
        } else if (arg0 == 2502) {
            field1074[++Statics.field1073 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 2503) {
            field1074[++Statics.field1073 - 1] = var3.field2706;
            return 1;
        } else if (arg0 == 2504) {
            field1074[++Statics.field1073 - 1] = var3.field2710 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1074[++Statics.field1073 - 1] = var3.field2709;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jt.k(ILcs;ZB)I")
    public static int method4742(int arg0, class92 arg1, boolean arg2) {
        class239 var3 = class239.method2052(field1074[--Statics.field1073]);
        if (arg0 == 2600) {
            field1074[++Statics.field1073 - 1] = var3.field2711;
            return 1;
        } else if (arg0 == 2601) {
            field1074[++Statics.field1073 - 1] = var3.field2712;
            return 1;
        } else if (arg0 == 2602) {
            field1076[++Statics.field2439 - 1] = var3.field2751;
            return 1;
        } else if (arg0 == 2603) {
            field1074[++Statics.field1073 - 1] = var3.field2778;
            return 1;
        } else if (arg0 == 2604) {
            field1074[++Statics.field1073 - 1] = var3.field2714;
            return 1;
        } else if (arg0 == 2605) {
            field1074[++Statics.field1073 - 1] = var3.field2701;
            return 1;
        } else if (arg0 == 2606) {
            field1074[++Statics.field1073 - 1] = var3.field2813;
            return 1;
        } else if (arg0 == 2607) {
            field1074[++Statics.field1073 - 1] = var3.field2743;
            return 1;
        } else if (arg0 == 2608) {
            field1074[++Statics.field1073 - 1] = var3.field2742;
            return 1;
        } else if (arg0 == 2609) {
            field1074[++Statics.field1073 - 1] = var3.field2807;
            return 1;
        } else if (arg0 == 2610) {
            field1074[++Statics.field1073 - 1] = var3.field2788;
            return 1;
        } else if (arg0 == 2611) {
            field1074[++Statics.field1073 - 1] = var3.field2715;
            return 1;
        } else if (arg0 == 2612) {
            field1074[++Statics.field1073 - 1] = var3.field2812;
            return 1;
        } else if (arg0 == 2613) {
            field1074[++Statics.field1073 - 1] = var3.field2720.method32();
            return 1;
        } else if (arg0 == 2614) {
            field1074[++Statics.field1073 - 1] = var3.field2748 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.v(ILcs;ZB)I")
    public static int method1674(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class239 var3 = class239.method2052(field1074[--Statics.field1073]);
            field1074[++Statics.field1073 - 1] = var3.field2816;
            return 1;
        } else if (arg0 == 2701) {
            class239 var4 = class239.method2052(field1074[--Statics.field1073]);
            if (var4.field2816 == -1) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = var4.field2806;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1074[--Statics.field1073];
            class62 var6 = (class62) client.field811.method3911((long) var5);
            if (var6 == null) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1074[++Statics.field1073 - 1] = client.field821;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gc.c(ILcs;ZB)I")
    public static int method3783(int arg0, class92 arg1, boolean arg2) {
        class239 var3 = class239.method2052(field1074[--Statics.field1073]);
        if (arg0 == 2800) {
            field1074[++Statics.field1073 - 1] = class240.method2534(client.method62(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1074[--Statics.field1073];
            int var5 = var4 - 1;
            if (var3.field2770 == null || var5 >= var3.field2770.length || var3.field2770[var5] == null) {
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1076[++Statics.field2439 - 1] = var3.field2770[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2769 == null) {
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1076[++Statics.field2439 - 1] = var3.field2769;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cb.aa(ILcs;ZI)I")
    public static int method1966(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1076[--Statics.field2439];
            class91.method696(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1073 -= 2;
            client.method181(Statics.field187, field1074[Statics.field1073], field1074[Statics.field1073 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1080) {
                field1079 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1076[--Statics.field2439];
            int var5 = 0;
            if (class312.method3062(var4)) {
                var5 = class312.method4724(var4);
            }
            class180 var6 = class180.method625(class177.field2284, client.field695.field1308);
            var6.field2350.method3442(var5);
            client.field695.method2097(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1076[--Statics.field2439];
            class180 var8 = class180.method625(class177.field2315, client.field695.field1308);
            var8.field2350.method3439(var7.length() + 1);
            var8.field2350.method3446(var7);
            client.field695.method2097(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1076[--Statics.field2439];
            class180 var10 = class180.method625(class177.field2228, client.field695.field1308);
            var10.field2350.method3439(var9.length() + 1);
            var10.field2350.method3446(var9);
            client.field695.method2097(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1074[--Statics.field1073];
            String var12 = field1076[--Statics.field2439];
            client.method4641(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1073 -= 3;
            int var13 = field1074[Statics.field1073];
            int var14 = field1074[Statics.field1073 + 1];
            int var15 = field1074[Statics.field1073 + 2];
            class239 var16 = class239.method2052(var15);
            client.method596(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1073 -= 2;
            int var17 = field1074[Statics.field1073];
            int var18 = field1074[Statics.field1073 + 1];
            class239 var19 = arg2 ? Statics.field1036 : Statics.field1120;
            client.method596(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1523 = field1074[--Statics.field1073] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1074[++Statics.field1073 - 1] = Statics.field27.field1030 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field27.field1030 = field1074[--Statics.field1073] == 1;
            class73.method3157();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1076[--Statics.field2439];
            boolean var21 = field1074[--Statics.field1073] == 1;
            class51.method517(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1074[--Statics.field1073];
            class180 var23 = class180.method625(class177.field2262, client.field695.field1308);
            var23.field2350.method3440(var22);
            client.field695.method2097(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1074[--Statics.field1073];
            Statics.field2439 -= 2;
            String var25 = field1076[Statics.field2439];
            String var26 = field1076[Statics.field2439 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class180 var27 = class180.method625(class177.field2321, client.field695.field1308);
                var27.field2350.method3440(1 + class190.method1171(var25) + class190.method1171(var26));
                var27.field2350.method3446(var25);
                var27.field2350.method3439(var24);
                var27.field2350.method3446(var26);
                client.field695.method2097(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field661 = field1074[--Statics.field1073] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field700 = field1074[--Statics.field1073] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field769 = field1074[--Statics.field1073] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1074[--Statics.field1073] == 1) {
                client.field690 |= 0x1;
            } else {
                client.field690 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1074[--Statics.field1073] == 1) {
                client.field690 |= 0x2;
            } else {
                client.field690 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1074[--Statics.field1073] == 1) {
                client.field690 |= 0x4;
            } else {
                client.field690 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1074[--Statics.field1073] == 1) {
                client.field690 |= 0x8;
            } else {
                client.field690 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field690 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field755 = field1074[--Statics.field1073] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field765 = field1074[--Statics.field1073] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method4329(field1074[--Statics.field1073] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1074[++Statics.field1073 - 1] = client.method275() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1073 -= 2;
            client.field789 = field1074[Statics.field1073];
            client.field731 = field1074[Statics.field1073 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1073 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1073--;
            return 1;
        } else if (arg0 == 3132) {
            field1074[++Statics.field1073 - 1] = Statics.field75;
            field1074[++Statics.field1073 - 1] = Statics.field348;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1073--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1073 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field859 = 3;
            client.field813 = field1074[--Statics.field1073];
            return 1;
        } else if (arg0 == 3137) {
            client.field859 = 2;
            client.field813 = field1074[--Statics.field1073];
            return 1;
        } else if (arg0 == 3138) {
            client.field859 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field859 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field859 = 3;
            client.field813 = arg2 ? Statics.field1036.field2690 : Statics.field1120.field2690;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1074[--Statics.field1073] == 1;
            Statics.field27.field1034 = var28;
            class73.method3157();
            return 1;
        } else if (arg0 == 3142) {
            field1074[++Statics.field1073 - 1] = Statics.field27.field1034 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1074[--Statics.field1073] == 1;
            client.field709 = var29;
            if (!var29) {
                Statics.field27.field1028 = "";
                class73.method3157();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1074[++Statics.field1073 - 1] = client.field709 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1074[--Statics.field1073] == 1;
            if (Statics.field27.field1031 == var30) {
                Statics.field27.field1031 = !var30;
                class73.method3157();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1074[++Statics.field1073 - 1] = Statics.field27.field1031 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1074[++Statics.field1073 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1074[++Statics.field1073 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1074[++Statics.field1073 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1074[++Statics.field1073 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ep.ab(ILcs;ZI)I")
    public static int method3065(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1073 -= 3;
            client.method4751(field1074[Statics.field1073], field1074[Statics.field1073 + 1], field1074[Statics.field1073 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method145(field1074[--Statics.field1073]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1073 -= 2;
            client.method4415(field1074[Statics.field1073], field1074[Statics.field1073 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jg.ah(ILcs;ZI)I")
    public static int method4990(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1074[++Statics.field1073 - 1] = client.field660;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1073 -= 2;
            int var3 = field1074[Statics.field1073];
            int var4 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = class60.method2536(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1073 -= 2;
            int var5 = field1074[Statics.field1073];
            int var6 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = class60.method695(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1073 -= 2;
            int var7 = field1074[Statics.field1073];
            int var8 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = class60.method3360(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = class261.method4318(var9).field3313;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = client.field782[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = client.field776[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = client.field754[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field2219;
            int var14 = (Statics.field187.field948 >> 7) + Statics.field84;
            int var15 = (Statics.field187.field949 >> 7) + Statics.field30;
            field1074[++Statics.field1073 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1074[++Statics.field1073 - 1] = client.field653 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1073 -= 2;
            int var19 = field1074[Statics.field1073] + 32768;
            int var20 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = class60.method2536(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1073 -= 2;
            int var21 = field1074[Statics.field1073] + 32768;
            int var22 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = class60.method695(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1073 -= 2;
            int var23 = field1074[Statics.field1073] + 32768;
            int var24 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = class60.method3360(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field678 >= 2) {
                field1074[++Statics.field1073 - 1] = client.field678;
            } else {
                field1074[++Statics.field1073 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1074[++Statics.field1073 - 1] = client.field667;
            return 1;
        } else if (arg0 == 3318) {
            field1074[++Statics.field1073 - 1] = client.field650;
            return 1;
        } else if (arg0 == 3321) {
            field1074[++Statics.field1073 - 1] = client.field817;
            return 1;
        } else if (arg0 == 3322) {
            field1074[++Statics.field1073 - 1] = client.field911;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field748) {
                field1074[++Statics.field1073 - 1] = 1;
            } else {
                field1074[++Statics.field1073 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1074[++Statics.field1073 - 1] = client.field788;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1073 -= 4;
            int var25 = field1074[Statics.field1073];
            int var26 = field1074[Statics.field1073 + 1];
            int var27 = field1074[Statics.field1073 + 2];
            int var28 = field1074[Statics.field1073 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1074[++Statics.field1073 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.aw(ILcs;ZB)I")
    public static int method1915(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1073 -= 2;
            int var3 = field1074[Statics.field1073];
            int var4 = field1074[Statics.field1073 + 1];
            class273 var5 = Statics.method950(var3);
            if (var5.field3424 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3426; var6++) {
                if (var5.field3427[var6] == var4) {
                    field1076[++Statics.field2439 - 1] = var5.field3429[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1076[++Statics.field2439 - 1] = var5.field3423;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1073 -= 4;
            int var7 = field1074[Statics.field1073];
            int var8 = field1074[Statics.field1073 + 1];
            int var9 = field1074[Statics.field1073 + 2];
            int var10 = field1074[Statics.field1073 + 3];
            class273 var11 = Statics.method950(var9);
            if (var11.field3422 != var7 || var11.field3424 != var8) {
                if (var8 == 115) {
                    field1076[++Statics.field2439 - 1] = class246.field2885;
                } else {
                    field1074[++Statics.field1073 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3426; var12++) {
                if (var11.field3427[var12] == var10) {
                    if (var8 == 115) {
                        field1076[++Statics.field2439 - 1] = var11.field3429[var12];
                    } else {
                        field1074[++Statics.field1073 - 1] = var11.field3428[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1076[++Statics.field2439 - 1] = var11.field3423;
                } else {
                    field1074[++Statics.field1073 - 1] = var11.field3421;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1074[--Statics.field1073];
            class273 var14 = Statics.method950(var13);
            field1074[++Statics.field1073 - 1] = var14.method4791();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hl.an(ILcs;ZI)I")
    public static int method4179(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field355.field1041 == 0) {
                field1074[++Statics.field1073 - 1] = -2;
            } else if (Statics.field355.field1041 == 1) {
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = Statics.field355.field1045.method5140();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1074[--Statics.field1073];
            if (Statics.field355.method1683() && var3 >= 0 && var3 < Statics.field355.field1045.method5140()) {
                class299 var4 = (class299) Statics.field355.field1045.method5207(var3);
                field1076[++Statics.field2439 - 1] = var4.method5101();
                field1076[++Statics.field2439 - 1] = var4.method5092();
            } else {
                field1076[++Statics.field2439 - 1] = "";
                field1076[++Statics.field2439 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1074[--Statics.field1073];
            if (Statics.field355.method1683() && var5 >= 0 && var5 < Statics.field355.field1045.method5140()) {
                field1074[++Statics.field1073 - 1] = ((class294) Statics.field355.field1045.method5207(var5)).field3713;
            } else {
                field1074[++Statics.field1073 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1074[--Statics.field1073];
            if (Statics.field355.method1683() && var6 >= 0 && var6 < Statics.field355.field1045.method5140()) {
                field1074[++Statics.field1073 - 1] = ((class294) Statics.field355.field1045.method5207(var6)).field3711;
            } else {
                field1074[++Statics.field1073 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1076[--Statics.field2439];
            int var8 = field1074[--Statics.field1073];
            class74.method3059(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1076[--Statics.field2439];
            Statics.field355.method1690(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1076[--Statics.field2439];
            Statics.field355.method1716(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1076[--Statics.field2439];
            Statics.field355.method1726(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1076[--Statics.field2439];
            Statics.field355.method1694(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1076[--Statics.field2439];
            String var14 = client.method4602(var13);
            field1074[++Statics.field1073 - 1] = Statics.field355.method1688(new class298(var14, Statics.field415), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field366 == null) {
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1076[++Statics.field2439 - 1] = Statics.field366.field3737;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field366 == null) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = Statics.field366.method5140();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1074[--Statics.field1073];
            if (Statics.field366 == null || var15 >= Statics.field366.method5140()) {
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1076[++Statics.field2439 - 1] = Statics.field366.method5207(var15).method5090().method5236();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1074[--Statics.field1073];
            if (Statics.field366 == null || var16 >= Statics.field366.method5140()) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = ((class294) Statics.field366.method5207(var16)).method5216();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1074[--Statics.field1073];
            if (Statics.field366 == null || var17 >= Statics.field366.method5140()) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = ((class294) Statics.field366.method5207(var17)).field3711;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1074[++Statics.field1073 - 1] = Statics.field366 == null ? 0 : Statics.field366.field3739;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1076[--Statics.field2439];
            client.method1152(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1074[++Statics.field1073 - 1] = Statics.field366 == null ? 0 : Statics.field366.field3740;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1076[--Statics.field2439];
            client.method3287(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method583();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field355.method1683()) {
                field1074[++Statics.field1073 - 1] = Statics.field355.field1046.method5140();
            } else {
                field1074[++Statics.field1073 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1074[--Statics.field1073];
            if (Statics.field355.method1683() && var20 >= 0 && var20 < Statics.field355.field1046.method5140()) {
                class293 var21 = (class293) Statics.field355.field1046.method5207(var20);
                field1076[++Statics.field2439 - 1] = var21.method5101();
                field1076[++Statics.field2439 - 1] = var21.method5092();
            } else {
                field1076[++Statics.field2439 - 1] = "";
                field1076[++Statics.field2439 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1076[--Statics.field2439];
            String var23 = client.method4602(var22);
            field1074[++Statics.field1073 - 1] = Statics.field355.method1689(new class298(var23, Statics.field415)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1074[--Statics.field1073];
            if (Statics.field366 == null || var24 >= Statics.field366.method5140() || !Statics.field366.method5207(var24).method5090().equals(Statics.field187.field619)) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field366 == null || Statics.field366.field3738 == null) {
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1076[++Statics.field2439 - 1] = Statics.field366.field3738;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1074[--Statics.field1073];
            if (Statics.field366 == null || var25 >= Statics.field366.method5140() || !((class288) Statics.field366.method5207(var25)).method5065()) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1074[--Statics.field1073];
            if (Statics.field366 == null || var26 >= Statics.field366.method5140() || !((class288) Statics.field366.method5207(var26)).method5068()) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field355.field1045.method5206();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1045.method5159(new class318(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1045.method5159(new class319(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1045.method5159(new class151(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1045.method5159(new class145(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1045.method5159(new class150(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1045.method5159(new class153(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1045.method5159(new class149(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1045.method5159(new class147(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1045.method5159(new class146(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1045.method5159(new class148(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field355.field1045.method5180();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field355.field1046.method5206();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1046.method5159(new class318(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1046.method5159(new class319(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field355.field1046.method5180();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field366 != null) {
                Statics.field366.method5206();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1074[--Statics.field1073] == 1;
            if (Statics.field366 != null) {
                Statics.field366.method5159(new class318(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1074[--Statics.field1073] == 1;
            if (Statics.field366 != null) {
                Statics.field366.method5159(new class319(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1074[--Statics.field1073] == 1;
            if (Statics.field366 != null) {
                Statics.field366.method5159(new class151(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1074[--Statics.field1073] == 1;
            if (Statics.field366 != null) {
                Statics.field366.method5159(new class145(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1074[--Statics.field1073] == 1;
            if (Statics.field366 != null) {
                Statics.field366.method5159(new class150(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1074[--Statics.field1073] == 1;
            if (Statics.field366 != null) {
                Statics.field366.method5159(new class153(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1074[--Statics.field1073] == 1;
            if (Statics.field366 != null) {
                Statics.field366.method5159(new class149(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1074[--Statics.field1073] == 1;
            if (Statics.field366 != null) {
                Statics.field366.method5159(new class147(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1074[--Statics.field1073] == 1;
            if (Statics.field366 != null) {
                Statics.field366.method5159(new class146(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1074[--Statics.field1073] == 1;
            if (Statics.field366 != null) {
                Statics.field366.method5159(new class148(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field366 != null) {
                Statics.field366.method5180();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1074[--Statics.field1073] == 1;
            Statics.field355.field1045.method5159(new class152(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1074[--Statics.field1073] == 1;
            if (Statics.field366 != null) {
                Statics.field366.method5159(new class152(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lo.ae(ILcs;ZI)I")
    public static int method5474(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1073 -= 2;
            int var3 = field1074[Statics.field1073];
            int var4 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1073 -= 2;
            int var5 = field1074[Statics.field1073];
            int var6 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1073 -= 2;
            int var7 = field1074[Statics.field1073];
            int var8 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1073 -= 2;
            int var9 = field1074[Statics.field1073];
            int var10 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1073 -= 5;
            int var13 = field1074[Statics.field1073];
            int var14 = field1074[Statics.field1073 + 1];
            int var15 = field1074[Statics.field1073 + 2];
            int var16 = field1074[Statics.field1073 + 3];
            int var17 = field1074[Statics.field1073 + 4];
            field1074[++Statics.field1073 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1073 -= 2;
            int var18 = field1074[Statics.field1073];
            int var19 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1073 -= 2;
            int var20 = field1074[Statics.field1073];
            int var21 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1073 -= 2;
            int var22 = field1074[Statics.field1073];
            int var23 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1073 -= 2;
            int var24 = field1074[Statics.field1073];
            int var25 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1073 -= 2;
            int var26 = field1074[Statics.field1073];
            int var27 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1073 -= 2;
            int var28 = field1074[Statics.field1073];
            int var29 = field1074[Statics.field1073 + 1];
            if (var28 == 0) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1073 -= 2;
            int var30 = field1074[Statics.field1073];
            int var31 = field1074[Statics.field1073 + 1];
            if (var30 == 0) {
                field1074[++Statics.field1073 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1074[++Statics.field1073 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1074[++Statics.field1073 - 1] = var30;
                    break;
                case 2:
                    field1074[++Statics.field1073 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1074[++Statics.field1073 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1074[++Statics.field1073 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1074[++Statics.field1073 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1073 -= 2;
            int var32 = field1074[Statics.field1073];
            int var33 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1073 -= 2;
            int var34 = field1074[Statics.field1073];
            int var35 = field1074[Statics.field1073 + 1];
            field1074[++Statics.field1073 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1073 -= 3;
            long var36 = (long) field1074[Statics.field1073];
            long var38 = (long) field1074[Statics.field1073 + 1];
            long var40 = (long) field1074[Statics.field1073 + 2];
            field1074[++Statics.field1073 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.av(ILcs;ZI)I")
    public static int method948(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1076[--Statics.field2439];
            int var4 = field1074[--Statics.field1073];
            field1076[++Statics.field2439 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field2439 -= 2;
            String var5 = field1076[Statics.field2439];
            String var6 = field1076[Statics.field2439 + 1];
            field1076[++Statics.field2439 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1076[--Statics.field2439];
            int var8 = field1074[--Statics.field1073];
            field1076[++Statics.field2439 - 1] = var7 + class312.method3485(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1076[--Statics.field2439];
            field1076[++Statics.field2439 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1074[--Statics.field1073];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1077.setTime(new Date(var11));
            int var13 = field1077.get(5);
            int var14 = field1077.get(2);
            int var15 = field1077.get(1);
            field1076[++Statics.field2439 - 1] = var13 + "-" + field1071[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field2439 -= 2;
            String var16 = field1076[Statics.field2439];
            String var17 = field1076[Statics.field2439 + 1];
            if (Statics.field187.field612 != null && Statics.field187.field612.field2655) {
                field1076[++Statics.field2439 - 1] = var17;
            } else {
                field1076[++Statics.field2439 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1074[--Statics.field1073];
            field1076[++Statics.field2439 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field2439 -= 2;
            field1074[++Statics.field1073 - 1] = class312.method543(class181.method3430(field1076[Statics.field2439], field1076[Statics.field2439 + 1], client.field655));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1076[--Statics.field2439];
            Statics.field1073 -= 2;
            int var20 = field1074[Statics.field1073];
            int var21 = field1074[Statics.field1073 + 1];
            byte[] var22 = Statics.field414.method4422(var21, 0);
            class305 var23 = new class305(var22);
            field1074[++Statics.field1073 - 1] = var23.method5317(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1076[--Statics.field2439];
            Statics.field1073 -= 2;
            int var25 = field1074[Statics.field1073];
            int var26 = field1074[Statics.field1073 + 1];
            byte[] var27 = Statics.field414.method4422(var26, 0);
            class305 var28 = new class305(var27);
            field1074[++Statics.field1073 - 1] = var28.method5362(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field2439 -= 2;
            String var29 = field1076[Statics.field2439];
            String var30 = field1076[Statics.field2439 + 1];
            if (field1074[--Statics.field1073] == 1) {
                field1076[++Statics.field2439 - 1] = var29;
            } else {
                field1076[++Statics.field2439 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1076[--Statics.field2439];
            field1076[++Statics.field2439 - 1] = class306.method5384(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1076[--Statics.field2439];
            int var33 = field1074[--Statics.field1073];
            field1076[++Statics.field2439 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = class312.method4238((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = class312.method2559((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = class312.method4837((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = class312.method3178((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1076[--Statics.field2439];
            if (var38 == null) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1076[--Statics.field2439];
            Statics.field1073 -= 2;
            int var40 = field1074[Statics.field1073];
            int var41 = field1074[Statics.field1073 + 1];
            field1076[++Statics.field2439 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1076[--Statics.field2439];
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
            field1076[++Statics.field2439 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1076[--Statics.field2439];
            int var48 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field2439 -= 2;
            String var49 = field1076[Statics.field2439];
            String var50 = field1076[Statics.field2439 + 1];
            int var51 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1076[--Statics.field2439];
            field1076[++Statics.field2439 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jq.au(ILcs;ZI)I")
    public static int method4781(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1074[--Statics.field1073];
            field1076[++Statics.field2439 - 1] = class276.method1049(var3).field3514;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1073 -= 2;
            int var4 = field1074[Statics.field1073];
            int var5 = field1074[Statics.field1073 + 1];
            class276 var6 = class276.method1049(var4);
            if (var5 < 1 || var5 > 5 || var6.field3529[var5 - 1] == null) {
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1076[++Statics.field2439 - 1] = var6.field3529[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1073 -= 2;
            int var7 = field1074[Statics.field1073];
            int var8 = field1074[Statics.field1073 + 1];
            class276 var9 = class276.method1049(var7);
            if (var8 < 1 || var8 > 5 || var9.field3530[var8 - 1] == null) {
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1076[++Statics.field2439 - 1] = var9.field3530[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = class276.method1049(var10).field3527;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = class276.method1049(var11).field3526 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1074[--Statics.field1073];
            class276 var13 = class276.method1049(var12);
            if (var13.field3559 == -1 && var13.field3546 >= 0) {
                field1074[++Statics.field1073 - 1] = var13.field3546;
            } else {
                field1074[++Statics.field1073 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1074[--Statics.field1073];
            class276 var15 = class276.method1049(var14);
            if (var15.field3559 >= 0 && var15.field3546 >= 0) {
                field1074[++Statics.field1073 - 1] = var15.field3546;
            } else {
                field1074[++Statics.field1073 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = class276.method1049(var16).field3528 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1074[--Statics.field1073];
            class276 var18 = class276.method1049(var17);
            if (var18.field3538 == -1 && var18.field3558 >= 0) {
                field1074[++Statics.field1073 - 1] = var18.field3558;
            } else {
                field1074[++Statics.field1073 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1074[--Statics.field1073];
            class276 var20 = class276.method1049(var19);
            if (var20.field3538 >= 0 && var20.field3558 >= 0) {
                field1074[++Statics.field1073 - 1] = var20.field3558;
            } else {
                field1074[++Statics.field1073 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1076[--Statics.field2439];
            int var22 = field1074[--Statics.field1073];
            client.method1055(var21, var22 == 1);
            field1074[++Statics.field1073 - 1] = Statics.field2468;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field641 == null || Statics.field115 >= Statics.field2468) {
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = Statics.field641[++Statics.field115 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field115 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ar.aj(ILcs;ZI)I")
    public static int method658(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1074[++Statics.field1073 - 1] = client.field866;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1073 -= 3;
            client.field866 = field1074[Statics.field1073];
            Statics.field107 = class314.method1024(field1074[Statics.field1073 + 1]);
            if (Statics.field107 == null) {
                Statics.field107 = class314.field3813;
            }
            client.field867 = field1074[Statics.field1073 + 2];
            class180 var3 = class180.method625(class177.field2235, client.field695.field1308);
            var3.field2350.method3439(client.field866);
            var3.field2350.method3439(Statics.field107.field3812);
            var3.field2350.method3439(client.field867);
            client.field695.method2097(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1076[--Statics.field2439];
            Statics.field1073 -= 2;
            int var5 = field1074[Statics.field1073];
            int var6 = field1074[Statics.field1073 + 1];
            class180 var7 = class180.method625(class177.field2247, client.field695.field1308);
            var7.field2350.method3439(class190.method1171(var4) + 2);
            var7.field2350.method3446(var4);
            var7.field2350.method3439(var5 - 1);
            var7.field2350.method3439(var6);
            client.field695.method2097(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1073 -= 2;
            int var8 = field1074[Statics.field1073];
            int var9 = field1074[Statics.field1073 + 1];
            class65 var10 = Statics.method5296(var8, var9);
            if (var10 == null) {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = 0;
                field1076[++Statics.field2439 - 1] = "";
                field1076[++Statics.field2439 - 1] = "";
                field1076[++Statics.field2439 - 1] = "";
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = var10.field602;
                field1074[++Statics.field1073 - 1] = var10.field595;
                field1076[++Statics.field2439 - 1] = var10.field594 == null ? "" : var10.field594;
                field1076[++Statics.field2439 - 1] = var10.field601 == null ? "" : var10.field601;
                field1076[++Statics.field2439 - 1] = var10.field596 == null ? "" : var10.field596;
                field1074[++Statics.field1073 - 1] = var10.method1076() ? 1 : (var10.method1079() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1074[--Statics.field1073];
            class65 var12 = class91.method184(var11);
            if (var12 == null) {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = 0;
                field1076[++Statics.field2439 - 1] = "";
                field1076[++Statics.field2439 - 1] = "";
                field1076[++Statics.field2439 - 1] = "";
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = var12.field604;
                field1074[++Statics.field1073 - 1] = var12.field595;
                field1076[++Statics.field2439 - 1] = var12.field594 == null ? "" : var12.field594;
                field1076[++Statics.field2439 - 1] = var12.field601 == null ? "" : var12.field601;
                field1076[++Statics.field2439 - 1] = var12.field596 == null ? "" : var12.field596;
                field1074[++Statics.field1073 - 1] = var12.method1076() ? 1 : (var12.method1079() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field107 == null) {
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = Statics.field107.field3812;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1076[--Statics.field2439];
            int var14 = field1074[--Statics.field1073];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class246.field2908)) {
                var16 = 0;
                var13 = var13.substring(class246.field2908.length());
            } else if (var15.startsWith(class246.field3059)) {
                var16 = 1;
                var13 = var13.substring(class246.field3059.length());
            } else if (var15.startsWith(class246.field3049)) {
                var16 = 2;
                var13 = var13.substring(class246.field3049.length());
            } else if (var15.startsWith(class246.field3048)) {
                var16 = 3;
                var13 = var13.substring(class246.field3048.length());
            } else if (var15.startsWith(class246.field2990)) {
                var16 = 4;
                var13 = var13.substring(class246.field2990.length());
            } else if (var15.startsWith(class246.field3035)) {
                var16 = 5;
                var13 = var13.substring(class246.field3035.length());
            } else if (var15.startsWith(class246.field3069)) {
                var16 = 6;
                var13 = var13.substring(class246.field3069.length());
            } else if (var15.startsWith(class246.field3071)) {
                var16 = 7;
                var13 = var13.substring(class246.field3071.length());
            } else if (var15.startsWith(class246.field3073)) {
                var16 = 8;
                var13 = var13.substring(class246.field3073.length());
            } else if (var15.startsWith(class246.field3075)) {
                var16 = 9;
                var13 = var13.substring(class246.field3075.length());
            } else if (var15.startsWith(class246.field2972)) {
                var16 = 10;
                var13 = var13.substring(class246.field2972.length());
            } else if (var15.startsWith(class246.field3152)) {
                var16 = 11;
                var13 = var13.substring(class246.field3152.length());
            } else if (client.field655 != 0) {
                if (var15.startsWith(class246.field3142)) {
                    var16 = 0;
                    var13 = var13.substring(class246.field3142.length());
                } else if (var15.startsWith(class246.field3134)) {
                    var16 = 1;
                    var13 = var13.substring(class246.field3134.length());
                } else if (var15.startsWith(class246.field2969)) {
                    var16 = 2;
                    var13 = var13.substring(class246.field2969.length());
                } else if (var15.startsWith(class246.field3064)) {
                    var16 = 3;
                    var13 = var13.substring(class246.field3064.length());
                } else if (var15.startsWith(class246.field3040)) {
                    var16 = 4;
                    var13 = var13.substring(class246.field3040.length());
                } else if (var15.startsWith(class246.field3068)) {
                    var16 = 5;
                    var13 = var13.substring(class246.field3068.length());
                } else if (var15.startsWith(class246.field3070)) {
                    var16 = 6;
                    var13 = var13.substring(class246.field3070.length());
                } else if (var15.startsWith(class246.field3072)) {
                    var16 = 7;
                    var13 = var13.substring(class246.field3072.length());
                } else if (var15.startsWith(class246.field3096)) {
                    var16 = 8;
                    var13 = var13.substring(class246.field3096.length());
                } else if (var15.startsWith(class246.field3076)) {
                    var16 = 9;
                    var13 = var13.substring(class246.field3076.length());
                } else if (var15.startsWith(class246.field3120)) {
                    var16 = 10;
                    var13 = var13.substring(class246.field3120.length());
                } else if (var15.startsWith(class246.field3098)) {
                    var16 = 11;
                    var13 = var13.substring(class246.field3098.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class246.field3081)) {
                var18 = 1;
                var13 = var13.substring(class246.field3081.length());
            } else if (var17.startsWith(class246.field3162)) {
                var18 = 2;
                var13 = var13.substring(class246.field3162.length());
            } else if (var17.startsWith(class246.field3085)) {
                var18 = 3;
                var13 = var13.substring(class246.field3085.length());
            } else if (var17.startsWith(class246.field2918)) {
                var18 = 4;
                var13 = var13.substring(class246.field2918.length());
            } else if (var17.startsWith(class246.field3089)) {
                var18 = 5;
                var13 = var13.substring(class246.field3089.length());
            } else if (client.field655 != 0) {
                if (var17.startsWith(class246.field3074)) {
                    var18 = 1;
                    var13 = var13.substring(class246.field3074.length());
                } else if (var17.startsWith(class246.field3084)) {
                    var18 = 2;
                    var13 = var13.substring(class246.field3084.length());
                } else if (var17.startsWith(class246.field3155)) {
                    var18 = 3;
                    var13 = var13.substring(class246.field3155.length());
                } else if (var17.startsWith(class246.field3083)) {
                    var18 = 4;
                    var13 = var13.substring(class246.field3083.length());
                } else if (var17.startsWith(class246.field3090)) {
                    var18 = 5;
                    var13 = var13.substring(class246.field3090.length());
                }
            }
            class180 var19 = class180.method625(class177.field2279, client.field695.field1308);
            var19.field2350.method3439(0);
            int var20 = var19.field2350.field2419;
            var19.field2350.method3439(var14);
            var19.field2350.method3439(var16);
            var19.field2350.method3439(var18);
            class307.method4585(var19.field2350, var13);
            var19.field2350.method3452(var19.field2350.field2419 - var20);
            client.field695.method2097(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field2439 -= 2;
            String var21 = field1076[Statics.field2439];
            String var22 = field1076[Statics.field2439 + 1];
            class180 var23 = class180.method625(class177.field2245, client.field695.field1308);
            var23.field2350.method3440(0);
            int var24 = var23.field2350.field2419;
            var23.field2350.method3446(var21);
            class307.method4585(var23.field2350, var22);
            var23.field2350.method3451(var23.field2350.field2419 - var24);
            client.field695.method2097(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field187 == null || Statics.field187.field619 == null) {
                var25 = "";
            } else {
                var25 = Statics.field187.field619.method5236();
            }
            field1076[++Statics.field2439 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1074[++Statics.field1073 - 1] = client.field867;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = class91.method1924(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = class91.method280(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = class91.method3073(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1076[--Statics.field2439];
            client.method220(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field790 = field1076[--Statics.field2439].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1076[++Statics.field2439 - 1] = client.field790;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1076[--Statics.field2439];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fu.as(ILcs;ZI)I")
    public static int method3354(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1074[++Statics.field1073 - 1] = client.method161();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1074[--Statics.field1073];
            if (var3 == 1 || var3 == 2) {
                client.method5082(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1074[++Statics.field1073 - 1] = Statics.field27.field1037;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1074[--Statics.field1073];
            if (var4 == 1 || var4 == 2) {
                Statics.field27.field1037 = var4;
                class73.method3157();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1073--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fx.ar(ILcs;ZI)I")
    public static int method3316(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1073 -= 2;
            int var3 = field1074[Statics.field1073];
            int var4 = field1074[Statics.field1073 + 1];
            if (!client.field894) {
                client.field718 = var3;
                client.field719 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1074[++Statics.field1073 - 1] = client.field718;
            return 1;
        } else if (arg0 == 5506) {
            field1074[++Statics.field1073 - 1] = client.field719;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1074[--Statics.field1073];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field725 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1074[++Statics.field1073 - 1] = client.field725;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ag.ai(ILcs;ZB)I")
    public static int method366(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field696 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hb.aq(IB)I")
    public static int method4245(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("k.al(II)I")
    public static int method203(int arg0) {
        return (int) ((Math.log((double) arg0) / field1082 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("cb.az(ILcs;ZI)I")
    public static int method1963(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1073 -= 2;
            client.field900 = (short) method4245(field1074[Statics.field1073]);
            if (client.field900 <= 0) {
                client.field900 = 256;
            }
            client.field901 = (short) method4245(field1074[Statics.field1073 + 1]);
            if (client.field901 <= 0) {
                client.field901 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1073 -= 2;
            client.field902 = (short) field1074[Statics.field1073];
            if (client.field902 <= 0) {
                client.field902 = 256;
            }
            client.field903 = (short) field1074[Statics.field1073 + 1];
            if (client.field903 <= 0) {
                client.field903 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1073 -= 4;
            client.field904 = (short) field1074[Statics.field1073];
            if (client.field904 <= 0) {
                client.field904 = 1;
            }
            client.field873 = (short) field1074[Statics.field1073 + 1];
            if (client.field873 <= 0) {
                client.field873 = 32767;
            } else if (client.field873 < client.field904) {
                client.field873 = client.field904;
            }
            client.field906 = (short) field1074[Statics.field1073 + 2];
            if (client.field906 <= 0) {
                client.field906 = 1;
            }
            client.field907 = (short) field1074[Statics.field1073 + 3];
            if (client.field907 <= 0) {
                client.field907 = 32767;
            } else if (client.field907 < client.field906) {
                client.field907 = client.field906;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field822 == null) {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                client.method4582(0, 0, client.field822.field2705, client.field822.field2706, false);
                field1074[++Statics.field1073 - 1] = client.field910;
                field1074[++Statics.field1073 - 1] = client.field651;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1074[++Statics.field1073 - 1] = client.field902;
            field1074[++Statics.field1073 - 1] = client.field903;
            return 1;
        } else if (arg0 == 6205) {
            field1074[++Statics.field1073 - 1] = method203(client.field900);
            field1074[++Statics.field1073 - 1] = method203(client.field901);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eg.ac(ILcs;ZB)I")
    public static int method3122(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1074[++Statics.field1073 - 1] = class72.method375() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class72 var3 = class72.method2080();
            if (var3 == null) {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = 0;
                field1076[++Statics.field2439 - 1] = "";
                field1074[++Statics.field1073 - 1] = 0;
                field1074[++Statics.field1073 - 1] = 0;
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1074[++Statics.field1073 - 1] = var3.field1021;
                field1074[++Statics.field1073 - 1] = var3.field1022;
                field1076[++Statics.field2439 - 1] = var3.field1025;
                field1074[++Statics.field1073 - 1] = var3.field1026;
                field1074[++Statics.field1073 - 1] = var3.field1018;
                field1076[++Statics.field2439 - 1] = var3.field1020;
            }
            return 1;
        } else if (arg0 == 6502) {
            class72 var4 = class72.method4583();
            if (var4 == null) {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = 0;
                field1076[++Statics.field2439 - 1] = "";
                field1074[++Statics.field1073 - 1] = 0;
                field1074[++Statics.field1073 - 1] = 0;
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1074[++Statics.field1073 - 1] = var4.field1021;
                field1074[++Statics.field1073 - 1] = var4.field1022;
                field1076[++Statics.field2439 - 1] = var4.field1025;
                field1074[++Statics.field1073 - 1] = var4.field1026;
                field1074[++Statics.field1073 - 1] = var4.field1018;
                field1076[++Statics.field2439 - 1] = var4.field1020;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1074[--Statics.field1073];
            class72 var6 = null;
            for (int var7 = 0; var7 < class72.field1016; var7++) {
                if (Statics.field3859[var7].field1021 == var5) {
                    var6 = Statics.field3859[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = 0;
                field1076[++Statics.field2439 - 1] = "";
                field1074[++Statics.field1073 - 1] = 0;
                field1074[++Statics.field1073 - 1] = 0;
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1074[++Statics.field1073 - 1] = var6.field1021;
                field1074[++Statics.field1073 - 1] = var6.field1022;
                field1076[++Statics.field2439 - 1] = var6.field1025;
                field1074[++Statics.field1073 - 1] = var6.field1026;
                field1074[++Statics.field1073 - 1] = var6.field1018;
                field1076[++Statics.field2439 - 1] = var6.field1020;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1073 -= 4;
            int var8 = field1074[Statics.field1073];
            boolean var9 = field1074[Statics.field1073 + 1] == 1;
            int var10 = field1074[Statics.field1073 + 2];
            boolean var11 = field1074[Statics.field1073 + 3] == 1;
            class72.method3079(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1074[--Statics.field1073];
            if (var12 >= 0 && var12 < class72.field1016) {
                class72 var13 = Statics.field3859[var12];
                field1074[++Statics.field1073 - 1] = var13.field1021;
                field1074[++Statics.field1073 - 1] = var13.field1022;
                field1076[++Statics.field2439 - 1] = var13.field1025;
                field1074[++Statics.field1073 - 1] = var13.field1026;
                field1074[++Statics.field1073 - 1] = var13.field1018;
                field1076[++Statics.field2439 - 1] = var13.field1020;
            } else {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = 0;
                field1076[++Statics.field2439 - 1] = "";
                field1074[++Statics.field1073 - 1] = 0;
                field1074[++Statics.field1073 - 1] = 0;
                field1076[++Statics.field2439 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field795 = field1074[--Statics.field1073] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1073 -= 2;
            int var14 = field1074[Statics.field1073];
            int var15 = field1074[Statics.field1073 + 1];
            class271 var16 = class271.method5008(var15);
            if (var16.method4748()) {
                field1076[++Statics.field2439 - 1] = class278.method3363(var14).method4962(var15, var16.field3408);
            } else {
                field1074[++Statics.field1073 - 1] = class278.method3363(var14).method4961(var15, var16.field3413);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1073 -= 2;
            int var17 = field1074[Statics.field1073];
            int var18 = field1074[Statics.field1073 + 1];
            class271 var19 = class271.method5008(var18);
            if (var19.method4748()) {
                field1076[++Statics.field2439 - 1] = class275.method117(var17).method4850(var18, var19.field3408);
            } else {
                field1074[++Statics.field1073 - 1] = class275.method117(var17).method4849(var18, var19.field3413);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1073 -= 2;
            int var20 = field1074[Statics.field1073];
            int var21 = field1074[Statics.field1073 + 1];
            class271 var22 = class271.method5008(var21);
            if (var22.method4748()) {
                field1076[++Statics.field2439 - 1] = class276.method1049(var20).method4903(var21, var22.field3408);
            } else {
                field1074[++Statics.field1073 - 1] = class276.method1049(var20).method4932(var21, var22.field3413);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1073 -= 2;
            int var23 = field1074[Statics.field1073];
            int var24 = field1074[Statics.field1073 + 1];
            class271 var25 = class271.method5008(var24);
            if (var25.method4748()) {
                field1076[++Statics.field2439 - 1] = class272.method279(var23).method4772(var24, var25.field3408);
            } else {
                field1074[++Statics.field1073 - 1] = class272.method279(var23).method4768(var24, var25.field3413);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1074[++Statics.field1073 - 1] = client.field657 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1074[++Statics.field1073 - 1] = client.field656 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field2439--;
            Statics.field1073--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field2439--;
            Statics.field1073--;
            return 1;
        } else if (arg0 == 6524) {
            field1074[++Statics.field1073 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1074[++Statics.field1073 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1074[++Statics.field1073 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.ao(ILcs;ZI)I")
    public static int method703(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field2219;
            int var4 = (Statics.field187.field948 >> 7) + Statics.field84;
            int var5 = (Statics.field187.field949 >> 7) + Statics.field30;
            client.method542().method5827(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1074[--Statics.field1073];
            String var7 = "";
            class27 var8 = client.method542().method5993(var6);
            if (var8 != null) {
                var7 = var8.method356();
            }
            field1076[++Statics.field2439 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1074[--Statics.field1073];
            client.method542().method5888(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1074[++Statics.field1073 - 1] = client.method542().method5940();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1074[--Statics.field1073];
            client.method542().method5839(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1074[++Statics.field1073 - 1] = client.method542().method5844() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class235 var11 = new class235(field1074[--Statics.field1073]);
            client.method542().method5846(var11.field2650, var11.field2649);
            return 1;
        } else if (arg0 == 6607) {
            class235 var12 = new class235(field1074[--Statics.field1073]);
            client.method542().method5978(var12.field2650, var12.field2649);
            return 1;
        } else if (arg0 == 6608) {
            class235 var13 = new class235(field1074[--Statics.field1073]);
            client.method542().method5848(var13.field2652, var13.field2650, var13.field2649);
            return 1;
        } else if (arg0 == 6609) {
            class235 var14 = new class235(field1074[--Statics.field1073]);
            client.method542().method5892(var14.field2652, var14.field2650, var14.field2649);
            return 1;
        } else if (arg0 == 6610) {
            field1074[++Statics.field1073 - 1] = client.method542().method5850();
            field1074[++Statics.field1073 - 1] = client.method542().method5851();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1074[--Statics.field1073];
            class27 var16 = client.method542().method5993(var15);
            if (var16 == null) {
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = var16.method310().method4268();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1074[--Statics.field1073];
            class27 var18 = client.method542().method5993(var17);
            if (var18 == null) {
                field1074[++Statics.field1073 - 1] = 0;
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = (var18.method308() - var18.method339() + 1) * 64;
                field1074[++Statics.field1073 - 1] = (var18.method344() - var18.method309() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1074[--Statics.field1073];
            class27 var20 = client.method542().method5993(var19);
            if (var20 == null) {
                field1074[++Statics.field1073 - 1] = 0;
                field1074[++Statics.field1073 - 1] = 0;
                field1074[++Statics.field1073 - 1] = 0;
                field1074[++Statics.field1073 - 1] = 0;
            } else {
                field1074[++Statics.field1073 - 1] = var20.method339() * 64;
                field1074[++Statics.field1073 - 1] = var20.method309() * 64;
                field1074[++Statics.field1073 - 1] = var20.method308() * 64 + 64 - 1;
                field1074[++Statics.field1073 - 1] = var20.method344() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1074[--Statics.field1073];
            class27 var22 = client.method542().method5993(var21);
            if (var22 == null) {
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = var22.method306();
            }
            return 1;
        } else if (arg0 == 6615) {
            class235 var23 = client.method542().method5852();
            if (var23 == null) {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = var23.field2650;
                field1074[++Statics.field1073 - 1] = var23.field2649;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1074[++Statics.field1073 - 1] = client.method542().method5829();
            return 1;
        } else if (arg0 == 6617) {
            class235 var24 = new class235(field1074[--Statics.field1073]);
            class27 var25 = client.method542().method5981();
            if (var25 == null) {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method298(var24.field2652, var24.field2650, var24.field2649);
            if (var26 == null) {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = var26[0];
                field1074[++Statics.field1073 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class235 var27 = new class235(field1074[--Statics.field1073]);
            class27 var28 = client.method542().method5981();
            if (var28 == null) {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = -1;
                return 1;
            }
            class235 var29 = var28.method347(var27.field2650, var27.field2649);
            if (var29 == null) {
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = var29.method4268();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1073 -= 2;
            int var30 = field1074[Statics.field1073];
            class235 var31 = new class235(field1074[Statics.field1073 + 1]);
            method525(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1073 -= 2;
            int var32 = field1074[Statics.field1073];
            class235 var33 = new class235(field1074[Statics.field1073 + 1]);
            method525(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1073 -= 2;
            int var34 = field1074[Statics.field1073];
            class235 var35 = new class235(field1074[Statics.field1073 + 1]);
            class27 var36 = client.method542().method5993(var34);
            if (var36 == null) {
                field1074[++Statics.field1073 - 1] = 0;
                return 1;
            } else {
                field1074[++Statics.field1073 - 1] = var36.method313(var35.field2652, var35.field2650, var35.field2649) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1074[++Statics.field1073 - 1] = client.method542().method5927();
            field1074[++Statics.field1073 - 1] = client.method542().method5956();
            return 1;
        } else if (arg0 == 6623) {
            class235 var37 = new class235(field1074[--Statics.field1073]);
            class27 var38 = client.method542().method5826(var37.field2652, var37.field2650, var37.field2649);
            if (var38 == null) {
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = var38.method332();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method542().method5855(field1074[--Statics.field1073]);
            return 1;
        } else if (arg0 == 6625) {
            client.method542().method5962();
            return 1;
        } else if (arg0 == 6626) {
            client.method542().method5878(field1074[--Statics.field1073]);
            return 1;
        } else if (arg0 == 6627) {
            client.method542().method5858();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1074[--Statics.field1073] == 1;
            client.method542().method5859(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1074[--Statics.field1073];
            client.method542().method5820(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1074[--Statics.field1073];
            client.method542().method5951(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method542().method5862();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1074[--Statics.field1073] == 1;
            client.method542().method5912(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1073 -= 2;
            int var43 = field1074[Statics.field1073];
            boolean var44 = field1074[Statics.field1073 + 1] == 1;
            client.method542().method5849(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1073 -= 2;
            int var45 = field1074[Statics.field1073];
            boolean var46 = field1074[Statics.field1073 + 1] == 1;
            client.method542().method5899(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1074[++Statics.field1073 - 1] = client.method542().method5866() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = client.method542().method5867(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1074[--Statics.field1073];
            field1074[++Statics.field1073 - 1] = client.method542().method5868(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1073 -= 2;
            int var49 = field1074[Statics.field1073];
            class235 var50 = new class235(field1074[Statics.field1073 + 1]);
            class235 var51 = client.method542().method5871(var49, var50);
            if (var51 == null) {
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = var51.method4268();
            }
            return 1;
        } else if (arg0 == 6639) {
            class35 var52 = client.method542().method5873();
            if (var52 == null) {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = var52.method201();
                field1074[++Statics.field1073 - 1] = var52.field298.method4268();
            }
            return 1;
        } else if (arg0 == 6640) {
            class35 var53 = client.method542().method5874();
            if (var53 == null) {
                field1074[++Statics.field1073 - 1] = -1;
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = var53.method201();
                field1074[++Statics.field1073 - 1] = var53.field298.method4268();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1074[--Statics.field1073];
            class263 var55 = class263.method379(var54);
            if (var55.field3328 == null) {
                field1076[++Statics.field2439 - 1] = "";
            } else {
                field1076[++Statics.field2439 - 1] = var55.field3328;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1074[--Statics.field1073];
            class263 var57 = class263.method379(var56);
            field1074[++Statics.field1073 - 1] = var57.field3330;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1074[--Statics.field1073];
            class263 var59 = class263.method379(var58);
            if (var59 == null) {
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = var59.field3343;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1074[--Statics.field1073];
            class263 var61 = class263.method379(var60);
            if (var61 == null) {
                field1074[++Statics.field1073 - 1] = -1;
            } else {
                field1074[++Statics.field1073 - 1] = var61.field3326;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1074[++Statics.field1073 - 1] = Statics.field377.field362;
            return 1;
        } else if (arg0 == 6698) {
            field1074[++Statics.field1073 - 1] = Statics.field377.field360.method4268();
            return 1;
        } else if (arg0 == 6699) {
            field1074[++Statics.field1073 - 1] = Statics.field377.field361.method4268();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("by.ad(II)V")
    public static void method1615(int arg0) {
        if (arg0 == -1 || !class239.method1101(arg0)) {
            return;
        }
        class239[] var1 = Statics.field2681[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class239 var3 = var1[var2];
            if (var3.field2777 != null) {
                class63 var4 = new class63();
                var4.field575 = var3;
                var4.field580 = var3.field2777;
                method657(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("an.ax(ILif;ZI)V")
    public static void method525(int arg0, class235 arg1, boolean arg2) {
        class27 var3 = client.method542().method5993(arg0);
        int var4 = Statics.field187.field632;
        int var5 = (Statics.field187.field948 >> 7) + Statics.field84;
        int var6 = (Statics.field187.field949 >> 7) + Statics.field30;
        class235 var7 = new class235(var4, var5, var6);
        client.method542().method5833(var3, var7, arg1, arg2);
    }
}
