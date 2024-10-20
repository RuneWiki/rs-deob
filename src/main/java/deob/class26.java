package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("i")
public class class26 {

    @ObfuscatedName("i.m")
    public static int[] field395 = new int[5];

    @ObfuscatedName("i.k")
    public static int[][] field396 = new int[5][5000];

    @ObfuscatedName("i.v")
    public static int[] field404 = new int[1000];

    @ObfuscatedName("i.y")
    public static String[] field393 = new String[1000];

    @ObfuscatedName("i.d")
    public static int field399 = 0;

    @ObfuscatedName("i.l")
    public static class18[] field400 = new class18[50];

    @ObfuscatedName("i.r")
    public static Calendar field406 = Calendar.getInstance();

    @ObfuscatedName("i.t")
    public static final String[] field402 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.q(Lq;I)V")
    public static void method173(class1 arg0) {
        method53(arg0, 200000);
    }

    @ObfuscatedName("y.c(Lq;IB)V")
    public static void method53(class1 arg0, int arg1) {
        Object[] var2 = arg0.field9;
        int var3 = (Integer) var2[0];
        class5 var4 = class5.method636(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field67;
        int[] var9 = var4.field64;
        byte var10 = -1;
        field399 = 0;
        try {
            Statics.field1759 = new int[var4.field63];
            int var11 = 0;
            Statics.field394 = new String[var4.field78];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field14;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2686;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2611;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field8 == null ? -1 : arg0.field8.field2686;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field8 == null ? -1 : arg0.field8.field2611;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field7;
                    }
                    Statics.field1759[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field394[var12++] = var15;
                }
            }
            int var16 = 0;
            label2392: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var386 = var8[var7];
                if (var386 < 100) {
                    if (var386 == 0) {
                        field404[var5++] = var9[var7];
                        continue;
                    }
                    if (var386 == 1) {
                        int var17 = var9[var7];
                        field404[var5++] = class160.field2731[var17];
                        continue;
                    }
                    if (var386 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class160.field2731[var18] = field404[var5];
                        client.method796(var18);
                        continue;
                    }
                    if (var386 == 3) {
                        field393[var6++] = var4.field65[var7];
                        continue;
                    }
                    if (var386 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var386 == 7) {
                        var5 -= 2;
                        if (field404[var5 + 1] != field404[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var386 == 8) {
                        var5 -= 2;
                        if (field404[var5 + 1] == field404[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var386 == 9) {
                        var5 -= 2;
                        if (field404[var5] < field404[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var386 == 10) {
                        var5 -= 2;
                        if (field404[var5] > field404[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var386 == 21) {
                        if (field399 == 0) {
                            return;
                        }
                        class18 var19 = field400[--field399];
                        var4 = var19.field267;
                        var8 = var4.field67;
                        var9 = var4.field64;
                        var7 = var19.field269;
                        Statics.field1759 = var19.field270;
                        Statics.field394 = var19.field264;
                        continue;
                    }
                    if (var386 == 25) {
                        int var20 = var9[var7];
                        field404[var5++] = class160.method2965(var20);
                        continue;
                    }
                    if (var386 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field404[var5];
                        class38 var23 = (class38) class38.field948.method3215((long) var21);
                        class38 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field955.method2952(14, var21);
                            class38 var26 = new class38();
                            if (var25 != null) {
                                var26.method800(new class127(var25));
                            }
                            class38.field948.method3225(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field957;
                        int var29 = var24.field950;
                        int var30 = var24.field951;
                        int var31 = class160.field2732[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class160.field2731[var28] = class160.field2731[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var386 == 31) {
                        var5 -= 2;
                        if (field404[var5] <= field404[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var386 == 32) {
                        var5 -= 2;
                        if (field404[var5] >= field404[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var386 == 33) {
                        field404[var5++] = Statics.field1759[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var386 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1759[var10001] = field404[var5];
                        continue;
                    }
                    if (var386 == 35) {
                        field393[var6++] = Statics.field394[var9[var7]];
                        continue;
                    }
                    if (var386 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field394[var10001] = field393[var6];
                        continue;
                    }
                    if (var386 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class148.method635(field393, var6, var33);
                        field393[var6++] = var34;
                        continue;
                    }
                    if (var386 == 38) {
                        var5--;
                        continue;
                    }
                    if (var386 == 39) {
                        var6--;
                        continue;
                    }
                    if (var386 == 40) {
                        int var35 = var9[var7];
                        class5 var36 = class5.method636(var35);
                        int[] var37 = new int[var36.field63];
                        String[] var38 = new String[var36.field78];
                        for (int var39 = 0; var39 < var36.field73; var39++) {
                            var37[var39] = field404[var5 - var36.field73 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field69; var40++) {
                            var38[var40] = field393[var6 - var36.field69 + var40];
                        }
                        var5 -= var36.field73;
                        var6 -= var36.field69;
                        class18 var41 = new class18();
                        var41.field267 = var4;
                        var41.field269 = var7;
                        var41.field270 = Statics.field1759;
                        var41.field264 = Statics.field394;
                        field400[++field399 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field67;
                        var9 = var36.field64;
                        var7 = -1;
                        Statics.field1759 = var37;
                        Statics.field394 = var38;
                        continue;
                    }
                    if (var386 == 42) {
                        field404[var5++] = client.field664[var9[var7]];
                        continue;
                    }
                    if (var386 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field664[var10001] = field404[var5];
                        continue;
                    }
                    if (var386 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field404[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field395[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label2392;
                                }
                                field396[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var386 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field404[var5];
                        if (var48 >= 0 && var48 < field395[var47]) {
                            field404[var5++] = field396[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var386 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field404[var5];
                        if (var50 >= 0 && var50 < field395[var49]) {
                            field396[var49][var50] = field404[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var386 == 47) {
                        String var51 = client.field571[var9[var7]];
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field393[var6++] = var51;
                        continue;
                    }
                    if (var386 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field571[var10001] = field393[var6];
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var386 < 1000) {
                    if (var386 == 100) {
                        var5 -= 3;
                        int var53 = field404[var5];
                        int var54 = field404[var5 + 1];
                        int var55 = field404[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class159 var56 = class159.method145(var53);
                        if (var56.field2718 == null) {
                            var56.field2718 = new class159[var55 + 1];
                        }
                        if (var56.field2718.length <= var55) {
                            class159[] var57 = new class159[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2718.length; var58++) {
                                var57[var58] = var56.field2718[var58];
                            }
                            var56.field2718 = var57;
                        }
                        if (var55 > 0 && var56.field2718[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class159 var59 = new class159();
                        var59.field2612 = var54;
                        var59.field2670 = var59.field2686 = var56.field2686;
                        var59.field2611 = var55;
                        var59.field2694 = true;
                        var56.field2718[var55] = var59;
                        if (var52) {
                            Statics.field738 = var59;
                        } else {
                            Statics.field397 = var59;
                        }
                        client.method2291(var56);
                        continue;
                    }
                    if (var386 == 101) {
                        class159 var60 = var52 ? Statics.field738 : Statics.field397;
                        class159 var61 = class159.method145(var60.field2686);
                        var61.field2718[var60.field2611] = null;
                        client.method2291(var61);
                        continue;
                    }
                    if (var386 == 102) {
                        var5--;
                        class159 var62 = class159.method145(field404[var5]);
                        var62.field2718 = null;
                        client.method2291(var62);
                        continue;
                    }
                    if (var386 == 200) {
                        var5 -= 2;
                        int var63 = field404[var5];
                        int var64 = field404[var5 + 1];
                        class159 var65 = class159.method32(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field404[var5++] = 1;
                            if (var52) {
                                Statics.field738 = var65;
                            } else {
                                Statics.field397 = var65;
                            }
                            continue;
                        }
                        field404[var5++] = 0;
                        continue;
                    }
                } else if (var386 >= 1000 && var386 < 1100 || var386 >= 2000 && var386 < 2100) {
                    class159 var66;
                    if (var386 >= 2000) {
                        var386 -= 1000;
                        var5--;
                        var66 = class159.method145(field404[var5]);
                    } else {
                        var66 = var52 ? Statics.field738 : Statics.field397;
                    }
                    if (var386 == 1000) {
                        var5 -= 2;
                        var66.field2615 = field404[var5];
                        var66.field2616 = field404[var5 + 1];
                        client.method2291(var66);
                        continue;
                    }
                    if (var386 == 1001) {
                        var5 -= 2;
                        var66.field2619 = field404[var5];
                        var66.field2620 = field404[var5 + 1];
                        client.method2291(var66);
                        continue;
                    }
                    if (var386 == 1003) {
                        var5--;
                        boolean var67 = field404[var5] == 1;
                        if (var66.field2622 != var67) {
                            var66.field2622 = var67;
                            client.method2291(var66);
                        }
                        continue;
                    }
                } else if (!(var386 < 1100 || var386 >= 1200) || !(var386 < 2100 || var386 >= 2200)) {
                    class159 var68;
                    if (var386 >= 2000) {
                        var386 -= 1000;
                        var5--;
                        var68 = class159.method145(field404[var5]);
                    } else {
                        var68 = var52 ? Statics.field738 : Statics.field397;
                    }
                    if (var386 == 1100) {
                        var5 -= 2;
                        var68.field2617 = field404[var5];
                        if (var68.field2617 > var68.field2625 - var68.field2619) {
                            var68.field2617 = var68.field2625 - var68.field2619;
                        }
                        if (var68.field2617 < 0) {
                            var68.field2617 = 0;
                        }
                        var68.field2624 = field404[var5 + 1];
                        if (var68.field2624 > var68.field2626 - var68.field2620) {
                            var68.field2624 = var68.field2626 - var68.field2620;
                        }
                        if (var68.field2624 < 0) {
                            var68.field2624 = 0;
                        }
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1101) {
                        var5--;
                        var68.field2627 = field404[var5];
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1102) {
                        var5--;
                        var68.field2631 = field404[var5] == 1;
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1103) {
                        var5--;
                        var68.field2632 = field404[var5];
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1104) {
                        var5--;
                        var68.field2633 = field404[var5];
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1105) {
                        var5--;
                        var68.field2634 = field404[var5];
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1106) {
                        var5--;
                        var68.field2672 = field404[var5];
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1107) {
                        var5--;
                        var68.field2637 = field404[var5] == 1;
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1108) {
                        var68.field2721 = 1;
                        var5--;
                        var68.field2643 = field404[var5];
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1109) {
                        var5 -= 6;
                        var68.field2648 = field404[var5];
                        var68.field2649 = field404[var5 + 1];
                        var68.field2628 = field404[var5 + 2];
                        var68.field2651 = field404[var5 + 3];
                        var68.field2652 = field404[var5 + 4];
                        var68.field2653 = field404[var5 + 5];
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1110) {
                        var5--;
                        int var69 = field404[var5];
                        if (var68.field2726 != var69) {
                            var68.field2726 = var69;
                            var68.field2716 = 0;
                            var68.field2710 = 0;
                            client.method2291(var68);
                        }
                        continue;
                    }
                    if (var386 == 1111) {
                        var5--;
                        var68.field2655 = field404[var5] == 1;
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1112) {
                        var6--;
                        String var70 = field393[var6];
                        if (!var70.equals(var68.field2657)) {
                            var68.field2657 = var70;
                            client.method2291(var68);
                        }
                        continue;
                    }
                    if (var386 == 1113) {
                        var5--;
                        var68.field2656 = field404[var5];
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1114) {
                        var5 -= 3;
                        var68.field2609 = field404[var5];
                        var68.field2661 = field404[var5 + 1];
                        var68.field2659 = field404[var5 + 2];
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1115) {
                        var5--;
                        var68.field2662 = field404[var5] == 1;
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1116) {
                        var5--;
                        var68.field2638 = field404[var5];
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1117) {
                        var5--;
                        var68.field2671 = field404[var5];
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1118) {
                        var5--;
                        var68.field2675 = field404[var5] == 1;
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1119) {
                        var5--;
                        var68.field2703 = field404[var5] == 1;
                        client.method2291(var68);
                        continue;
                    }
                    if (var386 == 1120) {
                        var5 -= 2;
                        var68.field2625 = field404[var5];
                        var68.field2626 = field404[var5 + 1];
                        client.method2291(var68);
                        continue;
                    }
                } else if (var386 >= 1200 && var386 < 1300 || var386 >= 2200 && var386 < 2300) {
                    class159 var71;
                    if (var386 >= 2000) {
                        var386 -= 1000;
                        var5--;
                        var71 = class159.method145(field404[var5]);
                    } else {
                        var71 = var52 ? Statics.field738 : Statics.field397;
                    }
                    client.method2291(var71);
                    if (var386 == 1200) {
                        var5 -= 2;
                        int var72 = field404[var5];
                        int var73 = field404[var5 + 1];
                        var71.field2714 = var72;
                        var71.field2641 = var73;
                        class40 var74 = class40.method782(var72);
                        var71.field2628 = var74.field988;
                        var71.field2651 = var74.field989;
                        var71.field2652 = var74.field990;
                        var71.field2648 = var74.field991;
                        var71.field2649 = var74.field992;
                        var71.field2653 = var74.field1001;
                        if (var71.field2619 > 0) {
                            var71.field2653 = var71.field2653 * 32 / var71.field2619;
                        }
                        continue;
                    }
                    if (var386 == 1201) {
                        var71.field2721 = 2;
                        var5--;
                        var71.field2643 = field404[var5];
                        continue;
                    }
                    if (var386 == 1202) {
                        var71.field2721 = 3;
                        var71.field2643 = Statics.field2728.field34.method3173();
                        continue;
                    }
                } else if ((var386 < 1300 || var386 >= 1400) && (var386 < 2300 || var386 >= 2400)) {
                    if (var386 >= 1400 && var386 < 1500 || var386 >= 2400 && var386 < 2500) {
                        class159 var79;
                        if (var386 >= 2000) {
                            var386 -= 1000;
                            var5--;
                            var79 = class159.method145(field404[var5]);
                        } else {
                            var79 = var52 ? Statics.field738 : Statics.field397;
                        }
                        var6--;
                        String var80 = field393[var6];
                        int[] var81 = null;
                        if (var80.length() > 0 && var80.charAt(var80.length() - 1) == 'Y') {
                            var5--;
                            int var82 = field404[var5];
                            if (var82 > 0) {
                                var81 = new int[var82];
                                while (var82-- > 0) {
                                    var5--;
                                    var81[var82] = field404[var5];
                                }
                            }
                            var80 = var80.substring(0, var80.length() - 1);
                        }
                        Object[] var83 = new Object[var80.length() + 1];
                        for (int var84 = var83.length - 1; var84 >= 1; var84--) {
                            if (var80.charAt(var84 - 1) == 's') {
                                var6--;
                                var83[var84] = field393[var6];
                            } else {
                                var5--;
                                var83[var84] = Integer.valueOf(field404[var5]);
                            }
                        }
                        var5--;
                        int var85 = field404[var5];
                        if (var85 == -1) {
                            var83 = null;
                        } else {
                            var83[0] = Integer.valueOf(var85);
                        }
                        if (var386 == 1400) {
                            var79.field2650 = var83;
                        }
                        if (var386 == 1401) {
                            var79.field2682 = var83;
                        }
                        if (var386 == 1402) {
                            var79.field2681 = var83;
                        }
                        if (var386 == 1403) {
                            var79.field2683 = var83;
                        }
                        if (var386 == 1404) {
                            var79.field2685 = var83;
                        }
                        if (var386 == 1405) {
                            var79.field2690 = var83;
                        }
                        if (var386 == 1406) {
                            var79.field2689 = var83;
                        }
                        if (var386 == 1407) {
                            var79.field2701 = var83;
                            var79.field2691 = var81;
                        }
                        if (var386 == 1408) {
                            var79.field2696 = var83;
                        }
                        if (var386 == 1409) {
                            var79.field2697 = var83;
                        }
                        if (var386 == 1410) {
                            var79.field2713 = var83;
                        }
                        if (var386 == 1411) {
                            var79.field2680 = var83;
                        }
                        if (var386 == 1412) {
                            var79.field2722 = var83;
                        }
                        if (var386 == 1414) {
                            var79.field2647 = var83;
                            var79.field2693 = var81;
                        }
                        if (var386 == 1415) {
                            var79.field2717 = var83;
                            var79.field2712 = var81;
                        }
                        if (var386 == 1416) {
                            var79.field2688 = var83;
                        }
                        if (var386 == 1417) {
                            var79.field2698 = var83;
                        }
                        if (var386 == 1418) {
                            var79.field2699 = var83;
                        }
                        if (var386 == 1419) {
                            var79.field2700 = var83;
                        }
                        if (var386 == 1420) {
                            var79.field2639 = var83;
                        }
                        if (var386 == 1421) {
                            var79.field2702 = var83;
                        }
                        if (var386 == 1422) {
                            var79.field2642 = var83;
                        }
                        if (var386 == 1423) {
                            var79.field2704 = var83;
                        }
                        if (var386 == 1424) {
                            var79.field2705 = var83;
                        }
                        var79.field2677 = true;
                        continue;
                    }
                    if (var386 < 1600) {
                        class159 var86 = var52 ? Statics.field738 : Statics.field397;
                        if (var386 == 1500) {
                            field404[var5++] = var86.field2615;
                            continue;
                        }
                        if (var386 == 1501) {
                            field404[var5++] = var86.field2616;
                            continue;
                        }
                        if (var386 == 1502) {
                            field404[var5++] = var86.field2619;
                            continue;
                        }
                        if (var386 == 1503) {
                            field404[var5++] = var86.field2620;
                            continue;
                        }
                        if (var386 == 1504) {
                            field404[var5++] = var86.field2622 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 1505) {
                            field404[var5++] = var86.field2670;
                            continue;
                        }
                    } else if (var386 < 1700) {
                        class159 var87 = var52 ? Statics.field738 : Statics.field397;
                        if (var386 == 1600) {
                            field404[var5++] = var87.field2617;
                            continue;
                        }
                        if (var386 == 1601) {
                            field404[var5++] = var87.field2624;
                            continue;
                        }
                        if (var386 == 1602) {
                            field393[var6++] = var87.field2657;
                            continue;
                        }
                        if (var386 == 1603) {
                            field404[var5++] = var87.field2625;
                            continue;
                        }
                        if (var386 == 1604) {
                            field404[var5++] = var87.field2626;
                            continue;
                        }
                        if (var386 == 1605) {
                            field404[var5++] = var87.field2653;
                            continue;
                        }
                        if (var386 == 1606) {
                            field404[var5++] = var87.field2628;
                            continue;
                        }
                        if (var386 == 1607) {
                            field404[var5++] = var87.field2652;
                            continue;
                        }
                        if (var386 == 1608) {
                            field404[var5++] = var87.field2651;
                            continue;
                        }
                    } else if (var386 < 1800) {
                        class159 var88 = var52 ? Statics.field738 : Statics.field397;
                        if (var386 == 1700) {
                            field404[var5++] = var88.field2714;
                            continue;
                        }
                        if (var386 == 1701) {
                            if (var88.field2714 == -1) {
                                field404[var5++] = 0;
                            } else {
                                field404[var5++] = var88.field2641;
                            }
                            continue;
                        }
                        if (var386 == 1702) {
                            field404[var5++] = var88.field2611;
                            continue;
                        }
                    } else if (var386 < 1900) {
                        class159 var89 = var52 ? Statics.field738 : Statics.field397;
                        if (var386 == 1800) {
                            field404[var5++] = class163.method759(client.method1436(var89));
                            continue;
                        }
                        if (var386 == 1801) {
                            var5--;
                            int var90 = field404[var5];
                            int var387 = var90 - 1;
                            if (var89.field2646 != null && var387 < var89.field2646.length && var89.field2646[var387] != null) {
                                field393[var6++] = var89.field2646[var387];
                                continue;
                            }
                            field393[var6++] = "";
                            continue;
                        }
                        if (var386 == 1802) {
                            if (var89.field2601 == null) {
                                field393[var6++] = "";
                            } else {
                                field393[var6++] = var89.field2601;
                            }
                            continue;
                        }
                    } else if (var386 < 2600) {
                        var5--;
                        class159 var91 = class159.method145(field404[var5]);
                        if (var386 == 2500) {
                            field404[var5++] = var91.field2615;
                            continue;
                        }
                        if (var386 == 2501) {
                            field404[var5++] = var91.field2616;
                            continue;
                        }
                        if (var386 == 2502) {
                            field404[var5++] = var91.field2619;
                            continue;
                        }
                        if (var386 == 2503) {
                            field404[var5++] = var91.field2620;
                            continue;
                        }
                        if (var386 == 2504) {
                            field404[var5++] = var91.field2622 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 2505) {
                            field404[var5++] = var91.field2670;
                            continue;
                        }
                    } else if (var386 < 2700) {
                        var5--;
                        class159 var92 = class159.method145(field404[var5]);
                        if (var386 == 2600) {
                            field404[var5++] = var92.field2617;
                            continue;
                        }
                        if (var386 == 2601) {
                            field404[var5++] = var92.field2624;
                            continue;
                        }
                        if (var386 == 2602) {
                            field393[var6++] = var92.field2657;
                            continue;
                        }
                        if (var386 == 2603) {
                            field404[var5++] = var92.field2625;
                            continue;
                        }
                        if (var386 == 2604) {
                            field404[var5++] = var92.field2626;
                            continue;
                        }
                        if (var386 == 2605) {
                            field404[var5++] = var92.field2653;
                            continue;
                        }
                        if (var386 == 2606) {
                            field404[var5++] = var92.field2628;
                            continue;
                        }
                        if (var386 == 2607) {
                            field404[var5++] = var92.field2652;
                            continue;
                        }
                        if (var386 == 2608) {
                            field404[var5++] = var92.field2651;
                            continue;
                        }
                    } else if (var386 < 2800) {
                        if (var386 == 2700) {
                            var5--;
                            class159 var93 = class159.method145(field404[var5]);
                            field404[var5++] = var93.field2714;
                            continue;
                        }
                        if (var386 == 2701) {
                            var5--;
                            class159 var94 = class159.method145(field404[var5]);
                            if (var94.field2714 == -1) {
                                field404[var5++] = 0;
                            } else {
                                field404[var5++] = var94.field2641;
                            }
                            continue;
                        }
                        if (var386 == 2702) {
                            var5--;
                            int var95 = field404[var5];
                            class4 var96 = (class4) client.field631.method3260((long) var95);
                            if (var96 == null) {
                                field404[var5++] = 0;
                            } else {
                                field404[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var386 < 2900) {
                        var5--;
                        class159 var97 = class159.method145(field404[var5]);
                        if (var386 == 2800) {
                            field404[var5++] = class163.method759(client.method1436(var97));
                            continue;
                        }
                        if (var386 == 2801) {
                            var5--;
                            int var98 = field404[var5];
                            int var388 = var98 - 1;
                            if (var97.field2646 != null && var388 < var97.field2646.length && var97.field2646[var388] != null) {
                                field393[var6++] = var97.field2646[var388];
                                continue;
                            }
                            field393[var6++] = "";
                            continue;
                        }
                        if (var386 == 2802) {
                            if (var97.field2601 == null) {
                                field393[var6++] = "";
                            } else {
                                field393[var6++] = var97.field2601;
                            }
                            continue;
                        }
                    } else if (var386 < 3200) {
                        if (var386 == 3100) {
                            var6--;
                            String var99 = field393[var6];
                            client.method2666(0, "", var99);
                            continue;
                        }
                        if (var386 == 3101) {
                            var5 -= 2;
                            client.method2407(Statics.field2728, field404[var5], field404[var5 + 1]);
                            continue;
                        }
                        if (var386 == 3103) {
                            client.field594.method2300(44);
                            for (class4 var100 = (class4) client.field631.method3262(); var100 != null; var100 = (class4) client.field631.method3265()) {
                                if (var100.field52 == 0 || var100.field52 == 3) {
                                    client.method560(var100, true);
                                }
                            }
                            if (client.field634 != null) {
                                client.method2291(client.field634);
                                client.field634 = null;
                            }
                            continue;
                        }
                        if (var386 == 3104) {
                            var6--;
                            String var101 = field393[var6];
                            int var102 = 0;
                            if (class148.method689(var101)) {
                                var102 = class148.method1367(var101);
                            }
                            client.field594.method2300(240);
                            client.field594.method2414(var102);
                            continue;
                        }
                        if (var386 == 3105) {
                            var6--;
                            String var103 = field393[var6];
                            client.field594.method2300(155);
                            client.field594.method2411(var103.length() + 1);
                            client.field594.method2416(var103);
                            continue;
                        }
                        if (var386 == 3106) {
                            var6--;
                            String var104 = field393[var6];
                            client.field594.method2300(243);
                            client.field594.method2411(var104.length() + 1);
                            client.field594.method2416(var104);
                            continue;
                        }
                        if (var386 == 3107) {
                            var5--;
                            int var105 = field404[var5];
                            var6--;
                            String var106 = field393[var6];
                            client.method49(var105, var106);
                            continue;
                        }
                        if (var386 == 3108) {
                            var5 -= 3;
                            int var107 = field404[var5];
                            int var108 = field404[var5 + 1];
                            int var109 = field404[var5 + 2];
                            class159 var110 = class159.method145(var109);
                            Statics.method215(var110, var107, var108);
                            continue;
                        }
                        if (var386 == 3109) {
                            var5 -= 2;
                            int var111 = field404[var5];
                            int var112 = field404[var5 + 1];
                            class159 var113 = var52 ? Statics.field738 : Statics.field397;
                            Statics.method215(var113, var111, var112);
                            continue;
                        }
                        if (var386 == 3110) {
                            var5--;
                            Statics.field752 = field404[var5] == 1;
                            continue;
                        }
                    } else if (var386 < 3300) {
                        if (var386 == 3200) {
                            var5 -= 3;
                            int var114 = field404[var5];
                            int var115 = field404[var5 + 1];
                            int var116 = field404[var5 + 2];
                            if (client.field709 != 0 && var115 != 0 && client.field711 < 50) {
                                client.field590[client.field711] = var114;
                                client.field713[client.field711] = var115;
                                client.field542[client.field711] = var116;
                                client.field507[client.field711] = null;
                                client.field715[client.field711] = 0;
                                client.field711++;
                            }
                            continue;
                        }
                        if (var386 == 3201) {
                            var5--;
                            client.method2669(field404[var5]);
                            continue;
                        }
                        if (var386 == 3202) {
                            var5 -= 2;
                            int var117 = field404[var5];
                            int var10000 = field404[var5 + 1];
                            if (client.field706 != 0 && var117 != -1) {
                                class139.method2160(Statics.field255, var117, 0, client.field706, false);
                                client.field708 = true;
                            }
                            continue;
                        }
                    } else if (var386 < 3400) {
                        if (var386 == 3300) {
                            field404[var5++] = client.field479;
                            continue;
                        }
                        if (var386 == 3301) {
                            var5 -= 2;
                            int var119 = field404[var5];
                            int var120 = field404[var5 + 1];
                            field404[var5++] = class19.method1853(var119, var120);
                            continue;
                        }
                        if (var386 == 3302) {
                            var5 -= 2;
                            int var121 = field404[var5];
                            int var122 = field404[var5 + 1];
                            int[] var123 = field404;
                            int var124 = var5++;
                            class19 var125 = (class19) class19.field279.method3260((long) var121);
                            int var126;
                            if (var125 == null) {
                                var126 = 0;
                            } else if (var122 >= 0 && var122 < var125.field281.length) {
                                var126 = var125.field281[var122];
                            } else {
                                var126 = 0;
                            }
                            var123[var124] = var126;
                            continue;
                        }
                        if (var386 == 3303) {
                            var5 -= 2;
                            int var127 = field404[var5];
                            int var128 = field404[var5 + 1];
                            field404[var5++] = class19.method2097(var127, var128);
                            continue;
                        }
                        if (var386 == 3304) {
                            var5--;
                            int var129 = field404[var5];
                            int[] var130 = field404;
                            int var131 = var5++;
                            class41 var132 = (class41) class41.field1022.method3215((long) var129);
                            class41 var133;
                            if (var132 == null) {
                                byte[] var134 = Statics.field1021.method2952(5, var129);
                                class41 var135 = new class41();
                                if (var134 != null) {
                                    var135.method878(new class127(var134));
                                }
                                class41.field1022.method3225(var135, (long) var129);
                                var133 = var135;
                            } else {
                                var133 = var132;
                            }
                            var130[var131] = var133.field1027;
                            continue;
                        }
                        if (var386 == 3305) {
                            var5--;
                            int var136 = field404[var5];
                            field404[var5++] = client.field608[var136];
                            continue;
                        }
                        if (var386 == 3306) {
                            var5--;
                            int var137 = field404[var5];
                            field404[var5++] = client.field609[var137];
                            continue;
                        }
                        if (var386 == 3307) {
                            var5--;
                            int var138 = field404[var5];
                            field404[var5++] = client.field649[var138];
                            continue;
                        }
                        if (var386 == 3308) {
                            int var139 = Statics.field2104;
                            int var140 = (Statics.field2728.field467 >> 7) + Statics.field920;
                            int var141 = (Statics.field2728.field409 >> 7) + Statics.field1822;
                            field404[var5++] = (var139 << 28) + (var140 << 14) + var141;
                            continue;
                        }
                        if (var386 == 3309) {
                            var5--;
                            int var142 = field404[var5];
                            field404[var5++] = var142 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var386 == 3310) {
                            var5--;
                            int var143 = field404[var5];
                            field404[var5++] = var143 >> 28;
                            continue;
                        }
                        if (var386 == 3311) {
                            var5--;
                            int var144 = field404[var5];
                            field404[var5++] = var144 & 0x3FFF;
                            continue;
                        }
                        if (var386 == 3312) {
                            field404[var5++] = client.field474 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 3313) {
                            var5 -= 2;
                            int var145 = field404[var5] + 32768;
                            int var146 = field404[var5 + 1];
                            field404[var5++] = class19.method1853(var145, var146);
                            continue;
                        }
                        if (var386 == 3314) {
                            var5 -= 2;
                            int var147 = field404[var5] + 32768;
                            int var148 = field404[var5 + 1];
                            int[] var149 = field404;
                            int var150 = var5++;
                            class19 var151 = (class19) class19.field279.method3260((long) var147);
                            int var152;
                            if (var151 == null) {
                                var152 = 0;
                            } else if (var148 >= 0 && var148 < var151.field281.length) {
                                var152 = var151.field281[var148];
                            } else {
                                var152 = 0;
                            }
                            var149[var150] = var152;
                            continue;
                        }
                        if (var386 == 3315) {
                            var5 -= 2;
                            int var153 = field404[var5] + 32768;
                            int var154 = field404[var5 + 1];
                            field404[var5++] = class19.method2097(var153, var154);
                            continue;
                        }
                        if (var386 == 3316) {
                            if (client.field637 >= 2) {
                                field404[var5++] = client.field637;
                            } else {
                                field404[var5++] = 0;
                            }
                            continue;
                        }
                        if (var386 == 3317) {
                            field404[var5++] = client.field486;
                            continue;
                        }
                        if (var386 == 3318) {
                            field404[var5++] = client.field471;
                            continue;
                        }
                        if (var386 == 3321) {
                            field404[var5++] = client.field635;
                            continue;
                        }
                        if (var386 == 3322) {
                            field404[var5++] = client.field636;
                            continue;
                        }
                        if (var386 == 3323) {
                            if (client.field638) {
                                field404[var5++] = 1;
                            } else {
                                field404[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var386 < 3500) {
                        if (var386 == 3400) {
                            var5 -= 2;
                            int var155 = field404[var5];
                            int var156 = field404[var5 + 1];
                            class39 var157 = (class39) class39.field959.method3215((long) var155);
                            class39 var158;
                            if (var157 == null) {
                                byte[] var159 = Statics.field965.method2952(8, var155);
                                class39 var160 = new class39();
                                if (var159 != null) {
                                    var160.method809(new class127(var159));
                                }
                                class39.field959.method3225(var160, (long) var155);
                                var158 = var160;
                            } else {
                                var158 = var157;
                            }
                            class39 var161 = var158;
                            if (var158.field961 != 's') {
                            }
                            for (int var162 = 0; var162 < var161.field964; var162++) {
                                if (var161.field966[var162] == var156) {
                                    field393[var6++] = var161.field963[var162];
                                    var161 = null;
                                    break;
                                }
                            }
                            if (var161 != null) {
                                field393[var6++] = var161.field962;
                            }
                            continue;
                        }
                        if (var386 == 3408) {
                            var5 -= 4;
                            int var163 = field404[var5];
                            int var164 = field404[var5 + 1];
                            int var165 = field404[var5 + 2];
                            int var166 = field404[var5 + 3];
                            class39 var167 = (class39) class39.field959.method3215((long) var165);
                            class39 var168;
                            if (var167 == null) {
                                byte[] var169 = Statics.field965.method2952(8, var165);
                                class39 var170 = new class39();
                                if (var169 != null) {
                                    var170.method809(new class127(var169));
                                }
                                class39.field959.method3225(var170, (long) var165);
                                var168 = var170;
                            } else {
                                var168 = var167;
                            }
                            class39 var171 = var168;
                            if (var168.field958 == var163 && var168.field961 == var164) {
                                for (int var172 = 0; var172 < var171.field964; var172++) {
                                    if (var171.field966[var172] == var166) {
                                        if (var164 == 115) {
                                            field393[var6++] = var171.field963[var172];
                                        } else {
                                            field404[var5++] = var171.field967[var172];
                                        }
                                        var171 = null;
                                        break;
                                    }
                                }
                                if (var171 != null) {
                                    if (var164 == 115) {
                                        field393[var6++] = var171.field962;
                                    } else {
                                        field404[var5++] = var171.field968;
                                    }
                                }
                                continue;
                            }
                            if (var164 == 115) {
                                field393[var6++] = "null";
                            } else {
                                field404[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var386 < 3700) {
                        if (var386 == 3600) {
                            if (client.field724 == 0) {
                                field404[var5++] = -2;
                            } else if (client.field724 == 1) {
                                field404[var5++] = -1;
                            } else {
                                field404[var5++] = client.field693;
                            }
                            continue;
                        }
                        if (var386 == 3601) {
                            var5--;
                            int var173 = field404[var5];
                            if (client.field724 == 2 && var173 < client.field693) {
                                field393[var6++] = client.field702[var173].field367;
                                continue;
                            }
                            field393[var6++] = "";
                            continue;
                        }
                        if (var386 == 3602) {
                            var5--;
                            int var174 = field404[var5];
                            if (client.field724 == 2 && var174 < client.field693) {
                                field404[var5++] = client.field702[var174].field364;
                                continue;
                            }
                            field404[var5++] = 0;
                            continue;
                        }
                        if (var386 == 3603) {
                            var5--;
                            int var175 = field404[var5];
                            if (client.field724 == 2 && var175 < client.field693) {
                                field404[var5++] = client.field702[var175].field368;
                                continue;
                            }
                            field404[var5++] = 0;
                            continue;
                        }
                        if (var386 == 3604) {
                            var6--;
                            String var176 = field393[var6];
                            var5--;
                            int var177 = field404[var5];
                            client.field594.method2300(182);
                            client.field594.method2411(class127.method1331(var176) + 1);
                            client.field594.method2567(var177);
                            client.field594.method2416(var176);
                            continue;
                        }
                        if (var386 == 3605) {
                            var6--;
                            String var178 = field393[var6];
                            client.method2159(var178);
                            continue;
                        }
                        if (var386 == 3606) {
                            var6--;
                            String var179 = field393[var6];
                            client.method2351(var179);
                            continue;
                        }
                        if (var386 == 3607) {
                            var6--;
                            String var180 = field393[var6];
                            if (var180 == null) {
                                continue;
                            }
                            if ((client.field730 < 100 || client.field597 == 1) && client.field730 < 400) {
                                String var181 = class149.method86(var180, Statics.field242);
                                if (var181 == null) {
                                    continue;
                                }
                                for (int var182 = 0; var182 < client.field730; var182++) {
                                    class11 var183 = client.field673[var182];
                                    String var184 = class149.method86(var183.field178, Statics.field242);
                                    if (var184 != null && var184.equals(var181)) {
                                        client.method2666(0, "", var180 + class135.field2265);
                                        continue label2392;
                                    }
                                    if (var183.field170 != null) {
                                        String var185 = class149.method86(var183.field170, Statics.field242);
                                        if (var185 != null && var185.equals(var181)) {
                                            client.method2666(0, "", var180 + class135.field2265);
                                            continue label2392;
                                        }
                                    }
                                }
                                for (int var186 = 0; var186 < client.field693; var186++) {
                                    class23 var187 = client.field702[var186];
                                    String var188 = class149.method86(var187.field367, Statics.field242);
                                    if (var188 != null && var188.equals(var181)) {
                                        client.method2666(0, "", class135.field2339 + var180 + class135.field2113);
                                        continue label2392;
                                    }
                                    if (var187.field363 != null) {
                                        String var189 = class149.method86(var187.field363, Statics.field242);
                                        if (var189 != null && var189.equals(var181)) {
                                            client.method2666(0, "", class135.field2339 + var180 + class135.field2113);
                                            continue label2392;
                                        }
                                    }
                                }
                                if (class149.method86(Statics.field2728.field36, Statics.field242).equals(var181)) {
                                    client.method2666(0, "", class135.field2123);
                                } else {
                                    client.field594.method2300(142);
                                    client.field594.method2411(class127.method1331(var180));
                                    client.field594.method2416(var180);
                                }
                                continue;
                            }
                            client.method2666(0, "", class135.field2264);
                            continue;
                        }
                        if (var386 == 3608) {
                            var6--;
                            String var190 = field393[var6];
                            client.method780(var190);
                            continue;
                        }
                        if (var386 == 3609) {
                            var6--;
                            String var191 = field393[var6];
                            if (var191.startsWith(class2.method200(0)) || var191.startsWith(class2.method200(1))) {
                                var191 = var191.substring(7);
                            }
                            field404[var5++] = client.method166(var191) ? 1 : 0;
                            continue;
                        }
                        if (var386 == 3611) {
                            if (client.field712 == null) {
                                field393[var6++] = "";
                                continue;
                            }
                            String[] var192 = field393;
                            int var193 = var6++;
                            String var194 = client.field712;
                            long var195 = 0L;
                            int var197 = var194.length();
                            for (int var198 = 0; var198 < var197; var198++) {
                                var195 *= 37L;
                                char var199 = var194.charAt(var198);
                                if (var199 >= 'A' && var199 <= 'Z') {
                                    var195 += (long) (var199 + 1 - 65);
                                } else if (var199 >= 'a' && var199 <= 'z') {
                                    var195 += (long) (var199 + 1 - 97);
                                } else if (var199 >= '0' && var199 <= '9') {
                                    var195 += (long) (var199 + 27 - 48);
                                }
                                if (var195 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var195 % 37L == 0L && var195 != 0L) {
                                var195 /= 37L;
                            }
                            String var202 = class147.method245(var195);
                            if (var202 == null) {
                                var202 = "";
                            }
                            var192[var193] = var202;
                            continue;
                        }
                        if (var386 == 3612) {
                            if (client.field712 == null) {
                                field404[var5++] = 0;
                            } else {
                                field404[var5++] = Statics.field1983;
                            }
                            continue;
                        }
                        if (var386 == 3613) {
                            var5--;
                            int var204 = field404[var5];
                            if (client.field712 != null && var204 < Statics.field1983) {
                                field393[var6++] = Statics.field2355[var204].field110;
                                continue;
                            }
                            field393[var6++] = "";
                            continue;
                        }
                        if (var386 == 3614) {
                            var5--;
                            int var205 = field404[var5];
                            if (client.field712 != null && var205 < Statics.field1983) {
                                field404[var5++] = Statics.field2355[var205].field113;
                                continue;
                            }
                            field404[var5++] = 0;
                            continue;
                        }
                        if (var386 == 3615) {
                            var5--;
                            int var206 = field404[var5];
                            if (client.field712 != null && var206 < Statics.field1983) {
                                field404[var5++] = Statics.field2355[var206].field111;
                                continue;
                            }
                            field404[var5++] = 0;
                            continue;
                        }
                        if (var386 == 3616) {
                            field404[var5++] = Statics.field1258;
                            continue;
                        }
                        if (var386 == 3617) {
                            var6--;
                            String var207 = field393[var6];
                            client.method232(var207);
                            continue;
                        }
                        if (var386 == 3618) {
                            field404[var5++] = Statics.field357;
                            continue;
                        }
                        if (var386 == 3619) {
                            var6--;
                            String var208 = field393[var6];
                            client.method1371(var208);
                            continue;
                        }
                        if (var386 == 3620) {
                            client.method1389();
                            continue;
                        }
                        if (var386 == 3621) {
                            if (client.field724 == 0) {
                                field404[var5++] = -1;
                            } else {
                                field404[var5++] = client.field730;
                            }
                            continue;
                        }
                        if (var386 == 3622) {
                            var5--;
                            int var209 = field404[var5];
                            if (client.field724 != 0 && var209 < client.field730) {
                                field393[var6++] = client.field673[var209].field178;
                                continue;
                            }
                            field393[var6++] = "";
                            continue;
                        }
                        if (var386 == 3623) {
                            var6--;
                            String var210 = field393[var6];
                            if (var210.startsWith(class2.method200(0)) || var210.startsWith(class2.method200(1))) {
                                var210 = var210.substring(7);
                            }
                            field404[var5++] = client.method2024(var210) ? 1 : 0;
                            continue;
                        }
                        if (var386 == 3624) {
                            var5--;
                            int var211 = field404[var5];
                            if (Statics.field2355 != null && var211 < Statics.field1983 && Statics.field2355[var211].field110.equalsIgnoreCase(Statics.field2728.field36)) {
                                field404[var5++] = 1;
                                continue;
                            }
                            field404[var5++] = 0;
                            continue;
                        }
                        if (var386 == 3625) {
                            if (client.field697 == null) {
                                field393[var6++] = "";
                                continue;
                            }
                            String[] var212 = field393;
                            int var213 = var6++;
                            String var214 = client.field697;
                            long var215 = 0L;
                            int var217 = var214.length();
                            for (int var218 = 0; var218 < var217; var218++) {
                                var215 *= 37L;
                                char var219 = var214.charAt(var218);
                                if (var219 >= 'A' && var219 <= 'Z') {
                                    var215 += (long) (var219 + 1 - 65);
                                } else if (var219 >= 'a' && var219 <= 'z') {
                                    var215 += (long) (var219 + 1 - 97);
                                } else if (var219 >= '0' && var219 <= '9') {
                                    var215 += (long) (var219 + 27 - 48);
                                }
                                if (var215 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var215 % 37L == 0L && var215 != 0L) {
                                var215 /= 37L;
                            }
                            String var222 = class147.method245(var215);
                            if (var222 == null) {
                                var222 = "";
                            }
                            var212[var213] = var222;
                            continue;
                        }
                    } else if (var386 < 4100) {
                        if (var386 == 4000) {
                            var5 -= 2;
                            int var224 = field404[var5];
                            int var225 = field404[var5 + 1];
                            field404[var5++] = var224 + var225;
                            continue;
                        }
                        if (var386 == 4001) {
                            var5 -= 2;
                            int var226 = field404[var5];
                            int var227 = field404[var5 + 1];
                            field404[var5++] = var226 - var227;
                            continue;
                        }
                        if (var386 == 4002) {
                            var5 -= 2;
                            int var228 = field404[var5];
                            int var229 = field404[var5 + 1];
                            field404[var5++] = var228 * var229;
                            continue;
                        }
                        if (var386 == 4003) {
                            var5 -= 2;
                            int var230 = field404[var5];
                            int var231 = field404[var5 + 1];
                            field404[var5++] = var230 / var231;
                            continue;
                        }
                        if (var386 == 4004) {
                            var5--;
                            int var232 = field404[var5];
                            field404[var5++] = (int) (Math.random() * (double) var232);
                            continue;
                        }
                        if (var386 == 4005) {
                            var5--;
                            int var233 = field404[var5];
                            field404[var5++] = (int) (Math.random() * (double) (var233 + 1));
                            continue;
                        }
                        if (var386 == 4006) {
                            var5 -= 5;
                            int var234 = field404[var5];
                            int var235 = field404[var5 + 1];
                            int var236 = field404[var5 + 2];
                            int var237 = field404[var5 + 3];
                            int var238 = field404[var5 + 4];
                            field404[var5++] = (var235 - var234) * (var238 - var236) / (var237 - var236) + var234;
                            continue;
                        }
                        if (var386 == 4007) {
                            var5 -= 2;
                            int var239 = field404[var5];
                            int var240 = field404[var5 + 1];
                            field404[var5++] = var239 * var240 / 100 + var239;
                            continue;
                        }
                        if (var386 == 4008) {
                            var5 -= 2;
                            int var241 = field404[var5];
                            int var242 = field404[var5 + 1];
                            field404[var5++] = var241 | 0x1 << var242;
                            continue;
                        }
                        if (var386 == 4009) {
                            var5 -= 2;
                            int var243 = field404[var5];
                            int var244 = field404[var5 + 1];
                            field404[var5++] = var243 & -1 - (0x1 << var244);
                            continue;
                        }
                        if (var386 == 4010) {
                            var5 -= 2;
                            int var245 = field404[var5];
                            int var246 = field404[var5 + 1];
                            field404[var5++] = (var245 & 0x1 << var246) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var386 == 4011) {
                            var5 -= 2;
                            int var247 = field404[var5];
                            int var248 = field404[var5 + 1];
                            field404[var5++] = var247 % var248;
                            continue;
                        }
                        if (var386 == 4012) {
                            var5 -= 2;
                            int var249 = field404[var5];
                            int var250 = field404[var5 + 1];
                            if (var249 == 0) {
                                field404[var5++] = 0;
                            } else {
                                field404[var5++] = (int) Math.pow((double) var249, (double) var250);
                            }
                            continue;
                        }
                        if (var386 == 4013) {
                            var5 -= 2;
                            int var251 = field404[var5];
                            int var252 = field404[var5 + 1];
                            if (var251 == 0) {
                                field404[var5++] = 0;
                            } else if (var252 == 0) {
                                field404[var5++] = Integer.MAX_VALUE;
                            } else {
                                field404[var5++] = (int) Math.pow((double) var251, 1.0D / (double) var252);
                            }
                            continue;
                        }
                        if (var386 == 4014) {
                            var5 -= 2;
                            int var253 = field404[var5];
                            int var254 = field404[var5 + 1];
                            field404[var5++] = var253 & var254;
                            continue;
                        }
                        if (var386 == 4015) {
                            var5 -= 2;
                            int var255 = field404[var5];
                            int var256 = field404[var5 + 1];
                            field404[var5++] = var255 | var256;
                            continue;
                        }
                    } else if (var386 < 4200) {
                        if (var386 == 4100) {
                            var6--;
                            String var257 = field393[var6];
                            var5--;
                            int var258 = field404[var5];
                            field393[var6++] = var257 + var258;
                            continue;
                        }
                        if (var386 == 4101) {
                            var6 -= 2;
                            String var259 = field393[var6];
                            String var260 = field393[var6 + 1];
                            field393[var6++] = var259 + var260;
                            continue;
                        }
                        if (var386 == 4102) {
                            var6--;
                            String var261 = field393[var6];
                            var5--;
                            int var262 = field404[var5];
                            field393[var6++] = var261 + class148.method886(var262, true);
                            continue;
                        }
                        if (var386 == 4103) {
                            var6--;
                            String var263 = field393[var6];
                            field393[var6++] = var263.toLowerCase();
                            continue;
                        }
                        if (var386 == 4104) {
                            var5--;
                            int var264 = field404[var5];
                            long var265 = ((long) var264 + 11745L) * 86400000L;
                            field406.setTime(new Date(var265));
                            int var267 = field406.get(5);
                            int var268 = field406.get(2);
                            int var269 = field406.get(1);
                            field393[var6++] = var267 + "-" + field402[var268] + "-" + var269;
                            continue;
                        }
                        if (var386 == 4105) {
                            var6 -= 2;
                            String var270 = field393[var6];
                            String var271 = field393[var6 + 1];
                            if (Statics.field2728.field34 != null && Statics.field2728.field34.field2750) {
                                field393[var6++] = var271;
                                continue;
                            }
                            field393[var6++] = var270;
                            continue;
                        }
                        if (var386 == 4106) {
                            var5--;
                            int var272 = field404[var5];
                            field393[var6++] = Integer.toString(var272);
                            continue;
                        }
                        if (var386 == 4107) {
                            var6 -= 2;
                            int[] var273 = field404;
                            int var274 = var5++;
                            String var275 = field393[var6];
                            String var276 = field393[var6 + 1];
                            int var277 = client.field476;
                            int var278 = var275.length();
                            int var279 = var276.length();
                            int var280 = 0;
                            int var281 = 0;
                            byte var282 = 0;
                            byte var283 = 0;
                            int var284;
                            label2230: while (true) {
                                if (var280 - var282 >= var278 && var281 - var283 >= var279) {
                                    int var295 = Math.min(var278, var279);
                                    for (int var296 = 0; var296 < var295; var296++) {
                                        char var299 = var275.charAt(var296);
                                        char var300 = var276.charAt(var296);
                                        if (var299 != var300 && Character.toUpperCase(var299) != Character.toUpperCase(var300)) {
                                            char var301 = Character.toLowerCase(var299);
                                            char var302 = Character.toLowerCase(var300);
                                            if (var301 != var302) {
                                                var284 = class151.method31(var301, var277) - class151.method31(var302, var277);
                                                break label2230;
                                            }
                                        }
                                    }
                                    int var303 = var278 - var279;
                                    if (var303 == 0) {
                                        for (int var304 = 0; var304 < var295; var304++) {
                                            char var305 = var275.charAt(var304);
                                            char var306 = var276.charAt(var304);
                                            if (var305 != var306) {
                                                var284 = class151.method31(var305, var277) - class151.method31(var306, var277);
                                                break label2230;
                                            }
                                        }
                                        var284 = 0;
                                    } else {
                                        var284 = var303;
                                    }
                                    break;
                                }
                                if (var280 - var282 >= var278) {
                                    var284 = -1;
                                    break;
                                }
                                if (var281 - var283 >= var279) {
                                    var284 = 1;
                                    break;
                                }
                                char var285;
                                if (var282 == 0) {
                                    var285 = var275.charAt(var280++);
                                } else {
                                    var285 = (char) var282;
                                    boolean var286 = false;
                                }
                                char var287;
                                if (var283 == 0) {
                                    var287 = var276.charAt(var281++);
                                } else {
                                    var287 = (char) var283;
                                    boolean var288 = false;
                                }
                                byte var289;
                                if (var285 == 198) {
                                    var289 = 69;
                                } else if (var285 == 230) {
                                    var289 = 101;
                                } else if (var285 == 223) {
                                    var289 = 115;
                                } else if (var285 == 338) {
                                    var289 = 69;
                                } else if (var285 == 339) {
                                    var289 = 101;
                                } else {
                                    var289 = 0;
                                }
                                var282 = var289;
                                byte var290;
                                if (var287 == 198) {
                                    var290 = 69;
                                } else if (var287 == 230) {
                                    var290 = 101;
                                } else if (var287 == 223) {
                                    var290 = 115;
                                } else if (var287 == 338) {
                                    var290 = 69;
                                } else if (var287 == 339) {
                                    var290 = 101;
                                } else {
                                    var290 = 0;
                                }
                                var283 = var290;
                                char var291 = class151.method2918(var285, var277);
                                char var292 = class151.method2918(var287, var277);
                                if (var291 != var292 && Character.toUpperCase(var291) != Character.toUpperCase(var292)) {
                                    char var293 = Character.toLowerCase(var291);
                                    char var294 = Character.toLowerCase(var292);
                                    if (var293 != var294) {
                                        var284 = class151.method31(var293, var277) - class151.method31(var294, var277);
                                        break;
                                    }
                                }
                            }
                            byte var308;
                            if (var284 > 0) {
                                var308 = 1;
                            } else if (var284 < 0) {
                                var308 = -1;
                            } else {
                                var308 = 0;
                            }
                            var273[var274] = var308;
                            continue;
                        }
                        if (var386 == 4108) {
                            var6--;
                            String var309 = field393[var6];
                            var5 -= 2;
                            int var310 = field404[var5];
                            int var311 = field404[var5 + 1];
                            byte[] var312 = Statics.field2534.method2952(var311, 0);
                            class183 var313 = new class183(var312);
                            field404[var5++] = var313.method3348(var309, var310);
                            continue;
                        }
                        if (var386 == 4109) {
                            var6--;
                            String var314 = field393[var6];
                            var5 -= 2;
                            int var315 = field404[var5];
                            int var316 = field404[var5 + 1];
                            byte[] var317 = Statics.field2534.method2952(var316, 0);
                            class183 var318 = new class183(var317);
                            field404[var5++] = var318.method3347(var314, var315);
                            continue;
                        }
                        if (var386 == 4110) {
                            var6 -= 2;
                            String var319 = field393[var6];
                            String var320 = field393[var6 + 1];
                            var5--;
                            if (field404[var5] == 1) {
                                field393[var6++] = var319;
                            } else {
                                field393[var6++] = var320;
                            }
                            continue;
                        }
                        if (var386 == 4111) {
                            var6--;
                            String var321 = field393[var6];
                            field393[var6++] = class185.method3349(var321);
                            continue;
                        }
                        if (var386 == 4112) {
                            var6--;
                            String var322 = field393[var6];
                            var5--;
                            int var323 = field404[var5];
                            field393[var6++] = var322 + (char) var323;
                            continue;
                        }
                        if (var386 == 4113) {
                            var5--;
                            int var324 = field404[var5];
                            int[] var325 = field404;
                            int var326 = var5++;
                            char var327 = (char) var324;
                            boolean var328;
                            if (var327 >= ' ' && var327 <= '~') {
                                var328 = true;
                            } else if (var327 >= 160 && var327 <= 255) {
                                var328 = true;
                            } else if (var327 == 8364 || var327 == 338 || var327 == 8212 || var327 == 339 || var327 == 376) {
                                var328 = true;
                            } else {
                                var328 = false;
                            }
                            var325[var326] = var328 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 4114) {
                            var5--;
                            int var329 = field404[var5];
                            field404[var5++] = class148.method1381((char) var329) ? 1 : 0;
                            continue;
                        }
                        if (var386 == 4115) {
                            var5--;
                            int var330 = field404[var5];
                            int[] var331 = field404;
                            int var332 = var5++;
                            char var333 = (char) var330;
                            boolean var334 = var333 >= 'A' && var333 <= 'Z' || var333 >= 'a' && var333 <= 'z';
                            var331[var332] = var334 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 4116) {
                            var5--;
                            int var335 = field404[var5];
                            field404[var5++] = class148.method148((char) var335) ? 1 : 0;
                            continue;
                        }
                        if (var386 == 4117) {
                            var6--;
                            String var336 = field393[var6];
                            if (var336 == null) {
                                field404[var5++] = 0;
                            } else {
                                field404[var5++] = var336.length();
                            }
                            continue;
                        }
                        if (var386 == 4118) {
                            var6--;
                            String var337 = field393[var6];
                            var5 -= 2;
                            int var338 = field404[var5];
                            int var339 = field404[var5 + 1];
                            field393[var6++] = var337.substring(var338, var339);
                            continue;
                        }
                        if (var386 == 4119) {
                            var6--;
                            String var340 = field393[var6];
                            StringBuilder var341 = new StringBuilder(var340.length());
                            boolean var342 = false;
                            for (int var343 = 0; var343 < var340.length(); var343++) {
                                char var344 = var340.charAt(var343);
                                if (var344 == '<') {
                                    var342 = true;
                                } else if (var344 == '>') {
                                    var342 = false;
                                } else if (!var342) {
                                    var341.append(var344);
                                }
                            }
                            field393[var6++] = var341.toString();
                            continue;
                        }
                        if (var386 == 4120) {
                            var6--;
                            String var345 = field393[var6];
                            var5--;
                            int var346 = field404[var5];
                            field404[var5++] = var345.indexOf(var346);
                            continue;
                        }
                    } else if (var386 < 4300) {
                        if (var386 == 4200) {
                            var5--;
                            int var347 = field404[var5];
                            field393[var6++] = class40.method782(var347).field982;
                            continue;
                        }
                        if (var386 == 4201) {
                            var5 -= 2;
                            int var348 = field404[var5];
                            int var349 = field404[var5 + 1];
                            class40 var350 = class40.method782(var348);
                            if (var349 >= 1 && var349 <= 5 && var350.field993[var349 - 1] != null) {
                                field393[var6++] = var350.field993[var349 - 1];
                                continue;
                            }
                            field393[var6++] = "";
                            continue;
                        }
                        if (var386 == 4202) {
                            var5 -= 2;
                            int var351 = field404[var5];
                            int var352 = field404[var5 + 1];
                            class40 var353 = class40.method782(var351);
                            if (var352 >= 1 && var352 <= 5 && var353.field1006[var352 - 1] != null) {
                                field393[var6++] = var353.field1006[var352 - 1];
                                continue;
                            }
                            field393[var6++] = "";
                            continue;
                        }
                        if (var386 == 4203) {
                            var5--;
                            int var354 = field404[var5];
                            field404[var5++] = class40.method782(var354).field1020;
                            continue;
                        }
                        if (var386 == 4204) {
                            var5--;
                            int var355 = field404[var5];
                            field404[var5++] = class40.method782(var355).field994 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 4205) {
                            var5--;
                            int var356 = field404[var5];
                            class40 var357 = class40.method782(var356);
                            if (var357.field1013 == -1 && var357.field996 >= 0) {
                                field404[var5++] = var357.field996;
                                continue;
                            }
                            field404[var5++] = var356;
                            continue;
                        }
                        if (var386 == 4206) {
                            var5--;
                            int var358 = field404[var5];
                            class40 var359 = class40.method782(var358);
                            if (var359.field1013 >= 0 && var359.field996 >= 0) {
                                field404[var5++] = var359.field996;
                                continue;
                            }
                            field404[var5++] = var358;
                            continue;
                        }
                        if (var386 == 4207) {
                            var5--;
                            int var360 = field404[var5];
                            field404[var5++] = class40.method782(var360).field995 ? 1 : 0;
                            continue;
                        }
                    } else if (var386 < 5100) {
                        if (var386 == 5000) {
                            field404[var5++] = client.field731;
                            continue;
                        }
                        if (var386 == 5001) {
                            var5 -= 3;
                            client.field731 = field404[var5];
                            Statics.field222 = class138.method1562(field404[var5 + 1]);
                            if (Statics.field222 == null) {
                                Statics.field222 = class138.field2358;
                            }
                            client.field689 = field404[var5 + 2];
                            client.field594.method2300(29);
                            client.field594.method2411(client.field731);
                            client.field594.method2411(Statics.field222.field2357);
                            client.field594.method2411(client.field689);
                            continue;
                        }
                        if (var386 == 5002) {
                            var6--;
                            String var361 = field393[var6];
                            var5 -= 2;
                            int var362 = field404[var5];
                            int var363 = field404[var5 + 1];
                            client.field594.method2300(35);
                            client.field594.method2411(class127.method1331(var361) + 2);
                            client.field594.method2416(var361);
                            client.field594.method2411(var362 - 1);
                            client.field594.method2411(var363);
                            continue;
                        }
                        if (var386 == 5003) {
                            var5--;
                            int var364 = field404[var5];
                            String var365 = null;
                            if (var364 < 100) {
                                var365 = client.field685[var364];
                            }
                            if (var365 == null) {
                                var365 = "";
                            }
                            field393[var6++] = var365;
                            continue;
                        }
                        if (var386 == 5004) {
                            var5--;
                            int var366 = field404[var5];
                            int var367 = -1;
                            if (var366 < 100 && client.field685[var366] != null) {
                                var367 = client.field682[var366];
                            }
                            field404[var5++] = var367;
                            continue;
                        }
                        if (var386 == 5005) {
                            if (Statics.field222 == null) {
                                field404[var5++] = -1;
                            } else {
                                field404[var5++] = Statics.field222.field2357;
                            }
                            continue;
                        }
                        if (var386 == 5008) {
                            var6--;
                            String var368 = field393[var6];
                            if (var368.startsWith("::")) {
                                client.method1255(var368.substring(2));
                            } else {
                                String var369 = var368.toLowerCase();
                                byte var370 = 0;
                                if (var369.startsWith(class135.field2234)) {
                                    var370 = 0;
                                    var368 = var368.substring(class135.field2234.length());
                                } else if (var369.startsWith(class135.field2274)) {
                                    var370 = 1;
                                    var368 = var368.substring(class135.field2274.length());
                                } else if (var369.startsWith(class135.field2276)) {
                                    var370 = 2;
                                    var368 = var368.substring(class135.field2276.length());
                                } else if (var369.startsWith(class135.field2278)) {
                                    var370 = 3;
                                    var368 = var368.substring(class135.field2278.length());
                                } else if (var369.startsWith(class135.field2280)) {
                                    var370 = 4;
                                    var368 = var368.substring(class135.field2280.length());
                                } else if (var369.startsWith(class135.field2282)) {
                                    var370 = 5;
                                    var368 = var368.substring(class135.field2282.length());
                                } else if (var369.startsWith(class135.field2323)) {
                                    var370 = 6;
                                    var368 = var368.substring(class135.field2323.length());
                                } else if (var369.startsWith(class135.field2318)) {
                                    var370 = 7;
                                    var368 = var368.substring(class135.field2318.length());
                                } else if (var369.startsWith(class135.field2344)) {
                                    var370 = 8;
                                    var368 = var368.substring(class135.field2344.length());
                                } else if (var369.startsWith(class135.field2152)) {
                                    var370 = 9;
                                    var368 = var368.substring(class135.field2152.length());
                                } else if (var369.startsWith(class135.field2292)) {
                                    var370 = 10;
                                    var368 = var368.substring(class135.field2292.length());
                                } else if (var369.startsWith(class135.field2294)) {
                                    var370 = 11;
                                    var368 = var368.substring(class135.field2294.length());
                                } else if (client.field476 != 0) {
                                    if (var369.startsWith(class135.field2273)) {
                                        var370 = 0;
                                        var368 = var368.substring(class135.field2273.length());
                                    } else if (var369.startsWith(class135.field2218)) {
                                        var370 = 1;
                                        var368 = var368.substring(class135.field2218.length());
                                    } else if (var369.startsWith(class135.field2279)) {
                                        var370 = 2;
                                        var368 = var368.substring(class135.field2279.length());
                                    } else if (var369.startsWith(class135.field2277)) {
                                        var370 = 3;
                                        var368 = var368.substring(class135.field2277.length());
                                    } else if (var369.startsWith(class135.field2281)) {
                                        var370 = 4;
                                        var368 = var368.substring(class135.field2281.length());
                                    } else if (var369.startsWith(class135.field2283)) {
                                        var370 = 5;
                                        var368 = var368.substring(class135.field2283.length());
                                    } else if (var369.startsWith(class135.field2285)) {
                                        var370 = 6;
                                        var368 = var368.substring(class135.field2285.length());
                                    } else if (var369.startsWith(class135.field2239)) {
                                        var370 = 7;
                                        var368 = var368.substring(class135.field2239.length());
                                    } else if (var369.startsWith(class135.field2289)) {
                                        var370 = 8;
                                        var368 = var368.substring(class135.field2289.length());
                                    } else if (var369.startsWith(class135.field2190)) {
                                        var370 = 9;
                                        var368 = var368.substring(class135.field2190.length());
                                    } else if (var369.startsWith(class135.field2293)) {
                                        var370 = 10;
                                        var368 = var368.substring(class135.field2293.length());
                                    } else if (var369.startsWith(class135.field2197)) {
                                        var370 = 11;
                                        var368 = var368.substring(class135.field2197.length());
                                    }
                                }
                                String var371 = var368.toLowerCase();
                                byte var372 = 0;
                                if (var371.startsWith(class135.field2257)) {
                                    var372 = 1;
                                    var368 = var368.substring(class135.field2257.length());
                                } else if (var371.startsWith(class135.field2298)) {
                                    var372 = 2;
                                    var368 = var368.substring(class135.field2298.length());
                                } else if (var371.startsWith(class135.field2300)) {
                                    var372 = 3;
                                    var368 = var368.substring(class135.field2300.length());
                                } else if (var371.startsWith(class135.field2302)) {
                                    var372 = 4;
                                    var368 = var368.substring(class135.field2302.length());
                                } else if (var371.startsWith(class135.field2304)) {
                                    var372 = 5;
                                    var368 = var368.substring(class135.field2304.length());
                                } else if (client.field476 != 0) {
                                    if (var371.startsWith(class135.field2297)) {
                                        var372 = 1;
                                        var368 = var368.substring(class135.field2297.length());
                                    } else if (var371.startsWith(class135.field2272)) {
                                        var372 = 2;
                                        var368 = var368.substring(class135.field2272.length());
                                    } else if (var371.startsWith(class135.field2115)) {
                                        var372 = 3;
                                        var368 = var368.substring(class135.field2115.length());
                                    } else if (var371.startsWith(class135.field2166)) {
                                        var372 = 4;
                                        var368 = var368.substring(class135.field2166.length());
                                    } else if (var371.startsWith(class135.field2305)) {
                                        var372 = 5;
                                        var368 = var368.substring(class135.field2305.length());
                                    }
                                }
                                client.field594.method2300(216);
                                client.field594.method2411(0);
                                int var373 = client.field594.field2039;
                                client.field594.method2411(var370);
                                client.field594.method2411(var372);
                                class184.method3077(client.field594, var368);
                                client.field594.method2422(client.field594.field2039 - var373);
                            }
                            continue;
                        }
                        if (var386 == 5009) {
                            var6 -= 2;
                            String var374 = field393[var6];
                            String var375 = field393[var6 + 1];
                            client.field594.method2300(98);
                            client.field594.method2424(0);
                            int var376 = client.field594.field2039;
                            client.field594.method2416(var374);
                            class184.method3077(client.field594, var375);
                            client.field594.method2552(client.field594.field2039 - var376);
                            continue;
                        }
                        if (var386 == 5010) {
                            var5--;
                            int var377 = field404[var5];
                            String var378 = null;
                            if (var377 < 100) {
                                var378 = client.field683[var377];
                            }
                            if (var378 == null) {
                                var378 = "";
                            }
                            field393[var6++] = var378;
                            continue;
                        }
                        if (var386 == 5011) {
                            var5--;
                            int var379 = field404[var5];
                            String var380 = null;
                            if (var379 < 100) {
                                var380 = client.field578[var379];
                            }
                            if (var380 == null) {
                                var380 = "";
                            }
                            field393[var6++] = var380;
                            continue;
                        }
                        if (var386 == 5015) {
                            String var381;
                            if (Statics.field2728 == null || Statics.field2728.field36 == null) {
                                var381 = "";
                            } else {
                                var381 = Statics.field2728.field36;
                            }
                            field393[var6++] = var381;
                            continue;
                        }
                        if (var386 == 5016) {
                            field404[var5++] = client.field689;
                            continue;
                        }
                        if (var386 == 5017) {
                            field404[var5++] = client.field570;
                            continue;
                        }
                    }
                } else {
                    class159 var75;
                    if (var386 >= 2000) {
                        var386 -= 1000;
                        var5--;
                        var75 = class159.method145(field404[var5]);
                    } else {
                        var75 = var52 ? Statics.field738 : Statics.field397;
                    }
                    if (var386 == 1300) {
                        var5--;
                        int var76 = field404[var5] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var6--;
                            var75.method3095(var76, field393[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var386 == 1301) {
                        var5 -= 2;
                        int var77 = field404[var5];
                        int var78 = field404[var5 + 1];
                        var75.field2658 = class159.method32(var77, var78);
                        continue;
                    }
                    if (var386 == 1302) {
                        var5--;
                        var75.field2687 = field404[var5] == 1;
                        continue;
                    }
                    if (var386 == 1303) {
                        var5--;
                        var75.field2673 = field404[var5];
                        continue;
                    }
                    if (var386 == 1304) {
                        var5--;
                        var75.field2674 = field404[var5];
                        continue;
                    }
                    if (var386 == 1305) {
                        var6--;
                        var75.field2601 = field393[var6];
                        continue;
                    }
                    if (var386 == 1306) {
                        var6--;
                        var75.field2692 = field393[var6];
                        continue;
                    }
                    if (var386 == 1307) {
                        var75.field2646 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var385) {
            StringBuilder var383 = new StringBuilder(30);
            var383.append("").append(var4.field2830).append(" ");
            for (int var384 = field399 - 1; var384 >= 0; var384--) {
                var383.append("").append(field400[var384].field267.field2830).append(" ");
            }
            var383.append("").append(var10);
            class80.method2321(var383.toString(), var385);
        }
    }

    @ObfuscatedName("q.p(IB)V")
    public static void method4(int arg0) {
        if (arg0 == -1 || !class159.method2879(arg0)) {
            return;
        }
        class159[] var1 = Statics.field1277[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3.field2678 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field9 = var3.field2678;
                method53(var4, 2000000);
            }
        }
    }
}
