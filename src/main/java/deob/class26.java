package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("y")
public class class26 {

    @ObfuscatedName("y.h")
    public static int[] field392 = new int[5];

    @ObfuscatedName("y.u")
    public static int[][] field393 = new int[5][5000];

    @ObfuscatedName("y.a")
    public static int[] field403 = new int[1000];

    @ObfuscatedName("y.q")
    public static String[] field390 = new String[1000];

    @ObfuscatedName("y.t")
    public static int field396 = 0;

    @ObfuscatedName("y.n")
    public static class18[] field397 = new class18[50];

    @ObfuscatedName("y.b")
    public static Calendar field399 = Calendar.getInstance();

    @ObfuscatedName("y.m")
    public static final String[] field410 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.j(Lj;I)V")
    public static void method1675(class1 arg0) {
        Object[] var1 = arg0.field10;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method156(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field76;
        int[] var8 = var3.field66;
        byte var9 = -1;
        field396 = 0;
        try {
            Statics.field402 = new int[var3.field72];
            int var10 = 0;
            Statics.field391 = new String[var3.field68];
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
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2619;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2598;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field14 == null ? -1 : arg0.field14.field2619;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field14 == null ? -1 : arg0.field14.field2598;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field1;
                    }
                    Statics.field402[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field8;
                    }
                    Statics.field391[var11++] = var14;
                }
            }
            int var15 = 0;
            label2420: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var380 = var7[var6];
                if (var380 < 100) {
                    if (var380 == 0) {
                        field403[var4++] = var8[var6];
                        continue;
                    }
                    if (var380 == 1) {
                        int var16 = var8[var6];
                        field403[var4++] = class160.field2716[var16];
                        continue;
                    }
                    if (var380 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class160.field2716[var17] = field403[var4];
                        client.method1889(var17);
                        continue;
                    }
                    if (var380 == 3) {
                        field390[var5++] = var3.field67[var6];
                        continue;
                    }
                    if (var380 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var380 == 7) {
                        var4 -= 2;
                        if (field403[var4 + 1] != field403[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var380 == 8) {
                        var4 -= 2;
                        if (field403[var4 + 1] == field403[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var380 == 9) {
                        var4 -= 2;
                        if (field403[var4] < field403[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var380 == 10) {
                        var4 -= 2;
                        if (field403[var4] > field403[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var380 == 21) {
                        if (field396 == 0) {
                            return;
                        }
                        class18 var18 = field397[--field396];
                        var3 = var18.field273;
                        var7 = var3.field76;
                        var8 = var3.field66;
                        var6 = var18.field269;
                        Statics.field402 = var18.field270;
                        Statics.field391 = var18.field271;
                        continue;
                    }
                    if (var380 == 25) {
                        int var19 = var8[var6];
                        field403[var4++] = class160.method1486(var19);
                        continue;
                    }
                    if (var380 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field403[var4];
                        class38 var22 = (class38) class38.field960.method3256((long) var20);
                        class38 var23;
                        if (var22 == null) {
                            byte[] var24 = Statics.field2026.method3027(14, var20);
                            class38 var25 = new class38();
                            if (var24 != null) {
                                var25.method818(new class127(var24));
                            }
                            class38.field960.method3257(var25, (long) var20);
                            var23 = var25;
                        } else {
                            var23 = var22;
                        }
                        int var27 = var23.field961;
                        int var28 = var23.field953;
                        int var29 = var23.field954;
                        int var30 = class160.field2718[var29 - var28];
                        if (var21 < 0 || var21 > var30) {
                            var21 = 0;
                        }
                        int var31 = var30 << var28;
                        class160.field2716[var27] = class160.field2716[var27] & ~var31 | var21 << var28 & var31;
                        continue;
                    }
                    if (var380 == 31) {
                        var4 -= 2;
                        if (field403[var4] <= field403[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var380 == 32) {
                        var4 -= 2;
                        if (field403[var4] >= field403[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var380 == 33) {
                        field403[var4++] = Statics.field402[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var380 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field402[var10001] = field403[var4];
                        continue;
                    }
                    if (var380 == 35) {
                        field390[var5++] = Statics.field391[var8[var6]];
                        continue;
                    }
                    if (var380 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field391[var10001] = field390[var5];
                        continue;
                    }
                    if (var380 == 37) {
                        int var32 = var8[var6];
                        var5 -= var32;
                        String var33 = class148.method1879(field390, var5, var32);
                        field390[var5++] = var33;
                        continue;
                    }
                    if (var380 == 38) {
                        var4--;
                        continue;
                    }
                    if (var380 == 39) {
                        var5--;
                        continue;
                    }
                    if (var380 == 40) {
                        int var34 = var8[var6];
                        class5 var35 = class5.method156(var34);
                        int[] var36 = new int[var35.field72];
                        String[] var37 = new String[var35.field68];
                        for (int var38 = 0; var38 < var35.field70; var38++) {
                            var36[var38] = field403[var4 - var35.field70 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field71; var39++) {
                            var37[var39] = field390[var5 - var35.field71 + var39];
                        }
                        var4 -= var35.field70;
                        var5 -= var35.field71;
                        class18 var40 = new class18();
                        var40.field273 = var3;
                        var40.field269 = var6;
                        var40.field270 = Statics.field402;
                        var40.field271 = Statics.field391;
                        field397[++field396 - 1] = var40;
                        var3 = var35;
                        var7 = var35.field76;
                        var8 = var35.field66;
                        var6 = -1;
                        Statics.field402 = var36;
                        Statics.field391 = var37;
                        continue;
                    }
                    if (var380 == 42) {
                        field403[var4++] = client.field667[var8[var6]];
                        continue;
                    }
                    if (var380 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field667[var10001] = field403[var4];
                        continue;
                    }
                    if (var380 == 44) {
                        int var41 = var8[var6] >> 16;
                        int var42 = var8[var6] & 0xFFFF;
                        var4--;
                        int var43 = field403[var4];
                        if (var43 >= 0 && var43 <= 5000) {
                            field392[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2420;
                                }
                                field393[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var380 == 45) {
                        int var46 = var8[var6];
                        var4--;
                        int var47 = field403[var4];
                        if (var47 >= 0 && var47 < field392[var46]) {
                            field403[var4++] = field393[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var380 == 46) {
                        int var48 = var8[var6];
                        var4 -= 2;
                        int var49 = field403[var4];
                        if (var49 >= 0 && var49 < field392[var48]) {
                            field393[var48][var49] = field403[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var380 == 47) {
                        String var50 = client.field724[var8[var6]];
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field390[var5++] = var50;
                        continue;
                    }
                    if (var380 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field724[var10001] = field390[var5];
                        continue;
                    }
                }
                boolean var51;
                if (var8[var6] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var380 < 1000) {
                    if (var380 == 100) {
                        var4 -= 3;
                        int var52 = field403[var4];
                        int var53 = field403[var4 + 1];
                        int var54 = field403[var4 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class159 var55 = Statics.method2760(var52);
                        if (var55.field2696 == null) {
                            var55.field2696 = new class159[var54 + 1];
                        }
                        if (var55.field2696.length <= var54) {
                            class159[] var56 = new class159[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2696.length; var57++) {
                                var56[var57] = var55.field2696[var57];
                            }
                            var55.field2696 = var56;
                        }
                        if (var54 > 0 && var55.field2696[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class159 var58 = new class159();
                        var58.field2599 = var53;
                        var58.field2608 = var58.field2619 = var55.field2619;
                        var58.field2598 = var54;
                        var58.field2596 = true;
                        var55.field2696[var54] = var58;
                        if (var51) {
                            Statics.field398 = var58;
                        } else {
                            Statics.field264 = var58;
                        }
                        client.method148(var55);
                        continue;
                    }
                    if (var380 == 101) {
                        class159 var59 = var51 ? Statics.field398 : Statics.field264;
                        class159 var60 = Statics.method2760(var59.field2619);
                        var60.field2696[var59.field2598] = null;
                        client.method148(var60);
                        continue;
                    }
                    if (var380 == 102) {
                        var4--;
                        class159 var61 = Statics.method2760(field403[var4]);
                        var61.field2696 = null;
                        client.method148(var61);
                        continue;
                    }
                    if (var380 == 200) {
                        var4 -= 2;
                        int var62 = field403[var4];
                        int var63 = field403[var4 + 1];
                        class159 var64 = class159.method1285(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field403[var4++] = 1;
                            if (var51) {
                                Statics.field398 = var64;
                            } else {
                                Statics.field264 = var64;
                            }
                            continue;
                        }
                        field403[var4++] = 0;
                        continue;
                    }
                } else if (var380 >= 1000 && var380 < 1100 || var380 >= 2000 && var380 < 2100) {
                    class159 var65;
                    if (var380 >= 2000) {
                        var380 -= 1000;
                        var4--;
                        var65 = Statics.method2760(field403[var4]);
                    } else {
                        var65 = var51 ? Statics.field398 : Statics.field264;
                    }
                    if (var380 == 1000) {
                        var4 -= 2;
                        var65.field2593 = field403[var4];
                        var65.field2603 = field403[var4 + 1];
                        client.method148(var65);
                        continue;
                    }
                    if (var380 == 1001) {
                        var4 -= 2;
                        var65.field2707 = field403[var4];
                        var65.field2705 = field403[var4 + 1];
                        client.method148(var65);
                        continue;
                    }
                    if (var380 == 1003) {
                        var4--;
                        boolean var66 = field403[var4] == 1;
                        if (var65.field2660 != var66) {
                            var65.field2660 = var66;
                            client.method148(var65);
                        }
                        continue;
                    }
                } else if (!(var380 < 1100 || var380 >= 1200) || !(var380 < 2100 || var380 >= 2200)) {
                    class159 var67;
                    if (var380 >= 2000) {
                        var380 -= 1000;
                        var4--;
                        var67 = Statics.method2760(field403[var4]);
                    } else {
                        var67 = var51 ? Statics.field398 : Statics.field264;
                    }
                    if (var380 == 1100) {
                        var4 -= 2;
                        var67.field2610 = field403[var4];
                        if (var67.field2610 > var67.field2601 - var67.field2707) {
                            var67.field2610 = var67.field2601 - var67.field2707;
                        }
                        if (var67.field2610 < 0) {
                            var67.field2610 = 0;
                        }
                        var67.field2597 = field403[var4 + 1];
                        if (var67.field2597 > var67.field2669 - var67.field2705) {
                            var67.field2597 = var67.field2669 - var67.field2705;
                        }
                        if (var67.field2597 < 0) {
                            var67.field2597 = 0;
                        }
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1101) {
                        var4--;
                        var67.field2614 = field403[var4];
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1102) {
                        var4--;
                        var67.field2711 = field403[var4] == 1;
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1103) {
                        var4--;
                        var67.field2618 = field403[var4];
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1104) {
                        var4--;
                        var67.field2620 = field403[var4];
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1105) {
                        var4--;
                        var67.field2621 = field403[var4];
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1106) {
                        var4--;
                        var67.field2623 = field403[var4];
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1107) {
                        var4--;
                        var67.field2624 = field403[var4] == 1;
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1108) {
                        var67.field2679 = 1;
                        var4--;
                        var67.field2587 = field403[var4];
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1109) {
                        var4 -= 6;
                        var67.field2635 = field403[var4];
                        var67.field2708 = field403[var4 + 1];
                        var67.field2637 = field403[var4 + 2];
                        var67.field2638 = field403[var4 + 3];
                        var67.field2629 = field403[var4 + 4];
                        var67.field2611 = field403[var4 + 5];
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1110) {
                        var4--;
                        int var68 = field403[var4];
                        if (var67.field2633 != var68) {
                            var67.field2633 = var68;
                            var67.field2703 = 0;
                            var67.field2704 = 0;
                            client.method148(var67);
                        }
                        continue;
                    }
                    if (var380 == 1111) {
                        var4--;
                        var67.field2642 = field403[var4] == 1;
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1112) {
                        var5--;
                        String var69 = field390[var5];
                        if (!var69.equals(var67.field2644)) {
                            var67.field2644 = var69;
                            client.method148(var67);
                        }
                        continue;
                    }
                    if (var380 == 1113) {
                        var4--;
                        var67.field2643 = field403[var4];
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1114) {
                        var4 -= 3;
                        var67.field2647 = field403[var4];
                        var67.field2606 = field403[var4 + 1];
                        var67.field2646 = field403[var4 + 2];
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1115) {
                        var4--;
                        var67.field2686 = field403[var4] == 1;
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1116) {
                        var4--;
                        var67.field2625 = field403[var4];
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1117) {
                        var4--;
                        var67.field2588 = field403[var4];
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1118) {
                        var4--;
                        var67.field2627 = field403[var4] == 1;
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1119) {
                        var4--;
                        var67.field2628 = field403[var4] == 1;
                        client.method148(var67);
                        continue;
                    }
                    if (var380 == 1120) {
                        var4 -= 2;
                        var67.field2601 = field403[var4];
                        var67.field2669 = field403[var4 + 1];
                        client.method148(var67);
                        continue;
                    }
                } else if (!(var380 < 1200 || var380 >= 1300) || !(var380 < 2200 || var380 >= 2300)) {
                    class159 var70;
                    if (var380 >= 2000) {
                        var380 -= 1000;
                        var4--;
                        var70 = Statics.method2760(field403[var4]);
                    } else {
                        var70 = var51 ? Statics.field398 : Statics.field264;
                    }
                    client.method148(var70);
                    if (var380 == 1200) {
                        var4 -= 2;
                        int var71 = field403[var4];
                        int var72 = field403[var4 + 1];
                        var70.field2701 = var71;
                        var70.field2702 = var72;
                        class40 var73 = class40.method712(var71);
                        var70.field2637 = var73.field989;
                        var70.field2638 = var73.field990;
                        var70.field2629 = var73.field979;
                        var70.field2635 = var73.field992;
                        var70.field2708 = var73.field993;
                        var70.field2611 = var73.field974;
                        if (var70.field2707 > 0) {
                            var70.field2611 = var70.field2611 * 32 / var70.field2707;
                        }
                        continue;
                    }
                    if (var380 == 1201) {
                        var70.field2679 = 2;
                        var4--;
                        var70.field2587 = field403[var4];
                        continue;
                    }
                    if (var380 == 1202) {
                        var70.field2679 = 3;
                        var70.field2587 = Statics.field428.field43.method3226();
                        continue;
                    }
                } else if (var380 >= 1300 && var380 < 1400 || var380 >= 2300 && var380 < 2400) {
                    class159 var74;
                    if (var380 >= 2000) {
                        var380 -= 1000;
                        var4--;
                        var74 = Statics.method2760(field403[var4]);
                    } else {
                        var74 = var51 ? Statics.field398 : Statics.field264;
                    }
                    if (var380 == 1300) {
                        var4--;
                        int var75 = field403[var4] - 1;
                        if (var75 >= 0 && var75 <= 9) {
                            var5--;
                            var74.method3183(var75, field390[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var380 == 1301) {
                        var4 -= 2;
                        int var76 = field403[var4];
                        int var77 = field403[var4 + 1];
                        var74.field2659 = class159.method1285(var76, var77);
                        continue;
                    }
                    if (var380 == 1302) {
                        var4--;
                        var74.field2662 = field403[var4] == 1;
                        continue;
                    }
                    if (var380 == 1303) {
                        var4--;
                        var74.field2648 = field403[var4];
                        continue;
                    }
                    if (var380 == 1304) {
                        var4--;
                        var74.field2661 = field403[var4];
                        continue;
                    }
                    if (var380 == 1305) {
                        var5--;
                        var74.field2657 = field390[var5];
                        continue;
                    }
                    if (var380 == 1306) {
                        var5--;
                        var74.field2663 = field390[var5];
                        continue;
                    }
                    if (var380 == 1307) {
                        var74.field2632 = null;
                        continue;
                    }
                } else {
                    if (var380 >= 1400 && var380 < 1500 || var380 >= 2400 && var380 < 2500) {
                        class159 var78;
                        if (var380 >= 2000) {
                            var380 -= 1000;
                            var4--;
                            var78 = Statics.method2760(field403[var4]);
                        } else {
                            var78 = var51 ? Statics.field398 : Statics.field264;
                        }
                        var5--;
                        String var79 = field390[var5];
                        int[] var80 = null;
                        if (var79.length() > 0 && var79.charAt(var79.length() - 1) == 'Y') {
                            var4--;
                            int var81 = field403[var4];
                            if (var81 > 0) {
                                var80 = new int[var81];
                                while (var81-- > 0) {
                                    var4--;
                                    var80[var81] = field403[var4];
                                }
                            }
                            var79 = var79.substring(0, var79.length() - 1);
                        }
                        Object[] var82 = new Object[var79.length() + 1];
                        for (int var83 = var82.length - 1; var83 >= 1; var83--) {
                            if (var79.charAt(var83 - 1) == 's') {
                                var5--;
                                var82[var83] = field390[var5];
                            } else {
                                var4--;
                                var82[var83] = Integer.valueOf(field403[var4]);
                            }
                        }
                        var4--;
                        int var84 = field403[var4];
                        if (var84 == -1) {
                            var82 = null;
                        } else {
                            var82[0] = Integer.valueOf(var84);
                        }
                        if (var380 == 1400) {
                            var78.field2666 = var82;
                        }
                        if (var380 == 1401) {
                            var78.field2677 = var82;
                        }
                        if (var380 == 1402) {
                            var78.field2668 = var82;
                        }
                        if (var380 == 1403) {
                            var78.field2670 = var82;
                        }
                        if (var380 == 1404) {
                            var78.field2672 = var82;
                        }
                        if (var380 == 1405) {
                            var78.field2673 = var82;
                        }
                        if (var380 == 1406) {
                            var78.field2609 = var82;
                        }
                        if (var380 == 1407) {
                            var78.field2710 = var82;
                            var78.field2678 = var80;
                        }
                        if (var380 == 1408) {
                            var78.field2591 = var82;
                        }
                        if (var380 == 1409) {
                            var78.field2684 = var82;
                        }
                        if (var380 == 1410) {
                            var78.field2674 = var82;
                        }
                        if (var380 == 1411) {
                            var78.field2693 = var82;
                        }
                        if (var380 == 1412) {
                            var78.field2671 = var82;
                        }
                        if (var380 == 1414) {
                            var78.field2604 = var82;
                            var78.field2595 = var80;
                        }
                        if (var380 == 1415) {
                            var78.field2681 = var82;
                            var78.field2682 = var80;
                        }
                        if (var380 == 1416) {
                            var78.field2675 = var82;
                        }
                        if (var380 == 1417) {
                            var78.field2685 = var82;
                        }
                        if (var380 == 1418) {
                            var78.field2613 = var82;
                        }
                        if (var380 == 1419) {
                            var78.field2687 = var82;
                        }
                        if (var380 == 1420) {
                            var78.field2650 = var82;
                        }
                        if (var380 == 1421) {
                            var78.field2689 = var82;
                        }
                        if (var380 == 1422) {
                            var78.field2690 = var82;
                        }
                        if (var380 == 1423) {
                            var78.field2691 = var82;
                        }
                        if (var380 == 1424) {
                            var78.field2692 = var82;
                        }
                        var78.field2664 = true;
                        continue;
                    }
                    if (var380 < 1600) {
                        class159 var85 = var51 ? Statics.field398 : Statics.field264;
                        if (var380 == 1500) {
                            field403[var4++] = var85.field2593;
                            continue;
                        }
                        if (var380 == 1501) {
                            field403[var4++] = var85.field2603;
                            continue;
                        }
                        if (var380 == 1502) {
                            field403[var4++] = var85.field2707;
                            continue;
                        }
                        if (var380 == 1503) {
                            field403[var4++] = var85.field2705;
                            continue;
                        }
                        if (var380 == 1504) {
                            field403[var4++] = var85.field2660 ? 1 : 0;
                            continue;
                        }
                        if (var380 == 1505) {
                            field403[var4++] = var85.field2608;
                            continue;
                        }
                    } else if (var380 < 1700) {
                        class159 var86 = var51 ? Statics.field398 : Statics.field264;
                        if (var380 == 1600) {
                            field403[var4++] = var86.field2610;
                            continue;
                        }
                        if (var380 == 1601) {
                            field403[var4++] = var86.field2597;
                            continue;
                        }
                        if (var380 == 1602) {
                            field390[var5++] = var86.field2644;
                            continue;
                        }
                        if (var380 == 1603) {
                            field403[var4++] = var86.field2601;
                            continue;
                        }
                        if (var380 == 1604) {
                            field403[var4++] = var86.field2669;
                            continue;
                        }
                        if (var380 == 1605) {
                            field403[var4++] = var86.field2611;
                            continue;
                        }
                        if (var380 == 1606) {
                            field403[var4++] = var86.field2637;
                            continue;
                        }
                        if (var380 == 1607) {
                            field403[var4++] = var86.field2629;
                            continue;
                        }
                        if (var380 == 1608) {
                            field403[var4++] = var86.field2638;
                            continue;
                        }
                    } else if (var380 < 1800) {
                        class159 var87 = var51 ? Statics.field398 : Statics.field264;
                        if (var380 == 1700) {
                            field403[var4++] = var87.field2701;
                            continue;
                        }
                        if (var380 == 1701) {
                            if (var87.field2701 == -1) {
                                field403[var4++] = 0;
                            } else {
                                field403[var4++] = var87.field2702;
                            }
                            continue;
                        }
                        if (var380 == 1702) {
                            field403[var4++] = var87.field2598;
                            continue;
                        }
                    } else if (var380 < 1900) {
                        class159 var88 = var51 ? Statics.field398 : Statics.field264;
                        if (var380 == 1800) {
                            field403[var4++] = class163.method1881(client.method1677(var88));
                            continue;
                        }
                        if (var380 == 1801) {
                            var4--;
                            int var89 = field403[var4];
                            int var381 = var89 - 1;
                            if (var88.field2632 != null && var381 < var88.field2632.length && var88.field2632[var381] != null) {
                                field390[var5++] = var88.field2632[var381];
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var380 == 1802) {
                            if (var88.field2657 == null) {
                                field390[var5++] = "";
                            } else {
                                field390[var5++] = var88.field2657;
                            }
                            continue;
                        }
                    } else if (var380 < 2600) {
                        var4--;
                        class159 var90 = Statics.method2760(field403[var4]);
                        if (var380 == 2500) {
                            field403[var4++] = var90.field2593;
                            continue;
                        }
                        if (var380 == 2501) {
                            field403[var4++] = var90.field2603;
                            continue;
                        }
                        if (var380 == 2502) {
                            field403[var4++] = var90.field2707;
                            continue;
                        }
                        if (var380 == 2503) {
                            field403[var4++] = var90.field2705;
                            continue;
                        }
                        if (var380 == 2504) {
                            field403[var4++] = var90.field2660 ? 1 : 0;
                            continue;
                        }
                        if (var380 == 2505) {
                            field403[var4++] = var90.field2608;
                            continue;
                        }
                    } else if (var380 < 2700) {
                        var4--;
                        class159 var91 = Statics.method2760(field403[var4]);
                        if (var380 == 2600) {
                            field403[var4++] = var91.field2610;
                            continue;
                        }
                        if (var380 == 2601) {
                            field403[var4++] = var91.field2597;
                            continue;
                        }
                        if (var380 == 2602) {
                            field390[var5++] = var91.field2644;
                            continue;
                        }
                        if (var380 == 2603) {
                            field403[var4++] = var91.field2601;
                            continue;
                        }
                        if (var380 == 2604) {
                            field403[var4++] = var91.field2669;
                            continue;
                        }
                        if (var380 == 2605) {
                            field403[var4++] = var91.field2611;
                            continue;
                        }
                        if (var380 == 2606) {
                            field403[var4++] = var91.field2637;
                            continue;
                        }
                        if (var380 == 2607) {
                            field403[var4++] = var91.field2629;
                            continue;
                        }
                        if (var380 == 2608) {
                            field403[var4++] = var91.field2638;
                            continue;
                        }
                    } else if (var380 < 2800) {
                        if (var380 == 2700) {
                            var4--;
                            class159 var92 = Statics.method2760(field403[var4]);
                            field403[var4++] = var92.field2701;
                            continue;
                        }
                        if (var380 == 2701) {
                            var4--;
                            class159 var93 = Statics.method2760(field403[var4]);
                            if (var93.field2701 == -1) {
                                field403[var4++] = 0;
                            } else {
                                field403[var4++] = var93.field2702;
                            }
                            continue;
                        }
                        if (var380 == 2702) {
                            var4--;
                            int var94 = field403[var4];
                            class4 var95 = (class4) client.field634.method3296((long) var94);
                            if (var95 == null) {
                                field403[var4++] = 0;
                            } else {
                                field403[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var380 < 2900) {
                        var4--;
                        class159 var96 = Statics.method2760(field403[var4]);
                        if (var380 == 2800) {
                            field403[var4++] = class163.method1881(client.method1677(var96));
                            continue;
                        }
                        if (var380 == 2801) {
                            var4--;
                            int var97 = field403[var4];
                            int var382 = var97 - 1;
                            if (var96.field2632 != null && var382 < var96.field2632.length && var96.field2632[var382] != null) {
                                field390[var5++] = var96.field2632[var382];
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var380 == 2802) {
                            if (var96.field2657 == null) {
                                field390[var5++] = "";
                            } else {
                                field390[var5++] = var96.field2657;
                            }
                            continue;
                        }
                    } else if (var380 < 3200) {
                        if (var380 == 3100) {
                            var5--;
                            String var98 = field390[var5];
                            client.method1647(0, "", var98);
                            continue;
                        }
                        if (var380 == 3101) {
                            var4 -= 2;
                            client.method1666(Statics.field428, field403[var4], field403[var4 + 1]);
                            continue;
                        }
                        if (var380 == 3103) {
                            client.method116();
                            continue;
                        }
                        if (var380 == 3104) {
                            var5--;
                            String var99 = field390[var5];
                            int var100 = 0;
                            if (class148.method2725(var99)) {
                                var100 = class148.method564(var99);
                            }
                            client.field591.method2345(57);
                            client.field591.method2453(var100);
                            continue;
                        }
                        if (var380 == 3105) {
                            var5--;
                            String var101 = field390[var5];
                            client.field591.method2345(108);
                            client.field591.method2450(var101.length() + 1);
                            client.field591.method2455(var101);
                            continue;
                        }
                        if (var380 == 3106) {
                            var5--;
                            String var102 = field390[var5];
                            client.field591.method2345(181);
                            client.field591.method2450(var102.length() + 1);
                            client.field591.method2455(var102);
                            continue;
                        }
                        if (var380 == 3107) {
                            var4--;
                            int var103 = field403[var4];
                            var5--;
                            String var104 = field390[var5];
                            boolean var105 = false;
                            for (int var106 = 0; var106 < client.field701; var106++) {
                                class3 var107 = client.field592[client.field626[var106]];
                                if (var107 != null && var107.field37 != null && var107.field37.equalsIgnoreCase(var104)) {
                                    if (var103 == 1) {
                                        client.field591.method2345(186);
                                        client.field591.method2495(client.field626[var106]);
                                    } else if (var103 == 4) {
                                        client.field591.method2345(243);
                                        client.field591.method2593(client.field626[var106]);
                                    } else if (var103 == 6) {
                                        client.field591.method2345(250);
                                        client.field591.method2495(client.field626[var106]);
                                    } else if (var103 == 7) {
                                        client.field591.method2345(93);
                                        client.field591.method2494(client.field626[var106]);
                                    }
                                    var105 = true;
                                    break;
                                }
                            }
                            if (!var105) {
                                client.method1647(0, "", class135.field2170 + var104);
                            }
                            continue;
                        }
                        if (var380 == 3108) {
                            var4 -= 3;
                            int var108 = field403[var4];
                            int var109 = field403[var4 + 1];
                            int var110 = field403[var4 + 2];
                            class159 var111 = Statics.method2760(var110);
                            client.method143(var111, var108, var109);
                            continue;
                        }
                        if (var380 == 3109) {
                            var4 -= 2;
                            int var112 = field403[var4];
                            int var113 = field403[var4 + 1];
                            class159 var114 = var51 ? Statics.field398 : Statics.field264;
                            client.method143(var114, var112, var113);
                            continue;
                        }
                    } else if (var380 < 3300) {
                        if (var380 == 3200) {
                            var4 -= 3;
                            client.method567(field403[var4], field403[var4 + 1], field403[var4 + 2]);
                            continue;
                        }
                        if (var380 == 3201) {
                            var4--;
                            int var115 = field403[var4];
                            if (var115 == -1 && !client.field514) {
                                Statics.field2345.method2850();
                                class139.field2347 = 1;
                                Statics.field2346 = null;
                            } else if (var115 != -1 && client.field709 != var115 && client.field515 != 0 && !client.field514) {
                                class139.method2392(2, Statics.field2449, var115, 0, client.field515, false);
                            }
                            client.field709 = var115;
                            continue;
                        }
                        if (var380 == 3202) {
                            var4 -= 2;
                            client.method590(field403[var4], field403[var4 + 1]);
                            continue;
                        }
                    } else if (var380 < 3400) {
                        if (var380 == 3300) {
                            field403[var4++] = client.field699;
                            continue;
                        }
                        if (var380 == 3301) {
                            var4 -= 2;
                            int var116 = field403[var4];
                            int var117 = field403[var4 + 1];
                            int[] var118 = field403;
                            int var119 = var4++;
                            class19 var120 = (class19) class19.field281.method3296((long) var116);
                            int var121;
                            if (var120 == null) {
                                var121 = -1;
                            } else if (var117 >= 0 && var117 < var120.field279.length) {
                                var121 = var120.field279[var117];
                            } else {
                                var121 = -1;
                            }
                            var118[var119] = var121;
                            continue;
                        }
                        if (var380 == 3302) {
                            var4 -= 2;
                            int var122 = field403[var4];
                            int var123 = field403[var4 + 1];
                            field403[var4++] = class19.method2231(var122, var123);
                            continue;
                        }
                        if (var380 == 3303) {
                            var4 -= 2;
                            int var124 = field403[var4];
                            int var125 = field403[var4 + 1];
                            int[] var126 = field403;
                            int var127 = var4++;
                            class19 var128 = (class19) class19.field281.method3296((long) var124);
                            int var129;
                            if (var128 == null) {
                                var129 = 0;
                            } else if (var125 == -1) {
                                var129 = 0;
                            } else {
                                int var130 = 0;
                                for (int var131 = 0; var131 < var128.field285.length; var131++) {
                                    if (var128.field279[var131] == var125) {
                                        var130 += var128.field285[var131];
                                    }
                                }
                                var129 = var130;
                            }
                            var126[var127] = var129;
                            continue;
                        }
                        if (var380 == 3304) {
                            var4--;
                            int var132 = field403[var4];
                            int[] var133 = field403;
                            int var134 = var4++;
                            class41 var135 = (class41) class41.field1026.method3256((long) var132);
                            class41 var136;
                            if (var135 == null) {
                                byte[] var137 = Statics.field1032.method3027(5, var132);
                                class41 var138 = new class41();
                                if (var137 != null) {
                                    var138.method882(new class127(var137));
                                }
                                class41.field1026.method3257(var138, (long) var132);
                                var136 = var138;
                            } else {
                                var136 = var135;
                            }
                            var133[var134] = var136.field1027;
                            continue;
                        }
                        if (var380 == 3305) {
                            var4--;
                            int var139 = field403[var4];
                            field403[var4++] = client.field610[var139];
                            continue;
                        }
                        if (var380 == 3306) {
                            var4--;
                            int var140 = field403[var4];
                            field403[var4++] = client.field611[var140];
                            continue;
                        }
                        if (var380 == 3307) {
                            var4--;
                            int var141 = field403[var4];
                            field403[var4++] = client.field612[var141];
                            continue;
                        }
                        if (var380 == 3308) {
                            int var142 = Statics.field1807;
                            int var143 = (Statics.field428.field418 >> 7) + Statics.field401;
                            int var144 = (Statics.field428.field412 >> 7) + Statics.field1268;
                            field403[var4++] = (var142 << 28) + (var143 << 14) + var144;
                            continue;
                        }
                        if (var380 == 3309) {
                            var4--;
                            int var145 = field403[var4];
                            field403[var4++] = var145 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var380 == 3310) {
                            var4--;
                            int var146 = field403[var4];
                            field403[var4++] = var146 >> 28;
                            continue;
                        }
                        if (var380 == 3311) {
                            var4--;
                            int var147 = field403[var4];
                            field403[var4++] = var147 & 0x3FFF;
                            continue;
                        }
                        if (var380 == 3312) {
                            field403[var4++] = client.field477 ? 1 : 0;
                            continue;
                        }
                        if (var380 == 3313) {
                            var4 -= 2;
                            int var148 = field403[var4] + 32768;
                            int var149 = field403[var4 + 1];
                            int[] var150 = field403;
                            int var151 = var4++;
                            class19 var152 = (class19) class19.field281.method3296((long) var148);
                            int var153;
                            if (var152 == null) {
                                var153 = -1;
                            } else if (var149 >= 0 && var149 < var152.field279.length) {
                                var153 = var152.field279[var149];
                            } else {
                                var153 = -1;
                            }
                            var150[var151] = var153;
                            continue;
                        }
                        if (var380 == 3314) {
                            var4 -= 2;
                            int var154 = field403[var4] + 32768;
                            int var155 = field403[var4 + 1];
                            field403[var4++] = class19.method2231(var154, var155);
                            continue;
                        }
                        if (var380 == 3315) {
                            var4 -= 2;
                            int var156 = field403[var4] + 32768;
                            int var157 = field403[var4 + 1];
                            int[] var158 = field403;
                            int var159 = var4++;
                            class19 var160 = (class19) class19.field281.method3296((long) var156);
                            int var161;
                            if (var160 == null) {
                                var161 = 0;
                            } else if (var157 == -1) {
                                var161 = 0;
                            } else {
                                int var162 = 0;
                                for (int var163 = 0; var163 < var160.field285.length; var163++) {
                                    if (var160.field279[var163] == var157) {
                                        var162 += var160.field285[var163];
                                    }
                                }
                                var161 = var162;
                            }
                            var158[var159] = var161;
                            continue;
                        }
                        if (var380 == 3316) {
                            if (client.field636 >= 2) {
                                field403[var4++] = client.field636;
                            } else {
                                field403[var4++] = 0;
                            }
                            continue;
                        }
                        if (var380 == 3317) {
                            field403[var4++] = client.field737;
                            continue;
                        }
                        if (var380 == 3318) {
                            field403[var4++] = client.field718;
                            continue;
                        }
                        if (var380 == 3321) {
                            field403[var4++] = client.field488;
                            continue;
                        }
                        if (var380 == 3322) {
                            field403[var4++] = client.field511;
                            continue;
                        }
                        if (var380 == 3323) {
                            if (client.field641) {
                                field403[var4++] = 1;
                            } else {
                                field403[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var380 < 3500) {
                        if (var380 == 3400) {
                            var4 -= 2;
                            int var164 = field403[var4];
                            int var165 = field403[var4 + 1];
                            class39 var166 = (class39) class39.field964.method3256((long) var164);
                            class39 var167;
                            if (var166 == null) {
                                byte[] var168 = Statics.field963.method3027(8, var164);
                                class39 var169 = new class39();
                                if (var168 != null) {
                                    var169.method829(new class127(var168));
                                }
                                class39.field964.method3257(var169, (long) var164);
                                var167 = var169;
                            } else {
                                var167 = var166;
                            }
                            class39 var170 = var167;
                            if (var167.field966 != 's') {
                            }
                            for (int var171 = 0; var171 < var170.field969; var171++) {
                                if (var170.field973[var171] == var165) {
                                    field390[var5++] = var170.field972[var171];
                                    var170 = null;
                                    break;
                                }
                            }
                            if (var170 != null) {
                                field390[var5++] = var170.field967;
                            }
                            continue;
                        }
                        if (var380 == 3408) {
                            var4 -= 4;
                            int var172 = field403[var4];
                            int var173 = field403[var4 + 1];
                            int var174 = field403[var4 + 2];
                            int var175 = field403[var4 + 3];
                            class39 var176 = (class39) class39.field964.method3256((long) var174);
                            class39 var177;
                            if (var176 == null) {
                                byte[] var178 = Statics.field963.method3027(8, var174);
                                class39 var179 = new class39();
                                if (var178 != null) {
                                    var179.method829(new class127(var178));
                                }
                                class39.field964.method3257(var179, (long) var174);
                                var177 = var179;
                            } else {
                                var177 = var176;
                            }
                            class39 var180 = var177;
                            if (var177.field965 == var172 && var177.field966 == var173) {
                                for (int var181 = 0; var181 < var180.field969; var181++) {
                                    if (var180.field973[var181] == var175) {
                                        if (var173 == 115) {
                                            field390[var5++] = var180.field972[var181];
                                        } else {
                                            field403[var4++] = var180.field971[var181];
                                        }
                                        var180 = null;
                                        break;
                                    }
                                }
                                if (var180 != null) {
                                    if (var173 == 115) {
                                        field390[var5++] = var180.field967;
                                    } else {
                                        field403[var4++] = var180.field968;
                                    }
                                }
                                continue;
                            }
                            if (var173 == 115) {
                                field390[var5++] = "null";
                            } else {
                                field403[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var380 < 3700) {
                        if (var380 == 3600) {
                            if (client.field726 == 0) {
                                field403[var4++] = -2;
                            } else if (client.field726 == 1) {
                                field403[var4++] = -1;
                            } else {
                                field403[var4++] = client.field725;
                            }
                            continue;
                        }
                        if (var380 == 3601) {
                            var4--;
                            int var182 = field403[var4];
                            if (client.field726 == 2 && var182 < client.field725) {
                                field390[var5++] = client.field727[var182].field359;
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var380 == 3602) {
                            var4--;
                            int var183 = field403[var4];
                            if (client.field726 == 2 && var183 < client.field725) {
                                field403[var4++] = client.field727[var183].field357;
                                continue;
                            }
                            field403[var4++] = 0;
                            continue;
                        }
                        if (var380 == 3603) {
                            var4--;
                            int var184 = field403[var4];
                            if (client.field726 == 2 && var184 < client.field725) {
                                field403[var4++] = client.field727[var184].field366;
                                continue;
                            }
                            field403[var4++] = 0;
                            continue;
                        }
                        if (var380 == 3604) {
                            var5--;
                            String var185 = field390[var5];
                            var4--;
                            int var186 = field403[var4];
                            client.method54(var185, var186);
                            continue;
                        }
                        if (var380 == 3605) {
                            var5--;
                            String var187 = field390[var5];
                            if (var187 == null) {
                                continue;
                            }
                            if ((client.field725 < 200 || client.field599 == 1) && client.field725 < 400) {
                                String var188 = class149.method29(var187, Statics.field668);
                                if (var188 == null) {
                                    continue;
                                }
                                for (int var189 = 0; var189 < client.field725; var189++) {
                                    class23 var190 = client.field727[var189];
                                    String var191 = class149.method29(var190.field359, Statics.field668);
                                    if (var191 != null && var191.equals(var188)) {
                                        client.method1647(0, "", var187 + class135.field2176);
                                        continue label2420;
                                    }
                                    if (var190.field356 != null) {
                                        String var192 = class149.method29(var190.field356, Statics.field668);
                                        if (var192 != null && var192.equals(var188)) {
                                            client.method1647(0, "", var187 + class135.field2176);
                                            continue label2420;
                                        }
                                    }
                                }
                                for (int var193 = 0; var193 < client.field729; var193++) {
                                    class11 var194 = client.field494[var193];
                                    String var195 = class149.method29(var194.field186, Statics.field668);
                                    if (var195 != null && var195.equals(var188)) {
                                        client.method1647(0, "", class135.field2259 + var187 + class135.field2260);
                                        continue label2420;
                                    }
                                    if (var194.field180 != null) {
                                        String var196 = class149.method29(var194.field180, Statics.field668);
                                        if (var196 != null && var196.equals(var188)) {
                                            client.method1647(0, "", class135.field2259 + var187 + class135.field2260);
                                            continue label2420;
                                        }
                                    }
                                }
                                if (class149.method29(Statics.field428.field37, Statics.field668).equals(var188)) {
                                    client.method1647(0, "", class135.field2164);
                                } else {
                                    client.field591.method2345(133);
                                    client.field591.method2450(class127.method1431(var187));
                                    client.field591.method2455(var187);
                                }
                                continue;
                            }
                            client.method1647(0, "", class135.field2253);
                            continue;
                        }
                        if (var380 == 3606) {
                            var5--;
                            String var197 = field390[var5];
                            if (var197 == null) {
                                continue;
                            }
                            String var198 = class149.method29(var197, Statics.field668);
                            if (var198 == null) {
                                continue;
                            }
                            int var199 = 0;
                            while (true) {
                                if (var199 >= client.field725) {
                                    continue label2420;
                                }
                                class23 var200 = client.field727[var199];
                                String var201 = var200.field359;
                                String var202 = class149.method29(var201, Statics.field668);
                                if (class137.method2059(var197, var198, var201, var202)) {
                                    client.field725--;
                                    for (int var203 = var199; var203 < client.field725; var203++) {
                                        client.field727[var203] = client.field727[var203 + 1];
                                    }
                                    client.field664 = client.field656;
                                    client.field591.method2345(172);
                                    client.field591.method2450(class127.method1431(var197));
                                    client.field591.method2455(var197);
                                    continue label2420;
                                }
                                var199++;
                            }
                        }
                        if (var380 == 3607) {
                            var5--;
                            String var204 = field390[var5];
                            client.method1374(var204, false);
                            continue;
                        }
                        if (var380 == 3608) {
                            var5--;
                            String var205 = field390[var5];
                            if (var205 == null) {
                                continue;
                            }
                            String var206 = class149.method29(var205, Statics.field668);
                            if (var206 == null) {
                                continue;
                            }
                            int var207 = 0;
                            while (true) {
                                if (var207 >= client.field729) {
                                    continue label2420;
                                }
                                class11 var208 = client.field494[var207];
                                String var209 = var208.field186;
                                String var210 = class149.method29(var209, Statics.field668);
                                boolean var211;
                                if (var205 == null || var209 == null) {
                                    var211 = false;
                                } else if (var205.startsWith("#") || var209.startsWith("#")) {
                                    var211 = var205.equals(var209);
                                } else {
                                    var211 = var206.equals(var210);
                                }
                                if (var211) {
                                    client.field729--;
                                    for (int var212 = var207; var212 < client.field729; var212++) {
                                        client.field494[var212] = client.field494[var212 + 1];
                                    }
                                    client.field664 = client.field656;
                                    client.field591.method2345(67);
                                    client.field591.method2450(class127.method1431(var205));
                                    client.field591.method2455(var205);
                                    continue label2420;
                                }
                                var207++;
                            }
                        }
                        if (var380 == 3609) {
                            var5--;
                            String var213 = field390[var5];
                            if (var213.startsWith(class2.method1546(0)) || var213.startsWith(class2.method1546(1))) {
                                var213 = var213.substring(7);
                            }
                            field403[var4++] = client.method2718(var213) ? 1 : 0;
                            continue;
                        }
                        if (var380 == 3611) {
                            if (client.field698 == null) {
                                field390[var5++] = "";
                                continue;
                            }
                            String[] var214 = field390;
                            int var215 = var5++;
                            String var216 = client.field698;
                            long var217 = 0L;
                            int var219 = var216.length();
                            for (int var220 = 0; var220 < var219; var220++) {
                                var217 *= 37L;
                                char var221 = var216.charAt(var220);
                                if (var221 >= 'A' && var221 <= 'Z') {
                                    var217 += (long) (var221 + 1 - 65);
                                } else if (var221 >= 'a' && var221 <= 'z') {
                                    var217 += (long) (var221 + 1 - 97);
                                } else if (var221 >= '0' && var221 <= '9') {
                                    var217 += (long) (var221 + 27 - 48);
                                }
                                if (var217 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var217 % 37L == 0L && var217 != 0L) {
                                var217 /= 37L;
                            }
                            String var224 = class147.method2876(var217);
                            if (var224 == null) {
                                var224 = "";
                            }
                            var214[var215] = var224;
                            continue;
                        }
                        if (var380 == 3612) {
                            if (client.field698 == null) {
                                field403[var4++] = 0;
                            } else {
                                field403[var4++] = Statics.field206;
                            }
                            continue;
                        }
                        if (var380 == 3613) {
                            var4--;
                            int var226 = field403[var4];
                            if (client.field698 != null && var226 < Statics.field206) {
                                field390[var5++] = Statics.field1273[var226].field114;
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var380 == 3614) {
                            var4--;
                            int var227 = field403[var4];
                            if (client.field698 != null && var227 < Statics.field206) {
                                field403[var4++] = Statics.field1273[var227].field111;
                                continue;
                            }
                            field403[var4++] = 0;
                            continue;
                        }
                        if (var380 == 3615) {
                            var4--;
                            int var228 = field403[var4];
                            if (client.field698 != null && var228 < Statics.field206) {
                                field403[var4++] = Statics.field1273[var228].field110;
                                continue;
                            }
                            field403[var4++] = 0;
                            continue;
                        }
                        if (var380 == 3616) {
                            field403[var4++] = Statics.field2460;
                            continue;
                        }
                        if (var380 == 3617) {
                            var5--;
                            String var229 = field390[var5];
                            if (Statics.field1273 != null) {
                                client.field591.method2345(40);
                                client.field591.method2450(class127.method1431(var229));
                                client.field591.method2455(var229);
                            }
                            continue;
                        }
                        if (var380 == 3618) {
                            field403[var4++] = Statics.field139;
                            continue;
                        }
                        if (var380 == 3619) {
                            var5--;
                            String var230 = field390[var5];
                            client.method1874(var230);
                            continue;
                        }
                        if (var380 == 3620) {
                            client.method203();
                            continue;
                        }
                        if (var380 == 3621) {
                            if (client.field726 == 0) {
                                field403[var4++] = -1;
                            } else {
                                field403[var4++] = client.field729;
                            }
                            continue;
                        }
                        if (var380 == 3622) {
                            var4--;
                            int var231 = field403[var4];
                            if (client.field726 != 0 && var231 < client.field729) {
                                field390[var5++] = client.field494[var231].field186;
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var380 == 3623) {
                            var5--;
                            String var232 = field390[var5];
                            if (var232.startsWith(class2.method1546(0)) || var232.startsWith(class2.method1546(1))) {
                                var232 = var232.substring(7);
                            }
                            field403[var4++] = client.method808(var232) ? 1 : 0;
                            continue;
                        }
                        if (var380 == 3624) {
                            var4--;
                            int var233 = field403[var4];
                            if (Statics.field1273 != null && var233 < Statics.field206 && Statics.field1273[var233].field114.equalsIgnoreCase(Statics.field428.field37)) {
                                field403[var4++] = 1;
                                continue;
                            }
                            field403[var4++] = 0;
                            continue;
                        }
                        if (var380 == 3625) {
                            if (client.field690 == null) {
                                field390[var5++] = "";
                                continue;
                            }
                            String[] var234 = field390;
                            int var235 = var5++;
                            String var236 = client.field690;
                            long var237 = 0L;
                            int var239 = var236.length();
                            for (int var240 = 0; var240 < var239; var240++) {
                                var237 *= 37L;
                                char var241 = var236.charAt(var240);
                                if (var241 >= 'A' && var241 <= 'Z') {
                                    var237 += (long) (var241 + 1 - 65);
                                } else if (var241 >= 'a' && var241 <= 'z') {
                                    var237 += (long) (var241 + 1 - 97);
                                } else if (var241 >= '0' && var241 <= '9') {
                                    var237 += (long) (var241 + 27 - 48);
                                }
                                if (var237 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var237 % 37L == 0L && var237 != 0L) {
                                var237 /= 37L;
                            }
                            String var244 = class147.method2876(var237);
                            if (var244 == null) {
                                var244 = "";
                            }
                            var234[var235] = var244;
                            continue;
                        }
                    } else if (var380 < 4100) {
                        if (var380 == 4000) {
                            var4 -= 2;
                            int var246 = field403[var4];
                            int var247 = field403[var4 + 1];
                            field403[var4++] = var246 + var247;
                            continue;
                        }
                        if (var380 == 4001) {
                            var4 -= 2;
                            int var248 = field403[var4];
                            int var249 = field403[var4 + 1];
                            field403[var4++] = var248 - var249;
                            continue;
                        }
                        if (var380 == 4002) {
                            var4 -= 2;
                            int var250 = field403[var4];
                            int var251 = field403[var4 + 1];
                            field403[var4++] = var250 * var251;
                            continue;
                        }
                        if (var380 == 4003) {
                            var4 -= 2;
                            int var252 = field403[var4];
                            int var253 = field403[var4 + 1];
                            field403[var4++] = var252 / var253;
                            continue;
                        }
                        if (var380 == 4004) {
                            var4--;
                            int var254 = field403[var4];
                            field403[var4++] = (int) (Math.random() * (double) var254);
                            continue;
                        }
                        if (var380 == 4005) {
                            var4--;
                            int var255 = field403[var4];
                            field403[var4++] = (int) (Math.random() * (double) (var255 + 1));
                            continue;
                        }
                        if (var380 == 4006) {
                            var4 -= 5;
                            int var256 = field403[var4];
                            int var257 = field403[var4 + 1];
                            int var258 = field403[var4 + 2];
                            int var259 = field403[var4 + 3];
                            int var260 = field403[var4 + 4];
                            field403[var4++] = (var257 - var256) * (var260 - var258) / (var259 - var258) + var256;
                            continue;
                        }
                        if (var380 == 4007) {
                            var4 -= 2;
                            int var261 = field403[var4];
                            int var262 = field403[var4 + 1];
                            field403[var4++] = var261 * var262 / 100 + var261;
                            continue;
                        }
                        if (var380 == 4008) {
                            var4 -= 2;
                            int var263 = field403[var4];
                            int var264 = field403[var4 + 1];
                            field403[var4++] = var263 | 0x1 << var264;
                            continue;
                        }
                        if (var380 == 4009) {
                            var4 -= 2;
                            int var265 = field403[var4];
                            int var266 = field403[var4 + 1];
                            field403[var4++] = var265 & -1 - (0x1 << var266);
                            continue;
                        }
                        if (var380 == 4010) {
                            var4 -= 2;
                            int var267 = field403[var4];
                            int var268 = field403[var4 + 1];
                            field403[var4++] = (var267 & 0x1 << var268) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var380 == 4011) {
                            var4 -= 2;
                            int var269 = field403[var4];
                            int var270 = field403[var4 + 1];
                            field403[var4++] = var269 % var270;
                            continue;
                        }
                        if (var380 == 4012) {
                            var4 -= 2;
                            int var271 = field403[var4];
                            int var272 = field403[var4 + 1];
                            if (var271 == 0) {
                                field403[var4++] = 0;
                            } else {
                                field403[var4++] = (int) Math.pow((double) var271, (double) var272);
                            }
                            continue;
                        }
                        if (var380 == 4013) {
                            var4 -= 2;
                            int var273 = field403[var4];
                            int var274 = field403[var4 + 1];
                            if (var273 == 0) {
                                field403[var4++] = 0;
                            } else if (var274 == 0) {
                                field403[var4++] = Integer.MAX_VALUE;
                            } else {
                                field403[var4++] = (int) Math.pow((double) var273, 1.0D / (double) var274);
                            }
                            continue;
                        }
                        if (var380 == 4014) {
                            var4 -= 2;
                            int var275 = field403[var4];
                            int var276 = field403[var4 + 1];
                            field403[var4++] = var275 & var276;
                            continue;
                        }
                        if (var380 == 4015) {
                            var4 -= 2;
                            int var277 = field403[var4];
                            int var278 = field403[var4 + 1];
                            field403[var4++] = var277 | var278;
                            continue;
                        }
                    } else if (var380 < 4200) {
                        if (var380 == 4100) {
                            var5--;
                            String var279 = field390[var5];
                            var4--;
                            int var280 = field403[var4];
                            field390[var5++] = var279 + var280;
                            continue;
                        }
                        if (var380 == 4101) {
                            var5 -= 2;
                            String var281 = field390[var5];
                            String var282 = field390[var5 + 1];
                            field390[var5++] = var281 + var282;
                            continue;
                        }
                        if (var380 == 4102) {
                            var5--;
                            String var283 = field390[var5];
                            var4--;
                            int var284 = field403[var4];
                            field390[var5++] = var283 + class148.method136(var284, true);
                            continue;
                        }
                        if (var380 == 4103) {
                            var5--;
                            String var285 = field390[var5];
                            field390[var5++] = var285.toLowerCase();
                            continue;
                        }
                        if (var380 == 4104) {
                            var4--;
                            int var286 = field403[var4];
                            long var287 = ((long) var286 + 11745L) * 86400000L;
                            field399.setTime(new Date(var287));
                            int var289 = field399.get(5);
                            int var290 = field399.get(2);
                            int var291 = field399.get(1);
                            field390[var5++] = var289 + "-" + field410[var290] + "-" + var291;
                            continue;
                        }
                        if (var380 == 4105) {
                            var5 -= 2;
                            String var292 = field390[var5];
                            String var293 = field390[var5 + 1];
                            if (Statics.field428.field43 != null && Statics.field428.field43.field2736) {
                                field390[var5++] = var293;
                                continue;
                            }
                            field390[var5++] = var292;
                            continue;
                        }
                        if (var380 == 4106) {
                            var4--;
                            int var294 = field403[var4];
                            field390[var5++] = Integer.toString(var294);
                            continue;
                        }
                        if (var380 == 4107) {
                            var5 -= 2;
                            int[] var295 = field403;
                            int var296 = var4++;
                            int var297 = class151.method751(field390[var5], field390[var5 + 1], client.field712);
                            byte var298;
                            if (var297 > 0) {
                                var298 = 1;
                            } else if (var297 < 0) {
                                var298 = -1;
                            } else {
                                var298 = 0;
                            }
                            var295[var296] = var298;
                            continue;
                        }
                        if (var380 == 4108) {
                            var5--;
                            String var299 = field390[var5];
                            var4 -= 2;
                            int var300 = field403[var4];
                            int var301 = field403[var4 + 1];
                            byte[] var302 = Statics.field491.method3027(var301, 0);
                            class183 var303 = new class183(var302);
                            field403[var4++] = var303.method3440(var299, var300);
                            continue;
                        }
                        if (var380 == 4109) {
                            var5--;
                            String var304 = field390[var5];
                            var4 -= 2;
                            int var305 = field403[var4];
                            int var306 = field403[var4 + 1];
                            byte[] var307 = Statics.field491.method3027(var306, 0);
                            class183 var308 = new class183(var307);
                            field403[var4++] = var308.method3407(var304, var305);
                            continue;
                        }
                        if (var380 == 4110) {
                            var5 -= 2;
                            String var309 = field390[var5];
                            String var310 = field390[var5 + 1];
                            var4--;
                            if (field403[var4] == 1) {
                                field390[var5++] = var309;
                            } else {
                                field390[var5++] = var310;
                            }
                            continue;
                        }
                        if (var380 == 4111) {
                            var5--;
                            String var311 = field390[var5];
                            field390[var5++] = class185.method3392(var311);
                            continue;
                        }
                        if (var380 == 4112) {
                            var5--;
                            String var312 = field390[var5];
                            var4--;
                            int var313 = field403[var4];
                            field390[var5++] = var312 + (char) var313;
                            continue;
                        }
                        if (var380 == 4113) {
                            var4--;
                            int var314 = field403[var4];
                            field403[var4++] = class148.method1584((char) var314) ? 1 : 0;
                            continue;
                        }
                        if (var380 == 4114) {
                            var4--;
                            int var315 = field403[var4];
                            field403[var4++] = class148.method2726((char) var315) ? 1 : 0;
                            continue;
                        }
                        if (var380 == 4115) {
                            var4--;
                            int var316 = field403[var4];
                            field403[var4++] = class148.method2759((char) var316) ? 1 : 0;
                            continue;
                        }
                        if (var380 == 4116) {
                            var4--;
                            int var317 = field403[var4];
                            field403[var4++] = class148.method2322((char) var317) ? 1 : 0;
                            continue;
                        }
                        if (var380 == 4117) {
                            var5--;
                            String var318 = field390[var5];
                            if (var318 == null) {
                                field403[var4++] = 0;
                            } else {
                                field403[var4++] = var318.length();
                            }
                            continue;
                        }
                        if (var380 == 4118) {
                            var5--;
                            String var319 = field390[var5];
                            var4 -= 2;
                            int var320 = field403[var4];
                            int var321 = field403[var4 + 1];
                            field390[var5++] = var319.substring(var320, var321);
                            continue;
                        }
                        if (var380 == 4119) {
                            var5--;
                            String var322 = field390[var5];
                            StringBuilder var323 = new StringBuilder(var322.length());
                            boolean var324 = false;
                            for (int var325 = 0; var325 < var322.length(); var325++) {
                                char var326 = var322.charAt(var325);
                                if (var326 == '<') {
                                    var324 = true;
                                } else if (var326 == '>') {
                                    var324 = false;
                                } else if (!var324) {
                                    var323.append(var326);
                                }
                            }
                            field390[var5++] = var323.toString();
                            continue;
                        }
                        if (var380 == 4120) {
                            var5--;
                            String var327 = field390[var5];
                            var4--;
                            int var328 = field403[var4];
                            field403[var4++] = var327.indexOf(var328);
                            continue;
                        }
                    } else if (var380 < 4300) {
                        if (var380 == 4200) {
                            var4--;
                            int var329 = field403[var4];
                            field390[var5++] = class40.method712(var329).field1009;
                            continue;
                        }
                        if (var380 == 4201) {
                            var4 -= 2;
                            int var330 = field403[var4];
                            int var331 = field403[var4 + 1];
                            class40 var332 = class40.method712(var330);
                            if (var331 >= 1 && var331 <= 5 && var332.field1024[var331 - 1] != null) {
                                field390[var5++] = var332.field1024[var331 - 1];
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var380 == 4202) {
                            var4 -= 2;
                            int var333 = field403[var4];
                            int var334 = field403[var4 + 1];
                            class40 var335 = class40.method712(var333);
                            if (var334 >= 1 && var334 <= 5 && var335.field1022[var334 - 1] != null) {
                                field390[var5++] = var335.field1022[var334 - 1];
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var380 == 4203) {
                            var4--;
                            int var336 = field403[var4];
                            field403[var4++] = class40.method712(var336).field995;
                            continue;
                        }
                        if (var380 == 4204) {
                            var4--;
                            int var337 = field403[var4];
                            field403[var4++] = class40.method712(var337).field988 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var380 == 4205) {
                            var4--;
                            int var338 = field403[var4];
                            class40 var339 = class40.method712(var338);
                            if (var339.field1014 == -1 && var339.field1013 >= 0) {
                                field403[var4++] = var339.field1013;
                                continue;
                            }
                            field403[var4++] = var338;
                            continue;
                        }
                        if (var380 == 4206) {
                            var4--;
                            int var340 = field403[var4];
                            class40 var341 = class40.method712(var340);
                            if (var341.field1014 >= 0 && var341.field1013 >= 0) {
                                field403[var4++] = var341.field1013;
                                continue;
                            }
                            field403[var4++] = var340;
                            continue;
                        }
                        if (var380 == 4207) {
                            var4--;
                            int var342 = field403[var4];
                            field403[var4++] = class40.method712(var342).field1021 ? 1 : 0;
                            continue;
                        }
                    } else if (var380 < 5100) {
                        if (var380 == 5000) {
                            field403[var4++] = client.field501;
                            continue;
                        }
                        if (var380 == 5001) {
                            var4 -= 3;
                            client.field501 = field403[var4];
                            int var343 = field403[var4 + 1];
                            class138[] var344 = class138.method2737();
                            int var345 = 0;
                            class138 var347;
                            while (true) {
                                if (var345 >= var344.length) {
                                    var347 = null;
                                    break;
                                }
                                class138 var346 = var344[var345];
                                if (var346.field2339 == var343) {
                                    var347 = var346;
                                    break;
                                }
                                var345++;
                            }
                            Statics.field1836 = var347;
                            if (Statics.field1836 == null) {
                                Statics.field1836 = class138.field2337;
                            }
                            client.field691 = field403[var4 + 2];
                            client.field591.method2345(220);
                            client.field591.method2450(client.field501);
                            client.field591.method2450(Statics.field1836.field2339);
                            client.field591.method2450(client.field691);
                            continue;
                        }
                        if (var380 == 5002) {
                            var5--;
                            String var348 = field390[var5];
                            var4 -= 2;
                            int var349 = field403[var4];
                            int var350 = field403[var4 + 1];
                            client.field591.method2345(38);
                            client.field591.method2450(class127.method1431(var348) + 2);
                            client.field591.method2455(var348);
                            client.field591.method2450(var349 - 1);
                            client.field591.method2450(var350);
                            continue;
                        }
                        if (var380 == 5003) {
                            var4--;
                            int var351 = field403[var4];
                            String var352 = null;
                            if (var351 < 100) {
                                var352 = client.field687[var351];
                            }
                            if (var352 == null) {
                                var352 = "";
                            }
                            field390[var5++] = var352;
                            continue;
                        }
                        if (var380 == 5004) {
                            var4--;
                            int var353 = field403[var4];
                            int var354 = -1;
                            if (var353 < 100 && client.field687[var353] != null) {
                                var354 = client.field684[var353];
                            }
                            field403[var4++] = var354;
                            continue;
                        }
                        if (var380 == 5005) {
                            if (Statics.field1836 == null) {
                                field403[var4++] = -1;
                            } else {
                                field403[var4++] = Statics.field1836.field2339;
                            }
                            continue;
                        }
                        if (var380 == 5008) {
                            var5--;
                            String var355 = field390[var5];
                            if (var355.startsWith("::")) {
                                String var356 = var355.substring(2);
                                if (var356.equalsIgnoreCase("toggleroof")) {
                                    Statics.field219.field191 = !Statics.field219.field191;
                                    class12.method238();
                                    if (Statics.field219.field191) {
                                        client.method1647(0, "", "Roofs are now all hidden");
                                    } else {
                                        client.method1647(0, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field636 >= 2) {
                                    if (var356.equalsIgnoreCase("fpson")) {
                                        client.field585 = true;
                                    }
                                    if (var356.equalsIgnoreCase("fpsoff")) {
                                        client.field585 = false;
                                    }
                                    if (var356.equalsIgnoreCase("gc")) {
                                        System.gc();
                                    }
                                    if (var356.equalsIgnoreCase("clientdrop")) {
                                        Statics.method2137();
                                    }
                                    if (var356.equalsIgnoreCase("errortest") && client.field474 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field591.method2345(216);
                                client.field591.method2450(var356.length() + 1);
                                client.field591.method2455(var356);
                            } else {
                                String var357 = var355.toLowerCase();
                                byte var358 = 0;
                                if (var357.startsWith(class135.field2263)) {
                                    var358 = 0;
                                    var355 = var355.substring(class135.field2263.length());
                                } else if (var357.startsWith(class135.field2265)) {
                                    var358 = 1;
                                    var355 = var355.substring(class135.field2265.length());
                                } else if (var357.startsWith(class135.field2267)) {
                                    var358 = 2;
                                    var355 = var355.substring(class135.field2267.length());
                                } else if (var357.startsWith(class135.field2269)) {
                                    var358 = 3;
                                    var355 = var355.substring(class135.field2269.length());
                                } else if (var357.startsWith(class135.field2271)) {
                                    var358 = 4;
                                    var355 = var355.substring(class135.field2271.length());
                                } else if (var357.startsWith(class135.field2298)) {
                                    var358 = 5;
                                    var355 = var355.substring(class135.field2298.length());
                                } else if (var357.startsWith(class135.field2275)) {
                                    var358 = 6;
                                    var355 = var355.substring(class135.field2275.length());
                                } else if (var357.startsWith(class135.field2305)) {
                                    var358 = 7;
                                    var355 = var355.substring(class135.field2305.length());
                                } else if (var357.startsWith(class135.field2163)) {
                                    var358 = 8;
                                    var355 = var355.substring(class135.field2163.length());
                                } else if (var357.startsWith(class135.field2281)) {
                                    var358 = 9;
                                    var355 = var355.substring(class135.field2281.length());
                                } else if (var357.startsWith(class135.field2097)) {
                                    var358 = 10;
                                    var355 = var355.substring(class135.field2097.length());
                                } else if (var357.startsWith(class135.field2285)) {
                                    var358 = 11;
                                    var355 = var355.substring(class135.field2285.length());
                                } else if (client.field712 != 0) {
                                    if (var357.startsWith(class135.field2264)) {
                                        var358 = 0;
                                        var355 = var355.substring(class135.field2264.length());
                                    } else if (var357.startsWith(class135.field2266)) {
                                        var358 = 1;
                                        var355 = var355.substring(class135.field2266.length());
                                    } else if (var357.startsWith(class135.field2268)) {
                                        var358 = 2;
                                        var355 = var355.substring(class135.field2268.length());
                                    } else if (var357.startsWith(class135.field2270)) {
                                        var358 = 3;
                                        var355 = var355.substring(class135.field2270.length());
                                    } else if (var357.startsWith(class135.field2279)) {
                                        var358 = 4;
                                        var355 = var355.substring(class135.field2279.length());
                                    } else if (var357.startsWith(class135.field2274)) {
                                        var358 = 5;
                                        var355 = var355.substring(class135.field2274.length());
                                    } else if (var357.startsWith(class135.field2124)) {
                                        var358 = 6;
                                        var355 = var355.substring(class135.field2124.length());
                                    } else if (var357.startsWith(class135.field2234)) {
                                        var358 = 7;
                                        var355 = var355.substring(class135.field2234.length());
                                    } else if (var357.startsWith(class135.field2280)) {
                                        var358 = 8;
                                        var355 = var355.substring(class135.field2280.length());
                                    } else if (var357.startsWith(class135.field2309)) {
                                        var358 = 9;
                                        var355 = var355.substring(class135.field2309.length());
                                    } else if (var357.startsWith(class135.field2284)) {
                                        var358 = 10;
                                        var355 = var355.substring(class135.field2284.length());
                                    } else if (var357.startsWith(class135.field2286)) {
                                        var358 = 11;
                                        var355 = var355.substring(class135.field2286.length());
                                    }
                                }
                                String var359 = var355.toLowerCase();
                                byte var360 = 0;
                                if (var359.startsWith(class135.field2150)) {
                                    var360 = 1;
                                    var355 = var355.substring(class135.field2150.length());
                                } else if (var359.startsWith(class135.field2289)) {
                                    var360 = 2;
                                    var355 = var355.substring(class135.field2289.length());
                                } else if (var359.startsWith(class135.field2291)) {
                                    var360 = 3;
                                    var355 = var355.substring(class135.field2291.length());
                                } else if (var359.startsWith(class135.field2293)) {
                                    var360 = 4;
                                    var355 = var355.substring(class135.field2293.length());
                                } else if (var359.startsWith(class135.field2229)) {
                                    var360 = 5;
                                    var355 = var355.substring(class135.field2229.length());
                                } else if (client.field712 != 0) {
                                    if (var359.startsWith(class135.field2288)) {
                                        var360 = 1;
                                        var355 = var355.substring(class135.field2288.length());
                                    } else if (var359.startsWith(class135.field2172)) {
                                        var360 = 2;
                                        var355 = var355.substring(class135.field2172.length());
                                    } else if (var359.startsWith(class135.field2292)) {
                                        var360 = 3;
                                        var355 = var355.substring(class135.field2292.length());
                                    } else if (var359.startsWith(class135.field2294)) {
                                        var360 = 4;
                                        var355 = var355.substring(class135.field2294.length());
                                    } else if (var359.startsWith(class135.field2296)) {
                                        var360 = 5;
                                        var355 = var355.substring(class135.field2296.length());
                                    }
                                }
                                client.field591.method2345(42);
                                client.field591.method2450(0);
                                int var361 = client.field591.field2035;
                                client.field591.method2450(var358);
                                client.field591.method2450(var360);
                                class116 var362 = client.field591;
                                int var363 = var362.field2035;
                                byte[] var364 = class150.method181(var355);
                                var362.method2462(var364.length);
                                var362.field2035 += Statics.field2824.method2383(var364, 0, var364.length, var362.field2037, var362.field2035);
                                client.field591.method2637(client.field591.field2035 - var361);
                            }
                            continue;
                        }
                        if (var380 == 5009) {
                            var5 -= 2;
                            String var365 = field390[var5];
                            String var366 = field390[var5 + 1];
                            client.field591.method2345(149);
                            client.field591.method2593(0);
                            int var367 = client.field591.field2035;
                            client.field591.method2455(var365);
                            class116 var368 = client.field591;
                            int var369 = var368.field2035;
                            byte[] var370 = class150.method181(var366);
                            var368.method2462(var370.length);
                            var368.field2035 += Statics.field2824.method2383(var370, 0, var370.length, var368.field2037, var368.field2035);
                            client.field591.method2538(client.field591.field2035 - var367);
                            continue;
                        }
                        if (var380 == 5010) {
                            var4--;
                            int var371 = field403[var4];
                            String var372 = null;
                            if (var371 < 100) {
                                var372 = client.field685[var371];
                            }
                            if (var372 == null) {
                                var372 = "";
                            }
                            field390[var5++] = var372;
                            continue;
                        }
                        if (var380 == 5011) {
                            var4--;
                            int var373 = field403[var4];
                            String var374 = null;
                            if (var373 < 100) {
                                var374 = client.field575[var373];
                            }
                            if (var374 == null) {
                                var374 = "";
                            }
                            field390[var5++] = var374;
                            continue;
                        }
                        if (var380 == 5015) {
                            String var375;
                            if (Statics.field428 == null || Statics.field428.field37 == null) {
                                var375 = "";
                            } else {
                                var375 = Statics.field428.field37;
                            }
                            field390[var5++] = var375;
                            continue;
                        }
                        if (var380 == 5016) {
                            field403[var4++] = client.field691;
                            continue;
                        }
                        if (var380 == 5017) {
                            field403[var4++] = client.field688;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var379) {
            StringBuilder var377 = new StringBuilder(30);
            var377.append("").append(var3.field2813).append(" ");
            for (int var378 = field396 - 1; var378 >= 0; var378--) {
                var377.append("").append(field397[var378].field273.field2813).append(" ");
            }
            var377.append("").append(var9);
            class80.method1544(var377.toString(), var379);
        }
    }

    @ObfuscatedName("f.f(II)V")
    public static void method10(int arg0) {
        if (arg0 == -1 || !class159.method2219(arg0)) {
            return;
        }
        class159[] var1 = Statics.field2592[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3.field2665 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field10 = var3.field2665;
                method1675(var4);
            }
        }
    }
}
