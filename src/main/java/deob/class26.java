package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("x")
public class class26 {

    @ObfuscatedName("x.r")
    public static int[] field407 = new int[5];

    @ObfuscatedName("x.k")
    public static int[][] field400 = new int[5][5000];

    @ObfuscatedName("x.z")
    public static int[] field401 = new int[1000];

    @ObfuscatedName("x.g")
    public static String[] field402 = new String[1000];

    @ObfuscatedName("x.n")
    public static int field408 = 0;

    @ObfuscatedName("x.j")
    public static class18[] field403 = new class18[50];

    @ObfuscatedName("x.a")
    public static Calendar field406 = Calendar.getInstance();

    @ObfuscatedName("x.e")
    public static final String[] field410 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.l(Ll;I)V")
    public static void method769(class1 arg0) {
        method2182(arg0, 200000);
    }

    @ObfuscatedName("dw.b(Ll;II)V")
    public static void method2182(class1 arg0, int arg1) {
        Object[] var2 = arg0.field5;
        int var3 = (Integer) var2[0];
        class5 var4 = class5.method1845(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field58;
        int[] var9 = var4.field61;
        byte var10 = -1;
        field408 = 0;
        try {
            Statics.field404 = new int[var4.field65];
            int var11 = 0;
            Statics.field398 = new String[var4.field62];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field2;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field11 == null ? -1 : arg0.field11.field2616;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field11 == null ? -1 : arg0.field11.field2617;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2616;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2617;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field404[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field398[var12++] = var15;
                }
            }
            int var16 = 0;
            label2422: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var390 = var8[var7];
                if (var390 < 100) {
                    if (var390 == 0) {
                        field401[var5++] = var9[var7];
                        continue;
                    }
                    if (var390 == 1) {
                        int var17 = var9[var7];
                        field401[var5++] = class161.field2736[var17];
                        continue;
                    }
                    if (var390 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class161.field2736[var18] = field401[var5];
                        client.method2996(var18);
                        continue;
                    }
                    if (var390 == 3) {
                        field402[var6++] = var4.field72[var7];
                        continue;
                    }
                    if (var390 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var390 == 7) {
                        var5 -= 2;
                        if (field401[var5 + 1] != field401[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var390 == 8) {
                        var5 -= 2;
                        if (field401[var5 + 1] == field401[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var390 == 9) {
                        var5 -= 2;
                        if (field401[var5] < field401[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var390 == 10) {
                        var5 -= 2;
                        if (field401[var5] > field401[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var390 == 21) {
                        if (field408 == 0) {
                            return;
                        }
                        class18 var19 = field403[--field408];
                        var4 = var19.field264;
                        var8 = var4.field58;
                        var9 = var4.field61;
                        var7 = var19.field253;
                        Statics.field404 = var19.field254;
                        Statics.field398 = var19.field255;
                        continue;
                    }
                    if (var390 == 25) {
                        int var20 = var9[var7];
                        field401[var5++] = class161.method3138(var20);
                        continue;
                    }
                    if (var390 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class161.method1525(var21, field401[var5]);
                        continue;
                    }
                    if (var390 == 31) {
                        var5 -= 2;
                        if (field401[var5] <= field401[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var390 == 32) {
                        var5 -= 2;
                        if (field401[var5] >= field401[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var390 == 33) {
                        field401[var5++] = Statics.field404[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var390 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field404[var10001] = field401[var5];
                        continue;
                    }
                    if (var390 == 35) {
                        field402[var6++] = Statics.field398[var9[var7]];
                        continue;
                    }
                    if (var390 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field398[var10001] = field402[var6];
                        continue;
                    }
                    if (var390 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class149.method1669(field402, var6, var22);
                        field402[var6++] = var23;
                        continue;
                    }
                    if (var390 == 38) {
                        var5--;
                        continue;
                    }
                    if (var390 == 39) {
                        var6--;
                        continue;
                    }
                    if (var390 == 40) {
                        int var24 = var9[var7];
                        class5 var25 = class5.method1845(var24);
                        int[] var26 = new int[var25.field65];
                        String[] var27 = new String[var25.field62];
                        for (int var28 = 0; var28 < var25.field63; var28++) {
                            var26[var28] = field401[var5 - var25.field63 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field64; var29++) {
                            var27[var29] = field402[var6 - var25.field64 + var29];
                        }
                        var5 -= var25.field63;
                        var6 -= var25.field64;
                        class18 var30 = new class18();
                        var30.field264 = var4;
                        var30.field253 = var7;
                        var30.field254 = Statics.field404;
                        var30.field255 = Statics.field398;
                        field403[++field408 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field58;
                        var9 = var25.field61;
                        var7 = -1;
                        Statics.field404 = var26;
                        Statics.field398 = var27;
                        continue;
                    }
                    if (var390 == 42) {
                        field401[var5++] = client.field663[var9[var7]];
                        continue;
                    }
                    if (var390 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field663[var10001] = field401[var5];
                        continue;
                    }
                    if (var390 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field401[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field407[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2422;
                                }
                                field400[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var390 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field401[var5];
                        if (var37 >= 0 && var37 < field407[var36]) {
                            field401[var5++] = field400[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var390 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field401[var5];
                        if (var39 >= 0 && var39 < field407[var38]) {
                            field400[var38][var39] = field401[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var390 == 47) {
                        String var40 = client.field664[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field402[var6++] = var40;
                        continue;
                    }
                    if (var390 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field664[var10001] = field402[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var390 < 1000) {
                    if (var390 == 100) {
                        var5 -= 3;
                        int var42 = field401[var5];
                        int var43 = field401[var5 + 1];
                        int var44 = field401[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class160 var45 = class160.method628(var42);
                        if (var45.field2705 == null) {
                            var45.field2705 = new class160[var44 + 1];
                        }
                        if (var45.field2705.length <= var44) {
                            class160[] var46 = new class160[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2705.length; var47++) {
                                var46[var47] = var45.field2705[var47];
                            }
                            var45.field2705 = var46;
                        }
                        if (var44 > 0 && var45.field2705[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class160 var48 = new class160();
                        var48.field2698 = var43;
                        var48.field2627 = var48.field2616 = var45.field2616;
                        var48.field2617 = var44;
                        var48.field2615 = true;
                        var45.field2705[var44] = var48;
                        if (var41) {
                            Statics.field174 = var48;
                        } else {
                            Statics.field396 = var48;
                        }
                        client.method882(var45);
                        continue;
                    }
                    if (var390 == 101) {
                        class160 var49 = var41 ? Statics.field174 : Statics.field396;
                        class160 var50 = class160.method628(var49.field2616);
                        var50.field2705[var49.field2617] = null;
                        client.method882(var50);
                        continue;
                    }
                    if (var390 == 102) {
                        var5--;
                        class160 var51 = class160.method628(field401[var5]);
                        var51.field2705 = null;
                        client.method882(var51);
                        continue;
                    }
                    if (var390 == 200) {
                        var5 -= 2;
                        int var52 = field401[var5];
                        int var53 = field401[var5 + 1];
                        class160 var54 = class160.method141(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field401[var5++] = 1;
                            if (var41) {
                                Statics.field174 = var54;
                            } else {
                                Statics.field396 = var54;
                            }
                            continue;
                        }
                        field401[var5++] = 0;
                        continue;
                    }
                } else if (!(var390 < 1000 || var390 >= 1100) || !(var390 < 2000 || var390 >= 2100)) {
                    class160 var55;
                    if (var390 >= 2000) {
                        var390 -= 1000;
                        var5--;
                        var55 = class160.method628(field401[var5]);
                    } else {
                        var55 = var41 ? Statics.field174 : Statics.field396;
                    }
                    if (var390 == 1000) {
                        var5 -= 2;
                        var55.field2621 = field401[var5];
                        var55.field2622 = field401[var5 + 1];
                        client.method882(var55);
                        continue;
                    }
                    if (var390 == 1001) {
                        var5 -= 2;
                        var55.field2625 = field401[var5];
                        var55.field2626 = field401[var5 + 1];
                        client.method882(var55);
                        continue;
                    }
                    if (var390 == 1003) {
                        var5--;
                        boolean var56 = field401[var5] == 1;
                        if (var55.field2715 != var56) {
                            var55.field2715 = var56;
                            client.method882(var55);
                        }
                        continue;
                    }
                } else if (var390 >= 1100 && var390 < 1200 || var390 >= 2100 && var390 < 2200) {
                    class160 var57;
                    if (var390 >= 2000) {
                        var390 -= 1000;
                        var5--;
                        var57 = class160.method628(field401[var5]);
                    } else {
                        var57 = var41 ? Statics.field174 : Statics.field396;
                    }
                    if (var390 == 1100) {
                        var5 -= 2;
                        var57.field2629 = field401[var5];
                        if (var57.field2629 > var57.field2689 - var57.field2625) {
                            var57.field2629 = var57.field2689 - var57.field2625;
                        }
                        if (var57.field2629 < 0) {
                            var57.field2629 = 0;
                        }
                        var57.field2658 = field401[var5 + 1];
                        if (var57.field2658 > var57.field2632 - var57.field2626) {
                            var57.field2658 = var57.field2632 - var57.field2626;
                        }
                        if (var57.field2658 < 0) {
                            var57.field2658 = 0;
                        }
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1101) {
                        var5--;
                        var57.field2633 = field401[var5];
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1102) {
                        var5--;
                        var57.field2637 = field401[var5] == 1;
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1103) {
                        var5--;
                        var57.field2678 = field401[var5];
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1104) {
                        var5--;
                        var57.field2646 = field401[var5];
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1105) {
                        var5--;
                        var57.field2640 = field401[var5];
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1106) {
                        var5--;
                        var57.field2642 = field401[var5];
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1107) {
                        var5--;
                        var57.field2695 = field401[var5] == 1;
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1108) {
                        var57.field2716 = 1;
                        var5--;
                        var57.field2649 = field401[var5];
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1109) {
                        var5 -= 6;
                        var57.field2654 = field401[var5];
                        var57.field2655 = field401[var5 + 1];
                        var57.field2656 = field401[var5 + 2];
                        var57.field2648 = field401[var5 + 3];
                        var57.field2657 = field401[var5 + 4];
                        var57.field2674 = field401[var5 + 5];
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1110) {
                        var5--;
                        int var58 = field401[var5];
                        if (var57.field2724 != var58) {
                            var57.field2724 = var58;
                            var57.field2722 = 0;
                            var57.field2723 = 0;
                            client.method882(var57);
                        }
                        continue;
                    }
                    if (var390 == 1111) {
                        var5--;
                        var57.field2639 = field401[var5] == 1;
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1112) {
                        var6--;
                        String var59 = field402[var6];
                        if (!var59.equals(var57.field2663)) {
                            var57.field2663 = var59;
                            client.method882(var57);
                        }
                        continue;
                    }
                    if (var390 == 1113) {
                        var5--;
                        var57.field2710 = field401[var5];
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1114) {
                        var5 -= 3;
                        var57.field2666 = field401[var5];
                        var57.field2662 = field401[var5 + 1];
                        var57.field2703 = field401[var5 + 2];
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1115) {
                        var5--;
                        var57.field2668 = field401[var5] == 1;
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1116) {
                        var5--;
                        var57.field2704 = field401[var5];
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1117) {
                        var5--;
                        var57.field2681 = field401[var5];
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1118) {
                        var5--;
                        var57.field2653 = field401[var5] == 1;
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1119) {
                        var5--;
                        var57.field2647 = field401[var5] == 1;
                        client.method882(var57);
                        continue;
                    }
                    if (var390 == 1120) {
                        var5 -= 2;
                        var57.field2689 = field401[var5];
                        var57.field2632 = field401[var5 + 1];
                        client.method882(var57);
                        continue;
                    }
                } else if (var390 >= 1200 && var390 < 1300 || var390 >= 2200 && var390 < 2300) {
                    class160 var60;
                    if (var390 >= 2000) {
                        var390 -= 1000;
                        var5--;
                        var60 = class160.method628(field401[var5]);
                    } else {
                        var60 = var41 ? Statics.field174 : Statics.field396;
                    }
                    client.method882(var60);
                    if (var390 == 1200) {
                        var5 -= 2;
                        int var61 = field401[var5];
                        int var62 = field401[var5 + 1];
                        var60.field2720 = var61;
                        var60.field2631 = var62;
                        class40 var63 = class40.method1243(var61);
                        var60.field2656 = var63.field984;
                        var60.field2648 = var63.field985;
                        var60.field2657 = var63.field986;
                        var60.field2654 = var63.field980;
                        var60.field2655 = var63.field1019;
                        var60.field2674 = var63.field988;
                        if (var60.field2625 > 0) {
                            var60.field2674 = var60.field2674 * 32 / var60.field2625;
                        }
                        continue;
                    }
                    if (var390 == 1201) {
                        var60.field2716 = 2;
                        var5--;
                        var60.field2649 = field401[var5];
                        continue;
                    }
                    if (var390 == 1202) {
                        var60.field2716 = 3;
                        var60.field2649 = Statics.field1096.field28.method3225();
                        continue;
                    }
                } else if (var390 >= 1300 && var390 < 1400 || var390 >= 2300 && var390 < 2400) {
                    class160 var64;
                    if (var390 >= 2000) {
                        var390 -= 1000;
                        var5--;
                        var64 = class160.method628(field401[var5]);
                    } else {
                        var64 = var41 ? Statics.field174 : Statics.field396;
                    }
                    if (var390 == 1300) {
                        var5--;
                        int var65 = field401[var5] - 1;
                        if (var65 >= 0 && var65 <= 9) {
                            var6--;
                            var64.method3148(var65, field402[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var390 == 1301) {
                        var5 -= 2;
                        int var66 = field401[var5];
                        int var67 = field401[var5 + 1];
                        var64.field2714 = class160.method141(var66, var67);
                        continue;
                    }
                    if (var390 == 1302) {
                        var5--;
                        var64.field2721 = field401[var5] == 1;
                        continue;
                    }
                    if (var390 == 1303) {
                        var5--;
                        var64.field2679 = field401[var5];
                        continue;
                    }
                    if (var390 == 1304) {
                        var5--;
                        var64.field2712 = field401[var5];
                        continue;
                    }
                    if (var390 == 1305) {
                        var6--;
                        var64.field2676 = field402[var6];
                        continue;
                    }
                    if (var390 == 1306) {
                        var6--;
                        var64.field2609 = field402[var6];
                        continue;
                    }
                    if (var390 == 1307) {
                        var64.field2677 = null;
                        continue;
                    }
                } else {
                    if (var390 >= 1400 && var390 < 1500 || var390 >= 2400 && var390 < 2500) {
                        class160 var68;
                        if (var390 >= 2000) {
                            var390 -= 1000;
                            var5--;
                            var68 = class160.method628(field401[var5]);
                        } else {
                            var68 = var41 ? Statics.field174 : Statics.field396;
                        }
                        var6--;
                        String var69 = field402[var6];
                        int[] var70 = null;
                        if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                            var5--;
                            int var71 = field401[var5];
                            if (var71 > 0) {
                                var70 = new int[var71];
                                while (var71-- > 0) {
                                    var5--;
                                    var70[var71] = field401[var5];
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
                                var72[var73] = Integer.valueOf(field401[var5]);
                            }
                        }
                        var5--;
                        int var74 = field401[var5];
                        if (var74 == -1) {
                            var72 = null;
                        } else {
                            var72[0] = Integer.valueOf(var74);
                        }
                        if (var390 == 1400) {
                            var68.field2685 = var72;
                        }
                        if (var390 == 1401) {
                            var68.field2713 = var72;
                        }
                        if (var390 == 1402) {
                            var68.field2687 = var72;
                        }
                        if (var390 == 1403) {
                            var68.field2694 = var72;
                        }
                        if (var390 == 1404) {
                            var68.field2691 = var72;
                        }
                        if (var390 == 1405) {
                            var68.field2692 = var72;
                        }
                        if (var390 == 1406) {
                            var68.field2628 = var72;
                        }
                        if (var390 == 1407) {
                            var68.field2696 = var72;
                            var68.field2697 = var70;
                        }
                        if (var390 == 1408) {
                            var68.field2702 = var72;
                        }
                        if (var390 == 1409) {
                            var68.field2659 = var72;
                        }
                        if (var390 == 1410) {
                            var68.field2693 = var72;
                        }
                        if (var390 == 1411) {
                            var68.field2686 = var72;
                        }
                        if (var390 == 1412) {
                            var68.field2690 = var72;
                        }
                        if (var390 == 1414) {
                            var68.field2729 = var72;
                            var68.field2638 = var70;
                        }
                        if (var390 == 1415) {
                            var68.field2700 = var72;
                            var68.field2701 = var70;
                        }
                        if (var390 == 1416) {
                            var68.field2680 = var72;
                        }
                        if (var390 == 1417) {
                            var68.field2612 = var72;
                        }
                        if (var390 == 1418) {
                            var68.field2665 = var72;
                        }
                        if (var390 == 1419) {
                            var68.field2641 = var72;
                        }
                        if (var390 == 1420) {
                            var68.field2667 = var72;
                        }
                        if (var390 == 1421) {
                            var68.field2708 = var72;
                        }
                        if (var390 == 1422) {
                            var68.field2709 = var72;
                        }
                        if (var390 == 1423) {
                            var68.field2661 = var72;
                        }
                        if (var390 == 1424) {
                            var68.field2711 = var72;
                        }
                        var68.field2623 = true;
                        continue;
                    }
                    if (var390 < 1600) {
                        class160 var75 = var41 ? Statics.field174 : Statics.field396;
                        if (var390 == 1500) {
                            field401[var5++] = var75.field2621;
                            continue;
                        }
                        if (var390 == 1501) {
                            field401[var5++] = var75.field2622;
                            continue;
                        }
                        if (var390 == 1502) {
                            field401[var5++] = var75.field2625;
                            continue;
                        }
                        if (var390 == 1503) {
                            field401[var5++] = var75.field2626;
                            continue;
                        }
                        if (var390 == 1504) {
                            field401[var5++] = var75.field2715 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 1505) {
                            field401[var5++] = var75.field2627;
                            continue;
                        }
                    } else if (var390 < 1700) {
                        class160 var76 = var41 ? Statics.field174 : Statics.field396;
                        if (var390 == 1600) {
                            field401[var5++] = var76.field2629;
                            continue;
                        }
                        if (var390 == 1601) {
                            field401[var5++] = var76.field2658;
                            continue;
                        }
                        if (var390 == 1602) {
                            field402[var6++] = var76.field2663;
                            continue;
                        }
                        if (var390 == 1603) {
                            field401[var5++] = var76.field2689;
                            continue;
                        }
                        if (var390 == 1604) {
                            field401[var5++] = var76.field2632;
                            continue;
                        }
                        if (var390 == 1605) {
                            field401[var5++] = var76.field2674;
                            continue;
                        }
                        if (var390 == 1606) {
                            field401[var5++] = var76.field2656;
                            continue;
                        }
                        if (var390 == 1607) {
                            field401[var5++] = var76.field2657;
                            continue;
                        }
                        if (var390 == 1608) {
                            field401[var5++] = var76.field2648;
                            continue;
                        }
                    } else if (var390 < 1800) {
                        class160 var77 = var41 ? Statics.field174 : Statics.field396;
                        if (var390 == 1700) {
                            field401[var5++] = var77.field2720;
                            continue;
                        }
                        if (var390 == 1701) {
                            if (var77.field2720 == -1) {
                                field401[var5++] = 0;
                            } else {
                                field401[var5++] = var77.field2631;
                            }
                            continue;
                        }
                        if (var390 == 1702) {
                            field401[var5++] = var77.field2617;
                            continue;
                        }
                    } else if (var390 < 1900) {
                        class160 var78 = var41 ? Statics.field174 : Statics.field396;
                        if (var390 == 1800) {
                            int[] var79 = field401;
                            int var80 = var5++;
                            int var81 = client.method216(var78);
                            int var82 = var81 >> 11 & 0x3F;
                            var79[var80] = var82;
                            continue;
                        }
                        if (var390 == 1801) {
                            var5--;
                            int var83 = field401[var5];
                            int var391 = var83 - 1;
                            if (var78.field2677 != null && var391 < var78.field2677.length && var78.field2677[var391] != null) {
                                field402[var6++] = var78.field2677[var391];
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var390 == 1802) {
                            if (var78.field2676 == null) {
                                field402[var6++] = "";
                            } else {
                                field402[var6++] = var78.field2676;
                            }
                            continue;
                        }
                    } else if (var390 < 2600) {
                        var5--;
                        class160 var84 = class160.method628(field401[var5]);
                        if (var390 == 2500) {
                            field401[var5++] = var84.field2621;
                            continue;
                        }
                        if (var390 == 2501) {
                            field401[var5++] = var84.field2622;
                            continue;
                        }
                        if (var390 == 2502) {
                            field401[var5++] = var84.field2625;
                            continue;
                        }
                        if (var390 == 2503) {
                            field401[var5++] = var84.field2626;
                            continue;
                        }
                        if (var390 == 2504) {
                            field401[var5++] = var84.field2715 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 2505) {
                            field401[var5++] = var84.field2627;
                            continue;
                        }
                    } else if (var390 < 2700) {
                        var5--;
                        class160 var85 = class160.method628(field401[var5]);
                        if (var390 == 2600) {
                            field401[var5++] = var85.field2629;
                            continue;
                        }
                        if (var390 == 2601) {
                            field401[var5++] = var85.field2658;
                            continue;
                        }
                        if (var390 == 2602) {
                            field402[var6++] = var85.field2663;
                            continue;
                        }
                        if (var390 == 2603) {
                            field401[var5++] = var85.field2689;
                            continue;
                        }
                        if (var390 == 2604) {
                            field401[var5++] = var85.field2632;
                            continue;
                        }
                        if (var390 == 2605) {
                            field401[var5++] = var85.field2674;
                            continue;
                        }
                        if (var390 == 2606) {
                            field401[var5++] = var85.field2656;
                            continue;
                        }
                        if (var390 == 2607) {
                            field401[var5++] = var85.field2657;
                            continue;
                        }
                        if (var390 == 2608) {
                            field401[var5++] = var85.field2648;
                            continue;
                        }
                    } else if (var390 < 2800) {
                        if (var390 == 2700) {
                            var5--;
                            class160 var86 = class160.method628(field401[var5]);
                            field401[var5++] = var86.field2720;
                            continue;
                        }
                        if (var390 == 2701) {
                            var5--;
                            class160 var87 = class160.method628(field401[var5]);
                            if (var87.field2720 == -1) {
                                field401[var5++] = 0;
                            } else {
                                field401[var5++] = var87.field2631;
                            }
                            continue;
                        }
                        if (var390 == 2702) {
                            var5--;
                            int var88 = field401[var5];
                            class4 var89 = (class4) client.field630.method3300((long) var88);
                            if (var89 == null) {
                                field401[var5++] = 0;
                            } else {
                                field401[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var390 < 2900) {
                        var5--;
                        class160 var90 = class160.method628(field401[var5]);
                        if (var390 == 2800) {
                            int[] var91 = field401;
                            int var92 = var5++;
                            int var93 = client.method216(var90);
                            int var94 = var93 >> 11 & 0x3F;
                            var91[var92] = var94;
                            continue;
                        }
                        if (var390 == 2801) {
                            var5--;
                            int var95 = field401[var5];
                            int var392 = var95 - 1;
                            if (var90.field2677 != null && var392 < var90.field2677.length && var90.field2677[var392] != null) {
                                field402[var6++] = var90.field2677[var392];
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var390 == 2802) {
                            if (var90.field2676 == null) {
                                field402[var6++] = "";
                            } else {
                                field402[var6++] = var90.field2676;
                            }
                            continue;
                        }
                    } else if (var390 < 3200) {
                        if (var390 == 3100) {
                            var6--;
                            String var96 = field402[var6];
                            client.method220(0, "", var96);
                            continue;
                        }
                        if (var390 == 3101) {
                            var5 -= 2;
                            client.method170(Statics.field1096, field401[var5], field401[var5 + 1]);
                            continue;
                        }
                        if (var390 == 3103) {
                            client.field513.method2326(54);
                            for (class4 var97 = (class4) client.field630.method3317(); var97 != null; var97 = (class4) client.field630.method3299()) {
                                if (var97.field49 == 0 || var97.field49 == 3) {
                                    client.method2727(var97, true);
                                }
                            }
                            if (client.field633 != null) {
                                client.method882(client.field633);
                                client.field633 = null;
                            }
                            continue;
                        }
                        if (var390 == 3104) {
                            var6--;
                            String var98 = field402[var6];
                            int var99 = 0;
                            boolean var100 = false;
                            boolean var101 = false;
                            int var102 = 0;
                            int var103 = var98.length();
                            int var104 = 0;
                            boolean var106;
                            while (true) {
                                if (var104 >= var103) {
                                    var106 = var101;
                                    break;
                                }
                                label2610: {
                                    char var105 = var98.charAt(var104);
                                    if (var104 == 0) {
                                        if (var105 == '-') {
                                            var100 = true;
                                            break label2610;
                                        }
                                        if (var105 == '+') {
                                            break label2610;
                                        }
                                    }
                                    int var393;
                                    if (var105 >= '0' && var105 <= '9') {
                                        var393 = var105 - '0';
                                    } else if (var105 >= 'A' && var105 <= 'Z') {
                                        var393 = var105 - '7';
                                    } else {
                                        if (var105 < 'a' || var105 > 'z') {
                                            var106 = false;
                                            break;
                                        }
                                        var393 = var105 - 'W';
                                    }
                                    if (var393 >= 10) {
                                        var106 = false;
                                        break;
                                    }
                                    if (var100) {
                                        var393 = -var393;
                                    }
                                    int var107 = var102 * 10 + var393;
                                    if (var107 / 10 != var102) {
                                        var106 = false;
                                        break;
                                    }
                                    var102 = var107;
                                    var101 = true;
                                }
                                var104++;
                            }
                            if (var106) {
                                var99 = class149.method2887(var98);
                            }
                            client.field513.method2326(10);
                            client.field513.method2540(var99);
                            continue;
                        }
                        if (var390 == 3105) {
                            var6--;
                            String var109 = field402[var6];
                            client.field513.method2326(20);
                            client.field513.method2493(var109.length() + 1);
                            client.field513.method2428(var109);
                            continue;
                        }
                        if (var390 == 3106) {
                            var6--;
                            String var110 = field402[var6];
                            client.field513.method2326(78);
                            client.field513.method2493(var110.length() + 1);
                            client.field513.method2428(var110);
                            continue;
                        }
                        if (var390 == 3107) {
                            var5--;
                            int var111 = field401[var5];
                            var6--;
                            String var112 = field402[var6];
                            boolean var113 = false;
                            for (int var114 = 0; var114 < client.field590; var114++) {
                                class3 var115 = client.field595[client.field591[var114]];
                                if (var115 != null && var115.field41 != null && var115.field41.equalsIgnoreCase(var112)) {
                                    if (var111 == 1) {
                                        client.field513.method2326(145);
                                        client.field513.method2458(0);
                                        client.field513.method2467(client.field591[var114]);
                                    } else if (var111 == 4) {
                                        client.field513.method2326(113);
                                        client.field513.method2460(0);
                                        client.field513.method2424(client.field591[var114]);
                                    } else if (var111 == 6) {
                                        client.field513.method2326(24);
                                        client.field513.method2444(client.field591[var114]);
                                        client.field513.method2458(0);
                                    } else if (var111 == 7) {
                                        client.field513.method2326(241);
                                        client.field513.method2444(client.field591[var114]);
                                        client.field513.method2458(0);
                                    }
                                    var113 = true;
                                    break;
                                }
                            }
                            if (!var113) {
                                client.method220(4, "", class136.field2228 + var112);
                            }
                            continue;
                        }
                        if (var390 == 3108) {
                            var5 -= 3;
                            int var116 = field401[var5];
                            int var117 = field401[var5 + 1];
                            int var118 = field401[var5 + 2];
                            class160 var119 = class160.method628(var118);
                            client.method1(var119, var116, var117);
                            continue;
                        }
                        if (var390 == 3109) {
                            var5 -= 2;
                            int var120 = field401[var5];
                            int var121 = field401[var5 + 1];
                            class160 var122 = var41 ? Statics.field174 : Statics.field396;
                            client.method1(var122, var120, var121);
                            continue;
                        }
                        if (var390 == 3110) {
                            var5--;
                            Statics.field249 = field401[var5] == 1;
                            continue;
                        }
                    } else if (var390 < 3300) {
                        if (var390 == 3200) {
                            var5 -= 3;
                            int var123 = field401[var5];
                            int var124 = field401[var5 + 1];
                            int var125 = field401[var5 + 2];
                            if (client.field707 != 0 && var124 != 0 && client.field718 < 50) {
                                client.field710[client.field718] = var123;
                                client.field542[client.field718] = var124;
                                client.field712[client.field718] = var125;
                                client.field613[client.field718] = null;
                                client.field672[client.field718] = 0;
                                client.field718++;
                            }
                            continue;
                        }
                        if (var390 == 3201) {
                            var5--;
                            int var126 = field401[var5];
                            if (var126 == -1 && !client.field706) {
                                class140.method805();
                            } else if (var126 != -1 && client.field657 != var126 && client.field552 != 0 && !client.field706) {
                                class156 var127 = Statics.field544;
                                int var128 = client.field552;
                                class140.field2352 = 1;
                                Statics.field2353 = var127;
                                Statics.field2355 = var126;
                                Statics.field2358 = 0;
                                Statics.field2356 = var128;
                                Statics.field2334 = false;
                                Statics.field2357 = 2;
                            }
                            client.field657 = var126;
                            continue;
                        }
                        if (var390 == 3202) {
                            var5 -= 2;
                            client.method753(field401[var5], field401[var5 + 1]);
                            continue;
                        }
                    } else if (var390 < 3400) {
                        if (var390 == 3300) {
                            field401[var5++] = client.field723;
                            continue;
                        }
                        if (var390 == 3301) {
                            var5 -= 2;
                            int var129 = field401[var5];
                            int var130 = field401[var5 + 1];
                            int[] var131 = field401;
                            int var132 = var5++;
                            class19 var133 = (class19) class19.field278.method3300((long) var129);
                            int var134;
                            if (var133 == null) {
                                var134 = -1;
                            } else if (var130 >= 0 && var130 < var133.field267.length) {
                                var134 = var133.field267[var130];
                            } else {
                                var134 = -1;
                            }
                            var131[var132] = var134;
                            continue;
                        }
                        if (var390 == 3302) {
                            var5 -= 2;
                            int var135 = field401[var5];
                            int var136 = field401[var5 + 1];
                            field401[var5++] = Statics.method231(var135, var136);
                            continue;
                        }
                        if (var390 == 3303) {
                            var5 -= 2;
                            int var137 = field401[var5];
                            int var138 = field401[var5 + 1];
                            field401[var5++] = class19.method3007(var137, var138);
                            continue;
                        }
                        if (var390 == 3304) {
                            var5--;
                            int var139 = field401[var5];
                            int[] var140 = field401;
                            int var141 = var5++;
                            class41 var142 = (class41) class41.field1020.method3255((long) var139);
                            class41 var143;
                            if (var142 == null) {
                                byte[] var144 = Statics.field1029.method3029(5, var139);
                                class41 var145 = new class41();
                                if (var144 != null) {
                                    var145.method883(new class127(var144));
                                }
                                class41.field1020.method3253(var145, (long) var139);
                                var143 = var145;
                            } else {
                                var143 = var142;
                            }
                            var140[var141] = var143.field1021;
                            continue;
                        }
                        if (var390 == 3305) {
                            var5--;
                            int var146 = field401[var5];
                            field401[var5++] = client.field607[var146];
                            continue;
                        }
                        if (var390 == 3306) {
                            var5--;
                            int var147 = field401[var5];
                            field401[var5++] = client.field608[var147];
                            continue;
                        }
                        if (var390 == 3307) {
                            var5--;
                            int var148 = field401[var5];
                            field401[var5++] = client.field609[var148];
                            continue;
                        }
                        if (var390 == 3308) {
                            int var149 = Statics.field1030;
                            int var150 = (Statics.field1096.field442 >> 7) + Statics.field252;
                            int var151 = (Statics.field1096.field430 >> 7) + Statics.field924;
                            field401[var5++] = (var149 << 28) + (var150 << 14) + var151;
                            continue;
                        }
                        if (var390 == 3309) {
                            var5--;
                            int var152 = field401[var5];
                            field401[var5++] = var152 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var390 == 3310) {
                            var5--;
                            int var153 = field401[var5];
                            field401[var5++] = var153 >> 28;
                            continue;
                        }
                        if (var390 == 3311) {
                            var5--;
                            int var154 = field401[var5];
                            field401[var5++] = var154 & 0x3FFF;
                            continue;
                        }
                        if (var390 == 3312) {
                            field401[var5++] = client.field478 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 3313) {
                            var5 -= 2;
                            int var155 = field401[var5] + 32768;
                            int var156 = field401[var5 + 1];
                            int[] var157 = field401;
                            int var158 = var5++;
                            class19 var159 = (class19) class19.field278.method3300((long) var155);
                            int var160;
                            if (var159 == null) {
                                var160 = -1;
                            } else if (var156 >= 0 && var156 < var159.field267.length) {
                                var160 = var159.field267[var156];
                            } else {
                                var160 = -1;
                            }
                            var157[var158] = var160;
                            continue;
                        }
                        if (var390 == 3314) {
                            var5 -= 2;
                            int var161 = field401[var5] + 32768;
                            int var162 = field401[var5 + 1];
                            field401[var5++] = Statics.method231(var161, var162);
                            continue;
                        }
                        if (var390 == 3315) {
                            var5 -= 2;
                            int var163 = field401[var5] + 32768;
                            int var164 = field401[var5 + 1];
                            field401[var5++] = class19.method3007(var163, var164);
                            continue;
                        }
                        if (var390 == 3316) {
                            if (client.field578 >= 2) {
                                field401[var5++] = client.field578;
                            } else {
                                field401[var5++] = 0;
                            }
                            continue;
                        }
                        if (var390 == 3317) {
                            field401[var5++] = client.field472;
                            continue;
                        }
                        if (var390 == 3318) {
                            field401[var5++] = client.field474;
                            continue;
                        }
                        if (var390 == 3321) {
                            field401[var5++] = client.field634;
                            continue;
                        }
                        if (var390 == 3322) {
                            field401[var5++] = client.field635;
                            continue;
                        }
                        if (var390 == 3323) {
                            if (client.field637) {
                                field401[var5++] = 1;
                            } else {
                                field401[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var390 < 3500) {
                        if (var390 == 3400) {
                            var5 -= 2;
                            int var165 = field401[var5];
                            int var166 = field401[var5 + 1];
                            class39 var167 = class39.method745(var165);
                            if (var167.field965 != 's') {
                            }
                            for (int var168 = 0; var168 < var167.field961; var168++) {
                                if (var167.field962[var168] == var166) {
                                    field402[var6++] = var167.field958[var168];
                                    var167 = null;
                                    break;
                                }
                            }
                            if (var167 != null) {
                                field402[var6++] = var167.field968;
                            }
                            continue;
                        }
                        if (var390 == 3408) {
                            var5 -= 4;
                            int var169 = field401[var5];
                            int var170 = field401[var5 + 1];
                            int var171 = field401[var5 + 2];
                            int var172 = field401[var5 + 3];
                            class39 var173 = class39.method745(var171);
                            if (var173.field957 == var169 && var173.field965 == var170) {
                                for (int var174 = 0; var174 < var173.field961; var174++) {
                                    if (var173.field962[var174] == var172) {
                                        if (var170 == 115) {
                                            field402[var6++] = var173.field958[var174];
                                        } else {
                                            field401[var5++] = var173.field963[var174];
                                        }
                                        var173 = null;
                                        break;
                                    }
                                }
                                if (var173 != null) {
                                    if (var170 == 115) {
                                        field402[var6++] = var173.field968;
                                    } else {
                                        field401[var5++] = var173.field960;
                                    }
                                }
                                continue;
                            }
                            if (var170 == 115) {
                                field402[var6++] = "null";
                            } else {
                                field401[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var390 < 3700) {
                        if (var390 == 3600) {
                            if (client.field722 == 0) {
                                field401[var5++] = -2;
                            } else if (client.field722 == 1) {
                                field401[var5++] = -1;
                            } else {
                                field401[var5++] = client.field538;
                            }
                            continue;
                        }
                        if (var390 == 3601) {
                            var5--;
                            int var175 = field401[var5];
                            if (client.field722 == 2 && var175 < client.field538) {
                                field402[var6++] = client.field645[var175].field366;
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var390 == 3602) {
                            var5--;
                            int var176 = field401[var5];
                            if (client.field722 == 2 && var176 < client.field538) {
                                field401[var5++] = client.field645[var176].field360;
                                continue;
                            }
                            field401[var5++] = 0;
                            continue;
                        }
                        if (var390 == 3603) {
                            var5--;
                            int var177 = field401[var5];
                            if (client.field722 == 2 && var177 < client.field538) {
                                field401[var5++] = client.field645[var177].field361;
                                continue;
                            }
                            field401[var5++] = 0;
                            continue;
                        }
                        if (var390 == 3604) {
                            var6--;
                            String var178 = field402[var6];
                            var5--;
                            int var179 = field401[var5];
                            client.field513.method2326(139);
                            class116 var180 = client.field513;
                            int var181 = var178.length() + 1;
                            var180.method2493(var181 + 1);
                            client.field513.method2493(var179);
                            client.field513.method2428(var178);
                            continue;
                        }
                        if (var390 == 3605) {
                            var6--;
                            String var182 = field402[var6];
                            client.method855(var182);
                            continue;
                        }
                        if (var390 == 3606) {
                            var6--;
                            String var183 = field402[var6];
                            if (var183 == null) {
                                continue;
                            }
                            String var184 = class150.method159(var183, Statics.field103);
                            if (var184 == null) {
                                continue;
                            }
                            int var185 = 0;
                            while (true) {
                                if (var185 >= client.field538) {
                                    continue label2422;
                                }
                                class23 var186 = client.field645[var185];
                                String var187 = var186.field366;
                                String var188 = class150.method159(var187, Statics.field103);
                                boolean var189;
                                if (var183 == null || var187 == null) {
                                    var189 = false;
                                } else if (var183.startsWith("#") || var187.startsWith("#")) {
                                    var189 = var183.equals(var187);
                                } else {
                                    var189 = var184.equals(var188);
                                }
                                if (var189) {
                                    client.field538--;
                                    for (int var190 = var185; var190 < client.field538; var190++) {
                                        client.field645[var190] = client.field645[var190 + 1];
                                    }
                                    client.field660 = client.field556;
                                    client.field513.method2326(204);
                                    class116 var191 = client.field513;
                                    int var192 = var183.length() + 1;
                                    var191.method2493(var192);
                                    client.field513.method2428(var183);
                                    continue label2422;
                                }
                                var185++;
                            }
                        }
                        if (var390 == 3607) {
                            var6--;
                            String var193 = field402[var6];
                            if (var193 == null) {
                                continue;
                            }
                            if ((client.field725 < 100 || client.field596 == 1) && client.field725 < 400) {
                                String var194 = class150.method159(var193, Statics.field103);
                                if (var194 == null) {
                                    continue;
                                }
                                for (int var195 = 0; var195 < client.field725; var195++) {
                                    class11 var196 = client.field610[var195];
                                    String var197 = class150.method159(var196.field159, Statics.field103);
                                    if (var197 != null && var197.equals(var194)) {
                                        client.method220(31, "", var193 + class136.field2248);
                                        continue label2422;
                                    }
                                    if (var196.field164 != null) {
                                        String var198 = class150.method159(var196.field164, Statics.field103);
                                        if (var198 != null && var198.equals(var194)) {
                                            client.method220(31, "", var193 + class136.field2248);
                                            continue label2422;
                                        }
                                    }
                                }
                                for (int var199 = 0; var199 < client.field538; var199++) {
                                    class23 var200 = client.field645[var199];
                                    String var201 = class150.method159(var200.field366, Statics.field103);
                                    if (var201 != null && var201.equals(var194)) {
                                        client.method220(31, "", class136.field2253 + var193 + class136.field2254);
                                        continue label2422;
                                    }
                                    if (var200.field362 != null) {
                                        String var202 = class150.method159(var200.field362, Statics.field103);
                                        if (var202 != null && var202.equals(var194)) {
                                            client.method220(31, "", class136.field2253 + var193 + class136.field2254);
                                            continue label2422;
                                        }
                                    }
                                }
                                if (class150.method159(Statics.field1096.field41, Statics.field103).equals(var194)) {
                                    client.method220(31, "", class136.field2189);
                                } else {
                                    client.field513.method2326(188);
                                    class116 var203 = client.field513;
                                    int var204 = var193.length() + 1;
                                    var203.method2493(var204);
                                    client.field513.method2428(var193);
                                }
                                continue;
                            }
                            client.method220(31, "", class136.field2247);
                            continue;
                        }
                        if (var390 == 3608) {
                            var6--;
                            String var205 = field402[var6];
                            client.method1189(var205);
                            continue;
                        }
                        if (var390 == 3609) {
                            var6--;
                            String var206 = field402[var6];
                            if (var206.startsWith(class2.method175(0)) || var206.startsWith(class2.method175(1))) {
                                var206 = var206.substring(7);
                            }
                            field401[var5++] = client.method2209(var206) ? 1 : 0;
                            continue;
                        }
                        if (var390 == 3611) {
                            if (client.field573 == null) {
                                field402[var6++] = "";
                            } else {
                                field402[var6++] = class148.method1595(client.field573);
                            }
                            continue;
                        }
                        if (var390 == 3612) {
                            if (client.field573 == null) {
                                field401[var5++] = 0;
                            } else {
                                field401[var5++] = Statics.field764;
                            }
                            continue;
                        }
                        if (var390 == 3613) {
                            var5--;
                            int var207 = field401[var5];
                            if (client.field573 != null && var207 < Statics.field764) {
                                field402[var6++] = Statics.field1200[var207].field100;
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var390 == 3614) {
                            var5--;
                            int var208 = field401[var5];
                            if (client.field573 != null && var208 < Statics.field764) {
                                field401[var5++] = Statics.field1200[var208].field101;
                                continue;
                            }
                            field401[var5++] = 0;
                            continue;
                        }
                        if (var390 == 3615) {
                            var5--;
                            int var209 = field401[var5];
                            if (client.field573 != null && var209 < Statics.field764) {
                                field401[var5++] = Statics.field1200[var209].field107;
                                continue;
                            }
                            field401[var5++] = 0;
                            continue;
                        }
                        if (var390 == 3616) {
                            field401[var5++] = Statics.field259;
                            continue;
                        }
                        if (var390 == 3617) {
                            var6--;
                            String var210 = field402[var6];
                            client.method1513(var210);
                            continue;
                        }
                        if (var390 == 3618) {
                            field401[var5++] = Statics.field2087;
                            continue;
                        }
                        if (var390 == 3619) {
                            var6--;
                            String var211 = field402[var6];
                            if (!var211.equals("")) {
                                client.field513.method2326(244);
                                class116 var212 = client.field513;
                                int var213 = var211.length() + 1;
                                var212.method2493(var213);
                                client.field513.method2428(var211);
                            }
                            continue;
                        }
                        if (var390 == 3620) {
                            client.method1836();
                            continue;
                        }
                        if (var390 == 3621) {
                            if (client.field722 == 0) {
                                field401[var5++] = -1;
                            } else {
                                field401[var5++] = client.field725;
                            }
                            continue;
                        }
                        if (var390 == 3622) {
                            var5--;
                            int var214 = field401[var5];
                            if (client.field722 != 0 && var214 < client.field725) {
                                field402[var6++] = client.field610[var214].field159;
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var390 == 3623) {
                            var6--;
                            String var215 = field402[var6];
                            if (var215.startsWith(class2.method175(0)) || var215.startsWith(class2.method175(1))) {
                                var215 = var215.substring(7);
                            }
                            field401[var5++] = client.method810(var215) ? 1 : 0;
                            continue;
                        }
                        if (var390 == 3624) {
                            var5--;
                            int var216 = field401[var5];
                            if (Statics.field1200 != null && var216 < Statics.field764 && Statics.field1200[var216].field100.equalsIgnoreCase(Statics.field1096.field41)) {
                                field401[var5++] = 1;
                                continue;
                            }
                            field401[var5++] = 0;
                            continue;
                        }
                        if (var390 == 3625) {
                            if (client.field695 == null) {
                                field402[var6++] = "";
                            } else {
                                field402[var6++] = class148.method1595(client.field695);
                            }
                            continue;
                        }
                    } else if (var390 < 4100) {
                        if (var390 == 4000) {
                            var5 -= 2;
                            int var217 = field401[var5];
                            int var218 = field401[var5 + 1];
                            field401[var5++] = var217 + var218;
                            continue;
                        }
                        if (var390 == 4001) {
                            var5 -= 2;
                            int var219 = field401[var5];
                            int var220 = field401[var5 + 1];
                            field401[var5++] = var219 - var220;
                            continue;
                        }
                        if (var390 == 4002) {
                            var5 -= 2;
                            int var221 = field401[var5];
                            int var222 = field401[var5 + 1];
                            field401[var5++] = var221 * var222;
                            continue;
                        }
                        if (var390 == 4003) {
                            var5 -= 2;
                            int var223 = field401[var5];
                            int var224 = field401[var5 + 1];
                            field401[var5++] = var223 / var224;
                            continue;
                        }
                        if (var390 == 4004) {
                            var5--;
                            int var225 = field401[var5];
                            field401[var5++] = (int) (Math.random() * (double) var225);
                            continue;
                        }
                        if (var390 == 4005) {
                            var5--;
                            int var226 = field401[var5];
                            field401[var5++] = (int) (Math.random() * (double) (var226 + 1));
                            continue;
                        }
                        if (var390 == 4006) {
                            var5 -= 5;
                            int var227 = field401[var5];
                            int var228 = field401[var5 + 1];
                            int var229 = field401[var5 + 2];
                            int var230 = field401[var5 + 3];
                            int var231 = field401[var5 + 4];
                            field401[var5++] = (var228 - var227) * (var231 - var229) / (var230 - var229) + var227;
                            continue;
                        }
                        if (var390 == 4007) {
                            var5 -= 2;
                            int var232 = field401[var5];
                            int var233 = field401[var5 + 1];
                            field401[var5++] = var232 * var233 / 100 + var232;
                            continue;
                        }
                        if (var390 == 4008) {
                            var5 -= 2;
                            int var234 = field401[var5];
                            int var235 = field401[var5 + 1];
                            field401[var5++] = var234 | 0x1 << var235;
                            continue;
                        }
                        if (var390 == 4009) {
                            var5 -= 2;
                            int var236 = field401[var5];
                            int var237 = field401[var5 + 1];
                            field401[var5++] = var236 & -1 - (0x1 << var237);
                            continue;
                        }
                        if (var390 == 4010) {
                            var5 -= 2;
                            int var238 = field401[var5];
                            int var239 = field401[var5 + 1];
                            field401[var5++] = (var238 & 0x1 << var239) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var390 == 4011) {
                            var5 -= 2;
                            int var240 = field401[var5];
                            int var241 = field401[var5 + 1];
                            field401[var5++] = var240 % var241;
                            continue;
                        }
                        if (var390 == 4012) {
                            var5 -= 2;
                            int var242 = field401[var5];
                            int var243 = field401[var5 + 1];
                            if (var242 == 0) {
                                field401[var5++] = 0;
                            } else {
                                field401[var5++] = (int) Math.pow((double) var242, (double) var243);
                            }
                            continue;
                        }
                        if (var390 == 4013) {
                            var5 -= 2;
                            int var244 = field401[var5];
                            int var245 = field401[var5 + 1];
                            if (var244 == 0) {
                                field401[var5++] = 0;
                            } else if (var245 == 0) {
                                field401[var5++] = Integer.MAX_VALUE;
                            } else {
                                field401[var5++] = (int) Math.pow((double) var244, 1.0D / (double) var245);
                            }
                            continue;
                        }
                        if (var390 == 4014) {
                            var5 -= 2;
                            int var246 = field401[var5];
                            int var247 = field401[var5 + 1];
                            field401[var5++] = var246 & var247;
                            continue;
                        }
                        if (var390 == 4015) {
                            var5 -= 2;
                            int var248 = field401[var5];
                            int var249 = field401[var5 + 1];
                            field401[var5++] = var248 | var249;
                            continue;
                        }
                    } else if (var390 < 4200) {
                        if (var390 == 4100) {
                            var6--;
                            String var250 = field402[var6];
                            var5--;
                            int var251 = field401[var5];
                            field402[var6++] = var250 + var251;
                            continue;
                        }
                        if (var390 == 4101) {
                            var6 -= 2;
                            String var252 = field402[var6];
                            String var253 = field402[var6 + 1];
                            field402[var6++] = var252 + var253;
                            continue;
                        }
                        if (var390 == 4102) {
                            var6--;
                            String var254 = field402[var6];
                            var5--;
                            int var255 = field401[var5];
                            field402[var6++] = var254 + class149.method2298(var255, true);
                            continue;
                        }
                        if (var390 == 4103) {
                            var6--;
                            String var256 = field402[var6];
                            field402[var6++] = var256.toLowerCase();
                            continue;
                        }
                        if (var390 == 4104) {
                            var5--;
                            int var257 = field401[var5];
                            long var258 = ((long) var257 + 11745L) * 86400000L;
                            field406.setTime(new Date(var258));
                            int var260 = field406.get(5);
                            int var261 = field406.get(2);
                            int var262 = field406.get(1);
                            field402[var6++] = var260 + "-" + field410[var261] + "-" + var262;
                            continue;
                        }
                        if (var390 == 4105) {
                            var6 -= 2;
                            String var263 = field402[var6];
                            String var264 = field402[var6 + 1];
                            if (Statics.field1096.field28 != null && Statics.field1096.field28.field2759) {
                                field402[var6++] = var264;
                                continue;
                            }
                            field402[var6++] = var263;
                            continue;
                        }
                        if (var390 == 4106) {
                            var5--;
                            int var265 = field401[var5];
                            field402[var6++] = Integer.toString(var265);
                            continue;
                        }
                        if (var390 == 4107) {
                            var6 -= 2;
                            int[] var266 = field401;
                            int var267 = var5++;
                            String var268 = field402[var6];
                            String var269 = field402[var6 + 1];
                            int var270 = client.field503;
                            int var271 = var268.length();
                            int var272 = var269.length();
                            int var273 = 0;
                            int var274 = 0;
                            char var275 = 0;
                            char var276 = 0;
                            int var277;
                            label2260: while (true) {
                                if (var273 - var275 >= var271 && var274 - var276 >= var272) {
                                    int var286 = Math.min(var271, var272);
                                    for (int var287 = 0; var287 < var286; var287++) {
                                        char var290 = var268.charAt(var287);
                                        char var291 = var269.charAt(var287);
                                        if (var290 != var291 && Character.toUpperCase(var290) != Character.toUpperCase(var291)) {
                                            char var292 = Character.toLowerCase(var290);
                                            char var293 = Character.toLowerCase(var291);
                                            if (var292 != var293) {
                                                var277 = class152.method2767(var292, var270) - class152.method2767(var293, var270);
                                                break label2260;
                                            }
                                        }
                                    }
                                    int var294 = var271 - var272;
                                    if (var294 == 0) {
                                        for (int var295 = 0; var295 < var286; var295++) {
                                            char var296 = var268.charAt(var295);
                                            char var297 = var269.charAt(var295);
                                            if (var296 != var297) {
                                                var277 = class152.method2767(var296, var270) - class152.method2767(var297, var270);
                                                break label2260;
                                            }
                                        }
                                        var277 = 0;
                                    } else {
                                        var277 = var294;
                                    }
                                    break;
                                }
                                if (var273 - var275 >= var271) {
                                    var277 = -1;
                                    break;
                                }
                                if (var274 - var276 >= var272) {
                                    var277 = 1;
                                    break;
                                }
                                char var278;
                                if (var275 == 0) {
                                    var278 = var268.charAt(var273++);
                                } else {
                                    var278 = var275;
                                    boolean var279 = false;
                                }
                                char var280;
                                if (var276 == 0) {
                                    var280 = var269.charAt(var274++);
                                } else {
                                    var280 = var276;
                                    boolean var281 = false;
                                }
                                var275 = class152.method2713(var278);
                                var276 = class152.method2713(var280);
                                char var282 = class152.method678(var278, var270);
                                char var283 = class152.method678(var280, var270);
                                if (var282 != var283 && Character.toUpperCase(var282) != Character.toUpperCase(var283)) {
                                    char var284 = Character.toLowerCase(var282);
                                    char var285 = Character.toLowerCase(var283);
                                    if (var284 != var285) {
                                        var277 = class152.method2767(var284, var270) - class152.method2767(var285, var270);
                                        break;
                                    }
                                }
                            }
                            var266[var267] = class149.method232(var277);
                            continue;
                        }
                        if (var390 == 4108) {
                            var6--;
                            String var298 = field402[var6];
                            var5 -= 2;
                            int var299 = field401[var5];
                            int var300 = field401[var5 + 1];
                            byte[] var301 = Statics.field305.method3029(var300, 0);
                            class184 var302 = new class184(var301);
                            field401[var5++] = var302.method3393(var298, var299);
                            continue;
                        }
                        if (var390 == 4109) {
                            var6--;
                            String var303 = field402[var6];
                            var5 -= 2;
                            int var304 = field401[var5];
                            int var305 = field401[var5 + 1];
                            byte[] var306 = Statics.field305.method3029(var305, 0);
                            class184 var307 = new class184(var306);
                            field401[var5++] = var307.method3443(var303, var304);
                            continue;
                        }
                        if (var390 == 4110) {
                            var6 -= 2;
                            String var308 = field402[var6];
                            String var309 = field402[var6 + 1];
                            var5--;
                            if (field401[var5] == 1) {
                                field402[var6++] = var308;
                            } else {
                                field402[var6++] = var309;
                            }
                            continue;
                        }
                        if (var390 == 4111) {
                            var6--;
                            String var310 = field402[var6];
                            field402[var6++] = class186.method3446(var310);
                            continue;
                        }
                        if (var390 == 4112) {
                            var6--;
                            String var311 = field402[var6];
                            var5--;
                            int var312 = field401[var5];
                            field402[var6++] = var311 + (char) var312;
                            continue;
                        }
                        if (var390 == 4113) {
                            var5--;
                            int var313 = field401[var5];
                            int[] var314 = field401;
                            int var315 = var5++;
                            char var316 = (char) var313;
                            boolean var317;
                            if (var316 >= ' ' && var316 <= '~') {
                                var317 = true;
                            } else if (var316 >= 160 && var316 <= 255) {
                                var317 = true;
                            } else if (var316 == 8364 || var316 == 338 || var316 == 8212 || var316 == 339 || var316 == 376) {
                                var317 = true;
                            } else {
                                var317 = false;
                            }
                            var314[var315] = var317 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 4114) {
                            var5--;
                            int var318 = field401[var5];
                            field401[var5++] = class149.method1394((char) var318) ? 1 : 0;
                            continue;
                        }
                        if (var390 == 4115) {
                            var5--;
                            int var319 = field401[var5];
                            field401[var5++] = class149.method1361((char) var319) ? 1 : 0;
                            continue;
                        }
                        if (var390 == 4116) {
                            var5--;
                            int var320 = field401[var5];
                            int[] var321 = field401;
                            int var322 = var5++;
                            char var323 = (char) var320;
                            boolean var324 = var323 >= '0' && var323 <= '9';
                            var321[var322] = var324 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 4117) {
                            var6--;
                            String var325 = field402[var6];
                            if (var325 == null) {
                                field401[var5++] = 0;
                            } else {
                                field401[var5++] = var325.length();
                            }
                            continue;
                        }
                        if (var390 == 4118) {
                            var6--;
                            String var326 = field402[var6];
                            var5 -= 2;
                            int var327 = field401[var5];
                            int var328 = field401[var5 + 1];
                            field402[var6++] = var326.substring(var327, var328);
                            continue;
                        }
                        if (var390 == 4119) {
                            var6--;
                            String var329 = field402[var6];
                            StringBuilder var330 = new StringBuilder(var329.length());
                            boolean var331 = false;
                            for (int var332 = 0; var332 < var329.length(); var332++) {
                                char var333 = var329.charAt(var332);
                                if (var333 == '<') {
                                    var331 = true;
                                } else if (var333 == '>') {
                                    var331 = false;
                                } else if (!var331) {
                                    var330.append(var333);
                                }
                            }
                            field402[var6++] = var330.toString();
                            continue;
                        }
                        if (var390 == 4120) {
                            var6--;
                            String var334 = field402[var6];
                            var5--;
                            int var335 = field401[var5];
                            field401[var5++] = var334.indexOf(var335);
                            continue;
                        }
                    } else if (var390 < 4300) {
                        if (var390 == 4200) {
                            var5--;
                            int var336 = field401[var5];
                            field402[var6++] = class40.method1243(var336).field1010;
                            continue;
                        }
                        if (var390 == 4201) {
                            var5 -= 2;
                            int var337 = field401[var5];
                            int var338 = field401[var5 + 1];
                            class40 var339 = class40.method1243(var337);
                            if (var338 >= 1 && var338 <= 5 && var339.field994[var338 - 1] != null) {
                                field402[var6++] = var339.field994[var338 - 1];
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var390 == 4202) {
                            var5 -= 2;
                            int var340 = field401[var5];
                            int var341 = field401[var5 + 1];
                            class40 var342 = class40.method1243(var340);
                            if (var341 >= 1 && var341 <= 5 && var342.field993[var341 - 1] != null) {
                                field402[var6++] = var342.field993[var341 - 1];
                                continue;
                            }
                            field402[var6++] = "";
                            continue;
                        }
                        if (var390 == 4203) {
                            var5--;
                            int var343 = field401[var5];
                            field401[var5++] = class40.method1243(var343).field990;
                            continue;
                        }
                        if (var390 == 4204) {
                            var5--;
                            int var344 = field401[var5];
                            field401[var5++] = class40.method1243(var344).field989 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 4205) {
                            var5--;
                            int var345 = field401[var5];
                            class40 var346 = class40.method1243(var345);
                            if (var346.field1009 == -1 && var346.field987 >= 0) {
                                field401[var5++] = var346.field987;
                                continue;
                            }
                            field401[var5++] = var345;
                            continue;
                        }
                        if (var390 == 4206) {
                            var5--;
                            int var347 = field401[var5];
                            class40 var348 = class40.method1243(var347);
                            if (var348.field1009 >= 0 && var348.field987 >= 0) {
                                field401[var5++] = var348.field987;
                                continue;
                            }
                            field401[var5++] = var347;
                            continue;
                        }
                        if (var390 == 4207) {
                            var5--;
                            int var349 = field401[var5];
                            field401[var5++] = class40.method1243(var349).field991 ? 1 : 0;
                            continue;
                        }
                    } else if (var390 < 5100) {
                        if (var390 == 5000) {
                            field401[var5++] = client.field686;
                            continue;
                        }
                        if (var390 == 5001) {
                            var5 -= 3;
                            client.field686 = field401[var5];
                            Statics.field287 = class139.method820(field401[var5 + 1]);
                            if (Statics.field287 == null) {
                                Statics.field287 = class139.field2346;
                            }
                            client.field687 = field401[var5 + 2];
                            client.field513.method2326(48);
                            client.field513.method2493(client.field686);
                            client.field513.method2493(Statics.field287.field2343);
                            client.field513.method2493(client.field687);
                            continue;
                        }
                        if (var390 == 5002) {
                            var6--;
                            String var350 = field402[var6];
                            var5 -= 2;
                            int var351 = field401[var5];
                            int var352 = field401[var5 + 1];
                            client.field513.method2326(199);
                            class116 var353 = client.field513;
                            int var354 = var350.length() + 1;
                            var353.method2493(var354 + 2);
                            client.field513.method2428(var350);
                            client.field513.method2493(var351 - 1);
                            client.field513.method2493(var352);
                            continue;
                        }
                        if (var390 == 5003) {
                            var5--;
                            int var355 = field401[var5];
                            String var356 = null;
                            if (var355 < 100) {
                                var356 = client.field620[var355];
                            }
                            if (var356 == null) {
                                var356 = "";
                            }
                            field402[var6++] = var356;
                            continue;
                        }
                        if (var390 == 5004) {
                            var5--;
                            int var357 = field401[var5];
                            int var358 = -1;
                            if (var357 < 100 && client.field620[var357] != null) {
                                var358 = client.field677[var357];
                            }
                            field401[var5++] = var358;
                            continue;
                        }
                        if (var390 == 5005) {
                            if (Statics.field287 == null) {
                                field401[var5++] = -1;
                            } else {
                                field401[var5++] = Statics.field287.field2343;
                            }
                            continue;
                        }
                        if (var390 == 5008) {
                            var6--;
                            String var359 = field402[var6];
                            if (var359.startsWith("::")) {
                                String var360 = var359.substring(2);
                                if (var360.equalsIgnoreCase("toggleroof")) {
                                    Statics.field2592.field173 = !Statics.field2592.field173;
                                    class29 var361 = null;
                                    try {
                                        var361 = class82.method1563("", Statics.field2747.field2078, true);
                                        class127 var362 = Statics.field2592.method120();
                                        var361.method564(var362.field2024, 0, var362.field2022);
                                    } catch (Exception var388) {
                                    }
                                    try {
                                        if (var361 != null) {
                                            var361.method578();
                                        }
                                    } catch (Exception var387) {
                                    }
                                    if (Statics.field2592.field173) {
                                        client.method220(99, "", "Roofs are now all hidden");
                                    } else {
                                        client.method220(99, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field578 >= 2) {
                                    if (var360.equalsIgnoreCase("fpson")) {
                                        client.field654 = true;
                                    }
                                    if (var360.equalsIgnoreCase("fpsoff")) {
                                        client.field654 = false;
                                    }
                                    if (var360.equalsIgnoreCase("gc")) {
                                        System.gc();
                                    }
                                    if (var360.equalsIgnoreCase("clientdrop")) {
                                        Statics.method2419();
                                    }
                                    if (var360.equalsIgnoreCase("errortest") && client.field477 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field513.method2326(213);
                                client.field513.method2493(var360.length() + 1);
                                client.field513.method2428(var360);
                            } else {
                                String var365 = var359.toLowerCase();
                                byte var366 = 0;
                                if (var365.startsWith(class136.field2255)) {
                                    var366 = 0;
                                    var359 = var359.substring(class136.field2255.length());
                                } else if (var365.startsWith(class136.field2257)) {
                                    var366 = 1;
                                    var359 = var359.substring(class136.field2257.length());
                                } else if (var365.startsWith(class136.field2279)) {
                                    var366 = 2;
                                    var359 = var359.substring(class136.field2279.length());
                                } else if (var365.startsWith(class136.field2261)) {
                                    var366 = 3;
                                    var359 = var359.substring(class136.field2261.length());
                                } else if (var365.startsWith(class136.field2263)) {
                                    var366 = 4;
                                    var359 = var359.substring(class136.field2263.length());
                                } else if (var365.startsWith(class136.field2265)) {
                                    var366 = 5;
                                    var359 = var359.substring(class136.field2265.length());
                                } else if (var365.startsWith(class136.field2267)) {
                                    var366 = 6;
                                    var359 = var359.substring(class136.field2267.length());
                                } else if (var365.startsWith(class136.field2269)) {
                                    var366 = 7;
                                    var359 = var359.substring(class136.field2269.length());
                                } else if (var365.startsWith(class136.field2239)) {
                                    var366 = 8;
                                    var359 = var359.substring(class136.field2239.length());
                                } else if (var365.startsWith(class136.field2273)) {
                                    var366 = 9;
                                    var359 = var359.substring(class136.field2273.length());
                                } else if (var365.startsWith(class136.field2275)) {
                                    var366 = 10;
                                    var359 = var359.substring(class136.field2275.length());
                                } else if (var365.startsWith(class136.field2277)) {
                                    var366 = 11;
                                    var359 = var359.substring(class136.field2277.length());
                                } else if (client.field503 != 0) {
                                    if (var365.startsWith(class136.field2165)) {
                                        var366 = 0;
                                        var359 = var359.substring(class136.field2165.length());
                                    } else if (var365.startsWith(class136.field2258)) {
                                        var366 = 1;
                                        var359 = var359.substring(class136.field2258.length());
                                    } else if (var365.startsWith(class136.field2231)) {
                                        var366 = 2;
                                        var359 = var359.substring(class136.field2231.length());
                                    } else if (var365.startsWith(class136.field2262)) {
                                        var366 = 3;
                                        var359 = var359.substring(class136.field2262.length());
                                    } else if (var365.startsWith(class136.field2206)) {
                                        var366 = 4;
                                        var359 = var359.substring(class136.field2206.length());
                                    } else if (var365.startsWith(class136.field2266)) {
                                        var366 = 5;
                                        var359 = var359.substring(class136.field2266.length());
                                    } else if (var365.startsWith(class136.field2321)) {
                                        var366 = 6;
                                        var359 = var359.substring(class136.field2321.length());
                                    } else if (var365.startsWith(class136.field2270)) {
                                        var366 = 7;
                                        var359 = var359.substring(class136.field2270.length());
                                    } else if (var365.startsWith(class136.field2259)) {
                                        var366 = 8;
                                        var359 = var359.substring(class136.field2259.length());
                                    } else if (var365.startsWith(class136.field2274)) {
                                        var366 = 9;
                                        var359 = var359.substring(class136.field2274.length());
                                    } else if (var365.startsWith(class136.field2276)) {
                                        var366 = 10;
                                        var359 = var359.substring(class136.field2276.length());
                                    } else if (var365.startsWith(class136.field2170)) {
                                        var366 = 11;
                                        var359 = var359.substring(class136.field2170.length());
                                    }
                                }
                                String var367 = var359.toLowerCase();
                                byte var368 = 0;
                                if (var367.startsWith(class136.field2207)) {
                                    var368 = 1;
                                    var359 = var359.substring(class136.field2207.length());
                                } else if (var367.startsWith(class136.field2281)) {
                                    var368 = 2;
                                    var359 = var359.substring(class136.field2281.length());
                                } else if (var367.startsWith(class136.field2283)) {
                                    var368 = 3;
                                    var359 = var359.substring(class136.field2283.length());
                                } else if (var367.startsWith(class136.field2285)) {
                                    var368 = 4;
                                    var359 = var359.substring(class136.field2285.length());
                                } else if (var367.startsWith(class136.field2161)) {
                                    var368 = 5;
                                    var359 = var359.substring(class136.field2161.length());
                                } else if (client.field503 != 0) {
                                    if (var367.startsWith(class136.field2280)) {
                                        var368 = 1;
                                        var359 = var359.substring(class136.field2280.length());
                                    } else if (var367.startsWith(class136.field2272)) {
                                        var368 = 2;
                                        var359 = var359.substring(class136.field2272.length());
                                    } else if (var367.startsWith(class136.field2306)) {
                                        var368 = 3;
                                        var359 = var359.substring(class136.field2306.length());
                                    } else if (var367.startsWith(class136.field2286)) {
                                        var368 = 4;
                                        var359 = var359.substring(class136.field2286.length());
                                    } else if (var367.startsWith(class136.field2287)) {
                                        var368 = 5;
                                        var359 = var359.substring(class136.field2287.length());
                                    }
                                }
                                client.field513.method2326(49);
                                client.field513.method2493(0);
                                int var369 = client.field513.field2022;
                                client.field513.method2493(var366);
                                client.field513.method2493(var368);
                                class116 var370 = client.field513;
                                int var371 = var370.field2022;
                                byte[] var372 = class151.method221(var359);
                                var370.method2567(var372.length);
                                var370.field2022 += Statics.field2851.method2357(var372, 0, var372.length, var370.field2024, var370.field2022);
                                client.field513.method2434(client.field513.field2022 - var369);
                            }
                            continue;
                        }
                        if (var390 == 5009) {
                            var6 -= 2;
                            String var373 = field402[var6];
                            String var374 = field402[var6 + 1];
                            client.field513.method2326(176);
                            client.field513.method2424(0);
                            int var375 = client.field513.field2022;
                            client.field513.method2428(var373);
                            class116 var376 = client.field513;
                            int var377 = var376.field2022;
                            byte[] var378 = class151.method221(var374);
                            var376.method2567(var378.length);
                            var376.field2022 += Statics.field2851.method2357(var378, 0, var378.length, var376.field2024, var376.field2022);
                            client.field513.method2484(client.field513.field2022 - var375);
                            continue;
                        }
                        if (var390 == 5010) {
                            var5--;
                            int var379 = field401[var5];
                            String var380 = null;
                            if (var379 < 100) {
                                var380 = client.field681[var379];
                            }
                            if (var380 == null) {
                                var380 = "";
                            }
                            field402[var6++] = var380;
                            continue;
                        }
                        if (var390 == 5011) {
                            var5--;
                            int var381 = field401[var5];
                            String var382 = null;
                            if (var381 < 100) {
                                var382 = client.field509[var381];
                            }
                            if (var382 == null) {
                                var382 = "";
                            }
                            field402[var6++] = var382;
                            continue;
                        }
                        if (var390 == 5015) {
                            String var383;
                            if (Statics.field1096 == null || Statics.field1096.field41 == null) {
                                var383 = "";
                            } else {
                                var383 = Statics.field1096.field41;
                            }
                            field402[var6++] = var383;
                            continue;
                        }
                        if (var390 == 5016) {
                            field401[var5++] = client.field687;
                            continue;
                        }
                        if (var390 == 5017) {
                            field401[var5++] = client.field684;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var389) {
            StringBuilder var385 = new StringBuilder(30);
            var385.append("").append(var4.field2837).append(" ");
            for (int var386 = field408 - 1; var386 >= 0; var386--) {
                var385.append("").append(field403[var386].field264.field2837).append(" ");
            }
            var385.append("").append(var10);
            Statics.method1393(var385.toString(), var389);
        }
    }
}
