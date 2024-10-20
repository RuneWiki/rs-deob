package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ac")
public class class33 {

    @ObfuscatedName("ac.w")
    public static int[] field715 = new int[5];

    @ObfuscatedName("ac.r")
    public static int[][] field719 = new int[5][5000];

    @ObfuscatedName("ac.c")
    public static int[] field720 = new int[1000];

    @ObfuscatedName("ac.p")
    public static String[] field723 = new String[1000];

    @ObfuscatedName("ac.g")
    public static int field722 = 0;

    @ObfuscatedName("ac.z")
    public static class11[] field726 = new class11[50];

    @ObfuscatedName("ac.y")
    public static Calendar field725 = Calendar.getInstance();

    @ObfuscatedName("ac.e")
    public static final String[] field728 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ac.x")
    public static int field721 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fq.n(Li;II)V")
    public static void method3007(class19 arg0, int arg1) {
        Object[] var2 = arg0.field197;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method3076(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field940;
        int[] var9 = var4.field935;
        byte var10 = -1;
        field722 = 0;
        try {
            Statics.field717 = new int[var4.field933];
            int var11 = 0;
            Statics.field1189 = new String[var4.field941];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field185;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field186;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field193 == null ? -1 : arg0.field193.field2070;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field187;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field193 == null ? -1 : arg0.field193.field2124;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field188 == null ? -1 : arg0.field188.field2070;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field188 == null ? -1 : arg0.field188.field2124;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field189;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field190;
                    }
                    Statics.field717[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field200;
                    }
                    Statics.field1189[var12++] = var15;
                }
            }
            int var16 = 0;
            field721 = arg0.field182;
            label3173: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var494 = var8[var7];
                if (var494 < 100) {
                    if (var494 == 0) {
                        field720[var5++] = var9[var7];
                        continue;
                    }
                    if (var494 == 1) {
                        int var17 = var9[var7];
                        field720[var5++] = class147.field2032[var17];
                        continue;
                    }
                    if (var494 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class147.field2032[var18] = field720[var5];
                        client.method784(var18);
                        continue;
                    }
                    if (var494 == 3) {
                        field723[var6++] = var4.field936[var7];
                        continue;
                    }
                    if (var494 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var494 == 7) {
                        var5 -= 2;
                        if (field720[var5 + 1] != field720[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var494 == 8) {
                        var5 -= 2;
                        if (field720[var5 + 1] == field720[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var494 == 9) {
                        var5 -= 2;
                        if (field720[var5] < field720[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var494 == 10) {
                        var5 -= 2;
                        if (field720[var5] > field720[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var494 == 21) {
                        if (field722 == 0) {
                            return;
                        }
                        class11 var19 = field726[--field722];
                        var4 = var19.field95;
                        var8 = var4.field940;
                        var9 = var4.field935;
                        var7 = var19.field93;
                        Statics.field717 = var19.field94;
                        Statics.field1189 = var19.field99;
                        continue;
                    }
                    if (var494 == 25) {
                        int var20 = var9[var7];
                        field720[var5++] = class147.method748(var20);
                        continue;
                    }
                    if (var494 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        Statics.method1646(var21, field720[var5]);
                        continue;
                    }
                    if (var494 == 31) {
                        var5 -= 2;
                        if (field720[var5] <= field720[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var494 == 32) {
                        var5 -= 2;
                        if (field720[var5] >= field720[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var494 == 33) {
                        field720[var5++] = Statics.field717[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var494 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field717[var10001] = field720[var5];
                        continue;
                    }
                    if (var494 == 35) {
                        field723[var6++] = Statics.field1189[var9[var7]];
                        continue;
                    }
                    if (var494 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1189[var10001] = field723[var6];
                        continue;
                    }
                    if (var494 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class208.method23(field723, var6, var22);
                        field723[var6++] = var23;
                        continue;
                    }
                    if (var494 == 38) {
                        var5--;
                        continue;
                    }
                    if (var494 == 39) {
                        var6--;
                        continue;
                    }
                    if (var494 == 40) {
                        int var24 = var9[var7];
                        class49 var25 = class49.method3076(var24);
                        int[] var26 = new int[var25.field933];
                        String[] var27 = new String[var25.field941];
                        for (int var28 = 0; var28 < var25.field939; var28++) {
                            var26[var28] = field720[var5 - var25.field939 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field938; var29++) {
                            var27[var29] = field723[var6 - var25.field938 + var29];
                        }
                        var5 -= var25.field939;
                        var6 -= var25.field938;
                        class11 var30 = new class11();
                        var30.field95 = var4;
                        var30.field93 = var7;
                        var30.field94 = Statics.field717;
                        var30.field99 = Statics.field1189;
                        field726[++field722 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field940;
                        var9 = var25.field935;
                        var7 = -1;
                        Statics.field717 = var26;
                        Statics.field1189 = var27;
                        continue;
                    }
                    if (var494 == 42) {
                        field720[var5++] = Statics.field30.method835(var9[var7]);
                        continue;
                    }
                    if (var494 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field30.method819(var10001, field720[var5]);
                        continue;
                    }
                    if (var494 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field720[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field715[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label3173;
                                }
                                field719[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var494 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field720[var5];
                        if (var37 >= 0 && var37 < field715[var36]) {
                            field720[var5++] = field719[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var494 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field720[var5];
                        if (var39 >= 0 && var39 < field715[var38]) {
                            field719[var38][var39] = field720[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var494 == 47) {
                        String var40 = Statics.field30.method825(var9[var7]);
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field723[var6++] = var40;
                        continue;
                    }
                    if (var494 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field30.method843(var10001, field723[var6]);
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var494 < 1000) {
                    if (var494 == 100) {
                        var5 -= 3;
                        int var42 = field720[var5];
                        int var43 = field720[var5 + 1];
                        int var44 = field720[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class151 var45 = class151.method80(var42);
                        if (var45.field2194 == null) {
                            var45.field2194 = new class151[var44 + 1];
                        }
                        if (var45.field2194.length <= var44) {
                            class151[] var46 = new class151[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2194.length; var47++) {
                                var46[var47] = var45.field2194[var47];
                            }
                            var45.field2194 = var46;
                        }
                        if (var44 > 0 && var45.field2194[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class151 var48 = new class151();
                        var48.field2163 = var43;
                        var48.field2089 = var48.field2070 = var45.field2070;
                        var48.field2124 = var44;
                        var48.field2069 = true;
                        var45.field2194[var44] = var48;
                        if (var41) {
                            Statics.field930 = var48;
                        } else {
                            Statics.field724 = var48;
                        }
                        client.method1487(var45);
                        continue;
                    }
                    if (var494 == 101) {
                        class151 var49 = var41 ? Statics.field930 : Statics.field724;
                        class151 var50 = class151.method80(var49.field2070);
                        var50.field2194[var49.field2124] = null;
                        client.method1487(var50);
                        continue;
                    }
                    if (var494 == 102) {
                        var5--;
                        class151 var51 = class151.method80(field720[var5]);
                        var51.field2194 = null;
                        client.method1487(var51);
                        continue;
                    }
                    if (var494 == 200) {
                        var5 -= 2;
                        int var52 = field720[var5];
                        int var53 = field720[var5 + 1];
                        class151 var54 = class151.method70(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field720[var5++] = 1;
                            if (var41) {
                                Statics.field930 = var54;
                            } else {
                                Statics.field724 = var54;
                            }
                            continue;
                        }
                        field720[var5++] = 0;
                        continue;
                    }
                    if (var494 == 201) {
                        var5--;
                        class151 var55 = class151.method80(field720[var5]);
                        if (var55 == null) {
                            field720[var5++] = 0;
                        } else {
                            field720[var5++] = 1;
                            if (var41) {
                                Statics.field930 = var55;
                            } else {
                                Statics.field724 = var55;
                            }
                        }
                        continue;
                    }
                } else if (!(var494 < 1000 || var494 >= 1100) || !(var494 < 2000 || var494 >= 2100)) {
                    int var56 = -1;
                    class151 var57;
                    if (var494 >= 2000) {
                        var494 -= 1000;
                        var5--;
                        var56 = field720[var5];
                        var57 = class151.method80(var56);
                    } else {
                        var57 = var41 ? Statics.field930 : Statics.field724;
                    }
                    if (var494 == 1000) {
                        var5 -= 4;
                        var57.field2079 = field720[var5];
                        var57.field2088 = field720[var5 + 1];
                        var57.field2075 = field720[var5 + 2];
                        var57.field2076 = field720[var5 + 3];
                        client.method1487(var57);
                        client.method33(var57);
                        if (var56 != -1 && var57.field2163 == 0) {
                            client.method3089(Statics.field2173[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var494 == 1001) {
                        var5 -= 4;
                        var57.field2145 = field720[var5];
                        var57.field2082 = field720[var5 + 1];
                        var57.field2077 = field720[var5 + 2];
                        var57.field2078 = field720[var5 + 3];
                        client.method1487(var57);
                        client.method33(var57);
                        if (var56 != -1 && var57.field2163 == 0) {
                            client.method3089(Statics.field2173[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var494 == 1003) {
                        var5--;
                        boolean var58 = field720[var5] == 1;
                        if (var57.field2085 != var58) {
                            var57.field2085 = var58;
                            client.method1487(var57);
                        }
                        continue;
                    }
                    if (var494 == 1005) {
                        var5--;
                        var57.field2203 = field720[var5] == 1;
                        continue;
                    }
                    if (var494 == 1006) {
                        var5--;
                        var57.field2204 = field720[var5] == 1;
                        continue;
                    }
                } else if (!(var494 < 1100 || var494 >= 1200) || !(var494 < 2100 || var494 >= 2200)) {
                    int var59 = -1;
                    class151 var60;
                    if (var494 >= 2000) {
                        var494 -= 1000;
                        var5--;
                        var59 = field720[var5];
                        var60 = class151.method80(var59);
                    } else {
                        var60 = var41 ? Statics.field930 : Statics.field724;
                    }
                    if (var494 == 1100) {
                        var5 -= 2;
                        var60.field2166 = field720[var5];
                        if (var60.field2166 > var60.field2093 - var60.field2110) {
                            var60.field2166 = var60.field2093 - var60.field2110;
                        }
                        if (var60.field2166 < 0) {
                            var60.field2166 = 0;
                        }
                        var60.field2092 = field720[var5 + 1];
                        if (var60.field2092 > var60.field2094 - var60.field2086) {
                            var60.field2092 = var60.field2094 - var60.field2086;
                        }
                        if (var60.field2092 < 0) {
                            var60.field2092 = 0;
                        }
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1101) {
                        var5--;
                        var60.field2095 = field720[var5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1102) {
                        var5--;
                        var60.field2099 = field720[var5] == 1;
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1103) {
                        var5--;
                        var60.field2127 = field720[var5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1104) {
                        var5--;
                        var60.field2103 = field720[var5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1105) {
                        var5--;
                        var60.field2119 = field720[var5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1106) {
                        var5--;
                        var60.field2107 = field720[var5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1107) {
                        var5--;
                        var60.field2108 = field720[var5] == 1;
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1108) {
                        var60.field2143 = 1;
                        var5--;
                        var60.field2114 = field720[var5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1109) {
                        var5 -= 6;
                        var60.field2132 = field720[var5];
                        var60.field2120 = field720[var5 + 1];
                        var60.field2189 = field720[var5 + 2];
                        var60.field2122 = field720[var5 + 3];
                        var60.field2123 = field720[var5 + 4];
                        var60.field2135 = field720[var5 + 5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1110) {
                        var5--;
                        int var61 = field720[var5];
                        if (var60.field2117 != var61) {
                            var60.field2117 = var61;
                            var60.field2058 = 0;
                            var60.field2193 = 0;
                            client.method1487(var60);
                        }
                        continue;
                    }
                    if (var494 == 1111) {
                        var5--;
                        var60.field2141 = field720[var5] == 1;
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1112) {
                        var6--;
                        String var62 = field723[var6];
                        if (!var62.equals(var60.field2186)) {
                            var60.field2186 = var62;
                            client.method1487(var60);
                        }
                        continue;
                    }
                    if (var494 == 1113) {
                        var5--;
                        var60.field2191 = field720[var5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1114) {
                        var5 -= 3;
                        var60.field2133 = field720[var5];
                        var60.field2071 = field720[var5 + 1];
                        var60.field2087 = field720[var5 + 2];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1115) {
                        var5--;
                        var60.field2174 = field720[var5] == 1;
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1116) {
                        var5--;
                        var60.field2109 = field720[var5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1117) {
                        var5--;
                        var60.field2083 = field720[var5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1118) {
                        var5--;
                        var60.field2111 = field720[var5] == 1;
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1119) {
                        var5--;
                        var60.field2112 = field720[var5] == 1;
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1120) {
                        var5 -= 2;
                        var60.field2093 = field720[var5];
                        var60.field2094 = field720[var5 + 1];
                        client.method1487(var60);
                        if (var59 != -1 && var60.field2163 == 0) {
                            client.method3089(Statics.field2173[var59 >> 16], var60, false);
                        }
                        continue;
                    }
                    if (var494 == 1121) {
                        client.method105(var60.field2070, var60.field2124);
                        client.field450 = var60;
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1122) {
                        var5--;
                        var60.field2061 = field720[var5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1123) {
                        var5--;
                        var60.field2096 = field720[var5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1124) {
                        var5--;
                        var60.field2146 = field720[var5];
                        client.method1487(var60);
                        continue;
                    }
                    if (var494 == 1125) {
                        var5--;
                        int var63 = field720[var5];
                        class222[] var64 = new class222[] { class222.field3178, class222.field3180, class222.field3182, class222.field3183, class222.field3181 };
                        class222 var65 = (class222) Statics.method1856(var64, var63);
                        if (var65 != null) {
                            var60.field2066 = var65;
                            client.method1487(var60);
                        }
                        continue;
                    }
                } else if (var494 >= 1200 && var494 < 1300 || var494 >= 2200 && var494 < 2300) {
                    class151 var66;
                    if (var494 >= 2000) {
                        var494 -= 1000;
                        var5--;
                        var66 = class151.method80(field720[var5]);
                    } else {
                        var66 = var41 ? Statics.field930 : Statics.field724;
                    }
                    client.method1487(var66);
                    if (var494 == 1200 || var494 == 1205 || var494 == 1212) {
                        var5 -= 2;
                        int var67 = field720[var5];
                        int var68 = field720[var5 + 1];
                        var66.field2105 = var67;
                        var66.field2196 = var68;
                        class199 var69 = class199.method207(var67);
                        var66.field2189 = var69.field2956;
                        var66.field2122 = var69.field2983;
                        var66.field2123 = var69.field2978;
                        var66.field2132 = var69.field2941;
                        var66.field2120 = var69.field2960;
                        var66.field2135 = var69.field2953;
                        if (var494 == 1205) {
                            var66.field2128 = 0;
                        } else if (var494 == 1212 | var69.field2961 == 1) {
                            var66.field2128 = 1;
                        } else {
                            var66.field2128 = 2;
                        }
                        if (var66.field2125 > 0) {
                            var66.field2135 = var66.field2135 * 32 / var66.field2125;
                        } else if (var66.field2145 > 0) {
                            var66.field2135 = var66.field2135 * 32 / var66.field2145;
                        }
                        continue;
                    }
                    if (var494 == 1201) {
                        var66.field2143 = 2;
                        var5--;
                        var66.field2114 = field720[var5];
                        continue;
                    }
                    if (var494 == 1202) {
                        var66.field2143 = 3;
                        var66.field2114 = Statics.field810.field245.method2591();
                        continue;
                    }
                } else if ((var494 < 1300 || var494 >= 1400) && (var494 < 2300 || var494 >= 2400)) {
                    if (var494 >= 1400 && var494 < 1500 || var494 >= 2400 && var494 < 2500) {
                        class151 var74;
                        if (var494 >= 2000) {
                            var494 -= 1000;
                            var5--;
                            var74 = class151.method80(field720[var5]);
                        } else {
                            var74 = var41 ? Statics.field930 : Statics.field724;
                        }
                        var6--;
                        String var75 = field723[var6];
                        int[] var76 = null;
                        if (var75.length() > 0 && var75.charAt(var75.length() - 1) == 'Y') {
                            var5--;
                            int var77 = field720[var5];
                            if (var77 > 0) {
                                var76 = new int[var77];
                                while (var77-- > 0) {
                                    var5--;
                                    var76[var77] = field720[var5];
                                }
                            }
                            var75 = var75.substring(0, var75.length() - 1);
                        }
                        Object[] var78 = new Object[var75.length() + 1];
                        for (int var79 = var78.length - 1; var79 >= 1; var79--) {
                            if (var75.charAt(var79 - 1) == 's') {
                                var6--;
                                var78[var79] = field723[var6];
                            } else {
                                var5--;
                                var78[var79] = Integer.valueOf(field720[var5]);
                            }
                        }
                        var5--;
                        int var80 = field720[var5];
                        if (var80 == -1) {
                            var78 = null;
                        } else {
                            var78[0] = Integer.valueOf(var80);
                        }
                        if (var494 == 1400) {
                            var74.field2152 = var78;
                        }
                        if (var494 == 1401) {
                            var74.field2155 = var78;
                        }
                        if (var494 == 1402) {
                            var74.field2154 = var78;
                        }
                        if (var494 == 1403) {
                            var74.field2156 = var78;
                        }
                        if (var494 == 1404) {
                            var74.field2158 = var78;
                        }
                        if (var494 == 1405) {
                            var74.field2159 = var78;
                        }
                        if (var494 == 1406) {
                            var74.field2162 = var78;
                        }
                        if (var494 == 1407) {
                            var74.field2190 = var78;
                            var74.field2080 = var76;
                        }
                        if (var494 == 1408) {
                            var74.field2169 = var78;
                        }
                        if (var494 == 1409) {
                            var74.field2179 = var78;
                        }
                        if (var494 == 1410) {
                            var74.field2059 = var78;
                        }
                        if (var494 == 1411) {
                            var74.field2153 = var78;
                        }
                        if (var494 == 1412) {
                            var74.field2157 = var78;
                        }
                        if (var494 == 1414) {
                            var74.field2165 = var78;
                            var74.field2144 = var76;
                        }
                        if (var494 == 1415) {
                            var74.field2167 = var78;
                            var74.field2090 = var76;
                        }
                        if (var494 == 1416) {
                            var74.field2161 = var78;
                        }
                        if (var494 == 1417) {
                            var74.field2171 = var78;
                        }
                        if (var494 == 1418) {
                            var74.field2172 = var78;
                        }
                        if (var494 == 1419) {
                            var74.field2183 = var78;
                        }
                        if (var494 == 1420) {
                            var74.field2168 = var78;
                        }
                        if (var494 == 1421) {
                            var74.field2175 = var78;
                        }
                        if (var494 == 1422) {
                            var74.field2176 = var78;
                        }
                        if (var494 == 1423) {
                            var74.field2177 = var78;
                        }
                        if (var494 == 1424) {
                            var74.field2178 = var78;
                        }
                        if (var494 == 1425) {
                            var74.field2106 = var78;
                        }
                        if (var494 == 1426) {
                            var74.field2181 = var78;
                        }
                        if (var494 == 1427) {
                            var74.field2101 = var78;
                        }
                        var74.field2150 = true;
                        continue;
                    }
                    if (var494 < 1600) {
                        class151 var81 = var41 ? Statics.field930 : Statics.field724;
                        if (var494 == 1500) {
                            field720[var5++] = var81.field2100;
                            continue;
                        }
                        if (var494 == 1501) {
                            field720[var5++] = var81.field2084;
                            continue;
                        }
                        if (var494 == 1502) {
                            field720[var5++] = var81.field2110;
                            continue;
                        }
                        if (var494 == 1503) {
                            field720[var5++] = var81.field2086;
                            continue;
                        }
                        if (var494 == 1504) {
                            field720[var5++] = var81.field2085 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 1505) {
                            field720[var5++] = var81.field2089;
                            continue;
                        }
                    } else if (var494 < 1700) {
                        class151 var82 = var41 ? Statics.field930 : Statics.field724;
                        if (var494 == 1600) {
                            field720[var5++] = var82.field2166;
                            continue;
                        }
                        if (var494 == 1601) {
                            field720[var5++] = var82.field2092;
                            continue;
                        }
                        if (var494 == 1602) {
                            field723[var6++] = var82.field2186;
                            continue;
                        }
                        if (var494 == 1603) {
                            field720[var5++] = var82.field2093;
                            continue;
                        }
                        if (var494 == 1604) {
                            field720[var5++] = var82.field2094;
                            continue;
                        }
                        if (var494 == 1605) {
                            field720[var5++] = var82.field2135;
                            continue;
                        }
                        if (var494 == 1606) {
                            field720[var5++] = var82.field2189;
                            continue;
                        }
                        if (var494 == 1607) {
                            field720[var5++] = var82.field2123;
                            continue;
                        }
                        if (var494 == 1608) {
                            field720[var5++] = var82.field2122;
                            continue;
                        }
                        if (var494 == 1609) {
                            field720[var5++] = var82.field2127;
                            continue;
                        }
                        if (var494 == 1610) {
                            field720[var5++] = var82.field2146;
                            continue;
                        }
                        if (var494 == 1611) {
                            field720[var5++] = var82.field2095;
                            continue;
                        }
                        if (var494 == 1612) {
                            field720[var5++] = var82.field2096;
                            continue;
                        }
                        if (var494 == 1613) {
                            field720[var5++] = var82.field2066.method759();
                            continue;
                        }
                    } else if (var494 < 1800) {
                        class151 var83 = var41 ? Statics.field930 : Statics.field724;
                        if (var494 == 1700) {
                            field720[var5++] = var83.field2105;
                            continue;
                        }
                        if (var494 == 1701) {
                            if (var83.field2105 == -1) {
                                field720[var5++] = 0;
                            } else {
                                field720[var5++] = var83.field2196;
                            }
                            continue;
                        }
                        if (var494 == 1702) {
                            field720[var5++] = var83.field2124;
                            continue;
                        }
                    } else if (var494 < 1900) {
                        class151 var84 = var41 ? Statics.field930 : Statics.field724;
                        if (var494 == 1800) {
                            field720[var5++] = class152.method1099(client.method3219(var84));
                            continue;
                        }
                        if (var494 == 1801) {
                            var5--;
                            int var85 = field720[var5];
                            int var495 = var85 - 1;
                            if (var84.field2160 != null && var495 < var84.field2160.length && var84.field2160[var495] != null) {
                                field723[var6++] = var84.field2160[var495];
                                continue;
                            }
                            field723[var6++] = "";
                            continue;
                        }
                        if (var494 == 1802) {
                            if (var84.field2151 == null) {
                                field723[var6++] = "";
                            } else {
                                field723[var6++] = var84.field2151;
                            }
                            continue;
                        }
                    } else if (var494 >= 1900 && var494 < 2000 || var494 >= 2900 && var494 < 3000) {
                        class151 var86;
                        if (var494 >= 2000) {
                            var494 -= 1000;
                            var5--;
                            var86 = class151.method80(field720[var5]);
                        } else {
                            var86 = var41 ? Statics.field930 : Statics.field724;
                        }
                        if (var494 == 1927) {
                            if (field721 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var86.field2101 == null) {
                                return;
                            }
                            class19 var87 = new class19();
                            var87.field193 = var86;
                            var87.field197 = var86.field2101;
                            var87.field182 = field721 + 1;
                            client.field485.method2278(arg0);
                            continue;
                        }
                    } else if (var494 < 2600) {
                        var5--;
                        class151 var88 = class151.method80(field720[var5]);
                        if (var494 == 2500) {
                            field720[var5++] = var88.field2100;
                            continue;
                        }
                        if (var494 == 2501) {
                            field720[var5++] = var88.field2084;
                            continue;
                        }
                        if (var494 == 2502) {
                            field720[var5++] = var88.field2110;
                            continue;
                        }
                        if (var494 == 2503) {
                            field720[var5++] = var88.field2086;
                            continue;
                        }
                        if (var494 == 2504) {
                            field720[var5++] = var88.field2085 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 2505) {
                            field720[var5++] = var88.field2089;
                            continue;
                        }
                    } else if (var494 < 2700) {
                        var5--;
                        class151 var89 = class151.method80(field720[var5]);
                        if (var494 == 2600) {
                            field720[var5++] = var89.field2166;
                            continue;
                        }
                        if (var494 == 2601) {
                            field720[var5++] = var89.field2092;
                            continue;
                        }
                        if (var494 == 2602) {
                            field723[var6++] = var89.field2186;
                            continue;
                        }
                        if (var494 == 2603) {
                            field720[var5++] = var89.field2093;
                            continue;
                        }
                        if (var494 == 2604) {
                            field720[var5++] = var89.field2094;
                            continue;
                        }
                        if (var494 == 2605) {
                            field720[var5++] = var89.field2135;
                            continue;
                        }
                        if (var494 == 2606) {
                            field720[var5++] = var89.field2189;
                            continue;
                        }
                        if (var494 == 2607) {
                            field720[var5++] = var89.field2123;
                            continue;
                        }
                        if (var494 == 2608) {
                            field720[var5++] = var89.field2122;
                            continue;
                        }
                        if (var494 == 2609) {
                            field720[var5++] = var89.field2127;
                            continue;
                        }
                        if (var494 == 2610) {
                            field720[var5++] = var89.field2146;
                            continue;
                        }
                        if (var494 == 2611) {
                            field720[var5++] = var89.field2095;
                            continue;
                        }
                        if (var494 == 2612) {
                            field720[var5++] = var89.field2096;
                            continue;
                        }
                        if (var494 == 2613) {
                            field720[var5++] = var89.field2066.method759();
                            continue;
                        }
                    } else if (var494 < 2800) {
                        if (var494 == 2700) {
                            var5--;
                            class151 var90 = class151.method80(field720[var5]);
                            field720[var5++] = var90.field2105;
                            continue;
                        }
                        if (var494 == 2701) {
                            var5--;
                            class151 var91 = class151.method80(field720[var5]);
                            if (var91.field2105 == -1) {
                                field720[var5++] = 0;
                            } else {
                                field720[var5++] = var91.field2196;
                            }
                            continue;
                        }
                        if (var494 == 2702) {
                            var5--;
                            int var92 = field720[var5];
                            class18 var93 = (class18) client.field447.method2229((long) var92);
                            if (var93 == null) {
                                field720[var5++] = 0;
                            } else {
                                field720[var5++] = 1;
                            }
                            continue;
                        }
                        if (var494 == 2706) {
                            field720[var5++] = client.field391;
                            continue;
                        }
                    } else if (var494 < 2900) {
                        var5--;
                        class151 var94 = class151.method80(field720[var5]);
                        if (var494 == 2800) {
                            field720[var5++] = class152.method1099(client.method3219(var94));
                            continue;
                        }
                        if (var494 == 2801) {
                            var5--;
                            int var95 = field720[var5];
                            int var496 = var95 - 1;
                            if (var94.field2160 != null && var496 < var94.field2160.length && var94.field2160[var496] != null) {
                                field723[var6++] = var94.field2160[var496];
                                continue;
                            }
                            field723[var6++] = "";
                            continue;
                        }
                        if (var494 == 2802) {
                            if (var94.field2151 == null) {
                                field723[var6++] = "";
                            } else {
                                field723[var6++] = var94.field2151;
                            }
                            continue;
                        }
                    } else if (var494 < 3200) {
                        if (var494 == 3100) {
                            var6--;
                            String var96 = field723[var6];
                            class48.method121(0, "", var96);
                            continue;
                        }
                        if (var494 == 3101) {
                            var5 -= 2;
                            client.method739(Statics.field810, field720[var5], field720[var5 + 1]);
                            continue;
                        }
                        if (var494 == 3103) {
                            client.method73();
                            continue;
                        }
                        if (var494 == 3104) {
                            var6--;
                            String var97 = field723[var6];
                            int var98 = 0;
                            boolean var99 = false;
                            boolean var100 = false;
                            int var101 = 0;
                            int var102 = var97.length();
                            int var103 = 0;
                            boolean var105;
                            while (true) {
                                if (var103 >= var102) {
                                    var105 = var100;
                                    break;
                                }
                                label3449: {
                                    char var104 = var97.charAt(var103);
                                    if (var103 == 0) {
                                        if (var104 == '-') {
                                            var99 = true;
                                            break label3449;
                                        }
                                        if (var104 == '+') {
                                            break label3449;
                                        }
                                    }
                                    int var497;
                                    if (var104 >= '0' && var104 <= '9') {
                                        var497 = var104 - '0';
                                    } else if (var104 >= 'A' && var104 <= 'Z') {
                                        var497 = var104 - '7';
                                    } else {
                                        if (var104 < 'a' || var104 > 'z') {
                                            var105 = false;
                                            break;
                                        }
                                        var497 = var104 - 'W';
                                    }
                                    if (var497 >= 10) {
                                        var105 = false;
                                        break;
                                    }
                                    if (var99) {
                                        var497 = -var497;
                                    }
                                    int var106 = var101 * 10 + var497;
                                    if (var106 / 10 != var101) {
                                        var105 = false;
                                        break;
                                    }
                                    var101 = var106;
                                    var100 = true;
                                }
                                var103++;
                            }
                            if (var105) {
                                var98 = class208.method632(var97);
                            }
                            client.field331.method3010(71);
                            client.field331.method2768(var98);
                            continue;
                        }
                        if (var494 == 3105) {
                            var6--;
                            String var108 = field723[var6];
                            client.field331.method3010(67);
                            client.field331.method2765(var108.length() + 1);
                            client.field331.method2771(var108);
                            continue;
                        }
                        if (var494 == 3106) {
                            var6--;
                            String var109 = field723[var6];
                            client.field331.method3010(213);
                            client.field331.method2765(var109.length() + 1);
                            client.field331.method2771(var109);
                            continue;
                        }
                        if (var494 == 3107) {
                            var5--;
                            int var110 = field720[var5];
                            var6--;
                            String var111 = field723[var6];
                            int var112 = class46.field898;
                            int[] var113 = class46.field903;
                            boolean var114 = false;
                            for (int var115 = 0; var115 < var112; var115++) {
                                class24 var116 = client.field409[var113[var115]];
                                if (var116 != null && Statics.field810 != var116 && var116.field257 != null && var116.field257.equalsIgnoreCase(var111)) {
                                    if (var110 == 1) {
                                        client.field331.method3010(25);
                                        client.field331.method2776(0);
                                        client.field331.method2812(var113[var115]);
                                    } else if (var110 == 4) {
                                        client.field331.method3010(242);
                                        client.field331.method2812(var113[var115]);
                                        client.field331.method2776(0);
                                    } else if (var110 == 6) {
                                        client.field331.method3010(22);
                                        client.field331.method2812(var113[var115]);
                                        client.field331.method2888(0);
                                    } else if (var110 == 7) {
                                        client.field331.method3010(223);
                                        client.field331.method2766(var113[var115]);
                                        client.field331.method2776(0);
                                    }
                                    var114 = true;
                                    break;
                                }
                            }
                            if (!var114) {
                                class48.method121(4, "", class174.field2648 + var111);
                            }
                            continue;
                        }
                        if (var494 == 3108) {
                            var5 -= 3;
                            int var117 = field720[var5];
                            int var118 = field720[var5 + 1];
                            int var119 = field720[var5 + 2];
                            class151 var120 = class151.method80(var119);
                            client.method1959(var120, var117, var118);
                            continue;
                        }
                        if (var494 == 3109) {
                            var5 -= 2;
                            int var121 = field720[var5];
                            int var122 = field720[var5 + 1];
                            class151 var123 = var41 ? Statics.field930 : Statics.field724;
                            client.method1959(var123, var121, var122);
                            continue;
                        }
                        if (var494 == 3110) {
                            var5--;
                            Statics.field230 = field720[var5] == 1;
                            continue;
                        }
                        if (var494 == 3111) {
                            field720[var5++] = Statics.field1344.field692 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3112) {
                            var5--;
                            Statics.field1344.field692 = field720[var5] == 1;
                            class31.method43();
                            continue;
                        }
                        if (var494 == 3113) {
                            var6--;
                            String var124 = field723[var6];
                            var5--;
                            boolean var125 = field720[var5] == 1;
                            class115.method218(var124, var125, false);
                            continue;
                        }
                        if (var494 == 3115) {
                            var5--;
                            int var126 = field720[var5];
                            client.field331.method3010(62);
                            client.field331.method2766(var126);
                            continue;
                        }
                        if (var494 == 3116) {
                            var5--;
                            int var127 = field720[var5];
                            var6 -= 2;
                            String var128 = field723[var6];
                            String var129 = field723[var6 + 1];
                            if (var128.length() <= 500 && var129.length() <= 500) {
                                client.field331.method3010(234);
                                client.field331.method2766(1 + class161.method1995(var128) + class161.method1995(var129));
                                client.field331.method2888(var127);
                                client.field331.method2771(var128);
                                client.field331.method2771(var129);
                            }
                            continue;
                        }
                    } else if (var494 < 3300) {
                        if (var494 == 3200) {
                            var5 -= 3;
                            int var130 = field720[var5];
                            int var131 = field720[var5 + 1];
                            int var132 = field720[var5 + 2];
                            if (client.field479 != 0 && var131 != 0 && client.field528 < 50) {
                                client.field529[client.field528] = var130;
                                client.field530[client.field528] = var131;
                                client.field432[client.field528] = var132;
                                client.field533[client.field528] = null;
                                client.field300[client.field528] = 0;
                                client.field528++;
                            }
                            continue;
                        }
                        if (var494 == 3201) {
                            var5--;
                            client.method737(field720[var5]);
                            continue;
                        }
                        if (var494 == 3202) {
                            var5 -= 2;
                            int var133 = field720[var5];
                            int var10000 = field720[var5 + 1];
                            if (client.field523 != 0 && var133 != -1) {
                                class139.method2173(Statics.field333, var133, 0, client.field523, false);
                                client.field525 = true;
                            }
                            continue;
                        }
                    } else if (var494 < 3400) {
                        if (var494 == 3300) {
                            field720[var5++] = client.field295;
                            continue;
                        }
                        if (var494 == 3301) {
                            var5 -= 2;
                            int var135 = field720[var5];
                            int var136 = field720[var5 + 1];
                            field720[var5++] = class13.method606(var135, var136);
                            continue;
                        }
                        if (var494 == 3302) {
                            var5 -= 2;
                            int var137 = field720[var5];
                            int var138 = field720[var5 + 1];
                            field720[var5++] = class13.method106(var137, var138);
                            continue;
                        }
                        if (var494 == 3303) {
                            var5 -= 2;
                            int var139 = field720[var5];
                            int var140 = field720[var5 + 1];
                            int[] var141 = field720;
                            int var142 = var5++;
                            class13 var143 = (class13) class13.field123.method2229((long) var139);
                            int var144;
                            if (var143 == null) {
                                var144 = 0;
                            } else if (var140 == -1) {
                                var144 = 0;
                            } else {
                                int var145 = 0;
                                for (int var146 = 0; var146 < var143.field122.length; var146++) {
                                    if (var143.field121[var146] == var140) {
                                        var145 += var143.field122[var146];
                                    }
                                }
                                var144 = var145;
                            }
                            var141[var142] = var144;
                            continue;
                        }
                        if (var494 == 3304) {
                            var5--;
                            int var147 = field720[var5];
                            int[] var148 = field720;
                            int var149 = var5++;
                            class187 var150 = (class187) class187.field2770.method2221((long) var147);
                            class187 var151;
                            if (var150 == null) {
                                byte[] var152 = Statics.field2769.method3093(5, var147);
                                class187 var153 = new class187();
                                if (var152 != null) {
                                    var153.method3224(new class161(var152));
                                }
                                class187.field2770.method2219(var153, (long) var147);
                                var151 = var153;
                            } else {
                                var151 = var150;
                            }
                            var148[var149] = var151.field2772;
                            continue;
                        }
                        if (var494 == 3305) {
                            var5--;
                            int var154 = field720[var5];
                            field720[var5++] = client.field423[var154];
                            continue;
                        }
                        if (var494 == 3306) {
                            var5--;
                            int var155 = field720[var5];
                            field720[var5++] = client.field424[var155];
                            continue;
                        }
                        if (var494 == 3307) {
                            var5--;
                            int var156 = field720[var5];
                            field720[var5++] = client.field545[var156];
                            continue;
                        }
                        if (var494 == 3308) {
                            int var157 = Statics.field2326;
                            int var158 = (Statics.field810.field648 >> 7) + Statics.field171;
                            int var159 = (Statics.field810.field597 >> 7) + Statics.field464;
                            field720[var5++] = (var157 << 28) + (var158 << 14) + var159;
                            continue;
                        }
                        if (var494 == 3309) {
                            var5--;
                            int var160 = field720[var5];
                            field720[var5++] = var160 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var494 == 3310) {
                            var5--;
                            int var161 = field720[var5];
                            field720[var5++] = var161 >> 28;
                            continue;
                        }
                        if (var494 == 3311) {
                            var5--;
                            int var162 = field720[var5];
                            field720[var5++] = var162 & 0x3FFF;
                            continue;
                        }
                        if (var494 == 3312) {
                            field720[var5++] = client.field440 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3313) {
                            var5 -= 2;
                            int var163 = field720[var5] + 32768;
                            int var164 = field720[var5 + 1];
                            int[] var165 = field720;
                            int var166 = var5++;
                            class13 var167 = (class13) class13.field123.method2229((long) var163);
                            int var168;
                            if (var167 == null) {
                                var168 = -1;
                            } else if (var164 >= 0 && var164 < var167.field121.length) {
                                var168 = var167.field121[var164];
                            } else {
                                var168 = -1;
                            }
                            var165[var166] = var168;
                            continue;
                        }
                        if (var494 == 3314) {
                            var5 -= 2;
                            int var169 = field720[var5] + 32768;
                            int var170 = field720[var5 + 1];
                            field720[var5++] = class13.method106(var169, var170);
                            continue;
                        }
                        if (var494 == 3315) {
                            var5 -= 2;
                            int var171 = field720[var5] + 32768;
                            int var172 = field720[var5 + 1];
                            int[] var173 = field720;
                            int var174 = var5++;
                            class13 var175 = (class13) class13.field123.method2229((long) var171);
                            int var176;
                            if (var175 == null) {
                                var176 = 0;
                            } else if (var172 == -1) {
                                var176 = 0;
                            } else {
                                int var177 = 0;
                                for (int var178 = 0; var178 < var175.field122.length; var178++) {
                                    if (var175.field121[var178] == var172) {
                                        var177 += var175.field122[var178];
                                    }
                                }
                                var176 = var177;
                            }
                            var173[var174] = var176;
                            continue;
                        }
                        if (var494 == 3316) {
                            if (client.field504 >= 2) {
                                field720[var5++] = client.field504;
                            } else {
                                field720[var5++] = 0;
                            }
                            continue;
                        }
                        if (var494 == 3317) {
                            field720[var5++] = client.field302;
                            continue;
                        }
                        if (var494 == 3318) {
                            field720[var5++] = client.field284;
                            continue;
                        }
                        if (var494 == 3321) {
                            field720[var5++] = client.field451;
                            continue;
                        }
                        if (var494 == 3322) {
                            field720[var5++] = client.field452;
                            continue;
                        }
                        if (var494 == 3323) {
                            if (client.field334) {
                                field720[var5++] = 1;
                            } else {
                                field720[var5++] = 0;
                            }
                            continue;
                        }
                        if (var494 == 3324) {
                            field720[var5++] = client.field285;
                            continue;
                        }
                    } else if (var494 < 3500) {
                        if (var494 == 3400) {
                            var5 -= 2;
                            int var179 = field720[var5];
                            int var180 = field720[var5 + 1];
                            class196 var181 = class196.method1648(var179);
                            if (var181.field2859 != 's') {
                            }
                            for (int var182 = 0; var182 < var181.field2861; var182++) {
                                if (var181.field2862[var182] == var180) {
                                    field723[var6++] = var181.field2864[var182];
                                    var181 = null;
                                    break;
                                }
                            }
                            if (var181 != null) {
                                field723[var6++] = var181.field2855;
                            }
                            continue;
                        }
                        if (var494 == 3408) {
                            var5 -= 4;
                            int var183 = field720[var5];
                            int var184 = field720[var5 + 1];
                            int var185 = field720[var5 + 2];
                            int var186 = field720[var5 + 3];
                            class196 var187 = class196.method1648(var185);
                            if (var187.field2857 == var183 && var187.field2859 == var184) {
                                for (int var188 = 0; var188 < var187.field2861; var188++) {
                                    if (var187.field2862[var188] == var186) {
                                        if (var184 == 115) {
                                            field723[var6++] = var187.field2864[var188];
                                        } else {
                                            field720[var5++] = var187.field2863[var188];
                                        }
                                        var187 = null;
                                        break;
                                    }
                                }
                                if (var187 != null) {
                                    if (var184 == 115) {
                                        field723[var6++] = var187.field2855;
                                    } else {
                                        field720[var5++] = var187.field2860;
                                    }
                                }
                                continue;
                            }
                            if (var184 == 115) {
                                field723[var6++] = "null";
                            } else {
                                field720[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var494 < 3700) {
                        if (var494 == 3600) {
                            if (client.field554 == 0) {
                                field720[var5++] = -2;
                            } else if (client.field554 == 1) {
                                field720[var5++] = -1;
                            } else {
                                field720[var5++] = client.field517;
                            }
                            continue;
                        }
                        if (var494 == 3601) {
                            var5--;
                            int var189 = field720[var5];
                            if (client.field554 == 2 && var189 < client.field517) {
                                field723[var6++] = client.field421[var189].field150;
                                field723[var6++] = client.field421[var189].field145;
                                continue;
                            }
                            field723[var6++] = "";
                            field723[var6++] = "";
                            continue;
                        }
                        if (var494 == 3602) {
                            var5--;
                            int var190 = field720[var5];
                            if (client.field554 == 2 && var190 < client.field517) {
                                field720[var5++] = client.field421[var190].field146;
                                continue;
                            }
                            field720[var5++] = 0;
                            continue;
                        }
                        if (var494 == 3603) {
                            var5--;
                            int var191 = field720[var5];
                            if (client.field554 == 2 && var191 < client.field517) {
                                field720[var5++] = client.field421[var191].field147;
                                continue;
                            }
                            field720[var5++] = 0;
                            continue;
                        }
                        if (var494 == 3604) {
                            var6--;
                            String var192 = field723[var6];
                            var5--;
                            int var193 = field720[var5];
                            client.field331.method3010(184);
                            client.field331.method2765(class161.method1995(var192) + 1);
                            client.field331.method2771(var192);
                            client.field331.method2765(var193);
                            continue;
                        }
                        if (var494 == 3605) {
                            var6--;
                            String var194 = field723[var6];
                            if (var194 == null) {
                                continue;
                            }
                            if ((client.field517 < 200 || client.field411 == 1) && client.field517 < 400) {
                                String var195 = class205.method2984(var194, Statics.field1741);
                                if (var195 == null) {
                                    continue;
                                }
                                for (int var196 = 0; var196 < client.field517; var196++) {
                                    class15 var197 = client.field421[var196];
                                    String var198 = class205.method2984(var197.field150, Statics.field1741);
                                    if (var198 != null && var198.equals(var195)) {
                                        class48.method121(30, "", var194 + class174.field2384);
                                        continue label3173;
                                    }
                                    if (var197.field145 != null) {
                                        String var199 = class205.method2984(var197.field145, Statics.field1741);
                                        if (var199 != null && var199.equals(var195)) {
                                            class48.method121(30, "", var194 + class174.field2384);
                                            continue label3173;
                                        }
                                    }
                                }
                                for (int var200 = 0; var200 < client.field557; var200++) {
                                    class20 var201 = client.field558[var200];
                                    String var202 = class205.method2984(var201.field205, Statics.field1741);
                                    if (var202 != null && var202.equals(var195)) {
                                        class48.method121(30, "", class174.field2539 + var194 + class174.field2540);
                                        continue label3173;
                                    }
                                    if (var201.field211 != null) {
                                        String var203 = class205.method2984(var201.field211, Statics.field1741);
                                        if (var203 != null && var203.equals(var195)) {
                                            class48.method121(30, "", class174.field2539 + var194 + class174.field2540);
                                            continue label3173;
                                        }
                                    }
                                }
                                if (class205.method2984(Statics.field810.field257, Statics.field1741).equals(var195)) {
                                    class48.method121(30, "", class174.field2633);
                                } else {
                                    client.field331.method3010(161);
                                    client.field331.method2765(class161.method1995(var194));
                                    client.field331.method2771(var194);
                                }
                                continue;
                            }
                            class48.method121(30, "", class174.field2533);
                            continue;
                        }
                        if (var494 == 3606) {
                            var6--;
                            String var204 = field723[var6];
                            if (var204 == null) {
                                continue;
                            }
                            String var205 = class205.method2984(var204, Statics.field1741);
                            if (var205 == null) {
                                continue;
                            }
                            int var206 = 0;
                            while (true) {
                                if (var206 >= client.field517) {
                                    continue label3173;
                                }
                                class15 var207 = client.field421[var206];
                                String var208 = var207.field150;
                                String var209 = class205.method2984(var208, Statics.field1741);
                                if (class218.method1953(var204, var205, var208, var209)) {
                                    client.field517--;
                                    for (int var210 = var206; var210 < client.field517; var210++) {
                                        client.field421[var210] = client.field421[var210 + 1];
                                    }
                                    client.field389 = client.field471;
                                    client.field331.method3010(104);
                                    client.field331.method2765(class161.method1995(var204));
                                    client.field331.method2771(var204);
                                    continue label3173;
                                }
                                var206++;
                            }
                        }
                        if (var494 == 3607) {
                            var6--;
                            String var211 = field723[var6];
                            if (var211 == null) {
                                continue;
                            }
                            if ((client.field557 < 100 || client.field411 == 1) && client.field557 < 400) {
                                String var212 = class205.method2984(var211, Statics.field1741);
                                if (var212 == null) {
                                    continue;
                                }
                                for (int var213 = 0; var213 < client.field557; var213++) {
                                    class20 var214 = client.field558[var213];
                                    String var215 = class205.method2984(var214.field205, Statics.field1741);
                                    if (var215 != null && var215.equals(var212)) {
                                        class48.method121(31, "", var211 + class174.field2536);
                                        continue label3173;
                                    }
                                    if (var214.field211 != null) {
                                        String var216 = class205.method2984(var214.field211, Statics.field1741);
                                        if (var216 != null && var216.equals(var212)) {
                                            class48.method121(31, "", var211 + class174.field2536);
                                            continue label3173;
                                        }
                                    }
                                }
                                for (int var217 = 0; var217 < client.field517; var217++) {
                                    class15 var218 = client.field421[var217];
                                    String var219 = class205.method2984(var218.field150, Statics.field1741);
                                    if (var219 != null && var219.equals(var212)) {
                                        class48.method121(31, "", class174.field2541 + var211 + class174.field2542);
                                        continue label3173;
                                    }
                                    if (var218.field145 != null) {
                                        String var220 = class205.method2984(var218.field145, Statics.field1741);
                                        if (var220 != null && var220.equals(var212)) {
                                            class48.method121(31, "", class174.field2541 + var211 + class174.field2542);
                                            continue label3173;
                                        }
                                    }
                                }
                                if (class205.method2984(Statics.field810.field257, Statics.field1741).equals(var212)) {
                                    class48.method121(31, "", class174.field2538);
                                } else {
                                    client.field331.method3010(69);
                                    client.field331.method2765(class161.method1995(var211));
                                    client.field331.method2771(var211);
                                }
                                continue;
                            }
                            class48.method121(31, "", class174.field2535);
                            continue;
                        }
                        if (var494 == 3608) {
                            var6--;
                            String var221 = field723[var6];
                            if (var221 == null) {
                                continue;
                            }
                            String var222 = class205.method2984(var221, Statics.field1741);
                            if (var222 == null) {
                                continue;
                            }
                            int var223 = 0;
                            while (true) {
                                if (var223 >= client.field557) {
                                    continue label3173;
                                }
                                class20 var224 = client.field558[var223];
                                String var225 = var224.field205;
                                String var226 = class205.method2984(var225, Statics.field1741);
                                if (class218.method1953(var221, var222, var225, var226)) {
                                    client.field557--;
                                    for (int var227 = var223; var227 < client.field557; var227++) {
                                        client.field558[var227] = client.field558[var227 + 1];
                                    }
                                    client.field389 = client.field471;
                                    client.field331.method3010(229);
                                    client.field331.method2765(class161.method1995(var221));
                                    client.field331.method2771(var221);
                                    continue label3173;
                                }
                                var223++;
                            }
                        }
                        if (var494 == 3609) {
                            var6--;
                            String var228 = field723[var6];
                            class178[] var229 = class178.method1118();
                            for (int var230 = 0; var230 < var229.length; var230++) {
                                class178 var231 = var229[var230];
                                if (var231.field2678 != -1 && var228.startsWith(class38.method117(var231.field2678))) {
                                    var228 = var228.substring(6 + Integer.toString(var231.field2678).length());
                                    break;
                                }
                            }
                            field720[var5++] = client.method222(var228, false) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3611) {
                            if (client.field513 == null) {
                                field723[var6++] = "";
                                continue;
                            }
                            String[] var232 = field723;
                            int var233 = var6++;
                            String var234 = client.field513;
                            long var235 = 0L;
                            int var237 = var234.length();
                            for (int var238 = 0; var238 < var237; var238++) {
                                var235 *= 37L;
                                char var239 = var234.charAt(var238);
                                if (var239 >= 'A' && var239 <= 'Z') {
                                    var235 += (long) (var239 + 1 - 65);
                                } else if (var239 >= 'a' && var239 <= 'z') {
                                    var235 += (long) (var239 + 1 - 97);
                                } else if (var239 >= '0' && var239 <= '9') {
                                    var235 += (long) (var239 + 27 - 48);
                                }
                                if (var235 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var235 % 37L == 0L && var235 != 0L) {
                                var235 /= 37L;
                            }
                            String var242 = class206.method160(var235);
                            if (var242 == null) {
                                var242 = "";
                            }
                            var232[var233] = var242;
                            continue;
                        }
                        if (var494 == 3612) {
                            if (client.field513 == null) {
                                field720[var5++] = 0;
                            } else {
                                field720[var5++] = Statics.field1073;
                            }
                            continue;
                        }
                        if (var494 == 3613) {
                            var5--;
                            int var244 = field720[var5];
                            if (client.field513 != null && var244 < Statics.field1073) {
                                field723[var6++] = Statics.field2321[var244].field271;
                                continue;
                            }
                            field723[var6++] = "";
                            continue;
                        }
                        if (var494 == 3614) {
                            var5--;
                            int var245 = field720[var5];
                            if (client.field513 != null && var245 < Statics.field1073) {
                                field720[var5++] = Statics.field2321[var245].field272;
                                continue;
                            }
                            field720[var5++] = 0;
                            continue;
                        }
                        if (var494 == 3615) {
                            var5--;
                            int var246 = field720[var5];
                            if (client.field513 != null && var246 < Statics.field1073) {
                                field720[var5++] = Statics.field2321[var246].field273;
                                continue;
                            }
                            field720[var5++] = 0;
                            continue;
                        }
                        if (var494 == 3616) {
                            field720[var5++] = Statics.field274;
                            continue;
                        }
                        if (var494 == 3617) {
                            var6--;
                            String var247 = field723[var6];
                            client.method209(var247);
                            continue;
                        }
                        if (var494 == 3618) {
                            field720[var5++] = Statics.field176;
                            continue;
                        }
                        if (var494 == 3619) {
                            var6--;
                            String var248 = field723[var6];
                            client.method608(var248);
                            continue;
                        }
                        if (var494 == 3620) {
                            client.method2174();
                            continue;
                        }
                        if (var494 == 3621) {
                            if (client.field554 == 0) {
                                field720[var5++] = -1;
                            } else {
                                field720[var5++] = client.field557;
                            }
                            continue;
                        }
                        if (var494 == 3622) {
                            var5--;
                            int var249 = field720[var5];
                            if (client.field554 != 0 && var249 < client.field557) {
                                field723[var6++] = client.field558[var249].field205;
                                field723[var6++] = client.field558[var249].field211;
                                continue;
                            }
                            field723[var6++] = "";
                            field723[var6++] = "";
                            continue;
                        }
                        if (var494 == 3623) {
                            var6--;
                            String var250 = field723[var6];
                            if (var250.startsWith(class38.method117(0)) || var250.startsWith(class38.method117(1))) {
                                var250 = var250.substring(7);
                            }
                            field720[var5++] = client.method3228(var250) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3624) {
                            var5--;
                            int var251 = field720[var5];
                            if (Statics.field2321 != null && var251 < Statics.field1073 && Statics.field2321[var251].field271.equalsIgnoreCase(Statics.field810.field257)) {
                                field720[var5++] = 1;
                                continue;
                            }
                            field720[var5++] = 0;
                            continue;
                        }
                        if (var494 == 3625) {
                            if (client.field329 == null) {
                                field723[var6++] = "";
                                continue;
                            }
                            String[] var252 = field723;
                            int var253 = var6++;
                            String var254 = client.field329;
                            long var255 = 0L;
                            int var257 = var254.length();
                            for (int var258 = 0; var258 < var257; var258++) {
                                var255 *= 37L;
                                char var259 = var254.charAt(var258);
                                if (var259 >= 'A' && var259 <= 'Z') {
                                    var255 += (long) (var259 + 1 - 65);
                                } else if (var259 >= 'a' && var259 <= 'z') {
                                    var255 += (long) (var259 + 1 - 97);
                                } else if (var259 >= '0' && var259 <= '9') {
                                    var255 += (long) (var259 + 27 - 48);
                                }
                                if (var255 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var255 % 37L == 0L && var255 != 0L) {
                                var255 /= 37L;
                            }
                            String var262 = class206.method160(var255);
                            if (var262 == null) {
                                var262 = "";
                            }
                            var252[var253] = var262;
                            continue;
                        }
                    } else if (var494 < 4000) {
                        if (var494 == 3903) {
                            var5--;
                            int var264 = field720[var5];
                            field720[var5++] = client.field562[var264].method64();
                            continue;
                        }
                        if (var494 == 3904) {
                            var5--;
                            int var265 = field720[var5];
                            field720[var5++] = client.field562[var265].field41;
                            continue;
                        }
                        if (var494 == 3905) {
                            var5--;
                            int var266 = field720[var5];
                            field720[var5++] = client.field562[var266].field43;
                            continue;
                        }
                        if (var494 == 3906) {
                            var5--;
                            int var267 = field720[var5];
                            field720[var5++] = client.field562[var267].field49;
                            continue;
                        }
                        if (var494 == 3907) {
                            var5--;
                            int var268 = field720[var5];
                            field720[var5++] = client.field562[var268].field44;
                            continue;
                        }
                        if (var494 == 3908) {
                            var5--;
                            int var269 = field720[var5];
                            field720[var5++] = client.field562[var269].field45;
                            continue;
                        }
                        if (var494 == 3910) {
                            var5--;
                            int var270 = field720[var5];
                            int var271 = client.field562[var270].method49();
                            field720[var5++] = var271 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3911) {
                            var5--;
                            int var272 = field720[var5];
                            int var273 = client.field562[var272].method49();
                            field720[var5++] = var273 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3912) {
                            var5--;
                            int var274 = field720[var5];
                            int var275 = client.field562[var274].method49();
                            field720[var5++] = var275 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3913) {
                            var5--;
                            int var276 = field720[var5];
                            int var277 = client.field562[var276].method49();
                            field720[var5++] = var277 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3914) {
                            var5--;
                            boolean var278 = field720[var5] == 1;
                            if (Statics.field34 != null) {
                                Statics.field34.method14(class2.field12, var278);
                            }
                            continue;
                        }
                        if (var494 == 3915) {
                            var5--;
                            boolean var279 = field720[var5] == 1;
                            if (Statics.field34 != null) {
                                Statics.field34.method14(class2.field7, var279);
                            }
                            continue;
                        }
                        if (var494 == 3916) {
                            var5 -= 2;
                            boolean var280 = field720[var5] == 1;
                            boolean var281 = field720[var5 + 1] == 1;
                            if (Statics.field34 != null) {
                                Statics.field34.method14(new class45(var281), var280);
                            }
                            continue;
                        }
                        if (var494 == 3917) {
                            var5--;
                            boolean var282 = field720[var5] == 1;
                            if (Statics.field34 != null) {
                                Statics.field34.method14(class2.field5, var282);
                            }
                            continue;
                        }
                        if (var494 == 3918) {
                            var5--;
                            boolean var283 = field720[var5] == 1;
                            if (Statics.field34 != null) {
                                Statics.field34.method14(class2.field9, var283);
                            }
                            continue;
                        }
                        if (var494 == 3919) {
                            field720[var5++] = Statics.field34 == null ? 0 : Statics.field34.field11.size();
                            continue;
                        }
                        if (var494 == 3920) {
                            var5--;
                            int var284 = field720[var5];
                            class3 var285 = (class3) Statics.field34.field11.get(var284);
                            field720[var5++] = var285.field25;
                            continue;
                        }
                        if (var494 == 3921) {
                            var5--;
                            int var286 = field720[var5];
                            class3 var287 = (class3) Statics.field34.field11.get(var286);
                            field723[var6++] = var287.method25();
                            continue;
                        }
                        if (var494 == 3922) {
                            var5--;
                            int var288 = field720[var5];
                            class3 var289 = (class3) Statics.field34.field11.get(var288);
                            field723[var6++] = var289.method26();
                            continue;
                        }
                        if (var494 == 3923) {
                            var5--;
                            int var290 = field720[var5];
                            class3 var291 = (class3) Statics.field34.field11.get(var290);
                            long var292 = class163.method3594() - Statics.field22 - var291.field16;
                            int var294 = (int) (var292 / 3600000L);
                            int var295 = (int) ((var292 - (long) (var294 * 3600000)) / 60000L);
                            int var296 = (int) ((var292 - (long) (var294 * 3600000) - (long) (var295 * 60000)) / 1000L);
                            String var297 = var294 + ":" + var295 / 10 + var295 % 10 + ":" + var296 / 10 + var296 % 10;
                            field723[var6++] = var297;
                            continue;
                        }
                        if (var494 == 3924) {
                            var5--;
                            int var298 = field720[var5];
                            class3 var299 = (class3) Statics.field34.field11.get(var298);
                            field720[var5++] = var299.field24.field49;
                            continue;
                        }
                        if (var494 == 3925) {
                            var5--;
                            int var300 = field720[var5];
                            class3 var301 = (class3) Statics.field34.field11.get(var300);
                            field720[var5++] = var301.field24.field43;
                            continue;
                        }
                        if (var494 == 3926) {
                            var5--;
                            int var302 = field720[var5];
                            class3 var303 = (class3) Statics.field34.field11.get(var302);
                            field720[var5++] = var303.field24.field41;
                            continue;
                        }
                    } else if (var494 < 4100) {
                        if (var494 == 4000) {
                            var5 -= 2;
                            int var304 = field720[var5];
                            int var305 = field720[var5 + 1];
                            field720[var5++] = var304 + var305;
                            continue;
                        }
                        if (var494 == 4001) {
                            var5 -= 2;
                            int var306 = field720[var5];
                            int var307 = field720[var5 + 1];
                            field720[var5++] = var306 - var307;
                            continue;
                        }
                        if (var494 == 4002) {
                            var5 -= 2;
                            int var308 = field720[var5];
                            int var309 = field720[var5 + 1];
                            field720[var5++] = var308 * var309;
                            continue;
                        }
                        if (var494 == 4003) {
                            var5 -= 2;
                            int var310 = field720[var5];
                            int var311 = field720[var5 + 1];
                            field720[var5++] = var310 / var311;
                            continue;
                        }
                        if (var494 == 4004) {
                            var5--;
                            int var312 = field720[var5];
                            field720[var5++] = (int) (Math.random() * (double) var312);
                            continue;
                        }
                        if (var494 == 4005) {
                            var5--;
                            int var313 = field720[var5];
                            field720[var5++] = (int) (Math.random() * (double) (var313 + 1));
                            continue;
                        }
                        if (var494 == 4006) {
                            var5 -= 5;
                            int var314 = field720[var5];
                            int var315 = field720[var5 + 1];
                            int var316 = field720[var5 + 2];
                            int var317 = field720[var5 + 3];
                            int var318 = field720[var5 + 4];
                            field720[var5++] = (var315 - var314) * (var318 - var316) / (var317 - var316) + var314;
                            continue;
                        }
                        if (var494 == 4007) {
                            var5 -= 2;
                            int var319 = field720[var5];
                            int var320 = field720[var5 + 1];
                            field720[var5++] = var319 * var320 / 100 + var319;
                            continue;
                        }
                        if (var494 == 4008) {
                            var5 -= 2;
                            int var321 = field720[var5];
                            int var322 = field720[var5 + 1];
                            field720[var5++] = var321 | 0x1 << var322;
                            continue;
                        }
                        if (var494 == 4009) {
                            var5 -= 2;
                            int var323 = field720[var5];
                            int var324 = field720[var5 + 1];
                            field720[var5++] = var323 & -1 - (0x1 << var324);
                            continue;
                        }
                        if (var494 == 4010) {
                            var5 -= 2;
                            int var325 = field720[var5];
                            int var326 = field720[var5 + 1];
                            field720[var5++] = (var325 & 0x1 << var326) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var494 == 4011) {
                            var5 -= 2;
                            int var327 = field720[var5];
                            int var328 = field720[var5 + 1];
                            field720[var5++] = var327 % var328;
                            continue;
                        }
                        if (var494 == 4012) {
                            var5 -= 2;
                            int var329 = field720[var5];
                            int var330 = field720[var5 + 1];
                            if (var329 == 0) {
                                field720[var5++] = 0;
                            } else {
                                field720[var5++] = (int) Math.pow((double) var329, (double) var330);
                            }
                            continue;
                        }
                        if (var494 == 4013) {
                            var5 -= 2;
                            int var331 = field720[var5];
                            int var332 = field720[var5 + 1];
                            if (var331 == 0) {
                                field720[var5++] = 0;
                            } else if (var332 == 0) {
                                field720[var5++] = Integer.MAX_VALUE;
                            } else {
                                field720[var5++] = (int) Math.pow((double) var331, 1.0D / (double) var332);
                            }
                            continue;
                        }
                        if (var494 == 4014) {
                            var5 -= 2;
                            int var333 = field720[var5];
                            int var334 = field720[var5 + 1];
                            field720[var5++] = var333 & var334;
                            continue;
                        }
                        if (var494 == 4015) {
                            var5 -= 2;
                            int var335 = field720[var5];
                            int var336 = field720[var5 + 1];
                            field720[var5++] = var335 | var336;
                            continue;
                        }
                        if (var494 == 4018) {
                            var5 -= 3;
                            long var337 = (long) field720[var5];
                            long var339 = (long) field720[var5 + 1];
                            long var341 = (long) field720[var5 + 2];
                            field720[var5++] = (int) (var337 * var341 / var339);
                            continue;
                        }
                    } else if (var494 < 4200) {
                        if (var494 == 4100) {
                            var6--;
                            String var343 = field723[var6];
                            var5--;
                            int var344 = field720[var5];
                            field723[var6++] = var343 + var344;
                            continue;
                        }
                        if (var494 == 4101) {
                            var6 -= 2;
                            String var345 = field723[var6];
                            String var346 = field723[var6 + 1];
                            field723[var6++] = var345 + var346;
                            continue;
                        }
                        if (var494 == 4102) {
                            var6--;
                            String var347 = field723[var6];
                            var5--;
                            int var348 = field720[var5];
                            String[] var349 = field723;
                            int var350 = var6++;
                            String var352;
                            if (var348 < 0) {
                                var352 = Integer.toString(var348);
                            } else {
                                int var353 = var348;
                                String var354;
                                if (var348 < 0) {
                                    var354 = Integer.toString(var348, 10);
                                } else {
                                    int var355 = 2;
                                    int var356 = var348 / 10;
                                    while (var356 != 0) {
                                        var356 /= 10;
                                        var355++;
                                    }
                                    char[] var357 = new char[var355];
                                    var357[0] = '+';
                                    for (int var358 = var355 - 1; var358 > 0; var358--) {
                                        int var359 = var353;
                                        var353 /= 10;
                                        int var360 = var359 - var353 * 10;
                                        if (var360 >= 10) {
                                            var357[var358] = (char) (var360 + 87);
                                        } else {
                                            var357[var358] = (char) (var360 + 48);
                                        }
                                    }
                                    var354 = new String(var357);
                                }
                                var352 = var354;
                            }
                            var349[var350] = var347 + var352;
                            continue;
                        }
                        if (var494 == 4103) {
                            var6--;
                            String var361 = field723[var6];
                            field723[var6++] = var361.toLowerCase();
                            continue;
                        }
                        if (var494 == 4104) {
                            var5--;
                            int var362 = field720[var5];
                            long var363 = ((long) var362 + 11745L) * 86400000L;
                            field725.setTime(new Date(var363));
                            int var365 = field725.get(5);
                            int var366 = field725.get(2);
                            int var367 = field725.get(1);
                            field723[var6++] = var365 + "-" + field728[var366] + "-" + var367;
                            continue;
                        }
                        if (var494 == 4105) {
                            var6 -= 2;
                            String var368 = field723[var6];
                            String var369 = field723[var6 + 1];
                            if (Statics.field810.field245 != null && Statics.field810.field245.field2038) {
                                field723[var6++] = var369;
                                continue;
                            }
                            field723[var6++] = var368;
                            continue;
                        }
                        if (var494 == 4106) {
                            var5--;
                            int var370 = field720[var5];
                            field723[var6++] = Integer.toString(var370);
                            continue;
                        }
                        if (var494 == 4107) {
                            var6 -= 2;
                            field720[var5++] = class208.method1832(class203.method2143(field723[var6], field723[var6 + 1], client.field290));
                            continue;
                        }
                        if (var494 == 4108) {
                            var6--;
                            String var371 = field723[var6];
                            var5 -= 2;
                            int var372 = field720[var5];
                            int var373 = field720[var5 + 1];
                            byte[] var374 = Statics.field320.method3093(var373, 0);
                            class209 var375 = new class209(var374);
                            field720[var5++] = var375.method3671(var371, var372);
                            continue;
                        }
                        if (var494 == 4109) {
                            var6--;
                            String var376 = field723[var6];
                            var5 -= 2;
                            int var377 = field720[var5];
                            int var378 = field720[var5 + 1];
                            byte[] var379 = Statics.field320.method3093(var378, 0);
                            class209 var380 = new class209(var379);
                            field720[var5++] = var380.method3670(var376, var377);
                            continue;
                        }
                        if (var494 == 4110) {
                            var6 -= 2;
                            String var381 = field723[var6];
                            String var382 = field723[var6 + 1];
                            var5--;
                            if (field720[var5] == 1) {
                                field723[var6++] = var381;
                            } else {
                                field723[var6++] = var382;
                            }
                            continue;
                        }
                        if (var494 == 4111) {
                            var6--;
                            String var383 = field723[var6];
                            field723[var6++] = class210.method3726(var383);
                            continue;
                        }
                        if (var494 == 4112) {
                            var6--;
                            String var384 = field723[var6];
                            var5--;
                            int var385 = field720[var5];
                            field723[var6++] = var384 + (char) var385;
                            continue;
                        }
                        if (var494 == 4113) {
                            var5--;
                            int var386 = field720[var5];
                            field720[var5++] = class208.method46((char) var386) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4114) {
                            var5--;
                            int var387 = field720[var5];
                            field720[var5++] = class208.method1022((char) var387) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4115) {
                            var5--;
                            int var388 = field720[var5];
                            int[] var389 = field720;
                            int var390 = var5++;
                            char var391 = (char) var388;
                            boolean var392 = var391 >= 'A' && var391 <= 'Z' || var391 >= 'a' && var391 <= 'z';
                            var389[var390] = var392 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4116) {
                            var5--;
                            int var393 = field720[var5];
                            int[] var394 = field720;
                            int var395 = var5++;
                            char var396 = (char) var393;
                            boolean var397 = var396 >= '0' && var396 <= '9';
                            var394[var395] = var397 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4117) {
                            var6--;
                            String var398 = field723[var6];
                            if (var398 == null) {
                                field720[var5++] = 0;
                            } else {
                                field720[var5++] = var398.length();
                            }
                            continue;
                        }
                        if (var494 == 4118) {
                            var6--;
                            String var399 = field723[var6];
                            var5 -= 2;
                            int var400 = field720[var5];
                            int var401 = field720[var5 + 1];
                            field723[var6++] = var399.substring(var400, var401);
                            continue;
                        }
                        if (var494 == 4119) {
                            var6--;
                            String var402 = field723[var6];
                            StringBuilder var403 = new StringBuilder(var402.length());
                            boolean var404 = false;
                            for (int var405 = 0; var405 < var402.length(); var405++) {
                                char var406 = var402.charAt(var405);
                                if (var406 == '<') {
                                    var404 = true;
                                } else if (var406 == '>') {
                                    var404 = false;
                                } else if (!var404) {
                                    var403.append(var406);
                                }
                            }
                            field723[var6++] = var403.toString();
                            continue;
                        }
                        if (var494 == 4120) {
                            var6--;
                            String var407 = field723[var6];
                            var5--;
                            int var408 = field720[var5];
                            field720[var5++] = var407.indexOf(var408);
                            continue;
                        }
                        if (var494 == 4121) {
                            var6 -= 2;
                            String var409 = field723[var6];
                            String var410 = field723[var6 + 1];
                            var5--;
                            int var411 = field720[var5];
                            field720[var5++] = var409.indexOf(var410, var411);
                            continue;
                        }
                    } else if (var494 < 4300) {
                        if (var494 == 4200) {
                            var5--;
                            int var412 = field720[var5];
                            field723[var6++] = class199.method207(var412).field2945;
                            continue;
                        }
                        if (var494 == 4201) {
                            var5 -= 2;
                            int var413 = field720[var5];
                            int var414 = field720[var5 + 1];
                            class199 var415 = class199.method207(var413);
                            if (var414 >= 1 && var414 <= 5 && var415.field2964[var414 - 1] != null) {
                                field723[var6++] = var415.field2964[var414 - 1];
                                continue;
                            }
                            field723[var6++] = "";
                            continue;
                        }
                        if (var494 == 4202) {
                            var5 -= 2;
                            int var416 = field720[var5];
                            int var417 = field720[var5 + 1];
                            class199 var418 = class199.method207(var416);
                            if (var417 >= 1 && var417 <= 5 && var418.field2965[var417 - 1] != null) {
                                field723[var6++] = var418.field2965[var417 - 1];
                                continue;
                            }
                            field723[var6++] = "";
                            continue;
                        }
                        if (var494 == 4203) {
                            var5--;
                            int var419 = field720[var5];
                            field720[var5++] = class199.method207(var419).field2962;
                            continue;
                        }
                        if (var494 == 4204) {
                            var5--;
                            int var420 = field720[var5];
                            field720[var5++] = class199.method207(var420).field2961 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4205) {
                            var5--;
                            int var421 = field720[var5];
                            class199 var422 = class199.method207(var421);
                            if (var422.field2981 == -1 && var422.field2980 >= 0) {
                                field720[var5++] = var422.field2980;
                                continue;
                            }
                            field720[var5++] = var421;
                            continue;
                        }
                        if (var494 == 4206) {
                            var5--;
                            int var423 = field720[var5];
                            class199 var424 = class199.method207(var423);
                            if (var424.field2981 >= 0 && var424.field2980 >= 0) {
                                field720[var5++] = var424.field2980;
                                continue;
                            }
                            field720[var5++] = var423;
                            continue;
                        }
                        if (var494 == 4207) {
                            var5--;
                            int var425 = field720[var5];
                            field720[var5++] = class199.method207(var425).field2963 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4208) {
                            var5--;
                            int var426 = field720[var5];
                            class199 var427 = class199.method207(var426);
                            if (var427.field2992 == -1 && var427.field2959 >= 0) {
                                field720[var5++] = var427.field2959;
                                continue;
                            }
                            field720[var5++] = var426;
                            continue;
                        }
                        if (var494 == 4209) {
                            var5--;
                            int var428 = field720[var5];
                            class199 var429 = class199.method207(var428);
                            if (var429.field2992 >= 0 && var429.field2959 >= 0) {
                                field720[var5++] = var429.field2959;
                                continue;
                            }
                            field720[var5++] = var428;
                            continue;
                        }
                        if (var494 == 4210) {
                            var6--;
                            String var430 = field723[var6];
                            var5--;
                            int var431 = field720[var5];
                            client.method1833(var430, var431 == 1);
                            field720[var5++] = Statics.field126;
                            continue;
                        }
                        if (var494 == 4211) {
                            if (Statics.field2660 != null && Statics.field2340 < Statics.field126) {
                                field720[var5++] = Statics.field2660[++Statics.field2340 - 1] & 0xFFFF;
                                continue;
                            }
                            field720[var5++] = -1;
                            continue;
                        }
                        if (var494 == 4212) {
                            Statics.field2340 = 0;
                            continue;
                        }
                    } else if (var494 < 5100) {
                        if (var494 == 5000) {
                            field720[var5++] = client.field365;
                            continue;
                        }
                        if (var494 == 5001) {
                            var5 -= 3;
                            client.field365 = field720[var5];
                            int var432 = field720[var5 + 1];
                            class217[] var433 = new class217[] { class217.field3155, class217.field3157, class217.field3156 };
                            class217[] var434 = var433;
                            int var435 = 0;
                            class217 var437;
                            while (true) {
                                if (var435 >= var434.length) {
                                    var437 = null;
                                    break;
                                }
                                class217 var436 = var434[var435];
                                if (var436.field3154 == var432) {
                                    var437 = var436;
                                    break;
                                }
                                var435++;
                            }
                            Statics.field569 = var437;
                            if (Statics.field569 == null) {
                                Statics.field569 = class217.field3155;
                            }
                            client.field505 = field720[var5 + 2];
                            client.field331.method3010(125);
                            client.field331.method2765(client.field365);
                            client.field331.method2765(Statics.field569.field3154);
                            client.field331.method2765(client.field505);
                            continue;
                        }
                        if (var494 == 5002) {
                            var6--;
                            String var438 = field723[var6];
                            var5 -= 2;
                            int var439 = field720[var5];
                            int var440 = field720[var5 + 1];
                            client.field331.method3010(228);
                            client.field331.method2765(class161.method1995(var438) + 2);
                            client.field331.method2771(var438);
                            client.field331.method2765(var439 - 1);
                            client.field331.method2765(var440);
                            continue;
                        }
                        if (var494 == 5003) {
                            var5 -= 2;
                            int var441 = field720[var5];
                            int var442 = field720[var5 + 1];
                            class51 var443 = (class51) class48.field929.get(var441);
                            class22 var444 = var443.method869(var442);
                            if (var444 == null) {
                                field720[var5++] = -1;
                                field720[var5++] = 0;
                                field723[var6++] = "";
                                field723[var6++] = "";
                                field723[var6++] = "";
                            } else {
                                field720[var5++] = var444.field227;
                                field720[var5++] = var444.field225;
                                field723[var6++] = var444.field228 == null ? "" : var444.field228;
                                field723[var6++] = var444.field229 == null ? "" : var444.field229;
                                field723[var6++] = var444.field233 == null ? "" : var444.field233;
                            }
                            continue;
                        }
                        if (var494 == 5004) {
                            var5--;
                            int var446 = field720[var5];
                            class22 var447 = class48.method203(var446);
                            if (var447 == null) {
                                field720[var5++] = -1;
                                field720[var5++] = 0;
                                field723[var6++] = "";
                                field723[var6++] = "";
                                field723[var6++] = "";
                            } else {
                                field720[var5++] = var447.field226;
                                field720[var5++] = var447.field225;
                                field723[var6++] = var447.field228 == null ? "" : var447.field228;
                                field723[var6++] = var447.field229 == null ? "" : var447.field229;
                                field723[var6++] = var447.field233 == null ? "" : var447.field233;
                            }
                            continue;
                        }
                        if (var494 == 5005) {
                            if (Statics.field569 == null) {
                                field720[var5++] = -1;
                            } else {
                                field720[var5++] = Statics.field569.field3154;
                            }
                            continue;
                        }
                        if (var494 == 5008) {
                            var6--;
                            String var448 = field723[var6];
                            var5--;
                            int var449 = field720[var5];
                            String var450 = var448.toLowerCase();
                            byte var451 = 0;
                            if (var450.startsWith(class174.field2510)) {
                                var451 = 0;
                                var448 = var448.substring(class174.field2510.length());
                            } else if (var450.startsWith(class174.field2398)) {
                                var451 = 1;
                                var448 = var448.substring(class174.field2398.length());
                            } else if (var450.startsWith(class174.field2547)) {
                                var451 = 2;
                                var448 = var448.substring(class174.field2547.length());
                            } else if (var450.startsWith(class174.field2609)) {
                                var451 = 3;
                                var448 = var448.substring(class174.field2609.length());
                            } else if (var450.startsWith(class174.field2543)) {
                                var451 = 4;
                                var448 = var448.substring(class174.field2543.length());
                            } else if (var450.startsWith(class174.field2544)) {
                                var451 = 5;
                                var448 = var448.substring(class174.field2544.length());
                            } else if (var450.startsWith(class174.field2555)) {
                                var451 = 6;
                                var448 = var448.substring(class174.field2555.length());
                            } else if (var450.startsWith(class174.field2557)) {
                                var451 = 7;
                                var448 = var448.substring(class174.field2557.length());
                            } else if (var450.startsWith(class174.field2559)) {
                                var451 = 8;
                                var448 = var448.substring(class174.field2559.length());
                            } else if (var450.startsWith(class174.field2561)) {
                                var451 = 9;
                                var448 = var448.substring(class174.field2561.length());
                            } else if (var450.startsWith(class174.field2563)) {
                                var451 = 10;
                                var448 = var448.substring(class174.field2563.length());
                            } else if (var450.startsWith(class174.field2565)) {
                                var451 = 11;
                                var448 = var448.substring(class174.field2565.length());
                            } else if (client.field290 != 0) {
                                if (var450.startsWith(class174.field2534)) {
                                    var451 = 0;
                                    var448 = var448.substring(class174.field2534.length());
                                } else if (var450.startsWith(class174.field2546)) {
                                    var451 = 1;
                                    var448 = var448.substring(class174.field2546.length());
                                } else if (var450.startsWith(class174.field2489)) {
                                    var451 = 2;
                                    var448 = var448.substring(class174.field2489.length());
                                } else if (var450.startsWith(class174.field2550)) {
                                    var451 = 3;
                                    var448 = var448.substring(class174.field2550.length());
                                } else if (var450.startsWith(class174.field2400)) {
                                    var451 = 4;
                                    var448 = var448.substring(class174.field2400.length());
                                } else if (var450.startsWith(class174.field2554)) {
                                    var451 = 5;
                                    var448 = var448.substring(class174.field2554.length());
                                } else if (var450.startsWith(class174.field2632)) {
                                    var451 = 6;
                                    var448 = var448.substring(class174.field2632.length());
                                } else if (var450.startsWith(class174.field2558)) {
                                    var451 = 7;
                                    var448 = var448.substring(class174.field2558.length());
                                } else if (var450.startsWith(class174.field2560)) {
                                    var451 = 8;
                                    var448 = var448.substring(class174.field2560.length());
                                } else if (var450.startsWith(class174.field2562)) {
                                    var451 = 9;
                                    var448 = var448.substring(class174.field2562.length());
                                } else if (var450.startsWith(class174.field2564)) {
                                    var451 = 10;
                                    var448 = var448.substring(class174.field2564.length());
                                } else if (var450.startsWith(class174.field2566)) {
                                    var451 = 11;
                                    var448 = var448.substring(class174.field2566.length());
                                }
                            }
                            String var452 = var448.toLowerCase();
                            byte var453 = 0;
                            if (var452.startsWith(class174.field2441)) {
                                var453 = 1;
                                var448 = var448.substring(class174.field2441.length());
                            } else if (var452.startsWith(class174.field2369)) {
                                var453 = 2;
                                var448 = var448.substring(class174.field2369.length());
                            } else if (var452.startsWith(class174.field2571)) {
                                var453 = 3;
                                var448 = var448.substring(class174.field2571.length());
                            } else if (var452.startsWith(class174.field2573)) {
                                var453 = 4;
                                var448 = var448.substring(class174.field2573.length());
                            } else if (var452.startsWith(class174.field2575)) {
                                var453 = 5;
                                var448 = var448.substring(class174.field2575.length());
                            } else if (client.field290 != 0) {
                                if (var452.startsWith(class174.field2568)) {
                                    var453 = 1;
                                    var448 = var448.substring(class174.field2568.length());
                                } else if (var452.startsWith(class174.field2570)) {
                                    var453 = 2;
                                    var448 = var448.substring(class174.field2570.length());
                                } else if (var452.startsWith(class174.field2572)) {
                                    var453 = 3;
                                    var448 = var448.substring(class174.field2572.length());
                                } else if (var452.startsWith(class174.field2574)) {
                                    var453 = 4;
                                    var448 = var448.substring(class174.field2574.length());
                                } else if (var452.startsWith(class174.field2576)) {
                                    var453 = 5;
                                    var448 = var448.substring(class174.field2576.length());
                                }
                            }
                            client.field331.method3010(94);
                            client.field331.method2765(0);
                            int var454 = client.field331.field2285;
                            client.field331.method2765(var449);
                            client.field331.method2765(var451);
                            client.field331.method2765(var453);
                            Statics.method3321(client.field331, var448);
                            client.field331.method2780(client.field331.field2285 - var454);
                            continue;
                        }
                        if (var494 == 5009) {
                            var6 -= 2;
                            String var455 = field723[var6];
                            String var456 = field723[var6 + 1];
                            client.field331.method3010(220);
                            client.field331.method2766(0);
                            int var457 = client.field331.field2285;
                            client.field331.method2771(var455);
                            Statics.method3321(client.field331, var456);
                            client.field331.method2917(client.field331.field2285 - var457);
                            continue;
                        }
                        if (var494 == 5015) {
                            String var458;
                            if (Statics.field810 == null || Statics.field810.field257 == null) {
                                var458 = "";
                            } else {
                                var458 = Statics.field810.field257;
                            }
                            field723[var6++] = var458;
                            continue;
                        }
                        if (var494 == 5016) {
                            field720[var5++] = client.field505;
                            continue;
                        }
                        if (var494 == 5017) {
                            var5--;
                            int var459 = field720[var5];
                            int[] var460 = field720;
                            int var461 = var5++;
                            class51 var462 = (class51) class48.field929.get(var459);
                            int var463;
                            if (var462 == null) {
                                var463 = 0;
                            } else {
                                var463 = var462.method870();
                            }
                            var460[var461] = var463;
                            continue;
                        }
                        if (var494 == 5018) {
                            var5--;
                            int var464 = field720[var5];
                            field720[var5++] = class48.method2979(var464);
                            continue;
                        }
                        if (var494 == 5019) {
                            var5--;
                            int var465 = field720[var5];
                            int[] var466 = field720;
                            int var467 = var5++;
                            class22 var468 = (class22) class48.field926.method2202((long) var465);
                            int var469;
                            if (var468 == null) {
                                var469 = -1;
                            } else if (class48.field931.field1898 == var468.field1884) {
                                var469 = -1;
                            } else {
                                var469 = ((class22) var468.field1884).field227;
                            }
                            var466[var467] = var469;
                            continue;
                        }
                        if (var494 == 5020) {
                            var6--;
                            String var470 = field723[var6];
                            client.method95(var470);
                            continue;
                        }
                        if (var494 == 5021) {
                            var6--;
                            client.field506 = field723[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var494 == 5022) {
                            field723[var6++] = client.field506;
                            continue;
                        }
                    }
                } else {
                    class151 var70;
                    if (var494 >= 2000) {
                        var494 -= 1000;
                        var5--;
                        var70 = class151.method80(field720[var5]);
                    } else {
                        var70 = var41 ? Statics.field930 : Statics.field724;
                    }
                    if (var494 == 1300) {
                        var5--;
                        int var71 = field720[var5] - 1;
                        if (var71 >= 0 && var71 <= 9) {
                            var6--;
                            var70.method2637(var71, field723[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var494 == 1301) {
                        var5 -= 2;
                        int var72 = field720[var5];
                        int var73 = field720[var5 + 1];
                        var70.field2091 = class151.method70(var72, var73);
                        continue;
                    }
                    if (var494 == 1302) {
                        var5--;
                        var70.field2148 = field720[var5] == 1;
                        continue;
                    }
                    if (var494 == 1303) {
                        var5--;
                        var70.field2126 = field720[var5];
                        continue;
                    }
                    if (var494 == 1304) {
                        var5--;
                        var70.field2147 = field720[var5];
                        continue;
                    }
                    if (var494 == 1305) {
                        var6--;
                        var70.field2151 = field723[var6];
                        continue;
                    }
                    if (var494 == 1306) {
                        var6--;
                        var70.field2149 = field723[var6];
                        continue;
                    }
                    if (var494 == 1307) {
                        var70.field2160 = null;
                        continue;
                    }
                }
                if (var494 < 5400) {
                    if (var494 == 5306) {
                        field720[var5++] = client.method1932();
                        continue;
                    }
                    if (var494 == 5307) {
                        var5--;
                        int var471 = field720[var5];
                        if (var471 == 1 || var471 == 2) {
                            client.method195(var471);
                        }
                        continue;
                    }
                    if (var494 == 5308) {
                        field720[var5++] = Statics.field1344.field693;
                        continue;
                    }
                    if (var494 == 5309) {
                        var5--;
                        int var472 = field720[var5];
                        if (var472 == 1 || var472 == 2) {
                            Statics.field1344.field693 = var472;
                            class31.method43();
                        }
                        continue;
                    }
                }
                if (var494 < 5600) {
                    if (var494 == 5504) {
                        var5 -= 2;
                        int var473 = field720[var5];
                        int var474 = field720[var5 + 1];
                        if (!client.field534) {
                            client.field535 = var473;
                            client.field373 = var474;
                        }
                        continue;
                    }
                    if (var494 == 5505) {
                        field720[var5++] = client.field535;
                        continue;
                    }
                    if (var494 == 5506) {
                        field720[var5++] = client.field373;
                        continue;
                    }
                    if (var494 == 5530) {
                        var5--;
                        int var475 = field720[var5];
                        if (var475 < 0) {
                            var475 = 0;
                        }
                        client.field378 = var475;
                        continue;
                    }
                    if (var494 == 5531) {
                        field720[var5++] = client.field378;
                        continue;
                    }
                }
                if (var494 >= 5700 || var494 != 5630) {
                    if (var494 < 6300) {
                        if (var494 == 6200) {
                            var5 -= 2;
                            client.field540 = (short) field720[var5];
                            if (client.field540 <= 0) {
                                client.field540 = 256;
                            }
                            client.field457 = (short) field720[var5 + 1];
                            if (client.field457 <= 0) {
                                client.field457 = 205;
                            }
                            continue;
                        }
                        if (var494 == 6201) {
                            var5 -= 2;
                            client.field542 = (short) field720[var5];
                            if (client.field542 <= 0) {
                                client.field542 = 256;
                            }
                            client.field459 = (short) field720[var5 + 1];
                            if (client.field459 <= 0) {
                                client.field459 = 320;
                            }
                            continue;
                        }
                        if (var494 == 6202) {
                            var5 -= 4;
                            client.field544 = (short) field720[var5];
                            if (client.field544 <= 0) {
                                client.field544 = 1;
                            }
                            client.field541 = (short) field720[var5 + 1];
                            if (client.field541 <= 0) {
                                client.field541 = 32767;
                            } else if (client.field541 < client.field544) {
                                client.field541 = client.field544;
                            }
                            client.field546 = (short) field720[var5 + 2];
                            if (client.field546 <= 0) {
                                client.field546 = 1;
                            }
                            client.field547 = (short) field720[var5 + 3];
                            if (client.field547 <= 0) {
                                client.field547 = 32767;
                            } else if (client.field547 < client.field546) {
                                client.field547 = client.field546;
                            }
                            continue;
                        }
                        if (var494 == 6203) {
                            if (client.field458 == null) {
                                field720[var5++] = -1;
                                field720[var5++] = -1;
                            } else {
                                client.method202(0, 0, client.field458.field2110, client.field458.field2086, false);
                                field720[var5++] = client.field539;
                                field720[var5++] = client.field287;
                            }
                            continue;
                        }
                        if (var494 == 6204) {
                            field720[var5++] = client.field542;
                            field720[var5++] = client.field459;
                            continue;
                        }
                        if (var494 == 6205) {
                            field720[var5++] = client.field540;
                            field720[var5++] = client.field457;
                            continue;
                        }
                    }
                    if (var494 < 6600) {
                        if (var494 == 6500) {
                            field720[var5++] = class30.method1481() ? 1 : 0;
                            continue;
                        }
                        if (var494 == 6501) {
                            class30.field674 = 0;
                            class30 var476;
                            if (class30.field674 < class30.field673) {
                                var476 = Statics.field681[++class30.field674 - 1];
                            } else {
                                var476 = null;
                            }
                            if (var476 == null) {
                                field720[var5++] = -1;
                                field720[var5++] = 0;
                                field723[var6++] = "";
                                field720[var5++] = 0;
                                field720[var5++] = 0;
                                field723[var6++] = "";
                            } else {
                                field720[var5++] = var476.field677;
                                field720[var5++] = var476.field678;
                                field723[var6++] = var476.field668;
                                field720[var5++] = var476.field672;
                                field720[var5++] = var476.field679;
                                field723[var6++] = var476.field680;
                            }
                            continue;
                        }
                        if (var494 == 6502) {
                            class30 var479;
                            if (class30.field674 < class30.field673) {
                                var479 = Statics.field681[++class30.field674 - 1];
                            } else {
                                var479 = null;
                            }
                            if (var479 == null) {
                                field720[var5++] = -1;
                                field720[var5++] = 0;
                                field723[var6++] = "";
                                field720[var5++] = 0;
                                field720[var5++] = 0;
                                field723[var6++] = "";
                            } else {
                                field720[var5++] = var479.field677;
                                field720[var5++] = var479.field678;
                                field723[var6++] = var479.field668;
                                field720[var5++] = var479.field672;
                                field720[var5++] = var479.field679;
                                field723[var6++] = var479.field680;
                            }
                            continue;
                        }
                        if (var494 == 6506) {
                            var5--;
                            int var481 = field720[var5];
                            class30 var482 = null;
                            for (int var483 = 0; var483 < class30.field673; var483++) {
                                if (Statics.field681[var483].field677 == var481) {
                                    var482 = Statics.field681[var483];
                                    break;
                                }
                            }
                            if (var482 == null) {
                                field720[var5++] = -1;
                                field720[var5++] = 0;
                                field723[var6++] = "";
                                field720[var5++] = 0;
                                field720[var5++] = 0;
                                field723[var6++] = "";
                            } else {
                                field720[var5++] = var482.field677;
                                field720[var5++] = var482.field678;
                                field723[var6++] = var482.field668;
                                field720[var5++] = var482.field672;
                                field720[var5++] = var482.field679;
                                field723[var6++] = var482.field680;
                            }
                            continue;
                        }
                        if (var494 == 6507) {
                            var5 -= 4;
                            int var484 = field720[var5];
                            boolean var485 = field720[var5 + 1] == 1;
                            int var486 = field720[var5 + 2];
                            boolean var487 = field720[var5 + 3] == 1;
                            if (Statics.field681 != null) {
                                class30.method614(0, Statics.field681.length - 1, var484, var485, var486, var487);
                            }
                            continue;
                        }
                        if (var494 == 6511) {
                            var5--;
                            int var488 = field720[var5];
                            if (var488 >= 0 && var488 < class30.field673) {
                                class30 var489 = Statics.field681[var488];
                                field720[var5++] = var489.field677;
                                field720[var5++] = var489.field678;
                                field723[var6++] = var489.field668;
                                field720[var5++] = var489.field672;
                                field720[var5++] = var489.field679;
                                field723[var6++] = var489.field680;
                                continue;
                            }
                            field720[var5++] = -1;
                            field720[var5++] = 0;
                            field723[var6++] = "";
                            field720[var5++] = 0;
                            field720[var5++] = 0;
                            field723[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field406 = 250;
            }
        } catch (Exception var493) {
            StringBuilder var491 = new StringBuilder(30);
            var491.append("").append(var4.field1879).append(" ");
            for (int var492 = field722 - 1; var492 >= 0; var492--) {
                var491.append("").append(field726[var492].field95.field1879).append(" ");
            }
            var491.append("").append(var10);
            class102.method755(var491.toString(), var493);
        }
    }

    @ObfuscatedName("p.d(II)V")
    public static void method104(int arg0) {
        if (arg0 == -1 || !class151.method1075(arg0)) {
            return;
        }
        class151[] var1 = Statics.field2173[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class151 var3 = var1[var2];
            if (var3.field2164 != null) {
                class19 var4 = new class19();
                var4.field193 = var3;
                var4.field197 = var3.field2164;
                method3007(var4, 2000000);
            }
        }
    }
}
