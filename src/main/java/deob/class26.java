package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("z")
public class class26 {

    @ObfuscatedName("z.n")
    public static int[] field405 = new int[5];

    @ObfuscatedName("z.l")
    public static int[][] field397 = new int[5][5000];

    @ObfuscatedName("z.v")
    public static int[] field398 = new int[1000];

    @ObfuscatedName("z.g")
    public static String[] field409 = new String[1000];

    @ObfuscatedName("z.x")
    public static int field400 = 0;

    @ObfuscatedName("z.c")
    public static class18[] field402 = new class18[50];

    @ObfuscatedName("z.d")
    public static Calendar field403 = Calendar.getInstance();

    @ObfuscatedName("z.a")
    public static final String[] field404 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.p(Lp;B)V")
    public static void method916(class1 arg0) {
        Object[] var1 = arg0.field1;
        int var2 = (Integer) var1[0];
        class5 var3 = Statics.method878(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field69;
        int[] var8 = var3.field73;
        byte var9 = -1;
        field400 = 0;
        try {
            Statics.field396 = new int[var3.field68];
            int var10 = 0;
            Statics.field2833 = new String[var3.field76];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field6;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field4;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2584;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field16;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2678;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field5 == null ? -1 : arg0.field5.field2584;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field5 == null ? -1 : arg0.field5.field2678;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field3;
                    }
                    Statics.field396[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field2833[var11++] = var14;
                }
            }
            int var15 = 0;
            label2333: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var389 = var7[var6];
                if (var389 < 100) {
                    if (var389 == 0) {
                        field398[var4++] = var8[var6];
                        continue;
                    }
                    if (var389 == 1) {
                        int var16 = var8[var6];
                        field398[var4++] = class159.field2703[var16];
                        continue;
                    }
                    if (var389 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class159.field2703[var17] = field398[var4];
                        continue;
                    }
                    if (var389 == 3) {
                        field409[var5++] = var3.field71[var6];
                        continue;
                    }
                    if (var389 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var389 == 7) {
                        var4 -= 2;
                        if (field398[var4 + 1] != field398[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var389 == 8) {
                        var4 -= 2;
                        if (field398[var4 + 1] == field398[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var389 == 9) {
                        var4 -= 2;
                        if (field398[var4] < field398[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var389 == 10) {
                        var4 -= 2;
                        if (field398[var4] > field398[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var389 == 21) {
                        if (field400 == 0) {
                            return;
                        }
                        class18 var18 = field402[--field400];
                        var3 = var18.field265;
                        var7 = var3.field69;
                        var8 = var3.field73;
                        var6 = var18.field258;
                        Statics.field396 = var18.field259;
                        Statics.field2833 = var18.field260;
                        continue;
                    }
                    if (var389 == 25) {
                        int var19 = var8[var6];
                        field398[var4++] = class159.method1349(var19);
                        continue;
                    }
                    if (var389 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field398[var4];
                        class38 var22 = class38.method137(var20);
                        int var23 = var22.field963;
                        int var24 = var22.field962;
                        int var25 = var22.field969;
                        int var26 = class159.field2707[var25 - var24];
                        if (var21 < 0 || var21 > var26) {
                            var21 = 0;
                        }
                        int var27 = var26 << var24;
                        class159.field2703[var23] = class159.field2703[var23] & ~var27 | var21 << var24 & var27;
                        continue;
                    }
                    if (var389 == 31) {
                        var4 -= 2;
                        if (field398[var4] <= field398[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var389 == 32) {
                        var4 -= 2;
                        if (field398[var4] >= field398[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var389 == 33) {
                        field398[var4++] = Statics.field396[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var389 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field396[var10001] = field398[var4];
                        continue;
                    }
                    if (var389 == 35) {
                        field409[var5++] = Statics.field2833[var8[var6]];
                        continue;
                    }
                    if (var389 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field2833[var10001] = field409[var5];
                        continue;
                    }
                    if (var389 == 37) {
                        int var28 = var8[var6];
                        var5 -= var28;
                        String var29 = class147.method18(field409, var5, var28);
                        field409[var5++] = var29;
                        continue;
                    }
                    if (var389 == 38) {
                        var4--;
                        continue;
                    }
                    if (var389 == 39) {
                        var5--;
                        continue;
                    }
                    if (var389 == 40) {
                        int var30 = var8[var6];
                        class5 var31 = Statics.method878(var30);
                        int[] var32 = new int[var31.field68];
                        String[] var33 = new String[var31.field76];
                        for (int var34 = 0; var34 < var31.field75; var34++) {
                            var32[var34] = field398[var4 - var31.field75 + var34];
                        }
                        for (int var35 = 0; var35 < var31.field70; var35++) {
                            var33[var35] = field409[var5 - var31.field70 + var35];
                        }
                        var4 -= var31.field75;
                        var5 -= var31.field70;
                        class18 var36 = new class18();
                        var36.field265 = var3;
                        var36.field258 = var6;
                        var36.field259 = Statics.field396;
                        var36.field260 = Statics.field2833;
                        field402[++field400 - 1] = var36;
                        var3 = var31;
                        var7 = var31.field69;
                        var8 = var31.field73;
                        var6 = -1;
                        Statics.field396 = var32;
                        Statics.field2833 = var33;
                        continue;
                    }
                    if (var389 == 42) {
                        field398[var4++] = client.field684[var8[var6]];
                        continue;
                    }
                    if (var389 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field684[var10001] = field398[var4];
                        continue;
                    }
                    if (var389 == 44) {
                        int var37 = var8[var6] >> 16;
                        int var38 = var8[var6] & 0xFFFF;
                        var4--;
                        int var39 = field398[var4];
                        if (var39 >= 0 && var39 <= 5000) {
                            field405[var37] = var39;
                            byte var40 = -1;
                            if (var38 == 105) {
                                var40 = 0;
                            }
                            int var41 = 0;
                            while (true) {
                                if (var41 >= var39) {
                                    continue label2333;
                                }
                                field397[var37][var41] = var40;
                                var41++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var389 == 45) {
                        int var42 = var8[var6];
                        var4--;
                        int var43 = field398[var4];
                        if (var43 >= 0 && var43 < field405[var42]) {
                            field398[var4++] = field397[var42][var43];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var389 == 46) {
                        int var44 = var8[var6];
                        var4 -= 2;
                        int var45 = field398[var4];
                        if (var45 >= 0 && var45 < field405[var44]) {
                            field397[var44][var45] = field398[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var389 == 47) {
                        String var46 = client.field532[var8[var6]];
                        if (var46 == null) {
                            var46 = "null";
                        }
                        field409[var5++] = var46;
                        continue;
                    }
                    if (var389 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field532[var10001] = field409[var5];
                        continue;
                    }
                }
                boolean var47;
                if (var8[var6] == 1) {
                    var47 = true;
                } else {
                    var47 = false;
                }
                if (var389 < 1000) {
                    if (var389 == 100) {
                        var4 -= 3;
                        int var48 = field398[var4];
                        int var49 = field398[var4 + 1];
                        int var50 = field398[var4 + 2];
                        if (var49 == 0) {
                            throw new RuntimeException();
                        }
                        class158 var51 = class158.method667(var48);
                        if (var51.field2692 == null) {
                            var51.field2692 = new class158[var50 + 1];
                        }
                        if (var51.field2692.length <= var50) {
                            class158[] var52 = new class158[var50 + 1];
                            for (int var53 = 0; var53 < var51.field2692.length; var53++) {
                                var52[var53] = var51.field2692[var53];
                            }
                            var51.field2692 = var52;
                        }
                        if (var50 > 0 && var51.field2692[var50 - 1] == null) {
                            throw new RuntimeException("" + (var50 - 1));
                        }
                        class158 var54 = new class158();
                        var54.field2586 = var49;
                        var54.field2696 = var54.field2584 = var51.field2584;
                        var54.field2678 = var50;
                        var54.field2583 = true;
                        var51.field2692[var50] = var54;
                        if (var47) {
                            Statics.field1271 = var54;
                        } else {
                            Statics.field394 = var54;
                        }
                        client.method42(var51);
                        continue;
                    }
                    if (var389 == 101) {
                        class158 var55 = var47 ? Statics.field1271 : Statics.field394;
                        class158 var56 = class158.method667(var55.field2584);
                        var56.field2692[var55.field2678] = null;
                        client.method42(var56);
                        continue;
                    }
                    if (var389 == 102) {
                        var4--;
                        class158 var57 = class158.method667(field398[var4]);
                        var57.field2692 = null;
                        client.method42(var57);
                        continue;
                    }
                    if (var389 == 200) {
                        var4 -= 2;
                        int var58 = field398[var4];
                        int var59 = field398[var4 + 1];
                        class158 var60 = class158.method3104(var58, var59);
                        if (var60 != null && var59 != -1) {
                            field398[var4++] = 1;
                            if (var47) {
                                Statics.field1271 = var60;
                            } else {
                                Statics.field394 = var60;
                            }
                            continue;
                        }
                        field398[var4++] = 0;
                        continue;
                    }
                } else if (!(var389 < 1000 || var389 >= 1100) || !(var389 < 2000 || var389 >= 2100)) {
                    class158 var61;
                    if (var389 >= 2000) {
                        var389 -= 1000;
                        var4--;
                        var61 = class158.method667(field398[var4]);
                    } else {
                        var61 = var47 ? Statics.field1271 : Statics.field394;
                    }
                    if (var389 == 1000) {
                        var4 -= 2;
                        var61.field2589 = field398[var4];
                        var61.field2590 = field398[var4 + 1];
                        client.method42(var61);
                        continue;
                    }
                    if (var389 == 1001) {
                        var4 -= 2;
                        var61.field2585 = field398[var4];
                        var61.field2594 = field398[var4 + 1];
                        client.method42(var61);
                        continue;
                    }
                    if (var389 == 1003) {
                        var4--;
                        boolean var62 = field398[var4] == 1;
                        if (var61.field2596 != var62) {
                            var61.field2596 = var62;
                            client.method42(var61);
                        }
                        continue;
                    }
                } else if (!(var389 < 1100 || var389 >= 1200) || !(var389 < 2100 || var389 >= 2200)) {
                    class158 var63;
                    if (var389 >= 2000) {
                        var389 -= 1000;
                        var4--;
                        var63 = class158.method667(field398[var4]);
                    } else {
                        var63 = var47 ? Statics.field1271 : Statics.field394;
                    }
                    if (var389 == 1100) {
                        var4 -= 2;
                        var63.field2597 = field398[var4];
                        if (var63.field2597 > var63.field2599 - var63.field2585) {
                            var63.field2597 = var63.field2599 - var63.field2585;
                        }
                        if (var63.field2597 < 0) {
                            var63.field2597 = 0;
                        }
                        var63.field2598 = field398[var4 + 1];
                        if (var63.field2598 > var63.field2600 - var63.field2594) {
                            var63.field2598 = var63.field2600 - var63.field2594;
                        }
                        if (var63.field2598 < 0) {
                            var63.field2598 = 0;
                        }
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1101) {
                        var4--;
                        var63.field2672 = field398[var4];
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1102) {
                        var4--;
                        var63.field2622 = field398[var4] == 1;
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1103) {
                        var4--;
                        var63.field2624 = field398[var4];
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1104) {
                        var4--;
                        var63.field2582 = field398[var4];
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1105) {
                        var4--;
                        var63.field2603 = field398[var4];
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1106) {
                        var4--;
                        var63.field2610 = field398[var4];
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1107) {
                        var4--;
                        var63.field2611 = field398[var4] == 1;
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1108) {
                        var63.field2593 = 1;
                        var4--;
                        var63.field2617 = field398[var4];
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1109) {
                        var4 -= 6;
                        var63.field2580 = field398[var4];
                        var63.field2623 = field398[var4 + 1];
                        var63.field2615 = field398[var4 + 2];
                        var63.field2625 = field398[var4 + 3];
                        var63.field2626 = field398[var4 + 4];
                        var63.field2652 = field398[var4 + 5];
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1110) {
                        var4--;
                        int var64 = field398[var4];
                        if (var63.field2620 != var64) {
                            var63.field2620 = var64;
                            var63.field2690 = 0;
                            var63.field2613 = 0;
                            client.method42(var63);
                        }
                        continue;
                    }
                    if (var389 == 1111) {
                        var4--;
                        var63.field2629 = field398[var4] == 1;
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1112) {
                        var5--;
                        String var65 = field409[var5];
                        if (!var65.equals(var63.field2691)) {
                            var63.field2691 = var65;
                            client.method42(var63);
                        }
                        continue;
                    }
                    if (var389 == 1113) {
                        var4--;
                        var63.field2675 = field398[var4];
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1114) {
                        var4 -= 3;
                        var63.field2631 = field398[var4];
                        var63.field2581 = field398[var4 + 1];
                        var63.field2637 = field398[var4 + 2];
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1115) {
                        var4--;
                        var63.field2636 = field398[var4] == 1;
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1116) {
                        var4--;
                        var63.field2632 = field398[var4];
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1117) {
                        var4--;
                        var63.field2685 = field398[var4];
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1118) {
                        var4--;
                        var63.field2616 = field398[var4] == 1;
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1119) {
                        var4--;
                        var63.field2618 = field398[var4] == 1;
                        client.method42(var63);
                        continue;
                    }
                    if (var389 == 1120) {
                        var4 -= 2;
                        var63.field2599 = field398[var4];
                        var63.field2600 = field398[var4 + 1];
                        client.method42(var63);
                        continue;
                    }
                } else if (!(var389 < 1200 || var389 >= 1300) || !(var389 < 2200 || var389 >= 2300)) {
                    class158 var66;
                    if (var389 >= 2000) {
                        var389 -= 1000;
                        var4--;
                        var66 = class158.method667(field398[var4]);
                    } else {
                        var66 = var47 ? Statics.field1271 : Statics.field394;
                    }
                    client.method42(var66);
                    if (var389 == 1200) {
                        var4 -= 2;
                        int var67 = field398[var4];
                        int var68 = field398[var4 + 1];
                        var66.field2688 = var67;
                        var66.field2689 = var68;
                        class40 var69 = class40.method730(var67);
                        var66.field2615 = var69.field1000;
                        var66.field2625 = var69.field1001;
                        var66.field2626 = var69.field1002;
                        var66.field2580 = var69.field1003;
                        var66.field2623 = var69.field1018;
                        var66.field2652 = var69.field999;
                        if (var66.field2585 > 0) {
                            var66.field2652 = var66.field2652 * 32 / var66.field2585;
                        }
                        continue;
                    }
                    if (var389 == 1201) {
                        var66.field2593 = 2;
                        var4--;
                        var66.field2617 = field398[var4];
                        continue;
                    }
                    if (var389 == 1202) {
                        var66.field2593 = 3;
                        var66.field2617 = Statics.field2006.field35.method3189();
                        continue;
                    }
                } else if ((var389 < 1300 || var389 >= 1400) && (var389 < 2300 || var389 >= 2400)) {
                    if (var389 >= 1400 && var389 < 1500 || var389 >= 2400 && var389 < 2500) {
                        class158 var74;
                        if (var389 >= 2000) {
                            var389 -= 1000;
                            var4--;
                            var74 = class158.method667(field398[var4]);
                        } else {
                            var74 = var47 ? Statics.field1271 : Statics.field394;
                        }
                        var5--;
                        String var75 = field409[var5];
                        int[] var76 = null;
                        if (var75.length() > 0 && var75.charAt(var75.length() - 1) == 'Y') {
                            var4--;
                            int var77 = field398[var4];
                            if (var77 > 0) {
                                var76 = new int[var77];
                                while (var77-- > 0) {
                                    var4--;
                                    var76[var77] = field398[var4];
                                }
                            }
                            var75 = var75.substring(0, var75.length() - 1);
                        }
                        Object[] var78 = new Object[var75.length() + 1];
                        for (int var79 = var78.length - 1; var79 >= 1; var79--) {
                            if (var75.charAt(var79 - 1) == 's') {
                                var5--;
                                var78[var79] = field409[var5];
                            } else {
                                var4--;
                                var78[var79] = Integer.valueOf(field398[var4]);
                            }
                        }
                        var4--;
                        int var80 = field398[var4];
                        if (var80 == -1) {
                            var78 = null;
                        } else {
                            var78[0] = Integer.valueOf(var80);
                        }
                        if (var389 == 1400) {
                            var74.field2653 = var78;
                        }
                        if (var389 == 1401) {
                            var74.field2656 = var78;
                        }
                        if (var389 == 1402) {
                            var74.field2655 = var78;
                        }
                        if (var389 == 1403) {
                            var74.field2657 = var78;
                        }
                        if (var389 == 1404) {
                            var74.field2659 = var78;
                        }
                        if (var389 == 1405) {
                            var74.field2660 = var78;
                        }
                        if (var389 == 1406) {
                            var74.field2663 = var78;
                        }
                        if (var389 == 1407) {
                            var74.field2601 = var78;
                            var74.field2669 = var76;
                        }
                        if (var389 == 1408) {
                            var74.field2670 = var78;
                        }
                        if (var389 == 1409) {
                            var74.field2671 = var78;
                        }
                        if (var389 == 1410) {
                            var74.field2661 = var78;
                        }
                        if (var389 == 1411) {
                            var74.field2654 = var78;
                        }
                        if (var389 == 1412) {
                            var74.field2658 = var78;
                        }
                        if (var389 == 1414) {
                            var74.field2666 = var78;
                            var74.field2667 = var76;
                        }
                        if (var389 == 1415) {
                            var74.field2668 = var78;
                            var74.field2574 = var76;
                        }
                        if (var389 == 1416) {
                            var74.field2662 = var78;
                        }
                        if (var389 == 1417) {
                            var74.field2645 = var78;
                        }
                        if (var389 == 1418) {
                            var74.field2673 = var78;
                        }
                        if (var389 == 1419) {
                            var74.field2674 = var78;
                        }
                        if (var389 == 1420) {
                            var74.field2664 = var78;
                        }
                        if (var389 == 1421) {
                            var74.field2607 = var78;
                        }
                        if (var389 == 1422) {
                            var74.field2677 = var78;
                        }
                        if (var389 == 1423) {
                            var74.field2627 = var78;
                        }
                        if (var389 == 1424) {
                            var74.field2679 = var78;
                        }
                        var74.field2595 = true;
                        continue;
                    }
                    if (var389 < 1600) {
                        class158 var81 = var47 ? Statics.field1271 : Statics.field394;
                        if (var389 == 1500) {
                            field398[var4++] = var81.field2589;
                            continue;
                        }
                        if (var389 == 1501) {
                            field398[var4++] = var81.field2590;
                            continue;
                        }
                        if (var389 == 1502) {
                            field398[var4++] = var81.field2585;
                            continue;
                        }
                        if (var389 == 1503) {
                            field398[var4++] = var81.field2594;
                            continue;
                        }
                        if (var389 == 1504) {
                            field398[var4++] = var81.field2596 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 1505) {
                            field398[var4++] = var81.field2696;
                            continue;
                        }
                    } else if (var389 < 1700) {
                        class158 var82 = var47 ? Statics.field1271 : Statics.field394;
                        if (var389 == 1600) {
                            field398[var4++] = var82.field2597;
                            continue;
                        }
                        if (var389 == 1601) {
                            field398[var4++] = var82.field2598;
                            continue;
                        }
                        if (var389 == 1602) {
                            field409[var5++] = var82.field2691;
                            continue;
                        }
                        if (var389 == 1603) {
                            field398[var4++] = var82.field2599;
                            continue;
                        }
                        if (var389 == 1604) {
                            field398[var4++] = var82.field2600;
                            continue;
                        }
                        if (var389 == 1605) {
                            field398[var4++] = var82.field2652;
                            continue;
                        }
                        if (var389 == 1606) {
                            field398[var4++] = var82.field2615;
                            continue;
                        }
                        if (var389 == 1607) {
                            field398[var4++] = var82.field2626;
                            continue;
                        }
                        if (var389 == 1608) {
                            field398[var4++] = var82.field2625;
                            continue;
                        }
                    } else if (var389 < 1800) {
                        class158 var83 = var47 ? Statics.field1271 : Statics.field394;
                        if (var389 == 1700) {
                            field398[var4++] = var83.field2688;
                            continue;
                        }
                        if (var389 == 1701) {
                            if (var83.field2688 == -1) {
                                field398[var4++] = 0;
                            } else {
                                field398[var4++] = var83.field2689;
                            }
                            continue;
                        }
                        if (var389 == 1702) {
                            field398[var4++] = var83.field2678;
                            continue;
                        }
                    } else if (var389 < 1900) {
                        class158 var84 = var47 ? Statics.field1271 : Statics.field394;
                        if (var389 == 1800) {
                            int[] var85 = field398;
                            int var86 = var4++;
                            int var87 = client.method242(var84);
                            int var88 = var87 >> 11 & 0x3F;
                            var85[var86] = var88;
                            continue;
                        }
                        if (var389 == 1801) {
                            var4--;
                            int var89 = field398[var4];
                            int var390 = var89 - 1;
                            if (var84.field2641 != null && var390 < var84.field2641.length && var84.field2641[var390] != null) {
                                field409[var5++] = var84.field2641[var390];
                                continue;
                            }
                            field409[var5++] = "";
                            continue;
                        }
                        if (var389 == 1802) {
                            if (var84.field2644 == null) {
                                field409[var5++] = "";
                            } else {
                                field409[var5++] = var84.field2644;
                            }
                            continue;
                        }
                    } else if (var389 < 2600) {
                        var4--;
                        class158 var90 = class158.method667(field398[var4]);
                        if (var389 == 2500) {
                            field398[var4++] = var90.field2589;
                            continue;
                        }
                        if (var389 == 2501) {
                            field398[var4++] = var90.field2590;
                            continue;
                        }
                        if (var389 == 2502) {
                            field398[var4++] = var90.field2585;
                            continue;
                        }
                        if (var389 == 2503) {
                            field398[var4++] = var90.field2594;
                            continue;
                        }
                        if (var389 == 2504) {
                            field398[var4++] = var90.field2596 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 2505) {
                            field398[var4++] = var90.field2696;
                            continue;
                        }
                    } else if (var389 < 2700) {
                        var4--;
                        class158 var91 = class158.method667(field398[var4]);
                        if (var389 == 2600) {
                            field398[var4++] = var91.field2597;
                            continue;
                        }
                        if (var389 == 2601) {
                            field398[var4++] = var91.field2598;
                            continue;
                        }
                        if (var389 == 2602) {
                            field409[var5++] = var91.field2691;
                            continue;
                        }
                        if (var389 == 2603) {
                            field398[var4++] = var91.field2599;
                            continue;
                        }
                        if (var389 == 2604) {
                            field398[var4++] = var91.field2600;
                            continue;
                        }
                        if (var389 == 2605) {
                            field398[var4++] = var91.field2652;
                            continue;
                        }
                        if (var389 == 2606) {
                            field398[var4++] = var91.field2615;
                            continue;
                        }
                        if (var389 == 2607) {
                            field398[var4++] = var91.field2626;
                            continue;
                        }
                        if (var389 == 2608) {
                            field398[var4++] = var91.field2625;
                            continue;
                        }
                    } else if (var389 < 2800) {
                        if (var389 == 2700) {
                            var4--;
                            class158 var92 = class158.method667(field398[var4]);
                            field398[var4++] = var92.field2688;
                            continue;
                        }
                        if (var389 == 2701) {
                            var4--;
                            class158 var93 = class158.method667(field398[var4]);
                            if (var93.field2688 == -1) {
                                field398[var4++] = 0;
                            } else {
                                field398[var4++] = var93.field2689;
                            }
                            continue;
                        }
                        if (var389 == 2702) {
                            var4--;
                            int var94 = field398[var4];
                            class4 var95 = (class4) client.field635.method3312((long) var94);
                            if (var95 == null) {
                                field398[var4++] = 0;
                            } else {
                                field398[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var389 < 2900) {
                        var4--;
                        class158 var96 = class158.method667(field398[var4]);
                        if (var389 == 2800) {
                            int[] var97 = field398;
                            int var98 = var4++;
                            int var99 = client.method242(var96);
                            int var100 = var99 >> 11 & 0x3F;
                            var97[var98] = var100;
                            continue;
                        }
                        if (var389 == 2801) {
                            var4--;
                            int var101 = field398[var4];
                            int var391 = var101 - 1;
                            if (var96.field2641 != null && var391 < var96.field2641.length && var96.field2641[var391] != null) {
                                field409[var5++] = var96.field2641[var391];
                                continue;
                            }
                            field409[var5++] = "";
                            continue;
                        }
                        if (var389 == 2802) {
                            if (var96.field2644 == null) {
                                field409[var5++] = "";
                            } else {
                                field409[var5++] = var96.field2644;
                            }
                            continue;
                        }
                    } else if (var389 < 3200) {
                        if (var389 == 3100) {
                            var5--;
                            String var102 = field409[var5];
                            client.method2724(0, "", var102);
                            continue;
                        }
                        if (var389 == 3101) {
                            var4 -= 2;
                            client.method1431(Statics.field2006, field398[var4], field398[var4 + 1]);
                            continue;
                        }
                        if (var389 == 3103) {
                            client.field512.method2356(178);
                            for (class4 var103 = (class4) client.field635.method3326(); var103 != null; var103 = (class4) client.field635.method3316()) {
                                if (var103.field58 == 0 || var103.field58 == 3) {
                                    client.method1402(var103, true);
                                }
                            }
                            if (client.field638 != null) {
                                client.method42(client.field638);
                                client.field638 = null;
                            }
                            continue;
                        }
                        if (var389 == 3104) {
                            var5--;
                            String var104 = field409[var5];
                            int var105 = 0;
                            if (class147.method2339(var104)) {
                                var105 = class147.method2073(var104);
                            }
                            client.field512.method2356(181);
                            client.field512.method2606(var105);
                            continue;
                        }
                        if (var389 == 3105) {
                            var5--;
                            String var106 = field409[var5];
                            client.field512.method2356(127);
                            client.field512.method2474(var106.length() + 1);
                            client.field512.method2479(var106);
                            continue;
                        }
                        if (var389 == 3106) {
                            var5--;
                            String var107 = field409[var5];
                            client.field512.method2356(114);
                            client.field512.method2474(var107.length() + 1);
                            client.field512.method2479(var107);
                            continue;
                        }
                        if (var389 == 3107) {
                            var4--;
                            int var108 = field398[var4];
                            var5--;
                            String var109 = field409[var5];
                            client.method114(var108, var109);
                            continue;
                        }
                        if (var389 == 3108) {
                            var4 -= 3;
                            int var110 = field398[var4];
                            int var111 = field398[var4 + 1];
                            int var112 = field398[var4 + 2];
                            class158 var113 = class158.method667(var112);
                            if (client.field645 == null && !client.field652 && var113 != null && client.method1540(var113) != null) {
                                client.field645 = var113;
                                client.field646 = client.method1540(var113);
                                client.field575 = var110;
                                client.field648 = var111;
                                Statics.field2389 = 0;
                                client.field508 = false;
                            }
                            continue;
                        }
                        if (var389 == 3109) {
                            var4 -= 2;
                            int var114 = field398[var4];
                            int var115 = field398[var4 + 1];
                            class158 var116 = var47 ? Statics.field1271 : Statics.field394;
                            if (client.field645 == null && !client.field652 && var116 != null && client.method1540(var116) != null) {
                                client.field645 = var116;
                                client.field646 = client.method1540(var116);
                                client.field575 = var114;
                                client.field648 = var115;
                                Statics.field2389 = 0;
                                client.field508 = false;
                            }
                            continue;
                        }
                    } else if (var389 < 3300) {
                        if (var389 == 3200) {
                            var4 -= 3;
                            client.method138(field398[var4], field398[var4 + 1], field398[var4 + 2]);
                            continue;
                        }
                        if (var389 == 3201) {
                            var4--;
                            Statics.method2341(field398[var4]);
                            continue;
                        }
                        if (var389 == 3202) {
                            var4 -= 2;
                            client.method123(field398[var4], field398[var4 + 1]);
                            continue;
                        }
                    } else if (var389 < 3400) {
                        if (var389 == 3300) {
                            field398[var4++] = client.field481;
                            continue;
                        }
                        if (var389 == 3301) {
                            var4 -= 2;
                            int var117 = field398[var4];
                            int var118 = field398[var4 + 1];
                            int[] var119 = field398;
                            int var120 = var4++;
                            class19 var121 = (class19) class19.field272.method3312((long) var117);
                            int var122;
                            if (var121 == null) {
                                var122 = -1;
                            } else if (var118 >= 0 && var118 < var121.field269.length) {
                                var122 = var121.field269[var118];
                            } else {
                                var122 = -1;
                            }
                            var119[var120] = var122;
                            continue;
                        }
                        if (var389 == 3302) {
                            var4 -= 2;
                            int var123 = field398[var4];
                            int var124 = field398[var4 + 1];
                            int[] var125 = field398;
                            int var126 = var4++;
                            class19 var127 = (class19) class19.field272.method3312((long) var123);
                            int var128;
                            if (var127 == null) {
                                var128 = 0;
                            } else if (var124 >= 0 && var124 < var127.field270.length) {
                                var128 = var127.field270[var124];
                            } else {
                                var128 = 0;
                            }
                            var125[var126] = var128;
                            continue;
                        }
                        if (var389 == 3303) {
                            var4 -= 2;
                            int var129 = field398[var4];
                            int var130 = field398[var4 + 1];
                            field398[var4++] = Statics.method13(var129, var130);
                            continue;
                        }
                        if (var389 == 3304) {
                            var4--;
                            int var131 = field398[var4];
                            field398[var4++] = class41.method44(var131).field1034;
                            continue;
                        }
                        if (var389 == 3305) {
                            var4--;
                            int var132 = field398[var4];
                            field398[var4++] = client.field492[var132];
                            continue;
                        }
                        if (var389 == 3306) {
                            var4--;
                            int var133 = field398[var4];
                            field398[var4++] = client.field613[var133];
                            continue;
                        }
                        if (var389 == 3307) {
                            var4--;
                            int var134 = field398[var4];
                            field398[var4++] = client.field614[var134];
                            continue;
                        }
                        if (var389 == 3308) {
                            int var135 = Statics.field231;
                            int var136 = (Statics.field2006.field455 >> 7) + Statics.field85;
                            int var137 = (Statics.field2006.field411 >> 7) + Statics.field1552;
                            field398[var4++] = (var135 << 28) + (var136 << 14) + var137;
                            continue;
                        }
                        if (var389 == 3309) {
                            var4--;
                            int var138 = field398[var4];
                            field398[var4++] = var138 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var389 == 3310) {
                            var4--;
                            int var139 = field398[var4];
                            field398[var4++] = var139 >> 28;
                            continue;
                        }
                        if (var389 == 3311) {
                            var4--;
                            int var140 = field398[var4];
                            field398[var4++] = var140 & 0x3FFF;
                            continue;
                        }
                        if (var389 == 3312) {
                            field398[var4++] = client.field476 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 3313) {
                            var4 -= 2;
                            int var141 = field398[var4] + 32768;
                            int var142 = field398[var4 + 1];
                            int[] var143 = field398;
                            int var144 = var4++;
                            class19 var145 = (class19) class19.field272.method3312((long) var141);
                            int var146;
                            if (var145 == null) {
                                var146 = -1;
                            } else if (var142 >= 0 && var142 < var145.field269.length) {
                                var146 = var145.field269[var142];
                            } else {
                                var146 = -1;
                            }
                            var143[var144] = var146;
                            continue;
                        }
                        if (var389 == 3314) {
                            var4 -= 2;
                            int var147 = field398[var4] + 32768;
                            int var148 = field398[var4 + 1];
                            int[] var149 = field398;
                            int var150 = var4++;
                            class19 var151 = (class19) class19.field272.method3312((long) var147);
                            int var152;
                            if (var151 == null) {
                                var152 = 0;
                            } else if (var148 >= 0 && var148 < var151.field270.length) {
                                var152 = var151.field270[var148];
                            } else {
                                var152 = 0;
                            }
                            var149[var150] = var152;
                            continue;
                        }
                        if (var389 == 3315) {
                            var4 -= 2;
                            int var153 = field398[var4] + 32768;
                            int var154 = field398[var4 + 1];
                            field398[var4++] = Statics.method13(var153, var154);
                            continue;
                        }
                        if (var389 == 3316) {
                            if (client.field641 >= 2) {
                                field398[var4++] = client.field641;
                            } else {
                                field398[var4++] = 0;
                            }
                            continue;
                        }
                        if (var389 == 3317) {
                            field398[var4++] = client.field489;
                            continue;
                        }
                        if (var389 == 3318) {
                            field398[var4++] = client.field563;
                            continue;
                        }
                        if (var389 == 3321) {
                            field398[var4++] = client.field480;
                            continue;
                        }
                        if (var389 == 3322) {
                            field398[var4++] = client.field640;
                            continue;
                        }
                        if (var389 == 3323) {
                            if (client.field642) {
                                field398[var4++] = 1;
                            } else {
                                field398[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var389 < 3500) {
                        if (var389 == 3400) {
                            var4 -= 2;
                            int var155 = field398[var4];
                            int var156 = field398[var4 + 1];
                            class39 var157 = class39.method149(var155);
                            if (var157.field974 != 's') {
                            }
                            for (int var158 = 0; var158 < var157.field976; var158++) {
                                if (var157.field982[var158] == var156) {
                                    field409[var5++] = var157.field980[var158];
                                    var157 = null;
                                    break;
                                }
                            }
                            if (var157 != null) {
                                field409[var5++] = var157.field975;
                            }
                            continue;
                        }
                        if (var389 == 3408) {
                            var4 -= 4;
                            int var159 = field398[var4];
                            int var160 = field398[var4 + 1];
                            int var161 = field398[var4 + 2];
                            int var162 = field398[var4 + 3];
                            class39 var163 = class39.method149(var161);
                            if (var163.field973 == var159 && var163.field974 == var160) {
                                for (int var164 = 0; var164 < var163.field976; var164++) {
                                    if (var163.field982[var164] == var162) {
                                        if (var160 == 115) {
                                            field409[var5++] = var163.field980[var164];
                                        } else {
                                            field398[var4++] = var163.field977[var164];
                                        }
                                        var163 = null;
                                        break;
                                    }
                                }
                                if (var163 != null) {
                                    if (var160 == 115) {
                                        field409[var5++] = var163.field975;
                                    } else {
                                        field398[var4++] = var163.field978;
                                    }
                                }
                                continue;
                            }
                            if (var160 == 115) {
                                field409[var5++] = "null";
                            } else {
                                field398[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var389 < 3700) {
                        if (var389 == 3600) {
                            if (client.field728 == 0) {
                                field398[var4++] = -2;
                            } else if (client.field728 == 1) {
                                field398[var4++] = -1;
                            } else {
                                field398[var4++] = client.field727;
                            }
                            continue;
                        }
                        if (var389 == 3601) {
                            var4--;
                            int var165 = field398[var4];
                            if (client.field728 == 2 && var165 < client.field727) {
                                field409[var5++] = client.field729[var165].field358;
                                continue;
                            }
                            field409[var5++] = "";
                            continue;
                        }
                        if (var389 == 3602) {
                            var4--;
                            int var166 = field398[var4];
                            if (client.field728 == 2 && var166 < client.field727) {
                                field398[var4++] = client.field729[var166].field362;
                                continue;
                            }
                            field398[var4++] = 0;
                            continue;
                        }
                        if (var389 == 3603) {
                            var4--;
                            int var167 = field398[var4];
                            if (client.field728 == 2 && var167 < client.field727) {
                                field398[var4++] = client.field729[var167].field357;
                                continue;
                            }
                            field398[var4++] = 0;
                            continue;
                        }
                        if (var389 == 3604) {
                            var5--;
                            String var168 = field409[var5];
                            var4--;
                            int var169 = field398[var4];
                            client.method1715(var168, var169);
                            continue;
                        }
                        if (var389 == 3605) {
                            var5--;
                            String var170 = field409[var5];
                            if (var170 == null) {
                                continue;
                            }
                            if ((client.field727 < 200 || client.field543 == 1) && client.field727 < 200) {
                                String var171 = class148.method2960(var170, Statics.field2049);
                                if (var171 == null) {
                                    continue;
                                }
                                for (int var172 = 0; var172 < client.field727; var172++) {
                                    class23 var173 = client.field729[var172];
                                    String var174 = class148.method2960(var173.field358, Statics.field2049);
                                    if (var174 != null && var174.equals(var171)) {
                                        client.method2724(0, "", var170 + class134.field2246);
                                        continue label2333;
                                    }
                                    if (var173.field355 != null) {
                                        String var175 = class148.method2960(var173.field355, Statics.field2049);
                                        if (var175 != null && var175.equals(var171)) {
                                            client.method2724(0, "", var170 + class134.field2246);
                                            continue label2333;
                                        }
                                    }
                                }
                                for (int var176 = 0; var176 < client.field667; var176++) {
                                    class11 var177 = client.field695[var176];
                                    String var178 = class148.method2960(var177.field175, Statics.field2049);
                                    if (var178 != null && var178.equals(var171)) {
                                        client.method2724(0, "", class134.field2312 + var170 + class134.field2252);
                                        continue label2333;
                                    }
                                    if (var177.field174 != null) {
                                        String var179 = class148.method2960(var177.field174, Statics.field2049);
                                        if (var179 != null && var179.equals(var171)) {
                                            client.method2724(0, "", class134.field2312 + var170 + class134.field2252);
                                            continue label2333;
                                        }
                                    }
                                }
                                if (class148.method2960(Statics.field2006.field40, Statics.field2049).equals(var171)) {
                                    client.method2724(0, "", class134.field2249);
                                } else {
                                    client.field512.method2356(180);
                                    client.field512.method2474(class127.method1638(var170));
                                    client.field512.method2479(var170);
                                }
                                continue;
                            }
                            client.method2724(0, "", class134.field2293);
                            continue;
                        }
                        if (var389 == 3606) {
                            var5--;
                            String var180 = field409[var5];
                            if (var180 == null) {
                                continue;
                            }
                            String var181 = class148.method2960(var180, Statics.field2049);
                            if (var181 == null) {
                                continue;
                            }
                            int var182 = 0;
                            while (true) {
                                if (var182 >= client.field727) {
                                    continue label2333;
                                }
                                class23 var183 = client.field729[var182];
                                String var184 = var183.field358;
                                String var185 = class148.method2960(var184, Statics.field2049);
                                if (class136.method2725(var180, var181, var184, var185)) {
                                    client.field727--;
                                    for (int var186 = var182; var186 < client.field727; var186++) {
                                        client.field729[var186] = client.field729[var186 + 1];
                                    }
                                    client.field665 = client.field474;
                                    client.field512.method2356(96);
                                    class116 var187 = client.field512;
                                    int var188 = var180.length() + 1;
                                    var187.method2474(var188);
                                    client.field512.method2479(var180);
                                    continue label2333;
                                }
                                var182++;
                            }
                        }
                        if (var389 == 3607) {
                            var5--;
                            String var189 = field409[var5];
                            client.method2422(var189, false);
                            continue;
                        }
                        if (var389 == 3608) {
                            var5--;
                            String var190 = field409[var5];
                            if (var190 == null) {
                                continue;
                            }
                            String var191 = class148.method2960(var190, Statics.field2049);
                            if (var191 == null) {
                                continue;
                            }
                            int var192 = 0;
                            while (true) {
                                if (var192 >= client.field667) {
                                    continue label2333;
                                }
                                class11 var193 = client.field695[var192];
                                String var194 = var193.field175;
                                String var195 = class148.method2960(var194, Statics.field2049);
                                if (class136.method2725(var190, var191, var194, var195)) {
                                    client.field667--;
                                    for (int var196 = var192; var196 < client.field667; var196++) {
                                        client.field695[var196] = client.field695[var196 + 1];
                                    }
                                    client.field665 = client.field474;
                                    client.field512.method2356(132);
                                    class116 var197 = client.field512;
                                    int var198 = var190.length() + 1;
                                    var197.method2474(var198);
                                    client.field512.method2479(var190);
                                    continue label2333;
                                }
                                var192++;
                            }
                        }
                        if (var389 == 3609) {
                            var5--;
                            String var199 = field409[var5];
                            if (var199.startsWith(Statics.method625(0)) || var199.startsWith(Statics.method625(1))) {
                                var199 = var199.substring(7);
                            }
                            field398[var4++] = client.method1614(var199) ? 1 : 0;
                            continue;
                        }
                        if (var389 == 3611) {
                            if (client.field700 == null) {
                                field409[var5++] = "";
                            } else {
                                field409[var5++] = class146.method680(client.field700);
                            }
                            continue;
                        }
                        if (var389 == 3612) {
                            if (client.field700 == null) {
                                field398[var4++] = 0;
                            } else {
                                field398[var4++] = Statics.field2461;
                            }
                            continue;
                        }
                        if (var389 == 3613) {
                            var4--;
                            int var200 = field398[var4];
                            if (client.field700 != null && var200 < Statics.field2461) {
                                field409[var5++] = Statics.field2012[var200].field110;
                                continue;
                            }
                            field409[var5++] = "";
                            continue;
                        }
                        if (var389 == 3614) {
                            var4--;
                            int var201 = field398[var4];
                            if (client.field700 != null && var201 < Statics.field2461) {
                                field398[var4++] = Statics.field2012[var201].field116;
                                continue;
                            }
                            field398[var4++] = 0;
                            continue;
                        }
                        if (var389 == 3615) {
                            var4--;
                            int var202 = field398[var4];
                            if (client.field700 != null && var202 < Statics.field2461) {
                                field398[var4++] = Statics.field2012[var202].field111;
                                continue;
                            }
                            field398[var4++] = 0;
                            continue;
                        }
                        if (var389 == 3616) {
                            field398[var4++] = Statics.field1351;
                            continue;
                        }
                        if (var389 == 3617) {
                            var5--;
                            String var203 = field409[var5];
                            client.method1348(var203);
                            continue;
                        }
                        if (var389 == 3618) {
                            field398[var4++] = Statics.field2333;
                            continue;
                        }
                        if (var389 == 3619) {
                            var5--;
                            String var204 = field409[var5];
                            if (!var204.equals("")) {
                                client.field512.method2356(185);
                                client.field512.method2474(class127.method1638(var204));
                                client.field512.method2479(var204);
                            }
                            continue;
                        }
                        if (var389 == 3620) {
                            client.method2075();
                            continue;
                        }
                        if (var389 == 3621) {
                            if (client.field728 == 0) {
                                field398[var4++] = -1;
                            } else {
                                field398[var4++] = client.field667;
                            }
                            continue;
                        }
                        if (var389 == 3622) {
                            var4--;
                            int var205 = field398[var4];
                            if (client.field728 != 0 && var205 < client.field667) {
                                field409[var5++] = client.field695[var205].field175;
                                continue;
                            }
                            field409[var5++] = "";
                            continue;
                        }
                        if (var389 == 3623) {
                            var5--;
                            String var206 = field409[var5];
                            if (var206.startsWith(Statics.method625(0)) || var206.startsWith(Statics.method625(1))) {
                                var206 = var206.substring(7);
                            }
                            field398[var4++] = client.method150(var206) ? 1 : 0;
                            continue;
                        }
                        if (var389 == 3624) {
                            var4--;
                            int var207 = field398[var4];
                            if (Statics.field2012 != null && var207 < Statics.field2461 && Statics.field2012[var207].field110.equalsIgnoreCase(Statics.field2006.field40)) {
                                field398[var4++] = 1;
                                continue;
                            }
                            field398[var4++] = 0;
                            continue;
                        }
                        if (var389 == 3625) {
                            if (client.field573 == null) {
                                field409[var5++] = "";
                            } else {
                                field409[var5++] = class146.method680(client.field573);
                            }
                            continue;
                        }
                    } else if (var389 < 4100) {
                        if (var389 == 4000) {
                            var4 -= 2;
                            int var208 = field398[var4];
                            int var209 = field398[var4 + 1];
                            field398[var4++] = var208 + var209;
                            continue;
                        }
                        if (var389 == 4001) {
                            var4 -= 2;
                            int var210 = field398[var4];
                            int var211 = field398[var4 + 1];
                            field398[var4++] = var210 - var211;
                            continue;
                        }
                        if (var389 == 4002) {
                            var4 -= 2;
                            int var212 = field398[var4];
                            int var213 = field398[var4 + 1];
                            field398[var4++] = var212 * var213;
                            continue;
                        }
                        if (var389 == 4003) {
                            var4 -= 2;
                            int var214 = field398[var4];
                            int var215 = field398[var4 + 1];
                            field398[var4++] = var214 / var215;
                            continue;
                        }
                        if (var389 == 4004) {
                            var4--;
                            int var216 = field398[var4];
                            field398[var4++] = (int) (Math.random() * (double) var216);
                            continue;
                        }
                        if (var389 == 4005) {
                            var4--;
                            int var217 = field398[var4];
                            field398[var4++] = (int) (Math.random() * (double) (var217 + 1));
                            continue;
                        }
                        if (var389 == 4006) {
                            var4 -= 5;
                            int var218 = field398[var4];
                            int var219 = field398[var4 + 1];
                            int var220 = field398[var4 + 2];
                            int var221 = field398[var4 + 3];
                            int var222 = field398[var4 + 4];
                            field398[var4++] = (var219 - var218) * (var222 - var220) / (var221 - var220) + var218;
                            continue;
                        }
                        if (var389 == 4007) {
                            var4 -= 2;
                            int var223 = field398[var4];
                            int var224 = field398[var4 + 1];
                            field398[var4++] = var223 * var224 / 100 + var223;
                            continue;
                        }
                        if (var389 == 4008) {
                            var4 -= 2;
                            int var225 = field398[var4];
                            int var226 = field398[var4 + 1];
                            field398[var4++] = var225 | 0x1 << var226;
                            continue;
                        }
                        if (var389 == 4009) {
                            var4 -= 2;
                            int var227 = field398[var4];
                            int var228 = field398[var4 + 1];
                            field398[var4++] = var227 & -1 - (0x1 << var228);
                            continue;
                        }
                        if (var389 == 4010) {
                            var4 -= 2;
                            int var229 = field398[var4];
                            int var230 = field398[var4 + 1];
                            field398[var4++] = (var229 & 0x1 << var230) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var389 == 4011) {
                            var4 -= 2;
                            int var231 = field398[var4];
                            int var232 = field398[var4 + 1];
                            field398[var4++] = var231 % var232;
                            continue;
                        }
                        if (var389 == 4012) {
                            var4 -= 2;
                            int var233 = field398[var4];
                            int var234 = field398[var4 + 1];
                            if (var233 == 0) {
                                field398[var4++] = 0;
                            } else {
                                field398[var4++] = (int) Math.pow((double) var233, (double) var234);
                            }
                            continue;
                        }
                        if (var389 == 4013) {
                            var4 -= 2;
                            int var235 = field398[var4];
                            int var236 = field398[var4 + 1];
                            if (var235 == 0) {
                                field398[var4++] = 0;
                            } else if (var236 == 0) {
                                field398[var4++] = Integer.MAX_VALUE;
                            } else {
                                field398[var4++] = (int) Math.pow((double) var235, 1.0D / (double) var236);
                            }
                            continue;
                        }
                        if (var389 == 4014) {
                            var4 -= 2;
                            int var237 = field398[var4];
                            int var238 = field398[var4 + 1];
                            field398[var4++] = var237 & var238;
                            continue;
                        }
                        if (var389 == 4015) {
                            var4 -= 2;
                            int var239 = field398[var4];
                            int var240 = field398[var4 + 1];
                            field398[var4++] = var239 | var240;
                            continue;
                        }
                    } else if (var389 < 4200) {
                        if (var389 == 4100) {
                            var5--;
                            String var241 = field409[var5];
                            var4--;
                            int var242 = field398[var4];
                            field409[var5++] = var241 + var242;
                            continue;
                        }
                        if (var389 == 4101) {
                            var5 -= 2;
                            String var243 = field409[var5];
                            String var244 = field409[var5 + 1];
                            field409[var5++] = var243 + var244;
                            continue;
                        }
                        if (var389 == 4102) {
                            var5--;
                            String var245 = field409[var5];
                            var4--;
                            int var246 = field398[var4];
                            String[] var247 = field409;
                            int var248 = var5++;
                            String var250;
                            if (var246 < 0) {
                                var250 = Integer.toString(var246);
                            } else {
                                var250 = class147.method35(var246, 10, true);
                            }
                            var247[var248] = var245 + var250;
                            continue;
                        }
                        if (var389 == 4103) {
                            var5--;
                            String var251 = field409[var5];
                            field409[var5++] = var251.toLowerCase();
                            continue;
                        }
                        if (var389 == 4104) {
                            var4--;
                            int var252 = field398[var4];
                            long var253 = ((long) var252 + 11745L) * 86400000L;
                            field403.setTime(new Date(var253));
                            int var255 = field403.get(5);
                            int var256 = field403.get(2);
                            int var257 = field403.get(1);
                            field409[var5++] = var255 + "-" + field404[var256] + "-" + var257;
                            continue;
                        }
                        if (var389 == 4105) {
                            var5 -= 2;
                            String var258 = field409[var5];
                            String var259 = field409[var5 + 1];
                            if (Statics.field2006.field35 != null && Statics.field2006.field35.field2726) {
                                field409[var5++] = var259;
                                continue;
                            }
                            field409[var5++] = var258;
                            continue;
                        }
                        if (var389 == 4106) {
                            var4--;
                            int var260 = field398[var4];
                            field409[var5++] = Integer.toString(var260);
                            continue;
                        }
                        if (var389 == 4107) {
                            var5 -= 2;
                            int[] var261 = field398;
                            int var262 = var4++;
                            String var263 = field409[var5];
                            String var264 = field409[var5 + 1];
                            int var265 = client.field478;
                            int var266 = var263.length();
                            int var267 = var264.length();
                            int var268 = 0;
                            int var269 = 0;
                            char var270 = 0;
                            char var271 = 0;
                            int var272;
                            label2162: while (true) {
                                if (var268 - var270 >= var266 && var269 - var271 >= var267) {
                                    int var281 = Math.min(var266, var267);
                                    for (int var282 = 0; var282 < var281; var282++) {
                                        char var285 = var263.charAt(var282);
                                        char var286 = var264.charAt(var282);
                                        if (var285 != var286 && Character.toUpperCase(var285) != Character.toUpperCase(var286)) {
                                            char var287 = Character.toLowerCase(var285);
                                            char var288 = Character.toLowerCase(var286);
                                            if (var287 != var288) {
                                                var272 = class150.method46(var287, var265) - class150.method46(var288, var265);
                                                break label2162;
                                            }
                                        }
                                    }
                                    int var289 = var266 - var267;
                                    if (var289 == 0) {
                                        for (int var290 = 0; var290 < var281; var290++) {
                                            char var291 = var263.charAt(var290);
                                            char var292 = var264.charAt(var290);
                                            if (var291 != var292) {
                                                var272 = class150.method46(var291, var265) - class150.method46(var292, var265);
                                                break label2162;
                                            }
                                        }
                                        var272 = 0;
                                    } else {
                                        var272 = var289;
                                    }
                                    break;
                                }
                                if (var268 - var270 >= var266) {
                                    var272 = -1;
                                    break;
                                }
                                if (var269 - var271 >= var267) {
                                    var272 = 1;
                                    break;
                                }
                                char var273;
                                if (var270 == 0) {
                                    var273 = var263.charAt(var268++);
                                } else {
                                    var273 = var270;
                                    boolean var274 = false;
                                }
                                char var275;
                                if (var271 == 0) {
                                    var275 = var264.charAt(var269++);
                                } else {
                                    var275 = var271;
                                    boolean var276 = false;
                                }
                                var270 = class150.method2245(var273);
                                var271 = class150.method2245(var275);
                                char var277 = class150.method1306(var273, var265);
                                char var278 = class150.method1306(var275, var265);
                                if (var277 != var278 && Character.toUpperCase(var277) != Character.toUpperCase(var278)) {
                                    char var279 = Character.toLowerCase(var277);
                                    char var280 = Character.toLowerCase(var278);
                                    if (var279 != var280) {
                                        var272 = class150.method46(var279, var265) - class150.method46(var280, var265);
                                        break;
                                    }
                                }
                            }
                            byte var294;
                            if (var272 > 0) {
                                var294 = 1;
                            } else if (var272 < 0) {
                                var294 = -1;
                            } else {
                                var294 = 0;
                            }
                            var261[var262] = var294;
                            continue;
                        }
                        if (var389 == 4108) {
                            var5--;
                            String var295 = field409[var5];
                            var4 -= 2;
                            int var296 = field398[var4];
                            int var297 = field398[var4 + 1];
                            byte[] var298 = Statics.field198.method3049(var297, 0);
                            class183 var299 = new class183(var298);
                            field398[var4++] = var299.method3468(var295, var296);
                            continue;
                        }
                        if (var389 == 4109) {
                            var5--;
                            String var300 = field409[var5];
                            var4 -= 2;
                            int var301 = field398[var4];
                            int var302 = field398[var4 + 1];
                            byte[] var303 = Statics.field198.method3049(var302, 0);
                            class183 var304 = new class183(var303);
                            field398[var4++] = var304.method3399(var300, var301);
                            continue;
                        }
                        if (var389 == 4110) {
                            var5 -= 2;
                            String var305 = field409[var5];
                            String var306 = field409[var5 + 1];
                            var4--;
                            if (field398[var4] == 1) {
                                field409[var5++] = var305;
                            } else {
                                field409[var5++] = var306;
                            }
                            continue;
                        }
                        if (var389 == 4111) {
                            var5--;
                            String var307 = field409[var5];
                            field409[var5++] = class185.method3401(var307);
                            continue;
                        }
                        if (var389 == 4112) {
                            var5--;
                            String var308 = field409[var5];
                            var4--;
                            int var309 = field398[var4];
                            field409[var5++] = var308 + (char) var309;
                            continue;
                        }
                        if (var389 == 4113) {
                            var4--;
                            int var310 = field398[var4];
                            int[] var311 = field398;
                            int var312 = var4++;
                            char var313 = (char) var310;
                            boolean var314;
                            if (var313 >= ' ' && var313 <= '~') {
                                var314 = true;
                            } else if (var313 >= 160 && var313 <= 255) {
                                var314 = true;
                            } else if (var313 == 8364 || var313 == 338 || var313 == 8212 || var313 == 339 || var313 == 376) {
                                var314 = true;
                            } else {
                                var314 = false;
                            }
                            var311[var312] = var314 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 4114) {
                            var4--;
                            int var315 = field398[var4];
                            field398[var4++] = class147.method3080((char) var315) ? 1 : 0;
                            continue;
                        }
                        if (var389 == 4115) {
                            var4--;
                            int var316 = field398[var4];
                            int[] var317 = field398;
                            int var318 = var4++;
                            char var319 = (char) var316;
                            boolean var320 = var319 >= 'A' && var319 <= 'Z' || var319 >= 'a' && var319 <= 'z';
                            var317[var318] = var320 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 4116) {
                            var4--;
                            int var321 = field398[var4];
                            int[] var322 = field398;
                            int var323 = var4++;
                            char var324 = (char) var321;
                            boolean var325 = var324 >= '0' && var324 <= '9';
                            var322[var323] = var325 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 4117) {
                            var5--;
                            String var326 = field409[var5];
                            if (var326 == null) {
                                field398[var4++] = 0;
                            } else {
                                field398[var4++] = var326.length();
                            }
                            continue;
                        }
                        if (var389 == 4118) {
                            var5--;
                            String var327 = field409[var5];
                            var4 -= 2;
                            int var328 = field398[var4];
                            int var329 = field398[var4 + 1];
                            field409[var5++] = var327.substring(var328, var329);
                            continue;
                        }
                        if (var389 == 4119) {
                            var5--;
                            String var330 = field409[var5];
                            StringBuilder var331 = new StringBuilder(var330.length());
                            boolean var332 = false;
                            for (int var333 = 0; var333 < var330.length(); var333++) {
                                char var334 = var330.charAt(var333);
                                if (var334 == '<') {
                                    var332 = true;
                                } else if (var334 == '>') {
                                    var332 = false;
                                } else if (!var332) {
                                    var331.append(var334);
                                }
                            }
                            field409[var5++] = var331.toString();
                            continue;
                        }
                        if (var389 == 4120) {
                            var5--;
                            String var335 = field409[var5];
                            var4--;
                            int var336 = field398[var4];
                            field398[var4++] = var335.indexOf(var336);
                            continue;
                        }
                    } else if (var389 < 4300) {
                        if (var389 == 4200) {
                            var4--;
                            int var337 = field398[var4];
                            field409[var5++] = class40.method730(var337).field994;
                            continue;
                        }
                        if (var389 == 4201) {
                            var4 -= 2;
                            int var338 = field398[var4];
                            int var339 = field398[var4 + 1];
                            class40 var340 = class40.method730(var338);
                            if (var339 >= 1 && var339 <= 5 && var340.field1008[var339 - 1] != null) {
                                field409[var5++] = var340.field1008[var339 - 1];
                                continue;
                            }
                            field409[var5++] = "";
                            continue;
                        }
                        if (var389 == 4202) {
                            var4 -= 2;
                            int var341 = field398[var4];
                            int var342 = field398[var4 + 1];
                            class40 var343 = class40.method730(var341);
                            if (var342 >= 1 && var342 <= 5 && var343.field988[var342 - 1] != null) {
                                field409[var5++] = var343.field988[var342 - 1];
                                continue;
                            }
                            field409[var5++] = "";
                            continue;
                        }
                        if (var389 == 4203) {
                            var4--;
                            int var344 = field398[var4];
                            field398[var4++] = class40.method730(var344).field1006;
                            continue;
                        }
                        if (var389 == 4204) {
                            var4--;
                            int var345 = field398[var4];
                            field398[var4++] = class40.method730(var345).field1005 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 4205) {
                            var4--;
                            int var346 = field398[var4];
                            class40 var347 = class40.method730(var346);
                            if (var347.field1025 == -1 && var347.field993 >= 0) {
                                field398[var4++] = var347.field993;
                                continue;
                            }
                            field398[var4++] = var346;
                            continue;
                        }
                        if (var389 == 4206) {
                            var4--;
                            int var348 = field398[var4];
                            class40 var349 = class40.method730(var348);
                            if (var349.field1025 >= 0 && var349.field993 >= 0) {
                                field398[var4++] = var349.field993;
                                continue;
                            }
                            field398[var4++] = var348;
                            continue;
                        }
                        if (var389 == 4207) {
                            var4--;
                            int var350 = field398[var4];
                            field398[var4++] = class40.method730(var350).field1007 ? 1 : 0;
                            continue;
                        }
                    } else if (var389 < 5100) {
                        if (var389 == 5000) {
                            field398[var4++] = client.field692;
                            continue;
                        }
                        if (var389 == 5001) {
                            var4 -= 3;
                            client.field692 = field398[var4];
                            int var351 = field398[var4 + 1];
                            class137[] var352 = class137.method45();
                            int var353 = 0;
                            class137 var355;
                            while (true) {
                                if (var353 >= var352.length) {
                                    var355 = null;
                                    break;
                                }
                                class137 var354 = var352[var353];
                                if (var354.field2336 == var351) {
                                    var355 = var354;
                                    break;
                                }
                                var353++;
                            }
                            Statics.field234 = var355;
                            if (Statics.field234 == null) {
                                Statics.field234 = class137.field2334;
                            }
                            client.field693 = field398[var4 + 2];
                            client.field512.method2356(71);
                            client.field512.method2474(client.field692);
                            client.field512.method2474(Statics.field234.field2336);
                            client.field512.method2474(client.field693);
                            continue;
                        }
                        if (var389 == 5002) {
                            var5--;
                            String var356 = field409[var5];
                            var4 -= 2;
                            int var357 = field398[var4];
                            int var358 = field398[var4 + 1];
                            client.field512.method2356(212);
                            class116 var359 = client.field512;
                            int var360 = var356.length() + 1;
                            var359.method2474(var360 + 2);
                            client.field512.method2479(var356);
                            client.field512.method2474(var357 - 1);
                            client.field512.method2474(var358);
                            continue;
                        }
                        if (var389 == 5003) {
                            var4--;
                            int var361 = field398[var4];
                            String var362 = null;
                            if (var361 < 100) {
                                var362 = client.field689[var361];
                            }
                            if (var362 == null) {
                                var362 = "";
                            }
                            field409[var5++] = var362;
                            continue;
                        }
                        if (var389 == 5004) {
                            var4--;
                            int var363 = field398[var4];
                            int var364 = -1;
                            if (var363 < 100 && client.field689[var363] != null) {
                                var364 = client.field686[var363];
                            }
                            field398[var4++] = var364;
                            continue;
                        }
                        if (var389 == 5005) {
                            if (Statics.field234 == null) {
                                field398[var4++] = -1;
                            } else {
                                field398[var4++] = Statics.field234.field2336;
                            }
                            continue;
                        }
                        if (var389 == 5008) {
                            var5--;
                            String var365 = field409[var5];
                            if (var365.startsWith("::")) {
                                client.method2074(var365);
                            } else {
                                String var366 = var365.toLowerCase();
                                byte var367 = 0;
                                if (var366.startsWith(class134.field2255)) {
                                    var367 = 0;
                                    var365 = var365.substring(class134.field2255.length());
                                } else if (var366.startsWith(class134.field2257)) {
                                    var367 = 1;
                                    var365 = var365.substring(class134.field2257.length());
                                } else if (var366.startsWith(class134.field2180)) {
                                    var367 = 2;
                                    var365 = var365.substring(class134.field2180.length());
                                } else if (var366.startsWith(class134.field2090)) {
                                    var367 = 3;
                                    var365 = var365.substring(class134.field2090.length());
                                } else if (var366.startsWith(class134.field2263)) {
                                    var367 = 4;
                                    var365 = var365.substring(class134.field2263.length());
                                } else if (var366.startsWith(class134.field2112)) {
                                    var367 = 5;
                                    var365 = var365.substring(class134.field2112.length());
                                } else if (var366.startsWith(class134.field2267)) {
                                    var367 = 6;
                                    var365 = var365.substring(class134.field2267.length());
                                } else if (var366.startsWith(class134.field2269)) {
                                    var367 = 7;
                                    var365 = var365.substring(class134.field2269.length());
                                } else if (var366.startsWith(class134.field2271)) {
                                    var367 = 8;
                                    var365 = var365.substring(class134.field2271.length());
                                } else if (var366.startsWith(class134.field2285)) {
                                    var367 = 9;
                                    var365 = var365.substring(class134.field2285.length());
                                } else if (var366.startsWith(class134.field2236)) {
                                    var367 = 10;
                                    var365 = var365.substring(class134.field2236.length());
                                } else if (var366.startsWith(class134.field2234)) {
                                    var367 = 11;
                                    var365 = var365.substring(class134.field2234.length());
                                } else if (client.field478 != 0) {
                                    if (var366.startsWith(class134.field2256)) {
                                        var367 = 0;
                                        var365 = var365.substring(class134.field2256.length());
                                    } else if (var366.startsWith(class134.field2258)) {
                                        var367 = 1;
                                        var365 = var365.substring(class134.field2258.length());
                                    } else if (var366.startsWith(class134.field2260)) {
                                        var367 = 2;
                                        var365 = var365.substring(class134.field2260.length());
                                    } else if (var366.startsWith(class134.field2262)) {
                                        var367 = 3;
                                        var365 = var365.substring(class134.field2262.length());
                                    } else if (var366.startsWith(class134.field2264)) {
                                        var367 = 4;
                                        var365 = var365.substring(class134.field2264.length());
                                    } else if (var366.startsWith(class134.field2266)) {
                                        var367 = 5;
                                        var365 = var365.substring(class134.field2266.length());
                                    } else if (var366.startsWith(class134.field2160)) {
                                        var367 = 6;
                                        var365 = var365.substring(class134.field2160.length());
                                    } else if (var366.startsWith(class134.field2243)) {
                                        var367 = 7;
                                        var365 = var365.substring(class134.field2243.length());
                                    } else if (var366.startsWith(class134.field2132)) {
                                        var367 = 8;
                                        var365 = var365.substring(class134.field2132.length());
                                    } else if (var366.startsWith(class134.field2274)) {
                                        var367 = 9;
                                        var365 = var365.substring(class134.field2274.length());
                                    } else if (var366.startsWith(class134.field2276)) {
                                        var367 = 10;
                                        var365 = var365.substring(class134.field2276.length());
                                    } else if (var366.startsWith(class134.field2278)) {
                                        var367 = 11;
                                        var365 = var365.substring(class134.field2278.length());
                                    }
                                }
                                String var368 = var365.toLowerCase();
                                byte var369 = 0;
                                if (var368.startsWith(class134.field2279)) {
                                    var369 = 1;
                                    var365 = var365.substring(class134.field2279.length());
                                } else if (var368.startsWith(class134.field2281)) {
                                    var369 = 2;
                                    var365 = var365.substring(class134.field2281.length());
                                } else if (var368.startsWith(class134.field2283)) {
                                    var369 = 3;
                                    var365 = var365.substring(class134.field2283.length());
                                } else if (var368.startsWith(class134.field2170)) {
                                    var369 = 4;
                                    var365 = var365.substring(class134.field2170.length());
                                } else if (var368.startsWith(class134.field2287)) {
                                    var369 = 5;
                                    var365 = var365.substring(class134.field2287.length());
                                } else if (client.field478 != 0) {
                                    if (var368.startsWith(class134.field2280)) {
                                        var369 = 1;
                                        var365 = var365.substring(class134.field2280.length());
                                    } else if (var368.startsWith(class134.field2282)) {
                                        var369 = 2;
                                        var365 = var365.substring(class134.field2282.length());
                                    } else if (var368.startsWith(class134.field2284)) {
                                        var369 = 3;
                                        var365 = var365.substring(class134.field2284.length());
                                    } else if (var368.startsWith(class134.field2286)) {
                                        var369 = 4;
                                        var365 = var365.substring(class134.field2286.length());
                                    } else if (var368.startsWith(class134.field2288)) {
                                        var369 = 5;
                                        var365 = var365.substring(class134.field2288.length());
                                    }
                                }
                                client.field512.method2356(73);
                                client.field512.method2474(0);
                                int var370 = client.field512.field2038;
                                client.field512.method2474(var367);
                                client.field512.method2474(var369);
                                class116 var371 = client.field512;
                                int var372 = var371.field2038;
                                byte[] var373 = class149.method816(var365);
                                var371.method2486(var373.length);
                                var371.field2038 += Statics.field2834.method2411(var373, 0, var373.length, var371.field2037, var371.field2038);
                                client.field512.method2485(client.field512.field2038 - var370);
                            }
                            continue;
                        }
                        if (var389 == 5009) {
                            var5 -= 2;
                            String var374 = field409[var5];
                            String var375 = field409[var5 + 1];
                            client.field512.method2356(173);
                            client.field512.method2475(0);
                            int var376 = client.field512.field2038;
                            client.field512.method2479(var374);
                            class116 var377 = client.field512;
                            int var378 = var377.field2038;
                            byte[] var379 = class149.method816(var375);
                            var377.method2486(var379.length);
                            var377.field2038 += Statics.field2834.method2411(var379, 0, var379.length, var377.field2037, var377.field2038);
                            client.field512.method2484(client.field512.field2038 - var376);
                            continue;
                        }
                        if (var389 == 5010) {
                            var4--;
                            int var380 = field398[var4];
                            String var381 = null;
                            if (var380 < 100) {
                                var381 = client.field687[var380];
                            }
                            if (var381 == null) {
                                var381 = "";
                            }
                            field409[var5++] = var381;
                            continue;
                        }
                        if (var389 == 5011) {
                            var4--;
                            int var382 = field398[var4];
                            String var383 = null;
                            if (var382 < 100) {
                                var383 = client.field688[var382];
                            }
                            if (var383 == null) {
                                var383 = "";
                            }
                            field409[var5++] = var383;
                            continue;
                        }
                        if (var389 == 5015) {
                            String var384;
                            if (Statics.field2006 == null || Statics.field2006.field40 == null) {
                                var384 = "";
                            } else {
                                var384 = Statics.field2006.field40;
                            }
                            field409[var5++] = var384;
                            continue;
                        }
                        if (var389 == 5016) {
                            field398[var4++] = client.field693;
                            continue;
                        }
                        if (var389 == 5017) {
                            field398[var4++] = client.field485;
                            continue;
                        }
                    }
                } else {
                    class158 var70;
                    if (var389 >= 2000) {
                        var389 -= 1000;
                        var4--;
                        var70 = class158.method667(field398[var4]);
                    } else {
                        var70 = var47 ? Statics.field1271 : Statics.field394;
                    }
                    if (var389 == 1300) {
                        var4--;
                        int var71 = field398[var4] - 1;
                        if (var71 >= 0 && var71 <= 9) {
                            var5--;
                            var70.method3125(var71, field409[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var389 == 1301) {
                        var4 -= 2;
                        int var72 = field398[var4];
                        int var73 = field398[var4 + 1];
                        var70.field2646 = class158.method3104(var72, var73);
                        continue;
                    }
                    if (var389 == 1302) {
                        var4--;
                        var70.field2649 = field398[var4] == 1;
                        continue;
                    }
                    if (var389 == 1303) {
                        var4--;
                        var70.field2647 = field398[var4];
                        continue;
                    }
                    if (var389 == 1304) {
                        var4--;
                        var70.field2648 = field398[var4];
                        continue;
                    }
                    if (var389 == 1305) {
                        var5--;
                        var70.field2644 = field409[var5];
                        continue;
                    }
                    if (var389 == 1306) {
                        var5--;
                        var70.field2650 = field409[var5];
                        continue;
                    }
                    if (var389 == 1307) {
                        var70.field2641 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var388) {
            StringBuilder var386 = new StringBuilder(30);
            var386.append("").append(var3.field2820).append(" ");
            for (int var387 = field400 - 1; var387 >= 0; var387--) {
                var386.append("").append(field402[var387].field265.field2820).append(" ");
            }
            var386.append("").append(var9);
            class80.method1379(var386.toString(), var388);
        }
    }

    @ObfuscatedName("ad.i(IB)V")
    public static void method683(int arg0) {
        if (arg0 == -1 || !class158.method2227(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2608[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3.field2633 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field1 = var3.field2633;
                method916(var4);
            }
        }
    }
}
