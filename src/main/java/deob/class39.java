package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aw")
public class class39 {

    @ObfuscatedName("aw.z")
    public static int[] field828 = new int[5];

    @ObfuscatedName("aw.t")
    public static int[][] field829 = new int[5][5000];

    @ObfuscatedName("aw.n")
    public static int[] field834 = new int[1000];

    @ObfuscatedName("aw.i")
    public static String[] field831 = new String[1000];

    @ObfuscatedName("aw.g")
    public static int field825 = 0;

    @ObfuscatedName("aw.m")
    public static class15[] field839 = new class15[50];

    @ObfuscatedName("aw.u")
    public static Calendar field835 = Calendar.getInstance();

    @ObfuscatedName("aw.j")
    public static final String[] field832 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("aw.q")
    public static int field836 = 0;

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.a(La;II)V")
    public static void method10(class1 arg0, int arg1) {
        Object[] var2 = arg0.field8;
        int var3 = (Integer) var2[0];
        class24 var4 = class24.method2(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field604;
        int[] var9 = var4.field601;
        byte var10 = -1;
        field825 = 0;
        try {
            Statics.field809 = new int[var4.field603];
            int var11 = 0;
            Statics.field827 = new String[var4.field606];
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
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2817;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field11;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2909;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field6 == null ? -1 : arg0.field6.field2817;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field6 == null ? -1 : arg0.field6.field2909;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field809[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1;
                    }
                    Statics.field827[var12++] = var15;
                }
            }
            int var16 = 0;
            field836 = arg0.field12;
            label3208: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var513 = var8[var7];
                if (var513 < 100) {
                    if (var513 == 0) {
                        field834[var5++] = var9[var7];
                        continue;
                    }
                    if (var513 == 1) {
                        int var17 = var9[var7];
                        field834[var5++] = class180.field2969[var17];
                        continue;
                    }
                    if (var513 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class180.field2969[var18] = field834[var5];
                        client.method737(var18);
                        continue;
                    }
                    if (var513 == 3) {
                        field831[var6++] = var4.field602[var7];
                        continue;
                    }
                    if (var513 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var513 == 7) {
                        var5 -= 2;
                        if (field834[var5 + 1] != field834[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var513 == 8) {
                        var5 -= 2;
                        if (field834[var5 + 1] == field834[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var513 == 9) {
                        var5 -= 2;
                        if (field834[var5] < field834[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var513 == 10) {
                        var5 -= 2;
                        if (field834[var5] > field834[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var513 == 21) {
                        if (field825 == 0) {
                            return;
                        }
                        class15 var19 = field839[--field825];
                        var4 = var19.field211;
                        var8 = var4.field604;
                        var9 = var4.field601;
                        var7 = var19.field205;
                        Statics.field809 = var19.field204;
                        Statics.field827 = var19.field207;
                        continue;
                    }
                    if (var513 == 25) {
                        int var20 = var9[var7];
                        field834[var5++] = class180.method3001(var20);
                        continue;
                    }
                    if (var513 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field834[var5];
                        class51 var23 = class51.method599(var21);
                        int var24 = var23.field1112;
                        int var25 = var23.field1111;
                        int var26 = var23.field1114;
                        int var27 = class180.field2968[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class180.field2969[var24] = class180.field2969[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var513 == 31) {
                        var5 -= 2;
                        if (field834[var5] <= field834[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var513 == 32) {
                        var5 -= 2;
                        if (field834[var5] >= field834[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var513 == 33) {
                        field834[var5++] = Statics.field809[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var513 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field809[var10001] = field834[var5];
                        continue;
                    }
                    if (var513 == 35) {
                        field831[var6++] = Statics.field827[var9[var7]];
                        continue;
                    }
                    if (var513 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field827[var10001] = field831[var6];
                        continue;
                    }
                    if (var513 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field831;
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
                        field831[var6++] = var31;
                        continue;
                    }
                    if (var513 == 38) {
                        var5--;
                        continue;
                    }
                    if (var513 == 39) {
                        var6--;
                        continue;
                    }
                    if (var513 == 40) {
                        int var41 = var9[var7];
                        class24 var42 = class24.method2(var41);
                        int[] var43 = new int[var42.field603];
                        String[] var44 = new String[var42.field606];
                        for (int var45 = 0; var45 < var42.field605; var45++) {
                            var43[var45] = field834[var5 - var42.field605 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field599; var46++) {
                            var44[var46] = field831[var6 - var42.field599 + var46];
                        }
                        var5 -= var42.field605;
                        var6 -= var42.field599;
                        class15 var47 = new class15();
                        var47.field211 = var4;
                        var47.field205 = var7;
                        var47.field204 = Statics.field809;
                        var47.field207 = Statics.field827;
                        field839[++field825 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field604;
                        var9 = var42.field601;
                        var7 = -1;
                        Statics.field809 = var43;
                        Statics.field827 = var44;
                        continue;
                    }
                    if (var513 == 42) {
                        field834[var5++] = Statics.field237.method197(var9[var7]);
                        continue;
                    }
                    if (var513 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field237.method211(var10001, field834[var5]);
                        continue;
                    }
                    if (var513 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field834[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field828[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label3208;
                                }
                                field829[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var513 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field834[var5];
                        if (var54 >= 0 && var54 < field828[var53]) {
                            field834[var5++] = field829[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var513 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field834[var5];
                        if (var56 >= 0 && var56 < field828[var55]) {
                            field829[var55][var56] = field834[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var513 == 47) {
                        String var57 = Statics.field237.method199(var9[var7]);
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field831[var6++] = var57;
                        continue;
                    }
                    if (var513 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field237.method198(var10001, field831[var6]);
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var513 < 1000) {
                    if (var513 == 100) {
                        var5 -= 3;
                        int var59 = field834[var5];
                        int var60 = field834[var5 + 1];
                        int var61 = field834[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class177 var62 = class177.method595(var59);
                        if (var62.field2941 == null) {
                            var62.field2941 = new class177[var61 + 1];
                        }
                        if (var62.field2941.length <= var61) {
                            class177[] var63 = new class177[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2941.length; var64++) {
                                var63[var64] = var62.field2941[var64];
                            }
                            var62.field2941 = var63;
                        }
                        if (var61 > 0 && var62.field2941[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class177 var65 = new class177();
                        var65.field2819 = var60;
                        var65.field2836 = var65.field2817 = var62.field2817;
                        var65.field2909 = var61;
                        var65.field2816 = true;
                        var62.field2941[var61] = var65;
                        if (var58) {
                            Statics.field3264 = var65;
                        } else {
                            Statics.field830 = var65;
                        }
                        client.method1079(var62);
                        continue;
                    }
                    if (var513 == 101) {
                        class177 var66 = var58 ? Statics.field3264 : Statics.field830;
                        class177 var67 = class177.method595(var66.field2817);
                        var67.field2941[var66.field2909] = null;
                        client.method1079(var67);
                        continue;
                    }
                    if (var513 == 102) {
                        var5--;
                        class177 var68 = class177.method595(field834[var5]);
                        var68.field2941 = null;
                        client.method1079(var68);
                        continue;
                    }
                    if (var513 == 200) {
                        var5 -= 2;
                        int var69 = field834[var5];
                        int var70 = field834[var5 + 1];
                        class177 var71 = class177.method763(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field834[var5++] = 1;
                            if (var58) {
                                Statics.field3264 = var71;
                            } else {
                                Statics.field830 = var71;
                            }
                            continue;
                        }
                        field834[var5++] = 0;
                        continue;
                    }
                    if (var513 == 201) {
                        var5--;
                        class177 var72 = class177.method595(field834[var5]);
                        if (var72 == null) {
                            field834[var5++] = 0;
                        } else {
                            field834[var5++] = 1;
                            if (var58) {
                                Statics.field3264 = var72;
                            } else {
                                Statics.field830 = var72;
                            }
                        }
                        continue;
                    }
                } else if (!(var513 < 1000 || var513 >= 1100) || !(var513 < 2000 || var513 >= 2100)) {
                    int var73 = -1;
                    class177 var74;
                    if (var513 >= 2000) {
                        var513 -= 1000;
                        var5--;
                        var73 = field834[var5];
                        var74 = class177.method595(var73);
                    } else {
                        var74 = var58 ? Statics.field3264 : Statics.field830;
                    }
                    if (var513 == 1000) {
                        var5 -= 4;
                        var74.field2831 = field834[var5];
                        var74.field2897 = field834[var5 + 1];
                        var74.field2867 = field834[var5 + 2];
                        var74.field2823 = field834[var5 + 3];
                        client.method1079(var74);
                        client.method39(var74);
                        if (var73 != -1 && var74.field2819 == 0) {
                            client.method134(Statics.field2942[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var513 == 1001) {
                        var5 -= 4;
                        var74.field2828 = field834[var5];
                        var74.field2829 = field834[var5 + 1];
                        var74.field2824 = field834[var5 + 2];
                        var74.field2825 = field834[var5 + 3];
                        client.method1079(var74);
                        client.method39(var74);
                        if (var73 != -1 && var74.field2819 == 0) {
                            client.method134(Statics.field2942[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var513 == 1003) {
                        var5--;
                        boolean var75 = field834[var5] == 1;
                        if (var74.field2947 != var75) {
                            var74.field2947 = var75;
                            client.method1079(var74);
                        }
                        continue;
                    }
                    if (var513 == 1005) {
                        var5--;
                        var74.field2950 = field834[var5] == 1;
                        continue;
                    }
                    if (var513 == 1006) {
                        var5--;
                        var74.field2855 = field834[var5] == 1;
                        continue;
                    }
                } else if (!(var513 < 1100 || var513 >= 1200) || !(var513 < 2100 || var513 >= 2200)) {
                    int var76 = -1;
                    class177 var77;
                    if (var513 >= 2000) {
                        var513 -= 1000;
                        var5--;
                        var76 = field834[var5];
                        var77 = class177.method595(var76);
                    } else {
                        var77 = var58 ? Statics.field3264 : Statics.field830;
                    }
                    if (var513 == 1100) {
                        var5 -= 2;
                        var77.field2853 = field834[var5];
                        if (var77.field2853 > var77.field2840 - var77.field2832) {
                            var77.field2853 = var77.field2840 - var77.field2832;
                        }
                        if (var77.field2853 < 0) {
                            var77.field2853 = 0;
                        }
                        var77.field2839 = field834[var5 + 1];
                        if (var77.field2839 > var77.field2841 - var77.field2872) {
                            var77.field2839 = var77.field2841 - var77.field2872;
                        }
                        if (var77.field2839 < 0) {
                            var77.field2839 = 0;
                        }
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1101) {
                        var5--;
                        var77.field2842 = field834[var5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1102) {
                        var5--;
                        var77.field2812 = field834[var5] == 1;
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1103) {
                        var5--;
                        var77.field2878 = field834[var5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1104) {
                        var5--;
                        var77.field2850 = field834[var5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1105) {
                        var5--;
                        var77.field2852 = field834[var5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1106) {
                        var5--;
                        var77.field2808 = field834[var5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1107) {
                        var5--;
                        var77.field2846 = field834[var5] == 1;
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1108) {
                        var77.field2890 = 1;
                        var5--;
                        var77.field2861 = field834[var5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1109) {
                        var5 -= 6;
                        var77.field2866 = field834[var5];
                        var77.field2844 = field834[var5 + 1];
                        var77.field2868 = field834[var5 + 2];
                        var77.field2854 = field834[var5 + 3];
                        var77.field2876 = field834[var5 + 4];
                        var77.field2871 = field834[var5 + 5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1110) {
                        var5--;
                        int var78 = field834[var5];
                        if (var77.field2939 != var78) {
                            var77.field2939 = var78;
                            var77.field2863 = 0;
                            var77.field2826 = 0;
                            client.method1079(var77);
                        }
                        continue;
                    }
                    if (var513 == 1111) {
                        var5--;
                        var77.field2874 = field834[var5] == 1;
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1112) {
                        var6--;
                        String var79 = field831[var6];
                        if (!var79.equals(var77.field2885)) {
                            var77.field2885 = var79;
                            client.method1079(var77);
                        }
                        continue;
                    }
                    if (var513 == 1113) {
                        var5--;
                        var77.field2925 = field834[var5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1114) {
                        var5 -= 3;
                        var77.field2880 = field834[var5];
                        var77.field2881 = field834[var5 + 1];
                        var77.field2879 = field834[var5 + 2];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1115) {
                        var5--;
                        var77.field2882 = field834[var5] == 1;
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1116) {
                        var5--;
                        var77.field2856 = field834[var5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1117) {
                        var5--;
                        var77.field2857 = field834[var5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1118) {
                        var5--;
                        var77.field2858 = field834[var5] == 1;
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1119) {
                        var5--;
                        var77.field2847 = field834[var5] == 1;
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1120) {
                        var5 -= 2;
                        var77.field2840 = field834[var5];
                        var77.field2841 = field834[var5 + 1];
                        client.method1079(var77);
                        if (var76 != -1 && var77.field2819 == 0) {
                            client.method134(Statics.field2942[var76 >> 16], var77, false);
                        }
                        continue;
                    }
                    if (var513 == 1121) {
                        client.method7(var77.field2817, var77.field2909);
                        client.field445 = var77;
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1122) {
                        var5--;
                        var77.field2851 = field834[var5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1123) {
                        var5--;
                        var77.field2862 = field834[var5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1124) {
                        var5--;
                        var77.field2849 = field834[var5];
                        client.method1079(var77);
                        continue;
                    }
                    if (var513 == 1125) {
                        var5--;
                        int var80 = field834[var5];
                        class86[] var81 = new class86[] { class86.field1509, class86.field1506, class86.field1515, class86.field1508, class86.field1505 };
                        class86 var82 = (class86) class113.method1095(var81, var80);
                        if (var82 != null) {
                            var77.field2911 = var82;
                            client.method1079(var77);
                        }
                        continue;
                    }
                } else if (!(var513 < 1200 || var513 >= 1300) || !(var513 < 2200 || var513 >= 2300)) {
                    class177 var83;
                    if (var513 >= 2000) {
                        var513 -= 1000;
                        var5--;
                        var83 = class177.method595(field834[var5]);
                    } else {
                        var83 = var58 ? Statics.field3264 : Statics.field830;
                    }
                    client.method1079(var83);
                    if (var513 == 1200 || var513 == 1205 || var513 == 1212) {
                        var5 -= 2;
                        int var84 = field834[var5];
                        int var85 = field834[var5 + 1];
                        var83.field2937 = var84;
                        var83.field2938 = var85;
                        class56 var86 = class56.method754(var84);
                        var83.field2868 = var86.field1216;
                        var83.field2854 = var86.field1194;
                        var83.field2876 = var86.field1195;
                        var83.field2866 = var86.field1178;
                        var83.field2844 = var86.field1217;
                        var83.field2871 = var86.field1233;
                        if (var513 == 1205) {
                            var83.field2875 = 0;
                        } else if (var513 == 1212 | var86.field1198 == 1) {
                            var83.field2875 = 1;
                        } else {
                            var83.field2875 = 2;
                        }
                        if (var83.field2848 > 0) {
                            var83.field2871 = var83.field2871 * 32 / var83.field2848;
                        } else if (var83.field2828 > 0) {
                            var83.field2871 = var83.field2871 * 32 / var83.field2828;
                        }
                        continue;
                    }
                    if (var513 == 1201) {
                        var83.field2890 = 2;
                        var5--;
                        var83.field2861 = field834[var5];
                        continue;
                    }
                    if (var513 == 1202) {
                        var83.field2890 = 3;
                        var83.field2861 = Statics.field68.field33.method3329();
                        continue;
                    }
                } else if ((var513 < 1300 || var513 >= 1400) && (var513 < 2300 || var513 >= 2400)) {
                    if (var513 >= 1400 && var513 < 1500 || var513 >= 2400 && var513 < 2500) {
                        class177 var91;
                        if (var513 >= 2000) {
                            var513 -= 1000;
                            var5--;
                            var91 = class177.method595(field834[var5]);
                        } else {
                            var91 = var58 ? Statics.field3264 : Statics.field830;
                        }
                        var6--;
                        String var92 = field831[var6];
                        int[] var93 = null;
                        if (var92.length() > 0 && var92.charAt(var92.length() - 1) == 'Y') {
                            var5--;
                            int var94 = field834[var5];
                            if (var94 > 0) {
                                var93 = new int[var94];
                                while (var94-- > 0) {
                                    var5--;
                                    var93[var94] = field834[var5];
                                }
                            }
                            var92 = var92.substring(0, var92.length() - 1);
                        }
                        Object[] var95 = new Object[var92.length() + 1];
                        for (int var96 = var95.length - 1; var96 >= 1; var96--) {
                            if (var92.charAt(var96 - 1) == 's') {
                                var6--;
                                var95[var96] = field831[var6];
                            } else {
                                var5--;
                                var95[var96] = Integer.valueOf(field834[var5]);
                            }
                        }
                        var5--;
                        int var97 = field834[var5];
                        if (var97 == -1) {
                            var95 = null;
                        } else {
                            var95[0] = Integer.valueOf(var97);
                        }
                        if (var513 == 1400) {
                            var91.field2899 = var95;
                        }
                        if (var513 == 1401) {
                            var91.field2902 = var95;
                        }
                        if (var513 == 1402) {
                            var91.field2901 = var95;
                        }
                        if (var513 == 1403) {
                            var91.field2870 = var95;
                        }
                        if (var513 == 1404) {
                            var91.field2905 = var95;
                        }
                        if (var513 == 1405) {
                            var91.field2906 = var95;
                        }
                        if (var513 == 1406) {
                            var91.field2893 = var95;
                        }
                        if (var513 == 1407) {
                            var91.field2910 = var95;
                            var91.field2869 = var93;
                        }
                        if (var513 == 1408) {
                            var91.field2951 = var95;
                        }
                        if (var513 == 1409) {
                            var91.field2888 = var95;
                        }
                        if (var513 == 1410) {
                            var91.field2907 = var95;
                        }
                        if (var513 == 1411) {
                            var91.field2900 = var95;
                        }
                        if (var513 == 1412) {
                            var91.field2904 = var95;
                        }
                        if (var513 == 1414) {
                            var91.field2912 = var95;
                            var91.field2913 = var93;
                        }
                        if (var513 == 1415) {
                            var91.field2837 = var95;
                            var91.field2916 = var93;
                        }
                        if (var513 == 1416) {
                            var91.field2820 = var95;
                        }
                        if (var513 == 1417) {
                            var91.field2821 = var95;
                        }
                        if (var513 == 1418) {
                            var91.field2919 = var95;
                        }
                        if (var513 == 1419) {
                            var91.field2920 = var95;
                        }
                        if (var513 == 1420) {
                            var91.field2921 = var95;
                        }
                        if (var513 == 1421) {
                            var91.field2922 = var95;
                        }
                        if (var513 == 1422) {
                            var91.field2928 = var95;
                        }
                        if (var513 == 1423) {
                            var91.field2924 = var95;
                        }
                        if (var513 == 1424) {
                            var91.field2843 = var95;
                        }
                        if (var513 == 1425) {
                            var91.field2927 = var95;
                        }
                        if (var513 == 1426) {
                            var91.field2822 = var95;
                        }
                        if (var513 == 1427) {
                            var91.field2903 = var95;
                        }
                        var91.field2827 = true;
                        continue;
                    }
                    if (var513 < 1600) {
                        class177 var98 = var58 ? Statics.field3264 : Statics.field830;
                        if (var513 == 1500) {
                            field834[var5++] = var98.field2830;
                            continue;
                        }
                        if (var513 == 1501) {
                            field834[var5++] = var98.field2918;
                            continue;
                        }
                        if (var513 == 1502) {
                            field834[var5++] = var98.field2832;
                            continue;
                        }
                        if (var513 == 1503) {
                            field834[var5++] = var98.field2872;
                            continue;
                        }
                        if (var513 == 1504) {
                            field834[var5++] = var98.field2947 ? 1 : 0;
                            continue;
                        }
                        if (var513 == 1505) {
                            field834[var5++] = var98.field2836;
                            continue;
                        }
                    } else if (var513 < 1700) {
                        class177 var99 = var58 ? Statics.field3264 : Statics.field830;
                        if (var513 == 1600) {
                            field834[var5++] = var99.field2853;
                            continue;
                        }
                        if (var513 == 1601) {
                            field834[var5++] = var99.field2839;
                            continue;
                        }
                        if (var513 == 1602) {
                            field831[var6++] = var99.field2885;
                            continue;
                        }
                        if (var513 == 1603) {
                            field834[var5++] = var99.field2840;
                            continue;
                        }
                        if (var513 == 1604) {
                            field834[var5++] = var99.field2841;
                            continue;
                        }
                        if (var513 == 1605) {
                            field834[var5++] = var99.field2871;
                            continue;
                        }
                        if (var513 == 1606) {
                            field834[var5++] = var99.field2868;
                            continue;
                        }
                        if (var513 == 1607) {
                            field834[var5++] = var99.field2876;
                            continue;
                        }
                        if (var513 == 1608) {
                            field834[var5++] = var99.field2854;
                            continue;
                        }
                        if (var513 == 1609) {
                            field834[var5++] = var99.field2878;
                            continue;
                        }
                        if (var513 == 1610) {
                            field834[var5++] = var99.field2849;
                            continue;
                        }
                        if (var513 == 1611) {
                            field834[var5++] = var99.field2842;
                            continue;
                        }
                        if (var513 == 1612) {
                            field834[var5++] = var99.field2862;
                            continue;
                        }
                        if (var513 == 1613) {
                            field834[var5++] = var99.field2911.method561();
                            continue;
                        }
                    } else if (var513 < 1800) {
                        class177 var100 = var58 ? Statics.field3264 : Statics.field830;
                        if (var513 == 1700) {
                            field834[var5++] = var100.field2937;
                            continue;
                        }
                        if (var513 == 1701) {
                            if (var100.field2937 == -1) {
                                field834[var5++] = 0;
                            } else {
                                field834[var5++] = var100.field2938;
                            }
                            continue;
                        }
                        if (var513 == 1702) {
                            field834[var5++] = var100.field2909;
                            continue;
                        }
                    } else if (var513 < 1900) {
                        class177 var101 = var58 ? Statics.field3264 : Statics.field830;
                        if (var513 == 1800) {
                            field834[var5++] = class182.method235(client.method2969(var101));
                            continue;
                        }
                        if (var513 == 1801) {
                            var5--;
                            int var102 = field834[var5];
                            int var514 = var102 - 1;
                            if (var101.field2891 != null && var514 < var101.field2891.length && var101.field2891[var514] != null) {
                                field831[var6++] = var101.field2891[var514];
                                continue;
                            }
                            field831[var6++] = "";
                            continue;
                        }
                        if (var513 == 1802) {
                            if (var101.field2877 == null) {
                                field831[var6++] = "";
                            } else {
                                field831[var6++] = var101.field2877;
                            }
                            continue;
                        }
                    } else if (!(var513 < 1900 || var513 >= 2000) || !(var513 < 2900 || var513 >= 3000)) {
                        class177 var103;
                        if (var513 >= 2000) {
                            var513 -= 1000;
                            var5--;
                            var103 = class177.method595(field834[var5]);
                        } else {
                            var103 = var58 ? Statics.field3264 : Statics.field830;
                        }
                        if (var513 == 1927) {
                            if (field836 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var103.field2903 == null) {
                                return;
                            }
                            class1 var104 = new class1();
                            var104.field3 = var103;
                            var104.field8 = var103.field2903;
                            var104.field12 = field836 + 1;
                            client.field480.method3612(arg0);
                            continue;
                        }
                    } else if (var513 < 2600) {
                        var5--;
                        class177 var105 = class177.method595(field834[var5]);
                        if (var513 == 2500) {
                            field834[var5++] = var105.field2830;
                            continue;
                        }
                        if (var513 == 2501) {
                            field834[var5++] = var105.field2918;
                            continue;
                        }
                        if (var513 == 2502) {
                            field834[var5++] = var105.field2832;
                            continue;
                        }
                        if (var513 == 2503) {
                            field834[var5++] = var105.field2872;
                            continue;
                        }
                        if (var513 == 2504) {
                            field834[var5++] = var105.field2947 ? 1 : 0;
                            continue;
                        }
                        if (var513 == 2505) {
                            field834[var5++] = var105.field2836;
                            continue;
                        }
                    } else if (var513 < 2700) {
                        var5--;
                        class177 var106 = class177.method595(field834[var5]);
                        if (var513 == 2600) {
                            field834[var5++] = var106.field2853;
                            continue;
                        }
                        if (var513 == 2601) {
                            field834[var5++] = var106.field2839;
                            continue;
                        }
                        if (var513 == 2602) {
                            field831[var6++] = var106.field2885;
                            continue;
                        }
                        if (var513 == 2603) {
                            field834[var5++] = var106.field2840;
                            continue;
                        }
                        if (var513 == 2604) {
                            field834[var5++] = var106.field2841;
                            continue;
                        }
                        if (var513 == 2605) {
                            field834[var5++] = var106.field2871;
                            continue;
                        }
                        if (var513 == 2606) {
                            field834[var5++] = var106.field2868;
                            continue;
                        }
                        if (var513 == 2607) {
                            field834[var5++] = var106.field2876;
                            continue;
                        }
                        if (var513 == 2608) {
                            field834[var5++] = var106.field2854;
                            continue;
                        }
                        if (var513 == 2609) {
                            field834[var5++] = var106.field2878;
                            continue;
                        }
                        if (var513 == 2610) {
                            field834[var5++] = var106.field2849;
                            continue;
                        }
                        if (var513 == 2611) {
                            field834[var5++] = var106.field2842;
                            continue;
                        }
                        if (var513 == 2612) {
                            field834[var5++] = var106.field2862;
                            continue;
                        }
                        if (var513 == 2613) {
                            field834[var5++] = var106.field2911.method561();
                            continue;
                        }
                    } else if (var513 < 2800) {
                        if (var513 == 2700) {
                            var5--;
                            class177 var107 = class177.method595(field834[var5]);
                            field834[var5++] = var107.field2937;
                            continue;
                        }
                        if (var513 == 2701) {
                            var5--;
                            class177 var108 = class177.method595(field834[var5]);
                            if (var108.field2937 == -1) {
                                field834[var5++] = 0;
                            } else {
                                field834[var5++] = var108.field2938;
                            }
                            continue;
                        }
                        if (var513 == 2702) {
                            var5--;
                            int var109 = field834[var5];
                            class4 var110 = (class4) client.field442.method3580((long) var109);
                            if (var110 == null) {
                                field834[var5++] = 0;
                            } else {
                                field834[var5++] = 1;
                            }
                            continue;
                        }
                        if (var513 == 2706) {
                            field834[var5++] = client.field443;
                            continue;
                        }
                    } else if (var513 < 2900) {
                        var5--;
                        class177 var111 = class177.method595(field834[var5]);
                        if (var513 == 2800) {
                            field834[var5++] = class182.method235(client.method2969(var111));
                            continue;
                        }
                        if (var513 == 2801) {
                            var5--;
                            int var112 = field834[var5];
                            int var515 = var112 - 1;
                            if (var111.field2891 != null && var515 < var111.field2891.length && var111.field2891[var515] != null) {
                                field831[var6++] = var111.field2891[var515];
                                continue;
                            }
                            field831[var6++] = "";
                            continue;
                        }
                        if (var513 == 2802) {
                            if (var111.field2877 == null) {
                                field831[var6++] = "";
                            } else {
                                field831[var6++] = var111.field2877;
                            }
                            continue;
                        }
                    } else if (var513 < 3200) {
                        if (var513 == 3100) {
                            var6--;
                            String var113 = field831[var6];
                            class12.method130(0, "", var113);
                            continue;
                        }
                        if (var513 == 3101) {
                            var5 -= 2;
                            client.method927(Statics.field68, field834[var5], field834[var5 + 1]);
                            continue;
                        }
                        if (var513 == 3103) {
                            client.method1299();
                            continue;
                        }
                        if (var513 == 3104) {
                            var6--;
                            String var114 = field831[var6];
                            int var115 = 0;
                            if (class167.method1628(var114)) {
                                int var116 = class167.method2872(var114, 10, true);
                                var115 = var116;
                            }
                            client.field324.method2668(209);
                            client.field324.method2467(var115);
                            continue;
                        }
                        if (var513 == 3105) {
                            var6--;
                            String var117 = field831[var6];
                            client.field324.method2668(192);
                            client.field324.method2380(var117.length() + 1);
                            client.field324.method2386(var117);
                            continue;
                        }
                        if (var513 == 3106) {
                            var6--;
                            String var118 = field831[var6];
                            client.field324.method2668(19);
                            client.field324.method2380(var118.length() + 1);
                            client.field324.method2386(var118);
                            continue;
                        }
                        if (var513 == 3107) {
                            var5--;
                            int var119 = field834[var5];
                            var6--;
                            String var120 = field831[var6];
                            client.method1262(var119, var120);
                            continue;
                        }
                        if (var513 == 3108) {
                            var5 -= 3;
                            int var121 = field834[var5];
                            int var122 = field834[var5 + 1];
                            int var123 = field834[var5 + 2];
                            class177 var124 = class177.method595(var123);
                            client.method2644(var124, var121, var122);
                            continue;
                        }
                        if (var513 == 3109) {
                            var5 -= 2;
                            int var125 = field834[var5];
                            int var126 = field834[var5 + 1];
                            class177 var127 = var58 ? Statics.field3264 : Statics.field830;
                            client.method2644(var127, var125, var126);
                            continue;
                        }
                        if (var513 == 3110) {
                            var5--;
                            Statics.field627 = field834[var5] == 1;
                            continue;
                        }
                        if (var513 == 3111) {
                            field834[var5++] = Statics.field2040.field132 ? 1 : 0;
                            continue;
                        }
                        if (var513 == 3112) {
                            var5--;
                            Statics.field2040.field132 = field834[var5] == 1;
                            class9.method1623();
                            continue;
                        }
                        if (var513 == 3113) {
                            var6--;
                            String var128 = field831[var6];
                            var5--;
                            boolean var129 = field834[var5] == 1;
                            class142.method1595(var128, var129, false);
                            continue;
                        }
                        if (var513 == 3115) {
                            var5--;
                            int var130 = field834[var5];
                            client.field324.method2668(107);
                            client.field324.method2381(var130);
                            continue;
                        }
                        if (var513 == 3116) {
                            var5--;
                            int var131 = field834[var5];
                            var6 -= 2;
                            String var132 = field831[var6];
                            String var133 = field831[var6 + 1];
                            if (var132.length() <= 500 && var133.length() <= 500) {
                                client.field324.method2668(44);
                                client.field324.method2381(1 + class123.method224(var132) + class123.method224(var133));
                                client.field324.method2386(var133);
                                client.field324.method2386(var132);
                                client.field324.method2425(var131);
                            }
                            continue;
                        }
                    } else if (var513 < 3300) {
                        if (var513 == 3200) {
                            var5 -= 3;
                            int var134 = field834[var5];
                            int var135 = field834[var5 + 1];
                            int var136 = field834[var5 + 2];
                            if (client.field521 != 0 && var135 != 0 && client.field523 < 50) {
                                client.field524[client.field523] = var134;
                                client.field429[client.field523] = var135;
                                client.field472[client.field523] = var136;
                                client.field433[client.field523] = null;
                                client.field527[client.field523] = 0;
                                client.field523++;
                            }
                            continue;
                        }
                        if (var513 == 3201) {
                            var5--;
                            client.method3022(field834[var5]);
                            continue;
                        }
                        if (var513 == 3202) {
                            var5 -= 2;
                            client.method2647(field834[var5], field834[var5 + 1]);
                            continue;
                        }
                    } else if (var513 < 3400) {
                        if (var513 == 3300) {
                            field834[var5++] = client.field565;
                            continue;
                        }
                        if (var513 == 3301) {
                            var5 -= 2;
                            int var137 = field834[var5];
                            int var138 = field834[var5 + 1];
                            int[] var139 = field834;
                            int var140 = var5++;
                            class16 var141 = (class16) class16.field216.method3580((long) var137);
                            int var142;
                            if (var141 == null) {
                                var142 = -1;
                            } else if (var138 >= 0 && var138 < var141.field214.length) {
                                var142 = var141.field214[var138];
                            } else {
                                var142 = -1;
                            }
                            var139[var140] = var142;
                            continue;
                        }
                        if (var513 == 3302) {
                            var5 -= 2;
                            int var143 = field834[var5];
                            int var144 = field834[var5 + 1];
                            int[] var145 = field834;
                            int var146 = var5++;
                            class16 var147 = (class16) class16.field216.method3580((long) var143);
                            int var148;
                            if (var147 == null) {
                                var148 = 0;
                            } else if (var144 >= 0 && var144 < var147.field215.length) {
                                var148 = var147.field215[var144];
                            } else {
                                var148 = 0;
                            }
                            var145[var146] = var148;
                            continue;
                        }
                        if (var513 == 3303) {
                            var5 -= 2;
                            int var149 = field834[var5];
                            int var150 = field834[var5 + 1];
                            int[] var151 = field834;
                            int var152 = var5++;
                            class16 var153 = (class16) class16.field216.method3580((long) var149);
                            int var154;
                            if (var153 == null) {
                                var154 = 0;
                            } else if (var150 == -1) {
                                var154 = 0;
                            } else {
                                int var155 = 0;
                                for (int var156 = 0; var156 < var153.field215.length; var156++) {
                                    if (var153.field214[var156] == var150) {
                                        var155 += var153.field215[var156];
                                    }
                                }
                                var154 = var155;
                            }
                            var151[var152] = var154;
                            continue;
                        }
                        if (var513 == 3304) {
                            var5--;
                            int var157 = field834[var5];
                            field834[var5++] = class55.method583(var157).field1169;
                            continue;
                        }
                        if (var513 == 3305) {
                            var5--;
                            int var158 = field834[var5];
                            field834[var5++] = client.field418[var158];
                            continue;
                        }
                        if (var513 == 3306) {
                            var5--;
                            int var159 = field834[var5];
                            field834[var5++] = client.field554[var159];
                            continue;
                        }
                        if (var513 == 3307) {
                            var5--;
                            int var160 = field834[var5];
                            field834[var5++] = client.field420[var160];
                            continue;
                        }
                        if (var513 == 3308) {
                            int var161 = Statics.field707;
                            int var162 = (Statics.field68.field847 >> 7) + Statics.field151;
                            int var163 = (Statics.field68.field849 >> 7) + Statics.field1055;
                            field834[var5++] = (var161 << 28) + (var162 << 14) + var163;
                            continue;
                        }
                        if (var513 == 3309) {
                            var5--;
                            int var164 = field834[var5];
                            field834[var5++] = var164 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var513 == 3310) {
                            var5--;
                            int var165 = field834[var5];
                            field834[var5++] = var165 >> 28;
                            continue;
                        }
                        if (var513 == 3311) {
                            var5--;
                            int var166 = field834[var5];
                            field834[var5++] = var166 & 0x3FFF;
                            continue;
                        }
                        if (var513 == 3312) {
                            field834[var5++] = client.field486 ? 1 : 0;
                            continue;
                        }
                        if (var513 == 3313) {
                            var5 -= 2;
                            int var167 = field834[var5] + 32768;
                            int var168 = field834[var5 + 1];
                            int[] var169 = field834;
                            int var170 = var5++;
                            class16 var171 = (class16) class16.field216.method3580((long) var167);
                            int var172;
                            if (var171 == null) {
                                var172 = -1;
                            } else if (var168 >= 0 && var168 < var171.field214.length) {
                                var172 = var171.field214[var168];
                            } else {
                                var172 = -1;
                            }
                            var169[var170] = var172;
                            continue;
                        }
                        if (var513 == 3314) {
                            var5 -= 2;
                            int var173 = field834[var5] + 32768;
                            int var174 = field834[var5 + 1];
                            int[] var175 = field834;
                            int var176 = var5++;
                            class16 var177 = (class16) class16.field216.method3580((long) var173);
                            int var178;
                            if (var177 == null) {
                                var178 = 0;
                            } else if (var174 >= 0 && var174 < var177.field215.length) {
                                var178 = var177.field215[var174];
                            } else {
                                var178 = 0;
                            }
                            var175[var176] = var178;
                            continue;
                        }
                        if (var513 == 3315) {
                            var5 -= 2;
                            int var179 = field834[var5] + 32768;
                            int var180 = field834[var5 + 1];
                            int[] var181 = field834;
                            int var182 = var5++;
                            class16 var183 = (class16) class16.field216.method3580((long) var179);
                            int var184;
                            if (var183 == null) {
                                var184 = 0;
                            } else if (var180 == -1) {
                                var184 = 0;
                            } else {
                                int var185 = 0;
                                for (int var186 = 0; var186 < var183.field215.length; var186++) {
                                    if (var183.field214[var186] == var180) {
                                        var185 += var183.field215[var186];
                                    }
                                }
                                var184 = var185;
                            }
                            var181[var182] = var184;
                            continue;
                        }
                        if (var513 == 3316) {
                            if (client.field352 >= 2) {
                                field834[var5++] = client.field352;
                            } else {
                                field834[var5++] = 0;
                            }
                            continue;
                        }
                        if (var513 == 3317) {
                            field834[var5++] = client.field382;
                            continue;
                        }
                        if (var513 == 3318) {
                            field834[var5++] = client.field280;
                            continue;
                        }
                        if (var513 == 3321) {
                            field834[var5++] = client.field446;
                            continue;
                        }
                        if (var513 == 3322) {
                            field834[var5++] = client.field323;
                            continue;
                        }
                        if (var513 == 3323) {
                            if (client.field479) {
                                field834[var5++] = 1;
                            } else {
                                field834[var5++] = 0;
                            }
                            continue;
                        }
                        if (var513 == 3324) {
                            field834[var5++] = client.field281;
                            continue;
                        }
                    } else if (var513 < 3500) {
                        if (var513 == 3400) {
                            var5 -= 2;
                            int var187 = field834[var5];
                            int var188 = field834[var5 + 1];
                            class53 var189 = (class53) class53.field1150.method3544((long) var187);
                            class53 var190;
                            if (var189 == null) {
                                byte[] var191 = Statics.field1147.method3117(8, var187);
                                class53 var192 = new class53();
                                if (var191 != null) {
                                    var192.method1068(new class123(var191));
                                }
                                class53.field1150.method3546(var192, (long) var187);
                                var190 = var192;
                            } else {
                                var190 = var189;
                            }
                            class53 var193 = var190;
                            if (var190.field1148 != 's') {
                            }
                            for (int var194 = 0; var194 < var193.field1151; var194++) {
                                if (var193.field1152[var194] == var188) {
                                    field831[var6++] = var193.field1146[var194];
                                    var193 = null;
                                    break;
                                }
                            }
                            if (var193 != null) {
                                field831[var6++] = var193.field1149;
                            }
                            continue;
                        }
                        if (var513 == 3408) {
                            var5 -= 4;
                            int var195 = field834[var5];
                            int var196 = field834[var5 + 1];
                            int var197 = field834[var5 + 2];
                            int var198 = field834[var5 + 3];
                            class53 var199 = (class53) class53.field1150.method3544((long) var197);
                            class53 var200;
                            if (var199 == null) {
                                byte[] var201 = Statics.field1147.method3117(8, var197);
                                class53 var202 = new class53();
                                if (var201 != null) {
                                    var202.method1068(new class123(var201));
                                }
                                class53.field1150.method3546(var202, (long) var197);
                                var200 = var202;
                            } else {
                                var200 = var199;
                            }
                            class53 var203 = var200;
                            if (var200.field1145 == var195 && var200.field1148 == var196) {
                                for (int var204 = 0; var204 < var203.field1151; var204++) {
                                    if (var203.field1152[var204] == var198) {
                                        if (var196 == 115) {
                                            field831[var6++] = var203.field1146[var204];
                                        } else {
                                            field834[var5++] = var203.field1153[var204];
                                        }
                                        var203 = null;
                                        break;
                                    }
                                }
                                if (var203 != null) {
                                    if (var196 == 115) {
                                        field831[var6++] = var203.field1149;
                                    } else {
                                        field834[var5++] = var203.field1154;
                                    }
                                }
                                continue;
                            }
                            if (var196 == 115) {
                                field831[var6++] = "null";
                            } else {
                                field834[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var513 < 3700) {
                        if (var513 == 3600) {
                            if (client.field470 == 0) {
                                field834[var5++] = -2;
                            } else if (client.field470 == 1) {
                                field834[var5++] = -1;
                            } else {
                                field834[var5++] = client.field360;
                            }
                            continue;
                        }
                        if (var513 == 3601) {
                            var5--;
                            int var205 = field834[var5];
                            if (client.field470 == 2 && var205 < client.field360) {
                                field831[var6++] = client.field551[var205].field249;
                                field831[var6++] = client.field551[var205].field238;
                                continue;
                            }
                            field831[var6++] = "";
                            field831[var6++] = "";
                            continue;
                        }
                        if (var513 == 3602) {
                            var5--;
                            int var206 = field834[var5];
                            if (client.field470 == 2 && var206 < client.field360) {
                                field834[var5++] = client.field551[var206].field239;
                                continue;
                            }
                            field834[var5++] = 0;
                            continue;
                        }
                        if (var513 == 3603) {
                            var5--;
                            int var207 = field834[var5];
                            if (client.field470 == 2 && var207 < client.field360) {
                                field834[var5++] = client.field551[var207].field240;
                                continue;
                            }
                            field834[var5++] = 0;
                            continue;
                        }
                        if (var513 == 3604) {
                            var6--;
                            String var208 = field831[var6];
                            var5--;
                            int var209 = field834[var5];
                            client.method3109(var208, var209);
                            continue;
                        }
                        if (var513 == 3605) {
                            var6--;
                            String var210 = field831[var6];
                            if (var210 == null) {
                                continue;
                            }
                            if ((client.field360 < 200 || client.field406 == 1) && client.field360 < 400) {
                                String var211 = class168.method2187(var210, Statics.field284);
                                if (var211 == null) {
                                    continue;
                                }
                                for (int var212 = 0; var212 < client.field360; var212++) {
                                    class18 var213 = client.field551[var212];
                                    String var214 = class168.method2187(var213.field249, Statics.field284);
                                    if (var214 != null && var214.equals(var211)) {
                                        class12.method130(30, "", var210 + class161.field2541);
                                        continue label3208;
                                    }
                                    if (var213.field238 != null) {
                                        String var215 = class168.method2187(var213.field238, Statics.field284);
                                        if (var215 != null && var215.equals(var211)) {
                                            class12.method130(30, "", var210 + class161.field2541);
                                            continue label3208;
                                        }
                                    }
                                }
                                for (int var216 = 0; var216 < client.field553; var216++) {
                                    class8 var217 = client.field455[var216];
                                    String var218 = class168.method2187(var217.field128, Statics.field284);
                                    if (var218 != null && var218.equals(var211)) {
                                        class12.method130(30, "", class161.field2546 + var210 + class161.field2547);
                                        continue label3208;
                                    }
                                    if (var217.field125 != null) {
                                        String var219 = class168.method2187(var217.field125, Statics.field284);
                                        if (var219 != null && var219.equals(var211)) {
                                            class12.method130(30, "", class161.field2546 + var210 + class161.field2547);
                                            continue label3208;
                                        }
                                    }
                                }
                                if (class168.method2187(Statics.field68.field53, Statics.field284).equals(var211)) {
                                    class12.method130(30, "", class161.field2559);
                                } else {
                                    client.field324.method2668(223);
                                    client.field324.method2380(class123.method224(var210));
                                    client.field324.method2386(var210);
                                }
                                continue;
                            }
                            class12.method130(30, "", class161.field2606);
                            continue;
                        }
                        if (var513 == 3606) {
                            var6--;
                            String var220 = field831[var6];
                            if (var220 == null) {
                                continue;
                            }
                            String var221 = class168.method2187(var220, Statics.field284);
                            if (var221 == null) {
                                continue;
                            }
                            int var222 = 0;
                            while (true) {
                                if (var222 >= client.field360) {
                                    continue label3208;
                                }
                                class18 var223 = client.field551[var222];
                                String var224 = var223.field249;
                                String var225 = class168.method2187(var224, Statics.field284);
                                if (class133.method557(var220, var221, var224, var225)) {
                                    client.field360--;
                                    for (int var226 = var222; var226 < client.field360; var226++) {
                                        client.field551[var226] = client.field551[var226 + 1];
                                    }
                                    client.field474 = client.field466;
                                    client.field324.method2668(152);
                                    client.field324.method2380(class123.method224(var220));
                                    client.field324.method2386(var220);
                                    continue label3208;
                                }
                                var222++;
                            }
                        }
                        if (var513 == 3607) {
                            var6--;
                            String var227 = field831[var6];
                            if (var227 == null) {
                                continue;
                            }
                            if ((client.field553 < 100 || client.field406 == 1) && client.field553 < 400) {
                                String var228 = class168.method2187(var227, Statics.field284);
                                if (var228 == null) {
                                    continue;
                                }
                                for (int var229 = 0; var229 < client.field553; var229++) {
                                    class8 var230 = client.field455[var229];
                                    String var231 = class168.method2187(var230.field128, Statics.field284);
                                    if (var231 != null && var231.equals(var228)) {
                                        class12.method130(31, "", var227 + class161.field2543);
                                        continue label3208;
                                    }
                                    if (var230.field125 != null) {
                                        String var232 = class168.method2187(var230.field125, Statics.field284);
                                        if (var232 != null && var232.equals(var228)) {
                                            class12.method130(31, "", var227 + class161.field2543);
                                            continue label3208;
                                        }
                                    }
                                }
                                for (int var233 = 0; var233 < client.field360; var233++) {
                                    class18 var234 = client.field551[var233];
                                    String var235 = class168.method2187(var234.field249, Statics.field284);
                                    if (var235 != null && var235.equals(var228)) {
                                        class12.method130(31, "", class161.field2431 + var227 + class161.field2549);
                                        continue label3208;
                                    }
                                    if (var234.field238 != null) {
                                        String var236 = class168.method2187(var234.field238, Statics.field284);
                                        if (var236 != null && var236.equals(var228)) {
                                            class12.method130(31, "", class161.field2431 + var227 + class161.field2549);
                                            continue label3208;
                                        }
                                    }
                                }
                                if (class168.method2187(Statics.field68.field53, Statics.field284).equals(var228)) {
                                    class12.method130(31, "", class161.field2457);
                                } else {
                                    client.field324.method2668(47);
                                    client.field324.method2380(class123.method224(var227));
                                    client.field324.method2386(var227);
                                }
                                continue;
                            }
                            class12.method130(31, "", class161.field2542);
                            continue;
                        }
                        if (var513 == 3608) {
                            var6--;
                            String var237 = field831[var6];
                            if (var237 == null) {
                                continue;
                            }
                            String var238 = class168.method2187(var237, Statics.field284);
                            if (var238 == null) {
                                continue;
                            }
                            int var239 = 0;
                            while (true) {
                                if (var239 >= client.field553) {
                                    continue label3208;
                                }
                                class8 var240 = client.field455[var239];
                                String var241 = var240.field128;
                                String var242 = class168.method2187(var241, Statics.field284);
                                if (class133.method557(var237, var238, var241, var242)) {
                                    client.field553--;
                                    for (int var243 = var239; var243 < client.field553; var243++) {
                                        client.field455[var243] = client.field455[var243 + 1];
                                    }
                                    client.field474 = client.field466;
                                    client.field324.method2668(123);
                                    client.field324.method2380(class123.method224(var237));
                                    client.field324.method2386(var237);
                                    continue label3208;
                                }
                                var239++;
                            }
                        }
                        if (var513 == 3609) {
                            var6--;
                            String var244 = field831[var6];
                            class156[] var245 = new class156[] { class156.field2330, class156.field2329, class156.field2331, class156.field2338, class156.field2332 };
                            class156[] var246 = var245;
                            for (int var247 = 0; var247 < var246.length; var247++) {
                                class156 var248 = var246[var247];
                                if (var248.field2335 != -1) {
                                    int var250 = var248.field2335;
                                    String var251 = "<img=" + var250 + ">";
                                    if (var244.startsWith(var251)) {
                                        var244 = var244.substring(6 + Integer.toString(var248.field2335).length());
                                        break;
                                    }
                                }
                            }
                            field834[var5++] = client.method2731(var244, false) ? 1 : 0;
                            continue;
                        }
                        if (var513 == 3611) {
                            if (client.field508 == null) {
                                field831[var6++] = "";
                            } else {
                                field831[var6++] = class166.method3092(client.field508);
                            }
                            continue;
                        }
                        if (var513 == 3612) {
                            if (client.field508 == null) {
                                field834[var5++] = 0;
                            } else {
                                field834[var5++] = Statics.field2139;
                            }
                            continue;
                        }
                        if (var513 == 3613) {
                            var5--;
                            int var252 = field834[var5];
                            if (client.field508 != null && var252 < Statics.field2139) {
                                field831[var6++] = Statics.field2804[var252].field643;
                                continue;
                            }
                            field831[var6++] = "";
                            continue;
                        }
                        if (var513 == 3614) {
                            var5--;
                            int var253 = field834[var5];
                            if (client.field508 != null && var253 < Statics.field2139) {
                                field834[var5++] = Statics.field2804[var253].field634;
                                continue;
                            }
                            field834[var5++] = 0;
                            continue;
                        }
                        if (var513 == 3615) {
                            var5--;
                            int var254 = field834[var5];
                            if (client.field508 != null && var254 < Statics.field2139) {
                                field834[var5++] = Statics.field2804[var254].field635;
                                continue;
                            }
                            field834[var5++] = 0;
                            continue;
                        }
                        if (var513 == 3616) {
                            field834[var5++] = Statics.field1723;
                            continue;
                        }
                        if (var513 == 3617) {
                            var6--;
                            String var255 = field831[var6];
                            if (Statics.field2804 != null) {
                                client.field324.method2668(48);
                                client.field324.method2380(class123.method224(var255));
                                client.field324.method2386(var255);
                            }
                            continue;
                        }
                        if (var513 == 3618) {
                            field834[var5++] = Statics.field1460;
                            continue;
                        }
                        if (var513 == 3619) {
                            var6--;
                            String var256 = field831[var6];
                            client.method1833(var256);
                            continue;
                        }
                        if (var513 == 3620) {
                            client.method97();
                            continue;
                        }
                        if (var513 == 3621) {
                            if (client.field470 == 0) {
                                field834[var5++] = -1;
                            } else {
                                field834[var5++] = client.field553;
                            }
                            continue;
                        }
                        if (var513 == 3622) {
                            var5--;
                            int var257 = field834[var5];
                            if (client.field470 != 0 && var257 < client.field553) {
                                field831[var6++] = client.field455[var257].field128;
                                field831[var6++] = client.field455[var257].field125;
                                continue;
                            }
                            field831[var6++] = "";
                            field831[var6++] = "";
                            continue;
                        }
                        if (var513 == 3623) {
                            String var258;
                            label2920: {
                                var6--;
                                var258 = field831[var6];
                                String var260 = "<img=0>";
                                if (!var258.startsWith(var260)) {
                                    String var262 = "<img=1>";
                                    if (!var258.startsWith(var262)) {
                                        break label2920;
                                    }
                                }
                                var258 = var258.substring(7);
                            }
                            field834[var5++] = client.method1589(var258) ? 1 : 0;
                            continue;
                        }
                        if (var513 == 3624) {
                            var5--;
                            int var263 = field834[var5];
                            if (Statics.field2804 != null && var263 < Statics.field2139 && Statics.field2804[var263].field643.equalsIgnoreCase(Statics.field68.field53)) {
                                field834[var5++] = 1;
                                continue;
                            }
                            field834[var5++] = 0;
                            continue;
                        }
                        if (var513 == 3625) {
                            if (client.field287 == null) {
                                field831[var6++] = "";
                            } else {
                                field831[var6++] = class166.method3092(client.field287);
                            }
                            continue;
                        }
                    } else if (var513 < 4000) {
                        if (var513 == 3903) {
                            var5--;
                            int var264 = field834[var5];
                            field834[var5++] = client.field558[var264].method3807();
                            continue;
                        }
                        if (var513 == 3904) {
                            var5--;
                            int var265 = field834[var5];
                            field834[var5++] = client.field558[var265].field3219;
                            continue;
                        }
                        if (var513 == 3905) {
                            var5--;
                            int var266 = field834[var5];
                            field834[var5++] = client.field558[var266].field3220;
                            continue;
                        }
                        if (var513 == 3906) {
                            var5--;
                            int var267 = field834[var5];
                            field834[var5++] = client.field558[var267].field3218;
                            continue;
                        }
                        if (var513 == 3907) {
                            var5--;
                            int var268 = field834[var5];
                            field834[var5++] = client.field558[var268].field3223;
                            continue;
                        }
                        if (var513 == 3908) {
                            var5--;
                            int var269 = field834[var5];
                            field834[var5++] = client.field558[var269].field3221;
                            continue;
                        }
                        if (var513 == 3910) {
                            var5--;
                            int var270 = field834[var5];
                            int var271 = client.field558[var270].method3805();
                            field834[var5++] = var271 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var513 == 3911) {
                            var5--;
                            int var272 = field834[var5];
                            int var273 = client.field558[var272].method3805();
                            field834[var5++] = var273 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var513 == 3912) {
                            var5--;
                            int var274 = field834[var5];
                            int var275 = client.field558[var274].method3805();
                            field834[var5++] = var275 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var513 == 3913) {
                            var5--;
                            int var276 = field834[var5];
                            int var277 = client.field558[var276].method3805();
                            field834[var5++] = var277 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var513 == 3914) {
                            var5--;
                            boolean var278 = field834[var5] == 1;
                            if (Statics.field261 != null) {
                                Statics.field261.method3819(class225.field3224, var278);
                            }
                            continue;
                        }
                        if (var513 == 3915) {
                            var5--;
                            boolean var279 = field834[var5] == 1;
                            if (Statics.field261 != null) {
                                Statics.field261.method3819(class225.field3227, var279);
                            }
                            continue;
                        }
                        if (var513 == 3916) {
                            var5 -= 2;
                            boolean var280 = field834[var5] == 1;
                            boolean var281 = field834[var5 + 1] == 1;
                            if (Statics.field261 != null) {
                                Statics.field261.method3819(new class23(var281), var280);
                            }
                            continue;
                        }
                        if (var513 == 3917) {
                            var5--;
                            boolean var282 = field834[var5] == 1;
                            if (Statics.field261 != null) {
                                Statics.field261.method3819(class225.field3225, var282);
                            }
                            continue;
                        }
                        if (var513 == 3918) {
                            var5--;
                            boolean var283 = field834[var5] == 1;
                            if (Statics.field261 != null) {
                                Statics.field261.method3819(class225.field3226, var283);
                            }
                            continue;
                        }
                        if (var513 == 3919) {
                            field834[var5++] = Statics.field261 == null ? 0 : Statics.field261.field3228.size();
                            continue;
                        }
                        if (var513 == 3920) {
                            var5--;
                            int var284 = field834[var5];
                            class218 var285 = (class218) Statics.field261.field3228.get(var284);
                            field834[var5++] = var285.field3205;
                            continue;
                        }
                        if (var513 == 3921) {
                            var5--;
                            int var286 = field834[var5];
                            class218 var287 = (class218) Statics.field261.field3228.get(var286);
                            field831[var6++] = var287.method3763();
                            continue;
                        }
                        if (var513 == 3922) {
                            var5--;
                            int var288 = field834[var5];
                            class218 var289 = (class218) Statics.field261.field3228.get(var288);
                            field831[var6++] = var289.method3767();
                            continue;
                        }
                        if (var513 == 3923) {
                            var5--;
                            int var290 = field834[var5];
                            class218 var291 = (class218) Statics.field261.field3228.get(var290);
                            long var292 = class119.method64() - Statics.field29 - var291.field3204;
                            int var294 = (int) (var292 / 3600000L);
                            int var295 = (int) ((var292 - (long) (var294 * 3600000)) / 60000L);
                            int var296 = (int) ((var292 - (long) (var294 * 3600000) - (long) (var295 * 60000)) / 1000L);
                            String var297 = var294 + ":" + var295 / 10 + var295 % 10 + ":" + var296 / 10 + var296 % 10;
                            field831[var6++] = var297;
                            continue;
                        }
                        if (var513 == 3924) {
                            var5--;
                            int var298 = field834[var5];
                            class218 var299 = (class218) Statics.field261.field3228.get(var298);
                            field834[var5++] = var299.field3203.field3218;
                            continue;
                        }
                        if (var513 == 3925) {
                            var5--;
                            int var300 = field834[var5];
                            class218 var301 = (class218) Statics.field261.field3228.get(var300);
                            field834[var5++] = var301.field3203.field3220;
                            continue;
                        }
                        if (var513 == 3926) {
                            var5--;
                            int var302 = field834[var5];
                            class218 var303 = (class218) Statics.field261.field3228.get(var302);
                            field834[var5++] = var303.field3203.field3219;
                            continue;
                        }
                    } else if (var513 < 4100) {
                        if (var513 == 4000) {
                            var5 -= 2;
                            int var304 = field834[var5];
                            int var305 = field834[var5 + 1];
                            field834[var5++] = var304 + var305;
                            continue;
                        }
                        if (var513 == 4001) {
                            var5 -= 2;
                            int var306 = field834[var5];
                            int var307 = field834[var5 + 1];
                            field834[var5++] = var306 - var307;
                            continue;
                        }
                        if (var513 == 4002) {
                            var5 -= 2;
                            int var308 = field834[var5];
                            int var309 = field834[var5 + 1];
                            field834[var5++] = var308 * var309;
                            continue;
                        }
                        if (var513 == 4003) {
                            var5 -= 2;
                            int var310 = field834[var5];
                            int var311 = field834[var5 + 1];
                            field834[var5++] = var310 / var311;
                            continue;
                        }
                        if (var513 == 4004) {
                            var5--;
                            int var312 = field834[var5];
                            field834[var5++] = (int) (Math.random() * (double) var312);
                            continue;
                        }
                        if (var513 == 4005) {
                            var5--;
                            int var313 = field834[var5];
                            field834[var5++] = (int) (Math.random() * (double) (var313 + 1));
                            continue;
                        }
                        if (var513 == 4006) {
                            var5 -= 5;
                            int var314 = field834[var5];
                            int var315 = field834[var5 + 1];
                            int var316 = field834[var5 + 2];
                            int var317 = field834[var5 + 3];
                            int var318 = field834[var5 + 4];
                            field834[var5++] = (var315 - var314) * (var318 - var316) / (var317 - var316) + var314;
                            continue;
                        }
                        if (var513 == 4007) {
                            var5 -= 2;
                            int var319 = field834[var5];
                            int var320 = field834[var5 + 1];
                            field834[var5++] = var319 * var320 / 100 + var319;
                            continue;
                        }
                        if (var513 == 4008) {
                            var5 -= 2;
                            int var321 = field834[var5];
                            int var322 = field834[var5 + 1];
                            field834[var5++] = var321 | 0x1 << var322;
                            continue;
                        }
                        if (var513 == 4009) {
                            var5 -= 2;
                            int var323 = field834[var5];
                            int var324 = field834[var5 + 1];
                            field834[var5++] = var323 & -1 - (0x1 << var324);
                            continue;
                        }
                        if (var513 == 4010) {
                            var5 -= 2;
                            int var325 = field834[var5];
                            int var326 = field834[var5 + 1];
                            field834[var5++] = (var325 & 0x1 << var326) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var513 == 4011) {
                            var5 -= 2;
                            int var327 = field834[var5];
                            int var328 = field834[var5 + 1];
                            field834[var5++] = var327 % var328;
                            continue;
                        }
                        if (var513 == 4012) {
                            var5 -= 2;
                            int var329 = field834[var5];
                            int var330 = field834[var5 + 1];
                            if (var329 == 0) {
                                field834[var5++] = 0;
                            } else {
                                field834[var5++] = (int) Math.pow((double) var329, (double) var330);
                            }
                            continue;
                        }
                        if (var513 == 4013) {
                            var5 -= 2;
                            int var331 = field834[var5];
                            int var332 = field834[var5 + 1];
                            if (var331 == 0) {
                                field834[var5++] = 0;
                            } else if (var332 == 0) {
                                field834[var5++] = Integer.MAX_VALUE;
                            } else {
                                field834[var5++] = (int) Math.pow((double) var331, 1.0D / (double) var332);
                            }
                            continue;
                        }
                        if (var513 == 4014) {
                            var5 -= 2;
                            int var333 = field834[var5];
                            int var334 = field834[var5 + 1];
                            field834[var5++] = var333 & var334;
                            continue;
                        }
                        if (var513 == 4015) {
                            var5 -= 2;
                            int var335 = field834[var5];
                            int var336 = field834[var5 + 1];
                            field834[var5++] = var335 | var336;
                            continue;
                        }
                        if (var513 == 4018) {
                            var5 -= 3;
                            long var337 = (long) field834[var5];
                            long var339 = (long) field834[var5 + 1];
                            long var341 = (long) field834[var5 + 2];
                            field834[var5++] = (int) (var337 * var341 / var339);
                            continue;
                        }
                    } else if (var513 < 4200) {
                        if (var513 == 4100) {
                            var6--;
                            String var343 = field831[var6];
                            var5--;
                            int var344 = field834[var5];
                            field831[var6++] = var343 + var344;
                            continue;
                        }
                        if (var513 == 4101) {
                            var6 -= 2;
                            String var345 = field831[var6];
                            String var346 = field831[var6 + 1];
                            field831[var6++] = var345 + var346;
                            continue;
                        }
                        if (var513 == 4102) {
                            var6--;
                            String var347 = field831[var6];
                            var5--;
                            int var348 = field834[var5];
                            field831[var6++] = var347 + class167.method594(var348, true);
                            continue;
                        }
                        if (var513 == 4103) {
                            var6--;
                            String var349 = field831[var6];
                            field831[var6++] = var349.toLowerCase();
                            continue;
                        }
                        if (var513 == 4104) {
                            var5--;
                            int var350 = field834[var5];
                            long var351 = ((long) var350 + 11745L) * 86400000L;
                            field835.setTime(new Date(var351));
                            int var353 = field835.get(5);
                            int var354 = field835.get(2);
                            int var355 = field835.get(1);
                            field831[var6++] = var353 + "-" + field832[var354] + "-" + var355;
                            continue;
                        }
                        if (var513 == 4105) {
                            var6 -= 2;
                            String var356 = field831[var6];
                            String var357 = field831[var6 + 1];
                            if (Statics.field68.field33 != null && Statics.field68.field33.field2985) {
                                field831[var6++] = var357;
                                continue;
                            }
                            field831[var6++] = var356;
                            continue;
                        }
                        if (var513 == 4106) {
                            var5--;
                            int var358 = field834[var5];
                            field831[var6++] = Integer.toString(var358);
                            continue;
                        }
                        if (var513 == 4107) {
                            var6 -= 2;
                            int[] var359 = field834;
                            int var360 = var5++;
                            String var361 = field831[var6];
                            String var362 = field831[var6 + 1];
                            int var363 = client.field490;
                            int var364 = var361.length();
                            int var365 = var362.length();
                            int var366 = 0;
                            int var367 = 0;
                            byte var368 = 0;
                            byte var369 = 0;
                            int var370;
                            label2981: while (true) {
                                if (var366 - var368 >= var364 && var367 - var369 >= var365) {
                                    int var381 = Math.min(var364, var365);
                                    for (int var382 = 0; var382 < var381; var382++) {
                                        char var385 = var361.charAt(var382);
                                        char var386 = var362.charAt(var382);
                                        if (var385 != var386 && Character.toUpperCase(var385) != Character.toUpperCase(var386)) {
                                            char var387 = Character.toLowerCase(var385);
                                            char var388 = Character.toLowerCase(var386);
                                            if (var387 != var388) {
                                                var370 = class170.method1025(var387, var363) - class170.method1025(var388, var363);
                                                break label2981;
                                            }
                                        }
                                    }
                                    int var389 = var364 - var365;
                                    if (var389 == 0) {
                                        for (int var390 = 0; var390 < var381; var390++) {
                                            char var391 = var361.charAt(var390);
                                            char var392 = var362.charAt(var390);
                                            if (var391 != var392) {
                                                var370 = class170.method1025(var391, var363) - class170.method1025(var392, var363);
                                                break label2981;
                                            }
                                        }
                                        var370 = 0;
                                    } else {
                                        var370 = var389;
                                    }
                                    break;
                                }
                                if (var366 - var368 >= var364) {
                                    var370 = -1;
                                    break;
                                }
                                if (var367 - var369 >= var365) {
                                    var370 = 1;
                                    break;
                                }
                                char var371;
                                if (var368 == 0) {
                                    var371 = var361.charAt(var366++);
                                } else {
                                    var371 = (char) var368;
                                    boolean var372 = false;
                                }
                                char var373;
                                if (var369 == 0) {
                                    var373 = var362.charAt(var367++);
                                } else {
                                    var373 = (char) var369;
                                    boolean var374 = false;
                                }
                                byte var375;
                                if (var371 == 198) {
                                    var375 = 69;
                                } else if (var371 == 230) {
                                    var375 = 101;
                                } else if (var371 == 223) {
                                    var375 = 115;
                                } else if (var371 == 338) {
                                    var375 = 69;
                                } else if (var371 == 339) {
                                    var375 = 101;
                                } else {
                                    var375 = 0;
                                }
                                var368 = var375;
                                byte var376;
                                if (var373 == 198) {
                                    var376 = 69;
                                } else if (var373 == 230) {
                                    var376 = 101;
                                } else if (var373 == 223) {
                                    var376 = 115;
                                } else if (var373 == 338) {
                                    var376 = 69;
                                } else if (var373 == 339) {
                                    var376 = 101;
                                } else {
                                    var376 = 0;
                                }
                                var369 = var376;
                                char var377 = class170.method2999(var371, var363);
                                char var378 = class170.method2999(var373, var363);
                                if (var377 != var378 && Character.toUpperCase(var377) != Character.toUpperCase(var378)) {
                                    char var379 = Character.toLowerCase(var377);
                                    char var380 = Character.toLowerCase(var378);
                                    if (var379 != var380) {
                                        var370 = class170.method1025(var379, var363) - class170.method1025(var380, var363);
                                        break;
                                    }
                                }
                            }
                            byte var394;
                            if (var370 > 0) {
                                var394 = 1;
                            } else if (var370 < 0) {
                                var394 = -1;
                            } else {
                                var394 = 0;
                            }
                            var359[var360] = var394;
                            continue;
                        }
                        if (var513 == 4108) {
                            var6--;
                            String var395 = field831[var6];
                            var5 -= 2;
                            int var396 = field834[var5];
                            int var397 = field834[var5 + 1];
                            byte[] var398 = Statics.field1157.method3117(var397, 0);
                            class228 var399 = new class228(var398);
                            field834[var5++] = var399.method3831(var395, var396);
                            continue;
                        }
                        if (var513 == 4109) {
                            var6--;
                            String var400 = field831[var6];
                            var5 -= 2;
                            int var401 = field834[var5];
                            int var402 = field834[var5 + 1];
                            byte[] var403 = Statics.field1157.method3117(var402, 0);
                            class228 var404 = new class228(var403);
                            field834[var5++] = var404.method3830(var400, var401);
                            continue;
                        }
                        if (var513 == 4110) {
                            var6 -= 2;
                            String var405 = field831[var6];
                            String var406 = field831[var6 + 1];
                            var5--;
                            if (field834[var5] == 1) {
                                field831[var6++] = var405;
                            } else {
                                field831[var6++] = var406;
                            }
                            continue;
                        }
                        if (var513 == 4111) {
                            var6--;
                            String var407 = field831[var6];
                            field831[var6++] = class227.method3832(var407);
                            continue;
                        }
                        if (var513 == 4112) {
                            var6--;
                            String var408 = field831[var6];
                            var5--;
                            int var409 = field834[var5];
                            field831[var6++] = var408 + (char) var409;
                            continue;
                        }
                        if (var513 == 4113) {
                            var5--;
                            int var410 = field834[var5];
                            field834[var5++] = class167.method2192((char) var410) ? 1 : 0;
                            continue;
                        }
                        if (var513 == 4114) {
                            var5--;
                            int var411 = field834[var5];
                            field834[var5++] = class167.method580((char) var411) ? 1 : 0;
                            continue;
                        }
                        if (var513 == 4115) {
                            var5--;
                            int var412 = field834[var5];
                            int[] var413 = field834;
                            int var414 = var5++;
                            char var415 = (char) var412;
                            boolean var416 = var415 >= 'A' && var415 <= 'Z' || var415 >= 'a' && var415 <= 'z';
                            var413[var414] = var416 ? 1 : 0;
                            continue;
                        }
                        if (var513 == 4116) {
                            var5--;
                            int var417 = field834[var5];
                            field834[var5++] = class167.method1581((char) var417) ? 1 : 0;
                            continue;
                        }
                        if (var513 == 4117) {
                            var6--;
                            String var418 = field831[var6];
                            if (var418 == null) {
                                field834[var5++] = 0;
                            } else {
                                field834[var5++] = var418.length();
                            }
                            continue;
                        }
                        if (var513 == 4118) {
                            var6--;
                            String var419 = field831[var6];
                            var5 -= 2;
                            int var420 = field834[var5];
                            int var421 = field834[var5 + 1];
                            field831[var6++] = var419.substring(var420, var421);
                            continue;
                        }
                        if (var513 == 4119) {
                            var6--;
                            String var422 = field831[var6];
                            StringBuilder var423 = new StringBuilder(var422.length());
                            boolean var424 = false;
                            for (int var425 = 0; var425 < var422.length(); var425++) {
                                char var426 = var422.charAt(var425);
                                if (var426 == '<') {
                                    var424 = true;
                                } else if (var426 == '>') {
                                    var424 = false;
                                } else if (!var424) {
                                    var423.append(var426);
                                }
                            }
                            field831[var6++] = var423.toString();
                            continue;
                        }
                        if (var513 == 4120) {
                            var6--;
                            String var427 = field831[var6];
                            var5--;
                            int var428 = field834[var5];
                            field834[var5++] = var427.indexOf(var428);
                            continue;
                        }
                        if (var513 == 4121) {
                            var6 -= 2;
                            String var429 = field831[var6];
                            String var430 = field831[var6 + 1];
                            var5--;
                            int var431 = field834[var5];
                            field834[var5++] = var429.indexOf(var430, var431);
                            continue;
                        }
                    } else if (var513 < 4300) {
                        if (var513 == 4200) {
                            var5--;
                            int var432 = field834[var5];
                            field831[var6++] = class56.method754(var432).field1187;
                            continue;
                        }
                        if (var513 == 4201) {
                            var5 -= 2;
                            int var433 = field834[var5];
                            int var434 = field834[var5 + 1];
                            class56 var435 = class56.method754(var433);
                            if (var434 >= 1 && var434 <= 5 && var435.field1201[var434 - 1] != null) {
                                field831[var6++] = var435.field1201[var434 - 1];
                                continue;
                            }
                            field831[var6++] = "";
                            continue;
                        }
                        if (var513 == 4202) {
                            var5 -= 2;
                            int var436 = field834[var5];
                            int var437 = field834[var5 + 1];
                            class56 var438 = class56.method754(var436);
                            if (var437 >= 1 && var437 <= 5 && var438.field1202[var437 - 1] != null) {
                                field831[var6++] = var438.field1202[var437 - 1];
                                continue;
                            }
                            field831[var6++] = "";
                            continue;
                        }
                        if (var513 == 4203) {
                            var5--;
                            int var439 = field834[var5];
                            field834[var5++] = class56.method754(var439).field1199;
                            continue;
                        }
                        if (var513 == 4204) {
                            var5--;
                            int var440 = field834[var5];
                            field834[var5++] = class56.method754(var440).field1198 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var513 == 4205) {
                            var5--;
                            int var441 = field834[var5];
                            class56 var442 = class56.method754(var441);
                            if (var442.field1220 == -1 && var442.field1229 >= 0) {
                                field834[var5++] = var442.field1229;
                                continue;
                            }
                            field834[var5++] = var441;
                            continue;
                        }
                        if (var513 == 4206) {
                            var5--;
                            int var443 = field834[var5];
                            class56 var444 = class56.method754(var443);
                            if (var444.field1220 >= 0 && var444.field1229 >= 0) {
                                field834[var5++] = var444.field1229;
                                continue;
                            }
                            field834[var5++] = var443;
                            continue;
                        }
                        if (var513 == 4207) {
                            var5--;
                            int var445 = field834[var5];
                            field834[var5++] = class56.method754(var445).field1200 ? 1 : 0;
                            continue;
                        }
                        if (var513 == 4208) {
                            var5--;
                            int var446 = field834[var5];
                            class56 var447 = class56.method754(var446);
                            if (var447.field1185 == -1 && var447.field1228 >= 0) {
                                field834[var5++] = var447.field1228;
                                continue;
                            }
                            field834[var5++] = var446;
                            continue;
                        }
                        if (var513 == 4209) {
                            var5--;
                            int var448 = field834[var5];
                            class56 var449 = class56.method754(var448);
                            if (var449.field1185 >= 0 && var449.field1228 >= 0) {
                                field834[var5++] = var449.field1228;
                                continue;
                            }
                            field834[var5++] = var448;
                            continue;
                        }
                        if (var513 == 4210) {
                            var6--;
                            String var450 = field831[var6];
                            var5--;
                            int var451 = field834[var5];
                            boolean var453 = var451 == 1;
                            String var454 = var450.toLowerCase();
                            short[] var455 = new short[16];
                            int var456 = 0;
                            int var457 = 0;
                            while (true) {
                                if (var457 >= Statics.field159) {
                                    Statics.field1960 = var455;
                                    Statics.field380 = 0;
                                    Statics.field182 = var456;
                                    String[] var461 = new String[Statics.field182];
                                    for (int var462 = 0; var462 < Statics.field182; var462++) {
                                        var461[var462] = class56.method754(var455[var462]).field1187;
                                    }
                                    short[] var463 = Statics.field1960;
                                    class128.method2690(var461, var463, 0, var461.length - 1);
                                    break;
                                }
                                class56 var458 = class56.method754(var457);
                                if ((!var453 || var458.field1192) && var458.field1220 == -1 && var458.field1187.toLowerCase().indexOf(var454) != -1) {
                                    if (var456 >= 250) {
                                        Statics.field182 = -1;
                                        Statics.field1960 = null;
                                        break;
                                    }
                                    if (var456 >= var455.length) {
                                        short[] var459 = new short[var455.length * 2];
                                        for (int var460 = 0; var460 < var456; var460++) {
                                            var459[var460] = var455[var460];
                                        }
                                        var455 = var459;
                                    }
                                    var455[var456++] = (short) var457;
                                }
                                var457++;
                            }
                            field834[var5++] = Statics.field182;
                            continue;
                        }
                        if (var513 == 4211) {
                            if (Statics.field1960 != null && Statics.field380 < Statics.field182) {
                                field834[var5++] = Statics.field1960[++Statics.field380 - 1] & 0xFFFF;
                                continue;
                            }
                            field834[var5++] = -1;
                            continue;
                        }
                        if (var513 == 4212) {
                            Statics.field380 = 0;
                            continue;
                        }
                    } else if (var513 < 5100) {
                        if (var513 == 5000) {
                            field834[var5++] = client.field499;
                            continue;
                        }
                        if (var513 == 5001) {
                            var5 -= 3;
                            client.field499 = field834[var5];
                            Statics.field1545 = class134.method2190(field834[var5 + 1]);
                            if (Statics.field1545 == null) {
                                Statics.field1545 = class134.field2132;
                            }
                            client.field500 = field834[var5 + 2];
                            client.field324.method2668(158);
                            client.field324.method2380(client.field499);
                            client.field324.method2380(Statics.field1545.field2134);
                            client.field324.method2380(client.field500);
                            continue;
                        }
                        if (var513 == 5002) {
                            var6--;
                            String var464 = field831[var6];
                            var5 -= 2;
                            int var465 = field834[var5];
                            int var466 = field834[var5 + 1];
                            client.field324.method2668(49);
                            client.field324.method2380(class123.method224(var464) + 2);
                            client.field324.method2386(var464);
                            client.field324.method2380(var465 - 1);
                            client.field324.method2380(var466);
                            continue;
                        }
                        if (var513 == 5003) {
                            var5 -= 2;
                            int var467 = field834[var5];
                            int var468 = field834[var5 + 1];
                            class38 var469 = class12.method3021(var467, var468);
                            if (var469 == null) {
                                field834[var5++] = -1;
                                field834[var5++] = 0;
                                field831[var6++] = "";
                                field831[var6++] = "";
                                field831[var6++] = "";
                            } else {
                                field834[var5++] = var469.field820;
                                field834[var5++] = var469.field819;
                                field831[var6++] = var469.field817 == null ? "" : var469.field817;
                                field831[var6++] = var469.field818 == null ? "" : var469.field818;
                                field831[var6++] = var469.field815 == null ? "" : var469.field815;
                            }
                            continue;
                        }
                        if (var513 == 5004) {
                            var5--;
                            int var470 = field834[var5];
                            class38 var471 = (class38) class12.field167.method3599((long) var470);
                            if (var471 == null) {
                                field834[var5++] = -1;
                                field834[var5++] = 0;
                                field831[var6++] = "";
                                field831[var6++] = "";
                                field831[var6++] = "";
                            } else {
                                field834[var5++] = var471.field816;
                                field834[var5++] = var471.field819;
                                field831[var6++] = var471.field817 == null ? "" : var471.field817;
                                field831[var6++] = var471.field818 == null ? "" : var471.field818;
                                field831[var6++] = var471.field815 == null ? "" : var471.field815;
                            }
                            continue;
                        }
                        if (var513 == 5005) {
                            if (Statics.field1545 == null) {
                                field834[var5++] = -1;
                            } else {
                                field834[var5++] = Statics.field1545.field2134;
                            }
                            continue;
                        }
                        if (var513 == 5008) {
                            var6--;
                            String var473 = field831[var6];
                            var5--;
                            int var474 = field834[var5];
                            String var475 = var473.toLowerCase();
                            byte var476 = 0;
                            if (var475.startsWith(class161.field2550)) {
                                var476 = 0;
                                var473 = var473.substring(class161.field2550.length());
                            } else if (var475.startsWith(class161.field2486)) {
                                var476 = 1;
                                var473 = var473.substring(class161.field2486.length());
                            } else if (var475.startsWith(class161.field2554)) {
                                var476 = 2;
                                var473 = var473.substring(class161.field2554.length());
                            } else if (var475.startsWith(class161.field2556)) {
                                var476 = 3;
                                var473 = var473.substring(class161.field2556.length());
                            } else if (var475.startsWith(class161.field2558)) {
                                var476 = 4;
                                var473 = var473.substring(class161.field2558.length());
                            } else if (var475.startsWith(class161.field2560)) {
                                var476 = 5;
                                var473 = var473.substring(class161.field2560.length());
                            } else if (var475.startsWith(class161.field2562)) {
                                var476 = 6;
                                var473 = var473.substring(class161.field2562.length());
                            } else if (var475.startsWith(class161.field2564)) {
                                var476 = 7;
                                var473 = var473.substring(class161.field2564.length());
                            } else if (var475.startsWith(class161.field2376)) {
                                var476 = 8;
                                var473 = var473.substring(class161.field2376.length());
                            } else if (var475.startsWith(class161.field2568)) {
                                var476 = 9;
                                var473 = var473.substring(class161.field2568.length());
                            } else if (var475.startsWith(class161.field2570)) {
                                var476 = 10;
                                var473 = var473.substring(class161.field2570.length());
                            } else if (var475.startsWith(class161.field2572)) {
                                var476 = 11;
                                var473 = var473.substring(class161.field2572.length());
                            } else if (client.field490 != 0) {
                                if (var475.startsWith(class161.field2565)) {
                                    var476 = 0;
                                    var473 = var473.substring(class161.field2565.length());
                                } else if (var475.startsWith(class161.field2553)) {
                                    var476 = 1;
                                    var473 = var473.substring(class161.field2553.length());
                                } else if (var475.startsWith(class161.field2555)) {
                                    var476 = 2;
                                    var473 = var473.substring(class161.field2555.length());
                                } else if (var475.startsWith(class161.field2557)) {
                                    var476 = 3;
                                    var473 = var473.substring(class161.field2557.length());
                                } else if (var475.startsWith(class161.field2566)) {
                                    var476 = 4;
                                    var473 = var473.substring(class161.field2566.length());
                                } else if (var475.startsWith(class161.field2622)) {
                                    var476 = 5;
                                    var473 = var473.substring(class161.field2622.length());
                                } else if (var475.startsWith(class161.field2563)) {
                                    var476 = 6;
                                    var473 = var473.substring(class161.field2563.length());
                                } else if (var475.startsWith(class161.field2452)) {
                                    var476 = 7;
                                    var473 = var473.substring(class161.field2452.length());
                                } else if (var475.startsWith(class161.field2596)) {
                                    var476 = 8;
                                    var473 = var473.substring(class161.field2596.length());
                                } else if (var475.startsWith(class161.field2395)) {
                                    var476 = 9;
                                    var473 = var473.substring(class161.field2395.length());
                                } else if (var475.startsWith(class161.field2467)) {
                                    var476 = 10;
                                    var473 = var473.substring(class161.field2467.length());
                                } else if (var475.startsWith(class161.field2573)) {
                                    var476 = 11;
                                    var473 = var473.substring(class161.field2573.length());
                                }
                            }
                            String var477 = var473.toLowerCase();
                            byte var478 = 0;
                            if (var477.startsWith(class161.field2574)) {
                                var478 = 1;
                                var473 = var473.substring(class161.field2574.length());
                            } else if (var477.startsWith(class161.field2576)) {
                                var478 = 2;
                                var473 = var473.substring(class161.field2576.length());
                            } else if (var477.startsWith(class161.field2578)) {
                                var478 = 3;
                                var473 = var473.substring(class161.field2578.length());
                            } else if (var477.startsWith(class161.field2571)) {
                                var478 = 4;
                                var473 = var473.substring(class161.field2571.length());
                            } else if (var477.startsWith(class161.field2582)) {
                                var478 = 5;
                                var473 = var473.substring(class161.field2582.length());
                            } else if (client.field490 != 0) {
                                if (var477.startsWith(class161.field2575)) {
                                    var478 = 1;
                                    var473 = var473.substring(class161.field2575.length());
                                } else if (var477.startsWith(class161.field2404)) {
                                    var478 = 2;
                                    var473 = var473.substring(class161.field2404.length());
                                } else if (var477.startsWith(class161.field2579)) {
                                    var478 = 3;
                                    var473 = var473.substring(class161.field2579.length());
                                } else if (var477.startsWith(class161.field2391)) {
                                    var478 = 4;
                                    var473 = var473.substring(class161.field2391.length());
                                } else if (var477.startsWith(class161.field2545)) {
                                    var478 = 5;
                                    var473 = var473.substring(class161.field2545.length());
                                }
                            }
                            client.field324.method2668(157);
                            client.field324.method2380(0);
                            int var479 = client.field324.field2071;
                            client.field324.method2380(var474);
                            client.field324.method2380(var476);
                            client.field324.method2380(var478);
                            class226.method3536(client.field324, var473);
                            client.field324.method2390(client.field324.field2071 - var479);
                            continue;
                        }
                        if (var513 == 5009) {
                            var6 -= 2;
                            String var480 = field831[var6];
                            String var481 = field831[var6 + 1];
                            client.field324.method2668(167);
                            client.field324.method2381(0);
                            int var482 = client.field324.field2071;
                            client.field324.method2386(var480);
                            class226.method3536(client.field324, var481);
                            client.field324.method2445(client.field324.field2071 - var482);
                            continue;
                        }
                        if (var513 == 5015) {
                            String var483;
                            if (Statics.field68 == null || Statics.field68.field53 == null) {
                                var483 = "";
                            } else {
                                var483 = Statics.field68.field53;
                            }
                            field831[var6++] = var483;
                            continue;
                        }
                        if (var513 == 5016) {
                            field834[var5++] = client.field500;
                            continue;
                        }
                        if (var513 == 5017) {
                            var5--;
                            int var484 = field834[var5];
                            field834[var5++] = class12.method3004(var484);
                            continue;
                        }
                        if (var513 == 5018) {
                            var5--;
                            int var485 = field834[var5];
                            int[] var486 = field834;
                            int var487 = var5++;
                            class38 var488 = (class38) class12.field167.method3599((long) var485);
                            int var489;
                            if (var488 == null) {
                                var489 = -1;
                            } else if (class12.field168.field3155 == var488.field3160) {
                                var489 = -1;
                            } else {
                                var489 = ((class38) var488.field3160).field820;
                            }
                            var486[var487] = var489;
                            continue;
                        }
                        if (var513 == 5019) {
                            var5--;
                            int var490 = field834[var5];
                            field834[var5++] = class12.method755(var490);
                            continue;
                        }
                        if (var513 == 5020) {
                            var6--;
                            String var491 = field831[var6];
                            if (var491.equalsIgnoreCase("toggleroof")) {
                                Statics.field2040.field132 = !Statics.field2040.field132;
                                class9.method1623();
                                if (Statics.field2040.field132) {
                                    class12.method130(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method130(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var491.equalsIgnoreCase("displayfps")) {
                                client.field297 = !client.field297;
                            }
                            if (client.field352 >= 2) {
                                if (var491.equalsIgnoreCase("fpson")) {
                                    client.field297 = true;
                                }
                                if (var491.equalsIgnoreCase("fpsoff")) {
                                    client.field297 = false;
                                }
                                if (var491.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var491.equalsIgnoreCase("clientdrop")) {
                                    client.method2979();
                                }
                                if (var491.equalsIgnoreCase("errortest") && client.field282 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field324.method2668(77);
                            client.field324.method2380(var491.length() + 1);
                            client.field324.method2386(var491);
                            continue;
                        }
                        if (var513 == 5021) {
                            var6--;
                            client.field501 = field831[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var513 == 5022) {
                            field831[var6++] = client.field501;
                            continue;
                        }
                    }
                } else {
                    class177 var87;
                    if (var513 >= 2000) {
                        var513 -= 1000;
                        var5--;
                        var87 = class177.method595(field834[var5]);
                    } else {
                        var87 = var58 ? Statics.field3264 : Statics.field830;
                    }
                    if (var513 == 1300) {
                        var5--;
                        int var88 = field834[var5] - 1;
                        if (var88 >= 0 && var88 <= 9) {
                            var6--;
                            var87.method3254(var88, field831[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var513 == 1301) {
                        var5 -= 2;
                        int var89 = field834[var5];
                        int var90 = field834[var5 + 1];
                        var87.field2892 = class177.method763(var89, var90);
                        continue;
                    }
                    if (var513 == 1302) {
                        var5--;
                        var87.field2895 = field834[var5] == 1;
                        continue;
                    }
                    if (var513 == 1303) {
                        var5--;
                        var87.field2864 = field834[var5];
                        continue;
                    }
                    if (var513 == 1304) {
                        var5--;
                        var87.field2894 = field834[var5];
                        continue;
                    }
                    if (var513 == 1305) {
                        var6--;
                        var87.field2877 = field831[var6];
                        continue;
                    }
                    if (var513 == 1306) {
                        var6--;
                        var87.field2896 = field831[var6];
                        continue;
                    }
                    if (var513 == 1307) {
                        var87.field2891 = null;
                        continue;
                    }
                }
                if (var513 < 5400) {
                    if (var513 == 5306) {
                        field834[var5++] = client.method581();
                        continue;
                    }
                    if (var513 == 5307) {
                        var5--;
                        int var492 = field834[var5];
                        if (var492 == 1 || var492 == 2) {
                            client.method46(var492);
                        }
                        continue;
                    }
                    if (var513 == 5308) {
                        field834[var5++] = Statics.field2040.field135;
                        continue;
                    }
                    if (var513 == 5309) {
                        var5--;
                        int var493 = field834[var5];
                        if (var493 == 1 || var493 == 2) {
                            Statics.field2040.field135 = var493;
                            class9.method1623();
                        }
                        continue;
                    }
                }
                if (var513 < 5600) {
                    if (var513 == 5504) {
                        var5 -= 2;
                        int var494 = field834[var5];
                        int var495 = field834[var5 + 1];
                        if (!client.field529) {
                            client.field367 = var494;
                            client.field368 = var495;
                        }
                        continue;
                    }
                    if (var513 == 5505) {
                        field834[var5++] = client.field367;
                        continue;
                    }
                    if (var513 == 5506) {
                        field834[var5++] = client.field368;
                        continue;
                    }
                    if (var513 == 5530) {
                        var5--;
                        int var496 = field834[var5];
                        if (var496 < 0) {
                            var496 = 0;
                        }
                        client.field373 = var496;
                        continue;
                    }
                    if (var513 == 5531) {
                        field834[var5++] = client.field373;
                        continue;
                    }
                }
                if (var513 >= 5700 || var513 != 5630) {
                    if (var513 < 6300) {
                        if (var513 == 6200) {
                            var5 -= 2;
                            client.field536 = (short) field834[var5];
                            if (client.field536 <= 0) {
                                client.field536 = 256;
                            }
                            client.field369 = (short) field834[var5 + 1];
                            if (client.field369 <= 0) {
                                client.field369 = 205;
                            }
                            continue;
                        }
                        if (var513 == 6201) {
                            var5 -= 2;
                            client.field538 = (short) field834[var5];
                            if (client.field538 <= 0) {
                                client.field538 = 256;
                            }
                            client.field531 = (short) field834[var5 + 1];
                            if (client.field531 <= 0) {
                                client.field531 = 320;
                            }
                            continue;
                        }
                        if (var513 == 6202) {
                            var5 -= 4;
                            client.field285 = (short) field834[var5];
                            if (client.field285 <= 0) {
                                client.field285 = 1;
                            }
                            client.field541 = (short) field834[var5 + 1];
                            if (client.field541 <= 0) {
                                client.field541 = 32767;
                            } else if (client.field541 < client.field285) {
                                client.field541 = client.field285;
                            }
                            client.field542 = (short) field834[var5 + 2];
                            if (client.field542 <= 0) {
                                client.field542 = 1;
                            }
                            client.field543 = (short) field834[var5 + 3];
                            if (client.field543 <= 0) {
                                client.field543 = 32767;
                            } else if (client.field543 < client.field542) {
                                client.field543 = client.field542;
                            }
                            continue;
                        }
                        if (var513 == 6203) {
                            if (client.field453 == null) {
                                field834[var5++] = -1;
                                field834[var5++] = -1;
                            } else {
                                client.method2277(0, 0, client.field453.field2832, client.field453.field2872, false);
                                field834[var5++] = client.field546;
                                field834[var5++] = client.field365;
                            }
                            continue;
                        }
                        if (var513 == 6204) {
                            field834[var5++] = client.field538;
                            field834[var5++] = client.field531;
                            continue;
                        }
                        if (var513 == 6205) {
                            field834[var5++] = client.field536;
                            field834[var5++] = client.field369;
                            continue;
                        }
                    }
                    if (var513 < 6600) {
                        if (var513 == 6500) {
                            field834[var5++] = class28.method188() ? 1 : 0;
                            continue;
                        }
                        if (var513 == 6501) {
                            class28.field659 = 0;
                            class28 var497 = class28.method601();
                            if (var497 == null) {
                                field834[var5++] = -1;
                                field834[var5++] = 0;
                                field831[var6++] = "";
                                field834[var5++] = 0;
                                field834[var5++] = 0;
                                field831[var6++] = "";
                            } else {
                                field834[var5++] = var497.field664;
                                field834[var5++] = var497.field655;
                                field831[var6++] = var497.field668;
                                field834[var5++] = var497.field663;
                                field834[var5++] = var497.field666;
                                field831[var6++] = var497.field667;
                            }
                            continue;
                        }
                        if (var513 == 6502) {
                            class28 var499 = class28.method601();
                            if (var499 == null) {
                                field834[var5++] = -1;
                                field834[var5++] = 0;
                                field831[var6++] = "";
                                field834[var5++] = 0;
                                field834[var5++] = 0;
                                field831[var6++] = "";
                            } else {
                                field834[var5++] = var499.field664;
                                field834[var5++] = var499.field655;
                                field831[var6++] = var499.field668;
                                field834[var5++] = var499.field663;
                                field834[var5++] = var499.field666;
                                field831[var6++] = var499.field667;
                            }
                            continue;
                        }
                        if (var513 == 6506) {
                            var5--;
                            int var500 = field834[var5];
                            class28 var501 = null;
                            for (int var502 = 0; var502 < class28.field660; var502++) {
                                if (Statics.field675[var502].field664 == var500) {
                                    var501 = Statics.field675[var502];
                                    break;
                                }
                            }
                            if (var501 == null) {
                                field834[var5++] = -1;
                                field834[var5++] = 0;
                                field831[var6++] = "";
                                field834[var5++] = 0;
                                field834[var5++] = 0;
                                field831[var6++] = "";
                            } else {
                                field834[var5++] = var501.field664;
                                field834[var5++] = var501.field655;
                                field831[var6++] = var501.field668;
                                field834[var5++] = var501.field663;
                                field834[var5++] = var501.field666;
                                field831[var6++] = var501.field667;
                            }
                            continue;
                        }
                        if (var513 == 6507) {
                            var5 -= 4;
                            int var503 = field834[var5];
                            boolean var504 = field834[var5 + 1] == 1;
                            int var505 = field834[var5 + 2];
                            boolean var506 = field834[var5 + 3] == 1;
                            class28.method2271(var503, var504, var505, var506);
                            continue;
                        }
                        if (var513 == 6511) {
                            var5--;
                            int var507 = field834[var5];
                            if (var507 >= 0 && var507 < class28.field660) {
                                class28 var508 = Statics.field675[var507];
                                field834[var5++] = var508.field664;
                                field834[var5++] = var508.field655;
                                field831[var6++] = var508.field668;
                                field834[var5++] = var508.field663;
                                field834[var5++] = var508.field666;
                                field831[var6++] = var508.field667;
                                continue;
                            }
                            field834[var5++] = -1;
                            field834[var5++] = 0;
                            field831[var6++] = "";
                            field834[var5++] = 0;
                            field834[var5++] = 0;
                            field831[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field334 = 250;
            }
        } catch (Exception var512) {
            StringBuilder var510 = new StringBuilder(30);
            var510.append("").append(var4.field3171).append(" ");
            for (int var511 = field825 - 1; var511 >= 0; var511--) {
                var510.append("").append(field839[var511].field211.field3171).append(" ");
            }
            var510.append("").append(var10);
            class152.method2703(var510.toString(), var512);
        }
    }

    @ObfuscatedName("al.d(II)V")
    public static void method780(int arg0) {
        if (arg0 == -1 || !class177.method2001(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2942[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3.field2898 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field8 = var3.field2898;
                method10(var4, 2000000);
            }
        }
    }
}
