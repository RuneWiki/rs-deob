package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ak")
public class class33 {

    @ObfuscatedName("ak.d")
    public static int[] field719 = new int[5];

    @ObfuscatedName("ak.k")
    public static int[][] field721 = new int[5][5000];

    @ObfuscatedName("ak.j")
    public static int[] field723 = new int[1000];

    @ObfuscatedName("ak.s")
    public static String[] field724 = new String[1000];

    @ObfuscatedName("ak.o")
    public static int field726 = 0;

    @ObfuscatedName("ak.a")
    public static class12[] field725 = new class12[50];

    @ObfuscatedName("ak.h")
    public static Calendar field728 = Calendar.getInstance();

    @ObfuscatedName("ak.r")
    public static final String[] field729 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ak.u")
    public static int field730 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.p(Lw;II)V")
    public static void method161(class19 arg0, int arg1) {
        Object[] var2 = arg0.field189;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method31(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field942;
        int[] var9 = var4.field948;
        byte var10 = -1;
        field726 = 0;
        try {
            Statics.field717 = new int[var4.field939];
            int var11 = 0;
            Statics.field720 = new String[var4.field943];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field184;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field185;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field181 == null ? -1 : arg0.field181.field2237;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field188;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field181 == null ? -1 : arg0.field181.field2198;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field187 == null ? -1 : arg0.field187.field2237;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field187 == null ? -1 : arg0.field187.field2198;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field196;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field199;
                    }
                    Statics.field717[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field191;
                    }
                    Statics.field720[var12++] = var15;
                }
            }
            int var16 = 0;
            field730 = arg0.field186;
            label2979: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var465 = var8[var7];
                if (var465 < 100) {
                    if (var465 == 0) {
                        field723[var5++] = var9[var7];
                        continue;
                    }
                    if (var465 == 1) {
                        int var17 = var9[var7];
                        field723[var5++] = class166.field2159[var17];
                        continue;
                    }
                    if (var465 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class166.field2159[var18] = field723[var5];
                        client.method719(var18);
                        continue;
                    }
                    if (var465 == 3) {
                        field724[var6++] = var4.field941[var7];
                        continue;
                    }
                    if (var465 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var465 == 7) {
                        var5 -= 2;
                        if (field723[var5 + 1] != field723[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var465 == 8) {
                        var5 -= 2;
                        if (field723[var5 + 1] == field723[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var465 == 9) {
                        var5 -= 2;
                        if (field723[var5] < field723[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var465 == 10) {
                        var5 -= 2;
                        if (field723[var5] > field723[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var465 == 21) {
                        if (field726 == 0) {
                            return;
                        }
                        class12 var19 = field725[--field726];
                        var4 = var19.field110;
                        var8 = var4.field942;
                        var9 = var4.field948;
                        var7 = var19.field106;
                        Statics.field717 = var19.field105;
                        Statics.field720 = var19.field108;
                        continue;
                    }
                    if (var465 == 25) {
                        int var20 = var9[var7];
                        field723[var5++] = Statics.method115(var20);
                        continue;
                    }
                    if (var465 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field723[var5];
                        class195 var23 = (class195) class195.field2846.method2169((long) var21);
                        class195 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field893.method3044(14, var21);
                            class195 var26 = new class195();
                            if (var25 != null) {
                                var26.method3281(new class154(var25));
                            }
                            class195.field2846.method2174(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field2841;
                        int var29 = var24.field2843;
                        int var30 = var24.field2844;
                        int var31 = class166.field2163[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class166.field2159[var28] = class166.field2159[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var465 == 31) {
                        var5 -= 2;
                        if (field723[var5] <= field723[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var465 == 32) {
                        var5 -= 2;
                        if (field723[var5] >= field723[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var465 == 33) {
                        field723[var5++] = Statics.field717[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var465 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field717[var10001] = field723[var5];
                        continue;
                    }
                    if (var465 == 35) {
                        field724[var6++] = Statics.field720[var9[var7]];
                        continue;
                    }
                    if (var465 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field720[var10001] = field724[var6];
                        continue;
                    }
                    if (var465 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class208.method683(field724, var6, var33);
                        field724[var6++] = var34;
                        continue;
                    }
                    if (var465 == 38) {
                        var5--;
                        continue;
                    }
                    if (var465 == 39) {
                        var6--;
                        continue;
                    }
                    if (var465 == 40) {
                        int var35 = var9[var7];
                        class49 var36 = class49.method31(var35);
                        int[] var37 = new int[var36.field939];
                        String[] var38 = new String[var36.field943];
                        for (int var39 = 0; var39 < var36.field944; var39++) {
                            var37[var39] = field723[var5 - var36.field944 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field945; var40++) {
                            var38[var40] = field724[var6 - var36.field945 + var40];
                        }
                        var5 -= var36.field944;
                        var6 -= var36.field945;
                        class12 var41 = new class12();
                        var41.field110 = var4;
                        var41.field106 = var7;
                        var41.field105 = Statics.field717;
                        var41.field108 = Statics.field720;
                        field725[++field726 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field942;
                        var9 = var36.field948;
                        var7 = -1;
                        Statics.field717 = var37;
                        Statics.field720 = var38;
                        continue;
                    }
                    if (var465 == 42) {
                        field723[var5++] = Statics.field1350.method801(var9[var7]);
                        continue;
                    }
                    if (var465 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1350.method800(var10001, field723[var5]);
                        continue;
                    }
                    if (var465 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field723[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field719[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label2979;
                                }
                                field721[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var465 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field723[var5];
                        if (var48 >= 0 && var48 < field719[var47]) {
                            field723[var5++] = field721[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var465 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field723[var5];
                        if (var50 >= 0 && var50 < field719[var49]) {
                            field721[var49][var50] = field723[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var465 == 47) {
                        String var51 = Statics.field1350.method816(var9[var7]);
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field724[var6++] = var51;
                        continue;
                    }
                    if (var465 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1350.method837(var10001, field724[var6]);
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var465 < 1000) {
                    if (var465 == 100) {
                        var5 -= 3;
                        int var53 = field723[var5];
                        int var54 = field723[var5 + 1];
                        int var55 = field723[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class170 var56 = class170.method723(var53);
                        if (var56.field2321 == null) {
                            var56.field2321 = new class170[var55 + 1];
                        }
                        if (var56.field2321.length <= var55) {
                            class170[] var57 = new class170[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2321.length; var58++) {
                                var57[var58] = var56.field2321[var58];
                            }
                            var56.field2321 = var57;
                        }
                        if (var55 > 0 && var56.field2321[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class170 var59 = new class170();
                        var59.field2199 = var54;
                        var59.field2216 = var59.field2237 = var56.field2237;
                        var59.field2198 = var55;
                        var59.field2215 = true;
                        var56.field2321[var55] = var59;
                        if (var52) {
                            Statics.field727 = var59;
                        } else {
                            Statics.field77 = var59;
                        }
                        client.method676(var56);
                        continue;
                    }
                    if (var465 == 101) {
                        class170 var60 = var52 ? Statics.field727 : Statics.field77;
                        class170 var61 = class170.method723(var60.field2237);
                        var61.field2321[var60.field2198] = null;
                        client.method676(var61);
                        continue;
                    }
                    if (var465 == 102) {
                        var5--;
                        class170 var62 = class170.method723(field723[var5]);
                        var62.field2321 = null;
                        client.method676(var62);
                        continue;
                    }
                    if (var465 == 200) {
                        var5 -= 2;
                        int var63 = field723[var5];
                        int var64 = field723[var5 + 1];
                        class170 var65 = class170.method1862(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field723[var5++] = 1;
                            if (var52) {
                                Statics.field727 = var65;
                            } else {
                                Statics.field77 = var65;
                            }
                            continue;
                        }
                        field723[var5++] = 0;
                        continue;
                    }
                    if (var465 == 201) {
                        var5--;
                        class170 var66 = class170.method723(field723[var5]);
                        if (var66 == null) {
                            field723[var5++] = 0;
                        } else {
                            field723[var5++] = 1;
                            if (var52) {
                                Statics.field727 = var66;
                            } else {
                                Statics.field77 = var66;
                            }
                        }
                        continue;
                    }
                } else if (var465 >= 1000 && var465 < 1100 || var465 >= 2000 && var465 < 2100) {
                    int var67 = -1;
                    class170 var68;
                    if (var465 >= 2000) {
                        var465 -= 1000;
                        var5--;
                        var67 = field723[var5];
                        var68 = class170.method723(var67);
                    } else {
                        var68 = var52 ? Statics.field727 : Statics.field77;
                    }
                    if (var465 == 1000) {
                        var5 -= 4;
                        var68.field2239 = field723[var5];
                        var68.field2207 = field723[var5 + 1];
                        var68.field2202 = field723[var5 + 2];
                        var68.field2196 = field723[var5 + 3];
                        client.method676(var68);
                        client.method3006(var68);
                        if (var67 != -1 && var68.field2199 == 0) {
                            client.method1787(Statics.field2203[var67 >> 16], var68, false);
                        }
                        continue;
                    }
                    if (var465 == 1001) {
                        var5 -= 4;
                        var68.field2208 = field723[var5];
                        var68.field2242 = field723[var5 + 1];
                        var68.field2252 = field723[var5 + 2];
                        var68.field2205 = field723[var5 + 3];
                        client.method676(var68);
                        client.method3006(var68);
                        if (var67 != -1 && var68.field2199 == 0) {
                            client.method1787(Statics.field2203[var67 >> 16], var68, false);
                        }
                        continue;
                    }
                    if (var465 == 1003) {
                        var5--;
                        boolean var69 = field723[var5] == 1;
                        if (var68.field2217 != var69) {
                            var68.field2217 = var69;
                            client.method676(var68);
                        }
                        continue;
                    }
                    if (var465 == 1005) {
                        var5--;
                        var68.field2195 = field723[var5] == 1;
                        continue;
                    }
                    if (var465 == 1006) {
                        var5--;
                        var68.field2298 = field723[var5] == 1;
                        continue;
                    }
                } else if (var465 >= 1100 && var465 < 1200 || var465 >= 2100 && var465 < 2200) {
                    int var70 = -1;
                    class170 var71;
                    if (var465 >= 2000) {
                        var465 -= 1000;
                        var5--;
                        var70 = field723[var5];
                        var71 = class170.method723(var70);
                    } else {
                        var71 = var52 ? Statics.field727 : Statics.field77;
                    }
                    if (var465 == 1100) {
                        var5 -= 2;
                        var71.field2218 = field723[var5];
                        if (var71.field2218 > var71.field2204 - var71.field2219) {
                            var71.field2218 = var71.field2204 - var71.field2219;
                        }
                        if (var71.field2218 < 0) {
                            var71.field2218 = 0;
                        }
                        var71.field2209 = field723[var5 + 1];
                        if (var71.field2209 > var71.field2221 - var71.field2213) {
                            var71.field2209 = var71.field2221 - var71.field2213;
                        }
                        if (var71.field2209 < 0) {
                            var71.field2209 = 0;
                        }
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1101) {
                        var5--;
                        var71.field2322 = field723[var5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1102) {
                        var5--;
                        var71.field2226 = field723[var5] == 1;
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1103) {
                        var5--;
                        var71.field2228 = field723[var5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1104) {
                        var5--;
                        var71.field2230 = field723[var5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1105) {
                        var5--;
                        var71.field2197 = field723[var5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1106) {
                        var5--;
                        var71.field2234 = field723[var5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1107) {
                        var5--;
                        var71.field2235 = field723[var5] == 1;
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1108) {
                        var71.field2186 = 1;
                        var5--;
                        var71.field2241 = field723[var5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1109) {
                        var5 -= 6;
                        var71.field2246 = field723[var5];
                        var71.field2248 = field723[var5 + 1];
                        var71.field2268 = field723[var5 + 2];
                        var71.field2310 = field723[var5 + 3];
                        var71.field2250 = field723[var5 + 4];
                        var71.field2251 = field723[var5 + 5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1110) {
                        var5--;
                        int var72 = field723[var5];
                        if (var71.field2244 != var72) {
                            var71.field2244 = var72;
                            var71.field2222 = 0;
                            var71.field2320 = 0;
                            client.method676(var71);
                        }
                        continue;
                    }
                    if (var465 == 1111) {
                        var5--;
                        var71.field2247 = field723[var5] == 1;
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1112) {
                        var6--;
                        String var73 = field724[var6];
                        if (!var73.equals(var71.field2257)) {
                            var71.field2257 = var73;
                            client.method676(var71);
                        }
                        continue;
                    }
                    if (var465 == 1113) {
                        var5--;
                        var71.field2256 = field723[var5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1114) {
                        var5 -= 3;
                        var71.field2260 = field723[var5];
                        var71.field2264 = field723[var5 + 1];
                        var71.field2259 = field723[var5 + 2];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1115) {
                        var5--;
                        var71.field2262 = field723[var5] == 1;
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1116) {
                        var5--;
                        var71.field2236 = field723[var5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1117) {
                        var5--;
                        var71.field2240 = field723[var5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1118) {
                        var5--;
                        var71.field2253 = field723[var5] == 1;
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1119) {
                        var5--;
                        var71.field2285 = field723[var5] == 1;
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1120) {
                        var5 -= 2;
                        var71.field2204 = field723[var5];
                        var71.field2221 = field723[var5 + 1];
                        client.method676(var71);
                        if (var70 != -1 && var71.field2199 == 0) {
                            client.method1787(Statics.field2203[var70 >> 16], var71, false);
                        }
                        continue;
                    }
                    if (var465 == 1121) {
                        client.method656(var71.field2237, var71.field2198);
                        client.field442 = var71;
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1122) {
                        var5--;
                        var71.field2233 = field723[var5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1123) {
                        var5--;
                        var71.field2290 = field723[var5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1124) {
                        var5--;
                        var71.field2229 = field723[var5];
                        client.method676(var71);
                        continue;
                    }
                    if (var465 == 1125) {
                        var5--;
                        int var74 = field723[var5];
                        class222 var75 = (class222) class149.method1356(class222.method2924(), var74);
                        if (var75 != null) {
                            var71.field2227 = var75;
                            client.method676(var71);
                        }
                        continue;
                    }
                } else if (!(var465 < 1200 || var465 >= 1300) || !(var465 < 2200 || var465 >= 2300)) {
                    class170 var76;
                    if (var465 >= 2000) {
                        var465 -= 1000;
                        var5--;
                        var76 = class170.method723(field723[var5]);
                    } else {
                        var76 = var52 ? Statics.field727 : Statics.field77;
                    }
                    client.method676(var76);
                    if (var465 == 1200 || var465 == 1205 || var465 == 1212) {
                        var5 -= 2;
                        int var77 = field723[var5];
                        int var78 = field723[var5 + 1];
                        var76.field2317 = var77;
                        var76.field2318 = var78;
                        class199 var79 = class199.method713(var77);
                        var76.field2268 = var79.field2956;
                        var76.field2310 = var79.field2940;
                        var76.field2250 = var79.field2952;
                        var76.field2246 = var79.field2951;
                        var76.field2248 = var79.field2957;
                        var76.field2251 = var79.field2955;
                        if (var465 == 1205) {
                            var76.field2188 = 0;
                        } else if (var465 == 1212 | var79.field2961 == 1) {
                            var76.field2188 = 1;
                        } else {
                            var76.field2188 = 2;
                        }
                        if (var76.field2200 > 0) {
                            var76.field2251 = var76.field2251 * 32 / var76.field2200;
                        } else if (var76.field2208 > 0) {
                            var76.field2251 = var76.field2251 * 32 / var76.field2208;
                        }
                        continue;
                    }
                    if (var465 == 1201) {
                        var76.field2186 = 2;
                        var5--;
                        var76.field2241 = field723[var5];
                        continue;
                    }
                    if (var465 == 1202) {
                        var76.field2186 = 3;
                        var76.field2241 = Statics.field169.field240.method2895();
                        continue;
                    }
                } else if (var465 >= 1300 && var465 < 1400 || var465 >= 2300 && var465 < 2400) {
                    class170 var80;
                    if (var465 >= 2000) {
                        var465 -= 1000;
                        var5--;
                        var80 = class170.method723(field723[var5]);
                    } else {
                        var80 = var52 ? Statics.field727 : Statics.field77;
                    }
                    if (var465 == 1300) {
                        var5--;
                        int var81 = field723[var5] - 1;
                        if (var81 >= 0 && var81 <= 9) {
                            var6--;
                            var80.method2949(var81, field724[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var465 == 1301) {
                        var5 -= 2;
                        int var82 = field723[var5];
                        int var83 = field723[var5 + 1];
                        var80.field2272 = class170.method1862(var82, var83);
                        continue;
                    }
                    if (var465 == 1302) {
                        var5--;
                        var80.field2212 = field723[var5] == 1;
                        continue;
                    }
                    if (var465 == 1303) {
                        var5--;
                        var80.field2261 = field723[var5];
                        continue;
                    }
                    if (var465 == 1304) {
                        var5--;
                        var80.field2274 = field723[var5];
                        continue;
                    }
                    if (var465 == 1305) {
                        var6--;
                        var80.field2270 = field724[var6];
                        continue;
                    }
                    if (var465 == 1306) {
                        var6--;
                        var80.field2276 = field724[var6];
                        continue;
                    }
                    if (var465 == 1307) {
                        var80.field2271 = null;
                        continue;
                    }
                } else {
                    if (var465 >= 1400 && var465 < 1500 || var465 >= 2400 && var465 < 2500) {
                        class170 var84;
                        if (var465 >= 2000) {
                            var465 -= 1000;
                            var5--;
                            var84 = class170.method723(field723[var5]);
                        } else {
                            var84 = var52 ? Statics.field727 : Statics.field77;
                        }
                        var6--;
                        String var85 = field724[var6];
                        int[] var86 = null;
                        if (var85.length() > 0 && var85.charAt(var85.length() - 1) == 'Y') {
                            var5--;
                            int var87 = field723[var5];
                            if (var87 > 0) {
                                var86 = new int[var87];
                                while (var87-- > 0) {
                                    var5--;
                                    var86[var87] = field723[var5];
                                }
                            }
                            var85 = var85.substring(0, var85.length() - 1);
                        }
                        Object[] var88 = new Object[var85.length() + 1];
                        for (int var89 = var88.length - 1; var89 >= 1; var89--) {
                            if (var85.charAt(var89 - 1) == 's') {
                                var6--;
                                var88[var89] = field724[var6];
                            } else {
                                var5--;
                                var88[var89] = Integer.valueOf(field723[var5]);
                            }
                        }
                        var5--;
                        int var90 = field723[var5];
                        if (var90 == -1) {
                            var88 = null;
                        } else {
                            var88[0] = Integer.valueOf(var90);
                        }
                        if (var465 == 1400) {
                            var84.field2296 = var88;
                        }
                        if (var465 == 1401) {
                            var84.field2294 = var88;
                        }
                        if (var465 == 1402) {
                            var84.field2281 = var88;
                        }
                        if (var465 == 1403) {
                            var84.field2283 = var88;
                        }
                        if (var465 == 1404) {
                            var84.field2275 = var88;
                        }
                        if (var465 == 1405) {
                            var84.field2286 = var88;
                        }
                        if (var465 == 1406) {
                            var84.field2254 = var88;
                        }
                        if (var465 == 1407) {
                            var84.field2249 = var88;
                            var84.field2305 = var86;
                        }
                        if (var465 == 1408) {
                            var84.field2220 = var88;
                        }
                        if (var465 == 1409) {
                            var84.field2297 = var88;
                        }
                        if (var465 == 1410) {
                            var84.field2287 = var88;
                        }
                        if (var465 == 1411) {
                            var84.field2280 = var88;
                        }
                        if (var465 == 1412) {
                            var84.field2214 = var88;
                        }
                        if (var465 == 1414) {
                            var84.field2331 = var88;
                            var84.field2293 = var86;
                        }
                        if (var465 == 1415) {
                            var84.field2289 = var88;
                            var84.field2295 = var86;
                        }
                        if (var465 == 1416) {
                            var84.field2288 = var88;
                        }
                        if (var465 == 1417) {
                            var84.field2206 = var88;
                        }
                        if (var465 == 1418) {
                            var84.field2299 = var88;
                        }
                        if (var465 == 1419) {
                            var84.field2291 = var88;
                        }
                        if (var465 == 1420) {
                            var84.field2301 = var88;
                        }
                        if (var465 == 1421) {
                            var84.field2302 = var88;
                        }
                        if (var465 == 1422) {
                            var84.field2303 = var88;
                        }
                        if (var465 == 1423) {
                            var84.field2304 = var88;
                        }
                        if (var465 == 1424) {
                            var84.field2258 = var88;
                        }
                        if (var465 == 1425) {
                            var84.field2307 = var88;
                        }
                        if (var465 == 1426) {
                            var84.field2308 = var88;
                        }
                        if (var465 == 1427) {
                            var84.field2306 = var88;
                        }
                        var84.field2277 = true;
                        continue;
                    }
                    if (var465 < 1600) {
                        class170 var91 = var52 ? Statics.field727 : Statics.field77;
                        if (var465 == 1500) {
                            field723[var5++] = var91.field2210;
                            continue;
                        }
                        if (var465 == 1501) {
                            field723[var5++] = var91.field2211;
                            continue;
                        }
                        if (var465 == 1502) {
                            field723[var5++] = var91.field2219;
                            continue;
                        }
                        if (var465 == 1503) {
                            field723[var5++] = var91.field2213;
                            continue;
                        }
                        if (var465 == 1504) {
                            field723[var5++] = var91.field2217 ? 1 : 0;
                            continue;
                        }
                        if (var465 == 1505) {
                            field723[var5++] = var91.field2216;
                            continue;
                        }
                    } else if (var465 < 1700) {
                        class170 var92 = var52 ? Statics.field727 : Statics.field77;
                        if (var465 == 1600) {
                            field723[var5++] = var92.field2218;
                            continue;
                        }
                        if (var465 == 1601) {
                            field723[var5++] = var92.field2209;
                            continue;
                        }
                        if (var465 == 1602) {
                            field724[var6++] = var92.field2257;
                            continue;
                        }
                        if (var465 == 1603) {
                            field723[var5++] = var92.field2204;
                            continue;
                        }
                        if (var465 == 1604) {
                            field723[var5++] = var92.field2221;
                            continue;
                        }
                        if (var465 == 1605) {
                            field723[var5++] = var92.field2251;
                            continue;
                        }
                        if (var465 == 1606) {
                            field723[var5++] = var92.field2268;
                            continue;
                        }
                        if (var465 == 1607) {
                            field723[var5++] = var92.field2250;
                            continue;
                        }
                        if (var465 == 1608) {
                            field723[var5++] = var92.field2310;
                            continue;
                        }
                        if (var465 == 1609) {
                            field723[var5++] = var92.field2228;
                            continue;
                        }
                        if (var465 == 1610) {
                            field723[var5++] = var92.field2229;
                            continue;
                        }
                        if (var465 == 1611) {
                            field723[var5++] = var92.field2322;
                            continue;
                        }
                        if (var465 == 1612) {
                            field723[var5++] = var92.field2290;
                            continue;
                        }
                        if (var465 == 1613) {
                            field723[var5++] = var92.field2227.method727();
                            continue;
                        }
                    } else if (var465 < 1800) {
                        class170 var93 = var52 ? Statics.field727 : Statics.field77;
                        if (var465 == 1700) {
                            field723[var5++] = var93.field2317;
                            continue;
                        }
                        if (var465 == 1701) {
                            if (var93.field2317 == -1) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = var93.field2318;
                            }
                            continue;
                        }
                        if (var465 == 1702) {
                            field723[var5++] = var93.field2198;
                            continue;
                        }
                    } else if (var465 < 1900) {
                        class170 var94 = var52 ? Statics.field727 : Statics.field77;
                        if (var465 == 1800) {
                            int[] var95 = field723;
                            int var96 = var5++;
                            int var97 = client.method711(var94);
                            int var98 = var97 >> 11 & 0x3F;
                            var95[var96] = var98;
                            continue;
                        }
                        if (var465 == 1801) {
                            var5--;
                            int var99 = field723[var5];
                            int var466 = var99 - 1;
                            if (var94.field2271 != null && var466 < var94.field2271.length && var94.field2271[var466] != null) {
                                field724[var6++] = var94.field2271[var466];
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var465 == 1802) {
                            if (var94.field2270 == null) {
                                field724[var6++] = "";
                            } else {
                                field724[var6++] = var94.field2270;
                            }
                            continue;
                        }
                    } else if (!(var465 < 1900 || var465 >= 2000) || !(var465 < 2900 || var465 >= 3000)) {
                        class170 var100;
                        if (var465 >= 2000) {
                            var465 -= 1000;
                            var5--;
                            var100 = class170.method723(field723[var5]);
                        } else {
                            var100 = var52 ? Statics.field727 : Statics.field77;
                        }
                        if (var465 == 1927) {
                            if (field730 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var100.field2306 == null) {
                                return;
                            }
                            class19 var101 = new class19();
                            var101.field181 = var100;
                            var101.field189 = var100.field2306;
                            var101.field186 = field730 + 1;
                            client.field477.method2232(arg0);
                            continue;
                        }
                    } else if (var465 < 2600) {
                        var5--;
                        class170 var102 = class170.method723(field723[var5]);
                        if (var465 == 2500) {
                            field723[var5++] = var102.field2210;
                            continue;
                        }
                        if (var465 == 2501) {
                            field723[var5++] = var102.field2211;
                            continue;
                        }
                        if (var465 == 2502) {
                            field723[var5++] = var102.field2219;
                            continue;
                        }
                        if (var465 == 2503) {
                            field723[var5++] = var102.field2213;
                            continue;
                        }
                        if (var465 == 2504) {
                            field723[var5++] = var102.field2217 ? 1 : 0;
                            continue;
                        }
                        if (var465 == 2505) {
                            field723[var5++] = var102.field2216;
                            continue;
                        }
                    } else if (var465 < 2700) {
                        var5--;
                        class170 var103 = class170.method723(field723[var5]);
                        if (var465 == 2600) {
                            field723[var5++] = var103.field2218;
                            continue;
                        }
                        if (var465 == 2601) {
                            field723[var5++] = var103.field2209;
                            continue;
                        }
                        if (var465 == 2602) {
                            field724[var6++] = var103.field2257;
                            continue;
                        }
                        if (var465 == 2603) {
                            field723[var5++] = var103.field2204;
                            continue;
                        }
                        if (var465 == 2604) {
                            field723[var5++] = var103.field2221;
                            continue;
                        }
                        if (var465 == 2605) {
                            field723[var5++] = var103.field2251;
                            continue;
                        }
                        if (var465 == 2606) {
                            field723[var5++] = var103.field2268;
                            continue;
                        }
                        if (var465 == 2607) {
                            field723[var5++] = var103.field2250;
                            continue;
                        }
                        if (var465 == 2608) {
                            field723[var5++] = var103.field2310;
                            continue;
                        }
                        if (var465 == 2609) {
                            field723[var5++] = var103.field2228;
                            continue;
                        }
                        if (var465 == 2610) {
                            field723[var5++] = var103.field2229;
                            continue;
                        }
                        if (var465 == 2611) {
                            field723[var5++] = var103.field2322;
                            continue;
                        }
                        if (var465 == 2612) {
                            field723[var5++] = var103.field2290;
                            continue;
                        }
                        if (var465 == 2613) {
                            field723[var5++] = var103.field2227.method727();
                            continue;
                        }
                    } else if (var465 < 2800) {
                        if (var465 == 2700) {
                            var5--;
                            class170 var104 = class170.method723(field723[var5]);
                            field723[var5++] = var104.field2317;
                            continue;
                        }
                        if (var465 == 2701) {
                            var5--;
                            class170 var105 = class170.method723(field723[var5]);
                            if (var105.field2317 == -1) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = var105.field2318;
                            }
                            continue;
                        }
                        if (var465 == 2702) {
                            var5--;
                            int var106 = field723[var5];
                            class18 var107 = (class18) client.field439.method2199((long) var106);
                            if (var107 == null) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = 1;
                            }
                            continue;
                        }
                        if (var465 == 2706) {
                            field723[var5++] = client.field438;
                            continue;
                        }
                    } else if (var465 < 2900) {
                        var5--;
                        class170 var108 = class170.method723(field723[var5]);
                        if (var465 == 2800) {
                            int[] var109 = field723;
                            int var110 = var5++;
                            int var111 = client.method711(var108);
                            int var112 = var111 >> 11 & 0x3F;
                            var109[var110] = var112;
                            continue;
                        }
                        if (var465 == 2801) {
                            var5--;
                            int var113 = field723[var5];
                            int var467 = var113 - 1;
                            if (var108.field2271 != null && var467 < var108.field2271.length && var108.field2271[var467] != null) {
                                field724[var6++] = var108.field2271[var467];
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var465 == 2802) {
                            if (var108.field2270 == null) {
                                field724[var6++] = "";
                            } else {
                                field724[var6++] = var108.field2270;
                            }
                            continue;
                        }
                    } else if (var465 < 3200) {
                        if (var465 == 3100) {
                            var6--;
                            String var114 = field724[var6];
                            class48.method1829(0, "", var114);
                            continue;
                        }
                        if (var465 == 3101) {
                            var5 -= 2;
                            Statics.method3009(Statics.field169, field723[var5], field723[var5 + 1]);
                            continue;
                        }
                        if (var465 == 3103) {
                            client.field395.method2804(181);
                            for (class18 var115 = (class18) client.field439.method2186(); var115 != null; var115 = (class18) client.field439.method2194()) {
                                if (var115.field176 == 0 || var115.field176 == 3) {
                                    client.method118(var115, true);
                                }
                            }
                            if (client.field442 != null) {
                                client.method676(client.field442);
                                client.field442 = null;
                            }
                            continue;
                        }
                        if (var465 == 3104) {
                            var6--;
                            String var116 = field724[var6];
                            int var117 = 0;
                            if (class208.method780(var116)) {
                                var117 = class208.method3559(var116);
                            }
                            client.field395.method2804(228);
                            client.field395.method2581(var117);
                            continue;
                        }
                        if (var465 == 3105) {
                            var6--;
                            String var118 = field724[var6];
                            client.field395.method2804(232);
                            client.field395.method2578(var118.length() + 1);
                            client.field395.method2584(var118);
                            continue;
                        }
                        if (var465 == 3106) {
                            var6--;
                            String var119 = field724[var6];
                            client.field395.method2804(5);
                            client.field395.method2578(var119.length() + 1);
                            client.field395.method2584(var119);
                            continue;
                        }
                        if (var465 == 3107) {
                            var5--;
                            int var120 = field723[var5];
                            var6--;
                            String var121 = field724[var6];
                            int var122 = class46.field899;
                            int[] var123 = class46.field896;
                            boolean var124 = false;
                            for (int var125 = 0; var125 < var122; var125++) {
                                class24 var126 = client.field400[var123[var125]];
                                if (var126 != null && Statics.field169 != var126 && var126.field264 != null && var126.field264.equalsIgnoreCase(var121)) {
                                    if (var120 == 1) {
                                        client.field395.method2804(64);
                                        client.field395.method2649(var123[var125]);
                                        client.field395.method2618(0);
                                    } else if (var120 == 4) {
                                        client.field395.method2804(159);
                                        client.field395.method2683(var123[var125]);
                                        client.field395.method2617(0);
                                    } else if (var120 == 6) {
                                        client.field395.method2804(247);
                                        client.field395.method2618(0);
                                        client.field395.method2616(var123[var125]);
                                    } else if (var120 == 7) {
                                        client.field395.method2804(48);
                                        client.field395.method2683(var123[var125]);
                                        client.field395.method2578(0);
                                    }
                                    var124 = true;
                                    break;
                                }
                            }
                            if (!var124) {
                                class48.method1829(4, "", class174.field2499 + var121);
                            }
                            continue;
                        }
                        if (var465 == 3108) {
                            var5 -= 3;
                            int var127 = field723[var5];
                            int var128 = field723[var5 + 1];
                            int var129 = field723[var5 + 2];
                            class170 var130 = class170.method723(var129);
                            client.method2125(var130, var127, var128);
                            continue;
                        }
                        if (var465 == 3109) {
                            var5 -= 2;
                            int var131 = field723[var5];
                            int var132 = field723[var5 + 1];
                            class170 var133 = var52 ? Statics.field727 : Statics.field77;
                            client.method2125(var133, var131, var132);
                            continue;
                        }
                        if (var465 == 3110) {
                            var5--;
                            Statics.field938 = field723[var5] == 1;
                            continue;
                        }
                        if (var465 == 3111) {
                            field723[var5++] = Statics.field1734.field686 ? 1 : 0;
                            continue;
                        }
                        if (var465 == 3112) {
                            var5--;
                            Statics.field1734.field686 = field723[var5] == 1;
                            class31.method1596();
                            continue;
                        }
                        if (var465 == 3113) {
                            var6--;
                            String var134 = field724[var6];
                            var5--;
                            boolean var135 = field723[var5] == 1;
                            class115.method702(var134, var135, false);
                            continue;
                        }
                        if (var465 == 3115) {
                            var5--;
                            int var136 = field723[var5];
                            client.field395.method2804(81);
                            client.field395.method2616(var136);
                            continue;
                        }
                        if (var465 == 3116) {
                            var5--;
                            int var137 = field723[var5];
                            var6 -= 2;
                            String var138 = field724[var6];
                            String var139 = field724[var6 + 1];
                            if (var138.length() <= 500 && var139.length() <= 500) {
                                client.field395.method2804(105);
                                client.field395.method2616(1 + class154.method724(var138) + class154.method724(var139));
                                client.field395.method2578(var137);
                                client.field395.method2584(var138);
                                client.field395.method2584(var139);
                            }
                            continue;
                        }
                    } else if (var465 < 3300) {
                        if (var465 == 3200) {
                            var5 -= 3;
                            int var140 = field723[var5];
                            int var141 = field723[var5 + 1];
                            int var142 = field723[var5 + 2];
                            if (client.field518 != 0 && var141 != 0 && client.field371 < 50) {
                                client.field521[client.field371] = var140;
                                client.field522[client.field371] = var141;
                                client.field523[client.field371] = var142;
                                client.field303[client.field371] = null;
                                client.field524[client.field371] = 0;
                                client.field371++;
                            }
                            continue;
                        }
                        if (var465 == 3201) {
                            var5--;
                            int var143 = field723[var5];
                            if (var143 == -1 && !client.field517) {
                                Statics.field1921.method2338();
                                class139.field1922 = 1;
                                Statics.field888 = null;
                            } else if (var143 != -1 && client.field516 != var143 && client.field537 != 0 && !client.field517) {
                                class139.method3478(2, Statics.field3229, var143, 0, client.field537, false);
                            }
                            client.field516 = var143;
                            continue;
                        }
                        if (var465 == 3202) {
                            var5 -= 2;
                            client.method667(field723[var5], field723[var5 + 1]);
                            continue;
                        }
                    } else if (var465 < 3400) {
                        if (var465 == 3300) {
                            field723[var5++] = client.field289;
                            continue;
                        }
                        if (var465 == 3301) {
                            var5 -= 2;
                            int var144 = field723[var5];
                            int var145 = field723[var5 + 1];
                            field723[var5++] = class13.method48(var144, var145);
                            continue;
                        }
                        if (var465 == 3302) {
                            var5 -= 2;
                            int var146 = field723[var5];
                            int var147 = field723[var5 + 1];
                            int[] var148 = field723;
                            int var149 = var5++;
                            class13 var150 = (class13) class13.field115.method2199((long) var146);
                            int var151;
                            if (var150 == null) {
                                var151 = 0;
                            } else if (var147 >= 0 && var147 < var150.field120.length) {
                                var151 = var150.field120[var147];
                            } else {
                                var151 = 0;
                            }
                            var148[var149] = var151;
                            continue;
                        }
                        if (var465 == 3303) {
                            var5 -= 2;
                            int var152 = field723[var5];
                            int var153 = field723[var5 + 1];
                            field723[var5++] = class13.method2079(var152, var153);
                            continue;
                        }
                        if (var465 == 3304) {
                            var5--;
                            int var154 = field723[var5];
                            field723[var5++] = class187.method2980(var154).field2766;
                            continue;
                        }
                        if (var465 == 3305) {
                            var5--;
                            int var155 = field723[var5];
                            field723[var5++] = client.field456[var155];
                            continue;
                        }
                        if (var465 == 3306) {
                            var5--;
                            int var156 = field723[var5];
                            field723[var5++] = client.field415[var156];
                            continue;
                        }
                        if (var465 == 3307) {
                            var5--;
                            int var157 = field723[var5];
                            field723[var5++] = client.field388[var157];
                            continue;
                        }
                        if (var465 == 3308) {
                            int var158 = Statics.field1559;
                            int var159 = (Statics.field169.field622 >> 7) + Statics.field878;
                            int var160 = (Statics.field169.field639 >> 7) + Statics.field33;
                            field723[var5++] = (var158 << 28) + (var159 << 14) + var160;
                            continue;
                        }
                        if (var465 == 3309) {
                            var5--;
                            int var161 = field723[var5];
                            field723[var5++] = var161 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var465 == 3310) {
                            var5--;
                            int var162 = field723[var5];
                            field723[var5++] = var162 >> 28;
                            continue;
                        }
                        if (var465 == 3311) {
                            var5--;
                            int var163 = field723[var5];
                            field723[var5++] = var163 & 0x3FFF;
                            continue;
                        }
                        if (var465 == 3312) {
                            field723[var5++] = client.field283 ? 1 : 0;
                            continue;
                        }
                        if (var465 == 3313) {
                            var5 -= 2;
                            int var164 = field723[var5] + 32768;
                            int var165 = field723[var5 + 1];
                            field723[var5++] = class13.method48(var164, var165);
                            continue;
                        }
                        if (var465 == 3314) {
                            var5 -= 2;
                            int var166 = field723[var5] + 32768;
                            int var167 = field723[var5 + 1];
                            int[] var168 = field723;
                            int var169 = var5++;
                            class13 var170 = (class13) class13.field115.method2199((long) var166);
                            int var171;
                            if (var170 == null) {
                                var171 = 0;
                            } else if (var167 >= 0 && var167 < var170.field120.length) {
                                var171 = var170.field120[var167];
                            } else {
                                var171 = 0;
                            }
                            var168[var169] = var171;
                            continue;
                        }
                        if (var465 == 3315) {
                            var5 -= 2;
                            int var172 = field723[var5] + 32768;
                            int var173 = field723[var5 + 1];
                            field723[var5++] = class13.method2079(var172, var173);
                            continue;
                        }
                        if (var465 == 3316) {
                            if (client.field328 >= 2) {
                                field723[var5++] = client.field328;
                            } else {
                                field723[var5++] = 0;
                            }
                            continue;
                        }
                        if (var465 == 3317) {
                            field723[var5++] = client.field296;
                            continue;
                        }
                        if (var465 == 3318) {
                            field723[var5++] = client.field280;
                            continue;
                        }
                        if (var465 == 3321) {
                            field723[var5++] = client.field443;
                            continue;
                        }
                        if (var465 == 3322) {
                            field723[var5++] = client.field319;
                            continue;
                        }
                        if (var465 == 3323) {
                            if (client.field447) {
                                field723[var5++] = 1;
                            } else {
                                field723[var5++] = 0;
                            }
                            continue;
                        }
                        if (var465 == 3324) {
                            field723[var5++] = client.field281;
                            continue;
                        }
                    } else if (var465 < 3500) {
                        if (var465 == 3400) {
                            var5 -= 2;
                            int var174 = field723[var5];
                            int var175 = field723[var5 + 1];
                            class196 var176 = class196.method3016(var174);
                            if (var176.field2852 != 's') {
                            }
                            for (int var177 = 0; var177 < var176.field2855; var177++) {
                                if (var176.field2856[var177] == var175) {
                                    field724[var6++] = var176.field2853[var177];
                                    var176 = null;
                                    break;
                                }
                            }
                            if (var176 != null) {
                                field724[var6++] = var176.field2859;
                            }
                            continue;
                        }
                        if (var465 == 3408) {
                            var5 -= 4;
                            int var178 = field723[var5];
                            int var179 = field723[var5 + 1];
                            int var180 = field723[var5 + 2];
                            int var181 = field723[var5 + 3];
                            class196 var182 = class196.method3016(var180);
                            if (var182.field2851 == var178 && var182.field2852 == var179) {
                                for (int var183 = 0; var183 < var182.field2855; var183++) {
                                    if (var182.field2856[var183] == var181) {
                                        if (var179 == 115) {
                                            field724[var6++] = var182.field2853[var183];
                                        } else {
                                            field723[var5++] = var182.field2857[var183];
                                        }
                                        var182 = null;
                                        break;
                                    }
                                }
                                if (var182 != null) {
                                    if (var179 == 115) {
                                        field724[var6++] = var182.field2859;
                                    } else {
                                        field723[var5++] = var182.field2854;
                                    }
                                }
                                continue;
                            }
                            if (var179 == 115) {
                                field724[var6++] = "null";
                            } else {
                                field723[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var465 < 3700) {
                        if (var465 == 3600) {
                            if (client.field546 == 0) {
                                field723[var5++] = -2;
                            } else if (client.field546 == 1) {
                                field723[var5++] = -1;
                            } else {
                                field723[var5++] = client.field545;
                            }
                            continue;
                        }
                        if (var465 == 3601) {
                            var5--;
                            int var184 = field723[var5];
                            if (client.field546 == 2 && var184 < client.field545) {
                                field724[var6++] = client.field383[var184].field144;
                                field724[var6++] = client.field383[var184].field145;
                                continue;
                            }
                            field724[var6++] = "";
                            field724[var6++] = "";
                            continue;
                        }
                        if (var465 == 3602) {
                            var5--;
                            int var185 = field723[var5];
                            if (client.field546 == 2 && var185 < client.field545) {
                                field723[var5++] = client.field383[var185].field146;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var465 == 3603) {
                            var5--;
                            int var186 = field723[var5];
                            if (client.field546 == 2 && var186 < client.field545) {
                                field723[var5++] = client.field383[var186].field148;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var465 == 3604) {
                            var6--;
                            String var187 = field724[var6];
                            var5--;
                            int var188 = field723[var5];
                            client.method1907(var187, var188);
                            continue;
                        }
                        if (var465 == 3605) {
                            var6--;
                            String var189 = field724[var6];
                            client.method3521(var189);
                            continue;
                        }
                        if (var465 == 3606) {
                            var6--;
                            String var190 = field724[var6];
                            if (var190 == null) {
                                continue;
                            }
                            String var191 = class205.method1599(var190, Statics.field1562);
                            if (var191 == null) {
                                continue;
                            }
                            int var192 = 0;
                            while (true) {
                                if (var192 >= client.field545) {
                                    continue label2979;
                                }
                                class15 var193 = client.field383[var192];
                                String var194 = var193.field144;
                                String var195 = class205.method1599(var194, Statics.field1562);
                                if (class218.method1331(var190, var191, var194, var195)) {
                                    client.field545--;
                                    for (int var196 = var192; var196 < client.field545; var196++) {
                                        client.field383[var196] = client.field383[var196 + 1];
                                    }
                                    client.field417 = client.field463;
                                    client.field395.method2804(0);
                                    client.field395.method2578(class154.method724(var190));
                                    client.field395.method2584(var190);
                                    continue label2979;
                                }
                                var192++;
                            }
                        }
                        if (var465 == 3607) {
                            var6--;
                            String var197 = field724[var6];
                            client.method2112(var197, false);
                            continue;
                        }
                        if (var465 == 3608) {
                            var6--;
                            String var198 = field724[var6];
                            client.method2932(var198);
                            continue;
                        }
                        if (var465 == 3609) {
                            var6--;
                            String var199 = field724[var6];
                            class178[] var200 = class178.method690();
                            for (int var201 = 0; var201 < var200.length; var201++) {
                                class178 var202 = var200[var201];
                                if (var202.field2664 != -1 && var199.startsWith(class38.method2930(var202.field2664))) {
                                    var199 = var199.substring(6 + Integer.toString(var202.field2664).length());
                                    break;
                                }
                            }
                            field723[var5++] = client.method2022(var199, false) ? 1 : 0;
                            continue;
                        }
                        if (var465 == 3611) {
                            if (client.field505 == null) {
                                field724[var6++] = "";
                            } else {
                                field724[var6++] = class206.method3288(client.field505);
                            }
                            continue;
                        }
                        if (var465 == 3612) {
                            if (client.field505 == null) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = Statics.field100;
                            }
                            continue;
                        }
                        if (var465 == 3613) {
                            var5--;
                            int var203 = field723[var5];
                            if (client.field505 != null && var203 < Statics.field100) {
                                field724[var6++] = Statics.field1545[var203].field269;
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var465 == 3614) {
                            var5--;
                            int var204 = field723[var5];
                            if (client.field505 != null && var204 < Statics.field100) {
                                field723[var5++] = Statics.field1545[var204].field272;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var465 == 3615) {
                            var5--;
                            int var205 = field723[var5];
                            if (client.field505 != null && var205 < Statics.field100) {
                                field723[var5++] = Statics.field1545[var205].field271;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var465 == 3616) {
                            field723[var5++] = Statics.field150;
                            continue;
                        }
                        if (var465 == 3617) {
                            var6--;
                            String var206 = field724[var6];
                            client.method726(var206);
                            continue;
                        }
                        if (var465 == 3618) {
                            field723[var5++] = Statics.field1743;
                            continue;
                        }
                        if (var465 == 3619) {
                            var6--;
                            String var207 = field724[var6];
                            if (!var207.equals("")) {
                                client.field395.method2804(111);
                                client.field395.method2578(class154.method724(var207));
                                client.field395.method2584(var207);
                            }
                            continue;
                        }
                        if (var465 == 3620) {
                            client.method1592();
                            continue;
                        }
                        if (var465 == 3621) {
                            if (client.field546 == 0) {
                                field723[var5++] = -1;
                            } else {
                                field723[var5++] = client.field549;
                            }
                            continue;
                        }
                        if (var465 == 3622) {
                            var5--;
                            int var208 = field723[var5];
                            if (client.field546 != 0 && var208 < client.field549) {
                                field724[var6++] = client.field330[var208].field201;
                                field724[var6++] = client.field330[var208].field204;
                                continue;
                            }
                            field724[var6++] = "";
                            field724[var6++] = "";
                            continue;
                        }
                        if (var465 == 3623) {
                            var6--;
                            String var209 = field724[var6];
                            if (var209.startsWith(class38.method2930(0)) || var209.startsWith(class38.method2930(1))) {
                                var209 = var209.substring(7);
                            }
                            field723[var5++] = client.method3004(var209) ? 1 : 0;
                            continue;
                        }
                        if (var465 == 3624) {
                            var5--;
                            int var210 = field723[var5];
                            if (Statics.field1545 != null && var210 < Statics.field100 && Statics.field1545[var210].field269.equalsIgnoreCase(Statics.field169.field264)) {
                                field723[var5++] = 1;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var465 == 3625) {
                            if (client.field316 == null) {
                                field724[var6++] = "";
                            } else {
                                field724[var6++] = class206.method3288(client.field316);
                            }
                            continue;
                        }
                    } else if (var465 < 4000) {
                        if (var465 == 3903) {
                            var5--;
                            int var211 = field723[var5];
                            field723[var5++] = client.field554[var211].method49();
                            continue;
                        }
                        if (var465 == 3904) {
                            var5--;
                            int var212 = field723[var5];
                            field723[var5++] = client.field554[var212].field41;
                            continue;
                        }
                        if (var465 == 3905) {
                            var5--;
                            int var213 = field723[var5];
                            field723[var5++] = client.field554[var213].field42;
                            continue;
                        }
                        if (var465 == 3906) {
                            var5--;
                            int var214 = field723[var5];
                            field723[var5++] = client.field554[var214].field43;
                            continue;
                        }
                        if (var465 == 3907) {
                            var5--;
                            int var215 = field723[var5];
                            field723[var5++] = client.field554[var215].field46;
                            continue;
                        }
                        if (var465 == 3908) {
                            var5--;
                            int var216 = field723[var5];
                            field723[var5++] = client.field554[var216].field40;
                            continue;
                        }
                        if (var465 == 3910) {
                            var5--;
                            int var217 = field723[var5];
                            int var218 = client.field554[var217].method46();
                            field723[var5++] = var218 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var465 == 3911) {
                            var5--;
                            int var219 = field723[var5];
                            int var220 = client.field554[var219].method46();
                            field723[var5++] = var220 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var465 == 3912) {
                            var5--;
                            int var221 = field723[var5];
                            int var222 = client.field554[var221].method46();
                            field723[var5++] = var222 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var465 == 3913) {
                            var5--;
                            int var223 = field723[var5];
                            int var224 = client.field554[var223].method46();
                            field723[var5++] = var224 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var465 == 3914) {
                            var5--;
                            boolean var225 = field723[var5] == 1;
                            if (Statics.field2185 != null) {
                                Statics.field2185.method17(class2.field10, var225);
                            }
                            continue;
                        }
                        if (var465 == 3915) {
                            var5--;
                            boolean var226 = field723[var5] == 1;
                            if (Statics.field2185 != null) {
                                Statics.field2185.method17(class2.field9, var226);
                            }
                            continue;
                        }
                        if (var465 == 3916) {
                            var5 -= 2;
                            boolean var227 = field723[var5] == 1;
                            boolean var228 = field723[var5 + 1] == 1;
                            if (Statics.field2185 != null) {
                                Statics.field2185.method17(new class45(var228), var227);
                            }
                            continue;
                        }
                        if (var465 == 3917) {
                            var5--;
                            boolean var229 = field723[var5] == 1;
                            if (Statics.field2185 != null) {
                                Statics.field2185.method17(class2.field14, var229);
                            }
                            continue;
                        }
                        if (var465 == 3918) {
                            var5--;
                            boolean var230 = field723[var5] == 1;
                            if (Statics.field2185 != null) {
                                Statics.field2185.method17(class2.field11, var230);
                            }
                            continue;
                        }
                        if (var465 == 3919) {
                            field723[var5++] = Statics.field2185 == null ? 0 : Statics.field2185.field12.size();
                            continue;
                        }
                        if (var465 == 3920) {
                            var5--;
                            int var231 = field723[var5];
                            class3 var232 = (class3) Statics.field2185.field12.get(var231);
                            field723[var5++] = var232.field25;
                            continue;
                        }
                        if (var465 == 3921) {
                            var5--;
                            int var233 = field723[var5];
                            class3 var234 = (class3) Statics.field2185.field12.get(var233);
                            field724[var6++] = var234.method30();
                            continue;
                        }
                        if (var465 == 3922) {
                            var5--;
                            int var235 = field723[var5];
                            class3 var236 = (class3) Statics.field2185.field12.get(var235);
                            field724[var6++] = var236.method32();
                            continue;
                        }
                        if (var465 == 3923) {
                            var5--;
                            int var237 = field723[var5];
                            class3 var238 = (class3) Statics.field2185.field12.get(var237);
                            long var239 = class156.method1597() - Statics.field159 - var238.field18;
                            int var241 = (int) (var239 / 3600000L);
                            int var242 = (int) ((var239 - (long) (var241 * 3600000)) / 60000L);
                            int var243 = (int) ((var239 - (long) (var241 * 3600000) - (long) (var242 * 60000)) / 1000L);
                            String var244 = var241 + ":" + var242 / 10 + var242 % 10 + ":" + var243 / 10 + var243 % 10;
                            field724[var6++] = var244;
                            continue;
                        }
                        if (var465 == 3924) {
                            var5--;
                            int var245 = field723[var5];
                            class3 var246 = (class3) Statics.field2185.field12.get(var245);
                            field723[var5++] = var246.field19.field43;
                            continue;
                        }
                        if (var465 == 3925) {
                            var5--;
                            int var247 = field723[var5];
                            class3 var248 = (class3) Statics.field2185.field12.get(var247);
                            field723[var5++] = var248.field19.field42;
                            continue;
                        }
                        if (var465 == 3926) {
                            var5--;
                            int var249 = field723[var5];
                            class3 var250 = (class3) Statics.field2185.field12.get(var249);
                            field723[var5++] = var250.field19.field41;
                            continue;
                        }
                    } else if (var465 < 4100) {
                        if (var465 == 4000) {
                            var5 -= 2;
                            int var251 = field723[var5];
                            int var252 = field723[var5 + 1];
                            field723[var5++] = var251 + var252;
                            continue;
                        }
                        if (var465 == 4001) {
                            var5 -= 2;
                            int var253 = field723[var5];
                            int var254 = field723[var5 + 1];
                            field723[var5++] = var253 - var254;
                            continue;
                        }
                        if (var465 == 4002) {
                            var5 -= 2;
                            int var255 = field723[var5];
                            int var256 = field723[var5 + 1];
                            field723[var5++] = var255 * var256;
                            continue;
                        }
                        if (var465 == 4003) {
                            var5 -= 2;
                            int var257 = field723[var5];
                            int var258 = field723[var5 + 1];
                            field723[var5++] = var257 / var258;
                            continue;
                        }
                        if (var465 == 4004) {
                            var5--;
                            int var259 = field723[var5];
                            field723[var5++] = (int) (Math.random() * (double) var259);
                            continue;
                        }
                        if (var465 == 4005) {
                            var5--;
                            int var260 = field723[var5];
                            field723[var5++] = (int) (Math.random() * (double) (var260 + 1));
                            continue;
                        }
                        if (var465 == 4006) {
                            var5 -= 5;
                            int var261 = field723[var5];
                            int var262 = field723[var5 + 1];
                            int var263 = field723[var5 + 2];
                            int var264 = field723[var5 + 3];
                            int var265 = field723[var5 + 4];
                            field723[var5++] = (var262 - var261) * (var265 - var263) / (var264 - var263) + var261;
                            continue;
                        }
                        if (var465 == 4007) {
                            var5 -= 2;
                            int var266 = field723[var5];
                            int var267 = field723[var5 + 1];
                            field723[var5++] = var266 * var267 / 100 + var266;
                            continue;
                        }
                        if (var465 == 4008) {
                            var5 -= 2;
                            int var268 = field723[var5];
                            int var269 = field723[var5 + 1];
                            field723[var5++] = var268 | 0x1 << var269;
                            continue;
                        }
                        if (var465 == 4009) {
                            var5 -= 2;
                            int var270 = field723[var5];
                            int var271 = field723[var5 + 1];
                            field723[var5++] = var270 & -1 - (0x1 << var271);
                            continue;
                        }
                        if (var465 == 4010) {
                            var5 -= 2;
                            int var272 = field723[var5];
                            int var273 = field723[var5 + 1];
                            field723[var5++] = (var272 & 0x1 << var273) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var465 == 4011) {
                            var5 -= 2;
                            int var274 = field723[var5];
                            int var275 = field723[var5 + 1];
                            field723[var5++] = var274 % var275;
                            continue;
                        }
                        if (var465 == 4012) {
                            var5 -= 2;
                            int var276 = field723[var5];
                            int var277 = field723[var5 + 1];
                            if (var276 == 0) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = (int) Math.pow((double) var276, (double) var277);
                            }
                            continue;
                        }
                        if (var465 == 4013) {
                            var5 -= 2;
                            int var278 = field723[var5];
                            int var279 = field723[var5 + 1];
                            if (var278 == 0) {
                                field723[var5++] = 0;
                            } else if (var279 == 0) {
                                field723[var5++] = Integer.MAX_VALUE;
                            } else {
                                field723[var5++] = (int) Math.pow((double) var278, 1.0D / (double) var279);
                            }
                            continue;
                        }
                        if (var465 == 4014) {
                            var5 -= 2;
                            int var280 = field723[var5];
                            int var281 = field723[var5 + 1];
                            field723[var5++] = var280 & var281;
                            continue;
                        }
                        if (var465 == 4015) {
                            var5 -= 2;
                            int var282 = field723[var5];
                            int var283 = field723[var5 + 1];
                            field723[var5++] = var282 | var283;
                            continue;
                        }
                        if (var465 == 4018) {
                            var5 -= 3;
                            long var284 = (long) field723[var5];
                            long var286 = (long) field723[var5 + 1];
                            long var288 = (long) field723[var5 + 2];
                            field723[var5++] = (int) (var284 * var288 / var286);
                            continue;
                        }
                    } else if (var465 < 4200) {
                        if (var465 == 4100) {
                            var6--;
                            String var290 = field724[var6];
                            var5--;
                            int var291 = field723[var5];
                            field724[var6++] = var290 + var291;
                            continue;
                        }
                        if (var465 == 4101) {
                            var6 -= 2;
                            String var292 = field724[var6];
                            String var293 = field724[var6 + 1];
                            field724[var6++] = var292 + var293;
                            continue;
                        }
                        if (var465 == 4102) {
                            var6--;
                            String var294 = field724[var6];
                            var5--;
                            int var295 = field723[var5];
                            String[] var296 = field724;
                            int var297 = var6++;
                            String var299;
                            if (var295 < 0) {
                                var299 = Integer.toString(var295);
                            } else {
                                var299 = class208.method2560(var295, 10, true);
                            }
                            var296[var297] = var294 + var299;
                            continue;
                        }
                        if (var465 == 4103) {
                            var6--;
                            String var300 = field724[var6];
                            field724[var6++] = var300.toLowerCase();
                            continue;
                        }
                        if (var465 == 4104) {
                            var5--;
                            int var301 = field723[var5];
                            long var302 = ((long) var301 + 11745L) * 86400000L;
                            field728.setTime(new Date(var302));
                            int var304 = field728.get(5);
                            int var305 = field728.get(2);
                            int var306 = field728.get(1);
                            field724[var6++] = var304 + "-" + field729[var305] + "-" + var306;
                            continue;
                        }
                        if (var465 == 4105) {
                            var6 -= 2;
                            String var307 = field724[var6];
                            String var308 = field724[var6 + 1];
                            if (Statics.field169.field240 != null && Statics.field169.field240.field2168) {
                                field724[var6++] = var308;
                                continue;
                            }
                            field724[var6++] = var307;
                            continue;
                        }
                        if (var465 == 4106) {
                            var5--;
                            int var309 = field723[var5];
                            field724[var6++] = Integer.toString(var309);
                            continue;
                        }
                        if (var465 == 4107) {
                            var6 -= 2;
                            int[] var310 = field723;
                            int var311 = var5++;
                            String var312 = field724[var6];
                            String var313 = field724[var6 + 1];
                            int var314 = client.field354;
                            int var315 = var312.length();
                            int var316 = var313.length();
                            int var317 = 0;
                            int var318 = 0;
                            char var319 = 0;
                            char var320 = 0;
                            int var321;
                            label2782: while (true) {
                                if (var317 - var319 >= var315 && var318 - var320 >= var316) {
                                    int var330 = Math.min(var315, var316);
                                    for (int var331 = 0; var331 < var330; var331++) {
                                        char var334 = var312.charAt(var331);
                                        char var335 = var313.charAt(var331);
                                        if (var334 != var335 && Character.toUpperCase(var334) != Character.toUpperCase(var335)) {
                                            char var336 = Character.toLowerCase(var334);
                                            char var337 = Character.toLowerCase(var335);
                                            if (var336 != var337) {
                                                var321 = class203.method3709(var336, var314) - class203.method3709(var337, var314);
                                                break label2782;
                                            }
                                        }
                                    }
                                    int var338 = var315 - var316;
                                    if (var338 == 0) {
                                        for (int var339 = 0; var339 < var330; var339++) {
                                            char var340 = var312.charAt(var339);
                                            char var341 = var313.charAt(var339);
                                            if (var340 != var341) {
                                                var321 = class203.method3709(var340, var314) - class203.method3709(var341, var314);
                                                break label2782;
                                            }
                                        }
                                        var321 = 0;
                                    } else {
                                        var321 = var338;
                                    }
                                    break;
                                }
                                if (var317 - var319 >= var315) {
                                    var321 = -1;
                                    break;
                                }
                                if (var318 - var320 >= var316) {
                                    var321 = 1;
                                    break;
                                }
                                char var322;
                                if (var319 == 0) {
                                    var322 = var312.charAt(var317++);
                                } else {
                                    var322 = var319;
                                    boolean var323 = false;
                                }
                                char var324;
                                if (var320 == 0) {
                                    var324 = var313.charAt(var318++);
                                } else {
                                    var324 = var320;
                                    boolean var325 = false;
                                }
                                var319 = class203.method190(var322);
                                var320 = class203.method190(var324);
                                char var326 = class203.method695(var322, var314);
                                char var327 = class203.method695(var324, var314);
                                if (var326 != var327 && Character.toUpperCase(var326) != Character.toUpperCase(var327)) {
                                    char var328 = Character.toLowerCase(var326);
                                    char var329 = Character.toLowerCase(var327);
                                    if (var328 != var329) {
                                        var321 = class203.method3709(var328, var314) - class203.method3709(var329, var314);
                                        break;
                                    }
                                }
                            }
                            var310[var311] = class208.method44(var321);
                            continue;
                        }
                        if (var465 == 4108) {
                            var6--;
                            String var342 = field724[var6];
                            var5 -= 2;
                            int var343 = field723[var5];
                            int var344 = field723[var5 + 1];
                            byte[] var345 = Statics.field1650.method3044(var344, 0);
                            class209 var346 = new class209(var345);
                            field723[var5++] = var346.method3626(var342, var343);
                            continue;
                        }
                        if (var465 == 4109) {
                            var6--;
                            String var347 = field724[var6];
                            var5 -= 2;
                            int var348 = field723[var5];
                            int var349 = field723[var5 + 1];
                            byte[] var350 = Statics.field1650.method3044(var349, 0);
                            class209 var351 = new class209(var350);
                            field723[var5++] = var351.method3625(var347, var348);
                            continue;
                        }
                        if (var465 == 4110) {
                            var6 -= 2;
                            String var352 = field724[var6];
                            String var353 = field724[var6 + 1];
                            var5--;
                            if (field723[var5] == 1) {
                                field724[var6++] = var352;
                            } else {
                                field724[var6++] = var353;
                            }
                            continue;
                        }
                        if (var465 == 4111) {
                            var6--;
                            String var354 = field724[var6];
                            field724[var6++] = class210.method3665(var354);
                            continue;
                        }
                        if (var465 == 4112) {
                            var6--;
                            String var355 = field724[var6];
                            var5--;
                            int var356 = field723[var5];
                            field724[var6++] = var355 + (char) var356;
                            continue;
                        }
                        if (var465 == 4113) {
                            var5--;
                            int var357 = field723[var5];
                            int[] var358 = field723;
                            int var359 = var5++;
                            char var360 = (char) var357;
                            boolean var361;
                            if (var360 >= ' ' && var360 <= '~') {
                                var361 = true;
                            } else if (var360 >= 160 && var360 <= 255) {
                                var361 = true;
                            } else if (var360 == 8364 || var360 == 338 || var360 == 8212 || var360 == 339 || var360 == 376) {
                                var361 = true;
                            } else {
                                var361 = false;
                            }
                            var358[var359] = var361 ? 1 : 0;
                            continue;
                        }
                        if (var465 == 4114) {
                            var5--;
                            int var362 = field723[var5];
                            field723[var5++] = class208.method224((char) var362) ? 1 : 0;
                            continue;
                        }
                        if (var465 == 4115) {
                            var5--;
                            int var363 = field723[var5];
                            int[] var364 = field723;
                            int var365 = var5++;
                            char var366 = (char) var363;
                            boolean var367 = var366 >= 'A' && var366 <= 'Z' || var366 >= 'a' && var366 <= 'z';
                            var364[var365] = var367 ? 1 : 0;
                            continue;
                        }
                        if (var465 == 4116) {
                            var5--;
                            int var368 = field723[var5];
                            field723[var5++] = class208.method1453((char) var368) ? 1 : 0;
                            continue;
                        }
                        if (var465 == 4117) {
                            var6--;
                            String var369 = field724[var6];
                            if (var369 == null) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = var369.length();
                            }
                            continue;
                        }
                        if (var465 == 4118) {
                            var6--;
                            String var370 = field724[var6];
                            var5 -= 2;
                            int var371 = field723[var5];
                            int var372 = field723[var5 + 1];
                            field724[var6++] = var370.substring(var371, var372);
                            continue;
                        }
                        if (var465 == 4119) {
                            var6--;
                            String var373 = field724[var6];
                            StringBuilder var374 = new StringBuilder(var373.length());
                            boolean var375 = false;
                            for (int var376 = 0; var376 < var373.length(); var376++) {
                                char var377 = var373.charAt(var376);
                                if (var377 == '<') {
                                    var375 = true;
                                } else if (var377 == '>') {
                                    var375 = false;
                                } else if (!var375) {
                                    var374.append(var377);
                                }
                            }
                            field724[var6++] = var374.toString();
                            continue;
                        }
                        if (var465 == 4120) {
                            var6--;
                            String var378 = field724[var6];
                            var5--;
                            int var379 = field723[var5];
                            field723[var5++] = var378.indexOf(var379);
                            continue;
                        }
                        if (var465 == 4121) {
                            var6 -= 2;
                            String var380 = field724[var6];
                            String var381 = field724[var6 + 1];
                            var5--;
                            int var382 = field723[var5];
                            field723[var5++] = var380.indexOf(var381, var382);
                            continue;
                        }
                    } else if (var465 < 4300) {
                        if (var465 == 4200) {
                            var5--;
                            int var383 = field723[var5];
                            field724[var6++] = class199.method713(var383).field2958;
                            continue;
                        }
                        if (var465 == 4201) {
                            var5 -= 2;
                            int var384 = field723[var5];
                            int var385 = field723[var5 + 1];
                            class199 var386 = class199.method713(var384);
                            if (var385 >= 1 && var385 <= 5 && var386.field2964[var385 - 1] != null) {
                                field724[var6++] = var386.field2964[var385 - 1];
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var465 == 4202) {
                            var5 -= 2;
                            int var387 = field723[var5];
                            int var388 = field723[var5 + 1];
                            class199 var389 = class199.method713(var387);
                            if (var388 >= 1 && var388 <= 5 && var389.field2965[var388 - 1] != null) {
                                field724[var6++] = var389.field2965[var388 - 1];
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var465 == 4203) {
                            var5--;
                            int var390 = field723[var5];
                            field723[var5++] = class199.method713(var390).field2959;
                            continue;
                        }
                        if (var465 == 4204) {
                            var5--;
                            int var391 = field723[var5];
                            field723[var5++] = class199.method713(var391).field2961 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var465 == 4205) {
                            var5--;
                            int var392 = field723[var5];
                            class199 var393 = class199.method713(var392);
                            if (var393.field2981 == -1 && var393.field2968 >= 0) {
                                field723[var5++] = var393.field2968;
                                continue;
                            }
                            field723[var5++] = var392;
                            continue;
                        }
                        if (var465 == 4206) {
                            var5--;
                            int var394 = field723[var5];
                            class199 var395 = class199.method713(var394);
                            if (var395.field2981 >= 0 && var395.field2968 >= 0) {
                                field723[var5++] = var395.field2968;
                                continue;
                            }
                            field723[var5++] = var394;
                            continue;
                        }
                        if (var465 == 4207) {
                            var5--;
                            int var396 = field723[var5];
                            field723[var5++] = class199.method713(var396).field2976 ? 1 : 0;
                            continue;
                        }
                        if (var465 == 4208) {
                            var5--;
                            int var397 = field723[var5];
                            class199 var398 = class199.method713(var397);
                            if (var398.field2992 == -1 && var398.field2991 >= 0) {
                                field723[var5++] = var398.field2991;
                                continue;
                            }
                            field723[var5++] = var397;
                            continue;
                        }
                        if (var465 == 4209) {
                            var5--;
                            int var399 = field723[var5];
                            class199 var400 = class199.method713(var399);
                            if (var400.field2992 >= 0 && var400.field2991 >= 0) {
                                field723[var5++] = var400.field2991;
                                continue;
                            }
                            field723[var5++] = var399;
                            continue;
                        }
                        if (var465 == 4210) {
                            var6--;
                            String var401 = field724[var6];
                            var5--;
                            int var402 = field723[var5];
                            client.method2404(var401, var402 == 1);
                            field723[var5++] = Statics.field1855;
                            continue;
                        }
                        if (var465 == 4211) {
                            if (Statics.field1816 != null && Statics.field946 < Statics.field1855) {
                                field723[var5++] = Statics.field1816[++Statics.field946 - 1] & 0xFFFF;
                                continue;
                            }
                            field723[var5++] = -1;
                            continue;
                        }
                        if (var465 == 4212) {
                            Statics.field946 = 0;
                            continue;
                        }
                    } else if (var465 < 5100) {
                        if (var465 == 5000) {
                            field723[var5++] = client.field496;
                            continue;
                        }
                        if (var465 == 5001) {
                            var5 -= 3;
                            client.field496 = field723[var5];
                            Statics.field663 = class217.method3538(field723[var5 + 1]);
                            if (Statics.field663 == null) {
                                Statics.field663 = class217.field3165;
                            }
                            client.field515 = field723[var5 + 2];
                            client.field395.method2804(126);
                            client.field395.method2578(client.field496);
                            client.field395.method2578(Statics.field663.field3167);
                            client.field395.method2578(client.field515);
                            continue;
                        }
                        if (var465 == 5002) {
                            var6--;
                            String var403 = field724[var6];
                            var5 -= 2;
                            int var404 = field723[var5];
                            int var405 = field723[var5 + 1];
                            client.field395.method2804(1);
                            client.field395.method2578(class154.method724(var403) + 2);
                            client.field395.method2584(var403);
                            client.field395.method2578(var404 - 1);
                            client.field395.method2578(var405);
                            continue;
                        }
                        if (var465 == 5003) {
                            var5 -= 2;
                            int var406 = field723[var5];
                            int var407 = field723[var5 + 1];
                            class22 var408 = class48.method1948(var406, var407);
                            if (var408 == null) {
                                field723[var5++] = -1;
                                field723[var5++] = 0;
                                field724[var6++] = "";
                                field724[var6++] = "";
                                field724[var6++] = "";
                            } else {
                                field723[var5++] = var408.field229;
                                field723[var5++] = var408.field218;
                                field724[var6++] = var408.field220 == null ? "" : var408.field220;
                                field724[var6++] = var408.field217 == null ? "" : var408.field217;
                                field724[var6++] = var408.field222 == null ? "" : var408.field222;
                            }
                            continue;
                        }
                        if (var465 == 5004) {
                            var5--;
                            int var409 = field723[var5];
                            class22 var410 = (class22) class48.field929.method2143((long) var409);
                            if (var410 == null) {
                                field723[var5++] = -1;
                                field723[var5++] = 0;
                                field724[var6++] = "";
                                field724[var6++] = "";
                                field724[var6++] = "";
                            } else {
                                field723[var5++] = var410.field223;
                                field723[var5++] = var410.field218;
                                field724[var6++] = var410.field220 == null ? "" : var410.field220;
                                field724[var6++] = var410.field217 == null ? "" : var410.field217;
                                field724[var6++] = var410.field222 == null ? "" : var410.field222;
                            }
                            continue;
                        }
                        if (var465 == 5005) {
                            if (Statics.field663 == null) {
                                field723[var5++] = -1;
                            } else {
                                field723[var5++] = Statics.field663.field3167;
                            }
                            continue;
                        }
                        if (var465 == 5008) {
                            var6--;
                            String var412 = field724[var6];
                            var5--;
                            int var413 = field723[var5];
                            String var414 = var412.toLowerCase();
                            byte var415 = 0;
                            if (var414.startsWith(class174.field2526)) {
                                var415 = 0;
                                var412 = var412.substring(class174.field2526.length());
                            } else if (var414.startsWith(class174.field2435)) {
                                var415 = 1;
                                var412 = var412.substring(class174.field2435.length());
                            } else if (var414.startsWith(class174.field2387)) {
                                var415 = 2;
                                var412 = var412.substring(class174.field2387.length());
                            } else if (var414.startsWith(class174.field2532)) {
                                var415 = 3;
                                var412 = var412.substring(class174.field2532.length());
                            } else if (var414.startsWith(class174.field2408)) {
                                var415 = 4;
                                var412 = var412.substring(class174.field2408.length());
                            } else if (var414.startsWith(class174.field2557)) {
                                var415 = 5;
                                var412 = var412.substring(class174.field2557.length());
                            } else if (var414.startsWith(class174.field2538)) {
                                var415 = 6;
                                var412 = var412.substring(class174.field2538.length());
                            } else if (var414.startsWith(class174.field2540)) {
                                var415 = 7;
                                var412 = var412.substring(class174.field2540.length());
                            } else if (var414.startsWith(class174.field2542)) {
                                var415 = 8;
                                var412 = var412.substring(class174.field2542.length());
                            } else if (var414.startsWith(class174.field2544)) {
                                var415 = 9;
                                var412 = var412.substring(class174.field2544.length());
                            } else if (var414.startsWith(class174.field2546)) {
                                var415 = 10;
                                var412 = var412.substring(class174.field2546.length());
                            } else if (var414.startsWith(class174.field2465)) {
                                var415 = 11;
                                var412 = var412.substring(class174.field2465.length());
                            } else if (client.field354 != 0) {
                                if (var414.startsWith(class174.field2527)) {
                                    var415 = 0;
                                    var412 = var412.substring(class174.field2527.length());
                                } else if (var414.startsWith(class174.field2386)) {
                                    var415 = 1;
                                    var412 = var412.substring(class174.field2386.length());
                                } else if (var414.startsWith(class174.field2531)) {
                                    var415 = 2;
                                    var412 = var412.substring(class174.field2531.length());
                                } else if (var414.startsWith(class174.field2533)) {
                                    var415 = 3;
                                    var412 = var412.substring(class174.field2533.length());
                                } else if (var414.startsWith(class174.field2535)) {
                                    var415 = 4;
                                    var412 = var412.substring(class174.field2535.length());
                                } else if (var414.startsWith(class174.field2578)) {
                                    var415 = 5;
                                    var412 = var412.substring(class174.field2578.length());
                                } else if (var414.startsWith(class174.field2539)) {
                                    var415 = 6;
                                    var412 = var412.substring(class174.field2539.length());
                                } else if (var414.startsWith(class174.field2541)) {
                                    var415 = 7;
                                    var412 = var412.substring(class174.field2541.length());
                                } else if (var414.startsWith(class174.field2384)) {
                                    var415 = 8;
                                    var412 = var412.substring(class174.field2384.length());
                                } else if (var414.startsWith(class174.field2545)) {
                                    var415 = 9;
                                    var412 = var412.substring(class174.field2545.length());
                                } else if (var414.startsWith(class174.field2547)) {
                                    var415 = 10;
                                    var412 = var412.substring(class174.field2547.length());
                                } else if (var414.startsWith(class174.field2549)) {
                                    var415 = 11;
                                    var412 = var412.substring(class174.field2549.length());
                                }
                            }
                            String var416 = var412.toLowerCase();
                            byte var417 = 0;
                            if (var416.startsWith(class174.field2550)) {
                                var417 = 1;
                                var412 = var412.substring(class174.field2550.length());
                            } else if (var416.startsWith(class174.field2511)) {
                                var417 = 2;
                                var412 = var412.substring(class174.field2511.length());
                            } else if (var416.startsWith(class174.field2554)) {
                                var417 = 3;
                                var412 = var412.substring(class174.field2554.length());
                            } else if (var416.startsWith(class174.field2585)) {
                                var417 = 4;
                                var412 = var412.substring(class174.field2585.length());
                            } else if (var416.startsWith(class174.field2558)) {
                                var417 = 5;
                                var412 = var412.substring(class174.field2558.length());
                            } else if (client.field354 != 0) {
                                if (var416.startsWith(class174.field2392)) {
                                    var417 = 1;
                                    var412 = var412.substring(class174.field2392.length());
                                } else if (var416.startsWith(class174.field2553)) {
                                    var417 = 2;
                                    var412 = var412.substring(class174.field2553.length());
                                } else if (var416.startsWith(class174.field2555)) {
                                    var417 = 3;
                                    var412 = var412.substring(class174.field2555.length());
                                } else if (var416.startsWith(class174.field2429)) {
                                    var417 = 4;
                                    var412 = var412.substring(class174.field2429.length());
                                } else if (var416.startsWith(class174.field2559)) {
                                    var417 = 5;
                                    var412 = var412.substring(class174.field2559.length());
                                }
                            }
                            client.field395.method2804(122);
                            client.field395.method2578(0);
                            int var418 = client.field395.field2098;
                            client.field395.method2578(var413);
                            client.field395.method2578(var415);
                            client.field395.method2578(var417);
                            class160 var419 = client.field395;
                            int var420 = var419.field2098;
                            byte[] var421 = class204.method673(var412);
                            var419.method2706(var421.length);
                            var419.field2098 += Statics.field3118.method2520(var421, 0, var421.length, var419.field2092, var419.field2098);
                            client.field395.method2590(client.field395.field2098 - var418);
                            continue;
                        }
                        if (var465 == 5009) {
                            var6 -= 2;
                            String var422 = field724[var6];
                            String var423 = field724[var6 + 1];
                            client.field395.method2804(50);
                            client.field395.method2616(0);
                            int var424 = client.field395.field2098;
                            client.field395.method2584(var422);
                            class160 var425 = client.field395;
                            int var426 = var425.field2098;
                            byte[] var427 = class204.method673(var423);
                            var425.method2706(var427.length);
                            var425.field2098 += Statics.field3118.method2520(var427, 0, var427.length, var425.field2092, var425.field2098);
                            client.field395.method2589(client.field395.field2098 - var424);
                            continue;
                        }
                        if (var465 == 5015) {
                            String var428;
                            if (Statics.field169 == null || Statics.field169.field264 == null) {
                                var428 = "";
                            } else {
                                var428 = Statics.field169.field264;
                            }
                            field724[var6++] = var428;
                            continue;
                        }
                        if (var465 == 5016) {
                            field723[var5++] = client.field515;
                            continue;
                        }
                        if (var465 == 5017) {
                            var5--;
                            int var429 = field723[var5];
                            field723[var5++] = class48.method5(var429);
                            continue;
                        }
                        if (var465 == 5018) {
                            var5--;
                            int var430 = field723[var5];
                            int[] var431 = field723;
                            int var432 = var5++;
                            class22 var433 = (class22) class48.field929.method2143((long) var430);
                            int var434;
                            if (var433 == null) {
                                var434 = -1;
                            } else if (class48.field930.field1903 == var433.field1888) {
                                var434 = -1;
                            } else {
                                var434 = ((class22) var433.field1888).field229;
                            }
                            var431[var432] = var434;
                            continue;
                        }
                        if (var465 == 5019) {
                            var5--;
                            int var435 = field723[var5];
                            int[] var436 = field723;
                            int var437 = var5++;
                            class22 var438 = (class22) class48.field929.method2143((long) var435);
                            int var439;
                            if (var438 == null) {
                                var439 = -1;
                            } else if (class48.field930.field1903 == var438.field1889) {
                                var439 = -1;
                            } else {
                                var439 = ((class22) var438.field1889).field229;
                            }
                            var436[var437] = var439;
                            continue;
                        }
                        if (var465 == 5020) {
                            var6--;
                            String var440 = field724[var6];
                            if (var440.equalsIgnoreCase("toggleroof")) {
                                Statics.field1734.field686 = !Statics.field1734.field686;
                                class31.method1596();
                                if (Statics.field1734.field686) {
                                    class48.method1829(99, "", "Roofs are now all hidden");
                                } else {
                                    class48.method1829(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var440.equalsIgnoreCase("displayfps")) {
                                client.field478 = !client.field478;
                            }
                            if (client.field328 >= 2) {
                                if (var440.equalsIgnoreCase("fpson")) {
                                    client.field478 = true;
                                }
                                if (var440.equalsIgnoreCase("fpsoff")) {
                                    client.field478 = false;
                                }
                                if (var440.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var440.equalsIgnoreCase("clientdrop")) {
                                    if (client.field332 > 0) {
                                        client.method1797();
                                    } else {
                                        client.method3704(40);
                                        Statics.field497 = Statics.field153;
                                        Statics.field153 = null;
                                    }
                                }
                                if (var440.equalsIgnoreCase("errortest") && client.field425 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field395.method2804(191);
                            client.field395.method2578(var440.length() + 1);
                            client.field395.method2584(var440);
                            continue;
                        }
                        if (var465 == 5021) {
                            var6--;
                            client.field298 = field724[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var465 == 5022) {
                            field724[var6++] = client.field298;
                            continue;
                        }
                    }
                }
                if (var465 < 5400) {
                    if (var465 == 5306) {
                        int[] var441 = field723;
                        int var442 = var5++;
                        int var443 = client.field301 ? 2 : 1;
                        var441[var442] = var443;
                        continue;
                    }
                    if (var465 == 5307) {
                        var5--;
                        int var444 = field723[var5];
                        if (var444 != 1 && var444 != 2) {
                            continue;
                        }
                        client.field491 = 0L;
                        if (var444 >= 2) {
                            client.field301 = true;
                        } else {
                            client.field301 = false;
                        }
                        client.method3172();
                        if (client.field287 >= 25) {
                            client.method2926();
                        }
                        class114.field1782 = true;
                        continue;
                    }
                    if (var465 == 5308) {
                        field723[var5++] = Statics.field1734.field688;
                        continue;
                    }
                    if (var465 == 5309) {
                        var5--;
                        int var445 = field723[var5];
                        if (var445 == 1 || var445 == 2) {
                            Statics.field1734.field688 = var445;
                            class31.method1596();
                        }
                        continue;
                    }
                }
                if (var465 < 5600) {
                    if (var465 == 5504) {
                        var5 -= 2;
                        int var446 = field723[var5];
                        int var447 = field723[var5 + 1];
                        if (!client.field526) {
                            client.field384 = var446;
                            client.field364 = var447;
                        }
                        continue;
                    }
                    if (var465 == 5505) {
                        field723[var5++] = client.field384;
                        continue;
                    }
                    if (var465 == 5506) {
                        field723[var5++] = client.field364;
                        continue;
                    }
                    if (var465 == 5530) {
                        var5--;
                        int var448 = field723[var5];
                        if (var448 < 0) {
                            var448 = 0;
                        }
                        client.field299 = var448;
                        continue;
                    }
                    if (var465 == 5531) {
                        field723[var5++] = client.field299;
                        continue;
                    }
                }
                if (var465 >= 5700 || var465 != 5630) {
                    if (var465 < 6300) {
                        if (var465 == 6200) {
                            var5 -= 2;
                            client.field356 = (short) field723[var5];
                            if (client.field356 <= 0) {
                                client.field356 = 256;
                            }
                            client.field533 = (short) field723[var5 + 1];
                            if (client.field533 <= 0) {
                                client.field533 = 205;
                            }
                            continue;
                        }
                        if (var465 == 6201) {
                            var5 -= 2;
                            client.field534 = (short) field723[var5];
                            if (client.field534 <= 0) {
                                client.field534 = 256;
                            }
                            client.field535 = (short) field723[var5 + 1];
                            if (client.field535 <= 0) {
                                client.field535 = 320;
                            }
                            continue;
                        }
                        if (var465 == 6202) {
                            var5 -= 4;
                            client.field536 = (short) field723[var5];
                            if (client.field536 <= 0) {
                                client.field536 = 1;
                            }
                            client.field451 = (short) field723[var5 + 1];
                            if (client.field451 <= 0) {
                                client.field451 = 32767;
                            } else if (client.field451 < client.field536) {
                                client.field451 = client.field536;
                            }
                            client.field346 = (short) field723[var5 + 2];
                            if (client.field346 <= 0) {
                                client.field346 = 1;
                            }
                            client.field539 = (short) field723[var5 + 3];
                            if (client.field539 <= 0) {
                                client.field539 = 32767;
                            } else if (client.field539 < client.field346) {
                                client.field539 = client.field346;
                            }
                            continue;
                        }
                        if (var465 == 6203) {
                            if (client.field450 == null) {
                                field723[var5++] = -1;
                                field723[var5++] = -1;
                            } else {
                                client.method722(0, 0, client.field450.field2219, client.field450.field2213, false);
                                field723[var5++] = client.field387;
                                field723[var5++] = client.field543;
                            }
                            continue;
                        }
                        if (var465 == 6204) {
                            field723[var5++] = client.field534;
                            field723[var5++] = client.field535;
                            continue;
                        }
                        if (var465 == 6205) {
                            field723[var5++] = client.field356;
                            field723[var5++] = client.field533;
                            continue;
                        }
                    }
                    if (var465 < 6600) {
                        if (var465 == 6500) {
                            field723[var5++] = class30.method193() ? 1 : 0;
                            continue;
                        }
                        if (var465 == 6501) {
                            class30 var449 = class30.method2326();
                            if (var449 == null) {
                                field723[var5++] = -1;
                                field723[var5++] = 0;
                                field724[var6++] = "";
                                field723[var5++] = 0;
                                field723[var5++] = 0;
                                field724[var6++] = "";
                            } else {
                                field723[var5++] = var449.field665;
                                field723[var5++] = var449.field675;
                                field724[var6++] = var449.field668;
                                field723[var5++] = var449.field678;
                                field723[var5++] = var449.field680;
                                field724[var6++] = var449.field676;
                            }
                            continue;
                        }
                        if (var465 == 6502) {
                            class30 var450;
                            if (class30.field674 < class30.field669) {
                                var450 = Statics.field53[++class30.field674 - 1];
                            } else {
                                var450 = null;
                            }
                            if (var450 == null) {
                                field723[var5++] = -1;
                                field723[var5++] = 0;
                                field724[var6++] = "";
                                field723[var5++] = 0;
                                field723[var5++] = 0;
                                field724[var6++] = "";
                            } else {
                                field723[var5++] = var450.field665;
                                field723[var5++] = var450.field675;
                                field724[var6++] = var450.field668;
                                field723[var5++] = var450.field678;
                                field723[var5++] = var450.field680;
                                field724[var6++] = var450.field676;
                            }
                            continue;
                        }
                        if (var465 == 6506) {
                            var5--;
                            int var452 = field723[var5];
                            class30 var453 = null;
                            for (int var454 = 0; var454 < class30.field669; var454++) {
                                if (Statics.field53[var454].field665 == var452) {
                                    var453 = Statics.field53[var454];
                                    break;
                                }
                            }
                            if (var453 == null) {
                                field723[var5++] = -1;
                                field723[var5++] = 0;
                                field724[var6++] = "";
                                field723[var5++] = 0;
                                field723[var5++] = 0;
                                field724[var6++] = "";
                            } else {
                                field723[var5++] = var453.field665;
                                field723[var5++] = var453.field675;
                                field724[var6++] = var453.field668;
                                field723[var5++] = var453.field678;
                                field723[var5++] = var453.field680;
                                field724[var6++] = var453.field676;
                            }
                            continue;
                        }
                        if (var465 == 6507) {
                            var5 -= 4;
                            int var455 = field723[var5];
                            boolean var456 = field723[var5 + 1] == 1;
                            int var457 = field723[var5 + 2];
                            boolean var458 = field723[var5 + 3] == 1;
                            class30.method3005(var455, var456, var457, var458);
                            continue;
                        }
                        if (var465 == 6511) {
                            var5--;
                            int var459 = field723[var5];
                            if (var459 >= 0 && var459 < class30.field669) {
                                class30 var460 = Statics.field53[var459];
                                field723[var5++] = var460.field665;
                                field723[var5++] = var460.field675;
                                field724[var6++] = var460.field668;
                                field723[var5++] = var460.field678;
                                field723[var5++] = var460.field680;
                                field724[var6++] = var460.field676;
                                continue;
                            }
                            field723[var5++] = -1;
                            field723[var5++] = 0;
                            field724[var6++] = "";
                            field723[var5++] = 0;
                            field723[var5++] = 0;
                            field724[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field332 = 250;
            }
        } catch (Exception var464) {
            StringBuilder var462 = new StringBuilder(30);
            var462.append("").append(var4.field1885).append(" ");
            for (int var463 = field726 - 1; var463 >= 0; var463--) {
                var462.append("").append(field725[var463].field110.field1885).append(" ");
            }
            var462.append("").append(var10);
            class102.method1103(var462.toString(), var464);
        }
    }

    @ObfuscatedName("k.g(II)V")
    public static void method79(int arg0) {
        if (arg0 == -1 || !class170.method1843(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2203[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3.field2278 != null) {
                class19 var4 = new class19();
                var4.field181 = var3;
                var4.field189 = var3.field2278;
                method161(var4, 2000000);
            }
        }
    }
}
