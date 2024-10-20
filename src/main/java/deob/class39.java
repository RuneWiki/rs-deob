package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ah")
public class class39 {

    @ObfuscatedName("ah.n")
    public static int[] field822 = new int[5];

    @ObfuscatedName("ah.u")
    public static int[][] field823 = new int[5][5000];

    @ObfuscatedName("ah.d")
    public static int[] field830 = new int[1000];

    @ObfuscatedName("ah.l")
    public static String[] field825 = new String[1000];

    @ObfuscatedName("ah.m")
    public static int field833 = 0;

    @ObfuscatedName("ah.j")
    public static class15[] field819 = new class15[50];

    @ObfuscatedName("ah.p")
    public static Calendar field829 = Calendar.getInstance();

    @ObfuscatedName("ah.v")
    public static final String[] field826 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ah.r")
    public static int field831 = 0;

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.i(Li;I)V")
    public static void method147(class1 arg0) {
        method625(arg0, 200000);
    }

    @ObfuscatedName("af.h(Li;IS)V")
    public static void method625(class1 arg0, int arg1) {
        Object[] var2 = arg0.field9;
        int var3 = (Integer) var2[0];
        class24 var4 = Statics.method2857(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field616;
        int[] var9 = var4.field618;
        byte var10 = -1;
        field833 = 0;
        try {
            Statics.field820 = new int[var4.field620];
            int var11 = 0;
            Statics.field821 = new String[var4.field621];
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
                        var14 = arg0.field14 == null ? -1 : arg0.field14.field2803;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field10;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field14 == null ? -1 : arg0.field14.field2804;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2803;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2804;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field18;
                    }
                    Statics.field820[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1;
                    }
                    Statics.field821[var12++] = var15;
                }
            }
            int var16 = 0;
            field831 = arg0.field11;
            label3076: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var469 = var8[var7];
                if (var469 < 100) {
                    if (var469 == 0) {
                        field830[var5++] = var9[var7];
                        continue;
                    }
                    if (var469 == 1) {
                        int var17 = var9[var7];
                        field830[var5++] = class180.field2955[var17];
                        continue;
                    }
                    if (var469 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class180.field2955[var18] = field830[var5];
                        client.method2835(var18);
                        continue;
                    }
                    if (var469 == 3) {
                        field825[var6++] = var4.field623[var7];
                        continue;
                    }
                    if (var469 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var469 == 7) {
                        var5 -= 2;
                        if (field830[var5 + 1] != field830[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var469 == 8) {
                        var5 -= 2;
                        if (field830[var5 + 1] == field830[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var469 == 9) {
                        var5 -= 2;
                        if (field830[var5] < field830[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var469 == 10) {
                        var5 -= 2;
                        if (field830[var5] > field830[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var469 == 21) {
                        if (field833 == 0) {
                            return;
                        }
                        class15 var19 = field819[--field833];
                        var4 = var19.field223;
                        var8 = var4.field616;
                        var9 = var4.field618;
                        var7 = var19.field221;
                        Statics.field820 = var19.field222;
                        Statics.field821 = var19.field227;
                        continue;
                    }
                    if (var469 == 25) {
                        int var20 = var9[var7];
                        field830[var5++] = class180.method123(var20);
                        continue;
                    }
                    if (var469 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class180.method2865(var21, field830[var5]);
                        continue;
                    }
                    if (var469 == 31) {
                        var5 -= 2;
                        if (field830[var5] <= field830[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var469 == 32) {
                        var5 -= 2;
                        if (field830[var5] >= field830[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var469 == 33) {
                        field830[var5++] = Statics.field820[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var469 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field820[var10001] = field830[var5];
                        continue;
                    }
                    if (var469 == 35) {
                        field825[var6++] = Statics.field821[var9[var7]];
                        continue;
                    }
                    if (var469 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field821[var10001] = field825[var6];
                        continue;
                    }
                    if (var469 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class167.method819(field825, var6, var22);
                        field825[var6++] = var23;
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
                        int var24 = var9[var7];
                        class24 var25 = Statics.method2857(var24);
                        int[] var26 = new int[var25.field620];
                        String[] var27 = new String[var25.field621];
                        for (int var28 = 0; var28 < var25.field619; var28++) {
                            var26[var28] = field830[var5 - var25.field619 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field624; var29++) {
                            var27[var29] = field825[var6 - var25.field624 + var29];
                        }
                        var5 -= var25.field619;
                        var6 -= var25.field624;
                        class15 var30 = new class15();
                        var30.field223 = var4;
                        var30.field221 = var7;
                        var30.field222 = Statics.field820;
                        var30.field227 = Statics.field821;
                        field819[++field833 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field616;
                        var9 = var25.field618;
                        var7 = -1;
                        Statics.field820 = var26;
                        Statics.field821 = var27;
                        continue;
                    }
                    if (var469 == 42) {
                        field830[var5++] = Statics.field85.method216(var9[var7]);
                        continue;
                    }
                    if (var469 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field85.method210(var10001, field830[var5]);
                        continue;
                    }
                    if (var469 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field830[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field822[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label3076;
                                }
                                field823[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var469 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field830[var5];
                        if (var37 >= 0 && var37 < field822[var36]) {
                            field830[var5++] = field823[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var469 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field830[var5];
                        if (var39 >= 0 && var39 < field822[var38]) {
                            field823[var38][var39] = field830[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var469 == 47) {
                        String var40 = Statics.field85.method195(var9[var7]);
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field825[var6++] = var40;
                        continue;
                    }
                    if (var469 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field85.method197(var10001, field825[var6]);
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var469 < 1000) {
                    if (var469 == 100) {
                        var5 -= 3;
                        int var42 = field830[var5];
                        int var43 = field830[var5 + 1];
                        int var44 = field830[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class177 var45 = class177.method3198(var42);
                        if (var45.field2830 == null) {
                            var45.field2830 = new class177[var44 + 1];
                        }
                        if (var45.field2830.length <= var44) {
                            class177[] var46 = new class177[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2830.length; var47++) {
                                var46[var47] = var45.field2830[var47];
                            }
                            var45.field2830 = var46;
                        }
                        if (var44 > 0 && var45.field2830[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class177 var48 = new class177();
                        var48.field2805 = var43;
                        var48.field2822 = var48.field2803 = var45.field2803;
                        var48.field2804 = var44;
                        var48.field2863 = true;
                        var45.field2830[var44] = var48;
                        if (var41) {
                            Statics.field3177 = var48;
                        } else {
                            Statics.field828 = var48;
                        }
                        client.method654(var45);
                        continue;
                    }
                    if (var469 == 101) {
                        class177 var49 = var41 ? Statics.field3177 : Statics.field828;
                        class177 var50 = class177.method3198(var49.field2803);
                        var50.field2830[var49.field2804] = null;
                        client.method654(var50);
                        continue;
                    }
                    if (var469 == 102) {
                        var5--;
                        class177 var51 = class177.method3198(field830[var5]);
                        var51.field2830 = null;
                        client.method654(var51);
                        continue;
                    }
                    if (var469 == 200) {
                        var5 -= 2;
                        int var52 = field830[var5];
                        int var53 = field830[var5 + 1];
                        class177 var54 = class177.method2742(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field830[var5++] = 1;
                            if (var41) {
                                Statics.field3177 = var54;
                            } else {
                                Statics.field828 = var54;
                            }
                            continue;
                        }
                        field830[var5++] = 0;
                        continue;
                    }
                    if (var469 == 201) {
                        var5--;
                        class177 var55 = class177.method3198(field830[var5]);
                        if (var55 == null) {
                            field830[var5++] = 0;
                        } else {
                            field830[var5++] = 1;
                            if (var41) {
                                Statics.field3177 = var55;
                            } else {
                                Statics.field828 = var55;
                            }
                        }
                        continue;
                    }
                } else if (var469 >= 1000 && var469 < 1100 || var469 >= 2000 && var469 < 2100) {
                    int var56 = -1;
                    class177 var57;
                    if (var469 >= 2000) {
                        var469 -= 1000;
                        var5--;
                        var56 = field830[var5];
                        var57 = class177.method3198(var56);
                    } else {
                        var57 = var41 ? Statics.field3177 : Statics.field828;
                    }
                    if (var469 == 1000) {
                        var5 -= 4;
                        var57.field2843 = field830[var5];
                        var57.field2813 = field830[var5 + 1];
                        var57.field2808 = field830[var5 + 2];
                        var57.field2809 = field830[var5 + 3];
                        client.method654(var57);
                        client.method2341(var57);
                        if (var56 != -1 && var57.field2805 == 0) {
                            client.method2703(Statics.field2824[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var469 == 1001) {
                        var5 -= 4;
                        var57.field2814 = field830[var5];
                        var57.field2815 = field830[var5 + 1];
                        var57.field2810 = field830[var5 + 2];
                        var57.field2811 = field830[var5 + 3];
                        client.method654(var57);
                        client.method2341(var57);
                        if (var56 != -1 && var57.field2805 == 0) {
                            client.method2703(Statics.field2824[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var469 == 1003) {
                        var5--;
                        boolean var58 = field830[var5] == 1;
                        if (var57.field2823 != var58) {
                            var57.field2823 = var58;
                            client.method654(var57);
                        }
                        continue;
                    }
                    if (var469 == 1005) {
                        var5--;
                        var57.field2875 = field830[var5] == 1;
                        continue;
                    }
                    if (var469 == 1006) {
                        var5--;
                        var57.field2937 = field830[var5] == 1;
                        continue;
                    }
                } else if (var469 >= 1100 && var469 < 1200 || var469 >= 2100 && var469 < 2200) {
                    int var59 = -1;
                    class177 var60;
                    if (var469 >= 2000) {
                        var469 -= 1000;
                        var5--;
                        var59 = field830[var5];
                        var60 = class177.method3198(var59);
                    } else {
                        var60 = var41 ? Statics.field3177 : Statics.field828;
                    }
                    if (var469 == 1100) {
                        var5 -= 2;
                        var60.field2858 = field830[var5];
                        if (var60.field2858 > var60.field2826 - var60.field2906) {
                            var60.field2858 = var60.field2826 - var60.field2906;
                        }
                        if (var60.field2858 < 0) {
                            var60.field2858 = 0;
                        }
                        var60.field2825 = field830[var5 + 1];
                        if (var60.field2825 > var60.field2915 - var60.field2819) {
                            var60.field2825 = var60.field2915 - var60.field2819;
                        }
                        if (var60.field2825 < 0) {
                            var60.field2825 = 0;
                        }
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1101) {
                        var5--;
                        var60.field2828 = field830[var5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1102) {
                        var5--;
                        var60.field2832 = field830[var5] == 1;
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1103) {
                        var5--;
                        var60.field2834 = field830[var5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1104) {
                        var5--;
                        var60.field2836 = field830[var5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1105) {
                        var5--;
                        var60.field2853 = field830[var5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1106) {
                        var5--;
                        var60.field2844 = field830[var5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1107) {
                        var5--;
                        var60.field2841 = field830[var5] == 1;
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1108) {
                        var60.field2846 = 1;
                        var5--;
                        var60.field2847 = field830[var5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1109) {
                        var5 -= 6;
                        var60.field2914 = field830[var5];
                        var60.field2899 = field830[var5 + 1];
                        var60.field2880 = field830[var5 + 2];
                        var60.field2907 = field830[var5 + 3];
                        var60.field2856 = field830[var5 + 4];
                        var60.field2857 = field830[var5 + 5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1110) {
                        var5--;
                        int var61 = field830[var5];
                        if (var60.field2829 != var61) {
                            var60.field2829 = var61;
                            var60.field2935 = 0;
                            var60.field2926 = 0;
                            client.method654(var60);
                        }
                        continue;
                    }
                    if (var469 == 1111) {
                        var5--;
                        var60.field2860 = field830[var5] == 1;
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1112) {
                        var6--;
                        String var62 = field825[var6];
                        if (!var62.equals(var60.field2855)) {
                            var60.field2855 = var62;
                            client.method654(var60);
                        }
                        continue;
                    }
                    if (var469 == 1113) {
                        var5--;
                        var60.field2862 = field830[var5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1114) {
                        var5 -= 3;
                        var60.field2866 = field830[var5];
                        var60.field2867 = field830[var5 + 1];
                        var60.field2871 = field830[var5 + 2];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1115) {
                        var5--;
                        var60.field2868 = field830[var5] == 1;
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1116) {
                        var5--;
                        var60.field2842 = field830[var5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1117) {
                        var5--;
                        var60.field2798 = field830[var5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1118) {
                        var5--;
                        var60.field2922 = field830[var5] == 1;
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1119) {
                        var5--;
                        var60.field2845 = field830[var5] == 1;
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1120) {
                        var5 -= 2;
                        var60.field2826 = field830[var5];
                        var60.field2915 = field830[var5 + 1];
                        client.method654(var60);
                        if (var59 != -1 && var60.field2805 == 0) {
                            client.method2703(Statics.field2824[var59 >> 16], var60, false);
                        }
                        continue;
                    }
                    if (var469 == 1121) {
                        Statics.method2968(var60.field2803, var60.field2804);
                        client.field465 = var60;
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1122) {
                        var5--;
                        var60.field2827 = field830[var5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1123) {
                        var5--;
                        var60.field2802 = field830[var5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1124) {
                        var5--;
                        var60.field2835 = field830[var5];
                        client.method654(var60);
                        continue;
                    }
                    if (var469 == 1125) {
                        var5--;
                        int var63 = field830[var5];
                        class86 var64 = (class86) class113.method2810(class86.method1550(), var63);
                        if (var64 != null) {
                            var60.field2879 = var64;
                            client.method654(var60);
                        }
                        continue;
                    }
                } else if (!(var469 < 1200 || var469 >= 1300) || !(var469 < 2200 || var469 >= 2300)) {
                    class177 var65;
                    if (var469 >= 2000) {
                        var469 -= 1000;
                        var5--;
                        var65 = class177.method3198(field830[var5]);
                    } else {
                        var65 = var41 ? Statics.field3177 : Statics.field828;
                    }
                    client.method654(var65);
                    if (var469 == 1200 || var469 == 1205 || var469 == 1212) {
                        var5 -= 2;
                        int var66 = field830[var5];
                        int var67 = field830[var5 + 1];
                        var65.field2923 = var66;
                        var65.field2924 = var67;
                        class56 var68 = class56.method2018(var66);
                        var65.field2880 = var68.field1179;
                        var65.field2907 = var68.field1180;
                        var65.field2856 = var68.field1181;
                        var65.field2914 = var68.field1182;
                        var65.field2899 = var68.field1183;
                        var65.field2857 = var68.field1178;
                        if (var469 == 1205) {
                            var65.field2861 = 0;
                        } else if (var469 == 1212 | var68.field1184 == 1) {
                            var65.field2861 = 1;
                        } else {
                            var65.field2861 = 2;
                        }
                        if (var65.field2792 > 0) {
                            var65.field2857 = var65.field2857 * 32 / var65.field2792;
                        } else if (var65.field2814 > 0) {
                            var65.field2857 = var65.field2857 * 32 / var65.field2814;
                        }
                        continue;
                    }
                    if (var469 == 1201) {
                        var65.field2846 = 2;
                        var5--;
                        var65.field2847 = field830[var5];
                        continue;
                    }
                    if (var469 == 1202) {
                        var65.field2846 = 3;
                        var65.field2847 = Statics.field2137.field33.method3302();
                        continue;
                    }
                } else if (var469 >= 1300 && var469 < 1400 || var469 >= 2300 && var469 < 2400) {
                    class177 var69;
                    if (var469 >= 2000) {
                        var469 -= 1000;
                        var5--;
                        var69 = class177.method3198(field830[var5]);
                    } else {
                        var69 = var41 ? Statics.field3177 : Statics.field828;
                    }
                    if (var469 == 1300) {
                        var5--;
                        int var70 = field830[var5] - 1;
                        if (var70 >= 0 && var70 <= 9) {
                            var6--;
                            var69.method3221(var70, field825[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var469 == 1301) {
                        var5 -= 2;
                        int var71 = field830[var5];
                        int var72 = field830[var5 + 1];
                        var69.field2878 = class177.method2742(var71, var72);
                        continue;
                    }
                    if (var469 == 1302) {
                        var5--;
                        var69.field2881 = field830[var5] == 1;
                        continue;
                    }
                    if (var469 == 1303) {
                        var5--;
                        var69.field2908 = field830[var5];
                        continue;
                    }
                    if (var469 == 1304) {
                        var5--;
                        var69.field2925 = field830[var5];
                        continue;
                    }
                    if (var469 == 1305) {
                        var6--;
                        var69.field2876 = field825[var6];
                        continue;
                    }
                    if (var469 == 1306) {
                        var6--;
                        var69.field2882 = field825[var6];
                        continue;
                    }
                    if (var469 == 1307) {
                        var69.field2877 = null;
                        continue;
                    }
                } else {
                    if (var469 >= 1400 && var469 < 1500 || var469 >= 2400 && var469 < 2500) {
                        class177 var73;
                        if (var469 >= 2000) {
                            var469 -= 1000;
                            var5--;
                            var73 = class177.method3198(field830[var5]);
                        } else {
                            var73 = var41 ? Statics.field3177 : Statics.field828;
                        }
                        var6--;
                        String var74 = field825[var6];
                        int[] var75 = null;
                        if (var74.length() > 0 && var74.charAt(var74.length() - 1) == 'Y') {
                            var5--;
                            int var76 = field830[var5];
                            if (var76 > 0) {
                                var75 = new int[var76];
                                while (var76-- > 0) {
                                    var5--;
                                    var75[var76] = field830[var5];
                                }
                            }
                            var74 = var74.substring(0, var74.length() - 1);
                        }
                        Object[] var77 = new Object[var74.length() + 1];
                        for (int var78 = var77.length - 1; var78 >= 1; var78--) {
                            if (var74.charAt(var78 - 1) == 's') {
                                var6--;
                                var77[var78] = field825[var6];
                            } else {
                                var5--;
                                var77[var78] = Integer.valueOf(field830[var5]);
                            }
                        }
                        var5--;
                        int var79 = field830[var5];
                        if (var79 == -1) {
                            var77 = null;
                        } else {
                            var77[0] = Integer.valueOf(var79);
                        }
                        if (var469 == 1400) {
                            var73.field2885 = var77;
                        }
                        if (var469 == 1401) {
                            var73.field2888 = var77;
                        }
                        if (var469 == 1402) {
                            var73.field2895 = var77;
                        }
                        if (var469 == 1403) {
                            var73.field2839 = var77;
                        }
                        if (var469 == 1404) {
                            var73.field2891 = var77;
                        }
                        if (var469 == 1405) {
                            var73.field2892 = var77;
                        }
                        if (var469 == 1406) {
                            var73.field2911 = var77;
                        }
                        if (var469 == 1407) {
                            var73.field2896 = var77;
                            var73.field2897 = var75;
                        }
                        if (var469 == 1408) {
                            var73.field2927 = var77;
                        }
                        if (var469 == 1409) {
                            var73.field2903 = var77;
                        }
                        if (var469 == 1410) {
                            var73.field2893 = var77;
                        }
                        if (var469 == 1411) {
                            var73.field2886 = var77;
                        }
                        if (var469 == 1412) {
                            var73.field2890 = var77;
                        }
                        if (var469 == 1414) {
                            var73.field2852 = var77;
                            var73.field2918 = var75;
                        }
                        if (var469 == 1415) {
                            var73.field2900 = var77;
                            var73.field2796 = var75;
                        }
                        if (var469 == 1416) {
                            var73.field2894 = var77;
                        }
                        if (var469 == 1417) {
                            var73.field2904 = var77;
                        }
                        if (var469 == 1418) {
                            var73.field2905 = var77;
                        }
                        if (var469 == 1419) {
                            var73.field2930 = var77;
                        }
                        if (var469 == 1420) {
                            var73.field2916 = var77;
                        }
                        if (var469 == 1421) {
                            var73.field2887 = var77;
                        }
                        if (var469 == 1422) {
                            var73.field2854 = var77;
                        }
                        if (var469 == 1423) {
                            var73.field2807 = var77;
                        }
                        if (var469 == 1424) {
                            var73.field2850 = var77;
                        }
                        if (var469 == 1425) {
                            var73.field2913 = var77;
                        }
                        if (var469 == 1426) {
                            var73.field2838 = var77;
                        }
                        if (var469 == 1427) {
                            var73.field2912 = var77;
                        }
                        var73.field2883 = true;
                        continue;
                    }
                    if (var469 < 1600) {
                        class177 var80 = var41 ? Statics.field3177 : Statics.field828;
                        if (var469 == 1500) {
                            field830[var5++] = var80.field2816;
                            continue;
                        }
                        if (var469 == 1501) {
                            field830[var5++] = var80.field2817;
                            continue;
                        }
                        if (var469 == 1502) {
                            field830[var5++] = var80.field2906;
                            continue;
                        }
                        if (var469 == 1503) {
                            field830[var5++] = var80.field2819;
                            continue;
                        }
                        if (var469 == 1504) {
                            field830[var5++] = var80.field2823 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 1505) {
                            field830[var5++] = var80.field2822;
                            continue;
                        }
                    } else if (var469 < 1700) {
                        class177 var81 = var41 ? Statics.field3177 : Statics.field828;
                        if (var469 == 1600) {
                            field830[var5++] = var81.field2858;
                            continue;
                        }
                        if (var469 == 1601) {
                            field830[var5++] = var81.field2825;
                            continue;
                        }
                        if (var469 == 1602) {
                            field825[var6++] = var81.field2855;
                            continue;
                        }
                        if (var469 == 1603) {
                            field830[var5++] = var81.field2826;
                            continue;
                        }
                        if (var469 == 1604) {
                            field830[var5++] = var81.field2915;
                            continue;
                        }
                        if (var469 == 1605) {
                            field830[var5++] = var81.field2857;
                            continue;
                        }
                        if (var469 == 1606) {
                            field830[var5++] = var81.field2880;
                            continue;
                        }
                        if (var469 == 1607) {
                            field830[var5++] = var81.field2856;
                            continue;
                        }
                        if (var469 == 1608) {
                            field830[var5++] = var81.field2907;
                            continue;
                        }
                        if (var469 == 1609) {
                            field830[var5++] = var81.field2834;
                            continue;
                        }
                        if (var469 == 1610) {
                            field830[var5++] = var81.field2835;
                            continue;
                        }
                        if (var469 == 1611) {
                            field830[var5++] = var81.field2828;
                            continue;
                        }
                        if (var469 == 1612) {
                            field830[var5++] = var81.field2802;
                            continue;
                        }
                        if (var469 == 1613) {
                            field830[var5++] = var81.field2879.method527();
                            continue;
                        }
                    } else if (var469 < 1800) {
                        class177 var82 = var41 ? Statics.field3177 : Statics.field828;
                        if (var469 == 1700) {
                            field830[var5++] = var82.field2923;
                            continue;
                        }
                        if (var469 == 1701) {
                            if (var82.field2923 == -1) {
                                field830[var5++] = 0;
                            } else {
                                field830[var5++] = var82.field2924;
                            }
                            continue;
                        }
                        if (var469 == 1702) {
                            field830[var5++] = var82.field2804;
                            continue;
                        }
                    } else if (var469 < 1900) {
                        class177 var83 = var41 ? Statics.field3177 : Statics.field828;
                        if (var469 == 1800) {
                            field830[var5++] = class182.method2866(client.method93(var83));
                            continue;
                        }
                        if (var469 == 1801) {
                            var5--;
                            int var84 = field830[var5];
                            int var470 = var84 - 1;
                            if (var83.field2877 != null && var470 < var83.field2877.length && var83.field2877[var470] != null) {
                                field825[var6++] = var83.field2877[var470];
                                continue;
                            }
                            field825[var6++] = "";
                            continue;
                        }
                        if (var469 == 1802) {
                            if (var83.field2876 == null) {
                                field825[var6++] = "";
                            } else {
                                field825[var6++] = var83.field2876;
                            }
                            continue;
                        }
                    } else if (var469 >= 1900 && var469 < 2000 || var469 >= 2900 && var469 < 3000) {
                        class177 var85;
                        if (var469 >= 2000) {
                            var469 -= 1000;
                            var5--;
                            var85 = class177.method3198(field830[var5]);
                        } else {
                            var85 = var41 ? Statics.field3177 : Statics.field828;
                        }
                        if (var469 == 1927) {
                            if (field831 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var85.field2912 == null) {
                                return;
                            }
                            class1 var86 = new class1();
                            var86.field14 = var85;
                            var86.field9 = var85.field2912;
                            var86.field11 = field831 + 1;
                            client.field523.method3617(arg0);
                            continue;
                        }
                    } else if (var469 < 2600) {
                        var5--;
                        class177 var87 = class177.method3198(field830[var5]);
                        if (var469 == 2500) {
                            field830[var5++] = var87.field2816;
                            continue;
                        }
                        if (var469 == 2501) {
                            field830[var5++] = var87.field2817;
                            continue;
                        }
                        if (var469 == 2502) {
                            field830[var5++] = var87.field2906;
                            continue;
                        }
                        if (var469 == 2503) {
                            field830[var5++] = var87.field2819;
                            continue;
                        }
                        if (var469 == 2504) {
                            field830[var5++] = var87.field2823 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 2505) {
                            field830[var5++] = var87.field2822;
                            continue;
                        }
                    } else if (var469 < 2700) {
                        var5--;
                        class177 var88 = class177.method3198(field830[var5]);
                        if (var469 == 2600) {
                            field830[var5++] = var88.field2858;
                            continue;
                        }
                        if (var469 == 2601) {
                            field830[var5++] = var88.field2825;
                            continue;
                        }
                        if (var469 == 2602) {
                            field825[var6++] = var88.field2855;
                            continue;
                        }
                        if (var469 == 2603) {
                            field830[var5++] = var88.field2826;
                            continue;
                        }
                        if (var469 == 2604) {
                            field830[var5++] = var88.field2915;
                            continue;
                        }
                        if (var469 == 2605) {
                            field830[var5++] = var88.field2857;
                            continue;
                        }
                        if (var469 == 2606) {
                            field830[var5++] = var88.field2880;
                            continue;
                        }
                        if (var469 == 2607) {
                            field830[var5++] = var88.field2856;
                            continue;
                        }
                        if (var469 == 2608) {
                            field830[var5++] = var88.field2907;
                            continue;
                        }
                        if (var469 == 2609) {
                            field830[var5++] = var88.field2834;
                            continue;
                        }
                        if (var469 == 2610) {
                            field830[var5++] = var88.field2835;
                            continue;
                        }
                        if (var469 == 2611) {
                            field830[var5++] = var88.field2828;
                            continue;
                        }
                        if (var469 == 2612) {
                            field830[var5++] = var88.field2802;
                            continue;
                        }
                        if (var469 == 2613) {
                            field830[var5++] = var88.field2879.method527();
                            continue;
                        }
                    } else if (var469 < 2800) {
                        if (var469 == 2700) {
                            var5--;
                            class177 var89 = class177.method3198(field830[var5]);
                            field830[var5++] = var89.field2923;
                            continue;
                        }
                        if (var469 == 2701) {
                            var5--;
                            class177 var90 = class177.method3198(field830[var5]);
                            if (var90.field2923 == -1) {
                                field830[var5++] = 0;
                            } else {
                                field830[var5++] = var90.field2924;
                            }
                            continue;
                        }
                        if (var469 == 2702) {
                            var5--;
                            int var91 = field830[var5];
                            class4 var92 = (class4) client.field462.method3564((long) var91);
                            if (var92 == null) {
                                field830[var5++] = 0;
                            } else {
                                field830[var5++] = 1;
                            }
                            continue;
                        }
                        if (var469 == 2706) {
                            field830[var5++] = client.field374;
                            continue;
                        }
                    } else if (var469 < 2900) {
                        var5--;
                        class177 var93 = class177.method3198(field830[var5]);
                        if (var469 == 2800) {
                            field830[var5++] = class182.method2866(client.method93(var93));
                            continue;
                        }
                        if (var469 == 2801) {
                            var5--;
                            int var94 = field830[var5];
                            int var471 = var94 - 1;
                            if (var93.field2877 != null && var471 < var93.field2877.length && var93.field2877[var471] != null) {
                                field825[var6++] = var93.field2877[var471];
                                continue;
                            }
                            field825[var6++] = "";
                            continue;
                        }
                        if (var469 == 2802) {
                            if (var93.field2876 == null) {
                                field825[var6++] = "";
                            } else {
                                field825[var6++] = var93.field2876;
                            }
                            continue;
                        }
                    } else if (var469 < 3200) {
                        if (var469 == 3100) {
                            var6--;
                            String var95 = field825[var6];
                            class12.method2280(0, "", var95);
                            continue;
                        }
                        if (var469 == 3101) {
                            var5 -= 2;
                            client.method570(Statics.field2137, field830[var5], field830[var5 + 1]);
                            continue;
                        }
                        if (var469 == 3103) {
                            client.method183();
                            continue;
                        }
                        if (var469 == 3104) {
                            var6--;
                            String var96 = field825[var6];
                            int var97 = 0;
                            boolean var98 = false;
                            boolean var99 = false;
                            int var100 = 0;
                            int var101 = var96.length();
                            int var102 = 0;
                            boolean var104;
                            while (true) {
                                if (var102 >= var101) {
                                    var104 = var99;
                                    break;
                                }
                                label3342: {
                                    char var103 = var96.charAt(var102);
                                    if (var102 == 0) {
                                        if (var103 == '-') {
                                            var98 = true;
                                            break label3342;
                                        }
                                        if (var103 == '+') {
                                            break label3342;
                                        }
                                    }
                                    int var472;
                                    if (var103 >= '0' && var103 <= '9') {
                                        var472 = var103 - '0';
                                    } else if (var103 >= 'A' && var103 <= 'Z') {
                                        var472 = var103 - '7';
                                    } else {
                                        if (var103 < 'a' || var103 > 'z') {
                                            var104 = false;
                                            break;
                                        }
                                        var472 = var103 - 'W';
                                    }
                                    if (var472 >= 10) {
                                        var104 = false;
                                        break;
                                    }
                                    if (var98) {
                                        var472 = -var472;
                                    }
                                    int var105 = var100 * 10 + var472;
                                    if (var105 / 10 != var100) {
                                        var104 = false;
                                        break;
                                    }
                                    var100 = var105;
                                    var99 = true;
                                }
                                var102++;
                            }
                            if (var104) {
                                int var107 = class167.method2868(var96, 10, true);
                                var97 = var107;
                            }
                            client.field379.method2661(253);
                            client.field379.method2569(var97);
                            continue;
                        }
                        if (var469 == 3105) {
                            var6--;
                            String var108 = field825[var6];
                            client.field379.method2661(167);
                            client.field379.method2389(var108.length() + 1);
                            client.field379.method2395(var108);
                            continue;
                        }
                        if (var469 == 3106) {
                            var6--;
                            String var109 = field825[var6];
                            client.field379.method2661(55);
                            client.field379.method2389(var109.length() + 1);
                            client.field379.method2395(var109);
                            continue;
                        }
                        if (var469 == 3107) {
                            var5--;
                            int var110 = field830[var5];
                            var6--;
                            String var111 = field825[var6];
                            int var112 = class35.field780;
                            int[] var113 = class35.field787;
                            boolean var114 = false;
                            for (int var115 = 0; var115 < var112; var115++) {
                                class3 var116 = client.field420[var113[var115]];
                                if (var116 != null && Statics.field2137 != var116 && var116.field37 != null && var116.field37.equalsIgnoreCase(var111)) {
                                    if (var110 == 1) {
                                        client.field379.method2661(58);
                                        client.field379.method2561(var113[var115]);
                                        client.field379.method2526(0);
                                    } else if (var110 == 4) {
                                        client.field379.method2661(92);
                                        client.field379.method2560(var113[var115]);
                                        client.field379.method2429(0);
                                    } else if (var110 == 6) {
                                        client.field379.method2661(94);
                                        client.field379.method2532(var113[var115]);
                                        client.field379.method2429(0);
                                    } else if (var110 == 7) {
                                        client.field379.method2661(127);
                                        client.field379.method2389(0);
                                        client.field379.method2532(var113[var115]);
                                    }
                                    var114 = true;
                                    break;
                                }
                            }
                            if (!var114) {
                                class12.method2280(4, "", class161.field2502 + var111);
                            }
                            continue;
                        }
                        if (var469 == 3108) {
                            var5 -= 3;
                            int var117 = field830[var5];
                            int var118 = field830[var5 + 1];
                            int var119 = field830[var5 + 2];
                            class177 var120 = class177.method3198(var119);
                            client.method40(var120, var117, var118);
                            continue;
                        }
                        if (var469 == 3109) {
                            var5 -= 2;
                            int var121 = field830[var5];
                            int var122 = field830[var5 + 1];
                            class177 var123 = var41 ? Statics.field3177 : Statics.field828;
                            client.method40(var123, var121, var122);
                            continue;
                        }
                        if (var469 == 3110) {
                            var5--;
                            Statics.field82 = field830[var5] == 1;
                            continue;
                        }
                        if (var469 == 3111) {
                            field830[var5++] = Statics.field43.field155 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3112) {
                            var5--;
                            Statics.field43.field155 = field830[var5] == 1;
                            class9.method2679();
                            continue;
                        }
                        if (var469 == 3113) {
                            var6--;
                            String var124 = field825[var6];
                            var5--;
                            boolean var125 = field830[var5] == 1;
                            class142.method2324(var124, var125, false);
                            continue;
                        }
                        if (var469 == 3115) {
                            var5--;
                            int var126 = field830[var5];
                            client.field379.method2661(74);
                            client.field379.method2561(var126);
                            continue;
                        }
                        if (var469 == 3116) {
                            var5--;
                            int var127 = field830[var5];
                            var6 -= 2;
                            String var128 = field825[var6];
                            String var129 = field825[var6 + 1];
                            if (var128.length() <= 500 && var129.length() <= 500) {
                                client.field379.method2661(119);
                                client.field379.method2561(1 + class123.method538(var128) + class123.method538(var129));
                                client.field379.method2395(var129);
                                client.field379.method2389(var127);
                                client.field379.method2395(var128);
                            }
                            continue;
                        }
                    } else if (var469 < 3300) {
                        if (var469 == 3200) {
                            var5 -= 3;
                            int var130 = field830[var5];
                            int var131 = field830[var5 + 1];
                            int var132 = field830[var5 + 2];
                            if (client.field548 != 0 && var131 != 0 && client.field543 < 50) {
                                client.field544[client.field543] = var130;
                                client.field545[client.field543] = var131;
                                client.field546[client.field543] = var132;
                                client.field555[client.field543] = null;
                                client.field547[client.field543] = 0;
                                client.field543++;
                            }
                            continue;
                        }
                        if (var469 == 3201) {
                            var5--;
                            client.method2326(field830[var5]);
                            continue;
                        }
                        if (var469 == 3202) {
                            var5 -= 2;
                            client.method173(field830[var5], field830[var5 + 1]);
                            continue;
                        }
                    } else if (var469 < 3400) {
                        if (var469 == 3300) {
                            field830[var5++] = client.field333;
                            continue;
                        }
                        if (var469 == 3301) {
                            var5 -= 2;
                            int var133 = field830[var5];
                            int var134 = field830[var5 + 1];
                            int[] var135 = field830;
                            int var136 = var5++;
                            class16 var137 = (class16) class16.field240.method3564((long) var133);
                            int var138;
                            if (var137 == null) {
                                var138 = -1;
                            } else if (var134 >= 0 && var134 < var137.field232.length) {
                                var138 = var137.field232[var134];
                            } else {
                                var138 = -1;
                            }
                            var135[var136] = var138;
                            continue;
                        }
                        if (var469 == 3302) {
                            var5 -= 2;
                            int var139 = field830[var5];
                            int var140 = field830[var5 + 1];
                            int[] var141 = field830;
                            int var142 = var5++;
                            class16 var143 = (class16) class16.field240.method3564((long) var139);
                            int var144;
                            if (var143 == null) {
                                var144 = 0;
                            } else if (var140 >= 0 && var140 < var143.field233.length) {
                                var144 = var143.field233[var140];
                            } else {
                                var144 = 0;
                            }
                            var141[var142] = var144;
                            continue;
                        }
                        if (var469 == 3303) {
                            var5 -= 2;
                            int var145 = field830[var5];
                            int var146 = field830[var5 + 1];
                            field830[var5++] = class16.method647(var145, var146);
                            continue;
                        }
                        if (var469 == 3304) {
                            var5--;
                            int var147 = field830[var5];
                            field830[var5++] = class55.method1522(var147).field1157;
                            continue;
                        }
                        if (var469 == 3305) {
                            var5--;
                            int var148 = field830[var5];
                            field830[var5++] = client.field368[var148];
                            continue;
                        }
                        if (var469 == 3306) {
                            var5--;
                            int var149 = field830[var5];
                            field830[var5++] = client.field439[var149];
                            continue;
                        }
                        if (var469 == 3307) {
                            var5--;
                            int var150 = field830[var5];
                            field830[var5++] = client.field323[var150];
                            continue;
                        }
                        if (var469 == 3308) {
                            int var151 = Statics.field2760;
                            int var152 = (Statics.field2137.field879 >> 7) + Statics.field3127;
                            int var153 = (Statics.field2137.field837 >> 7) + Statics.field1671;
                            field830[var5++] = (var151 << 28) + (var152 << 14) + var153;
                            continue;
                        }
                        if (var469 == 3309) {
                            var5--;
                            int var154 = field830[var5];
                            field830[var5++] = var154 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var469 == 3310) {
                            var5--;
                            int var155 = field830[var5];
                            field830[var5++] = var155 >> 28;
                            continue;
                        }
                        if (var469 == 3311) {
                            var5--;
                            int var156 = field830[var5];
                            field830[var5++] = var156 & 0x3FFF;
                            continue;
                        }
                        if (var469 == 3312) {
                            field830[var5++] = client.field304 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3313) {
                            var5 -= 2;
                            int var157 = field830[var5] + 32768;
                            int var158 = field830[var5 + 1];
                            int[] var159 = field830;
                            int var160 = var5++;
                            class16 var161 = (class16) class16.field240.method3564((long) var157);
                            int var162;
                            if (var161 == null) {
                                var162 = -1;
                            } else if (var158 >= 0 && var158 < var161.field232.length) {
                                var162 = var161.field232[var158];
                            } else {
                                var162 = -1;
                            }
                            var159[var160] = var162;
                            continue;
                        }
                        if (var469 == 3314) {
                            var5 -= 2;
                            int var163 = field830[var5] + 32768;
                            int var164 = field830[var5 + 1];
                            int[] var165 = field830;
                            int var166 = var5++;
                            class16 var167 = (class16) class16.field240.method3564((long) var163);
                            int var168;
                            if (var167 == null) {
                                var168 = 0;
                            } else if (var164 >= 0 && var164 < var167.field233.length) {
                                var168 = var167.field233[var164];
                            } else {
                                var168 = 0;
                            }
                            var165[var166] = var168;
                            continue;
                        }
                        if (var469 == 3315) {
                            var5 -= 2;
                            int var169 = field830[var5] + 32768;
                            int var170 = field830[var5 + 1];
                            field830[var5++] = class16.method647(var169, var170);
                            continue;
                        }
                        if (var469 == 3316) {
                            if (client.field466 >= 2) {
                                field830[var5++] = client.field466;
                            } else {
                                field830[var5++] = 0;
                            }
                            continue;
                        }
                        if (var469 == 3317) {
                            field830[var5++] = client.field318;
                            continue;
                        }
                        if (var469 == 3318) {
                            field830[var5++] = client.field300;
                            continue;
                        }
                        if (var469 == 3321) {
                            field830[var5++] = client.field551;
                            continue;
                        }
                        if (var469 == 3322) {
                            field830[var5++] = client.field467;
                            continue;
                        }
                        if (var469 == 3323) {
                            if (client.field517) {
                                field830[var5++] = 1;
                            } else {
                                field830[var5++] = 0;
                            }
                            continue;
                        }
                        if (var469 == 3324) {
                            field830[var5++] = client.field308;
                            continue;
                        }
                    } else if (var469 < 3500) {
                        if (var469 == 3400) {
                            var5 -= 2;
                            int var171 = field830[var5];
                            int var172 = field830[var5 + 1];
                            class53 var173 = (class53) class53.field1130.method3541((long) var171);
                            class53 var174;
                            if (var173 == null) {
                                byte[] var175 = Statics.field1137.method3086(8, var171);
                                class53 var176 = new class53();
                                if (var175 != null) {
                                    var176.method1042(new class123(var175));
                                }
                                class53.field1130.method3532(var176, (long) var171);
                                var174 = var176;
                            } else {
                                var174 = var173;
                            }
                            class53 var177 = var174;
                            if (var174.field1133 != 's') {
                            }
                            for (int var178 = 0; var178 < var177.field1136; var178++) {
                                if (var177.field1132[var178] == var172) {
                                    field825[var6++] = var177.field1134[var178];
                                    var177 = null;
                                    break;
                                }
                            }
                            if (var177 != null) {
                                field825[var6++] = var177.field1131;
                            }
                            continue;
                        }
                        if (var469 == 3408) {
                            var5 -= 4;
                            int var179 = field830[var5];
                            int var180 = field830[var5 + 1];
                            int var181 = field830[var5 + 2];
                            int var182 = field830[var5 + 3];
                            class53 var183 = (class53) class53.field1130.method3541((long) var181);
                            class53 var184;
                            if (var183 == null) {
                                byte[] var185 = Statics.field1137.method3086(8, var181);
                                class53 var186 = new class53();
                                if (var185 != null) {
                                    var186.method1042(new class123(var185));
                                }
                                class53.field1130.method3532(var186, (long) var181);
                                var184 = var186;
                            } else {
                                var184 = var183;
                            }
                            class53 var187 = var184;
                            if (var184.field1135 == var179 && var184.field1133 == var180) {
                                for (int var188 = 0; var188 < var187.field1136; var188++) {
                                    if (var187.field1132[var188] == var182) {
                                        if (var180 == 115) {
                                            field825[var6++] = var187.field1134[var188];
                                        } else {
                                            field830[var5++] = var187.field1138[var188];
                                        }
                                        var187 = null;
                                        break;
                                    }
                                }
                                if (var187 != null) {
                                    if (var180 == 115) {
                                        field825[var6++] = var187.field1131;
                                    } else {
                                        field830[var5++] = var187.field1139;
                                    }
                                }
                                continue;
                            }
                            if (var180 == 115) {
                                field825[var6++] = "null";
                            } else {
                                field830[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var469 < 3700) {
                        if (var469 == 3600) {
                            if (client.field570 == 0) {
                                field830[var5++] = -2;
                            } else if (client.field570 == 1) {
                                field830[var5++] = -1;
                            } else {
                                field830[var5++] = client.field569;
                            }
                            continue;
                        }
                        if (var469 == 3601) {
                            var5--;
                            int var189 = field830[var5];
                            if (client.field570 == 2 && var189 < client.field569) {
                                field825[var6++] = client.field306[var189].field264;
                                field825[var6++] = client.field306[var189].field263;
                                continue;
                            }
                            field825[var6++] = "";
                            field825[var6++] = "";
                            continue;
                        }
                        if (var469 == 3602) {
                            var5--;
                            int var190 = field830[var5];
                            if (client.field570 == 2 && var190 < client.field569) {
                                field830[var5++] = client.field306[var190].field275;
                                continue;
                            }
                            field830[var5++] = 0;
                            continue;
                        }
                        if (var469 == 3603) {
                            var5--;
                            int var191 = field830[var5];
                            if (client.field570 == 2 && var191 < client.field569) {
                                field830[var5++] = client.field306[var191].field265;
                                continue;
                            }
                            field830[var5++] = 0;
                            continue;
                        }
                        if (var469 == 3604) {
                            var6--;
                            String var192 = field825[var6];
                            var5--;
                            int var193 = field830[var5];
                            client.method537(var192, var193);
                            continue;
                        }
                        if (var469 == 3605) {
                            var6--;
                            String var194 = field825[var6];
                            client.method1078(var194);
                            continue;
                        }
                        if (var469 == 3606) {
                            var6--;
                            String var195 = field825[var6];
                            client.method986(var195);
                            continue;
                        }
                        if (var469 == 3607) {
                            var6--;
                            String var196 = field825[var6];
                            if (var196 == null) {
                                continue;
                            }
                            if ((client.field573 < 100 || client.field354 == 1) && client.field573 < 400) {
                                String var197 = class168.method2023(var196, Statics.field303);
                                if (var197 == null) {
                                    continue;
                                }
                                for (int var198 = 0; var198 < client.field573; var198++) {
                                    class8 var199 = client.field528[var198];
                                    String var200 = class168.method2023(var199.field149, Statics.field303);
                                    if (var200 != null && var200.equals(var197)) {
                                        class12.method2280(31, "", var196 + class161.field2522);
                                        continue label3076;
                                    }
                                    if (var199.field143 != null) {
                                        String var201 = class168.method2023(var199.field143, Statics.field303);
                                        if (var201 != null && var201.equals(var197)) {
                                            class12.method2280(31, "", var196 + class161.field2522);
                                            continue label3076;
                                        }
                                    }
                                }
                                for (int var202 = 0; var202 < client.field569; var202++) {
                                    class18 var203 = client.field306[var202];
                                    String var204 = class168.method2023(var203.field264, Statics.field303);
                                    if (var204 != null && var204.equals(var197)) {
                                        class12.method2280(31, "", class161.field2527 + var196 + class161.field2528);
                                        continue label3076;
                                    }
                                    if (var203.field263 != null) {
                                        String var205 = class168.method2023(var203.field263, Statics.field303);
                                        if (var205 != null && var205.equals(var197)) {
                                            class12.method2280(31, "", class161.field2527 + var196 + class161.field2528);
                                            continue label3076;
                                        }
                                    }
                                }
                                if (class168.method2023(Statics.field2137.field37, Statics.field303).equals(var197)) {
                                    class12.method2280(31, "", class161.field2621);
                                } else {
                                    client.field379.method2661(136);
                                    client.field379.method2389(class123.method538(var196));
                                    client.field379.method2395(var196);
                                }
                                continue;
                            }
                            class12.method2280(31, "", class161.field2521);
                            continue;
                        }
                        if (var469 == 3608) {
                            var6--;
                            String var206 = field825[var6];
                            client.method55(var206);
                            continue;
                        }
                        if (var469 == 3609) {
                            var6--;
                            String var207 = field825[var6];
                            class156[] var208 = new class156[] { class156.field2315, class156.field2312, class156.field2313, class156.field2311, class156.field2310, class156.field2320 };
                            class156[] var209 = var208;
                            for (int var210 = 0; var210 < var209.length; var210++) {
                                class156 var211 = var209[var210];
                                if (var211.field2318 != -1 && var207.startsWith(class2.method2279(var211.field2318))) {
                                    var207 = var207.substring(6 + Integer.toString(var211.field2318).length());
                                    break;
                                }
                            }
                            field830[var5++] = client.method1(var207, false) ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3611) {
                            if (client.field542 == null) {
                                field825[var6++] = "";
                            } else {
                                field825[var6++] = class166.method2325(client.field542);
                            }
                            continue;
                        }
                        if (var469 == 3612) {
                            if (client.field542 == null) {
                                field830[var5++] = 0;
                            } else {
                                field830[var5++] = Statics.field897;
                            }
                            continue;
                        }
                        if (var469 == 3613) {
                            var5--;
                            int var212 = field830[var5];
                            if (client.field542 != null && var212 < Statics.field897) {
                                field825[var6++] = Statics.field2233[var212].field646;
                                continue;
                            }
                            field825[var6++] = "";
                            continue;
                        }
                        if (var469 == 3614) {
                            var5--;
                            int var213 = field830[var5];
                            if (client.field542 != null && var213 < Statics.field897) {
                                field830[var5++] = Statics.field2233[var213].field647;
                                continue;
                            }
                            field830[var5++] = 0;
                            continue;
                        }
                        if (var469 == 3615) {
                            var5--;
                            int var214 = field830[var5];
                            if (client.field542 != null && var214 < Statics.field897) {
                                field830[var5++] = Statics.field2233[var214].field648;
                                continue;
                            }
                            field830[var5++] = 0;
                            continue;
                        }
                        if (var469 == 3616) {
                            field830[var5++] = Statics.field225;
                            continue;
                        }
                        if (var469 == 3617) {
                            var6--;
                            String var215 = field825[var6];
                            if (Statics.field2233 != null) {
                                client.field379.method2661(205);
                                client.field379.method2389(class123.method538(var215));
                                client.field379.method2395(var215);
                            }
                            continue;
                        }
                        if (var469 == 3618) {
                            field830[var5++] = Statics.field714;
                            continue;
                        }
                        if (var469 == 3619) {
                            var6--;
                            String var216 = field825[var6];
                            if (!var216.equals("")) {
                                client.field379.method2661(246);
                                client.field379.method2389(class123.method538(var216));
                                client.field379.method2395(var216);
                            }
                            continue;
                        }
                        if (var469 == 3620) {
                            client.field379.method2661(246);
                            client.field379.method2389(0);
                            continue;
                        }
                        if (var469 == 3621) {
                            if (client.field570 == 0) {
                                field830[var5++] = -1;
                            } else {
                                field830[var5++] = client.field573;
                            }
                            continue;
                        }
                        if (var469 == 3622) {
                            var5--;
                            int var217 = field830[var5];
                            if (client.field570 != 0 && var217 < client.field573) {
                                field825[var6++] = client.field528[var217].field149;
                                field825[var6++] = client.field528[var217].field143;
                                continue;
                            }
                            field825[var6++] = "";
                            field825[var6++] = "";
                            continue;
                        }
                        if (var469 == 3623) {
                            String var218;
                            label2752: {
                                var6--;
                                var218 = field825[var6];
                                if (!var218.startsWith(class2.method2279(0))) {
                                    String var220 = "<img=1>";
                                    if (!var218.startsWith(var220)) {
                                        break label2752;
                                    }
                                }
                                var218 = var218.substring(7);
                            }
                            field830[var5++] = client.method2692(var218) ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3624) {
                            var5--;
                            int var221 = field830[var5];
                            if (Statics.field2233 != null && var221 < Statics.field897 && Statics.field2233[var221].field646.equalsIgnoreCase(Statics.field2137.field37)) {
                                field830[var5++] = 1;
                                continue;
                            }
                            field830[var5++] = 0;
                            continue;
                        }
                        if (var469 == 3625) {
                            if (client.field529 == null) {
                                field825[var6++] = "";
                                continue;
                            }
                            String[] var222 = field825;
                            int var223 = var6++;
                            String var224 = client.field529;
                            long var225 = 0L;
                            int var227 = var224.length();
                            for (int var228 = 0; var228 < var227; var228++) {
                                var225 *= 37L;
                                char var229 = var224.charAt(var228);
                                if (var229 >= 'A' && var229 <= 'Z') {
                                    var225 += (long) (var229 + 1 - 65);
                                } else if (var229 >= 'a' && var229 <= 'z') {
                                    var225 += (long) (var229 + 1 - 97);
                                } else if (var229 >= '0' && var229 <= '9') {
                                    var225 += (long) (var229 + 27 - 48);
                                }
                                if (var225 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var225 % 37L == 0L && var225 != 0L) {
                                var225 /= 37L;
                            }
                            String var232 = class166.method2114(var225);
                            if (var232 == null) {
                                var232 = "";
                            }
                            var222[var223] = var232;
                            continue;
                        }
                    } else if (var469 < 4000) {
                        if (var469 == 3903) {
                            var5--;
                            int var234 = field830[var5];
                            field830[var5++] = client.field578[var234].method3779();
                            continue;
                        }
                        if (var469 == 3904) {
                            var5--;
                            int var235 = field830[var5];
                            field830[var5++] = client.field578[var235].field3227;
                            continue;
                        }
                        if (var469 == 3905) {
                            var5--;
                            int var236 = field830[var5];
                            field830[var5++] = client.field578[var236].field3228;
                            continue;
                        }
                        if (var469 == 3906) {
                            var5--;
                            int var237 = field830[var5];
                            field830[var5++] = client.field578[var237].field3225;
                            continue;
                        }
                        if (var469 == 3907) {
                            var5--;
                            int var238 = field830[var5];
                            field830[var5++] = client.field578[var238].field3229;
                            continue;
                        }
                        if (var469 == 3908) {
                            var5--;
                            int var239 = field830[var5];
                            field830[var5++] = client.field578[var239].field3230;
                            continue;
                        }
                        if (var469 == 3910) {
                            var5--;
                            int var240 = field830[var5];
                            int var241 = client.field578[var240].method3778();
                            field830[var5++] = var241 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3911) {
                            var5--;
                            int var242 = field830[var5];
                            int var243 = client.field578[var242].method3778();
                            field830[var5++] = var243 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3912) {
                            var5--;
                            int var244 = field830[var5];
                            int var245 = client.field578[var244].method3778();
                            field830[var5++] = var245 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3913) {
                            var5--;
                            int var246 = field830[var5];
                            int var247 = client.field578[var246].method3778();
                            field830[var5++] = var247 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 3914) {
                            var5--;
                            boolean var248 = field830[var5] == 1;
                            if (Statics.field2123 != null) {
                                Statics.field2123.method3798(class225.field3234, var248);
                            }
                            continue;
                        }
                        if (var469 == 3915) {
                            var5--;
                            boolean var249 = field830[var5] == 1;
                            if (Statics.field2123 != null) {
                                Statics.field2123.method3798(class225.field3233, var249);
                            }
                            continue;
                        }
                        if (var469 == 3916) {
                            var5 -= 2;
                            boolean var250 = field830[var5] == 1;
                            boolean var251 = field830[var5 + 1] == 1;
                            if (Statics.field2123 != null) {
                                Statics.field2123.method3798(new class23(var251), var250);
                            }
                            continue;
                        }
                        if (var469 == 3917) {
                            var5--;
                            boolean var252 = field830[var5] == 1;
                            if (Statics.field2123 != null) {
                                Statics.field2123.method3798(class225.field3232, var252);
                            }
                            continue;
                        }
                        if (var469 == 3918) {
                            var5--;
                            boolean var253 = field830[var5] == 1;
                            if (Statics.field2123 != null) {
                                Statics.field2123.method3798(class225.field3236, var253);
                            }
                            continue;
                        }
                        if (var469 == 3919) {
                            field830[var5++] = Statics.field2123 == null ? 0 : Statics.field2123.field3231.size();
                            continue;
                        }
                        if (var469 == 3920) {
                            var5--;
                            int var254 = field830[var5];
                            class218 var255 = (class218) Statics.field2123.field3231.get(var254);
                            field830[var5++] = var255.field3205;
                            continue;
                        }
                        if (var469 == 3921) {
                            var5--;
                            int var256 = field830[var5];
                            class218 var257 = (class218) Statics.field2123.field3231.get(var256);
                            field825[var6++] = var257.method3730();
                            continue;
                        }
                        if (var469 == 3922) {
                            var5--;
                            int var258 = field830[var5];
                            class218 var259 = (class218) Statics.field2123.field3231.get(var258);
                            field825[var6++] = var259.method3731();
                            continue;
                        }
                        if (var469 == 3923) {
                            var5--;
                            int var260 = field830[var5];
                            class218 var261 = (class218) Statics.field2123.field3231.get(var260);
                            long var262 = class119.method719() - Statics.field832 - var261.field3208;
                            int var264 = (int) (var262 / 3600000L);
                            int var265 = (int) ((var262 - (long) (var264 * 3600000)) / 60000L);
                            int var266 = (int) ((var262 - (long) (var264 * 3600000) - (long) (var265 * 60000)) / 1000L);
                            String var267 = var264 + ":" + var265 / 10 + var265 % 10 + ":" + var266 / 10 + var266 % 10;
                            field825[var6++] = var267;
                            continue;
                        }
                        if (var469 == 3924) {
                            var5--;
                            int var268 = field830[var5];
                            class218 var269 = (class218) Statics.field2123.field3231.get(var268);
                            field830[var5++] = var269.field3206.field3225;
                            continue;
                        }
                        if (var469 == 3925) {
                            var5--;
                            int var270 = field830[var5];
                            class218 var271 = (class218) Statics.field2123.field3231.get(var270);
                            field830[var5++] = var271.field3206.field3228;
                            continue;
                        }
                        if (var469 == 3926) {
                            var5--;
                            int var272 = field830[var5];
                            class218 var273 = (class218) Statics.field2123.field3231.get(var272);
                            field830[var5++] = var273.field3206.field3227;
                            continue;
                        }
                    } else if (var469 < 4100) {
                        if (var469 == 4000) {
                            var5 -= 2;
                            int var274 = field830[var5];
                            int var275 = field830[var5 + 1];
                            field830[var5++] = var274 + var275;
                            continue;
                        }
                        if (var469 == 4001) {
                            var5 -= 2;
                            int var276 = field830[var5];
                            int var277 = field830[var5 + 1];
                            field830[var5++] = var276 - var277;
                            continue;
                        }
                        if (var469 == 4002) {
                            var5 -= 2;
                            int var278 = field830[var5];
                            int var279 = field830[var5 + 1];
                            field830[var5++] = var278 * var279;
                            continue;
                        }
                        if (var469 == 4003) {
                            var5 -= 2;
                            int var280 = field830[var5];
                            int var281 = field830[var5 + 1];
                            field830[var5++] = var280 / var281;
                            continue;
                        }
                        if (var469 == 4004) {
                            var5--;
                            int var282 = field830[var5];
                            field830[var5++] = (int) (Math.random() * (double) var282);
                            continue;
                        }
                        if (var469 == 4005) {
                            var5--;
                            int var283 = field830[var5];
                            field830[var5++] = (int) (Math.random() * (double) (var283 + 1));
                            continue;
                        }
                        if (var469 == 4006) {
                            var5 -= 5;
                            int var284 = field830[var5];
                            int var285 = field830[var5 + 1];
                            int var286 = field830[var5 + 2];
                            int var287 = field830[var5 + 3];
                            int var288 = field830[var5 + 4];
                            field830[var5++] = (var285 - var284) * (var288 - var286) / (var287 - var286) + var284;
                            continue;
                        }
                        if (var469 == 4007) {
                            var5 -= 2;
                            int var289 = field830[var5];
                            int var290 = field830[var5 + 1];
                            field830[var5++] = var289 * var290 / 100 + var289;
                            continue;
                        }
                        if (var469 == 4008) {
                            var5 -= 2;
                            int var291 = field830[var5];
                            int var292 = field830[var5 + 1];
                            field830[var5++] = var291 | 0x1 << var292;
                            continue;
                        }
                        if (var469 == 4009) {
                            var5 -= 2;
                            int var293 = field830[var5];
                            int var294 = field830[var5 + 1];
                            field830[var5++] = var293 & -1 - (0x1 << var294);
                            continue;
                        }
                        if (var469 == 4010) {
                            var5 -= 2;
                            int var295 = field830[var5];
                            int var296 = field830[var5 + 1];
                            field830[var5++] = (var295 & 0x1 << var296) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var469 == 4011) {
                            var5 -= 2;
                            int var297 = field830[var5];
                            int var298 = field830[var5 + 1];
                            field830[var5++] = var297 % var298;
                            continue;
                        }
                        if (var469 == 4012) {
                            var5 -= 2;
                            int var299 = field830[var5];
                            int var300 = field830[var5 + 1];
                            if (var299 == 0) {
                                field830[var5++] = 0;
                            } else {
                                field830[var5++] = (int) Math.pow((double) var299, (double) var300);
                            }
                            continue;
                        }
                        if (var469 == 4013) {
                            var5 -= 2;
                            int var301 = field830[var5];
                            int var302 = field830[var5 + 1];
                            if (var301 == 0) {
                                field830[var5++] = 0;
                            } else if (var302 == 0) {
                                field830[var5++] = Integer.MAX_VALUE;
                            } else {
                                field830[var5++] = (int) Math.pow((double) var301, 1.0D / (double) var302);
                            }
                            continue;
                        }
                        if (var469 == 4014) {
                            var5 -= 2;
                            int var303 = field830[var5];
                            int var304 = field830[var5 + 1];
                            field830[var5++] = var303 & var304;
                            continue;
                        }
                        if (var469 == 4015) {
                            var5 -= 2;
                            int var305 = field830[var5];
                            int var306 = field830[var5 + 1];
                            field830[var5++] = var305 | var306;
                            continue;
                        }
                        if (var469 == 4018) {
                            var5 -= 3;
                            long var307 = (long) field830[var5];
                            long var309 = (long) field830[var5 + 1];
                            long var311 = (long) field830[var5 + 2];
                            field830[var5++] = (int) (var307 * var311 / var309);
                            continue;
                        }
                    } else if (var469 < 4200) {
                        if (var469 == 4100) {
                            var6--;
                            String var313 = field825[var6];
                            var5--;
                            int var314 = field830[var5];
                            field825[var6++] = var313 + var314;
                            continue;
                        }
                        if (var469 == 4101) {
                            var6 -= 2;
                            String var315 = field825[var6];
                            String var316 = field825[var6 + 1];
                            field825[var6++] = var315 + var316;
                            continue;
                        }
                        if (var469 == 4102) {
                            var6--;
                            String var317 = field825[var6];
                            var5--;
                            int var318 = field830[var5];
                            String[] var319 = field825;
                            int var320 = var6++;
                            String var322;
                            if (var318 < 0) {
                                var322 = Integer.toString(var318);
                            } else {
                                var322 = class167.method176(var318, 10, true);
                            }
                            var319[var320] = var317 + var322;
                            continue;
                        }
                        if (var469 == 4103) {
                            var6--;
                            String var323 = field825[var6];
                            field825[var6++] = var323.toLowerCase();
                            continue;
                        }
                        if (var469 == 4104) {
                            var5--;
                            int var324 = field830[var5];
                            long var325 = ((long) var324 + 11745L) * 86400000L;
                            field829.setTime(new Date(var325));
                            int var327 = field829.get(5);
                            int var328 = field829.get(2);
                            int var329 = field829.get(1);
                            field825[var6++] = var327 + "-" + field826[var328] + "-" + var329;
                            continue;
                        }
                        if (var469 == 4105) {
                            var6 -= 2;
                            String var330 = field825[var6];
                            String var331 = field825[var6 + 1];
                            if (Statics.field2137.field33 != null && Statics.field2137.field33.field2974) {
                                field825[var6++] = var331;
                                continue;
                            }
                            field825[var6++] = var330;
                            continue;
                        }
                        if (var469 == 4106) {
                            var5--;
                            int var332 = field830[var5];
                            field825[var6++] = Integer.toString(var332);
                            continue;
                        }
                        if (var469 == 4107) {
                            var6 -= 2;
                            field830[var5++] = class167.method3241(class170.method937(field825[var6], field825[var6 + 1], client.field311));
                            continue;
                        }
                        if (var469 == 4108) {
                            var6--;
                            String var333 = field825[var6];
                            var5 -= 2;
                            int var334 = field830[var5];
                            int var335 = field830[var5 + 1];
                            byte[] var336 = Statics.field2706.method3086(var335, 0);
                            class228 var337 = new class228(var336);
                            field830[var5++] = var337.method3836(var333, var334);
                            continue;
                        }
                        if (var469 == 4109) {
                            var6--;
                            String var338 = field825[var6];
                            var5 -= 2;
                            int var339 = field830[var5];
                            int var340 = field830[var5 + 1];
                            byte[] var341 = Statics.field2706.method3086(var340, 0);
                            class228 var342 = new class228(var341);
                            field830[var5++] = var342.method3816(var338, var339);
                            continue;
                        }
                        if (var469 == 4110) {
                            var6 -= 2;
                            String var343 = field825[var6];
                            String var344 = field825[var6 + 1];
                            var5--;
                            if (field830[var5] == 1) {
                                field825[var6++] = var343;
                            } else {
                                field825[var6++] = var344;
                            }
                            continue;
                        }
                        if (var469 == 4111) {
                            var6--;
                            String var345 = field825[var6];
                            field825[var6++] = class227.method3818(var345);
                            continue;
                        }
                        if (var469 == 4112) {
                            var6--;
                            String var346 = field825[var6];
                            var5--;
                            int var347 = field830[var5];
                            field825[var6++] = var346 + (char) var347;
                            continue;
                        }
                        if (var469 == 4113) {
                            var5--;
                            int var348 = field830[var5];
                            int[] var349 = field830;
                            int var350 = var5++;
                            char var351 = (char) var348;
                            boolean var352;
                            if (var351 >= ' ' && var351 <= '~') {
                                var352 = true;
                            } else if (var351 >= 160 && var351 <= 255) {
                                var352 = true;
                            } else if (var351 == 8364 || var351 == 338 || var351 == 8212 || var351 == 339 || var351 == 376) {
                                var352 = true;
                            } else {
                                var352 = false;
                            }
                            var349[var350] = var352 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 4114) {
                            var5--;
                            int var353 = field830[var5];
                            int[] var354 = field830;
                            int var355 = var5++;
                            char var356 = (char) var353;
                            boolean var357 = var356 >= '0' && var356 <= '9' || var356 >= 'A' && var356 <= 'Z' || var356 >= 'a' && var356 <= 'z';
                            var354[var355] = var357 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 4115) {
                            var5--;
                            int var358 = field830[var5];
                            field830[var5++] = class167.method2190((char) var358) ? 1 : 0;
                            continue;
                        }
                        if (var469 == 4116) {
                            var5--;
                            int var359 = field830[var5];
                            field830[var5++] = class167.method2864((char) var359) ? 1 : 0;
                            continue;
                        }
                        if (var469 == 4117) {
                            var6--;
                            String var360 = field825[var6];
                            if (var360 == null) {
                                field830[var5++] = 0;
                            } else {
                                field830[var5++] = var360.length();
                            }
                            continue;
                        }
                        if (var469 == 4118) {
                            var6--;
                            String var361 = field825[var6];
                            var5 -= 2;
                            int var362 = field830[var5];
                            int var363 = field830[var5 + 1];
                            field825[var6++] = var361.substring(var362, var363);
                            continue;
                        }
                        if (var469 == 4119) {
                            var6--;
                            String var364 = field825[var6];
                            StringBuilder var365 = new StringBuilder(var364.length());
                            boolean var366 = false;
                            for (int var367 = 0; var367 < var364.length(); var367++) {
                                char var368 = var364.charAt(var367);
                                if (var368 == '<') {
                                    var366 = true;
                                } else if (var368 == '>') {
                                    var366 = false;
                                } else if (!var366) {
                                    var365.append(var368);
                                }
                            }
                            field825[var6++] = var365.toString();
                            continue;
                        }
                        if (var469 == 4120) {
                            var6--;
                            String var369 = field825[var6];
                            var5--;
                            int var370 = field830[var5];
                            field830[var5++] = var369.indexOf(var370);
                            continue;
                        }
                        if (var469 == 4121) {
                            var6 -= 2;
                            String var371 = field825[var6];
                            String var372 = field825[var6 + 1];
                            var5--;
                            int var373 = field830[var5];
                            field830[var5++] = var371.indexOf(var372, var373);
                            continue;
                        }
                    } else if (var469 < 4300) {
                        if (var469 == 4200) {
                            var5--;
                            int var374 = field830[var5];
                            field825[var6++] = class56.method2018(var374).field1216;
                            continue;
                        }
                        if (var469 == 4201) {
                            var5 -= 2;
                            int var375 = field830[var5];
                            int var376 = field830[var5 + 1];
                            class56 var377 = class56.method2018(var375);
                            if (var376 >= 1 && var376 <= 5 && var377.field1188[var376 - 1] != null) {
                                field825[var6++] = var377.field1188[var376 - 1];
                                continue;
                            }
                            field825[var6++] = "";
                            continue;
                        }
                        if (var469 == 4202) {
                            var5 -= 2;
                            int var378 = field830[var5];
                            int var379 = field830[var5 + 1];
                            class56 var380 = class56.method2018(var378);
                            if (var379 >= 1 && var379 <= 5 && var380.field1209[var379 - 1] != null) {
                                field825[var6++] = var380.field1209[var379 - 1];
                                continue;
                            }
                            field825[var6++] = "";
                            continue;
                        }
                        if (var469 == 4203) {
                            var5--;
                            int var381 = field830[var5];
                            field830[var5++] = class56.method2018(var381).field1187;
                            continue;
                        }
                        if (var469 == 4204) {
                            var5--;
                            int var382 = field830[var5];
                            field830[var5++] = class56.method2018(var382).field1184 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 4205) {
                            var5--;
                            int var383 = field830[var5];
                            class56 var384 = class56.method2018(var383);
                            if (var384.field1204 == -1 && var384.field1208 >= 0) {
                                field830[var5++] = var384.field1208;
                                continue;
                            }
                            field830[var5++] = var383;
                            continue;
                        }
                        if (var469 == 4206) {
                            var5--;
                            int var385 = field830[var5];
                            class56 var386 = class56.method2018(var385);
                            if (var386.field1204 >= 0 && var386.field1208 >= 0) {
                                field830[var5++] = var386.field1208;
                                continue;
                            }
                            field830[var5++] = var385;
                            continue;
                        }
                        if (var469 == 4207) {
                            var5--;
                            int var387 = field830[var5];
                            field830[var5++] = class56.method2018(var387).field1191 ? 1 : 0;
                            continue;
                        }
                        if (var469 == 4208) {
                            var5--;
                            int var388 = field830[var5];
                            class56 var389 = class56.method2018(var388);
                            if (var389.field1213 == -1 && var389.field1214 >= 0) {
                                field830[var5++] = var389.field1214;
                                continue;
                            }
                            field830[var5++] = var388;
                            continue;
                        }
                        if (var469 == 4209) {
                            var5--;
                            int var390 = field830[var5];
                            class56 var391 = class56.method2018(var390);
                            if (var391.field1213 >= 0 && var391.field1214 >= 0) {
                                field830[var5++] = var391.field1214;
                                continue;
                            }
                            field830[var5++] = var390;
                            continue;
                        }
                        if (var469 == 4210) {
                            var6--;
                            String var392 = field825[var6];
                            var5--;
                            int var393 = field830[var5];
                            boolean var395 = var393 == 1;
                            String var396 = var392.toLowerCase();
                            short[] var397 = new short[16];
                            int var398 = 0;
                            int var399 = 0;
                            while (true) {
                                if (var399 >= Statics.field1158) {
                                    Statics.field146 = var397;
                                    Statics.field2184 = 0;
                                    Statics.field1094 = var398;
                                    String[] var403 = new String[Statics.field1094];
                                    for (int var404 = 0; var404 < Statics.field1094; var404++) {
                                        var403[var404] = class56.method2018(var397[var404]).field1216;
                                    }
                                    class128.method2112(var403, Statics.field146);
                                    break;
                                }
                                class56 var400 = class56.method2018(var399);
                                if ((!var395 || var400.field1211) && var400.field1204 == -1 && var400.field1216.toLowerCase().indexOf(var396) != -1) {
                                    if (var398 >= 250) {
                                        Statics.field1094 = -1;
                                        Statics.field146 = null;
                                        break;
                                    }
                                    if (var398 >= var397.length) {
                                        short[] var401 = new short[var397.length * 2];
                                        for (int var402 = 0; var402 < var398; var402++) {
                                            var401[var402] = var397[var402];
                                        }
                                        var397 = var401;
                                    }
                                    var397[var398++] = (short) var399;
                                }
                                var399++;
                            }
                            field830[var5++] = Statics.field1094;
                            continue;
                        }
                        if (var469 == 4211) {
                            if (Statics.field146 != null && Statics.field2184 < Statics.field1094) {
                                field830[var5++] = Statics.field146[++Statics.field2184 - 1] & 0xFFFF;
                                continue;
                            }
                            field830[var5++] = -1;
                            continue;
                        }
                        if (var469 == 4212) {
                            Statics.field2184 = 0;
                            continue;
                        }
                    } else if (var469 < 5100) {
                        if (var469 == 5000) {
                            field830[var5++] = client.field519;
                            continue;
                        }
                        if (var469 == 5001) {
                            var5 -= 3;
                            client.field519 = field830[var5];
                            int var405 = field830[var5 + 1];
                            class134[] var406 = class134.method10();
                            int var407 = 0;
                            class134 var409;
                            while (true) {
                                if (var407 >= var406.length) {
                                    var409 = null;
                                    break;
                                }
                                class134 var408 = var406[var407];
                                if (var408.field2113 == var405) {
                                    var409 = var408;
                                    break;
                                }
                                var407++;
                            }
                            Statics.field2755 = var409;
                            if (Statics.field2755 == null) {
                                Statics.field2755 = class134.field2114;
                            }
                            client.field520 = field830[var5 + 2];
                            client.field379.method2661(162);
                            client.field379.method2389(client.field519);
                            client.field379.method2389(Statics.field2755.field2113);
                            client.field379.method2389(client.field520);
                            continue;
                        }
                        if (var469 == 5002) {
                            var6--;
                            String var410 = field825[var6];
                            var5 -= 2;
                            int var411 = field830[var5];
                            int var412 = field830[var5 + 1];
                            client.field379.method2661(121);
                            client.field379.method2389(class123.method538(var410) + 2);
                            client.field379.method2395(var410);
                            client.field379.method2389(var411 - 1);
                            client.field379.method2389(var412);
                            continue;
                        }
                        if (var469 == 5003) {
                            var5 -= 2;
                            int var413 = field830[var5];
                            int var414 = field830[var5 + 1];
                            class38 var415 = class12.method764(var413, var414);
                            if (var415 == null) {
                                field830[var5++] = -1;
                                field830[var5++] = 0;
                                field825[var6++] = "";
                                field825[var6++] = "";
                                field825[var6++] = "";
                            } else {
                                field830[var5++] = var415.field808;
                                field830[var5++] = var415.field810;
                                field825[var6++] = var415.field813 == null ? "" : var415.field813;
                                field825[var6++] = var415.field807 == null ? "" : var415.field807;
                                field825[var6++] = var415.field815 == null ? "" : var415.field815;
                            }
                            continue;
                        }
                        if (var469 == 5004) {
                            var5--;
                            int var416 = field830[var5];
                            class38 var417 = class12.method1079(var416);
                            if (var417 == null) {
                                field830[var5++] = -1;
                                field830[var5++] = 0;
                                field825[var6++] = "";
                                field825[var6++] = "";
                                field825[var6++] = "";
                            } else {
                                field830[var5++] = var417.field809;
                                field830[var5++] = var417.field810;
                                field825[var6++] = var417.field813 == null ? "" : var417.field813;
                                field825[var6++] = var417.field807 == null ? "" : var417.field807;
                                field825[var6++] = var417.field815 == null ? "" : var417.field815;
                            }
                            continue;
                        }
                        if (var469 == 5005) {
                            if (Statics.field2755 == null) {
                                field830[var5++] = -1;
                            } else {
                                field830[var5++] = Statics.field2755.field2113;
                            }
                            continue;
                        }
                        if (var469 == 5008) {
                            var6--;
                            String var418 = field825[var6];
                            var5--;
                            int var419 = field830[var5];
                            String var420 = var418.toLowerCase();
                            byte var421 = 0;
                            if (var420.startsWith(class161.field2529)) {
                                var421 = 0;
                                var418 = var418.substring(class161.field2529.length());
                            } else if (var420.startsWith(class161.field2540)) {
                                var421 = 1;
                                var418 = var418.substring(class161.field2540.length());
                            } else if (var420.startsWith(class161.field2533)) {
                                var421 = 2;
                                var418 = var418.substring(class161.field2533.length());
                            } else if (var420.startsWith(class161.field2484)) {
                                var421 = 3;
                                var418 = var418.substring(class161.field2484.length());
                            } else if (var420.startsWith(class161.field2431)) {
                                var421 = 4;
                                var418 = var418.substring(class161.field2431.length());
                            } else if (var420.startsWith(class161.field2539)) {
                                var421 = 5;
                                var418 = var418.substring(class161.field2539.length());
                            } else if (var420.startsWith(class161.field2541)) {
                                var421 = 6;
                                var418 = var418.substring(class161.field2541.length());
                            } else if (var420.startsWith(class161.field2607)) {
                                var421 = 7;
                                var418 = var418.substring(class161.field2607.length());
                            } else if (var420.startsWith(class161.field2395)) {
                                var421 = 8;
                                var418 = var418.substring(class161.field2395.length());
                            } else if (var420.startsWith(class161.field2506)) {
                                var421 = 9;
                                var418 = var418.substring(class161.field2506.length());
                            } else if (var420.startsWith(class161.field2568)) {
                                var421 = 10;
                                var418 = var418.substring(class161.field2568.length());
                            } else if (var420.startsWith(class161.field2551)) {
                                var421 = 11;
                                var418 = var418.substring(class161.field2551.length());
                            } else if (client.field311 != 0) {
                                if (var420.startsWith(class161.field2530)) {
                                    var421 = 0;
                                    var418 = var418.substring(class161.field2530.length());
                                } else if (var420.startsWith(class161.field2532)) {
                                    var421 = 1;
                                    var418 = var418.substring(class161.field2532.length());
                                } else if (var420.startsWith(class161.field2534)) {
                                    var421 = 2;
                                    var418 = var418.substring(class161.field2534.length());
                                } else if (var420.startsWith(class161.field2460)) {
                                    var421 = 3;
                                    var418 = var418.substring(class161.field2460.length());
                                } else if (var420.startsWith(class161.field2538)) {
                                    var421 = 4;
                                    var418 = var418.substring(class161.field2538.length());
                                } else if (var420.startsWith(class161.field2355)) {
                                    var421 = 5;
                                    var418 = var418.substring(class161.field2355.length());
                                } else if (var420.startsWith(class161.field2452)) {
                                    var421 = 6;
                                    var418 = var418.substring(class161.field2452.length());
                                } else if (var420.startsWith(class161.field2544)) {
                                    var421 = 7;
                                    var418 = var418.substring(class161.field2544.length());
                                } else if (var420.startsWith(class161.field2546)) {
                                    var421 = 8;
                                    var418 = var418.substring(class161.field2546.length());
                                } else if (var420.startsWith(class161.field2569)) {
                                    var421 = 9;
                                    var418 = var418.substring(class161.field2569.length());
                                } else if (var420.startsWith(class161.field2624)) {
                                    var421 = 10;
                                    var418 = var418.substring(class161.field2624.length());
                                } else if (var420.startsWith(class161.field2552)) {
                                    var421 = 11;
                                    var418 = var418.substring(class161.field2552.length());
                                }
                            }
                            String var422 = var418.toLowerCase();
                            byte var423 = 0;
                            if (var422.startsWith(class161.field2553)) {
                                var423 = 1;
                                var418 = var418.substring(class161.field2553.length());
                            } else if (var422.startsWith(class161.field2407)) {
                                var423 = 2;
                                var418 = var418.substring(class161.field2407.length());
                            } else if (var422.startsWith(class161.field2557)) {
                                var423 = 3;
                                var418 = var418.substring(class161.field2557.length());
                            } else if (var422.startsWith(class161.field2458)) {
                                var423 = 4;
                                var418 = var418.substring(class161.field2458.length());
                            } else if (var422.startsWith(class161.field2561)) {
                                var423 = 5;
                                var418 = var418.substring(class161.field2561.length());
                            } else if (client.field311 != 0) {
                                if (var422.startsWith(class161.field2454)) {
                                    var423 = 1;
                                    var418 = var418.substring(class161.field2454.length());
                                } else if (var422.startsWith(class161.field2556)) {
                                    var423 = 2;
                                    var418 = var418.substring(class161.field2556.length());
                                } else if (var422.startsWith(class161.field2558)) {
                                    var423 = 3;
                                    var418 = var418.substring(class161.field2558.length());
                                } else if (var422.startsWith(class161.field2633)) {
                                    var423 = 4;
                                    var418 = var418.substring(class161.field2633.length());
                                } else if (var422.startsWith(class161.field2562)) {
                                    var423 = 5;
                                    var418 = var418.substring(class161.field2562.length());
                                }
                            }
                            client.field379.method2661(133);
                            client.field379.method2389(0);
                            int var424 = client.field379.field2046;
                            client.field379.method2389(var419);
                            client.field379.method2389(var421);
                            client.field379.method2389(var423);
                            class226.method657(client.field379, var418);
                            client.field379.method2423(client.field379.field2046 - var424);
                            continue;
                        }
                        if (var469 == 5009) {
                            var6 -= 2;
                            String var425 = field825[var6];
                            String var426 = field825[var6 + 1];
                            client.field379.method2661(120);
                            client.field379.method2561(0);
                            int var427 = client.field379.field2046;
                            client.field379.method2395(var425);
                            class226.method657(client.field379, var426);
                            client.field379.method2496(client.field379.field2046 - var427);
                            continue;
                        }
                        if (var469 == 5015) {
                            String var428;
                            if (Statics.field2137 == null || Statics.field2137.field37 == null) {
                                var428 = "";
                            } else {
                                var428 = Statics.field2137.field37;
                            }
                            field825[var6++] = var428;
                            continue;
                        }
                        if (var469 == 5016) {
                            field830[var5++] = client.field520;
                            continue;
                        }
                        if (var469 == 5017) {
                            var5--;
                            int var429 = field830[var5];
                            int[] var430 = field830;
                            int var431 = var5++;
                            class30 var432 = (class30) class12.field184.get(var429);
                            int var433;
                            if (var432 == null) {
                                var433 = 0;
                            } else {
                                var433 = var432.method628();
                            }
                            var430[var431] = var433;
                            continue;
                        }
                        if (var469 == 5018) {
                            var5--;
                            int var434 = field830[var5];
                            int[] var435 = field830;
                            int var436 = var5++;
                            class38 var437 = (class38) class12.field193.method3579((long) var434);
                            int var438;
                            if (var437 == null) {
                                var438 = -1;
                            } else if (class12.field183.field3159 == var437.field3164) {
                                var438 = -1;
                            } else {
                                var438 = ((class38) var437.field3164).field808;
                            }
                            var435[var436] = var438;
                            continue;
                        }
                        if (var469 == 5019) {
                            var5--;
                            int var439 = field830[var5];
                            int[] var440 = field830;
                            int var441 = var5++;
                            class38 var442 = (class38) class12.field193.method3579((long) var439);
                            int var443;
                            if (var442 == null) {
                                var443 = -1;
                            } else if (class12.field183.field3159 == var442.field3165) {
                                var443 = -1;
                            } else {
                                var443 = ((class38) var442.field3165).field808;
                            }
                            var440[var441] = var443;
                            continue;
                        }
                        if (var469 == 5020) {
                            var6--;
                            String var444 = field825[var6];
                            client.method634(var444);
                            continue;
                        }
                        if (var469 == 5021) {
                            var6--;
                            client.field506 = field825[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var469 == 5022) {
                            field825[var6++] = client.field506;
                            continue;
                        }
                    }
                }
                if (var469 < 5400) {
                    if (var469 == 5306) {
                        int[] var445 = field830;
                        int var446 = var5++;
                        int var447 = client.field329 ? 2 : 1;
                        var445[var446] = var447;
                        continue;
                    }
                    if (var469 == 5307) {
                        var5--;
                        int var448 = field830[var5];
                        if (var448 != 1 && var448 != 2) {
                            continue;
                        }
                        client.field423 = 0L;
                        if (var448 >= 2) {
                            client.field329 = true;
                        } else {
                            client.field329 = false;
                        }
                        client.method2863();
                        if (client.field386 >= 25) {
                            client.method1523();
                        }
                        class148.field2254 = true;
                        continue;
                    }
                    if (var469 == 5308) {
                        field830[var5++] = Statics.field43.field162;
                        continue;
                    }
                    if (var469 == 5309) {
                        var5--;
                        int var449 = field830[var5];
                        if (var449 == 1 || var449 == 2) {
                            Statics.field43.field162 = var449;
                            class9.method2679();
                        }
                        continue;
                    }
                }
                if (var469 < 5600) {
                    if (var469 == 5504) {
                        var5 -= 2;
                        int var450 = field830[var5];
                        int var451 = field830[var5 + 1];
                        if (!client.field549) {
                            client.field387 = var450;
                            client.field388 = var451;
                        }
                        continue;
                    }
                    if (var469 == 5505) {
                        field830[var5++] = client.field387;
                        continue;
                    }
                    if (var469 == 5506) {
                        field830[var5++] = client.field388;
                        continue;
                    }
                    if (var469 == 5530) {
                        var5--;
                        int var452 = field830[var5];
                        if (var452 < 0) {
                            var452 = 0;
                        }
                        client.field580 = var452;
                        continue;
                    }
                    if (var469 == 5531) {
                        field830[var5++] = client.field580;
                        continue;
                    }
                }
                if (var469 >= 5700 || var469 != 5630) {
                    if (var469 < 6300) {
                        if (var469 == 6200) {
                            var5 -= 2;
                            client.field319 = (short) field830[var5];
                            if (client.field319 <= 0) {
                                client.field319 = 256;
                            }
                            client.field298 = (short) field830[var5 + 1];
                            if (client.field298 <= 0) {
                                client.field298 = 205;
                            }
                            continue;
                        }
                        if (var469 == 6201) {
                            var5 -= 2;
                            client.field558 = (short) field830[var5];
                            if (client.field558 <= 0) {
                                client.field558 = 256;
                            }
                            client.field559 = (short) field830[var5 + 1];
                            if (client.field559 <= 0) {
                                client.field559 = 320;
                            }
                            continue;
                        }
                        if (var469 == 6202) {
                            var5 -= 4;
                            client.field560 = (short) field830[var5];
                            if (client.field560 <= 0) {
                                client.field560 = 1;
                            }
                            client.field395 = (short) field830[var5 + 1];
                            if (client.field395 <= 0) {
                                client.field395 = 32767;
                            } else if (client.field395 < client.field560) {
                                client.field395 = client.field560;
                            }
                            client.field562 = (short) field830[var5 + 2];
                            if (client.field562 <= 0) {
                                client.field562 = 1;
                            }
                            client.field561 = (short) field830[var5 + 3];
                            if (client.field561 <= 0) {
                                client.field561 = 32767;
                            } else if (client.field561 < client.field562) {
                                client.field561 = client.field562;
                            }
                            continue;
                        }
                        if (var469 == 6203) {
                            if (client.field536 == null) {
                                field830[var5++] = -1;
                                field830[var5++] = -1;
                            } else {
                                Statics.method2985(0, 0, client.field536.field2906, client.field536.field2819, false);
                                field830[var5++] = client.field538;
                                field830[var5++] = client.field525;
                            }
                            continue;
                        }
                        if (var469 == 6204) {
                            field830[var5++] = client.field558;
                            field830[var5++] = client.field559;
                            continue;
                        }
                        if (var469 == 6205) {
                            field830[var5++] = client.field319;
                            field830[var5++] = client.field298;
                            continue;
                        }
                    }
                    if (var469 < 6600) {
                        if (var469 == 6500) {
                            field830[var5++] = class28.method2188() ? 1 : 0;
                            continue;
                        }
                        if (var469 == 6501) {
                            class28.field666 = 0;
                            class28 var453 = class28.method742();
                            if (var453 == null) {
                                field830[var5++] = -1;
                                field830[var5++] = 0;
                                field825[var6++] = "";
                                field830[var5++] = 0;
                                field830[var5++] = 0;
                                field825[var6++] = "";
                            } else {
                                field830[var5++] = var453.field675;
                                field830[var5++] = var453.field671;
                                field825[var6++] = var453.field670;
                                field830[var5++] = var453.field680;
                                field830[var5++] = var453.field677;
                                field825[var6++] = var453.field678;
                            }
                            continue;
                        }
                        if (var469 == 6502) {
                            class28 var455 = class28.method742();
                            if (var455 == null) {
                                field830[var5++] = -1;
                                field830[var5++] = 0;
                                field825[var6++] = "";
                                field830[var5++] = 0;
                                field830[var5++] = 0;
                                field825[var6++] = "";
                            } else {
                                field830[var5++] = var455.field675;
                                field830[var5++] = var455.field671;
                                field825[var6++] = var455.field670;
                                field830[var5++] = var455.field680;
                                field830[var5++] = var455.field677;
                                field825[var6++] = var455.field678;
                            }
                            continue;
                        }
                        if (var469 == 6506) {
                            var5--;
                            int var456 = field830[var5];
                            class28 var457 = null;
                            for (int var458 = 0; var458 < class28.field686; var458++) {
                                if (Statics.field1687[var458].field675 == var456) {
                                    var457 = Statics.field1687[var458];
                                    break;
                                }
                            }
                            if (var457 == null) {
                                field830[var5++] = -1;
                                field830[var5++] = 0;
                                field825[var6++] = "";
                                field830[var5++] = 0;
                                field830[var5++] = 0;
                                field825[var6++] = "";
                            } else {
                                field830[var5++] = var457.field675;
                                field830[var5++] = var457.field671;
                                field825[var6++] = var457.field670;
                                field830[var5++] = var457.field680;
                                field830[var5++] = var457.field677;
                                field825[var6++] = var457.field678;
                            }
                            continue;
                        }
                        if (var469 == 6507) {
                            var5 -= 4;
                            int var459 = field830[var5];
                            boolean var460 = field830[var5 + 1] == 1;
                            int var461 = field830[var5 + 2];
                            boolean var462 = field830[var5 + 3] == 1;
                            class28.method175(var459, var460, var461, var462);
                            continue;
                        }
                        if (var469 == 6511) {
                            var5--;
                            int var463 = field830[var5];
                            if (var463 >= 0 && var463 < class28.field686) {
                                class28 var464 = Statics.field1687[var463];
                                field830[var5++] = var464.field675;
                                field830[var5++] = var464.field671;
                                field825[var6++] = var464.field670;
                                field830[var5++] = var464.field680;
                                field830[var5++] = var464.field677;
                                field825[var6++] = var464.field678;
                                continue;
                            }
                            field830[var5++] = -1;
                            field830[var5++] = 0;
                            field825[var6++] = "";
                            field830[var5++] = 0;
                            field830[var5++] = 0;
                            field825[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field356 = 250;
            }
        } catch (Exception var468) {
            StringBuilder var466 = new StringBuilder(30);
            var466.append("").append(var4.field3176).append(" ");
            for (int var467 = field833 - 1; var467 >= 0; var467--) {
                var466.append("").append(field819[var467].field223.field3176).append(" ");
            }
            var466.append("").append(var10);
            class152.method2021(var466.toString(), var468);
        }
    }

    @ObfuscatedName("y.e(II)V")
    public static void method129(int arg0) {
        if (arg0 == -1 || !class177.method163(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2824[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3.field2884 != null) {
                class1 var4 = new class1();
                var4.field14 = var3;
                var4.field9 = var3.field2884;
                method625(var4, 2000000);
            }
        }
    }
}
