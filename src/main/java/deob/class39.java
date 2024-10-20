package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("as")
public class class39 {

    @ObfuscatedName("as.v")
    public static int[] field800 = new int[5];

    @ObfuscatedName("as.b")
    public static int[][] field803 = new int[5][5000];

    @ObfuscatedName("as.m")
    public static int[] field805 = new int[1000];

    @ObfuscatedName("as.k")
    public static String[] field806 = new String[1000];

    @ObfuscatedName("as.c")
    public static int field807 = 0;

    @ObfuscatedName("as.w")
    public static class15[] field808 = new class15[50];

    @ObfuscatedName("as.i")
    public static Calendar field809 = Calendar.getInstance();

    @ObfuscatedName("as.u")
    public static final String[] field801 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("as.x")
    public static int field811 = 0;

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.f(Lf;I)V")
    public static void method2320(class1 arg0) {
        method608(arg0, 200000);
    }

    @ObfuscatedName("aj.e(Lf;II)V")
    public static void method608(class1 arg0, int arg1) {
        Object[] var2 = arg0.field2;
        int var3 = (Integer) var2[0];
        class24 var4 = class24.method1609(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field595;
        int[] var9 = var4.field594;
        byte var10 = -1;
        field807 = 0;
        try {
            Statics.field3215 = new int[var4.field598];
            int var11 = 0;
            Statics.field802 = new String[var4.field603];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2789;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2790;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2789;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2790;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field12;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field3215[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field802[var12++] = var15;
                }
            }
            int var16 = 0;
            field811 = arg0.field11;
            label3147: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var469 = var8[var7];
                if (var469 < 100) {
                    if (var469 == 0) {
                        field805[var5++] = var9[var7];
                        continue;
                    }
                    if (var469 == 1) {
                        int var17 = var9[var7];
                        field805[var5++] = class180.field2941[var17];
                        continue;
                    }
                    if (var469 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class180.field2941[var18] = field805[var5];
                        client.method1654(var18);
                        continue;
                    }
                    if (var469 == 3) {
                        field806[var6++] = var4.field597[var7];
                        continue;
                    }
                    if (var469 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var469 == 7) {
                        var5 -= 2;
                        if (field805[var5 + 1] != field805[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var469 == 8) {
                        var5 -= 2;
                        if (field805[var5 + 1] == field805[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var469 == 9) {
                        var5 -= 2;
                        if (field805[var5] < field805[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var469 == 10) {
                        var5 -= 2;
                        if (field805[var5] > field805[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var469 == 21) {
                        if (field807 == 0) {
                            return;
                        }
                        class15 var19 = field808[--field807];
                        var4 = var19.field217;
                        var8 = var4.field595;
                        var9 = var4.field594;
                        var7 = var19.field207;
                        Statics.field3215 = var19.field216;
                        Statics.field802 = var19.field209;
                        continue;
                    }
                    if (var469 == 25) {
                        int var20 = var9[var7];
                        field805[var5++] = class180.method2322(var20);
                        continue;
                    }
                    if (var469 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field805[var5];
                        class51 var23 = Statics.method647(var21);
                        int var24 = var23.field1093;
                        int var25 = var23.field1095;
                        int var26 = var23.field1094;
                        int var27 = class180.field2939[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class180.field2941[var24] = class180.field2941[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var469 == 31) {
                        var5 -= 2;
                        if (field805[var5] <= field805[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var469 == 32) {
                        var5 -= 2;
                        if (field805[var5] >= field805[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var469 == 33) {
                        field805[var5++] = Statics.field3215[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var469 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field3215[var10001] = field805[var5];
                        continue;
                    }
                    if (var469 == 35) {
                        field806[var6++] = Statics.field802[var9[var7]];
                        continue;
                    }
                    if (var469 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field802[var10001] = field806[var6];
                        continue;
                    }
                    if (var469 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field806;
                        String var31;
                        if (var29 == 0) {
                            var31 = "";
                        } else if (var29 == 1) {
                            String var32 = var30[var6];
                            if (var32 == null) {
                                var31 = "null";
                            } else {
                                var31 = var32.toString();
                            }
                        } else {
                            int var33 = var6 + var29;
                            int var34 = 0;
                            for (int var35 = var6; var35 < var33; var35++) {
                                String var36 = var30[var35];
                                if (var36 == null) {
                                    var34 += 4;
                                } else {
                                    var34 += var36.length();
                                }
                            }
                            StringBuilder var37 = new StringBuilder(var34);
                            for (int var38 = var6; var38 < var33; var38++) {
                                String var39 = var30[var38];
                                if (var39 == null) {
                                    var37.append("null");
                                } else {
                                    var37.append(var39);
                                }
                            }
                            var31 = var37.toString();
                        }
                        field806[var6++] = var31;
                        continue;
                    }
                    if (var469 == 38) {
                        var5--;
                        continue;
                    }
                    if (var469 == 39) {
                        var6--;
                        continue;
                    }
                    if (var469 == 40) {
                        int var41 = var9[var7];
                        class24 var42 = class24.method1609(var41);
                        int[] var43 = new int[var42.field598];
                        String[] var44 = new String[var42.field603];
                        for (int var45 = 0; var45 < var42.field600; var45++) {
                            var43[var45] = field805[var5 - var42.field600 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field608; var46++) {
                            var44[var46] = field806[var6 - var42.field608 + var46];
                        }
                        var5 -= var42.field600;
                        var6 -= var42.field608;
                        class15 var47 = new class15();
                        var47.field217 = var4;
                        var47.field207 = var7;
                        var47.field216 = Statics.field3215;
                        var47.field209 = Statics.field802;
                        field808[++field807 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field595;
                        var9 = var42.field594;
                        var7 = -1;
                        Statics.field3215 = var43;
                        Statics.field802 = var44;
                        continue;
                    }
                    if (var469 == 42) {
                        field805[var5++] = Statics.field2087.method192(var9[var7]);
                        continue;
                    }
                    if (var469 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2087.method191(var10001, field805[var5]);
                        continue;
                    }
                    if (var469 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field805[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field800[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label3147;
                                }
                                field803[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var469 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field805[var5];
                        if (var54 >= 0 && var54 < field800[var53]) {
                            field805[var5++] = field803[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var469 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field805[var5];
                        if (var56 >= 0 && var56 < field800[var55]) {
                            field803[var55][var56] = field805[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var469 == 47) {
                        String var57 = Statics.field2087.method220(var9[var7]);
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field806[var6++] = var57;
                        continue;
                    }
                    if (var469 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2087.method197(var10001, field806[var6]);
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var469 < 1000) {
                    if (var469 == 100) {
                        var5 -= 3;
                        int var59 = field805[var5];
                        int var60 = field805[var5 + 1];
                        int var61 = field805[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class177 var62 = class177.method2979(var59);
                        if (var62.field2913 == null) {
                            var62.field2913 = new class177[var61 + 1];
                        }
                        if (var62.field2913.length <= var61) {
                            class177[] var63 = new class177[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2913.length; var64++) {
                                var63[var64] = var62.field2913[var64];
                            }
                            var62.field2913 = var63;
                        }
                        if (var61 > 0 && var62.field2913[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class177 var65 = new class177();
                        var65.field2840 = var60;
                        var65.field2808 = var65.field2789 = var62.field2789;
                        var65.field2790 = var61;
                        var65.field2788 = true;
                        var62.field2913[var61] = var65;
                        if (var58) {
                            Statics.field1449 = var65;
                        } else {
                            Statics.field2684 = var65;
                        }
                        client.method733(var62);
                        continue;
                    }
                    if (var469 == 101) {
                        class177 var66 = var58 ? Statics.field1449 : Statics.field2684;
                        class177 var67 = class177.method2979(var66.field2789);
                        var67.field2913[var66.field2790] = null;
                        client.method733(var67);
                        continue;
                    }
                    if (var469 == 102) {
                        var5--;
                        class177 var68 = class177.method2979(field805[var5]);
                        var68.field2913 = null;
                        client.method733(var68);
                        continue;
                    }
                    if (var469 == 200) {
                        var5 -= 2;
                        int var69 = field805[var5];
                        int var70 = field805[var5 + 1];
                        class177 var71 = class177.method45(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field805[var5++] = 1;
                            if (var58) {
                                Statics.field1449 = var71;
                            } else {
                                Statics.field2684 = var71;
                            }
                            continue;
                        }
                        field805[var5++] = 0;
                        continue;
                    }
                    if (var469 == 201) {
                        var5--;
                        class177 var72 = class177.method2979(field805[var5]);
                        if (var72 == null) {
                            field805[var5++] = 0;
                        } else {
                            field805[var5++] = 1;
                            if (var58) {
                                Statics.field1449 = var72;
                            } else {
                                Statics.field2684 = var72;
                            }
                        }
                        continue;
                    }
                } else if (!(var469 < 1000 || var469 >= 1100) || !(var469 < 2000 || var469 >= 2100)) {
                    int var73 = -1;
                    class177 var74;
                    if (var469 >= 2000) {
                        var469 -= 1000;
                        var5--;
                        var73 = field805[var5];
                        var74 = class177.method2979(var73);
                    } else {
                        var74 = var58 ? Statics.field1449 : Statics.field2684;
                    }
                    if (var469 == 1000) {
                        var5 -= 4;
                        var74.field2798 = field805[var5];
                        var74.field2799 = field805[var5 + 1];
                        var74.field2794 = field805[var5 + 2];
                        var74.field2795 = field805[var5 + 3];
                        client.method733(var74);
                        client.method152(var74);
                        if (var73 != -1 && var74.field2840 == 0) {
                            client.method3222(Statics.field2910[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var469 == 1001) {
                        var5 -= 4;
                        var74.field2800 = field805[var5];
                        var74.field2801 = field805[var5 + 1];
                        var74.field2796 = field805[var5 + 2];
                        var74.field2797 = field805[var5 + 3];
                        client.method733(var74);
                        client.method152(var74);
                        if (var73 != -1 && var74.field2840 == 0) {
                            client.method3222(Statics.field2910[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var469 == 1003) {
                        var5--;
                        boolean var75 = field805[var5] == 1;
                        if (var74.field2809 != var75) {
                            var74.field2809 = var75;
                            client.method733(var74);
                        }
                        continue;
                    }
                    if (var469 == 1005) {
                        var5--;
                        var74.field2922 = field805[var5] == 1;
                        continue;
                    }
                    if (var469 == 1006) {
                        var5--;
                        var74.field2878 = field805[var5] == 1;
                        continue;
                    }
                } else if (var469 >= 1100 && var469 < 1200 || var469 >= 2100 && var469 < 2200) {
                    int var76 = -1;
                    class177 var77;
                    if (var469 >= 2000) {
                        var469 -= 1000;
                        var5--;
                        var76 = field805[var5];
                        var77 = class177.method2979(var76);
                    } else {
                        var77 = var58 ? Statics.field1449 : Statics.field2684;
                    }
                    if (var469 == 1100) {
                        var5 -= 2;
                        var77.field2810 = field805[var5];
                        if (var77.field2810 > var77.field2856 - var77.field2804) {
                            var77.field2810 = var77.field2856 - var77.field2804;
                        }
                        if (var77.field2810 < 0) {
                            var77.field2810 = 0;
                        }
                        var77.field2909 = field805[var5 + 1];
                        if (var77.field2909 > var77.field2791 - var77.field2906) {
                            var77.field2909 = var77.field2791 - var77.field2906;
                        }
                        if (var77.field2909 < 0) {
                            var77.field2909 = 0;
                        }
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1101) {
                        var5--;
                        var77.field2814 = field805[var5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1102) {
                        var5--;
                        var77.field2832 = field805[var5] == 1;
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1103) {
                        var5--;
                        var77.field2820 = field805[var5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1104) {
                        var5--;
                        var77.field2822 = field805[var5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1105) {
                        var5--;
                        var77.field2824 = field805[var5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1106) {
                        var5--;
                        var77.field2779 = field805[var5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1107) {
                        var5--;
                        var77.field2901 = field805[var5] == 1;
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1108) {
                        var77.field2891 = 1;
                        var5--;
                        var77.field2833 = field805[var5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1109) {
                        var5 -= 6;
                        var77.field2838 = field805[var5];
                        var77.field2861 = field805[var5 + 1];
                        var77.field2821 = field805[var5 + 2];
                        var77.field2827 = field805[var5 + 3];
                        var77.field2842 = field805[var5 + 4];
                        var77.field2843 = field805[var5 + 5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1110) {
                        var5--;
                        int var78 = field805[var5];
                        if (var77.field2836 != var78) {
                            var77.field2836 = var78;
                            var77.field2911 = 0;
                            var77.field2912 = 0;
                            client.method733(var77);
                        }
                        continue;
                    }
                    if (var469 == 1111) {
                        var5--;
                        var77.field2846 = field805[var5] == 1;
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1112) {
                        var6--;
                        String var79 = field806[var6];
                        if (!var79.equals(var77.field2869)) {
                            var77.field2869 = var79;
                            client.method733(var77);
                        }
                        continue;
                    }
                    if (var469 == 1113) {
                        var5--;
                        var77.field2903 = field805[var5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1114) {
                        var5 -= 3;
                        var77.field2852 = field805[var5];
                        var77.field2830 = field805[var5 + 1];
                        var77.field2899 = field805[var5 + 2];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1115) {
                        var5--;
                        var77.field2864 = field805[var5] == 1;
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1116) {
                        var5--;
                        var77.field2828 = field805[var5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1117) {
                        var5--;
                        var77.field2829 = field805[var5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1118) {
                        var5--;
                        var77.field2855 = field805[var5] == 1;
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1119) {
                        var5--;
                        var77.field2831 = field805[var5] == 1;
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1120) {
                        var5 -= 2;
                        var77.field2856 = field805[var5];
                        var77.field2791 = field805[var5 + 1];
                        client.method733(var77);
                        if (var76 != -1 && var77.field2840 == 0) {
                            client.method3222(Statics.field2910[var76 >> 16], var77, false);
                        }
                        continue;
                    }
                    if (var469 == 1121) {
                        client.method1541(var77.field2789, var77.field2790);
                        client.field444 = var77;
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1122) {
                        var5--;
                        var77.field2825 = field805[var5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1123) {
                        var5--;
                        var77.field2815 = field805[var5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1124) {
                        var5--;
                        var77.field2783 = field805[var5];
                        client.method733(var77);
                        continue;
                    }
                    if (var469 == 1125) {
                        var5--;
                        int var80 = field805[var5];
                        class86 var81 = (class86) class113.method3065(class86.method730(), var80);
                        if (var81 != null) {
                            var77.field2819 = var81;
                            client.method733(var77);
                        }
                        continue;
                    }
                } else if (!(var469 < 1200 || var469 >= 1300) || !(var469 < 2200 || var469 >= 2300)) {
                    class177 var82;
                    if (var469 >= 2000) {
                        var469 -= 1000;
                        var5--;
                        var82 = class177.method2979(field805[var5]);
                    } else {
                        var82 = var58 ? Statics.field1449 : Statics.field2684;
                    }
                    client.method733(var82);
                    if (var469 == 1200 || var469 == 1205 || var469 == 1212) {
                        var5 -= 2;
                        int var83 = field805[var5];
                        int var84 = field805[var5 + 1];
                        var82.field2839 = var83;
                        var82.field2862 = var84;
                        class56 var85 = class56.method905(var83);
                        var82.field2821 = var85.field1185;
                        var82.field2827 = var85.field1175;
                        var82.field2842 = var85.field1199;
                        var82.field2838 = var85.field1171;
                        var82.field2861 = var85.field1172;
                        var82.field2843 = var85.field1167;
                        if (var469 == 1205) {
                            var82.field2847 = 0;
                        } else if (var469 == 1212 | var85.field1173 == 1) {
                            var82.field2847 = 1;
                        } else {
                            var82.field2847 = 2;
                        }
                        if (var82.field2845 > 0) {
                            var82.field2843 = var82.field2843 * 32 / var82.field2845;
                        } else if (var82.field2800 > 0) {
                            var82.field2843 = var82.field2843 * 32 / var82.field2800;
                        }
                        continue;
                    }
                    if (var469 == 1201) {
                        var82.field2891 = 2;
                        var5--;
                        var82.field2833 = field805[var5];
                        continue;
                    }
                    if (var469 == 1202) {
                        var82.field2891 = 3;
                        var82.field2833 = Statics.field767.field32.method3341();
                        continue;
                    }
                } else if (var469 >= 1300 && var469 < 1400 || var469 >= 2300 && var469 < 2400) {
                    class177 var86;
                    if (var469 >= 2000) {
                        var469 -= 1000;
                        var5--;
                        var86 = class177.method2979(field805[var5]);
                    } else {
                        var86 = var58 ? Statics.field1449 : Statics.field2684;
                    }
                    if (var469 == 1300) {
                        var5--;
                        int var87 = field805[var5] - 1;
                        if (var87 >= 0 && var87 <= 9) {
                            var6--;
                            var86.method3233(var87, field806[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var469 == 1301) {
                        var5 -= 2;
                        int var88 = field805[var5];
                        int var89 = field805[var5 + 1];
                        var86.field2916 = class177.method45(var88, var89);
                        continue;
                    }
                    if (var469 == 1302) {
                        var5--;
                        var86.field2867 = field805[var5] == 1;
                        continue;
                    }
                    if (var469 == 1303) {
                        var5--;
                        var86.field2865 = field805[var5];
                        continue;
                    }
                    if (var469 == 1304) {
                        var5--;
                        var86.field2917 = field805[var5];
                        continue;
                    }
                    if (var469 == 1305) {
                        var6--;
                        var86.field2849 = field806[var6];
                        continue;
                    }
                    if (var469 == 1306) {
                        var6--;
                        var86.field2898 = field806[var6];
                        continue;
                    }
                    if (var469 == 1307) {
                        var86.field2811 = null;
                        continue;
                    }
                } else {
                    if (var469 >= 1400 && var469 < 1500 || var469 >= 2400 && var469 < 2500) {
                        class177 var90;
                        if (var469 >= 2000) {
                            var469 -= 1000;
                            var5--;
                            var90 = class177.method2979(field805[var5]);
                        } else {
                            var90 = var58 ? Statics.field1449 : Statics.field2684;
                        }
                        var6--;
                        String var91 = field806[var6];
                        int[] var92 = null;
                        if (var91.length() > 0 && var91.charAt(var91.length() - 1) == 'Y') {
                            var5--;
                            int var93 = field805[var5];
                            if (var93 > 0) {
                                var92 = new int[var93];
                                while (var93-- > 0) {
                                    var5--;
                                    var92[var93] = field805[var5];
                                }
                            }
                            var91 = var91.substring(0, var91.length() - 1);
                        }
                        Object[] var94 = new Object[var91.length() + 1];
                        for (int var95 = var94.length - 1; var95 >= 1; var95--) {
                            if (var91.charAt(var95 - 1) == 's') {
                                var6--;
                                var94[var95] = field806[var6];
                            } else {
                                var5--;
                                var94[var95] = Integer.valueOf(field805[var5]);
                            }
                        }
                        var5--;
                        int var96 = field805[var5];
                        if (var96 == -1) {
                            var94 = null;
                        } else {
                            var94[0] = Integer.valueOf(var96);
                        }
                        if (var469 == 1400) {
                            var90.field2871 = var94;
                        }
                        if (var469 == 1401) {
                            var90.field2887 = var94;
                        }
                        if (var469 == 1402) {
                            var90.field2873 = var94;
                        }
                        if (var469 == 1403) {
                            var90.field2875 = var94;
                        }
                        if (var469 == 1404) {
                            var90.field2877 = var94;
                        }
                        if (var469 == 1405) {
                            var90.field2782 = var94;
                        }
                        if (var469 == 1406) {
                            var90.field2881 = var94;
                        }
                        if (var469 == 1407) {
                            var90.field2882 = var94;
                            var90.field2883 = var92;
                        }
                        if (var469 == 1408) {
                            var90.field2780 = var94;
                        }
                        if (var469 == 1409) {
                            var90.field2889 = var94;
                        }
                        if (var469 == 1410) {
                            var90.field2879 = var94;
                        }
                        if (var469 == 1411) {
                            var90.field2872 = var94;
                        }
                        if (var469 == 1412) {
                            var90.field2876 = var94;
                        }
                        if (var469 == 1414) {
                            var90.field2884 = var94;
                            var90.field2885 = var92;
                        }
                        if (var469 == 1415) {
                            var90.field2812 = var94;
                            var90.field2785 = var92;
                        }
                        if (var469 == 1416) {
                            var90.field2880 = var94;
                        }
                        if (var469 == 1417) {
                            var90.field2866 = var94;
                        }
                        if (var469 == 1418) {
                            var90.field2848 = var94;
                        }
                        if (var469 == 1419) {
                            var90.field2853 = var94;
                        }
                        if (var469 == 1420) {
                            var90.field2893 = var94;
                        }
                        if (var469 == 1421) {
                            var90.field2894 = var94;
                        }
                        if (var469 == 1422) {
                            var90.field2895 = var94;
                        }
                        if (var469 == 1423) {
                            var90.field2896 = var94;
                        }
                        if (var469 == 1424) {
                            var90.field2897 = var94;
                        }
                        if (var469 == 1425) {
                            var90.field2874 = var94;
                        }
                        if (var469 == 1426) {
                            var90.field2900 = var94;
                        }
                        if (var469 == 1427) {
                            var90.field2792 = var94;
                        }
                        var90.field2818 = true;
                        continue;
                    }
                    if (var469 < 1600) {
                        class177 var97 = var58 ? Statics.field1449 : Statics.field2684;
                        if (var469 == 1500) {
                            field805[var5++] = var97.field2802;
                            continue;
                        }
                        if (var469 == 1501) {
                            field805[var5++] = var97.field2863;
                            continue;
                        }
                        if (var469 == 1502) {
                            field805[var5++] = var97.field2804;
                            continue;
                        }
                        if (var469 == 1503) {
                            field805[var5++] = var97.field2906;
                            continue;
                        }
                        if (var469 == 1504) {
                            field805[var5++] = var97.field2809 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 1505) {
                            field805[var5++] = var97.field2808;
                            continue;
                        }
                    } else if (var469 < 1700) {
                        class177 var98 = var58 ? Statics.field1449 : Statics.field2684;
                        if (var469 == 1600) {
                            field805[var5++] = var98.field2810;
                            continue;
                        }
                        if (var469 == 1601) {
                            field805[var5++] = var98.field2909;
                            continue;
                        }
                        if (var469 == 1602) {
                            field806[var6++] = var98.field2869;
                            continue;
                        }
                        if (var469 == 1603) {
                            field805[var5++] = var98.field2856;
                            continue;
                        }
                        if (var469 == 1604) {
                            field805[var5++] = var98.field2791;
                            continue;
                        }
                        if (var469 == 1605) {
                            field805[var5++] = var98.field2843;
                            continue;
                        }
                        if (var469 == 1606) {
                            field805[var5++] = var98.field2821;
                            continue;
                        }
                        if (var469 == 1607) {
                            field805[var5++] = var98.field2842;
                            continue;
                        }
                        if (var469 == 1608) {
                            field805[var5++] = var98.field2827;
                            continue;
                        }
                        if (var469 == 1609) {
                            field805[var5++] = var98.field2820;
                            continue;
                        }
                        if (var469 == 1610) {
                            field805[var5++] = var98.field2783;
                            continue;
                        }
                        if (var469 == 1611) {
                            field805[var5++] = var98.field2814;
                            continue;
                        }
                        if (var469 == 1612) {
                            field805[var5++] = var98.field2815;
                            continue;
                        }
                        if (var469 == 1613) {
                            field805[var5++] = var98.field2819.method570();
                            continue;
                        }
                    } else if (var469 < 1800) {
                        class177 var99 = var58 ? Statics.field1449 : Statics.field2684;
                        if (var469 == 1700) {
                            field805[var5++] = var99.field2839;
                            continue;
                        }
                        if (var469 == 1701) {
                            if (var99.field2839 == -1) {
                                field805[var5++] = 0;
                            } else {
                                field805[var5++] = var99.field2862;
                            }
                            continue;
                        }
                        if (var469 == 1702) {
                            field805[var5++] = var99.field2790;
                            continue;
                        }
                    } else if (var469 < 1900) {
                        class177 var100 = var58 ? Statics.field1449 : Statics.field2684;
                        if (var469 == 1800) {
                            field805[var5++] = class182.method3232(client.method2021(var100));
                            continue;
                        }
                        if (var469 == 1801) {
                            var5--;
                            int var101 = field805[var5];
                            int var470 = var101 - 1;
                            if (var100.field2811 != null && var470 < var100.field2811.length && var100.field2811[var470] != null) {
                                field806[var6++] = var100.field2811[var470];
                                continue;
                            }
                            field806[var6++] = "";
                            continue;
                        }
                        if (var469 == 1802) {
                            if (var100.field2849 == null) {
                                field806[var6++] = "";
                            } else {
                                field806[var6++] = var100.field2849;
                            }
                            continue;
                        }
                    } else if (var469 >= 1900 && var469 < 2000 || var469 >= 2900 && var469 < 3000) {
                        class177 var102;
                        if (var469 >= 2000) {
                            var469 -= 1000;
                            var5--;
                            var102 = class177.method2979(field805[var5]);
                        } else {
                            var102 = var58 ? Statics.field1449 : Statics.field2684;
                        }
                        if (var469 == 1927) {
                            if (field811 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var102.field2792 == null) {
                                return;
                            }
                            class1 var103 = new class1();
                            var103.field3 = var102;
                            var103.field2 = var102.field2792;
                            var103.field11 = field811 + 1;
                            client.field380.method3642(arg0);
                            continue;
                        }
                    } else if (var469 < 2600) {
                        var5--;
                        class177 var104 = class177.method2979(field805[var5]);
                        if (var469 == 2500) {
                            field805[var5++] = var104.field2802;
                            continue;
                        }
                        if (var469 == 2501) {
                            field805[var5++] = var104.field2863;
                            continue;
                        }
                        if (var469 == 2502) {
                            field805[var5++] = var104.field2804;
                            continue;
                        }
                        if (var469 == 2503) {
                            field805[var5++] = var104.field2906;
                            continue;
                        }
                        if (var469 == 2504) {
                            field805[var5++] = var104.field2809 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 2505) {
                            field805[var5++] = var104.field2808;
                            continue;
                        }
                    } else if (var469 < 2700) {
                        var5--;
                        class177 var105 = class177.method2979(field805[var5]);
                        if (var469 == 2600) {
                            field805[var5++] = var105.field2810;
                            continue;
                        }
                        if (var469 == 2601) {
                            field805[var5++] = var105.field2909;
                            continue;
                        }
                        if (var469 == 2602) {
                            field806[var6++] = var105.field2869;
                            continue;
                        }
                        if (var469 == 2603) {
                            field805[var5++] = var105.field2856;
                            continue;
                        }
                        if (var469 == 2604) {
                            field805[var5++] = var105.field2791;
                            continue;
                        }
                        if (var469 == 2605) {
                            field805[var5++] = var105.field2843;
                            continue;
                        }
                        if (var469 == 2606) {
                            field805[var5++] = var105.field2821;
                            continue;
                        }
                        if (var469 == 2607) {
                            field805[var5++] = var105.field2842;
                            continue;
                        }
                        if (var469 == 2608) {
                            field805[var5++] = var105.field2827;
                            continue;
                        }
                        if (var469 == 2609) {
                            field805[var5++] = var105.field2820;
                            continue;
                        }
                        if (var469 == 2610) {
                            field805[var5++] = var105.field2783;
                            continue;
                        }
                        if (var469 == 2611) {
                            field805[var5++] = var105.field2814;
                            continue;
                        }
                        if (var469 == 2612) {
                            field805[var5++] = var105.field2815;
                            continue;
                        }
                        if (var469 == 2613) {
                            field805[var5++] = var105.field2819.method570();
                            continue;
                        }
                    } else if (var469 < 2800) {
                        if (var469 == 2700) {
                            var5--;
                            class177 var106 = class177.method2979(field805[var5]);
                            field805[var5++] = var106.field2839;
                            continue;
                        }
                        if (var469 == 2701) {
                            var5--;
                            class177 var107 = class177.method2979(field805[var5]);
                            if (var107.field2839 == -1) {
                                field805[var5++] = 0;
                            } else {
                                field805[var5++] = var107.field2862;
                            }
                            continue;
                        }
                        if (var469 == 2702) {
                            var5--;
                            int var108 = field805[var5];
                            class4 var109 = (class4) client.field441.method3605((long) var108);
                            if (var109 == null) {
                                field805[var5++] = 0;
                            } else {
                                field805[var5++] = 1;
                            }
                            continue;
                        }
                        if (var469 == 2706) {
                            field805[var5++] = client.field302;
                            continue;
                        }
                    } else if (var469 < 2900) {
                        var5--;
                        class177 var110 = class177.method2979(field805[var5]);
                        if (var469 == 2800) {
                            field805[var5++] = class182.method3232(client.method2021(var110));
                            continue;
                        }
                        if (var469 == 2801) {
                            var5--;
                            int var111 = field805[var5];
                            int var471 = var111 - 1;
                            if (var110.field2811 != null && var471 < var110.field2811.length && var110.field2811[var471] != null) {
                                field806[var6++] = var110.field2811[var471];
                                continue;
                            }
                            field806[var6++] = "";
                            continue;
                        }
                        if (var469 == 2802) {
                            if (var110.field2849 == null) {
                                field806[var6++] = "";
                            } else {
                                field806[var6++] = var110.field2849;
                            }
                            continue;
                        }
                    } else if (var469 < 3200) {
                        if (var469 == 3100) {
                            var6--;
                            String var112 = field806[var6];
                            class12.method3563(0, "", var112);
                            continue;
                        }
                        if (var469 == 3101) {
                            var5 -= 2;
                            client.method3382(Statics.field767, field805[var5], field805[var5 + 1]);
                            continue;
                        }
                        if (var469 == 3103) {
                            client.field398.method2634(243);
                            for (class4 var113 = (class4) client.field441.method3608(); var113 != null; var113 = (class4) client.field441.method3613()) {
                                if (var113.field59 == 0 || var113.field59 == 3) {
                                    client.method34(var113, true);
                                }
                            }
                            if (client.field444 != null) {
                                client.method733(client.field444);
                                client.field444 = null;
                            }
                            continue;
                        }
                        if (var469 == 3104) {
                            var6--;
                            String var114 = field806[var6];
                            int var115 = 0;
                            if (class167.method180(var114)) {
                                int var116 = class167.method2020(var114, 10, true);
                                var115 = var116;
                            }
                            client.field398.method2634(63);
                            client.field398.method2387(var115);
                            continue;
                        }
                        if (var469 == 3105) {
                            var6--;
                            String var117 = field806[var6];
                            client.field398.method2634(164);
                            client.field398.method2384(var117.length() + 1);
                            client.field398.method2390(var117);
                            continue;
                        }
                        if (var469 == 3106) {
                            var6--;
                            String var118 = field806[var6];
                            client.field398.method2634(226);
                            client.field398.method2384(var118.length() + 1);
                            client.field398.method2390(var118);
                            continue;
                        }
                        if (var469 == 3107) {
                            var5--;
                            int var119 = field805[var5];
                            var6--;
                            String var120 = field806[var6];
                            Statics.method3767(var119, var120);
                            continue;
                        }
                        if (var469 == 3108) {
                            var5 -= 3;
                            int var121 = field805[var5];
                            int var122 = field805[var5 + 1];
                            int var123 = field805[var5 + 2];
                            class177 var124 = class177.method2979(var123);
                            client.method1613(var124, var121, var122);
                            continue;
                        }
                        if (var469 == 3109) {
                            var5 -= 2;
                            int var125 = field805[var5];
                            int var126 = field805[var5 + 1];
                            class177 var127 = var58 ? Statics.field1449 : Statics.field2684;
                            client.method1613(var127, var125, var126);
                            continue;
                        }
                        if (var469 == 3110) {
                            var5--;
                            Statics.field277 = field805[var5] == 1;
                            continue;
                        }
                        if (var469 == 3111) {
                            field805[var5++] = Statics.field233.field150 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3112) {
                            var5--;
                            Statics.field233.field150 = field805[var5] == 1;
                            class9.method188();
                            continue;
                        }
                        if (var469 == 3113) {
                            var6--;
                            String var128 = field806[var6];
                            var5--;
                            boolean var129 = field805[var5] == 1;
                            if (!var129) {
                                class142.method560(var128, 3);
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var128));
                                    continue;
                                } catch (Exception var467) {
                                }
                            }
                            if (class142.field2181.startsWith("win")) {
                                class142.method560(var128, 0);
                            } else if (class142.field2181.startsWith("mac")) {
                                class142.method1586(var128, 1, "openjs");
                            } else {
                                class142.method560(var128, 2);
                            }
                            continue;
                        }
                        if (var469 == 3115) {
                            var5--;
                            int var131 = field805[var5];
                            client.field398.method2634(1);
                            client.field398.method2385(var131);
                            continue;
                        }
                        if (var469 == 3116) {
                            var5--;
                            int var132 = field805[var5];
                            var6 -= 2;
                            String var133 = field806[var6];
                            String var134 = field806[var6 + 1];
                            if (var133.length() <= 500 && var134.length() <= 500) {
                                client.field398.method2634(237);
                                client.field398.method2385(1 + class123.method1542(var133) + class123.method1542(var134));
                                client.field398.method2424(var132);
                                client.field398.method2390(var133);
                                client.field398.method2390(var134);
                            }
                            continue;
                        }
                    } else if (var469 < 3300) {
                        if (var469 == 3200) {
                            var5 -= 3;
                            client.method40(field805[var5], field805[var5 + 1], field805[var5 + 2]);
                            continue;
                        }
                        if (var469 == 3201) {
                            var5--;
                            client.method155(field805[var5]);
                            continue;
                        }
                        if (var469 == 3202) {
                            var5 -= 2;
                            int var135 = field805[var5];
                            int var10000 = field805[var5 + 1];
                            if (client.field517 != 0 && var135 != -1) {
                                class187.method17(Statics.field586, var135, 0, client.field517, false);
                                client.field471 = true;
                            }
                            continue;
                        }
                    } else if (var469 < 3400) {
                        if (var469 == 3300) {
                            field805[var5++] = client.field291;
                            continue;
                        }
                        if (var469 == 3301) {
                            var5 -= 2;
                            int var137 = field805[var5];
                            int var138 = field805[var5 + 1];
                            field805[var5++] = class16.method3(var137, var138);
                            continue;
                        }
                        if (var469 == 3302) {
                            var5 -= 2;
                            int var139 = field805[var5];
                            int var140 = field805[var5 + 1];
                            int[] var141 = field805;
                            int var142 = var5++;
                            class16 var143 = (class16) class16.field221.method3605((long) var139);
                            int var144;
                            if (var143 == null) {
                                var144 = 0;
                            } else if (var140 >= 0 && var140 < var143.field218.length) {
                                var144 = var143.field218[var140];
                            } else {
                                var144 = 0;
                            }
                            var141[var142] = var144;
                            continue;
                        }
                        if (var469 == 3303) {
                            var5 -= 2;
                            int var145 = field805[var5];
                            int var146 = field805[var5 + 1];
                            field805[var5++] = class16.method939(var145, var146);
                            continue;
                        }
                        if (var469 == 3304) {
                            var5--;
                            int var147 = field805[var5];
                            field805[var5++] = class55.method182(var147).field1144;
                            continue;
                        }
                        if (var469 == 3305) {
                            var5--;
                            int var148 = field805[var5];
                            field805[var5++] = client.field417[var148];
                            continue;
                        }
                        if (var469 == 3306) {
                            var5--;
                            int var149 = field805[var5];
                            field805[var5++] = client.field547[var149];
                            continue;
                        }
                        if (var469 == 3307) {
                            var5--;
                            int var150 = field805[var5];
                            field805[var5++] = client.field419[var150];
                            continue;
                        }
                        if (var469 == 3308) {
                            int var151 = Statics.field223;
                            int var152 = (Statics.field767.field864 >> 7) + Statics.field713;
                            int var153 = (Statics.field767.field818 >> 7) + Statics.field138;
                            field805[var5++] = (var151 << 28) + (var152 << 14) + var153;
                            continue;
                        }
                        if (var469 == 3309) {
                            var5--;
                            int var154 = field805[var5];
                            field805[var5++] = var154 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var469 == 3310) {
                            var5--;
                            int var155 = field805[var5];
                            field805[var5++] = var155 >> 28;
                            continue;
                        }
                        if (var469 == 3311) {
                            var5--;
                            int var156 = field805[var5];
                            field805[var5++] = var156 & 0x3FFF;
                            continue;
                        }
                        if (var469 == 3312) {
                            field805[var5++] = client.field286 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3313) {
                            var5 -= 2;
                            int var157 = field805[var5] + 32768;
                            int var158 = field805[var5 + 1];
                            field805[var5++] = class16.method3(var157, var158);
                            continue;
                        }
                        if (var469 == 3314) {
                            var5 -= 2;
                            int var159 = field805[var5] + 32768;
                            int var160 = field805[var5 + 1];
                            field805[var5++] = class16.method562(var159, var160);
                            continue;
                        }
                        if (var469 == 3315) {
                            var5 -= 2;
                            int var161 = field805[var5] + 32768;
                            int var162 = field805[var5 + 1];
                            field805[var5++] = class16.method939(var161, var162);
                            continue;
                        }
                        if (var469 == 3316) {
                            if (client.field447 >= 2) {
                                field805[var5++] = client.field447;
                            } else {
                                field805[var5++] = 0;
                            }
                            continue;
                        }
                        if (var469 == 3317) {
                            field805[var5++] = client.field458;
                            continue;
                        }
                        if (var469 == 3318) {
                            field805[var5++] = client.field492;
                            continue;
                        }
                        if (var469 == 3321) {
                            field805[var5++] = client.field382;
                            continue;
                        }
                        if (var469 == 3322) {
                            field805[var5++] = client.field446;
                            continue;
                        }
                        if (var469 == 3323) {
                            if (client.field449) {
                                field805[var5++] = 1;
                            } else {
                                field805[var5++] = 0;
                            }
                            continue;
                        }
                        if (var469 == 3324) {
                            field805[var5++] = client.field356;
                            continue;
                        }
                    } else if (var469 < 3500) {
                        if (var469 == 3400) {
                            var5 -= 2;
                            int var163 = field805[var5];
                            int var164 = field805[var5 + 1];
                            class53 var165 = class53.method145(var163);
                            if (var165.field1127 != 's') {
                            }
                            for (int var166 = 0; var166 < var165.field1136; var166++) {
                                if (var165.field1133[var166] == var164) {
                                    field806[var6++] = var165.field1135[var166];
                                    var165 = null;
                                    break;
                                }
                            }
                            if (var165 != null) {
                                field806[var6++] = var165.field1126;
                            }
                            continue;
                        }
                        if (var469 == 3408) {
                            var5 -= 4;
                            int var167 = field805[var5];
                            int var168 = field805[var5 + 1];
                            int var169 = field805[var5 + 2];
                            int var170 = field805[var5 + 3];
                            class53 var171 = class53.method145(var169);
                            if (var171.field1130 == var167 && var171.field1127 == var168) {
                                for (int var172 = 0; var172 < var171.field1136; var172++) {
                                    if (var171.field1133[var172] == var170) {
                                        if (var168 == 115) {
                                            field806[var6++] = var171.field1135[var172];
                                        } else {
                                            field805[var5++] = var171.field1134[var172];
                                        }
                                        var171 = null;
                                        break;
                                    }
                                }
                                if (var171 != null) {
                                    if (var168 == 115) {
                                        field806[var6++] = var171.field1126;
                                    } else {
                                        field805[var5++] = var171.field1131;
                                    }
                                }
                                continue;
                            }
                            if (var168 == 115) {
                                field806[var6++] = "null";
                            } else {
                                field805[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var469 < 3700) {
                        if (var469 == 3600) {
                            if (client.field495 == 0) {
                                field805[var5++] = -2;
                            } else if (client.field495 == 1) {
                                field805[var5++] = -1;
                            } else {
                                field805[var5++] = client.field298;
                            }
                            continue;
                        }
                        if (var469 == 3601) {
                            var5--;
                            int var173 = field805[var5];
                            if (client.field495 == 2 && var173 < client.field298) {
                                field806[var6++] = client.field549[var173].field245;
                                field806[var6++] = client.field549[var173].field244;
                                continue;
                            }
                            field806[var6++] = "";
                            field806[var6++] = "";
                            continue;
                        }
                        if (var469 == 3602) {
                            var5--;
                            int var174 = field805[var5];
                            if (client.field495 == 2 && var174 < client.field298) {
                                field805[var5++] = client.field549[var174].field251;
                                continue;
                            }
                            field805[var5++] = 0;
                            continue;
                        }
                        if (var469 == 3603) {
                            var5--;
                            int var175 = field805[var5];
                            if (client.field495 == 2 && var175 < client.field298) {
                                field805[var5++] = client.field549[var175].field246;
                                continue;
                            }
                            field805[var5++] = 0;
                            continue;
                        }
                        if (var469 == 3604) {
                            var6--;
                            String var176 = field806[var6];
                            var5--;
                            int var177 = field805[var5];
                            client.method747(var176, var177);
                            continue;
                        }
                        if (var469 == 3605) {
                            var6--;
                            String var178 = field806[var6];
                            if (var178 == null) {
                                continue;
                            }
                            if ((client.field298 < 200 || client.field405 == 1) && client.field298 < 400) {
                                String var179 = class168.method947(var178, Statics.field2189);
                                if (var179 == null) {
                                    continue;
                                }
                                for (int var180 = 0; var180 < client.field298; var180++) {
                                    class18 var181 = client.field549[var180];
                                    String var182 = class168.method947(var181.field245, Statics.field2189);
                                    if (var182 != null && var182.equals(var179)) {
                                        class12.method3563(30, "", var178 + class161.field2513);
                                        continue label3147;
                                    }
                                    if (var181.field244 != null) {
                                        String var183 = class168.method947(var181.field244, Statics.field2189);
                                        if (var183 != null && var183.equals(var179)) {
                                            class12.method3563(30, "", var178 + class161.field2513);
                                            continue label3147;
                                        }
                                    }
                                }
                                for (int var184 = 0; var184 < client.field295; var184++) {
                                    class8 var185 = client.field333[var184];
                                    String var186 = class168.method947(var185.field129, Statics.field2189);
                                    if (var186 != null && var186.equals(var179)) {
                                        class12.method3563(30, "", class161.field2373 + var178 + class161.field2559);
                                        continue label3147;
                                    }
                                    if (var185.field130 != null) {
                                        String var187 = class168.method947(var185.field130, Statics.field2189);
                                        if (var187 != null && var187.equals(var179)) {
                                            class12.method3563(30, "", class161.field2373 + var178 + class161.field2559);
                                            continue label3147;
                                        }
                                    }
                                }
                                if (class168.method947(Statics.field767.field56, Statics.field2189).equals(var179)) {
                                    class12.method3563(30, "", class161.field2518);
                                } else {
                                    client.field398.method2634(114);
                                    client.field398.method2384(class123.method1542(var178));
                                    client.field398.method2390(var178);
                                }
                                continue;
                            }
                            class12.method3563(30, "", class161.field2482);
                            continue;
                        }
                        if (var469 == 3606) {
                            var6--;
                            String var188 = field806[var6];
                            client.method937(var188);
                            continue;
                        }
                        if (var469 == 3607) {
                            var6--;
                            String var189 = field806[var6];
                            if (var189 == null) {
                                continue;
                            }
                            if ((client.field295 < 100 || client.field405 == 1) && client.field295 < 400) {
                                String var190 = class168.method947(var189, Statics.field2189);
                                if (var190 == null) {
                                    continue;
                                }
                                for (int var191 = 0; var191 < client.field295; var191++) {
                                    class8 var192 = client.field333[var191];
                                    String var193 = class168.method947(var192.field129, Statics.field2189);
                                    if (var193 != null && var193.equals(var190)) {
                                        class12.method3563(31, "", var189 + class161.field2548);
                                        continue label3147;
                                    }
                                    if (var192.field130 != null) {
                                        String var194 = class168.method947(var192.field130, Statics.field2189);
                                        if (var194 != null && var194.equals(var190)) {
                                            class12.method3563(31, "", var189 + class161.field2548);
                                            continue label3147;
                                        }
                                    }
                                }
                                for (int var195 = 0; var195 < client.field298; var195++) {
                                    class18 var196 = client.field549[var195];
                                    String var197 = class168.method947(var196.field245, Statics.field2189);
                                    if (var197 != null && var197.equals(var190)) {
                                        class12.method3563(31, "", class161.field2520 + var189 + class161.field2521);
                                        continue label3147;
                                    }
                                    if (var196.field244 != null) {
                                        String var198 = class168.method947(var196.field244, Statics.field2189);
                                        if (var198 != null && var198.equals(var190)) {
                                            class12.method3563(31, "", class161.field2520 + var189 + class161.field2521);
                                            continue label3147;
                                        }
                                    }
                                }
                                if (class168.method947(Statics.field767.field56, Statics.field2189).equals(var190)) {
                                    class12.method3563(31, "", class161.field2517);
                                } else {
                                    client.field398.method2634(58);
                                    client.field398.method2384(class123.method1542(var189));
                                    client.field398.method2390(var189);
                                }
                                continue;
                            }
                            class12.method3563(31, "", class161.field2514);
                            continue;
                        }
                        if (var469 == 3608) {
                            var6--;
                            String var199 = field806[var6];
                            if (var199 == null) {
                                continue;
                            }
                            String var200 = class168.method947(var199, Statics.field2189);
                            if (var200 == null) {
                                continue;
                            }
                            int var201 = 0;
                            while (true) {
                                if (var201 >= client.field295) {
                                    continue label3147;
                                }
                                class8 var202 = client.field333[var201];
                                String var203 = var202.field129;
                                String var204 = class168.method947(var203, Statics.field2189);
                                boolean var205;
                                if (var199 == null || var203 == null) {
                                    var205 = false;
                                } else if (var199.startsWith("#") || var203.startsWith("#")) {
                                    var205 = var199.equals(var203);
                                } else {
                                    var205 = var200.equals(var204);
                                }
                                if (var205) {
                                    client.field295--;
                                    for (int var206 = var201; var206 < client.field295; var206++) {
                                        client.field333[var206] = client.field333[var206 + 1];
                                    }
                                    client.field473 = client.field296;
                                    client.field398.method2634(87);
                                    client.field398.method2384(class123.method1542(var199));
                                    client.field398.method2390(var199);
                                    continue label3147;
                                }
                                var201++;
                            }
                        }
                        if (var469 == 3609) {
                            var6--;
                            String var207 = field806[var6];
                            class156[] var208 = class156.method2995();
                            for (int var209 = 0; var209 < var208.length; var209++) {
                                class156 var210 = var208[var209];
                                if (var210.field2312 != -1 && var207.startsWith(class2.method2342(var210.field2312))) {
                                    var207 = var207.substring(6 + Integer.toString(var210.field2312).length());
                                    break;
                                }
                            }
                            field805[var5++] = client.method80(var207, false) ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3611) {
                            if (client.field507 == null) {
                                field806[var6++] = "";
                            } else {
                                field806[var6++] = class166.method551(client.field507);
                            }
                            continue;
                        }
                        if (var469 == 3612) {
                            if (client.field507 == null) {
                                field805[var5++] = 0;
                            } else {
                                field805[var5++] = Statics.field225;
                            }
                            continue;
                        }
                        if (var469 == 3613) {
                            var5--;
                            int var211 = field805[var5];
                            if (client.field507 != null && var211 < Statics.field225) {
                                field806[var6++] = Statics.field1683[var211].field638;
                                continue;
                            }
                            field806[var6++] = "";
                            continue;
                        }
                        if (var469 == 3614) {
                            var5--;
                            int var212 = field805[var5];
                            if (client.field507 != null && var212 < Statics.field225) {
                                field805[var5++] = Statics.field1683[var212].field633;
                                continue;
                            }
                            field805[var5++] = 0;
                            continue;
                        }
                        if (var469 == 3615) {
                            var5--;
                            int var213 = field805[var5];
                            if (client.field507 != null && var213 < Statics.field225) {
                                field805[var5++] = Statics.field1683[var213].field634;
                                continue;
                            }
                            field805[var5++] = 0;
                            continue;
                        }
                        if (var469 == 3616) {
                            field805[var5++] = Statics.field971;
                            continue;
                        }
                        if (var469 == 3617) {
                            var6--;
                            String var214 = field806[var6];
                            if (Statics.field1683 != null) {
                                client.field398.method2634(41);
                                client.field398.method2384(class123.method1542(var214));
                                client.field398.method2390(var214);
                            }
                            continue;
                        }
                        if (var469 == 3618) {
                            field805[var5++] = Statics.field1593;
                            continue;
                        }
                        if (var469 == 3619) {
                            var6--;
                            String var215 = field806[var6];
                            if (!var215.equals("")) {
                                client.field398.method2634(221);
                                client.field398.method2384(class123.method1542(var215));
                                client.field398.method2390(var215);
                            }
                            continue;
                        }
                        if (var469 == 3620) {
                            client.method3290();
                            continue;
                        }
                        if (var469 == 3621) {
                            if (client.field495 == 0) {
                                field805[var5++] = -1;
                            } else {
                                field805[var5++] = client.field295;
                            }
                            continue;
                        }
                        if (var469 == 3622) {
                            var5--;
                            int var216 = field805[var5];
                            if (client.field495 != 0 && var216 < client.field295) {
                                field806[var6++] = client.field333[var216].field129;
                                field806[var6++] = client.field333[var216].field130;
                                continue;
                            }
                            field806[var6++] = "";
                            field806[var6++] = "";
                            continue;
                        }
                        if (var469 == 3623) {
                            var6--;
                            String var217 = field806[var6];
                            if (var217.startsWith(class2.method2342(0)) || var217.startsWith(class2.method2342(1))) {
                                var217 = var217.substring(7);
                            }
                            field805[var5++] = client.method102(var217) ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3624) {
                            var5--;
                            int var218 = field805[var5];
                            if (Statics.field1683 != null && var218 < Statics.field225 && Statics.field1683[var218].field638.equalsIgnoreCase(Statics.field767.field56)) {
                                field805[var5++] = 1;
                                continue;
                            }
                            field805[var5++] = 0;
                            continue;
                        }
                        if (var469 == 3625) {
                            if (client.field508 == null) {
                                field806[var6++] = "";
                            } else {
                                field806[var6++] = class166.method551(client.field508);
                            }
                            continue;
                        }
                    } else if (var469 < 4000) {
                        if (var469 == 3903) {
                            var5--;
                            int var219 = field805[var5];
                            field805[var5++] = client.field556[var219].method3828();
                            continue;
                        }
                        if (var469 == 3904) {
                            var5--;
                            int var220 = field805[var5];
                            field805[var5++] = client.field556[var220].field3218;
                            continue;
                        }
                        if (var469 == 3905) {
                            var5--;
                            int var221 = field805[var5];
                            field805[var5++] = client.field556[var221].field3217;
                            continue;
                        }
                        if (var469 == 3906) {
                            var5--;
                            int var222 = field805[var5];
                            field805[var5++] = client.field556[var222].field3221;
                            continue;
                        }
                        if (var469 == 3907) {
                            var5--;
                            int var223 = field805[var5];
                            field805[var5++] = client.field556[var223].field3220;
                            continue;
                        }
                        if (var469 == 3908) {
                            var5--;
                            int var224 = field805[var5];
                            field805[var5++] = client.field556[var224].field3219;
                            continue;
                        }
                        if (var469 == 3910) {
                            var5--;
                            int var225 = field805[var5];
                            int var226 = client.field556[var225].method3819();
                            field805[var5++] = var226 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3911) {
                            var5--;
                            int var227 = field805[var5];
                            int var228 = client.field556[var227].method3819();
                            field805[var5++] = var228 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3912) {
                            var5--;
                            int var229 = field805[var5];
                            int var230 = client.field556[var229].method3819();
                            field805[var5++] = var230 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3913) {
                            var5--;
                            int var231 = field805[var5];
                            int var232 = client.field556[var231].method3819();
                            field805[var5++] = var232 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3914) {
                            var5--;
                            boolean var233 = field805[var5] == 1;
                            if (Statics.field194 != null) {
                                Statics.field194.method3836(class225.field3228, var233);
                            }
                            continue;
                        }
                        if (var469 == 3915) {
                            var5--;
                            boolean var234 = field805[var5] == 1;
                            if (Statics.field194 != null) {
                                Statics.field194.method3836(class225.field3227, var234);
                            }
                            continue;
                        }
                        if (var469 == 3916) {
                            var5 -= 2;
                            boolean var235 = field805[var5] == 1;
                            boolean var236 = field805[var5 + 1] == 1;
                            if (Statics.field194 != null) {
                                Statics.field194.method3836(new class23(var236), var235);
                            }
                            continue;
                        }
                        if (var469 == 3917) {
                            var5--;
                            boolean var237 = field805[var5] == 1;
                            if (Statics.field194 != null) {
                                Statics.field194.method3836(class225.field3226, var237);
                            }
                            continue;
                        }
                        if (var469 == 3918) {
                            var5--;
                            boolean var238 = field805[var5] == 1;
                            if (Statics.field194 != null) {
                                Statics.field194.method3836(class225.field3230, var238);
                            }
                            continue;
                        }
                        if (var469 == 3919) {
                            field805[var5++] = Statics.field194 == null ? 0 : Statics.field194.field3229.size();
                            continue;
                        }
                        if (var469 == 3920) {
                            var5--;
                            int var239 = field805[var5];
                            class218 var240 = (class218) Statics.field194.field3229.get(var239);
                            field805[var5++] = var240.field3197;
                            continue;
                        }
                        if (var469 == 3921) {
                            var5--;
                            int var241 = field805[var5];
                            class218 var242 = (class218) Statics.field194.field3229.get(var241);
                            field806[var6++] = var242.method3785();
                            continue;
                        }
                        if (var469 == 3922) {
                            var5--;
                            int var243 = field805[var5];
                            class218 var244 = (class218) Statics.field194.field3229.get(var243);
                            field806[var6++] = var244.method3783();
                            continue;
                        }
                        if (var469 == 3923) {
                            var5--;
                            int var245 = field805[var5];
                            class218 var246 = (class218) Statics.field194.field3229.get(var245);
                            long var247 = class119.method137() - Statics.field559 - var246.field3193;
                            int var249 = (int) (var247 / 3600000L);
                            int var250 = (int) ((var247 - (long) (var249 * 3600000)) / 60000L);
                            int var251 = (int) ((var247 - (long) (var249 * 3600000) - (long) (var250 * 60000)) / 1000L);
                            String var252 = var249 + ":" + var250 / 10 + var250 % 10 + ":" + var251 / 10 + var251 % 10;
                            field806[var6++] = var252;
                            continue;
                        }
                        if (var469 == 3924) {
                            var5--;
                            int var253 = field805[var5];
                            class218 var254 = (class218) Statics.field194.field3229.get(var253);
                            field805[var5++] = var254.field3195.field3221;
                            continue;
                        }
                        if (var469 == 3925) {
                            var5--;
                            int var255 = field805[var5];
                            class218 var256 = (class218) Statics.field194.field3229.get(var255);
                            field805[var5++] = var256.field3195.field3217;
                            continue;
                        }
                        if (var469 == 3926) {
                            var5--;
                            int var257 = field805[var5];
                            class218 var258 = (class218) Statics.field194.field3229.get(var257);
                            field805[var5++] = var258.field3195.field3218;
                            continue;
                        }
                    } else if (var469 < 4100) {
                        if (var469 == 4000) {
                            var5 -= 2;
                            int var259 = field805[var5];
                            int var260 = field805[var5 + 1];
                            field805[var5++] = var259 + var260;
                            continue;
                        }
                        if (var469 == 4001) {
                            var5 -= 2;
                            int var261 = field805[var5];
                            int var262 = field805[var5 + 1];
                            field805[var5++] = var261 - var262;
                            continue;
                        }
                        if (var469 == 4002) {
                            var5 -= 2;
                            int var263 = field805[var5];
                            int var264 = field805[var5 + 1];
                            field805[var5++] = var263 * var264;
                            continue;
                        }
                        if (var469 == 4003) {
                            var5 -= 2;
                            int var265 = field805[var5];
                            int var266 = field805[var5 + 1];
                            field805[var5++] = var265 / var266;
                            continue;
                        }
                        if (var469 == 4004) {
                            var5--;
                            int var267 = field805[var5];
                            field805[var5++] = (int) (Math.random() * (double) var267);
                            continue;
                        }
                        if (var469 == 4005) {
                            var5--;
                            int var268 = field805[var5];
                            field805[var5++] = (int) (Math.random() * (double) (var268 + 1));
                            continue;
                        }
                        if (var469 == 4006) {
                            var5 -= 5;
                            int var269 = field805[var5];
                            int var270 = field805[var5 + 1];
                            int var271 = field805[var5 + 2];
                            int var272 = field805[var5 + 3];
                            int var273 = field805[var5 + 4];
                            field805[var5++] = (var270 - var269) * (var273 - var271) / (var272 - var271) + var269;
                            continue;
                        }
                        if (var469 == 4007) {
                            var5 -= 2;
                            int var274 = field805[var5];
                            int var275 = field805[var5 + 1];
                            field805[var5++] = var274 * var275 / 100 + var274;
                            continue;
                        }
                        if (var469 == 4008) {
                            var5 -= 2;
                            int var276 = field805[var5];
                            int var277 = field805[var5 + 1];
                            field805[var5++] = var276 | 0x1 << var277;
                            continue;
                        }
                        if (var469 == 4009) {
                            var5 -= 2;
                            int var278 = field805[var5];
                            int var279 = field805[var5 + 1];
                            field805[var5++] = var278 & -1 - (0x1 << var279);
                            continue;
                        }
                        if (var469 == 4010) {
                            var5 -= 2;
                            int var280 = field805[var5];
                            int var281 = field805[var5 + 1];
                            field805[var5++] = (var280 & 0x1 << var281) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var469 == 4011) {
                            var5 -= 2;
                            int var282 = field805[var5];
                            int var283 = field805[var5 + 1];
                            field805[var5++] = var282 % var283;
                            continue;
                        }
                        if (var469 == 4012) {
                            var5 -= 2;
                            int var284 = field805[var5];
                            int var285 = field805[var5 + 1];
                            if (var284 == 0) {
                                field805[var5++] = 0;
                            } else {
                                field805[var5++] = (int) Math.pow((double) var284, (double) var285);
                            }
                            continue;
                        }
                        if (var469 == 4013) {
                            var5 -= 2;
                            int var286 = field805[var5];
                            int var287 = field805[var5 + 1];
                            if (var286 == 0) {
                                field805[var5++] = 0;
                            } else if (var287 == 0) {
                                field805[var5++] = Integer.MAX_VALUE;
                            } else {
                                field805[var5++] = (int) Math.pow((double) var286, 1.0D / (double) var287);
                            }
                            continue;
                        }
                        if (var469 == 4014) {
                            var5 -= 2;
                            int var288 = field805[var5];
                            int var289 = field805[var5 + 1];
                            field805[var5++] = var288 & var289;
                            continue;
                        }
                        if (var469 == 4015) {
                            var5 -= 2;
                            int var290 = field805[var5];
                            int var291 = field805[var5 + 1];
                            field805[var5++] = var290 | var291;
                            continue;
                        }
                        if (var469 == 4018) {
                            var5 -= 3;
                            long var292 = (long) field805[var5];
                            long var294 = (long) field805[var5 + 1];
                            long var296 = (long) field805[var5 + 2];
                            field805[var5++] = (int) (var292 * var296 / var294);
                            continue;
                        }
                    } else if (var469 < 4200) {
                        if (var469 == 4100) {
                            var6--;
                            String var298 = field806[var6];
                            var5--;
                            int var299 = field805[var5];
                            field806[var6++] = var298 + var299;
                            continue;
                        }
                        if (var469 == 4101) {
                            var6 -= 2;
                            String var300 = field806[var6];
                            String var301 = field806[var6 + 1];
                            field806[var6++] = var300 + var301;
                            continue;
                        }
                        if (var469 == 4102) {
                            var6--;
                            String var302 = field806[var6];
                            var5--;
                            int var303 = field805[var5];
                            field806[var6++] = var302 + class167.method2998(var303, true);
                            continue;
                        }
                        if (var469 == 4103) {
                            var6--;
                            String var304 = field806[var6];
                            field806[var6++] = var304.toLowerCase();
                            continue;
                        }
                        if (var469 == 4104) {
                            var5--;
                            int var305 = field805[var5];
                            long var306 = ((long) var305 + 11745L) * 86400000L;
                            field809.setTime(new Date(var306));
                            int var308 = field809.get(5);
                            int var309 = field809.get(2);
                            int var310 = field809.get(1);
                            field806[var6++] = var308 + "-" + field801[var309] + "-" + var310;
                            continue;
                        }
                        if (var469 == 4105) {
                            var6 -= 2;
                            String var311 = field806[var6];
                            String var312 = field806[var6 + 1];
                            if (Statics.field767.field32 != null && Statics.field767.field32.field2957) {
                                field806[var6++] = var312;
                                continue;
                            }
                            field806[var6++] = var311;
                            continue;
                        }
                        if (var469 == 4106) {
                            var5--;
                            int var313 = field805[var5];
                            field806[var6++] = Integer.toString(var313);
                            continue;
                        }
                        if (var469 == 4107) {
                            var6 -= 2;
                            int[] var314 = field805;
                            int var315 = var5++;
                            String var316 = field806[var6];
                            String var317 = field806[var6 + 1];
                            int var318 = client.field288;
                            int var319 = var316.length();
                            int var320 = var317.length();
                            int var321 = 0;
                            int var322 = 0;
                            char var323 = 0;
                            char var324 = 0;
                            int var325;
                            label2894: while (true) {
                                if (var321 - var323 >= var319 && var322 - var324 >= var320) {
                                    int var334 = Math.min(var319, var320);
                                    for (int var335 = 0; var335 < var334; var335++) {
                                        char var338 = var316.charAt(var335);
                                        char var339 = var317.charAt(var335);
                                        if (var338 != var339 && Character.toUpperCase(var338) != Character.toUpperCase(var339)) {
                                            char var340 = Character.toLowerCase(var338);
                                            char var341 = Character.toLowerCase(var339);
                                            if (var340 != var341) {
                                                var325 = class170.method2813(var340, var318) - class170.method2813(var341, var318);
                                                break label2894;
                                            }
                                        }
                                    }
                                    int var342 = var319 - var320;
                                    if (var342 == 0) {
                                        for (int var343 = 0; var343 < var334; var343++) {
                                            char var344 = var316.charAt(var343);
                                            char var345 = var317.charAt(var343);
                                            if (var344 != var345) {
                                                var325 = class170.method2813(var344, var318) - class170.method2813(var345, var318);
                                                break label2894;
                                            }
                                        }
                                        var325 = 0;
                                    } else {
                                        var325 = var342;
                                    }
                                    break;
                                }
                                if (var321 - var323 >= var319) {
                                    var325 = -1;
                                    break;
                                }
                                if (var322 - var324 >= var320) {
                                    var325 = 1;
                                    break;
                                }
                                char var326;
                                if (var323 == 0) {
                                    var326 = var316.charAt(var321++);
                                } else {
                                    var326 = var323;
                                    boolean var327 = false;
                                }
                                char var328;
                                if (var324 == 0) {
                                    var328 = var317.charAt(var322++);
                                } else {
                                    var328 = var324;
                                    boolean var329 = false;
                                }
                                var323 = class170.method2681(var326);
                                var324 = class170.method2681(var328);
                                char var330 = class170.method1648(var326, var318);
                                char var331 = class170.method1648(var328, var318);
                                if (var330 != var331 && Character.toUpperCase(var330) != Character.toUpperCase(var331)) {
                                    char var332 = Character.toLowerCase(var330);
                                    char var333 = Character.toLowerCase(var331);
                                    if (var332 != var333) {
                                        var325 = class170.method2813(var332, var318) - class170.method2813(var333, var318);
                                        break;
                                    }
                                }
                            }
                            byte var347;
                            if (var325 > 0) {
                                var347 = 1;
                            } else if (var325 < 0) {
                                var347 = -1;
                            } else {
                                var347 = 0;
                            }
                            var314[var315] = var347;
                            continue;
                        }
                        if (var469 == 4108) {
                            var6--;
                            String var348 = field806[var6];
                            var5 -= 2;
                            int var349 = field805[var5];
                            int var350 = field805[var5 + 1];
                            byte[] var351 = Statics.field2302.method3107(var350, 0);
                            class228 var352 = new class228(var351);
                            field805[var5++] = var352.method3850(var348, var349);
                            continue;
                        }
                        if (var469 == 4109) {
                            var6--;
                            String var353 = field806[var6];
                            var5 -= 2;
                            int var354 = field805[var5];
                            int var355 = field805[var5 + 1];
                            byte[] var356 = Statics.field2302.method3107(var355, 0);
                            class228 var357 = new class228(var356);
                            field805[var5++] = var357.method3849(var353, var354);
                            continue;
                        }
                        if (var469 == 4110) {
                            var6 -= 2;
                            String var358 = field806[var6];
                            String var359 = field806[var6 + 1];
                            var5--;
                            if (field805[var5] == 1) {
                                field806[var6++] = var358;
                            } else {
                                field806[var6++] = var359;
                            }
                            continue;
                        }
                        if (var469 == 4111) {
                            var6--;
                            String var360 = field806[var6];
                            field806[var6++] = class227.method3926(var360);
                            continue;
                        }
                        if (var469 == 4112) {
                            var6--;
                            String var361 = field806[var6];
                            var5--;
                            int var362 = field805[var5];
                            field806[var6++] = var361 + (char) var362;
                            continue;
                        }
                        if (var469 == 4113) {
                            var5--;
                            int var363 = field805[var5];
                            int[] var364 = field805;
                            int var365 = var5++;
                            char var366 = (char) var363;
                            boolean var367;
                            if (var366 >= ' ' && var366 <= '~') {
                                var367 = true;
                            } else if (var366 >= 160 && var366 <= 255) {
                                var367 = true;
                            } else if (var366 == 8364 || var366 == 338 || var366 == 8212 || var366 == 339 || var366 == 376) {
                                var367 = true;
                            } else {
                                var367 = false;
                            }
                            var364[var365] = var367 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 4114) {
                            var5--;
                            int var368 = field805[var5];
                            int[] var369 = field805;
                            int var370 = var5++;
                            char var371 = (char) var368;
                            boolean var372 = var371 >= '0' && var371 <= '9' || var371 >= 'A' && var371 <= 'Z' || var371 >= 'a' && var371 <= 'z';
                            var369[var370] = var372 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 4115) {
                            var5--;
                            int var373 = field805[var5];
                            field805[var5++] = class167.method1043((char) var373) ? 1 : 0;
                            continue;
                        }
                        if (var469 == 4116) {
                            var5--;
                            int var374 = field805[var5];
                            field805[var5++] = class167.method3062((char) var374) ? 1 : 0;
                            continue;
                        }
                        if (var469 == 4117) {
                            var6--;
                            String var375 = field806[var6];
                            if (var375 == null) {
                                field805[var5++] = 0;
                            } else {
                                field805[var5++] = var375.length();
                            }
                            continue;
                        }
                        if (var469 == 4118) {
                            var6--;
                            String var376 = field806[var6];
                            var5 -= 2;
                            int var377 = field805[var5];
                            int var378 = field805[var5 + 1];
                            field806[var6++] = var376.substring(var377, var378);
                            continue;
                        }
                        if (var469 == 4119) {
                            var6--;
                            String var379 = field806[var6];
                            StringBuilder var380 = new StringBuilder(var379.length());
                            boolean var381 = false;
                            for (int var382 = 0; var382 < var379.length(); var382++) {
                                char var383 = var379.charAt(var382);
                                if (var383 == '<') {
                                    var381 = true;
                                } else if (var383 == '>') {
                                    var381 = false;
                                } else if (!var381) {
                                    var380.append(var383);
                                }
                            }
                            field806[var6++] = var380.toString();
                            continue;
                        }
                        if (var469 == 4120) {
                            var6--;
                            String var384 = field806[var6];
                            var5--;
                            int var385 = field805[var5];
                            field805[var5++] = var384.indexOf(var385);
                            continue;
                        }
                        if (var469 == 4121) {
                            var6 -= 2;
                            String var386 = field806[var6];
                            String var387 = field806[var6 + 1];
                            var5--;
                            int var388 = field805[var5];
                            field805[var5++] = var386.indexOf(var387, var388);
                            continue;
                        }
                    } else if (var469 < 4300) {
                        if (var469 == 4200) {
                            var5--;
                            int var389 = field805[var5];
                            field806[var6++] = class56.method905(var389).field1201;
                            continue;
                        }
                        if (var469 == 4201) {
                            var5 -= 2;
                            int var390 = field805[var5];
                            int var391 = field805[var5 + 1];
                            class56 var392 = class56.method905(var390);
                            if (var391 >= 1 && var391 <= 5 && var392.field1176[var391 - 1] != null) {
                                field806[var6++] = var392.field1176[var391 - 1];
                                continue;
                            }
                            field806[var6++] = "";
                            continue;
                        }
                        if (var469 == 4202) {
                            var5 -= 2;
                            int var393 = field805[var5];
                            int var394 = field805[var5 + 1];
                            class56 var395 = class56.method905(var393);
                            if (var394 >= 1 && var394 <= 5 && var395.field1177[var394 - 1] != null) {
                                field806[var6++] = var395.field1177[var394 - 1];
                                continue;
                            }
                            field806[var6++] = "";
                            continue;
                        }
                        if (var469 == 4203) {
                            var5--;
                            int var396 = field805[var5];
                            field805[var5++] = class56.method905(var396).field1181;
                            continue;
                        }
                        if (var469 == 4204) {
                            var5--;
                            int var397 = field805[var5];
                            field805[var5++] = class56.method905(var397).field1173 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 4205) {
                            var5--;
                            int var398 = field805[var5];
                            class56 var399 = class56.method905(var398);
                            if (var399.field1193 == -1 && var399.field1192 >= 0) {
                                field805[var5++] = var399.field1192;
                                continue;
                            }
                            field805[var5++] = var398;
                            continue;
                        }
                        if (var469 == 4206) {
                            var5--;
                            int var400 = field805[var5];
                            class56 var401 = class56.method905(var400);
                            if (var401.field1193 >= 0 && var401.field1192 >= 0) {
                                field805[var5++] = var401.field1192;
                                continue;
                            }
                            field805[var5++] = var400;
                            continue;
                        }
                        if (var469 == 4207) {
                            var5--;
                            int var402 = field805[var5];
                            field805[var5++] = class56.method905(var402).field1168 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 4208) {
                            var5--;
                            int var403 = field805[var5];
                            class56 var404 = class56.method905(var403);
                            if (var404.field1204 == -1 && var404.field1203 >= 0) {
                                field805[var5++] = var404.field1203;
                                continue;
                            }
                            field805[var5++] = var403;
                            continue;
                        }
                        if (var469 == 4209) {
                            var5--;
                            int var405 = field805[var5];
                            class56 var406 = class56.method905(var405);
                            if (var406.field1204 >= 0 && var406.field1203 >= 0) {
                                field805[var5++] = var406.field1203;
                                continue;
                            }
                            field805[var5++] = var405;
                            continue;
                        }
                        if (var469 == 4210) {
                            var6--;
                            String var407 = field806[var6];
                            var5--;
                            int var408 = field805[var5];
                            boolean var410 = var408 == 1;
                            String var411 = var407.toLowerCase();
                            short[] var412 = new short[16];
                            int var413 = 0;
                            int var414 = 0;
                            while (true) {
                                if (var414 >= Statics.field3102) {
                                    Statics.field196 = var412;
                                    Statics.field1078 = 0;
                                    Statics.field689 = var413;
                                    String[] var418 = new String[Statics.field689];
                                    for (int var419 = 0; var419 < Statics.field689; var419++) {
                                        var418[var419] = class56.method905(var412[var419]).field1201;
                                    }
                                    short[] var420 = Statics.field196;
                                    class128.method2091(var418, var420, 0, var418.length - 1);
                                    break;
                                }
                                class56 var415 = class56.method905(var414);
                                if ((!var410 || var415.field1200) && var415.field1193 == -1 && var415.field1201.toLowerCase().indexOf(var411) != -1) {
                                    if (var413 >= 250) {
                                        Statics.field689 = -1;
                                        Statics.field196 = null;
                                        break;
                                    }
                                    if (var413 >= var412.length) {
                                        short[] var416 = new short[var412.length * 2];
                                        for (int var417 = 0; var417 < var413; var417++) {
                                            var416[var417] = var412[var417];
                                        }
                                        var412 = var416;
                                    }
                                    var412[var413++] = (short) var414;
                                }
                                var414++;
                            }
                            field805[var5++] = Statics.field689;
                            continue;
                        }
                        if (var469 == 4211) {
                            if (Statics.field196 != null && Statics.field1078 < Statics.field689) {
                                field805[var5++] = Statics.field196[++Statics.field1078 - 1] & 0xFFFF;
                                continue;
                            }
                            field805[var5++] = -1;
                            continue;
                        }
                        if (var469 == 4212) {
                            Statics.field1078 = 0;
                            continue;
                        }
                    } else if (var469 < 5100) {
                        if (var469 == 5000) {
                            field805[var5++] = client.field498;
                            continue;
                        }
                        if (var469 == 5001) {
                            var5 -= 3;
                            client.field498 = field805[var5];
                            Statics.field2101 = class134.method588(field805[var5 + 1]);
                            if (Statics.field2101 == null) {
                                Statics.field2101 = class134.field2117;
                            }
                            client.field325 = field805[var5 + 2];
                            client.field398.method2634(157);
                            client.field398.method2384(client.field498);
                            client.field398.method2384(Statics.field2101.field2112);
                            client.field398.method2384(client.field325);
                            continue;
                        }
                        if (var469 == 5002) {
                            var6--;
                            String var421 = field806[var6];
                            var5 -= 2;
                            int var422 = field805[var5];
                            int var423 = field805[var5 + 1];
                            client.field398.method2634(240);
                            client.field398.method2384(class123.method1542(var421) + 2);
                            client.field398.method2390(var421);
                            client.field398.method2384(var422 - 1);
                            client.field398.method2384(var423);
                            continue;
                        }
                        if (var469 == 5003) {
                            var5 -= 2;
                            int var424 = field805[var5];
                            int var425 = field805[var5 + 1];
                            class30 var426 = (class30) class12.field172.get(var424);
                            class38 var427 = var426.method652(var425);
                            if (var427 == null) {
                                field805[var5++] = -1;
                                field805[var5++] = 0;
                                field806[var6++] = "";
                                field806[var6++] = "";
                                field806[var6++] = "";
                            } else {
                                field805[var5++] = var427.field794;
                                field805[var5++] = var427.field792;
                                field806[var6++] = var427.field791 == null ? "" : var427.field791;
                                field806[var6++] = var427.field795 == null ? "" : var427.field795;
                                field806[var6++] = var427.field796 == null ? "" : var427.field796;
                            }
                            continue;
                        }
                        if (var469 == 5004) {
                            var5--;
                            int var429 = field805[var5];
                            class38 var430 = (class38) class12.field168.method3637((long) var429);
                            if (var430 == null) {
                                field805[var5++] = -1;
                                field805[var5++] = 0;
                                field806[var6++] = "";
                                field806[var6++] = "";
                                field806[var6++] = "";
                            } else {
                                field805[var5++] = var430.field793;
                                field805[var5++] = var430.field792;
                                field806[var6++] = var430.field791 == null ? "" : var430.field791;
                                field806[var6++] = var430.field795 == null ? "" : var430.field795;
                                field806[var6++] = var430.field796 == null ? "" : var430.field796;
                            }
                            continue;
                        }
                        if (var469 == 5005) {
                            if (Statics.field2101 == null) {
                                field805[var5++] = -1;
                            } else {
                                field805[var5++] = Statics.field2101.field2112;
                            }
                            continue;
                        }
                        if (var469 == 5008) {
                            var6--;
                            String var432 = field806[var6];
                            var5--;
                            int var433 = field805[var5];
                            String var434 = var432.toLowerCase();
                            byte var435 = 0;
                            if (var434.startsWith(class161.field2367)) {
                                var435 = 0;
                                var432 = var432.substring(class161.field2367.length());
                            } else if (var434.startsWith(class161.field2549)) {
                                var435 = 1;
                                var432 = var432.substring(class161.field2549.length());
                            } else if (var434.startsWith(class161.field2512)) {
                                var435 = 2;
                                var432 = var432.substring(class161.field2512.length());
                            } else if (var434.startsWith(class161.field2424)) {
                                var435 = 3;
                                var432 = var432.substring(class161.field2424.length());
                            } else if (var434.startsWith(class161.field2530)) {
                                var435 = 4;
                                var432 = var432.substring(class161.field2530.length());
                            } else if (var434.startsWith(class161.field2440)) {
                                var435 = 5;
                                var432 = var432.substring(class161.field2440.length());
                            } else if (var434.startsWith(class161.field2534)) {
                                var435 = 6;
                                var432 = var432.substring(class161.field2534.length());
                            } else if (var434.startsWith(class161.field2595)) {
                                var435 = 7;
                                var432 = var432.substring(class161.field2595.length());
                            } else if (var434.startsWith(class161.field2538)) {
                                var435 = 8;
                                var432 = var432.substring(class161.field2538.length());
                            } else if (var434.startsWith(class161.field2540)) {
                                var435 = 9;
                                var432 = var432.substring(class161.field2540.length());
                            } else if (var434.startsWith(class161.field2542)) {
                                var435 = 10;
                                var432 = var432.substring(class161.field2542.length());
                            } else if (var434.startsWith(class161.field2544)) {
                                var435 = 11;
                                var432 = var432.substring(class161.field2544.length());
                            } else if (client.field288 != 0) {
                                if (var434.startsWith(class161.field2398)) {
                                    var435 = 0;
                                    var432 = var432.substring(class161.field2398.length());
                                } else if (var434.startsWith(class161.field2525)) {
                                    var435 = 1;
                                    var432 = var432.substring(class161.field2525.length());
                                } else if (var434.startsWith(class161.field2527)) {
                                    var435 = 2;
                                    var432 = var432.substring(class161.field2527.length());
                                } else if (var434.startsWith(class161.field2529)) {
                                    var435 = 3;
                                    var432 = var432.substring(class161.field2529.length());
                                } else if (var434.startsWith(class161.field2422)) {
                                    var435 = 4;
                                    var432 = var432.substring(class161.field2422.length());
                                } else if (var434.startsWith(class161.field2533)) {
                                    var435 = 5;
                                    var432 = var432.substring(class161.field2533.length());
                                } else if (var434.startsWith(class161.field2370)) {
                                    var435 = 6;
                                    var432 = var432.substring(class161.field2370.length());
                                } else if (var434.startsWith(class161.field2537)) {
                                    var435 = 7;
                                    var432 = var432.substring(class161.field2537.length());
                                } else if (var434.startsWith(class161.field2396)) {
                                    var435 = 8;
                                    var432 = var432.substring(class161.field2396.length());
                                } else if (var434.startsWith(class161.field2567)) {
                                    var435 = 9;
                                    var432 = var432.substring(class161.field2567.length());
                                } else if (var434.startsWith(class161.field2543)) {
                                    var435 = 10;
                                    var432 = var432.substring(class161.field2543.length());
                                } else if (var434.startsWith(class161.field2545)) {
                                    var435 = 11;
                                    var432 = var432.substring(class161.field2545.length());
                                }
                            }
                            String var436 = var432.toLowerCase();
                            byte var437 = 0;
                            if (var436.startsWith(class161.field2497)) {
                                var437 = 1;
                                var432 = var432.substring(class161.field2497.length());
                            } else if (var436.startsWith(class161.field2361)) {
                                var437 = 2;
                                var432 = var432.substring(class161.field2361.length());
                            } else if (var436.startsWith(class161.field2550)) {
                                var437 = 3;
                                var432 = var432.substring(class161.field2550.length());
                            } else if (var436.startsWith(class161.field2606)) {
                                var437 = 4;
                                var432 = var432.substring(class161.field2606.length());
                            } else if (var436.startsWith(class161.field2405)) {
                                var437 = 5;
                                var432 = var432.substring(class161.field2405.length());
                            } else if (client.field288 != 0) {
                                if (var436.startsWith(class161.field2547)) {
                                    var437 = 1;
                                    var432 = var432.substring(class161.field2547.length());
                                } else if (var436.startsWith(class161.field2562)) {
                                    var437 = 2;
                                    var432 = var432.substring(class161.field2562.length());
                                } else if (var436.startsWith(class161.field2551)) {
                                    var437 = 3;
                                    var432 = var432.substring(class161.field2551.length());
                                } else if (var436.startsWith(class161.field2553)) {
                                    var437 = 4;
                                    var432 = var432.substring(class161.field2553.length());
                                } else if (var436.startsWith(class161.field2423)) {
                                    var437 = 5;
                                    var432 = var432.substring(class161.field2423.length());
                                }
                            }
                            client.field398.method2634(254);
                            client.field398.method2384(0);
                            int var438 = client.field398.field2052;
                            client.field398.method2384(var433);
                            client.field398.method2384(var435);
                            client.field398.method2384(var437);
                            class226.method2986(client.field398, var432);
                            client.field398.method2396(client.field398.field2052 - var438);
                            continue;
                        }
                        if (var469 == 5009) {
                            var6 -= 2;
                            String var439 = field806[var6];
                            String var440 = field806[var6 + 1];
                            client.field398.method2634(150);
                            client.field398.method2385(0);
                            int var441 = client.field398.field2052;
                            client.field398.method2390(var439);
                            class226.method2986(client.field398, var440);
                            client.field398.method2395(client.field398.field2052 - var441);
                            continue;
                        }
                        if (var469 == 5015) {
                            String var442;
                            if (Statics.field767 == null || Statics.field767.field56 == null) {
                                var442 = "";
                            } else {
                                var442 = Statics.field767.field56;
                            }
                            field806[var6++] = var442;
                            continue;
                        }
                        if (var469 == 5016) {
                            field805[var5++] = client.field325;
                            continue;
                        }
                        if (var469 == 5017) {
                            var5--;
                            int var443 = field805[var5];
                            field805[var5++] = class12.method617(var443);
                            continue;
                        }
                        if (var469 == 5018) {
                            var5--;
                            int var444 = field805[var5];
                            field805[var5++] = class12.method2298(var444);
                            continue;
                        }
                        if (var469 == 5019) {
                            var5--;
                            int var445 = field805[var5];
                            field805[var5++] = Statics.method1854(var445);
                            continue;
                        }
                        if (var469 == 5020) {
                            var6--;
                            String var446 = field806[var6];
                            if (var446.equalsIgnoreCase("toggleroof")) {
                                Statics.field233.field150 = !Statics.field233.field150;
                                class9.method188();
                                if (Statics.field233.field150) {
                                    class12.method3563(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method3563(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var446.equalsIgnoreCase("displayfps")) {
                                client.field297 = !client.field297;
                            }
                            if (client.field447 >= 2) {
                                if (var446.equalsIgnoreCase("fpson")) {
                                    client.field297 = true;
                                }
                                if (var446.equalsIgnoreCase("fpsoff")) {
                                    client.field297 = false;
                                }
                                if (var446.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var446.equalsIgnoreCase("clientdrop")) {
                                    client.method1139();
                                }
                                if (var446.equalsIgnoreCase("errortest") && client.field344 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field398.method2634(227);
                            client.field398.method2384(var446.length() + 1);
                            client.field398.method2390(var446);
                            continue;
                        }
                        if (var469 == 5021) {
                            var6--;
                            client.field500 = field806[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var469 == 5022) {
                            field806[var6++] = client.field500;
                            continue;
                        }
                    }
                }
                if (var469 < 5400) {
                    if (var469 == 5306) {
                        field805[var5++] = client.method2992();
                        continue;
                    }
                    if (var469 == 5307) {
                        var5--;
                        int var447 = field805[var5];
                        if (var447 != 1 && var447 != 2) {
                            continue;
                        }
                        client.field455 = 0L;
                        if (var447 >= 2) {
                            client.field494 = true;
                        } else {
                            client.field494 = false;
                        }
                        client.method989();
                        if (client.field289 >= 25) {
                            client.method153();
                        }
                        class148.field2251 = true;
                        continue;
                    }
                    if (var469 == 5308) {
                        field805[var5++] = Statics.field233.field137;
                        continue;
                    }
                    if (var469 == 5309) {
                        var5--;
                        int var448 = field805[var5];
                        if (var448 == 1 || var448 == 2) {
                            Statics.field233.field137 = var448;
                            class9.method188();
                        }
                        continue;
                    }
                }
                if (var469 < 5600) {
                    if (var469 == 5504) {
                        var5 -= 2;
                        int var449 = field805[var5];
                        int var450 = field805[var5 + 1];
                        if (!client.field563) {
                            client.field366 = var449;
                            client.field367 = var450;
                        }
                        continue;
                    }
                    if (var469 == 5505) {
                        field805[var5++] = client.field366;
                        continue;
                    }
                    if (var469 == 5506) {
                        field805[var5++] = client.field367;
                        continue;
                    }
                    if (var469 == 5530) {
                        var5--;
                        int var451 = field805[var5];
                        if (var451 < 0) {
                            var451 = 0;
                        }
                        client.field372 = var451;
                        continue;
                    }
                    if (var469 == 5531) {
                        field805[var5++] = client.field372;
                        continue;
                    }
                }
                if (var469 >= 5700 || var469 != 5630) {
                    if (var469 < 6300) {
                        if (var469 == 6200) {
                            var5 -= 2;
                            client.field411 = (short) field805[var5];
                            if (client.field411 <= 0) {
                                client.field411 = 256;
                            }
                            client.field543 = (short) field805[var5 + 1];
                            if (client.field543 <= 0) {
                                client.field543 = 205;
                            }
                            continue;
                        }
                        if (var469 == 6201) {
                            var5 -= 2;
                            client.field514 = (short) field805[var5];
                            if (client.field514 <= 0) {
                                client.field514 = 256;
                            }
                            client.field537 = (short) field805[var5 + 1];
                            if (client.field537 <= 0) {
                                client.field537 = 320;
                            }
                            continue;
                        }
                        if (var469 == 6202) {
                            var5 -= 4;
                            client.field538 = (short) field805[var5];
                            if (client.field538 <= 0) {
                                client.field538 = 1;
                            }
                            client.field539 = (short) field805[var5 + 1];
                            if (client.field539 <= 0) {
                                client.field539 = 32767;
                            } else if (client.field539 < client.field538) {
                                client.field539 = client.field538;
                            }
                            client.field540 = (short) field805[var5 + 2];
                            if (client.field540 <= 0) {
                                client.field540 = 1;
                            }
                            client.field541 = (short) field805[var5 + 3];
                            if (client.field541 <= 0) {
                                client.field541 = 32767;
                            } else if (client.field541 < client.field540) {
                                client.field541 = client.field540;
                            }
                            continue;
                        }
                        if (var469 == 6203) {
                            if (client.field452 == null) {
                                field805[var5++] = -1;
                                field805[var5++] = -1;
                            } else {
                                client.method674(0, 0, client.field452.field2804, client.field452.field2906, false);
                                field805[var5++] = client.field544;
                                field805[var5++] = client.field412;
                            }
                            continue;
                        }
                        if (var469 == 6204) {
                            field805[var5++] = client.field514;
                            field805[var5++] = client.field537;
                            continue;
                        }
                        if (var469 == 6205) {
                            field805[var5++] = client.field411;
                            field805[var5++] = client.field543;
                            continue;
                        }
                    }
                    if (var469 < 6600) {
                        if (var469 == 6500) {
                            field805[var5++] = Statics.method725() ? 1 : 0;
                            continue;
                        }
                        if (var469 == 6501) {
                            class28.field660 = 0;
                            class28 var452 = class28.method756();
                            if (var452 == null) {
                                field805[var5++] = -1;
                                field805[var5++] = 0;
                                field806[var6++] = "";
                                field805[var5++] = 0;
                                field805[var5++] = 0;
                                field806[var6++] = "";
                            } else {
                                field805[var5++] = var452.field651;
                                field805[var5++] = var452.field657;
                                field806[var6++] = var452.field667;
                                field805[var5++] = var452.field661;
                                field805[var5++] = var452.field653;
                                field806[var6++] = var452.field659;
                            }
                            continue;
                        }
                        if (var469 == 6502) {
                            class28 var454 = class28.method756();
                            if (var454 == null) {
                                field805[var5++] = -1;
                                field805[var5++] = 0;
                                field806[var6++] = "";
                                field805[var5++] = 0;
                                field805[var5++] = 0;
                                field806[var6++] = "";
                            } else {
                                field805[var5++] = var454.field651;
                                field805[var5++] = var454.field657;
                                field806[var6++] = var454.field667;
                                field805[var5++] = var454.field661;
                                field805[var5++] = var454.field653;
                                field806[var6++] = var454.field659;
                            }
                            continue;
                        }
                        if (var469 == 6506) {
                            var5--;
                            int var455 = field805[var5];
                            class28 var456 = null;
                            for (int var457 = 0; var457 < class28.field652; var457++) {
                                if (Statics.field650[var457].field651 == var455) {
                                    var456 = Statics.field650[var457];
                                    break;
                                }
                            }
                            if (var456 == null) {
                                field805[var5++] = -1;
                                field805[var5++] = 0;
                                field806[var6++] = "";
                                field805[var5++] = 0;
                                field805[var5++] = 0;
                                field806[var6++] = "";
                            } else {
                                field805[var5++] = var456.field651;
                                field805[var5++] = var456.field657;
                                field806[var6++] = var456.field667;
                                field805[var5++] = var456.field661;
                                field805[var5++] = var456.field653;
                                field806[var6++] = var456.field659;
                            }
                            continue;
                        }
                        if (var469 == 6507) {
                            var5 -= 4;
                            int var458 = field805[var5];
                            boolean var459 = field805[var5 + 1] == 1;
                            int var460 = field805[var5 + 2];
                            boolean var461 = field805[var5 + 3] == 1;
                            if (Statics.field650 != null) {
                                class28.method2811(0, Statics.field650.length - 1, var458, var459, var460, var461);
                            }
                            continue;
                        }
                        if (var469 == 6511) {
                            var5--;
                            int var462 = field805[var5];
                            if (var462 >= 0 && var462 < class28.field652) {
                                class28 var463 = Statics.field650[var462];
                                field805[var5++] = var463.field651;
                                field805[var5++] = var463.field657;
                                field806[var6++] = var463.field667;
                                field805[var5++] = var463.field661;
                                field805[var5++] = var463.field653;
                                field806[var6++] = var463.field659;
                                continue;
                            }
                            field805[var5++] = -1;
                            field805[var5++] = 0;
                            field806[var6++] = "";
                            field805[var5++] = 0;
                            field805[var5++] = 0;
                            field806[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field336 = 250;
            }
        } catch (Exception var468) {
            StringBuilder var465 = new StringBuilder(30);
            var465.append("").append(var4.field3167).append(" ");
            for (int var466 = field807 - 1; var466 >= 0; var466--) {
                var465.append("").append(field808[var466].field217.field3167).append(" ");
            }
            var465.append("").append(var10);
            class152.method2194(var465.toString(), var468);
        }
    }

    @ObfuscatedName("as.n(IS)V")
    public static void method748(int arg0) {
        if (arg0 == -1 || !class177.method3200(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2910[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3.field2870 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field2 = var3.field2870;
                method608(var4, 2000000);
            }
        }
    }
}
