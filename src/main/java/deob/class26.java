package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("j")
public class class26 {

    @ObfuscatedName("j.t")
    public static int[] field386 = new int[5];

    @ObfuscatedName("j.f")
    public static int[][] field388 = new int[5][5000];

    @ObfuscatedName("j.c")
    public static int[] field389 = new int[1000];

    @ObfuscatedName("j.p")
    public static String[] field390 = new String[1000];

    @ObfuscatedName("j.s")
    public static int field391 = 0;

    @ObfuscatedName("j.k")
    public static class18[] field392 = new class18[50];

    @ObfuscatedName("j.b")
    public static Calendar field394 = Calendar.getInstance();

    @ObfuscatedName("j.l")
    public static final String[] field387 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.d(Ld;B)V")
    public static void method1254(class1 arg0) {
        Object[] var1 = arg0.field8;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method1507(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field81;
        int[] var8 = var3.field74;
        byte var9 = -1;
        field391 = 0;
        try {
            Statics.field385 = new int[var3.field77];
            int var10 = 0;
            Statics.field393 = new String[var3.field78];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field3;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field4;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2595;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2596;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2595;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2596;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field17;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field20;
                    }
                    Statics.field385[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field393[var11++] = var14;
                }
            }
            int var15 = 0;
            label2377: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var377 = var7[var6];
                if (var377 < 100) {
                    if (var377 == 0) {
                        field389[var4++] = var8[var6];
                        continue;
                    }
                    if (var377 == 1) {
                        int var16 = var8[var6];
                        field389[var4++] = class159.field2715[var16];
                        continue;
                    }
                    if (var377 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class159.field2715[var17] = field389[var4];
                        continue;
                    }
                    if (var377 == 3) {
                        field390[var5++] = var3.field76[var6];
                        continue;
                    }
                    if (var377 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var377 == 7) {
                        var4 -= 2;
                        if (field389[var4 + 1] != field389[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var377 == 8) {
                        var4 -= 2;
                        if (field389[var4 + 1] == field389[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var377 == 9) {
                        var4 -= 2;
                        if (field389[var4] < field389[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var377 == 10) {
                        var4 -= 2;
                        if (field389[var4] > field389[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var377 == 21) {
                        if (field391 == 0) {
                            return;
                        }
                        class18 var18 = field392[--field391];
                        var3 = var18.field260;
                        var7 = var3.field81;
                        var8 = var3.field74;
                        var6 = var18.field261;
                        Statics.field385 = var18.field262;
                        Statics.field393 = var18.field263;
                        continue;
                    }
                    if (var377 == 25) {
                        int var19 = var8[var6];
                        field389[var4++] = Statics.method2894(var19);
                        continue;
                    }
                    if (var377 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field389[var4];
                        class38 var22 = class38.method2001(var20);
                        int var23 = var22.field953;
                        int var24 = var22.field954;
                        int var25 = var22.field955;
                        int var26 = class159.field2717[var25 - var24];
                        if (var21 < 0 || var21 > var26) {
                            var21 = 0;
                        }
                        int var27 = var26 << var24;
                        class159.field2715[var23] = class159.field2715[var23] & ~var27 | var21 << var24 & var27;
                        continue;
                    }
                    if (var377 == 31) {
                        var4 -= 2;
                        if (field389[var4] <= field389[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var377 == 32) {
                        var4 -= 2;
                        if (field389[var4] >= field389[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var377 == 33) {
                        field389[var4++] = Statics.field385[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var377 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field385[var10001] = field389[var4];
                        continue;
                    }
                    if (var377 == 35) {
                        field390[var5++] = Statics.field393[var8[var6]];
                        continue;
                    }
                    if (var377 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field393[var10001] = field390[var5];
                        continue;
                    }
                    if (var377 == 37) {
                        int var28 = var8[var6];
                        var5 -= var28;
                        String[] var29 = field390;
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
                        field390[var5++] = var30;
                        continue;
                    }
                    if (var377 == 38) {
                        var4--;
                        continue;
                    }
                    if (var377 == 39) {
                        var5--;
                        continue;
                    }
                    if (var377 == 40) {
                        int var40 = var8[var6];
                        class5 var41 = class5.method1507(var40);
                        int[] var42 = new int[var41.field77];
                        String[] var43 = new String[var41.field78];
                        for (int var44 = 0; var44 < var41.field79; var44++) {
                            var42[var44] = field389[var4 - var41.field79 + var44];
                        }
                        for (int var45 = 0; var45 < var41.field73; var45++) {
                            var43[var45] = field390[var5 - var41.field73 + var45];
                        }
                        var4 -= var41.field79;
                        var5 -= var41.field73;
                        class18 var46 = new class18();
                        var46.field260 = var3;
                        var46.field261 = var6;
                        var46.field262 = Statics.field385;
                        var46.field263 = Statics.field393;
                        field392[++field391 - 1] = var46;
                        var3 = var41;
                        var7 = var41.field81;
                        var8 = var41.field74;
                        var6 = -1;
                        Statics.field385 = var42;
                        Statics.field393 = var43;
                        continue;
                    }
                    if (var377 == 42) {
                        field389[var4++] = client.field656[var8[var6]];
                        continue;
                    }
                    if (var377 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field656[var10001] = field389[var4];
                        continue;
                    }
                    if (var377 == 44) {
                        int var47 = var8[var6] >> 16;
                        int var48 = var8[var6] & 0xFFFF;
                        var4--;
                        int var49 = field389[var4];
                        if (var49 >= 0 && var49 <= 5000) {
                            field386[var47] = var49;
                            byte var50 = -1;
                            if (var48 == 105) {
                                var50 = 0;
                            }
                            int var51 = 0;
                            while (true) {
                                if (var51 >= var49) {
                                    continue label2377;
                                }
                                field388[var47][var51] = var50;
                                var51++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var377 == 45) {
                        int var52 = var8[var6];
                        var4--;
                        int var53 = field389[var4];
                        if (var53 >= 0 && var53 < field386[var52]) {
                            field389[var4++] = field388[var52][var53];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var377 == 46) {
                        int var54 = var8[var6];
                        var4 -= 2;
                        int var55 = field389[var4];
                        if (var55 >= 0 && var55 < field386[var54]) {
                            field388[var54][var55] = field389[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var377 == 47) {
                        String var56 = client.field657[var8[var6]];
                        if (var56 == null) {
                            var56 = "null";
                        }
                        field390[var5++] = var56;
                        continue;
                    }
                    if (var377 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field657[var10001] = field390[var5];
                        continue;
                    }
                }
                boolean var57;
                if (var8[var6] == 1) {
                    var57 = true;
                } else {
                    var57 = false;
                }
                if (var377 < 1000) {
                    if (var377 == 100) {
                        var4 -= 3;
                        int var58 = field389[var4];
                        int var59 = field389[var4 + 1];
                        int var60 = field389[var4 + 2];
                        if (var59 == 0) {
                            throw new RuntimeException();
                        }
                        class158 var61 = class158.method3027(var58);
                        if (var61.field2703 == null) {
                            var61.field2703 = new class158[var60 + 1];
                        }
                        if (var61.field2703.length <= var60) {
                            class158[] var62 = new class158[var60 + 1];
                            for (int var63 = 0; var63 < var61.field2703.length; var63++) {
                                var62[var63] = var61.field2703[var63];
                            }
                            var61.field2703 = var62;
                        }
                        if (var60 > 0 && var61.field2703[var60 - 1] == null) {
                            throw new RuntimeException("" + (var60 - 1));
                        }
                        class158 var64 = new class158();
                        var64.field2597 = var59;
                        var64.field2606 = var64.field2595 = var61.field2595;
                        var64.field2596 = var60;
                        var64.field2594 = true;
                        var61.field2703[var60] = var64;
                        if (var57) {
                            Statics.field31 = var64;
                        } else {
                            Statics.field395 = var64;
                        }
                        client.method62(var61);
                        continue;
                    }
                    if (var377 == 101) {
                        class158 var65 = var57 ? Statics.field31 : Statics.field395;
                        class158 var66 = class158.method3027(var65.field2595);
                        var66.field2703[var65.field2596] = null;
                        client.method62(var66);
                        continue;
                    }
                    if (var377 == 102) {
                        var4--;
                        class158 var67 = class158.method3027(field389[var4]);
                        var67.field2703 = null;
                        client.method62(var67);
                        continue;
                    }
                    if (var377 == 200) {
                        var4 -= 2;
                        int var68 = field389[var4];
                        int var69 = field389[var4 + 1];
                        class158 var70 = class158.method2990(var68, var69);
                        if (var70 != null && var69 != -1) {
                            field389[var4++] = 1;
                            if (var57) {
                                Statics.field31 = var70;
                            } else {
                                Statics.field395 = var70;
                            }
                            continue;
                        }
                        field389[var4++] = 0;
                        continue;
                    }
                } else if (var377 >= 1000 && var377 < 1100 || var377 >= 2000 && var377 < 2100) {
                    class158 var71;
                    if (var377 >= 2000) {
                        var377 -= 1000;
                        var4--;
                        var71 = class158.method3027(field389[var4]);
                    } else {
                        var71 = var57 ? Statics.field31 : Statics.field395;
                    }
                    if (var377 == 1000) {
                        var4 -= 2;
                        var71.field2600 = field389[var4];
                        var71.field2702 = field389[var4 + 1];
                        client.method62(var71);
                        continue;
                    }
                    if (var377 == 1001) {
                        var4 -= 2;
                        var71.field2637 = field389[var4];
                        var71.field2605 = field389[var4 + 1];
                        client.method62(var71);
                        continue;
                    }
                    if (var377 == 1003) {
                        var4--;
                        boolean var72 = field389[var4] == 1;
                        if (var71.field2601 != var72) {
                            var71.field2601 = var72;
                            client.method62(var71);
                        }
                        continue;
                    }
                } else if (!(var377 < 1100 || var377 >= 1200) || !(var377 < 2100 || var377 >= 2200)) {
                    class158 var73;
                    if (var377 >= 2000) {
                        var377 -= 1000;
                        var4--;
                        var73 = class158.method3027(field389[var4]);
                    } else {
                        var73 = var57 ? Statics.field31 : Statics.field395;
                    }
                    if (var377 == 1100) {
                        var4 -= 2;
                        var73.field2608 = field389[var4];
                        if (var73.field2608 > var73.field2674 - var73.field2637) {
                            var73.field2608 = var73.field2674 - var73.field2637;
                        }
                        if (var73.field2608 < 0) {
                            var73.field2608 = 0;
                        }
                        var73.field2691 = field389[var4 + 1];
                        if (var73.field2691 > var73.field2611 - var73.field2605) {
                            var73.field2691 = var73.field2611 - var73.field2605;
                        }
                        if (var73.field2691 < 0) {
                            var73.field2691 = 0;
                        }
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1101) {
                        var4--;
                        var73.field2607 = field389[var4];
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1102) {
                        var4--;
                        var73.field2670 = field389[var4] == 1;
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1103) {
                        var4--;
                        var73.field2676 = field389[var4];
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1104) {
                        var4--;
                        var73.field2618 = field389[var4];
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1105) {
                        var4--;
                        var73.field2619 = field389[var4];
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1106) {
                        var4--;
                        var73.field2621 = field389[var4];
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1107) {
                        var4--;
                        var73.field2622 = field389[var4] == 1;
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1108) {
                        var73.field2627 = 1;
                        var4--;
                        var73.field2686 = field389[var4];
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1109) {
                        var4 -= 6;
                        var73.field2633 = field389[var4];
                        var73.field2634 = field389[var4 + 1];
                        var73.field2635 = field389[var4 + 2];
                        var73.field2689 = field389[var4 + 3];
                        var73.field2683 = field389[var4 + 4];
                        var73.field2638 = field389[var4 + 5];
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1110) {
                        var4--;
                        int var74 = field389[var4];
                        if (var73.field2616 != var74) {
                            var73.field2616 = var74;
                            var73.field2653 = 0;
                            var73.field2631 = 0;
                            client.method62(var73);
                        }
                        continue;
                    }
                    if (var377 == 1111) {
                        var4--;
                        var73.field2640 = field389[var4] == 1;
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1112) {
                        var5--;
                        String var75 = field390[var5];
                        if (!var75.equals(var73.field2642)) {
                            var73.field2642 = var75;
                            client.method62(var73);
                        }
                        continue;
                    }
                    if (var377 == 1113) {
                        var4--;
                        var73.field2641 = field389[var4];
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1114) {
                        var4 -= 3;
                        var73.field2589 = field389[var4];
                        var73.field2609 = field389[var4 + 1];
                        var73.field2644 = field389[var4 + 2];
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1115) {
                        var4--;
                        var73.field2647 = field389[var4] == 1;
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1116) {
                        var4--;
                        var73.field2623 = field389[var4];
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1117) {
                        var4--;
                        var73.field2624 = field389[var4];
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1118) {
                        var4--;
                        var73.field2625 = field389[var4] == 1;
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1119) {
                        var4--;
                        var73.field2712 = field389[var4] == 1;
                        client.method62(var73);
                        continue;
                    }
                    if (var377 == 1120) {
                        var4 -= 2;
                        var73.field2674 = field389[var4];
                        var73.field2611 = field389[var4 + 1];
                        client.method62(var73);
                        continue;
                    }
                } else if (var377 >= 1200 && var377 < 1300 || var377 >= 2200 && var377 < 2300) {
                    class158 var76;
                    if (var377 >= 2000) {
                        var377 -= 1000;
                        var4--;
                        var76 = class158.method3027(field389[var4]);
                    } else {
                        var76 = var57 ? Statics.field31 : Statics.field395;
                    }
                    client.method62(var76);
                    if (var377 == 1200) {
                        var4 -= 2;
                        int var77 = field389[var4];
                        int var78 = field389[var4 + 1];
                        var76.field2706 = var77;
                        var76.field2636 = var78;
                        class40 var79 = class40.method211(var77);
                        var76.field2635 = var79.field990;
                        var76.field2689 = var79.field991;
                        var76.field2683 = var79.field992;
                        var76.field2633 = var79.field999;
                        var76.field2634 = var79.field980;
                        var76.field2638 = var79.field989;
                        if (var76.field2637 > 0) {
                            var76.field2638 = var76.field2638 * 32 / var76.field2637;
                        }
                        continue;
                    }
                    if (var377 == 1201) {
                        var76.field2627 = 2;
                        var4--;
                        var76.field2686 = field389[var4];
                        continue;
                    }
                    if (var377 == 1202) {
                        var76.field2627 = 3;
                        var76.field2686 = Statics.field2319.field40.method3131();
                        continue;
                    }
                } else if ((var377 < 1300 || var377 >= 1400) && (var377 < 2300 || var377 >= 2400)) {
                    if (var377 >= 1400 && var377 < 1500 || var377 >= 2400 && var377 < 2500) {
                        class158 var84;
                        if (var377 >= 2000) {
                            var377 -= 1000;
                            var4--;
                            var84 = class158.method3027(field389[var4]);
                        } else {
                            var84 = var57 ? Statics.field31 : Statics.field395;
                        }
                        var5--;
                        String var85 = field390[var5];
                        int[] var86 = null;
                        if (var85.length() > 0 && var85.charAt(var85.length() - 1) == 'Y') {
                            var4--;
                            int var87 = field389[var4];
                            if (var87 > 0) {
                                var86 = new int[var87];
                                while (var87-- > 0) {
                                    var4--;
                                    var86[var87] = field389[var4];
                                }
                            }
                            var85 = var85.substring(0, var85.length() - 1);
                        }
                        Object[] var88 = new Object[var85.length() + 1];
                        for (int var89 = var88.length - 1; var89 >= 1; var89--) {
                            if (var85.charAt(var89 - 1) == 's') {
                                var5--;
                                var88[var89] = field390[var5];
                            } else {
                                var4--;
                                var88[var89] = Integer.valueOf(field389[var4]);
                            }
                        }
                        var4--;
                        int var90 = field389[var4];
                        if (var90 == -1) {
                            var88 = null;
                        } else {
                            var88[0] = Integer.valueOf(var90);
                        }
                        if (var377 == 1400) {
                            var84.field2664 = var88;
                        }
                        if (var377 == 1401) {
                            var84.field2667 = var88;
                        }
                        if (var377 == 1402) {
                            var84.field2617 = var88;
                        }
                        if (var377 == 1403) {
                            var84.field2668 = var88;
                        }
                        if (var377 == 1404) {
                            var84.field2649 = var88;
                        }
                        if (var377 == 1405) {
                            var84.field2671 = var88;
                        }
                        if (var377 == 1406) {
                            var84.field2651 = var88;
                        }
                        if (var377 == 1407) {
                            var84.field2675 = var88;
                            var84.field2654 = var86;
                        }
                        if (var377 == 1408) {
                            var84.field2681 = var88;
                        }
                        if (var377 == 1409) {
                            var84.field2682 = var88;
                        }
                        if (var377 == 1410) {
                            var84.field2672 = var88;
                        }
                        if (var377 == 1411) {
                            var84.field2598 = var88;
                        }
                        if (var377 == 1412) {
                            var84.field2669 = var88;
                        }
                        if (var377 == 1414) {
                            var84.field2677 = var88;
                            var84.field2678 = var86;
                        }
                        if (var377 == 1415) {
                            var84.field2679 = var88;
                            var84.field2680 = var86;
                        }
                        if (var377 == 1416) {
                            var84.field2673 = var88;
                        }
                        if (var377 == 1417) {
                            var84.field2699 = var88;
                        }
                        if (var377 == 1418) {
                            var84.field2684 = var88;
                        }
                        if (var377 == 1419) {
                            var84.field2685 = var88;
                        }
                        if (var377 == 1420) {
                            var84.field2591 = var88;
                        }
                        if (var377 == 1421) {
                            var84.field2687 = var88;
                        }
                        if (var377 == 1422) {
                            var84.field2688 = var88;
                        }
                        if (var377 == 1423) {
                            var84.field2700 = var88;
                        }
                        if (var377 == 1424) {
                            var84.field2690 = var88;
                        }
                        var84.field2662 = true;
                        continue;
                    }
                    if (var377 < 1600) {
                        class158 var91 = var57 ? Statics.field31 : Statics.field395;
                        if (var377 == 1500) {
                            field389[var4++] = var91.field2600;
                            continue;
                        }
                        if (var377 == 1501) {
                            field389[var4++] = var91.field2702;
                            continue;
                        }
                        if (var377 == 1502) {
                            field389[var4++] = var91.field2637;
                            continue;
                        }
                        if (var377 == 1503) {
                            field389[var4++] = var91.field2605;
                            continue;
                        }
                        if (var377 == 1504) {
                            field389[var4++] = var91.field2601 ? 1 : 0;
                            continue;
                        }
                        if (var377 == 1505) {
                            field389[var4++] = var91.field2606;
                            continue;
                        }
                    } else if (var377 < 1700) {
                        class158 var92 = var57 ? Statics.field31 : Statics.field395;
                        if (var377 == 1600) {
                            field389[var4++] = var92.field2608;
                            continue;
                        }
                        if (var377 == 1601) {
                            field389[var4++] = var92.field2691;
                            continue;
                        }
                        if (var377 == 1602) {
                            field390[var5++] = var92.field2642;
                            continue;
                        }
                        if (var377 == 1603) {
                            field389[var4++] = var92.field2674;
                            continue;
                        }
                        if (var377 == 1604) {
                            field389[var4++] = var92.field2611;
                            continue;
                        }
                        if (var377 == 1605) {
                            field389[var4++] = var92.field2638;
                            continue;
                        }
                        if (var377 == 1606) {
                            field389[var4++] = var92.field2635;
                            continue;
                        }
                        if (var377 == 1607) {
                            field389[var4++] = var92.field2683;
                            continue;
                        }
                        if (var377 == 1608) {
                            field389[var4++] = var92.field2689;
                            continue;
                        }
                    } else if (var377 < 1800) {
                        class158 var93 = var57 ? Statics.field31 : Statics.field395;
                        if (var377 == 1700) {
                            field389[var4++] = var93.field2706;
                            continue;
                        }
                        if (var377 == 1701) {
                            if (var93.field2706 == -1) {
                                field389[var4++] = 0;
                            } else {
                                field389[var4++] = var93.field2636;
                            }
                            continue;
                        }
                        if (var377 == 1702) {
                            field389[var4++] = var93.field2596;
                            continue;
                        }
                    } else if (var377 < 1900) {
                        class158 var94 = var57 ? Statics.field31 : Statics.field395;
                        if (var377 == 1800) {
                            int[] var95 = field389;
                            int var96 = var4++;
                            int var97 = client.method2685(var94);
                            int var98 = var97 >> 11 & 0x3F;
                            var95[var96] = var98;
                            continue;
                        }
                        if (var377 == 1801) {
                            var4--;
                            int var99 = field389[var4];
                            int var378 = var99 - 1;
                            if (var94.field2656 != null && var378 < var94.field2656.length && var94.field2656[var378] != null) {
                                field390[var5++] = var94.field2656[var378];
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var377 == 1802) {
                            if (var94.field2655 == null) {
                                field390[var5++] = "";
                            } else {
                                field390[var5++] = var94.field2655;
                            }
                            continue;
                        }
                    } else if (var377 < 2600) {
                        var4--;
                        class158 var100 = class158.method3027(field389[var4]);
                        if (var377 == 2500) {
                            field389[var4++] = var100.field2600;
                            continue;
                        }
                        if (var377 == 2501) {
                            field389[var4++] = var100.field2702;
                            continue;
                        }
                        if (var377 == 2502) {
                            field389[var4++] = var100.field2637;
                            continue;
                        }
                        if (var377 == 2503) {
                            field389[var4++] = var100.field2605;
                            continue;
                        }
                        if (var377 == 2504) {
                            field389[var4++] = var100.field2601 ? 1 : 0;
                            continue;
                        }
                        if (var377 == 2505) {
                            field389[var4++] = var100.field2606;
                            continue;
                        }
                    } else if (var377 < 2700) {
                        var4--;
                        class158 var101 = class158.method3027(field389[var4]);
                        if (var377 == 2600) {
                            field389[var4++] = var101.field2608;
                            continue;
                        }
                        if (var377 == 2601) {
                            field389[var4++] = var101.field2691;
                            continue;
                        }
                        if (var377 == 2602) {
                            field390[var5++] = var101.field2642;
                            continue;
                        }
                        if (var377 == 2603) {
                            field389[var4++] = var101.field2674;
                            continue;
                        }
                        if (var377 == 2604) {
                            field389[var4++] = var101.field2611;
                            continue;
                        }
                        if (var377 == 2605) {
                            field389[var4++] = var101.field2638;
                            continue;
                        }
                        if (var377 == 2606) {
                            field389[var4++] = var101.field2635;
                            continue;
                        }
                        if (var377 == 2607) {
                            field389[var4++] = var101.field2683;
                            continue;
                        }
                        if (var377 == 2608) {
                            field389[var4++] = var101.field2689;
                            continue;
                        }
                    } else if (var377 < 2800) {
                        if (var377 == 2700) {
                            var4--;
                            class158 var102 = class158.method3027(field389[var4]);
                            field389[var4++] = var102.field2706;
                            continue;
                        }
                        if (var377 == 2701) {
                            var4--;
                            class158 var103 = class158.method3027(field389[var4]);
                            if (var103.field2706 == -1) {
                                field389[var4++] = 0;
                            } else {
                                field389[var4++] = var103.field2636;
                            }
                            continue;
                        }
                        if (var377 == 2702) {
                            var4--;
                            int var104 = field389[var4];
                            class4 var105 = (class4) client.field623.method3255((long) var104);
                            if (var105 == null) {
                                field389[var4++] = 0;
                            } else {
                                field389[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var377 < 2900) {
                        var4--;
                        class158 var106 = class158.method3027(field389[var4]);
                        if (var377 == 2800) {
                            int[] var107 = field389;
                            int var108 = var4++;
                            int var109 = client.method2685(var106);
                            int var110 = var109 >> 11 & 0x3F;
                            var107[var108] = var110;
                            continue;
                        }
                        if (var377 == 2801) {
                            var4--;
                            int var111 = field389[var4];
                            int var379 = var111 - 1;
                            if (var106.field2656 != null && var379 < var106.field2656.length && var106.field2656[var379] != null) {
                                field390[var5++] = var106.field2656[var379];
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var377 == 2802) {
                            if (var106.field2655 == null) {
                                field390[var5++] = "";
                            } else {
                                field390[var5++] = var106.field2655;
                            }
                            continue;
                        }
                    } else if (var377 < 3200) {
                        if (var377 == 3100) {
                            var5--;
                            String var112 = field390[var5];
                            client.method2003(0, "", var112);
                            continue;
                        }
                        if (var377 == 3101) {
                            var4 -= 2;
                            client.method146(Statics.field2319, field389[var4], field389[var4 + 1]);
                            continue;
                        }
                        if (var377 == 3103) {
                            client.field501.method2265(131);
                            for (class4 var113 = (class4) client.field623.method3257(); var113 != null; var113 = (class4) client.field623.method3258()) {
                                if (var113.field64 == 0 || var113.field64 == 3) {
                                    client.method3318(var113, true);
                                }
                            }
                            if (client.field459 != null) {
                                client.method62(client.field459);
                                client.field459 = null;
                            }
                            continue;
                        }
                        if (var377 == 3104) {
                            var5--;
                            String var114 = field390[var5];
                            int var115 = 0;
                            if (class147.method2853(var114)) {
                                var115 = class147.method1253(var114);
                            }
                            client.field501.method2265(157);
                            client.field501.method2389(var115);
                            continue;
                        }
                        if (var377 == 3105) {
                            var5--;
                            String var116 = field390[var5];
                            client.field501.method2265(237);
                            client.field501.method2386(var116.length() + 1);
                            client.field501.method2574(var116);
                            continue;
                        }
                        if (var377 == 3106) {
                            var5--;
                            String var117 = field390[var5];
                            client.field501.method2265(162);
                            client.field501.method2386(var117.length() + 1);
                            client.field501.method2574(var117);
                            continue;
                        }
                        if (var377 == 3107) {
                            var4--;
                            int var118 = field389[var4];
                            var5--;
                            String var119 = field390[var5];
                            boolean var120 = false;
                            for (int var121 = 0; var121 < client.field642; var121++) {
                                class3 var122 = client.field582[client.field584[var121]];
                                if (var122 != null && var122.field52 != null && var122.field52.equalsIgnoreCase(var119)) {
                                    client.method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var122.field451[0], var122.field452[0], false, 0, 0, 1, 1, 0, 2);
                                    if (var118 == 1) {
                                        client.field501.method2265(145);
                                        client.field501.method2429(client.field584[var121]);
                                    } else if (var118 == 4) {
                                        client.field501.method2265(160);
                                        client.field501.method2429(client.field584[var121]);
                                    } else if (var118 == 6) {
                                        client.field501.method2265(80);
                                        client.field501.method2387(client.field584[var121]);
                                    } else if (var118 == 7) {
                                        client.field501.method2265(85);
                                        client.field501.method2538(client.field584[var121]);
                                    }
                                    var120 = true;
                                    break;
                                }
                            }
                            if (!var120) {
                                client.method2003(0, "", class134.field2218 + var119);
                            }
                            continue;
                        }
                        if (var377 == 3108) {
                            var4 -= 3;
                            int var123 = field389[var4];
                            int var124 = field389[var4 + 1];
                            int var125 = field389[var4 + 2];
                            class158 var126 = class158.method3027(var125);
                            client.method1631(var126, var123, var124);
                            continue;
                        }
                        if (var377 == 3109) {
                            var4 -= 2;
                            int var127 = field389[var4];
                            int var128 = field389[var4 + 1];
                            class158 var129 = var57 ? Statics.field31 : Statics.field395;
                            client.method1631(var129, var127, var128);
                            continue;
                        }
                    } else if (var377 < 3300) {
                        if (var377 == 3200) {
                            var4 -= 3;
                            client.method2167(field389[var4], field389[var4 + 1], field389[var4 + 2]);
                            continue;
                        }
                        if (var377 == 3201) {
                            var4--;
                            int var130 = field389[var4];
                            if (var130 == -1 && !client.field699) {
                                class138.method138();
                            } else if (var130 != -1 && client.field698 != var130 && client.field532 != 0 && !client.field699) {
                                class154 var131 = Statics.field1512;
                                int var132 = client.field532;
                                class138.field2340 = 1;
                                Statics.field2341 = var131;
                                Statics.field2342 = var130;
                                Statics.field2344 = 0;
                                Statics.field2012 = var132;
                                Statics.field2030 = false;
                                Statics.field2038 = 2;
                            }
                            client.field698 = var130;
                            continue;
                        }
                        if (var377 == 3202) {
                            var4 -= 2;
                            int var133 = field389[var4];
                            int var10000 = field389[var4 + 1];
                            if (client.field532 != 0 && var133 != -1) {
                                class138.method574(Statics.field1440, var133, 0, client.field532, false);
                                client.field699 = true;
                            }
                            continue;
                        }
                    } else if (var377 < 3400) {
                        if (var377 == 3300) {
                            field389[var4++] = client.field472;
                            continue;
                        }
                        if (var377 == 3301) {
                            var4 -= 2;
                            int var135 = field389[var4];
                            int var136 = field389[var4 + 1];
                            int[] var137 = field389;
                            int var138 = var4++;
                            class19 var139 = (class19) class19.field277.method3255((long) var135);
                            int var140;
                            if (var139 == null) {
                                var140 = -1;
                            } else if (var136 >= 0 && var136 < var139.field268.length) {
                                var140 = var139.field268[var136];
                            } else {
                                var140 = -1;
                            }
                            var137[var138] = var140;
                            continue;
                        }
                        if (var377 == 3302) {
                            var4 -= 2;
                            int var141 = field389[var4];
                            int var142 = field389[var4 + 1];
                            field389[var4++] = class19.method6(var141, var142);
                            continue;
                        }
                        if (var377 == 3303) {
                            var4 -= 2;
                            int var143 = field389[var4];
                            int var144 = field389[var4 + 1];
                            field389[var4++] = class19.method147(var143, var144);
                            continue;
                        }
                        if (var377 == 3304) {
                            var4--;
                            int var145 = field389[var4];
                            int[] var146 = field389;
                            int var147 = var4++;
                            class41 var148 = (class41) class41.field1033.method3210((long) var145);
                            class41 var149;
                            if (var148 == null) {
                                byte[] var150 = Statics.field1032.method2958(5, var145);
                                class41 var151 = new class41();
                                if (var150 != null) {
                                    var151.method859(new class127(var150));
                                }
                                class41.field1033.method3221(var151, (long) var145);
                                var149 = var151;
                            } else {
                                var149 = var148;
                            }
                            var146[var147] = var149.field1027;
                            continue;
                        }
                        if (var377 == 3305) {
                            var4--;
                            int var152 = field389[var4];
                            field389[var4++] = client.field552[var152];
                            continue;
                        }
                        if (var377 == 3306) {
                            var4--;
                            int var153 = field389[var4];
                            field389[var4++] = client.field601[var153];
                            continue;
                        }
                        if (var377 == 3307) {
                            var4--;
                            int var154 = field389[var4];
                            field389[var4++] = client.field503[var154];
                            continue;
                        }
                        if (var377 == 3308) {
                            int var155 = Statics.field2034;
                            int var156 = (Statics.field2319.field420 >> 7) + Statics.field751;
                            int var157 = (Statics.field2319.field400 >> 7) + Statics.field1920;
                            field389[var4++] = (var155 << 28) + (var156 << 14) + var157;
                            continue;
                        }
                        if (var377 == 3309) {
                            var4--;
                            int var158 = field389[var4];
                            field389[var4++] = var158 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var377 == 3310) {
                            var4--;
                            int var159 = field389[var4];
                            field389[var4++] = var159 >> 28;
                            continue;
                        }
                        if (var377 == 3311) {
                            var4--;
                            int var160 = field389[var4];
                            field389[var4++] = var160 & 0x3FFF;
                            continue;
                        }
                        if (var377 == 3312) {
                            field389[var4++] = client.field471 ? 1 : 0;
                            continue;
                        }
                        if (var377 == 3313) {
                            var4 -= 2;
                            int var161 = field389[var4] + 32768;
                            int var162 = field389[var4 + 1];
                            int[] var163 = field389;
                            int var164 = var4++;
                            class19 var165 = (class19) class19.field277.method3255((long) var161);
                            int var166;
                            if (var165 == null) {
                                var166 = -1;
                            } else if (var162 >= 0 && var162 < var165.field268.length) {
                                var166 = var165.field268[var162];
                            } else {
                                var166 = -1;
                            }
                            var163[var164] = var166;
                            continue;
                        }
                        if (var377 == 3314) {
                            var4 -= 2;
                            int var167 = field389[var4] + 32768;
                            int var168 = field389[var4 + 1];
                            int[] var169 = field389;
                            int var170 = var4++;
                            class19 var171 = (class19) class19.field277.method3255((long) var167);
                            int var172;
                            if (var171 == null) {
                                var172 = 0;
                            } else if (var168 >= 0 && var168 < var171.field270.length) {
                                var172 = var171.field270[var168];
                            } else {
                                var172 = 0;
                            }
                            var169[var170] = var172;
                            continue;
                        }
                        if (var377 == 3315) {
                            var4 -= 2;
                            int var173 = field389[var4] + 32768;
                            int var174 = field389[var4 + 1];
                            field389[var4++] = class19.method147(var173, var174);
                            continue;
                        }
                        if (var377 == 3316) {
                            if (client.field629 >= 2) {
                                field389[var4++] = client.field629;
                            } else {
                                field389[var4++] = 0;
                            }
                            continue;
                        }
                        if (var377 == 3317) {
                            field389[var4++] = client.field479;
                            continue;
                        }
                        if (var377 == 3318) {
                            field389[var4++] = client.field461;
                            continue;
                        }
                        if (var377 == 3321) {
                            field389[var4++] = client.field627;
                            continue;
                        }
                        if (var377 == 3322) {
                            field389[var4++] = client.field628;
                            continue;
                        }
                        if (var377 == 3323) {
                            if (client.field630) {
                                field389[var4++] = 1;
                            } else {
                                field389[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var377 < 3500) {
                        if (var377 == 3400) {
                            var4 -= 2;
                            int var175 = field389[var4];
                            int var176 = field389[var4 + 1];
                            class39 var177 = (class39) class39.field961.method3210((long) var175);
                            class39 var178;
                            if (var177 == null) {
                                byte[] var179 = Statics.field970.method2958(8, var175);
                                class39 var180 = new class39();
                                if (var179 != null) {
                                    var180.method797(new class127(var179));
                                }
                                class39.field961.method3221(var180, (long) var175);
                                var178 = var180;
                            } else {
                                var178 = var177;
                            }
                            class39 var181 = var178;
                            if (var178.field971 != 's') {
                            }
                            for (int var182 = 0; var182 < var181.field967; var182++) {
                                if (var181.field968[var182] == var176) {
                                    field390[var5++] = var181.field963[var182];
                                    var181 = null;
                                    break;
                                }
                            }
                            if (var181 != null) {
                                field390[var5++] = var181.field965;
                            }
                            continue;
                        }
                        if (var377 == 3408) {
                            var4 -= 4;
                            int var183 = field389[var4];
                            int var184 = field389[var4 + 1];
                            int var185 = field389[var4 + 2];
                            int var186 = field389[var4 + 3];
                            class39 var187 = class39.method205(var185);
                            if (var187.field973 == var183 && var187.field971 == var184) {
                                for (int var188 = 0; var188 < var187.field967; var188++) {
                                    if (var187.field968[var188] == var186) {
                                        if (var184 == 115) {
                                            field390[var5++] = var187.field963[var188];
                                        } else {
                                            field389[var4++] = var187.field969[var188];
                                        }
                                        var187 = null;
                                        break;
                                    }
                                }
                                if (var187 != null) {
                                    if (var184 == 115) {
                                        field390[var5++] = var187.field965;
                                    } else {
                                        field389[var4++] = var187.field966;
                                    }
                                }
                                continue;
                            }
                            if (var184 == 115) {
                                field390[var5++] = "null";
                            } else {
                                field389[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var377 < 3700) {
                        if (var377 == 3600) {
                            if (client.field715 == 0) {
                                field389[var4++] = -2;
                            } else if (client.field715 == 1) {
                                field389[var4++] = -1;
                            } else {
                                field389[var4++] = client.field714;
                            }
                            continue;
                        }
                        if (var377 == 3601) {
                            var4--;
                            int var189 = field389[var4];
                            if (client.field715 == 2 && var189 < client.field714) {
                                field390[var5++] = client.field716[var189].field362;
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var377 == 3602) {
                            var4--;
                            int var190 = field389[var4];
                            if (client.field715 == 2 && var190 < client.field714) {
                                field389[var4++] = client.field716[var190].field357;
                                continue;
                            }
                            field389[var4++] = 0;
                            continue;
                        }
                        if (var377 == 3603) {
                            var4--;
                            int var191 = field389[var4];
                            if (client.field715 == 2 && var191 < client.field714) {
                                field389[var4++] = client.field716[var191].field358;
                                continue;
                            }
                            field389[var4++] = 0;
                            continue;
                        }
                        if (var377 == 3604) {
                            var5--;
                            String var192 = field390[var5];
                            var4--;
                            int var193 = field389[var4];
                            client.method30(var192, var193);
                            continue;
                        }
                        if (var377 == 3605) {
                            var5--;
                            String var194 = field390[var5];
                            client.method153(var194);
                            continue;
                        }
                        if (var377 == 3606) {
                            var5--;
                            String var195 = field390[var5];
                            client.method137(var195);
                            continue;
                        }
                        if (var377 == 3607) {
                            var5--;
                            String var196 = field390[var5];
                            if (var196 == null) {
                                continue;
                            }
                            if (client.field712 >= 100) {
                                client.method2003(0, "", class134.field2237);
                                continue;
                            }
                            String var197 = class148.method808(var196, Statics.field464);
                            if (var197 == null) {
                                continue;
                            }
                            for (int var198 = 0; var198 < client.field712; var198++) {
                                class11 var199 = client.field719[var198];
                                String var200 = class148.method808(var199.field178, Statics.field464);
                                if (var200 != null && var200.equals(var197)) {
                                    client.method2003(0, "", var196 + class134.field2238);
                                    continue label2377;
                                }
                                if (var199.field177 != null) {
                                    String var201 = class148.method808(var199.field177, Statics.field464);
                                    if (var201 != null && var201.equals(var197)) {
                                        client.method2003(0, "", var196 + class134.field2238);
                                        continue label2377;
                                    }
                                }
                            }
                            for (int var202 = 0; var202 < client.field714; var202++) {
                                class23 var203 = client.field716[var202];
                                String var204 = class148.method808(var203.field362, Statics.field464);
                                if (var204 != null && var204.equals(var197)) {
                                    client.method2003(0, "", class134.field2297 + var196 + class134.field2244);
                                    continue label2377;
                                }
                                if (var203.field355 != null) {
                                    String var205 = class148.method808(var203.field355, Statics.field464);
                                    if (var205 != null && var205.equals(var197)) {
                                        client.method2003(0, "", class134.field2297 + var196 + class134.field2244);
                                        continue label2377;
                                    }
                                }
                            }
                            if (class148.method808(Statics.field2319.field52, Statics.field464).equals(var197)) {
                                client.method2003(0, "", class134.field2240);
                            } else {
                                client.field501.method2265(84);
                                class116 var206 = client.field501;
                                int var207 = var196.length() + 1;
                                var206.method2386(var207);
                                client.field501.method2574(var196);
                            }
                            continue;
                        }
                        if (var377 == 3608) {
                            var5--;
                            String var208 = field390[var5];
                            if (var208 == null) {
                                continue;
                            }
                            String var209 = class148.method808(var208, Statics.field464);
                            if (var209 == null) {
                                continue;
                            }
                            int var210 = 0;
                            while (true) {
                                if (var210 >= client.field712) {
                                    continue label2377;
                                }
                                class11 var211 = client.field719[var210];
                                String var212 = var211.field178;
                                String var213 = class148.method808(var212, Statics.field464);
                                if (class136.method216(var208, var209, var212, var213)) {
                                    client.field712--;
                                    for (int var214 = var210; var214 < client.field712; var214++) {
                                        client.field719[var214] = client.field719[var214 + 1];
                                    }
                                    client.field653 = client.field600;
                                    client.field501.method2265(112);
                                    class116 var215 = client.field501;
                                    int var216 = var208.length() + 1;
                                    var215.method2386(var216);
                                    client.field501.method2574(var208);
                                    continue label2377;
                                }
                                var210++;
                            }
                        }
                        if (var377 == 3609) {
                            var5--;
                            String var217 = field390[var5];
                            if (var217.startsWith(class2.method2083(0)) || var217.startsWith(class2.method2083(1))) {
                                var217 = var217.substring(7);
                            }
                            field389[var4++] = client.method2163(var217) ? 1 : 0;
                            continue;
                        }
                        if (var377 == 3611) {
                            if (client.field687 == null) {
                                field390[var5++] = "";
                            } else {
                                field390[var5++] = class146.method115(client.field687);
                            }
                            continue;
                        }
                        if (var377 == 3612) {
                            if (client.field687 == null) {
                                field389[var4++] = 0;
                            } else {
                                field389[var4++] = Statics.field189;
                            }
                            continue;
                        }
                        if (var377 == 3613) {
                            var4--;
                            int var218 = field389[var4];
                            if (client.field687 != null && var218 < Statics.field189) {
                                field390[var5++] = Statics.field192[var218].field119;
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var377 == 3614) {
                            var4--;
                            int var219 = field389[var4];
                            if (client.field687 != null && var219 < Statics.field189) {
                                field389[var4++] = Statics.field192[var219].field116;
                                continue;
                            }
                            field389[var4++] = 0;
                            continue;
                        }
                        if (var377 == 3615) {
                            var4--;
                            int var220 = field389[var4];
                            if (client.field687 != null && var220 < Statics.field189) {
                                field389[var4++] = Statics.field192[var220].field117;
                                continue;
                            }
                            field389[var4++] = 0;
                            continue;
                        }
                        if (var377 == 3616) {
                            field389[var4++] = Statics.field351;
                            continue;
                        }
                        if (var377 == 3617) {
                            var5--;
                            String var221 = field390[var5];
                            client.method1811(var221);
                            continue;
                        }
                        if (var377 == 3618) {
                            field389[var4++] = Statics.field19;
                            continue;
                        }
                        if (var377 == 3619) {
                            var5--;
                            String var222 = field390[var5];
                            if (!var222.equals("")) {
                                client.field501.method2265(218);
                                class116 var223 = client.field501;
                                int var224 = var222.length() + 1;
                                var223.method2386(var224);
                                client.field501.method2574(var222);
                            }
                            continue;
                        }
                        if (var377 == 3620) {
                            client.field501.method2265(218);
                            client.field501.method2386(0);
                            continue;
                        }
                        if (var377 == 3621) {
                            if (client.field715 == 0) {
                                field389[var4++] = -1;
                            } else {
                                field389[var4++] = client.field712;
                            }
                            continue;
                        }
                        if (var377 == 3622) {
                            var4--;
                            int var225 = field389[var4];
                            if (client.field715 != 0 && var225 < client.field712) {
                                field390[var5++] = client.field719[var225].field178;
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var377 == 3623) {
                            var5--;
                            String var226 = field390[var5];
                            if (var226.startsWith(class2.method2083(0)) || var226.startsWith(class2.method2083(1))) {
                                var226 = var226.substring(7);
                            }
                            field389[var4++] = client.method2262(var226) ? 1 : 0;
                            continue;
                        }
                        if (var377 == 3624) {
                            var4--;
                            int var227 = field389[var4];
                            if (Statics.field192 != null && var227 < Statics.field189 && Statics.field192[var227].field119.equalsIgnoreCase(Statics.field2319.field52)) {
                                field389[var4++] = 1;
                                continue;
                            }
                            field389[var4++] = 0;
                            continue;
                        }
                        if (var377 == 3625) {
                            if (client.field688 == null) {
                                field390[var5++] = "";
                            } else {
                                field390[var5++] = class146.method115(client.field688);
                            }
                            continue;
                        }
                    } else if (var377 < 4100) {
                        if (var377 == 4000) {
                            var4 -= 2;
                            int var228 = field389[var4];
                            int var229 = field389[var4 + 1];
                            field389[var4++] = var228 + var229;
                            continue;
                        }
                        if (var377 == 4001) {
                            var4 -= 2;
                            int var230 = field389[var4];
                            int var231 = field389[var4 + 1];
                            field389[var4++] = var230 - var231;
                            continue;
                        }
                        if (var377 == 4002) {
                            var4 -= 2;
                            int var232 = field389[var4];
                            int var233 = field389[var4 + 1];
                            field389[var4++] = var232 * var233;
                            continue;
                        }
                        if (var377 == 4003) {
                            var4 -= 2;
                            int var234 = field389[var4];
                            int var235 = field389[var4 + 1];
                            field389[var4++] = var234 / var235;
                            continue;
                        }
                        if (var377 == 4004) {
                            var4--;
                            int var236 = field389[var4];
                            field389[var4++] = (int) (Math.random() * (double) var236);
                            continue;
                        }
                        if (var377 == 4005) {
                            var4--;
                            int var237 = field389[var4];
                            field389[var4++] = (int) (Math.random() * (double) (var237 + 1));
                            continue;
                        }
                        if (var377 == 4006) {
                            var4 -= 5;
                            int var238 = field389[var4];
                            int var239 = field389[var4 + 1];
                            int var240 = field389[var4 + 2];
                            int var241 = field389[var4 + 3];
                            int var242 = field389[var4 + 4];
                            field389[var4++] = (var239 - var238) * (var242 - var240) / (var241 - var240) + var238;
                            continue;
                        }
                        if (var377 == 4007) {
                            var4 -= 2;
                            int var243 = field389[var4];
                            int var244 = field389[var4 + 1];
                            field389[var4++] = var243 * var244 / 100 + var243;
                            continue;
                        }
                        if (var377 == 4008) {
                            var4 -= 2;
                            int var245 = field389[var4];
                            int var246 = field389[var4 + 1];
                            field389[var4++] = var245 | 0x1 << var246;
                            continue;
                        }
                        if (var377 == 4009) {
                            var4 -= 2;
                            int var247 = field389[var4];
                            int var248 = field389[var4 + 1];
                            field389[var4++] = var247 & -1 - (0x1 << var248);
                            continue;
                        }
                        if (var377 == 4010) {
                            var4 -= 2;
                            int var249 = field389[var4];
                            int var250 = field389[var4 + 1];
                            field389[var4++] = (var249 & 0x1 << var250) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var377 == 4011) {
                            var4 -= 2;
                            int var251 = field389[var4];
                            int var252 = field389[var4 + 1];
                            field389[var4++] = var251 % var252;
                            continue;
                        }
                        if (var377 == 4012) {
                            var4 -= 2;
                            int var253 = field389[var4];
                            int var254 = field389[var4 + 1];
                            if (var253 == 0) {
                                field389[var4++] = 0;
                            } else {
                                field389[var4++] = (int) Math.pow((double) var253, (double) var254);
                            }
                            continue;
                        }
                        if (var377 == 4013) {
                            var4 -= 2;
                            int var255 = field389[var4];
                            int var256 = field389[var4 + 1];
                            if (var255 == 0) {
                                field389[var4++] = 0;
                            } else if (var256 == 0) {
                                field389[var4++] = Integer.MAX_VALUE;
                            } else {
                                field389[var4++] = (int) Math.pow((double) var255, 1.0D / (double) var256);
                            }
                            continue;
                        }
                        if (var377 == 4014) {
                            var4 -= 2;
                            int var257 = field389[var4];
                            int var258 = field389[var4 + 1];
                            field389[var4++] = var257 & var258;
                            continue;
                        }
                        if (var377 == 4015) {
                            var4 -= 2;
                            int var259 = field389[var4];
                            int var260 = field389[var4 + 1];
                            field389[var4++] = var259 | var260;
                            continue;
                        }
                    } else if (var377 < 4200) {
                        if (var377 == 4100) {
                            var5--;
                            String var261 = field390[var5];
                            var4--;
                            int var262 = field389[var4];
                            field390[var5++] = var261 + var262;
                            continue;
                        }
                        if (var377 == 4101) {
                            var5 -= 2;
                            String var263 = field390[var5];
                            String var264 = field390[var5 + 1];
                            field390[var5++] = var263 + var264;
                            continue;
                        }
                        if (var377 == 4102) {
                            var5--;
                            String var265 = field390[var5];
                            var4--;
                            int var266 = field389[var4];
                            String[] var267 = field390;
                            int var268 = var5++;
                            String var270;
                            if (var266 < 0) {
                                var270 = Integer.toString(var266);
                            } else {
                                var270 = class147.method2182(var266, 10, true);
                            }
                            var267[var268] = var265 + var270;
                            continue;
                        }
                        if (var377 == 4103) {
                            var5--;
                            String var271 = field390[var5];
                            field390[var5++] = var271.toLowerCase();
                            continue;
                        }
                        if (var377 == 4104) {
                            var4--;
                            int var272 = field389[var4];
                            long var273 = ((long) var272 + 11745L) * 86400000L;
                            field394.setTime(new Date(var273));
                            int var275 = field394.get(5);
                            int var276 = field394.get(2);
                            int var277 = field394.get(1);
                            field390[var5++] = var275 + "-" + field387[var276] + "-" + var277;
                            continue;
                        }
                        if (var377 == 4105) {
                            var5 -= 2;
                            String var278 = field390[var5];
                            String var279 = field390[var5 + 1];
                            if (Statics.field2319.field40 != null && Statics.field2319.field40.field2738) {
                                field390[var5++] = var279;
                                continue;
                            }
                            field390[var5++] = var278;
                            continue;
                        }
                        if (var377 == 4106) {
                            var4--;
                            int var280 = field389[var4];
                            field390[var5++] = Integer.toString(var280);
                            continue;
                        }
                        if (var377 == 4107) {
                            var5 -= 2;
                            field389[var4++] = class147.method245(class150.method202(field390[var5], field390[var5 + 1], client.field467));
                            continue;
                        }
                        if (var377 == 4108) {
                            var5--;
                            String var281 = field390[var5];
                            var4 -= 2;
                            int var282 = field389[var4];
                            int var283 = field389[var4 + 1];
                            byte[] var284 = Statics.field509.method2958(var283, 0);
                            class183 var285 = new class183(var284);
                            field389[var4++] = var285.method3346(var281, var282);
                            continue;
                        }
                        if (var377 == 4109) {
                            var5--;
                            String var286 = field390[var5];
                            var4 -= 2;
                            int var287 = field389[var4];
                            int var288 = field389[var4 + 1];
                            byte[] var289 = Statics.field509.method2958(var288, 0);
                            class183 var290 = new class183(var289);
                            field389[var4++] = var290.method3345(var286, var287);
                            continue;
                        }
                        if (var377 == 4110) {
                            var5 -= 2;
                            String var291 = field390[var5];
                            String var292 = field390[var5 + 1];
                            var4--;
                            if (field389[var4] == 1) {
                                field390[var5++] = var291;
                            } else {
                                field390[var5++] = var292;
                            }
                            continue;
                        }
                        if (var377 == 4111) {
                            var5--;
                            String var293 = field390[var5];
                            field390[var5++] = class185.method3363(var293);
                            continue;
                        }
                        if (var377 == 4112) {
                            var5--;
                            String var294 = field390[var5];
                            var4--;
                            int var295 = field389[var4];
                            field390[var5++] = var294 + (char) var295;
                            continue;
                        }
                        if (var377 == 4113) {
                            var4--;
                            int var296 = field389[var4];
                            int[] var297 = field389;
                            int var298 = var4++;
                            char var299 = (char) var296;
                            boolean var300;
                            if (var299 >= ' ' && var299 <= '~') {
                                var300 = true;
                            } else if (var299 >= 160 && var299 <= 255) {
                                var300 = true;
                            } else if (var299 == 8364 || var299 == 338 || var299 == 8212 || var299 == 339 || var299 == 376) {
                                var300 = true;
                            } else {
                                var300 = false;
                            }
                            var297[var298] = var300 ? 1 : 0;
                            continue;
                        }
                        if (var377 == 4114) {
                            var4--;
                            int var301 = field389[var4];
                            int[] var302 = field389;
                            int var303 = var4++;
                            char var304 = (char) var301;
                            boolean var305 = var304 >= '0' && var304 <= '9' || var304 >= 'A' && var304 <= 'Z' || var304 >= 'a' && var304 <= 'z';
                            var302[var303] = var305 ? 1 : 0;
                            continue;
                        }
                        if (var377 == 4115) {
                            var4--;
                            int var306 = field389[var4];
                            int[] var307 = field389;
                            int var308 = var4++;
                            char var309 = (char) var306;
                            boolean var310 = var309 >= 'A' && var309 <= 'Z' || var309 >= 'a' && var309 <= 'z';
                            var307[var308] = var310 ? 1 : 0;
                            continue;
                        }
                        if (var377 == 4116) {
                            var4--;
                            int var311 = field389[var4];
                            int[] var312 = field389;
                            int var313 = var4++;
                            char var314 = (char) var311;
                            boolean var315 = var314 >= '0' && var314 <= '9';
                            var312[var313] = var315 ? 1 : 0;
                            continue;
                        }
                        if (var377 == 4117) {
                            var5--;
                            String var316 = field390[var5];
                            if (var316 == null) {
                                field389[var4++] = 0;
                            } else {
                                field389[var4++] = var316.length();
                            }
                            continue;
                        }
                        if (var377 == 4118) {
                            var5--;
                            String var317 = field390[var5];
                            var4 -= 2;
                            int var318 = field389[var4];
                            int var319 = field389[var4 + 1];
                            field390[var5++] = var317.substring(var318, var319);
                            continue;
                        }
                        if (var377 == 4119) {
                            var5--;
                            String var320 = field390[var5];
                            StringBuilder var321 = new StringBuilder(var320.length());
                            boolean var322 = false;
                            for (int var323 = 0; var323 < var320.length(); var323++) {
                                char var324 = var320.charAt(var323);
                                if (var324 == '<') {
                                    var322 = true;
                                } else if (var324 == '>') {
                                    var322 = false;
                                } else if (!var322) {
                                    var321.append(var324);
                                }
                            }
                            field390[var5++] = var321.toString();
                            continue;
                        }
                        if (var377 == 4120) {
                            var5--;
                            String var325 = field390[var5];
                            var4--;
                            int var326 = field389[var4];
                            field389[var4++] = var325.indexOf(var326);
                            continue;
                        }
                    } else if (var377 < 4300) {
                        if (var377 == 4200) {
                            var4--;
                            int var327 = field389[var4];
                            field390[var5++] = class40.method211(var327).field984;
                            continue;
                        }
                        if (var377 == 4201) {
                            var4 -= 2;
                            int var328 = field389[var4];
                            int var329 = field389[var4 + 1];
                            class40 var330 = class40.method211(var328);
                            if (var329 >= 1 && var329 <= 5 && var330.field1020[var329 - 1] != null) {
                                field390[var5++] = var330.field1020[var329 - 1];
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var377 == 4202) {
                            var4 -= 2;
                            int var331 = field389[var4];
                            int var332 = field389[var4 + 1];
                            class40 var333 = class40.method211(var331);
                            if (var332 >= 1 && var332 <= 5 && var333.field998[var332 - 1] != null) {
                                field390[var5++] = var333.field998[var332 - 1];
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var377 == 4203) {
                            var4--;
                            int var334 = field389[var4];
                            field389[var4++] = class40.method211(var334).field996;
                            continue;
                        }
                        if (var377 == 4204) {
                            var4--;
                            int var335 = field389[var4];
                            field389[var4++] = class40.method211(var335).field982 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var377 == 4205) {
                            var4--;
                            int var336 = field389[var4];
                            class40 var337 = class40.method211(var336);
                            if (var337.field994 == -1 && var337.field1024 >= 0) {
                                field389[var4++] = var337.field1024;
                                continue;
                            }
                            field389[var4++] = var336;
                            continue;
                        }
                        if (var377 == 4206) {
                            var4--;
                            int var338 = field389[var4];
                            class40 var339 = class40.method211(var338);
                            if (var339.field994 >= 0 && var339.field1024 >= 0) {
                                field389[var4++] = var339.field1024;
                                continue;
                            }
                            field389[var4++] = var338;
                            continue;
                        }
                        if (var377 == 4207) {
                            var4--;
                            int var340 = field389[var4];
                            field389[var4++] = class40.method211(var340).field997 ? 1 : 0;
                            continue;
                        }
                    } else if (var377 < 5100) {
                        if (var377 == 5000) {
                            field389[var4++] = client.field679;
                            continue;
                        }
                        if (var377 == 5001) {
                            var4 -= 3;
                            client.field679 = field389[var4];
                            Statics.field2331 = class137.method105(field389[var4 + 1]);
                            if (Statics.field2331 == null) {
                                Statics.field2331 = class137.field2335;
                            }
                            client.field680 = field389[var4 + 2];
                            client.field501.method2265(57);
                            client.field501.method2386(client.field679);
                            client.field501.method2386(Statics.field2331.field2332);
                            client.field501.method2386(client.field680);
                            continue;
                        }
                        if (var377 == 5002) {
                            var5--;
                            String var341 = field390[var5];
                            var4 -= 2;
                            int var342 = field389[var4];
                            int var343 = field389[var4 + 1];
                            client.field501.method2265(83);
                            class116 var344 = client.field501;
                            int var345 = var341.length() + 1;
                            var344.method2386(var345 + 2);
                            client.field501.method2574(var341);
                            client.field501.method2386(var342 - 1);
                            client.field501.method2386(var343);
                            continue;
                        }
                        if (var377 == 5003) {
                            var4--;
                            int var346 = field389[var4];
                            String var347 = null;
                            if (var346 < 100) {
                                var347 = client.field645[var346];
                            }
                            if (var347 == null) {
                                var347 = "";
                            }
                            field390[var5++] = var347;
                            continue;
                        }
                        if (var377 == 5004) {
                            var4--;
                            int var348 = field389[var4];
                            int var349 = -1;
                            if (var348 < 100 && client.field645[var348] != null) {
                                var349 = client.field673[var348];
                            }
                            field389[var4++] = var349;
                            continue;
                        }
                        if (var377 == 5005) {
                            if (Statics.field2331 == null) {
                                field389[var4++] = -1;
                            } else {
                                field389[var4++] = Statics.field2331.field2332;
                            }
                            continue;
                        }
                        if (var377 == 5008) {
                            var5--;
                            String var350 = field390[var5];
                            if (var350.startsWith("::")) {
                                if (var350.equalsIgnoreCase("::toggleroof")) {
                                    Statics.field97.field185 = !Statics.field97.field185;
                                    class12.method652();
                                    if (Statics.field97.field185) {
                                        client.method2003(0, "", "Roofs are now all hidden");
                                    } else {
                                        client.method2003(0, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field629 >= 2) {
                                    if (var350.equalsIgnoreCase("::gc")) {
                                        System.gc();
                                    }
                                    if (var350.equalsIgnoreCase("::clientdrop")) {
                                        client.method3116();
                                    }
                                    if (var350.equalsIgnoreCase("::fpson")) {
                                        client.field478 = true;
                                    }
                                    if (var350.equalsIgnoreCase("::fpsoff")) {
                                        client.field478 = false;
                                    }
                                    if (var350.equalsIgnoreCase("::noclip")) {
                                        for (int var351 = 0; var351 < 4; var351++) {
                                            for (int var352 = 1; var352 < 103; var352++) {
                                                for (int var353 = 1; var353 < 103; var353++) {
                                                    client.field477[var351].field2762[var352][var353] = 0;
                                                }
                                            }
                                        }
                                    }
                                    if (var350.equalsIgnoreCase("::errortest") && client.field462 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field501.method2265(209);
                                client.field501.method2386(var350.length() - 1);
                                client.field501.method2574(var350.substring(2));
                                continue;
                            }
                            String var354 = var350.toLowerCase();
                            byte var355 = 0;
                            if (var354.startsWith(class134.field2245)) {
                                var355 = 0;
                                var350 = var350.substring(class134.field2245.length());
                            } else if (var354.startsWith(class134.field2095)) {
                                var355 = 1;
                                var350 = var350.substring(class134.field2095.length());
                            } else if (var354.startsWith(class134.field2225)) {
                                var355 = 2;
                                var350 = var350.substring(class134.field2225.length());
                            } else if (var354.startsWith(class134.field2191)) {
                                var355 = 3;
                                var350 = var350.substring(class134.field2191.length());
                            } else if (var354.startsWith(class134.field2253)) {
                                var355 = 4;
                                var350 = var350.substring(class134.field2253.length());
                            } else if (var354.startsWith(class134.field2255)) {
                                var355 = 5;
                                var350 = var350.substring(class134.field2255.length());
                            } else if (var354.startsWith(class134.field2204)) {
                                var355 = 6;
                                var350 = var350.substring(class134.field2204.length());
                            } else if (var354.startsWith(class134.field2259)) {
                                var355 = 7;
                                var350 = var350.substring(class134.field2259.length());
                            } else if (var354.startsWith(class134.field2261)) {
                                var355 = 8;
                                var350 = var350.substring(class134.field2261.length());
                            } else if (var354.startsWith(class134.field2263)) {
                                var355 = 9;
                                var350 = var350.substring(class134.field2263.length());
                            } else if (var354.startsWith(class134.field2265)) {
                                var355 = 10;
                                var350 = var350.substring(class134.field2265.length());
                            } else if (var354.startsWith(class134.field2267)) {
                                var355 = 11;
                                var350 = var350.substring(class134.field2267.length());
                            } else if (client.field467 != 0) {
                                if (var354.startsWith(class134.field2246)) {
                                    var355 = 0;
                                    var350 = var350.substring(class134.field2246.length());
                                } else if (var354.startsWith(class134.field2248)) {
                                    var355 = 1;
                                    var350 = var350.substring(class134.field2248.length());
                                } else if (var354.startsWith(class134.field2250)) {
                                    var355 = 2;
                                    var350 = var350.substring(class134.field2250.length());
                                } else if (var354.startsWith(class134.field2252)) {
                                    var355 = 3;
                                    var350 = var350.substring(class134.field2252.length());
                                } else if (var354.startsWith(class134.field2254)) {
                                    var355 = 4;
                                    var350 = var350.substring(class134.field2254.length());
                                } else if (var354.startsWith(class134.field2256)) {
                                    var355 = 5;
                                    var350 = var350.substring(class134.field2256.length());
                                } else if (var354.startsWith(class134.field2258)) {
                                    var355 = 6;
                                    var350 = var350.substring(class134.field2258.length());
                                } else if (var354.startsWith(class134.field2172)) {
                                    var355 = 7;
                                    var350 = var350.substring(class134.field2172.length());
                                } else if (var354.startsWith(class134.field2262)) {
                                    var355 = 8;
                                    var350 = var350.substring(class134.field2262.length());
                                } else if (var354.startsWith(class134.field2185)) {
                                    var355 = 9;
                                    var350 = var350.substring(class134.field2185.length());
                                } else if (var354.startsWith(class134.field2118)) {
                                    var355 = 10;
                                    var350 = var350.substring(class134.field2118.length());
                                } else if (var354.startsWith(class134.field2078)) {
                                    var355 = 11;
                                    var350 = var350.substring(class134.field2078.length());
                                }
                            }
                            String var356 = var350.toLowerCase();
                            byte var357 = 0;
                            if (var356.startsWith(class134.field2084)) {
                                var357 = 1;
                                var350 = var350.substring(class134.field2084.length());
                            } else if (var356.startsWith(class134.field2162)) {
                                var357 = 2;
                                var350 = var350.substring(class134.field2162.length());
                            } else if (var356.startsWith(class134.field2273)) {
                                var357 = 3;
                                var350 = var350.substring(class134.field2273.length());
                            } else if (var356.startsWith(class134.field2264)) {
                                var357 = 4;
                                var350 = var350.substring(class134.field2264.length());
                            } else if (var356.startsWith(class134.field2277)) {
                                var357 = 5;
                                var350 = var350.substring(class134.field2277.length());
                            } else if (client.field467 != 0) {
                                if (var356.startsWith(class134.field2152)) {
                                    var357 = 1;
                                    var350 = var350.substring(class134.field2152.length());
                                } else if (var356.startsWith(class134.field2164)) {
                                    var357 = 2;
                                    var350 = var350.substring(class134.field2164.length());
                                } else if (var356.startsWith(class134.field2159)) {
                                    var357 = 3;
                                    var350 = var350.substring(class134.field2159.length());
                                } else if (var356.startsWith(class134.field2276)) {
                                    var357 = 4;
                                    var350 = var350.substring(class134.field2276.length());
                                } else if (var356.startsWith(class134.field2278)) {
                                    var357 = 5;
                                    var350 = var350.substring(class134.field2278.length());
                                }
                            }
                            client.field501.method2265(19);
                            client.field501.method2386(0);
                            int var358 = client.field501.field2042;
                            client.field501.method2386(var355);
                            client.field501.method2386(var357);
                            class116 var359 = client.field501;
                            int var360 = var359.field2042;
                            byte[] var361 = Statics.method524(var350);
                            var359.method2421(var361.length);
                            var359.field2042 += Statics.field2832.method2317(var361, 0, var361.length, var359.field2035, var359.field2042);
                            client.field501.method2397(client.field501.field2042 - var358);
                            continue;
                        }
                        if (var377 == 5009) {
                            var5 -= 2;
                            String var362 = field390[var5];
                            String var363 = field390[var5 + 1];
                            client.field501.method2265(251);
                            client.field501.method2387(0);
                            int var364 = client.field501.field2042;
                            client.field501.method2574(var362);
                            class116 var365 = client.field501;
                            int var366 = var365.field2042;
                            byte[] var367 = Statics.method524(var363);
                            var365.method2421(var367.length);
                            var365.field2042 += Statics.field2832.method2317(var367, 0, var367.length, var365.field2035, var365.field2042);
                            client.field501.method2396(client.field501.field2042 - var364);
                            continue;
                        }
                        if (var377 == 5010) {
                            var4--;
                            int var368 = field389[var4];
                            String var369 = null;
                            if (var368 < 100) {
                                var369 = client.field685[var368];
                            }
                            if (var369 == null) {
                                var369 = "";
                            }
                            field390[var5++] = var369;
                            continue;
                        }
                        if (var377 == 5011) {
                            var4--;
                            int var370 = field389[var4];
                            String var371 = null;
                            if (var370 < 100) {
                                var371 = client.field542[var370];
                            }
                            if (var371 == null) {
                                var371 = "";
                            }
                            field390[var5++] = var371;
                            continue;
                        }
                        if (var377 == 5015) {
                            String var372;
                            if (Statics.field2319 == null || Statics.field2319.field52 == null) {
                                var372 = "";
                            } else {
                                var372 = Statics.field2319.field52;
                            }
                            field390[var5++] = var372;
                            continue;
                        }
                        if (var377 == 5016) {
                            field389[var4++] = client.field680;
                            continue;
                        }
                        if (var377 == 5017) {
                            field389[var4++] = client.field691;
                            continue;
                        }
                    }
                } else {
                    class158 var80;
                    if (var377 >= 2000) {
                        var377 -= 1000;
                        var4--;
                        var80 = class158.method3027(field389[var4]);
                    } else {
                        var80 = var57 ? Statics.field31 : Statics.field395;
                    }
                    if (var377 == 1300) {
                        var4--;
                        int var81 = field389[var4] - 1;
                        if (var81 >= 0 && var81 <= 9) {
                            var5--;
                            var80.method3072(var81, field390[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var377 == 1301) {
                        var4 -= 2;
                        int var82 = field389[var4];
                        int var83 = field389[var4 + 1];
                        var80.field2657 = class158.method2990(var82, var83);
                        continue;
                    }
                    if (var377 == 1302) {
                        var4--;
                        var80.field2604 = field389[var4] == 1;
                        continue;
                    }
                    if (var377 == 1303) {
                        var4--;
                        var80.field2646 = field389[var4];
                        continue;
                    }
                    if (var377 == 1304) {
                        var4--;
                        var80.field2659 = field389[var4];
                        continue;
                    }
                    if (var377 == 1305) {
                        var5--;
                        var80.field2655 = field390[var5];
                        continue;
                    }
                    if (var377 == 1306) {
                        var5--;
                        var80.field2661 = field390[var5];
                        continue;
                    }
                    if (var377 == 1307) {
                        var80.field2656 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var376) {
            StringBuilder var374 = new StringBuilder(30);
            var374.append("").append(var3.field2818).append(" ");
            for (int var375 = field391 - 1; var375 >= 0; var375--) {
                var374.append("").append(field392[var375].field260.field2818).append(" ");
            }
            var374.append("").append(var9);
            class80.method2305(var374.toString(), var376);
        }
    }

    @ObfuscatedName("az.g(II)V")
    public static void method809(int arg0) {
        if (arg0 == -1 || !class158.method2630(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2626[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3.field2694 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field8 = var3.field2694;
                method1254(var4);
            }
        }
    }
}
