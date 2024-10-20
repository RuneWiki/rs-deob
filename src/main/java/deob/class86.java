package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ci")
public class class86 {

    @ObfuscatedName("ci.z")
    public static int[] field1119 = new int[5];

    @ObfuscatedName("ci.q")
    public static int[][] field1117 = new int[5][5000];

    @ObfuscatedName("ci.k")
    public static int[] field1121 = new int[1000];

    @ObfuscatedName("ci.u")
    public static String[] field1122 = new String[1000];

    @ObfuscatedName("ci.e")
    public static int field1132 = 0;

    @ObfuscatedName("ci.o")
    public static class66[] field1128 = new class66[50];

    @ObfuscatedName("ci.p")
    public static Calendar field1126 = Calendar.getInstance();

    @ObfuscatedName("ci.r")
    public static final String[] field1127 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ci.s")
    public static boolean field1131 = false;

    @ObfuscatedName("ci.j")
    public static boolean field1129 = false;

    @ObfuscatedName("ci.w")
    public static int field1120 = 0;

    @ObfuscatedName("ci.g")
    public static final double field1130 = Math.log(2.0D);

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.f(Lbd;I)V")
    public static void method3119(class72 arg0) {
        method797(arg0, 500000);
    }

    @ObfuscatedName("bl.b(Lbd;II)V")
    public static void method797(class72 arg0, int arg1) {
        Object[] var2 = arg0.field607;
        class102 var4;
        if (class305.method258(arg0.field612)) {
            Statics.field179 = (class51) var2[0];
            class253 var3 = class253.method3431(Statics.field179.field380);
            var4 = class102.method649(arg0.field612, var3.field3242, var3.field3261);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class102.method293(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field2046 = 0;
        Statics.field1969 = 0;
        int var6 = -1;
        int[] var7 = var4.field1318;
        int[] var8 = var4.field1313;
        byte var9 = -1;
        field1132 = 0;
        field1131 = false;
        try {
            Statics.field1125 = new int[var4.field1312];
            int var10 = 0;
            Statics.field1118 = new String[var4.field1315];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field604;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field605;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field611 == null ? -1 : arg0.field611.field2594;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field603;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field611 == null ? -1 : arg0.field611.field2725;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field614 == null ? -1 : arg0.field614.field2594;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field614 == null ? -1 : arg0.field614.field2725;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field608;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field609;
                    }
                    Statics.field1125[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field610;
                    }
                    Statics.field1118[var11++] = var14;
                }
            }
            int var15 = 0;
            field1120 = arg0.field601;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1313[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method4153(var53, var4, var43);
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
                    field1121[++Statics.field2046 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1121[++Statics.field2046 - 1] = class222.field2551[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class222.field2551[var17] = field1121[--Statics.field2046];
                    client.method218(var17);
                } else if (var53 == 3) {
                    field1122[++Statics.field1969 - 1] = var4.field1314[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field2046 -= 2;
                    if (field1121[Statics.field2046] != field1121[Statics.field2046 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field2046 -= 2;
                    if (field1121[Statics.field2046] == field1121[Statics.field2046 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field2046 -= 2;
                    if (field1121[Statics.field2046] < field1121[Statics.field2046 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field2046 -= 2;
                    if (field1121[Statics.field2046] > field1121[Statics.field2046 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1132 == 0) {
                        return;
                    }
                    class66 var18 = field1128[--field1132];
                    var4 = var18.field546;
                    var7 = var4.field1318;
                    var8 = var4.field1313;
                    var6 = var18.field547;
                    Statics.field1125 = var18.field550;
                    Statics.field1118 = var18.field549;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1121[++Statics.field2046 - 1] = class222.method1164(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    Statics.method3270(var20, field1121[--Statics.field2046]);
                } else if (var53 == 31) {
                    Statics.field2046 -= 2;
                    if (field1121[Statics.field2046] <= field1121[Statics.field2046 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field2046 -= 2;
                    if (field1121[Statics.field2046] >= field1121[Statics.field2046 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1121[++Statics.field2046 - 1] = Statics.field1125[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field1125[var8[var6]] = field1121[--Statics.field2046];
                } else if (var53 == 35) {
                    field1122[++Statics.field1969 - 1] = Statics.field1118[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field1118[var8[var6]] = field1122[--Statics.field1969];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field1969 -= var21;
                    String var22 = class302.method1165(field1122, Statics.field1969, var21);
                    field1122[++Statics.field1969 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field2046--;
                } else if (var53 == 39) {
                    Statics.field1969--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class102 var24 = class102.method293(var23);
                    int[] var25 = new int[var24.field1312];
                    String[] var26 = new String[var24.field1315];
                    for (int var27 = 0; var27 < var24.field1311; var27++) {
                        var25[var27] = field1121[Statics.field2046 - var24.field1311 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1317; var28++) {
                        var26[var28] = field1122[Statics.field1969 - var24.field1317 + var28];
                    }
                    Statics.field2046 -= var24.field1311;
                    Statics.field1969 -= var24.field1317;
                    class66 var29 = new class66();
                    var29.field546 = var4;
                    var29.field547 = var6;
                    var29.field550 = Statics.field1125;
                    var29.field549 = Statics.field1118;
                    field1128[++field1132 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1318;
                    var8 = var24.field1313;
                    var6 = -1;
                    Statics.field1125 = var25;
                    Statics.field1118 = var26;
                } else if (var53 == 42) {
                    field1121[++Statics.field2046 - 1] = Statics.field1092.method2102(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field1092.method2065(var8[var6], field1121[--Statics.field2046]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1121[--Statics.field2046];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1119[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1117[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1121[--Statics.field2046];
                    if (var36 < 0 || var36 >= field1119[var35]) {
                        throw new RuntimeException();
                    }
                    field1121[++Statics.field2046 - 1] = field1117[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field2046 -= 2;
                    int var38 = field1121[Statics.field2046];
                    if (var38 < 0 || var38 >= field1119[var37]) {
                        throw new RuntimeException();
                    }
                    field1117[var37][var38] = field1121[Statics.field2046 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field1092.method2070(var8[var6]);
                    if (var39 == null) {
                        var39 = class234.field2793;
                    }
                    field1122[++Statics.field1969 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field1092.method2069(var8[var6], field1122[--Statics.field1969]);
                } else if (var53 == 49) {
                    String var40 = Statics.field1092.method2091(var8[var6]);
                    field1122[++Statics.field1969 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field1092.method2073(var8[var6], field1122[--Statics.field1969]);
                } else if (var53 == 60) {
                    class327 var41 = var4.field1319[var8[var6]];
                    class189 var42 = (class189) var41.method5561((long) field1121[--Statics.field2046]);
                    if (var42 != null) {
                        var6 += var42.field2139;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2140).append(" ");
            for (int var47 = field1132 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1128[var47].field546.field2140).append(" ");
            }
            var46.append("").append(var9);
            class352.method2205(var46.toString(), var51);
        } finally {
            if (field1131) {
                field1129 = true;
                client.method3482();
                field1129 = false;
                field1131 = false;
            }
        }
    }

    @ObfuscatedName("if.l(ILco;ZI)I")
    public static int method4153(int arg0, class102 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method2151(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method4168(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method775(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method1107(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method1835(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return Statics.method3474(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method166(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method4262(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method3210(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method993(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3890(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method4168(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method775(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method1107(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method1835(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return Statics.method3474(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3876(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return Statics.method133(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method217(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method591(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3890(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method1966(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method353(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method2869(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method1195(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method3741(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method3721(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method1661(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method4057(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3477(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method442(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method1063(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method3271(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method435(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method212(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return Statics.method208(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return Statics.method3682(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("co.m(ILco;ZI)I")
    public static int method2151(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field2046 -= 3;
            int var3 = field1121[Statics.field2046];
            int var4 = field1121[Statics.field2046 + 1];
            int var5 = field1121[Statics.field2046 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class227 var6 = class227.method3203(var3);
            if (var6.field2724 == null) {
                var6.field2724 = new class227[var5 + 1];
            }
            if (var6.field2724.length <= var5) {
                class227[] var7 = new class227[var5 + 1];
                for (int var8 = 0; var8 < var6.field2724.length; var8++) {
                    var7[var8] = var6.field2724[var8];
                }
                var6.field2724 = var7;
            }
            if (var5 > 0 && var6.field2724[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class227 var9 = new class227();
            var9.field2596 = var4;
            var9.field2613 = var9.field2594 = var6.field2594;
            var9.field2725 = var5;
            var9.field2696 = true;
            var6.field2724[var5] = var9;
            if (arg2) {
                Statics.field622 = var9;
            } else {
                Statics.field1123 = var9;
            }
            client.method1219(var6);
            return 1;
        } else if (arg0 == 101) {
            class227 var10 = arg2 ? Statics.field622 : Statics.field1123;
            class227 var11 = class227.method3203(var10.field2594);
            var11.field2724[var10.field2725] = null;
            client.method1219(var11);
            return 1;
        } else if (arg0 == 102) {
            class227 var12 = class227.method3203(field1121[--Statics.field2046]);
            var12.field2724 = null;
            client.method1219(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field2046 -= 2;
            int var13 = field1121[Statics.field2046];
            int var14 = field1121[Statics.field2046 + 1];
            class227 var15 = class227.method1104(var13, var14);
            if (var15 == null || var14 == -1) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = 1;
                if (arg2) {
                    Statics.field622 = var15;
                } else {
                    Statics.field1123 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class227 var16 = class227.method3203(field1121[--Statics.field2046]);
            if (var16 == null) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = 1;
                if (arg2) {
                    Statics.field622 = var16;
                } else {
                    Statics.field1123 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ie.z(ILco;ZI)I")
    public static int method4168(int arg0, class102 arg1, boolean arg2) {
        int var3 = -1;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1121[--Statics.field2046];
            var4 = class227.method3203(var3);
        } else {
            var4 = arg2 ? Statics.field622 : Statics.field1123;
        }
        if (arg0 == 1000) {
            Statics.field2046 -= 4;
            var4.field2603 = field1121[Statics.field2046];
            var4.field2646 = field1121[Statics.field2046 + 1];
            var4.field2599 = field1121[Statics.field2046 + 2];
            var4.field2600 = field1121[Statics.field2046 + 3];
            client.method1219(var4);
            Statics.field3753.method1241(var4);
            if (var3 != -1 && var4.field2596 == 0) {
                client.method3216(Statics.field2584[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field2046 -= 4;
            var4.field2605 = field1121[Statics.field2046];
            var4.field2702 = field1121[Statics.field2046 + 1];
            var4.field2601 = field1121[Statics.field2046 + 2];
            var4.field2602 = field1121[Statics.field2046 + 3];
            client.method1219(var4);
            Statics.field3753.method1241(var4);
            if (var3 != -1 && var4.field2596 == 0) {
                client.method3216(Statics.field2584[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1121[--Statics.field2046] == 1;
            if (var4.field2591 != var5) {
                var4.field2591 = var5;
                client.method1219(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2734 = field1121[--Statics.field2046] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2604 = field1121[--Statics.field2046] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bp.q(ILco;ZB)I")
    public static int method775(int arg0, class102 arg1, boolean arg2) {
        int var3 = -1;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1121[--Statics.field2046];
            var4 = class227.method3203(var3);
        } else {
            var4 = arg2 ? Statics.field622 : Statics.field1123;
        }
        if (arg0 == 1100) {
            Statics.field2046 -= 2;
            var4.field2622 = field1121[Statics.field2046];
            if (var4.field2622 > var4.field2617 - var4.field2609) {
                var4.field2622 = var4.field2617 - var4.field2609;
            }
            if (var4.field2622 < 0) {
                var4.field2622 = 0;
            }
            var4.field2616 = field1121[Statics.field2046 + 1];
            if (var4.field2616 > var4.field2733 - var4.field2610) {
                var4.field2616 = var4.field2733 - var4.field2610;
            }
            if (var4.field2616 < 0) {
                var4.field2616 = 0;
            }
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2580 = field1121[--Statics.field2046];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2709 = field1121[--Statics.field2046] == 1;
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2666 = field1121[--Statics.field2046];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2627 = field1121[--Statics.field2046];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2629 = field1121[--Statics.field2046];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2631 = field1121[--Statics.field2046];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2632 = field1121[--Statics.field2046] == 1;
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2597 = 1;
            var4.field2606 = field1121[--Statics.field2046];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field2046 -= 6;
            var4.field2643 = field1121[Statics.field2046];
            var4.field2644 = field1121[Statics.field2046 + 1];
            var4.field2645 = field1121[Statics.field2046 + 2];
            var4.field2686 = field1121[Statics.field2046 + 3];
            var4.field2711 = field1121[Statics.field2046 + 4];
            var4.field2648 = field1121[Statics.field2046 + 5];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1121[--Statics.field2046];
            if (var4.field2641 != var5) {
                var4.field2641 = var5;
                var4.field2722 = 0;
                var4.field2723 = 0;
                client.method1219(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2674 = field1121[--Statics.field2046] == 1;
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1122[--Statics.field1969];
            if (!var6.equals(var4.field2655)) {
                var4.field2655 = var6;
                client.method1219(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2579 = field1121[--Statics.field2046];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field2046 -= 3;
            var4.field2658 = field1121[Statics.field2046];
            var4.field2659 = field1121[Statics.field2046 + 1];
            var4.field2615 = field1121[Statics.field2046 + 2];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2660 = field1121[--Statics.field2046] == 1;
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2633 = field1121[--Statics.field2046];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2634 = field1121[--Statics.field2046];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2635 = field1121[--Statics.field2046] == 1;
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2636 = field1121[--Statics.field2046] == 1;
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field2046 -= 2;
            var4.field2617 = field1121[Statics.field2046];
            var4.field2733 = field1121[Statics.field2046 + 1];
            client.method1219(var4);
            if (var3 != -1 && var4.field2596 == 0) {
                client.method3216(Statics.field2584[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3272(var4.field2594, var4.field2725);
            client.field848 = var4;
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2630 = field1121[--Statics.field2046];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2620 = field1121[--Statics.field2046];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2626 = field1121[--Statics.field2046];
            client.method1219(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1121[--Statics.field2046];
            class334 var8 = (class334) class205.method3432(class334.method2203(), var7);
            if (var8 != null) {
                var4.field2619 = var8;
                client.method1219(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1121[--Statics.field2046] == 1;
            var4.field2628 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1121[--Statics.field2046] == 1;
            var4.field2677 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("br.k(ILco;ZI)I")
    public static int method1107(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method3203(field1121[--Statics.field2046]);
        } else {
            var3 = arg2 ? Statics.field622 : Statics.field1123;
        }
        client.method1219(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field2046 -= 2;
            int var4 = field1121[Statics.field2046];
            int var5 = field1121[Statics.field2046 + 1];
            var3.field2720 = var4;
            var3.field2623 = var5;
            class266 var6 = class266.method335(var4);
            var3.field2645 = var6.field3473;
            var3.field2686 = var6.field3441;
            var3.field2711 = var6.field3442;
            var3.field2643 = var6.field3438;
            var3.field2644 = var6.field3464;
            var3.field2648 = var6.field3443;
            if (arg0 == 1205) {
                var3.field2684 = 0;
            } else if (arg0 == 1212 | var6.field3458 == 1) {
                var3.field2684 = 1;
            } else {
                var3.field2684 = 2;
            }
            if (var3.field2679 > 0) {
                var3.field2648 = var3.field2648 * 32 / var3.field2679;
            } else if (var3.field2605 > 0) {
                var3.field2648 = var3.field2648 * 32 / var3.field2605;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2597 = 2;
            var3.field2606 = field1121[--Statics.field2046];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2597 = 3;
            var3.field2606 = Statics.field3130.field646.method3775();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.c(ILco;ZB)I")
    public static int method1835(int arg0, class102 arg1, boolean arg2) {
        boolean var3 = true;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class227.method3203(field1121[--Statics.field2046]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field622 : Statics.field1123;
        }
        if (arg0 == 1300) {
            int var5 = field1121[--Statics.field2046] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3822(var5, field1122[--Statics.field1969]);
                return 1;
            } else {
                Statics.field1969--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field2046 -= 2;
            int var6 = field1121[Statics.field2046];
            int var7 = field1121[Statics.field2046 + 1];
            var4.field2675 = class227.method1104(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2713 = field1121[--Statics.field2046] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2676 = field1121[--Statics.field2046];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2593 = field1121[--Statics.field2046];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2673 = field1122[--Statics.field1969];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2651 = field1122[--Statics.field1969];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2693 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2736 = field1121[--Statics.field2046] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field2046--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field2046 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1121[Statics.field2046 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1121[Statics.field2046 + var10];
                        var9[var10 / 2] = (byte) field1121[Statics.field2046 + var10 + 1];
                    }
                }
            } else {
                Statics.field2046 -= 2;
                var8 = new byte[] { (byte) field1121[Statics.field2046] };
                var9 = new byte[] { (byte) field1121[Statics.field2046 + 1] };
            }
            int var11 = field1121[--Statics.field2046] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method2171(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field2046 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1121[Statics.field2046] };
            byte[] var14 = new byte[] { (byte) field1121[Statics.field2046 + 1] };
            method2171(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field2046 -= 3;
            int var15 = field1121[Statics.field2046] - 1;
            int var16 = field1121[Statics.field2046 + 1];
            int var17 = field1121[Statics.field2046 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method343(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1121[--Statics.field2046];
            int var20 = field1121[--Statics.field2046];
            method343(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field2046--;
            int var21 = field1121[Statics.field2046] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method3492(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method3492(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cr.u(Lht;I[B[BI)V")
    public static final void method2171(class227 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2669 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2669 = new byte[11][];
            arg0.field2650 = new byte[11][];
            arg0.field2671 = new int[11];
            arg0.field2672 = new int[11];
        }
        arg0.field2669[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2668 = false;
            for (int var4 = 0; var4 < arg0.field2669.length; var4++) {
                if (arg0.field2669[var4] != null) {
                    arg0.field2668 = true;
                    break;
                }
            }
        } else {
            arg0.field2668 = true;
        }
        arg0.field2650[arg1] = arg3;
    }

    @ObfuscatedName("ay.t(Lht;IIII)V")
    public static final void method343(class227 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2671 == null) {
            throw new RuntimeException();
        }
        arg0.field2671[arg1] = arg2;
        arg0.field2672[arg1] = arg3;
    }

    @ObfuscatedName("gi.e(Lht;II)V")
    public static final void method3492(class227 arg0, int arg1) {
        if (arg0.field2669 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2595 == null) {
            arg0.field2595 = new int[arg0.field2669.length];
        }
        arg0.field2595[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("j.n(ILco;ZI)I")
    public static int method166(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field622 : Statics.field1123;
        if (arg0 == 1500) {
            field1121[++Statics.field2046 - 1] = var3.field2607;
            return 1;
        } else if (arg0 == 1501) {
            field1121[++Statics.field2046 - 1] = var3.field2608;
            return 1;
        } else if (arg0 == 1502) {
            field1121[++Statics.field2046 - 1] = var3.field2609;
            return 1;
        } else if (arg0 == 1503) {
            field1121[++Statics.field2046 - 1] = var3.field2610;
            return 1;
        } else if (arg0 == 1504) {
            field1121[++Statics.field2046 - 1] = var3.field2591 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1121[++Statics.field2046 - 1] = var3.field2613;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ju.x(ILco;ZB)I")
    public static int method4262(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field622 : Statics.field1123;
        if (arg0 == 1600) {
            field1121[++Statics.field2046 - 1] = var3.field2622;
            return 1;
        } else if (arg0 == 1601) {
            field1121[++Statics.field2046 - 1] = var3.field2616;
            return 1;
        } else if (arg0 == 1602) {
            field1122[++Statics.field1969 - 1] = var3.field2655;
            return 1;
        } else if (arg0 == 1603) {
            field1121[++Statics.field2046 - 1] = var3.field2617;
            return 1;
        } else if (arg0 == 1604) {
            field1121[++Statics.field2046 - 1] = var3.field2733;
            return 1;
        } else if (arg0 == 1605) {
            field1121[++Statics.field2046 - 1] = var3.field2648;
            return 1;
        } else if (arg0 == 1606) {
            field1121[++Statics.field2046 - 1] = var3.field2645;
            return 1;
        } else if (arg0 == 1607) {
            field1121[++Statics.field2046 - 1] = var3.field2711;
            return 1;
        } else if (arg0 == 1608) {
            field1121[++Statics.field2046 - 1] = var3.field2686;
            return 1;
        } else if (arg0 == 1609) {
            field1121[++Statics.field2046 - 1] = var3.field2666;
            return 1;
        } else if (arg0 == 1610) {
            field1121[++Statics.field2046 - 1] = var3.field2626;
            return 1;
        } else if (arg0 == 1611) {
            field1121[++Statics.field2046 - 1] = var3.field2580;
            return 1;
        } else if (arg0 == 1612) {
            field1121[++Statics.field2046 - 1] = var3.field2620;
            return 1;
        } else if (arg0 == 1613) {
            field1121[++Statics.field2046 - 1] = var3.field2619.method31();
            return 1;
        } else if (arg0 == 1614) {
            field1121[++Statics.field2046 - 1] = var3.field2677 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fr.p(ILco;ZI)I")
    public static int method3210(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field622 : Statics.field1123;
        if (arg0 == 1700) {
            field1121[++Statics.field2046 - 1] = var3.field2720;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2720 == -1) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = var3.field2623;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1121[++Statics.field2046 - 1] = var3.field2725;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.r(ILco;ZI)I")
    public static int method993(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field622 : Statics.field1123;
        if (arg0 == 1800) {
            field1121[++Statics.field2046 - 1] = class228.method3316(client.method222(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1121[--Statics.field2046];
            int var5 = var4 - 1;
            if (var3.field2693 == null || var5 >= var3.field2693.length || var3.field2693[var5] == null) {
                field1122[++Statics.field1969 - 1] = "";
            } else {
                field1122[++Statics.field1969 - 1] = var3.field2693[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2673 == null) {
                field1122[++Statics.field1969 - 1] = "";
            } else {
                field1122[++Statics.field1969 - 1] = var3.field2673;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("in.y(ILco;ZI)I")
    public static int method3890(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method3203(field1121[--Statics.field2046]);
        } else {
            var3 = arg2 ? Statics.field622 : Statics.field1123;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1120 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2618 == null) {
            return 0;
        } else {
            class72 var4 = new class72();
            var4.field611 = var3;
            var4.field607 = var3.field2618;
            var4.field601 = field1120 + 1;
            client.field683.method4639(var4);
            return 1;
        }
    }

    @ObfuscatedName("he.s(ILco;ZB)I")
    public static int method3876(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method3203(field1121[--Statics.field2046]);
        if (arg0 == 2500) {
            field1121[++Statics.field2046 - 1] = var3.field2607;
            return 1;
        } else if (arg0 == 2501) {
            field1121[++Statics.field2046 - 1] = var3.field2608;
            return 1;
        } else if (arg0 == 2502) {
            field1121[++Statics.field2046 - 1] = var3.field2609;
            return 1;
        } else if (arg0 == 2503) {
            field1121[++Statics.field2046 - 1] = var3.field2610;
            return 1;
        } else if (arg0 == 2504) {
            field1121[++Statics.field2046 - 1] = var3.field2591 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1121[++Statics.field2046 - 1] = var3.field2613;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g.d(ILco;ZI)I")
    public static int method217(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class227 var3 = class227.method3203(field1121[--Statics.field2046]);
            field1121[++Statics.field2046 - 1] = var3.field2720;
            return 1;
        } else if (arg0 == 2701) {
            class227 var4 = class227.method3203(field1121[--Statics.field2046]);
            if (var4.field2720 == -1) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = var4.field2623;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1121[--Statics.field2046];
            class71 var6 = (class71) client.field843.method5597((long) var5);
            if (var6 == null) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1121[++Statics.field2046 - 1] = client.field707;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.a(ILco;ZI)I")
    public static int method591(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method3203(field1121[--Statics.field2046]);
        if (arg0 == 2800) {
            field1121[++Statics.field2046 - 1] = class228.method3316(client.method222(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1121[--Statics.field2046];
            int var5 = var4 - 1;
            if (var3.field2693 == null || var5 >= var3.field2693.length || var3.field2693[var5] == null) {
                field1122[++Statics.field1969 - 1] = "";
            } else {
                field1122[++Statics.field1969 - 1] = var3.field2693[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2673 == null) {
                field1122[++Statics.field1969 - 1] = "";
            } else {
                field1122[++Statics.field1969 - 1] = var3.field2673;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ca.g(ILco;ZI)I")
    public static int method1966(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1122[--Statics.field1969];
            class101.method783(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field2046 -= 2;
            client.method3749(Statics.field3130, field1121[Statics.field2046], field1121[Statics.field2046 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1129) {
                field1131 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1122[--Statics.field1969];
            int var5 = 0;
            if (class302.method3434(var4)) {
                var5 = class302.method1841(var4);
            }
            class197 var6 = class197.method57(class193.field2269, client.field729.field1347);
            var6.field2371.method5166(var5);
            client.field729.method2178(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1122[--Statics.field1969];
            class197 var8 = class197.method57(class193.field2242, client.field729.field1347);
            var8.field2371.method5203(var7.length() + 1);
            var8.field2371.method5355(var7);
            client.field729.method2178(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1122[--Statics.field1969];
            class197 var10 = class197.method57(class193.field2271, client.field729.field1347);
            var10.field2371.method5203(var9.length() + 1);
            var10.field2371.method5355(var9);
            client.field729.method2178(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1121[--Statics.field2046];
            String var12 = field1122[--Statics.field1969];
            client.method5007(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field2046 -= 3;
            int var13 = field1121[Statics.field2046];
            int var14 = field1121[Statics.field2046 + 1];
            int var15 = field1121[Statics.field2046 + 2];
            class227 var16 = class227.method3203(var15);
            client.method3869(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field2046 -= 2;
            int var17 = field1121[Statics.field2046];
            int var18 = field1121[Statics.field2046 + 1];
            class227 var19 = arg2 ? Statics.field622 : Statics.field1123;
            client.method3869(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field2487 = field1121[--Statics.field2046] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1121[++Statics.field2046 - 1] = Statics.field108.field1084 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field108.field1084 = field1121[--Statics.field2046] == 1;
            class83.method2738();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1122[--Statics.field1969];
            boolean var21 = field1121[--Statics.field2046] == 1;
            class61.method2948(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1121[--Statics.field2046];
            class197 var23 = class197.method57(class193.field2317, client.field729.field1347);
            var23.field2371.method5164(var22);
            client.field729.method2178(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1121[--Statics.field2046];
            Statics.field1969 -= 2;
            String var25 = field1122[Statics.field1969];
            String var26 = field1122[Statics.field1969 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class197 var27 = class197.method57(class193.field2311, client.field729.field1347);
                var27.field2371.method5164(1 + class311.method3740(var25) + class311.method3740(var26));
                var27.field2371.method5355(var26);
                var27.field2371.method5203(var24);
                var27.field2371.method5355(var25);
                client.field729.method2178(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field898 = field1121[--Statics.field2046] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field930 = field1121[--Statics.field2046] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field887 = field1121[--Statics.field2046] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1121[--Statics.field2046] == 1) {
                client.field768 |= 0x1;
            } else {
                client.field768 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1121[--Statics.field2046] == 1) {
                client.field768 |= 0x2;
            } else {
                client.field768 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1121[--Statics.field2046] == 1) {
                client.field768 |= 0x4;
            } else {
                client.field768 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1121[--Statics.field2046] == 1) {
                client.field768 |= 0x8;
            } else {
                client.field768 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field768 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field787 = field1121[--Statics.field2046] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field810 = field1121[--Statics.field2046] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method3725(field1121[--Statics.field2046] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1121[++Statics.field2046 - 1] = client.method3484() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field2046 -= 2;
            client.field743 = field1121[Statics.field2046];
            client.field680 = field1121[Statics.field2046 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field2046 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field2046--;
            return 1;
        } else if (arg0 == 3132) {
            field1121[++Statics.field2046 - 1] = Statics.field567;
            field1121[++Statics.field2046 - 1] = Statics.field1150;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field2046--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field2046 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field844 = 3;
            client.field845 = field1121[--Statics.field2046];
            return 1;
        } else if (arg0 == 3137) {
            client.field844 = 2;
            client.field845 = field1121[--Statics.field2046];
            return 1;
        } else if (arg0 == 3138) {
            client.field844 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field844 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field844 = 3;
            client.field845 = arg2 ? Statics.field622.field2594 : Statics.field1123.field2594;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1121[--Statics.field2046] == 1;
            Statics.field108.field1088 = var28;
            class83.method2738();
            return 1;
        } else if (arg0 == 3142) {
            field1121[++Statics.field2046 - 1] = Statics.field108.field1088 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1121[--Statics.field2046] == 1;
            client.field719 = var29;
            if (!var29) {
                Statics.field108.field1087 = "";
                class83.method2738();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1121[++Statics.field2046 - 1] = client.field719 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1121[--Statics.field2046] == 1;
            if (Statics.field108.field1082 == var30) {
                Statics.field108.field1082 = !var30;
                class83.method2738();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1121[++Statics.field2046 - 1] = Statics.field108.field1082 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1121[++Statics.field2046 - 1] = class95.field1241;
            return 1;
        } else if (arg0 == 3154) {
            field1121[++Statics.field2046 - 1] = client.method1938();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1969--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field2046 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field2046--;
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field2046--;
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1969--;
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field2046--;
            field1122[++Statics.field1969 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field2046--;
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field2046 -= 2;
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field2046 -= 2;
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field2046 -= 2;
            field1122[++Statics.field1969 - 1] = "";
            field1122[++Statics.field1969 - 1] = "";
            field1122[++Statics.field1969 - 1] = "";
            field1122[++Statics.field1969 - 1] = "";
            field1122[++Statics.field1969 - 1] = "";
            field1122[++Statics.field1969 - 1] = "";
            field1122[++Statics.field1969 - 1] = "";
            field1122[++Statics.field1969 - 1] = "";
            field1122[++Statics.field1969 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field2046--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field2046--;
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field2046--;
            return 1;
        } else if (arg0 == 3175) {
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1969--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1969--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("az.h(ILco;ZI)I")
    public static int method353(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field2046 -= 3;
            client.method4224(field1121[Statics.field2046], field1121[Statics.field2046 + 1], field1121[Statics.field2046 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method2136(field1121[--Statics.field2046]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field2046 -= 2;
            client.method2027(field1121[Statics.field2046], field1121[Statics.field2046 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ep.ab(ILco;ZI)I")
    public static int method2869(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1121[++Statics.field2046 - 1] = client.field863;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field2046 -= 2;
            int var3 = field1121[Statics.field2046];
            int var4 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = class69.method151(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field2046 -= 2;
            int var5 = field1121[Statics.field2046];
            int var6 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = class69.method599(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field2046 -= 2;
            int var7 = field1121[Statics.field2046];
            int var8 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = class69.method3261(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = class251.method1117(var9).field3229;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = client.field814[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = client.field813[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = client.field816[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field99;
            int var14 = (Statics.field3130.field1000 >> 7) + Statics.field1641;
            int var15 = (Statics.field3130.field976 >> 7) + Statics.field132;
            field1121[++Statics.field2046 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1121[++Statics.field2046 - 1] = client.field684 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field2046 -= 2;
            int var19 = field1121[Statics.field2046] + 32768;
            int var20 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = class69.method151(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field2046 -= 2;
            int var21 = field1121[Statics.field2046] + 32768;
            int var22 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = class69.method599(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field2046 -= 2;
            int var23 = field1121[Statics.field2046] + 32768;
            int var24 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = class69.method3261(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field851 >= 2) {
                field1121[++Statics.field2046 - 1] = client.field851;
            } else {
                field1121[++Statics.field2046 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1121[++Statics.field2046 - 1] = client.field698;
            return 1;
        } else if (arg0 == 3318) {
            field1121[++Statics.field2046 - 1] = client.field817;
            return 1;
        } else if (arg0 == 3321) {
            field1121[++Statics.field2046 - 1] = client.field712;
            return 1;
        } else if (arg0 == 3322) {
            field1121[++Statics.field2046 - 1] = client.field850;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field865) {
                field1121[++Statics.field2046 - 1] = 1;
            } else {
                field1121[++Statics.field2046 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1121[++Statics.field2046 - 1] = client.field682;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field2046 -= 4;
            int var25 = field1121[Statics.field2046];
            int var26 = field1121[Statics.field2046 + 1];
            int var27 = field1121[Statics.field2046 + 2];
            int var28 = field1121[Statics.field2046 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1121[++Statics.field2046 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.ac(ILco;ZB)I")
    public static int method1195(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field2046 -= 2;
            int var3 = field1121[Statics.field2046];
            int var4 = field1121[Statics.field2046 + 1];
            class263 var5 = class263.method2433(var3);
            if (var5.field3343 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3344; var6++) {
                if (var5.field3345[var6] == var4) {
                    field1122[++Statics.field1969 - 1] = var5.field3346[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1122[++Statics.field1969 - 1] = var5.field3342;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field2046 -= 4;
            int var7 = field1121[Statics.field2046];
            int var8 = field1121[Statics.field2046 + 1];
            int var9 = field1121[Statics.field2046 + 2];
            int var10 = field1121[Statics.field2046 + 3];
            class263 var11 = class263.method2433(var9);
            if (var11.field3340 != var7 || var11.field3343 != var8) {
                if (var8 == 115) {
                    field1122[++Statics.field1969 - 1] = class234.field2793;
                } else {
                    field1121[++Statics.field2046 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3344; var12++) {
                if (var11.field3345[var12] == var10) {
                    if (var8 == 115) {
                        field1122[++Statics.field1969 - 1] = var11.field3346[var12];
                    } else {
                        field1121[++Statics.field2046 - 1] = var11.field3338[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1122[++Statics.field1969 - 1] = var11.field3342;
                } else {
                    field1121[++Statics.field2046 - 1] = var11.field3348;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1121[--Statics.field2046];
            class263 var14 = class263.method2433(var13);
            field1121[++Statics.field2046 - 1] = var14.method4303();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ho.ao(ILco;ZI)I")
    public static int method3741(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field150.field1098 == 0) {
                field1121[++Statics.field2046 - 1] = -2;
            } else if (Statics.field150.field1098 == 1) {
                field1121[++Statics.field2046 - 1] = -1;
            } else {
                field1121[++Statics.field2046 - 1] = Statics.field150.field1096.method4816();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1121[--Statics.field2046];
            if (Statics.field150.method1775() && var3 >= 0 && var3 < Statics.field150.field1096.method4816()) {
                class295 var4 = (class295) Statics.field150.field1096.method4817(var3);
                field1122[++Statics.field1969 - 1] = var4.method4768();
                field1122[++Statics.field1969 - 1] = var4.method4769();
            } else {
                field1122[++Statics.field1969 - 1] = "";
                field1122[++Statics.field1969 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1121[--Statics.field2046];
            if (Statics.field150.method1775() && var5 >= 0 && var5 < Statics.field150.field1096.method4816()) {
                field1121[++Statics.field2046 - 1] = ((class290) Statics.field150.field1096.method4817(var5)).field3641;
            } else {
                field1121[++Statics.field2046 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1121[--Statics.field2046];
            if (Statics.field150.method1775() && var6 >= 0 && var6 < Statics.field150.field1096.method4816()) {
                field1121[++Statics.field2046 - 1] = ((class290) Statics.field150.field1096.method4817(var6)).field3643;
            } else {
                field1121[++Statics.field2046 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1122[--Statics.field1969];
            int var8 = field1121[--Statics.field2046];
            class84.method979(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1122[--Statics.field1969];
            Statics.field150.method1782(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1122[--Statics.field1969];
            Statics.field150.method1786(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1122[--Statics.field1969];
            Statics.field150.method1784(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1122[--Statics.field1969];
            Statics.field150.method1822(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1122[--Statics.field1969];
            String var14 = client.method186(var13);
            field1121[++Statics.field2046 - 1] = Statics.field150.method1814(new class294(var14, Statics.field1990), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field438 == null) {
                field1122[++Statics.field1969 - 1] = "";
            } else {
                field1122[++Statics.field1969 - 1] = Statics.field438.field3664;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field438 == null) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = Statics.field438.method4816();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1121[--Statics.field2046];
            if (Statics.field438 == null || var15 >= Statics.field438.method4816()) {
                field1122[++Statics.field1969 - 1] = "";
            } else {
                field1122[++Statics.field1969 - 1] = Statics.field438.method4817(var15).method4780().method4912();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1121[--Statics.field2046];
            if (Statics.field438 == null || var16 >= Statics.field438.method4816()) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = ((class290) Statics.field438.method4817(var16)).method4881();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1121[--Statics.field2046];
            if (Statics.field438 == null || var17 >= Statics.field438.method4816()) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = ((class290) Statics.field438.method4817(var17)).field3643;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1121[++Statics.field2046 - 1] = Statics.field438 == null ? 0 : Statics.field438.field3666;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1122[--Statics.field1969];
            client.method1067(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1121[++Statics.field2046 - 1] = Statics.field438 == null ? 0 : Statics.field438.field3668;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1122[--Statics.field1969];
            client.method1129(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method17();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field150.method1775()) {
                field1121[++Statics.field2046 - 1] = Statics.field150.field1097.method4816();
            } else {
                field1121[++Statics.field2046 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1121[--Statics.field2046];
            if (Statics.field150.method1775() && var20 >= 0 && var20 < Statics.field150.field1097.method4816()) {
                class289 var21 = (class289) Statics.field150.field1097.method4817(var20);
                field1122[++Statics.field1969 - 1] = var21.method4768();
                field1122[++Statics.field1969 - 1] = var21.method4769();
            } else {
                field1122[++Statics.field1969 - 1] = "";
                field1122[++Statics.field1969 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1122[--Statics.field1969];
            String var23 = client.method186(var22);
            field1121[++Statics.field2046 - 1] = Statics.field150.method1781(new class294(var23, Statics.field1990)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1121[--Statics.field2046];
            if (Statics.field438 == null || var24 >= Statics.field438.method4816() || !Statics.field438.method4817(var24).method4780().equals(Statics.field3130.field660)) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field438 == null || Statics.field438.field3665 == null) {
                field1122[++Statics.field1969 - 1] = "";
            } else {
                field1122[++Statics.field1969 - 1] = Statics.field438.field3665;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1121[--Statics.field2046];
            if (Statics.field438 == null || var25 >= Statics.field438.method4816() || !((class284) Statics.field438.method4817(var25)).method4745()) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1121[--Statics.field2046];
            if (Statics.field438 == null || var26 >= Statics.field438.method4816() || !((class284) Statics.field438.method4817(var26)).method4748()) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field150.field1096.method4829();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1096.method4849(new class325(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1096.method4849(new class326(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1096.method4849(new class167(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1096.method4849(new class161(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1096.method4849(new class166(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1096.method4849(new class169(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1096.method4849(new class165(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1096.method4849(new class163(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1096.method4849(new class162(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1096.method4849(new class164(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field150.field1096.method4841();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field150.field1097.method4829();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1097.method4849(new class325(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1097.method4849(new class326(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field150.field1097.method4841();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field438 != null) {
                Statics.field438.method4829();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1121[--Statics.field2046] == 1;
            if (Statics.field438 != null) {
                Statics.field438.method4849(new class325(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1121[--Statics.field2046] == 1;
            if (Statics.field438 != null) {
                Statics.field438.method4849(new class326(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1121[--Statics.field2046] == 1;
            if (Statics.field438 != null) {
                Statics.field438.method4849(new class167(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1121[--Statics.field2046] == 1;
            if (Statics.field438 != null) {
                Statics.field438.method4849(new class161(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1121[--Statics.field2046] == 1;
            if (Statics.field438 != null) {
                Statics.field438.method4849(new class166(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1121[--Statics.field2046] == 1;
            if (Statics.field438 != null) {
                Statics.field438.method4849(new class169(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1121[--Statics.field2046] == 1;
            if (Statics.field438 != null) {
                Statics.field438.method4849(new class165(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1121[--Statics.field2046] == 1;
            if (Statics.field438 != null) {
                Statics.field438.method4849(new class163(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1121[--Statics.field2046] == 1;
            if (Statics.field438 != null) {
                Statics.field438.method4849(new class162(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1121[--Statics.field2046] == 1;
            if (Statics.field438 != null) {
                Statics.field438.method4849(new class164(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field438 != null) {
                Statics.field438.method4841();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1121[--Statics.field2046] == 1;
            Statics.field150.field1096.method4849(new class168(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1121[--Statics.field2046] == 1;
            if (Statics.field438 != null) {
                Statics.field438.method4849(new class168(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hq.af(ILco;ZI)I")
    public static int method3721(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = client.field949[var3].method156();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = client.field949[var4].field85;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = client.field949[var5].field84;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = client.field949[var6].field87;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = client.field949[var7].field90;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = client.field949[var8].field89;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1121[--Statics.field2046];
            int var10 = client.field949[var9].method155();
            field1121[++Statics.field2046 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1121[--Statics.field2046];
            int var12 = client.field949[var11].method155();
            field1121[++Statics.field2046 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1121[--Statics.field2046];
            int var14 = client.field949[var13].method155();
            field1121[++Statics.field2046 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1121[--Statics.field2046];
            int var16 = client.field949[var15].method155();
            field1121[++Statics.field2046 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1121[--Statics.field2046] == 1;
            if (Statics.field236 != null) {
                Statics.field236.method130(class16.field66, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1121[--Statics.field2046] == 1;
            if (Statics.field236 != null) {
                Statics.field236.method130(class16.field67, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field2046 -= 2;
            boolean var19 = field1121[Statics.field2046] == 1;
            boolean var20 = field1121[Statics.field2046 + 1] == 1;
            if (Statics.field236 != null) {
                client.field950.field677 = var20;
                Statics.field236.method130(client.field950, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1121[--Statics.field2046] == 1;
            if (Statics.field236 != null) {
                Statics.field236.method130(class16.field63, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1121[--Statics.field2046] == 1;
            if (Statics.field236 != null) {
                Statics.field236.method130(class16.field64, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1121[++Statics.field2046 - 1] = Statics.field236 == null ? 0 : Statics.field236.field68.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1121[--Statics.field2046];
            class17 var24 = (class17) Statics.field236.field68.get(var23);
            field1121[++Statics.field2046 - 1] = var24.field77;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1121[--Statics.field2046];
            class17 var26 = (class17) Statics.field236.field68.get(var25);
            field1122[++Statics.field1969 - 1] = var26.method141();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1121[--Statics.field2046];
            class17 var28 = (class17) Statics.field236.field68.get(var27);
            field1122[++Statics.field1969 - 1] = var28.method135();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1121[--Statics.field2046];
            class17 var30 = (class17) Statics.field236.field68.get(var29);
            long var31 = class308.method4786() - Statics.field445 - var30.field72;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1122[++Statics.field1969 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1121[--Statics.field2046];
            class17 var38 = (class17) Statics.field236.field68.get(var37);
            field1121[++Statics.field2046 - 1] = var38.field80.field87;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1121[--Statics.field2046];
            class17 var40 = (class17) Statics.field236.field68.get(var39);
            field1121[++Statics.field2046 - 1] = var40.field80.field84;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1121[--Statics.field2046];
            class17 var42 = (class17) Statics.field236.field68.get(var41);
            field1121[++Statics.field2046 - 1] = var42.field80.field85;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.av(ILco;ZB)I")
    public static int method1661(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field2046 -= 2;
            int var3 = field1121[Statics.field2046];
            int var4 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field2046 -= 2;
            int var5 = field1121[Statics.field2046];
            int var6 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field2046 -= 2;
            int var7 = field1121[Statics.field2046];
            int var8 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field2046 -= 2;
            int var9 = field1121[Statics.field2046];
            int var10 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field2046 -= 5;
            int var13 = field1121[Statics.field2046];
            int var14 = field1121[Statics.field2046 + 1];
            int var15 = field1121[Statics.field2046 + 2];
            int var16 = field1121[Statics.field2046 + 3];
            int var17 = field1121[Statics.field2046 + 4];
            field1121[++Statics.field2046 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field2046 -= 2;
            int var18 = field1121[Statics.field2046];
            int var19 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field2046 -= 2;
            int var20 = field1121[Statics.field2046];
            int var21 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field2046 -= 2;
            int var22 = field1121[Statics.field2046];
            int var23 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field2046 -= 2;
            int var24 = field1121[Statics.field2046];
            int var25 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field2046 -= 2;
            int var26 = field1121[Statics.field2046];
            int var27 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field2046 -= 2;
            int var28 = field1121[Statics.field2046];
            int var29 = field1121[Statics.field2046 + 1];
            if (var28 == 0) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field2046 -= 2;
            int var30 = field1121[Statics.field2046];
            int var31 = field1121[Statics.field2046 + 1];
            if (var30 == 0) {
                field1121[++Statics.field2046 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1121[++Statics.field2046 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1121[++Statics.field2046 - 1] = var30;
                    break;
                case 2:
                    field1121[++Statics.field2046 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1121[++Statics.field2046 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1121[++Statics.field2046 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1121[++Statics.field2046 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field2046 -= 2;
            int var32 = field1121[Statics.field2046];
            int var33 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field2046 -= 2;
            int var34 = field1121[Statics.field2046];
            int var35 = field1121[Statics.field2046 + 1];
            field1121[++Statics.field2046 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field2046 -= 3;
            long var36 = (long) field1121[Statics.field2046];
            long var38 = (long) field1121[Statics.field2046 + 1];
            long var40 = (long) field1121[Statics.field2046 + 2];
            field1121[++Statics.field2046 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ib.ar(ILco;ZI)I")
    public static int method4057(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1122[--Statics.field1969];
            int var4 = field1121[--Statics.field2046];
            field1122[++Statics.field1969 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1969 -= 2;
            String var5 = field1122[Statics.field1969];
            String var6 = field1122[Statics.field1969 + 1];
            field1122[++Statics.field1969 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1122[--Statics.field1969];
            int var8 = field1121[--Statics.field2046];
            field1122[++Statics.field1969 - 1] = var7 + class302.method3453(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1122[--Statics.field1969];
            field1122[++Statics.field1969 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1121[--Statics.field2046];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1126.setTime(new Date(var11));
            int var13 = field1126.get(5);
            int var14 = field1126.get(2);
            int var15 = field1126.get(1);
            field1122[++Statics.field1969 - 1] = var13 + "-" + field1127[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1969 -= 2;
            String var16 = field1122[Statics.field1969];
            String var17 = field1122[Statics.field1969 + 1];
            if (Statics.field3130.field646 != null && Statics.field3130.field646.field2562) {
                field1122[++Statics.field1969 - 1] = var17;
            } else {
                field1122[++Statics.field1969 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1121[--Statics.field2046];
            field1122[++Statics.field1969 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1969 -= 2;
            field1121[++Statics.field2046 - 1] = class302.method4305(class298.method784(field1122[Statics.field1969], field1122[Statics.field1969 + 1], Statics.field3691));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1122[--Statics.field1969];
            Statics.field2046 -= 2;
            int var20 = field1121[Statics.field2046];
            int var21 = field1121[Statics.field2046 + 1];
            byte[] var22 = Statics.field35.method3905(var21, 0);
            class306 var23 = new class306(var22);
            field1121[++Statics.field2046 - 1] = var23.method5031(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1122[--Statics.field1969];
            Statics.field2046 -= 2;
            int var25 = field1121[Statics.field2046];
            int var26 = field1121[Statics.field2046 + 1];
            byte[] var27 = Statics.field35.method3905(var26, 0);
            class306 var28 = new class306(var27);
            field1121[++Statics.field2046 - 1] = var28.method5030(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1969 -= 2;
            String var29 = field1122[Statics.field1969];
            String var30 = field1122[Statics.field1969 + 1];
            if (field1121[--Statics.field2046] == 1) {
                field1122[++Statics.field1969 - 1] = var29;
            } else {
                field1122[++Statics.field1969 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1122[--Statics.field1969];
            field1122[++Statics.field1969 - 1] = class307.method5032(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1122[--Statics.field1969];
            int var33 = field1121[--Statics.field2046];
            field1122[++Statics.field1969 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = class302.method2348((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = class302.method37((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = class302.method334((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = class302.method11((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1122[--Statics.field1969];
            if (var38 == null) {
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1122[--Statics.field1969];
            Statics.field2046 -= 2;
            int var40 = field1121[Statics.field2046];
            int var41 = field1121[Statics.field2046 + 1];
            field1122[++Statics.field1969 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1122[--Statics.field1969];
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
            field1122[++Statics.field1969 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1122[--Statics.field1969];
            int var48 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1969 -= 2;
            String var49 = field1122[Statics.field1969];
            String var50 = field1122[Statics.field1969 + 1];
            int var51 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1122[--Statics.field1969];
            field1122[++Statics.field1969 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gc.ay(ILco;ZI)I")
    public static int method3477(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1121[--Statics.field2046];
            field1122[++Statics.field1969 - 1] = class266.method335(var3).field3434;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field2046 -= 2;
            int var4 = field1121[Statics.field2046];
            int var5 = field1121[Statics.field2046 + 1];
            class266 var6 = class266.method335(var4);
            if (var5 < 1 || var5 > 5 || var6.field3448[var5 - 1] == null) {
                field1122[++Statics.field1969 - 1] = "";
            } else {
                field1122[++Statics.field1969 - 1] = var6.field3448[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field2046 -= 2;
            int var7 = field1121[Statics.field2046];
            int var8 = field1121[Statics.field2046 + 1];
            class266 var9 = class266.method335(var7);
            if (var8 < 1 || var8 > 5 || var9.field3449[var8 - 1] == null) {
                field1122[++Statics.field1969 - 1] = "";
            } else {
                field1122[++Statics.field1969 - 1] = var9.field3449[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = class266.method335(var10).field3446;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = class266.method335(var11).field3458 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1121[--Statics.field2046];
            class266 var13 = class266.method335(var12);
            if (var13.field3466 == -1 && var13.field3465 >= 0) {
                field1121[++Statics.field2046 - 1] = var13.field3465;
            } else {
                field1121[++Statics.field2046 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1121[--Statics.field2046];
            class266 var15 = class266.method335(var14);
            if (var15.field3466 >= 0 && var15.field3465 >= 0) {
                field1121[++Statics.field2046 - 1] = var15.field3465;
            } else {
                field1121[++Statics.field2046 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = class266.method335(var16).field3447 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1121[--Statics.field2046];
            class266 var18 = class266.method335(var17);
            if (var18.field3429 == -1 && var18.field3440 >= 0) {
                field1121[++Statics.field2046 - 1] = var18.field3440;
            } else {
                field1121[++Statics.field2046 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1121[--Statics.field2046];
            class266 var20 = class266.method335(var19);
            if (var20.field3429 >= 0 && var20.field3440 >= 0) {
                field1121[++Statics.field2046 - 1] = var20.field3440;
            } else {
                field1121[++Statics.field2046 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1122[--Statics.field1969];
            int var22 = field1121[--Statics.field2046];
            client.method213(var21, var22 == 1);
            field1121[++Statics.field2046 - 1] = Statics.field974;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field641 == null || Statics.field314 >= Statics.field974) {
                field1121[++Statics.field2046 - 1] = -1;
            } else {
                field1121[++Statics.field2046 - 1] = Statics.field641[++Statics.field314 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field314 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.ah(ILco;ZI)I")
    public static int method442(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1121[++Statics.field2046 - 1] = client.field788;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field2046 -= 3;
            client.field788 = field1121[Statics.field2046];
            Statics.field290 = class321.method1128(field1121[Statics.field2046 + 1]);
            if (Statics.field290 == null) {
                Statics.field290 = class321.field3825;
            }
            client.field881 = field1121[Statics.field2046 + 2];
            class197 var3 = class197.method57(class193.field2246, client.field729.field1347);
            var3.field2371.method5203(client.field788);
            var3.field2371.method5203(Statics.field290.field3826);
            var3.field2371.method5203(client.field881);
            client.field729.method2178(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1122[--Statics.field1969];
            Statics.field2046 -= 2;
            int var5 = field1121[Statics.field2046];
            int var6 = field1121[Statics.field2046 + 1];
            class197 var7 = class197.method57(class193.field2280, client.field729.field1347);
            var7.field2371.method5203(class311.method3740(var4) + 2);
            var7.field2371.method5355(var4);
            var7.field2371.method5203(var5 - 1);
            var7.field2371.method5203(var6);
            client.field729.method2178(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field2046 -= 2;
            int var8 = field1121[Statics.field2046];
            int var9 = field1121[Statics.field2046 + 1];
            class74 var10 = class101.method56(var8, var9);
            if (var10 == null) {
                field1121[++Statics.field2046 - 1] = -1;
                field1121[++Statics.field2046 - 1] = 0;
                field1122[++Statics.field1969 - 1] = "";
                field1122[++Statics.field1969 - 1] = "";
                field1122[++Statics.field1969 - 1] = "";
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = var10.field639;
                field1121[++Statics.field2046 - 1] = var10.field633;
                field1122[++Statics.field1969 - 1] = var10.field642 == null ? "" : var10.field642;
                field1122[++Statics.field1969 - 1] = var10.field632 == null ? "" : var10.field632;
                field1122[++Statics.field1969 - 1] = var10.field640 == null ? "" : var10.field640;
                field1121[++Statics.field2046 - 1] = var10.method1132() ? 1 : (var10.method1135() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1121[--Statics.field2046];
            class74 var12 = class101.method1971(var11);
            if (var12 == null) {
                field1121[++Statics.field2046 - 1] = -1;
                field1121[++Statics.field2046 - 1] = 0;
                field1122[++Statics.field1969 - 1] = "";
                field1122[++Statics.field1969 - 1] = "";
                field1122[++Statics.field1969 - 1] = "";
                field1121[++Statics.field2046 - 1] = 0;
            } else {
                field1121[++Statics.field2046 - 1] = var12.field634;
                field1121[++Statics.field2046 - 1] = var12.field633;
                field1122[++Statics.field1969 - 1] = var12.field642 == null ? "" : var12.field642;
                field1122[++Statics.field1969 - 1] = var12.field632 == null ? "" : var12.field632;
                field1122[++Statics.field1969 - 1] = var12.field640 == null ? "" : var12.field640;
                field1121[++Statics.field2046 - 1] = var12.method1132() ? 1 : (var12.method1135() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field290 == null) {
                field1121[++Statics.field2046 - 1] = -1;
            } else {
                field1121[++Statics.field2046 - 1] = Statics.field290.field3826;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1122[--Statics.field1969];
            int var14 = field1121[--Statics.field2046];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class234.field2965)) {
                var16 = 0;
                var13 = var13.substring(class234.field2965.length());
            } else if (var15.startsWith(class234.field2896)) {
                var16 = 1;
                var13 = var13.substring(class234.field2896.length());
            } else if (var15.startsWith(class234.field2831)) {
                var16 = 2;
                var13 = var13.substring(class234.field2831.length());
            } else if (var15.startsWith(class234.field2971)) {
                var16 = 3;
                var13 = var13.substring(class234.field2971.length());
            } else if (var15.startsWith(class234.field2885)) {
                var16 = 4;
                var13 = var13.substring(class234.field2885.length());
            } else if (var15.startsWith(class234.field3013)) {
                var16 = 5;
                var13 = var13.substring(class234.field3013.length());
            } else if (var15.startsWith(class234.field2977)) {
                var16 = 6;
                var13 = var13.substring(class234.field2977.length());
            } else if (var15.startsWith(class234.field2979)) {
                var16 = 7;
                var13 = var13.substring(class234.field2979.length());
            } else if (var15.startsWith(class234.field2981)) {
                var16 = 8;
                var13 = var13.substring(class234.field2981.length());
            } else if (var15.startsWith(class234.field2934)) {
                var16 = 9;
                var13 = var13.substring(class234.field2934.length());
            } else if (var15.startsWith(class234.field2798)) {
                var16 = 10;
                var13 = var13.substring(class234.field2798.length());
            } else if (var15.startsWith(class234.field2987)) {
                var16 = 11;
                var13 = var13.substring(class234.field2987.length());
            } else if (Statics.field3691 != class200.field2384) {
                if (var15.startsWith(class234.field2982)) {
                    var16 = 0;
                    var13 = var13.substring(class234.field2982.length());
                } else if (var15.startsWith(class234.field2968)) {
                    var16 = 1;
                    var13 = var13.substring(class234.field2968.length());
                } else if (var15.startsWith(class234.field2970)) {
                    var16 = 2;
                    var13 = var13.substring(class234.field2970.length());
                } else if (var15.startsWith(class234.field2903)) {
                    var16 = 3;
                    var13 = var13.substring(class234.field2903.length());
                } else if (var15.startsWith(class234.field2974)) {
                    var16 = 4;
                    var13 = var13.substring(class234.field2974.length());
                } else if (var15.startsWith(class234.field2976)) {
                    var16 = 5;
                    var13 = var13.substring(class234.field2976.length());
                } else if (var15.startsWith(class234.field2953)) {
                    var16 = 6;
                    var13 = var13.substring(class234.field2953.length());
                } else if (var15.startsWith(class234.field2980)) {
                    var16 = 7;
                    var13 = var13.substring(class234.field2980.length());
                } else if (var15.startsWith(class234.field2830)) {
                    var16 = 8;
                    var13 = var13.substring(class234.field2830.length());
                } else if (var15.startsWith(class234.field3011)) {
                    var16 = 9;
                    var13 = var13.substring(class234.field3011.length());
                } else if (var15.startsWith(class234.field2785)) {
                    var16 = 10;
                    var13 = var13.substring(class234.field2785.length());
                } else if (var15.startsWith(class234.field2988)) {
                    var16 = 11;
                    var13 = var13.substring(class234.field2988.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class234.field2989)) {
                var18 = 1;
                var13 = var13.substring(class234.field2989.length());
            } else if (var17.startsWith(class234.field2805)) {
                var18 = 2;
                var13 = var13.substring(class234.field2805.length());
            } else if (var17.startsWith(class234.field2894)) {
                var18 = 3;
                var13 = var13.substring(class234.field2894.length());
            } else if (var17.startsWith(class234.field3021)) {
                var18 = 4;
                var13 = var13.substring(class234.field3021.length());
            } else if (var17.startsWith(class234.field3025)) {
                var18 = 5;
                var13 = var13.substring(class234.field3025.length());
            } else if (Statics.field3691 != class200.field2384) {
                if (var17.startsWith(class234.field2990)) {
                    var18 = 1;
                    var13 = var13.substring(class234.field2990.length());
                } else if (var17.startsWith(class234.field2819)) {
                    var18 = 2;
                    var13 = var13.substring(class234.field2819.length());
                } else if (var17.startsWith(class234.field2994)) {
                    var18 = 3;
                    var13 = var13.substring(class234.field2994.length());
                } else if (var17.startsWith(class234.field2996)) {
                    var18 = 4;
                    var13 = var13.substring(class234.field2996.length());
                } else if (var17.startsWith(class234.field2998)) {
                    var18 = 5;
                    var13 = var13.substring(class234.field2998.length());
                }
            }
            class197 var19 = class197.method57(class193.field2270, client.field729.field1347);
            var19.field2371.method5203(0);
            int var20 = var19.field2371.field3741;
            var19.field2371.method5203(var14);
            var19.field2371.method5203(var16);
            var19.field2371.method5203(var18);
            class220.method237(var19.field2371, var13);
            var19.field2371.method5177(var19.field2371.field3741 - var20);
            client.field729.method2178(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1969 -= 2;
            String var21 = field1122[Statics.field1969];
            String var22 = field1122[Statics.field1969 + 1];
            class197 var23 = class197.method57(class193.field2327, client.field729.field1347);
            var23.field2371.method5164(0);
            int var24 = var23.field2371.field3741;
            var23.field2371.method5355(var21);
            class220.method237(var23.field2371, var22);
            var23.field2371.method5176(var23.field2371.field3741 - var24);
            client.field729.method2178(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field3130 == null || Statics.field3130.field660 == null) {
                var25 = "";
            } else {
                var25 = Statics.field3130.field660.method4912();
            }
            field1122[++Statics.field1969 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1121[++Statics.field2046 - 1] = client.field881;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = class101.method22(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = class101.method2401(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1121[--Statics.field2046];
            field1121[++Statics.field2046 - 1] = class101.method1977(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1122[--Statics.field1969];
            client.method5119(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field711 = field1122[--Statics.field1969].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1122[++Statics.field1969 - 1] = client.field711;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1122[--Statics.field1969];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bw.az(ILco;ZB)I")
    public static int method1063(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1121[++Statics.field2046 - 1] = client.method3139();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1121[--Statics.field2046];
            if (var3 == 1 || var3 == 2) {
                client.method4717(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1121[++Statics.field2046 - 1] = Statics.field108.field1091;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1121[--Statics.field2046];
            if (var4 == 1 || var4 == 2) {
                Statics.field108.field1091 = var4;
                class83.method2738();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field2046--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fz.ak(ILco;ZB)I")
    public static int method3271(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field2046 -= 2;
            int var3 = field1121[Statics.field2046];
            int var4 = field1121[Statics.field2046 + 1];
            if (!client.field776) {
                client.field802 = var3;
                client.field708 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1121[++Statics.field2046 - 1] = client.field802;
            return 1;
        } else if (arg0 == 5506) {
            field1121[++Statics.field2046 - 1] = client.field708;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1121[--Statics.field2046];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field758 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1121[++Statics.field2046 - 1] = client.field758;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.au(ILco;ZI)I")
    public static int method435(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field939 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ko.ai(II)I")
    public static int method5004(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("bs.ax(II)I")
    public static int method1112(int arg0) {
        return (int) ((Math.log((double) arg0) / field1130 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("a.ag(ILco;ZB)I")
    public static int method212(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field2046 -= 2;
            client.field874 = (short) method5004(field1121[Statics.field2046]);
            if (client.field874 <= 0) {
                client.field874 = 256;
            }
            client.field933 = (short) method5004(field1121[Statics.field2046 + 1]);
            if (client.field933 <= 0) {
                client.field933 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field2046 -= 2;
            client.field934 = (short) field1121[Statics.field2046];
            if (client.field934 <= 0) {
                client.field934 = 256;
            }
            client.field935 = (short) field1121[Statics.field2046 + 1];
            if (client.field935 <= 0) {
                client.field935 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field2046 -= 4;
            client.field866 = (short) field1121[Statics.field2046];
            if (client.field866 <= 0) {
                client.field866 = 1;
            }
            client.field754 = (short) field1121[Statics.field2046 + 1];
            if (client.field754 <= 0) {
                client.field754 = 32767;
            } else if (client.field754 < client.field866) {
                client.field754 = client.field866;
            }
            client.field938 = (short) field1121[Statics.field2046 + 2];
            if (client.field938 <= 0) {
                client.field938 = 1;
            }
            client.field936 = (short) field1121[Statics.field2046 + 3];
            if (client.field936 <= 0) {
                client.field936 = 32767;
            } else if (client.field936 < client.field938) {
                client.field936 = client.field938;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field916 == null) {
                field1121[++Statics.field2046 - 1] = -1;
                field1121[++Statics.field2046 - 1] = -1;
            } else {
                client.method3766(0, 0, client.field916.field2609, client.field916.field2610, false);
                field1121[++Statics.field2046 - 1] = client.field937;
                field1121[++Statics.field2046 - 1] = client.field943;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1121[++Statics.field2046 - 1] = client.field934;
            field1121[++Statics.field2046 - 1] = client.field935;
            return 1;
        } else if (arg0 == 6205) {
            field1121[++Statics.field2046 - 1] = method1112(client.field874);
            field1121[++Statics.field2046 - 1] = method1112(client.field933);
            return 1;
        } else if (arg0 == 6220) {
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1121[++Statics.field2046 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1121[++Statics.field2046 - 1] = Statics.field567;
            return 1;
        } else if (arg0 == 6223) {
            field1121[++Statics.field2046 - 1] = Statics.field1150;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bm.an(II)V")
    public static void method1066(int arg0) {
        if (arg0 == -1 || !class227.method1068(arg0)) {
            return;
        }
        class227[] var1 = Statics.field2584[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class227 var3 = var1[var2];
            if (var3.field2681 != null) {
                class72 var4 = new class72();
                var4.field611 = var3;
                var4.field607 = var3.field2681;
                method797(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("ae.am(ILhw;ZI)V")
    public static void method664(int arg0, class223 arg1, boolean arg2) {
        class36 var3 = client.method794().method5961(arg0);
        int var4 = Statics.field3130.field666;
        int var5 = (Statics.field3130.field1000 >> 7) + Statics.field1641;
        int var6 = (Statics.field3130.field976 >> 7) + Statics.field132;
        class223 var7 = new class223(var4, var5, var6);
        client.method794().method5944(var3, var7, arg1, arg2);
    }
}
