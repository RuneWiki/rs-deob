package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ci")
public class class86 {

    @ObfuscatedName("ci.i")
    public static int[] field1128 = new int[5];

    @ObfuscatedName("ci.o")
    public static int[][] field1124 = new int[5][5000];

    @ObfuscatedName("ci.x")
    public static int[] field1125 = new int[1000];

    @ObfuscatedName("ci.g")
    public static String[] field1127 = new String[1000];

    @ObfuscatedName("ci.n")
    public static int field1134 = 0;

    @ObfuscatedName("ci.d")
    public static class66[] field1129 = new class66[50];

    @ObfuscatedName("ci.q")
    public static Calendar field1120 = Calendar.getInstance();

    @ObfuscatedName("ci.c")
    public static final String[] field1131 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ci.y")
    public static boolean field1132 = false;

    @ObfuscatedName("ci.v")
    public static boolean field1133 = false;

    @ObfuscatedName("ci.j")
    public static int field1136 = 0;

    @ObfuscatedName("ci.b")
    public static final double field1121 = Math.log(2.0D);

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cy.z(Lby;B)V")
    public static void method2141(class72 arg0) {
        method4705(arg0, 500000);
    }

    @ObfuscatedName("jy.k(Lby;II)V")
    public static void method4705(class72 arg0, int arg1) {
        Object[] var2 = arg0.field601;
        class102 var4;
        if (class304.method3708(arg0.field595)) {
            Statics.field1928 = (class51) var2[0];
            class252 var3 = Statics.method285(Statics.field1928.field378);
            var4 = class102.method3471(arg0.field595, var3.field3240, var3.field3257);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class102.method319(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field1126 = 0;
        Statics.field2559 = 0;
        int var6 = -1;
        int[] var7 = var4.field1308;
        int[] var8 = var4.field1316;
        byte var9 = -1;
        field1134 = 0;
        field1132 = false;
        try {
            Statics.field1122 = new int[var4.field1311];
            int var10 = 0;
            Statics.field293 = new String[var4.field1315];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field602;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field597;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field586 == null ? -1 : arg0.field586.field2738;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field589;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field586 == null ? -1 : arg0.field586.field2605;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field590 == null ? -1 : arg0.field590.field2738;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field590 == null ? -1 : arg0.field590.field2605;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field591;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field592;
                    }
                    Statics.field1122[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field593;
                    }
                    Statics.field293[var11++] = var14;
                }
            }
            int var15 = 0;
            field1136 = arg0.field594;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1316[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method704(var53, var4, var43);
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
                    field1125[++Statics.field1126 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1125[++Statics.field1126 - 1] = class222.field2558[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class222.field2558[var17] = field1125[--Statics.field1126];
                    client.method3303(var17);
                } else if (var53 == 3) {
                    field1127[++Statics.field2559 - 1] = var4.field1310[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field1126 -= 2;
                    if (field1125[Statics.field1126] != field1125[Statics.field1126 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field1126 -= 2;
                    if (field1125[Statics.field1126] == field1125[Statics.field1126 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field1126 -= 2;
                    if (field1125[Statics.field1126] < field1125[Statics.field1126 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field1126 -= 2;
                    if (field1125[Statics.field1126] > field1125[Statics.field1126 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1134 == 0) {
                        return;
                    }
                    class66 var18 = field1129[--field1134];
                    var4 = var18.field541;
                    var7 = var4.field1308;
                    var8 = var4.field1316;
                    var6 = var18.field540;
                    Statics.field1122 = var18.field543;
                    Statics.field293 = var18.field542;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1125[++Statics.field1126 - 1] = class222.method552(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class222.method3701(var20, field1125[--Statics.field1126]);
                } else if (var53 == 31) {
                    Statics.field1126 -= 2;
                    if (field1125[Statics.field1126] <= field1125[Statics.field1126 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field1126 -= 2;
                    if (field1125[Statics.field1126] >= field1125[Statics.field1126 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1125[++Statics.field1126 - 1] = Statics.field1122[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field1122[var8[var6]] = field1125[--Statics.field1126];
                } else if (var53 == 35) {
                    field1127[++Statics.field2559 - 1] = Statics.field293[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field293[var8[var6]] = field1127[--Statics.field2559];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field2559 -= var21;
                    String var22 = class301.method3264(field1127, Statics.field2559, var21);
                    field1127[++Statics.field2559 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field1126--;
                } else if (var53 == 39) {
                    Statics.field2559--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class102 var24 = class102.method319(var23);
                    int[] var25 = new int[var24.field1311];
                    String[] var26 = new String[var24.field1315];
                    for (int var27 = 0; var27 < var24.field1313; var27++) {
                        var25[var27] = field1125[Statics.field1126 - var24.field1313 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1314; var28++) {
                        var26[var28] = field1127[Statics.field2559 - var24.field1314 + var28];
                    }
                    Statics.field1126 -= var24.field1313;
                    Statics.field2559 -= var24.field1314;
                    class66 var29 = new class66();
                    var29.field541 = var4;
                    var29.field540 = var6;
                    var29.field543 = Statics.field1122;
                    var29.field542 = Statics.field293;
                    field1129[++field1134 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1308;
                    var8 = var24.field1316;
                    var6 = -1;
                    Statics.field1122 = var25;
                    Statics.field293 = var26;
                } else if (var53 == 42) {
                    field1125[++Statics.field1126 - 1] = Statics.field1081.method2085(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field1081.method2055(var8[var6], field1125[--Statics.field1126]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1125[--Statics.field1126];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1128[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1124[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1125[--Statics.field1126];
                    if (var36 < 0 || var36 >= field1128[var35]) {
                        throw new RuntimeException();
                    }
                    field1125[++Statics.field1126 - 1] = field1124[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field1126 -= 2;
                    int var38 = field1125[Statics.field1126];
                    if (var38 < 0 || var38 >= field1128[var37]) {
                        throw new RuntimeException();
                    }
                    field1124[var37][var38] = field1125[Statics.field1126 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field1081.method2060(var8[var6]);
                    if (var39 == null) {
                        var39 = class234.field2806;
                    }
                    field1127[++Statics.field2559 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field1081.method2082(var8[var6], field1127[--Statics.field2559]);
                } else if (var53 == 49) {
                    String var40 = Statics.field1081.method2058(var8[var6]);
                    field1127[++Statics.field2559 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field1081.method2068(var8[var6], field1127[--Statics.field2559]);
                } else if (var53 == 60) {
                    class326 var41 = var4.field1312[var8[var6]];
                    class189 var42 = (class189) var41.method5582((long) field1125[--Statics.field1126]);
                    if (var42 != null) {
                        var6 += var42.field2154;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2157).append(" ");
            for (int var47 = field1134 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1129[var47].field541.field2157).append(" ");
            }
            var46.append("").append(var9);
            class351.method2420(var46.toString(), var51);
        } finally {
            if (field1132) {
                field1133 = true;
                client.method1069();
                field1133 = false;
                field1132 = false;
            }
        }
    }

    @ObfuscatedName("ak.s(ILcy;ZI)I")
    public static int method704(int arg0, class102 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method1130(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method3860(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method423(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method14(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method3160(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return Statics.method1056(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method1970(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method245(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method323(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method1628(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method4314(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method3860(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method423(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method14(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method3160(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return Statics.method1056(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method744(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method746(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method197(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return Statics.method331(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method4314(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method107(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method543(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method411(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method3265(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method1632(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method1941(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method5035(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method110(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3867(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method3267(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method3242(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method2395(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method309(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method5899(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method4409(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method1180(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.t(ILcy;ZI)I")
    public static int method1130(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1126 -= 3;
            int var3 = field1125[Statics.field1126];
            int var4 = field1125[Statics.field1126 + 1];
            int var5 = field1125[Statics.field1126 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class227 var6 = class227.method2021(var3);
            if (var6.field2736 == null) {
                var6.field2736 = new class227[var5 + 1];
            }
            if (var6.field2736.length <= var5) {
                class227[] var7 = new class227[var5 + 1];
                for (int var8 = 0; var8 < var6.field2736.length; var8++) {
                    var7[var8] = var6.field2736[var8];
                }
                var6.field2736 = var7;
            }
            if (var5 > 0 && var6.field2736[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class227 var9 = new class227();
            var9.field2608 = var4;
            var9.field2615 = var9.field2738 = var6.field2738;
            var9.field2605 = var5;
            var9.field2717 = true;
            var6.field2736[var5] = var9;
            if (arg2) {
                Statics.field439 = var9;
            } else {
                Statics.field13 = var9;
            }
            client.method710(var6);
            return 1;
        } else if (arg0 == 101) {
            class227 var10 = arg2 ? Statics.field439 : Statics.field13;
            class227 var11 = class227.method2021(var10.field2738);
            var11.field2736[var10.field2605] = null;
            client.method710(var11);
            return 1;
        } else if (arg0 == 102) {
            class227 var12 = class227.method2021(field1125[--Statics.field1126]);
            var12.field2736 = null;
            client.method710(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1126 -= 2;
            int var13 = field1125[Statics.field1126];
            int var14 = field1125[Statics.field1126 + 1];
            class227 var15 = class227.method1055(var13, var14);
            if (var15 == null || var14 == -1) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = 1;
                if (arg2) {
                    Statics.field439 = var15;
                } else {
                    Statics.field13 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class227 var16 = class227.method2021(field1125[--Statics.field1126]);
            if (var16 == null) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = 1;
                if (arg2) {
                    Statics.field439 = var16;
                } else {
                    Statics.field13 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ij.i(ILcy;ZI)I")
    public static int method3860(int arg0, class102 arg1, boolean arg2) {
        int var3 = -1;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1125[--Statics.field1126];
            var4 = class227.method2021(var3);
        } else {
            var4 = arg2 ? Statics.field439 : Statics.field13;
        }
        if (arg0 == 1000) {
            Statics.field1126 -= 4;
            var4.field2661 = field1125[Statics.field1126];
            var4.field2616 = field1125[Statics.field1126 + 1];
            var4.field2694 = field1125[Statics.field1126 + 2];
            var4.field2674 = field1125[Statics.field1126 + 3];
            client.method710(var4);
            Statics.field9.method1576(var4);
            if (var3 != -1 && var4.field2608 == 0) {
                client.method46(Statics.field2597[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1126 -= 4;
            var4.field2617 = field1125[Statics.field1126];
            var4.field2618 = field1125[Statics.field1126 + 1];
            var4.field2666 = field1125[Statics.field1126 + 2];
            var4.field2614 = field1125[Statics.field1126 + 3];
            client.method710(var4);
            Statics.field9.method1576(var4);
            if (var3 != -1 && var4.field2608 == 0) {
                client.method46(Statics.field2597[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1125[--Statics.field1126] == 1;
            if (var4.field2626 != var5) {
                var4.field2626 = var5;
                client.method710(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2746 = field1125[--Statics.field1126] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2747 = field1125[--Statics.field1126] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.o(ILcy;ZI)I")
    public static int method423(int arg0, class102 arg1, boolean arg2) {
        int var3 = -1;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1125[--Statics.field1126];
            var4 = class227.method2021(var3);
        } else {
            var4 = arg2 ? Statics.field439 : Statics.field13;
        }
        if (arg0 == 1100) {
            Statics.field1126 -= 2;
            var4.field2604 = field1125[Statics.field1126];
            if (var4.field2604 > var4.field2629 - var4.field2620) {
                var4.field2604 = var4.field2629 - var4.field2620;
            }
            if (var4.field2604 < 0) {
                var4.field2604 = 0;
            }
            var4.field2703 = field1125[Statics.field1126 + 1];
            if (var4.field2703 > var4.field2630 - var4.field2622) {
                var4.field2703 = var4.field2630 - var4.field2622;
            }
            if (var4.field2703 < 0) {
                var4.field2703 = 0;
            }
            client.method710(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2628 = field1125[--Statics.field1126];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2609 = field1125[--Statics.field1126] == 1;
            client.method710(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2637 = field1125[--Statics.field1126];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2639 = field1125[--Statics.field1126];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2641 = field1125[--Statics.field1126];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2678 = field1125[--Statics.field1126];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2644 = field1125[--Statics.field1126] == 1;
            client.method710(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2649 = 1;
            var4.field2650 = field1125[--Statics.field1126];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1126 -= 6;
            var4.field2655 = field1125[Statics.field1126];
            var4.field2707 = field1125[Statics.field1126 + 1];
            var4.field2741 = field1125[Statics.field1126 + 2];
            var4.field2658 = field1125[Statics.field1126 + 3];
            var4.field2670 = field1125[Statics.field1126 + 4];
            var4.field2643 = field1125[Statics.field1126 + 5];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1125[--Statics.field1126];
            if (var4.field2653 != var5) {
                var4.field2653 = var5;
                var4.field2734 = 0;
                var4.field2735 = 0;
                client.method710(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2663 = field1125[--Statics.field1126] == 1;
            client.method710(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1127[--Statics.field2559];
            if (!var6.equals(var4.field2667)) {
                var4.field2667 = var6;
                client.method710(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2740 = field1125[--Statics.field1126];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1126 -= 3;
            var4.field2594 = field1125[Statics.field1126];
            var4.field2621 = field1125[Statics.field1126 + 1];
            var4.field2669 = field1125[Statics.field1126 + 2];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2742 = field1125[--Statics.field1126] == 1;
            client.method710(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2645 = field1125[--Statics.field1126];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2646 = field1125[--Statics.field1126];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2647 = field1125[--Statics.field1126] == 1;
            client.method710(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2648 = field1125[--Statics.field1126] == 1;
            client.method710(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1126 -= 2;
            var4.field2629 = field1125[Statics.field1126];
            var4.field2630 = field1125[Statics.field1126 + 1];
            client.method710(var4);
            if (var3 != -1 && var4.field2608 == 0) {
                client.method46(Statics.field2597[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method5506(var4.field2738, var4.field2605);
            client.field844 = var4;
            client.method710(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2642 = field1125[--Statics.field1126];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2632 = field1125[--Statics.field1126];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2638 = field1125[--Statics.field1126];
            client.method710(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1125[--Statics.field1126];
            class333 var8 = (class333) class205.method2633(class333.method232(), var7);
            if (var8 != null) {
                var4.field2636 = var8;
                client.method710(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1125[--Statics.field1126] == 1;
            var4.field2640 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1125[--Statics.field1126] == 1;
            var4.field2733 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.x(ILcy;ZI)I")
    public static int method14(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method2021(field1125[--Statics.field1126]);
        } else {
            var3 = arg2 ? Statics.field439 : Statics.field13;
        }
        client.method710(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1126 -= 2;
            int var4 = field1125[Statics.field1126];
            int var5 = field1125[Statics.field1126 + 1];
            var3.field2732 = var4;
            var3.field2656 = var5;
            class265 var6 = class265.method136(var4);
            var3.field2741 = var6.field3431;
            var3.field2658 = var6.field3441;
            var3.field2670 = var6.field3442;
            var3.field2655 = var6.field3443;
            var3.field2707 = var6.field3444;
            var3.field2643 = var6.field3439;
            if (arg0 == 1205) {
                var3.field2695 = 0;
            } else if (arg0 == 1212 | var6.field3445 == 1) {
                var3.field2695 = 1;
            } else {
                var3.field2695 = 2;
            }
            if (var3.field2729 > 0) {
                var3.field2643 = var3.field2643 * 32 / var3.field2729;
            } else if (var3.field2617 > 0) {
                var3.field2643 = var3.field2643 * 32 / var3.field2617;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2649 = 2;
            var3.field2650 = field1125[--Statics.field1126];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2649 = 3;
            var3.field2650 = Statics.field141.field645.method3749();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ev.w(ILcy;ZI)I")
    public static int method3160(int arg0, class102 arg1, boolean arg2) {
        boolean var3 = true;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class227.method2021(field1125[--Statics.field1126]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field439 : Statics.field13;
        }
        if (arg0 == 1300) {
            int var5 = field1125[--Statics.field1126] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3792(var5, field1127[--Statics.field2559]);
                return 1;
            } else {
                Statics.field2559--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1126 -= 2;
            int var6 = field1125[Statics.field1126];
            int var7 = field1125[Statics.field1126 + 1];
            var4.field2687 = class227.method1055(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2690 = field1125[--Statics.field1126] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2688 = field1125[--Statics.field1126];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2689 = field1125[--Statics.field1126];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2685 = field1127[--Statics.field2559];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2691 = field1127[--Statics.field2559];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2686 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2748 = field1125[--Statics.field1126] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field1126--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1126 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1125[Statics.field1126 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1125[Statics.field1126 + var10];
                        var9[var10 / 2] = (byte) field1125[Statics.field1126 + var10 + 1];
                    }
                }
            } else {
                Statics.field1126 -= 2;
                var8 = new byte[] { (byte) field1125[Statics.field1126] };
                var9 = new byte[] { (byte) field1125[Statics.field1126 + 1] };
            }
            int var11 = field1125[--Statics.field1126] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method3331(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1126 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1125[Statics.field1126] };
            byte[] var14 = new byte[] { (byte) field1125[Statics.field1126 + 1] };
            method3331(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1126 -= 3;
            int var15 = field1125[Statics.field1126] - 1;
            int var16 = field1125[Statics.field1126 + 1];
            int var17 = field1125[Statics.field1126 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method1005(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1125[--Statics.field1126];
            int var20 = field1125[--Statics.field1126];
            method1005(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1126--;
            int var21 = field1125[Statics.field1126] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method805(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method805(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fh.g(Lhq;I[B[BI)V")
    public static final void method3331(class227 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2627 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2627 = new byte[11][];
            arg0.field2720 = new byte[11][];
            arg0.field2683 = new int[11];
            arg0.field2684 = new int[11];
        }
        arg0.field2627[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2677 = false;
            for (int var4 = 0; var4 < arg0.field2627.length; var4++) {
                if (arg0.field2627[var4] != null) {
                    arg0.field2677 = true;
                    break;
                }
            }
        } else {
            arg0.field2677 = true;
        }
        arg0.field2720[arg1] = arg3;
    }

    @ObfuscatedName("be.m(Lhq;IIII)V")
    public static final void method1005(class227 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2683 == null) {
            throw new RuntimeException();
        }
        arg0.field2683[arg1] = arg2;
        arg0.field2684[arg1] = arg3;
    }

    @ObfuscatedName("bp.n(Lhq;IS)V")
    public static final void method805(class227 arg0, int arg1) {
        if (arg0.field2627 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2662 == null) {
            arg0.field2662 = new int[arg0.field2627.length];
        }
        arg0.field2662[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("cd.h(ILcy;ZI)I")
    public static int method1970(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field439 : Statics.field13;
        if (arg0 == 1500) {
            field1125[++Statics.field1126 - 1] = var3.field2672;
            return 1;
        } else if (arg0 == 1501) {
            field1125[++Statics.field1126 - 1] = var3.field2610;
            return 1;
        } else if (arg0 == 1502) {
            field1125[++Statics.field1126 - 1] = var3.field2620;
            return 1;
        } else if (arg0 == 1503) {
            field1125[++Statics.field1126 - 1] = var3.field2622;
            return 1;
        } else if (arg0 == 1504) {
            field1125[++Statics.field1126 - 1] = var3.field2626 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1125[++Statics.field1126 - 1] = var3.field2615;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ab.a(ILcy;ZB)I")
    public static int method245(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field439 : Statics.field13;
        if (arg0 == 1600) {
            field1125[++Statics.field1126 - 1] = var3.field2604;
            return 1;
        } else if (arg0 == 1601) {
            field1125[++Statics.field1126 - 1] = var3.field2703;
            return 1;
        } else if (arg0 == 1602) {
            field1127[++Statics.field2559 - 1] = var3.field2667;
            return 1;
        } else if (arg0 == 1603) {
            field1125[++Statics.field1126 - 1] = var3.field2629;
            return 1;
        } else if (arg0 == 1604) {
            field1125[++Statics.field1126 - 1] = var3.field2630;
            return 1;
        } else if (arg0 == 1605) {
            field1125[++Statics.field1126 - 1] = var3.field2643;
            return 1;
        } else if (arg0 == 1606) {
            field1125[++Statics.field1126 - 1] = var3.field2741;
            return 1;
        } else if (arg0 == 1607) {
            field1125[++Statics.field1126 - 1] = var3.field2670;
            return 1;
        } else if (arg0 == 1608) {
            field1125[++Statics.field1126 - 1] = var3.field2658;
            return 1;
        } else if (arg0 == 1609) {
            field1125[++Statics.field1126 - 1] = var3.field2637;
            return 1;
        } else if (arg0 == 1610) {
            field1125[++Statics.field1126 - 1] = var3.field2638;
            return 1;
        } else if (arg0 == 1611) {
            field1125[++Statics.field1126 - 1] = var3.field2628;
            return 1;
        } else if (arg0 == 1612) {
            field1125[++Statics.field1126 - 1] = var3.field2632;
            return 1;
        } else if (arg0 == 1613) {
            field1125[++Statics.field1126 - 1] = var3.field2636.method28();
            return 1;
        } else if (arg0 == 1614) {
            field1125[++Statics.field1126 - 1] = var3.field2733 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.q(ILcy;ZI)I")
    public static int method323(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field439 : Statics.field13;
        if (arg0 == 1700) {
            field1125[++Statics.field1126 - 1] = var3.field2732;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2732 == -1) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = var3.field2656;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1125[++Statics.field1126 - 1] = var3.field2605;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.c(ILcy;ZB)I")
    public static int method1628(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field439 : Statics.field13;
        if (arg0 == 1800) {
            field1125[++Statics.field1126 - 1] = class228.method142(client.method262(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1125[--Statics.field1126];
            int var5 = var4 - 1;
            if (var3.field2686 == null || var5 >= var3.field2686.length || var3.field2686[var5] == null) {
                field1127[++Statics.field2559 - 1] = "";
            } else {
                field1127[++Statics.field2559 - 1] = var3.field2686[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2685 == null) {
                field1127[++Statics.field2559 - 1] = "";
            } else {
                field1127[++Statics.field2559 - 1] = var3.field2685;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jd.j(ILcy;ZB)I")
    public static int method4314(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method2021(field1125[--Statics.field1126]);
        } else {
            var3 = arg2 ? Statics.field439 : Statics.field13;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1136 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2721 == null) {
            return 0;
        } else {
            class72 var4 = new class72();
            var4.field586 = var3;
            var4.field601 = var3.field2721;
            var4.field594 = field1136 + 1;
            client.field877.method4616(var4);
            return 1;
        }
    }

    @ObfuscatedName("bz.r(ILcy;ZS)I")
    public static int method744(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method2021(field1125[--Statics.field1126]);
        if (arg0 == 2500) {
            field1125[++Statics.field1126 - 1] = var3.field2672;
            return 1;
        } else if (arg0 == 2501) {
            field1125[++Statics.field1126 - 1] = var3.field2610;
            return 1;
        } else if (arg0 == 2502) {
            field1125[++Statics.field1126 - 1] = var3.field2620;
            return 1;
        } else if (arg0 == 2503) {
            field1125[++Statics.field1126 - 1] = var3.field2622;
            return 1;
        } else if (arg0 == 2504) {
            field1125[++Statics.field1126 - 1] = var3.field2626 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1125[++Statics.field1126 - 1] = var3.field2615;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.u(ILcy;ZI)I")
    public static int method746(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method2021(field1125[--Statics.field1126]);
        if (arg0 == 2600) {
            field1125[++Statics.field1126 - 1] = var3.field2604;
            return 1;
        } else if (arg0 == 2601) {
            field1125[++Statics.field1126 - 1] = var3.field2703;
            return 1;
        } else if (arg0 == 2602) {
            field1127[++Statics.field2559 - 1] = var3.field2667;
            return 1;
        } else if (arg0 == 2603) {
            field1125[++Statics.field1126 - 1] = var3.field2629;
            return 1;
        } else if (arg0 == 2604) {
            field1125[++Statics.field1126 - 1] = var3.field2630;
            return 1;
        } else if (arg0 == 2605) {
            field1125[++Statics.field1126 - 1] = var3.field2643;
            return 1;
        } else if (arg0 == 2606) {
            field1125[++Statics.field1126 - 1] = var3.field2741;
            return 1;
        } else if (arg0 == 2607) {
            field1125[++Statics.field1126 - 1] = var3.field2670;
            return 1;
        } else if (arg0 == 2608) {
            field1125[++Statics.field1126 - 1] = var3.field2658;
            return 1;
        } else if (arg0 == 2609) {
            field1125[++Statics.field1126 - 1] = var3.field2637;
            return 1;
        } else if (arg0 == 2610) {
            field1125[++Statics.field1126 - 1] = var3.field2638;
            return 1;
        } else if (arg0 == 2611) {
            field1125[++Statics.field1126 - 1] = var3.field2628;
            return 1;
        } else if (arg0 == 2612) {
            field1125[++Statics.field1126 - 1] = var3.field2632;
            return 1;
        } else if (arg0 == 2613) {
            field1125[++Statics.field1126 - 1] = var3.field2636.method28();
            return 1;
        } else if (arg0 == 2614) {
            field1125[++Statics.field1126 - 1] = var3.field2733 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("r.p(ILcy;ZI)I")
    public static int method197(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class227 var3 = class227.method2021(field1125[--Statics.field1126]);
            field1125[++Statics.field1126 - 1] = var3.field2732;
            return 1;
        } else if (arg0 == 2701) {
            class227 var4 = class227.method2021(field1125[--Statics.field1126]);
            if (var4.field2732 == -1) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = var4.field2656;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1125[--Statics.field1126];
            class71 var6 = (class71) client.field954.method5611((long) var5);
            if (var6 == null) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1125[++Statics.field1126 - 1] = client.field838;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.l(ILcy;ZB)I")
    public static int method107(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1127[--Statics.field2559];
            class101.method317(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1126 -= 2;
            client.method199(Statics.field141, field1125[Statics.field1126], field1125[Statics.field1126 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1133) {
                field1132 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1127[--Statics.field2559];
            int var5 = 0;
            if (class301.method1703(var4)) {
                var5 = class301.method144(var4);
            }
            class197 var6 = class197.method1625(class193.field2333, client.field723.field1341);
            var6.field2377.method5295(var5);
            client.field723.method2159(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1127[--Statics.field2559];
            class197 var8 = class197.method1625(class193.field2251, client.field723.field1341);
            var8.field2377.method5177(var7.length() + 1);
            var8.field2377.method5322(var7);
            client.field723.method2159(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1127[--Statics.field2559];
            class197 var10 = class197.method1625(class193.field2340, client.field723.field1341);
            var10.field2377.method5177(var9.length() + 1);
            var10.field2377.method5322(var9);
            client.field723.method2159(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1125[--Statics.field1126];
            String var12 = field1127[--Statics.field2559];
            client.method4005(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1126 -= 3;
            int var13 = field1125[Statics.field1126];
            int var14 = field1125[Statics.field1126 + 1];
            int var15 = field1125[Statics.field1126 + 2];
            class227 var16 = class227.method2021(var15);
            client.method97(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1126 -= 2;
            int var17 = field1125[Statics.field1126];
            int var18 = field1125[Statics.field1126 + 1];
            class227 var19 = arg2 ? Statics.field439 : Statics.field13;
            client.method97(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field587 = field1125[--Statics.field1126] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1125[++Statics.field1126 - 1] = Statics.field1694.field1083 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1694.field1083 = field1125[--Statics.field1126] == 1;
            class83.method658();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1127[--Statics.field2559];
            boolean var21 = field1125[--Statics.field1126] == 1;
            class61.method4704(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1125[--Statics.field1126];
            class197 var23 = class197.method1625(class193.field2339, client.field723.field1341);
            var23.field2377.method5178(var22);
            client.field723.method2159(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1125[--Statics.field1126];
            Statics.field2559 -= 2;
            String var25 = field1127[Statics.field2559];
            String var26 = field1127[Statics.field2559 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class197 var27 = class197.method1625(class193.field2285, client.field723.field1341);
                var27.field2377.method5178(1 + class310.method2409(var25) + class310.method2409(var26));
                var27.field2377.method5322(var26);
                var27.field2377.method5221(var24);
                var27.field2377.method5322(var25);
                client.field723.method2159(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field824 = field1125[--Statics.field1126] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field826 = field1125[--Statics.field1126] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field940 = field1125[--Statics.field1126] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1125[--Statics.field1126] == 1) {
                client.field684 |= 0x1;
            } else {
                client.field684 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1125[--Statics.field1126] == 1) {
                client.field684 |= 0x2;
            } else {
                client.field684 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1125[--Statics.field1126] == 1) {
                client.field684 |= 0x4;
            } else {
                client.field684 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1125[--Statics.field1126] == 1) {
                client.field684 |= 0x8;
            } else {
                client.field684 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field684 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field782 = field1125[--Statics.field1126] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field851 = field1125[--Statics.field1126] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method115(field1125[--Statics.field1126] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1125[++Statics.field1126 - 1] = client.method4917() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1126 -= 2;
            client.field700 = field1125[Statics.field1126];
            client.field924 = field1125[Statics.field1126 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1126 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1126--;
            return 1;
        } else if (arg0 == 3132) {
            field1125[++Statics.field1126 - 1] = Statics.field1642;
            field1125[++Statics.field1126 - 1] = Statics.field475;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1126--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1126 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field866 = 3;
            client.field841 = field1125[--Statics.field1126];
            return 1;
        } else if (arg0 == 3137) {
            client.field866 = 2;
            client.field841 = field1125[--Statics.field1126];
            return 1;
        } else if (arg0 == 3138) {
            client.field866 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field866 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field866 = 3;
            client.field841 = arg2 ? Statics.field439.field2738 : Statics.field13.field2738;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1125[--Statics.field1126] == 1;
            Statics.field1694.field1091 = var28;
            class83.method658();
            return 1;
        } else if (arg0 == 3142) {
            field1125[++Statics.field1126 - 1] = Statics.field1694.field1091 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1125[--Statics.field1126] == 1;
            client.field678 = var29;
            if (!var29) {
                Statics.field1694.field1086 = "";
                class83.method658();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1125[++Statics.field1126 - 1] = client.field678 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1125[--Statics.field1126] == 1;
            if (Statics.field1694.field1084 == var30) {
                Statics.field1694.field1084 = !var30;
                class83.method658();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1125[++Statics.field1126 - 1] = Statics.field1694.field1084 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1125[++Statics.field1126 - 1] = class95.field1209;
            return 1;
        } else if (arg0 == 3154) {
            field1125[++Statics.field1126 - 1] = client.method659();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field2559--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1126 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1126--;
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1126--;
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field2559--;
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1126--;
            field1127[++Statics.field2559 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1126--;
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1126 -= 2;
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1126 -= 2;
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1126 -= 2;
            field1127[++Statics.field2559 - 1] = "";
            field1127[++Statics.field2559 - 1] = "";
            field1127[++Statics.field2559 - 1] = "";
            field1127[++Statics.field2559 - 1] = "";
            field1127[++Statics.field2559 - 1] = "";
            field1127[++Statics.field2559 - 1] = "";
            field1127[++Statics.field2559 - 1] = "";
            field1127[++Statics.field2559 - 1] = "";
            field1127[++Statics.field2559 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1126--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1126--;
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1126--;
            return 1;
        } else if (arg0 == 3175) {
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field2559--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field2559--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("av.e(ILcy;ZI)I")
    public static int method543(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1126 -= 3;
            client.method71(field1125[Statics.field1126], field1125[Statics.field1126 + 1], field1125[Statics.field1126 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method576(field1125[--Statics.field1126]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1126 -= 2;
            Statics.method4971(field1125[Statics.field1126], field1125[Statics.field1126 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ar.ab(ILcy;ZI)I")
    public static int method411(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1125[++Statics.field1126 - 1] = client.field674;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1126 -= 2;
            int var3 = field1125[Statics.field1126];
            int var4 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = class69.method4212(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1126 -= 2;
            int var5 = field1125[Statics.field1126];
            int var6 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = class69.method3233(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1126 -= 2;
            int var7 = field1125[Statics.field1126];
            int var8 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = class69.method3337(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = class250.method3666(var9).field3228;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = client.field809[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = client.field810[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = client.field811[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field2544;
            int var14 = (Statics.field141.field995 >> 7) + Statics.field348;
            int var15 = (Statics.field141.field1024 >> 7) + Statics.field263;
            field1125[++Statics.field1126 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1125[++Statics.field1126 - 1] = client.field675 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1126 -= 2;
            int var19 = field1125[Statics.field1126] + 32768;
            int var20 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = class69.method4212(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1126 -= 2;
            int var21 = field1125[Statics.field1126] + 32768;
            int var22 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = class69.method3233(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1126 -= 2;
            int var23 = field1125[Statics.field1126] + 32768;
            int var24 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = class69.method3337(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field814 >= 2) {
                field1125[++Statics.field1126 - 1] = client.field814;
            } else {
                field1125[++Statics.field1126 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1125[++Statics.field1126 - 1] = client.field691;
            return 1;
        } else if (arg0 == 3318) {
            field1125[++Statics.field1126 - 1] = client.field672;
            return 1;
        } else if (arg0 == 3321) {
            field1125[++Statics.field1126 - 1] = client.field845;
            return 1;
        } else if (arg0 == 3322) {
            field1125[++Statics.field1126 - 1] = client.field846;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field849) {
                field1125[++Statics.field1126 - 1] = 1;
            } else {
                field1125[++Statics.field1126 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1125[++Statics.field1126 - 1] = client.field781;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1126 -= 4;
            int var25 = field1125[Statics.field1126];
            int var26 = field1125[Statics.field1126 + 1];
            int var27 = field1125[Statics.field1126 + 2];
            int var28 = field1125[Statics.field1126 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1125[++Statics.field1126 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ff.ag(ILcy;ZI)I")
    public static int method3265(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1126 -= 2;
            int var3 = field1125[Statics.field1126];
            int var4 = field1125[Statics.field1126 + 1];
            class262 var5 = class262.method188(var3);
            if (var5.field3339 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3342; var6++) {
                if (var5.field3336[var6] == var4) {
                    field1127[++Statics.field2559 - 1] = var5.field3343[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1127[++Statics.field2559 - 1] = var5.field3340;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1126 -= 4;
            int var7 = field1125[Statics.field1126];
            int var8 = field1125[Statics.field1126 + 1];
            int var9 = field1125[Statics.field1126 + 2];
            int var10 = field1125[Statics.field1126 + 3];
            class262 var11 = class262.method188(var9);
            if (var11.field3337 != var7 || var11.field3339 != var8) {
                if (var8 == 115) {
                    field1127[++Statics.field2559 - 1] = class234.field2806;
                } else {
                    field1125[++Statics.field1126 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3342; var12++) {
                if (var11.field3336[var12] == var10) {
                    if (var8 == 115) {
                        field1127[++Statics.field2559 - 1] = var11.field3343[var12];
                    } else {
                        field1125[++Statics.field1126 - 1] = var11.field3344[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1127[++Statics.field2559 - 1] = var11.field3340;
                } else {
                    field1125[++Statics.field1126 - 1] = var11.field3341;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1125[--Statics.field1126];
            class262 var14 = class262.method188(var13);
            field1125[++Statics.field1126 - 1] = var14.method4270();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cg.ao(ILcy;ZI)I")
    public static int method1632(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field456.field1100 == 0) {
                field1125[++Statics.field1126 - 1] = -2;
            } else if (Statics.field456.field1100 == 1) {
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = Statics.field456.field1097.method4801();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1125[--Statics.field1126];
            if (Statics.field456.method1803() && var3 >= 0 && var3 < Statics.field456.field1097.method4801()) {
                class294 var4 = (class294) Statics.field456.field1097.method4853(var3);
                field1127[++Statics.field2559 - 1] = var4.method4759();
                field1127[++Statics.field2559 - 1] = var4.method4766();
            } else {
                field1127[++Statics.field2559 - 1] = "";
                field1127[++Statics.field2559 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1125[--Statics.field1126];
            if (Statics.field456.method1803() && var5 >= 0 && var5 < Statics.field456.field1097.method4801()) {
                field1125[++Statics.field1126 - 1] = ((class289) Statics.field456.field1097.method4853(var5)).field3632;
            } else {
                field1125[++Statics.field1126 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1125[--Statics.field1126];
            if (Statics.field456.method1803() && var6 >= 0 && var6 < Statics.field456.field1097.method4801()) {
                field1125[++Statics.field1126 - 1] = ((class289) Statics.field456.field1097.method4853(var6)).field3634;
            } else {
                field1125[++Statics.field1126 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1127[--Statics.field2559];
            int var8 = field1125[--Statics.field1126];
            class84.method4702(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1127[--Statics.field2559];
            Statics.field456.method1774(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1127[--Statics.field2559];
            Statics.field456.method1761(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1127[--Statics.field2559];
            Statics.field456.method1759(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1127[--Statics.field2559];
            Statics.field456.method1762(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1127[--Statics.field2559];
            String var14 = client.method1058(var13);
            field1125[++Statics.field1126 - 1] = Statics.field456.method1755(new class293(var14, Statics.field356), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1907 == null) {
                field1127[++Statics.field2559 - 1] = "";
            } else {
                field1127[++Statics.field2559 - 1] = Statics.field1907.field3655;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1907 == null) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = Statics.field1907.method4801();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1125[--Statics.field1126];
            if (Statics.field1907 == null || var15 >= Statics.field1907.method4801()) {
                field1127[++Statics.field2559 - 1] = "";
            } else {
                field1127[++Statics.field2559 - 1] = Statics.field1907.method4853(var15).method4757().method4889();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1125[--Statics.field1126];
            if (Statics.field1907 == null || var16 >= Statics.field1907.method4801()) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = ((class289) Statics.field1907.method4853(var16)).method4874();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1125[--Statics.field1126];
            if (Statics.field1907 == null || var17 >= Statics.field1907.method4801()) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = ((class289) Statics.field1907.method4853(var17)).field3634;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1125[++Statics.field1126 - 1] = Statics.field1907 == null ? 0 : Statics.field1907.field3660;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1127[--Statics.field2559];
            client.method3142(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1125[++Statics.field1126 - 1] = Statics.field1907 == null ? 0 : Statics.field1907.field3657;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1127[--Statics.field2559];
            client.method3602(var19);
            return 1;
        } else if (arg0 == 3620) {
            Statics.method3686();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field456.method1803()) {
                field1125[++Statics.field1126 - 1] = Statics.field456.field1099.method4801();
            } else {
                field1125[++Statics.field1126 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1125[--Statics.field1126];
            if (Statics.field456.method1803() && var20 >= 0 && var20 < Statics.field456.field1099.method4801()) {
                class288 var21 = (class288) Statics.field456.field1099.method4853(var20);
                field1127[++Statics.field2559 - 1] = var21.method4759();
                field1127[++Statics.field2559 - 1] = var21.method4766();
            } else {
                field1127[++Statics.field2559 - 1] = "";
                field1127[++Statics.field2559 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1127[--Statics.field2559];
            String var23 = client.method1058(var22);
            field1125[++Statics.field1126 - 1] = Statics.field456.method1756(new class293(var23, Statics.field356)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1125[--Statics.field1126];
            if (Statics.field1907 == null || var24 >= Statics.field1907.method4801() || !Statics.field1907.method4853(var24).method4757().equals(Statics.field141.field649)) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1907 == null || Statics.field1907.field3656 == null) {
                field1127[++Statics.field2559 - 1] = "";
            } else {
                field1127[++Statics.field2559 - 1] = Statics.field1907.field3656;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1125[--Statics.field1126];
            if (Statics.field1907 == null || var25 >= Statics.field1907.method4801() || !((class283) Statics.field1907.method4853(var25)).method4733()) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1125[--Statics.field1126];
            if (Statics.field1907 == null || var26 >= Statics.field1907.method4801() || !((class283) Statics.field1907.method4853(var26)).method4743()) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field456.field1097.method4820();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1097.method4821(new class324(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1097.method4821(new class325(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1097.method4821(new class167(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1097.method4821(new class161(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1097.method4821(new class166(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1097.method4821(new class169(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1097.method4821(new class165(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1097.method4821(new class163(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1097.method4821(new class162(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1097.method4821(new class164(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field456.field1097.method4812();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field456.field1099.method4820();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1099.method4821(new class324(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1099.method4821(new class325(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field456.field1099.method4812();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1907 != null) {
                Statics.field1907.method4820();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1125[--Statics.field1126] == 1;
            if (Statics.field1907 != null) {
                Statics.field1907.method4821(new class324(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1125[--Statics.field1126] == 1;
            if (Statics.field1907 != null) {
                Statics.field1907.method4821(new class325(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1125[--Statics.field1126] == 1;
            if (Statics.field1907 != null) {
                Statics.field1907.method4821(new class167(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1125[--Statics.field1126] == 1;
            if (Statics.field1907 != null) {
                Statics.field1907.method4821(new class161(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1125[--Statics.field1126] == 1;
            if (Statics.field1907 != null) {
                Statics.field1907.method4821(new class166(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1125[--Statics.field1126] == 1;
            if (Statics.field1907 != null) {
                Statics.field1907.method4821(new class169(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1125[--Statics.field1126] == 1;
            if (Statics.field1907 != null) {
                Statics.field1907.method4821(new class165(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1125[--Statics.field1126] == 1;
            if (Statics.field1907 != null) {
                Statics.field1907.method4821(new class163(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1125[--Statics.field1126] == 1;
            if (Statics.field1907 != null) {
                Statics.field1907.method4821(new class162(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1125[--Statics.field1126] == 1;
            if (Statics.field1907 != null) {
                Statics.field1907.method4821(new class164(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1907 != null) {
                Statics.field1907.method4812();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1125[--Statics.field1126] == 1;
            Statics.field456.field1097.method4821(new class168(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1125[--Statics.field1126] == 1;
            if (Statics.field1907 != null) {
                Statics.field1907.method4821(new class168(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cu.ae(ILcy;ZB)I")
    public static int method1941(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = client.field697[var3].method148();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = client.field697[var4].field90;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = client.field697[var5].field91;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = client.field697[var6].field99;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = client.field697[var7].field93;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = client.field697[var8].field94;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1125[--Statics.field1126];
            int var10 = client.field697[var9].method174();
            field1125[++Statics.field1126 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1125[--Statics.field1126];
            int var12 = client.field697[var11].method174();
            field1125[++Statics.field1126 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1125[--Statics.field1126];
            int var14 = client.field697[var13].method174();
            field1125[++Statics.field1126 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1125[--Statics.field1126];
            int var16 = client.field697[var15].method174();
            field1125[++Statics.field1126 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1125[--Statics.field1126] == 1;
            if (Statics.field311 != null) {
                Statics.field311.method112(class16.field66, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1125[--Statics.field1126] == 1;
            if (Statics.field311 != null) {
                Statics.field311.method112(class16.field68, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1126 -= 2;
            boolean var19 = field1125[Statics.field1126] == 1;
            boolean var20 = field1125[Statics.field1126 + 1] == 1;
            if (Statics.field311 != null) {
                client.field946.field667 = var20;
                Statics.field311.method112(client.field946, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1125[--Statics.field1126] == 1;
            if (Statics.field311 != null) {
                Statics.field311.method112(class16.field67, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1125[--Statics.field1126] == 1;
            if (Statics.field311 != null) {
                Statics.field311.method112(class16.field72, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1125[++Statics.field1126 - 1] = Statics.field311 == null ? 0 : Statics.field311.field69.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1125[--Statics.field1126];
            class17 var24 = (class17) Statics.field311.field69.get(var23);
            field1125[++Statics.field1126 - 1] = var24.field79;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1125[--Statics.field1126];
            class17 var26 = (class17) Statics.field311.field69.get(var25);
            field1127[++Statics.field2559 - 1] = var26.method120();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1125[--Statics.field1126];
            class17 var28 = (class17) Statics.field311.field69.get(var27);
            field1127[++Statics.field2559 - 1] = var28.method121();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1125[--Statics.field1126];
            class17 var30 = (class17) Statics.field311.field69.get(var29);
            long var31 = class307.method2184() - Statics.field554 - var30.field75;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1127[++Statics.field2559 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1125[--Statics.field1126];
            class17 var38 = (class17) Statics.field311.field69.get(var37);
            field1125[++Statics.field1126 - 1] = var38.field76.field99;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1125[--Statics.field1126];
            class17 var40 = (class17) Statics.field311.field69.get(var39);
            field1125[++Statics.field1126 - 1] = var40.field76.field91;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1125[--Statics.field1126];
            class17 var42 = (class17) Statics.field311.field69.get(var41);
            field1125[++Statics.field1126 - 1] = var42.field76.field90;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kv.ap(ILcy;ZI)I")
    public static int method5035(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1126 -= 2;
            int var3 = field1125[Statics.field1126];
            int var4 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1126 -= 2;
            int var5 = field1125[Statics.field1126];
            int var6 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1126 -= 2;
            int var7 = field1125[Statics.field1126];
            int var8 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1126 -= 2;
            int var9 = field1125[Statics.field1126];
            int var10 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1126 -= 5;
            int var13 = field1125[Statics.field1126];
            int var14 = field1125[Statics.field1126 + 1];
            int var15 = field1125[Statics.field1126 + 2];
            int var16 = field1125[Statics.field1126 + 3];
            int var17 = field1125[Statics.field1126 + 4];
            field1125[++Statics.field1126 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1126 -= 2;
            int var18 = field1125[Statics.field1126];
            int var19 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1126 -= 2;
            int var20 = field1125[Statics.field1126];
            int var21 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1126 -= 2;
            int var22 = field1125[Statics.field1126];
            int var23 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1126 -= 2;
            int var24 = field1125[Statics.field1126];
            int var25 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1126 -= 2;
            int var26 = field1125[Statics.field1126];
            int var27 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1126 -= 2;
            int var28 = field1125[Statics.field1126];
            int var29 = field1125[Statics.field1126 + 1];
            if (var28 == 0) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1126 -= 2;
            int var30 = field1125[Statics.field1126];
            int var31 = field1125[Statics.field1126 + 1];
            if (var30 == 0) {
                field1125[++Statics.field1126 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1125[++Statics.field1126 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1125[++Statics.field1126 - 1] = var30;
                    break;
                case 2:
                    field1125[++Statics.field1126 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1125[++Statics.field1126 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1125[++Statics.field1126 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1125[++Statics.field1126 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1126 -= 2;
            int var32 = field1125[Statics.field1126];
            int var33 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1126 -= 2;
            int var34 = field1125[Statics.field1126];
            int var35 = field1125[Statics.field1126 + 1];
            field1125[++Statics.field1126 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1126 -= 3;
            long var36 = (long) field1125[Statics.field1126];
            long var38 = (long) field1125[Statics.field1126 + 1];
            long var40 = (long) field1125[Statics.field1126 + 2];
            field1125[++Statics.field1126 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("c.au(ILcy;ZI)I")
    public static int method110(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1127[--Statics.field2559];
            int var4 = field1125[--Statics.field1126];
            field1127[++Statics.field2559 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field2559 -= 2;
            String var5 = field1127[Statics.field2559];
            String var6 = field1127[Statics.field2559 + 1];
            field1127[++Statics.field2559 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1127[--Statics.field2559];
            int var8 = field1125[--Statics.field1126];
            field1127[++Statics.field2559 - 1] = var7 + class301.method3467(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1127[--Statics.field2559];
            field1127[++Statics.field2559 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1125[--Statics.field1126];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1120.setTime(new Date(var11));
            int var13 = field1120.get(5);
            int var14 = field1120.get(2);
            int var15 = field1120.get(1);
            field1127[++Statics.field2559 - 1] = var13 + "-" + field1131[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field2559 -= 2;
            String var16 = field1127[Statics.field2559];
            String var17 = field1127[Statics.field2559 + 1];
            if (Statics.field141.field645 != null && Statics.field141.field645.field2572) {
                field1127[++Statics.field2559 - 1] = var17;
            } else {
                field1127[++Statics.field2559 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1125[--Statics.field1126];
            field1127[++Statics.field2559 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field2559 -= 2;
            field1125[++Statics.field1126 - 1] = class301.method2172(Statics.method160(field1127[Statics.field2559], field1127[Statics.field2559 + 1], Statics.field441));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1127[--Statics.field2559];
            Statics.field1126 -= 2;
            int var20 = field1125[Statics.field1126];
            int var21 = field1125[Statics.field1126 + 1];
            byte[] var22 = Statics.field1821.method3873(var21, 0);
            class305 var23 = new class305(var22);
            field1125[++Statics.field1126 - 1] = var23.method5051(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1127[--Statics.field2559];
            Statics.field1126 -= 2;
            int var25 = field1125[Statics.field1126];
            int var26 = field1125[Statics.field1126 + 1];
            byte[] var27 = Statics.field1821.method3873(var26, 0);
            class305 var28 = new class305(var27);
            field1125[++Statics.field1126 - 1] = var28.method5044(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field2559 -= 2;
            String var29 = field1127[Statics.field2559];
            String var30 = field1127[Statics.field2559 + 1];
            if (field1125[--Statics.field1126] == 1) {
                field1127[++Statics.field2559 - 1] = var29;
            } else {
                field1127[++Statics.field2559 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1127[--Statics.field2559];
            field1127[++Statics.field2559 - 1] = class306.method5054(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1127[--Statics.field2559];
            int var33 = field1125[--Statics.field1126];
            field1127[++Statics.field2559 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = class301.method4187((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = class301.method3473((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = class301.method3273((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = class301.method15((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1127[--Statics.field2559];
            if (var38 == null) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1127[--Statics.field2559];
            Statics.field1126 -= 2;
            int var40 = field1125[Statics.field1126];
            int var41 = field1125[Statics.field1126 + 1];
            field1127[++Statics.field2559 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1127[--Statics.field2559];
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
            field1127[++Statics.field2559 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1127[--Statics.field2559];
            int var48 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field2559 -= 2;
            String var49 = field1127[Statics.field2559];
            String var50 = field1127[Statics.field2559 + 1];
            int var51 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1127[--Statics.field2559];
            field1127[++Statics.field2559 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ig.aa(ILcy;ZI)I")
    public static int method3867(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1125[--Statics.field1126];
            field1127[++Statics.field2559 - 1] = class265.method136(var3).field3434;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1126 -= 2;
            int var4 = field1125[Statics.field1126];
            int var5 = field1125[Statics.field1126 + 1];
            class265 var6 = class265.method136(var4);
            if (var5 < 1 || var5 > 5 || var6.field3454[var5 - 1] == null) {
                field1127[++Statics.field2559 - 1] = "";
            } else {
                field1127[++Statics.field2559 - 1] = var6.field3454[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1126 -= 2;
            int var7 = field1125[Statics.field1126];
            int var8 = field1125[Statics.field1126 + 1];
            class265 var9 = class265.method136(var7);
            if (var8 < 1 || var8 > 5 || var9.field3449[var8 - 1] == null) {
                field1127[++Statics.field2559 - 1] = "";
            } else {
                field1127[++Statics.field2559 - 1] = var9.field3449[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = class265.method136(var10).field3479;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = class265.method136(var11).field3445 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1125[--Statics.field1126];
            class265 var13 = class265.method136(var12);
            if (var13.field3466 == -1 && var13.field3446 >= 0) {
                field1125[++Statics.field1126 - 1] = var13.field3446;
            } else {
                field1125[++Statics.field1126 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1125[--Statics.field1126];
            class265 var15 = class265.method136(var14);
            if (var15.field3466 >= 0 && var15.field3446 >= 0) {
                field1125[++Statics.field1126 - 1] = var15.field3446;
            } else {
                field1125[++Statics.field1126 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = class265.method136(var16).field3447 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1125[--Statics.field1126];
            class265 var18 = class265.method136(var17);
            if (var18.field3478 == -1 && var18.field3468 >= 0) {
                field1125[++Statics.field1126 - 1] = var18.field3468;
            } else {
                field1125[++Statics.field1126 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1125[--Statics.field1126];
            class265 var20 = class265.method136(var19);
            if (var20.field3478 >= 0 && var20.field3468 >= 0) {
                field1125[++Statics.field1126 - 1] = var20.field3468;
            } else {
                field1125[++Statics.field1126 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1127[--Statics.field2559];
            int var22 = field1125[--Statics.field1126];
            client.method3868(var21, var22 == 1);
            field1125[++Statics.field1126 - 1] = Statics.field2424;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1303 == null || Statics.field600 >= Statics.field2424) {
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = Statics.field1303[++Statics.field600 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field600 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fi.ar(ILcy;ZB)I")
    public static int method3267(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1125[++Statics.field1126 - 1] = client.field894;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1126 -= 3;
            client.field894 = field1125[Statics.field1126];
            Statics.field665 = class320.method2018(field1125[Statics.field1126 + 1]);
            if (Statics.field665 == null) {
                Statics.field665 = class320.field3822;
            }
            client.field895 = field1125[Statics.field1126 + 2];
            class197 var3 = class197.method1625(class193.field2284, client.field723.field1341);
            var3.field2377.method5177(client.field894);
            var3.field2377.method5177(Statics.field665.field3825);
            var3.field2377.method5177(client.field895);
            client.field723.method2159(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1127[--Statics.field2559];
            Statics.field1126 -= 2;
            int var5 = field1125[Statics.field1126];
            int var6 = field1125[Statics.field1126 + 1];
            class197 var7 = class197.method1625(class193.field2274, client.field723.field1341);
            var7.field2377.method5177(class310.method2409(var4) + 2);
            var7.field2377.method5322(var4);
            var7.field2377.method5177(var5 - 1);
            var7.field2377.method5177(var6);
            client.field723.method2159(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1126 -= 2;
            int var8 = field1125[Statics.field1126];
            int var9 = field1125[Statics.field1126 + 1];
            class74 var10 = class101.method577(var8, var9);
            if (var10 == null) {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = 0;
                field1127[++Statics.field2559 - 1] = "";
                field1127[++Statics.field2559 - 1] = "";
                field1127[++Statics.field2559 - 1] = "";
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = var10.field613;
                field1125[++Statics.field1126 - 1] = var10.field612;
                field1127[++Statics.field2559 - 1] = var10.field615 == null ? "" : var10.field615;
                field1127[++Statics.field2559 - 1] = var10.field619 == null ? "" : var10.field619;
                field1127[++Statics.field2559 - 1] = var10.field617 == null ? "" : var10.field617;
                field1125[++Statics.field1126 - 1] = var10.method1098() ? 1 : (var10.method1101() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1125[--Statics.field1126];
            class74 var12 = class101.method329(var11);
            if (var12 == null) {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = 0;
                field1127[++Statics.field2559 - 1] = "";
                field1127[++Statics.field2559 - 1] = "";
                field1127[++Statics.field2559 - 1] = "";
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = var12.field614;
                field1125[++Statics.field1126 - 1] = var12.field612;
                field1127[++Statics.field2559 - 1] = var12.field615 == null ? "" : var12.field615;
                field1127[++Statics.field2559 - 1] = var12.field619 == null ? "" : var12.field619;
                field1127[++Statics.field2559 - 1] = var12.field617 == null ? "" : var12.field617;
                field1125[++Statics.field1126 - 1] = var12.method1098() ? 1 : (var12.method1101() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field665 == null) {
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = Statics.field665.field3825;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1127[--Statics.field2559];
            int var14 = field1125[--Statics.field1126];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class234.field2978)) {
                var16 = 0;
                var13 = var13.substring(class234.field2978.length());
            } else if (var15.startsWith(class234.field2980)) {
                var16 = 1;
                var13 = var13.substring(class234.field2980.length());
            } else if (var15.startsWith(class234.field2982)) {
                var16 = 2;
                var13 = var13.substring(class234.field2982.length());
            } else if (var15.startsWith(class234.field2951)) {
                var16 = 3;
                var13 = var13.substring(class234.field2951.length());
            } else if (var15.startsWith(class234.field2986)) {
                var16 = 4;
                var13 = var13.substring(class234.field2986.length());
            } else if (var15.startsWith(class234.field2977)) {
                var16 = 5;
                var13 = var13.substring(class234.field2977.length());
            } else if (var15.startsWith(class234.field2990)) {
                var16 = 6;
                var13 = var13.substring(class234.field2990.length());
            } else if (var15.startsWith(class234.field2917)) {
                var16 = 7;
                var13 = var13.substring(class234.field2917.length());
            } else if (var15.startsWith(class234.field2798)) {
                var16 = 8;
                var13 = var13.substring(class234.field2798.length());
            } else if (var15.startsWith(class234.field2930)) {
                var16 = 9;
                var13 = var13.substring(class234.field2930.length());
            } else if (var15.startsWith(class234.field2998)) {
                var16 = 10;
                var13 = var13.substring(class234.field2998.length());
            } else if (var15.startsWith(class234.field3000)) {
                var16 = 11;
                var13 = var13.substring(class234.field3000.length());
            } else if (Statics.field441 != class200.field2386) {
                if (var15.startsWith(class234.field2899)) {
                    var16 = 0;
                    var13 = var13.substring(class234.field2899.length());
                } else if (var15.startsWith(class234.field2981)) {
                    var16 = 1;
                    var13 = var13.substring(class234.field2981.length());
                } else if (var15.startsWith(class234.field2983)) {
                    var16 = 2;
                    var13 = var13.substring(class234.field2983.length());
                } else if (var15.startsWith(class234.field2985)) {
                    var16 = 3;
                    var13 = var13.substring(class234.field2985.length());
                } else if (var15.startsWith(class234.field2987)) {
                    var16 = 4;
                    var13 = var13.substring(class234.field2987.length());
                } else if (var15.startsWith(class234.field2979)) {
                    var16 = 5;
                    var13 = var13.substring(class234.field2979.length());
                } else if (var15.startsWith(class234.field2992)) {
                    var16 = 6;
                    var13 = var13.substring(class234.field2992.length());
                } else if (var15.startsWith(class234.field2993)) {
                    var16 = 7;
                    var13 = var13.substring(class234.field2993.length());
                } else if (var15.startsWith(class234.field2911)) {
                    var16 = 8;
                    var13 = var13.substring(class234.field2911.length());
                } else if (var15.startsWith(class234.field2997)) {
                    var16 = 9;
                    var13 = var13.substring(class234.field2997.length());
                } else if (var15.startsWith(class234.field2999)) {
                    var16 = 10;
                    var13 = var13.substring(class234.field2999.length());
                } else if (var15.startsWith(class234.field2968)) {
                    var16 = 11;
                    var13 = var13.substring(class234.field2968.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class234.field2881)) {
                var18 = 1;
                var13 = var13.substring(class234.field2881.length());
            } else if (var17.startsWith(class234.field3004)) {
                var18 = 2;
                var13 = var13.substring(class234.field3004.length());
            } else if (var17.startsWith(class234.field3006)) {
                var18 = 3;
                var13 = var13.substring(class234.field3006.length());
            } else if (var17.startsWith(class234.field3008)) {
                var18 = 4;
                var13 = var13.substring(class234.field3008.length());
            } else if (var17.startsWith(class234.field3010)) {
                var18 = 5;
                var13 = var13.substring(class234.field3010.length());
            } else if (Statics.field441 != class200.field2386) {
                if (var17.startsWith(class234.field2830)) {
                    var18 = 1;
                    var13 = var13.substring(class234.field2830.length());
                } else if (var17.startsWith(class234.field3005)) {
                    var18 = 2;
                    var13 = var13.substring(class234.field3005.length());
                } else if (var17.startsWith(class234.field3007)) {
                    var18 = 3;
                    var13 = var13.substring(class234.field3007.length());
                } else if (var17.startsWith(class234.field3009)) {
                    var18 = 4;
                    var13 = var13.substring(class234.field3009.length());
                } else if (var17.startsWith(class234.field3011)) {
                    var18 = 5;
                    var13 = var13.substring(class234.field3011.length());
                }
            }
            class197 var19 = class197.method1625(class193.field2343, client.field723.field1341);
            var19.field2377.method5177(0);
            int var20 = var19.field2377.field3734;
            var19.field2377.method5177(var14);
            var19.field2377.method5177(var16);
            var19.field2377.method5177(var18);
            class220.method1182(var19.field2377, var13);
            var19.field2377.method5190(var19.field2377.field3734 - var20);
            client.field723.method2159(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field2559 -= 2;
            String var21 = field1127[Statics.field2559];
            String var22 = field1127[Statics.field2559 + 1];
            class197 var23 = class197.method1625(class193.field2250, client.field723.field1341);
            var23.field2377.method5178(0);
            int var24 = var23.field2377.field3734;
            var23.field2377.method5322(var21);
            class220.method1182(var23.field2377, var22);
            var23.field2377.method5244(var23.field2377.field3734 - var24);
            client.field723.method2159(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field141 == null || Statics.field141.field649 == null) {
                var25 = "";
            } else {
                var25 = Statics.field141.field649.method4889();
            }
            field1127[++Statics.field2559 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1125[++Statics.field1126 - 1] = client.field895;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = class101.method2027(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = class101.method1939(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = class101.method1193(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1127[--Statics.field2559];
            client.method330(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field914 = field1127[--Statics.field2559].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1127[++Statics.field2559 - 1] = client.field914;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1127[--Statics.field2559];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fe.at(ILcy;ZB)I")
    public static int method3242(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1125[++Statics.field1126 - 1] = client.method538();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1125[--Statics.field1126];
            if (var3 == 1 || var3 == 2) {
                client.method5027(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1125[++Statics.field1126 - 1] = Statics.field1694.field1085;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1125[--Statics.field1126];
            if (var4 == 1 || var4 == 2) {
                Statics.field1694.field1085 = var4;
                class83.method658();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1126--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ds.aq(ILcy;ZB)I")
    public static int method2395(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1126 -= 2;
            int var3 = field1125[Statics.field1126];
            int var4 = field1125[Statics.field1126 + 1];
            if (!client.field725) {
                client.field746 = var3;
                client.field769 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1125[++Statics.field1126 - 1] = client.field746;
            return 1;
        } else if (arg0 == 5506) {
            field1125[++Statics.field1126 - 1] = client.field769;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1125[--Statics.field1126];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field753 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1125[++Statics.field1126 - 1] = client.field753;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.al(ILcy;ZI)I")
    public static int method309(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field724 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gp.ah(II)I")
    public static int method3447(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("ai.av(IB)I")
    public static int method620(int arg0) {
        return (int) ((Math.log((double) arg0) / field1121 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("le.ax(ILcy;ZB)I")
    public static int method5899(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1126 -= 2;
            client.field770 = (short) method3447(field1125[Statics.field1126]);
            if (client.field770 <= 0) {
                client.field770 = 256;
            }
            client.field929 = (short) method3447(field1125[Statics.field1126 + 1]);
            if (client.field929 <= 0) {
                client.field929 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1126 -= 2;
            client.field930 = (short) field1125[Statics.field1126];
            if (client.field930 <= 0) {
                client.field930 = 256;
            }
            client.field936 = (short) field1125[Statics.field1126 + 1];
            if (client.field936 <= 0) {
                client.field936 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1126 -= 4;
            client.field932 = (short) field1125[Statics.field1126];
            if (client.field932 <= 0) {
                client.field932 = 1;
            }
            client.field933 = (short) field1125[Statics.field1126 + 1];
            if (client.field933 <= 0) {
                client.field933 = 32767;
            } else if (client.field933 < client.field932) {
                client.field933 = client.field932;
            }
            client.field939 = (short) field1125[Statics.field1126 + 2];
            if (client.field939 <= 0) {
                client.field939 = 1;
            }
            client.field935 = (short) field1125[Statics.field1126 + 3];
            if (client.field935 <= 0) {
                client.field935 = 32767;
            } else if (client.field935 < client.field939) {
                client.field935 = client.field939;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field850 == null) {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                client.method3849(0, 0, client.field850.field2620, client.field850.field2622, false);
                field1125[++Statics.field1126 - 1] = client.field925;
                field1125[++Statics.field1126 - 1] = client.field937;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1125[++Statics.field1126 - 1] = client.field930;
            field1125[++Statics.field1126 - 1] = client.field936;
            return 1;
        } else if (arg0 == 6205) {
            field1125[++Statics.field1126 - 1] = method620(client.field770);
            field1125[++Statics.field1126 - 1] = method620(client.field929);
            return 1;
        } else if (arg0 == 6220) {
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1125[++Statics.field1126 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1125[++Statics.field1126 - 1] = Statics.field1642;
            return 1;
        } else if (arg0 == 6223) {
            field1125[++Statics.field1126 - 1] = Statics.field475;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jq.as(ILcy;ZI)I")
    public static int method4409(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1125[++Statics.field1126 - 1] = class81.method1049() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class81 var3 = class81.method2411();
            if (var3 == null) {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = 0;
                field1127[++Statics.field2559 - 1] = "";
                field1125[++Statics.field1126 - 1] = 0;
                field1125[++Statics.field1126 - 1] = 0;
                field1127[++Statics.field2559 - 1] = "";
            } else {
                field1125[++Statics.field1126 - 1] = var3.field1044;
                field1125[++Statics.field1126 - 1] = var3.field1052;
                field1127[++Statics.field2559 - 1] = var3.field1055;
                field1125[++Statics.field1126 - 1] = var3.field1056;
                field1125[++Statics.field1126 - 1] = var3.field1053;
                field1127[++Statics.field2559 - 1] = var3.field1054;
            }
            return 1;
        } else if (arg0 == 6502) {
            class81 var4 = class81.method703();
            if (var4 == null) {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = 0;
                field1127[++Statics.field2559 - 1] = "";
                field1125[++Statics.field1126 - 1] = 0;
                field1125[++Statics.field1126 - 1] = 0;
                field1127[++Statics.field2559 - 1] = "";
            } else {
                field1125[++Statics.field1126 - 1] = var4.field1044;
                field1125[++Statics.field1126 - 1] = var4.field1052;
                field1127[++Statics.field2559 - 1] = var4.field1055;
                field1125[++Statics.field1126 - 1] = var4.field1056;
                field1125[++Statics.field1126 - 1] = var4.field1053;
                field1127[++Statics.field2559 - 1] = var4.field1054;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1125[--Statics.field1126];
            class81 var6 = null;
            for (int var7 = 0; var7 < class81.field1057; var7++) {
                if (Statics.field2523[var7].field1044 == var5) {
                    var6 = Statics.field2523[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = 0;
                field1127[++Statics.field2559 - 1] = "";
                field1125[++Statics.field1126 - 1] = 0;
                field1125[++Statics.field1126 - 1] = 0;
                field1127[++Statics.field2559 - 1] = "";
            } else {
                field1125[++Statics.field1126 - 1] = var6.field1044;
                field1125[++Statics.field1126 - 1] = var6.field1052;
                field1127[++Statics.field2559 - 1] = var6.field1055;
                field1125[++Statics.field1126 - 1] = var6.field1056;
                field1125[++Statics.field1126 - 1] = var6.field1053;
                field1127[++Statics.field2559 - 1] = var6.field1054;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1126 -= 4;
            int var8 = field1125[Statics.field1126];
            boolean var9 = field1125[Statics.field1126 + 1] == 1;
            int var10 = field1125[Statics.field1126 + 2];
            boolean var11 = field1125[Statics.field1126 + 3] == 1;
            class81.method2943(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1125[--Statics.field1126];
            if (var12 >= 0 && var12 < class81.field1057) {
                class81 var13 = Statics.field2523[var12];
                field1125[++Statics.field1126 - 1] = var13.field1044;
                field1125[++Statics.field1126 - 1] = var13.field1052;
                field1127[++Statics.field2559 - 1] = var13.field1055;
                field1125[++Statics.field1126 - 1] = var13.field1056;
                field1125[++Statics.field1126 - 1] = var13.field1053;
                field1127[++Statics.field2559 - 1] = var13.field1054;
            } else {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = 0;
                field1127[++Statics.field2559 - 1] = "";
                field1125[++Statics.field1126 - 1] = 0;
                field1125[++Statics.field1126 - 1] = 0;
                field1127[++Statics.field2559 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field732 = field1125[--Statics.field1126] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1126 -= 2;
            int var14 = field1125[Statics.field1126];
            int var15 = field1125[Statics.field1126 + 1];
            class260 var16 = class260.method3743(var15);
            if (var16.method4230()) {
                field1127[++Statics.field2559 - 1] = class267.method2944(var14).method4454(var15, var16.field3327);
            } else {
                field1125[++Statics.field1126 - 1] = class267.method2944(var14).method4453(var15, var16.field3330);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1126 -= 2;
            int var17 = field1125[Statics.field1126];
            int var18 = field1125[Statics.field1126 + 1];
            class260 var19 = class260.method3743(var18);
            if (var19.method4230()) {
                field1127[++Statics.field2559 - 1] = class264.method3595(var17).method4335(var18, var19.field3327);
            } else {
                field1125[++Statics.field1126 - 1] = class264.method3595(var17).method4326(var18, var19.field3330);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1126 -= 2;
            int var20 = field1125[Statics.field1126];
            int var21 = field1125[Statics.field1126 + 1];
            class260 var22 = class260.method3743(var21);
            if (var22.method4230()) {
                field1127[++Statics.field2559 - 1] = class265.method136(var20).method4380(var21, var22.field3327);
            } else {
                field1125[++Statics.field1126 - 1] = class265.method136(var20).method4384(var21, var22.field3330);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1126 -= 2;
            int var23 = field1125[Statics.field1126];
            int var24 = field1125[Statics.field1126 + 1];
            class260 var25 = class260.method3743(var24);
            if (var25.method4230()) {
                field1127[++Statics.field2559 - 1] = class261.method3336(var23).method4257(var24, var25.field3327);
            } else {
                field1125[++Statics.field1126 - 1] = class261.method3336(var23).method4239(var24, var25.field3330);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1125[++Statics.field1126 - 1] = client.field867 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1125[++Statics.field1126 - 1] = client.field677 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field2559--;
            Statics.field1126--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field2559--;
            Statics.field1126--;
            return 1;
        } else if (arg0 == 6524) {
            field1125[++Statics.field1126 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1125[++Statics.field1126 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1125[++Statics.field1126 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bf.az(ILcy;ZI)I")
    public static int method1180(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field2544;
            int var4 = (Statics.field141.field995 >> 7) + Statics.field348;
            int var5 = (Statics.field141.field1024 >> 7) + Statics.field263;
            client.method263().method5998(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1125[--Statics.field1126];
            String var7 = "";
            class36 var8 = client.method263().method5972(var6);
            if (var8 != null) {
                var7 = var8.method346();
            }
            field1127[++Statics.field2559 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1125[--Statics.field1126];
            client.method263().method6057(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1125[++Statics.field1126 - 1] = client.method263().method5969();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1125[--Statics.field1126];
            client.method263().method5966(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1125[++Statics.field1126 - 1] = client.method263().method5971() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class223 var11 = new class223(field1125[--Statics.field1126]);
            client.method263().method5973(var11.field2563, var11.field2565);
            return 1;
        } else if (arg0 == 6607) {
            class223 var12 = new class223(field1125[--Statics.field1126]);
            client.method263().method6110(var12.field2563, var12.field2565);
            return 1;
        } else if (arg0 == 6608) {
            class223 var13 = new class223(field1125[--Statics.field1126]);
            client.method263().method5975(var13.field2568, var13.field2563, var13.field2565);
            return 1;
        } else if (arg0 == 6609) {
            class223 var14 = new class223(field1125[--Statics.field1126]);
            client.method263().method6119(var14.field2568, var14.field2563, var14.field2565);
            return 1;
        } else if (arg0 == 6610) {
            field1125[++Statics.field1126 - 1] = client.method263().method6101();
            field1125[++Statics.field1126 - 1] = client.method263().method5978();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1125[--Statics.field1126];
            class36 var16 = client.method263().method5972(var15);
            if (var16 == null) {
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = var16.method354().method3725();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1125[--Statics.field1126];
            class36 var18 = client.method263().method5972(var17);
            if (var18 == null) {
                field1125[++Statics.field1126 - 1] = 0;
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = (var18.method340() - var18.method380() + 1) * 64;
                field1125[++Statics.field1126 - 1] = (var18.method350() - var18.method349() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1125[--Statics.field1126];
            class36 var20 = client.method263().method5972(var19);
            if (var20 == null) {
                field1125[++Statics.field1126 - 1] = 0;
                field1125[++Statics.field1126 - 1] = 0;
                field1125[++Statics.field1126 - 1] = 0;
                field1125[++Statics.field1126 - 1] = 0;
            } else {
                field1125[++Statics.field1126 - 1] = var20.method380() * 64;
                field1125[++Statics.field1126 - 1] = var20.method349() * 64;
                field1125[++Statics.field1126 - 1] = var20.method340() * 64 + 64 - 1;
                field1125[++Statics.field1126 - 1] = var20.method350() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1125[--Statics.field1126];
            class36 var22 = client.method263().method5972(var21);
            if (var22 == null) {
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = var22.method389();
            }
            return 1;
        } else if (arg0 == 6615) {
            class223 var23 = client.method263().method6074();
            if (var23 == null) {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = var23.field2563;
                field1125[++Statics.field1126 - 1] = var23.field2565;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1125[++Statics.field1126 - 1] = client.method263().method5956();
            return 1;
        } else if (arg0 == 6617) {
            class223 var24 = new class223(field1125[--Statics.field1126]);
            class36 var25 = client.method263().method5960();
            if (var25 == null) {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method338(var24.field2568, var24.field2563, var24.field2565);
            if (var26 == null) {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = var26[0];
                field1125[++Statics.field1126 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class223 var27 = new class223(field1125[--Statics.field1126]);
            class36 var28 = client.method263().method5960();
            if (var28 == null) {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = -1;
                return 1;
            }
            class223 var29 = var28.method378(var27.field2563, var27.field2565);
            if (var29 == null) {
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = var29.method3725();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1126 -= 2;
            int var30 = field1125[Statics.field1126];
            class223 var31 = new class223(field1125[Statics.field1126 + 1]);
            method1006(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1126 -= 2;
            int var32 = field1125[Statics.field1126];
            class223 var33 = new class223(field1125[Statics.field1126 + 1]);
            method1006(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1126 -= 2;
            int var34 = field1125[Statics.field1126];
            class223 var35 = new class223(field1125[Statics.field1126 + 1]);
            class36 var36 = client.method263().method5972(var34);
            if (var36 == null) {
                field1125[++Statics.field1126 - 1] = 0;
                return 1;
            } else {
                field1125[++Statics.field1126 - 1] = var36.method336(var35.field2568, var35.field2563, var35.field2565) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1125[++Statics.field1126 - 1] = client.method263().method6137();
            field1125[++Statics.field1126 - 1] = client.method263().method5981();
            return 1;
        } else if (arg0 == 6623) {
            class223 var37 = new class223(field1125[--Statics.field1126]);
            class36 var38 = client.method263().method5953(var37.field2568, var37.field2563, var37.field2565);
            if (var38 == null) {
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = var38.method333();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method263().method5982(field1125[--Statics.field1126]);
            return 1;
        } else if (arg0 == 6625) {
            client.method263().method6072();
            return 1;
        } else if (arg0 == 6626) {
            client.method263().method5961(field1125[--Statics.field1126]);
            return 1;
        } else if (arg0 == 6627) {
            client.method263().method5985();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1125[--Statics.field1126] == 1;
            client.method263().method5986(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1125[--Statics.field1126];
            client.method263().method5987(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1125[--Statics.field1126];
            client.method263().method5988(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method263().method5989();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1125[--Statics.field1126] == 1;
            client.method263().method6058(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1126 -= 2;
            int var43 = field1125[Statics.field1126];
            boolean var44 = field1125[Statics.field1126 + 1] == 1;
            client.method263().method5991(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1126 -= 2;
            int var45 = field1125[Statics.field1126];
            boolean var46 = field1125[Statics.field1126 + 1] == 1;
            client.method263().method5992(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1125[++Statics.field1126 - 1] = client.method263().method6075() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = client.method263().method5951(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1125[--Statics.field1126];
            field1125[++Statics.field1126 - 1] = client.method263().method6005(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1126 -= 2;
            int var49 = field1125[Statics.field1126];
            class223 var50 = new class223(field1125[Statics.field1126 + 1]);
            class223 var51 = client.method263().method6023(var49, var50);
            if (var51 == null) {
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = var51.method3725();
            }
            return 1;
        } else if (arg0 == 6639) {
            class44 var52 = client.method263().method6017();
            if (var52 == null) {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = var52.method250();
                field1125[++Statics.field1126 - 1] = var52.field314.method3725();
            }
            return 1;
        } else if (arg0 == 6640) {
            class44 var53 = client.method263().method6135();
            if (var53 == null) {
                field1125[++Statics.field1126 - 1] = -1;
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = var53.method250();
                field1125[++Statics.field1126 - 1] = var53.field314.method3725();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1125[--Statics.field1126];
            class252 var55 = Statics.method285(var54);
            if (var55.field3246 == null) {
                field1127[++Statics.field2559 - 1] = "";
            } else {
                field1127[++Statics.field2559 - 1] = var55.field3246;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1125[--Statics.field1126];
            class252 var57 = Statics.method285(var56);
            field1125[++Statics.field1126 - 1] = var57.field3245;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1125[--Statics.field1126];
            class252 var59 = Statics.method285(var58);
            if (var59 == null) {
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = var59.field3257;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1125[--Statics.field1126];
            class252 var61 = Statics.method285(var60);
            if (var61 == null) {
                field1125[++Statics.field1126 - 1] = -1;
            } else {
                field1125[++Statics.field1126 - 1] = var61.field3241;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1125[++Statics.field1126 - 1] = Statics.field1928.field378;
            return 1;
        } else if (arg0 == 6698) {
            field1125[++Statics.field1126 - 1] = Statics.field1928.field376.method3725();
            return 1;
        } else if (arg0 == 6699) {
            field1125[++Statics.field1126 - 1] = Statics.field1928.field377.method3725();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iz.ad(IB)V")
    public static void method3852(int arg0) {
        if (arg0 == -1 || !class227.method417(arg0)) {
            return;
        }
        class227[] var1 = Statics.field2597[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class227 var3 = var1[var2];
            if (var3.field2693 != null) {
                class72 var4 = new class72();
                var4.field586 = var3;
                var4.field601 = var3.field2693;
                method4705(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("be.ai(ILhg;ZB)V")
    public static void method1006(int arg0, class223 arg1, boolean arg2) {
        class36 var3 = client.method263().method5972(arg0);
        int var4 = Statics.field141.field657;
        int var5 = (Statics.field141.field995 >> 7) + Statics.field348;
        int var6 = (Statics.field141.field1024 >> 7) + Statics.field263;
        class223 var7 = new class223(var4, var5, var6);
        client.method263().method6065(var3, var7, arg1, arg2);
    }
}
