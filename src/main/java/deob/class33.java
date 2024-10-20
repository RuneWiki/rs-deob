package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ad")
public class class33 {

    @ObfuscatedName("ad.q")
    public static int[] field725 = new int[5];

    @ObfuscatedName("ad.l")
    public static int[][] field726 = new int[5][5000];

    @ObfuscatedName("ad.a")
    public static int[] field732 = new int[1000];

    @ObfuscatedName("ad.b")
    public static String[] field723 = new String[1000];

    @ObfuscatedName("ad.z")
    public static int field729 = 0;

    @ObfuscatedName("ad.w")
    public static class13[] field730 = new class13[50];

    @ObfuscatedName("ad.n")
    public static Calendar field731 = Calendar.getInstance();

    @ObfuscatedName("ad.r")
    public static final String[] field724 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.e(Le;II)V")
    public static void method561(class1 arg0, int arg1) {
        Object[] var2 = arg0.field8;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method402(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field534;
        int[] var9 = var4.field526;
        byte var10 = -1;
        field729 = 0;
        try {
            Statics.field126 = new int[var4.field528];
            int var11 = 0;
            Statics.field722 = new String[var4.field529];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field11;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field14;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2549;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2550;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2549;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2550;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field2;
                    }
                    Statics.field126[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field722[var12++] = var15;
                }
            }
            int var16 = 0;
            label2759: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var491 = var8[var7];
                if (var491 < 100) {
                    if (var491 == 0) {
                        field732[var5++] = var9[var7];
                        continue;
                    }
                    if (var491 == 1) {
                        int var17 = var9[var7];
                        field732[var5++] = class157.field2678[var17];
                        continue;
                    }
                    if (var491 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class157.field2678[var18] = field732[var5];
                        client.method509(var18);
                        continue;
                    }
                    if (var491 == 3) {
                        field723[var6++] = var4.field535[var7];
                        continue;
                    }
                    if (var491 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var491 == 7) {
                        var5 -= 2;
                        if (field732[var5 + 1] != field732[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var491 == 8) {
                        var5 -= 2;
                        if (field732[var5 + 1] == field732[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var491 == 9) {
                        var5 -= 2;
                        if (field732[var5] < field732[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var491 == 10) {
                        var5 -= 2;
                        if (field732[var5] > field732[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var491 == 21) {
                        if (field729 == 0) {
                            return;
                        }
                        class13 var19 = field730[--field729];
                        var4 = var19.field190;
                        var8 = var4.field534;
                        var9 = var4.field526;
                        var7 = var19.field185;
                        Statics.field126 = var19.field184;
                        Statics.field722 = var19.field187;
                        continue;
                    }
                    if (var491 == 25) {
                        int var20 = var9[var7];
                        field732[var5++] = class157.method82(var20);
                        continue;
                    }
                    if (var491 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field732[var5];
                        class43 var23 = class43.method534(var21);
                        int var24 = var23.field998;
                        int var25 = var23.field1000;
                        int var26 = var23.field995;
                        int var27 = class157.field2683[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class157.field2678[var24] = class157.field2678[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var491 == 31) {
                        var5 -= 2;
                        if (field732[var5] <= field732[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var491 == 32) {
                        var5 -= 2;
                        if (field732[var5] >= field732[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var491 == 33) {
                        field732[var5++] = Statics.field126[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var491 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field126[var10001] = field732[var5];
                        continue;
                    }
                    if (var491 == 35) {
                        field723[var6++] = Statics.field722[var9[var7]];
                        continue;
                    }
                    if (var491 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field722[var10001] = field723[var6];
                        continue;
                    }
                    if (var491 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String var30 = class211.method2588(field723, var6, var29);
                        field723[var6++] = var30;
                        continue;
                    }
                    if (var491 == 38) {
                        var5--;
                        continue;
                    }
                    if (var491 == 39) {
                        var6--;
                        continue;
                    }
                    if (var491 == 40) {
                        int var31 = var9[var7];
                        class19 var32 = class19.method402(var31);
                        int[] var33 = new int[var32.field528];
                        String[] var34 = new String[var32.field529];
                        for (int var35 = 0; var35 < var32.field530; var35++) {
                            var33[var35] = field732[var5 - var32.field530 + var35];
                        }
                        for (int var36 = 0; var36 < var32.field531; var36++) {
                            var34[var36] = field723[var6 - var32.field531 + var36];
                        }
                        var5 -= var32.field530;
                        var6 -= var32.field531;
                        class13 var37 = new class13();
                        var37.field190 = var4;
                        var37.field185 = var7;
                        var37.field184 = Statics.field126;
                        var37.field187 = Statics.field722;
                        field730[++field729 - 1] = var37;
                        var4 = var32;
                        var8 = var32.field534;
                        var9 = var32.field526;
                        var7 = -1;
                        Statics.field126 = var33;
                        Statics.field722 = var34;
                        continue;
                    }
                    if (var491 == 42) {
                        field732[var5++] = client.field402[var9[var7]];
                        continue;
                    }
                    if (var491 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field402[var10001] = field732[var5];
                        continue;
                    }
                    if (var491 == 44) {
                        int var38 = var9[var7] >> 16;
                        int var39 = var9[var7] & 0xFFFF;
                        var5--;
                        int var40 = field732[var5];
                        if (var40 >= 0 && var40 <= 5000) {
                            field725[var38] = var40;
                            byte var41 = -1;
                            if (var39 == 105) {
                                var41 = 0;
                            }
                            int var42 = 0;
                            while (true) {
                                if (var42 >= var40) {
                                    continue label2759;
                                }
                                field726[var38][var42] = var41;
                                var42++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var491 == 45) {
                        int var43 = var9[var7];
                        var5--;
                        int var44 = field732[var5];
                        if (var44 >= 0 && var44 < field725[var43]) {
                            field732[var5++] = field726[var43][var44];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var491 == 46) {
                        int var45 = var9[var7];
                        var5 -= 2;
                        int var46 = field732[var5];
                        if (var46 >= 0 && var46 < field725[var45]) {
                            field726[var45][var46] = field732[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var491 == 47) {
                        String var47 = client.field446[var9[var7]];
                        if (var47 == null) {
                            var47 = "null";
                        }
                        field723[var6++] = var47;
                        continue;
                    }
                    if (var491 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field446[var10001] = field723[var6];
                        continue;
                    }
                }
                boolean var48;
                if (var9[var7] == 1) {
                    var48 = true;
                } else {
                    var48 = false;
                }
                if (var491 < 1000) {
                    if (var491 == 100) {
                        var5 -= 3;
                        int var49 = field732[var5];
                        int var50 = field732[var5 + 1];
                        int var51 = field732[var5 + 2];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class155 var52 = class155.method1383(var49);
                        if (var52.field2660 == null) {
                            var52.field2660 = new class155[var51 + 1];
                        }
                        if (var52.field2660.length <= var51) {
                            class155[] var53 = new class155[var51 + 1];
                            for (int var54 = 0; var54 < var52.field2660.length; var54++) {
                                var53[var54] = var52.field2660[var54];
                            }
                            var52.field2660 = var53;
                        }
                        if (var51 > 0 && var52.field2660[var51 - 1] == null) {
                            throw new RuntimeException("" + (var51 - 1));
                        }
                        class155 var55 = new class155();
                        var55.field2551 = var50;
                        var55.field2560 = var55.field2549 = var52.field2549;
                        var55.field2550 = var51;
                        var55.field2548 = true;
                        var52.field2660[var51] = var55;
                        if (var48) {
                            Statics.field1470 = var55;
                        } else {
                            Statics.field1293 = var55;
                        }
                        client.method137(var52);
                        continue;
                    }
                    if (var491 == 101) {
                        class155 var56 = var48 ? Statics.field1470 : Statics.field1293;
                        class155 var57 = class155.method1383(var56.field2549);
                        var57.field2660[var56.field2550] = null;
                        client.method137(var57);
                        continue;
                    }
                    if (var491 == 102) {
                        var5--;
                        class155 var58 = class155.method1383(field732[var5]);
                        var58.field2660 = null;
                        client.method137(var58);
                        continue;
                    }
                    if (var491 == 200) {
                        var5 -= 2;
                        int var59 = field732[var5];
                        int var60 = field732[var5 + 1];
                        class155 var61 = class155.method1027(var59, var60);
                        if (var61 != null && var60 != -1) {
                            field732[var5++] = 1;
                            if (var48) {
                                Statics.field1470 = var61;
                            } else {
                                Statics.field1293 = var61;
                            }
                            continue;
                        }
                        field732[var5++] = 0;
                        continue;
                    }
                } else if (var491 >= 1000 && var491 < 1100 || var491 >= 2000 && var491 < 2100) {
                    class155 var62;
                    if (var491 >= 2000) {
                        var491 -= 1000;
                        var5--;
                        var62 = class155.method1383(field732[var5]);
                    } else {
                        var62 = var48 ? Statics.field1470 : Statics.field1293;
                    }
                    if (var491 == 1000) {
                        var5 -= 2;
                        var62.field2601 = field732[var5];
                        var62.field2555 = field732[var5 + 1];
                        client.method137(var62);
                        continue;
                    }
                    if (var491 == 1001) {
                        var5 -= 2;
                        var62.field2558 = field732[var5];
                        var62.field2609 = field732[var5 + 1];
                        client.method137(var62);
                        continue;
                    }
                    if (var491 == 1003) {
                        var5--;
                        boolean var63 = field732[var5] == 1;
                        if (var62.field2616 != var63) {
                            var62.field2616 = var63;
                            client.method137(var62);
                        }
                        continue;
                    }
                } else if (!(var491 < 1100 || var491 >= 1200) || !(var491 < 2100 || var491 >= 2200)) {
                    class155 var64;
                    if (var491 >= 2000) {
                        var491 -= 1000;
                        var5--;
                        var64 = class155.method1383(field732[var5]);
                    } else {
                        var64 = var48 ? Statics.field1470 : Statics.field1293;
                    }
                    if (var491 == 1100) {
                        var5 -= 2;
                        var64.field2621 = field732[var5];
                        if (var64.field2621 > var64.field2564 - var64.field2558) {
                            var64.field2621 = var64.field2564 - var64.field2558;
                        }
                        if (var64.field2621 < 0) {
                            var64.field2621 = 0;
                        }
                        var64.field2563 = field732[var5 + 1];
                        if (var64.field2563 > var64.field2565 - var64.field2609) {
                            var64.field2563 = var64.field2565 - var64.field2609;
                        }
                        if (var64.field2563 < 0) {
                            var64.field2563 = 0;
                        }
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1101) {
                        var5--;
                        var64.field2566 = field732[var5];
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1102) {
                        var5--;
                        var64.field2570 = field732[var5] == 1;
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1103) {
                        var5--;
                        var64.field2546 = field732[var5];
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1104) {
                        var5--;
                        var64.field2572 = field732[var5];
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1105) {
                        var5--;
                        var64.field2573 = field732[var5];
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1106) {
                        var5--;
                        var64.field2575 = field732[var5];
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1107) {
                        var5--;
                        var64.field2608 = field732[var5] == 1;
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1108) {
                        var64.field2581 = 1;
                        var5--;
                        var64.field2582 = field732[var5];
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1109) {
                        var5 -= 6;
                        var64.field2627 = field732[var5];
                        var64.field2588 = field732[var5 + 1];
                        var64.field2559 = field732[var5 + 2];
                        var64.field2561 = field732[var5 + 3];
                        var64.field2591 = field732[var5 + 4];
                        var64.field2632 = field732[var5 + 5];
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1110) {
                        var5--;
                        int var65 = field732[var5];
                        if (var64.field2542 != var65) {
                            var64.field2542 = var65;
                            var64.field2598 = 0;
                            var64.field2659 = 0;
                            client.method137(var64);
                        }
                        continue;
                    }
                    if (var491 == 1111) {
                        var5--;
                        var64.field2607 = field732[var5] == 1;
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1112) {
                        var6--;
                        String var66 = field723[var6];
                        if (!var66.equals(var64.field2597)) {
                            var64.field2597 = var66;
                            client.method137(var64);
                        }
                        continue;
                    }
                    if (var491 == 1113) {
                        var5--;
                        var64.field2628 = field732[var5];
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1114) {
                        var5 -= 3;
                        var64.field2638 = field732[var5];
                        var64.field2654 = field732[var5 + 1];
                        var64.field2599 = field732[var5 + 2];
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1115) {
                        var5--;
                        var64.field2602 = field732[var5] == 1;
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1116) {
                        var5--;
                        var64.field2577 = field732[var5];
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1117) {
                        var5--;
                        var64.field2578 = field732[var5];
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1118) {
                        var5--;
                        var64.field2579 = field732[var5] == 1;
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1119) {
                        var5--;
                        var64.field2668 = field732[var5] == 1;
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1120) {
                        var5 -= 2;
                        var64.field2564 = field732[var5];
                        var64.field2565 = field732[var5 + 1];
                        client.method137(var64);
                        continue;
                    }
                    if (var491 == 1121) {
                        int var67 = var64.field2549;
                        int var68 = var64.field2550;
                        client.field454.method2357(138);
                        client.field454.method2153(var68);
                        client.field454.method2134(var67);
                        client.field495 = var64;
                        client.method137(var64);
                        continue;
                    }
                } else if (var491 >= 1200 && var491 < 1300 || var491 >= 2200 && var491 < 2300) {
                    class155 var69;
                    if (var491 >= 2000) {
                        var491 -= 1000;
                        var5--;
                        var69 = class155.method1383(field732[var5]);
                    } else {
                        var69 = var48 ? Statics.field1470 : Statics.field1293;
                    }
                    client.method137(var69);
                    if (var491 == 1200 || var491 == 1205 || var491 == 1212) {
                        var5 -= 2;
                        int var70 = field732[var5];
                        int var71 = field732[var5 + 1];
                        var69.field2656 = var70;
                        var69.field2657 = var71;
                        class46 var72 = class46.method476(var70);
                        var69.field2559 = var72.field1040;
                        var69.field2561 = var72.field1041;
                        var69.field2591 = var72.field1070;
                        var69.field2627 = var72.field1045;
                        var69.field2588 = var72.field1044;
                        var69.field2632 = var72.field1049;
                        if (var491 == 1205) {
                            var69.field2611 = 0;
                        } else if (var491 == 1212 | var72.field1033 == 1) {
                            var69.field2611 = 1;
                        } else {
                            var69.field2611 = 2;
                        }
                        if (var69.field2558 > 0) {
                            var69.field2632 = var69.field2632 * 32 / var69.field2558;
                        }
                        continue;
                    }
                    if (var491 == 1201) {
                        var69.field2581 = 2;
                        var5--;
                        var69.field2582 = field732[var5];
                        continue;
                    }
                    if (var491 == 1202) {
                        var69.field2581 = 3;
                        var69.field2582 = Statics.field695.field36.method2914();
                        continue;
                    }
                } else if ((var491 < 1300 || var491 >= 1400) && (var491 < 2300 || var491 >= 2400)) {
                    if (var491 >= 1400 && var491 < 1500 || var491 >= 2400 && var491 < 2500) {
                        class155 var77;
                        if (var491 >= 2000) {
                            var491 -= 1000;
                            var5--;
                            var77 = class155.method1383(field732[var5]);
                        } else {
                            var77 = var48 ? Statics.field1470 : Statics.field1293;
                        }
                        var6--;
                        String var78 = field723[var6];
                        int[] var79 = null;
                        if (var78.length() > 0 && var78.charAt(var78.length() - 1) == 'Y') {
                            var5--;
                            int var80 = field732[var5];
                            if (var80 > 0) {
                                var79 = new int[var80];
                                while (var80-- > 0) {
                                    var5--;
                                    var79[var80] = field732[var5];
                                }
                            }
                            var78 = var78.substring(0, var78.length() - 1);
                        }
                        Object[] var81 = new Object[var78.length() + 1];
                        for (int var82 = var81.length - 1; var82 >= 1; var82--) {
                            if (var78.charAt(var82 - 1) == 's') {
                                var6--;
                                var81[var82] = field723[var6];
                            } else {
                                var5--;
                                var81[var82] = Integer.valueOf(field732[var5]);
                            }
                        }
                        var5--;
                        int var83 = field732[var5];
                        if (var83 == -1) {
                            var81 = null;
                        } else {
                            var81[0] = Integer.valueOf(var83);
                        }
                        if (var491 == 1400) {
                            var77.field2571 = var81;
                        }
                        if (var491 == 1401) {
                            var77.field2622 = var81;
                        }
                        if (var491 == 1402) {
                            var77.field2589 = var81;
                        }
                        if (var491 == 1403) {
                            var77.field2554 = var81;
                        }
                        if (var491 == 1404) {
                            var77.field2625 = var81;
                        }
                        if (var491 == 1405) {
                            var77.field2626 = var81;
                        }
                        if (var491 == 1406) {
                            var77.field2655 = var81;
                        }
                        if (var491 == 1407) {
                            var77.field2576 = var81;
                            var77.field2631 = var79;
                        }
                        if (var491 == 1408) {
                            var77.field2636 = var81;
                        }
                        if (var491 == 1409) {
                            var77.field2637 = var81;
                        }
                        if (var491 == 1410) {
                            var77.field2585 = var81;
                        }
                        if (var491 == 1411) {
                            var77.field2620 = var81;
                        }
                        if (var491 == 1412) {
                            var77.field2624 = var81;
                        }
                        if (var491 == 1414) {
                            var77.field2580 = var81;
                            var77.field2633 = var79;
                        }
                        if (var491 == 1415) {
                            var77.field2634 = var81;
                            var77.field2635 = var79;
                        }
                        if (var491 == 1416) {
                            var77.field2562 = var81;
                        }
                        if (var491 == 1417) {
                            var77.field2540 = var81;
                        }
                        if (var491 == 1418) {
                            var77.field2639 = var81;
                        }
                        if (var491 == 1419) {
                            var77.field2646 = var81;
                        }
                        if (var491 == 1420) {
                            var77.field2590 = var81;
                        }
                        if (var491 == 1421) {
                            var77.field2642 = var81;
                        }
                        if (var491 == 1422) {
                            var77.field2643 = var81;
                        }
                        if (var491 == 1423) {
                            var77.field2644 = var81;
                        }
                        if (var491 == 1424) {
                            var77.field2645 = var81;
                        }
                        if (var491 == 1425) {
                            var77.field2586 = var81;
                        }
                        if (var491 == 1426) {
                            var77.field2647 = var81;
                        }
                        var77.field2617 = true;
                        continue;
                    }
                    if (var491 < 1600) {
                        class155 var84 = var48 ? Statics.field1470 : Statics.field1293;
                        if (var491 == 1500) {
                            field732[var5++] = var84.field2601;
                            continue;
                        }
                        if (var491 == 1501) {
                            field732[var5++] = var84.field2555;
                            continue;
                        }
                        if (var491 == 1502) {
                            field732[var5++] = var84.field2558;
                            continue;
                        }
                        if (var491 == 1503) {
                            field732[var5++] = var84.field2609;
                            continue;
                        }
                        if (var491 == 1504) {
                            field732[var5++] = var84.field2616 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 1505) {
                            field732[var5++] = var84.field2560;
                            continue;
                        }
                    } else if (var491 < 1700) {
                        class155 var85 = var48 ? Statics.field1470 : Statics.field1293;
                        if (var491 == 1600) {
                            field732[var5++] = var85.field2621;
                            continue;
                        }
                        if (var491 == 1601) {
                            field732[var5++] = var85.field2563;
                            continue;
                        }
                        if (var491 == 1602) {
                            field723[var6++] = var85.field2597;
                            continue;
                        }
                        if (var491 == 1603) {
                            field732[var5++] = var85.field2564;
                            continue;
                        }
                        if (var491 == 1604) {
                            field732[var5++] = var85.field2565;
                            continue;
                        }
                        if (var491 == 1605) {
                            field732[var5++] = var85.field2632;
                            continue;
                        }
                        if (var491 == 1606) {
                            field732[var5++] = var85.field2559;
                            continue;
                        }
                        if (var491 == 1607) {
                            field732[var5++] = var85.field2591;
                            continue;
                        }
                        if (var491 == 1608) {
                            field732[var5++] = var85.field2561;
                            continue;
                        }
                    } else if (var491 < 1800) {
                        class155 var86 = var48 ? Statics.field1470 : Statics.field1293;
                        if (var491 == 1700) {
                            field732[var5++] = var86.field2656;
                            continue;
                        }
                        if (var491 == 1701) {
                            if (var86.field2656 == -1) {
                                field732[var5++] = 0;
                            } else {
                                field732[var5++] = var86.field2657;
                            }
                            continue;
                        }
                        if (var491 == 1702) {
                            field732[var5++] = var86.field2550;
                            continue;
                        }
                    } else if (var491 < 1900) {
                        class155 var87 = var48 ? Statics.field1470 : Statics.field1293;
                        if (var491 == 1800) {
                            int[] var88 = field732;
                            int var89 = var5++;
                            int var90 = client.method125(var87);
                            int var91 = var90 >> 11 & 0x3F;
                            var88[var89] = var91;
                            continue;
                        }
                        if (var491 == 1801) {
                            var5--;
                            int var92 = field732[var5];
                            int var492 = var92 - 1;
                            if (var87.field2665 != null && var492 < var87.field2665.length && var87.field2665[var492] != null) {
                                field723[var6++] = var87.field2665[var492];
                                continue;
                            }
                            field723[var6++] = "";
                            continue;
                        }
                        if (var491 == 1802) {
                            if (var87.field2623 == null) {
                                field723[var6++] = "";
                            } else {
                                field723[var6++] = var87.field2623;
                            }
                            continue;
                        }
                    } else if (var491 < 2600) {
                        var5--;
                        class155 var93 = class155.method1383(field732[var5]);
                        if (var491 == 2500) {
                            field732[var5++] = var93.field2601;
                            continue;
                        }
                        if (var491 == 2501) {
                            field732[var5++] = var93.field2555;
                            continue;
                        }
                        if (var491 == 2502) {
                            field732[var5++] = var93.field2558;
                            continue;
                        }
                        if (var491 == 2503) {
                            field732[var5++] = var93.field2609;
                            continue;
                        }
                        if (var491 == 2504) {
                            field732[var5++] = var93.field2616 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 2505) {
                            field732[var5++] = var93.field2560;
                            continue;
                        }
                    } else if (var491 < 2700) {
                        var5--;
                        class155 var94 = class155.method1383(field732[var5]);
                        if (var491 == 2600) {
                            field732[var5++] = var94.field2621;
                            continue;
                        }
                        if (var491 == 2601) {
                            field732[var5++] = var94.field2563;
                            continue;
                        }
                        if (var491 == 2602) {
                            field723[var6++] = var94.field2597;
                            continue;
                        }
                        if (var491 == 2603) {
                            field732[var5++] = var94.field2564;
                            continue;
                        }
                        if (var491 == 2604) {
                            field732[var5++] = var94.field2565;
                            continue;
                        }
                        if (var491 == 2605) {
                            field732[var5++] = var94.field2632;
                            continue;
                        }
                        if (var491 == 2606) {
                            field732[var5++] = var94.field2559;
                            continue;
                        }
                        if (var491 == 2607) {
                            field732[var5++] = var94.field2591;
                            continue;
                        }
                        if (var491 == 2608) {
                            field732[var5++] = var94.field2561;
                            continue;
                        }
                    } else if (var491 < 2800) {
                        if (var491 == 2700) {
                            var5--;
                            class155 var95 = class155.method1383(field732[var5]);
                            field732[var5++] = var95.field2656;
                            continue;
                        }
                        if (var491 == 2701) {
                            var5--;
                            class155 var96 = class155.method1383(field732[var5]);
                            if (var96.field2656 == -1) {
                                field732[var5++] = 0;
                            } else {
                                field732[var5++] = var96.field2657;
                            }
                            continue;
                        }
                        if (var491 == 2702) {
                            var5--;
                            int var97 = field732[var5];
                            class4 var98 = (class4) client.field409.method3192((long) var97);
                            if (var98 == null) {
                                field732[var5++] = 0;
                            } else {
                                field732[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var491 < 2900) {
                        var5--;
                        class155 var99 = class155.method1383(field732[var5]);
                        if (var491 == 2800) {
                            int[] var100 = field732;
                            int var101 = var5++;
                            int var102 = client.method125(var99);
                            int var103 = var102 >> 11 & 0x3F;
                            var100[var101] = var103;
                            continue;
                        }
                        if (var491 == 2801) {
                            var5--;
                            int var104 = field732[var5];
                            int var493 = var104 - 1;
                            if (var99.field2665 != null && var493 < var99.field2665.length && var99.field2665[var493] != null) {
                                field723[var6++] = var99.field2665[var493];
                                continue;
                            }
                            field723[var6++] = "";
                            continue;
                        }
                        if (var491 == 2802) {
                            if (var99.field2623 == null) {
                                field723[var6++] = "";
                            } else {
                                field723[var6++] = var99.field2623;
                            }
                            continue;
                        }
                    } else if (var491 < 3200) {
                        if (var491 == 3100) {
                            var6--;
                            String var105 = field723[var6];
                            class10.method486(0, "", var105);
                            continue;
                        }
                        if (var491 == 3101) {
                            var5 -= 2;
                            client.method587(Statics.field695, field732[var5], field732[var5 + 1]);
                            continue;
                        }
                        if (var491 == 3103) {
                            client.method778();
                            continue;
                        }
                        if (var491 == 3104) {
                            var6--;
                            String var106 = field723[var6];
                            int var107 = 0;
                            if (class211.method1593(var106)) {
                                var107 = class211.method3149(var106);
                            }
                            client.field454.method2357(184);
                            client.field454.method2134(var107);
                            continue;
                        }
                        if (var491 == 3105) {
                            var6--;
                            String var108 = field723[var6];
                            client.field454.method2357(248);
                            client.field454.method2123(var108.length() + 1);
                            client.field454.method2304(var108);
                            continue;
                        }
                        if (var491 == 3106) {
                            var6--;
                            String var109 = field723[var6];
                            client.field454.method2357(235);
                            client.field454.method2123(var109.length() + 1);
                            client.field454.method2304(var109);
                            continue;
                        }
                        if (var491 == 3107) {
                            var5--;
                            int var110 = field732[var5];
                            var6--;
                            String var111 = field723[var6];
                            client.method698(var110, var111);
                            continue;
                        }
                        if (var491 == 3108) {
                            var5 -= 3;
                            int var112 = field732[var5];
                            int var113 = field732[var5 + 1];
                            int var114 = field732[var5 + 2];
                            class155 var115 = class155.method1383(var114);
                            client.method592(var115, var112, var113);
                            continue;
                        }
                        if (var491 == 3109) {
                            var5 -= 2;
                            int var116 = field732[var5];
                            int var117 = field732[var5 + 1];
                            class155 var118 = var48 ? Statics.field1470 : Statics.field1293;
                            client.method592(var118, var116, var117);
                            continue;
                        }
                        if (var491 == 3110) {
                            var5--;
                            Statics.field330 = field732[var5] == 1;
                            continue;
                        }
                        if (var491 == 3111) {
                            field732[var5++] = Statics.field1296.field133 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3112) {
                            var5--;
                            Statics.field1296.field133 = field732[var5] == 1;
                            class9.method27();
                            continue;
                        }
                        if (var491 == 3113) {
                            var6--;
                            String var119 = field723[var6];
                            var5--;
                            boolean var120 = field732[var5] == 1;
                            class127.method570(var119, var120, false);
                            continue;
                        }
                        if (var491 == 3115) {
                            var5--;
                            int var121 = field732[var5];
                            client.field454.method2357(121);
                            client.field454.method2109(var121);
                            continue;
                        }
                    } else if (var491 < 3300) {
                        if (var491 == 3200) {
                            var5 -= 3;
                            int var122 = field732[var5];
                            int var123 = field732[var5 + 1];
                            int var124 = field732[var5 + 2];
                            if (client.field314 != 0 && var123 != 0 && client.field341 < 50) {
                                client.field489[client.field341] = var122;
                                client.field282[client.field341] = var123;
                                client.field383[client.field341] = var124;
                                client.field260[client.field341] = null;
                                client.field342[client.field341] = 0;
                                client.field341++;
                            }
                            continue;
                        }
                        if (var491 == 3201) {
                            var5--;
                            int var125 = field732[var5];
                            if (var125 == -1 && !client.field485) {
                                Statics.field2730.method3062();
                                class164.field2732 = 1;
                                Statics.field1022 = null;
                            } else if (var125 != -1 && client.field484 != var125 && client.field483 != 0 && !client.field485) {
                                class150 var126 = Statics.field2711;
                                int var127 = client.field483;
                                class164.field2732 = 1;
                                Statics.field1022 = var126;
                                Statics.field2032 = var125;
                                Statics.field226 = 0;
                                Statics.field2734 = var127;
                                Statics.field2733 = false;
                                Statics.field61 = 2;
                            }
                            client.field484 = var125;
                            continue;
                        }
                        if (var491 == 3202) {
                            var5 -= 2;
                            int var128 = field732[var5];
                            int var10000 = field732[var5 + 1];
                            if (client.field483 != 0 && var128 != -1) {
                                class164.method1775(Statics.field232, var128, 0, client.field483, false);
                                client.field485 = true;
                            }
                            continue;
                        }
                    } else if (var491 < 3400) {
                        if (var491 == 3300) {
                            field732[var5++] = client.field418;
                            continue;
                        }
                        if (var491 == 3301) {
                            var5 -= 2;
                            int var130 = field732[var5];
                            int var131 = field732[var5 + 1];
                            int[] var132 = field732;
                            int var133 = var5++;
                            class14 var134 = (class14) class14.field197.method3192((long) var130);
                            int var135;
                            if (var134 == null) {
                                var135 = -1;
                            } else if (var131 >= 0 && var131 < var134.field194.length) {
                                var135 = var134.field194[var131];
                            } else {
                                var135 = -1;
                            }
                            var132[var133] = var135;
                            continue;
                        }
                        if (var491 == 3302) {
                            var5 -= 2;
                            int var136 = field732[var5];
                            int var137 = field732[var5 + 1];
                            field732[var5++] = class14.method2676(var136, var137);
                            continue;
                        }
                        if (var491 == 3303) {
                            var5 -= 2;
                            int var138 = field732[var5];
                            int var139 = field732[var5 + 1];
                            int[] var140 = field732;
                            int var141 = var5++;
                            class14 var142 = (class14) class14.field197.method3192((long) var138);
                            int var143;
                            if (var142 == null) {
                                var143 = 0;
                            } else if (var139 == -1) {
                                var143 = 0;
                            } else {
                                int var144 = 0;
                                for (int var145 = 0; var145 < var142.field193.length; var145++) {
                                    if (var142.field194[var145] == var139) {
                                        var144 += var142.field193[var145];
                                    }
                                }
                                var143 = var144;
                            }
                            var140[var141] = var143;
                            continue;
                        }
                        if (var491 == 3304) {
                            var5--;
                            int var146 = field732[var5];
                            field732[var5++] = class45.method3136(var146).field1023;
                            continue;
                        }
                        if (var491 == 3305) {
                            var5--;
                            int var147 = field732[var5];
                            field732[var5++] = client.field384[var147];
                            continue;
                        }
                        if (var491 == 3306) {
                            var5--;
                            int var148 = field732[var5];
                            field732[var5++] = client.field385[var148];
                            continue;
                        }
                        if (var491 == 3307) {
                            var5--;
                            int var149 = field732[var5];
                            field732[var5++] = client.field386[var149];
                            continue;
                        }
                        if (var491 == 3308) {
                            int var150 = Statics.field170;
                            int var151 = (Statics.field695.field763 >> 7) + Statics.field1821;
                            int var152 = (Statics.field695.field735 >> 7) + Statics.field990;
                            field732[var5++] = (var150 << 28) + (var151 << 14) + var152;
                            continue;
                        }
                        if (var491 == 3309) {
                            var5--;
                            int var153 = field732[var5];
                            field732[var5++] = var153 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var491 == 3310) {
                            var5--;
                            int var154 = field732[var5];
                            field732[var5++] = var154 >> 28;
                            continue;
                        }
                        if (var491 == 3311) {
                            var5--;
                            int var155 = field732[var5];
                            field732[var5++] = var155 & 0x3FFF;
                            continue;
                        }
                        if (var491 == 3312) {
                            field732[var5++] = client.field508 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3313) {
                            var5 -= 2;
                            int var156 = field732[var5] + 32768;
                            int var157 = field732[var5 + 1];
                            int[] var158 = field732;
                            int var159 = var5++;
                            class14 var160 = (class14) class14.field197.method3192((long) var156);
                            int var161;
                            if (var160 == null) {
                                var161 = -1;
                            } else if (var157 >= 0 && var157 < var160.field194.length) {
                                var161 = var160.field194[var157];
                            } else {
                                var161 = -1;
                            }
                            var158[var159] = var161;
                            continue;
                        }
                        if (var491 == 3314) {
                            var5 -= 2;
                            int var162 = field732[var5] + 32768;
                            int var163 = field732[var5 + 1];
                            field732[var5++] = class14.method2676(var162, var163);
                            continue;
                        }
                        if (var491 == 3315) {
                            var5 -= 2;
                            int var164 = field732[var5] + 32768;
                            int var165 = field732[var5 + 1];
                            int[] var166 = field732;
                            int var167 = var5++;
                            class14 var168 = (class14) class14.field197.method3192((long) var164);
                            int var169;
                            if (var168 == null) {
                                var169 = 0;
                            } else if (var165 == -1) {
                                var169 = 0;
                            } else {
                                int var170 = 0;
                                for (int var171 = 0; var171 < var168.field193.length; var171++) {
                                    if (var168.field194[var171] == var165) {
                                        var170 += var168.field193[var171];
                                    }
                                }
                                var169 = var170;
                            }
                            var166[var167] = var169;
                            continue;
                        }
                        if (var491 == 3316) {
                            if (client.field415 >= 2) {
                                field732[var5++] = client.field415;
                            } else {
                                field732[var5++] = 0;
                            }
                            continue;
                        }
                        if (var491 == 3317) {
                            field732[var5++] = client.field299;
                            continue;
                        }
                        if (var491 == 3318) {
                            field732[var5++] = client.field244;
                            continue;
                        }
                        if (var491 == 3321) {
                            field732[var5++] = client.field283;
                            continue;
                        }
                        if (var491 == 3322) {
                            field732[var5++] = client.field412;
                            continue;
                        }
                        if (var491 == 3323) {
                            if (client.field417) {
                                field732[var5++] = 1;
                            } else {
                                field732[var5++] = 0;
                            }
                            continue;
                        }
                        if (var491 == 3324) {
                            field732[var5++] = client.field313;
                            continue;
                        }
                    } else if (var491 < 3500) {
                        if (var491 == 3400) {
                            var5 -= 2;
                            int var172 = field732[var5];
                            int var173 = field732[var5 + 1];
                            class44 var174 = (class44) class44.field1002.method3154((long) var172);
                            class44 var175;
                            if (var174 == null) {
                                byte[] var176 = Statics.field1009.method2721(8, var172);
                                class44 var177 = new class44();
                                if (var176 != null) {
                                    var177.method814(new class108(var176));
                                }
                                class44.field1002.method3156(var177, (long) var172);
                                var175 = var177;
                            } else {
                                var175 = var174;
                            }
                            class44 var178 = var175;
                            if (var175.field1004 != 's') {
                            }
                            for (int var179 = 0; var179 < var178.field1007; var179++) {
                                if (var178.field1011[var179] == var173) {
                                    field723[var6++] = var178.field1010[var179];
                                    var178 = null;
                                    break;
                                }
                            }
                            if (var178 != null) {
                                field723[var6++] = var178.field1005;
                            }
                            continue;
                        }
                        if (var491 == 3408) {
                            var5 -= 4;
                            int var180 = field732[var5];
                            int var181 = field732[var5 + 1];
                            int var182 = field732[var5 + 2];
                            int var183 = field732[var5 + 3];
                            class44 var184 = (class44) class44.field1002.method3154((long) var182);
                            class44 var185;
                            if (var184 == null) {
                                byte[] var186 = Statics.field1009.method2721(8, var182);
                                class44 var187 = new class44();
                                if (var186 != null) {
                                    var187.method814(new class108(var186));
                                }
                                class44.field1002.method3156(var187, (long) var182);
                                var185 = var187;
                            } else {
                                var185 = var184;
                            }
                            class44 var188 = var185;
                            if (var185.field1003 == var180 && var185.field1004 == var181) {
                                for (int var189 = 0; var189 < var188.field1007; var189++) {
                                    if (var188.field1011[var189] == var183) {
                                        if (var181 == 115) {
                                            field723[var6++] = var188.field1010[var189];
                                        } else {
                                            field732[var5++] = var188.field1006[var189];
                                        }
                                        var188 = null;
                                        break;
                                    }
                                }
                                if (var188 != null) {
                                    if (var181 == 115) {
                                        field723[var6++] = var188.field1005;
                                    } else {
                                        field732[var5++] = var188.field1001;
                                    }
                                }
                                continue;
                            }
                            if (var181 == 115) {
                                field723[var6++] = "null";
                            } else {
                                field732[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var491 < 3700) {
                        if (var491 == 3600) {
                            if (client.field288 == 0) {
                                field732[var5++] = -2;
                            } else if (client.field288 == 1) {
                                field732[var5++] = -1;
                            } else {
                                field732[var5++] = client.field500;
                            }
                            continue;
                        }
                        if (var491 == 3601) {
                            var5--;
                            int var190 = field732[var5];
                            if (client.field288 == 2 && var190 < client.field500) {
                                field723[var6++] = client.field399[var190].field225;
                                field723[var6++] = client.field399[var190].field221;
                                continue;
                            }
                            field723[var6++] = "";
                            field723[var6++] = "";
                            continue;
                        }
                        if (var491 == 3602) {
                            var5--;
                            int var191 = field732[var5];
                            if (client.field288 == 2 && var191 < client.field500) {
                                field732[var5++] = client.field399[var191].field220;
                                continue;
                            }
                            field732[var5++] = 0;
                            continue;
                        }
                        if (var491 == 3603) {
                            var5--;
                            int var192 = field732[var5];
                            if (client.field288 == 2 && var192 < client.field500) {
                                field732[var5++] = client.field399[var192].field224;
                                continue;
                            }
                            field732[var5++] = 0;
                            continue;
                        }
                        if (var491 == 3604) {
                            var6--;
                            String var193 = field723[var6];
                            var5--;
                            int var194 = field732[var5];
                            client.field454.method2357(166);
                            class111 var195 = client.field454;
                            int var196 = var193.length() + 1;
                            var195.method2123(var196 + 1);
                            client.field454.method2304(var193);
                            client.field454.method2144(var194);
                            continue;
                        }
                        if (var491 == 3605) {
                            var6--;
                            String var197 = field723[var6];
                            if (var197 == null) {
                                continue;
                            }
                            if ((client.field500 < 200 || client.field347 == 1) && client.field500 < 400) {
                                String var198 = class212.method2168(var197, Statics.field247);
                                if (var198 == null) {
                                    continue;
                                }
                                for (int var199 = 0; var199 < client.field500; var199++) {
                                    class16 var200 = client.field399[var199];
                                    String var201 = class212.method2168(var200.field225, Statics.field247);
                                    if (var201 != null && var201.equals(var198)) {
                                        class10.method486(30, "", var197 + class145.field2208);
                                        continue label2759;
                                    }
                                    if (var200.field221 != null) {
                                        String var202 = class212.method2168(var200.field221, Statics.field247);
                                        if (var202 != null && var202.equals(var198)) {
                                            class10.method486(30, "", var197 + class145.field2208);
                                            continue label2759;
                                        }
                                    }
                                }
                                for (int var203 = 0; var203 < client.field467; var203++) {
                                    class8 var204 = client.field505[var203];
                                    String var205 = class212.method2168(var204.field123, Statics.field247);
                                    if (var205 != null && var205.equals(var198)) {
                                        class10.method486(30, "", class145.field2337 + var197 + class145.field2246);
                                        continue label2759;
                                    }
                                    if (var204.field127 != null) {
                                        String var206 = class212.method2168(var204.field127, Statics.field247);
                                        if (var206 != null && var206.equals(var198)) {
                                            class10.method486(30, "", class145.field2337 + var197 + class145.field2246);
                                            continue label2759;
                                        }
                                    }
                                }
                                if (class212.method2168(Statics.field695.field48, Statics.field247).equals(var198)) {
                                    class10.method486(30, "", class145.field2197);
                                } else {
                                    client.field454.method2357(182);
                                    client.field454.method2123(class108.method2832(var197));
                                    client.field454.method2304(var197);
                                }
                                continue;
                            }
                            class10.method486(30, "", class145.field2331);
                            continue;
                        }
                        if (var491 == 3606) {
                            var6--;
                            String var207 = field723[var6];
                            if (var207 == null) {
                                continue;
                            }
                            String var208 = class212.method2168(var207, Statics.field247);
                            if (var208 == null) {
                                continue;
                            }
                            int var209 = 0;
                            while (true) {
                                if (var209 >= client.field500) {
                                    continue label2759;
                                }
                                class16 var210 = client.field399[var209];
                                String var211 = var210.field225;
                                String var212 = class212.method2168(var211, Statics.field247);
                                if (class118.method35(var207, var208, var211, var212)) {
                                    client.field500--;
                                    for (int var213 = var209; var213 < client.field500; var213++) {
                                        client.field399[var213] = client.field399[var213 + 1];
                                    }
                                    client.field320 = client.field432;
                                    client.field454.method2357(255);
                                    client.field454.method2123(class108.method2832(var207));
                                    client.field454.method2304(var207);
                                    continue label2759;
                                }
                                var209++;
                            }
                        }
                        if (var491 == 3607) {
                            var6--;
                            String var214 = field723[var6];
                            if (var214 == null) {
                                continue;
                            }
                            if ((client.field467 < 100 || client.field347 == 1) && client.field467 < 400) {
                                String var215 = class212.method2168(var214, Statics.field247);
                                if (var215 == null) {
                                    continue;
                                }
                                for (int var216 = 0; var216 < client.field467; var216++) {
                                    class8 var217 = client.field505[var216];
                                    String var218 = class212.method2168(var217.field123, Statics.field247);
                                    if (var218 != null && var218.equals(var215)) {
                                        class10.method486(31, "", var214 + class145.field2334);
                                        continue label2759;
                                    }
                                    if (var217.field127 != null) {
                                        String var219 = class212.method2168(var217.field127, Statics.field247);
                                        if (var219 != null && var219.equals(var215)) {
                                            class10.method486(31, "", var214 + class145.field2334);
                                            continue label2759;
                                        }
                                    }
                                }
                                for (int var220 = 0; var220 < client.field500; var220++) {
                                    class16 var221 = client.field399[var220];
                                    String var222 = class212.method2168(var221.field225, Statics.field247);
                                    if (var222 != null && var222.equals(var215)) {
                                        class10.method486(31, "", class145.field2339 + var214 + class145.field2340);
                                        continue label2759;
                                    }
                                    if (var221.field221 != null) {
                                        String var223 = class212.method2168(var221.field221, Statics.field247);
                                        if (var223 != null && var223.equals(var215)) {
                                            class10.method486(31, "", class145.field2339 + var214 + class145.field2340);
                                            continue label2759;
                                        }
                                    }
                                }
                                if (class212.method2168(Statics.field695.field48, Statics.field247).equals(var215)) {
                                    class10.method486(31, "", class145.field2336);
                                } else {
                                    client.field454.method2357(127);
                                    client.field454.method2123(class108.method2832(var214));
                                    client.field454.method2304(var214);
                                }
                                continue;
                            }
                            class10.method486(31, "", class145.field2396);
                            continue;
                        }
                        if (var491 == 3608) {
                            var6--;
                            String var224 = field723[var6];
                            client.method482(var224);
                            continue;
                        }
                        if (var491 == 3609) {
                            var6--;
                            String var225 = field723[var6];
                            class140[] var226 = class140.method138();
                            for (int var227 = 0; var227 < var226.length; var227++) {
                                class140 var228 = var226[var227];
                                if (var228.field2121 != -1) {
                                    int var230 = var228.field2121;
                                    String var231 = "<img=" + var230 + ">";
                                    if (var225.startsWith(var231)) {
                                        var225 = var225.substring(6 + Integer.toString(var228.field2121).length());
                                        break;
                                    }
                                }
                            }
                            field732[var5++] = client.method1959(var225, false) ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3611) {
                            if (client.field472 == null) {
                                field723[var6++] = "";
                            } else {
                                String[] var232 = field723;
                                int var233 = var6++;
                                String var234 = client.field472;
                                String var235 = class210.method3591(class210.method2718(var234));
                                if (var235 == null) {
                                    var235 = "";
                                }
                                var232[var233] = var235;
                            }
                            continue;
                        }
                        if (var491 == 3612) {
                            if (client.field472 == null) {
                                field732[var5++] = 0;
                            } else {
                                field732[var5++] = Statics.field2066;
                            }
                            continue;
                        }
                        if (var491 == 3613) {
                            var5--;
                            int var237 = field732[var5];
                            if (client.field472 != null && var237 < Statics.field2066) {
                                field723[var6++] = Statics.field1854[var237].field570;
                                continue;
                            }
                            field723[var6++] = "";
                            continue;
                        }
                        if (var491 == 3614) {
                            var5--;
                            int var238 = field732[var5];
                            if (client.field472 != null && var238 < Statics.field2066) {
                                field732[var5++] = Statics.field1854[var238].field566;
                                continue;
                            }
                            field732[var5++] = 0;
                            continue;
                        }
                        if (var491 == 3615) {
                            var5--;
                            int var239 = field732[var5];
                            if (client.field472 != null && var239 < Statics.field2066) {
                                field732[var5++] = Statics.field1854[var239].field568;
                                continue;
                            }
                            field732[var5++] = 0;
                            continue;
                        }
                        if (var491 == 3616) {
                            field732[var5++] = Statics.field2496;
                            continue;
                        }
                        if (var491 == 3617) {
                            var6--;
                            String var240 = field723[var6];
                            if (Statics.field1854 != null) {
                                client.field454.method2357(28);
                                class111 var241 = client.field454;
                                int var242 = var240.length() + 1;
                                var241.method2123(var242);
                                client.field454.method2304(var240);
                            }
                            continue;
                        }
                        if (var491 == 3618) {
                            field732[var5++] = Statics.field2928;
                            continue;
                        }
                        if (var491 == 3619) {
                            var6--;
                            String var243 = field723[var6];
                            client.method1770(var243);
                            continue;
                        }
                        if (var491 == 3620) {
                            client.field454.method2357(134);
                            client.field454.method2123(0);
                            continue;
                        }
                        if (var491 == 3621) {
                            if (client.field288 == 0) {
                                field732[var5++] = -1;
                            } else {
                                field732[var5++] = client.field467;
                            }
                            continue;
                        }
                        if (var491 == 3622) {
                            var5--;
                            int var244 = field732[var5];
                            if (client.field288 != 0 && var244 < client.field467) {
                                field723[var6++] = client.field505[var244].field123;
                                field723[var6++] = client.field505[var244].field127;
                                continue;
                            }
                            field723[var6++] = "";
                            field723[var6++] = "";
                            continue;
                        }
                        if (var491 == 3623) {
                            String var245;
                            label2467: {
                                var6--;
                                var245 = field723[var6];
                                String var247 = "<img=0>";
                                if (!var245.startsWith(var247)) {
                                    String var249 = "<img=1>";
                                    if (!var245.startsWith(var249)) {
                                        break label2467;
                                    }
                                }
                                var245 = var245.substring(7);
                            }
                            field732[var5++] = client.method2702(var245) ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3624) {
                            var5--;
                            int var250 = field732[var5];
                            if (Statics.field1854 != null && var250 < Statics.field2066 && Statics.field1854[var250].field570.equalsIgnoreCase(Statics.field695.field48)) {
                                field732[var5++] = 1;
                                continue;
                            }
                            field732[var5++] = 0;
                            continue;
                        }
                        if (var491 == 3625) {
                            if (client.field473 == null) {
                                field723[var6++] = "";
                            } else {
                                String[] var251 = field723;
                                int var252 = var6++;
                                String var253 = client.field473;
                                String var254 = class210.method3591(class210.method2718(var253));
                                if (var254 == null) {
                                    var254 = "";
                                }
                                var251[var252] = var254;
                            }
                            continue;
                        }
                    } else if (var491 < 4000) {
                        if (var491 == 3903) {
                            var5--;
                            int var256 = field732[var5];
                            field732[var5++] = client.field509[var256].method3392();
                            continue;
                        }
                        if (var491 == 3904) {
                            var5--;
                            int var257 = field732[var5];
                            field732[var5++] = client.field509[var257].field2939;
                            continue;
                        }
                        if (var491 == 3905) {
                            var5--;
                            int var258 = field732[var5];
                            field732[var5++] = client.field509[var258].field2941;
                            continue;
                        }
                        if (var491 == 3906) {
                            var5--;
                            int var259 = field732[var5];
                            field732[var5++] = client.field509[var259].field2940;
                            continue;
                        }
                        if (var491 == 3907) {
                            var5--;
                            int var260 = field732[var5];
                            field732[var5++] = client.field509[var260].field2943;
                            continue;
                        }
                        if (var491 == 3908) {
                            var5--;
                            int var261 = field732[var5];
                            field732[var5++] = client.field509[var261].field2944;
                            continue;
                        }
                        if (var491 == 3910) {
                            var5--;
                            int var262 = field732[var5];
                            int var263 = client.field509[var262].method3394();
                            field732[var5++] = var263 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3911) {
                            var5--;
                            int var264 = field732[var5];
                            int var265 = client.field509[var264].method3394();
                            field732[var5++] = var265 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3912) {
                            var5--;
                            int var266 = field732[var5];
                            int var267 = client.field509[var266].method3394();
                            field732[var5++] = var267 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3913) {
                            var5--;
                            int var268 = field732[var5];
                            int var269 = client.field509[var268].method3394();
                            field732[var5++] = var269 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3914) {
                            var5--;
                            boolean var270 = field732[var5] == 1;
                            if (Statics.field2679 != null) {
                                Statics.field2679.method3405(class202.field2949, var270);
                            }
                            continue;
                        }
                        if (var491 == 3915) {
                            var5--;
                            boolean var271 = field732[var5] == 1;
                            if (Statics.field2679 != null) {
                                Statics.field2679.method3405(class202.field2947, var271);
                            }
                            continue;
                        }
                        if (var491 == 3916) {
                            var5 -= 2;
                            boolean var272 = field732[var5] == 1;
                            boolean var273 = field732[var5 + 1] == 1;
                            if (Statics.field2679 != null) {
                                Statics.field2679.method3405(new class20(var273), var272);
                            }
                            continue;
                        }
                        if (var491 == 3917) {
                            var5--;
                            boolean var274 = field732[var5] == 1;
                            if (Statics.field2679 != null) {
                                Statics.field2679.method3405(class202.field2946, var274);
                            }
                            continue;
                        }
                        if (var491 == 3918) {
                            var5--;
                            boolean var275 = field732[var5] == 1;
                            if (Statics.field2679 != null) {
                                Statics.field2679.method3405(class202.field2950, var275);
                            }
                            continue;
                        }
                        if (var491 == 3919) {
                            field732[var5++] = Statics.field2679 == null ? 0 : Statics.field2679.field2948.size();
                            continue;
                        }
                        if (var491 == 3920) {
                            var5--;
                            int var276 = field732[var5];
                            class195 var277 = (class195) Statics.field2679.field2948.get(var276);
                            field732[var5++] = var277.field2926;
                            continue;
                        }
                        if (var491 == 3921) {
                            var5--;
                            int var278 = field732[var5];
                            class195 var279 = (class195) Statics.field2679.field2948.get(var278);
                            field723[var6++] = var279.method3360();
                            continue;
                        }
                        if (var491 == 3922) {
                            var5--;
                            int var280 = field732[var5];
                            class195 var281 = (class195) Statics.field2679.field2948.get(var280);
                            field723[var6++] = var281.method3361();
                            continue;
                        }
                        if (var491 == 3923) {
                            var5--;
                            int var282 = field732[var5];
                            class195 var283 = (class195) Statics.field2679.field2948.get(var282);
                            long var284 = class104.method567() - Statics.field997 - var283.field2923;
                            int var286 = (int) (var284 / 3600000L);
                            int var287 = (int) ((var284 - (long) (var286 * 3600000)) / 60000L);
                            int var288 = (int) ((var284 - (long) (var286 * 3600000) - (long) (var287 * 60000)) / 1000L);
                            String var289 = var286 + ":" + var287 / 10 + var287 % 10 + ":" + var288 / 10 + var288 % 10;
                            field723[var6++] = var289;
                            continue;
                        }
                        if (var491 == 3924) {
                            var5--;
                            int var290 = field732[var5];
                            class195 var291 = (class195) Statics.field2679.field2948.get(var290);
                            field732[var5++] = var291.field2924.field2940;
                            continue;
                        }
                        if (var491 == 3925) {
                            var5--;
                            int var292 = field732[var5];
                            class195 var293 = (class195) Statics.field2679.field2948.get(var292);
                            field732[var5++] = var293.field2924.field2941;
                            continue;
                        }
                        if (var491 == 3926) {
                            var5--;
                            int var294 = field732[var5];
                            class195 var295 = (class195) Statics.field2679.field2948.get(var294);
                            field732[var5++] = var295.field2924.field2939;
                            continue;
                        }
                    } else if (var491 < 4100) {
                        if (var491 == 4000) {
                            var5 -= 2;
                            int var296 = field732[var5];
                            int var297 = field732[var5 + 1];
                            field732[var5++] = var296 + var297;
                            continue;
                        }
                        if (var491 == 4001) {
                            var5 -= 2;
                            int var298 = field732[var5];
                            int var299 = field732[var5 + 1];
                            field732[var5++] = var298 - var299;
                            continue;
                        }
                        if (var491 == 4002) {
                            var5 -= 2;
                            int var300 = field732[var5];
                            int var301 = field732[var5 + 1];
                            field732[var5++] = var300 * var301;
                            continue;
                        }
                        if (var491 == 4003) {
                            var5 -= 2;
                            int var302 = field732[var5];
                            int var303 = field732[var5 + 1];
                            field732[var5++] = var302 / var303;
                            continue;
                        }
                        if (var491 == 4004) {
                            var5--;
                            int var304 = field732[var5];
                            field732[var5++] = (int) (Math.random() * (double) var304);
                            continue;
                        }
                        if (var491 == 4005) {
                            var5--;
                            int var305 = field732[var5];
                            field732[var5++] = (int) (Math.random() * (double) (var305 + 1));
                            continue;
                        }
                        if (var491 == 4006) {
                            var5 -= 5;
                            int var306 = field732[var5];
                            int var307 = field732[var5 + 1];
                            int var308 = field732[var5 + 2];
                            int var309 = field732[var5 + 3];
                            int var310 = field732[var5 + 4];
                            field732[var5++] = (var307 - var306) * (var310 - var308) / (var309 - var308) + var306;
                            continue;
                        }
                        if (var491 == 4007) {
                            var5 -= 2;
                            int var311 = field732[var5];
                            int var312 = field732[var5 + 1];
                            field732[var5++] = var311 * var312 / 100 + var311;
                            continue;
                        }
                        if (var491 == 4008) {
                            var5 -= 2;
                            int var313 = field732[var5];
                            int var314 = field732[var5 + 1];
                            field732[var5++] = var313 | 0x1 << var314;
                            continue;
                        }
                        if (var491 == 4009) {
                            var5 -= 2;
                            int var315 = field732[var5];
                            int var316 = field732[var5 + 1];
                            field732[var5++] = var315 & -1 - (0x1 << var316);
                            continue;
                        }
                        if (var491 == 4010) {
                            var5 -= 2;
                            int var317 = field732[var5];
                            int var318 = field732[var5 + 1];
                            field732[var5++] = (var317 & 0x1 << var318) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var491 == 4011) {
                            var5 -= 2;
                            int var319 = field732[var5];
                            int var320 = field732[var5 + 1];
                            field732[var5++] = var319 % var320;
                            continue;
                        }
                        if (var491 == 4012) {
                            var5 -= 2;
                            int var321 = field732[var5];
                            int var322 = field732[var5 + 1];
                            if (var321 == 0) {
                                field732[var5++] = 0;
                            } else {
                                field732[var5++] = (int) Math.pow((double) var321, (double) var322);
                            }
                            continue;
                        }
                        if (var491 == 4013) {
                            var5 -= 2;
                            int var323 = field732[var5];
                            int var324 = field732[var5 + 1];
                            if (var323 == 0) {
                                field732[var5++] = 0;
                            } else if (var324 == 0) {
                                field732[var5++] = Integer.MAX_VALUE;
                            } else {
                                field732[var5++] = (int) Math.pow((double) var323, 1.0D / (double) var324);
                            }
                            continue;
                        }
                        if (var491 == 4014) {
                            var5 -= 2;
                            int var325 = field732[var5];
                            int var326 = field732[var5 + 1];
                            field732[var5++] = var325 & var326;
                            continue;
                        }
                        if (var491 == 4015) {
                            var5 -= 2;
                            int var327 = field732[var5];
                            int var328 = field732[var5 + 1];
                            field732[var5++] = var327 | var328;
                            continue;
                        }
                    } else if (var491 < 4200) {
                        if (var491 == 4100) {
                            var6--;
                            String var329 = field723[var6];
                            var5--;
                            int var330 = field732[var5];
                            field723[var6++] = var329 + var330;
                            continue;
                        }
                        if (var491 == 4101) {
                            var6 -= 2;
                            String var331 = field723[var6];
                            String var332 = field723[var6 + 1];
                            field723[var6++] = var331 + var332;
                            continue;
                        }
                        if (var491 == 4102) {
                            var6--;
                            String var333 = field723[var6];
                            var5--;
                            int var334 = field732[var5];
                            field723[var6++] = var333 + class211.method3147(var334, true);
                            continue;
                        }
                        if (var491 == 4103) {
                            var6--;
                            String var335 = field723[var6];
                            field723[var6++] = var335.toLowerCase();
                            continue;
                        }
                        if (var491 == 4104) {
                            var5--;
                            int var336 = field732[var5];
                            long var337 = ((long) var336 + 11745L) * 86400000L;
                            field731.setTime(new Date(var337));
                            int var339 = field731.get(5);
                            int var340 = field731.get(2);
                            int var341 = field731.get(1);
                            field723[var6++] = var339 + "-" + field724[var340] + "-" + var341;
                            continue;
                        }
                        if (var491 == 4105) {
                            var6 -= 2;
                            String var342 = field723[var6];
                            String var343 = field723[var6 + 1];
                            if (Statics.field695.field36 != null && Statics.field695.field36.field2689) {
                                field723[var6++] = var343;
                                continue;
                            }
                            field723[var6++] = var342;
                            continue;
                        }
                        if (var491 == 4106) {
                            var5--;
                            int var344 = field732[var5];
                            field723[var6++] = Integer.toString(var344);
                            continue;
                        }
                        if (var491 == 4107) {
                            var6 -= 2;
                            int[] var345 = field732;
                            int var346 = var5++;
                            String var347 = field723[var6];
                            String var348 = field723[var6 + 1];
                            int var349 = client.field321;
                            int var350 = var347.length();
                            int var351 = var348.length();
                            int var352 = 0;
                            int var353 = 0;
                            char var354 = 0;
                            char var355 = 0;
                            int var356;
                            label2531: while (true) {
                                if (var352 - var354 >= var350 && var353 - var355 >= var351) {
                                    int var365 = Math.min(var350, var351);
                                    for (int var366 = 0; var366 < var365; var366++) {
                                        char var369 = var347.charAt(var366);
                                        char var370 = var348.charAt(var366);
                                        if (var369 != var370 && Character.toUpperCase(var369) != Character.toUpperCase(var370)) {
                                            char var371 = Character.toLowerCase(var369);
                                            char var372 = Character.toLowerCase(var370);
                                            if (var371 != var372) {
                                                var356 = class214.method96(var371, var349) - class214.method96(var372, var349);
                                                break label2531;
                                            }
                                        }
                                    }
                                    int var373 = var350 - var351;
                                    if (var373 == 0) {
                                        for (int var374 = 0; var374 < var365; var374++) {
                                            char var375 = var347.charAt(var374);
                                            char var376 = var348.charAt(var374);
                                            if (var375 != var376) {
                                                var356 = class214.method96(var375, var349) - class214.method96(var376, var349);
                                                break label2531;
                                            }
                                        }
                                        var356 = 0;
                                    } else {
                                        var356 = var373;
                                    }
                                    break;
                                }
                                if (var352 - var354 >= var350) {
                                    var356 = -1;
                                    break;
                                }
                                if (var353 - var355 >= var351) {
                                    var356 = 1;
                                    break;
                                }
                                char var357;
                                if (var354 == 0) {
                                    var357 = var347.charAt(var352++);
                                } else {
                                    var357 = var354;
                                    boolean var358 = false;
                                }
                                char var359;
                                if (var355 == 0) {
                                    var359 = var348.charAt(var353++);
                                } else {
                                    var359 = var355;
                                    boolean var360 = false;
                                }
                                var354 = class214.method3558(var357);
                                var355 = class214.method3558(var359);
                                char var361 = class214.method442(var357, var349);
                                char var362 = class214.method442(var359, var349);
                                if (var361 != var362 && Character.toUpperCase(var361) != Character.toUpperCase(var362)) {
                                    char var363 = Character.toLowerCase(var361);
                                    char var364 = Character.toLowerCase(var362);
                                    if (var363 != var364) {
                                        var356 = class214.method96(var363, var349) - class214.method96(var364, var349);
                                        break;
                                    }
                                }
                            }
                            var345[var346] = class211.method2454(var356);
                            continue;
                        }
                        if (var491 == 4108) {
                            var6--;
                            String var377 = field723[var6];
                            var5 -= 2;
                            int var378 = field732[var5];
                            int var379 = field732[var5 + 1];
                            byte[] var380 = Statics.field2992.method2721(var379, 0);
                            class205 var381 = new class205(var380);
                            field732[var5++] = var381.method3424(var377, var378);
                            continue;
                        }
                        if (var491 == 4109) {
                            var6--;
                            String var382 = field723[var6];
                            var5 -= 2;
                            int var383 = field732[var5];
                            int var384 = field732[var5 + 1];
                            byte[] var385 = Statics.field2992.method2721(var384, 0);
                            class205 var386 = new class205(var385);
                            field732[var5++] = var386.method3450(var382, var383);
                            continue;
                        }
                        if (var491 == 4110) {
                            var6 -= 2;
                            String var387 = field723[var6];
                            String var388 = field723[var6 + 1];
                            var5--;
                            if (field732[var5] == 1) {
                                field723[var6++] = var387;
                            } else {
                                field723[var6++] = var388;
                            }
                            continue;
                        }
                        if (var491 == 4111) {
                            var6--;
                            String var389 = field723[var6];
                            field723[var6++] = class204.method3425(var389);
                            continue;
                        }
                        if (var491 == 4112) {
                            var6--;
                            String var390 = field723[var6];
                            var5--;
                            int var391 = field732[var5];
                            field723[var6++] = var390 + (char) var391;
                            continue;
                        }
                        if (var491 == 4113) {
                            var5--;
                            int var392 = field732[var5];
                            int[] var393 = field732;
                            int var394 = var5++;
                            char var395 = (char) var392;
                            boolean var396;
                            if (var395 >= ' ' && var395 <= '~') {
                                var396 = true;
                            } else if (var395 >= 160 && var395 <= 255) {
                                var396 = true;
                            } else if (var395 == 8364 || var395 == 338 || var395 == 8212 || var395 == 339 || var395 == 376) {
                                var396 = true;
                            } else {
                                var396 = false;
                            }
                            var393[var394] = var396 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 4114) {
                            var5--;
                            int var397 = field732[var5];
                            int[] var398 = field732;
                            int var399 = var5++;
                            char var400 = (char) var397;
                            boolean var401 = var400 >= '0' && var400 <= '9' || var400 >= 'A' && var400 <= 'Z' || var400 >= 'a' && var400 <= 'z';
                            var398[var399] = var401 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 4115) {
                            var5--;
                            int var402 = field732[var5];
                            field732[var5++] = class211.method828((char) var402) ? 1 : 0;
                            continue;
                        }
                        if (var491 == 4116) {
                            var5--;
                            int var403 = field732[var5];
                            field732[var5++] = class211.method2541((char) var403) ? 1 : 0;
                            continue;
                        }
                        if (var491 == 4117) {
                            var6--;
                            String var404 = field723[var6];
                            if (var404 == null) {
                                field732[var5++] = 0;
                            } else {
                                field732[var5++] = var404.length();
                            }
                            continue;
                        }
                        if (var491 == 4118) {
                            var6--;
                            String var405 = field723[var6];
                            var5 -= 2;
                            int var406 = field732[var5];
                            int var407 = field732[var5 + 1];
                            field723[var6++] = var405.substring(var406, var407);
                            continue;
                        }
                        if (var491 == 4119) {
                            var6--;
                            String var408 = field723[var6];
                            StringBuilder var409 = new StringBuilder(var408.length());
                            boolean var410 = false;
                            for (int var411 = 0; var411 < var408.length(); var411++) {
                                char var412 = var408.charAt(var411);
                                if (var412 == '<') {
                                    var410 = true;
                                } else if (var412 == '>') {
                                    var410 = false;
                                } else if (!var410) {
                                    var409.append(var412);
                                }
                            }
                            field723[var6++] = var409.toString();
                            continue;
                        }
                        if (var491 == 4120) {
                            var6--;
                            String var413 = field723[var6];
                            var5--;
                            int var414 = field732[var5];
                            field732[var5++] = var413.indexOf(var414);
                            continue;
                        }
                        if (var491 == 4121) {
                            var6 -= 2;
                            String var415 = field723[var6];
                            String var416 = field723[var6 + 1];
                            var5--;
                            int var417 = field732[var5];
                            field732[var5++] = var415.indexOf(var416, var417);
                            continue;
                        }
                    } else if (var491 < 4300) {
                        if (var491 == 4200) {
                            var5--;
                            int var418 = field732[var5];
                            field723[var6++] = class46.method476(var418).field1034;
                            continue;
                        }
                        if (var491 == 4201) {
                            var5 -= 2;
                            int var419 = field732[var5];
                            int var420 = field732[var5 + 1];
                            class46 var421 = class46.method476(var419);
                            if (var420 >= 1 && var420 <= 5 && var421.field1043[var420 - 1] != null) {
                                field723[var6++] = var421.field1043[var420 - 1];
                                continue;
                            }
                            field723[var6++] = "";
                            continue;
                        }
                        if (var491 == 4202) {
                            var5 -= 2;
                            int var422 = field732[var5];
                            int var423 = field732[var5 + 1];
                            class46 var424 = class46.method476(var422);
                            if (var423 >= 1 && var423 <= 5 && var424.field1067[var423 - 1] != null) {
                                field723[var6++] = var424.field1067[var423 - 1];
                                continue;
                            }
                            field723[var6++] = "";
                            continue;
                        }
                        if (var491 == 4203) {
                            var5--;
                            int var425 = field732[var5];
                            field732[var5++] = class46.method476(var425).field1027;
                            continue;
                        }
                        if (var491 == 4204) {
                            var5--;
                            int var426 = field732[var5];
                            field732[var5++] = class46.method476(var426).field1033 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 4205) {
                            var5--;
                            int var427 = field732[var5];
                            class46 var428 = class46.method476(var427);
                            if (var428.field1065 == -1 && var428.field1064 >= 0) {
                                field732[var5++] = var428.field1064;
                                continue;
                            }
                            field732[var5++] = var427;
                            continue;
                        }
                        if (var491 == 4206) {
                            var5--;
                            int var429 = field732[var5];
                            class46 var430 = class46.method476(var429);
                            if (var430.field1065 >= 0 && var430.field1064 >= 0) {
                                field732[var5++] = var430.field1064;
                                continue;
                            }
                            field732[var5++] = var429;
                            continue;
                        }
                        if (var491 == 4207) {
                            var5--;
                            int var431 = field732[var5];
                            field732[var5++] = class46.method476(var431).field1029 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 4210) {
                            var6--;
                            String var432 = field723[var6];
                            var5--;
                            int var433 = field732[var5];
                            boolean var435 = var433 == 1;
                            Statics.field1144.field2481 = false;
                            String var436 = var432.toLowerCase();
                            short[] var437 = new short[16];
                            int var438 = 0;
                            int var439 = 0;
                            while (true) {
                                if (var439 >= Statics.field1274) {
                                    Statics.field1016 = var437;
                                    Statics.field2816 = 0;
                                    Statics.field1017 = var438;
                                    String[] var443 = new String[Statics.field1017];
                                    for (int var444 = 0; var444 < Statics.field1017; var444++) {
                                        var443[var444] = class46.method476(var437[var444]).field1034;
                                    }
                                    short[] var445 = Statics.field1016;
                                    class113.method2147(var443, var445, 0, var443.length - 1);
                                    Statics.field1144.method2728();
                                    Statics.field1144.field2481 = true;
                                    break;
                                }
                                class46 var440 = class46.method476(var439);
                                if ((!var435 || var440.field1028) && var440.field1065 == -1 && var440.field1034.toLowerCase().indexOf(var436) != -1) {
                                    if (var438 >= 250) {
                                        Statics.field1017 = -1;
                                        Statics.field1016 = null;
                                        break;
                                    }
                                    if (var438 >= var437.length) {
                                        short[] var441 = new short[var437.length * 2];
                                        for (int var442 = 0; var442 < var438; var442++) {
                                            var441[var442] = var437[var442];
                                        }
                                        var437 = var441;
                                    }
                                    var437[var438++] = (short) var439;
                                }
                                var439++;
                            }
                            field732[var5++] = Statics.field1017;
                            continue;
                        }
                        if (var491 == 4211) {
                            if (Statics.field1016 != null && Statics.field2816 < Statics.field1017) {
                                field732[var5++] = Statics.field1016[++Statics.field2816 - 1] & 0xFFFF;
                                continue;
                            }
                            field732[var5++] = -1;
                            continue;
                        }
                        if (var491 == 4212) {
                            Statics.field2816 = 0;
                            continue;
                        }
                    } else if (var491 < 5100) {
                        if (var491 == 5000) {
                            field732[var5++] = client.field463;
                            continue;
                        }
                        if (var491 == 5001) {
                            var5 -= 3;
                            client.field463 = field732[var5];
                            int var446 = field732[var5 + 1];
                            class119[] var447 = new class119[] { class119.field1912, class119.field1913, class119.field1915 };
                            class119[] var448 = var447;
                            int var449 = 0;
                            class119 var451;
                            while (true) {
                                if (var449 >= var448.length) {
                                    var451 = null;
                                    break;
                                }
                                class119 var450 = var448[var449];
                                if (var450.field1914 == var446) {
                                    var451 = var450;
                                    break;
                                }
                                var449++;
                            }
                            Statics.field236 = var451;
                            if (Statics.field236 == null) {
                                Statics.field236 = class119.field1913;
                            }
                            client.field464 = field732[var5 + 2];
                            client.field454.method2357(176);
                            client.field454.method2123(client.field463);
                            client.field454.method2123(Statics.field236.field1914);
                            client.field454.method2123(client.field464);
                            continue;
                        }
                        if (var491 == 5002) {
                            var6--;
                            String var452 = field723[var6];
                            var5 -= 2;
                            int var453 = field732[var5];
                            int var454 = field732[var5 + 1];
                            client.field454.method2357(11);
                            client.field454.method2123(class108.method2832(var452) + 2);
                            client.field454.method2304(var452);
                            client.field454.method2123(var453 - 1);
                            client.field454.method2123(var454);
                            continue;
                        }
                        if (var491 == 5003) {
                            var5 -= 2;
                            int var455 = field732[var5];
                            int var456 = field732[var5 + 1];
                            class25 var457 = (class25) class10.field151.get(var455);
                            class32 var458 = var457.method498(var456);
                            if (var458 == null) {
                                field732[var5++] = -1;
                                field732[var5++] = 0;
                                field723[var6++] = "";
                                field723[var6++] = "";
                                field723[var6++] = "";
                            } else {
                                field732[var5++] = var458.field719;
                                field732[var5++] = var458.field716;
                                field723[var6++] = var458.field713 == null ? "" : var458.field713;
                                field723[var6++] = var458.field717 == null ? "" : var458.field717;
                                field723[var6++] = var458.field718 == null ? "" : var458.field718;
                            }
                            continue;
                        }
                        if (var491 == 5004) {
                            var5--;
                            int var460 = field732[var5];
                            class32 var461 = class10.method26(var460);
                            if (var461 == null) {
                                field732[var5++] = -1;
                                field732[var5++] = 0;
                                field723[var6++] = "";
                                field723[var6++] = "";
                                field723[var6++] = "";
                            } else {
                                field732[var5++] = var461.field715;
                                field732[var5++] = var461.field716;
                                field723[var6++] = var461.field713 == null ? "" : var461.field713;
                                field723[var6++] = var461.field717 == null ? "" : var461.field717;
                                field723[var6++] = var461.field718 == null ? "" : var461.field718;
                            }
                            continue;
                        }
                        if (var491 == 5005) {
                            if (Statics.field236 == null) {
                                field732[var5++] = -1;
                            } else {
                                field732[var5++] = Statics.field236.field1914;
                            }
                            continue;
                        }
                        if (var491 == 5008) {
                            var6--;
                            String var462 = field723[var6];
                            var5--;
                            int var463 = field732[var5];
                            String var464 = var462.toLowerCase();
                            byte var465 = 0;
                            if (var464.startsWith(class145.field2231)) {
                                var465 = 0;
                                var462 = var462.substring(class145.field2231.length());
                            } else if (var464.startsWith(class145.field2343)) {
                                var465 = 1;
                                var462 = var462.substring(class145.field2343.length());
                            } else if (var464.startsWith(class145.field2345)) {
                                var465 = 2;
                                var462 = var462.substring(class145.field2345.length());
                            } else if (var464.startsWith(class145.field2286)) {
                                var465 = 3;
                                var462 = var462.substring(class145.field2286.length());
                            } else if (var464.startsWith(class145.field2348)) {
                                var465 = 4;
                                var462 = var462.substring(class145.field2348.length());
                            } else if (var464.startsWith(class145.field2351)) {
                                var465 = 5;
                                var462 = var462.substring(class145.field2351.length());
                            } else if (var464.startsWith(class145.field2353)) {
                                var465 = 6;
                                var462 = var462.substring(class145.field2353.length());
                            } else if (var464.startsWith(class145.field2355)) {
                                var465 = 7;
                                var462 = var462.substring(class145.field2355.length());
                            } else if (var464.startsWith(class145.field2176)) {
                                var465 = 8;
                                var462 = var462.substring(class145.field2176.length());
                            } else if (var464.startsWith(class145.field2167)) {
                                var465 = 9;
                                var462 = var462.substring(class145.field2167.length());
                            } else if (var464.startsWith(class145.field2257)) {
                                var465 = 10;
                                var462 = var462.substring(class145.field2257.length());
                            } else if (var464.startsWith(class145.field2363)) {
                                var465 = 11;
                                var462 = var462.substring(class145.field2363.length());
                            } else if (client.field321 != 0) {
                                if (var464.startsWith(class145.field2168)) {
                                    var465 = 0;
                                    var462 = var462.substring(class145.field2168.length());
                                } else if (var464.startsWith(class145.field2398)) {
                                    var465 = 1;
                                    var462 = var462.substring(class145.field2398.length());
                                } else if (var464.startsWith(class145.field2346)) {
                                    var465 = 2;
                                    var462 = var462.substring(class145.field2346.length());
                                } else if (var464.startsWith(class145.field2239)) {
                                    var465 = 3;
                                    var462 = var462.substring(class145.field2239.length());
                                } else if (var464.startsWith(class145.field2350)) {
                                    var465 = 4;
                                    var462 = var462.substring(class145.field2350.length());
                                } else if (var464.startsWith(class145.field2352)) {
                                    var465 = 5;
                                    var462 = var462.substring(class145.field2352.length());
                                } else if (var464.startsWith(class145.field2354)) {
                                    var465 = 6;
                                    var462 = var462.substring(class145.field2354.length());
                                } else if (var464.startsWith(class145.field2356)) {
                                    var465 = 7;
                                    var462 = var462.substring(class145.field2356.length());
                                } else if (var464.startsWith(class145.field2233)) {
                                    var465 = 8;
                                    var462 = var462.substring(class145.field2233.length());
                                } else if (var464.startsWith(class145.field2360)) {
                                    var465 = 9;
                                    var462 = var462.substring(class145.field2360.length());
                                } else if (var464.startsWith(class145.field2362)) {
                                    var465 = 10;
                                    var462 = var462.substring(class145.field2362.length());
                                } else if (var464.startsWith(class145.field2364)) {
                                    var465 = 11;
                                    var462 = var462.substring(class145.field2364.length());
                                }
                            }
                            String var466 = var462.toLowerCase();
                            byte var467 = 0;
                            if (var466.startsWith(class145.field2365)) {
                                var467 = 1;
                                var462 = var462.substring(class145.field2365.length());
                            } else if (var466.startsWith(class145.field2367)) {
                                var467 = 2;
                                var462 = var462.substring(class145.field2367.length());
                            } else if (var466.startsWith(class145.field2389)) {
                                var467 = 3;
                                var462 = var462.substring(class145.field2389.length());
                            } else if (var466.startsWith(class145.field2211)) {
                                var467 = 4;
                                var462 = var462.substring(class145.field2211.length());
                            } else if (var466.startsWith(class145.field2373)) {
                                var467 = 5;
                                var462 = var462.substring(class145.field2373.length());
                            } else if (client.field321 != 0) {
                                if (var466.startsWith(class145.field2366)) {
                                    var467 = 1;
                                    var462 = var462.substring(class145.field2366.length());
                                } else if (var466.startsWith(class145.field2368)) {
                                    var467 = 2;
                                    var462 = var462.substring(class145.field2368.length());
                                } else if (var466.startsWith(class145.field2370)) {
                                    var467 = 3;
                                    var462 = var462.substring(class145.field2370.length());
                                } else if (var466.startsWith(class145.field2372)) {
                                    var467 = 4;
                                    var462 = var462.substring(class145.field2372.length());
                                } else if (var466.startsWith(class145.field2332)) {
                                    var467 = 5;
                                    var462 = var462.substring(class145.field2332.length());
                                }
                            }
                            client.field454.method2357(209);
                            client.field454.method2123(0);
                            int var468 = client.field454.field1841;
                            client.field454.method2123(var463);
                            client.field454.method2123(var465);
                            client.field454.method2123(var467);
                            class203.method2706(client.field454, var462);
                            client.field454.method2119(client.field454.field1841 - var468);
                            continue;
                        }
                        if (var491 == 5009) {
                            var6 -= 2;
                            String var469 = field723[var6];
                            String var470 = field723[var6 + 1];
                            client.field454.method2357(13);
                            client.field454.method2109(0);
                            int var471 = client.field454.field1841;
                            client.field454.method2304(var469);
                            class203.method2706(client.field454, var470);
                            client.field454.method2118(client.field454.field1841 - var471);
                            continue;
                        }
                        if (var491 == 5015) {
                            String var472;
                            if (Statics.field695 == null || Statics.field695.field48 == null) {
                                var472 = "";
                            } else {
                                var472 = Statics.field695.field48;
                            }
                            field723[var6++] = var472;
                            continue;
                        }
                        if (var491 == 5016) {
                            field732[var5++] = client.field464;
                            continue;
                        }
                        if (var491 == 5017) {
                            var5--;
                            int var473 = field732[var5];
                            field732[var5++] = class10.method3(var473);
                            continue;
                        }
                        if (var491 == 5018) {
                            var5--;
                            int var474 = field732[var5];
                            int[] var475 = field732;
                            int var476 = var5++;
                            class32 var477 = (class32) class10.field146.method3209((long) var474);
                            int var478;
                            if (var477 == null) {
                                var478 = -1;
                            } else if (class10.field147.field2880 == var477.field2884) {
                                var478 = -1;
                            } else {
                                var478 = ((class32) var477.field2884).field719;
                            }
                            var475[var476] = var478;
                            continue;
                        }
                        if (var491 == 5019) {
                            var5--;
                            int var479 = field732[var5];
                            int[] var480 = field732;
                            int var481 = var5++;
                            class32 var482 = (class32) class10.field146.method3209((long) var479);
                            int var483;
                            if (var482 == null) {
                                var483 = -1;
                            } else if (class10.field147.field2880 == var482.field2885) {
                                var483 = -1;
                            } else {
                                var483 = ((class32) var482.field2885).field719;
                            }
                            var480[var481] = var483;
                            continue;
                        }
                        if (var491 == 5020) {
                            var6--;
                            String var484 = field723[var6];
                            client.method813(var484);
                            continue;
                        }
                        if (var491 == 5021) {
                            var6--;
                            client.field287 = field723[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var491 == 5022) {
                            field723[var6++] = client.field287;
                            continue;
                        }
                    }
                } else {
                    class155 var73;
                    if (var491 >= 2000) {
                        var491 -= 1000;
                        var5--;
                        var73 = class155.method1383(field732[var5]);
                    } else {
                        var73 = var48 ? Statics.field1470 : Statics.field1293;
                    }
                    if (var491 == 1300) {
                        var5--;
                        int var74 = field732[var5] - 1;
                        if (var74 >= 0 && var74 <= 9) {
                            var6--;
                            var73.method2878(var74, field723[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var491 == 1301) {
                        var5 -= 2;
                        int var75 = field732[var5];
                        int var76 = field732[var5 + 1];
                        var73.field2612 = class155.method1027(var75, var76);
                        continue;
                    }
                    if (var491 == 1302) {
                        var5--;
                        var73.field2610 = field732[var5] == 1;
                        continue;
                    }
                    if (var491 == 1303) {
                        var5--;
                        var73.field2613 = field732[var5];
                        continue;
                    }
                    if (var491 == 1304) {
                        var5--;
                        var73.field2614 = field732[var5];
                        continue;
                    }
                    if (var491 == 1305) {
                        var6--;
                        var73.field2623 = field723[var6];
                        continue;
                    }
                    if (var491 == 1306) {
                        var6--;
                        var73.field2595 = field723[var6];
                        continue;
                    }
                    if (var491 == 1307) {
                        var73.field2665 = null;
                        continue;
                    }
                }
                if (var491 >= 5600 || var491 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var485 = field732[var5];
                int var486 = field732[var5 + 1];
                if (!client.field494) {
                    client.field422 = var485;
                    client.field378 = var486;
                }
            }
        } catch (Exception var490) {
            StringBuilder var488 = new StringBuilder(30);
            var488.append("").append(var4.field2894).append(" ");
            for (int var489 = field729 - 1; var489 >= 0; var489--) {
                var488.append("").append(field730[var489].field190.field2894).append(" ");
            }
            var488.append("").append(var10);
            class137.method101(var488.toString(), var490);
        }
    }

    @ObfuscatedName("n.v(IB)V")
    public static void method140(int arg0) {
        if (arg0 == -1 || !class155.method485(arg0)) {
            return;
        }
        class155[] var1 = Statics.field2584[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class155 var3 = var1[var2];
            if (var3.field2618 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field8 = var3.field2618;
                method561(var4, 2000000);
            }
        }
    }
}
