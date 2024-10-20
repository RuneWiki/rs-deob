package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("z")
public class class26 {

    @ObfuscatedName("z.a")
    public static int[] field363 = new int[5];

    @ObfuscatedName("z.q")
    public static int[][] field364 = new int[5][5000];

    @ObfuscatedName("z.j")
    public static int[] field365 = new int[1000];

    @ObfuscatedName("z.v")
    public static String[] field374 = new String[1000];

    @ObfuscatedName("z.w")
    public static int field377 = 0;

    @ObfuscatedName("z.l")
    public static class18[] field368 = new class18[50];

    @ObfuscatedName("z.c")
    public static Calendar field370 = Calendar.getInstance();

    @ObfuscatedName("z.h")
    public static final String[] field369 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.x(Lx;I)V")
    public static void method161(class1 arg0) {
        Object[] var1 = arg0.field1;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method1205(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field62;
        int[] var8 = var3.field71;
        byte var9 = -1;
        field377 = 0;
        try {
            Statics.field361 = new int[var3.field65];
            int var10 = 0;
            Statics.field362 = new String[var3.field67];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field4;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field16;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field3 == null ? -1 : arg0.field3.field2620;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field11;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field3 == null ? -1 : arg0.field3.field2601;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2620;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2601;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field8;
                    }
                    Statics.field361[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field362[var11++] = var14;
                }
            }
            int var15 = 0;
            label2372: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var400 = var7[var6];
                if (var400 < 100) {
                    if (var400 == 0) {
                        field365[var4++] = var8[var6];
                        continue;
                    }
                    if (var400 == 1) {
                        int var16 = var8[var6];
                        field365[var4++] = class159.field2696[var16];
                        continue;
                    }
                    if (var400 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class159.field2696[var17] = field365[var4];
                        continue;
                    }
                    if (var400 == 3) {
                        field374[var5++] = var3.field64[var6];
                        continue;
                    }
                    if (var400 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var400 == 7) {
                        var4 -= 2;
                        if (field365[var4 + 1] != field365[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var400 == 8) {
                        var4 -= 2;
                        if (field365[var4 + 1] == field365[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var400 == 9) {
                        var4 -= 2;
                        if (field365[var4] < field365[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var400 == 10) {
                        var4 -= 2;
                        if (field365[var4] > field365[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var400 == 21) {
                        if (field377 == 0) {
                            return;
                        }
                        class18 var18 = field368[--field377];
                        var3 = var18.field246;
                        var7 = var3.field62;
                        var8 = var3.field71;
                        var6 = var18.field251;
                        Statics.field361 = var18.field248;
                        Statics.field362 = var18.field245;
                        continue;
                    }
                    if (var400 == 25) {
                        int var19 = var8[var6];
                        field365[var4++] = class159.method1498(var19);
                        continue;
                    }
                    if (var400 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field365[var4];
                        class38 var22 = class38.method1545(var20);
                        int var23 = var22.field932;
                        int var24 = var22.field934;
                        int var25 = var22.field933;
                        int var26 = class159.field2695[var25 - var24];
                        if (var21 < 0 || var21 > var26) {
                            var21 = 0;
                        }
                        int var27 = var26 << var24;
                        class159.field2696[var23] = class159.field2696[var23] & ~var27 | var21 << var24 & var27;
                        continue;
                    }
                    if (var400 == 31) {
                        var4 -= 2;
                        if (field365[var4] <= field365[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var400 == 32) {
                        var4 -= 2;
                        if (field365[var4] >= field365[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var400 == 33) {
                        field365[var4++] = Statics.field361[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var400 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field361[var10001] = field365[var4];
                        continue;
                    }
                    if (var400 == 35) {
                        field374[var5++] = Statics.field362[var8[var6]];
                        continue;
                    }
                    if (var400 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field362[var10001] = field374[var5];
                        continue;
                    }
                    if (var400 == 37) {
                        int var28 = var8[var6];
                        var5 -= var28;
                        String[] var29 = field374;
                        String var30;
                        if (var28 == 0) {
                            var30 = "";
                        } else if (var28 == 1) {
                            String var31 = var29[var5];
                            if (var31 == null) {
                                var30 = "null";
                            } else {
                                var30 = var31.toString();
                            }
                        } else {
                            int var32 = var5 + var28;
                            int var33 = 0;
                            for (int var34 = var5; var34 < var32; var34++) {
                                String var35 = var29[var34];
                                if (var35 == null) {
                                    var33 += 4;
                                } else {
                                    var33 += var35.length();
                                }
                            }
                            StringBuilder var36 = new StringBuilder(var33);
                            for (int var37 = var5; var37 < var32; var37++) {
                                String var38 = var29[var37];
                                if (var38 == null) {
                                    var36.append("null");
                                } else {
                                    var36.append(var38);
                                }
                            }
                            var30 = var36.toString();
                        }
                        field374[var5++] = var30;
                        continue;
                    }
                    if (var400 == 38) {
                        var4--;
                        continue;
                    }
                    if (var400 == 39) {
                        var5--;
                        continue;
                    }
                    if (var400 == 40) {
                        int var40 = var8[var6];
                        class5 var41 = class5.method1205(var40);
                        int[] var42 = new int[var41.field65];
                        String[] var43 = new String[var41.field67];
                        for (int var44 = 0; var44 < var41.field66; var44++) {
                            var42[var44] = field365[var4 - var41.field66 + var44];
                        }
                        for (int var45 = 0; var45 < var41.field68; var45++) {
                            var43[var45] = field374[var5 - var41.field68 + var45];
                        }
                        var4 -= var41.field66;
                        var5 -= var41.field68;
                        class18 var46 = new class18();
                        var46.field246 = var3;
                        var46.field251 = var6;
                        var46.field248 = Statics.field361;
                        var46.field245 = Statics.field362;
                        field368[++field377 - 1] = var46;
                        var3 = var41;
                        var7 = var41.field62;
                        var8 = var41.field71;
                        var6 = -1;
                        Statics.field361 = var42;
                        Statics.field362 = var43;
                        continue;
                    }
                    if (var400 == 42) {
                        field365[var4++] = client.field641[var8[var6]];
                        continue;
                    }
                    if (var400 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field641[var10001] = field365[var4];
                        continue;
                    }
                    if (var400 == 44) {
                        int var47 = var8[var6] >> 16;
                        int var48 = var8[var6] & 0xFFFF;
                        var4--;
                        int var49 = field365[var4];
                        if (var49 >= 0 && var49 <= 5000) {
                            field363[var47] = var49;
                            byte var50 = -1;
                            if (var48 == 105) {
                                var50 = 0;
                            }
                            int var51 = 0;
                            while (true) {
                                if (var51 >= var49) {
                                    continue label2372;
                                }
                                field364[var47][var51] = var50;
                                var51++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var400 == 45) {
                        int var52 = var8[var6];
                        var4--;
                        int var53 = field365[var4];
                        if (var53 >= 0 && var53 < field363[var52]) {
                            field365[var4++] = field364[var52][var53];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var400 == 46) {
                        int var54 = var8[var6];
                        var4 -= 2;
                        int var55 = field365[var4];
                        if (var55 >= 0 && var55 < field363[var54]) {
                            field364[var54][var55] = field365[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var400 == 47) {
                        String var56 = client.field642[var8[var6]];
                        if (var56 == null) {
                            var56 = "null";
                        }
                        field374[var5++] = var56;
                        continue;
                    }
                    if (var400 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field642[var10001] = field374[var5];
                        continue;
                    }
                }
                boolean var57;
                if (var8[var6] == 1) {
                    var57 = true;
                } else {
                    var57 = false;
                }
                if (var400 < 1000) {
                    if (var400 == 100) {
                        var4 -= 3;
                        int var58 = field365[var4];
                        int var59 = field365[var4 + 1];
                        int var60 = field365[var4 + 2];
                        if (var59 == 0) {
                            throw new RuntimeException();
                        }
                        class158 var61 = class158.method220(var58);
                        if (var61.field2681 == null) {
                            var61.field2681 = new class158[var60 + 1];
                        }
                        if (var61.field2681.length <= var60) {
                            class158[] var62 = new class158[var60 + 1];
                            for (int var63 = 0; var63 < var61.field2681.length; var63++) {
                                var62[var63] = var61.field2681[var63];
                            }
                            var61.field2681 = var62;
                        }
                        if (var60 > 0 && var61.field2681[var60 - 1] == null) {
                            throw new RuntimeException("" + (var60 - 1));
                        }
                        class158 var64 = new class158();
                        var64.field2575 = var59;
                        var64.field2585 = var64.field2620 = var61.field2620;
                        var64.field2601 = var60;
                        var64.field2572 = true;
                        var61.field2681[var60] = var64;
                        if (var57) {
                            Statics.field376 = var64;
                        } else {
                            Statics.field173 = var64;
                        }
                        client.method2272(var61);
                        continue;
                    }
                    if (var400 == 101) {
                        class158 var65 = var57 ? Statics.field376 : Statics.field173;
                        class158 var66 = class158.method220(var65.field2620);
                        var66.field2681[var65.field2601] = null;
                        client.method2272(var66);
                        continue;
                    }
                    if (var400 == 102) {
                        var4--;
                        class158 var67 = class158.method220(field365[var4]);
                        var67.field2681 = null;
                        client.method2272(var67);
                        continue;
                    }
                    if (var400 == 200) {
                        var4 -= 2;
                        int var68 = field365[var4];
                        int var69 = field365[var4 + 1];
                        class158 var70 = class158.method2262(var68, var69);
                        if (var70 != null && var69 != -1) {
                            field365[var4++] = 1;
                            if (var57) {
                                Statics.field376 = var70;
                            } else {
                                Statics.field173 = var70;
                            }
                            continue;
                        }
                        field365[var4++] = 0;
                        continue;
                    }
                } else if (var400 >= 1000 && var400 < 1100 || var400 >= 2000 && var400 < 2100) {
                    class158 var71;
                    if (var400 >= 2000) {
                        var400 -= 1000;
                        var4--;
                        var71 = class158.method220(field365[var4]);
                    } else {
                        var71 = var57 ? Statics.field376 : Statics.field173;
                    }
                    if (var400 == 1000) {
                        var4 -= 2;
                        var71.field2578 = field365[var4];
                        var71.field2579 = field365[var4 + 1];
                        client.method2272(var71);
                        continue;
                    }
                    if (var400 == 1001) {
                        var4 -= 2;
                        var71.field2582 = field365[var4];
                        var71.field2583 = field365[var4 + 1];
                        client.method2272(var71);
                        continue;
                    }
                    if (var400 == 1003) {
                        var4--;
                        boolean var72 = field365[var4] == 1;
                        if (var71.field2683 != var72) {
                            var71.field2683 = var72;
                            client.method2272(var71);
                        }
                        continue;
                    }
                } else if (!(var400 < 1100 || var400 >= 1200) || !(var400 < 2100 || var400 >= 2200)) {
                    class158 var73;
                    if (var400 >= 2000) {
                        var400 -= 1000;
                        var4--;
                        var73 = class158.method220(field365[var4]);
                    } else {
                        var73 = var57 ? Statics.field376 : Statics.field173;
                    }
                    if (var400 == 1100) {
                        var4 -= 2;
                        var73.field2586 = field365[var4];
                        if (var73.field2586 > var73.field2605 - var73.field2582) {
                            var73.field2586 = var73.field2605 - var73.field2582;
                        }
                        if (var73.field2586 < 0) {
                            var73.field2586 = 0;
                        }
                        var73.field2580 = field365[var4 + 1];
                        if (var73.field2580 > var73.field2589 - var73.field2583) {
                            var73.field2580 = var73.field2589 - var73.field2583;
                        }
                        if (var73.field2580 < 0) {
                            var73.field2580 = 0;
                        }
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1101) {
                        var4--;
                        var73.field2590 = field365[var4];
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1102) {
                        var4--;
                        var73.field2594 = field365[var4] == 1;
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1103) {
                        var4--;
                        var73.field2595 = field365[var4];
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1104) {
                        var4--;
                        var73.field2596 = field365[var4];
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1105) {
                        var4--;
                        var73.field2635 = field365[var4];
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1106) {
                        var4--;
                        var73.field2599 = field365[var4];
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1107) {
                        var4--;
                        var73.field2600 = field365[var4] == 1;
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1108) {
                        var73.field2667 = 1;
                        var4--;
                        var73.field2606 = field365[var4];
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1109) {
                        var4 -= 6;
                        var73.field2611 = field365[var4];
                        var73.field2598 = field365[var4 + 1];
                        var73.field2613 = field365[var4 + 2];
                        var73.field2614 = field365[var4 + 3];
                        var73.field2654 = field365[var4 + 4];
                        var73.field2616 = field365[var4 + 5];
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1110) {
                        var4--;
                        int var74 = field365[var4];
                        if (var73.field2609 != var74) {
                            var73.field2609 = var74;
                            var73.field2679 = 0;
                            var73.field2629 = 0;
                            client.method2272(var73);
                        }
                        continue;
                    }
                    if (var400 == 1111) {
                        var4--;
                        var73.field2618 = field365[var4] == 1;
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1112) {
                        var5--;
                        String var75 = field374[var5];
                        if (!var75.equals(var73.field2624)) {
                            var73.field2624 = var75;
                            client.method2272(var73);
                        }
                        continue;
                    }
                    if (var400 == 1113) {
                        var4--;
                        var73.field2619 = field365[var4];
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1114) {
                        var4 -= 3;
                        var73.field2623 = field365[var4];
                        var73.field2638 = field365[var4 + 1];
                        var73.field2652 = field365[var4 + 2];
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1115) {
                        var4--;
                        var73.field2625 = field365[var4] == 1;
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1116) {
                        var4--;
                        var73.field2573 = field365[var4];
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1117) {
                        var4--;
                        var73.field2663 = field365[var4];
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1118) {
                        var4--;
                        var73.field2604 = field365[var4] == 1;
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1119) {
                        var4--;
                        var73.field2632 = field365[var4] == 1;
                        client.method2272(var73);
                        continue;
                    }
                    if (var400 == 1120) {
                        var4 -= 2;
                        var73.field2605 = field365[var4];
                        var73.field2589 = field365[var4 + 1];
                        client.method2272(var73);
                        continue;
                    }
                } else if (!(var400 < 1200 || var400 >= 1300) || !(var400 < 2200 || var400 >= 2300)) {
                    class158 var76;
                    if (var400 >= 2000) {
                        var400 -= 1000;
                        var4--;
                        var76 = class158.method220(field365[var4]);
                    } else {
                        var76 = var57 ? Statics.field376 : Statics.field173;
                    }
                    client.method2272(var76);
                    if (var400 == 1200) {
                        var4 -= 2;
                        int var77 = field365[var4];
                        int var78 = field365[var4 + 1];
                        var76.field2592 = var77;
                        var76.field2682 = var78;
                        class40 var79 = class40.method125(var77);
                        var76.field2613 = var79.field997;
                        var76.field2614 = var79.field967;
                        var76.field2654 = var79.field971;
                        var76.field2611 = var79.field969;
                        var76.field2598 = var79.field979;
                        var76.field2616 = var79.field983;
                        if (var76.field2582 > 0) {
                            var76.field2616 = var76.field2616 * 32 / var76.field2582;
                        }
                        continue;
                    }
                    if (var400 == 1201) {
                        var76.field2667 = 2;
                        var4--;
                        var76.field2606 = field365[var4];
                        continue;
                    }
                    if (var400 == 1202) {
                        var76.field2667 = 3;
                        var76.field2606 = Statics.field714.field28.method3114();
                        continue;
                    }
                } else if (var400 >= 1300 && var400 < 1400 || var400 >= 2300 && var400 < 2400) {
                    class158 var80;
                    if (var400 >= 2000) {
                        var400 -= 1000;
                        var4--;
                        var80 = class158.method220(field365[var4]);
                    } else {
                        var80 = var57 ? Statics.field376 : Statics.field173;
                    }
                    if (var400 == 1300) {
                        var4--;
                        int var81 = field365[var4] - 1;
                        if (var81 >= 0 && var81 <= 9) {
                            var5--;
                            var80.method3052(var81, field374[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var400 == 1301) {
                        var4 -= 2;
                        int var82 = field365[var4];
                        int var83 = field365[var4 + 1];
                        var80.field2658 = class158.method2262(var82, var83);
                        continue;
                    }
                    if (var400 == 1302) {
                        var4--;
                        var80.field2637 = field365[var4] == 1;
                        continue;
                    }
                    if (var400 == 1303) {
                        var4--;
                        var80.field2636 = field365[var4];
                        continue;
                    }
                    if (var400 == 1304) {
                        var4--;
                        var80.field2571 = field365[var4];
                        continue;
                    }
                    if (var400 == 1305) {
                        var5--;
                        var80.field2633 = field374[var5];
                        continue;
                    }
                    if (var400 == 1306) {
                        var5--;
                        var80.field2639 = field374[var5];
                        continue;
                    }
                    if (var400 == 1307) {
                        var80.field2634 = null;
                        continue;
                    }
                } else {
                    if (var400 >= 1400 && var400 < 1500 || var400 >= 2400 && var400 < 2500) {
                        class158 var84;
                        if (var400 >= 2000) {
                            var400 -= 1000;
                            var4--;
                            var84 = class158.method220(field365[var4]);
                        } else {
                            var84 = var57 ? Statics.field376 : Statics.field173;
                        }
                        var5--;
                        String var85 = field374[var5];
                        int[] var86 = null;
                        if (var85.length() > 0 && var85.charAt(var85.length() - 1) == 'Y') {
                            var4--;
                            int var87 = field365[var4];
                            if (var87 > 0) {
                                var86 = new int[var87];
                                while (var87-- > 0) {
                                    var4--;
                                    var86[var87] = field365[var4];
                                }
                            }
                            var85 = var85.substring(0, var85.length() - 1);
                        }
                        Object[] var88 = new Object[var85.length() + 1];
                        for (int var89 = var88.length - 1; var89 >= 1; var89--) {
                            if (var85.charAt(var89 - 1) == 's') {
                                var5--;
                                var88[var89] = field374[var5];
                            } else {
                                var4--;
                                var88[var89] = Integer.valueOf(field365[var4]);
                            }
                        }
                        var4--;
                        int var90 = field365[var4];
                        if (var90 == -1) {
                            var88 = null;
                        } else {
                            var88[0] = Integer.valueOf(var90);
                        }
                        if (var400 == 1400) {
                            var84.field2642 = var88;
                        }
                        if (var400 == 1401) {
                            var84.field2645 = var88;
                        }
                        if (var400 == 1402) {
                            var84.field2644 = var88;
                        }
                        if (var400 == 1403) {
                            var84.field2646 = var88;
                        }
                        if (var400 == 1404) {
                            var84.field2648 = var88;
                        }
                        if (var400 == 1405) {
                            var84.field2649 = var88;
                        }
                        if (var400 == 1406) {
                            var84.field2677 = var88;
                        }
                        if (var400 == 1407) {
                            var84.field2653 = var88;
                            var84.field2631 = var86;
                        }
                        if (var400 == 1408) {
                            var84.field2659 = var88;
                        }
                        if (var400 == 1409) {
                            var84.field2660 = var88;
                        }
                        if (var400 == 1410) {
                            var84.field2567 = var88;
                        }
                        if (var400 == 1411) {
                            var84.field2643 = var88;
                        }
                        if (var400 == 1412) {
                            var84.field2647 = var88;
                        }
                        if (var400 == 1414) {
                            var84.field2655 = var88;
                            var84.field2656 = var86;
                        }
                        if (var400 == 1415) {
                            var84.field2574 = var88;
                            var84.field2621 = var86;
                        }
                        if (var400 == 1416) {
                            var84.field2651 = var88;
                        }
                        if (var400 == 1417) {
                            var84.field2661 = var88;
                        }
                        if (var400 == 1418) {
                            var84.field2662 = var88;
                        }
                        if (var400 == 1419) {
                            var84.field2680 = var88;
                        }
                        if (var400 == 1420) {
                            var84.field2584 = var88;
                        }
                        if (var400 == 1421) {
                            var84.field2665 = var88;
                        }
                        if (var400 == 1422) {
                            var84.field2666 = var88;
                        }
                        if (var400 == 1423) {
                            var84.field2603 = var88;
                        }
                        if (var400 == 1424) {
                            var84.field2622 = var88;
                        }
                        var84.field2640 = true;
                        continue;
                    }
                    if (var400 < 1600) {
                        class158 var91 = var57 ? Statics.field376 : Statics.field173;
                        if (var400 == 1500) {
                            field365[var4++] = var91.field2578;
                            continue;
                        }
                        if (var400 == 1501) {
                            field365[var4++] = var91.field2579;
                            continue;
                        }
                        if (var400 == 1502) {
                            field365[var4++] = var91.field2582;
                            continue;
                        }
                        if (var400 == 1503) {
                            field365[var4++] = var91.field2583;
                            continue;
                        }
                        if (var400 == 1504) {
                            field365[var4++] = var91.field2683 ? 1 : 0;
                            continue;
                        }
                        if (var400 == 1505) {
                            field365[var4++] = var91.field2585;
                            continue;
                        }
                    } else if (var400 < 1700) {
                        class158 var92 = var57 ? Statics.field376 : Statics.field173;
                        if (var400 == 1600) {
                            field365[var4++] = var92.field2586;
                            continue;
                        }
                        if (var400 == 1601) {
                            field365[var4++] = var92.field2580;
                            continue;
                        }
                        if (var400 == 1602) {
                            field374[var5++] = var92.field2624;
                            continue;
                        }
                        if (var400 == 1603) {
                            field365[var4++] = var92.field2605;
                            continue;
                        }
                        if (var400 == 1604) {
                            field365[var4++] = var92.field2589;
                            continue;
                        }
                        if (var400 == 1605) {
                            field365[var4++] = var92.field2616;
                            continue;
                        }
                        if (var400 == 1606) {
                            field365[var4++] = var92.field2613;
                            continue;
                        }
                        if (var400 == 1607) {
                            field365[var4++] = var92.field2654;
                            continue;
                        }
                        if (var400 == 1608) {
                            field365[var4++] = var92.field2614;
                            continue;
                        }
                    } else if (var400 < 1800) {
                        class158 var93 = var57 ? Statics.field376 : Statics.field173;
                        if (var400 == 1700) {
                            field365[var4++] = var93.field2592;
                            continue;
                        }
                        if (var400 == 1701) {
                            if (var93.field2592 == -1) {
                                field365[var4++] = 0;
                            } else {
                                field365[var4++] = var93.field2682;
                            }
                            continue;
                        }
                        if (var400 == 1702) {
                            field365[var4++] = var93.field2601;
                            continue;
                        }
                    } else if (var400 < 1900) {
                        class158 var94 = var57 ? Statics.field376 : Statics.field173;
                        if (var400 == 1800) {
                            int[] var95 = field365;
                            int var96 = var4++;
                            int var97 = client.method712(var94);
                            int var98 = var97 >> 11 & 0x3F;
                            var95[var96] = var98;
                            continue;
                        }
                        if (var400 == 1801) {
                            var4--;
                            int var99 = field365[var4];
                            int var401 = var99 - 1;
                            if (var94.field2634 != null && var401 < var94.field2634.length && var94.field2634[var401] != null) {
                                field374[var5++] = var94.field2634[var401];
                                continue;
                            }
                            field374[var5++] = "";
                            continue;
                        }
                        if (var400 == 1802) {
                            if (var94.field2633 == null) {
                                field374[var5++] = "";
                            } else {
                                field374[var5++] = var94.field2633;
                            }
                            continue;
                        }
                    } else if (var400 < 2600) {
                        var4--;
                        class158 var100 = class158.method220(field365[var4]);
                        if (var400 == 2500) {
                            field365[var4++] = var100.field2578;
                            continue;
                        }
                        if (var400 == 2501) {
                            field365[var4++] = var100.field2579;
                            continue;
                        }
                        if (var400 == 2502) {
                            field365[var4++] = var100.field2582;
                            continue;
                        }
                        if (var400 == 2503) {
                            field365[var4++] = var100.field2583;
                            continue;
                        }
                        if (var400 == 2504) {
                            field365[var4++] = var100.field2683 ? 1 : 0;
                            continue;
                        }
                        if (var400 == 2505) {
                            field365[var4++] = var100.field2585;
                            continue;
                        }
                    } else if (var400 < 2700) {
                        var4--;
                        class158 var101 = class158.method220(field365[var4]);
                        if (var400 == 2600) {
                            field365[var4++] = var101.field2586;
                            continue;
                        }
                        if (var400 == 2601) {
                            field365[var4++] = var101.field2580;
                            continue;
                        }
                        if (var400 == 2602) {
                            field374[var5++] = var101.field2624;
                            continue;
                        }
                        if (var400 == 2603) {
                            field365[var4++] = var101.field2605;
                            continue;
                        }
                        if (var400 == 2604) {
                            field365[var4++] = var101.field2589;
                            continue;
                        }
                        if (var400 == 2605) {
                            field365[var4++] = var101.field2616;
                            continue;
                        }
                        if (var400 == 2606) {
                            field365[var4++] = var101.field2613;
                            continue;
                        }
                        if (var400 == 2607) {
                            field365[var4++] = var101.field2654;
                            continue;
                        }
                        if (var400 == 2608) {
                            field365[var4++] = var101.field2614;
                            continue;
                        }
                    } else if (var400 < 2800) {
                        if (var400 == 2700) {
                            var4--;
                            class158 var102 = class158.method220(field365[var4]);
                            field365[var4++] = var102.field2592;
                            continue;
                        }
                        if (var400 == 2701) {
                            var4--;
                            class158 var103 = class158.method220(field365[var4]);
                            if (var103.field2592 == -1) {
                                field365[var4++] = 0;
                            } else {
                                field365[var4++] = var103.field2682;
                            }
                            continue;
                        }
                        if (var400 == 2702) {
                            var4--;
                            int var104 = field365[var4];
                            class4 var105 = (class4) client.field608.method3259((long) var104);
                            if (var105 == null) {
                                field365[var4++] = 0;
                            } else {
                                field365[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var400 < 2900) {
                        var4--;
                        class158 var106 = class158.method220(field365[var4]);
                        if (var400 == 2800) {
                            int[] var107 = field365;
                            int var108 = var4++;
                            int var109 = client.method712(var106);
                            int var110 = var109 >> 11 & 0x3F;
                            var107[var108] = var110;
                            continue;
                        }
                        if (var400 == 2801) {
                            var4--;
                            int var111 = field365[var4];
                            int var402 = var111 - 1;
                            if (var106.field2634 != null && var402 < var106.field2634.length && var106.field2634[var402] != null) {
                                field374[var5++] = var106.field2634[var402];
                                continue;
                            }
                            field374[var5++] = "";
                            continue;
                        }
                        if (var400 == 2802) {
                            if (var106.field2633 == null) {
                                field374[var5++] = "";
                            } else {
                                field374[var5++] = var106.field2633;
                            }
                            continue;
                        }
                    } else if (var400 < 3200) {
                        if (var400 == 3100) {
                            var5--;
                            String var112 = field374[var5];
                            client.method3033(0, "", var112);
                            continue;
                        }
                        if (var400 == 3101) {
                            var4 -= 2;
                            client.method550(Statics.field714, field365[var4], field365[var4 + 1]);
                            continue;
                        }
                        if (var400 == 3103) {
                            Statics.method675();
                            continue;
                        }
                        if (var400 == 3104) {
                            var5--;
                            String var113 = field374[var5];
                            int var114 = 0;
                            if (class147.method3038(var113)) {
                                int var115 = class147.method2168(var113, 10, true);
                                var114 = var115;
                            }
                            client.field485.method2275(93);
                            client.field485.method2470(var114);
                            continue;
                        }
                        if (var400 == 3105) {
                            var5--;
                            String var116 = field374[var5];
                            client.field485.method2275(81);
                            client.field485.method2396(var116.length() + 1);
                            client.field485.method2401(var116);
                            continue;
                        }
                        if (var400 == 3106) {
                            var5--;
                            String var117 = field374[var5];
                            client.field485.method2275(23);
                            client.field485.method2396(var117.length() + 1);
                            client.field485.method2401(var117);
                            continue;
                        }
                        if (var400 == 3107) {
                            var4--;
                            int var118 = field365[var4];
                            var5--;
                            String var119 = field374[var5];
                            boolean var120 = false;
                            for (int var121 = 0; var121 < client.field683; var121++) {
                                class3 var122 = client.field566[client.field568[var121]];
                                if (var122 != null && var122.field39 != null && var122.field39.equalsIgnoreCase(var119)) {
                                    Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var122.field420[0], var122.field436[0], false, 0, 0, 1, 1, 0, 2);
                                    if (var118 == 1) {
                                        client.field485.method2275(96);
                                        client.field485.method2466(client.field568[var121]);
                                    } else if (var118 == 4) {
                                        client.field485.method2275(180);
                                        client.field485.method2439(client.field568[var121]);
                                    } else if (var118 == 6) {
                                        client.field485.method2275(128);
                                        client.field485.method2397(client.field568[var121]);
                                    } else if (var118 == 7) {
                                        client.field485.method2275(111);
                                        client.field485.method2499(client.field568[var121]);
                                    }
                                    var120 = true;
                                    break;
                                }
                            }
                            if (!var120) {
                                client.method3033(0, "", class134.field2082 + var119);
                            }
                            continue;
                        }
                        if (var400 == 3108) {
                            var4 -= 3;
                            int var123 = field365[var4];
                            int var124 = field365[var4 + 1];
                            int var125 = field365[var4 + 2];
                            class158 var126 = class158.method220(var125);
                            if (client.field512 == null && !client.field572 && var126 != null) {
                                class158 var127 = client.method576(var126);
                                if (var127 == null) {
                                    var127 = var126.field2658;
                                }
                                if (var127 != null) {
                                    client.field512 = var126;
                                    client.field619 = client.method856(var126);
                                    client.field562 = var123;
                                    client.field621 = var124;
                                    Statics.field2820 = 0;
                                    client.field629 = false;
                                }
                            }
                            continue;
                        }
                        if (var400 == 3109) {
                            var4 -= 2;
                            int var129 = field365[var4];
                            int var130 = field365[var4 + 1];
                            class158 var131 = var57 ? Statics.field376 : Statics.field173;
                            if (client.field512 == null && !client.field572 && var131 != null) {
                                class158 var132 = client.method576(var131);
                                if (var132 == null) {
                                    var132 = var131.field2658;
                                }
                                if (var132 != null) {
                                    client.field512 = var131;
                                    client.field619 = client.method856(var131);
                                    client.field562 = var129;
                                    client.field621 = var130;
                                    Statics.field2820 = 0;
                                    client.field629 = false;
                                }
                            }
                            continue;
                        }
                    } else if (var400 < 3300) {
                        if (var400 == 3200) {
                            var4 -= 3;
                            Statics.method2351(field365[var4], field365[var4 + 1], field365[var4 + 2]);
                            continue;
                        }
                        if (var400 == 3201) {
                            var4--;
                            client.method1240(field365[var4]);
                            continue;
                        }
                        if (var400 == 3202) {
                            var4 -= 2;
                            int var134 = field365[var4];
                            int var10000 = field365[var4 + 1];
                            if (client.field682 != 0 && var134 != -1) {
                                class138.method2342(Statics.field1700, var134, 0, client.field682, false);
                                client.field684 = true;
                            }
                            continue;
                        }
                    } else if (var400 < 3400) {
                        if (var400 == 3300) {
                            field365[var4++] = client.field668;
                            continue;
                        }
                        if (var400 == 3301) {
                            var4 -= 2;
                            int var136 = field365[var4];
                            int var137 = field365[var4 + 1];
                            int[] var138 = field365;
                            int var139 = var4++;
                            class19 var140 = (class19) class19.field256.method3259((long) var136);
                            int var141;
                            if (var140 == null) {
                                var141 = -1;
                            } else if (var137 >= 0 && var137 < var140.field262.length) {
                                var141 = var140.field262[var137];
                            } else {
                                var141 = -1;
                            }
                            var138[var139] = var141;
                            continue;
                        }
                        if (var400 == 3302) {
                            var4 -= 2;
                            int var142 = field365[var4];
                            int var143 = field365[var4 + 1];
                            field365[var4++] = class19.method126(var142, var143);
                            continue;
                        }
                        if (var400 == 3303) {
                            var4 -= 2;
                            int var144 = field365[var4];
                            int var145 = field365[var4 + 1];
                            field365[var4++] = class19.method2886(var144, var145);
                            continue;
                        }
                        if (var400 == 3304) {
                            var4--;
                            int var146 = field365[var4];
                            field365[var4++] = class41.method110(var146).field1002;
                            continue;
                        }
                        if (var400 == 3305) {
                            var4--;
                            int var147 = field365[var4];
                            field365[var4++] = client.field584[var147];
                            continue;
                        }
                        if (var400 == 3306) {
                            var4--;
                            int var148 = field365[var4];
                            field365[var4++] = client.field585[var148];
                            continue;
                        }
                        if (var400 == 3307) {
                            var4--;
                            int var149 = field365[var4];
                            field365[var4++] = client.field586[var149];
                            continue;
                        }
                        if (var400 == 3308) {
                            int var150 = Statics.field1310;
                            int var151 = (Statics.field714.field399 >> 7) + Statics.field497;
                            int var152 = (Statics.field714.field383 >> 7) + Statics.field904;
                            field365[var4++] = (var150 << 28) + (var151 << 14) + var152;
                            continue;
                        }
                        if (var400 == 3309) {
                            var4--;
                            int var153 = field365[var4];
                            field365[var4++] = var153 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var400 == 3310) {
                            var4--;
                            int var154 = field365[var4];
                            field365[var4++] = var154 >> 28;
                            continue;
                        }
                        if (var400 == 3311) {
                            var4--;
                            int var155 = field365[var4];
                            field365[var4++] = var155 & 0x3FFF;
                            continue;
                        }
                        if (var400 == 3312) {
                            field365[var4++] = client.field449 ? 1 : 0;
                            continue;
                        }
                        if (var400 == 3313) {
                            var4 -= 2;
                            int var156 = field365[var4] + 32768;
                            int var157 = field365[var4 + 1];
                            int[] var158 = field365;
                            int var159 = var4++;
                            class19 var160 = (class19) class19.field256.method3259((long) var156);
                            int var161;
                            if (var160 == null) {
                                var161 = -1;
                            } else if (var157 >= 0 && var157 < var160.field262.length) {
                                var161 = var160.field262[var157];
                            } else {
                                var161 = -1;
                            }
                            var158[var159] = var161;
                            continue;
                        }
                        if (var400 == 3314) {
                            var4 -= 2;
                            int var162 = field365[var4] + 32768;
                            int var163 = field365[var4 + 1];
                            field365[var4++] = class19.method126(var162, var163);
                            continue;
                        }
                        if (var400 == 3315) {
                            var4 -= 2;
                            int var164 = field365[var4] + 32768;
                            int var165 = field365[var4 + 1];
                            field365[var4++] = class19.method2886(var164, var165);
                            continue;
                        }
                        if (var400 == 3316) {
                            if (client.field614 >= 2) {
                                field365[var4++] = client.field614;
                            } else {
                                field365[var4++] = 0;
                            }
                            continue;
                        }
                        if (var400 == 3317) {
                            field365[var4++] = client.field475;
                            continue;
                        }
                        if (var400 == 3318) {
                            field365[var4++] = client.field446;
                            continue;
                        }
                        if (var400 == 3321) {
                            field365[var4++] = client.field612;
                            continue;
                        }
                        if (var400 == 3322) {
                            field365[var4++] = client.field613;
                            continue;
                        }
                        if (var400 == 3323) {
                            if (client.field615) {
                                field365[var4++] = 1;
                            } else {
                                field365[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var400 < 3500) {
                        if (var400 == 3400) {
                            var4 -= 2;
                            int var166 = field365[var4];
                            int var167 = field365[var4 + 1];
                            class39 var168 = (class39) class39.field942.method3196((long) var166);
                            class39 var169;
                            if (var168 == null) {
                                byte[] var170 = Statics.field950.method2920(8, var166);
                                class39 var171 = new class39();
                                if (var170 != null) {
                                    var171.method795(new class127(var170));
                                }
                                class39.field942.method3197(var171, (long) var166);
                                var169 = var171;
                            } else {
                                var169 = var168;
                            }
                            class39 var172 = var169;
                            if (var169.field944 != 's') {
                            }
                            for (int var173 = 0; var173 < var172.field947; var173++) {
                                if (var172.field948[var173] == var167) {
                                    field374[var5++] = var172.field946[var173];
                                    var172 = null;
                                    break;
                                }
                            }
                            if (var172 != null) {
                                field374[var5++] = var172.field953;
                            }
                            continue;
                        }
                        if (var400 == 3408) {
                            var4 -= 4;
                            int var174 = field365[var4];
                            int var175 = field365[var4 + 1];
                            int var176 = field365[var4 + 2];
                            int var177 = field365[var4 + 3];
                            class39 var178 = (class39) class39.field942.method3196((long) var176);
                            class39 var179;
                            if (var178 == null) {
                                byte[] var180 = Statics.field950.method2920(8, var176);
                                class39 var181 = new class39();
                                if (var180 != null) {
                                    var181.method795(new class127(var180));
                                }
                                class39.field942.method3197(var181, (long) var176);
                                var179 = var181;
                            } else {
                                var179 = var178;
                            }
                            class39 var182 = var179;
                            if (var179.field952 == var174 && var179.field944 == var175) {
                                for (int var183 = 0; var183 < var182.field947; var183++) {
                                    if (var182.field948[var183] == var177) {
                                        if (var175 == 115) {
                                            field374[var5++] = var182.field946[var183];
                                        } else {
                                            field365[var4++] = var182.field949[var183];
                                        }
                                        var182 = null;
                                        break;
                                    }
                                }
                                if (var182 != null) {
                                    if (var175 == 115) {
                                        field374[var5++] = var182.field953;
                                    } else {
                                        field365[var4++] = var182.field943;
                                    }
                                }
                                continue;
                            }
                            if (var175 == 115) {
                                field374[var5++] = "null";
                            } else {
                                field365[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var400 < 3700) {
                        if (var400 == 3600) {
                            if (client.field700 == 0) {
                                field365[var4++] = -2;
                            } else if (client.field700 == 1) {
                                field365[var4++] = -1;
                            } else {
                                field365[var4++] = client.field699;
                            }
                            continue;
                        }
                        if (var400 == 3601) {
                            var4--;
                            int var184 = field365[var4];
                            if (client.field700 == 2 && var184 < client.field699) {
                                field374[var5++] = client.field576[var184].field330;
                                continue;
                            }
                            field374[var5++] = "";
                            continue;
                        }
                        if (var400 == 3602) {
                            var4--;
                            int var185 = field365[var4];
                            if (client.field700 == 2 && var185 < client.field699) {
                                field365[var4++] = client.field576[var185].field332;
                                continue;
                            }
                            field365[var4++] = 0;
                            continue;
                        }
                        if (var400 == 3603) {
                            var4--;
                            int var186 = field365[var4];
                            if (client.field700 == 2 && var186 < client.field699) {
                                field365[var4++] = client.field576[var186].field333;
                                continue;
                            }
                            field365[var4++] = 0;
                            continue;
                        }
                        if (var400 == 3604) {
                            var5--;
                            String var187 = field374[var5];
                            var4--;
                            int var188 = field365[var4];
                            client.field485.method2275(206);
                            class116 var189 = client.field485;
                            int var190 = var187.length() + 1;
                            var189.method2396(var190 + 1);
                            client.field485.method2401(var187);
                            client.field485.method2430(var188);
                            continue;
                        }
                        if (var400 == 3605) {
                            var5--;
                            String var191 = field374[var5];
                            if (var191 == null) {
                                continue;
                            }
                            if ((client.field699 < 200 || client.field464 == 1) && client.field699 < 200) {
                                String var192 = Statics.method201(var191, Statics.field448);
                                if (var192 == null) {
                                    continue;
                                }
                                for (int var193 = 0; var193 < client.field699; var193++) {
                                    class23 var194 = client.field576[var193];
                                    String var195 = Statics.method201(var194.field330, Statics.field448);
                                    if (var195 != null && var195.equals(var192)) {
                                        client.method3033(0, "", var191 + class134.field2140);
                                        continue label2372;
                                    }
                                    if (var194.field338 != null) {
                                        String var196 = Statics.method201(var194.field338, Statics.field448);
                                        if (var196 != null && var196.equals(var192)) {
                                            client.method3033(0, "", var191 + class134.field2140);
                                            continue label2372;
                                        }
                                    }
                                }
                                for (int var197 = 0; var197 < client.field634; var197++) {
                                    class11 var198 = client.field704[var197];
                                    String var199 = Statics.method201(var198.field170, Statics.field448);
                                    if (var199 != null && var199.equals(var192)) {
                                        client.method3033(0, "", class134.field2217 + var191 + class134.field2190);
                                        continue label2372;
                                    }
                                    if (var198.field171 != null) {
                                        String var200 = Statics.method201(var198.field171, Statics.field448);
                                        if (var200 != null && var200.equals(var192)) {
                                            client.method3033(0, "", class134.field2217 + var191 + class134.field2190);
                                            continue label2372;
                                        }
                                    }
                                }
                                if (Statics.method201(Statics.field714.field39, Statics.field448).equals(var192)) {
                                    client.method3033(0, "", class134.field2215);
                                } else {
                                    client.field485.method2275(218);
                                    class116 var201 = client.field485;
                                    int var202 = var191.length() + 1;
                                    var201.method2396(var202);
                                    client.field485.method2401(var191);
                                }
                                continue;
                            }
                            client.method3033(0, "", class134.field2211);
                            continue;
                        }
                        if (var400 == 3606) {
                            var5--;
                            String var203 = field374[var5];
                            client.method1337(var203);
                            continue;
                        }
                        if (var400 == 3607) {
                            var5--;
                            String var204 = field374[var5];
                            if (var204 == null) {
                                continue;
                            }
                            if (client.field634 >= 100) {
                                client.method3033(0, "", class134.field2213);
                                continue;
                            }
                            String var205 = Statics.method201(var204, Statics.field448);
                            if (var205 == null) {
                                continue;
                            }
                            for (int var206 = 0; var206 < client.field634; var206++) {
                                class11 var207 = client.field704[var206];
                                String var208 = Statics.method201(var207.field170, Statics.field448);
                                if (var208 != null && var208.equals(var205)) {
                                    client.method3033(0, "", var204 + class134.field2101);
                                    continue label2372;
                                }
                                if (var207.field171 != null) {
                                    String var209 = Statics.method201(var207.field171, Statics.field448);
                                    if (var209 != null && var209.equals(var205)) {
                                        client.method3033(0, "", var204 + class134.field2101);
                                        continue label2372;
                                    }
                                }
                            }
                            for (int var210 = 0; var210 < client.field699; var210++) {
                                class23 var211 = client.field576[var210];
                                String var212 = Statics.method201(var211.field330, Statics.field448);
                                if (var212 != null && var212.equals(var205)) {
                                    client.method3033(0, "", class134.field2168 + var204 + class134.field2080);
                                    continue label2372;
                                }
                                if (var211.field338 != null) {
                                    String var213 = Statics.method201(var211.field338, Statics.field448);
                                    if (var213 != null && var213.equals(var205)) {
                                        client.method3033(0, "", class134.field2168 + var204 + class134.field2080);
                                        continue label2372;
                                    }
                                }
                            }
                            if (Statics.method201(Statics.field714.field39, Statics.field448).equals(var205)) {
                                client.method3033(0, "", class134.field2216);
                            } else {
                                client.field485.method2275(188);
                                class116 var214 = client.field485;
                                int var215 = var204.length() + 1;
                                var214.method2396(var215);
                                client.field485.method2401(var204);
                            }
                            continue;
                        }
                        if (var400 == 3608) {
                            var5--;
                            String var216 = field374[var5];
                            if (var216 == null) {
                                continue;
                            }
                            String var217 = Statics.method201(var216, Statics.field448);
                            if (var217 == null) {
                                continue;
                            }
                            int var218 = 0;
                            while (true) {
                                if (var218 >= client.field634) {
                                    continue label2372;
                                }
                                class11 var219 = client.field704[var218];
                                String var220 = var219.field170;
                                String var221 = Statics.method201(var220, Statics.field448);
                                if (class136.method1536(var216, var217, var220, var221)) {
                                    client.field634--;
                                    for (int var222 = var218; var222 < client.field634; var222++) {
                                        client.field704[var222] = client.field704[var222 + 1];
                                    }
                                    client.field638 = client.field630;
                                    client.field485.method2275(35);
                                    class116 var223 = client.field485;
                                    int var224 = var216.length() + 1;
                                    var223.method2396(var224);
                                    client.field485.method2401(var216);
                                    continue label2372;
                                }
                                var218++;
                            }
                        }
                        if (var400 == 3609) {
                            var5--;
                            String var225 = field374[var5];
                            if (var225.startsWith(class2.method1291(0)) || var225.startsWith(class2.method1291(1))) {
                                var225 = var225.substring(7);
                            }
                            field365[var4++] = Statics.method111(var225) ? 1 : 0;
                            continue;
                        }
                        if (var400 == 3611) {
                            if (client.field672 == null) {
                                field374[var5++] = "";
                            } else {
                                field374[var5++] = class146.method1350(client.field672);
                            }
                            continue;
                        }
                        if (var400 == 3612) {
                            if (client.field672 == null) {
                                field365[var4++] = 0;
                            } else {
                                field365[var4++] = Statics.field360;
                            }
                            continue;
                        }
                        if (var400 == 3613) {
                            var4--;
                            int var226 = field365[var4];
                            if (client.field672 != null && var226 < Statics.field360) {
                                field374[var5++] = Statics.field1434[var226].field116;
                                continue;
                            }
                            field374[var5++] = "";
                            continue;
                        }
                        if (var400 == 3614) {
                            var4--;
                            int var227 = field365[var4];
                            if (client.field672 != null && var227 < Statics.field360) {
                                field365[var4++] = Statics.field1434[var227].field107;
                                continue;
                            }
                            field365[var4++] = 0;
                            continue;
                        }
                        if (var400 == 3615) {
                            var4--;
                            int var228 = field365[var4];
                            if (client.field672 != null && var228 < Statics.field360) {
                                field365[var4++] = Statics.field1434[var228].field108;
                                continue;
                            }
                            field365[var4++] = 0;
                            continue;
                        }
                        if (var400 == 3616) {
                            field365[var4++] = Statics.field55;
                            continue;
                        }
                        if (var400 == 3617) {
                            var5--;
                            String var229 = field374[var5];
                            client.method1157(var229);
                            continue;
                        }
                        if (var400 == 3618) {
                            field365[var4++] = Statics.field2457;
                            continue;
                        }
                        if (var400 == 3619) {
                            var5--;
                            String var230 = field374[var5];
                            if (!var230.equals("")) {
                                client.field485.method2275(179);
                                class116 var231 = client.field485;
                                int var232 = var230.length() + 1;
                                var231.method2396(var232);
                                client.field485.method2401(var230);
                            }
                            continue;
                        }
                        if (var400 == 3620) {
                            client.method2349();
                            continue;
                        }
                        if (var400 == 3621) {
                            if (client.field700 == 0) {
                                field365[var4++] = -1;
                            } else {
                                field365[var4++] = client.field634;
                            }
                            continue;
                        }
                        if (var400 == 3622) {
                            var4--;
                            int var233 = field365[var4];
                            if (client.field700 != 0 && var233 < client.field634) {
                                field374[var5++] = client.field704[var233].field170;
                                continue;
                            }
                            field374[var5++] = "";
                            continue;
                        }
                        if (var400 == 3623) {
                            var5--;
                            String var234 = field374[var5];
                            if (var234.startsWith(class2.method1291(0)) || var234.startsWith(class2.method1291(1))) {
                                var234 = var234.substring(7);
                            }
                            field365[var4++] = Statics.method713(var234) ? 1 : 0;
                            continue;
                        }
                        if (var400 == 3624) {
                            var4--;
                            int var235 = field365[var4];
                            if (Statics.field1434 != null && var235 < Statics.field360 && Statics.field1434[var235].field116.equalsIgnoreCase(Statics.field714.field39)) {
                                field365[var4++] = 1;
                                continue;
                            }
                            field365[var4++] = 0;
                            continue;
                        }
                        if (var400 == 3625) {
                            if (client.field646 == null) {
                                field374[var5++] = "";
                            } else {
                                field374[var5++] = class146.method1350(client.field646);
                            }
                            continue;
                        }
                    } else if (var400 < 4100) {
                        if (var400 == 4000) {
                            var4 -= 2;
                            int var236 = field365[var4];
                            int var237 = field365[var4 + 1];
                            field365[var4++] = var236 + var237;
                            continue;
                        }
                        if (var400 == 4001) {
                            var4 -= 2;
                            int var238 = field365[var4];
                            int var239 = field365[var4 + 1];
                            field365[var4++] = var238 - var239;
                            continue;
                        }
                        if (var400 == 4002) {
                            var4 -= 2;
                            int var240 = field365[var4];
                            int var241 = field365[var4 + 1];
                            field365[var4++] = var240 * var241;
                            continue;
                        }
                        if (var400 == 4003) {
                            var4 -= 2;
                            int var242 = field365[var4];
                            int var243 = field365[var4 + 1];
                            field365[var4++] = var242 / var243;
                            continue;
                        }
                        if (var400 == 4004) {
                            var4--;
                            int var244 = field365[var4];
                            field365[var4++] = (int) (Math.random() * (double) var244);
                            continue;
                        }
                        if (var400 == 4005) {
                            var4--;
                            int var245 = field365[var4];
                            field365[var4++] = (int) (Math.random() * (double) (var245 + 1));
                            continue;
                        }
                        if (var400 == 4006) {
                            var4 -= 5;
                            int var246 = field365[var4];
                            int var247 = field365[var4 + 1];
                            int var248 = field365[var4 + 2];
                            int var249 = field365[var4 + 3];
                            int var250 = field365[var4 + 4];
                            field365[var4++] = (var247 - var246) * (var250 - var248) / (var249 - var248) + var246;
                            continue;
                        }
                        if (var400 == 4007) {
                            var4 -= 2;
                            int var251 = field365[var4];
                            int var252 = field365[var4 + 1];
                            field365[var4++] = var251 * var252 / 100 + var251;
                            continue;
                        }
                        if (var400 == 4008) {
                            var4 -= 2;
                            int var253 = field365[var4];
                            int var254 = field365[var4 + 1];
                            field365[var4++] = var253 | 0x1 << var254;
                            continue;
                        }
                        if (var400 == 4009) {
                            var4 -= 2;
                            int var255 = field365[var4];
                            int var256 = field365[var4 + 1];
                            field365[var4++] = var255 & -1 - (0x1 << var256);
                            continue;
                        }
                        if (var400 == 4010) {
                            var4 -= 2;
                            int var257 = field365[var4];
                            int var258 = field365[var4 + 1];
                            field365[var4++] = (var257 & 0x1 << var258) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var400 == 4011) {
                            var4 -= 2;
                            int var259 = field365[var4];
                            int var260 = field365[var4 + 1];
                            field365[var4++] = var259 % var260;
                            continue;
                        }
                        if (var400 == 4012) {
                            var4 -= 2;
                            int var261 = field365[var4];
                            int var262 = field365[var4 + 1];
                            if (var261 == 0) {
                                field365[var4++] = 0;
                            } else {
                                field365[var4++] = (int) Math.pow((double) var261, (double) var262);
                            }
                            continue;
                        }
                        if (var400 == 4013) {
                            var4 -= 2;
                            int var263 = field365[var4];
                            int var264 = field365[var4 + 1];
                            if (var263 == 0) {
                                field365[var4++] = 0;
                            } else if (var264 == 0) {
                                field365[var4++] = Integer.MAX_VALUE;
                            } else {
                                field365[var4++] = (int) Math.pow((double) var263, 1.0D / (double) var264);
                            }
                            continue;
                        }
                        if (var400 == 4014) {
                            var4 -= 2;
                            int var265 = field365[var4];
                            int var266 = field365[var4 + 1];
                            field365[var4++] = var265 & var266;
                            continue;
                        }
                        if (var400 == 4015) {
                            var4 -= 2;
                            int var267 = field365[var4];
                            int var268 = field365[var4 + 1];
                            field365[var4++] = var267 | var268;
                            continue;
                        }
                    } else if (var400 < 4200) {
                        if (var400 == 4100) {
                            var5--;
                            String var269 = field374[var5];
                            var4--;
                            int var270 = field365[var4];
                            field374[var5++] = var269 + var270;
                            continue;
                        }
                        if (var400 == 4101) {
                            var5 -= 2;
                            String var271 = field374[var5];
                            String var272 = field374[var5 + 1];
                            field374[var5++] = var271 + var272;
                            continue;
                        }
                        if (var400 == 4102) {
                            var5--;
                            String var273 = field374[var5];
                            var4--;
                            int var274 = field365[var4];
                            field374[var5++] = var273 + class147.method370(var274, true);
                            continue;
                        }
                        if (var400 == 4103) {
                            var5--;
                            String var275 = field374[var5];
                            field374[var5++] = var275.toLowerCase();
                            continue;
                        }
                        if (var400 == 4104) {
                            var4--;
                            int var276 = field365[var4];
                            long var277 = ((long) var276 + 11745L) * 86400000L;
                            field370.setTime(new Date(var277));
                            int var279 = field370.get(5);
                            int var280 = field370.get(2);
                            int var281 = field370.get(1);
                            field374[var5++] = var279 + "-" + field369[var280] + "-" + var281;
                            continue;
                        }
                        if (var400 == 4105) {
                            var5 -= 2;
                            String var282 = field374[var5];
                            String var283 = field374[var5 + 1];
                            if (Statics.field714.field28 != null && Statics.field714.field28.field2718) {
                                field374[var5++] = var283;
                                continue;
                            }
                            field374[var5++] = var282;
                            continue;
                        }
                        if (var400 == 4106) {
                            var4--;
                            int var284 = field365[var4];
                            field374[var5++] = Integer.toString(var284);
                            continue;
                        }
                        if (var400 == 4107) {
                            var5 -= 2;
                            int[] var285 = field365;
                            int var286 = var4++;
                            String var287 = field374[var5];
                            String var288 = field374[var5 + 1];
                            int var289 = client.field451;
                            int var290 = var287.length();
                            int var291 = var288.length();
                            int var292 = 0;
                            int var293 = 0;
                            char var294 = 0;
                            char var295 = 0;
                            int var296;
                            label2227: while (true) {
                                if (var292 - var294 >= var290 && var293 - var295 >= var291) {
                                    int var305 = Math.min(var290, var291);
                                    for (int var306 = 0; var306 < var305; var306++) {
                                        char var309 = var287.charAt(var306);
                                        char var310 = var288.charAt(var306);
                                        if (var309 != var310 && Character.toUpperCase(var309) != Character.toUpperCase(var310)) {
                                            char var311 = Character.toLowerCase(var309);
                                            char var312 = Character.toLowerCase(var310);
                                            if (var311 != var312) {
                                                var296 = class150.method98(var311, var289) - class150.method98(var312, var289);
                                                break label2227;
                                            }
                                        }
                                    }
                                    int var313 = var290 - var291;
                                    if (var313 == 0) {
                                        for (int var314 = 0; var314 < var305; var314++) {
                                            char var315 = var287.charAt(var314);
                                            char var316 = var288.charAt(var314);
                                            if (var315 != var316) {
                                                var296 = class150.method98(var315, var289) - class150.method98(var316, var289);
                                                break label2227;
                                            }
                                        }
                                        var296 = 0;
                                    } else {
                                        var296 = var313;
                                    }
                                    break;
                                }
                                if (var292 - var294 >= var290) {
                                    var296 = -1;
                                    break;
                                }
                                if (var293 - var295 >= var291) {
                                    var296 = 1;
                                    break;
                                }
                                char var297;
                                if (var294 == 0) {
                                    var297 = var287.charAt(var292++);
                                } else {
                                    var297 = var294;
                                    boolean var298 = false;
                                }
                                char var299;
                                if (var295 == 0) {
                                    var299 = var288.charAt(var293++);
                                } else {
                                    var299 = var295;
                                    boolean var300 = false;
                                }
                                var294 = class150.method1998(var297);
                                var295 = class150.method1998(var299);
                                char var301 = class150.method2166(var297, var289);
                                char var302 = class150.method2166(var299, var289);
                                if (var301 != var302 && Character.toUpperCase(var301) != Character.toUpperCase(var302)) {
                                    char var303 = Character.toLowerCase(var301);
                                    char var304 = Character.toLowerCase(var302);
                                    if (var303 != var304) {
                                        var296 = class150.method98(var303, var289) - class150.method98(var304, var289);
                                        break;
                                    }
                                }
                            }
                            byte var318;
                            if (var296 > 0) {
                                var318 = 1;
                            } else if (var296 < 0) {
                                var318 = -1;
                            } else {
                                var318 = 0;
                            }
                            var285[var286] = var318;
                            continue;
                        }
                        if (var400 == 4108) {
                            var5--;
                            String var319 = field374[var5];
                            var4 -= 2;
                            int var320 = field365[var4];
                            int var321 = field365[var4 + 1];
                            byte[] var322 = Statics.field188.method2920(var321, 0);
                            class183 var323 = new class183(var322);
                            field365[var4++] = var323.method3356(var319, var320);
                            continue;
                        }
                        if (var400 == 4109) {
                            var5--;
                            String var324 = field374[var5];
                            var4 -= 2;
                            int var325 = field365[var4];
                            int var326 = field365[var4 + 1];
                            byte[] var327 = Statics.field188.method2920(var326, 0);
                            class183 var328 = new class183(var327);
                            field365[var4++] = var328.method3325(var324, var325);
                            continue;
                        }
                        if (var400 == 4110) {
                            var5 -= 2;
                            String var329 = field374[var5];
                            String var330 = field374[var5 + 1];
                            var4--;
                            if (field365[var4] == 1) {
                                field374[var5++] = var329;
                            } else {
                                field374[var5++] = var330;
                            }
                            continue;
                        }
                        if (var400 == 4111) {
                            var5--;
                            String var331 = field374[var5];
                            field374[var5++] = class185.method3326(var331);
                            continue;
                        }
                        if (var400 == 4112) {
                            var5--;
                            String var332 = field374[var5];
                            var4--;
                            int var333 = field365[var4];
                            field374[var5++] = var332 + (char) var333;
                            continue;
                        }
                        if (var400 == 4113) {
                            var4--;
                            int var334 = field365[var4];
                            field365[var4++] = class147.method522((char) var334) ? 1 : 0;
                            continue;
                        }
                        if (var400 == 4114) {
                            var4--;
                            int var335 = field365[var4];
                            field365[var4++] = class147.method2639((char) var335) ? 1 : 0;
                            continue;
                        }
                        if (var400 == 4115) {
                            var4--;
                            int var336 = field365[var4];
                            int[] var337 = field365;
                            int var338 = var4++;
                            char var339 = (char) var336;
                            boolean var340 = var339 >= 'A' && var339 <= 'Z' || var339 >= 'a' && var339 <= 'z';
                            var337[var338] = var340 ? 1 : 0;
                            continue;
                        }
                        if (var400 == 4116) {
                            var4--;
                            int var341 = field365[var4];
                            field365[var4++] = class147.method2171((char) var341) ? 1 : 0;
                            continue;
                        }
                        if (var400 == 4117) {
                            var5--;
                            String var342 = field374[var5];
                            if (var342 == null) {
                                field365[var4++] = 0;
                            } else {
                                field365[var4++] = var342.length();
                            }
                            continue;
                        }
                        if (var400 == 4118) {
                            var5--;
                            String var343 = field374[var5];
                            var4 -= 2;
                            int var344 = field365[var4];
                            int var345 = field365[var4 + 1];
                            field374[var5++] = var343.substring(var344, var345);
                            continue;
                        }
                        if (var400 == 4119) {
                            var5--;
                            String var346 = field374[var5];
                            StringBuilder var347 = new StringBuilder(var346.length());
                            boolean var348 = false;
                            for (int var349 = 0; var349 < var346.length(); var349++) {
                                char var350 = var346.charAt(var349);
                                if (var350 == '<') {
                                    var348 = true;
                                } else if (var350 == '>') {
                                    var348 = false;
                                } else if (!var348) {
                                    var347.append(var350);
                                }
                            }
                            field374[var5++] = var347.toString();
                            continue;
                        }
                        if (var400 == 4120) {
                            var5--;
                            String var351 = field374[var5];
                            var4--;
                            int var352 = field365[var4];
                            field365[var4++] = var351.indexOf(var352);
                            continue;
                        }
                    } else if (var400 < 4300) {
                        if (var400 == 4200) {
                            var4--;
                            int var353 = field365[var4];
                            field374[var5++] = class40.method125(var353).field960;
                            continue;
                        }
                        if (var400 == 4201) {
                            var4 -= 2;
                            int var354 = field365[var4];
                            int var355 = field365[var4 + 1];
                            class40 var356 = class40.method125(var354);
                            if (var355 >= 1 && var355 <= 5 && var356.field982[var355 - 1] != null) {
                                field374[var5++] = var356.field982[var355 - 1];
                                continue;
                            }
                            field374[var5++] = "";
                            continue;
                        }
                        if (var400 == 4202) {
                            var4 -= 2;
                            int var357 = field365[var4];
                            int var358 = field365[var4 + 1];
                            class40 var359 = class40.method125(var357);
                            if (var358 >= 1 && var358 <= 5 && var359.field975[var358 - 1] != null) {
                                field374[var5++] = var359.field975[var358 - 1];
                                continue;
                            }
                            field374[var5++] = "";
                            continue;
                        }
                        if (var400 == 4203) {
                            var4--;
                            int var360 = field365[var4];
                            field365[var4++] = class40.method125(var360).field998;
                            continue;
                        }
                        if (var400 == 4204) {
                            var4--;
                            int var361 = field365[var4];
                            field365[var4++] = class40.method125(var361).field985 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var400 == 4205) {
                            var4--;
                            int var362 = field365[var4];
                            class40 var363 = class40.method125(var362);
                            if (var363.field991 == -1 && var363.field968 >= 0) {
                                field365[var4++] = var363.field968;
                                continue;
                            }
                            field365[var4++] = var362;
                            continue;
                        }
                        if (var400 == 4206) {
                            var4--;
                            int var364 = field365[var4];
                            class40 var365 = class40.method125(var364);
                            if (var365.field991 >= 0 && var365.field968 >= 0) {
                                field365[var4++] = var365.field968;
                                continue;
                            }
                            field365[var4++] = var364;
                            continue;
                        }
                        if (var400 == 4207) {
                            var4--;
                            int var366 = field365[var4];
                            field365[var4++] = class40.method125(var366).field972 ? 1 : 0;
                            continue;
                        }
                    } else if (var400 < 5100) {
                        if (var400 == 5000) {
                            field365[var4++] = client.field664;
                            continue;
                        }
                        if (var400 == 5001) {
                            var4 -= 3;
                            client.field664 = field365[var4];
                            Statics.field1781 = class137.method1997(field365[var4 + 1]);
                            if (Statics.field1781 == null) {
                                Statics.field1781 = class137.field2304;
                            }
                            client.field665 = field365[var4 + 2];
                            client.field485.method2275(119);
                            client.field485.method2396(client.field664);
                            client.field485.method2396(Statics.field1781.field2303);
                            client.field485.method2396(client.field665);
                            continue;
                        }
                        if (var400 == 5002) {
                            var5--;
                            String var367 = field374[var5];
                            var4 -= 2;
                            int var368 = field365[var4];
                            int var369 = field365[var4 + 1];
                            client.field485.method2275(13);
                            class116 var370 = client.field485;
                            int var371 = var367.length() + 1;
                            var370.method2396(var371 + 2);
                            client.field485.method2401(var367);
                            client.field485.method2396(var368 - 1);
                            client.field485.method2396(var369);
                            continue;
                        }
                        if (var400 == 5003) {
                            var4--;
                            int var372 = field365[var4];
                            String var373 = null;
                            if (var372 < 100) {
                                var373 = client.field661[var372];
                            }
                            if (var373 == null) {
                                var373 = "";
                            }
                            field374[var5++] = var373;
                            continue;
                        }
                        if (var400 == 5004) {
                            var4--;
                            int var374 = field365[var4];
                            int var375 = -1;
                            if (var374 < 100 && client.field661[var374] != null) {
                                var375 = client.field633[var374];
                            }
                            field365[var4++] = var375;
                            continue;
                        }
                        if (var400 == 5005) {
                            if (Statics.field1781 == null) {
                                field365[var4++] = -1;
                            } else {
                                field365[var4++] = Statics.field1781.field2303;
                            }
                            continue;
                        }
                        if (var400 == 5008) {
                            var5--;
                            String var376 = field374[var5];
                            if (var376.startsWith("::")) {
                                client.method3111(var376);
                            } else {
                                String var377 = var376.toLowerCase();
                                byte var378 = 0;
                                if (var377.startsWith(class134.field2221)) {
                                    var378 = 0;
                                    var376 = var376.substring(class134.field2221.length());
                                } else if (var377.startsWith(class134.field2223)) {
                                    var378 = 1;
                                    var376 = var376.substring(class134.field2223.length());
                                } else if (var377.startsWith(class134.field2083)) {
                                    var378 = 2;
                                    var376 = var376.substring(class134.field2083.length());
                                } else if (var377.startsWith(class134.field2218)) {
                                    var378 = 3;
                                    var376 = var376.substring(class134.field2218.length());
                                } else if (var377.startsWith(class134.field2229)) {
                                    var378 = 4;
                                    var376 = var376.substring(class134.field2229.length());
                                } else if (var377.startsWith(class134.field2231)) {
                                    var378 = 5;
                                    var376 = var376.substring(class134.field2231.length());
                                } else if (var377.startsWith(class134.field2131)) {
                                    var378 = 6;
                                    var376 = var376.substring(class134.field2131.length());
                                } else if (var377.startsWith(class134.field2235)) {
                                    var378 = 7;
                                    var376 = var376.substring(class134.field2235.length());
                                } else if (var377.startsWith(class134.field2237)) {
                                    var378 = 8;
                                    var376 = var376.substring(class134.field2237.length());
                                } else if (var377.startsWith(class134.field2077)) {
                                    var378 = 9;
                                    var376 = var376.substring(class134.field2077.length());
                                } else if (var377.startsWith(class134.field2241)) {
                                    var378 = 10;
                                    var376 = var376.substring(class134.field2241.length());
                                } else if (var377.startsWith(class134.field2060)) {
                                    var378 = 11;
                                    var376 = var376.substring(class134.field2060.length());
                                } else if (client.field451 != 0) {
                                    if (var377.startsWith(class134.field2222)) {
                                        var378 = 0;
                                        var376 = var376.substring(class134.field2222.length());
                                    } else if (var377.startsWith(class134.field2224)) {
                                        var378 = 1;
                                        var376 = var376.substring(class134.field2224.length());
                                    } else if (var377.startsWith(class134.field2280)) {
                                        var378 = 2;
                                        var376 = var376.substring(class134.field2280.length());
                                    } else if (var377.startsWith(class134.field2200)) {
                                        var378 = 3;
                                        var376 = var376.substring(class134.field2200.length());
                                    } else if (var377.startsWith(class134.field2143)) {
                                        var378 = 4;
                                        var376 = var376.substring(class134.field2143.length());
                                    } else if (var377.startsWith(class134.field2113)) {
                                        var378 = 5;
                                        var376 = var376.substring(class134.field2113.length());
                                    } else if (var377.startsWith(class134.field2234)) {
                                        var378 = 6;
                                        var376 = var376.substring(class134.field2234.length());
                                    } else if (var377.startsWith(class134.field2236)) {
                                        var378 = 7;
                                        var376 = var376.substring(class134.field2236.length());
                                    } else if (var377.startsWith(class134.field2238)) {
                                        var378 = 8;
                                        var376 = var376.substring(class134.field2238.length());
                                    } else if (var377.startsWith(class134.field2256)) {
                                        var378 = 9;
                                        var376 = var376.substring(class134.field2256.length());
                                    } else if (var377.startsWith(class134.field2192)) {
                                        var378 = 10;
                                        var376 = var376.substring(class134.field2192.length());
                                    } else if (var377.startsWith(class134.field2098)) {
                                        var378 = 11;
                                        var376 = var376.substring(class134.field2098.length());
                                    }
                                }
                                String var379 = var376.toLowerCase();
                                byte var380 = 0;
                                if (var379.startsWith(class134.field2245)) {
                                    var380 = 1;
                                    var376 = var376.substring(class134.field2245.length());
                                } else if (var379.startsWith(class134.field2247)) {
                                    var380 = 2;
                                    var376 = var376.substring(class134.field2247.length());
                                } else if (var379.startsWith(class134.field2209)) {
                                    var380 = 3;
                                    var376 = var376.substring(class134.field2209.length());
                                } else if (var379.startsWith(class134.field2251)) {
                                    var380 = 4;
                                    var376 = var376.substring(class134.field2251.length());
                                } else if (var379.startsWith(class134.field2253)) {
                                    var380 = 5;
                                    var376 = var376.substring(class134.field2253.length());
                                } else if (client.field451 != 0) {
                                    if (var379.startsWith(class134.field2180)) {
                                        var380 = 1;
                                        var376 = var376.substring(class134.field2180.length());
                                    } else if (var379.startsWith(class134.field2283)) {
                                        var380 = 2;
                                        var376 = var376.substring(class134.field2283.length());
                                    } else if (var379.startsWith(class134.field2250)) {
                                        var380 = 3;
                                        var376 = var376.substring(class134.field2250.length());
                                    } else if (var379.startsWith(class134.field2252)) {
                                        var380 = 4;
                                        var376 = var376.substring(class134.field2252.length());
                                    } else if (var379.startsWith(class134.field2254)) {
                                        var380 = 5;
                                        var376 = var376.substring(class134.field2254.length());
                                    }
                                }
                                client.field485.method2275(228);
                                client.field485.method2396(0);
                                int var381 = client.field485.field2008;
                                client.field485.method2396(var378);
                                client.field485.method2396(var380);
                                class116 var382 = client.field485;
                                int var383 = var382.field2008;
                                byte[] var384 = class149.method1207(var376);
                                var382.method2408(var384.length);
                                var382.field2008 += Statics.field2830.method2328(var384, 0, var384.length, var382.field2015, var382.field2008);
                                client.field485.method2492(client.field485.field2008 - var381);
                            }
                            continue;
                        }
                        if (var400 == 5009) {
                            var5 -= 2;
                            String var385 = field374[var5];
                            String var386 = field374[var5 + 1];
                            client.field485.method2275(10);
                            client.field485.method2397(0);
                            int var387 = client.field485.field2008;
                            client.field485.method2401(var385);
                            class116 var388 = client.field485;
                            int var389 = var388.field2008;
                            byte[] var390 = class149.method1207(var386);
                            var388.method2408(var390.length);
                            var388.field2008 += Statics.field2830.method2328(var390, 0, var390.length, var388.field2015, var388.field2008);
                            client.field485.method2406(client.field485.field2008 - var387);
                            continue;
                        }
                        if (var400 == 5010) {
                            var4--;
                            int var391 = field365[var4];
                            String var392 = null;
                            if (var391 < 100) {
                                var392 = client.field580[var391];
                            }
                            if (var392 == null) {
                                var392 = "";
                            }
                            field374[var5++] = var392;
                            continue;
                        }
                        if (var400 == 5011) {
                            var4--;
                            int var393 = field365[var4];
                            String var394 = null;
                            if (var393 < 100) {
                                var394 = client.field660[var393];
                            }
                            if (var394 == null) {
                                var394 = "";
                            }
                            field374[var5++] = var394;
                            continue;
                        }
                        if (var400 == 5015) {
                            String var395;
                            if (Statics.field714 == null || Statics.field714.field39 == null) {
                                var395 = "";
                            } else {
                                var395 = Statics.field714.field39;
                            }
                            field374[var5++] = var395;
                            continue;
                        }
                        if (var400 == 5016) {
                            field365[var4++] = client.field665;
                            continue;
                        }
                        if (var400 == 5017) {
                            field365[var4++] = client.field469;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var399) {
            StringBuilder var397 = new StringBuilder(30);
            var397.append("").append(var3.field2816).append(" ");
            for (int var398 = field377 - 1; var398 >= 0; var398--) {
                var397.append("").append(field368[var398].field246.field2816).append(" ");
            }
            var397.append("").append(var9);
            class80.method2341(var397.toString(), var399);
        }
    }

    @ObfuscatedName("em.p(II)V")
    public static void method2627(int arg0) {
        if (arg0 == -1 || !class158.method1202(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2607[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3.field2641 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field1 = var3.field2641;
                method161(var4);
            }
        }
    }
}
