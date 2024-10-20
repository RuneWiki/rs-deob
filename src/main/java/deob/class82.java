package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cy")
public class class82 {

    @ObfuscatedName("cy.q")
    public static int[] field1333 = new int[5];

    @ObfuscatedName("cy.s")
    public static int[][] field1334 = new int[5][5000];

    @ObfuscatedName("cy.r")
    public static int[] field1335 = new int[1000];

    @ObfuscatedName("cy.v")
    public static String[] field1347 = new String[1000];

    @ObfuscatedName("cy.y")
    public static int field1337 = 0;

    @ObfuscatedName("cy.o")
    public static class63[] field1340 = new class63[50];

    @ObfuscatedName("cy.b")
    public static Calendar field1330 = Calendar.getInstance();

    @ObfuscatedName("cy.f")
    public static final String[] field1344 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cy.x")
    public static int field1345 = 0;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fq.d(Lbg;B)V")
    public static void method2853(class69 arg0) {
        method1087(arg0, 200000);
    }

    @ObfuscatedName("bw.k(Lbg;II)V")
    public static void method1087(class69 arg0, int arg1) {
        Object[] var2 = arg0.field847;
        class98 var13;
        if (class220.method1089(arg0.field856)) {
            Statics.field2195 = (class48) var2[0];
            class243 var3 = Statics.field25[Statics.field2195.field624];
            class220 var4 = arg0.field856;
            int var5 = var3.field3293;
            int var6 = var3.field3310;
            int var7 = class225.method1969(var5, var4);
            class98 var8 = class98.method16(var7, var4);
            class98 var9;
            if (var8 == null) {
                int var10 = (var6 + 40000 << 8) + var4.field2797;
                class98 var12 = class98.method16(var10, var4);
                if (var12 == null) {
                    var9 = null;
                } else {
                    var9 = var12;
                }
            } else {
                var9 = var8;
            }
            var13 = var9;
        } else {
            int var14 = (Integer) var2[0];
            class98 var15 = (class98) class98.field1519.method3341((long) var14);
            class98 var16;
            if (var15 == null) {
                byte[] var17 = Statics.field674.method3875(var14, 0);
                if (var17 == null) {
                    var16 = null;
                } else {
                    class98 var18 = class98.method3844(var17);
                    class98.field1519.method3343(var18, (long) var14);
                    var16 = var18;
                }
            } else {
                var16 = var15;
            }
            var13 = var16;
        }
        if (var13 == null) {
            return;
        }
        Statics.field1331 = 0;
        Statics.field1338 = 0;
        int var19 = -1;
        int[] var20 = var13.field1525;
        int[] var21 = var13.field1522;
        byte var22 = -1;
        field1337 = 0;
        try {
            Statics.field1343 = new int[var13.field1523];
            int var23 = 0;
            Statics.field1755 = new String[var13.field1524];
            int var24 = 0;
            for (int var25 = 1; var25 < var2.length; var25++) {
                if (var2[var25] instanceof Integer) {
                    int var26 = (Integer) var2[var25];
                    if (var26 == -2147483647) {
                        var26 = arg0.field848;
                    }
                    if (var26 == -2147483646) {
                        var26 = arg0.field849;
                    }
                    if (var26 == -2147483645) {
                        var26 = arg0.field854 == null ? -1 : arg0.field854.field2739;
                    }
                    if (var26 == -2147483644) {
                        var26 = arg0.field850;
                    }
                    if (var26 == -2147483643) {
                        var26 = arg0.field854 == null ? -1 : arg0.field854.field2660;
                    }
                    if (var26 == -2147483642) {
                        var26 = arg0.field851 == null ? -1 : arg0.field851.field2739;
                    }
                    if (var26 == -2147483641) {
                        var26 = arg0.field851 == null ? -1 : arg0.field851.field2660;
                    }
                    if (var26 == -2147483640) {
                        var26 = arg0.field852;
                    }
                    if (var26 == -2147483639) {
                        var26 = arg0.field845;
                    }
                    Statics.field1343[var23++] = var26;
                } else if (var2[var25] instanceof String) {
                    String var27 = (String) var2[var25];
                    if (var27.equals("event_opbase")) {
                        var27 = arg0.field853;
                    }
                    Statics.field1755[var24++] = var27;
                }
            }
            int var28 = 0;
            field1345 = arg0.field855;
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
                                                                                                                label1496: while (true) {
                                                                                                                    var28++;
                                                                                                                    if (var28 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var19++;
                                                                                                                    int var263 = var20[var19];
                                                                                                                    if (var263 >= 100) {
                                                                                                                        boolean var70;
                                                                                                                        if (var13.field1522[var19] == 1) {
                                                                                                                            var70 = true;
                                                                                                                        } else {
                                                                                                                            var70 = false;
                                                                                                                        }
                                                                                                                        int var86;
                                                                                                                        if (var263 < 1000) {
                                                                                                                            byte var78;
                                                                                                                            if (var263 == 100) {
                                                                                                                                Statics.field1331 -= 3;
                                                                                                                                int var71 = field1335[Statics.field1331];
                                                                                                                                int var72 = field1335[Statics.field1331 + 1];
                                                                                                                                int var73 = field1335[Statics.field1331 + 2];
                                                                                                                                if (var72 == 0) {
                                                                                                                                    throw new RuntimeException();
                                                                                                                                }
                                                                                                                                class217 var74 = class217.method3237(var71);
                                                                                                                                if (var74.field2705 == null) {
                                                                                                                                    var74.field2705 = new class217[var73 + 1];
                                                                                                                                }
                                                                                                                                if (var74.field2705.length <= var73) {
                                                                                                                                    class217[] var75 = new class217[var73 + 1];
                                                                                                                                    for (int var76 = 0; var76 < var74.field2705.length; var76++) {
                                                                                                                                        var75[var76] = var74.field2705[var76];
                                                                                                                                    }
                                                                                                                                    var74.field2705 = var75;
                                                                                                                                }
                                                                                                                                if (var73 > 0 && var74.field2705[var73 - 1] == null) {
                                                                                                                                    throw new RuntimeException("" + (var73 - 1));
                                                                                                                                }
                                                                                                                                class217 var77 = new class217();
                                                                                                                                var77.field2661 = var72;
                                                                                                                                var77.field2678 = var77.field2739 = var74.field2739;
                                                                                                                                var77.field2660 = var73;
                                                                                                                                var77.field2680 = true;
                                                                                                                                var74.field2705[var73] = var77;
                                                                                                                                if (var70) {
                                                                                                                                    Statics.field1342 = var77;
                                                                                                                                } else {
                                                                                                                                    Statics.field1341 = var77;
                                                                                                                                }
                                                                                                                                client.method165(var74);
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var263 == 101) {
                                                                                                                                class217 var79 = var70 ? Statics.field1342 : Statics.field1341;
                                                                                                                                class217 var80 = class217.method3237(var79.field2739);
                                                                                                                                var80.field2705[var79.field2660] = null;
                                                                                                                                client.method165(var80);
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var263 == 102) {
                                                                                                                                class217 var81 = class217.method3237(field1335[--Statics.field1331]);
                                                                                                                                var81.field2705 = null;
                                                                                                                                client.method165(var81);
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var263 == 200) {
                                                                                                                                Statics.field1331 -= 2;
                                                                                                                                int var82 = field1335[Statics.field1331];
                                                                                                                                int var83 = field1335[Statics.field1331 + 1];
                                                                                                                                class217 var84 = class217.method19(var82, var83);
                                                                                                                                if (var84 == null || var83 == -1) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 1;
                                                                                                                                    if (var70) {
                                                                                                                                        Statics.field1342 = var84;
                                                                                                                                    } else {
                                                                                                                                        Statics.field1341 = var84;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var263 == 201) {
                                                                                                                                class217 var85 = class217.method3237(field1335[--Statics.field1331]);
                                                                                                                                if (var85 == null) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 1;
                                                                                                                                    if (var70) {
                                                                                                                                        Statics.field1342 = var85;
                                                                                                                                    } else {
                                                                                                                                        Statics.field1341 = var85;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var78 = 1;
                                                                                                                            } else {
                                                                                                                                var78 = 2;
                                                                                                                            }
                                                                                                                            var86 = var78;
                                                                                                                        } else if (var263 < 1100) {
                                                                                                                            var86 = method1032(var263, var13, var70);
                                                                                                                        } else if (var263 < 1200) {
                                                                                                                            var86 = method484(var263, var13, var70);
                                                                                                                        } else if (var263 < 1300) {
                                                                                                                            var86 = method1450(var263, var13, var70);
                                                                                                                        } else if (var263 < 1400) {
                                                                                                                            var86 = method2756(var263, var13, var70);
                                                                                                                        } else if (var263 < 1500) {
                                                                                                                            var86 = method164(var263, var13, var70);
                                                                                                                        } else if (var263 < 1600) {
                                                                                                                            var86 = method3861(var263, var13, var70);
                                                                                                                        } else if (var263 < 1700) {
                                                                                                                            class217 var87 = var70 ? Statics.field1342 : Statics.field1341;
                                                                                                                            byte var88;
                                                                                                                            if (var263 == 1600) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2695;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1601) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2774;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1602) {
                                                                                                                                field1347[++Statics.field1338 - 1] = var87.field2734;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1603) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2685;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1604) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2683;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1605) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2664;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1606) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2710;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1607) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2733;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1608) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2711;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1609) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2690;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1610) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2691;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1611) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2659;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1612) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2780;
                                                                                                                                var88 = 1;
                                                                                                                            } else if (var263 == 1613) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var87.field2689.method12();
                                                                                                                                var88 = 1;
                                                                                                                            } else {
                                                                                                                                var88 = 2;
                                                                                                                            }
                                                                                                                            var86 = var88;
                                                                                                                        } else if (var263 < 1800) {
                                                                                                                            var86 = method1090(var263, var13, var70);
                                                                                                                        } else if (var263 < 1900) {
                                                                                                                            class217 var89 = var70 ? Statics.field1342 : Statics.field1341;
                                                                                                                            byte var94;
                                                                                                                            if (var263 == 1800) {
                                                                                                                                int[] var90 = field1335;
                                                                                                                                int var91 = ++Statics.field1331 - 1;
                                                                                                                                int var92 = client.method4068(var89);
                                                                                                                                int var93 = var92 >> 11 & 0x3F;
                                                                                                                                var90[var91] = var93;
                                                                                                                                var94 = 1;
                                                                                                                            } else if (var263 == 1801) {
                                                                                                                                int var95 = field1335[--Statics.field1331];
                                                                                                                                int var264 = var95 - 1;
                                                                                                                                if (var89.field2706 == null || var264 >= var89.field2706.length || var89.field2706[var264] == null) {
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field1338 - 1] = var89.field2706[var264];
                                                                                                                                }
                                                                                                                                var94 = 1;
                                                                                                                            } else if (var263 == 1802) {
                                                                                                                                if (var89.field2732 == null) {
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field1338 - 1] = var89.field2732;
                                                                                                                                }
                                                                                                                                var94 = 1;
                                                                                                                            } else {
                                                                                                                                var94 = 2;
                                                                                                                            }
                                                                                                                            var86 = var94;
                                                                                                                        } else if (var263 < 2000) {
                                                                                                                            var86 = method645(var263, var13, var70);
                                                                                                                        } else if (var263 < 2100) {
                                                                                                                            var86 = method1032(var263, var13, var70);
                                                                                                                        } else if (var263 < 2200) {
                                                                                                                            var86 = method484(var263, var13, var70);
                                                                                                                        } else if (var263 < 2300) {
                                                                                                                            var86 = method1450(var263, var13, var70);
                                                                                                                        } else if (var263 < 2400) {
                                                                                                                            var86 = method2756(var263, var13, var70);
                                                                                                                        } else if (var263 < 2500) {
                                                                                                                            var86 = method164(var263, var13, var70);
                                                                                                                        } else if (var263 < 2600) {
                                                                                                                            var86 = method453(var263, var13, var70);
                                                                                                                        } else if (var263 < 2700) {
                                                                                                                            class217 var96 = class217.method3237(field1335[--Statics.field1331]);
                                                                                                                            byte var97;
                                                                                                                            if (var263 == 2600) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2695;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2601) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2774;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2602) {
                                                                                                                                field1347[++Statics.field1338 - 1] = var96.field2734;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2603) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2685;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2604) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2683;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2605) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2664;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2606) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2710;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2607) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2733;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2608) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2711;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2609) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2690;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2610) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2691;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2611) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2659;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2612) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2780;
                                                                                                                                var97 = 1;
                                                                                                                            } else if (var263 == 2613) {
                                                                                                                                field1335[++Statics.field1331 - 1] = var96.field2689.method12();
                                                                                                                                var97 = 1;
                                                                                                                            } else {
                                                                                                                                var97 = 2;
                                                                                                                            }
                                                                                                                            var86 = var97;
                                                                                                                        } else if (var263 < 2800) {
                                                                                                                            var86 = method4128(var263, var13, var70);
                                                                                                                        } else if (var263 < 2900) {
                                                                                                                            class217 var98 = class217.method3237(field1335[--Statics.field1331]);
                                                                                                                            byte var103;
                                                                                                                            if (var263 == 2800) {
                                                                                                                                int[] var99 = field1335;
                                                                                                                                int var100 = ++Statics.field1331 - 1;
                                                                                                                                int var101 = client.method4068(var98);
                                                                                                                                int var102 = var101 >> 11 & 0x3F;
                                                                                                                                var99[var100] = var102;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var263 == 2801) {
                                                                                                                                int var104 = field1335[--Statics.field1331];
                                                                                                                                int var265 = var104 - 1;
                                                                                                                                if (var98.field2706 == null || var265 >= var98.field2706.length || var98.field2706[var265] == null) {
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field1338 - 1] = var98.field2706[var265];
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var263 == 2802) {
                                                                                                                                if (var98.field2732 == null) {
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field1338 - 1] = var98.field2732;
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else {
                                                                                                                                var103 = 2;
                                                                                                                            }
                                                                                                                            var86 = var103;
                                                                                                                        } else if (var263 < 3000) {
                                                                                                                            var86 = method645(var263, var13, var70);
                                                                                                                        } else if (var263 < 3200) {
                                                                                                                            byte var106;
                                                                                                                            if (var263 == 3100) {
                                                                                                                                String var105 = field1347[--Statics.field1338];
                                                                                                                                class97.method1053(0, "", var105);
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3101) {
                                                                                                                                Statics.field1331 -= 2;
                                                                                                                                client.method6(Statics.field2427, field1335[Statics.field1331], field1335[Statics.field1331 + 1]);
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3103) {
                                                                                                                                client.method3972();
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3104) {
                                                                                                                                String var107 = field1347[--Statics.field1338];
                                                                                                                                int var108 = 0;
                                                                                                                                if (class271.method3859(var107)) {
                                                                                                                                    int var109 = class271.method536(var107, 10, true);
                                                                                                                                    var108 = var109;
                                                                                                                                }
                                                                                                                                client.field965.method3210(54);
                                                                                                                                client.field965.method2942(var108);
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3105) {
                                                                                                                                String var110 = field1347[--Statics.field1338];
                                                                                                                                client.field965.method3210(198);
                                                                                                                                client.field965.method2970(var110.length() + 1);
                                                                                                                                client.field965.method3041(var110);
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3106) {
                                                                                                                                String var111 = field1347[--Statics.field1338];
                                                                                                                                client.field965.method3210(94);
                                                                                                                                client.field965.method2970(var111.length() + 1);
                                                                                                                                client.field965.method3041(var111);
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3107) {
                                                                                                                                int var112 = field1335[--Statics.field1331];
                                                                                                                                String var113 = field1347[--Statics.field1338];
                                                                                                                                int var114 = class95.field1486;
                                                                                                                                int[] var115 = class95.field1481;
                                                                                                                                boolean var116 = false;
                                                                                                                                for (int var117 = 0; var117 < var114; var117++) {
                                                                                                                                    class74 var118 = client.field1034[var115[var117]];
                                                                                                                                    if (var118 != null && Statics.field2427 != var118 && var118.field896 != null && var118.field896.equalsIgnoreCase(var113)) {
                                                                                                                                        if (var112 == 1) {
                                                                                                                                            client.field965.method3210(166);
                                                                                                                                            client.field965.method2981(0);
                                                                                                                                            client.field965.method3084(var115[var117]);
                                                                                                                                        } else if (var112 == 4) {
                                                                                                                                            client.field965.method3210(120);
                                                                                                                                            client.field965.method2989(var115[var117]);
                                                                                                                                            client.field965.method2981(0);
                                                                                                                                        } else if (var112 == 6) {
                                                                                                                                            client.field965.method3210(5);
                                                                                                                                            client.field965.method2981(0);
                                                                                                                                            client.field965.method2989(var115[var117]);
                                                                                                                                        } else if (var112 == 7) {
                                                                                                                                            client.field965.method3210(4);
                                                                                                                                            client.field965.method2981(0);
                                                                                                                                            client.field965.method2989(var115[var117]);
                                                                                                                                        }
                                                                                                                                        var116 = true;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (!var116) {
                                                                                                                                    class97.method1053(4, "", class226.field3006 + var113);
                                                                                                                                }
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3108) {
                                                                                                                                Statics.field1331 -= 3;
                                                                                                                                int var119 = field1335[Statics.field1331];
                                                                                                                                int var120 = field1335[Statics.field1331 + 1];
                                                                                                                                int var121 = field1335[Statics.field1331 + 2];
                                                                                                                                class217 var122 = class217.method3237(var121);
                                                                                                                                client.method5(var122, var119, var120);
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3109) {
                                                                                                                                Statics.field1331 -= 2;
                                                                                                                                int var123 = field1335[Statics.field1331];
                                                                                                                                int var124 = field1335[Statics.field1331 + 1];
                                                                                                                                class217 var125 = var70 ? Statics.field1342 : Statics.field1341;
                                                                                                                                client.method5(var125, var123, var124);
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3110) {
                                                                                                                                Statics.field1651 = field1335[--Statics.field1331] == 1;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3111) {
                                                                                                                                field1335[++Statics.field1331 - 1] = Statics.field355.field1304 ? 1 : 0;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3112) {
                                                                                                                                Statics.field355.field1304 = field1335[--Statics.field1331] == 1;
                                                                                                                                class80.method51();
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3113) {
                                                                                                                                String var126 = field1347[--Statics.field1338];
                                                                                                                                boolean var127 = field1335[--Statics.field1331] == 1;
                                                                                                                                class57.method1096(var126, var127, false);
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3115) {
                                                                                                                                int var128 = field1335[--Statics.field1331];
                                                                                                                                client.field965.method3210(113);
                                                                                                                                client.field965.method2940(var128);
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var263 == 3116) {
                                                                                                                                int var129 = field1335[--Statics.field1331];
                                                                                                                                Statics.field1338 -= 2;
                                                                                                                                String var130 = field1347[Statics.field1338];
                                                                                                                                String var131 = field1347[Statics.field1338 + 1];
                                                                                                                                if (var130.length() > 500) {
                                                                                                                                    var106 = 1;
                                                                                                                                } else if (var131.length() > 500) {
                                                                                                                                    var106 = 1;
                                                                                                                                } else {
                                                                                                                                    client.field965.method3210(58);
                                                                                                                                    client.field965.method2940(1 + class174.method2869(var130) + class174.method2869(var131));
                                                                                                                                    client.field965.method2981(var129);
                                                                                                                                    client.field965.method3041(var131);
                                                                                                                                    client.field965.method3041(var130);
                                                                                                                                    var106 = 1;
                                                                                                                                }
                                                                                                                            } else if (var263 == 3117) {
                                                                                                                                client.field1185 = field1335[--Statics.field1331] == 1;
                                                                                                                                var106 = 1;
                                                                                                                            } else {
                                                                                                                                var106 = 2;
                                                                                                                            }
                                                                                                                            var86 = var106;
                                                                                                                        } else if (var263 < 3300) {
                                                                                                                            var86 = method1064(var263, var13, var70);
                                                                                                                        } else if (var263 < 3400) {
                                                                                                                            byte var132;
                                                                                                                            if (var263 == 3300) {
                                                                                                                                field1335[++Statics.field1331 - 1] = client.field931;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3301) {
                                                                                                                                Statics.field1331 -= 2;
                                                                                                                                int var133 = field1335[Statics.field1331];
                                                                                                                                int var134 = field1335[Statics.field1331 + 1];
                                                                                                                                field1335[++Statics.field1331 - 1] = class64.method534(var133, var134);
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3302) {
                                                                                                                                Statics.field1331 -= 2;
                                                                                                                                int var135 = field1335[Statics.field1331];
                                                                                                                                int var136 = field1335[Statics.field1331 + 1];
                                                                                                                                int[] var137 = field1335;
                                                                                                                                int var138 = ++Statics.field1331 - 1;
                                                                                                                                class64 var139 = (class64) class64.field799.method3352((long) var135);
                                                                                                                                int var140;
                                                                                                                                if (var139 == null) {
                                                                                                                                    var140 = 0;
                                                                                                                                } else if (var136 >= 0 && var136 < var139.field801.length) {
                                                                                                                                    var140 = var139.field801[var136];
                                                                                                                                } else {
                                                                                                                                    var140 = 0;
                                                                                                                                }
                                                                                                                                var137[var138] = var140;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3303) {
                                                                                                                                Statics.field1331 -= 2;
                                                                                                                                int var141 = field1335[Statics.field1331];
                                                                                                                                int var142 = field1335[Statics.field1331 + 1];
                                                                                                                                int[] var143 = field1335;
                                                                                                                                int var144 = ++Statics.field1331 - 1;
                                                                                                                                class64 var145 = (class64) class64.field799.method3352((long) var141);
                                                                                                                                int var146;
                                                                                                                                if (var145 == null) {
                                                                                                                                    var146 = 0;
                                                                                                                                } else if (var142 == -1) {
                                                                                                                                    var146 = 0;
                                                                                                                                } else {
                                                                                                                                    int var147 = 0;
                                                                                                                                    for (int var148 = 0; var148 < var145.field801.length; var148++) {
                                                                                                                                        if (var145.field796[var148] == var142) {
                                                                                                                                            var147 += var145.field801[var148];
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var146 = var147;
                                                                                                                                }
                                                                                                                                var143[var144] = var146;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3304) {
                                                                                                                                int var149 = field1335[--Statics.field1331];
                                                                                                                                field1335[++Statics.field1331 - 1] = class241.method2727(var149).field3281;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3305) {
                                                                                                                                int var150 = field1335[--Statics.field1331];
                                                                                                                                field1335[++Statics.field1331 - 1] = client.field1005[var150];
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3306) {
                                                                                                                                int var151 = field1335[--Statics.field1331];
                                                                                                                                field1335[++Statics.field1331 - 1] = client.field1049[var151];
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3307) {
                                                                                                                                int var152 = field1335[--Statics.field1331];
                                                                                                                                field1335[++Statics.field1331 - 1] = client.field1050[var152];
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3308) {
                                                                                                                                int var153 = Statics.field44;
                                                                                                                                int var154 = (Statics.field2427.field1243 >> 7) + Statics.field2122;
                                                                                                                                int var155 = (Statics.field2427.field1209 >> 7) + Statics.field1505;
                                                                                                                                field1335[++Statics.field1331 - 1] = (var153 << 28) + (var154 << 14) + var155;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3309) {
                                                                                                                                int var156 = field1335[--Statics.field1331];
                                                                                                                                field1335[++Statics.field1331 - 1] = var156 >> 14 & 0x3FFF;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3310) {
                                                                                                                                int var157 = field1335[--Statics.field1331];
                                                                                                                                field1335[++Statics.field1331 - 1] = var157 >> 28;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3311) {
                                                                                                                                int var158 = field1335[--Statics.field1331];
                                                                                                                                field1335[++Statics.field1331 - 1] = var158 & 0x3FFF;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3312) {
                                                                                                                                field1335[++Statics.field1331 - 1] = client.field925 ? 1 : 0;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3313) {
                                                                                                                                Statics.field1331 -= 2;
                                                                                                                                int var159 = field1335[Statics.field1331] + 32768;
                                                                                                                                int var160 = field1335[Statics.field1331 + 1];
                                                                                                                                field1335[++Statics.field1331 - 1] = class64.method534(var159, var160);
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3314) {
                                                                                                                                Statics.field1331 -= 2;
                                                                                                                                int var161 = field1335[Statics.field1331] + 32768;
                                                                                                                                int var162 = field1335[Statics.field1331 + 1];
                                                                                                                                int[] var163 = field1335;
                                                                                                                                int var164 = ++Statics.field1331 - 1;
                                                                                                                                class64 var165 = (class64) class64.field799.method3352((long) var161);
                                                                                                                                int var166;
                                                                                                                                if (var165 == null) {
                                                                                                                                    var166 = 0;
                                                                                                                                } else if (var162 >= 0 && var162 < var165.field801.length) {
                                                                                                                                    var166 = var165.field801[var162];
                                                                                                                                } else {
                                                                                                                                    var166 = 0;
                                                                                                                                }
                                                                                                                                var163[var164] = var166;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3315) {
                                                                                                                                Statics.field1331 -= 2;
                                                                                                                                int var167 = field1335[Statics.field1331] + 32768;
                                                                                                                                int var168 = field1335[Statics.field1331 + 1];
                                                                                                                                int[] var169 = field1335;
                                                                                                                                int var170 = ++Statics.field1331 - 1;
                                                                                                                                class64 var171 = (class64) class64.field799.method3352((long) var167);
                                                                                                                                int var172;
                                                                                                                                if (var171 == null) {
                                                                                                                                    var172 = 0;
                                                                                                                                } else if (var168 == -1) {
                                                                                                                                    var172 = 0;
                                                                                                                                } else {
                                                                                                                                    int var173 = 0;
                                                                                                                                    for (int var174 = 0; var174 < var171.field801.length; var174++) {
                                                                                                                                        if (var171.field796[var174] == var168) {
                                                                                                                                            var173 += var171.field801[var174];
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var172 = var173;
                                                                                                                                }
                                                                                                                                var169[var170] = var172;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3316) {
                                                                                                                                if (client.field1081 >= 2) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = client.field1081;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 0;
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3317) {
                                                                                                                                field1335[++Statics.field1331 - 1] = client.field984;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3318) {
                                                                                                                                field1335[++Statics.field1331 - 1] = client.field1121;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3321) {
                                                                                                                                field1335[++Statics.field1331 - 1] = client.field1079;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3322) {
                                                                                                                                field1335[++Statics.field1331 - 1] = client.field1080;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3323) {
                                                                                                                                if (client.field1083) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 1;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 0;
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3324) {
                                                                                                                                field1335[++Statics.field1331 - 1] = client.field955;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var263 == 3325) {
                                                                                                                                Statics.field1331 -= 4;
                                                                                                                                int var175 = field1335[Statics.field1331];
                                                                                                                                int var176 = field1335[Statics.field1331 + 1];
                                                                                                                                int var177 = field1335[Statics.field1331 + 2];
                                                                                                                                int var178 = field1335[Statics.field1331 + 3];
                                                                                                                                int var179 = (var176 << 14) + var175;
                                                                                                                                int var180 = (var177 << 28) + var179;
                                                                                                                                int var181 = var178 + var180;
                                                                                                                                field1335[++Statics.field1331 - 1] = var181;
                                                                                                                                var132 = 1;
                                                                                                                            } else {
                                                                                                                                var132 = 2;
                                                                                                                            }
                                                                                                                            var86 = var132;
                                                                                                                        } else if (var263 < 3500) {
                                                                                                                            var86 = Statics.method533(var263, var13, var70);
                                                                                                                        } else if (var263 < 3700) {
                                                                                                                            byte var182;
                                                                                                                            if (var263 == 3600) {
                                                                                                                                if (client.field1181 == 0) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = -2;
                                                                                                                                } else if (client.field1181 == 1) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = client.field952;
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3601) {
                                                                                                                                int var183 = field1335[--Statics.field1331];
                                                                                                                                if (client.field1181 == 2 && var183 < client.field952) {
                                                                                                                                    field1347[++Statics.field1338 - 1] = client.field1182[var183].field827;
                                                                                                                                    field1347[++Statics.field1338 - 1] = client.field1182[var183].field821;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3602) {
                                                                                                                                int var184 = field1335[--Statics.field1331];
                                                                                                                                if (client.field1181 == 2 && var184 < client.field952) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = client.field1182[var184].field822;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 0;
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3603) {
                                                                                                                                int var185 = field1335[--Statics.field1331];
                                                                                                                                if (client.field1181 == 2 && var185 < client.field952) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = client.field1182[var185].field823;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 0;
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3604) {
                                                                                                                                String var186 = field1347[--Statics.field1338];
                                                                                                                                int var187 = field1335[--Statics.field1331];
                                                                                                                                client.method2198(var186, var187);
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3605) {
                                                                                                                                String var188 = field1347[--Statics.field1338];
                                                                                                                                client.method470(var188);
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3606) {
                                                                                                                                String var189 = field1347[--Statics.field1338];
                                                                                                                                if (var189 != null) {
                                                                                                                                    String var190 = class268.method3677(var189, Statics.field43);
                                                                                                                                    if (var190 != null) {
                                                                                                                                        for (int var191 = 0; var191 < client.field952; var191++) {
                                                                                                                                            class66 var192 = client.field1182[var191];
                                                                                                                                            String var193 = var192.field827;
                                                                                                                                            String var194 = class268.method3677(var193, Statics.field43);
                                                                                                                                            boolean var195;
                                                                                                                                            if (var189 == null || var193 == null) {
                                                                                                                                                var195 = false;
                                                                                                                                            } else if (var189.startsWith("#") || var193.startsWith("#")) {
                                                                                                                                                var195 = var189.equals(var193);
                                                                                                                                            } else {
                                                                                                                                                var195 = var190.equals(var194);
                                                                                                                                            }
                                                                                                                                            if (var195) {
                                                                                                                                                client.field952--;
                                                                                                                                                for (int var196 = var191; var196 < client.field952; var196++) {
                                                                                                                                                    client.field1182[var196] = client.field1182[var196 + 1];
                                                                                                                                                }
                                                                                                                                                client.field1107 = client.field1099;
                                                                                                                                                client.field965.method3210(242);
                                                                                                                                                client.field965.method2970(class174.method2869(var189));
                                                                                                                                                client.field965.method3041(var189);
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3607) {
                                                                                                                                String var197 = field1347[--Statics.field1338];
                                                                                                                                if (var197 != null) {
                                                                                                                                    if ((client.field1183 < 100 || client.field1036 == 1) && client.field1183 < 400) {
                                                                                                                                        String var198 = class268.method3677(var197, Statics.field43);
                                                                                                                                        if (var198 != null) {
                                                                                                                                            int var199 = 0;
                                                                                                                                            label1218: while (true) {
                                                                                                                                                if (var199 >= client.field1183) {
                                                                                                                                                    for (int var203 = 0; var203 < client.field952; var203++) {
                                                                                                                                                        class66 var204 = client.field1182[var203];
                                                                                                                                                        String var205 = class268.method3677(var204.field827, Statics.field43);
                                                                                                                                                        if (var205 != null && var205.equals(var198)) {
                                                                                                                                                            class97.method1053(31, "", class226.field3031 + var197 + class226.field3032);
                                                                                                                                                            break label1218;
                                                                                                                                                        }
                                                                                                                                                        if (var204.field821 != null) {
                                                                                                                                                            String var206 = class268.method3677(var204.field821, Statics.field43);
                                                                                                                                                            if (var206 != null && var206.equals(var198)) {
                                                                                                                                                                class97.method1053(31, "", class226.field3031 + var197 + class226.field3032);
                                                                                                                                                                break label1218;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (class268.method3677(Statics.field2427.field896, Statics.field43).equals(var198)) {
                                                                                                                                                        class97.method1053(31, "", class226.field3086);
                                                                                                                                                    } else {
                                                                                                                                                        client.field965.method3210(159);
                                                                                                                                                        client.field965.method2970(class174.method2869(var197));
                                                                                                                                                        client.field965.method3041(var197);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                class70 var200 = client.field1055[var199];
                                                                                                                                                String var201 = class268.method3677(var200.field857, Statics.field43);
                                                                                                                                                if (var201 != null && var201.equals(var198)) {
                                                                                                                                                    class97.method1053(31, "", var197 + class226.field3017);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                if (var200.field858 != null) {
                                                                                                                                                    String var202 = class268.method3677(var200.field858, Statics.field43);
                                                                                                                                                    if (var202 != null && var202.equals(var198)) {
                                                                                                                                                        class97.method1053(31, "", var197 + class226.field3017);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var199++;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        class97.method1053(31, "", class226.field3025);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3608) {
                                                                                                                                String var207 = field1347[--Statics.field1338];
                                                                                                                                if (var207 != null) {
                                                                                                                                    String var208 = class268.method3677(var207, Statics.field43);
                                                                                                                                    if (var208 != null) {
                                                                                                                                        for (int var209 = 0; var209 < client.field1183; var209++) {
                                                                                                                                            class70 var210 = client.field1055[var209];
                                                                                                                                            String var211 = var210.field857;
                                                                                                                                            String var212 = class268.method3677(var211, Statics.field43);
                                                                                                                                            boolean var213;
                                                                                                                                            if (var207 == null || var211 == null) {
                                                                                                                                                var213 = false;
                                                                                                                                            } else if (var207.startsWith("#") || var211.startsWith("#")) {
                                                                                                                                                var213 = var207.equals(var211);
                                                                                                                                            } else {
                                                                                                                                                var213 = var208.equals(var212);
                                                                                                                                            }
                                                                                                                                            if (var213) {
                                                                                                                                                client.field1183--;
                                                                                                                                                for (int var214 = var209; var214 < client.field1183; var214++) {
                                                                                                                                                    client.field1055[var214] = client.field1055[var214 + 1];
                                                                                                                                                }
                                                                                                                                                client.field1107 = client.field1099;
                                                                                                                                                client.field965.method3210(79);
                                                                                                                                                client.field965.method2970(class174.method2869(var207));
                                                                                                                                                client.field965.method3041(var207);
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3609) {
                                                                                                                                String var215 = field1347[--Statics.field1338];
                                                                                                                                class231[] var216 = class231.method1094();
                                                                                                                                for (int var217 = 0; var217 < var216.length; var217++) {
                                                                                                                                    class231 var218 = var216[var217];
                                                                                                                                    if (var218.field3182 != -1) {
                                                                                                                                        int var220 = var218.field3182;
                                                                                                                                        String var221 = "<img=" + var220 + ">";
                                                                                                                                        if (var215.startsWith(var221)) {
                                                                                                                                            var215 = var215.substring(6 + Integer.toString(var218.field3182).length());
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1335[++Statics.field1331 - 1] = client.method561(var215, false) ? 1 : 0;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3611) {
                                                                                                                                if (client.field978 == null) {
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field1338 - 1] = class269.method3504(client.field978);
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3612) {
                                                                                                                                if (client.field978 == null) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = Statics.field350;
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3613) {
                                                                                                                                int var222 = field1335[--Statics.field1331];
                                                                                                                                if (client.field978 == null || var222 >= Statics.field350) {
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field1338 - 1] = Statics.field451[var222].field910;
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3614) {
                                                                                                                                int var223 = field1335[--Statics.field1331];
                                                                                                                                if (client.field978 == null || var223 >= Statics.field350) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = Statics.field451[var223].field912;
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3615) {
                                                                                                                                int var224 = field1335[--Statics.field1331];
                                                                                                                                if (client.field978 == null || var224 >= Statics.field350) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = Statics.field451[var224].field913;
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3616) {
                                                                                                                                field1335[++Statics.field1331 - 1] = Statics.field619;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3617) {
                                                                                                                                String var225 = field1347[--Statics.field1338];
                                                                                                                                client.method2749(var225);
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3618) {
                                                                                                                                field1335[++Statics.field1331 - 1] = Statics.field2161;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3619) {
                                                                                                                                String var226 = field1347[--Statics.field1338];
                                                                                                                                if (!var226.equals("")) {
                                                                                                                                    client.field965.method3210(141);
                                                                                                                                    client.field965.method2970(class174.method2869(var226));
                                                                                                                                    client.field965.method3041(var226);
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3620) {
                                                                                                                                client.field965.method3210(141);
                                                                                                                                client.field965.method2970(0);
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3621) {
                                                                                                                                if (client.field1181 == 0) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = client.field1183;
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3622) {
                                                                                                                                int var227 = field1335[--Statics.field1331];
                                                                                                                                if (client.field1181 == 0 || var227 >= client.field1183) {
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field1338 - 1] = client.field1055[var227].field857;
                                                                                                                                    field1347[++Statics.field1338 - 1] = client.field1055[var227].field858;
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3623) {
                                                                                                                                String var228;
                                                                                                                                label1300: {
                                                                                                                                    var228 = field1347[--Statics.field1338];
                                                                                                                                    String var230 = "<img=0>";
                                                                                                                                    if (!var228.startsWith(var230)) {
                                                                                                                                        String var232 = "<img=1>";
                                                                                                                                        if (!var228.startsWith(var232)) {
                                                                                                                                            break label1300;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var228 = var228.substring(7);
                                                                                                                                }
                                                                                                                                field1335[++Statics.field1331 - 1] = client.method2868(var228) ? 1 : 0;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3624) {
                                                                                                                                int var233 = field1335[--Statics.field1331];
                                                                                                                                if (Statics.field451 == null || var233 >= Statics.field350 || !Statics.field451[var233].field910.equalsIgnoreCase(Statics.field2427.field896)) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = 1;
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var263 == 3625) {
                                                                                                                                if (client.field1140 == null) {
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field1338 - 1] = class269.method3504(client.field1140);
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else {
                                                                                                                                var182 = 2;
                                                                                                                            }
                                                                                                                            var86 = var182;
                                                                                                                        } else if (var263 < 4000) {
                                                                                                                            var86 = method685(var263, var13, var70);
                                                                                                                        } else if (var263 < 4100) {
                                                                                                                            var86 = method2219(var263, var13, var70);
                                                                                                                        } else if (var263 < 4200) {
                                                                                                                            var86 = method687(var263, var13, var70);
                                                                                                                        } else if (var263 < 4300) {
                                                                                                                            byte var235;
                                                                                                                            if (var263 == 4200) {
                                                                                                                                int var234 = field1335[--Statics.field1331];
                                                                                                                                field1347[++Statics.field1338 - 1] = class257.method637(var234).field3499;
                                                                                                                                var235 = 1;
                                                                                                                            } else if (var263 == 4201) {
                                                                                                                                Statics.field1331 -= 2;
                                                                                                                                int var236 = field1335[Statics.field1331];
                                                                                                                                int var237 = field1335[Statics.field1331 + 1];
                                                                                                                                class257 var238 = class257.method637(var236);
                                                                                                                                if (var237 < 1 || var237 > 5 || var238.field3534[var237 - 1] == null) {
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field1338 - 1] = var238.field3534[var237 - 1];
                                                                                                                                }
                                                                                                                                var235 = 1;
                                                                                                                            } else if (var263 == 4202) {
                                                                                                                                Statics.field1331 -= 2;
                                                                                                                                int var239 = field1335[Statics.field1331];
                                                                                                                                int var240 = field1335[Statics.field1331 + 1];
                                                                                                                                class257 var241 = class257.method637(var239);
                                                                                                                                if (var240 < 1 || var240 > 5 || var241.field3514[var240 - 1] == null) {
                                                                                                                                    field1347[++Statics.field1338 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field1338 - 1] = var241.field3514[var240 - 1];
                                                                                                                                }
                                                                                                                                var235 = 1;
                                                                                                                            } else if (var263 == 4203) {
                                                                                                                                int var242 = field1335[--Statics.field1331];
                                                                                                                                field1335[++Statics.field1331 - 1] = class257.method637(var242).field3511;
                                                                                                                                var235 = 1;
                                                                                                                            } else if (var263 == 4204) {
                                                                                                                                int var243 = field1335[--Statics.field1331];
                                                                                                                                field1335[++Statics.field1331 - 1] = class257.method637(var243).field3512 == 1 ? 1 : 0;
                                                                                                                                var235 = 1;
                                                                                                                            } else if (var263 == 4205) {
                                                                                                                                int var244 = field1335[--Statics.field1331];
                                                                                                                                class257 var245 = class257.method637(var244);
                                                                                                                                if (var245.field3537 == -1 && var245.field3530 >= 0) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = var245.field3530;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = var244;
                                                                                                                                }
                                                                                                                                var235 = 1;
                                                                                                                            } else if (var263 == 4206) {
                                                                                                                                int var246 = field1335[--Statics.field1331];
                                                                                                                                class257 var247 = class257.method637(var246);
                                                                                                                                if (var247.field3537 >= 0 && var247.field3530 >= 0) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = var247.field3530;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = var246;
                                                                                                                                }
                                                                                                                                var235 = 1;
                                                                                                                            } else if (var263 == 4207) {
                                                                                                                                int var248 = field1335[--Statics.field1331];
                                                                                                                                field1335[++Statics.field1331 - 1] = class257.method637(var248).field3508 ? 1 : 0;
                                                                                                                                var235 = 1;
                                                                                                                            } else if (var263 == 4208) {
                                                                                                                                int var249 = field1335[--Statics.field1331];
                                                                                                                                class257 var250 = class257.method637(var249);
                                                                                                                                if (var250.field3543 == -1 && var250.field3542 >= 0) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = var250.field3542;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = var249;
                                                                                                                                }
                                                                                                                                var235 = 1;
                                                                                                                            } else if (var263 == 4209) {
                                                                                                                                int var251 = field1335[--Statics.field1331];
                                                                                                                                class257 var252 = class257.method637(var251);
                                                                                                                                if (var252.field3543 >= 0 && var252.field3542 >= 0) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = var252.field3542;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = var251;
                                                                                                                                }
                                                                                                                                var235 = 1;
                                                                                                                            } else if (var263 == 4210) {
                                                                                                                                String var253 = field1347[--Statics.field1338];
                                                                                                                                int var254 = field1335[--Statics.field1331];
                                                                                                                                client.method41(var253, var254 == 1);
                                                                                                                                field1335[++Statics.field1331 - 1] = Statics.field371;
                                                                                                                                var235 = 1;
                                                                                                                            } else if (var263 == 4211) {
                                                                                                                                if (Statics.field492 == null || Statics.field102 >= Statics.field371) {
                                                                                                                                    field1335[++Statics.field1331 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1335[++Statics.field1331 - 1] = Statics.field492[++Statics.field102 - 1] & 0xFFFF;
                                                                                                                                }
                                                                                                                                var235 = 1;
                                                                                                                            } else if (var263 == 4212) {
                                                                                                                                Statics.field102 = 0;
                                                                                                                                var235 = 1;
                                                                                                                            } else {
                                                                                                                                var235 = 2;
                                                                                                                            }
                                                                                                                            var86 = var235;
                                                                                                                        } else if (var263 < 5100) {
                                                                                                                            var86 = method11(var263, var13, var70);
                                                                                                                        } else if (var263 < 5400) {
                                                                                                                            byte var255;
                                                                                                                            if (var263 == 5306) {
                                                                                                                                field1335[++Statics.field1331 - 1] = client.method135();
                                                                                                                                var255 = 1;
                                                                                                                            } else if (var263 == 5307) {
                                                                                                                                int var256 = field1335[--Statics.field1331];
                                                                                                                                if (var256 == 1 || var256 == 2) {
                                                                                                                                    client.method1034(var256);
                                                                                                                                }
                                                                                                                                var255 = 1;
                                                                                                                            } else if (var263 == 5308) {
                                                                                                                                field1335[++Statics.field1331 - 1] = Statics.field355.field1306;
                                                                                                                                var255 = 1;
                                                                                                                            } else if (var263 == 5309) {
                                                                                                                                int var257 = field1335[--Statics.field1331];
                                                                                                                                if (var257 == 1 || var257 == 2) {
                                                                                                                                    Statics.field355.field1306 = var257;
                                                                                                                                    class80.method51();
                                                                                                                                }
                                                                                                                                var255 = 1;
                                                                                                                            } else {
                                                                                                                                var255 = 2;
                                                                                                                            }
                                                                                                                            var86 = var255;
                                                                                                                        } else if (var263 < 5600) {
                                                                                                                            var86 = method227(var263, var13, var70);
                                                                                                                        } else if (var263 < 5700) {
                                                                                                                            var86 = method1972(var263, var13, var70);
                                                                                                                        } else if (var263 < 6300) {
                                                                                                                            var86 = method2264(var263, var13, var70);
                                                                                                                        } else if (var263 < 6600) {
                                                                                                                            var86 = method1093(var263, var13, var70);
                                                                                                                        } else if (var263 < 6700) {
                                                                                                                            var86 = method2870(var263, var13, var70);
                                                                                                                        } else {
                                                                                                                            var86 = 2;
                                                                                                                        }
                                                                                                                        switch(var86) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var263 == 0) {
                                                                                                                        field1335[++Statics.field1331 - 1] = var21[var19];
                                                                                                                    } else if (var263 == 1) {
                                                                                                                        int var29 = var21[var19];
                                                                                                                        field1335[++Statics.field1331 - 1] = class212.field2621[var29];
                                                                                                                    } else if (var263 == 2) {
                                                                                                                        int var30 = var21[var19];
                                                                                                                        class212.field2621[var30] = field1335[--Statics.field1331];
                                                                                                                        client.method1038(var30);
                                                                                                                    } else if (var263 == 3) {
                                                                                                                        field1347[++Statics.field1338 - 1] = var13.field1520[var19];
                                                                                                                    } else if (var263 == 6) {
                                                                                                                        var19 += var21[var19];
                                                                                                                    } else if (var263 == 7) {
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        if (field1335[Statics.field1331] != field1335[Statics.field1331 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var263 == 8) {
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        if (field1335[Statics.field1331] == field1335[Statics.field1331 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var263 == 9) {
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        if (field1335[Statics.field1331] < field1335[Statics.field1331 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var263 == 10) {
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        if (field1335[Statics.field1331] > field1335[Statics.field1331 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var263 == 21) {
                                                                                                                        if (field1337 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var31 = field1340[--field1337];
                                                                                                                        var13 = var31.field791;
                                                                                                                        var20 = var13.field1525;
                                                                                                                        var21 = var13.field1522;
                                                                                                                        var19 = var31.field787;
                                                                                                                        Statics.field1343 = var31.field789;
                                                                                                                        Statics.field1755 = var31.field788;
                                                                                                                    } else if (var263 == 25) {
                                                                                                                        int var32 = var21[var19];
                                                                                                                        field1335[++Statics.field1331 - 1] = class212.method1633(var32);
                                                                                                                    } else if (var263 == 27) {
                                                                                                                        int var33 = var21[var19];
                                                                                                                        class212.method8(var33, field1335[--Statics.field1331]);
                                                                                                                    } else if (var263 == 31) {
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        if (field1335[Statics.field1331] <= field1335[Statics.field1331 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var263 == 32) {
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        if (field1335[Statics.field1331] >= field1335[Statics.field1331 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var263 == 33) {
                                                                                                                        field1335[++Statics.field1331 - 1] = Statics.field1343[var21[var19]];
                                                                                                                    } else if (var263 == 34) {
                                                                                                                        Statics.field1343[var21[var19]] = field1335[--Statics.field1331];
                                                                                                                    } else if (var263 == 35) {
                                                                                                                        field1347[++Statics.field1338 - 1] = Statics.field1755[var21[var19]];
                                                                                                                    } else if (var263 == 36) {
                                                                                                                        Statics.field1755[var21[var19]] = field1347[--Statics.field1338];
                                                                                                                    } else if (var263 == 37) {
                                                                                                                        int var34 = var21[var19];
                                                                                                                        Statics.field1338 -= var34;
                                                                                                                        String[] var35 = field1347;
                                                                                                                        int var36 = Statics.field1338;
                                                                                                                        String var37;
                                                                                                                        if (var34 == 0) {
                                                                                                                            var37 = "";
                                                                                                                        } else if (var34 == 1) {
                                                                                                                            String var38 = var35[var36];
                                                                                                                            if (var38 == null) {
                                                                                                                                var37 = "null";
                                                                                                                            } else {
                                                                                                                                var37 = var38.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var39 = var34 + var36;
                                                                                                                            int var40 = 0;
                                                                                                                            for (int var41 = var36; var41 < var39; var41++) {
                                                                                                                                String var42 = var35[var41];
                                                                                                                                if (var42 == null) {
                                                                                                                                    var40 += 4;
                                                                                                                                } else {
                                                                                                                                    var40 += var42.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var43 = new StringBuilder(var40);
                                                                                                                            for (int var44 = var36; var44 < var39; var44++) {
                                                                                                                                String var45 = var35[var44];
                                                                                                                                if (var45 == null) {
                                                                                                                                    var43.append("null");
                                                                                                                                } else {
                                                                                                                                    var43.append(var45);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var37 = var43.toString();
                                                                                                                        }
                                                                                                                        field1347[++Statics.field1338 - 1] = var37;
                                                                                                                    } else if (var263 == 38) {
                                                                                                                        Statics.field1331--;
                                                                                                                    } else if (var263 == 39) {
                                                                                                                        Statics.field1338--;
                                                                                                                    } else if (var263 == 40) {
                                                                                                                        int var47 = var21[var19];
                                                                                                                        class98 var48 = (class98) class98.field1519.method3341((long) var47);
                                                                                                                        class98 var49;
                                                                                                                        if (var48 == null) {
                                                                                                                            byte[] var50 = Statics.field674.method3875(var47, 0);
                                                                                                                            if (var50 == null) {
                                                                                                                                var49 = null;
                                                                                                                            } else {
                                                                                                                                class98 var51 = class98.method3844(var50);
                                                                                                                                class98.field1519.method3343(var51, (long) var47);
                                                                                                                                var49 = var51;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var49 = var48;
                                                                                                                        }
                                                                                                                        class98 var52 = var49;
                                                                                                                        int[] var53 = new int[var49.field1523];
                                                                                                                        String[] var54 = new String[var49.field1524];
                                                                                                                        for (int var55 = 0; var55 < var52.field1527; var55++) {
                                                                                                                            var53[var55] = field1335[Statics.field1331 - var52.field1527 + var55];
                                                                                                                        }
                                                                                                                        for (int var56 = 0; var56 < var52.field1526; var56++) {
                                                                                                                            var54[var56] = field1347[Statics.field1338 - var52.field1526 + var56];
                                                                                                                        }
                                                                                                                        Statics.field1331 -= var52.field1527;
                                                                                                                        Statics.field1338 -= var52.field1526;
                                                                                                                        class63 var57 = new class63();
                                                                                                                        var57.field791 = var13;
                                                                                                                        var57.field787 = var19;
                                                                                                                        var57.field789 = Statics.field1343;
                                                                                                                        var57.field788 = Statics.field1755;
                                                                                                                        field1340[++field1337 - 1] = var57;
                                                                                                                        var13 = var52;
                                                                                                                        var20 = var52.field1525;
                                                                                                                        var21 = var52.field1522;
                                                                                                                        var19 = -1;
                                                                                                                        Statics.field1343 = var53;
                                                                                                                        Statics.field1755 = var54;
                                                                                                                    } else if (var263 == 42) {
                                                                                                                        field1335[++Statics.field1331 - 1] = Statics.field2339.method1708(var21[var19]);
                                                                                                                    } else if (var263 == 43) {
                                                                                                                        Statics.field2339.method1707(var21[var19], field1335[--Statics.field1331]);
                                                                                                                    } else if (var263 == 44) {
                                                                                                                        int var58 = var21[var19] >> 16;
                                                                                                                        int var59 = var21[var19] & 0xFFFF;
                                                                                                                        int var60 = field1335[--Statics.field1331];
                                                                                                                        if (var60 >= 0 && var60 <= 5000) {
                                                                                                                            field1333[var58] = var60;
                                                                                                                            byte var61 = -1;
                                                                                                                            if (var59 == 105) {
                                                                                                                                var61 = 0;
                                                                                                                            }
                                                                                                                            int var62 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var62 >= var60) {
                                                                                                                                    continue label1496;
                                                                                                                                }
                                                                                                                                field1334[var58][var62] = var61;
                                                                                                                                var62++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var263 == 45) {
                                                                                                                        int var63 = var21[var19];
                                                                                                                        int var64 = field1335[--Statics.field1331];
                                                                                                                        if (var64 < 0 || var64 >= field1333[var63]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1335[++Statics.field1331 - 1] = field1334[var63][var64];
                                                                                                                    } else if (var263 == 46) {
                                                                                                                        int var65 = var21[var19];
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        int var66 = field1335[Statics.field1331];
                                                                                                                        if (var66 < 0 || var66 >= field1333[var65]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1334[var65][var66] = field1335[Statics.field1331 + 1];
                                                                                                                    } else if (var263 == 47) {
                                                                                                                        String var67 = Statics.field2339.method1710(var21[var19]);
                                                                                                                        if (var67 == null) {
                                                                                                                            var67 = "null";
                                                                                                                        }
                                                                                                                        field1347[++Statics.field1338 - 1] = var67;
                                                                                                                    } else if (var263 == 48) {
                                                                                                                        Statics.field2339.method1709(var21[var19], field1347[--Statics.field1338]);
                                                                                                                    } else if (var263 == 60) {
                                                                                                                        class187 var68 = var13.field1521[var21[var19]];
                                                                                                                        class199 var69 = (class199) var68.method3313((long) field1335[--Statics.field1331]);
                                                                                                                        if (var69 != null) {
                                                                                                                            var19 += var69.field2500;
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
        } catch (Exception var262) {
            StringBuilder var260 = new StringBuilder(30);
            var260.append("").append(var13.field2486).append(" ");
            for (int var261 = field1337 - 1; var261 >= 0; var261--) {
                var260.append("").append(field1340[var261].field791.field2486).append(" ");
            }
            var260.append("").append(var22);
            class153.method1775(var260.toString(), var262);
        }
    }

    @ObfuscatedName("bu.e(ILcv;ZI)I")
    public static int method1032(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1335[--Statics.field1331];
            var4 = class217.method3237(var3);
        } else {
            var4 = arg2 ? Statics.field1342 : Statics.field1341;
        }
        if (arg0 == 1000) {
            Statics.field1331 -= 4;
            var4.field2668 = field1335[Statics.field1331];
            var4.field2669 = field1335[Statics.field1331 + 1];
            var4.field2646 = field1335[Statics.field1331 + 2];
            var4.field2665 = field1335[Statics.field1331 + 3];
            client.method165(var4);
            Statics.field1202.method1187(var4);
            if (var3 != -1 && var4.field2661 == 0) {
                client.method18(Statics.field2433[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1331 -= 4;
            var4.field2670 = field1335[Statics.field1331];
            var4.field2671 = field1335[Statics.field1331 + 1];
            var4.field2666 = field1335[Statics.field1331 + 2];
            var4.field2667 = field1335[Statics.field1331 + 3];
            client.method165(var4);
            Statics.field1202.method1187(var4);
            if (var3 != -1 && var4.field2661 == 0) {
                client.method18(Statics.field2433[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1335[--Statics.field1331] == 1;
            if (var4.field2679 != var5) {
                var4.field2679 = var5;
                client.method165(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2792 = field1335[--Statics.field1331] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2793 = field1335[--Statics.field1331] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.p(ILcv;ZI)I")
    public static int method484(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1335[--Statics.field1331];
            var4 = class217.method3237(var3);
        } else {
            var4 = arg2 ? Statics.field1342 : Statics.field1341;
        }
        if (arg0 == 1100) {
            Statics.field1331 -= 2;
            var4.field2695 = field1335[Statics.field1331];
            if (var4.field2695 > var4.field2685 - var4.field2674) {
                var4.field2695 = var4.field2685 - var4.field2674;
            }
            if (var4.field2695 < 0) {
                var4.field2695 = 0;
            }
            var4.field2774 = field1335[Statics.field1331 + 1];
            if (var4.field2774 > var4.field2683 - var4.field2675) {
                var4.field2774 = var4.field2683 - var4.field2675;
            }
            if (var4.field2774 < 0) {
                var4.field2774 = 0;
            }
            client.method165(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2659 = field1335[--Statics.field1331];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2651 = field1335[--Statics.field1331] == 1;
            client.method165(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2690 = field1335[--Statics.field1331];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2703 = field1335[--Statics.field1331];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2725 = field1335[--Statics.field1331];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2755 = field1335[--Statics.field1331];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2697 = field1335[--Statics.field1331] == 1;
            client.method165(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2702 = 1;
            var4.field2677 = field1335[--Statics.field1331];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1331 -= 6;
            var4.field2708 = field1335[Statics.field1331];
            var4.field2709 = field1335[Statics.field1331 + 1];
            var4.field2710 = field1335[Statics.field1331 + 2];
            var4.field2711 = field1335[Statics.field1331 + 3];
            var4.field2733 = field1335[Statics.field1331 + 4];
            var4.field2664 = field1335[Statics.field1331 + 5];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1335[--Statics.field1331];
            if (var4.field2650 != var5) {
                var4.field2650 = var5;
                var4.field2777 = 0;
                var4.field2782 = 0;
                client.method165(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2716 = field1335[--Statics.field1331] == 1;
            client.method165(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1347[--Statics.field1338];
            if (!var6.equals(var4.field2734)) {
                var4.field2734 = var6;
                client.method165(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2718 = field1335[--Statics.field1331];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1331 -= 3;
            var4.field2722 = field1335[Statics.field1331];
            var4.field2723 = field1335[Statics.field1331 + 1];
            var4.field2721 = field1335[Statics.field1331 + 2];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2789 = field1335[--Statics.field1331] == 1;
            client.method165(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2698 = field1335[--Statics.field1331];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2773 = field1335[--Statics.field1331];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2700 = field1335[--Statics.field1331] == 1;
            client.method165(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2673 = field1335[--Statics.field1331] == 1;
            client.method165(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1331 -= 2;
            var4.field2685 = field1335[Statics.field1331];
            var4.field2683 = field1335[Statics.field1331 + 1];
            client.method165(var4);
            if (var3 != -1 && var4.field2661 == 0) {
                client.method18(Statics.field2433[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2739;
            int var8 = var4.field2660;
            client.field965.method3210(250);
            client.field965.method2942(var7);
            client.field965.method3084(var8);
            client.field1078 = var4;
            client.method165(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2684 = field1335[--Statics.field1331];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2780 = field1335[--Statics.field1331];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2691 = field1335[--Statics.field1331];
            client.method165(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var9 = field1335[--Statics.field1331];
            class285[] var10 = new class285[] { class285.field3782, class285.field3780, class285.field3783, class285.field3784, class285.field3785 };
            class285 var11 = (class285) class169.method648(var10, var9);
            if (var11 != null) {
                var4.field2689 = var11;
                client.method165(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var12 = field1335[--Statics.field1331] == 1;
            var4.field2724 = var12;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.q(ILcv;ZB)I")
    public static int method1450(int arg0, class98 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3237(field1335[--Statics.field1331]);
        } else {
            var3 = arg2 ? Statics.field1342 : Statics.field1341;
        }
        client.method165(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1331 -= 2;
            int var4 = field1335[Statics.field1331];
            int var5 = field1335[Statics.field1331 + 1];
            var3.field2779 = var4;
            var3.field2787 = var5;
            class257 var6 = class257.method637(var4);
            var3.field2710 = var6.field3505;
            var3.field2711 = var6.field3506;
            var3.field2733 = var6.field3507;
            var3.field2708 = var6.field3540;
            var3.field2709 = var6.field3509;
            var3.field2664 = var6.field3538;
            if (arg0 == 1205) {
                var3.field2717 = 0;
            } else if (arg0 == 1212 | var6.field3512 == 1) {
                var3.field2717 = 1;
            } else {
                var3.field2717 = 2;
            }
            if (var3.field2714 > 0) {
                var3.field2664 = var3.field2664 * 32 / var3.field2714;
            } else if (var3.field2670 > 0) {
                var3.field2664 = var3.field2664 * 32 / var3.field2670;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2702 = 2;
            var3.field2677 = field1335[--Statics.field1331];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2702 = 3;
            var3.field2677 = Statics.field2427.field906.method3737();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ej.s(ILcv;ZI)I")
    public static int method2756(int arg0, class98 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3237(field1335[--Statics.field1331]);
        } else {
            var3 = arg2 ? Statics.field1342 : Statics.field1341;
        }
        if (arg0 == 1300) {
            int var4 = field1335[--Statics.field1331] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3785(var4, field1347[--Statics.field1338]);
                return 1;
            } else {
                Statics.field1338--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1331 -= 2;
            int var5 = field1335[Statics.field1331];
            int var6 = field1335[Statics.field1331 + 1];
            var3.field2771 = class217.method19(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2737 = field1335[--Statics.field1331] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2735 = field1335[--Statics.field1331];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2758 = field1335[--Statics.field1331];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2732 = field1347[--Statics.field1338];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2738 = field1347[--Statics.field1338];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2706 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("n.r(ILcv;ZB)I")
    public static int method164(int arg0, class98 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3237(field1335[--Statics.field1331]);
        } else {
            var3 = arg2 ? Statics.field1342 : Statics.field1341;
        }
        String var4 = field1347[--Statics.field1338];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1335[--Statics.field1331];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1335[--Statics.field1331];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1347[--Statics.field1338];
            } else {
                var7[var8] = Integer.valueOf(field1335[--Statics.field1331]);
            }
        }
        int var9 = field1335[--Statics.field1331];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2656 = var7;
        } else if (arg0 == 1401) {
            var3.field2784 = var7;
        } else if (arg0 == 1402) {
            var3.field2743 = var7;
        } else if (arg0 == 1403) {
            var3.field2745 = var7;
        } else if (arg0 == 1404) {
            var3.field2788 = var7;
        } else if (arg0 == 1405) {
            var3.field2748 = var7;
        } else if (arg0 == 1406) {
            var3.field2751 = var7;
        } else if (arg0 == 1407) {
            var3.field2752 = var7;
            var3.field2753 = var5;
        } else if (arg0 == 1408) {
            var3.field2694 = var7;
        } else if (arg0 == 1409) {
            var3.field2759 = var7;
        } else if (arg0 == 1410) {
            var3.field2749 = var7;
        } else if (arg0 == 1411) {
            var3.field2742 = var7;
        } else if (arg0 == 1412) {
            var3.field2746 = var7;
        } else if (arg0 == 1414) {
            var3.field2754 = var7;
            var3.field2781 = var5;
        } else if (arg0 == 1415) {
            var3.field2713 = var7;
            var3.field2757 = var5;
        } else if (arg0 == 1416) {
            var3.field2750 = var7;
        } else if (arg0 == 1417) {
            var3.field2764 = var7;
        } else if (arg0 == 1418) {
            var3.field2761 = var7;
        } else if (arg0 == 1419) {
            var3.field2762 = var7;
        } else if (arg0 == 1420) {
            var3.field2654 = var7;
        } else if (arg0 == 1421) {
            var3.field2692 = var7;
        } else if (arg0 == 1422) {
            var3.field2776 = var7;
        } else if (arg0 == 1423) {
            var3.field2766 = var7;
        } else if (arg0 == 1424) {
            var3.field2767 = var7;
        } else if (arg0 == 1425) {
            var3.field2769 = var7;
        } else if (arg0 == 1426) {
            var3.field2770 = var7;
        } else if (arg0 == 1427) {
            var3.field2768 = var7;
        } else {
            return 2;
        }
        var3.field2786 = true;
        return 1;
    }

    @ObfuscatedName("ha.g(ILcv;ZB)I")
    public static int method3861(int arg0, class98 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field1342 : Statics.field1341;
        if (arg0 == 1500) {
            field1335[++Statics.field1331 - 1] = var3.field2672;
            return 1;
        } else if (arg0 == 1501) {
            field1335[++Statics.field1331 - 1] = var3.field2681;
            return 1;
        } else if (arg0 == 1502) {
            field1335[++Statics.field1331 - 1] = var3.field2674;
            return 1;
        } else if (arg0 == 1503) {
            field1335[++Statics.field1331 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 1504) {
            field1335[++Statics.field1331 - 1] = var3.field2679 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1335[++Statics.field1331 - 1] = var3.field2678;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("be.v(ILcv;ZB)I")
    public static int method1090(int arg0, class98 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field1342 : Statics.field1341;
        if (arg0 == 1700) {
            field1335[++Statics.field1331 - 1] = var3.field2779;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2779 == -1) {
                field1335[++Statics.field1331 - 1] = 0;
            } else {
                field1335[++Statics.field1331 - 1] = var3.field2787;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1335[++Statics.field1331 - 1] = var3.field2660;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.t(ILcv;ZB)I")
    public static int method645(int arg0, class98 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3237(field1335[--Statics.field1331]);
        } else {
            var3 = arg2 ? Statics.field1342 : Statics.field1341;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1345 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2768 == null) {
            return 0;
        } else {
            class69 var4 = new class69();
            var4.field854 = var3;
            var4.field847 = var3.field2768;
            var4.field855 = field1345 + 1;
            client.field1113.method3411(var4);
            return 1;
        }
    }

    @ObfuscatedName("am.y(ILcv;ZI)I")
    public static int method453(int arg0, class98 arg1, boolean arg2) {
        class217 var3 = class217.method3237(field1335[--Statics.field1331]);
        if (arg0 == 2500) {
            field1335[++Statics.field1331 - 1] = var3.field2672;
            return 1;
        } else if (arg0 == 2501) {
            field1335[++Statics.field1331 - 1] = var3.field2681;
            return 1;
        } else if (arg0 == 2502) {
            field1335[++Statics.field1331 - 1] = var3.field2674;
            return 1;
        } else if (arg0 == 2503) {
            field1335[++Statics.field1331 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 2504) {
            field1335[++Statics.field1331 - 1] = var3.field2679 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1335[++Statics.field1331 - 1] = var3.field2678;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iz.o(ILcv;ZI)I")
    public static int method4128(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class217 var3 = class217.method3237(field1335[--Statics.field1331]);
            field1335[++Statics.field1331 - 1] = var3.field2779;
            return 1;
        } else if (arg0 == 2701) {
            class217 var4 = class217.method3237(field1335[--Statics.field1331]);
            if (var4.field2779 == -1) {
                field1335[++Statics.field1331 - 1] = 0;
            } else {
                field1335[++Statics.field1331 - 1] = var4.field2787;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1335[--Statics.field1331];
            class68 var6 = (class68) client.field1075.method3352((long) var5);
            if (var6 == null) {
                field1335[++Statics.field1331 - 1] = 0;
            } else {
                field1335[++Statics.field1331 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1335[++Statics.field1331 - 1] = client.field1074;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.i(ILcv;ZI)I")
    public static int method1064(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1331 -= 3;
            client.method1039(field1335[Statics.field1331], field1335[Statics.field1331 + 1], field1335[Statics.field1331 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            int var3 = field1335[--Statics.field1331];
            if (var3 == -1 && !client.field1152) {
                class204.method1612();
            } else if (var3 != -1 && client.field1087 != var3 && client.field977 != 0 && !client.field1152) {
                class238 var4 = Statics.field3677;
                int var5 = client.field977;
                class204.field2522 = 1;
                Statics.field2523 = var4;
                Statics.field2521 = var3;
                Statics.field2139 = 0;
                Statics.field2204 = var5;
                Statics.field3779 = false;
                Statics.field3815 = 2;
            }
            client.field1087 = var3;
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1331 -= 2;
            int var6 = field1335[Statics.field1331];
            int var7 = field1335[Statics.field1331 + 1];
            if (client.field977 != 0 && var6 != -1) {
                class204.method2819(Statics.field2113, var6, 0, client.field977, false);
                client.field1152 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ay.x(ILcv;ZI)I")
    public static int method685(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = client.field938[var3].method94();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = client.field938[var4].field316;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = client.field938[var5].field310;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = client.field938[var6].field311;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = client.field938[var7].field312;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = client.field938[var8].field313;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1335[--Statics.field1331];
            int var10 = client.field938[var9].method92();
            field1335[++Statics.field1331 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1335[--Statics.field1331];
            int var12 = client.field938[var11].method92();
            field1335[++Statics.field1331 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1335[--Statics.field1331];
            int var14 = client.field938[var13].method92();
            field1335[++Statics.field1331 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1335[--Statics.field1331];
            int var16 = client.field938[var15].method92();
            field1335[++Statics.field1331 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1335[--Statics.field1331] == 1;
            if (Statics.field331 != null) {
                Statics.field331.method67(class14.field284, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1335[--Statics.field1331] == 1;
            if (Statics.field331 != null) {
                Statics.field331.method67(class14.field281, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1331 -= 2;
            boolean var19 = field1335[Statics.field1331] == 1;
            boolean var20 = field1335[Statics.field1331 + 1] == 1;
            if (Statics.field331 != null) {
                Statics.field331.method67(new class94(var20), var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1335[--Statics.field1331] == 1;
            if (Statics.field331 != null) {
                Statics.field331.method67(class14.field282, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1335[--Statics.field1331] == 1;
            if (Statics.field331 != null) {
                Statics.field331.method67(class14.field283, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1335[++Statics.field1331 - 1] = Statics.field331 == null ? 0 : Statics.field331.field285.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1335[--Statics.field1331];
            class15 var24 = (class15) Statics.field331.field285.get(var23);
            field1335[++Statics.field1331 - 1] = var24.field298;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1335[--Statics.field1331];
            class15 var26 = (class15) Statics.field331.field285.get(var25);
            field1347[++Statics.field1338 - 1] = var26.method73();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1335[--Statics.field1331];
            class15 var28 = (class15) Statics.field331.field285.get(var27);
            field1347[++Statics.field1338 - 1] = var28.method77();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1335[--Statics.field1331];
            class15 var30 = (class15) Statics.field331.field285.get(var29);
            long var31 = class176.method2725() - Statics.field676 - var30.field290;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1347[++Statics.field1338 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1335[--Statics.field1331];
            class15 var38 = (class15) Statics.field331.field285.get(var37);
            field1335[++Statics.field1331 - 1] = var38.field296.field311;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1335[--Statics.field1331];
            class15 var40 = (class15) Statics.field331.field285.get(var39);
            field1335[++Statics.field1331 - 1] = var40.field296.field310;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1335[--Statics.field1331];
            class15 var42 = (class15) Statics.field331.field285.get(var41);
            field1335[++Statics.field1331 - 1] = var42.field296.field316;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dw.c(ILcv;ZB)I")
    public static int method2219(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1331 -= 2;
            int var3 = field1335[Statics.field1331];
            int var4 = field1335[Statics.field1331 + 1];
            field1335[++Statics.field1331 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1331 -= 2;
            int var5 = field1335[Statics.field1331];
            int var6 = field1335[Statics.field1331 + 1];
            field1335[++Statics.field1331 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1331 -= 2;
            int var7 = field1335[Statics.field1331];
            int var8 = field1335[Statics.field1331 + 1];
            field1335[++Statics.field1331 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1331 -= 2;
            int var9 = field1335[Statics.field1331];
            int var10 = field1335[Statics.field1331 + 1];
            field1335[++Statics.field1331 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1331 -= 5;
            int var13 = field1335[Statics.field1331];
            int var14 = field1335[Statics.field1331 + 1];
            int var15 = field1335[Statics.field1331 + 2];
            int var16 = field1335[Statics.field1331 + 3];
            int var17 = field1335[Statics.field1331 + 4];
            field1335[++Statics.field1331 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1331 -= 2;
            int var18 = field1335[Statics.field1331];
            int var19 = field1335[Statics.field1331 + 1];
            field1335[++Statics.field1331 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1331 -= 2;
            int var20 = field1335[Statics.field1331];
            int var21 = field1335[Statics.field1331 + 1];
            field1335[++Statics.field1331 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1331 -= 2;
            int var22 = field1335[Statics.field1331];
            int var23 = field1335[Statics.field1331 + 1];
            field1335[++Statics.field1331 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1331 -= 2;
            int var24 = field1335[Statics.field1331];
            int var25 = field1335[Statics.field1331 + 1];
            field1335[++Statics.field1331 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1331 -= 2;
            int var26 = field1335[Statics.field1331];
            int var27 = field1335[Statics.field1331 + 1];
            field1335[++Statics.field1331 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1331 -= 2;
            int var28 = field1335[Statics.field1331];
            int var29 = field1335[Statics.field1331 + 1];
            if (var28 == 0) {
                field1335[++Statics.field1331 - 1] = 0;
            } else {
                field1335[++Statics.field1331 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1331 -= 2;
            int var30 = field1335[Statics.field1331];
            int var31 = field1335[Statics.field1331 + 1];
            if (var30 == 0) {
                field1335[++Statics.field1331 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1335[++Statics.field1331 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1335[++Statics.field1331 - 1] = var30;
                    break;
                case 2:
                    field1335[++Statics.field1331 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1335[++Statics.field1331 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1335[++Statics.field1331 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1335[++Statics.field1331 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1331 -= 2;
            int var32 = field1335[Statics.field1331];
            int var33 = field1335[Statics.field1331 + 1];
            field1335[++Statics.field1331 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1331 -= 2;
            int var34 = field1335[Statics.field1331];
            int var35 = field1335[Statics.field1331 + 1];
            field1335[++Statics.field1331 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1331 -= 3;
            long var36 = (long) field1335[Statics.field1331];
            long var38 = (long) field1335[Statics.field1331 + 1];
            long var40 = (long) field1335[Statics.field1331 + 2];
            field1335[++Statics.field1331 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.h(ILcv;ZI)I")
    public static int method687(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1347[--Statics.field1338];
            int var4 = field1335[--Statics.field1331];
            field1347[++Statics.field1338 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1338 -= 2;
            String var5 = field1347[Statics.field1338];
            String var6 = field1347[Statics.field1338 + 1];
            field1347[++Statics.field1338 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1347[--Statics.field1338];
            int var8 = field1335[--Statics.field1331];
            String[] var9 = field1347;
            int var10 = ++Statics.field1338 - 1;
            String var12;
            if (var8 < 0) {
                var12 = Integer.toString(var8);
            } else {
                int var13 = var8;
                String var14;
                if (var8 < 0) {
                    var14 = Integer.toString(var8, 10);
                } else {
                    int var15 = 2;
                    int var16 = var8 / 10;
                    while (var16 != 0) {
                        var16 /= 10;
                        var15++;
                    }
                    char[] var17 = new char[var15];
                    var17[0] = '+';
                    for (int var18 = var15 - 1; var18 > 0; var18--) {
                        int var19 = var13;
                        var13 /= 10;
                        int var20 = var19 - var13 * 10;
                        if (var20 >= 10) {
                            var17[var18] = (char) (var20 + 87);
                        } else {
                            var17[var18] = (char) (var20 + 48);
                        }
                    }
                    var14 = new String(var17);
                }
                var12 = var14;
            }
            var9[var10] = var7 + var12;
            return 1;
        } else if (arg0 == 4103) {
            String var21 = field1347[--Statics.field1338];
            field1347[++Statics.field1338 - 1] = var21.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var22 = field1335[--Statics.field1331];
            long var23 = ((long) var22 + 11745L) * 86400000L;
            field1330.setTime(new Date(var23));
            int var25 = field1330.get(5);
            int var26 = field1330.get(2);
            int var27 = field1330.get(1);
            field1347[++Statics.field1338 - 1] = var25 + "-" + field1344[var26] + "-" + var27;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1338 -= 2;
            String var28 = field1347[Statics.field1338];
            String var29 = field1347[Statics.field1338 + 1];
            if (Statics.field2427.field906 != null && Statics.field2427.field906.field2638) {
                field1347[++Statics.field1338 - 1] = var29;
            } else {
                field1347[++Statics.field1338 - 1] = var28;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var30 = field1335[--Statics.field1331];
            field1347[++Statics.field1338 - 1] = Integer.toString(var30);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1338 -= 2;
            int[] var31 = field1335;
            int var32 = ++Statics.field1331 - 1;
            int var33 = class165.method3770(field1347[Statics.field1338], field1347[Statics.field1338 + 1], client.field927);
            byte var34;
            if (var33 > 0) {
                var34 = 1;
            } else if (var33 < 0) {
                var34 = -1;
            } else {
                var34 = 0;
            }
            var31[var32] = var34;
            return 1;
        } else if (arg0 == 4108) {
            String var35 = field1347[--Statics.field1338];
            Statics.field1331 -= 2;
            int var36 = field1335[Statics.field1331];
            int var37 = field1335[Statics.field1331 + 1];
            byte[] var38 = Statics.field459.method3875(var37, 0);
            class264 var39 = new class264(var38);
            field1335[++Statics.field1331 - 1] = var39.method4478(var35, var36);
            return 1;
        } else if (arg0 == 4109) {
            String var40 = field1347[--Statics.field1338];
            Statics.field1331 -= 2;
            int var41 = field1335[Statics.field1331];
            int var42 = field1335[Statics.field1331 + 1];
            byte[] var43 = Statics.field459.method3875(var42, 0);
            class264 var44 = new class264(var43);
            field1335[++Statics.field1331 - 1] = var44.method4516(var40, var41);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1338 -= 2;
            String var45 = field1347[Statics.field1338];
            String var46 = field1347[Statics.field1338 + 1];
            if (field1335[--Statics.field1331] == 1) {
                field1347[++Statics.field1338 - 1] = var45;
            } else {
                field1347[++Statics.field1338 - 1] = var46;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var47 = field1347[--Statics.field1338];
            field1347[++Statics.field1338 - 1] = class265.method4563(var47);
            return 1;
        } else if (arg0 == 4112) {
            String var48 = field1347[--Statics.field1338];
            int var49 = field1335[--Statics.field1331];
            field1347[++Statics.field1338 - 1] = var48 + (char) var49;
            return 1;
        } else if (arg0 == 4113) {
            int var50 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = class271.method4453((char) var50) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var51 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = class271.method4413((char) var51) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var52 = field1335[--Statics.field1331];
            int[] var53 = field1335;
            int var54 = ++Statics.field1331 - 1;
            char var55 = (char) var52;
            boolean var56 = var55 >= 'A' && var55 <= 'Z' || var55 >= 'a' && var55 <= 'z';
            var53[var54] = var56 ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var57 = field1335[--Statics.field1331];
            int[] var58 = field1335;
            int var59 = ++Statics.field1331 - 1;
            char var60 = (char) var57;
            boolean var61 = var60 >= '0' && var60 <= '9';
            var58[var59] = var61 ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var62 = field1347[--Statics.field1338];
            if (var62 == null) {
                field1335[++Statics.field1331 - 1] = 0;
            } else {
                field1335[++Statics.field1331 - 1] = var62.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var63 = field1347[--Statics.field1338];
            Statics.field1331 -= 2;
            int var64 = field1335[Statics.field1331];
            int var65 = field1335[Statics.field1331 + 1];
            field1347[++Statics.field1338 - 1] = var63.substring(var64, var65);
            return 1;
        } else if (arg0 == 4119) {
            String var66 = field1347[--Statics.field1338];
            StringBuilder var67 = new StringBuilder(var66.length());
            boolean var68 = false;
            for (int var69 = 0; var69 < var66.length(); var69++) {
                char var70 = var66.charAt(var69);
                if (var70 == '<') {
                    var68 = true;
                } else if (var70 == '>') {
                    var68 = false;
                } else if (!var68) {
                    var67.append(var70);
                }
            }
            field1347[++Statics.field1338 - 1] = var67.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var71 = field1347[--Statics.field1338];
            int var72 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = var71.indexOf(var72);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1338 -= 2;
            String var73 = field1347[Statics.field1338];
            String var74 = field1347[Statics.field1338 + 1];
            int var75 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = var73.indexOf(var74, var75);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.a(ILcv;ZI)I")
    public static int method11(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1335[++Statics.field1331 - 1] = client.field1130;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1331 -= 3;
            client.field1130 = field1335[Statics.field1331];
            Statics.field552 = class278.method3966(field1335[Statics.field1331 + 1]);
            if (Statics.field552 == null) {
                Statics.field552 = class278.field3752;
            }
            client.field1019 = field1335[Statics.field1331 + 2];
            client.field965.method3210(140);
            client.field965.method2970(client.field1130);
            client.field965.method2970(Statics.field552.field3750);
            client.field965.method2970(client.field1019);
            return 1;
        } else if (arg0 == 5002) {
            String var3 = field1347[--Statics.field1338];
            Statics.field1331 -= 2;
            int var4 = field1335[Statics.field1331];
            int var5 = field1335[Statics.field1331 + 1];
            client.field965.method3210(49);
            client.field965.method2970(class174.method2869(var3) + 2);
            client.field965.method3041(var3);
            client.field965.method2970(var4 - 1);
            client.field965.method2970(var5);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1331 -= 2;
            int var6 = field1335[Statics.field1331];
            int var7 = field1335[Statics.field1331 + 1];
            class100 var8 = (class100) class97.field1513.get(var6);
            class72 var9 = var8.method1782(var7);
            if (var9 == null) {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = 0;
                field1347[++Statics.field1338 - 1] = "";
                field1347[++Statics.field1338 - 1] = "";
                field1347[++Statics.field1338 - 1] = "";
            } else {
                field1335[++Statics.field1331 - 1] = var9.field877;
                field1335[++Statics.field1331 - 1] = var9.field869;
                field1347[++Statics.field1338 - 1] = var9.field871 == null ? "" : var9.field871;
                field1347[++Statics.field1338 - 1] = var9.field872 == null ? "" : var9.field872;
                field1347[++Statics.field1338 - 1] = var9.field873 == null ? "" : var9.field873;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1335[--Statics.field1331];
            class72 var12 = (class72) class97.field1509.method3313((long) var11);
            if (var12 == null) {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = 0;
                field1347[++Statics.field1338 - 1] = "";
                field1347[++Statics.field1338 - 1] = "";
                field1347[++Statics.field1338 - 1] = "";
            } else {
                field1335[++Statics.field1331 - 1] = var12.field870;
                field1335[++Statics.field1331 - 1] = var12.field869;
                field1347[++Statics.field1338 - 1] = var12.field871 == null ? "" : var12.field871;
                field1347[++Statics.field1338 - 1] = var12.field872 == null ? "" : var12.field872;
                field1347[++Statics.field1338 - 1] = var12.field873 == null ? "" : var12.field873;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field552 == null) {
                field1335[++Statics.field1331 - 1] = -1;
            } else {
                field1335[++Statics.field1331 - 1] = Statics.field552.field3750;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var14 = field1347[--Statics.field1338];
            int var15 = field1335[--Statics.field1331];
            String var16 = var14.toLowerCase();
            byte var17 = 0;
            if (var16.startsWith(class226.field3033)) {
                var17 = 0;
                var14 = var14.substring(class226.field3033.length());
            } else if (var16.startsWith(class226.field3035)) {
                var17 = 1;
                var14 = var14.substring(class226.field3035.length());
            } else if (var16.startsWith(class226.field3037)) {
                var17 = 2;
                var14 = var14.substring(class226.field3037.length());
            } else if (var16.startsWith(class226.field3039)) {
                var17 = 3;
                var14 = var14.substring(class226.field3039.length());
            } else if (var16.startsWith(class226.field3137)) {
                var17 = 4;
                var14 = var14.substring(class226.field3137.length());
            } else if (var16.startsWith(class226.field3106)) {
                var17 = 5;
                var14 = var14.substring(class226.field3106.length());
            } else if (var16.startsWith(class226.field3045)) {
                var17 = 6;
                var14 = var14.substring(class226.field3045.length());
            } else if (var16.startsWith(class226.field3047)) {
                var17 = 7;
                var14 = var14.substring(class226.field3047.length());
            } else if (var16.startsWith(class226.field2923)) {
                var17 = 8;
                var14 = var14.substring(class226.field2923.length());
            } else if (var16.startsWith(class226.field3051)) {
                var17 = 9;
                var14 = var14.substring(class226.field3051.length());
            } else if (var16.startsWith(class226.field3053)) {
                var17 = 10;
                var14 = var14.substring(class226.field3053.length());
            } else if (var16.startsWith(class226.field2869)) {
                var17 = 11;
                var14 = var14.substring(class226.field2869.length());
            } else if (client.field927 != 0) {
                if (var16.startsWith(class226.field3034)) {
                    var17 = 0;
                    var14 = var14.substring(class226.field3034.length());
                } else if (var16.startsWith(class226.field2911)) {
                    var17 = 1;
                    var14 = var14.substring(class226.field2911.length());
                } else if (var16.startsWith(class226.field3038)) {
                    var17 = 2;
                    var14 = var14.substring(class226.field3038.length());
                } else if (var16.startsWith(class226.field3040)) {
                    var17 = 3;
                    var14 = var14.substring(class226.field3040.length());
                } else if (var16.startsWith(class226.field3042)) {
                    var17 = 4;
                    var14 = var14.substring(class226.field3042.length());
                } else if (var16.startsWith(class226.field3044)) {
                    var17 = 5;
                    var14 = var14.substring(class226.field3044.length());
                } else if (var16.startsWith(class226.field2980)) {
                    var17 = 6;
                    var14 = var14.substring(class226.field2980.length());
                } else if (var16.startsWith(class226.field3048)) {
                    var17 = 7;
                    var14 = var14.substring(class226.field3048.length());
                } else if (var16.startsWith(class226.field3097)) {
                    var17 = 8;
                    var14 = var14.substring(class226.field3097.length());
                } else if (var16.startsWith(class226.field3064)) {
                    var17 = 9;
                    var14 = var14.substring(class226.field3064.length());
                } else if (var16.startsWith(class226.field3054)) {
                    var17 = 10;
                    var14 = var14.substring(class226.field3054.length());
                } else if (var16.startsWith(class226.field3056)) {
                    var17 = 11;
                    var14 = var14.substring(class226.field3056.length());
                }
            }
            String var18 = var14.toLowerCase();
            byte var19 = 0;
            if (var18.startsWith(class226.field3057)) {
                var19 = 1;
                var14 = var14.substring(class226.field3057.length());
            } else if (var18.startsWith(class226.field3059)) {
                var19 = 2;
                var14 = var14.substring(class226.field3059.length());
            } else if (var18.startsWith(class226.field3061)) {
                var19 = 3;
                var14 = var14.substring(class226.field3061.length());
            } else if (var18.startsWith(class226.field3063)) {
                var19 = 4;
                var14 = var14.substring(class226.field3063.length());
            } else if (var18.startsWith(class226.field2876)) {
                var19 = 5;
                var14 = var14.substring(class226.field2876.length());
            } else if (client.field927 != 0) {
                if (var18.startsWith(class226.field3058)) {
                    var19 = 1;
                    var14 = var14.substring(class226.field3058.length());
                } else if (var18.startsWith(class226.field3060)) {
                    var19 = 2;
                    var14 = var14.substring(class226.field3060.length());
                } else if (var18.startsWith(class226.field3062)) {
                    var19 = 3;
                    var14 = var14.substring(class226.field3062.length());
                } else if (var18.startsWith(class226.field3010)) {
                    var19 = 4;
                    var14 = var14.substring(class226.field3010.length());
                } else if (var18.startsWith(class226.field2956)) {
                    var19 = 5;
                    var14 = var14.substring(class226.field2956.length());
                }
            }
            client.field965.method3210(82);
            client.field965.method2970(0);
            int var20 = client.field965.field2405;
            client.field965.method2970(var15);
            client.field965.method2970(var17);
            client.field965.method2970(var19);
            class180 var21 = client.field965;
            int var22 = var21.field2405;
            byte[] var23 = class267.method959(var14);
            var21.method2953(var23.length);
            var21.field2405 += Statics.field3665.method2884(var23, 0, var23.length, var21.field2409, var21.field2405);
            client.field965.method3006(client.field965.field2405 - var20);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1338 -= 2;
            String var24 = field1347[Statics.field1338];
            String var25 = field1347[Statics.field1338 + 1];
            client.field965.method3210(176);
            client.field965.method2940(0);
            int var26 = client.field965.field2405;
            client.field965.method3041(var24);
            class180 var27 = client.field965;
            int var28 = var27.field2405;
            byte[] var29 = class267.method959(var25);
            var27.method2953(var29.length);
            var27.field2405 += Statics.field3665.method2884(var29, 0, var29.length, var27.field2409, var27.field2405);
            client.field965.method2978(client.field965.field2405 - var26);
            return 1;
        } else if (arg0 == 5015) {
            String var30;
            if (Statics.field2427 == null || Statics.field2427.field896 == null) {
                var30 = "";
            } else {
                var30 = Statics.field2427.field896;
            }
            field1347[++Statics.field1338 - 1] = var30;
            return 1;
        } else if (arg0 == 5016) {
            field1335[++Statics.field1331 - 1] = client.field1019;
            return 1;
        } else if (arg0 == 5017) {
            int var31 = field1335[--Statics.field1331];
            int[] var32 = field1335;
            int var33 = ++Statics.field1331 - 1;
            class100 var34 = (class100) class97.field1513.get(var31);
            int var35;
            if (var34 == null) {
                var35 = 0;
            } else {
                var35 = var34.method1780();
            }
            var32[var33] = var35;
            return 1;
        } else if (arg0 == 5018) {
            int var36 = field1335[--Statics.field1331];
            int[] var37 = field1335;
            int var38 = ++Statics.field1331 - 1;
            class72 var39 = (class72) class97.field1509.method3313((long) var36);
            int var40;
            if (var39 == null) {
                var40 = -1;
            } else if (class97.field1510.field2505 == var39.field2491) {
                var40 = -1;
            } else {
                var40 = ((class72) var39.field2491).field877;
            }
            var37[var38] = var40;
            return 1;
        } else if (arg0 == 5019) {
            int var41 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = class97.method15(var41);
            return 1;
        } else if (arg0 == 5020) {
            String var42 = field1347[--Statics.field1338];
            client.method3716(var42);
            return 1;
        } else if (arg0 == 5021) {
            client.field1132 = field1347[--Statics.field1338].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1347[++Statics.field1338 - 1] = client.field1132;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ab.w(ILcv;ZI)I")
    public static int method227(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1331 -= 2;
            int var3 = field1335[Statics.field1331];
            int var4 = field1335[Statics.field1331 + 1];
            if (!client.field1161) {
                client.field922 = var3;
                client.field997 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1335[++Statics.field1331 - 1] = client.field922;
            return 1;
        } else if (arg0 == 5506) {
            field1335[++Statics.field1331 - 1] = client.field997;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1335[--Statics.field1331];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field1003 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1335[++Statics.field1331 - 1] = client.field1003;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("de.n(ILcv;ZS)I")
    public static int method1972(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field975 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dh.m(ILcv;ZI)I")
    public static int method2264(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1331 -= 2;
            client.field1167 = (short) field1335[Statics.field1331];
            if (client.field1167 <= 0) {
                client.field1167 = 256;
            }
            client.field1168 = (short) field1335[Statics.field1331 + 1];
            if (client.field1168 <= 0) {
                client.field1168 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1331 -= 2;
            client.field1169 = (short) field1335[Statics.field1331];
            if (client.field1169 <= 0) {
                client.field1169 = 256;
            }
            client.field1170 = (short) field1335[Statics.field1331 + 1];
            if (client.field1170 <= 0) {
                client.field1170 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1331 -= 4;
            client.field1002 = (short) field1335[Statics.field1331];
            if (client.field1002 <= 0) {
                client.field1002 = 1;
            }
            client.field1060 = (short) field1335[Statics.field1331 + 1];
            if (client.field1060 <= 0) {
                client.field1060 = 32767;
            } else if (client.field1060 < client.field1002) {
                client.field1060 = client.field1002;
            }
            client.field1173 = (short) field1335[Statics.field1331 + 2];
            if (client.field1173 <= 0) {
                client.field1173 = 1;
            }
            client.field1063 = (short) field1335[Statics.field1331 + 3];
            if (client.field1063 <= 0) {
                client.field1063 = 32767;
            } else if (client.field1063 < client.field1173) {
                client.field1063 = client.field1173;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field1086 == null) {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = -1;
            } else {
                client.method532(0, 0, client.field1086.field2674, client.field1086.field2675, false);
                field1335[++Statics.field1331 - 1] = client.field1164;
                field1335[++Statics.field1331 - 1] = client.field1178;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1335[++Statics.field1331 - 1] = client.field1169;
            field1335[++Statics.field1331 - 1] = client.field1170;
            return 1;
        } else if (arg0 == 6205) {
            field1335[++Statics.field1331 - 1] = client.field1167;
            field1335[++Statics.field1331 - 1] = client.field1168;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("be.ae(ILcv;ZI)I")
    public static int method1093(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1335[++Statics.field1331 - 1] = class79.method64() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class79.field1285 = 0;
            class79 var3 = class79.method1635();
            if (var3 == null) {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = 0;
                field1347[++Statics.field1338 - 1] = "";
                field1335[++Statics.field1331 - 1] = 0;
                field1335[++Statics.field1331 - 1] = 0;
                field1347[++Statics.field1338 - 1] = "";
            } else {
                field1335[++Statics.field1331 - 1] = var3.field1289;
                field1335[++Statics.field1331 - 1] = var3.field1290;
                field1347[++Statics.field1338 - 1] = var3.field1296;
                field1335[++Statics.field1331 - 1] = var3.field1294;
                field1335[++Statics.field1331 - 1] = var3.field1291;
                field1347[++Statics.field1338 - 1] = var3.field1292;
            }
            return 1;
        } else if (arg0 == 6502) {
            class79 var5 = class79.method1635();
            if (var5 == null) {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = 0;
                field1347[++Statics.field1338 - 1] = "";
                field1335[++Statics.field1331 - 1] = 0;
                field1335[++Statics.field1331 - 1] = 0;
                field1347[++Statics.field1338 - 1] = "";
            } else {
                field1335[++Statics.field1331 - 1] = var5.field1289;
                field1335[++Statics.field1331 - 1] = var5.field1290;
                field1347[++Statics.field1338 - 1] = var5.field1296;
                field1335[++Statics.field1331 - 1] = var5.field1294;
                field1335[++Statics.field1331 - 1] = var5.field1291;
                field1347[++Statics.field1338 - 1] = var5.field1292;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var6 = field1335[--Statics.field1331];
            class79 var7 = null;
            for (int var8 = 0; var8 < class79.field1284; var8++) {
                if (Statics.field2110[var8].field1289 == var6) {
                    var7 = Statics.field2110[var8];
                    break;
                }
            }
            if (var7 == null) {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = 0;
                field1347[++Statics.field1338 - 1] = "";
                field1335[++Statics.field1331 - 1] = 0;
                field1335[++Statics.field1331 - 1] = 0;
                field1347[++Statics.field1338 - 1] = "";
            } else {
                field1335[++Statics.field1331 - 1] = var7.field1289;
                field1335[++Statics.field1331 - 1] = var7.field1290;
                field1347[++Statics.field1338 - 1] = var7.field1296;
                field1335[++Statics.field1331 - 1] = var7.field1294;
                field1335[++Statics.field1331 - 1] = var7.field1291;
                field1347[++Statics.field1338 - 1] = var7.field1292;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1331 -= 4;
            int var9 = field1335[Statics.field1331];
            boolean var10 = field1335[Statics.field1331 + 1] == 1;
            int var11 = field1335[Statics.field1331 + 2];
            boolean var12 = field1335[Statics.field1331 + 3] == 1;
            class79.method736(var9, var10, var11, var12);
            return 1;
        } else if (arg0 == 6511) {
            int var13 = field1335[--Statics.field1331];
            if (var13 >= 0 && var13 < class79.field1284) {
                class79 var14 = Statics.field2110[var13];
                field1335[++Statics.field1331 - 1] = var14.field1289;
                field1335[++Statics.field1331 - 1] = var14.field1290;
                field1347[++Statics.field1338 - 1] = var14.field1296;
                field1335[++Statics.field1331 - 1] = var14.field1294;
                field1335[++Statics.field1331 - 1] = var14.field1291;
                field1347[++Statics.field1338 - 1] = var14.field1292;
            } else {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = 0;
                field1347[++Statics.field1338 - 1] = "";
                field1335[++Statics.field1331 - 1] = 0;
                field1335[++Statics.field1331 - 1] = 0;
                field1347[++Statics.field1338 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field1061 = field1335[--Statics.field1331] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1331 -= 2;
            int var15 = field1335[Statics.field1331];
            int var16 = field1335[Statics.field1331 + 1];
            class252 var17 = class252.method2786(var16);
            if (var17.method4170()) {
                field1347[++Statics.field1338 - 1] = class259.method1066(var15).method4382(var16, var17.field3390);
            } else {
                field1335[++Statics.field1331 - 1] = class259.method1066(var15).method4371(var16, var17.field3393);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1331 -= 2;
            int var18 = field1335[Statics.field1331];
            int var19 = field1335[Statics.field1331 + 1];
            class252 var20 = class252.method2786(var19);
            if (var20.method4170()) {
                field1347[++Statics.field1338 - 1] = class256.method2710(var18).method4260(var19, var20.field3390);
            } else {
                field1335[++Statics.field1331 - 1] = class256.method2710(var18).method4262(var19, var20.field3393);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1331 -= 2;
            int var21 = field1335[Statics.field1331];
            int var22 = field1335[Statics.field1331 + 1];
            class252 var23 = class252.method2786(var22);
            if (var23.method4170()) {
                field1347[++Statics.field1338 - 1] = class257.method637(var21).method4316(var22, var23.field3390);
            } else {
                field1335[++Statics.field1331 - 1] = class257.method637(var21).method4309(var22, var23.field3393);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1331 -= 2;
            int var24 = field1335[Statics.field1331];
            int var25 = field1335[Statics.field1331 + 1];
            class252 var26 = class252.method2786(var25);
            if (var26.method4170()) {
                field1347[++Statics.field1338 - 1] = class253.method3870(var24).method4193(var25, var26.field3390);
            } else {
                field1335[++Statics.field1331 - 1] = class253.method3870(var24).method4192(var25, var26.field3393);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1335[++Statics.field1331 - 1] = 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fy.ai(ILcv;ZS)I")
    public static int method2870(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field44;
            int var4 = (Statics.field2427.field1243 >> 7) + Statics.field2122;
            int var5 = (Statics.field2427.field1209 >> 7) + Statics.field1505;
            client.method1033().method4948(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1335[--Statics.field1331];
            String var7 = "";
            class33 var8 = client.method1033().method5041(var6);
            if (var8 != null) {
                var7 = var8.method248();
            }
            field1347[++Statics.field1338 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1335[--Statics.field1331];
            client.method1033().method5034(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1335[++Statics.field1331 - 1] = client.method1033().method4960();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1335[--Statics.field1331];
            client.method1033().method4957(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1335[++Statics.field1331 - 1] = client.method1033().method5098() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class213 var11 = new class213(field1335[--Statics.field1331]);
            client.method1033().method4964(var11.field2628, var11.field2625);
            return 1;
        } else if (arg0 == 6607) {
            class213 var12 = new class213(field1335[--Statics.field1331]);
            client.method1033().method5003(var12.field2628, var12.field2625);
            return 1;
        } else if (arg0 == 6608) {
            class213 var13 = new class213(field1335[--Statics.field1331]);
            client.method1033().method5096(var13.field2626, var13.field2628, var13.field2625);
            return 1;
        } else if (arg0 == 6609) {
            class213 var14 = new class213(field1335[--Statics.field1331]);
            client.method1033().method4967(var14.field2626, var14.field2628, var14.field2625);
            return 1;
        } else if (arg0 == 6610) {
            field1335[++Statics.field1331 - 1] = client.method1033().method5064();
            field1335[++Statics.field1331 - 1] = client.method1033().method4969();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1335[--Statics.field1331];
            class33 var16 = client.method1033().method5041(var15);
            if (var16 == null) {
                field1335[++Statics.field1331 - 1] = 0;
            } else {
                field1335[++Statics.field1331 - 1] = var16.method294().method3725();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1335[--Statics.field1331];
            class33 var18 = client.method1033().method5041(var17);
            if (var18 == null) {
                field1335[++Statics.field1331 - 1] = 0;
                field1335[++Statics.field1331 - 1] = 0;
            } else {
                field1335[++Statics.field1331 - 1] = (var18.method258() - var18.method284() + 1) * 64;
                field1335[++Statics.field1331 - 1] = (var18.method291() - var18.method301() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1335[--Statics.field1331];
            class33 var20 = client.method1033().method5041(var19);
            if (var20 == null) {
                field1335[++Statics.field1331 - 1] = 0;
                field1335[++Statics.field1331 - 1] = 0;
                field1335[++Statics.field1331 - 1] = 0;
                field1335[++Statics.field1331 - 1] = 0;
            } else {
                field1335[++Statics.field1331 - 1] = var20.method284() * 64;
                field1335[++Statics.field1331 - 1] = var20.method301() * 64;
                field1335[++Statics.field1331 - 1] = var20.method258() * 64 + 64 - 1;
                field1335[++Statics.field1331 - 1] = var20.method291() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1335[--Statics.field1331];
            class33 var22 = client.method1033().method5041(var21);
            if (var22 == null) {
                field1335[++Statics.field1331 - 1] = -1;
            } else {
                field1335[++Statics.field1331 - 1] = var22.method260();
            }
            return 1;
        } else if (arg0 == 6615) {
            class213 var23 = client.method1033().method4970();
            if (var23 == null) {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = -1;
            } else {
                field1335[++Statics.field1331 - 1] = var23.field2628;
                field1335[++Statics.field1331 - 1] = var23.field2625;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1335[++Statics.field1331 - 1] = client.method1033().method4950();
            return 1;
        } else if (arg0 == 6617) {
            class213 var24 = new class213(field1335[--Statics.field1331]);
            class33 var25 = client.method1033().method4951();
            if (var25 == null) {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method253(var24.field2626, var24.field2628, var24.field2625);
            if (var26 == null) {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = -1;
            } else {
                field1335[++Statics.field1331 - 1] = var26[0];
                field1335[++Statics.field1331 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class213 var27 = new class213(field1335[--Statics.field1331]);
            class33 var28 = client.method1033().method4951();
            if (var28 == null) {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = -1;
                return 1;
            }
            class213 var29 = var28.method243(var27.field2628, var27.field2625);
            if (var29 == null) {
                field1335[++Statics.field1331 - 1] = -1;
            } else {
                field1335[++Statics.field1331 - 1] = var29.method3725();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1331 -= 2;
            int var30 = field1335[Statics.field1331];
            class213 var31 = new class213(field1335[Statics.field1331 + 1]);
            method210(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1331 -= 2;
            int var32 = field1335[Statics.field1331];
            class213 var33 = new class213(field1335[Statics.field1331 + 1]);
            method210(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1331 -= 2;
            int var34 = field1335[Statics.field1331];
            class213 var35 = new class213(field1335[Statics.field1331 + 1]);
            class33 var36 = client.method1033().method5041(var34);
            if (var36 == null) {
                field1335[++Statics.field1331 - 1] = 0;
                return 1;
            } else {
                field1335[++Statics.field1331 - 1] = var36.method240(var35.field2626, var35.field2628, var35.field2625) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1335[++Statics.field1331 - 1] = client.method1033().method4971();
            field1335[++Statics.field1331 - 1] = client.method1033().method5061();
            return 1;
        } else if (arg0 == 6623) {
            class213 var37 = new class213(field1335[--Statics.field1331]);
            class33 var38 = client.method1033().method4947(var37.field2626, var37.field2628, var37.field2625);
            if (var38 == null) {
                field1335[++Statics.field1331 - 1] = -1;
            } else {
                field1335[++Statics.field1331 - 1] = var38.method281();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1033().method5067(field1335[--Statics.field1331]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1033().method4974();
            return 1;
        } else if (arg0 == 6626) {
            client.method1033().method5114(field1335[--Statics.field1331]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1033().method4976();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1335[--Statics.field1331] == 1;
            client.method1033().method4977(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1335[--Statics.field1331];
            client.method1033().method4978(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1335[--Statics.field1331];
            client.method1033().method4979(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method1033().method4980();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1335[--Statics.field1331] == 1;
            client.method1033().method5010(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1331 -= 2;
            int var43 = field1335[Statics.field1331];
            boolean var44 = field1335[Statics.field1331 + 1] == 1;
            client.method1033().method5005(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1331 -= 2;
            int var45 = field1335[Statics.field1331];
            boolean var46 = field1335[Statics.field1331 + 1] == 1;
            client.method1033().method4983(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1335[++Statics.field1331 - 1] = client.method1033().method4984() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = client.method1033().method4985(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1335[--Statics.field1331];
            field1335[++Statics.field1331 - 1] = client.method1033().method4986(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1331 -= 2;
            int var49 = field1335[Statics.field1331];
            class213 var50 = new class213(field1335[Statics.field1331 + 1]);
            class213 var51 = client.method1033().method4989(var49, var50);
            if (var51 == null) {
                field1335[++Statics.field1331 - 1] = -1;
            } else {
                field1335[++Statics.field1331 - 1] = var51.method3725();
            }
            return 1;
        } else if (arg0 == 6639) {
            class40 var52 = client.method1033().method4942();
            if (var52 == null) {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = -1;
            } else {
                field1335[++Statics.field1331 - 1] = var52.field553;
                field1335[++Statics.field1331 - 1] = var52.field548.method3725();
            }
            return 1;
        } else if (arg0 == 6640) {
            class40 var53 = client.method1033().method4992();
            if (var53 == null) {
                field1335[++Statics.field1331 - 1] = -1;
                field1335[++Statics.field1331 - 1] = -1;
            } else {
                field1335[++Statics.field1331 - 1] = var53.field553;
                field1335[++Statics.field1331 - 1] = var53.field548.method3725();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1335[--Statics.field1331];
            class243 var55 = Statics.field25[var54];
            if (var55.field3296 == null) {
                field1347[++Statics.field1338 - 1] = "";
            } else {
                field1347[++Statics.field1338 - 1] = var55.field3296;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1335[--Statics.field1331];
            class243 var57 = Statics.field25[var56];
            field1335[++Statics.field1331 - 1] = var57.field3299;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1335[--Statics.field1331];
            class243 var59 = Statics.field25[var58];
            if (var59 == null) {
                field1335[++Statics.field1331 - 1] = -1;
            } else {
                field1335[++Statics.field1331 - 1] = var59.field3310;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1335[--Statics.field1331];
            class243 var61 = Statics.field25[var60];
            if (var61 == null) {
                field1335[++Statics.field1331 - 1] = -1;
            } else {
                field1335[++Statics.field1331 - 1] = var61.field3294;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1335[++Statics.field1331 - 1] = Statics.field2195.field624;
            return 1;
        } else if (arg0 == 6698) {
            field1335[++Statics.field1331 - 1] = Statics.field2195.field622.method3725();
            return 1;
        } else if (arg0 == 6699) {
            field1335[++Statics.field1331 - 1] = Statics.field2195.field621.method3725();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ae.ah(II)V")
    public static void method196(int arg0) {
        if (arg0 == -1 || !class217.method1688(arg0)) {
            return;
        }
        class217[] var1 = Statics.field2433[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3.field2740 != null) {
                class69 var4 = new class69();
                var4.field854 = var3;
                var4.field847 = var3.field2740;
                method1087(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("ah.ab(ILhl;ZI)V")
    public static void method210(int arg0, class213 arg1, boolean arg2) {
        class33 var3 = client.method1033().method5041(arg0);
        int var4 = Statics.field2427.field895;
        int var5 = (Statics.field2427.field1243 >> 7) + Statics.field2122;
        int var6 = (Statics.field2427.field1209 >> 7) + Statics.field1505;
        class213 var7 = new class213(var4, var5, var6);
        client.method1033().method5056(var3, var7, arg1, arg2);
    }
}
