package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ac")
public class class34 {

    @ObfuscatedName("ac.n")
    public static int[] field728 = new int[5];

    @ObfuscatedName("ac.t")
    public static int[][] field729 = new int[5][5000];

    @ObfuscatedName("ac.l")
    public static int[] field730 = new int[1000];

    @ObfuscatedName("ac.m")
    public static String[] field731 = new String[1000];

    @ObfuscatedName("ac.o")
    public static int field732 = 0;

    @ObfuscatedName("ac.k")
    public static class14[] field733 = new class14[50];

    @ObfuscatedName("ac.g")
    public static Calendar field736 = Calendar.getInstance();

    @ObfuscatedName("ac.a")
    public static final String[] field725 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("er.q(Lq;B)V")
    public static void method2699(class1 arg0) {
        method2909(arg0, 200000);
    }

    @ObfuscatedName("fg.s(Lq;II)V")
    public static void method2909(class1 arg0, int arg1) {
        Object[] var2 = arg0.field8;
        int var3 = (Integer) var2[0];
        class21 var4 = class21.method1869(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field550;
        int[] var9 = var4.field553;
        byte var10 = -1;
        field732 = 0;
        try {
            Statics.field726 = new int[var4.field556];
            int var11 = 0;
            Statics.field735 = new String[var4.field554];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field2;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2697;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2612;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2697;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2612;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field726[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field735[var12++] = var15;
                }
            }
            int var16 = 0;
            label2778: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var439 = var8[var7];
                if (var439 < 100) {
                    if (var439 == 0) {
                        field730[var5++] = var9[var7];
                        continue;
                    }
                    if (var439 == 1) {
                        int var17 = var9[var7];
                        field730[var5++] = class166.field2742[var17];
                        continue;
                    }
                    if (var439 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class166.field2742[var18] = field730[var5];
                        client.method519(var18);
                        continue;
                    }
                    if (var439 == 3) {
                        field731[var6++] = var4.field552[var7];
                        continue;
                    }
                    if (var439 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var439 == 7) {
                        var5 -= 2;
                        if (field730[var5 + 1] != field730[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var439 == 8) {
                        var5 -= 2;
                        if (field730[var5 + 1] == field730[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var439 == 9) {
                        var5 -= 2;
                        if (field730[var5] < field730[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var439 == 10) {
                        var5 -= 2;
                        if (field730[var5] > field730[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var439 == 21) {
                        if (field732 == 0) {
                            return;
                        }
                        class14 var19 = field733[--field732];
                        var4 = var19.field201;
                        var8 = var4.field550;
                        var9 = var4.field553;
                        var7 = var19.field198;
                        Statics.field726 = var19.field197;
                        Statics.field735 = var19.field207;
                        continue;
                    }
                    if (var439 == 25) {
                        int var20 = var9[var7];
                        field730[var5++] = class166.method531(var20);
                        continue;
                    }
                    if (var439 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class166.method171(var21, field730[var5]);
                        continue;
                    }
                    if (var439 == 31) {
                        var5 -= 2;
                        if (field730[var5] <= field730[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var439 == 32) {
                        var5 -= 2;
                        if (field730[var5] >= field730[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var439 == 33) {
                        field730[var5++] = Statics.field726[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var439 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field726[var10001] = field730[var5];
                        continue;
                    }
                    if (var439 == 35) {
                        field731[var6++] = Statics.field735[var9[var7]];
                        continue;
                    }
                    if (var439 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field735[var10001] = field731[var6];
                        continue;
                    }
                    if (var439 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class154.method2089(field731, var6, var22);
                        field731[var6++] = var23;
                        continue;
                    }
                    if (var439 == 38) {
                        var5--;
                        continue;
                    }
                    if (var439 == 39) {
                        var6--;
                        continue;
                    }
                    if (var439 == 40) {
                        int var24 = var9[var7];
                        class21 var25 = class21.method1869(var24);
                        int[] var26 = new int[var25.field556];
                        String[] var27 = new String[var25.field554];
                        for (int var28 = 0; var28 < var25.field555; var28++) {
                            var26[var28] = field730[var5 - var25.field555 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field559; var29++) {
                            var27[var29] = field731[var6 - var25.field559 + var29];
                        }
                        var5 -= var25.field555;
                        var6 -= var25.field559;
                        class14 var30 = new class14();
                        var30.field201 = var4;
                        var30.field198 = var7;
                        var30.field197 = Statics.field726;
                        var30.field207 = Statics.field735;
                        field733[++field732 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field550;
                        var9 = var25.field553;
                        var7 = -1;
                        Statics.field726 = var26;
                        Statics.field735 = var27;
                        continue;
                    }
                    if (var439 == 42) {
                        field730[var5++] = client.field465[var9[var7]];
                        continue;
                    }
                    if (var439 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field465[var10001] = field730[var5];
                        continue;
                    }
                    if (var439 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field730[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field728[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2778;
                                }
                                field729[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var439 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field730[var5];
                        if (var37 >= 0 && var37 < field728[var36]) {
                            field730[var5++] = field729[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var439 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field730[var5];
                        if (var39 >= 0 && var39 < field728[var38]) {
                            field729[var38][var39] = field730[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var439 == 47) {
                        String var40 = client.field466[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field731[var6++] = var40;
                        continue;
                    }
                    if (var439 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field466[var10001] = field731[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var439 < 1000) {
                    if (var439 == 100) {
                        var5 -= 3;
                        int var42 = field730[var5];
                        int var43 = field730[var5 + 1];
                        int var44 = field730[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class164 var45 = class164.method619(var42);
                        if (var45.field2722 == null) {
                            var45.field2722 = new class164[var44 + 1];
                        }
                        if (var45.field2722.length <= var44) {
                            class164[] var46 = new class164[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2722.length; var47++) {
                                var46[var47] = var45.field2722[var47];
                            }
                            var45.field2722 = var46;
                        }
                        if (var44 > 0 && var45.field2722[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class164 var48 = new class164();
                        var48.field2613 = var43;
                        var48.field2651 = var48.field2697 = var45.field2697;
                        var48.field2612 = var44;
                        var48.field2601 = true;
                        var45.field2722[var44] = var48;
                        if (var41) {
                            Statics.field242 = var48;
                        } else {
                            Statics.field734 = var48;
                        }
                        client.method93(var45);
                        continue;
                    }
                    if (var439 == 101) {
                        class164 var49 = var41 ? Statics.field242 : Statics.field734;
                        class164 var50 = class164.method619(var49.field2697);
                        var50.field2722[var49.field2612] = null;
                        client.method93(var50);
                        continue;
                    }
                    if (var439 == 102) {
                        var5--;
                        class164 var51 = class164.method619(field730[var5]);
                        var51.field2722 = null;
                        client.method93(var51);
                        continue;
                    }
                    if (var439 == 200) {
                        var5 -= 2;
                        int var52 = field730[var5];
                        int var53 = field730[var5 + 1];
                        class164 var54 = class164.method2701(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field730[var5++] = 1;
                            if (var41) {
                                Statics.field242 = var54;
                            } else {
                                Statics.field734 = var54;
                            }
                            continue;
                        }
                        field730[var5++] = 0;
                        continue;
                    }
                } else if (var439 >= 1000 && var439 < 1100 || var439 >= 2000 && var439 < 2100) {
                    class164 var55;
                    if (var439 >= 2000) {
                        var439 -= 1000;
                        var5--;
                        var55 = class164.method619(field730[var5]);
                    } else {
                        var55 = var41 ? Statics.field242 : Statics.field734;
                    }
                    if (var439 == 1000) {
                        var5 -= 2;
                        var55.field2616 = field730[var5];
                        var55.field2681 = field730[var5 + 1];
                        client.method93(var55);
                        continue;
                    }
                    if (var439 == 1001) {
                        var5 -= 2;
                        var55.field2620 = field730[var5];
                        var55.field2621 = field730[var5 + 1];
                        client.method93(var55);
                        continue;
                    }
                    if (var439 == 1003) {
                        var5--;
                        boolean var56 = field730[var5] == 1;
                        if (var55.field2623 != var56) {
                            var55.field2623 = var56;
                            client.method93(var55);
                        }
                        continue;
                    }
                } else if (!(var439 < 1100 || var439 >= 1200) || !(var439 < 2100 || var439 >= 2200)) {
                    class164 var57;
                    if (var439 >= 2000) {
                        var439 -= 1000;
                        var5--;
                        var57 = class164.method619(field730[var5]);
                    } else {
                        var57 = var41 ? Statics.field242 : Statics.field734;
                    }
                    if (var439 == 1100) {
                        var5 -= 2;
                        var57.field2687 = field730[var5];
                        if (var57.field2687 > var57.field2626 - var57.field2620) {
                            var57.field2687 = var57.field2626 - var57.field2620;
                        }
                        if (var57.field2687 < 0) {
                            var57.field2687 = 0;
                        }
                        var57.field2625 = field730[var5 + 1];
                        if (var57.field2625 > var57.field2627 - var57.field2621) {
                            var57.field2625 = var57.field2627 - var57.field2621;
                        }
                        if (var57.field2625 < 0) {
                            var57.field2625 = 0;
                        }
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1101) {
                        var5--;
                        var57.field2628 = field730[var5];
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1102) {
                        var5--;
                        var57.field2632 = field730[var5] == 1;
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1103) {
                        var5--;
                        var57.field2633 = field730[var5];
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1104) {
                        var5--;
                        var57.field2670 = field730[var5];
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1105) {
                        var5--;
                        var57.field2705 = field730[var5];
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1106) {
                        var5--;
                        var57.field2644 = field730[var5];
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1107) {
                        var5--;
                        var57.field2638 = field730[var5] == 1;
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1108) {
                        var57.field2647 = 1;
                        var5--;
                        var57.field2614 = field730[var5];
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1109) {
                        var5 -= 6;
                        var57.field2649 = field730[var5];
                        var57.field2650 = field730[var5 + 1];
                        var57.field2629 = field730[var5 + 2];
                        var57.field2660 = field730[var5 + 3];
                        var57.field2653 = field730[var5 + 4];
                        var57.field2683 = field730[var5 + 5];
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1110) {
                        var5--;
                        int var58 = field730[var5];
                        if (var57.field2634 != var58) {
                            var57.field2634 = var58;
                            var57.field2607 = 0;
                            var57.field2721 = 0;
                            client.method93(var57);
                        }
                        continue;
                    }
                    if (var439 == 1111) {
                        var5--;
                        var57.field2656 = field730[var5] == 1;
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1112) {
                        var6--;
                        String var59 = field731[var6];
                        if (!var59.equals(var57.field2622)) {
                            var57.field2622 = var59;
                            client.method93(var57);
                        }
                        continue;
                    }
                    if (var439 == 1113) {
                        var5--;
                        var57.field2655 = field730[var5];
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1114) {
                        var5 -= 3;
                        var57.field2643 = field730[var5];
                        var57.field2663 = field730[var5 + 1];
                        var57.field2674 = field730[var5 + 2];
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1115) {
                        var5--;
                        var57.field2700 = field730[var5] == 1;
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1116) {
                        var5--;
                        var57.field2695 = field730[var5];
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1117) {
                        var5--;
                        var57.field2640 = field730[var5];
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1118) {
                        var5--;
                        var57.field2641 = field730[var5] == 1;
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1119) {
                        var5--;
                        var57.field2642 = field730[var5] == 1;
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1120) {
                        var5 -= 2;
                        var57.field2626 = field730[var5];
                        var57.field2627 = field730[var5 + 1];
                        client.method93(var57);
                        continue;
                    }
                    if (var439 == 1121) {
                        client.method3446(var57.field2697, var57.field2612);
                        client.field349 = var57;
                        client.method93(var57);
                        continue;
                    }
                } else if (var439 >= 1200 && var439 < 1300 || var439 >= 2200 && var439 < 2300) {
                    class164 var60;
                    if (var439 >= 2000) {
                        var439 -= 1000;
                        var5--;
                        var60 = class164.method619(field730[var5]);
                    } else {
                        var60 = var41 ? Statics.field242 : Statics.field734;
                    }
                    client.method93(var60);
                    if (var439 == 1200 || var439 == 1205 || var439 == 1212) {
                        var5 -= 2;
                        int var61 = field730[var5];
                        int var62 = field730[var5 + 1];
                        var60.field2718 = var61;
                        var60.field2719 = var62;
                        class47 var63 = class47.method832(var61);
                        var60.field2629 = var63.field1027;
                        var60.field2660 = var63.field1028;
                        var60.field2653 = var63.field1049;
                        var60.field2649 = var63.field1037;
                        var60.field2650 = var63.field1058;
                        var60.field2683 = var63.field1054;
                        if (var439 == 1205) {
                            var60.field2657 = 0;
                        } else if (var439 == 1212 | var63.field1032 == 1) {
                            var60.field2657 = 1;
                        } else {
                            var60.field2657 = 2;
                        }
                        if (var60.field2620 > 0) {
                            var60.field2683 = var60.field2683 * 32 / var60.field2620;
                        }
                        continue;
                    }
                    if (var439 == 1201) {
                        var60.field2647 = 2;
                        var5--;
                        var60.field2614 = field730[var5];
                        continue;
                    }
                    if (var439 == 1202) {
                        var60.field2647 = 3;
                        var60.field2614 = Statics.field393.field29.method3029();
                        continue;
                    }
                } else if ((var439 < 1300 || var439 >= 1400) && (var439 < 2300 || var439 >= 2400)) {
                    if (var439 >= 1400 && var439 < 1500 || var439 >= 2400 && var439 < 2500) {
                        class164 var68;
                        if (var439 >= 2000) {
                            var439 -= 1000;
                            var5--;
                            var68 = class164.method619(field730[var5]);
                        } else {
                            var68 = var41 ? Statics.field242 : Statics.field734;
                        }
                        var6--;
                        String var69 = field731[var6];
                        int[] var70 = null;
                        if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                            var5--;
                            int var71 = field730[var5];
                            if (var71 > 0) {
                                var70 = new int[var71];
                                while (var71-- > 0) {
                                    var5--;
                                    var70[var71] = field730[var5];
                                }
                            }
                            var69 = var69.substring(0, var69.length() - 1);
                        }
                        Object[] var72 = new Object[var69.length() + 1];
                        for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                            if (var69.charAt(var73 - 1) == 's') {
                                var6--;
                                var72[var73] = field731[var6];
                            } else {
                                var5--;
                                var72[var73] = Integer.valueOf(field730[var5]);
                            }
                        }
                        var5--;
                        int var74 = field730[var5];
                        if (var74 == -1) {
                            var72 = null;
                        } else {
                            var72[0] = Integer.valueOf(var74);
                        }
                        if (var439 == 1400) {
                            var68.field2692 = var72;
                        }
                        if (var439 == 1401) {
                            var68.field2684 = var72;
                        }
                        if (var439 == 1402) {
                            var68.field2637 = var72;
                        }
                        if (var439 == 1403) {
                            var68.field2685 = var72;
                        }
                        if (var439 == 1404) {
                            var68.field2720 = var72;
                        }
                        if (var439 == 1405) {
                            var68.field2688 = var72;
                        }
                        if (var439 == 1406) {
                            var68.field2691 = var72;
                        }
                        if (var439 == 1407) {
                            var68.field2689 = var72;
                            var68.field2693 = var70;
                        }
                        if (var439 == 1408) {
                            var68.field2698 = var72;
                        }
                        if (var439 == 1409) {
                            var68.field2699 = var72;
                        }
                        if (var439 == 1410) {
                            var68.field2639 = var72;
                        }
                        if (var439 == 1411) {
                            var68.field2605 = var72;
                        }
                        if (var439 == 1412) {
                            var68.field2659 = var72;
                        }
                        if (var439 == 1414) {
                            var68.field2652 = var72;
                            var68.field2648 = var70;
                        }
                        if (var439 == 1415) {
                            var68.field2696 = var72;
                            var68.field2654 = var70;
                        }
                        if (var439 == 1416) {
                            var68.field2690 = var72;
                        }
                        if (var439 == 1417) {
                            var68.field2635 = var72;
                        }
                        if (var439 == 1418) {
                            var68.field2701 = var72;
                        }
                        if (var439 == 1419) {
                            var68.field2664 = var72;
                        }
                        if (var439 == 1420) {
                            var68.field2703 = var72;
                        }
                        if (var439 == 1421) {
                            var68.field2704 = var72;
                        }
                        if (var439 == 1422) {
                            var68.field2665 = var72;
                        }
                        if (var439 == 1423) {
                            var68.field2706 = var72;
                        }
                        if (var439 == 1424) {
                            var68.field2707 = var72;
                        }
                        if (var439 == 1425) {
                            var68.field2671 = var72;
                        }
                        if (var439 == 1426) {
                            var68.field2709 = var72;
                        }
                        var68.field2679 = true;
                        continue;
                    }
                    if (var439 < 1600) {
                        class164 var75 = var41 ? Statics.field242 : Statics.field734;
                        if (var439 == 1500) {
                            field730[var5++] = var75.field2616;
                            continue;
                        }
                        if (var439 == 1501) {
                            field730[var5++] = var75.field2681;
                            continue;
                        }
                        if (var439 == 1502) {
                            field730[var5++] = var75.field2620;
                            continue;
                        }
                        if (var439 == 1503) {
                            field730[var5++] = var75.field2621;
                            continue;
                        }
                        if (var439 == 1504) {
                            field730[var5++] = var75.field2623 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 1505) {
                            field730[var5++] = var75.field2651;
                            continue;
                        }
                    } else if (var439 < 1700) {
                        class164 var76 = var41 ? Statics.field242 : Statics.field734;
                        if (var439 == 1600) {
                            field730[var5++] = var76.field2687;
                            continue;
                        }
                        if (var439 == 1601) {
                            field730[var5++] = var76.field2625;
                            continue;
                        }
                        if (var439 == 1602) {
                            field731[var6++] = var76.field2622;
                            continue;
                        }
                        if (var439 == 1603) {
                            field730[var5++] = var76.field2626;
                            continue;
                        }
                        if (var439 == 1604) {
                            field730[var5++] = var76.field2627;
                            continue;
                        }
                        if (var439 == 1605) {
                            field730[var5++] = var76.field2683;
                            continue;
                        }
                        if (var439 == 1606) {
                            field730[var5++] = var76.field2629;
                            continue;
                        }
                        if (var439 == 1607) {
                            field730[var5++] = var76.field2653;
                            continue;
                        }
                        if (var439 == 1608) {
                            field730[var5++] = var76.field2660;
                            continue;
                        }
                        if (var439 == 1609) {
                            field730[var5++] = var76.field2633;
                            continue;
                        }
                    } else if (var439 < 1800) {
                        class164 var77 = var41 ? Statics.field242 : Statics.field734;
                        if (var439 == 1700) {
                            field730[var5++] = var77.field2718;
                            continue;
                        }
                        if (var439 == 1701) {
                            if (var77.field2718 == -1) {
                                field730[var5++] = 0;
                            } else {
                                field730[var5++] = var77.field2719;
                            }
                            continue;
                        }
                        if (var439 == 1702) {
                            field730[var5++] = var77.field2612;
                            continue;
                        }
                    } else if (var439 < 1900) {
                        class164 var78 = var41 ? Statics.field242 : Statics.field734;
                        if (var439 == 1800) {
                            field730[var5++] = class168.method146(client.method1613(var78));
                            continue;
                        }
                        if (var439 == 1801) {
                            var5--;
                            int var79 = field730[var5];
                            int var440 = var79 - 1;
                            if (var78.field2673 != null && var440 < var78.field2673.length && var78.field2673[var440] != null) {
                                field731[var6++] = var78.field2673[var440];
                                continue;
                            }
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 1802) {
                            if (var78.field2672 == null) {
                                field731[var6++] = "";
                            } else {
                                field731[var6++] = var78.field2672;
                            }
                            continue;
                        }
                    } else if (var439 < 2600) {
                        var5--;
                        class164 var80 = class164.method619(field730[var5]);
                        if (var439 == 2500) {
                            field730[var5++] = var80.field2616;
                            continue;
                        }
                        if (var439 == 2501) {
                            field730[var5++] = var80.field2681;
                            continue;
                        }
                        if (var439 == 2502) {
                            field730[var5++] = var80.field2620;
                            continue;
                        }
                        if (var439 == 2503) {
                            field730[var5++] = var80.field2621;
                            continue;
                        }
                        if (var439 == 2504) {
                            field730[var5++] = var80.field2623 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 2505) {
                            field730[var5++] = var80.field2651;
                            continue;
                        }
                    } else if (var439 < 2700) {
                        var5--;
                        class164 var81 = class164.method619(field730[var5]);
                        if (var439 == 2600) {
                            field730[var5++] = var81.field2687;
                            continue;
                        }
                        if (var439 == 2601) {
                            field730[var5++] = var81.field2625;
                            continue;
                        }
                        if (var439 == 2602) {
                            field731[var6++] = var81.field2622;
                            continue;
                        }
                        if (var439 == 2603) {
                            field730[var5++] = var81.field2626;
                            continue;
                        }
                        if (var439 == 2604) {
                            field730[var5++] = var81.field2627;
                            continue;
                        }
                        if (var439 == 2605) {
                            field730[var5++] = var81.field2683;
                            continue;
                        }
                        if (var439 == 2606) {
                            field730[var5++] = var81.field2629;
                            continue;
                        }
                        if (var439 == 2607) {
                            field730[var5++] = var81.field2653;
                            continue;
                        }
                        if (var439 == 2608) {
                            field730[var5++] = var81.field2660;
                            continue;
                        }
                        if (var439 == 2609) {
                            field730[var5++] = var81.field2633;
                            continue;
                        }
                    } else if (var439 < 2800) {
                        if (var439 == 2700) {
                            var5--;
                            class164 var82 = class164.method619(field730[var5]);
                            field730[var5++] = var82.field2718;
                            continue;
                        }
                        if (var439 == 2701) {
                            var5--;
                            class164 var83 = class164.method619(field730[var5]);
                            if (var83.field2718 == -1) {
                                field730[var5++] = 0;
                            } else {
                                field730[var5++] = var83.field2719;
                            }
                            continue;
                        }
                        if (var439 == 2702) {
                            var5--;
                            int var84 = field730[var5];
                            class4 var85 = (class4) client.field514.method3273((long) var84);
                            if (var85 == null) {
                                field730[var5++] = 0;
                            } else {
                                field730[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var439 < 2900) {
                        var5--;
                        class164 var86 = class164.method619(field730[var5]);
                        if (var439 == 2800) {
                            field730[var5++] = class168.method146(client.method1613(var86));
                            continue;
                        }
                        if (var439 == 2801) {
                            var5--;
                            int var87 = field730[var5];
                            int var441 = var87 - 1;
                            if (var86.field2673 != null && var441 < var86.field2673.length && var86.field2673[var441] != null) {
                                field731[var6++] = var86.field2673[var441];
                                continue;
                            }
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 2802) {
                            if (var86.field2672 == null) {
                                field731[var6++] = "";
                            } else {
                                field731[var6++] = var86.field2672;
                            }
                            continue;
                        }
                    } else if (var439 < 3200) {
                        if (var439 == 3100) {
                            var6--;
                            String var88 = field731[var6];
                            class11.method3012(0, "", var88);
                            continue;
                        }
                        if (var439 == 3101) {
                            var5 -= 2;
                            client.method1614(Statics.field393, field730[var5], field730[var5 + 1]);
                            continue;
                        }
                        if (var439 == 3103) {
                            client.method2069();
                            continue;
                        }
                        if (var439 == 3104) {
                            var6--;
                            String var89 = field731[var6];
                            int var90 = 0;
                            if (class154.method2094(var89)) {
                                var90 = class154.method131(var89);
                            }
                            client.field521.method2396(59);
                            client.field521.method2136(var90);
                            continue;
                        }
                        if (var439 == 3105) {
                            var6--;
                            String var91 = field731[var6];
                            client.field521.method2396(231);
                            client.field521.method2133(var91.length() + 1);
                            client.field521.method2139(var91);
                            continue;
                        }
                        if (var439 == 3106) {
                            var6--;
                            String var92 = field731[var6];
                            client.field521.method2396(133);
                            client.field521.method2133(var92.length() + 1);
                            client.field521.method2139(var92);
                            continue;
                        }
                        if (var439 == 3107) {
                            var5--;
                            int var93 = field730[var5];
                            var6--;
                            String var94 = field731[var6];
                            client.method481(var93, var94);
                            continue;
                        }
                        if (var439 == 3108) {
                            var5 -= 3;
                            int var95 = field730[var5];
                            int var96 = field730[var5 + 1];
                            int var97 = field730[var5 + 2];
                            class164 var98 = class164.method619(var97);
                            client.method495(var98, var95, var96);
                            continue;
                        }
                        if (var439 == 3109) {
                            var5 -= 2;
                            int var99 = field730[var5];
                            int var100 = field730[var5 + 1];
                            class164 var101 = var41 ? Statics.field242 : Statics.field734;
                            client.method495(var101, var99, var100);
                            continue;
                        }
                        if (var439 == 3110) {
                            var5--;
                            Statics.field2976 = field730[var5] == 1;
                            continue;
                        }
                        if (var439 == 3111) {
                            field730[var5++] = Statics.field93.field140 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3112) {
                            var5--;
                            Statics.field93.field140 = field730[var5] == 1;
                            class9.method91();
                            continue;
                        }
                        if (var439 == 3113) {
                            var6--;
                            String var102 = field731[var6];
                            var5--;
                            boolean var103 = field730[var5] == 1;
                            if (!var103) {
                                class130.method1784(var102, 3);
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var102));
                                    continue;
                                } catch (Exception var437) {
                                }
                            }
                            if (class130.field1992.startsWith("win")) {
                                class130.method1784(var102, 0);
                            } else if (class130.field1992.startsWith("mac")) {
                                Statics.method819(var102, 1, "openjs");
                            } else {
                                class130.method1784(var102, 2);
                            }
                            continue;
                        }
                        if (var439 == 3115) {
                            var5--;
                            int var105 = field730[var5];
                            client.field521.method2396(137);
                            client.field521.method2134(var105);
                            continue;
                        }
                    } else if (var439 < 3300) {
                        if (var439 == 3200) {
                            var5 -= 3;
                            client.method2709(field730[var5], field730[var5 + 1], field730[var5 + 2]);
                            continue;
                        }
                        if (var439 == 3201) {
                            var5--;
                            int var106 = field730[var5];
                            if (var106 == -1 && !client.field504) {
                                Statics.field2795.method3131();
                                class173.field2796 = 1;
                                Statics.field2565 = null;
                            } else if (var106 != -1 && client.field503 != var106 && client.field502 != 0 && !client.field504) {
                                class173.method1980(2, Statics.field549, var106, 0, client.field502, false);
                            }
                            client.field503 = var106;
                            continue;
                        }
                        if (var439 == 3202) {
                            var5 -= 2;
                            int var107 = field730[var5];
                            int var10000 = field730[var5 + 1];
                            if (client.field502 != 0 && var107 != -1) {
                                class173.method35(Statics.field2558, var107, 0, client.field502, false);
                                client.field504 = true;
                            }
                            continue;
                        }
                    } else if (var439 < 3400) {
                        if (var439 == 3300) {
                            field730[var5++] = client.field275;
                            continue;
                        }
                        if (var439 == 3301) {
                            var5 -= 2;
                            int var109 = field730[var5];
                            int var110 = field730[var5 + 1];
                            int[] var111 = field730;
                            int var112 = var5++;
                            class15 var113 = (class15) class15.field213.method3273((long) var109);
                            int var114;
                            if (var113 == null) {
                                var114 = -1;
                            } else if (var110 >= 0 && var110 < var113.field214.length) {
                                var114 = var113.field214[var110];
                            } else {
                                var114 = -1;
                            }
                            var111[var112] = var114;
                            continue;
                        }
                        if (var439 == 3302) {
                            var5 -= 2;
                            int var115 = field730[var5];
                            int var116 = field730[var5 + 1];
                            field730[var5++] = Statics.method542(var115, var116);
                            continue;
                        }
                        if (var439 == 3303) {
                            var5 -= 2;
                            int var117 = field730[var5];
                            int var118 = field730[var5 + 1];
                            int[] var119 = field730;
                            int var120 = var5++;
                            class15 var121 = (class15) class15.field213.method3273((long) var117);
                            int var122;
                            if (var121 == null) {
                                var122 = 0;
                            } else if (var118 == -1) {
                                var122 = 0;
                            } else {
                                int var123 = 0;
                                for (int var124 = 0; var124 < var121.field210.length; var124++) {
                                    if (var121.field214[var124] == var118) {
                                        var123 += var121.field210[var124];
                                    }
                                }
                                var122 = var123;
                            }
                            var119[var120] = var122;
                            continue;
                        }
                        if (var439 == 3304) {
                            var5--;
                            int var125 = field730[var5];
                            int[] var126 = field730;
                            int var127 = var5++;
                            class46 var128 = (class46) class46.field1008.method3243((long) var125);
                            class46 var129;
                            if (var128 == null) {
                                byte[] var130 = Statics.field1010.method2811(5, var125);
                                class46 var131 = new class46();
                                if (var130 != null) {
                                    var131.method843(new class111(var130));
                                }
                                class46.field1008.method3253(var131, (long) var125);
                                var129 = var131;
                            } else {
                                var129 = var128;
                            }
                            var126[var127] = var129.field1009;
                            continue;
                        }
                        if (var439 == 3305) {
                            var5--;
                            int var132 = field730[var5];
                            field730[var5++] = client.field419[var132];
                            continue;
                        }
                        if (var439 == 3306) {
                            var5--;
                            int var133 = field730[var5];
                            field730[var5++] = client.field528[var133];
                            continue;
                        }
                        if (var439 == 3307) {
                            var5--;
                            int var134 = field730[var5];
                            field730[var5++] = client.field320[var134];
                            continue;
                        }
                        if (var439 == 3308) {
                            int var135 = Statics.field2988;
                            int var136 = (Statics.field393.field754 >> 7) + Statics.field1280;
                            int var137 = (Statics.field393.field787 >> 7) + Statics.field1910;
                            field730[var5++] = (var135 << 28) + (var136 << 14) + var137;
                            continue;
                        }
                        if (var439 == 3309) {
                            var5--;
                            int var138 = field730[var5];
                            field730[var5++] = var138 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var439 == 3310) {
                            var5--;
                            int var139 = field730[var5];
                            field730[var5++] = var139 >> 28;
                            continue;
                        }
                        if (var439 == 3311) {
                            var5--;
                            int var140 = field730[var5];
                            field730[var5++] = var140 & 0x3FFF;
                            continue;
                        }
                        if (var439 == 3312) {
                            field730[var5++] = client.field270 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3313) {
                            var5 -= 2;
                            int var141 = field730[var5] + 32768;
                            int var142 = field730[var5 + 1];
                            int[] var143 = field730;
                            int var144 = var5++;
                            class15 var145 = (class15) class15.field213.method3273((long) var141);
                            int var146;
                            if (var145 == null) {
                                var146 = -1;
                            } else if (var142 >= 0 && var142 < var145.field214.length) {
                                var146 = var145.field214[var142];
                            } else {
                                var146 = -1;
                            }
                            var143[var144] = var146;
                            continue;
                        }
                        if (var439 == 3314) {
                            var5 -= 2;
                            int var147 = field730[var5] + 32768;
                            int var148 = field730[var5 + 1];
                            field730[var5++] = Statics.method542(var147, var148);
                            continue;
                        }
                        if (var439 == 3315) {
                            var5 -= 2;
                            int var149 = field730[var5] + 32768;
                            int var150 = field730[var5 + 1];
                            int[] var151 = field730;
                            int var152 = var5++;
                            class15 var153 = (class15) class15.field213.method3273((long) var149);
                            int var154;
                            if (var153 == null) {
                                var154 = 0;
                            } else if (var150 == -1) {
                                var154 = 0;
                            } else {
                                int var155 = 0;
                                for (int var156 = 0; var156 < var153.field210.length; var156++) {
                                    if (var153.field214[var156] == var150) {
                                        var155 += var153.field210[var156];
                                    }
                                }
                                var154 = var155;
                            }
                            var151[var152] = var154;
                            continue;
                        }
                        if (var439 == 3316) {
                            if (client.field435 >= 2) {
                                field730[var5++] = client.field435;
                            } else {
                                field730[var5++] = 0;
                            }
                            continue;
                        }
                        if (var439 == 3317) {
                            field730[var5++] = client.field488;
                            continue;
                        }
                        if (var439 == 3318) {
                            field730[var5++] = client.field493;
                            continue;
                        }
                        if (var439 == 3321) {
                            field730[var5++] = client.field433;
                            continue;
                        }
                        if (var439 == 3322) {
                            field730[var5++] = client.field434;
                            continue;
                        }
                        if (var439 == 3323) {
                            if (client.field437) {
                                field730[var5++] = 1;
                            } else {
                                field730[var5++] = 0;
                            }
                            continue;
                        }
                        if (var439 == 3324) {
                            field730[var5++] = client.field267;
                            continue;
                        }
                    } else if (var439 < 3500) {
                        if (var439 == 3400) {
                            var5 -= 2;
                            int var157 = field730[var5];
                            int var158 = field730[var5 + 1];
                            class45 var159 = (class45) class45.field997.method3243((long) var157);
                            class45 var160;
                            if (var159 == null) {
                                byte[] var161 = Statics.field995.method2811(8, var157);
                                class45 var162 = new class45();
                                if (var161 != null) {
                                    var162.method839(new class111(var161));
                                }
                                class45.field997.method3253(var162, (long) var157);
                                var160 = var162;
                            } else {
                                var160 = var159;
                            }
                            class45 var163 = var160;
                            if (var160.field1006 != 's') {
                            }
                            for (int var164 = 0; var164 < var163.field1004; var164++) {
                                if (var163.field993[var164] == var158) {
                                    field731[var6++] = var163.field1001[var164];
                                    var163 = null;
                                    break;
                                }
                            }
                            if (var163 != null) {
                                field731[var6++] = var163.field996;
                            }
                            continue;
                        }
                        if (var439 == 3408) {
                            var5 -= 4;
                            int var165 = field730[var5];
                            int var166 = field730[var5 + 1];
                            int var167 = field730[var5 + 2];
                            int var168 = field730[var5 + 3];
                            class45 var169 = (class45) class45.field997.method3243((long) var167);
                            class45 var170;
                            if (var169 == null) {
                                byte[] var171 = Statics.field995.method2811(8, var167);
                                class45 var172 = new class45();
                                if (var171 != null) {
                                    var172.method839(new class111(var171));
                                }
                                class45.field997.method3253(var172, (long) var167);
                                var170 = var172;
                            } else {
                                var170 = var169;
                            }
                            class45 var173 = var170;
                            if (var170.field994 == var165 && var170.field1006 == var166) {
                                for (int var174 = 0; var174 < var173.field1004; var174++) {
                                    if (var173.field993[var174] == var168) {
                                        if (var166 == 115) {
                                            field731[var6++] = var173.field1001[var174];
                                        } else {
                                            field730[var5++] = var173.field1000[var174];
                                        }
                                        var173 = null;
                                        break;
                                    }
                                }
                                if (var173 != null) {
                                    if (var166 == 115) {
                                        field731[var6++] = var173.field996;
                                    } else {
                                        field730[var5++] = var173.field1002;
                                    }
                                }
                                continue;
                            }
                            if (var166 == 115) {
                                field731[var6++] = "null";
                            } else {
                                field730[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var439 < 3700) {
                        if (var439 == 3600) {
                            if (client.field384 == 0) {
                                field730[var5++] = -2;
                            } else if (client.field384 == 1) {
                                field730[var5++] = -1;
                            } else {
                                field730[var5++] = client.field471;
                            }
                            continue;
                        }
                        if (var439 == 3601) {
                            var5--;
                            int var175 = field730[var5];
                            if (client.field384 == 2 && var175 < client.field471) {
                                field731[var6++] = client.field522[var175].field238;
                                field731[var6++] = client.field522[var175].field235;
                                continue;
                            }
                            field731[var6++] = "";
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 3602) {
                            var5--;
                            int var176 = field730[var5];
                            if (client.field384 == 2 && var176 < client.field471) {
                                field730[var5++] = client.field522[var176].field245;
                                continue;
                            }
                            field730[var5++] = 0;
                            continue;
                        }
                        if (var439 == 3603) {
                            var5--;
                            int var177 = field730[var5];
                            if (client.field384 == 2 && var177 < client.field471) {
                                field730[var5++] = client.field522[var177].field237;
                                continue;
                            }
                            field730[var5++] = 0;
                            continue;
                        }
                        if (var439 == 3604) {
                            var6--;
                            String var178 = field731[var6];
                            var5--;
                            int var179 = field730[var5];
                            client.field521.method2396(119);
                            client.field521.method2133(class111.method2719(var178) + 1);
                            client.field521.method2139(var178);
                            client.field521.method2133(var179);
                            continue;
                        }
                        if (var439 == 3605) {
                            var6--;
                            String var180 = field731[var6];
                            if (var180 == null) {
                                continue;
                            }
                            if ((client.field471 < 200 || client.field370 == 1) && client.field471 < 400) {
                                String var181 = class155.method1(var180, Statics.field1866);
                                if (var181 == null) {
                                    continue;
                                }
                                for (int var182 = 0; var182 < client.field471; var182++) {
                                    class17 var183 = client.field522[var182];
                                    String var184 = class155.method1(var183.field238, Statics.field1866);
                                    if (var184 != null && var184.equals(var181)) {
                                        class11.method3012(30, "", var180 + class148.field2321);
                                        continue label2778;
                                    }
                                    if (var183.field235 != null) {
                                        String var185 = class155.method1(var183.field235, Statics.field1866);
                                        if (var185 != null && var185.equals(var181)) {
                                            class11.method3012(30, "", var180 + class148.field2321);
                                            continue label2778;
                                        }
                                    }
                                }
                                for (int var186 = 0; var186 < client.field524; var186++) {
                                    class8 var187 = client.field526[var186];
                                    String var188 = class155.method1(var187.field127, Statics.field1866);
                                    if (var188 != null && var188.equals(var181)) {
                                        class11.method3012(30, "", class148.field2326 + var180 + class148.field2327);
                                        continue label2778;
                                    }
                                    if (var187.field130 != null) {
                                        String var189 = class155.method1(var187.field130, Statics.field1866);
                                        if (var189 != null && var189.equals(var181)) {
                                            class11.method3012(30, "", class148.field2326 + var180 + class148.field2327);
                                            continue label2778;
                                        }
                                    }
                                }
                                if (class155.method1(Statics.field393.field37, Statics.field1866).equals(var181)) {
                                    class11.method3012(30, "", class148.field2324);
                                } else {
                                    client.field521.method2396(47);
                                    client.field521.method2133(class111.method2719(var180));
                                    client.field521.method2139(var180);
                                }
                                continue;
                            }
                            class11.method3012(30, "", class148.field2320);
                            continue;
                        }
                        if (var439 == 3606) {
                            var6--;
                            String var190 = field731[var6];
                            if (var190 == null) {
                                continue;
                            }
                            String var191 = class155.method1(var190, Statics.field1866);
                            if (var191 == null) {
                                continue;
                            }
                            int var192 = 0;
                            while (true) {
                                if (var192 >= client.field471) {
                                    continue label2778;
                                }
                                class17 var193 = client.field522[var192];
                                String var194 = var193.field238;
                                String var195 = class155.method1(var194, Statics.field1866);
                                boolean var196;
                                if (var190 == null || var194 == null) {
                                    var196 = false;
                                } else if (var190.startsWith("#") || var194.startsWith("#")) {
                                    var196 = var190.equals(var194);
                                } else {
                                    var196 = var191.equals(var195);
                                }
                                if (var196) {
                                    client.field471--;
                                    for (int var197 = var192; var197 < client.field471; var197++) {
                                        client.field522[var197] = client.field522[var197 + 1];
                                    }
                                    client.field264 = client.field452;
                                    client.field521.method2396(117);
                                    client.field521.method2133(class111.method2719(var190));
                                    client.field521.method2139(var190);
                                    continue label2778;
                                }
                                var192++;
                            }
                        }
                        if (var439 == 3607) {
                            var6--;
                            String var198 = field731[var6];
                            if (var198 == null) {
                                continue;
                            }
                            if ((client.field524 < 100 || client.field370 == 1) && client.field524 < 400) {
                                String var199 = class155.method1(var198, Statics.field1866);
                                if (var199 == null) {
                                    continue;
                                }
                                for (int var200 = 0; var200 < client.field524; var200++) {
                                    class8 var201 = client.field526[var200];
                                    String var202 = class155.method1(var201.field127, Statics.field1866);
                                    if (var202 != null && var202.equals(var199)) {
                                        class11.method3012(31, "", var198 + class148.field2323);
                                        continue label2778;
                                    }
                                    if (var201.field130 != null) {
                                        String var203 = class155.method1(var201.field130, Statics.field1866);
                                        if (var203 != null && var203.equals(var199)) {
                                            class11.method3012(31, "", var198 + class148.field2323);
                                            continue label2778;
                                        }
                                    }
                                }
                                for (int var204 = 0; var204 < client.field471; var204++) {
                                    class17 var205 = client.field522[var204];
                                    String var206 = class155.method1(var205.field238, Statics.field1866);
                                    if (var206 != null && var206.equals(var199)) {
                                        class11.method3012(31, "", class148.field2328 + var198 + class148.field2329);
                                        continue label2778;
                                    }
                                    if (var205.field235 != null) {
                                        String var207 = class155.method1(var205.field235, Statics.field1866);
                                        if (var207 != null && var207.equals(var199)) {
                                            class11.method3012(31, "", class148.field2328 + var198 + class148.field2329);
                                            continue label2778;
                                        }
                                    }
                                }
                                if (class155.method1(Statics.field393.field37, Statics.field1866).equals(var199)) {
                                    class11.method3012(31, "", class148.field2325);
                                } else {
                                    client.field521.method2396(230);
                                    client.field521.method2133(class111.method2719(var198));
                                    client.field521.method2139(var198);
                                }
                                continue;
                            }
                            class11.method3012(31, "", class148.field2322);
                            continue;
                        }
                        if (var439 == 3608) {
                            var6--;
                            String var208 = field731[var6];
                            client.method1064(var208);
                            continue;
                        }
                        if (var439 == 3609) {
                            var6--;
                            String var209 = field731[var6];
                            class143[] var210 = new class143[] { class143.field2104, class143.field2106, class143.field2103, class143.field2105, class143.field2112 };
                            class143[] var211 = var210;
                            for (int var212 = 0; var212 < var211.length; var212++) {
                                class143 var213 = var211[var212];
                                if (var213.field2109 != -1 && var209.startsWith(class2.method30(var213.field2109))) {
                                    var209 = var209.substring(6 + Integer.toString(var213.field2109).length());
                                    break;
                                }
                            }
                            field730[var5++] = client.method3579(var209, false) ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3611) {
                            if (client.field492 == null) {
                                field731[var6++] = "";
                                continue;
                            }
                            String[] var214 = field731;
                            int var215 = var6++;
                            String var216 = client.field492;
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
                            String var224 = class153.method1060(var217);
                            if (var224 == null) {
                                var224 = "";
                            }
                            var214[var215] = var224;
                            continue;
                        }
                        if (var439 == 3612) {
                            if (client.field492 == null) {
                                field730[var5++] = 0;
                            } else {
                                field730[var5++] = Statics.field1664;
                            }
                            continue;
                        }
                        if (var439 == 3613) {
                            var5--;
                            int var226 = field730[var5];
                            if (client.field492 != null && var226 < Statics.field1664) {
                                field731[var6++] = Statics.field89[var226].field586;
                                continue;
                            }
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 3614) {
                            var5--;
                            int var227 = field730[var5];
                            if (client.field492 != null && var227 < Statics.field1664) {
                                field730[var5++] = Statics.field89[var227].field585;
                                continue;
                            }
                            field730[var5++] = 0;
                            continue;
                        }
                        if (var439 == 3615) {
                            var5--;
                            int var228 = field730[var5];
                            if (client.field492 != null && var228 < Statics.field1664) {
                                field730[var5++] = Statics.field89[var228].field590;
                                continue;
                            }
                            field730[var5++] = 0;
                            continue;
                        }
                        if (var439 == 3616) {
                            field730[var5++] = Statics.field2144;
                            continue;
                        }
                        if (var439 == 3617) {
                            var6--;
                            String var229 = field731[var6];
                            if (Statics.field89 != null) {
                                client.field521.method2396(159);
                                client.field521.method2133(class111.method2719(var229));
                                client.field521.method2139(var229);
                            }
                            continue;
                        }
                        if (var439 == 3618) {
                            field730[var5++] = Statics.field2119;
                            continue;
                        }
                        if (var439 == 3619) {
                            var6--;
                            String var230 = field731[var6];
                            if (!var230.equals("")) {
                                client.field521.method2396(99);
                                client.field521.method2133(class111.method2719(var230));
                                client.field521.method2139(var230);
                            }
                            continue;
                        }
                        if (var439 == 3620) {
                            Statics.method1877();
                            continue;
                        }
                        if (var439 == 3621) {
                            if (client.field384 == 0) {
                                field730[var5++] = -1;
                            } else {
                                field730[var5++] = client.field524;
                            }
                            continue;
                        }
                        if (var439 == 3622) {
                            var5--;
                            int var231 = field730[var5];
                            if (client.field384 != 0 && var231 < client.field524) {
                                field731[var6++] = client.field526[var231].field127;
                                field731[var6++] = client.field526[var231].field130;
                                continue;
                            }
                            field731[var6++] = "";
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 3623) {
                            var6--;
                            String var232 = field731[var6];
                            if (var232.startsWith(class2.method30(0)) || var232.startsWith(class2.method30(1))) {
                                var232 = var232.substring(7);
                            }
                            field730[var5++] = client.method2373(var232) ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3624) {
                            var5--;
                            int var233 = field730[var5];
                            if (Statics.field89 != null && var233 < Statics.field1664 && Statics.field89[var233].field586.equalsIgnoreCase(Statics.field393.field37)) {
                                field730[var5++] = 1;
                                continue;
                            }
                            field730[var5++] = 0;
                            continue;
                        }
                        if (var439 == 3625) {
                            if (client.field506 == null) {
                                field731[var6++] = "";
                                continue;
                            }
                            String[] var234 = field731;
                            int var235 = var6++;
                            String var236 = client.field506;
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
                            String var244 = class153.method1060(var237);
                            if (var244 == null) {
                                var244 = "";
                            }
                            var234[var235] = var244;
                            continue;
                        }
                    } else if (var439 < 4000) {
                        if (var439 == 3903) {
                            var5--;
                            int var246 = field730[var5];
                            field730[var5++] = client.field494[var246].method3463();
                            continue;
                        }
                        if (var439 == 3904) {
                            var5--;
                            int var247 = field730[var5];
                            field730[var5++] = client.field494[var247].field3018;
                            continue;
                        }
                        if (var439 == 3905) {
                            var5--;
                            int var248 = field730[var5];
                            field730[var5++] = client.field494[var248].field3023;
                            continue;
                        }
                        if (var439 == 3906) {
                            var5--;
                            int var249 = field730[var5];
                            field730[var5++] = client.field494[var249].field3025;
                            continue;
                        }
                        if (var439 == 3907) {
                            var5--;
                            int var250 = field730[var5];
                            field730[var5++] = client.field494[var250].field3021;
                            continue;
                        }
                        if (var439 == 3908) {
                            var5--;
                            int var251 = field730[var5];
                            field730[var5++] = client.field494[var251].field3020;
                            continue;
                        }
                        if (var439 == 3910) {
                            var5--;
                            int var252 = field730[var5];
                            int var253 = client.field494[var252].method3474();
                            field730[var5++] = var253 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3911) {
                            var5--;
                            int var254 = field730[var5];
                            int var255 = client.field494[var254].method3474();
                            field730[var5++] = var255 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3912) {
                            var5--;
                            int var256 = field730[var5];
                            int var257 = client.field494[var256].method3474();
                            field730[var5++] = var257 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3913) {
                            var5--;
                            int var258 = field730[var5];
                            int var259 = client.field494[var258].method3474();
                            field730[var5++] = var259 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3914) {
                            var5--;
                            boolean var260 = field730[var5] == 1;
                            if (Statics.field951 != null) {
                                Statics.field951.method3484(class211.field3030, var260);
                            }
                            continue;
                        }
                        if (var439 == 3915) {
                            var5--;
                            boolean var261 = field730[var5] == 1;
                            if (Statics.field951 != null) {
                                Statics.field951.method3484(class211.field3029, var261);
                            }
                            continue;
                        }
                        if (var439 == 3916) {
                            var5 -= 2;
                            boolean var262 = field730[var5] == 1;
                            boolean var263 = field730[var5 + 1] == 1;
                            if (Statics.field951 != null) {
                                Statics.field951.method3484(new class20(var263), var262);
                            }
                            continue;
                        }
                        if (var439 == 3917) {
                            var5--;
                            boolean var264 = field730[var5] == 1;
                            if (Statics.field951 != null) {
                                Statics.field951.method3484(class211.field3028, var264);
                            }
                            continue;
                        }
                        if (var439 == 3918) {
                            var5--;
                            boolean var265 = field730[var5] == 1;
                            if (Statics.field951 != null) {
                                Statics.field951.method3484(class211.field3031, var265);
                            }
                            continue;
                        }
                        if (var439 == 3919) {
                            field730[var5++] = Statics.field951 == null ? 0 : Statics.field951.field3027.size();
                            continue;
                        }
                        if (var439 == 3920) {
                            var5--;
                            int var266 = field730[var5];
                            class204 var267 = (class204) Statics.field951.field3027.get(var266);
                            field730[var5++] = var267.field2993;
                            continue;
                        }
                        if (var439 == 3921) {
                            var5--;
                            int var268 = field730[var5];
                            class204 var269 = (class204) Statics.field951.field3027.get(var268);
                            field731[var6++] = var269.method3430();
                            continue;
                        }
                        if (var439 == 3922) {
                            var5--;
                            int var270 = field730[var5];
                            class204 var271 = (class204) Statics.field951.field3027.get(var270);
                            field731[var6++] = var271.method3429();
                            continue;
                        }
                        if (var439 == 3923) {
                            var5--;
                            int var272 = field730[var5];
                            class204 var273 = (class204) Statics.field951.field3027.get(var272);
                            long var274 = class107.method2434() - Statics.field1935 - var273.field2992;
                            int var276 = (int) (var274 / 3600000L);
                            int var277 = (int) ((var274 - (long) (var276 * 3600000)) / 60000L);
                            int var278 = (int) ((var274 - (long) (var276 * 3600000) - (long) (var277 * 60000)) / 1000L);
                            String var279 = var276 + ":" + var277 / 10 + var277 % 10 + ":" + var278 / 10 + var278 % 10;
                            field731[var6++] = var279;
                            continue;
                        }
                        if (var439 == 3924) {
                            var5--;
                            int var280 = field730[var5];
                            class204 var281 = (class204) Statics.field951.field3027.get(var280);
                            field730[var5++] = var281.field2991.field3025;
                            continue;
                        }
                        if (var439 == 3925) {
                            var5--;
                            int var282 = field730[var5];
                            class204 var283 = (class204) Statics.field951.field3027.get(var282);
                            field730[var5++] = var283.field2991.field3023;
                            continue;
                        }
                        if (var439 == 3926) {
                            var5--;
                            int var284 = field730[var5];
                            class204 var285 = (class204) Statics.field951.field3027.get(var284);
                            field730[var5++] = var285.field2991.field3018;
                            continue;
                        }
                    } else if (var439 < 4100) {
                        if (var439 == 4000) {
                            var5 -= 2;
                            int var286 = field730[var5];
                            int var287 = field730[var5 + 1];
                            field730[var5++] = var286 + var287;
                            continue;
                        }
                        if (var439 == 4001) {
                            var5 -= 2;
                            int var288 = field730[var5];
                            int var289 = field730[var5 + 1];
                            field730[var5++] = var288 - var289;
                            continue;
                        }
                        if (var439 == 4002) {
                            var5 -= 2;
                            int var290 = field730[var5];
                            int var291 = field730[var5 + 1];
                            field730[var5++] = var290 * var291;
                            continue;
                        }
                        if (var439 == 4003) {
                            var5 -= 2;
                            int var292 = field730[var5];
                            int var293 = field730[var5 + 1];
                            field730[var5++] = var292 / var293;
                            continue;
                        }
                        if (var439 == 4004) {
                            var5--;
                            int var294 = field730[var5];
                            field730[var5++] = (int) (Math.random() * (double) var294);
                            continue;
                        }
                        if (var439 == 4005) {
                            var5--;
                            int var295 = field730[var5];
                            field730[var5++] = (int) (Math.random() * (double) (var295 + 1));
                            continue;
                        }
                        if (var439 == 4006) {
                            var5 -= 5;
                            int var296 = field730[var5];
                            int var297 = field730[var5 + 1];
                            int var298 = field730[var5 + 2];
                            int var299 = field730[var5 + 3];
                            int var300 = field730[var5 + 4];
                            field730[var5++] = (var297 - var296) * (var300 - var298) / (var299 - var298) + var296;
                            continue;
                        }
                        if (var439 == 4007) {
                            var5 -= 2;
                            int var301 = field730[var5];
                            int var302 = field730[var5 + 1];
                            field730[var5++] = var301 * var302 / 100 + var301;
                            continue;
                        }
                        if (var439 == 4008) {
                            var5 -= 2;
                            int var303 = field730[var5];
                            int var304 = field730[var5 + 1];
                            field730[var5++] = var303 | 0x1 << var304;
                            continue;
                        }
                        if (var439 == 4009) {
                            var5 -= 2;
                            int var305 = field730[var5];
                            int var306 = field730[var5 + 1];
                            field730[var5++] = var305 & -1 - (0x1 << var306);
                            continue;
                        }
                        if (var439 == 4010) {
                            var5 -= 2;
                            int var307 = field730[var5];
                            int var308 = field730[var5 + 1];
                            field730[var5++] = (var307 & 0x1 << var308) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var439 == 4011) {
                            var5 -= 2;
                            int var309 = field730[var5];
                            int var310 = field730[var5 + 1];
                            field730[var5++] = var309 % var310;
                            continue;
                        }
                        if (var439 == 4012) {
                            var5 -= 2;
                            int var311 = field730[var5];
                            int var312 = field730[var5 + 1];
                            if (var311 == 0) {
                                field730[var5++] = 0;
                            } else {
                                field730[var5++] = (int) Math.pow((double) var311, (double) var312);
                            }
                            continue;
                        }
                        if (var439 == 4013) {
                            var5 -= 2;
                            int var313 = field730[var5];
                            int var314 = field730[var5 + 1];
                            if (var313 == 0) {
                                field730[var5++] = 0;
                            } else if (var314 == 0) {
                                field730[var5++] = Integer.MAX_VALUE;
                            } else {
                                field730[var5++] = (int) Math.pow((double) var313, 1.0D / (double) var314);
                            }
                            continue;
                        }
                        if (var439 == 4014) {
                            var5 -= 2;
                            int var315 = field730[var5];
                            int var316 = field730[var5 + 1];
                            field730[var5++] = var315 & var316;
                            continue;
                        }
                        if (var439 == 4015) {
                            var5 -= 2;
                            int var317 = field730[var5];
                            int var318 = field730[var5 + 1];
                            field730[var5++] = var317 | var318;
                            continue;
                        }
                    } else if (var439 < 4200) {
                        if (var439 == 4100) {
                            var6--;
                            String var319 = field731[var6];
                            var5--;
                            int var320 = field730[var5];
                            field731[var6++] = var319 + var320;
                            continue;
                        }
                        if (var439 == 4101) {
                            var6 -= 2;
                            String var321 = field731[var6];
                            String var322 = field731[var6 + 1];
                            field731[var6++] = var321 + var322;
                            continue;
                        }
                        if (var439 == 4102) {
                            var6--;
                            String var323 = field731[var6];
                            var5--;
                            int var324 = field730[var5];
                            String[] var325 = field731;
                            int var326 = var6++;
                            String var328;
                            if (var324 < 0) {
                                var328 = Integer.toString(var324);
                            } else {
                                var328 = class154.method2726(var324, 10, true);
                            }
                            var325[var326] = var323 + var328;
                            continue;
                        }
                        if (var439 == 4103) {
                            var6--;
                            String var329 = field731[var6];
                            field731[var6++] = var329.toLowerCase();
                            continue;
                        }
                        if (var439 == 4104) {
                            var5--;
                            int var330 = field730[var5];
                            long var331 = ((long) var330 + 11745L) * 86400000L;
                            field736.setTime(new Date(var331));
                            int var333 = field736.get(5);
                            int var334 = field736.get(2);
                            int var335 = field736.get(1);
                            field731[var6++] = var333 + "-" + field725[var334] + "-" + var335;
                            continue;
                        }
                        if (var439 == 4105) {
                            var6 -= 2;
                            String var336 = field731[var6];
                            String var337 = field731[var6 + 1];
                            if (Statics.field393.field29 != null && Statics.field393.field29.field2754) {
                                field731[var6++] = var337;
                                continue;
                            }
                            field731[var6++] = var336;
                            continue;
                        }
                        if (var439 == 4106) {
                            var5--;
                            int var338 = field730[var5];
                            field731[var6++] = Integer.toString(var338);
                            continue;
                        }
                        if (var439 == 4107) {
                            var6 -= 2;
                            int[] var339 = field730;
                            int var340 = var5++;
                            int var341 = class157.method533(field731[var6], field731[var6 + 1], client.field272);
                            byte var342;
                            if (var341 > 0) {
                                var342 = 1;
                            } else if (var341 < 0) {
                                var342 = -1;
                            } else {
                                var342 = 0;
                            }
                            var339[var340] = var342;
                            continue;
                        }
                        if (var439 == 4108) {
                            var6--;
                            String var343 = field731[var6];
                            var5 -= 2;
                            int var344 = field730[var5];
                            int var345 = field730[var5 + 1];
                            byte[] var346 = Statics.field200.method2811(var345, 0);
                            class214 var347 = new class214(var346);
                            field730[var5++] = var347.method3498(var343, var344);
                            continue;
                        }
                        if (var439 == 4109) {
                            var6--;
                            String var348 = field731[var6];
                            var5 -= 2;
                            int var349 = field730[var5];
                            int var350 = field730[var5 + 1];
                            byte[] var351 = Statics.field200.method2811(var350, 0);
                            class214 var352 = new class214(var351);
                            field730[var5++] = var352.method3497(var348, var349);
                            continue;
                        }
                        if (var439 == 4110) {
                            var6 -= 2;
                            String var353 = field731[var6];
                            String var354 = field731[var6 + 1];
                            var5--;
                            if (field730[var5] == 1) {
                                field731[var6++] = var353;
                            } else {
                                field731[var6++] = var354;
                            }
                            continue;
                        }
                        if (var439 == 4111) {
                            var6--;
                            String var355 = field731[var6];
                            field731[var6++] = class213.method3499(var355);
                            continue;
                        }
                        if (var439 == 4112) {
                            var6--;
                            String var356 = field731[var6];
                            var5--;
                            int var357 = field730[var5];
                            field731[var6++] = var356 + (char) var357;
                            continue;
                        }
                        if (var439 == 4113) {
                            var5--;
                            int var358 = field730[var5];
                            field730[var5++] = class154.method2372((char) var358) ? 1 : 0;
                            continue;
                        }
                        if (var439 == 4114) {
                            var5--;
                            int var359 = field730[var5];
                            int[] var360 = field730;
                            int var361 = var5++;
                            char var362 = (char) var359;
                            boolean var363 = var362 >= '0' && var362 <= '9' || var362 >= 'A' && var362 <= 'Z' || var362 >= 'a' && var362 <= 'z';
                            var360[var361] = var363 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 4115) {
                            var5--;
                            int var364 = field730[var5];
                            field730[var5++] = class154.method1871((char) var364) ? 1 : 0;
                            continue;
                        }
                        if (var439 == 4116) {
                            var5--;
                            int var365 = field730[var5];
                            field730[var5++] = class154.method1889((char) var365) ? 1 : 0;
                            continue;
                        }
                        if (var439 == 4117) {
                            var6--;
                            String var366 = field731[var6];
                            if (var366 == null) {
                                field730[var5++] = 0;
                            } else {
                                field730[var5++] = var366.length();
                            }
                            continue;
                        }
                        if (var439 == 4118) {
                            var6--;
                            String var367 = field731[var6];
                            var5 -= 2;
                            int var368 = field730[var5];
                            int var369 = field730[var5 + 1];
                            field731[var6++] = var367.substring(var368, var369);
                            continue;
                        }
                        if (var439 == 4119) {
                            var6--;
                            String var370 = field731[var6];
                            StringBuilder var371 = new StringBuilder(var370.length());
                            boolean var372 = false;
                            for (int var373 = 0; var373 < var370.length(); var373++) {
                                char var374 = var370.charAt(var373);
                                if (var374 == '<') {
                                    var372 = true;
                                } else if (var374 == '>') {
                                    var372 = false;
                                } else if (!var372) {
                                    var371.append(var374);
                                }
                            }
                            field731[var6++] = var371.toString();
                            continue;
                        }
                        if (var439 == 4120) {
                            var6--;
                            String var375 = field731[var6];
                            var5--;
                            int var376 = field730[var5];
                            field730[var5++] = var375.indexOf(var376);
                            continue;
                        }
                        if (var439 == 4121) {
                            var6 -= 2;
                            String var377 = field731[var6];
                            String var378 = field731[var6 + 1];
                            var5--;
                            int var379 = field730[var5];
                            field730[var5++] = var377.indexOf(var378, var379);
                            continue;
                        }
                    } else if (var439 < 4300) {
                        if (var439 == 4200) {
                            var5--;
                            int var380 = field730[var5];
                            field731[var6++] = class47.method832(var380).field1021;
                            continue;
                        }
                        if (var439 == 4201) {
                            var5 -= 2;
                            int var381 = field730[var5];
                            int var382 = field730[var5 + 1];
                            class47 var383 = class47.method832(var381);
                            if (var382 >= 1 && var382 <= 5 && var383.field1035[var382 - 1] != null) {
                                field731[var6++] = var383.field1035[var382 - 1];
                                continue;
                            }
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 4202) {
                            var5 -= 2;
                            int var384 = field730[var5];
                            int var385 = field730[var5 + 1];
                            class47 var386 = class47.method832(var384);
                            if (var385 >= 1 && var385 <= 5 && var386.field1036[var385 - 1] != null) {
                                field731[var6++] = var386.field1036[var385 - 1];
                                continue;
                            }
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 4203) {
                            var5--;
                            int var387 = field730[var5];
                            field730[var5++] = class47.method832(var387).field1033;
                            continue;
                        }
                        if (var439 == 4204) {
                            var5--;
                            int var388 = field730[var5];
                            field730[var5++] = class47.method832(var388).field1032 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 4205) {
                            var5--;
                            int var389 = field730[var5];
                            class47 var390 = class47.method832(var389);
                            if (var390.field1052 == -1 && var390.field1051 >= 0) {
                                field730[var5++] = var390.field1051;
                                continue;
                            }
                            field730[var5++] = var389;
                            continue;
                        }
                        if (var439 == 4206) {
                            var5--;
                            int var391 = field730[var5];
                            class47 var392 = class47.method832(var391);
                            if (var392.field1052 >= 0 && var392.field1051 >= 0) {
                                field730[var5++] = var392.field1051;
                                continue;
                            }
                            field730[var5++] = var391;
                            continue;
                        }
                        if (var439 == 4207) {
                            var5--;
                            int var393 = field730[var5];
                            field730[var5++] = class47.method832(var393).field1034 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 4210) {
                            var6--;
                            String var394 = field731[var6];
                            var5--;
                            int var395 = field730[var5];
                            client.method3235(var394, var395 == 1);
                            field730[var5++] = Statics.field801;
                            continue;
                        }
                        if (var439 == 4211) {
                            if (Statics.field1829 != null && Statics.field1070 < Statics.field801) {
                                field730[var5++] = Statics.field1829[++Statics.field1070 - 1] & 0xFFFF;
                                continue;
                            }
                            field730[var5++] = -1;
                            continue;
                        }
                        if (var439 == 4212) {
                            Statics.field1070 = 0;
                            continue;
                        }
                    } else if (var439 < 5100) {
                        if (var439 == 5000) {
                            field730[var5++] = client.field483;
                            continue;
                        }
                        if (var439 == 5001) {
                            var5 -= 3;
                            client.field483 = field730[var5];
                            int var396 = field730[var5 + 1];
                            class122[] var397 = class122.method1894();
                            int var398 = 0;
                            class122 var400;
                            while (true) {
                                if (var398 >= var397.length) {
                                    var400 = null;
                                    break;
                                }
                                class122 var399 = var397[var398];
                                if (var399.field1922 == var396) {
                                    var400 = var399;
                                    break;
                                }
                                var398++;
                            }
                            Statics.field626 = var400;
                            if (Statics.field626 == null) {
                                Statics.field626 = class122.field1920;
                            }
                            client.field484 = field730[var5 + 2];
                            client.field521.method2396(151);
                            client.field521.method2133(client.field483);
                            client.field521.method2133(Statics.field626.field1922);
                            client.field521.method2133(client.field484);
                            continue;
                        }
                        if (var439 == 5002) {
                            var6--;
                            String var401 = field731[var6];
                            var5 -= 2;
                            int var402 = field730[var5];
                            int var403 = field730[var5 + 1];
                            client.field521.method2396(188);
                            client.field521.method2133(class111.method2719(var401) + 2);
                            client.field521.method2139(var401);
                            client.field521.method2133(var402 - 1);
                            client.field521.method2133(var403);
                            continue;
                        }
                        if (var439 == 5003) {
                            var5 -= 2;
                            int var404 = field730[var5];
                            int var405 = field730[var5 + 1];
                            class33 var406 = class11.method160(var404, var405);
                            if (var406 == null) {
                                field730[var5++] = -1;
                                field730[var5++] = 0;
                                field731[var6++] = "";
                                field731[var6++] = "";
                                field731[var6++] = "";
                            } else {
                                field730[var5++] = var406.field719;
                                field730[var5++] = var406.field716;
                                field731[var6++] = var406.field718 == null ? "" : var406.field718;
                                field731[var6++] = var406.field722 == null ? "" : var406.field722;
                                field731[var6++] = var406.field720 == null ? "" : var406.field720;
                            }
                            continue;
                        }
                        if (var439 == 5004) {
                            var5--;
                            int var407 = field730[var5];
                            class33 var408 = class11.method3000(var407);
                            if (var408 == null) {
                                field730[var5++] = -1;
                                field730[var5++] = 0;
                                field731[var6++] = "";
                                field731[var6++] = "";
                                field731[var6++] = "";
                            } else {
                                field730[var5++] = var408.field715;
                                field730[var5++] = var408.field716;
                                field731[var6++] = var408.field718 == null ? "" : var408.field718;
                                field731[var6++] = var408.field722 == null ? "" : var408.field722;
                                field731[var6++] = var408.field720 == null ? "" : var408.field720;
                            }
                            continue;
                        }
                        if (var439 == 5005) {
                            if (Statics.field626 == null) {
                                field730[var5++] = -1;
                            } else {
                                field730[var5++] = Statics.field626.field1922;
                            }
                            continue;
                        }
                        if (var439 == 5008) {
                            var6--;
                            String var409 = field731[var6];
                            var5--;
                            int var410 = field730[var5];
                            String var411 = var409.toLowerCase();
                            byte var412 = 0;
                            if (var411.startsWith(class148.field2169)) {
                                var412 = 0;
                                var409 = var409.substring(class148.field2169.length());
                            } else if (var411.startsWith(class148.field2275)) {
                                var412 = 1;
                                var409 = var409.substring(class148.field2275.length());
                            } else if (var411.startsWith(class148.field2334)) {
                                var412 = 2;
                                var409 = var409.substring(class148.field2334.length());
                            } else if (var411.startsWith(class148.field2336)) {
                                var412 = 3;
                                var409 = var409.substring(class148.field2336.length());
                            } else if (var411.startsWith(class148.field2338)) {
                                var412 = 4;
                                var409 = var409.substring(class148.field2338.length());
                            } else if (var411.startsWith(class148.field2340)) {
                                var412 = 5;
                                var409 = var409.substring(class148.field2340.length());
                            } else if (var411.startsWith(class148.field2202)) {
                                var412 = 6;
                                var409 = var409.substring(class148.field2202.length());
                            } else if (var411.startsWith(class148.field2344)) {
                                var412 = 7;
                                var409 = var409.substring(class148.field2344.length());
                            } else if (var411.startsWith(class148.field2259)) {
                                var412 = 8;
                                var409 = var409.substring(class148.field2259.length());
                            } else if (var411.startsWith(class148.field2279)) {
                                var412 = 9;
                                var409 = var409.substring(class148.field2279.length());
                            } else if (var411.startsWith(class148.field2350)) {
                                var412 = 10;
                                var409 = var409.substring(class148.field2350.length());
                            } else if (var411.startsWith(class148.field2352)) {
                                var412 = 11;
                                var409 = var409.substring(class148.field2352.length());
                            } else if (client.field272 != 0) {
                                if (var411.startsWith(class148.field2174)) {
                                    var412 = 0;
                                    var409 = var409.substring(class148.field2174.length());
                                } else if (var411.startsWith(class148.field2333)) {
                                    var412 = 1;
                                    var409 = var409.substring(class148.field2333.length());
                                } else if (var411.startsWith(class148.field2335)) {
                                    var412 = 2;
                                    var409 = var409.substring(class148.field2335.length());
                                } else if (var411.startsWith(class148.field2337)) {
                                    var412 = 3;
                                    var409 = var409.substring(class148.field2337.length());
                                } else if (var411.startsWith(class148.field2339)) {
                                    var412 = 4;
                                    var409 = var409.substring(class148.field2339.length());
                                } else if (var411.startsWith(class148.field2341)) {
                                    var412 = 5;
                                    var409 = var409.substring(class148.field2341.length());
                                } else if (var411.startsWith(class148.field2348)) {
                                    var412 = 6;
                                    var409 = var409.substring(class148.field2348.length());
                                } else if (var411.startsWith(class148.field2288)) {
                                    var412 = 7;
                                    var409 = var409.substring(class148.field2288.length());
                                } else if (var411.startsWith(class148.field2347)) {
                                    var412 = 8;
                                    var409 = var409.substring(class148.field2347.length());
                                } else if (var411.startsWith(class148.field2349)) {
                                    var412 = 9;
                                    var409 = var409.substring(class148.field2349.length());
                                } else if (var411.startsWith(class148.field2295)) {
                                    var412 = 10;
                                    var409 = var409.substring(class148.field2295.length());
                                } else if (var411.startsWith(class148.field2353)) {
                                    var412 = 11;
                                    var409 = var409.substring(class148.field2353.length());
                                }
                            }
                            String var413 = var409.toLowerCase();
                            byte var414 = 0;
                            if (var413.startsWith(class148.field2354)) {
                                var414 = 1;
                                var409 = var409.substring(class148.field2354.length());
                            } else if (var413.startsWith(class148.field2356)) {
                                var414 = 2;
                                var409 = var409.substring(class148.field2356.length());
                            } else if (var413.startsWith(class148.field2363)) {
                                var414 = 3;
                                var409 = var409.substring(class148.field2363.length());
                            } else if (var413.startsWith(class148.field2360)) {
                                var414 = 4;
                                var409 = var409.substring(class148.field2360.length());
                            } else if (var413.startsWith(class148.field2189)) {
                                var414 = 5;
                                var409 = var409.substring(class148.field2189.length());
                            } else if (client.field272 != 0) {
                                if (var413.startsWith(class148.field2355)) {
                                    var414 = 1;
                                    var409 = var409.substring(class148.field2355.length());
                                } else if (var413.startsWith(class148.field2357)) {
                                    var414 = 2;
                                    var409 = var409.substring(class148.field2357.length());
                                } else if (var413.startsWith(class148.field2235)) {
                                    var414 = 3;
                                    var409 = var409.substring(class148.field2235.length());
                                } else if (var413.startsWith(class148.field2361)) {
                                    var414 = 4;
                                    var409 = var409.substring(class148.field2361.length());
                                } else if (var413.startsWith(class148.field2255)) {
                                    var414 = 5;
                                    var409 = var409.substring(class148.field2255.length());
                                }
                            }
                            client.field521.method2396(218);
                            client.field521.method2133(0);
                            int var415 = client.field521.field1852;
                            client.field521.method2133(var410);
                            client.field521.method2133(var412);
                            client.field521.method2133(var414);
                            class212.method109(client.field521, var409);
                            client.field521.method2270(client.field521.field1852 - var415);
                            continue;
                        }
                        if (var439 == 5009) {
                            var6 -= 2;
                            String var416 = field731[var6];
                            String var417 = field731[var6 + 1];
                            client.field521.method2396(217);
                            client.field521.method2134(0);
                            int var418 = client.field521.field1852;
                            client.field521.method2139(var416);
                            class212.method109(client.field521, var417);
                            client.field521.method2144(client.field521.field1852 - var418);
                            continue;
                        }
                        if (var439 == 5015) {
                            String var419;
                            if (Statics.field393 == null || Statics.field393.field37 == null) {
                                var419 = "";
                            } else {
                                var419 = Statics.field393.field37;
                            }
                            field731[var6++] = var419;
                            continue;
                        }
                        if (var439 == 5016) {
                            field730[var5++] = client.field484;
                            continue;
                        }
                        if (var439 == 5017) {
                            var5--;
                            int var420 = field730[var5];
                            int[] var421 = field730;
                            int var422 = var5++;
                            class26 var423 = (class26) class11.field160.get(var420);
                            int var424;
                            if (var423 == null) {
                                var424 = 0;
                            } else {
                                var424 = var423.method534();
                            }
                            var421[var422] = var424;
                            continue;
                        }
                        if (var439 == 5018) {
                            var5--;
                            int var425 = field730[var5];
                            int[] var426 = field730;
                            int var427 = var5++;
                            class33 var428 = (class33) class11.field157.method3297((long) var425);
                            int var429;
                            if (var428 == null) {
                                var429 = -1;
                            } else if (class11.field156.field2943 == var428.field2947) {
                                var429 = -1;
                            } else {
                                var429 = ((class33) var428.field2947).field719;
                            }
                            var426[var427] = var429;
                            continue;
                        }
                        if (var439 == 5019) {
                            var5--;
                            int var430 = field730[var5];
                            field730[var5++] = class11.method753(var430);
                            continue;
                        }
                        if (var439 == 5020) {
                            var6--;
                            String var431 = field731[var6];
                            if (var431.equalsIgnoreCase("toggleroof")) {
                                Statics.field93.field140 = !Statics.field93.field140;
                                class9.method91();
                                if (Statics.field93.field140) {
                                    class11.method3012(99, "", "Roofs are now all hidden");
                                } else {
                                    class11.method3012(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field435 >= 2) {
                                if (var431.equalsIgnoreCase("fpson")) {
                                    client.field281 = true;
                                }
                                if (var431.equalsIgnoreCase("fpsoff")) {
                                    client.field281 = false;
                                }
                                if (var431.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var431.equalsIgnoreCase("clientdrop")) {
                                    client.method489();
                                }
                                if (var431.equalsIgnoreCase("errortest") && client.field382 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field521.method2396(204);
                            client.field521.method2133(var431.length() + 1);
                            client.field521.method2139(var431);
                            continue;
                        }
                        if (var439 == 5021) {
                            var6--;
                            client.field485 = field731[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var439 == 5022) {
                            field731[var6++] = client.field485;
                            continue;
                        }
                    }
                } else {
                    class164 var64;
                    if (var439 >= 2000) {
                        var439 -= 1000;
                        var5--;
                        var64 = class164.method619(field730[var5]);
                    } else {
                        var64 = var41 ? Statics.field242 : Statics.field734;
                    }
                    if (var439 == 1300) {
                        var5--;
                        int var65 = field730[var5] - 1;
                        if (var65 >= 0 && var65 <= 9) {
                            var6--;
                            var64.method2954(var65, field731[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var439 == 1301) {
                        var5 -= 2;
                        int var66 = field730[var5];
                        int var67 = field730[var5 + 1];
                        var64.field2658 = class164.method2701(var66, var67);
                        continue;
                    }
                    if (var439 == 1302) {
                        var5--;
                        var64.field2677 = field730[var5] == 1;
                        continue;
                    }
                    if (var439 == 1303) {
                        var5--;
                        var64.field2675 = field730[var5];
                        continue;
                    }
                    if (var439 == 1304) {
                        var5--;
                        var64.field2715 = field730[var5];
                        continue;
                    }
                    if (var439 == 1305) {
                        var6--;
                        var64.field2672 = field731[var6];
                        continue;
                    }
                    if (var439 == 1306) {
                        var6--;
                        var64.field2678 = field731[var6];
                        continue;
                    }
                    if (var439 == 1307) {
                        var64.field2673 = null;
                        continue;
                    }
                }
                if (var439 >= 5600 || var439 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var432 = field730[var5];
                int var433 = field730[var5 + 1];
                if (!client.field497) {
                    client.field501 = var432;
                    client.field350 = var433;
                }
            }
        } catch (Exception var438) {
            StringBuilder var435 = new StringBuilder(30);
            var435.append("").append(var4.field2958).append(" ");
            for (int var436 = field732 - 1; var436 >= 0; var436--) {
                var435.append("").append(field733[var436].field201.field2958).append(" ");
            }
            var435.append("").append(var10);
            class140.method1379(var435.toString(), var438);
        }
    }

    @ObfuscatedName("cd.h(IB)V")
    public static void method2068(int arg0) {
        if (arg0 == -1 || !class164.method29(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2686[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3.field2680 != null) {
                class1 var4 = new class1();
                var4.field7 = var3;
                var4.field8 = var3.field2680;
                method2909(var4, 2000000);
            }
        }
    }
}
