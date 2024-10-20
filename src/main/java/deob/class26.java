package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("c")
public class class26 {

    @ObfuscatedName("c.l")
    public static int[] field406 = new int[5];

    @ObfuscatedName("c.q")
    public static int[][] field416 = new int[5][5000];

    @ObfuscatedName("c.b")
    public static int[] field408 = new int[1000];

    @ObfuscatedName("c.u")
    public static String[] field404 = new String[1000];

    @ObfuscatedName("c.d")
    public static int field410 = 0;

    @ObfuscatedName("c.m")
    public static class18[] field417 = new class18[50];

    @ObfuscatedName("c.f")
    public static Calendar field414 = Calendar.getInstance();

    @ObfuscatedName("c.h")
    public static final String[] field407 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.i(Li;I)V")
    public static void method1269(class1 arg0) {
        Object[] var1 = arg0.field8;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method744(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field69;
        int[] var8 = var3.field70;
        byte var9 = -1;
        field410 = 0;
        try {
            Statics.field405 = new int[var3.field72];
            int var10 = 0;
            Statics.field409 = new String[var3.field73];
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
                        var13 = arg0.field1 == null ? -1 : arg0.field1.field2591;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field9;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field1 == null ? -1 : arg0.field1.field2592;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2591;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2592;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field12;
                    }
                    Statics.field405[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field5;
                    }
                    Statics.field409[var11++] = var14;
                }
            }
            int var15 = 0;
            label2430: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var381 = var7[var6];
                if (var381 < 100) {
                    if (var381 == 0) {
                        field408[var4++] = var8[var6];
                        continue;
                    }
                    if (var381 == 1) {
                        int var16 = var8[var6];
                        field408[var4++] = class159.field2709[var16];
                        continue;
                    }
                    if (var381 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class159.field2709[var17] = field408[var4];
                        continue;
                    }
                    if (var381 == 3) {
                        field404[var5++] = var3.field71[var6];
                        continue;
                    }
                    if (var381 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var381 == 7) {
                        var4 -= 2;
                        if (field408[var4 + 1] != field408[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var381 == 8) {
                        var4 -= 2;
                        if (field408[var4 + 1] == field408[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var381 == 9) {
                        var4 -= 2;
                        if (field408[var4] < field408[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var381 == 10) {
                        var4 -= 2;
                        if (field408[var4] > field408[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var381 == 21) {
                        if (field410 == 0) {
                            return;
                        }
                        class18 var18 = field417[--field410];
                        var3 = var18.field279;
                        var7 = var3.field69;
                        var8 = var3.field70;
                        var6 = var18.field280;
                        Statics.field405 = var18.field281;
                        Statics.field409 = var18.field283;
                        continue;
                    }
                    if (var381 == 25) {
                        int var19 = var8[var6];
                        field408[var4++] = class159.method1461(var19);
                        continue;
                    }
                    if (var381 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class159.method1788(var20, field408[var4]);
                        continue;
                    }
                    if (var381 == 31) {
                        var4 -= 2;
                        if (field408[var4] <= field408[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var381 == 32) {
                        var4 -= 2;
                        if (field408[var4] >= field408[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var381 == 33) {
                        field408[var4++] = Statics.field405[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var381 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field405[var10001] = field408[var4];
                        continue;
                    }
                    if (var381 == 35) {
                        field404[var5++] = Statics.field409[var8[var6]];
                        continue;
                    }
                    if (var381 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field409[var10001] = field404[var5];
                        continue;
                    }
                    if (var381 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String var22 = class147.method2259(field404, var5, var21);
                        field404[var5++] = var22;
                        continue;
                    }
                    if (var381 == 38) {
                        var4--;
                        continue;
                    }
                    if (var381 == 39) {
                        var5--;
                        continue;
                    }
                    if (var381 == 40) {
                        int var23 = var8[var6];
                        class5 var24 = class5.method744(var23);
                        int[] var25 = new int[var24.field72];
                        String[] var26 = new String[var24.field73];
                        for (int var27 = 0; var27 < var24.field74; var27++) {
                            var25[var27] = field408[var4 - var24.field74 + var27];
                        }
                        for (int var28 = 0; var28 < var24.field75; var28++) {
                            var26[var28] = field404[var5 - var24.field75 + var28];
                        }
                        var4 -= var24.field74;
                        var5 -= var24.field75;
                        class18 var29 = new class18();
                        var29.field279 = var3;
                        var29.field280 = var6;
                        var29.field281 = Statics.field405;
                        var29.field283 = Statics.field409;
                        field417[++field410 - 1] = var29;
                        var3 = var24;
                        var7 = var24.field69;
                        var8 = var24.field70;
                        var6 = -1;
                        Statics.field405 = var25;
                        Statics.field409 = var26;
                        continue;
                    }
                    if (var381 == 42) {
                        field408[var4++] = client.field562[var8[var6]];
                        continue;
                    }
                    if (var381 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field562[var10001] = field408[var4];
                        continue;
                    }
                    if (var381 == 44) {
                        int var30 = var8[var6] >> 16;
                        int var31 = var8[var6] & 0xFFFF;
                        var4--;
                        int var32 = field408[var4];
                        if (var32 >= 0 && var32 <= 5000) {
                            field406[var30] = var32;
                            byte var33 = -1;
                            if (var31 == 105) {
                                var33 = 0;
                            }
                            int var34 = 0;
                            while (true) {
                                if (var34 >= var32) {
                                    continue label2430;
                                }
                                field416[var30][var34] = var33;
                                var34++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var381 == 45) {
                        int var35 = var8[var6];
                        var4--;
                        int var36 = field408[var4];
                        if (var36 >= 0 && var36 < field406[var35]) {
                            field408[var4++] = field416[var35][var36];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var381 == 46) {
                        int var37 = var8[var6];
                        var4 -= 2;
                        int var38 = field408[var4];
                        if (var38 >= 0 && var38 < field406[var37]) {
                            field416[var37][var38] = field408[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var381 == 47) {
                        String var39 = client.field729[var8[var6]];
                        if (var39 == null) {
                            var39 = "null";
                        }
                        field404[var5++] = var39;
                        continue;
                    }
                    if (var381 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field729[var10001] = field404[var5];
                        continue;
                    }
                }
                boolean var40;
                if (var8[var6] == 1) {
                    var40 = true;
                } else {
                    var40 = false;
                }
                if (var381 < 1000) {
                    if (var381 == 100) {
                        var4 -= 3;
                        int var41 = field408[var4];
                        int var42 = field408[var4 + 1];
                        int var43 = field408[var4 + 2];
                        if (var42 == 0) {
                            throw new RuntimeException();
                        }
                        class158 var44 = class158.method139(var41);
                        if (var44.field2699 == null) {
                            var44.field2699 = new class158[var43 + 1];
                        }
                        if (var44.field2699.length <= var43) {
                            class158[] var45 = new class158[var43 + 1];
                            for (int var46 = 0; var46 < var44.field2699.length; var46++) {
                                var45[var46] = var44.field2699[var46];
                            }
                            var44.field2699 = var45;
                        }
                        if (var43 > 0 && var44.field2699[var43 - 1] == null) {
                            throw new RuntimeException("" + (var43 - 1));
                        }
                        class158 var47 = new class158();
                        var47.field2593 = var42;
                        var47.field2602 = var47.field2591 = var44.field2591;
                        var47.field2592 = var43;
                        var47.field2590 = true;
                        var44.field2699[var43] = var47;
                        if (var40) {
                            Statics.field413 = var47;
                        } else {
                            Statics.field412 = var47;
                        }
                        client.method64(var44);
                        continue;
                    }
                    if (var381 == 101) {
                        class158 var48 = var40 ? Statics.field413 : Statics.field412;
                        class158 var49 = class158.method139(var48.field2591);
                        var49.field2699[var48.field2592] = null;
                        client.method64(var49);
                        continue;
                    }
                    if (var381 == 102) {
                        var4--;
                        class158 var50 = class158.method139(field408[var4]);
                        var50.field2699 = null;
                        client.method64(var50);
                        continue;
                    }
                    if (var381 == 200) {
                        var4 -= 2;
                        int var51 = field408[var4];
                        int var52 = field408[var4 + 1];
                        class158 var53 = class158.method1789(var51, var52);
                        if (var53 != null && var52 != -1) {
                            field408[var4++] = 1;
                            if (var40) {
                                Statics.field413 = var53;
                            } else {
                                Statics.field412 = var53;
                            }
                            continue;
                        }
                        field408[var4++] = 0;
                        continue;
                    }
                } else if (!(var381 < 1000 || var381 >= 1100) || !(var381 < 2000 || var381 >= 2100)) {
                    class158 var54;
                    if (var381 >= 2000) {
                        var381 -= 1000;
                        var4--;
                        var54 = class158.method139(field408[var4]);
                    } else {
                        var54 = var40 ? Statics.field413 : Statics.field412;
                    }
                    if (var381 == 1000) {
                        var4 -= 2;
                        var54.field2644 = field408[var4];
                        var54.field2597 = field408[var4 + 1];
                        client.method64(var54);
                        continue;
                    }
                    if (var381 == 1001) {
                        var4 -= 2;
                        var54.field2600 = field408[var4];
                        var54.field2582 = field408[var4 + 1];
                        client.method64(var54);
                        continue;
                    }
                    if (var381 == 1003) {
                        var4--;
                        boolean var55 = field408[var4] == 1;
                        if (var54.field2603 != var55) {
                            var54.field2603 = var55;
                            client.method64(var54);
                        }
                        continue;
                    }
                } else if (var381 >= 1100 && var381 < 1200 || var381 >= 2100 && var381 < 2200) {
                    class158 var56;
                    if (var381 >= 2000) {
                        var381 -= 1000;
                        var4--;
                        var56 = class158.method139(field408[var4]);
                    } else {
                        var56 = var40 ? Statics.field413 : Statics.field412;
                    }
                    if (var381 == 1100) {
                        var4 -= 2;
                        var56.field2604 = field408[var4];
                        if (var56.field2604 > var56.field2689 - var56.field2600) {
                            var56.field2604 = var56.field2689 - var56.field2600;
                        }
                        if (var56.field2604 < 0) {
                            var56.field2604 = 0;
                        }
                        var56.field2605 = field408[var4 + 1];
                        if (var56.field2605 > var56.field2697 - var56.field2582) {
                            var56.field2605 = var56.field2697 - var56.field2582;
                        }
                        if (var56.field2605 < 0) {
                            var56.field2605 = 0;
                        }
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1101) {
                        var4--;
                        var56.field2608 = field408[var4];
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1102) {
                        var4--;
                        var56.field2647 = field408[var4] == 1;
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1103) {
                        var4--;
                        var56.field2613 = field408[var4];
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1104) {
                        var4--;
                        var56.field2614 = field408[var4];
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1105) {
                        var4--;
                        var56.field2615 = field408[var4];
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1106) {
                        var4--;
                        var56.field2617 = field408[var4];
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1107) {
                        var4--;
                        var56.field2693 = field408[var4] == 1;
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1108) {
                        var56.field2623 = 1;
                        var4--;
                        var56.field2625 = field408[var4];
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1109) {
                        var4 -= 6;
                        var56.field2629 = field408[var4];
                        var56.field2630 = field408[var4 + 1];
                        var56.field2631 = field408[var4 + 2];
                        var56.field2632 = field408[var4 + 3];
                        var56.field2633 = field408[var4 + 4];
                        var56.field2619 = field408[var4 + 5];
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1110) {
                        var4--;
                        int var57 = field408[var4];
                        if (var56.field2627 != var57) {
                            var56.field2627 = var57;
                            var56.field2616 = 0;
                            var56.field2698 = 0;
                            client.method64(var56);
                        }
                        continue;
                    }
                    if (var381 == 1111) {
                        var4--;
                        var56.field2664 = field408[var4] == 1;
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1112) {
                        var5--;
                        String var58 = field404[var5];
                        if (!var58.equals(var56.field2638)) {
                            var56.field2638 = var58;
                            client.method64(var56);
                        }
                        continue;
                    }
                    if (var381 == 1113) {
                        var4--;
                        var56.field2637 = field408[var4];
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1114) {
                        var4 -= 3;
                        var56.field2678 = field408[var4];
                        var56.field2642 = field408[var4 + 1];
                        var56.field2640 = field408[var4 + 2];
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1115) {
                        var4--;
                        var56.field2643 = field408[var4] == 1;
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1116) {
                        var4--;
                        var56.field2696 = field408[var4];
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1117) {
                        var4--;
                        var56.field2646 = field408[var4];
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1118) {
                        var4--;
                        var56.field2677 = field408[var4] == 1;
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1119) {
                        var4--;
                        var56.field2622 = field408[var4] == 1;
                        client.method64(var56);
                        continue;
                    }
                    if (var381 == 1120) {
                        var4 -= 2;
                        var56.field2689 = field408[var4];
                        var56.field2697 = field408[var4 + 1];
                        client.method64(var56);
                        continue;
                    }
                } else if (var381 >= 1200 && var381 < 1300 || var381 >= 2200 && var381 < 2300) {
                    class158 var59;
                    if (var381 >= 2000) {
                        var381 -= 1000;
                        var4--;
                        var59 = class158.method139(field408[var4]);
                    } else {
                        var59 = var40 ? Statics.field413 : Statics.field412;
                    }
                    client.method64(var59);
                    if (var381 == 1200) {
                        var4 -= 2;
                        int var60 = field408[var4];
                        int var61 = field408[var4 + 1];
                        var59.field2695 = var60;
                        var59.field2624 = var61;
                        class40 var62 = class40.method44(var60);
                        var59.field2631 = var62.field1002;
                        var59.field2632 = var62.field1003;
                        var59.field2633 = var62.field1030;
                        var59.field2629 = var62.field1005;
                        var59.field2630 = var62.field1006;
                        var59.field2619 = var62.field1026;
                        if (var59.field2600 > 0) {
                            var59.field2619 = var59.field2619 * 32 / var59.field2600;
                        }
                        continue;
                    }
                    if (var381 == 1201) {
                        var59.field2623 = 2;
                        var4--;
                        var59.field2625 = field408[var4];
                        continue;
                    }
                    if (var381 == 1202) {
                        var59.field2623 = 3;
                        var59.field2625 = Statics.field1358.field32.method3144();
                        continue;
                    }
                } else if ((var381 < 1300 || var381 >= 1400) && (var381 < 2300 || var381 >= 2400)) {
                    if (var381 >= 1400 && var381 < 1500 || var381 >= 2400 && var381 < 2500) {
                        class158 var67;
                        if (var381 >= 2000) {
                            var381 -= 1000;
                            var4--;
                            var67 = class158.method139(field408[var4]);
                        } else {
                            var67 = var40 ? Statics.field413 : Statics.field412;
                        }
                        var5--;
                        String var68 = field404[var5];
                        int[] var69 = null;
                        if (var68.length() > 0 && var68.charAt(var68.length() - 1) == 'Y') {
                            var4--;
                            int var70 = field408[var4];
                            if (var70 > 0) {
                                var69 = new int[var70];
                                while (var70-- > 0) {
                                    var4--;
                                    var69[var70] = field408[var4];
                                }
                            }
                            var68 = var68.substring(0, var68.length() - 1);
                        }
                        Object[] var71 = new Object[var68.length() + 1];
                        for (int var72 = var71.length - 1; var72 >= 1; var72--) {
                            if (var68.charAt(var72 - 1) == 's') {
                                var5--;
                                var71[var72] = field404[var5];
                            } else {
                                var4--;
                                var71[var72] = Integer.valueOf(field408[var4]);
                            }
                        }
                        var4--;
                        int var73 = field408[var4];
                        if (var73 == -1) {
                            var71 = null;
                        } else {
                            var71[0] = Integer.valueOf(var73);
                        }
                        if (var381 == 1400) {
                            var67.field2660 = var71;
                        }
                        if (var381 == 1401) {
                            var67.field2663 = var71;
                        }
                        if (var381 == 1402) {
                            var67.field2618 = var71;
                        }
                        if (var381 == 1403) {
                            var67.field2662 = var71;
                        }
                        if (var381 == 1404) {
                            var67.field2666 = var71;
                        }
                        if (var381 == 1405) {
                            var67.field2667 = var71;
                        }
                        if (var381 == 1406) {
                            var67.field2670 = var71;
                        }
                        if (var381 == 1407) {
                            var67.field2671 = var71;
                            var67.field2601 = var69;
                        }
                        if (var381 == 1408) {
                            var67.field2641 = var71;
                        }
                        if (var381 == 1409) {
                            var67.field2621 = var71;
                        }
                        if (var381 == 1410) {
                            var67.field2610 = var71;
                        }
                        if (var381 == 1411) {
                            var67.field2661 = var71;
                        }
                        if (var381 == 1412) {
                            var67.field2665 = var71;
                        }
                        if (var381 == 1414) {
                            var67.field2673 = var71;
                            var67.field2651 = var69;
                        }
                        if (var381 == 1415) {
                            var67.field2607 = var71;
                            var67.field2676 = var69;
                        }
                        if (var381 == 1416) {
                            var67.field2681 = var71;
                        }
                        if (var381 == 1417) {
                            var67.field2679 = var71;
                        }
                        if (var381 == 1418) {
                            var67.field2680 = var71;
                        }
                        if (var381 == 1419) {
                            var67.field2668 = var71;
                        }
                        if (var381 == 1420) {
                            var67.field2675 = var71;
                        }
                        if (var381 == 1421) {
                            var67.field2683 = var71;
                        }
                        if (var381 == 1422) {
                            var67.field2684 = var71;
                        }
                        if (var381 == 1423) {
                            var67.field2685 = var71;
                        }
                        if (var381 == 1424) {
                            var67.field2686 = var71;
                        }
                        var67.field2658 = true;
                        continue;
                    }
                    if (var381 < 1600) {
                        class158 var74 = var40 ? Statics.field413 : Statics.field412;
                        if (var381 == 1500) {
                            field408[var4++] = var74.field2644;
                            continue;
                        }
                        if (var381 == 1501) {
                            field408[var4++] = var74.field2597;
                            continue;
                        }
                        if (var381 == 1502) {
                            field408[var4++] = var74.field2600;
                            continue;
                        }
                        if (var381 == 1503) {
                            field408[var4++] = var74.field2582;
                            continue;
                        }
                        if (var381 == 1504) {
                            field408[var4++] = var74.field2603 ? 1 : 0;
                            continue;
                        }
                        if (var381 == 1505) {
                            field408[var4++] = var74.field2602;
                            continue;
                        }
                    } else if (var381 < 1700) {
                        class158 var75 = var40 ? Statics.field413 : Statics.field412;
                        if (var381 == 1600) {
                            field408[var4++] = var75.field2604;
                            continue;
                        }
                        if (var381 == 1601) {
                            field408[var4++] = var75.field2605;
                            continue;
                        }
                        if (var381 == 1602) {
                            field404[var5++] = var75.field2638;
                            continue;
                        }
                        if (var381 == 1603) {
                            field408[var4++] = var75.field2689;
                            continue;
                        }
                        if (var381 == 1604) {
                            field408[var4++] = var75.field2697;
                            continue;
                        }
                        if (var381 == 1605) {
                            field408[var4++] = var75.field2619;
                            continue;
                        }
                        if (var381 == 1606) {
                            field408[var4++] = var75.field2631;
                            continue;
                        }
                        if (var381 == 1607) {
                            field408[var4++] = var75.field2633;
                            continue;
                        }
                        if (var381 == 1608) {
                            field408[var4++] = var75.field2632;
                            continue;
                        }
                    } else if (var381 < 1800) {
                        class158 var76 = var40 ? Statics.field413 : Statics.field412;
                        if (var381 == 1700) {
                            field408[var4++] = var76.field2695;
                            continue;
                        }
                        if (var381 == 1701) {
                            if (var76.field2695 == -1) {
                                field408[var4++] = 0;
                            } else {
                                field408[var4++] = var76.field2624;
                            }
                            continue;
                        }
                        if (var381 == 1702) {
                            field408[var4++] = var76.field2592;
                            continue;
                        }
                    } else if (var381 < 1900) {
                        class158 var77 = var40 ? Statics.field413 : Statics.field412;
                        if (var381 == 1800) {
                            field408[var4++] = class162.method3058(client.method119(var77));
                            continue;
                        }
                        if (var381 == 1801) {
                            var4--;
                            int var78 = field408[var4];
                            int var382 = var78 - 1;
                            if (var77.field2652 != null && var382 < var77.field2652.length && var77.field2652[var382] != null) {
                                field404[var5++] = var77.field2652[var382];
                                continue;
                            }
                            field404[var5++] = "";
                            continue;
                        }
                        if (var381 == 1802) {
                            if (var77.field2648 == null) {
                                field404[var5++] = "";
                            } else {
                                field404[var5++] = var77.field2648;
                            }
                            continue;
                        }
                    } else if (var381 < 2600) {
                        var4--;
                        class158 var79 = class158.method139(field408[var4]);
                        if (var381 == 2500) {
                            field408[var4++] = var79.field2644;
                            continue;
                        }
                        if (var381 == 2501) {
                            field408[var4++] = var79.field2597;
                            continue;
                        }
                        if (var381 == 2502) {
                            field408[var4++] = var79.field2600;
                            continue;
                        }
                        if (var381 == 2503) {
                            field408[var4++] = var79.field2582;
                            continue;
                        }
                        if (var381 == 2504) {
                            field408[var4++] = var79.field2603 ? 1 : 0;
                            continue;
                        }
                        if (var381 == 2505) {
                            field408[var4++] = var79.field2602;
                            continue;
                        }
                    } else if (var381 < 2700) {
                        var4--;
                        class158 var80 = class158.method139(field408[var4]);
                        if (var381 == 2600) {
                            field408[var4++] = var80.field2604;
                            continue;
                        }
                        if (var381 == 2601) {
                            field408[var4++] = var80.field2605;
                            continue;
                        }
                        if (var381 == 2602) {
                            field404[var5++] = var80.field2638;
                            continue;
                        }
                        if (var381 == 2603) {
                            field408[var4++] = var80.field2689;
                            continue;
                        }
                        if (var381 == 2604) {
                            field408[var4++] = var80.field2697;
                            continue;
                        }
                        if (var381 == 2605) {
                            field408[var4++] = var80.field2619;
                            continue;
                        }
                        if (var381 == 2606) {
                            field408[var4++] = var80.field2631;
                            continue;
                        }
                        if (var381 == 2607) {
                            field408[var4++] = var80.field2633;
                            continue;
                        }
                        if (var381 == 2608) {
                            field408[var4++] = var80.field2632;
                            continue;
                        }
                    } else if (var381 < 2800) {
                        if (var381 == 2700) {
                            var4--;
                            class158 var81 = class158.method139(field408[var4]);
                            field408[var4++] = var81.field2695;
                            continue;
                        }
                        if (var381 == 2701) {
                            var4--;
                            class158 var82 = class158.method139(field408[var4]);
                            if (var82.field2695 == -1) {
                                field408[var4++] = 0;
                            } else {
                                field408[var4++] = var82.field2624;
                            }
                            continue;
                        }
                        if (var381 == 2702) {
                            var4--;
                            int var83 = field408[var4];
                            class4 var84 = (class4) client.field663.method3268((long) var83);
                            if (var84 == null) {
                                field408[var4++] = 0;
                            } else {
                                field408[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var381 < 2900) {
                        var4--;
                        class158 var85 = class158.method139(field408[var4]);
                        if (var381 == 2800) {
                            field408[var4++] = class162.method3058(client.method119(var85));
                            continue;
                        }
                        if (var381 == 2801) {
                            var4--;
                            int var86 = field408[var4];
                            int var383 = var86 - 1;
                            if (var85.field2652 != null && var383 < var85.field2652.length && var85.field2652[var383] != null) {
                                field404[var5++] = var85.field2652[var383];
                                continue;
                            }
                            field404[var5++] = "";
                            continue;
                        }
                        if (var381 == 2802) {
                            if (var85.field2648 == null) {
                                field404[var5++] = "";
                            } else {
                                field404[var5++] = var85.field2648;
                            }
                            continue;
                        }
                    } else if (var381 < 3200) {
                        if (var381 == 3100) {
                            var5--;
                            String var87 = field404[var5];
                            Statics.method3033(0, "", var87);
                            continue;
                        }
                        if (var381 == 3101) {
                            var4 -= 2;
                            client.method580(Statics.field1358, field408[var4], field408[var4 + 1]);
                            continue;
                        }
                        if (var381 == 3103) {
                            client.field526.method2265(169);
                            for (class4 var88 = (class4) client.field663.method3271(); var88 != null; var88 = (class4) client.field663.method3272()) {
                                if (var88.field55 == 0 || var88.field55 == 3) {
                                    client.method809(var88, true);
                                }
                            }
                            if (client.field652 != null) {
                                client.method64(client.field652);
                                client.field652 = null;
                            }
                            continue;
                        }
                        if (var381 == 3104) {
                            var5--;
                            String var89 = field404[var5];
                            int var90 = 0;
                            boolean var91 = false;
                            boolean var92 = false;
                            int var93 = 0;
                            int var94 = var89.length();
                            int var95 = 0;
                            boolean var97;
                            while (true) {
                                if (var95 >= var94) {
                                    var97 = var92;
                                    break;
                                }
                                label2615: {
                                    char var96 = var89.charAt(var95);
                                    if (var95 == 0) {
                                        if (var96 == '-') {
                                            var91 = true;
                                            break label2615;
                                        }
                                        if (var96 == '+') {
                                            break label2615;
                                        }
                                    }
                                    int var384;
                                    if (var96 >= '0' && var96 <= '9') {
                                        var384 = var96 - '0';
                                    } else if (var96 >= 'A' && var96 <= 'Z') {
                                        var384 = var96 - '7';
                                    } else {
                                        if (var96 < 'a' || var96 > 'z') {
                                            var97 = false;
                                            break;
                                        }
                                        var384 = var96 - 'W';
                                    }
                                    if (var384 >= 10) {
                                        var97 = false;
                                        break;
                                    }
                                    if (var91) {
                                        var384 = -var384;
                                    }
                                    int var98 = var93 * 10 + var384;
                                    if (var98 / 10 != var93) {
                                        var97 = false;
                                        break;
                                    }
                                    var93 = var98;
                                    var92 = true;
                                }
                                var95++;
                            }
                            if (var97) {
                                var90 = class147.method69(var89);
                            }
                            client.field526.method2265(8);
                            client.field526.method2400(var90);
                            continue;
                        }
                        if (var381 == 3105) {
                            var5--;
                            String var100 = field404[var5];
                            client.field526.method2265(70);
                            client.field526.method2397(var100.length() + 1);
                            client.field526.method2469(var100);
                            continue;
                        }
                        if (var381 == 3106) {
                            var5--;
                            String var101 = field404[var5];
                            client.field526.method2265(29);
                            client.field526.method2397(var101.length() + 1);
                            client.field526.method2469(var101);
                            continue;
                        }
                        if (var381 == 3107) {
                            var4--;
                            int var102 = field408[var4];
                            var5--;
                            String var103 = field404[var5];
                            client.method157(var102, var103);
                            continue;
                        }
                        if (var381 == 3108) {
                            var4 -= 3;
                            int var104 = field408[var4];
                            int var105 = field408[var4 + 1];
                            int var106 = field408[var4 + 2];
                            class158 var107 = class158.method139(var106);
                            client.method546(var107, var104, var105);
                            continue;
                        }
                        if (var381 == 3109) {
                            var4 -= 2;
                            int var108 = field408[var4];
                            int var109 = field408[var4 + 1];
                            class158 var110 = var40 ? Statics.field413 : Statics.field412;
                            client.method546(var110, var108, var109);
                            continue;
                        }
                    } else if (var381 < 3300) {
                        if (var381 == 3200) {
                            var4 -= 3;
                            int var111 = field408[var4];
                            int var112 = field408[var4 + 1];
                            int var113 = field408[var4 + 2];
                            if (client.field726 != 0 && var112 != 0 && client.field481 < 50) {
                                client.field711[client.field481] = var111;
                                client.field730[client.field481] = var112;
                                client.field731[client.field481] = var113;
                                client.field733[client.field481] = null;
                                client.field556[client.field481] = 0;
                                client.field481++;
                            }
                            continue;
                        }
                        if (var381 == 3201) {
                            var4--;
                            int var114 = field408[var4];
                            if (var114 == -1 && !client.field681) {
                                Statics.field2346.method2710();
                                class138.field2345 = 1;
                                Statics.field1518 = null;
                            } else if (var114 != -1 && client.field724 != var114 && client.field682 != 0 && !client.field681) {
                                class138.method1303(2, Statics.field514, var114, 0, client.field682, false);
                            }
                            client.field724 = var114;
                            continue;
                        }
                        if (var381 == 3202) {
                            var4 -= 2;
                            client.method1979(field408[var4], field408[var4 + 1]);
                            continue;
                        }
                    } else if (var381 < 3400) {
                        if (var381 == 3300) {
                            field408[var4++] = client.field491;
                            continue;
                        }
                        if (var381 == 3301) {
                            var4 -= 2;
                            int var115 = field408[var4];
                            int var116 = field408[var4 + 1];
                            field408[var4++] = class19.method251(var115, var116);
                            continue;
                        }
                        if (var381 == 3302) {
                            var4 -= 2;
                            int var117 = field408[var4];
                            int var118 = field408[var4 + 1];
                            int[] var119 = field408;
                            int var120 = var4++;
                            class19 var121 = (class19) class19.field293.method3268((long) var117);
                            int var122;
                            if (var121 == null) {
                                var122 = 0;
                            } else if (var118 >= 0 && var118 < var121.field294.length) {
                                var122 = var121.field294[var118];
                            } else {
                                var122 = 0;
                            }
                            var119[var120] = var122;
                            continue;
                        }
                        if (var381 == 3303) {
                            var4 -= 2;
                            int var123 = field408[var4];
                            int var124 = field408[var4 + 1];
                            field408[var4++] = class19.method3119(var123, var124);
                            continue;
                        }
                        if (var381 == 3304) {
                            var4--;
                            int var125 = field408[var4];
                            int[] var126 = field408;
                            int var127 = var4++;
                            class41 var128 = (class41) class41.field1035.method3223((long) var125);
                            class41 var129;
                            if (var128 == null) {
                                byte[] var130 = Statics.field1041.method2932(5, var125);
                                class41 var131 = new class41();
                                if (var130 != null) {
                                    var131.method858(new class127(var130));
                                }
                                class41.field1035.method3225(var131, (long) var125);
                                var129 = var131;
                            } else {
                                var129 = var128;
                            }
                            var126[var127] = var129.field1036;
                            continue;
                        }
                        if (var381 == 3305) {
                            var4--;
                            int var132 = field408[var4];
                            field408[var4++] = client.field626[var132];
                            continue;
                        }
                        if (var381 == 3306) {
                            var4--;
                            int var133 = field408[var4];
                            field408[var4++] = client.field627[var133];
                            continue;
                        }
                        if (var381 == 3307) {
                            var4--;
                            int var134 = field408[var4];
                            field408[var4++] = client.field628[var134];
                            continue;
                        }
                        if (var381 == 3308) {
                            int var135 = Statics.field30;
                            int var136 = (Statics.field1358.field462 >> 7) + Statics.field287;
                            int var137 = (Statics.field1358.field470 >> 7) + Statics.field364;
                            field408[var4++] = (var135 << 28) + (var136 << 14) + var137;
                            continue;
                        }
                        if (var381 == 3309) {
                            var4--;
                            int var138 = field408[var4];
                            field408[var4++] = var138 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var381 == 3310) {
                            var4--;
                            int var139 = field408[var4];
                            field408[var4++] = var139 >> 28;
                            continue;
                        }
                        if (var381 == 3311) {
                            var4--;
                            int var140 = field408[var4];
                            field408[var4++] = var140 & 0x3FFF;
                            continue;
                        }
                        if (var381 == 3312) {
                            field408[var4++] = client.field544 ? 1 : 0;
                            continue;
                        }
                        if (var381 == 3313) {
                            var4 -= 2;
                            int var141 = field408[var4] + 32768;
                            int var142 = field408[var4 + 1];
                            field408[var4++] = class19.method251(var141, var142);
                            continue;
                        }
                        if (var381 == 3314) {
                            var4 -= 2;
                            int var143 = field408[var4] + 32768;
                            int var144 = field408[var4 + 1];
                            int[] var145 = field408;
                            int var146 = var4++;
                            class19 var147 = (class19) class19.field293.method3268((long) var143);
                            int var148;
                            if (var147 == null) {
                                var148 = 0;
                            } else if (var144 >= 0 && var144 < var147.field294.length) {
                                var148 = var147.field294[var144];
                            } else {
                                var148 = 0;
                            }
                            var145[var146] = var148;
                            continue;
                        }
                        if (var381 == 3315) {
                            var4 -= 2;
                            int var149 = field408[var4] + 32768;
                            int var150 = field408[var4 + 1];
                            field408[var4++] = class19.method3119(var149, var150);
                            continue;
                        }
                        if (var381 == 3316) {
                            if (client.field655 >= 2) {
                                field408[var4++] = client.field655;
                            } else {
                                field408[var4++] = 0;
                            }
                            continue;
                        }
                        if (var381 == 3317) {
                            field408[var4++] = client.field736;
                            continue;
                        }
                        if (var381 == 3318) {
                            field408[var4++] = client.field546;
                            continue;
                        }
                        if (var381 == 3321) {
                            field408[var4++] = client.field609;
                            continue;
                        }
                        if (var381 == 3322) {
                            field408[var4++] = client.field654;
                            continue;
                        }
                        if (var381 == 3323) {
                            if (client.field656) {
                                field408[var4++] = 1;
                            } else {
                                field408[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var381 < 3500) {
                        if (var381 == 3400) {
                            var4 -= 2;
                            int var151 = field408[var4];
                            int var152 = field408[var4 + 1];
                            class39 var153 = class39.method769(var151);
                            if (var153.field976 != 's') {
                            }
                            for (int var154 = 0; var154 < var153.field973; var154++) {
                                if (var153.field980[var154] == var152) {
                                    field404[var5++] = var153.field982[var154];
                                    var153 = null;
                                    break;
                                }
                            }
                            if (var153 != null) {
                                field404[var5++] = var153.field985;
                            }
                            continue;
                        }
                        if (var381 == 3408) {
                            var4 -= 4;
                            int var155 = field408[var4];
                            int var156 = field408[var4 + 1];
                            int var157 = field408[var4 + 2];
                            int var158 = field408[var4 + 3];
                            class39 var159 = class39.method769(var157);
                            if (var159.field975 == var155 && var159.field976 == var156) {
                                for (int var160 = 0; var160 < var159.field973; var160++) {
                                    if (var159.field980[var160] == var158) {
                                        if (var156 == 115) {
                                            field404[var5++] = var159.field982[var160];
                                        } else {
                                            field408[var4++] = var159.field981[var160];
                                        }
                                        var159 = null;
                                        break;
                                    }
                                }
                                if (var159 != null) {
                                    if (var156 == 115) {
                                        field404[var5++] = var159.field985;
                                    } else {
                                        field408[var4++] = var159.field978;
                                    }
                                }
                                continue;
                            }
                            if (var156 == 115) {
                                field404[var5++] = "null";
                            } else {
                                field408[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var381 < 3700) {
                        if (var381 == 3600) {
                            if (client.field741 == 0) {
                                field408[var4++] = -2;
                            } else if (client.field741 == 1) {
                                field408[var4++] = -1;
                            } else {
                                field408[var4++] = client.field705;
                            }
                            continue;
                        }
                        if (var381 == 3601) {
                            var4--;
                            int var161 = field408[var4];
                            if (client.field741 == 2 && var161 < client.field705) {
                                field404[var5++] = client.field742[var161].field372;
                                continue;
                            }
                            field404[var5++] = "";
                            continue;
                        }
                        if (var381 == 3602) {
                            var4--;
                            int var162 = field408[var4];
                            if (client.field741 == 2 && var162 < client.field705) {
                                field408[var4++] = client.field742[var162].field375;
                                continue;
                            }
                            field408[var4++] = 0;
                            continue;
                        }
                        if (var381 == 3603) {
                            var4--;
                            int var163 = field408[var4];
                            if (client.field741 == 2 && var163 < client.field705) {
                                field408[var4++] = client.field742[var163].field370;
                                continue;
                            }
                            field408[var4++] = 0;
                            continue;
                        }
                        if (var381 == 3604) {
                            var5--;
                            String var164 = field404[var5];
                            var4--;
                            int var165 = field408[var4];
                            client.method1434(var164, var165);
                            continue;
                        }
                        if (var381 == 3605) {
                            var5--;
                            String var166 = field404[var5];
                            if (var166 == null) {
                                continue;
                            }
                            if ((client.field705 < 200 || client.field615 == 1) && client.field705 < 400) {
                                String var167 = class148.method38(var166, Statics.field728);
                                if (var167 == null) {
                                    continue;
                                }
                                for (int var168 = 0; var168 < client.field705; var168++) {
                                    class23 var169 = client.field742[var168];
                                    String var170 = class148.method38(var169.field372, Statics.field728);
                                    if (var170 != null && var170.equals(var167)) {
                                        Statics.method3033(0, "", var166 + class134.field2244);
                                        continue label2430;
                                    }
                                    if (var169.field371 != null) {
                                        String var171 = class148.method38(var169.field371, Statics.field728);
                                        if (var171 != null && var171.equals(var167)) {
                                            Statics.method3033(0, "", var166 + class134.field2244);
                                            continue label2430;
                                        }
                                    }
                                }
                                for (int var172 = 0; var172 < client.field638; var172++) {
                                    class11 var173 = client.field739[var172];
                                    String var174 = class148.method38(var173.field197, Statics.field728);
                                    if (var174 != null && var174.equals(var167)) {
                                        Statics.method3033(0, "", class134.field2129 + var166 + class134.field2250);
                                        continue label2430;
                                    }
                                    if (var173.field196 != null) {
                                        String var175 = class148.method38(var173.field196, Statics.field728);
                                        if (var175 != null && var175.equals(var167)) {
                                            Statics.method3033(0, "", class134.field2129 + var166 + class134.field2250);
                                            continue label2430;
                                        }
                                    }
                                }
                                if (class148.method38(Statics.field1358.field40, Statics.field728).equals(var167)) {
                                    Statics.method3033(0, "", class134.field2247);
                                } else {
                                    client.field526.method2265(108);
                                    client.field526.method2397(class127.method1488(var166));
                                    client.field526.method2469(var166);
                                }
                                continue;
                            }
                            Statics.method3033(0, "", class134.field2157);
                            continue;
                        }
                        if (var381 == 3606) {
                            var5--;
                            String var176 = field404[var5];
                            client.method1458(var176);
                            continue;
                        }
                        if (var381 == 3607) {
                            var5--;
                            String var177 = field404[var5];
                            if (var177 == null) {
                                continue;
                            }
                            if ((client.field638 < 100 || client.field615 == 1) && client.field638 < 400) {
                                String var178 = class148.method38(var177, Statics.field728);
                                if (var178 == null) {
                                    continue;
                                }
                                for (int var179 = 0; var179 < client.field638; var179++) {
                                    class11 var180 = client.field739[var179];
                                    String var181 = class148.method38(var180.field197, Statics.field728);
                                    if (var181 != null && var181.equals(var178)) {
                                        Statics.method3033(0, "", var177 + class134.field2246);
                                        continue label2430;
                                    }
                                    if (var180.field196 != null) {
                                        String var182 = class148.method38(var180.field196, Statics.field728);
                                        if (var182 != null && var182.equals(var178)) {
                                            Statics.method3033(0, "", var177 + class134.field2246);
                                            continue label2430;
                                        }
                                    }
                                }
                                for (int var183 = 0; var183 < client.field705; var183++) {
                                    class23 var184 = client.field742[var183];
                                    String var185 = class148.method38(var184.field372, Statics.field728);
                                    if (var185 != null && var185.equals(var178)) {
                                        Statics.method3033(0, "", class134.field2251 + var177 + class134.field2252);
                                        continue label2430;
                                    }
                                    if (var184.field371 != null) {
                                        String var186 = class148.method38(var184.field371, Statics.field728);
                                        if (var186 != null && var186.equals(var178)) {
                                            Statics.method3033(0, "", class134.field2251 + var177 + class134.field2252);
                                            continue label2430;
                                        }
                                    }
                                }
                                if (class148.method38(Statics.field1358.field40, Statics.field728).equals(var178)) {
                                    Statics.method3033(0, "", class134.field2248);
                                } else {
                                    client.field526.method2265(215);
                                    client.field526.method2397(class127.method1488(var177));
                                    client.field526.method2469(var177);
                                }
                                continue;
                            }
                            Statics.method3033(0, "", class134.field2245);
                            continue;
                        }
                        if (var381 == 3608) {
                            var5--;
                            String var187 = field404[var5];
                            client.method236(var187);
                            continue;
                        }
                        if (var381 == 3609) {
                            var5--;
                            String var188 = field404[var5];
                            if (var188.startsWith(class2.method1236(0)) || var188.startsWith(class2.method1236(1))) {
                                var188 = var188.substring(7);
                            }
                            field408[var4++] = client.method232(var188) ? 1 : 0;
                            continue;
                        }
                        if (var381 == 3611) {
                            if (client.field713 == null) {
                                field404[var5++] = "";
                            } else {
                                field404[var5++] = class146.method1329(client.field713);
                            }
                            continue;
                        }
                        if (var381 == 3612) {
                            if (client.field713 == null) {
                                field408[var4++] = 0;
                            } else {
                                field408[var4++] = Statics.field22;
                            }
                            continue;
                        }
                        if (var381 == 3613) {
                            var4--;
                            int var189 = field408[var4];
                            if (client.field713 != null && var189 < Statics.field22) {
                                field404[var5++] = Statics.field1530[var189].field123;
                                continue;
                            }
                            field404[var5++] = "";
                            continue;
                        }
                        if (var381 == 3614) {
                            var4--;
                            int var190 = field408[var4];
                            if (client.field713 != null && var190 < Statics.field22) {
                                field408[var4++] = Statics.field1530[var190].field120;
                                continue;
                            }
                            field408[var4++] = 0;
                            continue;
                        }
                        if (var381 == 3615) {
                            var4--;
                            int var191 = field408[var4];
                            if (client.field713 != null && var191 < Statics.field22) {
                                field408[var4++] = Statics.field1530[var191].field132;
                                continue;
                            }
                            field408[var4++] = 0;
                            continue;
                        }
                        if (var381 == 3616) {
                            field408[var4++] = Statics.field1328;
                            continue;
                        }
                        if (var381 == 3617) {
                            var5--;
                            String var192 = field404[var5];
                            client.method1535(var192);
                            continue;
                        }
                        if (var381 == 3618) {
                            field408[var4++] = Statics.field10;
                            continue;
                        }
                        if (var381 == 3619) {
                            var5--;
                            String var193 = field404[var5];
                            client.method1542(var193);
                            continue;
                        }
                        if (var381 == 3620) {
                            client.method136();
                            continue;
                        }
                        if (var381 == 3621) {
                            if (client.field741 == 0) {
                                field408[var4++] = -1;
                            } else {
                                field408[var4++] = client.field638;
                            }
                            continue;
                        }
                        if (var381 == 3622) {
                            var4--;
                            int var194 = field408[var4];
                            if (client.field741 != 0 && var194 < client.field638) {
                                field404[var5++] = client.field739[var194].field197;
                                continue;
                            }
                            field404[var5++] = "";
                            continue;
                        }
                        if (var381 == 3623) {
                            var5--;
                            String var195 = field404[var5];
                            if (var195.startsWith(class2.method1236(0)) || var195.startsWith(class2.method1236(1))) {
                                var195 = var195.substring(7);
                            }
                            field408[var4++] = client.method144(var195) ? 1 : 0;
                            continue;
                        }
                        if (var381 == 3624) {
                            var4--;
                            int var196 = field408[var4];
                            if (Statics.field1530 != null && var196 < Statics.field22 && Statics.field1530[var196].field123.equalsIgnoreCase(Statics.field1358.field40)) {
                                field408[var4++] = 1;
                                continue;
                            }
                            field408[var4++] = 0;
                            continue;
                        }
                        if (var381 == 3625) {
                            if (client.field640 == null) {
                                field404[var5++] = "";
                                continue;
                            }
                            String[] var197 = field404;
                            int var198 = var5++;
                            String var199 = client.field640;
                            long var200 = 0L;
                            int var202 = var199.length();
                            for (int var203 = 0; var203 < var202; var203++) {
                                var200 *= 37L;
                                char var204 = var199.charAt(var203);
                                if (var204 >= 'A' && var204 <= 'Z') {
                                    var200 += (long) (var204 + 1 - 65);
                                } else if (var204 >= 'a' && var204 <= 'z') {
                                    var200 += (long) (var204 + 1 - 97);
                                } else if (var204 >= '0' && var204 <= '9') {
                                    var200 += (long) (var204 + 27 - 48);
                                }
                                if (var200 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var200 % 37L == 0L && var200 != 0L) {
                                var200 /= 37L;
                            }
                            String var207 = Statics.method1978(var200);
                            if (var207 == null) {
                                var207 = "";
                            }
                            var197[var198] = var207;
                            continue;
                        }
                    } else if (var381 < 4100) {
                        if (var381 == 4000) {
                            var4 -= 2;
                            int var209 = field408[var4];
                            int var210 = field408[var4 + 1];
                            field408[var4++] = var209 + var210;
                            continue;
                        }
                        if (var381 == 4001) {
                            var4 -= 2;
                            int var211 = field408[var4];
                            int var212 = field408[var4 + 1];
                            field408[var4++] = var211 - var212;
                            continue;
                        }
                        if (var381 == 4002) {
                            var4 -= 2;
                            int var213 = field408[var4];
                            int var214 = field408[var4 + 1];
                            field408[var4++] = var213 * var214;
                            continue;
                        }
                        if (var381 == 4003) {
                            var4 -= 2;
                            int var215 = field408[var4];
                            int var216 = field408[var4 + 1];
                            field408[var4++] = var215 / var216;
                            continue;
                        }
                        if (var381 == 4004) {
                            var4--;
                            int var217 = field408[var4];
                            field408[var4++] = (int) (Math.random() * (double) var217);
                            continue;
                        }
                        if (var381 == 4005) {
                            var4--;
                            int var218 = field408[var4];
                            field408[var4++] = (int) (Math.random() * (double) (var218 + 1));
                            continue;
                        }
                        if (var381 == 4006) {
                            var4 -= 5;
                            int var219 = field408[var4];
                            int var220 = field408[var4 + 1];
                            int var221 = field408[var4 + 2];
                            int var222 = field408[var4 + 3];
                            int var223 = field408[var4 + 4];
                            field408[var4++] = (var220 - var219) * (var223 - var221) / (var222 - var221) + var219;
                            continue;
                        }
                        if (var381 == 4007) {
                            var4 -= 2;
                            int var224 = field408[var4];
                            int var225 = field408[var4 + 1];
                            field408[var4++] = var224 * var225 / 100 + var224;
                            continue;
                        }
                        if (var381 == 4008) {
                            var4 -= 2;
                            int var226 = field408[var4];
                            int var227 = field408[var4 + 1];
                            field408[var4++] = var226 | 0x1 << var227;
                            continue;
                        }
                        if (var381 == 4009) {
                            var4 -= 2;
                            int var228 = field408[var4];
                            int var229 = field408[var4 + 1];
                            field408[var4++] = var228 & -1 - (0x1 << var229);
                            continue;
                        }
                        if (var381 == 4010) {
                            var4 -= 2;
                            int var230 = field408[var4];
                            int var231 = field408[var4 + 1];
                            field408[var4++] = (var230 & 0x1 << var231) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var381 == 4011) {
                            var4 -= 2;
                            int var232 = field408[var4];
                            int var233 = field408[var4 + 1];
                            field408[var4++] = var232 % var233;
                            continue;
                        }
                        if (var381 == 4012) {
                            var4 -= 2;
                            int var234 = field408[var4];
                            int var235 = field408[var4 + 1];
                            if (var234 == 0) {
                                field408[var4++] = 0;
                            } else {
                                field408[var4++] = (int) Math.pow((double) var234, (double) var235);
                            }
                            continue;
                        }
                        if (var381 == 4013) {
                            var4 -= 2;
                            int var236 = field408[var4];
                            int var237 = field408[var4 + 1];
                            if (var236 == 0) {
                                field408[var4++] = 0;
                            } else if (var237 == 0) {
                                field408[var4++] = Integer.MAX_VALUE;
                            } else {
                                field408[var4++] = (int) Math.pow((double) var236, 1.0D / (double) var237);
                            }
                            continue;
                        }
                        if (var381 == 4014) {
                            var4 -= 2;
                            int var238 = field408[var4];
                            int var239 = field408[var4 + 1];
                            field408[var4++] = var238 & var239;
                            continue;
                        }
                        if (var381 == 4015) {
                            var4 -= 2;
                            int var240 = field408[var4];
                            int var241 = field408[var4 + 1];
                            field408[var4++] = var240 | var241;
                            continue;
                        }
                    } else if (var381 < 4200) {
                        if (var381 == 4100) {
                            var5--;
                            String var242 = field404[var5];
                            var4--;
                            int var243 = field408[var4];
                            field404[var5++] = var242 + var243;
                            continue;
                        }
                        if (var381 == 4101) {
                            var5 -= 2;
                            String var244 = field404[var5];
                            String var245 = field404[var5 + 1];
                            field404[var5++] = var244 + var245;
                            continue;
                        }
                        if (var381 == 4102) {
                            var5--;
                            String var246 = field404[var5];
                            var4--;
                            int var247 = field408[var4];
                            String[] var248 = field404;
                            int var249 = var5++;
                            String var251;
                            if (var247 < 0) {
                                var251 = Integer.toString(var247);
                            } else {
                                int var252 = var247;
                                String var253;
                                if (var247 < 0) {
                                    var253 = Integer.toString(var247, 10);
                                } else {
                                    int var254 = 2;
                                    int var255 = var247 / 10;
                                    while (var255 != 0) {
                                        var255 /= 10;
                                        var254++;
                                    }
                                    char[] var256 = new char[var254];
                                    var256[0] = '+';
                                    for (int var257 = var254 - 1; var257 > 0; var257--) {
                                        int var258 = var252;
                                        var252 /= 10;
                                        int var259 = var258 - var252 * 10;
                                        if (var259 >= 10) {
                                            var256[var257] = (char) (var259 + 87);
                                        } else {
                                            var256[var257] = (char) (var259 + 48);
                                        }
                                    }
                                    var253 = new String(var256);
                                }
                                var251 = var253;
                            }
                            var248[var249] = var246 + var251;
                            continue;
                        }
                        if (var381 == 4103) {
                            var5--;
                            String var260 = field404[var5];
                            field404[var5++] = var260.toLowerCase();
                            continue;
                        }
                        if (var381 == 4104) {
                            var4--;
                            int var261 = field408[var4];
                            long var262 = ((long) var261 + 11745L) * 86400000L;
                            field414.setTime(new Date(var262));
                            int var264 = field414.get(5);
                            int var265 = field414.get(2);
                            int var266 = field414.get(1);
                            field404[var5++] = var264 + "-" + field407[var265] + "-" + var266;
                            continue;
                        }
                        if (var381 == 4105) {
                            var5 -= 2;
                            String var267 = field404[var5];
                            String var268 = field404[var5 + 1];
                            if (Statics.field1358.field32 != null && Statics.field1358.field32.field2743) {
                                field404[var5++] = var268;
                                continue;
                            }
                            field404[var5++] = var267;
                            continue;
                        }
                        if (var381 == 4106) {
                            var4--;
                            int var269 = field408[var4];
                            field404[var5++] = Integer.toString(var269);
                            continue;
                        }
                        if (var381 == 4107) {
                            var5 -= 2;
                            int[] var270 = field408;
                            int var271 = var4++;
                            String var272 = field404[var5];
                            String var273 = field404[var5 + 1];
                            int var274 = client.field488;
                            int var275 = var272.length();
                            int var276 = var273.length();
                            int var277 = 0;
                            int var278 = 0;
                            char var279 = 0;
                            char var280 = 0;
                            int var281;
                            label2272: while (true) {
                                if (var277 - var279 >= var275 && var278 - var280 >= var276) {
                                    int var290 = Math.min(var275, var276);
                                    for (int var291 = 0; var291 < var290; var291++) {
                                        char var294 = var272.charAt(var291);
                                        char var295 = var273.charAt(var291);
                                        if (var294 != var295 && Character.toUpperCase(var294) != Character.toUpperCase(var295)) {
                                            char var296 = Character.toLowerCase(var294);
                                            char var297 = Character.toLowerCase(var295);
                                            if (var296 != var297) {
                                                var281 = class150.method254(var296, var274) - class150.method254(var297, var274);
                                                break label2272;
                                            }
                                        }
                                    }
                                    int var298 = var275 - var276;
                                    if (var298 == 0) {
                                        for (int var299 = 0; var299 < var290; var299++) {
                                            char var300 = var272.charAt(var299);
                                            char var301 = var273.charAt(var299);
                                            if (var300 != var301) {
                                                var281 = class150.method254(var300, var274) - class150.method254(var301, var274);
                                                break label2272;
                                            }
                                        }
                                        var281 = 0;
                                    } else {
                                        var281 = var298;
                                    }
                                    break;
                                }
                                if (var277 - var279 >= var275) {
                                    var281 = -1;
                                    break;
                                }
                                if (var278 - var280 >= var276) {
                                    var281 = 1;
                                    break;
                                }
                                char var282;
                                if (var279 == 0) {
                                    var282 = var272.charAt(var277++);
                                } else {
                                    var282 = var279;
                                    boolean var283 = false;
                                }
                                char var284;
                                if (var280 == 0) {
                                    var284 = var273.charAt(var278++);
                                } else {
                                    var284 = var280;
                                    boolean var285 = false;
                                }
                                var279 = class150.method231(var282);
                                var280 = class150.method231(var284);
                                char var286 = Statics.method2260(var282, var274);
                                char var287 = Statics.method2260(var284, var274);
                                if (var286 != var287 && Character.toUpperCase(var286) != Character.toUpperCase(var287)) {
                                    char var288 = Character.toLowerCase(var286);
                                    char var289 = Character.toLowerCase(var287);
                                    if (var288 != var289) {
                                        var281 = class150.method254(var288, var274) - class150.method254(var289, var274);
                                        break;
                                    }
                                }
                            }
                            byte var303;
                            if (var281 > 0) {
                                var303 = 1;
                            } else if (var281 < 0) {
                                var303 = -1;
                            } else {
                                var303 = 0;
                            }
                            var270[var271] = var303;
                            continue;
                        }
                        if (var381 == 4108) {
                            var5--;
                            String var304 = field404[var5];
                            var4 -= 2;
                            int var305 = field408[var4];
                            int var306 = field408[var4 + 1];
                            byte[] var307 = Statics.field102.method2932(var306, 0);
                            class183 var308 = new class183(var307);
                            field408[var4++] = var308.method3349(var304, var305);
                            continue;
                        }
                        if (var381 == 4109) {
                            var5--;
                            String var309 = field404[var5];
                            var4 -= 2;
                            int var310 = field408[var4];
                            int var311 = field408[var4 + 1];
                            byte[] var312 = Statics.field102.method2932(var311, 0);
                            class183 var313 = new class183(var312);
                            field408[var4++] = var313.method3348(var309, var310);
                            continue;
                        }
                        if (var381 == 4110) {
                            var5 -= 2;
                            String var314 = field404[var5];
                            String var315 = field404[var5 + 1];
                            var4--;
                            if (field408[var4] == 1) {
                                field404[var5++] = var314;
                            } else {
                                field404[var5++] = var315;
                            }
                            continue;
                        }
                        if (var381 == 4111) {
                            var5--;
                            String var316 = field404[var5];
                            field404[var5++] = class185.method3350(var316);
                            continue;
                        }
                        if (var381 == 4112) {
                            var5--;
                            String var317 = field404[var5];
                            var4--;
                            int var318 = field408[var4];
                            field404[var5++] = var317 + (char) var318;
                            continue;
                        }
                        if (var381 == 4113) {
                            var4--;
                            int var319 = field408[var4];
                            field408[var4++] = class147.method2060((char) var319) ? 1 : 0;
                            continue;
                        }
                        if (var381 == 4114) {
                            var4--;
                            int var320 = field408[var4];
                            int[] var321 = field408;
                            int var322 = var4++;
                            char var323 = (char) var320;
                            boolean var324 = var323 >= '0' && var323 <= '9' || var323 >= 'A' && var323 <= 'Z' || var323 >= 'a' && var323 <= 'z';
                            var321[var322] = var324 ? 1 : 0;
                            continue;
                        }
                        if (var381 == 4115) {
                            var4--;
                            int var325 = field408[var4];
                            int[] var326 = field408;
                            int var327 = var4++;
                            char var328 = (char) var325;
                            boolean var329 = var328 >= 'A' && var328 <= 'Z' || var328 >= 'a' && var328 <= 'z';
                            var326[var327] = var329 ? 1 : 0;
                            continue;
                        }
                        if (var381 == 4116) {
                            var4--;
                            int var330 = field408[var4];
                            field408[var4++] = class147.method1195((char) var330) ? 1 : 0;
                            continue;
                        }
                        if (var381 == 4117) {
                            var5--;
                            String var331 = field404[var5];
                            if (var331 == null) {
                                field408[var4++] = 0;
                            } else {
                                field408[var4++] = var331.length();
                            }
                            continue;
                        }
                        if (var381 == 4118) {
                            var5--;
                            String var332 = field404[var5];
                            var4 -= 2;
                            int var333 = field408[var4];
                            int var334 = field408[var4 + 1];
                            field404[var5++] = var332.substring(var333, var334);
                            continue;
                        }
                        if (var381 == 4119) {
                            var5--;
                            String var335 = field404[var5];
                            StringBuilder var336 = new StringBuilder(var335.length());
                            boolean var337 = false;
                            for (int var338 = 0; var338 < var335.length(); var338++) {
                                char var339 = var335.charAt(var338);
                                if (var339 == '<') {
                                    var337 = true;
                                } else if (var339 == '>') {
                                    var337 = false;
                                } else if (!var337) {
                                    var336.append(var339);
                                }
                            }
                            field404[var5++] = var336.toString();
                            continue;
                        }
                        if (var381 == 4120) {
                            var5--;
                            String var340 = field404[var5];
                            var4--;
                            int var341 = field408[var4];
                            field408[var4++] = var340.indexOf(var341);
                            continue;
                        }
                    } else if (var381 < 4300) {
                        if (var381 == 4200) {
                            var4--;
                            int var342 = field408[var4];
                            field404[var5++] = class40.method44(var342).field996;
                            continue;
                        }
                        if (var381 == 4201) {
                            var4 -= 2;
                            int var343 = field408[var4];
                            int var344 = field408[var4 + 1];
                            class40 var345 = class40.method44(var343);
                            if (var344 >= 1 && var344 <= 5 && var345.field1015[var344 - 1] != null) {
                                field404[var5++] = var345.field1015[var344 - 1];
                                continue;
                            }
                            field404[var5++] = "";
                            continue;
                        }
                        if (var381 == 4202) {
                            var4 -= 2;
                            int var346 = field408[var4];
                            int var347 = field408[var4 + 1];
                            class40 var348 = class40.method44(var346);
                            if (var347 >= 1 && var347 <= 5 && var348.field1011[var347 - 1] != null) {
                                field404[var5++] = var348.field1011[var347 - 1];
                                continue;
                            }
                            field404[var5++] = "";
                            continue;
                        }
                        if (var381 == 4203) {
                            var4--;
                            int var349 = field408[var4];
                            field408[var4++] = class40.method44(var349).field1010;
                            continue;
                        }
                        if (var381 == 4204) {
                            var4--;
                            int var350 = field408[var4];
                            field408[var4++] = class40.method44(var350).field1007 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var381 == 4205) {
                            var4--;
                            int var351 = field408[var4];
                            class40 var352 = class40.method44(var351);
                            if (var352.field1033 == -1 && var352.field995 >= 0) {
                                field408[var4++] = var352.field995;
                                continue;
                            }
                            field408[var4++] = var351;
                            continue;
                        }
                        if (var381 == 4206) {
                            var4--;
                            int var353 = field408[var4];
                            class40 var354 = class40.method44(var353);
                            if (var354.field1033 >= 0 && var354.field995 >= 0) {
                                field408[var4++] = var354.field995;
                                continue;
                            }
                            field408[var4++] = var353;
                            continue;
                        }
                        if (var381 == 4207) {
                            var4--;
                            int var355 = field408[var4];
                            field408[var4++] = class40.method44(var355).field1009 ? 1 : 0;
                            continue;
                        }
                    } else if (var381 < 5100) {
                        if (var381 == 5000) {
                            field408[var4++] = client.field555;
                            continue;
                        }
                        if (var381 == 5001) {
                            var4 -= 3;
                            client.field555 = field408[var4];
                            Statics.field1394 = class137.method224(field408[var4 + 1]);
                            if (Statics.field1394 == null) {
                                Statics.field1394 = class137.field2341;
                            }
                            client.field716 = field408[var4 + 2];
                            client.field526.method2265(150);
                            client.field526.method2397(client.field555);
                            client.field526.method2397(Statics.field1394.field2338);
                            client.field526.method2397(client.field716);
                            continue;
                        }
                        if (var381 == 5002) {
                            var5--;
                            String var356 = field404[var5];
                            var4 -= 2;
                            int var357 = field408[var4];
                            int var358 = field408[var4 + 1];
                            client.field526.method2265(82);
                            client.field526.method2397(class127.method1488(var356) + 2);
                            client.field526.method2469(var356);
                            client.field526.method2397(var357 - 1);
                            client.field526.method2397(var358);
                            continue;
                        }
                        if (var381 == 5003) {
                            var4--;
                            int var359 = field408[var4];
                            String var360 = null;
                            if (var359 < 100) {
                                var360 = client.field702[var359];
                            }
                            if (var360 == null) {
                                var360 = "";
                            }
                            field404[var5++] = var360;
                            continue;
                        }
                        if (var381 == 5004) {
                            var4--;
                            int var361 = field408[var4];
                            int var362 = -1;
                            if (var361 < 100 && client.field702[var361] != null) {
                                var362 = client.field699[var361];
                            }
                            field408[var4++] = var362;
                            continue;
                        }
                        if (var381 == 5005) {
                            if (Statics.field1394 == null) {
                                field408[var4++] = -1;
                            } else {
                                field408[var4++] = Statics.field1394.field2338;
                            }
                            continue;
                        }
                        if (var381 == 5008) {
                            var5--;
                            String var363 = field404[var5];
                            if (var363.startsWith("::")) {
                                client.method33(var363);
                            } else {
                                String var364 = var363.toLowerCase();
                                byte var365 = 0;
                                if (var364.startsWith(class134.field2164)) {
                                    var365 = 0;
                                    var363 = var363.substring(class134.field2164.length());
                                } else if (var364.startsWith(class134.field2255)) {
                                    var365 = 1;
                                    var363 = var363.substring(class134.field2255.length());
                                } else if (var364.startsWith(class134.field2257)) {
                                    var365 = 2;
                                    var363 = var363.substring(class134.field2257.length());
                                } else if (var364.startsWith(class134.field2259)) {
                                    var365 = 3;
                                    var363 = var363.substring(class134.field2259.length());
                                } else if (var364.startsWith(class134.field2261)) {
                                    var365 = 4;
                                    var363 = var363.substring(class134.field2261.length());
                                } else if (var364.startsWith(class134.field2150)) {
                                    var365 = 5;
                                    var363 = var363.substring(class134.field2150.length());
                                } else if (var364.startsWith(class134.field2265)) {
                                    var365 = 6;
                                    var363 = var363.substring(class134.field2265.length());
                                } else if (var364.startsWith(class134.field2267)) {
                                    var365 = 7;
                                    var363 = var363.substring(class134.field2267.length());
                                } else if (var364.startsWith(class134.field2269)) {
                                    var365 = 8;
                                    var363 = var363.substring(class134.field2269.length());
                                } else if (var364.startsWith(class134.field2271)) {
                                    var365 = 9;
                                    var363 = var363.substring(class134.field2271.length());
                                } else if (var364.startsWith(class134.field2117)) {
                                    var365 = 10;
                                    var363 = var363.substring(class134.field2117.length());
                                } else if (var364.startsWith(class134.field2275)) {
                                    var365 = 11;
                                    var363 = var363.substring(class134.field2275.length());
                                } else if (client.field488 != 0) {
                                    if (var364.startsWith(class134.field2254)) {
                                        var365 = 0;
                                        var363 = var363.substring(class134.field2254.length());
                                    } else if (var364.startsWith(class134.field2256)) {
                                        var365 = 1;
                                        var363 = var363.substring(class134.field2256.length());
                                    } else if (var364.startsWith(class134.field2170)) {
                                        var365 = 2;
                                        var363 = var363.substring(class134.field2170.length());
                                    } else if (var364.startsWith(class134.field2260)) {
                                        var365 = 3;
                                        var363 = var363.substring(class134.field2260.length());
                                    } else if (var364.startsWith(class134.field2262)) {
                                        var365 = 4;
                                        var363 = var363.substring(class134.field2262.length());
                                    } else if (var364.startsWith(class134.field2243)) {
                                        var365 = 5;
                                        var363 = var363.substring(class134.field2243.length());
                                    } else if (var364.startsWith(class134.field2266)) {
                                        var365 = 6;
                                        var363 = var363.substring(class134.field2266.length());
                                    } else if (var364.startsWith(class134.field2268)) {
                                        var365 = 7;
                                        var363 = var363.substring(class134.field2268.length());
                                    } else if (var364.startsWith(class134.field2276)) {
                                        var365 = 8;
                                        var363 = var363.substring(class134.field2276.length());
                                    } else if (var364.startsWith(class134.field2272)) {
                                        var365 = 9;
                                        var363 = var363.substring(class134.field2272.length());
                                    } else if (var364.startsWith(class134.field2274)) {
                                        var365 = 10;
                                        var363 = var363.substring(class134.field2274.length());
                                    } else if (var364.startsWith(class134.field2185)) {
                                        var365 = 11;
                                        var363 = var363.substring(class134.field2185.length());
                                    }
                                }
                                String var366 = var363.toLowerCase();
                                byte var367 = 0;
                                if (var366.startsWith(class134.field2277)) {
                                    var367 = 1;
                                    var363 = var363.substring(class134.field2277.length());
                                } else if (var366.startsWith(class134.field2193)) {
                                    var367 = 2;
                                    var363 = var363.substring(class134.field2193.length());
                                } else if (var366.startsWith(class134.field2281)) {
                                    var367 = 3;
                                    var363 = var363.substring(class134.field2281.length());
                                } else if (var366.startsWith(class134.field2283)) {
                                    var367 = 4;
                                    var363 = var363.substring(class134.field2283.length());
                                } else if (var366.startsWith(class134.field2285)) {
                                    var367 = 5;
                                    var363 = var363.substring(class134.field2285.length());
                                } else if (client.field488 != 0) {
                                    if (var366.startsWith(class134.field2278)) {
                                        var367 = 1;
                                        var363 = var363.substring(class134.field2278.length());
                                    } else if (var366.startsWith(class134.field2280)) {
                                        var367 = 2;
                                        var363 = var363.substring(class134.field2280.length());
                                    } else if (var366.startsWith(class134.field2086)) {
                                        var367 = 3;
                                        var363 = var363.substring(class134.field2086.length());
                                    } else if (var366.startsWith(class134.field2233)) {
                                        var367 = 4;
                                        var363 = var363.substring(class134.field2233.length());
                                    } else if (var366.startsWith(class134.field2286)) {
                                        var367 = 5;
                                        var363 = var363.substring(class134.field2286.length());
                                    }
                                }
                                client.field526.method2265(235);
                                client.field526.method2397(0);
                                int var368 = client.field526.field2037;
                                client.field526.method2397(var365);
                                client.field526.method2397(var367);
                                class184.method234(client.field526, var363);
                                client.field526.method2408(client.field526.field2037 - var368);
                            }
                            continue;
                        }
                        if (var381 == 5009) {
                            var5 -= 2;
                            String var369 = field404[var5];
                            String var370 = field404[var5 + 1];
                            client.field526.method2265(132);
                            client.field526.method2398(0);
                            int var371 = client.field526.field2037;
                            client.field526.method2469(var369);
                            class184.method234(client.field526, var370);
                            client.field526.method2407(client.field526.field2037 - var371);
                            continue;
                        }
                        if (var381 == 5010) {
                            var4--;
                            int var372 = field408[var4];
                            String var373 = null;
                            if (var372 < 100) {
                                var373 = client.field700[var372];
                            }
                            if (var373 == null) {
                                var373 = "";
                            }
                            field404[var5++] = var373;
                            continue;
                        }
                        if (var381 == 5011) {
                            var4--;
                            int var374 = field408[var4];
                            String var375 = null;
                            if (var374 < 100) {
                                var375 = client.field701[var374];
                            }
                            if (var375 == null) {
                                var375 = "";
                            }
                            field404[var5++] = var375;
                            continue;
                        }
                        if (var381 == 5015) {
                            String var376;
                            if (Statics.field1358 == null || Statics.field1358.field40 == null) {
                                var376 = "";
                            } else {
                                var376 = Statics.field1358.field40;
                            }
                            field404[var5++] = var376;
                            continue;
                        }
                        if (var381 == 5016) {
                            field408[var4++] = client.field716;
                            continue;
                        }
                        if (var381 == 5017) {
                            field408[var4++] = client.field703;
                            continue;
                        }
                    }
                } else {
                    class158 var63;
                    if (var381 >= 2000) {
                        var381 -= 1000;
                        var4--;
                        var63 = class158.method139(field408[var4]);
                    } else {
                        var63 = var40 ? Statics.field413 : Statics.field412;
                    }
                    if (var381 == 1300) {
                        var4--;
                        int var64 = field408[var4] - 1;
                        if (var64 >= 0 && var64 <= 9) {
                            var5--;
                            var63.method3079(var64, field404[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var381 == 1301) {
                        var4 -= 2;
                        int var65 = field408[var4];
                        int var66 = field408[var4 + 1];
                        var63.field2653 = class158.method1789(var65, var66);
                        continue;
                    }
                    if (var381 == 1302) {
                        var4--;
                        var63.field2656 = field408[var4] == 1;
                        continue;
                    }
                    if (var381 == 1303) {
                        var4--;
                        var63.field2654 = field408[var4];
                        continue;
                    }
                    if (var381 == 1304) {
                        var4--;
                        var63.field2655 = field408[var4];
                        continue;
                    }
                    if (var381 == 1305) {
                        var5--;
                        var63.field2648 = field404[var5];
                        continue;
                    }
                    if (var381 == 1306) {
                        var5--;
                        var63.field2636 = field404[var5];
                        continue;
                    }
                    if (var381 == 1307) {
                        var63.field2652 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var380) {
            StringBuilder var378 = new StringBuilder(30);
            var378.append("").append(var3.field2818).append(" ");
            for (int var379 = field410 - 1; var379 >= 0; var379--) {
                var378.append("").append(field417[var379].field279.field2818).append(" ");
            }
            var378.append("").append(var9);
            class80.method252(var378.toString(), var380);
        }
    }

    @ObfuscatedName("i.p(II)V")
    public static void method2(int arg0) {
        if (arg0 == -1 || !Statics.method2702(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2595[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3.field2588 != null) {
                class1 var4 = new class1();
                var4.field1 = var3;
                var4.field8 = var3.field2588;
                method1269(var4);
            }
        }
    }
}
