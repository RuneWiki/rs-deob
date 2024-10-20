package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("az")
public class class34 {

    @ObfuscatedName("az.t")
    public static int[] field749 = new int[5];

    @ObfuscatedName("az.e")
    public static int[][] field748 = new int[5][5000];

    @ObfuscatedName("az.q")
    public static int[] field751 = new int[1000];

    @ObfuscatedName("az.z")
    public static String[] field750 = new String[1000];

    @ObfuscatedName("az.v")
    public static int field752 = 0;

    @ObfuscatedName("az.b")
    public static class14[] field743 = new class14[50];

    @ObfuscatedName("az.w")
    public static Calendar field753 = Calendar.getInstance();

    @ObfuscatedName("az.l")
    public static final String[] field754 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("az.j")
    public static int field757 = 0;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.y(Ly;I)V")
    public static void method607(class1 arg0) {
        method2467(arg0, 200000);
    }

    @ObfuscatedName("dd.k(Ly;II)V")
    public static void method2467(class1 arg0, int arg1) {
        Object[] var2 = arg0.field11;
        int var3 = (Integer) var2[0];
        class20 var4 = class20.method490(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field572;
        int[] var9 = var4.field564;
        byte var10 = -1;
        field752 = 0;
        try {
            Statics.field745 = new int[var4.field566];
            int var11 = 0;
            Statics.field746 = new String[var4.field567];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2792;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2669;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2792;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2669;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field17;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1;
                    }
                    Statics.field745[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field746[var12++] = var15;
                }
            }
            int var16 = 0;
            field757 = arg0.field8;
            label3161: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var509 = var8[var7];
                if (var509 < 100) {
                    if (var509 == 0) {
                        field751[var5++] = var9[var7];
                        continue;
                    }
                    if (var509 == 1) {
                        int var17 = var9[var7];
                        field751[var5++] = class167.field2816[var17];
                        continue;
                    }
                    if (var509 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class167.field2816[var18] = field751[var5];
                        client.method125(var18);
                        continue;
                    }
                    if (var509 == 3) {
                        field750[var6++] = var4.field575[var7];
                        continue;
                    }
                    if (var509 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var509 == 7) {
                        var5 -= 2;
                        if (field751[var5 + 1] != field751[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var509 == 8) {
                        var5 -= 2;
                        if (field751[var5 + 1] == field751[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var509 == 9) {
                        var5 -= 2;
                        if (field751[var5] < field751[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var509 == 10) {
                        var5 -= 2;
                        if (field751[var5] > field751[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var509 == 21) {
                        if (field752 == 0) {
                            return;
                        }
                        class14 var19 = field743[--field752];
                        var4 = var19.field206;
                        var8 = var4.field572;
                        var9 = var4.field564;
                        var7 = var19.field201;
                        Statics.field745 = var19.field202;
                        Statics.field746 = var19.field203;
                        continue;
                    }
                    if (var509 == 25) {
                        int var20 = var9[var7];
                        field751[var5++] = class167.method14(var20);
                        continue;
                    }
                    if (var509 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field751[var5];
                        class44 var23 = Statics.method3527(var21);
                        int var24 = var23.field1011;
                        int var25 = var23.field1008;
                        int var26 = var23.field1009;
                        int var27 = class167.field2818[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class167.field2816[var24] = class167.field2816[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var509 == 31) {
                        var5 -= 2;
                        if (field751[var5] <= field751[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var509 == 32) {
                        var5 -= 2;
                        if (field751[var5] >= field751[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var509 == 33) {
                        field751[var5++] = Statics.field745[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var509 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field745[var10001] = field751[var5];
                        continue;
                    }
                    if (var509 == 35) {
                        field750[var6++] = Statics.field746[var9[var7]];
                        continue;
                    }
                    if (var509 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field746[var10001] = field750[var6];
                        continue;
                    }
                    if (var509 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String var30 = class154.method2641(field750, var6, var29);
                        field750[var6++] = var30;
                        continue;
                    }
                    if (var509 == 38) {
                        var5--;
                        continue;
                    }
                    if (var509 == 39) {
                        var6--;
                        continue;
                    }
                    if (var509 == 40) {
                        int var31 = var9[var7];
                        class20 var32 = class20.method490(var31);
                        int[] var33 = new int[var32.field566];
                        String[] var34 = new String[var32.field567];
                        for (int var35 = 0; var35 < var32.field568; var35++) {
                            var33[var35] = field751[var5 - var32.field568 + var35];
                        }
                        for (int var36 = 0; var36 < var32.field569; var36++) {
                            var34[var36] = field750[var6 - var32.field569 + var36];
                        }
                        var5 -= var32.field568;
                        var6 -= var32.field569;
                        class14 var37 = new class14();
                        var37.field206 = var4;
                        var37.field201 = var7;
                        var37.field202 = Statics.field745;
                        var37.field203 = Statics.field746;
                        field743[++field752 - 1] = var37;
                        var4 = var32;
                        var8 = var32.field572;
                        var9 = var32.field564;
                        var7 = -1;
                        Statics.field745 = var33;
                        Statics.field746 = var34;
                        continue;
                    }
                    if (var509 == 42) {
                        field751[var5++] = client.field465[var9[var7]];
                        continue;
                    }
                    if (var509 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field465[var10001] = field751[var5];
                        continue;
                    }
                    if (var509 == 44) {
                        int var38 = var9[var7] >> 16;
                        int var39 = var9[var7] & 0xFFFF;
                        var5--;
                        int var40 = field751[var5];
                        if (var40 >= 0 && var40 <= 5000) {
                            field749[var38] = var40;
                            byte var41 = -1;
                            if (var39 == 105) {
                                var41 = 0;
                            }
                            int var42 = 0;
                            while (true) {
                                if (var42 >= var40) {
                                    continue label3161;
                                }
                                field748[var38][var42] = var41;
                                var42++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var509 == 45) {
                        int var43 = var9[var7];
                        var5--;
                        int var44 = field751[var5];
                        if (var44 >= 0 && var44 < field749[var43]) {
                            field751[var5++] = field748[var43][var44];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var509 == 46) {
                        int var45 = var9[var7];
                        var5 -= 2;
                        int var46 = field751[var5];
                        if (var46 >= 0 && var46 < field749[var45]) {
                            field748[var45][var46] = field751[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var509 == 47) {
                        String var47 = client.field416[var9[var7]];
                        if (var47 == null) {
                            var47 = "null";
                        }
                        field750[var6++] = var47;
                        continue;
                    }
                    if (var509 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field416[var10001] = field750[var6];
                        continue;
                    }
                }
                boolean var48;
                if (var9[var7] == 1) {
                    var48 = true;
                } else {
                    var48 = false;
                }
                if (var509 < 1000) {
                    if (var509 == 100) {
                        var5 -= 3;
                        int var49 = field751[var5];
                        int var50 = field751[var5 + 1];
                        int var51 = field751[var5 + 2];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class164 var52 = class164.method2744(var49);
                        if (var52.field2790 == null) {
                            var52.field2790 = new class164[var51 + 1];
                        }
                        if (var52.field2790.length <= var51) {
                            class164[] var53 = new class164[var51 + 1];
                            for (int var54 = 0; var54 < var52.field2790.length; var54++) {
                                var53[var54] = var52.field2790[var54];
                            }
                            var52.field2790 = var53;
                        }
                        if (var51 > 0 && var52.field2790[var51 - 1] == null) {
                            throw new RuntimeException("" + (var51 - 1));
                        }
                        class164 var55 = new class164();
                        var55.field2670 = var50;
                        var55.field2687 = var55.field2792 = var52.field2792;
                        var55.field2669 = var51;
                        var55.field2667 = true;
                        var52.field2790[var51] = var55;
                        if (var48) {
                            Statics.field3059 = var55;
                        } else {
                            Statics.field127 = var55;
                        }
                        client.method147(var52);
                        continue;
                    }
                    if (var509 == 101) {
                        class164 var56 = var48 ? Statics.field3059 : Statics.field127;
                        class164 var57 = class164.method2744(var56.field2792);
                        var57.field2790[var56.field2669] = null;
                        client.method147(var57);
                        continue;
                    }
                    if (var509 == 102) {
                        var5--;
                        class164 var58 = class164.method2744(field751[var5]);
                        var58.field2790 = null;
                        client.method147(var58);
                        continue;
                    }
                    if (var509 == 200) {
                        var5 -= 2;
                        int var59 = field751[var5];
                        int var60 = field751[var5 + 1];
                        class164 var61 = class164.method2815(var59, var60);
                        if (var61 != null && var60 != -1) {
                            field751[var5++] = 1;
                            if (var48) {
                                Statics.field3059 = var61;
                            } else {
                                Statics.field127 = var61;
                            }
                            continue;
                        }
                        field751[var5++] = 0;
                        continue;
                    }
                    if (var509 == 201) {
                        var5--;
                        class164 var62 = class164.method2744(field751[var5]);
                        if (var62 == null) {
                            field751[var5++] = 0;
                        } else {
                            field751[var5++] = 1;
                            if (var48) {
                                Statics.field3059 = var62;
                            } else {
                                Statics.field127 = var62;
                            }
                        }
                        continue;
                    }
                } else if (!(var509 < 1000 || var509 >= 1100) || !(var509 < 2000 || var509 >= 2100)) {
                    int var63 = -1;
                    class164 var64;
                    if (var509 >= 2000) {
                        var509 -= 1000;
                        var5--;
                        var63 = field751[var5];
                        var64 = class164.method2744(var63);
                    } else {
                        var64 = var48 ? Statics.field3059 : Statics.field127;
                    }
                    if (var509 == 1000) {
                        var5 -= 4;
                        var64.field2677 = field751[var5];
                        var64.field2678 = field751[var5 + 1];
                        var64.field2722 = field751[var5 + 2];
                        var64.field2674 = field751[var5 + 3];
                        client.method147(var64);
                        client.method703(var64);
                        if (var63 != -1 && var64.field2670 == 0) {
                            client.method97(Statics.field2685[var63 >> 16], var64, false);
                        }
                        continue;
                    }
                    if (var509 == 1001) {
                        var5 -= 4;
                        var64.field2747 = field751[var5];
                        var64.field2680 = field751[var5 + 1];
                        var64.field2675 = field751[var5 + 2];
                        var64.field2676 = field751[var5 + 3];
                        client.method147(var64);
                        client.method703(var64);
                        if (var63 != -1 && var64.field2670 == 0) {
                            client.method97(Statics.field2685[var63 >> 16], var64, false);
                        }
                        continue;
                    }
                    if (var509 == 1003) {
                        var5--;
                        boolean var65 = field751[var5] == 1;
                        if (var64.field2671 != var65) {
                            var64.field2671 = var65;
                            client.method147(var64);
                        }
                        continue;
                    }
                    if (var509 == 1005) {
                        var5--;
                        var64.field2718 = field751[var5] == 1;
                        continue;
                    }
                } else if (!(var509 < 1100 || var509 >= 1200) || !(var509 < 2100 || var509 >= 2200)) {
                    int var66 = -1;
                    class164 var67;
                    if (var509 >= 2000) {
                        var509 -= 1000;
                        var5--;
                        var66 = field751[var5];
                        var67 = class164.method2744(var66);
                    } else {
                        var67 = var48 ? Statics.field3059 : Statics.field127;
                    }
                    if (var509 == 1100) {
                        var5 -= 2;
                        var67.field2785 = field751[var5];
                        if (var67.field2785 > var67.field2691 - var67.field2683) {
                            var67.field2785 = var67.field2691 - var67.field2683;
                        }
                        if (var67.field2785 < 0) {
                            var67.field2785 = 0;
                        }
                        var67.field2690 = field751[var5 + 1];
                        if (var67.field2690 > var67.field2692 - var67.field2684) {
                            var67.field2690 = var67.field2692 - var67.field2684;
                        }
                        if (var67.field2690 < 0) {
                            var67.field2690 = 0;
                        }
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1101) {
                        var5--;
                        var67.field2688 = field751[var5];
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1102) {
                        var5--;
                        var67.field2697 = field751[var5] == 1;
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1103) {
                        var5--;
                        var67.field2698 = field751[var5];
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1104) {
                        var5--;
                        var67.field2699 = field751[var5];
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1105) {
                        var5--;
                        var67.field2701 = field751[var5];
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1106) {
                        var5--;
                        var67.field2703 = field751[var5];
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1107) {
                        var5--;
                        var67.field2704 = field751[var5] == 1;
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1108) {
                        var67.field2709 = 1;
                        var5--;
                        var67.field2745 = field751[var5];
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1109) {
                        var5 -= 6;
                        var67.field2715 = field751[var5];
                        var67.field2716 = field751[var5 + 1];
                        var67.field2739 = field751[var5 + 2];
                        var67.field2673 = field751[var5 + 3];
                        var67.field2719 = field751[var5 + 4];
                        var67.field2762 = field751[var5 + 5];
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1110) {
                        var5--;
                        int var68 = field751[var5];
                        if (var67.field2721 != var68) {
                            var67.field2721 = var68;
                            var67.field2788 = 0;
                            var67.field2789 = 0;
                            client.method147(var67);
                        }
                        continue;
                    }
                    if (var509 == 1111) {
                        var5--;
                        var67.field2723 = field751[var5] == 1;
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1112) {
                        var6--;
                        String var69 = field750[var6];
                        if (!var69.equals(var67.field2726)) {
                            var67.field2726 = var69;
                            client.method147(var67);
                        }
                        continue;
                    }
                    if (var509 == 1113) {
                        var5--;
                        var67.field2725 = field751[var5];
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1114) {
                        var5 -= 3;
                        var67.field2729 = field751[var5];
                        var67.field2730 = field751[var5 + 1];
                        var67.field2728 = field751[var5 + 2];
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1115) {
                        var5--;
                        var67.field2731 = field751[var5] == 1;
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1116) {
                        var5--;
                        var67.field2765 = field751[var5];
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1117) {
                        var5--;
                        var67.field2706 = field751[var5];
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1118) {
                        var5--;
                        var67.field2661 = field751[var5] == 1;
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1119) {
                        var5--;
                        var67.field2708 = field751[var5] == 1;
                        client.method147(var67);
                        continue;
                    }
                    if (var509 == 1120) {
                        var5 -= 2;
                        var67.field2691 = field751[var5];
                        var67.field2692 = field751[var5 + 1];
                        client.method147(var67);
                        if (var66 != -1 && var67.field2670 == 0) {
                            client.method97(Statics.field2685[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var509 == 1121) {
                        client.method75(var67.field2792, var67.field2669);
                        client.field332 = var67;
                        client.method147(var67);
                        continue;
                    }
                } else if (var509 >= 1200 && var509 < 1300 || var509 >= 2200 && var509 < 2300) {
                    class164 var70;
                    if (var509 >= 2000) {
                        var509 -= 1000;
                        var5--;
                        var70 = class164.method2744(field751[var5]);
                    } else {
                        var70 = var48 ? Statics.field3059 : Statics.field127;
                    }
                    client.method147(var70);
                    if (var509 == 1200 || var509 == 1205 || var509 == 1212) {
                        var5 -= 2;
                        int var71 = field751[var5];
                        int var72 = field751[var5 + 1];
                        var70.field2786 = var71;
                        var70.field2787 = var72;
                        class47 var73 = class47.method859(var71);
                        var70.field2739 = var73.field1055;
                        var70.field2673 = var73.field1056;
                        var70.field2719 = var73.field1057;
                        var70.field2715 = var73.field1075;
                        var70.field2716 = var73.field1077;
                        var70.field2762 = var73.field1070;
                        if (var509 == 1205) {
                            var70.field2724 = 0;
                        } else if (var509 == 1212 | var73.field1060 == 1) {
                            var70.field2724 = 1;
                        } else {
                            var70.field2724 = 2;
                        }
                        if (var70.field2797 > 0) {
                            var70.field2762 = var70.field2762 * 32 / var70.field2797;
                        } else if (var70.field2747 > 0) {
                            var70.field2762 = var70.field2762 * 32 / var70.field2747;
                        }
                        continue;
                    }
                    if (var509 == 1201) {
                        var70.field2709 = 2;
                        var5--;
                        var70.field2745 = field751[var5];
                        continue;
                    }
                    if (var509 == 1202) {
                        var70.field2709 = 3;
                        var70.field2745 = Statics.field2098.field36.method3084();
                        continue;
                    }
                } else if (var509 >= 1300 && var509 < 1400 || var509 >= 2300 && var509 < 2400) {
                    class164 var74;
                    if (var509 >= 2000) {
                        var509 -= 1000;
                        var5--;
                        var74 = class164.method2744(field751[var5]);
                    } else {
                        var74 = var48 ? Statics.field3059 : Statics.field127;
                    }
                    if (var509 == 1300) {
                        var5--;
                        int var75 = field751[var5] - 1;
                        if (var75 >= 0 && var75 <= 9) {
                            var6--;
                            var74.method3018(var75, field750[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var509 == 1301) {
                        var5 -= 2;
                        int var76 = field751[var5];
                        int var77 = field751[var5 + 1];
                        var74.field2760 = class164.method2815(var76, var77);
                        continue;
                    }
                    if (var509 == 1302) {
                        var5--;
                        var74.field2759 = field751[var5] == 1;
                        continue;
                    }
                    if (var509 == 1303) {
                        var5--;
                        var74.field2742 = field751[var5];
                        continue;
                    }
                    if (var509 == 1304) {
                        var5--;
                        var74.field2705 = field751[var5];
                        continue;
                    }
                    if (var509 == 1305) {
                        var6--;
                        var74.field2736 = field750[var6];
                        continue;
                    }
                    if (var509 == 1306) {
                        var6--;
                        var74.field2665 = field750[var6];
                        continue;
                    }
                    if (var509 == 1307) {
                        var74.field2777 = null;
                        continue;
                    }
                } else {
                    if (var509 >= 1400 && var509 < 1500 || var509 >= 2400 && var509 < 2500) {
                        class164 var78;
                        if (var509 >= 2000) {
                            var509 -= 1000;
                            var5--;
                            var78 = class164.method2744(field751[var5]);
                        } else {
                            var78 = var48 ? Statics.field3059 : Statics.field127;
                        }
                        var6--;
                        String var79 = field750[var6];
                        int[] var80 = null;
                        if (var79.length() > 0 && var79.charAt(var79.length() - 1) == 'Y') {
                            var5--;
                            int var81 = field751[var5];
                            if (var81 > 0) {
                                var80 = new int[var81];
                                while (var81-- > 0) {
                                    var5--;
                                    var80[var81] = field751[var5];
                                }
                            }
                            var79 = var79.substring(0, var79.length() - 1);
                        }
                        Object[] var82 = new Object[var79.length() + 1];
                        for (int var83 = var82.length - 1; var83 >= 1; var83--) {
                            if (var79.charAt(var83 - 1) == 's') {
                                var6--;
                                var82[var83] = field750[var6];
                            } else {
                                var5--;
                                var82[var83] = Integer.valueOf(field751[var5]);
                            }
                        }
                        var5--;
                        int var84 = field751[var5];
                        if (var84 == -1) {
                            var82 = null;
                        } else {
                            var82[0] = Integer.valueOf(var84);
                        }
                        if (var509 == 1400) {
                            var78.field2748 = var82;
                        }
                        if (var509 == 1401) {
                            var78.field2751 = var82;
                        }
                        if (var509 == 1402) {
                            var78.field2710 = var82;
                        }
                        if (var509 == 1403) {
                            var78.field2743 = var82;
                        }
                        if (var509 == 1404) {
                            var78.field2754 = var82;
                        }
                        if (var509 == 1405) {
                            var78.field2755 = var82;
                        }
                        if (var509 == 1406) {
                            var78.field2758 = var82;
                        }
                        if (var509 == 1407) {
                            var78.field2679 = var82;
                            var78.field2761 = var80;
                        }
                        if (var509 == 1408) {
                            var78.field2717 = var82;
                        }
                        if (var509 == 1409) {
                            var78.field2766 = var82;
                        }
                        if (var509 == 1410) {
                            var78.field2707 = var82;
                        }
                        if (var509 == 1411) {
                            var78.field2756 = var82;
                        }
                        if (var509 == 1412) {
                            var78.field2753 = var82;
                        }
                        if (var509 == 1414) {
                            var78.field2657 = var82;
                            var78.field2769 = var80;
                        }
                        if (var509 == 1415) {
                            var78.field2750 = var82;
                            var78.field2764 = var80;
                        }
                        if (var509 == 1416) {
                            var78.field2757 = var82;
                        }
                        if (var509 == 1417) {
                            var78.field2767 = var82;
                        }
                        if (var509 == 1418) {
                            var78.field2720 = var82;
                        }
                        if (var509 == 1419) {
                            var78.field2735 = var82;
                        }
                        if (var509 == 1420) {
                            var78.field2686 = var82;
                        }
                        if (var509 == 1421) {
                            var78.field2771 = var82;
                        }
                        if (var509 == 1422) {
                            var78.field2772 = var82;
                        }
                        if (var509 == 1423) {
                            var78.field2773 = var82;
                        }
                        if (var509 == 1424) {
                            var78.field2741 = var82;
                        }
                        if (var509 == 1425) {
                            var78.field2776 = var82;
                        }
                        if (var509 == 1426) {
                            var78.field2689 = var82;
                        }
                        if (var509 == 1427) {
                            var78.field2668 = var82;
                        }
                        var78.field2746 = true;
                        continue;
                    }
                    if (var509 < 1600) {
                        class164 var85 = var48 ? Statics.field3059 : Statics.field127;
                        if (var509 == 1500) {
                            field751[var5++] = var85.field2681;
                            continue;
                        }
                        if (var509 == 1501) {
                            field751[var5++] = var85.field2682;
                            continue;
                        }
                        if (var509 == 1502) {
                            field751[var5++] = var85.field2683;
                            continue;
                        }
                        if (var509 == 1503) {
                            field751[var5++] = var85.field2684;
                            continue;
                        }
                        if (var509 == 1504) {
                            field751[var5++] = var85.field2671 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 1505) {
                            field751[var5++] = var85.field2687;
                            continue;
                        }
                    } else if (var509 < 1700) {
                        class164 var86 = var48 ? Statics.field3059 : Statics.field127;
                        if (var509 == 1600) {
                            field751[var5++] = var86.field2785;
                            continue;
                        }
                        if (var509 == 1601) {
                            field751[var5++] = var86.field2690;
                            continue;
                        }
                        if (var509 == 1602) {
                            field750[var6++] = var86.field2726;
                            continue;
                        }
                        if (var509 == 1603) {
                            field751[var5++] = var86.field2691;
                            continue;
                        }
                        if (var509 == 1604) {
                            field751[var5++] = var86.field2692;
                            continue;
                        }
                        if (var509 == 1605) {
                            field751[var5++] = var86.field2762;
                            continue;
                        }
                        if (var509 == 1606) {
                            field751[var5++] = var86.field2739;
                            continue;
                        }
                        if (var509 == 1607) {
                            field751[var5++] = var86.field2719;
                            continue;
                        }
                        if (var509 == 1608) {
                            field751[var5++] = var86.field2673;
                            continue;
                        }
                        if (var509 == 1609) {
                            field751[var5++] = var86.field2698;
                            continue;
                        }
                    } else if (var509 < 1800) {
                        class164 var87 = var48 ? Statics.field3059 : Statics.field127;
                        if (var509 == 1700) {
                            field751[var5++] = var87.field2786;
                            continue;
                        }
                        if (var509 == 1701) {
                            if (var87.field2786 == -1) {
                                field751[var5++] = 0;
                            } else {
                                field751[var5++] = var87.field2787;
                            }
                            continue;
                        }
                        if (var509 == 1702) {
                            field751[var5++] = var87.field2669;
                            continue;
                        }
                    } else if (var509 < 1900) {
                        class164 var88 = var48 ? Statics.field3059 : Statics.field127;
                        if (var509 == 1800) {
                            field751[var5++] = class169.method1895(client.method588(var88));
                            continue;
                        }
                        if (var509 == 1801) {
                            var5--;
                            int var89 = field751[var5];
                            int var510 = var89 - 1;
                            if (var88.field2777 != null && var510 < var88.field2777.length && var88.field2777[var510] != null) {
                                field750[var6++] = var88.field2777[var510];
                                continue;
                            }
                            field750[var6++] = "";
                            continue;
                        }
                        if (var509 == 1802) {
                            if (var88.field2736 == null) {
                                field750[var6++] = "";
                            } else {
                                field750[var6++] = var88.field2736;
                            }
                            continue;
                        }
                    } else if (var509 >= 1900 && var509 < 2000 || var509 >= 2900 && var509 < 3000) {
                        class164 var90;
                        if (var509 >= 2000) {
                            var509 -= 1000;
                            var5--;
                            var90 = class164.method2744(field751[var5]);
                        } else {
                            var90 = var48 ? Statics.field3059 : Statics.field127;
                        }
                        if (var509 == 1927) {
                            if (field757 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var90.field2668 == null) {
                                return;
                            }
                            class1 var91 = new class1();
                            var91.field3 = var90;
                            var91.field11 = var90.field2668;
                            var91.field8 = field757 + 1;
                            client.field468.method3391(arg0);
                            continue;
                        }
                    } else if (var509 < 2600) {
                        var5--;
                        class164 var92 = class164.method2744(field751[var5]);
                        if (var509 == 2500) {
                            field751[var5++] = var92.field2681;
                            continue;
                        }
                        if (var509 == 2501) {
                            field751[var5++] = var92.field2682;
                            continue;
                        }
                        if (var509 == 2502) {
                            field751[var5++] = var92.field2683;
                            continue;
                        }
                        if (var509 == 2503) {
                            field751[var5++] = var92.field2684;
                            continue;
                        }
                        if (var509 == 2504) {
                            field751[var5++] = var92.field2671 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 2505) {
                            field751[var5++] = var92.field2687;
                            continue;
                        }
                    } else if (var509 < 2700) {
                        var5--;
                        class164 var93 = class164.method2744(field751[var5]);
                        if (var509 == 2600) {
                            field751[var5++] = var93.field2785;
                            continue;
                        }
                        if (var509 == 2601) {
                            field751[var5++] = var93.field2690;
                            continue;
                        }
                        if (var509 == 2602) {
                            field750[var6++] = var93.field2726;
                            continue;
                        }
                        if (var509 == 2603) {
                            field751[var5++] = var93.field2691;
                            continue;
                        }
                        if (var509 == 2604) {
                            field751[var5++] = var93.field2692;
                            continue;
                        }
                        if (var509 == 2605) {
                            field751[var5++] = var93.field2762;
                            continue;
                        }
                        if (var509 == 2606) {
                            field751[var5++] = var93.field2739;
                            continue;
                        }
                        if (var509 == 2607) {
                            field751[var5++] = var93.field2719;
                            continue;
                        }
                        if (var509 == 2608) {
                            field751[var5++] = var93.field2673;
                            continue;
                        }
                        if (var509 == 2609) {
                            field751[var5++] = var93.field2698;
                            continue;
                        }
                    } else if (var509 < 2800) {
                        if (var509 == 2700) {
                            var5--;
                            class164 var94 = class164.method2744(field751[var5]);
                            field751[var5++] = var94.field2786;
                            continue;
                        }
                        if (var509 == 2701) {
                            var5--;
                            class164 var95 = class164.method2744(field751[var5]);
                            if (var95.field2786 == -1) {
                                field751[var5++] = 0;
                            } else {
                                field751[var5++] = var95.field2787;
                            }
                            continue;
                        }
                        if (var509 == 2702) {
                            var5--;
                            int var96 = field751[var5];
                            class4 var97 = (class4) client.field522.method3357((long) var96);
                            if (var97 == null) {
                                field751[var5++] = 0;
                            } else {
                                field751[var5++] = 1;
                            }
                            continue;
                        }
                        if (var509 == 2706) {
                            field751[var5++] = client.field258;
                            continue;
                        }
                    } else if (var509 < 2900) {
                        var5--;
                        class164 var98 = class164.method2744(field751[var5]);
                        if (var509 == 2800) {
                            field751[var5++] = class169.method1895(client.method588(var98));
                            continue;
                        }
                        if (var509 == 2801) {
                            var5--;
                            int var99 = field751[var5];
                            int var511 = var99 - 1;
                            if (var98.field2777 != null && var511 < var98.field2777.length && var98.field2777[var511] != null) {
                                field750[var6++] = var98.field2777[var511];
                                continue;
                            }
                            field750[var6++] = "";
                            continue;
                        }
                        if (var509 == 2802) {
                            if (var98.field2736 == null) {
                                field750[var6++] = "";
                            } else {
                                field750[var6++] = var98.field2736;
                            }
                            continue;
                        }
                    } else if (var509 < 3200) {
                        if (var509 == 3100) {
                            var6--;
                            String var100 = field750[var6];
                            class11.method590(0, "", var100);
                            continue;
                        }
                        if (var509 == 3101) {
                            var5 -= 2;
                            client.method146(Statics.field2098, field751[var5], field751[var5 + 1]);
                            continue;
                        }
                        if (var509 == 3103) {
                            client.method13();
                            continue;
                        }
                        if (var509 == 3104) {
                            var6--;
                            String var101 = field750[var6];
                            int var102 = 0;
                            boolean var103 = false;
                            boolean var104 = false;
                            int var105 = 0;
                            int var106 = var101.length();
                            int var107 = 0;
                            boolean var109;
                            while (true) {
                                if (var107 >= var106) {
                                    var109 = var104;
                                    break;
                                }
                                label3432: {
                                    char var108 = var101.charAt(var107);
                                    if (var107 == 0) {
                                        if (var108 == '-') {
                                            var103 = true;
                                            break label3432;
                                        }
                                        if (var108 == '+') {
                                            break label3432;
                                        }
                                    }
                                    int var512;
                                    if (var108 >= '0' && var108 <= '9') {
                                        var512 = var108 - '0';
                                    } else if (var108 >= 'A' && var108 <= 'Z') {
                                        var512 = var108 - '7';
                                    } else {
                                        if (var108 < 'a' || var108 > 'z') {
                                            var109 = false;
                                            break;
                                        }
                                        var512 = var108 - 'W';
                                    }
                                    if (var512 >= 10) {
                                        var109 = false;
                                        break;
                                    }
                                    if (var103) {
                                        var512 = -var512;
                                    }
                                    int var110 = var105 * 10 + var512;
                                    if (var110 / 10 != var105) {
                                        var109 = false;
                                        break;
                                    }
                                    var105 = var110;
                                    var104 = true;
                                }
                                var107++;
                            }
                            if (var109) {
                                var102 = class154.method2589(var101);
                            }
                            client.field284.method2429(156);
                            client.field284.method2148(var102);
                            continue;
                        }
                        if (var509 == 3105) {
                            var6--;
                            String var112 = field750[var6];
                            client.field284.method2429(26);
                            client.field284.method2145(var112.length() + 1);
                            client.field284.method2298(var112);
                            continue;
                        }
                        if (var509 == 3106) {
                            var6--;
                            String var113 = field750[var6];
                            client.field284.method2429(199);
                            client.field284.method2145(var113.length() + 1);
                            client.field284.method2298(var113);
                            continue;
                        }
                        if (var509 == 3107) {
                            var5--;
                            int var114 = field751[var5];
                            var6--;
                            String var115 = field750[var6];
                            boolean var116 = false;
                            for (int var117 = 0; var117 < client.field386; var117++) {
                                class3 var118 = client.field385[client.field482[var117]];
                                if (var118 != null && var118.field49 != null && var118.field49.equalsIgnoreCase(var115)) {
                                    if (var114 == 1) {
                                        client.field284.method2429(49);
                                        client.field284.method2184(0);
                                        client.field284.method2319(client.field482[var117]);
                                    } else if (var114 == 4) {
                                        client.field284.method2429(244);
                                        client.field284.method2281(0);
                                        client.field284.method2191(client.field482[var117]);
                                    } else if (var114 == 6) {
                                        client.field284.method2429(222);
                                        client.field284.method2281(0);
                                        client.field284.method2319(client.field482[var117]);
                                    } else if (var114 == 7) {
                                        client.field284.method2429(68);
                                        client.field284.method2191(client.field482[var117]);
                                        client.field284.method2184(0);
                                    }
                                    var116 = true;
                                    break;
                                }
                            }
                            if (!var116) {
                                class11.method590(4, "", class148.field2372 + var115);
                            }
                            continue;
                        }
                        if (var509 == 3108) {
                            var5 -= 3;
                            int var119 = field751[var5];
                            int var120 = field751[var5 + 1];
                            int var121 = field751[var5 + 2];
                            class164 var122 = class164.method2744(var121);
                            client.method2089(var122, var119, var120);
                            continue;
                        }
                        if (var509 == 3109) {
                            var5 -= 2;
                            int var123 = field751[var5];
                            int var124 = field751[var5 + 1];
                            class164 var125 = var48 ? Statics.field3059 : Statics.field127;
                            client.method2089(var125, var123, var124);
                            continue;
                        }
                        if (var509 == 3110) {
                            var5--;
                            Statics.field213 = field751[var5] == 1;
                            continue;
                        }
                        if (var509 == 3111) {
                            field751[var5++] = Statics.field2828.field135 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3112) {
                            var5--;
                            Statics.field2828.field135 = field751[var5] == 1;
                            class9.method2780();
                            continue;
                        }
                        if (var509 == 3113) {
                            var6--;
                            String var126 = field750[var6];
                            var5--;
                            boolean var127 = field751[var5] == 1;
                            if (!var127) {
                                class130.method861(var126, 3, "openjs");
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var126));
                                    continue;
                                } catch (Exception var507) {
                                }
                            }
                            if (class130.field2051.startsWith("win")) {
                                class130.method861(var126, 0, "openjs");
                            } else if (class130.field2051.startsWith("mac")) {
                                class130.method861(var126, 1, "openjs");
                            } else {
                                class130.method861(var126, 2, "openjs");
                            }
                            continue;
                        }
                        if (var509 == 3115) {
                            var5--;
                            int var129 = field751[var5];
                            client.field284.method2429(106);
                            client.field284.method2319(var129);
                            continue;
                        }
                    } else if (var509 < 3300) {
                        if (var509 == 3200) {
                            var5 -= 3;
                            client.method767(field751[var5], field751[var5 + 1], field751[var5 + 2]);
                            continue;
                        }
                        if (var509 == 3201) {
                            var5--;
                            client.method2971(field751[var5]);
                            continue;
                        }
                        if (var509 == 3202) {
                            var5 -= 2;
                            client.method1444(field751[var5], field751[var5 + 1]);
                            continue;
                        }
                    } else if (var509 < 3400) {
                        if (var509 == 3300) {
                            field751[var5++] = client.field423;
                            continue;
                        }
                        if (var509 == 3301) {
                            var5 -= 2;
                            int var130 = field751[var5];
                            int var131 = field751[var5 + 1];
                            int[] var132 = field751;
                            int var133 = var5++;
                            class15 var134 = (class15) class15.field217.method3357((long) var130);
                            int var135;
                            if (var134 == null) {
                                var135 = -1;
                            } else if (var131 >= 0 && var131 < var134.field215.length) {
                                var135 = var134.field215[var131];
                            } else {
                                var135 = -1;
                            }
                            var132[var133] = var135;
                            continue;
                        }
                        if (var509 == 3302) {
                            var5 -= 2;
                            int var136 = field751[var5];
                            int var137 = field751[var5 + 1];
                            int[] var138 = field751;
                            int var139 = var5++;
                            class15 var140 = (class15) class15.field217.method3357((long) var136);
                            int var141;
                            if (var140 == null) {
                                var141 = 0;
                            } else if (var137 >= 0 && var137 < var140.field210.length) {
                                var141 = var140.field210[var137];
                            } else {
                                var141 = 0;
                            }
                            var138[var139] = var141;
                            continue;
                        }
                        if (var509 == 3303) {
                            var5 -= 2;
                            int var142 = field751[var5];
                            int var143 = field751[var5 + 1];
                            int[] var144 = field751;
                            int var145 = var5++;
                            class15 var146 = (class15) class15.field217.method3357((long) var142);
                            int var147;
                            if (var146 == null) {
                                var147 = 0;
                            } else if (var143 == -1) {
                                var147 = 0;
                            } else {
                                int var148 = 0;
                                for (int var149 = 0; var149 < var146.field210.length; var149++) {
                                    if (var146.field215[var149] == var143) {
                                        var148 += var146.field210[var149];
                                    }
                                }
                                var147 = var148;
                            }
                            var144[var145] = var147;
                            continue;
                        }
                        if (var509 == 3304) {
                            var5--;
                            int var150 = field751[var5];
                            int[] var151 = field751;
                            int var152 = var5++;
                            class46 var153 = (class46) class46.field1037.method3327((long) var150);
                            class46 var154;
                            if (var153 == null) {
                                byte[] var155 = Statics.field1937.method2874(5, var150);
                                class46 var156 = new class46();
                                if (var155 != null) {
                                    var156.method889(new class111(var155));
                                }
                                class46.field1037.method3340(var156, (long) var150);
                                var154 = var156;
                            } else {
                                var154 = var153;
                            }
                            var151[var152] = var154.field1032;
                            continue;
                        }
                        if (var509 == 3305) {
                            var5--;
                            int var157 = field751[var5];
                            field751[var5++] = client.field353[var157];
                            continue;
                        }
                        if (var509 == 3306) {
                            var5--;
                            int var158 = field751[var5];
                            field751[var5++] = client.field302[var158];
                            continue;
                        }
                        if (var509 == 3307) {
                            var5--;
                            int var159 = field751[var5];
                            field751[var5++] = client.field409[var159];
                            continue;
                        }
                        if (var509 == 3308) {
                            int var160 = Statics.field991;
                            int var161 = (Statics.field2098.field802 >> 7) + Statics.field2052;
                            int var162 = (Statics.field2098.field762 >> 7) + Statics.field613;
                            field751[var5++] = (var160 << 28) + (var161 << 14) + var162;
                            continue;
                        }
                        if (var509 == 3309) {
                            var5--;
                            int var163 = field751[var5];
                            field751[var5++] = var163 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var509 == 3310) {
                            var5--;
                            int var164 = field751[var5];
                            field751[var5++] = var164 >> 28;
                            continue;
                        }
                        if (var509 == 3311) {
                            var5--;
                            int var165 = field751[var5];
                            field751[var5++] = var165 & 0x3FFF;
                            continue;
                        }
                        if (var509 == 3312) {
                            field751[var5++] = client.field265 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3313) {
                            var5 -= 2;
                            int var166 = field751[var5] + 32768;
                            int var167 = field751[var5 + 1];
                            int[] var168 = field751;
                            int var169 = var5++;
                            class15 var170 = (class15) class15.field217.method3357((long) var166);
                            int var171;
                            if (var170 == null) {
                                var171 = -1;
                            } else if (var167 >= 0 && var167 < var170.field215.length) {
                                var171 = var170.field215[var167];
                            } else {
                                var171 = -1;
                            }
                            var168[var169] = var171;
                            continue;
                        }
                        if (var509 == 3314) {
                            var5 -= 2;
                            int var172 = field751[var5] + 32768;
                            int var173 = field751[var5 + 1];
                            int[] var174 = field751;
                            int var175 = var5++;
                            class15 var176 = (class15) class15.field217.method3357((long) var172);
                            int var177;
                            if (var176 == null) {
                                var177 = 0;
                            } else if (var173 >= 0 && var173 < var176.field210.length) {
                                var177 = var176.field210[var173];
                            } else {
                                var177 = 0;
                            }
                            var174[var175] = var177;
                            continue;
                        }
                        if (var509 == 3315) {
                            var5 -= 2;
                            int var178 = field751[var5] + 32768;
                            int var179 = field751[var5 + 1];
                            int[] var180 = field751;
                            int var181 = var5++;
                            class15 var182 = (class15) class15.field217.method3357((long) var178);
                            int var183;
                            if (var182 == null) {
                                var183 = 0;
                            } else if (var179 == -1) {
                                var183 = 0;
                            } else {
                                int var184 = 0;
                                for (int var185 = 0; var185 < var182.field210.length; var185++) {
                                    if (var182.field215[var185] == var179) {
                                        var184 += var182.field210[var185];
                                    }
                                }
                                var183 = var184;
                            }
                            var180[var181] = var183;
                            continue;
                        }
                        if (var509 == 3316) {
                            if (client.field434 >= 2) {
                                field751[var5++] = client.field434;
                            } else {
                                field751[var5++] = 0;
                            }
                            continue;
                        }
                        if (var509 == 3317) {
                            field751[var5++] = client.field278;
                            continue;
                        }
                        if (var509 == 3318) {
                            field751[var5++] = client.field261;
                            continue;
                        }
                        if (var509 == 3321) {
                            field751[var5++] = client.field270;
                            continue;
                        }
                        if (var509 == 3322) {
                            field751[var5++] = client.field318;
                            continue;
                        }
                        if (var509 == 3323) {
                            if (client.field436) {
                                field751[var5++] = 1;
                            } else {
                                field751[var5++] = 0;
                            }
                            continue;
                        }
                        if (var509 == 3324) {
                            field751[var5++] = client.field262;
                            continue;
                        }
                    } else if (var509 < 3500) {
                        if (var509 == 3400) {
                            var5 -= 2;
                            int var186 = field751[var5];
                            int var187 = field751[var5 + 1];
                            class45 var188 = Statics.method101(var186);
                            if (var188.field1018 != 's') {
                            }
                            for (int var189 = 0; var189 < var188.field1021; var189++) {
                                if (var188.field1022[var189] == var187) {
                                    field750[var6++] = var188.field1024[var189];
                                    var188 = null;
                                    break;
                                }
                            }
                            if (var188 != null) {
                                field750[var6++] = var188.field1017;
                            }
                            continue;
                        }
                        if (var509 == 3408) {
                            var5 -= 4;
                            int var190 = field751[var5];
                            int var191 = field751[var5 + 1];
                            int var192 = field751[var5 + 2];
                            int var193 = field751[var5 + 3];
                            class45 var194 = (class45) class45.field1016.method3327((long) var192);
                            class45 var195;
                            if (var194 == null) {
                                byte[] var196 = Statics.field1019.method2874(8, var192);
                                class45 var197 = new class45();
                                if (var196 != null) {
                                    var197.method880(new class111(var196));
                                }
                                class45.field1016.method3340(var197, (long) var192);
                                var195 = var197;
                            } else {
                                var195 = var194;
                            }
                            class45 var198 = var195;
                            if (var195.field1029 == var190 && var195.field1018 == var191) {
                                for (int var199 = 0; var199 < var198.field1021; var199++) {
                                    if (var198.field1022[var199] == var193) {
                                        if (var191 == 115) {
                                            field750[var6++] = var198.field1024[var199];
                                        } else {
                                            field751[var5++] = var198.field1023[var199];
                                        }
                                        var198 = null;
                                        break;
                                    }
                                }
                                if (var198 != null) {
                                    if (var191 == 115) {
                                        field750[var6++] = var198.field1017;
                                    } else {
                                        field751[var5++] = var198.field1015;
                                    }
                                }
                                continue;
                            }
                            if (var191 == 115) {
                                field750[var6++] = "null";
                            } else {
                                field751[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var509 < 3700) {
                        if (var509 == 3600) {
                            if (client.field538 == 0) {
                                field751[var5++] = -2;
                            } else if (client.field538 == 1) {
                                field751[var5++] = -1;
                            } else {
                                field751[var5++] = client.field271;
                            }
                            continue;
                        }
                        if (var509 == 3601) {
                            var5--;
                            int var200 = field751[var5];
                            if (client.field538 == 2 && var200 < client.field271) {
                                field750[var6++] = client.field539[var200].field239;
                                field750[var6++] = client.field539[var200].field247;
                                continue;
                            }
                            field750[var6++] = "";
                            field750[var6++] = "";
                            continue;
                        }
                        if (var509 == 3602) {
                            var5--;
                            int var201 = field751[var5];
                            if (client.field538 == 2 && var201 < client.field271) {
                                field751[var5++] = client.field539[var201].field240;
                                continue;
                            }
                            field751[var5++] = 0;
                            continue;
                        }
                        if (var509 == 3603) {
                            var5--;
                            int var202 = field751[var5];
                            if (client.field538 == 2 && var202 < client.field271) {
                                field751[var5++] = client.field539[var202].field241;
                                continue;
                            }
                            field751[var5++] = 0;
                            continue;
                        }
                        if (var509 == 3604) {
                            var6--;
                            String var203 = field750[var6];
                            var5--;
                            int var204 = field751[var5];
                            client.field284.method2429(180);
                            client.field284.method2145(class111.method699(var203) + 1);
                            client.field284.method2298(var203);
                            client.field284.method2184(var204);
                            continue;
                        }
                        if (var509 == 3605) {
                            var6--;
                            String var205 = field750[var6];
                            if (var205 == null) {
                                continue;
                            }
                            if ((client.field271 < 200 || client.field392 == 1) && client.field271 < 400) {
                                String var206 = class155.method2081(var205, Statics.field1455);
                                if (var206 == null) {
                                    continue;
                                }
                                for (int var207 = 0; var207 < client.field271; var207++) {
                                    class17 var208 = client.field539[var207];
                                    String var209 = class155.method2081(var208.field239, Statics.field1455);
                                    if (var209 != null && var209.equals(var206)) {
                                        class11.method590(30, "", var205 + class148.field2390);
                                        continue label3161;
                                    }
                                    if (var208.field247 != null) {
                                        String var210 = class155.method2081(var208.field247, Statics.field1455);
                                        if (var210 != null && var210.equals(var206)) {
                                            class11.method590(30, "", var205 + class148.field2390);
                                            continue label3161;
                                        }
                                    }
                                }
                                for (int var211 = 0; var211 < client.field431; var211++) {
                                    class8 var212 = client.field542[var211];
                                    String var213 = class155.method2081(var212.field123, Statics.field1455);
                                    if (var213 != null && var213.equals(var206)) {
                                        class11.method590(30, "", class148.field2395 + var205 + class148.field2396);
                                        continue label3161;
                                    }
                                    if (var212.field124 != null) {
                                        String var214 = class155.method2081(var212.field124, Statics.field1455);
                                        if (var214 != null && var214.equals(var206)) {
                                            class11.method590(30, "", class148.field2395 + var205 + class148.field2396);
                                            continue label3161;
                                        }
                                    }
                                }
                                if (class155.method2081(Statics.field2098.field49, Statics.field1455).equals(var206)) {
                                    class11.method590(30, "", class148.field2314);
                                } else {
                                    client.field284.method2429(88);
                                    client.field284.method2145(class111.method699(var205));
                                    client.field284.method2298(var205);
                                }
                                continue;
                            }
                            class11.method590(30, "", class148.field2249);
                            continue;
                        }
                        if (var509 == 3606) {
                            var6--;
                            String var215 = field750[var6];
                            if (var215 == null) {
                                continue;
                            }
                            String var216 = class155.method2081(var215, Statics.field1455);
                            if (var216 == null) {
                                continue;
                            }
                            int var217 = 0;
                            while (true) {
                                if (var217 >= client.field271) {
                                    continue label3161;
                                }
                                class17 var218 = client.field539[var217];
                                String var219 = var218.field239;
                                String var220 = class155.method2081(var219, Statics.field1455);
                                boolean var221;
                                if (var215 == null || var219 == null) {
                                    var221 = false;
                                } else if (var215.startsWith("#") || var219.startsWith("#")) {
                                    var221 = var215.equals(var219);
                                } else {
                                    var221 = var216.equals(var220);
                                }
                                if (var221) {
                                    client.field271--;
                                    for (int var222 = var217; var222 < client.field271; var222++) {
                                        client.field539[var222] = client.field539[var222 + 1];
                                    }
                                    client.field460 = client.field521;
                                    client.field284.method2429(73);
                                    client.field284.method2145(class111.method699(var215));
                                    client.field284.method2298(var215);
                                    continue label3161;
                                }
                                var217++;
                            }
                        }
                        if (var509 == 3607) {
                            var6--;
                            String var223 = field750[var6];
                            client.method2746(var223, false);
                            continue;
                        }
                        if (var509 == 3608) {
                            var6--;
                            String var224 = field750[var6];
                            if (var224 == null) {
                                continue;
                            }
                            String var225 = class155.method2081(var224, Statics.field1455);
                            if (var225 == null) {
                                continue;
                            }
                            int var226 = 0;
                            while (true) {
                                if (var226 >= client.field431) {
                                    continue label3161;
                                }
                                class8 var227 = client.field542[var226];
                                String var228 = var227.field123;
                                String var229 = class155.method2081(var228, Statics.field1455);
                                boolean var230;
                                if (var224 == null || var228 == null) {
                                    var230 = false;
                                } else if (var224.startsWith("#") || var228.startsWith("#")) {
                                    var230 = var224.equals(var228);
                                } else {
                                    var230 = var225.equals(var229);
                                }
                                if (var230) {
                                    client.field431--;
                                    for (int var231 = var226; var231 < client.field431; var231++) {
                                        client.field542[var231] = client.field542[var231 + 1];
                                    }
                                    client.field460 = client.field521;
                                    client.field284.method2429(57);
                                    client.field284.method2145(class111.method699(var224));
                                    client.field284.method2298(var224);
                                    continue label3161;
                                }
                                var226++;
                            }
                        }
                        if (var509 == 3609) {
                            var6--;
                            String var232 = field750[var6];
                            class143[] var233 = class143.method864();
                            for (int var234 = 0; var234 < var233.length; var234++) {
                                class143 var235 = var233[var234];
                                if (var235.field2181 != -1 && var232.startsWith(class2.method1058(var235.field2181))) {
                                    var232 = var232.substring(6 + Integer.toString(var235.field2181).length());
                                    break;
                                }
                            }
                            field751[var5++] = client.method491(var232, false) ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3611) {
                            if (client.field497 == null) {
                                field750[var6++] = "";
                            } else {
                                String[] var236 = field750;
                                int var237 = var6++;
                                String var238 = client.field497;
                                String var239 = class153.method2775(class153.method149(var238));
                                if (var239 == null) {
                                    var239 = "";
                                }
                                var236[var237] = var239;
                            }
                            continue;
                        }
                        if (var509 == 3612) {
                            if (client.field497 == null) {
                                field751[var5++] = 0;
                            } else {
                                field751[var5++] = Statics.field168;
                            }
                            continue;
                        }
                        if (var509 == 3613) {
                            var5--;
                            int var241 = field751[var5];
                            if (client.field497 != null && var241 < Statics.field168) {
                                field750[var6++] = Statics.field1800[var241].field599;
                                continue;
                            }
                            field750[var6++] = "";
                            continue;
                        }
                        if (var509 == 3614) {
                            var5--;
                            int var242 = field751[var5];
                            if (client.field497 != null && var242 < Statics.field168) {
                                field751[var5++] = Statics.field1800[var242].field602;
                                continue;
                            }
                            field751[var5++] = 0;
                            continue;
                        }
                        if (var509 == 3615) {
                            var5--;
                            int var243 = field751[var5];
                            if (client.field497 != null && var243 < Statics.field168) {
                                field751[var5++] = Statics.field1800[var243].field597;
                                continue;
                            }
                            field751[var5++] = 0;
                            continue;
                        }
                        if (var509 == 3616) {
                            field751[var5++] = Statics.field2651;
                            continue;
                        }
                        if (var509 == 3617) {
                            var6--;
                            String var244 = field750[var6];
                            client.method148(var244);
                            continue;
                        }
                        if (var509 == 3618) {
                            field751[var5++] = Statics.field2957;
                            continue;
                        }
                        if (var509 == 3619) {
                            var6--;
                            String var245 = field750[var6];
                            if (!var245.equals("")) {
                                client.field284.method2429(82);
                                client.field284.method2145(class111.method699(var245));
                                client.field284.method2298(var245);
                            }
                            continue;
                        }
                        if (var509 == 3620) {
                            client.field284.method2429(82);
                            client.field284.method2145(0);
                            continue;
                        }
                        if (var509 == 3621) {
                            if (client.field538 == 0) {
                                field751[var5++] = -1;
                            } else {
                                field751[var5++] = client.field431;
                            }
                            continue;
                        }
                        if (var509 == 3622) {
                            var5--;
                            int var246 = field751[var5];
                            if (client.field538 != 0 && var246 < client.field431) {
                                field750[var6++] = client.field542[var246].field123;
                                field750[var6++] = client.field542[var246].field124;
                                continue;
                            }
                            field750[var6++] = "";
                            field750[var6++] = "";
                            continue;
                        }
                        if (var509 == 3623) {
                            var6--;
                            String var247 = field750[var6];
                            if (var247.startsWith(class2.method1058(0)) || var247.startsWith(class2.method1058(1))) {
                                var247 = var247.substring(7);
                            }
                            field751[var5++] = client.method2784(var247) ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3624) {
                            var5--;
                            int var248 = field751[var5];
                            if (Statics.field1800 != null && var248 < Statics.field168 && Statics.field1800[var248].field599.equalsIgnoreCase(Statics.field2098.field49)) {
                                field751[var5++] = 1;
                                continue;
                            }
                            field751[var5++] = 0;
                            continue;
                        }
                        if (var509 == 3625) {
                            if (client.field498 == null) {
                                field750[var6++] = "";
                            } else {
                                String[] var249 = field750;
                                int var250 = var6++;
                                String var251 = client.field498;
                                String var252 = class153.method2775(class153.method149(var251));
                                if (var252 == null) {
                                    var252 = "";
                                }
                                var249[var250] = var252;
                            }
                            continue;
                        }
                    } else if (var509 < 4000) {
                        if (var509 == 3903) {
                            var5--;
                            int var254 = field751[var5];
                            field751[var5++] = client.field546[var254].method3575();
                            continue;
                        }
                        if (var509 == 3904) {
                            var5--;
                            int var255 = field751[var5];
                            field751[var5++] = client.field546[var255].field3075;
                            continue;
                        }
                        if (var509 == 3905) {
                            var5--;
                            int var256 = field751[var5];
                            field751[var5++] = client.field546[var256].field3076;
                            continue;
                        }
                        if (var509 == 3906) {
                            var5--;
                            int var257 = field751[var5];
                            field751[var5++] = client.field546[var257].field3074;
                            continue;
                        }
                        if (var509 == 3907) {
                            var5--;
                            int var258 = field751[var5];
                            field751[var5++] = client.field546[var258].field3071;
                            continue;
                        }
                        if (var509 == 3908) {
                            var5--;
                            int var259 = field751[var5];
                            field751[var5++] = client.field546[var259].field3072;
                            continue;
                        }
                        if (var509 == 3910) {
                            var5--;
                            int var260 = field751[var5];
                            int var261 = client.field546[var260].method3595();
                            field751[var5++] = var261 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3911) {
                            var5--;
                            int var262 = field751[var5];
                            int var263 = client.field546[var262].method3595();
                            field751[var5++] = var263 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3912) {
                            var5--;
                            int var264 = field751[var5];
                            int var265 = client.field546[var264].method3595();
                            field751[var5++] = var265 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3913) {
                            var5--;
                            int var266 = field751[var5];
                            int var267 = client.field546[var266].method3595();
                            field751[var5++] = var267 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3914) {
                            var5--;
                            boolean var268 = field751[var5] == 1;
                            if (Statics.field674 != null) {
                                Statics.field674.method3597(class212.field3080, var268);
                            }
                            continue;
                        }
                        if (var509 == 3915) {
                            var5--;
                            boolean var269 = field751[var5] == 1;
                            if (Statics.field674 != null) {
                                Statics.field674.method3597(class212.field3079, var269);
                            }
                            continue;
                        }
                        if (var509 == 3916) {
                            var5 -= 2;
                            boolean var270 = field751[var5] == 1;
                            boolean var271 = field751[var5 + 1] == 1;
                            if (Statics.field674 != null) {
                                Statics.field674.method3597(new class21(var271), var270);
                            }
                            continue;
                        }
                        if (var509 == 3917) {
                            var5--;
                            boolean var272 = field751[var5] == 1;
                            if (Statics.field674 != null) {
                                Statics.field674.method3597(class212.field3078, var272);
                            }
                            continue;
                        }
                        if (var509 == 3918) {
                            var5--;
                            boolean var273 = field751[var5] == 1;
                            if (Statics.field674 != null) {
                                Statics.field674.method3597(class212.field3081, var273);
                            }
                            continue;
                        }
                        if (var509 == 3919) {
                            field751[var5++] = Statics.field674 == null ? 0 : Statics.field674.field3077.size();
                            continue;
                        }
                        if (var509 == 3920) {
                            var5--;
                            int var274 = field751[var5];
                            class205 var275 = (class205) Statics.field674.field3077.get(var274);
                            field751[var5++] = var275.field3056;
                            continue;
                        }
                        if (var509 == 3921) {
                            var5--;
                            int var276 = field751[var5];
                            class205 var277 = (class205) Statics.field674.field3077.get(var276);
                            field750[var6++] = var277.method3526();
                            continue;
                        }
                        if (var509 == 3922) {
                            var5--;
                            int var278 = field751[var5];
                            class205 var279 = (class205) Statics.field674.field3077.get(var278);
                            field750[var6++] = var279.method3519();
                            continue;
                        }
                        if (var509 == 3923) {
                            var5--;
                            int var280 = field751[var5];
                            class205 var281 = (class205) Statics.field674.field3077.get(var280);
                            long var282 = class107.method78() - Statics.field614 - var281.field3055;
                            int var284 = (int) (var282 / 3600000L);
                            int var285 = (int) ((var282 - (long) (var284 * 3600000)) / 60000L);
                            int var286 = (int) ((var282 - (long) (var284 * 3600000) - (long) (var285 * 60000)) / 1000L);
                            String var287 = var284 + ":" + var285 / 10 + var285 % 10 + ":" + var286 / 10 + var286 % 10;
                            field750[var6++] = var287;
                            continue;
                        }
                        if (var509 == 3924) {
                            var5--;
                            int var288 = field751[var5];
                            class205 var289 = (class205) Statics.field674.field3077.get(var288);
                            field751[var5++] = var289.field3054.field3074;
                            continue;
                        }
                        if (var509 == 3925) {
                            var5--;
                            int var290 = field751[var5];
                            class205 var291 = (class205) Statics.field674.field3077.get(var290);
                            field751[var5++] = var291.field3054.field3076;
                            continue;
                        }
                        if (var509 == 3926) {
                            var5--;
                            int var292 = field751[var5];
                            class205 var293 = (class205) Statics.field674.field3077.get(var292);
                            field751[var5++] = var293.field3054.field3075;
                            continue;
                        }
                    } else if (var509 < 4100) {
                        if (var509 == 4000) {
                            var5 -= 2;
                            int var294 = field751[var5];
                            int var295 = field751[var5 + 1];
                            field751[var5++] = var294 + var295;
                            continue;
                        }
                        if (var509 == 4001) {
                            var5 -= 2;
                            int var296 = field751[var5];
                            int var297 = field751[var5 + 1];
                            field751[var5++] = var296 - var297;
                            continue;
                        }
                        if (var509 == 4002) {
                            var5 -= 2;
                            int var298 = field751[var5];
                            int var299 = field751[var5 + 1];
                            field751[var5++] = var298 * var299;
                            continue;
                        }
                        if (var509 == 4003) {
                            var5 -= 2;
                            int var300 = field751[var5];
                            int var301 = field751[var5 + 1];
                            field751[var5++] = var300 / var301;
                            continue;
                        }
                        if (var509 == 4004) {
                            var5--;
                            int var302 = field751[var5];
                            field751[var5++] = (int) (Math.random() * (double) var302);
                            continue;
                        }
                        if (var509 == 4005) {
                            var5--;
                            int var303 = field751[var5];
                            field751[var5++] = (int) (Math.random() * (double) (var303 + 1));
                            continue;
                        }
                        if (var509 == 4006) {
                            var5 -= 5;
                            int var304 = field751[var5];
                            int var305 = field751[var5 + 1];
                            int var306 = field751[var5 + 2];
                            int var307 = field751[var5 + 3];
                            int var308 = field751[var5 + 4];
                            field751[var5++] = (var305 - var304) * (var308 - var306) / (var307 - var306) + var304;
                            continue;
                        }
                        if (var509 == 4007) {
                            var5 -= 2;
                            int var309 = field751[var5];
                            int var310 = field751[var5 + 1];
                            field751[var5++] = var309 * var310 / 100 + var309;
                            continue;
                        }
                        if (var509 == 4008) {
                            var5 -= 2;
                            int var311 = field751[var5];
                            int var312 = field751[var5 + 1];
                            field751[var5++] = var311 | 0x1 << var312;
                            continue;
                        }
                        if (var509 == 4009) {
                            var5 -= 2;
                            int var313 = field751[var5];
                            int var314 = field751[var5 + 1];
                            field751[var5++] = var313 & -1 - (0x1 << var314);
                            continue;
                        }
                        if (var509 == 4010) {
                            var5 -= 2;
                            int var315 = field751[var5];
                            int var316 = field751[var5 + 1];
                            field751[var5++] = (var315 & 0x1 << var316) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var509 == 4011) {
                            var5 -= 2;
                            int var317 = field751[var5];
                            int var318 = field751[var5 + 1];
                            field751[var5++] = var317 % var318;
                            continue;
                        }
                        if (var509 == 4012) {
                            var5 -= 2;
                            int var319 = field751[var5];
                            int var320 = field751[var5 + 1];
                            if (var319 == 0) {
                                field751[var5++] = 0;
                            } else {
                                field751[var5++] = (int) Math.pow((double) var319, (double) var320);
                            }
                            continue;
                        }
                        if (var509 == 4013) {
                            var5 -= 2;
                            int var321 = field751[var5];
                            int var322 = field751[var5 + 1];
                            if (var321 == 0) {
                                field751[var5++] = 0;
                            } else if (var322 == 0) {
                                field751[var5++] = Integer.MAX_VALUE;
                            } else {
                                field751[var5++] = (int) Math.pow((double) var321, 1.0D / (double) var322);
                            }
                            continue;
                        }
                        if (var509 == 4014) {
                            var5 -= 2;
                            int var323 = field751[var5];
                            int var324 = field751[var5 + 1];
                            field751[var5++] = var323 & var324;
                            continue;
                        }
                        if (var509 == 4015) {
                            var5 -= 2;
                            int var325 = field751[var5];
                            int var326 = field751[var5 + 1];
                            field751[var5++] = var325 | var326;
                            continue;
                        }
                    } else if (var509 < 4200) {
                        if (var509 == 4100) {
                            var6--;
                            String var327 = field750[var6];
                            var5--;
                            int var328 = field751[var5];
                            field750[var6++] = var327 + var328;
                            continue;
                        }
                        if (var509 == 4101) {
                            var6 -= 2;
                            String var329 = field750[var6];
                            String var330 = field750[var6 + 1];
                            field750[var6++] = var329 + var330;
                            continue;
                        }
                        if (var509 == 4102) {
                            var6--;
                            String var331 = field750[var6];
                            var5--;
                            int var332 = field751[var5];
                            field750[var6++] = var331 + Statics.method593(var332, true);
                            continue;
                        }
                        if (var509 == 4103) {
                            var6--;
                            String var333 = field750[var6];
                            field750[var6++] = var333.toLowerCase();
                            continue;
                        }
                        if (var509 == 4104) {
                            var5--;
                            int var334 = field751[var5];
                            long var335 = ((long) var334 + 11745L) * 86400000L;
                            field753.setTime(new Date(var335));
                            int var337 = field753.get(5);
                            int var338 = field753.get(2);
                            int var339 = field753.get(1);
                            field750[var6++] = var337 + "-" + field754[var338] + "-" + var339;
                            continue;
                        }
                        if (var509 == 4105) {
                            var6 -= 2;
                            String var340 = field750[var6];
                            String var341 = field750[var6 + 1];
                            if (Statics.field2098.field36 != null && Statics.field2098.field36.field2831) {
                                field750[var6++] = var341;
                                continue;
                            }
                            field750[var6++] = var340;
                            continue;
                        }
                        if (var509 == 4106) {
                            var5--;
                            int var342 = field751[var5];
                            field750[var6++] = Integer.toString(var342);
                            continue;
                        }
                        if (var509 == 4107) {
                            var6 -= 2;
                            int[] var343 = field751;
                            int var344 = var5++;
                            String var345 = field750[var6];
                            String var346 = field750[var6 + 1];
                            int var347 = client.field492;
                            int var348 = var345.length();
                            int var349 = var346.length();
                            int var350 = 0;
                            int var351 = 0;
                            byte var352 = 0;
                            byte var353 = 0;
                            int var354;
                            label2910: while (true) {
                                if (var350 - var352 >= var348 && var351 - var353 >= var349) {
                                    int var365 = Math.min(var348, var349);
                                    for (int var366 = 0; var366 < var365; var366++) {
                                        char var369 = var345.charAt(var366);
                                        char var370 = var346.charAt(var366);
                                        if (var369 != var370 && Character.toUpperCase(var369) != Character.toUpperCase(var370)) {
                                            char var371 = Character.toLowerCase(var369);
                                            char var372 = Character.toLowerCase(var370);
                                            if (var371 != var372) {
                                                var354 = class157.method2564(var371, var347) - class157.method2564(var372, var347);
                                                break label2910;
                                            }
                                        }
                                    }
                                    int var373 = var348 - var349;
                                    if (var373 == 0) {
                                        for (int var374 = 0; var374 < var365; var374++) {
                                            char var375 = var345.charAt(var374);
                                            char var376 = var346.charAt(var374);
                                            if (var375 != var376) {
                                                var354 = class157.method2564(var375, var347) - class157.method2564(var376, var347);
                                                break label2910;
                                            }
                                        }
                                        var354 = 0;
                                    } else {
                                        var354 = var373;
                                    }
                                    break;
                                }
                                if (var350 - var352 >= var348) {
                                    var354 = -1;
                                    break;
                                }
                                if (var351 - var353 >= var349) {
                                    var354 = 1;
                                    break;
                                }
                                char var355;
                                if (var352 == 0) {
                                    var355 = var345.charAt(var350++);
                                } else {
                                    var355 = (char) var352;
                                    boolean var356 = false;
                                }
                                char var357;
                                if (var353 == 0) {
                                    var357 = var346.charAt(var351++);
                                } else {
                                    var357 = (char) var353;
                                    boolean var358 = false;
                                }
                                byte var359;
                                if (var355 == 198) {
                                    var359 = 69;
                                } else if (var355 == 230) {
                                    var359 = 101;
                                } else if (var355 == 223) {
                                    var359 = 115;
                                } else if (var355 == 338) {
                                    var359 = 69;
                                } else if (var355 == 339) {
                                    var359 = 101;
                                } else {
                                    var359 = 0;
                                }
                                var352 = var359;
                                byte var360;
                                if (var357 == 198) {
                                    var360 = 69;
                                } else if (var357 == 230) {
                                    var360 = 101;
                                } else if (var357 == 223) {
                                    var360 = 115;
                                } else if (var357 == 338) {
                                    var360 = 69;
                                } else if (var357 == 339) {
                                    var360 = 101;
                                } else {
                                    var360 = 0;
                                }
                                var353 = var360;
                                char var361 = class157.method599(var355, var347);
                                char var362 = class157.method599(var357, var347);
                                if (var361 != var362 && Character.toUpperCase(var361) != Character.toUpperCase(var362)) {
                                    char var363 = Character.toLowerCase(var361);
                                    char var364 = Character.toLowerCase(var362);
                                    if (var363 != var364) {
                                        var354 = class157.method2564(var363, var347) - class157.method2564(var364, var347);
                                        break;
                                    }
                                }
                            }
                            var343[var344] = class154.method2778(var354);
                            continue;
                        }
                        if (var509 == 4108) {
                            var6--;
                            String var377 = field750[var6];
                            var5 -= 2;
                            int var378 = field751[var5];
                            int var379 = field751[var5 + 1];
                            byte[] var380 = Statics.field657.method2874(var379, 0);
                            class215 var381 = new class215(var380);
                            field751[var5++] = var381.method3614(var377, var378);
                            continue;
                        }
                        if (var509 == 4109) {
                            var6--;
                            String var382 = field750[var6];
                            var5 -= 2;
                            int var383 = field751[var5];
                            int var384 = field751[var5 + 1];
                            byte[] var385 = Statics.field657.method2874(var384, 0);
                            class215 var386 = new class215(var385);
                            field751[var5++] = var386.method3613(var382, var383);
                            continue;
                        }
                        if (var509 == 4110) {
                            var6 -= 2;
                            String var387 = field750[var6];
                            String var388 = field750[var6 + 1];
                            var5--;
                            if (field751[var5] == 1) {
                                field750[var6++] = var387;
                            } else {
                                field750[var6++] = var388;
                            }
                            continue;
                        }
                        if (var509 == 4111) {
                            var6--;
                            String var389 = field750[var6];
                            field750[var6++] = class214.method3615(var389);
                            continue;
                        }
                        if (var509 == 4112) {
                            var6--;
                            String var390 = field750[var6];
                            var5--;
                            int var391 = field751[var5];
                            field750[var6++] = var390 + (char) var391;
                            continue;
                        }
                        if (var509 == 4113) {
                            var5--;
                            int var392 = field751[var5];
                            int[] var393 = field751;
                            int var394 = var5++;
                            char var395 = (char) var392;
                            boolean var396;
                            if (var395 >= ' ' && var395 <= '~') {
                                var396 = true;
                            } else if (var395 >= 160 && var395 <= 255) {
                                var396 = true;
                            } else if (var395 == 8364 || var395 == 338 || var395 == 8212 || var395 == 339 || var395 == 376) {
                                var396 = true;
                            } else {
                                var396 = false;
                            }
                            var393[var394] = var396 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 4114) {
                            var5--;
                            int var397 = field751[var5];
                            int[] var398 = field751;
                            int var399 = var5++;
                            char var400 = (char) var397;
                            boolean var401 = var400 >= '0' && var400 <= '9' || var400 >= 'A' && var400 <= 'Z' || var400 >= 'a' && var400 <= 'z';
                            var398[var399] = var401 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 4115) {
                            var5--;
                            int var402 = field751[var5];
                            field751[var5++] = class154.method692((char) var402) ? 1 : 0;
                            continue;
                        }
                        if (var509 == 4116) {
                            var5--;
                            int var403 = field751[var5];
                            int[] var404 = field751;
                            int var405 = var5++;
                            char var406 = (char) var403;
                            boolean var407 = var406 >= '0' && var406 <= '9';
                            var404[var405] = var407 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 4117) {
                            var6--;
                            String var408 = field750[var6];
                            if (var408 == null) {
                                field751[var5++] = 0;
                            } else {
                                field751[var5++] = var408.length();
                            }
                            continue;
                        }
                        if (var509 == 4118) {
                            var6--;
                            String var409 = field750[var6];
                            var5 -= 2;
                            int var410 = field751[var5];
                            int var411 = field751[var5 + 1];
                            field750[var6++] = var409.substring(var410, var411);
                            continue;
                        }
                        if (var509 == 4119) {
                            var6--;
                            String var412 = field750[var6];
                            StringBuilder var413 = new StringBuilder(var412.length());
                            boolean var414 = false;
                            for (int var415 = 0; var415 < var412.length(); var415++) {
                                char var416 = var412.charAt(var415);
                                if (var416 == '<') {
                                    var414 = true;
                                } else if (var416 == '>') {
                                    var414 = false;
                                } else if (!var414) {
                                    var413.append(var416);
                                }
                            }
                            field750[var6++] = var413.toString();
                            continue;
                        }
                        if (var509 == 4120) {
                            var6--;
                            String var417 = field750[var6];
                            var5--;
                            int var418 = field751[var5];
                            field751[var5++] = var417.indexOf(var418);
                            continue;
                        }
                        if (var509 == 4121) {
                            var6 -= 2;
                            String var419 = field750[var6];
                            String var420 = field750[var6 + 1];
                            var5--;
                            int var421 = field751[var5];
                            field751[var5++] = var419.indexOf(var420, var421);
                            continue;
                        }
                    } else if (var509 < 4300) {
                        if (var509 == 4200) {
                            var5--;
                            int var422 = field751[var5];
                            field750[var6++] = class47.method859(var422).field1049;
                            continue;
                        }
                        if (var509 == 4201) {
                            var5 -= 2;
                            int var423 = field751[var5];
                            int var424 = field751[var5 + 1];
                            class47 var425 = class47.method859(var423);
                            if (var424 >= 1 && var424 <= 5 && var425.field1064[var424 - 1] != null) {
                                field750[var6++] = var425.field1064[var424 - 1];
                                continue;
                            }
                            field750[var6++] = "";
                            continue;
                        }
                        if (var509 == 4202) {
                            var5 -= 2;
                            int var426 = field751[var5];
                            int var427 = field751[var5 + 1];
                            class47 var428 = class47.method859(var426);
                            if (var427 >= 1 && var427 <= 5 && var428.field1058[var427 - 1] != null) {
                                field750[var6++] = var428.field1058[var427 - 1];
                                continue;
                            }
                            field750[var6++] = "";
                            continue;
                        }
                        if (var509 == 4203) {
                            var5--;
                            int var429 = field751[var5];
                            field751[var5++] = class47.method859(var429).field1061;
                            continue;
                        }
                        if (var509 == 4204) {
                            var5--;
                            int var430 = field751[var5];
                            field751[var5++] = class47.method859(var430).field1060 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 4205) {
                            var5--;
                            int var431 = field751[var5];
                            class47 var432 = class47.method859(var431);
                            if (var432.field1054 == -1 && var432.field1079 >= 0) {
                                field751[var5++] = var432.field1079;
                                continue;
                            }
                            field751[var5++] = var431;
                            continue;
                        }
                        if (var509 == 4206) {
                            var5--;
                            int var433 = field751[var5];
                            class47 var434 = class47.method859(var433);
                            if (var434.field1054 >= 0 && var434.field1079 >= 0) {
                                field751[var5++] = var434.field1079;
                                continue;
                            }
                            field751[var5++] = var433;
                            continue;
                        }
                        if (var509 == 4207) {
                            var5--;
                            int var435 = field751[var5];
                            field751[var5++] = class47.method859(var435).field1062 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 4210) {
                            var6--;
                            String var436 = field750[var6];
                            var5--;
                            int var437 = field751[var5];
                            boolean var439 = var437 == 1;
                            String var440 = var436.toLowerCase();
                            short[] var441 = new short[16];
                            int var442 = 0;
                            int var443 = 0;
                            while (true) {
                                if (var443 >= Statics.field716) {
                                    Statics.field128 = var441;
                                    Statics.field1876 = 0;
                                    Statics.field1151 = var442;
                                    String[] var447 = new String[Statics.field1151];
                                    for (int var448 = 0; var448 < Statics.field1151; var448++) {
                                        var447[var448] = class47.method859(var441[var448]).field1049;
                                    }
                                    class116.method2779(var447, Statics.field128);
                                    break;
                                }
                                class47 var444 = class47.method859(var443);
                                if ((!var439 || var444.field1087) && var444.field1054 == -1 && var444.field1049.toLowerCase().indexOf(var440) != -1) {
                                    if (var442 >= 250) {
                                        Statics.field1151 = -1;
                                        Statics.field128 = null;
                                        break;
                                    }
                                    if (var442 >= var441.length) {
                                        short[] var445 = new short[var441.length * 2];
                                        for (int var446 = 0; var446 < var442; var446++) {
                                            var445[var446] = var441[var446];
                                        }
                                        var441 = var445;
                                    }
                                    var441[var442++] = (short) var443;
                                }
                                var443++;
                            }
                            field751[var5++] = Statics.field1151;
                            continue;
                        }
                        if (var509 == 4211) {
                            if (Statics.field128 != null && Statics.field1876 < Statics.field1151) {
                                field751[var5++] = Statics.field128[++Statics.field1876 - 1] & 0xFFFF;
                                continue;
                            }
                            field751[var5++] = -1;
                            continue;
                        }
                        if (var509 == 4212) {
                            Statics.field1876 = 0;
                            continue;
                        }
                    } else if (var509 < 5100) {
                        if (var509 == 5000) {
                            field751[var5++] = client.field488;
                            continue;
                        }
                        if (var509 == 5001) {
                            var5 -= 3;
                            client.field488 = field751[var5];
                            Statics.field2628 = class122.method2486(field751[var5 + 1]);
                            if (Statics.field2628 == null) {
                                Statics.field2628 = class122.field1966;
                            }
                            client.field405 = field751[var5 + 2];
                            client.field284.method2429(201);
                            client.field284.method2145(client.field488);
                            client.field284.method2145(Statics.field2628.field1975);
                            client.field284.method2145(client.field405);
                            continue;
                        }
                        if (var509 == 5002) {
                            var6--;
                            String var449 = field750[var6];
                            var5 -= 2;
                            int var450 = field751[var5];
                            int var451 = field751[var5 + 1];
                            client.field284.method2429(32);
                            client.field284.method2145(class111.method699(var449) + 2);
                            client.field284.method2298(var449);
                            client.field284.method2145(var450 - 1);
                            client.field284.method2145(var451);
                            continue;
                        }
                        if (var509 == 5003) {
                            var5 -= 2;
                            int var452 = field751[var5];
                            int var453 = field751[var5 + 1];
                            class26 var454 = (class26) class11.field162.get(var452);
                            class33 var455 = var454.method579(var453);
                            if (var455 == null) {
                                field751[var5++] = -1;
                                field751[var5++] = 0;
                                field750[var6++] = "";
                                field750[var6++] = "";
                                field750[var6++] = "";
                            } else {
                                field751[var5++] = var455.field734;
                                field751[var5++] = var455.field732;
                                field750[var6++] = var455.field735 == null ? "" : var455.field735;
                                field750[var6++] = var455.field736 == null ? "" : var455.field736;
                                field750[var6++] = var455.field738 == null ? "" : var455.field738;
                            }
                            continue;
                        }
                        if (var509 == 5004) {
                            var5--;
                            int var457 = field751[var5];
                            class33 var458 = class11.method4(var457);
                            if (var458 == null) {
                                field751[var5++] = -1;
                                field751[var5++] = 0;
                                field750[var6++] = "";
                                field750[var6++] = "";
                                field750[var6++] = "";
                            } else {
                                field751[var5++] = var458.field733;
                                field751[var5++] = var458.field732;
                                field750[var6++] = var458.field735 == null ? "" : var458.field735;
                                field750[var6++] = var458.field736 == null ? "" : var458.field736;
                                field750[var6++] = var458.field738 == null ? "" : var458.field738;
                            }
                            continue;
                        }
                        if (var509 == 5005) {
                            if (Statics.field2628 == null) {
                                field751[var5++] = -1;
                            } else {
                                field751[var5++] = Statics.field2628.field1975;
                            }
                            continue;
                        }
                        if (var509 == 5008) {
                            var6--;
                            String var459 = field750[var6];
                            var5--;
                            int var460 = field751[var5];
                            String var461 = var459.toLowerCase();
                            byte var462 = 0;
                            if (var461.startsWith(class148.field2399)) {
                                var462 = 0;
                                var459 = var459.substring(class148.field2399.length());
                            } else if (var461.startsWith(class148.field2401)) {
                                var462 = 1;
                                var459 = var459.substring(class148.field2401.length());
                            } else if (var461.startsWith(class148.field2403)) {
                                var462 = 2;
                                var459 = var459.substring(class148.field2403.length());
                            } else if (var461.startsWith(class148.field2405)) {
                                var462 = 3;
                                var459 = var459.substring(class148.field2405.length());
                            } else if (var461.startsWith(class148.field2407)) {
                                var462 = 4;
                                var459 = var459.substring(class148.field2407.length());
                            } else if (var461.startsWith(class148.field2376)) {
                                var462 = 5;
                                var459 = var459.substring(class148.field2376.length());
                            } else if (var461.startsWith(class148.field2411)) {
                                var462 = 6;
                                var459 = var459.substring(class148.field2411.length());
                            } else if (var461.startsWith(class148.field2413)) {
                                var462 = 7;
                                var459 = var459.substring(class148.field2413.length());
                            } else if (var461.startsWith(class148.field2240)) {
                                var462 = 8;
                                var459 = var459.substring(class148.field2240.length());
                            } else if (var461.startsWith(class148.field2417)) {
                                var462 = 9;
                                var459 = var459.substring(class148.field2417.length());
                            } else if (var461.startsWith(class148.field2338)) {
                                var462 = 10;
                                var459 = var459.substring(class148.field2338.length());
                            } else if (var461.startsWith(class148.field2421)) {
                                var462 = 11;
                                var459 = var459.substring(class148.field2421.length());
                            } else if (client.field492 != 0) {
                                if (var461.startsWith(class148.field2476)) {
                                    var462 = 0;
                                    var459 = var459.substring(class148.field2476.length());
                                } else if (var461.startsWith(class148.field2442)) {
                                    var462 = 1;
                                    var459 = var459.substring(class148.field2442.length());
                                } else if (var461.startsWith(class148.field2412)) {
                                    var462 = 2;
                                    var459 = var459.substring(class148.field2412.length());
                                } else if (var461.startsWith(class148.field2406)) {
                                    var462 = 3;
                                    var459 = var459.substring(class148.field2406.length());
                                } else if (var461.startsWith(class148.field2364)) {
                                    var462 = 4;
                                    var459 = var459.substring(class148.field2364.length());
                                } else if (var461.startsWith(class148.field2410)) {
                                    var462 = 5;
                                    var459 = var459.substring(class148.field2410.length());
                                } else if (var461.startsWith(class148.field2352)) {
                                    var462 = 6;
                                    var459 = var459.substring(class148.field2352.length());
                                } else if (var461.startsWith(class148.field2341)) {
                                    var462 = 7;
                                    var459 = var459.substring(class148.field2341.length());
                                } else if (var461.startsWith(class148.field2463)) {
                                    var462 = 8;
                                    var459 = var459.substring(class148.field2463.length());
                                } else if (var461.startsWith(class148.field2418)) {
                                    var462 = 9;
                                    var459 = var459.substring(class148.field2418.length());
                                } else if (var461.startsWith(class148.field2420)) {
                                    var462 = 10;
                                    var459 = var459.substring(class148.field2420.length());
                                } else if (var461.startsWith(class148.field2422)) {
                                    var462 = 11;
                                    var459 = var459.substring(class148.field2422.length());
                                }
                            }
                            String var463 = var459.toLowerCase();
                            byte var464 = 0;
                            if (var463.startsWith(class148.field2423)) {
                                var464 = 1;
                                var459 = var459.substring(class148.field2423.length());
                            } else if (var463.startsWith(class148.field2391)) {
                                var464 = 2;
                                var459 = var459.substring(class148.field2391.length());
                            } else if (var463.startsWith(class148.field2427)) {
                                var464 = 3;
                                var459 = var459.substring(class148.field2427.length());
                            } else if (var463.startsWith(class148.field2429)) {
                                var464 = 4;
                                var459 = var459.substring(class148.field2429.length());
                            } else if (var463.startsWith(class148.field2431)) {
                                var464 = 5;
                                var459 = var459.substring(class148.field2431.length());
                            } else if (client.field492 != 0) {
                                if (var463.startsWith(class148.field2234)) {
                                    var464 = 1;
                                    var459 = var459.substring(class148.field2234.length());
                                } else if (var463.startsWith(class148.field2426)) {
                                    var464 = 2;
                                    var459 = var459.substring(class148.field2426.length());
                                } else if (var463.startsWith(class148.field2252)) {
                                    var464 = 3;
                                    var459 = var459.substring(class148.field2252.length());
                                } else if (var463.startsWith(class148.field2430)) {
                                    var464 = 4;
                                    var459 = var459.substring(class148.field2430.length());
                                } else if (var463.startsWith(class148.field2237)) {
                                    var464 = 5;
                                    var459 = var459.substring(class148.field2237.length());
                                }
                            }
                            client.field284.method2429(216);
                            client.field284.method2145(0);
                            int var465 = client.field284.field1902;
                            client.field284.method2145(var460);
                            client.field284.method2145(var462);
                            client.field284.method2145(var464);
                            class213.method2794(client.field284, var459);
                            client.field284.method2157(client.field284.field1902 - var465);
                            continue;
                        }
                        if (var509 == 5009) {
                            var6 -= 2;
                            String var466 = field750[var6];
                            String var467 = field750[var6 + 1];
                            client.field284.method2429(205);
                            client.field284.method2319(0);
                            int var468 = client.field284.field1902;
                            client.field284.method2298(var466);
                            class213.method2794(client.field284, var467);
                            client.field284.method2156(client.field284.field1902 - var468);
                            continue;
                        }
                        if (var509 == 5015) {
                            String var469;
                            if (Statics.field2098 == null || Statics.field2098.field49 == null) {
                                var469 = "";
                            } else {
                                var469 = Statics.field2098.field49;
                            }
                            field750[var6++] = var469;
                            continue;
                        }
                        if (var509 == 5016) {
                            field751[var5++] = client.field405;
                            continue;
                        }
                        if (var509 == 5017) {
                            var5--;
                            int var470 = field751[var5];
                            int[] var471 = field751;
                            int var472 = var5++;
                            class26 var473 = (class26) class11.field162.get(var470);
                            int var474;
                            if (var473 == null) {
                                var474 = 0;
                            } else {
                                var474 = var473.method580();
                            }
                            var471[var472] = var474;
                            continue;
                        }
                        if (var509 == 5018) {
                            var5--;
                            int var475 = field751[var5];
                            int[] var476 = field751;
                            int var477 = var5++;
                            class33 var478 = (class33) class11.field163.method3375((long) var475);
                            int var479;
                            if (var478 == null) {
                                var479 = -1;
                            } else if (class11.field167.field3010 == var478.field3014) {
                                var479 = -1;
                            } else {
                                var479 = ((class33) var478.field3014).field734;
                            }
                            var476[var477] = var479;
                            continue;
                        }
                        if (var509 == 5019) {
                            var5--;
                            int var480 = field751[var5];
                            int[] var481 = field751;
                            int var482 = var5++;
                            class33 var483 = (class33) class11.field163.method3375((long) var480);
                            int var484;
                            if (var483 == null) {
                                var484 = -1;
                            } else if (class11.field167.field3010 == var483.field3015) {
                                var484 = -1;
                            } else {
                                var484 = ((class33) var483.field3015).field734;
                            }
                            var481[var482] = var484;
                            continue;
                        }
                        if (var509 == 5020) {
                            var6--;
                            String var485 = field750[var6];
                            client.method2079(var485);
                            continue;
                        }
                        if (var509 == 5021) {
                            var6--;
                            client.field490 = field750[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var509 == 5022) {
                            field750[var6++] = client.field490;
                            continue;
                        }
                    }
                }
                if (var509 < 5400) {
                    if (var509 == 5306) {
                        field751[var5++] = client.method596();
                        continue;
                    }
                    if (var509 == 5307) {
                        var5--;
                        int var486 = field751[var5];
                        if (var486 != 1 && var486 != 2) {
                            continue;
                        }
                        client.field371 = 0L;
                        if (var486 >= 2) {
                            client.field483 = true;
                        } else {
                            client.field483 = false;
                        }
                        client.method2465();
                        if (client.field269 >= 25) {
                            client.method1805();
                        }
                        class136.field2126 = true;
                        continue;
                    }
                    if (var509 == 5308) {
                        field751[var5++] = Statics.field2828.field137;
                        continue;
                    }
                    if (var509 == 5309) {
                        var5--;
                        int var487 = field751[var5];
                        if (var487 == 1 || var487 == 2) {
                            Statics.field2828.field137 = var487;
                            class9.method2780();
                        }
                        continue;
                    }
                }
                if (var509 < 5600 && var509 == 5504) {
                    var5 -= 2;
                    int var488 = field751[var5];
                    int var489 = field751[var5 + 1];
                    if (!client.field518) {
                        client.field349 = var488;
                        client.field350 = var489;
                    }
                } else if (var509 < 5700 && var509 == 5630) {
                    client.field428 = 250;
                } else {
                    if (var509 < 6300) {
                        if (var509 == 6200) {
                            var5 -= 2;
                            client.field470 = (short) field751[var5];
                            if (client.field470 <= 0) {
                                client.field470 = 256;
                            }
                            client.field525 = (short) field751[var5 + 1];
                            if (client.field525 <= 0) {
                                client.field525 = 205;
                            }
                            continue;
                        }
                        if (var509 == 6201) {
                            var5 -= 2;
                            client.field526 = (short) field751[var5];
                            if (client.field526 <= 0) {
                                client.field526 = 256;
                            }
                            client.field527 = (short) field751[var5 + 1];
                            if (client.field527 <= 0) {
                                client.field527 = 320;
                            }
                            continue;
                        }
                        if (var509 == 6202) {
                            var5 -= 4;
                            client.field528 = (short) field751[var5];
                            if (client.field528 <= 0) {
                                client.field528 = 1;
                            }
                            client.field529 = (short) field751[var5 + 1];
                            if (client.field529 <= 0) {
                                client.field529 = 32767;
                            } else if (client.field529 < client.field528) {
                                client.field529 = client.field528;
                            }
                            client.field327 = (short) field751[var5 + 2];
                            if (client.field327 <= 0) {
                                client.field327 = 1;
                            }
                            client.field531 = (short) field751[var5 + 3];
                            if (client.field531 <= 0) {
                                client.field531 = 32767;
                            } else if (client.field531 < client.field327) {
                                client.field531 = client.field327;
                            }
                            continue;
                        }
                        if (var509 == 6203) {
                            if (client.field439 == null) {
                                field751[var5++] = -1;
                                field751[var5++] = -1;
                            } else {
                                client.method63(0, 0, client.field439.field2683, client.field439.field2684, false);
                                field751[var5++] = client.field441;
                                field751[var5++] = client.field316;
                            }
                            continue;
                        }
                        if (var509 == 6204) {
                            field751[var5++] = client.field526;
                            field751[var5++] = client.field527;
                            continue;
                        }
                        if (var509 == 6205) {
                            field751[var5++] = client.field470;
                            field751[var5++] = client.field525;
                            continue;
                        }
                    }
                    if (var509 < 6600) {
                        if (var509 == 6500) {
                            field751[var5++] = class24.method758() ? 1 : 0;
                            continue;
                        }
                        if (var509 == 6501) {
                            class24.field612 = 0;
                            class24 var490;
                            if (class24.field612 < class24.field611) {
                                var490 = Statics.field610[++class24.field612 - 1];
                            } else {
                                var490 = null;
                            }
                            if (var490 == null) {
                                field751[var5++] = -1;
                                field751[var5++] = 0;
                                field750[var6++] = "";
                                field751[var5++] = 0;
                                field751[var5++] = 0;
                                field750[var6++] = "";
                            } else {
                                field751[var5++] = var490.field616;
                                field751[var5++] = var490.field617;
                                field750[var6++] = var490.field625;
                                field751[var5++] = var490.field608;
                                field751[var5++] = var490.field609;
                                field750[var6++] = var490.field618;
                            }
                            continue;
                        }
                        if (var509 == 6502) {
                            class24 var493;
                            if (class24.field612 < class24.field611) {
                                var493 = Statics.field610[++class24.field612 - 1];
                            } else {
                                var493 = null;
                            }
                            if (var493 == null) {
                                field751[var5++] = -1;
                                field751[var5++] = 0;
                                field750[var6++] = "";
                                field751[var5++] = 0;
                                field751[var5++] = 0;
                                field750[var6++] = "";
                            } else {
                                field751[var5++] = var493.field616;
                                field751[var5++] = var493.field617;
                                field750[var6++] = var493.field625;
                                field751[var5++] = var493.field608;
                                field751[var5++] = var493.field609;
                                field750[var6++] = var493.field618;
                            }
                            continue;
                        }
                        if (var509 == 6506) {
                            var5--;
                            int var495 = field751[var5];
                            class24 var496 = null;
                            for (int var497 = 0; var497 < class24.field611; var497++) {
                                if (Statics.field610[var497].field616 == var495) {
                                    var496 = Statics.field610[var497];
                                    break;
                                }
                            }
                            if (var496 == null) {
                                field751[var5++] = -1;
                                field751[var5++] = 0;
                                field750[var6++] = "";
                                field751[var5++] = 0;
                                field751[var5++] = 0;
                                field750[var6++] = "";
                            } else {
                                field751[var5++] = var496.field616;
                                field751[var5++] = var496.field617;
                                field750[var6++] = var496.field625;
                                field751[var5++] = var496.field608;
                                field751[var5++] = var496.field609;
                                field750[var6++] = var496.field618;
                            }
                            continue;
                        }
                        if (var509 == 6507) {
                            var5 -= 4;
                            int var498 = field751[var5];
                            boolean var499 = field751[var5 + 1] == 1;
                            int var500 = field751[var5 + 2];
                            boolean var501 = field751[var5 + 3] == 1;
                            class24.method30(var498, var499, var500, var501);
                            continue;
                        }
                        if (var509 == 6511) {
                            var5--;
                            int var502 = field751[var5];
                            if (var502 >= 0 && var502 < class24.field611) {
                                class24 var503 = Statics.field610[var502];
                                field751[var5++] = var503.field616;
                                field751[var5++] = var503.field617;
                                field750[var6++] = var503.field625;
                                field751[var5++] = var503.field608;
                                field751[var5++] = var503.field609;
                                field750[var6++] = var503.field618;
                                continue;
                            }
                            field751[var5++] = -1;
                            field751[var5++] = 0;
                            field750[var6++] = "";
                            field751[var5++] = 0;
                            field751[var5++] = 0;
                            field750[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var508) {
            StringBuilder var505 = new StringBuilder(30);
            var505.append("").append(var4.field3024).append(" ");
            for (int var506 = field752 - 1; var506 >= 0; var506--) {
                var505.append("").append(field743[var506].field206.field3024).append(" ");
            }
            var505.append("").append(var10);
            class140.method793(var505.toString(), var508);
        }
    }

    @ObfuscatedName("ff.g(II)V")
    public static void method2972(int arg0) {
        if (arg0 == -1 || !class164.method511(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2685[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3.field2770 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field11 = var3.field2770;
                method2467(var4, 2000000);
            }
        }
    }
}
