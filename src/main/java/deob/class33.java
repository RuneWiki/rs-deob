package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ai")
public class class33 {

    @ObfuscatedName("ai.w")
    public static int[] field735 = new int[5];

    @ObfuscatedName("ai.j")
    public static int[][] field721 = new int[5][5000];

    @ObfuscatedName("ai.q")
    public static int[] field717 = new int[1000];

    @ObfuscatedName("ai.d")
    public static String[] field718 = new String[1000];

    @ObfuscatedName("ai.n")
    public static int field713 = 0;

    @ObfuscatedName("ai.c")
    public static class11[] field720 = new class11[50];

    @ObfuscatedName("ai.i")
    public static Calendar field712 = Calendar.getInstance();

    @ObfuscatedName("ai.v")
    public static final String[] field723 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ai.a")
    public static int field724 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.k(Lf;I)V")
    public static void method119(class19 arg0) {
        method1812(arg0, 200000);
    }

    @ObfuscatedName("ce.y(Lf;IB)V")
    public static void method1812(class19 arg0, int arg1) {
        Object[] var2 = arg0.field199;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method2436(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field935;
        int[] var9 = var4.field936;
        byte var10 = -1;
        field713 = 0;
        try {
            Statics.field715 = new int[var4.field943];
            int var11 = 0;
            Statics.field714 = new String[var4.field939];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field192;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field189;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field191 == null ? -1 : arg0.field191.field2050;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field194;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field191 == null ? -1 : arg0.field191.field2051;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field195 == null ? -1 : arg0.field195.field2050;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field195 == null ? -1 : arg0.field195.field2051;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field196;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field197;
                    }
                    Statics.field715[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field201;
                    }
                    Statics.field714[var12++] = var15;
                }
            }
            int var16 = 0;
            field724 = arg0.field198;
            label3183: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var501 = var8[var7];
                if (var501 < 100) {
                    if (var501 == 0) {
                        field717[var5++] = var9[var7];
                        continue;
                    }
                    if (var501 == 1) {
                        int var17 = var9[var7];
                        field717[var5++] = class147.field2012[var17];
                        continue;
                    }
                    if (var501 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class147.field2012[var18] = field717[var5];
                        client.method3088(var18);
                        continue;
                    }
                    if (var501 == 3) {
                        field718[var6++] = var4.field938[var7];
                        continue;
                    }
                    if (var501 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var501 == 7) {
                        var5 -= 2;
                        if (field717[var5 + 1] != field717[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var501 == 8) {
                        var5 -= 2;
                        if (field717[var5 + 1] == field717[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var501 == 9) {
                        var5 -= 2;
                        if (field717[var5] < field717[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var501 == 10) {
                        var5 -= 2;
                        if (field717[var5] > field717[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var501 == 21) {
                        if (field713 == 0) {
                            return;
                        }
                        class11 var19 = field720[--field713];
                        var4 = var19.field91;
                        var8 = var4.field935;
                        var9 = var4.field936;
                        var7 = var19.field87;
                        Statics.field715 = var19.field89;
                        Statics.field714 = var19.field90;
                        continue;
                    }
                    if (var501 == 25) {
                        int var20 = var9[var7];
                        field717[var5++] = class147.method128(var20);
                        continue;
                    }
                    if (var501 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field717[var5];
                        class195 var23 = class195.method14(var21);
                        int var24 = var23.field2832;
                        int var25 = var23.field2833;
                        int var26 = var23.field2837;
                        int var27 = class147.field2014[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class147.field2012[var24] = class147.field2012[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var501 == 31) {
                        var5 -= 2;
                        if (field717[var5] <= field717[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var501 == 32) {
                        var5 -= 2;
                        if (field717[var5] >= field717[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var501 == 33) {
                        field717[var5++] = Statics.field715[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var501 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field715[var10001] = field717[var5];
                        continue;
                    }
                    if (var501 == 35) {
                        field718[var6++] = Statics.field714[var9[var7]];
                        continue;
                    }
                    if (var501 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field714[var10001] = field718[var6];
                        continue;
                    }
                    if (var501 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String var30 = class208.method3597(field718, var6, var29);
                        field718[var6++] = var30;
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
                        int var31 = var9[var7];
                        class49 var32 = class49.method2436(var31);
                        int[] var33 = new int[var32.field943];
                        String[] var34 = new String[var32.field939];
                        for (int var35 = 0; var35 < var32.field940; var35++) {
                            var33[var35] = field717[var5 - var32.field940 + var35];
                        }
                        for (int var36 = 0; var36 < var32.field942; var36++) {
                            var34[var36] = field718[var6 - var32.field942 + var36];
                        }
                        var5 -= var32.field940;
                        var6 -= var32.field942;
                        class11 var37 = new class11();
                        var37.field91 = var4;
                        var37.field87 = var7;
                        var37.field89 = Statics.field715;
                        var37.field90 = Statics.field714;
                        field720[++field713 - 1] = var37;
                        var4 = var32;
                        var8 = var32.field935;
                        var9 = var32.field936;
                        var7 = -1;
                        Statics.field715 = var33;
                        Statics.field714 = var34;
                        continue;
                    }
                    if (var501 == 42) {
                        field717[var5++] = Statics.field914.method819(var9[var7]);
                        continue;
                    }
                    if (var501 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field914.method820(var10001, field717[var5]);
                        continue;
                    }
                    if (var501 == 44) {
                        int var38 = var9[var7] >> 16;
                        int var39 = var9[var7] & 0xFFFF;
                        var5--;
                        int var40 = field717[var5];
                        if (var40 >= 0 && var40 <= 5000) {
                            field735[var38] = var40;
                            byte var41 = -1;
                            if (var39 == 105) {
                                var41 = 0;
                            }
                            int var42 = 0;
                            while (true) {
                                if (var42 >= var40) {
                                    continue label3183;
                                }
                                field721[var38][var42] = var41;
                                var42++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var501 == 45) {
                        int var43 = var9[var7];
                        var5--;
                        int var44 = field717[var5];
                        if (var44 >= 0 && var44 < field735[var43]) {
                            field717[var5++] = field721[var43][var44];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var501 == 46) {
                        int var45 = var9[var7];
                        var5 -= 2;
                        int var46 = field717[var5];
                        if (var46 >= 0 && var46 < field735[var45]) {
                            field721[var45][var46] = field717[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var501 == 47) {
                        String var47 = Statics.field914.method828(var9[var7]);
                        if (var47 == null) {
                            var47 = "null";
                        }
                        field718[var6++] = var47;
                        continue;
                    }
                    if (var501 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field914.method845(var10001, field718[var6]);
                        continue;
                    }
                }
                boolean var48;
                if (var9[var7] == 1) {
                    var48 = true;
                } else {
                    var48 = false;
                }
                if (var501 < 1000) {
                    if (var501 == 100) {
                        var5 -= 3;
                        int var49 = field717[var5];
                        int var50 = field717[var5 + 1];
                        int var51 = field717[var5 + 2];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class151 var52 = class151.method744(var49);
                        if (var52.field2174 == null) {
                            var52.field2174 = new class151[var51 + 1];
                        }
                        if (var52.field2174.length <= var51) {
                            class151[] var53 = new class151[var51 + 1];
                            for (int var54 = 0; var54 < var52.field2174.length; var54++) {
                                var53[var54] = var52.field2174[var54];
                            }
                            var52.field2174 = var53;
                        }
                        if (var51 > 0 && var52.field2174[var51 - 1] == null) {
                            throw new RuntimeException("" + (var51 - 1));
                        }
                        class151 var55 = new class151();
                        var55.field2089 = var50;
                        var55.field2127 = var55.field2050 = var52.field2050;
                        var55.field2051 = var51;
                        var55.field2049 = true;
                        var52.field2174[var51] = var55;
                        if (var48) {
                            Statics.field732 = var55;
                        } else {
                            Statics.field2624 = var55;
                        }
                        client.method29(var52);
                        continue;
                    }
                    if (var501 == 101) {
                        class151 var56 = var48 ? Statics.field732 : Statics.field2624;
                        class151 var57 = class151.method744(var56.field2050);
                        var57.field2174[var56.field2051] = null;
                        client.method29(var57);
                        continue;
                    }
                    if (var501 == 102) {
                        var5--;
                        class151 var58 = class151.method744(field717[var5]);
                        var58.field2174 = null;
                        client.method29(var58);
                        continue;
                    }
                    if (var501 == 200) {
                        var5 -= 2;
                        int var59 = field717[var5];
                        int var60 = field717[var5 + 1];
                        class151 var61 = class151.method1382(var59, var60);
                        if (var61 != null && var60 != -1) {
                            field717[var5++] = 1;
                            if (var48) {
                                Statics.field732 = var61;
                            } else {
                                Statics.field2624 = var61;
                            }
                            continue;
                        }
                        field717[var5++] = 0;
                        continue;
                    }
                    if (var501 == 201) {
                        var5--;
                        class151 var62 = class151.method744(field717[var5]);
                        if (var62 == null) {
                            field717[var5++] = 0;
                        } else {
                            field717[var5++] = 1;
                            if (var48) {
                                Statics.field732 = var62;
                            } else {
                                Statics.field2624 = var62;
                            }
                        }
                        continue;
                    }
                } else if (!(var501 < 1000 || var501 >= 1100) || !(var501 < 2000 || var501 >= 2100)) {
                    int var63 = -1;
                    class151 var64;
                    if (var501 >= 2000) {
                        var501 -= 1000;
                        var5--;
                        var63 = field717[var5];
                        var64 = class151.method744(var63);
                    } else {
                        var64 = var48 ? Statics.field732 : Statics.field2624;
                    }
                    if (var501 == 1000) {
                        var5 -= 4;
                        var64.field2059 = field717[var5];
                        var64.field2060 = field717[var5 + 1];
                        var64.field2112 = field717[var5 + 2];
                        var64.field2180 = field717[var5 + 3];
                        client.method29(var64);
                        client.method1851(var64);
                        if (var63 != -1 && var64.field2089 == 0) {
                            client.method234(Statics.field2043[var63 >> 16], var64, false);
                        }
                        continue;
                    }
                    if (var501 == 1001) {
                        var5 -= 4;
                        var64.field2052 = field717[var5];
                        var64.field2062 = field717[var5 + 1];
                        var64.field2057 = field717[var5 + 2];
                        var64.field2152 = field717[var5 + 3];
                        client.method29(var64);
                        client.method1851(var64);
                        if (var63 != -1 && var64.field2089 == 0) {
                            client.method234(Statics.field2043[var63 >> 16], var64, false);
                        }
                        continue;
                    }
                    if (var501 == 1003) {
                        var5--;
                        boolean var65 = field717[var5] == 1;
                        if (var64.field2070 != var65) {
                            var64.field2070 = var65;
                            client.method29(var64);
                        }
                        continue;
                    }
                    if (var501 == 1005) {
                        var5--;
                        var64.field2183 = field717[var5] == 1;
                        continue;
                    }
                    if (var501 == 1006) {
                        var5--;
                        var64.field2184 = field717[var5] == 1;
                        continue;
                    }
                } else if (var501 >= 1100 && var501 < 1200 || var501 >= 2100 && var501 < 2200) {
                    int var66 = -1;
                    class151 var67;
                    if (var501 >= 2000) {
                        var501 -= 1000;
                        var5--;
                        var66 = field717[var5];
                        var67 = class151.method744(var66);
                    } else {
                        var67 = var48 ? Statics.field732 : Statics.field2624;
                    }
                    if (var501 == 1100) {
                        var5 -= 2;
                        var67.field2095 = field717[var5];
                        if (var67.field2095 > var67.field2073 - var67.field2108) {
                            var67.field2095 = var67.field2073 - var67.field2108;
                        }
                        if (var67.field2095 < 0) {
                            var67.field2095 = 0;
                        }
                        var67.field2072 = field717[var5 + 1];
                        if (var67.field2072 > var67.field2111 - var67.field2169) {
                            var67.field2072 = var67.field2111 - var67.field2169;
                        }
                        if (var67.field2072 < 0) {
                            var67.field2072 = 0;
                        }
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1101) {
                        var5--;
                        var67.field2151 = field717[var5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1102) {
                        var5--;
                        var67.field2100 = field717[var5] == 1;
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1103) {
                        var5--;
                        var67.field2178 = field717[var5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1104) {
                        var5--;
                        var67.field2083 = field717[var5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1105) {
                        var5--;
                        var67.field2085 = field717[var5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1106) {
                        var5--;
                        var67.field2079 = field717[var5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1107) {
                        var5--;
                        var67.field2088 = field717[var5] == 1;
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1108) {
                        var67.field2093 = 1;
                        var5--;
                        var67.field2094 = field717[var5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1109) {
                        var5 -= 6;
                        var67.field2161 = field717[var5];
                        var67.field2115 = field717[var5 + 1];
                        var67.field2101 = field717[var5 + 2];
                        var67.field2102 = field717[var5 + 3];
                        var67.field2103 = field717[var5 + 4];
                        var67.field2104 = field717[var5 + 5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1110) {
                        var5--;
                        int var68 = field717[var5];
                        if (var67.field2165 != var68) {
                            var67.field2165 = var68;
                            var67.field2055 = 0;
                            var67.field2177 = 0;
                            client.method29(var67);
                        }
                        continue;
                    }
                    if (var501 == 1111) {
                        var5--;
                        var67.field2122 = field717[var5] == 1;
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1112) {
                        var6--;
                        String var69 = field718[var6];
                        if (!var69.equals(var67.field2144)) {
                            var67.field2144 = var69;
                            client.method29(var67);
                        }
                        continue;
                    }
                    if (var501 == 1113) {
                        var5--;
                        var67.field2109 = field717[var5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1114) {
                        var5 -= 3;
                        var67.field2113 = field717[var5];
                        var67.field2081 = field717[var5 + 1];
                        var67.field2114 = field717[var5 + 2];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1115) {
                        var5--;
                        var67.field2164 = field717[var5] == 1;
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1116) {
                        var5--;
                        var67.field2116 = field717[var5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1117) {
                        var5--;
                        var67.field2090 = field717[var5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1118) {
                        var5--;
                        var67.field2091 = field717[var5] == 1;
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1119) {
                        var5--;
                        var67.field2092 = field717[var5] == 1;
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1120) {
                        var5 -= 2;
                        var67.field2073 = field717[var5];
                        var67.field2111 = field717[var5 + 1];
                        client.method29(var67);
                        if (var66 != -1 && var67.field2089 == 0) {
                            client.method234(Statics.field2043[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var501 == 1121) {
                        int var70 = var67.field2050;
                        int var71 = var67.field2051;
                        client.field322.method2993(136);
                        client.field322.method2776(var70);
                        client.field322.method2900(var71);
                        client.field310 = var67;
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1122) {
                        var5--;
                        var67.field2063 = field717[var5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1123) {
                        var5--;
                        var67.field2076 = field717[var5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1124) {
                        var5--;
                        var67.field2082 = field717[var5];
                        client.method29(var67);
                        continue;
                    }
                    if (var501 == 1125) {
                        var5--;
                        int var72 = field717[var5];
                        class222[] var73 = new class222[] { class222.field3181, class222.field3182, class222.field3184, class222.field3185, class222.field3183 };
                        class222 var74 = (class222) class156.method725(var73, var72);
                        if (var74 != null) {
                            var67.field2080 = var74;
                            client.method29(var67);
                        }
                        continue;
                    }
                } else if (!(var501 < 1200 || var501 >= 1300) || !(var501 < 2200 || var501 >= 2300)) {
                    class151 var75;
                    if (var501 >= 2000) {
                        var501 -= 1000;
                        var5--;
                        var75 = class151.method744(field717[var5]);
                    } else {
                        var75 = var48 ? Statics.field732 : Statics.field2624;
                    }
                    client.method29(var75);
                    if (var501 == 1200 || var501 == 1205 || var501 == 1212) {
                        var5 -= 2;
                        int var76 = field717[var5];
                        int var77 = field717[var5 + 1];
                        var75.field2066 = var76;
                        var75.field2171 = var77;
                        class199 var78 = class199.method2569(var76);
                        var75.field2101 = var78.field2944;
                        var75.field2102 = var78.field2945;
                        var75.field2103 = var78.field2946;
                        var75.field2161 = var78.field2947;
                        var75.field2115 = var78.field2965;
                        var75.field2104 = var78.field2943;
                        if (var501 == 1205) {
                            var75.field2058 = 0;
                        } else if (var501 == 1212 | var78.field2968 == 1) {
                            var75.field2058 = 1;
                        } else {
                            var75.field2058 = 2;
                        }
                        if (var75.field2105 > 0) {
                            var75.field2104 = var75.field2104 * 32 / var75.field2105;
                        } else if (var75.field2052 > 0) {
                            var75.field2104 = var75.field2104 * 32 / var75.field2052;
                        }
                        continue;
                    }
                    if (var501 == 1201) {
                        var75.field2093 = 2;
                        var5--;
                        var75.field2094 = field717[var5];
                        continue;
                    }
                    if (var501 == 1202) {
                        var75.field2093 = 3;
                        var75.field2094 = Statics.field1425.field244.method2543();
                        continue;
                    }
                } else if (var501 >= 1300 && var501 < 1400 || var501 >= 2300 && var501 < 2400) {
                    class151 var79;
                    if (var501 >= 2000) {
                        var501 -= 1000;
                        var5--;
                        var79 = class151.method744(field717[var5]);
                    } else {
                        var79 = var48 ? Statics.field732 : Statics.field2624;
                    }
                    if (var501 == 1300) {
                        var5--;
                        int var80 = field717[var5] - 1;
                        if (var80 >= 0 && var80 <= 9) {
                            var6--;
                            var79.method2630(var80, field718[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var501 == 1301) {
                        var5 -= 2;
                        int var81 = field717[var5];
                        int var82 = field717[var5 + 1];
                        var79.field2125 = class151.method1382(var81, var82);
                        continue;
                    }
                    if (var501 == 1302) {
                        var5--;
                        var79.field2173 = field717[var5] == 1;
                        continue;
                    }
                    if (var501 == 1303) {
                        var5--;
                        var79.field2126 = field717[var5];
                        continue;
                    }
                    if (var501 == 1304) {
                        var5--;
                        var79.field2098 = field717[var5];
                        continue;
                    }
                    if (var501 == 1305) {
                        var6--;
                        var79.field2099 = field718[var6];
                        continue;
                    }
                    if (var501 == 1306) {
                        var6--;
                        var79.field2129 = field718[var6];
                        continue;
                    }
                    if (var501 == 1307) {
                        var79.field2124 = null;
                        continue;
                    }
                } else {
                    if (var501 >= 1400 && var501 < 1500 || var501 >= 2400 && var501 < 2500) {
                        class151 var83;
                        if (var501 >= 2000) {
                            var501 -= 1000;
                            var5--;
                            var83 = class151.method744(field717[var5]);
                        } else {
                            var83 = var48 ? Statics.field732 : Statics.field2624;
                        }
                        var6--;
                        String var84 = field718[var6];
                        int[] var85 = null;
                        if (var84.length() > 0 && var84.charAt(var84.length() - 1) == 'Y') {
                            var5--;
                            int var86 = field717[var5];
                            if (var86 > 0) {
                                var85 = new int[var86];
                                while (var86-- > 0) {
                                    var5--;
                                    var85[var86] = field717[var5];
                                }
                            }
                            var84 = var84.substring(0, var84.length() - 1);
                        }
                        Object[] var87 = new Object[var84.length() + 1];
                        for (int var88 = var87.length - 1; var88 >= 1; var88--) {
                            if (var84.charAt(var88 - 1) == 's') {
                                var6--;
                                var87[var88] = field718[var6];
                            } else {
                                var5--;
                                var87[var88] = Integer.valueOf(field717[var5]);
                            }
                        }
                        var5--;
                        int var89 = field717[var5];
                        if (var89 == -1) {
                            var87 = null;
                        } else {
                            var87[0] = Integer.valueOf(var89);
                        }
                        if (var501 == 1400) {
                            var83.field2132 = var87;
                        }
                        if (var501 == 1401) {
                            var83.field2135 = var87;
                        }
                        if (var501 == 1402) {
                            var83.field2134 = var87;
                        }
                        if (var501 == 1403) {
                            var83.field2136 = var87;
                        }
                        if (var501 == 1404) {
                            var83.field2138 = var87;
                        }
                        if (var501 == 1405) {
                            var83.field2139 = var87;
                        }
                        if (var501 == 1406) {
                            var83.field2142 = var87;
                        }
                        if (var501 == 1407) {
                            var83.field2074 = var87;
                            var83.field2128 = var85;
                        }
                        if (var501 == 1408) {
                            var83.field2149 = var87;
                        }
                        if (var501 == 1409) {
                            var83.field2065 = var87;
                        }
                        if (var501 == 1410) {
                            var83.field2140 = var87;
                        }
                        if (var501 == 1411) {
                            var83.field2133 = var87;
                        }
                        if (var501 == 1412) {
                            var83.field2137 = var87;
                        }
                        if (var501 == 1414) {
                            var83.field2145 = var87;
                            var83.field2146 = var85;
                        }
                        if (var501 == 1415) {
                            var83.field2087 = var87;
                            var83.field2148 = var85;
                        }
                        if (var501 == 1416) {
                            var83.field2097 = var87;
                        }
                        if (var501 == 1417) {
                            var83.field2107 = var87;
                        }
                        if (var501 == 1418) {
                            var83.field2071 = var87;
                        }
                        if (var501 == 1419) {
                            var83.field2153 = var87;
                        }
                        if (var501 == 1420) {
                            var83.field2154 = var87;
                        }
                        if (var501 == 1421) {
                            var83.field2155 = var87;
                        }
                        if (var501 == 1422) {
                            var83.field2156 = var87;
                        }
                        if (var501 == 1423) {
                            var83.field2157 = var87;
                        }
                        if (var501 == 1424) {
                            var83.field2158 = var87;
                        }
                        if (var501 == 1425) {
                            var83.field2160 = var87;
                        }
                        if (var501 == 1426) {
                            var83.field2056 = var87;
                        }
                        if (var501 == 1427) {
                            var83.field2159 = var87;
                        }
                        var83.field2130 = true;
                        continue;
                    }
                    if (var501 < 1600) {
                        class151 var90 = var48 ? Statics.field732 : Statics.field2624;
                        if (var501 == 1500) {
                            field717[var5++] = var90.field2143;
                            continue;
                        }
                        if (var501 == 1501) {
                            field717[var5++] = var90.field2064;
                            continue;
                        }
                        if (var501 == 1502) {
                            field717[var5++] = var90.field2108;
                            continue;
                        }
                        if (var501 == 1503) {
                            field717[var5++] = var90.field2169;
                            continue;
                        }
                        if (var501 == 1504) {
                            field717[var5++] = var90.field2070 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 1505) {
                            field717[var5++] = var90.field2127;
                            continue;
                        }
                    } else if (var501 < 1700) {
                        class151 var91 = var48 ? Statics.field732 : Statics.field2624;
                        if (var501 == 1600) {
                            field717[var5++] = var91.field2095;
                            continue;
                        }
                        if (var501 == 1601) {
                            field717[var5++] = var91.field2072;
                            continue;
                        }
                        if (var501 == 1602) {
                            field718[var6++] = var91.field2144;
                            continue;
                        }
                        if (var501 == 1603) {
                            field717[var5++] = var91.field2073;
                            continue;
                        }
                        if (var501 == 1604) {
                            field717[var5++] = var91.field2111;
                            continue;
                        }
                        if (var501 == 1605) {
                            field717[var5++] = var91.field2104;
                            continue;
                        }
                        if (var501 == 1606) {
                            field717[var5++] = var91.field2101;
                            continue;
                        }
                        if (var501 == 1607) {
                            field717[var5++] = var91.field2103;
                            continue;
                        }
                        if (var501 == 1608) {
                            field717[var5++] = var91.field2102;
                            continue;
                        }
                        if (var501 == 1609) {
                            field717[var5++] = var91.field2178;
                            continue;
                        }
                        if (var501 == 1610) {
                            field717[var5++] = var91.field2082;
                            continue;
                        }
                        if (var501 == 1611) {
                            field717[var5++] = var91.field2151;
                            continue;
                        }
                        if (var501 == 1612) {
                            field717[var5++] = var91.field2076;
                            continue;
                        }
                        if (var501 == 1613) {
                            field717[var5++] = var91.field2080.method755();
                            continue;
                        }
                    } else if (var501 < 1800) {
                        class151 var92 = var48 ? Statics.field732 : Statics.field2624;
                        if (var501 == 1700) {
                            field717[var5++] = var92.field2066;
                            continue;
                        }
                        if (var501 == 1701) {
                            if (var92.field2066 == -1) {
                                field717[var5++] = 0;
                            } else {
                                field717[var5++] = var92.field2171;
                            }
                            continue;
                        }
                        if (var501 == 1702) {
                            field717[var5++] = var92.field2051;
                            continue;
                        }
                    } else if (var501 < 1900) {
                        class151 var93 = var48 ? Statics.field732 : Statics.field2624;
                        if (var501 == 1800) {
                            int[] var94 = field717;
                            int var95 = var5++;
                            int var96 = client.method1786(var93);
                            int var97 = var96 >> 11 & 0x3F;
                            var94[var95] = var97;
                            continue;
                        }
                        if (var501 == 1801) {
                            var5--;
                            int var98 = field717[var5];
                            int var502 = var98 - 1;
                            if (var93.field2124 != null && var502 < var93.field2124.length && var93.field2124[var502] != null) {
                                field718[var6++] = var93.field2124[var502];
                                continue;
                            }
                            field718[var6++] = "";
                            continue;
                        }
                        if (var501 == 1802) {
                            if (var93.field2099 == null) {
                                field718[var6++] = "";
                            } else {
                                field718[var6++] = var93.field2099;
                            }
                            continue;
                        }
                    } else if (var501 >= 1900 && var501 < 2000 || var501 >= 2900 && var501 < 3000) {
                        class151 var99;
                        if (var501 >= 2000) {
                            var501 -= 1000;
                            var5--;
                            var99 = class151.method744(field717[var5]);
                        } else {
                            var99 = var48 ? Statics.field732 : Statics.field2624;
                        }
                        if (var501 == 1927) {
                            if (field724 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var99.field2159 == null) {
                                return;
                            }
                            class19 var100 = new class19();
                            var100.field191 = var99;
                            var100.field199 = var99.field2159;
                            var100.field198 = field724 + 1;
                            client.field477.method2220(arg0);
                            continue;
                        }
                    } else if (var501 < 2600) {
                        var5--;
                        class151 var101 = class151.method744(field717[var5]);
                        if (var501 == 2500) {
                            field717[var5++] = var101.field2143;
                            continue;
                        }
                        if (var501 == 2501) {
                            field717[var5++] = var101.field2064;
                            continue;
                        }
                        if (var501 == 2502) {
                            field717[var5++] = var101.field2108;
                            continue;
                        }
                        if (var501 == 2503) {
                            field717[var5++] = var101.field2169;
                            continue;
                        }
                        if (var501 == 2504) {
                            field717[var5++] = var101.field2070 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 2505) {
                            field717[var5++] = var101.field2127;
                            continue;
                        }
                    } else if (var501 < 2700) {
                        var5--;
                        class151 var102 = class151.method744(field717[var5]);
                        if (var501 == 2600) {
                            field717[var5++] = var102.field2095;
                            continue;
                        }
                        if (var501 == 2601) {
                            field717[var5++] = var102.field2072;
                            continue;
                        }
                        if (var501 == 2602) {
                            field718[var6++] = var102.field2144;
                            continue;
                        }
                        if (var501 == 2603) {
                            field717[var5++] = var102.field2073;
                            continue;
                        }
                        if (var501 == 2604) {
                            field717[var5++] = var102.field2111;
                            continue;
                        }
                        if (var501 == 2605) {
                            field717[var5++] = var102.field2104;
                            continue;
                        }
                        if (var501 == 2606) {
                            field717[var5++] = var102.field2101;
                            continue;
                        }
                        if (var501 == 2607) {
                            field717[var5++] = var102.field2103;
                            continue;
                        }
                        if (var501 == 2608) {
                            field717[var5++] = var102.field2102;
                            continue;
                        }
                        if (var501 == 2609) {
                            field717[var5++] = var102.field2178;
                            continue;
                        }
                        if (var501 == 2610) {
                            field717[var5++] = var102.field2082;
                            continue;
                        }
                        if (var501 == 2611) {
                            field717[var5++] = var102.field2151;
                            continue;
                        }
                        if (var501 == 2612) {
                            field717[var5++] = var102.field2076;
                            continue;
                        }
                        if (var501 == 2613) {
                            field717[var5++] = var102.field2080.method755();
                            continue;
                        }
                    } else if (var501 < 2800) {
                        if (var501 == 2700) {
                            var5--;
                            class151 var103 = class151.method744(field717[var5]);
                            field717[var5++] = var103.field2066;
                            continue;
                        }
                        if (var501 == 2701) {
                            var5--;
                            class151 var104 = class151.method744(field717[var5]);
                            if (var104.field2066 == -1) {
                                field717[var5++] = 0;
                            } else {
                                field717[var5++] = var104.field2171;
                            }
                            continue;
                        }
                        if (var501 == 2702) {
                            var5--;
                            int var105 = field717[var5];
                            class18 var106 = (class18) client.field439.method2171((long) var105);
                            if (var106 == null) {
                                field717[var5++] = 0;
                            } else {
                                field717[var5++] = 1;
                            }
                            continue;
                        }
                        if (var501 == 2706) {
                            field717[var5++] = client.field438;
                            continue;
                        }
                    } else if (var501 < 2900) {
                        var5--;
                        class151 var107 = class151.method744(field717[var5]);
                        if (var501 == 2800) {
                            int[] var108 = field717;
                            int var109 = var5++;
                            int var110 = client.method1786(var107);
                            int var111 = var110 >> 11 & 0x3F;
                            var108[var109] = var111;
                            continue;
                        }
                        if (var501 == 2801) {
                            var5--;
                            int var112 = field717[var5];
                            int var503 = var112 - 1;
                            if (var107.field2124 != null && var503 < var107.field2124.length && var107.field2124[var503] != null) {
                                field718[var6++] = var107.field2124[var503];
                                continue;
                            }
                            field718[var6++] = "";
                            continue;
                        }
                        if (var501 == 2802) {
                            if (var107.field2099 == null) {
                                field718[var6++] = "";
                            } else {
                                field718[var6++] = var107.field2099;
                            }
                            continue;
                        }
                    } else if (var501 < 3200) {
                        if (var501 == 3100) {
                            var6--;
                            String var113 = field718[var6];
                            class48.method888(0, "", var113);
                            continue;
                        }
                        if (var501 == 3101) {
                            var5 -= 2;
                            client.method189(Statics.field1425, field717[var5], field717[var5 + 1]);
                            continue;
                        }
                        if (var501 == 3103) {
                            client.method1923();
                            continue;
                        }
                        if (var501 == 3104) {
                            var6--;
                            String var114 = field718[var6];
                            int var115 = 0;
                            if (class208.method2953(var114)) {
                                var115 = class208.method3825(var114);
                            }
                            client.field322.method2993(181);
                            client.field322.method2863(var115);
                            continue;
                        }
                        if (var501 == 3105) {
                            var6--;
                            String var116 = field718[var6];
                            client.field322.method2993(186);
                            client.field322.method2718(var116.length() + 1);
                            client.field322.method2903(var116);
                            continue;
                        }
                        if (var501 == 3106) {
                            var6--;
                            String var117 = field718[var6];
                            client.field322.method2993(98);
                            client.field322.method2718(var117.length() + 1);
                            client.field322.method2903(var117);
                            continue;
                        }
                        if (var501 == 3107) {
                            var5--;
                            int var118 = field717[var5];
                            var6--;
                            String var119 = field718[var6];
                            client.method1926(var118, var119);
                            continue;
                        }
                        if (var501 == 3108) {
                            var5 -= 3;
                            int var120 = field717[var5];
                            int var121 = field717[var5 + 1];
                            int var122 = field717[var5 + 2];
                            class151 var123 = class151.method744(var122);
                            client.method612(var123, var120, var121);
                            continue;
                        }
                        if (var501 == 3109) {
                            var5 -= 2;
                            int var124 = field717[var5];
                            int var125 = field717[var5 + 1];
                            class151 var126 = var48 ? Statics.field732 : Statics.field2624;
                            client.method612(var126, var124, var125);
                            continue;
                        }
                        if (var501 == 3110) {
                            var5--;
                            Statics.field1810 = field717[var5] == 1;
                            continue;
                        }
                        if (var501 == 3111) {
                            field717[var5++] = Statics.field1457.field686 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3112) {
                            var5--;
                            Statics.field1457.field686 = field717[var5] == 1;
                            class31.method40();
                            continue;
                        }
                        if (var501 == 3113) {
                            var6--;
                            String var127 = field718[var6];
                            var5--;
                            boolean var128 = field717[var5] == 1;
                            if (!var128) {
                                class115.method170(var127, 3, "openjs");
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var127));
                                    continue;
                                } catch (Exception var499) {
                                }
                            }
                            if (class115.field1786.startsWith("win")) {
                                class115.method170(var127, 0, "openjs");
                            } else if (class115.field1786.startsWith("mac")) {
                                class115.method170(var127, 1, "openjs");
                            } else {
                                class115.method170(var127, 2, "openjs");
                            }
                            continue;
                        }
                        if (var501 == 3115) {
                            var5--;
                            int var130 = field717[var5];
                            client.field322.method2993(80);
                            client.field322.method2900(var130);
                            continue;
                        }
                        if (var501 == 3116) {
                            var5--;
                            int var131 = field717[var5];
                            var6 -= 2;
                            String var132 = field718[var6];
                            String var133 = field718[var6 + 1];
                            if (var132.length() <= 500 && var133.length() <= 500) {
                                client.field322.method2993(172);
                                client.field322.method2900(1 + class161.method1885(var132) + class161.method1885(var133));
                                client.field322.method2757(var131);
                                client.field322.method2903(var133);
                                client.field322.method2903(var132);
                            }
                            continue;
                        }
                    } else if (var501 < 3300) {
                        if (var501 == 3200) {
                            var5 -= 3;
                            client.method1461(field717[var5], field717[var5 + 1], field717[var5 + 2]);
                            continue;
                        }
                        if (var501 == 3201) {
                            var5--;
                            int var134 = field717[var5];
                            if (var134 == -1 && !client.field518) {
                                class139.method1616();
                            } else if (var134 != -1 && client.field517 != var134 && client.field516 != 0 && !client.field518) {
                                class139.method229(2, Statics.field924, var134, 0, client.field516, false);
                            }
                            client.field517 = var134;
                            continue;
                        }
                        if (var501 == 3202) {
                            var5 -= 2;
                            int var135 = field717[var5];
                            int var10000 = field717[var5 + 1];
                            if (client.field516 != 0 && var135 != -1) {
                                class139.method2715(Statics.field110, var135, 0, client.field516, false);
                                client.field518 = true;
                            }
                            continue;
                        }
                    } else if (var501 < 3400) {
                        if (var501 == 3300) {
                            field717[var5++] = client.field454;
                            continue;
                        }
                        if (var501 == 3301) {
                            var5 -= 2;
                            int var137 = field717[var5];
                            int var138 = field717[var5 + 1];
                            field717[var5++] = class13.method123(var137, var138);
                            continue;
                        }
                        if (var501 == 3302) {
                            var5 -= 2;
                            int var139 = field717[var5];
                            int var140 = field717[var5 + 1];
                            field717[var5++] = class13.method3056(var139, var140);
                            continue;
                        }
                        if (var501 == 3303) {
                            var5 -= 2;
                            int var141 = field717[var5];
                            int var142 = field717[var5 + 1];
                            int[] var143 = field717;
                            int var144 = var5++;
                            class13 var145 = (class13) class13.field122.method2171((long) var141);
                            int var146;
                            if (var145 == null) {
                                var146 = 0;
                            } else if (var142 == -1) {
                                var146 = 0;
                            } else {
                                int var147 = 0;
                                for (int var148 = 0; var148 < var145.field118.length; var148++) {
                                    if (var145.field123[var148] == var142) {
                                        var147 += var145.field118[var148];
                                    }
                                }
                                var146 = var147;
                            }
                            var143[var144] = var146;
                            continue;
                        }
                        if (var501 == 3304) {
                            var5--;
                            int var149 = field717[var5];
                            int[] var150 = field717;
                            int var151 = var5++;
                            class187 var152 = (class187) class187.field2750.method2159((long) var149);
                            class187 var153;
                            if (var152 == null) {
                                byte[] var154 = Statics.field2751.method3065(5, var149);
                                class187 var155 = new class187();
                                if (var154 != null) {
                                    var155.method3193(new class161(var154));
                                }
                                class187.field2750.method2164(var155, (long) var149);
                                var153 = var155;
                            } else {
                                var153 = var152;
                            }
                            var150[var151] = var153.field2752;
                            continue;
                        }
                        if (var501 == 3305) {
                            var5--;
                            int var156 = field717[var5];
                            field717[var5++] = client.field319[var156];
                            continue;
                        }
                        if (var501 == 3306) {
                            var5--;
                            int var157 = field717[var5];
                            field717[var5++] = client.field414[var157];
                            continue;
                        }
                        if (var501 == 3307) {
                            var5--;
                            int var158 = field717[var5];
                            field717[var5++] = client.field345[var158];
                            continue;
                        }
                        if (var501 == 3308) {
                            int var159 = Statics.field937;
                            int var160 = (Statics.field1425.field619 >> 7) + Statics.field1792;
                            int var161 = (Statics.field1425.field609 >> 7) + Statics.field663;
                            field717[var5++] = (var159 << 28) + (var160 << 14) + var161;
                            continue;
                        }
                        if (var501 == 3309) {
                            var5--;
                            int var162 = field717[var5];
                            field717[var5++] = var162 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var501 == 3310) {
                            var5--;
                            int var163 = field717[var5];
                            field717[var5++] = var163 >> 28;
                            continue;
                        }
                        if (var501 == 3311) {
                            var5--;
                            int var164 = field717[var5];
                            field717[var5++] = var164 & 0x3FFF;
                            continue;
                        }
                        if (var501 == 3312) {
                            field717[var5++] = client.field284 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3313) {
                            var5 -= 2;
                            int var165 = field717[var5] + 32768;
                            int var166 = field717[var5 + 1];
                            field717[var5++] = class13.method123(var165, var166);
                            continue;
                        }
                        if (var501 == 3314) {
                            var5 -= 2;
                            int var167 = field717[var5] + 32768;
                            int var168 = field717[var5 + 1];
                            field717[var5++] = class13.method3056(var167, var168);
                            continue;
                        }
                        if (var501 == 3315) {
                            var5 -= 2;
                            int var169 = field717[var5] + 32768;
                            int var170 = field717[var5 + 1];
                            int[] var171 = field717;
                            int var172 = var5++;
                            class13 var173 = (class13) class13.field122.method2171((long) var169);
                            int var174;
                            if (var173 == null) {
                                var174 = 0;
                            } else if (var170 == -1) {
                                var174 = 0;
                            } else {
                                int var175 = 0;
                                for (int var176 = 0; var176 < var173.field118.length; var176++) {
                                    if (var173.field123[var176] == var170) {
                                        var175 += var173.field118[var176];
                                    }
                                }
                                var174 = var175;
                            }
                            var171[var172] = var174;
                            continue;
                        }
                        if (var501 == 3316) {
                            if (client.field397 >= 2) {
                                field717[var5++] = client.field397;
                            } else {
                                field717[var5++] = 0;
                            }
                            continue;
                        }
                        if (var501 == 3317) {
                            field717[var5++] = client.field326;
                            continue;
                        }
                        if (var501 == 3318) {
                            field717[var5++] = client.field329;
                            continue;
                        }
                        if (var501 == 3321) {
                            field717[var5++] = client.field316;
                            continue;
                        }
                        if (var501 == 3322) {
                            field717[var5++] = client.field444;
                            continue;
                        }
                        if (var501 == 3323) {
                            if (client.field447) {
                                field717[var5++] = 1;
                            } else {
                                field717[var5++] = 0;
                            }
                            continue;
                        }
                        if (var501 == 3324) {
                            field717[var5++] = client.field481;
                            continue;
                        }
                    } else if (var501 < 3500) {
                        if (var501 == 3400) {
                            var5 -= 2;
                            int var177 = field717[var5];
                            int var178 = field717[var5 + 1];
                            class196 var179 = class196.method1378(var177);
                            if (var179.field2842 != 's') {
                            }
                            for (int var180 = 0; var180 < var179.field2844; var180++) {
                                if (var179.field2843[var180] == var178) {
                                    field718[var6++] = var179.field2847[var180];
                                    var179 = null;
                                    break;
                                }
                            }
                            if (var179 != null) {
                                field718[var6++] = var179.field2848;
                            }
                            continue;
                        }
                        if (var501 == 3408) {
                            var5 -= 4;
                            int var181 = field717[var5];
                            int var182 = field717[var5 + 1];
                            int var183 = field717[var5 + 2];
                            int var184 = field717[var5 + 3];
                            class196 var185 = class196.method1378(var183);
                            if (var185.field2840 == var181 && var185.field2842 == var182) {
                                for (int var186 = 0; var186 < var185.field2844; var186++) {
                                    if (var185.field2843[var186] == var184) {
                                        if (var182 == 115) {
                                            field718[var6++] = var185.field2847[var186];
                                        } else {
                                            field717[var5++] = var185.field2845[var186];
                                        }
                                        var185 = null;
                                        break;
                                    }
                                }
                                if (var185 != null) {
                                    if (var182 == 115) {
                                        field718[var6++] = var185.field2848;
                                    } else {
                                        field717[var5++] = var185.field2838;
                                    }
                                }
                                continue;
                            }
                            if (var182 == 115) {
                                field718[var6++] = "null";
                            } else {
                                field717[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var501 < 3700) {
                        if (var501 == 3600) {
                            if (client.field334 == 0) {
                                field717[var5++] = -2;
                            } else if (client.field334 == 1) {
                                field717[var5++] = -1;
                            } else {
                                field717[var5++] = client.field546;
                            }
                            continue;
                        }
                        if (var501 == 3601) {
                            var5--;
                            int var187 = field717[var5];
                            if (client.field334 == 2 && var187 < client.field546) {
                                field718[var6++] = client.field548[var187].field158;
                                field718[var6++] = client.field548[var187].field152;
                                continue;
                            }
                            field718[var6++] = "";
                            field718[var6++] = "";
                            continue;
                        }
                        if (var501 == 3602) {
                            var5--;
                            int var188 = field717[var5];
                            if (client.field334 == 2 && var188 < client.field546) {
                                field717[var5++] = client.field548[var188].field151;
                                continue;
                            }
                            field717[var5++] = 0;
                            continue;
                        }
                        if (var501 == 3603) {
                            var5--;
                            int var189 = field717[var5];
                            if (client.field334 == 2 && var189 < client.field546) {
                                field717[var5++] = client.field548[var189].field150;
                                continue;
                            }
                            field717[var5++] = 0;
                            continue;
                        }
                        if (var501 == 3604) {
                            var6--;
                            String var190 = field718[var6];
                            var5--;
                            int var191 = field717[var5];
                            client.field322.method2993(2);
                            client.field322.method2718(class161.method1885(var190) + 1);
                            client.field322.method2758(var191);
                            client.field322.method2903(var190);
                            continue;
                        }
                        if (var501 == 3605) {
                            var6--;
                            String var192 = field718[var6];
                            if (var192 == null) {
                                continue;
                            }
                            if ((client.field546 < 200 || client.field504 == 1) && client.field546 < 400) {
                                String var193 = class205.method3535(var192, Statics.field283);
                                if (var193 == null) {
                                    continue;
                                }
                                for (int var194 = 0; var194 < client.field546; var194++) {
                                    class15 var195 = client.field548[var194];
                                    String var196 = class205.method3535(var195.field158, Statics.field283);
                                    if (var196 != null && var196.equals(var193)) {
                                        class48.method888(30, "", var192 + class174.field2595);
                                        continue label3183;
                                    }
                                    if (var195.field152 != null) {
                                        String var197 = class205.method3535(var195.field152, Statics.field283);
                                        if (var197 != null && var197.equals(var193)) {
                                            class48.method888(30, "", var192 + class174.field2595);
                                            continue label3183;
                                        }
                                    }
                                }
                                for (int var198 = 0; var198 < client.field486; var198++) {
                                    class20 var199 = client.field551[var198];
                                    String var200 = class205.method3535(var199.field208, Statics.field283);
                                    if (var200 != null && var200.equals(var193)) {
                                        class48.method888(30, "", class174.field2511 + var192 + class174.field2512);
                                        continue label3183;
                                    }
                                    if (var199.field204 != null) {
                                        String var201 = class205.method3535(var199.field204, Statics.field283);
                                        if (var201 != null && var201.equals(var193)) {
                                            class48.method888(30, "", class174.field2511 + var192 + class174.field2512);
                                            continue label3183;
                                        }
                                    }
                                }
                                if (class205.method3535(Statics.field1425.field262, Statics.field283).equals(var193)) {
                                    class48.method888(30, "", class174.field2501);
                                } else {
                                    client.field322.method2993(118);
                                    client.field322.method2718(class161.method1885(var192));
                                    client.field322.method2903(var192);
                                }
                                continue;
                            }
                            class48.method888(30, "", class174.field2394);
                            continue;
                        }
                        if (var501 == 3606) {
                            var6--;
                            String var202 = field718[var6];
                            client.method190(var202);
                            continue;
                        }
                        if (var501 == 3607) {
                            var6--;
                            String var203 = field718[var6];
                            if (var203 == null) {
                                continue;
                            }
                            if ((client.field486 < 100 || client.field504 == 1) && client.field486 < 400) {
                                String var204 = class205.method3535(var203, Statics.field283);
                                if (var204 == null) {
                                    continue;
                                }
                                for (int var205 = 0; var205 < client.field486; var205++) {
                                    class20 var206 = client.field551[var205];
                                    String var207 = class205.method3535(var206.field208, Statics.field283);
                                    if (var207 != null && var207.equals(var204)) {
                                        class48.method888(31, "", var203 + class174.field2508);
                                        continue label3183;
                                    }
                                    if (var206.field204 != null) {
                                        String var208 = class205.method3535(var206.field204, Statics.field283);
                                        if (var208 != null && var208.equals(var204)) {
                                            class48.method888(31, "", var203 + class174.field2508);
                                            continue label3183;
                                        }
                                    }
                                }
                                for (int var209 = 0; var209 < client.field546; var209++) {
                                    class15 var210 = client.field548[var209];
                                    String var211 = class205.method3535(var210.field158, Statics.field283);
                                    if (var211 != null && var211.equals(var204)) {
                                        class48.method888(31, "", class174.field2513 + var203 + class174.field2514);
                                        continue label3183;
                                    }
                                    if (var210.field152 != null) {
                                        String var212 = class205.method3535(var210.field152, Statics.field283);
                                        if (var212 != null && var212.equals(var204)) {
                                            class48.method888(31, "", class174.field2513 + var203 + class174.field2514);
                                            continue label3183;
                                        }
                                    }
                                }
                                if (class205.method3535(Statics.field1425.field262, Statics.field283).equals(var204)) {
                                    class48.method888(31, "", class174.field2510);
                                } else {
                                    client.field322.method2993(157);
                                    client.field322.method2718(class161.method1885(var203));
                                    client.field322.method2903(var203);
                                }
                                continue;
                            }
                            class48.method888(31, "", class174.field2507);
                            continue;
                        }
                        if (var501 == 3608) {
                            var6--;
                            String var213 = field718[var6];
                            if (var213 == null) {
                                continue;
                            }
                            String var214 = class205.method3535(var213, Statics.field283);
                            if (var214 == null) {
                                continue;
                            }
                            int var215 = 0;
                            while (true) {
                                if (var215 >= client.field486) {
                                    continue label3183;
                                }
                                class20 var216 = client.field551[var215];
                                String var217 = var216.field208;
                                String var218 = class205.method3535(var217, Statics.field283);
                                boolean var219;
                                if (var213 == null || var217 == null) {
                                    var219 = false;
                                } else if (var213.startsWith("#") || var217.startsWith("#")) {
                                    var219 = var213.equals(var217);
                                } else {
                                    var219 = var214.equals(var218);
                                }
                                if (var219) {
                                    client.field486--;
                                    for (int var220 = var215; var220 < client.field486; var220++) {
                                        client.field551[var220] = client.field551[var220 + 1];
                                    }
                                    client.field471 = client.field463;
                                    client.field322.method2993(132);
                                    client.field322.method2718(class161.method1885(var213));
                                    client.field322.method2903(var213);
                                    continue label3183;
                                }
                                var215++;
                            }
                        }
                        if (var501 == 3609) {
                            var6--;
                            String var221 = field718[var6];
                            class178[] var222 = class178.method2033();
                            for (int var223 = 0; var223 < var222.length; var223++) {
                                class178 var224 = var222[var223];
                                if (var224.field2648 != -1 && var221.startsWith(class38.method2035(var224.field2648))) {
                                    var221 = var221.substring(6 + Integer.toString(var224.field2648).length());
                                    break;
                                }
                            }
                            field717[var5++] = client.method1121(var221, false) ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3611) {
                            if (client.field300 == null) {
                                field718[var6++] = "";
                                continue;
                            }
                            String[] var225 = field718;
                            int var226 = var6++;
                            String var227 = client.field300;
                            long var228 = 0L;
                            int var230 = var227.length();
                            for (int var231 = 0; var231 < var230; var231++) {
                                var228 *= 37L;
                                char var232 = var227.charAt(var231);
                                if (var232 >= 'A' && var232 <= 'Z') {
                                    var228 += (long) (var232 + 1 - 65);
                                } else if (var232 >= 'a' && var232 <= 'z') {
                                    var228 += (long) (var232 + 1 - 97);
                                } else if (var232 >= '0' && var232 <= '9') {
                                    var228 += (long) (var232 + 27 - 48);
                                }
                                if (var228 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var228 % 37L == 0L && var228 != 0L) {
                                var228 /= 37L;
                            }
                            String var235 = class206.method2643(var228);
                            if (var235 == null) {
                                var235 = "";
                            }
                            var225[var226] = var235;
                            continue;
                        }
                        if (var501 == 3612) {
                            if (client.field300 == null) {
                                field717[var5++] = 0;
                            } else {
                                field717[var5++] = Statics.field1190;
                            }
                            continue;
                        }
                        if (var501 == 3613) {
                            var5--;
                            int var237 = field717[var5];
                            if (client.field300 != null && var237 < Statics.field1190) {
                                field718[var6++] = Statics.field1464[var237].field271;
                                continue;
                            }
                            field718[var6++] = "";
                            continue;
                        }
                        if (var501 == 3614) {
                            var5--;
                            int var238 = field717[var5];
                            if (client.field300 != null && var238 < Statics.field1190) {
                                field717[var5++] = Statics.field1464[var238].field276;
                                continue;
                            }
                            field717[var5++] = 0;
                            continue;
                        }
                        if (var501 == 3615) {
                            var5--;
                            int var239 = field717[var5];
                            if (client.field300 != null && var239 < Statics.field1190) {
                                field717[var5++] = Statics.field1464[var239].field272;
                                continue;
                            }
                            field717[var5++] = 0;
                            continue;
                        }
                        if (var501 == 3616) {
                            field717[var5++] = Statics.field2292;
                            continue;
                        }
                        if (var501 == 3617) {
                            var6--;
                            String var240 = field718[var6];
                            client.method1803(var240);
                            continue;
                        }
                        if (var501 == 3618) {
                            field717[var5++] = Statics.field2266;
                            continue;
                        }
                        if (var501 == 3619) {
                            var6--;
                            String var241 = field718[var6];
                            client.method870(var241);
                            continue;
                        }
                        if (var501 == 3620) {
                            client.method2945();
                            continue;
                        }
                        if (var501 == 3621) {
                            if (client.field334 == 0) {
                                field717[var5++] = -1;
                            } else {
                                field717[var5++] = client.field486;
                            }
                            continue;
                        }
                        if (var501 == 3622) {
                            var5--;
                            int var242 = field717[var5];
                            if (client.field334 != 0 && var242 < client.field486) {
                                field718[var6++] = client.field551[var242].field208;
                                field718[var6++] = client.field551[var242].field204;
                                continue;
                            }
                            field718[var6++] = "";
                            field718[var6++] = "";
                            continue;
                        }
                        if (var501 == 3623) {
                            var6--;
                            String var243 = field718[var6];
                            if (var243.startsWith(class38.method2035(0)) || var243.startsWith(class38.method2035(1))) {
                                var243 = var243.substring(7);
                            }
                            field717[var5++] = client.method21(var243) ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3624) {
                            var5--;
                            int var244 = field717[var5];
                            if (Statics.field1464 != null && var244 < Statics.field1190 && Statics.field1464[var244].field271.equalsIgnoreCase(Statics.field1425.field262)) {
                                field717[var5++] = 1;
                                continue;
                            }
                            field717[var5++] = 0;
                            continue;
                        }
                        if (var501 == 3625) {
                            if (client.field506 == null) {
                                field718[var6++] = "";
                                continue;
                            }
                            String[] var245 = field718;
                            int var246 = var6++;
                            String var247 = client.field506;
                            long var248 = 0L;
                            int var250 = var247.length();
                            for (int var251 = 0; var251 < var250; var251++) {
                                var248 *= 37L;
                                char var252 = var247.charAt(var251);
                                if (var252 >= 'A' && var252 <= 'Z') {
                                    var248 += (long) (var252 + 1 - 65);
                                } else if (var252 >= 'a' && var252 <= 'z') {
                                    var248 += (long) (var252 + 1 - 97);
                                } else if (var252 >= '0' && var252 <= '9') {
                                    var248 += (long) (var252 + 27 - 48);
                                }
                                if (var248 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var248 % 37L == 0L && var248 != 0L) {
                                var248 /= 37L;
                            }
                            String var255 = class206.method2643(var248);
                            if (var255 == null) {
                                var255 = "";
                            }
                            var245[var246] = var255;
                            continue;
                        }
                    } else if (var501 < 4000) {
                        if (var501 == 3903) {
                            var5--;
                            int var257 = field717[var5];
                            field717[var5++] = client.field531[var257].method52();
                            continue;
                        }
                        if (var501 == 3904) {
                            var5--;
                            int var258 = field717[var5];
                            field717[var5++] = client.field531[var258].field39;
                            continue;
                        }
                        if (var501 == 3905) {
                            var5--;
                            int var259 = field717[var5];
                            field717[var5++] = client.field531[var259].field46;
                            continue;
                        }
                        if (var501 == 3906) {
                            var5--;
                            int var260 = field717[var5];
                            field717[var5++] = client.field531[var260].field41;
                            continue;
                        }
                        if (var501 == 3907) {
                            var5--;
                            int var261 = field717[var5];
                            field717[var5++] = client.field531[var261].field38;
                            continue;
                        }
                        if (var501 == 3908) {
                            var5--;
                            int var262 = field717[var5];
                            field717[var5++] = client.field531[var262].field43;
                            continue;
                        }
                        if (var501 == 3910) {
                            var5--;
                            int var263 = field717[var5];
                            int var264 = client.field531[var263].method63();
                            field717[var5++] = var264 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3911) {
                            var5--;
                            int var265 = field717[var5];
                            int var266 = client.field531[var265].method63();
                            field717[var5++] = var266 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3912) {
                            var5--;
                            int var267 = field717[var5];
                            int var268 = client.field531[var267].method63();
                            field717[var5++] = var268 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3913) {
                            var5--;
                            int var269 = field717[var5];
                            int var270 = client.field531[var269].method63();
                            field717[var5++] = var270 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 3914) {
                            var5--;
                            boolean var271 = field717[var5] == 1;
                            if (Statics.field577 != null) {
                                Statics.field577.method16(class2.field9, var271);
                            }
                            continue;
                        }
                        if (var501 == 3915) {
                            var5--;
                            boolean var272 = field717[var5] == 1;
                            if (Statics.field577 != null) {
                                Statics.field577.method16(class2.field8, var272);
                            }
                            continue;
                        }
                        if (var501 == 3916) {
                            var5 -= 2;
                            boolean var273 = field717[var5] == 1;
                            boolean var274 = field717[var5 + 1] == 1;
                            if (Statics.field577 != null) {
                                Statics.field577.method16(new class45(var274), var273);
                            }
                            continue;
                        }
                        if (var501 == 3917) {
                            var5--;
                            boolean var275 = field717[var5] == 1;
                            if (Statics.field577 != null) {
                                Statics.field577.method16(class2.field7, var275);
                            }
                            continue;
                        }
                        if (var501 == 3918) {
                            var5--;
                            boolean var276 = field717[var5] == 1;
                            if (Statics.field577 != null) {
                                Statics.field577.method16(class2.field15, var276);
                            }
                            continue;
                        }
                        if (var501 == 3919) {
                            field717[var5++] = Statics.field577 == null ? 0 : Statics.field577.field20.size();
                            continue;
                        }
                        if (var501 == 3920) {
                            var5--;
                            int var277 = field717[var5];
                            class3 var278 = (class3) Statics.field577.field20.get(var277);
                            field717[var5++] = var278.field24;
                            continue;
                        }
                        if (var501 == 3921) {
                            var5--;
                            int var279 = field717[var5];
                            class3 var280 = (class3) Statics.field577.field20.get(var279);
                            field718[var6++] = var280.method23();
                            continue;
                        }
                        if (var501 == 3922) {
                            var5--;
                            int var281 = field717[var5];
                            class3 var282 = (class3) Statics.field577.field20.get(var281);
                            field718[var6++] = var282.method27();
                            continue;
                        }
                        if (var501 == 3923) {
                            var5--;
                            int var283 = field717[var5];
                            class3 var284 = (class3) Statics.field577.field20.get(var283);
                            long var285 = class163.method225() - Statics.field1947 - var284.field22;
                            int var287 = (int) (var285 / 3600000L);
                            int var288 = (int) ((var285 - (long) (var287 * 3600000)) / 60000L);
                            int var289 = (int) ((var285 - (long) (var287 * 3600000) - (long) (var288 * 60000)) / 1000L);
                            String var290 = var287 + ":" + var288 / 10 + var288 % 10 + ":" + var289 / 10 + var289 % 10;
                            field718[var6++] = var290;
                            continue;
                        }
                        if (var501 == 3924) {
                            var5--;
                            int var291 = field717[var5];
                            class3 var292 = (class3) Statics.field577.field20.get(var291);
                            field717[var5++] = var292.field23.field41;
                            continue;
                        }
                        if (var501 == 3925) {
                            var5--;
                            int var293 = field717[var5];
                            class3 var294 = (class3) Statics.field577.field20.get(var293);
                            field717[var5++] = var294.field23.field46;
                            continue;
                        }
                        if (var501 == 3926) {
                            var5--;
                            int var295 = field717[var5];
                            class3 var296 = (class3) Statics.field577.field20.get(var295);
                            field717[var5++] = var296.field23.field39;
                            continue;
                        }
                    } else if (var501 < 4100) {
                        if (var501 == 4000) {
                            var5 -= 2;
                            int var297 = field717[var5];
                            int var298 = field717[var5 + 1];
                            field717[var5++] = var297 + var298;
                            continue;
                        }
                        if (var501 == 4001) {
                            var5 -= 2;
                            int var299 = field717[var5];
                            int var300 = field717[var5 + 1];
                            field717[var5++] = var299 - var300;
                            continue;
                        }
                        if (var501 == 4002) {
                            var5 -= 2;
                            int var301 = field717[var5];
                            int var302 = field717[var5 + 1];
                            field717[var5++] = var301 * var302;
                            continue;
                        }
                        if (var501 == 4003) {
                            var5 -= 2;
                            int var303 = field717[var5];
                            int var304 = field717[var5 + 1];
                            field717[var5++] = var303 / var304;
                            continue;
                        }
                        if (var501 == 4004) {
                            var5--;
                            int var305 = field717[var5];
                            field717[var5++] = (int) (Math.random() * (double) var305);
                            continue;
                        }
                        if (var501 == 4005) {
                            var5--;
                            int var306 = field717[var5];
                            field717[var5++] = (int) (Math.random() * (double) (var306 + 1));
                            continue;
                        }
                        if (var501 == 4006) {
                            var5 -= 5;
                            int var307 = field717[var5];
                            int var308 = field717[var5 + 1];
                            int var309 = field717[var5 + 2];
                            int var310 = field717[var5 + 3];
                            int var311 = field717[var5 + 4];
                            field717[var5++] = (var308 - var307) * (var311 - var309) / (var310 - var309) + var307;
                            continue;
                        }
                        if (var501 == 4007) {
                            var5 -= 2;
                            int var312 = field717[var5];
                            int var313 = field717[var5 + 1];
                            field717[var5++] = var312 * var313 / 100 + var312;
                            continue;
                        }
                        if (var501 == 4008) {
                            var5 -= 2;
                            int var314 = field717[var5];
                            int var315 = field717[var5 + 1];
                            field717[var5++] = var314 | 0x1 << var315;
                            continue;
                        }
                        if (var501 == 4009) {
                            var5 -= 2;
                            int var316 = field717[var5];
                            int var317 = field717[var5 + 1];
                            field717[var5++] = var316 & -1 - (0x1 << var317);
                            continue;
                        }
                        if (var501 == 4010) {
                            var5 -= 2;
                            int var318 = field717[var5];
                            int var319 = field717[var5 + 1];
                            field717[var5++] = (var318 & 0x1 << var319) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var501 == 4011) {
                            var5 -= 2;
                            int var320 = field717[var5];
                            int var321 = field717[var5 + 1];
                            field717[var5++] = var320 % var321;
                            continue;
                        }
                        if (var501 == 4012) {
                            var5 -= 2;
                            int var322 = field717[var5];
                            int var323 = field717[var5 + 1];
                            if (var322 == 0) {
                                field717[var5++] = 0;
                            } else {
                                field717[var5++] = (int) Math.pow((double) var322, (double) var323);
                            }
                            continue;
                        }
                        if (var501 == 4013) {
                            var5 -= 2;
                            int var324 = field717[var5];
                            int var325 = field717[var5 + 1];
                            if (var324 == 0) {
                                field717[var5++] = 0;
                            } else if (var325 == 0) {
                                field717[var5++] = Integer.MAX_VALUE;
                            } else {
                                field717[var5++] = (int) Math.pow((double) var324, 1.0D / (double) var325);
                            }
                            continue;
                        }
                        if (var501 == 4014) {
                            var5 -= 2;
                            int var326 = field717[var5];
                            int var327 = field717[var5 + 1];
                            field717[var5++] = var326 & var327;
                            continue;
                        }
                        if (var501 == 4015) {
                            var5 -= 2;
                            int var328 = field717[var5];
                            int var329 = field717[var5 + 1];
                            field717[var5++] = var328 | var329;
                            continue;
                        }
                        if (var501 == 4018) {
                            var5 -= 3;
                            long var330 = (long) field717[var5];
                            long var332 = (long) field717[var5 + 1];
                            long var334 = (long) field717[var5 + 2];
                            field717[var5++] = (int) (var330 * var334 / var332);
                            continue;
                        }
                    } else if (var501 < 4200) {
                        if (var501 == 4100) {
                            var6--;
                            String var336 = field718[var6];
                            var5--;
                            int var337 = field717[var5];
                            field718[var6++] = var336 + var337;
                            continue;
                        }
                        if (var501 == 4101) {
                            var6 -= 2;
                            String var338 = field718[var6];
                            String var339 = field718[var6 + 1];
                            field718[var6++] = var338 + var339;
                            continue;
                        }
                        if (var501 == 4102) {
                            var6--;
                            String var340 = field718[var6];
                            var5--;
                            int var341 = field717[var5];
                            field718[var6++] = var340 + class208.method207(var341, true);
                            continue;
                        }
                        if (var501 == 4103) {
                            var6--;
                            String var342 = field718[var6];
                            field718[var6++] = var342.toLowerCase();
                            continue;
                        }
                        if (var501 == 4104) {
                            var5--;
                            int var343 = field717[var5];
                            long var344 = ((long) var343 + 11745L) * 86400000L;
                            field712.setTime(new Date(var344));
                            int var346 = field712.get(5);
                            int var347 = field712.get(2);
                            int var348 = field712.get(1);
                            field718[var6++] = var346 + "-" + field723[var347] + "-" + var348;
                            continue;
                        }
                        if (var501 == 4105) {
                            var6 -= 2;
                            String var349 = field718[var6];
                            String var350 = field718[var6 + 1];
                            if (Statics.field1425.field244 != null && Statics.field1425.field244.field2017) {
                                field718[var6++] = var350;
                                continue;
                            }
                            field718[var6++] = var349;
                            continue;
                        }
                        if (var501 == 4106) {
                            var5--;
                            int var351 = field717[var5];
                            field718[var6++] = Integer.toString(var351);
                            continue;
                        }
                        if (var501 == 4107) {
                            var6 -= 2;
                            int[] var352 = field717;
                            int var353 = var5++;
                            String var354 = field718[var6];
                            String var355 = field718[var6 + 1];
                            int var356 = client.field286;
                            int var357 = var354.length();
                            int var358 = var355.length();
                            int var359 = 0;
                            int var360 = 0;
                            char var361 = 0;
                            char var362 = 0;
                            int var363;
                            label2985: while (true) {
                                if (var359 - var361 >= var357 && var360 - var362 >= var358) {
                                    int var372 = Math.min(var357, var358);
                                    for (int var373 = 0; var373 < var372; var373++) {
                                        char var376 = var354.charAt(var373);
                                        char var377 = var355.charAt(var373);
                                        if (var376 != var377 && Character.toUpperCase(var376) != Character.toUpperCase(var377)) {
                                            char var378 = Character.toLowerCase(var376);
                                            char var379 = Character.toLowerCase(var377);
                                            if (var378 != var379) {
                                                var363 = class203.method2039(var378, var356) - class203.method2039(var379, var356);
                                                break label2985;
                                            }
                                        }
                                    }
                                    int var380 = var357 - var358;
                                    if (var380 == 0) {
                                        for (int var381 = 0; var381 < var372; var381++) {
                                            char var382 = var354.charAt(var381);
                                            char var383 = var355.charAt(var381);
                                            if (var382 != var383) {
                                                var363 = class203.method2039(var382, var356) - class203.method2039(var383, var356);
                                                break label2985;
                                            }
                                        }
                                        var363 = 0;
                                    } else {
                                        var363 = var380;
                                    }
                                    break;
                                }
                                if (var359 - var361 >= var357) {
                                    var363 = -1;
                                    break;
                                }
                                if (var360 - var362 >= var358) {
                                    var363 = 1;
                                    break;
                                }
                                char var364;
                                if (var361 == 0) {
                                    var364 = var354.charAt(var359++);
                                } else {
                                    var364 = var361;
                                    boolean var365 = false;
                                }
                                char var366;
                                if (var362 == 0) {
                                    var366 = var355.charAt(var360++);
                                } else {
                                    var366 = var362;
                                    boolean var367 = false;
                                }
                                var361 = class203.method117(var364);
                                var362 = class203.method117(var366);
                                char var368 = class203.method196(var364, var356);
                                char var369 = class203.method196(var366, var356);
                                if (var368 != var369 && Character.toUpperCase(var368) != Character.toUpperCase(var369)) {
                                    char var370 = Character.toLowerCase(var368);
                                    char var371 = Character.toLowerCase(var369);
                                    if (var370 != var371) {
                                        var363 = class203.method2039(var370, var356) - class203.method2039(var371, var356);
                                        break;
                                    }
                                }
                            }
                            var352[var353] = class208.method3048(var363);
                            continue;
                        }
                        if (var501 == 4108) {
                            var6--;
                            String var384 = field718[var6];
                            var5 -= 2;
                            int var385 = field717[var5];
                            int var386 = field717[var5 + 1];
                            byte[] var387 = Statics.field575.method3065(var386, 0);
                            class209 var388 = new class209(var387);
                            field717[var5++] = var388.method3653(var384, var385);
                            continue;
                        }
                        if (var501 == 4109) {
                            var6--;
                            String var389 = field718[var6];
                            var5 -= 2;
                            int var390 = field717[var5];
                            int var391 = field717[var5 + 1];
                            byte[] var392 = Statics.field575.method3065(var391, 0);
                            class209 var393 = new class209(var392);
                            field717[var5++] = var393.method3652(var389, var390);
                            continue;
                        }
                        if (var501 == 4110) {
                            var6 -= 2;
                            String var394 = field718[var6];
                            String var395 = field718[var6 + 1];
                            var5--;
                            if (field717[var5] == 1) {
                                field718[var6++] = var394;
                            } else {
                                field718[var6++] = var395;
                            }
                            continue;
                        }
                        if (var501 == 4111) {
                            var6--;
                            String var396 = field718[var6];
                            field718[var6++] = class210.method3716(var396);
                            continue;
                        }
                        if (var501 == 4112) {
                            var6--;
                            String var397 = field718[var6];
                            var5--;
                            int var398 = field717[var5];
                            field718[var6++] = var397 + (char) var398;
                            continue;
                        }
                        if (var501 == 4113) {
                            var5--;
                            int var399 = field717[var5];
                            int[] var400 = field717;
                            int var401 = var5++;
                            char var402 = (char) var399;
                            boolean var403;
                            if (var402 >= ' ' && var402 <= '~') {
                                var403 = true;
                            } else if (var402 >= 160 && var402 <= 255) {
                                var403 = true;
                            } else if (var402 == 8364 || var402 == 338 || var402 == 8212 || var402 == 339 || var402 == 376) {
                                var403 = true;
                            } else {
                                var403 = false;
                            }
                            var400[var401] = var403 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 4114) {
                            var5--;
                            int var404 = field717[var5];
                            field717[var5++] = class208.method214((char) var404) ? 1 : 0;
                            continue;
                        }
                        if (var501 == 4115) {
                            var5--;
                            int var405 = field717[var5];
                            int[] var406 = field717;
                            int var407 = var5++;
                            char var408 = (char) var405;
                            boolean var409 = var408 >= 'A' && var408 <= 'Z' || var408 >= 'a' && var408 <= 'z';
                            var406[var407] = var409 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 4116) {
                            var5--;
                            int var410 = field717[var5];
                            field717[var5++] = class208.method1956((char) var410) ? 1 : 0;
                            continue;
                        }
                        if (var501 == 4117) {
                            var6--;
                            String var411 = field718[var6];
                            if (var411 == null) {
                                field717[var5++] = 0;
                            } else {
                                field717[var5++] = var411.length();
                            }
                            continue;
                        }
                        if (var501 == 4118) {
                            var6--;
                            String var412 = field718[var6];
                            var5 -= 2;
                            int var413 = field717[var5];
                            int var414 = field717[var5 + 1];
                            field718[var6++] = var412.substring(var413, var414);
                            continue;
                        }
                        if (var501 == 4119) {
                            var6--;
                            String var415 = field718[var6];
                            StringBuilder var416 = new StringBuilder(var415.length());
                            boolean var417 = false;
                            for (int var418 = 0; var418 < var415.length(); var418++) {
                                char var419 = var415.charAt(var418);
                                if (var419 == '<') {
                                    var417 = true;
                                } else if (var419 == '>') {
                                    var417 = false;
                                } else if (!var417) {
                                    var416.append(var419);
                                }
                            }
                            field718[var6++] = var416.toString();
                            continue;
                        }
                        if (var501 == 4120) {
                            var6--;
                            String var420 = field718[var6];
                            var5--;
                            int var421 = field717[var5];
                            field717[var5++] = var420.indexOf(var421);
                            continue;
                        }
                        if (var501 == 4121) {
                            var6 -= 2;
                            String var422 = field718[var6];
                            String var423 = field718[var6 + 1];
                            var5--;
                            int var424 = field717[var5];
                            field717[var5++] = var422.indexOf(var423, var424);
                            continue;
                        }
                    } else if (var501 < 4300) {
                        if (var501 == 4200) {
                            var5--;
                            int var425 = field717[var5];
                            field718[var6++] = class199.method2569(var425).field2938;
                            continue;
                        }
                        if (var501 == 4201) {
                            var5 -= 2;
                            int var426 = field717[var5];
                            int var427 = field717[var5 + 1];
                            class199 var428 = class199.method2569(var426);
                            if (var427 >= 1 && var427 <= 5 && var428.field2952[var427 - 1] != null) {
                                field718[var6++] = var428.field2952[var427 - 1];
                                continue;
                            }
                            field718[var6++] = "";
                            continue;
                        }
                        if (var501 == 4202) {
                            var5 -= 2;
                            int var429 = field717[var5];
                            int var430 = field717[var5 + 1];
                            class199 var431 = class199.method2569(var429);
                            if (var430 >= 1 && var430 <= 5 && var431.field2961[var430 - 1] != null) {
                                field718[var6++] = var431.field2961[var430 - 1];
                                continue;
                            }
                            field718[var6++] = "";
                            continue;
                        }
                        if (var501 == 4203) {
                            var5--;
                            int var432 = field717[var5];
                            field717[var5++] = class199.method2569(var432).field2955;
                            continue;
                        }
                        if (var501 == 4204) {
                            var5--;
                            int var433 = field717[var5];
                            field717[var5++] = class199.method2569(var433).field2968 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 4205) {
                            var5--;
                            int var434 = field717[var5];
                            class199 var435 = class199.method2569(var434);
                            if (var435.field2977 == -1 && var435.field2972 >= 0) {
                                field717[var5++] = var435.field2972;
                                continue;
                            }
                            field717[var5++] = var434;
                            continue;
                        }
                        if (var501 == 4206) {
                            var5--;
                            int var436 = field717[var5];
                            class199 var437 = class199.method2569(var436);
                            if (var437.field2977 >= 0 && var437.field2972 >= 0) {
                                field717[var5++] = var437.field2972;
                                continue;
                            }
                            field717[var5++] = var436;
                            continue;
                        }
                        if (var501 == 4207) {
                            var5--;
                            int var438 = field717[var5];
                            field717[var5++] = class199.method2569(var438).field2951 ? 1 : 0;
                            continue;
                        }
                        if (var501 == 4208) {
                            var5--;
                            int var439 = field717[var5];
                            class199 var440 = class199.method2569(var439);
                            if (var440.field2953 == -1 && var440.field2979 >= 0) {
                                field717[var5++] = var440.field2979;
                                continue;
                            }
                            field717[var5++] = var439;
                            continue;
                        }
                        if (var501 == 4209) {
                            var5--;
                            int var441 = field717[var5];
                            class199 var442 = class199.method2569(var441);
                            if (var442.field2953 >= 0 && var442.field2979 >= 0) {
                                field717[var5++] = var442.field2979;
                                continue;
                            }
                            field717[var5++] = var441;
                            continue;
                        }
                        if (var501 == 4210) {
                            var6--;
                            String var443 = field718[var6];
                            var5--;
                            int var444 = field717[var5];
                            client.method2057(var443, var444 == 1);
                            field717[var5++] = Statics.field2280;
                            continue;
                        }
                        if (var501 == 4211) {
                            if (Statics.field1545 != null && Statics.field163 < Statics.field2280) {
                                field717[var5++] = Statics.field1545[++Statics.field163 - 1] & 0xFFFF;
                                continue;
                            }
                            field717[var5++] = -1;
                            continue;
                        }
                        if (var501 == 4212) {
                            Statics.field163 = 0;
                            continue;
                        }
                    } else if (var501 < 5100) {
                        if (var501 == 5000) {
                            field717[var5++] = client.field496;
                            continue;
                        }
                        if (var501 == 5001) {
                            var5 -= 3;
                            client.field496 = field717[var5];
                            Statics.field1761 = class217.method1953(field717[var5 + 1]);
                            if (Statics.field1761 == null) {
                                Statics.field1761 = class217.field3157;
                            }
                            client.field497 = field717[var5 + 2];
                            client.field322.method2993(61);
                            client.field322.method2718(client.field496);
                            client.field322.method2718(Statics.field1761.field3159);
                            client.field322.method2718(client.field497);
                            continue;
                        }
                        if (var501 == 5002) {
                            var6--;
                            String var445 = field718[var6];
                            var5 -= 2;
                            int var446 = field717[var5];
                            int var447 = field717[var5 + 1];
                            client.field322.method2993(171);
                            client.field322.method2718(class161.method1885(var445) + 2);
                            client.field322.method2903(var445);
                            client.field322.method2718(var446 - 1);
                            client.field322.method2718(var447);
                            continue;
                        }
                        if (var501 == 5003) {
                            var5 -= 2;
                            int var448 = field717[var5];
                            int var449 = field717[var5 + 1];
                            class51 var450 = (class51) class48.field928.get(var448);
                            class22 var451 = var450.method878(var449);
                            if (var451 == null) {
                                field717[var5++] = -1;
                                field717[var5++] = 0;
                                field718[var6++] = "";
                                field718[var6++] = "";
                                field718[var6++] = "";
                            } else {
                                field717[var5++] = var451.field229;
                                field717[var5++] = var451.field233;
                                field718[var6++] = var451.field227 == null ? "" : var451.field227;
                                field718[var6++] = var451.field228 == null ? "" : var451.field228;
                                field718[var6++] = var451.field225 == null ? "" : var451.field225;
                            }
                            continue;
                        }
                        if (var501 == 5004) {
                            var5--;
                            int var453 = field717[var5];
                            class22 var454 = (class22) class48.field926.method2137((long) var453);
                            if (var454 == null) {
                                field717[var5++] = -1;
                                field717[var5++] = 0;
                                field718[var6++] = "";
                                field718[var6++] = "";
                                field718[var6++] = "";
                            } else {
                                field717[var5++] = var454.field226;
                                field717[var5++] = var454.field233;
                                field718[var6++] = var454.field227 == null ? "" : var454.field227;
                                field718[var6++] = var454.field228 == null ? "" : var454.field228;
                                field718[var6++] = var454.field225 == null ? "" : var454.field225;
                            }
                            continue;
                        }
                        if (var501 == 5005) {
                            if (Statics.field1761 == null) {
                                field717[var5++] = -1;
                            } else {
                                field717[var5++] = Statics.field1761.field3159;
                            }
                            continue;
                        }
                        if (var501 == 5008) {
                            var6--;
                            String var456 = field718[var6];
                            var5--;
                            int var457 = field717[var5];
                            String var458 = var456.toLowerCase();
                            byte var459 = 0;
                            if (var458.startsWith(class174.field2350)) {
                                var459 = 0;
                                var456 = var456.substring(class174.field2350.length());
                            } else if (var458.startsWith(class174.field2517)) {
                                var459 = 1;
                                var456 = var456.substring(class174.field2517.length());
                            } else if (var458.startsWith(class174.field2519)) {
                                var459 = 2;
                                var456 = var456.substring(class174.field2519.length());
                            } else if (var458.startsWith(class174.field2521)) {
                                var459 = 3;
                                var456 = var456.substring(class174.field2521.length());
                            } else if (var458.startsWith(class174.field2515)) {
                                var459 = 4;
                                var456 = var456.substring(class174.field2515.length());
                            } else if (var458.startsWith(class174.field2525)) {
                                var459 = 5;
                                var456 = var456.substring(class174.field2525.length());
                            } else if (var458.startsWith(class174.field2527)) {
                                var459 = 6;
                                var456 = var456.substring(class174.field2527.length());
                            } else if (var458.startsWith(class174.field2450)) {
                                var459 = 7;
                                var456 = var456.substring(class174.field2450.length());
                            } else if (var458.startsWith(class174.field2531)) {
                                var459 = 8;
                                var456 = var456.substring(class174.field2531.length());
                            } else if (var458.startsWith(class174.field2533)) {
                                var459 = 9;
                                var456 = var456.substring(class174.field2533.length());
                            } else if (var458.startsWith(class174.field2535)) {
                                var459 = 10;
                                var456 = var456.substring(class174.field2535.length());
                            } else if (var458.startsWith(class174.field2537)) {
                                var459 = 11;
                                var456 = var456.substring(class174.field2537.length());
                            } else if (client.field286 != 0) {
                                if (var458.startsWith(class174.field2516)) {
                                    var459 = 0;
                                    var456 = var456.substring(class174.field2516.length());
                                } else if (var458.startsWith(class174.field2518)) {
                                    var459 = 1;
                                    var456 = var456.substring(class174.field2518.length());
                                } else if (var458.startsWith(class174.field2520)) {
                                    var459 = 2;
                                    var456 = var456.substring(class174.field2520.length());
                                } else if (var458.startsWith(class174.field2522)) {
                                    var459 = 3;
                                    var456 = var456.substring(class174.field2522.length());
                                } else if (var458.startsWith(class174.field2524)) {
                                    var459 = 4;
                                    var456 = var456.substring(class174.field2524.length());
                                } else if (var458.startsWith(class174.field2526)) {
                                    var459 = 5;
                                    var456 = var456.substring(class174.field2526.length());
                                } else if (var458.startsWith(class174.field2528)) {
                                    var459 = 6;
                                    var456 = var456.substring(class174.field2528.length());
                                } else if (var458.startsWith(class174.field2530)) {
                                    var459 = 7;
                                    var456 = var456.substring(class174.field2530.length());
                                } else if (var458.startsWith(class174.field2532)) {
                                    var459 = 8;
                                    var456 = var456.substring(class174.field2532.length());
                                } else if (var458.startsWith(class174.field2534)) {
                                    var459 = 9;
                                    var456 = var456.substring(class174.field2534.length());
                                } else if (var458.startsWith(class174.field2536)) {
                                    var459 = 10;
                                    var456 = var456.substring(class174.field2536.length());
                                } else if (var458.startsWith(class174.field2538)) {
                                    var459 = 11;
                                    var456 = var456.substring(class174.field2538.length());
                                }
                            }
                            String var460 = var456.toLowerCase();
                            byte var461 = 0;
                            if (var460.startsWith(class174.field2539)) {
                                var461 = 1;
                                var456 = var456.substring(class174.field2539.length());
                            } else if (var460.startsWith(class174.field2392)) {
                                var461 = 2;
                                var456 = var456.substring(class174.field2392.length());
                            } else if (var460.startsWith(class174.field2543)) {
                                var461 = 3;
                                var456 = var456.substring(class174.field2543.length());
                            } else if (var460.startsWith(class174.field2545)) {
                                var461 = 4;
                                var456 = var456.substring(class174.field2545.length());
                            } else if (var460.startsWith(class174.field2547)) {
                                var461 = 5;
                                var456 = var456.substring(class174.field2547.length());
                            } else if (client.field286 != 0) {
                                if (var460.startsWith(class174.field2341)) {
                                    var461 = 1;
                                    var456 = var456.substring(class174.field2341.length());
                                } else if (var460.startsWith(class174.field2544)) {
                                    var461 = 2;
                                    var456 = var456.substring(class174.field2544.length());
                                } else if (var460.startsWith(class174.field2558)) {
                                    var461 = 3;
                                    var456 = var456.substring(class174.field2558.length());
                                } else if (var460.startsWith(class174.field2476)) {
                                    var461 = 4;
                                    var456 = var456.substring(class174.field2476.length());
                                } else if (var460.startsWith(class174.field2414)) {
                                    var461 = 5;
                                    var456 = var456.substring(class174.field2414.length());
                                }
                            }
                            client.field322.method2993(189);
                            client.field322.method2718(0);
                            int var462 = client.field322.field2267;
                            client.field322.method2718(var457);
                            client.field322.method2718(var459);
                            client.field322.method2718(var461);
                            class211.method1790(client.field322, var456);
                            client.field322.method2730(client.field322.field2267 - var462);
                            continue;
                        }
                        if (var501 == 5009) {
                            var6 -= 2;
                            String var463 = field718[var6];
                            String var464 = field718[var6 + 1];
                            client.field322.method2993(226);
                            client.field322.method2900(0);
                            int var465 = client.field322.field2267;
                            client.field322.method2903(var463);
                            class167 var466 = client.field322;
                            int var467 = var466.field2267;
                            byte[] var468 = class204.method1125(var464);
                            var466.method2731(var468.length);
                            var466.field2267 += Statics.field3111.method2657(var468, 0, var468.length, var466.field2258, var466.field2267);
                            client.field322.method2862(client.field322.field2267 - var465);
                            continue;
                        }
                        if (var501 == 5015) {
                            String var469;
                            if (Statics.field1425 == null || Statics.field1425.field262 == null) {
                                var469 = "";
                            } else {
                                var469 = Statics.field1425.field262;
                            }
                            field718[var6++] = var469;
                            continue;
                        }
                        if (var501 == 5016) {
                            field717[var5++] = client.field497;
                            continue;
                        }
                        if (var501 == 5017) {
                            var5--;
                            int var470 = field717[var5];
                            field717[var5++] = class48.method1617(var470);
                            continue;
                        }
                        if (var501 == 5018) {
                            var5--;
                            int var471 = field717[var5];
                            field717[var5++] = class48.method734(var471);
                            continue;
                        }
                        if (var501 == 5019) {
                            var5--;
                            int var472 = field717[var5];
                            field717[var5++] = class48.method104(var472);
                            continue;
                        }
                        if (var501 == 5020) {
                            var6--;
                            String var473 = field718[var6];
                            if (var473.equalsIgnoreCase("toggleroof")) {
                                Statics.field1457.field686 = !Statics.field1457.field686;
                                class31.method40();
                                if (Statics.field1457.field686) {
                                    class48.method888(99, "", "Roofs are now all hidden");
                                } else {
                                    class48.method888(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var473.equalsIgnoreCase("displayfps")) {
                                client.field442 = !client.field442;
                            }
                            if (client.field397 >= 2) {
                                if (var473.equalsIgnoreCase("fpson")) {
                                    client.field442 = true;
                                }
                                if (var473.equalsIgnoreCase("fpsoff")) {
                                    client.field442 = false;
                                }
                                if (var473.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var473.equalsIgnoreCase("clientdrop")) {
                                    client.method17();
                                }
                                if (var473.equalsIgnoreCase("errortest") && client.field282 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field322.method2993(250);
                            client.field322.method2718(var473.length() + 1);
                            client.field322.method2903(var473);
                            continue;
                        }
                        if (var501 == 5021) {
                            var6--;
                            client.field560 = field718[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var501 == 5022) {
                            field718[var6++] = client.field560;
                            continue;
                        }
                    }
                }
                if (var501 < 5400) {
                    if (var501 == 5306) {
                        int[] var474 = field717;
                        int var475 = var5++;
                        int var476 = client.field492 ? 2 : 1;
                        var474[var475] = var476;
                        continue;
                    }
                    if (var501 == 5307) {
                        var5--;
                        int var477 = field717[var5];
                        if (var477 != 1 && var477 != 2) {
                            continue;
                        }
                        client.field485 = 0L;
                        if (var477 >= 2) {
                            client.field492 = true;
                        } else {
                            client.field492 = false;
                        }
                        client.method885();
                        if (client.field308 >= 25) {
                            client.field322.method2993(245);
                            class167 var478 = client.field322;
                            int var479 = client.field492 ? 2 : 1;
                            var478.method2718(var479);
                            client.field322.method2900(Statics.field124);
                            client.field322.method2900(Statics.field2000);
                        }
                        class114.field1777 = true;
                        continue;
                    }
                    if (var501 == 5308) {
                        field717[var5++] = Statics.field1457.field685;
                        continue;
                    }
                    if (var501 == 5309) {
                        var5--;
                        int var480 = field717[var5];
                        if (var480 == 1 || var480 == 2) {
                            Statics.field1457.field685 = var480;
                            class31.method40();
                        }
                        continue;
                    }
                }
                if (var501 < 5600) {
                    if (var501 == 5504) {
                        var5 -= 2;
                        int var481 = field717[var5];
                        int var482 = field717[var5 + 1];
                        if (!client.field527) {
                            client.field362 = var481;
                            client.field363 = var482;
                        }
                        continue;
                    }
                    if (var501 == 5505) {
                        field717[var5++] = client.field362;
                        continue;
                    }
                    if (var501 == 5506) {
                        field717[var5++] = client.field363;
                        continue;
                    }
                    if (var501 == 5530) {
                        var5--;
                        int var483 = field717[var5];
                        if (var483 < 0) {
                            var483 = 0;
                        }
                        client.field368 = var483;
                        continue;
                    }
                    if (var501 == 5531) {
                        field717[var5++] = client.field368;
                        continue;
                    }
                }
                if (var501 >= 5700 || var501 != 5630) {
                    if (var501 < 6300) {
                        if (var501 == 6200) {
                            var5 -= 2;
                            client.field369 = (short) field717[var5];
                            if (client.field369 <= 0) {
                                client.field369 = 256;
                            }
                            client.field293 = (short) field717[var5 + 1];
                            if (client.field293 <= 0) {
                                client.field293 = 205;
                            }
                            continue;
                        }
                        if (var501 == 6201) {
                            var5 -= 2;
                            client.field535 = (short) field717[var5];
                            if (client.field535 <= 0) {
                                client.field535 = 256;
                            }
                            client.field522 = (short) field717[var5 + 1];
                            if (client.field522 <= 0) {
                                client.field522 = 320;
                            }
                            continue;
                        }
                        if (var501 == 6202) {
                            var5 -= 4;
                            client.field448 = (short) field717[var5];
                            if (client.field448 <= 0) {
                                client.field448 = 1;
                            }
                            client.field413 = (short) field717[var5 + 1];
                            if (client.field413 <= 0) {
                                client.field413 = 32767;
                            } else if (client.field413 < client.field448) {
                                client.field413 = client.field448;
                            }
                            client.field539 = (short) field717[var5 + 2];
                            if (client.field539 <= 0) {
                                client.field539 = 1;
                            }
                            client.field540 = (short) field717[var5 + 3];
                            if (client.field540 <= 0) {
                                client.field540 = 32767;
                            } else if (client.field540 < client.field539) {
                                client.field540 = client.field539;
                            }
                            continue;
                        }
                        if (var501 == 6203) {
                            if (client.field468 == null) {
                                field717[var5++] = -1;
                                field717[var5++] = -1;
                            } else {
                                client.method3609(0, 0, client.field468.field2108, client.field468.field2169, false);
                                field717[var5++] = client.field543;
                                field717[var5++] = client.field460;
                            }
                            continue;
                        }
                        if (var501 == 6204) {
                            field717[var5++] = client.field535;
                            field717[var5++] = client.field522;
                            continue;
                        }
                        if (var501 == 6205) {
                            field717[var5++] = client.field369;
                            field717[var5++] = client.field293;
                            continue;
                        }
                    }
                    if (var501 < 6600) {
                        if (var501 == 6500) {
                            field717[var5++] = class30.method115() ? 1 : 0;
                            continue;
                        }
                        if (var501 == 6501) {
                            class30 var484 = class30.method92();
                            if (var484 == null) {
                                field717[var5++] = -1;
                                field717[var5++] = 0;
                                field718[var6++] = "";
                                field717[var5++] = 0;
                                field717[var5++] = 0;
                                field718[var6++] = "";
                            } else {
                                field717[var5++] = var484.field672;
                                field717[var5++] = var484.field676;
                                field718[var6++] = var484.field679;
                                field717[var5++] = var484.field680;
                                field717[var5++] = var484.field677;
                                field718[var6++] = var484.field673;
                            }
                            continue;
                        }
                        if (var501 == 6502) {
                            class30 var485;
                            if (class30.field671 < class30.field678) {
                                var485 = Statics.field185[++class30.field671 - 1];
                            } else {
                                var485 = null;
                            }
                            if (var485 == null) {
                                field717[var5++] = -1;
                                field717[var5++] = 0;
                                field718[var6++] = "";
                                field717[var5++] = 0;
                                field717[var5++] = 0;
                                field718[var6++] = "";
                            } else {
                                field717[var5++] = var485.field672;
                                field717[var5++] = var485.field676;
                                field718[var6++] = var485.field679;
                                field717[var5++] = var485.field680;
                                field717[var5++] = var485.field677;
                                field718[var6++] = var485.field673;
                            }
                            continue;
                        }
                        if (var501 == 6506) {
                            var5--;
                            int var487 = field717[var5];
                            class30 var488 = null;
                            for (int var489 = 0; var489 < class30.field678; var489++) {
                                if (Statics.field185[var489].field672 == var487) {
                                    var488 = Statics.field185[var489];
                                    break;
                                }
                            }
                            if (var488 == null) {
                                field717[var5++] = -1;
                                field717[var5++] = 0;
                                field718[var6++] = "";
                                field717[var5++] = 0;
                                field717[var5++] = 0;
                                field718[var6++] = "";
                            } else {
                                field717[var5++] = var488.field672;
                                field717[var5++] = var488.field676;
                                field718[var6++] = var488.field679;
                                field717[var5++] = var488.field680;
                                field717[var5++] = var488.field677;
                                field718[var6++] = var488.field673;
                            }
                            continue;
                        }
                        if (var501 == 6507) {
                            var5 -= 4;
                            int var490 = field717[var5];
                            boolean var491 = field717[var5 + 1] == 1;
                            int var492 = field717[var5 + 2];
                            boolean var493 = field717[var5 + 3] == 1;
                            if (Statics.field185 != null) {
                                class30.method3057(0, Statics.field185.length - 1, var490, var491, var492, var493);
                            }
                            continue;
                        }
                        if (var501 == 6511) {
                            var5--;
                            int var494 = field717[var5];
                            if (var494 >= 0 && var494 < class30.field678) {
                                class30 var495 = Statics.field185[var494];
                                field717[var5++] = var495.field672;
                                field717[var5++] = var495.field676;
                                field718[var6++] = var495.field679;
                                field717[var5++] = var495.field680;
                                field717[var5++] = var495.field677;
                                field718[var6++] = var495.field673;
                                continue;
                            }
                            field717[var5++] = -1;
                            field717[var5++] = 0;
                            field718[var6++] = "";
                            field717[var5++] = 0;
                            field717[var5++] = 0;
                            field718[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field332 = 250;
            }
        } catch (Exception var500) {
            StringBuilder var497 = new StringBuilder(30);
            var497.append("").append(var4.field1874).append(" ");
            for (int var498 = field713 - 1; var498 >= 0; var498--) {
                var497.append("").append(field720[var498].field91.field1874).append(" ");
            }
            var497.append("").append(var10);
            class102.method706(var497.toString(), var500);
        }
    }

    @ObfuscatedName("dl.o(II)V")
    public static void method2120(int arg0) {
        if (arg0 == -1 || !class151.method194(arg0)) {
            return;
        }
        class151[] var1 = Statics.field2043[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class151 var3 = var1[var2];
            if (var3.field2131 != null) {
                class19 var4 = new class19();
                var4.field191 = var3;
                var4.field199 = var3.field2131;
                method1812(var4, 2000000);
            }
        }
    }
}
