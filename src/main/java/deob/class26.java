package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("i")
public class class26 {

    @ObfuscatedName("i.r")
    public static int[] field405 = new int[5];

    @ObfuscatedName("i.p")
    public static int[][] field402 = new int[5][5000];

    @ObfuscatedName("i.n")
    public static int[] field403 = new int[1000];

    @ObfuscatedName("i.o")
    public static String[] field398 = new String[1000];

    @ObfuscatedName("i.l")
    public static int field415 = 0;

    @ObfuscatedName("i.t")
    public static class18[] field404 = new class18[50];

    @ObfuscatedName("i.z")
    public static Calendar field408 = Calendar.getInstance();

    @ObfuscatedName("i.s")
    public static final String[] field409 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.a(La;B)V")
    public static void method22(class1 arg0) {
        Object[] var1 = arg0.field4;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method2669(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field69;
        int[] var8 = var3.field71;
        byte var9 = -1;
        field415 = 0;
        try {
            Statics.field399 = new int[var3.field70];
            int var10 = 0;
            Statics.field406 = new String[var3.field73];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field3;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field9;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2583;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2584;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2583;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2584;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field8;
                    }
                    Statics.field399[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field11;
                    }
                    Statics.field406[var11++] = var14;
                }
            }
            int var15 = 0;
            label2296: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var359 = var7[var6];
                if (var359 < 100) {
                    if (var359 == 0) {
                        field403[var4++] = var8[var6];
                        continue;
                    }
                    if (var359 == 1) {
                        int var16 = var8[var6];
                        field403[var4++] = class159.field2701[var16];
                        continue;
                    }
                    if (var359 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class159.field2701[var17] = field403[var4];
                        continue;
                    }
                    if (var359 == 3) {
                        field398[var5++] = var3.field68[var6];
                        continue;
                    }
                    if (var359 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var359 == 7) {
                        var4 -= 2;
                        if (field403[var4 + 1] != field403[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var359 == 8) {
                        var4 -= 2;
                        if (field403[var4 + 1] == field403[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var359 == 9) {
                        var4 -= 2;
                        if (field403[var4] < field403[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var359 == 10) {
                        var4 -= 2;
                        if (field403[var4] > field403[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var359 == 21) {
                        if (field415 == 0) {
                            return;
                        }
                        class18 var18 = field404[--field415];
                        var3 = var18.field269;
                        var7 = var3.field69;
                        var8 = var3.field71;
                        var6 = var18.field273;
                        Statics.field399 = var18.field263;
                        Statics.field406 = var18.field266;
                        continue;
                    }
                    if (var359 == 25) {
                        int var19 = var8[var6];
                        field403[var4++] = class159.method2341(var19);
                        continue;
                    }
                    if (var359 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field403[var4];
                        class38 var22 = class38.method2642(var20);
                        int var23 = var22.field974;
                        int var24 = var22.field973;
                        int var25 = var22.field970;
                        int var26 = class159.field2704[var25 - var24];
                        if (var21 < 0 || var21 > var26) {
                            var21 = 0;
                        }
                        int var27 = var26 << var24;
                        class159.field2701[var23] = class159.field2701[var23] & ~var27 | var21 << var24 & var27;
                        continue;
                    }
                    if (var359 == 31) {
                        var4 -= 2;
                        if (field403[var4] <= field403[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var359 == 32) {
                        var4 -= 2;
                        if (field403[var4] >= field403[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var359 == 33) {
                        field403[var4++] = Statics.field399[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var359 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field399[var10001] = field403[var4];
                        continue;
                    }
                    if (var359 == 35) {
                        field398[var5++] = Statics.field406[var8[var6]];
                        continue;
                    }
                    if (var359 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field406[var10001] = field398[var5];
                        continue;
                    }
                    if (var359 == 37) {
                        int var28 = var8[var6];
                        var5 -= var28;
                        String var29 = Statics.method903(field398, var5, var28);
                        field398[var5++] = var29;
                        continue;
                    }
                    if (var359 == 38) {
                        var4--;
                        continue;
                    }
                    if (var359 == 39) {
                        var5--;
                        continue;
                    }
                    if (var359 == 40) {
                        int var30 = var8[var6];
                        class5 var31 = class5.method2669(var30);
                        int[] var32 = new int[var31.field70];
                        String[] var33 = new String[var31.field73];
                        for (int var34 = 0; var34 < var31.field74; var34++) {
                            var32[var34] = field403[var4 - var31.field74 + var34];
                        }
                        for (int var35 = 0; var35 < var31.field75; var35++) {
                            var33[var35] = field398[var5 - var31.field75 + var35];
                        }
                        var4 -= var31.field74;
                        var5 -= var31.field75;
                        class18 var36 = new class18();
                        var36.field269 = var3;
                        var36.field273 = var6;
                        var36.field263 = Statics.field399;
                        var36.field266 = Statics.field406;
                        field404[++field415 - 1] = var36;
                        var3 = var31;
                        var7 = var31.field69;
                        var8 = var31.field71;
                        var6 = -1;
                        Statics.field399 = var32;
                        Statics.field406 = var33;
                        continue;
                    }
                    if (var359 == 42) {
                        field403[var4++] = client.field678[var8[var6]];
                        continue;
                    }
                    if (var359 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field678[var10001] = field403[var4];
                        continue;
                    }
                    if (var359 == 44) {
                        int var37 = var8[var6] >> 16;
                        int var38 = var8[var6] & 0xFFFF;
                        var4--;
                        int var39 = field403[var4];
                        if (var39 >= 0 && var39 <= 5000) {
                            field405[var37] = var39;
                            byte var40 = -1;
                            if (var38 == 105) {
                                var40 = 0;
                            }
                            int var41 = 0;
                            while (true) {
                                if (var41 >= var39) {
                                    continue label2296;
                                }
                                field402[var37][var41] = var40;
                                var41++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var359 == 45) {
                        int var42 = var8[var6];
                        var4--;
                        int var43 = field403[var4];
                        if (var43 >= 0 && var43 < field405[var42]) {
                            field403[var4++] = field402[var42][var43];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var359 == 46) {
                        int var44 = var8[var6];
                        var4 -= 2;
                        int var45 = field403[var4];
                        if (var45 >= 0 && var45 < field405[var44]) {
                            field402[var44][var45] = field403[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var359 == 47) {
                        String var46 = client.field679[var8[var6]];
                        if (var46 == null) {
                            var46 = "null";
                        }
                        field398[var5++] = var46;
                        continue;
                    }
                    if (var359 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field679[var10001] = field398[var5];
                        continue;
                    }
                }
                boolean var47;
                if (var8[var6] == 1) {
                    var47 = true;
                } else {
                    var47 = false;
                }
                if (var359 < 1000) {
                    if (var359 == 100) {
                        var4 -= 3;
                        int var48 = field403[var4];
                        int var49 = field403[var4 + 1];
                        int var50 = field403[var4 + 2];
                        if (var49 == 0) {
                            throw new RuntimeException();
                        }
                        class158 var51 = class158.method2064(var48);
                        if (var51.field2691 == null) {
                            var51.field2691 = new class158[var50 + 1];
                        }
                        if (var51.field2691.length <= var50) {
                            class158[] var52 = new class158[var50 + 1];
                            for (int var53 = 0; var53 < var51.field2691.length; var53++) {
                                var52[var53] = var51.field2691[var53];
                            }
                            var51.field2691 = var52;
                        }
                        if (var50 > 0 && var51.field2691[var50 - 1] == null) {
                            throw new RuntimeException("" + (var50 - 1));
                        }
                        class158 var54 = new class158();
                        var54.field2604 = var49;
                        var54.field2697 = var54.field2583 = var51.field2583;
                        var54.field2584 = var50;
                        var54.field2598 = true;
                        var51.field2691[var50] = var54;
                        if (var47) {
                            Statics.field2571 = var54;
                        } else {
                            Statics.field412 = var54;
                        }
                        Statics.method26(var51);
                        continue;
                    }
                    if (var359 == 101) {
                        class158 var55 = var47 ? Statics.field2571 : Statics.field412;
                        class158 var56 = class158.method2064(var55.field2583);
                        var56.field2691[var55.field2584] = null;
                        Statics.method26(var56);
                        continue;
                    }
                    if (var359 == 102) {
                        var4--;
                        class158 var57 = class158.method2064(field403[var4]);
                        var57.field2691 = null;
                        Statics.method26(var57);
                        continue;
                    }
                    if (var359 == 200) {
                        var4 -= 2;
                        int var58 = field403[var4];
                        int var59 = field403[var4 + 1];
                        class158 var60 = class158.method2806(var58, var59);
                        if (var60 != null && var59 != -1) {
                            field403[var4++] = 1;
                            if (var47) {
                                Statics.field2571 = var60;
                            } else {
                                Statics.field412 = var60;
                            }
                            continue;
                        }
                        field403[var4++] = 0;
                        continue;
                    }
                } else if (var359 >= 1000 && var359 < 1100 || var359 >= 2000 && var359 < 2100) {
                    class158 var61;
                    if (var359 >= 2000) {
                        var359 -= 1000;
                        var4--;
                        var61 = class158.method2064(field403[var4]);
                    } else {
                        var61 = var47 ? Statics.field2571 : Statics.field412;
                    }
                    if (var359 == 1000) {
                        var4 -= 2;
                        var61.field2588 = field403[var4];
                        var61.field2679 = field403[var4 + 1];
                        Statics.method26(var61);
                        continue;
                    }
                    if (var359 == 1001) {
                        var4 -= 2;
                        var61.field2592 = field403[var4];
                        var61.field2593 = field403[var4 + 1];
                        Statics.method26(var61);
                        continue;
                    }
                    if (var359 == 1003) {
                        var4--;
                        boolean var62 = field403[var4] == 1;
                        if (var61.field2595 != var62) {
                            var61.field2595 = var62;
                            Statics.method26(var61);
                        }
                        continue;
                    }
                } else if (!(var359 < 1100 || var359 >= 1200) || !(var359 < 2100 || var359 >= 2200)) {
                    class158 var63;
                    if (var359 >= 2000) {
                        var359 -= 1000;
                        var4--;
                        var63 = class158.method2064(field403[var4]);
                    } else {
                        var63 = var47 ? Statics.field2571 : Statics.field412;
                    }
                    if (var359 == 1100) {
                        var4 -= 2;
                        var63.field2654 = field403[var4];
                        if (var63.field2654 > var63.field2589 - var63.field2592) {
                            var63.field2654 = var63.field2589 - var63.field2592;
                        }
                        if (var63.field2654 < 0) {
                            var63.field2654 = 0;
                        }
                        var63.field2597 = field403[var4 + 1];
                        if (var63.field2597 > var63.field2599 - var63.field2593) {
                            var63.field2597 = var63.field2599 - var63.field2593;
                        }
                        if (var63.field2597 < 0) {
                            var63.field2597 = 0;
                        }
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1101) {
                        var4--;
                        var63.field2600 = field403[var4];
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1102) {
                        var4--;
                        var63.field2664 = field403[var4] == 1;
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1103) {
                        var4--;
                        var63.field2605 = field403[var4];
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1104) {
                        var4--;
                        var63.field2606 = field403[var4];
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1105) {
                        var4--;
                        var63.field2631 = field403[var4];
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1106) {
                        var4--;
                        var63.field2672 = field403[var4];
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1107) {
                        var4--;
                        var63.field2686 = field403[var4] == 1;
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1108) {
                        var63.field2615 = 1;
                        var4--;
                        var63.field2616 = field403[var4];
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1109) {
                        var4 -= 6;
                        var63.field2621 = field403[var4];
                        var63.field2622 = field403[var4 + 1];
                        var63.field2623 = field403[var4 + 2];
                        var63.field2624 = field403[var4 + 3];
                        var63.field2625 = field403[var4 + 4];
                        var63.field2626 = field403[var4 + 5];
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1110) {
                        var4--;
                        int var64 = field403[var4];
                        if (var63.field2619 != var64) {
                            var63.field2619 = var64;
                            var63.field2578 = 0;
                            var63.field2690 = 0;
                            Statics.method26(var63);
                        }
                        continue;
                    }
                    if (var359 == 1111) {
                        var4--;
                        var63.field2675 = field403[var4] == 1;
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1112) {
                        var5--;
                        String var65 = field398[var5];
                        if (!var65.equals(var63.field2630)) {
                            var63.field2630 = var65;
                            Statics.method26(var63);
                        }
                        continue;
                    }
                    if (var359 == 1113) {
                        var4--;
                        var63.field2629 = field403[var4];
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1114) {
                        var4 -= 3;
                        var63.field2633 = field403[var4];
                        var63.field2634 = field403[var4 + 1];
                        var63.field2693 = field403[var4 + 2];
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1115) {
                        var4--;
                        var63.field2628 = field403[var4] == 1;
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1116) {
                        var4--;
                        var63.field2611 = field403[var4];
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1117) {
                        var4--;
                        var63.field2612 = field403[var4];
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1118) {
                        var4--;
                        var63.field2700 = field403[var4] == 1;
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1119) {
                        var4--;
                        var63.field2596 = field403[var4] == 1;
                        Statics.method26(var63);
                        continue;
                    }
                    if (var359 == 1120) {
                        var4 -= 2;
                        var63.field2589 = field403[var4];
                        var63.field2599 = field403[var4 + 1];
                        Statics.method26(var63);
                        continue;
                    }
                } else if (var359 >= 1200 && var359 < 1300 || var359 >= 2200 && var359 < 2300) {
                    class158 var66;
                    if (var359 >= 2000) {
                        var359 -= 1000;
                        var4--;
                        var66 = class158.method2064(field403[var4]);
                    } else {
                        var66 = var47 ? Statics.field2571 : Statics.field412;
                    }
                    Statics.method26(var66);
                    if (var359 == 1200) {
                        var4 -= 2;
                        int var67 = field403[var4];
                        int var68 = field403[var4 + 1];
                        var66.field2687 = var67;
                        var66.field2576 = var68;
                        class40 var69 = class40.method248(var67);
                        var66.field2623 = var69.field1020;
                        var66.field2624 = var69.field1014;
                        var66.field2625 = var69.field1027;
                        var66.field2621 = var69.field1016;
                        var66.field2622 = var69.field1017;
                        var66.field2626 = var69.field1012;
                        if (var66.field2592 > 0) {
                            var66.field2626 = var66.field2626 * 32 / var66.field2592;
                        }
                        continue;
                    }
                    if (var359 == 1201) {
                        var66.field2615 = 2;
                        var4--;
                        var66.field2616 = field403[var4];
                        continue;
                    }
                    if (var359 == 1202) {
                        var66.field2615 = 3;
                        var66.field2616 = Statics.field2370.field34.method3132();
                        continue;
                    }
                } else if (var359 >= 1300 && var359 < 1400 || var359 >= 2300 && var359 < 2400) {
                    class158 var70;
                    if (var359 >= 2000) {
                        var359 -= 1000;
                        var4--;
                        var70 = class158.method2064(field403[var4]);
                    } else {
                        var70 = var47 ? Statics.field2571 : Statics.field412;
                    }
                    if (var359 == 1300) {
                        var4--;
                        int var71 = field403[var4] - 1;
                        if (var71 >= 0 && var71 <= 9) {
                            var5--;
                            var70.method3065(var71, field398[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var359 == 1301) {
                        var4 -= 2;
                        int var72 = field403[var4];
                        int var73 = field403[var4 + 1];
                        var70.field2645 = class158.method2806(var72, var73);
                        continue;
                    }
                    if (var359 == 1302) {
                        var4--;
                        var70.field2648 = field403[var4] == 1;
                        continue;
                    }
                    if (var359 == 1303) {
                        var4--;
                        var70.field2646 = field403[var4];
                        continue;
                    }
                    if (var359 == 1304) {
                        var4--;
                        var70.field2647 = field403[var4];
                        continue;
                    }
                    if (var359 == 1305) {
                        var5--;
                        var70.field2643 = field398[var5];
                        continue;
                    }
                    if (var359 == 1306) {
                        var5--;
                        var70.field2649 = field398[var5];
                        continue;
                    }
                    if (var359 == 1307) {
                        var70.field2644 = null;
                        continue;
                    }
                } else {
                    if (var359 >= 1400 && var359 < 1500 || var359 >= 2400 && var359 < 2500) {
                        class158 var74;
                        if (var359 >= 2000) {
                            var359 -= 1000;
                            var4--;
                            var74 = class158.method2064(field403[var4]);
                        } else {
                            var74 = var47 ? Statics.field2571 : Statics.field412;
                        }
                        var5--;
                        String var75 = field398[var5];
                        int[] var76 = null;
                        if (var75.length() > 0 && var75.charAt(var75.length() - 1) == 'Y') {
                            var4--;
                            int var77 = field403[var4];
                            if (var77 > 0) {
                                var76 = new int[var77];
                                while (var77-- > 0) {
                                    var4--;
                                    var76[var77] = field403[var4];
                                }
                            }
                            var75 = var75.substring(0, var75.length() - 1);
                        }
                        Object[] var78 = new Object[var75.length() + 1];
                        for (int var79 = var78.length - 1; var79 >= 1; var79--) {
                            if (var75.charAt(var79 - 1) == 's') {
                                var5--;
                                var78[var79] = field398[var5];
                            } else {
                                var4--;
                                var78[var79] = Integer.valueOf(field403[var4]);
                            }
                        }
                        var4--;
                        int var80 = field403[var4];
                        if (var80 == -1) {
                            var78 = null;
                        } else {
                            var78[0] = Integer.valueOf(var80);
                        }
                        if (var359 == 1400) {
                            var74.field2652 = var78;
                        }
                        if (var359 == 1401) {
                            var74.field2655 = var78;
                        }
                        if (var359 == 1402) {
                            var74.field2669 = var78;
                        }
                        if (var359 == 1403) {
                            var74.field2656 = var78;
                        }
                        if (var359 == 1404) {
                            var74.field2613 = var78;
                        }
                        if (var359 == 1405) {
                            var74.field2659 = var78;
                        }
                        if (var359 == 1406) {
                            var74.field2662 = var78;
                        }
                        if (var359 == 1407) {
                            var74.field2663 = var78;
                            var74.field2635 = var76;
                        }
                        if (var359 == 1408) {
                            var74.field2607 = var78;
                        }
                        if (var359 == 1409) {
                            var74.field2670 = var78;
                        }
                        if (var359 == 1410) {
                            var74.field2660 = var78;
                        }
                        if (var359 == 1411) {
                            var74.field2668 = var78;
                        }
                        if (var359 == 1412) {
                            var74.field2657 = var78;
                        }
                        if (var359 == 1414) {
                            var74.field2665 = var78;
                            var74.field2666 = var76;
                        }
                        if (var359 == 1415) {
                            var74.field2667 = var78;
                            var74.field2641 = var76;
                        }
                        if (var359 == 1416) {
                            var74.field2661 = var78;
                        }
                        if (var359 == 1417) {
                            var74.field2689 = var78;
                        }
                        if (var359 == 1418) {
                            var74.field2614 = var78;
                        }
                        if (var359 == 1419) {
                            var74.field2642 = var78;
                        }
                        if (var359 == 1420) {
                            var74.field2632 = var78;
                        }
                        if (var359 == 1421) {
                            var74.field2587 = var78;
                        }
                        if (var359 == 1422) {
                            var74.field2676 = var78;
                        }
                        if (var359 == 1423) {
                            var74.field2698 = var78;
                        }
                        if (var359 == 1424) {
                            var74.field2678 = var78;
                        }
                        var74.field2674 = true;
                        continue;
                    }
                    if (var359 < 1600) {
                        class158 var81 = var47 ? Statics.field2571 : Statics.field412;
                        if (var359 == 1500) {
                            field403[var4++] = var81.field2588;
                            continue;
                        }
                        if (var359 == 1501) {
                            field403[var4++] = var81.field2679;
                            continue;
                        }
                        if (var359 == 1502) {
                            field403[var4++] = var81.field2592;
                            continue;
                        }
                        if (var359 == 1503) {
                            field403[var4++] = var81.field2593;
                            continue;
                        }
                        if (var359 == 1504) {
                            field403[var4++] = var81.field2595 ? 1 : 0;
                            continue;
                        }
                        if (var359 == 1505) {
                            field403[var4++] = var81.field2697;
                            continue;
                        }
                    } else if (var359 < 1700) {
                        class158 var82 = var47 ? Statics.field2571 : Statics.field412;
                        if (var359 == 1600) {
                            field403[var4++] = var82.field2654;
                            continue;
                        }
                        if (var359 == 1601) {
                            field403[var4++] = var82.field2597;
                            continue;
                        }
                        if (var359 == 1602) {
                            field398[var5++] = var82.field2630;
                            continue;
                        }
                        if (var359 == 1603) {
                            field403[var4++] = var82.field2589;
                            continue;
                        }
                        if (var359 == 1604) {
                            field403[var4++] = var82.field2599;
                            continue;
                        }
                        if (var359 == 1605) {
                            field403[var4++] = var82.field2626;
                            continue;
                        }
                        if (var359 == 1606) {
                            field403[var4++] = var82.field2623;
                            continue;
                        }
                        if (var359 == 1607) {
                            field403[var4++] = var82.field2625;
                            continue;
                        }
                        if (var359 == 1608) {
                            field403[var4++] = var82.field2624;
                            continue;
                        }
                    } else if (var359 < 1800) {
                        class158 var83 = var47 ? Statics.field2571 : Statics.field412;
                        if (var359 == 1700) {
                            field403[var4++] = var83.field2687;
                            continue;
                        }
                        if (var359 == 1701) {
                            if (var83.field2687 == -1) {
                                field403[var4++] = 0;
                            } else {
                                field403[var4++] = var83.field2576;
                            }
                            continue;
                        }
                        if (var359 == 1702) {
                            field403[var4++] = var83.field2584;
                            continue;
                        }
                    } else if (var359 < 1900) {
                        class158 var84 = var47 ? Statics.field2571 : Statics.field412;
                        if (var359 == 1800) {
                            int[] var85 = field403;
                            int var86 = var4++;
                            int var87 = client.method2857(var84);
                            int var88 = var87 >> 11 & 0x3F;
                            var85[var86] = var88;
                            continue;
                        }
                        if (var359 == 1801) {
                            var4--;
                            int var89 = field403[var4];
                            int var360 = var89 - 1;
                            if (var84.field2644 != null && var360 < var84.field2644.length && var84.field2644[var360] != null) {
                                field398[var5++] = var84.field2644[var360];
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var359 == 1802) {
                            if (var84.field2643 == null) {
                                field398[var5++] = "";
                            } else {
                                field398[var5++] = var84.field2643;
                            }
                            continue;
                        }
                    } else if (var359 < 2600) {
                        var4--;
                        class158 var90 = class158.method2064(field403[var4]);
                        if (var359 == 2500) {
                            field403[var4++] = var90.field2588;
                            continue;
                        }
                        if (var359 == 2501) {
                            field403[var4++] = var90.field2679;
                            continue;
                        }
                        if (var359 == 2502) {
                            field403[var4++] = var90.field2592;
                            continue;
                        }
                        if (var359 == 2503) {
                            field403[var4++] = var90.field2593;
                            continue;
                        }
                        if (var359 == 2504) {
                            field403[var4++] = var90.field2595 ? 1 : 0;
                            continue;
                        }
                        if (var359 == 2505) {
                            field403[var4++] = var90.field2697;
                            continue;
                        }
                    } else if (var359 < 2700) {
                        var4--;
                        class158 var91 = class158.method2064(field403[var4]);
                        if (var359 == 2600) {
                            field403[var4++] = var91.field2654;
                            continue;
                        }
                        if (var359 == 2601) {
                            field403[var4++] = var91.field2597;
                            continue;
                        }
                        if (var359 == 2602) {
                            field398[var5++] = var91.field2630;
                            continue;
                        }
                        if (var359 == 2603) {
                            field403[var4++] = var91.field2589;
                            continue;
                        }
                        if (var359 == 2604) {
                            field403[var4++] = var91.field2599;
                            continue;
                        }
                        if (var359 == 2605) {
                            field403[var4++] = var91.field2626;
                            continue;
                        }
                        if (var359 == 2606) {
                            field403[var4++] = var91.field2623;
                            continue;
                        }
                        if (var359 == 2607) {
                            field403[var4++] = var91.field2625;
                            continue;
                        }
                        if (var359 == 2608) {
                            field403[var4++] = var91.field2624;
                            continue;
                        }
                    } else if (var359 < 2800) {
                        if (var359 == 2700) {
                            var4--;
                            class158 var92 = class158.method2064(field403[var4]);
                            field403[var4++] = var92.field2687;
                            continue;
                        }
                        if (var359 == 2701) {
                            var4--;
                            class158 var93 = class158.method2064(field403[var4]);
                            if (var93.field2687 == -1) {
                                field403[var4++] = 0;
                            } else {
                                field403[var4++] = var93.field2576;
                            }
                            continue;
                        }
                        if (var359 == 2702) {
                            var4--;
                            int var94 = field403[var4];
                            class4 var95 = (class4) client.field694.method3242((long) var94);
                            if (var95 == null) {
                                field403[var4++] = 0;
                            } else {
                                field403[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var359 < 2900) {
                        var4--;
                        class158 var96 = class158.method2064(field403[var4]);
                        if (var359 == 2800) {
                            int[] var97 = field403;
                            int var98 = var4++;
                            int var99 = client.method2857(var96);
                            int var100 = var99 >> 11 & 0x3F;
                            var97[var98] = var100;
                            continue;
                        }
                        if (var359 == 2801) {
                            var4--;
                            int var101 = field403[var4];
                            int var361 = var101 - 1;
                            if (var96.field2644 != null && var361 < var96.field2644.length && var96.field2644[var361] != null) {
                                field398[var5++] = var96.field2644[var361];
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var359 == 2802) {
                            if (var96.field2643 == null) {
                                field398[var5++] = "";
                            } else {
                                field398[var5++] = var96.field2643;
                            }
                            continue;
                        }
                    } else if (var359 < 3200) {
                        if (var359 == 3100) {
                            var5--;
                            String var102 = field398[var5];
                            client.method128(0, "", var102);
                            continue;
                        }
                        if (var359 == 3101) {
                            var4 -= 2;
                            Statics.method2649(Statics.field2370, field403[var4], field403[var4 + 1]);
                            continue;
                        }
                        if (var359 == 3103) {
                            client.method2172();
                            continue;
                        }
                        if (var359 == 3104) {
                            var5--;
                            String var103 = field398[var5];
                            int var104 = 0;
                            if (class147.method1301(var103)) {
                                int var105 = class147.method1346(var103, 10, true);
                                var104 = var105;
                            }
                            client.field540.method2272(218);
                            client.field540.method2400(var104);
                            continue;
                        }
                        if (var359 == 3105) {
                            var5--;
                            String var106 = field398[var5];
                            client.field540.method2272(169);
                            client.field540.method2455(var106.length() + 1);
                            client.field540.method2402(var106);
                            continue;
                        }
                        if (var359 == 3106) {
                            var5--;
                            String var107 = field398[var5];
                            client.field540.method2272(158);
                            client.field540.method2455(var107.length() + 1);
                            client.field540.method2402(var107);
                            continue;
                        }
                        if (var359 == 3107) {
                            var4--;
                            int var108 = field403[var4];
                            var5--;
                            String var109 = field398[var5];
                            client.method232(var108, var109);
                            continue;
                        }
                        if (var359 == 3108) {
                            var4 -= 3;
                            int var110 = field403[var4];
                            int var111 = field403[var4 + 1];
                            int var112 = field403[var4 + 2];
                            class158 var113 = class158.method2064(var112);
                            client.method178(var113, var110, var111);
                            continue;
                        }
                        if (var359 == 3109) {
                            var4 -= 2;
                            int var114 = field403[var4];
                            int var115 = field403[var4 + 1];
                            class158 var116 = var47 ? Statics.field2571 : Statics.field412;
                            client.method178(var116, var114, var115);
                            continue;
                        }
                    } else if (var359 < 3300) {
                        if (var359 == 3200) {
                            var4 -= 3;
                            int var117 = field403[var4];
                            int var118 = field403[var4 + 1];
                            int var119 = field403[var4 + 2];
                            if (client.field574 != 0 && var118 != 0 && client.field724 < 50) {
                                client.field578[client.field724] = var117;
                                client.field726[client.field724] = var118;
                                client.field727[client.field724] = var119;
                                client.field532[client.field724] = null;
                                client.field728[client.field724] = 0;
                                client.field724++;
                            }
                            continue;
                        }
                        if (var359 == 3201) {
                            var4--;
                            client.method548(field403[var4]);
                            continue;
                        }
                        if (var359 == 3202) {
                            var4 -= 2;
                            client.method124(field403[var4], field403[var4 + 1]);
                            continue;
                        }
                    } else if (var359 < 3400) {
                        if (var359 == 3300) {
                            field403[var4++] = client.field658;
                            continue;
                        }
                        if (var359 == 3301) {
                            var4 -= 2;
                            int var120 = field403[var4];
                            int var121 = field403[var4 + 1];
                            field403[var4++] = Statics.method183(var120, var121);
                            continue;
                        }
                        if (var359 == 3302) {
                            var4 -= 2;
                            int var122 = field403[var4];
                            int var123 = field403[var4 + 1];
                            field403[var4++] = class19.method125(var122, var123);
                            continue;
                        }
                        if (var359 == 3303) {
                            var4 -= 2;
                            int var124 = field403[var4];
                            int var125 = field403[var4 + 1];
                            field403[var4++] = class19.method2160(var124, var125);
                            continue;
                        }
                        if (var359 == 3304) {
                            var4--;
                            int var126 = field403[var4];
                            field403[var4++] = class41.method2176(var126).field1049;
                            continue;
                        }
                        if (var359 == 3305) {
                            var4--;
                            int var127 = field403[var4];
                            field403[var4++] = client.field622[var127];
                            continue;
                        }
                        if (var359 == 3306) {
                            var4--;
                            int var128 = field403[var4];
                            field403[var4++] = client.field623[var128];
                            continue;
                        }
                        if (var359 == 3307) {
                            var4--;
                            int var129 = field403[var4];
                            field403[var4++] = client.field519[var129];
                            continue;
                        }
                        if (var359 == 3308) {
                            int var130 = Statics.field54;
                            int var131 = (Statics.field2370.field473 >> 7) + Statics.field374;
                            int var132 = (Statics.field2370.field442 >> 7) + Statics.field872;
                            field403[var4++] = (var130 << 28) + (var131 << 14) + var132;
                            continue;
                        }
                        if (var359 == 3309) {
                            var4--;
                            int var133 = field403[var4];
                            field403[var4++] = var133 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var359 == 3310) {
                            var4--;
                            int var134 = field403[var4];
                            field403[var4++] = var134 >> 28;
                            continue;
                        }
                        if (var359 == 3311) {
                            var4--;
                            int var135 = field403[var4];
                            field403[var4++] = var135 & 0x3FFF;
                            continue;
                        }
                        if (var359 == 3312) {
                            field403[var4++] = client.field484 ? 1 : 0;
                            continue;
                        }
                        if (var359 == 3313) {
                            var4 -= 2;
                            int var136 = field403[var4] + 32768;
                            int var137 = field403[var4 + 1];
                            field403[var4++] = Statics.method183(var136, var137);
                            continue;
                        }
                        if (var359 == 3314) {
                            var4 -= 2;
                            int var138 = field403[var4] + 32768;
                            int var139 = field403[var4 + 1];
                            field403[var4++] = class19.method125(var138, var139);
                            continue;
                        }
                        if (var359 == 3315) {
                            var4 -= 2;
                            int var140 = field403[var4] + 32768;
                            int var141 = field403[var4 + 1];
                            field403[var4++] = class19.method2160(var140, var141);
                            continue;
                        }
                        if (var359 == 3316) {
                            if (client.field651 >= 2) {
                                field403[var4++] = client.field651;
                            } else {
                                field403[var4++] = 0;
                            }
                            continue;
                        }
                        if (var359 == 3317) {
                            field403[var4++] = client.field548;
                            continue;
                        }
                        if (var359 == 3318) {
                            field403[var4++] = client.field545;
                            continue;
                        }
                        if (var359 == 3321) {
                            field403[var4++] = client.field663;
                            continue;
                        }
                        if (var359 == 3322) {
                            field403[var4++] = client.field647;
                            continue;
                        }
                        if (var359 == 3323) {
                            if (client.field652) {
                                field403[var4++] = 1;
                            } else {
                                field403[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var359 < 3500) {
                        if (var359 == 3400) {
                            var4 -= 2;
                            int var142 = field403[var4];
                            int var143 = field403[var4 + 1];
                            class39 var144 = (class39) class39.field981.method3196((long) var142);
                            class39 var145;
                            if (var144 == null) {
                                byte[] var146 = Statics.field980.method2961(8, var142);
                                class39 var147 = new class39();
                                if (var146 != null) {
                                    var147.method829(new class127(var146));
                                }
                                class39.field981.method3193(var147, (long) var142);
                                var145 = var147;
                            } else {
                                var145 = var144;
                            }
                            class39 var148 = var145;
                            if (var145.field990 != 's') {
                            }
                            for (int var149 = 0; var149 < var148.field992; var149++) {
                                if (var148.field986[var149] == var143) {
                                    field398[var5++] = var148.field985[var149];
                                    var148 = null;
                                    break;
                                }
                            }
                            if (var148 != null) {
                                field398[var5++] = var148.field984;
                            }
                            continue;
                        }
                        if (var359 == 3408) {
                            var4 -= 4;
                            int var150 = field403[var4];
                            int var151 = field403[var4 + 1];
                            int var152 = field403[var4 + 2];
                            int var153 = field403[var4 + 3];
                            class39 var154 = (class39) class39.field981.method3196((long) var152);
                            class39 var155;
                            if (var154 == null) {
                                byte[] var156 = Statics.field980.method2961(8, var152);
                                class39 var157 = new class39();
                                if (var156 != null) {
                                    var157.method829(new class127(var156));
                                }
                                class39.field981.method3193(var157, (long) var152);
                                var155 = var157;
                            } else {
                                var155 = var154;
                            }
                            class39 var158 = var155;
                            if (var155.field982 == var150 && var155.field990 == var151) {
                                for (int var159 = 0; var159 < var158.field992; var159++) {
                                    if (var158.field986[var159] == var153) {
                                        if (var151 == 115) {
                                            field398[var5++] = var158.field985[var159];
                                        } else {
                                            field403[var4++] = var158.field988[var159];
                                        }
                                        var158 = null;
                                        break;
                                    }
                                }
                                if (var158 != null) {
                                    if (var151 == 115) {
                                        field398[var5++] = var158.field984;
                                    } else {
                                        field403[var4++] = var158.field987;
                                    }
                                }
                                continue;
                            }
                            if (var151 == 115) {
                                field398[var5++] = "null";
                            } else {
                                field403[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var359 < 3700) {
                        if (var359 == 3600) {
                            if (client.field630 == 0) {
                                field403[var4++] = -2;
                            } else if (client.field630 == 1) {
                                field403[var4++] = -1;
                            } else {
                                field403[var4++] = client.field666;
                            }
                            continue;
                        }
                        if (var359 == 3601) {
                            var4--;
                            int var160 = field403[var4];
                            if (client.field630 == 2 && var160 < client.field666) {
                                field398[var5++] = client.field738[var160].field365;
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var359 == 3602) {
                            var4--;
                            int var161 = field403[var4];
                            if (client.field630 == 2 && var161 < client.field666) {
                                field403[var4++] = client.field738[var161].field367;
                                continue;
                            }
                            field403[var4++] = 0;
                            continue;
                        }
                        if (var359 == 3603) {
                            var4--;
                            int var162 = field403[var4];
                            if (client.field630 == 2 && var162 < client.field666) {
                                field403[var4++] = client.field738[var162].field375;
                                continue;
                            }
                            field403[var4++] = 0;
                            continue;
                        }
                        if (var359 == 3604) {
                            var5--;
                            String var163 = field398[var5];
                            var4--;
                            int var164 = field403[var4];
                            client.method58(var163, var164);
                            continue;
                        }
                        if (var359 == 3605) {
                            var5--;
                            String var165 = field398[var5];
                            client.method12(var165);
                            continue;
                        }
                        if (var359 == 3606) {
                            var5--;
                            String var166 = field398[var5];
                            if (var166 == null) {
                                continue;
                            }
                            String var167 = class148.method2803(var166, Statics.field483);
                            if (var167 == null) {
                                continue;
                            }
                            int var168 = 0;
                            while (true) {
                                if (var168 >= client.field666) {
                                    continue label2296;
                                }
                                class23 var169 = client.field738[var168];
                                String var170 = var169.field365;
                                String var171 = class148.method2803(var170, Statics.field483);
                                boolean var172;
                                if (var166 == null || var170 == null) {
                                    var172 = false;
                                } else if (var166.startsWith("#") || var170.startsWith("#")) {
                                    var172 = var166.equals(var170);
                                } else {
                                    var172 = var167.equals(var171);
                                }
                                if (var172) {
                                    client.field666--;
                                    for (int var173 = var168; var173 < client.field666; var173++) {
                                        client.field738[var173] = client.field738[var173 + 1];
                                    }
                                    client.field551 = client.field667;
                                    client.field540.method2272(252);
                                    class116 var174 = client.field540;
                                    int var175 = var166.length() + 1;
                                    var174.method2455(var175);
                                    client.field540.method2402(var166);
                                    continue label2296;
                                }
                                var168++;
                            }
                        }
                        if (var359 == 3607) {
                            var5--;
                            String var176 = field398[var5];
                            if (var176 == null) {
                                continue;
                            }
                            if (client.field537 >= 100) {
                                client.method128(0, "", class134.field2232);
                                continue;
                            }
                            String var177 = class148.method2803(var176, Statics.field483);
                            if (var177 == null) {
                                continue;
                            }
                            for (int var178 = 0; var178 < client.field537; var178++) {
                                class11 var179 = client.field741[var178];
                                String var180 = class148.method2803(var179.field170, Statics.field483);
                                if (var180 != null && var180.equals(var177)) {
                                    client.method128(0, "", var176 + class134.field2137);
                                    continue label2296;
                                }
                                if (var179.field168 != null) {
                                    String var181 = class148.method2803(var179.field168, Statics.field483);
                                    if (var181 != null && var181.equals(var177)) {
                                        client.method128(0, "", var176 + class134.field2137);
                                        continue label2296;
                                    }
                                }
                            }
                            for (int var182 = 0; var182 < client.field666; var182++) {
                                class23 var183 = client.field738[var182];
                                String var184 = class148.method2803(var183.field365, Statics.field483);
                                if (var184 != null && var184.equals(var177)) {
                                    client.method128(0, "", class134.field2238 + var176 + class134.field2239);
                                    continue label2296;
                                }
                                if (var183.field366 != null) {
                                    String var185 = class148.method2803(var183.field366, Statics.field483);
                                    if (var185 != null && var185.equals(var177)) {
                                        client.method128(0, "", class134.field2238 + var176 + class134.field2239);
                                        continue label2296;
                                    }
                                }
                            }
                            if (class148.method2803(Statics.field2370.field51, Statics.field483).equals(var177)) {
                                client.method128(0, "", class134.field2235);
                            } else {
                                client.field540.method2272(35);
                                class116 var186 = client.field540;
                                int var187 = var176.length() + 1;
                                var186.method2455(var187);
                                client.field540.method2402(var176);
                            }
                            continue;
                        }
                        if (var359 == 3608) {
                            var5--;
                            String var188 = field398[var5];
                            client.method139(var188);
                            continue;
                        }
                        if (var359 == 3609) {
                            var5--;
                            String var189 = field398[var5];
                            if (var189.startsWith(class2.method1(0)) || var189.startsWith(class2.method1(1))) {
                                var189 = var189.substring(7);
                            }
                            field403[var4++] = client.method3025(var189) ? 1 : 0;
                            continue;
                        }
                        if (var359 == 3611) {
                            if (client.field515 == null) {
                                field398[var5++] = "";
                            } else {
                                field398[var5++] = class146.method789(client.field515);
                            }
                            continue;
                        }
                        if (var359 == 3612) {
                            if (client.field515 == null) {
                                field403[var4++] = 0;
                            } else {
                                field403[var4++] = Statics.field251;
                            }
                            continue;
                        }
                        if (var359 == 3613) {
                            var4--;
                            int var190 = field403[var4];
                            if (client.field515 != null && var190 < Statics.field251) {
                                field398[var5++] = Statics.field339[var190].field115;
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var359 == 3614) {
                            var4--;
                            int var191 = field403[var4];
                            if (client.field515 != null && var191 < Statics.field251) {
                                field403[var4++] = Statics.field339[var191].field110;
                                continue;
                            }
                            field403[var4++] = 0;
                            continue;
                        }
                        if (var359 == 3615) {
                            var4--;
                            int var192 = field403[var4];
                            if (client.field515 != null && var192 < Statics.field251) {
                                field403[var4++] = Statics.field339[var192].field116;
                                continue;
                            }
                            field403[var4++] = 0;
                            continue;
                        }
                        if (var359 == 3616) {
                            field403[var4++] = Statics.field989;
                            continue;
                        }
                        if (var359 == 3617) {
                            var5--;
                            String var193 = field398[var5];
                            if (Statics.field339 != null) {
                                client.field540.method2272(147);
                                class116 var194 = client.field540;
                                int var195 = var193.length() + 1;
                                var194.method2455(var195);
                                client.field540.method2402(var193);
                            }
                            continue;
                        }
                        if (var359 == 3618) {
                            field403[var4++] = Statics.field1387;
                            continue;
                        }
                        if (var359 == 3619) {
                            var5--;
                            String var196 = field398[var5];
                            client.method1509(var196);
                            continue;
                        }
                        if (var359 == 3620) {
                            client.method158();
                            continue;
                        }
                        if (var359 == 3621) {
                            if (client.field630 == 0) {
                                field403[var4++] = -1;
                            } else {
                                field403[var4++] = client.field537;
                            }
                            continue;
                        }
                        if (var359 == 3622) {
                            var4--;
                            int var197 = field403[var4];
                            if (client.field630 != 0 && var197 < client.field537) {
                                field398[var5++] = client.field741[var197].field170;
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var359 == 3623) {
                            var5--;
                            String var198 = field398[var5];
                            if (var198.startsWith(class2.method1(0)) || var198.startsWith(class2.method1(1))) {
                                var198 = var198.substring(7);
                            }
                            field403[var4++] = client.method2174(var198) ? 1 : 0;
                            continue;
                        }
                        if (var359 == 3624) {
                            var4--;
                            int var199 = field403[var4];
                            if (Statics.field339 != null && var199 < Statics.field251 && Statics.field339[var199].field115.equalsIgnoreCase(Statics.field2370.field51)) {
                                field403[var4++] = 1;
                                continue;
                            }
                            field403[var4++] = 0;
                            continue;
                        }
                        if (var359 == 3625) {
                            if (client.field597 == null) {
                                field398[var5++] = "";
                            } else {
                                field398[var5++] = class146.method789(client.field597);
                            }
                            continue;
                        }
                    } else if (var359 < 4100) {
                        if (var359 == 4000) {
                            var4 -= 2;
                            int var200 = field403[var4];
                            int var201 = field403[var4 + 1];
                            field403[var4++] = var200 + var201;
                            continue;
                        }
                        if (var359 == 4001) {
                            var4 -= 2;
                            int var202 = field403[var4];
                            int var203 = field403[var4 + 1];
                            field403[var4++] = var202 - var203;
                            continue;
                        }
                        if (var359 == 4002) {
                            var4 -= 2;
                            int var204 = field403[var4];
                            int var205 = field403[var4 + 1];
                            field403[var4++] = var204 * var205;
                            continue;
                        }
                        if (var359 == 4003) {
                            var4 -= 2;
                            int var206 = field403[var4];
                            int var207 = field403[var4 + 1];
                            field403[var4++] = var206 / var207;
                            continue;
                        }
                        if (var359 == 4004) {
                            var4--;
                            int var208 = field403[var4];
                            field403[var4++] = (int) (Math.random() * (double) var208);
                            continue;
                        }
                        if (var359 == 4005) {
                            var4--;
                            int var209 = field403[var4];
                            field403[var4++] = (int) (Math.random() * (double) (var209 + 1));
                            continue;
                        }
                        if (var359 == 4006) {
                            var4 -= 5;
                            int var210 = field403[var4];
                            int var211 = field403[var4 + 1];
                            int var212 = field403[var4 + 2];
                            int var213 = field403[var4 + 3];
                            int var214 = field403[var4 + 4];
                            field403[var4++] = (var211 - var210) * (var214 - var212) / (var213 - var212) + var210;
                            continue;
                        }
                        if (var359 == 4007) {
                            var4 -= 2;
                            int var215 = field403[var4];
                            int var216 = field403[var4 + 1];
                            field403[var4++] = var215 * var216 / 100 + var215;
                            continue;
                        }
                        if (var359 == 4008) {
                            var4 -= 2;
                            int var217 = field403[var4];
                            int var218 = field403[var4 + 1];
                            field403[var4++] = var217 | 0x1 << var218;
                            continue;
                        }
                        if (var359 == 4009) {
                            var4 -= 2;
                            int var219 = field403[var4];
                            int var220 = field403[var4 + 1];
                            field403[var4++] = var219 & -1 - (0x1 << var220);
                            continue;
                        }
                        if (var359 == 4010) {
                            var4 -= 2;
                            int var221 = field403[var4];
                            int var222 = field403[var4 + 1];
                            field403[var4++] = (var221 & 0x1 << var222) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var359 == 4011) {
                            var4 -= 2;
                            int var223 = field403[var4];
                            int var224 = field403[var4 + 1];
                            field403[var4++] = var223 % var224;
                            continue;
                        }
                        if (var359 == 4012) {
                            var4 -= 2;
                            int var225 = field403[var4];
                            int var226 = field403[var4 + 1];
                            if (var225 == 0) {
                                field403[var4++] = 0;
                            } else {
                                field403[var4++] = (int) Math.pow((double) var225, (double) var226);
                            }
                            continue;
                        }
                        if (var359 == 4013) {
                            var4 -= 2;
                            int var227 = field403[var4];
                            int var228 = field403[var4 + 1];
                            if (var227 == 0) {
                                field403[var4++] = 0;
                            } else if (var228 == 0) {
                                field403[var4++] = Integer.MAX_VALUE;
                            } else {
                                field403[var4++] = (int) Math.pow((double) var227, 1.0D / (double) var228);
                            }
                            continue;
                        }
                        if (var359 == 4014) {
                            var4 -= 2;
                            int var229 = field403[var4];
                            int var230 = field403[var4 + 1];
                            field403[var4++] = var229 & var230;
                            continue;
                        }
                        if (var359 == 4015) {
                            var4 -= 2;
                            int var231 = field403[var4];
                            int var232 = field403[var4 + 1];
                            field403[var4++] = var231 | var232;
                            continue;
                        }
                    } else if (var359 < 4200) {
                        if (var359 == 4100) {
                            var5--;
                            String var233 = field398[var5];
                            var4--;
                            int var234 = field403[var4];
                            field398[var5++] = var233 + var234;
                            continue;
                        }
                        if (var359 == 4101) {
                            var5 -= 2;
                            String var235 = field398[var5];
                            String var236 = field398[var5 + 1];
                            field398[var5++] = var235 + var236;
                            continue;
                        }
                        if (var359 == 4102) {
                            var5--;
                            String var237 = field398[var5];
                            var4--;
                            int var238 = field403[var4];
                            String[] var239 = field398;
                            int var240 = var5++;
                            String var242;
                            if (var238 < 0) {
                                var242 = Integer.toString(var238);
                            } else {
                                int var243 = var238;
                                String var244;
                                if (var238 < 0) {
                                    var244 = Integer.toString(var238, 10);
                                } else {
                                    int var245 = 2;
                                    int var246 = var238 / 10;
                                    while (var246 != 0) {
                                        var246 /= 10;
                                        var245++;
                                    }
                                    char[] var247 = new char[var245];
                                    var247[0] = '+';
                                    for (int var248 = var245 - 1; var248 > 0; var248--) {
                                        int var249 = var243;
                                        var243 /= 10;
                                        int var250 = var249 - var243 * 10;
                                        if (var250 >= 10) {
                                            var247[var248] = (char) (var250 + 87);
                                        } else {
                                            var247[var248] = (char) (var250 + 48);
                                        }
                                    }
                                    var244 = new String(var247);
                                }
                                var242 = var244;
                            }
                            var239[var240] = var237 + var242;
                            continue;
                        }
                        if (var359 == 4103) {
                            var5--;
                            String var251 = field398[var5];
                            field398[var5++] = var251.toLowerCase();
                            continue;
                        }
                        if (var359 == 4104) {
                            var4--;
                            int var252 = field403[var4];
                            long var253 = ((long) var252 + 11745L) * 86400000L;
                            field408.setTime(new Date(var253));
                            int var255 = field408.get(5);
                            int var256 = field408.get(2);
                            int var257 = field408.get(1);
                            field398[var5++] = var255 + "-" + field409[var256] + "-" + var257;
                            continue;
                        }
                        if (var359 == 4105) {
                            var5 -= 2;
                            String var258 = field398[var5];
                            String var259 = field398[var5 + 1];
                            if (Statics.field2370.field34 != null && Statics.field2370.field34.field2721) {
                                field398[var5++] = var259;
                                continue;
                            }
                            field398[var5++] = var258;
                            continue;
                        }
                        if (var359 == 4106) {
                            var4--;
                            int var260 = field403[var4];
                            field398[var5++] = Integer.toString(var260);
                            continue;
                        }
                        if (var359 == 4107) {
                            var5 -= 2;
                            field403[var4++] = class147.method2652(class150.method399(field398[var5], field398[var5 + 1], client.field486));
                            continue;
                        }
                        if (var359 == 4108) {
                            var5--;
                            String var261 = field398[var5];
                            var4 -= 2;
                            int var262 = field403[var4];
                            int var263 = field403[var4 + 1];
                            byte[] var264 = Statics.field975.method2961(var263, 0);
                            class183 var265 = new class183(var264);
                            field403[var4++] = var265.method3316(var261, var262);
                            continue;
                        }
                        if (var359 == 4109) {
                            var5--;
                            String var266 = field398[var5];
                            var4 -= 2;
                            int var267 = field403[var4];
                            int var268 = field403[var4 + 1];
                            byte[] var269 = Statics.field975.method2961(var268, 0);
                            class183 var270 = new class183(var269);
                            field403[var4++] = var270.method3315(var266, var267);
                            continue;
                        }
                        if (var359 == 4110) {
                            var5 -= 2;
                            String var271 = field398[var5];
                            String var272 = field398[var5 + 1];
                            var4--;
                            if (field403[var4] == 1) {
                                field398[var5++] = var271;
                            } else {
                                field398[var5++] = var272;
                            }
                            continue;
                        }
                        if (var359 == 4111) {
                            var5--;
                            String var273 = field398[var5];
                            field398[var5++] = class185.method3349(var273);
                            continue;
                        }
                        if (var359 == 4112) {
                            var5--;
                            String var274 = field398[var5];
                            var4--;
                            int var275 = field403[var4];
                            field398[var5++] = var274 + (char) var275;
                            continue;
                        }
                        if (var359 == 4113) {
                            var4--;
                            int var276 = field403[var4];
                            int[] var277 = field403;
                            int var278 = var4++;
                            char var279 = (char) var276;
                            boolean var280;
                            if (var279 >= ' ' && var279 <= '~') {
                                var280 = true;
                            } else if (var279 >= 160 && var279 <= 255) {
                                var280 = true;
                            } else if (var279 == 8364 || var279 == 338 || var279 == 8212 || var279 == 339 || var279 == 376) {
                                var280 = true;
                            } else {
                                var280 = false;
                            }
                            var277[var278] = var280 ? 1 : 0;
                            continue;
                        }
                        if (var359 == 4114) {
                            var4--;
                            int var281 = field403[var4];
                            int[] var282 = field403;
                            int var283 = var4++;
                            char var284 = (char) var281;
                            boolean var285 = var284 >= '0' && var284 <= '9' || var284 >= 'A' && var284 <= 'Z' || var284 >= 'a' && var284 <= 'z';
                            var282[var283] = var285 ? 1 : 0;
                            continue;
                        }
                        if (var359 == 4115) {
                            var4--;
                            int var286 = field403[var4];
                            int[] var287 = field403;
                            int var288 = var4++;
                            char var289 = (char) var286;
                            boolean var290 = var289 >= 'A' && var289 <= 'Z' || var289 >= 'a' && var289 <= 'z';
                            var287[var288] = var290 ? 1 : 0;
                            continue;
                        }
                        if (var359 == 4116) {
                            var4--;
                            int var291 = field403[var4];
                            field403[var4++] = class147.method793((char) var291) ? 1 : 0;
                            continue;
                        }
                        if (var359 == 4117) {
                            var5--;
                            String var292 = field398[var5];
                            if (var292 == null) {
                                field403[var4++] = 0;
                            } else {
                                field403[var4++] = var292.length();
                            }
                            continue;
                        }
                        if (var359 == 4118) {
                            var5--;
                            String var293 = field398[var5];
                            var4 -= 2;
                            int var294 = field403[var4];
                            int var295 = field403[var4 + 1];
                            field398[var5++] = var293.substring(var294, var295);
                            continue;
                        }
                        if (var359 == 4119) {
                            var5--;
                            String var296 = field398[var5];
                            StringBuilder var297 = new StringBuilder(var296.length());
                            boolean var298 = false;
                            for (int var299 = 0; var299 < var296.length(); var299++) {
                                char var300 = var296.charAt(var299);
                                if (var300 == '<') {
                                    var298 = true;
                                } else if (var300 == '>') {
                                    var298 = false;
                                } else if (!var298) {
                                    var297.append(var300);
                                }
                            }
                            field398[var5++] = var297.toString();
                            continue;
                        }
                        if (var359 == 4120) {
                            var5--;
                            String var301 = field398[var5];
                            var4--;
                            int var302 = field403[var4];
                            field403[var4++] = var301.indexOf(var302);
                            continue;
                        }
                    } else if (var359 < 4300) {
                        if (var359 == 4200) {
                            var4--;
                            int var303 = field403[var4];
                            field398[var5++] = class40.method248(var303).field1007;
                            continue;
                        }
                        if (var359 == 4201) {
                            var4 -= 2;
                            int var304 = field403[var4];
                            int var305 = field403[var4 + 1];
                            class40 var306 = class40.method248(var304);
                            if (var305 >= 1 && var305 <= 5 && var306.field1021[var305 - 1] != null) {
                                field398[var5++] = var306.field1021[var305 - 1];
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var359 == 4202) {
                            var4 -= 2;
                            int var307 = field403[var4];
                            int var308 = field403[var4 + 1];
                            class40 var309 = class40.method248(var307);
                            if (var308 >= 1 && var308 <= 5 && var309.field1010[var308 - 1] != null) {
                                field398[var5++] = var309.field1010[var308 - 1];
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var359 == 4203) {
                            var4--;
                            int var310 = field403[var4];
                            field403[var4++] = class40.method248(var310).field1036;
                            continue;
                        }
                        if (var359 == 4204) {
                            var4--;
                            int var311 = field403[var4];
                            field403[var4++] = class40.method248(var311).field1018 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var359 == 4205) {
                            var4--;
                            int var312 = field403[var4];
                            class40 var313 = class40.method248(var312);
                            if (var313.field1022 == -1 && var313.field1038 >= 0) {
                                field403[var4++] = var313.field1038;
                                continue;
                            }
                            field403[var4++] = var312;
                            continue;
                        }
                        if (var359 == 4206) {
                            var4--;
                            int var314 = field403[var4];
                            class40 var315 = class40.method248(var314);
                            if (var315.field1022 >= 0 && var315.field1038 >= 0) {
                                field403[var4++] = var315.field1038;
                                continue;
                            }
                            field403[var4++] = var314;
                            continue;
                        }
                        if (var359 == 4207) {
                            var4--;
                            int var316 = field403[var4];
                            field403[var4++] = class40.method248(var316).field1037 ? 1 : 0;
                            continue;
                        }
                    } else if (var359 < 5100) {
                        if (var359 == 5000) {
                            field403[var4++] = client.field570;
                            continue;
                        }
                        if (var359 == 5001) {
                            var4 -= 3;
                            client.field570 = field403[var4];
                            Statics.field2333 = class137.method2177(field403[var4 + 1]);
                            if (Statics.field2333 == null) {
                                Statics.field2333 = class137.field2317;
                            }
                            client.field702 = field403[var4 + 2];
                            client.field540.method2272(194);
                            client.field540.method2455(client.field570);
                            client.field540.method2455(Statics.field2333.field2323);
                            client.field540.method2455(client.field702);
                            continue;
                        }
                        if (var359 == 5002) {
                            var5--;
                            String var317 = field398[var5];
                            var4 -= 2;
                            int var318 = field403[var4];
                            int var319 = field403[var4 + 1];
                            client.field540.method2272(228);
                            class116 var320 = client.field540;
                            int var321 = var317.length() + 1;
                            var320.method2455(var321 + 2);
                            client.field540.method2402(var317);
                            client.field540.method2455(var318 - 1);
                            client.field540.method2455(var319);
                            continue;
                        }
                        if (var359 == 5003) {
                            var4--;
                            int var322 = field403[var4];
                            String var323 = null;
                            if (var322 < 100) {
                                var323 = client.field698[var322];
                            }
                            if (var323 == null) {
                                var323 = "";
                            }
                            field398[var5++] = var323;
                            continue;
                        }
                        if (var359 == 5004) {
                            var4--;
                            int var324 = field403[var4];
                            int var325 = -1;
                            if (var324 < 100 && client.field698[var324] != null) {
                                var325 = client.field695[var324];
                            }
                            field403[var4++] = var325;
                            continue;
                        }
                        if (var359 == 5005) {
                            if (Statics.field2333 == null) {
                                field403[var4++] = -1;
                            } else {
                                field403[var4++] = Statics.field2333.field2323;
                            }
                            continue;
                        }
                        if (var359 == 5008) {
                            var5--;
                            String var326 = field398[var5];
                            if (var326.startsWith("::")) {
                                if (var326.equalsIgnoreCase("::toggleroof")) {
                                    Statics.field1289.field181 = !Statics.field1289.field181;
                                    class29 var327 = null;
                                    try {
                                        var327 = class82.method149("", Statics.field2453.field2064, true);
                                        class127 var328 = Statics.field1289.method150();
                                        var327.method550(var328.field2036, 0, var328.field2035);
                                    } catch (Exception var357) {
                                    }
                                    try {
                                        if (var327 != null) {
                                            var327.method552();
                                        }
                                    } catch (Exception var356) {
                                    }
                                    if (Statics.field1289.field181) {
                                        client.method128(0, "", "Roofs are now all hidden");
                                    } else {
                                        client.method128(0, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field651 >= 2) {
                                    if (var326.equalsIgnoreCase("::gc")) {
                                        System.gc();
                                    }
                                    if (var326.equalsIgnoreCase("::clientdrop")) {
                                        if (client.field529 > 0) {
                                            client.method1271();
                                        } else {
                                            client.method143(40);
                                            Statics.field274 = Statics.field1423;
                                            Statics.field1423 = null;
                                        }
                                    }
                                    if (var326.equalsIgnoreCase("::fpson")) {
                                        client.field495 = true;
                                    }
                                    if (var326.equalsIgnoreCase("::fpsoff")) {
                                        client.field495 = false;
                                    }
                                    if (var326.equalsIgnoreCase("::noclip")) {
                                        for (int var331 = 0; var331 < 4; var331++) {
                                            for (int var332 = 1; var332 < 103; var332++) {
                                                for (int var333 = 1; var333 < 103; var333++) {
                                                    client.field555[var331].field2745[var332][var333] = 0;
                                                }
                                            }
                                        }
                                    }
                                    if (var326.equalsIgnoreCase("::errortest") && client.field525 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field540.method2272(45);
                                client.field540.method2455(var326.length() - 1);
                                client.field540.method2402(var326.substring(2));
                                continue;
                            }
                            String var334 = var326.toLowerCase();
                            byte var335 = 0;
                            if (var334.startsWith(class134.field2187)) {
                                var335 = 0;
                                var326 = var326.substring(class134.field2187.length());
                            } else if (var334.startsWith(class134.field2191)) {
                                var335 = 1;
                                var326 = var326.substring(class134.field2191.length());
                            } else if (var334.startsWith(class134.field2244)) {
                                var335 = 2;
                                var326 = var326.substring(class134.field2244.length());
                            } else if (var334.startsWith(class134.field2246)) {
                                var335 = 3;
                                var326 = var326.substring(class134.field2246.length());
                            } else if (var334.startsWith(class134.field2248)) {
                                var335 = 4;
                                var326 = var326.substring(class134.field2248.length());
                            } else if (var334.startsWith(class134.field2154)) {
                                var335 = 5;
                                var326 = var326.substring(class134.field2154.length());
                            } else if (var334.startsWith(class134.field2252)) {
                                var335 = 6;
                                var326 = var326.substring(class134.field2252.length());
                            } else if (var334.startsWith(class134.field2254)) {
                                var335 = 7;
                                var326 = var326.substring(class134.field2254.length());
                            } else if (var334.startsWith(class134.field2256)) {
                                var335 = 8;
                                var326 = var326.substring(class134.field2256.length());
                            } else if (var334.startsWith(class134.field2258)) {
                                var335 = 9;
                                var326 = var326.substring(class134.field2258.length());
                            } else if (var334.startsWith(class134.field2271)) {
                                var335 = 10;
                                var326 = var326.substring(class134.field2271.length());
                            } else if (var334.startsWith(class134.field2262)) {
                                var335 = 11;
                                var326 = var326.substring(class134.field2262.length());
                            } else if (client.field486 != 0) {
                                if (var334.startsWith(class134.field2241)) {
                                    var335 = 0;
                                    var326 = var326.substring(class134.field2241.length());
                                } else if (var334.startsWith(class134.field2112)) {
                                    var335 = 1;
                                    var326 = var326.substring(class134.field2112.length());
                                } else if (var334.startsWith(class134.field2201)) {
                                    var335 = 2;
                                    var326 = var326.substring(class134.field2201.length());
                                } else if (var334.startsWith(class134.field2247)) {
                                    var335 = 3;
                                    var326 = var326.substring(class134.field2247.length());
                                } else if (var334.startsWith(class134.field2249)) {
                                    var335 = 4;
                                    var326 = var326.substring(class134.field2249.length());
                                } else if (var334.startsWith(class134.field2251)) {
                                    var335 = 5;
                                    var326 = var326.substring(class134.field2251.length());
                                } else if (var334.startsWith(class134.field2253)) {
                                    var335 = 6;
                                    var326 = var326.substring(class134.field2253.length());
                                } else if (var334.startsWith(class134.field2255)) {
                                    var335 = 7;
                                    var326 = var326.substring(class134.field2255.length());
                                } else if (var334.startsWith(class134.field2257)) {
                                    var335 = 8;
                                    var326 = var326.substring(class134.field2257.length());
                                } else if (var334.startsWith(class134.field2272)) {
                                    var335 = 9;
                                    var326 = var326.substring(class134.field2272.length());
                                } else if (var334.startsWith(class134.field2261)) {
                                    var335 = 10;
                                    var326 = var326.substring(class134.field2261.length());
                                } else if (var334.startsWith(class134.field2287)) {
                                    var335 = 11;
                                    var326 = var326.substring(class134.field2287.length());
                                }
                            }
                            String var336 = var326.toLowerCase();
                            byte var337 = 0;
                            if (var336.startsWith(class134.field2264)) {
                                var337 = 1;
                                var326 = var326.substring(class134.field2264.length());
                            } else if (var336.startsWith(class134.field2245)) {
                                var337 = 2;
                                var326 = var326.substring(class134.field2245.length());
                            } else if (var336.startsWith(class134.field2268)) {
                                var337 = 3;
                                var326 = var326.substring(class134.field2268.length());
                            } else if (var336.startsWith(class134.field2270)) {
                                var337 = 4;
                                var326 = var326.substring(class134.field2270.length());
                            } else if (var336.startsWith(class134.field2299)) {
                                var337 = 5;
                                var326 = var326.substring(class134.field2299.length());
                            } else if (client.field486 != 0) {
                                if (var336.startsWith(class134.field2286)) {
                                    var337 = 1;
                                    var326 = var326.substring(class134.field2286.length());
                                } else if (var336.startsWith(class134.field2267)) {
                                    var337 = 2;
                                    var326 = var326.substring(class134.field2267.length());
                                } else if (var336.startsWith(class134.field2269)) {
                                    var337 = 3;
                                    var326 = var326.substring(class134.field2269.length());
                                } else if (var336.startsWith(class134.field2290)) {
                                    var337 = 4;
                                    var326 = var326.substring(class134.field2290.length());
                                } else if (var336.startsWith(class134.field2088)) {
                                    var337 = 5;
                                    var326 = var326.substring(class134.field2088.length());
                                }
                            }
                            client.field540.method2272(223);
                            client.field540.method2455(0);
                            int var338 = client.field540.field2035;
                            client.field540.method2455(var335);
                            client.field540.method2455(var337);
                            class116 var339 = client.field540;
                            int var340 = var339.field2035;
                            byte[] var341 = class149.method544(var326);
                            var339.method2467(var341.length);
                            var339.field2035 += Statics.field2834.method2339(var341, 0, var341.length, var339.field2036, var339.field2035);
                            client.field540.method2408(client.field540.field2035 - var338);
                            continue;
                        }
                        if (var359 == 5009) {
                            var5 -= 2;
                            String var342 = field398[var5];
                            String var343 = field398[var5 + 1];
                            client.field540.method2272(67);
                            client.field540.method2398(0);
                            int var344 = client.field540.field2035;
                            client.field540.method2402(var342);
                            class116 var345 = client.field540;
                            int var346 = var345.field2035;
                            byte[] var347 = class149.method544(var343);
                            var345.method2467(var347.length);
                            var345.field2035 += Statics.field2834.method2339(var347, 0, var347.length, var345.field2036, var345.field2035);
                            client.field540.method2407(client.field540.field2035 - var344);
                            continue;
                        }
                        if (var359 == 5010) {
                            var4--;
                            int var348 = field403[var4];
                            String var349 = null;
                            if (var348 < 100) {
                                var349 = client.field696[var348];
                            }
                            if (var349 == null) {
                                var349 = "";
                            }
                            field398[var5++] = var349;
                            continue;
                        }
                        if (var359 == 5011) {
                            var4--;
                            int var350 = field403[var4];
                            String var351 = null;
                            if (var350 < 100) {
                                var351 = client.field697[var350];
                            }
                            if (var351 == null) {
                                var351 = "";
                            }
                            field398[var5++] = var351;
                            continue;
                        }
                        if (var359 == 5015) {
                            String var352;
                            if (Statics.field2370 == null || Statics.field2370.field51 == null) {
                                var352 = "";
                            } else {
                                var352 = Statics.field2370.field51;
                            }
                            field398[var5++] = var352;
                            continue;
                        }
                        if (var359 == 5016) {
                            field403[var4++] = client.field702;
                            continue;
                        }
                        if (var359 == 5017) {
                            field403[var4++] = client.field699;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var358) {
            StringBuilder var354 = new StringBuilder(30);
            var354.append("").append(var3.field2816).append(" ");
            for (int var355 = field415 - 1; var355 >= 0; var355--) {
                var354.append("").append(field404[var355].field269.field2816).append(" ");
            }
            var354.append("").append(var9);
            class80.method1333(var354.toString(), var358);
        }
    }

    @ObfuscatedName("k.x(II)V")
    public static void method244(int arg0) {
        if (arg0 == -1 || !class158.method2312(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2608[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3.field2651 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field4 = var3.field2651;
                method22(var4);
            }
        }
    }
}
