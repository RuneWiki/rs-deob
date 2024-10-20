package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bm")
public class class71 {

    @ObfuscatedName("bm.c")
    public static int[] field1069 = new int[5];

    @ObfuscatedName("bm.l")
    public static int[][] field1070 = new int[5][5000];

    @ObfuscatedName("bm.b")
    public static int[] field1071 = new int[1000];

    @ObfuscatedName("bm.n")
    public static String[] field1066 = new String[1000];

    @ObfuscatedName("bm.p")
    public static int field1084 = 0;

    @ObfuscatedName("bm.m")
    public static class52[] field1075 = new class52[50];

    @ObfuscatedName("bm.x")
    public static Calendar field1077 = Calendar.getInstance();

    @ObfuscatedName("bm.v")
    public static final String[] field1072 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bm.f")
    public static boolean field1079 = false;

    @ObfuscatedName("bm.a")
    public static boolean field1080 = false;

    @ObfuscatedName("bm.t")
    public static int field1076 = 0;

    @ObfuscatedName("bm.y")
    public static final double field1082 = Math.log(2.0D);

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.g(Lbv;I)V")
    public static void method997(class58 arg0) {
        method1553(arg0, 500000);
    }

    @ObfuscatedName("client.r(Lbv;II)V")
    public static void method1553(class58 arg0, int arg1) {
        Object[] var2 = arg0.field576;
        class87 var4;
        if (class300.method3032(arg0.field574)) {
            Statics.field1986 = (class37) var2[0];
            class258 var3 = class258.method3265(Statics.field1986.field344);
            var4 = class87.method539(arg0.field574, var3.field3314, var3.field3318);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class87.method100(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field601 = 0;
        Statics.field1073 = 0;
        int var6 = -1;
        int[] var7 = var4.field1258;
        int[] var8 = var4.field1253;
        byte var9 = -1;
        field1084 = 0;
        field1079 = false;
        try {
            Statics.field1078 = new int[var4.field1257];
            int var10 = 0;
            Statics.field1068 = new String[var4.field1255];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field566;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field567;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field571 == null ? -1 : arg0.field571.field2771;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field568;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field571 == null ? -1 : arg0.field571.field2788;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field569 == null ? -1 : arg0.field569.field2771;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field569 == null ? -1 : arg0.field569.field2788;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field570;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field563;
                    }
                    Statics.field1078[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field572;
                    }
                    Statics.field1068[var11++] = var14;
                }
            }
            int var15 = 0;
            field1076 = arg0.field573;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var52 = var7[var6];
                if (var52 >= 100) {
                    boolean var42;
                    if (var4.field1253[var6] == 1) {
                        var42 = true;
                    } else {
                        var42 = false;
                    }
                    int var43 = method3087(var52, var4, var42);
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
                    field1071[++Statics.field601 - 1] = var8[var6];
                } else if (var52 == 1) {
                    int var16 = var8[var6];
                    field1071[++Statics.field601 - 1] = class228.field2630[var16];
                } else if (var52 == 2) {
                    int var17 = var8[var6];
                    class228.field2630[var17] = field1071[--Statics.field601];
                    client.method4246(var17);
                } else if (var52 == 3) {
                    field1066[++Statics.field1073 - 1] = var4.field1256[var6];
                } else if (var52 == 6) {
                    var6 += var8[var6];
                } else if (var52 == 7) {
                    Statics.field601 -= 2;
                    if (field1071[Statics.field601] != field1071[Statics.field601 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var52 == 8) {
                    Statics.field601 -= 2;
                    if (field1071[Statics.field601] == field1071[Statics.field601 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var52 == 9) {
                    Statics.field601 -= 2;
                    if (field1071[Statics.field601] < field1071[Statics.field601 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var52 == 10) {
                    Statics.field601 -= 2;
                    if (field1071[Statics.field601] > field1071[Statics.field601 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var52 == 21) {
                    if (field1084 == 0) {
                        return;
                    }
                    class52 var18 = field1075[--field1084];
                    var4 = var18.field522;
                    var7 = var4.field1258;
                    var8 = var4.field1253;
                    var6 = var18.field524;
                    Statics.field1078 = var18.field515;
                    Statics.field1068 = var18.field518;
                } else if (var52 == 25) {
                    int var19 = var8[var6];
                    field1071[++Statics.field601 - 1] = class228.method2246(var19);
                } else if (var52 == 27) {
                    int var20 = var8[var6];
                    class228.method687(var20, field1071[--Statics.field601]);
                } else if (var52 == 31) {
                    Statics.field601 -= 2;
                    if (field1071[Statics.field601] <= field1071[Statics.field601 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var52 == 32) {
                    Statics.field601 -= 2;
                    if (field1071[Statics.field601] >= field1071[Statics.field601 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var52 == 33) {
                    field1071[++Statics.field601 - 1] = Statics.field1078[var8[var6]];
                } else if (var52 == 34) {
                    Statics.field1078[var8[var6]] = field1071[--Statics.field601];
                } else if (var52 == 35) {
                    field1066[++Statics.field1073 - 1] = Statics.field1068[var8[var6]];
                } else if (var52 == 36) {
                    Statics.field1068[var8[var6]] = field1066[--Statics.field1073];
                } else if (var52 == 37) {
                    int var21 = var8[var6];
                    Statics.field1073 -= var21;
                    String var22 = class308.method458(field1066, Statics.field1073, var21);
                    field1066[++Statics.field1073 - 1] = var22;
                } else if (var52 == 38) {
                    Statics.field601--;
                } else if (var52 == 39) {
                    Statics.field1073--;
                } else if (var52 == 40) {
                    int var23 = var8[var6];
                    class87 var24 = class87.method100(var23);
                    int[] var25 = new int[var24.field1257];
                    String[] var26 = new String[var24.field1255];
                    for (int var27 = 0; var27 < var24.field1259; var27++) {
                        var25[var27] = field1071[Statics.field601 - var24.field1259 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1260; var28++) {
                        var26[var28] = field1066[Statics.field1073 - var24.field1260 + var28];
                    }
                    Statics.field601 -= var24.field1259;
                    Statics.field1073 -= var24.field1260;
                    class52 var29 = new class52();
                    var29.field522 = var4;
                    var29.field524 = var6;
                    var29.field515 = Statics.field1078;
                    var29.field518 = Statics.field1068;
                    field1075[++field1084 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1258;
                    var8 = var24.field1253;
                    var6 = -1;
                    Statics.field1078 = var25;
                    Statics.field1068 = var26;
                } else if (var52 == 42) {
                    field1071[++Statics.field601 - 1] = Statics.field349.method1961(var8[var6]);
                } else if (var52 == 43) {
                    Statics.field349.method1984(var8[var6], field1071[--Statics.field601]);
                } else if (var52 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1071[--Statics.field601];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1069[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1070[var30][var34] = var33;
                    }
                } else if (var52 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1071[--Statics.field601];
                    if (var36 < 0 || var36 >= field1069[var35]) {
                        throw new RuntimeException();
                    }
                    field1071[++Statics.field601 - 1] = field1070[var35][var36];
                } else if (var52 == 46) {
                    int var37 = var8[var6];
                    Statics.field601 -= 2;
                    int var38 = field1071[Statics.field601];
                    if (var38 < 0 || var38 >= field1069[var37]) {
                        throw new RuntimeException();
                    }
                    field1070[var37][var38] = field1071[Statics.field601 + 1];
                } else if (var52 == 47) {
                    String var39 = Statics.field349.method1959(var8[var6]);
                    if (var39 == null) {
                        var39 = class240.field2863;
                    }
                    field1066[++Statics.field1073 - 1] = var39;
                } else if (var52 == 48) {
                    Statics.field349.method1976(var8[var6], field1066[--Statics.field1073]);
                } else if (var52 == 60) {
                    class200 var40 = var4.field1254[var8[var6]];
                    class214 var41 = (class214) var40.method3866((long) field1071[--Statics.field601]);
                    if (var41 != null) {
                        var6 += var41.field2513;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var50) {
            StringBuilder var45 = new StringBuilder(30);
            var45.append("").append(var4.field2497).append(" ");
            for (int var46 = field1084 - 1; var46 >= 0; var46--) {
                var45.append("").append(field1075[var46].field522.field2497).append(" ");
            }
            var45.append("").append(var9);
            class155.method1917(var45.toString(), var50);
        } finally {
            if (field1079) {
                field1080 = true;
                client.method704();
                field1080 = false;
                field1079 = false;
            }
        }
    }

    @ObfuscatedName("ee.e(ILcx;ZI)I")
    public static int method3087(int arg0, class87 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method952(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method3341(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method470(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method491(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method5261(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method220(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method2038(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method4750(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method1065(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method1556(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method1026(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method3341(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method470(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method491(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method5261(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method220(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3395(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method206(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return Statics.method2077(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method707(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method1026(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method4256(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method5077(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method5436(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method5832(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method4629(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method3144(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method5319(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method3263(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method1091(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method4665(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method300(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method3157(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return Statics.method1876(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method4695(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3251(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method96(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.q(ILcx;ZB)I")
    public static int method952(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field601 -= 3;
            int var3 = field1071[Statics.field601];
            int var4 = field1071[Statics.field601 + 1];
            int var5 = field1071[Statics.field601 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class233 var6 = class233.method214(var3);
            if (var6.field2792 == null) {
                var6.field2792 = new class233[var5 + 1];
            }
            if (var6.field2792.length <= var5) {
                class233[] var7 = new class233[var5 + 1];
                for (int var8 = 0; var8 < var6.field2792.length; var8++) {
                    var7[var8] = var6.field2792[var8];
                }
                var6.field2792 = var7;
            }
            if (var5 > 0 && var6.field2792[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class233 var9 = new class233();
            var9.field2809 = var4;
            var9.field2701 = var9.field2771 = var6.field2771;
            var9.field2788 = var5;
            var9.field2686 = true;
            var6.field2792[var5] = var9;
            if (arg2) {
                Statics.field76 = var9;
            } else {
                Statics.field1081 = var9;
            }
            client.method642(var6);
            return 1;
        } else if (arg0 == 101) {
            class233 var10 = arg2 ? Statics.field76 : Statics.field1081;
            class233 var11 = class233.method214(var10.field2771);
            var11.field2792[var10.field2788] = null;
            client.method642(var11);
            return 1;
        } else if (arg0 == 102) {
            class233 var12 = class233.method214(field1071[--Statics.field601]);
            var12.field2792 = null;
            client.method642(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field601 -= 2;
            int var13 = field1071[Statics.field601];
            int var14 = field1071[Statics.field601 + 1];
            class233 var15 = class233.method103(var13, var14);
            if (var15 == null || var14 == -1) {
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = 1;
                if (arg2) {
                    Statics.field76 = var15;
                } else {
                    Statics.field1081 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class233 var16 = class233.method214(field1071[--Statics.field601]);
            if (var16 == null) {
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = 1;
                if (arg2) {
                    Statics.field76 = var16;
                } else {
                    Statics.field1081 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fn.c(ILcx;ZI)I")
    public static int method3341(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1071[--Statics.field601];
            var4 = class233.method214(var3);
        } else {
            var4 = arg2 ? Statics.field76 : Statics.field1081;
        }
        if (arg0 == 1000) {
            Statics.field601 -= 4;
            var4.field2677 = field1071[Statics.field601];
            var4.field2752 = field1071[Statics.field601 + 1];
            var4.field2673 = field1071[Statics.field601 + 2];
            var4.field2674 = field1071[Statics.field601 + 3];
            client.method642(var4);
            Statics.field2038.method1478(var4);
            if (var3 != -1 && var4.field2809 == 0) {
                client.method4245(Statics.field1952[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field601 -= 4;
            var4.field2679 = field1071[Statics.field601];
            var4.field2680 = field1071[Statics.field601 + 1];
            var4.field2737 = field1071[Statics.field601 + 2];
            var4.field2676 = field1071[Statics.field601 + 3];
            client.method642(var4);
            Statics.field2038.method1478(var4);
            if (var3 != -1 && var4.field2809 == 0) {
                client.method4245(Statics.field1952[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1071[--Statics.field601] == 1;
            if (var4.field2705 != var5) {
                var4.field2705 = var5;
                client.method642(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2808 = field1071[--Statics.field601] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2747 = field1071[--Statics.field601] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("af.i(ILcx;ZI)I")
    public static int method470(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1071[--Statics.field601];
            var4 = class233.method214(var3);
        } else {
            var4 = arg2 ? Statics.field76 : Statics.field1081;
        }
        if (arg0 == 1100) {
            Statics.field601 -= 2;
            var4.field2712 = field1071[Statics.field601];
            if (var4.field2712 > var4.field2691 - var4.field2683) {
                var4.field2712 = var4.field2691 - var4.field2683;
            }
            if (var4.field2712 < 0) {
                var4.field2712 = 0;
            }
            var4.field2690 = field1071[Statics.field601 + 1];
            if (var4.field2690 > var4.field2692 - var4.field2684) {
                var4.field2690 = var4.field2692 - var4.field2684;
            }
            if (var4.field2690 < 0) {
                var4.field2690 = 0;
            }
            client.method642(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2687 = field1071[--Statics.field601];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2697 = field1071[--Statics.field601] == 1;
            client.method642(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2699 = field1071[--Statics.field601];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2769 = field1071[--Statics.field601];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2703 = field1071[--Statics.field601];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2781 = field1071[--Statics.field601];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2706 = field1071[--Statics.field601] == 1;
            client.method642(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2741 = 1;
            var4.field2756 = field1071[--Statics.field601];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field601 -= 6;
            var4.field2719 = field1071[Statics.field601];
            var4.field2718 = field1071[Statics.field601 + 1];
            var4.field2733 = field1071[Statics.field601 + 2];
            var4.field2720 = field1071[Statics.field601 + 3];
            var4.field2721 = field1071[Statics.field601 + 4];
            var4.field2722 = field1071[Statics.field601 + 5];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1071[--Statics.field601];
            if (var4.field2715 != var5) {
                var4.field2715 = var5;
                var4.field2796 = 0;
                var4.field2751 = 0;
                client.method642(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2689 = field1071[--Statics.field601] == 1;
            client.method642(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1066[--Statics.field1073];
            if (!var6.equals(var4.field2729)) {
                var4.field2729 = var6;
                client.method642(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2728 = field1071[--Statics.field601];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field601 -= 3;
            var4.field2682 = field1071[Statics.field601];
            var4.field2777 = field1071[Statics.field601 + 1];
            var4.field2731 = field1071[Statics.field601 + 2];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2717 = field1071[--Statics.field601] == 1;
            client.method642(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2707 = field1071[--Statics.field601];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2708 = field1071[--Statics.field601];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2672 = field1071[--Statics.field601] == 1;
            client.method642(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2710 = field1071[--Statics.field601] == 1;
            client.method642(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field601 -= 2;
            var4.field2691 = field1071[Statics.field601];
            var4.field2692 = field1071[Statics.field601 + 1];
            client.method642(var4);
            if (var3 != -1 && var4.field2809 == 0) {
                client.method4245(Statics.field1952[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method5060(var4.field2771, var4.field2788);
            client.field881 = var4;
            client.method642(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2704 = field1071[--Statics.field601];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2694 = field1071[--Statics.field601];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2700 = field1071[--Statics.field601];
            client.method642(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1071[--Statics.field601];
            class322 var8 = (class322) class180.method712(class322.method3047(), var7);
            if (var8 != null) {
                var4.field2745 = var8;
                client.method642(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1071[--Statics.field601] == 1;
            var4.field2702 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1071[--Statics.field601] == 1;
            var4.field2726 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aw.p(ILcx;ZI)I")
    public static int method491(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method214(field1071[--Statics.field601]);
        } else {
            var3 = arg2 ? Statics.field76 : Statics.field1081;
        }
        client.method642(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field601 -= 2;
            int var4 = field1071[Statics.field601];
            int var5 = field1071[Statics.field601 + 1];
            var3.field2794 = var4;
            var3.field2795 = var5;
            class272 var6 = class272.method1995(var4);
            var3.field2733 = var6.field3525;
            var3.field2720 = var6.field3520;
            var3.field2721 = var6.field3521;
            var3.field2719 = var6.field3522;
            var3.field2718 = var6.field3523;
            var3.field2722 = var6.field3518;
            if (arg0 == 1205) {
                var3.field2798 = 0;
            } else if (arg0 == 1212 | var6.field3524 == 1) {
                var3.field2798 = 1;
            } else {
                var3.field2798 = 2;
            }
            if (var3.field2723 > 0) {
                var3.field2722 = var3.field2722 * 32 / var3.field2723;
            } else if (var3.field2679 > 0) {
                var3.field2722 = var3.field2722 * 32 / var3.field2679;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2741 = 2;
            var3.field2756 = field1071[--Statics.field601];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2741 = 3;
            var3.field2756 = Statics.field1064.field631.method4303();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kl.m(ILcx;ZI)I")
    public static int method5261(int arg0, class87 arg1, boolean arg2) {
        boolean var3 = true;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class233.method214(field1071[--Statics.field601]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field76 : Statics.field1081;
        }
        if (arg0 == 1300) {
            int var5 = field1071[--Statics.field601] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4342(var5, field1066[--Statics.field1073]);
                return 1;
            } else {
                Statics.field1073--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field601 -= 2;
            int var6 = field1071[Statics.field601];
            int var7 = field1071[Statics.field601 + 1];
            var4.field2749 = class233.method103(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2785 = field1071[--Statics.field601] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2750 = field1071[--Statics.field601];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2800 = field1071[--Statics.field601];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2698 = field1066[--Statics.field1073];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2753 = field1066[--Statics.field1073];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2732 = null;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field601 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1071[Statics.field601 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1071[Statics.field601 + var10];
                        var9[var10 / 2] = (byte) field1071[Statics.field601 + var10 + 1];
                    }
                }
            } else {
                Statics.field601 -= 2;
                var8 = new byte[] { (byte) field1071[Statics.field601] };
                var9 = new byte[] { (byte) field1071[Statics.field601 + 1] };
            }
            int var11 = field1071[--Statics.field601] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method992(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field601 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1071[Statics.field601] };
            byte[] var14 = new byte[] { (byte) field1071[Statics.field601 + 1] };
            method992(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field601 -= 3;
            int var15 = field1071[Statics.field601] - 1;
            int var16 = field1071[Statics.field601 + 1];
            int var17 = field1071[Statics.field601 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method1691(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1071[--Statics.field601];
            int var20 = field1071[--Statics.field601];
            method1691(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field601--;
            int var21 = field1071[Statics.field601] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method141(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method141(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.d(Lhn;I[B[BI)V")
    public static final void method992(class233 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2711 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2711 = new byte[11][];
            arg0.field2744 = new byte[11][];
            arg0.field2766 = new int[11];
            arg0.field2746 = new int[11];
        }
        arg0.field2711[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2725 = false;
            for (int var4 = 0; var4 < arg0.field2711.length; var4++) {
                if (arg0.field2711[var4] != null) {
                    arg0.field2725 = true;
                    break;
                }
            }
        } else {
            arg0.field2725 = true;
        }
        arg0.field2744[arg1] = arg3;
    }

    @ObfuscatedName("bh.j(Lhn;IIII)V")
    public static final void method1691(class233 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2766 == null) {
            throw new RuntimeException();
        }
        arg0.field2766[arg1] = arg2;
        arg0.field2746[arg1] = arg3;
    }

    @ObfuscatedName("d.x(Lhn;IS)V")
    public static final void method141(class233 arg0, int arg1) {
        if (arg0.field2711 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2807 == null) {
            arg0.field2807 = new int[arg0.field2711.length];
        }
        arg0.field2807[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("a.v(ILcx;ZB)I")
    public static int method220(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method214(field1071[--Statics.field601]);
        } else {
            var3 = arg2 ? Statics.field76 : Statics.field1081;
        }
        String var4 = field1066[--Statics.field1073];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1071[--Statics.field601];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1071[--Statics.field601];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1066[--Statics.field1073];
            } else {
                var7[var8] = Integer.valueOf(field1071[--Statics.field601]);
            }
        }
        int var9 = field1071[--Statics.field601];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2657 = var7;
        } else if (arg0 == 1401) {
            var3.field2759 = var7;
        } else if (arg0 == 1402) {
            var3.field2757 = var7;
        } else if (arg0 == 1403) {
            var3.field2760 = var7;
        } else if (arg0 == 1404) {
            var3.field2762 = var7;
        } else if (arg0 == 1405) {
            var3.field2713 = var7;
        } else if (arg0 == 1406) {
            var3.field2743 = var7;
        } else if (arg0 == 1407) {
            var3.field2767 = var7;
            var3.field2768 = var5;
        } else if (arg0 == 1408) {
            var3.field2659 = var7;
        } else if (arg0 == 1409) {
            var3.field2774 = var7;
        } else if (arg0 == 1410) {
            var3.field2764 = var7;
        } else if (arg0 == 1411) {
            var3.field2804 = var7;
        } else if (arg0 == 1412) {
            var3.field2761 = var7;
        } else if (arg0 == 1414) {
            var3.field2661 = var7;
            var3.field2770 = var5;
        } else if (arg0 == 1415) {
            var3.field2668 = var7;
            var3.field2772 = var5;
        } else if (arg0 == 1416) {
            var3.field2765 = var7;
        } else if (arg0 == 1417) {
            var3.field2775 = var7;
        } else if (arg0 == 1418) {
            var3.field2776 = var7;
        } else if (arg0 == 1419) {
            var3.field2667 = var7;
        } else if (arg0 == 1420) {
            var3.field2778 = var7;
        } else if (arg0 == 1421) {
            var3.field2748 = var7;
        } else if (arg0 == 1422) {
            var3.field2780 = var7;
        } else if (arg0 == 1423) {
            var3.field2790 = var7;
        } else if (arg0 == 1424) {
            var3.field2782 = var7;
        } else if (arg0 == 1425) {
            var3.field2784 = var7;
        } else if (arg0 == 1426) {
            var3.field2797 = var7;
        } else if (arg0 == 1427) {
            var3.field2783 = var7;
        } else {
            return 2;
        }
        var3.field2754 = true;
        return 1;
    }

    @ObfuscatedName("cy.h(ILcx;ZI)I")
    public static int method2038(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field76 : Statics.field1081;
        if (arg0 == 1500) {
            field1071[++Statics.field601 - 1] = var3.field2681;
            return 1;
        } else if (arg0 == 1501) {
            field1071[++Statics.field601 - 1] = var3.field2773;
            return 1;
        } else if (arg0 == 1502) {
            field1071[++Statics.field601 - 1] = var3.field2683;
            return 1;
        } else if (arg0 == 1503) {
            field1071[++Statics.field601 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 1504) {
            field1071[++Statics.field601 - 1] = var3.field2705 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1071[++Statics.field601 - 1] = var3.field2701;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jh.f(ILcx;ZI)I")
    public static int method4750(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field76 : Statics.field1081;
        if (arg0 == 1600) {
            field1071[++Statics.field601 - 1] = var3.field2712;
            return 1;
        } else if (arg0 == 1601) {
            field1071[++Statics.field601 - 1] = var3.field2690;
            return 1;
        } else if (arg0 == 1602) {
            field1066[++Statics.field1073 - 1] = var3.field2729;
            return 1;
        } else if (arg0 == 1603) {
            field1071[++Statics.field601 - 1] = var3.field2691;
            return 1;
        } else if (arg0 == 1604) {
            field1071[++Statics.field601 - 1] = var3.field2692;
            return 1;
        } else if (arg0 == 1605) {
            field1071[++Statics.field601 - 1] = var3.field2722;
            return 1;
        } else if (arg0 == 1606) {
            field1071[++Statics.field601 - 1] = var3.field2733;
            return 1;
        } else if (arg0 == 1607) {
            field1071[++Statics.field601 - 1] = var3.field2721;
            return 1;
        } else if (arg0 == 1608) {
            field1071[++Statics.field601 - 1] = var3.field2720;
            return 1;
        } else if (arg0 == 1609) {
            field1071[++Statics.field601 - 1] = var3.field2699;
            return 1;
        } else if (arg0 == 1610) {
            field1071[++Statics.field601 - 1] = var3.field2700;
            return 1;
        } else if (arg0 == 1611) {
            field1071[++Statics.field601 - 1] = var3.field2687;
            return 1;
        } else if (arg0 == 1612) {
            field1071[++Statics.field601 - 1] = var3.field2694;
            return 1;
        } else if (arg0 == 1613) {
            field1071[++Statics.field601 - 1] = var3.field2745.method172();
            return 1;
        } else if (arg0 == 1614) {
            field1071[++Statics.field601 - 1] = var3.field2726 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bw.a(ILcx;ZI)I")
    public static int method1065(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field76 : Statics.field1081;
        if (arg0 == 1700) {
            field1071[++Statics.field601 - 1] = var3.field2794;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2794 == -1) {
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = var3.field2795;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1071[++Statics.field601 - 1] = var3.field2788;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.t(ILcx;ZI)I")
    public static int method1556(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field76 : Statics.field1081;
        if (arg0 == 1800) {
            field1071[++Statics.field601 - 1] = class234.method99(client.method4593(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1071[--Statics.field601];
            int var5 = var4 - 1;
            if (var3.field2732 == null || var5 >= var3.field2732.length || var3.field2732[var5] == null) {
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1066[++Statics.field1073 - 1] = var3.field2732[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2698 == null) {
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1066[++Statics.field1073 - 1] = var3.field2698;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ba.k(ILcx;ZI)I")
    public static int method1026(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method214(field1071[--Statics.field601]);
        } else {
            var3 = arg2 ? Statics.field76 : Statics.field1081;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1076 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2783 == null) {
            return 0;
        } else {
            class58 var4 = new class58();
            var4.field571 = var3;
            var4.field576 = var3.field2783;
            var4.field573 = field1076 + 1;
            client.field843.method3957(var4);
            return 1;
        }
    }

    @ObfuscatedName("fo.s(ILcx;ZI)I")
    public static int method3395(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method214(field1071[--Statics.field601]);
        if (arg0 == 2500) {
            field1071[++Statics.field601 - 1] = var3.field2681;
            return 1;
        } else if (arg0 == 2501) {
            field1071[++Statics.field601 - 1] = var3.field2773;
            return 1;
        } else if (arg0 == 2502) {
            field1071[++Statics.field601 - 1] = var3.field2683;
            return 1;
        } else if (arg0 == 2503) {
            field1071[++Statics.field601 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 2504) {
            field1071[++Statics.field601 - 1] = var3.field2705 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1071[++Statics.field601 - 1] = var3.field2701;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.y(ILcx;ZI)I")
    public static int method206(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method214(field1071[--Statics.field601]);
        if (arg0 == 2600) {
            field1071[++Statics.field601 - 1] = var3.field2712;
            return 1;
        } else if (arg0 == 2601) {
            field1071[++Statics.field601 - 1] = var3.field2690;
            return 1;
        } else if (arg0 == 2602) {
            field1066[++Statics.field1073 - 1] = var3.field2729;
            return 1;
        } else if (arg0 == 2603) {
            field1071[++Statics.field601 - 1] = var3.field2691;
            return 1;
        } else if (arg0 == 2604) {
            field1071[++Statics.field601 - 1] = var3.field2692;
            return 1;
        } else if (arg0 == 2605) {
            field1071[++Statics.field601 - 1] = var3.field2722;
            return 1;
        } else if (arg0 == 2606) {
            field1071[++Statics.field601 - 1] = var3.field2733;
            return 1;
        } else if (arg0 == 2607) {
            field1071[++Statics.field601 - 1] = var3.field2721;
            return 1;
        } else if (arg0 == 2608) {
            field1071[++Statics.field601 - 1] = var3.field2720;
            return 1;
        } else if (arg0 == 2609) {
            field1071[++Statics.field601 - 1] = var3.field2699;
            return 1;
        } else if (arg0 == 2610) {
            field1071[++Statics.field601 - 1] = var3.field2700;
            return 1;
        } else if (arg0 == 2611) {
            field1071[++Statics.field601 - 1] = var3.field2687;
            return 1;
        } else if (arg0 == 2612) {
            field1071[++Statics.field601 - 1] = var3.field2694;
            return 1;
        } else if (arg0 == 2613) {
            field1071[++Statics.field601 - 1] = var3.field2745.method172();
            return 1;
        } else if (arg0 == 2614) {
            field1071[++Statics.field601 - 1] = var3.field2726 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("al.o(ILcx;ZB)I")
    public static int method707(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method214(field1071[--Statics.field601]);
        if (arg0 == 2800) {
            field1071[++Statics.field601 - 1] = class234.method99(client.method4593(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1071[--Statics.field601];
            int var5 = var4 - 1;
            if (var3.field2732 == null || var5 >= var3.field2732.length || var3.field2732[var5] == null) {
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1066[++Statics.field1073 - 1] = var3.field2732[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2698 == null) {
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1066[++Statics.field1073 - 1] = var3.field2698;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hp.af(ILcx;ZB)I")
    public static int method4256(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1066[--Statics.field1073];
            class86.method1084(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field601 -= 2;
            client.method558(Statics.field1064, field1071[Statics.field601], field1071[Statics.field601 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1080) {
                field1079 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1066[--Statics.field1073];
            int var5 = 0;
            if (class308.method4046(var4)) {
                var5 = class308.method3359(var4);
            }
            class175 var6 = class175.method3035(class172.field2261, client.field691.field1283);
            var6.field2333.method3617(var5);
            client.field691.method2060(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1066[--Statics.field1073];
            class175 var8 = class175.method3035(class172.field2303, client.field691.field1283);
            var8.field2333.method3501(var7.length() + 1);
            var8.field2333.method3585(var7);
            client.field691.method2060(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1066[--Statics.field1073];
            class175 var10 = class175.method3035(class172.field2216, client.field691.field1283);
            var10.field2333.method3501(var9.length() + 1);
            var10.field2333.method3585(var9);
            client.field691.method2060(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1071[--Statics.field601];
            String var12 = field1066[--Statics.field1073];
            Statics.method632(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field601 -= 3;
            int var13 = field1071[Statics.field601];
            int var14 = field1071[Statics.field601 + 1];
            int var15 = field1071[Statics.field601 + 2];
            class233 var16 = class233.method214(var15);
            client.method3038(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field601 -= 2;
            int var17 = field1071[Statics.field601];
            int var18 = field1071[Statics.field601 + 1];
            class233 var19 = arg2 ? Statics.field76 : Statics.field1081;
            client.method3038(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field133 = field1071[--Statics.field601] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1071[++Statics.field601 - 1] = Statics.field436.field1030 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field436.field1030 = field1071[--Statics.field601] == 1;
            class68.method1123();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1066[--Statics.field1073];
            boolean var21 = field1071[--Statics.field601] == 1;
            class46.method3067(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1071[--Statics.field601];
            class175 var23 = class175.method3035(class172.field2250, client.field691.field1283);
            var23.field2333.method3450(var22);
            client.field691.method2060(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1071[--Statics.field601];
            Statics.field1073 -= 2;
            String var25 = field1066[Statics.field1073];
            String var26 = field1066[Statics.field1073 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class175 var27 = class175.method3035(class172.field2224, client.field691.field1283);
                var27.field2333.method3450(1 + class185.method2245(var25) + class185.method2245(var26));
                var27.field2333.method3585(var25);
                var27.field2333.method3501(var24);
                var27.field2333.method3585(var26);
                client.field691.method2060(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field790 = field1071[--Statics.field601] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field792 = field1071[--Statics.field601] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field763 = field1071[--Statics.field601] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1071[--Statics.field601] == 1) {
                client.field677 |= 0x1;
            } else {
                client.field677 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1071[--Statics.field601] == 1) {
                client.field677 |= 0x2;
            } else {
                client.field677 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1071[--Statics.field601] == 1) {
                client.field677 |= 0x4;
            } else {
                client.field677 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1071[--Statics.field601] == 1) {
                client.field677 |= 0x8;
            } else {
                client.field677 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field677 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field749 = field1071[--Statics.field601] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field759 = field1071[--Statics.field601] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method1875(field1071[--Statics.field601] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1071[++Statics.field601 - 1] = client.method1085() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field601 -= 2;
            client.field724 = field1071[Statics.field601];
            client.field725 = field1071[Statics.field601 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field601 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field601--;
            return 1;
        } else if (arg0 == 3132) {
            field1071[++Statics.field601 - 1] = Statics.field1039;
            field1071[++Statics.field601 - 1] = Statics.field1938;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field601--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field601 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field806 = 3;
            client.field643 = field1071[--Statics.field601];
            return 1;
        } else if (arg0 == 3137) {
            client.field806 = 2;
            client.field643 = field1071[--Statics.field601];
            return 1;
        } else if (arg0 == 3138) {
            client.field806 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field806 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field806 = 3;
            client.field643 = arg2 ? Statics.field76.field2771 : Statics.field1081.field2771;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1071[--Statics.field601] == 1;
            Statics.field436.field1034 = var28;
            class68.method1123();
            return 1;
        } else if (arg0 == 3142) {
            field1071[++Statics.field601 - 1] = Statics.field436.field1034 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1071[--Statics.field601] == 1;
            client.field747 = var29;
            if (!var29) {
                Statics.field436.field1035 = "";
                class68.method1123();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1071[++Statics.field601 - 1] = client.field747 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jg.an(ILcx;ZS)I")
    public static int method5077(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field601 -= 3;
            client.method634(field1071[Statics.field601], field1071[Statics.field601 + 1], field1071[Statics.field601 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method1734(field1071[--Statics.field601]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field601 -= 2;
            client.method4592(field1071[Statics.field601], field1071[Statics.field601 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kr.ax(ILcx;ZI)I")
    public static int method5436(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1071[++Statics.field601 - 1] = client.field656;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field601 -= 2;
            int var3 = field1071[Statics.field601];
            int var4 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = class55.method56(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field601 -= 2;
            int var5 = field1071[Statics.field601];
            int var6 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = class55.method3058(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field601 -= 2;
            int var7 = field1071[Statics.field601];
            int var8 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = class55.method1140(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = class256.method3707(var9).field3300;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = client.field776[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = client.field777[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = client.field778[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field600;
            int var14 = (Statics.field1064.field954 >> 7) + Statics.field491;
            int var15 = (Statics.field1064.field1000 >> 7) + Statics.field92;
            field1071[++Statics.field601 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1071[++Statics.field601 - 1] = client.field648 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field601 -= 2;
            int var19 = field1071[Statics.field601] + 32768;
            int var20 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = class55.method56(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field601 -= 2;
            int var21 = field1071[Statics.field601] + 32768;
            int var22 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = class55.method3058(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field601 -= 2;
            int var23 = field1071[Statics.field601] + 32768;
            int var24 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = class55.method1140(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field813 >= 2) {
                field1071[++Statics.field601 - 1] = client.field813;
            } else {
                field1071[++Statics.field601 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1071[++Statics.field601 - 1] = client.field663;
            return 1;
        } else if (arg0 == 3318) {
            field1071[++Statics.field601 - 1] = client.field692;
            return 1;
        } else if (arg0 == 3321) {
            field1071[++Statics.field601 - 1] = client.field811;
            return 1;
        } else if (arg0 == 3322) {
            field1071[++Statics.field601 - 1] = client.field852;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field864) {
                field1071[++Statics.field601 - 1] = 1;
            } else {
                field1071[++Statics.field601 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1071[++Statics.field601 - 1] = client.field661;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field601 -= 4;
            int var25 = field1071[Statics.field601];
            int var26 = field1071[Statics.field601 + 1];
            int var27 = field1071[Statics.field601 + 2];
            int var28 = field1071[Statics.field601 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1071[++Statics.field601 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lz.aw(ILcx;ZI)I")
    public static int method5832(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field601 -= 2;
            int var3 = field1071[Statics.field601];
            int var4 = field1071[Statics.field601 + 1];
            class269 var5 = Statics.method2036(var3);
            if (var5.field3418 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3421; var6++) {
                if (var5.field3417[var6] == var4) {
                    field1066[++Statics.field1073 - 1] = var5.field3424[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1066[++Statics.field1073 - 1] = var5.field3422;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field601 -= 4;
            int var7 = field1071[Statics.field601];
            int var8 = field1071[Statics.field601 + 1];
            int var9 = field1071[Statics.field601 + 2];
            int var10 = field1071[Statics.field601 + 3];
            class269 var11 = Statics.method2036(var9);
            if (var11.field3426 != var7 || var11.field3418 != var8) {
                if (var8 == 115) {
                    field1066[++Statics.field1073 - 1] = class240.field2863;
                } else {
                    field1071[++Statics.field601 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3421; var12++) {
                if (var11.field3417[var12] == var10) {
                    if (var8 == 115) {
                        field1066[++Statics.field1073 - 1] = var11.field3424[var12];
                    } else {
                        field1071[++Statics.field601 - 1] = var11.field3423[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1066[++Statics.field1073 - 1] = var11.field3422;
                } else {
                    field1071[++Statics.field601 - 1] = var11.field3416;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1071[--Statics.field601];
            class269 var14 = Statics.method2036(var13);
            field1071[++Statics.field601 - 1] = var14.method4817();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("im.ae(ILcx;ZB)I")
    public static int method4629(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field2151.field1043 == 0) {
                field1071[++Statics.field601 - 1] = -2;
            } else if (Statics.field2151.field1043 == 1) {
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = Statics.field2151.field1041.method5172();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1071[--Statics.field601];
            if (Statics.field2151.method1644() && var3 >= 0 && var3 < Statics.field2151.field1041.method5172()) {
                class295 var4 = (class295) Statics.field2151.field1041.method5181(var3);
                field1066[++Statics.field1073 - 1] = var4.method5134();
                field1066[++Statics.field1073 - 1] = var4.method5130();
            } else {
                field1066[++Statics.field1073 - 1] = "";
                field1066[++Statics.field1073 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1071[--Statics.field601];
            if (Statics.field2151.method1644() && var5 >= 0 && var5 < Statics.field2151.field1041.method5172()) {
                field1071[++Statics.field601 - 1] = ((class290) Statics.field2151.field1041.method5181(var5)).field3709;
            } else {
                field1071[++Statics.field601 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1071[--Statics.field601];
            if (Statics.field2151.method1644() && var6 >= 0 && var6 < Statics.field2151.field1041.method5172()) {
                field1071[++Statics.field601 - 1] = ((class290) Statics.field2151.field1041.method5181(var6)).field3711;
            } else {
                field1071[++Statics.field601 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1066[--Statics.field1073];
            int var8 = field1071[--Statics.field601];
            class69.method3132(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1066[--Statics.field1073];
            Statics.field2151.method1651(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1066[--Statics.field1073];
            Statics.field2151.method1655(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1066[--Statics.field1073];
            Statics.field2151.method1653(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1066[--Statics.field1073];
            Statics.field2151.method1673(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1066[--Statics.field1073];
            String var14 = client.method2015(var13);
            field1071[++Statics.field601 - 1] = Statics.field2151.method1669(new class294(var14, Statics.field921), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field27 == null) {
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1066[++Statics.field1073 - 1] = Statics.field27.field3727;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field27 == null) {
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = Statics.field27.method5172();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1071[--Statics.field601];
            if (Statics.field27 == null || var15 >= Statics.field27.method5172()) {
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1066[++Statics.field1073 - 1] = Statics.field27.method5181(var15).method5128().method5269();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1071[--Statics.field601];
            if (Statics.field27 == null || var16 >= Statics.field27.method5172()) {
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = ((class290) Statics.field27.method5181(var16)).method5250();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1071[--Statics.field601];
            if (Statics.field27 == null || var17 >= Statics.field27.method5172()) {
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = ((class290) Statics.field27.method5181(var17)).field3711;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1071[++Statics.field601 - 1] = Statics.field27 == null ? 0 : Statics.field27.field3732;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1066[--Statics.field1073];
            client.method44(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1071[++Statics.field601 - 1] = Statics.field27 == null ? 0 : Statics.field27.field3733;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1066[--Statics.field1073];
            client.method4847(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method985();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field2151.method1644()) {
                field1071[++Statics.field601 - 1] = Statics.field2151.field1042.method5172();
            } else {
                field1071[++Statics.field601 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1071[--Statics.field601];
            if (Statics.field2151.method1644() && var20 >= 0 && var20 < Statics.field2151.field1042.method5172()) {
                class289 var21 = (class289) Statics.field2151.field1042.method5181(var20);
                field1066[++Statics.field1073 - 1] = var21.method5134();
                field1066[++Statics.field1073 - 1] = var21.method5130();
            } else {
                field1066[++Statics.field1073 - 1] = "";
                field1066[++Statics.field1073 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1066[--Statics.field1073];
            String var23 = client.method2015(var22);
            field1071[++Statics.field601 - 1] = Statics.field2151.method1696(new class294(var23, Statics.field921)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1071[--Statics.field601];
            if (Statics.field27 == null || var24 >= Statics.field27.method5172() || !Statics.field27.method5181(var24).method5128().equals(Statics.field1064.field626)) {
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field27 == null || Statics.field27.field3731 == null) {
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1066[++Statics.field1073 - 1] = Statics.field27.field3731;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1071[--Statics.field601];
            if (Statics.field27 == null || var25 >= Statics.field27.method5172() || !((class284) Statics.field27.method5181(var25)).method5108()) {
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1071[--Statics.field601];
            if (Statics.field27 == null || var26 >= Statics.field27.method5172() || !((class284) Statics.field27.method5181(var26)).method5111()) {
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field2151.field1041.method5190();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1041.method5191(new class314(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1041.method5191(new class315(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1041.method5191(new class146(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1041.method5191(new class140(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1041.method5191(new class145(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1041.method5191(new class148(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1041.method5191(new class144(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1041.method5191(new class142(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1041.method5191(new class141(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1041.method5191(new class143(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field2151.field1041.method5187();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field2151.field1042.method5190();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1042.method5191(new class314(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1042.method5191(new class315(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field2151.field1042.method5187();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field27 != null) {
                Statics.field27.method5190();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1071[--Statics.field601] == 1;
            if (Statics.field27 != null) {
                Statics.field27.method5191(new class314(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1071[--Statics.field601] == 1;
            if (Statics.field27 != null) {
                Statics.field27.method5191(new class315(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1071[--Statics.field601] == 1;
            if (Statics.field27 != null) {
                Statics.field27.method5191(new class146(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1071[--Statics.field601] == 1;
            if (Statics.field27 != null) {
                Statics.field27.method5191(new class140(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1071[--Statics.field601] == 1;
            if (Statics.field27 != null) {
                Statics.field27.method5191(new class145(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1071[--Statics.field601] == 1;
            if (Statics.field27 != null) {
                Statics.field27.method5191(new class148(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1071[--Statics.field601] == 1;
            if (Statics.field27 != null) {
                Statics.field27.method5191(new class144(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1071[--Statics.field601] == 1;
            if (Statics.field27 != null) {
                Statics.field27.method5191(new class142(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1071[--Statics.field601] == 1;
            if (Statics.field27 != null) {
                Statics.field27.method5191(new class141(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1071[--Statics.field601] == 1;
            if (Statics.field27 != null) {
                Statics.field27.method5191(new class143(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field27 != null) {
                Statics.field27.method5187();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1071[--Statics.field601] == 1;
            Statics.field2151.field1041.method5191(new class147(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1071[--Statics.field601] == 1;
            if (Statics.field27 != null) {
                Statics.field27.method5191(new class147(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eh.ac(ILcx;ZB)I")
    public static int method3144(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = client.field896[var3].method42();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = client.field896[var4].field31;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = client.field896[var5].field32;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = client.field896[var6].field34;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = client.field896[var7].field39;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = client.field896[var8].field36;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1071[--Statics.field601];
            int var10 = client.field896[var9].method41();
            field1071[++Statics.field601 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1071[--Statics.field601];
            int var12 = client.field896[var11].method41();
            field1071[++Statics.field601 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1071[--Statics.field601];
            int var14 = client.field896[var13].method41();
            field1071[++Statics.field601 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1071[--Statics.field601];
            int var16 = client.field896[var15].method41();
            field1071[++Statics.field601 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1071[--Statics.field601] == 1;
            if (Statics.field591 != null) {
                Statics.field591.method16(class2.field11, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1071[--Statics.field601] == 1;
            if (Statics.field591 != null) {
                Statics.field591.method16(class2.field4, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field601 -= 2;
            boolean var19 = field1071[Statics.field601] == 1;
            boolean var20 = field1071[Statics.field601 + 1] == 1;
            if (Statics.field591 != null) {
                client.field914.field637 = var20;
                Statics.field591.method16(client.field914, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1071[--Statics.field601] == 1;
            if (Statics.field591 != null) {
                Statics.field591.method16(class2.field5, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1071[--Statics.field601] == 1;
            if (Statics.field591 != null) {
                Statics.field591.method16(class2.field8, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1071[++Statics.field601 - 1] = Statics.field591 == null ? 0 : Statics.field591.field15.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1071[--Statics.field601];
            class3 var24 = (class3) Statics.field591.field15.get(var23);
            field1071[++Statics.field601 - 1] = var24.field18;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1071[--Statics.field601];
            class3 var26 = (class3) Statics.field591.field15.get(var25);
            field1066[++Statics.field1073 - 1] = var26.method19();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1071[--Statics.field601];
            class3 var28 = (class3) Statics.field591.field15.get(var27);
            field1066[++Statics.field1073 - 1] = var28.method20();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1071[--Statics.field601];
            class3 var30 = (class3) Statics.field591.field15.get(var29);
            long var31 = class187.method2664() - Statics.field1512 - var30.field17;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1066[++Statics.field1073 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1071[--Statics.field601];
            class3 var38 = (class3) Statics.field591.field15.get(var37);
            field1071[++Statics.field601 - 1] = var38.field20.field34;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1071[--Statics.field601];
            class3 var40 = (class3) Statics.field591.field15.get(var39);
            field1071[++Statics.field601 - 1] = var40.field20.field32;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1071[--Statics.field601];
            class3 var42 = (class3) Statics.field591.field15.get(var41);
            field1071[++Statics.field601 - 1] = var42.field20.field31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("km.az(ILcx;ZI)I")
    public static int method5319(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field601 -= 2;
            int var3 = field1071[Statics.field601];
            int var4 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field601 -= 2;
            int var5 = field1071[Statics.field601];
            int var6 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field601 -= 2;
            int var7 = field1071[Statics.field601];
            int var8 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field601 -= 2;
            int var9 = field1071[Statics.field601];
            int var10 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field601 -= 5;
            int var13 = field1071[Statics.field601];
            int var14 = field1071[Statics.field601 + 1];
            int var15 = field1071[Statics.field601 + 2];
            int var16 = field1071[Statics.field601 + 3];
            int var17 = field1071[Statics.field601 + 4];
            field1071[++Statics.field601 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field601 -= 2;
            int var18 = field1071[Statics.field601];
            int var19 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field601 -= 2;
            int var20 = field1071[Statics.field601];
            int var21 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field601 -= 2;
            int var22 = field1071[Statics.field601];
            int var23 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field601 -= 2;
            int var24 = field1071[Statics.field601];
            int var25 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field601 -= 2;
            int var26 = field1071[Statics.field601];
            int var27 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field601 -= 2;
            int var28 = field1071[Statics.field601];
            int var29 = field1071[Statics.field601 + 1];
            if (var28 == 0) {
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field601 -= 2;
            int var30 = field1071[Statics.field601];
            int var31 = field1071[Statics.field601 + 1];
            if (var30 == 0) {
                field1071[++Statics.field601 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1071[++Statics.field601 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1071[++Statics.field601 - 1] = var30;
                    break;
                case 2:
                    field1071[++Statics.field601 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1071[++Statics.field601 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1071[++Statics.field601 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1071[++Statics.field601 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field601 -= 2;
            int var32 = field1071[Statics.field601];
            int var33 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field601 -= 2;
            int var34 = field1071[Statics.field601];
            int var35 = field1071[Statics.field601 + 1];
            field1071[++Statics.field601 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field601 -= 3;
            long var36 = (long) field1071[Statics.field601];
            long var38 = (long) field1071[Statics.field601 + 1];
            long var40 = (long) field1071[Statics.field601 + 2];
            field1071[++Statics.field601 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fi.aj(ILcx;ZI)I")
    public static int method3263(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1066[--Statics.field1073];
            int var4 = field1071[--Statics.field601];
            field1066[++Statics.field1073 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1073 -= 2;
            String var5 = field1066[Statics.field1073];
            String var6 = field1066[Statics.field1073 + 1];
            field1066[++Statics.field1073 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1066[--Statics.field1073];
            int var8 = field1071[--Statics.field601];
            field1066[++Statics.field1073 - 1] = var7 + Statics.method557(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1066[--Statics.field1073];
            field1066[++Statics.field1073 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1071[--Statics.field601];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1077.setTime(new Date(var11));
            int var13 = field1077.get(5);
            int var14 = field1077.get(2);
            int var15 = field1077.get(1);
            field1066[++Statics.field1073 - 1] = var13 + "-" + field1072[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1073 -= 2;
            String var16 = field1066[Statics.field1073];
            String var17 = field1066[Statics.field1073 + 1];
            if (Statics.field1064.field631 != null && Statics.field1064.field631.field2638) {
                field1066[++Statics.field1073 - 1] = var17;
            } else {
                field1066[++Statics.field1073 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1071[--Statics.field601];
            field1066[++Statics.field1073 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1073 -= 2;
            field1071[++Statics.field601 - 1] = class308.method3039(class176.method117(field1066[Statics.field1073], field1066[Statics.field1073 + 1], client.field786));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1066[--Statics.field1073];
            Statics.field601 -= 2;
            int var20 = field1071[Statics.field601];
            int var21 = field1071[Statics.field601 + 1];
            byte[] var22 = Statics.field1092.method4438(var21, 0);
            class301 var23 = new class301(var22);
            field1071[++Statics.field601 - 1] = var23.method5346(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1066[--Statics.field1073];
            Statics.field601 -= 2;
            int var25 = field1071[Statics.field601];
            int var26 = field1071[Statics.field601 + 1];
            byte[] var27 = Statics.field1092.method4438(var26, 0);
            class301 var28 = new class301(var27);
            field1071[++Statics.field601 - 1] = var28.method5345(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1073 -= 2;
            String var29 = field1066[Statics.field1073];
            String var30 = field1066[Statics.field1073 + 1];
            if (field1071[--Statics.field601] == 1) {
                field1066[++Statics.field1073 - 1] = var29;
            } else {
                field1066[++Statics.field1073 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1066[--Statics.field1073];
            field1066[++Statics.field1073 - 1] = class302.method5347(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1066[--Statics.field1073];
            int var33 = field1071[--Statics.field601];
            field1066[++Statics.field1073 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = class308.method454((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = class308.method4594((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = class308.method4424((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = class308.method4413((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1066[--Statics.field1073];
            if (var38 == null) {
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1066[--Statics.field1073];
            Statics.field601 -= 2;
            int var40 = field1071[Statics.field601];
            int var41 = field1071[Statics.field601 + 1];
            field1066[++Statics.field1073 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1066[--Statics.field1073];
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
            field1066[++Statics.field1073 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1066[--Statics.field1073];
            int var48 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1073 -= 2;
            String var49 = field1066[Statics.field1073];
            String var50 = field1066[Statics.field1073 + 1];
            int var51 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bf.ag(ILcx;ZI)I")
    public static int method1091(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1071[--Statics.field601];
            field1066[++Statics.field1073 - 1] = class272.method1995(var3).field3516;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field601 -= 2;
            int var4 = field1071[Statics.field601];
            int var5 = field1071[Statics.field601 + 1];
            class272 var6 = class272.method1995(var4);
            if (var5 < 1 || var5 > 5 || var6.field3527[var5 - 1] == null) {
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1066[++Statics.field1073 - 1] = var6.field3527[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field601 -= 2;
            int var7 = field1071[Statics.field601];
            int var8 = field1071[Statics.field601 + 1];
            class272 var9 = class272.method1995(var7);
            if (var8 < 1 || var8 > 5 || var9.field3542[var8 - 1] == null) {
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1066[++Statics.field1073 - 1] = var9.field3542[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = class272.method1995(var10).field3545;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = class272.method1995(var11).field3524 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1071[--Statics.field601];
            class272 var13 = class272.method1995(var12);
            if (var13.field3553 == -1 && var13.field3550 >= 0) {
                field1071[++Statics.field601 - 1] = var13.field3550;
            } else {
                field1071[++Statics.field601 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1071[--Statics.field601];
            class272 var15 = class272.method1995(var14);
            if (var15.field3553 >= 0 && var15.field3550 >= 0) {
                field1071[++Statics.field601 - 1] = var15.field3550;
            } else {
                field1071[++Statics.field601 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = class272.method1995(var16).field3513 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1071[--Statics.field601];
            class272 var18 = class272.method1995(var17);
            if (var18.field3511 == -1 && var18.field3556 >= 0) {
                field1071[++Statics.field601 - 1] = var18.field3556;
            } else {
                field1071[++Statics.field601 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1071[--Statics.field601];
            class272 var20 = class272.method1995(var19);
            if (var20.field3511 >= 0 && var20.field3556 >= 0) {
                field1071[++Statics.field601 - 1] = var20.field3556;
            } else {
                field1071[++Statics.field601 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1066[--Statics.field1073];
            int var22 = field1071[--Statics.field601];
            client.method938(var21, var22 == 1);
            field1071[++Statics.field601 - 1] = Statics.field1984;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field326 == null || Statics.field70 >= Statics.field1984) {
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = Statics.field326[++Statics.field70 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field70 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ia.ab(ILcx;ZI)I")
    public static int method4665(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1071[++Statics.field601 - 1] = client.field731;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field601 -= 3;
            client.field731 = field1071[Statics.field601];
            Statics.field3614 = class310.method981(field1071[Statics.field601 + 1]);
            if (Statics.field3614 == null) {
                Statics.field3614 = class310.field3806;
            }
            client.field862 = field1071[Statics.field601 + 2];
            class175 var3 = class175.method3035(class172.field2254, client.field691.field1283);
            var3.field2333.method3501(client.field731);
            var3.field2333.method3501(Statics.field3614.field3808);
            var3.field2333.method3501(client.field862);
            client.field691.method2060(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1066[--Statics.field1073];
            Statics.field601 -= 2;
            int var5 = field1071[Statics.field601];
            int var6 = field1071[Statics.field601 + 1];
            class175 var7 = class175.method3035(class172.field2246, client.field691.field1283);
            var7.field2333.method3501(class185.method2245(var4) + 2);
            var7.field2333.method3585(var4);
            var7.field2333.method3501(var5 - 1);
            var7.field2333.method3501(var6);
            client.field691.method2060(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field601 -= 2;
            int var8 = field1071[Statics.field601];
            int var9 = field1071[Statics.field601 + 1];
            class60 var10 = class86.method910(var8, var9);
            if (var10 == null) {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = 0;
                field1066[++Statics.field1073 - 1] = "";
                field1066[++Statics.field1073 - 1] = "";
                field1066[++Statics.field1073 - 1] = "";
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = var10.field596;
                field1071[++Statics.field601 - 1] = var10.field590;
                field1066[++Statics.field1073 - 1] = var10.field592 == null ? "" : var10.field592;
                field1066[++Statics.field1073 - 1] = var10.field597 == null ? "" : var10.field597;
                field1066[++Statics.field1073 - 1] = var10.field589 == null ? "" : var10.field589;
                field1071[++Statics.field601 - 1] = var10.method1057() ? 1 : (var10.method1054() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1071[--Statics.field601];
            class60 var12 = class86.method120(var11);
            if (var12 == null) {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = 0;
                field1066[++Statics.field1073 - 1] = "";
                field1066[++Statics.field1073 - 1] = "";
                field1066[++Statics.field1073 - 1] = "";
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = var12.field598;
                field1071[++Statics.field601 - 1] = var12.field590;
                field1066[++Statics.field1073 - 1] = var12.field592 == null ? "" : var12.field592;
                field1066[++Statics.field1073 - 1] = var12.field597 == null ? "" : var12.field597;
                field1066[++Statics.field1073 - 1] = var12.field589 == null ? "" : var12.field589;
                field1071[++Statics.field601 - 1] = var12.method1057() ? 1 : (var12.method1054() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field3614 == null) {
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = Statics.field3614.field3808;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1066[--Statics.field1073];
            int var14 = field1071[--Statics.field601];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class240.field3061)) {
                var16 = 0;
                var13 = var13.substring(class240.field3061.length());
            } else if (var15.startsWith(class240.field3037)) {
                var16 = 1;
                var13 = var13.substring(class240.field3037.length());
            } else if (var15.startsWith(class240.field3039)) {
                var16 = 2;
                var13 = var13.substring(class240.field3039.length());
            } else if (var15.startsWith(class240.field3041)) {
                var16 = 3;
                var13 = var13.substring(class240.field3041.length());
            } else if (var15.startsWith(class240.field3043)) {
                var16 = 4;
                var13 = var13.substring(class240.field3043.length());
            } else if (var15.startsWith(class240.field3045)) {
                var16 = 5;
                var13 = var13.substring(class240.field3045.length());
            } else if (var15.startsWith(class240.field3047)) {
                var16 = 6;
                var13 = var13.substring(class240.field3047.length());
            } else if (var15.startsWith(class240.field3049)) {
                var16 = 7;
                var13 = var13.substring(class240.field3049.length());
            } else if (var15.startsWith(class240.field2927)) {
                var16 = 8;
                var13 = var13.substring(class240.field2927.length());
            } else if (var15.startsWith(class240.field2901)) {
                var16 = 9;
                var13 = var13.substring(class240.field2901.length());
            } else if (var15.startsWith(class240.field3055)) {
                var16 = 10;
                var13 = var13.substring(class240.field3055.length());
            } else if (var15.startsWith(class240.field3087)) {
                var16 = 11;
                var13 = var13.substring(class240.field3087.length());
            } else if (client.field786 != 0) {
                if (var15.startsWith(class240.field3036)) {
                    var16 = 0;
                    var13 = var13.substring(class240.field3036.length());
                } else if (var15.startsWith(class240.field3014)) {
                    var16 = 1;
                    var13 = var13.substring(class240.field3014.length());
                } else if (var15.startsWith(class240.field3040)) {
                    var16 = 2;
                    var13 = var13.substring(class240.field3040.length());
                } else if (var15.startsWith(class240.field3042)) {
                    var16 = 3;
                    var13 = var13.substring(class240.field3042.length());
                } else if (var15.startsWith(class240.field3044)) {
                    var16 = 4;
                    var13 = var13.substring(class240.field3044.length());
                } else if (var15.startsWith(class240.field3046)) {
                    var16 = 5;
                    var13 = var13.substring(class240.field3046.length());
                } else if (var15.startsWith(class240.field3048)) {
                    var16 = 6;
                    var13 = var13.substring(class240.field3048.length());
                } else if (var15.startsWith(class240.field3050)) {
                    var16 = 7;
                    var13 = var13.substring(class240.field3050.length());
                } else if (var15.startsWith(class240.field3052)) {
                    var16 = 8;
                    var13 = var13.substring(class240.field3052.length());
                } else if (var15.startsWith(class240.field3054)) {
                    var16 = 9;
                    var13 = var13.substring(class240.field3054.length());
                } else if (var15.startsWith(class240.field3056)) {
                    var16 = 10;
                    var13 = var13.substring(class240.field3056.length());
                } else if (var15.startsWith(class240.field2969)) {
                    var16 = 11;
                    var13 = var13.substring(class240.field2969.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class240.field2925)) {
                var18 = 1;
                var13 = var13.substring(class240.field2925.length());
            } else if (var17.startsWith(class240.field2921)) {
                var18 = 2;
                var13 = var13.substring(class240.field2921.length());
            } else if (var17.startsWith(class240.field3057)) {
                var18 = 3;
                var13 = var13.substring(class240.field3057.length());
            } else if (var17.startsWith(class240.field3065)) {
                var18 = 4;
                var13 = var13.substring(class240.field3065.length());
            } else if (var17.startsWith(class240.field3090)) {
                var18 = 5;
                var13 = var13.substring(class240.field3090.length());
            } else if (client.field786 != 0) {
                if (var17.startsWith(class240.field3060)) {
                    var18 = 1;
                    var13 = var13.substring(class240.field3060.length());
                } else if (var17.startsWith(class240.field3051)) {
                    var18 = 2;
                    var13 = var13.substring(class240.field3051.length());
                } else if (var17.startsWith(class240.field2980)) {
                    var18 = 3;
                    var13 = var13.substring(class240.field2980.length());
                } else if (var17.startsWith(class240.field3011)) {
                    var18 = 4;
                    var13 = var13.substring(class240.field3011.length());
                } else if (var17.startsWith(class240.field2997)) {
                    var18 = 5;
                    var13 = var13.substring(class240.field2997.length());
                }
            }
            class175 var19 = class175.method3035(class172.field2231, client.field691.field1283);
            var19.field2333.method3501(0);
            int var20 = var19.field2333.field2406;
            var19.field2333.method3501(var14);
            var19.field2333.method3501(var16);
            var19.field2333.method3501(var18);
            class303.method3142(var19.field2333, var13);
            var19.field2333.method3462(var19.field2333.field2406 - var20);
            client.field691.method2060(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1073 -= 2;
            String var21 = field1066[Statics.field1073];
            String var22 = field1066[Statics.field1073 + 1];
            class175 var23 = class175.method3035(class172.field2233, client.field691.field1283);
            var23.field2333.method3450(0);
            int var24 = var23.field2333.field2406;
            var23.field2333.method3585(var21);
            class303.method3142(var23.field2333, var22);
            var23.field2333.method3461(var23.field2333.field2406 - var24);
            client.field691.method2060(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field1064 == null || Statics.field1064.field626 == null) {
                var25 = "";
            } else {
                var25 = Statics.field1064.field626.method5269();
            }
            field1066[++Statics.field1073 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1071[++Statics.field601 - 1] = client.field862;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = class86.method2018(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = class86.method547(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = class86.method1046(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1066[--Statics.field1073];
            client.method682(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field863 = field1066[--Statics.field1073].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1066[++Statics.field1073 - 1] = client.field863;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.ar(ILcx;ZI)I")
    public static int method300(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1071[++Statics.field601 - 1] = client.method212();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1071[--Statics.field601];
            if (var3 == 1 || var3 == 2) {
                client.method475(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1071[++Statics.field601 - 1] = Statics.field436.field1032;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1071[--Statics.field601];
            if (var4 == 1 || var4 == 2) {
                Statics.field436.field1032 = var4;
                class68.method1123();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ep.at(ILcx;ZI)I")
    public static int method3157(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field601 -= 2;
            int var3 = field1071[Statics.field601];
            int var4 = field1071[Statics.field601 + 1];
            if (!client.field890) {
                client.field713 = var3;
                client.field659 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1071[++Statics.field601 - 1] = client.field713;
            return 1;
        } else if (arg0 == 5506) {
            field1071[++Statics.field601 - 1] = client.field659;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1071[--Statics.field601];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field720 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1071[++Statics.field601 - 1] = client.field720;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("km.aa(II)I")
    public static int method5320(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("id.ai(IB)I")
    public static int method4576(int arg0) {
        return (int) ((Math.log((double) arg0) / field1082 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("jx.ad(ILcx;ZI)I")
    public static int method4695(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field601 -= 2;
            client.field650 = (short) method5320(field1071[Statics.field601]);
            if (client.field650 <= 0) {
                client.field650 = 256;
            }
            client.field897 = (short) method5320(field1071[Statics.field601 + 1]);
            if (client.field897 <= 0) {
                client.field897 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field601 -= 2;
            client.field898 = (short) field1071[Statics.field601];
            if (client.field898 <= 0) {
                client.field898 = 256;
            }
            client.field899 = (short) field1071[Statics.field601 + 1];
            if (client.field899 <= 0) {
                client.field899 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field601 -= 4;
            client.field900 = (short) field1071[Statics.field601];
            if (client.field900 <= 0) {
                client.field900 = 1;
            }
            client.field685 = (short) field1071[Statics.field601 + 1];
            if (client.field685 <= 0) {
                client.field685 = 32767;
            } else if (client.field685 < client.field900) {
                client.field685 = client.field900;
            }
            client.field902 = (short) field1071[Statics.field601 + 2];
            if (client.field902 <= 0) {
                client.field902 = 1;
            }
            client.field755 = (short) field1071[Statics.field601 + 3];
            if (client.field755 <= 0) {
                client.field755 = 32767;
            } else if (client.field755 < client.field902) {
                client.field755 = client.field902;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field816 == null) {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = -1;
            } else {
                client.method37(0, 0, client.field816.field2683, client.field816.field2684, false);
                field1071[++Statics.field601 - 1] = client.field645;
                field1071[++Statics.field601 - 1] = client.field765;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1071[++Statics.field601 - 1] = client.field898;
            field1071[++Statics.field601 - 1] = client.field899;
            return 1;
        } else if (arg0 == 6205) {
            field1071[++Statics.field601 - 1] = method4576(client.field650);
            field1071[++Statics.field601 - 1] = method4576(client.field897);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fh.al(ILcx;ZI)I")
    public static int method3251(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1071[++Statics.field601 - 1] = class67.method122() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class67 var3 = class67.method3();
            if (var3 == null) {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = 0;
                field1066[++Statics.field1073 - 1] = "";
                field1071[++Statics.field601 - 1] = 0;
                field1071[++Statics.field601 - 1] = 0;
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1071[++Statics.field601 - 1] = var3.field1016;
                field1071[++Statics.field601 - 1] = var3.field1009;
                field1066[++Statics.field1073 - 1] = var3.field1023;
                field1071[++Statics.field601 - 1] = var3.field1022;
                field1071[++Statics.field601 - 1] = var3.field1021;
                field1066[++Statics.field1073 - 1] = var3.field1020;
            }
            return 1;
        } else if (arg0 == 6502) {
            class67 var4 = class67.method209();
            if (var4 == null) {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = 0;
                field1066[++Statics.field1073 - 1] = "";
                field1071[++Statics.field601 - 1] = 0;
                field1071[++Statics.field601 - 1] = 0;
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1071[++Statics.field601 - 1] = var4.field1016;
                field1071[++Statics.field601 - 1] = var4.field1009;
                field1066[++Statics.field1073 - 1] = var4.field1023;
                field1071[++Statics.field601 - 1] = var4.field1022;
                field1071[++Statics.field601 - 1] = var4.field1021;
                field1066[++Statics.field1073 - 1] = var4.field1020;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1071[--Statics.field601];
            class67 var6 = null;
            for (int var7 = 0; var7 < class67.field1014; var7++) {
                if (Statics.field1018[var7].field1016 == var5) {
                    var6 = Statics.field1018[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = 0;
                field1066[++Statics.field1073 - 1] = "";
                field1071[++Statics.field601 - 1] = 0;
                field1071[++Statics.field601 - 1] = 0;
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1071[++Statics.field601 - 1] = var6.field1016;
                field1071[++Statics.field601 - 1] = var6.field1009;
                field1066[++Statics.field1073 - 1] = var6.field1023;
                field1071[++Statics.field601 - 1] = var6.field1022;
                field1071[++Statics.field601 - 1] = var6.field1021;
                field1066[++Statics.field1073 - 1] = var6.field1020;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field601 -= 4;
            int var8 = field1071[Statics.field601];
            boolean var9 = field1071[Statics.field601 + 1] == 1;
            int var10 = field1071[Statics.field601 + 2];
            boolean var11 = field1071[Statics.field601 + 3] == 1;
            class67.method1038(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1071[--Statics.field601];
            if (var12 >= 0 && var12 < class67.field1014) {
                class67 var13 = Statics.field1018[var12];
                field1071[++Statics.field601 - 1] = var13.field1016;
                field1071[++Statics.field601 - 1] = var13.field1009;
                field1066[++Statics.field1073 - 1] = var13.field1023;
                field1071[++Statics.field601 - 1] = var13.field1022;
                field1071[++Statics.field601 - 1] = var13.field1021;
                field1066[++Statics.field1073 - 1] = var13.field1020;
            } else {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = 0;
                field1066[++Statics.field1073 - 1] = "";
                field1071[++Statics.field601 - 1] = 0;
                field1071[++Statics.field601 - 1] = 0;
                field1066[++Statics.field1073 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field789 = field1071[--Statics.field601] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field601 -= 2;
            int var14 = field1071[Statics.field601];
            int var15 = field1071[Statics.field601 + 1];
            class267 var16 = class267.method460(var15);
            if (var16.method4772()) {
                field1066[++Statics.field1073 - 1] = class274.method4430(var14).method4986(var15, var16.field3406);
            } else {
                field1071[++Statics.field601 - 1] = class274.method4430(var14).method4985(var15, var16.field3403);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field601 -= 2;
            int var17 = field1071[Statics.field601];
            int var18 = field1071[Statics.field601 + 1];
            class267 var19 = class267.method460(var18);
            if (var19.method4772()) {
                field1066[++Statics.field1073 - 1] = class271.method4591(var17).method4873(var18, var19.field3406);
            } else {
                field1071[++Statics.field601 - 1] = class271.method4591(var17).method4872(var18, var19.field3403);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field601 -= 2;
            int var20 = field1071[Statics.field601];
            int var21 = field1071[Statics.field601 + 1];
            class267 var22 = class267.method460(var21);
            if (var22.method4772()) {
                field1066[++Statics.field1073 - 1] = class272.method1995(var20).method4927(var21, var22.field3406);
            } else {
                field1071[++Statics.field601 - 1] = class272.method1995(var20).method4952(var21, var22.field3403);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field601 -= 2;
            int var23 = field1071[Statics.field601];
            int var24 = field1071[Statics.field601 + 1];
            class267 var25 = class267.method460(var24);
            if (var25.method4772()) {
                field1066[++Statics.field1073 - 1] = class268.method3075(var23).method4792(var24, var25.field3406);
            } else {
                field1071[++Statics.field601 - 1] = class268.method3075(var23).method4787(var24, var25.field3403);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1071[++Statics.field601 - 1] = client.field771 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1071[++Statics.field601 - 1] = client.field652 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1073--;
            Statics.field601--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1073--;
            Statics.field601--;
            return 1;
        } else if (arg0 == 6524) {
            field1071[++Statics.field601 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1071[++Statics.field601 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1071[++Statics.field601 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("w.ak(ILcx;ZI)I")
    public static int method96(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field600;
            int var4 = (Statics.field1064.field954 >> 7) + Statics.field491;
            int var5 = (Statics.field1064.field1000 >> 7) + Statics.field92;
            client.method89().method5850(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1071[--Statics.field601];
            String var7 = "";
            class21 var8 = client.method89().method5868(var6);
            if (var8 != null) {
                var7 = var8.method248();
            }
            field1066[++Statics.field1073 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1071[--Statics.field601];
            client.method89().method5851(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1071[++Statics.field601 - 1] = client.method89().method5910();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1071[--Statics.field601];
            client.method89().method5845(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1071[++Statics.field601 - 1] = client.method89().method5847() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class229 var11 = new class229(field1071[--Statics.field601]);
            client.method89().method6007(var11.field2633, var11.field2634);
            return 1;
        } else if (arg0 == 6607) {
            class229 var12 = new class229(field1071[--Statics.field601]);
            client.method89().method5958(var12.field2633, var12.field2634);
            return 1;
        } else if (arg0 == 6608) {
            class229 var13 = new class229(field1071[--Statics.field601]);
            client.method89().method5871(var13.field2635, var13.field2633, var13.field2634);
            return 1;
        } else if (arg0 == 6609) {
            class229 var14 = new class229(field1071[--Statics.field601]);
            client.method89().method5872(var14.field2635, var14.field2633, var14.field2634);
            return 1;
        } else if (arg0 == 6610) {
            field1071[++Statics.field601 - 1] = client.method89().method5888();
            field1071[++Statics.field601 - 1] = client.method89().method5874();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1071[--Statics.field601];
            class21 var16 = client.method89().method5868(var15);
            if (var16 == null) {
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = var16.method247().method4277();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1071[--Statics.field601];
            class21 var18 = client.method89().method5868(var17);
            if (var18 == null) {
                field1071[++Statics.field601 - 1] = 0;
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = (var18.method241() - var18.method261() + 1) * 64;
                field1071[++Statics.field601 - 1] = (var18.method252() - var18.method232() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1071[--Statics.field601];
            class21 var20 = client.method89().method5868(var19);
            if (var20 == null) {
                field1071[++Statics.field601 - 1] = 0;
                field1071[++Statics.field601 - 1] = 0;
                field1071[++Statics.field601 - 1] = 0;
                field1071[++Statics.field601 - 1] = 0;
            } else {
                field1071[++Statics.field601 - 1] = var20.method261() * 64;
                field1071[++Statics.field601 - 1] = var20.method232() * 64;
                field1071[++Statics.field601 - 1] = var20.method241() * 64 + 64 - 1;
                field1071[++Statics.field601 - 1] = var20.method252() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1071[--Statics.field601];
            class21 var22 = client.method89().method5868(var21);
            if (var22 == null) {
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = var22.method239();
            }
            return 1;
        } else if (arg0 == 6615) {
            class229 var23 = client.method89().method5875();
            if (var23 == null) {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = var23.field2633;
                field1071[++Statics.field601 - 1] = var23.field2634;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1071[++Statics.field601 - 1] = client.method89().method5857();
            return 1;
        } else if (arg0 == 6617) {
            class229 var24 = new class229(field1071[--Statics.field601]);
            class21 var25 = client.method89().method5853();
            if (var25 == null) {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method231(var24.field2635, var24.field2633, var24.field2634);
            if (var26 == null) {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = var26[0];
                field1071[++Statics.field601 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class229 var27 = new class229(field1071[--Statics.field601]);
            class21 var28 = client.method89().method5853();
            if (var28 == null) {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = -1;
                return 1;
            }
            class229 var29 = var28.method260(var27.field2633, var27.field2634);
            if (var29 == null) {
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = var29.method4277();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field601 -= 2;
            int var30 = field1071[Statics.field601];
            class229 var31 = new class229(field1071[Statics.field601 + 1]);
            method1028(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field601 -= 2;
            int var32 = field1071[Statics.field601];
            class229 var33 = new class229(field1071[Statics.field601 + 1]);
            method1028(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field601 -= 2;
            int var34 = field1071[Statics.field601];
            class229 var35 = new class229(field1071[Statics.field601 + 1]);
            class21 var36 = client.method89().method5868(var34);
            if (var36 == null) {
                field1071[++Statics.field601 - 1] = 0;
                return 1;
            } else {
                field1071[++Statics.field601 - 1] = var36.method229(var35.field2635, var35.field2633, var35.field2634) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1071[++Statics.field601 - 1] = client.method89().method5876();
            field1071[++Statics.field601 - 1] = client.method89().method5877();
            return 1;
        } else if (arg0 == 6623) {
            class229 var37 = new class229(field1071[--Statics.field601]);
            class21 var38 = client.method89().method5849(var37.field2635, var37.field2633, var37.field2634);
            if (var38 == null) {
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = var38.method234();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method89().method5878(field1071[--Statics.field601]);
            return 1;
        } else if (arg0 == 6625) {
            client.method89().method5879();
            return 1;
        } else if (arg0 == 6626) {
            client.method89().method5880(field1071[--Statics.field601]);
            return 1;
        } else if (arg0 == 6627) {
            client.method89().method5881();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1071[--Statics.field601] == 1;
            client.method89().method5935(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1071[--Statics.field601];
            client.method89().method5896(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1071[--Statics.field601];
            client.method89().method5884(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method89().method5885();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1071[--Statics.field601] == 1;
            client.method89().method6013(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field601 -= 2;
            int var43 = field1071[Statics.field601];
            boolean var44 = field1071[Statics.field601 + 1] == 1;
            client.method89().method5844(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field601 -= 2;
            int var45 = field1071[Statics.field601];
            boolean var46 = field1071[Statics.field601 + 1] == 1;
            client.method89().method5841(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1071[++Statics.field601 - 1] = client.method89().method5889() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = client.method89().method5891(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1071[--Statics.field601];
            field1071[++Statics.field601 - 1] = client.method89().method5893(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field601 -= 2;
            int var49 = field1071[Statics.field601];
            class229 var50 = new class229(field1071[Statics.field601 + 1]);
            class229 var51 = client.method89().method5894(var49, var50);
            if (var51 == null) {
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = var51.method4277();
            }
            return 1;
        } else if (arg0 == 6639) {
            class29 var52 = client.method89().method6027();
            if (var52 == null) {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = var52.field286;
                field1071[++Statics.field601 - 1] = var52.field278.method4277();
            }
            return 1;
        } else if (arg0 == 6640) {
            class29 var53 = client.method89().method5897();
            if (var53 == null) {
                field1071[++Statics.field601 - 1] = -1;
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = var53.field286;
                field1071[++Statics.field601 - 1] = var53.field278.method4277();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1071[--Statics.field601];
            class258 var55 = class258.method3265(var54);
            if (var55.field3317 == null) {
                field1066[++Statics.field1073 - 1] = "";
            } else {
                field1066[++Statics.field1073 - 1] = var55.field3317;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1071[--Statics.field601];
            class258 var57 = class258.method3265(var56);
            field1071[++Statics.field601 - 1] = var57.field3319;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1071[--Statics.field601];
            class258 var59 = class258.method3265(var58);
            if (var59 == null) {
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = var59.field3318;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1071[--Statics.field601];
            class258 var61 = class258.method3265(var60);
            if (var61 == null) {
                field1071[++Statics.field601 - 1] = -1;
            } else {
                field1071[++Statics.field601 - 1] = var61.field3316;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1071[++Statics.field601 - 1] = Statics.field1986.field344;
            return 1;
        } else if (arg0 == 6698) {
            field1071[++Statics.field601 - 1] = Statics.field1986.field345.method4277();
            return 1;
        } else if (arg0 == 6699) {
            field1071[++Statics.field601 - 1] = Statics.field1986.field346.method4277();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("o.ao(II)V")
    public static void method461(int arg0) {
        if (arg0 == -1 || !class233.method3715(arg0)) {
            return;
        }
        class233[] var1 = Statics.field1952[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3.field2755 != null) {
                class58 var4 = new class58();
                var4.field571 = var3;
                var4.field576 = var3.field2755;
                method1553(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("bi.am(ILhz;ZB)V")
    public static void method1028(int arg0, class229 arg1, boolean arg2) {
        class21 var3 = client.method89().method5868(arg0);
        int var4 = Statics.field1064.field621;
        int var5 = (Statics.field1064.field954 >> 7) + Statics.field491;
        int var6 = (Statics.field1064.field1000 >> 7) + Statics.field92;
        class229 var7 = new class229(var4, var5, var6);
        client.method89().method5856(var3, var7, arg1, arg2);
    }
}
