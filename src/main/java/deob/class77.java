package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("be")
public class class77 {

    @ObfuscatedName("be.k")
    public static int[] field1097 = new int[5];

    @ObfuscatedName("be.l")
    public static int[][] field1101 = new int[5][5000];

    @ObfuscatedName("be.b")
    public static int[] field1099 = new int[1000];

    @ObfuscatedName("be.c")
    public static String[] field1094 = new String[1000];

    @ObfuscatedName("be.m")
    public static int field1110 = 0;

    @ObfuscatedName("be.u")
    public static class57[] field1102 = new class57[50];

    @ObfuscatedName("be.v")
    public static Calendar field1103 = Calendar.getInstance();

    @ObfuscatedName("be.y")
    public static final String[] field1098 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("be.a")
    public static boolean field1105 = false;

    @ObfuscatedName("be.j")
    public static boolean field1106 = false;

    @ObfuscatedName("be.t")
    public static int field1107 = 0;

    @ObfuscatedName("be.d")
    public static final double field1111 = Math.log(2.0D);

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gh.q(Lbb;B)V")
    public static void method3292(class63 arg0) {
        method2071(arg0, 500000);
    }

    @ObfuscatedName("cv.w(Lbb;II)V")
    public static void method2071(class63 arg0, int arg1) {
        Object[] var2 = arg0.field582;
        class93 var4;
        if (class295.method3306(arg0.field585)) {
            Statics.field122 = (class42) var2[0];
            class242 var3 = class242.method3753(Statics.field122.field356);
            var4 = class93.method1663(arg0.field585, var3.field3214, var3.field3231);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class93.method2690(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field1015 = 0;
        Statics.field2748 = 0;
        int var6 = -1;
        int[] var7 = var4.field1285;
        int[] var8 = var4.field1289;
        byte var9 = -1;
        field1110 = 0;
        field1105 = false;
        try {
            Statics.field1096 = new int[var4.field1284];
            int var10 = 0;
            Statics.field4033 = new String[var4.field1286];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field577;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field578;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field576 == null ? -1 : arg0.field576.field2689;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field579;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field576 == null ? -1 : arg0.field576.field2566;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field580 == null ? -1 : arg0.field580.field2689;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field580 == null ? -1 : arg0.field580.field2566;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field581;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field588;
                    }
                    Statics.field1096[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field583;
                    }
                    Statics.field4033[var11++] = var14;
                }
            }
            int var15 = 0;
            field1107 = arg0.field584;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1289[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method1798(var53, var4, var43);
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
                    field1099[++Statics.field1015 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1099[++Statics.field1015 - 1] = class213.field2526[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class213.field2526[var17] = field1099[--Statics.field1015];
                    client.method110(var17);
                } else if (var53 == 3) {
                    field1094[++Statics.field2748 - 1] = var4.field1287[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field1015 -= 2;
                    if (field1099[Statics.field1015] != field1099[Statics.field1015 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field1015 -= 2;
                    if (field1099[Statics.field1015] == field1099[Statics.field1015 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field1015 -= 2;
                    if (field1099[Statics.field1015] < field1099[Statics.field1015 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field1015 -= 2;
                    if (field1099[Statics.field1015] > field1099[Statics.field1015 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1110 == 0) {
                        return;
                    }
                    class57 var18 = field1102[--field1110];
                    var4 = var18.field524;
                    var7 = var4.field1285;
                    var8 = var4.field1289;
                    var6 = var18.field523;
                    Statics.field1096 = var18.field525;
                    Statics.field4033 = var18.field526;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1099[++Statics.field1015 - 1] = class213.method1099(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class213.method3236(var20, field1099[--Statics.field1015]);
                } else if (var53 == 31) {
                    Statics.field1015 -= 2;
                    if (field1099[Statics.field1015] <= field1099[Statics.field1015 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field1015 -= 2;
                    if (field1099[Statics.field1015] >= field1099[Statics.field1015 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1099[++Statics.field1015 - 1] = Statics.field1096[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field1096[var8[var6]] = field1099[--Statics.field1015];
                } else if (var53 == 35) {
                    field1094[++Statics.field2748 - 1] = Statics.field4033[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field4033[var8[var6]] = field1094[--Statics.field2748];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field2748 -= var21;
                    String var22 = class292.method4630(field1094, Statics.field2748, var21);
                    field1094[++Statics.field2748 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field1015--;
                } else if (var53 == 39) {
                    Statics.field2748--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class93 var24 = class93.method2690(var23);
                    int[] var25 = new int[var24.field1284];
                    String[] var26 = new String[var24.field1286];
                    for (int var27 = 0; var27 < var24.field1290; var27++) {
                        var25[var27] = field1099[Statics.field1015 - var24.field1290 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1291; var28++) {
                        var26[var28] = field1094[Statics.field2748 - var24.field1291 + var28];
                    }
                    Statics.field1015 -= var24.field1290;
                    Statics.field2748 -= var24.field1291;
                    class57 var29 = new class57();
                    var29.field524 = var4;
                    var29.field523 = var6;
                    var29.field525 = Statics.field1096;
                    var29.field526 = Statics.field4033;
                    field1102[++field1110 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1285;
                    var8 = var24.field1289;
                    var6 = -1;
                    Statics.field1096 = var25;
                    Statics.field4033 = var26;
                } else if (var53 == 42) {
                    field1099[++Statics.field1015 - 1] = Statics.field2058.method1905(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field2058.method1921(var8[var6], field1099[--Statics.field1015]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1099[--Statics.field1015];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1097[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1101[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1099[--Statics.field1015];
                    if (var36 < 0 || var36 >= field1097[var35]) {
                        throw new RuntimeException();
                    }
                    field1099[++Statics.field1015 - 1] = field1101[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field1015 -= 2;
                    int var38 = field1099[Statics.field1015];
                    if (var38 < 0 || var38 >= field1097[var37]) {
                        throw new RuntimeException();
                    }
                    field1101[var37][var38] = field1099[Statics.field1015 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field2058.method1954(var8[var6]);
                    if (var39 == null) {
                        var39 = class225.field2772;
                    }
                    field1094[++Statics.field2748 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field2058.method1945(var8[var6], field1094[--Statics.field2748]);
                } else if (var53 == 49) {
                    String var40 = Statics.field2058.method1907(var8[var6]);
                    field1094[++Statics.field2748 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field2058.method1934(var8[var6], field1094[--Statics.field2748]);
                } else if (var53 == 60) {
                    class317 var41 = var4.field1288[var8[var6]];
                    class180 var42 = (class180) var41.method5451((long) field1099[--Statics.field1015]);
                    if (var42 != null) {
                        var6 += var42.field2112;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2114).append(" ");
            for (int var47 = field1110 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1102[var47].field524.field2114).append(" ");
            }
            var46.append("").append(var9);
            class342.method4173(var46.toString(), var51);
        } finally {
            if (field1105) {
                field1106 = true;
                client.method59();
                field1106 = false;
                field1105 = false;
            }
        }
    }

    @ObfuscatedName("cf.e(ILcx;ZI)I")
    public static int method1798(int arg0, class93 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method2807(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2993(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method1815(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method268(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method3100(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method1774(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method133(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method1813(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method3194(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method3768(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method962(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2993(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method1815(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method268(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method3100(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method1774(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method989(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method2486(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method3025(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method4050(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method962(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method480(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method3803(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method484(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method1037(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method479(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method1652(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method4149(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method3578(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method4897(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method1588(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method3147(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method225(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method579(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method226(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3376(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method100(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ej.p(ILcx;ZI)I")
    public static int method2807(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1015 -= 3;
            int var3 = field1099[Statics.field1015];
            int var4 = field1099[Statics.field1015 + 1];
            int var5 = field1099[Statics.field1015 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class218 var6 = class218.method1799(var3);
            if (var6.field2676 == null) {
                var6.field2676 = new class218[var5 + 1];
            }
            if (var6.field2676.length <= var5) {
                class218[] var7 = new class218[var5 + 1];
                for (int var8 = 0; var8 < var6.field2676.length; var8++) {
                    var7[var8] = var6.field2676[var8];
                }
                var6.field2676 = var7;
            }
            if (var5 > 0 && var6.field2676[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class218 var9 = new class218();
            var9.field2567 = var4;
            var9.field2584 = var9.field2689 = var6.field2689;
            var9.field2566 = var5;
            var9.field2564 = true;
            var6.field2676[var5] = var9;
            if (arg2) {
                Statics.field1112 = var9;
            } else {
                Statics.field2508 = var9;
            }
            client.method3755(var6);
            return 1;
        } else if (arg0 == 101) {
            class218 var10 = arg2 ? Statics.field1112 : Statics.field2508;
            class218 var11 = class218.method1799(var10.field2689);
            var11.field2676[var10.field2566] = null;
            client.method3755(var11);
            return 1;
        } else if (arg0 == 102) {
            class218 var12 = class218.method1799(field1099[--Statics.field1015]);
            var12.field2676 = null;
            client.method3755(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1015 -= 2;
            int var13 = field1099[Statics.field1015];
            int var14 = field1099[Statics.field1015 + 1];
            class218 var15 = class218.method1488(var13, var14);
            if (var15 == null || var14 == -1) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = 1;
                if (arg2) {
                    Statics.field1112 = var15;
                } else {
                    Statics.field2508 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class218 var16 = class218.method1799(field1099[--Statics.field1015]);
            if (var16 == null) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = 1;
                if (arg2) {
                    Statics.field1112 = var16;
                } else {
                    Statics.field2508 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eu.k(ILcx;ZB)I")
    public static int method2993(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1099[--Statics.field1015];
            var4 = class218.method1799(var3);
        } else {
            var4 = arg2 ? Statics.field1112 : Statics.field2508;
        }
        if (arg0 == 1000) {
            Statics.field1015 -= 4;
            var4.field2652 = field1099[Statics.field1015];
            var4.field2575 = field1099[Statics.field1015 + 1];
            var4.field2695 = field1099[Statics.field1015 + 2];
            var4.field2571 = field1099[Statics.field1015 + 3];
            client.method3755(var4);
            Statics.field234.method1117(var4);
            if (var3 != -1 && var4.field2567 == 0) {
                client.method357(Statics.field2557[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1015 -= 4;
            var4.field2671 = field1099[Statics.field1015];
            var4.field2577 = field1099[Statics.field1015 + 1];
            var4.field2639 = field1099[Statics.field1015 + 2];
            var4.field2573 = field1099[Statics.field1015 + 3];
            client.method3755(var4);
            Statics.field234.method1117(var4);
            if (var3 != -1 && var4.field2567 == 0) {
                client.method357(Statics.field2557[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1099[--Statics.field1015] == 1;
            if (var4.field2707 != var5) {
                var4.field2707 = var5;
                client.method3755(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2581 = field1099[--Statics.field1015] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2698 = field1099[--Statics.field1015] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cy.l(ILcx;ZI)I")
    public static int method1815(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1099[--Statics.field1015];
            var4 = class218.method1799(var3);
        } else {
            var4 = arg2 ? Statics.field1112 : Statics.field2508;
        }
        if (arg0 == 1100) {
            Statics.field1015 -= 2;
            var4.field2586 = field1099[Statics.field1015];
            if (var4.field2586 > var4.field2688 - var4.field2580) {
                var4.field2586 = var4.field2688 - var4.field2580;
            }
            if (var4.field2586 < 0) {
                var4.field2586 = 0;
            }
            var4.field2587 = field1099[Statics.field1015 + 1];
            if (var4.field2587 > var4.field2570 - var4.field2668) {
                var4.field2587 = var4.field2570 - var4.field2668;
            }
            if (var4.field2587 < 0) {
                var4.field2587 = 0;
            }
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2696 = field1099[--Statics.field1015];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2572 = field1099[--Statics.field1015] == 1;
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2596 = field1099[--Statics.field1015];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2598 = field1099[--Statics.field1015];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2600 = field1099[--Statics.field1015];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2592 = field1099[--Statics.field1015];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2614 = field1099[--Statics.field1015] == 1;
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2608 = 1;
            var4.field2650 = field1099[--Statics.field1015];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1015 -= 6;
            var4.field2594 = field1099[Statics.field1015];
            var4.field2615 = field1099[Statics.field1015 + 1];
            var4.field2616 = field1099[Statics.field1015 + 2];
            var4.field2617 = field1099[Statics.field1015 + 3];
            var4.field2641 = field1099[Statics.field1015 + 4];
            var4.field2619 = field1099[Statics.field1015 + 5];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1099[--Statics.field1015];
            if (var4.field2612 != var5) {
                var4.field2612 = var5;
                var4.field2693 = 0;
                var4.field2585 = 0;
                client.method3755(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2622 = field1099[--Statics.field1015] == 1;
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1094[--Statics.field2748];
            if (!var6.equals(var4.field2602)) {
                var4.field2602 = var6;
                client.method3755(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2625 = field1099[--Statics.field1015];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1015 -= 3;
            var4.field2629 = field1099[Statics.field1015];
            var4.field2630 = field1099[Statics.field1015 + 1];
            var4.field2628 = field1099[Statics.field1015 + 2];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2660 = field1099[--Statics.field1015] == 1;
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2560 = field1099[--Statics.field1015];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2605 = field1099[--Statics.field1015];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2606 = field1099[--Statics.field1015] == 1;
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2607 = field1099[--Statics.field1015] == 1;
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1015 -= 2;
            var4.field2688 = field1099[Statics.field1015];
            var4.field2570 = field1099[Statics.field1015 + 1];
            client.method3755(var4);
            if (var3 != -1 && var4.field2567 == 0) {
                client.method357(Statics.field2557[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method948(var4.field2689, var4.field2566);
            client.field851 = var4;
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2601 = field1099[--Statics.field1015];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2640 = field1099[--Statics.field1015];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2597 = field1099[--Statics.field1015];
            client.method3755(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1099[--Statics.field1015];
            class324 var8 = (class324) class196.method2257(class324.method2205(), var7);
            if (var8 != null) {
                var4.field2694 = var8;
                client.method3755(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1099[--Statics.field1015] == 1;
            var4.field2599 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1099[--Statics.field1015] == 1;
            var4.field2565 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.b(ILcx;ZB)I")
    public static int method268(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method1799(field1099[--Statics.field1015]);
        } else {
            var3 = arg2 ? Statics.field1112 : Statics.field2508;
        }
        client.method3755(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1015 -= 2;
            int var4 = field1099[Statics.field1015];
            int var5 = field1099[Statics.field1015 + 1];
            var3.field2691 = var4;
            var3.field2656 = var5;
            class255 var6 = class255.method348(var4);
            var3.field2616 = var6.field3419;
            var3.field2617 = var6.field3448;
            var3.field2641 = var6.field3421;
            var3.field2594 = var6.field3407;
            var3.field2615 = var6.field3422;
            var3.field2619 = var6.field3423;
            if (arg0 == 1205) {
                var3.field2704 = 0;
            } else if (arg0 == 1212 | var6.field3424 == 1) {
                var3.field2704 = 1;
            } else {
                var3.field2704 = 2;
            }
            if (var3.field2620 > 0) {
                var3.field2619 = var3.field2619 * 32 / var3.field2620;
            } else if (var3.field2671 > 0) {
                var3.field2619 = var3.field2619 * 32 / var3.field2671;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2608 = 2;
            var3.field2650 = field1099[--Statics.field1015];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2608 = 3;
            var3.field2650 = Statics.field658.field614.method3631();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eh.i(ILcx;ZS)I")
    public static int method3100(int arg0, class93 arg1, boolean arg2) {
        boolean var3 = true;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class218.method1799(field1099[--Statics.field1015]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field1112 : Statics.field2508;
        }
        if (arg0 == 1300) {
            int var5 = field1099[--Statics.field1015] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3678(var5, field1094[--Statics.field2748]);
                return 1;
            } else {
                Statics.field2748--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1015 -= 2;
            int var6 = field1099[Statics.field1015];
            int var7 = field1099[Statics.field1015 + 1];
            var4.field2646 = class218.method1488(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2649 = field1099[--Statics.field1015] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2647 = field1099[--Statics.field1015];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2648 = field1099[--Statics.field1015];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2644 = field1094[--Statics.field2748];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2658 = field1094[--Statics.field2748];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2645 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2692 = field1099[--Statics.field1015] == 1;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1015 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1099[Statics.field1015 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1099[Statics.field1015 + var10];
                        var9[var10 / 2] = (byte) field1099[Statics.field1015 + var10 + 1];
                    }
                }
            } else {
                Statics.field1015 -= 2;
                var8 = new byte[] { (byte) field1099[Statics.field1015] };
                var9 = new byte[] { (byte) field1099[Statics.field1015 + 1] };
            }
            int var11 = field1099[--Statics.field1015] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method4371(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1015 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1099[Statics.field1015] };
            byte[] var14 = new byte[] { (byte) field1099[Statics.field1015 + 1] };
            method4371(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1015 -= 3;
            int var15 = field1099[Statics.field1015] - 1;
            int var16 = field1099[Statics.field1015 + 1];
            int var17 = field1099[Statics.field1015 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method139(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1099[--Statics.field1015];
            int var20 = field1099[--Statics.field1015];
            method139(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1015--;
            int var21 = field1099[Statics.field1015] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method508(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method508(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("it.c(Lhj;I[B[BI)V")
    public static final void method4371(class218 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2651 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2651 = new byte[11][];
            arg0.field2626 = new byte[11][];
            arg0.field2642 = new int[11];
            arg0.field2589 = new int[11];
        }
        arg0.field2651[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2705 = false;
            for (int var4 = 0; var4 < arg0.field2651.length; var4++) {
                if (arg0.field2651[var4] != null) {
                    arg0.field2705 = true;
                    break;
                }
            }
        } else {
            arg0.field2705 = true;
        }
        arg0.field2626[arg1] = arg3;
    }

    @ObfuscatedName("v.u(Lhj;IIII)V")
    public static final void method139(class218 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2642 == null) {
            throw new RuntimeException();
        }
        arg0.field2642[arg1] = arg2;
        arg0.field2589[arg1] = arg3;
    }

    @ObfuscatedName("ae.x(Lhj;IB)V")
    public static final void method508(class218 arg0, int arg1) {
        if (arg0.field2651 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2579 == null) {
            arg0.field2579 = new int[arg0.field2651.length];
        }
        arg0.field2579[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ba.r(ILcx;ZS)I")
    public static int method1774(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method1799(field1099[--Statics.field1015]);
        } else {
            var3 = arg2 ? Statics.field1112 : Statics.field2508;
        }
        String var4 = field1094[--Statics.field2748];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1099[--Statics.field1015];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1099[--Statics.field1015];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1094[--Statics.field2748];
            } else {
                var7[var8] = Integer.valueOf(field1099[--Statics.field1015]);
            }
        }
        int var9 = field1099[--Statics.field1015];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2653 = var7;
        } else if (arg0 == 1401) {
            var3.field2638 = var7;
        } else if (arg0 == 1402) {
            var3.field2655 = var7;
        } else if (arg0 == 1403) {
            var3.field2609 = var7;
        } else if (arg0 == 1404) {
            var3.field2659 = var7;
        } else if (arg0 == 1405) {
            var3.field2621 = var7;
        } else if (arg0 == 1406) {
            var3.field2663 = var7;
        } else if (arg0 == 1407) {
            var3.field2627 = var7;
            var3.field2665 = var5;
        } else if (arg0 == 1408) {
            var3.field2603 = var7;
        } else if (arg0 == 1409) {
            var3.field2657 = var7;
        } else if (arg0 == 1410) {
            var3.field2661 = var7;
        } else if (arg0 == 1411) {
            var3.field2654 = var7;
        } else if (arg0 == 1412) {
            var3.field2582 = var7;
        } else if (arg0 == 1414) {
            var3.field2666 = var7;
            var3.field2667 = var5;
        } else if (arg0 == 1415) {
            var3.field2595 = var7;
            var3.field2669 = var5;
        } else if (arg0 == 1416) {
            var3.field2662 = var7;
        } else if (arg0 == 1417) {
            var3.field2672 = var7;
        } else if (arg0 == 1418) {
            var3.field2673 = var7;
        } else if (arg0 == 1419) {
            var3.field2674 = var7;
        } else if (arg0 == 1420) {
            var3.field2675 = var7;
        } else if (arg0 == 1421) {
            var3.field2624 = var7;
        } else if (arg0 == 1422) {
            var3.field2677 = var7;
        } else if (arg0 == 1423) {
            var3.field2678 = var7;
        } else if (arg0 == 1424) {
            var3.field2679 = var7;
        } else if (arg0 == 1425) {
            var3.field2623 = var7;
        } else if (arg0 == 1426) {
            var3.field2682 = var7;
        } else if (arg0 == 1427) {
            var3.field2680 = var7;
        } else {
            return 2;
        }
        var3.field2552 = true;
        return 1;
    }

    @ObfuscatedName("x.v(ILcx;ZI)I")
    public static int method133(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1112 : Statics.field2508;
        if (arg0 == 1500) {
            field1099[++Statics.field1015 - 1] = var3.field2578;
            return 1;
        } else if (arg0 == 1501) {
            field1099[++Statics.field1015 - 1] = var3.field2700;
            return 1;
        } else if (arg0 == 1502) {
            field1099[++Statics.field1015 - 1] = var3.field2580;
            return 1;
        } else if (arg0 == 1503) {
            field1099[++Statics.field1015 - 1] = var3.field2668;
            return 1;
        } else if (arg0 == 1504) {
            field1099[++Statics.field1015 - 1] = var3.field2707 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1099[++Statics.field1015 - 1] = var3.field2584;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cn.y(ILcx;ZI)I")
    public static int method1813(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1112 : Statics.field2508;
        if (arg0 == 1600) {
            field1099[++Statics.field1015 - 1] = var3.field2586;
            return 1;
        } else if (arg0 == 1601) {
            field1099[++Statics.field1015 - 1] = var3.field2587;
            return 1;
        } else if (arg0 == 1602) {
            field1094[++Statics.field2748 - 1] = var3.field2602;
            return 1;
        } else if (arg0 == 1603) {
            field1099[++Statics.field1015 - 1] = var3.field2688;
            return 1;
        } else if (arg0 == 1604) {
            field1099[++Statics.field1015 - 1] = var3.field2570;
            return 1;
        } else if (arg0 == 1605) {
            field1099[++Statics.field1015 - 1] = var3.field2619;
            return 1;
        } else if (arg0 == 1606) {
            field1099[++Statics.field1015 - 1] = var3.field2616;
            return 1;
        } else if (arg0 == 1607) {
            field1099[++Statics.field1015 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 1608) {
            field1099[++Statics.field1015 - 1] = var3.field2617;
            return 1;
        } else if (arg0 == 1609) {
            field1099[++Statics.field1015 - 1] = var3.field2596;
            return 1;
        } else if (arg0 == 1610) {
            field1099[++Statics.field1015 - 1] = var3.field2597;
            return 1;
        } else if (arg0 == 1611) {
            field1099[++Statics.field1015 - 1] = var3.field2696;
            return 1;
        } else if (arg0 == 1612) {
            field1099[++Statics.field1015 - 1] = var3.field2640;
            return 1;
        } else if (arg0 == 1613) {
            field1099[++Statics.field1015 - 1] = var3.field2694.method30();
            return 1;
        } else if (arg0 == 1614) {
            field1099[++Statics.field1015 - 1] = var3.field2565 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fy.g(ILcx;ZI)I")
    public static int method3194(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1112 : Statics.field2508;
        if (arg0 == 1700) {
            field1099[++Statics.field1015 - 1] = var3.field2691;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2691 == -1) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = var3.field2656;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1099[++Statics.field1015 - 1] = var3.field2566;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hl.a(ILcx;ZI)I")
    public static int method3768(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field1112 : Statics.field2508;
        if (arg0 == 1800) {
            field1099[++Statics.field1015 - 1] = class219.method1787(client.method4602(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1099[--Statics.field1015];
            int var5 = var4 - 1;
            if (var3.field2645 == null || var5 >= var3.field2645.length || var3.field2645[var5] == null) {
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1094[++Statics.field2748 - 1] = var3.field2645[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2644 == null) {
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1094[++Statics.field2748 - 1] = var3.field2644;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.j(ILcx;ZB)I")
    public static int method962(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method1799(field1099[--Statics.field1015]);
        } else {
            var3 = arg2 ? Statics.field1112 : Statics.field2508;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1107 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2680 == null) {
            return 0;
        } else {
            class63 var4 = new class63();
            var4.field576 = var3;
            var4.field582 = var3.field2680;
            var4.field584 = field1107 + 1;
            client.field855.method4532(var4);
            return 1;
        }
    }

    @ObfuscatedName("bb.o(ILcx;ZI)I")
    public static int method989(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method1799(field1099[--Statics.field1015]);
        if (arg0 == 2500) {
            field1099[++Statics.field1015 - 1] = var3.field2578;
            return 1;
        } else if (arg0 == 2501) {
            field1099[++Statics.field1015 - 1] = var3.field2700;
            return 1;
        } else if (arg0 == 2502) {
            field1099[++Statics.field1015 - 1] = var3.field2580;
            return 1;
        } else if (arg0 == 2503) {
            field1099[++Statics.field1015 - 1] = var3.field2668;
            return 1;
        } else if (arg0 == 2504) {
            field1099[++Statics.field1015 - 1] = var3.field2707 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1099[++Statics.field1015 - 1] = var3.field2584;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("do.d(ILcx;ZI)I")
    public static int method2486(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method1799(field1099[--Statics.field1015]);
        if (arg0 == 2600) {
            field1099[++Statics.field1015 - 1] = var3.field2586;
            return 1;
        } else if (arg0 == 2601) {
            field1099[++Statics.field1015 - 1] = var3.field2587;
            return 1;
        } else if (arg0 == 2602) {
            field1094[++Statics.field2748 - 1] = var3.field2602;
            return 1;
        } else if (arg0 == 2603) {
            field1099[++Statics.field1015 - 1] = var3.field2688;
            return 1;
        } else if (arg0 == 2604) {
            field1099[++Statics.field1015 - 1] = var3.field2570;
            return 1;
        } else if (arg0 == 2605) {
            field1099[++Statics.field1015 - 1] = var3.field2619;
            return 1;
        } else if (arg0 == 2606) {
            field1099[++Statics.field1015 - 1] = var3.field2616;
            return 1;
        } else if (arg0 == 2607) {
            field1099[++Statics.field1015 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 2608) {
            field1099[++Statics.field1015 - 1] = var3.field2617;
            return 1;
        } else if (arg0 == 2609) {
            field1099[++Statics.field1015 - 1] = var3.field2596;
            return 1;
        } else if (arg0 == 2610) {
            field1099[++Statics.field1015 - 1] = var3.field2597;
            return 1;
        } else if (arg0 == 2611) {
            field1099[++Statics.field1015 - 1] = var3.field2696;
            return 1;
        } else if (arg0 == 2612) {
            field1099[++Statics.field1015 - 1] = var3.field2640;
            return 1;
        } else if (arg0 == 2613) {
            field1099[++Statics.field1015 - 1] = var3.field2694.method30();
            return 1;
        } else if (arg0 == 2614) {
            field1099[++Statics.field1015 - 1] = var3.field2565 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ez.s(ILcx;ZI)I")
    public static int method3025(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class218 var3 = class218.method1799(field1099[--Statics.field1015]);
            field1099[++Statics.field1015 - 1] = var3.field2691;
            return 1;
        } else if (arg0 == 2701) {
            class218 var4 = class218.method1799(field1099[--Statics.field1015]);
            if (var4.field2691 == -1) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = var4.field2656;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1099[--Statics.field1015];
            class62 var6 = (class62) client.field817.method5479((long) var5);
            if (var6 == null) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1099[++Statics.field1015 - 1] = client.field906;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ic.z(ILcx;ZI)I")
    public static int method4050(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method1799(field1099[--Statics.field1015]);
        if (arg0 == 2800) {
            field1099[++Statics.field1015 - 1] = class219.method1787(client.method4602(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1099[--Statics.field1015];
            int var5 = var4 - 1;
            if (var3.field2645 == null || var5 >= var3.field2645.length || var3.field2645[var5] == null) {
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1094[++Statics.field2748 - 1] = var3.field2645[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2644 == null) {
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1094[++Statics.field2748 - 1] = var3.field2644;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.al(ILcx;ZB)I")
    public static int method480(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1094[--Statics.field2748];
            class92.method994(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1015 -= 2;
            client.method1001(Statics.field658, field1099[Statics.field1015], field1099[Statics.field1015 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1106) {
                field1105 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1094[--Statics.field2748];
            int var5 = 0;
            if (class292.method3352(var4)) {
                var5 = class292.method29(var4);
            }
            class188 var6 = class188.method3894(class184.field2221, client.field881.field1314);
            var6.field2334.method5054(var5);
            client.field881.method2023(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1094[--Statics.field2748];
            class188 var8 = class188.method3894(class184.field2299, client.field881.field1314);
            var8.field2334.method5228(var7.length() + 1);
            var8.field2334.method5058(var7);
            client.field881.method2023(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1094[--Statics.field2748];
            class188 var10 = class188.method3894(class184.field2212, client.field881.field1314);
            var10.field2334.method5228(var9.length() + 1);
            var10.field2334.method5058(var9);
            client.field881.method2023(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1099[--Statics.field1015];
            String var12 = field1094[--Statics.field2748];
            client.method1809(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1015 -= 3;
            int var13 = field1099[Statics.field1015];
            int var14 = field1099[Statics.field1015 + 1];
            int var15 = field1099[Statics.field1015 + 2];
            class218 var16 = class218.method1799(var15);
            Statics.method980(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1015 -= 2;
            int var17 = field1099[Statics.field1015];
            int var18 = field1099[Statics.field1015 + 1];
            class218 var19 = arg2 ? Statics.field1112 : Statics.field2508;
            Statics.method980(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field414 = field1099[--Statics.field1015] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1099[++Statics.field1015 - 1] = Statics.field118.field1061 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field118.field1061 = field1099[--Statics.field1015] == 1;
            class74.method2072();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1094[--Statics.field2748];
            boolean var21 = field1099[--Statics.field1015] == 1;
            class52.method36(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1099[--Statics.field1015];
            class188 var23 = class188.method3894(class184.field2246, client.field881.field1314);
            var23.field2334.method5052(var22);
            client.field881.method2023(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1099[--Statics.field1015];
            Statics.field2748 -= 2;
            String var25 = field1094[Statics.field2748];
            String var26 = field1094[Statics.field2748 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class188 var27 = class188.method3894(class184.field2220, client.field881.field1314);
                var27.field2334.method5052(1 + class301.method3582(var25) + class301.method3582(var26));
                var27.field2334.method5058(var25);
                var27.field2334.method5228(var24);
                var27.field2334.method5058(var26);
                client.field881.method2023(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field801 = field1099[--Statics.field1015] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field803 = field1099[--Statics.field1015] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field774 = field1099[--Statics.field1015] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1099[--Statics.field1015] == 1) {
                client.field775 |= 0x1;
            } else {
                client.field775 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1099[--Statics.field1015] == 1) {
                client.field775 |= 0x2;
            } else {
                client.field775 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1099[--Statics.field1015] == 1) {
                client.field775 |= 0x4;
            } else {
                client.field775 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1099[--Statics.field1015] == 1) {
                client.field775 |= 0x8;
            } else {
                client.field775 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field775 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field759 = field1099[--Statics.field1015] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field785 = field1099[--Statics.field1015] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method3126(field1099[--Statics.field1015] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1099[++Statics.field1015 - 1] = Statics.method990() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1015 -= 2;
            client.field734 = field1099[Statics.field1015];
            client.field735 = field1099[Statics.field1015 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1015 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1015--;
            return 1;
        } else if (arg0 == 3132) {
            field1099[++Statics.field1015 - 1] = Statics.field47;
            field1099[++Statics.field1015 - 1] = Statics.field3309;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1015--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1015 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field818 = 3;
            client.field819 = field1099[--Statics.field1015];
            return 1;
        } else if (arg0 == 3137) {
            client.field818 = 2;
            client.field819 = field1099[--Statics.field1015];
            return 1;
        } else if (arg0 == 3138) {
            client.field818 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field818 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field818 = 3;
            client.field819 = arg2 ? Statics.field1112.field2689 : Statics.field2508.field2689;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1099[--Statics.field1015] == 1;
            Statics.field118.field1067 = var28;
            class74.method2072();
            return 1;
        } else if (arg0 == 3142) {
            field1099[++Statics.field1015 - 1] = Statics.field118.field1067 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1099[--Statics.field1015] == 1;
            client.field692 = var29;
            if (!var29) {
                Statics.field118.field1066 = "";
                class74.method2072();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1099[++Statics.field1015 - 1] = client.field692 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1099[--Statics.field1015] == 1;
            if (Statics.field118.field1064 == var30) {
                Statics.field118.field1064 = !var30;
                class74.method2072();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1099[++Statics.field1015 - 1] = Statics.field118.field1064 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1099[++Statics.field1015 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1099[++Statics.field1015 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1099[++Statics.field1015 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1099[++Statics.field1015 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1099[++Statics.field1015 - 1] = class86.field1189;
            return 1;
        } else if (arg0 == 3154) {
            field1099[++Statics.field1015 - 1] = client.method4779();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1015 -= 2;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hp.av(ILcx;ZI)I")
    public static int method3803(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1015 -= 3;
            client.method1810(field1099[Statics.field1015], field1099[Statics.field1015 + 1], field1099[Statics.field1015 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method79(field1099[--Statics.field1015]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1015 -= 2;
            client.method174(field1099[Statics.field1015], field1099[Statics.field1015 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ag.as(ILcx;ZI)I")
    public static int method484(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1099[++Statics.field1015 - 1] = client.field882;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1015 -= 2;
            int var3 = field1099[Statics.field1015];
            int var4 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = class60.method254(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1015 -= 2;
            int var5 = field1099[Statics.field1015];
            int var6 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = class60.method18(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1015 -= 2;
            int var7 = field1099[Statics.field1015];
            int var8 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = class60.method6044(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = class240.method3228(var9).field3202;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = client.field761[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = client.field788[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = client.field789[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field373;
            int var14 = (Statics.field658.field1006 >> 7) + Statics.field2390;
            int var15 = (Statics.field658.field950 >> 7) + Statics.field2;
            field1099[++Statics.field1015 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1099[++Statics.field1015 - 1] = client.field656 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1015 -= 2;
            int var19 = field1099[Statics.field1015] + 32768;
            int var20 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = class60.method254(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1015 -= 2;
            int var21 = field1099[Statics.field1015] + 32768;
            int var22 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = class60.method18(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1015 -= 2;
            int var23 = field1099[Statics.field1015] + 32768;
            int var24 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = class60.method6044(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field891 >= 2) {
                field1099[++Statics.field1015 - 1] = client.field891;
            } else {
                field1099[++Statics.field1015 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1099[++Statics.field1015 - 1] = client.field670;
            return 1;
        } else if (arg0 == 3318) {
            field1099[++Statics.field1015 - 1] = client.field808;
            return 1;
        } else if (arg0 == 3321) {
            field1099[++Statics.field1015 - 1] = client.field911;
            return 1;
        } else if (arg0 == 3322) {
            field1099[++Statics.field1015 - 1] = client.field824;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field827) {
                field1099[++Statics.field1015 - 1] = 1;
            } else {
                field1099[++Statics.field1015 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1099[++Statics.field1015 - 1] = client.field654;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1015 -= 4;
            int var25 = field1099[Statics.field1015];
            int var26 = field1099[Statics.field1015 + 1];
            int var27 = field1099[Statics.field1015 + 2];
            int var28 = field1099[Statics.field1015 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1099[++Statics.field1015 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.aw(ILcx;ZI)I")
    public static int method1037(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1015 -= 2;
            int var3 = field1099[Statics.field1015];
            int var4 = field1099[Statics.field1015 + 1];
            class252 var5 = class252.method2995(var3);
            if (var5.field3322 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3321; var6++) {
                if (var5.field3317[var6] == var4) {
                    field1094[++Statics.field2748 - 1] = var5.field3324[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1094[++Statics.field2748 - 1] = var5.field3319;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1015 -= 4;
            int var7 = field1099[Statics.field1015];
            int var8 = field1099[Statics.field1015 + 1];
            int var9 = field1099[Statics.field1015 + 2];
            int var10 = field1099[Statics.field1015 + 3];
            class252 var11 = class252.method2995(var9);
            if (var11.field3318 != var7 || var11.field3322 != var8) {
                if (var8 == 115) {
                    field1094[++Statics.field2748 - 1] = class225.field2772;
                } else {
                    field1099[++Statics.field1015 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3321; var12++) {
                if (var11.field3317[var12] == var10) {
                    if (var8 == 115) {
                        field1094[++Statics.field2748 - 1] = var11.field3324[var12];
                    } else {
                        field1099[++Statics.field1015 - 1] = var11.field3323[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1094[++Statics.field2748 - 1] = var11.field3319;
                } else {
                    field1099[++Statics.field1015 - 1] = var11.field3320;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1099[--Statics.field1015];
            class252 var14 = class252.method2995(var13);
            field1099[++Statics.field1015 - 1] = var14.method4152();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.ad(ILcx;ZI)I")
    public static int method479(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field547.field1077 == 0) {
                field1099[++Statics.field1015 - 1] = -2;
            } else if (Statics.field547.field1077 == 1) {
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = Statics.field547.field1071.method4694();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1099[--Statics.field1015];
            if (Statics.field547.method1626() && var3 >= 0 && var3 < Statics.field547.field1071.method4694()) {
                class285 var4 = (class285) Statics.field547.field1071.method4759(var3);
                field1094[++Statics.field2748 - 1] = var4.method4657();
                field1094[++Statics.field2748 - 1] = var4.method4658();
            } else {
                field1094[++Statics.field2748 - 1] = "";
                field1094[++Statics.field2748 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1099[--Statics.field1015];
            if (Statics.field547.method1626() && var5 >= 0 && var5 < Statics.field547.field1071.method4694()) {
                field1099[++Statics.field1015 - 1] = ((class280) Statics.field547.field1071.method4759(var5)).field3637;
            } else {
                field1099[++Statics.field1015 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1099[--Statics.field1015];
            if (Statics.field547.method1626() && var6 >= 0 && var6 < Statics.field547.field1071.method4694()) {
                field1099[++Statics.field1015 - 1] = ((class280) Statics.field547.field1071.method4759(var6)).field3635;
            } else {
                field1099[++Statics.field1015 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1094[--Statics.field2748];
            int var8 = field1099[--Statics.field1015];
            class75.method145(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1094[--Statics.field2748];
            Statics.field547.method1645(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1094[--Statics.field2748];
            Statics.field547.method1605(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1094[--Statics.field2748];
            Statics.field547.method1603(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1094[--Statics.field2748];
            Statics.field547.method1606(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1094[--Statics.field2748];
            String var14 = client.method80(var13);
            field1099[++Statics.field1015 - 1] = Statics.field547.method1599(new class284(var14, Statics.field354), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field411 == null) {
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1094[++Statics.field2748 - 1] = Statics.field411.field3656;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field411 == null) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = Statics.field411.method4694();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1099[--Statics.field1015];
            if (Statics.field411 == null || var15 >= Statics.field411.method4694()) {
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1094[++Statics.field2748 - 1] = Statics.field411.method4759(var15).method4656().method4790();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1099[--Statics.field1015];
            if (Statics.field411 == null || var16 >= Statics.field411.method4694()) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = ((class280) Statics.field411.method4759(var16)).method4767();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1099[--Statics.field1015];
            if (Statics.field411 == null || var17 >= Statics.field411.method4694()) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = ((class280) Statics.field411.method4759(var17)).field3635;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1099[++Statics.field1015 - 1] = Statics.field411 == null ? 0 : Statics.field411.field3658;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1094[--Statics.field2748];
            client.method2599(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1099[++Statics.field1015 - 1] = Statics.field411 == null ? 0 : Statics.field411.field3654;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1094[--Statics.field2748];
            client.method1032(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method951();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field547.method1626()) {
                field1099[++Statics.field1015 - 1] = Statics.field547.field1072.method4694();
            } else {
                field1099[++Statics.field1015 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1099[--Statics.field1015];
            if (Statics.field547.method1626() && var20 >= 0 && var20 < Statics.field547.field1072.method4694()) {
                class279 var21 = (class279) Statics.field547.field1072.method4759(var20);
                field1094[++Statics.field2748 - 1] = var21.method4657();
                field1094[++Statics.field2748 - 1] = var21.method4658();
            } else {
                field1094[++Statics.field2748 - 1] = "";
                field1094[++Statics.field2748 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1094[--Statics.field2748];
            String var23 = client.method80(var22);
            field1099[++Statics.field1015 - 1] = Statics.field547.method1600(new class284(var23, Statics.field354)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1099[--Statics.field1015];
            if (Statics.field411 == null || var24 >= Statics.field411.method4694() || !Statics.field411.method4759(var24).method4656().equals(Statics.field658.field622)) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field411 == null || Statics.field411.field3657 == null) {
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1094[++Statics.field2748 - 1] = Statics.field411.field3657;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1099[--Statics.field1015];
            if (Statics.field411 == null || var25 >= Statics.field411.method4694() || !((class274) Statics.field411.method4759(var25)).method4643()) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1099[--Statics.field1015];
            if (Statics.field411 == null || var26 >= Statics.field411.method4694() || !((class274) Statics.field411.method4759(var26)).method4637()) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field547.field1071.method4711();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1071.method4712(new class315(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1071.method4712(new class316(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1071.method4712(new class158(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1071.method4712(new class152(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1071.method4712(new class157(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1071.method4712(new class160(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1071.method4712(new class156(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1071.method4712(new class154(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1071.method4712(new class153(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1071.method4712(new class155(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field547.field1071.method4742();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field547.field1072.method4711();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1072.method4712(new class315(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1072.method4712(new class316(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field547.field1072.method4742();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field411 != null) {
                Statics.field411.method4711();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1099[--Statics.field1015] == 1;
            if (Statics.field411 != null) {
                Statics.field411.method4712(new class315(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1099[--Statics.field1015] == 1;
            if (Statics.field411 != null) {
                Statics.field411.method4712(new class316(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1099[--Statics.field1015] == 1;
            if (Statics.field411 != null) {
                Statics.field411.method4712(new class158(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1099[--Statics.field1015] == 1;
            if (Statics.field411 != null) {
                Statics.field411.method4712(new class152(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1099[--Statics.field1015] == 1;
            if (Statics.field411 != null) {
                Statics.field411.method4712(new class157(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1099[--Statics.field1015] == 1;
            if (Statics.field411 != null) {
                Statics.field411.method4712(new class160(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1099[--Statics.field1015] == 1;
            if (Statics.field411 != null) {
                Statics.field411.method4712(new class156(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1099[--Statics.field1015] == 1;
            if (Statics.field411 != null) {
                Statics.field411.method4712(new class154(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1099[--Statics.field1015] == 1;
            if (Statics.field411 != null) {
                Statics.field411.method4712(new class153(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1099[--Statics.field1015] == 1;
            if (Statics.field411 != null) {
                Statics.field411.method4712(new class155(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field411 != null) {
                Statics.field411.method4742();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1099[--Statics.field1015] == 1;
            Statics.field547.field1071.method4712(new class159(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1099[--Statics.field1015] == 1;
            if (Statics.field411 != null) {
                Statics.field411.method4712(new class159(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bf.ag(ILcx;ZI)I")
    public static int method1652(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = client.field867[var3].method84();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = client.field867[var4].field60;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = client.field867[var5].field61;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = client.field867[var6].field62;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = client.field867[var7].field59;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = client.field867[var8].field64;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1099[--Statics.field1015];
            int var10 = client.field867[var9].method83();
            field1099[++Statics.field1015 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1099[--Statics.field1015];
            int var12 = client.field867[var11].method83();
            field1099[++Statics.field1015 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1099[--Statics.field1015];
            int var14 = client.field867[var13].method83();
            field1099[++Statics.field1015 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1099[--Statics.field1015];
            int var16 = client.field867[var15].method83();
            field1099[++Statics.field1015 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1099[--Statics.field1015] == 1;
            if (Statics.field943 != null) {
                Statics.field943.method51(class7.field29, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1099[--Statics.field1015] == 1;
            if (Statics.field943 != null) {
                Statics.field943.method51(class7.field31, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1015 -= 2;
            boolean var19 = field1099[Statics.field1015] == 1;
            boolean var20 = field1099[Statics.field1015 + 1] == 1;
            if (Statics.field943 != null) {
                client.field924.field649 = var20;
                Statics.field943.method51(client.field924, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1099[--Statics.field1015] == 1;
            if (Statics.field943 != null) {
                Statics.field943.method51(class7.field30, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1099[--Statics.field1015] == 1;
            if (Statics.field943 != null) {
                Statics.field943.method51(class7.field33, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1099[++Statics.field1015 - 1] = Statics.field943 == null ? 0 : Statics.field943.field37.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1099[--Statics.field1015];
            class8 var24 = (class8) Statics.field943.field37.get(var23);
            field1099[++Statics.field1015 - 1] = var24.field52;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1099[--Statics.field1015];
            class8 var26 = (class8) Statics.field943.field37.get(var25);
            field1094[++Statics.field2748 - 1] = var26.method60();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1099[--Statics.field1015];
            class8 var28 = (class8) Statics.field943.field37.get(var27);
            field1094[++Statics.field2748 - 1] = var28.method63();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1099[--Statics.field1015];
            class8 var30 = (class8) Statics.field943.field37.get(var29);
            long var31 = class298.method3576() - Statics.field3633 - var30.field43;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1094[++Statics.field2748 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1099[--Statics.field1015];
            class8 var38 = (class8) Statics.field943.field37.get(var37);
            field1099[++Statics.field1015 - 1] = var38.field54.field62;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1099[--Statics.field1015];
            class8 var40 = (class8) Statics.field943.field37.get(var39);
            field1099[++Statics.field1015 - 1] = var40.field54.field61;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1099[--Statics.field1015];
            class8 var42 = (class8) Statics.field943.field37.get(var41);
            field1099[++Statics.field1015 - 1] = var42.field54.field60;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iv.ar(ILcx;ZI)I")
    public static int method4149(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1015 -= 2;
            int var3 = field1099[Statics.field1015];
            int var4 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1015 -= 2;
            int var5 = field1099[Statics.field1015];
            int var6 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1015 -= 2;
            int var7 = field1099[Statics.field1015];
            int var8 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1015 -= 2;
            int var9 = field1099[Statics.field1015];
            int var10 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1015 -= 5;
            int var13 = field1099[Statics.field1015];
            int var14 = field1099[Statics.field1015 + 1];
            int var15 = field1099[Statics.field1015 + 2];
            int var16 = field1099[Statics.field1015 + 3];
            int var17 = field1099[Statics.field1015 + 4];
            field1099[++Statics.field1015 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1015 -= 2;
            int var18 = field1099[Statics.field1015];
            int var19 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1015 -= 2;
            int var20 = field1099[Statics.field1015];
            int var21 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1015 -= 2;
            int var22 = field1099[Statics.field1015];
            int var23 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1015 -= 2;
            int var24 = field1099[Statics.field1015];
            int var25 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1015 -= 2;
            int var26 = field1099[Statics.field1015];
            int var27 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1015 -= 2;
            int var28 = field1099[Statics.field1015];
            int var29 = field1099[Statics.field1015 + 1];
            if (var28 == 0) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1015 -= 2;
            int var30 = field1099[Statics.field1015];
            int var31 = field1099[Statics.field1015 + 1];
            if (var30 == 0) {
                field1099[++Statics.field1015 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1099[++Statics.field1015 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1099[++Statics.field1015 - 1] = var30;
                    break;
                case 2:
                    field1099[++Statics.field1015 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1099[++Statics.field1015 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1099[++Statics.field1015 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1099[++Statics.field1015 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1015 -= 2;
            int var32 = field1099[Statics.field1015];
            int var33 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1015 -= 2;
            int var34 = field1099[Statics.field1015];
            int var35 = field1099[Statics.field1015 + 1];
            field1099[++Statics.field1015 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1015 -= 3;
            long var36 = (long) field1099[Statics.field1015];
            long var38 = (long) field1099[Statics.field1015 + 1];
            long var40 = (long) field1099[Statics.field1015 + 2];
            field1099[++Statics.field1015 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ha.ax(ILcx;ZB)I")
    public static int method3578(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1094[--Statics.field2748];
            int var4 = field1099[--Statics.field1015];
            field1094[++Statics.field2748 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field2748 -= 2;
            String var5 = field1094[Statics.field2748];
            String var6 = field1094[Statics.field2748 + 1];
            field1094[++Statics.field2748 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1094[--Statics.field2748];
            int var8 = field1099[--Statics.field1015];
            field1094[++Statics.field2748 - 1] = var7 + class292.method3356(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1094[--Statics.field2748];
            field1094[++Statics.field2748 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1099[--Statics.field1015];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1103.setTime(new Date(var11));
            int var13 = field1103.get(5);
            int var14 = field1103.get(2);
            int var15 = field1103.get(1);
            field1094[++Statics.field2748 - 1] = var13 + "-" + field1098[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field2748 -= 2;
            String var16 = field1094[Statics.field2748];
            String var17 = field1094[Statics.field2748 + 1];
            if (Statics.field658.field614 != null && Statics.field658.field614.field2536) {
                field1094[++Statics.field2748 - 1] = var17;
            } else {
                field1094[++Statics.field2748 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1099[--Statics.field1015];
            field1094[++Statics.field2748 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field2748 -= 2;
            field1099[++Statics.field1015 - 1] = class292.method3011(Statics.method1814(field1094[Statics.field2748], field1094[Statics.field2748 + 1], Statics.field529));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1094[--Statics.field2748];
            Statics.field1015 -= 2;
            int var20 = field1099[Statics.field1015];
            int var21 = field1099[Statics.field1015 + 1];
            byte[] var22 = Statics.field7.method3775(var21, 0);
            class296 var23 = new class296(var22);
            field1099[++Statics.field1015 - 1] = var23.method4964(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1094[--Statics.field2748];
            Statics.field1015 -= 2;
            int var25 = field1099[Statics.field1015];
            int var26 = field1099[Statics.field1015 + 1];
            byte[] var27 = Statics.field7.method3775(var26, 0);
            class296 var28 = new class296(var27);
            field1099[++Statics.field1015 - 1] = var28.method4924(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field2748 -= 2;
            String var29 = field1094[Statics.field2748];
            String var30 = field1094[Statics.field2748 + 1];
            if (field1099[--Statics.field1015] == 1) {
                field1094[++Statics.field2748 - 1] = var29;
            } else {
                field1094[++Statics.field2748 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1094[--Statics.field2748];
            field1094[++Statics.field2748 - 1] = class297.method4941(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1094[--Statics.field2748];
            int var33 = field1099[--Statics.field1015];
            field1094[++Statics.field2748 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = class292.method4761((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = class292.method1093((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = class292.method3294((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = class292.method680((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1094[--Statics.field2748];
            if (var38 == null) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1094[--Statics.field2748];
            Statics.field1015 -= 2;
            int var40 = field1099[Statics.field1015];
            int var41 = field1099[Statics.field1015 + 1];
            field1094[++Statics.field2748 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1094[--Statics.field2748];
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
            field1094[++Statics.field2748 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1094[--Statics.field2748];
            int var48 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field2748 -= 2;
            String var49 = field1094[Statics.field2748];
            String var50 = field1094[Statics.field2748 + 1];
            int var51 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1094[--Statics.field2748];
            field1094[++Statics.field2748 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kd.az(ILcx;ZI)I")
    public static int method4897(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1099[--Statics.field1015];
            field1094[++Statics.field2748 - 1] = class255.method348(var3).field3450;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1015 -= 2;
            int var4 = field1099[Statics.field1015];
            int var5 = field1099[Statics.field1015 + 1];
            class255 var6 = class255.method348(var4);
            if (var5 < 1 || var5 > 5 || var6.field3427[var5 - 1] == null) {
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1094[++Statics.field2748 - 1] = var6.field3427[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1015 -= 2;
            int var7 = field1099[Statics.field1015];
            int var8 = field1099[Statics.field1015 + 1];
            class255 var9 = class255.method348(var7);
            if (var8 < 1 || var8 > 5 || var9.field3428[var8 - 1] == null) {
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1094[++Statics.field2748 - 1] = var9.field3428[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = class255.method348(var10).field3429;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = class255.method348(var11).field3424 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1099[--Statics.field1015];
            class255 var13 = class255.method348(var12);
            if (var13.field3445 == -1 && var13.field3444 >= 0) {
                field1099[++Statics.field1015 - 1] = var13.field3444;
            } else {
                field1099[++Statics.field1015 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1099[--Statics.field1015];
            class255 var15 = class255.method348(var14);
            if (var15.field3445 >= 0 && var15.field3444 >= 0) {
                field1099[++Statics.field1015 - 1] = var15.field3444;
            } else {
                field1099[++Statics.field1015 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = class255.method348(var16).field3426 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1099[--Statics.field1015];
            class255 var18 = class255.method348(var17);
            if (var18.field3440 == -1 && var18.field3401 >= 0) {
                field1099[++Statics.field1015 - 1] = var18.field3401;
            } else {
                field1099[++Statics.field1015 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1099[--Statics.field1015];
            class255 var20 = class255.method348(var19);
            if (var20.field3440 >= 0 && var20.field3401 >= 0) {
                field1099[++Statics.field1015 - 1] = var20.field3401;
            } else {
                field1099[++Statics.field1015 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1094[--Statics.field2748];
            int var22 = field1099[--Statics.field1015];
            client.method267(var21, var22 == 1);
            field1099[++Statics.field1015 - 1] = Statics.field3503;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field337 == null || Statics.field281 >= Statics.field3503) {
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = Statics.field337[++Statics.field281 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field281 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bk.ae(ILcx;ZB)I")
    public static int method1588(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1099[++Statics.field1015 - 1] = client.field908;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1015 -= 3;
            client.field908 = field1099[Statics.field1015];
            Statics.field3073 = class311.method3212(field1099[Statics.field1015 + 1]);
            if (Statics.field3073 == null) {
                Statics.field3073 = class311.field3817;
            }
            client.field873 = field1099[Statics.field1015 + 2];
            class188 var3 = class188.method3894(class184.field2295, client.field881.field1314);
            var3.field2334.method5228(client.field908);
            var3.field2334.method5228(Statics.field3073.field3816);
            var3.field2334.method5228(client.field873);
            client.field881.method2023(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1094[--Statics.field2748];
            Statics.field1015 -= 2;
            int var5 = field1099[Statics.field1015];
            int var6 = field1099[Statics.field1015 + 1];
            class188 var7 = class188.method3894(class184.field2206, client.field881.field1314);
            var7.field2334.method5228(class301.method3582(var4) + 2);
            var7.field2334.method5058(var4);
            var7.field2334.method5228(var5 - 1);
            var7.field2334.method5228(var6);
            client.field881.method2023(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1015 -= 2;
            int var8 = field1099[Statics.field1015];
            int var9 = field1099[Statics.field1015 + 1];
            class65 var10 = class92.method1861(var8, var9);
            if (var10 == null) {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = 0;
                field1094[++Statics.field2748 - 1] = "";
                field1094[++Statics.field2748 - 1] = "";
                field1094[++Statics.field2748 - 1] = "";
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = var10.field601;
                field1099[++Statics.field1015 - 1] = var10.field599;
                field1094[++Statics.field2748 - 1] = var10.field600 == null ? "" : var10.field600;
                field1094[++Statics.field2748 - 1] = var10.field598 == null ? "" : var10.field598;
                field1094[++Statics.field2748 - 1] = var10.field606 == null ? "" : var10.field606;
                field1099[++Statics.field1015 - 1] = var10.method1006() ? 1 : (var10.method1009() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1099[--Statics.field1015];
            class65 var12 = class92.method262(var11);
            if (var12 == null) {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = 0;
                field1094[++Statics.field2748 - 1] = "";
                field1094[++Statics.field2748 - 1] = "";
                field1094[++Statics.field2748 - 1] = "";
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = var12.field603;
                field1099[++Statics.field1015 - 1] = var12.field599;
                field1094[++Statics.field2748 - 1] = var12.field600 == null ? "" : var12.field600;
                field1094[++Statics.field2748 - 1] = var12.field598 == null ? "" : var12.field598;
                field1094[++Statics.field2748 - 1] = var12.field606 == null ? "" : var12.field606;
                field1099[++Statics.field1015 - 1] = var12.method1006() ? 1 : (var12.method1009() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field3073 == null) {
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = Statics.field3073.field3816;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1094[--Statics.field2748];
            int var14 = field1099[--Statics.field1015];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class225.field2827)) {
                var16 = 0;
                var13 = var13.substring(class225.field2827.length());
            } else if (var15.startsWith(class225.field2939)) {
                var16 = 1;
                var13 = var13.substring(class225.field2939.length());
            } else if (var15.startsWith(class225.field2941)) {
                var16 = 2;
                var13 = var13.substring(class225.field2941.length());
            } else if (var15.startsWith(class225.field2783)) {
                var16 = 3;
                var13 = var13.substring(class225.field2783.length());
            } else if (var15.startsWith(class225.field2945)) {
                var16 = 4;
                var13 = var13.substring(class225.field2945.length());
            } else if (var15.startsWith(class225.field2848)) {
                var16 = 5;
                var13 = var13.substring(class225.field2848.length());
            } else if (var15.startsWith(class225.field2949)) {
                var16 = 6;
                var13 = var13.substring(class225.field2949.length());
            } else if (var15.startsWith(class225.field2951)) {
                var16 = 7;
                var13 = var13.substring(class225.field2951.length());
            } else if (var15.startsWith(class225.field3025)) {
                var16 = 8;
                var13 = var13.substring(class225.field3025.length());
            } else if (var15.startsWith(class225.field2955)) {
                var16 = 9;
                var13 = var13.substring(class225.field2955.length());
            } else if (var15.startsWith(class225.field2957)) {
                var16 = 10;
                var13 = var13.substring(class225.field2957.length());
            } else if (var15.startsWith(class225.field2799)) {
                var16 = 11;
                var13 = var13.substring(class225.field2799.length());
            } else if (Statics.field529 != class191.field2349) {
                if (var15.startsWith(class225.field2938)) {
                    var16 = 0;
                    var13 = var13.substring(class225.field2938.length());
                } else if (var15.startsWith(class225.field2842)) {
                    var16 = 1;
                    var13 = var13.substring(class225.field2842.length());
                } else if (var15.startsWith(class225.field2942)) {
                    var16 = 2;
                    var13 = var13.substring(class225.field2942.length());
                } else if (var15.startsWith(class225.field2936)) {
                    var16 = 3;
                    var13 = var13.substring(class225.field2936.length());
                } else if (var15.startsWith(class225.field2935)) {
                    var16 = 4;
                    var13 = var13.substring(class225.field2935.length());
                } else if (var15.startsWith(class225.field2948)) {
                    var16 = 5;
                    var13 = var13.substring(class225.field2948.length());
                } else if (var15.startsWith(class225.field2950)) {
                    var16 = 6;
                    var13 = var13.substring(class225.field2950.length());
                } else if (var15.startsWith(class225.field2853)) {
                    var16 = 7;
                    var13 = var13.substring(class225.field2853.length());
                } else if (var15.startsWith(class225.field2954)) {
                    var16 = 8;
                    var13 = var13.substring(class225.field2954.length());
                } else if (var15.startsWith(class225.field2956)) {
                    var16 = 9;
                    var13 = var13.substring(class225.field2956.length());
                } else if (var15.startsWith(class225.field2958)) {
                    var16 = 10;
                    var13 = var13.substring(class225.field2958.length());
                } else if (var15.startsWith(class225.field2877)) {
                    var16 = 11;
                    var13 = var13.substring(class225.field2877.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class225.field2961)) {
                var18 = 1;
                var13 = var13.substring(class225.field2961.length());
            } else if (var17.startsWith(class225.field2851)) {
                var18 = 2;
                var13 = var13.substring(class225.field2851.length());
            } else if (var17.startsWith(class225.field2965)) {
                var18 = 3;
                var13 = var13.substring(class225.field2965.length());
            } else if (var17.startsWith(class225.field2967)) {
                var18 = 4;
                var13 = var13.substring(class225.field2967.length());
            } else if (var17.startsWith(class225.field2969)) {
                var18 = 5;
                var13 = var13.substring(class225.field2969.length());
            } else if (Statics.field529 != class191.field2349) {
                if (var17.startsWith(class225.field3017)) {
                    var18 = 1;
                    var13 = var13.substring(class225.field3017.length());
                } else if (var17.startsWith(class225.field2964)) {
                    var18 = 2;
                    var13 = var13.substring(class225.field2964.length());
                } else if (var17.startsWith(class225.field2966)) {
                    var18 = 3;
                    var13 = var13.substring(class225.field2966.length());
                } else if (var17.startsWith(class225.field2996)) {
                    var18 = 4;
                    var13 = var13.substring(class225.field2996.length());
                } else if (var17.startsWith(class225.field2970)) {
                    var18 = 5;
                    var13 = var13.substring(class225.field2970.length());
                }
            }
            class188 var19 = class188.method3894(class184.field2259, client.field881.field1314);
            var19.field2334.method5228(0);
            int var20 = var19.field2334.field3733;
            var19.field2334.method5228(var14);
            var19.field2334.method5228(var16);
            var19.field2334.method5228(var18);
            class211.method2806(var19.field2334, var13);
            var19.field2334.method5064(var19.field2334.field3733 - var20);
            client.field881.method2023(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field2748 -= 2;
            String var21 = field1094[Statics.field2748];
            String var22 = field1094[Statics.field2748 + 1];
            class188 var23 = class188.method3894(class184.field2229, client.field881.field1314);
            var23.field2334.method5052(0);
            int var24 = var23.field2334.field3733;
            var23.field2334.method5058(var21);
            class211.method2806(var23.field2334, var22);
            var23.field2334.method5063(var23.field2334.field3733 - var24);
            client.field881.method2023(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field658 == null || Statics.field658.field622 == null) {
                var25 = "";
            } else {
                var25 = Statics.field658.field622.method4790();
            }
            field1094[++Statics.field2748 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1099[++Statics.field1015 - 1] = client.field873;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = class92.method1579(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = class92.method3359(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = class92.method3346(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1094[--Statics.field2748];
            client.method5434(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field763 = field1094[--Statics.field2748].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1094[++Statics.field2748 - 1] = client.field763;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1094[--Statics.field2748];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fz.ao(ILcx;ZI)I")
    public static int method3147(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1099[++Statics.field1015 - 1] = client.method506();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1099[--Statics.field1015];
            if (var3 == 1 || var3 == 2) {
                client.method3197(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1099[++Statics.field1015 - 1] = Statics.field118.field1065;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1099[--Statics.field1015];
            if (var4 == 1 || var4 == 2) {
                Statics.field118.field1065 = var4;
                class74.method2072();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1015--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.aj(ILcx;ZB)I")
    public static int method225(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1015 -= 2;
            int var3 = field1099[Statics.field1015];
            int var4 = field1099[Statics.field1015 + 1];
            if (!client.field900) {
                client.field722 = var3;
                client.field723 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1099[++Statics.field1015 - 1] = client.field722;
            return 1;
        } else if (arg0 == 5506) {
            field1099[++Statics.field1015 - 1] = client.field723;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1099[--Statics.field1015];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field729 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1099[++Statics.field1015 - 1] = client.field729;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.at(ILcx;ZI)I")
    public static int method579(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field701 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bc.ac(II)I")
    public static int method978(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("hq.ap(II)I")
    public static int method3771(int arg0) {
        return (int) ((Math.log((double) arg0) / field1111 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("h.aq(ILcx;ZI)I")
    public static int method226(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1015 -= 2;
            client.field783 = (short) method978(field1099[Statics.field1015]);
            if (client.field783 <= 0) {
                client.field783 = 256;
            }
            client.field652 = (short) method978(field1099[Statics.field1015 + 1]);
            if (client.field652 <= 0) {
                client.field652 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1015 -= 2;
            client.field907 = (short) field1099[Statics.field1015];
            if (client.field907 <= 0) {
                client.field907 = 256;
            }
            client.field909 = (short) field1099[Statics.field1015 + 1];
            if (client.field909 <= 0) {
                client.field909 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1015 -= 4;
            client.field821 = (short) field1099[Statics.field1015];
            if (client.field821 <= 0) {
                client.field821 = 1;
            }
            client.field791 = (short) field1099[Statics.field1015 + 1];
            if (client.field791 <= 0) {
                client.field791 = 32767;
            } else if (client.field791 < client.field821) {
                client.field791 = client.field821;
            }
            client.field733 = (short) field1099[Statics.field1015 + 2];
            if (client.field733 <= 0) {
                client.field733 = 1;
            }
            client.field660 = (short) field1099[Statics.field1015 + 3];
            if (client.field660 <= 0) {
                client.field660 = 32767;
            } else if (client.field660 < client.field733) {
                client.field660 = client.field733;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field828 == null) {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                client.method3037(0, 0, client.field828.field2580, client.field828.field2668, false);
                field1099[++Statics.field1015 - 1] = client.field747;
                field1099[++Statics.field1015 - 1] = client.field715;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1099[++Statics.field1015 - 1] = client.field907;
            field1099[++Statics.field1015 - 1] = client.field909;
            return 1;
        } else if (arg0 == 6205) {
            field1099[++Statics.field1015 - 1] = method3771(client.field783);
            field1099[++Statics.field1015 - 1] = method3771(client.field652);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gf.aa(ILcx;ZI)I")
    public static int method3376(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1099[++Statics.field1015 - 1] = class72.method3139() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class72 var3 = class72.method2003();
            if (var3 == null) {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = 0;
                field1094[++Statics.field2748 - 1] = "";
                field1099[++Statics.field1015 - 1] = 0;
                field1099[++Statics.field1015 - 1] = 0;
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1099[++Statics.field1015 - 1] = var3.field1026;
                field1099[++Statics.field1015 - 1] = var3.field1024;
                field1094[++Statics.field2748 - 1] = var3.field1029;
                field1099[++Statics.field1015 - 1] = var3.field1033;
                field1099[++Statics.field1015 - 1] = var3.field1031;
                field1094[++Statics.field2748 - 1] = var3.field1030;
            }
            return 1;
        } else if (arg0 == 6502) {
            class72 var4 = class72.method674();
            if (var4 == null) {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = 0;
                field1094[++Statics.field2748 - 1] = "";
                field1099[++Statics.field1015 - 1] = 0;
                field1099[++Statics.field1015 - 1] = 0;
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1099[++Statics.field1015 - 1] = var4.field1026;
                field1099[++Statics.field1015 - 1] = var4.field1024;
                field1094[++Statics.field2748 - 1] = var4.field1029;
                field1099[++Statics.field1015 - 1] = var4.field1033;
                field1099[++Statics.field1015 - 1] = var4.field1031;
                field1094[++Statics.field2748 - 1] = var4.field1030;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1099[--Statics.field1015];
            class72 var6 = null;
            for (int var7 = 0; var7 < class72.field1023; var7++) {
                if (Statics.field1032[var7].field1026 == var5) {
                    var6 = Statics.field1032[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = 0;
                field1094[++Statics.field2748 - 1] = "";
                field1099[++Statics.field1015 - 1] = 0;
                field1099[++Statics.field1015 - 1] = 0;
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1099[++Statics.field1015 - 1] = var6.field1026;
                field1099[++Statics.field1015 - 1] = var6.field1024;
                field1094[++Statics.field2748 - 1] = var6.field1029;
                field1099[++Statics.field1015 - 1] = var6.field1033;
                field1099[++Statics.field1015 - 1] = var6.field1031;
                field1094[++Statics.field2748 - 1] = var6.field1030;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1015 -= 4;
            int var8 = field1099[Statics.field1015];
            boolean var9 = field1099[Statics.field1015 + 1] == 1;
            int var10 = field1099[Statics.field1015 + 2];
            boolean var11 = field1099[Statics.field1015 + 3] == 1;
            class72.method173(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1099[--Statics.field1015];
            if (var12 >= 0 && var12 < class72.field1023) {
                class72 var13 = Statics.field1032[var12];
                field1099[++Statics.field1015 - 1] = var13.field1026;
                field1099[++Statics.field1015 - 1] = var13.field1024;
                field1094[++Statics.field2748 - 1] = var13.field1029;
                field1099[++Statics.field1015 - 1] = var13.field1033;
                field1099[++Statics.field1015 - 1] = var13.field1031;
                field1094[++Statics.field2748 - 1] = var13.field1030;
            } else {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = 0;
                field1094[++Statics.field2748 - 1] = "";
                field1099[++Statics.field1015 - 1] = 0;
                field1099[++Statics.field1015 - 1] = 0;
                field1094[++Statics.field2748 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field800 = field1099[--Statics.field1015] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1015 -= 2;
            int var14 = field1099[Statics.field1015];
            int var15 = field1099[Statics.field1015 + 1];
            class250 var16 = class250.method195(var15);
            if (var16.method4116()) {
                field1094[++Statics.field2748 - 1] = class257.method867(var14).method4355(var15, var16.field3304);
            } else {
                field1099[++Statics.field1015 - 1] = class257.method867(var14).method4326(var15, var16.field3303);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1015 -= 2;
            int var17 = field1099[Statics.field1015];
            int var18 = field1099[Statics.field1015 + 1];
            class250 var19 = class250.method195(var18);
            if (var19.method4116()) {
                field1094[++Statics.field2748 - 1] = class254.method2713(var17).method4249(var18, var19.field3304);
            } else {
                field1099[++Statics.field1015 - 1] = class254.method2713(var17).method4213(var18, var19.field3303);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1015 -= 2;
            int var20 = field1099[Statics.field1015];
            int var21 = field1099[Statics.field1015 + 1];
            class250 var22 = class250.method195(var21);
            if (var22.method4116()) {
                field1094[++Statics.field2748 - 1] = class255.method348(var20).method4265(var21, var22.field3304);
            } else {
                field1099[++Statics.field1015 - 1] = class255.method348(var20).method4267(var21, var22.field3303);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1015 -= 2;
            int var23 = field1099[Statics.field1015];
            int var24 = field1099[Statics.field1015 + 1];
            class250 var25 = class250.method195(var24);
            if (var25.method4116()) {
                field1094[++Statics.field2748 - 1] = class251.method4127(var23).method4132(var24, var25.field3304);
            } else {
                field1099[++Statics.field1015 - 1] = class251.method4127(var23).method4131(var24, var25.field3303);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1099[++Statics.field1015 - 1] = client.field659 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1099[++Statics.field1015 - 1] = client.field762 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field2748--;
            Statics.field1015--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field2748--;
            Statics.field1015--;
            return 1;
        } else if (arg0 == 6524) {
            field1099[++Statics.field1015 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1099[++Statics.field1015 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1099[++Statics.field1015 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.an(ILcx;ZI)I")
    public static int method100(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field373;
            int var4 = (Statics.field658.field1006 >> 7) + Statics.field2390;
            int var5 = (Statics.field658.field950 >> 7) + Statics.field2;
            client.method482().method5825(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1099[--Statics.field1015];
            String var7 = "";
            class27 var8 = client.method482().method5843(var6);
            if (var8 != null) {
                var7 = var8.method279();
            }
            field1094[++Statics.field2748 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1099[--Statics.field1015];
            client.method482().method5826(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1099[++Statics.field1015 - 1] = client.method482().method5967();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1099[--Statics.field1015];
            client.method482().method6001(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1099[++Statics.field1015 - 1] = client.method482().method5842() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class214 var11 = new class214(field1099[--Statics.field1015]);
            client.method482().method5885(var11.field2531, var11.field2529);
            return 1;
        } else if (arg0 == 6607) {
            class214 var12 = new class214(field1099[--Statics.field1015]);
            client.method482().method5896(var12.field2531, var12.field2529);
            return 1;
        } else if (arg0 == 6608) {
            class214 var13 = new class214(field1099[--Statics.field1015]);
            client.method482().method5846(var13.field2532, var13.field2531, var13.field2529);
            return 1;
        } else if (arg0 == 6609) {
            class214 var14 = new class214(field1099[--Statics.field1015]);
            client.method482().method5905(var14.field2532, var14.field2531, var14.field2529);
            return 1;
        } else if (arg0 == 6610) {
            field1099[++Statics.field1015 - 1] = client.method482().method5848();
            field1099[++Statics.field1015 - 1] = client.method482().method5849();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1099[--Statics.field1015];
            class27 var16 = client.method482().method5843(var15);
            if (var16 == null) {
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = var16.method289().method3608();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1099[--Statics.field1015];
            class27 var18 = client.method482().method5843(var17);
            if (var18 == null) {
                field1099[++Statics.field1015 - 1] = 0;
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = (var18.method283() - var18.method282() + 1) * 64;
                field1099[++Statics.field1015 - 1] = (var18.method285() - var18.method284() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1099[--Statics.field1015];
            class27 var20 = client.method482().method5843(var19);
            if (var20 == null) {
                field1099[++Statics.field1015 - 1] = 0;
                field1099[++Statics.field1015 - 1] = 0;
                field1099[++Statics.field1015 - 1] = 0;
                field1099[++Statics.field1015 - 1] = 0;
            } else {
                field1099[++Statics.field1015 - 1] = var20.method282() * 64;
                field1099[++Statics.field1015 - 1] = var20.method284() * 64;
                field1099[++Statics.field1015 - 1] = var20.method283() * 64 + 64 - 1;
                field1099[++Statics.field1015 - 1] = var20.method285() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1099[--Statics.field1015];
            class27 var22 = client.method482().method5843(var21);
            if (var22 == null) {
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = var22.method281();
            }
            return 1;
        } else if (arg0 == 6615) {
            class214 var23 = client.method482().method5931();
            if (var23 == null) {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = var23.field2531;
                field1099[++Statics.field1015 - 1] = var23.field2529;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1099[++Statics.field1015 - 1] = client.method482().method5827();
            return 1;
        } else if (arg0 == 6617) {
            class214 var24 = new class214(field1099[--Statics.field1015]);
            class27 var25 = client.method482().method5828();
            if (var25 == null) {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method274(var24.field2532, var24.field2531, var24.field2529);
            if (var26 == null) {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = var26[0];
                field1099[++Statics.field1015 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class214 var27 = new class214(field1099[--Statics.field1015]);
            class27 var28 = client.method482().method5828();
            if (var28 == null) {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = -1;
                return 1;
            }
            class214 var29 = var28.method275(var27.field2531, var27.field2529);
            if (var29 == null) {
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = var29.method3608();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1015 -= 2;
            int var30 = field1099[Statics.field1015];
            class214 var31 = new class214(field1099[Statics.field1015 + 1]);
            method1659(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1015 -= 2;
            int var32 = field1099[Statics.field1015];
            class214 var33 = new class214(field1099[Statics.field1015 + 1]);
            method1659(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1015 -= 2;
            int var34 = field1099[Statics.field1015];
            class214 var35 = new class214(field1099[Statics.field1015 + 1]);
            class27 var36 = client.method482().method5843(var34);
            if (var36 == null) {
                field1099[++Statics.field1015 - 1] = 0;
                return 1;
            } else {
                field1099[++Statics.field1015 - 1] = var36.method317(var35.field2532, var35.field2531, var35.field2529) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1099[++Statics.field1015 - 1] = client.method482().method5928();
            field1099[++Statics.field1015 - 1] = client.method482().method5977();
            return 1;
        } else if (arg0 == 6623) {
            class214 var37 = new class214(field1099[--Statics.field1015]);
            class27 var38 = client.method482().method5824(var37.field2532, var37.field2531, var37.field2529);
            if (var38 == null) {
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = var38.method291();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method482().method5853(field1099[--Statics.field1015]);
            return 1;
        } else if (arg0 == 6625) {
            client.method482().method5854();
            return 1;
        } else if (arg0 == 6626) {
            client.method482().method5855(field1099[--Statics.field1015]);
            return 1;
        } else if (arg0 == 6627) {
            client.method482().method5856();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1099[--Statics.field1015] == 1;
            client.method482().method6008(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1099[--Statics.field1015];
            client.method482().method5857(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1099[--Statics.field1015];
            client.method482().method5858(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method482().method5859();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1099[--Statics.field1015] == 1;
            client.method482().method5919(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1015 -= 2;
            int var43 = field1099[Statics.field1015];
            boolean var44 = field1099[Statics.field1015 + 1] == 1;
            client.method482().method5861(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1015 -= 2;
            int var45 = field1099[Statics.field1015];
            boolean var46 = field1099[Statics.field1015 + 1] == 1;
            client.method482().method5992(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1099[++Statics.field1015 - 1] = client.method482().method5863() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = client.method482().method5864(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1099[--Statics.field1015];
            field1099[++Statics.field1015 - 1] = client.method482().method5865(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1015 -= 2;
            int var49 = field1099[Statics.field1015];
            class214 var50 = new class214(field1099[Statics.field1015 + 1]);
            class214 var51 = client.method482().method5868(var49, var50);
            if (var51 == null) {
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = var51.method3608();
            }
            return 1;
        } else if (arg0 == 6639) {
            class35 var52 = client.method482().method5862();
            if (var52 == null) {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = var52.method176();
                field1099[++Statics.field1015 - 1] = var52.field298.method3608();
            }
            return 1;
        } else if (arg0 == 6640) {
            class35 var53 = client.method482().method5871();
            if (var53 == null) {
                field1099[++Statics.field1015 - 1] = -1;
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = var53.method176();
                field1099[++Statics.field1015 - 1] = var53.field298.method3608();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1099[--Statics.field1015];
            class242 var55 = class242.method3753(var54);
            if (var55.field3217 == null) {
                field1094[++Statics.field2748 - 1] = "";
            } else {
                field1094[++Statics.field2748 - 1] = var55.field3217;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1099[--Statics.field1015];
            class242 var57 = class242.method3753(var56);
            field1099[++Statics.field1015 - 1] = var57.field3219;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1099[--Statics.field1015];
            class242 var59 = class242.method3753(var58);
            if (var59 == null) {
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = var59.field3231;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1099[--Statics.field1015];
            class242 var61 = class242.method3753(var60);
            if (var61 == null) {
                field1099[++Statics.field1015 - 1] = -1;
            } else {
                field1099[++Statics.field1015 - 1] = var61.field3221;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1099[++Statics.field1015 - 1] = Statics.field122.field356;
            return 1;
        } else if (arg0 == 6698) {
            field1099[++Statics.field1015 - 1] = Statics.field122.field358.method3608();
            return 1;
        } else if (arg0 == 6699) {
            field1099[++Statics.field1015 - 1] = Statics.field122.field355.method3608();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.au(II)V")
    public static void method675(int arg0) {
        if (arg0 == -1 || !class218.method3154(arg0)) {
            return;
        }
        class218[] var1 = Statics.field2557[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3.field2631 != null) {
                class63 var4 = new class63();
                var4.field576 = var3;
                var4.field582 = var3.field2631;
                method2071(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("bv.ai(ILhv;ZB)V")
    public static void method1659(int arg0, class214 arg1, boolean arg2) {
        class27 var3 = client.method482().method5843(arg0);
        int var4 = Statics.field658.field630;
        int var5 = (Statics.field658.field1006 >> 7) + Statics.field2390;
        int var6 = (Statics.field658.field950 >> 7) + Statics.field2;
        class214 var7 = new class214(var4, var5, var6);
        client.method482().method5831(var3, var7, arg1, arg2);
    }
}
