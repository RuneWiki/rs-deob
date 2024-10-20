package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bx")
public class class77 {

    @ObfuscatedName("bx.l")
    public static int[] field1070 = new int[5];

    @ObfuscatedName("bx.u")
    public static int[][] field1057 = new int[5][5000];

    @ObfuscatedName("bx.j")
    public static int[] field1062 = new int[1000];

    @ObfuscatedName("bx.d")
    public static String[] field1063 = new String[1000];

    @ObfuscatedName("bx.n")
    public static int field1064 = 0;

    @ObfuscatedName("bx.h")
    public static class57[] field1061 = new class57[50];

    @ObfuscatedName("bx.p")
    public static Calendar field1066 = Calendar.getInstance();

    @ObfuscatedName("bx.e")
    public static final String[] field1065 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bx.q")
    public static boolean field1068 = false;

    @ObfuscatedName("bx.y")
    public static boolean field1069 = false;

    @ObfuscatedName("bx.r")
    public static int field1067 = 0;

    @ObfuscatedName("bx.o")
    public static final double field1071 = Math.log(2.0D);

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.c(Lbs;I)V")
    public static void method1954(class63 arg0) {
        method891(arg0, 500000);
    }

    @ObfuscatedName("bn.x(Lbs;II)V")
    public static void method891(class63 arg0, int arg1) {
        Object[] var2 = arg0.field549;
        class93 var4;
        if (class294.method3632(arg0.field546)) {
            Statics.field272 = (class42) var2[0];
            class242 var3 = class242.method481(Statics.field272.field342);
            var4 = class93.method3712(arg0.field546, var3.field3198, var3.field3188);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class93.method918(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field1972 = 0;
        Statics.field1505 = 0;
        int var6 = -1;
        int[] var7 = var4.field1252;
        int[] var8 = var4.field1254;
        byte var9 = -1;
        field1064 = 0;
        field1068 = false;
        try {
            Statics.field1059 = new int[var4.field1253];
            int var10 = 0;
            Statics.field95 = new String[var4.field1256];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field544;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field545;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field550 == null ? -1 : arg0.field550.field2571;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field541;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field550 == null ? -1 : arg0.field550.field2540;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field547 == null ? -1 : arg0.field547.field2571;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field547 == null ? -1 : arg0.field547.field2540;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field554;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field542;
                    }
                    Statics.field1059[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field548;
                    }
                    Statics.field95[var11++] = var14;
                }
            }
            int var15 = 0;
            field1067 = arg0.field551;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1254[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method565(var53, var4, var43);
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
                    field1062[++Statics.field1972 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1062[++Statics.field1972 - 1] = class213.field2494[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class213.field2494[var17] = field1062[--Statics.field1972];
                    Statics.method1974(var17);
                } else if (var53 == 3) {
                    field1063[++Statics.field1505 - 1] = var4.field1255[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field1972 -= 2;
                    if (field1062[Statics.field1972] != field1062[Statics.field1972 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field1972 -= 2;
                    if (field1062[Statics.field1972] == field1062[Statics.field1972 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field1972 -= 2;
                    if (field1062[Statics.field1972] < field1062[Statics.field1972 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field1972 -= 2;
                    if (field1062[Statics.field1972] > field1062[Statics.field1972 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1064 == 0) {
                        return;
                    }
                    class57 var18 = field1061[--field1064];
                    var4 = var18.field498;
                    var7 = var4.field1252;
                    var8 = var4.field1254;
                    var6 = var18.field492;
                    Statics.field1059 = var18.field493;
                    Statics.field95 = var18.field494;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1062[++Statics.field1972 - 1] = class213.method504(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class213.method593(var20, field1062[--Statics.field1972]);
                } else if (var53 == 31) {
                    Statics.field1972 -= 2;
                    if (field1062[Statics.field1972] <= field1062[Statics.field1972 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field1972 -= 2;
                    if (field1062[Statics.field1972] >= field1062[Statics.field1972 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1062[++Statics.field1972 - 1] = Statics.field1059[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field1059[var8[var6]] = field1062[--Statics.field1972];
                } else if (var53 == 35) {
                    field1063[++Statics.field1505 - 1] = Statics.field95[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field95[var8[var6]] = field1063[--Statics.field1505];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field1505 -= var21;
                    String var22 = class291.method459(field1063, Statics.field1505, var21);
                    field1063[++Statics.field1505 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field1972--;
                } else if (var53 == 39) {
                    Statics.field1505--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class93 var24 = class93.method918(var23);
                    int[] var25 = new int[var24.field1253];
                    String[] var26 = new String[var24.field1256];
                    for (int var27 = 0; var27 < var24.field1258; var27++) {
                        var25[var27] = field1062[Statics.field1972 - var24.field1258 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1259; var28++) {
                        var26[var28] = field1063[Statics.field1505 - var24.field1259 + var28];
                    }
                    Statics.field1972 -= var24.field1258;
                    Statics.field1505 -= var24.field1259;
                    class57 var29 = new class57();
                    var29.field498 = var4;
                    var29.field492 = var6;
                    var29.field493 = Statics.field1059;
                    var29.field494 = Statics.field95;
                    field1061[++field1064 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1252;
                    var8 = var24.field1254;
                    var6 = -1;
                    Statics.field1059 = var25;
                    Statics.field95 = var26;
                } else if (var53 == 42) {
                    field1062[++Statics.field1972 - 1] = Statics.field1847.method2014(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field1847.method2012(var8[var6], field1062[--Statics.field1972]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1062[--Statics.field1972];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1070[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1057[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1062[--Statics.field1972];
                    if (var36 < 0 || var36 >= field1070[var35]) {
                        throw new RuntimeException();
                    }
                    field1062[++Statics.field1972 - 1] = field1057[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field1972 -= 2;
                    int var38 = field1062[Statics.field1972];
                    if (var38 < 0 || var38 >= field1070[var37]) {
                        throw new RuntimeException();
                    }
                    field1057[var37][var38] = field1062[Statics.field1972 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field1847.method1991(var8[var6]);
                    if (var39 == null) {
                        var39 = class225.field2900;
                    }
                    field1063[++Statics.field1505 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field1847.method1981(var8[var6], field1063[--Statics.field1505]);
                } else if (var53 == 49) {
                    String var40 = Statics.field1847.method1980(var8[var6]);
                    field1063[++Statics.field1505 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field1847.method1979(var8[var6], field1063[--Statics.field1505]);
                } else if (var53 == 60) {
                    class316 var41 = var4.field1260[var8[var6]];
                    class180 var42 = (class180) var41.method5493((long) field1062[--Statics.field1972]);
                    if (var42 != null) {
                        var6 += var42.field2093;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2096).append(" ");
            for (int var47 = field1064 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1061[var47].field498.field2096).append(" ");
            }
            var46.append("").append(var9);
            class341.method3361(var46.toString(), var51);
        } finally {
            if (field1068) {
                field1069 = true;
                client.method59();
                field1069 = false;
                field1068 = false;
            }
        }
    }

    @ObfuscatedName("af.t(ILcu;ZB)I")
    public static int method565(int arg0, class93 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method1943(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method537(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method563(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method152(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method595(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method3713(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method232(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method3015(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method3688(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method488(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method970(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method537(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method563(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method152(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method595(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method3713(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3013(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return Statics.method148(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method3811(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return Statics.method735(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method970(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method2045(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return Statics.method4094(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method3803(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method683(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method592(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method3238(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method1873(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method703(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3396(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method3789(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method1631(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method4466(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method1866(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method2317(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method89(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method1753(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cm.g(ILcu;ZI)I")
    public static int method1943(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1972 -= 3;
            int var3 = field1062[Statics.field1972];
            int var4 = field1062[Statics.field1972 + 1];
            int var5 = field1062[Statics.field1972 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class218 var6 = class218.method1101(var3);
            if (var6.field2549 == null) {
                var6.field2549 = new class218[var5 + 1];
            }
            if (var6.field2549.length <= var5) {
                class218[] var7 = new class218[var5 + 1];
                for (int var8 = 0; var8 < var6.field2549.length; var8++) {
                    var7[var8] = var6.field2549[var8];
                }
                var6.field2549 = var7;
            }
            if (var5 > 0 && var6.field2549[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class218 var9 = new class218();
            var9.field2541 = var4;
            var9.field2594 = var9.field2571 = var6.field2571;
            var9.field2540 = var5;
            var9.field2538 = true;
            var6.field2549[var5] = var9;
            if (arg2) {
                Statics.field1942 = var9;
            } else {
                Statics.field2411 = var9;
            }
            client.method469(var6);
            return 1;
        } else if (arg0 == 101) {
            class218 var10 = arg2 ? Statics.field1942 : Statics.field2411;
            class218 var11 = class218.method1101(var10.field2571);
            var11.field2549[var10.field2540] = null;
            client.method469(var11);
            return 1;
        } else if (arg0 == 102) {
            class218 var12 = class218.method1101(field1062[--Statics.field1972]);
            var12.field2549 = null;
            client.method469(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1972 -= 2;
            int var13 = field1062[Statics.field1972];
            int var14 = field1062[Statics.field1972 + 1];
            class218 var15 = class218.method701(var13, var14);
            if (var15 == null || var14 == -1) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = 1;
                if (arg2) {
                    Statics.field1942 = var15;
                } else {
                    Statics.field2411 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class218 var16 = class218.method1101(field1062[--Statics.field1972]);
            if (var16 == null) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = 1;
                if (arg2) {
                    Statics.field1942 = var16;
                } else {
                    Statics.field2411 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aj.l(ILcu;ZB)I")
    public static int method537(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1062[--Statics.field1972];
            var4 = class218.method1101(var3);
        } else {
            var4 = arg2 ? Statics.field1942 : Statics.field2411;
        }
        if (arg0 == 1000) {
            Statics.field1972 -= 4;
            var4.field2548 = field1062[Statics.field1972];
            var4.field2547 = field1062[Statics.field1972 + 1];
            var4.field2575 = field1062[Statics.field1972 + 2];
            var4.field2556 = field1062[Statics.field1972 + 3];
            client.method469(var4);
            Statics.field2505.method1136(var4);
            if (var3 != -1 && var4.field2541 == 0) {
                client.method3414(Statics.field3631[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1972 -= 4;
            var4.field2550 = field1062[Statics.field1972];
            var4.field2551 = field1062[Statics.field1972 + 1];
            var4.field2555 = field1062[Statics.field1972 + 2];
            var4.field2573 = field1062[Statics.field1972 + 3];
            client.method469(var4);
            Statics.field2505.method1136(var4);
            if (var3 != -1 && var4.field2541 == 0) {
                client.method3414(Statics.field3631[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1062[--Statics.field1972] == 1;
            if (var4.field2559 != var5) {
                var4.field2559 = var5;
                client.method469(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2606 = field1062[--Statics.field1972] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2585 = field1062[--Statics.field1972] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("af.u(ILcu;ZS)I")
    public static int method563(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1062[--Statics.field1972];
            var4 = class218.method1101(var3);
        } else {
            var4 = arg2 ? Statics.field1942 : Statics.field2411;
        }
        if (arg0 == 1100) {
            Statics.field1972 -= 2;
            var4.field2605 = field1062[Statics.field1972];
            if (var4.field2605 > var4.field2680 - var4.field2554) {
                var4.field2605 = var4.field2680 - var4.field2554;
            }
            if (var4.field2605 < 0) {
                var4.field2605 = 0;
            }
            var4.field2561 = field1062[Statics.field1972 + 1];
            if (var4.field2561 > var4.field2563 - var4.field2593) {
                var4.field2561 = var4.field2563 - var4.field2593;
            }
            if (var4.field2561 < 0) {
                var4.field2561 = 0;
            }
            client.method469(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2670 = field1062[--Statics.field1972];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2568 = field1062[--Statics.field1972] == 1;
            client.method469(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2570 = field1062[--Statics.field1972];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2572 = field1062[--Statics.field1972];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2574 = field1062[--Statics.field1972];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2576 = field1062[--Statics.field1972];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2577 = field1062[--Statics.field1972] == 1;
            client.method469(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2591 = 1;
            var4.field2581 = field1062[--Statics.field1972];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1972 -= 6;
            var4.field2588 = field1062[Statics.field1972];
            var4.field2589 = field1062[Statics.field1972 + 1];
            var4.field2590 = field1062[Statics.field1972 + 2];
            var4.field2629 = field1062[Statics.field1972 + 3];
            var4.field2592 = field1062[Statics.field1972 + 4];
            var4.field2660 = field1062[Statics.field1972 + 5];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1062[--Statics.field1972];
            if (var4.field2586 != var5) {
                var4.field2586 = var5;
                var4.field2667 = 0;
                var4.field2668 = 0;
                client.method469(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2528 = field1062[--Statics.field1972] == 1;
            client.method469(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1063[--Statics.field1505];
            if (!var6.equals(var4.field2600)) {
                var4.field2600 = var6;
                client.method469(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2599 = field1062[--Statics.field1972];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1972 -= 3;
            var4.field2603 = field1062[Statics.field1972];
            var4.field2604 = field1062[Statics.field1972 + 1];
            var4.field2602 = field1062[Statics.field1972 + 2];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2529 = field1062[--Statics.field1972] == 1;
            client.method469(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2578 = field1062[--Statics.field1972];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2579 = field1062[--Statics.field1972];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2580 = field1062[--Statics.field1972] == 1;
            client.method469(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2535 = field1062[--Statics.field1972] == 1;
            client.method469(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1972 -= 2;
            var4.field2680 = field1062[Statics.field1972];
            var4.field2563 = field1062[Statics.field1972 + 1];
            client.method469(var4);
            if (var3 != -1 && var4.field2541 == 0) {
                client.method3414(Statics.field3631[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method482(var4.field2571, var4.field2540);
            client.field789 = var4;
            client.method469(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2546 = field1062[--Statics.field1972];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2565 = field1062[--Statics.field1972];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2560 = field1062[--Statics.field1972];
            client.method469(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1062[--Statics.field1972];
            class323 var8 = (class323) class196.method3332(class323.method3806(), var7);
            if (var8 != null) {
                var4.field2569 = var8;
                client.method469(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1062[--Statics.field1972] == 1;
            var4.field2676 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1062[--Statics.field1972] == 1;
            var4.field2597 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.j(ILcu;ZI)I")
    public static int method152(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method1101(field1062[--Statics.field1972]);
        } else {
            var3 = arg2 ? Statics.field1942 : Statics.field2411;
        }
        client.method469(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1972 -= 2;
            int var4 = field1062[Statics.field1972];
            int var5 = field1062[Statics.field1972 + 1];
            var3.field2665 = var4;
            var3.field2666 = var5;
            class255 var6 = class255.method1055(var4);
            var3.field2590 = var6.field3414;
            var3.field2629 = var6.field3391;
            var3.field2592 = var6.field3392;
            var3.field2588 = var6.field3373;
            var3.field2589 = var6.field3422;
            var3.field2660 = var6.field3389;
            if (arg0 == 1205) {
                var3.field2598 = 0;
            } else if (arg0 == 1212 | var6.field3395 == 1) {
                var3.field2598 = 1;
            } else {
                var3.field2598 = 2;
            }
            if (var3.field2583 > 0) {
                var3.field2660 = var3.field2660 * 32 / var3.field2583;
            } else if (var3.field2550 > 0) {
                var3.field2660 = var3.field2660 * 32 / var3.field2550;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2591 = 2;
            var3.field2581 = field1062[--Statics.field1972];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2591 = 3;
            var3.field2581 = Statics.field2495.field588.method3708();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.v(ILcu;ZS)I")
    public static int method595(int arg0, class93 arg1, boolean arg2) {
        boolean var3 = true;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class218.method1101(field1062[--Statics.field1972]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field1942 : Statics.field2411;
        }
        if (arg0 == 1300) {
            int var5 = field1062[--Statics.field1972] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3753(var5, field1063[--Statics.field1505]);
                return 1;
            } else {
                Statics.field1505--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1972 -= 2;
            int var6 = field1062[Statics.field1972];
            int var7 = field1062[Statics.field1972 + 1];
            var4.field2620 = class218.method701(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2623 = field1062[--Statics.field1972] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2610 = field1062[--Statics.field1972];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2622 = field1062[--Statics.field1972];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2641 = field1063[--Statics.field1505];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2624 = field1063[--Statics.field1505];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2619 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2681 = field1062[--Statics.field1972] == 1;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1972 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1062[Statics.field1972 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1062[Statics.field1972 + var10];
                        var9[var10 / 2] = (byte) field1062[Statics.field1972 + var10 + 1];
                    }
                }
            } else {
                Statics.field1972 -= 2;
                var8 = new byte[] { (byte) field1062[Statics.field1972] };
                var9 = new byte[] { (byte) field1062[Statics.field1972 + 1] };
            }
            int var11 = field1062[--Statics.field1972] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method179(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1972 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1062[Statics.field1972] };
            byte[] var14 = new byte[] { (byte) field1062[Statics.field1972 + 1] };
            method179(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1972 -= 3;
            int var15 = field1062[Statics.field1972] - 1;
            int var16 = field1062[Statics.field1972 + 1];
            int var17 = field1062[Statics.field1972 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method124(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1062[--Statics.field1972];
            int var20 = field1062[--Statics.field1972];
            method124(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1972--;
            int var21 = field1062[Statics.field1972] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method2111(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method2111(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("y.d(Lhy;I[B[BI)V")
    public static final void method179(class218 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2672 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2672 = new byte[11][];
            arg0.field2615 = new byte[11][];
            arg0.field2616 = new int[11];
            arg0.field2617 = new int[11];
        }
        arg0.field2672[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2613 = false;
            for (int var4 = 0; var4 < arg0.field2672.length; var4++) {
                if (arg0.field2672[var4] != null) {
                    arg0.field2613 = true;
                    break;
                }
            }
        } else {
            arg0.field2613 = true;
        }
        arg0.field2615[arg1] = arg3;
    }

    @ObfuscatedName("f.z(Lhy;IIII)V")
    public static final void method124(class218 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2616 == null) {
            throw new RuntimeException();
        }
        arg0.field2616[arg1] = arg2;
        arg0.field2617[arg1] = arg3;
    }

    @ObfuscatedName("cf.s(Lhy;IB)V")
    public static final void method2111(class218 arg0, int arg1) {
        if (arg0.field2672 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2657 == null) {
            arg0.field2657 = new int[arg0.field2672.length];
        }
        arg0.field2657[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("hp.p(ILcu;ZI)I")
    public static int method3713(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method1101(field1062[--Statics.field1972]);
        } else {
            var3 = arg2 ? Statics.field1942 : Statics.field2411;
        }
        String var4 = field1063[--Statics.field1505];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1062[--Statics.field1972];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1062[--Statics.field1972];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1063[--Statics.field1505];
            } else {
                var7[var8] = Integer.valueOf(field1062[--Statics.field1972]);
            }
        }
        int var9 = field1062[--Statics.field1972];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2627 = var7;
        } else if (arg0 == 1401) {
            var3.field2596 = var7;
        } else if (arg0 == 1402) {
            var3.field2614 = var7;
        } else if (arg0 == 1403) {
            var3.field2631 = var7;
        } else if (arg0 == 1404) {
            var3.field2640 = var7;
        } else if (arg0 == 1405) {
            var3.field2634 = var7;
        } else if (arg0 == 1406) {
            var3.field2582 = var7;
        } else if (arg0 == 1407) {
            var3.field2638 = var7;
            var3.field2647 = var5;
        } else if (arg0 == 1408) {
            var3.field2644 = var7;
        } else if (arg0 == 1409) {
            var3.field2645 = var7;
        } else if (arg0 == 1410) {
            var3.field2635 = var7;
        } else if (arg0 == 1411) {
            var3.field2628 = var7;
        } else if (arg0 == 1412) {
            var3.field2632 = var7;
        } else if (arg0 == 1414) {
            var3.field2536 = var7;
            var3.field2678 = var5;
        } else if (arg0 == 1415) {
            var3.field2642 = var7;
            var3.field2643 = var5;
        } else if (arg0 == 1416) {
            var3.field2636 = var7;
        } else if (arg0 == 1417) {
            var3.field2646 = var7;
        } else if (arg0 == 1418) {
            var3.field2558 = var7;
        } else if (arg0 == 1419) {
            var3.field2648 = var7;
        } else if (arg0 == 1420) {
            var3.field2649 = var7;
        } else if (arg0 == 1421) {
            var3.field2650 = var7;
        } else if (arg0 == 1422) {
            var3.field2651 = var7;
        } else if (arg0 == 1423) {
            var3.field2652 = var7;
        } else if (arg0 == 1424) {
            var3.field2653 = var7;
        } else if (arg0 == 1425) {
            var3.field2655 = var7;
        } else if (arg0 == 1426) {
            var3.field2656 = var7;
        } else if (arg0 == 1427) {
            var3.field2654 = var7;
        } else {
            return 2;
        }
        var3.field2625 = true;
        return 1;
    }

    @ObfuscatedName("m.e(ILcu;ZI)I")
    public static int method232(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1942 : Statics.field2411;
        if (arg0 == 1500) {
            field1062[++Statics.field1972 - 1] = var3.field2539;
            return 1;
        } else if (arg0 == 1501) {
            field1062[++Statics.field1972 - 1] = var3.field2553;
            return 1;
        } else if (arg0 == 1502) {
            field1062[++Statics.field1972 - 1] = var3.field2554;
            return 1;
        } else if (arg0 == 1503) {
            field1062[++Statics.field1972 - 1] = var3.field2593;
            return 1;
        } else if (arg0 == 1504) {
            field1062[++Statics.field1972 - 1] = var3.field2559 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1062[++Statics.field1972 - 1] = var3.field2594;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.i(ILcu;ZI)I")
    public static int method3015(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1942 : Statics.field2411;
        if (arg0 == 1600) {
            field1062[++Statics.field1972 - 1] = var3.field2605;
            return 1;
        } else if (arg0 == 1601) {
            field1062[++Statics.field1972 - 1] = var3.field2561;
            return 1;
        } else if (arg0 == 1602) {
            field1063[++Statics.field1505 - 1] = var3.field2600;
            return 1;
        } else if (arg0 == 1603) {
            field1062[++Statics.field1972 - 1] = var3.field2680;
            return 1;
        } else if (arg0 == 1604) {
            field1062[++Statics.field1972 - 1] = var3.field2563;
            return 1;
        } else if (arg0 == 1605) {
            field1062[++Statics.field1972 - 1] = var3.field2660;
            return 1;
        } else if (arg0 == 1606) {
            field1062[++Statics.field1972 - 1] = var3.field2590;
            return 1;
        } else if (arg0 == 1607) {
            field1062[++Statics.field1972 - 1] = var3.field2592;
            return 1;
        } else if (arg0 == 1608) {
            field1062[++Statics.field1972 - 1] = var3.field2629;
            return 1;
        } else if (arg0 == 1609) {
            field1062[++Statics.field1972 - 1] = var3.field2570;
            return 1;
        } else if (arg0 == 1610) {
            field1062[++Statics.field1972 - 1] = var3.field2560;
            return 1;
        } else if (arg0 == 1611) {
            field1062[++Statics.field1972 - 1] = var3.field2670;
            return 1;
        } else if (arg0 == 1612) {
            field1062[++Statics.field1972 - 1] = var3.field2565;
            return 1;
        } else if (arg0 == 1613) {
            field1062[++Statics.field1972 - 1] = var3.field2569.method22();
            return 1;
        } else if (arg0 == 1614) {
            field1062[++Statics.field1972 - 1] = var3.field2597 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hl.q(ILcu;ZI)I")
    public static int method3688(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1942 : Statics.field2411;
        if (arg0 == 1700) {
            field1062[++Statics.field1972 - 1] = var3.field2665;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2665 == -1) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = var3.field2666;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1062[++Statics.field1972 - 1] = var3.field2540;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.r(ILcu;ZI)I")
    public static int method488(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1942 : Statics.field2411;
        if (arg0 == 1800) {
            field1062[++Statics.field1972 - 1] = class219.method4061(client.method995(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1062[--Statics.field1972];
            int var5 = var4 - 1;
            if (var3.field2619 == null || var5 >= var3.field2619.length || var3.field2619[var5] == null) {
                field1063[++Statics.field1505 - 1] = "";
            } else {
                field1063[++Statics.field1505 - 1] = var3.field2619[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2641 == null) {
                field1063[++Statics.field1505 - 1] = "";
            } else {
                field1063[++Statics.field1505 - 1] = var3.field2641;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.k(ILcu;ZB)I")
    public static int method970(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method1101(field1062[--Statics.field1972]);
        } else {
            var3 = arg2 ? Statics.field1942 : Statics.field2411;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1067 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2654 == null) {
            return 0;
        } else {
            class63 var4 = new class63();
            var4.field550 = var3;
            var4.field549 = var3.field2654;
            var4.field551 = field1067 + 1;
            client.field721.method4572(var4);
            return 1;
        }
    }

    @ObfuscatedName("eo.w(ILcu;ZB)I")
    public static int method3013(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method1101(field1062[--Statics.field1972]);
        if (arg0 == 2500) {
            field1062[++Statics.field1972 - 1] = var3.field2539;
            return 1;
        } else if (arg0 == 2501) {
            field1062[++Statics.field1972 - 1] = var3.field2553;
            return 1;
        } else if (arg0 == 2502) {
            field1062[++Statics.field1972 - 1] = var3.field2554;
            return 1;
        } else if (arg0 == 2503) {
            field1062[++Statics.field1972 - 1] = var3.field2593;
            return 1;
        } else if (arg0 == 2504) {
            field1062[++Statics.field1972 - 1] = var3.field2559 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1062[++Statics.field1972 - 1] = var3.field2594;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hx.o(ILcu;ZB)I")
    public static int method3811(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class218 var3 = class218.method1101(field1062[--Statics.field1972]);
            field1062[++Statics.field1972 - 1] = var3.field2665;
            return 1;
        } else if (arg0 == 2701) {
            class218 var4 = class218.method1101(field1062[--Statics.field1972]);
            if (var4.field2665 == -1) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = var4.field2666;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1062[--Statics.field1972];
            class62 var6 = (class62) client.field899.method5524((long) var5);
            if (var6 == null) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1062[++Statics.field1972 - 1] = client.field783;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cw.b(ILcu;ZI)I")
    public static int method2045(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1063[--Statics.field1505];
            class92.method500(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1972 -= 2;
            client.method4109(Statics.field2495, field1062[Statics.field1972], field1062[Statics.field1972 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1069) {
                field1068 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1063[--Statics.field1505];
            int var5 = 0;
            if (class291.method2058(var4)) {
                var5 = class291.method4721(var4);
            }
            class188 var6 = class188.method1894(class184.field2240, client.field669.field1279);
            var6.field2313.method5090(var5);
            client.field669.method2075(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1063[--Statics.field1505];
            class188 var8 = class188.method1894(class184.field2202, client.field669.field1279);
            var8.field2313.method5087(var7.length() + 1);
            var8.field2313.method5094(var7);
            client.field669.method2075(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1063[--Statics.field1505];
            class188 var10 = class188.method1894(class184.field2258, client.field669.field1279);
            var10.field2313.method5087(var9.length() + 1);
            var10.field2313.method5094(var9);
            client.field669.method2075(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1062[--Statics.field1972];
            String var12 = field1063[--Statics.field1505];
            client.method996(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1972 -= 3;
            int var13 = field1062[Statics.field1972];
            int var14 = field1062[Statics.field1972 + 1];
            int var15 = field1062[Statics.field1972 + 2];
            class218 var16 = class218.method1101(var15);
            Statics.method1898(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1972 -= 2;
            int var17 = field1062[Statics.field1972];
            int var18 = field1062[Statics.field1972 + 1];
            class218 var19 = arg2 ? Statics.field1942 : Statics.field2411;
            Statics.method1898(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field282 = field1062[--Statics.field1972] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1062[++Statics.field1972 - 1] = Statics.field928.field1024 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field928.field1024 = field1062[--Statics.field1972] == 1;
            class74.method5046();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1063[--Statics.field1505];
            boolean var21 = field1062[--Statics.field1972] == 1;
            class52.method183(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1062[--Statics.field1972];
            class188 var23 = class188.method1894(class184.field2223, client.field669.field1279);
            var23.field2313.method5145(var22);
            client.field669.method2075(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1062[--Statics.field1972];
            Statics.field1505 -= 2;
            String var25 = field1063[Statics.field1505];
            String var26 = field1063[Statics.field1505 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class188 var27 = class188.method1894(class184.field2237, client.field669.field1279);
                var27.field2313.method5145(1 + class300.method2018(var25) + class300.method2018(var26));
                var27.field2313.method5094(var25);
                var27.field2313.method5129(var24);
                var27.field2313.method5094(var26);
                client.field669.method2075(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field769 = field1062[--Statics.field1972] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field771 = field1062[--Statics.field1972] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field885 = field1062[--Statics.field1972] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1062[--Statics.field1972] == 1) {
                client.field742 |= 0x1;
            } else {
                client.field742 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1062[--Statics.field1972] == 1) {
                client.field742 |= 0x2;
            } else {
                client.field742 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1062[--Statics.field1972] == 1) {
                client.field742 |= 0x4;
            } else {
                client.field742 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1062[--Statics.field1972] == 1) {
                client.field742 |= 0x8;
            } else {
                client.field742 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field742 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field727 = field1062[--Statics.field1972] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field737 = field1062[--Statics.field1972] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method1741(field1062[--Statics.field1972] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1062[++Statics.field1972 - 1] = client.method993() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1972 -= 2;
            client.field702 = field1062[Statics.field1972];
            client.field703 = field1062[Statics.field1972 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1972 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1972--;
            return 1;
        } else if (arg0 == 3132) {
            field1062[++Statics.field1972 - 1] = Statics.field3796;
            field1062[++Statics.field1972 - 1] = Statics.field434;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1972--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1972 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field785 = 3;
            client.field786 = field1062[--Statics.field1972];
            return 1;
        } else if (arg0 == 3137) {
            client.field785 = 2;
            client.field786 = field1062[--Statics.field1972];
            return 1;
        } else if (arg0 == 3138) {
            client.field785 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field785 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field785 = 3;
            client.field786 = arg2 ? Statics.field1942.field2571 : Statics.field2411.field2571;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1062[--Statics.field1972] == 1;
            Statics.field928.field1022 = var28;
            class74.method5046();
            return 1;
        } else if (arg0 == 3142) {
            field1062[++Statics.field1972 - 1] = Statics.field928.field1022 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1062[--Statics.field1972] == 1;
            client.field661 = var29;
            if (!var29) {
                Statics.field928.field1027 = "";
                class74.method5046();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1062[++Statics.field1972 - 1] = client.field661 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1062[--Statics.field1972] == 1;
            if (Statics.field928.field1025 == var30) {
                Statics.field928.field1025 = !var30;
                class74.method5046();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1062[++Statics.field1972 - 1] = Statics.field928.field1025 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1062[++Statics.field1972 - 1] = class86.field1156;
            return 1;
        } else if (arg0 == 3154) {
            field1062[++Statics.field1972 - 1] = client.method3365();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1505--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1972 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1972--;
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1972--;
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1505--;
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1972--;
            field1063[++Statics.field1505 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1972--;
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1972 -= 2;
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1972 -= 2;
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1972 -= 2;
            field1063[++Statics.field1505 - 1] = "";
            field1063[++Statics.field1505 - 1] = "";
            field1063[++Statics.field1505 - 1] = "";
            field1063[++Statics.field1505 - 1] = "";
            field1063[++Statics.field1505 - 1] = "";
            field1063[++Statics.field1505 - 1] = "";
            field1063[++Statics.field1505 - 1] = "";
            field1063[++Statics.field1505 - 1] = "";
            field1063[++Statics.field1505 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1972--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1972--;
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1972--;
            return 1;
        } else if (arg0 == 3175) {
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hv.at(ILcu;ZB)I")
    public static int method3803(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1062[++Statics.field1972 - 1] = client.field628;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1972 -= 2;
            int var3 = field1062[Statics.field1972];
            int var4 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = class60.method3594(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1972 -= 2;
            int var5 = field1062[Statics.field1972];
            int var6 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = class60.method2019(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1972 -= 2;
            int var7 = field1062[Statics.field1972];
            int var8 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = class60.method1558(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = class240.method1963(var9).field3178;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = client.field714[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = client.field672[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = client.field756[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field562;
            int var14 = (Statics.field2495.field971 >> 7) + Statics.field20;
            int var15 = (Statics.field2495.field918 >> 7) + Statics.field553;
            field1062[++Statics.field1972 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1062[++Statics.field1972 - 1] = client.field627 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1972 -= 2;
            int var19 = field1062[Statics.field1972] + 32768;
            int var20 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = class60.method3594(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1972 -= 2;
            int var21 = field1062[Statics.field1972] + 32768;
            int var22 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = class60.method2019(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1972 -= 2;
            int var23 = field1062[Statics.field1972] + 32768;
            int var24 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = class60.method1558(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field792 >= 2) {
                field1062[++Statics.field1972 - 1] = client.field792;
            } else {
                field1062[++Statics.field1972 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1062[++Statics.field1972 - 1] = client.field641;
            return 1;
        } else if (arg0 == 3318) {
            field1062[++Statics.field1972 - 1] = client.field624;
            return 1;
        } else if (arg0 == 3321) {
            field1062[++Statics.field1972 - 1] = client.field790;
            return 1;
        } else if (arg0 == 3322) {
            field1062[++Statics.field1972 - 1] = client.field870;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field794) {
                field1062[++Statics.field1972 - 1] = 1;
            } else {
                field1062[++Statics.field1972 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1062[++Statics.field1972 - 1] = client.field760;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1972 -= 4;
            int var25 = field1062[Statics.field1972];
            int var26 = field1062[Statics.field1972 + 1];
            int var27 = field1062[Statics.field1972 + 2];
            int var28 = field1062[Statics.field1972 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1062[++Statics.field1972 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.ao(ILcu;ZB)I")
    public static int method683(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1972 -= 2;
            int var3 = field1062[Statics.field1972];
            int var4 = field1062[Statics.field1972 + 1];
            class252 var5 = class252.method3820(var3);
            if (var5.field3294 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3295; var6++) {
                if (var5.field3291[var6] == var4) {
                    field1063[++Statics.field1505 - 1] = var5.field3292[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1063[++Statics.field1505 - 1] = var5.field3296;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1972 -= 4;
            int var7 = field1062[Statics.field1972];
            int var8 = field1062[Statics.field1972 + 1];
            int var9 = field1062[Statics.field1972 + 2];
            int var10 = field1062[Statics.field1972 + 3];
            class252 var11 = class252.method3820(var9);
            if (var11.field3289 != var7 || var11.field3294 != var8) {
                if (var8 == 115) {
                    field1063[++Statics.field1505 - 1] = class225.field2900;
                } else {
                    field1062[++Statics.field1972 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3295; var12++) {
                if (var11.field3291[var12] == var10) {
                    if (var8 == 115) {
                        field1063[++Statics.field1505 - 1] = var11.field3292[var12];
                    } else {
                        field1062[++Statics.field1972 - 1] = var11.field3297[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1063[++Statics.field1505 - 1] = var11.field3296;
                } else {
                    field1062[++Statics.field1972 - 1] = var11.field3293;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1062[--Statics.field1972];
            class252 var14 = class252.method3820(var13);
            field1062[++Statics.field1972 - 1] = var14.method4215();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.av(ILcu;ZB)I")
    public static int method592(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field2683.field1035 == 0) {
                field1062[++Statics.field1972 - 1] = -2;
            } else if (Statics.field2683.field1035 == 1) {
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = Statics.field2683.field1039.method4784();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1062[--Statics.field1972];
            if (Statics.field2683.method1694() && var3 >= 0 && var3 < Statics.field2683.field1039.method4784()) {
                class284 var4 = (class284) Statics.field2683.field1039.method4734(var3);
                field1063[++Statics.field1505 - 1] = var4.method4684();
                field1063[++Statics.field1505 - 1] = var4.method4682();
            } else {
                field1063[++Statics.field1505 - 1] = "";
                field1063[++Statics.field1505 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1062[--Statics.field1972];
            if (Statics.field2683.method1694() && var5 >= 0 && var5 < Statics.field2683.field1039.method4784()) {
                field1062[++Statics.field1972 - 1] = ((class279) Statics.field2683.field1039.method4734(var5)).field3582;
            } else {
                field1062[++Statics.field1972 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1062[--Statics.field1972];
            if (Statics.field2683.method1694() && var6 >= 0 && var6 < Statics.field2683.field1039.method4784()) {
                field1062[++Statics.field1972 - 1] = ((class279) Statics.field2683.field1039.method4734(var6)).field3580;
            } else {
                field1062[++Statics.field1972 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1063[--Statics.field1505];
            int var8 = field1062[--Statics.field1972];
            class75.method5388(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1063[--Statics.field1505];
            Statics.field2683.method1722(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1063[--Statics.field1505];
            Statics.field2683.method1693(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1063[--Statics.field1505];
            Statics.field2683.method1697(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1063[--Statics.field1505];
            Statics.field2683.method1689(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1063[--Statics.field1505];
            String var14 = client.method54(var13);
            field1062[++Statics.field1972 - 1] = Statics.field2683.method1691(new class283(var14, Statics.field22), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field73 == null) {
                field1063[++Statics.field1505 - 1] = "";
            } else {
                field1063[++Statics.field1505 - 1] = Statics.field73.field3604;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field73 == null) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = Statics.field73.method4784();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1062[--Statics.field1972];
            if (Statics.field73 == null || var15 >= Statics.field73.method4784()) {
                field1063[++Statics.field1505 - 1] = "";
            } else {
                field1063[++Statics.field1505 - 1] = Statics.field73.method4734(var15).method4683().method4815();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1062[--Statics.field1972];
            if (Statics.field73 == null || var16 >= Statics.field73.method4784()) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = ((class279) Statics.field73.method4734(var16)).method4797();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1062[--Statics.field1972];
            if (Statics.field73 == null || var17 >= Statics.field73.method4784()) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = ((class279) Statics.field73.method4734(var17)).field3580;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1062[++Statics.field1972 - 1] = Statics.field73 == null ? 0 : Statics.field73.field3606;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1063[--Statics.field1505];
            client.method3407(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1062[++Statics.field1972 - 1] = Statics.field73 == null ? 0 : Statics.field73.field3609;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1063[--Statics.field1505];
            client.method467(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method736();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field2683.method1694()) {
                field1062[++Statics.field1972 - 1] = Statics.field2683.field1034.method4784();
            } else {
                field1062[++Statics.field1972 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1062[--Statics.field1972];
            if (Statics.field2683.method1694() && var20 >= 0 && var20 < Statics.field2683.field1034.method4784()) {
                class278 var21 = (class278) Statics.field2683.field1034.method4734(var20);
                field1063[++Statics.field1505 - 1] = var21.method4684();
                field1063[++Statics.field1505 - 1] = var21.method4682();
            } else {
                field1063[++Statics.field1505 - 1] = "";
                field1063[++Statics.field1505 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1063[--Statics.field1505];
            String var23 = client.method54(var22);
            field1062[++Statics.field1972 - 1] = Statics.field2683.method1688(new class283(var23, Statics.field22)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1062[--Statics.field1972];
            if (Statics.field73 == null || var24 >= Statics.field73.method4784() || !Statics.field73.method4734(var24).method4683().equals(Statics.field2495.field596)) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field73 == null || Statics.field73.field3607 == null) {
                field1063[++Statics.field1505 - 1] = "";
            } else {
                field1063[++Statics.field1505 - 1] = Statics.field73.field3607;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1062[--Statics.field1972];
            if (Statics.field73 == null || var25 >= Statics.field73.method4784() || !((class273) Statics.field73.method4734(var25)).method4662()) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1062[--Statics.field1972];
            if (Statics.field73 == null || var26 >= Statics.field73.method4784() || !((class273) Statics.field73.method4734(var26)).method4668()) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field2683.field1039.method4756();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1039.method4742(new class314(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1039.method4742(new class315(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1039.method4742(new class158(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1039.method4742(new class152(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1039.method4742(new class157(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1039.method4742(new class160(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1039.method4742(new class156(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1039.method4742(new class154(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1039.method4742(new class153(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1039.method4742(new class155(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field2683.field1039.method4735();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field2683.field1034.method4756();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1034.method4742(new class314(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1034.method4742(new class315(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field2683.field1034.method4735();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field73 != null) {
                Statics.field73.method4756();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1062[--Statics.field1972] == 1;
            if (Statics.field73 != null) {
                Statics.field73.method4742(new class314(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1062[--Statics.field1972] == 1;
            if (Statics.field73 != null) {
                Statics.field73.method4742(new class315(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1062[--Statics.field1972] == 1;
            if (Statics.field73 != null) {
                Statics.field73.method4742(new class158(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1062[--Statics.field1972] == 1;
            if (Statics.field73 != null) {
                Statics.field73.method4742(new class152(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1062[--Statics.field1972] == 1;
            if (Statics.field73 != null) {
                Statics.field73.method4742(new class157(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1062[--Statics.field1972] == 1;
            if (Statics.field73 != null) {
                Statics.field73.method4742(new class160(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1062[--Statics.field1972] == 1;
            if (Statics.field73 != null) {
                Statics.field73.method4742(new class156(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1062[--Statics.field1972] == 1;
            if (Statics.field73 != null) {
                Statics.field73.method4742(new class154(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1062[--Statics.field1972] == 1;
            if (Statics.field73 != null) {
                Statics.field73.method4742(new class153(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1062[--Statics.field1972] == 1;
            if (Statics.field73 != null) {
                Statics.field73.method4742(new class155(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field73 != null) {
                Statics.field73.method4735();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1062[--Statics.field1972] == 1;
            Statics.field2683.field1039.method4742(new class159(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1062[--Statics.field1972] == 1;
            if (Statics.field73 != null) {
                Statics.field73.method4742(new class159(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fk.an(ILcu;ZI)I")
    public static int method3238(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = client.field891[var3].method77();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = client.field891[var4].field57;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = client.field891[var5].field59;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = client.field891[var6].field60;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = client.field891[var7].field58;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = client.field891[var8].field62;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1062[--Statics.field1972];
            int var10 = client.field891[var9].method76();
            field1062[++Statics.field1972 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1062[--Statics.field1972];
            int var12 = client.field891[var11].method76();
            field1062[++Statics.field1972 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1062[--Statics.field1972];
            int var14 = client.field891[var13].method76();
            field1062[++Statics.field1972 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1062[--Statics.field1972];
            int var16 = client.field891[var15].method76();
            field1062[++Statics.field1972 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1062[--Statics.field1972] == 1;
            if (Statics.field1289 != null) {
                Statics.field1289.method51(class7.field39, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1062[--Statics.field1972] == 1;
            if (Statics.field1289 != null) {
                Statics.field1289.method51(class7.field37, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1972 -= 2;
            boolean var19 = field1062[Statics.field1972] == 1;
            boolean var20 = field1062[Statics.field1972 + 1] == 1;
            if (Statics.field1289 != null) {
                client.field892.field621 = var20;
                Statics.field1289.method51(client.field892, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1062[--Statics.field1972] == 1;
            if (Statics.field1289 != null) {
                Statics.field1289.method51(class7.field36, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1062[--Statics.field1972] == 1;
            if (Statics.field1289 != null) {
                Statics.field1289.method51(class7.field42, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1062[++Statics.field1972 - 1] = Statics.field1289 == null ? 0 : Statics.field1289.field38.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1062[--Statics.field1972];
            class8 var24 = (class8) Statics.field1289.field38.get(var23);
            field1062[++Statics.field1972 - 1] = var24.field46;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1062[--Statics.field1972];
            class8 var26 = (class8) Statics.field1289.field38.get(var25);
            field1063[++Statics.field1505 - 1] = var26.method57();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1062[--Statics.field1972];
            class8 var28 = (class8) Statics.field1289.field38.get(var27);
            field1063[++Statics.field1505 - 1] = var28.method58();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1062[--Statics.field1972];
            class8 var30 = (class8) Statics.field1289.field38.get(var29);
            long var31 = Statics.method2303() - Statics.field26 - var30.field45;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1063[++Statics.field1505 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1062[--Statics.field1972];
            class8 var38 = (class8) Statics.field1289.field38.get(var37);
            field1062[++Statics.field1972 - 1] = var38.field52.field60;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1062[--Statics.field1972];
            class8 var40 = (class8) Statics.field1289.field38.get(var39);
            field1062[++Statics.field1972 - 1] = var40.field52.field59;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1062[--Statics.field1972];
            class8 var42 = (class8) Statics.field1289.field38.get(var41);
            field1062[++Statics.field1972 - 1] = var42.field52.field57;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cb.al(ILcu;ZI)I")
    public static int method1873(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1972 -= 2;
            int var3 = field1062[Statics.field1972];
            int var4 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1972 -= 2;
            int var5 = field1062[Statics.field1972];
            int var6 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1972 -= 2;
            int var7 = field1062[Statics.field1972];
            int var8 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1972 -= 2;
            int var9 = field1062[Statics.field1972];
            int var10 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1972 -= 5;
            int var13 = field1062[Statics.field1972];
            int var14 = field1062[Statics.field1972 + 1];
            int var15 = field1062[Statics.field1972 + 2];
            int var16 = field1062[Statics.field1972 + 3];
            int var17 = field1062[Statics.field1972 + 4];
            field1062[++Statics.field1972 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1972 -= 2;
            int var18 = field1062[Statics.field1972];
            int var19 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1972 -= 2;
            int var20 = field1062[Statics.field1972];
            int var21 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1972 -= 2;
            int var22 = field1062[Statics.field1972];
            int var23 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1972 -= 2;
            int var24 = field1062[Statics.field1972];
            int var25 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1972 -= 2;
            int var26 = field1062[Statics.field1972];
            int var27 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1972 -= 2;
            int var28 = field1062[Statics.field1972];
            int var29 = field1062[Statics.field1972 + 1];
            if (var28 == 0) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1972 -= 2;
            int var30 = field1062[Statics.field1972];
            int var31 = field1062[Statics.field1972 + 1];
            if (var30 == 0) {
                field1062[++Statics.field1972 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1062[++Statics.field1972 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1062[++Statics.field1972 - 1] = var30;
                    break;
                case 2:
                    field1062[++Statics.field1972 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1062[++Statics.field1972 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1062[++Statics.field1972 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1062[++Statics.field1972 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1972 -= 2;
            int var32 = field1062[Statics.field1972];
            int var33 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1972 -= 2;
            int var34 = field1062[Statics.field1972];
            int var35 = field1062[Statics.field1972 + 1];
            field1062[++Statics.field1972 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1972 -= 3;
            long var36 = (long) field1062[Statics.field1972];
            long var38 = (long) field1062[Statics.field1972 + 1];
            long var40 = (long) field1062[Statics.field1972 + 2];
            field1062[++Statics.field1972 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.as(ILcu;ZI)I")
    public static int method703(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1063[--Statics.field1505];
            int var4 = field1062[--Statics.field1972];
            field1063[++Statics.field1505 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1505 -= 2;
            String var5 = field1063[Statics.field1505];
            String var6 = field1063[Statics.field1505 + 1];
            field1063[++Statics.field1505 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1063[--Statics.field1505];
            int var8 = field1062[--Statics.field1972];
            field1063[++Statics.field1505 - 1] = var7 + class291.method2832(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1063[--Statics.field1505];
            field1063[++Statics.field1505 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1062[--Statics.field1972];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1066.setTime(new Date(var11));
            int var13 = field1066.get(5);
            int var14 = field1066.get(2);
            int var15 = field1066.get(1);
            field1063[++Statics.field1505 - 1] = var13 + "-" + field1065[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1505 -= 2;
            String var16 = field1063[Statics.field1505];
            String var17 = field1063[Statics.field1505 + 1];
            if (Statics.field2495.field588 != null && Statics.field2495.field588.field2507) {
                field1063[++Statics.field1505 - 1] = var17;
            } else {
                field1063[++Statics.field1505 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1062[--Statics.field1972];
            field1063[++Statics.field1505 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1505 -= 2;
            field1062[++Statics.field1972 - 1] = Statics.method825(class287.method1895(field1063[Statics.field1505], field1063[Statics.field1505 + 1], Statics.field361));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1063[--Statics.field1505];
            Statics.field1972 -= 2;
            int var20 = field1062[Statics.field1972];
            int var21 = field1062[Statics.field1972 + 1];
            byte[] var22 = Statics.field1498.method3825(var21, 0);
            class295 var23 = new class295(var22);
            field1062[++Statics.field1972 - 1] = var23.method4955(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1063[--Statics.field1505];
            Statics.field1972 -= 2;
            int var25 = field1062[Statics.field1972];
            int var26 = field1062[Statics.field1972 + 1];
            byte[] var27 = Statics.field1498.method3825(var26, 0);
            class295 var28 = new class295(var27);
            field1062[++Statics.field1972 - 1] = var28.method4954(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1505 -= 2;
            String var29 = field1063[Statics.field1505];
            String var30 = field1063[Statics.field1505 + 1];
            if (field1062[--Statics.field1972] == 1) {
                field1063[++Statics.field1505 - 1] = var29;
            } else {
                field1063[++Statics.field1505 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1063[--Statics.field1505];
            field1063[++Statics.field1505 - 1] = class296.method4968(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1063[--Statics.field1505];
            int var33 = field1062[--Statics.field1972];
            field1063[++Statics.field1505 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = class291.method3395((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = class291.method1863((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = class291.method1373((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = class291.method1572((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1063[--Statics.field1505];
            if (var38 == null) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1063[--Statics.field1505];
            Statics.field1972 -= 2;
            int var40 = field1062[Statics.field1972];
            int var41 = field1062[Statics.field1972 + 1];
            field1063[++Statics.field1505 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1063[--Statics.field1505];
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
            field1063[++Statics.field1505 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1063[--Statics.field1505];
            int var48 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1505 -= 2;
            String var49 = field1063[Statics.field1505];
            String var50 = field1063[Statics.field1505 + 1];
            int var51 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1063[--Statics.field1505];
            field1063[++Statics.field1505 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gg.ad(ILcu;ZB)I")
    public static int method3396(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1062[--Statics.field1972];
            field1063[++Statics.field1505 - 1] = class255.method1055(var3).field3384;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1972 -= 2;
            int var4 = field1062[Statics.field1972];
            int var5 = field1062[Statics.field1972 + 1];
            class255 var6 = class255.method1055(var4);
            if (var5 < 1 || var5 > 5 || var6.field3417[var5 - 1] == null) {
                field1063[++Statics.field1505 - 1] = "";
            } else {
                field1063[++Statics.field1505 - 1] = var6.field3417[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1972 -= 2;
            int var7 = field1062[Statics.field1972];
            int var8 = field1062[Statics.field1972 + 1];
            class255 var9 = class255.method1055(var7);
            if (var8 < 1 || var8 > 5 || var9.field3399[var8 - 1] == null) {
                field1063[++Statics.field1505 - 1] = "";
            } else {
                field1063[++Statics.field1505 - 1] = var9.field3399[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = class255.method1055(var10).field3396;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = class255.method1055(var11).field3395 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1062[--Statics.field1972];
            class255 var13 = class255.method1055(var12);
            if (var13.field3390 == -1 && var13.field3378 >= 0) {
                field1062[++Statics.field1972 - 1] = var13.field3378;
            } else {
                field1062[++Statics.field1972 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1062[--Statics.field1972];
            class255 var15 = class255.method1055(var14);
            if (var15.field3390 >= 0 && var15.field3378 >= 0) {
                field1062[++Statics.field1972 - 1] = var15.field3378;
            } else {
                field1062[++Statics.field1972 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = class255.method1055(var16).field3420 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1062[--Statics.field1972];
            class255 var18 = class255.method1055(var17);
            if (var18.field3428 == -1 && var18.field3427 >= 0) {
                field1062[++Statics.field1972 - 1] = var18.field3427;
            } else {
                field1062[++Statics.field1972 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1062[--Statics.field1972];
            class255 var20 = class255.method1055(var19);
            if (var20.field3428 >= 0 && var20.field3427 >= 0) {
                field1062[++Statics.field1972 - 1] = var20.field3427;
            } else {
                field1062[++Statics.field1972 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1063[--Statics.field1505];
            int var22 = field1062[--Statics.field1972];
            client.method677(var21, var22 == 1);
            field1062[++Statics.field1972 - 1] = Statics.field77;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1850 == null || Statics.field505 >= Statics.field77) {
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = Statics.field1850[++Statics.field505 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field505 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hs.ap(ILcu;ZB)I")
    public static int method3789(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1062[++Statics.field1972 - 1] = client.field840;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1972 -= 3;
            client.field840 = field1062[Statics.field1972];
            Statics.field2355 = class310.method3040(field1062[Statics.field1972 + 1]);
            if (Statics.field2355 == null) {
                Statics.field2355 = class310.field3787;
            }
            client.field841 = field1062[Statics.field1972 + 2];
            class188 var3 = class188.method1894(class184.field2242, client.field669.field1279);
            var3.field2313.method5087(client.field840);
            var3.field2313.method5087(Statics.field2355.field3788);
            var3.field2313.method5087(client.field841);
            client.field669.method2075(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1063[--Statics.field1505];
            Statics.field1972 -= 2;
            int var5 = field1062[Statics.field1972];
            int var6 = field1062[Statics.field1972 + 1];
            class188 var7 = class188.method1894(class184.field2250, client.field669.field1279);
            var7.field2313.method5087(class300.method2018(var4) + 2);
            var7.field2313.method5094(var4);
            var7.field2313.method5087(var5 - 1);
            var7.field2313.method5087(var6);
            client.field669.method2075(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1972 -= 2;
            int var8 = field1062[Statics.field1972];
            int var9 = field1062[Statics.field1972 + 1];
            class65 var10 = class92.method2523(var8, var9);
            if (var10 == null) {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = 0;
                field1063[++Statics.field1505 - 1] = "";
                field1063[++Statics.field1505 - 1] = "";
                field1063[++Statics.field1505 - 1] = "";
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = var10.field572;
                field1062[++Statics.field1972 - 1] = var10.field568;
                field1063[++Statics.field1505 - 1] = var10.field570 == null ? "" : var10.field570;
                field1063[++Statics.field1505 - 1] = var10.field571 == null ? "" : var10.field571;
                field1063[++Statics.field1505 - 1] = var10.field567 == null ? "" : var10.field567;
                field1062[++Statics.field1972 - 1] = var10.method1024() ? 1 : (var10.method1027() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1062[--Statics.field1972];
            class65 var12 = class92.method145(var11);
            if (var12 == null) {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = 0;
                field1063[++Statics.field1505 - 1] = "";
                field1063[++Statics.field1505 - 1] = "";
                field1063[++Statics.field1505 - 1] = "";
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = var12.field569;
                field1062[++Statics.field1972 - 1] = var12.field568;
                field1063[++Statics.field1505 - 1] = var12.field570 == null ? "" : var12.field570;
                field1063[++Statics.field1505 - 1] = var12.field571 == null ? "" : var12.field571;
                field1063[++Statics.field1505 - 1] = var12.field567 == null ? "" : var12.field567;
                field1062[++Statics.field1972 - 1] = var12.method1024() ? 1 : (var12.method1027() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2355 == null) {
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = Statics.field2355.field3788;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1063[--Statics.field1505];
            int var14 = field1062[--Statics.field1972];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class225.field2978)) {
                var16 = 0;
                var13 = var13.substring(class225.field2978.length());
            } else if (var15.startsWith(class225.field2851)) {
                var16 = 1;
                var13 = var13.substring(class225.field2851.length());
            } else if (var15.startsWith(class225.field2923)) {
                var16 = 2;
                var13 = var13.substring(class225.field2923.length());
            } else if (var15.startsWith(class225.field2925)) {
                var16 = 3;
                var13 = var13.substring(class225.field2925.length());
            } else if (var15.startsWith(class225.field2927)) {
                var16 = 4;
                var13 = var13.substring(class225.field2927.length());
            } else if (var15.startsWith(class225.field2929)) {
                var16 = 5;
                var13 = var13.substring(class225.field2929.length());
            } else if (var15.startsWith(class225.field2807)) {
                var16 = 6;
                var13 = var13.substring(class225.field2807.length());
            } else if (var15.startsWith(class225.field2933)) {
                var16 = 7;
                var13 = var13.substring(class225.field2933.length());
            } else if (var15.startsWith(class225.field2935)) {
                var16 = 8;
                var13 = var13.substring(class225.field2935.length());
            } else if (var15.startsWith(class225.field2997)) {
                var16 = 9;
                var13 = var13.substring(class225.field2997.length());
            } else if (var15.startsWith(class225.field2992)) {
                var16 = 10;
                var13 = var13.substring(class225.field2992.length());
            } else if (var15.startsWith(class225.field2941)) {
                var16 = 11;
                var13 = var13.substring(class225.field2941.length());
            } else if (Statics.field361 != class191.field2327) {
                if (var15.startsWith(class225.field3004)) {
                    var16 = 0;
                    var13 = var13.substring(class225.field3004.length());
                } else if (var15.startsWith(class225.field2842)) {
                    var16 = 1;
                    var13 = var13.substring(class225.field2842.length());
                } else if (var15.startsWith(class225.field2924)) {
                    var16 = 2;
                    var13 = var13.substring(class225.field2924.length());
                } else if (var15.startsWith(class225.field2926)) {
                    var16 = 3;
                    var13 = var13.substring(class225.field2926.length());
                } else if (var15.startsWith(class225.field2928)) {
                    var16 = 4;
                    var13 = var13.substring(class225.field2928.length());
                } else if (var15.startsWith(class225.field2972)) {
                    var16 = 5;
                    var13 = var13.substring(class225.field2972.length());
                } else if (var15.startsWith(class225.field2985)) {
                    var16 = 6;
                    var13 = var13.substring(class225.field2985.length());
                } else if (var15.startsWith(class225.field2934)) {
                    var16 = 7;
                    var13 = var13.substring(class225.field2934.length());
                } else if (var15.startsWith(class225.field2936)) {
                    var16 = 8;
                    var13 = var13.substring(class225.field2936.length());
                } else if (var15.startsWith(class225.field2748)) {
                    var16 = 9;
                    var13 = var13.substring(class225.field2748.length());
                } else if (var15.startsWith(class225.field2940)) {
                    var16 = 10;
                    var13 = var13.substring(class225.field2940.length());
                } else if (var15.startsWith(class225.field2942)) {
                    var16 = 11;
                    var13 = var13.substring(class225.field2942.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class225.field2943)) {
                var18 = 1;
                var13 = var13.substring(class225.field2943.length());
            } else if (var17.startsWith(class225.field2975)) {
                var18 = 2;
                var13 = var13.substring(class225.field2975.length());
            } else if (var17.startsWith(class225.field2947)) {
                var18 = 3;
                var13 = var13.substring(class225.field2947.length());
            } else if (var17.startsWith(class225.field2939)) {
                var18 = 4;
                var13 = var13.substring(class225.field2939.length());
            } else if (var17.startsWith(class225.field2951)) {
                var18 = 5;
                var13 = var13.substring(class225.field2951.length());
            } else if (Statics.field361 != class191.field2327) {
                if (var17.startsWith(class225.field2920)) {
                    var18 = 1;
                    var13 = var13.substring(class225.field2920.length());
                } else if (var17.startsWith(class225.field2946)) {
                    var18 = 2;
                    var13 = var13.substring(class225.field2946.length());
                } else if (var17.startsWith(class225.field2839)) {
                    var18 = 3;
                    var13 = var13.substring(class225.field2839.length());
                } else if (var17.startsWith(class225.field2917)) {
                    var18 = 4;
                    var13 = var13.substring(class225.field2917.length());
                } else if (var17.startsWith(class225.field2952)) {
                    var18 = 5;
                    var13 = var13.substring(class225.field2952.length());
                }
            }
            class188 var19 = class188.method1894(class184.field2279, client.field669.field1279);
            var19.field2313.method5087(0);
            int var20 = var19.field2313.field3696;
            var19.field2313.method5087(var14);
            var19.field2313.method5087(var16);
            var19.field2313.method5087(var18);
            class211.method1624(var19.field2313, var13);
            var19.field2313.method5332(var19.field2313.field3696 - var20);
            client.field669.method2075(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1505 -= 2;
            String var21 = field1063[Statics.field1505];
            String var22 = field1063[Statics.field1505 + 1];
            class188 var23 = class188.method1894(class184.field2209, client.field669.field1279);
            var23.field2313.method5145(0);
            int var24 = var23.field2313.field3696;
            var23.field2313.method5094(var21);
            class211.method1624(var23.field2313, var22);
            var23.field2313.method5099(var23.field2313.field3696 - var24);
            client.field669.method2075(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field2495 == null || Statics.field2495.field596 == null) {
                var25 = "";
            } else {
                var25 = Statics.field2495.field596.method4815();
            }
            field1063[++Statics.field1505 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1062[++Statics.field1972 - 1] = client.field841;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = class92.method3180(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = class92.method553(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = class92.method1120(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1063[--Statics.field1505];
            client.method932(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field779 = field1063[--Statics.field1505].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1063[++Statics.field1505 - 1] = client.field779;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1063[--Statics.field1505];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bb.ax(ILcu;ZI)I")
    public static int method1631(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1062[++Statics.field1972 - 1] = client.method637();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1062[--Statics.field1972];
            if (var3 == 1 || var3 == 2) {
                client.method3531(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1062[++Statics.field1972 - 1] = Statics.field928.field1026;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1062[--Statics.field1972];
            if (var4 == 1 || var4 == 2) {
                Statics.field928.field1026 = var4;
                class74.method5046();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1972--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iw.aj(ILcu;ZB)I")
    public static int method4466(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1972 -= 2;
            int var3 = field1062[Statics.field1972];
            int var4 = field1062[Statics.field1972 + 1];
            if (!client.field848) {
                client.field691 = var3;
                client.field692 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1062[++Statics.field1972 - 1] = client.field691;
            return 1;
        } else if (arg0 == 5506) {
            field1062[++Statics.field1972 - 1] = client.field692;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1062[--Statics.field1972];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field698 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1062[++Statics.field1972 - 1] = client.field698;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cb.ab(ILcu;ZB)I")
    public static int method1866(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field670 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("x.af(II)I")
    public static int method13(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("ao.ak(II)I")
    public static int method325(int arg0) {
        return (int) ((Math.log((double) arg0) / field1071 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("de.ay(ILcu;ZB)I")
    public static int method2317(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1972 -= 2;
            client.field874 = (short) method13(field1062[Statics.field1972]);
            if (client.field874 <= 0) {
                client.field874 = 256;
            }
            client.field753 = (short) method13(field1062[Statics.field1972 + 1]);
            if (client.field753 <= 0) {
                client.field753 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1972 -= 2;
            client.field710 = (short) field1062[Statics.field1972];
            if (client.field710 <= 0) {
                client.field710 = 256;
            }
            client.field877 = (short) field1062[Statics.field1972 + 1];
            if (client.field877 <= 0) {
                client.field877 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1972 -= 4;
            client.field878 = (short) field1062[Statics.field1972];
            if (client.field878 <= 0) {
                client.field878 = 1;
            }
            client.field879 = (short) field1062[Statics.field1972 + 1];
            if (client.field879 <= 0) {
                client.field879 = 32767;
            } else if (client.field879 < client.field878) {
                client.field879 = client.field878;
            }
            client.field880 = (short) field1062[Statics.field1972 + 2];
            if (client.field880 <= 0) {
                client.field880 = 1;
            }
            client.field718 = (short) field1062[Statics.field1972 + 3];
            if (client.field718 <= 0) {
                client.field718 = 32767;
            } else if (client.field718 < client.field880) {
                client.field718 = client.field880;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field795 == null) {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                Statics.method5808(0, 0, client.field795.field2554, client.field795.field2593, false);
                field1062[++Statics.field1972 - 1] = client.field741;
                field1062[++Statics.field1972 - 1] = client.field831;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1062[++Statics.field1972 - 1] = client.field710;
            field1062[++Statics.field1972 - 1] = client.field877;
            return 1;
        } else if (arg0 == 6205) {
            field1062[++Statics.field1972 - 1] = method325(client.field874);
            field1062[++Statics.field1972 - 1] = method325(client.field753);
            return 1;
        } else if (arg0 == 6220) {
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1062[++Statics.field1972 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1062[++Statics.field1972 - 1] = Statics.field3796;
            return 1;
        } else if (arg0 == 6223) {
            field1062[++Statics.field1972 - 1] = Statics.field434;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.ae(ILcu;ZI)I")
    public static int method89(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1062[++Statics.field1972 - 1] = class72.method3337() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class72 var3 = class72.method3347();
            if (var3 == null) {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = 0;
                field1063[++Statics.field1505 - 1] = "";
                field1062[++Statics.field1972 - 1] = 0;
                field1062[++Statics.field1972 - 1] = 0;
                field1063[++Statics.field1505 - 1] = "";
            } else {
                field1062[++Statics.field1972 - 1] = var3.field993;
                field1062[++Statics.field1972 - 1] = var3.field999;
                field1063[++Statics.field1505 - 1] = var3.field990;
                field1062[++Statics.field1972 - 1] = var3.field998;
                field1062[++Statics.field1972 - 1] = var3.field995;
                field1063[++Statics.field1505 - 1] = var3.field1000;
            }
            return 1;
        } else if (arg0 == 6502) {
            class72 var4 = class72.method3029();
            if (var4 == null) {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = 0;
                field1063[++Statics.field1505 - 1] = "";
                field1062[++Statics.field1972 - 1] = 0;
                field1062[++Statics.field1972 - 1] = 0;
                field1063[++Statics.field1505 - 1] = "";
            } else {
                field1062[++Statics.field1972 - 1] = var4.field993;
                field1062[++Statics.field1972 - 1] = var4.field999;
                field1063[++Statics.field1505 - 1] = var4.field990;
                field1062[++Statics.field1972 - 1] = var4.field998;
                field1062[++Statics.field1972 - 1] = var4.field995;
                field1063[++Statics.field1505 - 1] = var4.field1000;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1062[--Statics.field1972];
            class72 var6 = null;
            for (int var7 = 0; var7 < class72.field989; var7++) {
                if (Statics.field988[var7].field993 == var5) {
                    var6 = Statics.field988[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = 0;
                field1063[++Statics.field1505 - 1] = "";
                field1062[++Statics.field1972 - 1] = 0;
                field1062[++Statics.field1972 - 1] = 0;
                field1063[++Statics.field1505 - 1] = "";
            } else {
                field1062[++Statics.field1972 - 1] = var6.field993;
                field1062[++Statics.field1972 - 1] = var6.field999;
                field1063[++Statics.field1505 - 1] = var6.field990;
                field1062[++Statics.field1972 - 1] = var6.field998;
                field1062[++Statics.field1972 - 1] = var6.field995;
                field1063[++Statics.field1505 - 1] = var6.field1000;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1972 -= 4;
            int var8 = field1062[Statics.field1972];
            boolean var9 = field1062[Statics.field1972 + 1] == 1;
            int var10 = field1062[Statics.field1972 + 2];
            boolean var11 = field1062[Statics.field1972 + 3] == 1;
            class72.method468(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1062[--Statics.field1972];
            if (var12 >= 0 && var12 < class72.field989) {
                class72 var13 = Statics.field988[var12];
                field1062[++Statics.field1972 - 1] = var13.field993;
                field1062[++Statics.field1972 - 1] = var13.field999;
                field1063[++Statics.field1505 - 1] = var13.field990;
                field1062[++Statics.field1972 - 1] = var13.field998;
                field1062[++Statics.field1972 - 1] = var13.field995;
                field1063[++Statics.field1505 - 1] = var13.field1000;
            } else {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = 0;
                field1063[++Statics.field1505 - 1] = "";
                field1062[++Statics.field1972 - 1] = 0;
                field1062[++Statics.field1972 - 1] = 0;
                field1063[++Statics.field1505 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field696 = field1062[--Statics.field1972] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1972 -= 2;
            int var14 = field1062[Statics.field1972];
            int var15 = field1062[Statics.field1972 + 1];
            class250 var16 = class250.method69(var15);
            if (var16.method4175()) {
                field1063[++Statics.field1505 - 1] = class257.method4928(var14).method4399(var15, var16.field3279);
            } else {
                field1062[++Statics.field1972 - 1] = class257.method4928(var14).method4393(var15, var16.field3278);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1972 -= 2;
            int var17 = field1062[Statics.field1972];
            int var18 = field1062[Statics.field1972 + 1];
            class250 var19 = class250.method69(var18);
            if (var19.method4175()) {
                field1063[++Statics.field1505 - 1] = class254.method3035(var17).method4289(var18, var19.field3279);
            } else {
                field1062[++Statics.field1972 - 1] = class254.method3035(var17).method4273(var18, var19.field3278);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1972 -= 2;
            int var20 = field1062[Statics.field1972];
            int var21 = field1062[Statics.field1972 + 1];
            class250 var22 = class250.method69(var21);
            if (var22.method4175()) {
                field1063[++Statics.field1505 - 1] = class255.method1055(var20).method4332(var21, var22.field3279);
            } else {
                field1062[++Statics.field1972 - 1] = class255.method1055(var20).method4331(var21, var22.field3278);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1972 -= 2;
            int var23 = field1062[Statics.field1972];
            int var24 = field1062[Statics.field1972 + 1];
            class250 var25 = class250.method69(var24);
            if (var25.method4175()) {
                field1063[++Statics.field1505 - 1] = class251.method3798(var23).method4195(var24, var25.field3279);
            } else {
                field1062[++Statics.field1972 - 1] = class251.method3798(var23).method4191(var24, var25.field3278);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1062[++Statics.field1972 - 1] = client.field630 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1062[++Statics.field1972 - 1] = client.field857 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1505--;
            Statics.field1972--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1505--;
            Statics.field1972--;
            return 1;
        } else if (arg0 == 6524) {
            field1062[++Statics.field1972 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1062[++Statics.field1972 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1062[++Statics.field1972 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("br.ah(ILcu;ZI)I")
    public static int method1753(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field562;
            int var4 = (Statics.field2495.field971 >> 7) + Statics.field20;
            int var5 = (Statics.field2495.field918 >> 7) + Statics.field553;
            client.method14().method5854(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1062[--Statics.field1972];
            String var7 = "";
            class27 var8 = client.method14().method5872(var6);
            if (var8 != null) {
                var7 = var8.method282();
            }
            field1063[++Statics.field1505 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1062[--Statics.field1972];
            client.method14().method5855(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1062[++Statics.field1972 - 1] = client.method14().method5869();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1062[--Statics.field1972];
            client.method14().method5980(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1062[++Statics.field1972 - 1] = client.method14().method5847() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class214 var11 = new class214(field1062[--Statics.field1972]);
            client.method14().method5873(var11.field2502, var11.field2503);
            return 1;
        } else if (arg0 == 6607) {
            class214 var12 = new class214(field1062[--Statics.field1972]);
            client.method14().method5846(var12.field2502, var12.field2503);
            return 1;
        } else if (arg0 == 6608) {
            class214 var13 = new class214(field1062[--Statics.field1972]);
            client.method14().method5875(var13.field2501, var13.field2502, var13.field2503);
            return 1;
        } else if (arg0 == 6609) {
            class214 var14 = new class214(field1062[--Statics.field1972]);
            client.method14().method5876(var14.field2501, var14.field2502, var14.field2503);
            return 1;
        } else if (arg0 == 6610) {
            field1062[++Statics.field1972 - 1] = client.method14().method5877();
            field1062[++Statics.field1972 - 1] = client.method14().method5878();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1062[--Statics.field1972];
            class27 var16 = client.method14().method5872(var15);
            if (var16 == null) {
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = var16.method268().method3669();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1062[--Statics.field1972];
            class27 var18 = client.method14().method5872(var17);
            if (var18 == null) {
                field1062[++Statics.field1972 - 1] = 0;
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = (var18.method263() - var18.method262() + 1) * 64;
                field1062[++Statics.field1972 - 1] = (var18.method289() - var18.method304() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1062[--Statics.field1972];
            class27 var20 = client.method14().method5872(var19);
            if (var20 == null) {
                field1062[++Statics.field1972 - 1] = 0;
                field1062[++Statics.field1972 - 1] = 0;
                field1062[++Statics.field1972 - 1] = 0;
                field1062[++Statics.field1972 - 1] = 0;
            } else {
                field1062[++Statics.field1972 - 1] = var20.method262() * 64;
                field1062[++Statics.field1972 - 1] = var20.method304() * 64;
                field1062[++Statics.field1972 - 1] = var20.method263() * 64 + 64 - 1;
                field1062[++Statics.field1972 - 1] = var20.method289() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1062[--Statics.field1972];
            class27 var22 = client.method14().method5872(var21);
            if (var22 == null) {
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = var22.method261();
            }
            return 1;
        } else if (arg0 == 6615) {
            class214 var23 = client.method14().method5879();
            if (var23 == null) {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = var23.field2502;
                field1062[++Statics.field1972 - 1] = var23.field2503;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1062[++Statics.field1972 - 1] = client.method14().method5874();
            return 1;
        } else if (arg0 == 6617) {
            class214 var24 = new class214(field1062[--Statics.field1972]);
            class27 var25 = client.method14().method5857();
            if (var25 == null) {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method253(var24.field2501, var24.field2502, var24.field2503);
            if (var26 == null) {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = var26[0];
                field1062[++Statics.field1972 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class214 var27 = new class214(field1062[--Statics.field1972]);
            class27 var28 = client.method14().method5857();
            if (var28 == null) {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = -1;
                return 1;
            }
            class214 var29 = var28.method254(var27.field2502, var27.field2503);
            if (var29 == null) {
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = var29.method3669();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1972 -= 2;
            int var30 = field1062[Statics.field1972];
            class214 var31 = new class214(field1062[Statics.field1972 + 1]);
            method324(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1972 -= 2;
            int var32 = field1062[Statics.field1972];
            class214 var33 = new class214(field1062[Statics.field1972 + 1]);
            method324(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1972 -= 2;
            int var34 = field1062[Statics.field1972];
            class214 var35 = new class214(field1062[Statics.field1972 + 1]);
            class27 var36 = client.method14().method5872(var34);
            if (var36 == null) {
                field1062[++Statics.field1972 - 1] = 0;
                return 1;
            } else {
                field1062[++Statics.field1972 - 1] = var36.method251(var35.field2501, var35.field2502, var35.field2503) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1062[++Statics.field1972 - 1] = client.method14().method5905();
            field1062[++Statics.field1972 - 1] = client.method14().method5881();
            return 1;
        } else if (arg0 == 6623) {
            class214 var37 = new class214(field1062[--Statics.field1972]);
            class27 var38 = client.method14().method5853(var37.field2501, var37.field2502, var37.field2503);
            if (var38 == null) {
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = var38.method315();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method14().method5882(field1062[--Statics.field1972]);
            return 1;
        } else if (arg0 == 6625) {
            client.method14().method5940();
            return 1;
        } else if (arg0 == 6626) {
            client.method14().method5974(field1062[--Statics.field1972]);
            return 1;
        } else if (arg0 == 6627) {
            client.method14().method5889();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1062[--Statics.field1972] == 1;
            client.method14().method5886(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1062[--Statics.field1972];
            client.method14().method5887(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1062[--Statics.field1972];
            client.method14().method5888(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method14().method5931();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1062[--Statics.field1972] == 1;
            client.method14().method5890(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1972 -= 2;
            int var43 = field1062[Statics.field1972];
            boolean var44 = field1062[Statics.field1972 + 1] == 1;
            client.method14().method5891(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1972 -= 2;
            int var45 = field1062[Statics.field1972];
            boolean var46 = field1062[Statics.field1972 + 1] == 1;
            client.method14().method5948(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1062[++Statics.field1972 - 1] = client.method14().method5844() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = client.method14().method5894(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1062[--Statics.field1972];
            field1062[++Statics.field1972 - 1] = client.method14().method5982(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1972 -= 2;
            int var49 = field1062[Statics.field1972];
            class214 var50 = new class214(field1062[Statics.field1972 + 1]);
            class214 var51 = client.method14().method5898(var49, var50);
            if (var51 == null) {
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = var51.method3669();
            }
            return 1;
        } else if (arg0 == 6639) {
            class35 var52 = client.method14().method5900();
            if (var52 == null) {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = var52.method166();
                field1062[++Statics.field1972 - 1] = var52.field290.method3669();
            }
            return 1;
        } else if (arg0 == 6640) {
            class35 var53 = client.method14().method5901();
            if (var53 == null) {
                field1062[++Statics.field1972 - 1] = -1;
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = var53.method166();
                field1062[++Statics.field1972 - 1] = var53.field290.method3669();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1062[--Statics.field1972];
            class242 var55 = class242.method481(var54);
            if (var55.field3194 == null) {
                field1063[++Statics.field1505 - 1] = "";
            } else {
                field1063[++Statics.field1505 - 1] = var55.field3194;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1062[--Statics.field1972];
            class242 var57 = class242.method481(var56);
            field1062[++Statics.field1972 - 1] = var57.field3193;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1062[--Statics.field1972];
            class242 var59 = class242.method481(var58);
            if (var59 == null) {
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = var59.field3188;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1062[--Statics.field1972];
            class242 var61 = class242.method481(var60);
            if (var61 == null) {
                field1062[++Statics.field1972 - 1] = -1;
            } else {
                field1062[++Statics.field1972 - 1] = var61.field3189;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1062[++Statics.field1972 - 1] = Statics.field272.field342;
            return 1;
        } else if (arg0 == 6698) {
            field1062[++Statics.field1972 - 1] = Statics.field272.field343.method3669();
            return 1;
        } else if (arg0 == 6699) {
            field1062[++Statics.field1972 - 1] = Statics.field272.field341.method3669();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dq.aa(II)V")
    public static void method2626(int arg0) {
        if (arg0 == -1 || !class218.method3214(arg0)) {
            return;
        }
        class218[] var1 = Statics.field3631[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3.field2658 != null) {
                class63 var4 = new class63();
                var4.field550 = var3;
                var4.field549 = var3.field2658;
                method891(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("at.aq(ILhj;ZI)V")
    public static void method324(int arg0, class214 arg1, boolean arg2) {
        class27 var3 = client.method14().method5872(arg0);
        int var4 = Statics.field2495.field609;
        int var5 = (Statics.field2495.field971 >> 7) + Statics.field20;
        int var6 = (Statics.field2495.field918 >> 7) + Statics.field553;
        class214 var7 = new class214(var4, var5, var6);
        client.method14().method6010(var3, var7, arg1, arg2);
    }
}
