package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("r")
public class class26 {

    @ObfuscatedName("r.k")
    public static int[] field403 = new int[5];

    @ObfuscatedName("r.q")
    public static int[][] field404 = new int[5][5000];

    @ObfuscatedName("r.t")
    public static int[] field407 = new int[1000];

    @ObfuscatedName("r.v")
    public static String[] field410 = new String[1000];

    @ObfuscatedName("r.y")
    public static int field401 = 0;

    @ObfuscatedName("r.w")
    public static class18[] field406 = new class18[50];

    @ObfuscatedName("r.n")
    public static Calendar field409 = Calendar.getInstance();

    @ObfuscatedName("r.x")
    public static final String[] field400 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.b(Lb;B)V")
    public static void method1493(class1 arg0) {
        method111(arg0, 200000);
    }

    @ObfuscatedName("y.c(Lb;II)V")
    public static void method111(class1 arg0, int arg1) {
        Object[] var2 = arg0.field15;
        int var3 = (Integer) var2[0];
        class5 var4 = class5.method3042(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field80;
        int[] var9 = var4.field72;
        byte var10 = -1;
        field401 = 0;
        try {
            Statics.field408 = new int[var4.field74];
            int var11 = 0;
            Statics.field402 = new String[var4.field75];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field10;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2618;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2619;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2618;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2619;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field11;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field408[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field8;
                    }
                    Statics.field402[var12++] = var15;
                }
            }
            int var16 = 0;
            label2267: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var358 = var8[var7];
                if (var358 < 100) {
                    if (var358 == 0) {
                        field407[var5++] = var9[var7];
                        continue;
                    }
                    if (var358 == 1) {
                        int var17 = var9[var7];
                        field407[var5++] = class160.field2742[var17];
                        continue;
                    }
                    if (var358 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class160.field2742[var18] = field407[var5];
                        client.method21(var18);
                        continue;
                    }
                    if (var358 == 3) {
                        field410[var6++] = var4.field76[var7];
                        continue;
                    }
                    if (var358 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var358 == 7) {
                        var5 -= 2;
                        if (field407[var5 + 1] != field407[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var358 == 8) {
                        var5 -= 2;
                        if (field407[var5 + 1] == field407[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var358 == 9) {
                        var5 -= 2;
                        if (field407[var5] < field407[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var358 == 10) {
                        var5 -= 2;
                        if (field407[var5] > field407[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var358 == 21) {
                        if (field401 == 0) {
                            return;
                        }
                        class18 var19 = field406[--field401];
                        var4 = var19.field290;
                        var8 = var4.field80;
                        var9 = var4.field72;
                        var7 = var19.field284;
                        Statics.field408 = var19.field285;
                        Statics.field402 = var19.field286;
                        continue;
                    }
                    if (var358 == 25) {
                        int var20 = var9[var7];
                        field407[var5++] = class160.method1338(var20);
                        continue;
                    }
                    if (var358 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class160.method1642(var21, field407[var5]);
                        continue;
                    }
                    if (var358 == 31) {
                        var5 -= 2;
                        if (field407[var5] <= field407[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var358 == 32) {
                        var5 -= 2;
                        if (field407[var5] >= field407[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var358 == 33) {
                        field407[var5++] = Statics.field408[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var358 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field408[var10001] = field407[var5];
                        continue;
                    }
                    if (var358 == 35) {
                        field410[var6++] = Statics.field402[var9[var7]];
                        continue;
                    }
                    if (var358 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field402[var10001] = field410[var6];
                        continue;
                    }
                    if (var358 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class148.method2687(field410, var6, var22);
                        field410[var6++] = var23;
                        continue;
                    }
                    if (var358 == 38) {
                        var5--;
                        continue;
                    }
                    if (var358 == 39) {
                        var6--;
                        continue;
                    }
                    if (var358 == 40) {
                        int var24 = var9[var7];
                        class5 var25 = class5.method3042(var24);
                        int[] var26 = new int[var25.field74];
                        String[] var27 = new String[var25.field75];
                        for (int var28 = 0; var28 < var25.field77; var28++) {
                            var26[var28] = field407[var5 - var25.field77 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field83; var29++) {
                            var27[var29] = field410[var6 - var25.field83 + var29];
                        }
                        var5 -= var25.field77;
                        var6 -= var25.field83;
                        class18 var30 = new class18();
                        var30.field290 = var4;
                        var30.field284 = var7;
                        var30.field285 = Statics.field408;
                        var30.field286 = Statics.field402;
                        field406[++field401 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field80;
                        var9 = var25.field72;
                        var7 = -1;
                        Statics.field408 = var26;
                        Statics.field402 = var27;
                        continue;
                    }
                    if (var358 == 42) {
                        field407[var5++] = client.field671[var9[var7]];
                        continue;
                    }
                    if (var358 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field671[var10001] = field407[var5];
                        continue;
                    }
                    if (var358 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field407[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field403[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2267;
                                }
                                field404[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var358 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field407[var5];
                        if (var37 >= 0 && var37 < field403[var36]) {
                            field407[var5++] = field404[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var358 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field407[var5];
                        if (var39 >= 0 && var39 < field403[var38]) {
                            field404[var38][var39] = field407[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var358 == 47) {
                        String var40 = client.field485[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field410[var6++] = var40;
                        continue;
                    }
                    if (var358 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field485[var10001] = field410[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var358 < 1000) {
                    if (var358 == 100) {
                        var5 -= 3;
                        int var42 = field407[var5];
                        int var43 = field407[var5 + 1];
                        int var44 = field407[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class159 var45 = class159.method2333(var42);
                        if (var45.field2635 == null) {
                            var45.field2635 = new class159[var44 + 1];
                        }
                        if (var45.field2635.length <= var44) {
                            class159[] var46 = new class159[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2635.length; var47++) {
                                var46[var47] = var45.field2635[var47];
                            }
                            var45.field2635 = var46;
                        }
                        if (var44 > 0 && var45.field2635[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class159 var48 = new class159();
                        var48.field2620 = var43;
                        var48.field2625 = var48.field2618 = var45.field2618;
                        var48.field2619 = var44;
                        var48.field2617 = true;
                        var45.field2635[var44] = var48;
                        if (var41) {
                            Statics.field312 = var48;
                        } else {
                            Statics.field1296 = var48;
                        }
                        client.method728(var45);
                        continue;
                    }
                    if (var358 == 101) {
                        class159 var49 = var41 ? Statics.field312 : Statics.field1296;
                        class159 var50 = class159.method2333(var49.field2618);
                        var50.field2635[var49.field2619] = null;
                        client.method728(var50);
                        continue;
                    }
                    if (var358 == 102) {
                        var5--;
                        class159 var51 = class159.method2333(field407[var5]);
                        var51.field2635 = null;
                        client.method728(var51);
                        continue;
                    }
                    if (var358 == 200) {
                        var5 -= 2;
                        int var52 = field407[var5];
                        int var53 = field407[var5 + 1];
                        class159 var54 = class159.method2673(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field407[var5++] = 1;
                            if (var41) {
                                Statics.field312 = var54;
                            } else {
                                Statics.field1296 = var54;
                            }
                            continue;
                        }
                        field407[var5++] = 0;
                        continue;
                    }
                } else if (!(var358 < 1000 || var358 >= 1100) || !(var358 < 2000 || var358 >= 2100)) {
                    class159 var55;
                    if (var358 >= 2000) {
                        var358 -= 1000;
                        var5--;
                        var55 = class159.method2333(field407[var5]);
                    } else {
                        var55 = var41 ? Statics.field312 : Statics.field1296;
                    }
                    if (var358 == 1000) {
                        var5 -= 2;
                        var55.field2623 = field407[var5];
                        var55.field2727 = field407[var5 + 1];
                        client.method728(var55);
                        continue;
                    }
                    if (var358 == 1001) {
                        var5 -= 2;
                        var55.field2627 = field407[var5];
                        var55.field2628 = field407[var5 + 1];
                        client.method728(var55);
                        continue;
                    }
                    if (var358 == 1003) {
                        var5--;
                        boolean var56 = field407[var5] == 1;
                        if (var55.field2630 != var56) {
                            var55.field2630 = var56;
                            client.method728(var55);
                        }
                        continue;
                    }
                } else if (var358 >= 1100 && var358 < 1200 || var358 >= 2100 && var358 < 2200) {
                    class159 var57;
                    if (var358 >= 2000) {
                        var358 -= 1000;
                        var5--;
                        var57 = class159.method2333(field407[var5]);
                    } else {
                        var57 = var41 ? Statics.field312 : Statics.field1296;
                    }
                    if (var358 == 1100) {
                        var5 -= 2;
                        var57.field2631 = field407[var5];
                        if (var57.field2631 > var57.field2674 - var57.field2627) {
                            var57.field2631 = var57.field2674 - var57.field2627;
                        }
                        if (var57.field2631 < 0) {
                            var57.field2631 = 0;
                        }
                        var57.field2632 = field407[var5 + 1];
                        if (var57.field2632 > var57.field2634 - var57.field2628) {
                            var57.field2632 = var57.field2634 - var57.field2628;
                        }
                        if (var57.field2632 < 0) {
                            var57.field2632 = 0;
                        }
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1101) {
                        var5--;
                        var57.field2670 = field407[var5];
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1102) {
                        var5--;
                        var57.field2639 = field407[var5] == 1;
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1103) {
                        var5--;
                        var57.field2640 = field407[var5];
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1104) {
                        var5--;
                        var57.field2644 = field407[var5];
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1105) {
                        var5--;
                        var57.field2718 = field407[var5];
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1106) {
                        var5--;
                        var57.field2624 = field407[var5];
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1107) {
                        var5--;
                        var57.field2645 = field407[var5] == 1;
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1108) {
                        var57.field2650 = 1;
                        var5--;
                        var57.field2651 = field407[var5];
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1109) {
                        var5 -= 6;
                        var57.field2656 = field407[var5];
                        var57.field2633 = field407[var5 + 1];
                        var57.field2658 = field407[var5 + 2];
                        var57.field2659 = field407[var5 + 3];
                        var57.field2691 = field407[var5 + 4];
                        var57.field2661 = field407[var5 + 5];
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1110) {
                        var5--;
                        int var58 = field407[var5];
                        if (var57.field2654 != var58) {
                            var57.field2654 = var58;
                            var57.field2705 = 0;
                            var57.field2725 = 0;
                            client.method728(var57);
                        }
                        continue;
                    }
                    if (var358 == 1111) {
                        var5--;
                        var57.field2663 = field407[var5] == 1;
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1112) {
                        var6--;
                        String var59 = field410[var6];
                        if (!var59.equals(var57.field2689)) {
                            var57.field2689 = var59;
                            client.method728(var57);
                        }
                        continue;
                    }
                    if (var358 == 1113) {
                        var5--;
                        var57.field2726 = field407[var5];
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1114) {
                        var5 -= 3;
                        var57.field2714 = field407[var5];
                        var57.field2690 = field407[var5 + 1];
                        var57.field2667 = field407[var5 + 2];
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1115) {
                        var5--;
                        var57.field2616 = field407[var5] == 1;
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1116) {
                        var5--;
                        var57.field2646 = field407[var5];
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1117) {
                        var5--;
                        var57.field2647 = field407[var5];
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1118) {
                        var5--;
                        var57.field2665 = field407[var5] == 1;
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1119) {
                        var5--;
                        var57.field2657 = field407[var5] == 1;
                        client.method728(var57);
                        continue;
                    }
                    if (var358 == 1120) {
                        var5 -= 2;
                        var57.field2674 = field407[var5];
                        var57.field2634 = field407[var5 + 1];
                        client.method728(var57);
                        continue;
                    }
                } else if (!(var358 < 1200 || var358 >= 1300) || !(var358 < 2200 || var358 >= 2300)) {
                    class159 var60;
                    if (var358 >= 2000) {
                        var358 -= 1000;
                        var5--;
                        var60 = class159.method2333(field407[var5]);
                    } else {
                        var60 = var41 ? Statics.field312 : Statics.field1296;
                    }
                    client.method728(var60);
                    if (var358 == 1200) {
                        var5 -= 2;
                        int var61 = field407[var5];
                        int var62 = field407[var5 + 1];
                        var60.field2722 = var61;
                        var60.field2706 = var62;
                        class40 var63 = class40.method1565(var61);
                        var60.field2658 = var63.field990;
                        var60.field2659 = var63.field1027;
                        var60.field2691 = var63.field992;
                        var60.field2656 = var63.field1021;
                        var60.field2633 = var63.field994;
                        var60.field2661 = var63.field989;
                        if (var60.field2627 > 0) {
                            var60.field2661 = var60.field2661 * 32 / var60.field2627;
                        }
                        continue;
                    }
                    if (var358 == 1201) {
                        var60.field2650 = 2;
                        var5--;
                        var60.field2651 = field407[var5];
                        continue;
                    }
                    if (var358 == 1202) {
                        var60.field2650 = 3;
                        var60.field2651 = Statics.field368.field36.method3159();
                        continue;
                    }
                } else if ((var358 < 1300 || var358 >= 1400) && (var358 < 2300 || var358 >= 2400)) {
                    if (var358 >= 1400 && var358 < 1500 || var358 >= 2400 && var358 < 2500) {
                        class159 var68;
                        if (var358 >= 2000) {
                            var358 -= 1000;
                            var5--;
                            var68 = class159.method2333(field407[var5]);
                        } else {
                            var68 = var41 ? Statics.field312 : Statics.field1296;
                        }
                        var6--;
                        String var69 = field410[var6];
                        int[] var70 = null;
                        if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                            var5--;
                            int var71 = field407[var5];
                            if (var71 > 0) {
                                var70 = new int[var71];
                                while (var71-- > 0) {
                                    var5--;
                                    var70[var71] = field407[var5];
                                }
                            }
                            var69 = var69.substring(0, var69.length() - 1);
                        }
                        Object[] var72 = new Object[var69.length() + 1];
                        for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                            if (var69.charAt(var73 - 1) == 's') {
                                var6--;
                                var72[var73] = field410[var6];
                            } else {
                                var5--;
                                var72[var73] = Integer.valueOf(field407[var5]);
                            }
                        }
                        var5--;
                        int var74 = field407[var5];
                        if (var74 == -1) {
                            var72 = null;
                        } else {
                            var72[0] = Integer.valueOf(var74);
                        }
                        if (var358 == 1400) {
                            var68.field2687 = var72;
                        }
                        if (var358 == 1401) {
                            var68.field2648 = var72;
                        }
                        if (var358 == 1402) {
                            var68.field2733 = var72;
                        }
                        if (var358 == 1403) {
                            var68.field2737 = var72;
                        }
                        if (var358 == 1404) {
                            var68.field2693 = var72;
                        }
                        if (var358 == 1405) {
                            var68.field2694 = var72;
                        }
                        if (var358 == 1406) {
                            var68.field2697 = var72;
                        }
                        if (var358 == 1407) {
                            var68.field2698 = var72;
                            var68.field2699 = var70;
                        }
                        if (var358 == 1408) {
                            var68.field2704 = var72;
                        }
                        if (var358 == 1409) {
                            var68.field2735 = var72;
                        }
                        if (var358 == 1410) {
                            var68.field2682 = var72;
                        }
                        if (var358 == 1411) {
                            var68.field2688 = var72;
                        }
                        if (var358 == 1412) {
                            var68.field2707 = var72;
                        }
                        if (var358 == 1414) {
                            var68.field2669 = var72;
                            var68.field2701 = var70;
                        }
                        if (var358 == 1415) {
                            var68.field2702 = var72;
                            var68.field2703 = var70;
                        }
                        if (var358 == 1416) {
                            var68.field2696 = var72;
                        }
                        if (var358 == 1417) {
                            var68.field2615 = var72;
                        }
                        if (var358 == 1418) {
                            var68.field2666 = var72;
                        }
                        if (var358 == 1419) {
                            var68.field2664 = var72;
                        }
                        if (var358 == 1420) {
                            var68.field2731 = var72;
                        }
                        if (var358 == 1421) {
                            var68.field2710 = var72;
                        }
                        if (var358 == 1422) {
                            var68.field2711 = var72;
                        }
                        if (var358 == 1423) {
                            var68.field2715 = var72;
                        }
                        if (var358 == 1424) {
                            var68.field2713 = var72;
                        }
                        var68.field2685 = true;
                        continue;
                    }
                    if (var358 < 1600) {
                        class159 var75 = var41 ? Statics.field312 : Statics.field1296;
                        if (var358 == 1500) {
                            field407[var5++] = var75.field2623;
                            continue;
                        }
                        if (var358 == 1501) {
                            field407[var5++] = var75.field2727;
                            continue;
                        }
                        if (var358 == 1502) {
                            field407[var5++] = var75.field2627;
                            continue;
                        }
                        if (var358 == 1503) {
                            field407[var5++] = var75.field2628;
                            continue;
                        }
                        if (var358 == 1504) {
                            field407[var5++] = var75.field2630 ? 1 : 0;
                            continue;
                        }
                        if (var358 == 1505) {
                            field407[var5++] = var75.field2625;
                            continue;
                        }
                    } else if (var358 < 1700) {
                        class159 var76 = var41 ? Statics.field312 : Statics.field1296;
                        if (var358 == 1600) {
                            field407[var5++] = var76.field2631;
                            continue;
                        }
                        if (var358 == 1601) {
                            field407[var5++] = var76.field2632;
                            continue;
                        }
                        if (var358 == 1602) {
                            field410[var6++] = var76.field2689;
                            continue;
                        }
                        if (var358 == 1603) {
                            field407[var5++] = var76.field2674;
                            continue;
                        }
                        if (var358 == 1604) {
                            field407[var5++] = var76.field2634;
                            continue;
                        }
                        if (var358 == 1605) {
                            field407[var5++] = var76.field2661;
                            continue;
                        }
                        if (var358 == 1606) {
                            field407[var5++] = var76.field2658;
                            continue;
                        }
                        if (var358 == 1607) {
                            field407[var5++] = var76.field2691;
                            continue;
                        }
                        if (var358 == 1608) {
                            field407[var5++] = var76.field2659;
                            continue;
                        }
                    } else if (var358 < 1800) {
                        class159 var77 = var41 ? Statics.field312 : Statics.field1296;
                        if (var358 == 1700) {
                            field407[var5++] = var77.field2722;
                            continue;
                        }
                        if (var358 == 1701) {
                            if (var77.field2722 == -1) {
                                field407[var5++] = 0;
                            } else {
                                field407[var5++] = var77.field2706;
                            }
                            continue;
                        }
                        if (var358 == 1702) {
                            field407[var5++] = var77.field2619;
                            continue;
                        }
                    } else if (var358 < 1900) {
                        class159 var78 = var41 ? Statics.field312 : Statics.field1296;
                        if (var358 == 1800) {
                            field407[var5++] = class163.method1514(client.method2824(var78));
                            continue;
                        }
                        if (var358 == 1801) {
                            var5--;
                            int var79 = field407[var5];
                            int var359 = var79 - 1;
                            if (var78.field2679 != null && var359 < var78.field2679.length && var78.field2679[var359] != null) {
                                field410[var6++] = var78.field2679[var359];
                                continue;
                            }
                            field410[var6++] = "";
                            continue;
                        }
                        if (var358 == 1802) {
                            if (var78.field2678 == null) {
                                field410[var6++] = "";
                            } else {
                                field410[var6++] = var78.field2678;
                            }
                            continue;
                        }
                    } else if (var358 < 2600) {
                        var5--;
                        class159 var80 = class159.method2333(field407[var5]);
                        if (var358 == 2500) {
                            field407[var5++] = var80.field2623;
                            continue;
                        }
                        if (var358 == 2501) {
                            field407[var5++] = var80.field2727;
                            continue;
                        }
                        if (var358 == 2502) {
                            field407[var5++] = var80.field2627;
                            continue;
                        }
                        if (var358 == 2503) {
                            field407[var5++] = var80.field2628;
                            continue;
                        }
                        if (var358 == 2504) {
                            field407[var5++] = var80.field2630 ? 1 : 0;
                            continue;
                        }
                        if (var358 == 2505) {
                            field407[var5++] = var80.field2625;
                            continue;
                        }
                    } else if (var358 < 2700) {
                        var5--;
                        class159 var81 = class159.method2333(field407[var5]);
                        if (var358 == 2600) {
                            field407[var5++] = var81.field2631;
                            continue;
                        }
                        if (var358 == 2601) {
                            field407[var5++] = var81.field2632;
                            continue;
                        }
                        if (var358 == 2602) {
                            field410[var6++] = var81.field2689;
                            continue;
                        }
                        if (var358 == 2603) {
                            field407[var5++] = var81.field2674;
                            continue;
                        }
                        if (var358 == 2604) {
                            field407[var5++] = var81.field2634;
                            continue;
                        }
                        if (var358 == 2605) {
                            field407[var5++] = var81.field2661;
                            continue;
                        }
                        if (var358 == 2606) {
                            field407[var5++] = var81.field2658;
                            continue;
                        }
                        if (var358 == 2607) {
                            field407[var5++] = var81.field2691;
                            continue;
                        }
                        if (var358 == 2608) {
                            field407[var5++] = var81.field2659;
                            continue;
                        }
                    } else if (var358 < 2800) {
                        if (var358 == 2700) {
                            var5--;
                            class159 var82 = class159.method2333(field407[var5]);
                            field407[var5++] = var82.field2722;
                            continue;
                        }
                        if (var358 == 2701) {
                            var5--;
                            class159 var83 = class159.method2333(field407[var5]);
                            if (var83.field2722 == -1) {
                                field407[var5++] = 0;
                            } else {
                                field407[var5++] = var83.field2706;
                            }
                            continue;
                        }
                        if (var358 == 2702) {
                            var5--;
                            int var84 = field407[var5];
                            class4 var85 = (class4) client.field597.method3232((long) var84);
                            if (var85 == null) {
                                field407[var5++] = 0;
                            } else {
                                field407[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var358 < 2900) {
                        var5--;
                        class159 var86 = class159.method2333(field407[var5]);
                        if (var358 == 2800) {
                            field407[var5++] = class163.method1514(client.method2824(var86));
                            continue;
                        }
                        if (var358 == 2801) {
                            var5--;
                            int var87 = field407[var5];
                            int var360 = var87 - 1;
                            if (var86.field2679 != null && var360 < var86.field2679.length && var86.field2679[var360] != null) {
                                field410[var6++] = var86.field2679[var360];
                                continue;
                            }
                            field410[var6++] = "";
                            continue;
                        }
                        if (var358 == 2802) {
                            if (var86.field2678 == null) {
                                field410[var6++] = "";
                            } else {
                                field410[var6++] = var86.field2678;
                            }
                            continue;
                        }
                    } else if (var358 < 3200) {
                        if (var358 == 3100) {
                            var6--;
                            String var88 = field410[var6];
                            client.method112(0, "", var88);
                            continue;
                        }
                        if (var358 == 3101) {
                            var5 -= 2;
                            client.method2337(Statics.field368, field407[var5], field407[var5 + 1]);
                            continue;
                        }
                        if (var358 == 3103) {
                            client.method1384();
                            continue;
                        }
                        if (var358 == 3104) {
                            var6--;
                            String var89 = field410[var6];
                            int var90 = 0;
                            boolean var91 = class148.method2888(var89, 10, true);
                            if (var91) {
                                int var92 = class148.method2674(var89, 10, true);
                                var90 = var92;
                            }
                            client.field519.method2273(181);
                            client.field519.method2385(var90);
                            continue;
                        }
                        if (var358 == 3105) {
                            var6--;
                            String var93 = field410[var6];
                            client.field519.method2273(35);
                            client.field519.method2590(var93.length() + 1);
                            client.field519.method2520(var93);
                            continue;
                        }
                        if (var358 == 3106) {
                            var6--;
                            String var94 = field410[var6];
                            client.field519.method2273(169);
                            client.field519.method2590(var94.length() + 1);
                            client.field519.method2520(var94);
                            continue;
                        }
                        if (var358 == 3107) {
                            var5--;
                            int var95 = field407[var5];
                            var6--;
                            String var96 = field410[var6];
                            client.method1808(var95, var96);
                            continue;
                        }
                        if (var358 == 3108) {
                            var5 -= 3;
                            int var97 = field407[var5];
                            int var98 = field407[var5 + 1];
                            int var99 = field407[var5 + 2];
                            class159 var100 = class159.method2333(var99);
                            if (client.field648 == null && !client.field619 && var100 != null) {
                                class159 var101 = client.method160(var100);
                                if (var101 == null) {
                                    var101 = var100.field2680;
                                }
                                if (var101 != null) {
                                    client.field648 = var100;
                                    class159 var103 = client.method160(var100);
                                    if (var103 == null) {
                                        var103 = var100.field2680;
                                    }
                                    client.field649 = var103;
                                    client.field650 = var97;
                                    client.field651 = var98;
                                    Statics.field1837 = 0;
                                    client.field659 = false;
                                }
                            }
                            continue;
                        }
                        if (var358 == 3109) {
                            var5 -= 2;
                            int var105 = field407[var5];
                            int var106 = field407[var5 + 1];
                            class159 var107 = var41 ? Statics.field312 : Statics.field1296;
                            if (client.field648 == null && !client.field619 && var107 != null) {
                                class159 var108 = client.method160(var107);
                                if (var108 == null) {
                                    var108 = var107.field2680;
                                }
                                if (var108 != null) {
                                    client.field648 = var107;
                                    class159 var110 = client.method160(var107);
                                    if (var110 == null) {
                                        var110 = var107.field2680;
                                    }
                                    client.field649 = var110;
                                    client.field650 = var105;
                                    client.field651 = var106;
                                    Statics.field1837 = 0;
                                    client.field659 = false;
                                }
                            }
                            continue;
                        }
                        if (var358 == 3110) {
                            var5--;
                            Statics.field377 = field407[var5] == 1;
                            continue;
                        }
                    } else if (var358 < 3300) {
                        if (var358 == 3200) {
                            var5 -= 3;
                            client.method208(field407[var5], field407[var5 + 1], field407[var5 + 2]);
                            continue;
                        }
                        if (var358 == 3201) {
                            var5--;
                            int var112 = field407[var5];
                            if (var112 == -1 && !client.field714) {
                                Statics.field68.method2755();
                                class139.field2379 = 1;
                                Statics.field2380 = null;
                            } else if (var112 != -1 && client.field658 != var112 && client.field517 != 0 && !client.field714) {
                                class155 var113 = Statics.field509;
                                int var114 = client.field517;
                                class139.field2379 = 1;
                                Statics.field2380 = var113;
                                Statics.field2381 = var112;
                                Statics.field2383 = 0;
                                Statics.field89 = var114;
                                Statics.field1543 = false;
                                Statics.field2382 = 2;
                            }
                            client.field658 = var112;
                            continue;
                        }
                        if (var358 == 3202) {
                            var5 -= 2;
                            Statics.method138(field407[var5], field407[var5 + 1]);
                            continue;
                        }
                    } else if (var358 < 3400) {
                        if (var358 == 3300) {
                            field407[var5++] = client.field489;
                            continue;
                        }
                        if (var358 == 3301) {
                            var5 -= 2;
                            int var115 = field407[var5];
                            int var116 = field407[var5 + 1];
                            field407[var5++] = class19.method264(var115, var116);
                            continue;
                        }
                        if (var358 == 3302) {
                            var5 -= 2;
                            int var117 = field407[var5];
                            int var118 = field407[var5 + 1];
                            int[] var119 = field407;
                            int var120 = var5++;
                            class19 var121 = (class19) class19.field295.method3232((long) var117);
                            int var122;
                            if (var121 == null) {
                                var122 = 0;
                            } else if (var118 >= 0 && var118 < var121.field293.length) {
                                var122 = var121.field293[var118];
                            } else {
                                var122 = 0;
                            }
                            var119[var120] = var122;
                            continue;
                        }
                        if (var358 == 3303) {
                            var5 -= 2;
                            int var123 = field407[var5];
                            int var124 = field407[var5 + 1];
                            field407[var5++] = class19.method1646(var123, var124);
                            continue;
                        }
                        if (var358 == 3304) {
                            var5--;
                            int var125 = field407[var5];
                            int[] var126 = field407;
                            int var127 = var5++;
                            class41 var128 = (class41) class41.field1029.method3188((long) var125);
                            class41 var129;
                            if (var128 == null) {
                                byte[] var130 = Statics.field1032.method2964(5, var125);
                                class41 var131 = new class41();
                                if (var130 != null) {
                                    var131.method871(new class127(var130));
                                }
                                class41.field1029.method3190(var131, (long) var125);
                                var129 = var131;
                            } else {
                                var129 = var128;
                            }
                            var126[var127] = var129.field1030;
                            continue;
                        }
                        if (var358 == 3305) {
                            var5--;
                            int var132 = field407[var5];
                            field407[var5++] = client.field615[var132];
                            continue;
                        }
                        if (var358 == 3306) {
                            var5--;
                            int var133 = field407[var5];
                            field407[var5++] = client.field613[var133];
                            continue;
                        }
                        if (var358 == 3307) {
                            var5--;
                            int var134 = field407[var5];
                            field407[var5++] = client.field617[var134];
                            continue;
                        }
                        if (var358 == 3308) {
                            int var135 = Statics.field13;
                            int var136 = (Statics.field368.field444 >> 7) + Statics.field96;
                            int var137 = (Statics.field368.field420 >> 7) + Statics.field92;
                            field407[var5++] = (var135 << 28) + (var136 << 14) + var137;
                            continue;
                        }
                        if (var358 == 3309) {
                            var5--;
                            int var138 = field407[var5];
                            field407[var5++] = var138 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var358 == 3310) {
                            var5--;
                            int var139 = field407[var5];
                            field407[var5++] = var139 >> 28;
                            continue;
                        }
                        if (var358 == 3311) {
                            var5--;
                            int var140 = field407[var5];
                            field407[var5++] = var140 & 0x3FFF;
                            continue;
                        }
                        if (var358 == 3312) {
                            field407[var5++] = client.field661 ? 1 : 0;
                            continue;
                        }
                        if (var358 == 3313) {
                            var5 -= 2;
                            int var141 = field407[var5] + 32768;
                            int var142 = field407[var5 + 1];
                            field407[var5++] = class19.method264(var141, var142);
                            continue;
                        }
                        if (var358 == 3314) {
                            var5 -= 2;
                            int var143 = field407[var5] + 32768;
                            int var144 = field407[var5 + 1];
                            int[] var145 = field407;
                            int var146 = var5++;
                            class19 var147 = (class19) class19.field295.method3232((long) var143);
                            int var148;
                            if (var147 == null) {
                                var148 = 0;
                            } else if (var144 >= 0 && var144 < var147.field293.length) {
                                var148 = var147.field293[var144];
                            } else {
                                var148 = 0;
                            }
                            var145[var146] = var148;
                            continue;
                        }
                        if (var358 == 3315) {
                            var5 -= 2;
                            int var149 = field407[var5] + 32768;
                            int var150 = field407[var5 + 1];
                            field407[var5++] = class19.method1646(var149, var150);
                            continue;
                        }
                        if (var358 == 3316) {
                            if (client.field644 >= 2) {
                                field407[var5++] = client.field644;
                            } else {
                                field407[var5++] = 0;
                            }
                            continue;
                        }
                        if (var358 == 3317) {
                            field407[var5++] = client.field496;
                            continue;
                        }
                        if (var358 == 3318) {
                            field407[var5++] = client.field480;
                            continue;
                        }
                        if (var358 == 3321) {
                            field407[var5++] = client.field642;
                            continue;
                        }
                        if (var358 == 3322) {
                            field407[var5++] = client.field584;
                            continue;
                        }
                        if (var358 == 3323) {
                            if (client.field645) {
                                field407[var5++] = 1;
                            } else {
                                field407[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var358 < 3500) {
                        if (var358 == 3400) {
                            var5 -= 2;
                            int var151 = field407[var5];
                            int var152 = field407[var5 + 1];
                            class39 var153 = class39.method3180(var151);
                            if (var153.field962 != 's') {
                            }
                            for (int var154 = 0; var154 < var153.field965; var154++) {
                                if (var153.field966[var154] == var152) {
                                    field410[var6++] = var153.field961[var154];
                                    var153 = null;
                                    break;
                                }
                            }
                            if (var153 != null) {
                                field410[var6++] = var153.field969;
                            }
                            continue;
                        }
                        if (var358 == 3408) {
                            var5 -= 4;
                            int var155 = field407[var5];
                            int var156 = field407[var5 + 1];
                            int var157 = field407[var5 + 2];
                            int var158 = field407[var5 + 3];
                            class39 var159 = class39.method3180(var157);
                            if (var159.field974 == var155 && var159.field962 == var156) {
                                for (int var160 = 0; var160 < var159.field965; var160++) {
                                    if (var159.field966[var160] == var158) {
                                        if (var156 == 115) {
                                            field410[var6++] = var159.field961[var160];
                                        } else {
                                            field407[var5++] = var159.field963[var160];
                                        }
                                        var159 = null;
                                        break;
                                    }
                                }
                                if (var159 != null) {
                                    if (var156 == 115) {
                                        field410[var6++] = var159.field969;
                                    } else {
                                        field407[var5++] = var159.field964;
                                    }
                                }
                                continue;
                            }
                            if (var156 == 115) {
                                field410[var6++] = "null";
                            } else {
                                field407[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var358 < 3700) {
                        if (var358 == 3600) {
                            if (client.field732 == 0) {
                                field407[var5++] = -2;
                            } else if (client.field732 == 1) {
                                field407[var5++] = -1;
                            } else {
                                field407[var5++] = client.field729;
                            }
                            continue;
                        }
                        if (var358 == 3601) {
                            var5--;
                            int var161 = field407[var5];
                            if (client.field732 == 2 && var161 < client.field729) {
                                field410[var6++] = client.field555[var161].field372;
                                continue;
                            }
                            field410[var6++] = "";
                            continue;
                        }
                        if (var358 == 3602) {
                            var5--;
                            int var162 = field407[var5];
                            if (client.field732 == 2 && var162 < client.field729) {
                                field407[var5++] = client.field555[var162].field370;
                                continue;
                            }
                            field407[var5++] = 0;
                            continue;
                        }
                        if (var358 == 3603) {
                            var5--;
                            int var163 = field407[var5];
                            if (client.field732 == 2 && var163 < client.field729) {
                                field407[var5++] = client.field555[var163].field371;
                                continue;
                            }
                            field407[var5++] = 0;
                            continue;
                        }
                        if (var358 == 3604) {
                            var6--;
                            String var164 = field410[var6];
                            var5--;
                            int var165 = field407[var5];
                            client.method2823(var164, var165);
                            continue;
                        }
                        if (var358 == 3605) {
                            var6--;
                            String var166 = field410[var6];
                            if (var166 == null) {
                                continue;
                            }
                            if ((client.field729 < 200 || client.field635 == 1) && client.field729 < 400) {
                                String var167 = class149.method122(var166, Statics.field210);
                                if (var167 == null) {
                                    continue;
                                }
                                for (int var168 = 0; var168 < client.field729; var168++) {
                                    class23 var169 = client.field555[var168];
                                    String var170 = class149.method122(var169.field372, Statics.field210);
                                    if (var170 != null && var170.equals(var167)) {
                                        client.method112(0, "", var166 + class135.field2279);
                                        continue label2267;
                                    }
                                    if (var169.field369 != null) {
                                        String var171 = class149.method122(var169.field369, Statics.field210);
                                        if (var171 != null && var171.equals(var167)) {
                                            client.method112(0, "", var166 + class135.field2279);
                                            continue label2267;
                                        }
                                    }
                                }
                                for (int var172 = 0; var172 < client.field733; var172++) {
                                    class11 var173 = client.field722[var172];
                                    String var174 = class149.method122(var173.field202, Statics.field210);
                                    if (var174 != null && var174.equals(var167)) {
                                        client.method112(0, "", class135.field2153 + var166 + class135.field2285);
                                        continue label2267;
                                    }
                                    if (var173.field199 != null) {
                                        String var175 = class149.method122(var173.field199, Statics.field210);
                                        if (var175 != null && var175.equals(var167)) {
                                            client.method112(0, "", class135.field2153 + var166 + class135.field2285);
                                            continue label2267;
                                        }
                                    }
                                }
                                if (class149.method122(Statics.field368.field52, Statics.field210).equals(var167)) {
                                    client.method112(0, "", class135.field2282);
                                } else {
                                    client.field519.method2273(143);
                                    class116 var176 = client.field519;
                                    int var177 = var166.length() + 1;
                                    var176.method2590(var177);
                                    client.field519.method2520(var166);
                                }
                                continue;
                            }
                            client.method112(0, "", class135.field2278);
                            continue;
                        }
                        if (var358 == 3606) {
                            var6--;
                            String var178 = field410[var6];
                            client.method123(var178);
                            continue;
                        }
                        if (var358 == 3607) {
                            var6--;
                            String var179 = field410[var6];
                            client.method687(var179, false);
                            continue;
                        }
                        if (var358 == 3608) {
                            var6--;
                            String var180 = field410[var6];
                            client.method2684(var180);
                            continue;
                        }
                        if (var358 == 3609) {
                            var6--;
                            String var181 = field410[var6];
                            if (var181.startsWith(class2.method10(0)) || var181.startsWith(class2.method10(1))) {
                                var181 = var181.substring(7);
                            }
                            field407[var5++] = client.method34(var181) ? 1 : 0;
                            continue;
                        }
                        if (var358 == 3611) {
                            if (client.field702 == null) {
                                field410[var6++] = "";
                            } else {
                                field410[var6++] = class147.method2171(client.field702);
                            }
                            continue;
                        }
                        if (var358 == 3612) {
                            if (client.field702 == null) {
                                field407[var5++] = 0;
                            } else {
                                field407[var5++] = Statics.field2700;
                            }
                            continue;
                        }
                        if (var358 == 3613) {
                            var5--;
                            int var182 = field407[var5];
                            if (client.field702 != null && var182 < Statics.field2700) {
                                field410[var6++] = Statics.field34[var182].field133;
                                continue;
                            }
                            field410[var6++] = "";
                            continue;
                        }
                        if (var358 == 3614) {
                            var5--;
                            int var183 = field407[var5];
                            if (client.field702 != null && var183 < Statics.field2700) {
                                field407[var5++] = Statics.field34[var183].field137;
                                continue;
                            }
                            field407[var5++] = 0;
                            continue;
                        }
                        if (var358 == 3615) {
                            var5--;
                            int var184 = field407[var5];
                            if (client.field702 != null && var184 < Statics.field2700) {
                                field407[var5++] = Statics.field34[var184].field132;
                                continue;
                            }
                            field407[var5++] = 0;
                            continue;
                        }
                        if (var358 == 3616) {
                            field407[var5++] = Statics.field993;
                            continue;
                        }
                        if (var358 == 3617) {
                            var6--;
                            String var185 = field410[var6];
                            if (Statics.field34 != null) {
                                client.field519.method2273(64);
                                class116 var186 = client.field519;
                                int var187 = var185.length() + 1;
                                var186.method2590(var187);
                                client.field519.method2520(var185);
                            }
                            continue;
                        }
                        if (var358 == 3618) {
                            field407[var5++] = Statics.field1487;
                            continue;
                        }
                        if (var358 == 3619) {
                            var6--;
                            String var188 = field410[var6];
                            if (!var188.equals("")) {
                                client.field519.method2273(255);
                                class116 var189 = client.field519;
                                int var190 = var188.length() + 1;
                                var189.method2590(var190);
                                client.field519.method2520(var188);
                            }
                            continue;
                        }
                        if (var358 == 3620) {
                            client.field519.method2273(255);
                            client.field519.method2590(0);
                            continue;
                        }
                        if (var358 == 3621) {
                            if (client.field732 == 0) {
                                field407[var5++] = -1;
                            } else {
                                field407[var5++] = client.field733;
                            }
                            continue;
                        }
                        if (var358 == 3622) {
                            var5--;
                            int var191 = field407[var5];
                            if (client.field732 != 0 && var191 < client.field733) {
                                field410[var6++] = client.field722[var191].field202;
                                continue;
                            }
                            field410[var6++] = "";
                            continue;
                        }
                        if (var358 == 3623) {
                            var6--;
                            String var192 = field410[var6];
                            if (var192.startsWith(class2.method10(0)) || var192.startsWith(class2.method10(1))) {
                                var192 = var192.substring(7);
                            }
                            field407[var5++] = client.method157(var192) ? 1 : 0;
                            continue;
                        }
                        if (var358 == 3624) {
                            var5--;
                            int var193 = field407[var5];
                            if (Statics.field34 != null && var193 < Statics.field2700 && Statics.field34[var193].field133.equalsIgnoreCase(Statics.field368.field52)) {
                                field407[var5++] = 1;
                                continue;
                            }
                            field407[var5++] = 0;
                            continue;
                        }
                        if (var358 == 3625) {
                            if (client.field730 == null) {
                                field410[var6++] = "";
                            } else {
                                field410[var6++] = class147.method2171(client.field730);
                            }
                            continue;
                        }
                    } else if (var358 < 4100) {
                        if (var358 == 4000) {
                            var5 -= 2;
                            int var194 = field407[var5];
                            int var195 = field407[var5 + 1];
                            field407[var5++] = var194 + var195;
                            continue;
                        }
                        if (var358 == 4001) {
                            var5 -= 2;
                            int var196 = field407[var5];
                            int var197 = field407[var5 + 1];
                            field407[var5++] = var196 - var197;
                            continue;
                        }
                        if (var358 == 4002) {
                            var5 -= 2;
                            int var198 = field407[var5];
                            int var199 = field407[var5 + 1];
                            field407[var5++] = var198 * var199;
                            continue;
                        }
                        if (var358 == 4003) {
                            var5 -= 2;
                            int var200 = field407[var5];
                            int var201 = field407[var5 + 1];
                            field407[var5++] = var200 / var201;
                            continue;
                        }
                        if (var358 == 4004) {
                            var5--;
                            int var202 = field407[var5];
                            field407[var5++] = (int) (Math.random() * (double) var202);
                            continue;
                        }
                        if (var358 == 4005) {
                            var5--;
                            int var203 = field407[var5];
                            field407[var5++] = (int) (Math.random() * (double) (var203 + 1));
                            continue;
                        }
                        if (var358 == 4006) {
                            var5 -= 5;
                            int var204 = field407[var5];
                            int var205 = field407[var5 + 1];
                            int var206 = field407[var5 + 2];
                            int var207 = field407[var5 + 3];
                            int var208 = field407[var5 + 4];
                            field407[var5++] = (var205 - var204) * (var208 - var206) / (var207 - var206) + var204;
                            continue;
                        }
                        if (var358 == 4007) {
                            var5 -= 2;
                            int var209 = field407[var5];
                            int var210 = field407[var5 + 1];
                            field407[var5++] = var209 * var210 / 100 + var209;
                            continue;
                        }
                        if (var358 == 4008) {
                            var5 -= 2;
                            int var211 = field407[var5];
                            int var212 = field407[var5 + 1];
                            field407[var5++] = var211 | 0x1 << var212;
                            continue;
                        }
                        if (var358 == 4009) {
                            var5 -= 2;
                            int var213 = field407[var5];
                            int var214 = field407[var5 + 1];
                            field407[var5++] = var213 & -1 - (0x1 << var214);
                            continue;
                        }
                        if (var358 == 4010) {
                            var5 -= 2;
                            int var215 = field407[var5];
                            int var216 = field407[var5 + 1];
                            field407[var5++] = (var215 & 0x1 << var216) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var358 == 4011) {
                            var5 -= 2;
                            int var217 = field407[var5];
                            int var218 = field407[var5 + 1];
                            field407[var5++] = var217 % var218;
                            continue;
                        }
                        if (var358 == 4012) {
                            var5 -= 2;
                            int var219 = field407[var5];
                            int var220 = field407[var5 + 1];
                            if (var219 == 0) {
                                field407[var5++] = 0;
                            } else {
                                field407[var5++] = (int) Math.pow((double) var219, (double) var220);
                            }
                            continue;
                        }
                        if (var358 == 4013) {
                            var5 -= 2;
                            int var221 = field407[var5];
                            int var222 = field407[var5 + 1];
                            if (var221 == 0) {
                                field407[var5++] = 0;
                            } else if (var222 == 0) {
                                field407[var5++] = Integer.MAX_VALUE;
                            } else {
                                field407[var5++] = (int) Math.pow((double) var221, 1.0D / (double) var222);
                            }
                            continue;
                        }
                        if (var358 == 4014) {
                            var5 -= 2;
                            int var223 = field407[var5];
                            int var224 = field407[var5 + 1];
                            field407[var5++] = var223 & var224;
                            continue;
                        }
                        if (var358 == 4015) {
                            var5 -= 2;
                            int var225 = field407[var5];
                            int var226 = field407[var5 + 1];
                            field407[var5++] = var225 | var226;
                            continue;
                        }
                    } else if (var358 < 4200) {
                        if (var358 == 4100) {
                            var6--;
                            String var227 = field410[var6];
                            var5--;
                            int var228 = field407[var5];
                            field410[var6++] = var227 + var228;
                            continue;
                        }
                        if (var358 == 4101) {
                            var6 -= 2;
                            String var229 = field410[var6];
                            String var230 = field410[var6 + 1];
                            field410[var6++] = var229 + var230;
                            continue;
                        }
                        if (var358 == 4102) {
                            var6--;
                            String var231 = field410[var6];
                            var5--;
                            int var232 = field407[var5];
                            field410[var6++] = var231 + class148.method2283(var232, true);
                            continue;
                        }
                        if (var358 == 4103) {
                            var6--;
                            String var233 = field410[var6];
                            field410[var6++] = var233.toLowerCase();
                            continue;
                        }
                        if (var358 == 4104) {
                            var5--;
                            int var234 = field407[var5];
                            long var235 = ((long) var234 + 11745L) * 86400000L;
                            field409.setTime(new Date(var235));
                            int var237 = field409.get(5);
                            int var238 = field409.get(2);
                            int var239 = field409.get(1);
                            field410[var6++] = var237 + "-" + field400[var238] + "-" + var239;
                            continue;
                        }
                        if (var358 == 4105) {
                            var6 -= 2;
                            String var240 = field410[var6];
                            String var241 = field410[var6 + 1];
                            if (Statics.field368.field36 != null && Statics.field368.field36.field2753) {
                                field410[var6++] = var241;
                                continue;
                            }
                            field410[var6++] = var240;
                            continue;
                        }
                        if (var358 == 4106) {
                            var5--;
                            int var242 = field407[var5];
                            field410[var6++] = Integer.toString(var242);
                            continue;
                        }
                        if (var358 == 4107) {
                            var6 -= 2;
                            int[] var243 = field407;
                            int var244 = var5++;
                            String var245 = field410[var6];
                            String var246 = field410[var6 + 1];
                            int var247 = client.field688;
                            int var248 = var245.length();
                            int var249 = var246.length();
                            int var250 = 0;
                            int var251 = 0;
                            char var252 = 0;
                            char var253 = 0;
                            int var254;
                            label2096: while (true) {
                                if (var250 - var252 >= var248 && var251 - var253 >= var249) {
                                    int var263 = Math.min(var248, var249);
                                    for (int var264 = 0; var264 < var263; var264++) {
                                        char var267 = var245.charAt(var264);
                                        char var268 = var246.charAt(var264);
                                        if (var267 != var268 && Character.toUpperCase(var267) != Character.toUpperCase(var268)) {
                                            char var269 = Character.toLowerCase(var267);
                                            char var270 = Character.toLowerCase(var268);
                                            if (var269 != var270) {
                                                var254 = Statics.method620(var269, var247) - Statics.method620(var270, var247);
                                                break label2096;
                                            }
                                        }
                                    }
                                    int var271 = var248 - var249;
                                    if (var271 == 0) {
                                        for (int var272 = 0; var272 < var263; var272++) {
                                            char var273 = var245.charAt(var272);
                                            char var274 = var246.charAt(var272);
                                            if (var273 != var274) {
                                                var254 = Statics.method620(var273, var247) - Statics.method620(var274, var247);
                                                break label2096;
                                            }
                                        }
                                        var254 = 0;
                                    } else {
                                        var254 = var271;
                                    }
                                    break;
                                }
                                if (var250 - var252 >= var248) {
                                    var254 = -1;
                                    break;
                                }
                                if (var251 - var253 >= var249) {
                                    var254 = 1;
                                    break;
                                }
                                char var255;
                                if (var252 == 0) {
                                    var255 = var245.charAt(var250++);
                                } else {
                                    var255 = var252;
                                    boolean var256 = false;
                                }
                                char var257;
                                if (var253 == 0) {
                                    var257 = var246.charAt(var251++);
                                } else {
                                    var257 = var253;
                                    boolean var258 = false;
                                }
                                var252 = class151.method2270(var255);
                                var253 = class151.method2270(var257);
                                char var259 = class151.method2671(var255, var247);
                                char var260 = class151.method2671(var257, var247);
                                if (var259 != var260 && Character.toUpperCase(var259) != Character.toUpperCase(var260)) {
                                    char var261 = Character.toLowerCase(var259);
                                    char var262 = Character.toLowerCase(var260);
                                    if (var261 != var262) {
                                        var254 = Statics.method620(var261, var247) - Statics.method620(var262, var247);
                                        break;
                                    }
                                }
                            }
                            var243[var244] = class148.method879(var254);
                            continue;
                        }
                        if (var358 == 4108) {
                            var6--;
                            String var275 = field410[var6];
                            var5 -= 2;
                            int var276 = field407[var5];
                            int var277 = field407[var5 + 1];
                            byte[] var278 = Statics.field764.method2964(var277, 0);
                            class183 var279 = new class183(var278);
                            field407[var5++] = var279.method3381(var275, var276);
                            continue;
                        }
                        if (var358 == 4109) {
                            var6--;
                            String var280 = field410[var6];
                            var5 -= 2;
                            int var281 = field407[var5];
                            int var282 = field407[var5 + 1];
                            byte[] var283 = Statics.field764.method2964(var282, 0);
                            class183 var284 = new class183(var283);
                            field407[var5++] = var284.method3323(var280, var281);
                            continue;
                        }
                        if (var358 == 4110) {
                            var6 -= 2;
                            String var285 = field410[var6];
                            String var286 = field410[var6 + 1];
                            var5--;
                            if (field407[var5] == 1) {
                                field410[var6++] = var285;
                            } else {
                                field410[var6++] = var286;
                            }
                            continue;
                        }
                        if (var358 == 4111) {
                            var6--;
                            String var287 = field410[var6];
                            field410[var6++] = class185.method3371(var287);
                            continue;
                        }
                        if (var358 == 4112) {
                            var6--;
                            String var288 = field410[var6];
                            var5--;
                            int var289 = field407[var5];
                            field410[var6++] = var288 + (char) var289;
                            continue;
                        }
                        if (var358 == 4113) {
                            var5--;
                            int var290 = field407[var5];
                            int[] var291 = field407;
                            int var292 = var5++;
                            char var293 = (char) var290;
                            boolean var294;
                            if (var293 >= ' ' && var293 <= '~') {
                                var294 = true;
                            } else if (var293 >= 160 && var293 <= 255) {
                                var294 = true;
                            } else if (var293 == 8364 || var293 == 338 || var293 == 8212 || var293 == 339 || var293 == 376) {
                                var294 = true;
                            } else {
                                var294 = false;
                            }
                            var291[var292] = var294 ? 1 : 0;
                            continue;
                        }
                        if (var358 == 4114) {
                            var5--;
                            int var295 = field407[var5];
                            int[] var296 = field407;
                            int var297 = var5++;
                            char var298 = (char) var295;
                            boolean var299 = var298 >= '0' && var298 <= '9' || var298 >= 'A' && var298 <= 'Z' || var298 >= 'a' && var298 <= 'z';
                            var296[var297] = var299 ? 1 : 0;
                            continue;
                        }
                        if (var358 == 4115) {
                            var5--;
                            int var300 = field407[var5];
                            field407[var5++] = class148.method2178((char) var300) ? 1 : 0;
                            continue;
                        }
                        if (var358 == 4116) {
                            var5--;
                            int var301 = field407[var5];
                            int[] var302 = field407;
                            int var303 = var5++;
                            char var304 = (char) var301;
                            boolean var305 = var304 >= '0' && var304 <= '9';
                            var302[var303] = var305 ? 1 : 0;
                            continue;
                        }
                        if (var358 == 4117) {
                            var6--;
                            String var306 = field410[var6];
                            if (var306 == null) {
                                field407[var5++] = 0;
                            } else {
                                field407[var5++] = var306.length();
                            }
                            continue;
                        }
                        if (var358 == 4118) {
                            var6--;
                            String var307 = field410[var6];
                            var5 -= 2;
                            int var308 = field407[var5];
                            int var309 = field407[var5 + 1];
                            field410[var6++] = var307.substring(var308, var309);
                            continue;
                        }
                        if (var358 == 4119) {
                            var6--;
                            String var310 = field410[var6];
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
                            field410[var6++] = var311.toString();
                            continue;
                        }
                        if (var358 == 4120) {
                            var6--;
                            String var315 = field410[var6];
                            var5--;
                            int var316 = field407[var5];
                            field407[var5++] = var315.indexOf(var316);
                            continue;
                        }
                    } else if (var358 < 4300) {
                        if (var358 == 4200) {
                            var5--;
                            int var317 = field407[var5];
                            field410[var6++] = class40.method1565(var317).field977;
                            continue;
                        }
                        if (var358 == 4201) {
                            var5 -= 2;
                            int var318 = field407[var5];
                            int var319 = field407[var5 + 1];
                            class40 var320 = class40.method1565(var318);
                            if (var319 >= 1 && var319 <= 5 && var320.field998[var319 - 1] != null) {
                                field410[var6++] = var320.field998[var319 - 1];
                                continue;
                            }
                            field410[var6++] = "";
                            continue;
                        }
                        if (var358 == 4202) {
                            var5 -= 2;
                            int var321 = field407[var5];
                            int var322 = field407[var5 + 1];
                            class40 var323 = class40.method1565(var321);
                            if (var322 >= 1 && var322 <= 5 && var323.field1018[var322 - 1] != null) {
                                field410[var6++] = var323.field1018[var322 - 1];
                                continue;
                            }
                            field410[var6++] = "";
                            continue;
                        }
                        if (var358 == 4203) {
                            var5--;
                            int var324 = field407[var5];
                            field407[var5++] = class40.method1565(var324).field996;
                            continue;
                        }
                        if (var358 == 4204) {
                            var5--;
                            int var325 = field407[var5];
                            field407[var5++] = class40.method1565(var325).field995 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var358 == 4205) {
                            var5--;
                            int var326 = field407[var5];
                            class40 var327 = class40.method1565(var326);
                            if (var327.field1015 == -1 && var327.field1016 >= 0) {
                                field407[var5++] = var327.field1016;
                                continue;
                            }
                            field407[var5++] = var326;
                            continue;
                        }
                        if (var358 == 4206) {
                            var5--;
                            int var328 = field407[var5];
                            class40 var329 = class40.method1565(var328);
                            if (var329.field1015 >= 0 && var329.field1016 >= 0) {
                                field407[var5++] = var329.field1016;
                                continue;
                            }
                            field407[var5++] = var328;
                            continue;
                        }
                        if (var358 == 4207) {
                            var5--;
                            int var330 = field407[var5];
                            field407[var5++] = class40.method1565(var330).field997 ? 1 : 0;
                            continue;
                        }
                    } else if (var358 < 5100) {
                        if (var358 == 5000) {
                            field407[var5++] = client.field482;
                            continue;
                        }
                        if (var358 == 5001) {
                            var5 -= 3;
                            client.field482 = field407[var5];
                            Statics.field412 = class138.method2170(field407[var5 + 1]);
                            if (Statics.field412 == null) {
                                Statics.field412 = class138.field2373;
                            }
                            client.field695 = field407[var5 + 2];
                            client.field519.method2273(45);
                            client.field519.method2590(client.field482);
                            client.field519.method2590(Statics.field412.field2375);
                            client.field519.method2590(client.field695);
                            continue;
                        }
                        if (var358 == 5002) {
                            var6--;
                            String var331 = field410[var6];
                            var5 -= 2;
                            int var332 = field407[var5];
                            int var333 = field407[var5 + 1];
                            client.field519.method2273(155);
                            class116 var334 = client.field519;
                            int var335 = var331.length() + 1;
                            var334.method2590(var335 + 2);
                            client.field519.method2520(var331);
                            client.field519.method2590(var332 - 1);
                            client.field519.method2590(var333);
                            continue;
                        }
                        if (var358 == 5003) {
                            var5--;
                            int var336 = field407[var5];
                            String var337 = null;
                            if (var336 < 100) {
                                var337 = client.field624[var336];
                            }
                            if (var337 == null) {
                                var337 = "";
                            }
                            field410[var6++] = var337;
                            continue;
                        }
                        if (var358 == 5004) {
                            var5--;
                            int var338 = field407[var5];
                            int var339 = -1;
                            if (var338 < 100 && client.field624[var338] != null) {
                                var339 = client.field626[var338];
                            }
                            field407[var5++] = var339;
                            continue;
                        }
                        if (var358 == 5005) {
                            if (Statics.field412 == null) {
                                field407[var5++] = -1;
                            } else {
                                field407[var5++] = Statics.field412.field2375;
                            }
                            continue;
                        }
                        if (var358 == 5008) {
                            var6--;
                            String var340 = field410[var6];
                            if (var340.startsWith("::")) {
                                client.method555(var340.substring(2));
                            } else {
                                String var341 = var340.toLowerCase();
                                byte var342 = 0;
                                if (var341.startsWith(class135.field2288)) {
                                    var342 = 0;
                                    var340 = var340.substring(class135.field2288.length());
                                } else if (var341.startsWith(class135.field2320)) {
                                    var342 = 1;
                                    var340 = var340.substring(class135.field2320.length());
                                } else if (var341.startsWith(class135.field2292)) {
                                    var342 = 2;
                                    var340 = var340.substring(class135.field2292.length());
                                } else if (var341.startsWith(class135.field2360)) {
                                    var342 = 3;
                                    var340 = var340.substring(class135.field2360.length());
                                } else if (var341.startsWith(class135.field2121)) {
                                    var342 = 4;
                                    var340 = var340.substring(class135.field2121.length());
                                } else if (var341.startsWith(class135.field2178)) {
                                    var342 = 5;
                                    var340 = var340.substring(class135.field2178.length());
                                } else if (var341.startsWith(class135.field2283)) {
                                    var342 = 6;
                                    var340 = var340.substring(class135.field2283.length());
                                } else if (var341.startsWith(class135.field2302)) {
                                    var342 = 7;
                                    var340 = var340.substring(class135.field2302.length());
                                } else if (var341.startsWith(class135.field2351)) {
                                    var342 = 8;
                                    var340 = var340.substring(class135.field2351.length());
                                } else if (var341.startsWith(class135.field2314)) {
                                    var342 = 9;
                                    var340 = var340.substring(class135.field2314.length());
                                } else if (var341.startsWith(class135.field2308)) {
                                    var342 = 10;
                                    var340 = var340.substring(class135.field2308.length());
                                } else if (var341.startsWith(class135.field2179)) {
                                    var342 = 11;
                                    var340 = var340.substring(class135.field2179.length());
                                } else if (client.field688 != 0) {
                                    if (var341.startsWith(class135.field2289)) {
                                        var342 = 0;
                                        var340 = var340.substring(class135.field2289.length());
                                    } else if (var341.startsWith(class135.field2291)) {
                                        var342 = 1;
                                        var340 = var340.substring(class135.field2291.length());
                                    } else if (var341.startsWith(class135.field2293)) {
                                        var342 = 2;
                                        var340 = var340.substring(class135.field2293.length());
                                    } else if (var341.startsWith(class135.field2154)) {
                                        var342 = 3;
                                        var340 = var340.substring(class135.field2154.length());
                                    } else if (var341.startsWith(class135.field2297)) {
                                        var342 = 4;
                                        var340 = var340.substring(class135.field2297.length());
                                    } else if (var341.startsWith(class135.field2299)) {
                                        var342 = 5;
                                        var340 = var340.substring(class135.field2299.length());
                                    } else if (var341.startsWith(class135.field2301)) {
                                        var342 = 6;
                                        var340 = var340.substring(class135.field2301.length());
                                    } else if (var341.startsWith(class135.field2303)) {
                                        var342 = 7;
                                        var340 = var340.substring(class135.field2303.length());
                                    } else if (var341.startsWith(class135.field2305)) {
                                        var342 = 8;
                                        var340 = var340.substring(class135.field2305.length());
                                    } else if (var341.startsWith(class135.field2307)) {
                                        var342 = 9;
                                        var340 = var340.substring(class135.field2307.length());
                                    } else if (var341.startsWith(class135.field2309)) {
                                        var342 = 10;
                                        var340 = var340.substring(class135.field2309.length());
                                    } else if (var341.startsWith(class135.field2311)) {
                                        var342 = 11;
                                        var340 = var340.substring(class135.field2311.length());
                                    }
                                }
                                String var343 = var340.toLowerCase();
                                byte var344 = 0;
                                if (var343.startsWith(class135.field2158)) {
                                    var344 = 1;
                                    var340 = var340.substring(class135.field2158.length());
                                } else if (var343.startsWith(class135.field2290)) {
                                    var344 = 2;
                                    var340 = var340.substring(class135.field2290.length());
                                } else if (var343.startsWith(class135.field2204)) {
                                    var344 = 3;
                                    var340 = var340.substring(class135.field2204.length());
                                } else if (var343.startsWith(class135.field2318)) {
                                    var344 = 4;
                                    var340 = var340.substring(class135.field2318.length());
                                } else if (var343.startsWith(class135.field2275)) {
                                    var344 = 5;
                                    var340 = var340.substring(class135.field2275.length());
                                } else if (client.field688 != 0) {
                                    if (var343.startsWith(class135.field2356)) {
                                        var344 = 1;
                                        var340 = var340.substring(class135.field2356.length());
                                    } else if (var343.startsWith(class135.field2315)) {
                                        var344 = 2;
                                        var340 = var340.substring(class135.field2315.length());
                                    } else if (var343.startsWith(class135.field2317)) {
                                        var344 = 3;
                                        var340 = var340.substring(class135.field2317.length());
                                    } else if (var343.startsWith(class135.field2319)) {
                                        var344 = 4;
                                        var340 = var340.substring(class135.field2319.length());
                                    } else if (var343.startsWith(class135.field2321)) {
                                        var344 = 5;
                                        var340 = var340.substring(class135.field2321.length());
                                    }
                                }
                                client.field519.method2273(75);
                                client.field519.method2590(0);
                                int var345 = client.field519.field2051;
                                client.field519.method2590(var342);
                                client.field519.method2590(var344);
                                class184.method1341(client.field519, var340);
                                client.field519.method2547(client.field519.field2051 - var345);
                            }
                            continue;
                        }
                        if (var358 == 5009) {
                            var6 -= 2;
                            String var346 = field410[var6];
                            String var347 = field410[var6 + 1];
                            client.field519.method2273(211);
                            client.field519.method2576(0);
                            int var348 = client.field519.field2051;
                            client.field519.method2520(var346);
                            class184.method1341(client.field519, var347);
                            client.field519.method2392(client.field519.field2051 - var348);
                            continue;
                        }
                        if (var358 == 5010) {
                            var5--;
                            int var349 = field407[var5];
                            String var350 = null;
                            if (var349 < 100) {
                                var350 = client.field689[var349];
                            }
                            if (var350 == null) {
                                var350 = "";
                            }
                            field410[var6++] = var350;
                            continue;
                        }
                        if (var358 == 5011) {
                            var5--;
                            int var351 = field407[var5];
                            String var352 = null;
                            if (var351 < 100) {
                                var352 = client.field665[var351];
                            }
                            if (var352 == null) {
                                var352 = "";
                            }
                            field410[var6++] = var352;
                            continue;
                        }
                        if (var358 == 5015) {
                            String var353;
                            if (Statics.field368 == null || Statics.field368.field52 == null) {
                                var353 = "";
                            } else {
                                var353 = Statics.field368.field52;
                            }
                            field410[var6++] = var353;
                            continue;
                        }
                        if (var358 == 5016) {
                            field407[var5++] = client.field695;
                            continue;
                        }
                        if (var358 == 5017) {
                            field407[var5++] = client.field692;
                            continue;
                        }
                    }
                } else {
                    class159 var64;
                    if (var358 >= 2000) {
                        var358 -= 1000;
                        var5--;
                        var64 = class159.method2333(field407[var5]);
                    } else {
                        var64 = var41 ? Statics.field312 : Statics.field1296;
                    }
                    if (var358 == 1300) {
                        var5--;
                        int var65 = field407[var5] - 1;
                        if (var65 >= 0 && var65 <= 9) {
                            var6--;
                            var64.method3097(var65, field410[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var358 == 1301) {
                        var5 -= 2;
                        int var66 = field407[var5];
                        int var67 = field407[var5 + 1];
                        var64.field2680 = class159.method2673(var66, var67);
                        continue;
                    }
                    if (var358 == 1302) {
                        var5--;
                        var64.field2683 = field407[var5] == 1;
                        continue;
                    }
                    if (var358 == 1303) {
                        var5--;
                        var64.field2681 = field407[var5];
                        continue;
                    }
                    if (var358 == 1304) {
                        var5--;
                        var64.field2649 = field407[var5];
                        continue;
                    }
                    if (var358 == 1305) {
                        var6--;
                        var64.field2678 = field410[var6];
                        continue;
                    }
                    if (var358 == 1306) {
                        var6--;
                        var64.field2684 = field410[var6];
                        continue;
                    }
                    if (var358 == 1307) {
                        var64.field2679 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var357) {
            StringBuilder var355 = new StringBuilder(30);
            var355.append("").append(var4.field2826).append(" ");
            for (int var356 = field401 - 1; var356 >= 0; var356--) {
                var355.append("").append(field406[var356].field290.field2826).append(" ");
            }
            var355.append("").append(var10);
            class80.method173(var355.toString(), var357);
        }
    }

    @ObfuscatedName("ae.j(II)V")
    public static void method556(int arg0) {
        if (arg0 == -1 || !class159.method880(arg0)) {
            return;
        }
        class159[] var1 = Statics.field2830[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3.field2686 != null) {
                class1 var4 = new class1();
                var4.field1 = var3;
                var4.field15 = var3.field2686;
                method111(var4, 2000000);
            }
        }
    }
}
