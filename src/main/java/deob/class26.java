package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("c")
public class class26 {

    @ObfuscatedName("c.p")
    public static int[] field392 = new int[5];

    @ObfuscatedName("c.e")
    public static int[][] field385 = new int[5][5000];

    @ObfuscatedName("c.d")
    public static int[] field400 = new int[1000];

    @ObfuscatedName("c.y")
    public static String[] field391 = new String[1000];

    @ObfuscatedName("c.x")
    public static int field399 = 0;

    @ObfuscatedName("c.t")
    public static class18[] field393 = new class18[50];

    @ObfuscatedName("c.o")
    public static Calendar field395 = Calendar.getInstance();

    @ObfuscatedName("c.u")
    public static final String[] field390 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.j(Lj;I)V")
    public static void method2(class1 arg0) {
        Object[] var1 = arg0.field4;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method119(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field58;
        int[] var8 = var3.field59;
        byte var9 = -1;
        field399 = 0;
        try {
            Statics.field386 = new int[var3.field61];
            int var10 = 0;
            Statics.field387 = new String[var3.field62];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field3;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field2;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field5 == null ? -1 : arg0.field5.field2574;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field1;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field5 == null ? -1 : arg0.field5.field2575;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2574;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2575;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field9;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field8;
                    }
                    Statics.field386[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field7;
                    }
                    Statics.field387[var11++] = var14;
                }
            }
            int var15 = 0;
            label2569: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var437 = var7[var6];
                if (var437 < 100) {
                    if (var437 == 0) {
                        field400[var4++] = var8[var6];
                        continue;
                    }
                    if (var437 == 1) {
                        int var16 = var8[var6];
                        field400[var4++] = class159.field2693[var16];
                        continue;
                    }
                    if (var437 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class159.field2693[var17] = field400[var4];
                        continue;
                    }
                    if (var437 == 3) {
                        field391[var5++] = var3.field60[var6];
                        continue;
                    }
                    if (var437 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var437 == 7) {
                        var4 -= 2;
                        if (field400[var4 + 1] != field400[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var437 == 8) {
                        var4 -= 2;
                        if (field400[var4 + 1] == field400[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var437 == 9) {
                        var4 -= 2;
                        if (field400[var4] < field400[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var437 == 10) {
                        var4 -= 2;
                        if (field400[var4] > field400[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var437 == 21) {
                        if (field399 == 0) {
                            return;
                        }
                        class18 var18 = field393[--field399];
                        var3 = var18.field269;
                        var7 = var3.field58;
                        var8 = var3.field59;
                        var6 = var18.field263;
                        Statics.field386 = var18.field262;
                        Statics.field387 = var18.field265;
                        continue;
                    }
                    if (var437 == 25) {
                        int var19 = var8[var6];
                        field400[var4++] = class159.method791(var19);
                        continue;
                    }
                    if (var437 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field400[var4];
                        class38 var22 = (class38) class38.field956.method3264((long) var20);
                        class38 var23;
                        if (var22 == null) {
                            byte[] var24 = Statics.field957.method3016(14, var20);
                            class38 var25 = new class38();
                            if (var24 != null) {
                                var25.method794(new class127(var24));
                            }
                            class38.field956.method3257(var25, (long) var20);
                            var23 = var25;
                        } else {
                            var23 = var22;
                        }
                        int var27 = var23.field961;
                        int var28 = var23.field958;
                        int var29 = var23.field959;
                        int var30 = class159.field2692[var29 - var28];
                        if (var21 < 0 || var21 > var30) {
                            var21 = 0;
                        }
                        int var31 = var30 << var28;
                        class159.field2693[var27] = class159.field2693[var27] & ~var31 | var21 << var28 & var31;
                        continue;
                    }
                    if (var437 == 31) {
                        var4 -= 2;
                        if (field400[var4] <= field400[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var437 == 32) {
                        var4 -= 2;
                        if (field400[var4] >= field400[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var437 == 33) {
                        field400[var4++] = Statics.field386[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var437 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field386[var10001] = field400[var4];
                        continue;
                    }
                    if (var437 == 35) {
                        field391[var5++] = Statics.field387[var8[var6]];
                        continue;
                    }
                    if (var437 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field387[var10001] = field391[var5];
                        continue;
                    }
                    if (var437 == 37) {
                        int var32 = var8[var6];
                        var5 -= var32;
                        String var33 = class147.method138(field391, var5, var32);
                        field391[var5++] = var33;
                        continue;
                    }
                    if (var437 == 38) {
                        var4--;
                        continue;
                    }
                    if (var437 == 39) {
                        var5--;
                        continue;
                    }
                    if (var437 == 40) {
                        int var34 = var8[var6];
                        class5 var35 = class5.method119(var34);
                        int[] var36 = new int[var35.field61];
                        String[] var37 = new String[var35.field62];
                        for (int var38 = 0; var38 < var35.field63; var38++) {
                            var36[var38] = field400[var4 - var35.field63 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field64; var39++) {
                            var37[var39] = field391[var5 - var35.field64 + var39];
                        }
                        var4 -= var35.field63;
                        var5 -= var35.field64;
                        class18 var40 = new class18();
                        var40.field269 = var3;
                        var40.field263 = var6;
                        var40.field262 = Statics.field386;
                        var40.field265 = Statics.field387;
                        field393[++field399 - 1] = var40;
                        var3 = var35;
                        var7 = var35.field58;
                        var8 = var35.field59;
                        var6 = -1;
                        Statics.field386 = var36;
                        Statics.field387 = var37;
                        continue;
                    }
                    if (var437 == 42) {
                        field400[var4++] = client.field665[var8[var6]];
                        continue;
                    }
                    if (var437 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field665[var10001] = field400[var4];
                        continue;
                    }
                    if (var437 == 44) {
                        int var41 = var8[var6] >> 16;
                        int var42 = var8[var6] & 0xFFFF;
                        var4--;
                        int var43 = field400[var4];
                        if (var43 >= 0 && var43 <= 5000) {
                            field392[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2569;
                                }
                                field385[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var437 == 45) {
                        int var46 = var8[var6];
                        var4--;
                        int var47 = field400[var4];
                        if (var47 >= 0 && var47 < field392[var46]) {
                            field400[var4++] = field385[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var437 == 46) {
                        int var48 = var8[var6];
                        var4 -= 2;
                        int var49 = field400[var4];
                        if (var49 >= 0 && var49 < field392[var48]) {
                            field385[var48][var49] = field400[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var437 == 47) {
                        String var50 = client.field666[var8[var6]];
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field391[var5++] = var50;
                        continue;
                    }
                    if (var437 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field666[var10001] = field391[var5];
                        continue;
                    }
                }
                boolean var51;
                if (var8[var6] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var437 < 1000) {
                    if (var437 == 100) {
                        var4 -= 3;
                        int var52 = field400[var4];
                        int var53 = field400[var4 + 1];
                        int var54 = field400[var4 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class158 var55 = class158.method3(var52);
                        if (var55.field2642 == null) {
                            var55.field2642 = new class158[var54 + 1];
                        }
                        if (var55.field2642.length <= var54) {
                            class158[] var56 = new class158[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2642.length; var57++) {
                                var56[var57] = var55.field2642[var57];
                            }
                            var55.field2642 = var56;
                        }
                        if (var54 > 0 && var55.field2642[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class158 var58 = new class158();
                        var58.field2586 = var53;
                        var58.field2585 = var58.field2574 = var55.field2574;
                        var58.field2575 = var54;
                        var58.field2573 = true;
                        var55.field2642[var54] = var58;
                        if (var51) {
                            Statics.field404 = var58;
                        } else {
                            Statics.field1224 = var58;
                        }
                        client.method1586(var55);
                        continue;
                    }
                    if (var437 == 101) {
                        class158 var59 = var51 ? Statics.field404 : Statics.field1224;
                        class158 var60 = class158.method3(var59.field2574);
                        var60.field2642[var59.field2575] = null;
                        client.method1586(var60);
                        continue;
                    }
                    if (var437 == 102) {
                        var4--;
                        class158 var61 = class158.method3(field400[var4]);
                        var61.field2642 = null;
                        client.method1586(var61);
                        continue;
                    }
                    if (var437 == 200) {
                        var4 -= 2;
                        int var62 = field400[var4];
                        int var63 = field400[var4 + 1];
                        class158 var64 = class158.method1(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field400[var4++] = 1;
                            if (var51) {
                                Statics.field404 = var64;
                            } else {
                                Statics.field1224 = var64;
                            }
                            continue;
                        }
                        field400[var4++] = 0;
                        continue;
                    }
                } else if (var437 >= 1000 && var437 < 1100 || var437 >= 2000 && var437 < 2100) {
                    class158 var65;
                    if (var437 >= 2000) {
                        var437 -= 1000;
                        var4--;
                        var65 = class158.method3(field400[var4]);
                    } else {
                        var65 = var51 ? Statics.field404 : Statics.field1224;
                    }
                    if (var437 == 1000) {
                        var4 -= 2;
                        var65.field2690 = field400[var4];
                        var65.field2580 = field400[var4 + 1];
                        client.method1586(var65);
                        continue;
                    }
                    if (var437 == 1001) {
                        var4 -= 2;
                        var65.field2583 = field400[var4];
                        var65.field2584 = field400[var4 + 1];
                        client.method1586(var65);
                        continue;
                    }
                    if (var437 == 1003) {
                        var4--;
                        boolean var66 = field400[var4] == 1;
                        if (var65.field2576 != var66) {
                            var65.field2576 = var66;
                            client.method1586(var65);
                        }
                        continue;
                    }
                } else if (!(var437 < 1100 || var437 >= 1200) || !(var437 < 2100 || var437 >= 2200)) {
                    class158 var67;
                    if (var437 >= 2000) {
                        var437 -= 1000;
                        var4--;
                        var67 = class158.method3(field400[var4]);
                    } else {
                        var67 = var51 ? Statics.field404 : Statics.field1224;
                    }
                    if (var437 == 1100) {
                        var4 -= 2;
                        var67.field2587 = field400[var4];
                        if (var67.field2587 > var67.field2681 - var67.field2583) {
                            var67.field2587 = var67.field2681 - var67.field2583;
                        }
                        if (var67.field2587 < 0) {
                            var67.field2587 = 0;
                        }
                        var67.field2588 = field400[var4 + 1];
                        if (var67.field2588 > var67.field2650 - var67.field2584) {
                            var67.field2588 = var67.field2650 - var67.field2584;
                        }
                        if (var67.field2588 < 0) {
                            var67.field2588 = 0;
                        }
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1101) {
                        var4--;
                        var67.field2659 = field400[var4];
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1102) {
                        var4--;
                        var67.field2595 = field400[var4] == 1;
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1103) {
                        var4--;
                        var67.field2568 = field400[var4];
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1104) {
                        var4--;
                        var67.field2597 = field400[var4];
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1105) {
                        var4--;
                        var67.field2598 = field400[var4];
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1106) {
                        var4--;
                        var67.field2564 = field400[var4];
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1107) {
                        var4--;
                        var67.field2605 = field400[var4] == 1;
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1108) {
                        var67.field2687 = 1;
                        var4--;
                        var67.field2607 = field400[var4];
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1109) {
                        var4 -= 6;
                        var67.field2612 = field400[var4];
                        var67.field2613 = field400[var4 + 1];
                        var67.field2614 = field400[var4 + 2];
                        var67.field2615 = field400[var4 + 3];
                        var67.field2589 = field400[var4 + 4];
                        var67.field2656 = field400[var4 + 5];
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1110) {
                        var4--;
                        int var68 = field400[var4];
                        if (var67.field2610 != var68) {
                            var67.field2610 = var68;
                            var67.field2680 = 0;
                            var67.field2653 = 0;
                            client.method1586(var67);
                        }
                        continue;
                    }
                    if (var437 == 1111) {
                        var4--;
                        var67.field2619 = field400[var4] == 1;
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1112) {
                        var5--;
                        String var69 = field391[var5];
                        if (!var69.equals(var67.field2621)) {
                            var67.field2621 = var69;
                            client.method1586(var67);
                        }
                        continue;
                    }
                    if (var437 == 1113) {
                        var4--;
                        var67.field2620 = field400[var4];
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1114) {
                        var4 -= 3;
                        var67.field2624 = field400[var4];
                        var67.field2625 = field400[var4 + 1];
                        var67.field2629 = field400[var4 + 2];
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1115) {
                        var4--;
                        var67.field2631 = field400[var4] == 1;
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1116) {
                        var4--;
                        var67.field2602 = field400[var4];
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1117) {
                        var4--;
                        var67.field2604 = field400[var4];
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1118) {
                        var4--;
                        var67.field2670 = field400[var4] == 1;
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1119) {
                        var4--;
                        var67.field2628 = field400[var4] == 1;
                        client.method1586(var67);
                        continue;
                    }
                    if (var437 == 1120) {
                        var4 -= 2;
                        var67.field2681 = field400[var4];
                        var67.field2650 = field400[var4 + 1];
                        client.method1586(var67);
                        continue;
                    }
                } else if (var437 >= 1200 && var437 < 1300 || var437 >= 2200 && var437 < 2300) {
                    class158 var70;
                    if (var437 >= 2000) {
                        var437 -= 1000;
                        var4--;
                        var70 = class158.method3(field400[var4]);
                    } else {
                        var70 = var51 ? Statics.field404 : Statics.field1224;
                    }
                    client.method1586(var70);
                    if (var437 == 1200) {
                        var4 -= 2;
                        int var71 = field400[var4];
                        int var72 = field400[var4 + 1];
                        var70.field2678 = var71;
                        var70.field2679 = var72;
                        class40 var73 = class40.method789(var71);
                        var70.field2614 = var73.field992;
                        var70.field2615 = var73.field981;
                        var70.field2589 = var73.field997;
                        var70.field2612 = var73.field1021;
                        var70.field2613 = var73.field996;
                        var70.field2656 = var73.field991;
                        if (var70.field2583 > 0) {
                            var70.field2656 = var70.field2656 * 32 / var70.field2583;
                        }
                        continue;
                    }
                    if (var437 == 1201) {
                        var70.field2687 = 2;
                        var4--;
                        var70.field2607 = field400[var4];
                        continue;
                    }
                    if (var437 == 1202) {
                        var70.field2687 = 3;
                        var70.field2607 = Statics.field71.field30.method3173();
                        continue;
                    }
                } else if ((var437 < 1300 || var437 >= 1400) && (var437 < 2300 || var437 >= 2400)) {
                    if (var437 >= 1400 && var437 < 1500 || var437 >= 2400 && var437 < 2500) {
                        class158 var78;
                        if (var437 >= 2000) {
                            var437 -= 1000;
                            var4--;
                            var78 = class158.method3(field400[var4]);
                        } else {
                            var78 = var51 ? Statics.field404 : Statics.field1224;
                        }
                        var5--;
                        String var79 = field391[var5];
                        int[] var80 = null;
                        if (var79.length() > 0 && var79.charAt(var79.length() - 1) == 'Y') {
                            var4--;
                            int var81 = field400[var4];
                            if (var81 > 0) {
                                var80 = new int[var81];
                                while (var81-- > 0) {
                                    var4--;
                                    var80[var81] = field400[var4];
                                }
                            }
                            var79 = var79.substring(0, var79.length() - 1);
                        }
                        Object[] var82 = new Object[var79.length() + 1];
                        for (int var83 = var82.length - 1; var83 >= 1; var83--) {
                            if (var79.charAt(var83 - 1) == 's') {
                                var5--;
                                var82[var83] = field391[var5];
                            } else {
                                var4--;
                                var82[var83] = Integer.valueOf(field400[var4]);
                            }
                        }
                        var4--;
                        int var84 = field400[var4];
                        if (var84 == -1) {
                            var82 = null;
                        } else {
                            var82[0] = Integer.valueOf(var84);
                        }
                        if (var437 == 1400) {
                            var78.field2643 = var82;
                        }
                        if (var437 == 1401) {
                            var78.field2618 = var82;
                        }
                        if (var437 == 1402) {
                            var78.field2645 = var82;
                        }
                        if (var437 == 1403) {
                            var78.field2647 = var82;
                        }
                        if (var437 == 1404) {
                            var78.field2571 = var82;
                        }
                        if (var437 == 1405) {
                            var78.field2593 = var82;
                        }
                        if (var437 == 1406) {
                            var78.field2596 = var82;
                        }
                        if (var437 == 1407) {
                            var78.field2654 = var82;
                            var78.field2655 = var80;
                        }
                        if (var437 == 1408) {
                            var78.field2660 = var82;
                        }
                        if (var437 == 1409) {
                            var78.field2661 = var82;
                        }
                        if (var437 == 1410) {
                            var78.field2651 = var82;
                        }
                        if (var437 == 1411) {
                            var78.field2641 = var82;
                        }
                        if (var437 == 1412) {
                            var78.field2648 = var82;
                        }
                        if (var437 == 1414) {
                            var78.field2684 = var82;
                            var78.field2657 = var80;
                        }
                        if (var437 == 1415) {
                            var78.field2658 = var82;
                            var78.field2616 = var80;
                        }
                        if (var437 == 1416) {
                            var78.field2632 = var82;
                        }
                        if (var437 == 1417) {
                            var78.field2662 = var82;
                        }
                        if (var437 == 1418) {
                            var78.field2663 = var82;
                        }
                        if (var437 == 1419) {
                            var78.field2664 = var82;
                        }
                        if (var437 == 1420) {
                            var78.field2665 = var82;
                        }
                        if (var437 == 1421) {
                            var78.field2666 = var82;
                        }
                        if (var437 == 1422) {
                            var78.field2667 = var82;
                        }
                        if (var437 == 1423) {
                            var78.field2668 = var82;
                        }
                        if (var437 == 1424) {
                            var78.field2669 = var82;
                        }
                        var78.field2639 = true;
                        continue;
                    }
                    if (var437 < 1600) {
                        class158 var85 = var51 ? Statics.field404 : Statics.field1224;
                        if (var437 == 1500) {
                            field400[var4++] = var85.field2690;
                            continue;
                        }
                        if (var437 == 1501) {
                            field400[var4++] = var85.field2580;
                            continue;
                        }
                        if (var437 == 1502) {
                            field400[var4++] = var85.field2583;
                            continue;
                        }
                        if (var437 == 1503) {
                            field400[var4++] = var85.field2584;
                            continue;
                        }
                        if (var437 == 1504) {
                            field400[var4++] = var85.field2576 ? 1 : 0;
                            continue;
                        }
                        if (var437 == 1505) {
                            field400[var4++] = var85.field2585;
                            continue;
                        }
                    } else if (var437 < 1700) {
                        class158 var86 = var51 ? Statics.field404 : Statics.field1224;
                        if (var437 == 1600) {
                            field400[var4++] = var86.field2587;
                            continue;
                        }
                        if (var437 == 1601) {
                            field400[var4++] = var86.field2588;
                            continue;
                        }
                        if (var437 == 1602) {
                            field391[var5++] = var86.field2621;
                            continue;
                        }
                        if (var437 == 1603) {
                            field400[var4++] = var86.field2681;
                            continue;
                        }
                        if (var437 == 1604) {
                            field400[var4++] = var86.field2650;
                            continue;
                        }
                        if (var437 == 1605) {
                            field400[var4++] = var86.field2656;
                            continue;
                        }
                        if (var437 == 1606) {
                            field400[var4++] = var86.field2614;
                            continue;
                        }
                        if (var437 == 1607) {
                            field400[var4++] = var86.field2589;
                            continue;
                        }
                        if (var437 == 1608) {
                            field400[var4++] = var86.field2615;
                            continue;
                        }
                    } else if (var437 < 1800) {
                        class158 var87 = var51 ? Statics.field404 : Statics.field1224;
                        if (var437 == 1700) {
                            field400[var4++] = var87.field2678;
                            continue;
                        }
                        if (var437 == 1701) {
                            if (var87.field2678 == -1) {
                                field400[var4++] = 0;
                            } else {
                                field400[var4++] = var87.field2679;
                            }
                            continue;
                        }
                        if (var437 == 1702) {
                            field400[var4++] = var87.field2575;
                            continue;
                        }
                    } else if (var437 < 1900) {
                        class158 var88 = var51 ? Statics.field404 : Statics.field1224;
                        if (var437 == 1800) {
                            field400[var4++] = class162.method2210(client.method1588(var88));
                            continue;
                        }
                        if (var437 == 1801) {
                            var4--;
                            int var89 = field400[var4];
                            int var438 = var89 - 1;
                            if (var88.field2635 != null && var438 < var88.field2635.length && var88.field2635[var438] != null) {
                                field391[var5++] = var88.field2635[var438];
                                continue;
                            }
                            field391[var5++] = "";
                            continue;
                        }
                        if (var437 == 1802) {
                            if (var88.field2638 == null) {
                                field391[var5++] = "";
                            } else {
                                field391[var5++] = var88.field2638;
                            }
                            continue;
                        }
                    } else if (var437 < 2600) {
                        var4--;
                        class158 var90 = class158.method3(field400[var4]);
                        if (var437 == 2500) {
                            field400[var4++] = var90.field2690;
                            continue;
                        }
                        if (var437 == 2501) {
                            field400[var4++] = var90.field2580;
                            continue;
                        }
                        if (var437 == 2502) {
                            field400[var4++] = var90.field2583;
                            continue;
                        }
                        if (var437 == 2503) {
                            field400[var4++] = var90.field2584;
                            continue;
                        }
                        if (var437 == 2504) {
                            field400[var4++] = var90.field2576 ? 1 : 0;
                            continue;
                        }
                        if (var437 == 2505) {
                            field400[var4++] = var90.field2585;
                            continue;
                        }
                    } else if (var437 < 2700) {
                        var4--;
                        class158 var91 = class158.method3(field400[var4]);
                        if (var437 == 2600) {
                            field400[var4++] = var91.field2587;
                            continue;
                        }
                        if (var437 == 2601) {
                            field400[var4++] = var91.field2588;
                            continue;
                        }
                        if (var437 == 2602) {
                            field391[var5++] = var91.field2621;
                            continue;
                        }
                        if (var437 == 2603) {
                            field400[var4++] = var91.field2681;
                            continue;
                        }
                        if (var437 == 2604) {
                            field400[var4++] = var91.field2650;
                            continue;
                        }
                        if (var437 == 2605) {
                            field400[var4++] = var91.field2656;
                            continue;
                        }
                        if (var437 == 2606) {
                            field400[var4++] = var91.field2614;
                            continue;
                        }
                        if (var437 == 2607) {
                            field400[var4++] = var91.field2589;
                            continue;
                        }
                        if (var437 == 2608) {
                            field400[var4++] = var91.field2615;
                            continue;
                        }
                    } else if (var437 < 2800) {
                        if (var437 == 2700) {
                            var4--;
                            class158 var92 = class158.method3(field400[var4]);
                            field400[var4++] = var92.field2678;
                            continue;
                        }
                        if (var437 == 2701) {
                            var4--;
                            class158 var93 = class158.method3(field400[var4]);
                            if (var93.field2678 == -1) {
                                field400[var4++] = 0;
                            } else {
                                field400[var4++] = var93.field2679;
                            }
                            continue;
                        }
                        if (var437 == 2702) {
                            var4--;
                            int var94 = field400[var4];
                            class4 var95 = (class4) client.field632.method3302((long) var94);
                            if (var95 == null) {
                                field400[var4++] = 0;
                            } else {
                                field400[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var437 < 2900) {
                        var4--;
                        class158 var96 = class158.method3(field400[var4]);
                        if (var437 == 2800) {
                            field400[var4++] = class162.method2210(client.method1588(var96));
                            continue;
                        }
                        if (var437 == 2801) {
                            var4--;
                            int var97 = field400[var4];
                            int var439 = var97 - 1;
                            if (var96.field2635 != null && var439 < var96.field2635.length && var96.field2635[var439] != null) {
                                field391[var5++] = var96.field2635[var439];
                                continue;
                            }
                            field391[var5++] = "";
                            continue;
                        }
                        if (var437 == 2802) {
                            if (var96.field2638 == null) {
                                field391[var5++] = "";
                            } else {
                                field391[var5++] = var96.field2638;
                            }
                            continue;
                        }
                    } else if (var437 < 3200) {
                        if (var437 == 3100) {
                            var5--;
                            String var98 = field391[var5];
                            client.method2379(0, "", var98);
                            continue;
                        }
                        if (var437 == 3101) {
                            var4 -= 2;
                            client.method242(Statics.field71, field400[var4], field400[var4 + 1]);
                            continue;
                        }
                        if (var437 == 3103) {
                            client.method1474();
                            continue;
                        }
                        if (var437 == 3104) {
                            var5--;
                            String var99 = field391[var5];
                            int var100 = 0;
                            boolean var101 = class147.method64(var99, 10, true);
                            if (var101) {
                                int var102 = class147.method532(var99, 10, true);
                                var100 = var102;
                            }
                            client.field692.method2319(21);
                            client.field692.method2430(var100);
                            continue;
                        }
                        if (var437 == 3105) {
                            var5--;
                            String var103 = field391[var5];
                            client.field692.method2319(33);
                            client.field692.method2482(var103.length() + 1);
                            client.field692.method2432(var103);
                            continue;
                        }
                        if (var437 == 3106) {
                            var5--;
                            String var104 = field391[var5];
                            client.field692.method2319(8);
                            client.field692.method2482(var104.length() + 1);
                            client.field692.method2432(var104);
                            continue;
                        }
                        if (var437 == 3107) {
                            var4--;
                            int var105 = field400[var4];
                            var5--;
                            String var106 = field391[var5];
                            Statics.method150(var105, var106);
                            continue;
                        }
                        if (var437 == 3108) {
                            var4 -= 3;
                            int var107 = field400[var4];
                            int var108 = field400[var4 + 1];
                            int var109 = field400[var4 + 2];
                            class158 var110 = class158.method3(var109);
                            client.method7(var110, var107, var108);
                            continue;
                        }
                        if (var437 == 3109) {
                            var4 -= 2;
                            int var111 = field400[var4];
                            int var112 = field400[var4 + 1];
                            class158 var113 = var51 ? Statics.field404 : Statics.field1224;
                            client.method7(var113, var111, var112);
                            continue;
                        }
                    } else if (var437 < 3300) {
                        if (var437 == 3200) {
                            var4 -= 3;
                            int var114 = field400[var4];
                            int var115 = field400[var4 + 1];
                            int var116 = field400[var4 + 2];
                            if (client.field709 != 0 && var115 != 0 && client.field680 < 50) {
                                client.field561[client.field680] = var114;
                                client.field713[client.field680] = var115;
                                client.field660[client.field680] = var116;
                                client.field676[client.field680] = null;
                                client.field715[client.field680] = 0;
                                client.field680++;
                            }
                            continue;
                        }
                        if (var437 == 3201) {
                            var4--;
                            Statics.method134(field400[var4]);
                            continue;
                        }
                        if (var437 == 3202) {
                            var4 -= 2;
                            client.method28(field400[var4], field400[var4 + 1]);
                            continue;
                        }
                    } else if (var437 < 3400) {
                        if (var437 == 3300) {
                            field400[var4++] = client.field482;
                            continue;
                        }
                        if (var437 == 3301) {
                            var4 -= 2;
                            int var117 = field400[var4];
                            int var118 = field400[var4 + 1];
                            int[] var119 = field400;
                            int var120 = var4++;
                            class19 var121 = (class19) class19.field276.method3302((long) var117);
                            int var122;
                            if (var121 == null) {
                                var122 = -1;
                            } else if (var118 >= 0 && var118 < var121.field273.length) {
                                var122 = var121.field273[var118];
                            } else {
                                var122 = -1;
                            }
                            var119[var120] = var122;
                            continue;
                        }
                        if (var437 == 3302) {
                            var4 -= 2;
                            int var123 = field400[var4];
                            int var124 = field400[var4 + 1];
                            int[] var125 = field400;
                            int var126 = var4++;
                            class19 var127 = (class19) class19.field276.method3302((long) var123);
                            int var128;
                            if (var127 == null) {
                                var128 = 0;
                            } else if (var124 >= 0 && var124 < var127.field274.length) {
                                var128 = var127.field274[var124];
                            } else {
                                var128 = 0;
                            }
                            var125[var126] = var128;
                            continue;
                        }
                        if (var437 == 3303) {
                            var4 -= 2;
                            int var129 = field400[var4];
                            int var130 = field400[var4 + 1];
                            int[] var131 = field400;
                            int var132 = var4++;
                            class19 var133 = (class19) class19.field276.method3302((long) var129);
                            int var134;
                            if (var133 == null) {
                                var134 = 0;
                            } else if (var130 == -1) {
                                var134 = 0;
                            } else {
                                int var135 = 0;
                                for (int var136 = 0; var136 < var133.field274.length; var136++) {
                                    if (var133.field273[var136] == var130) {
                                        var135 += var133.field274[var136];
                                    }
                                }
                                var134 = var135;
                            }
                            var131[var132] = var134;
                            continue;
                        }
                        if (var437 == 3304) {
                            var4--;
                            int var137 = field400[var4];
                            int[] var138 = field400;
                            int var139 = var4++;
                            class41 var140 = (class41) class41.field1025.method3264((long) var137);
                            class41 var141;
                            if (var140 == null) {
                                byte[] var142 = Statics.field1030.method3016(5, var137);
                                class41 var143 = new class41();
                                if (var142 != null) {
                                    var143.method861(new class127(var142));
                                }
                                class41.field1025.method3257(var143, (long) var137);
                                var141 = var143;
                            } else {
                                var141 = var140;
                            }
                            var138[var139] = var141.field1026;
                            continue;
                        }
                        if (var437 == 3305) {
                            var4--;
                            int var144 = field400[var4];
                            field400[var4++] = client.field609[var144];
                            continue;
                        }
                        if (var437 == 3306) {
                            var4--;
                            int var145 = field400[var4];
                            field400[var4++] = client.field610[var145];
                            continue;
                        }
                        if (var437 == 3307) {
                            var4--;
                            int var146 = field400[var4];
                            field400[var4++] = client.field572[var146];
                            continue;
                        }
                        if (var437 == 3308) {
                            int var147 = Statics.field2386;
                            int var148 = (Statics.field71.field410 >> 7) + Statics.field54;
                            int var149 = (Statics.field71.field407 >> 7) + Statics.field977;
                            field400[var4++] = (var147 << 28) + (var148 << 14) + var149;
                            continue;
                        }
                        if (var437 == 3309) {
                            var4--;
                            int var150 = field400[var4];
                            field400[var4++] = var150 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var437 == 3310) {
                            var4--;
                            int var151 = field400[var4];
                            field400[var4++] = var151 >> 28;
                            continue;
                        }
                        if (var437 == 3311) {
                            var4--;
                            int var152 = field400[var4];
                            field400[var4++] = var152 & 0x3FFF;
                            continue;
                        }
                        if (var437 == 3312) {
                            field400[var4++] = client.field476 ? 1 : 0;
                            continue;
                        }
                        if (var437 == 3313) {
                            var4 -= 2;
                            int var153 = field400[var4] + 32768;
                            int var154 = field400[var4 + 1];
                            int[] var155 = field400;
                            int var156 = var4++;
                            class19 var157 = (class19) class19.field276.method3302((long) var153);
                            int var158;
                            if (var157 == null) {
                                var158 = -1;
                            } else if (var154 >= 0 && var154 < var157.field273.length) {
                                var158 = var157.field273[var154];
                            } else {
                                var158 = -1;
                            }
                            var155[var156] = var158;
                            continue;
                        }
                        if (var437 == 3314) {
                            var4 -= 2;
                            int var159 = field400[var4] + 32768;
                            int var160 = field400[var4 + 1];
                            int[] var161 = field400;
                            int var162 = var4++;
                            class19 var163 = (class19) class19.field276.method3302((long) var159);
                            int var164;
                            if (var163 == null) {
                                var164 = 0;
                            } else if (var160 >= 0 && var160 < var163.field274.length) {
                                var164 = var163.field274[var160];
                            } else {
                                var164 = 0;
                            }
                            var161[var162] = var164;
                            continue;
                        }
                        if (var437 == 3315) {
                            var4 -= 2;
                            int var165 = field400[var4] + 32768;
                            int var166 = field400[var4 + 1];
                            int[] var167 = field400;
                            int var168 = var4++;
                            class19 var169 = (class19) class19.field276.method3302((long) var165);
                            int var170;
                            if (var169 == null) {
                                var170 = 0;
                            } else if (var166 == -1) {
                                var170 = 0;
                            } else {
                                int var171 = 0;
                                for (int var172 = 0; var172 < var169.field274.length; var172++) {
                                    if (var169.field273[var172] == var166) {
                                        var171 += var169.field274[var172];
                                    }
                                }
                                var170 = var171;
                            }
                            var167[var168] = var170;
                            continue;
                        }
                        if (var437 == 3316) {
                            if (client.field638 >= 2) {
                                field400[var4++] = client.field638;
                            } else {
                                field400[var4++] = 0;
                            }
                            continue;
                        }
                        if (var437 == 3317) {
                            field400[var4++] = client.field653;
                            continue;
                        }
                        if (var437 == 3318) {
                            field400[var4++] = client.field473;
                            continue;
                        }
                        if (var437 == 3321) {
                            field400[var4++] = client.field617;
                            continue;
                        }
                        if (var437 == 3322) {
                            field400[var4++] = client.field637;
                            continue;
                        }
                        if (var437 == 3323) {
                            if (client.field639) {
                                field400[var4++] = 1;
                            } else {
                                field400[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var437 < 3500) {
                        if (var437 == 3400) {
                            var4 -= 2;
                            int var173 = field400[var4];
                            int var174 = field400[var4 + 1];
                            class39 var175 = (class39) class39.field964.method3264((long) var173);
                            class39 var176;
                            if (var175 == null) {
                                byte[] var177 = Statics.field968.method3016(8, var173);
                                class39 var178 = new class39();
                                if (var177 != null) {
                                    var178.method809(new class127(var177));
                                }
                                class39.field964.method3257(var178, (long) var173);
                                var176 = var178;
                            } else {
                                var176 = var175;
                            }
                            class39 var179 = var176;
                            if (var176.field972 != 's') {
                            }
                            for (int var180 = 0; var180 < var179.field969; var180++) {
                                if (var179.field970[var180] == var174) {
                                    field391[var5++] = var179.field973[var180];
                                    var179 = null;
                                    break;
                                }
                            }
                            if (var179 != null) {
                                field391[var5++] = var179.field966;
                            }
                            continue;
                        }
                        if (var437 == 3408) {
                            var4 -= 4;
                            int var181 = field400[var4];
                            int var182 = field400[var4 + 1];
                            int var183 = field400[var4 + 2];
                            int var184 = field400[var4 + 3];
                            class39 var185 = (class39) class39.field964.method3264((long) var183);
                            class39 var186;
                            if (var185 == null) {
                                byte[] var187 = Statics.field968.method3016(8, var183);
                                class39 var188 = new class39();
                                if (var187 != null) {
                                    var188.method809(new class127(var187));
                                }
                                class39.field964.method3257(var188, (long) var183);
                                var186 = var188;
                            } else {
                                var186 = var185;
                            }
                            class39 var189 = var186;
                            if (var186.field965 == var181 && var186.field972 == var182) {
                                for (int var190 = 0; var190 < var189.field969; var190++) {
                                    if (var189.field970[var190] == var184) {
                                        if (var182 == 115) {
                                            field391[var5++] = var189.field973[var190];
                                        } else {
                                            field400[var4++] = var189.field971[var190];
                                        }
                                        var189 = null;
                                        break;
                                    }
                                }
                                if (var189 != null) {
                                    if (var182 == 115) {
                                        field391[var5++] = var189.field966;
                                    } else {
                                        field400[var4++] = var189.field963;
                                    }
                                }
                                continue;
                            }
                            if (var182 == 115) {
                                field391[var5++] = "null";
                            } else {
                                field400[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var437 < 3700) {
                        if (var437 == 3600) {
                            if (client.field595 == 0) {
                                field400[var4++] = -2;
                            } else if (client.field595 == 1) {
                                field400[var4++] = -1;
                            } else {
                                field400[var4++] = client.field723;
                            }
                            continue;
                        }
                        if (var437 == 3601) {
                            var4--;
                            int var191 = field400[var4];
                            if (client.field595 == 2 && var191 < client.field723) {
                                field391[var5++] = client.field725[var191].field357;
                                continue;
                            }
                            field391[var5++] = "";
                            continue;
                        }
                        if (var437 == 3602) {
                            var4--;
                            int var192 = field400[var4];
                            if (client.field595 == 2 && var192 < client.field723) {
                                field400[var4++] = client.field725[var192].field354;
                                continue;
                            }
                            field400[var4++] = 0;
                            continue;
                        }
                        if (var437 == 3603) {
                            var4--;
                            int var193 = field400[var4];
                            if (client.field595 == 2 && var193 < client.field723) {
                                field400[var4++] = client.field725[var193].field358;
                                continue;
                            }
                            field400[var4++] = 0;
                            continue;
                        }
                        if (var437 == 3604) {
                            var5--;
                            String var194 = field391[var5];
                            var4--;
                            int var195 = field400[var4];
                            client.method47(var194, var195);
                            continue;
                        }
                        if (var437 == 3605) {
                            var5--;
                            String var196 = field391[var5];
                            if (var196 == null) {
                                continue;
                            }
                            if ((client.field723 < 200 || client.field598 == 1) && client.field723 < 200) {
                                String var197 = class148.method747(var196, Statics.field204);
                                if (var197 == null) {
                                    continue;
                                }
                                for (int var198 = 0; var198 < client.field723; var198++) {
                                    class23 var199 = client.field725[var198];
                                    String var200 = class148.method747(var199.field357, Statics.field204);
                                    if (var200 != null && var200.equals(var197)) {
                                        client.method2379(0, "", var196 + class134.field2229);
                                        continue label2569;
                                    }
                                    if (var199.field355 != null) {
                                        String var201 = class148.method747(var199.field355, Statics.field204);
                                        if (var201 != null && var201.equals(var197)) {
                                            client.method2379(0, "", var196 + class134.field2229);
                                            continue label2569;
                                        }
                                    }
                                }
                                for (int var202 = 0; var202 < client.field727; var202++) {
                                    class11 var203 = client.field728[var202];
                                    String var204 = class148.method747(var203.field174, Statics.field204);
                                    if (var204 != null && var204.equals(var197)) {
                                        client.method2379(0, "", class134.field2234 + var196 + class134.field2235);
                                        continue label2569;
                                    }
                                    if (var203.field177 != null) {
                                        String var205 = class148.method747(var203.field177, Statics.field204);
                                        if (var205 != null && var205.equals(var197)) {
                                            client.method2379(0, "", class134.field2234 + var196 + class134.field2235);
                                            continue label2569;
                                        }
                                    }
                                }
                                if (class148.method747(Statics.field71.field39, Statics.field204).equals(var197)) {
                                    client.method2379(0, "", class134.field2232);
                                } else {
                                    client.field692.method2319(75);
                                    class116 var206 = client.field692;
                                    int var207 = var196.length() + 1;
                                    var206.method2482(var207);
                                    client.field692.method2432(var196);
                                }
                                continue;
                            }
                            client.method2379(0, "", class134.field2228);
                            continue;
                        }
                        if (var437 == 3606) {
                            var5--;
                            String var208 = field391[var5];
                            if (var208 == null) {
                                continue;
                            }
                            String var209 = class148.method747(var208, Statics.field204);
                            if (var209 == null) {
                                continue;
                            }
                            int var210 = 0;
                            while (true) {
                                if (var210 >= client.field723) {
                                    continue label2569;
                                }
                                class23 var211 = client.field725[var210];
                                String var212 = var211.field357;
                                String var213 = class148.method747(var212, Statics.field204);
                                boolean var214;
                                if (var208 == null || var212 == null) {
                                    var214 = false;
                                } else if (var208.startsWith("#") || var212.startsWith("#")) {
                                    var214 = var208.equals(var212);
                                } else {
                                    var214 = var209.equals(var213);
                                }
                                if (var214) {
                                    client.field723--;
                                    for (int var215 = var210; var215 < client.field723; var215++) {
                                        client.field725[var215] = client.field725[var215 + 1];
                                    }
                                    client.field667 = client.field654;
                                    client.field692.method2319(228);
                                    class116 var216 = client.field692;
                                    int var217 = var208.length() + 1;
                                    var216.method2482(var217);
                                    client.field692.method2432(var208);
                                    continue label2569;
                                }
                                var210++;
                            }
                        }
                        if (var437 == 3607) {
                            var5--;
                            String var218 = field391[var5];
                            client.method859(var218, false);
                            continue;
                        }
                        if (var437 == 3608) {
                            var5--;
                            String var219 = field391[var5];
                            if (var219 == null) {
                                continue;
                            }
                            String var220 = class148.method747(var219, Statics.field204);
                            if (var220 == null) {
                                continue;
                            }
                            int var221 = 0;
                            while (true) {
                                if (var221 >= client.field727) {
                                    continue label2569;
                                }
                                class11 var222 = client.field728[var221];
                                String var223 = var222.field174;
                                String var224 = class148.method747(var223, Statics.field204);
                                boolean var225;
                                if (var219 == null || var223 == null) {
                                    var225 = false;
                                } else if (var219.startsWith("#") || var223.startsWith("#")) {
                                    var225 = var219.equals(var223);
                                } else {
                                    var225 = var220.equals(var224);
                                }
                                if (var225) {
                                    client.field727--;
                                    for (int var226 = var221; var226 < client.field727; var226++) {
                                        client.field728[var226] = client.field728[var226 + 1];
                                    }
                                    client.field667 = client.field654;
                                    client.field692.method2319(91);
                                    class116 var227 = client.field692;
                                    int var228 = var219.length() + 1;
                                    var227.method2482(var228);
                                    client.field692.method2432(var219);
                                    continue label2569;
                                }
                                var221++;
                            }
                        }
                        if (var437 == 3609) {
                            var5--;
                            String var229 = field391[var5];
                            if (var229.startsWith(class2.method429(0)) || var229.startsWith(class2.method429(1))) {
                                var229 = var229.substring(7);
                            }
                            field400[var4++] = Statics.method237(var229) ? 1 : 0;
                            continue;
                        }
                        if (var437 == 3611) {
                            if (client.field696 == null) {
                                field391[var5++] = "";
                            } else {
                                field391[var5++] = class146.method265(client.field696);
                            }
                            continue;
                        }
                        if (var437 == 3612) {
                            if (client.field696 == null) {
                                field400[var4++] = 0;
                            } else {
                                field400[var4++] = Statics.field86;
                            }
                            continue;
                        }
                        if (var437 == 3613) {
                            var4--;
                            int var230 = field400[var4];
                            if (client.field696 != null && var230 < Statics.field86) {
                                field391[var5++] = Statics.field1362[var230].field105;
                                continue;
                            }
                            field391[var5++] = "";
                            continue;
                        }
                        if (var437 == 3614) {
                            var4--;
                            int var231 = field400[var4];
                            if (client.field696 != null && var231 < Statics.field86) {
                                field400[var4++] = Statics.field1362[var231].field106;
                                continue;
                            }
                            field400[var4++] = 0;
                            continue;
                        }
                        if (var437 == 3615) {
                            var4--;
                            int var232 = field400[var4];
                            if (client.field696 != null && var232 < Statics.field86) {
                                field400[var4++] = Statics.field1362[var232].field107;
                                continue;
                            }
                            field400[var4++] = 0;
                            continue;
                        }
                        if (var437 == 3616) {
                            field400[var4++] = Statics.field168;
                            continue;
                        }
                        if (var437 == 3617) {
                            var5--;
                            String var233 = field391[var5];
                            client.method10(var233);
                            continue;
                        }
                        if (var437 == 3618) {
                            field400[var4++] = Statics.field169;
                            continue;
                        }
                        if (var437 == 3619) {
                            var5--;
                            String var234 = field391[var5];
                            if (!var234.equals("")) {
                                client.field692.method2319(35);
                                class116 var235 = client.field692;
                                int var236 = var234.length() + 1;
                                var235.method2482(var236);
                                client.field692.method2432(var234);
                            }
                            continue;
                        }
                        if (var437 == 3620) {
                            client.method2823();
                            continue;
                        }
                        if (var437 == 3621) {
                            if (client.field595 == 0) {
                                field400[var4++] = -1;
                            } else {
                                field400[var4++] = client.field727;
                            }
                            continue;
                        }
                        if (var437 == 3622) {
                            var4--;
                            int var237 = field400[var4];
                            if (client.field595 != 0 && var237 < client.field727) {
                                field391[var5++] = client.field728[var237].field174;
                                continue;
                            }
                            field391[var5++] = "";
                            continue;
                        }
                        if (var437 == 3623) {
                            var5--;
                            String var238 = field391[var5];
                            if (var238.startsWith(class2.method429(0)) || var238.startsWith(class2.method429(1))) {
                                var238 = var238.substring(7);
                            }
                            field400[var4++] = client.method1403(var238) ? 1 : 0;
                            continue;
                        }
                        if (var437 == 3624) {
                            var4--;
                            int var239 = field400[var4];
                            if (Statics.field1362 != null && var239 < Statics.field86 && Statics.field1362[var239].field105.equalsIgnoreCase(Statics.field71.field39)) {
                                field400[var4++] = 1;
                                continue;
                            }
                            field400[var4++] = 0;
                            continue;
                        }
                        if (var437 == 3625) {
                            if (client.field697 == null) {
                                field391[var5++] = "";
                                continue;
                            }
                            String[] var240 = field391;
                            int var241 = var5++;
                            String var242 = client.field697;
                            long var243 = 0L;
                            int var245 = var242.length();
                            for (int var246 = 0; var246 < var245; var246++) {
                                var243 *= 37L;
                                char var247 = var242.charAt(var246);
                                if (var247 >= 'A' && var247 <= 'Z') {
                                    var243 += (long) (var247 + 1 - 65);
                                } else if (var247 >= 'a' && var247 <= 'z') {
                                    var243 += (long) (var247 + 1 - 97);
                                } else if (var247 >= '0' && var247 <= '9') {
                                    var243 += (long) (var247 + 27 - 48);
                                }
                                if (var243 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var243 % 37L == 0L && var243 != 0L) {
                                var243 /= 37L;
                            }
                            String var250 = class146.method632(var243);
                            if (var250 == null) {
                                var250 = "";
                            }
                            var240[var241] = var250;
                            continue;
                        }
                    } else if (var437 < 4100) {
                        if (var437 == 4000) {
                            var4 -= 2;
                            int var252 = field400[var4];
                            int var253 = field400[var4 + 1];
                            field400[var4++] = var252 + var253;
                            continue;
                        }
                        if (var437 == 4001) {
                            var4 -= 2;
                            int var254 = field400[var4];
                            int var255 = field400[var4 + 1];
                            field400[var4++] = var254 - var255;
                            continue;
                        }
                        if (var437 == 4002) {
                            var4 -= 2;
                            int var256 = field400[var4];
                            int var257 = field400[var4 + 1];
                            field400[var4++] = var256 * var257;
                            continue;
                        }
                        if (var437 == 4003) {
                            var4 -= 2;
                            int var258 = field400[var4];
                            int var259 = field400[var4 + 1];
                            field400[var4++] = var258 / var259;
                            continue;
                        }
                        if (var437 == 4004) {
                            var4--;
                            int var260 = field400[var4];
                            field400[var4++] = (int) (Math.random() * (double) var260);
                            continue;
                        }
                        if (var437 == 4005) {
                            var4--;
                            int var261 = field400[var4];
                            field400[var4++] = (int) (Math.random() * (double) (var261 + 1));
                            continue;
                        }
                        if (var437 == 4006) {
                            var4 -= 5;
                            int var262 = field400[var4];
                            int var263 = field400[var4 + 1];
                            int var264 = field400[var4 + 2];
                            int var265 = field400[var4 + 3];
                            int var266 = field400[var4 + 4];
                            field400[var4++] = (var263 - var262) * (var266 - var264) / (var265 - var264) + var262;
                            continue;
                        }
                        if (var437 == 4007) {
                            var4 -= 2;
                            int var267 = field400[var4];
                            int var268 = field400[var4 + 1];
                            field400[var4++] = var267 * var268 / 100 + var267;
                            continue;
                        }
                        if (var437 == 4008) {
                            var4 -= 2;
                            int var269 = field400[var4];
                            int var270 = field400[var4 + 1];
                            field400[var4++] = var269 | 0x1 << var270;
                            continue;
                        }
                        if (var437 == 4009) {
                            var4 -= 2;
                            int var271 = field400[var4];
                            int var272 = field400[var4 + 1];
                            field400[var4++] = var271 & -1 - (0x1 << var272);
                            continue;
                        }
                        if (var437 == 4010) {
                            var4 -= 2;
                            int var273 = field400[var4];
                            int var274 = field400[var4 + 1];
                            field400[var4++] = (var273 & 0x1 << var274) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var437 == 4011) {
                            var4 -= 2;
                            int var275 = field400[var4];
                            int var276 = field400[var4 + 1];
                            field400[var4++] = var275 % var276;
                            continue;
                        }
                        if (var437 == 4012) {
                            var4 -= 2;
                            int var277 = field400[var4];
                            int var278 = field400[var4 + 1];
                            if (var277 == 0) {
                                field400[var4++] = 0;
                            } else {
                                field400[var4++] = (int) Math.pow((double) var277, (double) var278);
                            }
                            continue;
                        }
                        if (var437 == 4013) {
                            var4 -= 2;
                            int var279 = field400[var4];
                            int var280 = field400[var4 + 1];
                            if (var279 == 0) {
                                field400[var4++] = 0;
                            } else if (var280 == 0) {
                                field400[var4++] = Integer.MAX_VALUE;
                            } else {
                                field400[var4++] = (int) Math.pow((double) var279, 1.0D / (double) var280);
                            }
                            continue;
                        }
                        if (var437 == 4014) {
                            var4 -= 2;
                            int var281 = field400[var4];
                            int var282 = field400[var4 + 1];
                            field400[var4++] = var281 & var282;
                            continue;
                        }
                        if (var437 == 4015) {
                            var4 -= 2;
                            int var283 = field400[var4];
                            int var284 = field400[var4 + 1];
                            field400[var4++] = var283 | var284;
                            continue;
                        }
                    } else if (var437 < 4200) {
                        if (var437 == 4100) {
                            var5--;
                            String var285 = field391[var5];
                            var4--;
                            int var286 = field400[var4];
                            field391[var5++] = var285 + var286;
                            continue;
                        }
                        if (var437 == 4101) {
                            var5 -= 2;
                            String var287 = field391[var5];
                            String var288 = field391[var5 + 1];
                            field391[var5++] = var287 + var288;
                            continue;
                        }
                        if (var437 == 4102) {
                            var5--;
                            String var289 = field391[var5];
                            var4--;
                            int var290 = field400[var4];
                            String[] var291 = field391;
                            int var292 = var5++;
                            String var294;
                            if (var290 < 0) {
                                var294 = Integer.toString(var290);
                            } else {
                                int var295 = var290;
                                String var296;
                                if (var290 < 0) {
                                    var296 = Integer.toString(var290, 10);
                                } else {
                                    int var297 = 2;
                                    int var298 = var290 / 10;
                                    while (var298 != 0) {
                                        var298 /= 10;
                                        var297++;
                                    }
                                    char[] var299 = new char[var297];
                                    var299[0] = '+';
                                    for (int var300 = var297 - 1; var300 > 0; var300--) {
                                        int var301 = var295;
                                        var295 /= 10;
                                        int var302 = var301 - var295 * 10;
                                        if (var302 >= 10) {
                                            var299[var300] = (char) (var302 + 87);
                                        } else {
                                            var299[var300] = (char) (var302 + 48);
                                        }
                                    }
                                    var296 = new String(var299);
                                }
                                var294 = var296;
                            }
                            var291[var292] = var289 + var294;
                            continue;
                        }
                        if (var437 == 4103) {
                            var5--;
                            String var303 = field391[var5];
                            field391[var5++] = var303.toLowerCase();
                            continue;
                        }
                        if (var437 == 4104) {
                            var4--;
                            int var304 = field400[var4];
                            long var305 = ((long) var304 + 11745L) * 86400000L;
                            field395.setTime(new Date(var305));
                            int var307 = field395.get(5);
                            int var308 = field395.get(2);
                            int var309 = field395.get(1);
                            field391[var5++] = var307 + "-" + field390[var308] + "-" + var309;
                            continue;
                        }
                        if (var437 == 4105) {
                            var5 -= 2;
                            String var310 = field391[var5];
                            String var311 = field391[var5 + 1];
                            if (Statics.field71.field30 != null && Statics.field71.field30.field2716) {
                                field391[var5++] = var311;
                                continue;
                            }
                            field391[var5++] = var310;
                            continue;
                        }
                        if (var437 == 4106) {
                            var4--;
                            int var312 = field400[var4];
                            field391[var5++] = Integer.toString(var312);
                            continue;
                        }
                        if (var437 == 4107) {
                            var5 -= 2;
                            int[] var313 = field400;
                            int var314 = var4++;
                            String var315 = field391[var5];
                            String var316 = field391[var5 + 1];
                            int var317 = client.field601;
                            int var318 = var315.length();
                            int var319 = var316.length();
                            int var320 = 0;
                            int var321 = 0;
                            byte var322 = 0;
                            byte var323 = 0;
                            int var324;
                            label2385: while (true) {
                                if (var320 - var322 >= var318 && var321 - var323 >= var319) {
                                    int var335 = Math.min(var318, var319);
                                    for (int var336 = 0; var336 < var335; var336++) {
                                        char var339 = var315.charAt(var336);
                                        char var340 = var316.charAt(var336);
                                        if (var339 != var340 && Character.toUpperCase(var339) != Character.toUpperCase(var340)) {
                                            char var341 = Character.toLowerCase(var339);
                                            char var342 = Character.toLowerCase(var340);
                                            if (var341 != var342) {
                                                var324 = class150.method2673(var341, var317) - class150.method2673(var342, var317);
                                                break label2385;
                                            }
                                        }
                                    }
                                    int var343 = var318 - var319;
                                    if (var343 == 0) {
                                        for (int var344 = 0; var344 < var335; var344++) {
                                            char var345 = var315.charAt(var344);
                                            char var346 = var316.charAt(var344);
                                            if (var345 != var346) {
                                                var324 = class150.method2673(var345, var317) - class150.method2673(var346, var317);
                                                break label2385;
                                            }
                                        }
                                        var324 = 0;
                                    } else {
                                        var324 = var343;
                                    }
                                    break;
                                }
                                if (var320 - var322 >= var318) {
                                    var324 = -1;
                                    break;
                                }
                                if (var321 - var323 >= var319) {
                                    var324 = 1;
                                    break;
                                }
                                char var325;
                                if (var322 == 0) {
                                    var325 = var315.charAt(var320++);
                                } else {
                                    var325 = (char) var322;
                                    boolean var326 = false;
                                }
                                char var327;
                                if (var323 == 0) {
                                    var327 = var316.charAt(var321++);
                                } else {
                                    var327 = (char) var323;
                                    boolean var328 = false;
                                }
                                byte var329;
                                if (var325 == 198) {
                                    var329 = 69;
                                } else if (var325 == 230) {
                                    var329 = 101;
                                } else if (var325 == 223) {
                                    var329 = 115;
                                } else if (var325 == 338) {
                                    var329 = 69;
                                } else if (var325 == 339) {
                                    var329 = 101;
                                } else {
                                    var329 = 0;
                                }
                                var322 = var329;
                                byte var330;
                                if (var327 == 198) {
                                    var330 = 69;
                                } else if (var327 == 230) {
                                    var330 = 101;
                                } else if (var327 == 223) {
                                    var330 = 115;
                                } else if (var327 == 338) {
                                    var330 = 69;
                                } else if (var327 == 339) {
                                    var330 = 101;
                                } else {
                                    var330 = 0;
                                }
                                var323 = var330;
                                char var331 = class150.method170(var325, var317);
                                char var332 = class150.method170(var327, var317);
                                if (var331 != var332 && Character.toUpperCase(var331) != Character.toUpperCase(var332)) {
                                    char var333 = Character.toLowerCase(var331);
                                    char var334 = Character.toLowerCase(var332);
                                    if (var333 != var334) {
                                        var324 = class150.method2673(var333, var317) - class150.method2673(var334, var317);
                                        break;
                                    }
                                }
                            }
                            byte var348;
                            if (var324 > 0) {
                                var348 = 1;
                            } else if (var324 < 0) {
                                var348 = -1;
                            } else {
                                var348 = 0;
                            }
                            var313[var314] = var348;
                            continue;
                        }
                        if (var437 == 4108) {
                            var5--;
                            String var349 = field391[var5];
                            var4 -= 2;
                            int var350 = field400[var4];
                            int var351 = field400[var4 + 1];
                            byte[] var352 = Statics.field1963.method3016(var351, 0);
                            class183 var353 = new class183(var352);
                            field400[var4++] = var353.method3453(var349, var350);
                            continue;
                        }
                        if (var437 == 4109) {
                            var5--;
                            String var354 = field391[var5];
                            var4 -= 2;
                            int var355 = field400[var4];
                            int var356 = field400[var4 + 1];
                            byte[] var357 = Statics.field1963.method3016(var356, 0);
                            class183 var358 = new class183(var357);
                            field400[var4++] = var358.method3396(var354, var355);
                            continue;
                        }
                        if (var437 == 4110) {
                            var5 -= 2;
                            String var359 = field391[var5];
                            String var360 = field391[var5 + 1];
                            var4--;
                            if (field400[var4] == 1) {
                                field391[var5++] = var359;
                            } else {
                                field391[var5++] = var360;
                            }
                            continue;
                        }
                        if (var437 == 4111) {
                            var5--;
                            String var361 = field391[var5];
                            field391[var5++] = class185.method3398(var361);
                            continue;
                        }
                        if (var437 == 4112) {
                            var5--;
                            String var362 = field391[var5];
                            var4--;
                            int var363 = field400[var4];
                            field391[var5++] = var362 + (char) var363;
                            continue;
                        }
                        if (var437 == 4113) {
                            var4--;
                            int var364 = field400[var4];
                            field400[var4++] = class147.method2676((char) var364) ? 1 : 0;
                            continue;
                        }
                        if (var437 == 4114) {
                            var4--;
                            int var365 = field400[var4];
                            field400[var4++] = class147.method251((char) var365) ? 1 : 0;
                            continue;
                        }
                        if (var437 == 4115) {
                            var4--;
                            int var366 = field400[var4];
                            int[] var367 = field400;
                            int var368 = var4++;
                            char var369 = (char) var366;
                            boolean var370 = var369 >= 'A' && var369 <= 'Z' || var369 >= 'a' && var369 <= 'z';
                            var367[var368] = var370 ? 1 : 0;
                            continue;
                        }
                        if (var437 == 4116) {
                            var4--;
                            int var371 = field400[var4];
                            int[] var372 = field400;
                            int var373 = var4++;
                            char var374 = (char) var371;
                            boolean var375 = var374 >= '0' && var374 <= '9';
                            var372[var373] = var375 ? 1 : 0;
                            continue;
                        }
                        if (var437 == 4117) {
                            var5--;
                            String var376 = field391[var5];
                            if (var376 == null) {
                                field400[var4++] = 0;
                            } else {
                                field400[var4++] = var376.length();
                            }
                            continue;
                        }
                        if (var437 == 4118) {
                            var5--;
                            String var377 = field391[var5];
                            var4 -= 2;
                            int var378 = field400[var4];
                            int var379 = field400[var4 + 1];
                            field391[var5++] = var377.substring(var378, var379);
                            continue;
                        }
                        if (var437 == 4119) {
                            var5--;
                            String var380 = field391[var5];
                            StringBuilder var381 = new StringBuilder(var380.length());
                            boolean var382 = false;
                            for (int var383 = 0; var383 < var380.length(); var383++) {
                                char var384 = var380.charAt(var383);
                                if (var384 == '<') {
                                    var382 = true;
                                } else if (var384 == '>') {
                                    var382 = false;
                                } else if (!var382) {
                                    var381.append(var384);
                                }
                            }
                            field391[var5++] = var381.toString();
                            continue;
                        }
                        if (var437 == 4120) {
                            var5--;
                            String var385 = field391[var5];
                            var4--;
                            int var386 = field400[var4];
                            field400[var4++] = var385.indexOf(var386);
                            continue;
                        }
                    } else if (var437 < 4300) {
                        if (var437 == 4200) {
                            var4--;
                            int var387 = field400[var4];
                            field391[var5++] = class40.method789(var387).field986;
                            continue;
                        }
                        if (var437 == 4201) {
                            var4 -= 2;
                            int var388 = field400[var4];
                            int var389 = field400[var4 + 1];
                            class40 var390 = class40.method789(var388);
                            if (var389 >= 1 && var389 <= 5 && var390.field1016[var389 - 1] != null) {
                                field391[var5++] = var390.field1016[var389 - 1];
                                continue;
                            }
                            field391[var5++] = "";
                            continue;
                        }
                        if (var437 == 4202) {
                            var4 -= 2;
                            int var391 = field400[var4];
                            int var392 = field400[var4 + 1];
                            class40 var393 = class40.method789(var391);
                            if (var392 >= 1 && var392 <= 5 && var393.field1014[var392 - 1] != null) {
                                field391[var5++] = var393.field1014[var392 - 1];
                                continue;
                            }
                            field391[var5++] = "";
                            continue;
                        }
                        if (var437 == 4203) {
                            var4--;
                            int var394 = field400[var4];
                            field400[var4++] = class40.method789(var394).field998;
                            continue;
                        }
                        if (var437 == 4204) {
                            var4--;
                            int var395 = field400[var4];
                            field400[var4++] = class40.method789(var395).field1000 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var437 == 4205) {
                            var4--;
                            int var396 = field400[var4];
                            class40 var397 = class40.method789(var396);
                            if (var397.field1017 == -1 && var397.field1010 >= 0) {
                                field400[var4++] = var397.field1010;
                                continue;
                            }
                            field400[var4++] = var396;
                            continue;
                        }
                        if (var437 == 4206) {
                            var4--;
                            int var398 = field400[var4];
                            class40 var399 = class40.method789(var398);
                            if (var399.field1017 >= 0 && var399.field1010 >= 0) {
                                field400[var4++] = var399.field1010;
                                continue;
                            }
                            field400[var4++] = var398;
                            continue;
                        }
                        if (var437 == 4207) {
                            var4--;
                            int var400 = field400[var4];
                            field400[var4++] = class40.method789(var400).field999 ? 1 : 0;
                            continue;
                        }
                    } else if (var437 < 5100) {
                        if (var437 == 5000) {
                            field400[var4++] = client.field528;
                            continue;
                        }
                        if (var437 == 5001) {
                            var4 -= 3;
                            client.field528 = field400[var4];
                            Statics.field932 = class137.method229(field400[var4 + 1]);
                            if (Statics.field932 == null) {
                                Statics.field932 = class137.field2317;
                            }
                            client.field689 = field400[var4 + 2];
                            client.field692.method2319(44);
                            client.field692.method2482(client.field528);
                            client.field692.method2482(Statics.field932.field2319);
                            client.field692.method2482(client.field689);
                            continue;
                        }
                        if (var437 == 5002) {
                            var5--;
                            String var401 = field391[var5];
                            var4 -= 2;
                            int var402 = field400[var4];
                            int var403 = field400[var4 + 1];
                            client.field692.method2319(110);
                            class116 var404 = client.field692;
                            int var405 = var401.length() + 1;
                            var404.method2482(var405 + 2);
                            client.field692.method2432(var401);
                            client.field692.method2482(var402 - 1);
                            client.field692.method2482(var403);
                            continue;
                        }
                        if (var437 == 5003) {
                            var4--;
                            int var406 = field400[var4];
                            String var407 = null;
                            if (var406 < 100) {
                                var407 = client.field685[var406];
                            }
                            if (var407 == null) {
                                var407 = "";
                            }
                            field391[var5++] = var407;
                            continue;
                        }
                        if (var437 == 5004) {
                            var4--;
                            int var408 = field400[var4];
                            int var409 = -1;
                            if (var408 < 100 && client.field685[var408] != null) {
                                var409 = client.field682[var408];
                            }
                            field400[var4++] = var409;
                            continue;
                        }
                        if (var437 == 5005) {
                            if (Statics.field932 == null) {
                                field400[var4++] = -1;
                            } else {
                                field400[var4++] = Statics.field932.field2319;
                            }
                            continue;
                        }
                        if (var437 == 5008) {
                            var5--;
                            String var410 = field391[var5];
                            if (var410.startsWith("::")) {
                                if (var410.equalsIgnoreCase("::toggleroof")) {
                                    Statics.field245.field179 = !Statics.field245.field179;
                                    class29 var411 = null;
                                    try {
                                        var411 = class82.method1186("", Statics.field475.field2067, true);
                                        class127 var412 = Statics.field245.method136();
                                        var411.method567(var412.field2025, 0, var412.field2022);
                                    } catch (Exception var435) {
                                    }
                                    try {
                                        if (var411 != null) {
                                            var411.method554();
                                        }
                                    } catch (Exception var434) {
                                    }
                                    if (Statics.field245.field179) {
                                        client.method2379(0, "", "Roofs are now all hidden");
                                    } else {
                                        client.method2379(0, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field638 >= 2) {
                                    if (var410.equalsIgnoreCase("::gc")) {
                                        System.gc();
                                    }
                                    if (var410.equalsIgnoreCase("::clientdrop")) {
                                        client.method1856();
                                    }
                                    if (var410.equalsIgnoreCase("::fpson")) {
                                        client.field488 = true;
                                    }
                                    if (var410.equalsIgnoreCase("::fpsoff")) {
                                        client.field488 = false;
                                    }
                                    if (var410.equalsIgnoreCase("::noclip")) {
                                        for (int var415 = 0; var415 < 4; var415++) {
                                            for (int var416 = 1; var416 < 103; var416++) {
                                                for (int var417 = 1; var417 < 103; var417++) {
                                                    client.field712[var415].field2737[var416][var417] = 0;
                                                }
                                            }
                                        }
                                    }
                                    if (var410.equalsIgnoreCase("::errortest") && client.field474 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field692.method2319(135);
                                client.field692.method2482(var410.length() - 1);
                                client.field692.method2432(var410.substring(2));
                                continue;
                            }
                            String var418 = var410.toLowerCase();
                            byte var419 = 0;
                            if (var418.startsWith(class134.field2238)) {
                                var419 = 0;
                                var410 = var410.substring(class134.field2238.length());
                            } else if (var418.startsWith(class134.field2240)) {
                                var419 = 1;
                                var410 = var410.substring(class134.field2240.length());
                            } else if (var418.startsWith(class134.field2242)) {
                                var419 = 2;
                                var410 = var410.substring(class134.field2242.length());
                            } else if (var418.startsWith(class134.field2244)) {
                                var419 = 3;
                                var410 = var410.substring(class134.field2244.length());
                            } else if (var418.startsWith(class134.field2087)) {
                                var419 = 4;
                                var410 = var410.substring(class134.field2087.length());
                            } else if (var418.startsWith(class134.field2150)) {
                                var419 = 5;
                                var410 = var410.substring(class134.field2150.length());
                            } else if (var418.startsWith(class134.field2096)) {
                                var419 = 6;
                                var410 = var410.substring(class134.field2096.length());
                            } else if (var418.startsWith(class134.field2252)) {
                                var419 = 7;
                                var410 = var410.substring(class134.field2252.length());
                            } else if (var418.startsWith(class134.field2254)) {
                                var419 = 8;
                                var410 = var410.substring(class134.field2254.length());
                            } else if (var418.startsWith(class134.field2250)) {
                                var419 = 9;
                                var410 = var410.substring(class134.field2250.length());
                            } else if (var418.startsWith(class134.field2099)) {
                                var419 = 10;
                                var410 = var410.substring(class134.field2099.length());
                            } else if (var418.startsWith(class134.field2260)) {
                                var419 = 11;
                                var410 = var410.substring(class134.field2260.length());
                            } else if (client.field601 != 0) {
                                if (var418.startsWith(class134.field2239)) {
                                    var419 = 0;
                                    var410 = var410.substring(class134.field2239.length());
                                } else if (var418.startsWith(class134.field2241)) {
                                    var419 = 1;
                                    var410 = var410.substring(class134.field2241.length());
                                } else if (var418.startsWith(class134.field2243)) {
                                    var419 = 2;
                                    var410 = var410.substring(class134.field2243.length());
                                } else if (var418.startsWith(class134.field2245)) {
                                    var419 = 3;
                                    var410 = var410.substring(class134.field2245.length());
                                } else if (var418.startsWith(class134.field2247)) {
                                    var419 = 4;
                                    var410 = var410.substring(class134.field2247.length());
                                } else if (var418.startsWith(class134.field2249)) {
                                    var419 = 5;
                                    var410 = var410.substring(class134.field2249.length());
                                } else if (var418.startsWith(class134.field2251)) {
                                    var419 = 6;
                                    var410 = var410.substring(class134.field2251.length());
                                } else if (var418.startsWith(class134.field2253)) {
                                    var419 = 7;
                                    var410 = var410.substring(class134.field2253.length());
                                } else if (var418.startsWith(class134.field2255)) {
                                    var419 = 8;
                                    var410 = var410.substring(class134.field2255.length());
                                } else if (var418.startsWith(class134.field2143)) {
                                    var419 = 9;
                                    var410 = var410.substring(class134.field2143.length());
                                } else if (var418.startsWith(class134.field2259)) {
                                    var419 = 10;
                                    var410 = var410.substring(class134.field2259.length());
                                } else if (var418.startsWith(class134.field2276)) {
                                    var419 = 11;
                                    var410 = var410.substring(class134.field2276.length());
                                }
                            }
                            String var420 = var410.toLowerCase();
                            byte var421 = 0;
                            if (var420.startsWith(class134.field2262)) {
                                var421 = 1;
                                var410 = var410.substring(class134.field2262.length());
                            } else if (var420.startsWith(class134.field2185)) {
                                var421 = 2;
                                var410 = var410.substring(class134.field2185.length());
                            } else if (var420.startsWith(class134.field2141)) {
                                var421 = 3;
                                var410 = var410.substring(class134.field2141.length());
                            } else if (var420.startsWith(class134.field2268)) {
                                var421 = 4;
                                var410 = var410.substring(class134.field2268.length());
                            } else if (var420.startsWith(class134.field2270)) {
                                var421 = 5;
                                var410 = var410.substring(class134.field2270.length());
                            } else if (client.field601 != 0) {
                                if (var420.startsWith(class134.field2263)) {
                                    var421 = 1;
                                    var410 = var410.substring(class134.field2263.length());
                                } else if (var420.startsWith(class134.field2112)) {
                                    var421 = 2;
                                    var410 = var410.substring(class134.field2112.length());
                                } else if (var420.startsWith(class134.field2257)) {
                                    var421 = 3;
                                    var410 = var410.substring(class134.field2257.length());
                                } else if (var420.startsWith(class134.field2273)) {
                                    var421 = 4;
                                    var410 = var410.substring(class134.field2273.length());
                                } else if (var420.startsWith(class134.field2271)) {
                                    var421 = 5;
                                    var410 = var410.substring(class134.field2271.length());
                                }
                            }
                            client.field692.method2319(231);
                            client.field692.method2482(0);
                            int var422 = client.field692.field2022;
                            client.field692.method2482(var419);
                            client.field692.method2482(var421);
                            class184.method3150(client.field692, var410);
                            client.field692.method2438(client.field692.field2022 - var422);
                            continue;
                        }
                        if (var437 == 5009) {
                            var5 -= 2;
                            String var423 = field391[var5];
                            String var424 = field391[var5 + 1];
                            client.field692.method2319(84);
                            client.field692.method2428(0);
                            int var425 = client.field692.field2022;
                            client.field692.method2432(var423);
                            class184.method3150(client.field692, var424);
                            client.field692.method2437(client.field692.field2022 - var425);
                            continue;
                        }
                        if (var437 == 5010) {
                            var4--;
                            int var426 = field400[var4];
                            String var427 = null;
                            if (var426 < 100) {
                                var427 = client.field604[var426];
                            }
                            if (var427 == null) {
                                var427 = "";
                            }
                            field391[var5++] = var427;
                            continue;
                        }
                        if (var437 == 5011) {
                            var4--;
                            int var428 = field400[var4];
                            String var429 = null;
                            if (var428 < 100) {
                                var429 = client.field717[var428];
                            }
                            if (var429 == null) {
                                var429 = "";
                            }
                            field391[var5++] = var429;
                            continue;
                        }
                        if (var437 == 5015) {
                            String var430;
                            if (Statics.field71 == null || Statics.field71.field39 == null) {
                                var430 = "";
                            } else {
                                var430 = Statics.field71.field39;
                            }
                            field391[var5++] = var430;
                            continue;
                        }
                        if (var437 == 5016) {
                            field400[var4++] = client.field689;
                            continue;
                        }
                        if (var437 == 5017) {
                            field400[var4++] = client.field686;
                            continue;
                        }
                    }
                } else {
                    class158 var74;
                    if (var437 >= 2000) {
                        var437 -= 1000;
                        var4--;
                        var74 = class158.method3(field400[var4]);
                    } else {
                        var74 = var51 ? Statics.field404 : Statics.field1224;
                    }
                    if (var437 == 1300) {
                        var4--;
                        int var75 = field400[var4] - 1;
                        if (var75 >= 0 && var75 <= 9) {
                            var5--;
                            var74.method3093(var75, field391[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var437 == 1301) {
                        var4 -= 2;
                        int var76 = field400[var4];
                        int var77 = field400[var4 + 1];
                        var74.field2636 = class158.method1(var76, var77);
                        continue;
                    }
                    if (var437 == 1302) {
                        var4--;
                        var74.field2623 = field400[var4] == 1;
                        continue;
                    }
                    if (var437 == 1303) {
                        var4--;
                        var74.field2637 = field400[var4];
                        continue;
                    }
                    if (var437 == 1304) {
                        var4--;
                        var74.field2682 = field400[var4];
                        continue;
                    }
                    if (var437 == 1305) {
                        var5--;
                        var74.field2638 = field391[var5];
                        continue;
                    }
                    if (var437 == 1306) {
                        var5--;
                        var74.field2640 = field391[var5];
                        continue;
                    }
                    if (var437 == 1307) {
                        var74.field2635 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var436) {
            StringBuilder var432 = new StringBuilder(30);
            var432.append("").append(var3.field2809).append(" ");
            for (int var433 = field399 - 1; var433 >= 0; var433--) {
                var432.append("").append(field393[var433].field269.field2809).append(" ");
            }
            var432.append("").append(var9);
            class80.method2830(var432.toString(), var436);
        }
    }

    @ObfuscatedName("e.r(II)V")
    public static void method39(int arg0) {
        if (arg0 == -1 || !class158.method2675(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2627[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3.field2634 != null) {
                class1 var4 = new class1();
                var4.field5 = var3;
                var4.field4 = var3.field2634;
                method2(var4);
            }
        }
    }
}
