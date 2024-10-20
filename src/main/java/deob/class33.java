package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("an")
public class class33 {

    @ObfuscatedName("an.k")
    public static int[] field721 = new int[5];

    @ObfuscatedName("an.h")
    public static int[][] field722 = new int[5][5000];

    @ObfuscatedName("an.n")
    public static int[] field730 = new int[1000];

    @ObfuscatedName("an.a")
    public static String[] field724 = new String[1000];

    @ObfuscatedName("an.x")
    public static int field725 = 0;

    @ObfuscatedName("an.z")
    public static class12[] field726 = new class12[50];

    @ObfuscatedName("an.o")
    public static Calendar field723 = Calendar.getInstance();

    @ObfuscatedName("an.y")
    public static final String[] field729 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("an.w")
    public static int field718 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.b(Lu;S)V")
    public static void method1885(class19 arg0) {
        method2033(arg0, 200000);
    }

    @ObfuscatedName("dg.l(Lu;II)V")
    public static void method2033(class19 arg0, int arg1) {
        Object[] var2 = arg0.field198;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method184(var3);
        if (var4 == null) {
            return;
        }
        Statics.field1649 = 0;
        Statics.field673 = 0;
        int var5 = -1;
        int[] var6 = var4.field940;
        int[] var7 = var4.field931;
        byte var8 = -1;
        field725 = 0;
        try {
            Statics.field719 = new int[var4.field934];
            int var9 = 0;
            Statics.field735 = new String[var4.field932];
            int var10 = 0;
            for (int var11 = 1; var11 < var2.length; var11++) {
                if (var2[var11] instanceof Integer) {
                    int var12 = (Integer) var2[var11];
                    if (var12 == -2147483647) {
                        var12 = arg0.field197;
                    }
                    if (var12 == -2147483646) {
                        var12 = arg0.field190;
                    }
                    if (var12 == -2147483645) {
                        var12 = arg0.field186 == null ? -1 : arg0.field186.field2197;
                    }
                    if (var12 == -2147483644) {
                        var12 = arg0.field191;
                    }
                    if (var12 == -2147483643) {
                        var12 = arg0.field186 == null ? -1 : arg0.field186.field2321;
                    }
                    if (var12 == -2147483642) {
                        var12 = arg0.field189 == null ? -1 : arg0.field189.field2197;
                    }
                    if (var12 == -2147483641) {
                        var12 = arg0.field189 == null ? -1 : arg0.field189.field2321;
                    }
                    if (var12 == -2147483640) {
                        var12 = arg0.field192;
                    }
                    if (var12 == -2147483639) {
                        var12 = arg0.field196;
                    }
                    Statics.field719[var9++] = var12;
                } else if (var2[var11] instanceof String) {
                    String var13 = (String) var2[var11];
                    if (var13.equals("event_opbase")) {
                        var13 = arg0.field195;
                    }
                    Statics.field735[var10++] = var13;
                }
            }
            int var14 = 0;
            field718 = arg0.field193;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (true) {
                                while (true) {
                                    while (true) {
                                        while (true) {
                                            while (true) {
                                                while (true) {
                                                    while (true) {
                                                        while (true) {
                                                            while (true) {
                                                                while (true) {
                                                                    while (true) {
                                                                        while (true) {
                                                                            while (true) {
                                                                                while (true) {
                                                                                    while (true) {
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                                while (true) {
                                                                                                    while (true) {
                                                                                                        while (true) {
                                                                                                            while (true) {
                                                                                                                label1367: while (true) {
                                                                                                                    var14++;
                                                                                                                    if (var14 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var5++;
                                                                                                                    int var305 = var6[var5];
                                                                                                                    if (var305 >= 100) {
                                                                                                                        boolean var61;
                                                                                                                        if (var4.field931[var5] == 1) {
                                                                                                                            var61 = true;
                                                                                                                        } else {
                                                                                                                            var61 = false;
                                                                                                                        }
                                                                                                                        int var77;
                                                                                                                        if (var305 < 1000) {
                                                                                                                            byte var69;
                                                                                                                            if (var305 == 100) {
                                                                                                                                Statics.field1649 -= 3;
                                                                                                                                int var62 = field730[Statics.field1649];
                                                                                                                                int var63 = field730[Statics.field1649 + 1];
                                                                                                                                int var64 = field730[Statics.field1649 + 2];
                                                                                                                                if (var63 == 0) {
                                                                                                                                    throw new RuntimeException();
                                                                                                                                }
                                                                                                                                class170 var65 = class170.method2518(var62);
                                                                                                                                if (var65.field2282 == null) {
                                                                                                                                    var65.field2282 = new class170[var64 + 1];
                                                                                                                                }
                                                                                                                                if (var65.field2282.length <= var64) {
                                                                                                                                    class170[] var66 = new class170[var64 + 1];
                                                                                                                                    for (int var67 = 0; var67 < var65.field2282.length; var67++) {
                                                                                                                                        var66[var67] = var65.field2282[var67];
                                                                                                                                    }
                                                                                                                                    var65.field2282 = var66;
                                                                                                                                }
                                                                                                                                if (var64 > 0 && var65.field2282[var64 - 1] == null) {
                                                                                                                                    throw new RuntimeException("" + (var64 - 1));
                                                                                                                                }
                                                                                                                                class170 var68 = new class170();
                                                                                                                                var68.field2245 = var63;
                                                                                                                                var68.field2207 = var68.field2197 = var65.field2197;
                                                                                                                                var68.field2321 = var64;
                                                                                                                                var68.field2227 = true;
                                                                                                                                var65.field2282[var64] = var68;
                                                                                                                                if (var61) {
                                                                                                                                    Statics.field720 = var68;
                                                                                                                                } else {
                                                                                                                                    Statics.field2761 = var68;
                                                                                                                                }
                                                                                                                                client.method1874(var65);
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var305 == 101) {
                                                                                                                                class170 var70 = var61 ? Statics.field720 : Statics.field2761;
                                                                                                                                class170 var71 = class170.method2518(var70.field2197);
                                                                                                                                var71.field2282[var70.field2321] = null;
                                                                                                                                client.method1874(var71);
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var305 == 102) {
                                                                                                                                class170 var72 = class170.method2518(field730[--Statics.field1649]);
                                                                                                                                var72.field2282 = null;
                                                                                                                                client.method1874(var72);
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var305 == 200) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var73 = field730[Statics.field1649];
                                                                                                                                int var74 = field730[Statics.field1649 + 1];
                                                                                                                                class170 var75 = class170.method2178(var73, var74);
                                                                                                                                if (var75 == null || var74 == -1) {
                                                                                                                                    field730[++Statics.field1649 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field730[++Statics.field1649 - 1] = 1;
                                                                                                                                    if (var61) {
                                                                                                                                        Statics.field720 = var75;
                                                                                                                                    } else {
                                                                                                                                        Statics.field2761 = var75;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var305 == 201) {
                                                                                                                                class170 var76 = class170.method2518(field730[--Statics.field1649]);
                                                                                                                                if (var76 == null) {
                                                                                                                                    field730[++Statics.field1649 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field730[++Statics.field1649 - 1] = 1;
                                                                                                                                    if (var61) {
                                                                                                                                        Statics.field720 = var76;
                                                                                                                                    } else {
                                                                                                                                        Statics.field2761 = var76;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var69 = 1;
                                                                                                                            } else {
                                                                                                                                var69 = 2;
                                                                                                                            }
                                                                                                                            var77 = var69;
                                                                                                                        } else if (var305 < 1100) {
                                                                                                                            var77 = method209(var305, var4, var61);
                                                                                                                        } else if (var305 < 1200) {
                                                                                                                            var77 = method939(var305, var4, var61);
                                                                                                                        } else if (var305 < 1300) {
                                                                                                                            var77 = method2913(var305, var4, var61);
                                                                                                                        } else if (var305 < 1400) {
                                                                                                                            var77 = method194(var305, var4, var61);
                                                                                                                        } else if (var305 < 1500) {
                                                                                                                            var77 = method3141(var305, var4, var61);
                                                                                                                        } else if (var305 < 1600) {
                                                                                                                            class170 var81 = var61 ? Statics.field720 : Statics.field2761;
                                                                                                                            byte var82;
                                                                                                                            if (var305 == 1500) {
                                                                                                                                field730[++Statics.field1649 - 1] = var81.field2210;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var305 == 1501) {
                                                                                                                                field730[++Statics.field1649 - 1] = var81.field2298;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var305 == 1502) {
                                                                                                                                field730[++Statics.field1649 - 1] = var81.field2212;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var305 == 1503) {
                                                                                                                                field730[++Statics.field1649 - 1] = var81.field2312;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var305 == 1504) {
                                                                                                                                field730[++Statics.field1649 - 1] = var81.field2257 ? 1 : 0;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var305 == 1505) {
                                                                                                                                field730[++Statics.field1649 - 1] = var81.field2207;
                                                                                                                                var82 = 1;
                                                                                                                            } else {
                                                                                                                                var82 = 2;
                                                                                                                            }
                                                                                                                            var77 = var82;
                                                                                                                        } else if (var305 < 1700) {
                                                                                                                            var77 = method2037(var305, var4, var61);
                                                                                                                        } else if (var305 < 1800) {
                                                                                                                            var77 = method3260(var305, var4, var61);
                                                                                                                        } else if (var305 < 1900) {
                                                                                                                            class170 var83 = var61 ? Statics.field720 : Statics.field2761;
                                                                                                                            byte var84;
                                                                                                                            if (var305 == 1800) {
                                                                                                                                field730[++Statics.field1649 - 1] = class171.method11(client.method113(var83));
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var305 == 1801) {
                                                                                                                                int var85 = field730[--Statics.field1649];
                                                                                                                                int var306 = var85 - 1;
                                                                                                                                if (var83.field2271 == null || var306 >= var83.field2271.length || var83.field2271[var306] == null) {
                                                                                                                                    field724[++Statics.field673 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field724[++Statics.field673 - 1] = var83.field2271[var306];
                                                                                                                                }
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var305 == 1802) {
                                                                                                                                if (var83.field2270 == null) {
                                                                                                                                    field724[++Statics.field673 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field724[++Statics.field673 - 1] = var83.field2270;
                                                                                                                                }
                                                                                                                                var84 = 1;
                                                                                                                            } else {
                                                                                                                                var84 = 2;
                                                                                                                            }
                                                                                                                            var77 = var84;
                                                                                                                        } else if (var305 < 2000) {
                                                                                                                            var77 = method3706(var305, var4, var61);
                                                                                                                        } else if (var305 < 2100) {
                                                                                                                            var77 = method209(var305, var4, var61);
                                                                                                                        } else if (var305 < 2200) {
                                                                                                                            var77 = method939(var305, var4, var61);
                                                                                                                        } else if (var305 < 2300) {
                                                                                                                            var77 = method2913(var305, var4, var61);
                                                                                                                        } else if (var305 < 2400) {
                                                                                                                            var77 = method194(var305, var4, var61);
                                                                                                                        } else if (var305 < 2500) {
                                                                                                                            var77 = method3141(var305, var4, var61);
                                                                                                                        } else if (var305 < 2600) {
                                                                                                                            var77 = method678(var305, var4, var61);
                                                                                                                        } else if (var305 < 2700) {
                                                                                                                            class170 var86 = class170.method2518(field730[--Statics.field1649]);
                                                                                                                            byte var87;
                                                                                                                            if (var305 == 2600) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2218;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2601) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2219;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2602) {
                                                                                                                                field724[++Statics.field673 - 1] = var86.field2301;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2603) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2220;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2604) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2221;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2605) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2239;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2606) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2248;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2607) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2250;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2608) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2249;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2609) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2228;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2610) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2229;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2611) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2199;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2612) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2223;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var305 == 2613) {
                                                                                                                                field730[++Statics.field1649 - 1] = var86.field2330.method799();
                                                                                                                                var87 = 1;
                                                                                                                            } else {
                                                                                                                                var87 = 2;
                                                                                                                            }
                                                                                                                            var77 = var87;
                                                                                                                        } else if (var305 < 2800) {
                                                                                                                            byte var89;
                                                                                                                            if (var305 == 2700) {
                                                                                                                                class170 var88 = class170.method2518(field730[--Statics.field1649]);
                                                                                                                                field730[++Statics.field1649 - 1] = var88.field2317;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var305 == 2701) {
                                                                                                                                class170 var90 = class170.method2518(field730[--Statics.field1649]);
                                                                                                                                if (var90.field2317 == -1) {
                                                                                                                                    field730[++Statics.field1649 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field730[++Statics.field1649 - 1] = var90.field2323;
                                                                                                                                }
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var305 == 2702) {
                                                                                                                                int var91 = field730[--Statics.field1649];
                                                                                                                                class18 var92 = (class18) client.field447.method2280((long) var91);
                                                                                                                                if (var92 == null) {
                                                                                                                                    field730[++Statics.field1649 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field730[++Statics.field1649 - 1] = 1;
                                                                                                                                }
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var305 == 2706) {
                                                                                                                                field730[++Statics.field1649 - 1] = client.field452;
                                                                                                                                var89 = 1;
                                                                                                                            } else {
                                                                                                                                var89 = 2;
                                                                                                                            }
                                                                                                                            var77 = var89;
                                                                                                                        } else if (var305 < 2900) {
                                                                                                                            var77 = method635(var305, var4, var61);
                                                                                                                        } else if (var305 < 3000) {
                                                                                                                            var77 = method3706(var305, var4, var61);
                                                                                                                        } else if (var305 < 3200) {
                                                                                                                            var77 = method2031(var305, var4, var61);
                                                                                                                        } else if (var305 < 3300) {
                                                                                                                            byte var96;
                                                                                                                            if (var305 == 3200) {
                                                                                                                                Statics.field1649 -= 3;
                                                                                                                                int var93 = field730[Statics.field1649];
                                                                                                                                int var94 = field730[Statics.field1649 + 1];
                                                                                                                                int var95 = field730[Statics.field1649 + 2];
                                                                                                                                if (client.field526 != 0 && var94 != 0 && client.field528 < 50) {
                                                                                                                                    client.field553[client.field528] = var93;
                                                                                                                                    client.field530[client.field528] = var94;
                                                                                                                                    client.field531[client.field528] = var95;
                                                                                                                                    client.field352[client.field528] = null;
                                                                                                                                    client.field532[client.field528] = 0;
                                                                                                                                    client.field528++;
                                                                                                                                }
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var305 == 3201) {
                                                                                                                                int var97 = field730[--Statics.field1649];
                                                                                                                                if (var97 == -1 && !client.field402) {
                                                                                                                                    class139.method677();
                                                                                                                                } else if (var97 != -1 && client.field524 != var97 && client.field523 != 0 && !client.field402) {
                                                                                                                                    class139.method614(2, Statics.field123, var97, 0, client.field523, false);
                                                                                                                                }
                                                                                                                                client.field524 = var97;
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var305 == 3202) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                Statics.method702(field730[Statics.field1649], field730[Statics.field1649 + 1]);
                                                                                                                                var96 = 1;
                                                                                                                            } else {
                                                                                                                                var96 = 2;
                                                                                                                            }
                                                                                                                            var77 = var96;
                                                                                                                        } else if (var305 < 3400) {
                                                                                                                            var77 = method2909(var305, var4, var61);
                                                                                                                        } else if (var305 < 3500) {
                                                                                                                            byte var106;
                                                                                                                            if (var305 == 3400) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var98 = field730[Statics.field1649];
                                                                                                                                int var99 = field730[Statics.field1649 + 1];
                                                                                                                                class196 var100 = (class196) class196.field2862.method2256((long) var98);
                                                                                                                                class196 var101;
                                                                                                                                if (var100 == null) {
                                                                                                                                    byte[] var102 = Statics.field2871.method3226(8, var98);
                                                                                                                                    class196 var103 = new class196();
                                                                                                                                    if (var102 != null) {
                                                                                                                                        var103.method3425(new class154(var102));
                                                                                                                                    }
                                                                                                                                    class196.field2862.method2258(var103, (long) var98);
                                                                                                                                    var101 = var103;
                                                                                                                                } else {
                                                                                                                                    var101 = var100;
                                                                                                                                }
                                                                                                                                class196 var104 = var101;
                                                                                                                                if (var101.field2864 != 's') {
                                                                                                                                }
                                                                                                                                for (int var105 = 0; var105 < var104.field2867; var105++) {
                                                                                                                                    if (var104.field2869[var105] == var99) {
                                                                                                                                        field724[++Statics.field673 - 1] = var104.field2870[var105];
                                                                                                                                        var104 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var104 != null) {
                                                                                                                                    field724[++Statics.field673 - 1] = var104.field2865;
                                                                                                                                }
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var305 == 3408) {
                                                                                                                                Statics.field1649 -= 4;
                                                                                                                                int var107 = field730[Statics.field1649];
                                                                                                                                int var108 = field730[Statics.field1649 + 1];
                                                                                                                                int var109 = field730[Statics.field1649 + 2];
                                                                                                                                int var110 = field730[Statics.field1649 + 3];
                                                                                                                                class196 var111 = (class196) class196.field2862.method2256((long) var109);
                                                                                                                                class196 var112;
                                                                                                                                if (var111 == null) {
                                                                                                                                    byte[] var113 = Statics.field2871.method3226(8, var109);
                                                                                                                                    class196 var114 = new class196();
                                                                                                                                    if (var113 != null) {
                                                                                                                                        var114.method3425(new class154(var113));
                                                                                                                                    }
                                                                                                                                    class196.field2862.method2258(var114, (long) var109);
                                                                                                                                    var112 = var114;
                                                                                                                                } else {
                                                                                                                                    var112 = var111;
                                                                                                                                }
                                                                                                                                class196 var115 = var112;
                                                                                                                                if (var112.field2863 == var107 && var112.field2864 == var108) {
                                                                                                                                    for (int var116 = 0; var116 < var115.field2867; var116++) {
                                                                                                                                        if (var115.field2869[var116] == var110) {
                                                                                                                                            if (var108 == 115) {
                                                                                                                                                field724[++Statics.field673 - 1] = var115.field2870[var116];
                                                                                                                                            } else {
                                                                                                                                                field730[++Statics.field1649 - 1] = var115.field2868[var116];
                                                                                                                                            }
                                                                                                                                            var115 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var115 != null) {
                                                                                                                                        if (var108 == 115) {
                                                                                                                                            field724[++Statics.field673 - 1] = var115.field2865;
                                                                                                                                        } else {
                                                                                                                                            field730[++Statics.field1649 - 1] = var115.field2866;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var106 = 1;
                                                                                                                                } else {
                                                                                                                                    if (var108 == 115) {
                                                                                                                                        field724[++Statics.field673 - 1] = "null";
                                                                                                                                    } else {
                                                                                                                                        field730[++Statics.field1649 - 1] = 0;
                                                                                                                                    }
                                                                                                                                    var106 = 1;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var106 = 2;
                                                                                                                            }
                                                                                                                            var77 = var106;
                                                                                                                        } else if (var305 < 3700) {
                                                                                                                            var77 = method613(var305, var4, var61);
                                                                                                                        } else if (var305 < 4000) {
                                                                                                                            var77 = method1860(var305, var4, var61);
                                                                                                                        } else if (var305 < 4100) {
                                                                                                                            byte var119;
                                                                                                                            if (var305 == 4000) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var117 = field730[Statics.field1649];
                                                                                                                                int var118 = field730[Statics.field1649 + 1];
                                                                                                                                field730[++Statics.field1649 - 1] = var117 + var118;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4001) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var120 = field730[Statics.field1649];
                                                                                                                                int var121 = field730[Statics.field1649 + 1];
                                                                                                                                field730[++Statics.field1649 - 1] = var120 - var121;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4002) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var122 = field730[Statics.field1649];
                                                                                                                                int var123 = field730[Statics.field1649 + 1];
                                                                                                                                field730[++Statics.field1649 - 1] = var122 * var123;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4003) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var124 = field730[Statics.field1649];
                                                                                                                                int var125 = field730[Statics.field1649 + 1];
                                                                                                                                field730[++Statics.field1649 - 1] = var124 / var125;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4004) {
                                                                                                                                int var126 = field730[--Statics.field1649];
                                                                                                                                field730[++Statics.field1649 - 1] = (int) (Math.random() * (double) var126);
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4005) {
                                                                                                                                int var127 = field730[--Statics.field1649];
                                                                                                                                field730[++Statics.field1649 - 1] = (int) (Math.random() * (double) (var127 + 1));
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4006) {
                                                                                                                                Statics.field1649 -= 5;
                                                                                                                                int var128 = field730[Statics.field1649];
                                                                                                                                int var129 = field730[Statics.field1649 + 1];
                                                                                                                                int var130 = field730[Statics.field1649 + 2];
                                                                                                                                int var131 = field730[Statics.field1649 + 3];
                                                                                                                                int var132 = field730[Statics.field1649 + 4];
                                                                                                                                field730[++Statics.field1649 - 1] = (var129 - var128) * (var132 - var130) / (var131 - var130) + var128;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4007) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var133 = field730[Statics.field1649];
                                                                                                                                int var134 = field730[Statics.field1649 + 1];
                                                                                                                                field730[++Statics.field1649 - 1] = var133 * var134 / 100 + var133;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4008) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var135 = field730[Statics.field1649];
                                                                                                                                int var136 = field730[Statics.field1649 + 1];
                                                                                                                                field730[++Statics.field1649 - 1] = var135 | 0x1 << var136;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4009) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var137 = field730[Statics.field1649];
                                                                                                                                int var138 = field730[Statics.field1649 + 1];
                                                                                                                                field730[++Statics.field1649 - 1] = var137 & -1 - (0x1 << var138);
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4010) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var139 = field730[Statics.field1649];
                                                                                                                                int var140 = field730[Statics.field1649 + 1];
                                                                                                                                field730[++Statics.field1649 - 1] = (var139 & 0x1 << var140) == 0 ? 0 : 1;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4011) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var141 = field730[Statics.field1649];
                                                                                                                                int var142 = field730[Statics.field1649 + 1];
                                                                                                                                field730[++Statics.field1649 - 1] = var141 % var142;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4012) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var143 = field730[Statics.field1649];
                                                                                                                                int var144 = field730[Statics.field1649 + 1];
                                                                                                                                if (var143 == 0) {
                                                                                                                                    field730[++Statics.field1649 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field730[++Statics.field1649 - 1] = (int) Math.pow((double) var143, (double) var144);
                                                                                                                                }
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4013) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var145 = field730[Statics.field1649];
                                                                                                                                int var146 = field730[Statics.field1649 + 1];
                                                                                                                                if (var145 == 0) {
                                                                                                                                    field730[++Statics.field1649 - 1] = 0;
                                                                                                                                } else if (var146 == 0) {
                                                                                                                                    field730[++Statics.field1649 - 1] = Integer.MAX_VALUE;
                                                                                                                                } else {
                                                                                                                                    field730[++Statics.field1649 - 1] = (int) Math.pow((double) var145, 1.0D / (double) var146);
                                                                                                                                }
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4014) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var147 = field730[Statics.field1649];
                                                                                                                                int var148 = field730[Statics.field1649 + 1];
                                                                                                                                field730[++Statics.field1649 - 1] = var147 & var148;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4015) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var149 = field730[Statics.field1649];
                                                                                                                                int var150 = field730[Statics.field1649 + 1];
                                                                                                                                field730[++Statics.field1649 - 1] = var149 | var150;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var305 == 4018) {
                                                                                                                                Statics.field1649 -= 3;
                                                                                                                                long var151 = (long) field730[Statics.field1649];
                                                                                                                                long var153 = (long) field730[Statics.field1649 + 1];
                                                                                                                                long var155 = (long) field730[Statics.field1649 + 2];
                                                                                                                                field730[++Statics.field1649 - 1] = (int) (var151 * var155 / var153);
                                                                                                                                var119 = 1;
                                                                                                                            } else {
                                                                                                                                var119 = 2;
                                                                                                                            }
                                                                                                                            var77 = var119;
                                                                                                                        } else if (var305 < 4200) {
                                                                                                                            byte var159;
                                                                                                                            if (var305 == 4100) {
                                                                                                                                String var157 = field724[--Statics.field673];
                                                                                                                                int var158 = field730[--Statics.field1649];
                                                                                                                                field724[++Statics.field673 - 1] = var157 + var158;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4101) {
                                                                                                                                Statics.field673 -= 2;
                                                                                                                                String var160 = field724[Statics.field673];
                                                                                                                                String var161 = field724[Statics.field673 + 1];
                                                                                                                                field724[++Statics.field673 - 1] = var160 + var161;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4102) {
                                                                                                                                String var162 = field724[--Statics.field673];
                                                                                                                                int var163 = field730[--Statics.field1649];
                                                                                                                                String[] var164 = field724;
                                                                                                                                int var165 = ++Statics.field673 - 1;
                                                                                                                                String var167;
                                                                                                                                if (var163 < 0) {
                                                                                                                                    var167 = Integer.toString(var163);
                                                                                                                                } else {
                                                                                                                                    int var168 = var163;
                                                                                                                                    String var169;
                                                                                                                                    if (var163 < 0) {
                                                                                                                                        var169 = Integer.toString(var163, 10);
                                                                                                                                    } else {
                                                                                                                                        int var170 = 2;
                                                                                                                                        int var171 = var163 / 10;
                                                                                                                                        while (var171 != 0) {
                                                                                                                                            var171 /= 10;
                                                                                                                                            var170++;
                                                                                                                                        }
                                                                                                                                        char[] var172 = new char[var170];
                                                                                                                                        var172[0] = '+';
                                                                                                                                        for (int var173 = var170 - 1; var173 > 0; var173--) {
                                                                                                                                            int var174 = var168;
                                                                                                                                            var168 /= 10;
                                                                                                                                            int var175 = var174 - var168 * 10;
                                                                                                                                            if (var175 >= 10) {
                                                                                                                                                var172[var173] = (char) (var175 + 87);
                                                                                                                                            } else {
                                                                                                                                                var172[var173] = (char) (var175 + 48);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        var169 = new String(var172);
                                                                                                                                    }
                                                                                                                                    var167 = var169;
                                                                                                                                }
                                                                                                                                var164[var165] = var162 + var167;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4103) {
                                                                                                                                String var176 = field724[--Statics.field673];
                                                                                                                                field724[++Statics.field673 - 1] = var176.toLowerCase();
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4104) {
                                                                                                                                int var177 = field730[--Statics.field1649];
                                                                                                                                long var178 = ((long) var177 + 11745L) * 86400000L;
                                                                                                                                field723.setTime(new Date(var178));
                                                                                                                                int var180 = field723.get(5);
                                                                                                                                int var181 = field723.get(2);
                                                                                                                                int var182 = field723.get(1);
                                                                                                                                field724[++Statics.field673 - 1] = var180 + "-" + field729[var181] + "-" + var182;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4105) {
                                                                                                                                Statics.field673 -= 2;
                                                                                                                                String var183 = field724[Statics.field673];
                                                                                                                                String var184 = field724[Statics.field673 + 1];
                                                                                                                                if (Statics.field85.field241 != null && Statics.field85.field241.field2169) {
                                                                                                                                    field724[++Statics.field673 - 1] = var184;
                                                                                                                                } else {
                                                                                                                                    field724[++Statics.field673 - 1] = var183;
                                                                                                                                }
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4106) {
                                                                                                                                int var185 = field730[--Statics.field1649];
                                                                                                                                field724[++Statics.field673 - 1] = Integer.toString(var185);
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4107) {
                                                                                                                                Statics.field673 -= 2;
                                                                                                                                int[] var186 = field730;
                                                                                                                                int var187 = ++Statics.field1649 - 1;
                                                                                                                                String var188 = field724[Statics.field673];
                                                                                                                                String var189 = field724[Statics.field673 + 1];
                                                                                                                                int var190 = client.field290;
                                                                                                                                int var191 = var188.length();
                                                                                                                                int var192 = var189.length();
                                                                                                                                int var193 = 0;
                                                                                                                                int var194 = 0;
                                                                                                                                char var195 = 0;
                                                                                                                                char var196 = 0;
                                                                                                                                int var197;
                                                                                                                                label1219: while (true) {
                                                                                                                                    if (var193 - var195 >= var191 && var194 - var196 >= var192) {
                                                                                                                                        int var206 = Math.min(var191, var192);
                                                                                                                                        for (int var207 = 0; var207 < var206; var207++) {
                                                                                                                                            char var210 = var188.charAt(var207);
                                                                                                                                            char var211 = var189.charAt(var207);
                                                                                                                                            if (var210 != var211 && Character.toUpperCase(var210) != Character.toUpperCase(var211)) {
                                                                                                                                                char var212 = Character.toLowerCase(var210);
                                                                                                                                                char var213 = Character.toLowerCase(var211);
                                                                                                                                                if (var212 != var213) {
                                                                                                                                                    var197 = class203.method3071(var212, var190) - class203.method3071(var213, var190);
                                                                                                                                                    break label1219;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        int var214 = var191 - var192;
                                                                                                                                        if (var214 == 0) {
                                                                                                                                            for (int var215 = 0; var215 < var206; var215++) {
                                                                                                                                                char var216 = var188.charAt(var215);
                                                                                                                                                char var217 = var189.charAt(var215);
                                                                                                                                                if (var216 != var217) {
                                                                                                                                                    var197 = class203.method3071(var216, var190) - class203.method3071(var217, var190);
                                                                                                                                                    break label1219;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var197 = 0;
                                                                                                                                        } else {
                                                                                                                                            var197 = var214;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    if (var193 - var195 >= var191) {
                                                                                                                                        var197 = -1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    if (var194 - var196 >= var192) {
                                                                                                                                        var197 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    char var198;
                                                                                                                                    if (var195 == 0) {
                                                                                                                                        var198 = var188.charAt(var193++);
                                                                                                                                    } else {
                                                                                                                                        var198 = var195;
                                                                                                                                        boolean var199 = false;
                                                                                                                                    }
                                                                                                                                    char var200;
                                                                                                                                    if (var196 == 0) {
                                                                                                                                        var200 = var189.charAt(var194++);
                                                                                                                                    } else {
                                                                                                                                        var200 = var196;
                                                                                                                                        boolean var201 = false;
                                                                                                                                    }
                                                                                                                                    var195 = class203.method3365(var198);
                                                                                                                                    var196 = class203.method3365(var200);
                                                                                                                                    char var202 = class203.method1891(var198, var190);
                                                                                                                                    char var203 = class203.method1891(var200, var190);
                                                                                                                                    if (var202 != var203 && Character.toUpperCase(var202) != Character.toUpperCase(var203)) {
                                                                                                                                        char var204 = Character.toLowerCase(var202);
                                                                                                                                        char var205 = Character.toLowerCase(var203);
                                                                                                                                        if (var204 != var205) {
                                                                                                                                            var197 = class203.method3071(var204, var190) - class203.method3071(var205, var190);
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                byte var219;
                                                                                                                                if (var197 > 0) {
                                                                                                                                    var219 = 1;
                                                                                                                                } else if (var197 < 0) {
                                                                                                                                    var219 = -1;
                                                                                                                                } else {
                                                                                                                                    var219 = 0;
                                                                                                                                }
                                                                                                                                var186[var187] = var219;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4108) {
                                                                                                                                String var220 = field724[--Statics.field673];
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var221 = field730[Statics.field1649];
                                                                                                                                int var222 = field730[Statics.field1649 + 1];
                                                                                                                                byte[] var223 = Statics.field534.method3226(var222, 0);
                                                                                                                                class209 var224 = new class209(var223);
                                                                                                                                field730[++Statics.field1649 - 1] = var224.method3777(var220, var221);
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4109) {
                                                                                                                                String var225 = field724[--Statics.field673];
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var226 = field730[Statics.field1649];
                                                                                                                                int var227 = field730[Statics.field1649 + 1];
                                                                                                                                byte[] var228 = Statics.field534.method3226(var227, 0);
                                                                                                                                class209 var229 = new class209(var228);
                                                                                                                                field730[++Statics.field1649 - 1] = var229.method3766(var225, var226);
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4110) {
                                                                                                                                Statics.field673 -= 2;
                                                                                                                                String var230 = field724[Statics.field673];
                                                                                                                                String var231 = field724[Statics.field673 + 1];
                                                                                                                                if (field730[--Statics.field1649] == 1) {
                                                                                                                                    field724[++Statics.field673 - 1] = var230;
                                                                                                                                } else {
                                                                                                                                    field724[++Statics.field673 - 1] = var231;
                                                                                                                                }
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4111) {
                                                                                                                                String var232 = field724[--Statics.field673];
                                                                                                                                field724[++Statics.field673 - 1] = class210.method3768(var232);
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4112) {
                                                                                                                                String var233 = field724[--Statics.field673];
                                                                                                                                int var234 = field730[--Statics.field1649];
                                                                                                                                field724[++Statics.field673 - 1] = var233 + (char) var234;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4113) {
                                                                                                                                int var235 = field730[--Statics.field1649];
                                                                                                                                field730[++Statics.field1649 - 1] = class208.method953((char) var235) ? 1 : 0;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4114) {
                                                                                                                                int var236 = field730[--Statics.field1649];
                                                                                                                                field730[++Statics.field1649 - 1] = class208.method835((char) var236) ? 1 : 0;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4115) {
                                                                                                                                int var237 = field730[--Statics.field1649];
                                                                                                                                int[] var238 = field730;
                                                                                                                                int var239 = ++Statics.field1649 - 1;
                                                                                                                                char var240 = (char) var237;
                                                                                                                                boolean var241 = var240 >= 'A' && var240 <= 'Z' || var240 >= 'a' && var240 <= 'z';
                                                                                                                                var238[var239] = var241 ? 1 : 0;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4116) {
                                                                                                                                int var242 = field730[--Statics.field1649];
                                                                                                                                field730[++Statics.field1649 - 1] = class208.method1880((char) var242) ? 1 : 0;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4117) {
                                                                                                                                String var243 = field724[--Statics.field673];
                                                                                                                                if (var243 == null) {
                                                                                                                                    field730[++Statics.field1649 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field730[++Statics.field1649 - 1] = var243.length();
                                                                                                                                }
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4118) {
                                                                                                                                String var244 = field724[--Statics.field673];
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var245 = field730[Statics.field1649];
                                                                                                                                int var246 = field730[Statics.field1649 + 1];
                                                                                                                                field724[++Statics.field673 - 1] = var244.substring(var245, var246);
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4119) {
                                                                                                                                String var247 = field724[--Statics.field673];
                                                                                                                                StringBuilder var248 = new StringBuilder(var247.length());
                                                                                                                                boolean var249 = false;
                                                                                                                                for (int var250 = 0; var250 < var247.length(); var250++) {
                                                                                                                                    char var251 = var247.charAt(var250);
                                                                                                                                    if (var251 == '<') {
                                                                                                                                        var249 = true;
                                                                                                                                    } else if (var251 == '>') {
                                                                                                                                        var249 = false;
                                                                                                                                    } else if (!var249) {
                                                                                                                                        var248.append(var251);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field724[++Statics.field673 - 1] = var248.toString();
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4120) {
                                                                                                                                String var252 = field724[--Statics.field673];
                                                                                                                                int var253 = field730[--Statics.field1649];
                                                                                                                                field730[++Statics.field1649 - 1] = var252.indexOf(var253);
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var305 == 4121) {
                                                                                                                                Statics.field673 -= 2;
                                                                                                                                String var254 = field724[Statics.field673];
                                                                                                                                String var255 = field724[Statics.field673 + 1];
                                                                                                                                int var256 = field730[--Statics.field1649];
                                                                                                                                field730[++Statics.field1649 - 1] = var254.indexOf(var255, var256);
                                                                                                                                var159 = 1;
                                                                                                                            } else {
                                                                                                                                var159 = 2;
                                                                                                                            }
                                                                                                                            var77 = var159;
                                                                                                                        } else if (var305 < 4300) {
                                                                                                                            byte var258;
                                                                                                                            if (var305 == 4200) {
                                                                                                                                int var257 = field730[--Statics.field1649];
                                                                                                                                field724[++Statics.field673 - 1] = class199.method3070(var257).field2962;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var305 == 4201) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var259 = field730[Statics.field1649];
                                                                                                                                int var260 = field730[Statics.field1649 + 1];
                                                                                                                                class199 var261 = class199.method3070(var259);
                                                                                                                                if (var260 < 1 || var260 > 5 || var261.field2976[var260 - 1] == null) {
                                                                                                                                    field724[++Statics.field673 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field724[++Statics.field673 - 1] = var261.field2976[var260 - 1];
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var305 == 4202) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var262 = field730[Statics.field1649];
                                                                                                                                int var263 = field730[Statics.field1649 + 1];
                                                                                                                                class199 var264 = class199.method3070(var262);
                                                                                                                                if (var263 < 1 || var263 > 5 || var264.field2966[var263 - 1] == null) {
                                                                                                                                    field724[++Statics.field673 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field724[++Statics.field673 - 1] = var264.field2966[var263 - 1];
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var305 == 4203) {
                                                                                                                                int var265 = field730[--Statics.field1649];
                                                                                                                                field730[++Statics.field1649 - 1] = class199.method3070(var265).field2974;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var305 == 4204) {
                                                                                                                                int var266 = field730[--Statics.field1649];
                                                                                                                                field730[++Statics.field1649 - 1] = class199.method3070(var266).field2954 == 1 ? 1 : 0;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var305 == 4205) {
                                                                                                                                int var267 = field730[--Statics.field1649];
                                                                                                                                class199 var268 = class199.method3070(var267);
                                                                                                                                if (var268.field2994 == -1 && var268.field2993 >= 0) {
                                                                                                                                    field730[++Statics.field1649 - 1] = var268.field2993;
                                                                                                                                } else {
                                                                                                                                    field730[++Statics.field1649 - 1] = var267;
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var305 == 4206) {
                                                                                                                                int var269 = field730[--Statics.field1649];
                                                                                                                                class199 var270 = class199.method3070(var269);
                                                                                                                                if (var270.field2994 >= 0 && var270.field2993 >= 0) {
                                                                                                                                    field730[++Statics.field1649 - 1] = var270.field2993;
                                                                                                                                } else {
                                                                                                                                    field730[++Statics.field1649 - 1] = var269;
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var305 == 4207) {
                                                                                                                                int var271 = field730[--Statics.field1649];
                                                                                                                                field730[++Statics.field1649 - 1] = class199.method3070(var271).field3003 ? 1 : 0;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var305 == 4208) {
                                                                                                                                int var272 = field730[--Statics.field1649];
                                                                                                                                class199 var273 = class199.method3070(var272);
                                                                                                                                if (var273.field3001 == -1 && var273.field3004 >= 0) {
                                                                                                                                    field730[++Statics.field1649 - 1] = var273.field3004;
                                                                                                                                } else {
                                                                                                                                    field730[++Statics.field1649 - 1] = var272;
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var305 == 4209) {
                                                                                                                                int var274 = field730[--Statics.field1649];
                                                                                                                                class199 var275 = class199.method3070(var274);
                                                                                                                                if (var275.field3001 >= 0 && var275.field3004 >= 0) {
                                                                                                                                    field730[++Statics.field1649 - 1] = var275.field3004;
                                                                                                                                } else {
                                                                                                                                    field730[++Statics.field1649 - 1] = var274;
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var305 == 4210) {
                                                                                                                                String var276 = field724[--Statics.field673];
                                                                                                                                int var277 = field730[--Statics.field1649];
                                                                                                                                boolean var279 = var277 == 1;
                                                                                                                                String var280 = var276.toLowerCase();
                                                                                                                                short[] var281 = new short[16];
                                                                                                                                int var282 = 0;
                                                                                                                                int var283 = 0;
                                                                                                                                while (true) {
                                                                                                                                    if (var283 >= Statics.field2638) {
                                                                                                                                        Statics.field2034 = var281;
                                                                                                                                        Statics.field266 = 0;
                                                                                                                                        Statics.field1853 = var282;
                                                                                                                                        String[] var287 = new String[Statics.field1853];
                                                                                                                                        for (int var288 = 0; var288 < Statics.field1853; var288++) {
                                                                                                                                            var287[var288] = class199.method3070(var281[var288]).field2962;
                                                                                                                                        }
                                                                                                                                        class151.method1862(var287, Statics.field2034);
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    class199 var284 = class199.method3070(var283);
                                                                                                                                    if ((!var279 || var284.field2951) && var284.field2994 == -1 && var284.field2962.toLowerCase().indexOf(var280) != -1) {
                                                                                                                                        if (var282 >= 250) {
                                                                                                                                            Statics.field1853 = -1;
                                                                                                                                            Statics.field2034 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        if (var282 >= var281.length) {
                                                                                                                                            short[] var285 = new short[var281.length * 2];
                                                                                                                                            for (int var286 = 0; var286 < var282; var286++) {
                                                                                                                                                var285[var286] = var281[var286];
                                                                                                                                            }
                                                                                                                                            var281 = var285;
                                                                                                                                        }
                                                                                                                                        var281[var282++] = (short) var283;
                                                                                                                                    }
                                                                                                                                    var283++;
                                                                                                                                }
                                                                                                                                field730[++Statics.field1649 - 1] = Statics.field1853;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var305 == 4211) {
                                                                                                                                if (Statics.field2034 == null || Statics.field266 >= Statics.field1853) {
                                                                                                                                    field730[++Statics.field1649 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field730[++Statics.field1649 - 1] = Statics.field2034[++Statics.field266 - 1] & 0xFFFF;
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var305 == 4212) {
                                                                                                                                Statics.field266 = 0;
                                                                                                                                var258 = 1;
                                                                                                                            } else {
                                                                                                                                var258 = 2;
                                                                                                                            }
                                                                                                                            var77 = var258;
                                                                                                                        } else if (var305 < 5100) {
                                                                                                                            var77 = method196(var305, var4, var61);
                                                                                                                        } else if (var305 < 5400) {
                                                                                                                            byte var289;
                                                                                                                            if (var305 == 5306) {
                                                                                                                                field730[++Statics.field1649 - 1] = client.method628();
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var305 == 5307) {
                                                                                                                                int var290 = field730[--Statics.field1649];
                                                                                                                                if (var290 == 1 || var290 == 2) {
                                                                                                                                    client.field428 = 0L;
                                                                                                                                    if (var290 >= 2) {
                                                                                                                                        client.field499 = true;
                                                                                                                                    } else {
                                                                                                                                        client.field499 = false;
                                                                                                                                    }
                                                                                                                                    client.method1861();
                                                                                                                                    if (client.field436 >= 25) {
                                                                                                                                        client.field328.method2936(166);
                                                                                                                                        client.field328.method2832(client.method628());
                                                                                                                                        client.field328.method2664(Statics.field22);
                                                                                                                                        client.field328.method2664(Statics.field217);
                                                                                                                                    }
                                                                                                                                    class114.field1774 = true;
                                                                                                                                }
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var305 == 5308) {
                                                                                                                                field730[++Statics.field1649 - 1] = Statics.field1552.field694;
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var305 == 5309) {
                                                                                                                                int var291 = field730[--Statics.field1649];
                                                                                                                                if (var291 == 1 || var291 == 2) {
                                                                                                                                    Statics.field1552.field694 = var291;
                                                                                                                                    class31.method1879();
                                                                                                                                }
                                                                                                                                var289 = 1;
                                                                                                                            } else {
                                                                                                                                var289 = 2;
                                                                                                                            }
                                                                                                                            var77 = var289;
                                                                                                                        } else if (var305 < 5600) {
                                                                                                                            byte var297;
                                                                                                                            if (var305 == 5504) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                int var295 = field730[Statics.field1649];
                                                                                                                                int var296 = field730[Statics.field1649 + 1];
                                                                                                                                if (!client.field333) {
                                                                                                                                    client.field369 = var295;
                                                                                                                                    client.field558 = var296;
                                                                                                                                }
                                                                                                                                var297 = 1;
                                                                                                                            } else if (var305 == 5505) {
                                                                                                                                field730[++Statics.field1649 - 1] = client.field369;
                                                                                                                                var297 = 1;
                                                                                                                            } else if (var305 == 5506) {
                                                                                                                                field730[++Statics.field1649 - 1] = client.field558;
                                                                                                                                var297 = 1;
                                                                                                                            } else if (var305 == 5530) {
                                                                                                                                int var298 = field730[--Statics.field1649];
                                                                                                                                if (var298 < 0) {
                                                                                                                                    var298 = 0;
                                                                                                                                }
                                                                                                                                client.field375 = var298;
                                                                                                                                var297 = 1;
                                                                                                                            } else if (var305 == 5531) {
                                                                                                                                field730[++Statics.field1649 - 1] = client.field375;
                                                                                                                                var297 = 1;
                                                                                                                            } else {
                                                                                                                                var297 = 2;
                                                                                                                            }
                                                                                                                            var77 = var297;
                                                                                                                        } else if (var305 < 5700) {
                                                                                                                            var77 = method922(var305, var4, var61);
                                                                                                                        } else if (var305 < 6300) {
                                                                                                                            byte var299;
                                                                                                                            if (var305 == 6200) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                client.field540 = (short) field730[Statics.field1649];
                                                                                                                                if (client.field540 <= 0) {
                                                                                                                                    client.field540 = 256;
                                                                                                                                }
                                                                                                                                client.field361 = (short) field730[Statics.field1649 + 1];
                                                                                                                                if (client.field361 <= 0) {
                                                                                                                                    client.field361 = 205;
                                                                                                                                }
                                                                                                                                var299 = 1;
                                                                                                                            } else if (var305 == 6201) {
                                                                                                                                Statics.field1649 -= 2;
                                                                                                                                client.field542 = (short) field730[Statics.field1649];
                                                                                                                                if (client.field542 <= 0) {
                                                                                                                                    client.field542 = 256;
                                                                                                                                }
                                                                                                                                client.field543 = (short) field730[Statics.field1649 + 1];
                                                                                                                                if (client.field543 <= 0) {
                                                                                                                                    client.field543 = 320;
                                                                                                                                }
                                                                                                                                var299 = 1;
                                                                                                                            } else if (var305 == 6202) {
                                                                                                                                Statics.field1649 -= 4;
                                                                                                                                client.field401 = (short) field730[Statics.field1649];
                                                                                                                                if (client.field401 <= 0) {
                                                                                                                                    client.field401 = 1;
                                                                                                                                }
                                                                                                                                client.field506 = (short) field730[Statics.field1649 + 1];
                                                                                                                                if (client.field506 <= 0) {
                                                                                                                                    client.field506 = 32767;
                                                                                                                                } else if (client.field506 < client.field401) {
                                                                                                                                    client.field506 = client.field401;
                                                                                                                                }
                                                                                                                                client.field556 = (short) field730[Statics.field1649 + 2];
                                                                                                                                if (client.field556 <= 0) {
                                                                                                                                    client.field556 = 1;
                                                                                                                                }
                                                                                                                                client.field557 = (short) field730[Statics.field1649 + 3];
                                                                                                                                if (client.field557 <= 0) {
                                                                                                                                    client.field557 = 32767;
                                                                                                                                } else if (client.field557 < client.field556) {
                                                                                                                                    client.field557 = client.field556;
                                                                                                                                }
                                                                                                                                var299 = 1;
                                                                                                                            } else if (var305 == 6203) {
                                                                                                                                if (client.field458 == null) {
                                                                                                                                    field730[++Statics.field1649 - 1] = -1;
                                                                                                                                    field730[++Statics.field1649 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    client.method1917(0, 0, client.field458.field2212, client.field458.field2312, false);
                                                                                                                                    field730[++Statics.field1649 - 1] = client.field445;
                                                                                                                                    field730[++Statics.field1649 - 1] = client.field551;
                                                                                                                                }
                                                                                                                                var299 = 1;
                                                                                                                            } else if (var305 == 6204) {
                                                                                                                                field730[++Statics.field1649 - 1] = client.field542;
                                                                                                                                field730[++Statics.field1649 - 1] = client.field543;
                                                                                                                                var299 = 1;
                                                                                                                            } else if (var305 == 6205) {
                                                                                                                                field730[++Statics.field1649 - 1] = client.field540;
                                                                                                                                field730[++Statics.field1649 - 1] = client.field361;
                                                                                                                                var299 = 1;
                                                                                                                            } else {
                                                                                                                                var299 = 2;
                                                                                                                            }
                                                                                                                            var77 = var299;
                                                                                                                        } else if (var305 < 6600) {
                                                                                                                            var77 = method3142(var305, var4, var61);
                                                                                                                        } else {
                                                                                                                            var77 = 2;
                                                                                                                        }
                                                                                                                        switch(var77) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var305 == 0) {
                                                                                                                        field730[++Statics.field1649 - 1] = var7[var5];
                                                                                                                    } else if (var305 == 1) {
                                                                                                                        int var15 = var7[var5];
                                                                                                                        field730[++Statics.field1649 - 1] = class166.field2156[var15];
                                                                                                                    } else if (var305 == 2) {
                                                                                                                        int var16 = var7[var5];
                                                                                                                        class166.field2156[var16] = field730[--Statics.field1649];
                                                                                                                        client.method769(var16);
                                                                                                                    } else if (var305 == 3) {
                                                                                                                        field724[++Statics.field673 - 1] = var4.field933[var5];
                                                                                                                    } else if (var305 == 6) {
                                                                                                                        var5 += var7[var5];
                                                                                                                    } else if (var305 == 7) {
                                                                                                                        Statics.field1649 -= 2;
                                                                                                                        if (field730[Statics.field1649] != field730[Statics.field1649 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var305 == 8) {
                                                                                                                        Statics.field1649 -= 2;
                                                                                                                        if (field730[Statics.field1649] == field730[Statics.field1649 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var305 == 9) {
                                                                                                                        Statics.field1649 -= 2;
                                                                                                                        if (field730[Statics.field1649] < field730[Statics.field1649 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var305 == 10) {
                                                                                                                        Statics.field1649 -= 2;
                                                                                                                        if (field730[Statics.field1649] > field730[Statics.field1649 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var305 == 21) {
                                                                                                                        if (field725 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class12 var17 = field726[--field725];
                                                                                                                        var4 = var17.field119;
                                                                                                                        var6 = var4.field940;
                                                                                                                        var7 = var4.field931;
                                                                                                                        var5 = var17.field114;
                                                                                                                        Statics.field719 = var17.field113;
                                                                                                                        Statics.field735 = var17.field111;
                                                                                                                    } else if (var305 == 25) {
                                                                                                                        int var18 = var7[var5];
                                                                                                                        field730[++Statics.field1649 - 1] = class166.method2904(var18);
                                                                                                                    } else if (var305 == 27) {
                                                                                                                        int var19 = var7[var5];
                                                                                                                        int var20 = field730[--Statics.field1649];
                                                                                                                        class195 var21 = (class195) class195.field2851.method2256((long) var19);
                                                                                                                        class195 var22;
                                                                                                                        if (var21 == null) {
                                                                                                                            byte[] var23 = Statics.field2854.method3226(14, var19);
                                                                                                                            class195 var24 = new class195();
                                                                                                                            if (var23 != null) {
                                                                                                                                var24.method3412(new class154(var23));
                                                                                                                            }
                                                                                                                            class195.field2851.method2258(var24, (long) var19);
                                                                                                                            var22 = var24;
                                                                                                                        } else {
                                                                                                                            var22 = var21;
                                                                                                                        }
                                                                                                                        int var26 = var22.field2850;
                                                                                                                        int var27 = var22.field2853;
                                                                                                                        int var28 = var22.field2855;
                                                                                                                        int var29 = class166.field2154[var28 - var27];
                                                                                                                        if (var20 < 0 || var20 > var29) {
                                                                                                                            var20 = 0;
                                                                                                                        }
                                                                                                                        int var30 = var29 << var27;
                                                                                                                        class166.field2156[var26] = class166.field2156[var26] & ~var30 | var20 << var27 & var30;
                                                                                                                    } else if (var305 == 31) {
                                                                                                                        Statics.field1649 -= 2;
                                                                                                                        if (field730[Statics.field1649] <= field730[Statics.field1649 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var305 == 32) {
                                                                                                                        Statics.field1649 -= 2;
                                                                                                                        if (field730[Statics.field1649] >= field730[Statics.field1649 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var305 == 33) {
                                                                                                                        field730[++Statics.field1649 - 1] = Statics.field719[var7[var5]];
                                                                                                                    } else if (var305 == 34) {
                                                                                                                        Statics.field719[var7[var5]] = field730[--Statics.field1649];
                                                                                                                    } else if (var305 == 35) {
                                                                                                                        field724[++Statics.field673 - 1] = Statics.field735[var7[var5]];
                                                                                                                    } else if (var305 == 36) {
                                                                                                                        Statics.field735[var7[var5]] = field724[--Statics.field673];
                                                                                                                    } else if (var305 == 37) {
                                                                                                                        int var31 = var7[var5];
                                                                                                                        Statics.field673 -= var31;
                                                                                                                        String[] var32 = field724;
                                                                                                                        int var33 = Statics.field673;
                                                                                                                        String var34;
                                                                                                                        if (var31 == 0) {
                                                                                                                            var34 = "";
                                                                                                                        } else if (var31 == 1) {
                                                                                                                            String var35 = var32[var33];
                                                                                                                            if (var35 == null) {
                                                                                                                                var34 = "null";
                                                                                                                            } else {
                                                                                                                                var34 = var35.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var36 = var31 + var33;
                                                                                                                            int var37 = 0;
                                                                                                                            for (int var38 = var33; var38 < var36; var38++) {
                                                                                                                                String var39 = var32[var38];
                                                                                                                                if (var39 == null) {
                                                                                                                                    var37 += 4;
                                                                                                                                } else {
                                                                                                                                    var37 += var39.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var40 = new StringBuilder(var37);
                                                                                                                            for (int var41 = var33; var41 < var36; var41++) {
                                                                                                                                String var42 = var32[var41];
                                                                                                                                if (var42 == null) {
                                                                                                                                    var40.append("null");
                                                                                                                                } else {
                                                                                                                                    var40.append(var42);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var34 = var40.toString();
                                                                                                                        }
                                                                                                                        field724[++Statics.field673 - 1] = var34;
                                                                                                                    } else if (var305 == 38) {
                                                                                                                        Statics.field1649--;
                                                                                                                    } else if (var305 == 39) {
                                                                                                                        Statics.field673--;
                                                                                                                    } else if (var305 == 40) {
                                                                                                                        int var44 = var7[var5];
                                                                                                                        class49 var45 = class49.method184(var44);
                                                                                                                        int[] var46 = new int[var45.field934];
                                                                                                                        String[] var47 = new String[var45.field932];
                                                                                                                        for (int var48 = 0; var48 < var45.field936; var48++) {
                                                                                                                            var46[var48] = field730[Statics.field1649 - var45.field936 + var48];
                                                                                                                        }
                                                                                                                        for (int var49 = 0; var49 < var45.field937; var49++) {
                                                                                                                            var47[var49] = field724[Statics.field673 - var45.field937 + var49];
                                                                                                                        }
                                                                                                                        Statics.field1649 -= var45.field936;
                                                                                                                        Statics.field673 -= var45.field937;
                                                                                                                        class12 var50 = new class12();
                                                                                                                        var50.field119 = var4;
                                                                                                                        var50.field114 = var5;
                                                                                                                        var50.field113 = Statics.field719;
                                                                                                                        var50.field111 = Statics.field735;
                                                                                                                        field726[++field725 - 1] = var50;
                                                                                                                        var4 = var45;
                                                                                                                        var6 = var45.field940;
                                                                                                                        var7 = var45.field931;
                                                                                                                        var5 = -1;
                                                                                                                        Statics.field719 = var46;
                                                                                                                        Statics.field735 = var47;
                                                                                                                    } else if (var305 == 42) {
                                                                                                                        field730[++Statics.field1649 - 1] = Statics.field86.method880(var7[var5]);
                                                                                                                    } else if (var305 == 43) {
                                                                                                                        Statics.field86.method879(var7[var5], field730[--Statics.field1649]);
                                                                                                                    } else if (var305 == 44) {
                                                                                                                        int var51 = var7[var5] >> 16;
                                                                                                                        int var52 = var7[var5] & 0xFFFF;
                                                                                                                        int var53 = field730[--Statics.field1649];
                                                                                                                        if (var53 >= 0 && var53 <= 5000) {
                                                                                                                            field721[var51] = var53;
                                                                                                                            byte var54 = -1;
                                                                                                                            if (var52 == 105) {
                                                                                                                                var54 = 0;
                                                                                                                            }
                                                                                                                            int var55 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var55 >= var53) {
                                                                                                                                    continue label1367;
                                                                                                                                }
                                                                                                                                field722[var51][var55] = var54;
                                                                                                                                var55++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var305 == 45) {
                                                                                                                        int var56 = var7[var5];
                                                                                                                        int var57 = field730[--Statics.field1649];
                                                                                                                        if (var57 < 0 || var57 >= field721[var56]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field730[++Statics.field1649 - 1] = field722[var56][var57];
                                                                                                                    } else if (var305 == 46) {
                                                                                                                        int var58 = var7[var5];
                                                                                                                        Statics.field1649 -= 2;
                                                                                                                        int var59 = field730[Statics.field1649];
                                                                                                                        if (var59 < 0 || var59 >= field721[var58]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field722[var58][var59] = field730[Statics.field1649 + 1];
                                                                                                                    } else if (var305 == 47) {
                                                                                                                        String var60 = Statics.field86.method878(var7[var5]);
                                                                                                                        if (var60 == null) {
                                                                                                                            var60 = "null";
                                                                                                                        }
                                                                                                                        field724[++Statics.field673 - 1] = var60;
                                                                                                                    } else if (var305 == 48) {
                                                                                                                        Statics.field86.method904(var7[var5], field724[--Statics.field673]);
                                                                                                                    } else {
                                                                                                                        throw new IllegalStateException();
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception var304) {
            StringBuilder var302 = new StringBuilder(30);
            var302.append("").append(var4.field1879).append(" ");
            for (int var303 = field725 - 1; var303 >= 0; var303--) {
                var302.append("").append(field726[var303].field119.field1879).append(" ");
            }
            var302.append("").append(var8);
            class102.method1864(var302.toString(), var304);
        }
    }

    @ObfuscatedName("q.i(ILav;ZB)I")
    public static int method209(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class170 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field730[--Statics.field1649];
            var4 = class170.method2518(var3);
        } else {
            var4 = arg2 ? Statics.field720 : Statics.field2761;
        }
        if (arg0 == 1000) {
            Statics.field1649 -= 4;
            var4.field2206 = field730[Statics.field1649];
            var4.field2299 = field730[Statics.field1649 + 1];
            var4.field2202 = field730[Statics.field1649 + 2];
            var4.field2203 = field730[Statics.field1649 + 3];
            client.method1874(var4);
            client.method798(var4);
            if (var3 != -1 && var4.field2245 == 0) {
                client.method642(Statics.field2195[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1649 -= 4;
            var4.field2208 = field730[Statics.field1649];
            var4.field2209 = field730[Statics.field1649 + 1];
            var4.field2204 = field730[Statics.field1649 + 2];
            var4.field2205 = field730[Statics.field1649 + 3];
            client.method1874(var4);
            client.method798(var4);
            if (var3 != -1 && var4.field2245 == 0) {
                client.method642(Statics.field2195[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field730[--Statics.field1649] == 1;
            if (var4.field2257 != var5) {
                var4.field2257 = var5;
                client.method1874(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2281 = field730[--Statics.field1649] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2211 = field730[--Statics.field1649] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("az.t(ILav;ZI)I")
    public static int method939(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class170 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field730[--Statics.field1649];
            var4 = class170.method2518(var3);
        } else {
            var4 = arg2 ? Statics.field720 : Statics.field2761;
        }
        if (arg0 == 1100) {
            Statics.field1649 -= 2;
            var4.field2218 = field730[Statics.field1649];
            if (var4.field2218 > var4.field2220 - var4.field2212) {
                var4.field2218 = var4.field2220 - var4.field2212;
            }
            if (var4.field2218 < 0) {
                var4.field2218 = 0;
            }
            var4.field2219 = field730[Statics.field1649 + 1];
            if (var4.field2219 > var4.field2221 - var4.field2312) {
                var4.field2219 = var4.field2221 - var4.field2312;
            }
            if (var4.field2219 < 0) {
                var4.field2219 = 0;
            }
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2199 = field730[--Statics.field1649];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2226 = field730[--Statics.field1649] == 1;
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2228 = field730[--Statics.field1649];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2230 = field730[--Statics.field1649];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2232 = field730[--Statics.field1649];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2234 = field730[--Statics.field1649];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2279 = field730[--Statics.field1649] == 1;
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2240 = 1;
            var4.field2241 = field730[--Statics.field1649];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1649 -= 6;
            var4.field2246 = field730[Statics.field1649];
            var4.field2247 = field730[Statics.field1649 + 1];
            var4.field2248 = field730[Statics.field1649 + 2];
            var4.field2249 = field730[Statics.field1649 + 3];
            var4.field2250 = field730[Statics.field1649 + 4];
            var4.field2239 = field730[Statics.field1649 + 5];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field730[--Statics.field1649];
            if (var4.field2244 != var5) {
                var4.field2244 = var5;
                var4.field2319 = 0;
                var4.field2304 = 0;
                client.method1874(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2288 = field730[--Statics.field1649] == 1;
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field724[--Statics.field673];
            if (!var6.equals(var4.field2301)) {
                var4.field2301 = var6;
                client.method1874(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2256 = field730[--Statics.field1649];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1649 -= 3;
            var4.field2237 = field730[Statics.field1649];
            var4.field2261 = field730[Statics.field1649 + 1];
            var4.field2284 = field730[Statics.field1649 + 2];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2262 = field730[--Statics.field1649] == 1;
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2236 = field730[--Statics.field1649];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2322 = field730[--Statics.field1649];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2238 = field730[--Statics.field1649] == 1;
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2251 = field730[--Statics.field1649] == 1;
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1649 -= 2;
            var4.field2220 = field730[Statics.field1649];
            var4.field2221 = field730[Statics.field1649 + 1];
            client.method1874(var4);
            if (var3 != -1 && var4.field2245 == 0) {
                client.method642(Statics.field2195[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2197;
            int var8 = var4.field2321;
            client.field328.method2936(192);
            client.field328.method2666(var7);
            client.field328.method2712(var8);
            client.field547 = var4;
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2233 = field730[--Statics.field1649];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2223 = field730[--Statics.field1649];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2229 = field730[--Statics.field1649];
            client.method1874(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var9 = field730[--Statics.field1649];
            class222 var10 = (class222) class149.method784(class222.method1437(), var9);
            if (var10 != null) {
                var4.field2330 = var10;
                client.method1874(var4);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fs.k(ILav;ZI)I")
    public static int method2913(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method2518(field730[--Statics.field1649]);
        } else {
            var3 = arg2 ? Statics.field720 : Statics.field2761;
        }
        client.method1874(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1649 -= 2;
            int var4 = field730[Statics.field1649];
            int var5 = field730[Statics.field1649 + 1];
            var3.field2317 = var4;
            var3.field2323 = var5;
            class199 var6 = class199.method3070(var4);
            var3.field2248 = var6.field2968;
            var3.field2249 = var6.field2969;
            var3.field2250 = var6.field2970;
            var3.field2246 = var6.field2971;
            var3.field2247 = var6.field2981;
            var3.field2239 = var6.field2967;
            if (arg0 == 1205) {
                var3.field2255 = 0;
            } else if (arg0 == 1212 | var6.field2954 == 1) {
                var3.field2255 = 1;
            } else {
                var3.field2255 = 2;
            }
            if (var3.field2252 > 0) {
                var3.field2239 = var3.field2239 * 32 / var3.field2252;
            } else if (var3.field2208 > 0) {
                var3.field2239 = var3.field2239 * 32 / var3.field2208;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2240 = 2;
            var3.field2241 = field730[--Statics.field1649];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2240 = 3;
            var3.field2241 = Statics.field85.field241.method3043();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("y.x(ILav;ZI)I")
    public static int method194(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method2518(field730[--Statics.field1649]);
        } else {
            var3 = arg2 ? Statics.field720 : Statics.field2761;
        }
        if (arg0 == 1300) {
            int var4 = field730[--Statics.field1649] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3082(var4, field724[--Statics.field673]);
                return 1;
            } else {
                Statics.field673--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1649 -= 2;
            int var5 = field730[Statics.field1649];
            int var6 = field730[Statics.field1649 + 1];
            var3.field2272 = class170.method2178(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2275 = field730[--Statics.field1649] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2273 = field730[--Statics.field1649];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2213 = field730[--Statics.field1649];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2270 = field724[--Statics.field673];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2276 = field724[--Statics.field673];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2271 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fl.z(ILav;ZB)I")
    public static int method3141(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method2518(field730[--Statics.field1649]);
        } else {
            var3 = arg2 ? Statics.field720 : Statics.field2761;
        }
        String var4 = field724[--Statics.field673];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field730[--Statics.field1649];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field730[--Statics.field1649];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field724[--Statics.field673];
            } else {
                var7[var8] = Integer.valueOf(field730[--Statics.field1649]);
            }
        }
        int var9 = field730[--Statics.field1649];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2187 = var7;
        } else if (arg0 == 1401) {
            var3.field2331 = var7;
        } else if (arg0 == 1402) {
            var3.field2328 = var7;
        } else if (arg0 == 1403) {
            var3.field2283 = var7;
        } else if (arg0 == 1404) {
            var3.field2242 = var7;
        } else if (arg0 == 1405) {
            var3.field2286 = var7;
        } else if (arg0 == 1406) {
            var3.field2264 = var7;
        } else if (arg0 == 1407) {
            var3.field2290 = var7;
            var3.field2291 = var5;
        } else if (arg0 == 1408) {
            var3.field2296 = var7;
        } else if (arg0 == 1409) {
            var3.field2289 = var7;
        } else if (arg0 == 1410) {
            var3.field2315 = var7;
        } else if (arg0 == 1411) {
            var3.field2280 = var7;
        } else if (arg0 == 1412) {
            var3.field2268 = var7;
        } else if (arg0 == 1414) {
            var3.field2292 = var7;
            var3.field2293 = var5;
        } else if (arg0 == 1415) {
            var3.field2294 = var7;
            var3.field2295 = var5;
        } else if (arg0 == 1416) {
            var3.field2254 = var7;
        } else if (arg0 == 1417) {
            var3.field2259 = var7;
        } else if (arg0 == 1418) {
            var3.field2297 = var7;
        } else if (arg0 == 1419) {
            var3.field2300 = var7;
        } else if (arg0 == 1420) {
            var3.field2266 = var7;
        } else if (arg0 == 1421) {
            var3.field2302 = var7;
        } else if (arg0 == 1422) {
            var3.field2303 = var7;
        } else if (arg0 == 1423) {
            var3.field2198 = var7;
        } else if (arg0 == 1424) {
            var3.field2305 = var7;
        } else if (arg0 == 1425) {
            var3.field2307 = var7;
        } else if (arg0 == 1426) {
            var3.field2308 = var7;
        } else if (arg0 == 1427) {
            var3.field2306 = var7;
        } else {
            return 2;
        }
        var3.field2277 = true;
        return 1;
    }

    @ObfuscatedName("dg.p(ILav;ZI)I")
    public static int method2037(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = arg2 ? Statics.field720 : Statics.field2761;
        if (arg0 == 1600) {
            field730[++Statics.field1649 - 1] = var3.field2218;
            return 1;
        } else if (arg0 == 1601) {
            field730[++Statics.field1649 - 1] = var3.field2219;
            return 1;
        } else if (arg0 == 1602) {
            field724[++Statics.field673 - 1] = var3.field2301;
            return 1;
        } else if (arg0 == 1603) {
            field730[++Statics.field1649 - 1] = var3.field2220;
            return 1;
        } else if (arg0 == 1604) {
            field730[++Statics.field1649 - 1] = var3.field2221;
            return 1;
        } else if (arg0 == 1605) {
            field730[++Statics.field1649 - 1] = var3.field2239;
            return 1;
        } else if (arg0 == 1606) {
            field730[++Statics.field1649 - 1] = var3.field2248;
            return 1;
        } else if (arg0 == 1607) {
            field730[++Statics.field1649 - 1] = var3.field2250;
            return 1;
        } else if (arg0 == 1608) {
            field730[++Statics.field1649 - 1] = var3.field2249;
            return 1;
        } else if (arg0 == 1609) {
            field730[++Statics.field1649 - 1] = var3.field2228;
            return 1;
        } else if (arg0 == 1610) {
            field730[++Statics.field1649 - 1] = var3.field2229;
            return 1;
        } else if (arg0 == 1611) {
            field730[++Statics.field1649 - 1] = var3.field2199;
            return 1;
        } else if (arg0 == 1612) {
            field730[++Statics.field1649 - 1] = var3.field2223;
            return 1;
        } else if (arg0 == 1613) {
            field730[++Statics.field1649 - 1] = var3.field2330.method799();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gk.s(ILav;ZI)I")
    public static int method3260(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = arg2 ? Statics.field720 : Statics.field2761;
        if (arg0 == 1700) {
            field730[++Statics.field1649 - 1] = var3.field2317;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2317 == -1) {
                field730[++Statics.field1649 - 1] = 0;
            } else {
                field730[++Statics.field1649 - 1] = var3.field2323;
            }
            return 1;
        } else if (arg0 == 1702) {
            field730[++Statics.field1649 - 1] = var3.field2321;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gw.o(ILav;ZI)I")
    public static int method3706(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method2518(field730[--Statics.field1649]);
        } else {
            var3 = arg2 ? Statics.field720 : Statics.field2761;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field718 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2306 == null) {
            return 0;
        } else {
            class19 var4 = new class19();
            var4.field186 = var3;
            var4.field198 = var3.field2306;
            var4.field193 = field718 + 1;
            client.field485.method2320(var4);
            return 1;
        }
    }

    @ObfuscatedName("af.y(ILav;ZB)I")
    public static int method678(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = class170.method2518(field730[--Statics.field1649]);
        if (arg0 == 2500) {
            field730[++Statics.field1649 - 1] = var3.field2210;
            return 1;
        } else if (arg0 == 2501) {
            field730[++Statics.field1649 - 1] = var3.field2298;
            return 1;
        } else if (arg0 == 2502) {
            field730[++Statics.field1649 - 1] = var3.field2212;
            return 1;
        } else if (arg0 == 2503) {
            field730[++Statics.field1649 - 1] = var3.field2312;
            return 1;
        } else if (arg0 == 2504) {
            field730[++Statics.field1649 - 1] = var3.field2257 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field730[++Statics.field1649 - 1] = var3.field2207;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aj.w(ILav;ZI)I")
    public static int method635(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = class170.method2518(field730[--Statics.field1649]);
        if (arg0 == 2800) {
            field730[++Statics.field1649 - 1] = class171.method11(client.method113(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field730[--Statics.field1649];
            int var5 = var4 - 1;
            if (var3.field2271 == null || var5 >= var3.field2271.length || var3.field2271[var5] == null) {
                field724[++Statics.field673 - 1] = "";
            } else {
                field724[++Statics.field673 - 1] = var3.field2271[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2270 == null) {
                field724[++Statics.field673 - 1] = "";
            } else {
                field724[++Statics.field673 - 1] = var3.field2270;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("da.m(ILav;ZB)I")
    public static int method2031(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field724[--Statics.field673];
            class48.method2520(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1649 -= 2;
            client.method958(Statics.field85, field730[Statics.field1649], field730[Statics.field1649 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            client.field328.method2936(6);
            for (class18 var4 = (class18) client.field447.method2275(); var4 != null; var4 = (class18) client.field447.method2276()) {
                if (var4.field180 == 0 || var4.field180 == 3) {
                    client.method679(var4, true);
                }
            }
            if (client.field547 != null) {
                client.method1874(client.field547);
                client.field547 = null;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var5 = field724[--Statics.field673];
            int var6 = 0;
            boolean var7 = false;
            boolean var8 = false;
            int var9 = 0;
            int var10 = var5.length();
            int var11 = 0;
            boolean var13;
            while (true) {
                if (var11 >= var10) {
                    var13 = var8;
                    break;
                }
                label293: {
                    char var12 = var5.charAt(var11);
                    if (var11 == 0) {
                        if (var12 == '-') {
                            var7 = true;
                            break label293;
                        }
                        if (var12 == '+') {
                            break label293;
                        }
                    }
                    int var40;
                    if (var12 >= '0' && var12 <= '9') {
                        var40 = var12 - '0';
                    } else if (var12 >= 'A' && var12 <= 'Z') {
                        var40 = var12 - '7';
                    } else {
                        if (var12 < 'a' || var12 > 'z') {
                            var13 = false;
                            break;
                        }
                        var40 = var12 - 'W';
                    }
                    if (var40 >= 10) {
                        var13 = false;
                        break;
                    }
                    if (var7) {
                        var40 = -var40;
                    }
                    int var14 = var9 * 10 + var40;
                    if (var14 / 10 != var9) {
                        var13 = false;
                        break;
                    }
                    var9 = var14;
                    var8 = true;
                }
                var11++;
            }
            if (var13) {
                var6 = class208.method3649(var5);
            }
            client.field328.method2936(26);
            client.field328.method2666(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var16 = field724[--Statics.field673];
            client.field328.method2936(198);
            client.field328.method2832(var16.length() + 1);
            client.field328.method2715(var16);
            return 1;
        } else if (arg0 == 3106) {
            String var17 = field724[--Statics.field673];
            client.field328.method2936(32);
            client.field328.method2832(var17.length() + 1);
            client.field328.method2715(var17);
            return 1;
        } else if (arg0 == 3107) {
            int var18 = field730[--Statics.field1649];
            String var19 = field724[--Statics.field673];
            int var20 = class46.field908;
            int[] var21 = class46.field901;
            boolean var22 = false;
            for (int var23 = 0; var23 < var20; var23++) {
                class24 var24 = client.field406[var21[var23]];
                if (var24 != null && Statics.field85 != var24 && var24.field264 != null && var24.field264.equalsIgnoreCase(var19)) {
                    if (var18 == 1) {
                        client.field328.method2936(69);
                        client.field328.method2832(0);
                        client.field328.method2712(var21[var23]);
                    } else if (var18 == 4) {
                        client.field328.method2936(225);
                        client.field328.method2664(var21[var23]);
                        client.field328.method2870(0);
                    } else if (var18 == 6) {
                        client.field328.method2936(58);
                        client.field328.method2709(var21[var23]);
                        client.field328.method2702(0);
                    } else if (var18 == 7) {
                        client.field328.method2936(53);
                        client.field328.method2702(0);
                        client.field328.method2711(var21[var23]);
                    }
                    var22 = true;
                    break;
                }
            }
            if (!var22) {
                class48.method2520(4, "", class174.field2616 + var19);
            }
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1649 -= 3;
            int var25 = field730[Statics.field1649];
            int var26 = field730[Statics.field1649 + 1];
            int var27 = field730[Statics.field1649 + 2];
            class170 var28 = class170.method2518(var27);
            client.method1410(var28, var25, var26);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1649 -= 2;
            int var29 = field730[Statics.field1649];
            int var30 = field730[Statics.field1649 + 1];
            class170 var31 = arg2 ? Statics.field720 : Statics.field2761;
            client.method1410(var31, var29, var30);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field770 = field730[--Statics.field1649] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field730[++Statics.field1649 - 1] = Statics.field1552.field690 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1552.field690 = field730[--Statics.field1649] == 1;
            class31.method1879();
            return 1;
        } else if (arg0 == 3113) {
            String var32 = field724[--Statics.field673];
            boolean var33 = field730[--Statics.field1649] == 1;
            if (var33) {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI(var32));
                        return 1;
                    } catch (Exception var39) {
                    }
                }
                if (class115.field1788.startsWith("win")) {
                    class115.method85(var32, 0);
                } else if (class115.field1788.startsWith("mac")) {
                    class115.method909(var32, 1, "openjs");
                } else {
                    class115.method85(var32, 2);
                }
            } else {
                class115.method85(var32, 3);
            }
            return 1;
        } else if (arg0 == 3115) {
            int var35 = field730[--Statics.field1649];
            client.field328.method2936(172);
            client.field328.method2664(var35);
            return 1;
        } else if (arg0 == 3116) {
            int var36 = field730[--Statics.field1649];
            Statics.field673 -= 2;
            String var37 = field724[Statics.field673];
            String var38 = field724[Statics.field673 + 1];
            if (var37.length() > 500) {
                return 1;
            } else if (var38.length() > 500) {
                return 1;
            } else {
                client.field328.method2936(75);
                client.field328.method2664(1 + class154.method616(var37) + class154.method616(var38));
                client.field328.method2715(var38);
                client.field328.method2715(var37);
                client.field328.method2702(var36);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field434 = field730[--Statics.field1649] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fs.u(ILav;ZB)I")
    public static int method2909(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field730[++Statics.field1649 - 1] = client.field293;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1649 -= 2;
            int var3 = field730[Statics.field1649];
            int var4 = field730[Statics.field1649 + 1];
            field730[++Statics.field1649 - 1] = class13.method32(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1649 -= 2;
            int var5 = field730[Statics.field1649];
            int var6 = field730[Statics.field1649 + 1];
            int[] var7 = field730;
            int var8 = ++Statics.field1649 - 1;
            class13 var9 = (class13) class13.field127.method2280((long) var5);
            int var10;
            if (var9 == null) {
                var10 = 0;
            } else if (var6 >= 0 && var6 < var9.field122.length) {
                var10 = var9.field122[var6];
            } else {
                var10 = 0;
            }
            var7[var8] = var10;
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1649 -= 2;
            int var11 = field730[Statics.field1649];
            int var12 = field730[Statics.field1649 + 1];
            field730[++Statics.field1649 - 1] = class13.method4116(var11, var12);
            return 1;
        } else if (arg0 == 3304) {
            int var13 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = class187.method2074(var13).field2763;
            return 1;
        } else if (arg0 == 3305) {
            int var14 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = client.field303[var14];
            return 1;
        } else if (arg0 == 3306) {
            int var15 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = client.field421[var15];
            return 1;
        } else if (arg0 == 3307) {
            int var16 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = client.field422[var16];
            return 1;
        } else if (arg0 == 3308) {
            int var17 = Statics.field2111;
            int var18 = (Statics.field85.field658 >> 7) + Statics.field221;
            int var19 = (Statics.field85.field632 >> 7) + Statics.field21;
            field730[++Statics.field1649 - 1] = (var17 << 28) + (var18 << 14) + var19;
            return 1;
        } else if (arg0 == 3309) {
            int var20 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = var20 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var21 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = var21 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var22 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = var22 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field730[++Statics.field1649 - 1] = client.field288 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1649 -= 2;
            int var23 = field730[Statics.field1649] + 32768;
            int var24 = field730[Statics.field1649 + 1];
            field730[++Statics.field1649 - 1] = class13.method32(var23, var24);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1649 -= 2;
            int var25 = field730[Statics.field1649] + 32768;
            int var26 = field730[Statics.field1649 + 1];
            int[] var27 = field730;
            int var28 = ++Statics.field1649 - 1;
            class13 var29 = (class13) class13.field127.method2280((long) var25);
            int var30;
            if (var29 == null) {
                var30 = 0;
            } else if (var26 >= 0 && var26 < var29.field122.length) {
                var30 = var29.field122[var26];
            } else {
                var30 = 0;
            }
            var27[var28] = var30;
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1649 -= 2;
            int var31 = field730[Statics.field1649] + 32768;
            int var32 = field730[Statics.field1649 + 1];
            field730[++Statics.field1649 - 1] = class13.method4116(var31, var32);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field371 >= 2) {
                field730[++Statics.field1649 - 1] = client.field371;
            } else {
                field730[++Statics.field1649 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field730[++Statics.field1649 - 1] = client.field505;
            return 1;
        } else if (arg0 == 3318) {
            field730[++Statics.field1649 - 1] = client.field282;
            return 1;
        } else if (arg0 == 3321) {
            field730[++Statics.field1649 - 1] = client.field451;
            return 1;
        } else if (arg0 == 3322) {
            field730[++Statics.field1649 - 1] = client.field560;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field455) {
                field730[++Statics.field1649 - 1] = 1;
            } else {
                field730[++Statics.field1649 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field730[++Statics.field1649 - 1] = client.field283;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g.q(ILav;ZI)I")
    public static int method613(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field554 == 0) {
                field730[++Statics.field1649 - 1] = -2;
            } else if (client.field554 == 1) {
                field730[++Statics.field1649 - 1] = -1;
            } else {
                field730[++Statics.field1649 - 1] = client.field342;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field730[--Statics.field1649];
            if (client.field554 == 2 && var3 < client.field342) {
                field724[++Statics.field673 - 1] = client.field555[var3].field144;
                field724[++Statics.field673 - 1] = client.field555[var3].field147;
            } else {
                field724[++Statics.field673 - 1] = "";
                field724[++Statics.field673 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = field730[--Statics.field1649];
            if (client.field554 == 2 && var4 < client.field342) {
                field730[++Statics.field1649 - 1] = client.field555[var4].field150;
            } else {
                field730[++Statics.field1649 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = field730[--Statics.field1649];
            if (client.field554 == 2 && var5 < client.field342) {
                field730[++Statics.field1649 - 1] = client.field555[var5].field143;
            } else {
                field730[++Statics.field1649 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = field724[--Statics.field673];
            int var7 = field730[--Statics.field1649];
            client.method195(var6, var7);
            return 1;
        } else if (arg0 == 3605) {
            String var8 = field724[--Statics.field673];
            if (var8 != null) {
                if ((client.field342 < 200 || client.field408 == 1) && client.field342 < 400) {
                    String var9 = class205.method123(var8, Statics.field287);
                    if (var9 != null) {
                        int var10 = 0;
                        while (true) {
                            if (var10 >= client.field342) {
                                for (int var14 = 0; var14 < client.field467; var14++) {
                                    class20 var15 = client.field291[var14];
                                    String var16 = class205.method123(var15.field201, Statics.field287);
                                    if (var16 != null && var16.equals(var9)) {
                                        class48.method2520(30, "", class174.field2525 + var8 + class174.field2583);
                                        return 1;
                                    }
                                    if (var15.field203 != null) {
                                        String var17 = class205.method123(var15.field203, Statics.field287);
                                        if (var17 != null && var17.equals(var9)) {
                                            class48.method2520(30, "", class174.field2525 + var8 + class174.field2583);
                                            return 1;
                                        }
                                    }
                                }
                                if (class205.method123(Statics.field85.field264, Statics.field287).equals(var9)) {
                                    class48.method2520(30, "", class174.field2523);
                                } else {
                                    client.field328.method2936(228);
                                    client.field328.method2832(class154.method616(var8));
                                    client.field328.method2715(var8);
                                }
                                break;
                            }
                            class15 var11 = client.field555[var10];
                            String var12 = class205.method123(var11.field144, Statics.field287);
                            if (var12 != null && var12.equals(var9)) {
                                class48.method2520(30, "", var8 + class174.field2387);
                                break;
                            }
                            if (var11.field147 != null) {
                                String var13 = class205.method123(var11.field147, Statics.field287);
                                if (var13 != null && var13.equals(var9)) {
                                    class48.method2520(30, "", var8 + class174.field2387);
                                    break;
                                }
                            }
                            var10++;
                        }
                    }
                } else {
                    class48.method2520(30, "", class174.field2610);
                }
            }
            return 1;
        } else if (arg0 == 3606) {
            String var18 = field724[--Statics.field673];
            if (var18 != null) {
                String var19 = class205.method123(var18, Statics.field287);
                if (var19 != null) {
                    for (int var20 = 0; var20 < client.field342; var20++) {
                        class15 var21 = client.field555[var20];
                        String var22 = var21.field144;
                        String var23 = class205.method123(var22, Statics.field287);
                        if (class218.method3845(var18, var19, var22, var23)) {
                            client.field342--;
                            for (int var24 = var20; var24 < client.field342; var24++) {
                                client.field555[var24] = client.field555[var24 + 1];
                            }
                            client.field286 = client.field471;
                            client.field328.method2936(120);
                            client.field328.method2832(class154.method616(var18));
                            client.field328.method2715(var18);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3607) {
            String var25 = field724[--Statics.field673];
            client.method1907(var25, false);
            return 1;
        } else if (arg0 == 3608) {
            String var26 = field724[--Statics.field673];
            if (var26 != null) {
                String var27 = class205.method123(var26, Statics.field287);
                if (var27 != null) {
                    for (int var28 = 0; var28 < client.field467; var28++) {
                        class20 var29 = client.field291[var28];
                        String var30 = var29.field201;
                        String var31 = class205.method123(var30, Statics.field287);
                        if (class218.method3845(var26, var27, var30, var31)) {
                            client.field467--;
                            for (int var32 = var28; var32 < client.field467; var32++) {
                                client.field291[var32] = client.field291[var32 + 1];
                            }
                            client.field286 = client.field471;
                            client.field328.method2936(249);
                            client.field328.method2832(class154.method616(var26));
                            client.field328.method2715(var26);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3609) {
            String var33 = field724[--Statics.field673];
            class178[] var34 = new class178[] { class178.field2659, class178.field2662, class178.field2669, class178.field2658, class178.field2664, class178.field2665 };
            class178[] var35 = var34;
            for (int var36 = 0; var36 < var35.length; var36++) {
                class178 var37 = var35[var36];
                if (var37.field2661 != -1 && var33.startsWith(class38.method615(var37.field2661))) {
                    var33 = var33.substring(6 + Integer.toString(var37.field2661).length());
                    break;
                }
            }
            field730[++Statics.field1649 - 1] = client.method954(var33, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field513 == null) {
                field724[++Statics.field673 - 1] = "";
            } else {
                field724[++Statics.field673 - 1] = class206.method937(client.field513);
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field513 == null) {
                field730[++Statics.field1649 - 1] = 0;
            } else {
                field730[++Statics.field1649 - 1] = Statics.field12;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var38 = field730[--Statics.field1649];
            if (client.field513 == null || var38 >= Statics.field12) {
                field724[++Statics.field673 - 1] = "";
            } else {
                field724[++Statics.field673 - 1] = Statics.field2950[var38].field276;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var39 = field730[--Statics.field1649];
            if (client.field513 == null || var39 >= Statics.field12) {
                field730[++Statics.field1649 - 1] = 0;
            } else {
                field730[++Statics.field1649 - 1] = Statics.field2950[var39].field269;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var40 = field730[--Statics.field1649];
            if (client.field513 == null || var40 >= Statics.field12) {
                field730[++Statics.field1649 - 1] = 0;
            } else {
                field730[++Statics.field1649 - 1] = Statics.field2950[var40].field275;
            }
            return 1;
        } else if (arg0 == 3616) {
            field730[++Statics.field1649 - 1] = Statics.field1027;
            return 1;
        } else if (arg0 == 3617) {
            String var41 = field724[--Statics.field673];
            if (Statics.field2950 != null) {
                client.field328.method2936(110);
                client.field328.method2832(class154.method616(var41));
                client.field328.method2715(var41);
            }
            return 1;
        } else if (arg0 == 3618) {
            field730[++Statics.field1649 - 1] = Statics.field2701;
            return 1;
        } else if (arg0 == 3619) {
            String var42 = field724[--Statics.field673];
            client.method3992(var42);
            return 1;
        } else if (arg0 == 3620) {
            client.field328.method2936(177);
            client.field328.method2832(0);
            return 1;
        } else if (arg0 == 3621) {
            if (client.field554 == 0) {
                field730[++Statics.field1649 - 1] = -1;
            } else {
                field730[++Statics.field1649 - 1] = client.field467;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var43 = field730[--Statics.field1649];
            if (client.field554 == 0 || var43 >= client.field467) {
                field724[++Statics.field673 - 1] = "";
                field724[++Statics.field673 - 1] = "";
            } else {
                field724[++Statics.field673 - 1] = client.field291[var43].field201;
                field724[++Statics.field673 - 1] = client.field291[var43].field203;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var44 = field724[--Statics.field673];
            if (var44.startsWith(class38.method615(0)) || var44.startsWith(class38.method615(1))) {
                var44 = var44.substring(7);
            }
            field730[++Statics.field1649 - 1] = client.method83(var44) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var45 = field730[--Statics.field1649];
            if (Statics.field2950 == null || var45 >= Statics.field12 || !Statics.field2950[var45].field276.equalsIgnoreCase(Statics.field85.field264)) {
                field730[++Statics.field1649 - 1] = 0;
            } else {
                field730[++Statics.field1649 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field500 == null) {
                field724[++Statics.field673 - 1] = "";
            } else {
                field724[++Statics.field673 - 1] = class206.method937(client.field500);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cl.c(ILav;ZI)I")
    public static int method1860(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = client.field562[var3].method48();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = client.field562[var4].field45;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = client.field562[var5].field38;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = client.field562[var6].field39;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = client.field562[var7].field40;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = client.field562[var8].field41;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field730[--Statics.field1649];
            int var10 = client.field562[var9].method47();
            field730[++Statics.field1649 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field730[--Statics.field1649];
            int var12 = client.field562[var11].method47();
            field730[++Statics.field1649 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field730[--Statics.field1649];
            int var14 = client.field562[var13].method47();
            field730[++Statics.field1649 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field730[--Statics.field1649];
            int var16 = client.field562[var15].method47();
            field730[++Statics.field1649 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field730[--Statics.field1649] == 1;
            if (Statics.field2003 != null) {
                Statics.field2003.method19(class2.field9, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field730[--Statics.field1649] == 1;
            if (Statics.field2003 != null) {
                Statics.field2003.method19(class2.field8, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1649 -= 2;
            boolean var19 = field730[Statics.field1649] == 1;
            boolean var20 = field730[Statics.field1649 + 1] == 1;
            if (Statics.field2003 != null) {
                Statics.field2003.method19(new class45(var20), var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field730[--Statics.field1649] == 1;
            if (Statics.field2003 != null) {
                Statics.field2003.method19(class2.field7, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field730[--Statics.field1649] == 1;
            if (Statics.field2003 != null) {
                Statics.field2003.method19(class2.field15, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field730[++Statics.field1649 - 1] = Statics.field2003 == null ? 0 : Statics.field2003.field13.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field730[--Statics.field1649];
            class3 var24 = (class3) Statics.field2003.field13.get(var23);
            field730[++Statics.field1649 - 1] = var24.field25;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field730[--Statics.field1649];
            class3 var26 = (class3) Statics.field2003.field13.get(var25);
            field724[++Statics.field673 - 1] = var26.method23();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field730[--Statics.field1649];
            class3 var28 = (class3) Statics.field2003.field13.get(var27);
            field724[++Statics.field673 - 1] = var28.method30();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field730[--Statics.field1649];
            class3 var30 = (class3) Statics.field2003.field13.get(var29);
            long var31 = class156.method910() - Statics.field767 - var30.field28;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field724[++Statics.field673 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field730[--Statics.field1649];
            class3 var38 = (class3) Statics.field2003.field13.get(var37);
            field730[++Statics.field1649 - 1] = var38.field18.field39;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field730[--Statics.field1649];
            class3 var40 = (class3) Statics.field2003.field13.get(var39);
            field730[++Statics.field1649 - 1] = var40.field18.field38;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field730[--Statics.field1649];
            class3 var42 = (class3) Statics.field2003.field13.get(var41);
            field730[++Statics.field1649 - 1] = var42.field18.field45;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("w.v(ILav;ZS)I")
    public static int method196(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field730[++Statics.field1649 - 1] = client.field453;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1649 -= 3;
            client.field453 = field730[Statics.field1649];
            int var3 = field730[Statics.field1649 + 1];
            class217[] var4 = class217.method1893();
            int var5 = 0;
            class217 var7;
            while (true) {
                if (var5 >= var4.length) {
                    var7 = null;
                    break;
                }
                class217 var6 = var4[var5];
                if (var6.field3178 == var3) {
                    var7 = var6;
                    break;
                }
                var5++;
            }
            Statics.field142 = var7;
            if (Statics.field142 == null) {
                Statics.field142 = class217.field3177;
            }
            client.field382 = field730[Statics.field1649 + 2];
            client.field328.method2936(151);
            client.field328.method2832(client.field453);
            client.field328.method2832(Statics.field142.field3178);
            client.field328.method2832(client.field382);
            return 1;
        } else if (arg0 == 5002) {
            String var8 = field724[--Statics.field673];
            Statics.field1649 -= 2;
            int var9 = field730[Statics.field1649];
            int var10 = field730[Statics.field1649 + 1];
            client.field328.method2936(95);
            client.field328.method2832(class154.method616(var8) + 2);
            client.field328.method2715(var8);
            client.field328.method2832(var9 - 1);
            client.field328.method2832(var10);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1649 -= 2;
            int var11 = field730[Statics.field1649];
            int var12 = field730[Statics.field1649 + 1];
            class51 var13 = (class51) class48.field927.get(var11);
            class22 var14 = var13.method946(var12);
            if (var14 == null) {
                field730[++Statics.field1649 - 1] = -1;
                field730[++Statics.field1649 - 1] = 0;
                field724[++Statics.field673 - 1] = "";
                field724[++Statics.field673 - 1] = "";
                field724[++Statics.field673 - 1] = "";
            } else {
                field730[++Statics.field1649 - 1] = var14.field230;
                field730[++Statics.field1649 - 1] = var14.field219;
                field724[++Statics.field673 - 1] = var14.field224 == null ? "" : var14.field224;
                field724[++Statics.field673 - 1] = var14.field222 == null ? "" : var14.field222;
                field724[++Statics.field673 - 1] = var14.field218 == null ? "" : var14.field218;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var16 = field730[--Statics.field1649];
            class22 var17 = (class22) class48.field925.method2238((long) var16);
            if (var17 == null) {
                field730[++Statics.field1649 - 1] = -1;
                field730[++Statics.field1649 - 1] = 0;
                field724[++Statics.field673 - 1] = "";
                field724[++Statics.field673 - 1] = "";
                field724[++Statics.field673 - 1] = "";
            } else {
                field730[++Statics.field1649 - 1] = var17.field228;
                field730[++Statics.field1649 - 1] = var17.field219;
                field724[++Statics.field673 - 1] = var17.field224 == null ? "" : var17.field224;
                field724[++Statics.field673 - 1] = var17.field222 == null ? "" : var17.field222;
                field724[++Statics.field673 - 1] = var17.field218 == null ? "" : var17.field218;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field142 == null) {
                field730[++Statics.field1649 - 1] = -1;
            } else {
                field730[++Statics.field1649 - 1] = Statics.field142.field3178;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var19 = field724[--Statics.field673];
            int var20 = field730[--Statics.field1649];
            String var21 = var19.toLowerCase();
            byte var22 = 0;
            if (var21.startsWith(class174.field2457)) {
                var22 = 0;
                var19 = var19.substring(class174.field2457.length());
            } else if (var21.startsWith(class174.field2586)) {
                var22 = 1;
                var19 = var19.substring(class174.field2586.length());
            } else if (var21.startsWith(class174.field2359)) {
                var22 = 2;
                var19 = var19.substring(class174.field2359.length());
            } else if (var21.startsWith(class174.field2535)) {
                var22 = 3;
                var19 = var19.substring(class174.field2535.length());
            } else if (var21.startsWith(class174.field2467)) {
                var22 = 4;
                var19 = var19.substring(class174.field2467.length());
            } else if (var21.startsWith(class174.field2521)) {
                var22 = 5;
                var19 = var19.substring(class174.field2521.length());
            } else if (var21.startsWith(class174.field2541)) {
                var22 = 6;
                var19 = var19.substring(class174.field2541.length());
            } else if (var21.startsWith(class174.field2543)) {
                var22 = 7;
                var19 = var19.substring(class174.field2543.length());
            } else if (var21.startsWith(class174.field2545)) {
                var22 = 8;
                var19 = var19.substring(class174.field2545.length());
            } else if (var21.startsWith(class174.field2547)) {
                var22 = 9;
                var19 = var19.substring(class174.field2547.length());
            } else if (var21.startsWith(class174.field2549)) {
                var22 = 10;
                var19 = var19.substring(class174.field2549.length());
            } else if (var21.startsWith(class174.field2551)) {
                var22 = 11;
                var19 = var19.substring(class174.field2551.length());
            } else if (client.field290 != 0) {
                if (var21.startsWith(class174.field2607)) {
                    var22 = 0;
                    var19 = var19.substring(class174.field2607.length());
                } else if (var21.startsWith(class174.field2532)) {
                    var22 = 1;
                    var19 = var19.substring(class174.field2532.length());
                } else if (var21.startsWith(class174.field2602)) {
                    var22 = 2;
                    var19 = var19.substring(class174.field2602.length());
                } else if (var21.startsWith(class174.field2619)) {
                    var22 = 3;
                    var19 = var19.substring(class174.field2619.length());
                } else if (var21.startsWith(class174.field2538)) {
                    var22 = 4;
                    var19 = var19.substring(class174.field2538.length());
                } else if (var21.startsWith(class174.field2540)) {
                    var22 = 5;
                    var19 = var19.substring(class174.field2540.length());
                } else if (var21.startsWith(class174.field2542)) {
                    var22 = 6;
                    var19 = var19.substring(class174.field2542.length());
                } else if (var21.startsWith(class174.field2544)) {
                    var22 = 7;
                    var19 = var19.substring(class174.field2544.length());
                } else if (var21.startsWith(class174.field2546)) {
                    var22 = 8;
                    var19 = var19.substring(class174.field2546.length());
                } else if (var21.startsWith(class174.field2548)) {
                    var22 = 9;
                    var19 = var19.substring(class174.field2548.length());
                } else if (var21.startsWith(class174.field2550)) {
                    var22 = 10;
                    var19 = var19.substring(class174.field2550.length());
                } else if (var21.startsWith(class174.field2552)) {
                    var22 = 11;
                    var19 = var19.substring(class174.field2552.length());
                }
            }
            String var23 = var19.toLowerCase();
            byte var24 = 0;
            if (var23.startsWith(class174.field2553)) {
                var24 = 1;
                var19 = var19.substring(class174.field2553.length());
            } else if (var23.startsWith(class174.field2582)) {
                var24 = 2;
                var19 = var19.substring(class174.field2582.length());
            } else if (var23.startsWith(class174.field2557)) {
                var24 = 3;
                var19 = var19.substring(class174.field2557.length());
            } else if (var23.startsWith(class174.field2559)) {
                var24 = 4;
                var19 = var19.substring(class174.field2559.length());
            } else if (var23.startsWith(class174.field2561)) {
                var24 = 5;
                var19 = var19.substring(class174.field2561.length());
            } else if (client.field290 != 0) {
                if (var23.startsWith(class174.field2554)) {
                    var24 = 1;
                    var19 = var19.substring(class174.field2554.length());
                } else if (var23.startsWith(class174.field2556)) {
                    var24 = 2;
                    var19 = var19.substring(class174.field2556.length());
                } else if (var23.startsWith(class174.field2558)) {
                    var24 = 3;
                    var19 = var19.substring(class174.field2558.length());
                } else if (var23.startsWith(class174.field2560)) {
                    var24 = 4;
                    var19 = var19.substring(class174.field2560.length());
                } else if (var23.startsWith(class174.field2492)) {
                    var24 = 5;
                    var19 = var19.substring(class174.field2492.length());
                }
            }
            client.field328.method2936(82);
            client.field328.method2832(0);
            int var25 = client.field328.field2085;
            client.field328.method2832(var20);
            client.field328.method2832(var22);
            client.field328.method2832(var24);
            class160 var26 = client.field328;
            int var27 = var26.field2085;
            int var28 = var19.length();
            byte[] var29 = new byte[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                char var31 = var19.charAt(var30);
                if (var31 > 0 && var31 < 128 || var31 >= 160 && var31 <= 255) {
                    var29[var30] = (byte) var31;
                } else if (var31 == 8364) {
                    var29[var30] = -128;
                } else if (var31 == 8218) {
                    var29[var30] = -126;
                } else if (var31 == 402) {
                    var29[var30] = -125;
                } else if (var31 == 8222) {
                    var29[var30] = -124;
                } else if (var31 == 8230) {
                    var29[var30] = -123;
                } else if (var31 == 8224) {
                    var29[var30] = -122;
                } else if (var31 == 8225) {
                    var29[var30] = -121;
                } else if (var31 == 710) {
                    var29[var30] = -120;
                } else if (var31 == 8240) {
                    var29[var30] = -119;
                } else if (var31 == 352) {
                    var29[var30] = -118;
                } else if (var31 == 8249) {
                    var29[var30] = -117;
                } else if (var31 == 338) {
                    var29[var30] = -116;
                } else if (var31 == 381) {
                    var29[var30] = -114;
                } else if (var31 == 8216) {
                    var29[var30] = -111;
                } else if (var31 == 8217) {
                    var29[var30] = -110;
                } else if (var31 == 8220) {
                    var29[var30] = -109;
                } else if (var31 == 8221) {
                    var29[var30] = -108;
                } else if (var31 == 8226) {
                    var29[var30] = -107;
                } else if (var31 == 8211) {
                    var29[var30] = -106;
                } else if (var31 == 8212) {
                    var29[var30] = -105;
                } else if (var31 == 732) {
                    var29[var30] = -104;
                } else if (var31 == 8482) {
                    var29[var30] = -103;
                } else if (var31 == 353) {
                    var29[var30] = -102;
                } else if (var31 == 8250) {
                    var29[var30] = -101;
                } else if (var31 == 339) {
                    var29[var30] = -100;
                } else if (var31 == 382) {
                    var29[var30] = -98;
                } else if (var31 == 376) {
                    var29[var30] = -97;
                } else {
                    var29[var30] = 63;
                }
            }
            var26.method2676(var29.length);
            var26.field2085 += Statics.field3121.method2597(var29, 0, var29.length, var26.field2083, var26.field2085);
            client.field328.method2675(client.field328.field2085 - var25);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field673 -= 2;
            String var34 = field724[Statics.field673];
            String var35 = field724[Statics.field673 + 1];
            client.field328.method2936(88);
            client.field328.method2664(0);
            int var36 = client.field328.field2085;
            client.field328.method2715(var34);
            class211.method2654(client.field328, var35);
            client.field328.method2674(client.field328.field2085 - var36);
            return 1;
        } else if (arg0 == 5015) {
            String var37;
            if (Statics.field85 == null || Statics.field85.field264 == null) {
                var37 = "";
            } else {
                var37 = Statics.field85.field264;
            }
            field724[++Statics.field673 - 1] = var37;
            return 1;
        } else if (arg0 == 5016) {
            field730[++Statics.field1649 - 1] = client.field382;
            return 1;
        } else if (arg0 == 5017) {
            int var38 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = class48.method197(var38);
            return 1;
        } else if (arg0 == 5018) {
            int var39 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = class48.method834(var39);
            return 1;
        } else if (arg0 == 5019) {
            int var40 = field730[--Statics.field1649];
            field730[++Statics.field1649 - 1] = class48.method2029(var40);
            return 1;
        } else if (arg0 == 5020) {
            String var41 = field724[--Statics.field673];
            client.method86(var41);
            return 1;
        } else if (arg0 == 5021) {
            client.field503 = field724[--Statics.field673].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field724[++Statics.field673 - 1] = client.field503;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ax.e(ILav;ZI)I")
    public static int method922(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field338 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fd.j(ILav;ZI)I")
    public static int method3142(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field730[++Statics.field1649 - 1] = class30.method198() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class30 var3 = class30.method41();
            if (var3 == null) {
                field730[++Statics.field1649 - 1] = -1;
                field730[++Statics.field1649 - 1] = 0;
                field724[++Statics.field673 - 1] = "";
                field730[++Statics.field1649 - 1] = 0;
                field730[++Statics.field1649 - 1] = 0;
                field724[++Statics.field673 - 1] = "";
            } else {
                field730[++Statics.field1649 - 1] = var3.field681;
                field730[++Statics.field1649 - 1] = var3.field676;
                field724[++Statics.field673 - 1] = var3.field685;
                field730[++Statics.field1649 - 1] = var3.field686;
                field730[++Statics.field1649 - 1] = var3.field683;
                field724[++Statics.field673 - 1] = var3.field684;
            }
            return 1;
        } else if (arg0 == 6502) {
            class30 var4 = class30.method1443();
            if (var4 == null) {
                field730[++Statics.field1649 - 1] = -1;
                field730[++Statics.field1649 - 1] = 0;
                field724[++Statics.field673 - 1] = "";
                field730[++Statics.field1649 - 1] = 0;
                field730[++Statics.field1649 - 1] = 0;
                field724[++Statics.field673 - 1] = "";
            } else {
                field730[++Statics.field1649 - 1] = var4.field681;
                field730[++Statics.field1649 - 1] = var4.field676;
                field724[++Statics.field673 - 1] = var4.field685;
                field730[++Statics.field1649 - 1] = var4.field686;
                field730[++Statics.field1649 - 1] = var4.field683;
                field724[++Statics.field673 - 1] = var4.field684;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field730[--Statics.field1649];
            class30 var6 = null;
            for (int var7 = 0; var7 < class30.field677; var7++) {
                if (Statics.field674[var7].field681 == var5) {
                    var6 = Statics.field674[var7];
                    break;
                }
            }
            if (var6 == null) {
                field730[++Statics.field1649 - 1] = -1;
                field730[++Statics.field1649 - 1] = 0;
                field724[++Statics.field673 - 1] = "";
                field730[++Statics.field1649 - 1] = 0;
                field730[++Statics.field1649 - 1] = 0;
                field724[++Statics.field673 - 1] = "";
            } else {
                field730[++Statics.field1649 - 1] = var6.field681;
                field730[++Statics.field1649 - 1] = var6.field676;
                field724[++Statics.field673 - 1] = var6.field685;
                field730[++Statics.field1649 - 1] = var6.field686;
                field730[++Statics.field1649 - 1] = var6.field683;
                field724[++Statics.field673 - 1] = var6.field684;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1649 -= 4;
            int var8 = field730[Statics.field1649];
            boolean var9 = field730[Statics.field1649 + 1] == 1;
            int var10 = field730[Statics.field1649 + 2];
            boolean var11 = field730[Statics.field1649 + 3] == 1;
            if (Statics.field674 != null) {
                class30.method1894(0, Statics.field674.length - 1, var8, var9, var10, var11);
            }
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field730[--Statics.field1649];
            if (var12 >= 0 && var12 < class30.field677) {
                class30 var13 = Statics.field674[var12];
                field730[++Statics.field1649 - 1] = var13.field681;
                field730[++Statics.field1649 - 1] = var13.field676;
                field724[++Statics.field673 - 1] = var13.field685;
                field730[++Statics.field1649 - 1] = var13.field686;
                field730[++Statics.field1649 - 1] = var13.field683;
                field724[++Statics.field673 - 1] = var13.field684;
            } else {
                field730[++Statics.field1649 - 1] = -1;
                field730[++Statics.field1649 - 1] = 0;
                field724[++Statics.field673 - 1] = "";
                field730[++Statics.field1649 - 1] = 0;
                field730[++Statics.field1649 - 1] = 0;
                field724[++Statics.field673 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field432 = field730[--Statics.field1649] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.d(IS)V")
    public static void method1087(int arg0) {
        if (arg0 == -1 || !Statics.method2954(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2195[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3.field2194 != null) {
                class19 var4 = new class19();
                var4.field186 = var3;
                var4.field198 = var3.field2194;
                method2033(var4, 2000000);
            }
        }
    }
}
