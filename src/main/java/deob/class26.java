package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("e")
public class class26 {

    @ObfuscatedName("e.d")
    public static int[] field415 = new int[5];

    @ObfuscatedName("e.b")
    public static int[][] field418 = new int[5][5000];

    @ObfuscatedName("e.i")
    public static int[] field426 = new int[1000];

    @ObfuscatedName("e.p")
    public static String[] field420 = new String[1000];

    @ObfuscatedName("e.y")
    public static int field421 = 0;

    @ObfuscatedName("e.u")
    public static class18[] field422 = new class18[50];

    @ObfuscatedName("e.h")
    public static Calendar field423 = Calendar.getInstance();

    @ObfuscatedName("e.x")
    public static final String[] field424 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.t(Lt;I)V")
    public static void method227(class1 arg0) {
        Object[] var1 = arg0.field18;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method146(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field74;
        int[] var8 = var3.field75;
        byte var9 = -1;
        field421 = 0;
        try {
            Statics.field419 = new int[var3.field77];
            int var10 = 0;
            Statics.field416 = new String[var3.field80];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field8;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field4;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2592;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field21;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2593;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field16 == null ? -1 : arg0.field16.field2592;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field16 == null ? -1 : arg0.field16.field2593;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field6;
                    }
                    Statics.field419[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field416[var11++] = var14;
                }
            }
            int var15 = 0;
            label2414: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var389 = var7[var6];
                if (var389 < 100) {
                    if (var389 == 0) {
                        field426[var4++] = var8[var6];
                        continue;
                    }
                    if (var389 == 1) {
                        int var16 = var8[var6];
                        field426[var4++] = class159.field2713[var16];
                        continue;
                    }
                    if (var389 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class159.field2713[var17] = field426[var4];
                        continue;
                    }
                    if (var389 == 3) {
                        field420[var5++] = var3.field76[var6];
                        continue;
                    }
                    if (var389 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var389 == 7) {
                        var4 -= 2;
                        if (field426[var4 + 1] != field426[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var389 == 8) {
                        var4 -= 2;
                        if (field426[var4 + 1] == field426[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var389 == 9) {
                        var4 -= 2;
                        if (field426[var4] < field426[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var389 == 10) {
                        var4 -= 2;
                        if (field426[var4] > field426[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var389 == 21) {
                        if (field421 == 0) {
                            return;
                        }
                        class18 var18 = field422[--field421];
                        var3 = var18.field278;
                        var7 = var3.field74;
                        var8 = var3.field75;
                        var6 = var18.field279;
                        Statics.field419 = var18.field280;
                        Statics.field416 = var18.field289;
                        continue;
                    }
                    if (var389 == 25) {
                        int var19 = var8[var6];
                        field426[var4++] = class159.method2232(var19);
                        continue;
                    }
                    if (var389 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field426[var4];
                        class38 var22 = class38.method43(var20);
                        int var23 = var22.field980;
                        int var24 = var22.field974;
                        int var25 = var22.field978;
                        int var26 = class159.field2712[var25 - var24];
                        if (var21 < 0 || var21 > var26) {
                            var21 = 0;
                        }
                        int var27 = var26 << var24;
                        class159.field2713[var23] = class159.field2713[var23] & ~var27 | var21 << var24 & var27;
                        continue;
                    }
                    if (var389 == 31) {
                        var4 -= 2;
                        if (field426[var4] <= field426[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var389 == 32) {
                        var4 -= 2;
                        if (field426[var4] >= field426[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var389 == 33) {
                        field426[var4++] = Statics.field419[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var389 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field419[var10001] = field426[var4];
                        continue;
                    }
                    if (var389 == 35) {
                        field420[var5++] = Statics.field416[var8[var6]];
                        continue;
                    }
                    if (var389 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field416[var10001] = field420[var5];
                        continue;
                    }
                    if (var389 == 37) {
                        int var28 = var8[var6];
                        var5 -= var28;
                        String var29 = class147.method3171(field420, var5, var28);
                        field420[var5++] = var29;
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
                        class5 var31 = class5.method146(var30);
                        int[] var32 = new int[var31.field77];
                        String[] var33 = new String[var31.field80];
                        for (int var34 = 0; var34 < var31.field84; var34++) {
                            var32[var34] = field426[var4 - var31.field84 + var34];
                        }
                        for (int var35 = 0; var35 < var31.field78; var35++) {
                            var33[var35] = field420[var5 - var31.field78 + var35];
                        }
                        var4 -= var31.field84;
                        var5 -= var31.field78;
                        class18 var36 = new class18();
                        var36.field278 = var3;
                        var36.field279 = var6;
                        var36.field280 = Statics.field419;
                        var36.field289 = Statics.field416;
                        field422[++field421 - 1] = var36;
                        var3 = var31;
                        var7 = var31.field74;
                        var8 = var31.field75;
                        var6 = -1;
                        Statics.field419 = var32;
                        Statics.field416 = var33;
                        continue;
                    }
                    if (var389 == 42) {
                        field426[var4++] = client.field690[var8[var6]];
                        continue;
                    }
                    if (var389 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field690[var10001] = field426[var4];
                        continue;
                    }
                    if (var389 == 44) {
                        int var37 = var8[var6] >> 16;
                        int var38 = var8[var6] & 0xFFFF;
                        var4--;
                        int var39 = field426[var4];
                        if (var39 >= 0 && var39 <= 5000) {
                            field415[var37] = var39;
                            byte var40 = -1;
                            if (var38 == 105) {
                                var40 = 0;
                            }
                            int var41 = 0;
                            while (true) {
                                if (var41 >= var39) {
                                    continue label2414;
                                }
                                field418[var37][var41] = var40;
                                var41++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var389 == 45) {
                        int var42 = var8[var6];
                        var4--;
                        int var43 = field426[var4];
                        if (var43 >= 0 && var43 < field415[var42]) {
                            field426[var4++] = field418[var42][var43];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var389 == 46) {
                        int var44 = var8[var6];
                        var4 -= 2;
                        int var45 = field426[var4];
                        if (var45 >= 0 && var45 < field415[var44]) {
                            field418[var44][var45] = field426[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var389 == 47) {
                        String var46 = client.field691[var8[var6]];
                        if (var46 == null) {
                            var46 = "null";
                        }
                        field420[var5++] = var46;
                        continue;
                    }
                    if (var389 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field691[var10001] = field420[var5];
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
                        int var48 = field426[var4];
                        int var49 = field426[var4 + 1];
                        int var50 = field426[var4 + 2];
                        if (var49 == 0) {
                            throw new RuntimeException();
                        }
                        class158 var51 = class158.method44(var48);
                        if (var51.field2700 == null) {
                            var51.field2700 = new class158[var50 + 1];
                        }
                        if (var51.field2700.length <= var50) {
                            class158[] var52 = new class158[var50 + 1];
                            for (int var53 = 0; var53 < var51.field2700.length; var53++) {
                                var52[var53] = var51.field2700[var53];
                            }
                            var51.field2700 = var52;
                        }
                        if (var50 > 0 && var51.field2700[var50 - 1] == null) {
                            throw new RuntimeException("" + (var50 - 1));
                        }
                        class158 var54 = new class158();
                        var54.field2612 = var49;
                        var54.field2603 = var54.field2592 = var51.field2592;
                        var54.field2593 = var50;
                        var54.field2660 = true;
                        var51.field2700[var50] = var54;
                        if (var47) {
                            Statics.field277 = var54;
                        } else {
                            Statics.field404 = var54;
                        }
                        client.method2840(var51);
                        continue;
                    }
                    if (var389 == 101) {
                        class158 var55 = var47 ? Statics.field277 : Statics.field404;
                        class158 var56 = class158.method44(var55.field2592);
                        var56.field2700[var55.field2593] = null;
                        client.method2840(var56);
                        continue;
                    }
                    if (var389 == 102) {
                        var4--;
                        class158 var57 = class158.method44(field426[var4]);
                        var57.field2700 = null;
                        client.method2840(var57);
                        continue;
                    }
                    if (var389 == 200) {
                        var4 -= 2;
                        int var58 = field426[var4];
                        int var59 = field426[var4 + 1];
                        class158 var60 = class158.method140(var58, var59);
                        if (var60 != null && var59 != -1) {
                            field426[var4++] = 1;
                            if (var47) {
                                Statics.field277 = var60;
                            } else {
                                Statics.field404 = var60;
                            }
                            continue;
                        }
                        field426[var4++] = 0;
                        continue;
                    }
                } else if (!(var389 < 1000 || var389 >= 1100) || !(var389 < 2000 || var389 >= 2100)) {
                    class158 var61;
                    if (var389 >= 2000) {
                        var389 -= 1000;
                        var4--;
                        var61 = class158.method44(field426[var4]);
                    } else {
                        var61 = var47 ? Statics.field277 : Statics.field404;
                    }
                    if (var389 == 1000) {
                        var4 -= 2;
                        var61.field2597 = field426[var4];
                        var61.field2598 = field426[var4 + 1];
                        client.method2840(var61);
                        continue;
                    }
                    if (var389 == 1001) {
                        var4 -= 2;
                        var61.field2601 = field426[var4];
                        var61.field2650 = field426[var4 + 1];
                        client.method2840(var61);
                        continue;
                    }
                    if (var389 == 1003) {
                        var4--;
                        boolean var62 = field426[var4] == 1;
                        if (var61.field2604 != var62) {
                            var61.field2604 = var62;
                            client.method2840(var61);
                        }
                        continue;
                    }
                } else if (!(var389 < 1100 || var389 >= 1200) || !(var389 < 2100 || var389 >= 2200)) {
                    class158 var63;
                    if (var389 >= 2000) {
                        var389 -= 1000;
                        var4--;
                        var63 = class158.method44(field426[var4]);
                    } else {
                        var63 = var47 ? Statics.field277 : Statics.field404;
                    }
                    if (var389 == 1100) {
                        var4 -= 2;
                        var63.field2605 = field426[var4];
                        if (var63.field2605 > var63.field2691 - var63.field2601) {
                            var63.field2605 = var63.field2691 - var63.field2601;
                        }
                        if (var63.field2605 < 0) {
                            var63.field2605 = 0;
                        }
                        var63.field2587 = field426[var4 + 1];
                        if (var63.field2587 > var63.field2588 - var63.field2650) {
                            var63.field2587 = var63.field2588 - var63.field2650;
                        }
                        if (var63.field2587 < 0) {
                            var63.field2587 = 0;
                        }
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1101) {
                        var4--;
                        var63.field2609 = field426[var4];
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1102) {
                        var4--;
                        var63.field2663 = field426[var4] == 1;
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1103) {
                        var4--;
                        var63.field2614 = field426[var4];
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1104) {
                        var4--;
                        var63.field2615 = field426[var4];
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1105) {
                        var4--;
                        var63.field2690 = field426[var4];
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1106) {
                        var4--;
                        var63.field2618 = field426[var4];
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1107) {
                        var4--;
                        var63.field2619 = field426[var4] == 1;
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1108) {
                        var63.field2624 = 1;
                        var4--;
                        var63.field2596 = field426[var4];
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1109) {
                        var4 -= 6;
                        var63.field2652 = field426[var4];
                        var63.field2695 = field426[var4 + 1];
                        var63.field2632 = field426[var4 + 2];
                        var63.field2633 = field426[var4 + 3];
                        var63.field2634 = field426[var4 + 4];
                        var63.field2655 = field426[var4 + 5];
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1110) {
                        var4--;
                        int var64 = field426[var4];
                        if (var63.field2628 != var64) {
                            var63.field2628 = var64;
                            var63.field2698 = 0;
                            var63.field2699 = 0;
                            client.method2840(var63);
                        }
                        continue;
                    }
                    if (var389 == 1111) {
                        var4--;
                        var63.field2683 = field426[var4] == 1;
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1112) {
                        var5--;
                        String var65 = field420[var5];
                        if (!var65.equals(var63.field2639)) {
                            var63.field2639 = var65;
                            client.method2840(var63);
                        }
                        continue;
                    }
                    if (var389 == 1113) {
                        var4--;
                        var63.field2638 = field426[var4];
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1114) {
                        var4 -= 3;
                        var63.field2642 = field426[var4];
                        var63.field2661 = field426[var4 + 1];
                        var63.field2647 = field426[var4 + 2];
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1115) {
                        var4--;
                        var63.field2644 = field426[var4] == 1;
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1116) {
                        var4--;
                        var63.field2620 = field426[var4];
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1117) {
                        var4--;
                        var63.field2602 = field426[var4];
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1118) {
                        var4--;
                        var63.field2622 = field426[var4] == 1;
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1119) {
                        var4--;
                        var63.field2623 = field426[var4] == 1;
                        client.method2840(var63);
                        continue;
                    }
                    if (var389 == 1120) {
                        var4 -= 2;
                        var63.field2691 = field426[var4];
                        var63.field2588 = field426[var4 + 1];
                        client.method2840(var63);
                        continue;
                    }
                } else if (!(var389 < 1200 || var389 >= 1300) || !(var389 < 2200 || var389 >= 2300)) {
                    class158 var66;
                    if (var389 >= 2000) {
                        var389 -= 1000;
                        var4--;
                        var66 = class158.method44(field426[var4]);
                    } else {
                        var66 = var47 ? Statics.field277 : Statics.field404;
                    }
                    client.method2840(var66);
                    if (var389 == 1200) {
                        var4 -= 2;
                        int var67 = field426[var4];
                        int var68 = field426[var4 + 1];
                        var66.field2696 = var67;
                        var66.field2697 = var68;
                        class40 var69 = class40.method119(var67);
                        var66.field2632 = var69.field1019;
                        var66.field2633 = var69.field1020;
                        var66.field2634 = var69.field1021;
                        var66.field2652 = var69.field1022;
                        var66.field2695 = var69.field1035;
                        var66.field2655 = var69.field1040;
                        if (var66.field2601 > 0) {
                            var66.field2655 = var66.field2655 * 32 / var66.field2601;
                        }
                        continue;
                    }
                    if (var389 == 1201) {
                        var66.field2624 = 2;
                        var4--;
                        var66.field2596 = field426[var4];
                        continue;
                    }
                    if (var389 == 1202) {
                        var66.field2624 = 3;
                        var66.field2596 = Statics.field1431.field37.method3193();
                        continue;
                    }
                } else if ((var389 < 1300 || var389 >= 1400) && (var389 < 2300 || var389 >= 2400)) {
                    if (var389 >= 1400 && var389 < 1500 || var389 >= 2400 && var389 < 2500) {
                        class158 var74;
                        if (var389 >= 2000) {
                            var389 -= 1000;
                            var4--;
                            var74 = class158.method44(field426[var4]);
                        } else {
                            var74 = var47 ? Statics.field277 : Statics.field404;
                        }
                        var5--;
                        String var75 = field420[var5];
                        int[] var76 = null;
                        if (var75.length() > 0 && var75.charAt(var75.length() - 1) == 'Y') {
                            var4--;
                            int var77 = field426[var4];
                            if (var77 > 0) {
                                var76 = new int[var77];
                                while (var77-- > 0) {
                                    var4--;
                                    var76[var77] = field426[var4];
                                }
                            }
                            var75 = var75.substring(0, var75.length() - 1);
                        }
                        Object[] var78 = new Object[var75.length() + 1];
                        for (int var79 = var78.length - 1; var79 >= 1; var79--) {
                            if (var75.charAt(var79 - 1) == 's') {
                                var5--;
                                var78[var79] = field420[var5];
                            } else {
                                var4--;
                                var78[var79] = Integer.valueOf(field426[var4]);
                            }
                        }
                        var4--;
                        int var80 = field426[var4];
                        if (var80 == -1) {
                            var78 = null;
                        } else {
                            var78[0] = Integer.valueOf(var80);
                        }
                        if (var389 == 1400) {
                            var74.field2709 = var78;
                        }
                        if (var389 == 1401) {
                            var74.field2664 = var78;
                        }
                        if (var389 == 1402) {
                            var74.field2607 = var78;
                        }
                        if (var389 == 1403) {
                            var74.field2665 = var78;
                        }
                        if (var389 == 1404) {
                            var74.field2667 = var78;
                        }
                        if (var389 == 1405) {
                            var74.field2668 = var78;
                        }
                        if (var389 == 1406) {
                            var74.field2616 = var78;
                        }
                        if (var389 == 1407) {
                            var74.field2672 = var78;
                            var74.field2673 = var76;
                        }
                        if (var389 == 1408) {
                            var74.field2674 = var78;
                        }
                        if (var389 == 1409) {
                            var74.field2679 = var78;
                        }
                        if (var389 == 1410) {
                            var74.field2669 = var78;
                        }
                        if (var389 == 1411) {
                            var74.field2662 = var78;
                        }
                        if (var389 == 1412) {
                            var74.field2666 = var78;
                        }
                        if (var389 == 1414) {
                            var74.field2610 = var78;
                            var74.field2594 = var76;
                        }
                        if (var389 == 1415) {
                            var74.field2676 = var78;
                            var74.field2677 = var76;
                        }
                        if (var389 == 1416) {
                            var74.field2670 = var78;
                        }
                        if (var389 == 1417) {
                            var74.field2680 = var78;
                        }
                        if (var389 == 1418) {
                            var74.field2681 = var78;
                        }
                        if (var389 == 1419) {
                            var74.field2682 = var78;
                        }
                        if (var389 == 1420) {
                            var74.field2606 = var78;
                        }
                        if (var389 == 1421) {
                            var74.field2684 = var78;
                        }
                        if (var389 == 1422) {
                            var74.field2705 = var78;
                        }
                        if (var389 == 1423) {
                            var74.field2686 = var78;
                        }
                        if (var389 == 1424) {
                            var74.field2687 = var78;
                        }
                        var74.field2659 = true;
                        continue;
                    }
                    if (var389 < 1600) {
                        class158 var81 = var47 ? Statics.field277 : Statics.field404;
                        if (var389 == 1500) {
                            field426[var4++] = var81.field2597;
                            continue;
                        }
                        if (var389 == 1501) {
                            field426[var4++] = var81.field2598;
                            continue;
                        }
                        if (var389 == 1502) {
                            field426[var4++] = var81.field2601;
                            continue;
                        }
                        if (var389 == 1503) {
                            field426[var4++] = var81.field2650;
                            continue;
                        }
                        if (var389 == 1504) {
                            field426[var4++] = var81.field2604 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 1505) {
                            field426[var4++] = var81.field2603;
                            continue;
                        }
                    } else if (var389 < 1700) {
                        class158 var82 = var47 ? Statics.field277 : Statics.field404;
                        if (var389 == 1600) {
                            field426[var4++] = var82.field2605;
                            continue;
                        }
                        if (var389 == 1601) {
                            field426[var4++] = var82.field2587;
                            continue;
                        }
                        if (var389 == 1602) {
                            field420[var5++] = var82.field2639;
                            continue;
                        }
                        if (var389 == 1603) {
                            field426[var4++] = var82.field2691;
                            continue;
                        }
                        if (var389 == 1604) {
                            field426[var4++] = var82.field2588;
                            continue;
                        }
                        if (var389 == 1605) {
                            field426[var4++] = var82.field2655;
                            continue;
                        }
                        if (var389 == 1606) {
                            field426[var4++] = var82.field2632;
                            continue;
                        }
                        if (var389 == 1607) {
                            field426[var4++] = var82.field2634;
                            continue;
                        }
                        if (var389 == 1608) {
                            field426[var4++] = var82.field2633;
                            continue;
                        }
                    } else if (var389 < 1800) {
                        class158 var83 = var47 ? Statics.field277 : Statics.field404;
                        if (var389 == 1700) {
                            field426[var4++] = var83.field2696;
                            continue;
                        }
                        if (var389 == 1701) {
                            if (var83.field2696 == -1) {
                                field426[var4++] = 0;
                            } else {
                                field426[var4++] = var83.field2697;
                            }
                            continue;
                        }
                        if (var389 == 1702) {
                            field426[var4++] = var83.field2593;
                            continue;
                        }
                    } else if (var389 < 1900) {
                        class158 var84 = var47 ? Statics.field277 : Statics.field404;
                        if (var389 == 1800) {
                            field426[var4++] = class162.method1532(client.method5(var84));
                            continue;
                        }
                        if (var389 == 1801) {
                            var4--;
                            int var85 = field426[var4];
                            int var390 = var85 - 1;
                            if (var84.field2653 != null && var390 < var84.field2653.length && var84.field2653[var390] != null) {
                                field420[var5++] = var84.field2653[var390];
                                continue;
                            }
                            field420[var5++] = "";
                            continue;
                        }
                        if (var389 == 1802) {
                            if (var84.field2630 == null) {
                                field420[var5++] = "";
                            } else {
                                field420[var5++] = var84.field2630;
                            }
                            continue;
                        }
                    } else if (var389 < 2600) {
                        var4--;
                        class158 var86 = class158.method44(field426[var4]);
                        if (var389 == 2500) {
                            field426[var4++] = var86.field2597;
                            continue;
                        }
                        if (var389 == 2501) {
                            field426[var4++] = var86.field2598;
                            continue;
                        }
                        if (var389 == 2502) {
                            field426[var4++] = var86.field2601;
                            continue;
                        }
                        if (var389 == 2503) {
                            field426[var4++] = var86.field2650;
                            continue;
                        }
                        if (var389 == 2504) {
                            field426[var4++] = var86.field2604 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 2505) {
                            field426[var4++] = var86.field2603;
                            continue;
                        }
                    } else if (var389 < 2700) {
                        var4--;
                        class158 var87 = class158.method44(field426[var4]);
                        if (var389 == 2600) {
                            field426[var4++] = var87.field2605;
                            continue;
                        }
                        if (var389 == 2601) {
                            field426[var4++] = var87.field2587;
                            continue;
                        }
                        if (var389 == 2602) {
                            field420[var5++] = var87.field2639;
                            continue;
                        }
                        if (var389 == 2603) {
                            field426[var4++] = var87.field2691;
                            continue;
                        }
                        if (var389 == 2604) {
                            field426[var4++] = var87.field2588;
                            continue;
                        }
                        if (var389 == 2605) {
                            field426[var4++] = var87.field2655;
                            continue;
                        }
                        if (var389 == 2606) {
                            field426[var4++] = var87.field2632;
                            continue;
                        }
                        if (var389 == 2607) {
                            field426[var4++] = var87.field2634;
                            continue;
                        }
                        if (var389 == 2608) {
                            field426[var4++] = var87.field2633;
                            continue;
                        }
                    } else if (var389 < 2800) {
                        if (var389 == 2700) {
                            var4--;
                            class158 var88 = class158.method44(field426[var4]);
                            field426[var4++] = var88.field2696;
                            continue;
                        }
                        if (var389 == 2701) {
                            var4--;
                            class158 var89 = class158.method44(field426[var4]);
                            if (var89.field2696 == -1) {
                                field426[var4++] = 0;
                            } else {
                                field426[var4++] = var89.field2697;
                            }
                            continue;
                        }
                        if (var389 == 2702) {
                            var4--;
                            int var90 = field426[var4];
                            class4 var91 = (class4) client.field719.method3301((long) var90);
                            if (var91 == null) {
                                field426[var4++] = 0;
                            } else {
                                field426[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var389 < 2900) {
                        var4--;
                        class158 var92 = class158.method44(field426[var4]);
                        if (var389 == 2800) {
                            int[] var93 = field426;
                            int var94 = var4++;
                            int var95 = client.method5(var92);
                            int var96 = var95 >> 11 & 0x3F;
                            var93[var94] = var96;
                            continue;
                        }
                        if (var389 == 2801) {
                            var4--;
                            int var97 = field426[var4];
                            int var391 = var97 - 1;
                            if (var92.field2653 != null && var391 < var92.field2653.length && var92.field2653[var391] != null) {
                                field420[var5++] = var92.field2653[var391];
                                continue;
                            }
                            field420[var5++] = "";
                            continue;
                        }
                        if (var389 == 2802) {
                            if (var92.field2630 == null) {
                                field420[var5++] = "";
                            } else {
                                field420[var5++] = var92.field2630;
                            }
                            continue;
                        }
                    } else if (var389 < 3200) {
                        if (var389 == 3100) {
                            var5--;
                            String var98 = field420[var5];
                            client.method1680(0, "", var98);
                            continue;
                        }
                        if (var389 == 3101) {
                            var4 -= 2;
                            client.method1418(Statics.field1431, field426[var4], field426[var4 + 1]);
                            continue;
                        }
                        if (var389 == 3103) {
                            client.field534.method2317(213);
                            for (class4 var99 = (class4) client.field719.method3310(); var99 != null; var99 = (class4) client.field719.method3305()) {
                                if (var99.field64 == 0 || var99.field64 == 3) {
                                    client.method52(var99, true);
                                }
                            }
                            if (client.field660 != null) {
                                client.method2840(client.field660);
                                client.field660 = null;
                            }
                            continue;
                        }
                        if (var389 == 3104) {
                            var5--;
                            String var100 = field420[var5];
                            int var101 = 0;
                            if (class147.method2046(var100)) {
                                var101 = class147.method68(var100);
                            }
                            client.field534.method2317(146);
                            client.field534.method2633(var101);
                            continue;
                        }
                        if (var389 == 3105) {
                            var5--;
                            String var102 = field420[var5];
                            client.field534.method2317(56);
                            client.field534.method2424(var102.length() + 1);
                            client.field534.method2429(var102);
                            continue;
                        }
                        if (var389 == 3106) {
                            var5--;
                            String var103 = field420[var5];
                            client.field534.method2317(148);
                            client.field534.method2424(var103.length() + 1);
                            client.field534.method2429(var103);
                            continue;
                        }
                        if (var389 == 3107) {
                            var4--;
                            int var104 = field426[var4];
                            var5--;
                            String var105 = field420[var5];
                            boolean var106 = false;
                            for (int var107 = 0; var107 < client.field642; var107++) {
                                class3 var108 = client.field616[client.field491[var107]];
                                if (var108 != null && var108.field51 != null && var108.field51.equalsIgnoreCase(var105)) {
                                    client.method109(Statics.field1431.field482[0], Statics.field1431.field472[0], var108.field482[0], var108.field472[0], false, 0, 0, 1, 1, 0, 2);
                                    if (var104 == 1) {
                                        client.field534.method2317(231);
                                        client.field534.method2466(client.field491[var107]);
                                    } else if (var104 == 4) {
                                        client.field534.method2317(61);
                                        client.field534.method2641(client.field491[var107]);
                                    } else if (var104 == 6) {
                                        client.field534.method2317(1);
                                        client.field534.method2641(client.field491[var107]);
                                    } else if (var104 == 7) {
                                        client.field534.method2317(60);
                                        client.field534.method2466(client.field491[var107]);
                                    }
                                    var106 = true;
                                    break;
                                }
                            }
                            if (!var106) {
                                client.method1680(0, "", class134.field2111 + var105);
                            }
                            continue;
                        }
                        if (var389 == 3108) {
                            var4 -= 3;
                            int var109 = field426[var4];
                            int var110 = field426[var4 + 1];
                            int var111 = field426[var4 + 2];
                            class158 var112 = class158.method44(var111);
                            if (client.field667 == null && !client.field622 && var112 != null) {
                                class158 var113 = client.method2210(var112);
                                if (var113 == null) {
                                    var113 = var112.field2654;
                                }
                                if (var113 != null) {
                                    client.field667 = var112;
                                    class158 var115 = client.method2210(var112);
                                    if (var115 == null) {
                                        var115 = var112.field2654;
                                    }
                                    client.field668 = var115;
                                    client.field669 = var109;
                                    client.field670 = var110;
                                    Statics.field2352 = 0;
                                    client.field678 = false;
                                }
                            }
                            continue;
                        }
                        if (var389 == 3109) {
                            var4 -= 2;
                            int var117 = field426[var4];
                            int var118 = field426[var4 + 1];
                            class158 var119 = var47 ? Statics.field277 : Statics.field404;
                            if (client.field667 == null && !client.field622 && var119 != null) {
                                class158 var120 = client.method2210(var119);
                                if (var120 == null) {
                                    var120 = var119.field2654;
                                }
                                if (var120 != null) {
                                    client.field667 = var119;
                                    class158 var122 = client.method2210(var119);
                                    if (var122 == null) {
                                        var122 = var119.field2654;
                                    }
                                    client.field668 = var122;
                                    client.field669 = var117;
                                    client.field670 = var118;
                                    Statics.field2352 = 0;
                                    client.field678 = false;
                                }
                            }
                            continue;
                        }
                    } else if (var389 < 3300) {
                        if (var389 == 3200) {
                            var4 -= 3;
                            client.method144(field426[var4], field426[var4 + 1], field426[var4 + 2]);
                            continue;
                        }
                        if (var389 == 3201) {
                            var4--;
                            int var124 = field426[var4];
                            if (var124 == -1 && !client.field733) {
                                class138.method2686();
                            } else if (var124 != -1 && client.field688 != var124 && client.field731 != 0 && !client.field733) {
                                class154 var125 = Statics.field758;
                                int var126 = client.field731;
                                class138.field2360 = 1;
                                Statics.field1469 = var125;
                                Statics.field2362 = var124;
                                Statics.field2361 = 0;
                                Statics.field286 = var126;
                                Statics.field427 = false;
                                Statics.field2359 = 2;
                            }
                            client.field688 = var124;
                            continue;
                        }
                        if (var389 == 3202) {
                            var4 -= 2;
                            int var127 = field426[var4];
                            int var10000 = field426[var4 + 1];
                            if (client.field731 != 0 && var127 != -1) {
                                class138.method2688(Statics.field1376, var127, 0, client.field731, false);
                                client.field733 = true;
                            }
                            continue;
                        }
                    } else if (var389 < 3400) {
                        if (var389 == 3300) {
                            field426[var4++] = client.field652;
                            continue;
                        }
                        if (var389 == 3301) {
                            var4 -= 2;
                            int var129 = field426[var4];
                            int var130 = field426[var4 + 1];
                            int[] var131 = field426;
                            int var132 = var4++;
                            class19 var133 = (class19) class19.field302.method3301((long) var129);
                            int var134;
                            if (var133 == null) {
                                var134 = -1;
                            } else if (var130 >= 0 && var130 < var133.field297.length) {
                                var134 = var133.field297[var130];
                            } else {
                                var134 = -1;
                            }
                            var131[var132] = var134;
                            continue;
                        }
                        if (var389 == 3302) {
                            var4 -= 2;
                            int var135 = field426[var4];
                            int var136 = field426[var4 + 1];
                            field426[var4++] = class19.method2379(var135, var136);
                            continue;
                        }
                        if (var389 == 3303) {
                            var4 -= 2;
                            int var137 = field426[var4];
                            int var138 = field426[var4 + 1];
                            field426[var4++] = class19.method20(var137, var138);
                            continue;
                        }
                        if (var389 == 3304) {
                            var4--;
                            int var139 = field426[var4];
                            int[] var140 = field426;
                            int var141 = var4++;
                            class41 var142 = (class41) class41.field1057.method3260((long) var139);
                            class41 var143;
                            if (var142 == null) {
                                byte[] var144 = Statics.field1059.method2987(5, var139);
                                class41 var145 = new class41();
                                if (var144 != null) {
                                    var145.method916(new class127(var144));
                                }
                                class41.field1057.method3261(var145, (long) var139);
                                var143 = var145;
                            } else {
                                var143 = var142;
                            }
                            var140[var141] = var143.field1058;
                            continue;
                        }
                        if (var389 == 3305) {
                            var4--;
                            int var146 = field426[var4];
                            field426[var4++] = client.field634[var146];
                            continue;
                        }
                        if (var389 == 3306) {
                            var4--;
                            int var147 = field426[var4];
                            field426[var4++] = client.field635[var147];
                            continue;
                        }
                        if (var389 == 3307) {
                            var4--;
                            int var148 = field426[var4];
                            field426[var4++] = client.field636[var148];
                            continue;
                        }
                        if (var389 == 3308) {
                            int var149 = Statics.field402;
                            int var150 = (Statics.field1431.field431 >> 7) + Statics.field272;
                            int var151 = (Statics.field1431.field440 >> 7) + Statics.field977;
                            field426[var4++] = (var149 << 28) + (var150 << 14) + var151;
                            continue;
                        }
                        if (var389 == 3309) {
                            var4--;
                            int var152 = field426[var4];
                            field426[var4++] = var152 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var389 == 3310) {
                            var4--;
                            int var153 = field426[var4];
                            field426[var4++] = var153 >> 28;
                            continue;
                        }
                        if (var389 == 3311) {
                            var4--;
                            int var154 = field426[var4];
                            field426[var4++] = var154 & 0x3FFF;
                            continue;
                        }
                        if (var389 == 3312) {
                            field426[var4++] = client.field582 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 3313) {
                            var4 -= 2;
                            int var155 = field426[var4] + 32768;
                            int var156 = field426[var4 + 1];
                            int[] var157 = field426;
                            int var158 = var4++;
                            class19 var159 = (class19) class19.field302.method3301((long) var155);
                            int var160;
                            if (var159 == null) {
                                var160 = -1;
                            } else if (var156 >= 0 && var156 < var159.field297.length) {
                                var160 = var159.field297[var156];
                            } else {
                                var160 = -1;
                            }
                            var157[var158] = var160;
                            continue;
                        }
                        if (var389 == 3314) {
                            var4 -= 2;
                            int var161 = field426[var4] + 32768;
                            int var162 = field426[var4 + 1];
                            field426[var4++] = class19.method2379(var161, var162);
                            continue;
                        }
                        if (var389 == 3315) {
                            var4 -= 2;
                            int var163 = field426[var4] + 32768;
                            int var164 = field426[var4 + 1];
                            field426[var4++] = class19.method20(var163, var164);
                            continue;
                        }
                        if (var389 == 3316) {
                            if (client.field663 >= 2) {
                                field426[var4++] = client.field663;
                            } else {
                                field426[var4++] = 0;
                            }
                            continue;
                        }
                        if (var389 == 3317) {
                            field426[var4++] = client.field511;
                            continue;
                        }
                        if (var389 == 3318) {
                            field426[var4++] = client.field494;
                            continue;
                        }
                        if (var389 == 3321) {
                            field426[var4++] = client.field661;
                            continue;
                        }
                        if (var389 == 3322) {
                            field426[var4++] = client.field662;
                            continue;
                        }
                        if (var389 == 3323) {
                            if (client.field664) {
                                field426[var4++] = 1;
                            } else {
                                field426[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var389 < 3500) {
                        if (var389 == 3400) {
                            var4 -= 2;
                            int var165 = field426[var4];
                            int var166 = field426[var4 + 1];
                            class39 var167 = class39.method2228(var165);
                            if (var167.field989 != 's') {
                            }
                            for (int var168 = 0; var168 < var167.field992; var168++) {
                                if (var167.field1003[var168] == var166) {
                                    field420[var5++] = var167.field995[var168];
                                    var167 = null;
                                    break;
                                }
                            }
                            if (var167 != null) {
                                field420[var5++] = var167.field1001;
                            }
                            continue;
                        }
                        if (var389 == 3408) {
                            var4 -= 4;
                            int var169 = field426[var4];
                            int var170 = field426[var4 + 1];
                            int var171 = field426[var4 + 2];
                            int var172 = field426[var4 + 3];
                            class39 var173 = class39.method2228(var171);
                            if (var173.field988 == var169 && var173.field989 == var170) {
                                for (int var174 = 0; var174 < var173.field992; var174++) {
                                    if (var173.field1003[var174] == var172) {
                                        if (var170 == 115) {
                                            field420[var5++] = var173.field995[var174];
                                        } else {
                                            field426[var4++] = var173.field994[var174];
                                        }
                                        var173 = null;
                                        break;
                                    }
                                }
                                if (var173 != null) {
                                    if (var170 == 115) {
                                        field420[var5++] = var173.field1001;
                                    } else {
                                        field426[var4++] = var173.field990;
                                    }
                                }
                                continue;
                            }
                            if (var170 == 115) {
                                field420[var5++] = "null";
                            } else {
                                field426[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var389 < 3700) {
                        if (var389 == 3600) {
                            if (client.field620 == 0) {
                                field426[var4++] = -2;
                            } else if (client.field620 == 1) {
                                field426[var4++] = -1;
                            } else {
                                field426[var4++] = client.field500;
                            }
                            continue;
                        }
                        if (var389 == 3601) {
                            var4--;
                            int var175 = field426[var4];
                            if (client.field620 == 2 && var175 < client.field500) {
                                field420[var5++] = client.field750[var175].field381;
                                continue;
                            }
                            field420[var5++] = "";
                            continue;
                        }
                        if (var389 == 3602) {
                            var4--;
                            int var176 = field426[var4];
                            if (client.field620 == 2 && var176 < client.field500) {
                                field426[var4++] = client.field750[var176].field380;
                                continue;
                            }
                            field426[var4++] = 0;
                            continue;
                        }
                        if (var389 == 3603) {
                            var4--;
                            int var177 = field426[var4];
                            if (client.field620 == 2 && var177 < client.field500) {
                                field426[var4++] = client.field750[var177].field391;
                                continue;
                            }
                            field426[var4++] = 0;
                            continue;
                        }
                        if (var389 == 3604) {
                            var5--;
                            String var178 = field420[var5];
                            var4--;
                            int var179 = field426[var4];
                            client.method3152(var178, var179);
                            continue;
                        }
                        if (var389 == 3605) {
                            var5--;
                            String var180 = field420[var5];
                            client.method1499(var180);
                            continue;
                        }
                        if (var389 == 3606) {
                            var5--;
                            String var181 = field420[var5];
                            client.method738(var181);
                            continue;
                        }
                        if (var389 == 3607) {
                            var5--;
                            String var182 = field420[var5];
                            if (var182 == null) {
                                continue;
                            }
                            if (client.field752 >= 100) {
                                client.method1680(0, "", class134.field2257);
                                continue;
                            }
                            String var183 = class148.method1252(var182, Statics.field533);
                            if (var183 == null) {
                                continue;
                            }
                            for (int var184 = 0; var184 < client.field752; var184++) {
                                class11 var185 = client.field657[var184];
                                String var186 = class148.method1252(var185.field196, Statics.field533);
                                if (var186 != null && var186.equals(var183)) {
                                    client.method1680(0, "", var182 + class134.field2123);
                                    continue label2414;
                                }
                                if (var185.field198 != null) {
                                    String var187 = class148.method1252(var185.field198, Statics.field533);
                                    if (var187 != null && var187.equals(var183)) {
                                        client.method1680(0, "", var182 + class134.field2123);
                                        continue label2414;
                                    }
                                }
                            }
                            for (int var188 = 0; var188 < client.field500; var188++) {
                                class23 var189 = client.field750[var188];
                                String var190 = class148.method1252(var189.field381, Statics.field533);
                                if (var190 != null && var190.equals(var183)) {
                                    client.method1680(0, "", class134.field2133 + var182 + class134.field2264);
                                    continue label2414;
                                }
                                if (var189.field379 != null) {
                                    String var191 = class148.method1252(var189.field379, Statics.field533);
                                    if (var191 != null && var191.equals(var183)) {
                                        client.method1680(0, "", class134.field2133 + var182 + class134.field2264);
                                        continue label2414;
                                    }
                                }
                            }
                            if (class148.method1252(Statics.field1431.field51, Statics.field533).equals(var183)) {
                                client.method1680(0, "", class134.field2219);
                            } else {
                                client.field534.method2317(157);
                                client.field534.method2424(class127.method173(var182));
                                client.field534.method2429(var182);
                            }
                            continue;
                        }
                        if (var389 == 3608) {
                            var5--;
                            String var192 = field420[var5];
                            client.method147(var192);
                            continue;
                        }
                        if (var389 == 3609) {
                            var5--;
                            String var193 = field420[var5];
                            if (var193.startsWith(class2.method1566(0)) || var193.startsWith(class2.method1566(1))) {
                                var193 = var193.substring(7);
                            }
                            int[] var194 = field426;
                            int var195 = var4++;
                            boolean var196;
                            if (var193 == null) {
                                var196 = false;
                            } else {
                                String var197 = class148.method1252(var193, Statics.field533);
                                int var198 = 0;
                                while (true) {
                                    if (var198 >= client.field500) {
                                        if (var193.equalsIgnoreCase(class148.method1252(Statics.field1431.field51, Statics.field533))) {
                                            var196 = true;
                                        } else {
                                            var196 = false;
                                        }
                                        break;
                                    }
                                    if (var197.equalsIgnoreCase(class148.method1252(client.field750[var198].field381, Statics.field533))) {
                                        var196 = true;
                                        break;
                                    }
                                    var198++;
                                }
                            }
                            var194[var195] = var196 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 3611) {
                            if (client.field499 == null) {
                                field420[var5++] = "";
                            } else {
                                String[] var199 = field420;
                                int var200 = var5++;
                                String var201 = client.field499;
                                String var202 = Statics.method2577(class146.method2692(var201));
                                if (var202 == null) {
                                    var202 = "";
                                }
                                var199[var200] = var202;
                            }
                            continue;
                        }
                        if (var389 == 3612) {
                            if (client.field499 == null) {
                                field426[var4++] = 0;
                            } else {
                                field426[var4++] = Statics.field1075;
                            }
                            continue;
                        }
                        if (var389 == 3613) {
                            var4--;
                            int var204 = field426[var4];
                            if (client.field499 != null && var204 < Statics.field1075) {
                                field420[var5++] = Statics.field2066[var204].field126;
                                continue;
                            }
                            field420[var5++] = "";
                            continue;
                        }
                        if (var389 == 3614) {
                            var4--;
                            int var205 = field426[var4];
                            if (client.field499 != null && var205 < Statics.field1075) {
                                field426[var4++] = Statics.field2066[var205].field127;
                                continue;
                            }
                            field426[var4++] = 0;
                            continue;
                        }
                        if (var389 == 3615) {
                            var4--;
                            int var206 = field426[var4];
                            if (client.field499 != null && var206 < Statics.field1075) {
                                field426[var4++] = Statics.field2066[var206].field133;
                                continue;
                            }
                            field426[var4++] = 0;
                            continue;
                        }
                        if (var389 == 3616) {
                            field426[var4++] = Statics.field1995;
                            continue;
                        }
                        if (var389 == 3617) {
                            var5--;
                            String var207 = field420[var5];
                            if (Statics.field2066 != null) {
                                client.field534.method2317(106);
                                client.field534.method2424(class127.method173(var207));
                                client.field534.method2429(var207);
                            }
                            continue;
                        }
                        if (var389 == 3618) {
                            field426[var4++] = Statics.field193;
                            continue;
                        }
                        if (var389 == 3619) {
                            var5--;
                            String var208 = field420[var5];
                            if (!var208.equals("")) {
                                client.field534.method2317(36);
                                client.field534.method2424(class127.method173(var208));
                                client.field534.method2429(var208);
                            }
                            continue;
                        }
                        if (var389 == 3620) {
                            client.field534.method2317(36);
                            client.field534.method2424(0);
                            continue;
                        }
                        if (var389 == 3621) {
                            if (client.field620 == 0) {
                                field426[var4++] = -1;
                            } else {
                                field426[var4++] = client.field752;
                            }
                            continue;
                        }
                        if (var389 == 3622) {
                            var4--;
                            int var209 = field426[var4];
                            if (client.field620 != 0 && var209 < client.field752) {
                                field420[var5++] = client.field657[var209].field196;
                                continue;
                            }
                            field420[var5++] = "";
                            continue;
                        }
                        if (var389 == 3623) {
                            var5--;
                            String var210 = field420[var5];
                            if (var210.startsWith(class2.method1566(0)) || var210.startsWith(class2.method1566(1))) {
                                var210 = var210.substring(7);
                            }
                            field426[var4++] = client.method110(var210) ? 1 : 0;
                            continue;
                        }
                        if (var389 == 3624) {
                            var4--;
                            int var211 = field426[var4];
                            if (Statics.field2066 != null && var211 < Statics.field1075 && Statics.field2066[var211].field126.equalsIgnoreCase(Statics.field1431.field51)) {
                                field426[var4++] = 1;
                                continue;
                            }
                            field426[var4++] = 0;
                            continue;
                        }
                        if (var389 == 3625) {
                            if (client.field588 == null) {
                                field420[var5++] = "";
                            } else {
                                field420[var5++] = class146.method1660(client.field588);
                            }
                            continue;
                        }
                    } else if (var389 < 4100) {
                        if (var389 == 4000) {
                            var4 -= 2;
                            int var212 = field426[var4];
                            int var213 = field426[var4 + 1];
                            field426[var4++] = var212 + var213;
                            continue;
                        }
                        if (var389 == 4001) {
                            var4 -= 2;
                            int var214 = field426[var4];
                            int var215 = field426[var4 + 1];
                            field426[var4++] = var214 - var215;
                            continue;
                        }
                        if (var389 == 4002) {
                            var4 -= 2;
                            int var216 = field426[var4];
                            int var217 = field426[var4 + 1];
                            field426[var4++] = var216 * var217;
                            continue;
                        }
                        if (var389 == 4003) {
                            var4 -= 2;
                            int var218 = field426[var4];
                            int var219 = field426[var4 + 1];
                            field426[var4++] = var218 / var219;
                            continue;
                        }
                        if (var389 == 4004) {
                            var4--;
                            int var220 = field426[var4];
                            field426[var4++] = (int) (Math.random() * (double) var220);
                            continue;
                        }
                        if (var389 == 4005) {
                            var4--;
                            int var221 = field426[var4];
                            field426[var4++] = (int) (Math.random() * (double) (var221 + 1));
                            continue;
                        }
                        if (var389 == 4006) {
                            var4 -= 5;
                            int var222 = field426[var4];
                            int var223 = field426[var4 + 1];
                            int var224 = field426[var4 + 2];
                            int var225 = field426[var4 + 3];
                            int var226 = field426[var4 + 4];
                            field426[var4++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                            continue;
                        }
                        if (var389 == 4007) {
                            var4 -= 2;
                            int var227 = field426[var4];
                            int var228 = field426[var4 + 1];
                            field426[var4++] = var227 * var228 / 100 + var227;
                            continue;
                        }
                        if (var389 == 4008) {
                            var4 -= 2;
                            int var229 = field426[var4];
                            int var230 = field426[var4 + 1];
                            field426[var4++] = var229 | 0x1 << var230;
                            continue;
                        }
                        if (var389 == 4009) {
                            var4 -= 2;
                            int var231 = field426[var4];
                            int var232 = field426[var4 + 1];
                            field426[var4++] = var231 & -1 - (0x1 << var232);
                            continue;
                        }
                        if (var389 == 4010) {
                            var4 -= 2;
                            int var233 = field426[var4];
                            int var234 = field426[var4 + 1];
                            field426[var4++] = (var233 & 0x1 << var234) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var389 == 4011) {
                            var4 -= 2;
                            int var235 = field426[var4];
                            int var236 = field426[var4 + 1];
                            field426[var4++] = var235 % var236;
                            continue;
                        }
                        if (var389 == 4012) {
                            var4 -= 2;
                            int var237 = field426[var4];
                            int var238 = field426[var4 + 1];
                            if (var237 == 0) {
                                field426[var4++] = 0;
                            } else {
                                field426[var4++] = (int) Math.pow((double) var237, (double) var238);
                            }
                            continue;
                        }
                        if (var389 == 4013) {
                            var4 -= 2;
                            int var239 = field426[var4];
                            int var240 = field426[var4 + 1];
                            if (var239 == 0) {
                                field426[var4++] = 0;
                            } else if (var240 == 0) {
                                field426[var4++] = Integer.MAX_VALUE;
                            } else {
                                field426[var4++] = (int) Math.pow((double) var239, 1.0D / (double) var240);
                            }
                            continue;
                        }
                        if (var389 == 4014) {
                            var4 -= 2;
                            int var241 = field426[var4];
                            int var242 = field426[var4 + 1];
                            field426[var4++] = var241 & var242;
                            continue;
                        }
                        if (var389 == 4015) {
                            var4 -= 2;
                            int var243 = field426[var4];
                            int var244 = field426[var4 + 1];
                            field426[var4++] = var243 | var244;
                            continue;
                        }
                    } else if (var389 < 4200) {
                        if (var389 == 4100) {
                            var5--;
                            String var245 = field420[var5];
                            var4--;
                            int var246 = field426[var4];
                            field420[var5++] = var245 + var246;
                            continue;
                        }
                        if (var389 == 4101) {
                            var5 -= 2;
                            String var247 = field420[var5];
                            String var248 = field420[var5 + 1];
                            field420[var5++] = var247 + var248;
                            continue;
                        }
                        if (var389 == 4102) {
                            var5--;
                            String var249 = field420[var5];
                            var4--;
                            int var250 = field426[var4];
                            String[] var251 = field420;
                            int var252 = var5++;
                            String var254;
                            if (var250 < 0) {
                                var254 = Integer.toString(var250);
                            } else {
                                var254 = class147.method1360(var250, 10, true);
                            }
                            var251[var252] = var249 + var254;
                            continue;
                        }
                        if (var389 == 4103) {
                            var5--;
                            String var255 = field420[var5];
                            field420[var5++] = var255.toLowerCase();
                            continue;
                        }
                        if (var389 == 4104) {
                            var4--;
                            int var256 = field426[var4];
                            long var257 = ((long) var256 + 11745L) * 86400000L;
                            field423.setTime(new Date(var257));
                            int var259 = field423.get(5);
                            int var260 = field423.get(2);
                            int var261 = field423.get(1);
                            field420[var5++] = var259 + "-" + field424[var260] + "-" + var261;
                            continue;
                        }
                        if (var389 == 4105) {
                            var5 -= 2;
                            String var262 = field420[var5];
                            String var263 = field420[var5 + 1];
                            if (Statics.field1431.field37 != null && Statics.field1431.field37.field2730) {
                                field420[var5++] = var263;
                                continue;
                            }
                            field420[var5++] = var262;
                            continue;
                        }
                        if (var389 == 4106) {
                            var4--;
                            int var264 = field426[var4];
                            field420[var5++] = Integer.toString(var264);
                            continue;
                        }
                        if (var389 == 4107) {
                            var5 -= 2;
                            int[] var265 = field426;
                            int var266 = var4++;
                            String var267 = field420[var5];
                            String var268 = field420[var5 + 1];
                            int var269 = client.field702;
                            int var270 = var267.length();
                            int var271 = var268.length();
                            int var272 = 0;
                            int var273 = 0;
                            char var274 = 0;
                            char var275 = 0;
                            int var276;
                            label2217: while (true) {
                                if (var272 - var274 >= var270 && var273 - var275 >= var271) {
                                    int var285 = Math.min(var270, var271);
                                    for (int var286 = 0; var286 < var285; var286++) {
                                        char var289 = var267.charAt(var286);
                                        char var290 = var268.charAt(var286);
                                        if (var289 != var290 && Character.toUpperCase(var289) != Character.toUpperCase(var290)) {
                                            char var291 = Character.toLowerCase(var289);
                                            char var292 = Character.toLowerCase(var290);
                                            if (var291 != var292) {
                                                var276 = class150.method1253(var291, var269) - class150.method1253(var292, var269);
                                                break label2217;
                                            }
                                        }
                                    }
                                    int var293 = var270 - var271;
                                    if (var293 == 0) {
                                        for (int var294 = 0; var294 < var285; var294++) {
                                            char var295 = var267.charAt(var294);
                                            char var296 = var268.charAt(var294);
                                            if (var295 != var296) {
                                                var276 = class150.method1253(var295, var269) - class150.method1253(var296, var269);
                                                break label2217;
                                            }
                                        }
                                        var276 = 0;
                                    } else {
                                        var276 = var293;
                                    }
                                    break;
                                }
                                if (var272 - var274 >= var270) {
                                    var276 = -1;
                                    break;
                                }
                                if (var273 - var275 >= var271) {
                                    var276 = 1;
                                    break;
                                }
                                char var277;
                                if (var274 == 0) {
                                    var277 = var267.charAt(var272++);
                                } else {
                                    var277 = var274;
                                    boolean var278 = false;
                                }
                                char var279;
                                if (var275 == 0) {
                                    var279 = var268.charAt(var273++);
                                } else {
                                    var279 = var275;
                                    boolean var280 = false;
                                }
                                var274 = class150.method2938(var277);
                                var275 = class150.method2938(var279);
                                char var281 = class150.method233(var277, var269);
                                char var282 = class150.method233(var279, var269);
                                if (var281 != var282 && Character.toUpperCase(var281) != Character.toUpperCase(var282)) {
                                    char var283 = Character.toLowerCase(var281);
                                    char var284 = Character.toLowerCase(var282);
                                    if (var283 != var284) {
                                        var276 = class150.method1253(var283, var269) - class150.method1253(var284, var269);
                                        break;
                                    }
                                }
                            }
                            byte var298;
                            if (var276 > 0) {
                                var298 = 1;
                            } else if (var276 < 0) {
                                var298 = -1;
                            } else {
                                var298 = 0;
                            }
                            var265[var266] = var298;
                            continue;
                        }
                        if (var389 == 4108) {
                            var5--;
                            String var299 = field420[var5];
                            var4 -= 2;
                            int var300 = field426[var4];
                            int var301 = field426[var4 + 1];
                            byte[] var302 = Statics.field2078.method2987(var301, 0);
                            class183 var303 = new class183(var302);
                            field426[var4++] = var303.method3414(var299, var300);
                            continue;
                        }
                        if (var389 == 4109) {
                            var5--;
                            String var304 = field420[var5];
                            var4 -= 2;
                            int var305 = field426[var4];
                            int var306 = field426[var4 + 1];
                            byte[] var307 = Statics.field2078.method2987(var306, 0);
                            class183 var308 = new class183(var307);
                            field426[var4++] = var308.method3391(var304, var305);
                            continue;
                        }
                        if (var389 == 4110) {
                            var5 -= 2;
                            String var309 = field420[var5];
                            String var310 = field420[var5 + 1];
                            var4--;
                            if (field426[var4] == 1) {
                                field420[var5++] = var309;
                            } else {
                                field420[var5++] = var310;
                            }
                            continue;
                        }
                        if (var389 == 4111) {
                            var5--;
                            String var311 = field420[var5];
                            field420[var5++] = class185.method3392(var311);
                            continue;
                        }
                        if (var389 == 4112) {
                            var5--;
                            String var312 = field420[var5];
                            var4--;
                            int var313 = field426[var4];
                            field420[var5++] = var312 + (char) var313;
                            continue;
                        }
                        if (var389 == 4113) {
                            var4--;
                            int var314 = field426[var4];
                            int[] var315 = field426;
                            int var316 = var4++;
                            char var317 = (char) var314;
                            boolean var318;
                            if (var317 >= ' ' && var317 <= '~') {
                                var318 = true;
                            } else if (var317 >= 160 && var317 <= 255) {
                                var318 = true;
                            } else if (var317 == 8364 || var317 == 338 || var317 == 8212 || var317 == 339 || var317 == 376) {
                                var318 = true;
                            } else {
                                var318 = false;
                            }
                            var315[var316] = var318 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 4114) {
                            var4--;
                            int var319 = field426[var4];
                            field426[var4++] = class147.method1475((char) var319) ? 1 : 0;
                            continue;
                        }
                        if (var389 == 4115) {
                            var4--;
                            int var320 = field426[var4];
                            int[] var321 = field426;
                            int var322 = var4++;
                            char var323 = (char) var320;
                            boolean var324 = var323 >= 'A' && var323 <= 'Z' || var323 >= 'a' && var323 <= 'z';
                            var321[var322] = var324 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 4116) {
                            var4--;
                            int var325 = field426[var4];
                            int[] var326 = field426;
                            int var327 = var4++;
                            char var328 = (char) var325;
                            boolean var329 = var328 >= '0' && var328 <= '9';
                            var326[var327] = var329 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 4117) {
                            var5--;
                            String var330 = field420[var5];
                            if (var330 == null) {
                                field426[var4++] = 0;
                            } else {
                                field426[var4++] = var330.length();
                            }
                            continue;
                        }
                        if (var389 == 4118) {
                            var5--;
                            String var331 = field420[var5];
                            var4 -= 2;
                            int var332 = field426[var4];
                            int var333 = field426[var4 + 1];
                            field420[var5++] = var331.substring(var332, var333);
                            continue;
                        }
                        if (var389 == 4119) {
                            var5--;
                            String var334 = field420[var5];
                            StringBuilder var335 = new StringBuilder(var334.length());
                            boolean var336 = false;
                            for (int var337 = 0; var337 < var334.length(); var337++) {
                                char var338 = var334.charAt(var337);
                                if (var338 == '<') {
                                    var336 = true;
                                } else if (var338 == '>') {
                                    var336 = false;
                                } else if (!var336) {
                                    var335.append(var338);
                                }
                            }
                            field420[var5++] = var335.toString();
                            continue;
                        }
                        if (var389 == 4120) {
                            var5--;
                            String var339 = field420[var5];
                            var4--;
                            int var340 = field426[var4];
                            field426[var4++] = var339.indexOf(var340);
                            continue;
                        }
                    } else if (var389 < 4300) {
                        if (var389 == 4200) {
                            var4--;
                            int var341 = field426[var4];
                            field420[var5++] = class40.method119(var341).field1036;
                            continue;
                        }
                        if (var389 == 4201) {
                            var4 -= 2;
                            int var342 = field426[var4];
                            int var343 = field426[var4 + 1];
                            class40 var344 = class40.method119(var342);
                            if (var343 >= 1 && var343 <= 5 && var344.field1027[var343 - 1] != null) {
                                field420[var5++] = var344.field1027[var343 - 1];
                                continue;
                            }
                            field420[var5++] = "";
                            continue;
                        }
                        if (var389 == 4202) {
                            var4 -= 2;
                            int var345 = field426[var4];
                            int var346 = field426[var4 + 1];
                            class40 var347 = class40.method119(var345);
                            if (var346 >= 1 && var346 <= 5 && var347.field1028[var346 - 1] != null) {
                                field420[var5++] = var347.field1028[var346 - 1];
                                continue;
                            }
                            field420[var5++] = "";
                            continue;
                        }
                        if (var389 == 4203) {
                            var4--;
                            int var348 = field426[var4];
                            field426[var4++] = class40.method119(var348).field1025;
                            continue;
                        }
                        if (var389 == 4204) {
                            var4--;
                            int var349 = field426[var4];
                            field426[var4++] = class40.method119(var349).field1024 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var389 == 4205) {
                            var4--;
                            int var350 = field426[var4];
                            class40 var351 = class40.method119(var350);
                            if (var351.field1044 == -1 && var351.field1043 >= 0) {
                                field426[var4++] = var351.field1043;
                                continue;
                            }
                            field426[var4++] = var350;
                            continue;
                        }
                        if (var389 == 4206) {
                            var4--;
                            int var352 = field426[var4];
                            class40 var353 = class40.method119(var352);
                            if (var353.field1044 >= 0 && var353.field1043 >= 0) {
                                field426[var4++] = var353.field1043;
                                continue;
                            }
                            field426[var4++] = var352;
                            continue;
                        }
                        if (var389 == 4207) {
                            var4--;
                            int var354 = field426[var4];
                            field426[var4++] = class40.method119(var354).field1009 ? 1 : 0;
                            continue;
                        }
                    } else if (var389 < 5100) {
                        if (var389 == 5000) {
                            field426[var4++] = client.field713;
                            continue;
                        }
                        if (var389 == 5001) {
                            var4 -= 3;
                            client.field713 = field426[var4];
                            Statics.field250 = class137.method842(field426[var4 + 1]);
                            if (Statics.field250 == null) {
                                Statics.field250 = class137.field2347;
                            }
                            client.field714 = field426[var4 + 2];
                            client.field534.method2317(100);
                            client.field534.method2424(client.field713);
                            client.field534.method2424(Statics.field250.field2348);
                            client.field534.method2424(client.field714);
                            continue;
                        }
                        if (var389 == 5002) {
                            var5--;
                            String var355 = field420[var5];
                            var4 -= 2;
                            int var356 = field426[var4];
                            int var357 = field426[var4 + 1];
                            client.field534.method2317(225);
                            client.field534.method2424(class127.method173(var355) + 2);
                            client.field534.method2429(var355);
                            client.field534.method2424(var356 - 1);
                            client.field534.method2424(var357);
                            continue;
                        }
                        if (var389 == 5003) {
                            var4--;
                            int var358 = field426[var4];
                            String var359 = null;
                            if (var358 < 100) {
                                var359 = client.field710[var358];
                            }
                            if (var359 == null) {
                                var359 = "";
                            }
                            field420[var5++] = var359;
                            continue;
                        }
                        if (var389 == 5004) {
                            var4--;
                            int var360 = field426[var4];
                            int var361 = -1;
                            if (var360 < 100 && client.field710[var360] != null) {
                                var361 = client.field707[var360];
                            }
                            field426[var4++] = var361;
                            continue;
                        }
                        if (var389 == 5005) {
                            if (Statics.field250 == null) {
                                field426[var4++] = -1;
                            } else {
                                field426[var4++] = Statics.field250.field2348;
                            }
                            continue;
                        }
                        if (var389 == 5008) {
                            var5--;
                            String var362 = field420[var5];
                            if (var362.startsWith("::")) {
                                if (var362.equalsIgnoreCase("::toggleroof")) {
                                    Statics.field1002.field208 = !Statics.field1002.field208;
                                    Statics.method576();
                                    if (Statics.field1002.field208) {
                                        client.method1680(0, "", "Roofs are now all hidden");
                                    } else {
                                        client.method1680(0, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field663 >= 2) {
                                    if (var362.equalsIgnoreCase("::gc")) {
                                        System.gc();
                                    }
                                    if (var362.equalsIgnoreCase("::clientdrop")) {
                                        if (client.field541 > 0) {
                                            client.method127();
                                        } else {
                                            client.method2341(40);
                                            Statics.field2052 = Statics.field1440;
                                            Statics.field1440 = null;
                                        }
                                    }
                                    if (var362.equalsIgnoreCase("::fpson")) {
                                        client.field510 = true;
                                    }
                                    if (var362.equalsIgnoreCase("::fpsoff")) {
                                        client.field510 = false;
                                    }
                                    if (var362.equalsIgnoreCase("::noclip")) {
                                        for (int var363 = 0; var363 < 4; var363++) {
                                            for (int var364 = 1; var364 < 103; var364++) {
                                                for (int var365 = 1; var365 < 103; var365++) {
                                                    client.field681[var363].field2753[var364][var365] = 0;
                                                }
                                            }
                                        }
                                    }
                                    if (var362.equalsIgnoreCase("::errortest") && client.field495 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field534.method2317(134);
                                client.field534.method2424(var362.length() - 1);
                                client.field534.method2429(var362.substring(2));
                                continue;
                            }
                            String var366 = var362.toLowerCase();
                            byte var367 = 0;
                            if (var366.startsWith(class134.field2100)) {
                                var367 = 0;
                                var362 = var362.substring(class134.field2100.length());
                            } else if (var366.startsWith(class134.field2222)) {
                                var367 = 1;
                                var362 = var362.substring(class134.field2222.length());
                            } else if (var366.startsWith(class134.field2269)) {
                                var367 = 2;
                                var362 = var362.substring(class134.field2269.length());
                            } else if (var366.startsWith(class134.field2271)) {
                                var367 = 3;
                                var362 = var362.substring(class134.field2271.length());
                            } else if (var366.startsWith(class134.field2273)) {
                                var367 = 4;
                                var362 = var362.substring(class134.field2273.length());
                            } else if (var366.startsWith(class134.field2275)) {
                                var367 = 5;
                                var362 = var362.substring(class134.field2275.length());
                            } else if (var366.startsWith(class134.field2277)) {
                                var367 = 6;
                                var362 = var362.substring(class134.field2277.length());
                            } else if (var366.startsWith(class134.field2283)) {
                                var367 = 7;
                                var362 = var362.substring(class134.field2283.length());
                            } else if (var366.startsWith(class134.field2281)) {
                                var367 = 8;
                                var362 = var362.substring(class134.field2281.length());
                            } else if (var366.startsWith(class134.field2320)) {
                                var367 = 9;
                                var362 = var362.substring(class134.field2320.length());
                            } else if (var366.startsWith(class134.field2285)) {
                                var367 = 10;
                                var362 = var362.substring(class134.field2285.length());
                            } else if (var366.startsWith(class134.field2287)) {
                                var367 = 11;
                                var362 = var362.substring(class134.field2287.length());
                            } else if (client.field702 != 0) {
                                if (var366.startsWith(class134.field2266)) {
                                    var367 = 0;
                                    var362 = var362.substring(class134.field2266.length());
                                } else if (var366.startsWith(class134.field2117)) {
                                    var367 = 1;
                                    var362 = var362.substring(class134.field2117.length());
                                } else if (var366.startsWith(class134.field2317)) {
                                    var367 = 2;
                                    var362 = var362.substring(class134.field2317.length());
                                } else if (var366.startsWith(class134.field2272)) {
                                    var367 = 3;
                                    var362 = var362.substring(class134.field2272.length());
                                } else if (var366.startsWith(class134.field2274)) {
                                    var367 = 4;
                                    var362 = var362.substring(class134.field2274.length());
                                } else if (var366.startsWith(class134.field2162)) {
                                    var367 = 5;
                                    var362 = var362.substring(class134.field2162.length());
                                } else if (var366.startsWith(class134.field2208)) {
                                    var367 = 6;
                                    var362 = var362.substring(class134.field2208.length());
                                } else if (var366.startsWith(class134.field2198)) {
                                    var367 = 7;
                                    var362 = var362.substring(class134.field2198.length());
                                } else if (var366.startsWith(class134.field2282)) {
                                    var367 = 8;
                                    var362 = var362.substring(class134.field2282.length());
                                } else if (var366.startsWith(class134.field2150)) {
                                    var367 = 9;
                                    var362 = var362.substring(class134.field2150.length());
                                } else if (var366.startsWith(class134.field2268)) {
                                    var367 = 10;
                                    var362 = var362.substring(class134.field2268.length());
                                } else if (var366.startsWith(class134.field2288)) {
                                    var367 = 11;
                                    var362 = var362.substring(class134.field2288.length());
                                }
                            }
                            String var368 = var362.toLowerCase();
                            byte var369 = 0;
                            if (var368.startsWith(class134.field2289)) {
                                var369 = 1;
                                var362 = var362.substring(class134.field2289.length());
                            } else if (var368.startsWith(class134.field2270)) {
                                var369 = 2;
                                var362 = var362.substring(class134.field2270.length());
                            } else if (var368.startsWith(class134.field2293)) {
                                var369 = 3;
                                var362 = var362.substring(class134.field2293.length());
                            } else if (var368.startsWith(class134.field2295)) {
                                var369 = 4;
                                var362 = var362.substring(class134.field2295.length());
                            } else if (var368.startsWith(class134.field2297)) {
                                var369 = 5;
                                var362 = var362.substring(class134.field2297.length());
                            } else if (client.field702 != 0) {
                                if (var368.startsWith(class134.field2290)) {
                                    var369 = 1;
                                    var362 = var362.substring(class134.field2290.length());
                                } else if (var368.startsWith(class134.field2107)) {
                                    var369 = 2;
                                    var362 = var362.substring(class134.field2107.length());
                                } else if (var368.startsWith(class134.field2294)) {
                                    var369 = 3;
                                    var362 = var362.substring(class134.field2294.length());
                                } else if (var368.startsWith(class134.field2214)) {
                                    var369 = 4;
                                    var362 = var362.substring(class134.field2214.length());
                                } else if (var368.startsWith(class134.field2298)) {
                                    var369 = 5;
                                    var362 = var362.substring(class134.field2298.length());
                                }
                            }
                            client.field534.method2317(32);
                            client.field534.method2424(0);
                            int var370 = client.field534.field2059;
                            client.field534.method2424(var367);
                            client.field534.method2424(var369);
                            class116 var371 = client.field534;
                            int var372 = var371.field2059;
                            byte[] var373 = class149.method1549(var362);
                            var371.method2436(var373.length);
                            var371.field2059 += Statics.field2466.method2363(var373, 0, var373.length, var371.field2061, var371.field2059);
                            client.field534.method2435(client.field534.field2059 - var370);
                            continue;
                        }
                        if (var389 == 5009) {
                            var5 -= 2;
                            String var374 = field420[var5];
                            String var375 = field420[var5 + 1];
                            client.field534.method2317(107);
                            client.field534.method2641(0);
                            int var376 = client.field534.field2059;
                            client.field534.method2429(var374);
                            class116 var377 = client.field534;
                            int var378 = var377.field2059;
                            byte[] var379 = class149.method1549(var375);
                            var377.method2436(var379.length);
                            var377.field2059 += Statics.field2466.method2363(var379, 0, var379.length, var377.field2061, var377.field2059);
                            client.field534.method2551(client.field534.field2059 - var376);
                            continue;
                        }
                        if (var389 == 5010) {
                            var4--;
                            int var380 = field426[var4];
                            String var381 = null;
                            if (var380 < 100) {
                                var381 = client.field590[var380];
                            }
                            if (var381 == null) {
                                var381 = "";
                            }
                            field420[var5++] = var381;
                            continue;
                        }
                        if (var389 == 5011) {
                            var4--;
                            int var382 = field426[var4];
                            String var383 = null;
                            if (var382 < 100) {
                                var383 = client.field521[var382];
                            }
                            if (var383 == null) {
                                var383 = "";
                            }
                            field420[var5++] = var383;
                            continue;
                        }
                        if (var389 == 5015) {
                            String var384;
                            if (Statics.field1431 == null || Statics.field1431.field51 == null) {
                                var384 = "";
                            } else {
                                var384 = Statics.field1431.field51;
                            }
                            field420[var5++] = var384;
                            continue;
                        }
                        if (var389 == 5016) {
                            field426[var4++] = client.field714;
                            continue;
                        }
                        if (var389 == 5017) {
                            field426[var4++] = client.field671;
                            continue;
                        }
                    }
                } else {
                    class158 var70;
                    if (var389 >= 2000) {
                        var389 -= 1000;
                        var4--;
                        var70 = class158.method44(field426[var4]);
                    } else {
                        var70 = var47 ? Statics.field277 : Statics.field404;
                    }
                    if (var389 == 1300) {
                        var4--;
                        int var71 = field426[var4] - 1;
                        if (var71 >= 0 && var71 <= 9) {
                            var5--;
                            var70.method3121(var71, field420[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var389 == 1301) {
                        var4 -= 2;
                        int var72 = field426[var4];
                        int var73 = field426[var4 + 1];
                        var70.field2654 = class158.method140(var72, var73);
                        continue;
                    }
                    if (var389 == 1302) {
                        var4--;
                        var70.field2704 = field426[var4] == 1;
                        continue;
                    }
                    if (var389 == 1303) {
                        var4--;
                        var70.field2591 = field426[var4];
                        continue;
                    }
                    if (var389 == 1304) {
                        var4--;
                        var70.field2656 = field426[var4];
                        continue;
                    }
                    if (var389 == 1305) {
                        var5--;
                        var70.field2630 = field420[var5];
                        continue;
                    }
                    if (var389 == 1306) {
                        var5--;
                        var70.field2658 = field420[var5];
                        continue;
                    }
                    if (var389 == 1307) {
                        var70.field2653 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var388) {
            StringBuilder var386 = new StringBuilder(30);
            var386.append("").append(var3.field2821).append(" ");
            for (int var387 = field421 - 1; var387 >= 0; var387--) {
                var386.append("").append(field422[var387].field278.field2821).append(" ");
            }
            var386.append("").append(var9);
            class80.method3170(var386.toString(), var388);
        }
    }

    @ObfuscatedName("o.l(IB)V")
    public static void method159(int arg0) {
        if (arg0 == -1 || !class158.method2694(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2708[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3.field2675 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field18 = var3.field2675;
                method227(var4);
            }
        }
    }
}
