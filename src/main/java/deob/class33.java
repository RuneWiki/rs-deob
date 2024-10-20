package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ae")
public class class33 {

    @ObfuscatedName("ae.a")
    public static int[] field730 = new int[5];

    @ObfuscatedName("ae.g")
    public static int[][] field733 = new int[5][5000];

    @ObfuscatedName("ae.k")
    public static int[] field729 = new int[1000];

    @ObfuscatedName("ae.u")
    public static String[] field727 = new String[1000];

    @ObfuscatedName("ae.b")
    public static int field736 = 0;

    @ObfuscatedName("ae.x")
    public static class12[] field731 = new class12[50];

    @ObfuscatedName("ae.m")
    public static Calendar field724 = Calendar.getInstance();

    @ObfuscatedName("ae.j")
    public static final String[] field734 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ae.w")
    public static int field735 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.s(Lz;I)V")
    public static void method592(class19 arg0) {
        method1923(arg0, 200000);
    }

    @ObfuscatedName("dn.c(Lz;IB)V")
    public static void method1923(class19 arg0, int arg1) {
        Object[] var2 = arg0.field206;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method3225(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field937;
        int[] var9 = var4.field935;
        byte var10 = -1;
        field736 = 0;
        try {
            Statics.field2 = new int[var4.field941];
            int var11 = 0;
            Statics.field725 = new String[var4.field938];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field210;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field207;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field205 == null ? -1 : arg0.field205.field2210;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field209;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field205 == null ? -1 : arg0.field205.field2211;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field217 == null ? -1 : arg0.field217.field2210;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field217 == null ? -1 : arg0.field217.field2211;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field215;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field208;
                    }
                    Statics.field2[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field203;
                    }
                    Statics.field725[var12++] = var15;
                }
            }
            int var16 = 0;
            field735 = arg0.field213;
            label3064: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var505 = var8[var7];
                if (var505 < 100) {
                    if (var505 == 0) {
                        field729[var5++] = var9[var7];
                        continue;
                    }
                    if (var505 == 1) {
                        int var17 = var9[var7];
                        field729[var5++] = class166.field2176[var17];
                        continue;
                    }
                    if (var505 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class166.field2176[var18] = field729[var5];
                        client.method27(var18);
                        continue;
                    }
                    if (var505 == 3) {
                        field727[var6++] = var4.field936[var7];
                        continue;
                    }
                    if (var505 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var505 == 7) {
                        var5 -= 2;
                        if (field729[var5 + 1] != field729[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var505 == 8) {
                        var5 -= 2;
                        if (field729[var5 + 1] == field729[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var505 == 9) {
                        var5 -= 2;
                        if (field729[var5] < field729[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var505 == 10) {
                        var5 -= 2;
                        if (field729[var5] > field729[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var505 == 21) {
                        if (field736 == 0) {
                            return;
                        }
                        class12 var19 = field731[--field736];
                        var4 = var19.field123;
                        var8 = var4.field937;
                        var9 = var4.field935;
                        var7 = var19.field114;
                        Statics.field2 = var19.field115;
                        Statics.field725 = var19.field122;
                        continue;
                    }
                    if (var505 == 25) {
                        int var20 = var9[var7];
                        field729[var5++] = class166.method175(var20);
                        continue;
                    }
                    if (var505 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field729[var5];
                        class195 var23 = Statics.method1913(var21);
                        int var24 = var23.field2854;
                        int var25 = var23.field2852;
                        int var26 = var23.field2856;
                        int var27 = class166.field2174[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class166.field2176[var24] = class166.field2176[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var505 == 31) {
                        var5 -= 2;
                        if (field729[var5] <= field729[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var505 == 32) {
                        var5 -= 2;
                        if (field729[var5] >= field729[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var505 == 33) {
                        field729[var5++] = Statics.field2[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var505 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2[var10001] = field729[var5];
                        continue;
                    }
                    if (var505 == 35) {
                        field727[var6++] = Statics.field725[var9[var7]];
                        continue;
                    }
                    if (var505 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field725[var10001] = field727[var6];
                        continue;
                    }
                    if (var505 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field727;
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
                        field727[var6++] = var31;
                        continue;
                    }
                    if (var505 == 38) {
                        var5--;
                        continue;
                    }
                    if (var505 == 39) {
                        var6--;
                        continue;
                    }
                    if (var505 == 40) {
                        int var41 = var9[var7];
                        class49 var42 = class49.method3225(var41);
                        int[] var43 = new int[var42.field941];
                        String[] var44 = new String[var42.field938];
                        for (int var45 = 0; var45 < var42.field944; var45++) {
                            var43[var45] = field729[var5 - var42.field944 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field940; var46++) {
                            var44[var46] = field727[var6 - var42.field940 + var46];
                        }
                        var5 -= var42.field944;
                        var6 -= var42.field940;
                        class12 var47 = new class12();
                        var47.field123 = var4;
                        var47.field114 = var7;
                        var47.field115 = Statics.field2;
                        var47.field122 = Statics.field725;
                        field731[++field736 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field937;
                        var9 = var42.field935;
                        var7 = -1;
                        Statics.field2 = var43;
                        Statics.field725 = var44;
                        continue;
                    }
                    if (var505 == 42) {
                        field729[var5++] = Statics.field490.method784(var9[var7]);
                        continue;
                    }
                    if (var505 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field490.method783(var10001, field729[var5]);
                        continue;
                    }
                    if (var505 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field729[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field730[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label3064;
                                }
                                field733[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var505 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field729[var5];
                        if (var54 >= 0 && var54 < field730[var53]) {
                            field729[var5++] = field733[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var505 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field729[var5];
                        if (var56 >= 0 && var56 < field730[var55]) {
                            field733[var55][var56] = field729[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var505 == 47) {
                        String var57 = Statics.field490.method786(var9[var7]);
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field727[var6++] = var57;
                        continue;
                    }
                    if (var505 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field490.method785(var10001, field727[var6]);
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var505 < 1000) {
                    if (var505 == 100) {
                        var5 -= 3;
                        int var59 = field729[var5];
                        int var60 = field729[var5 + 1];
                        int var61 = field729[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class170 var62 = class170.method1882(var59);
                        if (var62.field2237 == null) {
                            var62.field2237 = new class170[var61 + 1];
                        }
                        if (var62.field2237.length <= var61) {
                            class170[] var63 = new class170[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2237.length; var64++) {
                                var63[var64] = var62.field2237[var64];
                            }
                            var62.field2237 = var63;
                        }
                        if (var61 > 0 && var62.field2237[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class170 var65 = new class170();
                        var65.field2272 = var60;
                        var65.field2229 = var65.field2210 = var62.field2210;
                        var65.field2211 = var61;
                        var65.field2209 = true;
                        var62.field2237[var61] = var65;
                        if (var58) {
                            Statics.field182 = var65;
                        } else {
                            Statics.field728 = var65;
                        }
                        client.method3468(var62);
                        continue;
                    }
                    if (var505 == 101) {
                        class170 var66 = var58 ? Statics.field182 : Statics.field728;
                        class170 var67 = class170.method1882(var66.field2210);
                        var67.field2237[var66.field2211] = null;
                        client.method3468(var67);
                        continue;
                    }
                    if (var505 == 102) {
                        var5--;
                        class170 var68 = class170.method1882(field729[var5]);
                        var68.field2237 = null;
                        client.method3468(var68);
                        continue;
                    }
                    if (var505 == 200) {
                        var5 -= 2;
                        int var69 = field729[var5];
                        int var70 = field729[var5 + 1];
                        class170 var71 = class170.method1922(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field729[var5++] = 1;
                            if (var58) {
                                Statics.field182 = var71;
                            } else {
                                Statics.field728 = var71;
                            }
                            continue;
                        }
                        field729[var5++] = 0;
                        continue;
                    }
                    if (var505 == 201) {
                        var5--;
                        class170 var72 = class170.method1882(field729[var5]);
                        if (var72 == null) {
                            field729[var5++] = 0;
                        } else {
                            field729[var5++] = 1;
                            if (var58) {
                                Statics.field182 = var72;
                            } else {
                                Statics.field728 = var72;
                            }
                        }
                        continue;
                    }
                } else if (var505 >= 1000 && var505 < 1100 || var505 >= 2000 && var505 < 2100) {
                    int var73 = -1;
                    class170 var74;
                    if (var505 >= 2000) {
                        var505 -= 1000;
                        var5--;
                        var73 = field729[var5];
                        var74 = class170.method1882(var73);
                    } else {
                        var74 = var58 ? Statics.field182 : Statics.field728;
                    }
                    if (var505 == 1000) {
                        var5 -= 4;
                        var74.field2219 = field729[var5];
                        var74.field2220 = field729[var5 + 1];
                        var74.field2215 = field729[var5 + 2];
                        var74.field2216 = field729[var5 + 3];
                        client.method3468(var74);
                        client.method1797(var74);
                        if (var73 != -1 && var74.field2272 == 0) {
                            client.method15(Statics.field2334[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var505 == 1001) {
                        var5 -= 4;
                        var74.field2245 = field729[var5];
                        var74.field2222 = field729[var5 + 1];
                        var74.field2217 = field729[var5 + 2];
                        var74.field2327 = field729[var5 + 3];
                        client.method3468(var74);
                        client.method1797(var74);
                        if (var73 != -1 && var74.field2272 == 0) {
                            client.method15(Statics.field2334[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var505 == 1003) {
                        var5--;
                        boolean var75 = field729[var5] == 1;
                        if (var74.field2230 != var75) {
                            var74.field2230 = var75;
                            client.method3468(var74);
                        }
                        continue;
                    }
                    if (var505 == 1005) {
                        var5--;
                        var74.field2343 = field729[var5] == 1;
                        continue;
                    }
                    if (var505 == 1006) {
                        var5--;
                        var74.field2221 = field729[var5] == 1;
                        continue;
                    }
                } else if (!(var505 < 1100 || var505 >= 1200) || !(var505 < 2100 || var505 >= 2200)) {
                    int var76 = -1;
                    class170 var77;
                    if (var505 >= 2000) {
                        var505 -= 1000;
                        var5--;
                        var76 = field729[var5];
                        var77 = class170.method1882(var76);
                    } else {
                        var77 = var58 ? Statics.field182 : Statics.field728;
                    }
                    if (var505 == 1100) {
                        var5 -= 2;
                        var77.field2231 = field729[var5];
                        if (var77.field2231 > var77.field2330 - var77.field2225) {
                            var77.field2231 = var77.field2330 - var77.field2225;
                        }
                        if (var77.field2231 < 0) {
                            var77.field2231 = 0;
                        }
                        var77.field2305 = field729[var5 + 1];
                        if (var77.field2305 > var77.field2300 - var77.field2226) {
                            var77.field2305 = var77.field2300 - var77.field2226;
                        }
                        if (var77.field2305 < 0) {
                            var77.field2305 = 0;
                        }
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1101) {
                        var5--;
                        var77.field2287 = field729[var5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1102) {
                        var5--;
                        var77.field2239 = field729[var5] == 1;
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1103) {
                        var5--;
                        var77.field2254 = field729[var5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1104) {
                        var5--;
                        var77.field2299 = field729[var5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1105) {
                        var5--;
                        var77.field2325 = field729[var5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1106) {
                        var5--;
                        var77.field2247 = field729[var5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1107) {
                        var5--;
                        var77.field2248 = field729[var5] == 1;
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1108) {
                        var77.field2233 = 1;
                        var5--;
                        var77.field2252 = field729[var5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1109) {
                        var5 -= 6;
                        var77.field2298 = field729[var5];
                        var77.field2260 = field729[var5 + 1];
                        var77.field2261 = field729[var5 + 2];
                        var77.field2262 = field729[var5 + 3];
                        var77.field2263 = field729[var5 + 4];
                        var77.field2264 = field729[var5 + 5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1110) {
                        var5--;
                        int var78 = field729[var5];
                        if (var77.field2257 != var78) {
                            var77.field2257 = var78;
                            var77.field2332 = 0;
                            var77.field2333 = 0;
                            client.method3468(var77);
                        }
                        continue;
                    }
                    if (var505 == 1111) {
                        var5--;
                        var77.field2269 = field729[var5] == 1;
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1112) {
                        var6--;
                        String var79 = field727[var6];
                        if (!var79.equals(var77.field2270)) {
                            var77.field2270 = var79;
                            client.method3468(var77);
                        }
                        continue;
                    }
                    if (var505 == 1113) {
                        var5--;
                        var77.field2281 = field729[var5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1114) {
                        var5 -= 3;
                        var77.field2273 = field729[var5];
                        var77.field2274 = field729[var5 + 1];
                        var77.field2235 = field729[var5 + 2];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1115) {
                        var5--;
                        var77.field2275 = field729[var5] == 1;
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1116) {
                        var5--;
                        var77.field2218 = field729[var5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1117) {
                        var5--;
                        var77.field2250 = field729[var5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1118) {
                        var5--;
                        var77.field2251 = field729[var5] == 1;
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1119) {
                        var5--;
                        var77.field2271 = field729[var5] == 1;
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1120) {
                        var5 -= 2;
                        var77.field2330 = field729[var5];
                        var77.field2300 = field729[var5 + 1];
                        client.method3468(var77);
                        if (var76 != -1 && var77.field2272 == 0) {
                            client.method15(Statics.field2334[var76 >> 16], var77, false);
                        }
                        continue;
                    }
                    if (var505 == 1121) {
                        int var80 = var77.field2210;
                        int var81 = var77.field2211;
                        client.field337.method2775(115);
                        client.field337.method2587(var80);
                        client.field337.method2532(var81);
                        client.field456 = var77;
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1122) {
                        var5--;
                        var77.field2246 = field729[var5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1123) {
                        var5--;
                        var77.field2236 = field729[var5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1124) {
                        var5--;
                        var77.field2242 = field729[var5];
                        client.method3468(var77);
                        continue;
                    }
                    if (var505 == 1125) {
                        var5--;
                        int var82 = field729[var5];
                        class222[] var83 = new class222[] { class222.field3190, class222.field3189, class222.field3195, class222.field3188, class222.field3191 };
                        class222 var84 = (class222) class149.method1293(var83, var82);
                        if (var84 != null) {
                            var77.field2289 = var84;
                            client.method3468(var77);
                        }
                        continue;
                    }
                } else if (var505 >= 1200 && var505 < 1300 || var505 >= 2200 && var505 < 2300) {
                    class170 var85;
                    if (var505 >= 2000) {
                        var505 -= 1000;
                        var5--;
                        var85 = class170.method1882(field729[var5]);
                    } else {
                        var85 = var58 ? Statics.field182 : Statics.field728;
                    }
                    client.method3468(var85);
                    if (var505 == 1200 || var505 == 1205 || var505 == 1212) {
                        var5 -= 2;
                        int var86 = field729[var5];
                        int var87 = field729[var5 + 1];
                        var85.field2285 = var86;
                        var85.field2331 = var87;
                        class199 var88 = class199.method699(var86);
                        var85.field2261 = var88.field2967;
                        var85.field2262 = var88.field2962;
                        var85.field2263 = var88.field2969;
                        var85.field2298 = var88.field2985;
                        var85.field2260 = var88.field2968;
                        var85.field2264 = var88.field2966;
                        if (var505 == 1205) {
                            var85.field2268 = 0;
                        } else if (var505 == 1212 | var88.field2990 == 1) {
                            var85.field2268 = 1;
                        } else {
                            var85.field2268 = 2;
                        }
                        if (var85.field2266 > 0) {
                            var85.field2264 = var85.field2264 * 32 / var85.field2266;
                        } else if (var85.field2245 > 0) {
                            var85.field2264 = var85.field2264 * 32 / var85.field2245;
                        }
                        continue;
                    }
                    if (var505 == 1201) {
                        var85.field2233 = 2;
                        var5--;
                        var85.field2252 = field729[var5];
                        continue;
                    }
                    if (var505 == 1202) {
                        var85.field2233 = 3;
                        var85.field2252 = Statics.field129.field272.method2861();
                        continue;
                    }
                } else if ((var505 < 1300 || var505 >= 1400) && (var505 < 2300 || var505 >= 2400)) {
                    if (var505 >= 1400 && var505 < 1500 || var505 >= 2400 && var505 < 2500) {
                        class170 var93;
                        if (var505 >= 2000) {
                            var505 -= 1000;
                            var5--;
                            var93 = class170.method1882(field729[var5]);
                        } else {
                            var93 = var58 ? Statics.field182 : Statics.field728;
                        }
                        var6--;
                        String var94 = field727[var6];
                        int[] var95 = null;
                        if (var94.length() > 0 && var94.charAt(var94.length() - 1) == 'Y') {
                            var5--;
                            int var96 = field729[var5];
                            if (var96 > 0) {
                                var95 = new int[var96];
                                while (var96-- > 0) {
                                    var5--;
                                    var95[var96] = field729[var5];
                                }
                            }
                            var94 = var94.substring(0, var94.length() - 1);
                        }
                        Object[] var97 = new Object[var94.length() + 1];
                        for (int var98 = var97.length - 1; var98 >= 1; var98--) {
                            if (var94.charAt(var98 - 1) == 's') {
                                var6--;
                                var97[var98] = field727[var6];
                            } else {
                                var5--;
                                var97[var98] = Integer.valueOf(field729[var5]);
                            }
                        }
                        var5--;
                        int var99 = field729[var5];
                        if (var99 == -1) {
                            var97 = null;
                        } else {
                            var97[0] = Integer.valueOf(var99);
                        }
                        if (var505 == 1400) {
                            var93.field2259 = var97;
                        }
                        if (var505 == 1401) {
                            var93.field2295 = var97;
                        }
                        if (var505 == 1402) {
                            var93.field2253 = var97;
                        }
                        if (var505 == 1403) {
                            var93.field2296 = var97;
                        }
                        if (var505 == 1404) {
                            var93.field2329 = var97;
                        }
                        if (var505 == 1405) {
                            var93.field2234 = var97;
                        }
                        if (var505 == 1406) {
                            var93.field2302 = var97;
                        }
                        if (var505 == 1407) {
                            var93.field2303 = var97;
                            var93.field2294 = var95;
                        }
                        if (var505 == 1408) {
                            var93.field2309 = var97;
                        }
                        if (var505 == 1409) {
                            var93.field2310 = var97;
                        }
                        if (var505 == 1410) {
                            var93.field2255 = var97;
                        }
                        if (var505 == 1411) {
                            var93.field2293 = var97;
                        }
                        if (var505 == 1412) {
                            var93.field2297 = var97;
                        }
                        if (var505 == 1414) {
                            var93.field2249 = var97;
                            var93.field2306 = var95;
                        }
                        if (var505 == 1415) {
                            var93.field2307 = var97;
                            var93.field2308 = var95;
                        }
                        if (var505 == 1416) {
                            var93.field2301 = var97;
                        }
                        if (var505 == 1417) {
                            var93.field2344 = var97;
                        }
                        if (var505 == 1418) {
                            var93.field2312 = var97;
                        }
                        if (var505 == 1419) {
                            var93.field2202 = var97;
                        }
                        if (var505 == 1420) {
                            var93.field2338 = var97;
                        }
                        if (var505 == 1421) {
                            var93.field2315 = var97;
                        }
                        if (var505 == 1422) {
                            var93.field2316 = var97;
                        }
                        if (var505 == 1423) {
                            var93.field2317 = var97;
                        }
                        if (var505 == 1424) {
                            var93.field2318 = var97;
                        }
                        if (var505 == 1425) {
                            var93.field2320 = var97;
                        }
                        if (var505 == 1426) {
                            var93.field2321 = var97;
                        }
                        if (var505 == 1427) {
                            var93.field2319 = var97;
                        }
                        var93.field2290 = true;
                        continue;
                    }
                    if (var505 < 1600) {
                        class170 var100 = var58 ? Statics.field182 : Statics.field728;
                        if (var505 == 1500) {
                            field729[var5++] = var100.field2223;
                            continue;
                        }
                        if (var505 == 1501) {
                            field729[var5++] = var100.field2224;
                            continue;
                        }
                        if (var505 == 1502) {
                            field729[var5++] = var100.field2225;
                            continue;
                        }
                        if (var505 == 1503) {
                            field729[var5++] = var100.field2226;
                            continue;
                        }
                        if (var505 == 1504) {
                            field729[var5++] = var100.field2230 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 1505) {
                            field729[var5++] = var100.field2229;
                            continue;
                        }
                    } else if (var505 < 1700) {
                        class170 var101 = var58 ? Statics.field182 : Statics.field728;
                        if (var505 == 1600) {
                            field729[var5++] = var101.field2231;
                            continue;
                        }
                        if (var505 == 1601) {
                            field729[var5++] = var101.field2305;
                            continue;
                        }
                        if (var505 == 1602) {
                            field727[var6++] = var101.field2270;
                            continue;
                        }
                        if (var505 == 1603) {
                            field729[var5++] = var101.field2330;
                            continue;
                        }
                        if (var505 == 1604) {
                            field729[var5++] = var101.field2300;
                            continue;
                        }
                        if (var505 == 1605) {
                            field729[var5++] = var101.field2264;
                            continue;
                        }
                        if (var505 == 1606) {
                            field729[var5++] = var101.field2261;
                            continue;
                        }
                        if (var505 == 1607) {
                            field729[var5++] = var101.field2263;
                            continue;
                        }
                        if (var505 == 1608) {
                            field729[var5++] = var101.field2262;
                            continue;
                        }
                        if (var505 == 1609) {
                            field729[var5++] = var101.field2254;
                            continue;
                        }
                        if (var505 == 1610) {
                            field729[var5++] = var101.field2242;
                            continue;
                        }
                        if (var505 == 1611) {
                            field729[var5++] = var101.field2287;
                            continue;
                        }
                        if (var505 == 1612) {
                            field729[var5++] = var101.field2236;
                            continue;
                        }
                        if (var505 == 1613) {
                            field729[var5++] = var101.field2289.method713();
                            continue;
                        }
                    } else if (var505 < 1800) {
                        class170 var102 = var58 ? Statics.field182 : Statics.field728;
                        if (var505 == 1700) {
                            field729[var5++] = var102.field2285;
                            continue;
                        }
                        if (var505 == 1701) {
                            if (var102.field2285 == -1) {
                                field729[var5++] = 0;
                            } else {
                                field729[var5++] = var102.field2331;
                            }
                            continue;
                        }
                        if (var505 == 1702) {
                            field729[var5++] = var102.field2211;
                            continue;
                        }
                    } else if (var505 < 1900) {
                        class170 var103 = var58 ? Statics.field182 : Statics.field728;
                        if (var505 == 1800) {
                            field729[var5++] = class171.method1762(client.method2959(var103));
                            continue;
                        }
                        if (var505 == 1801) {
                            var5--;
                            int var104 = field729[var5];
                            int var506 = var104 - 1;
                            if (var103.field2284 != null && var506 < var103.field2284.length && var103.field2284[var506] != null) {
                                field727[var6++] = var103.field2284[var506];
                                continue;
                            }
                            field727[var6++] = "";
                            continue;
                        }
                        if (var505 == 1802) {
                            if (var103.field2304 == null) {
                                field727[var6++] = "";
                            } else {
                                field727[var6++] = var103.field2304;
                            }
                            continue;
                        }
                    } else if (var505 >= 1900 && var505 < 2000 || var505 >= 2900 && var505 < 3000) {
                        class170 var105;
                        if (var505 >= 2000) {
                            var505 -= 1000;
                            var5--;
                            var105 = class170.method1882(field729[var5]);
                        } else {
                            var105 = var58 ? Statics.field182 : Statics.field728;
                        }
                        if (var505 == 1927) {
                            if (field735 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var105.field2319 == null) {
                                return;
                            }
                            class19 var106 = new class19();
                            var106.field205 = var105;
                            var106.field206 = var105.field2319;
                            var106.field213 = field735 + 1;
                            client.field418.method2190(arg0);
                            continue;
                        }
                    } else if (var505 < 2600) {
                        var5--;
                        class170 var107 = class170.method1882(field729[var5]);
                        if (var505 == 2500) {
                            field729[var5++] = var107.field2223;
                            continue;
                        }
                        if (var505 == 2501) {
                            field729[var5++] = var107.field2224;
                            continue;
                        }
                        if (var505 == 2502) {
                            field729[var5++] = var107.field2225;
                            continue;
                        }
                        if (var505 == 2503) {
                            field729[var5++] = var107.field2226;
                            continue;
                        }
                        if (var505 == 2504) {
                            field729[var5++] = var107.field2230 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 2505) {
                            field729[var5++] = var107.field2229;
                            continue;
                        }
                    } else if (var505 < 2700) {
                        var5--;
                        class170 var108 = class170.method1882(field729[var5]);
                        if (var505 == 2600) {
                            field729[var5++] = var108.field2231;
                            continue;
                        }
                        if (var505 == 2601) {
                            field729[var5++] = var108.field2305;
                            continue;
                        }
                        if (var505 == 2602) {
                            field727[var6++] = var108.field2270;
                            continue;
                        }
                        if (var505 == 2603) {
                            field729[var5++] = var108.field2330;
                            continue;
                        }
                        if (var505 == 2604) {
                            field729[var5++] = var108.field2300;
                            continue;
                        }
                        if (var505 == 2605) {
                            field729[var5++] = var108.field2264;
                            continue;
                        }
                        if (var505 == 2606) {
                            field729[var5++] = var108.field2261;
                            continue;
                        }
                        if (var505 == 2607) {
                            field729[var5++] = var108.field2263;
                            continue;
                        }
                        if (var505 == 2608) {
                            field729[var5++] = var108.field2262;
                            continue;
                        }
                        if (var505 == 2609) {
                            field729[var5++] = var108.field2254;
                            continue;
                        }
                        if (var505 == 2610) {
                            field729[var5++] = var108.field2242;
                            continue;
                        }
                        if (var505 == 2611) {
                            field729[var5++] = var108.field2287;
                            continue;
                        }
                        if (var505 == 2612) {
                            field729[var5++] = var108.field2236;
                            continue;
                        }
                        if (var505 == 2613) {
                            field729[var5++] = var108.field2289.method713();
                            continue;
                        }
                    } else if (var505 < 2800) {
                        if (var505 == 2700) {
                            var5--;
                            class170 var109 = class170.method1882(field729[var5]);
                            field729[var5++] = var109.field2285;
                            continue;
                        }
                        if (var505 == 2701) {
                            var5--;
                            class170 var110 = class170.method1882(field729[var5]);
                            if (var110.field2285 == -1) {
                                field729[var5++] = 0;
                            } else {
                                field729[var5++] = var110.field2331;
                            }
                            continue;
                        }
                        if (var505 == 2702) {
                            var5--;
                            int var111 = field729[var5];
                            class18 var112 = (class18) client.field453.method2131((long) var111);
                            if (var112 == null) {
                                field729[var5++] = 0;
                            } else {
                                field729[var5++] = 1;
                            }
                            continue;
                        }
                        if (var505 == 2706) {
                            field729[var5++] = client.field452;
                            continue;
                        }
                    } else if (var505 < 2900) {
                        var5--;
                        class170 var113 = class170.method1882(field729[var5]);
                        if (var505 == 2800) {
                            field729[var5++] = class171.method1762(client.method2959(var113));
                            continue;
                        }
                        if (var505 == 2801) {
                            var5--;
                            int var114 = field729[var5];
                            int var507 = var114 - 1;
                            if (var113.field2284 != null && var507 < var113.field2284.length && var113.field2284[var507] != null) {
                                field727[var6++] = var113.field2284[var507];
                                continue;
                            }
                            field727[var6++] = "";
                            continue;
                        }
                        if (var505 == 2802) {
                            if (var113.field2304 == null) {
                                field727[var6++] = "";
                            } else {
                                field727[var6++] = var113.field2304;
                            }
                            continue;
                        }
                    } else if (var505 < 3200) {
                        if (var505 == 3100) {
                            var6--;
                            String var115 = field727[var6];
                            class48.method221(0, "", var115);
                            continue;
                        }
                        if (var505 == 3101) {
                            var5 -= 2;
                            client.method173(Statics.field129, field729[var5], field729[var5 + 1]);
                            continue;
                        }
                        if (var505 == 3103) {
                            client.method1745();
                            continue;
                        }
                        if (var505 == 3104) {
                            var6--;
                            String var116 = field727[var6];
                            int var117 = 0;
                            boolean var118 = class208.method2965(var116, 10, true);
                            if (var118) {
                                int var119 = class208.method814(var116, 10, true);
                                var117 = var119;
                            }
                            client.field337.method2775(40);
                            client.field337.method2534(var117);
                            continue;
                        }
                        if (var505 == 3105) {
                            var6--;
                            String var120 = field727[var6];
                            client.field337.method2775(210);
                            client.field337.method2531(var120.length() + 1);
                            client.field337.method2537(var120);
                            continue;
                        }
                        if (var505 == 3106) {
                            var6--;
                            String var121 = field727[var6];
                            client.field337.method2775(57);
                            client.field337.method2531(var121.length() + 1);
                            client.field337.method2537(var121);
                            continue;
                        }
                        if (var505 == 3107) {
                            var5--;
                            int var122 = field729[var5];
                            var6--;
                            String var123 = field727[var6];
                            int var124 = class46.field895;
                            int[] var125 = class46.field897;
                            boolean var126 = false;
                            for (int var127 = 0; var127 < var124; var127++) {
                                class24 var128 = client.field414[var125[var127]];
                                if (var128 != null && Statics.field129 != var128 && var128.field259 != null && var128.field259.equalsIgnoreCase(var123)) {
                                    if (var122 == 1) {
                                        client.field337.method2775(252);
                                        client.field337.method2667(0);
                                        client.field337.method2578(var125[var127]);
                                    } else if (var122 == 4) {
                                        client.field337.method2775(190);
                                        client.field337.method2577(var125[var127]);
                                        client.field337.method2656(0);
                                    } else if (var122 == 6) {
                                        client.field337.method2775(219);
                                        client.field337.method2531(0);
                                        client.field337.method2577(var125[var127]);
                                    } else if (var122 == 7) {
                                        client.field337.method2775(25);
                                        client.field337.method2556(0);
                                        client.field337.method2579(var125[var127]);
                                    }
                                    var126 = true;
                                    break;
                                }
                            }
                            if (!var126) {
                                class48.method221(4, "", class174.field2514 + var123);
                            }
                            continue;
                        }
                        if (var505 == 3108) {
                            var5 -= 3;
                            int var129 = field729[var5];
                            int var130 = field729[var5 + 1];
                            int var131 = field729[var5 + 2];
                            class170 var132 = class170.method1882(var131);
                            client.method3094(var132, var129, var130);
                            continue;
                        }
                        if (var505 == 3109) {
                            var5 -= 2;
                            int var133 = field729[var5];
                            int var134 = field729[var5 + 1];
                            class170 var135 = var58 ? Statics.field182 : Statics.field728;
                            client.method3094(var135, var133, var134);
                            continue;
                        }
                        if (var505 == 3110) {
                            var5--;
                            Statics.field111 = field729[var5] == 1;
                            continue;
                        }
                        if (var505 == 3111) {
                            field729[var5++] = Statics.field795.field700 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3112) {
                            var5--;
                            Statics.field795.field700 = field729[var5] == 1;
                            class31.method2869();
                            continue;
                        }
                        if (var505 == 3113) {
                            var6--;
                            String var136 = field727[var6];
                            var5--;
                            boolean var137 = field729[var5] == 1;
                            class115.method833(var136, var137, false);
                            continue;
                        }
                        if (var505 == 3115) {
                            var5--;
                            int var138 = field729[var5];
                            client.field337.method2775(63);
                            client.field337.method2532(var138);
                            continue;
                        }
                        if (var505 == 3116) {
                            var5--;
                            int var139 = field729[var5];
                            var6 -= 2;
                            String var140 = field727[var6];
                            String var141 = field727[var6 + 1];
                            if (var140.length() <= 500 && var141.length() <= 500) {
                                client.field337.method2775(113);
                                class160 var142 = client.field337;
                                int var143 = var140.length() + 1;
                                int var144 = var143 + 1;
                                int var145 = var141.length() + 1;
                                var142.method2532(var144 + var145);
                                client.field337.method2537(var140);
                                client.field337.method2537(var141);
                                client.field337.method2667(var139);
                            }
                            continue;
                        }
                    } else if (var505 < 3300) {
                        if (var505 == 3200) {
                            var5 -= 3;
                            client.method38(field729[var5], field729[var5 + 1], field729[var5 + 2]);
                            continue;
                        }
                        if (var505 == 3201) {
                            var5--;
                            client.method157(field729[var5]);
                            continue;
                        }
                        if (var505 == 3202) {
                            var5 -= 2;
                            int var146 = field729[var5];
                            int var10000 = field729[var5 + 1];
                            if (client.field530 != 0 && var146 != -1) {
                                class139.method1751(Statics.field326, var146, 0, client.field530, false);
                                client.field532 = true;
                            }
                            continue;
                        }
                    } else if (var505 < 3400) {
                        if (var505 == 3300) {
                            field729[var5++] = client.field304;
                            continue;
                        }
                        if (var505 == 3301) {
                            var5 -= 2;
                            int var148 = field729[var5];
                            int var149 = field729[var5 + 1];
                            field729[var5++] = class13.method2811(var148, var149);
                            continue;
                        }
                        if (var505 == 3302) {
                            var5 -= 2;
                            int var150 = field729[var5];
                            int var151 = field729[var5 + 1];
                            field729[var5++] = class13.method2963(var150, var151);
                            continue;
                        }
                        if (var505 == 3303) {
                            var5 -= 2;
                            int var152 = field729[var5];
                            int var153 = field729[var5 + 1];
                            int[] var154 = field729;
                            int var155 = var5++;
                            class13 var156 = (class13) class13.field126.method2131((long) var152);
                            int var157;
                            if (var156 == null) {
                                var157 = 0;
                            } else if (var153 == -1) {
                                var157 = 0;
                            } else {
                                int var158 = 0;
                                for (int var159 = 0; var159 < var156.field130.length; var159++) {
                                    if (var156.field127[var159] == var153) {
                                        var158 += var156.field130[var159];
                                    }
                                }
                                var157 = var158;
                            }
                            var154[var155] = var157;
                            continue;
                        }
                        if (var505 == 3304) {
                            var5--;
                            int var160 = field729[var5];
                            field729[var5++] = class187.method1754(var160).field2771;
                            continue;
                        }
                        if (var505 == 3305) {
                            var5--;
                            int var161 = field729[var5];
                            field729[var5++] = client.field510[var161];
                            continue;
                        }
                        if (var505 == 3306) {
                            var5--;
                            int var162 = field729[var5];
                            field729[var5++] = client.field429[var162];
                            continue;
                        }
                        if (var505 == 3307) {
                            var5--;
                            int var163 = field729[var5];
                            field729[var5++] = client.field403[var163];
                            continue;
                        }
                        if (var505 == 3308) {
                            int var164 = Statics.field1853;
                            int var165 = (Statics.field129.field609 >> 7) + Statics.field254;
                            int var166 = (Statics.field129.field606 >> 7) + Statics.field1680;
                            field729[var5++] = (var164 << 28) + (var165 << 14) + var166;
                            continue;
                        }
                        if (var505 == 3309) {
                            var5--;
                            int var167 = field729[var5];
                            field729[var5++] = var167 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var505 == 3310) {
                            var5--;
                            int var168 = field729[var5];
                            field729[var5++] = var168 >> 28;
                            continue;
                        }
                        if (var505 == 3311) {
                            var5--;
                            int var169 = field729[var5];
                            field729[var5++] = var169 & 0x3FFF;
                            continue;
                        }
                        if (var505 == 3312) {
                            field729[var5++] = client.field299 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3313) {
                            var5 -= 2;
                            int var170 = field729[var5] + 32768;
                            int var171 = field729[var5 + 1];
                            field729[var5++] = class13.method2811(var170, var171);
                            continue;
                        }
                        if (var505 == 3314) {
                            var5 -= 2;
                            int var172 = field729[var5] + 32768;
                            int var173 = field729[var5 + 1];
                            field729[var5++] = class13.method2963(var172, var173);
                            continue;
                        }
                        if (var505 == 3315) {
                            var5 -= 2;
                            int var174 = field729[var5] + 32768;
                            int var175 = field729[var5 + 1];
                            int[] var176 = field729;
                            int var177 = var5++;
                            class13 var178 = (class13) class13.field126.method2131((long) var174);
                            int var179;
                            if (var178 == null) {
                                var179 = 0;
                            } else if (var175 == -1) {
                                var179 = 0;
                            } else {
                                int var180 = 0;
                                for (int var181 = 0; var181 < var178.field130.length; var181++) {
                                    if (var178.field127[var181] == var175) {
                                        var180 += var178.field130[var181];
                                    }
                                }
                                var179 = var180;
                            }
                            var176[var177] = var179;
                            continue;
                        }
                        if (var505 == 3316) {
                            if (client.field459 >= 2) {
                                field729[var5++] = client.field459;
                            } else {
                                field729[var5++] = 0;
                            }
                            continue;
                        }
                        if (var505 == 3317) {
                            field729[var5++] = client.field535;
                            continue;
                        }
                        if (var505 == 3318) {
                            field729[var5++] = client.field512;
                            continue;
                        }
                        if (var505 == 3321) {
                            field729[var5++] = client.field457;
                            continue;
                        }
                        if (var505 == 3322) {
                            field729[var5++] = client.field477;
                            continue;
                        }
                        if (var505 == 3323) {
                            if (client.field461) {
                                field729[var5++] = 1;
                            } else {
                                field729[var5++] = 0;
                            }
                            continue;
                        }
                        if (var505 == 3324) {
                            field729[var5++] = client.field376;
                            continue;
                        }
                    } else if (var505 < 3500) {
                        if (var505 == 3400) {
                            var5 -= 2;
                            int var182 = field729[var5];
                            int var183 = field729[var5 + 1];
                            class196 var184 = class196.method3224(var182);
                            if (var184.field2862 != 's') {
                            }
                            for (int var185 = 0; var185 < var184.field2869; var185++) {
                                if (var184.field2866[var185] == var183) {
                                    field727[var6++] = var184.field2868[var185];
                                    var184 = null;
                                    break;
                                }
                            }
                            if (var184 != null) {
                                field727[var6++] = var184.field2863;
                            }
                            continue;
                        }
                        if (var505 == 3408) {
                            var5 -= 4;
                            int var186 = field729[var5];
                            int var187 = field729[var5 + 1];
                            int var188 = field729[var5 + 2];
                            int var189 = field729[var5 + 3];
                            class196 var190 = class196.method3224(var188);
                            if (var190.field2861 == var186 && var190.field2862 == var187) {
                                for (int var191 = 0; var191 < var190.field2869; var191++) {
                                    if (var190.field2866[var191] == var189) {
                                        if (var187 == 115) {
                                            field727[var6++] = var190.field2868[var191];
                                        } else {
                                            field729[var5++] = var190.field2867[var191];
                                        }
                                        var190 = null;
                                        break;
                                    }
                                }
                                if (var190 != null) {
                                    if (var187 == 115) {
                                        field727[var6++] = var190.field2863;
                                    } else {
                                        field729[var5++] = var190.field2865;
                                    }
                                }
                                continue;
                            }
                            if (var187 == 115) {
                                field727[var6++] = "null";
                            } else {
                                field729[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var505 < 3700) {
                        if (var505 == 3600) {
                            if (client.field507 == 0) {
                                field729[var5++] = -2;
                            } else if (client.field507 == 1) {
                                field729[var5++] = -1;
                            } else {
                                field729[var5++] = client.field472;
                            }
                            continue;
                        }
                        if (var505 == 3601) {
                            var5--;
                            int var192 = field729[var5];
                            if (client.field507 == 2 && var192 < client.field472) {
                                field727[var6++] = client.field470[var192].field161;
                                field727[var6++] = client.field470[var192].field159;
                                continue;
                            }
                            field727[var6++] = "";
                            field727[var6++] = "";
                            continue;
                        }
                        if (var505 == 3602) {
                            var5--;
                            int var193 = field729[var5];
                            if (client.field507 == 2 && var193 < client.field472) {
                                field729[var5++] = client.field470[var193].field160;
                                continue;
                            }
                            field729[var5++] = 0;
                            continue;
                        }
                        if (var505 == 3603) {
                            var5--;
                            int var194 = field729[var5];
                            if (client.field507 == 2 && var194 < client.field472) {
                                field729[var5++] = client.field470[var194].field164;
                                continue;
                            }
                            field729[var5++] = 0;
                            continue;
                        }
                        if (var505 == 3604) {
                            var6--;
                            String var195 = field727[var6];
                            var5--;
                            int var196 = field729[var5];
                            client.method1577(var195, var196);
                            continue;
                        }
                        if (var505 == 3605) {
                            var6--;
                            String var197 = field727[var6];
                            Statics.method163(var197);
                            continue;
                        }
                        if (var505 == 3606) {
                            var6--;
                            String var198 = field727[var6];
                            if (var198 == null) {
                                continue;
                            }
                            String var199 = class205.method2254(var198, Statics.field16);
                            if (var199 == null) {
                                continue;
                            }
                            int var200 = 0;
                            while (true) {
                                if (var200 >= client.field472) {
                                    continue label3064;
                                }
                                class15 var201 = client.field470[var200];
                                String var202 = var201.field161;
                                String var203 = class205.method2254(var202, Statics.field16);
                                if (class218.method3404(var198, var199, var202, var203)) {
                                    client.field472--;
                                    for (int var204 = var200; var204 < client.field472; var204++) {
                                        client.field470[var204] = client.field470[var204 + 1];
                                    }
                                    client.field485 = client.field359;
                                    client.field337.method2775(188);
                                    class160 var205 = client.field337;
                                    int var206 = var198.length() + 1;
                                    var205.method2531(var206);
                                    client.field337.method2537(var198);
                                    continue label3064;
                                }
                                var200++;
                            }
                        }
                        if (var505 == 3607) {
                            var6--;
                            String var207 = field727[var6];
                            if (var207 == null) {
                                continue;
                            }
                            if ((client.field564 < 100 || client.field416 == 1) && client.field564 < 400) {
                                String var208 = class205.method2254(var207, Statics.field16);
                                if (var208 == null) {
                                    continue;
                                }
                                for (int var209 = 0; var209 < client.field564; var209++) {
                                    class20 var210 = client.field565[var209];
                                    String var211 = class205.method2254(var210.field228, Statics.field16);
                                    if (var211 != null && var211.equals(var208)) {
                                        class48.method221(31, "", var207 + class174.field2537);
                                        continue label3064;
                                    }
                                    if (var210.field222 != null) {
                                        String var212 = class205.method2254(var210.field222, Statics.field16);
                                        if (var212 != null && var212.equals(var208)) {
                                            class48.method221(31, "", var207 + class174.field2537);
                                            continue label3064;
                                        }
                                    }
                                }
                                for (int var213 = 0; var213 < client.field472; var213++) {
                                    class15 var214 = client.field470[var213];
                                    String var215 = class205.method2254(var214.field161, Statics.field16);
                                    if (var215 != null && var215.equals(var208)) {
                                        class48.method221(31, "", class174.field2468 + var207 + class174.field2540);
                                        continue label3064;
                                    }
                                    if (var214.field159 != null) {
                                        String var216 = class205.method2254(var214.field159, Statics.field16);
                                        if (var216 != null && var216.equals(var208)) {
                                            class48.method221(31, "", class174.field2468 + var207 + class174.field2540);
                                            continue label3064;
                                        }
                                    }
                                }
                                if (class205.method2254(Statics.field129.field259, Statics.field16).equals(var208)) {
                                    class48.method221(31, "", class174.field2536);
                                } else {
                                    client.field337.method2775(189);
                                    class160 var217 = client.field337;
                                    int var218 = var207.length() + 1;
                                    var217.method2531(var218);
                                    client.field337.method2537(var207);
                                }
                                continue;
                            }
                            class48.method221(31, "", class174.field2533);
                            continue;
                        }
                        if (var505 == 3608) {
                            var6--;
                            String var219 = field727[var6];
                            if (var219 == null) {
                                continue;
                            }
                            String var220 = class205.method2254(var219, Statics.field16);
                            if (var220 == null) {
                                continue;
                            }
                            int var221 = 0;
                            while (true) {
                                if (var221 >= client.field564) {
                                    continue label3064;
                                }
                                class20 var222 = client.field565[var221];
                                String var223 = var222.field228;
                                String var224 = class205.method2254(var223, Statics.field16);
                                if (class218.method3404(var219, var220, var223, var224)) {
                                    client.field564--;
                                    for (int var225 = var221; var225 < client.field564; var225++) {
                                        client.field565[var225] = client.field565[var225 + 1];
                                    }
                                    client.field485 = client.field359;
                                    client.field337.method2775(10);
                                    class160 var226 = client.field337;
                                    int var227 = var219.length() + 1;
                                    var226.method2531(var227);
                                    client.field337.method2537(var219);
                                    continue label3064;
                                }
                                var221++;
                            }
                        }
                        if (var505 == 3609) {
                            var6--;
                            String var228 = field727[var6];
                            class178[] var229 = class178.method92();
                            for (int var230 = 0; var230 < var229.length; var230++) {
                                class178 var231 = var229[var230];
                                if (var231.field2676 != -1) {
                                    int var233 = var231.field2676;
                                    String var234 = "<img=" + var233 + ">";
                                    if (var228.startsWith(var234)) {
                                        var228 = var228.substring(6 + Integer.toString(var231.field2676).length());
                                        break;
                                    }
                                }
                            }
                            field729[var5++] = client.method834(var228, false) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3611) {
                            if (client.field520 == null) {
                                field727[var6++] = "";
                            } else {
                                field727[var6++] = class206.method1300(client.field520);
                            }
                            continue;
                        }
                        if (var505 == 3612) {
                            if (client.field520 == null) {
                                field729[var5++] = 0;
                            } else {
                                field729[var5++] = Statics.field2157;
                            }
                            continue;
                        }
                        if (var505 == 3613) {
                            var5--;
                            int var235 = field729[var5];
                            if (client.field520 != null && var235 < Statics.field2157) {
                                field727[var6++] = Statics.field1037[var235].field291;
                                continue;
                            }
                            field727[var6++] = "";
                            continue;
                        }
                        if (var505 == 3614) {
                            var5--;
                            int var236 = field729[var5];
                            if (client.field520 != null && var236 < Statics.field2157) {
                                field729[var5++] = Statics.field1037[var236].field286;
                                continue;
                            }
                            field729[var5++] = 0;
                            continue;
                        }
                        if (var505 == 3615) {
                            var5--;
                            int var237 = field729[var5];
                            if (client.field520 != null && var237 < Statics.field2157) {
                                field729[var5++] = Statics.field1037[var237].field287;
                                continue;
                            }
                            field729[var5++] = 0;
                            continue;
                        }
                        if (var505 == 3616) {
                            field729[var5++] = Statics.field2047;
                            continue;
                        }
                        if (var505 == 3617) {
                            var6--;
                            String var238 = field727[var6];
                            client.method1761(var238);
                            continue;
                        }
                        if (var505 == 3618) {
                            field729[var5++] = Statics.field110;
                            continue;
                        }
                        if (var505 == 3619) {
                            var6--;
                            String var239 = field727[var6];
                            client.method80(var239);
                            continue;
                        }
                        if (var505 == 3620) {
                            client.method103();
                            continue;
                        }
                        if (var505 == 3621) {
                            if (client.field507 == 0) {
                                field729[var5++] = -1;
                            } else {
                                field729[var5++] = client.field564;
                            }
                            continue;
                        }
                        if (var505 == 3622) {
                            var5--;
                            int var240 = field729[var5];
                            if (client.field507 != 0 && var240 < client.field564) {
                                field727[var6++] = client.field565[var240].field228;
                                field727[var6++] = client.field565[var240].field222;
                                continue;
                            }
                            field727[var6++] = "";
                            field727[var6++] = "";
                            continue;
                        }
                        if (var505 == 3623) {
                            String var241;
                            label2778: {
                                var6--;
                                var241 = field727[var6];
                                String var243 = "<img=0>";
                                if (!var241.startsWith(var243)) {
                                    String var245 = "<img=1>";
                                    if (!var241.startsWith(var245)) {
                                        break label2778;
                                    }
                                }
                                var241 = var241.substring(7);
                            }
                            field729[var5++] = client.method2080(var241) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3624) {
                            var5--;
                            int var246 = field729[var5];
                            if (Statics.field1037 != null && var246 < Statics.field2157 && Statics.field1037[var246].field291.equalsIgnoreCase(Statics.field129.field259)) {
                                field729[var5++] = 1;
                                continue;
                            }
                            field729[var5++] = 0;
                            continue;
                        }
                        if (var505 == 3625) {
                            if (client.field521 == null) {
                                field727[var6++] = "";
                            } else {
                                field727[var6++] = class206.method1300(client.field521);
                            }
                            continue;
                        }
                    } else if (var505 < 4000) {
                        if (var505 == 3903) {
                            var5--;
                            int var247 = field729[var5];
                            field729[var5++] = client.field569[var247].method44();
                            continue;
                        }
                        if (var505 == 3904) {
                            var5--;
                            int var248 = field729[var5];
                            field729[var5++] = client.field569[var248].field46;
                            continue;
                        }
                        if (var505 == 3905) {
                            var5--;
                            int var249 = field729[var5];
                            field729[var5++] = client.field569[var249].field50;
                            continue;
                        }
                        if (var505 == 3906) {
                            var5--;
                            int var250 = field729[var5];
                            field729[var5++] = client.field569[var250].field48;
                            continue;
                        }
                        if (var505 == 3907) {
                            var5--;
                            int var251 = field729[var5];
                            field729[var5++] = client.field569[var251].field49;
                            continue;
                        }
                        if (var505 == 3908) {
                            var5--;
                            int var252 = field729[var5];
                            field729[var5++] = client.field569[var252].field45;
                            continue;
                        }
                        if (var505 == 3910) {
                            var5--;
                            int var253 = field729[var5];
                            int var254 = client.field569[var253].method59();
                            field729[var5++] = var254 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3911) {
                            var5--;
                            int var255 = field729[var5];
                            int var256 = client.field569[var255].method59();
                            field729[var5++] = var256 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3912) {
                            var5--;
                            int var257 = field729[var5];
                            int var258 = client.field569[var257].method59();
                            field729[var5++] = var258 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3913) {
                            var5--;
                            int var259 = field729[var5];
                            int var260 = client.field569[var259].method59();
                            field729[var5++] = var260 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3914) {
                            var5--;
                            boolean var261 = field729[var5] == 1;
                            if (Statics.field168 != null) {
                                Statics.field168.method14(class2.field14, var261);
                            }
                            continue;
                        }
                        if (var505 == 3915) {
                            var5--;
                            boolean var262 = field729[var5] == 1;
                            if (Statics.field168 != null) {
                                Statics.field168.method14(class2.field18, var262);
                            }
                            continue;
                        }
                        if (var505 == 3916) {
                            var5 -= 2;
                            boolean var263 = field729[var5] == 1;
                            boolean var264 = field729[var5 + 1] == 1;
                            if (Statics.field168 != null) {
                                Statics.field168.method14(new class45(var264), var263);
                            }
                            continue;
                        }
                        if (var505 == 3917) {
                            var5--;
                            boolean var265 = field729[var5] == 1;
                            if (Statics.field168 != null) {
                                Statics.field168.method14(class2.field13, var265);
                            }
                            continue;
                        }
                        if (var505 == 3918) {
                            var5--;
                            boolean var266 = field729[var5] == 1;
                            if (Statics.field168 != null) {
                                Statics.field168.method14(class2.field15, var266);
                            }
                            continue;
                        }
                        if (var505 == 3919) {
                            field729[var5++] = Statics.field168 == null ? 0 : Statics.field168.field11.size();
                            continue;
                        }
                        if (var505 == 3920) {
                            var5--;
                            int var267 = field729[var5];
                            class3 var268 = (class3) Statics.field168.field11.get(var267);
                            field729[var5++] = var268.field33;
                            continue;
                        }
                        if (var505 == 3921) {
                            var5--;
                            int var269 = field729[var5];
                            class3 var270 = (class3) Statics.field168.field11.get(var269);
                            field727[var6++] = var270.method18();
                            continue;
                        }
                        if (var505 == 3922) {
                            var5--;
                            int var271 = field729[var5];
                            class3 var272 = (class3) Statics.field168.field11.get(var271);
                            field727[var6++] = var272.method17();
                            continue;
                        }
                        if (var505 == 3923) {
                            var5--;
                            int var273 = field729[var5];
                            class3 var274 = (class3) Statics.field168.field11.get(var273);
                            long var275 = Statics.method28() - Statics.field134 - var274.field26;
                            int var277 = (int) (var275 / 3600000L);
                            int var278 = (int) ((var275 - (long) (var277 * 3600000)) / 60000L);
                            int var279 = (int) ((var275 - (long) (var277 * 3600000) - (long) (var278 * 60000)) / 1000L);
                            String var280 = var277 + ":" + var278 / 10 + var278 % 10 + ":" + var279 / 10 + var279 % 10;
                            field727[var6++] = var280;
                            continue;
                        }
                        if (var505 == 3924) {
                            var5--;
                            int var281 = field729[var5];
                            class3 var282 = (class3) Statics.field168.field11.get(var281);
                            field729[var5++] = var282.field24.field48;
                            continue;
                        }
                        if (var505 == 3925) {
                            var5--;
                            int var283 = field729[var5];
                            class3 var284 = (class3) Statics.field168.field11.get(var283);
                            field729[var5++] = var284.field24.field50;
                            continue;
                        }
                        if (var505 == 3926) {
                            var5--;
                            int var285 = field729[var5];
                            class3 var286 = (class3) Statics.field168.field11.get(var285);
                            field729[var5++] = var286.field24.field46;
                            continue;
                        }
                    } else if (var505 < 4100) {
                        if (var505 == 4000) {
                            var5 -= 2;
                            int var287 = field729[var5];
                            int var288 = field729[var5 + 1];
                            field729[var5++] = var287 + var288;
                            continue;
                        }
                        if (var505 == 4001) {
                            var5 -= 2;
                            int var289 = field729[var5];
                            int var290 = field729[var5 + 1];
                            field729[var5++] = var289 - var290;
                            continue;
                        }
                        if (var505 == 4002) {
                            var5 -= 2;
                            int var291 = field729[var5];
                            int var292 = field729[var5 + 1];
                            field729[var5++] = var291 * var292;
                            continue;
                        }
                        if (var505 == 4003) {
                            var5 -= 2;
                            int var293 = field729[var5];
                            int var294 = field729[var5 + 1];
                            field729[var5++] = var293 / var294;
                            continue;
                        }
                        if (var505 == 4004) {
                            var5--;
                            int var295 = field729[var5];
                            field729[var5++] = (int) (Math.random() * (double) var295);
                            continue;
                        }
                        if (var505 == 4005) {
                            var5--;
                            int var296 = field729[var5];
                            field729[var5++] = (int) (Math.random() * (double) (var296 + 1));
                            continue;
                        }
                        if (var505 == 4006) {
                            var5 -= 5;
                            int var297 = field729[var5];
                            int var298 = field729[var5 + 1];
                            int var299 = field729[var5 + 2];
                            int var300 = field729[var5 + 3];
                            int var301 = field729[var5 + 4];
                            field729[var5++] = (var298 - var297) * (var301 - var299) / (var300 - var299) + var297;
                            continue;
                        }
                        if (var505 == 4007) {
                            var5 -= 2;
                            int var302 = field729[var5];
                            int var303 = field729[var5 + 1];
                            field729[var5++] = var302 * var303 / 100 + var302;
                            continue;
                        }
                        if (var505 == 4008) {
                            var5 -= 2;
                            int var304 = field729[var5];
                            int var305 = field729[var5 + 1];
                            field729[var5++] = var304 | 0x1 << var305;
                            continue;
                        }
                        if (var505 == 4009) {
                            var5 -= 2;
                            int var306 = field729[var5];
                            int var307 = field729[var5 + 1];
                            field729[var5++] = var306 & -1 - (0x1 << var307);
                            continue;
                        }
                        if (var505 == 4010) {
                            var5 -= 2;
                            int var308 = field729[var5];
                            int var309 = field729[var5 + 1];
                            field729[var5++] = (var308 & 0x1 << var309) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var505 == 4011) {
                            var5 -= 2;
                            int var310 = field729[var5];
                            int var311 = field729[var5 + 1];
                            field729[var5++] = var310 % var311;
                            continue;
                        }
                        if (var505 == 4012) {
                            var5 -= 2;
                            int var312 = field729[var5];
                            int var313 = field729[var5 + 1];
                            if (var312 == 0) {
                                field729[var5++] = 0;
                            } else {
                                field729[var5++] = (int) Math.pow((double) var312, (double) var313);
                            }
                            continue;
                        }
                        if (var505 == 4013) {
                            var5 -= 2;
                            int var314 = field729[var5];
                            int var315 = field729[var5 + 1];
                            if (var314 == 0) {
                                field729[var5++] = 0;
                            } else if (var315 == 0) {
                                field729[var5++] = Integer.MAX_VALUE;
                            } else {
                                field729[var5++] = (int) Math.pow((double) var314, 1.0D / (double) var315);
                            }
                            continue;
                        }
                        if (var505 == 4014) {
                            var5 -= 2;
                            int var316 = field729[var5];
                            int var317 = field729[var5 + 1];
                            field729[var5++] = var316 & var317;
                            continue;
                        }
                        if (var505 == 4015) {
                            var5 -= 2;
                            int var318 = field729[var5];
                            int var319 = field729[var5 + 1];
                            field729[var5++] = var318 | var319;
                            continue;
                        }
                        if (var505 == 4018) {
                            var5 -= 3;
                            long var320 = (long) field729[var5];
                            long var322 = (long) field729[var5 + 1];
                            long var324 = (long) field729[var5 + 2];
                            field729[var5++] = (int) (var320 * var324 / var322);
                            continue;
                        }
                    } else if (var505 < 4200) {
                        if (var505 == 4100) {
                            var6--;
                            String var326 = field727[var6];
                            var5--;
                            int var327 = field729[var5];
                            field727[var6++] = var326 + var327;
                            continue;
                        }
                        if (var505 == 4101) {
                            var6 -= 2;
                            String var328 = field727[var6];
                            String var329 = field727[var6 + 1];
                            field727[var6++] = var328 + var329;
                            continue;
                        }
                        if (var505 == 4102) {
                            var6--;
                            String var330 = field727[var6];
                            var5--;
                            int var331 = field729[var5];
                            String[] var332 = field727;
                            int var333 = var6++;
                            String var335;
                            if (var331 < 0) {
                                var335 = Integer.toString(var331);
                            } else {
                                var335 = class208.method3320(var331, 10, true);
                            }
                            var332[var333] = var330 + var335;
                            continue;
                        }
                        if (var505 == 4103) {
                            var6--;
                            String var336 = field727[var6];
                            field727[var6++] = var336.toLowerCase();
                            continue;
                        }
                        if (var505 == 4104) {
                            var5--;
                            int var337 = field729[var5];
                            long var338 = ((long) var337 + 11745L) * 86400000L;
                            field724.setTime(new Date(var338));
                            int var340 = field724.get(5);
                            int var341 = field724.get(2);
                            int var342 = field724.get(1);
                            field727[var6++] = var340 + "-" + field734[var341] + "-" + var342;
                            continue;
                        }
                        if (var505 == 4105) {
                            var6 -= 2;
                            String var343 = field727[var6];
                            String var344 = field727[var6 + 1];
                            if (Statics.field129.field272 != null && Statics.field129.field272.field2180) {
                                field727[var6++] = var344;
                                continue;
                            }
                            field727[var6++] = var343;
                            continue;
                        }
                        if (var505 == 4106) {
                            var5--;
                            int var345 = field729[var5];
                            field727[var6++] = Integer.toString(var345);
                            continue;
                        }
                        if (var505 == 4107) {
                            var6 -= 2;
                            int[] var346 = field729;
                            int var347 = var5++;
                            String var348 = field727[var6];
                            String var349 = field727[var6 + 1];
                            int var350 = client.field301;
                            int var351 = var348.length();
                            int var352 = var349.length();
                            int var353 = 0;
                            int var354 = 0;
                            char var355 = 0;
                            char var356 = 0;
                            int var357;
                            label2841: while (true) {
                                if (var353 - var355 >= var351 && var354 - var356 >= var352) {
                                    int var366 = Math.min(var351, var352);
                                    for (int var367 = 0; var367 < var366; var367++) {
                                        char var370 = var348.charAt(var367);
                                        char var371 = var349.charAt(var367);
                                        if (var370 != var371 && Character.toUpperCase(var370) != Character.toUpperCase(var371)) {
                                            char var372 = Character.toLowerCase(var370);
                                            char var373 = Character.toLowerCase(var371);
                                            if (var372 != var373) {
                                                var357 = class203.method2446(var372, var350) - class203.method2446(var373, var350);
                                                break label2841;
                                            }
                                        }
                                    }
                                    int var374 = var351 - var352;
                                    if (var374 == 0) {
                                        for (int var375 = 0; var375 < var366; var375++) {
                                            char var376 = var348.charAt(var375);
                                            char var377 = var349.charAt(var375);
                                            if (var376 != var377) {
                                                var357 = class203.method2446(var376, var350) - class203.method2446(var377, var350);
                                                break label2841;
                                            }
                                        }
                                        var357 = 0;
                                    } else {
                                        var357 = var374;
                                    }
                                    break;
                                }
                                if (var353 - var355 >= var351) {
                                    var357 = -1;
                                    break;
                                }
                                if (var354 - var356 >= var352) {
                                    var357 = 1;
                                    break;
                                }
                                char var358;
                                if (var355 == 0) {
                                    var358 = var348.charAt(var353++);
                                } else {
                                    var358 = var355;
                                    boolean var359 = false;
                                }
                                char var360;
                                if (var356 == 0) {
                                    var360 = var349.charAt(var354++);
                                } else {
                                    var360 = var356;
                                    boolean var361 = false;
                                }
                                var355 = class203.method2891(var358);
                                var356 = class203.method2891(var360);
                                char var362 = class203.method1068(var358, var350);
                                char var363 = class203.method1068(var360, var350);
                                if (var362 != var363 && Character.toUpperCase(var362) != Character.toUpperCase(var363)) {
                                    char var364 = Character.toLowerCase(var362);
                                    char var365 = Character.toLowerCase(var363);
                                    if (var364 != var365) {
                                        var357 = class203.method2446(var364, var350) - class203.method2446(var365, var350);
                                        break;
                                    }
                                }
                            }
                            var346[var347] = class208.method1884(var357);
                            continue;
                        }
                        if (var505 == 4108) {
                            var6--;
                            String var378 = field727[var6];
                            var5 -= 2;
                            int var379 = field729[var5];
                            int var380 = field729[var5 + 1];
                            byte[] var381 = Statics.field69.method2986(var380, 0);
                            class209 var382 = new class209(var381);
                            field729[var5++] = var382.method3538(var378, var379);
                            continue;
                        }
                        if (var505 == 4109) {
                            var6--;
                            String var383 = field727[var6];
                            var5 -= 2;
                            int var384 = field729[var5];
                            int var385 = field729[var5 + 1];
                            byte[] var386 = Statics.field69.method2986(var385, 0);
                            class209 var387 = new class209(var386);
                            field729[var5++] = var387.method3520(var383, var384);
                            continue;
                        }
                        if (var505 == 4110) {
                            var6 -= 2;
                            String var388 = field727[var6];
                            String var389 = field727[var6 + 1];
                            var5--;
                            if (field729[var5] == 1) {
                                field727[var6++] = var388;
                            } else {
                                field727[var6++] = var389;
                            }
                            continue;
                        }
                        if (var505 == 4111) {
                            var6--;
                            String var390 = field727[var6];
                            field727[var6++] = class210.method3522(var390);
                            continue;
                        }
                        if (var505 == 4112) {
                            var6--;
                            String var391 = field727[var6];
                            var5--;
                            int var392 = field729[var5];
                            field727[var6++] = var391 + (char) var392;
                            continue;
                        }
                        if (var505 == 4113) {
                            var5--;
                            int var393 = field729[var5];
                            int[] var394 = field729;
                            int var395 = var5++;
                            char var396 = (char) var393;
                            boolean var397;
                            if (var396 >= ' ' && var396 <= '~') {
                                var397 = true;
                            } else if (var396 >= 160 && var396 <= 255) {
                                var397 = true;
                            } else if (var396 == 8364 || var396 == 338 || var396 == 8212 || var396 == 339 || var396 == 376) {
                                var397 = true;
                            } else {
                                var397 = false;
                            }
                            var394[var395] = var397 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4114) {
                            var5--;
                            int var398 = field729[var5];
                            int[] var399 = field729;
                            int var400 = var5++;
                            char var401 = (char) var398;
                            boolean var402 = var401 >= '0' && var401 <= '9' || var401 >= 'A' && var401 <= 'Z' || var401 >= 'a' && var401 <= 'z';
                            var399[var400] = var402 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4115) {
                            var5--;
                            int var403 = field729[var5];
                            int[] var404 = field729;
                            int var405 = var5++;
                            char var406 = (char) var403;
                            boolean var407 = var406 >= 'A' && var406 <= 'Z' || var406 >= 'a' && var406 <= 'z';
                            var404[var405] = var407 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4116) {
                            var5--;
                            int var408 = field729[var5];
                            field729[var5++] = class208.method3072((char) var408) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4117) {
                            var6--;
                            String var409 = field727[var6];
                            if (var409 == null) {
                                field729[var5++] = 0;
                            } else {
                                field729[var5++] = var409.length();
                            }
                            continue;
                        }
                        if (var505 == 4118) {
                            var6--;
                            String var410 = field727[var6];
                            var5 -= 2;
                            int var411 = field729[var5];
                            int var412 = field729[var5 + 1];
                            field727[var6++] = var410.substring(var411, var412);
                            continue;
                        }
                        if (var505 == 4119) {
                            var6--;
                            String var413 = field727[var6];
                            StringBuilder var414 = new StringBuilder(var413.length());
                            boolean var415 = false;
                            for (int var416 = 0; var416 < var413.length(); var416++) {
                                char var417 = var413.charAt(var416);
                                if (var417 == '<') {
                                    var415 = true;
                                } else if (var417 == '>') {
                                    var415 = false;
                                } else if (!var415) {
                                    var414.append(var417);
                                }
                            }
                            field727[var6++] = var414.toString();
                            continue;
                        }
                        if (var505 == 4120) {
                            var6--;
                            String var418 = field727[var6];
                            var5--;
                            int var419 = field729[var5];
                            field729[var5++] = var418.indexOf(var419);
                            continue;
                        }
                        if (var505 == 4121) {
                            var6 -= 2;
                            String var420 = field727[var6];
                            String var421 = field727[var6 + 1];
                            var5--;
                            int var422 = field729[var5];
                            field729[var5++] = var420.indexOf(var421, var422);
                            continue;
                        }
                    } else if (var505 < 4300) {
                        if (var505 == 4200) {
                            var5--;
                            int var423 = field729[var5];
                            field727[var6++] = class199.method699(var423).field2961;
                            continue;
                        }
                        if (var505 == 4201) {
                            var5 -= 2;
                            int var424 = field729[var5];
                            int var425 = field729[var5 + 1];
                            class199 var426 = class199.method699(var424);
                            if (var425 >= 1 && var425 <= 5 && var426.field3001[var425 - 1] != null) {
                                field727[var6++] = var426.field3001[var425 - 1];
                                continue;
                            }
                            field727[var6++] = "";
                            continue;
                        }
                        if (var505 == 4202) {
                            var5 -= 2;
                            int var427 = field729[var5];
                            int var428 = field729[var5 + 1];
                            class199 var429 = class199.method699(var427);
                            if (var428 >= 1 && var428 <= 5 && var429.field2976[var428 - 1] != null) {
                                field727[var6++] = var429.field2976[var428 - 1];
                                continue;
                            }
                            field727[var6++] = "";
                            continue;
                        }
                        if (var505 == 4203) {
                            var5--;
                            int var430 = field729[var5];
                            field729[var5++] = class199.method699(var430).field2973;
                            continue;
                        }
                        if (var505 == 4204) {
                            var5--;
                            int var431 = field729[var5];
                            field729[var5++] = class199.method699(var431).field2990 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4205) {
                            var5--;
                            int var432 = field729[var5];
                            class199 var433 = class199.method699(var432);
                            if (var433.field2992 == -1 && var433.field2991 >= 0) {
                                field729[var5++] = var433.field2991;
                                continue;
                            }
                            field729[var5++] = var432;
                            continue;
                        }
                        if (var505 == 4206) {
                            var5--;
                            int var434 = field729[var5];
                            class199 var435 = class199.method699(var434);
                            if (var435.field2992 >= 0 && var435.field2991 >= 0) {
                                field729[var5++] = var435.field2991;
                                continue;
                            }
                            field729[var5++] = var434;
                            continue;
                        }
                        if (var505 == 4207) {
                            var5--;
                            int var436 = field729[var5];
                            field729[var5++] = class199.method699(var436).field2974 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4208) {
                            var5--;
                            int var437 = field729[var5];
                            class199 var438 = class199.method699(var437);
                            if (var438.field3003 == -1 && var438.field3002 >= 0) {
                                field729[var5++] = var438.field3002;
                                continue;
                            }
                            field729[var5++] = var437;
                            continue;
                        }
                        if (var505 == 4209) {
                            var5--;
                            int var439 = field729[var5];
                            class199 var440 = class199.method699(var439);
                            if (var440.field3003 >= 0 && var440.field3002 >= 0) {
                                field729[var5++] = var440.field3002;
                                continue;
                            }
                            field729[var5++] = var439;
                            continue;
                        }
                        if (var505 == 4210) {
                            var6--;
                            String var441 = field727[var6];
                            var5--;
                            int var442 = field729[var5];
                            client.method2982(var441, var442 == 1);
                            field729[var5++] = Statics.field2198;
                            continue;
                        }
                        if (var505 == 4211) {
                            if (Statics.field250 != null && Statics.field919 < Statics.field2198) {
                                field729[var5++] = Statics.field250[++Statics.field919 - 1] & 0xFFFF;
                                continue;
                            }
                            field729[var5++] = -1;
                            continue;
                        }
                        if (var505 == 4212) {
                            Statics.field919 = 0;
                            continue;
                        }
                    } else if (var505 < 5100) {
                        if (var505 == 5000) {
                            field729[var5++] = client.field511;
                            continue;
                        }
                        if (var505 == 5001) {
                            var5 -= 3;
                            client.field511 = field729[var5];
                            int var443 = field729[var5 + 1];
                            class217[] var444 = class217.method32();
                            int var445 = 0;
                            class217 var447;
                            while (true) {
                                if (var445 >= var444.length) {
                                    var447 = null;
                                    break;
                                }
                                class217 var446 = var444[var445];
                                if (var446.field3169 == var443) {
                                    var447 = var446;
                                    break;
                                }
                                var445++;
                            }
                            Statics.field732 = var447;
                            if (Statics.field732 == null) {
                                Statics.field732 = class217.field3168;
                            }
                            client.field515 = field729[var5 + 2];
                            client.field337.method2775(89);
                            client.field337.method2531(client.field511);
                            client.field337.method2531(Statics.field732.field3169);
                            client.field337.method2531(client.field515);
                            continue;
                        }
                        if (var505 == 5002) {
                            var6--;
                            String var448 = field727[var6];
                            var5 -= 2;
                            int var449 = field729[var5];
                            int var450 = field729[var5 + 1];
                            client.field337.method2775(184);
                            class160 var451 = client.field337;
                            int var452 = var448.length() + 1;
                            var451.method2531(var452 + 2);
                            client.field337.method2537(var448);
                            client.field337.method2531(var449 - 1);
                            client.field337.method2531(var450);
                            continue;
                        }
                        if (var505 == 5003) {
                            var5 -= 2;
                            int var453 = field729[var5];
                            int var454 = field729[var5 + 1];
                            class22 var455 = class48.method2752(var453, var454);
                            if (var455 == null) {
                                field729[var5++] = -1;
                                field729[var5++] = 0;
                                field727[var6++] = "";
                                field727[var6++] = "";
                                field727[var6++] = "";
                            } else {
                                field729[var5++] = var455.field241;
                                field729[var5++] = var455.field245;
                                field727[var6++] = var455.field240 == null ? "" : var455.field240;
                                field727[var6++] = var455.field239 == null ? "" : var455.field239;
                                field727[var6++] = var455.field244 == null ? "" : var455.field244;
                            }
                            continue;
                        }
                        if (var505 == 5004) {
                            var5--;
                            int var456 = field729[var5];
                            class22 var457 = (class22) class48.field928.method2108((long) var456);
                            if (var457 == null) {
                                field729[var5++] = -1;
                                field729[var5++] = 0;
                                field727[var6++] = "";
                                field727[var6++] = "";
                                field727[var6++] = "";
                            } else {
                                field729[var5++] = var457.field246;
                                field729[var5++] = var457.field245;
                                field727[var6++] = var457.field240 == null ? "" : var457.field240;
                                field727[var6++] = var457.field239 == null ? "" : var457.field239;
                                field727[var6++] = var457.field244 == null ? "" : var457.field244;
                            }
                            continue;
                        }
                        if (var505 == 5005) {
                            if (Statics.field732 == null) {
                                field729[var5++] = -1;
                            } else {
                                field729[var5++] = Statics.field732.field3169;
                            }
                            continue;
                        }
                        if (var505 == 5008) {
                            var6--;
                            String var459 = field727[var6];
                            var5--;
                            int var460 = field729[var5];
                            String var461 = var459.toLowerCase();
                            byte var462 = 0;
                            if (var461.startsWith(class174.field2541)) {
                                var462 = 0;
                                var459 = var459.substring(class174.field2541.length());
                            } else if (var461.startsWith(class174.field2543)) {
                                var462 = 1;
                                var459 = var459.substring(class174.field2543.length());
                            } else if (var461.startsWith(class174.field2545)) {
                                var462 = 2;
                                var459 = var459.substring(class174.field2545.length());
                            } else if (var461.startsWith(class174.field2547)) {
                                var462 = 3;
                                var459 = var459.substring(class174.field2547.length());
                            } else if (var461.startsWith(class174.field2393)) {
                                var462 = 4;
                                var459 = var459.substring(class174.field2393.length());
                            } else if (var461.startsWith(class174.field2449)) {
                                var462 = 5;
                                var459 = var459.substring(class174.field2449.length());
                            } else if (var461.startsWith(class174.field2391)) {
                                var462 = 6;
                                var459 = var459.substring(class174.field2391.length());
                            } else if (var461.startsWith(class174.field2488)) {
                                var462 = 7;
                                var459 = var459.substring(class174.field2488.length());
                            } else if (var461.startsWith(class174.field2578)) {
                                var462 = 8;
                                var459 = var459.substring(class174.field2578.length());
                            } else if (var461.startsWith(class174.field2559)) {
                                var462 = 9;
                                var459 = var459.substring(class174.field2559.length());
                            } else if (var461.startsWith(class174.field2561)) {
                                var462 = 10;
                                var459 = var459.substring(class174.field2561.length());
                            } else if (var461.startsWith(class174.field2638)) {
                                var462 = 11;
                                var459 = var459.substring(class174.field2638.length());
                            } else if (client.field301 != 0) {
                                if (var461.startsWith(class174.field2542)) {
                                    var462 = 0;
                                    var459 = var459.substring(class174.field2542.length());
                                } else if (var461.startsWith(class174.field2544)) {
                                    var462 = 1;
                                    var459 = var459.substring(class174.field2544.length());
                                } else if (var461.startsWith(class174.field2546)) {
                                    var462 = 2;
                                    var459 = var459.substring(class174.field2546.length());
                                } else if (var461.startsWith(class174.field2548)) {
                                    var462 = 3;
                                    var459 = var459.substring(class174.field2548.length());
                                } else if (var461.startsWith(class174.field2550)) {
                                    var462 = 4;
                                    var459 = var459.substring(class174.field2550.length());
                                } else if (var461.startsWith(class174.field2552)) {
                                    var462 = 5;
                                    var459 = var459.substring(class174.field2552.length());
                                } else if (var461.startsWith(class174.field2554)) {
                                    var462 = 6;
                                    var459 = var459.substring(class174.field2554.length());
                                } else if (var461.startsWith(class174.field2556)) {
                                    var462 = 7;
                                    var459 = var459.substring(class174.field2556.length());
                                } else if (var461.startsWith(class174.field2558)) {
                                    var462 = 8;
                                    var459 = var459.substring(class174.field2558.length());
                                } else if (var461.startsWith(class174.field2576)) {
                                    var462 = 9;
                                    var459 = var459.substring(class174.field2576.length());
                                } else if (var461.startsWith(class174.field2479)) {
                                    var462 = 10;
                                    var459 = var459.substring(class174.field2479.length());
                                } else if (var461.startsWith(class174.field2564)) {
                                    var462 = 11;
                                    var459 = var459.substring(class174.field2564.length());
                                }
                            }
                            String var463 = var459.toLowerCase();
                            byte var464 = 0;
                            if (var463.startsWith(class174.field2565)) {
                                var464 = 1;
                                var459 = var459.substring(class174.field2565.length());
                            } else if (var463.startsWith(class174.field2610)) {
                                var464 = 2;
                                var459 = var459.substring(class174.field2610.length());
                            } else if (var463.startsWith(class174.field2569)) {
                                var464 = 3;
                                var459 = var459.substring(class174.field2569.length());
                            } else if (var463.startsWith(class174.field2571)) {
                                var464 = 4;
                                var459 = var459.substring(class174.field2571.length());
                            } else if (var463.startsWith(class174.field2573)) {
                                var464 = 5;
                                var459 = var459.substring(class174.field2573.length());
                            } else if (client.field301 != 0) {
                                if (var463.startsWith(class174.field2566)) {
                                    var464 = 1;
                                    var459 = var459.substring(class174.field2566.length());
                                } else if (var463.startsWith(class174.field2568)) {
                                    var464 = 2;
                                    var459 = var459.substring(class174.field2568.length());
                                } else if (var463.startsWith(class174.field2570)) {
                                    var464 = 3;
                                    var459 = var459.substring(class174.field2570.length());
                                } else if (var463.startsWith(class174.field2572)) {
                                    var464 = 4;
                                    var459 = var459.substring(class174.field2572.length());
                                } else if (var463.startsWith(class174.field2574)) {
                                    var464 = 5;
                                    var459 = var459.substring(class174.field2574.length());
                                }
                            }
                            client.field337.method2775(138);
                            client.field337.method2531(0);
                            int var465 = client.field337.field2098;
                            client.field337.method2531(var460);
                            client.field337.method2531(var462);
                            client.field337.method2531(var464);
                            class211.method664(client.field337, var459);
                            client.field337.method2591(client.field337.field2098 - var465);
                            continue;
                        }
                        if (var505 == 5009) {
                            var6 -= 2;
                            String var466 = field727[var6];
                            String var467 = field727[var6 + 1];
                            client.field337.method2775(241);
                            client.field337.method2532(0);
                            int var468 = client.field337.field2098;
                            client.field337.method2537(var466);
                            class211.method664(client.field337, var467);
                            client.field337.method2708(client.field337.field2098 - var468);
                            continue;
                        }
                        if (var505 == 5015) {
                            String var469;
                            if (Statics.field129 == null || Statics.field129.field259 == null) {
                                var469 = "";
                            } else {
                                var469 = Statics.field129.field259;
                            }
                            field727[var6++] = var469;
                            continue;
                        }
                        if (var505 == 5016) {
                            field729[var5++] = client.field515;
                            continue;
                        }
                        if (var505 == 5017) {
                            var5--;
                            int var470 = field729[var5];
                            field729[var5++] = class48.method184(var470);
                            continue;
                        }
                        if (var505 == 5018) {
                            var5--;
                            int var471 = field729[var5];
                            int[] var472 = field729;
                            int var473 = var5++;
                            class22 var474 = (class22) class48.field928.method2108((long) var471);
                            int var475;
                            if (var474 == null) {
                                var475 = -1;
                            } else if (class48.field923.field1907 == var474.field1893) {
                                var475 = -1;
                            } else {
                                var475 = ((class22) var474.field1893).field241;
                            }
                            var472[var473] = var475;
                            continue;
                        }
                        if (var505 == 5019) {
                            var5--;
                            int var476 = field729[var5];
                            int[] var477 = field729;
                            int var478 = var5++;
                            class22 var479 = (class22) class48.field928.method2108((long) var476);
                            int var480;
                            if (var479 == null) {
                                var480 = -1;
                            } else if (class48.field923.field1907 == var479.field1892) {
                                var480 = -1;
                            } else {
                                var480 = ((class22) var479.field1892).field241;
                            }
                            var477[var478] = var480;
                            continue;
                        }
                        if (var505 == 5020) {
                            var6--;
                            String var481 = field727[var6];
                            client.method1821(var481);
                            continue;
                        }
                        if (var505 == 5021) {
                            var6--;
                            client.field513 = field727[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var505 == 5022) {
                            field727[var6++] = client.field513;
                            continue;
                        }
                    }
                } else {
                    class170 var89;
                    if (var505 >= 2000) {
                        var505 -= 1000;
                        var5--;
                        var89 = class170.method1882(field729[var5]);
                    } else {
                        var89 = var58 ? Statics.field182 : Statics.field728;
                    }
                    if (var505 == 1300) {
                        var5--;
                        int var90 = field729[var5] - 1;
                        if (var90 >= 0 && var90 <= 9) {
                            var6--;
                            var89.method2913(var90, field727[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var505 == 1301) {
                        var5 -= 2;
                        int var91 = field729[var5];
                        int var92 = field729[var5 + 1];
                        var89.field2258 = class170.method1922(var91, var92);
                        continue;
                    }
                    if (var505 == 1302) {
                        var5--;
                        var89.field2267 = field729[var5] == 1;
                        continue;
                    }
                    if (var505 == 1303) {
                        var5--;
                        var89.field2286 = field729[var5];
                        continue;
                    }
                    if (var505 == 1304) {
                        var5--;
                        var89.field2232 = field729[var5];
                        continue;
                    }
                    if (var505 == 1305) {
                        var6--;
                        var89.field2304 = field727[var6];
                        continue;
                    }
                    if (var505 == 1306) {
                        var6--;
                        var89.field2324 = field727[var6];
                        continue;
                    }
                    if (var505 == 1307) {
                        var89.field2284 = null;
                        continue;
                    }
                }
                if (var505 < 5400) {
                    if (var505 == 5306) {
                        field729[var5++] = client.method1440();
                        continue;
                    }
                    if (var505 == 5307) {
                        var5--;
                        int var482 = field729[var5];
                        if (var482 == 1 || var482 == 2) {
                            client.method2979(var482);
                        }
                        continue;
                    }
                    if (var505 == 5308) {
                        field729[var5++] = Statics.field795.field697;
                        continue;
                    }
                    if (var505 == 5309) {
                        var5--;
                        int var483 = field729[var5];
                        if (var483 == 1 || var483 == 2) {
                            Statics.field795.field697 = var483;
                            class31.method2869();
                        }
                        continue;
                    }
                }
                if (var505 < 5600) {
                    if (var505 == 5504) {
                        var5 -= 2;
                        int var484 = field729[var5];
                        int var485 = field729[var5 + 1];
                        if (!client.field500) {
                            client.field420 = var484;
                            client.field378 = var485;
                        }
                        continue;
                    }
                    if (var505 == 5505) {
                        field729[var5++] = client.field420;
                        continue;
                    }
                    if (var505 == 5506) {
                        field729[var5++] = client.field378;
                        continue;
                    }
                    if (var505 == 5530) {
                        var5--;
                        int var486 = field729[var5];
                        if (var486 < 0) {
                            var486 = 0;
                        }
                        client.field367 = var486;
                        continue;
                    }
                    if (var505 == 5531) {
                        field729[var5++] = client.field367;
                        continue;
                    }
                }
                if (var505 >= 5700 || var505 != 5630) {
                    if (var505 < 6300) {
                        if (var505 == 6200) {
                            var5 -= 2;
                            client.field547 = (short) field729[var5];
                            if (client.field547 <= 0) {
                                client.field547 = 256;
                            }
                            client.field548 = (short) field729[var5 + 1];
                            if (client.field548 <= 0) {
                                client.field548 = 205;
                            }
                            continue;
                        }
                        if (var505 == 6201) {
                            var5 -= 2;
                            client.field536 = (short) field729[var5];
                            if (client.field536 <= 0) {
                                client.field536 = 256;
                            }
                            client.field550 = (short) field729[var5 + 1];
                            if (client.field550 <= 0) {
                                client.field550 = 320;
                            }
                            continue;
                        }
                        if (var505 == 6202) {
                            var5 -= 4;
                            client.field551 = (short) field729[var5];
                            if (client.field551 <= 0) {
                                client.field551 = 1;
                            }
                            client.field385 = (short) field729[var5 + 1];
                            if (client.field385 <= 0) {
                                client.field385 = 32767;
                            } else if (client.field385 < client.field551) {
                                client.field385 = client.field551;
                            }
                            client.field375 = (short) field729[var5 + 2];
                            if (client.field375 <= 0) {
                                client.field375 = 1;
                            }
                            client.field554 = (short) field729[var5 + 3];
                            if (client.field554 <= 0) {
                                client.field554 = 32767;
                            } else if (client.field554 < client.field375) {
                                client.field554 = client.field375;
                            }
                            continue;
                        }
                        if (var505 == 6203) {
                            if (client.field464 == null) {
                                field729[var5++] = -1;
                                field729[var5++] = -1;
                            } else {
                                client.method12(0, 0, client.field464.field2225, client.field464.field2226, false);
                                field729[var5++] = client.field557;
                                field729[var5++] = client.field306;
                            }
                            continue;
                        }
                        if (var505 == 6204) {
                            field729[var5++] = client.field536;
                            field729[var5++] = client.field550;
                            continue;
                        }
                        if (var505 == 6205) {
                            field729[var5++] = client.field547;
                            field729[var5++] = client.field548;
                            continue;
                        }
                    }
                    if (var505 < 6600) {
                        if (var505 == 6500) {
                            field729[var5++] = class30.method128() ? 1 : 0;
                            continue;
                        }
                        if (var505 == 6501) {
                            class30.field679 = 0;
                            class30 var487;
                            if (class30.field679 < class30.field683) {
                                var487 = Statics.field677[++class30.field679 - 1];
                            } else {
                                var487 = null;
                            }
                            if (var487 == null) {
                                field729[var5++] = -1;
                                field729[var5++] = 0;
                                field727[var6++] = "";
                                field729[var5++] = 0;
                                field729[var5++] = 0;
                                field727[var6++] = "";
                            } else {
                                field729[var5++] = var487.field682;
                                field729[var5++] = var487.field684;
                                field727[var6++] = var487.field678;
                                field729[var5++] = var487.field688;
                                field729[var5++] = var487.field685;
                                field727[var6++] = var487.field686;
                            }
                            continue;
                        }
                        if (var505 == 6502) {
                            class30 var490;
                            if (class30.field679 < class30.field683) {
                                var490 = Statics.field677[++class30.field679 - 1];
                            } else {
                                var490 = null;
                            }
                            if (var490 == null) {
                                field729[var5++] = -1;
                                field729[var5++] = 0;
                                field727[var6++] = "";
                                field729[var5++] = 0;
                                field729[var5++] = 0;
                                field727[var6++] = "";
                            } else {
                                field729[var5++] = var490.field682;
                                field729[var5++] = var490.field684;
                                field727[var6++] = var490.field678;
                                field729[var5++] = var490.field688;
                                field729[var5++] = var490.field685;
                                field727[var6++] = var490.field686;
                            }
                            continue;
                        }
                        if (var505 == 6506) {
                            var5--;
                            int var492 = field729[var5];
                            class30 var493 = null;
                            for (int var494 = 0; var494 < class30.field683; var494++) {
                                if (Statics.field677[var494].field682 == var492) {
                                    var493 = Statics.field677[var494];
                                    break;
                                }
                            }
                            if (var493 == null) {
                                field729[var5++] = -1;
                                field729[var5++] = 0;
                                field727[var6++] = "";
                                field729[var5++] = 0;
                                field729[var5++] = 0;
                                field727[var6++] = "";
                            } else {
                                field729[var5++] = var493.field682;
                                field729[var5++] = var493.field684;
                                field727[var6++] = var493.field678;
                                field729[var5++] = var493.field688;
                                field729[var5++] = var493.field685;
                                field727[var6++] = var493.field686;
                            }
                            continue;
                        }
                        if (var505 == 6507) {
                            var5 -= 4;
                            int var495 = field729[var5];
                            boolean var496 = field729[var5 + 1] == 1;
                            int var497 = field729[var5 + 2];
                            boolean var498 = field729[var5 + 3] == 1;
                            if (Statics.field677 != null) {
                                class30.method2762(0, Statics.field677.length - 1, var495, var496, var497, var498);
                            }
                            continue;
                        }
                        if (var505 == 6511) {
                            var5--;
                            int var499 = field729[var5];
                            if (var499 >= 0 && var499 < class30.field683) {
                                class30 var500 = Statics.field677[var499];
                                field729[var5++] = var500.field682;
                                field729[var5++] = var500.field684;
                                field727[var6++] = var500.field678;
                                field729[var5++] = var500.field688;
                                field729[var5++] = var500.field685;
                                field727[var6++] = var500.field686;
                                continue;
                            }
                            field729[var5++] = -1;
                            field729[var5++] = 0;
                            field727[var6++] = "";
                            field729[var5++] = 0;
                            field729[var5++] = 0;
                            field727[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field347 = 250;
            }
        } catch (Exception var504) {
            StringBuilder var502 = new StringBuilder(30);
            var502.append("").append(var4.field1889).append(" ");
            for (int var503 = field736 - 1; var503 >= 0; var503--) {
                var502.append("").append(field731[var503].field123.field1889).append(" ");
            }
            var502.append("").append(var10);
            class102.method690(var502.toString(), var504);
        }
    }

    @ObfuscatedName("eq.f(II)V")
    public static void method2385(int arg0) {
        if (arg0 == -1 || !class170.method1886(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2334[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3.field2291 != null) {
                class19 var4 = new class19();
                var4.field205 = var3;
                var4.field206 = var3.field2291;
                method1923(var4, 2000000);
            }
        }
    }
}
