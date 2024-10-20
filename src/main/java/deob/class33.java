package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ax")
public class class33 {

    @ObfuscatedName("ax.f")
    public static int[] field728 = new int[5];

    @ObfuscatedName("ax.c")
    public static int[][] field732 = new int[5][5000];

    @ObfuscatedName("ax.d")
    public static int[] field724 = new int[1000];

    @ObfuscatedName("ax.l")
    public static String[] field725 = new String[1000];

    @ObfuscatedName("ax.g")
    public static int field726 = 0;

    @ObfuscatedName("ax.z")
    public static class12[] field727 = new class12[50];

    @ObfuscatedName("ax.q")
    public static Calendar field731 = Calendar.getInstance();

    @ObfuscatedName("ax.e")
    public static final String[] field729 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ax.v")
    public static int field723 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.u(Lr;I)V")
    public static void method9(class19 arg0) {
        method857(arg0, 200000);
    }

    @ObfuscatedName("ae.x(Lr;II)V")
    public static void method857(class19 arg0, int arg1) {
        Object[] var2 = arg0.field204;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method848(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field929;
        int[] var9 = var4.field936;
        byte var10 = -1;
        field726 = 0;
        try {
            Statics.field720 = new int[var4.field935];
            int var11 = 0;
            Statics.field718 = new String[var4.field933];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field192;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field191;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field196 == null ? -1 : arg0.field196.field2186;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field193;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field196 == null ? -1 : arg0.field196.field2187;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field195 == null ? -1 : arg0.field195.field2186;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field195 == null ? -1 : arg0.field195.field2187;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field202;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field194;
                    }
                    Statics.field720[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field198;
                    }
                    Statics.field718[var12++] = var15;
                }
            }
            int var16 = 0;
            field723 = arg0.field199;
            label3028: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var478 = var8[var7];
                if (var478 < 100) {
                    if (var478 == 0) {
                        field724[var5++] = var9[var7];
                        continue;
                    }
                    if (var478 == 1) {
                        int var17 = var9[var7];
                        field724[var5++] = class166.field2147[var17];
                        continue;
                    }
                    if (var478 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class166.field2147[var18] = field724[var5];
                        client.method3325(var18);
                        continue;
                    }
                    if (var478 == 3) {
                        field725[var6++] = var4.field931[var7];
                        continue;
                    }
                    if (var478 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var478 == 7) {
                        var5 -= 2;
                        if (field724[var5 + 1] != field724[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var478 == 8) {
                        var5 -= 2;
                        if (field724[var5 + 1] == field724[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var478 == 9) {
                        var5 -= 2;
                        if (field724[var5] < field724[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var478 == 10) {
                        var5 -= 2;
                        if (field724[var5] > field724[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var478 == 21) {
                        if (field726 == 0) {
                            return;
                        }
                        class12 var19 = field727[--field726];
                        var4 = var19.field125;
                        var8 = var4.field929;
                        var9 = var4.field936;
                        var7 = var19.field117;
                        Statics.field720 = var19.field118;
                        Statics.field718 = var19.field119;
                        continue;
                    }
                    if (var478 == 25) {
                        int var20 = var9[var7];
                        field724[var5++] = class166.method1810(var20);
                        continue;
                    }
                    if (var478 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field724[var5];
                        class195 var23 = Statics.method1095(var21);
                        int var24 = var23.field2834;
                        int var25 = var23.field2832;
                        int var26 = var23.field2836;
                        int var27 = class166.field2150[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class166.field2147[var24] = class166.field2147[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var478 == 31) {
                        var5 -= 2;
                        if (field724[var5] <= field724[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var478 == 32) {
                        var5 -= 2;
                        if (field724[var5] >= field724[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var478 == 33) {
                        field724[var5++] = Statics.field720[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var478 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field720[var10001] = field724[var5];
                        continue;
                    }
                    if (var478 == 35) {
                        field725[var6++] = Statics.field718[var9[var7]];
                        continue;
                    }
                    if (var478 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field718[var10001] = field725[var6];
                        continue;
                    }
                    if (var478 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field725;
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
                        field725[var6++] = var31;
                        continue;
                    }
                    if (var478 == 38) {
                        var5--;
                        continue;
                    }
                    if (var478 == 39) {
                        var6--;
                        continue;
                    }
                    if (var478 == 40) {
                        int var41 = var9[var7];
                        class49 var42 = class49.method848(var41);
                        int[] var43 = new int[var42.field935];
                        String[] var44 = new String[var42.field933];
                        for (int var45 = 0; var45 < var42.field928; var45++) {
                            var43[var45] = field724[var5 - var42.field928 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field932; var46++) {
                            var44[var46] = field725[var6 - var42.field932 + var46];
                        }
                        var5 -= var42.field928;
                        var6 -= var42.field932;
                        class12 var47 = new class12();
                        var47.field125 = var4;
                        var47.field117 = var7;
                        var47.field118 = Statics.field720;
                        var47.field119 = Statics.field718;
                        field727[++field726 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field929;
                        var9 = var42.field936;
                        var7 = -1;
                        Statics.field720 = var43;
                        Statics.field718 = var44;
                        continue;
                    }
                    if (var478 == 42) {
                        field724[var5++] = Statics.field1542.method809(var9[var7]);
                        continue;
                    }
                    if (var478 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1542.method808(var10001, field724[var5]);
                        continue;
                    }
                    if (var478 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field724[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field728[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label3028;
                                }
                                field732[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var478 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field724[var5];
                        if (var54 >= 0 && var54 < field728[var53]) {
                            field724[var5++] = field732[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var478 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field724[var5];
                        if (var56 >= 0 && var56 < field728[var55]) {
                            field732[var55][var56] = field724[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var478 == 47) {
                        String var57 = Statics.field1542.method811(var9[var7]);
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field725[var6++] = var57;
                        continue;
                    }
                    if (var478 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1542.method810(var10001, field725[var6]);
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var478 < 1000) {
                    if (var478 == 100) {
                        var5 -= 3;
                        int var59 = field724[var5];
                        int var60 = field724[var5 + 1];
                        int var61 = field724[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class170 var62 = class170.method786(var59);
                        if (var62.field2310 == null) {
                            var62.field2310 = new class170[var61 + 1];
                        }
                        if (var62.field2310.length <= var61) {
                            class170[] var63 = new class170[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2310.length; var64++) {
                                var63[var64] = var62.field2310[var64];
                            }
                            var62.field2310 = var63;
                        }
                        if (var61 > 0 && var62.field2310[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class170 var65 = new class170();
                        var65.field2300 = var60;
                        var65.field2266 = var65.field2186 = var62.field2186;
                        var65.field2187 = var61;
                        var65.field2185 = true;
                        var62.field2310[var61] = var65;
                        if (var58) {
                            Statics.field188 = var65;
                        } else {
                            Statics.field790 = var65;
                        }
                        client.method88(var62);
                        continue;
                    }
                    if (var478 == 101) {
                        class170 var66 = var58 ? Statics.field188 : Statics.field790;
                        class170 var67 = class170.method786(var66.field2186);
                        var67.field2310[var66.field2187] = null;
                        client.method88(var67);
                        continue;
                    }
                    if (var478 == 102) {
                        var5--;
                        class170 var68 = class170.method786(field724[var5]);
                        var68.field2310 = null;
                        client.method88(var68);
                        continue;
                    }
                    if (var478 == 200) {
                        var5 -= 2;
                        int var69 = field724[var5];
                        int var70 = field724[var5 + 1];
                        class170 var71 = class170.method2816(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field724[var5++] = 1;
                            if (var58) {
                                Statics.field188 = var71;
                            } else {
                                Statics.field790 = var71;
                            }
                            continue;
                        }
                        field724[var5++] = 0;
                        continue;
                    }
                    if (var478 == 201) {
                        var5--;
                        class170 var72 = class170.method786(field724[var5]);
                        if (var72 == null) {
                            field724[var5++] = 0;
                        } else {
                            field724[var5++] = 1;
                            if (var58) {
                                Statics.field188 = var72;
                            } else {
                                Statics.field790 = var72;
                            }
                        }
                        continue;
                    }
                } else if (!(var478 < 1000 || var478 >= 1100) || !(var478 < 2000 || var478 >= 2100)) {
                    int var73 = -1;
                    class170 var74;
                    if (var478 >= 2000) {
                        var478 -= 1000;
                        var5--;
                        var73 = field724[var5];
                        var74 = class170.method786(var73);
                    } else {
                        var74 = var58 ? Statics.field188 : Statics.field790;
                    }
                    if (var478 == 1000) {
                        var5 -= 4;
                        var74.field2195 = field724[var5];
                        var74.field2196 = field724[var5 + 1];
                        var74.field2231 = field724[var5 + 2];
                        var74.field2192 = field724[var5 + 3];
                        client.method88(var74);
                        client.method167(var74);
                        if (var73 != -1 && var74.field2300 == 0) {
                            client.method98(Statics.field2279[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var478 == 1001) {
                        var5 -= 4;
                        var74.field2238 = field724[var5];
                        var74.field2280 = field724[var5 + 1];
                        var74.field2198 = field724[var5 + 2];
                        var74.field2194 = field724[var5 + 3];
                        client.method88(var74);
                        client.method167(var74);
                        if (var73 != -1 && var74.field2300 == 0) {
                            client.method98(Statics.field2279[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var478 == 1003) {
                        var5--;
                        boolean var75 = field724[var5] == 1;
                        if (var74.field2206 != var75) {
                            var74.field2206 = var75;
                            client.method88(var74);
                        }
                        continue;
                    }
                    if (var478 == 1005) {
                        var5--;
                        var74.field2205 = field724[var5] == 1;
                        continue;
                    }
                    if (var478 == 1006) {
                        var5--;
                        var74.field2320 = field724[var5] == 1;
                        continue;
                    }
                } else if (var478 >= 1100 && var478 < 1200 || var478 >= 2100 && var478 < 2200) {
                    int var76 = -1;
                    class170 var77;
                    if (var478 >= 2000) {
                        var478 -= 1000;
                        var5--;
                        var76 = field724[var5];
                        var77 = class170.method786(var76);
                    } else {
                        var77 = var58 ? Statics.field188 : Statics.field790;
                    }
                    if (var478 == 1100) {
                        var5 -= 2;
                        var77.field2207 = field724[var5];
                        if (var77.field2207 > var77.field2209 - var77.field2201) {
                            var77.field2207 = var77.field2209 - var77.field2201;
                        }
                        if (var77.field2207 < 0) {
                            var77.field2207 = 0;
                        }
                        var77.field2239 = field724[var5 + 1];
                        if (var77.field2239 > var77.field2210 - var77.field2202) {
                            var77.field2239 = var77.field2210 - var77.field2202;
                        }
                        if (var77.field2239 < 0) {
                            var77.field2239 = 0;
                        }
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1101) {
                        var5--;
                        var77.field2211 = field724[var5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1102) {
                        var5--;
                        var77.field2236 = field724[var5] == 1;
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1103) {
                        var5--;
                        var77.field2217 = field724[var5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1104) {
                        var5--;
                        var77.field2237 = field724[var5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1105) {
                        var5--;
                        var77.field2221 = field724[var5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1106) {
                        var5--;
                        var77.field2223 = field724[var5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1107) {
                        var5--;
                        var77.field2224 = field724[var5] == 1;
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1108) {
                        var77.field2229 = 1;
                        var5--;
                        var77.field2230 = field724[var5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1109) {
                        var5 -= 6;
                        var77.field2235 = field724[var5];
                        var77.field2179 = field724[var5 + 1];
                        var77.field2285 = field724[var5 + 2];
                        var77.field2182 = field724[var5 + 3];
                        var77.field2311 = field724[var5 + 4];
                        var77.field2240 = field724[var5 + 5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1110) {
                        var5--;
                        int var78 = field724[var5];
                        if (var77.field2251 != var78) {
                            var77.field2251 = var78;
                            var77.field2216 = 0;
                            var77.field2309 = 0;
                            client.method88(var77);
                        }
                        continue;
                    }
                    if (var478 == 1111) {
                        var5--;
                        var77.field2243 = field724[var5] == 1;
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1112) {
                        var6--;
                        String var79 = field725[var6];
                        if (!var79.equals(var77.field2188)) {
                            var77.field2188 = var79;
                            client.method88(var77);
                        }
                        continue;
                    }
                    if (var478 == 1113) {
                        var5--;
                        var77.field2218 = field724[var5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1114) {
                        var5 -= 3;
                        var77.field2177 = field724[var5];
                        var77.field2215 = field724[var5 + 1];
                        var77.field2248 = field724[var5 + 2];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1115) {
                        var5--;
                        var77.field2219 = field724[var5] == 1;
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1116) {
                        var5--;
                        var77.field2225 = field724[var5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1117) {
                        var5--;
                        var77.field2226 = field724[var5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1118) {
                        var5--;
                        var77.field2197 = field724[var5] == 1;
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1119) {
                        var5--;
                        var77.field2183 = field724[var5] == 1;
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1120) {
                        var5 -= 2;
                        var77.field2209 = field724[var5];
                        var77.field2210 = field724[var5 + 1];
                        client.method88(var77);
                        if (var76 != -1 && var77.field2300 == 0) {
                            client.method98(Statics.field2279[var76 >> 16], var77, false);
                        }
                        continue;
                    }
                    if (var478 == 1121) {
                        client.method2438(var77.field2186, var77.field2187);
                        client.field538 = var77;
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1122) {
                        var5--;
                        var77.field2241 = field724[var5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1123) {
                        var5--;
                        var77.field2212 = field724[var5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1124) {
                        var5--;
                        var77.field2281 = field724[var5];
                        client.method88(var77);
                        continue;
                    }
                    if (var478 == 1125) {
                        var5--;
                        int var80 = field724[var5];
                        class222[] var81 = new class222[] { class222.field3186, class222.field3183, class222.field3184, class222.field3185, class222.field3189 };
                        class222 var82 = (class222) class149.method3057(var81, var80);
                        if (var82 != null) {
                            var77.field2220 = var82;
                            client.method88(var77);
                        }
                        continue;
                    }
                } else if (!(var478 < 1200 || var478 >= 1300) || !(var478 < 2200 || var478 >= 2300)) {
                    class170 var83;
                    if (var478 >= 2000) {
                        var478 -= 1000;
                        var5--;
                        var83 = class170.method786(field724[var5]);
                    } else {
                        var83 = var58 ? Statics.field188 : Statics.field790;
                    }
                    client.method88(var83);
                    if (var478 == 1200 || var478 == 1205 || var478 == 1212) {
                        var5 -= 2;
                        int var84 = field724[var5];
                        int var85 = field724[var5 + 1];
                        var83.field2249 = var84;
                        var83.field2307 = var85;
                        class199 var86 = Statics.method1768(var84);
                        var83.field2285 = var86.field2950;
                        var83.field2182 = var86.field2938;
                        var83.field2311 = var86.field2952;
                        var83.field2235 = var86.field2953;
                        var83.field2179 = var86.field2954;
                        var83.field2240 = var86.field2949;
                        if (var478 == 1205) {
                            var83.field2245 = 0;
                        } else if (var478 == 1212 | var86.field2962 == 1) {
                            var83.field2245 = 1;
                        } else {
                            var83.field2245 = 2;
                        }
                        if (var83.field2232 > 0) {
                            var83.field2240 = var83.field2240 * 32 / var83.field2232;
                        } else if (var83.field2238 > 0) {
                            var83.field2240 = var83.field2240 * 32 / var83.field2238;
                        }
                        continue;
                    }
                    if (var478 == 1201) {
                        var83.field2229 = 2;
                        var5--;
                        var83.field2230 = field724[var5];
                        continue;
                    }
                    if (var478 == 1202) {
                        var83.field2229 = 3;
                        var83.field2230 = Statics.field2019.field256.method2928();
                        continue;
                    }
                } else if ((var478 < 1300 || var478 >= 1400) && (var478 < 2300 || var478 >= 2400)) {
                    if (var478 >= 1400 && var478 < 1500 || var478 >= 2400 && var478 < 2500) {
                        class170 var91;
                        if (var478 >= 2000) {
                            var478 -= 1000;
                            var5--;
                            var91 = class170.method786(field724[var5]);
                        } else {
                            var91 = var58 ? Statics.field188 : Statics.field790;
                        }
                        var6--;
                        String var92 = field725[var6];
                        int[] var93 = null;
                        if (var92.length() > 0 && var92.charAt(var92.length() - 1) == 'Y') {
                            var5--;
                            int var94 = field724[var5];
                            if (var94 > 0) {
                                var93 = new int[var94];
                                while (var94-- > 0) {
                                    var5--;
                                    var93[var94] = field724[var5];
                                }
                            }
                            var92 = var92.substring(0, var92.length() - 1);
                        }
                        Object[] var95 = new Object[var92.length() + 1];
                        for (int var96 = var95.length - 1; var96 >= 1; var96--) {
                            if (var92.charAt(var96 - 1) == 's') {
                                var6--;
                                var95[var96] = field725[var6];
                            } else {
                                var5--;
                                var95[var96] = Integer.valueOf(field724[var5]);
                            }
                        }
                        var5--;
                        int var97 = field724[var5];
                        if (var97 == -1) {
                            var95 = null;
                        } else {
                            var95[0] = Integer.valueOf(var97);
                        }
                        if (var478 == 1400) {
                            var91.field2268 = var95;
                        }
                        if (var478 == 1401) {
                            var91.field2271 = var95;
                        }
                        if (var478 == 1402) {
                            var91.field2270 = var95;
                        }
                        if (var478 == 1403) {
                            var91.field2272 = var95;
                        }
                        if (var478 == 1404) {
                            var91.field2274 = var95;
                        }
                        if (var478 == 1405) {
                            var91.field2275 = var95;
                        }
                        if (var478 == 1406) {
                            var91.field2298 = var95;
                        }
                        if (var478 == 1407) {
                            var91.field2304 = var95;
                            var91.field2193 = var93;
                        }
                        if (var478 == 1408) {
                            var91.field2273 = var95;
                        }
                        if (var478 == 1409) {
                            var91.field2286 = var95;
                        }
                        if (var478 == 1410) {
                            var91.field2276 = var95;
                        }
                        if (var478 == 1411) {
                            var91.field2269 = var95;
                        }
                        if (var478 == 1412) {
                            var91.field2233 = var95;
                        }
                        if (var478 == 1414) {
                            var91.field2176 = var95;
                            var91.field2282 = var93;
                        }
                        if (var478 == 1415) {
                            var91.field2283 = var95;
                            var91.field2250 = var93;
                        }
                        if (var478 == 1416) {
                            var91.field2277 = var95;
                        }
                        if (var478 == 1417) {
                            var91.field2287 = var95;
                        }
                        if (var478 == 1418) {
                            var91.field2288 = var95;
                        }
                        if (var478 == 1419) {
                            var91.field2289 = var95;
                        }
                        if (var478 == 1420) {
                            var91.field2180 = var95;
                        }
                        if (var478 == 1421) {
                            var91.field2291 = var95;
                        }
                        if (var478 == 1422) {
                            var91.field2292 = var95;
                        }
                        if (var478 == 1423) {
                            var91.field2293 = var95;
                        }
                        if (var478 == 1424) {
                            var91.field2294 = var95;
                        }
                        if (var478 == 1425) {
                            var91.field2296 = var95;
                        }
                        if (var478 == 1426) {
                            var91.field2297 = var95;
                        }
                        if (var478 == 1427) {
                            var91.field2228 = var95;
                        }
                        var91.field2308 = true;
                        continue;
                    }
                    if (var478 < 1600) {
                        class170 var98 = var58 ? Statics.field188 : Statics.field790;
                        if (var478 == 1500) {
                            field724[var5++] = var98.field2278;
                            continue;
                        }
                        if (var478 == 1501) {
                            field724[var5++] = var98.field2244;
                            continue;
                        }
                        if (var478 == 1502) {
                            field724[var5++] = var98.field2201;
                            continue;
                        }
                        if (var478 == 1503) {
                            field724[var5++] = var98.field2202;
                            continue;
                        }
                        if (var478 == 1504) {
                            field724[var5++] = var98.field2206 ? 1 : 0;
                            continue;
                        }
                        if (var478 == 1505) {
                            field724[var5++] = var98.field2266;
                            continue;
                        }
                    } else if (var478 < 1700) {
                        class170 var99 = var58 ? Statics.field188 : Statics.field790;
                        if (var478 == 1600) {
                            field724[var5++] = var99.field2207;
                            continue;
                        }
                        if (var478 == 1601) {
                            field724[var5++] = var99.field2239;
                            continue;
                        }
                        if (var478 == 1602) {
                            field725[var6++] = var99.field2188;
                            continue;
                        }
                        if (var478 == 1603) {
                            field724[var5++] = var99.field2209;
                            continue;
                        }
                        if (var478 == 1604) {
                            field724[var5++] = var99.field2210;
                            continue;
                        }
                        if (var478 == 1605) {
                            field724[var5++] = var99.field2240;
                            continue;
                        }
                        if (var478 == 1606) {
                            field724[var5++] = var99.field2285;
                            continue;
                        }
                        if (var478 == 1607) {
                            field724[var5++] = var99.field2311;
                            continue;
                        }
                        if (var478 == 1608) {
                            field724[var5++] = var99.field2182;
                            continue;
                        }
                        if (var478 == 1609) {
                            field724[var5++] = var99.field2217;
                            continue;
                        }
                        if (var478 == 1610) {
                            field724[var5++] = var99.field2281;
                            continue;
                        }
                        if (var478 == 1611) {
                            field724[var5++] = var99.field2211;
                            continue;
                        }
                        if (var478 == 1612) {
                            field724[var5++] = var99.field2212;
                            continue;
                        }
                        if (var478 == 1613) {
                            field724[var5++] = var99.field2220.method728();
                            continue;
                        }
                    } else if (var478 < 1800) {
                        class170 var100 = var58 ? Statics.field188 : Statics.field790;
                        if (var478 == 1700) {
                            field724[var5++] = var100.field2249;
                            continue;
                        }
                        if (var478 == 1701) {
                            if (var100.field2249 == -1) {
                                field724[var5++] = 0;
                            } else {
                                field724[var5++] = var100.field2307;
                            }
                            continue;
                        }
                        if (var478 == 1702) {
                            field724[var5++] = var100.field2187;
                            continue;
                        }
                    } else if (var478 < 1900) {
                        class170 var101 = var58 ? Statics.field188 : Statics.field790;
                        if (var478 == 1800) {
                            int[] var102 = field724;
                            int var103 = var5++;
                            int var104 = client.method1782(var101);
                            int var105 = var104 >> 11 & 0x3F;
                            var102[var103] = var105;
                            continue;
                        }
                        if (var478 == 1801) {
                            var5--;
                            int var106 = field724[var5];
                            int var479 = var106 - 1;
                            if (var101.field2260 != null && var479 < var101.field2260.length && var101.field2260[var479] != null) {
                                field725[var6++] = var101.field2260[var479];
                                continue;
                            }
                            field725[var6++] = "";
                            continue;
                        }
                        if (var478 == 1802) {
                            if (var101.field2259 == null) {
                                field725[var6++] = "";
                            } else {
                                field725[var6++] = var101.field2259;
                            }
                            continue;
                        }
                    } else if (var478 >= 1900 && var478 < 2000 || var478 >= 2900 && var478 < 3000) {
                        class170 var107;
                        if (var478 >= 2000) {
                            var478 -= 1000;
                            var5--;
                            var107 = class170.method786(field724[var5]);
                        } else {
                            var107 = var58 ? Statics.field188 : Statics.field790;
                        }
                        if (var478 == 1927) {
                            if (field723 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var107.field2228 == null) {
                                return;
                            }
                            class19 var108 = new class19();
                            var108.field196 = var107;
                            var108.field204 = var107.field2228;
                            var108.field199 = field723 + 1;
                            client.field480.method2245(arg0);
                            continue;
                        }
                    } else if (var478 < 2600) {
                        var5--;
                        class170 var109 = class170.method786(field724[var5]);
                        if (var478 == 2500) {
                            field724[var5++] = var109.field2278;
                            continue;
                        }
                        if (var478 == 2501) {
                            field724[var5++] = var109.field2244;
                            continue;
                        }
                        if (var478 == 2502) {
                            field724[var5++] = var109.field2201;
                            continue;
                        }
                        if (var478 == 2503) {
                            field724[var5++] = var109.field2202;
                            continue;
                        }
                        if (var478 == 2504) {
                            field724[var5++] = var109.field2206 ? 1 : 0;
                            continue;
                        }
                        if (var478 == 2505) {
                            field724[var5++] = var109.field2266;
                            continue;
                        }
                    } else if (var478 < 2700) {
                        var5--;
                        class170 var110 = class170.method786(field724[var5]);
                        if (var478 == 2600) {
                            field724[var5++] = var110.field2207;
                            continue;
                        }
                        if (var478 == 2601) {
                            field724[var5++] = var110.field2239;
                            continue;
                        }
                        if (var478 == 2602) {
                            field725[var6++] = var110.field2188;
                            continue;
                        }
                        if (var478 == 2603) {
                            field724[var5++] = var110.field2209;
                            continue;
                        }
                        if (var478 == 2604) {
                            field724[var5++] = var110.field2210;
                            continue;
                        }
                        if (var478 == 2605) {
                            field724[var5++] = var110.field2240;
                            continue;
                        }
                        if (var478 == 2606) {
                            field724[var5++] = var110.field2285;
                            continue;
                        }
                        if (var478 == 2607) {
                            field724[var5++] = var110.field2311;
                            continue;
                        }
                        if (var478 == 2608) {
                            field724[var5++] = var110.field2182;
                            continue;
                        }
                        if (var478 == 2609) {
                            field724[var5++] = var110.field2217;
                            continue;
                        }
                        if (var478 == 2610) {
                            field724[var5++] = var110.field2281;
                            continue;
                        }
                        if (var478 == 2611) {
                            field724[var5++] = var110.field2211;
                            continue;
                        }
                        if (var478 == 2612) {
                            field724[var5++] = var110.field2212;
                            continue;
                        }
                        if (var478 == 2613) {
                            field724[var5++] = var110.field2220.method728();
                            continue;
                        }
                    } else if (var478 < 2800) {
                        if (var478 == 2700) {
                            var5--;
                            class170 var111 = class170.method786(field724[var5]);
                            field724[var5++] = var111.field2249;
                            continue;
                        }
                        if (var478 == 2701) {
                            var5--;
                            class170 var112 = class170.method786(field724[var5]);
                            if (var112.field2249 == -1) {
                                field724[var5++] = 0;
                            } else {
                                field724[var5++] = var112.field2307;
                            }
                            continue;
                        }
                        if (var478 == 2702) {
                            var5--;
                            int var113 = field724[var5];
                            class18 var114 = (class18) client.field442.method2190((long) var113);
                            if (var114 == null) {
                                field724[var5++] = 0;
                            } else {
                                field724[var5++] = 1;
                            }
                            continue;
                        }
                        if (var478 == 2706) {
                            field724[var5++] = client.field441;
                            continue;
                        }
                    } else if (var478 < 2900) {
                        var5--;
                        class170 var115 = class170.method786(field724[var5]);
                        if (var478 == 2800) {
                            int[] var116 = field724;
                            int var117 = var5++;
                            int var118 = client.method1782(var115);
                            int var119 = var118 >> 11 & 0x3F;
                            var116[var117] = var119;
                            continue;
                        }
                        if (var478 == 2801) {
                            var5--;
                            int var120 = field724[var5];
                            int var480 = var120 - 1;
                            if (var115.field2260 != null && var480 < var115.field2260.length && var115.field2260[var480] != null) {
                                field725[var6++] = var115.field2260[var480];
                                continue;
                            }
                            field725[var6++] = "";
                            continue;
                        }
                        if (var478 == 2802) {
                            if (var115.field2259 == null) {
                                field725[var6++] = "";
                            } else {
                                field725[var6++] = var115.field2259;
                            }
                            continue;
                        }
                    } else if (var478 < 3200) {
                        if (var478 == 3100) {
                            var6--;
                            String var121 = field725[var6];
                            class48.method100(0, "", var121);
                            continue;
                        }
                        if (var478 == 3101) {
                            var5 -= 2;
                            Statics.method168(Statics.field2019, field724[var5], field724[var5 + 1]);
                            continue;
                        }
                        if (var478 == 3103) {
                            client.field327.method2832(249);
                            for (class18 var122 = (class18) client.field442.method2195(); var122 != null; var122 = (class18) client.field442.method2194()) {
                                if (var122.field183 == 0 || var122.field183 == 3) {
                                    client.method32(var122, true);
                                }
                            }
                            if (client.field538 != null) {
                                client.method88(client.field538);
                                client.field538 = null;
                            }
                            continue;
                        }
                        if (var478 == 3104) {
                            var6--;
                            String var123 = field725[var6];
                            int var124 = 0;
                            boolean var125 = class208.method203(var123, 10, true);
                            if (var125) {
                                var124 = class208.method184(var123);
                            }
                            client.field327.method2832(52);
                            client.field327.method2576(var124);
                            continue;
                        }
                        if (var478 == 3105) {
                            var6--;
                            String var126 = field725[var6];
                            client.field327.method2832(128);
                            client.field327.method2573(var126.length() + 1);
                            client.field327.method2624(var126);
                            continue;
                        }
                        if (var478 == 3106) {
                            var6--;
                            String var127 = field725[var6];
                            client.field327.method2832(35);
                            client.field327.method2573(var127.length() + 1);
                            client.field327.method2624(var127);
                            continue;
                        }
                        if (var478 == 3107) {
                            var5--;
                            int var128 = field724[var5];
                            var6--;
                            String var129 = field725[var6];
                            client.method781(var128, var129);
                            continue;
                        }
                        if (var478 == 3108) {
                            var5 -= 3;
                            int var130 = field724[var5];
                            int var131 = field724[var5 + 1];
                            int var132 = field724[var5 + 2];
                            class170 var133 = class170.method786(var132);
                            client.method1769(var133, var130, var131);
                            continue;
                        }
                        if (var478 == 3109) {
                            var5 -= 2;
                            int var134 = field724[var5];
                            int var135 = field724[var5 + 1];
                            class170 var136 = var58 ? Statics.field188 : Statics.field790;
                            client.method1769(var136, var134, var135);
                            continue;
                        }
                        if (var478 == 3110) {
                            var5--;
                            Statics.field1298 = field724[var5] == 1;
                            continue;
                        }
                        if (var478 == 3111) {
                            field724[var5++] = Statics.field22.field691 ? 1 : 0;
                            continue;
                        }
                        if (var478 == 3112) {
                            var5--;
                            Statics.field22.field691 = field724[var5] == 1;
                            class31.method109();
                            continue;
                        }
                        if (var478 == 3113) {
                            var6--;
                            String var137 = field725[var6];
                            var5--;
                            boolean var138 = field724[var5] == 1;
                            class115.method2808(var137, var138, false);
                            continue;
                        }
                        if (var478 == 3115) {
                            var5--;
                            int var139 = field724[var5];
                            client.field327.method2832(0);
                            client.field327.method2731(var139);
                            continue;
                        }
                        if (var478 == 3116) {
                            var5--;
                            int var140 = field724[var5];
                            var6 -= 2;
                            String var141 = field725[var6];
                            String var142 = field725[var6 + 1];
                            if (var141.length() <= 500 && var142.length() <= 500) {
                                client.field327.method2832(247);
                                client.field327.method2731(1 + class154.method2553(var141) + class154.method2553(var142));
                                client.field327.method2624(var141);
                                client.field327.method2624(var142);
                                client.field327.method2613(var140);
                            }
                            continue;
                        }
                    } else if (var478 < 3300) {
                        if (var478 == 3200) {
                            var5 -= 3;
                            client.method2130(field724[var5], field724[var5 + 1], field724[var5 + 2]);
                            continue;
                        }
                        if (var478 == 3201) {
                            var5--;
                            int var143 = field724[var5];
                            if (var143 == -1 && !client.field520) {
                                class139.method119();
                            } else if (var143 != -1 && client.field445 != var143 && client.field518 != 0 && !client.field520) {
                                class139.method1593(2, Statics.field782, var143, 0, client.field518, false);
                            }
                            client.field445 = var143;
                            continue;
                        }
                        if (var478 == 3202) {
                            var5 -= 2;
                            Statics.method1777(field724[var5], field724[var5 + 1]);
                            continue;
                        }
                    } else if (var478 < 3400) {
                        if (var478 == 3300) {
                            field724[var5++] = client.field291;
                            continue;
                        }
                        if (var478 == 3301) {
                            var5 -= 2;
                            int var144 = field724[var5];
                            int var145 = field724[var5 + 1];
                            field724[var5++] = class13.method76(var144, var145);
                            continue;
                        }
                        if (var478 == 3302) {
                            var5 -= 2;
                            int var146 = field724[var5];
                            int var147 = field724[var5 + 1];
                            int[] var148 = field724;
                            int var149 = var5++;
                            class13 var150 = (class13) class13.field132.method2190((long) var146);
                            int var151;
                            if (var150 == null) {
                                var151 = 0;
                            } else if (var147 >= 0 && var147 < var150.field131.length) {
                                var151 = var150.field131[var147];
                            } else {
                                var151 = 0;
                            }
                            var148[var149] = var151;
                            continue;
                        }
                        if (var478 == 3303) {
                            var5 -= 2;
                            int var152 = field724[var5];
                            int var153 = field724[var5 + 1];
                            int[] var154 = field724;
                            int var155 = var5++;
                            class13 var156 = (class13) class13.field132.method2190((long) var152);
                            int var157;
                            if (var156 == null) {
                                var157 = 0;
                            } else if (var153 == -1) {
                                var157 = 0;
                            } else {
                                int var158 = 0;
                                for (int var159 = 0; var159 < var156.field131.length; var159++) {
                                    if (var156.field135[var159] == var153) {
                                        var158 += var156.field131[var159];
                                    }
                                }
                                var157 = var158;
                            }
                            var154[var155] = var157;
                            continue;
                        }
                        if (var478 == 3304) {
                            var5--;
                            int var160 = field724[var5];
                            int[] var161 = field724;
                            int var162 = var5++;
                            class187 var163 = (class187) class187.field2746.method2186((long) var160);
                            class187 var164;
                            if (var163 == null) {
                                byte[] var165 = Statics.field2749.method3071(5, var160);
                                class187 var166 = new class187();
                                if (var165 != null) {
                                    var166.method3200(new class154(var165));
                                }
                                class187.field2746.method2179(var166, (long) var160);
                                var164 = var166;
                            } else {
                                var164 = var163;
                            }
                            var161[var162] = var164.field2747;
                            continue;
                        }
                        if (var478 == 3305) {
                            var5--;
                            int var167 = field724[var5];
                            field724[var5++] = client.field376[var167];
                            continue;
                        }
                        if (var478 == 3306) {
                            var5--;
                            int var168 = field724[var5];
                            field724[var5++] = client.field419[var168];
                            continue;
                        }
                        if (var478 == 3307) {
                            var5--;
                            int var169 = field724[var5];
                            field724[var5++] = client.field420[var169];
                            continue;
                        }
                        if (var478 == 3308) {
                            int var170 = Statics.field1075;
                            int var171 = (Statics.field2019.field612 >> 7) + Statics.field1465;
                            int var172 = (Statics.field2019.field601 >> 7) + Statics.field129;
                            field724[var5++] = (var170 << 28) + (var171 << 14) + var172;
                            continue;
                        }
                        if (var478 == 3309) {
                            var5--;
                            int var173 = field724[var5];
                            field724[var5++] = var173 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var478 == 3310) {
                            var5--;
                            int var174 = field724[var5];
                            field724[var5++] = var174 >> 28;
                            continue;
                        }
                        if (var478 == 3311) {
                            var5--;
                            int var175 = field724[var5];
                            field724[var5++] = var175 & 0x3FFF;
                            continue;
                        }
                        if (var478 == 3312) {
                            field724[var5++] = client.field286 ? 1 : 0;
                            continue;
                        }
                        if (var478 == 3313) {
                            var5 -= 2;
                            int var176 = field724[var5] + 32768;
                            int var177 = field724[var5 + 1];
                            field724[var5++] = class13.method76(var176, var177);
                            continue;
                        }
                        if (var478 == 3314) {
                            var5 -= 2;
                            int var178 = field724[var5] + 32768;
                            int var179 = field724[var5 + 1];
                            int[] var180 = field724;
                            int var181 = var5++;
                            class13 var182 = (class13) class13.field132.method2190((long) var178);
                            int var183;
                            if (var182 == null) {
                                var183 = 0;
                            } else if (var179 >= 0 && var179 < var182.field131.length) {
                                var183 = var182.field131[var179];
                            } else {
                                var183 = 0;
                            }
                            var180[var181] = var183;
                            continue;
                        }
                        if (var478 == 3315) {
                            var5 -= 2;
                            int var184 = field724[var5] + 32768;
                            int var185 = field724[var5 + 1];
                            int[] var186 = field724;
                            int var187 = var5++;
                            class13 var188 = (class13) class13.field132.method2190((long) var184);
                            int var189;
                            if (var188 == null) {
                                var189 = 0;
                            } else if (var185 == -1) {
                                var189 = 0;
                            } else {
                                int var190 = 0;
                                for (int var191 = 0; var191 < var188.field131.length; var191++) {
                                    if (var188.field135[var191] == var185) {
                                        var190 += var188.field131[var191];
                                    }
                                }
                                var189 = var190;
                            }
                            var186[var187] = var189;
                            continue;
                        }
                        if (var478 == 3316) {
                            if (client.field353 >= 2) {
                                field724[var5++] = client.field353;
                            } else {
                                field724[var5++] = 0;
                            }
                            continue;
                        }
                        if (var478 == 3317) {
                            field724[var5++] = client.field298;
                            continue;
                        }
                        if (var478 == 3318) {
                            field724[var5++] = client.field282;
                            continue;
                        }
                        if (var478 == 3321) {
                            field724[var5++] = client.field524;
                            continue;
                        }
                        if (var478 == 3322) {
                            field724[var5++] = client.field552;
                            continue;
                        }
                        if (var478 == 3323) {
                            if (client.field450) {
                                field724[var5++] = 1;
                            } else {
                                field724[var5++] = 0;
                            }
                            continue;
                        }
                        if (var478 == 3324) {
                            field724[var5++] = client.field482;
                            continue;
                        }
                    } else if (var478 < 3500) {
                        if (var478 == 3400) {
                            var5 -= 2;
                            int var192 = field724[var5];
                            int var193 = field724[var5 + 1];
                            class196 var194 = class196.method2434(var192);
                            if (var194.field2843 != 's') {
                            }
                            for (int var195 = 0; var195 < var194.field2846; var195++) {
                                if (var194.field2847[var195] == var193) {
                                    field725[var6++] = var194.field2842[var195];
                                    var194 = null;
                                    break;
                                }
                            }
                            if (var194 != null) {
                                field725[var6++] = var194.field2844;
                            }
                            continue;
                        }
                        if (var478 == 3408) {
                            var5 -= 4;
                            int var196 = field724[var5];
                            int var197 = field724[var5 + 1];
                            int var198 = field724[var5 + 2];
                            int var199 = field724[var5 + 3];
                            class196 var200 = class196.method2434(var198);
                            if (var200.field2849 == var196 && var200.field2843 == var197) {
                                for (int var201 = 0; var201 < var200.field2846; var201++) {
                                    if (var200.field2847[var201] == var199) {
                                        if (var197 == 115) {
                                            field725[var6++] = var200.field2842[var201];
                                        } else {
                                            field724[var5++] = var200.field2840[var201];
                                        }
                                        var200 = null;
                                        break;
                                    }
                                }
                                if (var200 != null) {
                                    if (var197 == 115) {
                                        field725[var6++] = var200.field2844;
                                    } else {
                                        field724[var5++] = var200.field2845;
                                    }
                                }
                                continue;
                            }
                            if (var197 == 115) {
                                field725[var6++] = "null";
                            } else {
                                field724[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var478 < 3700) {
                        if (var478 == 3600) {
                            if (client.field466 == 0) {
                                field724[var5++] = -2;
                            } else if (client.field466 == 1) {
                                field724[var5++] = -1;
                            } else {
                                field724[var5++] = client.field549;
                            }
                            continue;
                        }
                        if (var478 == 3601) {
                            var5--;
                            int var202 = field724[var5];
                            if (client.field466 == 2 && var202 < client.field549) {
                                field725[var6++] = client.field351[var202].field156;
                                field725[var6++] = client.field351[var202].field158;
                                continue;
                            }
                            field725[var6++] = "";
                            field725[var6++] = "";
                            continue;
                        }
                        if (var478 == 3602) {
                            var5--;
                            int var203 = field724[var5];
                            if (client.field466 == 2 && var203 < client.field549) {
                                field724[var5++] = client.field351[var203].field157;
                                continue;
                            }
                            field724[var5++] = 0;
                            continue;
                        }
                        if (var478 == 3603) {
                            var5--;
                            int var204 = field724[var5];
                            if (client.field466 == 2 && var204 < client.field549) {
                                field724[var5++] = client.field351[var204].field161;
                                continue;
                            }
                            field724[var5++] = 0;
                            continue;
                        }
                        if (var478 == 3604) {
                            var6--;
                            String var205 = field725[var6];
                            var5--;
                            int var206 = field724[var5];
                            client.method1895(var205, var206);
                            continue;
                        }
                        if (var478 == 3605) {
                            var6--;
                            String var207 = field725[var6];
                            client.method720(var207);
                            continue;
                        }
                        if (var478 == 3606) {
                            var6--;
                            String var208 = field725[var6];
                            if (var208 == null) {
                                continue;
                            }
                            String var209 = class205.method2433(var208, Statics.field210);
                            if (var209 == null) {
                                continue;
                            }
                            int var210 = 0;
                            while (true) {
                                if (var210 >= client.field549) {
                                    continue label3028;
                                }
                                class15 var211 = client.field351[var210];
                                String var212 = var211.field156;
                                String var213 = class205.method2433(var212, Statics.field210);
                                if (class218.method3019(var208, var209, var212, var213)) {
                                    client.field549--;
                                    for (int var214 = var210; var214 < client.field549; var214++) {
                                        client.field351[var214] = client.field351[var214 + 1];
                                    }
                                    client.field461 = client.field447;
                                    client.field327.method2832(45);
                                    client.field327.method2573(class154.method2553(var208));
                                    client.field327.method2624(var208);
                                    continue label3028;
                                }
                                var210++;
                            }
                        }
                        if (var478 == 3607) {
                            var6--;
                            String var215 = field725[var6];
                            client.method1067(var215, false);
                            continue;
                        }
                        if (var478 == 3608) {
                            var6--;
                            String var216 = field725[var6];
                            client.method10(var216);
                            continue;
                        }
                        if (var478 == 3609) {
                            var6--;
                            String var217 = field725[var6];
                            class178[] var218 = class178.method212();
                            for (int var219 = 0; var219 < var218.length; var219++) {
                                class178 var220 = var218[var219];
                                if (var220.field2642 != -1 && var217.startsWith(class38.method1903(var220.field2642))) {
                                    var217 = var217.substring(6 + Integer.toString(var220.field2642).length());
                                    break;
                                }
                            }
                            field724[var5++] = client.method1069(var217, false) ? 1 : 0;
                            continue;
                        }
                        if (var478 == 3611) {
                            if (client.field508 == null) {
                                field725[var6++] = "";
                            } else {
                                field725[var6++] = class206.method156(client.field508);
                            }
                            continue;
                        }
                        if (var478 == 3612) {
                            if (client.field508 == null) {
                                field724[var5++] = 0;
                            } else {
                                field724[var5++] = Statics.field1985;
                            }
                            continue;
                        }
                        if (var478 == 3613) {
                            var5--;
                            int var221 = field724[var5];
                            if (client.field508 != null && var221 < Statics.field1985) {
                                field725[var6++] = Statics.field697[var221].field275;
                                continue;
                            }
                            field725[var6++] = "";
                            continue;
                        }
                        if (var478 == 3614) {
                            var5--;
                            int var222 = field724[var5];
                            if (client.field508 != null && var222 < Statics.field1985) {
                                field724[var5++] = Statics.field697[var222].field273;
                                continue;
                            }
                            field724[var5++] = 0;
                            continue;
                        }
                        if (var478 == 3615) {
                            var5--;
                            int var223 = field724[var5];
                            if (client.field508 != null && var223 < Statics.field1985) {
                                field724[var5++] = Statics.field697[var223].field271;
                                continue;
                            }
                            field724[var5++] = 0;
                            continue;
                        }
                        if (var478 == 3616) {
                            field724[var5++] = Statics.field2148;
                            continue;
                        }
                        if (var478 == 3617) {
                            var6--;
                            String var224 = field725[var6];
                            if (Statics.field697 != null) {
                                client.field327.method2832(251);
                                client.field327.method2573(class154.method2553(var224));
                                client.field327.method2624(var224);
                            }
                            continue;
                        }
                        if (var478 == 3618) {
                            field724[var5++] = Statics.field1832;
                            continue;
                        }
                        if (var478 == 3619) {
                            var6--;
                            String var225 = field725[var6];
                            client.method1860(var225);
                            continue;
                        }
                        if (var478 == 3620) {
                            client.field327.method2832(7);
                            client.field327.method2573(0);
                            continue;
                        }
                        if (var478 == 3621) {
                            if (client.field466 == 0) {
                                field724[var5++] = -1;
                            } else {
                                field724[var5++] = client.field553;
                            }
                            continue;
                        }
                        if (var478 == 3622) {
                            var5--;
                            int var226 = field724[var5];
                            if (client.field466 != 0 && var226 < client.field553) {
                                field725[var6++] = client.field554[var226].field212;
                                field725[var6++] = client.field554[var226].field206;
                                continue;
                            }
                            field725[var6++] = "";
                            field725[var6++] = "";
                            continue;
                        }
                        if (var478 == 3623) {
                            var6--;
                            String var227 = field725[var6];
                            if (var227.startsWith(class38.method1903(0)) || var227.startsWith(class38.method1903(1))) {
                                var227 = var227.substring(7);
                            }
                            field724[var5++] = client.method2918(var227) ? 1 : 0;
                            continue;
                        }
                        if (var478 == 3624) {
                            var5--;
                            int var228 = field724[var5];
                            if (Statics.field697 != null && var228 < Statics.field1985 && Statics.field697[var228].field275.equalsIgnoreCase(Statics.field2019.field244)) {
                                field724[var5++] = 1;
                                continue;
                            }
                            field724[var5++] = 0;
                            continue;
                        }
                        if (var478 == 3625) {
                            if (client.field509 == null) {
                                field725[var6++] = "";
                            } else {
                                field725[var6++] = class206.method156(client.field509);
                            }
                            continue;
                        }
                    } else if (var478 < 4000) {
                        if (var478 == 3903) {
                            var5--;
                            int var229 = field724[var5];
                            field724[var5++] = client.field383[var229].method52();
                            continue;
                        }
                        if (var478 == 3904) {
                            var5--;
                            int var230 = field724[var5];
                            field724[var5++] = client.field383[var230].field33;
                            continue;
                        }
                        if (var478 == 3905) {
                            var5--;
                            int var231 = field724[var5];
                            field724[var5++] = client.field383[var231].field34;
                            continue;
                        }
                        if (var478 == 3906) {
                            var5--;
                            int var232 = field724[var5];
                            field724[var5++] = client.field383[var232].field35;
                            continue;
                        }
                        if (var478 == 3907) {
                            var5--;
                            int var233 = field724[var5];
                            field724[var5++] = client.field383[var233].field39;
                            continue;
                        }
                        if (var478 == 3908) {
                            var5--;
                            int var234 = field724[var5];
                            field724[var5++] = client.field383[var234].field37;
                            continue;
                        }
                        if (var478 == 3910) {
                            var5--;
                            int var235 = field724[var5];
                            int var236 = client.field383[var235].method45();
                            field724[var5++] = var236 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var478 == 3911) {
                            var5--;
                            int var237 = field724[var5];
                            int var238 = client.field383[var237].method45();
                            field724[var5++] = var238 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var478 == 3912) {
                            var5--;
                            int var239 = field724[var5];
                            int var240 = client.field383[var239].method45();
                            field724[var5++] = var240 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var478 == 3913) {
                            var5--;
                            int var241 = field724[var5];
                            int var242 = client.field383[var241].method45();
                            field724[var5++] = var242 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var478 == 3914) {
                            var5--;
                            boolean var243 = field724[var5] == 1;
                            if (Statics.field124 != null) {
                                Statics.field124.method11(class2.field11, var243);
                            }
                            continue;
                        }
                        if (var478 == 3915) {
                            var5--;
                            boolean var244 = field724[var5] == 1;
                            if (Statics.field124 != null) {
                                Statics.field124.method11(class2.field10, var244);
                            }
                            continue;
                        }
                        if (var478 == 3916) {
                            var5 -= 2;
                            boolean var245 = field724[var5] == 1;
                            boolean var246 = field724[var5 + 1] == 1;
                            if (Statics.field124 != null) {
                                Statics.field124.method11(new class45(var246), var245);
                            }
                            continue;
                        }
                        if (var478 == 3917) {
                            var5--;
                            boolean var247 = field724[var5] == 1;
                            if (Statics.field124 != null) {
                                Statics.field124.method11(class2.field12, var247);
                            }
                            continue;
                        }
                        if (var478 == 3918) {
                            var5--;
                            boolean var248 = field724[var5] == 1;
                            if (Statics.field124 != null) {
                                Statics.field124.method11(class2.field9, var248);
                            }
                            continue;
                        }
                        if (var478 == 3919) {
                            field724[var5++] = Statics.field124 == null ? 0 : Statics.field124.field13.size();
                            continue;
                        }
                        if (var478 == 3920) {
                            var5--;
                            int var249 = field724[var5];
                            class3 var250 = (class3) Statics.field124.field13.get(var249);
                            field724[var5++] = var250.field23;
                            continue;
                        }
                        if (var478 == 3921) {
                            var5--;
                            int var251 = field724[var5];
                            class3 var252 = (class3) Statics.field124.field13.get(var251);
                            field725[var6++] = var252.method19();
                            continue;
                        }
                        if (var478 == 3922) {
                            var5--;
                            int var253 = field724[var5];
                            class3 var254 = (class3) Statics.field124.field13.get(var253);
                            field725[var6++] = var254.method21();
                            continue;
                        }
                        if (var478 == 3923) {
                            var5--;
                            int var255 = field724[var5];
                            class3 var256 = (class3) Statics.field124.field13.get(var255);
                            long var257 = class156.method118() - Statics.field46 - var256.field18;
                            int var259 = (int) (var257 / 3600000L);
                            int var260 = (int) ((var257 - (long) (var259 * 3600000)) / 60000L);
                            int var261 = (int) ((var257 - (long) (var259 * 3600000) - (long) (var260 * 60000)) / 1000L);
                            String var262 = var259 + ":" + var260 / 10 + var260 % 10 + ":" + var261 / 10 + var261 % 10;
                            field725[var6++] = var262;
                            continue;
                        }
                        if (var478 == 3924) {
                            var5--;
                            int var263 = field724[var5];
                            class3 var264 = (class3) Statics.field124.field13.get(var263);
                            field724[var5++] = var264.field16.field35;
                            continue;
                        }
                        if (var478 == 3925) {
                            var5--;
                            int var265 = field724[var5];
                            class3 var266 = (class3) Statics.field124.field13.get(var265);
                            field724[var5++] = var266.field16.field34;
                            continue;
                        }
                        if (var478 == 3926) {
                            var5--;
                            int var267 = field724[var5];
                            class3 var268 = (class3) Statics.field124.field13.get(var267);
                            field724[var5++] = var268.field16.field33;
                            continue;
                        }
                    } else if (var478 < 4100) {
                        if (var478 == 4000) {
                            var5 -= 2;
                            int var269 = field724[var5];
                            int var270 = field724[var5 + 1];
                            field724[var5++] = var269 + var270;
                            continue;
                        }
                        if (var478 == 4001) {
                            var5 -= 2;
                            int var271 = field724[var5];
                            int var272 = field724[var5 + 1];
                            field724[var5++] = var271 - var272;
                            continue;
                        }
                        if (var478 == 4002) {
                            var5 -= 2;
                            int var273 = field724[var5];
                            int var274 = field724[var5 + 1];
                            field724[var5++] = var273 * var274;
                            continue;
                        }
                        if (var478 == 4003) {
                            var5 -= 2;
                            int var275 = field724[var5];
                            int var276 = field724[var5 + 1];
                            field724[var5++] = var275 / var276;
                            continue;
                        }
                        if (var478 == 4004) {
                            var5--;
                            int var277 = field724[var5];
                            field724[var5++] = (int) (Math.random() * (double) var277);
                            continue;
                        }
                        if (var478 == 4005) {
                            var5--;
                            int var278 = field724[var5];
                            field724[var5++] = (int) (Math.random() * (double) (var278 + 1));
                            continue;
                        }
                        if (var478 == 4006) {
                            var5 -= 5;
                            int var279 = field724[var5];
                            int var280 = field724[var5 + 1];
                            int var281 = field724[var5 + 2];
                            int var282 = field724[var5 + 3];
                            int var283 = field724[var5 + 4];
                            field724[var5++] = (var280 - var279) * (var283 - var281) / (var282 - var281) + var279;
                            continue;
                        }
                        if (var478 == 4007) {
                            var5 -= 2;
                            int var284 = field724[var5];
                            int var285 = field724[var5 + 1];
                            field724[var5++] = var284 * var285 / 100 + var284;
                            continue;
                        }
                        if (var478 == 4008) {
                            var5 -= 2;
                            int var286 = field724[var5];
                            int var287 = field724[var5 + 1];
                            field724[var5++] = var286 | 0x1 << var287;
                            continue;
                        }
                        if (var478 == 4009) {
                            var5 -= 2;
                            int var288 = field724[var5];
                            int var289 = field724[var5 + 1];
                            field724[var5++] = var288 & -1 - (0x1 << var289);
                            continue;
                        }
                        if (var478 == 4010) {
                            var5 -= 2;
                            int var290 = field724[var5];
                            int var291 = field724[var5 + 1];
                            field724[var5++] = (var290 & 0x1 << var291) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var478 == 4011) {
                            var5 -= 2;
                            int var292 = field724[var5];
                            int var293 = field724[var5 + 1];
                            field724[var5++] = var292 % var293;
                            continue;
                        }
                        if (var478 == 4012) {
                            var5 -= 2;
                            int var294 = field724[var5];
                            int var295 = field724[var5 + 1];
                            if (var294 == 0) {
                                field724[var5++] = 0;
                            } else {
                                field724[var5++] = (int) Math.pow((double) var294, (double) var295);
                            }
                            continue;
                        }
                        if (var478 == 4013) {
                            var5 -= 2;
                            int var296 = field724[var5];
                            int var297 = field724[var5 + 1];
                            if (var296 == 0) {
                                field724[var5++] = 0;
                            } else if (var297 == 0) {
                                field724[var5++] = Integer.MAX_VALUE;
                            } else {
                                field724[var5++] = (int) Math.pow((double) var296, 1.0D / (double) var297);
                            }
                            continue;
                        }
                        if (var478 == 4014) {
                            var5 -= 2;
                            int var298 = field724[var5];
                            int var299 = field724[var5 + 1];
                            field724[var5++] = var298 & var299;
                            continue;
                        }
                        if (var478 == 4015) {
                            var5 -= 2;
                            int var300 = field724[var5];
                            int var301 = field724[var5 + 1];
                            field724[var5++] = var300 | var301;
                            continue;
                        }
                        if (var478 == 4018) {
                            var5 -= 3;
                            long var302 = (long) field724[var5];
                            long var304 = (long) field724[var5 + 1];
                            long var306 = (long) field724[var5 + 2];
                            field724[var5++] = (int) (var302 * var306 / var304);
                            continue;
                        }
                    } else if (var478 < 4200) {
                        if (var478 == 4100) {
                            var6--;
                            String var308 = field725[var6];
                            var5--;
                            int var309 = field724[var5];
                            field725[var6++] = var308 + var309;
                            continue;
                        }
                        if (var478 == 4101) {
                            var6 -= 2;
                            String var310 = field725[var6];
                            String var311 = field725[var6 + 1];
                            field725[var6++] = var310 + var311;
                            continue;
                        }
                        if (var478 == 4102) {
                            var6--;
                            String var312 = field725[var6];
                            var5--;
                            int var313 = field724[var5];
                            String[] var314 = field725;
                            int var315 = var6++;
                            String var317;
                            if (var313 < 0) {
                                var317 = Integer.toString(var313);
                            } else {
                                int var318 = var313;
                                String var319;
                                if (var313 < 0) {
                                    var319 = Integer.toString(var313, 10);
                                } else {
                                    int var320 = 2;
                                    int var321 = var313 / 10;
                                    while (var321 != 0) {
                                        var321 /= 10;
                                        var320++;
                                    }
                                    char[] var322 = new char[var320];
                                    var322[0] = '+';
                                    for (int var323 = var320 - 1; var323 > 0; var323--) {
                                        int var324 = var318;
                                        var318 /= 10;
                                        int var325 = var324 - var318 * 10;
                                        if (var325 >= 10) {
                                            var322[var323] = (char) (var325 + 87);
                                        } else {
                                            var322[var323] = (char) (var325 + 48);
                                        }
                                    }
                                    var319 = new String(var322);
                                }
                                var317 = var319;
                            }
                            var314[var315] = var312 + var317;
                            continue;
                        }
                        if (var478 == 4103) {
                            var6--;
                            String var326 = field725[var6];
                            field725[var6++] = var326.toLowerCase();
                            continue;
                        }
                        if (var478 == 4104) {
                            var5--;
                            int var327 = field724[var5];
                            long var328 = ((long) var327 + 11745L) * 86400000L;
                            field731.setTime(new Date(var328));
                            int var330 = field731.get(5);
                            int var331 = field731.get(2);
                            int var332 = field731.get(1);
                            field725[var6++] = var330 + "-" + field729[var331] + "-" + var332;
                            continue;
                        }
                        if (var478 == 4105) {
                            var6 -= 2;
                            String var333 = field725[var6];
                            String var334 = field725[var6 + 1];
                            if (Statics.field2019.field256 != null && Statics.field2019.field256.field2154) {
                                field725[var6++] = var334;
                                continue;
                            }
                            field725[var6++] = var333;
                            continue;
                        }
                        if (var478 == 4106) {
                            var5--;
                            int var335 = field724[var5];
                            field725[var6++] = Integer.toString(var335);
                            continue;
                        }
                        if (var478 == 4107) {
                            var6 -= 2;
                            int[] var336 = field724;
                            int var337 = var5++;
                            int var338 = class203.method3038(field725[var6], field725[var6 + 1], client.field473);
                            byte var339;
                            if (var338 > 0) {
                                var339 = 1;
                            } else if (var338 < 0) {
                                var339 = -1;
                            } else {
                                var339 = 0;
                            }
                            var336[var337] = var339;
                            continue;
                        }
                        if (var478 == 4108) {
                            var6--;
                            String var340 = field725[var6];
                            var5 -= 2;
                            int var341 = field724[var5];
                            int var342 = field724[var5 + 1];
                            byte[] var343 = Statics.field1844.method3071(var342, 0);
                            class209 var344 = new class209(var343);
                            field724[var5++] = var344.method3656(var340, var341);
                            continue;
                        }
                        if (var478 == 4109) {
                            var6--;
                            String var345 = field725[var6];
                            var5 -= 2;
                            int var346 = field724[var5];
                            int var347 = field724[var5 + 1];
                            byte[] var348 = Statics.field1844.method3071(var347, 0);
                            class209 var349 = new class209(var348);
                            field724[var5++] = var349.method3655(var345, var346);
                            continue;
                        }
                        if (var478 == 4110) {
                            var6 -= 2;
                            String var350 = field725[var6];
                            String var351 = field725[var6 + 1];
                            var5--;
                            if (field724[var5] == 1) {
                                field725[var6++] = var350;
                            } else {
                                field725[var6++] = var351;
                            }
                            continue;
                        }
                        if (var478 == 4111) {
                            var6--;
                            String var352 = field725[var6];
                            field725[var6++] = class210.method3657(var352);
                            continue;
                        }
                        if (var478 == 4112) {
                            var6--;
                            String var353 = field725[var6];
                            var5--;
                            int var354 = field724[var5];
                            field725[var6++] = var353 + (char) var354;
                            continue;
                        }
                        if (var478 == 4113) {
                            var5--;
                            int var355 = field724[var5];
                            int[] var356 = field724;
                            int var357 = var5++;
                            char var358 = (char) var355;
                            boolean var359;
                            if (var358 >= ' ' && var358 <= '~') {
                                var359 = true;
                            } else if (var358 >= 160 && var358 <= 255) {
                                var359 = true;
                            } else if (var358 == 8364 || var358 == 338 || var358 == 8212 || var358 == 339 || var358 == 376) {
                                var359 = true;
                            } else {
                                var359 = false;
                            }
                            var356[var357] = var359 ? 1 : 0;
                            continue;
                        }
                        if (var478 == 4114) {
                            var5--;
                            int var360 = field724[var5];
                            field724[var5++] = class208.method1776((char) var360) ? 1 : 0;
                            continue;
                        }
                        if (var478 == 4115) {
                            var5--;
                            int var361 = field724[var5];
                            field724[var5++] = class208.method1772((char) var361) ? 1 : 0;
                            continue;
                        }
                        if (var478 == 4116) {
                            var5--;
                            int var362 = field724[var5];
                            field724[var5++] = class208.method3205((char) var362) ? 1 : 0;
                            continue;
                        }
                        if (var478 == 4117) {
                            var6--;
                            String var363 = field725[var6];
                            if (var363 == null) {
                                field724[var5++] = 0;
                            } else {
                                field724[var5++] = var363.length();
                            }
                            continue;
                        }
                        if (var478 == 4118) {
                            var6--;
                            String var364 = field725[var6];
                            var5 -= 2;
                            int var365 = field724[var5];
                            int var366 = field724[var5 + 1];
                            field725[var6++] = var364.substring(var365, var366);
                            continue;
                        }
                        if (var478 == 4119) {
                            var6--;
                            String var367 = field725[var6];
                            StringBuilder var368 = new StringBuilder(var367.length());
                            boolean var369 = false;
                            for (int var370 = 0; var370 < var367.length(); var370++) {
                                char var371 = var367.charAt(var370);
                                if (var371 == '<') {
                                    var369 = true;
                                } else if (var371 == '>') {
                                    var369 = false;
                                } else if (!var369) {
                                    var368.append(var371);
                                }
                            }
                            field725[var6++] = var368.toString();
                            continue;
                        }
                        if (var478 == 4120) {
                            var6--;
                            String var372 = field725[var6];
                            var5--;
                            int var373 = field724[var5];
                            field724[var5++] = var372.indexOf(var373);
                            continue;
                        }
                        if (var478 == 4121) {
                            var6 -= 2;
                            String var374 = field725[var6];
                            String var375 = field725[var6 + 1];
                            var5--;
                            int var376 = field724[var5];
                            field724[var5++] = var374.indexOf(var375, var376);
                            continue;
                        }
                    } else if (var478 < 4300) {
                        if (var478 == 4200) {
                            var5--;
                            int var377 = field724[var5];
                            field725[var6++] = Statics.method1768(var377).field2944;
                            continue;
                        }
                        if (var478 == 4201) {
                            var5 -= 2;
                            int var378 = field724[var5];
                            int var379 = field724[var5 + 1];
                            class199 var380 = Statics.method1768(var378);
                            if (var379 >= 1 && var379 <= 5 && var380.field2961[var379 - 1] != null) {
                                field725[var6++] = var380.field2961[var379 - 1];
                                continue;
                            }
                            field725[var6++] = "";
                            continue;
                        }
                        if (var478 == 4202) {
                            var5 -= 2;
                            int var381 = field724[var5];
                            int var382 = field724[var5 + 1];
                            class199 var383 = Statics.method1768(var381);
                            if (var382 >= 1 && var382 <= 5 && var383.field2979[var382 - 1] != null) {
                                field725[var6++] = var383.field2979[var382 - 1];
                                continue;
                            }
                            field725[var6++] = "";
                            continue;
                        }
                        if (var478 == 4203) {
                            var5--;
                            int var384 = field724[var5];
                            field724[var5++] = Statics.method1768(var384).field2956;
                            continue;
                        }
                        if (var478 == 4204) {
                            var5--;
                            int var385 = field724[var5];
                            field724[var5++] = Statics.method1768(var385).field2962 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var478 == 4205) {
                            var5--;
                            int var386 = field724[var5];
                            class199 var387 = Statics.method1768(var386);
                            if (var387.field2975 == -1 && var387.field2940 >= 0) {
                                field724[var5++] = var387.field2940;
                                continue;
                            }
                            field724[var5++] = var386;
                            continue;
                        }
                        if (var478 == 4206) {
                            var5--;
                            int var388 = field724[var5];
                            class199 var389 = Statics.method1768(var388);
                            if (var389.field2975 >= 0 && var389.field2940 >= 0) {
                                field724[var5++] = var389.field2940;
                                continue;
                            }
                            field724[var5++] = var388;
                            continue;
                        }
                        if (var478 == 4207) {
                            var5--;
                            int var390 = field724[var5];
                            field724[var5++] = Statics.method1768(var390).field2957 ? 1 : 0;
                            continue;
                        }
                        if (var478 == 4208) {
                            var5--;
                            int var391 = field724[var5];
                            class199 var392 = Statics.method1768(var391);
                            if (var392.field2943 == -1 && var392.field2985 >= 0) {
                                field724[var5++] = var392.field2985;
                                continue;
                            }
                            field724[var5++] = var391;
                            continue;
                        }
                        if (var478 == 4209) {
                            var5--;
                            int var393 = field724[var5];
                            class199 var394 = Statics.method1768(var393);
                            if (var394.field2943 >= 0 && var394.field2985 >= 0) {
                                field724[var5++] = var394.field2985;
                                continue;
                            }
                            field724[var5++] = var393;
                            continue;
                        }
                        if (var478 == 4210) {
                            var6--;
                            String var395 = field725[var6];
                            var5--;
                            int var396 = field724[var5];
                            boolean var398 = var396 == 1;
                            String var399 = var395.toLowerCase();
                            short[] var400 = new short[16];
                            int var401 = 0;
                            int var402 = 0;
                            while (true) {
                                if (var402 >= Statics.field2976) {
                                    Statics.field875 = var400;
                                    Statics.field2025 = 0;
                                    Statics.field1597 = var401;
                                    String[] var406 = new String[Statics.field1597];
                                    for (int var407 = 0; var407 < Statics.field1597; var407++) {
                                        var406[var407] = Statics.method1768(var400[var407]).field2944;
                                    }
                                    short[] var408 = Statics.field875;
                                    class151.method621(var406, var408, 0, var406.length - 1);
                                    break;
                                }
                                class199 var403 = Statics.method1768(var402);
                                if ((!var398 || var403.field2982) && var403.field2975 == -1 && var403.field2944.toLowerCase().indexOf(var399) != -1) {
                                    if (var401 >= 250) {
                                        Statics.field1597 = -1;
                                        Statics.field875 = null;
                                        break;
                                    }
                                    if (var401 >= var400.length) {
                                        short[] var404 = new short[var400.length * 2];
                                        for (int var405 = 0; var405 < var401; var405++) {
                                            var404[var405] = var400[var405];
                                        }
                                        var400 = var404;
                                    }
                                    var400[var401++] = (short) var402;
                                }
                                var402++;
                            }
                            field724[var5++] = Statics.field1597;
                            continue;
                        }
                        if (var478 == 4211) {
                            if (Statics.field875 != null && Statics.field2025 < Statics.field1597) {
                                field724[var5++] = Statics.field875[++Statics.field2025 - 1] & 0xFFFF;
                                continue;
                            }
                            field724[var5++] = -1;
                            continue;
                        }
                        if (var478 == 4212) {
                            Statics.field2025 = 0;
                            continue;
                        }
                    } else if (var478 < 5100) {
                        if (var478 == 5000) {
                            field724[var5++] = client.field499;
                            continue;
                        }
                        if (var478 == 5001) {
                            var5 -= 3;
                            client.field499 = field724[var5];
                            int var409 = field724[var5 + 1];
                            class217[] var410 = new class217[] { class217.field3163, class217.field3166, class217.field3164 };
                            class217[] var411 = var410;
                            int var412 = 0;
                            class217 var414;
                            while (true) {
                                if (var412 >= var411.length) {
                                    var414 = null;
                                    break;
                                }
                                class217 var413 = var411[var412];
                                if (var413.field3162 == var409) {
                                    var414 = var413;
                                    break;
                                }
                                var412++;
                            }
                            Statics.field1468 = var414;
                            if (Statics.field1468 == null) {
                                Statics.field1468 = class217.field3166;
                            }
                            client.field500 = field724[var5 + 2];
                            client.field327.method2832(73);
                            client.field327.method2573(client.field499);
                            client.field327.method2573(Statics.field1468.field3162);
                            client.field327.method2573(client.field500);
                            continue;
                        }
                        if (var478 == 5002) {
                            var6--;
                            String var415 = field725[var6];
                            var5 -= 2;
                            int var416 = field724[var5];
                            int var417 = field724[var5 + 1];
                            client.field327.method2832(81);
                            client.field327.method2573(class154.method2553(var415) + 2);
                            client.field327.method2624(var415);
                            client.field327.method2573(var416 - 1);
                            client.field327.method2573(var417);
                            continue;
                        }
                        if (var478 == 5003) {
                            var5 -= 2;
                            int var418 = field724[var5];
                            int var419 = field724[var5 + 1];
                            class51 var420 = (class51) class48.field924.get(var418);
                            class22 var421 = var420.method861(var419);
                            if (var421 == null) {
                                field724[var5++] = -1;
                                field724[var5++] = 0;
                                field725[var6++] = "";
                                field725[var6++] = "";
                                field725[var6++] = "";
                            } else {
                                field724[var5++] = var421.field226;
                                field724[var5++] = var421.field227;
                                field725[var6++] = var421.field230 == null ? "" : var421.field230;
                                field725[var6++] = var421.field234 == null ? "" : var421.field234;
                                field725[var6++] = var421.field231 == null ? "" : var421.field231;
                            }
                            continue;
                        }
                        if (var478 == 5004) {
                            var5--;
                            int var423 = field724[var5];
                            class22 var424 = (class22) class48.field923.method2151((long) var423);
                            if (var424 == null) {
                                field724[var5++] = -1;
                                field724[var5++] = 0;
                                field725[var6++] = "";
                                field725[var6++] = "";
                                field725[var6++] = "";
                            } else {
                                field724[var5++] = var424.field228;
                                field724[var5++] = var424.field227;
                                field725[var6++] = var424.field230 == null ? "" : var424.field230;
                                field725[var6++] = var424.field234 == null ? "" : var424.field234;
                                field725[var6++] = var424.field231 == null ? "" : var424.field231;
                            }
                            continue;
                        }
                        if (var478 == 5005) {
                            if (Statics.field1468 == null) {
                                field724[var5++] = -1;
                            } else {
                                field724[var5++] = Statics.field1468.field3162;
                            }
                            continue;
                        }
                        if (var478 == 5008) {
                            var6--;
                            String var426 = field725[var6];
                            var5--;
                            int var427 = field724[var5];
                            String var428 = var426.toLowerCase();
                            byte var429 = 0;
                            if (var428.startsWith(class174.field2425)) {
                                var429 = 0;
                                var426 = var426.substring(class174.field2425.length());
                            } else if (var428.startsWith(class174.field2490)) {
                                var429 = 1;
                                var426 = var426.substring(class174.field2490.length());
                            } else if (var428.startsWith(class174.field2516)) {
                                var429 = 2;
                                var426 = var426.substring(class174.field2516.length());
                            } else if (var428.startsWith(class174.field2568)) {
                                var429 = 3;
                                var426 = var426.substring(class174.field2568.length());
                            } else if (var428.startsWith(class174.field2375)) {
                                var429 = 4;
                                var426 = var426.substring(class174.field2375.length());
                            } else if (var428.startsWith(class174.field2522)) {
                                var429 = 5;
                                var426 = var426.substring(class174.field2522.length());
                            } else if (var428.startsWith(class174.field2381)) {
                                var429 = 6;
                                var426 = var426.substring(class174.field2381.length());
                            } else if (var428.startsWith(class174.field2526)) {
                                var429 = 7;
                                var426 = var426.substring(class174.field2526.length());
                            } else if (var428.startsWith(class174.field2528)) {
                                var429 = 8;
                                var426 = var426.substring(class174.field2528.length());
                            } else if (var428.startsWith(class174.field2524)) {
                                var429 = 9;
                                var426 = var426.substring(class174.field2524.length());
                            } else if (var428.startsWith(class174.field2582)) {
                                var429 = 10;
                                var426 = var426.substring(class174.field2582.length());
                            } else if (var428.startsWith(class174.field2511)) {
                                var429 = 11;
                                var426 = var426.substring(class174.field2511.length());
                            } else if (client.field473 != 0) {
                                if (var428.startsWith(class174.field2513)) {
                                    var429 = 0;
                                    var426 = var426.substring(class174.field2513.length());
                                } else if (var428.startsWith(class174.field2454)) {
                                    var429 = 1;
                                    var426 = var426.substring(class174.field2454.length());
                                } else if (var428.startsWith(class174.field2611)) {
                                    var429 = 2;
                                    var426 = var426.substring(class174.field2611.length());
                                } else if (var428.startsWith(class174.field2519)) {
                                    var429 = 3;
                                    var426 = var426.substring(class174.field2519.length());
                                } else if (var428.startsWith(class174.field2521)) {
                                    var429 = 4;
                                    var426 = var426.substring(class174.field2521.length());
                                } else if (var428.startsWith(class174.field2531)) {
                                    var429 = 5;
                                    var426 = var426.substring(class174.field2531.length());
                                } else if (var428.startsWith(class174.field2455)) {
                                    var429 = 6;
                                    var426 = var426.substring(class174.field2455.length());
                                } else if (var428.startsWith(class174.field2396)) {
                                    var429 = 7;
                                    var426 = var426.substring(class174.field2396.length());
                                } else if (var428.startsWith(class174.field2529)) {
                                    var429 = 8;
                                    var426 = var426.substring(class174.field2529.length());
                                } else if (var428.startsWith(class174.field2458)) {
                                    var429 = 9;
                                    var426 = var426.substring(class174.field2458.length());
                                } else if (var428.startsWith(class174.field2429)) {
                                    var429 = 10;
                                    var426 = var426.substring(class174.field2429.length());
                                } else if (var428.startsWith(class174.field2535)) {
                                    var429 = 11;
                                    var426 = var426.substring(class174.field2535.length());
                                }
                            }
                            String var430 = var426.toLowerCase();
                            byte var431 = 0;
                            if (var430.startsWith(class174.field2536)) {
                                var431 = 1;
                                var426 = var426.substring(class174.field2536.length());
                            } else if (var430.startsWith(class174.field2538)) {
                                var431 = 2;
                                var426 = var426.substring(class174.field2538.length());
                            } else if (var430.startsWith(class174.field2540)) {
                                var431 = 3;
                                var426 = var426.substring(class174.field2540.length());
                            } else if (var430.startsWith(class174.field2542)) {
                                var431 = 4;
                                var426 = var426.substring(class174.field2542.length());
                            } else if (var430.startsWith(class174.field2544)) {
                                var431 = 5;
                                var426 = var426.substring(class174.field2544.length());
                            } else if (client.field473 != 0) {
                                if (var430.startsWith(class174.field2537)) {
                                    var431 = 1;
                                    var426 = var426.substring(class174.field2537.length());
                                } else if (var430.startsWith(class174.field2357)) {
                                    var431 = 2;
                                    var426 = var426.substring(class174.field2357.length());
                                } else if (var430.startsWith(class174.field2541)) {
                                    var431 = 3;
                                    var426 = var426.substring(class174.field2541.length());
                                } else if (var430.startsWith(class174.field2543)) {
                                    var431 = 4;
                                    var426 = var426.substring(class174.field2543.length());
                                } else if (var430.startsWith(class174.field2545)) {
                                    var431 = 5;
                                    var426 = var426.substring(class174.field2545.length());
                                }
                            }
                            client.field327.method2832(174);
                            client.field327.method2573(0);
                            int var432 = client.field327.field2073;
                            client.field327.method2573(var427);
                            client.field327.method2573(var429);
                            client.field327.method2573(var431);
                            class160 var433 = client.field327;
                            int var434 = var433.field2073;
                            byte[] var435 = class204.method3152(var426);
                            var433.method2713(var435.length);
                            var433.field2073 += Statics.field3107.method2522(var435, 0, var435.length, var433.field2078, var433.field2073);
                            client.field327.method2585(client.field327.field2073 - var432);
                            continue;
                        }
                        if (var478 == 5009) {
                            var6 -= 2;
                            String var436 = field725[var6];
                            String var437 = field725[var6 + 1];
                            client.field327.method2832(65);
                            client.field327.method2731(0);
                            int var438 = client.field327.field2073;
                            client.field327.method2624(var436);
                            class160 var439 = client.field327;
                            int var440 = var439.field2073;
                            byte[] var441 = class204.method3152(var437);
                            var439.method2713(var441.length);
                            var439.field2073 += Statics.field3107.method2522(var441, 0, var441.length, var439.field2078, var439.field2073);
                            client.field327.method2584(client.field327.field2073 - var438);
                            continue;
                        }
                        if (var478 == 5015) {
                            String var442;
                            if (Statics.field2019 == null || Statics.field2019.field244 == null) {
                                var442 = "";
                            } else {
                                var442 = Statics.field2019.field244;
                            }
                            field725[var6++] = var442;
                            continue;
                        }
                        if (var478 == 5016) {
                            field724[var5++] = client.field500;
                            continue;
                        }
                        if (var478 == 5017) {
                            var5--;
                            int var443 = field724[var5];
                            int[] var444 = field724;
                            int var445 = var5++;
                            class51 var446 = (class51) class48.field924.get(var443);
                            int var447;
                            if (var446 == null) {
                                var447 = 0;
                            } else {
                                var447 = var446.method862();
                            }
                            var444[var445] = var447;
                            continue;
                        }
                        if (var478 == 5018) {
                            var5--;
                            int var448 = field724[var5];
                            field724[var5++] = class48.method3271(var448);
                            continue;
                        }
                        if (var478 == 5019) {
                            var5--;
                            int var449 = field724[var5];
                            int[] var450 = field724;
                            int var451 = var5++;
                            class22 var452 = (class22) class48.field923.method2151((long) var449);
                            int var453;
                            if (var452 == null) {
                                var453 = -1;
                            } else if (class48.field922.field1887 == var452.field1872) {
                                var453 = -1;
                            } else {
                                var453 = ((class22) var452.field1872).field226;
                            }
                            var450[var451] = var453;
                            continue;
                        }
                        if (var478 == 5020) {
                            var6--;
                            String var454 = field725[var6];
                            if (var454.equalsIgnoreCase("toggleroof")) {
                                Statics.field22.field691 = !Statics.field22.field691;
                                class31.method109();
                                if (Statics.field22.field691) {
                                    class48.method100(99, "", "Roofs are now all hidden");
                                } else {
                                    class48.method100(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var454.equalsIgnoreCase("displayfps")) {
                                client.field297 = !client.field297;
                            }
                            if (client.field353 >= 2) {
                                if (var454.equalsIgnoreCase("fpson")) {
                                    client.field297 = true;
                                }
                                if (var454.equalsIgnoreCase("fpsoff")) {
                                    client.field297 = false;
                                }
                                if (var454.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var454.equalsIgnoreCase("clientdrop")) {
                                    client.method1775();
                                }
                                if (var454.equalsIgnoreCase("errortest") && client.field417 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field327.method2832(64);
                            client.field327.method2573(var454.length() + 1);
                            client.field327.method2624(var454);
                            continue;
                        }
                        if (var478 == 5021) {
                            var6--;
                            client.field555 = field725[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var478 == 5022) {
                            field725[var6++] = client.field555;
                            continue;
                        }
                    }
                } else {
                    class170 var87;
                    if (var478 >= 2000) {
                        var478 -= 1000;
                        var5--;
                        var87 = class170.method786(field724[var5]);
                    } else {
                        var87 = var58 ? Statics.field188 : Statics.field790;
                    }
                    if (var478 == 1300) {
                        var5--;
                        int var88 = field724[var5] - 1;
                        if (var88 >= 0 && var88 <= 9) {
                            var6--;
                            var87.method2977(var88, field725[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var478 == 1301) {
                        var5 -= 2;
                        int var89 = field724[var5];
                        int var90 = field724[var5 + 1];
                        var87.field2261 = class170.method2816(var89, var90);
                        continue;
                    }
                    if (var478 == 1302) {
                        var5--;
                        var87.field2264 = field724[var5] == 1;
                        continue;
                    }
                    if (var478 == 1303) {
                        var5--;
                        var87.field2262 = field724[var5];
                        continue;
                    }
                    if (var478 == 1304) {
                        var5--;
                        var87.field2263 = field724[var5];
                        continue;
                    }
                    if (var478 == 1305) {
                        var6--;
                        var87.field2259 = field725[var6];
                        continue;
                    }
                    if (var478 == 1306) {
                        var6--;
                        var87.field2265 = field725[var6];
                        continue;
                    }
                    if (var478 == 1307) {
                        var87.field2260 = null;
                        continue;
                    }
                }
                if (var478 < 5400) {
                    if (var478 == 5306) {
                        field724[var5++] = client.method3134();
                        continue;
                    }
                    if (var478 == 5307) {
                        var5--;
                        int var455 = field724[var5];
                        if (var455 != 1 && var455 != 2) {
                            continue;
                        }
                        client.field380 = 0L;
                        if (var455 >= 2) {
                            client.field495 = true;
                        } else {
                            client.field495 = false;
                        }
                        client.method680();
                        if (client.field289 >= 25) {
                            client.field327.method2832(112);
                            client.field327.method2573(client.method3134());
                            client.field327.method2731(Statics.field2);
                            client.field327.method2731(Statics.field1100);
                        }
                        class114.field1769 = true;
                        continue;
                    }
                    if (var478 == 5308) {
                        field724[var5++] = Statics.field22.field688;
                        continue;
                    }
                    if (var478 == 5309) {
                        var5--;
                        int var456 = field724[var5];
                        if (var456 == 1 || var456 == 2) {
                            Statics.field22.field688 = var456;
                            class31.method109();
                        }
                        continue;
                    }
                }
                if (var478 < 5600) {
                    if (var478 == 5504) {
                        var5 -= 2;
                        int var457 = field724[var5];
                        int var458 = field724[var5 + 1];
                        if (!client.field530) {
                            client.field521 = var457;
                            client.field368 = var458;
                        }
                        continue;
                    }
                    if (var478 == 5505) {
                        field724[var5++] = client.field521;
                        continue;
                    }
                    if (var478 == 5506) {
                        field724[var5++] = client.field368;
                        continue;
                    }
                    if (var478 == 5530) {
                        var5--;
                        int var459 = field724[var5];
                        if (var459 < 0) {
                            var459 = 0;
                        }
                        client.field373 = var459;
                        continue;
                    }
                    if (var478 == 5531) {
                        field724[var5++] = client.field373;
                        continue;
                    }
                }
                if (var478 >= 5700 || var478 != 5630) {
                    if (var478 < 6300) {
                        if (var478 == 6200) {
                            var5 -= 2;
                            client.field536 = (short) field724[var5];
                            if (client.field536 <= 0) {
                                client.field536 = 256;
                            }
                            client.field537 = (short) field724[var5 + 1];
                            if (client.field537 <= 0) {
                                client.field537 = 205;
                            }
                            continue;
                        }
                        if (var478 == 6201) {
                            var5 -= 2;
                            client.field390 = (short) field724[var5];
                            if (client.field390 <= 0) {
                                client.field390 = 256;
                            }
                            client.field539 = (short) field724[var5 + 1];
                            if (client.field539 <= 0) {
                                client.field539 = 320;
                            }
                            continue;
                        }
                        if (var478 == 6202) {
                            var5 -= 4;
                            client.field540 = (short) field724[var5];
                            if (client.field540 <= 0) {
                                client.field540 = 1;
                            }
                            client.field541 = (short) field724[var5 + 1];
                            if (client.field541 <= 0) {
                                client.field541 = 32767;
                            } else if (client.field541 < client.field540) {
                                client.field541 = client.field540;
                            }
                            client.field542 = (short) field724[var5 + 2];
                            if (client.field542 <= 0) {
                                client.field542 = 1;
                            }
                            client.field514 = (short) field724[var5 + 3];
                            if (client.field514 <= 0) {
                                client.field514 = 32767;
                            } else if (client.field514 < client.field542) {
                                client.field514 = client.field542;
                            }
                            continue;
                        }
                        if (var478 == 6203) {
                            if (client.field453 == null) {
                                field724[var5++] = -1;
                                field724[var5++] = -1;
                            } else {
                                client.method3490(0, 0, client.field453.field2201, client.field453.field2202, false);
                                field724[var5++] = client.field443;
                                field724[var5++] = client.field547;
                            }
                            continue;
                        }
                        if (var478 == 6204) {
                            field724[var5++] = client.field390;
                            field724[var5++] = client.field539;
                            continue;
                        }
                        if (var478 == 6205) {
                            field724[var5++] = client.field536;
                            field724[var5++] = client.field537;
                            continue;
                        }
                    }
                    if (var478 < 6600) {
                        if (var478 == 6500) {
                            field724[var5++] = class30.method1785() ? 1 : 0;
                            continue;
                        }
                        if (var478 == 6501) {
                            class30.field676 = 0;
                            class30 var460;
                            if (class30.field676 < class30.field685) {
                                var460 = Statics.field674[++class30.field676 - 1];
                            } else {
                                var460 = null;
                            }
                            if (var460 == null) {
                                field724[var5++] = -1;
                                field724[var5++] = 0;
                                field725[var6++] = "";
                                field724[var5++] = 0;
                                field724[var5++] = 0;
                                field725[var6++] = "";
                            } else {
                                field724[var5++] = var460.field679;
                                field724[var5++] = var460.field678;
                                field725[var6++] = var460.field683;
                                field724[var5++] = var460.field684;
                                field724[var5++] = var460.field680;
                                field725[var6++] = var460.field682;
                            }
                            continue;
                        }
                        if (var478 == 6502) {
                            class30 var463;
                            if (class30.field676 < class30.field685) {
                                var463 = Statics.field674[++class30.field676 - 1];
                            } else {
                                var463 = null;
                            }
                            if (var463 == null) {
                                field724[var5++] = -1;
                                field724[var5++] = 0;
                                field725[var6++] = "";
                                field724[var5++] = 0;
                                field724[var5++] = 0;
                                field725[var6++] = "";
                            } else {
                                field724[var5++] = var463.field679;
                                field724[var5++] = var463.field678;
                                field725[var6++] = var463.field683;
                                field724[var5++] = var463.field684;
                                field724[var5++] = var463.field680;
                                field725[var6++] = var463.field682;
                            }
                            continue;
                        }
                        if (var478 == 6506) {
                            var5--;
                            int var465 = field724[var5];
                            class30 var466 = null;
                            for (int var467 = 0; var467 < class30.field685; var467++) {
                                if (Statics.field674[var467].field679 == var465) {
                                    var466 = Statics.field674[var467];
                                    break;
                                }
                            }
                            if (var466 == null) {
                                field724[var5++] = -1;
                                field724[var5++] = 0;
                                field725[var6++] = "";
                                field724[var5++] = 0;
                                field724[var5++] = 0;
                                field725[var6++] = "";
                            } else {
                                field724[var5++] = var466.field679;
                                field724[var5++] = var466.field678;
                                field725[var6++] = var466.field683;
                                field724[var5++] = var466.field684;
                                field724[var5++] = var466.field680;
                                field725[var6++] = var466.field682;
                            }
                            continue;
                        }
                        if (var478 == 6507) {
                            var5 -= 4;
                            int var468 = field724[var5];
                            boolean var469 = field724[var5 + 1] == 1;
                            int var470 = field724[var5 + 2];
                            boolean var471 = field724[var5 + 3] == 1;
                            class30.method664(var468, var469, var470, var471);
                            continue;
                        }
                        if (var478 == 6511) {
                            var5--;
                            int var472 = field724[var5];
                            if (var472 >= 0 && var472 < class30.field685) {
                                class30 var473 = Statics.field674[var472];
                                field724[var5++] = var473.field679;
                                field724[var5++] = var473.field678;
                                field725[var6++] = var473.field683;
                                field724[var5++] = var473.field684;
                                field724[var5++] = var473.field680;
                                field725[var6++] = var473.field682;
                                continue;
                            }
                            field724[var5++] = -1;
                            field724[var5++] = 0;
                            field725[var6++] = "";
                            field724[var5++] = 0;
                            field724[var5++] = 0;
                            field725[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field337 = 250;
            }
        } catch (Exception var477) {
            StringBuilder var475 = new StringBuilder(30);
            var475.append("").append(var4.field1867).append(" ");
            for (int var476 = field726 - 1; var476 >= 0; var476--) {
                var475.append("").append(field727[var476].field125.field1867).append(" ");
            }
            var475.append("").append(var10);
            class102.method3043(var475.toString(), var477);
        }
    }

    @ObfuscatedName("r.i(II)V")
    public static void method187(int arg0) {
        if (arg0 == -1 || !class170.method1780(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2279[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3.field2267 != null) {
                class19 var4 = new class19();
                var4.field196 = var3;
                var4.field204 = var3.field2267;
                method857(var4, 2000000);
            }
        }
    }
}
