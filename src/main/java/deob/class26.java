package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("z")
public class class26 {

    @ObfuscatedName("z.o")
    public static int[] field377 = new int[5];

    @ObfuscatedName("z.a")
    public static int[][] field391 = new int[5][5000];

    @ObfuscatedName("z.w")
    public static int[] field379 = new int[1000];

    @ObfuscatedName("z.i")
    public static String[] field380 = new String[1000];

    @ObfuscatedName("z.y")
    public static int field388 = 0;

    @ObfuscatedName("z.m")
    public static class18[] field382 = new class18[50];

    @ObfuscatedName("z.e")
    public static Calendar field375 = Calendar.getInstance();

    @ObfuscatedName("z.r")
    public static final String[] field385 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.p(Lp;I)V")
    public static void method47(class1 arg0) {
        method2245(arg0, 200000);
    }

    @ObfuscatedName("dj.l(Lp;IS)V")
    public static void method2245(class1 arg0, int arg1) {
        Object[] var2 = arg0.field6;
        int var3 = (Integer) var2[0];
        class5 var4 = class5.method133(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field60;
        int[] var9 = var4.field71;
        byte var10 = -1;
        field388 = 0;
        try {
            Statics.field373 = new int[var4.field63];
            int var11 = 0;
            Statics.field376 = new String[var4.field61];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field3;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field2 == null ? -1 : arg0.field2.field2673;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field2 == null ? -1 : arg0.field2.field2603;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field5 == null ? -1 : arg0.field5.field2673;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field5 == null ? -1 : arg0.field5.field2603;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field13;
                    }
                    Statics.field373[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field9;
                    }
                    Statics.field376[var12++] = var15;
                }
            }
            int var16 = 0;
            label2156: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var339 = var8[var7];
                if (var339 < 100) {
                    if (var339 == 0) {
                        field379[var5++] = var9[var7];
                        continue;
                    }
                    if (var339 == 1) {
                        int var17 = var9[var7];
                        field379[var5++] = class160.field2725[var17];
                        continue;
                    }
                    if (var339 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class160.field2725[var18] = field379[var5];
                        client.method3292(var18);
                        continue;
                    }
                    if (var339 == 3) {
                        field380[var6++] = var4.field69[var7];
                        continue;
                    }
                    if (var339 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var339 == 7) {
                        var5 -= 2;
                        if (field379[var5 + 1] != field379[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var339 == 8) {
                        var5 -= 2;
                        if (field379[var5 + 1] == field379[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var339 == 9) {
                        var5 -= 2;
                        if (field379[var5] < field379[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var339 == 10) {
                        var5 -= 2;
                        if (field379[var5] > field379[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var339 == 21) {
                        if (field388 == 0) {
                            return;
                        }
                        class18 var19 = field382[--field388];
                        var4 = var19.field253;
                        var8 = var4.field60;
                        var9 = var4.field71;
                        var7 = var19.field250;
                        Statics.field373 = var19.field251;
                        Statics.field376 = var19.field252;
                        continue;
                    }
                    if (var339 == 25) {
                        int var20 = var9[var7];
                        field379[var5++] = class160.method905(var20);
                        continue;
                    }
                    if (var339 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class160.method2267(var21, field379[var5]);
                        continue;
                    }
                    if (var339 == 31) {
                        var5 -= 2;
                        if (field379[var5] <= field379[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var339 == 32) {
                        var5 -= 2;
                        if (field379[var5] >= field379[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var339 == 33) {
                        field379[var5++] = Statics.field373[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var339 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field373[var10001] = field379[var5];
                        continue;
                    }
                    if (var339 == 35) {
                        field380[var6++] = Statics.field376[var9[var7]];
                        continue;
                    }
                    if (var339 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field376[var10001] = field380[var6];
                        continue;
                    }
                    if (var339 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class148.method818(field380, var6, var22);
                        field380[var6++] = var23;
                        continue;
                    }
                    if (var339 == 38) {
                        var5--;
                        continue;
                    }
                    if (var339 == 39) {
                        var6--;
                        continue;
                    }
                    if (var339 == 40) {
                        int var24 = var9[var7];
                        class5 var25 = class5.method133(var24);
                        int[] var26 = new int[var25.field63];
                        String[] var27 = new String[var25.field61];
                        for (int var28 = 0; var28 < var25.field65; var28++) {
                            var26[var28] = field379[var5 - var25.field65 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field66; var29++) {
                            var27[var29] = field380[var6 - var25.field66 + var29];
                        }
                        var5 -= var25.field65;
                        var6 -= var25.field66;
                        class18 var30 = new class18();
                        var30.field253 = var4;
                        var30.field250 = var7;
                        var30.field251 = Statics.field373;
                        var30.field252 = Statics.field376;
                        field382[++field388 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field60;
                        var9 = var25.field71;
                        var7 = -1;
                        Statics.field373 = var26;
                        Statics.field376 = var27;
                        continue;
                    }
                    if (var339 == 42) {
                        field379[var5++] = client.field650[var9[var7]];
                        continue;
                    }
                    if (var339 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field650[var10001] = field379[var5];
                        continue;
                    }
                    if (var339 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field379[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field377[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2156;
                                }
                                field391[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var339 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field379[var5];
                        if (var37 >= 0 && var37 < field377[var36]) {
                            field379[var5++] = field391[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var339 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field379[var5];
                        if (var39 >= 0 && var39 < field377[var38]) {
                            field391[var38][var39] = field379[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var339 == 47) {
                        String var40 = client.field651[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field380[var6++] = var40;
                        continue;
                    }
                    if (var339 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field651[var10001] = field380[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var339 < 1000) {
                    if (var339 == 100) {
                        var5 -= 3;
                        int var42 = field379[var5];
                        int var43 = field379[var5 + 1];
                        int var44 = field379[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class159 var45 = class159.method1397(var42);
                        if (var45.field2595 == null) {
                            var45.field2595 = new class159[var44 + 1];
                        }
                        if (var45.field2595.length <= var44) {
                            class159[] var46 = new class159[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2595.length; var47++) {
                                var46[var47] = var45.field2595[var47];
                            }
                            var45.field2595 = var46;
                        }
                        if (var44 > 0 && var45.field2595[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class159 var48 = new class159();
                        var48.field2705 = var43;
                        var48.field2613 = var48.field2673 = var45.field2673;
                        var48.field2603 = var44;
                        var48.field2601 = true;
                        var45.field2595[var44] = var48;
                        if (var41) {
                            Statics.field956 = var48;
                        } else {
                            Statics.field378 = var48;
                        }
                        client.method1331(var45);
                        continue;
                    }
                    if (var339 == 101) {
                        class159 var49 = var41 ? Statics.field956 : Statics.field378;
                        class159 var50 = class159.method1397(var49.field2673);
                        var50.field2595[var49.field2603] = null;
                        client.method1331(var50);
                        continue;
                    }
                    if (var339 == 102) {
                        var5--;
                        class159 var51 = class159.method1397(field379[var5]);
                        var51.field2595 = null;
                        client.method1331(var51);
                        continue;
                    }
                    if (var339 == 200) {
                        var5 -= 2;
                        int var52 = field379[var5];
                        int var53 = field379[var5 + 1];
                        class159 var54 = class159.method89(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field379[var5++] = 1;
                            if (var41) {
                                Statics.field956 = var54;
                            } else {
                                Statics.field378 = var54;
                            }
                            continue;
                        }
                        field379[var5++] = 0;
                        continue;
                    }
                } else if (!(var339 < 1000 || var339 >= 1100) || !(var339 < 2000 || var339 >= 2100)) {
                    class159 var55;
                    if (var339 >= 2000) {
                        var339 -= 1000;
                        var5--;
                        var55 = class159.method1397(field379[var5]);
                    } else {
                        var55 = var41 ? Statics.field956 : Statics.field378;
                    }
                    if (var339 == 1000) {
                        var5 -= 2;
                        var55.field2607 = field379[var5];
                        var55.field2640 = field379[var5 + 1];
                        client.method1331(var55);
                        continue;
                    }
                    if (var339 == 1001) {
                        var5 -= 2;
                        var55.field2611 = field379[var5];
                        var55.field2672 = field379[var5 + 1];
                        client.method1331(var55);
                        continue;
                    }
                    if (var339 == 1003) {
                        var5--;
                        boolean var56 = field379[var5] == 1;
                        if (var55.field2614 != var56) {
                            var55.field2614 = var56;
                            client.method1331(var55);
                        }
                        continue;
                    }
                } else if (!(var339 < 1100 || var339 >= 1200) || !(var339 < 2100 || var339 >= 2200)) {
                    class159 var57;
                    if (var339 >= 2000) {
                        var339 -= 1000;
                        var5--;
                        var57 = class159.method1397(field379[var5]);
                    } else {
                        var57 = var41 ? Statics.field956 : Statics.field378;
                    }
                    if (var339 == 1100) {
                        var5 -= 2;
                        var57.field2612 = field379[var5];
                        if (var57.field2612 > var57.field2617 - var57.field2611) {
                            var57.field2612 = var57.field2617 - var57.field2611;
                        }
                        if (var57.field2612 < 0) {
                            var57.field2612 = 0;
                        }
                        var57.field2616 = field379[var5 + 1];
                        if (var57.field2616 > var57.field2618 - var57.field2672) {
                            var57.field2616 = var57.field2618 - var57.field2672;
                        }
                        if (var57.field2616 < 0) {
                            var57.field2616 = 0;
                        }
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1101) {
                        var5--;
                        var57.field2619 = field379[var5];
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1102) {
                        var5--;
                        var57.field2623 = field379[var5] == 1;
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1103) {
                        var5--;
                        var57.field2646 = field379[var5];
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1104) {
                        var5--;
                        var57.field2625 = field379[var5];
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1105) {
                        var5--;
                        var57.field2626 = field379[var5];
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1106) {
                        var5--;
                        var57.field2624 = field379[var5];
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1107) {
                        var5--;
                        var57.field2688 = field379[var5] == 1;
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1108) {
                        var57.field2634 = 1;
                        var5--;
                        var57.field2664 = field379[var5];
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1109) {
                        var5 -= 6;
                        var57.field2653 = field379[var5];
                        var57.field2641 = field379[var5 + 1];
                        var57.field2642 = field379[var5 + 2];
                        var57.field2663 = field379[var5 + 3];
                        var57.field2644 = field379[var5 + 4];
                        var57.field2645 = field379[var5 + 5];
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1110) {
                        var5--;
                        int var58 = field379[var5];
                        if (var57.field2659 != var58) {
                            var57.field2659 = var58;
                            var57.field2708 = 0;
                            var57.field2699 = 0;
                            client.method1331(var57);
                        }
                        continue;
                    }
                    if (var339 == 1111) {
                        var5--;
                        var57.field2647 = field379[var5] == 1;
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1112) {
                        var6--;
                        String var59 = field380[var6];
                        if (!var59.equals(var57.field2649)) {
                            var57.field2649 = var59;
                            client.method1331(var57);
                        }
                        continue;
                    }
                    if (var339 == 1113) {
                        var5--;
                        var57.field2648 = field379[var5];
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1114) {
                        var5 -= 3;
                        var57.field2652 = field379[var5];
                        var57.field2661 = field379[var5 + 1];
                        var57.field2651 = field379[var5 + 2];
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1115) {
                        var5--;
                        var57.field2654 = field379[var5] == 1;
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1116) {
                        var5--;
                        var57.field2630 = field379[var5];
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1117) {
                        var5--;
                        var57.field2631 = field379[var5];
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1118) {
                        var5--;
                        var57.field2632 = field379[var5] == 1;
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1119) {
                        var5--;
                        var57.field2633 = field379[var5] == 1;
                        client.method1331(var57);
                        continue;
                    }
                    if (var339 == 1120) {
                        var5 -= 2;
                        var57.field2617 = field379[var5];
                        var57.field2618 = field379[var5 + 1];
                        client.method1331(var57);
                        continue;
                    }
                } else if (var339 >= 1200 && var339 < 1300 || var339 >= 2200 && var339 < 2300) {
                    class159 var60;
                    if (var339 >= 2000) {
                        var339 -= 1000;
                        var5--;
                        var60 = class159.method1397(field379[var5]);
                    } else {
                        var60 = var41 ? Statics.field956 : Statics.field378;
                    }
                    client.method1331(var60);
                    if (var339 == 1200) {
                        var5 -= 2;
                        int var61 = field379[var5];
                        int var62 = field379[var5 + 1];
                        var60.field2695 = var61;
                        var60.field2707 = var62;
                        class40 var63 = class40.method31(var61);
                        var60.field2642 = var63.field982;
                        var60.field2663 = var63.field983;
                        var60.field2644 = var63.field984;
                        var60.field2653 = var63.field968;
                        var60.field2641 = var63.field986;
                        var60.field2645 = var63.field997;
                        if (var60.field2611 > 0) {
                            var60.field2645 = var60.field2645 * 32 / var60.field2611;
                        }
                        continue;
                    }
                    if (var339 == 1201) {
                        var60.field2634 = 2;
                        var5--;
                        var60.field2664 = field379[var5];
                        continue;
                    }
                    if (var339 == 1202) {
                        var60.field2634 = 3;
                        var60.field2664 = Statics.field905.field50.method3324();
                        continue;
                    }
                } else if ((var339 < 1300 || var339 >= 1400) && (var339 < 2300 || var339 >= 2400)) {
                    if (var339 >= 1400 && var339 < 1500 || var339 >= 2400 && var339 < 2500) {
                        class159 var68;
                        if (var339 >= 2000) {
                            var339 -= 1000;
                            var5--;
                            var68 = class159.method1397(field379[var5]);
                        } else {
                            var68 = var41 ? Statics.field956 : Statics.field378;
                        }
                        var6--;
                        String var69 = field380[var6];
                        int[] var70 = null;
                        if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                            var5--;
                            int var71 = field379[var5];
                            if (var71 > 0) {
                                var70 = new int[var71];
                                while (var71-- > 0) {
                                    var5--;
                                    var70[var71] = field379[var5];
                                }
                            }
                            var69 = var69.substring(0, var69.length() - 1);
                        }
                        Object[] var72 = new Object[var69.length() + 1];
                        for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                            if (var69.charAt(var73 - 1) == 's') {
                                var6--;
                                var72[var73] = field380[var6];
                            } else {
                                var5--;
                                var72[var73] = Integer.valueOf(field379[var5]);
                            }
                        }
                        var5--;
                        int var74 = field379[var5];
                        if (var74 == -1) {
                            var72 = null;
                        } else {
                            var72[0] = Integer.valueOf(var74);
                        }
                        if (var339 == 1400) {
                            var68.field2671 = var72;
                        }
                        if (var339 == 1401) {
                            var68.field2674 = var72;
                        }
                        if (var339 == 1402) {
                            var68.field2709 = var72;
                        }
                        if (var339 == 1403) {
                            var68.field2606 = var72;
                        }
                        if (var339 == 1404) {
                            var68.field2677 = var72;
                        }
                        if (var339 == 1405) {
                            var68.field2678 = var72;
                        }
                        if (var339 == 1406) {
                            var68.field2681 = var72;
                        }
                        if (var339 == 1407) {
                            var68.field2682 = var72;
                            var68.field2683 = var70;
                        }
                        if (var339 == 1408) {
                            var68.field2629 = var72;
                        }
                        if (var339 == 1409) {
                            var68.field2689 = var72;
                        }
                        if (var339 == 1410) {
                            var68.field2679 = var72;
                        }
                        if (var339 == 1411) {
                            var68.field2621 = var72;
                        }
                        if (var339 == 1412) {
                            var68.field2676 = var72;
                        }
                        if (var339 == 1414) {
                            var68.field2615 = var72;
                            var68.field2685 = var70;
                        }
                        if (var339 == 1415) {
                            var68.field2686 = var72;
                            var68.field2687 = var70;
                        }
                        if (var339 == 1416) {
                            var68.field2680 = var72;
                        }
                        if (var339 == 1417) {
                            var68.field2706 = var72;
                        }
                        if (var339 == 1418) {
                            var68.field2602 = var72;
                        }
                        if (var339 == 1419) {
                            var68.field2692 = var72;
                        }
                        if (var339 == 1420) {
                            var68.field2693 = var72;
                        }
                        if (var339 == 1421) {
                            var68.field2718 = var72;
                        }
                        if (var339 == 1422) {
                            var68.field2675 = var72;
                        }
                        if (var339 == 1423) {
                            var68.field2696 = var72;
                        }
                        if (var339 == 1424) {
                            var68.field2697 = var72;
                        }
                        var68.field2669 = true;
                        continue;
                    }
                    if (var339 < 1600) {
                        class159 var75 = var41 ? Statics.field956 : Statics.field378;
                        if (var339 == 1500) {
                            field379[var5++] = var75.field2607;
                            continue;
                        }
                        if (var339 == 1501) {
                            field379[var5++] = var75.field2640;
                            continue;
                        }
                        if (var339 == 1502) {
                            field379[var5++] = var75.field2611;
                            continue;
                        }
                        if (var339 == 1503) {
                            field379[var5++] = var75.field2672;
                            continue;
                        }
                        if (var339 == 1504) {
                            field379[var5++] = var75.field2614 ? 1 : 0;
                            continue;
                        }
                        if (var339 == 1505) {
                            field379[var5++] = var75.field2613;
                            continue;
                        }
                    } else if (var339 < 1700) {
                        class159 var76 = var41 ? Statics.field956 : Statics.field378;
                        if (var339 == 1600) {
                            field379[var5++] = var76.field2612;
                            continue;
                        }
                        if (var339 == 1601) {
                            field379[var5++] = var76.field2616;
                            continue;
                        }
                        if (var339 == 1602) {
                            field380[var6++] = var76.field2649;
                            continue;
                        }
                        if (var339 == 1603) {
                            field379[var5++] = var76.field2617;
                            continue;
                        }
                        if (var339 == 1604) {
                            field379[var5++] = var76.field2618;
                            continue;
                        }
                        if (var339 == 1605) {
                            field379[var5++] = var76.field2645;
                            continue;
                        }
                        if (var339 == 1606) {
                            field379[var5++] = var76.field2642;
                            continue;
                        }
                        if (var339 == 1607) {
                            field379[var5++] = var76.field2644;
                            continue;
                        }
                        if (var339 == 1608) {
                            field379[var5++] = var76.field2663;
                            continue;
                        }
                    } else if (var339 < 1800) {
                        class159 var77 = var41 ? Statics.field956 : Statics.field378;
                        if (var339 == 1700) {
                            field379[var5++] = var77.field2695;
                            continue;
                        }
                        if (var339 == 1701) {
                            if (var77.field2695 == -1) {
                                field379[var5++] = 0;
                            } else {
                                field379[var5++] = var77.field2707;
                            }
                            continue;
                        }
                        if (var339 == 1702) {
                            field379[var5++] = var77.field2603;
                            continue;
                        }
                    } else if (var339 < 1900) {
                        class159 var78 = var41 ? Statics.field956 : Statics.field378;
                        if (var339 == 1800) {
                            int[] var79 = field379;
                            int var80 = var5++;
                            int var81 = client.method2769(var78);
                            int var82 = var81 >> 11 & 0x3F;
                            var79[var80] = var82;
                            continue;
                        }
                        if (var339 == 1801) {
                            var5--;
                            int var83 = field379[var5];
                            int var340 = var83 - 1;
                            if (var78.field2609 != null && var340 < var78.field2609.length && var78.field2609[var340] != null) {
                                field380[var6++] = var78.field2609[var340];
                                continue;
                            }
                            field380[var6++] = "";
                            continue;
                        }
                        if (var339 == 1802) {
                            if (var78.field2662 == null) {
                                field380[var6++] = "";
                            } else {
                                field380[var6++] = var78.field2662;
                            }
                            continue;
                        }
                    } else if (var339 < 2600) {
                        var5--;
                        class159 var84 = class159.method1397(field379[var5]);
                        if (var339 == 2500) {
                            field379[var5++] = var84.field2607;
                            continue;
                        }
                        if (var339 == 2501) {
                            field379[var5++] = var84.field2640;
                            continue;
                        }
                        if (var339 == 2502) {
                            field379[var5++] = var84.field2611;
                            continue;
                        }
                        if (var339 == 2503) {
                            field379[var5++] = var84.field2672;
                            continue;
                        }
                        if (var339 == 2504) {
                            field379[var5++] = var84.field2614 ? 1 : 0;
                            continue;
                        }
                        if (var339 == 2505) {
                            field379[var5++] = var84.field2613;
                            continue;
                        }
                    } else if (var339 < 2700) {
                        var5--;
                        class159 var85 = class159.method1397(field379[var5]);
                        if (var339 == 2600) {
                            field379[var5++] = var85.field2612;
                            continue;
                        }
                        if (var339 == 2601) {
                            field379[var5++] = var85.field2616;
                            continue;
                        }
                        if (var339 == 2602) {
                            field380[var6++] = var85.field2649;
                            continue;
                        }
                        if (var339 == 2603) {
                            field379[var5++] = var85.field2617;
                            continue;
                        }
                        if (var339 == 2604) {
                            field379[var5++] = var85.field2618;
                            continue;
                        }
                        if (var339 == 2605) {
                            field379[var5++] = var85.field2645;
                            continue;
                        }
                        if (var339 == 2606) {
                            field379[var5++] = var85.field2642;
                            continue;
                        }
                        if (var339 == 2607) {
                            field379[var5++] = var85.field2644;
                            continue;
                        }
                        if (var339 == 2608) {
                            field379[var5++] = var85.field2663;
                            continue;
                        }
                    } else if (var339 < 2800) {
                        if (var339 == 2700) {
                            var5--;
                            class159 var86 = class159.method1397(field379[var5]);
                            field379[var5++] = var86.field2695;
                            continue;
                        }
                        if (var339 == 2701) {
                            var5--;
                            class159 var87 = class159.method1397(field379[var5]);
                            if (var87.field2695 == -1) {
                                field379[var5++] = 0;
                            } else {
                                field379[var5++] = var87.field2707;
                            }
                            continue;
                        }
                        if (var339 == 2702) {
                            var5--;
                            int var88 = field379[var5];
                            class4 var89 = (class4) client.field617.method3405((long) var88);
                            if (var89 == null) {
                                field379[var5++] = 0;
                            } else {
                                field379[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var339 < 2900) {
                        var5--;
                        class159 var90 = class159.method1397(field379[var5]);
                        if (var339 == 2800) {
                            int[] var91 = field379;
                            int var92 = var5++;
                            int var93 = client.method2769(var90);
                            int var94 = var93 >> 11 & 0x3F;
                            var91[var92] = var94;
                            continue;
                        }
                        if (var339 == 2801) {
                            var5--;
                            int var95 = field379[var5];
                            int var341 = var95 - 1;
                            if (var90.field2609 != null && var341 < var90.field2609.length && var90.field2609[var341] != null) {
                                field380[var6++] = var90.field2609[var341];
                                continue;
                            }
                            field380[var6++] = "";
                            continue;
                        }
                        if (var339 == 2802) {
                            if (var90.field2662 == null) {
                                field380[var6++] = "";
                            } else {
                                field380[var6++] = var90.field2662;
                            }
                            continue;
                        }
                    } else if (var339 < 3200) {
                        if (var339 == 3100) {
                            var6--;
                            String var96 = field380[var6];
                            client.method3179(0, "", var96);
                            continue;
                        }
                        if (var339 == 3101) {
                            var5 -= 2;
                            client.method1370(Statics.field905, field379[var5], field379[var5 + 1]);
                            continue;
                        }
                        if (var339 == 3103) {
                            Statics.method102();
                            continue;
                        }
                        if (var339 == 3104) {
                            var6--;
                            String var97 = field380[var6];
                            int var98 = 0;
                            if (class148.method3000(var97)) {
                                int var99 = class148.method2788(var97, 10, true);
                                var98 = var99;
                            }
                            client.field498.method2355(158);
                            client.field498.method2487(var98);
                            continue;
                        }
                        if (var339 == 3105) {
                            var6--;
                            String var100 = field380[var6];
                            client.field498.method2355(123);
                            client.field498.method2484(var100.length() + 1);
                            client.field498.method2682(var100);
                            continue;
                        }
                        if (var339 == 3106) {
                            var6--;
                            String var101 = field380[var6];
                            client.field498.method2355(186);
                            client.field498.method2484(var101.length() + 1);
                            client.field498.method2682(var101);
                            continue;
                        }
                        if (var339 == 3107) {
                            var5--;
                            int var102 = field379[var5];
                            var6--;
                            String var103 = field380[var6];
                            client.method2924(var102, var103);
                            continue;
                        }
                        if (var339 == 3108) {
                            var5 -= 3;
                            int var104 = field379[var5];
                            int var105 = field379[var5 + 1];
                            int var106 = field379[var5 + 2];
                            class159 var107 = class159.method1397(var106);
                            client.method130(var107, var104, var105);
                            continue;
                        }
                        if (var339 == 3109) {
                            var5 -= 2;
                            int var108 = field379[var5];
                            int var109 = field379[var5 + 1];
                            class159 var110 = var41 ? Statics.field956 : Statics.field378;
                            client.method130(var110, var108, var109);
                            continue;
                        }
                    } else if (var339 < 3300) {
                        if (var339 == 3200) {
                            var5 -= 3;
                            int var111 = field379[var5];
                            int var112 = field379[var5 + 1];
                            int var113 = field379[var5 + 2];
                            if (client.field695 != 0 && var112 != 0 && client.field697 < 50) {
                                client.field718[client.field697] = var111;
                                client.field699[client.field697] = var112;
                                client.field700[client.field697] = var113;
                                client.field702[client.field697] = null;
                                client.field701[client.field697] = 0;
                                client.field697++;
                            }
                            continue;
                        }
                        if (var339 == 3201) {
                            var5--;
                            client.method2079(field379[var5]);
                            continue;
                        }
                        if (var339 == 3202) {
                            var5 -= 2;
                            int var114 = field379[var5];
                            int var10000 = field379[var5 + 1];
                            if (client.field484 != 0 && var114 != -1) {
                                class139.method2165(Statics.field487, var114, 0, client.field484, false);
                                client.field596 = true;
                            }
                            continue;
                        }
                    } else if (var339 < 3400) {
                        if (var339 == 3300) {
                            field379[var5++] = client.field465;
                            continue;
                        }
                        if (var339 == 3301) {
                            var5 -= 2;
                            int var116 = field379[var5];
                            int var117 = field379[var5 + 1];
                            field379[var5++] = Statics.method422(var116, var117);
                            continue;
                        }
                        if (var339 == 3302) {
                            var5 -= 2;
                            int var118 = field379[var5];
                            int var119 = field379[var5 + 1];
                            int[] var120 = field379;
                            int var121 = var5++;
                            class19 var122 = (class19) class19.field272.method3405((long) var118);
                            int var123;
                            if (var122 == null) {
                                var123 = 0;
                            } else if (var119 >= 0 && var119 < var122.field266.length) {
                                var123 = var122.field266[var119];
                            } else {
                                var123 = 0;
                            }
                            var120[var121] = var123;
                            continue;
                        }
                        if (var339 == 3303) {
                            var5 -= 2;
                            int var124 = field379[var5];
                            int var125 = field379[var5 + 1];
                            field379[var5++] = class19.method2266(var124, var125);
                            continue;
                        }
                        if (var339 == 3304) {
                            var5--;
                            int var126 = field379[var5];
                            int[] var127 = field379;
                            int var128 = var5++;
                            class41 var129 = (class41) class41.field1018.method3357((long) var126);
                            class41 var130;
                            if (var129 == null) {
                                byte[] var131 = Statics.field1020.method3078(5, var126);
                                class41 var132 = new class41();
                                if (var131 != null) {
                                    var132.method895(new class127(var131));
                                }
                                class41.field1018.method3364(var132, (long) var126);
                                var130 = var132;
                            } else {
                                var130 = var129;
                            }
                            var127[var128] = var130.field1019;
                            continue;
                        }
                        if (var339 == 3305) {
                            var5--;
                            int var133 = field379[var5];
                            field379[var5++] = client.field594[var133];
                            continue;
                        }
                        if (var339 == 3306) {
                            var5--;
                            int var134 = field379[var5];
                            field379[var5++] = client.field595[var134];
                            continue;
                        }
                        if (var339 == 3307) {
                            var5--;
                            int var135 = field379[var5];
                            field379[var5++] = client.field613[var135];
                            continue;
                        }
                        if (var339 == 3308) {
                            int var136 = Statics.field2374;
                            int var137 = (Statics.field905.field404 >> 7) + Statics.field1848;
                            int var138 = (Statics.field905.field394 >> 7) + Statics.field178;
                            field379[var5++] = (var136 << 28) + (var137 << 14) + var138;
                            continue;
                        }
                        if (var339 == 3309) {
                            var5--;
                            int var139 = field379[var5];
                            field379[var5++] = var139 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var339 == 3310) {
                            var5--;
                            int var140 = field379[var5];
                            field379[var5++] = var140 >> 28;
                            continue;
                        }
                        if (var339 == 3311) {
                            var5--;
                            int var141 = field379[var5];
                            field379[var5++] = var141 & 0x3FFF;
                            continue;
                        }
                        if (var339 == 3312) {
                            field379[var5++] = client.field460 ? 1 : 0;
                            continue;
                        }
                        if (var339 == 3313) {
                            var5 -= 2;
                            int var142 = field379[var5] + 32768;
                            int var143 = field379[var5 + 1];
                            field379[var5++] = Statics.method422(var142, var143);
                            continue;
                        }
                        if (var339 == 3314) {
                            var5 -= 2;
                            int var144 = field379[var5] + 32768;
                            int var145 = field379[var5 + 1];
                            int[] var146 = field379;
                            int var147 = var5++;
                            class19 var148 = (class19) class19.field272.method3405((long) var144);
                            int var149;
                            if (var148 == null) {
                                var149 = 0;
                            } else if (var145 >= 0 && var145 < var148.field266.length) {
                                var149 = var148.field266[var145];
                            } else {
                                var149 = 0;
                            }
                            var146[var147] = var149;
                            continue;
                        }
                        if (var339 == 3315) {
                            var5 -= 2;
                            int var150 = field379[var5] + 32768;
                            int var151 = field379[var5 + 1];
                            field379[var5++] = class19.method2266(var150, var151);
                            continue;
                        }
                        if (var339 == 3316) {
                            if (client.field547 >= 2) {
                                field379[var5++] = client.field547;
                            } else {
                                field379[var5++] = 0;
                            }
                            continue;
                        }
                        if (var339 == 3317) {
                            field379[var5++] = client.field472;
                            continue;
                        }
                        if (var339 == 3318) {
                            field379[var5++] = client.field657;
                            continue;
                        }
                        if (var339 == 3321) {
                            field379[var5++] = client.field621;
                            continue;
                        }
                        if (var339 == 3322) {
                            field379[var5++] = client.field584;
                            continue;
                        }
                        if (var339 == 3323) {
                            if (client.field461) {
                                field379[var5++] = 1;
                            } else {
                                field379[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var339 < 3500) {
                        if (var339 == 3400) {
                            var5 -= 2;
                            int var152 = field379[var5];
                            int var153 = field379[var5 + 1];
                            class39 var154 = class39.method34(var152);
                            if (var154.field963 != 's') {
                            }
                            for (int var155 = 0; var155 < var154.field960; var155++) {
                                if (var154.field961[var155] == var153) {
                                    field380[var6++] = var154.field959[var155];
                                    var154 = null;
                                    break;
                                }
                            }
                            if (var154 != null) {
                                field380[var6++] = var154.field957;
                            }
                            continue;
                        }
                        if (var339 == 3408) {
                            var5 -= 4;
                            int var156 = field379[var5];
                            int var157 = field379[var5 + 1];
                            int var158 = field379[var5 + 2];
                            int var159 = field379[var5 + 3];
                            class39 var160 = class39.method34(var158);
                            if (var160.field966 == var156 && var160.field963 == var157) {
                                for (int var161 = 0; var161 < var160.field960; var161++) {
                                    if (var160.field961[var161] == var159) {
                                        if (var157 == 115) {
                                            field380[var6++] = var160.field959[var161];
                                        } else {
                                            field379[var5++] = var160.field962[var161];
                                        }
                                        var160 = null;
                                        break;
                                    }
                                }
                                if (var160 != null) {
                                    if (var157 == 115) {
                                        field380[var6++] = var160.field957;
                                    } else {
                                        field379[var5++] = var160.field954;
                                    }
                                }
                                continue;
                            }
                            if (var157 == 115) {
                                field380[var6++] = "null";
                            } else {
                                field379[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var339 < 3700) {
                        if (var339 == 3600) {
                            if (client.field644 == 0) {
                                field379[var5++] = -2;
                            } else if (client.field644 == 1) {
                                field379[var5++] = -1;
                            } else {
                                field379[var5++] = client.field709;
                            }
                            continue;
                        }
                        if (var339 == 3601) {
                            var5--;
                            int var162 = field379[var5];
                            if (client.field644 == 2 && var162 < client.field709) {
                                field380[var6++] = client.field668[var162].field350;
                                continue;
                            }
                            field380[var6++] = "";
                            continue;
                        }
                        if (var339 == 3602) {
                            var5--;
                            int var163 = field379[var5];
                            if (client.field644 == 2 && var163 < client.field709) {
                                field379[var5++] = client.field668[var163].field354;
                                continue;
                            }
                            field379[var5++] = 0;
                            continue;
                        }
                        if (var339 == 3603) {
                            var5--;
                            int var164 = field379[var5];
                            if (client.field644 == 2 && var164 < client.field709) {
                                field379[var5++] = client.field668[var164].field351;
                                continue;
                            }
                            field379[var5++] = 0;
                            continue;
                        }
                        if (var339 == 3604) {
                            var6--;
                            String var165 = field380[var6];
                            var5--;
                            int var166 = field379[var5];
                            client.field498.method2355(243);
                            class116 var167 = client.field498;
                            int var168 = var165.length() + 1;
                            var167.method2484(var168 + 1);
                            client.field498.method2519(var166);
                            client.field498.method2682(var165);
                            continue;
                        }
                        if (var339 == 3605) {
                            var6--;
                            String var169 = field380[var6];
                            client.method2346(var169);
                            continue;
                        }
                        if (var339 == 3606) {
                            var6--;
                            String var170 = field380[var6];
                            client.method25(var170);
                            continue;
                        }
                        if (var339 == 3607) {
                            var6--;
                            String var171 = field380[var6];
                            if (var171 == null) {
                                continue;
                            }
                            if ((client.field713 < 100 || client.field583 == 1) && client.field713 < 400) {
                                String var172 = class149.method220(var171, Statics.field459);
                                if (var172 == null) {
                                    continue;
                                }
                                for (int var173 = 0; var173 < client.field713; var173++) {
                                    class11 var174 = client.field580[var173];
                                    String var175 = class149.method220(var174.field169, Statics.field459);
                                    if (var175 != null && var175.equals(var172)) {
                                        client.method3179(0, "", var171 + class135.field2226);
                                        continue label2156;
                                    }
                                    if (var174.field167 != null) {
                                        String var176 = class149.method220(var174.field167, Statics.field459);
                                        if (var176 != null && var176.equals(var172)) {
                                            client.method3179(0, "", var171 + class135.field2226);
                                            continue label2156;
                                        }
                                    }
                                }
                                for (int var177 = 0; var177 < client.field709; var177++) {
                                    class23 var178 = client.field668[var177];
                                    String var179 = class149.method220(var178.field350, Statics.field459);
                                    if (var179 != null && var179.equals(var172)) {
                                        client.method3179(0, "", class135.field2254 + var171 + class135.field2255);
                                        continue label2156;
                                    }
                                    if (var178.field349 != null) {
                                        String var180 = class149.method220(var178.field349, Statics.field459);
                                        if (var180 != null && var180.equals(var172)) {
                                            client.method3179(0, "", class135.field2254 + var171 + class135.field2255);
                                            continue label2156;
                                        }
                                    }
                                }
                                if (class149.method220(Statics.field905.field37, Statics.field459).equals(var172)) {
                                    client.method3179(0, "", class135.field2251);
                                } else {
                                    client.field498.method2355(174);
                                    class116 var181 = client.field498;
                                    int var182 = var171.length() + 1;
                                    var181.method2484(var182);
                                    client.field498.method2682(var171);
                                }
                                continue;
                            }
                            client.method3179(0, "", class135.field2160);
                            continue;
                        }
                        if (var339 == 3608) {
                            var6--;
                            String var183 = field380[var6];
                            client.method2476(var183);
                            continue;
                        }
                        if (var339 == 3609) {
                            var6--;
                            String var184 = field380[var6];
                            if (var184.startsWith(class2.method2478(0)) || var184.startsWith(class2.method2478(1))) {
                                var184 = var184.substring(7);
                            }
                            field379[var5++] = client.method2244(var184) ? 1 : 0;
                            continue;
                        }
                        if (var339 == 3611) {
                            if (client.field682 == null) {
                                field380[var6++] = "";
                            } else {
                                field380[var6++] = class147.method1474(client.field682);
                            }
                            continue;
                        }
                        if (var339 == 3612) {
                            if (client.field682 == null) {
                                field379[var5++] = 0;
                            } else {
                                field379[var5++] = Statics.field1928;
                            }
                            continue;
                        }
                        if (var339 == 3613) {
                            var5--;
                            int var185 = field379[var5];
                            if (client.field682 != null && var185 < Statics.field1928) {
                                field380[var6++] = Statics.field67[var185].field116;
                                continue;
                            }
                            field380[var6++] = "";
                            continue;
                        }
                        if (var339 == 3614) {
                            var5--;
                            int var186 = field379[var5];
                            if (client.field682 != null && var186 < Statics.field1928) {
                                field379[var5++] = Statics.field67[var186].field112;
                                continue;
                            }
                            field379[var5++] = 0;
                            continue;
                        }
                        if (var339 == 3615) {
                            var5--;
                            int var187 = field379[var5];
                            if (client.field682 != null && var187 < Statics.field1928) {
                                field379[var5++] = Statics.field67[var187].field111;
                                continue;
                            }
                            field379[var5++] = 0;
                            continue;
                        }
                        if (var339 == 3616) {
                            field379[var5++] = Statics.field2336;
                            continue;
                        }
                        if (var339 == 3617) {
                            var6--;
                            String var188 = field380[var6];
                            if (Statics.field67 != null) {
                                client.field498.method2355(59);
                                class116 var189 = client.field498;
                                int var190 = var188.length() + 1;
                                var189.method2484(var190);
                                client.field498.method2682(var188);
                            }
                            continue;
                        }
                        if (var339 == 3618) {
                            field379[var5++] = Statics.field227;
                            continue;
                        }
                        if (var339 == 3619) {
                            var6--;
                            String var191 = field380[var6];
                            if (!var191.equals("")) {
                                client.field498.method2355(95);
                                class116 var192 = client.field498;
                                int var193 = var191.length() + 1;
                                var192.method2484(var193);
                                client.field498.method2682(var191);
                            }
                            continue;
                        }
                        if (var339 == 3620) {
                            client.method2163();
                            continue;
                        }
                        if (var339 == 3621) {
                            if (client.field644 == 0) {
                                field379[var5++] = -1;
                            } else {
                                field379[var5++] = client.field713;
                            }
                            continue;
                        }
                        if (var339 == 3622) {
                            var5--;
                            int var194 = field379[var5];
                            if (client.field644 != 0 && var194 < client.field713) {
                                field380[var6++] = client.field580[var194].field169;
                                continue;
                            }
                            field380[var6++] = "";
                            continue;
                        }
                        if (var339 == 3623) {
                            var6--;
                            String var195 = field380[var6];
                            if (var195.startsWith(class2.method2478(0)) || var195.startsWith(class2.method2478(1))) {
                                var195 = var195.substring(7);
                            }
                            field379[var5++] = client.method128(var195) ? 1 : 0;
                            continue;
                        }
                        if (var339 == 3624) {
                            var5--;
                            int var196 = field379[var5];
                            if (Statics.field67 != null && var196 < Statics.field1928 && Statics.field67[var196].field116.equalsIgnoreCase(Statics.field905.field37)) {
                                field379[var5++] = 1;
                                continue;
                            }
                            field379[var5++] = 0;
                            continue;
                        }
                        if (var339 == 3625) {
                            if (client.field683 == null) {
                                field380[var6++] = "";
                            } else {
                                field380[var6++] = class147.method1474(client.field683);
                            }
                            continue;
                        }
                    } else if (var339 < 4100) {
                        if (var339 == 4000) {
                            var5 -= 2;
                            int var197 = field379[var5];
                            int var198 = field379[var5 + 1];
                            field379[var5++] = var197 + var198;
                            continue;
                        }
                        if (var339 == 4001) {
                            var5 -= 2;
                            int var199 = field379[var5];
                            int var200 = field379[var5 + 1];
                            field379[var5++] = var199 - var200;
                            continue;
                        }
                        if (var339 == 4002) {
                            var5 -= 2;
                            int var201 = field379[var5];
                            int var202 = field379[var5 + 1];
                            field379[var5++] = var201 * var202;
                            continue;
                        }
                        if (var339 == 4003) {
                            var5 -= 2;
                            int var203 = field379[var5];
                            int var204 = field379[var5 + 1];
                            field379[var5++] = var203 / var204;
                            continue;
                        }
                        if (var339 == 4004) {
                            var5--;
                            int var205 = field379[var5];
                            field379[var5++] = (int) (Math.random() * (double) var205);
                            continue;
                        }
                        if (var339 == 4005) {
                            var5--;
                            int var206 = field379[var5];
                            field379[var5++] = (int) (Math.random() * (double) (var206 + 1));
                            continue;
                        }
                        if (var339 == 4006) {
                            var5 -= 5;
                            int var207 = field379[var5];
                            int var208 = field379[var5 + 1];
                            int var209 = field379[var5 + 2];
                            int var210 = field379[var5 + 3];
                            int var211 = field379[var5 + 4];
                            field379[var5++] = (var208 - var207) * (var211 - var209) / (var210 - var209) + var207;
                            continue;
                        }
                        if (var339 == 4007) {
                            var5 -= 2;
                            int var212 = field379[var5];
                            int var213 = field379[var5 + 1];
                            field379[var5++] = var212 * var213 / 100 + var212;
                            continue;
                        }
                        if (var339 == 4008) {
                            var5 -= 2;
                            int var214 = field379[var5];
                            int var215 = field379[var5 + 1];
                            field379[var5++] = var214 | 0x1 << var215;
                            continue;
                        }
                        if (var339 == 4009) {
                            var5 -= 2;
                            int var216 = field379[var5];
                            int var217 = field379[var5 + 1];
                            field379[var5++] = var216 & -1 - (0x1 << var217);
                            continue;
                        }
                        if (var339 == 4010) {
                            var5 -= 2;
                            int var218 = field379[var5];
                            int var219 = field379[var5 + 1];
                            field379[var5++] = (var218 & 0x1 << var219) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var339 == 4011) {
                            var5 -= 2;
                            int var220 = field379[var5];
                            int var221 = field379[var5 + 1];
                            field379[var5++] = var220 % var221;
                            continue;
                        }
                        if (var339 == 4012) {
                            var5 -= 2;
                            int var222 = field379[var5];
                            int var223 = field379[var5 + 1];
                            if (var222 == 0) {
                                field379[var5++] = 0;
                            } else {
                                field379[var5++] = (int) Math.pow((double) var222, (double) var223);
                            }
                            continue;
                        }
                        if (var339 == 4013) {
                            var5 -= 2;
                            int var224 = field379[var5];
                            int var225 = field379[var5 + 1];
                            if (var224 == 0) {
                                field379[var5++] = 0;
                            } else if (var225 == 0) {
                                field379[var5++] = Integer.MAX_VALUE;
                            } else {
                                field379[var5++] = (int) Math.pow((double) var224, 1.0D / (double) var225);
                            }
                            continue;
                        }
                        if (var339 == 4014) {
                            var5 -= 2;
                            int var226 = field379[var5];
                            int var227 = field379[var5 + 1];
                            field379[var5++] = var226 & var227;
                            continue;
                        }
                        if (var339 == 4015) {
                            var5 -= 2;
                            int var228 = field379[var5];
                            int var229 = field379[var5 + 1];
                            field379[var5++] = var228 | var229;
                            continue;
                        }
                    } else if (var339 < 4200) {
                        if (var339 == 4100) {
                            var6--;
                            String var230 = field380[var6];
                            var5--;
                            int var231 = field379[var5];
                            field380[var6++] = var230 + var231;
                            continue;
                        }
                        if (var339 == 4101) {
                            var6 -= 2;
                            String var232 = field380[var6];
                            String var233 = field380[var6 + 1];
                            field380[var6++] = var232 + var233;
                            continue;
                        }
                        if (var339 == 4102) {
                            var6--;
                            String var234 = field380[var6];
                            var5--;
                            int var235 = field379[var5];
                            field380[var6++] = var234 + class148.method816(var235, true);
                            continue;
                        }
                        if (var339 == 4103) {
                            var6--;
                            String var236 = field380[var6];
                            field380[var6++] = var236.toLowerCase();
                            continue;
                        }
                        if (var339 == 4104) {
                            var5--;
                            int var237 = field379[var5];
                            long var238 = ((long) var237 + 11745L) * 86400000L;
                            field375.setTime(new Date(var238));
                            int var240 = field375.get(5);
                            int var241 = field375.get(2);
                            int var242 = field375.get(1);
                            field380[var6++] = var240 + "-" + field385[var241] + "-" + var242;
                            continue;
                        }
                        if (var339 == 4105) {
                            var6 -= 2;
                            String var243 = field380[var6];
                            String var244 = field380[var6 + 1];
                            if (Statics.field905.field50 != null && Statics.field905.field50.field2752) {
                                field380[var6++] = var244;
                                continue;
                            }
                            field380[var6++] = var243;
                            continue;
                        }
                        if (var339 == 4106) {
                            var5--;
                            int var245 = field379[var5];
                            field380[var6++] = Integer.toString(var245);
                            continue;
                        }
                        if (var339 == 4107) {
                            var6 -= 2;
                            int[] var246 = field379;
                            int var247 = var5++;
                            int var248 = class151.method1687(field380[var6], field380[var6 + 1], client.field654);
                            byte var249;
                            if (var248 > 0) {
                                var249 = 1;
                            } else if (var248 < 0) {
                                var249 = -1;
                            } else {
                                var249 = 0;
                            }
                            var246[var247] = var249;
                            continue;
                        }
                        if (var339 == 4108) {
                            var6--;
                            String var250 = field380[var6];
                            var5 -= 2;
                            int var251 = field379[var5];
                            int var252 = field379[var5 + 1];
                            byte[] var253 = Statics.field2028.method3078(var252, 0);
                            class183 var254 = new class183(var253);
                            field379[var5++] = var254.method3484(var250, var251);
                            continue;
                        }
                        if (var339 == 4109) {
                            var6--;
                            String var255 = field380[var6];
                            var5 -= 2;
                            int var256 = field379[var5];
                            int var257 = field379[var5 + 1];
                            byte[] var258 = Statics.field2028.method3078(var257, 0);
                            class183 var259 = new class183(var258);
                            field379[var5++] = var259.method3483(var255, var256);
                            continue;
                        }
                        if (var339 == 4110) {
                            var6 -= 2;
                            String var260 = field380[var6];
                            String var261 = field380[var6 + 1];
                            var5--;
                            if (field379[var5] == 1) {
                                field380[var6++] = var260;
                            } else {
                                field380[var6++] = var261;
                            }
                            continue;
                        }
                        if (var339 == 4111) {
                            var6--;
                            String var262 = field380[var6];
                            field380[var6++] = class185.method3485(var262);
                            continue;
                        }
                        if (var339 == 4112) {
                            var6--;
                            String var263 = field380[var6];
                            var5--;
                            int var264 = field379[var5];
                            field380[var6++] = var263 + (char) var264;
                            continue;
                        }
                        if (var339 == 4113) {
                            var5--;
                            int var265 = field379[var5];
                            int[] var266 = field379;
                            int var267 = var5++;
                            char var268 = (char) var265;
                            boolean var269;
                            if (var268 >= ' ' && var268 <= '~') {
                                var269 = true;
                            } else if (var268 >= 160 && var268 <= 255) {
                                var269 = true;
                            } else if (var268 == 8364 || var268 == 338 || var268 == 8212 || var268 == 339 || var268 == 376) {
                                var269 = true;
                            } else {
                                var269 = false;
                            }
                            var266[var267] = var269 ? 1 : 0;
                            continue;
                        }
                        if (var339 == 4114) {
                            var5--;
                            int var270 = field379[var5];
                            int[] var271 = field379;
                            int var272 = var5++;
                            char var273 = (char) var270;
                            boolean var274 = var273 >= '0' && var273 <= '9' || var273 >= 'A' && var273 <= 'Z' || var273 >= 'a' && var273 <= 'z';
                            var271[var272] = var274 ? 1 : 0;
                            continue;
                        }
                        if (var339 == 4115) {
                            var5--;
                            int var275 = field379[var5];
                            int[] var276 = field379;
                            int var277 = var5++;
                            char var278 = (char) var275;
                            boolean var279 = var278 >= 'A' && var278 <= 'Z' || var278 >= 'a' && var278 <= 'z';
                            var276[var277] = var279 ? 1 : 0;
                            continue;
                        }
                        if (var339 == 4116) {
                            var5--;
                            int var280 = field379[var5];
                            field379[var5++] = class148.method142((char) var280) ? 1 : 0;
                            continue;
                        }
                        if (var339 == 4117) {
                            var6--;
                            String var281 = field380[var6];
                            if (var281 == null) {
                                field379[var5++] = 0;
                            } else {
                                field379[var5++] = var281.length();
                            }
                            continue;
                        }
                        if (var339 == 4118) {
                            var6--;
                            String var282 = field380[var6];
                            var5 -= 2;
                            int var283 = field379[var5];
                            int var284 = field379[var5 + 1];
                            field380[var6++] = var282.substring(var283, var284);
                            continue;
                        }
                        if (var339 == 4119) {
                            var6--;
                            String var285 = field380[var6];
                            StringBuilder var286 = new StringBuilder(var285.length());
                            boolean var287 = false;
                            for (int var288 = 0; var288 < var285.length(); var288++) {
                                char var289 = var285.charAt(var288);
                                if (var289 == '<') {
                                    var287 = true;
                                } else if (var289 == '>') {
                                    var287 = false;
                                } else if (!var287) {
                                    var286.append(var289);
                                }
                            }
                            field380[var6++] = var286.toString();
                            continue;
                        }
                        if (var339 == 4120) {
                            var6--;
                            String var290 = field380[var6];
                            var5--;
                            int var291 = field379[var5];
                            field379[var5++] = var290.indexOf(var291);
                            continue;
                        }
                    } else if (var339 < 4300) {
                        if (var339 == 4200) {
                            var5--;
                            int var292 = field379[var5];
                            field380[var6++] = class40.method31(var292).field988;
                            continue;
                        }
                        if (var339 == 4201) {
                            var5 -= 2;
                            int var293 = field379[var5];
                            int var294 = field379[var5 + 1];
                            class40 var295 = class40.method31(var293);
                            if (var294 >= 1 && var294 <= 5 && var295.field990[var294 - 1] != null) {
                                field380[var6++] = var295.field990[var294 - 1];
                                continue;
                            }
                            field380[var6++] = "";
                            continue;
                        }
                        if (var339 == 4202) {
                            var5 -= 2;
                            int var296 = field379[var5];
                            int var297 = field379[var5 + 1];
                            class40 var298 = class40.method31(var296);
                            if (var297 >= 1 && var297 <= 5 && var298.field991[var297 - 1] != null) {
                                field380[var6++] = var298.field991[var297 - 1];
                                continue;
                            }
                            field380[var6++] = "";
                            continue;
                        }
                        if (var339 == 4203) {
                            var5--;
                            int var299 = field379[var5];
                            field379[var5++] = class40.method31(var299).field973;
                            continue;
                        }
                        if (var339 == 4204) {
                            var5--;
                            int var300 = field379[var5];
                            field379[var5++] = class40.method31(var300).field987 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var339 == 4205) {
                            var5--;
                            int var301 = field379[var5];
                            class40 var302 = class40.method31(var301);
                            if (var302.field978 == -1 && var302.field1006 >= 0) {
                                field379[var5++] = var302.field1006;
                                continue;
                            }
                            field379[var5++] = var301;
                            continue;
                        }
                        if (var339 == 4206) {
                            var5--;
                            int var303 = field379[var5];
                            class40 var304 = class40.method31(var303);
                            if (var304.field978 >= 0 && var304.field1006 >= 0) {
                                field379[var5++] = var304.field1006;
                                continue;
                            }
                            field379[var5++] = var303;
                            continue;
                        }
                        if (var339 == 4207) {
                            var5--;
                            int var305 = field379[var5];
                            field379[var5++] = class40.method31(var305).field1003 ? 1 : 0;
                            continue;
                        }
                    } else if (var339 < 5100) {
                        if (var339 == 5000) {
                            field379[var5++] = client.field674;
                            continue;
                        }
                        if (var339 == 5001) {
                            var5 -= 3;
                            client.field674 = field379[var5];
                            Statics.field1747 = class138.method789(field379[var5 + 1]);
                            if (Statics.field1747 == null) {
                                Statics.field1747 = class138.field2341;
                            }
                            client.field463 = field379[var5 + 2];
                            client.field498.method2355(70);
                            client.field498.method2484(client.field674);
                            client.field498.method2484(Statics.field1747.field2349);
                            client.field498.method2484(client.field463);
                            continue;
                        }
                        if (var339 == 5002) {
                            var6--;
                            String var306 = field380[var6];
                            var5 -= 2;
                            int var307 = field379[var5];
                            int var308 = field379[var5 + 1];
                            client.field498.method2355(189);
                            class116 var309 = client.field498;
                            int var310 = var306.length() + 1;
                            var309.method2484(var310 + 2);
                            client.field498.method2682(var306);
                            client.field498.method2484(var307 - 1);
                            client.field498.method2484(var308);
                            continue;
                        }
                        if (var339 == 5003) {
                            var5--;
                            int var311 = field379[var5];
                            String var312 = null;
                            if (var311 < 100) {
                                var312 = client.field633[var311];
                            }
                            if (var312 == null) {
                                var312 = "";
                            }
                            field380[var6++] = var312;
                            continue;
                        }
                        if (var339 == 5004) {
                            var5--;
                            int var313 = field379[var5];
                            int var314 = -1;
                            if (var313 < 100 && client.field633[var313] != null) {
                                var314 = client.field608[var313];
                            }
                            field379[var5++] = var314;
                            continue;
                        }
                        if (var339 == 5005) {
                            if (Statics.field1747 == null) {
                                field379[var5++] = -1;
                            } else {
                                field379[var5++] = Statics.field1747.field2349;
                            }
                            continue;
                        }
                        if (var339 == 5008) {
                            var6--;
                            String var315 = field380[var6];
                            if (var315.startsWith("::")) {
                                client.method199(var315.substring(2));
                            } else {
                                String var316 = var315.toLowerCase();
                                byte var317 = 0;
                                if (var316.startsWith(class135.field2256)) {
                                    var317 = 0;
                                    var315 = var315.substring(class135.field2256.length());
                                } else if (var316.startsWith(class135.field2166)) {
                                    var317 = 1;
                                    var315 = var315.substring(class135.field2166.length());
                                } else if (var316.startsWith(class135.field2260)) {
                                    var317 = 2;
                                    var315 = var315.substring(class135.field2260.length());
                                } else if (var316.startsWith(class135.field2262)) {
                                    var317 = 3;
                                    var315 = var315.substring(class135.field2262.length());
                                } else if (var316.startsWith(class135.field2264)) {
                                    var317 = 4;
                                    var315 = var315.substring(class135.field2264.length());
                                } else if (var316.startsWith(class135.field2266)) {
                                    var317 = 5;
                                    var315 = var315.substring(class135.field2266.length());
                                } else if (var316.startsWith(class135.field2161)) {
                                    var317 = 6;
                                    var315 = var315.substring(class135.field2161.length());
                                } else if (var316.startsWith(class135.field2270)) {
                                    var317 = 7;
                                    var315 = var315.substring(class135.field2270.length());
                                } else if (var316.startsWith(class135.field2272)) {
                                    var317 = 8;
                                    var315 = var315.substring(class135.field2272.length());
                                } else if (var316.startsWith(class135.field2274)) {
                                    var317 = 9;
                                    var315 = var315.substring(class135.field2274.length());
                                } else if (var316.startsWith(class135.field2276)) {
                                    var317 = 10;
                                    var315 = var315.substring(class135.field2276.length());
                                } else if (var316.startsWith(class135.field2278)) {
                                    var317 = 11;
                                    var315 = var315.substring(class135.field2278.length());
                                } else if (client.field654 != 0) {
                                    if (var316.startsWith(class135.field2248)) {
                                        var317 = 0;
                                        var315 = var315.substring(class135.field2248.length());
                                    } else if (var316.startsWith(class135.field2245)) {
                                        var317 = 1;
                                        var315 = var315.substring(class135.field2245.length());
                                    } else if (var316.startsWith(class135.field2303)) {
                                        var317 = 2;
                                        var315 = var315.substring(class135.field2303.length());
                                    } else if (var316.startsWith(class135.field2325)) {
                                        var317 = 3;
                                        var315 = var315.substring(class135.field2325.length());
                                    } else if (var316.startsWith(class135.field2265)) {
                                        var317 = 4;
                                        var315 = var315.substring(class135.field2265.length());
                                    } else if (var316.startsWith(class135.field2099)) {
                                        var317 = 5;
                                        var315 = var315.substring(class135.field2099.length());
                                    } else if (var316.startsWith(class135.field2269)) {
                                        var317 = 6;
                                        var315 = var315.substring(class135.field2269.length());
                                    } else if (var316.startsWith(class135.field2271)) {
                                        var317 = 7;
                                        var315 = var315.substring(class135.field2271.length());
                                    } else if (var316.startsWith(class135.field2105)) {
                                        var317 = 8;
                                        var315 = var315.substring(class135.field2105.length());
                                    } else if (var316.startsWith(class135.field2201)) {
                                        var317 = 9;
                                        var315 = var315.substring(class135.field2201.length());
                                    } else if (var316.startsWith(class135.field2277)) {
                                        var317 = 10;
                                        var315 = var315.substring(class135.field2277.length());
                                    } else if (var316.startsWith(class135.field2103)) {
                                        var317 = 11;
                                        var315 = var315.substring(class135.field2103.length());
                                    }
                                }
                                String var318 = var315.toLowerCase();
                                byte var319 = 0;
                                if (var318.startsWith(class135.field2280)) {
                                    var319 = 1;
                                    var315 = var315.substring(class135.field2280.length());
                                } else if (var318.startsWith(class135.field2123)) {
                                    var319 = 2;
                                    var315 = var315.substring(class135.field2123.length());
                                } else if (var318.startsWith(class135.field2284)) {
                                    var319 = 3;
                                    var315 = var315.substring(class135.field2284.length());
                                } else if (var318.startsWith(class135.field2286)) {
                                    var319 = 4;
                                    var315 = var315.substring(class135.field2286.length());
                                } else if (var318.startsWith(class135.field2288)) {
                                    var319 = 5;
                                    var315 = var315.substring(class135.field2288.length());
                                } else if (client.field654 != 0) {
                                    if (var318.startsWith(class135.field2281)) {
                                        var319 = 1;
                                        var315 = var315.substring(class135.field2281.length());
                                    } else if (var318.startsWith(class135.field2283)) {
                                        var319 = 2;
                                        var315 = var315.substring(class135.field2283.length());
                                    } else if (var318.startsWith(class135.field2285)) {
                                        var319 = 3;
                                        var315 = var315.substring(class135.field2285.length());
                                    } else if (var318.startsWith(class135.field2287)) {
                                        var319 = 4;
                                        var315 = var315.substring(class135.field2287.length());
                                    } else if (var318.startsWith(class135.field2289)) {
                                        var319 = 5;
                                        var315 = var315.substring(class135.field2289.length());
                                    }
                                }
                                client.field498.method2355(128);
                                client.field498.method2484(0);
                                int var320 = client.field498.field2030;
                                client.field498.method2484(var317);
                                client.field498.method2484(var319);
                                class116 var321 = client.field498;
                                int var322 = var321.field2030;
                                byte[] var323 = class150.method2081(var315);
                                var321.method2574(var323.length);
                                var321.field2030 += Statics.field2836.method2425(var323, 0, var323.length, var321.field2036, var321.field2030);
                                client.field498.method2518(client.field498.field2030 - var320);
                            }
                            continue;
                        }
                        if (var339 == 5009) {
                            var6 -= 2;
                            String var324 = field380[var6];
                            String var325 = field380[var6 + 1];
                            client.field498.method2355(66);
                            client.field498.method2485(0);
                            int var326 = client.field498.field2030;
                            client.field498.method2682(var324);
                            class116 var327 = client.field498;
                            int var328 = var327.field2030;
                            byte[] var329 = class150.method2081(var325);
                            var327.method2574(var329.length);
                            var327.field2030 += Statics.field2836.method2425(var329, 0, var329.length, var327.field2036, var327.field2030);
                            client.field498.method2494(client.field498.field2030 - var326);
                            continue;
                        }
                        if (var339 == 5010) {
                            var5--;
                            int var330 = field379[var5];
                            String var331 = null;
                            if (var330 < 100) {
                                var331 = client.field551[var330];
                            }
                            if (var331 == null) {
                                var331 = "";
                            }
                            field380[var6++] = var331;
                            continue;
                        }
                        if (var339 == 5011) {
                            var5--;
                            int var332 = field379[var5];
                            String var333 = null;
                            if (var332 < 100) {
                                var333 = client.field567[var332];
                            }
                            if (var333 == null) {
                                var333 = "";
                            }
                            field380[var6++] = var333;
                            continue;
                        }
                        if (var339 == 5015) {
                            String var334;
                            if (Statics.field905 == null || Statics.field905.field37 == null) {
                                var334 = "";
                            } else {
                                var334 = Statics.field905.field37;
                            }
                            field380[var6++] = var334;
                            continue;
                        }
                        if (var339 == 5016) {
                            field379[var5++] = client.field463;
                            continue;
                        }
                        if (var339 == 5017) {
                            field379[var5++] = client.field684;
                            continue;
                        }
                    }
                } else {
                    class159 var64;
                    if (var339 >= 2000) {
                        var339 -= 1000;
                        var5--;
                        var64 = class159.method1397(field379[var5]);
                    } else {
                        var64 = var41 ? Statics.field956 : Statics.field378;
                    }
                    if (var339 == 1300) {
                        var5--;
                        int var65 = field379[var5] - 1;
                        if (var65 >= 0 && var65 <= 9) {
                            var6--;
                            var64.method3241(var65, field380[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var339 == 1301) {
                        var5 -= 2;
                        int var66 = field379[var5];
                        int var67 = field379[var5 + 1];
                        var64.field2608 = class159.method89(var66, var67);
                        continue;
                    }
                    if (var339 == 1302) {
                        var5--;
                        var64.field2667 = field379[var5] == 1;
                        continue;
                    }
                    if (var339 == 1303) {
                        var5--;
                        var64.field2665 = field379[var5];
                        continue;
                    }
                    if (var339 == 1304) {
                        var5--;
                        var64.field2702 = field379[var5];
                        continue;
                    }
                    if (var339 == 1305) {
                        var6--;
                        var64.field2662 = field380[var6];
                        continue;
                    }
                    if (var339 == 1306) {
                        var6--;
                        var64.field2668 = field380[var6];
                        continue;
                    }
                    if (var339 == 1307) {
                        var64.field2609 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var338) {
            StringBuilder var336 = new StringBuilder(30);
            var336.append("").append(var4.field2821).append(" ");
            for (int var337 = field388 - 1; var337 >= 0; var337--) {
                var336.append("").append(field382[var337].field253.field2821).append(" ");
            }
            var336.append("").append(var10);
            class80.method2076(var336.toString(), var338);
        }
    }

    @ObfuscatedName("l.d(II)V")
    public static void method6(int arg0) {
        if (arg0 == -1 || !class159.method129(arg0)) {
            return;
        }
        class159[] var1 = Statics.field1921[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3.field2670 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field6 = var3.field2670;
                method2245(var4, 2000000);
            }
        }
    }
}
