package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ax")
public class class27 {

    @ObfuscatedName("ax.j")
    public static int[] field425 = new int[5];

    @ObfuscatedName("ax.z")
    public static int[][] field431 = new int[5][5000];

    @ObfuscatedName("ax.m")
    public static int[] field426 = new int[1000];

    @ObfuscatedName("ax.w")
    public static String[] field428 = new String[1000];

    @ObfuscatedName("ax.a")
    public static int field434 = 0;

    @ObfuscatedName("ax.d")
    public static class18[] field430 = new class18[50];

    @ObfuscatedName("ax.t")
    public static Calendar field436 = Calendar.getInstance();

    @ObfuscatedName("ax.g")
    public static final String[] field432 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class27() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.e(Le;I)V")
    public static void method865(class1 arg0) {
        method1406(arg0, 200000);
    }

    @ObfuscatedName("bq.i(Le;II)V")
    public static void method1406(class1 arg0, int arg1) {
        Object[] var2 = arg0.field12;
        int var3 = (Integer) var2[0];
        class5 var4 = class5.method2731(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field72;
        int[] var9 = var4.field73;
        byte var10 = -1;
        field434 = 0;
        try {
            Statics.field423 = new int[var4.field83];
            int var11 = 0;
            Statics.field424 = new String[var4.field81];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field14;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2626;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2696;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2626;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2696;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field19;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field3;
                    }
                    Statics.field423[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field424[var12++] = var15;
                }
            }
            int var16 = 0;
            label2614: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var372 = var8[var7];
                if (var372 < 100) {
                    if (var372 == 0) {
                        field426[var5++] = var9[var7];
                        continue;
                    }
                    if (var372 == 1) {
                        int var17 = var9[var7];
                        field426[var5++] = class162.field2748[var17];
                        continue;
                    }
                    if (var372 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class162.field2748[var18] = field426[var5];
                        client.method3012(var18);
                        continue;
                    }
                    if (var372 == 3) {
                        field428[var6++] = var4.field74[var7];
                        continue;
                    }
                    if (var372 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var372 == 7) {
                        var5 -= 2;
                        if (field426[var5 + 1] != field426[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var372 == 8) {
                        var5 -= 2;
                        if (field426[var5 + 1] == field426[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var372 == 9) {
                        var5 -= 2;
                        if (field426[var5] < field426[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var372 == 10) {
                        var5 -= 2;
                        if (field426[var5] > field426[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var372 == 21) {
                        if (field434 == 0) {
                            return;
                        }
                        class18 var19 = field430[--field434];
                        var4 = var19.field280;
                        var8 = var4.field72;
                        var9 = var4.field73;
                        var7 = var19.field270;
                        Statics.field423 = var19.field285;
                        Statics.field424 = var19.field273;
                        continue;
                    }
                    if (var372 == 25) {
                        int var20 = var9[var7];
                        field426[var5++] = class162.method3010(var20);
                        continue;
                    }
                    if (var372 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class162.method43(var21, field426[var5]);
                        continue;
                    }
                    if (var372 == 31) {
                        var5 -= 2;
                        if (field426[var5] <= field426[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var372 == 32) {
                        var5 -= 2;
                        if (field426[var5] >= field426[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var372 == 33) {
                        field426[var5++] = Statics.field423[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var372 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field423[var10001] = field426[var5];
                        continue;
                    }
                    if (var372 == 35) {
                        field428[var6++] = Statics.field424[var9[var7]];
                        continue;
                    }
                    if (var372 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field424[var10001] = field428[var6];
                        continue;
                    }
                    if (var372 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field428;
                        String var24;
                        if (var22 == 0) {
                            var24 = "";
                        } else if (var22 == 1) {
                            String var25 = var23[var6];
                            if (var25 == null) {
                                var24 = "null";
                            } else {
                                var24 = var25.toString();
                            }
                        } else {
                            int var26 = var6 + var22;
                            int var27 = 0;
                            for (int var28 = var6; var28 < var26; var28++) {
                                String var29 = var23[var28];
                                if (var29 == null) {
                                    var27 += 4;
                                } else {
                                    var27 += var29.length();
                                }
                            }
                            StringBuilder var30 = new StringBuilder(var27);
                            for (int var31 = var6; var31 < var26; var31++) {
                                String var32 = var23[var31];
                                if (var32 == null) {
                                    var30.append("null");
                                } else {
                                    var30.append(var32);
                                }
                            }
                            var24 = var30.toString();
                        }
                        field428[var6++] = var24;
                        continue;
                    }
                    if (var372 == 38) {
                        var5--;
                        continue;
                    }
                    if (var372 == 39) {
                        var6--;
                        continue;
                    }
                    if (var372 == 40) {
                        int var34 = var9[var7];
                        class5 var35 = class5.method2731(var34);
                        int[] var36 = new int[var35.field83];
                        String[] var37 = new String[var35.field81];
                        for (int var38 = 0; var38 < var35.field75; var38++) {
                            var36[var38] = field426[var5 - var35.field75 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field78; var39++) {
                            var37[var39] = field428[var6 - var35.field78 + var39];
                        }
                        var5 -= var35.field75;
                        var6 -= var35.field78;
                        class18 var40 = new class18();
                        var40.field280 = var4;
                        var40.field270 = var7;
                        var40.field285 = Statics.field423;
                        var40.field273 = Statics.field424;
                        field430[++field434 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field72;
                        var9 = var35.field73;
                        var7 = -1;
                        Statics.field423 = var36;
                        Statics.field424 = var37;
                        continue;
                    }
                    if (var372 == 42) {
                        field426[var5++] = client.field564[var9[var7]];
                        continue;
                    }
                    if (var372 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field564[var10001] = field426[var5];
                        continue;
                    }
                    if (var372 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field426[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field425[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2614;
                                }
                                field431[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var372 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field426[var5];
                        if (var47 >= 0 && var47 < field425[var46]) {
                            field426[var5++] = field431[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var372 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field426[var5];
                        if (var49 >= 0 && var49 < field425[var48]) {
                            field431[var48][var49] = field426[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var372 == 47) {
                        String var50 = client.field692[var9[var7]];
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field428[var6++] = var50;
                        continue;
                    }
                    if (var372 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field692[var10001] = field428[var6];
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var372 < 1000) {
                    if (var372 == 100) {
                        var5 -= 3;
                        int var52 = field426[var5];
                        int var53 = field426[var5 + 1];
                        int var54 = field426[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class161 var55 = class161.method2772(var52);
                        if (var55.field2734 == null) {
                            var55.field2734 = new class161[var54 + 1];
                        }
                        if (var55.field2734.length <= var54) {
                            class161[] var56 = new class161[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2734.length; var57++) {
                                var56[var57] = var55.field2734[var57];
                            }
                            var55.field2734 = var56;
                        }
                        if (var54 > 0 && var55.field2734[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class161 var58 = new class161();
                        var58.field2628 = var53;
                        var58.field2637 = var58.field2626 = var55.field2626;
                        var58.field2696 = var54;
                        var58.field2625 = true;
                        var55.field2734[var54] = var58;
                        if (var51) {
                            Statics.field2350 = var58;
                        } else {
                            Statics.field2100 = var58;
                        }
                        client.method2218(var55);
                        continue;
                    }
                    if (var372 == 101) {
                        class161 var59 = var51 ? Statics.field2350 : Statics.field2100;
                        class161 var60 = class161.method2772(var59.field2626);
                        var60.field2734[var59.field2696] = null;
                        client.method2218(var60);
                        continue;
                    }
                    if (var372 == 102) {
                        var5--;
                        class161 var61 = class161.method2772(field426[var5]);
                        var61.field2734 = null;
                        client.method2218(var61);
                        continue;
                    }
                    if (var372 == 200) {
                        var5 -= 2;
                        int var62 = field426[var5];
                        int var63 = field426[var5 + 1];
                        class161 var64 = Statics.method2956(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field426[var5++] = 1;
                            if (var51) {
                                Statics.field2350 = var64;
                            } else {
                                Statics.field2100 = var64;
                            }
                            continue;
                        }
                        field426[var5++] = 0;
                        continue;
                    }
                } else if (!(var372 < 1000 || var372 >= 1100) || !(var372 < 2000 || var372 >= 2100)) {
                    class161 var65;
                    if (var372 >= 2000) {
                        var372 -= 1000;
                        var5--;
                        var65 = class161.method2772(field426[var5]);
                    } else {
                        var65 = var51 ? Statics.field2350 : Statics.field2100;
                    }
                    if (var372 == 1000) {
                        var5 -= 2;
                        var65.field2631 = field426[var5];
                        var65.field2632 = field426[var5 + 1];
                        client.method2218(var65);
                        continue;
                    }
                    if (var372 == 1001) {
                        var5 -= 2;
                        var65.field2635 = field426[var5];
                        var65.field2624 = field426[var5 + 1];
                        client.method2218(var65);
                        continue;
                    }
                    if (var372 == 1003) {
                        var5--;
                        boolean var66 = field426[var5] == 1;
                        if (var65.field2638 != var66) {
                            var65.field2638 = var66;
                            client.method2218(var65);
                        }
                        continue;
                    }
                } else if (!(var372 < 1100 || var372 >= 1200) || !(var372 < 2100 || var372 >= 2200)) {
                    class161 var67;
                    if (var372 >= 2000) {
                        var372 -= 1000;
                        var5--;
                        var67 = class161.method2772(field426[var5]);
                    } else {
                        var67 = var51 ? Statics.field2350 : Statics.field2100;
                    }
                    if (var372 == 1100) {
                        var5 -= 2;
                        var67.field2639 = field426[var5];
                        if (var67.field2639 > var67.field2641 - var67.field2635) {
                            var67.field2639 = var67.field2641 - var67.field2635;
                        }
                        if (var67.field2639 < 0) {
                            var67.field2639 = 0;
                        }
                        var67.field2640 = field426[var5 + 1];
                        if (var67.field2640 > var67.field2654 - var67.field2624) {
                            var67.field2640 = var67.field2654 - var67.field2624;
                        }
                        if (var67.field2640 < 0) {
                            var67.field2640 = 0;
                        }
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1101) {
                        var5--;
                        var67.field2643 = field426[var5];
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1102) {
                        var5--;
                        var67.field2647 = field426[var5] == 1;
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1103) {
                        var5--;
                        var67.field2712 = field426[var5];
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1104) {
                        var5--;
                        var67.field2649 = field426[var5];
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1105) {
                        var5--;
                        var67.field2650 = field426[var5];
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1106) {
                        var5--;
                        var67.field2681 = field426[var5];
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1107) {
                        var5--;
                        var67.field2711 = field426[var5] == 1;
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1108) {
                        var67.field2658 = 1;
                        var5--;
                        var67.field2652 = field426[var5];
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1109) {
                        var5 -= 6;
                        var67.field2664 = field426[var5];
                        var67.field2709 = field426[var5 + 1];
                        var67.field2666 = field426[var5 + 2];
                        var67.field2673 = field426[var5 + 3];
                        var67.field2668 = field426[var5 + 4];
                        var67.field2669 = field426[var5 + 5];
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1110) {
                        var5--;
                        int var68 = field426[var5];
                        if (var67.field2662 != var68) {
                            var67.field2662 = var68;
                            var67.field2732 = 0;
                            var67.field2733 = 0;
                            client.method2218(var67);
                        }
                        continue;
                    }
                    if (var372 == 1111) {
                        var5--;
                        var67.field2619 = field426[var5] == 1;
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1112) {
                        var6--;
                        String var69 = field428[var6];
                        if (!var69.equals(var67.field2705)) {
                            var67.field2705 = var69;
                            client.method2218(var67);
                        }
                        continue;
                    }
                    if (var372 == 1113) {
                        var5--;
                        var67.field2672 = field426[var5];
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1114) {
                        var5 -= 3;
                        var67.field2676 = field426[var5];
                        var67.field2677 = field426[var5 + 1];
                        var67.field2675 = field426[var5 + 2];
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1115) {
                        var5--;
                        var67.field2678 = field426[var5] == 1;
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1116) {
                        var5--;
                        var67.field2648 = field426[var5];
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1117) {
                        var5--;
                        var67.field2655 = field426[var5];
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1118) {
                        var5--;
                        var67.field2656 = field426[var5] == 1;
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1119) {
                        var5--;
                        var67.field2657 = field426[var5] == 1;
                        client.method2218(var67);
                        continue;
                    }
                    if (var372 == 1120) {
                        var5 -= 2;
                        var67.field2641 = field426[var5];
                        var67.field2654 = field426[var5 + 1];
                        client.method2218(var67);
                        continue;
                    }
                } else if (!(var372 < 1200 || var372 >= 1300) || !(var372 < 2200 || var372 >= 2300)) {
                    class161 var70;
                    if (var372 >= 2000) {
                        var372 -= 1000;
                        var5--;
                        var70 = class161.method2772(field426[var5]);
                    } else {
                        var70 = var51 ? Statics.field2350 : Statics.field2100;
                    }
                    client.method2218(var70);
                    if (var372 == 1200) {
                        var5 -= 2;
                        int var71 = field426[var5];
                        int var72 = field426[var5 + 1];
                        var70.field2659 = var71;
                        var70.field2731 = var72;
                        class41 var73 = class41.method2718(var71);
                        var70.field2666 = var73.field1025;
                        var70.field2673 = var73.field1010;
                        var70.field2668 = var73.field1011;
                        var70.field2664 = var73.field1012;
                        var70.field2709 = var73.field1013;
                        var70.field2669 = var73.field1008;
                        if (var70.field2635 > 0) {
                            var70.field2669 = var70.field2669 * 32 / var70.field2635;
                        }
                        continue;
                    }
                    if (var372 == 1201) {
                        var70.field2658 = 2;
                        var5--;
                        var70.field2652 = field426[var5];
                        continue;
                    }
                    if (var372 == 1202) {
                        var70.field2658 = 3;
                        var70.field2652 = Statics.field1383.field37.method3228();
                        continue;
                    }
                } else if (var372 >= 1300 && var372 < 1400 || var372 >= 2300 && var372 < 2400) {
                    class161 var74;
                    if (var372 >= 2000) {
                        var372 -= 1000;
                        var5--;
                        var74 = class161.method2772(field426[var5]);
                    } else {
                        var74 = var51 ? Statics.field2350 : Statics.field2100;
                    }
                    if (var372 == 1300) {
                        var5--;
                        int var75 = field426[var5] - 1;
                        if (var75 >= 0 && var75 <= 9) {
                            var6--;
                            var74.method3147(var75, field428[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var372 == 1301) {
                        var5 -= 2;
                        int var76 = field426[var5];
                        int var77 = field426[var5 + 1];
                        var74.field2688 = Statics.method2956(var76, var77);
                        continue;
                    }
                    if (var372 == 1302) {
                        var5--;
                        var74.field2710 = field426[var5] == 1;
                        continue;
                    }
                    if (var372 == 1303) {
                        var5--;
                        var74.field2727 = field426[var5];
                        continue;
                    }
                    if (var372 == 1304) {
                        var5--;
                        var74.field2690 = field426[var5];
                        continue;
                    }
                    if (var372 == 1305) {
                        var6--;
                        var74.field2645 = field428[var6];
                        continue;
                    }
                    if (var372 == 1306) {
                        var6--;
                        var74.field2692 = field428[var6];
                        continue;
                    }
                    if (var372 == 1307) {
                        var74.field2651 = null;
                        continue;
                    }
                } else {
                    if (var372 >= 1400 && var372 < 1500 || var372 >= 2400 && var372 < 2500) {
                        class161 var78;
                        if (var372 >= 2000) {
                            var372 -= 1000;
                            var5--;
                            var78 = class161.method2772(field426[var5]);
                        } else {
                            var78 = var51 ? Statics.field2350 : Statics.field2100;
                        }
                        var6--;
                        String var79 = field428[var6];
                        int[] var80 = null;
                        if (var79.length() > 0 && var79.charAt(var79.length() - 1) == 'Y') {
                            var5--;
                            int var81 = field426[var5];
                            if (var81 > 0) {
                                var80 = new int[var81];
                                while (var81-- > 0) {
                                    var5--;
                                    var80[var81] = field426[var5];
                                }
                            }
                            var79 = var79.substring(0, var79.length() - 1);
                        }
                        Object[] var82 = new Object[var79.length() + 1];
                        for (int var83 = var82.length - 1; var83 >= 1; var83--) {
                            if (var79.charAt(var83 - 1) == 's') {
                                var6--;
                                var82[var83] = field428[var6];
                            } else {
                                var5--;
                                var82[var83] = Integer.valueOf(field426[var5]);
                            }
                        }
                        var5--;
                        int var84 = field426[var5];
                        if (var84 == -1) {
                            var82 = null;
                        } else {
                            var82[0] = Integer.valueOf(var84);
                        }
                        if (var372 == 1400) {
                            var78.field2653 = var82;
                        }
                        if (var372 == 1401) {
                            var78.field2698 = var82;
                        }
                        if (var372 == 1402) {
                            var78.field2697 = var82;
                        }
                        if (var372 == 1403) {
                            var78.field2721 = var82;
                        }
                        if (var372 == 1404) {
                            var78.field2701 = var82;
                        }
                        if (var372 == 1405) {
                            var78.field2702 = var82;
                        }
                        if (var372 == 1406) {
                            var78.field2703 = var82;
                        }
                        if (var372 == 1407) {
                            var78.field2706 = var82;
                            var78.field2707 = var80;
                        }
                        if (var372 == 1408) {
                            var78.field2735 = var82;
                        }
                        if (var372 == 1409) {
                            var78.field2713 = var82;
                        }
                        if (var372 == 1410) {
                            var78.field2691 = var82;
                        }
                        if (var372 == 1411) {
                            var78.field2699 = var82;
                        }
                        if (var372 == 1412) {
                            var78.field2700 = var82;
                        }
                        if (var372 == 1414) {
                            var78.field2687 = var82;
                            var78.field2686 = var80;
                        }
                        if (var372 == 1415) {
                            var78.field2693 = var82;
                            var78.field2671 = var80;
                        }
                        if (var372 == 1416) {
                            var78.field2704 = var82;
                        }
                        if (var372 == 1417) {
                            var78.field2714 = var82;
                        }
                        if (var372 == 1418) {
                            var78.field2715 = var82;
                        }
                        if (var372 == 1419) {
                            var78.field2716 = var82;
                        }
                        if (var372 == 1420) {
                            var78.field2717 = var82;
                        }
                        if (var372 == 1421) {
                            var78.field2718 = var82;
                        }
                        if (var372 == 1422) {
                            var78.field2719 = var82;
                        }
                        if (var372 == 1423) {
                            var78.field2689 = var82;
                        }
                        if (var372 == 1424) {
                            var78.field2665 = var82;
                        }
                        var78.field2644 = true;
                        continue;
                    }
                    if (var372 < 1600) {
                        class161 var85 = var51 ? Statics.field2350 : Statics.field2100;
                        if (var372 == 1500) {
                            field426[var5++] = var85.field2631;
                            continue;
                        }
                        if (var372 == 1501) {
                            field426[var5++] = var85.field2632;
                            continue;
                        }
                        if (var372 == 1502) {
                            field426[var5++] = var85.field2635;
                            continue;
                        }
                        if (var372 == 1503) {
                            field426[var5++] = var85.field2624;
                            continue;
                        }
                        if (var372 == 1504) {
                            field426[var5++] = var85.field2638 ? 1 : 0;
                            continue;
                        }
                        if (var372 == 1505) {
                            field426[var5++] = var85.field2637;
                            continue;
                        }
                    } else if (var372 < 1700) {
                        class161 var86 = var51 ? Statics.field2350 : Statics.field2100;
                        if (var372 == 1600) {
                            field426[var5++] = var86.field2639;
                            continue;
                        }
                        if (var372 == 1601) {
                            field426[var5++] = var86.field2640;
                            continue;
                        }
                        if (var372 == 1602) {
                            field428[var6++] = var86.field2705;
                            continue;
                        }
                        if (var372 == 1603) {
                            field426[var5++] = var86.field2641;
                            continue;
                        }
                        if (var372 == 1604) {
                            field426[var5++] = var86.field2654;
                            continue;
                        }
                        if (var372 == 1605) {
                            field426[var5++] = var86.field2669;
                            continue;
                        }
                        if (var372 == 1606) {
                            field426[var5++] = var86.field2666;
                            continue;
                        }
                        if (var372 == 1607) {
                            field426[var5++] = var86.field2668;
                            continue;
                        }
                        if (var372 == 1608) {
                            field426[var5++] = var86.field2673;
                            continue;
                        }
                    } else if (var372 < 1800) {
                        class161 var87 = var51 ? Statics.field2350 : Statics.field2100;
                        if (var372 == 1700) {
                            field426[var5++] = var87.field2659;
                            continue;
                        }
                        if (var372 == 1701) {
                            if (var87.field2659 == -1) {
                                field426[var5++] = 0;
                            } else {
                                field426[var5++] = var87.field2731;
                            }
                            continue;
                        }
                        if (var372 == 1702) {
                            field426[var5++] = var87.field2696;
                            continue;
                        }
                    } else if (var372 < 1900) {
                        class161 var88 = var51 ? Statics.field2350 : Statics.field2100;
                        if (var372 == 1800) {
                            field426[var5++] = class165.method1470(Statics.method129(var88));
                            continue;
                        }
                        if (var372 == 1801) {
                            var5--;
                            int var89 = field426[var5];
                            int var373 = var89 - 1;
                            if (var88.field2651 != null && var373 < var88.field2651.length && var88.field2651[var373] != null) {
                                field428[var6++] = var88.field2651[var373];
                                continue;
                            }
                            field428[var6++] = "";
                            continue;
                        }
                        if (var372 == 1802) {
                            if (var88.field2645 == null) {
                                field428[var6++] = "";
                            } else {
                                field428[var6++] = var88.field2645;
                            }
                            continue;
                        }
                    } else if (var372 < 2600) {
                        var5--;
                        class161 var90 = class161.method2772(field426[var5]);
                        if (var372 == 2500) {
                            field426[var5++] = var90.field2631;
                            continue;
                        }
                        if (var372 == 2501) {
                            field426[var5++] = var90.field2632;
                            continue;
                        }
                        if (var372 == 2502) {
                            field426[var5++] = var90.field2635;
                            continue;
                        }
                        if (var372 == 2503) {
                            field426[var5++] = var90.field2624;
                            continue;
                        }
                        if (var372 == 2504) {
                            field426[var5++] = var90.field2638 ? 1 : 0;
                            continue;
                        }
                        if (var372 == 2505) {
                            field426[var5++] = var90.field2637;
                            continue;
                        }
                    } else if (var372 < 2700) {
                        var5--;
                        class161 var91 = class161.method2772(field426[var5]);
                        if (var372 == 2600) {
                            field426[var5++] = var91.field2639;
                            continue;
                        }
                        if (var372 == 2601) {
                            field426[var5++] = var91.field2640;
                            continue;
                        }
                        if (var372 == 2602) {
                            field428[var6++] = var91.field2705;
                            continue;
                        }
                        if (var372 == 2603) {
                            field426[var5++] = var91.field2641;
                            continue;
                        }
                        if (var372 == 2604) {
                            field426[var5++] = var91.field2654;
                            continue;
                        }
                        if (var372 == 2605) {
                            field426[var5++] = var91.field2669;
                            continue;
                        }
                        if (var372 == 2606) {
                            field426[var5++] = var91.field2666;
                            continue;
                        }
                        if (var372 == 2607) {
                            field426[var5++] = var91.field2668;
                            continue;
                        }
                        if (var372 == 2608) {
                            field426[var5++] = var91.field2673;
                            continue;
                        }
                    } else if (var372 < 2800) {
                        if (var372 == 2700) {
                            var5--;
                            class161 var92 = class161.method2772(field426[var5]);
                            field426[var5++] = var92.field2659;
                            continue;
                        }
                        if (var372 == 2701) {
                            var5--;
                            class161 var93 = class161.method2772(field426[var5]);
                            if (var93.field2659 == -1) {
                                field426[var5++] = 0;
                            } else {
                                field426[var5++] = var93.field2731;
                            }
                            continue;
                        }
                        if (var372 == 2702) {
                            var5--;
                            int var94 = field426[var5];
                            class4 var95 = (class4) client.field658.method3314((long) var94);
                            if (var95 == null) {
                                field426[var5++] = 0;
                            } else {
                                field426[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var372 < 2900) {
                        var5--;
                        class161 var96 = class161.method2772(field426[var5]);
                        if (var372 == 2800) {
                            field426[var5++] = class165.method1470(Statics.method129(var96));
                            continue;
                        }
                        if (var372 == 2801) {
                            var5--;
                            int var97 = field426[var5];
                            int var374 = var97 - 1;
                            if (var96.field2651 != null && var374 < var96.field2651.length && var96.field2651[var374] != null) {
                                field428[var6++] = var96.field2651[var374];
                                continue;
                            }
                            field428[var6++] = "";
                            continue;
                        }
                        if (var372 == 2802) {
                            if (var96.field2645 == null) {
                                field428[var6++] = "";
                            } else {
                                field428[var6++] = var96.field2645;
                            }
                            continue;
                        }
                    } else if (var372 < 3200) {
                        if (var372 == 3100) {
                            var6--;
                            String var98 = field428[var6];
                            client.method1883(0, "", var98);
                            continue;
                        }
                        if (var372 == 3101) {
                            var5 -= 2;
                            client.method835(Statics.field1383, field426[var5], field426[var5 + 1]);
                            continue;
                        }
                        if (var372 == 3103) {
                            client.field543.method2333(114);
                            for (class4 var99 = (class4) client.field658.method3313(); var99 != null; var99 = (class4) client.field658.method3323()) {
                                if (var99.field58 == 0 || var99.field58 == 3) {
                                    client.method131(var99, true);
                                }
                            }
                            if (client.field661 != null) {
                                client.method2218(client.field661);
                                client.field661 = null;
                            }
                            continue;
                        }
                        if (var372 == 3104) {
                            var6--;
                            String var100 = field428[var6];
                            int var101 = 0;
                            boolean var102 = false;
                            boolean var103 = false;
                            int var104 = 0;
                            int var105 = var100.length();
                            int var106 = 0;
                            boolean var108;
                            while (true) {
                                if (var106 >= var105) {
                                    var108 = var103;
                                    break;
                                }
                                label2808: {
                                    char var107 = var100.charAt(var106);
                                    if (var106 == 0) {
                                        if (var107 == '-') {
                                            var102 = true;
                                            break label2808;
                                        }
                                        if (var107 == '+') {
                                            break label2808;
                                        }
                                    }
                                    int var375;
                                    if (var107 >= '0' && var107 <= '9') {
                                        var375 = var107 - '0';
                                    } else if (var107 >= 'A' && var107 <= 'Z') {
                                        var375 = var107 - '7';
                                    } else {
                                        if (var107 < 'a' || var107 > 'z') {
                                            var108 = false;
                                            break;
                                        }
                                        var375 = var107 - 'W';
                                    }
                                    if (var375 >= 10) {
                                        var108 = false;
                                        break;
                                    }
                                    if (var102) {
                                        var375 = -var375;
                                    }
                                    int var109 = var104 * 10 + var375;
                                    if (var109 / 10 != var104) {
                                        var108 = false;
                                        break;
                                    }
                                    var104 = var109;
                                    var103 = true;
                                }
                                var106++;
                            }
                            if (var108) {
                                int var111 = class150.method2723(var100, 10, true);
                                var101 = var111;
                            }
                            client.field543.method2333(151);
                            client.field543.method2454(var101);
                            continue;
                        }
                        if (var372 == 3105) {
                            var6--;
                            String var112 = field428[var6];
                            client.field543.method2333(25);
                            client.field543.method2634(var112.length() + 1);
                            client.field543.method2445(var112);
                            continue;
                        }
                        if (var372 == 3106) {
                            var6--;
                            String var113 = field428[var6];
                            client.field543.method2333(24);
                            client.field543.method2634(var113.length() + 1);
                            client.field543.method2445(var113);
                            continue;
                        }
                        if (var372 == 3107) {
                            var5--;
                            int var114 = field426[var5];
                            var6--;
                            String var115 = field428[var6];
                            boolean var116 = false;
                            for (int var117 = 0; var117 < client.field585; var117++) {
                                class3 var118 = client.field678[client.field734[var117]];
                                if (var118 != null && var118.field52 != null && var118.field52.equalsIgnoreCase(var115)) {
                                    if (var114 == 1) {
                                        client.field543.method2333(173);
                                        client.field543.method2476(0);
                                        client.field543.method2484(client.field734[var117]);
                                    } else if (var114 == 4) {
                                        client.field543.method2333(209);
                                        client.field543.method2484(client.field734[var117]);
                                        client.field543.method2476(0);
                                    } else if (var114 == 6) {
                                        client.field543.method2333(251);
                                        client.field543.method2449(client.field734[var117]);
                                        client.field543.method2477(0);
                                    } else if (var114 == 7) {
                                        client.field543.method2333(43);
                                        client.field543.method2476(0);
                                        client.field543.method2483(client.field734[var117]);
                                    }
                                    var116 = true;
                                    break;
                                }
                            }
                            if (!var116) {
                                client.method1883(4, "", class137.field2245 + var115);
                            }
                            continue;
                        }
                        if (var372 == 3108) {
                            var5 -= 3;
                            int var119 = field426[var5];
                            int var120 = field426[var5 + 1];
                            int var121 = field426[var5 + 2];
                            class161 var122 = class161.method2772(var121);
                            client.method2727(var122, var119, var120);
                            continue;
                        }
                        if (var372 == 3109) {
                            var5 -= 2;
                            int var123 = field426[var5];
                            int var124 = field426[var5 + 1];
                            class161 var125 = var51 ? Statics.field2350 : Statics.field2100;
                            client.method2727(var125, var123, var124);
                            continue;
                        }
                        if (var372 == 3110) {
                            var5--;
                            Statics.field2078 = field426[var5] == 1;
                            continue;
                        }
                        if (var372 == 3111) {
                            field426[var5++] = Statics.field197.field195 ? 1 : 0;
                            continue;
                        }
                        if (var372 == 3112) {
                            var5--;
                            Statics.field197.field195 = field426[var5] == 1;
                            class12.method1540();
                            continue;
                        }
                    } else if (var372 < 3300) {
                        if (var372 == 3200) {
                            var5 -= 3;
                            client.method2399(field426[var5], field426[var5 + 1], field426[var5 + 2]);
                            continue;
                        }
                        if (var372 == 3201) {
                            var5--;
                            int var126 = field426[var5];
                            if (var126 == -1 && !client.field640) {
                                Statics.field2373.method2797();
                                class141.field2377 = 1;
                                Statics.field2378 = null;
                            } else if (var126 != -1 && client.field755 != var126 && client.field546 != 0 && !client.field640) {
                                class141.method3256(2, Statics.field97, var126, 0, client.field546, false);
                            }
                            client.field755 = var126;
                            continue;
                        }
                        if (var372 == 3202) {
                            var5 -= 2;
                            client.method3258(field426[var5], field426[var5 + 1]);
                            continue;
                        }
                    } else if (var372 < 3400) {
                        if (var372 == 3300) {
                            field426[var5++] = client.field569;
                            continue;
                        }
                        if (var372 == 3301) {
                            var5 -= 2;
                            int var127 = field426[var5];
                            int var128 = field426[var5 + 1];
                            field426[var5++] = class19.method154(var127, var128);
                            continue;
                        }
                        if (var372 == 3302) {
                            var5 -= 2;
                            int var129 = field426[var5];
                            int var130 = field426[var5 + 1];
                            field426[var5++] = class19.method2738(var129, var130);
                            continue;
                        }
                        if (var372 == 3303) {
                            var5 -= 2;
                            int var131 = field426[var5];
                            int var132 = field426[var5 + 1];
                            int[] var133 = field426;
                            int var134 = var5++;
                            class19 var135 = (class19) class19.field292.method3314((long) var131);
                            int var136;
                            if (var135 == null) {
                                var136 = 0;
                            } else if (var132 == -1) {
                                var136 = 0;
                            } else {
                                int var137 = 0;
                                for (int var138 = 0; var138 < var135.field289.length; var138++) {
                                    if (var135.field287[var138] == var132) {
                                        var137 += var135.field289[var138];
                                    }
                                }
                                var136 = var137;
                            }
                            var133[var134] = var136;
                            continue;
                        }
                        if (var372 == 3304) {
                            var5--;
                            int var139 = field426[var5];
                            int[] var140 = field426;
                            int var141 = var5++;
                            class42 var142 = (class42) class42.field1051.method3262((long) var139);
                            class42 var143;
                            if (var142 == null) {
                                byte[] var144 = Statics.field1044.method3069(5, var139);
                                class42 var145 = new class42();
                                if (var144 != null) {
                                    var145.method929(new class128(var144));
                                }
                                class42.field1051.method3264(var145, (long) var139);
                                var143 = var145;
                            } else {
                                var143 = var142;
                            }
                            var140[var141] = var143.field1045;
                            continue;
                        }
                        if (var372 == 3305) {
                            var5--;
                            int var146 = field426[var5];
                            field426[var5++] = client.field635[var146];
                            continue;
                        }
                        if (var372 == 3306) {
                            var5--;
                            int var147 = field426[var5];
                            field426[var5++] = client.field703[var147];
                            continue;
                        }
                        if (var372 == 3307) {
                            var5--;
                            int var148 = field426[var5];
                            field426[var5++] = client.field712[var148];
                            continue;
                        }
                        if (var372 == 3308) {
                            int var149 = Statics.field2001;
                            int var150 = (Statics.field1383.field443 >> 7) + Statics.field949;
                            int var151 = (Statics.field1383.field439 >> 7) + Statics.field2063;
                            field426[var5++] = (var149 << 28) + (var150 << 14) + var151;
                            continue;
                        }
                        if (var372 == 3309) {
                            var5--;
                            int var152 = field426[var5];
                            field426[var5++] = var152 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var372 == 3310) {
                            var5--;
                            int var153 = field426[var5];
                            field426[var5++] = var153 >> 28;
                            continue;
                        }
                        if (var372 == 3311) {
                            var5--;
                            int var154 = field426[var5];
                            field426[var5++] = var154 & 0x3FFF;
                            continue;
                        }
                        if (var372 == 3312) {
                            field426[var5++] = client.field504 ? 1 : 0;
                            continue;
                        }
                        if (var372 == 3313) {
                            var5 -= 2;
                            int var155 = field426[var5] + 32768;
                            int var156 = field426[var5 + 1];
                            field426[var5++] = class19.method154(var155, var156);
                            continue;
                        }
                        if (var372 == 3314) {
                            var5 -= 2;
                            int var157 = field426[var5] + 32768;
                            int var158 = field426[var5 + 1];
                            int[] var159 = field426;
                            int var160 = var5++;
                            class19 var161 = (class19) class19.field292.method3314((long) var157);
                            int var162;
                            if (var161 == null) {
                                var162 = 0;
                            } else if (var158 >= 0 && var158 < var161.field289.length) {
                                var162 = var161.field289[var158];
                            } else {
                                var162 = 0;
                            }
                            var159[var160] = var162;
                            continue;
                        }
                        if (var372 == 3315) {
                            var5 -= 2;
                            int var163 = field426[var5] + 32768;
                            int var164 = field426[var5 + 1];
                            int[] var165 = field426;
                            int var166 = var5++;
                            class19 var167 = (class19) class19.field292.method3314((long) var163);
                            int var168;
                            if (var167 == null) {
                                var168 = 0;
                            } else if (var164 == -1) {
                                var168 = 0;
                            } else {
                                int var169 = 0;
                                for (int var170 = 0; var170 < var167.field289.length; var170++) {
                                    if (var167.field287[var170] == var164) {
                                        var169 += var167.field289[var170];
                                    }
                                }
                                var168 = var169;
                            }
                            var165[var166] = var168;
                            continue;
                        }
                        if (var372 == 3316) {
                            if (client.field718 >= 2) {
                                field426[var5++] = client.field718;
                            } else {
                                field426[var5++] = 0;
                            }
                            continue;
                        }
                        if (var372 == 3317) {
                            field426[var5++] = client.field691;
                            continue;
                        }
                        if (var372 == 3318) {
                            field426[var5++] = client.field603;
                            continue;
                        }
                        if (var372 == 3321) {
                            field426[var5++] = client.field662;
                            continue;
                        }
                        if (var372 == 3322) {
                            field426[var5++] = client.field663;
                            continue;
                        }
                        if (var372 == 3323) {
                            if (client.field671) {
                                field426[var5++] = 1;
                            } else {
                                field426[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var372 < 3500) {
                        if (var372 == 3400) {
                            var5 -= 2;
                            int var171 = field426[var5];
                            int var172 = field426[var5 + 1];
                            class40 var173 = class40.method2240(var171);
                            if (var173.field985 != 's') {
                            }
                            for (int var174 = 0; var174 < var173.field982; var174++) {
                                if (var173.field989[var174] == var172) {
                                    field428[var6++] = var173.field991[var174];
                                    var173 = null;
                                    break;
                                }
                            }
                            if (var173 != null) {
                                field428[var6++] = var173.field990;
                            }
                            continue;
                        }
                        if (var372 == 3408) {
                            var5 -= 4;
                            int var175 = field426[var5];
                            int var176 = field426[var5 + 1];
                            int var177 = field426[var5 + 2];
                            int var178 = field426[var5 + 3];
                            class40 var179 = class40.method2240(var177);
                            if (var179.field984 == var175 && var179.field985 == var176) {
                                for (int var180 = 0; var180 < var179.field982; var180++) {
                                    if (var179.field989[var180] == var178) {
                                        if (var176 == 115) {
                                            field428[var6++] = var179.field991[var180];
                                        } else {
                                            field426[var5++] = var179.field988[var180];
                                        }
                                        var179 = null;
                                        break;
                                    }
                                }
                                if (var179 != null) {
                                    if (var176 == 115) {
                                        field428[var6++] = var179.field990;
                                    } else {
                                        field426[var5++] = var179.field987;
                                    }
                                }
                                continue;
                            }
                            if (var176 == 115) {
                                field428[var6++] = "null";
                            } else {
                                field426[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var372 < 3700) {
                        if (var372 == 3600) {
                            if (client.field750 == 0) {
                                field426[var5++] = -2;
                            } else if (client.field750 == 1) {
                                field426[var5++] = -1;
                            } else {
                                field426[var5++] = client.field749;
                            }
                            continue;
                        }
                        if (var372 == 3601) {
                            var5--;
                            int var181 = field426[var5];
                            if (client.field750 == 2 && var181 < client.field749) {
                                field428[var6++] = client.field751[var181].field385;
                                continue;
                            }
                            field428[var6++] = "";
                            continue;
                        }
                        if (var372 == 3602) {
                            var5--;
                            int var182 = field426[var5];
                            if (client.field750 == 2 && var182 < client.field749) {
                                field426[var5++] = client.field751[var182].field387;
                                continue;
                            }
                            field426[var5++] = 0;
                            continue;
                        }
                        if (var372 == 3603) {
                            var5--;
                            int var183 = field426[var5];
                            if (client.field750 == 2 && var183 < client.field749) {
                                field426[var5++] = client.field751[var183].field388;
                                continue;
                            }
                            field426[var5++] = 0;
                            continue;
                        }
                        if (var372 == 3604) {
                            var6--;
                            String var184 = field428[var6];
                            var5--;
                            int var185 = field426[var5];
                            client.method2220(var184, var185);
                            continue;
                        }
                        if (var372 == 3605) {
                            var6--;
                            String var186 = field428[var6];
                            if (var186 == null) {
                                continue;
                            }
                            if ((client.field749 < 200 || client.field624 == 1) && client.field749 < 400) {
                                String var187 = class151.method1290(var186, Statics.field2446);
                                if (var187 == null) {
                                    continue;
                                }
                                for (int var188 = 0; var188 < client.field749; var188++) {
                                    class24 var189 = client.field751[var188];
                                    String var190 = class151.method1290(var189.field385, Statics.field2446);
                                    if (var190 != null && var190.equals(var187)) {
                                        client.method1883(30, "", var186 + class137.field2263);
                                        continue label2614;
                                    }
                                    if (var189.field386 != null) {
                                        String var191 = class151.method1290(var189.field386, Statics.field2446);
                                        if (var191 != null && var191.equals(var187)) {
                                            client.method1883(30, "", var186 + class137.field2263);
                                            continue label2614;
                                        }
                                    }
                                }
                                for (int var192 = 0; var192 < client.field753; var192++) {
                                    class11 var193 = client.field530[var192];
                                    String var194 = class151.method1290(var193.field185, Statics.field2446);
                                    if (var194 != null && var194.equals(var187)) {
                                        client.method1883(30, "", class137.field2268 + var186 + class137.field2269);
                                        continue label2614;
                                    }
                                    if (var193.field186 != null) {
                                        String var195 = class151.method1290(var193.field186, Statics.field2446);
                                        if (var195 != null && var195.equals(var187)) {
                                            client.method1883(30, "", class137.field2268 + var186 + class137.field2269);
                                            continue label2614;
                                        }
                                    }
                                }
                                if (class151.method1290(Statics.field1383.field52, Statics.field2446).equals(var187)) {
                                    client.method1883(30, "", class137.field2266);
                                } else {
                                    client.field543.method2333(164);
                                    client.field543.method2634(class128.method254(var186));
                                    client.field543.method2445(var186);
                                }
                                continue;
                            }
                            client.method1883(30, "", class137.field2262);
                            continue;
                        }
                        if (var372 == 3606) {
                            var6--;
                            String var196 = field428[var6];
                            Statics.method126(var196);
                            continue;
                        }
                        if (var372 == 3607) {
                            var6--;
                            String var197 = field428[var6];
                            client.method2709(var197, false);
                            continue;
                        }
                        if (var372 == 3608) {
                            var6--;
                            String var198 = field428[var6];
                            if (var198 == null) {
                                continue;
                            }
                            String var199 = class151.method1290(var198, Statics.field2446);
                            if (var199 == null) {
                                continue;
                            }
                            int var200 = 0;
                            while (true) {
                                if (var200 >= client.field753) {
                                    continue label2614;
                                }
                                class11 var201 = client.field530[var200];
                                String var202 = var201.field185;
                                String var203 = class151.method1290(var202, Statics.field2446);
                                if (class139.method2324(var198, var199, var202, var203)) {
                                    client.field753--;
                                    for (int var204 = var200; var204 < client.field753; var204++) {
                                        client.field530[var204] = client.field530[var204 + 1];
                                    }
                                    client.field688 = client.field680;
                                    client.field543.method2333(121);
                                    client.field543.method2634(class128.method254(var198));
                                    client.field543.method2445(var198);
                                    continue label2614;
                                }
                                var200++;
                            }
                        }
                        if (var372 == 3609) {
                            var6--;
                            String var205 = field428[var6];
                            if (var205.startsWith(class2.method1544(0)) || var205.startsWith(class2.method1544(1))) {
                                var205 = var205.substring(7);
                            }
                            field426[var5++] = client.method2745(var205, false) ? 1 : 0;
                            continue;
                        }
                        if (var372 == 3611) {
                            if (client.field722 == null) {
                                field428[var6++] = "";
                            } else {
                                field428[var6++] = Statics.method860(client.field722);
                            }
                            continue;
                        }
                        if (var372 == 3612) {
                            if (client.field722 == null) {
                                field426[var5++] = 0;
                            } else {
                                field426[var5++] = Statics.field247;
                            }
                            continue;
                        }
                        if (var372 == 3613) {
                            var5--;
                            int var206 = field426[var5];
                            if (client.field722 != null && var206 < Statics.field247) {
                                field428[var6++] = Statics.field792[var206].field129;
                                continue;
                            }
                            field428[var6++] = "";
                            continue;
                        }
                        if (var372 == 3614) {
                            var5--;
                            int var207 = field426[var5];
                            if (client.field722 != null && var207 < Statics.field247) {
                                field426[var5++] = Statics.field792[var207].field130;
                                continue;
                            }
                            field426[var5++] = 0;
                            continue;
                        }
                        if (var372 == 3615) {
                            var5--;
                            int var208 = field426[var5];
                            if (client.field722 != null && var208 < Statics.field247) {
                                field426[var5++] = Statics.field792[var208].field116;
                                continue;
                            }
                            field426[var5++] = 0;
                            continue;
                        }
                        if (var372 == 3616) {
                            field426[var5++] = Statics.field1850;
                            continue;
                        }
                        if (var372 == 3617) {
                            var6--;
                            String var209 = field428[var6];
                            if (Statics.field792 != null) {
                                client.field543.method2333(227);
                                client.field543.method2634(class128.method254(var209));
                                client.field543.method2445(var209);
                            }
                            continue;
                        }
                        if (var372 == 3618) {
                            field426[var5++] = Statics.field30;
                            continue;
                        }
                        if (var372 == 3619) {
                            var6--;
                            String var210 = field428[var6];
                            client.method18(var210);
                            continue;
                        }
                        if (var372 == 3620) {
                            client.field543.method2333(118);
                            client.field543.method2634(0);
                            continue;
                        }
                        if (var372 == 3621) {
                            if (client.field750 == 0) {
                                field426[var5++] = -1;
                            } else {
                                field426[var5++] = client.field753;
                            }
                            continue;
                        }
                        if (var372 == 3622) {
                            var5--;
                            int var211 = field426[var5];
                            if (client.field750 != 0 && var211 < client.field753) {
                                field428[var6++] = client.field530[var211].field185;
                                continue;
                            }
                            field428[var6++] = "";
                            continue;
                        }
                        if (var372 == 3623) {
                            var6--;
                            String var212 = field428[var6];
                            if (var212.startsWith(class2.method1544(0)) || var212.startsWith(class2.method1544(1))) {
                                var212 = var212.substring(7);
                            }
                            field426[var5++] = client.method2724(var212) ? 1 : 0;
                            continue;
                        }
                        if (var372 == 3624) {
                            var5--;
                            int var213 = field426[var5];
                            if (Statics.field792 != null && var213 < Statics.field247 && Statics.field792[var213].field129.equalsIgnoreCase(Statics.field1383.field52)) {
                                field426[var5++] = 1;
                                continue;
                            }
                            field426[var5++] = 0;
                            continue;
                        }
                        if (var372 == 3625) {
                            if (client.field729 == null) {
                                field428[var6++] = "";
                            } else {
                                field428[var6++] = Statics.method860(client.field729);
                            }
                            continue;
                        }
                    } else if (var372 < 4100) {
                        if (var372 == 4000) {
                            var5 -= 2;
                            int var214 = field426[var5];
                            int var215 = field426[var5 + 1];
                            field426[var5++] = var214 + var215;
                            continue;
                        }
                        if (var372 == 4001) {
                            var5 -= 2;
                            int var216 = field426[var5];
                            int var217 = field426[var5 + 1];
                            field426[var5++] = var216 - var217;
                            continue;
                        }
                        if (var372 == 4002) {
                            var5 -= 2;
                            int var218 = field426[var5];
                            int var219 = field426[var5 + 1];
                            field426[var5++] = var218 * var219;
                            continue;
                        }
                        if (var372 == 4003) {
                            var5 -= 2;
                            int var220 = field426[var5];
                            int var221 = field426[var5 + 1];
                            field426[var5++] = var220 / var221;
                            continue;
                        }
                        if (var372 == 4004) {
                            var5--;
                            int var222 = field426[var5];
                            field426[var5++] = (int) (Math.random() * (double) var222);
                            continue;
                        }
                        if (var372 == 4005) {
                            var5--;
                            int var223 = field426[var5];
                            field426[var5++] = (int) (Math.random() * (double) (var223 + 1));
                            continue;
                        }
                        if (var372 == 4006) {
                            var5 -= 5;
                            int var224 = field426[var5];
                            int var225 = field426[var5 + 1];
                            int var226 = field426[var5 + 2];
                            int var227 = field426[var5 + 3];
                            int var228 = field426[var5 + 4];
                            field426[var5++] = (var225 - var224) * (var228 - var226) / (var227 - var226) + var224;
                            continue;
                        }
                        if (var372 == 4007) {
                            var5 -= 2;
                            int var229 = field426[var5];
                            int var230 = field426[var5 + 1];
                            field426[var5++] = var229 * var230 / 100 + var229;
                            continue;
                        }
                        if (var372 == 4008) {
                            var5 -= 2;
                            int var231 = field426[var5];
                            int var232 = field426[var5 + 1];
                            field426[var5++] = var231 | 0x1 << var232;
                            continue;
                        }
                        if (var372 == 4009) {
                            var5 -= 2;
                            int var233 = field426[var5];
                            int var234 = field426[var5 + 1];
                            field426[var5++] = var233 & -1 - (0x1 << var234);
                            continue;
                        }
                        if (var372 == 4010) {
                            var5 -= 2;
                            int var235 = field426[var5];
                            int var236 = field426[var5 + 1];
                            field426[var5++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var372 == 4011) {
                            var5 -= 2;
                            int var237 = field426[var5];
                            int var238 = field426[var5 + 1];
                            field426[var5++] = var237 % var238;
                            continue;
                        }
                        if (var372 == 4012) {
                            var5 -= 2;
                            int var239 = field426[var5];
                            int var240 = field426[var5 + 1];
                            if (var239 == 0) {
                                field426[var5++] = 0;
                            } else {
                                field426[var5++] = (int) Math.pow((double) var239, (double) var240);
                            }
                            continue;
                        }
                        if (var372 == 4013) {
                            var5 -= 2;
                            int var241 = field426[var5];
                            int var242 = field426[var5 + 1];
                            if (var241 == 0) {
                                field426[var5++] = 0;
                            } else if (var242 == 0) {
                                field426[var5++] = Integer.MAX_VALUE;
                            } else {
                                field426[var5++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                            }
                            continue;
                        }
                        if (var372 == 4014) {
                            var5 -= 2;
                            int var243 = field426[var5];
                            int var244 = field426[var5 + 1];
                            field426[var5++] = var243 & var244;
                            continue;
                        }
                        if (var372 == 4015) {
                            var5 -= 2;
                            int var245 = field426[var5];
                            int var246 = field426[var5 + 1];
                            field426[var5++] = var245 | var246;
                            continue;
                        }
                    } else if (var372 < 4200) {
                        if (var372 == 4100) {
                            var6--;
                            String var247 = field428[var6];
                            var5--;
                            int var248 = field426[var5];
                            field428[var6++] = var247 + var248;
                            continue;
                        }
                        if (var372 == 4101) {
                            var6 -= 2;
                            String var249 = field428[var6];
                            String var250 = field428[var6 + 1];
                            field428[var6++] = var249 + var250;
                            continue;
                        }
                        if (var372 == 4102) {
                            var6--;
                            String var251 = field428[var6];
                            var5--;
                            int var252 = field426[var5];
                            String[] var253 = field428;
                            int var254 = var6++;
                            String var256;
                            if (var252 < 0) {
                                var256 = Integer.toString(var252);
                            } else {
                                int var257 = var252;
                                String var258;
                                if (var252 < 0) {
                                    var258 = Integer.toString(var252, 10);
                                } else {
                                    int var259 = 2;
                                    int var260 = var252 / 10;
                                    while (var260 != 0) {
                                        var260 /= 10;
                                        var259++;
                                    }
                                    char[] var261 = new char[var259];
                                    var261[0] = '+';
                                    for (int var262 = var259 - 1; var262 > 0; var262--) {
                                        int var263 = var257;
                                        var257 /= 10;
                                        int var264 = var263 - var257 * 10;
                                        if (var264 >= 10) {
                                            var261[var262] = (char) (var264 + 87);
                                        } else {
                                            var261[var262] = (char) (var264 + 48);
                                        }
                                    }
                                    var258 = new String(var261);
                                }
                                var256 = var258;
                            }
                            var253[var254] = var251 + var256;
                            continue;
                        }
                        if (var372 == 4103) {
                            var6--;
                            String var265 = field428[var6];
                            field428[var6++] = var265.toLowerCase();
                            continue;
                        }
                        if (var372 == 4104) {
                            var5--;
                            int var266 = field426[var5];
                            long var267 = ((long) var266 + 11745L) * 86400000L;
                            field436.setTime(new Date(var267));
                            int var269 = field436.get(5);
                            int var270 = field436.get(2);
                            int var271 = field436.get(1);
                            field428[var6++] = var269 + "-" + field432[var270] + "-" + var271;
                            continue;
                        }
                        if (var372 == 4105) {
                            var6 -= 2;
                            String var272 = field428[var6];
                            String var273 = field428[var6 + 1];
                            if (Statics.field1383.field37 != null && Statics.field1383.field37.field2766) {
                                field428[var6++] = var273;
                                continue;
                            }
                            field428[var6++] = var272;
                            continue;
                        }
                        if (var372 == 4106) {
                            var5--;
                            int var274 = field426[var5];
                            field428[var6++] = Integer.toString(var274);
                            continue;
                        }
                        if (var372 == 4107) {
                            var6 -= 2;
                            int[] var275 = field426;
                            int var276 = var5++;
                            int var277 = Statics.method192(field428[var6], field428[var6 + 1], client.field506);
                            byte var278;
                            if (var277 > 0) {
                                var278 = 1;
                            } else if (var277 < 0) {
                                var278 = -1;
                            } else {
                                var278 = 0;
                            }
                            var275[var276] = var278;
                            continue;
                        }
                        if (var372 == 4108) {
                            var6--;
                            String var279 = field428[var6];
                            var5 -= 2;
                            int var280 = field426[var5];
                            int var281 = field426[var5 + 1];
                            byte[] var282 = Statics.field212.method3069(var281, 0);
                            class185 var283 = new class185(var282);
                            field426[var5++] = var283.method3401(var279, var280);
                            continue;
                        }
                        if (var372 == 4109) {
                            var6--;
                            String var284 = field428[var6];
                            var5 -= 2;
                            int var285 = field426[var5];
                            int var286 = field426[var5 + 1];
                            byte[] var287 = Statics.field212.method3069(var286, 0);
                            class185 var288 = new class185(var287);
                            field426[var5++] = var288.method3400(var284, var285);
                            continue;
                        }
                        if (var372 == 4110) {
                            var6 -= 2;
                            String var289 = field428[var6];
                            String var290 = field428[var6 + 1];
                            var5--;
                            if (field426[var5] == 1) {
                                field428[var6++] = var289;
                            } else {
                                field428[var6++] = var290;
                            }
                            continue;
                        }
                        if (var372 == 4111) {
                            var6--;
                            String var291 = field428[var6];
                            field428[var6++] = class187.method3402(var291);
                            continue;
                        }
                        if (var372 == 4112) {
                            var6--;
                            String var292 = field428[var6];
                            var5--;
                            int var293 = field426[var5];
                            field428[var6++] = var292 + (char) var293;
                            continue;
                        }
                        if (var372 == 4113) {
                            var5--;
                            int var294 = field426[var5];
                            field426[var5++] = Statics.method1431((char) var294) ? 1 : 0;
                            continue;
                        }
                        if (var372 == 4114) {
                            var5--;
                            int var295 = field426[var5];
                            int[] var296 = field426;
                            int var297 = var5++;
                            char var298 = (char) var295;
                            boolean var299 = var298 >= '0' && var298 <= '9' || var298 >= 'A' && var298 <= 'Z' || var298 >= 'a' && var298 <= 'z';
                            var296[var297] = var299 ? 1 : 0;
                            continue;
                        }
                        if (var372 == 4115) {
                            var5--;
                            int var300 = field426[var5];
                            int[] var301 = field426;
                            int var302 = var5++;
                            char var303 = (char) var300;
                            boolean var304 = var303 >= 'A' && var303 <= 'Z' || var303 >= 'a' && var303 <= 'z';
                            var301[var302] = var304 ? 1 : 0;
                            continue;
                        }
                        if (var372 == 4116) {
                            var5--;
                            int var305 = field426[var5];
                            field426[var5++] = class150.method2722((char) var305) ? 1 : 0;
                            continue;
                        }
                        if (var372 == 4117) {
                            var6--;
                            String var306 = field428[var6];
                            if (var306 == null) {
                                field426[var5++] = 0;
                            } else {
                                field426[var5++] = var306.length();
                            }
                            continue;
                        }
                        if (var372 == 4118) {
                            var6--;
                            String var307 = field428[var6];
                            var5 -= 2;
                            int var308 = field426[var5];
                            int var309 = field426[var5 + 1];
                            field428[var6++] = var307.substring(var308, var309);
                            continue;
                        }
                        if (var372 == 4119) {
                            var6--;
                            String var310 = field428[var6];
                            StringBuilder var311 = new StringBuilder(var310.length());
                            boolean var312 = false;
                            for (int var313 = 0; var313 < var310.length(); var313++) {
                                char var314 = var310.charAt(var313);
                                if (var314 == '<') {
                                    var312 = true;
                                } else if (var314 == '>') {
                                    var312 = false;
                                } else if (!var312) {
                                    var311.append(var314);
                                }
                            }
                            field428[var6++] = var311.toString();
                            continue;
                        }
                        if (var372 == 4120) {
                            var6--;
                            String var315 = field428[var6];
                            var5--;
                            int var316 = field426[var5];
                            field426[var5++] = var315.indexOf(var316);
                            continue;
                        }
                    } else if (var372 < 4300) {
                        if (var372 == 4200) {
                            var5--;
                            int var317 = field426[var5];
                            field428[var6++] = class41.method2718(var317).field1020;
                            continue;
                        }
                        if (var372 == 4201) {
                            var5 -= 2;
                            int var318 = field426[var5];
                            int var319 = field426[var5 + 1];
                            class41 var320 = class41.method2718(var318);
                            if (var319 >= 1 && var319 <= 5 && var320.field996[var319 - 1] != null) {
                                field428[var6++] = var320.field996[var319 - 1];
                                continue;
                            }
                            field428[var6++] = "";
                            continue;
                        }
                        if (var372 == 4202) {
                            var5 -= 2;
                            int var321 = field426[var5];
                            int var322 = field426[var5 + 1];
                            class41 var323 = class41.method2718(var321);
                            if (var322 >= 1 && var322 <= 5 && var323.field1003[var322 - 1] != null) {
                                field428[var6++] = var323.field1003[var322 - 1];
                                continue;
                            }
                            field428[var6++] = "";
                            continue;
                        }
                        if (var372 == 4203) {
                            var5--;
                            int var324 = field426[var5];
                            field426[var5++] = class41.method2718(var324).field1015;
                            continue;
                        }
                        if (var372 == 4204) {
                            var5--;
                            int var325 = field426[var5];
                            field426[var5++] = class41.method2718(var325).field1014 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var372 == 4205) {
                            var5--;
                            int var326 = field426[var5];
                            class41 var327 = class41.method2718(var326);
                            if (var327.field1034 == -1 && var327.field1030 >= 0) {
                                field426[var5++] = var327.field1030;
                                continue;
                            }
                            field426[var5++] = var326;
                            continue;
                        }
                        if (var372 == 4206) {
                            var5--;
                            int var328 = field426[var5];
                            class41 var329 = class41.method2718(var328);
                            if (var329.field1034 >= 0 && var329.field1030 >= 0) {
                                field426[var5++] = var329.field1030;
                                continue;
                            }
                            field426[var5++] = var328;
                            continue;
                        }
                        if (var372 == 4207) {
                            var5--;
                            int var330 = field426[var5];
                            field426[var5++] = class41.method2718(var330).field1016 ? 1 : 0;
                            continue;
                        }
                    } else if (var372 < 5100) {
                        if (var372 == 5000) {
                            field426[var5++] = client.field644;
                            continue;
                        }
                        if (var372 == 5001) {
                            var5 -= 3;
                            client.field644 = field426[var5];
                            Statics.field438 = class140.method2323(field426[var5 + 1]);
                            if (Statics.field438 == null) {
                                Statics.field438 = class140.field2366;
                            }
                            client.field578 = field426[var5 + 2];
                            client.field543.method2333(205);
                            client.field543.method2634(client.field644);
                            client.field543.method2634(Statics.field438.field2368);
                            client.field543.method2634(client.field578);
                            continue;
                        }
                        if (var372 == 5002) {
                            var6--;
                            String var331 = field428[var6];
                            var5 -= 2;
                            int var332 = field426[var5];
                            int var333 = field426[var5 + 1];
                            client.field543.method2333(45);
                            client.field543.method2634(class128.method254(var331) + 2);
                            client.field543.method2445(var331);
                            client.field543.method2634(var332 - 1);
                            client.field543.method2634(var333);
                            continue;
                        }
                        if (var372 == 5003) {
                            var5--;
                            int var334 = field426[var5];
                            String var335 = null;
                            if (var334 < 100) {
                                var335 = client.field664[var334];
                            }
                            if (var335 == null) {
                                var335 = "";
                            }
                            field428[var6++] = var335;
                            continue;
                        }
                        if (var372 == 5004) {
                            var5--;
                            int var336 = field426[var5];
                            int var337 = -1;
                            if (var336 < 100 && client.field664[var336] != null) {
                                var337 = client.field708[var336];
                            }
                            field426[var5++] = var337;
                            continue;
                        }
                        if (var372 == 5005) {
                            if (Statics.field438 == null) {
                                field426[var5++] = -1;
                            } else {
                                field426[var5++] = Statics.field438.field2368;
                            }
                            continue;
                        }
                        if (var372 == 5008) {
                            var6--;
                            String var338 = field428[var6];
                            if (var338.startsWith("::")) {
                                client.method35(var338.substring(2));
                                continue;
                            }
                            String var339 = var338.toLowerCase();
                            byte var340 = 0;
                            if (var339.startsWith(class137.field2123)) {
                                var340 = 0;
                                var338 = var338.substring(class137.field2123.length());
                            } else if (var339.startsWith(class137.field2274)) {
                                var340 = 1;
                                var338 = var338.substring(class137.field2274.length());
                            } else if (var339.startsWith(class137.field2326)) {
                                var340 = 2;
                                var338 = var338.substring(class137.field2326.length());
                            } else if (var339.startsWith(class137.field2125)) {
                                var340 = 3;
                                var338 = var338.substring(class137.field2125.length());
                            } else if (var339.startsWith(class137.field2280)) {
                                var340 = 4;
                                var338 = var338.substring(class137.field2280.length());
                            } else if (var339.startsWith(class137.field2282)) {
                                var340 = 5;
                                var338 = var338.substring(class137.field2282.length());
                            } else if (var339.startsWith(class137.field2211)) {
                                var340 = 6;
                                var338 = var338.substring(class137.field2211.length());
                            } else if (var339.startsWith(class137.field2286)) {
                                var340 = 7;
                                var338 = var338.substring(class137.field2286.length());
                            } else if (var339.startsWith(class137.field2118)) {
                                var340 = 8;
                                var338 = var338.substring(class137.field2118.length());
                            } else if (var339.startsWith(class137.field2327)) {
                                var340 = 9;
                                var338 = var338.substring(class137.field2327.length());
                            } else if (var339.startsWith(class137.field2292)) {
                                var340 = 10;
                                var338 = var338.substring(class137.field2292.length());
                            } else if (var339.startsWith(class137.field2230)) {
                                var340 = 11;
                                var338 = var338.substring(class137.field2230.length());
                            } else if (client.field506 != 0) {
                                if (var339.startsWith(class137.field2273)) {
                                    var340 = 0;
                                    var338 = var338.substring(class137.field2273.length());
                                } else if (var339.startsWith(class137.field2275)) {
                                    var340 = 1;
                                    var338 = var338.substring(class137.field2275.length());
                                } else if (var339.startsWith(class137.field2215)) {
                                    var340 = 2;
                                    var338 = var338.substring(class137.field2215.length());
                                } else if (var339.startsWith(class137.field2279)) {
                                    var340 = 3;
                                    var338 = var338.substring(class137.field2279.length());
                                } else if (var339.startsWith(class137.field2344)) {
                                    var340 = 4;
                                    var338 = var338.substring(class137.field2344.length());
                                } else if (var339.startsWith(class137.field2283)) {
                                    var340 = 5;
                                    var338 = var338.substring(class137.field2283.length());
                                } else if (var339.startsWith(class137.field2285)) {
                                    var340 = 6;
                                    var338 = var338.substring(class137.field2285.length());
                                } else if (var339.startsWith(class137.field2287)) {
                                    var340 = 7;
                                    var338 = var338.substring(class137.field2287.length());
                                } else if (var339.startsWith(class137.field2161)) {
                                    var340 = 8;
                                    var338 = var338.substring(class137.field2161.length());
                                } else if (var339.startsWith(class137.field2291)) {
                                    var340 = 9;
                                    var338 = var338.substring(class137.field2291.length());
                                } else if (var339.startsWith(class137.field2189)) {
                                    var340 = 10;
                                    var338 = var338.substring(class137.field2189.length());
                                } else if (var339.startsWith(class137.field2295)) {
                                    var340 = 11;
                                    var338 = var338.substring(class137.field2295.length());
                                }
                            }
                            String var341 = var338.toLowerCase();
                            byte var342 = 0;
                            if (var341.startsWith(class137.field2210)) {
                                var342 = 1;
                                var338 = var338.substring(class137.field2210.length());
                            } else if (var341.startsWith(class137.field2107)) {
                                var342 = 2;
                                var338 = var338.substring(class137.field2107.length());
                            } else if (var341.startsWith(class137.field2300)) {
                                var342 = 3;
                                var338 = var338.substring(class137.field2300.length());
                            } else if (var341.startsWith(class137.field2239)) {
                                var342 = 4;
                                var338 = var338.substring(class137.field2239.length());
                            } else if (var341.startsWith(class137.field2304)) {
                                var342 = 5;
                                var338 = var338.substring(class137.field2304.length());
                            } else if (client.field506 != 0) {
                                if (var341.startsWith(class137.field2271)) {
                                    var342 = 1;
                                    var338 = var338.substring(class137.field2271.length());
                                } else if (var341.startsWith(class137.field2299)) {
                                    var342 = 2;
                                    var338 = var338.substring(class137.field2299.length());
                                } else if (var341.startsWith(class137.field2197)) {
                                    var342 = 3;
                                    var338 = var338.substring(class137.field2197.length());
                                } else if (var341.startsWith(class137.field2302)) {
                                    var342 = 4;
                                    var338 = var338.substring(class137.field2302.length());
                                } else if (var341.startsWith(class137.field2305)) {
                                    var342 = 5;
                                    var338 = var338.substring(class137.field2305.length());
                                }
                            }
                            client.field543.method2333(79);
                            client.field543.method2634(0);
                            int var343 = client.field543.field2045;
                            client.field543.method2634(var340);
                            client.field543.method2634(var342);
                            class117 var344 = client.field543;
                            int var345 = var344.field2045;
                            int var346 = var338.length();
                            byte[] var347 = new byte[var346];
                            for (int var348 = 0; var348 < var346; var348++) {
                                char var349 = var338.charAt(var348);
                                if (var349 > 0 && var349 < 128 || var349 >= 160 && var349 <= 255) {
                                    var347[var348] = (byte) var349;
                                } else if (var349 == 8364) {
                                    var347[var348] = -128;
                                } else if (var349 == 8218) {
                                    var347[var348] = -126;
                                } else if (var349 == 402) {
                                    var347[var348] = -125;
                                } else if (var349 == 8222) {
                                    var347[var348] = -124;
                                } else if (var349 == 8230) {
                                    var347[var348] = -123;
                                } else if (var349 == 8224) {
                                    var347[var348] = -122;
                                } else if (var349 == 8225) {
                                    var347[var348] = -121;
                                } else if (var349 == 710) {
                                    var347[var348] = -120;
                                } else if (var349 == 8240) {
                                    var347[var348] = -119;
                                } else if (var349 == 352) {
                                    var347[var348] = -118;
                                } else if (var349 == 8249) {
                                    var347[var348] = -117;
                                } else if (var349 == 338) {
                                    var347[var348] = -116;
                                } else if (var349 == 381) {
                                    var347[var348] = -114;
                                } else if (var349 == 8216) {
                                    var347[var348] = -111;
                                } else if (var349 == 8217) {
                                    var347[var348] = -110;
                                } else if (var349 == 8220) {
                                    var347[var348] = -109;
                                } else if (var349 == 8221) {
                                    var347[var348] = -108;
                                } else if (var349 == 8226) {
                                    var347[var348] = -107;
                                } else if (var349 == 8211) {
                                    var347[var348] = -106;
                                } else if (var349 == 8212) {
                                    var347[var348] = -105;
                                } else if (var349 == 732) {
                                    var347[var348] = -104;
                                } else if (var349 == 8482) {
                                    var347[var348] = -103;
                                } else if (var349 == 353) {
                                    var347[var348] = -102;
                                } else if (var349 == 8250) {
                                    var347[var348] = -101;
                                } else if (var349 == 339) {
                                    var347[var348] = -100;
                                } else if (var349 == 382) {
                                    var347[var348] = -98;
                                } else if (var349 == 376) {
                                    var347[var348] = -97;
                                } else {
                                    var347[var348] = 63;
                                }
                            }
                            var344.method2452(var347.length);
                            var344.field2045 += Statics.field2858.method2388(var347, 0, var347.length, var344.field2043, var344.field2045);
                            client.field543.method2451(client.field543.field2045 - var343);
                            continue;
                        }
                        if (var372 == 5009) {
                            var6 -= 2;
                            String var352 = field428[var6];
                            String var353 = field428[var6 + 1];
                            client.field543.method2333(196);
                            client.field543.method2603(0);
                            int var354 = client.field543.field2045;
                            client.field543.method2445(var352);
                            class117 var355 = client.field543;
                            int var356 = var355.field2045;
                            int var357 = var353.length();
                            byte[] var358 = new byte[var357];
                            for (int var359 = 0; var359 < var357; var359++) {
                                char var360 = var353.charAt(var359);
                                if (var360 > 0 && var360 < 128 || var360 >= 160 && var360 <= 255) {
                                    var358[var359] = (byte) var360;
                                } else if (var360 == 8364) {
                                    var358[var359] = -128;
                                } else if (var360 == 8218) {
                                    var358[var359] = -126;
                                } else if (var360 == 402) {
                                    var358[var359] = -125;
                                } else if (var360 == 8222) {
                                    var358[var359] = -124;
                                } else if (var360 == 8230) {
                                    var358[var359] = -123;
                                } else if (var360 == 8224) {
                                    var358[var359] = -122;
                                } else if (var360 == 8225) {
                                    var358[var359] = -121;
                                } else if (var360 == 710) {
                                    var358[var359] = -120;
                                } else if (var360 == 8240) {
                                    var358[var359] = -119;
                                } else if (var360 == 352) {
                                    var358[var359] = -118;
                                } else if (var360 == 8249) {
                                    var358[var359] = -117;
                                } else if (var360 == 338) {
                                    var358[var359] = -116;
                                } else if (var360 == 381) {
                                    var358[var359] = -114;
                                } else if (var360 == 8216) {
                                    var358[var359] = -111;
                                } else if (var360 == 8217) {
                                    var358[var359] = -110;
                                } else if (var360 == 8220) {
                                    var358[var359] = -109;
                                } else if (var360 == 8221) {
                                    var358[var359] = -108;
                                } else if (var360 == 8226) {
                                    var358[var359] = -107;
                                } else if (var360 == 8211) {
                                    var358[var359] = -106;
                                } else if (var360 == 8212) {
                                    var358[var359] = -105;
                                } else if (var360 == 732) {
                                    var358[var359] = -104;
                                } else if (var360 == 8482) {
                                    var358[var359] = -103;
                                } else if (var360 == 353) {
                                    var358[var359] = -102;
                                } else if (var360 == 8250) {
                                    var358[var359] = -101;
                                } else if (var360 == 339) {
                                    var358[var359] = -100;
                                } else if (var360 == 382) {
                                    var358[var359] = -98;
                                } else if (var360 == 376) {
                                    var358[var359] = -97;
                                } else {
                                    var358[var359] = 63;
                                }
                            }
                            var355.method2452(var358.length);
                            var355.field2045 += Statics.field2858.method2388(var358, 0, var358.length, var355.field2043, var355.field2045);
                            client.field543.method2545(client.field543.field2045 - var354);
                            continue;
                        }
                        if (var372 == 5010) {
                            var5--;
                            int var363 = field426[var5];
                            String var364 = null;
                            if (var363 < 100) {
                                var364 = client.field709[var363];
                            }
                            if (var364 == null) {
                                var364 = "";
                            }
                            field428[var6++] = var364;
                            continue;
                        }
                        if (var372 == 5011) {
                            var5--;
                            int var365 = field426[var5];
                            String var366 = null;
                            if (var365 < 100) {
                                var366 = client.field710[var365];
                            }
                            if (var366 == null) {
                                var366 = "";
                            }
                            field428[var6++] = var366;
                            continue;
                        }
                        if (var372 == 5015) {
                            String var367;
                            if (Statics.field1383 == null || Statics.field1383.field52 == null) {
                                var367 = "";
                            } else {
                                var367 = Statics.field1383.field52;
                            }
                            field428[var6++] = var367;
                            continue;
                        }
                        if (var372 == 5016) {
                            field426[var5++] = client.field578;
                            continue;
                        }
                        if (var372 == 5017) {
                            field426[var5++] = client.field620;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var371) {
            StringBuilder var369 = new StringBuilder(30);
            var369.append("").append(var4.field2839).append(" ");
            for (int var370 = field434 - 1; var370 >= 0; var370--) {
                var369.append("").append(field430[var370].field280.field2839).append(" ");
            }
            var369.append("").append(var10);
            class81.method1452(var369.toString(), var371);
        }
    }

    @ObfuscatedName("bg.k(II)V")
    public static void method1229(int arg0) {
        if (arg0 == -1 || !class161.method1456(arg0)) {
            return;
        }
        class161[] var1 = Statics.field2616[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class161 var3 = var1[var2];
            if (var3.field2694 != null) {
                class1 var4 = new class1();
                var4.field1 = var3;
                var4.field12 = var3.field2694;
                method1406(var4, 2000000);
            }
        }
    }
}
