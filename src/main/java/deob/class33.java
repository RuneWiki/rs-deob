package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ao")
public class class33 {

    @ObfuscatedName("ao.h")
    public static int[] field727 = new int[5];

    @ObfuscatedName("ao.v")
    public static int[][] field739 = new int[5][5000];

    @ObfuscatedName("ao.l")
    public static int[] field733 = new int[1000];

    @ObfuscatedName("ao.c")
    public static String[] field729 = new String[1000];

    @ObfuscatedName("ao.u")
    public static int field735 = 0;

    @ObfuscatedName("ao.k")
    public static class12[] field736 = new class12[50];

    @ObfuscatedName("ao.j")
    public static Calendar field738 = Calendar.getInstance();

    @ObfuscatedName("ao.f")
    public static final String[] field730 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ao.p")
    public static int field734 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.o(Ld;I)V")
    public static void method166(class19 arg0) {
        method163(arg0, 200000);
    }

    @ObfuscatedName("j.m(Ld;IB)V")
    public static void method163(class19 arg0, int arg1) {
        Object[] var2 = arg0.field204;
        int var3 = (Integer) var2[0];
        class49 var4 = Statics.method146(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field951;
        int[] var9 = var4.field949;
        byte var10 = -1;
        field735 = 0;
        try {
            Statics.field740 = new int[var4.field953];
            int var11 = 0;
            Statics.field732 = new String[var4.field948];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field196;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field195;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field194 == null ? -1 : arg0.field194.field2208;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field198;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field194 == null ? -1 : arg0.field194.field2209;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field199 == null ? -1 : arg0.field199.field2208;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field199 == null ? -1 : arg0.field199.field2209;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field200;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field201;
                    }
                    Statics.field740[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field202;
                    }
                    Statics.field732[var12++] = var15;
                }
            }
            int var16 = 0;
            field734 = arg0.field203;
            label3232: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var489 = var8[var7];
                if (var489 < 100) {
                    if (var489 == 0) {
                        field733[var5++] = var9[var7];
                        continue;
                    }
                    if (var489 == 1) {
                        int var17 = var9[var7];
                        field733[var5++] = class166.field2174[var17];
                        continue;
                    }
                    if (var489 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class166.field2174[var18] = field733[var5];
                        client.method144(var18);
                        continue;
                    }
                    if (var489 == 3) {
                        field729[var6++] = var4.field950[var7];
                        continue;
                    }
                    if (var489 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var489 == 7) {
                        var5 -= 2;
                        if (field733[var5 + 1] != field733[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var489 == 8) {
                        var5 -= 2;
                        if (field733[var5 + 1] == field733[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var489 == 9) {
                        var5 -= 2;
                        if (field733[var5] < field733[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var489 == 10) {
                        var5 -= 2;
                        if (field733[var5] > field733[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var489 == 21) {
                        if (field735 == 0) {
                            return;
                        }
                        class12 var19 = field736[--field735];
                        var4 = var19.field114;
                        var8 = var4.field951;
                        var9 = var4.field949;
                        var7 = var19.field110;
                        Statics.field740 = var19.field111;
                        Statics.field732 = var19.field112;
                        continue;
                    }
                    if (var489 == 25) {
                        int var20 = var9[var7];
                        field733[var5++] = class166.method162(var20);
                        continue;
                    }
                    if (var489 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field733[var5];
                        class195 var23 = (class195) class195.field2848.method2130((long) var21);
                        class195 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field2852.method3012(14, var21);
                            class195 var26 = new class195();
                            if (var25 != null) {
                                var26.method3253(new class154(var25));
                            }
                            class195.field2848.method2132(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field2851;
                        int var29 = var24.field2850;
                        int var30 = var24.field2847;
                        int var31 = class166.field2177[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class166.field2174[var28] = class166.field2174[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var489 == 31) {
                        var5 -= 2;
                        if (field733[var5] <= field733[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var489 == 32) {
                        var5 -= 2;
                        if (field733[var5] >= field733[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var489 == 33) {
                        field733[var5++] = Statics.field740[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var489 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field740[var10001] = field733[var5];
                        continue;
                    }
                    if (var489 == 35) {
                        field729[var6++] = Statics.field732[var9[var7]];
                        continue;
                    }
                    if (var489 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field732[var10001] = field729[var6];
                        continue;
                    }
                    if (var489 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class208.method84(field729, var6, var33);
                        field729[var6++] = var34;
                        continue;
                    }
                    if (var489 == 38) {
                        var5--;
                        continue;
                    }
                    if (var489 == 39) {
                        var6--;
                        continue;
                    }
                    if (var489 == 40) {
                        int var35 = var9[var7];
                        class49 var36 = Statics.method146(var35);
                        int[] var37 = new int[var36.field953];
                        String[] var38 = new String[var36.field948];
                        for (int var39 = 0; var39 < var36.field952; var39++) {
                            var37[var39] = field733[var5 - var36.field952 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field954; var40++) {
                            var38[var40] = field729[var6 - var36.field954 + var40];
                        }
                        var5 -= var36.field952;
                        var6 -= var36.field954;
                        class12 var41 = new class12();
                        var41.field114 = var4;
                        var41.field110 = var7;
                        var41.field111 = Statics.field740;
                        var41.field112 = Statics.field732;
                        field736[++field735 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field951;
                        var9 = var36.field949;
                        var7 = -1;
                        Statics.field740 = var37;
                        Statics.field732 = var38;
                        continue;
                    }
                    if (var489 == 42) {
                        field733[var5++] = Statics.field1745.method808(var9[var7]);
                        continue;
                    }
                    if (var489 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1745.method822(var10001, field733[var5]);
                        continue;
                    }
                    if (var489 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field733[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field727[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label3232;
                                }
                                field739[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var489 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field733[var5];
                        if (var48 >= 0 && var48 < field727[var47]) {
                            field733[var5++] = field739[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var489 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field733[var5];
                        if (var50 >= 0 && var50 < field727[var49]) {
                            field739[var49][var50] = field733[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var489 == 47) {
                        String var51 = Statics.field1745.method810(var9[var7]);
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field729[var6++] = var51;
                        continue;
                    }
                    if (var489 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1745.method820(var10001, field729[var6]);
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var489 < 1000) {
                    if (var489 == 100) {
                        var5 -= 3;
                        int var53 = field733[var5];
                        int var54 = field733[var5 + 1];
                        int var55 = field733[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class170 var56 = class170.method2993(var53);
                        if (var56.field2332 == null) {
                            var56.field2332 = new class170[var55 + 1];
                        }
                        if (var56.field2332.length <= var55) {
                            class170[] var57 = new class170[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2332.length; var58++) {
                                var57[var58] = var56.field2332[var58];
                            }
                            var56.field2332 = var57;
                        }
                        if (var55 > 0 && var56.field2332[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class170 var59 = new class170();
                        var59.field2210 = var54;
                        var59.field2232 = var59.field2208 = var56.field2208;
                        var59.field2209 = var55;
                        var59.field2205 = true;
                        var56.field2332[var55] = var59;
                        if (var52) {
                            Statics.field737 = var59;
                        } else {
                            Statics.field2061 = var59;
                        }
                        client.method1786(var56);
                        continue;
                    }
                    if (var489 == 101) {
                        class170 var60 = var52 ? Statics.field737 : Statics.field2061;
                        class170 var61 = class170.method2993(var60.field2208);
                        var61.field2332[var60.field2209] = null;
                        client.method1786(var61);
                        continue;
                    }
                    if (var489 == 102) {
                        var5--;
                        class170 var62 = class170.method2993(field733[var5]);
                        var62.field2332 = null;
                        client.method1786(var62);
                        continue;
                    }
                    if (var489 == 200) {
                        var5 -= 2;
                        int var63 = field733[var5];
                        int var64 = field733[var5 + 1];
                        class170 var65 = class170.method2271(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field733[var5++] = 1;
                            if (var52) {
                                Statics.field737 = var65;
                            } else {
                                Statics.field2061 = var65;
                            }
                            continue;
                        }
                        field733[var5++] = 0;
                        continue;
                    }
                    if (var489 == 201) {
                        var5--;
                        class170 var66 = class170.method2993(field733[var5]);
                        if (var66 == null) {
                            field733[var5++] = 0;
                        } else {
                            field733[var5++] = 1;
                            if (var52) {
                                Statics.field737 = var66;
                            } else {
                                Statics.field2061 = var66;
                            }
                        }
                        continue;
                    }
                } else if (var489 >= 1000 && var489 < 1100 || var489 >= 2000 && var489 < 2100) {
                    int var67 = -1;
                    class170 var68;
                    if (var489 >= 2000) {
                        var489 -= 1000;
                        var5--;
                        var67 = field733[var5];
                        var68 = class170.method2993(var67);
                    } else {
                        var68 = var52 ? Statics.field737 : Statics.field2061;
                    }
                    if (var489 == 1000) {
                        var5 -= 4;
                        var68.field2217 = field733[var5];
                        var68.field2218 = field733[var5 + 1];
                        var68.field2213 = field733[var5 + 2];
                        var68.field2237 = field733[var5 + 3];
                        client.method1786(var68);
                        client.method95(var68);
                        if (var67 != -1 && var68.field2210 == 0) {
                            client.method1754(Statics.field2257[var67 >> 16], var68, false);
                        }
                        continue;
                    }
                    if (var489 == 1001) {
                        var5 -= 4;
                        var68.field2219 = field733[var5];
                        var68.field2216 = field733[var5 + 1];
                        var68.field2215 = field733[var5 + 2];
                        var68.field2254 = field733[var5 + 3];
                        client.method1786(var68);
                        client.method95(var68);
                        if (var67 != -1 && var68.field2210 == 0) {
                            client.method1754(Statics.field2257[var67 >> 16], var68, false);
                        }
                        continue;
                    }
                    if (var489 == 1003) {
                        var5--;
                        boolean var69 = field733[var5] == 1;
                        if (var68.field2228 != var69) {
                            var68.field2228 = var69;
                            client.method1786(var68);
                        }
                        continue;
                    }
                    if (var489 == 1005) {
                        var5--;
                        var68.field2341 = field733[var5] == 1;
                        continue;
                    }
                    if (var489 == 1006) {
                        var5--;
                        var68.field2300 = field733[var5] == 1;
                        continue;
                    }
                } else if (var489 >= 1100 && var489 < 1200 || var489 >= 2100 && var489 < 2200) {
                    int var70 = -1;
                    class170 var71;
                    if (var489 >= 2000) {
                        var489 -= 1000;
                        var5--;
                        var70 = field733[var5];
                        var71 = class170.method2993(var70);
                    } else {
                        var71 = var52 ? Statics.field737 : Statics.field2061;
                    }
                    if (var489 == 1100) {
                        var5 -= 2;
                        var71.field2229 = field733[var5];
                        if (var71.field2229 > var71.field2329 - var71.field2223) {
                            var71.field2229 = var71.field2329 - var71.field2223;
                        }
                        if (var71.field2229 < 0) {
                            var71.field2229 = 0;
                        }
                        var71.field2230 = field733[var5 + 1];
                        if (var71.field2230 > var71.field2203 - var71.field2224) {
                            var71.field2230 = var71.field2203 - var71.field2224;
                        }
                        if (var71.field2230 < 0) {
                            var71.field2230 = 0;
                        }
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1101) {
                        var5--;
                        var71.field2309 = field733[var5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1102) {
                        var5--;
                        var71.field2301 = field733[var5] == 1;
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1103) {
                        var5--;
                        var71.field2239 = field733[var5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1104) {
                        var5--;
                        var71.field2312 = field733[var5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1105) {
                        var5--;
                        var71.field2243 = field733[var5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1106) {
                        var5--;
                        var71.field2245 = field733[var5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1107) {
                        var5--;
                        var71.field2246 = field733[var5] == 1;
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1108) {
                        var71.field2251 = 1;
                        var5--;
                        var71.field2204 = field733[var5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1109) {
                        var5 -= 6;
                        var71.field2292 = field733[var5];
                        var71.field2258 = field733[var5 + 1];
                        var71.field2259 = field733[var5 + 2];
                        var71.field2260 = field733[var5 + 3];
                        var71.field2266 = field733[var5 + 4];
                        var71.field2262 = field733[var5 + 5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1110) {
                        var5--;
                        int var72 = field733[var5];
                        if (var71.field2255 != var72) {
                            var71.field2255 = var72;
                            var71.field2330 = 0;
                            var71.field2227 = 0;
                            client.method1786(var71);
                        }
                        continue;
                    }
                    if (var489 == 1111) {
                        var5--;
                        var71.field2342 = field733[var5] == 1;
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1112) {
                        var6--;
                        String var73 = field729[var6];
                        if (!var73.equals(var71.field2268)) {
                            var71.field2268 = var73;
                            client.method1786(var71);
                        }
                        continue;
                    }
                    if (var489 == 1113) {
                        var5--;
                        var71.field2267 = field733[var5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1114) {
                        var5 -= 3;
                        var71.field2271 = field733[var5];
                        var71.field2272 = field733[var5 + 1];
                        var71.field2211 = field733[var5 + 2];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1115) {
                        var5--;
                        var71.field2206 = field733[var5] == 1;
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1116) {
                        var5--;
                        var71.field2247 = field733[var5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1117) {
                        var5--;
                        var71.field2248 = field733[var5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1118) {
                        var5--;
                        var71.field2249 = field733[var5] == 1;
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1119) {
                        var5--;
                        var71.field2250 = field733[var5] == 1;
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1120) {
                        var5 -= 2;
                        var71.field2329 = field733[var5];
                        var71.field2203 = field733[var5 + 1];
                        client.method1786(var71);
                        if (var70 != -1 && var71.field2210 == 0) {
                            client.method1754(Statics.field2257[var70 >> 16], var71, false);
                        }
                        continue;
                    }
                    if (var489 == 1121) {
                        int var74 = var71.field2208;
                        int var75 = var71.field2209;
                        client.field331.method2782(53);
                        client.field331.method2748(var75);
                        client.field331.method2617(var74);
                        client.field449 = var71;
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1122) {
                        var5--;
                        var71.field2244 = field733[var5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1123) {
                        var5--;
                        var71.field2234 = field733[var5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1124) {
                        var5--;
                        var71.field2200 = field733[var5];
                        client.method1786(var71);
                        continue;
                    }
                    if (var489 == 1125) {
                        var5--;
                        int var76 = field733[var5];
                        class222[] var77 = new class222[] { class222.field3187, class222.field3185, class222.field3183, class222.field3186, class222.field3189 };
                        class222 var78 = (class222) class149.method1314(var77, var76);
                        if (var78 != null) {
                            var71.field2242 = var78;
                            client.method1786(var71);
                        }
                        continue;
                    }
                } else if (var489 >= 1200 && var489 < 1300 || var489 >= 2200 && var489 < 2300) {
                    class170 var79;
                    if (var489 >= 2000) {
                        var489 -= 1000;
                        var5--;
                        var79 = class170.method2993(field733[var5]);
                    } else {
                        var79 = var52 ? Statics.field737 : Statics.field2061;
                    }
                    client.method1786(var79);
                    if (var489 == 1200 || var489 == 1205 || var489 == 1212) {
                        var5 -= 2;
                        int var80 = field733[var5];
                        int var81 = field733[var5 + 1];
                        var79.field2328 = var80;
                        var79.field2265 = var81;
                        class199 var82 = class199.method2268(var80);
                        var79.field2259 = var82.field2974;
                        var79.field2260 = var82.field2978;
                        var79.field2266 = var82.field2943;
                        var79.field2292 = var82.field2959;
                        var79.field2258 = var82.field2960;
                        var79.field2262 = var82.field2955;
                        if (var489 == 1205) {
                            var79.field2212 = 0;
                        } else if (var489 == 1212 | var82.field2961 == 1) {
                            var79.field2212 = 1;
                        } else {
                            var79.field2212 = 2;
                        }
                        if (var79.field2253 > 0) {
                            var79.field2262 = var79.field2262 * 32 / var79.field2253;
                        } else if (var79.field2219 > 0) {
                            var79.field2262 = var79.field2262 * 32 / var79.field2219;
                        }
                        continue;
                    }
                    if (var489 == 1201) {
                        var79.field2251 = 2;
                        var5--;
                        var79.field2204 = field733[var5];
                        continue;
                    }
                    if (var489 == 1202) {
                        var79.field2251 = 3;
                        var79.field2204 = Statics.field43.field254.method2876();
                        continue;
                    }
                } else if (var489 >= 1300 && var489 < 1400 || var489 >= 2300 && var489 < 2400) {
                    class170 var83;
                    if (var489 >= 2000) {
                        var489 -= 1000;
                        var5--;
                        var83 = class170.method2993(field733[var5]);
                    } else {
                        var83 = var52 ? Statics.field737 : Statics.field2061;
                    }
                    if (var489 == 1300) {
                        var5--;
                        int var84 = field733[var5] - 1;
                        if (var84 >= 0 && var84 <= 9) {
                            var6--;
                            var83.method2930(var84, field729[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var489 == 1301) {
                        var5 -= 2;
                        int var85 = field733[var5];
                        int var86 = field733[var5 + 1];
                        var83.field2283 = class170.method2271(var85, var86);
                        continue;
                    }
                    if (var489 == 1302) {
                        var5--;
                        var83.field2286 = field733[var5] == 1;
                        continue;
                    }
                    if (var489 == 1303) {
                        var5--;
                        var83.field2284 = field733[var5];
                        continue;
                    }
                    if (var489 == 1304) {
                        var5--;
                        var83.field2303 = field733[var5];
                        continue;
                    }
                    if (var489 == 1305) {
                        var6--;
                        var83.field2281 = field729[var6];
                        continue;
                    }
                    if (var489 == 1306) {
                        var6--;
                        var83.field2287 = field729[var6];
                        continue;
                    }
                    if (var489 == 1307) {
                        var83.field2282 = null;
                        continue;
                    }
                } else {
                    if (var489 >= 1400 && var489 < 1500 || var489 >= 2400 && var489 < 2500) {
                        class170 var87;
                        if (var489 >= 2000) {
                            var489 -= 1000;
                            var5--;
                            var87 = class170.method2993(field733[var5]);
                        } else {
                            var87 = var52 ? Statics.field737 : Statics.field2061;
                        }
                        var6--;
                        String var88 = field729[var6];
                        int[] var89 = null;
                        if (var88.length() > 0 && var88.charAt(var88.length() - 1) == 'Y') {
                            var5--;
                            int var90 = field733[var5];
                            if (var90 > 0) {
                                var89 = new int[var90];
                                while (var90-- > 0) {
                                    var5--;
                                    var89[var90] = field733[var5];
                                }
                            }
                            var88 = var88.substring(0, var88.length() - 1);
                        }
                        Object[] var91 = new Object[var88.length() + 1];
                        for (int var92 = var91.length - 1; var92 >= 1; var92--) {
                            if (var88.charAt(var92 - 1) == 's') {
                                var6--;
                                var91[var92] = field729[var6];
                            } else {
                                var5--;
                                var91[var92] = Integer.valueOf(field733[var5]);
                            }
                        }
                        var5--;
                        int var93 = field733[var5];
                        if (var93 == -1) {
                            var91 = null;
                        } else {
                            var91[0] = Integer.valueOf(var93);
                        }
                        if (var489 == 1400) {
                            var87.field2290 = var91;
                        }
                        if (var489 == 1401) {
                            var87.field2293 = var91;
                        }
                        if (var489 == 1402) {
                            var87.field2214 = var91;
                        }
                        if (var489 == 1403) {
                            var87.field2294 = var91;
                        }
                        if (var489 == 1404) {
                            var87.field2238 = var91;
                        }
                        if (var489 == 1405) {
                            var87.field2297 = var91;
                        }
                        if (var489 == 1406) {
                            var87.field2252 = var91;
                        }
                        if (var489 == 1407) {
                            var87.field2291 = var91;
                            var87.field2302 = var89;
                        }
                        if (var489 == 1408) {
                            var87.field2307 = var91;
                        }
                        if (var489 == 1409) {
                            var87.field2308 = var91;
                        }
                        if (var489 == 1410) {
                            var87.field2298 = var91;
                        }
                        if (var489 == 1411) {
                            var87.field2280 = var91;
                        }
                        if (var489 == 1412) {
                            var87.field2273 = var91;
                        }
                        if (var489 == 1414) {
                            var87.field2304 = var91;
                            var87.field2277 = var89;
                        }
                        if (var489 == 1415) {
                            var87.field2305 = var91;
                            var87.field2306 = var89;
                        }
                        if (var489 == 1416) {
                            var87.field2299 = var91;
                        }
                        if (var489 == 1417) {
                            var87.field2296 = var91;
                        }
                        if (var489 == 1418) {
                            var87.field2310 = var91;
                        }
                        if (var489 == 1419) {
                            var87.field2275 = var91;
                        }
                        if (var489 == 1420) {
                            var87.field2318 = var91;
                        }
                        if (var489 == 1421) {
                            var87.field2313 = var91;
                        }
                        if (var489 == 1422) {
                            var87.field2314 = var91;
                        }
                        if (var489 == 1423) {
                            var87.field2315 = var91;
                        }
                        if (var489 == 1424) {
                            var87.field2256 = var91;
                        }
                        if (var489 == 1425) {
                            var87.field2311 = var91;
                        }
                        if (var489 == 1426) {
                            var87.field2319 = var91;
                        }
                        if (var489 == 1427) {
                            var87.field2317 = var91;
                        }
                        var87.field2288 = true;
                        continue;
                    }
                    if (var489 < 1600) {
                        class170 var94 = var52 ? Statics.field737 : Statics.field2061;
                        if (var489 == 1500) {
                            field733[var5++] = var94.field2331;
                            continue;
                        }
                        if (var489 == 1501) {
                            field733[var5++] = var94.field2222;
                            continue;
                        }
                        if (var489 == 1502) {
                            field733[var5++] = var94.field2223;
                            continue;
                        }
                        if (var489 == 1503) {
                            field733[var5++] = var94.field2224;
                            continue;
                        }
                        if (var489 == 1504) {
                            field733[var5++] = var94.field2228 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 1505) {
                            field733[var5++] = var94.field2232;
                            continue;
                        }
                    } else if (var489 < 1700) {
                        class170 var95 = var52 ? Statics.field737 : Statics.field2061;
                        if (var489 == 1600) {
                            field733[var5++] = var95.field2229;
                            continue;
                        }
                        if (var489 == 1601) {
                            field733[var5++] = var95.field2230;
                            continue;
                        }
                        if (var489 == 1602) {
                            field729[var6++] = var95.field2268;
                            continue;
                        }
                        if (var489 == 1603) {
                            field733[var5++] = var95.field2329;
                            continue;
                        }
                        if (var489 == 1604) {
                            field733[var5++] = var95.field2203;
                            continue;
                        }
                        if (var489 == 1605) {
                            field733[var5++] = var95.field2262;
                            continue;
                        }
                        if (var489 == 1606) {
                            field733[var5++] = var95.field2259;
                            continue;
                        }
                        if (var489 == 1607) {
                            field733[var5++] = var95.field2266;
                            continue;
                        }
                        if (var489 == 1608) {
                            field733[var5++] = var95.field2260;
                            continue;
                        }
                        if (var489 == 1609) {
                            field733[var5++] = var95.field2239;
                            continue;
                        }
                        if (var489 == 1610) {
                            field733[var5++] = var95.field2200;
                            continue;
                        }
                        if (var489 == 1611) {
                            field733[var5++] = var95.field2309;
                            continue;
                        }
                        if (var489 == 1612) {
                            field733[var5++] = var95.field2234;
                            continue;
                        }
                        if (var489 == 1613) {
                            field733[var5++] = var95.field2242.method721();
                            continue;
                        }
                    } else if (var489 < 1800) {
                        class170 var96 = var52 ? Statics.field737 : Statics.field2061;
                        if (var489 == 1700) {
                            field733[var5++] = var96.field2328;
                            continue;
                        }
                        if (var489 == 1701) {
                            if (var96.field2328 == -1) {
                                field733[var5++] = 0;
                            } else {
                                field733[var5++] = var96.field2265;
                            }
                            continue;
                        }
                        if (var489 == 1702) {
                            field733[var5++] = var96.field2209;
                            continue;
                        }
                    } else if (var489 < 1900) {
                        class170 var97 = var52 ? Statics.field737 : Statics.field2061;
                        if (var489 == 1800) {
                            int[] var98 = field733;
                            int var99 = var5++;
                            int var100 = client.method3671(var97);
                            int var101 = var100 >> 11 & 0x3F;
                            var98[var99] = var101;
                            continue;
                        }
                        if (var489 == 1801) {
                            var5--;
                            int var102 = field733[var5];
                            int var490 = var102 - 1;
                            if (var97.field2282 != null && var490 < var97.field2282.length && var97.field2282[var490] != null) {
                                field729[var6++] = var97.field2282[var490];
                                continue;
                            }
                            field729[var6++] = "";
                            continue;
                        }
                        if (var489 == 1802) {
                            if (var97.field2281 == null) {
                                field729[var6++] = "";
                            } else {
                                field729[var6++] = var97.field2281;
                            }
                            continue;
                        }
                    } else if (var489 >= 1900 && var489 < 2000 || var489 >= 2900 && var489 < 3000) {
                        class170 var103;
                        if (var489 >= 2000) {
                            var489 -= 1000;
                            var5--;
                            var103 = class170.method2993(field733[var5]);
                        } else {
                            var103 = var52 ? Statics.field737 : Statics.field2061;
                        }
                        if (var489 == 1927) {
                            if (field734 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var103.field2317 == null) {
                                return;
                            }
                            class19 var104 = new class19();
                            var104.field194 = var103;
                            var104.field204 = var103.field2317;
                            var104.field203 = field734 + 1;
                            client.field484.method2213(arg0);
                            continue;
                        }
                    } else if (var489 < 2600) {
                        var5--;
                        class170 var105 = class170.method2993(field733[var5]);
                        if (var489 == 2500) {
                            field733[var5++] = var105.field2331;
                            continue;
                        }
                        if (var489 == 2501) {
                            field733[var5++] = var105.field2222;
                            continue;
                        }
                        if (var489 == 2502) {
                            field733[var5++] = var105.field2223;
                            continue;
                        }
                        if (var489 == 2503) {
                            field733[var5++] = var105.field2224;
                            continue;
                        }
                        if (var489 == 2504) {
                            field733[var5++] = var105.field2228 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 2505) {
                            field733[var5++] = var105.field2232;
                            continue;
                        }
                    } else if (var489 < 2700) {
                        var5--;
                        class170 var106 = class170.method2993(field733[var5]);
                        if (var489 == 2600) {
                            field733[var5++] = var106.field2229;
                            continue;
                        }
                        if (var489 == 2601) {
                            field733[var5++] = var106.field2230;
                            continue;
                        }
                        if (var489 == 2602) {
                            field729[var6++] = var106.field2268;
                            continue;
                        }
                        if (var489 == 2603) {
                            field733[var5++] = var106.field2329;
                            continue;
                        }
                        if (var489 == 2604) {
                            field733[var5++] = var106.field2203;
                            continue;
                        }
                        if (var489 == 2605) {
                            field733[var5++] = var106.field2262;
                            continue;
                        }
                        if (var489 == 2606) {
                            field733[var5++] = var106.field2259;
                            continue;
                        }
                        if (var489 == 2607) {
                            field733[var5++] = var106.field2266;
                            continue;
                        }
                        if (var489 == 2608) {
                            field733[var5++] = var106.field2260;
                            continue;
                        }
                        if (var489 == 2609) {
                            field733[var5++] = var106.field2239;
                            continue;
                        }
                        if (var489 == 2610) {
                            field733[var5++] = var106.field2200;
                            continue;
                        }
                        if (var489 == 2611) {
                            field733[var5++] = var106.field2309;
                            continue;
                        }
                        if (var489 == 2612) {
                            field733[var5++] = var106.field2234;
                            continue;
                        }
                        if (var489 == 2613) {
                            field733[var5++] = var106.field2242.method721();
                            continue;
                        }
                    } else if (var489 < 2800) {
                        if (var489 == 2700) {
                            var5--;
                            class170 var107 = class170.method2993(field733[var5]);
                            field733[var5++] = var107.field2328;
                            continue;
                        }
                        if (var489 == 2701) {
                            var5--;
                            class170 var108 = class170.method2993(field733[var5]);
                            if (var108.field2328 == -1) {
                                field733[var5++] = 0;
                            } else {
                                field733[var5++] = var108.field2265;
                            }
                            continue;
                        }
                        if (var489 == 2702) {
                            var5--;
                            int var109 = field733[var5];
                            class18 var110 = (class18) client.field419.method2151((long) var109);
                            if (var110 == null) {
                                field733[var5++] = 0;
                            } else {
                                field733[var5++] = 1;
                            }
                            continue;
                        }
                        if (var489 == 2706) {
                            field733[var5++] = client.field445;
                            continue;
                        }
                    } else if (var489 < 2900) {
                        var5--;
                        class170 var111 = class170.method2993(field733[var5]);
                        if (var489 == 2800) {
                            int[] var112 = field733;
                            int var113 = var5++;
                            int var114 = client.method3671(var111);
                            int var115 = var114 >> 11 & 0x3F;
                            var112[var113] = var115;
                            continue;
                        }
                        if (var489 == 2801) {
                            var5--;
                            int var116 = field733[var5];
                            int var491 = var116 - 1;
                            if (var111.field2282 != null && var491 < var111.field2282.length && var111.field2282[var491] != null) {
                                field729[var6++] = var111.field2282[var491];
                                continue;
                            }
                            field729[var6++] = "";
                            continue;
                        }
                        if (var489 == 2802) {
                            if (var111.field2281 == null) {
                                field729[var6++] = "";
                            } else {
                                field729[var6++] = var111.field2281;
                            }
                            continue;
                        }
                    } else if (var489 < 3200) {
                        if (var489 == 3100) {
                            var6--;
                            String var117 = field729[var6];
                            class48.method184(0, "", var117);
                            continue;
                        }
                        if (var489 == 3101) {
                            var5 -= 2;
                            client.method644(Statics.field43, field733[var5], field733[var5 + 1]);
                            continue;
                        }
                        if (var489 == 3103) {
                            client.field331.method2782(237);
                            for (class18 var118 = (class18) client.field419.method2148(); var118 != null; var118 = (class18) client.field419.method2152()) {
                                if (var118.field192 == 0 || var118.field192 == 3) {
                                    client.method768(var118, true);
                                }
                            }
                            if (client.field449 != null) {
                                client.method1786(client.field449);
                                client.field449 = null;
                            }
                            continue;
                        }
                        if (var489 == 3104) {
                            var6--;
                            String var119 = field729[var6];
                            int var120 = 0;
                            if (class208.method1444(var119)) {
                                var120 = class208.method1327(var119);
                            }
                            client.field331.method2782(205);
                            client.field331.method2540(var120);
                            continue;
                        }
                        if (var489 == 3105) {
                            var6--;
                            String var121 = field729[var6];
                            client.field331.method2782(209);
                            client.field331.method2641(var121.length() + 1);
                            client.field331.method2543(var121);
                            continue;
                        }
                        if (var489 == 3106) {
                            var6--;
                            String var122 = field729[var6];
                            client.field331.method2782(5);
                            client.field331.method2641(var122.length() + 1);
                            client.field331.method2543(var122);
                            continue;
                        }
                        if (var489 == 3107) {
                            var5--;
                            int var123 = field733[var5];
                            var6--;
                            String var124 = field729[var6];
                            client.method197(var123, var124);
                            continue;
                        }
                        if (var489 == 3108) {
                            var5 -= 3;
                            int var125 = field733[var5];
                            int var126 = field733[var5 + 1];
                            int var127 = field733[var5 + 2];
                            class170 var128 = class170.method2993(var127);
                            client.method1893(var128, var125, var126);
                            continue;
                        }
                        if (var489 == 3109) {
                            var5 -= 2;
                            int var129 = field733[var5];
                            int var130 = field733[var5 + 1];
                            class170 var131 = var52 ? Statics.field737 : Statics.field2061;
                            client.method1893(var131, var129, var130);
                            continue;
                        }
                        if (var489 == 3110) {
                            var5--;
                            Statics.field2048 = field733[var5] == 1;
                            continue;
                        }
                        if (var489 == 3111) {
                            field733[var5++] = Statics.field36.field700 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 3112) {
                            var5--;
                            Statics.field36.field700 = field733[var5] == 1;
                            class31.method2089();
                            continue;
                        }
                        if (var489 == 3113) {
                            var6--;
                            String var132 = field729[var6];
                            var5--;
                            boolean var133 = field733[var5] == 1;
                            class115.method1442(var132, var133, false);
                            continue;
                        }
                        if (var489 == 3115) {
                            var5--;
                            int var134 = field733[var5];
                            client.field331.method2782(37);
                            client.field331.method2538(var134);
                            continue;
                        }
                        if (var489 == 3116) {
                            var5--;
                            int var135 = field733[var5];
                            var6 -= 2;
                            String var136 = field729[var6];
                            String var137 = field729[var6 + 1];
                            if (var136.length() <= 500 && var137.length() <= 500) {
                                client.field331.method2782(123);
                                client.field331.method2538(1 + class154.method1925(var136) + class154.method1925(var137));
                                client.field331.method2543(var136);
                                client.field331.method2543(var137);
                                client.field331.method2641(var135);
                            }
                            continue;
                        }
                    } else if (var489 < 3300) {
                        if (var489 == 3200) {
                            var5 -= 3;
                            int var138 = field733[var5];
                            int var139 = field733[var5 + 1];
                            int var140 = field733[var5 + 2];
                            if (client.field525 != 0 && var139 != 0 && client.field527 < 50) {
                                client.field528[client.field527] = var138;
                                client.field352[client.field527] = var139;
                                client.field530[client.field527] = var140;
                                client.field532[client.field527] = null;
                                client.field350[client.field527] = 0;
                                client.field527++;
                            }
                            continue;
                        }
                        if (var489 == 3201) {
                            var5--;
                            client.method2010(field733[var5]);
                            continue;
                        }
                        if (var489 == 3202) {
                            var5 -= 2;
                            int var141 = field733[var5];
                            int var10000 = field733[var5 + 1];
                            if (client.field522 != 0 && var141 != -1) {
                                class139.method1761(Statics.field161, var141, 0, client.field522, false);
                                client.field494 = true;
                            }
                            continue;
                        }
                    } else if (var489 < 3400) {
                        if (var489 == 3300) {
                            field733[var5++] = client.field299;
                            continue;
                        }
                        if (var489 == 3301) {
                            var5 -= 2;
                            int var143 = field733[var5];
                            int var144 = field733[var5 + 1];
                            int[] var145 = field733;
                            int var146 = var5++;
                            class13 var147 = (class13) class13.field119.method2151((long) var143);
                            int var148;
                            if (var147 == null) {
                                var148 = -1;
                            } else if (var144 >= 0 && var144 < var147.field117.length) {
                                var148 = var147.field117[var144];
                            } else {
                                var148 = -1;
                            }
                            var145[var146] = var148;
                            continue;
                        }
                        if (var489 == 3302) {
                            var5 -= 2;
                            int var149 = field733[var5];
                            int var150 = field733[var5 + 1];
                            int[] var151 = field733;
                            int var152 = var5++;
                            class13 var153 = (class13) class13.field119.method2151((long) var149);
                            int var154;
                            if (var153 == null) {
                                var154 = 0;
                            } else if (var150 >= 0 && var150 < var153.field116.length) {
                                var154 = var153.field116[var150];
                            } else {
                                var154 = 0;
                            }
                            var151[var152] = var154;
                            continue;
                        }
                        if (var489 == 3303) {
                            var5 -= 2;
                            int var155 = field733[var5];
                            int var156 = field733[var5 + 1];
                            field733[var5++] = class13.method3568(var155, var156);
                            continue;
                        }
                        if (var489 == 3304) {
                            var5--;
                            int var157 = field733[var5];
                            int[] var158 = field733;
                            int var159 = var5++;
                            class187 var160 = (class187) class187.field2778.method2130((long) var157);
                            class187 var161;
                            if (var160 == null) {
                                byte[] var162 = Statics.field2780.method3012(5, var157);
                                class187 var163 = new class187();
                                if (var162 != null) {
                                    var163.method3135(new class154(var162));
                                }
                                class187.field2778.method2132(var163, (long) var157);
                                var161 = var163;
                            } else {
                                var161 = var160;
                            }
                            var158[var159] = var161.field2779;
                            continue;
                        }
                        if (var489 == 3305) {
                            var5--;
                            int var164 = field733[var5];
                            field733[var5++] = client.field422[var164];
                            continue;
                        }
                        if (var489 == 3306) {
                            var5--;
                            int var165 = field733[var5];
                            field733[var5++] = client.field443[var165];
                            continue;
                        }
                        if (var489 == 3307) {
                            var5--;
                            int var166 = field733[var5];
                            field733[var5++] = client.field402[var166];
                            continue;
                        }
                        if (var489 == 3308) {
                            int var167 = Statics.field1094;
                            int var168 = (Statics.field43.field608 >> 7) + Statics.field1735;
                            int var169 = (Statics.field43.field605 >> 7) + Statics.field284;
                            field733[var5++] = (var167 << 28) + (var168 << 14) + var169;
                            continue;
                        }
                        if (var489 == 3309) {
                            var5--;
                            int var170 = field733[var5];
                            field733[var5++] = var170 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var489 == 3310) {
                            var5--;
                            int var171 = field733[var5];
                            field733[var5++] = var171 >> 28;
                            continue;
                        }
                        if (var489 == 3311) {
                            var5--;
                            int var172 = field733[var5];
                            field733[var5++] = var172 & 0x3FFF;
                            continue;
                        }
                        if (var489 == 3312) {
                            field733[var5++] = client.field294 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 3313) {
                            var5 -= 2;
                            int var173 = field733[var5] + 32768;
                            int var174 = field733[var5 + 1];
                            int[] var175 = field733;
                            int var176 = var5++;
                            class13 var177 = (class13) class13.field119.method2151((long) var173);
                            int var178;
                            if (var177 == null) {
                                var178 = -1;
                            } else if (var174 >= 0 && var174 < var177.field117.length) {
                                var178 = var177.field117[var174];
                            } else {
                                var178 = -1;
                            }
                            var175[var176] = var178;
                            continue;
                        }
                        if (var489 == 3314) {
                            var5 -= 2;
                            int var179 = field733[var5] + 32768;
                            int var180 = field733[var5 + 1];
                            int[] var181 = field733;
                            int var182 = var5++;
                            class13 var183 = (class13) class13.field119.method2151((long) var179);
                            int var184;
                            if (var183 == null) {
                                var184 = 0;
                            } else if (var180 >= 0 && var180 < var183.field116.length) {
                                var184 = var183.field116[var180];
                            } else {
                                var184 = 0;
                            }
                            var181[var182] = var184;
                            continue;
                        }
                        if (var489 == 3315) {
                            var5 -= 2;
                            int var185 = field733[var5] + 32768;
                            int var186 = field733[var5 + 1];
                            field733[var5++] = class13.method3568(var185, var186);
                            continue;
                        }
                        if (var489 == 3316) {
                            if (client.field452 >= 2) {
                                field733[var5++] = client.field452;
                            } else {
                                field733[var5++] = 0;
                            }
                            continue;
                        }
                        if (var489 == 3317) {
                            field733[var5++] = client.field306;
                            continue;
                        }
                        if (var489 == 3318) {
                            field733[var5++] = client.field290;
                            continue;
                        }
                        if (var489 == 3321) {
                            field733[var5++] = client.field450;
                            continue;
                        }
                        if (var489 == 3322) {
                            field733[var5++] = client.field451;
                            continue;
                        }
                        if (var489 == 3323) {
                            if (client.field454) {
                                field733[var5++] = 1;
                            } else {
                                field733[var5++] = 0;
                            }
                            continue;
                        }
                        if (var489 == 3324) {
                            field733[var5++] = client.field457;
                            continue;
                        }
                    } else if (var489 < 3500) {
                        if (var489 == 3400) {
                            var5 -= 2;
                            int var187 = field733[var5];
                            int var188 = field733[var5 + 1];
                            class196 var189 = (class196) class196.field2855.method2130((long) var187);
                            class196 var190;
                            if (var189 == null) {
                                byte[] var191 = Statics.field2856.method3012(8, var187);
                                class196 var192 = new class196();
                                if (var191 != null) {
                                    var192.method3270(new class154(var191));
                                }
                                class196.field2855.method2132(var192, (long) var187);
                                var190 = var192;
                            } else {
                                var190 = var189;
                            }
                            class196 var193 = var190;
                            if (var190.field2854 != 's') {
                            }
                            for (int var194 = 0; var194 < var193.field2860; var194++) {
                                if (var193.field2861[var194] == var188) {
                                    field729[var6++] = var193.field2863[var194];
                                    var193 = null;
                                    break;
                                }
                            }
                            if (var193 != null) {
                                field729[var6++] = var193.field2858;
                            }
                            continue;
                        }
                        if (var489 == 3408) {
                            var5 -= 4;
                            int var195 = field733[var5];
                            int var196 = field733[var5 + 1];
                            int var197 = field733[var5 + 2];
                            int var198 = field733[var5 + 3];
                            class196 var199 = (class196) class196.field2855.method2130((long) var197);
                            class196 var200;
                            if (var199 == null) {
                                byte[] var201 = Statics.field2856.method3012(8, var197);
                                class196 var202 = new class196();
                                if (var201 != null) {
                                    var202.method3270(new class154(var201));
                                }
                                class196.field2855.method2132(var202, (long) var197);
                                var200 = var202;
                            } else {
                                var200 = var199;
                            }
                            class196 var203 = var200;
                            if (var200.field2857 == var195 && var200.field2854 == var196) {
                                for (int var204 = 0; var204 < var203.field2860; var204++) {
                                    if (var203.field2861[var204] == var198) {
                                        if (var196 == 115) {
                                            field729[var6++] = var203.field2863[var204];
                                        } else {
                                            field733[var5++] = var203.field2862[var204];
                                        }
                                        var203 = null;
                                        break;
                                    }
                                }
                                if (var203 != null) {
                                    if (var196 == 115) {
                                        field729[var6++] = var203.field2858;
                                    } else {
                                        field733[var5++] = var203.field2859;
                                    }
                                }
                                continue;
                            }
                            if (var196 == 115) {
                                field729[var6++] = "null";
                            } else {
                                field733[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var489 < 3700) {
                        if (var489 == 3600) {
                            if (client.field313 == 0) {
                                field733[var5++] = -2;
                            } else if (client.field313 == 1) {
                                field733[var5++] = -1;
                            } else {
                                field733[var5++] = client.field552;
                            }
                            continue;
                        }
                        if (var489 == 3601) {
                            var5--;
                            int var205 = field733[var5];
                            if (client.field313 == 2 && var205 < client.field552) {
                                field729[var6++] = client.field554[var205].field158;
                                field729[var6++] = client.field554[var205].field151;
                                continue;
                            }
                            field729[var6++] = "";
                            field729[var6++] = "";
                            continue;
                        }
                        if (var489 == 3602) {
                            var5--;
                            int var206 = field733[var5];
                            if (client.field313 == 2 && var206 < client.field552) {
                                field733[var5++] = client.field554[var206].field154;
                                continue;
                            }
                            field733[var5++] = 0;
                            continue;
                        }
                        if (var489 == 3603) {
                            var5--;
                            int var207 = field733[var5];
                            if (client.field313 == 2 && var207 < client.field552) {
                                field733[var5++] = client.field554[var207].field153;
                                continue;
                            }
                            field733[var5++] = 0;
                            continue;
                        }
                        if (var489 == 3604) {
                            var6--;
                            String var208 = field729[var6];
                            var5--;
                            int var209 = field733[var5];
                            client.field331.method2782(216);
                            client.field331.method2641(class154.method1925(var208) + 1);
                            client.field331.method2641(var209);
                            client.field331.method2543(var208);
                            continue;
                        }
                        if (var489 == 3605) {
                            var6--;
                            String var210 = field729[var6];
                            client.method182(var210);
                            continue;
                        }
                        if (var489 == 3606) {
                            var6--;
                            String var211 = field729[var6];
                            if (var211 == null) {
                                continue;
                            }
                            String var212 = class205.method2828(var211, Statics.field156);
                            if (var212 == null) {
                                continue;
                            }
                            int var213 = 0;
                            while (true) {
                                if (var213 >= client.field552) {
                                    continue label3232;
                                }
                                class15 var214 = client.field554[var213];
                                String var215 = var214.field158;
                                String var216 = class205.method2828(var215, Statics.field156);
                                boolean var217;
                                if (var211 == null || var215 == null) {
                                    var217 = false;
                                } else if (var211.startsWith("#") || var215.startsWith("#")) {
                                    var217 = var211.equals(var215);
                                } else {
                                    var217 = var212.equals(var216);
                                }
                                if (var217) {
                                    client.field552--;
                                    for (int var218 = var213; var218 < client.field552; var218++) {
                                        client.field554[var218] = client.field554[var218 + 1];
                                    }
                                    client.field478 = client.field470;
                                    client.field331.method2782(154);
                                    client.field331.method2641(class154.method1925(var211));
                                    client.field331.method2543(var211);
                                    continue label3232;
                                }
                                var213++;
                            }
                        }
                        if (var489 == 3607) {
                            var6--;
                            String var219 = field729[var6];
                            client.method168(var219, false);
                            continue;
                        }
                        if (var489 == 3608) {
                            var6--;
                            String var220 = field729[var6];
                            client.method1084(var220);
                            continue;
                        }
                        if (var489 == 3609) {
                            var6--;
                            String var221 = field729[var6];
                            class178[] var222 = new class178[] { class178.field2673, class178.field2674, class178.field2670, class178.field2672, class178.field2677, class178.field2669 };
                            class178[] var223 = var222;
                            for (int var224 = 0; var224 < var223.length; var224++) {
                                class178 var225 = var223[var224];
                                if (var225.field2676 != -1 && var221.startsWith(class38.method167(var225.field2676))) {
                                    var221 = var221.substring(6 + Integer.toString(var225.field2676).length());
                                    break;
                                }
                            }
                            field733[var5++] = client.method2760(var221, false) ? 1 : 0;
                            continue;
                        }
                        if (var489 == 3611) {
                            if (client.field291 == null) {
                                field729[var6++] = "";
                            } else {
                                String[] var226 = field729;
                                int var227 = var6++;
                                String var228 = client.field291;
                                String var229 = class206.method2269(class206.method3125(var228));
                                if (var229 == null) {
                                    var229 = "";
                                }
                                var226[var227] = var229;
                            }
                            continue;
                        }
                        if (var489 == 3612) {
                            if (client.field291 == null) {
                                field733[var5++] = 0;
                            } else {
                                field733[var5++] = Statics.field2679;
                            }
                            continue;
                        }
                        if (var489 == 3613) {
                            var5--;
                            int var231 = field733[var5];
                            if (client.field291 != null && var231 < Statics.field2679) {
                                field729[var6++] = Statics.field1763[var231].field283;
                                continue;
                            }
                            field729[var6++] = "";
                            continue;
                        }
                        if (var489 == 3614) {
                            var5--;
                            int var232 = field733[var5];
                            if (client.field291 != null && var232 < Statics.field2679) {
                                field733[var5++] = Statics.field1763[var232].field281;
                                continue;
                            }
                            field733[var5++] = 0;
                            continue;
                        }
                        if (var489 == 3615) {
                            var5--;
                            int var233 = field733[var5];
                            if (client.field291 != null && var233 < Statics.field2679) {
                                field733[var5++] = Statics.field1763[var233].field280;
                                continue;
                            }
                            field733[var5++] = 0;
                            continue;
                        }
                        if (var489 == 3616) {
                            field733[var5++] = Statics.field2178;
                            continue;
                        }
                        if (var489 == 3617) {
                            var6--;
                            String var234 = field729[var6];
                            if (Statics.field1763 != null) {
                                client.field331.method2782(204);
                                client.field331.method2641(class154.method1925(var234));
                                client.field331.method2543(var234);
                            }
                            continue;
                        }
                        if (var489 == 3618) {
                            field733[var5++] = Statics.field35;
                            continue;
                        }
                        if (var489 == 3619) {
                            var6--;
                            String var235 = field729[var6];
                            if (!var235.equals("")) {
                                client.field331.method2782(6);
                                client.field331.method2641(class154.method1925(var235));
                                client.field331.method2543(var235);
                            }
                            continue;
                        }
                        if (var489 == 3620) {
                            client.field331.method2782(6);
                            client.field331.method2641(0);
                            continue;
                        }
                        if (var489 == 3621) {
                            if (client.field313 == 0) {
                                field733[var5++] = -1;
                            } else {
                                field733[var5++] = client.field556;
                            }
                            continue;
                        }
                        if (var489 == 3622) {
                            var5--;
                            int var236 = field733[var5];
                            if (client.field313 != 0 && var236 < client.field556) {
                                field729[var6++] = client.field551[var236].field208;
                                field729[var6++] = client.field551[var236].field218;
                                continue;
                            }
                            field729[var6++] = "";
                            field729[var6++] = "";
                            continue;
                        }
                        if (var489 == 3623) {
                            var6--;
                            String var237 = field729[var6];
                            if (var237.startsWith(class38.method167(0)) || var237.startsWith(class38.method167(1))) {
                                var237 = var237.substring(7);
                            }
                            field733[var5++] = client.method151(var237) ? 1 : 0;
                            continue;
                        }
                        if (var489 == 3624) {
                            var5--;
                            int var238 = field733[var5];
                            if (Statics.field1763 != null && var238 < Statics.field2679 && Statics.field1763[var238].field283.equalsIgnoreCase(Statics.field43.field264)) {
                                field733[var5++] = 1;
                                continue;
                            }
                            field733[var5++] = 0;
                            continue;
                        }
                        if (var489 == 3625) {
                            if (client.field376 == null) {
                                field729[var6++] = "";
                            } else {
                                String[] var239 = field729;
                                int var240 = var6++;
                                String var241 = client.field376;
                                String var242 = class206.method2269(class206.method3125(var241));
                                if (var242 == null) {
                                    var242 = "";
                                }
                                var239[var240] = var242;
                            }
                            continue;
                        }
                    } else if (var489 < 4000) {
                        if (var489 == 3903) {
                            var5--;
                            int var244 = field733[var5];
                            field733[var5++] = client.field533[var244].method45();
                            continue;
                        }
                        if (var489 == 3904) {
                            var5--;
                            int var245 = field733[var5];
                            field733[var5++] = client.field533[var245].field29;
                            continue;
                        }
                        if (var489 == 3905) {
                            var5--;
                            int var246 = field733[var5];
                            field733[var5++] = client.field533[var246].field31;
                            continue;
                        }
                        if (var489 == 3906) {
                            var5--;
                            int var247 = field733[var5];
                            field733[var5++] = client.field533[var247].field32;
                            continue;
                        }
                        if (var489 == 3907) {
                            var5--;
                            int var248 = field733[var5];
                            field733[var5++] = client.field533[var248].field30;
                            continue;
                        }
                        if (var489 == 3908) {
                            var5--;
                            int var249 = field733[var5];
                            field733[var5++] = client.field533[var249].field34;
                            continue;
                        }
                        if (var489 == 3910) {
                            var5--;
                            int var250 = field733[var5];
                            int var251 = client.field533[var250].method44();
                            field733[var5++] = var251 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 3911) {
                            var5--;
                            int var252 = field733[var5];
                            int var253 = client.field533[var252].method44();
                            field733[var5++] = var253 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 3912) {
                            var5--;
                            int var254 = field733[var5];
                            int var255 = client.field533[var254].method44();
                            field733[var5++] = var255 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 3913) {
                            var5--;
                            int var256 = field733[var5];
                            int var257 = client.field533[var256].method44();
                            field733[var5++] = var257 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 3914) {
                            var5--;
                            boolean var258 = field733[var5] == 1;
                            if (Statics.field1749 != null) {
                                Statics.field1749.method12(class2.field10, var258);
                            }
                            continue;
                        }
                        if (var489 == 3915) {
                            var5--;
                            boolean var259 = field733[var5] == 1;
                            if (Statics.field1749 != null) {
                                Statics.field1749.method12(class2.field9, var259);
                            }
                            continue;
                        }
                        if (var489 == 3916) {
                            var5 -= 2;
                            boolean var260 = field733[var5] == 1;
                            boolean var261 = field733[var5 + 1] == 1;
                            if (Statics.field1749 != null) {
                                Statics.field1749.method12(new class45(var261), var260);
                            }
                            continue;
                        }
                        if (var489 == 3917) {
                            var5--;
                            boolean var262 = field733[var5] == 1;
                            if (Statics.field1749 != null) {
                                Statics.field1749.method12(class2.field12, var262);
                            }
                            continue;
                        }
                        if (var489 == 3918) {
                            var5--;
                            boolean var263 = field733[var5] == 1;
                            if (Statics.field1749 != null) {
                                Statics.field1749.method12(class2.field11, var263);
                            }
                            continue;
                        }
                        if (var489 == 3919) {
                            field733[var5++] = Statics.field1749 == null ? 0 : Statics.field1749.field8.size();
                            continue;
                        }
                        if (var489 == 3920) {
                            var5--;
                            int var264 = field733[var5];
                            class3 var265 = (class3) Statics.field1749.field8.get(var264);
                            field733[var5++] = var265.field18;
                            continue;
                        }
                        if (var489 == 3921) {
                            var5--;
                            int var266 = field733[var5];
                            class3 var267 = (class3) Statics.field1749.field8.get(var266);
                            field729[var6++] = var267.method25();
                            continue;
                        }
                        if (var489 == 3922) {
                            var5--;
                            int var268 = field733[var5];
                            class3 var269 = (class3) Statics.field1749.field8.get(var268);
                            field729[var6++] = var269.method18();
                            continue;
                        }
                        if (var489 == 3923) {
                            var5--;
                            int var270 = field733[var5];
                            class3 var271 = (class3) Statics.field1749.field8.get(var270);
                            long var272 = class156.method2009() - Statics.field157 - var271.field17;
                            int var274 = (int) (var272 / 3600000L);
                            int var275 = (int) ((var272 - (long) (var274 * 3600000)) / 60000L);
                            int var276 = (int) ((var272 - (long) (var274 * 3600000) - (long) (var275 * 60000)) / 1000L);
                            String var277 = var274 + ":" + var275 / 10 + var275 % 10 + ":" + var276 / 10 + var276 % 10;
                            field729[var6++] = var277;
                            continue;
                        }
                        if (var489 == 3924) {
                            var5--;
                            int var278 = field733[var5];
                            class3 var279 = (class3) Statics.field1749.field8.get(var278);
                            field733[var5++] = var279.field20.field32;
                            continue;
                        }
                        if (var489 == 3925) {
                            var5--;
                            int var280 = field733[var5];
                            class3 var281 = (class3) Statics.field1749.field8.get(var280);
                            field733[var5++] = var281.field20.field31;
                            continue;
                        }
                        if (var489 == 3926) {
                            var5--;
                            int var282 = field733[var5];
                            class3 var283 = (class3) Statics.field1749.field8.get(var282);
                            field733[var5++] = var283.field20.field29;
                            continue;
                        }
                    } else if (var489 < 4100) {
                        if (var489 == 4000) {
                            var5 -= 2;
                            int var284 = field733[var5];
                            int var285 = field733[var5 + 1];
                            field733[var5++] = var284 + var285;
                            continue;
                        }
                        if (var489 == 4001) {
                            var5 -= 2;
                            int var286 = field733[var5];
                            int var287 = field733[var5 + 1];
                            field733[var5++] = var286 - var287;
                            continue;
                        }
                        if (var489 == 4002) {
                            var5 -= 2;
                            int var288 = field733[var5];
                            int var289 = field733[var5 + 1];
                            field733[var5++] = var288 * var289;
                            continue;
                        }
                        if (var489 == 4003) {
                            var5 -= 2;
                            int var290 = field733[var5];
                            int var291 = field733[var5 + 1];
                            field733[var5++] = var290 / var291;
                            continue;
                        }
                        if (var489 == 4004) {
                            var5--;
                            int var292 = field733[var5];
                            field733[var5++] = (int) (Math.random() * (double) var292);
                            continue;
                        }
                        if (var489 == 4005) {
                            var5--;
                            int var293 = field733[var5];
                            field733[var5++] = (int) (Math.random() * (double) (var293 + 1));
                            continue;
                        }
                        if (var489 == 4006) {
                            var5 -= 5;
                            int var294 = field733[var5];
                            int var295 = field733[var5 + 1];
                            int var296 = field733[var5 + 2];
                            int var297 = field733[var5 + 3];
                            int var298 = field733[var5 + 4];
                            field733[var5++] = (var295 - var294) * (var298 - var296) / (var297 - var296) + var294;
                            continue;
                        }
                        if (var489 == 4007) {
                            var5 -= 2;
                            int var299 = field733[var5];
                            int var300 = field733[var5 + 1];
                            field733[var5++] = var299 * var300 / 100 + var299;
                            continue;
                        }
                        if (var489 == 4008) {
                            var5 -= 2;
                            int var301 = field733[var5];
                            int var302 = field733[var5 + 1];
                            field733[var5++] = var301 | 0x1 << var302;
                            continue;
                        }
                        if (var489 == 4009) {
                            var5 -= 2;
                            int var303 = field733[var5];
                            int var304 = field733[var5 + 1];
                            field733[var5++] = var303 & -1 - (0x1 << var304);
                            continue;
                        }
                        if (var489 == 4010) {
                            var5 -= 2;
                            int var305 = field733[var5];
                            int var306 = field733[var5 + 1];
                            field733[var5++] = (var305 & 0x1 << var306) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var489 == 4011) {
                            var5 -= 2;
                            int var307 = field733[var5];
                            int var308 = field733[var5 + 1];
                            field733[var5++] = var307 % var308;
                            continue;
                        }
                        if (var489 == 4012) {
                            var5 -= 2;
                            int var309 = field733[var5];
                            int var310 = field733[var5 + 1];
                            if (var309 == 0) {
                                field733[var5++] = 0;
                            } else {
                                field733[var5++] = (int) Math.pow((double) var309, (double) var310);
                            }
                            continue;
                        }
                        if (var489 == 4013) {
                            var5 -= 2;
                            int var311 = field733[var5];
                            int var312 = field733[var5 + 1];
                            if (var311 == 0) {
                                field733[var5++] = 0;
                            } else if (var312 == 0) {
                                field733[var5++] = Integer.MAX_VALUE;
                            } else {
                                field733[var5++] = (int) Math.pow((double) var311, 1.0D / (double) var312);
                            }
                            continue;
                        }
                        if (var489 == 4014) {
                            var5 -= 2;
                            int var313 = field733[var5];
                            int var314 = field733[var5 + 1];
                            field733[var5++] = var313 & var314;
                            continue;
                        }
                        if (var489 == 4015) {
                            var5 -= 2;
                            int var315 = field733[var5];
                            int var316 = field733[var5 + 1];
                            field733[var5++] = var315 | var316;
                            continue;
                        }
                        if (var489 == 4018) {
                            var5 -= 3;
                            long var317 = (long) field733[var5];
                            long var319 = (long) field733[var5 + 1];
                            long var321 = (long) field733[var5 + 2];
                            field733[var5++] = (int) (var317 * var321 / var319);
                            continue;
                        }
                    } else if (var489 < 4200) {
                        if (var489 == 4100) {
                            var6--;
                            String var323 = field729[var6];
                            var5--;
                            int var324 = field733[var5];
                            field729[var6++] = var323 + var324;
                            continue;
                        }
                        if (var489 == 4101) {
                            var6 -= 2;
                            String var325 = field729[var6];
                            String var326 = field729[var6 + 1];
                            field729[var6++] = var325 + var326;
                            continue;
                        }
                        if (var489 == 4102) {
                            var6--;
                            String var327 = field729[var6];
                            var5--;
                            int var328 = field733[var5];
                            field729[var6++] = var327 + class208.method3212(var328, true);
                            continue;
                        }
                        if (var489 == 4103) {
                            var6--;
                            String var329 = field729[var6];
                            field729[var6++] = var329.toLowerCase();
                            continue;
                        }
                        if (var489 == 4104) {
                            var5--;
                            int var330 = field733[var5];
                            long var331 = ((long) var330 + 11745L) * 86400000L;
                            field738.setTime(new Date(var331));
                            int var333 = field738.get(5);
                            int var334 = field738.get(2);
                            int var335 = field738.get(1);
                            field729[var6++] = var333 + "-" + field730[var334] + "-" + var335;
                            continue;
                        }
                        if (var489 == 4105) {
                            var6 -= 2;
                            String var336 = field729[var6];
                            String var337 = field729[var6 + 1];
                            if (Statics.field43.field254 != null && Statics.field43.field254.field2190) {
                                field729[var6++] = var337;
                                continue;
                            }
                            field729[var6++] = var336;
                            continue;
                        }
                        if (var489 == 4106) {
                            var5--;
                            int var338 = field733[var5];
                            field729[var6++] = Integer.toString(var338);
                            continue;
                        }
                        if (var489 == 4107) {
                            var6 -= 2;
                            int[] var339 = field733;
                            int var340 = var5++;
                            int var341 = class203.method1521(field729[var6], field729[var6 + 1], client.field510);
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
                        if (var489 == 4108) {
                            var6--;
                            String var343 = field729[var6];
                            var5 -= 2;
                            int var344 = field733[var5];
                            int var345 = field733[var5 + 1];
                            byte[] var346 = Statics.field908.method3012(var345, 0);
                            class209 var347 = new class209(var346);
                            field733[var5++] = var347.method3614(var343, var344);
                            continue;
                        }
                        if (var489 == 4109) {
                            var6--;
                            String var348 = field729[var6];
                            var5 -= 2;
                            int var349 = field733[var5];
                            int var350 = field733[var5 + 1];
                            byte[] var351 = Statics.field908.method3012(var350, 0);
                            class209 var352 = new class209(var351);
                            field733[var5++] = var352.method3581(var348, var349);
                            continue;
                        }
                        if (var489 == 4110) {
                            var6 -= 2;
                            String var353 = field729[var6];
                            String var354 = field729[var6 + 1];
                            var5--;
                            if (field733[var5] == 1) {
                                field729[var6++] = var353;
                            } else {
                                field729[var6++] = var354;
                            }
                            continue;
                        }
                        if (var489 == 4111) {
                            var6--;
                            String var355 = field729[var6];
                            field729[var6++] = class210.method3583(var355);
                            continue;
                        }
                        if (var489 == 4112) {
                            var6--;
                            String var356 = field729[var6];
                            var5--;
                            int var357 = field733[var5];
                            field729[var6++] = var356 + (char) var357;
                            continue;
                        }
                        if (var489 == 4113) {
                            var5--;
                            int var358 = field733[var5];
                            int[] var359 = field733;
                            int var360 = var5++;
                            char var361 = (char) var358;
                            boolean var362;
                            if (var361 >= ' ' && var361 <= '~') {
                                var362 = true;
                            } else if (var361 >= 160 && var361 <= 255) {
                                var362 = true;
                            } else if (var361 == 8364 || var361 == 338 || var361 == 8212 || var361 == 339 || var361 == 376) {
                                var362 = true;
                            } else {
                                var362 = false;
                            }
                            var359[var360] = var362 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 4114) {
                            var5--;
                            int var363 = field733[var5];
                            int[] var364 = field733;
                            int var365 = var5++;
                            char var366 = (char) var363;
                            boolean var367 = var366 >= '0' && var366 <= '9' || var366 >= 'A' && var366 <= 'Z' || var366 >= 'a' && var366 <= 'z';
                            var364[var365] = var367 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 4115) {
                            var5--;
                            int var368 = field733[var5];
                            int[] var369 = field733;
                            int var370 = var5++;
                            char var371 = (char) var368;
                            boolean var372 = var371 >= 'A' && var371 <= 'Z' || var371 >= 'a' && var371 <= 'z';
                            var369[var370] = var372 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 4116) {
                            var5--;
                            int var373 = field733[var5];
                            int[] var374 = field733;
                            int var375 = var5++;
                            char var376 = (char) var373;
                            boolean var377 = var376 >= '0' && var376 <= '9';
                            var374[var375] = var377 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 4117) {
                            var6--;
                            String var378 = field729[var6];
                            if (var378 == null) {
                                field733[var5++] = 0;
                            } else {
                                field733[var5++] = var378.length();
                            }
                            continue;
                        }
                        if (var489 == 4118) {
                            var6--;
                            String var379 = field729[var6];
                            var5 -= 2;
                            int var380 = field733[var5];
                            int var381 = field733[var5 + 1];
                            field729[var6++] = var379.substring(var380, var381);
                            continue;
                        }
                        if (var489 == 4119) {
                            var6--;
                            String var382 = field729[var6];
                            StringBuilder var383 = new StringBuilder(var382.length());
                            boolean var384 = false;
                            for (int var385 = 0; var385 < var382.length(); var385++) {
                                char var386 = var382.charAt(var385);
                                if (var386 == '<') {
                                    var384 = true;
                                } else if (var386 == '>') {
                                    var384 = false;
                                } else if (!var384) {
                                    var383.append(var386);
                                }
                            }
                            field729[var6++] = var383.toString();
                            continue;
                        }
                        if (var489 == 4120) {
                            var6--;
                            String var387 = field729[var6];
                            var5--;
                            int var388 = field733[var5];
                            field733[var5++] = var387.indexOf(var388);
                            continue;
                        }
                        if (var489 == 4121) {
                            var6 -= 2;
                            String var389 = field729[var6];
                            String var390 = field729[var6 + 1];
                            var5--;
                            int var391 = field733[var5];
                            field733[var5++] = var389.indexOf(var390, var391);
                            continue;
                        }
                    } else if (var489 < 4300) {
                        if (var489 == 4200) {
                            var5--;
                            int var392 = field733[var5];
                            field729[var6++] = class199.method2268(var392).field2950;
                            continue;
                        }
                        if (var489 == 4201) {
                            var5 -= 2;
                            int var393 = field733[var5];
                            int var394 = field733[var5 + 1];
                            class199 var395 = class199.method2268(var393);
                            if (var394 >= 1 && var394 <= 5 && var395.field2965[var394 - 1] != null) {
                                field729[var6++] = var395.field2965[var394 - 1];
                                continue;
                            }
                            field729[var6++] = "";
                            continue;
                        }
                        if (var489 == 4202) {
                            var5 -= 2;
                            int var396 = field733[var5];
                            int var397 = field733[var5 + 1];
                            class199 var398 = class199.method2268(var396);
                            if (var397 >= 1 && var397 <= 5 && var398.field2954[var397 - 1] != null) {
                                field729[var6++] = var398.field2954[var397 - 1];
                                continue;
                            }
                            field729[var6++] = "";
                            continue;
                        }
                        if (var489 == 4203) {
                            var5--;
                            int var399 = field733[var5];
                            field733[var5++] = class199.method2268(var399).field2992;
                            continue;
                        }
                        if (var489 == 4204) {
                            var5--;
                            int var400 = field733[var5];
                            field733[var5++] = class199.method2268(var400).field2961 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 4205) {
                            var5--;
                            int var401 = field733[var5];
                            class199 var402 = class199.method2268(var401);
                            if (var402.field2981 == -1 && var402.field2980 >= 0) {
                                field733[var5++] = var402.field2980;
                                continue;
                            }
                            field733[var5++] = var401;
                            continue;
                        }
                        if (var489 == 4206) {
                            var5--;
                            int var403 = field733[var5];
                            class199 var404 = class199.method2268(var403);
                            if (var404.field2981 >= 0 && var404.field2980 >= 0) {
                                field733[var5++] = var404.field2980;
                                continue;
                            }
                            field733[var5++] = var403;
                            continue;
                        }
                        if (var489 == 4207) {
                            var5--;
                            int var405 = field733[var5];
                            field733[var5++] = class199.method2268(var405).field2963 ? 1 : 0;
                            continue;
                        }
                        if (var489 == 4208) {
                            var5--;
                            int var406 = field733[var5];
                            class199 var407 = class199.method2268(var406);
                            if (var407.field2956 == -1 && var407.field2951 >= 0) {
                                field733[var5++] = var407.field2951;
                                continue;
                            }
                            field733[var5++] = var406;
                            continue;
                        }
                        if (var489 == 4209) {
                            var5--;
                            int var408 = field733[var5];
                            class199 var409 = class199.method2268(var408);
                            if (var409.field2956 >= 0 && var409.field2951 >= 0) {
                                field733[var5++] = var409.field2951;
                                continue;
                            }
                            field733[var5++] = var408;
                            continue;
                        }
                        if (var489 == 4210) {
                            var6--;
                            String var410 = field729[var6];
                            var5--;
                            int var411 = field733[var5];
                            boolean var413 = var411 == 1;
                            String var414 = var410.toLowerCase();
                            short[] var415 = new short[16];
                            int var416 = 0;
                            int var417 = 0;
                            while (true) {
                                if (var417 >= Statics.field2969) {
                                    Statics.field5 = var415;
                                    Statics.field2680 = 0;
                                    Statics.field122 = var416;
                                    String[] var421 = new String[Statics.field122];
                                    for (int var422 = 0; var422 < Statics.field122; var422++) {
                                        var421[var422] = class199.method2268(var415[var422]).field2950;
                                    }
                                    short[] var423 = Statics.field5;
                                    class151.method172(var421, var423, 0, var421.length - 1);
                                    break;
                                }
                                class199 var418 = class199.method2268(var417);
                                if ((!var413 || var418.field2988) && var418.field2981 == -1 && var418.field2950.toLowerCase().indexOf(var414) != -1) {
                                    if (var416 >= 250) {
                                        Statics.field122 = -1;
                                        Statics.field5 = null;
                                        break;
                                    }
                                    if (var416 >= var415.length) {
                                        short[] var419 = new short[var415.length * 2];
                                        for (int var420 = 0; var420 < var416; var420++) {
                                            var419[var420] = var415[var420];
                                        }
                                        var415 = var419;
                                    }
                                    var415[var416++] = (short) var417;
                                }
                                var417++;
                            }
                            field733[var5++] = Statics.field122;
                            continue;
                        }
                        if (var489 == 4211) {
                            if (Statics.field5 != null && Statics.field2680 < Statics.field122) {
                                field733[var5++] = Statics.field5[++Statics.field2680 - 1] & 0xFFFF;
                                continue;
                            }
                            field733[var5++] = -1;
                            continue;
                        }
                        if (var489 == 4212) {
                            Statics.field2680 = 0;
                            continue;
                        }
                    } else if (var489 < 5100) {
                        if (var489 == 5000) {
                            field733[var5++] = client.field353;
                            continue;
                        }
                        if (var489 == 5001) {
                            var5 -= 3;
                            client.field353 = field733[var5];
                            int var424 = field733[var5 + 1];
                            class217[] var425 = class217.method3532();
                            int var426 = 0;
                            class217 var428;
                            while (true) {
                                if (var426 >= var425.length) {
                                    var428 = null;
                                    break;
                                }
                                class217 var427 = var425[var426];
                                if (var427.field3165 == var424) {
                                    var428 = var427;
                                    break;
                                }
                                var426++;
                            }
                            Statics.field223 = var428;
                            if (Statics.field223 == null) {
                                Statics.field223 = class217.field3162;
                            }
                            client.field504 = field733[var5 + 2];
                            client.field331.method2782(224);
                            client.field331.method2641(client.field353);
                            client.field331.method2641(Statics.field223.field3165);
                            client.field331.method2641(client.field504);
                            continue;
                        }
                        if (var489 == 5002) {
                            var6--;
                            String var429 = field729[var6];
                            var5 -= 2;
                            int var430 = field733[var5];
                            int var431 = field733[var5 + 1];
                            client.field331.method2782(163);
                            client.field331.method2641(class154.method1925(var429) + 2);
                            client.field331.method2543(var429);
                            client.field331.method2641(var430 - 1);
                            client.field331.method2641(var431);
                            continue;
                        }
                        if (var489 == 5003) {
                            var5 -= 2;
                            int var432 = field733[var5];
                            int var433 = field733[var5 + 1];
                            class22 var434 = class48.method3771(var432, var433);
                            if (var434 == null) {
                                field733[var5++] = -1;
                                field733[var5++] = 0;
                                field729[var6++] = "";
                                field729[var6++] = "";
                                field729[var6++] = "";
                            } else {
                                field733[var5++] = var434.field239;
                                field733[var5++] = var434.field236;
                                field729[var6++] = var434.field233 == null ? "" : var434.field233;
                                field729[var6++] = var434.field234 == null ? "" : var434.field234;
                                field729[var6++] = var434.field235 == null ? "" : var434.field235;
                            }
                            continue;
                        }
                        if (var489 == 5004) {
                            var5--;
                            int var435 = field733[var5];
                            class22 var436 = class48.method862(var435);
                            if (var436 == null) {
                                field733[var5++] = -1;
                                field733[var5++] = 0;
                                field729[var6++] = "";
                                field729[var6++] = "";
                                field729[var6++] = "";
                            } else {
                                field733[var5++] = var436.field232;
                                field733[var5++] = var436.field236;
                                field729[var6++] = var436.field233 == null ? "" : var436.field233;
                                field729[var6++] = var436.field234 == null ? "" : var436.field234;
                                field729[var6++] = var436.field235 == null ? "" : var436.field235;
                            }
                            continue;
                        }
                        if (var489 == 5005) {
                            if (Statics.field223 == null) {
                                field733[var5++] = -1;
                            } else {
                                field733[var5++] = Statics.field223.field3165;
                            }
                            continue;
                        }
                        if (var489 == 5008) {
                            var6--;
                            String var437 = field729[var6];
                            var5--;
                            int var438 = field733[var5];
                            String var439 = var437.toLowerCase();
                            byte var440 = 0;
                            if (var439.startsWith(class174.field2535)) {
                                var440 = 0;
                                var437 = var437.substring(class174.field2535.length());
                            } else if (var439.startsWith(class174.field2537)) {
                                var440 = 1;
                                var437 = var437.substring(class174.field2537.length());
                            } else if (var439.startsWith(class174.field2539)) {
                                var440 = 2;
                                var437 = var437.substring(class174.field2539.length());
                            } else if (var439.startsWith(class174.field2541)) {
                                var440 = 3;
                                var437 = var437.substring(class174.field2541.length());
                            } else if (var439.startsWith(class174.field2585)) {
                                var440 = 4;
                                var437 = var437.substring(class174.field2585.length());
                            } else if (var439.startsWith(class174.field2545)) {
                                var440 = 5;
                                var437 = var437.substring(class174.field2545.length());
                            } else if (var439.startsWith(class174.field2547)) {
                                var440 = 6;
                                var437 = var437.substring(class174.field2547.length());
                            } else if (var439.startsWith(class174.field2549)) {
                                var440 = 7;
                                var437 = var437.substring(class174.field2549.length());
                            } else if (var439.startsWith(class174.field2460)) {
                                var440 = 8;
                                var437 = var437.substring(class174.field2460.length());
                            } else if (var439.startsWith(class174.field2553)) {
                                var440 = 9;
                                var437 = var437.substring(class174.field2553.length());
                            } else if (var439.startsWith(class174.field2445)) {
                                var440 = 10;
                                var437 = var437.substring(class174.field2445.length());
                            } else if (var439.startsWith(class174.field2557)) {
                                var440 = 11;
                                var437 = var437.substring(class174.field2557.length());
                            } else if (client.field510 != 0) {
                                if (var439.startsWith(class174.field2564)) {
                                    var440 = 0;
                                    var437 = var437.substring(class174.field2564.length());
                                } else if (var439.startsWith(class174.field2538)) {
                                    var440 = 1;
                                    var437 = var437.substring(class174.field2538.length());
                                } else if (var439.startsWith(class174.field2540)) {
                                    var440 = 2;
                                    var437 = var437.substring(class174.field2540.length());
                                } else if (var439.startsWith(class174.field2444)) {
                                    var440 = 3;
                                    var437 = var437.substring(class174.field2444.length());
                                } else if (var439.startsWith(class174.field2544)) {
                                    var440 = 4;
                                    var437 = var437.substring(class174.field2544.length());
                                } else if (var439.startsWith(class174.field2546)) {
                                    var440 = 5;
                                    var437 = var437.substring(class174.field2546.length());
                                } else if (var439.startsWith(class174.field2548)) {
                                    var440 = 6;
                                    var437 = var437.substring(class174.field2548.length());
                                } else if (var439.startsWith(class174.field2550)) {
                                    var440 = 7;
                                    var437 = var437.substring(class174.field2550.length());
                                } else if (var439.startsWith(class174.field2552)) {
                                    var440 = 8;
                                    var437 = var437.substring(class174.field2552.length());
                                } else if (var439.startsWith(class174.field2554)) {
                                    var440 = 9;
                                    var437 = var437.substring(class174.field2554.length());
                                } else if (var439.startsWith(class174.field2556)) {
                                    var440 = 10;
                                    var437 = var437.substring(class174.field2556.length());
                                } else if (var439.startsWith(class174.field2558)) {
                                    var440 = 11;
                                    var437 = var437.substring(class174.field2558.length());
                                }
                            }
                            String var441 = var437.toLowerCase();
                            byte var442 = 0;
                            if (var441.startsWith(class174.field2559)) {
                                var442 = 1;
                                var437 = var437.substring(class174.field2559.length());
                            } else if (var441.startsWith(class174.field2461)) {
                                var442 = 2;
                                var437 = var437.substring(class174.field2461.length());
                            } else if (var441.startsWith(class174.field2522)) {
                                var442 = 3;
                                var437 = var437.substring(class174.field2522.length());
                            } else if (var441.startsWith(class174.field2592)) {
                                var442 = 4;
                                var437 = var437.substring(class174.field2592.length());
                            } else if (var441.startsWith(class174.field2476)) {
                                var442 = 5;
                                var437 = var437.substring(class174.field2476.length());
                            } else if (client.field510 != 0) {
                                if (var441.startsWith(class174.field2560)) {
                                    var442 = 1;
                                    var437 = var437.substring(class174.field2560.length());
                                } else if (var441.startsWith(class174.field2562)) {
                                    var442 = 2;
                                    var437 = var437.substring(class174.field2562.length());
                                } else if (var441.startsWith(class174.field2437)) {
                                    var442 = 3;
                                    var437 = var437.substring(class174.field2437.length());
                                } else if (var441.startsWith(class174.field2533)) {
                                    var442 = 4;
                                    var437 = var437.substring(class174.field2533.length());
                                } else if (var441.startsWith(class174.field2568)) {
                                    var442 = 5;
                                    var437 = var437.substring(class174.field2568.length());
                                }
                            }
                            client.field331.method2782(179);
                            client.field331.method2641(0);
                            int var443 = client.field331.field2105;
                            client.field331.method2641(var438);
                            client.field331.method2641(var440);
                            client.field331.method2641(var442);
                            class160 var444 = client.field331;
                            int var445 = var444.field2105;
                            int var446 = var437.length();
                            byte[] var447 = new byte[var446];
                            for (int var448 = 0; var448 < var446; var448++) {
                                char var449 = var437.charAt(var448);
                                if (!(var449 <= 0 || var449 >= 128) || !(var449 < 160 || var449 > 255)) {
                                    var447[var448] = (byte) var449;
                                } else if (var449 == 8364) {
                                    var447[var448] = -128;
                                } else if (var449 == 8218) {
                                    var447[var448] = -126;
                                } else if (var449 == 402) {
                                    var447[var448] = -125;
                                } else if (var449 == 8222) {
                                    var447[var448] = -124;
                                } else if (var449 == 8230) {
                                    var447[var448] = -123;
                                } else if (var449 == 8224) {
                                    var447[var448] = -122;
                                } else if (var449 == 8225) {
                                    var447[var448] = -121;
                                } else if (var449 == 710) {
                                    var447[var448] = -120;
                                } else if (var449 == 8240) {
                                    var447[var448] = -119;
                                } else if (var449 == 352) {
                                    var447[var448] = -118;
                                } else if (var449 == 8249) {
                                    var447[var448] = -117;
                                } else if (var449 == 338) {
                                    var447[var448] = -116;
                                } else if (var449 == 381) {
                                    var447[var448] = -114;
                                } else if (var449 == 8216) {
                                    var447[var448] = -111;
                                } else if (var449 == 8217) {
                                    var447[var448] = -110;
                                } else if (var449 == 8220) {
                                    var447[var448] = -109;
                                } else if (var449 == 8221) {
                                    var447[var448] = -108;
                                } else if (var449 == 8226) {
                                    var447[var448] = -107;
                                } else if (var449 == 8211) {
                                    var447[var448] = -106;
                                } else if (var449 == 8212) {
                                    var447[var448] = -105;
                                } else if (var449 == 732) {
                                    var447[var448] = -104;
                                } else if (var449 == 8482) {
                                    var447[var448] = -103;
                                } else if (var449 == 353) {
                                    var447[var448] = -102;
                                } else if (var449 == 8250) {
                                    var447[var448] = -101;
                                } else if (var449 == 339) {
                                    var447[var448] = -100;
                                } else if (var449 == 382) {
                                    var447[var448] = -98;
                                } else if (var449 == 376) {
                                    var447[var448] = -97;
                                } else {
                                    var447[var448] = 63;
                                }
                            }
                            var444.method2550(var447.length);
                            var444.field2105 += Statics.field79.method2484(var447, 0, var447.length, var444.field2108, var444.field2105);
                            client.field331.method2735(client.field331.field2105 - var443);
                            continue;
                        }
                        if (var489 == 5009) {
                            var6 -= 2;
                            String var452 = field729[var6];
                            String var453 = field729[var6 + 1];
                            client.field331.method2782(130);
                            client.field331.method2538(0);
                            int var454 = client.field331.field2105;
                            client.field331.method2543(var452);
                            class160 var455 = client.field331;
                            int var456 = var455.field2105;
                            int var457 = var453.length();
                            byte[] var458 = new byte[var457];
                            for (int var459 = 0; var459 < var457; var459++) {
                                char var460 = var453.charAt(var459);
                                if (var460 > 0 && var460 < 128 || var460 >= 160 && var460 <= 255) {
                                    var458[var459] = (byte) var460;
                                } else if (var460 == 8364) {
                                    var458[var459] = -128;
                                } else if (var460 == 8218) {
                                    var458[var459] = -126;
                                } else if (var460 == 402) {
                                    var458[var459] = -125;
                                } else if (var460 == 8222) {
                                    var458[var459] = -124;
                                } else if (var460 == 8230) {
                                    var458[var459] = -123;
                                } else if (var460 == 8224) {
                                    var458[var459] = -122;
                                } else if (var460 == 8225) {
                                    var458[var459] = -121;
                                } else if (var460 == 710) {
                                    var458[var459] = -120;
                                } else if (var460 == 8240) {
                                    var458[var459] = -119;
                                } else if (var460 == 352) {
                                    var458[var459] = -118;
                                } else if (var460 == 8249) {
                                    var458[var459] = -117;
                                } else if (var460 == 338) {
                                    var458[var459] = -116;
                                } else if (var460 == 381) {
                                    var458[var459] = -114;
                                } else if (var460 == 8216) {
                                    var458[var459] = -111;
                                } else if (var460 == 8217) {
                                    var458[var459] = -110;
                                } else if (var460 == 8220) {
                                    var458[var459] = -109;
                                } else if (var460 == 8221) {
                                    var458[var459] = -108;
                                } else if (var460 == 8226) {
                                    var458[var459] = -107;
                                } else if (var460 == 8211) {
                                    var458[var459] = -106;
                                } else if (var460 == 8212) {
                                    var458[var459] = -105;
                                } else if (var460 == 732) {
                                    var458[var459] = -104;
                                } else if (var460 == 8482) {
                                    var458[var459] = -103;
                                } else if (var460 == 353) {
                                    var458[var459] = -102;
                                } else if (var460 == 8250) {
                                    var458[var459] = -101;
                                } else if (var460 == 339) {
                                    var458[var459] = -100;
                                } else if (var460 == 382) {
                                    var458[var459] = -98;
                                } else if (var460 == 376) {
                                    var458[var459] = -97;
                                } else {
                                    var458[var459] = 63;
                                }
                            }
                            var455.method2550(var458.length);
                            var455.field2105 += Statics.field79.method2484(var458, 0, var458.length, var455.field2108, var455.field2105);
                            client.field331.method2548(client.field331.field2105 - var454);
                            continue;
                        }
                        if (var489 == 5015) {
                            String var463;
                            if (Statics.field43 == null || Statics.field43.field264 == null) {
                                var463 = "";
                            } else {
                                var463 = Statics.field43.field264;
                            }
                            field729[var6++] = var463;
                            continue;
                        }
                        if (var489 == 5016) {
                            field733[var5++] = client.field504;
                            continue;
                        }
                        if (var489 == 5017) {
                            var5--;
                            int var464 = field733[var5];
                            field733[var5++] = class48.method204(var464);
                            continue;
                        }
                        if (var489 == 5018) {
                            var5--;
                            int var465 = field733[var5];
                            field733[var5++] = class48.method1906(var465);
                            continue;
                        }
                        if (var489 == 5019) {
                            var5--;
                            int var466 = field733[var5];
                            field733[var5++] = class48.method725(var466);
                            continue;
                        }
                        if (var489 == 5020) {
                            var6--;
                            String var467 = field729[var6];
                            if (var467.equalsIgnoreCase("toggleroof")) {
                                Statics.field36.field700 = !Statics.field36.field700;
                                class31.method2089();
                                if (Statics.field36.field700) {
                                    class48.method184(99, "", "Roofs are now all hidden");
                                } else {
                                    class48.method184(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var467.equalsIgnoreCase("displayfps")) {
                                client.field476 = !client.field476;
                            }
                            if (client.field452 >= 2) {
                                if (var467.equalsIgnoreCase("fpson")) {
                                    client.field476 = true;
                                }
                                if (var467.equalsIgnoreCase("fpsoff")) {
                                    client.field476 = false;
                                }
                                if (var467.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var467.equalsIgnoreCase("clientdrop")) {
                                    client.method1760();
                                }
                                if (var467.equalsIgnoreCase("errortest") && client.field429 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field331.method2782(54);
                            client.field331.method2641(var467.length() + 1);
                            client.field331.method2543(var467);
                            continue;
                        }
                        if (var489 == 5021) {
                            var6--;
                            client.field304 = field729[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var489 == 5022) {
                            field729[var6++] = client.field304;
                            continue;
                        }
                    }
                }
                if (var489 < 5400) {
                    if (var489 == 5306) {
                        field733[var5++] = client.method856();
                        continue;
                    }
                    if (var489 == 5307) {
                        var5--;
                        int var468 = field733[var5];
                        if (var468 != 1 && var468 != 2) {
                            continue;
                        }
                        client.field498 = 0L;
                        if (var468 >= 2) {
                            client.field499 = true;
                        } else {
                            client.field499 = false;
                        }
                        client.method90();
                        if (client.field297 >= 25) {
                            client.field331.method2782(92);
                            client.field331.method2641(client.method856());
                            client.field331.method2538(Statics.field1201);
                            client.field331.method2538(Statics.field1585);
                        }
                        class114.field1798 = true;
                        continue;
                    }
                    if (var489 == 5308) {
                        field733[var5++] = Statics.field36.field702;
                        continue;
                    }
                    if (var489 == 5309) {
                        var5--;
                        int var469 = field733[var5];
                        if (var469 == 1 || var469 == 2) {
                            Statics.field36.field702 = var469;
                            class31.method2089();
                        }
                        continue;
                    }
                }
                if (var489 < 5600) {
                    if (var489 == 5504) {
                        var5 -= 2;
                        int var470 = field733[var5];
                        int var471 = field733[var5 + 1];
                        if (!client.field555) {
                            client.field371 = var470;
                            client.field372 = var471;
                        }
                        continue;
                    }
                    if (var489 == 5505) {
                        field733[var5++] = client.field371;
                        continue;
                    }
                    if (var489 == 5506) {
                        field733[var5++] = client.field372;
                        continue;
                    }
                    if (var489 == 5530) {
                        var5--;
                        int var472 = field733[var5];
                        if (var472 < 0) {
                            var472 = 0;
                        }
                        client.field322 = var472;
                        continue;
                    }
                    if (var489 == 5531) {
                        field733[var5++] = client.field322;
                        continue;
                    }
                }
                if (var489 >= 5700 || var489 != 5630) {
                    if (var489 < 6300) {
                        if (var489 == 6200) {
                            var5 -= 2;
                            client.field539 = (short) field733[var5];
                            if (client.field539 <= 0) {
                                client.field539 = 256;
                            }
                            client.field540 = (short) field733[var5 + 1];
                            if (client.field540 <= 0) {
                                client.field540 = 205;
                            }
                            continue;
                        }
                        if (var489 == 6201) {
                            var5 -= 2;
                            client.field367 = (short) field733[var5];
                            if (client.field367 <= 0) {
                                client.field367 = 256;
                            }
                            client.field395 = (short) field733[var5 + 1];
                            if (client.field395 <= 0) {
                                client.field395 = 320;
                            }
                            continue;
                        }
                        if (var489 == 6202) {
                            var5 -= 4;
                            client.field398 = (short) field733[var5];
                            if (client.field398 <= 0) {
                                client.field398 = 1;
                            }
                            client.field463 = (short) field733[var5 + 1];
                            if (client.field463 <= 0) {
                                client.field463 = 32767;
                            } else if (client.field463 < client.field398) {
                                client.field463 = client.field398;
                            }
                            client.field545 = (short) field733[var5 + 2];
                            if (client.field545 <= 0) {
                                client.field545 = 1;
                            }
                            client.field511 = (short) field733[var5 + 3];
                            if (client.field511 <= 0) {
                                client.field511 = 32767;
                            } else if (client.field511 < client.field545) {
                                client.field511 = client.field545;
                            }
                            continue;
                        }
                        if (var489 == 6203) {
                            if (client.field567 == null) {
                                field733[var5++] = -1;
                                field733[var5++] = -1;
                            } else {
                                client.method3508(0, 0, client.field567.field2223, client.field567.field2224, false);
                                field733[var5++] = client.field549;
                                field733[var5++] = client.field550;
                            }
                            continue;
                        }
                        if (var489 == 6204) {
                            field733[var5++] = client.field367;
                            field733[var5++] = client.field395;
                            continue;
                        }
                        if (var489 == 6205) {
                            field733[var5++] = client.field539;
                            field733[var5++] = client.field540;
                            continue;
                        }
                    }
                    if (var489 < 6600) {
                        if (var489 == 6500) {
                            field733[var5++] = class30.method560() ? 1 : 0;
                            continue;
                        }
                        if (var489 == 6501) {
                            class30.field681 = 0;
                            class30 var473 = class30.method1355();
                            if (var473 == null) {
                                field733[var5++] = -1;
                                field733[var5++] = 0;
                                field729[var6++] = "";
                                field733[var5++] = 0;
                                field733[var5++] = 0;
                                field729[var6++] = "";
                            } else {
                                field733[var5++] = var473.field685;
                                field733[var5++] = var473.field695;
                                field729[var6++] = var473.field689;
                                field733[var5++] = var473.field690;
                                field733[var5++] = var473.field687;
                                field729[var6++] = var473.field688;
                            }
                            continue;
                        }
                        if (var489 == 6502) {
                            class30 var475 = class30.method1355();
                            if (var475 == null) {
                                field733[var5++] = -1;
                                field733[var5++] = 0;
                                field729[var6++] = "";
                                field733[var5++] = 0;
                                field733[var5++] = 0;
                                field729[var6++] = "";
                            } else {
                                field733[var5++] = var475.field685;
                                field733[var5++] = var475.field695;
                                field729[var6++] = var475.field689;
                                field733[var5++] = var475.field690;
                                field733[var5++] = var475.field687;
                                field729[var6++] = var475.field688;
                            }
                            continue;
                        }
                        if (var489 == 6506) {
                            var5--;
                            int var476 = field733[var5];
                            class30 var477 = null;
                            for (int var478 = 0; var478 < class30.field680; var478++) {
                                if (Statics.field692[var478].field685 == var476) {
                                    var477 = Statics.field692[var478];
                                    break;
                                }
                            }
                            if (var477 == null) {
                                field733[var5++] = -1;
                                field733[var5++] = 0;
                                field729[var6++] = "";
                                field733[var5++] = 0;
                                field733[var5++] = 0;
                                field729[var6++] = "";
                            } else {
                                field733[var5++] = var477.field685;
                                field733[var5++] = var477.field695;
                                field729[var6++] = var477.field689;
                                field733[var5++] = var477.field690;
                                field733[var5++] = var477.field687;
                                field729[var6++] = var477.field688;
                            }
                            continue;
                        }
                        if (var489 == 6507) {
                            var5 -= 4;
                            int var479 = field733[var5];
                            boolean var480 = field733[var5 + 1] == 1;
                            int var481 = field733[var5 + 2];
                            boolean var482 = field733[var5 + 3] == 1;
                            if (Statics.field692 != null) {
                                class30.method761(0, Statics.field692.length - 1, var479, var480, var481, var482);
                            }
                            continue;
                        }
                        if (var489 == 6511) {
                            var5--;
                            int var483 = field733[var5];
                            if (var483 >= 0 && var483 < class30.field680) {
                                class30 var484 = Statics.field692[var483];
                                field733[var5++] = var484.field685;
                                field733[var5++] = var484.field695;
                                field729[var6++] = var484.field689;
                                field733[var5++] = var484.field690;
                                field733[var5++] = var484.field687;
                                field729[var6++] = var484.field688;
                                continue;
                            }
                            field733[var5++] = -1;
                            field733[var5++] = 0;
                            field729[var6++] = "";
                            field733[var5++] = 0;
                            field733[var5++] = 0;
                            field729[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field341 = 250;
            }
        } catch (Exception var488) {
            StringBuilder var486 = new StringBuilder(30);
            var486.append("").append(var4.field1894).append(" ");
            for (int var487 = field735 - 1; var487 >= 0; var487--) {
                var486.append("").append(field736[var487].field114.field1894).append(" ");
            }
            var486.append("").append(var10);
            class102.method1762(var486.toString(), var488);
        }
    }

    @ObfuscatedName("t.b(II)V")
    public static void method208(int arg0) {
        if (arg0 == -1 || !class170.method26(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2257[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3.field2289 != null) {
                class19 var4 = new class19();
                var4.field194 = var3;
                var4.field204 = var3.field2289;
                method163(var4, 2000000);
            }
        }
    }
}
