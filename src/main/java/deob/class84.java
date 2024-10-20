package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cg")
public class class84 {

    @ObfuscatedName("cg.g")
    public static int[] field1323 = new int[5];

    @ObfuscatedName("cg.v")
    public static int[][] field1313 = new int[5][5000];

    @ObfuscatedName("cg.t")
    public static int[] field1314 = new int[1000];

    @ObfuscatedName("cg.l")
    public static String[] field1316 = new String[1000];

    @ObfuscatedName("cg.k")
    public static int field1324 = 0;

    @ObfuscatedName("cg.r")
    public static class63[] field1325 = new class63[50];

    @ObfuscatedName("cg.o")
    public static Calendar field1321 = Calendar.getInstance();

    @ObfuscatedName("cg.j")
    public static final String[] field1311 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cg.d")
    public static int field1322 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.i(Lbs;S)V")
    public static void method2306(class70 arg0) {
        method648(arg0, 200000);
    }

    @ObfuscatedName("aa.h(Lbs;II)V")
    public static void method648(class70 arg0, int arg1) {
        Object[] var2 = arg0.field827;
        class100 var26;
        if (class220.method3160(arg0.field826)) {
            Statics.field1477 = (class48) var2[0];
            class243 var3 = Statics.field3277[Statics.field1477.field599];
            class220 var4 = arg0.field826;
            int var5 = var3.field3280;
            int var6 = var3.field3297;
            int var7 = (var5 << 8) + var4.field2793;
            class100 var9 = (class100) class100.field1535.method3308((long) (var7 << 16));
            class100 var10;
            if (var9 == null) {
                String var11 = String.valueOf(var7);
                int var12 = Statics.field801.method3851(var11);
                if (var12 == -1) {
                    var10 = null;
                } else {
                    label1532: {
                        byte[] var13 = Statics.field801.method3842(var12);
                        if (var13 != null) {
                            if (var13.length <= 1) {
                                var10 = null;
                                break label1532;
                            }
                            class100 var14 = class100.method137(var13);
                            if (var14 != null) {
                                class100.field1535.method3316(var14, (long) (var7 << 16));
                                var10 = var14;
                                break label1532;
                            }
                        }
                        var10 = null;
                    }
                }
            } else {
                var10 = var9;
            }
            class100 var16;
            if (var10 == null) {
                int var17 = (var6 + 40000 << 8) + var4.field2793;
                class100 var19 = (class100) class100.field1535.method3308((long) (var17 << 16));
                class100 var20;
                if (var19 == null) {
                    String var21 = String.valueOf(var17);
                    int var22 = Statics.field801.method3851(var21);
                    if (var22 == -1) {
                        var20 = null;
                    } else {
                        label1447: {
                            byte[] var23 = Statics.field801.method3842(var22);
                            if (var23 != null) {
                                if (var23.length <= 1) {
                                    var20 = null;
                                    break label1447;
                                }
                                class100 var24 = class100.method137(var23);
                                if (var24 != null) {
                                    class100.field1535.method3316(var24, (long) (var17 << 16));
                                    var20 = var24;
                                    break label1447;
                                }
                            }
                            var20 = null;
                        }
                    }
                } else {
                    var20 = var19;
                }
                if (var20 == null) {
                    var16 = null;
                } else {
                    var16 = var20;
                }
            } else {
                var16 = var10;
            }
            var26 = var16;
        } else {
            int var27 = (Integer) var2[0];
            var26 = class100.method1610(var27);
        }
        if (var26 == null) {
            return;
        }
        Statics.field1315 = 0;
        Statics.field1515 = 0;
        int var28 = -1;
        int[] var29 = var26.field1528;
        int[] var30 = var26.field1530;
        byte var31 = -1;
        field1324 = 0;
        try {
            Statics.field1310 = new int[var26.field1531];
            int var32 = 0;
            Statics.field1319 = new String[var26.field1532];
            int var33 = 0;
            for (int var34 = 1; var34 < var2.length; var34++) {
                if (var2[var34] instanceof Integer) {
                    int var35 = (Integer) var2[var34];
                    if (var35 == -2147483647) {
                        var35 = arg0.field818;
                    }
                    if (var35 == -2147483646) {
                        var35 = arg0.field820;
                    }
                    if (var35 == -2147483645) {
                        var35 = arg0.field817 == null ? -1 : arg0.field817.field2643;
                    }
                    if (var35 == -2147483644) {
                        var35 = arg0.field815;
                    }
                    if (var35 == -2147483643) {
                        var35 = arg0.field817 == null ? -1 : arg0.field817.field2644;
                    }
                    if (var35 == -2147483642) {
                        var35 = arg0.field821 == null ? -1 : arg0.field821.field2643;
                    }
                    if (var35 == -2147483641) {
                        var35 = arg0.field821 == null ? -1 : arg0.field821.field2644;
                    }
                    if (var35 == -2147483640) {
                        var35 = arg0.field823;
                    }
                    if (var35 == -2147483639) {
                        var35 = arg0.field819;
                    }
                    Statics.field1310[var32++] = var35;
                } else if (var2[var34] instanceof String) {
                    String var36 = (String) var2[var34];
                    if (var36.equals("event_opbase")) {
                        var36 = arg0.field816;
                    }
                    Statics.field1319[var33++] = var36;
                }
            }
            int var37 = 0;
            field1322 = arg0.field825;
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
                                                                                                                label1269: while (true) {
                                                                                                                    var37++;
                                                                                                                    if (var37 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var28++;
                                                                                                                    int var267 = var29[var28];
                                                                                                                    if (var267 >= 100) {
                                                                                                                        boolean var71;
                                                                                                                        if (var26.field1530[var28] == 1) {
                                                                                                                            var71 = true;
                                                                                                                        } else {
                                                                                                                            var71 = false;
                                                                                                                        }
                                                                                                                        int var72;
                                                                                                                        if (var267 < 1000) {
                                                                                                                            var72 = method22(var267, var26, var71);
                                                                                                                        } else if (var267 < 1100) {
                                                                                                                            var72 = method1037(var267, var26, var71);
                                                                                                                        } else if (var267 < 1200) {
                                                                                                                            var72 = method1014(var267, var26, var71);
                                                                                                                        } else if (var267 < 1300) {
                                                                                                                            var72 = method67(var267, var26, var71);
                                                                                                                        } else if (var267 < 1400) {
                                                                                                                            var72 = method2790(var267, var26, var71);
                                                                                                                        } else if (var267 < 1500) {
                                                                                                                            var72 = method1392(var267, var26, var71);
                                                                                                                        } else if (var267 < 1600) {
                                                                                                                            class217 var76 = var71 ? Statics.field1312 : Statics.field2385;
                                                                                                                            byte var77;
                                                                                                                            if (var267 == 1500) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var76.field2656;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var267 == 1501) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var76.field2657;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var267 == 1502) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var76.field2730;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var267 == 1503) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var76.field2659;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var267 == 1504) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var76.field2663 ? 1 : 0;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var267 == 1505) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var76.field2675;
                                                                                                                                var77 = 1;
                                                                                                                            } else {
                                                                                                                                var77 = 2;
                                                                                                                            }
                                                                                                                            var72 = var77;
                                                                                                                        } else if (var267 < 1700) {
                                                                                                                            var72 = method467(var267, var26, var71);
                                                                                                                        } else if (var267 < 1800) {
                                                                                                                            var72 = method51(var267, var26, var71);
                                                                                                                        } else if (var267 < 1900) {
                                                                                                                            class217 var78 = var71 ? Statics.field1312 : Statics.field2385;
                                                                                                                            byte var83;
                                                                                                                            if (var267 == 1800) {
                                                                                                                                int[] var79 = field1314;
                                                                                                                                int var80 = ++Statics.field1315 - 1;
                                                                                                                                int var81 = Statics.method555(var78);
                                                                                                                                int var82 = var81 >> 11 & 0x3F;
                                                                                                                                var79[var80] = var82;
                                                                                                                                var83 = 1;
                                                                                                                            } else if (var267 == 1801) {
                                                                                                                                int var84 = field1314[--Statics.field1315];
                                                                                                                                int var268 = var84 - 1;
                                                                                                                                if (var78.field2632 == null || var268 >= var78.field2632.length || var78.field2632[var268] == null) {
                                                                                                                                    field1316[++Statics.field1515 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1316[++Statics.field1515 - 1] = var78.field2632[var268];
                                                                                                                                }
                                                                                                                                var83 = 1;
                                                                                                                            } else if (var267 == 1802) {
                                                                                                                                if (var78.field2716 == null) {
                                                                                                                                    field1316[++Statics.field1515 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1316[++Statics.field1515 - 1] = var78.field2716;
                                                                                                                                }
                                                                                                                                var83 = 1;
                                                                                                                            } else {
                                                                                                                                var83 = 2;
                                                                                                                            }
                                                                                                                            var72 = var83;
                                                                                                                        } else if (var267 < 2000) {
                                                                                                                            var72 = method1044(var267, var26, var71);
                                                                                                                        } else if (var267 < 2100) {
                                                                                                                            var72 = method1037(var267, var26, var71);
                                                                                                                        } else if (var267 < 2200) {
                                                                                                                            var72 = method1014(var267, var26, var71);
                                                                                                                        } else if (var267 < 2300) {
                                                                                                                            var72 = method67(var267, var26, var71);
                                                                                                                        } else if (var267 < 2400) {
                                                                                                                            var72 = method2790(var267, var26, var71);
                                                                                                                        } else if (var267 < 2500) {
                                                                                                                            var72 = method1392(var267, var26, var71);
                                                                                                                        } else if (var267 < 2600) {
                                                                                                                            var72 = method236(var267, var26, var71);
                                                                                                                        } else if (var267 < 2700) {
                                                                                                                            class217 var85 = class217.method4432(field1314[--Statics.field1315]);
                                                                                                                            byte var86;
                                                                                                                            if (var267 == 2600) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2630;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2601) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2692;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2602) {
                                                                                                                                field1316[++Statics.field1515 - 1] = var85.field2703;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2603) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2666;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2604) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2661;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2605) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2697;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2606) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2720;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2607) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2654;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2608) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2695;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2609) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2674;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2610) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2735;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2611) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2668;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2612) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2669;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var267 == 2613) {
                                                                                                                                field1314[++Statics.field1315 - 1] = var85.field2673.method7();
                                                                                                                                var86 = 1;
                                                                                                                            } else {
                                                                                                                                var86 = 2;
                                                                                                                            }
                                                                                                                            var72 = var86;
                                                                                                                        } else if (var267 < 2800) {
                                                                                                                            var72 = method156(var267, var26, var71);
                                                                                                                        } else if (var267 < 2900) {
                                                                                                                            class217 var87 = class217.method4432(field1314[--Statics.field1315]);
                                                                                                                            byte var92;
                                                                                                                            if (var267 == 2800) {
                                                                                                                                int[] var88 = field1314;
                                                                                                                                int var89 = ++Statics.field1315 - 1;
                                                                                                                                int var90 = Statics.method555(var87);
                                                                                                                                int var91 = var90 >> 11 & 0x3F;
                                                                                                                                var88[var89] = var91;
                                                                                                                                var92 = 1;
                                                                                                                            } else if (var267 == 2801) {
                                                                                                                                int var93 = field1314[--Statics.field1315];
                                                                                                                                int var269 = var93 - 1;
                                                                                                                                if (var87.field2632 == null || var269 >= var87.field2632.length || var87.field2632[var269] == null) {
                                                                                                                                    field1316[++Statics.field1515 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1316[++Statics.field1515 - 1] = var87.field2632[var269];
                                                                                                                                }
                                                                                                                                var92 = 1;
                                                                                                                            } else if (var267 == 2802) {
                                                                                                                                if (var87.field2716 == null) {
                                                                                                                                    field1316[++Statics.field1515 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1316[++Statics.field1515 - 1] = var87.field2716;
                                                                                                                                }
                                                                                                                                var92 = 1;
                                                                                                                            } else {
                                                                                                                                var92 = 2;
                                                                                                                            }
                                                                                                                            var72 = var92;
                                                                                                                        } else if (var267 < 3000) {
                                                                                                                            var72 = method1044(var267, var26, var71);
                                                                                                                        } else if (var267 < 3200) {
                                                                                                                            byte var95;
                                                                                                                            if (var267 == 3100) {
                                                                                                                                String var94 = field1316[--Statics.field1515];
                                                                                                                                class99.method2696(0, "", var94);
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3101) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                client.method573(Statics.field308, field1314[Statics.field1315], field1314[Statics.field1315 + 1]);
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3103) {
                                                                                                                                client.method1006();
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3104) {
                                                                                                                                String var96 = field1316[--Statics.field1515];
                                                                                                                                int var97 = 0;
                                                                                                                                if (class271.method4565(var96)) {
                                                                                                                                    var97 = class271.method1007(var96);
                                                                                                                                }
                                                                                                                                client.field933.method3179(120);
                                                                                                                                client.field933.method2919(var97);
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3105) {
                                                                                                                                String var98 = field1316[--Statics.field1515];
                                                                                                                                client.field933.method3179(54);
                                                                                                                                client.field933.method3031(var98.length() + 1);
                                                                                                                                client.field933.method2922(var98);
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3106) {
                                                                                                                                String var99 = field1316[--Statics.field1515];
                                                                                                                                client.field933.method3179(204);
                                                                                                                                client.field933.method3031(var99.length() + 1);
                                                                                                                                client.field933.method2922(var99);
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3107) {
                                                                                                                                int var100 = field1314[--Statics.field1315];
                                                                                                                                String var101 = field1316[--Statics.field1515];
                                                                                                                                int var102 = class97.field1490;
                                                                                                                                int[] var103 = class97.field1497;
                                                                                                                                boolean var104 = false;
                                                                                                                                for (int var105 = 0; var105 < var102; var105++) {
                                                                                                                                    class75 var106 = client.field1032[var103[var105]];
                                                                                                                                    if (var106 != null && Statics.field308 != var106 && var106.field881 != null && var106.field881.equalsIgnoreCase(var101)) {
                                                                                                                                        if (var100 == 1) {
                                                                                                                                            client.field933.method3179(207);
                                                                                                                                            client.field933.method2956(0);
                                                                                                                                            client.field933.method2965(var103[var105]);
                                                                                                                                        } else if (var100 == 4) {
                                                                                                                                            client.field933.method3179(34);
                                                                                                                                            client.field933.method2917(var103[var105]);
                                                                                                                                            client.field933.method2956(0);
                                                                                                                                        } else if (var100 == 6) {
                                                                                                                                            client.field933.method3179(139);
                                                                                                                                            client.field933.method2954(0);
                                                                                                                                            client.field933.method2917(var103[var105]);
                                                                                                                                        } else if (var100 == 7) {
                                                                                                                                            client.field933.method3179(69);
                                                                                                                                            client.field933.method3113(var103[var105]);
                                                                                                                                            client.field933.method2956(0);
                                                                                                                                        }
                                                                                                                                        var104 = true;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (!var104) {
                                                                                                                                    class99.method2696(4, "", class226.field2894 + var101);
                                                                                                                                }
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3108) {
                                                                                                                                Statics.field1315 -= 3;
                                                                                                                                int var107 = field1314[Statics.field1315];
                                                                                                                                int var108 = field1314[Statics.field1315 + 1];
                                                                                                                                int var109 = field1314[Statics.field1315 + 2];
                                                                                                                                class217 var110 = class217.method4432(var109);
                                                                                                                                client.method1029(var110, var107, var108);
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3109) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var111 = field1314[Statics.field1315];
                                                                                                                                int var112 = field1314[Statics.field1315 + 1];
                                                                                                                                class217 var113 = var71 ? Statics.field1312 : Statics.field2385;
                                                                                                                                client.method1029(var113, var111, var112);
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3110) {
                                                                                                                                Statics.field2179 = field1314[--Statics.field1315] == 1;
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3111) {
                                                                                                                                field1314[++Statics.field1315 - 1] = Statics.field1990.field1285 ? 1 : 0;
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3112) {
                                                                                                                                Statics.field1990.field1285 = field1314[--Statics.field1315] == 1;
                                                                                                                                class82.method2307();
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3113) {
                                                                                                                                String var114 = field1316[--Statics.field1515];
                                                                                                                                boolean var115 = field1314[--Statics.field1315] == 1;
                                                                                                                                class57.method40(var114, var115, false);
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3115) {
                                                                                                                                int var116 = field1314[--Statics.field1315];
                                                                                                                                client.field933.method3179(224);
                                                                                                                                client.field933.method2917(var116);
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var267 == 3116) {
                                                                                                                                int var117 = field1314[--Statics.field1315];
                                                                                                                                Statics.field1515 -= 2;
                                                                                                                                String var118 = field1316[Statics.field1515];
                                                                                                                                String var119 = field1316[Statics.field1515 + 1];
                                                                                                                                if (var118.length() > 500) {
                                                                                                                                    var95 = 1;
                                                                                                                                } else if (var119.length() > 500) {
                                                                                                                                    var95 = 1;
                                                                                                                                } else {
                                                                                                                                    client.field933.method3179(239);
                                                                                                                                    client.field933.method2917(1 + class174.method640(var118) + class174.method640(var119));
                                                                                                                                    client.field933.method2922(var118);
                                                                                                                                    client.field933.method2922(var119);
                                                                                                                                    client.field933.method3031(var117);
                                                                                                                                    var95 = 1;
                                                                                                                                }
                                                                                                                            } else if (var267 == 3117) {
                                                                                                                                client.field1006 = field1314[--Statics.field1315] == 1;
                                                                                                                                var95 = 1;
                                                                                                                            } else {
                                                                                                                                var95 = 2;
                                                                                                                            }
                                                                                                                            var72 = var95;
                                                                                                                        } else if (var267 < 3300) {
                                                                                                                            byte var123;
                                                                                                                            if (var267 == 3200) {
                                                                                                                                Statics.field1315 -= 3;
                                                                                                                                int var120 = field1314[Statics.field1315];
                                                                                                                                int var121 = field1314[Statics.field1315 + 1];
                                                                                                                                int var122 = field1314[Statics.field1315 + 2];
                                                                                                                                if (client.field1130 != 0 && var121 != 0 && client.field1132 < 50) {
                                                                                                                                    client.field1133[client.field1132] = var120;
                                                                                                                                    client.field1010[client.field1132] = var121;
                                                                                                                                    client.field1135[client.field1132] = var122;
                                                                                                                                    client.field1137[client.field1132] = null;
                                                                                                                                    client.field1136[client.field1132] = 0;
                                                                                                                                    client.field1132++;
                                                                                                                                }
                                                                                                                                var123 = 1;
                                                                                                                            } else if (var267 == 3201) {
                                                                                                                                int var124 = field1314[--Statics.field1315];
                                                                                                                                if (var124 == -1 && !client.field1110) {
                                                                                                                                    Statics.field502.method3508();
                                                                                                                                    class204.field2499 = 1;
                                                                                                                                    Statics.field3381 = null;
                                                                                                                                } else if (var124 != -1 && client.field1128 != var124 && client.field1078 != 0 && !client.field1110) {
                                                                                                                                    class204.method55(2, Statics.field575, var124, 0, client.field1078, false);
                                                                                                                                }
                                                                                                                                client.field1128 = var124;
                                                                                                                                var123 = 1;
                                                                                                                            } else if (var267 == 3202) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var125 = field1314[Statics.field1315];
                                                                                                                                int var126 = field1314[Statics.field1315 + 1];
                                                                                                                                if (client.field1078 != 0 && var125 != -1) {
                                                                                                                                    class204.method291(Statics.field467, var125, 0, client.field1078, false);
                                                                                                                                    client.field1110 = true;
                                                                                                                                }
                                                                                                                                var123 = 1;
                                                                                                                            } else {
                                                                                                                                var123 = 2;
                                                                                                                            }
                                                                                                                            var72 = var123;
                                                                                                                        } else if (var267 < 3400) {
                                                                                                                            byte var127;
                                                                                                                            if (var267 == 3300) {
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field900;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3301) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var128 = field1314[Statics.field1315];
                                                                                                                                int var129 = field1314[Statics.field1315 + 1];
                                                                                                                                int[] var130 = field1314;
                                                                                                                                int var131 = ++Statics.field1315 - 1;
                                                                                                                                class64 var132 = (class64) class64.field774.method3331((long) var128);
                                                                                                                                int var133;
                                                                                                                                if (var132 == null) {
                                                                                                                                    var133 = -1;
                                                                                                                                } else if (var129 >= 0 && var129 < var132.field768.length) {
                                                                                                                                    var133 = var132.field768[var129];
                                                                                                                                } else {
                                                                                                                                    var133 = -1;
                                                                                                                                }
                                                                                                                                var130[var131] = var133;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3302) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var134 = field1314[Statics.field1315];
                                                                                                                                int var135 = field1314[Statics.field1315 + 1];
                                                                                                                                field1314[++Statics.field1315 - 1] = class64.method681(var134, var135);
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3303) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var136 = field1314[Statics.field1315];
                                                                                                                                int var137 = field1314[Statics.field1315 + 1];
                                                                                                                                int[] var138 = field1314;
                                                                                                                                int var139 = ++Statics.field1315 - 1;
                                                                                                                                class64 var140 = (class64) class64.field774.method3331((long) var136);
                                                                                                                                int var141;
                                                                                                                                if (var140 == null) {
                                                                                                                                    var141 = 0;
                                                                                                                                } else if (var137 == -1) {
                                                                                                                                    var141 = 0;
                                                                                                                                } else {
                                                                                                                                    int var142 = 0;
                                                                                                                                    for (int var143 = 0; var143 < var140.field770.length; var143++) {
                                                                                                                                        if (var140.field768[var143] == var137) {
                                                                                                                                            var142 += var140.field770[var143];
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var141 = var142;
                                                                                                                                }
                                                                                                                                var138[var139] = var141;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3304) {
                                                                                                                                int var144 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = class241.method579(var144).field3268;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3305) {
                                                                                                                                int var145 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1025[var145];
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3306) {
                                                                                                                                int var146 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1026[var146];
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3307) {
                                                                                                                                int var147 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field977[var147];
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3308) {
                                                                                                                                int var148 = Statics.field3606;
                                                                                                                                int var149 = (Statics.field308.field1247 >> 7) + Statics.field2304;
                                                                                                                                int var150 = (Statics.field308.field1200 >> 7) + Statics.field2147;
                                                                                                                                field1314[++Statics.field1315 - 1] = (var148 << 28) + (var149 << 14) + var150;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3309) {
                                                                                                                                int var151 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = var151 >> 14 & 0x3FFF;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3310) {
                                                                                                                                int var152 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = var152 >> 28;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3311) {
                                                                                                                                int var153 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = var153 & 0x3FFF;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3312) {
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1147 ? 1 : 0;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3313) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var154 = field1314[Statics.field1315] + 32768;
                                                                                                                                int var155 = field1314[Statics.field1315 + 1];
                                                                                                                                int[] var156 = field1314;
                                                                                                                                int var157 = ++Statics.field1315 - 1;
                                                                                                                                class64 var158 = (class64) class64.field774.method3331((long) var154);
                                                                                                                                int var159;
                                                                                                                                if (var158 == null) {
                                                                                                                                    var159 = -1;
                                                                                                                                } else if (var155 >= 0 && var155 < var158.field768.length) {
                                                                                                                                    var159 = var158.field768[var155];
                                                                                                                                } else {
                                                                                                                                    var159 = -1;
                                                                                                                                }
                                                                                                                                var156[var157] = var159;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3314) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var160 = field1314[Statics.field1315] + 32768;
                                                                                                                                int var161 = field1314[Statics.field1315 + 1];
                                                                                                                                field1314[++Statics.field1315 - 1] = class64.method681(var160, var161);
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3315) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var162 = field1314[Statics.field1315] + 32768;
                                                                                                                                int var163 = field1314[Statics.field1315 + 1];
                                                                                                                                int[] var164 = field1314;
                                                                                                                                int var165 = ++Statics.field1315 - 1;
                                                                                                                                class64 var166 = (class64) class64.field774.method3331((long) var162);
                                                                                                                                int var167;
                                                                                                                                if (var166 == null) {
                                                                                                                                    var167 = 0;
                                                                                                                                } else if (var163 == -1) {
                                                                                                                                    var167 = 0;
                                                                                                                                } else {
                                                                                                                                    int var168 = 0;
                                                                                                                                    for (int var169 = 0; var169 < var166.field770.length; var169++) {
                                                                                                                                        if (var166.field768[var169] == var163) {
                                                                                                                                            var168 += var166.field770[var169];
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var167 = var168;
                                                                                                                                }
                                                                                                                                var164[var165] = var167;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3316) {
                                                                                                                                if (client.field1058 >= 2) {
                                                                                                                                    field1314[++Statics.field1315 - 1] = client.field1058;
                                                                                                                                } else {
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                }
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3317) {
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field907;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3318) {
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1079;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3321) {
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1108;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3322) {
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1011;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3323) {
                                                                                                                                if (client.field1060) {
                                                                                                                                    field1314[++Statics.field1315 - 1] = 1;
                                                                                                                                } else {
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                }
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3324) {
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field893;
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var267 == 3325) {
                                                                                                                                Statics.field1315 -= 4;
                                                                                                                                int var170 = field1314[Statics.field1315];
                                                                                                                                int var171 = field1314[Statics.field1315 + 1];
                                                                                                                                int var172 = field1314[Statics.field1315 + 2];
                                                                                                                                int var173 = field1314[Statics.field1315 + 3];
                                                                                                                                int var174 = (var171 << 14) + var170;
                                                                                                                                int var175 = (var172 << 28) + var174;
                                                                                                                                int var176 = var173 + var175;
                                                                                                                                field1314[++Statics.field1315 - 1] = var176;
                                                                                                                                var127 = 1;
                                                                                                                            } else {
                                                                                                                                var127 = 2;
                                                                                                                            }
                                                                                                                            var72 = var127;
                                                                                                                        } else if (var267 < 3500) {
                                                                                                                            byte var185;
                                                                                                                            if (var267 == 3400) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var177 = field1314[Statics.field1315];
                                                                                                                                int var178 = field1314[Statics.field1315 + 1];
                                                                                                                                class254 var179 = (class254) class254.field3394.method3308((long) var177);
                                                                                                                                class254 var180;
                                                                                                                                if (var179 == null) {
                                                                                                                                    byte[] var181 = Statics.field3401.method3836(8, var177);
                                                                                                                                    class254 var182 = new class254();
                                                                                                                                    if (var181 != null) {
                                                                                                                                        var182.method4174(new class174(var181));
                                                                                                                                    }
                                                                                                                                    class254.field3394.method3316(var182, (long) var177);
                                                                                                                                    var180 = var182;
                                                                                                                                } else {
                                                                                                                                    var180 = var179;
                                                                                                                                }
                                                                                                                                class254 var183 = var180;
                                                                                                                                if (var180.field3397 != 's') {
                                                                                                                                }
                                                                                                                                for (int var184 = 0; var184 < var183.field3395; var184++) {
                                                                                                                                    if (var183.field3398[var184] == var178) {
                                                                                                                                        field1316[++Statics.field1515 - 1] = var183.field3403[var184];
                                                                                                                                        var183 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var183 != null) {
                                                                                                                                    field1316[++Statics.field1515 - 1] = var183.field3400;
                                                                                                                                }
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var267 == 3408) {
                                                                                                                                Statics.field1315 -= 4;
                                                                                                                                int var186 = field1314[Statics.field1315];
                                                                                                                                int var187 = field1314[Statics.field1315 + 1];
                                                                                                                                int var188 = field1314[Statics.field1315 + 2];
                                                                                                                                int var189 = field1314[Statics.field1315 + 3];
                                                                                                                                class254 var190 = (class254) class254.field3394.method3308((long) var188);
                                                                                                                                class254 var191;
                                                                                                                                if (var190 == null) {
                                                                                                                                    byte[] var192 = Statics.field3401.method3836(8, var188);
                                                                                                                                    class254 var193 = new class254();
                                                                                                                                    if (var192 != null) {
                                                                                                                                        var193.method4174(new class174(var192));
                                                                                                                                    }
                                                                                                                                    class254.field3394.method3316(var193, (long) var188);
                                                                                                                                    var191 = var193;
                                                                                                                                } else {
                                                                                                                                    var191 = var190;
                                                                                                                                }
                                                                                                                                class254 var194 = var191;
                                                                                                                                if (var191.field3396 == var186 && var191.field3397 == var187) {
                                                                                                                                    for (int var195 = 0; var195 < var194.field3395; var195++) {
                                                                                                                                        if (var194.field3398[var195] == var189) {
                                                                                                                                            if (var187 == 115) {
                                                                                                                                                field1316[++Statics.field1515 - 1] = var194.field3403[var195];
                                                                                                                                            } else {
                                                                                                                                                field1314[++Statics.field1315 - 1] = var194.field3402[var195];
                                                                                                                                            }
                                                                                                                                            var194 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var194 != null) {
                                                                                                                                        if (var187 == 115) {
                                                                                                                                            field1316[++Statics.field1515 - 1] = var194.field3400;
                                                                                                                                        } else {
                                                                                                                                            field1314[++Statics.field1315 - 1] = var194.field3399;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var185 = 1;
                                                                                                                                } else {
                                                                                                                                    if (var187 == 115) {
                                                                                                                                        field1316[++Statics.field1515 - 1] = "null";
                                                                                                                                    } else {
                                                                                                                                        field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    }
                                                                                                                                    var185 = 1;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var185 = 2;
                                                                                                                            }
                                                                                                                            var72 = var185;
                                                                                                                        } else if (var267 < 3700) {
                                                                                                                            var72 = method489(var267, var26, var71);
                                                                                                                        } else if (var267 < 4000) {
                                                                                                                            byte var197;
                                                                                                                            if (var267 == 3903) {
                                                                                                                                int var196 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1166[var196].method89();
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3904) {
                                                                                                                                int var198 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1166[var198].field299;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3905) {
                                                                                                                                int var199 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1166[var199].field300;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3906) {
                                                                                                                                int var200 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1166[var200].field298;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3907) {
                                                                                                                                int var201 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1166[var201].field302;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3908) {
                                                                                                                                int var202 = field1314[--Statics.field1315];
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1166[var202].field301;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3910) {
                                                                                                                                int var203 = field1314[--Statics.field1315];
                                                                                                                                int var204 = client.field1166[var203].method104();
                                                                                                                                field1314[++Statics.field1315 - 1] = var204 == 0 ? 1 : 0;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3911) {
                                                                                                                                int var205 = field1314[--Statics.field1315];
                                                                                                                                int var206 = client.field1166[var205].method104();
                                                                                                                                field1314[++Statics.field1315 - 1] = var206 == 2 ? 1 : 0;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3912) {
                                                                                                                                int var207 = field1314[--Statics.field1315];
                                                                                                                                int var208 = client.field1166[var207].method104();
                                                                                                                                field1314[++Statics.field1315 - 1] = var208 == 5 ? 1 : 0;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3913) {
                                                                                                                                int var209 = field1314[--Statics.field1315];
                                                                                                                                int var210 = client.field1166[var209].method104();
                                                                                                                                field1314[++Statics.field1315 - 1] = var210 == 1 ? 1 : 0;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3914) {
                                                                                                                                boolean var211 = field1314[--Statics.field1315] == 1;
                                                                                                                                if (Statics.field2403 != null) {
                                                                                                                                    Statics.field2403.method56(class14.field281, var211);
                                                                                                                                }
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3915) {
                                                                                                                                boolean var212 = field1314[--Statics.field1315] == 1;
                                                                                                                                if (Statics.field2403 != null) {
                                                                                                                                    Statics.field2403.method56(class14.field283, var212);
                                                                                                                                }
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3916) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                boolean var213 = field1314[Statics.field1315] == 1;
                                                                                                                                boolean var214 = field1314[Statics.field1315 + 1] == 1;
                                                                                                                                if (Statics.field2403 != null) {
                                                                                                                                    Statics.field2403.method56(new class96(var214), var213);
                                                                                                                                }
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3917) {
                                                                                                                                boolean var215 = field1314[--Statics.field1315] == 1;
                                                                                                                                if (Statics.field2403 != null) {
                                                                                                                                    Statics.field2403.method56(class14.field279, var215);
                                                                                                                                }
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3918) {
                                                                                                                                boolean var216 = field1314[--Statics.field1315] == 1;
                                                                                                                                if (Statics.field2403 != null) {
                                                                                                                                    Statics.field2403.method56(class14.field282, var216);
                                                                                                                                }
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3919) {
                                                                                                                                field1314[++Statics.field1315 - 1] = Statics.field2403 == null ? 0 : Statics.field2403.field278.size();
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3920) {
                                                                                                                                int var217 = field1314[--Statics.field1315];
                                                                                                                                class15 var218 = (class15) Statics.field2403.field278.get(var217);
                                                                                                                                field1314[++Statics.field1315 - 1] = var218.field286;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3921) {
                                                                                                                                int var219 = field1314[--Statics.field1315];
                                                                                                                                class15 var220 = (class15) Statics.field2403.field278.get(var219);
                                                                                                                                field1316[++Statics.field1515 - 1] = var220.method63();
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3922) {
                                                                                                                                int var221 = field1314[--Statics.field1315];
                                                                                                                                class15 var222 = (class15) Statics.field2403.field278.get(var221);
                                                                                                                                field1316[++Statics.field1515 - 1] = var222.method73();
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3923) {
                                                                                                                                int var223 = field1314[--Statics.field1315];
                                                                                                                                class15 var224 = (class15) Statics.field2403.field278.get(var223);
                                                                                                                                long var225 = class176.method3821() - Statics.field228 - var224.field290;
                                                                                                                                int var227 = (int) (var225 / 3600000L);
                                                                                                                                int var228 = (int) ((var225 - (long) (var227 * 3600000)) / 60000L);
                                                                                                                                int var229 = (int) ((var225 - (long) (var227 * 3600000) - (long) (var228 * 60000)) / 1000L);
                                                                                                                                String var230 = var227 + ":" + var228 / 10 + var228 % 10 + ":" + var229 / 10 + var229 % 10;
                                                                                                                                field1316[++Statics.field1515 - 1] = var230;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3924) {
                                                                                                                                int var231 = field1314[--Statics.field1315];
                                                                                                                                class15 var232 = (class15) Statics.field2403.field278.get(var231);
                                                                                                                                field1314[++Statics.field1315 - 1] = var232.field287.field298;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3925) {
                                                                                                                                int var233 = field1314[--Statics.field1315];
                                                                                                                                class15 var234 = (class15) Statics.field2403.field278.get(var233);
                                                                                                                                field1314[++Statics.field1315 - 1] = var234.field287.field300;
                                                                                                                                var197 = 1;
                                                                                                                            } else if (var267 == 3926) {
                                                                                                                                int var235 = field1314[--Statics.field1315];
                                                                                                                                class15 var236 = (class15) Statics.field2403.field278.get(var235);
                                                                                                                                field1314[++Statics.field1315 - 1] = var236.field287.field299;
                                                                                                                                var197 = 1;
                                                                                                                            } else {
                                                                                                                                var197 = 2;
                                                                                                                            }
                                                                                                                            var72 = var197;
                                                                                                                        } else if (var267 < 4100) {
                                                                                                                            var72 = method235(var267, var26, var71);
                                                                                                                        } else if (var267 < 4200) {
                                                                                                                            var72 = method1596(var267, var26, var71);
                                                                                                                        } else if (var267 < 4300) {
                                                                                                                            var72 = method1004(var267, var26, var71);
                                                                                                                        } else if (var267 < 5100) {
                                                                                                                            var72 = method228(var267, var26, var71);
                                                                                                                        } else if (var267 < 5400) {
                                                                                                                            var72 = method225(var267, var26, var71);
                                                                                                                        } else if (var267 < 5600) {
                                                                                                                            var72 = method86(var267, var26, var71);
                                                                                                                        } else if (var267 < 5700) {
                                                                                                                            var72 = method2305(var267, var26, var71);
                                                                                                                        } else if (var267 < 6300) {
                                                                                                                            byte var237;
                                                                                                                            if (var267 == 6200) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                client.field901 = (short) field1314[Statics.field1315];
                                                                                                                                if (client.field901 <= 0) {
                                                                                                                                    client.field901 = 256;
                                                                                                                                }
                                                                                                                                client.field1145 = (short) field1314[Statics.field1315 + 1];
                                                                                                                                if (client.field1145 <= 0) {
                                                                                                                                    client.field1145 = 205;
                                                                                                                                }
                                                                                                                                var237 = 1;
                                                                                                                            } else if (var267 == 6201) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                client.field943 = (short) field1314[Statics.field1315];
                                                                                                                                if (client.field943 <= 0) {
                                                                                                                                    client.field943 = 256;
                                                                                                                                }
                                                                                                                                client.field1122 = (short) field1314[Statics.field1315 + 1];
                                                                                                                                if (client.field1122 <= 0) {
                                                                                                                                    client.field1122 = 320;
                                                                                                                                }
                                                                                                                                var237 = 1;
                                                                                                                            } else if (var267 == 6202) {
                                                                                                                                Statics.field1315 -= 4;
                                                                                                                                client.field1148 = (short) field1314[Statics.field1315];
                                                                                                                                if (client.field1148 <= 0) {
                                                                                                                                    client.field1148 = 1;
                                                                                                                                }
                                                                                                                                client.field1149 = (short) field1314[Statics.field1315 + 1];
                                                                                                                                if (client.field1149 <= 0) {
                                                                                                                                    client.field1149 = 32767;
                                                                                                                                } else if (client.field1149 < client.field1148) {
                                                                                                                                    client.field1149 = client.field1148;
                                                                                                                                }
                                                                                                                                client.field1150 = (short) field1314[Statics.field1315 + 2];
                                                                                                                                if (client.field1150 <= 0) {
                                                                                                                                    client.field1150 = 1;
                                                                                                                                }
                                                                                                                                client.field915 = (short) field1314[Statics.field1315 + 3];
                                                                                                                                if (client.field915 <= 0) {
                                                                                                                                    client.field915 = 32767;
                                                                                                                                } else if (client.field915 < client.field1150) {
                                                                                                                                    client.field915 = client.field1150;
                                                                                                                                }
                                                                                                                                var237 = 1;
                                                                                                                            } else if (var267 == 6203) {
                                                                                                                                if (client.field904 == null) {
                                                                                                                                    field1314[++Statics.field1315 - 1] = -1;
                                                                                                                                    field1314[++Statics.field1315 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    client.method1394(0, 0, client.field904.field2730, client.field904.field2659, false);
                                                                                                                                    field1314[++Statics.field1315 - 1] = client.field1154;
                                                                                                                                    field1314[++Statics.field1315 - 1] = client.field1155;
                                                                                                                                }
                                                                                                                                var237 = 1;
                                                                                                                            } else if (var267 == 6204) {
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field943;
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1122;
                                                                                                                                var237 = 1;
                                                                                                                            } else if (var267 == 6205) {
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field901;
                                                                                                                                field1314[++Statics.field1315 - 1] = client.field1145;
                                                                                                                                var237 = 1;
                                                                                                                            } else {
                                                                                                                                var237 = 2;
                                                                                                                            }
                                                                                                                            var72 = var237;
                                                                                                                        } else if (var267 < 6600) {
                                                                                                                            byte var238;
                                                                                                                            if (var267 == 6500) {
                                                                                                                                field1314[++Statics.field1315 - 1] = class81.method552() ? 1 : 0;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var267 == 6501) {
                                                                                                                                class81 var239 = class81.method198();
                                                                                                                                if (var239 == null) {
                                                                                                                                    field1314[++Statics.field1315 - 1] = -1;
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    field1316[++Statics.field1515 - 1] = "";
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    field1316[++Statics.field1515 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1314[++Statics.field1315 - 1] = var239.field1278;
                                                                                                                                    field1314[++Statics.field1315 - 1] = var239.field1274;
                                                                                                                                    field1316[++Statics.field1515 - 1] = var239.field1267;
                                                                                                                                    field1314[++Statics.field1315 - 1] = var239.field1272;
                                                                                                                                    field1314[++Statics.field1315 - 1] = var239.field1273;
                                                                                                                                    field1316[++Statics.field1515 - 1] = var239.field1276;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var267 == 6502) {
                                                                                                                                class81 var240 = class81.method3826();
                                                                                                                                if (var240 == null) {
                                                                                                                                    field1314[++Statics.field1315 - 1] = -1;
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    field1316[++Statics.field1515 - 1] = "";
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    field1316[++Statics.field1515 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1314[++Statics.field1315 - 1] = var240.field1278;
                                                                                                                                    field1314[++Statics.field1315 - 1] = var240.field1274;
                                                                                                                                    field1316[++Statics.field1515 - 1] = var240.field1267;
                                                                                                                                    field1314[++Statics.field1315 - 1] = var240.field1272;
                                                                                                                                    field1314[++Statics.field1315 - 1] = var240.field1273;
                                                                                                                                    field1316[++Statics.field1515 - 1] = var240.field1276;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var267 == 6506) {
                                                                                                                                int var241 = field1314[--Statics.field1315];
                                                                                                                                class81 var242 = null;
                                                                                                                                for (int var243 = 0; var243 < class81.field1268; var243++) {
                                                                                                                                    if (Statics.field1277[var243].field1278 == var241) {
                                                                                                                                        var242 = Statics.field1277[var243];
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var242 == null) {
                                                                                                                                    field1314[++Statics.field1315 - 1] = -1;
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    field1316[++Statics.field1515 - 1] = "";
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    field1316[++Statics.field1515 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1314[++Statics.field1315 - 1] = var242.field1278;
                                                                                                                                    field1314[++Statics.field1315 - 1] = var242.field1274;
                                                                                                                                    field1316[++Statics.field1515 - 1] = var242.field1267;
                                                                                                                                    field1314[++Statics.field1315 - 1] = var242.field1272;
                                                                                                                                    field1314[++Statics.field1315 - 1] = var242.field1273;
                                                                                                                                    field1316[++Statics.field1515 - 1] = var242.field1276;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var267 == 6507) {
                                                                                                                                Statics.field1315 -= 4;
                                                                                                                                int var244 = field1314[Statics.field1315];
                                                                                                                                boolean var245 = field1314[Statics.field1315 + 1] == 1;
                                                                                                                                int var246 = field1314[Statics.field1315 + 2];
                                                                                                                                boolean var247 = field1314[Statics.field1315 + 3] == 1;
                                                                                                                                class81.method322(var244, var245, var246, var247);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var267 == 6511) {
                                                                                                                                int var248 = field1314[--Statics.field1315];
                                                                                                                                if (var248 >= 0 && var248 < class81.field1268) {
                                                                                                                                    class81 var249 = Statics.field1277[var248];
                                                                                                                                    field1314[++Statics.field1315 - 1] = var249.field1278;
                                                                                                                                    field1314[++Statics.field1315 - 1] = var249.field1274;
                                                                                                                                    field1316[++Statics.field1515 - 1] = var249.field1267;
                                                                                                                                    field1314[++Statics.field1315 - 1] = var249.field1272;
                                                                                                                                    field1314[++Statics.field1315 - 1] = var249.field1273;
                                                                                                                                    field1316[++Statics.field1515 - 1] = var249.field1276;
                                                                                                                                } else {
                                                                                                                                    field1314[++Statics.field1315 - 1] = -1;
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    field1316[++Statics.field1515 - 1] = "";
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    field1314[++Statics.field1315 - 1] = 0;
                                                                                                                                    field1316[++Statics.field1515 - 1] = "";
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var267 == 6512) {
                                                                                                                                client.field1037 = field1314[--Statics.field1315] == 1;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var267 == 6513) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var250 = field1314[Statics.field1315];
                                                                                                                                int var251 = field1314[Statics.field1315 + 1];
                                                                                                                                class252 var252 = class252.method699(var251);
                                                                                                                                if (var252.method4139()) {
                                                                                                                                    field1316[++Statics.field1515 - 1] = Statics.method3810(var250).method4348(var251, var252.field3386);
                                                                                                                                } else {
                                                                                                                                    field1314[++Statics.field1315 - 1] = Statics.method3810(var250).method4366(var251, var252.field3382);
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var267 == 6514) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var253 = field1314[Statics.field1315];
                                                                                                                                int var254 = field1314[Statics.field1315 + 1];
                                                                                                                                class252 var255 = class252.method699(var254);
                                                                                                                                if (var255.method4139()) {
                                                                                                                                    field1316[++Statics.field1515 - 1] = Statics.method564(var253).method4258(var254, var255.field3386);
                                                                                                                                } else {
                                                                                                                                    field1314[++Statics.field1315 - 1] = Statics.method564(var253).method4232(var254, var255.field3382);
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var267 == 6515) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var256 = field1314[Statics.field1315];
                                                                                                                                int var257 = field1314[Statics.field1315 + 1];
                                                                                                                                class252 var258 = class252.method699(var257);
                                                                                                                                if (var258.method4139()) {
                                                                                                                                    field1316[++Statics.field1515 - 1] = class257.method678(var256).method4285(var257, var258.field3386);
                                                                                                                                } else {
                                                                                                                                    field1314[++Statics.field1315 - 1] = class257.method678(var256).method4286(var257, var258.field3382);
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var267 == 6516) {
                                                                                                                                Statics.field1315 -= 2;
                                                                                                                                int var259 = field1314[Statics.field1315];
                                                                                                                                int var260 = field1314[Statics.field1315 + 1];
                                                                                                                                class252 var261 = class252.method699(var260);
                                                                                                                                if (var261.method4139()) {
                                                                                                                                    field1316[++Statics.field1515 - 1] = class253.method1727(var259).method4169(var260, var261.field3386);
                                                                                                                                } else {
                                                                                                                                    field1314[++Statics.field1315 - 1] = class253.method1727(var259).method4153(var260, var261.field3382);
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else {
                                                                                                                                var238 = 2;
                                                                                                                            }
                                                                                                                            var72 = var238;
                                                                                                                        } else if (var267 < 6700) {
                                                                                                                            var72 = method463(var267, var26, var71);
                                                                                                                        } else {
                                                                                                                            var72 = 2;
                                                                                                                        }
                                                                                                                        switch(var72) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var267 == 0) {
                                                                                                                        field1314[++Statics.field1315 - 1] = var30[var28];
                                                                                                                    } else if (var267 == 1) {
                                                                                                                        int var38 = var30[var28];
                                                                                                                        field1314[++Statics.field1315 - 1] = class212.field2597[var38];
                                                                                                                    } else if (var267 == 2) {
                                                                                                                        int var39 = var30[var28];
                                                                                                                        class212.field2597[var39] = field1314[--Statics.field1315];
                                                                                                                        client.method605(var39);
                                                                                                                    } else if (var267 == 3) {
                                                                                                                        field1316[++Statics.field1515 - 1] = var26.field1533[var28];
                                                                                                                    } else if (var267 == 6) {
                                                                                                                        var28 += var30[var28];
                                                                                                                    } else if (var267 == 7) {
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        if (field1314[Statics.field1315] != field1314[Statics.field1315 + 1]) {
                                                                                                                            var28 += var30[var28];
                                                                                                                        }
                                                                                                                    } else if (var267 == 8) {
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        if (field1314[Statics.field1315] == field1314[Statics.field1315 + 1]) {
                                                                                                                            var28 += var30[var28];
                                                                                                                        }
                                                                                                                    } else if (var267 == 9) {
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        if (field1314[Statics.field1315] < field1314[Statics.field1315 + 1]) {
                                                                                                                            var28 += var30[var28];
                                                                                                                        }
                                                                                                                    } else if (var267 == 10) {
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        if (field1314[Statics.field1315] > field1314[Statics.field1315 + 1]) {
                                                                                                                            var28 += var30[var28];
                                                                                                                        }
                                                                                                                    } else if (var267 == 21) {
                                                                                                                        if (field1324 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var40 = field1325[--field1324];
                                                                                                                        var26 = var40.field763;
                                                                                                                        var29 = var26.field1528;
                                                                                                                        var30 = var26.field1530;
                                                                                                                        var28 = var40.field765;
                                                                                                                        Statics.field1310 = var40.field764;
                                                                                                                        Statics.field1319 = var40.field766;
                                                                                                                    } else if (var267 == 25) {
                                                                                                                        int var41 = var30[var28];
                                                                                                                        field1314[++Statics.field1315 - 1] = class212.method1417(var41);
                                                                                                                    } else if (var267 == 27) {
                                                                                                                        int var42 = var30[var28];
                                                                                                                        int var43 = field1314[--Statics.field1315];
                                                                                                                        class251 var44 = class251.method53(var42);
                                                                                                                        int var45 = var44.field3375;
                                                                                                                        int var46 = var44.field3376;
                                                                                                                        int var47 = var44.field3377;
                                                                                                                        int var48 = class212.field2598[var47 - var46];
                                                                                                                        if (var43 < 0 || var43 > var48) {
                                                                                                                            var43 = 0;
                                                                                                                        }
                                                                                                                        int var49 = var48 << var46;
                                                                                                                        class212.field2597[var45] = class212.field2597[var45] & ~var49 | var43 << var46 & var49;
                                                                                                                    } else if (var267 == 31) {
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        if (field1314[Statics.field1315] <= field1314[Statics.field1315 + 1]) {
                                                                                                                            var28 += var30[var28];
                                                                                                                        }
                                                                                                                    } else if (var267 == 32) {
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        if (field1314[Statics.field1315] >= field1314[Statics.field1315 + 1]) {
                                                                                                                            var28 += var30[var28];
                                                                                                                        }
                                                                                                                    } else if (var267 == 33) {
                                                                                                                        field1314[++Statics.field1315 - 1] = Statics.field1310[var30[var28]];
                                                                                                                    } else if (var267 == 34) {
                                                                                                                        Statics.field1310[var30[var28]] = field1314[--Statics.field1315];
                                                                                                                    } else if (var267 == 35) {
                                                                                                                        field1316[++Statics.field1515 - 1] = Statics.field1319[var30[var28]];
                                                                                                                    } else if (var267 == 36) {
                                                                                                                        Statics.field1319[var30[var28]] = field1316[--Statics.field1515];
                                                                                                                    } else if (var267 == 37) {
                                                                                                                        int var50 = var30[var28];
                                                                                                                        Statics.field1515 -= var50;
                                                                                                                        String var51 = class271.method657(field1316, Statics.field1515, var50);
                                                                                                                        field1316[++Statics.field1515 - 1] = var51;
                                                                                                                    } else if (var267 == 38) {
                                                                                                                        Statics.field1315--;
                                                                                                                    } else if (var267 == 39) {
                                                                                                                        Statics.field1515--;
                                                                                                                    } else if (var267 == 40) {
                                                                                                                        int var52 = var30[var28];
                                                                                                                        class100 var53 = class100.method1610(var52);
                                                                                                                        int[] var54 = new int[var53.field1531];
                                                                                                                        String[] var55 = new String[var53.field1532];
                                                                                                                        for (int var56 = 0; var56 < var53.field1534; var56++) {
                                                                                                                            var54[var56] = field1314[Statics.field1315 - var53.field1534 + var56];
                                                                                                                        }
                                                                                                                        for (int var57 = 0; var57 < var53.field1527; var57++) {
                                                                                                                            var55[var57] = field1316[Statics.field1515 - var53.field1527 + var57];
                                                                                                                        }
                                                                                                                        Statics.field1315 -= var53.field1534;
                                                                                                                        Statics.field1515 -= var53.field1527;
                                                                                                                        class63 var58 = new class63();
                                                                                                                        var58.field763 = var26;
                                                                                                                        var58.field765 = var28;
                                                                                                                        var58.field764 = Statics.field1310;
                                                                                                                        var58.field766 = Statics.field1319;
                                                                                                                        field1325[++field1324 - 1] = var58;
                                                                                                                        var26 = var53;
                                                                                                                        var29 = var53.field1528;
                                                                                                                        var30 = var53.field1530;
                                                                                                                        var28 = -1;
                                                                                                                        Statics.field1310 = var54;
                                                                                                                        Statics.field1319 = var55;
                                                                                                                    } else if (var267 == 42) {
                                                                                                                        field1314[++Statics.field1315 - 1] = Statics.field1173.method1673(var30[var28]);
                                                                                                                    } else if (var267 == 43) {
                                                                                                                        Statics.field1173.method1672(var30[var28], field1314[--Statics.field1315]);
                                                                                                                    } else if (var267 == 44) {
                                                                                                                        int var59 = var30[var28] >> 16;
                                                                                                                        int var60 = var30[var28] & 0xFFFF;
                                                                                                                        int var61 = field1314[--Statics.field1315];
                                                                                                                        if (var61 >= 0 && var61 <= 5000) {
                                                                                                                            field1323[var59] = var61;
                                                                                                                            byte var62 = -1;
                                                                                                                            if (var60 == 105) {
                                                                                                                                var62 = 0;
                                                                                                                            }
                                                                                                                            int var63 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var63 >= var61) {
                                                                                                                                    continue label1269;
                                                                                                                                }
                                                                                                                                field1313[var59][var63] = var62;
                                                                                                                                var63++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var267 == 45) {
                                                                                                                        int var64 = var30[var28];
                                                                                                                        int var65 = field1314[--Statics.field1315];
                                                                                                                        if (var65 < 0 || var65 >= field1323[var64]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1314[++Statics.field1315 - 1] = field1313[var64][var65];
                                                                                                                    } else if (var267 == 46) {
                                                                                                                        int var66 = var30[var28];
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        int var67 = field1314[Statics.field1315];
                                                                                                                        if (var67 < 0 || var67 >= field1323[var66]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1313[var66][var67] = field1314[Statics.field1315 + 1];
                                                                                                                    } else if (var267 == 47) {
                                                                                                                        String var68 = Statics.field1173.method1681(var30[var28]);
                                                                                                                        if (var68 == null) {
                                                                                                                            var68 = "null";
                                                                                                                        }
                                                                                                                        field1316[++Statics.field1515 - 1] = var68;
                                                                                                                    } else if (var267 == 48) {
                                                                                                                        Statics.field1173.method1702(var30[var28], field1316[--Statics.field1515]);
                                                                                                                    } else if (var267 == 60) {
                                                                                                                        class187 var69 = var26.field1529[var30[var28]];
                                                                                                                        class199 var70 = (class199) var69.method3275((long) field1314[--Statics.field1315]);
                                                                                                                        if (var70 != null) {
                                                                                                                            var28 += var70.field2481;
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
        } catch (Exception var266) {
            StringBuilder var264 = new StringBuilder(30);
            var264.append("").append(var26.field2467).append(" ");
            for (int var265 = field1324 - 1; var265 >= 0; var265--) {
                var264.append("").append(field1325[var265].field763.field2467).append(" ");
            }
            var264.append("").append(var31);
            class153.method3831(var264.toString(), var266);
        }
    }

    @ObfuscatedName("p.u(ILcc;ZI)I")
    public static int method22(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1315 -= 3;
            int var3 = field1314[Statics.field1315];
            int var4 = field1314[Statics.field1315 + 1];
            int var5 = field1314[Statics.field1315 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class217 var6 = class217.method4432(var3);
            if (var6.field2747 == null) {
                var6.field2747 = new class217[var5 + 1];
            }
            if (var6.field2747.length <= var5) {
                class217[] var7 = new class217[var5 + 1];
                for (int var8 = 0; var8 < var6.field2747.length; var8++) {
                    var7[var8] = var6.field2747[var8];
                }
                var6.field2747 = var7;
            }
            if (var5 > 0 && var6.field2747[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class217 var9 = new class217();
            var9.field2645 = var4;
            var9.field2675 = var9.field2643 = var6.field2643;
            var9.field2644 = var5;
            var9.field2642 = true;
            var6.field2747[var5] = var9;
            if (arg2) {
                Statics.field1312 = var9;
            } else {
                Statics.field2385 = var9;
            }
            client.method3808(var6);
            return 1;
        } else if (arg0 == 101) {
            class217 var10 = arg2 ? Statics.field1312 : Statics.field2385;
            class217 var11 = class217.method4432(var10.field2643);
            var11.field2747[var10.field2644] = null;
            client.method3808(var11);
            return 1;
        } else if (arg0 == 102) {
            class217 var12 = class217.method4432(field1314[--Statics.field1315]);
            var12.field2747 = null;
            client.method3808(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1315 -= 2;
            int var13 = field1314[Statics.field1315];
            int var14 = field1314[Statics.field1315 + 1];
            class217 var15 = class217.method1008(var13, var14);
            if (var15 == null || var14 == -1) {
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = 1;
                if (arg2) {
                    Statics.field1312 = var15;
                } else {
                    Statics.field2385 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class217 var16 = class217.method4432(field1314[--Statics.field1315]);
            if (var16 == null) {
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = 1;
                if (arg2) {
                    Statics.field1312 = var16;
                } else {
                    Statics.field2385 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bu.q(ILcc;ZI)I")
    public static int method1037(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1314[--Statics.field1315];
            var4 = class217.method4432(var3);
        } else {
            var4 = arg2 ? Statics.field1312 : Statics.field2385;
        }
        if (arg0 == 1000) {
            Statics.field1315 -= 4;
            var4.field2652 = field1314[Statics.field1315];
            var4.field2664 = field1314[Statics.field1315 + 1];
            var4.field2648 = field1314[Statics.field1315 + 2];
            var4.field2649 = field1314[Statics.field1315 + 3];
            client.method3808(var4);
            Statics.field357.method1095(var4);
            if (var3 != -1 && var4.field2645 == 0) {
                client.method169(Statics.field1401[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1315 -= 4;
            var4.field2662 = field1314[Statics.field1315];
            var4.field2639 = field1314[Statics.field1315 + 1];
            var4.field2714 = field1314[Statics.field1315 + 2];
            var4.field2655 = field1314[Statics.field1315 + 3];
            client.method3808(var4);
            Statics.field357.method1095(var4);
            if (var3 != -1 && var4.field2645 == 0) {
                client.method169(Statics.field1401[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1314[--Statics.field1315] == 1;
            if (var4.field2663 != var5) {
                var4.field2663 = var5;
                client.method3808(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2776 = field1314[--Statics.field1315] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2777 = field1314[--Statics.field1315] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("br.g(ILcc;ZI)I")
    public static int method1014(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1314[--Statics.field1315];
            var4 = class217.method4432(var3);
        } else {
            var4 = arg2 ? Statics.field1312 : Statics.field2385;
        }
        if (arg0 == 1100) {
            Statics.field1315 -= 2;
            var4.field2630 = field1314[Statics.field1315];
            if (var4.field2630 > var4.field2666 - var4.field2730) {
                var4.field2630 = var4.field2666 - var4.field2730;
            }
            if (var4.field2630 < 0) {
                var4.field2630 = 0;
            }
            var4.field2692 = field1314[Statics.field1315 + 1];
            if (var4.field2692 > var4.field2661 - var4.field2659) {
                var4.field2692 = var4.field2661 - var4.field2659;
            }
            if (var4.field2692 < 0) {
                var4.field2692 = 0;
            }
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2668 = field1314[--Statics.field1315];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2672 = field1314[--Statics.field1315] == 1;
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2674 = field1314[--Statics.field1315];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2670 = field1314[--Statics.field1315];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2678 = field1314[--Statics.field1315];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2680 = field1314[--Statics.field1315];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2724 = field1314[--Statics.field1315] == 1;
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2686 = 1;
            var4.field2687 = field1314[--Statics.field1315];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1315 -= 6;
            var4.field2753 = field1314[Statics.field1315];
            var4.field2693 = field1314[Statics.field1315 + 1];
            var4.field2720 = field1314[Statics.field1315 + 2];
            var4.field2695 = field1314[Statics.field1315 + 3];
            var4.field2654 = field1314[Statics.field1315 + 4];
            var4.field2697 = field1314[Statics.field1315 + 5];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1314[--Statics.field1315];
            if (var4.field2690 != var5) {
                var4.field2690 = var5;
                var4.field2774 = 0;
                var4.field2766 = 0;
                client.method3808(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2700 = field1314[--Statics.field1315] == 1;
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1316[--Statics.field1515];
            if (!var6.equals(var4.field2703)) {
                var4.field2703 = var6;
                client.method3808(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2702 = field1314[--Statics.field1315];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1315 -= 3;
            var4.field2706 = field1314[Statics.field1315];
            var4.field2773 = field1314[Statics.field1315 + 1];
            var4.field2705 = field1314[Statics.field1315 + 2];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2708 = field1314[--Statics.field1315] == 1;
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2682 = field1314[--Statics.field1315];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2743 = field1314[--Statics.field1315];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2745 = field1314[--Statics.field1315] == 1;
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2685 = field1314[--Statics.field1315] == 1;
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1315 -= 2;
            var4.field2666 = field1314[Statics.field1315];
            var4.field2661 = field1314[Statics.field1315 + 1];
            client.method3808(var4);
            if (var3 != -1 && var4.field2645 == 0) {
                client.method169(Statics.field1401[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method1737(var4.field2643, var4.field2644);
            client.field1055 = var4;
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2679 = field1314[--Statics.field1315];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2669 = field1314[--Statics.field1315];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2735 = field1314[--Statics.field1315];
            client.method3808(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1314[--Statics.field1315];
            class284 var8 = (class284) class169.method1267(class284.method2685(), var7);
            if (var8 != null) {
                var4.field2673 = var8;
                client.method3808(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1314[--Statics.field1315] == 1;
            var4.field2677 = var9;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("o.v(ILcc;ZI)I")
    public static int method67(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method4432(field1314[--Statics.field1315]);
        } else {
            var3 = arg2 ? Statics.field1312 : Statics.field2385;
        }
        client.method3808(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1315 -= 2;
            int var4 = field1314[Statics.field1315];
            int var5 = field1314[Statics.field1315 + 1];
            var3.field2763 = var4;
            var3.field2764 = var5;
            class257 var6 = class257.method678(var4);
            var3.field2720 = var6.field3524;
            var3.field2695 = var6.field3499;
            var3.field2654 = var6.field3500;
            var3.field2753 = var6.field3519;
            var3.field2693 = var6.field3502;
            var3.field2697 = var6.field3497;
            if (arg0 == 1205) {
                var3.field2771 = 0;
            } else if (arg0 == 1212 | var6.field3490 == 1) {
                var3.field2771 = 1;
            } else {
                var3.field2771 = 2;
            }
            if (var3.field2698 > 0) {
                var3.field2697 = var3.field2697 * 32 / var3.field2698;
            } else if (var3.field2662 > 0) {
                var3.field2697 = var3.field2697 * 32 / var3.field2662;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2686 = 2;
            var3.field2687 = field1314[--Statics.field1315];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2686 = 3;
            var3.field2687 = Statics.field308.field855.method3714();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ft.t(ILcc;ZB)I")
    public static int method2790(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method4432(field1314[--Statics.field1315]);
        } else {
            var3 = arg2 ? Statics.field1312 : Statics.field2385;
        }
        if (arg0 == 1300) {
            int var4 = field1314[--Statics.field1315] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3744(var4, field1316[--Statics.field1515]);
                return 1;
            } else {
                Statics.field1515--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1315 -= 2;
            int var5 = field1314[Statics.field1315];
            int var6 = field1314[Statics.field1315 + 1];
            var3.field2729 = class217.method1008(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2721 = field1314[--Statics.field1315] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2719 = field1314[--Statics.field1315];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2688 = field1314[--Statics.field1315];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2716 = field1316[--Statics.field1515];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2722 = field1316[--Statics.field1515];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2632 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.p(ILcc;ZI)I")
    public static int method1392(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method4432(field1314[--Statics.field1315]);
        } else {
            var3 = arg2 ? Statics.field1312 : Statics.field2385;
        }
        String var4 = field1316[--Statics.field1515];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1314[--Statics.field1315];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1314[--Statics.field1315];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1316[--Statics.field1515];
            } else {
                var7[var8] = Integer.valueOf(field1314[--Statics.field1315]);
            }
        }
        int var9 = field1314[--Statics.field1315];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2725 = var7;
        } else if (arg0 == 1401) {
            var3.field2728 = var7;
        } else if (arg0 == 1402) {
            var3.field2727 = var7;
        } else if (arg0 == 1403) {
            var3.field2684 = var7;
        } else if (arg0 == 1404) {
            var3.field2731 = var7;
        } else if (arg0 == 1405) {
            var3.field2732 = var7;
        } else if (arg0 == 1406) {
            var3.field2737 = var7;
        } else if (arg0 == 1407) {
            var3.field2709 = var7;
            var3.field2767 = var5;
        } else if (arg0 == 1408) {
            var3.field2742 = var7;
        } else if (arg0 == 1409) {
            var3.field2635 = var7;
        } else if (arg0 == 1410) {
            var3.field2733 = var7;
        } else if (arg0 == 1411) {
            var3.field2726 = var7;
        } else if (arg0 == 1412) {
            var3.field2769 = var7;
        } else if (arg0 == 1414) {
            var3.field2765 = var7;
            var3.field2739 = var5;
        } else if (arg0 == 1415) {
            var3.field2633 = var7;
            var3.field2741 = var5;
        } else if (arg0 == 1416) {
            var3.field2734 = var7;
        } else if (arg0 == 1417) {
            var3.field2744 = var7;
        } else if (arg0 == 1418) {
            var3.field2651 = var7;
        } else if (arg0 == 1419) {
            var3.field2746 = var7;
        } else if (arg0 == 1420) {
            var3.field2681 = var7;
        } else if (arg0 == 1421) {
            var3.field2748 = var7;
        } else if (arg0 == 1422) {
            var3.field2749 = var7;
        } else if (arg0 == 1423) {
            var3.field2750 = var7;
        } else if (arg0 == 1424) {
            var3.field2736 = var7;
        } else if (arg0 == 1425) {
            var3.field2718 = var7;
        } else if (arg0 == 1426) {
            var3.field2754 = var7;
        } else if (arg0 == 1427) {
            var3.field2752 = var7;
        } else {
            return 2;
        }
        var3.field2723 = true;
        return 1;
    }

    @ObfuscatedName("ae.l(ILcc;ZI)I")
    public static int method467(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field1312 : Statics.field2385;
        if (arg0 == 1600) {
            field1314[++Statics.field1315 - 1] = var3.field2630;
            return 1;
        } else if (arg0 == 1601) {
            field1314[++Statics.field1315 - 1] = var3.field2692;
            return 1;
        } else if (arg0 == 1602) {
            field1316[++Statics.field1515 - 1] = var3.field2703;
            return 1;
        } else if (arg0 == 1603) {
            field1314[++Statics.field1315 - 1] = var3.field2666;
            return 1;
        } else if (arg0 == 1604) {
            field1314[++Statics.field1315 - 1] = var3.field2661;
            return 1;
        } else if (arg0 == 1605) {
            field1314[++Statics.field1315 - 1] = var3.field2697;
            return 1;
        } else if (arg0 == 1606) {
            field1314[++Statics.field1315 - 1] = var3.field2720;
            return 1;
        } else if (arg0 == 1607) {
            field1314[++Statics.field1315 - 1] = var3.field2654;
            return 1;
        } else if (arg0 == 1608) {
            field1314[++Statics.field1315 - 1] = var3.field2695;
            return 1;
        } else if (arg0 == 1609) {
            field1314[++Statics.field1315 - 1] = var3.field2674;
            return 1;
        } else if (arg0 == 1610) {
            field1314[++Statics.field1315 - 1] = var3.field2735;
            return 1;
        } else if (arg0 == 1611) {
            field1314[++Statics.field1315 - 1] = var3.field2668;
            return 1;
        } else if (arg0 == 1612) {
            field1314[++Statics.field1315 - 1] = var3.field2669;
            return 1;
        } else if (arg0 == 1613) {
            field1314[++Statics.field1315 - 1] = var3.field2673.method7();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("b.a(ILcc;ZI)I")
    public static int method51(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field1312 : Statics.field2385;
        if (arg0 == 1700) {
            field1314[++Statics.field1315 - 1] = var3.field2763;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2763 == -1) {
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = var3.field2764;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1314[++Statics.field1315 - 1] = var3.field2644;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bc.k(ILcc;ZI)I")
    public static int method1044(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method4432(field1314[--Statics.field1315]);
        } else {
            var3 = arg2 ? Statics.field1312 : Statics.field2385;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1322 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2752 == null) {
            return 0;
        } else {
            class70 var4 = new class70();
            var4.field817 = var3;
            var4.field827 = var3.field2752;
            var4.field825 = field1322 + 1;
            client.field1090.method3371(var4);
            return 1;
        }
    }

    @ObfuscatedName("af.b(ILcc;ZI)I")
    public static int method236(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method4432(field1314[--Statics.field1315]);
        if (arg0 == 2500) {
            field1314[++Statics.field1315 - 1] = var3.field2656;
            return 1;
        } else if (arg0 == 2501) {
            field1314[++Statics.field1315 - 1] = var3.field2657;
            return 1;
        } else if (arg0 == 2502) {
            field1314[++Statics.field1315 - 1] = var3.field2730;
            return 1;
        } else if (arg0 == 2503) {
            field1314[++Statics.field1315 - 1] = var3.field2659;
            return 1;
        } else if (arg0 == 2504) {
            field1314[++Statics.field1315 - 1] = var3.field2663 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1314[++Statics.field1315 - 1] = var3.field2675;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.x(ILcc;ZI)I")
    public static int method156(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class217 var3 = class217.method4432(field1314[--Statics.field1315]);
            field1314[++Statics.field1315 - 1] = var3.field2763;
            return 1;
        } else if (arg0 == 2701) {
            class217 var4 = class217.method4432(field1314[--Statics.field1315]);
            if (var4.field2763 == -1) {
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = var4.field2764;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1314[--Statics.field1315];
            class69 var6 = (class69) client.field1020.method3331((long) var5);
            if (var6 == null) {
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1314[++Statics.field1315 - 1] = client.field1051;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ag.o(ILcc;ZB)I")
    public static int method489(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field940 == 0) {
                field1314[++Statics.field1315 - 1] = -2;
            } else if (client.field940 == 1) {
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = client.field1157;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1314[--Statics.field1315];
            if (client.field940 == 2 && var3 < client.field1157) {
                field1316[++Statics.field1515 - 1] = client.field892[var3].field796;
                field1316[++Statics.field1515 - 1] = client.field892[var3].field793;
            } else {
                field1316[++Statics.field1515 - 1] = "";
                field1316[++Statics.field1515 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = field1314[--Statics.field1315];
            if (client.field940 == 2 && var4 < client.field1157) {
                field1314[++Statics.field1315 - 1] = client.field892[var4].field794;
            } else {
                field1314[++Statics.field1315 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = field1314[--Statics.field1315];
            if (client.field940 == 2 && var5 < client.field1157) {
                field1314[++Statics.field1315 - 1] = client.field892[var5].field795;
            } else {
                field1314[++Statics.field1315 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = field1316[--Statics.field1515];
            int var7 = field1314[--Statics.field1315];
            client.field933.method3179(1);
            client.field933.method3031(class174.method640(var6) + 1);
            client.field933.method3031(var7);
            client.field933.method2922(var6);
            return 1;
        } else if (arg0 == 3605) {
            String var8 = field1316[--Statics.field1515];
            client.method1486(var8);
            return 1;
        } else if (arg0 == 3606) {
            String var9 = field1316[--Statics.field1515];
            client.method2830(var9);
            return 1;
        } else if (arg0 == 3607) {
            String var10 = field1316[--Statics.field1515];
            if (var10 != null) {
                if ((client.field1161 < 100 || client.field1013 == 1) && client.field1161 < 400) {
                    String var11 = class268.method203(var10, Statics.field424);
                    if (var11 != null) {
                        int var12 = 0;
                        while (true) {
                            if (var12 >= client.field1161) {
                                for (int var16 = 0; var16 < client.field1157; var16++) {
                                    class66 var17 = client.field892[var16];
                                    String var18 = class268.method203(var17.field796, Statics.field424);
                                    if (var18 != null && var18.equals(var11)) {
                                        class99.method2696(31, "", class226.field3016 + var10 + class226.field3017);
                                        return 1;
                                    }
                                    if (var17.field793 != null) {
                                        String var19 = class268.method203(var17.field793, Statics.field424);
                                        if (var19 != null && var19.equals(var11)) {
                                            class99.method2696(31, "", class226.field3016 + var10 + class226.field3017);
                                            return 1;
                                        }
                                    }
                                }
                                if (class268.method203(Statics.field308.field881, Statics.field424).equals(var11)) {
                                    class99.method2696(31, "", class226.field3013);
                                } else {
                                    client.field933.method3179(44);
                                    client.field933.method3031(class174.method640(var10));
                                    client.field933.method2922(var10);
                                }
                                break;
                            }
                            class71 var13 = client.field1162[var12];
                            String var14 = class268.method203(var13.field832, Statics.field424);
                            if (var14 != null && var14.equals(var11)) {
                                class99.method2696(31, "", var10 + class226.field3011);
                                break;
                            }
                            if (var13.field828 != null) {
                                String var15 = class268.method203(var13.field828, Statics.field424);
                                if (var15 != null && var15.equals(var11)) {
                                    class99.method2696(31, "", var10 + class226.field3011);
                                    break;
                                }
                            }
                            var12++;
                        }
                    }
                } else {
                    class99.method2696(31, "", class226.field3010);
                }
            }
            return 1;
        } else if (arg0 == 3608) {
            String var20 = field1316[--Statics.field1515];
            client.method4431(var20);
            return 1;
        } else if (arg0 == 3609) {
            String var21 = field1316[--Statics.field1515];
            class231[] var22 = class231.method1015();
            for (int var23 = 0; var23 < var22.length; var23++) {
                class231 var24 = var22[var23];
                if (var24.field3167 != -1 && var21.startsWith(class89.method1013(var24.field3167))) {
                    var21 = var21.substring(6 + Integer.toString(var24.field3167).length());
                    break;
                }
            }
            field1314[++Statics.field1315 - 1] = client.method2764(var21, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field1116 == null) {
                field1316[++Statics.field1515 - 1] = "";
            } else {
                field1316[++Statics.field1515 - 1] = class269.method2792(client.field1116);
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field1116 == null) {
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = Statics.field611;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var25 = field1314[--Statics.field1315];
            if (client.field1116 == null || var25 >= Statics.field611) {
                field1316[++Statics.field1515 - 1] = "";
            } else {
                field1316[++Statics.field1515 - 1] = Statics.field3744[var25].field882;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var26 = field1314[--Statics.field1315];
            if (client.field1116 == null || var26 >= Statics.field611) {
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = Statics.field3744[var26].field884;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var27 = field1314[--Statics.field1315];
            if (client.field1116 == null || var27 >= Statics.field611) {
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = Statics.field3744[var27].field885;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1314[++Statics.field1315 - 1] = Statics.field402;
            return 1;
        } else if (arg0 == 3617) {
            String var28 = field1316[--Statics.field1515];
            if (Statics.field3744 != null) {
                client.field933.method3179(135);
                client.field933.method3031(class174.method640(var28));
                client.field933.method2922(var28);
            }
            return 1;
        } else if (arg0 == 3618) {
            field1314[++Statics.field1315 - 1] = Statics.field419;
            return 1;
        } else if (arg0 == 3619) {
            String var29 = field1316[--Statics.field1515];
            if (!var29.equals("")) {
                client.field933.method3179(233);
                client.field933.method3031(class174.method640(var29));
                client.field933.method2922(var29);
            }
            return 1;
        } else if (arg0 == 3620) {
            client.method3219();
            return 1;
        } else if (arg0 == 3621) {
            if (client.field940 == 0) {
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = client.field1161;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var30 = field1314[--Statics.field1315];
            if (client.field940 == 0 || var30 >= client.field1161) {
                field1316[++Statics.field1515 - 1] = "";
                field1316[++Statics.field1515 - 1] = "";
            } else {
                field1316[++Statics.field1515 - 1] = client.field1162[var30].field832;
                field1316[++Statics.field1515 - 1] = client.field1162[var30].field828;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var31;
            label284: {
                var31 = field1316[--Statics.field1515];
                if (!var31.startsWith(class89.method1013(0))) {
                    String var33 = "<img=1>";
                    if (!var31.startsWith(var33)) {
                        break label284;
                    }
                }
                var31 = var31.substring(7);
            }
            field1314[++Statics.field1315 - 1] = client.method146(var31) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var34 = field1314[--Statics.field1315];
            if (Statics.field3744 == null || var34 >= Statics.field611 || !Statics.field3744[var34].field882.equalsIgnoreCase(Statics.field308.field881)) {
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field1117 == null) {
                field1316[++Statics.field1515 - 1] = "";
            } else {
                field1316[++Statics.field1515 - 1] = class269.method2792(client.field1117);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("af.j(ILcc;ZI)I")
    public static int method235(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1315 -= 2;
            int var3 = field1314[Statics.field1315];
            int var4 = field1314[Statics.field1315 + 1];
            field1314[++Statics.field1315 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1315 -= 2;
            int var5 = field1314[Statics.field1315];
            int var6 = field1314[Statics.field1315 + 1];
            field1314[++Statics.field1315 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1315 -= 2;
            int var7 = field1314[Statics.field1315];
            int var8 = field1314[Statics.field1315 + 1];
            field1314[++Statics.field1315 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1315 -= 2;
            int var9 = field1314[Statics.field1315];
            int var10 = field1314[Statics.field1315 + 1];
            field1314[++Statics.field1315 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1315 -= 5;
            int var13 = field1314[Statics.field1315];
            int var14 = field1314[Statics.field1315 + 1];
            int var15 = field1314[Statics.field1315 + 2];
            int var16 = field1314[Statics.field1315 + 3];
            int var17 = field1314[Statics.field1315 + 4];
            field1314[++Statics.field1315 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1315 -= 2;
            int var18 = field1314[Statics.field1315];
            int var19 = field1314[Statics.field1315 + 1];
            field1314[++Statics.field1315 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1315 -= 2;
            int var20 = field1314[Statics.field1315];
            int var21 = field1314[Statics.field1315 + 1];
            field1314[++Statics.field1315 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1315 -= 2;
            int var22 = field1314[Statics.field1315];
            int var23 = field1314[Statics.field1315 + 1];
            field1314[++Statics.field1315 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1315 -= 2;
            int var24 = field1314[Statics.field1315];
            int var25 = field1314[Statics.field1315 + 1];
            field1314[++Statics.field1315 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1315 -= 2;
            int var26 = field1314[Statics.field1315];
            int var27 = field1314[Statics.field1315 + 1];
            field1314[++Statics.field1315 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1315 -= 2;
            int var28 = field1314[Statics.field1315];
            int var29 = field1314[Statics.field1315 + 1];
            if (var28 == 0) {
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1315 -= 2;
            int var30 = field1314[Statics.field1315];
            int var31 = field1314[Statics.field1315 + 1];
            if (var30 == 0) {
                field1314[++Statics.field1315 - 1] = 0;
            } else if (var31 == 0) {
                field1314[++Statics.field1315 - 1] = Integer.MAX_VALUE;
            } else {
                field1314[++Statics.field1315 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1315 -= 2;
            int var32 = field1314[Statics.field1315];
            int var33 = field1314[Statics.field1315 + 1];
            field1314[++Statics.field1315 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1315 -= 2;
            int var34 = field1314[Statics.field1315];
            int var35 = field1314[Statics.field1315 + 1];
            field1314[++Statics.field1315 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1315 -= 3;
            long var36 = (long) field1314[Statics.field1315];
            long var38 = (long) field1314[Statics.field1315 + 1];
            long var40 = (long) field1314[Statics.field1315 + 2];
            field1314[++Statics.field1315 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cl.m(ILcc;ZI)I")
    public static int method1596(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1316[--Statics.field1515];
            int var4 = field1314[--Statics.field1315];
            field1316[++Statics.field1515 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1515 -= 2;
            String var5 = field1316[Statics.field1515];
            String var6 = field1316[Statics.field1515 + 1];
            field1316[++Statics.field1515 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1316[--Statics.field1515];
            int var8 = field1314[--Statics.field1315];
            String[] var9 = field1316;
            int var10 = ++Statics.field1515 - 1;
            String var12;
            if (var8 < 0) {
                var12 = Integer.toString(var8);
            } else {
                var12 = class271.method480(var8, 10, true);
            }
            var9[var10] = var7 + var12;
            return 1;
        } else if (arg0 == 4103) {
            String var13 = field1316[--Statics.field1515];
            field1316[++Statics.field1515 - 1] = var13.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var14 = field1314[--Statics.field1315];
            long var15 = ((long) var14 + 11745L) * 86400000L;
            field1321.setTime(new Date(var15));
            int var17 = field1321.get(5);
            int var18 = field1321.get(2);
            int var19 = field1321.get(1);
            field1316[++Statics.field1515 - 1] = var17 + "-" + field1311[var18] + "-" + var19;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1515 -= 2;
            String var20 = field1316[Statics.field1515];
            String var21 = field1316[Statics.field1515 + 1];
            if (Statics.field308.field855 != null && Statics.field308.field855.field2608) {
                field1316[++Statics.field1515 - 1] = var21;
            } else {
                field1316[++Statics.field1515 - 1] = var20;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var22 = field1314[--Statics.field1315];
            field1316[++Statics.field1515 - 1] = Integer.toString(var22);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1515 -= 2;
            int[] var23 = field1314;
            int var24 = ++Statics.field1315 - 1;
            String var25 = field1316[Statics.field1515];
            String var26 = field1316[Statics.field1515 + 1];
            int var27 = client.field897;
            int var28 = var25.length();
            int var29 = var26.length();
            int var30 = 0;
            int var31 = 0;
            byte var32 = 0;
            char var33 = 0;
            int var42;
            label232: while (true) {
                if (var30 - var32 >= var28 && var31 - var33 >= var29) {
                    int var34 = Math.min(var28, var29);
                    for (int var35 = 0; var35 < var34; var35++) {
                        char var38 = var25.charAt(var35);
                        char var39 = var26.charAt(var35);
                        if (var38 != var39 && Character.toUpperCase(var38) != Character.toUpperCase(var39)) {
                            char var40 = Character.toLowerCase(var38);
                            char var41 = Character.toLowerCase(var39);
                            if (var40 != var41) {
                                var42 = class165.method589(var40, var27) - class165.method589(var41, var27);
                                break label232;
                            }
                        }
                    }
                    int var43 = var28 - var29;
                    if (var43 == 0) {
                        for (int var44 = 0; var44 < var34; var44++) {
                            char var45 = var25.charAt(var44);
                            char var46 = var26.charAt(var44);
                            if (var45 != var46) {
                                var42 = class165.method589(var45, var27) - class165.method589(var46, var27);
                                break label232;
                            }
                        }
                        var42 = 0;
                    } else {
                        var42 = var43;
                    }
                    break;
                }
                if (var30 - var32 >= var28) {
                    var42 = -1;
                    break;
                }
                if (var31 - var33 >= var29) {
                    var42 = 1;
                    break;
                }
                char var47;
                if (var32 == 0) {
                    var47 = var25.charAt(var30++);
                } else {
                    var47 = (char) var32;
                    boolean var48 = false;
                }
                char var49;
                if (var33 == 0) {
                    var49 = var26.charAt(var31++);
                } else {
                    var49 = var33;
                    boolean var50 = false;
                }
                byte var51;
                if (var47 == 198) {
                    var51 = 69;
                } else if (var47 == 230) {
                    var51 = 101;
                } else if (var47 == 223) {
                    var51 = 115;
                } else if (var47 == 338) {
                    var51 = 69;
                } else if (var47 == 339) {
                    var51 = 101;
                } else {
                    var51 = 0;
                }
                var32 = var51;
                var33 = class165.method2730(var49);
                char var52 = class165.method1564(var47, var27);
                char var53 = class165.method1564(var49, var27);
                if (var52 != var53 && Character.toUpperCase(var52) != Character.toUpperCase(var53)) {
                    char var54 = Character.toLowerCase(var52);
                    char var55 = Character.toLowerCase(var53);
                    if (var54 != var55) {
                        var42 = class165.method589(var54, var27) - class165.method589(var55, var27);
                        break;
                    }
                }
            }
            var23[var24] = Statics.method1493(var42);
            return 1;
        } else if (arg0 == 4108) {
            String var56 = field1316[--Statics.field1515];
            Statics.field1315 -= 2;
            int var57 = field1314[Statics.field1315];
            int var58 = field1314[Statics.field1315 + 1];
            byte[] var59 = Statics.field1412.method3836(var58, 0);
            class264 var60 = new class264(var59);
            field1314[++Statics.field1315 - 1] = var60.method4478(var56, var57);
            return 1;
        } else if (arg0 == 4109) {
            String var61 = field1316[--Statics.field1515];
            Statics.field1315 -= 2;
            int var62 = field1314[Statics.field1315];
            int var63 = field1314[Statics.field1315 + 1];
            byte[] var64 = Statics.field1412.method3836(var63, 0);
            class264 var65 = new class264(var64);
            field1314[++Statics.field1315 - 1] = var65.method4450(var61, var62);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1515 -= 2;
            String var66 = field1316[Statics.field1515];
            String var67 = field1316[Statics.field1515 + 1];
            if (field1314[--Statics.field1315] == 1) {
                field1316[++Statics.field1515 - 1] = var66;
            } else {
                field1316[++Statics.field1515 - 1] = var67;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var68 = field1316[--Statics.field1515];
            field1316[++Statics.field1515 - 1] = class265.method4452(var68);
            return 1;
        } else if (arg0 == 4112) {
            String var69 = field1316[--Statics.field1515];
            int var70 = field1314[--Statics.field1315];
            field1316[++Statics.field1515 - 1] = var69 + (char) var70;
            return 1;
        } else if (arg0 == 4113) {
            int var71 = field1314[--Statics.field1315];
            int[] var72 = field1314;
            int var73 = ++Statics.field1315 - 1;
            char var74 = (char) var71;
            boolean var75;
            if (var74 >= ' ' && var74 <= '~') {
                var75 = true;
            } else if (var74 >= 160 && var74 <= 255) {
                var75 = true;
            } else if (var74 == 8364 || var74 == 338 || var74 == 8212 || var74 == 339 || var74 == 376) {
                var75 = true;
            } else {
                var75 = false;
            }
            var72[var73] = var75 ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var76 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = class271.method642((char) var76) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var77 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = class271.method1750((char) var77) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var78 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = class271.method3832((char) var78) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var79 = field1316[--Statics.field1515];
            if (var79 == null) {
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = var79.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var80 = field1316[--Statics.field1515];
            Statics.field1315 -= 2;
            int var81 = field1314[Statics.field1315];
            int var82 = field1314[Statics.field1315 + 1];
            field1316[++Statics.field1515 - 1] = var80.substring(var81, var82);
            return 1;
        } else if (arg0 == 4119) {
            String var83 = field1316[--Statics.field1515];
            StringBuilder var84 = new StringBuilder(var83.length());
            boolean var85 = false;
            for (int var86 = 0; var86 < var83.length(); var86++) {
                char var87 = var83.charAt(var86);
                if (var87 == '<') {
                    var85 = true;
                } else if (var87 == '>') {
                    var85 = false;
                } else if (!var85) {
                    var84.append(var87);
                }
            }
            field1316[++Statics.field1515 - 1] = var84.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var88 = field1316[--Statics.field1515];
            int var89 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = var88.indexOf(var89);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1515 -= 2;
            String var90 = field1316[Statics.field1515];
            String var91 = field1316[Statics.field1515 + 1];
            int var92 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = var90.indexOf(var91, var92);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.s(ILcc;ZI)I")
    public static int method1004(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1314[--Statics.field1315];
            field1316[++Statics.field1515 - 1] = class257.method678(var3).field3489;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1315 -= 2;
            int var4 = field1314[Statics.field1315];
            int var5 = field1314[Statics.field1315 + 1];
            class257 var6 = class257.method678(var4);
            if (var5 < 1 || var5 > 5 || var6.field3506[var5 - 1] == null) {
                field1316[++Statics.field1515 - 1] = "";
            } else {
                field1316[++Statics.field1515 - 1] = var6.field3506[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1315 -= 2;
            int var7 = field1314[Statics.field1315];
            int var8 = field1314[Statics.field1315 + 1];
            class257 var9 = class257.method678(var7);
            if (var8 < 1 || var8 > 5 || var9.field3482[var8 - 1] == null) {
                field1316[++Statics.field1515 - 1] = "";
            } else {
                field1316[++Statics.field1515 - 1] = var9.field3482[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = class257.method678(var10).field3504;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = class257.method678(var11).field3490 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1314[--Statics.field1315];
            class257 var13 = class257.method678(var12);
            if (var13.field3533 == -1 && var13.field3523 >= 0) {
                field1314[++Statics.field1315 - 1] = var13.field3523;
            } else {
                field1314[++Statics.field1315 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1314[--Statics.field1315];
            class257 var15 = class257.method678(var14);
            if (var15.field3533 >= 0 && var15.field3523 >= 0) {
                field1314[++Statics.field1315 - 1] = var15.field3523;
            } else {
                field1314[++Statics.field1315 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = class257.method678(var16).field3505 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1314[--Statics.field1315];
            class257 var18 = class257.method678(var17);
            if (var18.field3536 == -1 && var18.field3535 >= 0) {
                field1314[++Statics.field1315 - 1] = var18.field3535;
            } else {
                field1314[++Statics.field1315 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1314[--Statics.field1315];
            class257 var20 = class257.method678(var19);
            if (var20.field3536 >= 0 && var20.field3535 >= 0) {
                field1314[++Statics.field1315 - 1] = var20.field3535;
            } else {
                field1314[++Statics.field1315 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1316[--Statics.field1515];
            int var22 = field1314[--Statics.field1315];
            boolean var24 = var22 == 1;
            String var25 = var21.toLowerCase();
            short[] var26 = new short[16];
            int var27 = 0;
            int var28 = 0;
            while (true) {
                if (var28 >= Statics.field3485) {
                    Statics.field2328 = var26;
                    Statics.field305 = 0;
                    Statics.field574 = var27;
                    String[] var32 = new String[Statics.field574];
                    for (int var33 = 0; var33 < Statics.field574; var33++) {
                        var32[var33] = class257.method678(var26[var33]).field3489;
                    }
                    short[] var34 = Statics.field2328;
                    class171.method1968(var32, var34, 0, var32.length - 1);
                    break;
                }
                class257 var29 = class257.method678(var28);
                if ((!var24 || var29.field3532) && var29.field3533 == -1 && var29.field3489.toLowerCase().indexOf(var25) != -1) {
                    if (var27 >= 250) {
                        Statics.field574 = -1;
                        Statics.field2328 = null;
                        break;
                    }
                    if (var27 >= var26.length) {
                        short[] var30 = new short[var26.length * 2];
                        for (int var31 = 0; var31 < var27; var31++) {
                            var30[var31] = var26[var31];
                        }
                        var26 = var30;
                    }
                    var26[var27++] = (short) var28;
                }
                var28++;
            }
            field1314[++Statics.field1315 - 1] = Statics.field574;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field2328 == null || Statics.field305 >= Statics.field574) {
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = Statics.field2328[++Statics.field305 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field305 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.n(ILcc;ZI)I")
    public static int method228(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1314[++Statics.field1315 - 1] = client.field1100;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1315 -= 3;
            client.field1100 = field1314[Statics.field1315];
            int var3 = field1314[Statics.field1315 + 1];
            class277[] var4 = new class277[] { class277.field3725, class277.field3726, class277.field3727 };
            class277[] var5 = var4;
            int var6 = 0;
            class277 var8;
            while (true) {
                if (var6 >= var5.length) {
                    var8 = null;
                    break;
                }
                class277 var7 = var5[var6];
                if (var7.field3728 == var3) {
                    var8 = var7;
                    break;
                }
                var6++;
            }
            Statics.field845 = var8;
            if (Statics.field845 == null) {
                Statics.field845 = class277.field3726;
            }
            client.field1093 = field1314[Statics.field1315 + 2];
            client.field933.method3179(200);
            client.field933.method3031(client.field1100);
            client.field933.method3031(Statics.field845.field3728);
            client.field933.method3031(client.field1093);
            return 1;
        } else if (arg0 == 5002) {
            String var9 = field1316[--Statics.field1515];
            Statics.field1315 -= 2;
            int var10 = field1314[Statics.field1315];
            int var11 = field1314[Statics.field1315 + 1];
            client.field933.method3179(85);
            client.field933.method3031(class174.method640(var9) + 2);
            client.field933.method2922(var9);
            client.field933.method3031(var10 - 1);
            client.field933.method3031(var11);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1315 -= 2;
            int var12 = field1314[Statics.field1315];
            int var13 = field1314[Statics.field1315 + 1];
            class73 var14 = class99.method1011(var12, var13);
            if (var14 == null) {
                field1314[++Statics.field1315 - 1] = -1;
                field1314[++Statics.field1315 - 1] = 0;
                field1316[++Statics.field1515 - 1] = "";
                field1316[++Statics.field1515 - 1] = "";
                field1316[++Statics.field1515 - 1] = "";
            } else {
                field1314[++Statics.field1315 - 1] = var14.field847;
                field1314[++Statics.field1315 - 1] = var14.field840;
                field1316[++Statics.field1515 - 1] = var14.field842 == null ? "" : var14.field842;
                field1316[++Statics.field1515 - 1] = var14.field843 == null ? "" : var14.field843;
                field1316[++Statics.field1515 - 1] = var14.field839 == null ? "" : var14.field839;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var15 = field1314[--Statics.field1315];
            class73 var16 = class99.method2706(var15);
            if (var16 == null) {
                field1314[++Statics.field1315 - 1] = -1;
                field1314[++Statics.field1315 - 1] = 0;
                field1316[++Statics.field1515 - 1] = "";
                field1316[++Statics.field1515 - 1] = "";
                field1316[++Statics.field1515 - 1] = "";
            } else {
                field1314[++Statics.field1315 - 1] = var16.field841;
                field1314[++Statics.field1315 - 1] = var16.field840;
                field1316[++Statics.field1515 - 1] = var16.field842 == null ? "" : var16.field842;
                field1316[++Statics.field1515 - 1] = var16.field843 == null ? "" : var16.field843;
                field1316[++Statics.field1515 - 1] = var16.field839 == null ? "" : var16.field839;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field845 == null) {
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = Statics.field845.field3728;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var17 = field1316[--Statics.field1515];
            int var18 = field1314[--Statics.field1315];
            String var19 = var17.toLowerCase();
            byte var20 = 0;
            if (var19.startsWith(class226.field3018)) {
                var20 = 0;
                var17 = var17.substring(class226.field3018.length());
            } else if (var19.startsWith(class226.field2869)) {
                var20 = 1;
                var17 = var17.substring(class226.field2869.length());
            } else if (var19.startsWith(class226.field3022)) {
                var20 = 2;
                var17 = var17.substring(class226.field3022.length());
            } else if (var19.startsWith(class226.field3024)) {
                var20 = 3;
                var17 = var17.substring(class226.field3024.length());
            } else if (var19.startsWith(class226.field3117)) {
                var20 = 4;
                var17 = var17.substring(class226.field3117.length());
            } else if (var19.startsWith(class226.field3028)) {
                var20 = 5;
                var17 = var17.substring(class226.field3028.length());
            } else if (var19.startsWith(class226.field2843)) {
                var20 = 6;
                var17 = var17.substring(class226.field2843.length());
            } else if (var19.startsWith(class226.field3032)) {
                var20 = 7;
                var17 = var17.substring(class226.field3032.length());
            } else if (var19.startsWith(class226.field3034)) {
                var20 = 8;
                var17 = var17.substring(class226.field3034.length());
            } else if (var19.startsWith(class226.field3036)) {
                var20 = 9;
                var17 = var17.substring(class226.field3036.length());
            } else if (var19.startsWith(class226.field3038)) {
                var20 = 10;
                var17 = var17.substring(class226.field3038.length());
            } else if (var19.startsWith(class226.field3040)) {
                var20 = 11;
                var17 = var17.substring(class226.field3040.length());
            } else if (client.field897 != 0) {
                if (var19.startsWith(class226.field3020)) {
                    var20 = 0;
                    var17 = var17.substring(class226.field3020.length());
                } else if (var19.startsWith(class226.field3021)) {
                    var20 = 1;
                    var17 = var17.substring(class226.field3021.length());
                } else if (var19.startsWith(class226.field3113)) {
                    var20 = 2;
                    var17 = var17.substring(class226.field3113.length());
                } else if (var19.startsWith(class226.field3107)) {
                    var20 = 3;
                    var17 = var17.substring(class226.field3107.length());
                } else if (var19.startsWith(class226.field3112)) {
                    var20 = 4;
                    var17 = var17.substring(class226.field3112.length());
                } else if (var19.startsWith(class226.field3029)) {
                    var20 = 5;
                    var17 = var17.substring(class226.field3029.length());
                } else if (var19.startsWith(class226.field2929)) {
                    var20 = 6;
                    var17 = var17.substring(class226.field2929.length());
                } else if (var19.startsWith(class226.field3033)) {
                    var20 = 7;
                    var17 = var17.substring(class226.field3033.length());
                } else if (var19.startsWith(class226.field3035)) {
                    var20 = 8;
                    var17 = var17.substring(class226.field3035.length());
                } else if (var19.startsWith(class226.field3037)) {
                    var20 = 9;
                    var17 = var17.substring(class226.field3037.length());
                } else if (var19.startsWith(class226.field3039)) {
                    var20 = 10;
                    var17 = var17.substring(class226.field3039.length());
                } else if (var19.startsWith(class226.field2858)) {
                    var20 = 11;
                    var17 = var17.substring(class226.field2858.length());
                }
            }
            String var21 = var17.toLowerCase();
            byte var22 = 0;
            if (var21.startsWith(class226.field3042)) {
                var22 = 1;
                var17 = var17.substring(class226.field3042.length());
            } else if (var21.startsWith(class226.field3044)) {
                var22 = 2;
                var17 = var17.substring(class226.field3044.length());
            } else if (var21.startsWith(class226.field3046)) {
                var22 = 3;
                var17 = var17.substring(class226.field3046.length());
            } else if (var21.startsWith(class226.field3079)) {
                var22 = 4;
                var17 = var17.substring(class226.field3079.length());
            } else if (var21.startsWith(class226.field2977)) {
                var22 = 5;
                var17 = var17.substring(class226.field2977.length());
            } else if (client.field897 != 0) {
                if (var21.startsWith(class226.field3043)) {
                    var22 = 1;
                    var17 = var17.substring(class226.field3043.length());
                } else if (var21.startsWith(class226.field3108)) {
                    var22 = 2;
                    var17 = var17.substring(class226.field3108.length());
                } else if (var21.startsWith(class226.field2855)) {
                    var22 = 3;
                    var17 = var17.substring(class226.field2855.length());
                } else if (var21.startsWith(class226.field3049)) {
                    var22 = 4;
                    var17 = var17.substring(class226.field3049.length());
                } else if (var21.startsWith(class226.field2900)) {
                    var22 = 5;
                    var17 = var17.substring(class226.field2900.length());
                }
            }
            client.field933.method3179(90);
            client.field933.method3031(0);
            int var23 = client.field933.field2384;
            client.field933.method3031(var18);
            client.field933.method3031(var20);
            client.field933.method3031(var22);
            class180 var24 = client.field933;
            int var25 = var24.field2384;
            int var26 = var17.length();
            byte[] var27 = new byte[var26];
            for (int var28 = 0; var28 < var26; var28++) {
                char var29 = var17.charAt(var28);
                if (var29 > 0 && var29 < 128 || var29 >= 160 && var29 <= 255) {
                    var27[var28] = (byte) var29;
                } else if (var29 == 8364) {
                    var27[var28] = -128;
                } else if (var29 == 8218) {
                    var27[var28] = -126;
                } else if (var29 == 402) {
                    var27[var28] = -125;
                } else if (var29 == 8222) {
                    var27[var28] = -124;
                } else if (var29 == 8230) {
                    var27[var28] = -123;
                } else if (var29 == 8224) {
                    var27[var28] = -122;
                } else if (var29 == 8225) {
                    var27[var28] = -121;
                } else if (var29 == 710) {
                    var27[var28] = -120;
                } else if (var29 == 8240) {
                    var27[var28] = -119;
                } else if (var29 == 352) {
                    var27[var28] = -118;
                } else if (var29 == 8249) {
                    var27[var28] = -117;
                } else if (var29 == 338) {
                    var27[var28] = -116;
                } else if (var29 == 381) {
                    var27[var28] = -114;
                } else if (var29 == 8216) {
                    var27[var28] = -111;
                } else if (var29 == 8217) {
                    var27[var28] = -110;
                } else if (var29 == 8220) {
                    var27[var28] = -109;
                } else if (var29 == 8221) {
                    var27[var28] = -108;
                } else if (var29 == 8226) {
                    var27[var28] = -107;
                } else if (var29 == 8211) {
                    var27[var28] = -106;
                } else if (var29 == 8212) {
                    var27[var28] = -105;
                } else if (var29 == 732) {
                    var27[var28] = -104;
                } else if (var29 == 8482) {
                    var27[var28] = -103;
                } else if (var29 == 353) {
                    var27[var28] = -102;
                } else if (var29 == 8250) {
                    var27[var28] = -101;
                } else if (var29 == 339) {
                    var27[var28] = -100;
                } else if (var29 == 382) {
                    var27[var28] = -98;
                } else if (var29 == 376) {
                    var27[var28] = -97;
                } else {
                    var27[var28] = 63;
                }
            }
            var24.method2928(var27.length);
            var24.field2384 += Statics.field3656.method2855(var27, 0, var27.length, var24.field2387, var24.field2384);
            client.field933.method3095(client.field933.field2384 - var23);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1515 -= 2;
            String var32 = field1316[Statics.field1515];
            String var33 = field1316[Statics.field1515 + 1];
            client.field933.method3179(143);
            client.field933.method2917(0);
            int var34 = client.field933.field2384;
            client.field933.method2922(var32);
            class180 var35 = client.field933;
            int var36 = var35.field2384;
            int var37 = var33.length();
            byte[] var38 = new byte[var37];
            for (int var39 = 0; var39 < var37; var39++) {
                char var40 = var33.charAt(var39);
                if (var40 > 0 && var40 < 128 || var40 >= 160 && var40 <= 255) {
                    var38[var39] = (byte) var40;
                } else if (var40 == 8364) {
                    var38[var39] = -128;
                } else if (var40 == 8218) {
                    var38[var39] = -126;
                } else if (var40 == 402) {
                    var38[var39] = -125;
                } else if (var40 == 8222) {
                    var38[var39] = -124;
                } else if (var40 == 8230) {
                    var38[var39] = -123;
                } else if (var40 == 8224) {
                    var38[var39] = -122;
                } else if (var40 == 8225) {
                    var38[var39] = -121;
                } else if (var40 == 710) {
                    var38[var39] = -120;
                } else if (var40 == 8240) {
                    var38[var39] = -119;
                } else if (var40 == 352) {
                    var38[var39] = -118;
                } else if (var40 == 8249) {
                    var38[var39] = -117;
                } else if (var40 == 338) {
                    var38[var39] = -116;
                } else if (var40 == 381) {
                    var38[var39] = -114;
                } else if (var40 == 8216) {
                    var38[var39] = -111;
                } else if (var40 == 8217) {
                    var38[var39] = -110;
                } else if (var40 == 8220) {
                    var38[var39] = -109;
                } else if (var40 == 8221) {
                    var38[var39] = -108;
                } else if (var40 == 8226) {
                    var38[var39] = -107;
                } else if (var40 == 8211) {
                    var38[var39] = -106;
                } else if (var40 == 8212) {
                    var38[var39] = -105;
                } else if (var40 == 732) {
                    var38[var39] = -104;
                } else if (var40 == 8482) {
                    var38[var39] = -103;
                } else if (var40 == 353) {
                    var38[var39] = -102;
                } else if (var40 == 8250) {
                    var38[var39] = -101;
                } else if (var40 == 339) {
                    var38[var39] = -100;
                } else if (var40 == 382) {
                    var38[var39] = -98;
                } else if (var40 == 376) {
                    var38[var39] = -97;
                } else {
                    var38[var39] = 63;
                }
            }
            var35.method2928(var38.length);
            var35.field2384 += Statics.field3656.method2855(var38, 0, var38.length, var35.field2387, var35.field2384);
            client.field933.method2926(client.field933.field2384 - var34);
            return 1;
        } else if (arg0 == 5015) {
            String var43;
            if (Statics.field308 == null || Statics.field308.field881 == null) {
                var43 = "";
            } else {
                var43 = Statics.field308.field881;
            }
            field1316[++Statics.field1515 - 1] = var43;
            return 1;
        } else if (arg0 == 5016) {
            field1314[++Statics.field1315 - 1] = client.field1093;
            return 1;
        } else if (arg0 == 5017) {
            int var44 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = class99.method3643(var44);
            return 1;
        } else if (arg0 == 5018) {
            int var45 = field1314[--Statics.field1315];
            int[] var46 = field1314;
            int var47 = ++Statics.field1315 - 1;
            class73 var48 = (class73) class99.field1520.method3275((long) var45);
            int var49;
            if (var48 == null) {
                var49 = -1;
            } else if (class99.field1519.field2486 == var48.field2472) {
                var49 = -1;
            } else {
                var49 = ((class73) var48.field2472).field847;
            }
            var46[var47] = var49;
            return 1;
        } else if (arg0 == 5019) {
            int var50 = field1314[--Statics.field1315];
            int[] var51 = field1314;
            int var52 = ++Statics.field1315 - 1;
            class73 var53 = (class73) class99.field1520.method3275((long) var50);
            int var54;
            if (var53 == null) {
                var54 = -1;
            } else if (class99.field1519.field2486 == var53.field2471) {
                var54 = -1;
            } else {
                var54 = ((class73) var53.field2471).field847;
            }
            var51[var52] = var54;
            return 1;
        } else if (arg0 == 5020) {
            String var55 = field1316[--Statics.field1515];
            Statics.method119(var55);
            return 1;
        } else if (arg0 == 5021) {
            client.field1109 = field1316[--Statics.field1515].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1316[++Statics.field1515 - 1] = client.field1109;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("az.y(ILcc;ZI)I")
    public static int method225(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1314[++Statics.field1315 - 1] = client.method9();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1314[--Statics.field1315];
            if (var3 == 1 || var3 == 2) {
                client.field1104 = 0L;
                if (var3 >= 2) {
                    client.field1105 = true;
                } else {
                    client.field1105 = false;
                }
                int var4 = client.field1105 ? 2 : 1;
                if (var4 == 1) {
                    Statics.field357.method750(765, 503);
                } else {
                    Statics.field357.method750(7680, 2160);
                }
                if (client.field898 >= 25) {
                    client.field933.method3179(149);
                    class180 var5 = client.field933;
                    int var6 = client.field1105 ? 2 : 1;
                    var5.method3031(var6);
                    client.field933.method2917(Statics.field3627);
                    client.field933.method2917(Statics.field321);
                }
            }
            return 1;
        } else if (arg0 == 5308) {
            field1314[++Statics.field1315 - 1] = Statics.field1990.field1287;
            return 1;
        } else if (arg0 == 5309) {
            int var7 = field1314[--Statics.field1315];
            if (var7 == 1 || var7 == 2) {
                Statics.field1990.field1287 = var7;
                class82.method2307();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("j.w(ILcc;ZI)I")
    public static int method86(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1315 -= 2;
            int var3 = field1314[Statics.field1315];
            int var4 = field1314[Statics.field1315 + 1];
            if (!client.field930) {
                client.field974 = var3;
                client.field1158 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1314[++Statics.field1315 - 1] = client.field974;
            return 1;
        } else if (arg0 == 5506) {
            field1314[++Statics.field1315 - 1] = client.field1158;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1314[--Statics.field1315];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field980 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1314[++Statics.field1315 - 1] = client.field980;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dc.f(ILcc;ZB)I")
    public static int method2305(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field987 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("av.c(ILcc;ZI)I")
    public static int method463(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field3606;
            int var4 = (Statics.field308.field1247 >> 7) + Statics.field2304;
            int var5 = (Statics.field308.field1200 >> 7) + Statics.field2147;
            client.method1039().method4886(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1314[--Statics.field1315];
            String var7 = "";
            class33 var8 = client.method1039().method4916(var6);
            if (var8 != null) {
                var7 = var8.method319();
            }
            field1316[++Statics.field1515 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1314[--Statics.field1315];
            client.method1039().method4985(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1314[++Statics.field1315 - 1] = client.method1039().method5000();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1314[--Statics.field1315];
            client.method1039().method4895(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1314[++Statics.field1315 - 1] = client.method1039().method4900() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class213 var11 = new class213(field1314[--Statics.field1315]);
            client.method1039().method4902(var11.field2601, var11.field2602);
            return 1;
        } else if (arg0 == 6607) {
            class213 var12 = new class213(field1314[--Statics.field1315]);
            client.method1039().method4903(var12.field2601, var12.field2602);
            return 1;
        } else if (arg0 == 6608) {
            class213 var13 = new class213(field1314[--Statics.field1315]);
            client.method1039().method4904(var13.field2604, var13.field2601, var13.field2602);
            return 1;
        } else if (arg0 == 6609) {
            class213 var14 = new class213(field1314[--Statics.field1315]);
            client.method1039().method4905(var14.field2604, var14.field2601, var14.field2602);
            return 1;
        } else if (arg0 == 6610) {
            field1314[++Statics.field1315 - 1] = client.method1039().method4987();
            field1314[++Statics.field1315 - 1] = client.method1039().method4878();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1314[--Statics.field1315];
            class33 var16 = client.method1039().method4916(var15);
            if (var16 == null) {
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = var16.method260().method3673();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1314[--Statics.field1315];
            class33 var18 = client.method1039().method4916(var17);
            if (var18 == null) {
                field1314[++Statics.field1315 - 1] = 0;
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = (var18.method254() - var18.method306() + 1) * 64;
                field1314[++Statics.field1315 - 1] = (var18.method256() - var18.method255() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1314[--Statics.field1315];
            class33 var20 = client.method1039().method4916(var19);
            if (var20 == null) {
                field1314[++Statics.field1315 - 1] = 0;
                field1314[++Statics.field1315 - 1] = 0;
                field1314[++Statics.field1315 - 1] = 0;
                field1314[++Statics.field1315 - 1] = 0;
            } else {
                field1314[++Statics.field1315 - 1] = var20.method306() * 64;
                field1314[++Statics.field1315 - 1] = var20.method255() * 64;
                field1314[++Statics.field1315 - 1] = var20.method254() * 64 + 64 - 1;
                field1314[++Statics.field1315 - 1] = var20.method256() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1314[--Statics.field1315];
            class33 var22 = client.method1039().method4916(var21);
            if (var22 == null) {
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = var22.method252();
            }
            return 1;
        } else if (arg0 == 6615) {
            class213 var23 = client.method1039().method4908();
            if (var23 == null) {
                field1314[++Statics.field1315 - 1] = -1;
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = var23.field2601;
                field1314[++Statics.field1315 - 1] = var23.field2602;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1314[++Statics.field1315 - 1] = client.method1039().method5051();
            return 1;
        } else if (arg0 == 6617) {
            class213 var24 = new class213(field1314[--Statics.field1315]);
            class33 var25 = client.method1039().method4889();
            if (var25 == null) {
                field1314[++Statics.field1315 - 1] = -1;
                field1314[++Statics.field1315 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method249(var24.field2604, var24.field2601, var24.field2602);
            if (var26 == null) {
                field1314[++Statics.field1315 - 1] = -1;
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = var26[0];
                field1314[++Statics.field1315 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class213 var27 = new class213(field1314[--Statics.field1315]);
            class33 var28 = client.method1039().method4889();
            if (var28 == null) {
                field1314[++Statics.field1315 - 1] = -1;
                field1314[++Statics.field1315 - 1] = -1;
                return 1;
            }
            class213 var29 = var28.method310(var27.field2601, var27.field2602);
            if (var29 == null) {
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = var29.method3673();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1315 -= 2;
            int var30 = field1314[Statics.field1315];
            class213 var31 = new class213(field1314[Statics.field1315 + 1]);
            method74(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1315 -= 2;
            int var32 = field1314[Statics.field1315];
            class213 var33 = new class213(field1314[Statics.field1315 + 1]);
            method74(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1315 -= 2;
            int var34 = field1314[Statics.field1315];
            class213 var35 = new class213(field1314[Statics.field1315 + 1]);
            class33 var36 = client.method1039().method4916(var34);
            if (var36 == null) {
                field1314[++Statics.field1315 - 1] = 0;
                return 1;
            } else {
                field1314[++Statics.field1315 - 1] = var36.method239(var35.field2604, var35.field2601, var35.field2602) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1314[++Statics.field1315 - 1] = client.method1039().method4909();
            field1314[++Statics.field1315 - 1] = client.method1039().method4910();
            return 1;
        } else if (arg0 == 6623) {
            class213 var37 = new class213(field1314[--Statics.field1315]);
            class33 var38 = client.method1039().method4931(var37.field2604, var37.field2601, var37.field2602);
            if (var38 == null) {
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = var38.method287();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1039().method4917(field1314[--Statics.field1315]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1039().method4881();
            return 1;
        } else if (arg0 == 6626) {
            client.method1039().method4913(field1314[--Statics.field1315]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1039().method5053();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1314[--Statics.field1315] == 1;
            client.method1039().method4915(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1314[--Statics.field1315];
            client.method1039().method4966(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1314[--Statics.field1315];
            client.method1039().method4906(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method1039().method4918();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1314[--Statics.field1315] == 1;
            client.method1039().method4919(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1315 -= 2;
            int var43 = field1314[Statics.field1315];
            boolean var44 = field1314[Statics.field1315 + 1] == 1;
            client.method1039().method4920(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1315 -= 2;
            int var45 = field1314[Statics.field1315];
            boolean var46 = field1314[Statics.field1315 + 1] == 1;
            client.method1039().method5005(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1314[++Statics.field1315 - 1] = client.method1039().method4922() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = client.method1039().method4923(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1314[--Statics.field1315];
            field1314[++Statics.field1315 - 1] = client.method1039().method4924(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1315 -= 2;
            int var49 = field1314[Statics.field1315];
            class213 var50 = new class213(field1314[Statics.field1315 + 1]);
            class213 var51 = client.method1039().method5040(var49, var50);
            if (var51 == null) {
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = var51.method3673();
            }
            return 1;
        } else if (arg0 == 6639) {
            class40 var52 = client.method1039().method4929();
            if (var52 == null) {
                field1314[++Statics.field1315 - 1] = -1;
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = var52.field527;
                field1314[++Statics.field1315 - 1] = var52.field528.method3673();
            }
            return 1;
        } else if (arg0 == 6640) {
            class40 var53 = client.method1039().method4930();
            if (var53 == null) {
                field1314[++Statics.field1315 - 1] = -1;
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = var53.field527;
                field1314[++Statics.field1315 - 1] = var53.field528.method3673();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1314[--Statics.field1315];
            class243 var55 = Statics.field3277[var54];
            if (var55.field3283 == null) {
                field1316[++Statics.field1515 - 1] = "";
            } else {
                field1316[++Statics.field1515 - 1] = var55.field3283;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1314[--Statics.field1315];
            class243 var57 = Statics.field3277[var56];
            field1314[++Statics.field1315 - 1] = var57.field3285;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1314[--Statics.field1315];
            class243 var59 = Statics.field3277[var58];
            if (var59 == null) {
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = var59.field3297;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1314[--Statics.field1315];
            class243 var61 = Statics.field3277[var60];
            if (var61 == null) {
                field1314[++Statics.field1315 - 1] = -1;
            } else {
                field1314[++Statics.field1315 - 1] = var61.field3281;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1314[++Statics.field1315 - 1] = Statics.field1477.field599;
            return 1;
        } else if (arg0 == 6698) {
            field1314[++Statics.field1315 - 1] = Statics.field1477.field598.method3673();
            return 1;
        } else if (arg0 == 6699) {
            field1314[++Statics.field1315 - 1] = Statics.field1477.field597.method3673();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.z(IB)V")
    public static void method112(int arg0) {
        if (arg0 == -1 || !class217.method68(arg0)) {
            return;
        }
        class217[] var1 = Statics.field1401[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3.field2717 != null) {
                class70 var4 = new class70();
                var4.field817 = var3;
                var4.field827 = var3.field2717;
                method648(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("o.ay(ILho;ZI)V")
    public static void method74(int arg0, class213 arg1, boolean arg2) {
        class33 var3 = client.method1039().method4916(arg0);
        int var4 = Statics.field308.field875;
        int var5 = (Statics.field308.field1247 >> 7) + Statics.field2304;
        int var6 = (Statics.field308.field1200 >> 7) + Statics.field2147;
        class213 var7 = new class213(var4, var5, var6);
        client.method1039().method4892(var3, var7, arg1, arg2);
    }
}
