package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cq")
public class class84 {

    @ObfuscatedName("cq.g")
    public static int[] field1321 = new int[5];

    @ObfuscatedName("cq.m")
    public static int[][] field1329 = new int[5][5000];

    @ObfuscatedName("cq.s")
    public static int[] field1327 = new int[1000];

    @ObfuscatedName("cq.p")
    public static String[] field1328 = new String[1000];

    @ObfuscatedName("cq.r")
    public static int field1330 = 0;

    @ObfuscatedName("cq.w")
    public static class63[] field1331 = new class63[50];

    @ObfuscatedName("cq.t")
    public static Calendar field1336 = Calendar.getInstance();

    @ObfuscatedName("cq.a")
    public static final String[] field1333 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cq.y")
    public static int field1334 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.c(Lby;B)V")
    public static void method963(class70 arg0) {
        method115(arg0, 200000);
    }

    @ObfuscatedName("y.o(Lby;II)V")
    public static void method115(class70 arg0, int arg1) {
        Object[] var2 = arg0.field832;
        class220 var3 = arg0.field831;
        boolean var4 = class220.field2763 == var3 || class220.field2761 == var3 || class220.field2762 == var3 || class220.field2767 == var3 || class220.field2764 == var3 || class220.field2771 == var3 || class220.field2766 == var3 || class220.field2774 == var3;
        class100 var6;
        if (var4) {
            Statics.field599 = (class48) var2[0];
            class243 var5 = Statics.field3266[Statics.field599.field607];
            var6 = class100.method1445(arg0.field831, var5.field3276, var5.field3282);
        } else {
            int var7 = (Integer) var2[0];
            class100 var8 = (class100) class100.field1507.method3220((long) var7);
            class100 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field272.method3741(var7, 0);
                if (var10 == null) {
                    var9 = null;
                } else {
                    class100 var11 = class100.method946(var10);
                    class100.field1507.method3233(var11, (long) var7);
                    var9 = var11;
                }
            } else {
                var9 = var8;
            }
            var6 = var9;
        }
        if (var6 == null) {
            return;
        }
        Statics.field3751 = 0;
        Statics.field1324 = 0;
        int var12 = -1;
        int[] var13 = var6.field1500;
        int[] var14 = var6.field1501;
        byte var15 = -1;
        field1330 = 0;
        try {
            Statics.field1323 = new int[var6.field1499];
            int var16 = 0;
            Statics.field1325 = new String[var6.field1506];
            int var17 = 0;
            for (int var18 = 1; var18 < var2.length; var18++) {
                if (var2[var18] instanceof Integer) {
                    int var19 = (Integer) var2[var18];
                    if (var19 == -2147483647) {
                        var19 = arg0.field833;
                    }
                    if (var19 == -2147483646) {
                        var19 = arg0.field834;
                    }
                    if (var19 == -2147483645) {
                        var19 = arg0.field830 == null ? -1 : arg0.field830.field2683;
                    }
                    if (var19 == -2147483644) {
                        var19 = arg0.field838;
                    }
                    if (var19 == -2147483643) {
                        var19 = arg0.field830 == null ? -1 : arg0.field830.field2619;
                    }
                    if (var19 == -2147483642) {
                        var19 = arg0.field836 == null ? -1 : arg0.field836.field2683;
                    }
                    if (var19 == -2147483641) {
                        var19 = arg0.field836 == null ? -1 : arg0.field836.field2619;
                    }
                    if (var19 == -2147483640) {
                        var19 = arg0.field837;
                    }
                    if (var19 == -2147483639) {
                        var19 = arg0.field841;
                    }
                    Statics.field1323[var16++] = var19;
                } else if (var2[var18] instanceof String) {
                    String var20 = (String) var2[var18];
                    if (var20.equals("event_opbase")) {
                        var20 = arg0.field839;
                    }
                    Statics.field1325[var17++] = var20;
                }
            }
            int var21 = 0;
            field1334 = arg0.field840;
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
                                                                                                                label1835: while (true) {
                                                                                                                    var21++;
                                                                                                                    if (var21 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var12++;
                                                                                                                    int var385 = var13[var12];
                                                                                                                    if (var385 >= 100) {
                                                                                                                        boolean var63;
                                                                                                                        if (var6.field1501[var12] == 1) {
                                                                                                                            var63 = true;
                                                                                                                        } else {
                                                                                                                            var63 = false;
                                                                                                                        }
                                                                                                                        int var64;
                                                                                                                        if (var385 < 1000) {
                                                                                                                            var64 = method3128(var385, var6, var63);
                                                                                                                        } else if (var385 < 1100) {
                                                                                                                            var64 = method1387(var385, var6, var63);
                                                                                                                        } else if (var385 < 1200) {
                                                                                                                            var64 = method1420(var385, var6, var63);
                                                                                                                        } else if (var385 < 1300) {
                                                                                                                            var64 = method3630(var385, var6, var63);
                                                                                                                        } else if (var385 < 1400) {
                                                                                                                            var64 = method944(var385, var6, var63);
                                                                                                                        } else if (var385 < 1500) {
                                                                                                                            var64 = method201(var385, var6, var63);
                                                                                                                        } else if (var385 < 1600) {
                                                                                                                            class217 var68 = var63 ? Statics.field615 : Statics.field2100;
                                                                                                                            byte var69;
                                                                                                                            if (var385 == 1500) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var68.field2631;
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var385 == 1501) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var68.field2632;
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var385 == 1502) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var68.field2714;
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var385 == 1503) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var68.field2634;
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var385 == 1504) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var68.field2638 ? 1 : 0;
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var385 == 1505) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var68.field2637;
                                                                                                                                var69 = 1;
                                                                                                                            } else {
                                                                                                                                var69 = 2;
                                                                                                                            }
                                                                                                                            var64 = var69;
                                                                                                                        } else if (var385 < 1700) {
                                                                                                                            var64 = method932(var385, var6, var63);
                                                                                                                        } else if (var385 < 1800) {
                                                                                                                            var64 = method1530(var385, var6, var63);
                                                                                                                        } else if (var385 < 1900) {
                                                                                                                            class217 var70 = var63 ? Statics.field615 : Statics.field2100;
                                                                                                                            byte var75;
                                                                                                                            if (var385 == 1800) {
                                                                                                                                int[] var71 = field1327;
                                                                                                                                int var72 = ++Statics.field3751 - 1;
                                                                                                                                int var73 = client.method887(var70);
                                                                                                                                int var74 = var73 >> 11 & 0x3F;
                                                                                                                                var71[var72] = var74;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var385 == 1801) {
                                                                                                                                int var76 = field1327[--Statics.field3751];
                                                                                                                                int var386 = var76 - 1;
                                                                                                                                if (var70.field2692 == null || var386 >= var70.field2692.length || var70.field2692[var386] == null) {
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1328[++Statics.field1324 - 1] = var70.field2692[var386];
                                                                                                                                }
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var385 == 1802) {
                                                                                                                                if (var70.field2721 == null) {
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1328[++Statics.field1324 - 1] = var70.field2721;
                                                                                                                                }
                                                                                                                                var75 = 1;
                                                                                                                            } else {
                                                                                                                                var75 = 2;
                                                                                                                            }
                                                                                                                            var64 = var75;
                                                                                                                        } else if (var385 < 2000) {
                                                                                                                            var64 = method2619(var385, var6, var63);
                                                                                                                        } else if (var385 < 2100) {
                                                                                                                            var64 = method1387(var385, var6, var63);
                                                                                                                        } else if (var385 < 2200) {
                                                                                                                            var64 = method1420(var385, var6, var63);
                                                                                                                        } else if (var385 < 2300) {
                                                                                                                            var64 = method3630(var385, var6, var63);
                                                                                                                        } else if (var385 < 2400) {
                                                                                                                            var64 = method944(var385, var6, var63);
                                                                                                                        } else if (var385 < 2500) {
                                                                                                                            var64 = method201(var385, var6, var63);
                                                                                                                        } else if (var385 < 2600) {
                                                                                                                            class217 var77 = class217.method3861(field1327[--Statics.field3751]);
                                                                                                                            byte var78;
                                                                                                                            if (var385 == 2500) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var77.field2631;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var385 == 2501) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var77.field2632;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var385 == 2502) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var77.field2714;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var385 == 2503) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var77.field2634;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var385 == 2504) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var77.field2638 ? 1 : 0;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var385 == 2505) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var77.field2637;
                                                                                                                                var78 = 1;
                                                                                                                            } else {
                                                                                                                                var78 = 2;
                                                                                                                            }
                                                                                                                            var64 = var78;
                                                                                                                        } else if (var385 < 2700) {
                                                                                                                            class217 var79 = class217.method3861(field1327[--Statics.field3751]);
                                                                                                                            byte var80;
                                                                                                                            if (var385 == 2600) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2639;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2601) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2627;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2602) {
                                                                                                                                field1328[++Statics.field1324 - 1] = var79.field2667;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2603) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2641;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2604) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2733;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2605) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2623;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2606) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2712;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2607) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2671;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2608) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2670;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2609) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2649;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2610) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2650;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2611) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2607;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2612) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2644;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var385 == 2613) {
                                                                                                                                field1327[++Statics.field3751 - 1] = var79.field2648.method13();
                                                                                                                                var80 = 1;
                                                                                                                            } else {
                                                                                                                                var80 = 2;
                                                                                                                            }
                                                                                                                            var64 = var80;
                                                                                                                        } else if (var385 < 2800) {
                                                                                                                            var64 = method655(var385, var6, var63);
                                                                                                                        } else if (var385 < 2900) {
                                                                                                                            var64 = method3709(var385, var6, var63);
                                                                                                                        } else if (var385 < 3000) {
                                                                                                                            var64 = method2619(var385, var6, var63);
                                                                                                                        } else if (var385 < 3200) {
                                                                                                                            var64 = method3496(var385, var6, var63);
                                                                                                                        } else if (var385 < 3300) {
                                                                                                                            byte var81;
                                                                                                                            if (var385 == 3200) {
                                                                                                                                Statics.field3751 -= 3;
                                                                                                                                client.method2606(field1327[Statics.field3751], field1327[Statics.field3751 + 1], field1327[Statics.field3751 + 2]);
                                                                                                                                var81 = 1;
                                                                                                                            } else if (var385 == 3201) {
                                                                                                                                client.method199(field1327[--Statics.field3751]);
                                                                                                                                var81 = 1;
                                                                                                                            } else if (var385 == 3202) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                client.method4(field1327[Statics.field3751], field1327[Statics.field3751 + 1]);
                                                                                                                                var81 = 1;
                                                                                                                            } else {
                                                                                                                                var81 = 2;
                                                                                                                            }
                                                                                                                            var64 = var81;
                                                                                                                        } else if (var385 < 3400) {
                                                                                                                            byte var82;
                                                                                                                            if (var385 == 3300) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field929;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3301) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var83 = field1327[Statics.field3751];
                                                                                                                                int var84 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = class64.method4304(var83, var84);
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3302) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var85 = field1327[Statics.field3751];
                                                                                                                                int var86 = field1327[Statics.field3751 + 1];
                                                                                                                                int[] var87 = field1327;
                                                                                                                                int var88 = ++Statics.field3751 - 1;
                                                                                                                                class64 var89 = (class64) class64.field775.method3251((long) var85);
                                                                                                                                int var90;
                                                                                                                                if (var89 == null) {
                                                                                                                                    var90 = 0;
                                                                                                                                } else if (var86 >= 0 && var86 < var89.field776.length) {
                                                                                                                                    var90 = var89.field776[var86];
                                                                                                                                } else {
                                                                                                                                    var90 = 0;
                                                                                                                                }
                                                                                                                                var87[var88] = var90;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3303) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var91 = field1327[Statics.field3751];
                                                                                                                                int var92 = field1327[Statics.field3751 + 1];
                                                                                                                                int[] var93 = field1327;
                                                                                                                                int var94 = ++Statics.field3751 - 1;
                                                                                                                                class64 var95 = (class64) class64.field775.method3251((long) var91);
                                                                                                                                int var96;
                                                                                                                                if (var95 == null) {
                                                                                                                                    var96 = 0;
                                                                                                                                } else if (var92 == -1) {
                                                                                                                                    var96 = 0;
                                                                                                                                } else {
                                                                                                                                    int var97 = 0;
                                                                                                                                    for (int var98 = 0; var98 < var95.field776.length; var98++) {
                                                                                                                                        if (var95.field780[var98] == var92) {
                                                                                                                                            var97 += var95.field776[var98];
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var96 = var97;
                                                                                                                                }
                                                                                                                                var93[var94] = var96;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3304) {
                                                                                                                                int var99 = field1327[--Statics.field3751];
                                                                                                                                int[] var100 = field1327;
                                                                                                                                int var101 = ++Statics.field3751 - 1;
                                                                                                                                class241 var102 = (class241) class241.field3250.method3220((long) var99);
                                                                                                                                class241 var103;
                                                                                                                                if (var102 == null) {
                                                                                                                                    byte[] var104 = Statics.field31.method3741(5, var99);
                                                                                                                                    class241 var105 = new class241();
                                                                                                                                    if (var104 != null) {
                                                                                                                                        var105.method3863(new class174(var104));
                                                                                                                                    }
                                                                                                                                    class241.field3250.method3233(var105, (long) var99);
                                                                                                                                    var103 = var105;
                                                                                                                                } else {
                                                                                                                                    var103 = var102;
                                                                                                                                }
                                                                                                                                var100[var101] = var103.field3249;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3305) {
                                                                                                                                int var106 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field1120[var106];
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3306) {
                                                                                                                                int var107 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field945[var107];
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3307) {
                                                                                                                                int var108 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field1041[var108];
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3308) {
                                                                                                                                int var109 = Statics.field251;
                                                                                                                                int var110 = (Statics.field3110.field1211 >> 7) + Statics.field329;
                                                                                                                                int var111 = (Statics.field3110.field1219 >> 7) + Statics.field2282;
                                                                                                                                field1327[++Statics.field3751 - 1] = (var109 << 28) + (var110 << 14) + var111;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3309) {
                                                                                                                                int var112 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = var112 >> 14 & 0x3FFF;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3310) {
                                                                                                                                int var113 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = var113 >> 28;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3311) {
                                                                                                                                int var114 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = var114 & 0x3FFF;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3312) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field996 ? 1 : 0;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3313) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var115 = field1327[Statics.field3751] + 32768;
                                                                                                                                int var116 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = class64.method4304(var115, var116);
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3314) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var117 = field1327[Statics.field3751] + 32768;
                                                                                                                                int var118 = field1327[Statics.field3751 + 1];
                                                                                                                                int[] var119 = field1327;
                                                                                                                                int var120 = ++Statics.field3751 - 1;
                                                                                                                                class64 var121 = (class64) class64.field775.method3251((long) var117);
                                                                                                                                int var122;
                                                                                                                                if (var121 == null) {
                                                                                                                                    var122 = 0;
                                                                                                                                } else if (var118 >= 0 && var118 < var121.field776.length) {
                                                                                                                                    var122 = var121.field776[var118];
                                                                                                                                } else {
                                                                                                                                    var122 = 0;
                                                                                                                                }
                                                                                                                                var119[var120] = var122;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3315) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var123 = field1327[Statics.field3751] + 32768;
                                                                                                                                int var124 = field1327[Statics.field3751 + 1];
                                                                                                                                int[] var125 = field1327;
                                                                                                                                int var126 = ++Statics.field3751 - 1;
                                                                                                                                class64 var127 = (class64) class64.field775.method3251((long) var123);
                                                                                                                                int var128;
                                                                                                                                if (var127 == null) {
                                                                                                                                    var128 = 0;
                                                                                                                                } else if (var124 == -1) {
                                                                                                                                    var128 = 0;
                                                                                                                                } else {
                                                                                                                                    int var129 = 0;
                                                                                                                                    for (int var130 = 0; var130 < var127.field776.length; var130++) {
                                                                                                                                        if (var127.field780[var130] == var124) {
                                                                                                                                            var129 += var127.field776[var130];
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var128 = var129;
                                                                                                                                }
                                                                                                                                var125[var126] = var128;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3316) {
                                                                                                                                if (client.field1072 >= 2) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = client.field1072;
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                }
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3317) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field1071;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3318) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field915;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3321) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field1145;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3322) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field1096;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3323) {
                                                                                                                                if (client.field1074) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = 1;
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                }
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3324) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field916;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var385 == 3325) {
                                                                                                                                Statics.field3751 -= 4;
                                                                                                                                int var131 = field1327[Statics.field3751];
                                                                                                                                int var132 = field1327[Statics.field3751 + 1];
                                                                                                                                int var133 = field1327[Statics.field3751 + 2];
                                                                                                                                int var134 = field1327[Statics.field3751 + 3];
                                                                                                                                int var135 = (var132 << 14) + var131;
                                                                                                                                int var136 = (var133 << 28) + var135;
                                                                                                                                int var137 = var134 + var136;
                                                                                                                                field1327[++Statics.field3751 - 1] = var137;
                                                                                                                                var82 = 1;
                                                                                                                            } else {
                                                                                                                                var82 = 2;
                                                                                                                            }
                                                                                                                            var64 = var82;
                                                                                                                        } else if (var385 < 3500) {
                                                                                                                            byte var146;
                                                                                                                            if (var385 == 3400) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var138 = field1327[Statics.field3751];
                                                                                                                                int var139 = field1327[Statics.field3751 + 1];
                                                                                                                                class254 var140 = (class254) class254.field3382.method3220((long) var138);
                                                                                                                                class254 var141;
                                                                                                                                if (var140 == null) {
                                                                                                                                    byte[] var142 = Statics.field3375.method3741(8, var138);
                                                                                                                                    class254 var143 = new class254();
                                                                                                                                    if (var142 != null) {
                                                                                                                                        var143.method4045(new class174(var142));
                                                                                                                                    }
                                                                                                                                    class254.field3382.method3233(var143, (long) var138);
                                                                                                                                    var141 = var143;
                                                                                                                                } else {
                                                                                                                                    var141 = var140;
                                                                                                                                }
                                                                                                                                class254 var144 = var141;
                                                                                                                                if (var141.field3377 != 's') {
                                                                                                                                }
                                                                                                                                for (int var145 = 0; var145 < var144.field3380; var145++) {
                                                                                                                                    if (var144.field3381[var145] == var139) {
                                                                                                                                        field1328[++Statics.field1324 - 1] = var144.field3379[var145];
                                                                                                                                        var144 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var144 != null) {
                                                                                                                                    field1328[++Statics.field1324 - 1] = var144.field3383;
                                                                                                                                }
                                                                                                                                var146 = 1;
                                                                                                                            } else if (var385 == 3408) {
                                                                                                                                Statics.field3751 -= 4;
                                                                                                                                int var147 = field1327[Statics.field3751];
                                                                                                                                int var148 = field1327[Statics.field3751 + 1];
                                                                                                                                int var149 = field1327[Statics.field3751 + 2];
                                                                                                                                int var150 = field1327[Statics.field3751 + 3];
                                                                                                                                class254 var151 = (class254) class254.field3382.method3220((long) var149);
                                                                                                                                class254 var152;
                                                                                                                                if (var151 == null) {
                                                                                                                                    byte[] var153 = Statics.field3375.method3741(8, var149);
                                                                                                                                    class254 var154 = new class254();
                                                                                                                                    if (var153 != null) {
                                                                                                                                        var154.method4045(new class174(var153));
                                                                                                                                    }
                                                                                                                                    class254.field3382.method3233(var154, (long) var149);
                                                                                                                                    var152 = var154;
                                                                                                                                } else {
                                                                                                                                    var152 = var151;
                                                                                                                                }
                                                                                                                                class254 var155 = var152;
                                                                                                                                if (var152.field3376 == var147 && var152.field3377 == var148) {
                                                                                                                                    for (int var156 = 0; var156 < var155.field3380; var156++) {
                                                                                                                                        if (var155.field3381[var156] == var150) {
                                                                                                                                            if (var148 == 115) {
                                                                                                                                                field1328[++Statics.field1324 - 1] = var155.field3379[var156];
                                                                                                                                            } else {
                                                                                                                                                field1327[++Statics.field3751 - 1] = var155.field3378[var156];
                                                                                                                                            }
                                                                                                                                            var155 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var155 != null) {
                                                                                                                                        if (var148 == 115) {
                                                                                                                                            field1328[++Statics.field1324 - 1] = var155.field3383;
                                                                                                                                        } else {
                                                                                                                                            field1327[++Statics.field3751 - 1] = var155.field3374;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var146 = 1;
                                                                                                                                } else {
                                                                                                                                    if (var148 == 115) {
                                                                                                                                        field1328[++Statics.field1324 - 1] = "null";
                                                                                                                                    } else {
                                                                                                                                        field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    }
                                                                                                                                    var146 = 1;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var146 = 2;
                                                                                                                            }
                                                                                                                            var64 = var146;
                                                                                                                        } else if (var385 < 3700) {
                                                                                                                            var64 = method1497(var385, var6, var63);
                                                                                                                        } else if (var385 < 4000) {
                                                                                                                            var64 = method654(var385, var6, var63);
                                                                                                                        } else if (var385 < 4100) {
                                                                                                                            byte var159;
                                                                                                                            if (var385 == 4000) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var157 = field1327[Statics.field3751];
                                                                                                                                int var158 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = var157 + var158;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4001) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var160 = field1327[Statics.field3751];
                                                                                                                                int var161 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = var160 - var161;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4002) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var162 = field1327[Statics.field3751];
                                                                                                                                int var163 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = var162 * var163;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4003) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var164 = field1327[Statics.field3751];
                                                                                                                                int var165 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = var164 / var165;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4004) {
                                                                                                                                int var166 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = (int) (Math.random() * (double) var166);
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4005) {
                                                                                                                                int var167 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = (int) (Math.random() * (double) (var167 + 1));
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4006) {
                                                                                                                                Statics.field3751 -= 5;
                                                                                                                                int var168 = field1327[Statics.field3751];
                                                                                                                                int var169 = field1327[Statics.field3751 + 1];
                                                                                                                                int var170 = field1327[Statics.field3751 + 2];
                                                                                                                                int var171 = field1327[Statics.field3751 + 3];
                                                                                                                                int var172 = field1327[Statics.field3751 + 4];
                                                                                                                                field1327[++Statics.field3751 - 1] = (var169 - var168) * (var172 - var170) / (var171 - var170) + var168;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4007) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var173 = field1327[Statics.field3751];
                                                                                                                                int var174 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = var173 * var174 / 100 + var173;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4008) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var175 = field1327[Statics.field3751];
                                                                                                                                int var176 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = var175 | 0x1 << var176;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4009) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var177 = field1327[Statics.field3751];
                                                                                                                                int var178 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = var177 & -1 - (0x1 << var178);
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4010) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var179 = field1327[Statics.field3751];
                                                                                                                                int var180 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = (var179 & 0x1 << var180) == 0 ? 0 : 1;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4011) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var181 = field1327[Statics.field3751];
                                                                                                                                int var182 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = var181 % var182;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4012) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var183 = field1327[Statics.field3751];
                                                                                                                                int var184 = field1327[Statics.field3751 + 1];
                                                                                                                                if (var183 == 0) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = (int) Math.pow((double) var183, (double) var184);
                                                                                                                                }
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4013) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var185 = field1327[Statics.field3751];
                                                                                                                                int var186 = field1327[Statics.field3751 + 1];
                                                                                                                                if (var185 == 0) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                } else if (var186 == 0) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = Integer.MAX_VALUE;
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = (int) Math.pow((double) var185, 1.0D / (double) var186);
                                                                                                                                }
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4014) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var187 = field1327[Statics.field3751];
                                                                                                                                int var188 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = var187 & var188;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4015) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var189 = field1327[Statics.field3751];
                                                                                                                                int var190 = field1327[Statics.field3751 + 1];
                                                                                                                                field1327[++Statics.field3751 - 1] = var189 | var190;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var385 == 4018) {
                                                                                                                                Statics.field3751 -= 3;
                                                                                                                                long var191 = (long) field1327[Statics.field3751];
                                                                                                                                long var193 = (long) field1327[Statics.field3751 + 1];
                                                                                                                                long var195 = (long) field1327[Statics.field3751 + 2];
                                                                                                                                field1327[++Statics.field3751 - 1] = (int) (var191 * var195 / var193);
                                                                                                                                var159 = 1;
                                                                                                                            } else {
                                                                                                                                var159 = 2;
                                                                                                                            }
                                                                                                                            var64 = var159;
                                                                                                                        } else if (var385 < 4200) {
                                                                                                                            byte var199;
                                                                                                                            if (var385 == 4100) {
                                                                                                                                String var197 = field1328[--Statics.field1324];
                                                                                                                                int var198 = field1327[--Statics.field3751];
                                                                                                                                field1328[++Statics.field1324 - 1] = var197 + var198;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4101) {
                                                                                                                                Statics.field1324 -= 2;
                                                                                                                                String var200 = field1328[Statics.field1324];
                                                                                                                                String var201 = field1328[Statics.field1324 + 1];
                                                                                                                                field1328[++Statics.field1324 - 1] = var200 + var201;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4102) {
                                                                                                                                String var202 = field1328[--Statics.field1324];
                                                                                                                                int var203 = field1327[--Statics.field3751];
                                                                                                                                String[] var204 = field1328;
                                                                                                                                int var205 = ++Statics.field1324 - 1;
                                                                                                                                String var207;
                                                                                                                                if (var203 < 0) {
                                                                                                                                    var207 = Integer.toString(var203);
                                                                                                                                } else {
                                                                                                                                    int var208 = var203;
                                                                                                                                    String var209;
                                                                                                                                    if (var203 < 0) {
                                                                                                                                        var209 = Integer.toString(var203, 10);
                                                                                                                                    } else {
                                                                                                                                        int var210 = 2;
                                                                                                                                        int var211 = var203 / 10;
                                                                                                                                        while (var211 != 0) {
                                                                                                                                            var211 /= 10;
                                                                                                                                            var210++;
                                                                                                                                        }
                                                                                                                                        char[] var212 = new char[var210];
                                                                                                                                        var212[0] = '+';
                                                                                                                                        for (int var213 = var210 - 1; var213 > 0; var213--) {
                                                                                                                                            int var214 = var208;
                                                                                                                                            var208 /= 10;
                                                                                                                                            int var215 = var214 - var208 * 10;
                                                                                                                                            if (var215 >= 10) {
                                                                                                                                                var212[var213] = (char) (var215 + 87);
                                                                                                                                            } else {
                                                                                                                                                var212[var213] = (char) (var215 + 48);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        var209 = new String(var212);
                                                                                                                                    }
                                                                                                                                    var207 = var209;
                                                                                                                                }
                                                                                                                                var204[var205] = var202 + var207;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4103) {
                                                                                                                                String var216 = field1328[--Statics.field1324];
                                                                                                                                field1328[++Statics.field1324 - 1] = var216.toLowerCase();
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4104) {
                                                                                                                                int var217 = field1327[--Statics.field3751];
                                                                                                                                long var218 = ((long) var217 + 11745L) * 86400000L;
                                                                                                                                field1336.setTime(new Date(var218));
                                                                                                                                int var220 = field1336.get(5);
                                                                                                                                int var221 = field1336.get(2);
                                                                                                                                int var222 = field1336.get(1);
                                                                                                                                field1328[++Statics.field1324 - 1] = var220 + "-" + field1333[var221] + "-" + var222;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4105) {
                                                                                                                                Statics.field1324 -= 2;
                                                                                                                                String var223 = field1328[Statics.field1324];
                                                                                                                                String var224 = field1328[Statics.field1324 + 1];
                                                                                                                                if (Statics.field3110.field888 != null && Statics.field3110.field888.field2585) {
                                                                                                                                    field1328[++Statics.field1324 - 1] = var224;
                                                                                                                                } else {
                                                                                                                                    field1328[++Statics.field1324 - 1] = var223;
                                                                                                                                }
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4106) {
                                                                                                                                int var225 = field1327[--Statics.field3751];
                                                                                                                                field1328[++Statics.field1324 - 1] = Integer.toString(var225);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4107) {
                                                                                                                                Statics.field1324 -= 2;
                                                                                                                                int[] var226 = field1327;
                                                                                                                                int var227 = ++Statics.field3751 - 1;
                                                                                                                                int var228 = class165.method1349(field1328[Statics.field1324], field1328[Statics.field1324 + 1], client.field920);
                                                                                                                                byte var229;
                                                                                                                                if (var228 > 0) {
                                                                                                                                    var229 = 1;
                                                                                                                                } else if (var228 < 0) {
                                                                                                                                    var229 = -1;
                                                                                                                                } else {
                                                                                                                                    var229 = 0;
                                                                                                                                }
                                                                                                                                var226[var227] = var229;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4108) {
                                                                                                                                String var230 = field1328[--Statics.field1324];
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var231 = field1327[Statics.field3751];
                                                                                                                                int var232 = field1327[Statics.field3751 + 1];
                                                                                                                                byte[] var233 = Statics.field745.method3741(var232, 0);
                                                                                                                                class264 var234 = new class264(var233);
                                                                                                                                field1327[++Statics.field3751 - 1] = var234.method4329(var230, var231);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4109) {
                                                                                                                                String var235 = field1328[--Statics.field1324];
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var236 = field1327[Statics.field3751];
                                                                                                                                int var237 = field1327[Statics.field3751 + 1];
                                                                                                                                byte[] var238 = Statics.field745.method3741(var237, 0);
                                                                                                                                class264 var239 = new class264(var238);
                                                                                                                                field1327[++Statics.field3751 - 1] = var239.method4328(var235, var236);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4110) {
                                                                                                                                Statics.field1324 -= 2;
                                                                                                                                String var240 = field1328[Statics.field1324];
                                                                                                                                String var241 = field1328[Statics.field1324 + 1];
                                                                                                                                if (field1327[--Statics.field3751] == 1) {
                                                                                                                                    field1328[++Statics.field1324 - 1] = var240;
                                                                                                                                } else {
                                                                                                                                    field1328[++Statics.field1324 - 1] = var241;
                                                                                                                                }
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4111) {
                                                                                                                                String var242 = field1328[--Statics.field1324];
                                                                                                                                field1328[++Statics.field1324 - 1] = class265.method4330(var242);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4112) {
                                                                                                                                String var243 = field1328[--Statics.field1324];
                                                                                                                                int var244 = field1327[--Statics.field3751];
                                                                                                                                field1328[++Statics.field1324 - 1] = var243 + (char) var244;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4113) {
                                                                                                                                int var245 = field1327[--Statics.field3751];
                                                                                                                                int[] var246 = field1327;
                                                                                                                                int var247 = ++Statics.field3751 - 1;
                                                                                                                                char var248 = (char) var245;
                                                                                                                                boolean var249;
                                                                                                                                if (var248 >= ' ' && var248 <= '~') {
                                                                                                                                    var249 = true;
                                                                                                                                } else if (var248 >= 160 && var248 <= 255) {
                                                                                                                                    var249 = true;
                                                                                                                                } else if (var248 == 8364 || var248 == 338 || var248 == 8212 || var248 == 339 || var248 == 376) {
                                                                                                                                    var249 = true;
                                                                                                                                } else {
                                                                                                                                    var249 = false;
                                                                                                                                }
                                                                                                                                var246[var247] = var249 ? 1 : 0;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4114) {
                                                                                                                                int var250 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = class271.method1511((char) var250) ? 1 : 0;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4115) {
                                                                                                                                int var251 = field1327[--Statics.field3751];
                                                                                                                                int[] var252 = field1327;
                                                                                                                                int var253 = ++Statics.field3751 - 1;
                                                                                                                                char var254 = (char) var251;
                                                                                                                                boolean var255 = var254 >= 'A' && var254 <= 'Z' || var254 >= 'a' && var254 <= 'z';
                                                                                                                                var252[var253] = var255 ? 1 : 0;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4116) {
                                                                                                                                int var256 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = class271.method6((char) var256) ? 1 : 0;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4117) {
                                                                                                                                String var257 = field1328[--Statics.field1324];
                                                                                                                                if (var257 == null) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var257.length();
                                                                                                                                }
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4118) {
                                                                                                                                String var258 = field1328[--Statics.field1324];
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var259 = field1327[Statics.field3751];
                                                                                                                                int var260 = field1327[Statics.field3751 + 1];
                                                                                                                                field1328[++Statics.field1324 - 1] = var258.substring(var259, var260);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4119) {
                                                                                                                                String var261 = field1328[--Statics.field1324];
                                                                                                                                StringBuilder var262 = new StringBuilder(var261.length());
                                                                                                                                boolean var263 = false;
                                                                                                                                for (int var264 = 0; var264 < var261.length(); var264++) {
                                                                                                                                    char var265 = var261.charAt(var264);
                                                                                                                                    if (var265 == '<') {
                                                                                                                                        var263 = true;
                                                                                                                                    } else if (var265 == '>') {
                                                                                                                                        var263 = false;
                                                                                                                                    } else if (!var263) {
                                                                                                                                        var262.append(var265);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1328[++Statics.field1324 - 1] = var262.toString();
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4120) {
                                                                                                                                String var266 = field1328[--Statics.field1324];
                                                                                                                                int var267 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = var266.indexOf(var267);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var385 == 4121) {
                                                                                                                                Statics.field1324 -= 2;
                                                                                                                                String var268 = field1328[Statics.field1324];
                                                                                                                                String var269 = field1328[Statics.field1324 + 1];
                                                                                                                                int var270 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = var268.indexOf(var269, var270);
                                                                                                                                var199 = 1;
                                                                                                                            } else {
                                                                                                                                var199 = 2;
                                                                                                                            }
                                                                                                                            var64 = var199;
                                                                                                                        } else if (var385 < 4300) {
                                                                                                                            byte var272;
                                                                                                                            if (var385 == 4200) {
                                                                                                                                int var271 = field1327[--Statics.field3751];
                                                                                                                                field1328[++Statics.field1324 - 1] = class257.method44(var271).field3474;
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var385 == 4201) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var273 = field1327[Statics.field3751];
                                                                                                                                int var274 = field1327[Statics.field3751 + 1];
                                                                                                                                class257 var275 = class257.method44(var273);
                                                                                                                                if (var274 < 1 || var274 > 5 || var275.field3488[var274 - 1] == null) {
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1328[++Statics.field1324 - 1] = var275.field3488[var274 - 1];
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var385 == 4202) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var276 = field1327[Statics.field3751];
                                                                                                                                int var277 = field1327[Statics.field3751 + 1];
                                                                                                                                class257 var278 = class257.method44(var276);
                                                                                                                                if (var277 < 1 || var277 > 5 || var278.field3508[var277 - 1] == null) {
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1328[++Statics.field1324 - 1] = var278.field3508[var277 - 1];
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var385 == 4203) {
                                                                                                                                int var279 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = class257.method44(var279).field3482;
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var385 == 4204) {
                                                                                                                                int var280 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = class257.method44(var280).field3485 == 1 ? 1 : 0;
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var385 == 4205) {
                                                                                                                                int var281 = field1327[--Statics.field3751];
                                                                                                                                class257 var282 = class257.method44(var281);
                                                                                                                                if (var282.field3506 == -1 && var282.field3516 >= 0) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var282.field3516;
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var281;
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var385 == 4206) {
                                                                                                                                int var283 = field1327[--Statics.field3751];
                                                                                                                                class257 var284 = class257.method44(var283);
                                                                                                                                if (var284.field3506 >= 0 && var284.field3516 >= 0) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var284.field3516;
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var283;
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var385 == 4207) {
                                                                                                                                int var285 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = class257.method44(var285).field3487 ? 1 : 0;
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var385 == 4208) {
                                                                                                                                int var286 = field1327[--Statics.field3751];
                                                                                                                                class257 var287 = class257.method44(var286);
                                                                                                                                if (var287.field3493 == -1 && var287.field3517 >= 0) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var287.field3517;
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var286;
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var385 == 4209) {
                                                                                                                                int var288 = field1327[--Statics.field3751];
                                                                                                                                class257 var289 = class257.method44(var288);
                                                                                                                                if (var289.field3493 >= 0 && var289.field3517 >= 0) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var289.field3517;
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var288;
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var385 == 4210) {
                                                                                                                                String var290 = field1328[--Statics.field1324];
                                                                                                                                int var291 = field1327[--Statics.field3751];
                                                                                                                                client.method2628(var290, var291 == 1);
                                                                                                                                field1327[++Statics.field3751 - 1] = Statics.field381;
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var385 == 4211) {
                                                                                                                                if (Statics.field362 == null || Statics.field1335 >= Statics.field381) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = Statics.field362[++Statics.field1335 - 1] & 0xFFFF;
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var385 == 4212) {
                                                                                                                                Statics.field1335 = 0;
                                                                                                                                var272 = 1;
                                                                                                                            } else {
                                                                                                                                var272 = 2;
                                                                                                                            }
                                                                                                                            var64 = var272;
                                                                                                                        } else if (var385 < 5100) {
                                                                                                                            byte var292;
                                                                                                                            if (var385 == 5000) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field1018;
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5001) {
                                                                                                                                Statics.field3751 -= 3;
                                                                                                                                client.field1018 = field1327[Statics.field3751];
                                                                                                                                Statics.field655 = class277.method1388(field1327[Statics.field3751 + 1]);
                                                                                                                                if (Statics.field655 == null) {
                                                                                                                                    Statics.field655 = class277.field3719;
                                                                                                                                }
                                                                                                                                client.field1004 = field1327[Statics.field3751 + 2];
                                                                                                                                client.field958.method3096(5);
                                                                                                                                client.field958.method2922(client.field1018);
                                                                                                                                client.field958.method2922(Statics.field655.field3722);
                                                                                                                                client.field958.method2922(client.field1004);
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5002) {
                                                                                                                                String var293 = field1328[--Statics.field1324];
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var294 = field1327[Statics.field3751];
                                                                                                                                int var295 = field1327[Statics.field3751 + 1];
                                                                                                                                client.field958.method3096(247);
                                                                                                                                client.field958.method2922(class174.method84(var293) + 2);
                                                                                                                                client.field958.method2851(var293);
                                                                                                                                client.field958.method2922(var294 - 1);
                                                                                                                                client.field958.method2922(var295);
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5003) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var296 = field1327[Statics.field3751];
                                                                                                                                int var297 = field1327[Statics.field3751 + 1];
                                                                                                                                class102 var298 = (class102) class99.field1495.get(var296);
                                                                                                                                class73 var299 = var298.method1668(var297);
                                                                                                                                if (var299 == null) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = -1;
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var299.field858;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var299.field859;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var299.field861 == null ? "" : var299.field861;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var299.field862 == null ? "" : var299.field862;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var299.field860 == null ? "" : var299.field860;
                                                                                                                                }
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5004) {
                                                                                                                                int var301 = field1327[--Statics.field3751];
                                                                                                                                class73 var302 = class99.method452(var301);
                                                                                                                                if (var302 == null) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = -1;
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var302.field863;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var302.field859;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var302.field861 == null ? "" : var302.field861;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var302.field862 == null ? "" : var302.field862;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var302.field860 == null ? "" : var302.field860;
                                                                                                                                }
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5005) {
                                                                                                                                if (Statics.field655 == null) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = Statics.field655.field3722;
                                                                                                                                }
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5008) {
                                                                                                                                String var303 = field1328[--Statics.field1324];
                                                                                                                                int var304 = field1327[--Statics.field3751];
                                                                                                                                String var305 = var303.toLowerCase();
                                                                                                                                byte var306 = 0;
                                                                                                                                if (var305.startsWith(class226.field3001)) {
                                                                                                                                    var306 = 0;
                                                                                                                                    var303 = var303.substring(class226.field3001.length());
                                                                                                                                } else if (var305.startsWith(class226.field3003)) {
                                                                                                                                    var306 = 1;
                                                                                                                                    var303 = var303.substring(class226.field3003.length());
                                                                                                                                } else if (var305.startsWith(class226.field3005)) {
                                                                                                                                    var306 = 2;
                                                                                                                                    var303 = var303.substring(class226.field3005.length());
                                                                                                                                } else if (var305.startsWith(class226.field3007)) {
                                                                                                                                    var306 = 3;
                                                                                                                                    var303 = var303.substring(class226.field3007.length());
                                                                                                                                } else if (var305.startsWith(class226.field3009)) {
                                                                                                                                    var306 = 4;
                                                                                                                                    var303 = var303.substring(class226.field3009.length());
                                                                                                                                } else if (var305.startsWith(class226.field2994)) {
                                                                                                                                    var306 = 5;
                                                                                                                                    var303 = var303.substring(class226.field2994.length());
                                                                                                                                } else if (var305.startsWith(class226.field3013)) {
                                                                                                                                    var306 = 6;
                                                                                                                                    var303 = var303.substring(class226.field3013.length());
                                                                                                                                } else if (var305.startsWith(class226.field3015)) {
                                                                                                                                    var306 = 7;
                                                                                                                                    var303 = var303.substring(class226.field3015.length());
                                                                                                                                } else if (var305.startsWith(class226.field2893)) {
                                                                                                                                    var306 = 8;
                                                                                                                                    var303 = var303.substring(class226.field2893.length());
                                                                                                                                } else if (var305.startsWith(class226.field2864)) {
                                                                                                                                    var306 = 9;
                                                                                                                                    var303 = var303.substring(class226.field2864.length());
                                                                                                                                } else if (var305.startsWith(class226.field3021)) {
                                                                                                                                    var306 = 10;
                                                                                                                                    var303 = var303.substring(class226.field3021.length());
                                                                                                                                } else if (var305.startsWith(class226.field3027)) {
                                                                                                                                    var306 = 11;
                                                                                                                                    var303 = var303.substring(class226.field3027.length());
                                                                                                                                } else if (client.field920 != 0) {
                                                                                                                                    if (var305.startsWith(class226.field2946)) {
                                                                                                                                        var306 = 0;
                                                                                                                                        var303 = var303.substring(class226.field2946.length());
                                                                                                                                    } else if (var305.startsWith(class226.field3004)) {
                                                                                                                                        var306 = 1;
                                                                                                                                        var303 = var303.substring(class226.field3004.length());
                                                                                                                                    } else if (var305.startsWith(class226.field3006)) {
                                                                                                                                        var306 = 2;
                                                                                                                                        var303 = var303.substring(class226.field3006.length());
                                                                                                                                    } else if (var305.startsWith(class226.field3008)) {
                                                                                                                                        var306 = 3;
                                                                                                                                        var303 = var303.substring(class226.field3008.length());
                                                                                                                                    } else if (var305.startsWith(class226.field2870)) {
                                                                                                                                        var306 = 4;
                                                                                                                                        var303 = var303.substring(class226.field2870.length());
                                                                                                                                    } else if (var305.startsWith(class226.field3012)) {
                                                                                                                                        var306 = 5;
                                                                                                                                        var303 = var303.substring(class226.field3012.length());
                                                                                                                                    } else if (var305.startsWith(class226.field3014)) {
                                                                                                                                        var306 = 6;
                                                                                                                                        var303 = var303.substring(class226.field3014.length());
                                                                                                                                    } else if (var305.startsWith(class226.field3016)) {
                                                                                                                                        var306 = 7;
                                                                                                                                        var303 = var303.substring(class226.field3016.length());
                                                                                                                                    } else if (var305.startsWith(class226.field3018)) {
                                                                                                                                        var306 = 8;
                                                                                                                                        var303 = var303.substring(class226.field3018.length());
                                                                                                                                    } else if (var305.startsWith(class226.field2825)) {
                                                                                                                                        var306 = 9;
                                                                                                                                        var303 = var303.substring(class226.field2825.length());
                                                                                                                                    } else if (var305.startsWith(class226.field3022)) {
                                                                                                                                        var306 = 10;
                                                                                                                                        var303 = var303.substring(class226.field3022.length());
                                                                                                                                    } else if (var305.startsWith(class226.field2971)) {
                                                                                                                                        var306 = 11;
                                                                                                                                        var303 = var303.substring(class226.field2971.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                String var307 = var303.toLowerCase();
                                                                                                                                byte var308 = 0;
                                                                                                                                if (var307.startsWith(class226.field3025)) {
                                                                                                                                    var308 = 1;
                                                                                                                                    var303 = var303.substring(class226.field3025.length());
                                                                                                                                } else if (var307.startsWith(class226.field2841)) {
                                                                                                                                    var308 = 2;
                                                                                                                                    var303 = var303.substring(class226.field2841.length());
                                                                                                                                } else if (var307.startsWith(class226.field3029)) {
                                                                                                                                    var308 = 3;
                                                                                                                                    var303 = var303.substring(class226.field3029.length());
                                                                                                                                } else if (var307.startsWith(class226.field3031)) {
                                                                                                                                    var308 = 4;
                                                                                                                                    var303 = var303.substring(class226.field3031.length());
                                                                                                                                } else if (var307.startsWith(class226.field2868)) {
                                                                                                                                    var308 = 5;
                                                                                                                                    var303 = var303.substring(class226.field2868.length());
                                                                                                                                } else if (client.field920 != 0) {
                                                                                                                                    if (var307.startsWith(class226.field3034)) {
                                                                                                                                        var308 = 1;
                                                                                                                                        var303 = var303.substring(class226.field3034.length());
                                                                                                                                    } else if (var307.startsWith(class226.field3028)) {
                                                                                                                                        var308 = 2;
                                                                                                                                        var303 = var303.substring(class226.field3028.length());
                                                                                                                                    } else if (var307.startsWith(class226.field3030)) {
                                                                                                                                        var308 = 3;
                                                                                                                                        var303 = var303.substring(class226.field3030.length());
                                                                                                                                    } else if (var307.startsWith(class226.field3032)) {
                                                                                                                                        var308 = 4;
                                                                                                                                        var303 = var303.substring(class226.field3032.length());
                                                                                                                                    } else if (var307.startsWith(class226.field3053)) {
                                                                                                                                        var308 = 5;
                                                                                                                                        var303 = var303.substring(class226.field3053.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                client.field958.method3096(77);
                                                                                                                                client.field958.method2922(0);
                                                                                                                                int var309 = client.field958.field2357;
                                                                                                                                client.field958.method2922(var304);
                                                                                                                                client.field958.method2922(var306);
                                                                                                                                client.field958.method2922(var308);
                                                                                                                                class180 var310 = client.field958;
                                                                                                                                int var311 = var310.field2357;
                                                                                                                                byte[] var312 = class267.method4476(var303);
                                                                                                                                var310.method2857(var312.length);
                                                                                                                                var310.field2357 += Statics.field3643.method2776(var312, 0, var312.length, var310.field2355, var310.field2357);
                                                                                                                                client.field958.method3010(client.field958.field2357 - var309);
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5009) {
                                                                                                                                Statics.field1324 -= 2;
                                                                                                                                String var313 = field1328[Statics.field1324];
                                                                                                                                String var314 = field1328[Statics.field1324 + 1];
                                                                                                                                client.field958.method3096(142);
                                                                                                                                client.field958.method2846(0);
                                                                                                                                int var315 = client.field958.field2357;
                                                                                                                                client.field958.method2851(var313);
                                                                                                                                class180 var316 = client.field958;
                                                                                                                                int var317 = var316.field2357;
                                                                                                                                byte[] var318 = class267.method4476(var314);
                                                                                                                                var316.method2857(var318.length);
                                                                                                                                var316.field2357 += Statics.field3643.method2776(var318, 0, var318.length, var316.field2355, var316.field2357);
                                                                                                                                client.field958.method2855(client.field958.field2357 - var315);
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5015) {
                                                                                                                                String var319;
                                                                                                                                if (Statics.field3110 == null || Statics.field3110.field884 == null) {
                                                                                                                                    var319 = "";
                                                                                                                                } else {
                                                                                                                                    var319 = Statics.field3110.field884;
                                                                                                                                }
                                                                                                                                field1328[++Statics.field1324 - 1] = var319;
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5016) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field1004;
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5017) {
                                                                                                                                int var320 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = class99.method858(var320);
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5018) {
                                                                                                                                int var321 = field1327[--Statics.field3751];
                                                                                                                                field1327[++Statics.field3751 - 1] = class99.method2616(var321);
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5019) {
                                                                                                                                int var322 = field1327[--Statics.field3751];
                                                                                                                                int[] var323 = field1327;
                                                                                                                                int var324 = ++Statics.field3751 - 1;
                                                                                                                                class73 var325 = (class73) class99.field1496.method3188((long) var322);
                                                                                                                                int var326;
                                                                                                                                if (var325 == null) {
                                                                                                                                    var326 = -1;
                                                                                                                                } else if (class99.field1494.field2457 == var325.field2443) {
                                                                                                                                    var326 = -1;
                                                                                                                                } else {
                                                                                                                                    var326 = ((class73) var325.field2443).field858;
                                                                                                                                }
                                                                                                                                var323[var324] = var326;
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5020) {
                                                                                                                                String var327 = field1328[--Statics.field1324];
                                                                                                                                if (var327.equalsIgnoreCase("toggleroof")) {
                                                                                                                                    Statics.field479.field1299 = !Statics.field479.field1299;
                                                                                                                                    class82.method43();
                                                                                                                                    if (Statics.field479.field1299) {
                                                                                                                                        class99.method1574(99, "", "Roofs are now all hidden");
                                                                                                                                    } else {
                                                                                                                                        class99.method1574(99, "", "Roofs will only be removed selectively");
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var327.equalsIgnoreCase("displayfps")) {
                                                                                                                                    client.field931 = !client.field931;
                                                                                                                                }
                                                                                                                                if (var327.equalsIgnoreCase("clickbox")) {
                                                                                                                                    class134.field1940 = !class134.field1940;
                                                                                                                                    class99.method1574(99, "", "Clickbox Mode: " + (class134.field1940 ? "AABB" : "Legacy"));
                                                                                                                                }
                                                                                                                                if (client.field1072 >= 2) {
                                                                                                                                    if (var327.equalsIgnoreCase("aabb")) {
                                                                                                                                        if (!class8.field226) {
                                                                                                                                            class8.field226 = true;
                                                                                                                                            class8.field225 = class12.field254;
                                                                                                                                            class99.method1574(99, "", "AABB boxes: All");
                                                                                                                                        } else if (class8.field225 == class12.field254) {
                                                                                                                                            class8.field226 = true;
                                                                                                                                            class8.field225 = class12.field256;
                                                                                                                                            class99.method1574(99, "", "AABB boxes: Mouse Over");
                                                                                                                                        } else {
                                                                                                                                            class8.field226 = false;
                                                                                                                                            class99.method1574(99, "", "AABB boxes: Off");
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var327.equalsIgnoreCase("legacyboxes")) {
                                                                                                                                        class8.field221 = !class8.field221;
                                                                                                                                        class99.method1574(99, "", "Show legacy boxes: " + class8.field221);
                                                                                                                                    }
                                                                                                                                    if (var327.equalsIgnoreCase("geotests")) {
                                                                                                                                        class8.field222 = !class8.field222;
                                                                                                                                        class99.method1574(99, "", "Show geometry tests: " + class8.field222);
                                                                                                                                    }
                                                                                                                                    if (var327.equalsIgnoreCase("fpson")) {
                                                                                                                                        client.field931 = true;
                                                                                                                                    }
                                                                                                                                    if (var327.equalsIgnoreCase("fpsoff")) {
                                                                                                                                        client.field931 = false;
                                                                                                                                    }
                                                                                                                                    if (var327.equalsIgnoreCase("gc")) {
                                                                                                                                        System.gc();
                                                                                                                                    }
                                                                                                                                    if (var327.equalsIgnoreCase("clientdrop")) {
                                                                                                                                        if (client.field968 > 0) {
                                                                                                                                            client.method603();
                                                                                                                                        } else {
                                                                                                                                            client.method2630(40);
                                                                                                                                            Statics.field681 = Statics.field273;
                                                                                                                                            Statics.field273 = null;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var327.equalsIgnoreCase("errortest") && client.field949 == 2) {
                                                                                                                                        throw new RuntimeException();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                client.field958.method3096(60);
                                                                                                                                client.field958.method2922(var327.length() + 1);
                                                                                                                                client.field958.method2851(var327);
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5021) {
                                                                                                                                client.field1123 = field1328[--Statics.field1324].toLowerCase().trim();
                                                                                                                                var292 = 1;
                                                                                                                            } else if (var385 == 5022) {
                                                                                                                                field1328[++Statics.field1324 - 1] = client.field1123;
                                                                                                                                var292 = 1;
                                                                                                                            } else {
                                                                                                                                var292 = 2;
                                                                                                                            }
                                                                                                                            var64 = var292;
                                                                                                                        } else if (var385 < 5400) {
                                                                                                                            byte var331;
                                                                                                                            if (var385 == 5306) {
                                                                                                                                int[] var328 = field1327;
                                                                                                                                int var329 = ++Statics.field3751 - 1;
                                                                                                                                int var330 = client.field1119 ? 2 : 1;
                                                                                                                                var328[var329] = var330;
                                                                                                                                var331 = 1;
                                                                                                                            } else if (var385 == 5307) {
                                                                                                                                int var332 = field1327[--Statics.field3751];
                                                                                                                                if (var332 == 1 || var332 == 2) {
                                                                                                                                    client.field1051 = 0L;
                                                                                                                                    if (var332 >= 2) {
                                                                                                                                        client.field1119 = true;
                                                                                                                                    } else {
                                                                                                                                        client.field1119 = false;
                                                                                                                                    }
                                                                                                                                    int var333 = client.field1119 ? 2 : 1;
                                                                                                                                    if (var333 == 1) {
                                                                                                                                        Statics.field1353.method825(765, 503);
                                                                                                                                    } else {
                                                                                                                                        Statics.field1353.method825(7680, 2160);
                                                                                                                                    }
                                                                                                                                    if (client.field922 >= 25) {
                                                                                                                                        client.method940();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var331 = 1;
                                                                                                                            } else if (var385 == 5308) {
                                                                                                                                field1327[++Statics.field3751 - 1] = Statics.field479.field1302;
                                                                                                                                var331 = 1;
                                                                                                                            } else if (var385 == 5309) {
                                                                                                                                int var334 = field1327[--Statics.field3751];
                                                                                                                                if (var334 == 1 || var334 == 2) {
                                                                                                                                    Statics.field479.field1302 = var334;
                                                                                                                                    class82.method43();
                                                                                                                                }
                                                                                                                                var331 = 1;
                                                                                                                            } else {
                                                                                                                                var331 = 2;
                                                                                                                            }
                                                                                                                            var64 = var331;
                                                                                                                        } else if (var385 < 5600) {
                                                                                                                            byte var340;
                                                                                                                            if (var385 == 5504) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var338 = field1327[Statics.field3751];
                                                                                                                                int var339 = field1327[Statics.field3751 + 1];
                                                                                                                                if (!client.field1009) {
                                                                                                                                    client.field988 = var338;
                                                                                                                                    client.field1019 = var339;
                                                                                                                                }
                                                                                                                                var340 = 1;
                                                                                                                            } else if (var385 == 5505) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field988;
                                                                                                                                var340 = 1;
                                                                                                                            } else if (var385 == 5506) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field1019;
                                                                                                                                var340 = 1;
                                                                                                                            } else if (var385 == 5530) {
                                                                                                                                int var341 = field1327[--Statics.field3751];
                                                                                                                                if (var341 < 0) {
                                                                                                                                    var341 = 0;
                                                                                                                                }
                                                                                                                                client.field994 = var341;
                                                                                                                                var340 = 1;
                                                                                                                            } else if (var385 == 5531) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field994;
                                                                                                                                var340 = 1;
                                                                                                                            } else {
                                                                                                                                var340 = 2;
                                                                                                                            }
                                                                                                                            var64 = var340;
                                                                                                                        } else if (var385 < 5700) {
                                                                                                                            var64 = method2822(var385, var6, var63);
                                                                                                                        } else if (var385 < 6300) {
                                                                                                                            byte var342;
                                                                                                                            if (var385 == 6200) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                client.field1164 = (short) field1327[Statics.field3751];
                                                                                                                                if (client.field1164 <= 0) {
                                                                                                                                    client.field1164 = 256;
                                                                                                                                }
                                                                                                                                client.field1158 = (short) field1327[Statics.field3751 + 1];
                                                                                                                                if (client.field1158 <= 0) {
                                                                                                                                    client.field1158 = 205;
                                                                                                                                }
                                                                                                                                var342 = 1;
                                                                                                                            } else if (var385 == 6201) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                client.field1159 = (short) field1327[Statics.field3751];
                                                                                                                                if (client.field1159 <= 0) {
                                                                                                                                    client.field1159 = 256;
                                                                                                                                }
                                                                                                                                client.field1160 = (short) field1327[Statics.field3751 + 1];
                                                                                                                                if (client.field1160 <= 0) {
                                                                                                                                    client.field1160 = 320;
                                                                                                                                }
                                                                                                                                var342 = 1;
                                                                                                                            } else if (var385 == 6202) {
                                                                                                                                Statics.field3751 -= 4;
                                                                                                                                client.field914 = (short) field1327[Statics.field3751];
                                                                                                                                if (client.field914 <= 0) {
                                                                                                                                    client.field914 = 1;
                                                                                                                                }
                                                                                                                                client.field980 = (short) field1327[Statics.field3751 + 1];
                                                                                                                                if (client.field980 <= 0) {
                                                                                                                                    client.field980 = 32767;
                                                                                                                                } else if (client.field980 < client.field914) {
                                                                                                                                    client.field980 = client.field914;
                                                                                                                                }
                                                                                                                                client.field1163 = (short) field1327[Statics.field3751 + 2];
                                                                                                                                if (client.field1163 <= 0) {
                                                                                                                                    client.field1163 = 1;
                                                                                                                                }
                                                                                                                                client.field966 = (short) field1327[Statics.field3751 + 3];
                                                                                                                                if (client.field966 <= 0) {
                                                                                                                                    client.field966 = 32767;
                                                                                                                                } else if (client.field966 < client.field1163) {
                                                                                                                                    client.field966 = client.field1163;
                                                                                                                                }
                                                                                                                                var342 = 1;
                                                                                                                            } else if (var385 == 6203) {
                                                                                                                                if (client.field978 == null) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = -1;
                                                                                                                                    field1327[++Statics.field3751 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    client.method142(0, 0, client.field978.field2714, client.field978.field2634, false);
                                                                                                                                    field1327[++Statics.field3751 - 1] = client.field1167;
                                                                                                                                    field1327[++Statics.field3751 - 1] = client.field1015;
                                                                                                                                }
                                                                                                                                var342 = 1;
                                                                                                                            } else if (var385 == 6204) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field1159;
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field1160;
                                                                                                                                var342 = 1;
                                                                                                                            } else if (var385 == 6205) {
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field1164;
                                                                                                                                field1327[++Statics.field3751 - 1] = client.field1158;
                                                                                                                                var342 = 1;
                                                                                                                            } else {
                                                                                                                                var342 = 2;
                                                                                                                            }
                                                                                                                            var64 = var342;
                                                                                                                        } else if (var385 < 6600) {
                                                                                                                            byte var343;
                                                                                                                            if (var385 == 6500) {
                                                                                                                                field1327[++Statics.field3751 - 1] = class81.method953() ? 1 : 0;
                                                                                                                                var343 = 1;
                                                                                                                            } else if (var385 == 6501) {
                                                                                                                                class81.field1284 = 0;
                                                                                                                                class81 var344 = class81.method1532();
                                                                                                                                if (var344 == null) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = -1;
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var344.field1288;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var344.field1289;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var344.field1292;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var344.field1280;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var344.field1287;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var344.field1291;
                                                                                                                                }
                                                                                                                                var343 = 1;
                                                                                                                            } else if (var385 == 6502) {
                                                                                                                                class81 var346 = class81.method1532();
                                                                                                                                if (var346 == null) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = -1;
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var346.field1288;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var346.field1289;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var346.field1292;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var346.field1280;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var346.field1287;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var346.field1291;
                                                                                                                                }
                                                                                                                                var343 = 1;
                                                                                                                            } else if (var385 == 6506) {
                                                                                                                                int var347 = field1327[--Statics.field3751];
                                                                                                                                class81 var348 = null;
                                                                                                                                for (int var349 = 0; var349 < class81.field1295; var349++) {
                                                                                                                                    if (Statics.field797[var349].field1288 == var347) {
                                                                                                                                        var348 = Statics.field797[var349];
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var348 == null) {
                                                                                                                                    field1327[++Statics.field3751 - 1] = -1;
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = var348.field1288;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var348.field1289;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var348.field1292;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var348.field1280;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var348.field1287;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var348.field1291;
                                                                                                                                }
                                                                                                                                var343 = 1;
                                                                                                                            } else if (var385 == 6507) {
                                                                                                                                Statics.field3751 -= 4;
                                                                                                                                int var350 = field1327[Statics.field3751];
                                                                                                                                boolean var351 = field1327[Statics.field3751 + 1] == 1;
                                                                                                                                int var352 = field1327[Statics.field3751 + 2];
                                                                                                                                boolean var353 = field1327[Statics.field3751 + 3] == 1;
                                                                                                                                class81.method1434(var350, var351, var352, var353);
                                                                                                                                var343 = 1;
                                                                                                                            } else if (var385 == 6511) {
                                                                                                                                int var354 = field1327[--Statics.field3751];
                                                                                                                                if (var354 >= 0 && var354 < class81.field1295) {
                                                                                                                                    class81 var355 = Statics.field797[var354];
                                                                                                                                    field1327[++Statics.field3751 - 1] = var355.field1288;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var355.field1289;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var355.field1292;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var355.field1280;
                                                                                                                                    field1327[++Statics.field3751 - 1] = var355.field1287;
                                                                                                                                    field1328[++Statics.field1324 - 1] = var355.field1291;
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = -1;
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1327[++Statics.field3751 - 1] = 0;
                                                                                                                                    field1328[++Statics.field1324 - 1] = "";
                                                                                                                                }
                                                                                                                                var343 = 1;
                                                                                                                            } else if (var385 == 6512) {
                                                                                                                                client.field1098 = field1327[--Statics.field3751] == 1;
                                                                                                                                var343 = 1;
                                                                                                                            } else if (var385 == 6513) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var356 = field1327[Statics.field3751];
                                                                                                                                int var357 = field1327[Statics.field3751 + 1];
                                                                                                                                class252 var358 = class252.method4003(var357);
                                                                                                                                if (var358.method4019()) {
                                                                                                                                    field1328[++Statics.field1324 - 1] = class259.method200(var356).method4210(var357, var358.field3364);
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = class259.method200(var356).method4215(var357, var358.field3361);
                                                                                                                                }
                                                                                                                                var343 = 1;
                                                                                                                            } else if (var385 == 6514) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var359 = field1327[Statics.field3751];
                                                                                                                                int var360 = field1327[Statics.field3751 + 1];
                                                                                                                                class252 var361 = class252.method4003(var360);
                                                                                                                                if (var361.method4019()) {
                                                                                                                                    field1328[++Statics.field1324 - 1] = class256.method2825(var359).method4135(var360, var361.field3364);
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = class256.method2825(var359).method4126(var360, var361.field3361);
                                                                                                                                }
                                                                                                                                var343 = 1;
                                                                                                                            } else if (var385 == 6515) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var362 = field1327[Statics.field3751];
                                                                                                                                int var363 = field1327[Statics.field3751 + 1];
                                                                                                                                class252 var364 = class252.method4003(var363);
                                                                                                                                if (var364.method4019()) {
                                                                                                                                    field1328[++Statics.field1324 - 1] = class257.method44(var362).method4172(var363, var364.field3364);
                                                                                                                                } else {
                                                                                                                                    field1327[++Statics.field3751 - 1] = class257.method44(var362).method4149(var363, var364.field3361);
                                                                                                                                }
                                                                                                                                var343 = 1;
                                                                                                                            } else if (var385 == 6516) {
                                                                                                                                Statics.field3751 -= 2;
                                                                                                                                int var365 = field1327[Statics.field3751];
                                                                                                                                int var366 = field1327[Statics.field3751 + 1];
                                                                                                                                class252 var367 = class252.method4003(var366);
                                                                                                                                if (var367.method4019()) {
                                                                                                                                    String[] var368 = field1328;
                                                                                                                                    int var369 = ++Statics.field1324 - 1;
                                                                                                                                    class253 var370 = (class253) class253.field3369.method3220((long) var365);
                                                                                                                                    class253 var371;
                                                                                                                                    if (var370 == null) {
                                                                                                                                        byte[] var372 = Statics.field3371.method3741(34, var365);
                                                                                                                                        class253 var373 = new class253();
                                                                                                                                        if (var372 != null) {
                                                                                                                                            var373.method4031(new class174(var372));
                                                                                                                                        }
                                                                                                                                        var373.method4027();
                                                                                                                                        class253.field3369.method3233(var373, (long) var365);
                                                                                                                                        var371 = var373;
                                                                                                                                    } else {
                                                                                                                                        var371 = var370;
                                                                                                                                    }
                                                                                                                                    var368[var369] = var371.method4041(var366, var367.field3364);
                                                                                                                                } else {
                                                                                                                                    int[] var374 = field1327;
                                                                                                                                    int var375 = ++Statics.field3751 - 1;
                                                                                                                                    class253 var376 = (class253) class253.field3369.method3220((long) var365);
                                                                                                                                    class253 var377;
                                                                                                                                    if (var376 == null) {
                                                                                                                                        byte[] var378 = Statics.field3371.method3741(34, var365);
                                                                                                                                        class253 var379 = new class253();
                                                                                                                                        if (var378 != null) {
                                                                                                                                            var379.method4031(new class174(var378));
                                                                                                                                        }
                                                                                                                                        var379.method4027();
                                                                                                                                        class253.field3369.method3233(var379, (long) var365);
                                                                                                                                        var377 = var379;
                                                                                                                                    } else {
                                                                                                                                        var377 = var376;
                                                                                                                                    }
                                                                                                                                    var374[var375] = var377.method4030(var366, var367.field3361);
                                                                                                                                }
                                                                                                                                var343 = 1;
                                                                                                                            } else {
                                                                                                                                var343 = 2;
                                                                                                                            }
                                                                                                                            var64 = var343;
                                                                                                                        } else if (var385 < 6700) {
                                                                                                                            var64 = method514(var385, var6, var63);
                                                                                                                        } else {
                                                                                                                            var64 = 2;
                                                                                                                        }
                                                                                                                        switch(var64) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var385 == 0) {
                                                                                                                        field1327[++Statics.field3751 - 1] = var14[var12];
                                                                                                                    } else if (var385 == 1) {
                                                                                                                        int var22 = var14[var12];
                                                                                                                        field1327[++Statics.field3751 - 1] = class212.field2573[var22];
                                                                                                                    } else if (var385 == 2) {
                                                                                                                        int var23 = var14[var12];
                                                                                                                        class212.field2573[var23] = field1327[--Statics.field3751];
                                                                                                                        client.method2774(var23);
                                                                                                                    } else if (var385 == 3) {
                                                                                                                        field1328[++Statics.field1324 - 1] = var6.field1502[var12];
                                                                                                                    } else if (var385 == 6) {
                                                                                                                        var12 += var14[var12];
                                                                                                                    } else if (var385 == 7) {
                                                                                                                        Statics.field3751 -= 2;
                                                                                                                        if (field1327[Statics.field3751] != field1327[Statics.field3751 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var385 == 8) {
                                                                                                                        Statics.field3751 -= 2;
                                                                                                                        if (field1327[Statics.field3751] == field1327[Statics.field3751 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var385 == 9) {
                                                                                                                        Statics.field3751 -= 2;
                                                                                                                        if (field1327[Statics.field3751] < field1327[Statics.field3751 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var385 == 10) {
                                                                                                                        Statics.field3751 -= 2;
                                                                                                                        if (field1327[Statics.field3751] > field1327[Statics.field3751 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var385 == 21) {
                                                                                                                        if (field1330 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var24 = field1331[--field1330];
                                                                                                                        var6 = var24.field769;
                                                                                                                        var13 = var6.field1500;
                                                                                                                        var14 = var6.field1501;
                                                                                                                        var12 = var24.field770;
                                                                                                                        Statics.field1323 = var24.field771;
                                                                                                                        Statics.field1325 = var24.field772;
                                                                                                                    } else if (var385 == 25) {
                                                                                                                        int var25 = var14[var12];
                                                                                                                        field1327[++Statics.field3751 - 1] = class212.method117(var25);
                                                                                                                    } else if (var385 == 27) {
                                                                                                                        int var26 = var14[var12];
                                                                                                                        int var27 = field1327[--Statics.field3751];
                                                                                                                        class251 var28 = (class251) class251.field3355.method3220((long) var26);
                                                                                                                        class251 var29;
                                                                                                                        if (var28 == null) {
                                                                                                                            byte[] var30 = Statics.field3359.method3741(14, var26);
                                                                                                                            class251 var31 = new class251();
                                                                                                                            if (var30 != null) {
                                                                                                                                var31.method4001(new class174(var30));
                                                                                                                            }
                                                                                                                            class251.field3355.method3233(var31, (long) var26);
                                                                                                                            var29 = var31;
                                                                                                                        } else {
                                                                                                                            var29 = var28;
                                                                                                                        }
                                                                                                                        int var33 = var29.field3356;
                                                                                                                        int var34 = var29.field3357;
                                                                                                                        int var35 = var29.field3358;
                                                                                                                        int var36 = class212.field2577[var35 - var34];
                                                                                                                        if (var27 < 0 || var27 > var36) {
                                                                                                                            var27 = 0;
                                                                                                                        }
                                                                                                                        int var37 = var36 << var34;
                                                                                                                        class212.field2573[var33] = class212.field2573[var33] & ~var37 | var27 << var34 & var37;
                                                                                                                    } else if (var385 == 31) {
                                                                                                                        Statics.field3751 -= 2;
                                                                                                                        if (field1327[Statics.field3751] <= field1327[Statics.field3751 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var385 == 32) {
                                                                                                                        Statics.field3751 -= 2;
                                                                                                                        if (field1327[Statics.field3751] >= field1327[Statics.field3751 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var385 == 33) {
                                                                                                                        field1327[++Statics.field3751 - 1] = Statics.field1323[var14[var12]];
                                                                                                                    } else if (var385 == 34) {
                                                                                                                        Statics.field1323[var14[var12]] = field1327[--Statics.field3751];
                                                                                                                    } else if (var385 == 35) {
                                                                                                                        field1328[++Statics.field1324 - 1] = Statics.field1325[var14[var12]];
                                                                                                                    } else if (var385 == 36) {
                                                                                                                        Statics.field1325[var14[var12]] = field1328[--Statics.field1324];
                                                                                                                    } else if (var385 == 37) {
                                                                                                                        int var38 = var14[var12];
                                                                                                                        Statics.field1324 -= var38;
                                                                                                                        String var39 = class271.method3993(field1328, Statics.field1324, var38);
                                                                                                                        field1328[++Statics.field1324 - 1] = var39;
                                                                                                                    } else if (var385 == 38) {
                                                                                                                        Statics.field3751--;
                                                                                                                    } else if (var385 == 39) {
                                                                                                                        Statics.field1324--;
                                                                                                                    } else if (var385 == 40) {
                                                                                                                        int var40 = var14[var12];
                                                                                                                        class100 var41 = (class100) class100.field1507.method3220((long) var40);
                                                                                                                        class100 var42;
                                                                                                                        if (var41 == null) {
                                                                                                                            byte[] var43 = Statics.field272.method3741(var40, 0);
                                                                                                                            if (var43 == null) {
                                                                                                                                var42 = null;
                                                                                                                            } else {
                                                                                                                                class100 var44 = class100.method946(var43);
                                                                                                                                class100.field1507.method3233(var44, (long) var40);
                                                                                                                                var42 = var44;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var42 = var41;
                                                                                                                        }
                                                                                                                        class100 var45 = var42;
                                                                                                                        int[] var46 = new int[var42.field1499];
                                                                                                                        String[] var47 = new String[var42.field1506];
                                                                                                                        for (int var48 = 0; var48 < var45.field1505; var48++) {
                                                                                                                            var46[var48] = field1327[Statics.field3751 - var45.field1505 + var48];
                                                                                                                        }
                                                                                                                        for (int var49 = 0; var49 < var45.field1504; var49++) {
                                                                                                                            var47[var49] = field1328[Statics.field1324 - var45.field1504 + var49];
                                                                                                                        }
                                                                                                                        Statics.field3751 -= var45.field1505;
                                                                                                                        Statics.field1324 -= var45.field1504;
                                                                                                                        class63 var50 = new class63();
                                                                                                                        var50.field769 = var6;
                                                                                                                        var50.field770 = var12;
                                                                                                                        var50.field771 = Statics.field1323;
                                                                                                                        var50.field772 = Statics.field1325;
                                                                                                                        field1331[++field1330 - 1] = var50;
                                                                                                                        var6 = var45;
                                                                                                                        var13 = var45.field1500;
                                                                                                                        var14 = var45.field1501;
                                                                                                                        var12 = -1;
                                                                                                                        Statics.field1323 = var46;
                                                                                                                        Statics.field1325 = var47;
                                                                                                                    } else if (var385 == 42) {
                                                                                                                        field1327[++Statics.field3751 - 1] = Statics.field1492.method1602(var14[var12]);
                                                                                                                    } else if (var385 == 43) {
                                                                                                                        Statics.field1492.method1601(var14[var12], field1327[--Statics.field3751]);
                                                                                                                    } else if (var385 == 44) {
                                                                                                                        int var51 = var14[var12] >> 16;
                                                                                                                        int var52 = var14[var12] & 0xFFFF;
                                                                                                                        int var53 = field1327[--Statics.field3751];
                                                                                                                        if (var53 >= 0 && var53 <= 5000) {
                                                                                                                            field1321[var51] = var53;
                                                                                                                            byte var54 = -1;
                                                                                                                            if (var52 == 105) {
                                                                                                                                var54 = 0;
                                                                                                                            }
                                                                                                                            int var55 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var55 >= var53) {
                                                                                                                                    continue label1835;
                                                                                                                                }
                                                                                                                                field1329[var51][var55] = var54;
                                                                                                                                var55++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var385 == 45) {
                                                                                                                        int var56 = var14[var12];
                                                                                                                        int var57 = field1327[--Statics.field3751];
                                                                                                                        if (var57 < 0 || var57 >= field1321[var56]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1327[++Statics.field3751 - 1] = field1329[var56][var57];
                                                                                                                    } else if (var385 == 46) {
                                                                                                                        int var58 = var14[var12];
                                                                                                                        Statics.field3751 -= 2;
                                                                                                                        int var59 = field1327[Statics.field3751];
                                                                                                                        if (var59 < 0 || var59 >= field1321[var58]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1329[var58][var59] = field1327[Statics.field3751 + 1];
                                                                                                                    } else if (var385 == 47) {
                                                                                                                        String var60 = Statics.field1492.method1604(var14[var12]);
                                                                                                                        if (var60 == null) {
                                                                                                                            var60 = "null";
                                                                                                                        }
                                                                                                                        field1328[++Statics.field1324 - 1] = var60;
                                                                                                                    } else if (var385 == 48) {
                                                                                                                        Statics.field1492.method1609(var14[var12], field1328[--Statics.field1324]);
                                                                                                                    } else if (var385 == 60) {
                                                                                                                        class187 var61 = var6.field1503[var14[var12]];
                                                                                                                        class199 var62 = (class199) var61.method3188((long) field1327[--Statics.field3751]);
                                                                                                                        if (var62 != null) {
                                                                                                                            var12 += var62.field2452;
                                                                                                                        }
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
        } catch (Exception var384) {
            StringBuilder var382 = new StringBuilder(30);
            var382.append("").append(var6.field2437).append(" ");
            for (int var383 = field1330 - 1; var383 >= 0; var383--) {
                var382.append("").append(field1331[var383].field769.field2437).append(" ");
            }
            var382.append("").append(var15);
            class153.method463(var382.toString(), var384);
        }
    }

    @ObfuscatedName("ft.i(ILcv;ZI)I")
    public static int method3128(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field3751 -= 3;
            int var3 = field1327[Statics.field3751];
            int var4 = field1327[Statics.field3751 + 1];
            int var5 = field1327[Statics.field3751 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class217 var6 = class217.method3861(var3);
            if (var6.field2742 == null) {
                var6.field2742 = new class217[var5 + 1];
            }
            if (var6.field2742.length <= var5) {
                class217[] var7 = new class217[var5 + 1];
                for (int var8 = 0; var8 < var6.field2742.length; var8++) {
                    var7[var8] = var6.field2742[var8];
                }
                var6.field2742 = var7;
            }
            if (var5 > 0 && var6.field2742[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class217 var9 = new class217();
            var9.field2620 = var4;
            var9.field2637 = var9.field2683 = var6.field2683;
            var9.field2619 = var5;
            var9.field2617 = true;
            var6.field2742[var5] = var9;
            if (arg2) {
                Statics.field615 = var9;
            } else {
                Statics.field2100 = var9;
            }
            client.method148(var6);
            return 1;
        } else if (arg0 == 101) {
            class217 var10 = arg2 ? Statics.field615 : Statics.field2100;
            class217 var11 = class217.method3861(var10.field2683);
            var11.field2742[var10.field2619] = null;
            client.method148(var11);
            return 1;
        } else if (arg0 == 102) {
            class217 var12 = class217.method3861(field1327[--Statics.field3751]);
            var12.field2742 = null;
            client.method148(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field3751 -= 2;
            int var13 = field1327[Statics.field3751];
            int var14 = field1327[Statics.field3751 + 1];
            class217 var15 = class217.method2714(var13, var14);
            if (var15 == null || var14 == -1) {
                field1327[++Statics.field3751 - 1] = 0;
            } else {
                field1327[++Statics.field3751 - 1] = 1;
                if (arg2) {
                    Statics.field615 = var15;
                } else {
                    Statics.field2100 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class217 var16 = class217.method3861(field1327[--Statics.field3751]);
            if (var16 == null) {
                field1327[++Statics.field3751 - 1] = 0;
            } else {
                field1327[++Statics.field3751 - 1] = 1;
                if (arg2) {
                    Statics.field615 = var16;
                } else {
                    Statics.field2100 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cf.u(ILcv;ZI)I")
    public static int method1387(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1327[--Statics.field3751];
            var4 = class217.method3861(var3);
        } else {
            var4 = arg2 ? Statics.field615 : Statics.field2100;
        }
        if (arg0 == 1000) {
            Statics.field3751 -= 4;
            var4.field2672 = field1327[Statics.field3751];
            var4.field2628 = field1327[Statics.field3751 + 1];
            var4.field2715 = field1327[Statics.field3751 + 2];
            var4.field2624 = field1327[Statics.field3751 + 3];
            client.method148(var4);
            Statics.field1353.method1143(var4);
            if (var3 != -1 && var4.field2620 == 0) {
                client.method1353(Statics.field2616[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field3751 -= 4;
            var4.field2629 = field1327[Statics.field3751];
            var4.field2630 = field1327[Statics.field3751 + 1];
            var4.field2625 = field1327[Statics.field3751 + 2];
            var4.field2626 = field1327[Statics.field3751 + 3];
            client.method148(var4);
            Statics.field1353.method1143(var4);
            if (var3 != -1 && var4.field2620 == 0) {
                client.method1353(Statics.field2616[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1327[--Statics.field3751] == 1;
            if (var4.field2638 != var5) {
                var4.field2638 = var5;
                client.method148(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2751 = field1327[--Statics.field3751] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2752 = field1327[--Statics.field3751] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cw.g(ILcv;ZI)I")
    public static int method1420(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1327[--Statics.field3751];
            var4 = class217.method3861(var3);
        } else {
            var4 = arg2 ? Statics.field615 : Statics.field2100;
        }
        if (arg0 == 1100) {
            Statics.field3751 -= 2;
            var4.field2639 = field1327[Statics.field3751];
            if (var4.field2639 > var4.field2641 - var4.field2714) {
                var4.field2639 = var4.field2641 - var4.field2714;
            }
            if (var4.field2639 < 0) {
                var4.field2639 = 0;
            }
            var4.field2627 = field1327[Statics.field3751 + 1];
            if (var4.field2627 > var4.field2733 - var4.field2634) {
                var4.field2627 = var4.field2733 - var4.field2634;
            }
            if (var4.field2627 < 0) {
                var4.field2627 = 0;
            }
            client.method148(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2607 = field1327[--Statics.field3751];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2647 = field1327[--Statics.field3751] == 1;
            client.method148(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2649 = field1327[--Statics.field3751];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2651 = field1327[--Statics.field3751];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2618 = field1327[--Statics.field3751];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2708 = field1327[--Statics.field3751];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2656 = field1327[--Statics.field3751] == 1;
            client.method148(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2661 = 1;
            var4.field2725 = field1327[--Statics.field3751];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field3751 -= 6;
            var4.field2662 = field1327[Statics.field3751];
            var4.field2668 = field1327[Statics.field3751 + 1];
            var4.field2712 = field1327[Statics.field3751 + 2];
            var4.field2670 = field1327[Statics.field3751 + 3];
            var4.field2671 = field1327[Statics.field3751 + 4];
            var4.field2623 = field1327[Statics.field3751 + 5];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1327[--Statics.field3751];
            if (var4.field2665 != var5) {
                var4.field2665 = var5;
                var4.field2740 = 0;
                var4.field2677 = 0;
                client.method148(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2681 = field1327[--Statics.field3751] == 1;
            client.method148(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1328[--Statics.field1324];
            if (!var6.equals(var4.field2667)) {
                var4.field2667 = var6;
                client.method148(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2610 = field1327[--Statics.field3751];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field3751 -= 3;
            var4.field2719 = field1327[Statics.field3751];
            var4.field2682 = field1327[Statics.field3751 + 1];
            var4.field2645 = field1327[Statics.field3751 + 2];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2716 = field1327[--Statics.field3751] == 1;
            client.method148(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2655 = field1327[--Statics.field3751];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2658 = field1327[--Statics.field3751];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2659 = field1327[--Statics.field3751] == 1;
            client.method148(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2739 = field1327[--Statics.field3751] == 1;
            client.method148(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field3751 -= 2;
            var4.field2641 = field1327[Statics.field3751];
            var4.field2733 = field1327[Statics.field3751 + 1];
            client.method148(var4);
            if (var3 != -1 && var4.field2620 == 0) {
                client.method1353(Statics.field2616[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method943(var4.field2683, var4.field2619);
            client.field1069 = var4;
            client.method148(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2654 = field1327[--Statics.field3751];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2644 = field1327[--Statics.field3751];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2650 = field1327[--Statics.field3751];
            client.method148(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1327[--Statics.field3751];
            class284[] var8 = new class284[] { class284.field3754, class284.field3757, class284.field3755, class284.field3756, class284.field3753 };
            class284 var9 = (class284) class169.method454(var8, var7);
            if (var9 != null) {
                var4.field2648 = var9;
                client.method148(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var10 = field1327[--Statics.field3751] == 1;
            var4.field2664 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hw.m(ILcv;ZI)I")
    public static int method3630(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3861(field1327[--Statics.field3751]);
        } else {
            var3 = arg2 ? Statics.field615 : Statics.field2100;
        }
        client.method148(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field3751 -= 2;
            int var4 = field1327[Statics.field3751];
            int var5 = field1327[Statics.field3751 + 1];
            var3.field2726 = var4;
            var3.field2636 = var5;
            class257 var6 = class257.method44(var4);
            var3.field2712 = var6.field3480;
            var3.field2670 = var6.field3481;
            var3.field2671 = var6.field3483;
            var3.field2662 = var6.field3463;
            var3.field2668 = var6.field3484;
            var3.field2623 = var6.field3489;
            if (arg0 == 1205) {
                var3.field2676 = 0;
            } else if (arg0 == 1212 | var6.field3485 == 1) {
                var3.field2676 = 1;
            } else {
                var3.field2676 = 2;
            }
            if (var3.field2745 > 0) {
                var3.field2623 = var3.field2623 * 32 / var3.field2745;
            } else if (var3.field2629 > 0) {
                var3.field2623 = var3.field2623 * 32 / var3.field2629;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2661 = 2;
            var3.field2725 = field1327[--Statics.field3751];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2661 = 3;
            var3.field2725 = Statics.field3110.field888.method3612();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ba.s(ILcv;ZB)I")
    public static int method944(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3861(field1327[--Statics.field3751]);
        } else {
            var3 = arg2 ? Statics.field615 : Statics.field2100;
        }
        if (arg0 == 1300) {
            int var4 = field1327[--Statics.field3751] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3642(var4, field1328[--Statics.field1324]);
                return 1;
            } else {
                Statics.field1324--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field3751 -= 2;
            int var5 = field1327[Statics.field3751];
            int var6 = field1327[Statics.field3751 + 1];
            var3.field2693 = class217.method2714(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2713 = field1327[--Statics.field3751] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2694 = field1327[--Statics.field3751];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2702 = field1327[--Statics.field3751];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2721 = field1328[--Statics.field1324];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2697 = field1328[--Statics.field1324];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2692 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.x(ILcv;ZS)I")
    public static int method201(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3861(field1327[--Statics.field3751]);
        } else {
            var3 = arg2 ? Statics.field615 : Statics.field2100;
        }
        String var4 = field1328[--Statics.field1324];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1327[--Statics.field3751];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1327[--Statics.field3751];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1328[--Statics.field1324];
            } else {
                var7[var8] = Integer.valueOf(field1327[--Statics.field3751]);
            }
        }
        int var9 = field1327[--Statics.field3751];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2700 = var7;
        } else if (arg0 == 1401) {
            var3.field2703 = var7;
        } else if (arg0 == 1402) {
            var3.field2685 = var7;
        } else if (arg0 == 1403) {
            var3.field2727 = var7;
        } else if (arg0 == 1404) {
            var3.field2706 = var7;
        } else if (arg0 == 1405) {
            var3.field2707 = var7;
        } else if (arg0 == 1406) {
            var3.field2696 = var7;
        } else if (arg0 == 1407) {
            var3.field2711 = var7;
            var3.field2611 = var5;
        } else if (arg0 == 1408) {
            var3.field2717 = var7;
        } else if (arg0 == 1409) {
            var3.field2718 = var7;
        } else if (arg0 == 1410) {
            var3.field2652 = var7;
        } else if (arg0 == 1411) {
            var3.field2701 = var7;
        } else if (arg0 == 1412) {
            var3.field2705 = var7;
        } else if (arg0 == 1414) {
            var3.field2749 = var7;
            var3.field2680 = var5;
        } else if (arg0 == 1415) {
            var3.field2660 = var7;
            var3.field2609 = var5;
        } else if (arg0 == 1416) {
            var3.field2748 = var7;
        } else if (arg0 == 1417) {
            var3.field2657 = var7;
        } else if (arg0 == 1418) {
            var3.field2720 = var7;
        } else if (arg0 == 1419) {
            var3.field2640 = var7;
        } else if (arg0 == 1420) {
            var3.field2722 = var7;
        } else if (arg0 == 1421) {
            var3.field2723 = var7;
        } else if (arg0 == 1422) {
            var3.field2724 = var7;
        } else if (arg0 == 1423) {
            var3.field2691 = var7;
        } else if (arg0 == 1424) {
            var3.field2695 = var7;
        } else if (arg0 == 1425) {
            var3.field2728 = var7;
        } else if (arg0 == 1426) {
            var3.field2614 = var7;
        } else if (arg0 == 1427) {
            var3.field2673 = var7;
        } else {
            return 2;
        }
        var3.field2698 = true;
        return 1;
    }

    @ObfuscatedName("bj.p(ILcv;ZI)I")
    public static int method932(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field615 : Statics.field2100;
        if (arg0 == 1600) {
            field1327[++Statics.field3751 - 1] = var3.field2639;
            return 1;
        } else if (arg0 == 1601) {
            field1327[++Statics.field3751 - 1] = var3.field2627;
            return 1;
        } else if (arg0 == 1602) {
            field1328[++Statics.field1324 - 1] = var3.field2667;
            return 1;
        } else if (arg0 == 1603) {
            field1327[++Statics.field3751 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 1604) {
            field1327[++Statics.field3751 - 1] = var3.field2733;
            return 1;
        } else if (arg0 == 1605) {
            field1327[++Statics.field3751 - 1] = var3.field2623;
            return 1;
        } else if (arg0 == 1606) {
            field1327[++Statics.field3751 - 1] = var3.field2712;
            return 1;
        } else if (arg0 == 1607) {
            field1327[++Statics.field3751 - 1] = var3.field2671;
            return 1;
        } else if (arg0 == 1608) {
            field1327[++Statics.field3751 - 1] = var3.field2670;
            return 1;
        } else if (arg0 == 1609) {
            field1327[++Statics.field3751 - 1] = var3.field2649;
            return 1;
        } else if (arg0 == 1610) {
            field1327[++Statics.field3751 - 1] = var3.field2650;
            return 1;
        } else if (arg0 == 1611) {
            field1327[++Statics.field3751 - 1] = var3.field2607;
            return 1;
        } else if (arg0 == 1612) {
            field1327[++Statics.field3751 - 1] = var3.field2644;
            return 1;
        } else if (arg0 == 1613) {
            field1327[++Statics.field3751 - 1] = var3.field2648.method13();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ci.k(ILcv;ZI)I")
    public static int method1530(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field615 : Statics.field2100;
        if (arg0 == 1700) {
            field1327[++Statics.field3751 - 1] = var3.field2726;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2726 == -1) {
                field1327[++Statics.field3751 - 1] = 0;
            } else {
                field1327[++Statics.field3751 - 1] = var3.field2636;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1327[++Statics.field3751 - 1] = var3.field2619;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("el.r(ILcv;ZI)I")
    public static int method2619(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3861(field1327[--Statics.field3751]);
        } else {
            var3 = arg2 ? Statics.field615 : Statics.field2100;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1334 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2673 == null) {
            return 0;
        } else {
            class70 var4 = new class70();
            var4.field830 = var3;
            var4.field832 = var3.field2673;
            var4.field840 = field1334 + 1;
            client.field1104.method3290(var4);
            return 1;
        }
    }

    @ObfuscatedName("ao.w(ILcv;ZI)I")
    public static int method655(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class217 var3 = class217.method3861(field1327[--Statics.field3751]);
            field1327[++Statics.field3751 - 1] = var3.field2726;
            return 1;
        } else if (arg0 == 2701) {
            class217 var4 = class217.method3861(field1327[--Statics.field3751]);
            if (var4.field2726 == -1) {
                field1327[++Statics.field3751 - 1] = 0;
            } else {
                field1327[++Statics.field3751 - 1] = var4.field2636;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1327[--Statics.field3751];
            class69 var6 = (class69) client.field1066.method3251((long) var5);
            if (var6 == null) {
                field1327[++Statics.field3751 - 1] = 0;
            } else {
                field1327[++Statics.field3751 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1327[++Statics.field3751 - 1] = client.field940;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hx.v(ILcv;ZI)I")
    public static int method3709(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method3861(field1327[--Statics.field3751]);
        if (arg0 == 2800) {
            int[] var4 = field1327;
            int var5 = ++Statics.field3751 - 1;
            int var6 = client.method887(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 2801) {
            int var8 = field1327[--Statics.field3751];
            int var9 = var8 - 1;
            if (var3.field2692 == null || var9 >= var3.field2692.length || var3.field2692[var9] == null) {
                field1328[++Statics.field1324 - 1] = "";
            } else {
                field1328[++Statics.field1324 - 1] = var3.field2692[var9];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2721 == null) {
                field1328[++Statics.field1324 - 1] = "";
            } else {
                field1328[++Statics.field1324 - 1] = var3.field2721;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gz.h(ILcv;ZI)I")
    public static int method3496(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1328[--Statics.field1324];
            class99.method1574(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field3751 -= 2;
            client.method73(Statics.field3110, field1327[Statics.field3751], field1327[Statics.field3751 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            client.method3700();
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1328[--Statics.field1324];
            int var5 = 0;
            if (class271.method464(var4)) {
                var5 = class271.method2621(var4);
            }
            client.field958.method3096(201);
            client.field958.method3024(var5);
            return 1;
        } else if (arg0 == 3105) {
            String var6 = field1328[--Statics.field1324];
            client.field958.method3096(97);
            client.field958.method2922(var6.length() + 1);
            client.field958.method2851(var6);
            return 1;
        } else if (arg0 == 3106) {
            String var7 = field1328[--Statics.field1324];
            client.field958.method3096(42);
            client.field958.method2922(var7.length() + 1);
            client.field958.method2851(var7);
            return 1;
        } else if (arg0 == 3107) {
            int var8 = field1327[--Statics.field3751];
            String var9 = field1328[--Statics.field1324];
            int var10 = class97.field1470;
            int[] var11 = class97.field1471;
            boolean var12 = false;
            for (int var13 = 0; var13 < var10; var13++) {
                class75 var14 = client.field1070[var11[var13]];
                if (var14 != null && Statics.field3110 != var14 && var14.field884 != null && var14.field884.equalsIgnoreCase(var9)) {
                    if (var8 == 1) {
                        client.field958.method3096(139);
                        client.field958.method2885(0);
                        client.field958.method2891(var11[var13]);
                    } else if (var8 == 4) {
                        client.field958.method3096(184);
                        client.field958.method2885(0);
                        client.field958.method2846(var11[var13]);
                    } else if (var8 == 6) {
                        client.field958.method3096(73);
                        client.field958.method2885(0);
                        client.field958.method2893(var11[var13]);
                    } else if (var8 == 7) {
                        client.field958.method3096(118);
                        client.field958.method2892(var11[var13]);
                        client.field958.method2981(0);
                    }
                    var12 = true;
                    break;
                }
            }
            if (!var12) {
                class99.method1574(4, "", class226.field2974 + var9);
            }
            return 1;
        } else if (arg0 == 3108) {
            Statics.field3751 -= 3;
            int var15 = field1327[Statics.field3751];
            int var16 = field1327[Statics.field3751 + 1];
            int var17 = field1327[Statics.field3751 + 2];
            class217 var18 = class217.method3861(var17);
            client.method945(var18, var15, var16);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field3751 -= 2;
            int var19 = field1327[Statics.field3751];
            int var20 = field1327[Statics.field3751 + 1];
            class217 var21 = arg2 ? Statics.field615 : Statics.field2100;
            client.method945(var21, var19, var20);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field700 = field1327[--Statics.field3751] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1327[++Statics.field3751 - 1] = Statics.field479.field1299 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field479.field1299 = field1327[--Statics.field3751] == 1;
            class82.method43();
            return 1;
        } else if (arg0 == 3113) {
            String var22 = field1328[--Statics.field1324];
            boolean var23 = field1327[--Statics.field3751] == 1;
            class57.method3693(var22, var23, "openjs", false);
            return 1;
        } else if (arg0 == 3115) {
            int var24 = field1327[--Statics.field3751];
            client.field958.method3096(81);
            client.field958.method2846(var24);
            return 1;
        } else if (arg0 == 3116) {
            int var25 = field1327[--Statics.field3751];
            Statics.field1324 -= 2;
            String var26 = field1328[Statics.field1324];
            String var27 = field1328[Statics.field1324 + 1];
            if (var26.length() > 500) {
                return 1;
            } else if (var27.length() > 500) {
                return 1;
            } else {
                client.field958.method3096(95);
                client.field958.method2846(1 + class174.method84(var26) + class174.method84(var27));
                client.field958.method2851(var27);
                client.field958.method2851(var26);
                client.field958.method2922(var25);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field1053 = field1327[--Statics.field3751] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cp.t(ILcv;ZI)I")
    public static int method1497(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field1171 == 0) {
                field1327[++Statics.field3751 - 1] = -2;
            } else if (client.field1171 == 1) {
                field1327[++Statics.field3751 - 1] = -1;
            } else {
                field1327[++Statics.field3751 - 1] = client.field1170;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1327[--Statics.field3751];
            if (client.field1171 == 2 && var3 < client.field1170) {
                field1328[++Statics.field1324 - 1] = client.field1172[var3].field805;
                field1328[++Statics.field1324 - 1] = client.field1172[var3].field800;
            } else {
                field1328[++Statics.field1324 - 1] = "";
                field1328[++Statics.field1324 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = field1327[--Statics.field3751];
            if (client.field1171 == 2 && var4 < client.field1170) {
                field1327[++Statics.field3751 - 1] = client.field1172[var4].field801;
            } else {
                field1327[++Statics.field3751 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = field1327[--Statics.field3751];
            if (client.field1171 == 2 && var5 < client.field1170) {
                field1327[++Statics.field3751 - 1] = client.field1172[var5].field802;
            } else {
                field1327[++Statics.field3751 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = field1328[--Statics.field1324];
            int var7 = field1327[--Statics.field3751];
            client.method467(var6, var7);
            return 1;
        } else if (arg0 == 3605) {
            String var8 = field1328[--Statics.field1324];
            client.method462(var8);
            return 1;
        } else if (arg0 == 3606) {
            String var9 = field1328[--Statics.field1324];
            client.method4199(var9);
            return 1;
        } else if (arg0 == 3607) {
            String var10 = field1328[--Statics.field1324];
            client.method11(var10, false);
            return 1;
        } else if (arg0 == 3608) {
            String var11 = field1328[--Statics.field1324];
            if (var11 != null) {
                String var12 = class268.method3629(var11, Statics.field332);
                if (var12 != null) {
                    for (int var13 = 0; var13 < client.field1174; var13++) {
                        class71 var14 = client.field998[var13];
                        String var15 = var14.field846;
                        String var16 = class268.method3629(var15, Statics.field332);
                        if (class278.method934(var11, var12, var15, var16)) {
                            client.field1174--;
                            for (int var17 = var13; var17 < client.field1174; var17++) {
                                client.field998[var17] = client.field998[var17 + 1];
                            }
                            client.field1143 = client.field1090;
                            client.field958.method3096(143);
                            client.field958.method2922(class174.method84(var11));
                            client.field958.method2851(var11);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3609) {
            String var18 = field1328[--Statics.field1324];
            class231[] var19 = class231.method4044();
            for (int var20 = 0; var20 < var19.length; var20++) {
                class231 var21 = var19[var20];
                if (var21.field3147 != -1) {
                    int var23 = var21.field3147;
                    String var24 = "<img=" + var23 + ">";
                    if (var18.startsWith(var24)) {
                        var18 = var18.substring(6 + Integer.toString(var21.field3147).length());
                        break;
                    }
                }
            }
            field1327[++Statics.field3751 - 1] = client.method2617(var18, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field1130 == null) {
                field1328[++Statics.field1324 - 1] = "";
            } else {
                String[] var25 = field1328;
                int var26 = ++Statics.field1324 - 1;
                String var27 = client.field1130;
                String var28 = class269.method2618(class269.method3971(var27));
                if (var28 == null) {
                    var28 = "";
                }
                var25[var26] = var28;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field1130 == null) {
                field1327[++Statics.field3751 - 1] = 0;
            } else {
                field1327[++Statics.field3751 - 1] = Statics.field3260;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var30 = field1327[--Statics.field3751];
            if (client.field1130 == null || var30 >= Statics.field3260) {
                field1328[++Statics.field1324 - 1] = "";
            } else {
                field1328[++Statics.field1324 - 1] = Statics.field632[var30].field906;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var31 = field1327[--Statics.field3751];
            if (client.field1130 == null || var31 >= Statics.field3260) {
                field1327[++Statics.field3751 - 1] = 0;
            } else {
                field1327[++Statics.field3751 - 1] = Statics.field632[var31].field908;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var32 = field1327[--Statics.field3751];
            if (client.field1130 == null || var32 >= Statics.field3260) {
                field1327[++Statics.field3751 - 1] = 0;
            } else {
                field1327[++Statics.field3751 - 1] = Statics.field632[var32].field913;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1327[++Statics.field3751 - 1] = Statics.field373;
            return 1;
        } else if (arg0 == 3617) {
            String var33 = field1328[--Statics.field1324];
            if (Statics.field632 != null) {
                client.field958.method3096(248);
                client.field958.method2922(class174.method84(var33));
                client.field958.method2851(var33);
            }
            return 1;
        } else if (arg0 == 3618) {
            field1327[++Statics.field3751 - 1] = Statics.field1279;
            return 1;
        } else if (arg0 == 3619) {
            String var34 = field1328[--Statics.field1324];
            if (!var34.equals("")) {
                client.field958.method3096(111);
                client.field958.method2922(class174.method84(var34));
                client.field958.method2851(var34);
            }
            return 1;
        } else if (arg0 == 3620) {
            client.field958.method3096(111);
            client.field958.method2922(0);
            return 1;
        } else if (arg0 == 3621) {
            if (client.field1171 == 0) {
                field1327[++Statics.field3751 - 1] = -1;
            } else {
                field1327[++Statics.field3751 - 1] = client.field1174;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var35 = field1327[--Statics.field3751];
            if (client.field1171 == 0 || var35 >= client.field1174) {
                field1328[++Statics.field1324 - 1] = "";
                field1328[++Statics.field1324 - 1] = "";
            } else {
                field1328[++Statics.field1324 - 1] = client.field998[var35].field846;
                field1328[++Statics.field1324 - 1] = client.field998[var35].field845;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var36;
            label257: {
                var36 = field1328[--Statics.field1324];
                String var38 = "<img=0>";
                if (!var36.startsWith(var38)) {
                    String var40 = "<img=1>";
                    if (!var36.startsWith(var40)) {
                        break label257;
                    }
                }
                var36 = var36.substring(7);
            }
            field1327[++Statics.field3751 - 1] = client.method645(var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var41 = field1327[--Statics.field3751];
            if (Statics.field632 == null || var41 >= Statics.field3260 || !Statics.field632[var41].field906.equalsIgnoreCase(Statics.field3110.field884)) {
                field1327[++Statics.field3751 - 1] = 0;
            } else {
                field1327[++Statics.field3751 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field1131 == null) {
                field1328[++Statics.field1324 - 1] = "";
            } else {
                String[] var42 = field1328;
                int var43 = ++Statics.field1324 - 1;
                String var44 = client.field1131;
                String var45 = class269.method2618(class269.method3971(var44));
                if (var45 == null) {
                    var45 = "";
                }
                var42[var43] = var45;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ao.l(ILcv;ZB)I")
    public static int method654(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1327[--Statics.field3751];
            field1327[++Statics.field3751 - 1] = client.field1179[var3].method88();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1327[--Statics.field3751];
            field1327[++Statics.field3751 - 1] = client.field1179[var4].field298;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1327[--Statics.field3751];
            field1327[++Statics.field3751 - 1] = client.field1179[var5].field300;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1327[--Statics.field3751];
            field1327[++Statics.field3751 - 1] = client.field1179[var6].field305;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1327[--Statics.field3751];
            field1327[++Statics.field3751 - 1] = client.field1179[var7].field301;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1327[--Statics.field3751];
            field1327[++Statics.field3751 - 1] = client.field1179[var8].field302;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1327[--Statics.field3751];
            int var10 = client.field1179[var9].method87();
            field1327[++Statics.field3751 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1327[--Statics.field3751];
            int var12 = client.field1179[var11].method87();
            field1327[++Statics.field3751 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1327[--Statics.field3751];
            int var14 = client.field1179[var13].method87();
            field1327[++Statics.field3751 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1327[--Statics.field3751];
            int var16 = client.field1179[var15].method87();
            field1327[++Statics.field3751 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1327[--Statics.field3751] == 1;
            if (Statics.field3252 != null) {
                Statics.field3252.method62(class14.field264, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1327[--Statics.field3751] == 1;
            if (Statics.field3252 != null) {
                Statics.field3252.method62(class14.field266, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field3751 -= 2;
            boolean var19 = field1327[Statics.field3751] == 1;
            boolean var20 = field1327[Statics.field3751 + 1] == 1;
            if (Statics.field3252 != null) {
                Statics.field3252.method62(new class96(var20), var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1327[--Statics.field3751] == 1;
            if (Statics.field3252 != null) {
                Statics.field3252.method62(class14.field265, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1327[--Statics.field3751] == 1;
            if (Statics.field3252 != null) {
                Statics.field3252.method62(class14.field268, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1327[++Statics.field3751 - 1] = Statics.field3252 == null ? 0 : Statics.field3252.field267.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1327[--Statics.field3751];
            class15 var24 = (class15) Statics.field3252.field267.get(var23);
            field1327[++Statics.field3751 - 1] = var24.field279;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1327[--Statics.field3751];
            class15 var26 = (class15) Statics.field3252.field267.get(var25);
            field1328[++Statics.field1324 - 1] = var26.method74();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1327[--Statics.field3751];
            class15 var28 = (class15) Statics.field3252.field267.get(var27);
            field1328[++Statics.field1324 - 1] = var28.method65();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1327[--Statics.field3751];
            class15 var30 = (class15) Statics.field3252.field267.get(var29);
            long var31 = class176.method2679() - Statics.field281 - var30.field276;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1328[++Statics.field1324 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1327[--Statics.field3751];
            class15 var38 = (class15) Statics.field3252.field267.get(var37);
            field1327[++Statics.field3751 - 1] = var38.field277.field305;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1327[--Statics.field3751];
            class15 var40 = (class15) Statics.field3252.field267.get(var39);
            field1327[++Statics.field3751 - 1] = var40.field277.field300;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1327[--Statics.field3751];
            class15 var42 = (class15) Statics.field3252.field267.get(var41);
            field1327[++Statics.field3751 - 1] = var42.field277.field298;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fn.q(ILcv;ZI)I")
    public static int method2822(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field968 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ae.f(ILcv;ZI)I")
    public static int method514(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field251;
            int var4 = (Statics.field3110.field1211 >> 7) + Statics.field329;
            int var5 = (Statics.field3110.field1219 >> 7) + Statics.field2282;
            client.method979().method4913(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1327[--Statics.field3751];
            String var7 = "";
            class33 var8 = client.method979().method4785(var6);
            if (var8 != null) {
                var7 = var8.method252();
            }
            field1328[++Statics.field1324 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1327[--Statics.field3751];
            client.method979().method4770(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1327[++Statics.field3751 - 1] = client.method979().method4782();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1327[--Statics.field3751];
            client.method979().method4779(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1327[++Statics.field3751 - 1] = client.method979().method4780() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class213 var11 = new class213(field1327[--Statics.field3751]);
            client.method979().method4786(var11.field2579, var11.field2578);
            return 1;
        } else if (arg0 == 6607) {
            class213 var12 = new class213(field1327[--Statics.field3751]);
            client.method979().method4881(var12.field2579, var12.field2578);
            return 1;
        } else if (arg0 == 6608) {
            class213 var13 = new class213(field1327[--Statics.field3751]);
            client.method979().method4788(var13.field2580, var13.field2579, var13.field2578);
            return 1;
        } else if (arg0 == 6609) {
            class213 var14 = new class213(field1327[--Statics.field3751]);
            client.method979().method4789(var14.field2580, var14.field2579, var14.field2578);
            return 1;
        } else if (arg0 == 6610) {
            field1327[++Statics.field3751 - 1] = client.method979().method4790();
            field1327[++Statics.field3751 - 1] = client.method979().method4852();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1327[--Statics.field3751];
            class33 var16 = client.method979().method4785(var15);
            if (var16 == null) {
                field1327[++Statics.field3751 - 1] = 0;
            } else {
                field1327[++Statics.field3751 - 1] = var16.method262().method3587();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1327[--Statics.field3751];
            class33 var18 = client.method979().method4785(var17);
            if (var18 == null) {
                field1327[++Statics.field3751 - 1] = 0;
                field1327[++Statics.field3751 - 1] = 0;
            } else {
                field1327[++Statics.field3751 - 1] = (var18.method241() - var18.method255() + 1) * 64;
                field1327[++Statics.field3751 - 1] = (var18.method274() - var18.method258() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1327[--Statics.field3751];
            class33 var20 = client.method979().method4785(var19);
            if (var20 == null) {
                field1327[++Statics.field3751 - 1] = 0;
                field1327[++Statics.field3751 - 1] = 0;
                field1327[++Statics.field3751 - 1] = 0;
                field1327[++Statics.field3751 - 1] = 0;
            } else {
                field1327[++Statics.field3751 - 1] = var20.method255() * 64;
                field1327[++Statics.field3751 - 1] = var20.method258() * 64;
                field1327[++Statics.field3751 - 1] = var20.method241() * 64 + 64 - 1;
                field1327[++Statics.field3751 - 1] = var20.method274() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1327[--Statics.field3751];
            class33 var22 = client.method979().method4785(var21);
            if (var22 == null) {
                field1327[++Statics.field3751 - 1] = -1;
            } else {
                field1327[++Statics.field3751 - 1] = var22.method254();
            }
            return 1;
        } else if (arg0 == 6615) {
            class213 var23 = client.method979().method4783();
            if (var23 == null) {
                field1327[++Statics.field3751 - 1] = -1;
                field1327[++Statics.field3751 - 1] = -1;
            } else {
                field1327[++Statics.field3751 - 1] = var23.field2579;
                field1327[++Statics.field3751 - 1] = var23.field2578;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1327[++Statics.field3751 - 1] = client.method979().method4771();
            return 1;
        } else if (arg0 == 6617) {
            class213 var24 = new class213(field1327[--Statics.field3751]);
            class33 var25 = client.method979().method4772();
            if (var25 == null) {
                field1327[++Statics.field3751 - 1] = -1;
                field1327[++Statics.field3751 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method246(var24.field2580, var24.field2579, var24.field2578);
            if (var26 == null) {
                field1327[++Statics.field3751 - 1] = -1;
                field1327[++Statics.field3751 - 1] = -1;
            } else {
                field1327[++Statics.field3751 - 1] = var26[0];
                field1327[++Statics.field3751 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class213 var27 = new class213(field1327[--Statics.field3751]);
            class33 var28 = client.method979().method4772();
            if (var28 == null) {
                field1327[++Statics.field3751 - 1] = -1;
                field1327[++Statics.field3751 - 1] = -1;
                return 1;
            }
            class213 var29 = var28.method247(var27.field2579, var27.field2578);
            if (var29 == null) {
                field1327[++Statics.field3751 - 1] = -1;
            } else {
                field1327[++Statics.field3751 - 1] = var29.method3587();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field3751 -= 2;
            int var30 = field1327[Statics.field3751];
            class213 var31 = new class213(field1327[Statics.field3751 + 1]);
            class33 var32 = client.method979().method4785(var30);
            int var33 = Statics.field3110.field897;
            int var34 = (Statics.field3110.field1211 >> 7) + Statics.field329;
            int var35 = (Statics.field3110.field1219 >> 7) + Statics.field2282;
            class213 var36 = new class213(var33, var34, var35);
            client.method979().method4775(var32, var36, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field3751 -= 2;
            int var37 = field1327[Statics.field3751];
            class213 var38 = new class213(field1327[Statics.field3751 + 1]);
            method21(var37, var38, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field3751 -= 2;
            int var39 = field1327[Statics.field3751];
            class213 var40 = new class213(field1327[Statics.field3751 + 1]);
            class33 var41 = client.method979().method4785(var39);
            if (var41 == null) {
                field1327[++Statics.field3751 - 1] = 0;
                return 1;
            } else {
                field1327[++Statics.field3751 - 1] = var41.method273(var40.field2580, var40.field2579, var40.field2578) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1327[++Statics.field3751 - 1] = client.method979().method4793();
            field1327[++Statics.field3751 - 1] = client.method979().method4794();
            return 1;
        } else if (arg0 == 6623) {
            class213 var42 = new class213(field1327[--Statics.field3751]);
            class33 var43 = client.method979().method4827(var42.field2580, var42.field2579, var42.field2578);
            if (var43 == null) {
                field1327[++Statics.field3751 - 1] = -1;
            } else {
                field1327[++Statics.field3751 - 1] = var43.method253();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method979().method4787(field1327[--Statics.field3751]);
            return 1;
        } else if (arg0 == 6625) {
            client.method979().method4894();
            return 1;
        } else if (arg0 == 6626) {
            client.method979().method4797(field1327[--Statics.field3751]);
            return 1;
        } else if (arg0 == 6627) {
            client.method979().method4798();
            return 1;
        } else if (arg0 == 6628) {
            boolean var44 = field1327[--Statics.field3751] == 1;
            client.method979().method4799(var44);
            return 1;
        } else if (arg0 == 6629) {
            int var45 = field1327[--Statics.field3751];
            client.method979().method4857(var45);
            return 1;
        } else if (arg0 == 6630) {
            int var46 = field1327[--Statics.field3751];
            client.method979().method4801(var46);
            return 1;
        } else if (arg0 == 6631) {
            client.method979().method4815();
            return 1;
        } else if (arg0 == 6632) {
            boolean var47 = field1327[--Statics.field3751] == 1;
            client.method979().method4803(var47);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field3751 -= 2;
            int var48 = field1327[Statics.field3751];
            boolean var49 = field1327[Statics.field3751 + 1] == 1;
            client.method979().method4804(var48, var49);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field3751 -= 2;
            int var50 = field1327[Statics.field3751];
            boolean var51 = field1327[Statics.field3751 + 1] == 1;
            client.method979().method4805(var50, var51);
            return 1;
        } else if (arg0 == 6635) {
            field1327[++Statics.field3751 - 1] = client.method979().method4768() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var52 = field1327[--Statics.field3751];
            field1327[++Statics.field3751 - 1] = client.method979().method4822(var52) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var53 = field1327[--Statics.field3751];
            field1327[++Statics.field3751 - 1] = client.method979().method4808(var53) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field3751 -= 2;
            int var54 = field1327[Statics.field3751];
            class213 var55 = new class213(field1327[Statics.field3751 + 1]);
            class213 var56 = client.method979().method4906(var54, var55);
            if (var56 == null) {
                field1327[++Statics.field3751 - 1] = -1;
            } else {
                field1327[++Statics.field3751 - 1] = var56.method3587();
            }
            return 1;
        } else if (arg0 == 6639) {
            class40 var57 = client.method979().method4813();
            if (var57 == null) {
                field1327[++Statics.field3751 - 1] = -1;
                field1327[++Statics.field3751 - 1] = -1;
            } else {
                field1327[++Statics.field3751 - 1] = var57.field532;
                field1327[++Statics.field3751 - 1] = var57.field538.method3587();
            }
            return 1;
        } else if (arg0 == 6640) {
            class40 var58 = client.method979().method4814();
            if (var58 == null) {
                field1327[++Statics.field3751 - 1] = -1;
                field1327[++Statics.field3751 - 1] = -1;
            } else {
                field1327[++Statics.field3751 - 1] = var58.field532;
                field1327[++Statics.field3751 - 1] = var58.field538.method3587();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var59 = field1327[--Statics.field3751];
            class243 var60 = Statics.field3266[var59];
            if (var60.field3268 == null) {
                field1328[++Statics.field1324 - 1] = "";
            } else {
                field1328[++Statics.field1324 - 1] = var60.field3268;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var61 = field1327[--Statics.field3751];
            class243 var62 = Statics.field3266[var61];
            field1327[++Statics.field3751 - 1] = var62.field3270;
            return 1;
        } else if (arg0 == 6695) {
            int var63 = field1327[--Statics.field3751];
            class243 var64 = Statics.field3266[var63];
            if (var64 == null) {
                field1327[++Statics.field3751 - 1] = -1;
            } else {
                field1327[++Statics.field3751 - 1] = var64.field3282;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var65 = field1327[--Statics.field3751];
            class243 var66 = Statics.field3266[var65];
            if (var66 == null) {
                field1327[++Statics.field3751 - 1] = -1;
            } else {
                field1327[++Statics.field3751 - 1] = var66.field3275;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1327[++Statics.field3751 - 1] = Statics.field599.field607;
            return 1;
        } else if (arg0 == 6698) {
            field1327[++Statics.field3751 - 1] = Statics.field599.field602.method3587();
            return 1;
        } else if (arg0 == 6699) {
            field1327[++Statics.field3751 - 1] = Statics.field599.field604.method3587();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("s.n(ILhs;ZB)V")
    public static void method21(int arg0, class213 arg1, boolean arg2) {
        class33 var3 = client.method979().method4785(arg0);
        int var4 = Statics.field3110.field897;
        int var5 = (Statics.field3110.field1211 >> 7) + Statics.field329;
        int var6 = (Statics.field3110.field1219 >> 7) + Statics.field2282;
        class213 var7 = new class213(var4, var5, var6);
        client.method979().method4775(var3, var7, arg1, arg2);
    }
}
