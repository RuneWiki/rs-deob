package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("c")
public class class26 {

    @ObfuscatedName("c.p")
    public static int[] field406 = new int[5];

    @ObfuscatedName("c.x")
    public static int[][] field405 = new int[5][5000];

    @ObfuscatedName("c.k")
    public static int[] field407 = new int[1000];

    @ObfuscatedName("c.r")
    public static String[] field402 = new String[1000];

    @ObfuscatedName("c.z")
    public static int field404 = 0;

    @ObfuscatedName("c.n")
    public static class18[] field409 = new class18[50];

    @ObfuscatedName("c.t")
    public static Calendar field411 = Calendar.getInstance();

    @ObfuscatedName("c.q")
    public static final String[] field412 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.g(Lg;I)V")
    public static void method134(class1 arg0) {
        method61(arg0, 200000);
    }

    @ObfuscatedName("r.h(Lg;II)V")
    public static void method61(class1 arg0, int arg1) {
        Object[] var2 = arg0.field13;
        int var3 = (Integer) var2[0];
        class5 var4 = class5.method16(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field70;
        int[] var9 = var4.field71;
        byte var10 = -1;
        field404 = 0;
        try {
            Statics.field90 = new int[var4.field73];
            int var11 = 0;
            Statics.field202 = new String[var4.field74];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2676;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2607;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2676;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2607;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field6;
                    }
                    Statics.field90[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1;
                    }
                    Statics.field202[var12++] = var15;
                }
            }
            int var16 = 0;
            label2392: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var350 = var8[var7];
                if (var350 < 100) {
                    if (var350 == 0) {
                        field407[var5++] = var9[var7];
                        continue;
                    }
                    if (var350 == 1) {
                        int var17 = var9[var7];
                        field407[var5++] = class160.field2727[var17];
                        continue;
                    }
                    if (var350 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class160.field2727[var18] = field407[var5];
                        client.method27(var18);
                        continue;
                    }
                    if (var350 == 3) {
                        field402[var6++] = var4.field72[var7];
                        continue;
                    }
                    if (var350 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var350 == 7) {
                        var5 -= 2;
                        if (field407[var5 + 1] != field407[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var350 == 8) {
                        var5 -= 2;
                        if (field407[var5 + 1] == field407[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var350 == 9) {
                        var5 -= 2;
                        if (field407[var5] < field407[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var350 == 10) {
                        var5 -= 2;
                        if (field407[var5] > field407[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var350 == 21) {
                        if (field404 == 0) {
                            return;
                        }
                        class18 var19 = field409[--field404];
                        var4 = var19.field281;
                        var8 = var4.field70;
                        var9 = var4.field71;
                        var7 = var19.field274;
                        Statics.field90 = var19.field275;
                        Statics.field202 = var19.field273;
                        continue;
                    }
                    if (var350 == 25) {
                        int var20 = var9[var7];
                        field407[var5++] = class160.method154(var20);
                        continue;
                    }
                    if (var350 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class160.method1699(var21, field407[var5]);
                        continue;
                    }
                    if (var350 == 31) {
                        var5 -= 2;
                        if (field407[var5] <= field407[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var350 == 32) {
                        var5 -= 2;
                        if (field407[var5] >= field407[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var350 == 33) {
                        field407[var5++] = Statics.field90[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var350 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field90[var10001] = field407[var5];
                        continue;
                    }
                    if (var350 == 35) {
                        field402[var6++] = Statics.field202[var9[var7]];
                        continue;
                    }
                    if (var350 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field202[var10001] = field402[var6];
                        continue;
                    }
                    if (var350 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class148.method646(field402, var6, var22);
                        field402[var6++] = var23;
                        continue;
                    }
                    if (var350 == 38) {
                        var5--;
                        continue;
                    }
                    if (var350 == 39) {
                        var6--;
                        continue;
                    }
                    if (var350 == 40) {
                        int var24 = var9[var7];
                        class5 var25 = class5.method16(var24);
                        int[] var26 = new int[var25.field73];
                        String[] var27 = new String[var25.field74];
                        for (int var28 = 0; var28 < var25.field75; var28++) {
                            var26[var28] = field407[var5 - var25.field75 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field76; var29++) {
                            var27[var29] = field402[var6 - var25.field76 + var29];
                        }
                        var5 -= var25.field75;
                        var6 -= var25.field76;
                        class18 var30 = new class18();
                        var30.field281 = var4;
                        var30.field274 = var7;
                        var30.field275 = Statics.field90;
                        var30.field273 = Statics.field202;
                        field409[++field404 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field70;
                        var9 = var25.field71;
                        var7 = -1;
                        Statics.field90 = var26;
                        Statics.field202 = var27;
                        continue;
                    }
                    if (var350 == 42) {
                        field407[var5++] = client.field708[var9[var7]];
                        continue;
                    }
                    if (var350 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field708[var10001] = field407[var5];
                        continue;
                    }
                    if (var350 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field407[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field406[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2392;
                                }
                                field405[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var350 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field407[var5];
                        if (var37 >= 0 && var37 < field406[var36]) {
                            field407[var5++] = field405[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var350 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field407[var5];
                        if (var39 >= 0 && var39 < field406[var38]) {
                            field405[var38][var39] = field407[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var350 == 47) {
                        String var40 = client.field679[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field402[var6++] = var40;
                        continue;
                    }
                    if (var350 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field679[var10001] = field402[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var350 < 1000) {
                    if (var350 == 100) {
                        var5 -= 3;
                        int var42 = field407[var5];
                        int var43 = field407[var5 + 1];
                        int var44 = field407[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class159 var45 = class159.method166(var42);
                        if (var45.field2706 == null) {
                            var45.field2706 = new class159[var44 + 1];
                        }
                        if (var45.field2706.length <= var44) {
                            class159[] var46 = new class159[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2706.length; var47++) {
                                var46[var47] = var45.field2706[var47];
                            }
                            var45.field2706 = var46;
                        }
                        if (var44 > 0 && var45.field2706[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class159 var48 = new class159();
                        var48.field2668 = var43;
                        var48.field2617 = var48.field2676 = var45.field2676;
                        var48.field2607 = var44;
                        var48.field2608 = true;
                        var45.field2706[var44] = var48;
                        if (var41) {
                            Statics.field410 = var48;
                        } else {
                            Statics.field267 = var48;
                        }
                        client.method2472(var45);
                        continue;
                    }
                    if (var350 == 101) {
                        class159 var49 = var41 ? Statics.field410 : Statics.field267;
                        class159 var50 = class159.method166(var49.field2676);
                        var50.field2706[var49.field2607] = null;
                        client.method2472(var50);
                        continue;
                    }
                    if (var350 == 102) {
                        var5--;
                        class159 var51 = class159.method166(field407[var5]);
                        var51.field2706 = null;
                        client.method2472(var51);
                        continue;
                    }
                    if (var350 == 200) {
                        var5 -= 2;
                        int var52 = field407[var5];
                        int var53 = field407[var5 + 1];
                        class159 var54 = class159.method2270(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field407[var5++] = 1;
                            if (var41) {
                                Statics.field410 = var54;
                            } else {
                                Statics.field267 = var54;
                            }
                            continue;
                        }
                        field407[var5++] = 0;
                        continue;
                    }
                } else if (var350 >= 1000 && var350 < 1100 || var350 >= 2000 && var350 < 2100) {
                    class159 var55;
                    if (var350 >= 2000) {
                        var350 -= 1000;
                        var5--;
                        var55 = class159.method166(field407[var5]);
                    } else {
                        var55 = var41 ? Statics.field410 : Statics.field267;
                    }
                    if (var350 == 1000) {
                        var5 -= 2;
                        var55.field2611 = field407[var5];
                        var55.field2612 = field407[var5 + 1];
                        client.method2472(var55);
                        continue;
                    }
                    if (var350 == 1001) {
                        var5 -= 2;
                        var55.field2615 = field407[var5];
                        var55.field2616 = field407[var5 + 1];
                        client.method2472(var55);
                        continue;
                    }
                    if (var350 == 1003) {
                        var5--;
                        boolean var56 = field407[var5] == 1;
                        if (var55.field2618 != var56) {
                            var55.field2618 = var56;
                            client.method2472(var55);
                        }
                        continue;
                    }
                } else if (!(var350 < 1100 || var350 >= 1200) || !(var350 < 2100 || var350 >= 2200)) {
                    class159 var57;
                    if (var350 >= 2000) {
                        var350 -= 1000;
                        var5--;
                        var57 = class159.method166(field407[var5]);
                    } else {
                        var57 = var41 ? Statics.field410 : Statics.field267;
                    }
                    if (var350 == 1100) {
                        var5 -= 2;
                        var57.field2619 = field407[var5];
                        if (var57.field2619 > var57.field2692 - var57.field2615) {
                            var57.field2619 = var57.field2692 - var57.field2615;
                        }
                        if (var57.field2619 < 0) {
                            var57.field2619 = 0;
                        }
                        var57.field2620 = field407[var5 + 1];
                        if (var57.field2620 > var57.field2622 - var57.field2616) {
                            var57.field2620 = var57.field2622 - var57.field2616;
                        }
                        if (var57.field2620 < 0) {
                            var57.field2620 = 0;
                        }
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1101) {
                        var5--;
                        var57.field2623 = field407[var5];
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1102) {
                        var5--;
                        var57.field2627 = field407[var5] == 1;
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1103) {
                        var5--;
                        var57.field2628 = field407[var5];
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1104) {
                        var5--;
                        var57.field2629 = field407[var5];
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1105) {
                        var5--;
                        var57.field2630 = field407[var5];
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1106) {
                        var5--;
                        var57.field2659 = field407[var5];
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1107) {
                        var5--;
                        var57.field2610 = field407[var5] == 1;
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1108) {
                        var57.field2638 = 1;
                        var5--;
                        var57.field2599 = field407[var5];
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1109) {
                        var5 -= 6;
                        var57.field2686 = field407[var5];
                        var57.field2717 = field407[var5 + 1];
                        var57.field2715 = field407[var5 + 2];
                        var57.field2647 = field407[var5 + 3];
                        var57.field2646 = field407[var5 + 4];
                        var57.field2649 = field407[var5 + 5];
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1110) {
                        var5--;
                        int var58 = field407[var5];
                        if (var57.field2632 != var58) {
                            var57.field2632 = var58;
                            var57.field2601 = 0;
                            var57.field2713 = 0;
                            client.method2472(var57);
                        }
                        continue;
                    }
                    if (var350 == 1111) {
                        var5--;
                        var57.field2651 = field407[var5] == 1;
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1112) {
                        var6--;
                        String var59 = field402[var6];
                        if (!var59.equals(var57.field2653)) {
                            var57.field2653 = var59;
                            client.method2472(var57);
                        }
                        continue;
                    }
                    if (var350 == 1113) {
                        var5--;
                        var57.field2636 = field407[var5];
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1114) {
                        var5 -= 3;
                        var57.field2656 = field407[var5];
                        var57.field2682 = field407[var5 + 1];
                        var57.field2655 = field407[var5 + 2];
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1115) {
                        var5--;
                        var57.field2658 = field407[var5] == 1;
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1116) {
                        var5--;
                        var57.field2634 = field407[var5];
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1117) {
                        var5--;
                        var57.field2635 = field407[var5];
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1118) {
                        var5--;
                        var57.field2605 = field407[var5] == 1;
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1119) {
                        var5--;
                        var57.field2633 = field407[var5] == 1;
                        client.method2472(var57);
                        continue;
                    }
                    if (var350 == 1120) {
                        var5 -= 2;
                        var57.field2692 = field407[var5];
                        var57.field2622 = field407[var5 + 1];
                        client.method2472(var57);
                        continue;
                    }
                } else if (var350 >= 1200 && var350 < 1300 || var350 >= 2200 && var350 < 2300) {
                    class159 var60;
                    if (var350 >= 2000) {
                        var350 -= 1000;
                        var5--;
                        var60 = class159.method166(field407[var5]);
                    } else {
                        var60 = var41 ? Statics.field410 : Statics.field267;
                    }
                    client.method2472(var60);
                    if (var350 == 1200) {
                        var5 -= 2;
                        int var61 = field407[var5];
                        int var62 = field407[var5 + 1];
                        var60.field2710 = var61;
                        var60.field2711 = var62;
                        class40 var63 = class40.method1333(var61);
                        var60.field2715 = var63.field1026;
                        var60.field2647 = var63.field1022;
                        var60.field2646 = var63.field997;
                        var60.field2686 = var63.field998;
                        var60.field2717 = var63.field988;
                        var60.field2649 = var63.field994;
                        if (var60.field2615 > 0) {
                            var60.field2649 = var60.field2649 * 32 / var60.field2615;
                        }
                        continue;
                    }
                    if (var350 == 1201) {
                        var60.field2638 = 2;
                        var5--;
                        var60.field2599 = field407[var5];
                        continue;
                    }
                    if (var350 == 1202) {
                        var60.field2638 = 3;
                        var60.field2599 = Statics.field461.field51.method3274();
                        continue;
                    }
                } else if (var350 >= 1300 && var350 < 1400 || var350 >= 2300 && var350 < 2400) {
                    class159 var64;
                    if (var350 >= 2000) {
                        var350 -= 1000;
                        var5--;
                        var64 = class159.method166(field407[var5]);
                    } else {
                        var64 = var41 ? Statics.field410 : Statics.field267;
                    }
                    if (var350 == 1300) {
                        var5--;
                        int var65 = field407[var5] - 1;
                        if (var65 >= 0 && var65 <= 9) {
                            var6--;
                            var64.method3240(var65, field402[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var350 == 1301) {
                        var5 -= 2;
                        int var66 = field407[var5];
                        int var67 = field407[var5 + 1];
                        var64.field2691 = class159.method2270(var66, var67);
                        continue;
                    }
                    if (var350 == 1302) {
                        var5--;
                        var64.field2671 = field407[var5] == 1;
                        continue;
                    }
                    if (var350 == 1303) {
                        var5--;
                        var64.field2624 = field407[var5];
                        continue;
                    }
                    if (var350 == 1304) {
                        var5--;
                        var64.field2670 = field407[var5];
                        continue;
                    }
                    if (var350 == 1305) {
                        var6--;
                        var64.field2666 = field402[var6];
                        continue;
                    }
                    if (var350 == 1306) {
                        var6--;
                        var64.field2724 = field402[var6];
                        continue;
                    }
                    if (var350 == 1307) {
                        var64.field2667 = null;
                        continue;
                    }
                } else {
                    if (var350 >= 1400 && var350 < 1500 || var350 >= 2400 && var350 < 2500) {
                        class159 var68;
                        if (var350 >= 2000) {
                            var350 -= 1000;
                            var5--;
                            var68 = class159.method166(field407[var5]);
                        } else {
                            var68 = var41 ? Statics.field410 : Statics.field267;
                        }
                        var6--;
                        String var69 = field402[var6];
                        int[] var70 = null;
                        if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                            var5--;
                            int var71 = field407[var5];
                            if (var71 > 0) {
                                var70 = new int[var71];
                                while (var71-- > 0) {
                                    var5--;
                                    var70[var71] = field407[var5];
                                }
                            }
                            var69 = var69.substring(0, var69.length() - 1);
                        }
                        Object[] var72 = new Object[var69.length() + 1];
                        for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                            if (var69.charAt(var73 - 1) == 's') {
                                var6--;
                                var72[var73] = field402[var6];
                            } else {
                                var5--;
                                var72[var73] = Integer.valueOf(field407[var5]);
                            }
                        }
                        var5--;
                        int var74 = field407[var5];
                        if (var74 == -1) {
                            var72 = null;
                        } else {
                            var72[0] = Integer.valueOf(var74);
                        }
                        if (var350 == 1400) {
                            var68.field2675 = var72;
                        }
                        if (var350 == 1401) {
                            var68.field2678 = var72;
                        }
                        if (var350 == 1402) {
                            var68.field2677 = var72;
                        }
                        if (var350 == 1403) {
                            var68.field2679 = var72;
                        }
                        if (var350 == 1404) {
                            var68.field2639 = var72;
                        }
                        if (var350 == 1405) {
                            var68.field2606 = var72;
                        }
                        if (var350 == 1406) {
                            var68.field2685 = var72;
                        }
                        if (var350 == 1407) {
                            var68.field2650 = var72;
                            var68.field2687 = var70;
                        }
                        if (var350 == 1408) {
                            var68.field2598 = var72;
                        }
                        if (var350 == 1409) {
                            var68.field2681 = var72;
                        }
                        if (var350 == 1410) {
                            var68.field2683 = var72;
                        }
                        if (var350 == 1411) {
                            var68.field2648 = var72;
                        }
                        if (var350 == 1412) {
                            var68.field2680 = var72;
                        }
                        if (var350 == 1414) {
                            var68.field2688 = var72;
                            var68.field2695 = var70;
                        }
                        if (var350 == 1415) {
                            var68.field2690 = var72;
                            var68.field2669 = var70;
                        }
                        if (var350 == 1416) {
                            var68.field2604 = var72;
                        }
                        if (var350 == 1417) {
                            var68.field2694 = var72;
                        }
                        if (var350 == 1418) {
                            var68.field2644 = var72;
                        }
                        if (var350 == 1419) {
                            var68.field2696 = var72;
                        }
                        if (var350 == 1420) {
                            var68.field2697 = var72;
                        }
                        if (var350 == 1421) {
                            var68.field2698 = var72;
                        }
                        if (var350 == 1422) {
                            var68.field2699 = var72;
                        }
                        if (var350 == 1423) {
                            var68.field2700 = var72;
                        }
                        if (var350 == 1424) {
                            var68.field2701 = var72;
                        }
                        var68.field2673 = true;
                        continue;
                    }
                    if (var350 < 1600) {
                        class159 var75 = var41 ? Statics.field410 : Statics.field267;
                        if (var350 == 1500) {
                            field407[var5++] = var75.field2611;
                            continue;
                        }
                        if (var350 == 1501) {
                            field407[var5++] = var75.field2612;
                            continue;
                        }
                        if (var350 == 1502) {
                            field407[var5++] = var75.field2615;
                            continue;
                        }
                        if (var350 == 1503) {
                            field407[var5++] = var75.field2616;
                            continue;
                        }
                        if (var350 == 1504) {
                            field407[var5++] = var75.field2618 ? 1 : 0;
                            continue;
                        }
                        if (var350 == 1505) {
                            field407[var5++] = var75.field2617;
                            continue;
                        }
                    } else if (var350 < 1700) {
                        class159 var76 = var41 ? Statics.field410 : Statics.field267;
                        if (var350 == 1600) {
                            field407[var5++] = var76.field2619;
                            continue;
                        }
                        if (var350 == 1601) {
                            field407[var5++] = var76.field2620;
                            continue;
                        }
                        if (var350 == 1602) {
                            field402[var6++] = var76.field2653;
                            continue;
                        }
                        if (var350 == 1603) {
                            field407[var5++] = var76.field2692;
                            continue;
                        }
                        if (var350 == 1604) {
                            field407[var5++] = var76.field2622;
                            continue;
                        }
                        if (var350 == 1605) {
                            field407[var5++] = var76.field2649;
                            continue;
                        }
                        if (var350 == 1606) {
                            field407[var5++] = var76.field2715;
                            continue;
                        }
                        if (var350 == 1607) {
                            field407[var5++] = var76.field2646;
                            continue;
                        }
                        if (var350 == 1608) {
                            field407[var5++] = var76.field2647;
                            continue;
                        }
                    } else if (var350 < 1800) {
                        class159 var77 = var41 ? Statics.field410 : Statics.field267;
                        if (var350 == 1700) {
                            field407[var5++] = var77.field2710;
                            continue;
                        }
                        if (var350 == 1701) {
                            if (var77.field2710 == -1) {
                                field407[var5++] = 0;
                            } else {
                                field407[var5++] = var77.field2711;
                            }
                            continue;
                        }
                        if (var350 == 1702) {
                            field407[var5++] = var77.field2607;
                            continue;
                        }
                    } else if (var350 < 1900) {
                        class159 var78 = var41 ? Statics.field410 : Statics.field267;
                        if (var350 == 1800) {
                            int[] var79 = field407;
                            int var80 = var5++;
                            int var81 = client.method2492(var78);
                            int var82 = var81 >> 11 & 0x3F;
                            var79[var80] = var82;
                            continue;
                        }
                        if (var350 == 1801) {
                            var5--;
                            int var83 = field407[var5];
                            int var351 = var83 - 1;
                            if (var78.field2667 != null && var351 < var78.field2667.length && var78.field2667[var351] != null) {
                                field402[var6++] = var78.field2667[var351];
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var350 == 1802) {
                            if (var78.field2666 == null) {
                                field402[var6++] = "";
                            } else {
                                field402[var6++] = var78.field2666;
                            }
                            continue;
                        }
                    } else if (var350 < 2600) {
                        var5--;
                        class159 var84 = class159.method166(field407[var5]);
                        if (var350 == 2500) {
                            field407[var5++] = var84.field2611;
                            continue;
                        }
                        if (var350 == 2501) {
                            field407[var5++] = var84.field2612;
                            continue;
                        }
                        if (var350 == 2502) {
                            field407[var5++] = var84.field2615;
                            continue;
                        }
                        if (var350 == 2503) {
                            field407[var5++] = var84.field2616;
                            continue;
                        }
                        if (var350 == 2504) {
                            field407[var5++] = var84.field2618 ? 1 : 0;
                            continue;
                        }
                        if (var350 == 2505) {
                            field407[var5++] = var84.field2617;
                            continue;
                        }
                    } else if (var350 < 2700) {
                        var5--;
                        class159 var85 = class159.method166(field407[var5]);
                        if (var350 == 2600) {
                            field407[var5++] = var85.field2619;
                            continue;
                        }
                        if (var350 == 2601) {
                            field407[var5++] = var85.field2620;
                            continue;
                        }
                        if (var350 == 2602) {
                            field402[var6++] = var85.field2653;
                            continue;
                        }
                        if (var350 == 2603) {
                            field407[var5++] = var85.field2692;
                            continue;
                        }
                        if (var350 == 2604) {
                            field407[var5++] = var85.field2622;
                            continue;
                        }
                        if (var350 == 2605) {
                            field407[var5++] = var85.field2649;
                            continue;
                        }
                        if (var350 == 2606) {
                            field407[var5++] = var85.field2715;
                            continue;
                        }
                        if (var350 == 2607) {
                            field407[var5++] = var85.field2646;
                            continue;
                        }
                        if (var350 == 2608) {
                            field407[var5++] = var85.field2647;
                            continue;
                        }
                    } else if (var350 < 2800) {
                        if (var350 == 2700) {
                            var5--;
                            class159 var86 = class159.method166(field407[var5]);
                            field407[var5++] = var86.field2710;
                            continue;
                        }
                        if (var350 == 2701) {
                            var5--;
                            class159 var87 = class159.method166(field407[var5]);
                            if (var87.field2710 == -1) {
                                field407[var5++] = 0;
                            } else {
                                field407[var5++] = var87.field2711;
                            }
                            continue;
                        }
                        if (var350 == 2702) {
                            var5--;
                            int var88 = field407[var5];
                            class4 var89 = (class4) client.field653.method3354((long) var88);
                            if (var89 == null) {
                                field407[var5++] = 0;
                            } else {
                                field407[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var350 < 2900) {
                        var5--;
                        class159 var90 = class159.method166(field407[var5]);
                        if (var350 == 2800) {
                            int[] var91 = field407;
                            int var92 = var5++;
                            int var93 = client.method2492(var90);
                            int var94 = var93 >> 11 & 0x3F;
                            var91[var92] = var94;
                            continue;
                        }
                        if (var350 == 2801) {
                            var5--;
                            int var95 = field407[var5];
                            int var352 = var95 - 1;
                            if (var90.field2667 != null && var352 < var90.field2667.length && var90.field2667[var352] != null) {
                                field402[var6++] = var90.field2667[var352];
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var350 == 2802) {
                            if (var90.field2666 == null) {
                                field402[var6++] = "";
                            } else {
                                field402[var6++] = var90.field2666;
                            }
                            continue;
                        }
                    } else if (var350 < 3200) {
                        if (var350 == 3100) {
                            var6--;
                            String var96 = field402[var6];
                            client.method1557(0, "", var96);
                            continue;
                        }
                        if (var350 == 3101) {
                            var5 -= 2;
                            client.method1323(Statics.field461, field407[var5], field407[var5 + 1]);
                            continue;
                        }
                        if (var350 == 3103) {
                            client.field605.method2360(22);
                            for (class4 var97 = (class4) client.field653.method3352(); var97 != null; var97 = (class4) client.field653.method3353()) {
                                if (var97.field61 == 0 || var97.field61 == 3) {
                                    client.method62(var97, true);
                                }
                            }
                            if (client.field648 != null) {
                                client.method2472(client.field648);
                                client.field648 = null;
                            }
                            continue;
                        }
                        if (var350 == 3104) {
                            var6--;
                            String var98 = field402[var6];
                            int var99 = 0;
                            if (class148.method10(var98)) {
                                var99 = class148.method4(var98);
                            }
                            client.field605.method2360(168);
                            client.field605.method2605(var99);
                            continue;
                        }
                        if (var350 == 3105) {
                            var6--;
                            String var100 = field402[var6];
                            client.field605.method2360(12);
                            client.field605.method2485(var100.length() + 1);
                            client.field605.method2502(var100);
                            continue;
                        }
                        if (var350 == 3106) {
                            var6--;
                            String var101 = field402[var6];
                            client.field605.method2360(114);
                            client.field605.method2485(var101.length() + 1);
                            client.field605.method2502(var101);
                            continue;
                        }
                        if (var350 == 3107) {
                            var5--;
                            int var102 = field407[var5];
                            var6--;
                            String var103 = field402[var6];
                            client.method2768(var102, var103);
                            continue;
                        }
                        if (var350 == 3108) {
                            var5 -= 3;
                            int var104 = field407[var5];
                            int var105 = field407[var5 + 1];
                            int var106 = field407[var5 + 2];
                            class159 var107 = class159.method166(var106);
                            client.method204(var107, var104, var105);
                            continue;
                        }
                        if (var350 == 3109) {
                            var5 -= 2;
                            int var108 = field407[var5];
                            int var109 = field407[var5 + 1];
                            class159 var110 = var41 ? Statics.field410 : Statics.field267;
                            client.method204(var110, var108, var109);
                            continue;
                        }
                        if (var350 == 3110) {
                            var5--;
                            Statics.field876 = field407[var5] == 1;
                            continue;
                        }
                    } else if (var350 < 3300) {
                        if (var350 == 3200) {
                            var5 -= 3;
                            Statics.method1329(field407[var5], field407[var5 + 1], field407[var5 + 2]);
                            continue;
                        }
                        if (var350 == 3201) {
                            var5--;
                            client.method1627(field407[var5]);
                            continue;
                        }
                        if (var350 == 3202) {
                            var5 -= 2;
                            client.method2238(field407[var5], field407[var5 + 1]);
                            continue;
                        }
                    } else if (var350 < 3400) {
                        if (var350 == 3300) {
                            field407[var5++] = client.field496;
                            continue;
                        }
                        if (var350 == 3301) {
                            var5 -= 2;
                            int var111 = field407[var5];
                            int var112 = field407[var5 + 1];
                            int[] var113 = field407;
                            int var114 = var5++;
                            class19 var115 = (class19) class19.field289.method3354((long) var111);
                            int var116;
                            if (var115 == null) {
                                var116 = -1;
                            } else if (var112 >= 0 && var112 < var115.field288.length) {
                                var116 = var115.field288[var112];
                            } else {
                                var116 = -1;
                            }
                            var113[var114] = var116;
                            continue;
                        }
                        if (var350 == 3302) {
                            var5 -= 2;
                            int var117 = field407[var5];
                            int var118 = field407[var5 + 1];
                            field407[var5++] = class19.method3195(var117, var118);
                            continue;
                        }
                        if (var350 == 3303) {
                            var5 -= 2;
                            int var119 = field407[var5];
                            int var120 = field407[var5 + 1];
                            field407[var5++] = class19.method1360(var119, var120);
                            continue;
                        }
                        if (var350 == 3304) {
                            var5--;
                            int var121 = field407[var5];
                            field407[var5++] = class41.method765(var121).field1031;
                            continue;
                        }
                        if (var350 == 3305) {
                            var5--;
                            int var122 = field407[var5];
                            field407[var5++] = client.field621[var122];
                            continue;
                        }
                        if (var350 == 3306) {
                            var5--;
                            int var123 = field407[var5];
                            field407[var5++] = client.field622[var123];
                            continue;
                        }
                        if (var350 == 3307) {
                            var5--;
                            int var124 = field407[var5];
                            field407[var5++] = client.field623[var124];
                            continue;
                        }
                        if (var350 == 3308) {
                            int var125 = Statics.field1113;
                            int var126 = (Statics.field461.field421 >> 7) + Statics.field1399;
                            int var127 = (Statics.field461.field422 >> 7) + Statics.field113;
                            field407[var5++] = (var125 << 28) + (var126 << 14) + var127;
                            continue;
                        }
                        if (var350 == 3309) {
                            var5--;
                            int var128 = field407[var5];
                            field407[var5++] = var128 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var350 == 3310) {
                            var5--;
                            int var129 = field407[var5];
                            field407[var5++] = var129 >> 28;
                            continue;
                        }
                        if (var350 == 3311) {
                            var5--;
                            int var130 = field407[var5];
                            field407[var5++] = var130 & 0x3FFF;
                            continue;
                        }
                        if (var350 == 3312) {
                            field407[var5++] = client.field489 ? 1 : 0;
                            continue;
                        }
                        if (var350 == 3313) {
                            var5 -= 2;
                            int var131 = field407[var5] + 32768;
                            int var132 = field407[var5 + 1];
                            int[] var133 = field407;
                            int var134 = var5++;
                            class19 var135 = (class19) class19.field289.method3354((long) var131);
                            int var136;
                            if (var135 == null) {
                                var136 = -1;
                            } else if (var132 >= 0 && var132 < var135.field288.length) {
                                var136 = var135.field288[var132];
                            } else {
                                var136 = -1;
                            }
                            var133[var134] = var136;
                            continue;
                        }
                        if (var350 == 3314) {
                            var5 -= 2;
                            int var137 = field407[var5] + 32768;
                            int var138 = field407[var5 + 1];
                            field407[var5++] = class19.method3195(var137, var138);
                            continue;
                        }
                        if (var350 == 3315) {
                            var5 -= 2;
                            int var139 = field407[var5] + 32768;
                            int var140 = field407[var5 + 1];
                            field407[var5++] = class19.method1360(var139, var140);
                            continue;
                        }
                        if (var350 == 3316) {
                            if (client.field651 >= 2) {
                                field407[var5++] = client.field651;
                            } else {
                                field407[var5++] = 0;
                            }
                            continue;
                        }
                        if (var350 == 3317) {
                            field407[var5++] = client.field501;
                            continue;
                        }
                        if (var350 == 3318) {
                            field407[var5++] = client.field740;
                            continue;
                        }
                        if (var350 == 3321) {
                            field407[var5++] = client.field649;
                            continue;
                        }
                        if (var350 == 3322) {
                            field407[var5++] = client.field567;
                            continue;
                        }
                        if (var350 == 3323) {
                            if (client.field652) {
                                field407[var5++] = 1;
                            } else {
                                field407[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var350 < 3500) {
                        if (var350 == 3400) {
                            var5 -= 2;
                            int var141 = field407[var5];
                            int var142 = field407[var5 + 1];
                            class39 var143 = (class39) class39.field975.method3303((long) var141);
                            class39 var144;
                            if (var143 == null) {
                                byte[] var145 = Statics.field961.method3080(8, var141);
                                class39 var146 = new class39();
                                if (var145 != null) {
                                    var146.method823(new class127(var145));
                                }
                                class39.field975.method3313(var146, (long) var141);
                                var144 = var146;
                            } else {
                                var144 = var143;
                            }
                            class39 var147 = var144;
                            if (var144.field970 != 's') {
                            }
                            for (int var148 = 0; var148 < var147.field973; var148++) {
                                if (var147.field974[var148] == var142) {
                                    field402[var6++] = var147.field976[var148];
                                    var147 = null;
                                    break;
                                }
                            }
                            if (var147 != null) {
                                field402[var6++] = var147.field971;
                            }
                            continue;
                        }
                        if (var350 == 3408) {
                            var5 -= 4;
                            int var149 = field407[var5];
                            int var150 = field407[var5 + 1];
                            int var151 = field407[var5 + 2];
                            int var152 = field407[var5 + 3];
                            class39 var153 = (class39) class39.field975.method3303((long) var151);
                            class39 var154;
                            if (var153 == null) {
                                byte[] var155 = Statics.field961.method3080(8, var151);
                                class39 var156 = new class39();
                                if (var155 != null) {
                                    var156.method823(new class127(var155));
                                }
                                class39.field975.method3313(var156, (long) var151);
                                var154 = var156;
                            } else {
                                var154 = var153;
                            }
                            class39 var157 = var154;
                            if (var154.field978 == var149 && var154.field970 == var150) {
                                for (int var158 = 0; var158 < var157.field973; var158++) {
                                    if (var157.field974[var158] == var152) {
                                        if (var150 == 115) {
                                            field402[var6++] = var157.field976[var158];
                                        } else {
                                            field407[var5++] = var157.field969[var158];
                                        }
                                        var157 = null;
                                        break;
                                    }
                                }
                                if (var157 != null) {
                                    if (var150 == 115) {
                                        field402[var6++] = var157.field971;
                                    } else {
                                        field407[var5++] = var157.field972;
                                    }
                                }
                                continue;
                            }
                            if (var150 == 115) {
                                field402[var6++] = "null";
                            } else {
                                field407[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var350 < 3700) {
                        if (var350 == 3600) {
                            if (client.field737 == 0) {
                                field407[var5++] = -2;
                            } else if (client.field737 == 1) {
                                field407[var5++] = -1;
                            } else {
                                field407[var5++] = client.field736;
                            }
                            continue;
                        }
                        if (var350 == 3601) {
                            var5--;
                            int var159 = field407[var5];
                            if (client.field737 == 2 && var159 < client.field736) {
                                field402[var6++] = client.field738[var159].field380;
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var350 == 3602) {
                            var5--;
                            int var160 = field407[var5];
                            if (client.field737 == 2 && var160 < client.field736) {
                                field407[var5++] = client.field738[var160].field368;
                                continue;
                            }
                            field407[var5++] = 0;
                            continue;
                        }
                        if (var350 == 3603) {
                            var5--;
                            int var161 = field407[var5];
                            if (client.field737 == 2 && var161 < client.field736) {
                                field407[var5++] = client.field738[var161].field371;
                                continue;
                            }
                            field407[var5++] = 0;
                            continue;
                        }
                        if (var350 == 3604) {
                            var6--;
                            String var162 = field402[var6];
                            var5--;
                            int var163 = field407[var5];
                            client.field605.method2360(41);
                            client.field605.method2485(class127.method2082(var162) + 1);
                            client.field605.method2521(var163);
                            client.field605.method2502(var162);
                            continue;
                        }
                        if (var350 == 3605) {
                            var6--;
                            String var164 = field402[var6];
                            client.method884(var164);
                            continue;
                        }
                        if (var350 == 3606) {
                            var6--;
                            String var165 = field402[var6];
                            if (var165 == null) {
                                continue;
                            }
                            String var166 = class149.method2249(var165, Statics.field661);
                            if (var166 == null) {
                                continue;
                            }
                            int var167 = 0;
                            while (true) {
                                if (var167 >= client.field736) {
                                    continue label2392;
                                }
                                class23 var168 = client.field738[var167];
                                String var169 = var168.field380;
                                String var170 = class149.method2249(var169, Statics.field661);
                                if (class137.method821(var165, var166, var169, var170)) {
                                    client.field736--;
                                    for (int var171 = var167; var171 < client.field736; var171++) {
                                        client.field738[var171] = client.field738[var171 + 1];
                                    }
                                    client.field675 = client.field667;
                                    client.field605.method2360(182);
                                    client.field605.method2485(class127.method2082(var165));
                                    client.field605.method2502(var165);
                                    continue label2392;
                                }
                                var167++;
                            }
                        }
                        if (var350 == 3607) {
                            var6--;
                            String var172 = field402[var6];
                            client.method2269(var172, false);
                            continue;
                        }
                        if (var350 == 3608) {
                            var6--;
                            String var173 = field402[var6];
                            client.method2253(var173);
                            continue;
                        }
                        if (var350 == 3609) {
                            var6--;
                            String var174 = field402[var6];
                            if (var174.startsWith(class2.method231(0)) || var174.startsWith(class2.method231(1))) {
                                var174 = var174.substring(7);
                            }
                            field407[var5++] = client.method1706(var174) ? 1 : 0;
                            continue;
                        }
                        if (var350 == 3611) {
                            if (client.field709 == null) {
                                field402[var6++] = "";
                            } else {
                                field402[var6++] = class147.method224(client.field709);
                            }
                            continue;
                        }
                        if (var350 == 3612) {
                            if (client.field709 == null) {
                                field407[var5++] = 0;
                            } else {
                                field407[var5++] = Statics.field1817;
                            }
                            continue;
                        }
                        if (var350 == 3613) {
                            var5--;
                            int var175 = field407[var5];
                            if (client.field709 != null && var175 < Statics.field1817) {
                                field402[var6++] = Statics.field199[var175].field118;
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var350 == 3614) {
                            var5--;
                            int var176 = field407[var5];
                            if (client.field709 != null && var176 < Statics.field1817) {
                                field407[var5++] = Statics.field199[var176].field115;
                                continue;
                            }
                            field407[var5++] = 0;
                            continue;
                        }
                        if (var350 == 3615) {
                            var5--;
                            int var177 = field407[var5];
                            if (client.field709 != null && var177 < Statics.field1817) {
                                field407[var5++] = Statics.field199[var177].field116;
                                continue;
                            }
                            field407[var5++] = 0;
                            continue;
                        }
                        if (var350 == 3616) {
                            field407[var5++] = Statics.field2571;
                            continue;
                        }
                        if (var350 == 3617) {
                            var6--;
                            String var178 = field402[var6];
                            Statics.method606(var178);
                            continue;
                        }
                        if (var350 == 3618) {
                            field407[var5++] = Statics.field922;
                            continue;
                        }
                        if (var350 == 3619) {
                            var6--;
                            String var179 = field402[var6];
                            client.method112(var179);
                            continue;
                        }
                        if (var350 == 3620) {
                            client.field605.method2360(27);
                            client.field605.method2485(0);
                            continue;
                        }
                        if (var350 == 3621) {
                            if (client.field737 == 0) {
                                field407[var5++] = -1;
                            } else {
                                field407[var5++] = client.field493;
                            }
                            continue;
                        }
                        if (var350 == 3622) {
                            var5--;
                            int var180 = field407[var5];
                            if (client.field737 != 0 && var180 < client.field493) {
                                field402[var6++] = client.field741[var180].field185;
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var350 == 3623) {
                            var6--;
                            String var181 = field402[var6];
                            if (var181.startsWith(class2.method231(0)) || var181.startsWith(class2.method231(1))) {
                                var181 = var181.substring(7);
                            }
                            field407[var5++] = client.method57(var181) ? 1 : 0;
                            continue;
                        }
                        if (var350 == 3624) {
                            var5--;
                            int var182 = field407[var5];
                            if (Statics.field199 != null && var182 < Statics.field1817 && Statics.field199[var182].field118.equalsIgnoreCase(Statics.field461.field45)) {
                                field407[var5++] = 1;
                                continue;
                            }
                            field407[var5++] = 0;
                            continue;
                        }
                        if (var350 == 3625) {
                            if (client.field710 == null) {
                                field402[var6++] = "";
                            } else {
                                field402[var6++] = class147.method224(client.field710);
                            }
                            continue;
                        }
                    } else if (var350 < 4100) {
                        if (var350 == 4000) {
                            var5 -= 2;
                            int var183 = field407[var5];
                            int var184 = field407[var5 + 1];
                            field407[var5++] = var183 + var184;
                            continue;
                        }
                        if (var350 == 4001) {
                            var5 -= 2;
                            int var185 = field407[var5];
                            int var186 = field407[var5 + 1];
                            field407[var5++] = var185 - var186;
                            continue;
                        }
                        if (var350 == 4002) {
                            var5 -= 2;
                            int var187 = field407[var5];
                            int var188 = field407[var5 + 1];
                            field407[var5++] = var187 * var188;
                            continue;
                        }
                        if (var350 == 4003) {
                            var5 -= 2;
                            int var189 = field407[var5];
                            int var190 = field407[var5 + 1];
                            field407[var5++] = var189 / var190;
                            continue;
                        }
                        if (var350 == 4004) {
                            var5--;
                            int var191 = field407[var5];
                            field407[var5++] = (int) (Math.random() * (double) var191);
                            continue;
                        }
                        if (var350 == 4005) {
                            var5--;
                            int var192 = field407[var5];
                            field407[var5++] = (int) (Math.random() * (double) (var192 + 1));
                            continue;
                        }
                        if (var350 == 4006) {
                            var5 -= 5;
                            int var193 = field407[var5];
                            int var194 = field407[var5 + 1];
                            int var195 = field407[var5 + 2];
                            int var196 = field407[var5 + 3];
                            int var197 = field407[var5 + 4];
                            field407[var5++] = (var194 - var193) * (var197 - var195) / (var196 - var195) + var193;
                            continue;
                        }
                        if (var350 == 4007) {
                            var5 -= 2;
                            int var198 = field407[var5];
                            int var199 = field407[var5 + 1];
                            field407[var5++] = var198 * var199 / 100 + var198;
                            continue;
                        }
                        if (var350 == 4008) {
                            var5 -= 2;
                            int var200 = field407[var5];
                            int var201 = field407[var5 + 1];
                            field407[var5++] = var200 | 0x1 << var201;
                            continue;
                        }
                        if (var350 == 4009) {
                            var5 -= 2;
                            int var202 = field407[var5];
                            int var203 = field407[var5 + 1];
                            field407[var5++] = var202 & -1 - (0x1 << var203);
                            continue;
                        }
                        if (var350 == 4010) {
                            var5 -= 2;
                            int var204 = field407[var5];
                            int var205 = field407[var5 + 1];
                            field407[var5++] = (var204 & 0x1 << var205) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var350 == 4011) {
                            var5 -= 2;
                            int var206 = field407[var5];
                            int var207 = field407[var5 + 1];
                            field407[var5++] = var206 % var207;
                            continue;
                        }
                        if (var350 == 4012) {
                            var5 -= 2;
                            int var208 = field407[var5];
                            int var209 = field407[var5 + 1];
                            if (var208 == 0) {
                                field407[var5++] = 0;
                            } else {
                                field407[var5++] = (int) Math.pow((double) var208, (double) var209);
                            }
                            continue;
                        }
                        if (var350 == 4013) {
                            var5 -= 2;
                            int var210 = field407[var5];
                            int var211 = field407[var5 + 1];
                            if (var210 == 0) {
                                field407[var5++] = 0;
                            } else if (var211 == 0) {
                                field407[var5++] = Integer.MAX_VALUE;
                            } else {
                                field407[var5++] = (int) Math.pow((double) var210, 1.0D / (double) var211);
                            }
                            continue;
                        }
                        if (var350 == 4014) {
                            var5 -= 2;
                            int var212 = field407[var5];
                            int var213 = field407[var5 + 1];
                            field407[var5++] = var212 & var213;
                            continue;
                        }
                        if (var350 == 4015) {
                            var5 -= 2;
                            int var214 = field407[var5];
                            int var215 = field407[var5 + 1];
                            field407[var5++] = var214 | var215;
                            continue;
                        }
                    } else if (var350 < 4200) {
                        if (var350 == 4100) {
                            var6--;
                            String var216 = field402[var6];
                            var5--;
                            int var217 = field407[var5];
                            field402[var6++] = var216 + var217;
                            continue;
                        }
                        if (var350 == 4101) {
                            var6 -= 2;
                            String var218 = field402[var6];
                            String var219 = field402[var6 + 1];
                            field402[var6++] = var218 + var219;
                            continue;
                        }
                        if (var350 == 4102) {
                            var6--;
                            String var220 = field402[var6];
                            var5--;
                            int var221 = field407[var5];
                            String[] var222 = field402;
                            int var223 = var6++;
                            String var225;
                            if (var221 < 0) {
                                var225 = Integer.toString(var221);
                            } else {
                                int var226 = var221;
                                String var227;
                                if (var221 < 0) {
                                    var227 = Integer.toString(var221, 10);
                                } else {
                                    int var228 = 2;
                                    int var229 = var221 / 10;
                                    while (var229 != 0) {
                                        var229 /= 10;
                                        var228++;
                                    }
                                    char[] var230 = new char[var228];
                                    var230[0] = '+';
                                    for (int var231 = var228 - 1; var231 > 0; var231--) {
                                        int var232 = var226;
                                        var226 /= 10;
                                        int var233 = var232 - var226 * 10;
                                        if (var233 >= 10) {
                                            var230[var231] = (char) (var233 + 87);
                                        } else {
                                            var230[var231] = (char) (var233 + 48);
                                        }
                                    }
                                    var227 = new String(var230);
                                }
                                var225 = var227;
                            }
                            var222[var223] = var220 + var225;
                            continue;
                        }
                        if (var350 == 4103) {
                            var6--;
                            String var234 = field402[var6];
                            field402[var6++] = var234.toLowerCase();
                            continue;
                        }
                        if (var350 == 4104) {
                            var5--;
                            int var235 = field407[var5];
                            long var236 = ((long) var235 + 11745L) * 86400000L;
                            field411.setTime(new Date(var236));
                            int var238 = field411.get(5);
                            int var239 = field411.get(2);
                            int var240 = field411.get(1);
                            field402[var6++] = var238 + "-" + field412[var239] + "-" + var240;
                            continue;
                        }
                        if (var350 == 4105) {
                            var6 -= 2;
                            String var241 = field402[var6];
                            String var242 = field402[var6 + 1];
                            if (Statics.field461.field51 != null && Statics.field461.field51.field2751) {
                                field402[var6++] = var242;
                                continue;
                            }
                            field402[var6++] = var241;
                            continue;
                        }
                        if (var350 == 4106) {
                            var5--;
                            int var243 = field407[var5];
                            field402[var6++] = Integer.toString(var243);
                            continue;
                        }
                        if (var350 == 4107) {
                            var6 -= 2;
                            int[] var244 = field407;
                            int var245 = var5++;
                            int var246 = class151.method3297(field402[var6], field402[var6 + 1], client.field572);
                            byte var247;
                            if (var246 > 0) {
                                var247 = 1;
                            } else if (var246 < 0) {
                                var247 = -1;
                            } else {
                                var247 = 0;
                            }
                            var244[var245] = var247;
                            continue;
                        }
                        if (var350 == 4108) {
                            var6--;
                            String var248 = field402[var6];
                            var5 -= 2;
                            int var249 = field407[var5];
                            int var250 = field407[var5 + 1];
                            byte[] var251 = Statics.field1500.method3080(var250, 0);
                            class183 var252 = new class183(var251);
                            field407[var5++] = var252.method3436(var248, var249);
                            continue;
                        }
                        if (var350 == 4109) {
                            var6--;
                            String var253 = field402[var6];
                            var5 -= 2;
                            int var254 = field407[var5];
                            int var255 = field407[var5 + 1];
                            byte[] var256 = Statics.field1500.method3080(var255, 0);
                            class183 var257 = new class183(var256);
                            field407[var5++] = var257.method3465(var253, var254);
                            continue;
                        }
                        if (var350 == 4110) {
                            var6 -= 2;
                            String var258 = field402[var6];
                            String var259 = field402[var6 + 1];
                            var5--;
                            if (field407[var5] == 1) {
                                field402[var6++] = var258;
                            } else {
                                field402[var6++] = var259;
                            }
                            continue;
                        }
                        if (var350 == 4111) {
                            var6--;
                            String var260 = field402[var6];
                            field402[var6++] = class185.method3441(var260);
                            continue;
                        }
                        if (var350 == 4112) {
                            var6--;
                            String var261 = field402[var6];
                            var5--;
                            int var262 = field407[var5];
                            field402[var6++] = var261 + (char) var262;
                            continue;
                        }
                        if (var350 == 4113) {
                            var5--;
                            int var263 = field407[var5];
                            int[] var264 = field407;
                            int var265 = var5++;
                            char var266 = (char) var263;
                            boolean var267;
                            if (var266 >= ' ' && var266 <= '~') {
                                var267 = true;
                            } else if (var266 >= 160 && var266 <= 255) {
                                var267 = true;
                            } else if (var266 == 8364 || var266 == 338 || var266 == 8212 || var266 == 339 || var266 == 376) {
                                var267 = true;
                            } else {
                                var267 = false;
                            }
                            var264[var265] = var267 ? 1 : 0;
                            continue;
                        }
                        if (var350 == 4114) {
                            var5--;
                            int var268 = field407[var5];
                            field407[var5++] = class148.method1420((char) var268) ? 1 : 0;
                            continue;
                        }
                        if (var350 == 4115) {
                            var5--;
                            int var269 = field407[var5];
                            int[] var270 = field407;
                            int var271 = var5++;
                            char var272 = (char) var269;
                            boolean var273 = var272 >= 'A' && var272 <= 'Z' || var272 >= 'a' && var272 <= 'z';
                            var270[var271] = var273 ? 1 : 0;
                            continue;
                        }
                        if (var350 == 4116) {
                            var5--;
                            int var274 = field407[var5];
                            int[] var275 = field407;
                            int var276 = var5++;
                            char var277 = (char) var274;
                            boolean var278 = var277 >= '0' && var277 <= '9';
                            var275[var276] = var278 ? 1 : 0;
                            continue;
                        }
                        if (var350 == 4117) {
                            var6--;
                            String var279 = field402[var6];
                            if (var279 == null) {
                                field407[var5++] = 0;
                            } else {
                                field407[var5++] = var279.length();
                            }
                            continue;
                        }
                        if (var350 == 4118) {
                            var6--;
                            String var280 = field402[var6];
                            var5 -= 2;
                            int var281 = field407[var5];
                            int var282 = field407[var5 + 1];
                            field402[var6++] = var280.substring(var281, var282);
                            continue;
                        }
                        if (var350 == 4119) {
                            var6--;
                            String var283 = field402[var6];
                            StringBuilder var284 = new StringBuilder(var283.length());
                            boolean var285 = false;
                            for (int var286 = 0; var286 < var283.length(); var286++) {
                                char var287 = var283.charAt(var286);
                                if (var287 == '<') {
                                    var285 = true;
                                } else if (var287 == '>') {
                                    var285 = false;
                                } else if (!var285) {
                                    var284.append(var287);
                                }
                            }
                            field402[var6++] = var284.toString();
                            continue;
                        }
                        if (var350 == 4120) {
                            var6--;
                            String var288 = field402[var6];
                            var5--;
                            int var289 = field407[var5];
                            field407[var5++] = var288.indexOf(var289);
                            continue;
                        }
                    } else if (var350 < 4300) {
                        if (var350 == 4200) {
                            var5--;
                            int var290 = field407[var5];
                            field402[var6++] = class40.method1333(var290).field989;
                            continue;
                        }
                        if (var350 == 4201) {
                            var5 -= 2;
                            int var291 = field407[var5];
                            int var292 = field407[var5 + 1];
                            class40 var293 = class40.method1333(var291);
                            if (var292 >= 1 && var292 <= 5 && var293.field1003[var292 - 1] != null) {
                                field402[var6++] = var293.field1003[var292 - 1];
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var350 == 4202) {
                            var5 -= 2;
                            int var294 = field407[var5];
                            int var295 = field407[var5 + 1];
                            class40 var296 = class40.method1333(var294);
                            if (var295 >= 1 && var295 <= 5 && var296.field1014[var295 - 1] != null) {
                                field402[var6++] = var296.field1014[var295 - 1];
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var350 == 4203) {
                            var5--;
                            int var297 = field407[var5];
                            field407[var5++] = class40.method1333(var297).field1001;
                            continue;
                        }
                        if (var350 == 4204) {
                            var5--;
                            int var298 = field407[var5];
                            field407[var5++] = class40.method1333(var298).field1016 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var350 == 4205) {
                            var5--;
                            int var299 = field407[var5];
                            class40 var300 = class40.method1333(var299);
                            if (var300.field1004 == -1 && var300.field1011 >= 0) {
                                field407[var5++] = var300.field1011;
                                continue;
                            }
                            field407[var5++] = var299;
                            continue;
                        }
                        if (var350 == 4206) {
                            var5--;
                            int var301 = field407[var5];
                            class40 var302 = class40.method1333(var301);
                            if (var302.field1004 >= 0 && var302.field1011 >= 0) {
                                field407[var5++] = var302.field1011;
                                continue;
                            }
                            field407[var5++] = var301;
                            continue;
                        }
                        if (var350 == 4207) {
                            var5--;
                            int var303 = field407[var5];
                            field407[var5++] = class40.method1333(var303).field1002 ? 1 : 0;
                            continue;
                        }
                    } else if (var350 < 5100) {
                        if (var350 == 5000) {
                            field407[var5++] = client.field701;
                            continue;
                        }
                        if (var350 == 5001) {
                            var5 -= 3;
                            client.field701 = field407[var5];
                            int var304 = field407[var5 + 1];
                            class138[] var305 = class138.method236();
                            int var306 = 0;
                            class138 var308;
                            while (true) {
                                if (var306 >= var305.length) {
                                    var308 = null;
                                    break;
                                }
                                class138 var307 = var305[var306];
                                if (var307.field2343 == var304) {
                                    var308 = var307;
                                    break;
                                }
                                var306++;
                            }
                            Statics.field1916 = var308;
                            if (Statics.field1916 == null) {
                                Statics.field1916 = class138.field2341;
                            }
                            client.field702 = field407[var5 + 2];
                            client.field605.method2360(83);
                            client.field605.method2485(client.field701);
                            client.field605.method2485(Statics.field1916.field2343);
                            client.field605.method2485(client.field702);
                            continue;
                        }
                        if (var350 == 5002) {
                            var6--;
                            String var309 = field402[var6];
                            var5 -= 2;
                            int var310 = field407[var5];
                            int var311 = field407[var5 + 1];
                            client.field605.method2360(42);
                            client.field605.method2485(class127.method2082(var309) + 2);
                            client.field605.method2502(var309);
                            client.field605.method2485(var310 - 1);
                            client.field605.method2485(var311);
                            continue;
                        }
                        if (var350 == 5003) {
                            var5--;
                            int var312 = field407[var5];
                            String var313 = null;
                            if (var312 < 100) {
                                var313 = client.field698[var312];
                            }
                            if (var313 == null) {
                                var313 = "";
                            }
                            field402[var6++] = var313;
                            continue;
                        }
                        if (var350 == 5004) {
                            var5--;
                            int var314 = field407[var5];
                            int var315 = -1;
                            if (var314 < 100 && client.field698[var314] != null) {
                                var315 = client.field695[var314];
                            }
                            field407[var5++] = var315;
                            continue;
                        }
                        if (var350 == 5005) {
                            if (Statics.field1916 == null) {
                                field407[var5++] = -1;
                            } else {
                                field407[var5++] = Statics.field1916.field2343;
                            }
                            continue;
                        }
                        if (var350 == 5008) {
                            var6--;
                            String var316 = field402[var6];
                            if (var316.startsWith("::")) {
                                client.method1405(var316.substring(2));
                                continue;
                            }
                            String var317 = var316.toLowerCase();
                            byte var318 = 0;
                            if (var317.startsWith(class135.field2217)) {
                                var318 = 0;
                                var316 = var316.substring(class135.field2217.length());
                            } else if (var317.startsWith(class135.field2290)) {
                                var318 = 1;
                                var316 = var316.substring(class135.field2290.length());
                            } else if (var317.startsWith(class135.field2260)) {
                                var318 = 2;
                                var316 = var316.substring(class135.field2260.length());
                            } else if (var317.startsWith(class135.field2097)) {
                                var318 = 3;
                                var316 = var316.substring(class135.field2097.length());
                            } else if (var317.startsWith(class135.field2264)) {
                                var318 = 4;
                                var316 = var316.substring(class135.field2264.length());
                            } else if (var317.startsWith(class135.field2266)) {
                                var318 = 5;
                                var316 = var316.substring(class135.field2266.length());
                            } else if (var317.startsWith(class135.field2268)) {
                                var318 = 6;
                                var316 = var316.substring(class135.field2268.length());
                            } else if (var317.startsWith(class135.field2270)) {
                                var318 = 7;
                                var316 = var316.substring(class135.field2270.length());
                            } else if (var317.startsWith(class135.field2095)) {
                                var318 = 8;
                                var316 = var316.substring(class135.field2095.length());
                            } else if (var317.startsWith(class135.field2236)) {
                                var318 = 9;
                                var316 = var316.substring(class135.field2236.length());
                            } else if (var317.startsWith(class135.field2250)) {
                                var318 = 10;
                                var316 = var316.substring(class135.field2250.length());
                            } else if (var317.startsWith(class135.field2278)) {
                                var318 = 11;
                                var316 = var316.substring(class135.field2278.length());
                            } else if (client.field572 != 0) {
                                if (var317.startsWith(class135.field2228)) {
                                    var318 = 0;
                                    var316 = var316.substring(class135.field2228.length());
                                } else if (var317.startsWith(class135.field2154)) {
                                    var318 = 1;
                                    var316 = var316.substring(class135.field2154.length());
                                } else if (var317.startsWith(class135.field2261)) {
                                    var318 = 2;
                                    var316 = var316.substring(class135.field2261.length());
                                } else if (var317.startsWith(class135.field2195)) {
                                    var318 = 3;
                                    var316 = var316.substring(class135.field2195.length());
                                } else if (var317.startsWith(class135.field2265)) {
                                    var318 = 4;
                                    var316 = var316.substring(class135.field2265.length());
                                } else if (var317.startsWith(class135.field2267)) {
                                    var318 = 5;
                                    var316 = var316.substring(class135.field2267.length());
                                } else if (var317.startsWith(class135.field2269)) {
                                    var318 = 6;
                                    var316 = var316.substring(class135.field2269.length());
                                } else if (var317.startsWith(class135.field2271)) {
                                    var318 = 7;
                                    var316 = var316.substring(class135.field2271.length());
                                } else if (var317.startsWith(class135.field2273)) {
                                    var318 = 8;
                                    var316 = var316.substring(class135.field2273.length());
                                } else if (var317.startsWith(class135.field2275)) {
                                    var318 = 9;
                                    var316 = var316.substring(class135.field2275.length());
                                } else if (var317.startsWith(class135.field2291)) {
                                    var318 = 10;
                                    var316 = var316.substring(class135.field2291.length());
                                } else if (var317.startsWith(class135.field2279)) {
                                    var318 = 11;
                                    var316 = var316.substring(class135.field2279.length());
                                }
                            }
                            String var319 = var316.toLowerCase();
                            byte var320 = 0;
                            if (var319.startsWith(class135.field2094)) {
                                var320 = 1;
                                var316 = var316.substring(class135.field2094.length());
                            } else if (var319.startsWith(class135.field2282)) {
                                var320 = 2;
                                var316 = var316.substring(class135.field2282.length());
                            } else if (var319.startsWith(class135.field2284)) {
                                var320 = 3;
                                var316 = var316.substring(class135.field2284.length());
                            } else if (var319.startsWith(class135.field2305)) {
                                var320 = 4;
                                var316 = var316.substring(class135.field2305.length());
                            } else if (var319.startsWith(class135.field2288)) {
                                var320 = 5;
                                var316 = var316.substring(class135.field2288.length());
                            } else if (client.field572 != 0) {
                                if (var319.startsWith(class135.field2281)) {
                                    var320 = 1;
                                    var316 = var316.substring(class135.field2281.length());
                                } else if (var319.startsWith(class135.field2240)) {
                                    var320 = 2;
                                    var316 = var316.substring(class135.field2240.length());
                                } else if (var319.startsWith(class135.field2277)) {
                                    var320 = 3;
                                    var316 = var316.substring(class135.field2277.length());
                                } else if (var319.startsWith(class135.field2287)) {
                                    var320 = 4;
                                    var316 = var316.substring(class135.field2287.length());
                                } else if (var319.startsWith(class135.field2289)) {
                                    var320 = 5;
                                    var316 = var316.substring(class135.field2289.length());
                                }
                            }
                            client.field605.method2360(106);
                            client.field605.method2485(0);
                            int var321 = client.field605.field2027;
                            client.field605.method2485(var318);
                            client.field605.method2485(var320);
                            class116 var322 = client.field605;
                            int var323 = var322.field2027;
                            int var324 = var316.length();
                            byte[] var325 = new byte[var324];
                            for (int var326 = 0; var326 < var324; var326++) {
                                char var327 = var316.charAt(var326);
                                if (!(var327 <= 0 || var327 >= 128) || !(var327 < 160 || var327 > 255)) {
                                    var325[var326] = (byte) var327;
                                } else if (var327 == 8364) {
                                    var325[var326] = -128;
                                } else if (var327 == 8218) {
                                    var325[var326] = -126;
                                } else if (var327 == 402) {
                                    var325[var326] = -125;
                                } else if (var327 == 8222) {
                                    var325[var326] = -124;
                                } else if (var327 == 8230) {
                                    var325[var326] = -123;
                                } else if (var327 == 8224) {
                                    var325[var326] = -122;
                                } else if (var327 == 8225) {
                                    var325[var326] = -121;
                                } else if (var327 == 710) {
                                    var325[var326] = -120;
                                } else if (var327 == 8240) {
                                    var325[var326] = -119;
                                } else if (var327 == 352) {
                                    var325[var326] = -118;
                                } else if (var327 == 8249) {
                                    var325[var326] = -117;
                                } else if (var327 == 338) {
                                    var325[var326] = -116;
                                } else if (var327 == 381) {
                                    var325[var326] = -114;
                                } else if (var327 == 8216) {
                                    var325[var326] = -111;
                                } else if (var327 == 8217) {
                                    var325[var326] = -110;
                                } else if (var327 == 8220) {
                                    var325[var326] = -109;
                                } else if (var327 == 8221) {
                                    var325[var326] = -108;
                                } else if (var327 == 8226) {
                                    var325[var326] = -107;
                                } else if (var327 == 8211) {
                                    var325[var326] = -106;
                                } else if (var327 == 8212) {
                                    var325[var326] = -105;
                                } else if (var327 == 732) {
                                    var325[var326] = -104;
                                } else if (var327 == 8482) {
                                    var325[var326] = -103;
                                } else if (var327 == 353) {
                                    var325[var326] = -102;
                                } else if (var327 == 8250) {
                                    var325[var326] = -101;
                                } else if (var327 == 339) {
                                    var325[var326] = -100;
                                } else if (var327 == 382) {
                                    var325[var326] = -98;
                                } else if (var327 == 376) {
                                    var325[var326] = -97;
                                } else {
                                    var325[var326] = 63;
                                }
                            }
                            var322.method2574(var325.length);
                            var322.field2027 += Statics.field2840.method2422(var325, 0, var325.length, var322.field2030, var322.field2027);
                            client.field605.method2496(client.field605.field2027 - var321);
                            continue;
                        }
                        if (var350 == 5009) {
                            var6 -= 2;
                            String var330 = field402[var6];
                            String var331 = field402[var6 + 1];
                            client.field605.method2360(244);
                            client.field605.method2484(0);
                            int var332 = client.field605.field2027;
                            client.field605.method2502(var330);
                            class116 var333 = client.field605;
                            int var334 = var333.field2027;
                            int var335 = var331.length();
                            byte[] var336 = new byte[var335];
                            for (int var337 = 0; var337 < var335; var337++) {
                                char var338 = var331.charAt(var337);
                                if (var338 > 0 && var338 < 128 || var338 >= 160 && var338 <= 255) {
                                    var336[var337] = (byte) var338;
                                } else if (var338 == 8364) {
                                    var336[var337] = -128;
                                } else if (var338 == 8218) {
                                    var336[var337] = -126;
                                } else if (var338 == 402) {
                                    var336[var337] = -125;
                                } else if (var338 == 8222) {
                                    var336[var337] = -124;
                                } else if (var338 == 8230) {
                                    var336[var337] = -123;
                                } else if (var338 == 8224) {
                                    var336[var337] = -122;
                                } else if (var338 == 8225) {
                                    var336[var337] = -121;
                                } else if (var338 == 710) {
                                    var336[var337] = -120;
                                } else if (var338 == 8240) {
                                    var336[var337] = -119;
                                } else if (var338 == 352) {
                                    var336[var337] = -118;
                                } else if (var338 == 8249) {
                                    var336[var337] = -117;
                                } else if (var338 == 338) {
                                    var336[var337] = -116;
                                } else if (var338 == 381) {
                                    var336[var337] = -114;
                                } else if (var338 == 8216) {
                                    var336[var337] = -111;
                                } else if (var338 == 8217) {
                                    var336[var337] = -110;
                                } else if (var338 == 8220) {
                                    var336[var337] = -109;
                                } else if (var338 == 8221) {
                                    var336[var337] = -108;
                                } else if (var338 == 8226) {
                                    var336[var337] = -107;
                                } else if (var338 == 8211) {
                                    var336[var337] = -106;
                                } else if (var338 == 8212) {
                                    var336[var337] = -105;
                                } else if (var338 == 732) {
                                    var336[var337] = -104;
                                } else if (var338 == 8482) {
                                    var336[var337] = -103;
                                } else if (var338 == 353) {
                                    var336[var337] = -102;
                                } else if (var338 == 8250) {
                                    var336[var337] = -101;
                                } else if (var338 == 339) {
                                    var336[var337] = -100;
                                } else if (var338 == 382) {
                                    var336[var337] = -98;
                                } else if (var338 == 376) {
                                    var336[var337] = -97;
                                } else {
                                    var336[var337] = 63;
                                }
                            }
                            var333.method2574(var336.length);
                            var333.field2027 += Statics.field2840.method2422(var336, 0, var336.length, var333.field2030, var333.field2027);
                            client.field605.method2495(client.field605.field2027 - var332);
                            continue;
                        }
                        if (var350 == 5010) {
                            var5--;
                            int var341 = field407[var5];
                            String var342 = null;
                            if (var341 < 100) {
                                var342 = client.field515[var341];
                            }
                            if (var342 == null) {
                                var342 = "";
                            }
                            field402[var6++] = var342;
                            continue;
                        }
                        if (var350 == 5011) {
                            var5--;
                            int var343 = field407[var5];
                            String var344 = null;
                            if (var343 < 100) {
                                var344 = client.field697[var343];
                            }
                            if (var344 == null) {
                                var344 = "";
                            }
                            field402[var6++] = var344;
                            continue;
                        }
                        if (var350 == 5015) {
                            String var345;
                            if (Statics.field461 == null || Statics.field461.field45 == null) {
                                var345 = "";
                            } else {
                                var345 = Statics.field461.field45;
                            }
                            field402[var6++] = var345;
                            continue;
                        }
                        if (var350 == 5016) {
                            field407[var5++] = client.field702;
                            continue;
                        }
                        if (var350 == 5017) {
                            field407[var5++] = client.field699;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var349) {
            StringBuilder var347 = new StringBuilder(30);
            var347.append("").append(var4.field2823).append(" ");
            for (int var348 = field404 - 1; var348 >= 0; var348--) {
                var347.append("").append(field409[var348].field281.field2823).append(" ");
            }
            var347.append("").append(var10);
            class80.method1330(var347.toString(), var349);
        }
    }

    @ObfuscatedName("dk.s(II)V")
    public static void method2395(int arg0) {
        if (arg0 == -1 || !class159.method687(arg0)) {
            return;
        }
        class159[] var1 = Statics.field2641[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3.field2645 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field13 = var3.field2645;
                method61(var4, 2000000);
            }
        }
    }
}
