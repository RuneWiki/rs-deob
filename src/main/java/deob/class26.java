package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("i")
public class class26 {

    @ObfuscatedName("i.e")
    public static int[] field376 = new int[5];

    @ObfuscatedName("i.l")
    public static int[][] field380 = new int[5][5000];

    @ObfuscatedName("i.d")
    public static int[] field381 = new int[1000];

    @ObfuscatedName("i.r")
    public static String[] field377 = new String[1000];

    @ObfuscatedName("i.k")
    public static int field384 = 0;

    @ObfuscatedName("i.u")
    public static class18[] field379 = new class18[50];

    @ObfuscatedName("i.s")
    public static Calendar field378 = Calendar.getInstance();

    @ObfuscatedName("i.b")
    public static final String[] field386 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.f(Lf;I)V")
    public static void method2441(class1 arg0) {
        Object[] var1 = arg0.field8;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method733(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field70;
        int[] var8 = var3.field68;
        byte var9 = -1;
        field384 = 0;
        try {
            Statics.field391 = new int[var3.field67];
            int var10 = 0;
            Statics.field387 = new String[var3.field69];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field3;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field1;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field9 == null ? -1 : arg0.field9.field2596;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field9 == null ? -1 : arg0.field9.field2599;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2596;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2599;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field2;
                    }
                    Statics.field391[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field4;
                    }
                    Statics.field387[var11++] = var14;
                }
            }
            int var15 = 0;
            label2360: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var383 = var7[var6];
                if (var383 < 100) {
                    if (var383 == 0) {
                        field381[var4++] = var8[var6];
                        continue;
                    }
                    if (var383 == 1) {
                        int var16 = var8[var6];
                        field381[var4++] = class160.field2717[var16];
                        continue;
                    }
                    if (var383 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class160.field2717[var17] = field381[var4];
                        client.method5(var17);
                        continue;
                    }
                    if (var383 == 3) {
                        field377[var5++] = var3.field71[var6];
                        continue;
                    }
                    if (var383 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var383 == 7) {
                        var4 -= 2;
                        if (field381[var4 + 1] != field381[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var383 == 8) {
                        var4 -= 2;
                        if (field381[var4 + 1] == field381[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var383 == 9) {
                        var4 -= 2;
                        if (field381[var4] < field381[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var383 == 10) {
                        var4 -= 2;
                        if (field381[var4] > field381[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var383 == 21) {
                        if (field384 == 0) {
                            return;
                        }
                        class18 var18 = field379[--field384];
                        var3 = var18.field260;
                        var7 = var3.field70;
                        var8 = var3.field68;
                        var6 = var18.field257;
                        Statics.field391 = var18.field258;
                        Statics.field387 = var18.field259;
                        continue;
                    }
                    if (var383 == 25) {
                        int var19 = var8[var6];
                        field381[var4++] = class160.method315(var19);
                        continue;
                    }
                    if (var383 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class160.method35(var20, field381[var4]);
                        continue;
                    }
                    if (var383 == 31) {
                        var4 -= 2;
                        if (field381[var4] <= field381[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var383 == 32) {
                        var4 -= 2;
                        if (field381[var4] >= field381[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var383 == 33) {
                        field381[var4++] = Statics.field391[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var383 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field391[var10001] = field381[var4];
                        continue;
                    }
                    if (var383 == 35) {
                        field377[var5++] = Statics.field387[var8[var6]];
                        continue;
                    }
                    if (var383 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field387[var10001] = field377[var5];
                        continue;
                    }
                    if (var383 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String var22 = class148.method1435(field377, var5, var21);
                        field377[var5++] = var22;
                        continue;
                    }
                    if (var383 == 38) {
                        var4--;
                        continue;
                    }
                    if (var383 == 39) {
                        var5--;
                        continue;
                    }
                    if (var383 == 40) {
                        int var23 = var8[var6];
                        class5 var24 = class5.method733(var23);
                        int[] var25 = new int[var24.field67];
                        String[] var26 = new String[var24.field69];
                        for (int var27 = 0; var27 < var24.field73; var27++) {
                            var25[var27] = field381[var4 - var24.field73 + var27];
                        }
                        for (int var28 = 0; var28 < var24.field74; var28++) {
                            var26[var28] = field377[var5 - var24.field74 + var28];
                        }
                        var4 -= var24.field73;
                        var5 -= var24.field74;
                        class18 var29 = new class18();
                        var29.field260 = var3;
                        var29.field257 = var6;
                        var29.field258 = Statics.field391;
                        var29.field259 = Statics.field387;
                        field379[++field384 - 1] = var29;
                        var3 = var24;
                        var7 = var24.field70;
                        var8 = var24.field68;
                        var6 = -1;
                        Statics.field391 = var25;
                        Statics.field387 = var26;
                        continue;
                    }
                    if (var383 == 42) {
                        field381[var4++] = client.field653[var8[var6]];
                        continue;
                    }
                    if (var383 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field653[var10001] = field381[var4];
                        continue;
                    }
                    if (var383 == 44) {
                        int var30 = var8[var6] >> 16;
                        int var31 = var8[var6] & 0xFFFF;
                        var4--;
                        int var32 = field381[var4];
                        if (var32 >= 0 && var32 <= 5000) {
                            field376[var30] = var32;
                            byte var33 = -1;
                            if (var31 == 105) {
                                var33 = 0;
                            }
                            int var34 = 0;
                            while (true) {
                                if (var34 >= var32) {
                                    continue label2360;
                                }
                                field380[var30][var34] = var33;
                                var34++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var383 == 45) {
                        int var35 = var8[var6];
                        var4--;
                        int var36 = field381[var4];
                        if (var36 >= 0 && var36 < field376[var35]) {
                            field381[var4++] = field380[var35][var36];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var383 == 46) {
                        int var37 = var8[var6];
                        var4 -= 2;
                        int var38 = field381[var4];
                        if (var38 >= 0 && var38 < field376[var37]) {
                            field380[var37][var38] = field381[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var383 == 47) {
                        String var39 = client.field654[var8[var6]];
                        if (var39 == null) {
                            var39 = "null";
                        }
                        field377[var5++] = var39;
                        continue;
                    }
                    if (var383 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field654[var10001] = field377[var5];
                        continue;
                    }
                }
                boolean var40;
                if (var8[var6] == 1) {
                    var40 = true;
                } else {
                    var40 = false;
                }
                if (var383 < 1000) {
                    if (var383 == 100) {
                        var4 -= 3;
                        int var41 = field381[var4];
                        int var42 = field381[var4 + 1];
                        int var43 = field381[var4 + 2];
                        if (var42 == 0) {
                            throw new RuntimeException();
                        }
                        class159 var44 = class159.method2754(var41);
                        if (var44.field2633 == null) {
                            var44.field2633 = new class159[var43 + 1];
                        }
                        if (var44.field2633.length <= var43) {
                            class159[] var45 = new class159[var43 + 1];
                            for (int var46 = 0; var46 < var44.field2633.length; var46++) {
                                var45[var46] = var44.field2633[var46];
                            }
                            var44.field2633 = var45;
                        }
                        if (var43 > 0 && var44.field2633[var43 - 1] == null) {
                            throw new RuntimeException("" + (var43 - 1));
                        }
                        class159 var47 = new class159();
                        var47.field2600 = var42;
                        var47.field2704 = var47.field2596 = var44.field2596;
                        var47.field2599 = var43;
                        var47.field2597 = true;
                        var44.field2633[var43] = var47;
                        if (var40) {
                            Statics.field227 = var47;
                        } else {
                            Statics.field385 = var47;
                        }
                        client.method640(var44);
                        continue;
                    }
                    if (var383 == 101) {
                        class159 var48 = var40 ? Statics.field227 : Statics.field385;
                        class159 var49 = class159.method2754(var48.field2596);
                        var49.field2633[var48.field2599] = null;
                        client.method640(var49);
                        continue;
                    }
                    if (var383 == 102) {
                        var4--;
                        class159 var50 = class159.method2754(field381[var4]);
                        var50.field2633 = null;
                        client.method640(var50);
                        continue;
                    }
                    if (var383 == 200) {
                        var4 -= 2;
                        int var51 = field381[var4];
                        int var52 = field381[var4 + 1];
                        class159 var53 = Statics.method606(var51, var52);
                        if (var53 != null && var52 != -1) {
                            field381[var4++] = 1;
                            if (var40) {
                                Statics.field227 = var53;
                            } else {
                                Statics.field385 = var53;
                            }
                            continue;
                        }
                        field381[var4++] = 0;
                        continue;
                    }
                } else if (var383 >= 1000 && var383 < 1100 || var383 >= 2000 && var383 < 2100) {
                    class159 var54;
                    if (var383 >= 2000) {
                        var383 -= 1000;
                        var4--;
                        var54 = class159.method2754(field381[var4]);
                    } else {
                        var54 = var40 ? Statics.field227 : Statics.field385;
                    }
                    if (var383 == 1000) {
                        var4 -= 2;
                        var54.field2667 = field381[var4];
                        var54.field2668 = field381[var4 + 1];
                        client.method640(var54);
                        continue;
                    }
                    if (var383 == 1001) {
                        var4 -= 2;
                        var54.field2607 = field381[var4];
                        var54.field2608 = field381[var4 + 1];
                        client.method640(var54);
                        continue;
                    }
                    if (var383 == 1003) {
                        var4--;
                        boolean var55 = field381[var4] == 1;
                        if (var54.field2705 != var55) {
                            var54.field2705 = var55;
                            client.method640(var54);
                        }
                        continue;
                    }
                } else if (!(var383 < 1100 || var383 >= 1200) || !(var383 < 2100 || var383 >= 2200)) {
                    class159 var56;
                    if (var383 >= 2000) {
                        var383 -= 1000;
                        var4--;
                        var56 = class159.method2754(field381[var4]);
                    } else {
                        var56 = var40 ? Statics.field227 : Statics.field385;
                    }
                    if (var383 == 1100) {
                        var4 -= 2;
                        var56.field2611 = field381[var4];
                        if (var56.field2611 > var56.field2613 - var56.field2607) {
                            var56.field2611 = var56.field2613 - var56.field2607;
                        }
                        if (var56.field2611 < 0) {
                            var56.field2611 = 0;
                        }
                        var56.field2612 = field381[var4 + 1];
                        if (var56.field2612 > var56.field2614 - var56.field2608) {
                            var56.field2612 = var56.field2614 - var56.field2608;
                        }
                        if (var56.field2612 < 0) {
                            var56.field2612 = 0;
                        }
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1101) {
                        var4--;
                        var56.field2615 = field381[var4];
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1102) {
                        var4--;
                        var56.field2619 = field381[var4] == 1;
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1103) {
                        var4--;
                        var56.field2620 = field381[var4];
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1104) {
                        var4--;
                        var56.field2651 = field381[var4];
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1105) {
                        var4--;
                        var56.field2622 = field381[var4];
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1106) {
                        var4--;
                        var56.field2624 = field381[var4];
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1107) {
                        var4--;
                        var56.field2625 = field381[var4] == 1;
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1108) {
                        var56.field2610 = 1;
                        var4--;
                        var56.field2631 = field381[var4];
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1109) {
                        var4 -= 6;
                        var56.field2636 = field381[var4];
                        var56.field2637 = field381[var4 + 1];
                        var56.field2638 = field381[var4 + 2];
                        var56.field2639 = field381[var4 + 3];
                        var56.field2640 = field381[var4 + 4];
                        var56.field2641 = field381[var4 + 5];
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1110) {
                        var4--;
                        int var57 = field381[var4];
                        if (var56.field2634 != var57) {
                            var56.field2634 = var57;
                            var56.field2591 = 0;
                            var56.field2628 = 0;
                            client.method640(var56);
                        }
                        continue;
                    }
                    if (var383 == 1111) {
                        var4--;
                        var56.field2643 = field381[var4] == 1;
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1112) {
                        var5--;
                        String var58 = field377[var5];
                        if (!var58.equals(var56.field2645)) {
                            var56.field2645 = var58;
                            client.method640(var56);
                        }
                        continue;
                    }
                    if (var383 == 1113) {
                        var4--;
                        var56.field2618 = field381[var4];
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1114) {
                        var4 -= 3;
                        var56.field2648 = field381[var4];
                        var56.field2649 = field381[var4 + 1];
                        var56.field2647 = field381[var4 + 2];
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1115) {
                        var4--;
                        var56.field2650 = field381[var4] == 1;
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1116) {
                        var4--;
                        var56.field2626 = field381[var4];
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1117) {
                        var4--;
                        var56.field2627 = field381[var4];
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1118) {
                        var4--;
                        var56.field2632 = field381[var4] == 1;
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1119) {
                        var4--;
                        var56.field2670 = field381[var4] == 1;
                        client.method640(var56);
                        continue;
                    }
                    if (var383 == 1120) {
                        var4 -= 2;
                        var56.field2613 = field381[var4];
                        var56.field2614 = field381[var4 + 1];
                        client.method640(var56);
                        continue;
                    }
                } else if (var383 >= 1200 && var383 < 1300 || var383 >= 2200 && var383 < 2300) {
                    class159 var59;
                    if (var383 >= 2000) {
                        var383 -= 1000;
                        var4--;
                        var59 = class159.method2754(field381[var4]);
                    } else {
                        var59 = var40 ? Statics.field227 : Statics.field385;
                    }
                    client.method640(var59);
                    if (var383 == 1200) {
                        var4 -= 2;
                        int var60 = field381[var4];
                        int var61 = field381[var4 + 1];
                        var59.field2702 = var60;
                        var59.field2703 = var61;
                        class40 var62 = class40.method1433(var60);
                        var59.field2638 = var62.field983;
                        var59.field2639 = var62.field981;
                        var59.field2640 = var62.field1003;
                        var59.field2636 = var62.field1012;
                        var59.field2637 = var62.field984;
                        var59.field2641 = var62.field979;
                        if (var59.field2607 > 0) {
                            var59.field2641 = var59.field2641 * 32 / var59.field2607;
                        }
                        continue;
                    }
                    if (var383 == 1201) {
                        var59.field2610 = 2;
                        var4--;
                        var59.field2631 = field381[var4];
                        continue;
                    }
                    if (var383 == 1202) {
                        var59.field2610 = 3;
                        var59.field2631 = Statics.field1424.field48.method3236();
                        continue;
                    }
                } else if ((var383 < 1300 || var383 >= 1400) && (var383 < 2300 || var383 >= 2400)) {
                    if (var383 >= 1400 && var383 < 1500 || var383 >= 2400 && var383 < 2500) {
                        class159 var67;
                        if (var383 >= 2000) {
                            var383 -= 1000;
                            var4--;
                            var67 = class159.method2754(field381[var4]);
                        } else {
                            var67 = var40 ? Statics.field227 : Statics.field385;
                        }
                        var5--;
                        String var68 = field377[var5];
                        int[] var69 = null;
                        if (var68.length() > 0 && var68.charAt(var68.length() - 1) == 'Y') {
                            var4--;
                            int var70 = field381[var4];
                            if (var70 > 0) {
                                var69 = new int[var70];
                                while (var70-- > 0) {
                                    var4--;
                                    var69[var70] = field381[var4];
                                }
                            }
                            var68 = var68.substring(0, var68.length() - 1);
                        }
                        Object[] var71 = new Object[var68.length() + 1];
                        for (int var72 = var71.length - 1; var72 >= 1; var72--) {
                            if (var68.charAt(var72 - 1) == 's') {
                                var5--;
                                var71[var72] = field377[var5];
                            } else {
                                var4--;
                                var71[var72] = Integer.valueOf(field381[var4]);
                            }
                        }
                        var4--;
                        int var73 = field381[var4];
                        if (var73 == -1) {
                            var71 = null;
                        } else {
                            var71[0] = Integer.valueOf(var73);
                        }
                        if (var383 == 1400) {
                            var67.field2669 = var71;
                        }
                        if (var383 == 1401) {
                            var67.field2710 = var71;
                        }
                        if (var383 == 1402) {
                            var67.field2682 = var71;
                        }
                        if (var383 == 1403) {
                            var67.field2671 = var71;
                        }
                        if (var383 == 1404) {
                            var67.field2673 = var71;
                        }
                        if (var383 == 1405) {
                            var67.field2674 = var71;
                        }
                        if (var383 == 1406) {
                            var67.field2677 = var71;
                        }
                        if (var383 == 1407) {
                            var67.field2678 = var71;
                            var67.field2679 = var69;
                        }
                        if (var383 == 1408) {
                            var67.field2684 = var71;
                        }
                        if (var383 == 1409) {
                            var67.field2685 = var71;
                        }
                        if (var383 == 1410) {
                            var67.field2675 = var71;
                        }
                        if (var383 == 1411) {
                            var67.field2598 = var71;
                        }
                        if (var383 == 1412) {
                            var67.field2672 = var71;
                        }
                        if (var383 == 1414) {
                            var67.field2680 = var71;
                            var67.field2589 = var69;
                        }
                        if (var383 == 1415) {
                            var67.field2604 = var71;
                            var67.field2683 = var69;
                        }
                        if (var383 == 1416) {
                            var67.field2676 = var71;
                        }
                        if (var383 == 1417) {
                            var67.field2587 = var71;
                        }
                        if (var383 == 1418) {
                            var67.field2644 = var71;
                        }
                        if (var383 == 1419) {
                            var67.field2688 = var71;
                        }
                        if (var383 == 1420) {
                            var67.field2689 = var71;
                        }
                        if (var383 == 1421) {
                            var67.field2690 = var71;
                        }
                        if (var383 == 1422) {
                            var67.field2691 = var71;
                        }
                        if (var383 == 1423) {
                            var67.field2686 = var71;
                        }
                        if (var383 == 1424) {
                            var67.field2606 = var71;
                        }
                        var67.field2665 = true;
                        continue;
                    }
                    if (var383 < 1600) {
                        class159 var74 = var40 ? Statics.field227 : Statics.field385;
                        if (var383 == 1500) {
                            field381[var4++] = var74.field2667;
                            continue;
                        }
                        if (var383 == 1501) {
                            field381[var4++] = var74.field2668;
                            continue;
                        }
                        if (var383 == 1502) {
                            field381[var4++] = var74.field2607;
                            continue;
                        }
                        if (var383 == 1503) {
                            field381[var4++] = var74.field2608;
                            continue;
                        }
                        if (var383 == 1504) {
                            field381[var4++] = var74.field2705 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 1505) {
                            field381[var4++] = var74.field2704;
                            continue;
                        }
                    } else if (var383 < 1700) {
                        class159 var75 = var40 ? Statics.field227 : Statics.field385;
                        if (var383 == 1600) {
                            field381[var4++] = var75.field2611;
                            continue;
                        }
                        if (var383 == 1601) {
                            field381[var4++] = var75.field2612;
                            continue;
                        }
                        if (var383 == 1602) {
                            field377[var5++] = var75.field2645;
                            continue;
                        }
                        if (var383 == 1603) {
                            field381[var4++] = var75.field2613;
                            continue;
                        }
                        if (var383 == 1604) {
                            field381[var4++] = var75.field2614;
                            continue;
                        }
                        if (var383 == 1605) {
                            field381[var4++] = var75.field2641;
                            continue;
                        }
                        if (var383 == 1606) {
                            field381[var4++] = var75.field2638;
                            continue;
                        }
                        if (var383 == 1607) {
                            field381[var4++] = var75.field2640;
                            continue;
                        }
                        if (var383 == 1608) {
                            field381[var4++] = var75.field2639;
                            continue;
                        }
                    } else if (var383 < 1800) {
                        class159 var76 = var40 ? Statics.field227 : Statics.field385;
                        if (var383 == 1700) {
                            field381[var4++] = var76.field2702;
                            continue;
                        }
                        if (var383 == 1701) {
                            if (var76.field2702 == -1) {
                                field381[var4++] = 0;
                            } else {
                                field381[var4++] = var76.field2703;
                            }
                            continue;
                        }
                        if (var383 == 1702) {
                            field381[var4++] = var76.field2599;
                            continue;
                        }
                    } else if (var383 < 1900) {
                        class159 var77 = var40 ? Statics.field227 : Statics.field385;
                        if (var383 == 1800) {
                            field381[var4++] = class163.method168(client.method544(var77));
                            continue;
                        }
                        if (var383 == 1801) {
                            var4--;
                            int var78 = field381[var4];
                            int var384 = var78 - 1;
                            if (var77.field2659 != null && var384 < var77.field2659.length && var77.field2659[var384] != null) {
                                field377[var5++] = var77.field2659[var384];
                                continue;
                            }
                            field377[var5++] = "";
                            continue;
                        }
                        if (var383 == 1802) {
                            if (var77.field2658 == null) {
                                field377[var5++] = "";
                            } else {
                                field377[var5++] = var77.field2658;
                            }
                            continue;
                        }
                    } else if (var383 < 2600) {
                        var4--;
                        class159 var79 = class159.method2754(field381[var4]);
                        if (var383 == 2500) {
                            field381[var4++] = var79.field2667;
                            continue;
                        }
                        if (var383 == 2501) {
                            field381[var4++] = var79.field2668;
                            continue;
                        }
                        if (var383 == 2502) {
                            field381[var4++] = var79.field2607;
                            continue;
                        }
                        if (var383 == 2503) {
                            field381[var4++] = var79.field2608;
                            continue;
                        }
                        if (var383 == 2504) {
                            field381[var4++] = var79.field2705 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 2505) {
                            field381[var4++] = var79.field2704;
                            continue;
                        }
                    } else if (var383 < 2700) {
                        var4--;
                        class159 var80 = class159.method2754(field381[var4]);
                        if (var383 == 2600) {
                            field381[var4++] = var80.field2611;
                            continue;
                        }
                        if (var383 == 2601) {
                            field381[var4++] = var80.field2612;
                            continue;
                        }
                        if (var383 == 2602) {
                            field377[var5++] = var80.field2645;
                            continue;
                        }
                        if (var383 == 2603) {
                            field381[var4++] = var80.field2613;
                            continue;
                        }
                        if (var383 == 2604) {
                            field381[var4++] = var80.field2614;
                            continue;
                        }
                        if (var383 == 2605) {
                            field381[var4++] = var80.field2641;
                            continue;
                        }
                        if (var383 == 2606) {
                            field381[var4++] = var80.field2638;
                            continue;
                        }
                        if (var383 == 2607) {
                            field381[var4++] = var80.field2640;
                            continue;
                        }
                        if (var383 == 2608) {
                            field381[var4++] = var80.field2639;
                            continue;
                        }
                    } else if (var383 < 2800) {
                        if (var383 == 2700) {
                            var4--;
                            class159 var81 = class159.method2754(field381[var4]);
                            field381[var4++] = var81.field2702;
                            continue;
                        }
                        if (var383 == 2701) {
                            var4--;
                            class159 var82 = class159.method2754(field381[var4]);
                            if (var82.field2702 == -1) {
                                field381[var4++] = 0;
                            } else {
                                field381[var4++] = var82.field2703;
                            }
                            continue;
                        }
                        if (var383 == 2702) {
                            var4--;
                            int var83 = field381[var4];
                            class4 var84 = (class4) client.field620.method3312((long) var83);
                            if (var84 == null) {
                                field381[var4++] = 0;
                            } else {
                                field381[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var383 < 2900) {
                        var4--;
                        class159 var85 = class159.method2754(field381[var4]);
                        if (var383 == 2800) {
                            field381[var4++] = class163.method168(client.method544(var85));
                            continue;
                        }
                        if (var383 == 2801) {
                            var4--;
                            int var86 = field381[var4];
                            int var385 = var86 - 1;
                            if (var85.field2659 != null && var385 < var85.field2659.length && var85.field2659[var385] != null) {
                                field377[var5++] = var85.field2659[var385];
                                continue;
                            }
                            field377[var5++] = "";
                            continue;
                        }
                        if (var383 == 2802) {
                            if (var85.field2658 == null) {
                                field377[var5++] = "";
                            } else {
                                field377[var5++] = var85.field2658;
                            }
                            continue;
                        }
                    } else if (var383 < 3200) {
                        if (var383 == 3100) {
                            var5--;
                            String var87 = field377[var5];
                            client.method731(0, "", var87);
                            continue;
                        }
                        if (var383 == 3101) {
                            var4 -= 2;
                            client.method1873(Statics.field1424, field381[var4], field381[var4 + 1]);
                            continue;
                        }
                        if (var383 == 3103) {
                            client.field694.method2316(206);
                            for (class4 var88 = (class4) client.field620.method3315(); var88 != null; var88 = (class4) client.field620.method3316()) {
                                if (var88.field57 == 0 || var88.field57 == 3) {
                                    client.method2218(var88, true);
                                }
                            }
                            if (client.field712 != null) {
                                client.method640(client.field712);
                                client.field712 = null;
                            }
                            continue;
                        }
                        if (var383 == 3104) {
                            var5--;
                            String var89 = field377[var5];
                            int var90 = 0;
                            boolean var91 = class148.method14(var89, 10, true);
                            if (var91) {
                                var90 = class148.method24(var89);
                            }
                            client.field694.method2316(48);
                            client.field694.method2447(var90);
                            continue;
                        }
                        if (var383 == 3105) {
                            var5--;
                            String var92 = field377[var5];
                            client.field694.method2316(123);
                            client.field694.method2536(var92.length() + 1);
                            client.field694.method2449(var92);
                            continue;
                        }
                        if (var383 == 3106) {
                            var5--;
                            String var93 = field377[var5];
                            client.field694.method2316(68);
                            client.field694.method2536(var93.length() + 1);
                            client.field694.method2449(var93);
                            continue;
                        }
                        if (var383 == 3107) {
                            var4--;
                            int var94 = field381[var4];
                            var5--;
                            String var95 = field377[var5];
                            boolean var96 = false;
                            for (int var97 = 0; var97 < client.field483; var97++) {
                                class3 var98 = client.field499[client.field514[var97]];
                                if (var98 != null && var98.field45 != null && var98.field45.equalsIgnoreCase(var95)) {
                                    if (var94 == 1) {
                                        client.field694.method2316(99);
                                        client.field694.method2499(client.field514[var97]);
                                    } else if (var94 == 4) {
                                        client.field694.method2316(88);
                                        client.field694.method2487(client.field514[var97]);
                                    } else if (var94 == 6) {
                                        client.field694.method2316(209);
                                        client.field694.method2563(client.field514[var97]);
                                    } else if (var94 == 7) {
                                        client.field694.method2316(198);
                                        client.field694.method2499(client.field514[var97]);
                                    }
                                    var96 = true;
                                    break;
                                }
                            }
                            if (!var96) {
                                client.method731(0, "", class135.field2230 + var95);
                            }
                            continue;
                        }
                        if (var383 == 3108) {
                            var4 -= 3;
                            int var99 = field381[var4];
                            int var100 = field381[var4 + 1];
                            int var101 = field381[var4 + 2];
                            class159 var102 = class159.method2754(var101);
                            client.method130(var102, var99, var100);
                            continue;
                        }
                        if (var383 == 3109) {
                            var4 -= 2;
                            int var103 = field381[var4];
                            int var104 = field381[var4 + 1];
                            class159 var105 = var40 ? Statics.field227 : Statics.field385;
                            client.method130(var105, var103, var104);
                            continue;
                        }
                    } else if (var383 < 3300) {
                        if (var383 == 3200) {
                            var4 -= 3;
                            client.method2055(field381[var4], field381[var4 + 1], field381[var4 + 2]);
                            continue;
                        }
                        if (var383 == 3201) {
                            var4--;
                            client.method2219(field381[var4]);
                            continue;
                        }
                        if (var383 == 3202) {
                            var4 -= 2;
                            client.method2427(field381[var4], field381[var4 + 1]);
                            continue;
                        }
                    } else if (var383 < 3400) {
                        if (var383 == 3300) {
                            field381[var4++] = client.field484;
                            continue;
                        }
                        if (var383 == 3301) {
                            var4 -= 2;
                            int var106 = field381[var4];
                            int var107 = field381[var4 + 1];
                            int[] var108 = field381;
                            int var109 = var4++;
                            class19 var110 = (class19) class19.field270.method3312((long) var106);
                            int var111;
                            if (var110 == null) {
                                var111 = -1;
                            } else if (var107 >= 0 && var107 < var110.field269.length) {
                                var111 = var110.field269[var107];
                            } else {
                                var111 = -1;
                            }
                            var108[var109] = var111;
                            continue;
                        }
                        if (var383 == 3302) {
                            var4 -= 2;
                            int var112 = field381[var4];
                            int var113 = field381[var4 + 1];
                            int[] var114 = field381;
                            int var115 = var4++;
                            class19 var116 = (class19) class19.field270.method3312((long) var112);
                            int var117;
                            if (var116 == null) {
                                var117 = 0;
                            } else if (var113 >= 0 && var113 < var116.field273.length) {
                                var117 = var116.field273[var113];
                            } else {
                                var117 = 0;
                            }
                            var114[var115] = var117;
                            continue;
                        }
                        if (var383 == 3303) {
                            var4 -= 2;
                            int var118 = field381[var4];
                            int var119 = field381[var4 + 1];
                            field381[var4++] = class19.method1695(var118, var119);
                            continue;
                        }
                        if (var383 == 3304) {
                            var4--;
                            int var120 = field381[var4];
                            field381[var4++] = class41.method872(var120).field1019;
                            continue;
                        }
                        if (var383 == 3305) {
                            var4--;
                            int var121 = field381[var4];
                            field381[var4++] = client.field597[var121];
                            continue;
                        }
                        if (var383 == 3306) {
                            var4--;
                            int var122 = field381[var4];
                            field381[var4++] = client.field492[var122];
                            continue;
                        }
                        if (var383 == 3307) {
                            var4--;
                            int var123 = field381[var4];
                            field381[var4++] = client.field599[var123];
                            continue;
                        }
                        if (var383 == 3308) {
                            int var124 = Statics.field363;
                            int var125 = (Statics.field1424.field401 >> 7) + Statics.field10;
                            int var126 = (Statics.field1424.field414 >> 7) + Statics.field289;
                            field381[var4++] = (var124 << 28) + (var125 << 14) + var126;
                            continue;
                        }
                        if (var383 == 3309) {
                            var4--;
                            int var127 = field381[var4];
                            field381[var4++] = var127 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var383 == 3310) {
                            var4--;
                            int var128 = field381[var4];
                            field381[var4++] = var128 >> 28;
                            continue;
                        }
                        if (var383 == 3311) {
                            var4--;
                            int var129 = field381[var4];
                            field381[var4++] = var129 & 0x3FFF;
                            continue;
                        }
                        if (var383 == 3312) {
                            field381[var4++] = client.field618 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 3313) {
                            var4 -= 2;
                            int var130 = field381[var4] + 32768;
                            int var131 = field381[var4 + 1];
                            int[] var132 = field381;
                            int var133 = var4++;
                            class19 var134 = (class19) class19.field270.method3312((long) var130);
                            int var135;
                            if (var134 == null) {
                                var135 = -1;
                            } else if (var131 >= 0 && var131 < var134.field269.length) {
                                var135 = var134.field269[var131];
                            } else {
                                var135 = -1;
                            }
                            var132[var133] = var135;
                            continue;
                        }
                        if (var383 == 3314) {
                            var4 -= 2;
                            int var136 = field381[var4] + 32768;
                            int var137 = field381[var4 + 1];
                            int[] var138 = field381;
                            int var139 = var4++;
                            class19 var140 = (class19) class19.field270.method3312((long) var136);
                            int var141;
                            if (var140 == null) {
                                var141 = 0;
                            } else if (var137 >= 0 && var137 < var140.field273.length) {
                                var141 = var140.field273[var137];
                            } else {
                                var141 = 0;
                            }
                            var138[var139] = var141;
                            continue;
                        }
                        if (var383 == 3315) {
                            var4 -= 2;
                            int var142 = field381[var4] + 32768;
                            int var143 = field381[var4 + 1];
                            field381[var4++] = class19.method1695(var142, var143);
                            continue;
                        }
                        if (var383 == 3316) {
                            if (client.field626 >= 2) {
                                field381[var4++] = client.field626;
                            } else {
                                field381[var4++] = 0;
                            }
                            continue;
                        }
                        if (var383 == 3317) {
                            field381[var4++] = client.field567;
                            continue;
                        }
                        if (var383 == 3318) {
                            field381[var4++] = client.field638;
                            continue;
                        }
                        if (var383 == 3321) {
                            field381[var4++] = client.field624;
                            continue;
                        }
                        if (var383 == 3322) {
                            field381[var4++] = client.field474;
                            continue;
                        }
                        if (var383 == 3323) {
                            if (client.field553) {
                                field381[var4++] = 1;
                            } else {
                                field381[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var383 < 3500) {
                        if (var383 == 3400) {
                            var4 -= 2;
                            int var144 = field381[var4];
                            int var145 = field381[var4 + 1];
                            class39 var146 = class39.method1150(var144);
                            if (var146.field953 != 's') {
                            }
                            for (int var147 = 0; var147 < var146.field959; var147++) {
                                if (var146.field956[var147] == var145) {
                                    field377[var5++] = var146.field962[var147];
                                    var146 = null;
                                    break;
                                }
                            }
                            if (var146 != null) {
                                field377[var5++] = var146.field957;
                            }
                            continue;
                        }
                        if (var383 == 3408) {
                            var4 -= 4;
                            int var148 = field381[var4];
                            int var149 = field381[var4 + 1];
                            int var150 = field381[var4 + 2];
                            int var151 = field381[var4 + 3];
                            class39 var152 = class39.method1150(var150);
                            if (var152.field954 == var148 && var152.field953 == var149) {
                                for (int var153 = 0; var153 < var152.field959; var153++) {
                                    if (var152.field956[var153] == var151) {
                                        if (var149 == 115) {
                                            field377[var5++] = var152.field962[var153];
                                        } else {
                                            field381[var4++] = var152.field961[var153];
                                        }
                                        var152 = null;
                                        break;
                                    }
                                }
                                if (var152 != null) {
                                    if (var149 == 115) {
                                        field377[var5++] = var152.field957;
                                    } else {
                                        field381[var4++] = var152.field958;
                                    }
                                }
                                continue;
                            }
                            if (var149 == 115) {
                                field377[var5++] = "null";
                            } else {
                                field381[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var383 < 3700) {
                        if (var383 == 3600) {
                            if (client.field607 == 0) {
                                field381[var4++] = -2;
                            } else if (client.field607 == 1) {
                                field381[var4++] = -1;
                            } else {
                                field381[var4++] = client.field711;
                            }
                            continue;
                        }
                        if (var383 == 3601) {
                            var4--;
                            int var154 = field381[var4];
                            if (client.field607 == 2 && var154 < client.field711) {
                                field377[var5++] = client.field713[var154].field350;
                                continue;
                            }
                            field377[var5++] = "";
                            continue;
                        }
                        if (var383 == 3602) {
                            var4--;
                            int var155 = field381[var4];
                            if (client.field607 == 2 && var155 < client.field711) {
                                field381[var4++] = client.field713[var155].field352;
                                continue;
                            }
                            field381[var4++] = 0;
                            continue;
                        }
                        if (var383 == 3603) {
                            var4--;
                            int var156 = field381[var4];
                            if (client.field607 == 2 && var156 < client.field711) {
                                field381[var4++] = client.field713[var156].field351;
                                continue;
                            }
                            field381[var4++] = 0;
                            continue;
                        }
                        if (var383 == 3604) {
                            var5--;
                            String var157 = field377[var5];
                            var4--;
                            int var158 = field381[var4];
                            client.method597(var157, var158);
                            continue;
                        }
                        if (var383 == 3605) {
                            var5--;
                            String var159 = field377[var5];
                            client.method127(var159);
                            continue;
                        }
                        if (var383 == 3606) {
                            var5--;
                            String var160 = field377[var5];
                            if (var160 == null) {
                                continue;
                            }
                            String var161 = class149.method2738(var160, Statics.field2474);
                            if (var161 == null) {
                                continue;
                            }
                            int var162 = 0;
                            while (true) {
                                if (var162 >= client.field711) {
                                    continue label2360;
                                }
                                class23 var163 = client.field713[var162];
                                String var164 = var163.field350;
                                String var165 = class149.method2738(var164, Statics.field2474);
                                boolean var166;
                                if (var160 == null || var164 == null) {
                                    var166 = false;
                                } else if (var160.startsWith("#") || var164.startsWith("#")) {
                                    var166 = var160.equals(var164);
                                } else {
                                    var166 = var161.equals(var165);
                                }
                                if (var166) {
                                    client.field711--;
                                    for (int var167 = var162; var167 < client.field711; var167++) {
                                        client.field713[var167] = client.field713[var167 + 1];
                                    }
                                    client.field685 = client.field642;
                                    client.field694.method2316(131);
                                    class116 var168 = client.field694;
                                    int var169 = var160.length() + 1;
                                    var168.method2536(var169);
                                    client.field694.method2449(var160);
                                    continue label2360;
                                }
                                var162++;
                            }
                        }
                        if (var383 == 3607) {
                            var5--;
                            String var170 = field377[var5];
                            if (var170 == null) {
                                continue;
                            }
                            if ((client.field715 < 100 || client.field491 == 1) && client.field715 < 400) {
                                String var171 = class149.method2738(var170, Statics.field2474);
                                if (var171 == null) {
                                    continue;
                                }
                                for (int var172 = 0; var172 < client.field715; var172++) {
                                    class11 var173 = client.field716[var172];
                                    String var174 = class149.method2738(var173.field174, Statics.field2474);
                                    if (var174 != null && var174.equals(var171)) {
                                        client.method731(0, "", var170 + class135.field2250);
                                        continue label2360;
                                    }
                                    if (var173.field168 != null) {
                                        String var175 = class149.method2738(var173.field168, Statics.field2474);
                                        if (var175 != null && var175.equals(var171)) {
                                            client.method731(0, "", var170 + class135.field2250);
                                            continue label2360;
                                        }
                                    }
                                }
                                for (int var176 = 0; var176 < client.field711; var176++) {
                                    class23 var177 = client.field713[var176];
                                    String var178 = class149.method2738(var177.field350, Statics.field2474);
                                    if (var178 != null && var178.equals(var171)) {
                                        client.method731(0, "", class135.field2228 + var170 + class135.field2256);
                                        continue label2360;
                                    }
                                    if (var177.field349 != null) {
                                        String var179 = class149.method2738(var177.field349, Statics.field2474);
                                        if (var179 != null && var179.equals(var171)) {
                                            client.method731(0, "", class135.field2228 + var170 + class135.field2256);
                                            continue label2360;
                                        }
                                    }
                                }
                                if (class149.method2738(Statics.field1424.field45, Statics.field2474).equals(var171)) {
                                    client.method731(0, "", class135.field2208);
                                } else {
                                    client.field694.method2316(71);
                                    class116 var180 = client.field694;
                                    int var181 = var170.length() + 1;
                                    var180.method2536(var181);
                                    client.field694.method2449(var170);
                                }
                                continue;
                            }
                            client.method731(0, "", class135.field2321);
                            continue;
                        }
                        if (var383 == 3608) {
                            var5--;
                            String var182 = field377[var5];
                            client.method20(var182);
                            continue;
                        }
                        if (var383 == 3609) {
                            var5--;
                            String var183 = field377[var5];
                            if (var183.startsWith(class2.method692(0)) || var183.startsWith(class2.method692(1))) {
                                var183 = var183.substring(7);
                            }
                            int[] var184 = field381;
                            int var185 = var4++;
                            boolean var186;
                            if (var183 == null) {
                                var186 = false;
                            } else {
                                String var187 = class149.method2738(var183, Statics.field2474);
                                int var188 = 0;
                                while (true) {
                                    if (var188 >= client.field711) {
                                        if (var183.equalsIgnoreCase(class149.method2738(Statics.field1424.field45, Statics.field2474))) {
                                            var186 = true;
                                        } else {
                                            var186 = false;
                                        }
                                        break;
                                    }
                                    if (var187.equalsIgnoreCase(class149.method2738(client.field713[var188].field350, Statics.field2474))) {
                                        var186 = true;
                                        break;
                                    }
                                    var188++;
                                }
                            }
                            var184[var185] = var186 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 3611) {
                            if (client.field684 == null) {
                                field377[var5++] = "";
                            } else {
                                String[] var189 = field377;
                                int var190 = var5++;
                                String var191 = client.field684;
                                String var192 = class147.method2739(class147.method2050(var191));
                                if (var192 == null) {
                                    var192 = "";
                                }
                                var189[var190] = var192;
                            }
                            continue;
                        }
                        if (var383 == 3612) {
                            if (client.field684 == null) {
                                field381[var4++] = 0;
                            } else {
                                field381[var4++] = Statics.field244;
                            }
                            continue;
                        }
                        if (var383 == 3613) {
                            var4--;
                            int var194 = field381[var4];
                            if (client.field684 != null && var194 < Statics.field244) {
                                field377[var5++] = Statics.field1280[var194].field108;
                                continue;
                            }
                            field377[var5++] = "";
                            continue;
                        }
                        if (var383 == 3614) {
                            var4--;
                            int var195 = field381[var4];
                            if (client.field684 != null && var195 < Statics.field244) {
                                field381[var4++] = Statics.field1280[var195].field104;
                                continue;
                            }
                            field381[var4++] = 0;
                            continue;
                        }
                        if (var383 == 3615) {
                            var4--;
                            int var196 = field381[var4];
                            if (client.field684 != null && var196 < Statics.field244) {
                                field381[var4++] = Statics.field1280[var196].field110;
                                continue;
                            }
                            field381[var4++] = 0;
                            continue;
                        }
                        if (var383 == 3616) {
                            field381[var4++] = Statics.field31;
                            continue;
                        }
                        if (var383 == 3617) {
                            var5--;
                            String var197 = field377[var5];
                            client.method2216(var197);
                            continue;
                        }
                        if (var383 == 3618) {
                            field381[var4++] = Statics.field1251;
                            continue;
                        }
                        if (var383 == 3619) {
                            var5--;
                            String var198 = field377[var5];
                            if (!var198.equals("")) {
                                client.field694.method2316(36);
                                class116 var199 = client.field694;
                                int var200 = var198.length() + 1;
                                var199.method2536(var200);
                                client.field694.method2449(var198);
                            }
                            continue;
                        }
                        if (var383 == 3620) {
                            client.method1872();
                            continue;
                        }
                        if (var383 == 3621) {
                            if (client.field607 == 0) {
                                field381[var4++] = -1;
                            } else {
                                field381[var4++] = client.field715;
                            }
                            continue;
                        }
                        if (var383 == 3622) {
                            var4--;
                            int var201 = field381[var4];
                            if (client.field607 != 0 && var201 < client.field715) {
                                field377[var5++] = client.field716[var201].field174;
                                continue;
                            }
                            field377[var5++] = "";
                            continue;
                        }
                        if (var383 == 3623) {
                            var5--;
                            String var202 = field377[var5];
                            if (var202.startsWith(class2.method692(0)) || var202.startsWith(class2.method692(1))) {
                                var202 = var202.substring(7);
                            }
                            field381[var4++] = client.method1401(var202) ? 1 : 0;
                            continue;
                        }
                        if (var383 == 3624) {
                            var4--;
                            int var203 = field381[var4];
                            if (Statics.field1280 != null && var203 < Statics.field244 && Statics.field1280[var203].field108.equalsIgnoreCase(Statics.field1424.field45)) {
                                field381[var4++] = 1;
                                continue;
                            }
                            field381[var4++] = 0;
                            continue;
                        }
                        if (var383 == 3625) {
                            if (client.field708 == null) {
                                field377[var5++] = "";
                            } else {
                                String[] var204 = field377;
                                int var205 = var5++;
                                String var206 = client.field708;
                                String var207 = class147.method2739(class147.method2050(var206));
                                if (var207 == null) {
                                    var207 = "";
                                }
                                var204[var205] = var207;
                            }
                            continue;
                        }
                    } else if (var383 < 4100) {
                        if (var383 == 4000) {
                            var4 -= 2;
                            int var209 = field381[var4];
                            int var210 = field381[var4 + 1];
                            field381[var4++] = var209 + var210;
                            continue;
                        }
                        if (var383 == 4001) {
                            var4 -= 2;
                            int var211 = field381[var4];
                            int var212 = field381[var4 + 1];
                            field381[var4++] = var211 - var212;
                            continue;
                        }
                        if (var383 == 4002) {
                            var4 -= 2;
                            int var213 = field381[var4];
                            int var214 = field381[var4 + 1];
                            field381[var4++] = var213 * var214;
                            continue;
                        }
                        if (var383 == 4003) {
                            var4 -= 2;
                            int var215 = field381[var4];
                            int var216 = field381[var4 + 1];
                            field381[var4++] = var215 / var216;
                            continue;
                        }
                        if (var383 == 4004) {
                            var4--;
                            int var217 = field381[var4];
                            field381[var4++] = (int) (Math.random() * (double) var217);
                            continue;
                        }
                        if (var383 == 4005) {
                            var4--;
                            int var218 = field381[var4];
                            field381[var4++] = (int) (Math.random() * (double) (var218 + 1));
                            continue;
                        }
                        if (var383 == 4006) {
                            var4 -= 5;
                            int var219 = field381[var4];
                            int var220 = field381[var4 + 1];
                            int var221 = field381[var4 + 2];
                            int var222 = field381[var4 + 3];
                            int var223 = field381[var4 + 4];
                            field381[var4++] = (var220 - var219) * (var223 - var221) / (var222 - var221) + var219;
                            continue;
                        }
                        if (var383 == 4007) {
                            var4 -= 2;
                            int var224 = field381[var4];
                            int var225 = field381[var4 + 1];
                            field381[var4++] = var224 * var225 / 100 + var224;
                            continue;
                        }
                        if (var383 == 4008) {
                            var4 -= 2;
                            int var226 = field381[var4];
                            int var227 = field381[var4 + 1];
                            field381[var4++] = var226 | 0x1 << var227;
                            continue;
                        }
                        if (var383 == 4009) {
                            var4 -= 2;
                            int var228 = field381[var4];
                            int var229 = field381[var4 + 1];
                            field381[var4++] = var228 & -1 - (0x1 << var229);
                            continue;
                        }
                        if (var383 == 4010) {
                            var4 -= 2;
                            int var230 = field381[var4];
                            int var231 = field381[var4 + 1];
                            field381[var4++] = (var230 & 0x1 << var231) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var383 == 4011) {
                            var4 -= 2;
                            int var232 = field381[var4];
                            int var233 = field381[var4 + 1];
                            field381[var4++] = var232 % var233;
                            continue;
                        }
                        if (var383 == 4012) {
                            var4 -= 2;
                            int var234 = field381[var4];
                            int var235 = field381[var4 + 1];
                            if (var234 == 0) {
                                field381[var4++] = 0;
                            } else {
                                field381[var4++] = (int) Math.pow((double) var234, (double) var235);
                            }
                            continue;
                        }
                        if (var383 == 4013) {
                            var4 -= 2;
                            int var236 = field381[var4];
                            int var237 = field381[var4 + 1];
                            if (var236 == 0) {
                                field381[var4++] = 0;
                            } else if (var237 == 0) {
                                field381[var4++] = Integer.MAX_VALUE;
                            } else {
                                field381[var4++] = (int) Math.pow((double) var236, 1.0D / (double) var237);
                            }
                            continue;
                        }
                        if (var383 == 4014) {
                            var4 -= 2;
                            int var238 = field381[var4];
                            int var239 = field381[var4 + 1];
                            field381[var4++] = var238 & var239;
                            continue;
                        }
                        if (var383 == 4015) {
                            var4 -= 2;
                            int var240 = field381[var4];
                            int var241 = field381[var4 + 1];
                            field381[var4++] = var240 | var241;
                            continue;
                        }
                    } else if (var383 < 4200) {
                        if (var383 == 4100) {
                            var5--;
                            String var242 = field377[var5];
                            var4--;
                            int var243 = field381[var4];
                            field377[var5++] = var242 + var243;
                            continue;
                        }
                        if (var383 == 4101) {
                            var5 -= 2;
                            String var244 = field377[var5];
                            String var245 = field377[var5 + 1];
                            field377[var5++] = var244 + var245;
                            continue;
                        }
                        if (var383 == 4102) {
                            var5--;
                            String var246 = field377[var5];
                            var4--;
                            int var247 = field381[var4];
                            field377[var5++] = var246 + class148.method546(var247, true);
                            continue;
                        }
                        if (var383 == 4103) {
                            var5--;
                            String var248 = field377[var5];
                            field377[var5++] = var248.toLowerCase();
                            continue;
                        }
                        if (var383 == 4104) {
                            var4--;
                            int var249 = field381[var4];
                            long var250 = ((long) var249 + 11745L) * 86400000L;
                            field378.setTime(new Date(var250));
                            int var252 = field378.get(5);
                            int var253 = field378.get(2);
                            int var254 = field378.get(1);
                            field377[var5++] = var252 + "-" + field386[var253] + "-" + var254;
                            continue;
                        }
                        if (var383 == 4105) {
                            var5 -= 2;
                            String var255 = field377[var5];
                            String var256 = field377[var5 + 1];
                            if (Statics.field1424.field48 != null && Statics.field1424.field48.field2743) {
                                field377[var5++] = var256;
                                continue;
                            }
                            field377[var5++] = var255;
                            continue;
                        }
                        if (var383 == 4106) {
                            var4--;
                            int var257 = field381[var4];
                            field377[var5++] = Integer.toString(var257);
                            continue;
                        }
                        if (var383 == 4107) {
                            var5 -= 2;
                            int[] var258 = field381;
                            int var259 = var4++;
                            String var260 = field377[var5];
                            String var261 = field377[var5 + 1];
                            int var262 = client.field464;
                            int var263 = var260.length();
                            int var264 = var261.length();
                            int var265 = 0;
                            int var266 = 0;
                            char var267 = 0;
                            char var268 = 0;
                            int var269;
                            label2200: while (true) {
                                if (var265 - var267 >= var263 && var266 - var268 >= var264) {
                                    int var278 = Math.min(var263, var264);
                                    for (int var279 = 0; var279 < var278; var279++) {
                                        char var282 = var260.charAt(var279);
                                        char var283 = var261.charAt(var279);
                                        if (var282 != var283 && Character.toUpperCase(var282) != Character.toUpperCase(var283)) {
                                            char var284 = Character.toLowerCase(var282);
                                            char var285 = Character.toLowerCase(var283);
                                            if (var284 != var285) {
                                                var269 = class151.method1252(var284, var262) - class151.method1252(var285, var262);
                                                break label2200;
                                            }
                                        }
                                    }
                                    int var286 = var263 - var264;
                                    if (var286 == 0) {
                                        for (int var287 = 0; var287 < var278; var287++) {
                                            char var288 = var260.charAt(var287);
                                            char var289 = var261.charAt(var287);
                                            if (var288 != var289) {
                                                var269 = class151.method1252(var288, var262) - class151.method1252(var289, var262);
                                                break label2200;
                                            }
                                        }
                                        var269 = 0;
                                    } else {
                                        var269 = var286;
                                    }
                                    break;
                                }
                                if (var265 - var267 >= var263) {
                                    var269 = -1;
                                    break;
                                }
                                if (var266 - var268 >= var264) {
                                    var269 = 1;
                                    break;
                                }
                                char var270;
                                if (var267 == 0) {
                                    var270 = var260.charAt(var265++);
                                } else {
                                    var270 = var267;
                                    boolean var271 = false;
                                }
                                char var272;
                                if (var268 == 0) {
                                    var272 = var261.charAt(var266++);
                                } else {
                                    var272 = var268;
                                    boolean var273 = false;
                                }
                                var267 = class151.method2735(var270);
                                var268 = class151.method2735(var272);
                                char var274 = class151.method3015(var270, var262);
                                char var275 = class151.method3015(var272, var262);
                                if (var274 != var275 && Character.toUpperCase(var274) != Character.toUpperCase(var275)) {
                                    char var276 = Character.toLowerCase(var274);
                                    char var277 = Character.toLowerCase(var275);
                                    if (var276 != var277) {
                                        var269 = class151.method1252(var276, var262) - class151.method1252(var277, var262);
                                        break;
                                    }
                                }
                            }
                            byte var291;
                            if (var269 > 0) {
                                var291 = 1;
                            } else if (var269 < 0) {
                                var291 = -1;
                            } else {
                                var291 = 0;
                            }
                            var258[var259] = var291;
                            continue;
                        }
                        if (var383 == 4108) {
                            var5--;
                            String var292 = field377[var5];
                            var4 -= 2;
                            int var293 = field381[var4];
                            int var294 = field381[var4 + 1];
                            byte[] var295 = Statics.field889.method3035(var294, 0);
                            class183 var296 = new class183(var295);
                            field381[var4++] = var296.method3402(var292, var293);
                            continue;
                        }
                        if (var383 == 4109) {
                            var5--;
                            String var297 = field377[var5];
                            var4 -= 2;
                            int var298 = field381[var4];
                            int var299 = field381[var4 + 1];
                            byte[] var300 = Statics.field889.method3035(var299, 0);
                            class183 var301 = new class183(var300);
                            field381[var4++] = var301.method3438(var297, var298);
                            continue;
                        }
                        if (var383 == 4110) {
                            var5 -= 2;
                            String var302 = field377[var5];
                            String var303 = field377[var5 + 1];
                            var4--;
                            if (field381[var4] == 1) {
                                field377[var5++] = var302;
                            } else {
                                field377[var5++] = var303;
                            }
                            continue;
                        }
                        if (var383 == 4111) {
                            var5--;
                            String var304 = field377[var5];
                            field377[var5++] = class185.method3403(var304);
                            continue;
                        }
                        if (var383 == 4112) {
                            var5--;
                            String var305 = field377[var5];
                            var4--;
                            int var306 = field381[var4];
                            field377[var5++] = var305 + (char) var306;
                            continue;
                        }
                        if (var383 == 4113) {
                            var4--;
                            int var307 = field381[var4];
                            field381[var4++] = class148.method162((char) var307) ? 1 : 0;
                            continue;
                        }
                        if (var383 == 4114) {
                            var4--;
                            int var308 = field381[var4];
                            field381[var4++] = class148.method1253((char) var308) ? 1 : 0;
                            continue;
                        }
                        if (var383 == 4115) {
                            var4--;
                            int var309 = field381[var4];
                            int[] var310 = field381;
                            int var311 = var4++;
                            char var312 = (char) var309;
                            boolean var313 = var312 >= 'A' && var312 <= 'Z' || var312 >= 'a' && var312 <= 'z';
                            var310[var311] = var313 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 4116) {
                            var4--;
                            int var314 = field381[var4];
                            int[] var315 = field381;
                            int var316 = var4++;
                            char var317 = (char) var314;
                            boolean var318 = var317 >= '0' && var317 <= '9';
                            var315[var316] = var318 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 4117) {
                            var5--;
                            String var319 = field377[var5];
                            if (var319 == null) {
                                field381[var4++] = 0;
                            } else {
                                field381[var4++] = var319.length();
                            }
                            continue;
                        }
                        if (var383 == 4118) {
                            var5--;
                            String var320 = field377[var5];
                            var4 -= 2;
                            int var321 = field381[var4];
                            int var322 = field381[var4 + 1];
                            field377[var5++] = var320.substring(var321, var322);
                            continue;
                        }
                        if (var383 == 4119) {
                            var5--;
                            String var323 = field377[var5];
                            StringBuilder var324 = new StringBuilder(var323.length());
                            boolean var325 = false;
                            for (int var326 = 0; var326 < var323.length(); var326++) {
                                char var327 = var323.charAt(var326);
                                if (var327 == '<') {
                                    var325 = true;
                                } else if (var327 == '>') {
                                    var325 = false;
                                } else if (!var325) {
                                    var324.append(var327);
                                }
                            }
                            field377[var5++] = var324.toString();
                            continue;
                        }
                        if (var383 == 4120) {
                            var5--;
                            String var328 = field377[var5];
                            var4--;
                            int var329 = field381[var4];
                            field381[var4++] = var328.indexOf(var329);
                            continue;
                        }
                    } else if (var383 < 4300) {
                        if (var383 == 4200) {
                            var4--;
                            int var330 = field381[var4];
                            field377[var5++] = class40.method1433(var330).field974;
                            continue;
                        }
                        if (var383 == 4201) {
                            var4 -= 2;
                            int var331 = field381[var4];
                            int var332 = field381[var4 + 1];
                            class40 var333 = class40.method1433(var331);
                            if (var332 >= 1 && var332 <= 5 && var333.field969[var332 - 1] != null) {
                                field377[var5++] = var333.field969[var332 - 1];
                                continue;
                            }
                            field377[var5++] = "";
                            continue;
                        }
                        if (var383 == 4202) {
                            var4 -= 2;
                            int var334 = field381[var4];
                            int var335 = field381[var4 + 1];
                            class40 var336 = class40.method1433(var334);
                            if (var335 >= 1 && var335 <= 5 && var336.field989[var335 - 1] != null) {
                                field377[var5++] = var336.field989[var335 - 1];
                                continue;
                            }
                            field377[var5++] = "";
                            continue;
                        }
                        if (var383 == 4203) {
                            var4--;
                            int var337 = field381[var4];
                            field381[var4++] = class40.method1433(var337).field966;
                            continue;
                        }
                        if (var383 == 4204) {
                            var4--;
                            int var338 = field381[var4];
                            field381[var4++] = class40.method1433(var338).field985 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 4205) {
                            var4--;
                            int var339 = field381[var4];
                            class40 var340 = class40.method1433(var339);
                            if (var340.field1005 == -1 && var340.field1004 >= 0) {
                                field381[var4++] = var340.field1004;
                                continue;
                            }
                            field381[var4++] = var339;
                            continue;
                        }
                        if (var383 == 4206) {
                            var4--;
                            int var341 = field381[var4];
                            class40 var342 = class40.method1433(var341);
                            if (var342.field1005 >= 0 && var342.field1004 >= 0) {
                                field381[var4++] = var342.field1004;
                                continue;
                            }
                            field381[var4++] = var341;
                            continue;
                        }
                        if (var383 == 4207) {
                            var4--;
                            int var343 = field381[var4];
                            field381[var4++] = class40.method1433(var343).field987 ? 1 : 0;
                            continue;
                        }
                    } else if (var383 < 5100) {
                        if (var383 == 5000) {
                            field381[var4++] = client.field660;
                            continue;
                        }
                        if (var383 == 5001) {
                            var4 -= 3;
                            client.field660 = field381[var4];
                            int var344 = field381[var4 + 1];
                            class138[] var345 = class138.method1652();
                            int var346 = 0;
                            class138 var348;
                            while (true) {
                                if (var346 >= var345.length) {
                                    var348 = null;
                                    break;
                                }
                                class138 var347 = var345[var346];
                                if (var347.field2343 == var344) {
                                    var348 = var347;
                                    break;
                                }
                                var346++;
                            }
                            Statics.field133 = var348;
                            if (Statics.field133 == null) {
                                Statics.field133 = class138.field2344;
                            }
                            client.field542 = field381[var4 + 2];
                            client.field694.method2316(2);
                            client.field694.method2536(client.field660);
                            client.field694.method2536(Statics.field133.field2343);
                            client.field694.method2536(client.field542);
                            continue;
                        }
                        if (var383 == 5002) {
                            var5--;
                            String var349 = field377[var5];
                            var4 -= 2;
                            int var350 = field381[var4];
                            int var351 = field381[var4 + 1];
                            client.field694.method2316(62);
                            class116 var352 = client.field694;
                            int var353 = var349.length() + 1;
                            var352.method2536(var353 + 2);
                            client.field694.method2449(var349);
                            client.field694.method2536(var350 - 1);
                            client.field694.method2536(var351);
                            continue;
                        }
                        if (var383 == 5003) {
                            var4--;
                            int var354 = field381[var4];
                            String var355 = null;
                            if (var354 < 100) {
                                var355 = client.field623[var354];
                            }
                            if (var355 == null) {
                                var355 = "";
                            }
                            field377[var5++] = var355;
                            continue;
                        }
                        if (var383 == 5004) {
                            var4--;
                            int var356 = field381[var4];
                            int var357 = -1;
                            if (var356 < 100 && client.field623[var356] != null) {
                                var357 = client.field670[var356];
                            }
                            field381[var4++] = var357;
                            continue;
                        }
                        if (var383 == 5005) {
                            if (Statics.field133 == null) {
                                field381[var4++] = -1;
                            } else {
                                field381[var4++] = Statics.field133.field2343;
                            }
                            continue;
                        }
                        if (var383 == 5008) {
                            var5--;
                            String var358 = field377[var5];
                            if (var358.startsWith("::")) {
                                String var359 = var358.substring(2);
                                if (var359.equalsIgnoreCase("toggleroof")) {
                                    Statics.field65.field177 = !Statics.field65.field177;
                                    class12.method1181();
                                    if (Statics.field65.field177) {
                                        client.method731(0, "", "Roofs are now all hidden");
                                    } else {
                                        client.method731(0, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field626 >= 2) {
                                    if (var359.equalsIgnoreCase("fpson")) {
                                        client.field592 = true;
                                    }
                                    if (var359.equalsIgnoreCase("fpsoff")) {
                                        client.field592 = false;
                                    }
                                    if (var359.equalsIgnoreCase("gc")) {
                                        System.gc();
                                    }
                                    if (var359.equalsIgnoreCase("clientdrop")) {
                                        client.method1428();
                                    }
                                    if (var359.equalsIgnoreCase("errortest") && client.field522 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field694.method2316(87);
                                client.field694.method2536(var359.length() + 1);
                                client.field694.method2449(var359);
                            } else {
                                String var360 = var358.toLowerCase();
                                byte var361 = 0;
                                if (var360.startsWith(class135.field2200)) {
                                    var361 = 0;
                                    var358 = var358.substring(class135.field2200.length());
                                } else if (var360.startsWith(class135.field2259)) {
                                    var361 = 1;
                                    var358 = var358.substring(class135.field2259.length());
                                } else if (var360.startsWith(class135.field2261)) {
                                    var361 = 2;
                                    var358 = var358.substring(class135.field2261.length());
                                } else if (var360.startsWith(class135.field2169)) {
                                    var361 = 3;
                                    var358 = var358.substring(class135.field2169.length());
                                } else if (var360.startsWith(class135.field2309)) {
                                    var361 = 4;
                                    var358 = var358.substring(class135.field2309.length());
                                } else if (var360.startsWith(class135.field2299)) {
                                    var361 = 5;
                                    var358 = var358.substring(class135.field2299.length());
                                } else if (var360.startsWith(class135.field2269)) {
                                    var361 = 6;
                                    var358 = var358.substring(class135.field2269.length());
                                } else if (var360.startsWith(class135.field2271)) {
                                    var361 = 7;
                                    var358 = var358.substring(class135.field2271.length());
                                } else if (var360.startsWith(class135.field2273)) {
                                    var361 = 8;
                                    var358 = var358.substring(class135.field2273.length());
                                } else if (var360.startsWith(class135.field2112)) {
                                    var361 = 9;
                                    var358 = var358.substring(class135.field2112.length());
                                } else if (var360.startsWith(class135.field2222)) {
                                    var361 = 10;
                                    var358 = var358.substring(class135.field2222.length());
                                } else if (var360.startsWith(class135.field2279)) {
                                    var361 = 11;
                                    var358 = var358.substring(class135.field2279.length());
                                } else if (client.field464 != 0) {
                                    if (var360.startsWith(class135.field2258)) {
                                        var361 = 0;
                                        var358 = var358.substring(class135.field2258.length());
                                    } else if (var360.startsWith(class135.field2235)) {
                                        var361 = 1;
                                        var358 = var358.substring(class135.field2235.length());
                                    } else if (var360.startsWith(class135.field2262)) {
                                        var361 = 2;
                                        var358 = var358.substring(class135.field2262.length());
                                    } else if (var360.startsWith(class135.field2187)) {
                                        var361 = 3;
                                        var358 = var358.substring(class135.field2187.length());
                                    } else if (var360.startsWith(class135.field2229)) {
                                        var361 = 4;
                                        var358 = var358.substring(class135.field2229.length());
                                    } else if (var360.startsWith(class135.field2268)) {
                                        var361 = 5;
                                        var358 = var358.substring(class135.field2268.length());
                                    } else if (var360.startsWith(class135.field2270)) {
                                        var361 = 6;
                                        var358 = var358.substring(class135.field2270.length());
                                    } else if (var360.startsWith(class135.field2144)) {
                                        var361 = 7;
                                        var358 = var358.substring(class135.field2144.length());
                                    } else if (var360.startsWith(class135.field2211)) {
                                        var361 = 8;
                                        var358 = var358.substring(class135.field2211.length());
                                    } else if (var360.startsWith(class135.field2276)) {
                                        var361 = 9;
                                        var358 = var358.substring(class135.field2276.length());
                                    } else if (var360.startsWith(class135.field2174)) {
                                        var361 = 10;
                                        var358 = var358.substring(class135.field2174.length());
                                    } else if (var360.startsWith(class135.field2280)) {
                                        var361 = 11;
                                        var358 = var358.substring(class135.field2280.length());
                                    }
                                }
                                String var362 = var358.toLowerCase();
                                byte var363 = 0;
                                if (var362.startsWith(class135.field2313)) {
                                    var363 = 1;
                                    var358 = var358.substring(class135.field2313.length());
                                } else if (var362.startsWith(class135.field2191)) {
                                    var363 = 2;
                                    var358 = var358.substring(class135.field2191.length());
                                } else if (var362.startsWith(class135.field2252)) {
                                    var363 = 3;
                                    var358 = var358.substring(class135.field2252.length());
                                } else if (var362.startsWith(class135.field2287)) {
                                    var363 = 4;
                                    var358 = var358.substring(class135.field2287.length());
                                } else if (var362.startsWith(class135.field2289)) {
                                    var363 = 5;
                                    var358 = var358.substring(class135.field2289.length());
                                } else if (client.field464 != 0) {
                                    if (var362.startsWith(class135.field2282)) {
                                        var363 = 1;
                                        var358 = var358.substring(class135.field2282.length());
                                    } else if (var362.startsWith(class135.field2284)) {
                                        var363 = 2;
                                        var358 = var358.substring(class135.field2284.length());
                                    } else if (var362.startsWith(class135.field2238)) {
                                        var363 = 3;
                                        var358 = var358.substring(class135.field2238.length());
                                    } else if (var362.startsWith(class135.field2288)) {
                                        var363 = 4;
                                        var358 = var358.substring(class135.field2288.length());
                                    } else if (var362.startsWith(class135.field2290)) {
                                        var363 = 5;
                                        var358 = var358.substring(class135.field2290.length());
                                    }
                                }
                                client.field694.method2316(116);
                                client.field694.method2536(0);
                                int var364 = client.field694.field2033;
                                client.field694.method2536(var361);
                                client.field694.method2536(var363);
                                class116 var365 = client.field694;
                                int var366 = var365.field2033;
                                byte[] var367 = class150.method181(var358);
                                var365.method2505(var367.length);
                                var365.field2033 += Statics.field2831.method2370(var367, 0, var367.length, var365.field2030, var365.field2033);
                                client.field694.method2571(client.field694.field2033 - var364);
                            }
                            continue;
                        }
                        if (var383 == 5009) {
                            var5 -= 2;
                            String var368 = field377[var5];
                            String var369 = field377[var5 + 1];
                            client.field694.method2316(21);
                            client.field694.method2563(0);
                            int var370 = client.field694.field2033;
                            client.field694.method2449(var368);
                            class116 var371 = client.field694;
                            int var372 = var371.field2033;
                            byte[] var373 = class150.method181(var369);
                            var371.method2505(var373.length);
                            var371.field2033 += Statics.field2831.method2370(var373, 0, var373.length, var371.field2030, var371.field2033);
                            client.field694.method2470(client.field694.field2033 - var370);
                            continue;
                        }
                        if (var383 == 5010) {
                            var4--;
                            int var374 = field381[var4];
                            String var375 = null;
                            if (var374 < 100) {
                                var375 = client.field519[var374];
                            }
                            if (var375 == null) {
                                var375 = "";
                            }
                            field377[var5++] = var375;
                            continue;
                        }
                        if (var383 == 5011) {
                            var4--;
                            int var376 = field381[var4];
                            String var377 = null;
                            if (var376 < 100) {
                                var377 = client.field672[var376];
                            }
                            if (var377 == null) {
                                var377 = "";
                            }
                            field377[var5++] = var377;
                            continue;
                        }
                        if (var383 == 5015) {
                            String var378;
                            if (Statics.field1424 == null || Statics.field1424.field45 == null) {
                                var378 = "";
                            } else {
                                var378 = Statics.field1424.field45;
                            }
                            field377[var5++] = var378;
                            continue;
                        }
                        if (var383 == 5016) {
                            field381[var4++] = client.field542;
                            continue;
                        }
                        if (var383 == 5017) {
                            field381[var4++] = client.field695;
                            continue;
                        }
                    }
                } else {
                    class159 var63;
                    if (var383 >= 2000) {
                        var383 -= 1000;
                        var4--;
                        var63 = class159.method2754(field381[var4]);
                    } else {
                        var63 = var40 ? Statics.field227 : Statics.field385;
                    }
                    if (var383 == 1300) {
                        var4--;
                        int var64 = field381[var4] - 1;
                        if (var64 >= 0 && var64 <= 9) {
                            var5--;
                            var63.method3169(var64, field377[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var383 == 1301) {
                        var4 -= 2;
                        int var65 = field381[var4];
                        int var66 = field381[var4 + 1];
                        var63.field2593 = Statics.method606(var65, var66);
                        continue;
                    }
                    if (var383 == 1302) {
                        var4--;
                        var63.field2663 = field381[var4] == 1;
                        continue;
                    }
                    if (var383 == 1303) {
                        var4--;
                        var63.field2642 = field381[var4];
                        continue;
                    }
                    if (var383 == 1304) {
                        var4--;
                        var63.field2662 = field381[var4];
                        continue;
                    }
                    if (var383 == 1305) {
                        var5--;
                        var63.field2658 = field377[var5];
                        continue;
                    }
                    if (var383 == 1306) {
                        var5--;
                        var63.field2664 = field377[var5];
                        continue;
                    }
                    if (var383 == 1307) {
                        var63.field2659 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var382) {
            StringBuilder var380 = new StringBuilder(30);
            var380.append("").append(var3.field2812).append(" ");
            for (int var381 = field384 - 1; var381 >= 0; var381--) {
                var380.append("").append(field379[var381].field260.field2812).append(" ");
            }
            var380.append("").append(var9);
            class80.method802(var380.toString(), var382);
        }
    }

    @ObfuscatedName("db.t(IB)V")
    public static void method2365(int arg0) {
        if (arg0 == -1 || !class159.method239(arg0)) {
            return;
        }
        class159[] var1 = Statics.field2693[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3.field2666 != null) {
                class1 var4 = new class1();
                var4.field9 = var3;
                var4.field8 = var3.field2666;
                method2441(var4);
            }
        }
    }
}
