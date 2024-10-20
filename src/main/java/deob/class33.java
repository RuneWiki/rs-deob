package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aj")
public class class33 {

    @ObfuscatedName("aj.g")
    public static int[] field728 = new int[5];

    @ObfuscatedName("aj.n")
    public static int[][] field720 = new int[5][5000];

    @ObfuscatedName("aj.a")
    public static int[] field721 = new int[1000];

    @ObfuscatedName("aj.q")
    public static String[] field722 = new String[1000];

    @ObfuscatedName("aj.w")
    public static int field723 = 0;

    @ObfuscatedName("aj.v")
    public static class12[] field733 = new class12[50];

    @ObfuscatedName("aj.l")
    public static Calendar field726 = Calendar.getInstance();

    @ObfuscatedName("aj.c")
    public static final String[] field727 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("aj.m")
    public static int field729 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.i(Lx;I)V")
    public static void method192(class19 arg0) {
        method84(arg0, 200000);
    }

    @ObfuscatedName("a.e(Lx;II)V")
    public static void method84(class19 arg0, int arg1) {
        Object[] var2 = arg0.field189;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method2780(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field951;
        int[] var9 = var4.field949;
        byte var10 = -1;
        field723 = 0;
        try {
            Statics.field2194 = new int[var4.field953];
            int var11 = 0;
            Statics.field725 = new String[var4.field956];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field193;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field190;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field188 == null ? -1 : arg0.field188.field2209;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field199;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field188 == null ? -1 : arg0.field188.field2334;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field197 == null ? -1 : arg0.field197.field2209;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field197 == null ? -1 : arg0.field197.field2334;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field191;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field194;
                    }
                    Statics.field2194[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field195;
                    }
                    Statics.field725[var12++] = var15;
                }
            }
            int var16 = 0;
            field729 = arg0.field196;
            label3224: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var501 = var8[var7];
                if (var501 < 100) {
                    if (var501 == 0) {
                        field721[var5++] = var9[var7];
                        continue;
                    }
                    if (var501 == 1) {
                        int var17 = var9[var7];
                        field721[var5++] = class166.field2169[var17];
                        continue;
                    }
                    if (var501 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class166.field2169[var18] = field721[var5];
                        client.method820(var18);
                        continue;
                    }
                    if (var501 == 3) {
                        field722[var6++] = var4.field952[var7];
                        continue;
                    }
                    if (var501 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var501 == 7) {
                        var5 -= 2;
                        if (field721[var5 + 1] != field721[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var501 == 8) {
                        var5 -= 2;
                        if (field721[var5 + 1] == field721[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var501 == 9) {
                        var5 -= 2;
                        if (field721[var5] < field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var501 == 10) {
                        var5 -= 2;
                        if (field721[var5] > field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var501 == 21) {
                        if (field723 == 0) {
                            return;
                        }
                        class12 var19 = field733[--field723];
                        var4 = var19.field119;
                        var8 = var4.field951;
                        var9 = var4.field949;
                        var7 = var19.field116;
                        Statics.field2194 = var19.field112;
                        Statics.field725 = var19.field113;
                        continue;
                    }
                    if (var501 == 25) {
                        int var20 = var9[var7];
                        field721[var5++] = class166.method1794(var20);
                        continue;
                    }
                    if (var501 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class166.method635(var21, field721[var5]);
                        continue;
                    }
                    if (var501 == 31) {
                        var5 -= 2;
                        if (field721[var5] <= field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var501 == 32) {
                        var5 -= 2;
                        if (field721[var5] >= field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var501 == 33) {
                        field721[var5++] = Statics.field2194[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var501 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2194[var10001] = field721[var5];
                        continue;
                    }
                    if (var501 == 35) {
                        field722[var6++] = Statics.field725[var9[var7]];
                        continue;
                    }
                    if (var501 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field725[var10001] = field722[var6];
                        continue;
                    }
                    if (var501 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field722;
                        String var24;
                        if (var22 == 0) {
                            var24 = "";
                        } else if (var22 == 1) {
                            String var25 = var23[var6];
                            if (var25 == null) {
                                var24 = "null";
                            } else {
                                var24 = var25.toString();
                            }
                        } else {
                            int var26 = var6 + var22;
                            int var27 = 0;
                            for (int var28 = var6; var28 < var26; var28++) {
                                String var29 = var23[var28];
                                if (var29 == null) {
                                    var27 += 4;
                                } else {
                                    var27 += var29.length();
                                }
                            }
                            StringBuilder var30 = new StringBuilder(var27);
                            for (int var31 = var6; var31 < var26; var31++) {
                                String var32 = var23[var31];
                                if (var32 == null) {
                                    var30.append("null");
                                } else {
                                    var30.append(var32);
                                }
                            }
                            var24 = var30.toString();
                        }
                        field722[var6++] = var24;
                        continue;
                    }
                    if (var501 == 38) {
                        var5--;
                        continue;
                    }
                    if (var501 == 39) {
                        var6--;
                        continue;
                    }
                    if (var501 == 40) {
                        int var34 = var9[var7];
                        class49 var35 = class49.method2780(var34);
                        int[] var36 = new int[var35.field953];
                        String[] var37 = new String[var35.field956];
                        for (int var38 = 0; var38 < var35.field955; var38++) {
                            var36[var38] = field721[var5 - var35.field955 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field950; var39++) {
                            var37[var39] = field722[var6 - var35.field950 + var39];
                        }
                        var5 -= var35.field955;
                        var6 -= var35.field950;
                        class12 var40 = new class12();
                        var40.field119 = var4;
                        var40.field116 = var7;
                        var40.field112 = Statics.field2194;
                        var40.field113 = Statics.field725;
                        field733[++field723 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field951;
                        var9 = var35.field949;
                        var7 = -1;
                        Statics.field2194 = var36;
                        Statics.field725 = var37;
                        continue;
                    }
                    if (var501 == 42) {
                        field721[var5++] = Statics.field203.method790(var9[var7]);
                        continue;
                    }
                    if (var501 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field203.method796(var10001, field721[var5]);
                        continue;
                    }
                    if (var501 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field721[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field728[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label3224;
                                }
                                field720[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var501 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field721[var5];
                        if (var47 >= 0 && var47 < field728[var46]) {
                            field721[var5++] = field720[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var501 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field721[var5];
                        if (var49 >= 0 && var49 < field728[var48]) {
                            field720[var48][var49] = field721[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var501 == 47) {
                        String var50 = Statics.field203.method791(var9[var7]);
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field722[var6++] = var50;
                        continue;
                    }
                    if (var501 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field203.method817(var10001, field722[var6]);
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var501 < 1000) {
                    if (var501 == 100) {
                        var5 -= 3;
                        int var52 = field721[var5];
                        int var53 = field721[var5 + 1];
                        int var54 = field721[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class170 var55 = class170.method3227(var52);
                        if (var55.field2333 == null) {
                            var55.field2333 = new class170[var54 + 1];
                        }
                        if (var55.field2333.length <= var54) {
                            class170[] var56 = new class170[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2333.length; var57++) {
                                var56[var57] = var55.field2333[var57];
                            }
                            var55.field2333 = var56;
                        }
                        if (var54 > 0 && var55.field2333[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class170 var58 = new class170();
                        var58.field2211 = var53;
                        var58.field2327 = var58.field2209 = var55.field2209;
                        var58.field2334 = var54;
                        var58.field2199 = true;
                        var55.field2333[var54] = var58;
                        if (var51) {
                            Statics.field1539 = var58;
                        } else {
                            Statics.field719 = var58;
                        }
                        client.method1788(var55);
                        continue;
                    }
                    if (var501 == 101) {
                        class170 var59 = var51 ? Statics.field1539 : Statics.field719;
                        class170 var60 = class170.method3227(var59.field2209);
                        var60.field2333[var59.field2334] = null;
                        client.method1788(var60);
                        continue;
                    }
                    if (var501 == 102) {
                        var5--;
                        class170 var61 = class170.method3227(field721[var5]);
                        var61.field2333 = null;
                        client.method1788(var61);
                        continue;
                    }
                    if (var501 == 200) {
                        var5 -= 2;
                        int var62 = field721[var5];
                        int var63 = field721[var5 + 1];
                        class170 var64 = class170.method562(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field721[var5++] = 1;
                            if (var51) {
                                Statics.field1539 = var64;
                            } else {
                                Statics.field719 = var64;
                            }
                            continue;
                        }
                        field721[var5++] = 0;
                        continue;
                    }
                    if (var501 == 201) {
                        var5--;
                        class170 var65 = class170.method3227(field721[var5]);
                        if (var65 == null) {
                            field721[var5++] = 0;
                        } else {
                            field721[var5++] = 1;
                            if (var51) {
                                Statics.field1539 = var65;
                            } else {
                                Statics.field719 = var65;
                            }
                        }
                        continue;
                    }
                } else if (!(var501 < 1000 || var501 >= 1100) || !(var501 < 2000 || var501 >= 2100)) {
                    int var66 = -1;
                    class170 var67;
                    if (var501 >= 2000) {
                        var501 -= 1000;
                        var5--;
                        var66 = field721[var5];
                        var67 = class170.method3227(var66);
                    } else {
                        var67 = var51 ? Statics.field1539 : Statics.field719;
                    }
                    if (var501 == 1000) {
                        var5 -= 4;
                        var67.field2289 = field721[var5];
                        var67.field2219 = field721[var5 + 1];
                        var67.field2214 = field721[var5 + 2];
                        var67.field2215 = field721[var5 + 3];
                        client.method1788(var67);
                        client.method1609(var67);
                        if (var66 != -1 && var67.field2211 == 0) {
                            client.method19(Statics.field2298[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var501 == 1001) {
                        var5 -= 4;
                        var67.field2220 = field721[var5];
                        var67.field2221 = field721[var5 + 1];
                        var67.field2216 = field721[var5 + 2];
                        var67.field2265 = field721[var5 + 3];
                        client.method1788(var67);
                        client.method1609(var67);
                        if (var66 != -1 && var67.field2211 == 0) {
                            client.method19(Statics.field2298[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var501 == 1003) {
                        var5--;
                        boolean var68 = field721[var5] == 1;
                        if (var67.field2315 != var68) {
                            var67.field2315 = var68;
                            client.method1788(var67);
                        }
                        continue;
                    }
                    if (var501 == 1005) {
                        var5--;
                        var67.field2342 = field721[var5] == 1;
                        continue;
                    }
                    if (var501 == 1006) {
                        var5--;
                        var67.field2343 = field721[var5] == 1;
                        continue;
                    }
                } else if (!(var501 < 1100 || var501 >= 1200) || !(var501 < 2100 || var501 >= 2200)) {
                    int var69 = -1;
                    class170 var70;
                    if (var501 >= 2000) {
                        var501 -= 1000;
                        var5--;
                        var69 = field721[var5];
                        var70 = class170.method3227(var69);
                    } else {
                        var70 = var51 ? Statics.field1539 : Statics.field719;
                    }
                    if (var501 == 1100) {
                        var5 -= 2;
                        var70.field2268 = field721[var5];
                        if (var70.field2268 > var70.field2232 - var70.field2264) {
                            var70.field2268 = var70.field2232 - var70.field2264;
                        }
                        if (var70.field2268 < 0) {
                            var70.field2268 = 0;
                        }
                        var70.field2231 = field721[var5 + 1];
                        if (var70.field2231 > var70.field2233 - var70.field2225) {
                            var70.field2231 = var70.field2233 - var70.field2225;
                        }
                        if (var70.field2231 < 0) {
                            var70.field2231 = 0;
                        }
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1101) {
                        var5--;
                        var70.field2234 = field721[var5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1102) {
                        var5--;
                        var70.field2238 = field721[var5] == 1;
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1103) {
                        var5--;
                        var70.field2241 = field721[var5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1104) {
                        var5--;
                        var70.field2240 = field721[var5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1105) {
                        var5--;
                        var70.field2244 = field721[var5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1106) {
                        var5--;
                        var70.field2246 = field721[var5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1107) {
                        var5--;
                        var70.field2247 = field721[var5] == 1;
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1108) {
                        var70.field2306 = 1;
                        var5--;
                        var70.field2253 = field721[var5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1109) {
                        var5 -= 6;
                        var70.field2284 = field721[var5];
                        var70.field2259 = field721[var5 + 1];
                        var70.field2258 = field721[var5 + 2];
                        var70.field2261 = field721[var5 + 3];
                        var70.field2210 = field721[var5 + 4];
                        var70.field2263 = field721[var5 + 5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1110) {
                        var5--;
                        int var71 = field721[var5];
                        if (var70.field2256 != var71) {
                            var70.field2256 = var71;
                            var70.field2331 = 0;
                            var70.field2252 = 0;
                            client.method1788(var70);
                        }
                        continue;
                    }
                    if (var501 == 1111) {
                        var5--;
                        var70.field2266 = field721[var5] == 1;
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1112) {
                        var6--;
                        String var72 = field722[var6];
                        if (!var72.equals(var70.field2255)) {
                            var70.field2255 = var72;
                            client.method1788(var70);
                        }
                        continue;
                    }
                    if (var501 == 1113) {
                        var5--;
                        var70.field2218 = field721[var5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1114) {
                        var5 -= 3;
                        var70.field2272 = field721[var5];
                        var70.field2203 = field721[var5 + 1];
                        var70.field2277 = field721[var5 + 2];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1115) {
                        var5--;
                        var70.field2274 = field721[var5] == 1;
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1116) {
                        var5--;
                        var70.field2248 = field721[var5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1117) {
                        var5--;
                        var70.field2249 = field721[var5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1118) {
                        var5--;
                        var70.field2250 = field721[var5] == 1;
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1119) {
                        var5--;
                        var70.field2251 = field721[var5] == 1;
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1120) {
                        var5 -= 2;
                        var70.field2232 = field721[var5];
                        var70.field2233 = field721[var5 + 1];
                        client.method1788(var70);
                        if (var69 != -1 && var70.field2211 == 0) {
                            client.method19(Statics.field2298[var69 >> 16], var70, false);
                        }
                        continue;
                    }
                    if (var501 == 1121) {
                        int var73 = var70.field2209;
                        int var74 = var70.field2334;
                        client.field295.method2783(52);
                        client.field295.method2562(var73);
                        client.field295.method2577(var74);
                        client.field451 = var70;
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1122) {
                        var5--;
                        var70.field2332 = field721[var5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1123) {
                        var5--;
                        var70.field2235 = field721[var5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1124) {
                        var5--;
                        var70.field2271 = field721[var5];
                        client.method1788(var70);
                        continue;
                    }
                    if (var501 == 1125) {
                        var5--;
                        int var75 = field721[var5];
                        class222 var76 = (class222) class149.method162(class222.method1102(), var75);
                        if (var76 != null) {
                            var70.field2205 = var76;
                            client.method1788(var70);
                        }
                        continue;
                    }
                } else if (!(var501 < 1200 || var501 >= 1300) || !(var501 < 2200 || var501 >= 2300)) {
                    class170 var77;
                    if (var501 >= 2000) {
                        var501 -= 1000;
                        var5--;
                        var77 = class170.method3227(field721[var5]);
                    } else {
                        var77 = var51 ? Statics.field1539 : Statics.field719;
                    }
                    client.method1788(var77);
                    if (var501 == 1200 || var501 == 1205 || var501 == 1212) {
                        var5 -= 2;
                        int var78 = field721[var5];
                        int var79 = field721[var5 + 1];
                        var77.field2329 = var78;
                        var77.field2294 = var79;
                        class199 var80 = class199.method96(var78);
                        var77.field2258 = var80.field2961;
                        var77.field2261 = var80.field2954;
                        var77.field2210 = var80.field2963;
                        var77.field2284 = var80.field2978;
                        var77.field2259 = var80.field2965;
                        var77.field2263 = var80.field2960;
                        if (var501 == 1205) {
                            var77.field2267 = 0;
                        } else if (var501 == 1212 | var80.field2979 == 1) {
                            var77.field2267 = 1;
                        } else {
                            var77.field2267 = 2;
                        }
                        if (var77.field2293 > 0) {
                            var77.field2263 = var77.field2263 * 32 / var77.field2293;
                        } else if (var77.field2220 > 0) {
                            var77.field2263 = var77.field2263 * 32 / var77.field2220;
                        }
                        continue;
                    }
                    if (var501 == 1201) {
                        var77.field2306 = 2;
                        var5--;
                        var77.field2253 = field721[var5];
                        continue;
                    }
                    if (var501 == 1202) {
                        var77.field2306 = 3;
                        var77.field2253 = Statics.field810.field269.method2894();
                        continue;
                    }
                } else if ((var501 < 1300 || var501 >= 1400) && (var501 < 2300 || var501 >= 2400)) {
                    if (var501 >= 1400 && var501 < 1500 || var501 >= 2400 && var501 < 2500) {
                        class170 var85;
                        if (var501 >= 2000) {
                            var501 -= 1000;
                            var5--;
                            var85 = class170.method3227(field721[var5]);
                        } else {
                            var85 = var51 ? Statics.field1539 : Statics.field719;
                        }
                        var6--;
                        String var86 = field722[var6];
                        int[] var87 = null;
                        if (var86.length() > 0 && var86.charAt(var86.length() - 1) == 'Y') {
                            var5--;
                            int var88 = field721[var5];
                            if (var88 > 0) {
                                var87 = new int[var88];
                                while (var88-- > 0) {
                                    var5--;
                                    var87[var88] = field721[var5];
                                }
                            }
                            var86 = var86.substring(0, var86.length() - 1);
                        }
                        Object[] var89 = new Object[var86.length() + 1];
                        for (int var90 = var89.length - 1; var90 >= 1; var90--) {
                            if (var86.charAt(var90 - 1) == 's') {
                                var6--;
                                var89[var90] = field722[var6];
                            } else {
                                var5--;
                                var89[var90] = Integer.valueOf(field721[var5]);
                            }
                        }
                        var5--;
                        int var91 = field721[var5];
                        if (var91 == -1) {
                            var89 = null;
                        } else {
                            var89[0] = Integer.valueOf(var91);
                        }
                        if (var501 == 1400) {
                            var85.field2291 = var89;
                        }
                        if (var501 == 1401) {
                            var85.field2228 = var89;
                        }
                        if (var501 == 1402) {
                            var85.field2208 = var89;
                        }
                        if (var501 == 1403) {
                            var85.field2295 = var89;
                        }
                        if (var501 == 1404) {
                            var85.field2296 = var89;
                        }
                        if (var501 == 1405) {
                            var85.field2319 = var89;
                        }
                        if (var501 == 1406) {
                            var85.field2297 = var89;
                        }
                        if (var501 == 1407) {
                            var85.field2302 = var89;
                            var85.field2303 = var87;
                        }
                        if (var501 == 1408) {
                            var85.field2308 = var89;
                        }
                        if (var501 == 1409) {
                            var85.field2309 = var89;
                        }
                        if (var501 == 1410) {
                            var85.field2299 = var89;
                        }
                        if (var501 == 1411) {
                            var85.field2292 = var89;
                        }
                        if (var501 == 1412) {
                            var85.field2260 = var89;
                        }
                        if (var501 == 1414) {
                            var85.field2304 = var89;
                            var85.field2305 = var87;
                        }
                        if (var501 == 1415) {
                            var85.field2217 = var89;
                            var85.field2242 = var87;
                        }
                        if (var501 == 1416) {
                            var85.field2335 = var89;
                        }
                        if (var501 == 1417) {
                            var85.field2310 = var89;
                        }
                        if (var501 == 1418) {
                            var85.field2311 = var89;
                        }
                        if (var501 == 1419) {
                            var85.field2312 = var89;
                        }
                        if (var501 == 1420) {
                            var85.field2239 = var89;
                        }
                        if (var501 == 1421) {
                            var85.field2314 = var89;
                        }
                        if (var501 == 1422) {
                            var85.field2338 = var89;
                        }
                        if (var501 == 1423) {
                            var85.field2316 = var89;
                        }
                        if (var501 == 1424) {
                            var85.field2317 = var89;
                        }
                        if (var501 == 1425) {
                            var85.field2269 = var89;
                        }
                        if (var501 == 1426) {
                            var85.field2320 = var89;
                        }
                        if (var501 == 1427) {
                            var85.field2318 = var89;
                        }
                        var85.field2281 = true;
                        continue;
                    }
                    if (var501 < 1600) {
                        class170 var92 = var51 ? Statics.field1539 : Statics.field719;
                        if (var501 == 1500) {
                            field721[var5++] = var92.field2224;
                            continue;
                        }
                        if (var501 == 1501) {
                            field721[var5++] = var92.field2223;
                            continue;
                        }
                        if (var501 == 1502) {
                            field721[var5++] = var92.field2264;
                            continue;
                        }
                        if (var501 == 1503) {
                            field721[var5++] = var92.field2225;
                            continue;
                        }
                        if (var501 == 1504) {
                            field721[var5++] = var92.field2315 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 1505) {
                            field721[var5++] = var92.field2327;
                            continue;
                        }
                    } else if (var501 < 1700) {
                        class170 var93 = var51 ? Statics.field1539 : Statics.field719;
                        if (var501 == 1600) {
                            field721[var5++] = var93.field2268;
                            continue;
                        }
                        if (var501 == 1601) {
                            field721[var5++] = var93.field2231;
                            continue;
                        }
                        if (var501 == 1602) {
                            field722[var6++] = var93.field2255;
                            continue;
                        }
                        if (var501 == 1603) {
                            field721[var5++] = var93.field2232;
                            continue;
                        }
                        if (var501 == 1604) {
                            field721[var5++] = var93.field2233;
                            continue;
                        }
                        if (var501 == 1605) {
                            field721[var5++] = var93.field2263;
                            continue;
                        }
                        if (var501 == 1606) {
                            field721[var5++] = var93.field2258;
                            continue;
                        }
                        if (var501 == 1607) {
                            field721[var5++] = var93.field2210;
                            continue;
                        }
                        if (var501 == 1608) {
                            field721[var5++] = var93.field2261;
                            continue;
                        }
                        if (var501 == 1609) {
                            field721[var5++] = var93.field2241;
                            continue;
                        }
                        if (var501 == 1610) {
                            field721[var5++] = var93.field2271;
                            continue;
                        }
                        if (var501 == 1611) {
                            field721[var5++] = var93.field2234;
                            continue;
                        }
                        if (var501 == 1612) {
                            field721[var5++] = var93.field2235;
                            continue;
                        }
                        if (var501 == 1613) {
                            field721[var5++] = var93.field2205.method707();
                            continue;
                        }
                    } else if (var501 < 1800) {
                        class170 var94 = var51 ? Statics.field1539 : Statics.field719;
                        if (var501 == 1700) {
                            field721[var5++] = var94.field2329;
                            continue;
                        }
                        if (var501 == 1701) {
                            if (var94.field2329 == -1) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = var94.field2294;
                            }
                            continue;
                        }
                        if (var501 == 1702) {
                            field721[var5++] = var94.field2334;
                            continue;
                        }
                    } else if (var501 < 1900) {
                        class170 var95 = var51 ? Statics.field1539 : Statics.field719;
                        if (var501 == 1800) {
                            field721[var5++] = class171.method1929(client.method2479(var95));
                            continue;
                        }
                        if (var501 == 1801) {
                            var5--;
                            int var96 = field721[var5];
                            int var502 = var96 - 1;
                            if (var95.field2283 != null && var502 < var95.field2283.length && var95.field2283[var502] != null) {
                                field722[var6++] = var95.field2283[var502];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var501 == 1802) {
                            if (var95.field2313 == null) {
                                field722[var6++] = "";
                            } else {
                                field722[var6++] = var95.field2313;
                            }
                            continue;
                        }
                    } else if (!(var501 < 1900 || var501 >= 2000) || !(var501 < 2900 || var501 >= 3000)) {
                        class170 var97;
                        if (var501 >= 2000) {
                            var501 -= 1000;
                            var5--;
                            var97 = class170.method3227(field721[var5]);
                        } else {
                            var97 = var51 ? Statics.field1539 : Statics.field719;
                        }
                        if (var501 == 1927) {
                            if (field729 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var97.field2318 == null) {
                                return;
                            }
                            class19 var98 = new class19();
                            var98.field188 = var97;
                            var98.field189 = var97.field2318;
                            var98.field196 = field729 + 1;
                            client.field476.method2226(arg0);
                            continue;
                        }
                    } else if (var501 < 2600) {
                        var5--;
                        class170 var99 = class170.method3227(field721[var5]);
                        if (var501 == 2500) {
                            field721[var5++] = var99.field2224;
                            continue;
                        }
                        if (var501 == 2501) {
                            field721[var5++] = var99.field2223;
                            continue;
                        }
                        if (var501 == 2502) {
                            field721[var5++] = var99.field2264;
                            continue;
                        }
                        if (var501 == 2503) {
                            field721[var5++] = var99.field2225;
                            continue;
                        }
                        if (var501 == 2504) {
                            field721[var5++] = var99.field2315 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 2505) {
                            field721[var5++] = var99.field2327;
                            continue;
                        }
                    } else if (var501 < 2700) {
                        var5--;
                        class170 var100 = class170.method3227(field721[var5]);
                        if (var501 == 2600) {
                            field721[var5++] = var100.field2268;
                            continue;
                        }
                        if (var501 == 2601) {
                            field721[var5++] = var100.field2231;
                            continue;
                        }
                        if (var501 == 2602) {
                            field722[var6++] = var100.field2255;
                            continue;
                        }
                        if (var501 == 2603) {
                            field721[var5++] = var100.field2232;
                            continue;
                        }
                        if (var501 == 2604) {
                            field721[var5++] = var100.field2233;
                            continue;
                        }
                        if (var501 == 2605) {
                            field721[var5++] = var100.field2263;
                            continue;
                        }
                        if (var501 == 2606) {
                            field721[var5++] = var100.field2258;
                            continue;
                        }
                        if (var501 == 2607) {
                            field721[var5++] = var100.field2210;
                            continue;
                        }
                        if (var501 == 2608) {
                            field721[var5++] = var100.field2261;
                            continue;
                        }
                        if (var501 == 2609) {
                            field721[var5++] = var100.field2241;
                            continue;
                        }
                        if (var501 == 2610) {
                            field721[var5++] = var100.field2271;
                            continue;
                        }
                        if (var501 == 2611) {
                            field721[var5++] = var100.field2234;
                            continue;
                        }
                        if (var501 == 2612) {
                            field721[var5++] = var100.field2235;
                            continue;
                        }
                        if (var501 == 2613) {
                            field721[var5++] = var100.field2205.method707();
                            continue;
                        }
                    } else if (var501 < 2800) {
                        if (var501 == 2700) {
                            var5--;
                            class170 var101 = class170.method3227(field721[var5]);
                            field721[var5++] = var101.field2329;
                            continue;
                        }
                        if (var501 == 2701) {
                            var5--;
                            class170 var102 = class170.method3227(field721[var5]);
                            if (var102.field2329 == -1) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = var102.field2294;
                            }
                            continue;
                        }
                        if (var501 == 2702) {
                            var5--;
                            int var103 = field721[var5];
                            class18 var104 = (class18) client.field448.method2161((long) var103);
                            if (var104 == null) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = 1;
                            }
                            continue;
                        }
                        if (var501 == 2706) {
                            field721[var5++] = client.field543;
                            continue;
                        }
                    } else if (var501 < 2900) {
                        var5--;
                        class170 var105 = class170.method3227(field721[var5]);
                        if (var501 == 2800) {
                            field721[var5++] = class171.method1929(client.method2479(var105));
                            continue;
                        }
                        if (var501 == 2801) {
                            var5--;
                            int var106 = field721[var5];
                            int var503 = var106 - 1;
                            if (var105.field2283 != null && var503 < var105.field2283.length && var105.field2283[var503] != null) {
                                field722[var6++] = var105.field2283[var503];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var501 == 2802) {
                            if (var105.field2313 == null) {
                                field722[var6++] = "";
                            } else {
                                field722[var6++] = var105.field2313;
                            }
                            continue;
                        }
                    } else if (var501 < 3200) {
                        if (var501 == 3100) {
                            var6--;
                            String var107 = field722[var6];
                            class48.method3375(0, "", var107);
                            continue;
                        }
                        if (var501 == 3101) {
                            var5 -= 2;
                            client.method39(Statics.field810, field721[var5], field721[var5 + 1]);
                            continue;
                        }
                        if (var501 == 3103) {
                            client.method669();
                            continue;
                        }
                        if (var501 == 3104) {
                            var6--;
                            String var108 = field722[var6];
                            int var109 = 0;
                            boolean var110 = false;
                            boolean var111 = false;
                            int var112 = 0;
                            int var113 = var108.length();
                            int var114 = 0;
                            boolean var116;
                            while (true) {
                                if (var114 >= var113) {
                                    var116 = var111;
                                    break;
                                }
                                label3505: {
                                    char var115 = var108.charAt(var114);
                                    if (var114 == 0) {
                                        if (var115 == '-') {
                                            var110 = true;
                                            break label3505;
                                        }
                                        if (var115 == '+') {
                                            break label3505;
                                        }
                                    }
                                    int var504;
                                    if (var115 >= '0' && var115 <= '9') {
                                        var504 = var115 - '0';
                                    } else if (var115 >= 'A' && var115 <= 'Z') {
                                        var504 = var115 - '7';
                                    } else {
                                        if (var115 < 'a' || var115 > 'z') {
                                            var116 = false;
                                            break;
                                        }
                                        var504 = var115 - 'W';
                                    }
                                    if (var504 >= 10) {
                                        var116 = false;
                                        break;
                                    }
                                    if (var110) {
                                        var504 = -var504;
                                    }
                                    int var117 = var112 * 10 + var504;
                                    if (var117 / 10 != var112) {
                                        var116 = false;
                                        break;
                                    }
                                    var112 = var117;
                                    var111 = true;
                                }
                                var114++;
                            }
                            if (var116) {
                                var109 = class208.method2997(var108);
                            }
                            client.field295.method2783(54);
                            client.field295.method2562(var109);
                            continue;
                        }
                        if (var501 == 3105) {
                            var6--;
                            String var119 = field722[var6];
                            client.field295.method2783(100);
                            client.field295.method2746(var119.length() + 1);
                            client.field295.method2571(var119);
                            continue;
                        }
                        if (var501 == 3106) {
                            var6--;
                            String var120 = field722[var6];
                            client.field295.method2783(145);
                            client.field295.method2746(var120.length() + 1);
                            client.field295.method2571(var120);
                            continue;
                        }
                        if (var501 == 3107) {
                            var5--;
                            int var121 = field721[var5];
                            var6--;
                            String var122 = field722[var6];
                            client.method190(var121, var122);
                            continue;
                        }
                        if (var501 == 3108) {
                            var5 -= 3;
                            int var123 = field721[var5];
                            int var124 = field721[var5 + 1];
                            int var125 = field721[var5 + 2];
                            class170 var126 = class170.method3227(var125);
                            client.method1792(var126, var123, var124);
                            continue;
                        }
                        if (var501 == 3109) {
                            var5 -= 2;
                            int var127 = field721[var5];
                            int var128 = field721[var5 + 1];
                            class170 var129 = var51 ? Statics.field1539 : Statics.field719;
                            client.method1792(var129, var127, var128);
                            continue;
                        }
                        if (var501 == 3110) {
                            var5--;
                            Statics.field1663 = field721[var5] == 1;
                            continue;
                        }
                        if (var501 == 3111) {
                            field721[var5++] = Statics.field2045.field690 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3112) {
                            var5--;
                            Statics.field2045.field690 = field721[var5] == 1;
                            class31.method748();
                            continue;
                        }
                        if (var501 == 3113) {
                            var6--;
                            String var130 = field722[var6];
                            var5--;
                            boolean var131 = field721[var5] == 1;
                            if (!var131) {
                                class115.method1450(var130, 3);
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var130));
                                    continue;
                                } catch (Exception var499) {
                                }
                            }
                            if (class115.field1785.startsWith("win")) {
                                class115.method1450(var130, 0);
                            } else if (class115.field1785.startsWith("mac")) {
                                class115.method678(var130, 1, "openjs");
                            } else {
                                class115.method1450(var130, 2);
                            }
                            continue;
                        }
                        if (var501 == 3115) {
                            var5--;
                            int var133 = field721[var5];
                            client.field295.method2783(233);
                            client.field295.method2560(var133);
                            continue;
                        }
                        if (var501 == 3116) {
                            var5--;
                            int var134 = field721[var5];
                            var6 -= 2;
                            String var135 = field722[var6];
                            String var136 = field722[var6 + 1];
                            if (var135.length() <= 500 && var136.length() <= 500) {
                                client.field295.method2783(189);
                                client.field295.method2560(1 + Statics.method1050(var135) + Statics.method1050(var136));
                                client.field295.method2571(var135);
                                client.field295.method2599(var134);
                                client.field295.method2571(var136);
                            }
                            continue;
                        }
                    } else if (var501 < 3300) {
                        if (var501 == 3200) {
                            var5 -= 3;
                            int var137 = field721[var5];
                            int var138 = field721[var5 + 1];
                            int var139 = field721[var5 + 2];
                            if (client.field483 != 0 && var138 != 0 && client.field529 < 50) {
                                client.field530[client.field529] = var137;
                                client.field410[client.field529] = var138;
                                client.field440[client.field529] = var139;
                                client.field534[client.field529] = null;
                                client.field484[client.field529] = 0;
                                client.field529++;
                            }
                            continue;
                        }
                        if (var501 == 3201) {
                            var5--;
                            client.method2907(field721[var5]);
                            continue;
                        }
                        if (var501 == 3202) {
                            var5 -= 2;
                            int var140 = field721[var5];
                            int var10000 = field721[var5 + 1];
                            if (client.field374 != 0 && var140 != -1) {
                                class139.method2051(Statics.field1707, var140, 0, client.field374, false);
                                client.field526 = true;
                            }
                            continue;
                        }
                    } else if (var501 < 3400) {
                        if (var501 == 3300) {
                            field721[var5++] = client.field294;
                            continue;
                        }
                        if (var501 == 3301) {
                            var5 -= 2;
                            int var142 = field721[var5];
                            int var143 = field721[var5 + 1];
                            field721[var5++] = class13.method659(var142, var143);
                            continue;
                        }
                        if (var501 == 3302) {
                            var5 -= 2;
                            int var144 = field721[var5];
                            int var145 = field721[var5 + 1];
                            field721[var5++] = class13.method1787(var144, var145);
                            continue;
                        }
                        if (var501 == 3303) {
                            var5 -= 2;
                            int var146 = field721[var5];
                            int var147 = field721[var5 + 1];
                            int[] var148 = field721;
                            int var149 = var5++;
                            class13 var150 = (class13) class13.field126.method2161((long) var146);
                            int var151;
                            if (var150 == null) {
                                var151 = 0;
                            } else if (var147 == -1) {
                                var151 = 0;
                            } else {
                                int var152 = 0;
                                for (int var153 = 0; var153 < var150.field127.length; var153++) {
                                    if (var150.field125[var153] == var147) {
                                        var152 += var150.field127[var153];
                                    }
                                }
                                var151 = var152;
                            }
                            var148[var149] = var151;
                            continue;
                        }
                        if (var501 == 3304) {
                            var5--;
                            int var154 = field721[var5];
                            int[] var155 = field721;
                            int var156 = var5++;
                            class187 var157 = (class187) class187.field2772.method2150((long) var154);
                            class187 var158;
                            if (var157 == null) {
                                byte[] var159 = Statics.field2775.method3014(5, var154);
                                class187 var160 = new class187();
                                if (var159 != null) {
                                    var160.method3157(new class154(var159));
                                }
                                class187.field2772.method2152(var160, (long) var154);
                                var158 = var160;
                            } else {
                                var158 = var157;
                            }
                            var155[var156] = var158.field2774;
                            continue;
                        }
                        if (var501 == 3305) {
                            var5--;
                            int var161 = field721[var5];
                            field721[var5++] = client.field424[var161];
                            continue;
                        }
                        if (var501 == 3306) {
                            var5--;
                            int var162 = field721[var5];
                            field721[var5++] = client.field425[var162];
                            continue;
                        }
                        if (var501 == 3307) {
                            var5--;
                            int var163 = field721[var5];
                            field721[var5++] = client.field426[var163];
                            continue;
                        }
                        if (var501 == 3308) {
                            int var164 = Statics.field2355;
                            int var165 = (Statics.field810.field629 >> 7) + Statics.field164;
                            int var166 = (Statics.field810.field600 >> 7) + Statics.field209;
                            field721[var5++] = (var164 << 28) + (var165 << 14) + var166;
                            continue;
                        }
                        if (var501 == 3309) {
                            var5--;
                            int var167 = field721[var5];
                            field721[var5++] = var167 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var501 == 3310) {
                            var5--;
                            int var168 = field721[var5];
                            field721[var5++] = var168 >> 28;
                            continue;
                        }
                        if (var501 == 3311) {
                            var5--;
                            int var169 = field721[var5];
                            field721[var5++] = var169 & 0x3FFF;
                            continue;
                        }
                        if (var501 == 3312) {
                            field721[var5++] = client.field289 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3313) {
                            var5 -= 2;
                            int var170 = field721[var5] + 32768;
                            int var171 = field721[var5 + 1];
                            field721[var5++] = class13.method659(var170, var171);
                            continue;
                        }
                        if (var501 == 3314) {
                            var5 -= 2;
                            int var172 = field721[var5] + 32768;
                            int var173 = field721[var5 + 1];
                            field721[var5++] = class13.method1787(var172, var173);
                            continue;
                        }
                        if (var501 == 3315) {
                            var5 -= 2;
                            int var174 = field721[var5] + 32768;
                            int var175 = field721[var5 + 1];
                            int[] var176 = field721;
                            int var177 = var5++;
                            class13 var178 = (class13) class13.field126.method2161((long) var174);
                            int var179;
                            if (var178 == null) {
                                var179 = 0;
                            } else if (var175 == -1) {
                                var179 = 0;
                            } else {
                                int var180 = 0;
                                for (int var181 = 0; var181 < var178.field127.length; var181++) {
                                    if (var178.field125[var181] == var175) {
                                        var180 += var178.field127[var181];
                                    }
                                }
                                var179 = var180;
                            }
                            var176[var177] = var179;
                            continue;
                        }
                        if (var501 == 3316) {
                            if (client.field359 >= 2) {
                                field721[var5++] = client.field359;
                            } else {
                                field721[var5++] = 0;
                            }
                            continue;
                        }
                        if (var501 == 3317) {
                            field721[var5++] = client.field301;
                            continue;
                        }
                        if (var501 == 3318) {
                            field721[var5++] = client.field500;
                            continue;
                        }
                        if (var501 == 3321) {
                            field721[var5++] = client.field429;
                            continue;
                        }
                        if (var501 == 3322) {
                            field721[var5++] = client.field360;
                            continue;
                        }
                        if (var501 == 3323) {
                            if (client.field456) {
                                field721[var5++] = 1;
                            } else {
                                field721[var5++] = 0;
                            }
                            continue;
                        }
                        if (var501 == 3324) {
                            field721[var5++] = client.field401;
                            continue;
                        }
                    } else if (var501 < 3500) {
                        if (var501 == 3400) {
                            var5 -= 2;
                            int var182 = field721[var5];
                            int var183 = field721[var5 + 1];
                            class196 var184 = class196.method3117(var182);
                            if (var184.field2863 != 's') {
                            }
                            for (int var185 = 0; var185 < var184.field2860; var185++) {
                                if (var184.field2861[var185] == var183) {
                                    field722[var6++] = var184.field2859[var185];
                                    var184 = null;
                                    break;
                                }
                            }
                            if (var184 != null) {
                                field722[var6++] = var184.field2858;
                            }
                            continue;
                        }
                        if (var501 == 3408) {
                            var5 -= 4;
                            int var186 = field721[var5];
                            int var187 = field721[var5 + 1];
                            int var188 = field721[var5 + 2];
                            int var189 = field721[var5 + 3];
                            class196 var190 = class196.method3117(var188);
                            if (var190.field2854 == var186 && var190.field2863 == var187) {
                                for (int var191 = 0; var191 < var190.field2860; var191++) {
                                    if (var190.field2861[var191] == var189) {
                                        if (var187 == 115) {
                                            field722[var6++] = var190.field2859[var191];
                                        } else {
                                            field721[var5++] = var190.field2856[var191];
                                        }
                                        var190 = null;
                                        break;
                                    }
                                }
                                if (var190 != null) {
                                    if (var187 == 115) {
                                        field722[var6++] = var190.field2858;
                                    } else {
                                        field721[var5++] = var190.field2864;
                                    }
                                }
                                continue;
                            }
                            if (var187 == 115) {
                                field722[var6++] = "null";
                            } else {
                                field721[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var501 < 3700) {
                        if (var501 == 3600) {
                            if (client.field555 == 0) {
                                field721[var5++] = -2;
                            } else if (client.field555 == 1) {
                                field721[var5++] = -1;
                            } else {
                                field721[var5++] = client.field554;
                            }
                            continue;
                        }
                        if (var501 == 3601) {
                            var5--;
                            int var192 = field721[var5];
                            if (client.field555 == 2 && var192 < client.field554) {
                                field722[var6++] = client.field556[var192].field156;
                                field722[var6++] = client.field556[var192].field148;
                                continue;
                            }
                            field722[var6++] = "";
                            field722[var6++] = "";
                            continue;
                        }
                        if (var501 == 3602) {
                            var5--;
                            int var193 = field721[var5];
                            if (client.field555 == 2 && var193 < client.field554) {
                                field721[var5++] = client.field556[var193].field147;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var501 == 3603) {
                            var5--;
                            int var194 = field721[var5];
                            if (client.field555 == 2 && var194 < client.field554) {
                                field721[var5++] = client.field556[var194].field146;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var501 == 3604) {
                            var6--;
                            String var195 = field722[var6];
                            var5--;
                            int var196 = field721[var5];
                            client.field295.method2783(137);
                            client.field295.method2746(Statics.method1050(var195) + 1);
                            client.field295.method2571(var195);
                            client.field295.method2598(var196);
                            continue;
                        }
                        if (var501 == 3605) {
                            var6--;
                            String var197 = field722[var6];
                            client.method135(var197);
                            continue;
                        }
                        if (var501 == 3606) {
                            var6--;
                            String var198 = field722[var6];
                            Statics.method1938(var198);
                            continue;
                        }
                        if (var501 == 3607) {
                            var6--;
                            String var199 = field722[var6];
                            if (var199 == null) {
                                continue;
                            }
                            if ((client.field558 < 100 || client.field411 == 1) && client.field558 < 400) {
                                String var200 = Statics.method2096(var199, Statics.field1725);
                                if (var200 == null) {
                                    continue;
                                }
                                for (int var201 = 0; var201 < client.field558; var201++) {
                                    class20 var202 = client.field349[var201];
                                    String var203 = Statics.method2096(var202.field208, Statics.field1725);
                                    if (var203 != null && var203.equals(var200)) {
                                        class48.method3375(31, "", var199 + class174.field2530);
                                        continue label3224;
                                    }
                                    if (var202.field205 != null) {
                                        String var204 = Statics.method2096(var202.field205, Statics.field1725);
                                        if (var204 != null && var204.equals(var200)) {
                                            class48.method3375(31, "", var199 + class174.field2530);
                                            continue label3224;
                                        }
                                    }
                                }
                                for (int var205 = 0; var205 < client.field554; var205++) {
                                    class15 var206 = client.field556[var205];
                                    String var207 = Statics.method2096(var206.field156, Statics.field1725);
                                    if (var207 != null && var207.equals(var200)) {
                                        class48.method3375(31, "", class174.field2393 + var199 + class174.field2536);
                                        continue label3224;
                                    }
                                    if (var206.field148 != null) {
                                        String var208 = Statics.method2096(var206.field148, Statics.field1725);
                                        if (var208 != null && var208.equals(var200)) {
                                            class48.method3375(31, "", class174.field2393 + var199 + class174.field2536);
                                            continue label3224;
                                        }
                                    }
                                }
                                if (Statics.method2096(Statics.field810.field241, Statics.field1725).equals(var200)) {
                                    class48.method3375(31, "", class174.field2532);
                                } else {
                                    client.field295.method2783(251);
                                    client.field295.method2746(Statics.method1050(var199));
                                    client.field295.method2571(var199);
                                }
                                continue;
                            }
                            class48.method3375(31, "", class174.field2529);
                            continue;
                        }
                        if (var501 == 3608) {
                            var6--;
                            String var209 = field722[var6];
                            if (var209 == null) {
                                continue;
                            }
                            String var210 = Statics.method2096(var209, Statics.field1725);
                            if (var210 == null) {
                                continue;
                            }
                            int var211 = 0;
                            while (true) {
                                if (var211 >= client.field558) {
                                    continue label3224;
                                }
                                class20 var212 = client.field349[var211];
                                String var213 = var212.field208;
                                String var214 = Statics.method2096(var213, Statics.field1725);
                                boolean var215;
                                if (var209 == null || var213 == null) {
                                    var215 = false;
                                } else if (var209.startsWith("#") || var213.startsWith("#")) {
                                    var215 = var209.equals(var213);
                                } else {
                                    var215 = var210.equals(var214);
                                }
                                if (var215) {
                                    client.field558--;
                                    for (int var216 = var211; var216 < client.field558; var216++) {
                                        client.field349[var216] = client.field349[var216 + 1];
                                    }
                                    client.field480 = client.field472;
                                    client.field295.method2783(205);
                                    client.field295.method2746(Statics.method1050(var209));
                                    client.field295.method2571(var209);
                                    continue label3224;
                                }
                                var211++;
                            }
                        }
                        if (var501 == 3609) {
                            var6--;
                            String var217 = field722[var6];
                            class178[] var218 = class178.method182();
                            for (int var219 = 0; var219 < var218.length; var219++) {
                                class178 var220 = var218[var219];
                                if (var220.field2660 != -1 && var217.startsWith(class38.method57(var220.field2660))) {
                                    var217 = var217.substring(6 + Integer.toString(var220.field2660).length());
                                    break;
                                }
                            }
                            field721[var5++] = client.method2104(var217, false) ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3611) {
                            if (client.field514 == null) {
                                field722[var6++] = "";
                            } else {
                                field722[var6++] = class206.method3454(client.field514);
                            }
                            continue;
                        }
                        if (var501 == 3612) {
                            if (client.field514 == null) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = Statics.field137;
                            }
                            continue;
                        }
                        if (var501 == 3613) {
                            var5--;
                            int var221 = field721[var5];
                            if (client.field514 != null && var221 < Statics.field137) {
                                field722[var6++] = Statics.field77[var221].field278;
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var501 == 3614) {
                            var5--;
                            int var222 = field721[var5];
                            if (client.field514 != null && var222 < Statics.field137) {
                                field721[var5++] = Statics.field77[var222].field270;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var501 == 3615) {
                            var5--;
                            int var223 = field721[var5];
                            if (client.field514 != null && var223 < Statics.field137) {
                                field721[var5++] = Statics.field77[var223].field279;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var501 == 3616) {
                            field721[var5++] = Statics.field684;
                            continue;
                        }
                        if (var501 == 3617) {
                            var6--;
                            String var224 = field722[var6];
                            if (Statics.field77 != null) {
                                client.field295.method2783(120);
                                client.field295.method2746(Statics.method1050(var224));
                                client.field295.method2571(var224);
                            }
                            continue;
                        }
                        if (var501 == 3618) {
                            field721[var5++] = Statics.field219;
                            continue;
                        }
                        if (var501 == 3619) {
                            var6--;
                            String var225 = field722[var6];
                            if (!var225.equals("")) {
                                client.field295.method2783(204);
                                client.field295.method2746(Statics.method1050(var225));
                                client.field295.method2571(var225);
                            }
                            continue;
                        }
                        if (var501 == 3620) {
                            client.field295.method2783(204);
                            client.field295.method2746(0);
                            continue;
                        }
                        if (var501 == 3621) {
                            if (client.field555 == 0) {
                                field721[var5++] = -1;
                            } else {
                                field721[var5++] = client.field558;
                            }
                            continue;
                        }
                        if (var501 == 3622) {
                            var5--;
                            int var226 = field721[var5];
                            if (client.field555 != 0 && var226 < client.field558) {
                                field722[var6++] = client.field349[var226].field208;
                                field722[var6++] = client.field349[var226].field205;
                                continue;
                            }
                            field722[var6++] = "";
                            field722[var6++] = "";
                            continue;
                        }
                        if (var501 == 3623) {
                            var6--;
                            String var227 = field722[var6];
                            String var229 = "<img=0>";
                            if (var227.startsWith(var229) || var227.startsWith(class38.method57(1))) {
                                var227 = var227.substring(7);
                            }
                            field721[var5++] = client.method3193(var227) ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3624) {
                            var5--;
                            int var230 = field721[var5];
                            if (Statics.field77 != null && var230 < Statics.field137 && Statics.field77[var230].field278.equalsIgnoreCase(Statics.field810.field241)) {
                                field721[var5++] = 1;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var501 == 3625) {
                            if (client.field515 == null) {
                                field722[var6++] = "";
                            } else {
                                field722[var6++] = class206.method3454(client.field515);
                            }
                            continue;
                        }
                    } else if (var501 < 4000) {
                        if (var501 == 3903) {
                            var5--;
                            int var231 = field721[var5];
                            field721[var5++] = client.field532[var231].method42();
                            continue;
                        }
                        if (var501 == 3904) {
                            var5--;
                            int var232 = field721[var5];
                            field721[var5++] = client.field532[var232].field44;
                            continue;
                        }
                        if (var501 == 3905) {
                            var5--;
                            int var233 = field721[var5];
                            field721[var5++] = client.field532[var233].field38;
                            continue;
                        }
                        if (var501 == 3906) {
                            var5--;
                            int var234 = field721[var5];
                            field721[var5++] = client.field532[var234].field39;
                            continue;
                        }
                        if (var501 == 3907) {
                            var5--;
                            int var235 = field721[var5];
                            field721[var5++] = client.field532[var235].field40;
                            continue;
                        }
                        if (var501 == 3908) {
                            var5--;
                            int var236 = field721[var5];
                            field721[var5++] = client.field532[var236].field41;
                            continue;
                        }
                        if (var501 == 3910) {
                            var5--;
                            int var237 = field721[var5];
                            int var238 = client.field532[var237].method41();
                            field721[var5++] = var238 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3911) {
                            var5--;
                            int var239 = field721[var5];
                            int var240 = client.field532[var239].method41();
                            field721[var5++] = var240 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3912) {
                            var5--;
                            int var241 = field721[var5];
                            int var242 = client.field532[var241].method41();
                            field721[var5++] = var242 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3913) {
                            var5--;
                            int var243 = field721[var5];
                            int var244 = client.field532[var243].method41();
                            field721[var5++] = var244 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3914) {
                            var5--;
                            boolean var245 = field721[var5] == 1;
                            if (Statics.field750 != null) {
                                Statics.field750.method16(class2.field13, var245);
                            }
                            continue;
                        }
                        if (var501 == 3915) {
                            var5--;
                            boolean var246 = field721[var5] == 1;
                            if (Statics.field750 != null) {
                                Statics.field750.method16(class2.field12, var246);
                            }
                            continue;
                        }
                        if (var501 == 3916) {
                            var5 -= 2;
                            boolean var247 = field721[var5] == 1;
                            boolean var248 = field721[var5 + 1] == 1;
                            if (Statics.field750 != null) {
                                Statics.field750.method16(new class45(var248), var247);
                            }
                            continue;
                        }
                        if (var501 == 3917) {
                            var5--;
                            boolean var249 = field721[var5] == 1;
                            if (Statics.field750 != null) {
                                Statics.field750.method16(class2.field11, var249);
                            }
                            continue;
                        }
                        if (var501 == 3918) {
                            var5--;
                            boolean var250 = field721[var5] == 1;
                            if (Statics.field750 != null) {
                                Statics.field750.method16(class2.field14, var250);
                            }
                            continue;
                        }
                        if (var501 == 3919) {
                            field721[var5++] = Statics.field750 == null ? 0 : Statics.field750.field15.size();
                            continue;
                        }
                        if (var501 == 3920) {
                            var5--;
                            int var251 = field721[var5];
                            class3 var252 = (class3) Statics.field750.field15.get(var251);
                            field721[var5++] = var252.field24;
                            continue;
                        }
                        if (var501 == 3921) {
                            var5--;
                            int var253 = field721[var5];
                            class3 var254 = (class3) Statics.field750.field15.get(var253);
                            field722[var6++] = var254.method25();
                            continue;
                        }
                        if (var501 == 3922) {
                            var5--;
                            int var255 = field721[var5];
                            class3 var256 = (class3) Statics.field750.field15.get(var255);
                            field722[var6++] = var256.method20();
                            continue;
                        }
                        if (var501 == 3923) {
                            var5--;
                            int var257 = field721[var5];
                            class3 var258 = (class3) Statics.field750.field15.get(var257);
                            long var259 = class156.method1307() - Statics.field3062 - var258.field27;
                            int var261 = (int) (var259 / 3600000L);
                            int var262 = (int) ((var259 - (long) (var261 * 3600000)) / 60000L);
                            int var263 = (int) ((var259 - (long) (var261 * 3600000) - (long) (var262 * 60000)) / 1000L);
                            String var264 = var261 + ":" + var262 / 10 + var262 % 10 + ":" + var263 / 10 + var263 % 10;
                            field722[var6++] = var264;
                            continue;
                        }
                        if (var501 == 3924) {
                            var5--;
                            int var265 = field721[var5];
                            class3 var266 = (class3) Statics.field750.field15.get(var265);
                            field721[var5++] = var266.field25.field39;
                            continue;
                        }
                        if (var501 == 3925) {
                            var5--;
                            int var267 = field721[var5];
                            class3 var268 = (class3) Statics.field750.field15.get(var267);
                            field721[var5++] = var268.field25.field38;
                            continue;
                        }
                        if (var501 == 3926) {
                            var5--;
                            int var269 = field721[var5];
                            class3 var270 = (class3) Statics.field750.field15.get(var269);
                            field721[var5++] = var270.field25.field44;
                            continue;
                        }
                    } else if (var501 < 4100) {
                        if (var501 == 4000) {
                            var5 -= 2;
                            int var271 = field721[var5];
                            int var272 = field721[var5 + 1];
                            field721[var5++] = var271 + var272;
                            continue;
                        }
                        if (var501 == 4001) {
                            var5 -= 2;
                            int var273 = field721[var5];
                            int var274 = field721[var5 + 1];
                            field721[var5++] = var273 - var274;
                            continue;
                        }
                        if (var501 == 4002) {
                            var5 -= 2;
                            int var275 = field721[var5];
                            int var276 = field721[var5 + 1];
                            field721[var5++] = var275 * var276;
                            continue;
                        }
                        if (var501 == 4003) {
                            var5 -= 2;
                            int var277 = field721[var5];
                            int var278 = field721[var5 + 1];
                            field721[var5++] = var277 / var278;
                            continue;
                        }
                        if (var501 == 4004) {
                            var5--;
                            int var279 = field721[var5];
                            field721[var5++] = (int) (Math.random() * (double) var279);
                            continue;
                        }
                        if (var501 == 4005) {
                            var5--;
                            int var280 = field721[var5];
                            field721[var5++] = (int) (Math.random() * (double) (var280 + 1));
                            continue;
                        }
                        if (var501 == 4006) {
                            var5 -= 5;
                            int var281 = field721[var5];
                            int var282 = field721[var5 + 1];
                            int var283 = field721[var5 + 2];
                            int var284 = field721[var5 + 3];
                            int var285 = field721[var5 + 4];
                            field721[var5++] = (var282 - var281) * (var285 - var283) / (var284 - var283) + var281;
                            continue;
                        }
                        if (var501 == 4007) {
                            var5 -= 2;
                            int var286 = field721[var5];
                            int var287 = field721[var5 + 1];
                            field721[var5++] = var286 * var287 / 100 + var286;
                            continue;
                        }
                        if (var501 == 4008) {
                            var5 -= 2;
                            int var288 = field721[var5];
                            int var289 = field721[var5 + 1];
                            field721[var5++] = var288 | 0x1 << var289;
                            continue;
                        }
                        if (var501 == 4009) {
                            var5 -= 2;
                            int var290 = field721[var5];
                            int var291 = field721[var5 + 1];
                            field721[var5++] = var290 & -1 - (0x1 << var291);
                            continue;
                        }
                        if (var501 == 4010) {
                            var5 -= 2;
                            int var292 = field721[var5];
                            int var293 = field721[var5 + 1];
                            field721[var5++] = (var292 & 0x1 << var293) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var501 == 4011) {
                            var5 -= 2;
                            int var294 = field721[var5];
                            int var295 = field721[var5 + 1];
                            field721[var5++] = var294 % var295;
                            continue;
                        }
                        if (var501 == 4012) {
                            var5 -= 2;
                            int var296 = field721[var5];
                            int var297 = field721[var5 + 1];
                            if (var296 == 0) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = (int) Math.pow((double) var296, (double) var297);
                            }
                            continue;
                        }
                        if (var501 == 4013) {
                            var5 -= 2;
                            int var298 = field721[var5];
                            int var299 = field721[var5 + 1];
                            if (var298 == 0) {
                                field721[var5++] = 0;
                            } else if (var299 == 0) {
                                field721[var5++] = Integer.MAX_VALUE;
                            } else {
                                field721[var5++] = (int) Math.pow((double) var298, 1.0D / (double) var299);
                            }
                            continue;
                        }
                        if (var501 == 4014) {
                            var5 -= 2;
                            int var300 = field721[var5];
                            int var301 = field721[var5 + 1];
                            field721[var5++] = var300 & var301;
                            continue;
                        }
                        if (var501 == 4015) {
                            var5 -= 2;
                            int var302 = field721[var5];
                            int var303 = field721[var5 + 1];
                            field721[var5++] = var302 | var303;
                            continue;
                        }
                        if (var501 == 4018) {
                            var5 -= 3;
                            long var304 = (long) field721[var5];
                            long var306 = (long) field721[var5 + 1];
                            long var308 = (long) field721[var5 + 2];
                            field721[var5++] = (int) (var304 * var308 / var306);
                            continue;
                        }
                    } else if (var501 < 4200) {
                        if (var501 == 4100) {
                            var6--;
                            String var310 = field722[var6];
                            var5--;
                            int var311 = field721[var5];
                            field722[var6++] = var310 + var311;
                            continue;
                        }
                        if (var501 == 4101) {
                            var6 -= 2;
                            String var312 = field722[var6];
                            String var313 = field722[var6 + 1];
                            field722[var6++] = var312 + var313;
                            continue;
                        }
                        if (var501 == 4102) {
                            var6--;
                            String var314 = field722[var6];
                            var5--;
                            int var315 = field721[var5];
                            field722[var6++] = var314 + class208.method2761(var315, true);
                            continue;
                        }
                        if (var501 == 4103) {
                            var6--;
                            String var316 = field722[var6];
                            field722[var6++] = var316.toLowerCase();
                            continue;
                        }
                        if (var501 == 4104) {
                            var5--;
                            int var317 = field721[var5];
                            long var318 = ((long) var317 + 11745L) * 86400000L;
                            field726.setTime(new Date(var318));
                            int var320 = field726.get(5);
                            int var321 = field726.get(2);
                            int var322 = field726.get(1);
                            field722[var6++] = var320 + "-" + field727[var321] + "-" + var322;
                            continue;
                        }
                        if (var501 == 4105) {
                            var6 -= 2;
                            String var323 = field722[var6];
                            String var324 = field722[var6 + 1];
                            if (Statics.field810.field269 != null && Statics.field810.field269.field2174) {
                                field722[var6++] = var324;
                                continue;
                            }
                            field722[var6++] = var323;
                            continue;
                        }
                        if (var501 == 4106) {
                            var5--;
                            int var325 = field721[var5];
                            field722[var6++] = Integer.toString(var325);
                            continue;
                        }
                        if (var501 == 4107) {
                            var6 -= 2;
                            int[] var326 = field721;
                            int var327 = var5++;
                            String var328 = field722[var6];
                            String var329 = field722[var6 + 1];
                            int var330 = client.field291;
                            int var331 = var328.length();
                            int var332 = var329.length();
                            int var333 = 0;
                            int var334 = 0;
                            byte var335 = 0;
                            byte var336 = 0;
                            int var337;
                            label2965: while (true) {
                                if (var333 - var335 >= var331 && var334 - var336 >= var332) {
                                    int var348 = Math.min(var331, var332);
                                    for (int var349 = 0; var349 < var348; var349++) {
                                        char var352 = var328.charAt(var349);
                                        char var353 = var329.charAt(var349);
                                        if (var352 != var353 && Character.toUpperCase(var352) != Character.toUpperCase(var353)) {
                                            char var354 = Character.toLowerCase(var352);
                                            char var355 = Character.toLowerCase(var353);
                                            if (var354 != var355) {
                                                var337 = class203.method3470(var354, var330) - class203.method3470(var355, var330);
                                                break label2965;
                                            }
                                        }
                                    }
                                    int var356 = var331 - var332;
                                    if (var356 == 0) {
                                        for (int var357 = 0; var357 < var348; var357++) {
                                            char var358 = var328.charAt(var357);
                                            char var359 = var329.charAt(var357);
                                            if (var358 != var359) {
                                                var337 = class203.method3470(var358, var330) - class203.method3470(var359, var330);
                                                break label2965;
                                            }
                                        }
                                        var337 = 0;
                                    } else {
                                        var337 = var356;
                                    }
                                    break;
                                }
                                if (var333 - var335 >= var331) {
                                    var337 = -1;
                                    break;
                                }
                                if (var334 - var336 >= var332) {
                                    var337 = 1;
                                    break;
                                }
                                char var338;
                                if (var335 == 0) {
                                    var338 = var328.charAt(var333++);
                                } else {
                                    var338 = (char) var335;
                                    boolean var339 = false;
                                }
                                char var340;
                                if (var336 == 0) {
                                    var340 = var329.charAt(var334++);
                                } else {
                                    var340 = (char) var336;
                                    boolean var341 = false;
                                }
                                byte var342;
                                if (var338 == 198) {
                                    var342 = 69;
                                } else if (var338 == 230) {
                                    var342 = 101;
                                } else if (var338 == 223) {
                                    var342 = 115;
                                } else if (var338 == 338) {
                                    var342 = 69;
                                } else if (var338 == 339) {
                                    var342 = 101;
                                } else {
                                    var342 = 0;
                                }
                                var335 = var342;
                                byte var343;
                                if (var340 == 198) {
                                    var343 = 69;
                                } else if (var340 == 230) {
                                    var343 = 101;
                                } else if (var340 == 223) {
                                    var343 = 115;
                                } else if (var340 == 338) {
                                    var343 = 69;
                                } else if (var340 == 339) {
                                    var343 = 101;
                                } else {
                                    var343 = 0;
                                }
                                var336 = var343;
                                char var344 = class203.method586(var338, var330);
                                char var345 = class203.method586(var340, var330);
                                if (var344 != var345 && Character.toUpperCase(var344) != Character.toUpperCase(var345)) {
                                    char var346 = Character.toLowerCase(var344);
                                    char var347 = Character.toLowerCase(var345);
                                    if (var346 != var347) {
                                        var337 = class203.method3470(var346, var330) - class203.method3470(var347, var330);
                                        break;
                                    }
                                }
                            }
                            byte var361;
                            if (var337 > 0) {
                                var361 = 1;
                            } else if (var337 < 0) {
                                var361 = -1;
                            } else {
                                var361 = 0;
                            }
                            var326[var327] = var361;
                            continue;
                        }
                        if (var501 == 4108) {
                            var6--;
                            String var362 = field722[var6];
                            var5 -= 2;
                            int var363 = field721[var5];
                            int var364 = field721[var5 + 1];
                            byte[] var365 = Statics.field1838.method3014(var364, 0);
                            class209 var366 = new class209(var365);
                            field721[var5++] = var366.method3589(var362, var363);
                            continue;
                        }
                        if (var501 == 4109) {
                            var6--;
                            String var367 = field722[var6];
                            var5 -= 2;
                            int var368 = field721[var5];
                            int var369 = field721[var5 + 1];
                            byte[] var370 = Statics.field1838.method3014(var369, 0);
                            class209 var371 = new class209(var370);
                            field721[var5++] = var371.method3591(var367, var368);
                            continue;
                        }
                        if (var501 == 4110) {
                            var6 -= 2;
                            String var372 = field722[var6];
                            String var373 = field722[var6 + 1];
                            var5--;
                            if (field721[var5] == 1) {
                                field722[var6++] = var372;
                            } else {
                                field722[var6++] = var373;
                            }
                            continue;
                        }
                        if (var501 == 4111) {
                            var6--;
                            String var374 = field722[var6];
                            field722[var6++] = class210.method3572(var374);
                            continue;
                        }
                        if (var501 == 4112) {
                            var6--;
                            String var375 = field722[var6];
                            var5--;
                            int var376 = field721[var5];
                            field722[var6++] = var375 + (char) var376;
                            continue;
                        }
                        if (var501 == 4113) {
                            var5--;
                            int var377 = field721[var5];
                            int[] var378 = field721;
                            int var379 = var5++;
                            char var380 = (char) var377;
                            boolean var381;
                            if (var380 >= ' ' && var380 <= '~') {
                                var381 = true;
                            } else if (var380 >= 160 && var380 <= 255) {
                                var381 = true;
                            } else if (var380 == 8364 || var380 == 338 || var380 == 8212 || var380 == 339 || var380 == 376) {
                                var381 = true;
                            } else {
                                var381 = false;
                            }
                            var378[var379] = var381 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 4114) {
                            var5--;
                            int var382 = field721[var5];
                            int[] var383 = field721;
                            int var384 = var5++;
                            char var385 = (char) var382;
                            boolean var386 = var385 >= '0' && var385 <= '9' || var385 >= 'A' && var385 <= 'Z' || var385 >= 'a' && var385 <= 'z';
                            var383[var384] = var386 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 4115) {
                            var5--;
                            int var387 = field721[var5];
                            field721[var5++] = class208.method2307((char) var387) ? 1 : 0;
                            continue;
                        }
                        if (var501 == 4116) {
                            var5--;
                            int var388 = field721[var5];
                            int[] var389 = field721;
                            int var390 = var5++;
                            char var391 = (char) var388;
                            boolean var392 = var391 >= '0' && var391 <= '9';
                            var389[var390] = var392 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 4117) {
                            var6--;
                            String var393 = field722[var6];
                            if (var393 == null) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = var393.length();
                            }
                            continue;
                        }
                        if (var501 == 4118) {
                            var6--;
                            String var394 = field722[var6];
                            var5 -= 2;
                            int var395 = field721[var5];
                            int var396 = field721[var5 + 1];
                            field722[var6++] = var394.substring(var395, var396);
                            continue;
                        }
                        if (var501 == 4119) {
                            var6--;
                            String var397 = field722[var6];
                            StringBuilder var398 = new StringBuilder(var397.length());
                            boolean var399 = false;
                            for (int var400 = 0; var400 < var397.length(); var400++) {
                                char var401 = var397.charAt(var400);
                                if (var401 == '<') {
                                    var399 = true;
                                } else if (var401 == '>') {
                                    var399 = false;
                                } else if (!var399) {
                                    var398.append(var401);
                                }
                            }
                            field722[var6++] = var398.toString();
                            continue;
                        }
                        if (var501 == 4120) {
                            var6--;
                            String var402 = field722[var6];
                            var5--;
                            int var403 = field721[var5];
                            field721[var5++] = var402.indexOf(var403);
                            continue;
                        }
                        if (var501 == 4121) {
                            var6 -= 2;
                            String var404 = field722[var6];
                            String var405 = field722[var6 + 1];
                            var5--;
                            int var406 = field721[var5];
                            field721[var5++] = var404.indexOf(var405, var406);
                            continue;
                        }
                    } else if (var501 < 4300) {
                        if (var501 == 4200) {
                            var5--;
                            int var407 = field721[var5];
                            field722[var6++] = class199.method96(var407).field2946;
                            continue;
                        }
                        if (var501 == 4201) {
                            var5 -= 2;
                            int var408 = field721[var5];
                            int var409 = field721[var5 + 1];
                            class199 var410 = class199.method96(var408);
                            if (var409 >= 1 && var409 <= 5 && var410.field2975[var409 - 1] != null) {
                                field722[var6++] = var410.field2975[var409 - 1];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var501 == 4202) {
                            var5 -= 2;
                            int var411 = field721[var5];
                            int var412 = field721[var5 + 1];
                            class199 var413 = class199.method96(var411);
                            if (var412 >= 1 && var412 <= 5 && var413.field2970[var412 - 1] != null) {
                                field722[var6++] = var413.field2970[var412 - 1];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var501 == 4203) {
                            var5--;
                            int var414 = field721[var5];
                            field721[var5++] = class199.method96(var414).field2967;
                            continue;
                        }
                        if (var501 == 4204) {
                            var5--;
                            int var415 = field721[var5];
                            field721[var5++] = class199.method96(var415).field2979 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 4205) {
                            var5--;
                            int var416 = field721[var5];
                            class199 var417 = class199.method96(var416);
                            if (var417.field2986 == -1 && var417.field2985 >= 0) {
                                field721[var5++] = var417.field2985;
                                continue;
                            }
                            field721[var5++] = var416;
                            continue;
                        }
                        if (var501 == 4206) {
                            var5--;
                            int var418 = field721[var5];
                            class199 var419 = class199.method96(var418);
                            if (var419.field2986 >= 0 && var419.field2985 >= 0) {
                                field721[var5++] = var419.field2985;
                                continue;
                            }
                            field721[var5++] = var418;
                            continue;
                        }
                        if (var501 == 4207) {
                            var5--;
                            int var420 = field721[var5];
                            field721[var5++] = class199.method96(var420).field2968 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 4208) {
                            var5--;
                            int var421 = field721[var5];
                            class199 var422 = class199.method96(var421);
                            if (var422.field2997 == -1 && var422.field2996 >= 0) {
                                field721[var5++] = var422.field2996;
                                continue;
                            }
                            field721[var5++] = var421;
                            continue;
                        }
                        if (var501 == 4209) {
                            var5--;
                            int var423 = field721[var5];
                            class199 var424 = class199.method96(var423);
                            if (var424.field2997 >= 0 && var424.field2996 >= 0) {
                                field721[var5++] = var424.field2996;
                                continue;
                            }
                            field721[var5++] = var423;
                            continue;
                        }
                        if (var501 == 4210) {
                            var6--;
                            String var425 = field722[var6];
                            var5--;
                            int var426 = field721[var5];
                            boolean var428 = var426 == 1;
                            String var429 = var425.toLowerCase();
                            short[] var430 = new short[16];
                            int var431 = 0;
                            int var432 = 0;
                            while (true) {
                                if (var432 >= Statics.field2949) {
                                    Statics.field1568 = var430;
                                    Statics.field1549 = 0;
                                    Statics.field699 = var431;
                                    String[] var436 = new String[Statics.field699];
                                    for (int var437 = 0; var437 < Statics.field699; var437++) {
                                        var436[var437] = class199.method96(var430[var437]).field2946;
                                    }
                                    class151.method732(var436, Statics.field1568);
                                    break;
                                }
                                class199 var433 = class199.method96(var432);
                                if ((!var428 || var433.field2993) && var433.field2986 == -1 && var433.field2946.toLowerCase().indexOf(var429) != -1) {
                                    if (var431 >= 250) {
                                        Statics.field699 = -1;
                                        Statics.field1568 = null;
                                        break;
                                    }
                                    if (var431 >= var430.length) {
                                        short[] var434 = new short[var430.length * 2];
                                        for (int var435 = 0; var435 < var431; var435++) {
                                            var434[var435] = var430[var435];
                                        }
                                        var430 = var434;
                                    }
                                    var430[var431++] = (short) var432;
                                }
                                var432++;
                            }
                            field721[var5++] = Statics.field699;
                            continue;
                        }
                        if (var501 == 4211) {
                            if (Statics.field1568 != null && Statics.field1549 < Statics.field699) {
                                field721[var5++] = Statics.field1568[++Statics.field1549 - 1] & 0xFFFF;
                                continue;
                            }
                            field721[var5++] = -1;
                            continue;
                        }
                        if (var501 == 4212) {
                            Statics.field1549 = 0;
                            continue;
                        }
                    } else if (var501 < 5100) {
                        if (var501 == 5000) {
                            field721[var5++] = client.field505;
                            continue;
                        }
                        if (var501 == 5001) {
                            var5 -= 3;
                            client.field505 = field721[var5];
                            int var438 = field721[var5 + 1];
                            class217[] var439 = class217.method700();
                            int var440 = 0;
                            class217 var442;
                            while (true) {
                                if (var440 >= var439.length) {
                                    var442 = null;
                                    break;
                                }
                                class217 var441 = var439[var440];
                                if (var441.field3167 == var438) {
                                    var442 = var441;
                                    break;
                                }
                                var440++;
                            }
                            Statics.field890 = var442;
                            if (Statics.field890 == null) {
                                Statics.field890 = class217.field3164;
                            }
                            client.field506 = field721[var5 + 2];
                            client.field295.method2783(150);
                            client.field295.method2746(client.field505);
                            client.field295.method2746(Statics.field890.field3167);
                            client.field295.method2746(client.field506);
                            continue;
                        }
                        if (var501 == 5002) {
                            var6--;
                            String var443 = field722[var6];
                            var5 -= 2;
                            int var444 = field721[var5];
                            int var445 = field721[var5 + 1];
                            client.field295.method2783(21);
                            client.field295.method2746(Statics.method1050(var443) + 2);
                            client.field295.method2571(var443);
                            client.field295.method2746(var444 - 1);
                            client.field295.method2746(var445);
                            continue;
                        }
                        if (var501 == 5003) {
                            var5 -= 2;
                            int var446 = field721[var5];
                            int var447 = field721[var5 + 1];
                            class51 var448 = (class51) class48.field944.get(var446);
                            class22 var449 = var448.method852(var447);
                            if (var449 == null) {
                                field721[var5++] = -1;
                                field721[var5++] = 0;
                                field722[var6++] = "";
                                field722[var6++] = "";
                                field722[var6++] = "";
                            } else {
                                field721[var5++] = var449.field229;
                                field721[var5++] = var449.field222;
                                field722[var6++] = var449.field224 == null ? "" : var449.field224;
                                field722[var6++] = var449.field225 == null ? "" : var449.field225;
                                field722[var6++] = var449.field226 == null ? "" : var449.field226;
                            }
                            continue;
                        }
                        if (var501 == 5004) {
                            var5--;
                            int var451 = field721[var5];
                            class22 var452 = (class22) class48.field945.method2134((long) var451);
                            if (var452 == null) {
                                field721[var5++] = -1;
                                field721[var5++] = 0;
                                field722[var6++] = "";
                                field722[var6++] = "";
                                field722[var6++] = "";
                            } else {
                                field721[var5++] = var452.field223;
                                field721[var5++] = var452.field222;
                                field722[var6++] = var452.field224 == null ? "" : var452.field224;
                                field722[var6++] = var452.field225 == null ? "" : var452.field225;
                                field722[var6++] = var452.field226 == null ? "" : var452.field226;
                            }
                            continue;
                        }
                        if (var501 == 5005) {
                            if (Statics.field890 == null) {
                                field721[var5++] = -1;
                            } else {
                                field721[var5++] = Statics.field890.field3167;
                            }
                            continue;
                        }
                        if (var501 == 5008) {
                            var6--;
                            String var454 = field722[var6];
                            var5--;
                            int var455 = field721[var5];
                            String var456 = var454.toLowerCase();
                            byte var457 = 0;
                            if (var456.startsWith(class174.field2537)) {
                                var457 = 0;
                                var454 = var454.substring(class174.field2537.length());
                            } else if (var456.startsWith(class174.field2539)) {
                                var457 = 1;
                                var454 = var454.substring(class174.field2539.length());
                            } else if (var456.startsWith(class174.field2541)) {
                                var457 = 2;
                                var454 = var454.substring(class174.field2541.length());
                            } else if (var456.startsWith(class174.field2543)) {
                                var457 = 3;
                                var454 = var454.substring(class174.field2543.length());
                            } else if (var456.startsWith(class174.field2577)) {
                                var457 = 4;
                                var454 = var454.substring(class174.field2577.length());
                            } else if (var456.startsWith(class174.field2547)) {
                                var457 = 5;
                                var454 = var454.substring(class174.field2547.length());
                            } else if (var456.startsWith(class174.field2549)) {
                                var457 = 6;
                                var454 = var454.substring(class174.field2549.length());
                            } else if (var456.startsWith(class174.field2410)) {
                                var457 = 7;
                                var454 = var454.substring(class174.field2410.length());
                            } else if (var456.startsWith(class174.field2567)) {
                                var457 = 8;
                                var454 = var454.substring(class174.field2567.length());
                            } else if (var456.startsWith(class174.field2555)) {
                                var457 = 9;
                                var454 = var454.substring(class174.field2555.length());
                            } else if (var456.startsWith(class174.field2398)) {
                                var457 = 10;
                                var454 = var454.substring(class174.field2398.length());
                            } else if (var456.startsWith(class174.field2559)) {
                                var457 = 11;
                                var454 = var454.substring(class174.field2559.length());
                            } else if (client.field291 != 0) {
                                if (var456.startsWith(class174.field2538)) {
                                    var457 = 0;
                                    var454 = var454.substring(class174.field2538.length());
                                } else if (var456.startsWith(class174.field2540)) {
                                    var457 = 1;
                                    var454 = var454.substring(class174.field2540.length());
                                } else if (var456.startsWith(class174.field2552)) {
                                    var457 = 2;
                                    var454 = var454.substring(class174.field2552.length());
                                } else if (var456.startsWith(class174.field2544)) {
                                    var457 = 3;
                                    var454 = var454.substring(class174.field2544.length());
                                } else if (var456.startsWith(class174.field2546)) {
                                    var457 = 4;
                                    var454 = var454.substring(class174.field2546.length());
                                } else if (var456.startsWith(class174.field2454)) {
                                    var457 = 5;
                                    var454 = var454.substring(class174.field2454.length());
                                } else if (var456.startsWith(class174.field2416)) {
                                    var457 = 6;
                                    var454 = var454.substring(class174.field2416.length());
                                } else if (var456.startsWith(class174.field2513)) {
                                    var457 = 7;
                                    var454 = var454.substring(class174.field2513.length());
                                } else if (var456.startsWith(class174.field2554)) {
                                    var457 = 8;
                                    var454 = var454.substring(class174.field2554.length());
                                } else if (var456.startsWith(class174.field2556)) {
                                    var457 = 9;
                                    var454 = var454.substring(class174.field2556.length());
                                } else if (var456.startsWith(class174.field2400)) {
                                    var457 = 10;
                                    var454 = var454.substring(class174.field2400.length());
                                } else if (var456.startsWith(class174.field2560)) {
                                    var457 = 11;
                                    var454 = var454.substring(class174.field2560.length());
                                }
                            }
                            String var458 = var454.toLowerCase();
                            byte var459 = 0;
                            if (var458.startsWith(class174.field2561)) {
                                var459 = 1;
                                var454 = var454.substring(class174.field2561.length());
                            } else if (var458.startsWith(class174.field2563)) {
                                var459 = 2;
                                var454 = var454.substring(class174.field2563.length());
                            } else if (var458.startsWith(class174.field2479)) {
                                var459 = 3;
                                var454 = var454.substring(class174.field2479.length());
                            } else if (var458.startsWith(class174.field2607)) {
                                var459 = 4;
                                var454 = var454.substring(class174.field2607.length());
                            } else if (var458.startsWith(class174.field2569)) {
                                var459 = 5;
                                var454 = var454.substring(class174.field2569.length());
                            } else if (client.field291 != 0) {
                                if (var458.startsWith(class174.field2562)) {
                                    var459 = 1;
                                    var454 = var454.substring(class174.field2562.length());
                                } else if (var458.startsWith(class174.field2564)) {
                                    var459 = 2;
                                    var454 = var454.substring(class174.field2564.length());
                                } else if (var458.startsWith(class174.field2566)) {
                                    var459 = 3;
                                    var454 = var454.substring(class174.field2566.length());
                                } else if (var458.startsWith(class174.field2568)) {
                                    var459 = 4;
                                    var454 = var454.substring(class174.field2568.length());
                                } else if (var458.startsWith(class174.field2570)) {
                                    var459 = 5;
                                    var454 = var454.substring(class174.field2570.length());
                                }
                            }
                            client.field295.method2783(110);
                            client.field295.method2746(0);
                            int var460 = client.field295.field2091;
                            client.field295.method2746(var455);
                            client.field295.method2746(var457);
                            client.field295.method2746(var459);
                            class211.method3009(client.field295, var454);
                            client.field295.method2570(client.field295.field2091 - var460);
                            continue;
                        }
                        if (var501 == 5009) {
                            var6 -= 2;
                            String var461 = field722[var6];
                            String var462 = field722[var6 + 1];
                            client.field295.method2783(142);
                            client.field295.method2560(0);
                            int var463 = client.field295.field2091;
                            client.field295.method2571(var461);
                            class211.method3009(client.field295, var462);
                            client.field295.method2569(client.field295.field2091 - var463);
                            continue;
                        }
                        if (var501 == 5015) {
                            String var464;
                            if (Statics.field810 == null || Statics.field810.field241 == null) {
                                var464 = "";
                            } else {
                                var464 = Statics.field810.field241;
                            }
                            field722[var6++] = var464;
                            continue;
                        }
                        if (var501 == 5016) {
                            field721[var5++] = client.field506;
                            continue;
                        }
                        if (var501 == 5017) {
                            var5--;
                            int var465 = field721[var5];
                            int[] var466 = field721;
                            int var467 = var5++;
                            class51 var468 = (class51) class48.field944.get(var465);
                            int var469;
                            if (var468 == null) {
                                var469 = 0;
                            } else {
                                var469 = var468.method860();
                            }
                            var466[var467] = var469;
                            continue;
                        }
                        if (var501 == 5018) {
                            var5--;
                            int var470 = field721[var5];
                            int[] var471 = field721;
                            int var472 = var5++;
                            class22 var473 = (class22) class48.field945.method2134((long) var470);
                            int var474;
                            if (var473 == null) {
                                var474 = -1;
                            } else if (class48.field941.field1897 == var473.field1882) {
                                var474 = -1;
                            } else {
                                var474 = ((class22) var473.field1882).field229;
                            }
                            var471[var472] = var474;
                            continue;
                        }
                        if (var501 == 5019) {
                            var5--;
                            int var475 = field721[var5];
                            field721[var5++] = class48.method2989(var475);
                            continue;
                        }
                        if (var501 == 5020) {
                            var6--;
                            String var476 = field722[var6];
                            if (var476.equalsIgnoreCase("toggleroof")) {
                                Statics.field2045.field690 = !Statics.field2045.field690;
                                class31.method748();
                                if (Statics.field2045.field690) {
                                    class48.method3375(99, "", "Roofs are now all hidden");
                                } else {
                                    class48.method3375(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var476.equalsIgnoreCase("displayfps")) {
                                client.field470 = !client.field470;
                            }
                            if (client.field359 >= 2) {
                                if (var476.equalsIgnoreCase("fpson")) {
                                    client.field470 = true;
                                }
                                if (var476.equalsIgnoreCase("fpsoff")) {
                                    client.field470 = false;
                                }
                                if (var476.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var476.equalsIgnoreCase("clientdrop")) {
                                    client.method2998();
                                }
                                if (var476.equalsIgnoreCase("errortest") && client.field288 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field295.method2783(26);
                            client.field295.method2746(var476.length() + 1);
                            client.field295.method2571(var476);
                            continue;
                        }
                        if (var501 == 5021) {
                            var6--;
                            client.field533 = field722[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var501 == 5022) {
                            field722[var6++] = client.field533;
                            continue;
                        }
                    }
                } else {
                    class170 var81;
                    if (var501 >= 2000) {
                        var501 -= 1000;
                        var5--;
                        var81 = class170.method3227(field721[var5]);
                    } else {
                        var81 = var51 ? Statics.field1539 : Statics.field719;
                    }
                    if (var501 == 1300) {
                        var5--;
                        int var82 = field721[var5] - 1;
                        if (var82 >= 0 && var82 <= 9) {
                            var6--;
                            var81.method2909(var82, field722[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var501 == 1301) {
                        var5 -= 2;
                        int var83 = field721[var5];
                        int var84 = field721[var5 + 1];
                        var81.field2276 = class170.method562(var83, var84);
                        continue;
                    }
                    if (var501 == 1302) {
                        var5--;
                        var81.field2287 = field721[var5] == 1;
                        continue;
                    }
                    if (var501 == 1303) {
                        var5--;
                        var81.field2307 = field721[var5];
                        continue;
                    }
                    if (var501 == 1304) {
                        var5--;
                        var81.field2286 = field721[var5];
                        continue;
                    }
                    if (var501 == 1305) {
                        var6--;
                        var81.field2313 = field722[var6];
                        continue;
                    }
                    if (var501 == 1306) {
                        var6--;
                        var81.field2288 = field722[var6];
                        continue;
                    }
                    if (var501 == 1307) {
                        var81.field2283 = null;
                        continue;
                    }
                }
                if (var501 < 5400) {
                    if (var501 == 5306) {
                        field721[var5++] = client.method58();
                        continue;
                    }
                    if (var501 == 5307) {
                        var5--;
                        int var477 = field721[var5];
                        if (var477 == 1 || var477 == 2) {
                            client.method167(var477);
                        }
                        continue;
                    }
                    if (var501 == 5308) {
                        field721[var5++] = Statics.field2045.field692;
                        continue;
                    }
                    if (var501 == 5309) {
                        var5--;
                        int var478 = field721[var5];
                        if (var478 == 1 || var478 == 2) {
                            Statics.field2045.field692 = var478;
                            class31.method748();
                        }
                        continue;
                    }
                }
                if (var501 < 5600) {
                    if (var501 == 5504) {
                        var5 -= 2;
                        int var479 = field721[var5];
                        int var480 = field721[var5 + 1];
                        if (!client.field535) {
                            client.field372 = var479;
                            client.field373 = var480;
                        }
                        continue;
                    }
                    if (var501 == 5505) {
                        field721[var5++] = client.field372;
                        continue;
                    }
                    if (var501 == 5506) {
                        field721[var5++] = client.field373;
                        continue;
                    }
                    if (var501 == 5530) {
                        var5--;
                        int var481 = field721[var5];
                        if (var481 < 0) {
                            var481 = 0;
                        }
                        client.field378 = var481;
                        continue;
                    }
                    if (var501 == 5531) {
                        field721[var5++] = client.field378;
                        continue;
                    }
                }
                if (var501 >= 5700 || var501 != 5630) {
                    if (var501 < 6300) {
                        if (var501 == 6200) {
                            var5 -= 2;
                            client.field541 = (short) field721[var5];
                            if (client.field541 <= 0) {
                                client.field541 = 256;
                            }
                            client.field542 = (short) field721[var5 + 1];
                            if (client.field542 <= 0) {
                                client.field542 = 205;
                            }
                            continue;
                        }
                        if (var501 == 6201) {
                            var5 -= 2;
                            client.field383 = (short) field721[var5];
                            if (client.field383 <= 0) {
                                client.field383 = 256;
                            }
                            client.field544 = (short) field721[var5 + 1];
                            if (client.field544 <= 0) {
                                client.field544 = 320;
                            }
                            continue;
                        }
                        if (var501 == 6202) {
                            var5 -= 4;
                            client.field393 = (short) field721[var5];
                            if (client.field393 <= 0) {
                                client.field393 = 1;
                            }
                            client.field546 = (short) field721[var5 + 1];
                            if (client.field546 <= 0) {
                                client.field546 = 32767;
                            } else if (client.field546 < client.field393) {
                                client.field546 = client.field393;
                            }
                            client.field547 = (short) field721[var5 + 2];
                            if (client.field547 <= 0) {
                                client.field547 = 1;
                            }
                            client.field548 = (short) field721[var5 + 3];
                            if (client.field548 <= 0) {
                                client.field548 = 32767;
                            } else if (client.field548 < client.field547) {
                                client.field548 = client.field547;
                            }
                            continue;
                        }
                        if (var501 == 6203) {
                            if (client.field422 == null) {
                                field721[var5++] = -1;
                                field721[var5++] = -1;
                            } else {
                                client.method698(0, 0, client.field422.field2264, client.field422.field2225, false);
                                field721[var5++] = client.field551;
                                field721[var5++] = client.field552;
                            }
                            continue;
                        }
                        if (var501 == 6204) {
                            field721[var5++] = client.field383;
                            field721[var5++] = client.field544;
                            continue;
                        }
                        if (var501 == 6205) {
                            field721[var5++] = client.field541;
                            field721[var5++] = client.field542;
                            continue;
                        }
                    }
                    if (var501 < 6600) {
                        if (var501 == 6500) {
                            field721[var5++] = class30.method1358() ? 1 : 0;
                            continue;
                        }
                        if (var501 == 6501) {
                            class30.field674 = 0;
                            class30 var482;
                            if (class30.field674 < class30.field673) {
                                var482 = Statics.field1713[++class30.field674 - 1];
                            } else {
                                var482 = null;
                            }
                            if (var482 == null) {
                                field721[var5++] = -1;
                                field721[var5++] = 0;
                                field722[var6++] = "";
                                field721[var5++] = 0;
                                field721[var5++] = 0;
                                field722[var6++] = "";
                            } else {
                                field721[var5++] = var482.field687;
                                field721[var5++] = var482.field678;
                                field722[var6++] = var482.field681;
                                field721[var5++] = var482.field676;
                                field721[var5++] = var482.field677;
                                field722[var6++] = var482.field680;
                            }
                            continue;
                        }
                        if (var501 == 6502) {
                            class30 var485;
                            if (class30.field674 < class30.field673) {
                                var485 = Statics.field1713[++class30.field674 - 1];
                            } else {
                                var485 = null;
                            }
                            if (var485 == null) {
                                field721[var5++] = -1;
                                field721[var5++] = 0;
                                field722[var6++] = "";
                                field721[var5++] = 0;
                                field721[var5++] = 0;
                                field722[var6++] = "";
                            } else {
                                field721[var5++] = var485.field687;
                                field721[var5++] = var485.field678;
                                field722[var6++] = var485.field681;
                                field721[var5++] = var485.field676;
                                field721[var5++] = var485.field677;
                                field722[var6++] = var485.field680;
                            }
                            continue;
                        }
                        if (var501 == 6506) {
                            var5--;
                            int var487 = field721[var5];
                            class30 var488 = null;
                            for (int var489 = 0; var489 < class30.field673; var489++) {
                                if (Statics.field1713[var489].field687 == var487) {
                                    var488 = Statics.field1713[var489];
                                    break;
                                }
                            }
                            if (var488 == null) {
                                field721[var5++] = -1;
                                field721[var5++] = 0;
                                field722[var6++] = "";
                                field721[var5++] = 0;
                                field721[var5++] = 0;
                                field722[var6++] = "";
                            } else {
                                field721[var5++] = var488.field687;
                                field721[var5++] = var488.field678;
                                field722[var6++] = var488.field681;
                                field721[var5++] = var488.field676;
                                field721[var5++] = var488.field677;
                                field722[var6++] = var488.field680;
                            }
                            continue;
                        }
                        if (var501 == 6507) {
                            var5 -= 4;
                            int var490 = field721[var5];
                            boolean var491 = field721[var5 + 1] == 1;
                            int var492 = field721[var5 + 2];
                            boolean var493 = field721[var5 + 3] == 1;
                            class30.method2009(var490, var491, var492, var493);
                            continue;
                        }
                        if (var501 == 6511) {
                            var5--;
                            int var494 = field721[var5];
                            if (var494 >= 0 && var494 < class30.field673) {
                                class30 var495 = Statics.field1713[var494];
                                field721[var5++] = var495.field687;
                                field721[var5++] = var495.field678;
                                field722[var6++] = var495.field681;
                                field721[var5++] = var495.field676;
                                field721[var5++] = var495.field677;
                                field722[var6++] = var495.field680;
                                continue;
                            }
                            field721[var5++] = -1;
                            field721[var5++] = 0;
                            field722[var6++] = "";
                            field721[var5++] = 0;
                            field721[var5++] = 0;
                            field722[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field454 = 250;
            }
        } catch (Exception var500) {
            StringBuilder var497 = new StringBuilder(30);
            var497.append("").append(var4.field1879).append(" ");
            for (int var498 = field723 - 1; var498 >= 0; var498--) {
                var497.append("").append(field733[var498].field119.field1879).append(" ");
            }
            var497.append("").append(var10);
            class102.method1780(var497.toString(), var500);
        }
    }

    @ObfuscatedName("fd.f(II)V")
    public static void method2992(int arg0) {
        if (arg0 == -1 || !class170.method3657(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2298[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3.field2290 != null) {
                class19 var4 = new class19();
                var4.field188 = var3;
                var4.field189 = var3.field2290;
                method84(var4, 2000000);
            }
        }
    }
}
