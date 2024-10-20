package deob;

import java.util.Calendar;

@ObfuscatedName("ce")
public class class86 {

    @ObfuscatedName("ce.p")
    public static int[] field1123 = new int[5];

    @ObfuscatedName("ce.g")
    public static int[][] field1124 = new int[5][5000];

    @ObfuscatedName("ce.n")
    public static int[] field1125 = new int[1000];

    @ObfuscatedName("ce.a")
    public static String[] field1132 = new String[1000];

    @ObfuscatedName("ce.w")
    public static int field1120 = 0;

    @ObfuscatedName("ce.y")
    public static class66[] field1128 = new class66[50];

    @ObfuscatedName("ce.k")
    public static Calendar field1131 = Calendar.getInstance();

    @ObfuscatedName("ce.r")
    public static final String[] field1130 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ce.v")
    public static boolean field1126 = false;

    @ObfuscatedName("ce.d")
    public static boolean field1119 = false;

    @ObfuscatedName("ce.e")
    public static int field1133 = 0;

    @ObfuscatedName("ce.b")
    public static final double field1127 = Math.log(2.0D);

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.m(Lbu;I)V")
    public static void method1066(class72 arg0) {
        method408(arg0, 500000);
    }

    @ObfuscatedName("ar.o(Lbu;II)V")
    public static void method408(class72 arg0, int arg1) {
        Object[] var2 = arg0.field600;
        class102 var4;
        if (class304.method3999(arg0.field604)) {
            Statics.field391 = (class51) var2[0];
            class252 var3 = class252.method1412(Statics.field391.field375);
            var4 = class102.method32(arg0.field604, var3.field3245, var3.field3261);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class102.method251(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field1967 = 0;
        Statics.field377 = 0;
        int var6 = -1;
        int[] var7 = var4.field1311;
        int[] var8 = var4.field1312;
        byte var9 = -1;
        field1120 = 0;
        field1126 = false;
        try {
            Statics.field1121 = new int[var4.field1314];
            int var10 = 0;
            Statics.field1122 = new String[var4.field1315];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field596;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field603;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field593 == null ? -1 : arg0.field593.field2617;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field597;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field593 == null ? -1 : arg0.field593.field2691;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field599 == null ? -1 : arg0.field599.field2617;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field599 == null ? -1 : arg0.field599.field2691;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field606;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field608;
                    }
                    Statics.field1121[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field602;
                    }
                    Statics.field1122[var11++] = var14;
                }
            }
            int var15 = 0;
            field1133 = arg0.field601;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1312[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method5160(var53, var4, var43);
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
                    field1125[++Statics.field1967 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1125[++Statics.field1967 - 1] = class222.field2562[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class222.field2562[var17] = field1125[--Statics.field1967];
                    client.method273(var17);
                } else if (var53 == 3) {
                    field1132[++Statics.field377 - 1] = var4.field1313[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field1967 -= 2;
                    if (field1125[Statics.field1967] != field1125[Statics.field1967 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field1967 -= 2;
                    if (field1125[Statics.field1967] == field1125[Statics.field1967 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field1967 -= 2;
                    if (field1125[Statics.field1967] < field1125[Statics.field1967 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field1967 -= 2;
                    if (field1125[Statics.field1967] > field1125[Statics.field1967 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1120 == 0) {
                        return;
                    }
                    class66 var18 = field1128[--field1120];
                    var4 = var18.field541;
                    var7 = var4.field1311;
                    var8 = var4.field1312;
                    var6 = var18.field538;
                    Statics.field1121 = var18.field539;
                    Statics.field1122 = var18.field540;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1125[++Statics.field1967 - 1] = class222.method3842(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class222.method4248(var20, field1125[--Statics.field1967]);
                } else if (var53 == 31) {
                    Statics.field1967 -= 2;
                    if (field1125[Statics.field1967] <= field1125[Statics.field1967 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field1967 -= 2;
                    if (field1125[Statics.field1967] >= field1125[Statics.field1967 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1125[++Statics.field1967 - 1] = Statics.field1121[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field1121[var8[var6]] = field1125[--Statics.field1967];
                } else if (var53 == 35) {
                    field1132[++Statics.field377 - 1] = Statics.field1122[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field1122[var8[var6]] = field1132[--Statics.field377];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field377 -= var21;
                    String var22 = class301.method4287(field1132, Statics.field377, var21);
                    field1132[++Statics.field377 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field1967--;
                } else if (var53 == 39) {
                    Statics.field377--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class102 var24 = class102.method251(var23);
                    int[] var25 = new int[var24.field1314];
                    String[] var26 = new String[var24.field1315];
                    for (int var27 = 0; var27 < var24.field1319; var27++) {
                        var25[var27] = field1125[Statics.field1967 - var24.field1319 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1317; var28++) {
                        var26[var28] = field1132[Statics.field377 - var24.field1317 + var28];
                    }
                    Statics.field1967 -= var24.field1319;
                    Statics.field377 -= var24.field1317;
                    class66 var29 = new class66();
                    var29.field541 = var4;
                    var29.field538 = var6;
                    var29.field539 = Statics.field1121;
                    var29.field540 = Statics.field1122;
                    field1128[++field1120 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1311;
                    var8 = var24.field1312;
                    var6 = -1;
                    Statics.field1121 = var25;
                    Statics.field1122 = var26;
                } else if (var53 == 42) {
                    field1125[++Statics.field1967 - 1] = Statics.field1201.method2071(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field1201.method2070(var8[var6], field1125[--Statics.field1967]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1125[--Statics.field1967];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1123[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1124[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1125[--Statics.field1967];
                    if (var36 < 0 || var36 >= field1123[var35]) {
                        throw new RuntimeException();
                    }
                    field1125[++Statics.field1967 - 1] = field1124[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field1967 -= 2;
                    int var38 = field1125[Statics.field1967];
                    if (var38 < 0 || var38 >= field1123[var37]) {
                        throw new RuntimeException();
                    }
                    field1124[var37][var38] = field1125[Statics.field1967 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field1201.method2105(var8[var6]);
                    if (var39 == null) {
                        var39 = class234.field2799;
                    }
                    field1132[++Statics.field377 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field1201.method2079(var8[var6], field1132[--Statics.field377]);
                } else if (var53 == 49) {
                    String var40 = Statics.field1201.method2073(var8[var6]);
                    field1132[++Statics.field377 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field1201.method2096(var8[var6], field1132[--Statics.field377]);
                } else if (var53 == 60) {
                    class326 var41 = var4.field1318[var8[var6]];
                    class189 var42 = (class189) var41.method5615((long) field1125[--Statics.field1967]);
                    if (var42 != null) {
                        var6 += var42.field2150;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2152).append(" ");
            for (int var47 = field1120 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1128[var47].field541.field2152).append(" ");
            }
            var46.append("").append(var9);
            class351.method3425(var46.toString(), var51);
        } finally {
            if (field1126) {
                field1119 = true;
                client.method3689();
                field1119 = false;
                field1126 = false;
            }
        }
    }

    @ObfuscatedName("ky.q(ILcs;ZI)I")
    public static int method5160(int arg0, class102 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method1045(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1174(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method4099(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method3876(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method108(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method1031(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method3586(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method2191(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method1617(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method75(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return Statics.method2377(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1174(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method4099(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method3876(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method108(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method1031(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3696(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method3296(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method165(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method600(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return Statics.method2377(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method692(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method3591(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method3117(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method2050(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method43(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method4486(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method1035(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return Statics.method2616(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method2602(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method3090(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method3869(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method3870(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method4722(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method1968(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method1689(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method236(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.j(ILcs;ZI)I")
    public static int method1045(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1967 -= 3;
            int var3 = field1125[Statics.field1967];
            int var4 = field1125[Statics.field1967 + 1];
            int var5 = field1125[Statics.field1967 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class227 var6 = class227.method403(var3);
            if (var6.field2733 == null) {
                var6.field2733 = new class227[var5 + 1];
            }
            if (var6.field2733.length <= var5) {
                class227[] var7 = new class227[var5 + 1];
                for (int var8 = 0; var8 < var6.field2733.length; var8++) {
                    var7[var8] = var6.field2733[var8];
                }
                var6.field2733 = var7;
            }
            if (var5 > 0 && var6.field2733[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class227 var9 = new class227();
            var9.field2605 = var4;
            var9.field2622 = var9.field2617 = var6.field2617;
            var9.field2691 = var5;
            var9.field2602 = true;
            var6.field2733[var5] = var9;
            if (arg2) {
                Statics.field408 = var9;
            } else {
                Statics.field545 = var9;
            }
            client.method3872(var6);
            return 1;
        } else if (arg0 == 101) {
            class227 var10 = arg2 ? Statics.field408 : Statics.field545;
            class227 var11 = class227.method403(var10.field2617);
            var11.field2733[var10.field2691] = null;
            client.method3872(var11);
            return 1;
        } else if (arg0 == 102) {
            class227 var12 = class227.method403(field1125[--Statics.field1967]);
            var12.field2733 = null;
            client.method3872(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1967 -= 2;
            int var13 = field1125[Statics.field1967];
            int var14 = field1125[Statics.field1967 + 1];
            class227 var15 = class227.method221(var13, var14);
            if (var15 == null || var14 == -1) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = 1;
                if (arg2) {
                    Statics.field408 = var15;
                } else {
                    Statics.field545 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class227 var16 = class227.method403(field1125[--Statics.field1967]);
            if (var16 == null) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = 1;
                if (arg2) {
                    Statics.field408 = var16;
                } else {
                    Statics.field545 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bj.p(ILcs;ZI)I")
    public static int method1174(int arg0, class102 arg1, boolean arg2) {
        int var3 = -1;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1125[--Statics.field1967];
            var4 = class227.method403(var3);
        } else {
            var4 = arg2 ? Statics.field408 : Statics.field545;
        }
        if (arg0 == 1000) {
            Statics.field1967 -= 4;
            var4.field2612 = field1125[Statics.field1967];
            var4.field2613 = field1125[Statics.field1967 + 1];
            var4.field2608 = field1125[Statics.field1967 + 2];
            var4.field2609 = field1125[Statics.field1967 + 3];
            client.method3872(var4);
            Statics.field170.method1201(var4);
            if (var3 != -1 && var4.field2605 == 0) {
                client.method240(Statics.field2595[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1967 -= 4;
            var4.field2614 = field1125[Statics.field1967];
            var4.field2653 = field1125[Statics.field1967 + 1];
            var4.field2610 = field1125[Statics.field1967 + 2];
            var4.field2597 = field1125[Statics.field1967 + 3];
            client.method3872(var4);
            Statics.field170.method1201(var4);
            if (var3 != -1 && var4.field2605 == 0) {
                client.method240(Statics.field2595[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1125[--Statics.field1967] == 1;
            if (var4.field2721 != var5) {
                var4.field2721 = var5;
                client.method3872(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2637 = field1125[--Statics.field1967] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2744 = field1125[--Statics.field1967] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("il.g(ILcs;ZI)I")
    public static int method4099(int arg0, class102 arg1, boolean arg2) {
        int var3 = -1;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1125[--Statics.field1967];
            var4 = class227.method403(var3);
        } else {
            var4 = arg2 ? Statics.field408 : Statics.field545;
        }
        if (arg0 == 1100) {
            Statics.field1967 -= 2;
            var4.field2624 = field1125[Statics.field1967];
            if (var4.field2624 > var4.field2626 - var4.field2618) {
                var4.field2624 = var4.field2626 - var4.field2618;
            }
            if (var4.field2624 < 0) {
                var4.field2624 = 0;
            }
            var4.field2625 = field1125[Statics.field1967 + 1];
            if (var4.field2625 > var4.field2627 - var4.field2619) {
                var4.field2625 = var4.field2627 - var4.field2619;
            }
            if (var4.field2625 < 0) {
                var4.field2625 = 0;
            }
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2628 = field1125[--Statics.field1967];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2727 = field1125[--Statics.field1967] == 1;
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2593 = field1125[--Statics.field1967];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2636 = field1125[--Statics.field1967];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2638 = field1125[--Statics.field1967];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2640 = field1125[--Statics.field1967];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2641 = field1125[--Statics.field1967] == 1;
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2646 = 1;
            var4.field2594 = field1125[--Statics.field1967];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1967 -= 6;
            var4.field2652 = field1125[Statics.field1967];
            var4.field2647 = field1125[Statics.field1967 + 1];
            var4.field2654 = field1125[Statics.field1967 + 2];
            var4.field2655 = field1125[Statics.field1967 + 3];
            var4.field2656 = field1125[Statics.field1967 + 4];
            var4.field2739 = field1125[Statics.field1967 + 5];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1125[--Statics.field1967];
            if (var4.field2650 != var5) {
                var4.field2650 = var5;
                var4.field2731 = 0;
                var4.field2732 = 0;
                client.method3872(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2730 = field1125[--Statics.field1967] == 1;
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1132[--Statics.field377];
            if (!var6.equals(var4.field2687)) {
                var4.field2687 = var6;
                client.method3872(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2663 = field1125[--Statics.field1967];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1967 -= 3;
            var4.field2667 = field1125[Statics.field1967];
            var4.field2668 = field1125[Statics.field1967 + 1];
            var4.field2694 = field1125[Statics.field1967 + 2];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2669 = field1125[--Statics.field1967] == 1;
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2632 = field1125[--Statics.field1967];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2623 = field1125[--Statics.field1967];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2723 = field1125[--Statics.field1967] == 1;
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2645 = field1125[--Statics.field1967] == 1;
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1967 -= 2;
            var4.field2626 = field1125[Statics.field1967];
            var4.field2627 = field1125[Statics.field1967 + 1];
            client.method3872(var4);
            if (var3 != -1 && var4.field2605 == 0) {
                client.method240(Statics.field2595[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method395(var4.field2617, var4.field2691);
            client.field840 = var4;
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2599 = field1125[--Statics.field1967];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2629 = field1125[--Statics.field1967];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2743 = field1125[--Statics.field1967];
            client.method3872(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1125[--Statics.field1967];
            class333 var8 = (class333) class205.method3095(class333.method3655(), var7);
            if (var8 != null) {
                var4.field2633 = var8;
                client.method3872(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1125[--Statics.field1967] == 1;
            var4.field2634 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1125[--Statics.field1967] == 1;
            var4.field2661 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("is.n(ILcs;ZI)I")
    public static int method3876(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method403(field1125[--Statics.field1967]);
        } else {
            var3 = arg2 ? Statics.field408 : Statics.field545;
        }
        client.method3872(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1967 -= 2;
            int var4 = field1125[Statics.field1967];
            int var5 = field1125[Statics.field1967 + 1];
            var3.field2729 = var4;
            var3.field2726 = var5;
            class265 var6 = class265.method4218(var4);
            var3.field2654 = var6.field3448;
            var3.field2655 = var6.field3461;
            var3.field2656 = var6.field3449;
            var3.field2652 = var6.field3451;
            var3.field2647 = var6.field3452;
            var3.field2739 = var6.field3447;
            if (arg0 == 1205) {
                var3.field2662 = 0;
            } else if (arg0 == 1212 | var6.field3439 == 1) {
                var3.field2662 = 1;
            } else {
                var3.field2662 = 2;
            }
            if (var3.field2658 > 0) {
                var3.field2739 = var3.field2739 * 32 / var3.field2658;
            } else if (var3.field2614 > 0) {
                var3.field2739 = var3.field2739 * 32 / var3.field2614;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2646 = 2;
            var3.field2594 = field1125[--Statics.field1967];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2646 = 3;
            var3.field2594 = Statics.field455.field635.method3742();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.u(ILcs;ZI)I")
    public static int method108(int arg0, class102 arg1, boolean arg2) {
        boolean var3 = true;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class227.method403(field1125[--Statics.field1967]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field408 : Statics.field545;
        }
        if (arg0 == 1300) {
            int var5 = field1125[--Statics.field1967] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3792(var5, field1132[--Statics.field377]);
                return 1;
            } else {
                Statics.field377--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1967 -= 2;
            int var6 = field1125[Statics.field1967];
            int var7 = field1125[Statics.field1967 + 1];
            var4.field2683 = class227.method221(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2606 = field1125[--Statics.field1967] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2685 = field1125[--Statics.field1967];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2686 = field1125[--Statics.field1967];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2603 = field1132[--Statics.field377];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2688 = field1132[--Statics.field377];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2695 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2745 = field1125[--Statics.field1967] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field1967--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1967 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1125[Statics.field1967 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1125[Statics.field1967 + var10];
                        var9[var10 / 2] = (byte) field1125[Statics.field1967 + var10 + 1];
                    }
                }
            } else {
                Statics.field1967 -= 2;
                var8 = new byte[] { (byte) field1125[Statics.field1967] };
                var9 = new byte[] { (byte) field1125[Statics.field1967 + 1] };
            }
            int var11 = field1125[--Statics.field1967] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method1616(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1967 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1125[Statics.field1967] };
            byte[] var14 = new byte[] { (byte) field1125[Statics.field1967 + 1] };
            method1616(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1967 -= 3;
            int var15 = field1125[Statics.field1967] - 1;
            int var16 = field1125[Statics.field1967 + 1];
            int var17 = field1125[Statics.field1967 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method309(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1125[--Statics.field1967];
            int var20 = field1125[--Statics.field1967];
            method309(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1967--;
            int var21 = field1125[Statics.field1967] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method5038(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method5038(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.a(Lhd;I[B[BI)V")
    public static final void method1616(class227 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2648 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2648 = new byte[11][];
            arg0.field2679 = new byte[11][];
            arg0.field2680 = new int[11];
            arg0.field2681 = new int[11];
        }
        arg0.field2648[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2710 = false;
            for (int var4 = 0; var4 < arg0.field2648.length; var4++) {
                if (arg0.field2648[var4] != null) {
                    arg0.field2710 = true;
                    break;
                }
            }
        } else {
            arg0.field2710 = true;
        }
        arg0.field2679[arg1] = arg3;
    }

    @ObfuscatedName("ag.z(Lhd;IIII)V")
    public static final void method309(class227 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2680 == null) {
            throw new RuntimeException();
        }
        arg0.field2680[arg1] = arg2;
        arg0.field2681[arg1] = arg3;
    }

    @ObfuscatedName("ke.w(Lhd;II)V")
    public static final void method5038(class227 arg0, int arg1) {
        if (arg0.field2648 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2724 == null) {
            arg0.field2724 = new int[arg0.field2648.length];
        }
        arg0.field2724[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("bo.y(ILcs;ZI)I")
    public static int method1031(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method403(field1125[--Statics.field1967]);
        } else {
            var3 = arg2 ? Statics.field408 : Statics.field545;
        }
        String var4 = field1132[--Statics.field377];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1125[--Statics.field1967];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1125[--Statics.field1967];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1132[--Statics.field377];
            } else {
                var7[var8] = Integer.valueOf(field1125[--Statics.field1967]);
            }
        }
        int var9 = field1125[--Statics.field1967];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2706 = var7;
        } else if (arg0 == 1401) {
            var3.field2719 = var7;
        } else if (arg0 == 1402) {
            var3.field2741 = var7;
        } else if (arg0 == 1403) {
            var3.field2738 = var7;
        } else if (arg0 == 1404) {
            var3.field2697 = var7;
        } else if (arg0 == 1405) {
            var3.field2698 = var7;
        } else if (arg0 == 1406) {
            var3.field2701 = var7;
        } else if (arg0 == 1407) {
            var3.field2660 = var7;
            var3.field2703 = var5;
        } else if (arg0 == 1408) {
            var3.field2708 = var7;
        } else if (arg0 == 1409) {
            var3.field2620 = var7;
        } else if (arg0 == 1410) {
            var3.field2699 = var7;
        } else if (arg0 == 1411) {
            var3.field2692 = var7;
        } else if (arg0 == 1412) {
            var3.field2696 = var7;
        } else if (arg0 == 1414) {
            var3.field2704 = var7;
            var3.field2705 = var5;
        } else if (arg0 == 1415) {
            var3.field2715 = var7;
            var3.field2611 = var5;
        } else if (arg0 == 1416) {
            var3.field2700 = var7;
        } else if (arg0 == 1417) {
            var3.field2643 = var7;
        } else if (arg0 == 1418) {
            var3.field2711 = var7;
        } else if (arg0 == 1419) {
            var3.field2712 = var7;
        } else if (arg0 == 1420) {
            var3.field2713 = var7;
        } else if (arg0 == 1421) {
            var3.field2714 = var7;
        } else if (arg0 == 1422) {
            var3.field2693 = var7;
        } else if (arg0 == 1423) {
            var3.field2716 = var7;
        } else if (arg0 == 1424) {
            var3.field2666 = var7;
        } else if (arg0 == 1425) {
            var3.field2604 = var7;
        } else if (arg0 == 1426) {
            var3.field2720 = var7;
        } else if (arg0 == 1427) {
            var3.field2718 = var7;
        } else {
            return 2;
        }
        var3.field2689 = true;
        return 1;
    }

    @ObfuscatedName("hm.c(ILcs;ZI)I")
    public static int method3586(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field408 : Statics.field545;
        if (arg0 == 1500) {
            field1125[++Statics.field1967 - 1] = var3.field2616;
            return 1;
        } else if (arg0 == 1501) {
            field1125[++Statics.field1967 - 1] = var3.field2678;
            return 1;
        } else if (arg0 == 1502) {
            field1125[++Statics.field1967 - 1] = var3.field2618;
            return 1;
        } else if (arg0 == 1503) {
            field1125[++Statics.field1967 - 1] = var3.field2619;
            return 1;
        } else if (arg0 == 1504) {
            field1125[++Statics.field1967 - 1] = var3.field2721 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1125[++Statics.field1967 - 1] = var3.field2622;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dm.h(ILcs;ZI)I")
    public static int method2191(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field408 : Statics.field545;
        if (arg0 == 1600) {
            field1125[++Statics.field1967 - 1] = var3.field2624;
            return 1;
        } else if (arg0 == 1601) {
            field1125[++Statics.field1967 - 1] = var3.field2625;
            return 1;
        } else if (arg0 == 1602) {
            field1132[++Statics.field377 - 1] = var3.field2687;
            return 1;
        } else if (arg0 == 1603) {
            field1125[++Statics.field1967 - 1] = var3.field2626;
            return 1;
        } else if (arg0 == 1604) {
            field1125[++Statics.field1967 - 1] = var3.field2627;
            return 1;
        } else if (arg0 == 1605) {
            field1125[++Statics.field1967 - 1] = var3.field2739;
            return 1;
        } else if (arg0 == 1606) {
            field1125[++Statics.field1967 - 1] = var3.field2654;
            return 1;
        } else if (arg0 == 1607) {
            field1125[++Statics.field1967 - 1] = var3.field2656;
            return 1;
        } else if (arg0 == 1608) {
            field1125[++Statics.field1967 - 1] = var3.field2655;
            return 1;
        } else if (arg0 == 1609) {
            field1125[++Statics.field1967 - 1] = var3.field2593;
            return 1;
        } else if (arg0 == 1610) {
            field1125[++Statics.field1967 - 1] = var3.field2743;
            return 1;
        } else if (arg0 == 1611) {
            field1125[++Statics.field1967 - 1] = var3.field2628;
            return 1;
        } else if (arg0 == 1612) {
            field1125[++Statics.field1967 - 1] = var3.field2629;
            return 1;
        } else if (arg0 == 1613) {
            field1125[++Statics.field1967 - 1] = var3.field2633.method21();
            return 1;
        } else if (arg0 == 1614) {
            field1125[++Statics.field1967 - 1] = var3.field2661 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.k(ILcs;ZI)I")
    public static int method1617(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field408 : Statics.field545;
        if (arg0 == 1700) {
            field1125[++Statics.field1967 - 1] = var3.field2729;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2729 == -1) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = var3.field2726;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1125[++Statics.field1967 - 1] = var3.field2691;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("u.r(ILcs;ZI)I")
    public static int method75(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field408 : Statics.field545;
        if (arg0 == 1800) {
            field1125[++Statics.field1967 - 1] = class228.method540(client.method728(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1125[--Statics.field1967];
            int var5 = var4 - 1;
            if (var3.field2695 == null || var5 >= var3.field2695.length || var3.field2695[var5] == null) {
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1132[++Statics.field377 - 1] = var3.field2695[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2603 == null) {
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1132[++Statics.field377 - 1] = var3.field2603;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("he.e(ILcs;ZI)I")
    public static int method3696(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method403(field1125[--Statics.field1967]);
        if (arg0 == 2500) {
            field1125[++Statics.field1967 - 1] = var3.field2616;
            return 1;
        } else if (arg0 == 2501) {
            field1125[++Statics.field1967 - 1] = var3.field2678;
            return 1;
        } else if (arg0 == 2502) {
            field1125[++Statics.field1967 - 1] = var3.field2618;
            return 1;
        } else if (arg0 == 2503) {
            field1125[++Statics.field1967 - 1] = var3.field2619;
            return 1;
        } else if (arg0 == 2504) {
            field1125[++Statics.field1967 - 1] = var3.field2721 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1125[++Statics.field1967 - 1] = var3.field2622;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fb.l(ILcs;ZI)I")
    public static int method3296(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method403(field1125[--Statics.field1967]);
        if (arg0 == 2600) {
            field1125[++Statics.field1967 - 1] = var3.field2624;
            return 1;
        } else if (arg0 == 2601) {
            field1125[++Statics.field1967 - 1] = var3.field2625;
            return 1;
        } else if (arg0 == 2602) {
            field1132[++Statics.field377 - 1] = var3.field2687;
            return 1;
        } else if (arg0 == 2603) {
            field1125[++Statics.field1967 - 1] = var3.field2626;
            return 1;
        } else if (arg0 == 2604) {
            field1125[++Statics.field1967 - 1] = var3.field2627;
            return 1;
        } else if (arg0 == 2605) {
            field1125[++Statics.field1967 - 1] = var3.field2739;
            return 1;
        } else if (arg0 == 2606) {
            field1125[++Statics.field1967 - 1] = var3.field2654;
            return 1;
        } else if (arg0 == 2607) {
            field1125[++Statics.field1967 - 1] = var3.field2656;
            return 1;
        } else if (arg0 == 2608) {
            field1125[++Statics.field1967 - 1] = var3.field2655;
            return 1;
        } else if (arg0 == 2609) {
            field1125[++Statics.field1967 - 1] = var3.field2593;
            return 1;
        } else if (arg0 == 2610) {
            field1125[++Statics.field1967 - 1] = var3.field2743;
            return 1;
        } else if (arg0 == 2611) {
            field1125[++Statics.field1967 - 1] = var3.field2628;
            return 1;
        } else if (arg0 == 2612) {
            field1125[++Statics.field1967 - 1] = var3.field2629;
            return 1;
        } else if (arg0 == 2613) {
            field1125[++Statics.field1967 - 1] = var3.field2633.method21();
            return 1;
        } else if (arg0 == 2614) {
            field1125[++Statics.field1967 - 1] = var3.field2661 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.t(ILcs;ZI)I")
    public static int method165(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class227 var3 = class227.method403(field1125[--Statics.field1967]);
            field1125[++Statics.field1967 - 1] = var3.field2729;
            return 1;
        } else if (arg0 == 2701) {
            class227 var4 = class227.method403(field1125[--Statics.field1967]);
            if (var4.field2729 == -1) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = var4.field2726;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1125[--Statics.field1967];
            class71 var6 = (class71) client.field835.method5641((long) var5);
            if (var6 == null) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1125[++Statics.field1967 - 1] = client.field834;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.x(ILcs;ZB)I")
    public static int method600(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method403(field1125[--Statics.field1967]);
        if (arg0 == 2800) {
            field1125[++Statics.field1967 - 1] = class228.method540(client.method728(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1125[--Statics.field1967];
            int var5 = var4 - 1;
            if (var3.field2695 == null || var5 >= var3.field2695.length || var3.field2695[var5] == null) {
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1132[++Statics.field377 - 1] = var3.field2695[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2603 == null) {
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1132[++Statics.field377 - 1] = var3.field2603;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.ah(ILcs;ZI)I")
    public static int method692(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1132[--Statics.field377];
            class101.method1815(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1967 -= 2;
            client.method1038(Statics.field455, field1125[Statics.field1967], field1125[Statics.field1967 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1119) {
                field1126 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1132[--Statics.field377];
            int var5 = 0;
            if (class301.method3205(var4)) {
                var5 = class301.method1006(var4);
            }
            class197 var6 = class197.method3184(class193.field2299, client.field721.field1340);
            var6.field2375.method5213(var5);
            client.field721.method2161(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1132[--Statics.field377];
            class197 var8 = class197.method3184(class193.field2271, client.field721.field1340);
            var8.field2375.method5437(var7.length() + 1);
            var8.field2375.method5217(var7);
            client.field721.method2161(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1132[--Statics.field377];
            class197 var10 = class197.method3184(class193.field2313, client.field721.field1340);
            var10.field2375.method5437(var9.length() + 1);
            var10.field2375.method5217(var9);
            client.field721.method2161(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1125[--Statics.field1967];
            String var12 = field1132[--Statics.field377];
            client.method2394(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1967 -= 3;
            int var13 = field1125[Statics.field1967];
            int var14 = field1125[Statics.field1967 + 1];
            int var15 = field1125[Statics.field1967 + 2];
            class227 var16 = class227.method403(var15);
            client.method797(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1967 -= 2;
            int var17 = field1125[Statics.field1967];
            int var18 = field1125[Statics.field1967 + 1];
            class227 var19 = arg2 ? Statics.field408 : Statics.field545;
            client.method797(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field556 = field1125[--Statics.field1967] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1125[++Statics.field1967 - 1] = Statics.field2108.field1080 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field2108.field1080 = field1125[--Statics.field1967] == 1;
            class83.method3709();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1132[--Statics.field377];
            boolean var21 = field1125[--Statics.field1967] == 1;
            class61.method279(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1125[--Statics.field1967];
            class197 var23 = class197.method3184(class193.field2270, client.field721.field1340);
            var23.field2375.method5387(var22);
            client.field721.method2161(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1125[--Statics.field1967];
            Statics.field377 -= 2;
            String var25 = field1132[Statics.field377];
            String var26 = field1132[Statics.field377 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class197 var27 = class197.method3184(class193.field2305, client.field721.field1340);
                var27.field2375.method5387(1 + Statics.method2147(var25) + Statics.method2147(var26));
                var27.field2375.method5217(var25);
                var27.field2375.method5347(var24);
                var27.field2375.method5217(var26);
                client.field721.method2161(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field820 = field1125[--Statics.field1967] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field932 = field1125[--Statics.field1967] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field793 = field1125[--Statics.field1967] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1125[--Statics.field1967] == 1) {
                client.field794 |= 0x1;
            } else {
                client.field794 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1125[--Statics.field1967] == 1) {
                client.field794 |= 0x2;
            } else {
                client.field794 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1125[--Statics.field1967] == 1) {
                client.field794 |= 0x4;
            } else {
                client.field794 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1125[--Statics.field1967] == 1) {
                client.field794 |= 0x8;
            } else {
                client.field794 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field794 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field937 = field1125[--Statics.field1967] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field789 = field1125[--Statics.field1967] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method2904(field1125[--Statics.field1967] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1125[++Statics.field1967 - 1] = client.method1129() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1967 -= 2;
            client.field754 = field1125[Statics.field1967];
            client.field755 = field1125[Statics.field1967 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1967 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1967--;
            return 1;
        } else if (arg0 == 3132) {
            field1125[++Statics.field1967 - 1] = Statics.field1299;
            field1125[++Statics.field1967 - 1] = Statics.field397;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1967--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1967 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field836 = 3;
            client.field672 = field1125[--Statics.field1967];
            return 1;
        } else if (arg0 == 3137) {
            client.field836 = 2;
            client.field672 = field1125[--Statics.field1967];
            return 1;
        } else if (arg0 == 3138) {
            client.field836 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field836 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field836 = 3;
            client.field672 = arg2 ? Statics.field408.field2617 : Statics.field545.field2617;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1125[--Statics.field1967] == 1;
            Statics.field2108.field1084 = var28;
            class83.method3709();
            return 1;
        } else if (arg0 == 3142) {
            field1125[++Statics.field1967 - 1] = Statics.field2108.field1084 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1125[--Statics.field1967] == 1;
            client.field711 = var29;
            if (!var29) {
                Statics.field2108.field1083 = "";
                class83.method3709();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1125[++Statics.field1967 - 1] = client.field711 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1125[--Statics.field1967] == 1;
            if (Statics.field2108.field1078 == var30) {
                Statics.field2108.field1078 = !var30;
                class83.method3709();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1125[++Statics.field1967 - 1] = Statics.field2108.field1078 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1125[++Statics.field1967 - 1] = class95.field1211;
            return 1;
        } else if (arg0 == 3154) {
            field1125[++Statics.field1967 - 1] = client.method3457();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field377--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1967 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1967--;
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1967--;
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field377--;
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1967--;
            field1132[++Statics.field377 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1967--;
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1967 -= 2;
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1967 -= 2;
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1967 -= 2;
            field1132[++Statics.field377 - 1] = "";
            field1132[++Statics.field377 - 1] = "";
            field1132[++Statics.field377 - 1] = "";
            field1132[++Statics.field377 - 1] = "";
            field1132[++Statics.field377 - 1] = "";
            field1132[++Statics.field377 - 1] = "";
            field1132[++Statics.field377 - 1] = "";
            field1132[++Statics.field377 - 1] = "";
            field1132[++Statics.field377 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1967--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1967--;
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1967--;
            return 1;
        } else if (arg0 == 3175) {
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field377--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field377--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hm.ai(ILcs;ZI)I")
    public static int method3591(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1967 -= 3;
            client.method569(field1125[Statics.field1967], field1125[Statics.field1967 + 1], field1125[Statics.field1967 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method3193(field1125[--Statics.field1967]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1967 -= 2;
            client.method1081(field1125[Statics.field1967], field1125[Statics.field1967 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eh.ao(ILcs;ZB)I")
    public static int method3117(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1125[++Statics.field1967 - 1] = client.field671;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1967 -= 2;
            int var3 = field1125[Statics.field1967];
            int var4 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = class69.method4242(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1967 -= 2;
            int var5 = field1125[Statics.field1967];
            int var6 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = class69.method3242(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1967 -= 2;
            int var7 = field1125[Statics.field1967];
            int var8 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = class69.method1044(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = class250.method4088(var9).field3233;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = client.field806[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = client.field807[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = client.field808[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1576;
            int var14 = (Statics.field455.field983 >> 7) + Statics.field2130;
            int var15 = (Statics.field455.field965 >> 7) + Statics.field1275;
            field1125[++Statics.field1967 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1125[++Statics.field1967 - 1] = client.field896 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1967 -= 2;
            int var19 = field1125[Statics.field1967] + 32768;
            int var20 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = class69.method4242(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1967 -= 2;
            int var21 = field1125[Statics.field1967] + 32768;
            int var22 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = class69.method3242(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1967 -= 2;
            int var23 = field1125[Statics.field1967] + 32768;
            int var24 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = class69.method1044(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field843 >= 2) {
                field1125[++Statics.field1967 - 1] = client.field843;
            } else {
                field1125[++Statics.field1967 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1125[++Statics.field1967 - 1] = client.field689;
            return 1;
        } else if (arg0 == 3318) {
            field1125[++Statics.field1967 - 1] = client.field729;
            return 1;
        } else if (arg0 == 3321) {
            field1125[++Statics.field1967 - 1] = client.field742;
            return 1;
        } else if (arg0 == 3322) {
            field1125[++Statics.field1967 - 1] = client.field842;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field795) {
                field1125[++Statics.field1967 - 1] = 1;
            } else {
                field1125[++Statics.field1967 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1125[++Statics.field1967 - 1] = client.field864;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1967 -= 4;
            int var25 = field1125[Statics.field1967];
            int var26 = field1125[Statics.field1967 + 1];
            int var27 = field1125[Statics.field1967 + 2];
            int var28 = field1125[Statics.field1967 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1125[++Statics.field1967 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ct.ae(ILcs;ZB)I")
    public static int method2050(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1967 -= 2;
            int var3 = field1125[Statics.field1967];
            int var4 = field1125[Statics.field1967 + 1];
            class262 var5 = class262.method1055(var3);
            if (var5.field3346 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3351; var6++) {
                if (var5.field3352[var6] == var4) {
                    field1132[++Statics.field377 - 1] = var5.field3350[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1132[++Statics.field377 - 1] = var5.field3348;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1967 -= 4;
            int var7 = field1125[Statics.field1967];
            int var8 = field1125[Statics.field1967 + 1];
            int var9 = field1125[Statics.field1967 + 2];
            int var10 = field1125[Statics.field1967 + 3];
            class262 var11 = class262.method1055(var9);
            if (var11.field3347 != var7 || var11.field3346 != var8) {
                if (var8 == 115) {
                    field1132[++Statics.field377 - 1] = class234.field2799;
                } else {
                    field1125[++Statics.field1967 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3351; var12++) {
                if (var11.field3352[var12] == var10) {
                    if (var8 == 115) {
                        field1132[++Statics.field377 - 1] = var11.field3350[var12];
                    } else {
                        field1125[++Statics.field1967 - 1] = var11.field3353[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1132[++Statics.field377 - 1] = var11.field3348;
                } else {
                    field1125[++Statics.field1967 - 1] = var11.field3349;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1125[--Statics.field1967];
            class262 var14 = class262.method1055(var13);
            field1125[++Statics.field1967 - 1] = var14.method4314();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.ax(ILcs;ZB)I")
    public static int method43(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field2418.field1095 == 0) {
                field1125[++Statics.field1967 - 1] = -2;
            } else if (Statics.field2418.field1095 == 1) {
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = Statics.field2418.field1092.method4860();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1125[--Statics.field1967];
            if (Statics.field2418.method1729() && var3 >= 0 && var3 < Statics.field2418.field1092.method4860()) {
                class294 var4 = (class294) Statics.field2418.field1092.method4827(var3);
                field1132[++Statics.field377 - 1] = var4.method4777();
                field1132[++Statics.field377 - 1] = var4.method4772();
            } else {
                field1132[++Statics.field377 - 1] = "";
                field1132[++Statics.field377 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1125[--Statics.field1967];
            if (Statics.field2418.method1729() && var5 >= 0 && var5 < Statics.field2418.field1092.method4860()) {
                field1125[++Statics.field1967 - 1] = ((class289) Statics.field2418.field1092.method4827(var5)).field3643;
            } else {
                field1125[++Statics.field1967 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1125[--Statics.field1967];
            if (Statics.field2418.method1729() && var6 >= 0 && var6 < Statics.field2418.field1092.method4860()) {
                field1125[++Statics.field1967 - 1] = ((class289) Statics.field2418.field1092.method4827(var6)).field3642;
            } else {
                field1125[++Statics.field1967 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1132[--Statics.field377];
            int var8 = field1125[--Statics.field1967];
            class84.method705(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1132[--Statics.field377];
            Statics.field2418.method1736(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1132[--Statics.field377];
            Statics.field2418.method1739(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1132[--Statics.field377];
            Statics.field2418.method1737(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1132[--Statics.field377];
            Statics.field2418.method1740(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1132[--Statics.field377];
            String var14 = client.method3235(var13);
            field1125[++Statics.field1967 - 1] = Statics.field2418.method1734(new class293(var14, Statics.field2368), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1085 == null) {
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1132[++Statics.field377 - 1] = Statics.field1085.field3661;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1085 == null) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = Statics.field1085.method4860();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1125[--Statics.field1967];
            if (Statics.field1085 == null || var15 >= Statics.field1085.method4860()) {
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1132[++Statics.field377 - 1] = Statics.field1085.method4827(var15).method4796().method4925();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1125[--Statics.field1967];
            if (Statics.field1085 == null || var16 >= Statics.field1085.method4860()) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = ((class289) Statics.field1085.method4827(var16)).method4911();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1125[--Statics.field1967];
            if (Statics.field1085 == null || var17 >= Statics.field1085.method4860()) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = ((class289) Statics.field1085.method4827(var17)).field3642;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1125[++Statics.field1967 - 1] = Statics.field1085 == null ? 0 : Statics.field1085.field3662;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1132[--Statics.field377];
            client.method94(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1125[++Statics.field1967 - 1] = Statics.field1085 == null ? 0 : Statics.field1085.field3663;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1132[--Statics.field377];
            client.method758(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method142();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field2418.method1729()) {
                field1125[++Statics.field1967 - 1] = Statics.field2418.field1090.method4860();
            } else {
                field1125[++Statics.field1967 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1125[--Statics.field1967];
            if (Statics.field2418.method1729() && var20 >= 0 && var20 < Statics.field2418.field1090.method4860()) {
                class288 var21 = (class288) Statics.field2418.field1090.method4827(var20);
                field1132[++Statics.field377 - 1] = var21.method4777();
                field1132[++Statics.field377 - 1] = var21.method4772();
            } else {
                field1132[++Statics.field377 - 1] = "";
                field1132[++Statics.field377 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1132[--Statics.field377];
            String var23 = client.method3235(var22);
            field1125[++Statics.field1967 - 1] = Statics.field2418.method1735(new class293(var23, Statics.field2368)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1125[--Statics.field1967];
            if (Statics.field1085 == null || var24 >= Statics.field1085.method4860() || !Statics.field1085.method4827(var24).method4796().equals(Statics.field455.field658)) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1085 == null || Statics.field1085.field3657 == null) {
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1132[++Statics.field377 - 1] = Statics.field1085.field3657;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1125[--Statics.field1967];
            if (Statics.field1085 == null || var25 >= Statics.field1085.method4860() || !((class283) Statics.field1085.method4827(var25)).method4756()) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1125[--Statics.field1967];
            if (Statics.field1085 == null || var26 >= Statics.field1085.method4860() || !((class283) Statics.field1085.method4827(var26)).method4759()) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field2418.field1092.method4832();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1092.method4826(new class324(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1092.method4826(new class325(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1092.method4826(new class167(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1092.method4826(new class161(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1092.method4826(new class166(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1092.method4826(new class169(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1092.method4826(new class165(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1092.method4826(new class163(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1092.method4826(new class162(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1092.method4826(new class164(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field2418.field1092.method4828();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field2418.field1090.method4832();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1090.method4826(new class324(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1090.method4826(new class325(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field2418.field1090.method4828();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1085 != null) {
                Statics.field1085.method4832();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1125[--Statics.field1967] == 1;
            if (Statics.field1085 != null) {
                Statics.field1085.method4826(new class324(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1125[--Statics.field1967] == 1;
            if (Statics.field1085 != null) {
                Statics.field1085.method4826(new class325(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1125[--Statics.field1967] == 1;
            if (Statics.field1085 != null) {
                Statics.field1085.method4826(new class167(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1125[--Statics.field1967] == 1;
            if (Statics.field1085 != null) {
                Statics.field1085.method4826(new class161(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1125[--Statics.field1967] == 1;
            if (Statics.field1085 != null) {
                Statics.field1085.method4826(new class166(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1125[--Statics.field1967] == 1;
            if (Statics.field1085 != null) {
                Statics.field1085.method4826(new class169(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1125[--Statics.field1967] == 1;
            if (Statics.field1085 != null) {
                Statics.field1085.method4826(new class165(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1125[--Statics.field1967] == 1;
            if (Statics.field1085 != null) {
                Statics.field1085.method4826(new class163(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1125[--Statics.field1967] == 1;
            if (Statics.field1085 != null) {
                Statics.field1085.method4826(new class162(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1125[--Statics.field1967] == 1;
            if (Statics.field1085 != null) {
                Statics.field1085.method4826(new class164(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1085 != null) {
                Statics.field1085.method4828();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1125[--Statics.field1967] == 1;
            Statics.field2418.field1092.method4826(new class168(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1125[--Statics.field1967] == 1;
            if (Statics.field1085 != null) {
                Statics.field1085.method4826(new class168(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jz.ag(ILcs;ZI)I")
    public static int method4486(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = client.field941[var3].method145();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = client.field941[var4].field85;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = client.field941[var5].field81;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = client.field941[var6].field83;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = client.field941[var7].field84;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = client.field941[var8].field86;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1125[--Statics.field1967];
            int var10 = client.field941[var9].method141();
            field1125[++Statics.field1967 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1125[--Statics.field1967];
            int var12 = client.field941[var11].method141();
            field1125[++Statics.field1967 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1125[--Statics.field1967];
            int var14 = client.field941[var13].method141();
            field1125[++Statics.field1967 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1125[--Statics.field1967];
            int var16 = client.field941[var15].method141();
            field1125[++Statics.field1967 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1125[--Statics.field1967] == 1;
            if (Statics.field144 != null) {
                Statics.field144.method116(class16.field64, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1125[--Statics.field1967] == 1;
            if (Statics.field144 != null) {
                Statics.field144.method116(class16.field63, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1967 -= 2;
            boolean var19 = field1125[Statics.field1967] == 1;
            boolean var20 = field1125[Statics.field1967 + 1] == 1;
            if (Statics.field144 != null) {
                client.field942.field668 = var20;
                Statics.field144.method116(client.field942, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1125[--Statics.field1967] == 1;
            if (Statics.field144 != null) {
                Statics.field144.method116(class16.field62, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1125[--Statics.field1967] == 1;
            if (Statics.field144 != null) {
                Statics.field144.method116(class16.field65, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1125[++Statics.field1967 - 1] = Statics.field144 == null ? 0 : Statics.field144.field61.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1125[--Statics.field1967];
            class17 var24 = (class17) Statics.field144.field61.get(var23);
            field1125[++Statics.field1967 - 1] = var24.field76;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1125[--Statics.field1967];
            class17 var26 = (class17) Statics.field144.field61.get(var25);
            field1132[++Statics.field377 - 1] = var26.method121();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1125[--Statics.field1967];
            class17 var28 = (class17) Statics.field144.field61.get(var27);
            field1132[++Statics.field377 - 1] = var28.method122();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1125[--Statics.field1967];
            class17 var30 = (class17) Statics.field144.field61.get(var29);
            long var31 = class307.method3253() - Statics.field1140 - var30.field70;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1132[++Statics.field377 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1125[--Statics.field1967];
            class17 var38 = (class17) Statics.field144.field61.get(var37);
            field1125[++Statics.field1967 - 1] = var38.field69.field83;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1125[--Statics.field1967];
            class17 var40 = (class17) Statics.field144.field61.get(var39);
            field1125[++Statics.field1967 - 1] = var40.field69.field81;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1125[--Statics.field1967];
            class17 var42 = (class17) Statics.field144.field61.get(var41);
            field1125[++Statics.field1967 - 1] = var42.field69.field85;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bm.ab(ILcs;ZI)I")
    public static int method1035(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1967 -= 2;
            int var3 = field1125[Statics.field1967];
            int var4 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1967 -= 2;
            int var5 = field1125[Statics.field1967];
            int var6 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1967 -= 2;
            int var7 = field1125[Statics.field1967];
            int var8 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1967 -= 2;
            int var9 = field1125[Statics.field1967];
            int var10 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1967 -= 5;
            int var13 = field1125[Statics.field1967];
            int var14 = field1125[Statics.field1967 + 1];
            int var15 = field1125[Statics.field1967 + 2];
            int var16 = field1125[Statics.field1967 + 3];
            int var17 = field1125[Statics.field1967 + 4];
            field1125[++Statics.field1967 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1967 -= 2;
            int var18 = field1125[Statics.field1967];
            int var19 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1967 -= 2;
            int var20 = field1125[Statics.field1967];
            int var21 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1967 -= 2;
            int var22 = field1125[Statics.field1967];
            int var23 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1967 -= 2;
            int var24 = field1125[Statics.field1967];
            int var25 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1967 -= 2;
            int var26 = field1125[Statics.field1967];
            int var27 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1967 -= 2;
            int var28 = field1125[Statics.field1967];
            int var29 = field1125[Statics.field1967 + 1];
            if (var28 == 0) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1967 -= 2;
            int var30 = field1125[Statics.field1967];
            int var31 = field1125[Statics.field1967 + 1];
            if (var30 == 0) {
                field1125[++Statics.field1967 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1125[++Statics.field1967 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1125[++Statics.field1967 - 1] = var30;
                    break;
                case 2:
                    field1125[++Statics.field1967 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1125[++Statics.field1967 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1125[++Statics.field1967 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1125[++Statics.field1967 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1967 -= 2;
            int var32 = field1125[Statics.field1967];
            int var33 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1967 -= 2;
            int var34 = field1125[Statics.field1967];
            int var35 = field1125[Statics.field1967 + 1];
            field1125[++Statics.field1967 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1967 -= 3;
            long var36 = (long) field1125[Statics.field1967];
            long var38 = (long) field1125[Statics.field1967 + 1];
            long var40 = (long) field1125[Statics.field1967 + 2];
            field1125[++Statics.field1967 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("du.ak(ILcs;ZI)I")
    public static int method2602(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1125[--Statics.field1967];
            field1132[++Statics.field377 - 1] = class265.method4218(var3).field3442;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1967 -= 2;
            int var4 = field1125[Statics.field1967];
            int var5 = field1125[Statics.field1967 + 1];
            class265 var6 = class265.method4218(var4);
            if (var5 < 1 || var5 > 5 || var6.field3456[var5 - 1] == null) {
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1132[++Statics.field377 - 1] = var6.field3456[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1967 -= 2;
            int var7 = field1125[Statics.field1967];
            int var8 = field1125[Statics.field1967 + 1];
            class265 var9 = class265.method4218(var7);
            if (var8 < 1 || var8 > 5 || var9.field3457[var8 - 1] == null) {
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1132[++Statics.field377 - 1] = var9.field3457[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = class265.method4218(var10).field3454;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = class265.method4218(var11).field3439 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1125[--Statics.field1967];
            class265 var13 = class265.method4218(var12);
            if (var13.field3431 == -1 && var13.field3434 >= 0) {
                field1125[++Statics.field1967 - 1] = var13.field3434;
            } else {
                field1125[++Statics.field1967 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1125[--Statics.field1967];
            class265 var15 = class265.method4218(var14);
            if (var15.field3431 >= 0 && var15.field3434 >= 0) {
                field1125[++Statics.field1967 - 1] = var15.field3434;
            } else {
                field1125[++Statics.field1967 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = class265.method4218(var16).field3480 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1125[--Statics.field1967];
            class265 var18 = class265.method4218(var17);
            if (var18.field3486 == -1 && var18.field3485 >= 0) {
                field1125[++Statics.field1967 - 1] = var18.field3485;
            } else {
                field1125[++Statics.field1967 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1125[--Statics.field1967];
            class265 var20 = class265.method4218(var19);
            if (var20.field3486 >= 0 && var20.field3485 >= 0) {
                field1125[++Statics.field1967 - 1] = var20.field3485;
            } else {
                field1125[++Statics.field1967 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1132[--Statics.field377];
            int var22 = field1125[--Statics.field1967];
            client.method3707(var21, var22 == 1);
            field1125[++Statics.field1967 - 1] = Statics.field1577;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field371 == null || Statics.field559 >= Statics.field1577) {
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = Statics.field371[++Statics.field559 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field559 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("el.ad(ILcs;ZI)I")
    public static int method3090(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1125[++Statics.field1967 - 1] = client.field894;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1967 -= 3;
            client.field894 = field1125[Statics.field1967];
            Statics.field1056 = class320.method1064(field1125[Statics.field1967 + 1]);
            if (Statics.field1056 == null) {
                Statics.field1056 = class320.field3819;
            }
            client.field903 = field1125[Statics.field1967 + 2];
            class197 var3 = class197.method3184(class193.field2325, client.field721.field1340);
            var3.field2375.method5437(client.field894);
            var3.field2375.method5437(Statics.field1056.field3818);
            var3.field2375.method5437(client.field903);
            client.field721.method2161(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1132[--Statics.field377];
            Statics.field1967 -= 2;
            int var5 = field1125[Statics.field1967];
            int var6 = field1125[Statics.field1967 + 1];
            class197 var7 = class197.method3184(class193.field2342, client.field721.field1340);
            var7.field2375.method5437(Statics.method2147(var4) + 2);
            var7.field2375.method5217(var4);
            var7.field2375.method5437(var5 - 1);
            var7.field2375.method5437(var6);
            client.field721.method2161(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1967 -= 2;
            int var8 = field1125[Statics.field1967];
            int var9 = field1125[Statics.field1967 + 1];
            class74 var10 = class101.method29(var8, var9);
            if (var10 == null) {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = 0;
                field1132[++Statics.field377 - 1] = "";
                field1132[++Statics.field377 - 1] = "";
                field1132[++Statics.field377 - 1] = "";
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = var10.field625;
                field1125[++Statics.field1967 - 1] = var10.field617;
                field1132[++Statics.field377 - 1] = var10.field619 == null ? "" : var10.field619;
                field1132[++Statics.field377 - 1] = var10.field623 == null ? "" : var10.field623;
                field1132[++Statics.field377 - 1] = var10.field622 == null ? "" : var10.field622;
                field1125[++Statics.field1967 - 1] = var10.method1089() ? 1 : (var10.method1093() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1125[--Statics.field1967];
            class74 var12 = class101.method3449(var11);
            if (var12 == null) {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = 0;
                field1132[++Statics.field377 - 1] = "";
                field1132[++Statics.field377 - 1] = "";
                field1132[++Statics.field377 - 1] = "";
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = var12.field618;
                field1125[++Statics.field1967 - 1] = var12.field617;
                field1132[++Statics.field377 - 1] = var12.field619 == null ? "" : var12.field619;
                field1132[++Statics.field377 - 1] = var12.field623 == null ? "" : var12.field623;
                field1132[++Statics.field377 - 1] = var12.field622 == null ? "" : var12.field622;
                field1125[++Statics.field1967 - 1] = var12.method1089() ? 1 : (var12.method1093() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field1056 == null) {
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = Statics.field1056.field3818;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1132[--Statics.field377];
            int var14 = field1125[--Statics.field1967];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class234.field2882)) {
                var16 = 0;
                var13 = var13.substring(class234.field2882.length());
            } else if (var15.startsWith(class234.field2964)) {
                var16 = 1;
                var13 = var13.substring(class234.field2964.length());
            } else if (var15.startsWith(class234.field2975)) {
                var16 = 2;
                var13 = var13.substring(class234.field2975.length());
            } else if (var15.startsWith(class234.field2897)) {
                var16 = 3;
                var13 = var13.substring(class234.field2897.length());
            } else if (var15.startsWith(class234.field2979)) {
                var16 = 4;
                var13 = var13.substring(class234.field2979.length());
            } else if (var15.startsWith(class234.field2981)) {
                var16 = 5;
                var13 = var13.substring(class234.field2981.length());
            } else if (var15.startsWith(class234.field2983)) {
                var16 = 6;
                var13 = var13.substring(class234.field2983.length());
            } else if (var15.startsWith(class234.field2985)) {
                var16 = 7;
                var13 = var13.substring(class234.field2985.length());
            } else if (var15.startsWith(class234.field2992)) {
                var16 = 8;
                var13 = var13.substring(class234.field2992.length());
            } else if (var15.startsWith(class234.field2989)) {
                var16 = 9;
                var13 = var13.substring(class234.field2989.length());
            } else if (var15.startsWith(class234.field2991)) {
                var16 = 10;
                var13 = var13.substring(class234.field2991.length());
            } else if (var15.startsWith(class234.field2993)) {
                var16 = 11;
                var13 = var13.substring(class234.field2993.length());
            } else if (Statics.field1992 != class200.field2386) {
                if (var15.startsWith(class234.field2817)) {
                    var16 = 0;
                    var13 = var13.substring(class234.field2817.length());
                } else if (var15.startsWith(class234.field3065)) {
                    var16 = 1;
                    var13 = var13.substring(class234.field3065.length());
                } else if (var15.startsWith(class234.field2976)) {
                    var16 = 2;
                    var13 = var13.substring(class234.field2976.length());
                } else if (var15.startsWith(class234.field2978)) {
                    var16 = 3;
                    var13 = var13.substring(class234.field2978.length());
                } else if (var15.startsWith(class234.field2844)) {
                    var16 = 4;
                    var13 = var13.substring(class234.field2844.length());
                } else if (var15.startsWith(class234.field2982)) {
                    var16 = 5;
                    var13 = var13.substring(class234.field2982.length());
                } else if (var15.startsWith(class234.field2878)) {
                    var16 = 6;
                    var13 = var13.substring(class234.field2878.length());
                } else if (var15.startsWith(class234.field2986)) {
                    var16 = 7;
                    var13 = var13.substring(class234.field2986.length());
                } else if (var15.startsWith(class234.field2988)) {
                    var16 = 8;
                    var13 = var13.substring(class234.field2988.length());
                } else if (var15.startsWith(class234.field3022)) {
                    var16 = 9;
                    var13 = var13.substring(class234.field3022.length());
                } else if (var15.startsWith(class234.field3018)) {
                    var16 = 10;
                    var13 = var13.substring(class234.field3018.length());
                } else if (var15.startsWith(class234.field2994)) {
                    var16 = 11;
                    var13 = var13.substring(class234.field2994.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class234.field2901)) {
                var18 = 1;
                var13 = var13.substring(class234.field2901.length());
            } else if (var17.startsWith(class234.field2997)) {
                var18 = 2;
                var13 = var13.substring(class234.field2997.length());
            } else if (var17.startsWith(class234.field2999)) {
                var18 = 3;
                var13 = var13.substring(class234.field2999.length());
            } else if (var17.startsWith(class234.field2903)) {
                var18 = 4;
                var13 = var13.substring(class234.field2903.length());
            } else if (var17.startsWith(class234.field3001)) {
                var18 = 5;
                var13 = var13.substring(class234.field3001.length());
            } else if (Statics.field1992 != class200.field2386) {
                if (var17.startsWith(class234.field3072)) {
                    var18 = 1;
                    var13 = var13.substring(class234.field3072.length());
                } else if (var17.startsWith(class234.field3027)) {
                    var18 = 2;
                    var13 = var13.substring(class234.field3027.length());
                } else if (var17.startsWith(class234.field3000)) {
                    var18 = 3;
                    var13 = var13.substring(class234.field3000.length());
                } else if (var17.startsWith(class234.field3002)) {
                    var18 = 4;
                    var13 = var13.substring(class234.field3002.length());
                } else if (var17.startsWith(class234.field3004)) {
                    var18 = 5;
                    var13 = var13.substring(class234.field3004.length());
                }
            }
            class197 var19 = class197.method3184(class193.field2274, client.field721.field1340);
            var19.field2375.method5437(0);
            int var20 = var19.field2375.field3734;
            var19.field2375.method5437(var14);
            var19.field2375.method5437(var16);
            var19.field2375.method5437(var18);
            class220.method749(var19.field2375, var13);
            var19.field2375.method5224(var19.field2375.field3734 - var20);
            client.field721.method2161(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field377 -= 2;
            String var21 = field1132[Statics.field377];
            String var22 = field1132[Statics.field377 + 1];
            class197 var23 = class197.method3184(class193.field2248, client.field721.field1340);
            var23.field2375.method5387(0);
            int var24 = var23.field2375.field3734;
            var23.field2375.method5217(var21);
            class220.method749(var23.field2375, var22);
            var23.field2375.method5447(var23.field2375.field3734 - var24);
            client.field721.method2161(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field455 == null || Statics.field455.field658 == null) {
                var25 = "";
            } else {
                var25 = Statics.field455.field658.method4925();
            }
            field1132[++Statics.field377 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1125[++Statics.field1967 - 1] = client.field903;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = class101.method127(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = Statics.method3244(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = class101.method406(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1132[--Statics.field377];
            client.method3104(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field756 = field1132[--Statics.field377].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1132[++Statics.field377 - 1] = client.field756;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1132[--Statics.field377];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hb.as(ILcs;ZI)I")
    public static int method3869(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1125[++Statics.field1967 - 1] = client.method765();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1125[--Statics.field1967];
            if (var3 == 1 || var3 == 2) {
                client.method1076(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1125[++Statics.field1967 - 1] = Statics.field2108.field1082;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1125[--Statics.field1967];
            if (var4 == 1 || var4 == 2) {
                Statics.field2108.field1082 = var4;
                class83.method3709();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1967--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hb.ar(ILcs;ZI)I")
    public static int method3870(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1967 -= 2;
            int var3 = field1125[Statics.field1967];
            int var4 = field1125[Statics.field1967 + 1];
            if (!client.field918) {
                client.field743 = var3;
                client.field926 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1125[++Statics.field1967 - 1] = client.field743;
            return 1;
        } else if (arg0 == 5506) {
            field1125[++Statics.field1967 - 1] = client.field926;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1125[--Statics.field1967];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field750 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1125[++Statics.field1967 - 1] = client.field750;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jj.ap(ILcs;ZB)I")
    public static int method4722(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field722 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.al(II)I")
    public static int method147(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("ao.an(IB)I")
    public static int method266(int arg0) {
        return (int) ((Math.log((double) arg0) / field1127 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("co.ac(ILcs;ZB)I")
    public static int method1968(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1967 -= 2;
            client.field728 = (short) method147(field1125[Statics.field1967]);
            if (client.field728 <= 0) {
                client.field728 = 256;
            }
            client.field925 = (short) method147(field1125[Statics.field1967 + 1]);
            if (client.field925 <= 0) {
                client.field925 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1967 -= 2;
            client.field708 = (short) field1125[Statics.field1967];
            if (client.field708 <= 0) {
                client.field708 = 256;
            }
            client.field890 = (short) field1125[Statics.field1967 + 1];
            if (client.field890 <= 0) {
                client.field890 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1967 -= 4;
            client.field928 = (short) field1125[Statics.field1967];
            if (client.field928 <= 0) {
                client.field928 = 1;
            }
            client.field929 = (short) field1125[Statics.field1967 + 1];
            if (client.field929 <= 0) {
                client.field929 = 32767;
            } else if (client.field929 < client.field928) {
                client.field929 = client.field928;
            }
            client.field686 = (short) field1125[Statics.field1967 + 2];
            if (client.field686 <= 0) {
                client.field686 = 1;
            }
            client.field862 = (short) field1125[Statics.field1967 + 3];
            if (client.field862 <= 0) {
                client.field862 = 32767;
            } else if (client.field862 < client.field686) {
                client.field862 = client.field686;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field846 == null) {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                client.method542(0, 0, client.field846.field2618, client.field846.field2619, false);
                field1125[++Statics.field1967 - 1] = client.field934;
                field1125[++Statics.field1967 - 1] = client.field796;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1125[++Statics.field1967 - 1] = client.field708;
            field1125[++Statics.field1967 - 1] = client.field890;
            return 1;
        } else if (arg0 == 6205) {
            field1125[++Statics.field1967 - 1] = method266(client.field728);
            field1125[++Statics.field1967 - 1] = method266(client.field925);
            return 1;
        } else if (arg0 == 6220) {
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1125[++Statics.field1967 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1125[++Statics.field1967 - 1] = Statics.field1299;
            return 1;
        } else if (arg0 == 6223) {
            field1125[++Statics.field1967 - 1] = Statics.field397;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cw.av(ILcs;ZI)I")
    public static int method1689(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1125[++Statics.field1967 - 1] = class81.method701() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class81 var3 = Statics.method5041();
            if (var3 == null) {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = 0;
                field1132[++Statics.field377 - 1] = "";
                field1125[++Statics.field1967 - 1] = 0;
                field1125[++Statics.field1967 - 1] = 0;
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1125[++Statics.field1967 - 1] = var3.field1047;
                field1125[++Statics.field1967 - 1] = var3.field1048;
                field1132[++Statics.field377 - 1] = var3.field1051;
                field1125[++Statics.field1967 - 1] = var3.field1052;
                field1125[++Statics.field1967 - 1] = var3.field1049;
                field1132[++Statics.field377 - 1] = var3.field1055;
            }
            return 1;
        } else if (arg0 == 6502) {
            class81 var4 = class81.method30();
            if (var4 == null) {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = 0;
                field1132[++Statics.field377 - 1] = "";
                field1125[++Statics.field1967 - 1] = 0;
                field1125[++Statics.field1967 - 1] = 0;
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1125[++Statics.field1967 - 1] = var4.field1047;
                field1125[++Statics.field1967 - 1] = var4.field1048;
                field1132[++Statics.field377 - 1] = var4.field1051;
                field1125[++Statics.field1967 - 1] = var4.field1052;
                field1125[++Statics.field1967 - 1] = var4.field1049;
                field1132[++Statics.field377 - 1] = var4.field1055;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1125[--Statics.field1967];
            class81 var6 = null;
            for (int var7 = 0; var7 < class81.field1043; var7++) {
                if (Statics.field54[var7].field1047 == var5) {
                    var6 = Statics.field54[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = 0;
                field1132[++Statics.field377 - 1] = "";
                field1125[++Statics.field1967 - 1] = 0;
                field1125[++Statics.field1967 - 1] = 0;
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1125[++Statics.field1967 - 1] = var6.field1047;
                field1125[++Statics.field1967 - 1] = var6.field1048;
                field1132[++Statics.field377 - 1] = var6.field1051;
                field1125[++Statics.field1967 - 1] = var6.field1052;
                field1125[++Statics.field1967 - 1] = var6.field1049;
                field1132[++Statics.field377 - 1] = var6.field1055;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1967 -= 4;
            int var8 = field1125[Statics.field1967];
            boolean var9 = field1125[Statics.field1967 + 1] == 1;
            int var10 = field1125[Statics.field1967 + 2];
            boolean var11 = field1125[Statics.field1967 + 3] == 1;
            class81.method554(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1125[--Statics.field1967];
            if (var12 >= 0 && var12 < class81.field1043) {
                class81 var13 = Statics.field54[var12];
                field1125[++Statics.field1967 - 1] = var13.field1047;
                field1125[++Statics.field1967 - 1] = var13.field1048;
                field1132[++Statics.field377 - 1] = var13.field1051;
                field1125[++Statics.field1967 - 1] = var13.field1052;
                field1125[++Statics.field1967 - 1] = var13.field1049;
                field1132[++Statics.field377 - 1] = var13.field1055;
            } else {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = 0;
                field1132[++Statics.field377 - 1] = "";
                field1125[++Statics.field1967 - 1] = 0;
                field1125[++Statics.field1967 - 1] = 0;
                field1132[++Statics.field377 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field885 = field1125[--Statics.field1967] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1967 -= 2;
            int var14 = field1125[Statics.field1967];
            int var15 = field1125[Statics.field1967 + 1];
            class260 var16 = class260.method4255(var15);
            if (var16.method4274()) {
                field1132[++Statics.field377 - 1] = class267.method3880(var14).method4496(var15, var16.field3339);
            } else {
                field1125[++Statics.field1967 - 1] = class267.method3880(var14).method4474(var15, var16.field3341);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1967 -= 2;
            int var17 = field1125[Statics.field1967];
            int var18 = field1125[Statics.field1967 + 1];
            class260 var19 = class260.method4255(var18);
            if (var19.method4274()) {
                field1132[++Statics.field377 - 1] = class264.method752(var17).method4380(var18, var19.field3339);
            } else {
                field1125[++Statics.field1967 - 1] = class264.method752(var17).method4362(var18, var19.field3341);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1967 -= 2;
            int var20 = field1125[Statics.field1967];
            int var21 = field1125[Statics.field1967 + 1];
            class260 var22 = class260.method4255(var21);
            if (var22.method4274()) {
                field1132[++Statics.field377 - 1] = class265.method4218(var20).method4448(var21, var22.field3339);
            } else {
                field1125[++Statics.field1967 - 1] = class265.method4218(var20).method4438(var21, var22.field3341);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1967 -= 2;
            int var23 = field1125[Statics.field1967];
            int var24 = field1125[Statics.field1967 + 1];
            class260 var25 = class260.method4255(var24);
            if (var25.method4274()) {
                field1132[++Statics.field377 - 1] = class261.method3778(var23).method4289(var24, var25.field3339);
            } else {
                field1125[++Statics.field1967 - 1] = class261.method3778(var23).method4288(var24, var25.field3341);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1125[++Statics.field1967 - 1] = client.field724 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1125[++Statics.field1967 - 1] = client.field677 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field377--;
            Statics.field1967--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field377--;
            Statics.field1967--;
            return 1;
        } else if (arg0 == 6524) {
            field1125[++Statics.field1967 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1125[++Statics.field1967 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1125[++Statics.field1967 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.af(ILcs;ZI)I")
    public static int method236(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1576;
            int var4 = (Statics.field455.field983 >> 7) + Statics.field2130;
            int var5 = (Statics.field455.field965 >> 7) + Statics.field1275;
            client.method4953().method5979(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1125[--Statics.field1967];
            String var7 = "";
            class36 var8 = client.method4953().method5996(var6);
            if (var8 != null) {
                var7 = var8.method337();
            }
            field1132[++Statics.field377 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1125[--Statics.field1967];
            client.method4953().method5980(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1125[++Statics.field1967 - 1] = client.method4953().method5993();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1125[--Statics.field1967];
            client.method4953().method6167(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1125[++Statics.field1967 - 1] = client.method4953().method5988() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class223 var11 = new class223(field1125[--Statics.field1967]);
            client.method4953().method6036(var11.field2566, var11.field2565);
            return 1;
        } else if (arg0 == 6607) {
            class223 var12 = new class223(field1125[--Statics.field1967]);
            client.method4953().method5998(var12.field2566, var12.field2565);
            return 1;
        } else if (arg0 == 6608) {
            class223 var13 = new class223(field1125[--Statics.field1967]);
            client.method4953().method5973(var13.field2567, var13.field2566, var13.field2565);
            return 1;
        } else if (arg0 == 6609) {
            class223 var14 = new class223(field1125[--Statics.field1967]);
            client.method4953().method6096(var14.field2567, var14.field2566, var14.field2565);
            return 1;
        } else if (arg0 == 6610) {
            field1125[++Statics.field1967 - 1] = client.method4953().method6001();
            field1125[++Statics.field1967 - 1] = client.method4953().method6018();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1125[--Statics.field1967];
            class36 var16 = client.method4953().method5996(var15);
            if (var16 == null) {
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = var16.method347().method3718();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1125[--Statics.field1967];
            class36 var18 = client.method4953().method5996(var17);
            if (var18 == null) {
                field1125[++Statics.field1967 - 1] = 0;
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = (var18.method376() - var18.method340() + 1) * 64;
                field1125[++Statics.field1967 - 1] = (var18.method343() - var18.method357() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1125[--Statics.field1967];
            class36 var20 = client.method4953().method5996(var19);
            if (var20 == null) {
                field1125[++Statics.field1967 - 1] = 0;
                field1125[++Statics.field1967 - 1] = 0;
                field1125[++Statics.field1967 - 1] = 0;
                field1125[++Statics.field1967 - 1] = 0;
            } else {
                field1125[++Statics.field1967 - 1] = var20.method340() * 64;
                field1125[++Statics.field1967 - 1] = var20.method357() * 64;
                field1125[++Statics.field1967 - 1] = var20.method376() * 64 + 64 - 1;
                field1125[++Statics.field1967 - 1] = var20.method343() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1125[--Statics.field1967];
            class36 var22 = client.method4953().method5996(var21);
            if (var22 == null) {
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = var22.method339();
            }
            return 1;
        } else if (arg0 == 6615) {
            class223 var23 = client.method4953().method6016();
            if (var23 == null) {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = var23.field2566;
                field1125[++Statics.field1967 - 1] = var23.field2565;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1125[++Statics.field1967 - 1] = client.method4953().method5981();
            return 1;
        } else if (arg0 == 6617) {
            class223 var24 = new class223(field1125[--Statics.field1967]);
            class36 var25 = client.method4953().method5982();
            if (var25 == null) {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method355(var24.field2567, var24.field2566, var24.field2565);
            if (var26 == null) {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = var26[0];
                field1125[++Statics.field1967 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class223 var27 = new class223(field1125[--Statics.field1967]);
            class36 var28 = client.method4953().method5982();
            if (var28 == null) {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = -1;
                return 1;
            }
            class223 var29 = var28.method386(var27.field2566, var27.field2565);
            if (var29 == null) {
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = var29.method3718();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1967 -= 2;
            int var30 = field1125[Statics.field1967];
            class223 var31 = new class223(field1125[Statics.field1967 + 1]);
            method4135(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1967 -= 2;
            int var32 = field1125[Statics.field1967];
            class223 var33 = new class223(field1125[Statics.field1967 + 1]);
            method4135(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1967 -= 2;
            int var34 = field1125[Statics.field1967];
            class223 var35 = new class223(field1125[Statics.field1967 + 1]);
            class36 var36 = client.method4953().method5996(var34);
            if (var36 == null) {
                field1125[++Statics.field1967 - 1] = 0;
                return 1;
            } else {
                field1125[++Statics.field1967 - 1] = var36.method342(var35.field2567, var35.field2566, var35.field2565) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1125[++Statics.field1967 - 1] = client.method4953().method6062();
            field1125[++Statics.field1967 - 1] = client.method4953().method6003();
            return 1;
        } else if (arg0 == 6623) {
            class223 var37 = new class223(field1125[--Statics.field1967]);
            class36 var38 = client.method4953().method5978(var37.field2567, var37.field2566, var37.field2565);
            if (var38 == null) {
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = var38.method334();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method4953().method6006(field1125[--Statics.field1967]);
            return 1;
        } else if (arg0 == 6625) {
            client.method4953().method6007();
            return 1;
        } else if (arg0 == 6626) {
            client.method4953().method6117(field1125[--Statics.field1967]);
            return 1;
        } else if (arg0 == 6627) {
            client.method4953().method6009();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1125[--Statics.field1967] == 1;
            client.method4953().method6010(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1125[--Statics.field1967];
            client.method4953().method6011(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1125[--Statics.field1967];
            client.method4953().method6032(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method4953().method6157();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1125[--Statics.field1967] == 1;
            client.method4953().method6014(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1967 -= 2;
            int var43 = field1125[Statics.field1967];
            boolean var44 = field1125[Statics.field1967 + 1] == 1;
            client.method4953().method6015(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1967 -= 2;
            int var45 = field1125[Statics.field1967];
            boolean var46 = field1125[Statics.field1967 + 1] == 1;
            client.method4953().method6130(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1125[++Statics.field1967 - 1] = client.method4953().method6005() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = client.method4953().method6165(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1125[--Statics.field1967];
            field1125[++Statics.field1967 - 1] = client.method4953().method6019(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1967 -= 2;
            int var49 = field1125[Statics.field1967];
            class223 var50 = new class223(field1125[Statics.field1967 + 1]);
            class223 var51 = client.method4953().method6022(var49, var50);
            if (var51 == null) {
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = var51.method3718();
            }
            return 1;
        } else if (arg0 == 6639) {
            class44 var52 = client.method4953().method6024();
            if (var52 == null) {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = var52.method224();
                field1125[++Statics.field1967 - 1] = var52.field321.method3718();
            }
            return 1;
        } else if (arg0 == 6640) {
            class44 var53 = client.method4953().method6017();
            if (var53 == null) {
                field1125[++Statics.field1967 - 1] = -1;
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = var53.method224();
                field1125[++Statics.field1967 - 1] = var53.field321.method3718();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1125[--Statics.field1967];
            class252 var55 = class252.method1412(var54);
            if (var55.field3247 == null) {
                field1132[++Statics.field377 - 1] = "";
            } else {
                field1132[++Statics.field377 - 1] = var55.field3247;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1125[--Statics.field1967];
            class252 var57 = class252.method1412(var56);
            field1125[++Statics.field1967 - 1] = var57.field3249;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1125[--Statics.field1967];
            class252 var59 = class252.method1412(var58);
            if (var59 == null) {
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = var59.field3261;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1125[--Statics.field1967];
            class252 var61 = class252.method1412(var60);
            if (var61 == null) {
                field1125[++Statics.field1967 - 1] = -1;
            } else {
                field1125[++Statics.field1967 - 1] = var61.field3248;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1125[++Statics.field1967 - 1] = Statics.field391.field375;
            return 1;
        } else if (arg0 == 6698) {
            field1125[++Statics.field1967 - 1] = Statics.field391.field373.method3718();
            return 1;
        } else if (arg0 == 6699) {
            field1125[++Statics.field1967 - 1] = Statics.field391.field374.method3718();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fc.at(II)V")
    public static void method3183(int arg0) {
        if (arg0 == -1 || !class227.method3182(arg0)) {
            return;
        }
        class227[] var1 = Statics.field2595[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class227 var3 = var1[var2];
            if (var3.field2690 != null) {
                class72 var4 = new class72();
                var4.field593 = var3;
                var4.field600 = var3.field2690;
                method408(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("ih.aa(ILhg;ZI)V")
    public static void method4135(int arg0, class223 arg1, boolean arg2) {
        class36 var3 = client.method4953().method5996(arg0);
        int var4 = Statics.field455.field656;
        int var5 = (Statics.field455.field983 >> 7) + Statics.field2130;
        int var6 = (Statics.field455.field965 >> 7) + Statics.field1275;
        class223 var7 = new class223(var4, var5, var6);
        client.method4953().method5985(var3, var7, arg1, arg2);
    }
}
