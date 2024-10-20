package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cc")
public class class83 {

    @ObfuscatedName("cc.x")
    public static int[] field1259 = new int[5];

    @ObfuscatedName("cc.f")
    public static int[][] field1258 = new int[5][5000];

    @ObfuscatedName("cc.u")
    public static int[] field1269 = new int[1000];

    @ObfuscatedName("cc.k")
    public static String[] field1261 = new String[1000];

    @ObfuscatedName("cc.d")
    public static int field1262 = 0;

    @ObfuscatedName("cc.o")
    public static class63[] field1263 = new class63[50];

    @ObfuscatedName("cc.j")
    public static Calendar field1268 = Calendar.getInstance();

    @ObfuscatedName("cc.m")
    public static final String[] field1264 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cc.c")
    public static int field1267 = 0;

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.b(Lbv;B)V")
    public static void method12(class69 arg0) {
        method3707(arg0, 200000);
    }

    @ObfuscatedName("ha.s(Lbv;II)V")
    public static void method3707(class69 arg0, int arg1) {
        Object[] var2 = arg0.field786;
        class98 var4;
        if (class227.method2704(arg0.field787)) {
            Statics.field343 = (class48) var2[0];
            class250 var3 = Statics.field3346[Statics.field343.field560];
            var4 = class98.method2721(arg0.field787, var3.field3349, var3.field3366);
        } else {
            int var5 = (Integer) var2[0];
            class98 var6 = (class98) class98.field1437.method3330((long) var5);
            class98 var7;
            if (var6 == null) {
                byte[] var8 = Statics.field393.method3887(var5, 0);
                if (var8 == null) {
                    var7 = null;
                } else {
                    class98 var9 = class98.method1686(var8);
                    class98.field1437.method3332(var9, (long) var5);
                    var7 = var9;
                }
            } else {
                var7 = var6;
            }
            var4 = var7;
        }
        if (var4 == null) {
            return;
        }
        Statics.field1260 = 0;
        Statics.field3444 = 0;
        int var10 = -1;
        int[] var11 = var4.field1432;
        int[] var12 = var4.field1435;
        byte var13 = -1;
        field1262 = 0;
        try {
            Statics.field2432 = new int[var4.field1434];
            int var14 = 0;
            Statics.field1256 = new String[var4.field1436];
            int var15 = 0;
            for (int var16 = 1; var16 < var2.length; var16++) {
                if (var2[var16] instanceof Integer) {
                    int var17 = (Integer) var2[var16];
                    if (var17 == -2147483647) {
                        var17 = arg0.field779;
                    }
                    if (var17 == -2147483646) {
                        var17 = arg0.field776;
                    }
                    if (var17 == -2147483645) {
                        var17 = arg0.field778 == null ? -1 : arg0.field778.field2714;
                    }
                    if (var17 == -2147483644) {
                        var17 = arg0.field784;
                    }
                    if (var17 == -2147483643) {
                        var17 = arg0.field778 == null ? -1 : arg0.field778.field2715;
                    }
                    if (var17 == -2147483642) {
                        var17 = arg0.field782 == null ? -1 : arg0.field782.field2714;
                    }
                    if (var17 == -2147483641) {
                        var17 = arg0.field782 == null ? -1 : arg0.field782.field2715;
                    }
                    if (var17 == -2147483640) {
                        var17 = arg0.field783;
                    }
                    if (var17 == -2147483639) {
                        var17 = arg0.field781;
                    }
                    Statics.field2432[var14++] = var17;
                } else if (var2[var16] instanceof String) {
                    String var18 = (String) var2[var16];
                    if (var18.equals("event_opbase")) {
                        var18 = arg0.field785;
                    }
                    Statics.field1256[var15++] = var18;
                }
            }
            int var19 = 0;
            field1267 = arg0.field780;
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
                                                                                                                label2669: while (true) {
                                                                                                                    var19++;
                                                                                                                    if (var19 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var10++;
                                                                                                                    int var490 = var11[var10];
                                                                                                                    if (var490 >= 100) {
                                                                                                                        boolean var68;
                                                                                                                        if (var4.field1435[var10] == 1) {
                                                                                                                            var68 = true;
                                                                                                                        } else {
                                                                                                                            var68 = false;
                                                                                                                        }
                                                                                                                        int var84;
                                                                                                                        if (var490 < 1000) {
                                                                                                                            byte var76;
                                                                                                                            if (var490 == 100) {
                                                                                                                                Statics.field1260 -= 3;
                                                                                                                                int var69 = field1269[Statics.field1260];
                                                                                                                                int var70 = field1269[Statics.field1260 + 1];
                                                                                                                                int var71 = field1269[Statics.field1260 + 2];
                                                                                                                                if (var70 == 0) {
                                                                                                                                    throw new RuntimeException();
                                                                                                                                }
                                                                                                                                class224 var72 = class224.method934(var69);
                                                                                                                                if (var72.field2838 == null) {
                                                                                                                                    var72.field2838 = new class224[var71 + 1];
                                                                                                                                }
                                                                                                                                if (var72.field2838.length <= var71) {
                                                                                                                                    class224[] var73 = new class224[var71 + 1];
                                                                                                                                    for (int var74 = 0; var74 < var72.field2838.length; var74++) {
                                                                                                                                        var73[var74] = var72.field2838[var74];
                                                                                                                                    }
                                                                                                                                    var72.field2838 = var73;
                                                                                                                                }
                                                                                                                                if (var71 > 0 && var72.field2838[var71 - 1] == null) {
                                                                                                                                    throw new RuntimeException("" + (var71 - 1));
                                                                                                                                }
                                                                                                                                class224 var75 = new class224();
                                                                                                                                var75.field2747 = var70;
                                                                                                                                var75.field2733 = var75.field2714 = var72.field2714;
                                                                                                                                var75.field2715 = var71;
                                                                                                                                var75.field2757 = true;
                                                                                                                                var72.field2838[var71] = var75;
                                                                                                                                if (var68) {
                                                                                                                                    Statics.field3211 = var75;
                                                                                                                                } else {
                                                                                                                                    Statics.field1254 = var75;
                                                                                                                                }
                                                                                                                                client.method955(var72);
                                                                                                                                var76 = 1;
                                                                                                                            } else if (var490 == 101) {
                                                                                                                                class224 var77 = var68 ? Statics.field3211 : Statics.field1254;
                                                                                                                                class224 var78 = class224.method934(var77.field2714);
                                                                                                                                var78.field2838[var77.field2715] = null;
                                                                                                                                client.method955(var78);
                                                                                                                                var76 = 1;
                                                                                                                            } else if (var490 == 102) {
                                                                                                                                class224 var79 = class224.method934(field1269[--Statics.field1260]);
                                                                                                                                var79.field2838 = null;
                                                                                                                                client.method955(var79);
                                                                                                                                var76 = 1;
                                                                                                                            } else if (var490 == 200) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var80 = field1269[Statics.field1260];
                                                                                                                                int var81 = field1269[Statics.field1260 + 1];
                                                                                                                                class224 var82 = class224.method2676(var80, var81);
                                                                                                                                if (var82 == null || var81 == -1) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 1;
                                                                                                                                    if (var68) {
                                                                                                                                        Statics.field3211 = var82;
                                                                                                                                    } else {
                                                                                                                                        Statics.field1254 = var82;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var76 = 1;
                                                                                                                            } else if (var490 == 201) {
                                                                                                                                class224 var83 = class224.method934(field1269[--Statics.field1260]);
                                                                                                                                if (var83 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 1;
                                                                                                                                    if (var68) {
                                                                                                                                        Statics.field3211 = var83;
                                                                                                                                    } else {
                                                                                                                                        Statics.field1254 = var83;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var76 = 1;
                                                                                                                            } else {
                                                                                                                                var76 = 2;
                                                                                                                            }
                                                                                                                            var84 = var76;
                                                                                                                        } else if (var490 < 1100) {
                                                                                                                            var84 = method2727(var490, var4, var68);
                                                                                                                        } else if (var490 < 1200) {
                                                                                                                            var84 = method221(var490, var4, var68);
                                                                                                                        } else if (var490 < 1300) {
                                                                                                                            var84 = method597(var490, var4, var68);
                                                                                                                        } else if (var490 < 1400) {
                                                                                                                            var84 = method2854(var490, var4, var68);
                                                                                                                        } else if (var490 < 1500) {
                                                                                                                            var84 = method558(var490, var4, var68);
                                                                                                                        } else if (var490 < 1600) {
                                                                                                                            class224 var88 = var68 ? Statics.field3211 : Statics.field1254;
                                                                                                                            byte var89;
                                                                                                                            if (var490 == 1500) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var88.field2727;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var490 == 1501) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var88.field2728;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var490 == 1502) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var88.field2729;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var490 == 1503) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var88.field2834;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var490 == 1504) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var88.field2734 ? 1 : 0;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var490 == 1505) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var88.field2733;
                                                                                                                                var89 = 1;
                                                                                                                            } else {
                                                                                                                                var89 = 2;
                                                                                                                            }
                                                                                                                            var84 = var89;
                                                                                                                        } else if (var490 < 1700) {
                                                                                                                            class224 var90 = var68 ? Statics.field3211 : Statics.field1254;
                                                                                                                            byte var91;
                                                                                                                            if (var490 == 1600) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2735;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1601) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2759;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1602) {
                                                                                                                                field1261[++Statics.field3444 - 1] = var90.field2774;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1603) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2804;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1604) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2766;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1605) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2768;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1606) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2765;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1607) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2711;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1608) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2716;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1609) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2745;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1610) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2746;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1611) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2739;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1612) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2835;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var490 == 1613) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var90.field2744.method8();
                                                                                                                                var91 = 1;
                                                                                                                            } else {
                                                                                                                                var91 = 2;
                                                                                                                            }
                                                                                                                            var84 = var91;
                                                                                                                        } else if (var490 < 1800) {
                                                                                                                            class224 var95 = var68 ? Statics.field3211 : Statics.field1254;
                                                                                                                            byte var96;
                                                                                                                            if (var490 == 1700) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var95.field2717;
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var490 == 1701) {
                                                                                                                                if (var95.field2717 == -1) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var95.field2780;
                                                                                                                                }
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var490 == 1702) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var95.field2715;
                                                                                                                                var96 = 1;
                                                                                                                            } else {
                                                                                                                                var96 = 2;
                                                                                                                            }
                                                                                                                            var84 = var96;
                                                                                                                        } else if (var490 < 1900) {
                                                                                                                            class224 var97 = var68 ? Statics.field3211 : Statics.field1254;
                                                                                                                            byte var102;
                                                                                                                            if (var490 == 1800) {
                                                                                                                                int[] var98 = field1269;
                                                                                                                                int var99 = ++Statics.field1260 - 1;
                                                                                                                                int var100 = client.method57(var97);
                                                                                                                                int var101 = var100 >> 11 & 0x3F;
                                                                                                                                var98[var99] = var101;
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var490 == 1801) {
                                                                                                                                int var103 = field1269[--Statics.field1260];
                                                                                                                                int var491 = var103 - 1;
                                                                                                                                if (var97.field2810 == null || var491 >= var97.field2810.length || var97.field2810[var491] == null) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1261[++Statics.field3444 - 1] = var97.field2810[var491];
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var490 == 1802) {
                                                                                                                                if (var97.field2787 == null) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1261[++Statics.field3444 - 1] = var97.field2787;
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else {
                                                                                                                                var102 = 2;
                                                                                                                            }
                                                                                                                            var84 = var102;
                                                                                                                        } else if (var490 < 2000) {
                                                                                                                            var84 = method1961(var490, var4, var68);
                                                                                                                        } else if (var490 < 2100) {
                                                                                                                            var84 = method2727(var490, var4, var68);
                                                                                                                        } else if (var490 < 2200) {
                                                                                                                            var84 = method221(var490, var4, var68);
                                                                                                                        } else if (var490 < 2300) {
                                                                                                                            var84 = method597(var490, var4, var68);
                                                                                                                        } else if (var490 < 2400) {
                                                                                                                            var84 = method2854(var490, var4, var68);
                                                                                                                        } else if (var490 < 2500) {
                                                                                                                            var84 = method558(var490, var4, var68);
                                                                                                                        } else if (var490 < 2600) {
                                                                                                                            var84 = method1543(var490, var4, var68);
                                                                                                                        } else if (var490 < 2700) {
                                                                                                                            class224 var104 = class224.method934(field1269[--Statics.field1260]);
                                                                                                                            byte var105;
                                                                                                                            if (var490 == 2600) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2735;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2601) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2759;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2602) {
                                                                                                                                field1261[++Statics.field3444 - 1] = var104.field2774;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2603) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2804;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2604) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2766;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2605) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2768;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2606) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2765;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2607) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2711;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2608) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2716;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2609) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2745;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2610) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2746;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2611) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2739;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2612) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2835;
                                                                                                                                var105 = 1;
                                                                                                                            } else if (var490 == 2613) {
                                                                                                                                field1269[++Statics.field1260 - 1] = var104.field2744.method8();
                                                                                                                                var105 = 1;
                                                                                                                            } else {
                                                                                                                                var105 = 2;
                                                                                                                            }
                                                                                                                            var84 = var105;
                                                                                                                        } else if (var490 < 2800) {
                                                                                                                            byte var107;
                                                                                                                            if (var490 == 2700) {
                                                                                                                                class224 var106 = class224.method934(field1269[--Statics.field1260]);
                                                                                                                                field1269[++Statics.field1260 - 1] = var106.field2717;
                                                                                                                                var107 = 1;
                                                                                                                            } else if (var490 == 2701) {
                                                                                                                                class224 var108 = class224.method934(field1269[--Statics.field1260]);
                                                                                                                                if (var108.field2717 == -1) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var108.field2780;
                                                                                                                                }
                                                                                                                                var107 = 1;
                                                                                                                            } else if (var490 == 2702) {
                                                                                                                                int var109 = field1269[--Statics.field1260];
                                                                                                                                class68 var110 = (class68) client.field1009.method3340((long) var109);
                                                                                                                                if (var110 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 1;
                                                                                                                                }
                                                                                                                                var107 = 1;
                                                                                                                            } else if (var490 == 2706) {
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1008;
                                                                                                                                var107 = 1;
                                                                                                                            } else {
                                                                                                                                var107 = 2;
                                                                                                                            }
                                                                                                                            var84 = var107;
                                                                                                                        } else if (var490 < 2900) {
                                                                                                                            class224 var111 = class224.method934(field1269[--Statics.field1260]);
                                                                                                                            byte var116;
                                                                                                                            if (var490 == 2800) {
                                                                                                                                int[] var112 = field1269;
                                                                                                                                int var113 = ++Statics.field1260 - 1;
                                                                                                                                int var114 = client.method57(var111);
                                                                                                                                int var115 = var114 >> 11 & 0x3F;
                                                                                                                                var112[var113] = var115;
                                                                                                                                var116 = 1;
                                                                                                                            } else if (var490 == 2801) {
                                                                                                                                int var117 = field1269[--Statics.field1260];
                                                                                                                                int var492 = var117 - 1;
                                                                                                                                if (var111.field2810 == null || var492 >= var111.field2810.length || var111.field2810[var492] == null) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1261[++Statics.field3444 - 1] = var111.field2810[var492];
                                                                                                                                }
                                                                                                                                var116 = 1;
                                                                                                                            } else if (var490 == 2802) {
                                                                                                                                if (var111.field2787 == null) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1261[++Statics.field3444 - 1] = var111.field2787;
                                                                                                                                }
                                                                                                                                var116 = 1;
                                                                                                                            } else {
                                                                                                                                var116 = 2;
                                                                                                                            }
                                                                                                                            var84 = var116;
                                                                                                                        } else if (var490 < 3000) {
                                                                                                                            var84 = method1961(var490, var4, var68);
                                                                                                                        } else if (var490 < 3200) {
                                                                                                                            byte var119;
                                                                                                                            if (var490 == 3100) {
                                                                                                                                String var118 = field1261[--Statics.field3444];
                                                                                                                                class97.method4(0, "", var118);
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3101) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                client.method962(Statics.field3721, field1269[Statics.field1260], field1269[Statics.field1260 + 1]);
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3103) {
                                                                                                                                client.method462();
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3104) {
                                                                                                                                String var120 = field1261[--Statics.field3444];
                                                                                                                                int var121 = 0;
                                                                                                                                if (class278.method2672(var120)) {
                                                                                                                                    int var122 = class278.method913(var120, 10, true);
                                                                                                                                    var121 = var122;
                                                                                                                                }
                                                                                                                                class171 var123 = class171.method124(class168.field2376, client.field906.field1461);
                                                                                                                                var123.field2423.method2977(var121);
                                                                                                                                client.field906.method1715(var123);
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3105) {
                                                                                                                                String var124 = field1261[--Statics.field3444];
                                                                                                                                class171 var125 = class171.method124(class168.field2315, client.field906.field1461);
                                                                                                                                var125.field2423.method2929(var124.length() + 1);
                                                                                                                                var125.field2423.method2936(var124);
                                                                                                                                client.field906.method1715(var125);
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3106) {
                                                                                                                                String var126 = field1261[--Statics.field3444];
                                                                                                                                class171 var127 = class171.method124(class168.field2357, client.field906.field1461);
                                                                                                                                var127.field2423.method2929(var126.length() + 1);
                                                                                                                                var127.field2423.method2936(var126);
                                                                                                                                client.field906.method1715(var127);
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3107) {
                                                                                                                                int var128 = field1269[--Statics.field1260];
                                                                                                                                String var129 = field1261[--Statics.field3444];
                                                                                                                                int var130 = class95.field1401;
                                                                                                                                int[] var131 = class95.field1402;
                                                                                                                                boolean var132 = false;
                                                                                                                                for (int var133 = 0; var133 < var130; var133++) {
                                                                                                                                    class74 var134 = client.field1098[var131[var133]];
                                                                                                                                    if (var134 != null && Statics.field3721 != var134 && var134.field823 != null && var134.field823.equalsIgnoreCase(var129)) {
                                                                                                                                        if (var128 == 1) {
                                                                                                                                            class171 var135 = class171.method124(class168.field2351, client.field906.field1461);
                                                                                                                                            var135.field2423.method2979(0);
                                                                                                                                            var135.field2423.method3129(var131[var133]);
                                                                                                                                            client.field906.method1715(var135);
                                                                                                                                        } else if (var128 == 4) {
                                                                                                                                            class171 var136 = class171.method124(class168.field2299, client.field906.field1461);
                                                                                                                                            var136.field2423.method2979(0);
                                                                                                                                            var136.field2423.method3129(var131[var133]);
                                                                                                                                            client.field906.method1715(var136);
                                                                                                                                        } else if (var128 == 6) {
                                                                                                                                            class171 var137 = class171.method124(class168.field2307, client.field906.field1461);
                                                                                                                                            var137.field2423.method2930(var131[var133]);
                                                                                                                                            var137.field2423.method2929(0);
                                                                                                                                            client.field906.method1715(var137);
                                                                                                                                        } else if (var128 == 7) {
                                                                                                                                            class171 var138 = class171.method124(class168.field2385, client.field906.field1461);
                                                                                                                                            var138.field2423.method2929(0);
                                                                                                                                            var138.field2423.method3129(var131[var133]);
                                                                                                                                            client.field906.method1715(var138);
                                                                                                                                        }
                                                                                                                                        var132 = true;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (!var132) {
                                                                                                                                    class97.method4(4, "", class233.field3000 + var129);
                                                                                                                                }
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3108) {
                                                                                                                                Statics.field1260 -= 3;
                                                                                                                                int var139 = field1269[Statics.field1260];
                                                                                                                                int var140 = field1269[Statics.field1260 + 1];
                                                                                                                                int var141 = field1269[Statics.field1260 + 2];
                                                                                                                                class224 var142 = class224.method934(var141);
                                                                                                                                client.method530(var142, var139, var140);
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3109) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var143 = field1269[Statics.field1260];
                                                                                                                                int var144 = field1269[Statics.field1260 + 1];
                                                                                                                                class224 var145 = var68 ? Statics.field3211 : Statics.field1254;
                                                                                                                                client.method530(var145, var143, var144);
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3110) {
                                                                                                                                Statics.field2143 = field1269[--Statics.field1260] == 1;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3111) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.field801.field1235 ? 1 : 0;
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3112) {
                                                                                                                                Statics.field801.field1235 = field1269[--Statics.field1260] == 1;
                                                                                                                                class81.method842();
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3113) {
                                                                                                                                String var146 = field1261[--Statics.field3444];
                                                                                                                                boolean var147 = field1269[--Statics.field1260] == 1;
                                                                                                                                if (var147) {
                                                                                                                                    label2571: {
                                                                                                                                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                                                                                                                            try {
                                                                                                                                                Desktop.getDesktop().browse(new URI(var146));
                                                                                                                                                break label2571;
                                                                                                                                            } catch (Exception var488) {
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (class57.field630.startsWith("win")) {
                                                                                                                                            class57.method1447(var146, 0);
                                                                                                                                        } else if (class57.field630.startsWith("mac")) {
                                                                                                                                            class57.method917(var146, 1, "openjs");
                                                                                                                                        } else {
                                                                                                                                            class57.method1447(var146, 2);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    class57.method1447(var146, 3);
                                                                                                                                }
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3115) {
                                                                                                                                int var149 = field1269[--Statics.field1260];
                                                                                                                                class171 var150 = class171.method124(class168.field2316, client.field906.field1461);
                                                                                                                                var150.field2423.method2930(var149);
                                                                                                                                client.field906.method1715(var150);
                                                                                                                                var119 = 1;
                                                                                                                            } else if (var490 == 3116) {
                                                                                                                                int var151 = field1269[--Statics.field1260];
                                                                                                                                Statics.field3444 -= 2;
                                                                                                                                String var152 = field1261[Statics.field3444];
                                                                                                                                String var153 = field1261[Statics.field3444 + 1];
                                                                                                                                if (var152.length() > 500) {
                                                                                                                                    var119 = 1;
                                                                                                                                } else if (var153.length() > 500) {
                                                                                                                                    var119 = 1;
                                                                                                                                } else {
                                                                                                                                    class171 var154 = class171.method124(class168.field2312, client.field906.field1461);
                                                                                                                                    var154.field2423.method2930(1 + class181.method157(var152) + class181.method157(var153));
                                                                                                                                    var154.field2423.method2936(var153);
                                                                                                                                    var154.field2423.method2936(var152);
                                                                                                                                    var154.field2423.method2971(var151);
                                                                                                                                    client.field906.method1715(var154);
                                                                                                                                    var119 = 1;
                                                                                                                                }
                                                                                                                            } else if (var490 == 3117) {
                                                                                                                                client.field996 = field1269[--Statics.field1260] == 1;
                                                                                                                                var119 = 1;
                                                                                                                            } else {
                                                                                                                                var119 = 2;
                                                                                                                            }
                                                                                                                            var84 = var119;
                                                                                                                        } else if (var490 < 3300) {
                                                                                                                            var84 = method50(var490, var4, var68);
                                                                                                                        } else if (var490 < 3400) {
                                                                                                                            var84 = method2216(var490, var4, var68);
                                                                                                                        } else if (var490 < 3500) {
                                                                                                                            byte var163;
                                                                                                                            if (var490 == 3400) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var155 = field1269[Statics.field1260];
                                                                                                                                int var156 = field1269[Statics.field1260 + 1];
                                                                                                                                class261 var157 = (class261) class261.field3457.method3330((long) var155);
                                                                                                                                class261 var158;
                                                                                                                                if (var157 == null) {
                                                                                                                                    byte[] var159 = Statics.field3454.method3887(8, var155);
                                                                                                                                    class261 var160 = new class261();
                                                                                                                                    if (var159 != null) {
                                                                                                                                        var160.method4167(new class181(var159));
                                                                                                                                    }
                                                                                                                                    class261.field3457.method3332(var160, (long) var155);
                                                                                                                                    var158 = var160;
                                                                                                                                } else {
                                                                                                                                    var158 = var157;
                                                                                                                                }
                                                                                                                                class261 var161 = var158;
                                                                                                                                if (var158.field3460 != 's') {
                                                                                                                                }
                                                                                                                                for (int var162 = 0; var162 < var161.field3455; var162++) {
                                                                                                                                    if (var161.field3456[var162] == var156) {
                                                                                                                                        field1261[++Statics.field3444 - 1] = var161.field3458[var162];
                                                                                                                                        var161 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var161 != null) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = var161.field3453;
                                                                                                                                }
                                                                                                                                var163 = 1;
                                                                                                                            } else if (var490 == 3408) {
                                                                                                                                Statics.field1260 -= 4;
                                                                                                                                int var164 = field1269[Statics.field1260];
                                                                                                                                int var165 = field1269[Statics.field1260 + 1];
                                                                                                                                int var166 = field1269[Statics.field1260 + 2];
                                                                                                                                int var167 = field1269[Statics.field1260 + 3];
                                                                                                                                class261 var168 = (class261) class261.field3457.method3330((long) var166);
                                                                                                                                class261 var169;
                                                                                                                                if (var168 == null) {
                                                                                                                                    byte[] var170 = Statics.field3454.method3887(8, var166);
                                                                                                                                    class261 var171 = new class261();
                                                                                                                                    if (var170 != null) {
                                                                                                                                        var171.method4167(new class181(var170));
                                                                                                                                    }
                                                                                                                                    class261.field3457.method3332(var171, (long) var166);
                                                                                                                                    var169 = var171;
                                                                                                                                } else {
                                                                                                                                    var169 = var168;
                                                                                                                                }
                                                                                                                                class261 var172 = var169;
                                                                                                                                if (var169.field3451 == var164 && var169.field3460 == var165) {
                                                                                                                                    for (int var173 = 0; var173 < var172.field3455; var173++) {
                                                                                                                                        if (var172.field3456[var173] == var167) {
                                                                                                                                            if (var165 == 115) {
                                                                                                                                                field1261[++Statics.field3444 - 1] = var172.field3458[var173];
                                                                                                                                            } else {
                                                                                                                                                field1269[++Statics.field1260 - 1] = var172.field3452[var173];
                                                                                                                                            }
                                                                                                                                            var172 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var172 != null) {
                                                                                                                                        if (var165 == 115) {
                                                                                                                                            field1261[++Statics.field3444 - 1] = var172.field3453;
                                                                                                                                        } else {
                                                                                                                                            field1269[++Statics.field1260 - 1] = var172.field3450;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var163 = 1;
                                                                                                                                } else {
                                                                                                                                    if (var165 == 115) {
                                                                                                                                        field1261[++Statics.field3444 - 1] = "null";
                                                                                                                                    } else {
                                                                                                                                        field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                    }
                                                                                                                                    var163 = 1;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var163 = 2;
                                                                                                                            }
                                                                                                                            var84 = var163;
                                                                                                                        } else if (var490 < 3700) {
                                                                                                                            byte var174;
                                                                                                                            if (var490 == 3600) {
                                                                                                                                if (client.field1115 == 0) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -2;
                                                                                                                                } else if (client.field1115 == 1) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = client.field1114;
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3601) {
                                                                                                                                int var175 = field1269[--Statics.field1260];
                                                                                                                                if (client.field1115 == 2 && var175 < client.field1114) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = client.field1116[var175].field755;
                                                                                                                                    field1261[++Statics.field3444 - 1] = client.field1116[var175].field754;
                                                                                                                                } else {
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3602) {
                                                                                                                                int var176 = field1269[--Statics.field1260];
                                                                                                                                if (client.field1115 == 2 && var176 < client.field1114) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = client.field1116[var176].field757;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3603) {
                                                                                                                                int var177 = field1269[--Statics.field1260];
                                                                                                                                if (client.field1115 == 2 && var177 < client.field1114) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = client.field1116[var177].field753;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3604) {
                                                                                                                                String var178 = field1261[--Statics.field3444];
                                                                                                                                int var179 = field1269[--Statics.field1260];
                                                                                                                                client.method53(var178, var179);
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3605) {
                                                                                                                                String var180 = field1261[--Statics.field3444];
                                                                                                                                if (var180 != null) {
                                                                                                                                    if ((client.field1114 < 200 || client.field970 == 1) && client.field1114 < 400) {
                                                                                                                                        String var181 = Statics.method3795(var180, Statics.field2530);
                                                                                                                                        if (var181 != null) {
                                                                                                                                            int var182 = 0;
                                                                                                                                            label2319: while (true) {
                                                                                                                                                if (var182 >= client.field1114) {
                                                                                                                                                    for (int var186 = 0; var186 < client.field1118; var186++) {
                                                                                                                                                        class70 var187 = client.field1119[var186];
                                                                                                                                                        String var188 = Statics.method3795(var187.field793, Statics.field2530);
                                                                                                                                                        if (var188 != null && var188.equals(var181)) {
                                                                                                                                                            class97.method4(30, "", class233.field3017 + var180 + class233.field3016);
                                                                                                                                                            break label2319;
                                                                                                                                                        }
                                                                                                                                                        if (var187.field790 != null) {
                                                                                                                                                            String var189 = Statics.method3795(var187.field790, Statics.field2530);
                                                                                                                                                            if (var189 != null && var189.equals(var181)) {
                                                                                                                                                                class97.method4(30, "", class233.field3017 + var180 + class233.field3016);
                                                                                                                                                                break label2319;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (Statics.method3795(Statics.field3721.field823, Statics.field2530).equals(var181)) {
                                                                                                                                                        class97.method4(30, "", class233.field3154);
                                                                                                                                                    } else {
                                                                                                                                                        class171 var190 = class171.method124(class168.field2347, client.field906.field1461);
                                                                                                                                                        var190.field2423.method2929(class181.method157(var180));
                                                                                                                                                        var190.field2423.method2936(var180);
                                                                                                                                                        client.field906.method1715(var190);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                class66 var183 = client.field1116[var182];
                                                                                                                                                String var184 = Statics.method3795(var183.field755, Statics.field2530);
                                                                                                                                                if (var184 != null && var184.equals(var181)) {
                                                                                                                                                    class97.method4(30, "", var180 + class233.field3084);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                if (var183.field754 != null) {
                                                                                                                                                    String var185 = Statics.method3795(var183.field754, Statics.field2530);
                                                                                                                                                    if (var185 != null && var185.equals(var181)) {
                                                                                                                                                        class97.method4(30, "", var180 + class233.field3084);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var182++;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        class97.method4(30, "", class233.field3083);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3606) {
                                                                                                                                String var191 = field1261[--Statics.field3444];
                                                                                                                                if (var191 != null) {
                                                                                                                                    String var192 = Statics.method3795(var191, Statics.field2530);
                                                                                                                                    if (var192 != null) {
                                                                                                                                        for (int var193 = 0; var193 < client.field1114; var193++) {
                                                                                                                                            class66 var194 = client.field1116[var193];
                                                                                                                                            String var195 = var194.field755;
                                                                                                                                            String var196 = Statics.method3795(var195, Statics.field2530);
                                                                                                                                            boolean var197;
                                                                                                                                            if (var191 == null || var195 == null) {
                                                                                                                                                var197 = false;
                                                                                                                                            } else if (var191.startsWith("#") || var195.startsWith("#")) {
                                                                                                                                                var197 = var191.equals(var195);
                                                                                                                                            } else {
                                                                                                                                                var197 = var192.equals(var196);
                                                                                                                                            }
                                                                                                                                            if (var197) {
                                                                                                                                                client.field1114--;
                                                                                                                                                for (int var198 = var193; var198 < client.field1114; var198++) {
                                                                                                                                                    client.field1116[var198] = client.field1116[var198 + 1];
                                                                                                                                                }
                                                                                                                                                client.field1041 = client.field1033;
                                                                                                                                                class171 var199 = class171.method124(class168.field2380, client.field906.field1461);
                                                                                                                                                var199.field2423.method2929(class181.method157(var191));
                                                                                                                                                var199.field2423.method2936(var191);
                                                                                                                                                client.field906.method1715(var199);
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3607) {
                                                                                                                                String var200 = field1261[--Statics.field3444];
                                                                                                                                if (var200 != null) {
                                                                                                                                    if ((client.field1118 < 100 || client.field970 == 1) && client.field1118 < 400) {
                                                                                                                                        String var201 = Statics.method3795(var200, Statics.field2530);
                                                                                                                                        if (var201 != null) {
                                                                                                                                            int var202 = 0;
                                                                                                                                            label2381: while (true) {
                                                                                                                                                if (var202 >= client.field1118) {
                                                                                                                                                    for (int var206 = 0; var206 < client.field1114; var206++) {
                                                                                                                                                        class66 var207 = client.field1116[var206];
                                                                                                                                                        String var208 = Statics.method3795(var207.field755, Statics.field2530);
                                                                                                                                                        if (var208 != null && var208.equals(var201)) {
                                                                                                                                                            class97.method4(31, "", class233.field3005 + var200 + class233.field3092);
                                                                                                                                                            break label2381;
                                                                                                                                                        }
                                                                                                                                                        if (var207.field754 != null) {
                                                                                                                                                            String var209 = Statics.method3795(var207.field754, Statics.field2530);
                                                                                                                                                            if (var209 != null && var209.equals(var201)) {
                                                                                                                                                                class97.method4(31, "", class233.field3005 + var200 + class233.field3092);
                                                                                                                                                                break label2381;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (Statics.method3795(Statics.field3721.field823, Statics.field2530).equals(var201)) {
                                                                                                                                                        class97.method4(31, "", class233.field3106);
                                                                                                                                                    } else {
                                                                                                                                                        class171 var210 = class171.method124(class168.field2332, client.field906.field1461);
                                                                                                                                                        var210.field2423.method2929(class181.method157(var200));
                                                                                                                                                        var210.field2423.method2936(var200);
                                                                                                                                                        client.field906.method1715(var210);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                class70 var203 = client.field1119[var202];
                                                                                                                                                String var204 = Statics.method3795(var203.field793, Statics.field2530);
                                                                                                                                                if (var204 != null && var204.equals(var201)) {
                                                                                                                                                    class97.method4(31, "", var200 + class233.field3086);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                if (var203.field790 != null) {
                                                                                                                                                    String var205 = Statics.method3795(var203.field790, Statics.field2530);
                                                                                                                                                    if (var205 != null && var205.equals(var201)) {
                                                                                                                                                        class97.method4(31, "", var200 + class233.field3086);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var202++;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        class97.method4(31, "", class233.field3085);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3608) {
                                                                                                                                String var211 = field1261[--Statics.field3444];
                                                                                                                                client.method4439(var211);
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3609) {
                                                                                                                                String var212 = field1261[--Statics.field3444];
                                                                                                                                class238[] var213 = new class238[] { class238.field3238, class238.field3236, class238.field3235, class238.field3234, class238.field3241, class238.field3233 };
                                                                                                                                class238[] var214 = var213;
                                                                                                                                for (int var215 = 0; var215 < var214.length; var215++) {
                                                                                                                                    class238 var216 = var214[var215];
                                                                                                                                    if (var216.field3239 != -1 && var212.startsWith(class88.method1379(var216.field3239))) {
                                                                                                                                        var212 = var212.substring(6 + Integer.toString(var216.field3239).length());
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1269[++Statics.field1260 - 1] = client.method1520(var212, false) ? 1 : 0;
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3611) {
                                                                                                                                if (client.field962 == null) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    String[] var217 = field1261;
                                                                                                                                    int var218 = ++Statics.field3444 - 1;
                                                                                                                                    String var219 = client.field962;
                                                                                                                                    long var220 = 0L;
                                                                                                                                    int var222 = var219.length();
                                                                                                                                    for (int var223 = 0; var223 < var222; var223++) {
                                                                                                                                        var220 *= 37L;
                                                                                                                                        char var224 = var219.charAt(var223);
                                                                                                                                        if (var224 >= 'A' && var224 <= 'Z') {
                                                                                                                                            var220 += (long) (var224 + 1 - 65);
                                                                                                                                        } else if (var224 >= 'a' && var224 <= 'z') {
                                                                                                                                            var220 += (long) (var224 + 1 - 97);
                                                                                                                                        } else if (var224 >= '0' && var224 <= '9') {
                                                                                                                                            var220 += (long) (var224 + 27 - 48);
                                                                                                                                        }
                                                                                                                                        if (var220 >= 177917621779460413L) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    while (var220 % 37L == 0L && var220 != 0L) {
                                                                                                                                        var220 /= 37L;
                                                                                                                                    }
                                                                                                                                    String var227 = class276.method4014(var220);
                                                                                                                                    if (var227 == null) {
                                                                                                                                        var227 = "";
                                                                                                                                    }
                                                                                                                                    var217[var218] = var227;
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3612) {
                                                                                                                                if (client.field962 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = Statics.field451;
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3613) {
                                                                                                                                int var229 = field1269[--Statics.field1260];
                                                                                                                                if (client.field962 == null || var229 >= Statics.field451) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1261[++Statics.field3444 - 1] = Statics.field1420[var229].field853;
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3614) {
                                                                                                                                int var230 = field1269[--Statics.field1260];
                                                                                                                                if (client.field962 == null || var230 >= Statics.field451) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = Statics.field1420[var230].field852;
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3615) {
                                                                                                                                int var231 = field1269[--Statics.field1260];
                                                                                                                                if (client.field962 == null || var231 >= Statics.field451) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = Statics.field1420[var231].field850;
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3616) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.field518;
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3617) {
                                                                                                                                String var232 = field1261[--Statics.field3444];
                                                                                                                                if (Statics.field1420 != null) {
                                                                                                                                    class171 var233 = class171.method124(class168.field2320, client.field906.field1461);
                                                                                                                                    var233.field2423.method2929(class181.method157(var232));
                                                                                                                                    var233.field2423.method2936(var232);
                                                                                                                                    client.field906.method1715(var233);
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3618) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.field1584;
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3619) {
                                                                                                                                String var234 = field1261[--Statics.field3444];
                                                                                                                                if (!var234.equals("")) {
                                                                                                                                    class171 var235 = class171.method124(class168.field2330, client.field906.field1461);
                                                                                                                                    var235.field2423.method2929(class181.method157(var234));
                                                                                                                                    var235.field2423.method2936(var234);
                                                                                                                                    client.field906.method1715(var235);
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3620) {
                                                                                                                                client.method3162();
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3621) {
                                                                                                                                if (client.field1115 == 0) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = client.field1118;
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3622) {
                                                                                                                                int var236 = field1269[--Statics.field1260];
                                                                                                                                if (client.field1115 == 0 || var236 >= client.field1118) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1261[++Statics.field3444 - 1] = client.field1119[var236].field793;
                                                                                                                                    field1261[++Statics.field3444 - 1] = client.field1119[var236].field790;
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3623) {
                                                                                                                                String var237 = field1261[--Statics.field3444];
                                                                                                                                if (var237.startsWith(class88.method1379(0)) || var237.startsWith(class88.method1379(1))) {
                                                                                                                                    var237 = var237.substring(7);
                                                                                                                                }
                                                                                                                                field1269[++Statics.field1260 - 1] = client.method72(var237) ? 1 : 0;
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3624) {
                                                                                                                                int var238 = field1269[--Statics.field1260];
                                                                                                                                if (Statics.field1420 == null || var238 >= Statics.field451 || !Statics.field1420[var238].field853.equalsIgnoreCase(Statics.field3721.field823)) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 1;
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else if (var490 == 3625) {
                                                                                                                                if (client.field1074 == null) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    String[] var239 = field1261;
                                                                                                                                    int var240 = ++Statics.field3444 - 1;
                                                                                                                                    String var241 = client.field1074;
                                                                                                                                    long var242 = 0L;
                                                                                                                                    int var244 = var241.length();
                                                                                                                                    for (int var245 = 0; var245 < var244; var245++) {
                                                                                                                                        var242 *= 37L;
                                                                                                                                        char var246 = var241.charAt(var245);
                                                                                                                                        if (var246 >= 'A' && var246 <= 'Z') {
                                                                                                                                            var242 += (long) (var246 + 1 - 65);
                                                                                                                                        } else if (var246 >= 'a' && var246 <= 'z') {
                                                                                                                                            var242 += (long) (var246 + 1 - 97);
                                                                                                                                        } else if (var246 >= '0' && var246 <= '9') {
                                                                                                                                            var242 += (long) (var246 + 27 - 48);
                                                                                                                                        }
                                                                                                                                        if (var242 >= 177917621779460413L) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    while (var242 % 37L == 0L && var242 != 0L) {
                                                                                                                                        var242 /= 37L;
                                                                                                                                    }
                                                                                                                                    String var249 = class276.method4014(var242);
                                                                                                                                    if (var249 == null) {
                                                                                                                                        var249 = "";
                                                                                                                                    }
                                                                                                                                    var239[var240] = var249;
                                                                                                                                }
                                                                                                                                var174 = 1;
                                                                                                                            } else {
                                                                                                                                var174 = 2;
                                                                                                                            }
                                                                                                                            var84 = var174;
                                                                                                                        } else if (var490 < 4000) {
                                                                                                                            byte var252;
                                                                                                                            if (var490 == 3903) {
                                                                                                                                int var251 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1123[var251].method92();
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3904) {
                                                                                                                                int var253 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1123[var253].field282;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3905) {
                                                                                                                                int var254 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1123[var254].field283;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3906) {
                                                                                                                                int var255 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1123[var255].field284;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3907) {
                                                                                                                                int var256 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1123[var256].field281;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3908) {
                                                                                                                                int var257 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1123[var257].field286;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3910) {
                                                                                                                                int var258 = field1269[--Statics.field1260];
                                                                                                                                int var259 = client.field1123[var258].method91();
                                                                                                                                field1269[++Statics.field1260 - 1] = var259 == 0 ? 1 : 0;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3911) {
                                                                                                                                int var260 = field1269[--Statics.field1260];
                                                                                                                                int var261 = client.field1123[var260].method91();
                                                                                                                                field1269[++Statics.field1260 - 1] = var261 == 2 ? 1 : 0;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3912) {
                                                                                                                                int var262 = field1269[--Statics.field1260];
                                                                                                                                int var263 = client.field1123[var262].method91();
                                                                                                                                field1269[++Statics.field1260 - 1] = var263 == 5 ? 1 : 0;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3913) {
                                                                                                                                int var264 = field1269[--Statics.field1260];
                                                                                                                                int var265 = client.field1123[var264].method91();
                                                                                                                                field1269[++Statics.field1260 - 1] = var265 == 1 ? 1 : 0;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3914) {
                                                                                                                                boolean var266 = field1269[--Statics.field1260] == 1;
                                                                                                                                if (Statics.field856 != null) {
                                                                                                                                    Statics.field856.method69(class14.field262, var266);
                                                                                                                                }
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3915) {
                                                                                                                                boolean var267 = field1269[--Statics.field1260] == 1;
                                                                                                                                if (Statics.field856 != null) {
                                                                                                                                    Statics.field856.method69(class14.field266, var267);
                                                                                                                                }
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3916) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                boolean var268 = field1269[Statics.field1260] == 1;
                                                                                                                                boolean var269 = field1269[Statics.field1260 + 1] == 1;
                                                                                                                                if (Statics.field856 != null) {
                                                                                                                                    client.field1124.field848 = var269;
                                                                                                                                    Statics.field856.method69(client.field1124, var268);
                                                                                                                                }
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3917) {
                                                                                                                                boolean var270 = field1269[--Statics.field1260] == 1;
                                                                                                                                if (Statics.field856 != null) {
                                                                                                                                    Statics.field856.method69(class14.field260, var270);
                                                                                                                                }
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3918) {
                                                                                                                                boolean var271 = field1269[--Statics.field1260] == 1;
                                                                                                                                if (Statics.field856 != null) {
                                                                                                                                    Statics.field856.method69(class14.field263, var271);
                                                                                                                                }
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3919) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.field856 == null ? 0 : Statics.field856.field261.size();
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3920) {
                                                                                                                                int var272 = field1269[--Statics.field1260];
                                                                                                                                class15 var273 = (class15) Statics.field856.field261.get(var272);
                                                                                                                                field1269[++Statics.field1260 - 1] = var273.field278;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3921) {
                                                                                                                                int var274 = field1269[--Statics.field1260];
                                                                                                                                class15 var275 = (class15) Statics.field856.field261.get(var274);
                                                                                                                                field1261[++Statics.field3444 - 1] = var275.method74();
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3922) {
                                                                                                                                int var276 = field1269[--Statics.field1260];
                                                                                                                                class15 var277 = (class15) Statics.field856.field261.get(var276);
                                                                                                                                field1261[++Statics.field3444 - 1] = var277.method75();
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3923) {
                                                                                                                                int var278 = field1269[--Statics.field1260];
                                                                                                                                class15 var279 = (class15) Statics.field856.field261.get(var278);
                                                                                                                                long var280 = class183.method1711() - Statics.field861 - var279.field271;
                                                                                                                                int var282 = (int) (var280 / 3600000L);
                                                                                                                                int var283 = (int) ((var280 - (long) (var282 * 3600000)) / 60000L);
                                                                                                                                int var284 = (int) ((var280 - (long) (var282 * 3600000) - (long) (var283 * 60000)) / 1000L);
                                                                                                                                String var285 = var282 + ":" + var283 / 10 + var283 % 10 + ":" + var284 / 10 + var284 % 10;
                                                                                                                                field1261[++Statics.field3444 - 1] = var285;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3924) {
                                                                                                                                int var286 = field1269[--Statics.field1260];
                                                                                                                                class15 var287 = (class15) Statics.field856.field261.get(var286);
                                                                                                                                field1269[++Statics.field1260 - 1] = var287.field277.field284;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3925) {
                                                                                                                                int var288 = field1269[--Statics.field1260];
                                                                                                                                class15 var289 = (class15) Statics.field856.field261.get(var288);
                                                                                                                                field1269[++Statics.field1260 - 1] = var289.field277.field283;
                                                                                                                                var252 = 1;
                                                                                                                            } else if (var490 == 3926) {
                                                                                                                                int var290 = field1269[--Statics.field1260];
                                                                                                                                class15 var291 = (class15) Statics.field856.field261.get(var290);
                                                                                                                                field1269[++Statics.field1260 - 1] = var291.field277.field282;
                                                                                                                                var252 = 1;
                                                                                                                            } else {
                                                                                                                                var252 = 2;
                                                                                                                            }
                                                                                                                            var84 = var252;
                                                                                                                        } else if (var490 < 4100) {
                                                                                                                            var84 = method920(var490, var4, var68);
                                                                                                                        } else if (var490 < 4200) {
                                                                                                                            byte var294;
                                                                                                                            if (var490 == 4100) {
                                                                                                                                String var292 = field1261[--Statics.field3444];
                                                                                                                                int var293 = field1269[--Statics.field1260];
                                                                                                                                field1261[++Statics.field3444 - 1] = var292 + var293;
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4101) {
                                                                                                                                Statics.field3444 -= 2;
                                                                                                                                String var295 = field1261[Statics.field3444];
                                                                                                                                String var296 = field1261[Statics.field3444 + 1];
                                                                                                                                field1261[++Statics.field3444 - 1] = var295 + var296;
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4102) {
                                                                                                                                String var297 = field1261[--Statics.field3444];
                                                                                                                                int var298 = field1269[--Statics.field1260];
                                                                                                                                String[] var299 = field1261;
                                                                                                                                int var300 = ++Statics.field3444 - 1;
                                                                                                                                String var302;
                                                                                                                                if (var298 < 0) {
                                                                                                                                    var302 = Integer.toString(var298);
                                                                                                                                } else {
                                                                                                                                    int var303 = var298;
                                                                                                                                    String var304;
                                                                                                                                    if (var298 < 0) {
                                                                                                                                        var304 = Integer.toString(var298, 10);
                                                                                                                                    } else {
                                                                                                                                        int var305 = 2;
                                                                                                                                        int var306 = var298 / 10;
                                                                                                                                        while (var306 != 0) {
                                                                                                                                            var306 /= 10;
                                                                                                                                            var305++;
                                                                                                                                        }
                                                                                                                                        char[] var307 = new char[var305];
                                                                                                                                        var307[0] = '+';
                                                                                                                                        for (int var308 = var305 - 1; var308 > 0; var308--) {
                                                                                                                                            int var309 = var303;
                                                                                                                                            var303 /= 10;
                                                                                                                                            int var310 = var309 - var303 * 10;
                                                                                                                                            if (var310 >= 10) {
                                                                                                                                                var307[var308] = (char) (var310 + 87);
                                                                                                                                            } else {
                                                                                                                                                var307[var308] = (char) (var310 + 48);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        var304 = new String(var307);
                                                                                                                                    }
                                                                                                                                    var302 = var304;
                                                                                                                                }
                                                                                                                                var299[var300] = var297 + var302;
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4103) {
                                                                                                                                String var311 = field1261[--Statics.field3444];
                                                                                                                                field1261[++Statics.field3444 - 1] = var311.toLowerCase();
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4104) {
                                                                                                                                int var312 = field1269[--Statics.field1260];
                                                                                                                                long var313 = ((long) var312 + 11745L) * 86400000L;
                                                                                                                                field1268.setTime(new Date(var313));
                                                                                                                                int var315 = field1268.get(5);
                                                                                                                                int var316 = field1268.get(2);
                                                                                                                                int var317 = field1268.get(1);
                                                                                                                                field1261[++Statics.field3444 - 1] = var315 + "-" + field1264[var316] + "-" + var317;
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4105) {
                                                                                                                                Statics.field3444 -= 2;
                                                                                                                                String var318 = field1261[Statics.field3444];
                                                                                                                                String var319 = field1261[Statics.field3444 + 1];
                                                                                                                                if (Statics.field3721.field816 != null && Statics.field3721.field816.field2688) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = var319;
                                                                                                                                } else {
                                                                                                                                    field1261[++Statics.field3444 - 1] = var318;
                                                                                                                                }
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4106) {
                                                                                                                                int var320 = field1269[--Statics.field1260];
                                                                                                                                field1261[++Statics.field3444 - 1] = Integer.toString(var320);
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4107) {
                                                                                                                                Statics.field3444 -= 2;
                                                                                                                                int[] var321 = field1269;
                                                                                                                                int var322 = ++Statics.field1260 - 1;
                                                                                                                                int var323 = class172.method605(field1261[Statics.field3444], field1261[Statics.field3444 + 1], client.field1092);
                                                                                                                                byte var324;
                                                                                                                                if (var323 > 0) {
                                                                                                                                    var324 = 1;
                                                                                                                                } else if (var323 < 0) {
                                                                                                                                    var324 = -1;
                                                                                                                                } else {
                                                                                                                                    var324 = 0;
                                                                                                                                }
                                                                                                                                var321[var322] = var324;
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4108) {
                                                                                                                                String var325 = field1261[--Statics.field3444];
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var326 = field1269[Statics.field1260];
                                                                                                                                int var327 = field1269[Statics.field1260 + 1];
                                                                                                                                byte[] var328 = Statics.field2072.method3887(var327, 0);
                                                                                                                                class271 var329 = new class271(var328);
                                                                                                                                field1269[++Statics.field1260 - 1] = var329.method4462(var325, var326);
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4109) {
                                                                                                                                String var330 = field1261[--Statics.field3444];
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var331 = field1269[Statics.field1260];
                                                                                                                                int var332 = field1269[Statics.field1260 + 1];
                                                                                                                                byte[] var333 = Statics.field2072.method3887(var332, 0);
                                                                                                                                class271 var334 = new class271(var333);
                                                                                                                                field1269[++Statics.field1260 - 1] = var334.method4514(var330, var331);
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4110) {
                                                                                                                                Statics.field3444 -= 2;
                                                                                                                                String var335 = field1261[Statics.field3444];
                                                                                                                                String var336 = field1261[Statics.field3444 + 1];
                                                                                                                                if (field1269[--Statics.field1260] == 1) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = var335;
                                                                                                                                } else {
                                                                                                                                    field1261[++Statics.field3444 - 1] = var336;
                                                                                                                                }
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4111) {
                                                                                                                                String var337 = field1261[--Statics.field3444];
                                                                                                                                field1261[++Statics.field3444 - 1] = class272.method4463(var337);
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4112) {
                                                                                                                                String var338 = field1261[--Statics.field3444];
                                                                                                                                int var339 = field1269[--Statics.field1260];
                                                                                                                                field1261[++Statics.field3444 - 1] = var338 + (char) var339;
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4113) {
                                                                                                                                int var340 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = class278.method2740((char) var340) ? 1 : 0;
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4114) {
                                                                                                                                int var341 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = class278.method2702((char) var341) ? 1 : 0;
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4115) {
                                                                                                                                int var342 = field1269[--Statics.field1260];
                                                                                                                                int[] var343 = field1269;
                                                                                                                                int var344 = ++Statics.field1260 - 1;
                                                                                                                                char var345 = (char) var342;
                                                                                                                                boolean var346 = var345 >= 'A' && var345 <= 'Z' || var345 >= 'a' && var345 <= 'z';
                                                                                                                                var343[var344] = var346 ? 1 : 0;
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4116) {
                                                                                                                                int var347 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = class278.method4574((char) var347) ? 1 : 0;
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4117) {
                                                                                                                                String var348 = field1261[--Statics.field3444];
                                                                                                                                if (var348 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var348.length();
                                                                                                                                }
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4118) {
                                                                                                                                String var349 = field1261[--Statics.field3444];
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var350 = field1269[Statics.field1260];
                                                                                                                                int var351 = field1269[Statics.field1260 + 1];
                                                                                                                                field1261[++Statics.field3444 - 1] = var349.substring(var350, var351);
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4119) {
                                                                                                                                String var352 = field1261[--Statics.field3444];
                                                                                                                                StringBuilder var353 = new StringBuilder(var352.length());
                                                                                                                                boolean var354 = false;
                                                                                                                                for (int var355 = 0; var355 < var352.length(); var355++) {
                                                                                                                                    char var356 = var352.charAt(var355);
                                                                                                                                    if (var356 == '<') {
                                                                                                                                        var354 = true;
                                                                                                                                    } else if (var356 == '>') {
                                                                                                                                        var354 = false;
                                                                                                                                    } else if (!var354) {
                                                                                                                                        var353.append(var356);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1261[++Statics.field3444 - 1] = var353.toString();
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4120) {
                                                                                                                                String var357 = field1261[--Statics.field3444];
                                                                                                                                int var358 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = var357.indexOf(var358);
                                                                                                                                var294 = 1;
                                                                                                                            } else if (var490 == 4121) {
                                                                                                                                Statics.field3444 -= 2;
                                                                                                                                String var359 = field1261[Statics.field3444];
                                                                                                                                String var360 = field1261[Statics.field3444 + 1];
                                                                                                                                int var361 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = var359.indexOf(var360, var361);
                                                                                                                                var294 = 1;
                                                                                                                            } else {
                                                                                                                                var294 = 2;
                                                                                                                            }
                                                                                                                            var84 = var294;
                                                                                                                        } else if (var490 < 4300) {
                                                                                                                            byte var363;
                                                                                                                            if (var490 == 4200) {
                                                                                                                                int var362 = field1269[--Statics.field1260];
                                                                                                                                field1261[++Statics.field3444 - 1] = class264.method2662(var362).field3547;
                                                                                                                                var363 = 1;
                                                                                                                            } else if (var490 == 4201) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var364 = field1269[Statics.field1260];
                                                                                                                                int var365 = field1269[Statics.field1260 + 1];
                                                                                                                                class264 var366 = class264.method2662(var364);
                                                                                                                                if (var365 < 1 || var365 > 5 || var366.field3563[var365 - 1] == null) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1261[++Statics.field3444 - 1] = var366.field3563[var365 - 1];
                                                                                                                                }
                                                                                                                                var363 = 1;
                                                                                                                            } else if (var490 == 4202) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var367 = field1269[Statics.field1260];
                                                                                                                                int var368 = field1269[Statics.field1260 + 1];
                                                                                                                                class264 var369 = class264.method2662(var367);
                                                                                                                                if (var368 < 1 || var368 > 5 || var369.field3570[var368 - 1] == null) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1261[++Statics.field3444 - 1] = var369.field3570[var368 - 1];
                                                                                                                                }
                                                                                                                                var363 = 1;
                                                                                                                            } else if (var490 == 4203) {
                                                                                                                                int var370 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = class264.method2662(var370).field3564;
                                                                                                                                var363 = 1;
                                                                                                                            } else if (var490 == 4204) {
                                                                                                                                int var371 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = class264.method2662(var371).field3560 == 1 ? 1 : 0;
                                                                                                                                var363 = 1;
                                                                                                                            } else if (var490 == 4205) {
                                                                                                                                int var372 = field1269[--Statics.field1260];
                                                                                                                                class264 var373 = class264.method2662(var372);
                                                                                                                                if (var373.field3581 == -1 && var373.field3542 >= 0) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var373.field3542;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var372;
                                                                                                                                }
                                                                                                                                var363 = 1;
                                                                                                                            } else if (var490 == 4206) {
                                                                                                                                int var374 = field1269[--Statics.field1260];
                                                                                                                                class264 var375 = class264.method2662(var374);
                                                                                                                                if (var375.field3581 >= 0 && var375.field3542 >= 0) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var375.field3542;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var374;
                                                                                                                                }
                                                                                                                                var363 = 1;
                                                                                                                            } else if (var490 == 4207) {
                                                                                                                                int var376 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = class264.method2662(var376).field3562 ? 1 : 0;
                                                                                                                                var363 = 1;
                                                                                                                            } else if (var490 == 4208) {
                                                                                                                                int var377 = field1269[--Statics.field1260];
                                                                                                                                class264 var378 = class264.method2662(var377);
                                                                                                                                if (var378.field3559 == -1 && var378.field3593 >= 0) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var378.field3593;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var377;
                                                                                                                                }
                                                                                                                                var363 = 1;
                                                                                                                            } else if (var490 == 4209) {
                                                                                                                                int var379 = field1269[--Statics.field1260];
                                                                                                                                class264 var380 = class264.method2662(var379);
                                                                                                                                if (var380.field3559 >= 0 && var380.field3593 >= 0) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var380.field3593;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var379;
                                                                                                                                }
                                                                                                                                var363 = 1;
                                                                                                                            } else if (var490 == 4210) {
                                                                                                                                String var381 = field1261[--Statics.field3444];
                                                                                                                                int var382 = field1269[--Statics.field1260];
                                                                                                                                client.method37(var381, var382 == 1);
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.field697;
                                                                                                                                var363 = 1;
                                                                                                                            } else if (var490 == 4211) {
                                                                                                                                if (Statics.field1455 == null || Statics.field408 >= Statics.field697) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = Statics.field1455[++Statics.field408 - 1] & 0xFFFF;
                                                                                                                                }
                                                                                                                                var363 = 1;
                                                                                                                            } else if (var490 == 4212) {
                                                                                                                                Statics.field408 = 0;
                                                                                                                                var363 = 1;
                                                                                                                            } else {
                                                                                                                                var363 = 2;
                                                                                                                            }
                                                                                                                            var84 = var363;
                                                                                                                        } else if (var490 < 5100) {
                                                                                                                            byte var383;
                                                                                                                            if (var490 == 5000) {
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1064;
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5001) {
                                                                                                                                Statics.field1260 -= 3;
                                                                                                                                client.field1064 = field1269[Statics.field1260];
                                                                                                                                Statics.field3398 = class286.method3679(field1269[Statics.field1260 + 1]);
                                                                                                                                if (Statics.field3398 == null) {
                                                                                                                                    Statics.field3398 = class286.field3784;
                                                                                                                                }
                                                                                                                                client.field1065 = field1269[Statics.field1260 + 2];
                                                                                                                                class171 var384 = class171.method124(class168.field2317, client.field906.field1461);
                                                                                                                                var384.field2423.method2929(client.field1064);
                                                                                                                                var384.field2423.method2929(Statics.field3398.field3786);
                                                                                                                                var384.field2423.method2929(client.field1065);
                                                                                                                                client.field906.method1715(var384);
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5002) {
                                                                                                                                String var385 = field1261[--Statics.field3444];
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var386 = field1269[Statics.field1260];
                                                                                                                                int var387 = field1269[Statics.field1260 + 1];
                                                                                                                                class171 var388 = class171.method124(class168.field2331, client.field906.field1461);
                                                                                                                                var388.field2423.method2929(class181.method157(var385) + 2);
                                                                                                                                var388.field2423.method2936(var385);
                                                                                                                                var388.field2423.method2929(var386 - 1);
                                                                                                                                var388.field2423.method2929(var387);
                                                                                                                                client.field906.method1715(var388);
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5003) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var389 = field1269[Statics.field1260];
                                                                                                                                int var390 = field1269[Statics.field1260 + 1];
                                                                                                                                class100 var391 = (class100) class97.field1428.get(var389);
                                                                                                                                class72 var392 = var391.method1707(var390);
                                                                                                                                if (var392 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var392.field810;
                                                                                                                                    field1269[++Statics.field1260 - 1] = var392.field806;
                                                                                                                                    field1261[++Statics.field3444 - 1] = var392.field805 == null ? "" : var392.field805;
                                                                                                                                    field1261[++Statics.field3444 - 1] = var392.field809 == null ? "" : var392.field809;
                                                                                                                                    field1261[++Statics.field3444 - 1] = var392.field808 == null ? "" : var392.field808;
                                                                                                                                }
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5004) {
                                                                                                                                int var394 = field1269[--Statics.field1260];
                                                                                                                                class72 var395 = (class72) class97.field1426.method3308((long) var394);
                                                                                                                                if (var395 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var395.field807;
                                                                                                                                    field1269[++Statics.field1260 - 1] = var395.field806;
                                                                                                                                    field1261[++Statics.field3444 - 1] = var395.field805 == null ? "" : var395.field805;
                                                                                                                                    field1261[++Statics.field3444 - 1] = var395.field809 == null ? "" : var395.field809;
                                                                                                                                    field1261[++Statics.field3444 - 1] = var395.field808 == null ? "" : var395.field808;
                                                                                                                                }
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5005) {
                                                                                                                                if (Statics.field3398 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = Statics.field3398.field3786;
                                                                                                                                }
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5008) {
                                                                                                                                String var397 = field1261[--Statics.field3444];
                                                                                                                                int var398 = field1269[--Statics.field1260];
                                                                                                                                String var399 = var397.toLowerCase();
                                                                                                                                byte var400 = 0;
                                                                                                                                if (var399.startsWith(class233.field2965)) {
                                                                                                                                    var400 = 0;
                                                                                                                                    var397 = var397.substring(class233.field2965.length());
                                                                                                                                } else if (var399.startsWith(class233.field3095)) {
                                                                                                                                    var400 = 1;
                                                                                                                                    var397 = var397.substring(class233.field3095.length());
                                                                                                                                } else if (var399.startsWith(class233.field3097)) {
                                                                                                                                    var400 = 2;
                                                                                                                                    var397 = var397.substring(class233.field3097.length());
                                                                                                                                } else if (var399.startsWith(class233.field2999)) {
                                                                                                                                    var400 = 3;
                                                                                                                                    var397 = var397.substring(class233.field2999.length());
                                                                                                                                } else if (var399.startsWith(class233.field2951)) {
                                                                                                                                    var400 = 4;
                                                                                                                                    var397 = var397.substring(class233.field2951.length());
                                                                                                                                } else if (var399.startsWith(class233.field3103)) {
                                                                                                                                    var400 = 5;
                                                                                                                                    var397 = var397.substring(class233.field3103.length());
                                                                                                                                } else if (var399.startsWith(class233.field3112)) {
                                                                                                                                    var400 = 6;
                                                                                                                                    var397 = var397.substring(class233.field3112.length());
                                                                                                                                } else if (var399.startsWith(class233.field3107)) {
                                                                                                                                    var400 = 7;
                                                                                                                                    var397 = var397.substring(class233.field3107.length());
                                                                                                                                } else if (var399.startsWith(class233.field3109)) {
                                                                                                                                    var400 = 8;
                                                                                                                                    var397 = var397.substring(class233.field3109.length());
                                                                                                                                } else if (var399.startsWith(class233.field3111)) {
                                                                                                                                    var400 = 9;
                                                                                                                                    var397 = var397.substring(class233.field3111.length());
                                                                                                                                } else if (var399.startsWith(class233.field3098)) {
                                                                                                                                    var400 = 10;
                                                                                                                                    var397 = var397.substring(class233.field3098.length());
                                                                                                                                } else if (var399.startsWith(class233.field3115)) {
                                                                                                                                    var400 = 11;
                                                                                                                                    var397 = var397.substring(class233.field3115.length());
                                                                                                                                } else if (client.field1092 != 0) {
                                                                                                                                    if (var399.startsWith(class233.field3038)) {
                                                                                                                                        var400 = 0;
                                                                                                                                        var397 = var397.substring(class233.field3038.length());
                                                                                                                                    } else if (var399.startsWith(class233.field3096)) {
                                                                                                                                        var400 = 1;
                                                                                                                                        var397 = var397.substring(class233.field3096.length());
                                                                                                                                    } else if (var399.startsWith(class233.field2975)) {
                                                                                                                                        var400 = 2;
                                                                                                                                        var397 = var397.substring(class233.field2975.length());
                                                                                                                                    } else if (var399.startsWith(class233.field3100)) {
                                                                                                                                        var400 = 3;
                                                                                                                                        var397 = var397.substring(class233.field3100.length());
                                                                                                                                    } else if (var399.startsWith(class233.field2966)) {
                                                                                                                                        var400 = 4;
                                                                                                                                        var397 = var397.substring(class233.field2966.length());
                                                                                                                                    } else if (var399.startsWith(class233.field3104)) {
                                                                                                                                        var400 = 5;
                                                                                                                                        var397 = var397.substring(class233.field3104.length());
                                                                                                                                    } else if (var399.startsWith(class233.field3120)) {
                                                                                                                                        var400 = 6;
                                                                                                                                        var397 = var397.substring(class233.field3120.length());
                                                                                                                                    } else if (var399.startsWith(class233.field2968)) {
                                                                                                                                        var400 = 7;
                                                                                                                                        var397 = var397.substring(class233.field2968.length());
                                                                                                                                    } else if (var399.startsWith(class233.field3110)) {
                                                                                                                                        var400 = 8;
                                                                                                                                        var397 = var397.substring(class233.field3110.length());
                                                                                                                                    } else if (var399.startsWith(class233.field3042)) {
                                                                                                                                        var400 = 9;
                                                                                                                                        var397 = var397.substring(class233.field3042.length());
                                                                                                                                    } else if (var399.startsWith(class233.field3114)) {
                                                                                                                                        var400 = 10;
                                                                                                                                        var397 = var397.substring(class233.field3114.length());
                                                                                                                                    } else if (var399.startsWith(class233.field3116)) {
                                                                                                                                        var400 = 11;
                                                                                                                                        var397 = var397.substring(class233.field3116.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                String var401 = var397.toLowerCase();
                                                                                                                                byte var402 = 0;
                                                                                                                                if (var401.startsWith(class233.field2929)) {
                                                                                                                                    var402 = 1;
                                                                                                                                    var397 = var397.substring(class233.field2929.length());
                                                                                                                                } else if (var401.startsWith(class233.field3183)) {
                                                                                                                                    var402 = 2;
                                                                                                                                    var397 = var397.substring(class233.field3183.length());
                                                                                                                                } else if (var401.startsWith(class233.field2933)) {
                                                                                                                                    var402 = 3;
                                                                                                                                    var397 = var397.substring(class233.field2933.length());
                                                                                                                                } else if (var401.startsWith(class233.field3123)) {
                                                                                                                                    var402 = 4;
                                                                                                                                    var397 = var397.substring(class233.field3123.length());
                                                                                                                                } else if (var401.startsWith(class233.field3125)) {
                                                                                                                                    var402 = 5;
                                                                                                                                    var397 = var397.substring(class233.field3125.length());
                                                                                                                                } else if (client.field1092 != 0) {
                                                                                                                                    if (var401.startsWith(class233.field3118)) {
                                                                                                                                        var402 = 1;
                                                                                                                                        var397 = var397.substring(class233.field3118.length());
                                                                                                                                    } else if (var401.startsWith(class233.field2919)) {
                                                                                                                                        var402 = 2;
                                                                                                                                        var397 = var397.substring(class233.field2919.length());
                                                                                                                                    } else if (var401.startsWith(class233.field3122)) {
                                                                                                                                        var402 = 3;
                                                                                                                                        var397 = var397.substring(class233.field3122.length());
                                                                                                                                    } else if (var401.startsWith(class233.field3145)) {
                                                                                                                                        var402 = 4;
                                                                                                                                        var397 = var397.substring(class233.field3145.length());
                                                                                                                                    } else if (var401.startsWith(class233.field3126)) {
                                                                                                                                        var402 = 5;
                                                                                                                                        var397 = var397.substring(class233.field3126.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                class171 var403 = class171.method124(class168.field2322, client.field906.field1461);
                                                                                                                                var403.field2423.method2929(0);
                                                                                                                                int var404 = var403.field2423.field2488;
                                                                                                                                var403.field2423.method2929(var398);
                                                                                                                                var403.field2423.method2929(var400);
                                                                                                                                var403.field2423.method2929(var402);
                                                                                                                                class273.method3250(var403.field2423, var397);
                                                                                                                                var403.field2423.method2956(var403.field2423.field2488 - var404);
                                                                                                                                client.field906.method1715(var403);
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5009) {
                                                                                                                                Statics.field3444 -= 2;
                                                                                                                                String var405 = field1261[Statics.field3444];
                                                                                                                                String var406 = field1261[Statics.field3444 + 1];
                                                                                                                                class171 var407 = class171.method124(class168.field2309, client.field906.field1461);
                                                                                                                                var407.field2423.method2930(0);
                                                                                                                                int var408 = var407.field2423.field2488;
                                                                                                                                var407.field2423.method2936(var405);
                                                                                                                                class187 var409 = var407.field2423;
                                                                                                                                int var410 = var409.field2488;
                                                                                                                                int var411 = var406.length();
                                                                                                                                byte[] var412 = new byte[var411];
                                                                                                                                int var413 = 0;
                                                                                                                                while (true) {
                                                                                                                                    if (var413 >= var411) {
                                                                                                                                        var409.method2943(var412.length);
                                                                                                                                        var409.field2488 += Statics.field3708.method2883(var412, 0, var412.length, var409.field2495, var409.field2488);
                                                                                                                                        var407.field2423.method2941(var407.field2423.field2488 - var408);
                                                                                                                                        client.field906.method1715(var407);
                                                                                                                                        var383 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    char var414 = var406.charAt(var413);
                                                                                                                                    if (var414 > 0 && var414 < 128 || var414 >= 160 && var414 <= 255) {
                                                                                                                                        var412[var413] = (byte) var414;
                                                                                                                                    } else if (var414 == 8364) {
                                                                                                                                        var412[var413] = -128;
                                                                                                                                    } else if (var414 == 8218) {
                                                                                                                                        var412[var413] = -126;
                                                                                                                                    } else if (var414 == 402) {
                                                                                                                                        var412[var413] = -125;
                                                                                                                                    } else if (var414 == 8222) {
                                                                                                                                        var412[var413] = -124;
                                                                                                                                    } else if (var414 == 8230) {
                                                                                                                                        var412[var413] = -123;
                                                                                                                                    } else if (var414 == 8224) {
                                                                                                                                        var412[var413] = -122;
                                                                                                                                    } else if (var414 == 8225) {
                                                                                                                                        var412[var413] = -121;
                                                                                                                                    } else if (var414 == 710) {
                                                                                                                                        var412[var413] = -120;
                                                                                                                                    } else if (var414 == 8240) {
                                                                                                                                        var412[var413] = -119;
                                                                                                                                    } else if (var414 == 352) {
                                                                                                                                        var412[var413] = -118;
                                                                                                                                    } else if (var414 == 8249) {
                                                                                                                                        var412[var413] = -117;
                                                                                                                                    } else if (var414 == 338) {
                                                                                                                                        var412[var413] = -116;
                                                                                                                                    } else if (var414 == 381) {
                                                                                                                                        var412[var413] = -114;
                                                                                                                                    } else if (var414 == 8216) {
                                                                                                                                        var412[var413] = -111;
                                                                                                                                    } else if (var414 == 8217) {
                                                                                                                                        var412[var413] = -110;
                                                                                                                                    } else if (var414 == 8220) {
                                                                                                                                        var412[var413] = -109;
                                                                                                                                    } else if (var414 == 8221) {
                                                                                                                                        var412[var413] = -108;
                                                                                                                                    } else if (var414 == 8226) {
                                                                                                                                        var412[var413] = -107;
                                                                                                                                    } else if (var414 == 8211) {
                                                                                                                                        var412[var413] = -106;
                                                                                                                                    } else if (var414 == 8212) {
                                                                                                                                        var412[var413] = -105;
                                                                                                                                    } else if (var414 == 732) {
                                                                                                                                        var412[var413] = -104;
                                                                                                                                    } else if (var414 == 8482) {
                                                                                                                                        var412[var413] = -103;
                                                                                                                                    } else if (var414 == 353) {
                                                                                                                                        var412[var413] = -102;
                                                                                                                                    } else if (var414 == 8250) {
                                                                                                                                        var412[var413] = -101;
                                                                                                                                    } else if (var414 == 339) {
                                                                                                                                        var412[var413] = -100;
                                                                                                                                    } else if (var414 == 382) {
                                                                                                                                        var412[var413] = -98;
                                                                                                                                    } else if (var414 == 376) {
                                                                                                                                        var412[var413] = -97;
                                                                                                                                    } else {
                                                                                                                                        var412[var413] = 63;
                                                                                                                                    }
                                                                                                                                    var413++;
                                                                                                                                }
                                                                                                                            } else if (var490 == 5015) {
                                                                                                                                String var417;
                                                                                                                                if (Statics.field3721 == null || Statics.field3721.field823 == null) {
                                                                                                                                    var417 = "";
                                                                                                                                } else {
                                                                                                                                    var417 = Statics.field3721.field823;
                                                                                                                                }
                                                                                                                                field1261[++Statics.field3444 - 1] = var417;
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5016) {
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1065;
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5017) {
                                                                                                                                int var418 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = class97.method933(var418);
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5018) {
                                                                                                                                int var419 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.method10(var419);
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5019) {
                                                                                                                                int var420 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = class97.method618(var420);
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5020) {
                                                                                                                                String var421 = field1261[--Statics.field3444];
                                                                                                                                if (var421.equalsIgnoreCase("toggleroof")) {
                                                                                                                                    Statics.field801.field1235 = !Statics.field801.field1235;
                                                                                                                                    class81.method842();
                                                                                                                                    if (Statics.field801.field1235) {
                                                                                                                                        class97.method4(99, "", "Roofs are now all hidden");
                                                                                                                                    } else {
                                                                                                                                        class97.method4(99, "", "Roofs will only be removed selectively");
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var421.equalsIgnoreCase("displayfps")) {
                                                                                                                                    client.field878 = !client.field878;
                                                                                                                                }
                                                                                                                                if (client.field1015 >= 2) {
                                                                                                                                    if (var421.equalsIgnoreCase("aabb")) {
                                                                                                                                        if (!class8.field220) {
                                                                                                                                            class8.field220 = true;
                                                                                                                                            class8.field219 = class12.field251;
                                                                                                                                        } else if (class8.field219 == class12.field251) {
                                                                                                                                            class8.field220 = true;
                                                                                                                                            class8.field219 = class12.field252;
                                                                                                                                        } else {
                                                                                                                                            class8.field220 = false;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var421.equalsIgnoreCase("fpson")) {
                                                                                                                                        client.field878 = true;
                                                                                                                                    }
                                                                                                                                    if (var421.equalsIgnoreCase("fpsoff")) {
                                                                                                                                        client.field878 = false;
                                                                                                                                    }
                                                                                                                                    if (var421.equalsIgnoreCase("gc")) {
                                                                                                                                        System.gc();
                                                                                                                                    }
                                                                                                                                    if (var421.equalsIgnoreCase("clientdrop")) {
                                                                                                                                        client.method953();
                                                                                                                                    }
                                                                                                                                    if (var421.equalsIgnoreCase("errortest") && client.field900 == 2) {
                                                                                                                                        throw new RuntimeException();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                class171 var422 = class171.method124(class168.field2308, client.field906.field1461);
                                                                                                                                var422.field2423.method2929(var421.length() + 1);
                                                                                                                                var422.field2423.method2936(var421);
                                                                                                                                client.field906.method1715(var422);
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5021) {
                                                                                                                                client.field1066 = field1261[--Statics.field3444].toLowerCase().trim();
                                                                                                                                var383 = 1;
                                                                                                                            } else if (var490 == 5022) {
                                                                                                                                field1261[++Statics.field3444 - 1] = client.field1066;
                                                                                                                                var383 = 1;
                                                                                                                            } else {
                                                                                                                                var383 = 2;
                                                                                                                            }
                                                                                                                            var84 = var383;
                                                                                                                        } else if (var490 < 5400) {
                                                                                                                            var84 = method956(var490, var4, var68);
                                                                                                                        } else if (var490 < 5600) {
                                                                                                                            var84 = method690(var490, var4, var68);
                                                                                                                        } else if (var490 < 5700) {
                                                                                                                            var84 = method83(var490, var4, var68);
                                                                                                                        } else if (var490 < 6300) {
                                                                                                                            byte var423;
                                                                                                                            if (var490 == 6200) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                client.field1101 = (short) field1269[Statics.field1260];
                                                                                                                                if (client.field1101 <= 0) {
                                                                                                                                    client.field1101 = 256;
                                                                                                                                }
                                                                                                                                client.field1102 = (short) field1269[Statics.field1260 + 1];
                                                                                                                                if (client.field1102 <= 0) {
                                                                                                                                    client.field1102 = 205;
                                                                                                                                }
                                                                                                                                var423 = 1;
                                                                                                                            } else if (var490 == 6201) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                client.field1103 = (short) field1269[Statics.field1260];
                                                                                                                                if (client.field1103 <= 0) {
                                                                                                                                    client.field1103 = 256;
                                                                                                                                }
                                                                                                                                client.field1104 = (short) field1269[Statics.field1260 + 1];
                                                                                                                                if (client.field1104 <= 0) {
                                                                                                                                    client.field1104 = 320;
                                                                                                                                }
                                                                                                                                var423 = 1;
                                                                                                                            } else if (var490 == 6202) {
                                                                                                                                Statics.field1260 -= 4;
                                                                                                                                client.field1105 = (short) field1269[Statics.field1260];
                                                                                                                                if (client.field1105 <= 0) {
                                                                                                                                    client.field1105 = 1;
                                                                                                                                }
                                                                                                                                client.field1106 = (short) field1269[Statics.field1260 + 1];
                                                                                                                                if (client.field1106 <= 0) {
                                                                                                                                    client.field1106 = 32767;
                                                                                                                                } else if (client.field1106 < client.field1105) {
                                                                                                                                    client.field1106 = client.field1105;
                                                                                                                                }
                                                                                                                                client.field1107 = (short) field1269[Statics.field1260 + 2];
                                                                                                                                if (client.field1107 <= 0) {
                                                                                                                                    client.field1107 = 1;
                                                                                                                                }
                                                                                                                                client.field1108 = (short) field1269[Statics.field1260 + 3];
                                                                                                                                if (client.field1108 <= 0) {
                                                                                                                                    client.field1108 = 32767;
                                                                                                                                } else if (client.field1108 < client.field1107) {
                                                                                                                                    client.field1108 = client.field1107;
                                                                                                                                }
                                                                                                                                var423 = 1;
                                                                                                                            } else if (var490 == 6203) {
                                                                                                                                if (client.field1020 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    client.method2188(0, 0, client.field1020.field2729, client.field1020.field2834, false);
                                                                                                                                    field1269[++Statics.field1260 - 1] = client.field1111;
                                                                                                                                    field1269[++Statics.field1260 - 1] = client.field909;
                                                                                                                                }
                                                                                                                                var423 = 1;
                                                                                                                            } else if (var490 == 6204) {
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1103;
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1104;
                                                                                                                                var423 = 1;
                                                                                                                            } else if (var490 == 6205) {
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1101;
                                                                                                                                field1269[++Statics.field1260 - 1] = client.field1102;
                                                                                                                                var423 = 1;
                                                                                                                            } else {
                                                                                                                                var423 = 2;
                                                                                                                            }
                                                                                                                            var84 = var423;
                                                                                                                        } else if (var490 < 6600) {
                                                                                                                            var84 = method471(var490, var4, var68);
                                                                                                                        } else if (var490 < 6700) {
                                                                                                                            byte var427;
                                                                                                                            if (var490 == 6600) {
                                                                                                                                int var424 = Statics.field376;
                                                                                                                                int var425 = (Statics.field3721.field1195 >> 7) + Statics.field269;
                                                                                                                                int var426 = (Statics.field3721.field1157 >> 7) + Statics.field854;
                                                                                                                                Statics.method935().method4927(var424, var425, var426, true);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6601) {
                                                                                                                                int var428 = field1269[--Statics.field1260];
                                                                                                                                String var429 = "";
                                                                                                                                class33 var430 = Statics.method935().method4943(var428);
                                                                                                                                if (var430 != null) {
                                                                                                                                    var429 = var430.method230();
                                                                                                                                }
                                                                                                                                field1261[++Statics.field3444 - 1] = var429;
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6602) {
                                                                                                                                int var431 = field1269[--Statics.field1260];
                                                                                                                                Statics.method935().method4957(var431);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6603) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.method935().method4961();
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6604) {
                                                                                                                                int var432 = field1269[--Statics.field1260];
                                                                                                                                Statics.method935().method4937(var432);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6605) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.method935().method5100() ? 1 : 0;
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6606) {
                                                                                                                                class220 var433 = new class220(field1269[--Statics.field1260]);
                                                                                                                                Statics.method935().method4944(var433.field2683, var433.field2684);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6607) {
                                                                                                                                class220 var434 = new class220(field1269[--Statics.field1260]);
                                                                                                                                Statics.method935().method4945(var434.field2683, var434.field2684);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6608) {
                                                                                                                                class220 var435 = new class220(field1269[--Statics.field1260]);
                                                                                                                                Statics.method935().method5076(var435.field2682, var435.field2683, var435.field2684);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6609) {
                                                                                                                                class220 var436 = new class220(field1269[--Statics.field1260]);
                                                                                                                                Statics.method935().method4947(var436.field2682, var436.field2683, var436.field2684);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6610) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.method935().method5096();
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.method935().method4949();
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6611) {
                                                                                                                                int var437 = field1269[--Statics.field1260];
                                                                                                                                class33 var438 = Statics.method935().method4943(var437);
                                                                                                                                if (var438 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var438.method240().method3685();
                                                                                                                                }
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6612) {
                                                                                                                                int var439 = field1269[--Statics.field1260];
                                                                                                                                class33 var440 = Statics.method935().method4943(var439);
                                                                                                                                if (var440 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = (var440.method283() - var440.method226() + 1) * 64;
                                                                                                                                    field1269[++Statics.field1260 - 1] = (var440.method281() - var440.method235() + 1) * 64;
                                                                                                                                }
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6613) {
                                                                                                                                int var441 = field1269[--Statics.field1260];
                                                                                                                                class33 var442 = Statics.method935().method4943(var441);
                                                                                                                                if (var442 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var442.method226() * 64;
                                                                                                                                    field1269[++Statics.field1260 - 1] = var442.method235() * 64;
                                                                                                                                    field1269[++Statics.field1260 - 1] = var442.method283() * 64 + 64 - 1;
                                                                                                                                    field1269[++Statics.field1260 - 1] = var442.method281() * 64 + 64 - 1;
                                                                                                                                }
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6614) {
                                                                                                                                int var443 = field1269[--Statics.field1260];
                                                                                                                                class33 var444 = Statics.method935().method4943(var443);
                                                                                                                                if (var444 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var444.method234();
                                                                                                                                }
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6615) {
                                                                                                                                class220 var445 = Statics.method935().method4950();
                                                                                                                                if (var445 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var445.field2683;
                                                                                                                                    field1269[++Statics.field1260 - 1] = var445.field2684;
                                                                                                                                }
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6616) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.method935().method4929();
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6617) {
                                                                                                                                class220 var446 = new class220(field1269[--Statics.field1260]);
                                                                                                                                class33 var447 = Statics.method935().method4930();
                                                                                                                                if (var447 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                    var427 = 1;
                                                                                                                                } else {
                                                                                                                                    int[] var448 = var447.method224(var446.field2682, var446.field2683, var446.field2684);
                                                                                                                                    if (var448 == null) {
                                                                                                                                        field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                        field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1269[++Statics.field1260 - 1] = var448[0];
                                                                                                                                        field1269[++Statics.field1260 - 1] = var448[1];
                                                                                                                                    }
                                                                                                                                    var427 = 1;
                                                                                                                                }
                                                                                                                            } else if (var490 == 6618) {
                                                                                                                                class220 var449 = new class220(field1269[--Statics.field1260]);
                                                                                                                                class33 var450 = Statics.method935().method4930();
                                                                                                                                if (var450 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                    var427 = 1;
                                                                                                                                } else {
                                                                                                                                    class220 var451 = var450.method225(var449.field2683, var449.field2684);
                                                                                                                                    if (var451 == null) {
                                                                                                                                        field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1269[++Statics.field1260 - 1] = var451.method3685();
                                                                                                                                    }
                                                                                                                                    var427 = 1;
                                                                                                                                }
                                                                                                                            } else if (var490 == 6619) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var452 = field1269[Statics.field1260];
                                                                                                                                class220 var453 = new class220(field1269[Statics.field1260 + 1]);
                                                                                                                                method17(var452, var453, false);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6620) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var454 = field1269[Statics.field1260];
                                                                                                                                class220 var455 = new class220(field1269[Statics.field1260 + 1]);
                                                                                                                                method17(var454, var455, true);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6621) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var456 = field1269[Statics.field1260];
                                                                                                                                class220 var457 = new class220(field1269[Statics.field1260 + 1]);
                                                                                                                                class33 var458 = Statics.method935().method4943(var456);
                                                                                                                                if (var458 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = 0;
                                                                                                                                    var427 = 1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var458.method245(var457.field2682, var457.field2683, var457.field2684) ? 1 : 0;
                                                                                                                                    var427 = 1;
                                                                                                                                }
                                                                                                                            } else if (var490 == 6622) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.method935().method4951();
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.method935().method5011();
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6623) {
                                                                                                                                class220 var459 = new class220(field1269[--Statics.field1260]);
                                                                                                                                class33 var460 = Statics.method935().method4926(var459.field2682, var459.field2683, var459.field2684);
                                                                                                                                if (var460 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var460.method227();
                                                                                                                                }
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6624) {
                                                                                                                                Statics.method935().method4953(field1269[--Statics.field1260]);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6625) {
                                                                                                                                Statics.method935().method5098();
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6626) {
                                                                                                                                Statics.method935().method4936(field1269[--Statics.field1260]);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6627) {
                                                                                                                                Statics.method935().method4956();
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6628) {
                                                                                                                                boolean var461 = field1269[--Statics.field1260] == 1;
                                                                                                                                Statics.method935().method5008(var461);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6629) {
                                                                                                                                int var462 = field1269[--Statics.field1260];
                                                                                                                                Statics.method935().method4998(var462);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6630) {
                                                                                                                                int var463 = field1269[--Statics.field1260];
                                                                                                                                Statics.method935().method4959(var463);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6631) {
                                                                                                                                Statics.method935().method5007();
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6632) {
                                                                                                                                boolean var464 = field1269[--Statics.field1260] == 1;
                                                                                                                                Statics.method935().method4918(var464);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6633) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var465 = field1269[Statics.field1260];
                                                                                                                                boolean var466 = field1269[Statics.field1260 + 1] == 1;
                                                                                                                                Statics.method935().method4962(var465, var466);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6634) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var467 = field1269[Statics.field1260];
                                                                                                                                boolean var468 = field1269[Statics.field1260 + 1] == 1;
                                                                                                                                Statics.method935().method5012(var467, var468);
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6635) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.method935().method5077() ? 1 : 0;
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6636) {
                                                                                                                                int var469 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.method935().method4965(var469) ? 1 : 0;
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6637) {
                                                                                                                                int var470 = field1269[--Statics.field1260];
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.method935().method5051(var470) ? 1 : 0;
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6638) {
                                                                                                                                Statics.field1260 -= 2;
                                                                                                                                int var471 = field1269[Statics.field1260];
                                                                                                                                class220 var472 = new class220(field1269[Statics.field1260 + 1]);
                                                                                                                                class220 var473 = Statics.method935().method5054(var471, var472);
                                                                                                                                if (var473 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var473.method3685();
                                                                                                                                }
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6639) {
                                                                                                                                class40 var474 = Statics.method935().method5013();
                                                                                                                                if (var474 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var474.field499;
                                                                                                                                    field1269[++Statics.field1260 - 1] = var474.field493.method3685();
                                                                                                                                }
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6640) {
                                                                                                                                class40 var475 = Statics.method935().method5064();
                                                                                                                                if (var475 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var475.field499;
                                                                                                                                    field1269[++Statics.field1260 - 1] = var475.field493.method3685();
                                                                                                                                }
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6693) {
                                                                                                                                int var476 = field1269[--Statics.field1260];
                                                                                                                                class250 var477 = Statics.field3346[var476];
                                                                                                                                if (var477.field3359 == null) {
                                                                                                                                    field1261[++Statics.field3444 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1261[++Statics.field3444 - 1] = var477.field3359;
                                                                                                                                }
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6694) {
                                                                                                                                int var478 = field1269[--Statics.field1260];
                                                                                                                                class250 var479 = Statics.field3346[var478];
                                                                                                                                field1269[++Statics.field1260 - 1] = var479.field3360;
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6695) {
                                                                                                                                int var480 = field1269[--Statics.field1260];
                                                                                                                                class250 var481 = Statics.field3346[var480];
                                                                                                                                if (var481 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var481.field3366;
                                                                                                                                }
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6696) {
                                                                                                                                int var482 = field1269[--Statics.field1260];
                                                                                                                                class250 var483 = Statics.field3346[var482];
                                                                                                                                if (var483 == null) {
                                                                                                                                    field1269[++Statics.field1260 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1269[++Statics.field1260 - 1] = var483.field3363;
                                                                                                                                }
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6697) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.field343.field560;
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6698) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.field343.field561.method3685();
                                                                                                                                var427 = 1;
                                                                                                                            } else if (var490 == 6699) {
                                                                                                                                field1269[++Statics.field1260 - 1] = Statics.field343.field557.method3685();
                                                                                                                                var427 = 1;
                                                                                                                            } else {
                                                                                                                                var427 = 2;
                                                                                                                            }
                                                                                                                            var84 = var427;
                                                                                                                        } else {
                                                                                                                            var84 = 2;
                                                                                                                        }
                                                                                                                        switch(var84) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var490 == 0) {
                                                                                                                        field1269[++Statics.field1260 - 1] = var12[var10];
                                                                                                                    } else if (var490 == 1) {
                                                                                                                        int var20 = var12[var10];
                                                                                                                        field1269[++Statics.field1260 - 1] = class219.field2680[var20];
                                                                                                                    } else if (var490 == 2) {
                                                                                                                        int var21 = var12[var10];
                                                                                                                        class219.field2680[var21] = field1269[--Statics.field1260];
                                                                                                                        client.method447(var21);
                                                                                                                    } else if (var490 == 3) {
                                                                                                                        field1261[++Statics.field3444 - 1] = var4.field1439[var10];
                                                                                                                    } else if (var490 == 6) {
                                                                                                                        var10 += var12[var10];
                                                                                                                    } else if (var490 == 7) {
                                                                                                                        Statics.field1260 -= 2;
                                                                                                                        if (field1269[Statics.field1260] != field1269[Statics.field1260 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var490 == 8) {
                                                                                                                        Statics.field1260 -= 2;
                                                                                                                        if (field1269[Statics.field1260] == field1269[Statics.field1260 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var490 == 9) {
                                                                                                                        Statics.field1260 -= 2;
                                                                                                                        if (field1269[Statics.field1260] < field1269[Statics.field1260 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var490 == 10) {
                                                                                                                        Statics.field1260 -= 2;
                                                                                                                        if (field1269[Statics.field1260] > field1269[Statics.field1260 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var490 == 21) {
                                                                                                                        if (field1262 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var22 = field1263[--field1262];
                                                                                                                        var4 = var22.field723;
                                                                                                                        var11 = var4.field1432;
                                                                                                                        var12 = var4.field1435;
                                                                                                                        var10 = var22.field724;
                                                                                                                        Statics.field2432 = var22.field727;
                                                                                                                        Statics.field1256 = var22.field726;
                                                                                                                    } else if (var490 == 25) {
                                                                                                                        int var23 = var12[var10];
                                                                                                                        field1269[++Statics.field1260 - 1] = class219.method122(var23);
                                                                                                                    } else if (var490 == 27) {
                                                                                                                        int var24 = var12[var10];
                                                                                                                        int var25 = field1269[--Statics.field1260];
                                                                                                                        class258 var26 = class258.method632(var24);
                                                                                                                        int var27 = var26.field3429;
                                                                                                                        int var28 = var26.field3433;
                                                                                                                        int var29 = var26.field3431;
                                                                                                                        int var30 = class219.field2681[var29 - var28];
                                                                                                                        if (var25 < 0 || var25 > var30) {
                                                                                                                            var25 = 0;
                                                                                                                        }
                                                                                                                        int var31 = var30 << var28;
                                                                                                                        class219.field2680[var27] = class219.field2680[var27] & ~var31 | var25 << var28 & var31;
                                                                                                                    } else if (var490 == 31) {
                                                                                                                        Statics.field1260 -= 2;
                                                                                                                        if (field1269[Statics.field1260] <= field1269[Statics.field1260 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var490 == 32) {
                                                                                                                        Statics.field1260 -= 2;
                                                                                                                        if (field1269[Statics.field1260] >= field1269[Statics.field1260 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var490 == 33) {
                                                                                                                        field1269[++Statics.field1260 - 1] = Statics.field2432[var12[var10]];
                                                                                                                    } else if (var490 == 34) {
                                                                                                                        Statics.field2432[var12[var10]] = field1269[--Statics.field1260];
                                                                                                                    } else if (var490 == 35) {
                                                                                                                        field1261[++Statics.field3444 - 1] = Statics.field1256[var12[var10]];
                                                                                                                    } else if (var490 == 36) {
                                                                                                                        Statics.field1256[var12[var10]] = field1261[--Statics.field3444];
                                                                                                                    } else if (var490 == 37) {
                                                                                                                        int var32 = var12[var10];
                                                                                                                        Statics.field3444 -= var32;
                                                                                                                        String[] var33 = field1261;
                                                                                                                        int var34 = Statics.field3444;
                                                                                                                        String var35;
                                                                                                                        if (var32 == 0) {
                                                                                                                            var35 = "";
                                                                                                                        } else if (var32 == 1) {
                                                                                                                            String var36 = var33[var34];
                                                                                                                            if (var36 == null) {
                                                                                                                                var35 = "null";
                                                                                                                            } else {
                                                                                                                                var35 = var36.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var37 = var32 + var34;
                                                                                                                            int var38 = 0;
                                                                                                                            for (int var39 = var34; var39 < var37; var39++) {
                                                                                                                                String var40 = var33[var39];
                                                                                                                                if (var40 == null) {
                                                                                                                                    var38 += 4;
                                                                                                                                } else {
                                                                                                                                    var38 += var40.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var41 = new StringBuilder(var38);
                                                                                                                            for (int var42 = var34; var42 < var37; var42++) {
                                                                                                                                String var43 = var33[var42];
                                                                                                                                if (var43 == null) {
                                                                                                                                    var41.append("null");
                                                                                                                                } else {
                                                                                                                                    var41.append(var43);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var35 = var41.toString();
                                                                                                                        }
                                                                                                                        field1261[++Statics.field3444 - 1] = var35;
                                                                                                                    } else if (var490 == 38) {
                                                                                                                        Statics.field1260--;
                                                                                                                    } else if (var490 == 39) {
                                                                                                                        Statics.field3444--;
                                                                                                                    } else if (var490 == 40) {
                                                                                                                        int var45 = var12[var10];
                                                                                                                        class98 var46 = (class98) class98.field1437.method3330((long) var45);
                                                                                                                        class98 var47;
                                                                                                                        if (var46 == null) {
                                                                                                                            byte[] var48 = Statics.field393.method3887(var45, 0);
                                                                                                                            if (var48 == null) {
                                                                                                                                var47 = null;
                                                                                                                            } else {
                                                                                                                                class98 var49 = class98.method1686(var48);
                                                                                                                                class98.field1437.method3332(var49, (long) var45);
                                                                                                                                var47 = var49;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var47 = var46;
                                                                                                                        }
                                                                                                                        class98 var50 = var47;
                                                                                                                        int[] var51 = new int[var47.field1434];
                                                                                                                        String[] var52 = new String[var47.field1436];
                                                                                                                        for (int var53 = 0; var53 < var50.field1433; var53++) {
                                                                                                                            var51[var53] = field1269[Statics.field1260 - var50.field1433 + var53];
                                                                                                                        }
                                                                                                                        for (int var54 = 0; var54 < var50.field1438; var54++) {
                                                                                                                            var52[var54] = field1261[Statics.field3444 - var50.field1438 + var54];
                                                                                                                        }
                                                                                                                        Statics.field1260 -= var50.field1433;
                                                                                                                        Statics.field3444 -= var50.field1438;
                                                                                                                        class63 var55 = new class63();
                                                                                                                        var55.field723 = var4;
                                                                                                                        var55.field724 = var10;
                                                                                                                        var55.field727 = Statics.field2432;
                                                                                                                        var55.field726 = Statics.field1256;
                                                                                                                        field1263[++field1262 - 1] = var55;
                                                                                                                        var4 = var50;
                                                                                                                        var11 = var50.field1432;
                                                                                                                        var12 = var50.field1435;
                                                                                                                        var10 = -1;
                                                                                                                        Statics.field2432 = var51;
                                                                                                                        Statics.field1256 = var52;
                                                                                                                    } else if (var490 == 42) {
                                                                                                                        field1269[++Statics.field1260 - 1] = Statics.field2024.method1647(var12[var10]);
                                                                                                                    } else if (var490 == 43) {
                                                                                                                        Statics.field2024.method1630(var12[var10], field1269[--Statics.field1260]);
                                                                                                                    } else if (var490 == 44) {
                                                                                                                        int var56 = var12[var10] >> 16;
                                                                                                                        int var57 = var12[var10] & 0xFFFF;
                                                                                                                        int var58 = field1269[--Statics.field1260];
                                                                                                                        if (var58 >= 0 && var58 <= 5000) {
                                                                                                                            field1259[var56] = var58;
                                                                                                                            byte var59 = -1;
                                                                                                                            if (var57 == 105) {
                                                                                                                                var59 = 0;
                                                                                                                            }
                                                                                                                            int var60 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var60 >= var58) {
                                                                                                                                    continue label2669;
                                                                                                                                }
                                                                                                                                field1258[var56][var60] = var59;
                                                                                                                                var60++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var490 == 45) {
                                                                                                                        int var61 = var12[var10];
                                                                                                                        int var62 = field1269[--Statics.field1260];
                                                                                                                        if (var62 < 0 || var62 >= field1259[var61]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1269[++Statics.field1260 - 1] = field1258[var61][var62];
                                                                                                                    } else if (var490 == 46) {
                                                                                                                        int var63 = var12[var10];
                                                                                                                        Statics.field1260 -= 2;
                                                                                                                        int var64 = field1269[Statics.field1260];
                                                                                                                        if (var64 < 0 || var64 >= field1259[var63]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1258[var63][var64] = field1269[Statics.field1260 + 1];
                                                                                                                    } else if (var490 == 47) {
                                                                                                                        String var65 = Statics.field2024.method1633(var12[var10]);
                                                                                                                        if (var65 == null) {
                                                                                                                            var65 = "null";
                                                                                                                        }
                                                                                                                        field1261[++Statics.field3444 - 1] = var65;
                                                                                                                    } else if (var490 == 48) {
                                                                                                                        Statics.field2024.method1632(var12[var10], field1261[--Statics.field3444]);
                                                                                                                    } else if (var490 == 60) {
                                                                                                                        class194 var66 = var4.field1440[var12[var10]];
                                                                                                                        class206 var67 = (class206) var66.method3308((long) field1269[--Statics.field1260]);
                                                                                                                        if (var67 != null) {
                                                                                                                            var10 += var67.field2570;
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
        } catch (Exception var489) {
            StringBuilder var486 = new StringBuilder(30);
            var486.append("").append(var4.field2557).append(" ");
            for (int var487 = field1262 - 1; var487 >= 0; var487--) {
                var486.append("").append(field1263[var487].field723.field2557).append(" ");
            }
            var486.append("").append(var13);
            class154.method607(var486.toString(), var489);
        }
    }

    @ObfuscatedName("eq.r(ILcx;ZI)I")
    public static int method2727(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class224 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1269[--Statics.field1260];
            var4 = class224.method934(var3);
        } else {
            var4 = arg2 ? Statics.field3211 : Statics.field1254;
        }
        if (arg0 == 1000) {
            Statics.field1260 -= 4;
            var4.field2842 = field1269[Statics.field1260];
            var4.field2776 = field1269[Statics.field1260 + 1];
            var4.field2719 = field1269[Statics.field1260 + 2];
            var4.field2722 = field1269[Statics.field1260 + 3];
            client.method955(var4);
            Statics.field3803.method1236(var4);
            if (var3 != -1 && var4.field2747 == 0) {
                client.method1558(Statics.field2807[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1260 -= 4;
            var4.field2800 = field1269[Statics.field1260];
            var4.field2726 = field1269[Statics.field1260 + 1];
            var4.field2721 = field1269[Statics.field1260 + 2];
            var4.field2742 = field1269[Statics.field1260 + 3];
            client.method955(var4);
            Statics.field3803.method1236(var4);
            if (var3 != -1 && var4.field2747 == 0) {
                client.method1558(Statics.field2807[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1269[--Statics.field1260] == 1;
            if (var4.field2734 != var5) {
                var4.field2734 = var5;
                client.method955(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2730 = field1269[--Statics.field1260] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2848 = field1269[--Statics.field1260] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.g(ILcx;ZI)I")
    public static int method221(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class224 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1269[--Statics.field1260];
            var4 = class224.method934(var3);
        } else {
            var4 = arg2 ? Statics.field3211 : Statics.field1254;
        }
        if (arg0 == 1100) {
            Statics.field1260 -= 2;
            var4.field2735 = field1269[Statics.field1260];
            if (var4.field2735 > var4.field2804 - var4.field2729) {
                var4.field2735 = var4.field2804 - var4.field2729;
            }
            if (var4.field2735 < 0) {
                var4.field2735 = 0;
            }
            var4.field2759 = field1269[Statics.field1260 + 1];
            if (var4.field2759 > var4.field2766 - var4.field2834) {
                var4.field2759 = var4.field2766 - var4.field2834;
            }
            if (var4.field2759 < 0) {
                var4.field2759 = 0;
            }
            client.method955(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2739 = field1269[--Statics.field1260];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2743 = field1269[--Statics.field1260] == 1;
            client.method955(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2745 = field1269[--Statics.field1260];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2756 = field1269[--Statics.field1260];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2749 = field1269[--Statics.field1260];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2751 = field1269[--Statics.field1260];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2752 = field1269[--Statics.field1260] == 1;
            client.method955(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2720 = 1;
            var4.field2758 = field1269[--Statics.field1260];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1260 -= 6;
            var4.field2763 = field1269[Statics.field1260];
            var4.field2764 = field1269[Statics.field1260 + 1];
            var4.field2765 = field1269[Statics.field1260 + 2];
            var4.field2716 = field1269[Statics.field1260 + 3];
            var4.field2711 = field1269[Statics.field1260 + 4];
            var4.field2768 = field1269[Statics.field1260 + 5];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1269[--Statics.field1260];
            if (var4.field2761 != var5) {
                var4.field2761 = var5;
                var4.field2836 = 0;
                var4.field2724 = 0;
                client.method955(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2815 = field1269[--Statics.field1260] == 1;
            client.method955(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1261[--Statics.field3444];
            if (!var6.equals(var4.field2774)) {
                var4.field2774 = var6;
                client.method955(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2773 = field1269[--Statics.field1260];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1260 -= 3;
            var4.field2777 = field1269[Statics.field1260];
            var4.field2778 = field1269[Statics.field1260 + 1];
            var4.field2707 = field1269[Statics.field1260 + 2];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2779 = field1269[--Statics.field1260] == 1;
            client.method955(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2828 = field1269[--Statics.field1260];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2754 = field1269[--Statics.field1260];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2755 = field1269[--Statics.field1260] == 1;
            client.method955(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2723 = field1269[--Statics.field1260] == 1;
            client.method955(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1260 -= 2;
            var4.field2804 = field1269[Statics.field1260];
            var4.field2766 = field1269[Statics.field1260 + 1];
            client.method955(var4);
            if (var3 != -1 && var4.field2747 == 0) {
                client.method1558(Statics.field2807[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3805(var4.field2714, var4.field2715);
            client.field879 = var4;
            client.method955(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2750 = field1269[--Statics.field1260];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2835 = field1269[--Statics.field1260];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2746 = field1269[--Statics.field1260];
            client.method955(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1269[--Statics.field1260];
            class293[] var8 = new class293[] { class293.field3822, class293.field3821, class293.field3819, class293.field3823, class293.field3820 };
            class293 var9 = (class293) class176.method2719(var8, var7);
            if (var9 != null) {
                var4.field2744 = var9;
                client.method955(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var10 = field1269[--Statics.field1260] == 1;
            var4.field2748 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ax.x(ILcx;ZI)I")
    public static int method597(int arg0, class98 arg1, boolean arg2) {
        class224 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class224.method934(field1269[--Statics.field1260]);
        } else {
            var3 = arg2 ? Statics.field3211 : Statics.field1254;
        }
        client.method955(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1260 -= 2;
            int var4 = field1269[Statics.field1260];
            int var5 = field1269[Statics.field1260 + 1];
            var3.field2717 = var4;
            var3.field2780 = var5;
            class264 var6 = class264.method2662(var4);
            var3.field2765 = var6.field3582;
            var3.field2716 = var6.field3552;
            var3.field2711 = var6.field3557;
            var3.field2763 = var6.field3558;
            var3.field2764 = var6.field3571;
            var3.field2768 = var6.field3554;
            if (arg0 == 1205) {
                var3.field2788 = 0;
            } else if (arg0 == 1212 | var6.field3560 == 1) {
                var3.field2788 = 1;
            } else {
                var3.field2788 = 2;
            }
            if (var3.field2769 > 0) {
                var3.field2768 = var3.field2768 * 32 / var3.field2769;
            } else if (var3.field2800 > 0) {
                var3.field2768 = var3.field2768 * 32 / var3.field2800;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2720 = 2;
            var3.field2758 = field1269[--Statics.field1260];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2720 = 3;
            var3.field2758 = Statics.field3721.field816.method3709();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fn.f(ILcx;ZI)I")
    public static int method2854(int arg0, class98 arg1, boolean arg2) {
        class224 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class224.method934(field1269[--Statics.field1260]);
        } else {
            var3 = arg2 ? Statics.field3211 : Statics.field1254;
        }
        if (arg0 == 1300) {
            int var4 = field1269[--Statics.field1260] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3747(var4, field1261[--Statics.field3444]);
                return 1;
            } else {
                Statics.field3444--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1260 -= 2;
            int var5 = field1269[Statics.field1260];
            int var6 = field1269[Statics.field1260 + 1];
            var3.field2789 = class224.method2676(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2792 = field1269[--Statics.field1260] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2790 = field1269[--Statics.field1260];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2791 = field1269[--Statics.field1260];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2787 = field1261[--Statics.field3444];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2793 = field1261[--Statics.field3444];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2810 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ay.u(ILcx;ZS)I")
    public static int method558(int arg0, class98 arg1, boolean arg2) {
        class224 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class224.method934(field1269[--Statics.field1260]);
        } else {
            var3 = arg2 ? Statics.field3211 : Statics.field1254;
        }
        String var4 = field1261[--Statics.field3444];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1269[--Statics.field1260];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1269[--Statics.field1260];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1261[--Statics.field3444];
            } else {
                var7[var8] = Integer.valueOf(field1269[--Statics.field1260]);
            }
        }
        int var9 = field1269[--Statics.field1260];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2796 = var7;
        } else if (arg0 == 1401) {
            var3.field2799 = var7;
        } else if (arg0 == 1402) {
            var3.field2767 = var7;
        } else if (arg0 == 1403) {
            var3.field2740 = var7;
        } else if (arg0 == 1404) {
            var3.field2837 = var7;
        } else if (arg0 == 1405) {
            var3.field2803 = var7;
        } else if (arg0 == 1406) {
            var3.field2806 = var7;
        } else if (arg0 == 1407) {
            var3.field2772 = var7;
            var3.field2808 = var5;
        } else if (arg0 == 1408) {
            var3.field2813 = var7;
        } else if (arg0 == 1409) {
            var3.field2814 = var7;
        } else if (arg0 == 1410) {
            var3.field2802 = var7;
        } else if (arg0 == 1411) {
            var3.field2797 = var7;
        } else if (arg0 == 1412) {
            var3.field2801 = var7;
        } else if (arg0 == 1414) {
            var3.field2809 = var7;
            var3.field2738 = var5;
        } else if (arg0 == 1415) {
            var3.field2811 = var7;
            var3.field2812 = var5;
        } else if (arg0 == 1416) {
            var3.field2736 = var7;
        } else if (arg0 == 1417) {
            var3.field2771 = var7;
        } else if (arg0 == 1418) {
            var3.field2816 = var7;
        } else if (arg0 == 1419) {
            var3.field2732 = var7;
        } else if (arg0 == 1420) {
            var3.field2818 = var7;
        } else if (arg0 == 1421) {
            var3.field2805 = var7;
        } else if (arg0 == 1422) {
            var3.field2703 = var7;
        } else if (arg0 == 1423) {
            var3.field2821 = var7;
        } else if (arg0 == 1424) {
            var3.field2822 = var7;
        } else if (arg0 == 1425) {
            var3.field2824 = var7;
        } else if (arg0 == 1426) {
            var3.field2825 = var7;
        } else if (arg0 == 1427) {
            var3.field2823 = var7;
        } else {
            return 2;
        }
        var3.field2794 = true;
        return 1;
    }

    @ObfuscatedName("du.t(ILcx;ZI)I")
    public static int method1961(int arg0, class98 arg1, boolean arg2) {
        class224 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class224.method934(field1269[--Statics.field1260]);
        } else {
            var3 = arg2 ? Statics.field3211 : Statics.field1254;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1267 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2823 == null) {
            return 0;
        } else {
            class69 var4 = new class69();
            var4.field778 = var3;
            var4.field786 = var3.field2823;
            var4.field780 = field1267 + 1;
            client.field863.method3400(var4);
            return 1;
        }
    }

    @ObfuscatedName("cv.k(ILcx;ZI)I")
    public static int method1543(int arg0, class98 arg1, boolean arg2) {
        class224 var3 = class224.method934(field1269[--Statics.field1260]);
        if (arg0 == 2500) {
            field1269[++Statics.field1260 - 1] = var3.field2727;
            return 1;
        } else if (arg0 == 2501) {
            field1269[++Statics.field1260 - 1] = var3.field2728;
            return 1;
        } else if (arg0 == 2502) {
            field1269[++Statics.field1260 - 1] = var3.field2729;
            return 1;
        } else if (arg0 == 2503) {
            field1269[++Statics.field1260 - 1] = var3.field2834;
            return 1;
        } else if (arg0 == 2504) {
            field1269[++Statics.field1260 - 1] = var3.field2734 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1269[++Statics.field1260 - 1] = var3.field2733;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.n(ILcx;ZB)I")
    public static int method50(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1260 -= 3;
            int var3 = field1269[Statics.field1260];
            int var4 = field1269[Statics.field1260 + 1];
            int var5 = field1269[Statics.field1260 + 2];
            if (client.field1086 != 0 && var4 != 0 && client.field1032 < 50) {
                client.field957[client.field1032] = var3;
                client.field987[client.field1032] = var4;
                client.field1087[client.field1032] = var5;
                client.field883[client.field1032] = null;
                client.field1093[client.field1032] = 0;
                client.field1032++;
            }
            return 1;
        } else if (arg0 == 3201) {
            client.method687(field1269[--Statics.field1260]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1260 -= 2;
            int var6 = field1269[Statics.field1260];
            int var7 = field1269[Statics.field1260 + 1];
            if (client.field946 != 0 && var6 != -1) {
                class211.method3796(Statics.field702, var6, 0, client.field946, false);
                client.field1085 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("di.d(ILcx;ZI)I")
    public static int method2216(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1269[++Statics.field1260 - 1] = client.field872;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1260 -= 2;
            int var3 = field1269[Statics.field1260];
            int var4 = field1269[Statics.field1260 + 1];
            int[] var5 = field1269;
            int var6 = ++Statics.field1260 - 1;
            class64 var7 = (class64) class64.field734.method3340((long) var3);
            int var8;
            if (var7 == null) {
                var8 = -1;
            } else if (var4 >= 0 && var4 < var7.field733.length) {
                var8 = var7.field733[var4];
            } else {
                var8 = -1;
            }
            var5[var6] = var8;
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1260 -= 2;
            int var9 = field1269[Statics.field1260];
            int var10 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = class64.method598(var9, var10);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1260 -= 2;
            int var11 = field1269[Statics.field1260];
            int var12 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = class64.method3586(var11, var12);
            return 1;
        } else if (arg0 == 3304) {
            int var13 = field1269[--Statics.field1260];
            int[] var14 = field1269;
            int var15 = ++Statics.field1260 - 1;
            class248 var16 = (class248) class248.field3333.method3330((long) var13);
            class248 var17;
            if (var16 == null) {
                byte[] var18 = Statics.field3337.method3887(5, var13);
                class248 var19 = new class248();
                if (var18 != null) {
                    var19.method3950(new class181(var18));
                }
                class248.field3333.method3332(var19, (long) var13);
                var17 = var19;
            } else {
                var17 = var16;
            }
            var14[var15] = var17.field3336;
            return 1;
        } else if (arg0 == 3305) {
            int var20 = field1269[--Statics.field1260];
            field1269[++Statics.field1260 - 1] = client.field982[var20];
            return 1;
        } else if (arg0 == 3306) {
            int var21 = field1269[--Statics.field1260];
            field1269[++Statics.field1260 - 1] = client.field983[var21];
            return 1;
        } else if (arg0 == 3307) {
            int var22 = field1269[--Statics.field1260];
            field1269[++Statics.field1260 - 1] = client.field1094[var22];
            return 1;
        } else if (arg0 == 3308) {
            int var23 = Statics.field376;
            int var24 = (Statics.field3721.field1195 >> 7) + Statics.field269;
            int var25 = (Statics.field3721.field1157 >> 7) + Statics.field854;
            field1269[++Statics.field1260 - 1] = (var23 << 28) + (var24 << 14) + var25;
            return 1;
        } else if (arg0 == 3309) {
            int var26 = field1269[--Statics.field1260];
            field1269[++Statics.field1260 - 1] = var26 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var27 = field1269[--Statics.field1260];
            field1269[++Statics.field1260 - 1] = var27 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var28 = field1269[--Statics.field1260];
            field1269[++Statics.field1260 - 1] = var28 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1269[++Statics.field1260 - 1] = client.field1058 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1260 -= 2;
            int var29 = field1269[Statics.field1260] + 32768;
            int var30 = field1269[Statics.field1260 + 1];
            int[] var31 = field1269;
            int var32 = ++Statics.field1260 - 1;
            class64 var33 = (class64) class64.field734.method3340((long) var29);
            int var34;
            if (var33 == null) {
                var34 = -1;
            } else if (var30 >= 0 && var30 < var33.field733.length) {
                var34 = var33.field733[var30];
            } else {
                var34 = -1;
            }
            var31[var32] = var34;
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1260 -= 2;
            int var35 = field1269[Statics.field1260] + 32768;
            int var36 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = class64.method598(var35, var36);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1260 -= 2;
            int var37 = field1269[Statics.field1260] + 32768;
            int var38 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = class64.method3586(var37, var38);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field1015 >= 2) {
                field1269[++Statics.field1260 - 1] = client.field1015;
            } else {
                field1269[++Statics.field1260 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1269[++Statics.field1260 - 1] = client.field911;
            return 1;
        } else if (arg0 == 3318) {
            field1269[++Statics.field1260 - 1] = client.field940;
            return 1;
        } else if (arg0 == 3321) {
            field1269[++Statics.field1260 - 1] = client.field1013;
            return 1;
        } else if (arg0 == 3322) {
            field1269[++Statics.field1260 - 1] = client.field1014;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field980) {
                field1269[++Statics.field1260 - 1] = 1;
            } else {
                field1269[++Statics.field1260 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1269[++Statics.field1260 - 1] = client.field871;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1260 -= 4;
            int var39 = field1269[Statics.field1260];
            int var40 = field1269[Statics.field1260 + 1];
            int var41 = field1269[Statics.field1260 + 2];
            int var42 = field1269[Statics.field1260 + 3];
            int var43 = (var40 << 14) + var39;
            int var44 = (var41 << 28) + var43;
            int var45 = var42 + var44;
            field1269[++Statics.field1260 - 1] = var45;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.o(ILcx;ZI)I")
    public static int method920(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1260 -= 2;
            int var3 = field1269[Statics.field1260];
            int var4 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1260 -= 2;
            int var5 = field1269[Statics.field1260];
            int var6 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1260 -= 2;
            int var7 = field1269[Statics.field1260];
            int var8 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1260 -= 2;
            int var9 = field1269[Statics.field1260];
            int var10 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1269[--Statics.field1260];
            field1269[++Statics.field1260 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1269[--Statics.field1260];
            field1269[++Statics.field1260 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1260 -= 5;
            int var13 = field1269[Statics.field1260];
            int var14 = field1269[Statics.field1260 + 1];
            int var15 = field1269[Statics.field1260 + 2];
            int var16 = field1269[Statics.field1260 + 3];
            int var17 = field1269[Statics.field1260 + 4];
            field1269[++Statics.field1260 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1260 -= 2;
            int var18 = field1269[Statics.field1260];
            int var19 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1260 -= 2;
            int var20 = field1269[Statics.field1260];
            int var21 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1260 -= 2;
            int var22 = field1269[Statics.field1260];
            int var23 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1260 -= 2;
            int var24 = field1269[Statics.field1260];
            int var25 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1260 -= 2;
            int var26 = field1269[Statics.field1260];
            int var27 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1260 -= 2;
            int var28 = field1269[Statics.field1260];
            int var29 = field1269[Statics.field1260 + 1];
            if (var28 == 0) {
                field1269[++Statics.field1260 - 1] = 0;
            } else {
                field1269[++Statics.field1260 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1260 -= 2;
            int var30 = field1269[Statics.field1260];
            int var31 = field1269[Statics.field1260 + 1];
            if (var30 == 0) {
                field1269[++Statics.field1260 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1269[++Statics.field1260 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1269[++Statics.field1260 - 1] = var30;
                    break;
                case 2:
                    field1269[++Statics.field1260 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1269[++Statics.field1260 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1269[++Statics.field1260 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1269[++Statics.field1260 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1260 -= 2;
            int var32 = field1269[Statics.field1260];
            int var33 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1260 -= 2;
            int var34 = field1269[Statics.field1260];
            int var35 = field1269[Statics.field1260 + 1];
            field1269[++Statics.field1260 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1260 -= 3;
            long var36 = (long) field1269[Statics.field1260];
            long var38 = (long) field1269[Statics.field1260 + 1];
            long var40 = (long) field1269[Statics.field1260 + 2];
            field1269[++Statics.field1260 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.a(ILcx;ZI)I")
    public static int method956(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1269[++Statics.field1260 - 1] = client.method1384();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1269[--Statics.field1260];
            if (var3 == 1 || var3 == 2) {
                client.method1418(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1269[++Statics.field1260 - 1] = Statics.field801.field1232;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1269[--Statics.field1260];
            if (var4 == 1 || var4 == 2) {
                Statics.field801.field1232 = var4;
                class81.method842();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bb.q(ILcx;ZI)I")
    public static int method690(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1260 -= 2;
            int var3 = field1269[Statics.field1260];
            int var4 = field1269[Statics.field1260 + 1];
            if (!client.field1095) {
                client.field931 = var3;
                client.field922 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1269[++Statics.field1260 - 1] = client.field931;
            return 1;
        } else if (arg0 == 5506) {
            field1269[++Statics.field1260 - 1] = client.field922;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1269[--Statics.field1260];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field903 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1269[++Statics.field1260 - 1] = client.field903;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("j.j(ILcx;ZI)I")
    public static int method83(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field907 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aw.c(ILcx;ZI)I")
    public static int method471(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1269[++Statics.field1260 - 1] = class80.method881() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class80 var3 = class80.method161();
            if (var3 == null) {
                field1269[++Statics.field1260 - 1] = -1;
                field1269[++Statics.field1260 - 1] = 0;
                field1261[++Statics.field3444 - 1] = "";
                field1269[++Statics.field1260 - 1] = 0;
                field1269[++Statics.field1260 - 1] = 0;
                field1261[++Statics.field3444 - 1] = "";
            } else {
                field1269[++Statics.field1260 - 1] = var3.field1220;
                field1269[++Statics.field1260 - 1] = var3.field1223;
                field1261[++Statics.field3444 - 1] = var3.field1227;
                field1269[++Statics.field1260 - 1] = var3.field1215;
                field1269[++Statics.field1260 - 1] = var3.field1222;
                field1261[++Statics.field3444 - 1] = var3.field1224;
            }
            return 1;
        } else if (arg0 == 6502) {
            class80 var4 = class80.method449();
            if (var4 == null) {
                field1269[++Statics.field1260 - 1] = -1;
                field1269[++Statics.field1260 - 1] = 0;
                field1261[++Statics.field3444 - 1] = "";
                field1269[++Statics.field1260 - 1] = 0;
                field1269[++Statics.field1260 - 1] = 0;
                field1261[++Statics.field3444 - 1] = "";
            } else {
                field1269[++Statics.field1260 - 1] = var4.field1220;
                field1269[++Statics.field1260 - 1] = var4.field1223;
                field1261[++Statics.field3444 - 1] = var4.field1227;
                field1269[++Statics.field1260 - 1] = var4.field1215;
                field1269[++Statics.field1260 - 1] = var4.field1222;
                field1261[++Statics.field3444 - 1] = var4.field1224;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1269[--Statics.field1260];
            class80 var6 = null;
            for (int var7 = 0; var7 < class80.field1216; var7++) {
                if (Statics.field623[var7].field1220 == var5) {
                    var6 = Statics.field623[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1269[++Statics.field1260 - 1] = -1;
                field1269[++Statics.field1260 - 1] = 0;
                field1261[++Statics.field3444 - 1] = "";
                field1269[++Statics.field1260 - 1] = 0;
                field1269[++Statics.field1260 - 1] = 0;
                field1261[++Statics.field3444 - 1] = "";
            } else {
                field1269[++Statics.field1260 - 1] = var6.field1220;
                field1269[++Statics.field1260 - 1] = var6.field1223;
                field1261[++Statics.field3444 - 1] = var6.field1227;
                field1269[++Statics.field1260 - 1] = var6.field1215;
                field1269[++Statics.field1260 - 1] = var6.field1222;
                field1261[++Statics.field3444 - 1] = var6.field1224;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1260 -= 4;
            int var8 = field1269[Statics.field1260];
            boolean var9 = field1269[Statics.field1260 + 1] == 1;
            int var10 = field1269[Statics.field1260 + 2];
            boolean var11 = field1269[Statics.field1260 + 3] == 1;
            if (Statics.field623 != null) {
                Statics.method513(0, Statics.field623.length - 1, var8, var9, var10, var11);
            }
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1269[--Statics.field1260];
            if (var12 >= 0 && var12 < class80.field1216) {
                class80 var13 = Statics.field623[var12];
                field1269[++Statics.field1260 - 1] = var13.field1220;
                field1269[++Statics.field1260 - 1] = var13.field1223;
                field1261[++Statics.field3444 - 1] = var13.field1227;
                field1269[++Statics.field1260 - 1] = var13.field1215;
                field1269[++Statics.field1260 - 1] = var13.field1222;
                field1261[++Statics.field3444 - 1] = var13.field1224;
            } else {
                field1269[++Statics.field1260 - 1] = -1;
                field1269[++Statics.field1260 - 1] = 0;
                field1261[++Statics.field3444 - 1] = "";
                field1269[++Statics.field1260 - 1] = 0;
                field1269[++Statics.field1260 - 1] = 0;
                field1261[++Statics.field3444 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field995 = field1269[--Statics.field1260] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1260 -= 2;
            int var14 = field1269[Statics.field1260];
            int var15 = field1269[Statics.field1260 + 1];
            class259 var16 = class259.method3957(var15);
            if (var16.method4126()) {
                field1261[++Statics.field3444 - 1] = class266.method3591(var14).method4336(var15, var16.field3438);
            } else {
                field1269[++Statics.field1260 - 1] = class266.method3591(var14).method4363(var15, var16.field3437);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1260 -= 2;
            int var17 = field1269[Statics.field1260];
            int var18 = field1269[Statics.field1260 + 1];
            class259 var19 = class259.method3957(var18);
            if (var19.method4126()) {
                field1261[++Statics.field3444 - 1] = class263.method2851(var17).method4219(var18, var19.field3438);
            } else {
                field1269[++Statics.field1260 - 1] = class263.method2851(var17).method4218(var18, var19.field3437);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1260 -= 2;
            int var20 = field1269[Statics.field1260];
            int var21 = field1269[Statics.field1260 + 1];
            class259 var22 = class259.method3957(var21);
            if (var22.method4126()) {
                field1261[++Statics.field3444 - 1] = class264.method2662(var20).method4274(var21, var22.field3438);
            } else {
                field1269[++Statics.field1260 - 1] = class264.method2662(var20).method4307(var21, var22.field3437);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1260 -= 2;
            int var23 = field1269[Statics.field1260];
            int var24 = field1269[Statics.field1260 + 1];
            class259 var25 = class259.method3957(var24);
            if (var25.method4126()) {
                field1261[++Statics.field3444 - 1] = class260.method3794(var23).method4145(var24, var25.field3438);
            } else {
                field1269[++Statics.field1260 - 1] = class260.method3794(var23).method4139(var24, var25.field3437);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1269[++Statics.field1260 - 1] = 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("as.i(II)V")
    public static void method450(int arg0) {
        if (arg0 == -1 || !class224.method936(arg0)) {
            return;
        }
        class224[] var1 = Statics.field2807[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class224 var3 = var1[var2];
            if (var3.field2830 != null) {
                class69 var4 = new class69();
                var4.field778 = var3;
                var4.field786 = var3.field2830;
                method3707(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("f.l(ILhk;ZB)V")
    public static void method17(int arg0, class220 arg1, boolean arg2) {
        class33 var3 = Statics.method935().method4943(arg0);
        int var4 = Statics.field3721.field836;
        int var5 = (Statics.field3721.field1195 >> 7) + Statics.field269;
        int var6 = (Statics.field3721.field1157 >> 7) + Statics.field854;
        class220 var7 = new class220(var4, var5, var6);
        Statics.method935().method4933(var3, var7, arg1, arg2);
    }
}
